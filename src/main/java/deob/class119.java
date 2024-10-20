package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dy")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.e(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2449(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("dy.p(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2450(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
