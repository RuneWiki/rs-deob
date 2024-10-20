package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dp")
public class class115 {

    @ObfuscatedName("dp.f")
    public static Applet field1805 = null;

    @ObfuscatedName("dp.i")
    public static String field1811 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.f(Ljava/lang/String;ZZI)V")
    public static void method609(String arg0, boolean arg1, boolean arg2) {
        method162(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("d.i(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method162(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method800(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1811.startsWith("win") && !arg3) {
            method800(arg0, 0);
            return;
        }
        if (field1811.startsWith("mac")) {
            method2006(arg0, 1, arg2);
            return;
        }
        method800(arg0, 2);
    }

    @ObfuscatedName("ad.u(Ljava/lang/String;IB)Z")
    public static boolean method800(String arg0, int arg1) {
        return method2006(arg0, arg1, "openjs");
    }

    @ObfuscatedName("dy.r(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2006(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1811.startsWith("win")) {
                    throw new Exception();
                } else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
                    String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int var4 = 0; var4 < arg0.length(); var4++) {
                        if (var3.indexOf(arg0.charAt(var4)) == -1) {
                            throw new Exception();
                        }
                    }
                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Throwable var11) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class101.method1866(field1805, arg2, new Object[] { (new URL(field1805.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1805.getAppletContext().showDocument(new URL(field1805.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class101.method1869(field1805, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1805.getAppletContext().showDocument(new URL(field1805.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
