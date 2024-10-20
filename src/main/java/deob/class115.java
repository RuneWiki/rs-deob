package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dp")
public class class115 {

    @ObfuscatedName("dp.u")
    public static Applet field1779 = null;

    @ObfuscatedName("dp.x")
    public static String field1776 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.u(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method858(Applet arg0, String arg1) {
        field1779 = arg0;
        field1776 = arg1;
    }

    @ObfuscatedName("fy.x(Ljava/lang/String;ZZI)V")
    public static void method2808(String arg0, boolean arg1, boolean arg2) {
        method25(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("i.i(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method25(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method3576(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1776.startsWith("win") && !arg3) {
            method3576(arg0, 0, "openjs");
            return;
        }
        if (field1776.startsWith("mac")) {
            method3576(arg0, 1, arg2);
            return;
        }
        method3576(arg0, 2, "openjs");
    }

    @ObfuscatedName("gg.a(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method3576(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1776.startsWith("win")) {
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
                Object var6 = class101.method1801(field1779, arg2, new Object[] { (new URL(field1779.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1779.getAppletContext().showDocument(new URL(field1779.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class101.method1800(field1779, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1779.getAppletContext().showDocument(new URL(field1779.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
