package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("df")
public class class123 {

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.v(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2487(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("df.t(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2488(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
