package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dm")
public class class130 {

    @ObfuscatedName("dm.b")
    public static Applet field2038 = null;

    @ObfuscatedName("dm.e")
    public static String field2035 = null;

    public class130() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.b(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method1865(Applet arg0, String arg1) {
        field2038 = arg0;
        field2035 = arg1;
    }

    @ObfuscatedName("ah.e(Ljava/lang/String;ZZI)V")
    public static void method805(String arg0, boolean arg1, boolean arg2) {
        method1860(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ck.a(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method1860(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method525(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2035.startsWith("win") && !arg3) {
            method525(arg0, 0, "openjs");
            return;
        }
        if (field2035.startsWith("mac")) {
            method525(arg0, 1, arg2);
            return;
        }
        method525(arg0, 2, "openjs");
    }

    @ObfuscatedName("y.k(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method525(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2035.startsWith("win")) {
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
                Object var6 = class124.method2466(field2038, arg2, new Object[] { (new URL(field2038.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2038.getAppletContext().showDocument(new URL(field2038.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class124.method2471(field2038, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2038.getAppletContext().showDocument(new URL(field2038.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
