package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("dw")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.g(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2415(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }
}
