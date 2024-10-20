package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("cd")
public class class101 {

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.o(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method1796(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("cd.m(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method1795(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }
}
