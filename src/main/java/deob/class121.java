package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dl")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.g(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method2411(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
