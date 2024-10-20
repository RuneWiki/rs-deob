package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dn")
public class class123 {

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.a(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2446(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("dn.v(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2447(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
