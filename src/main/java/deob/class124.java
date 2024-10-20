package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dy")
public class class124 {

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.e(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2526(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("dy.a(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2527(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
