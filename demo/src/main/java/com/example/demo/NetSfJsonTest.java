package com.example.demo;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class NetSfJsonTest {

    @ResponseBody
    @RequestMapping("/netsfjson")
    public JSONObject sfJsonTest(HttpServletRequest request, @RequestBody JSONObject content) {
        System.out.println("?后的内容: "+request.getQueryString());
        String name = (String)content.get("name");
        Integer phone = (Integer)content.get("phone");
        String pwd = (String)content.get("pwd");

        JSONObject result = new JSONObject();
        result.put("errCode", 200);
        result.put("errMsg", "success");
        result.put("data", content);
        return result;
    }
}
