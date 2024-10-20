package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ew")
public class class132 {

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.z(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2641(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("ew.q(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2642(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
