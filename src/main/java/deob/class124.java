package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("du")
public class class124 {

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.q(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2464(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("du.s(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method2465(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
