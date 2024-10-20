package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("dz")
public class class125 {

    @ObfuscatedName("dz.g")
    public static Applet field2009 = null;

    @ObfuscatedName("dz.s")
    public static String field2005 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.g(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method455(Applet arg0, String arg1) {
        field2009 = arg0;
        field2005 = arg1;
    }

    @ObfuscatedName("ak.s(Ljava/lang/String;ZZB)V")
    public static void method800(String arg0, boolean arg1, boolean arg2) {
        method480(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("x.v(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method480(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1944(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2005.startsWith("win") && !arg3) {
            method1944(arg0, 0);
            return;
        }
        if (field2005.startsWith("mac")) {
            Statics.method1936(arg0, 1, arg2);
            return;
        }
        method1944(arg0, 2);
    }

    @ObfuscatedName("ch.o(Ljava/lang/String;II)Z")
    public static boolean method1944(String arg0, int arg1) {
        return Statics.method1936(arg0, arg1, "openjs");
    }
}
