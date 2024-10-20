package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dv")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.k(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2428(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("dv.r(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2427(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
