package deob;

import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfuscatedName("cf")
public class class101 {

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.n(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method1850(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }
}
