package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("ca")
public class class101 {

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.d(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method1834(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
