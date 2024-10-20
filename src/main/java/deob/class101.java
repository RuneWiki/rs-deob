package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("cf")
public class class101 {

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.x(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method1926(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("cf.n(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method1927(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
