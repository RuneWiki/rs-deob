package com.jagex.oldscape.pub;

import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;

public interface OtlTokenRequester {

    Future request(String arg0, URL arg1, Map arg2, String arg3);
}
