package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ds")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.n(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method2423(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("ds.x(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2420(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
