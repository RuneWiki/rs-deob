package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dw")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.x(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2463(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("dw.v(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2464(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
