package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dw")
public class class130 {

    @ObfuscatedName("dw.t")
    public static Applet field2009 = null;

    @ObfuscatedName("dw.b")
    public static String field2008 = null;

    public class130() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gy.t(Ljava/lang/String;ZZB)V")
    public static void method3544(String arg0, boolean arg1, boolean arg2) {
        method757(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("al.b(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method757(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2376(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2008.startsWith("win") && !arg3) {
            method2376(arg0, 0);
            return;
        }
        if (field2008.startsWith("mac")) {
            method1413(arg0, 1, arg2);
            return;
        }
        method2376(arg0, 2);
    }

    @ObfuscatedName("dc.p(Ljava/lang/String;II)Z")
    public static boolean method2376(String arg0, int arg1) {
        return method1413(arg0, arg1, "openjs");
    }

    @ObfuscatedName("bo.e(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method1413(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2008.startsWith("win")) {
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
                Object var6 = class124.method2514(field2009, arg2, new Object[] { (new URL(field2009.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2009.getAppletContext().showDocument(new URL(field2009.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class124.method2513(field2009, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2009.getAppletContext().showDocument(new URL(field2009.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
