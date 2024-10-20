package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dr")
public class class115 {

    @ObfuscatedName("dr.s")
    public static Applet field1796 = null;

    @ObfuscatedName("dr.c")
    public static String field1792 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.s(Ljava/applet/Applet;Ljava/lang/String;S)V")
    public static void method82(Applet arg0, String arg1) {
        field1796 = arg0;
        field1792 = arg1;
    }

    @ObfuscatedName("ak.c(Ljava/lang/String;ZZB)V")
    public static void method833(String arg0, boolean arg1, boolean arg2) {
        method1921(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("df.f(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method1921(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2391(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1792.startsWith("win") && !arg3) {
            method2391(arg0, 0, "openjs");
            return;
        }
        if (field1792.startsWith("mac")) {
            method2391(arg0, 1, arg2);
            return;
        }
        method2391(arg0, 2, "openjs");
    }

    @ObfuscatedName("el.g(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2391(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1792.startsWith("win")) {
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
                Object var6 = class101.method1788(field1796, arg2, new Object[] { (new URL(field1796.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1796.getAppletContext().showDocument(new URL(field1796.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class101.method1787(field1796, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1796.getAppletContext().showDocument(new URL(field1796.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
