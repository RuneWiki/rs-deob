package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dw")
public class class125 {

    @ObfuscatedName("dw.k")
    public static Applet field1995 = null;

    @ObfuscatedName("dw.r")
    public static String field1998 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.k(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method769(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2867(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1998.startsWith("win") && !arg3) {
            method2867(arg0, 0);
            return;
        }
        if (field1998.startsWith("mac")) {
            method570(arg0, 1, arg2);
            return;
        }
        method2867(arg0, 2);
    }

    @ObfuscatedName("eo.r(Ljava/lang/String;II)Z")
    public static boolean method2867(String arg0, int arg1) {
        return method570(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ai.y(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method570(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1998.startsWith("win")) {
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
                Object var6 = class119.method2427(field1995, arg2, new Object[] { (new URL(field1995.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1995.getAppletContext().showDocument(new URL(field1995.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2428(field1995, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1995.getAppletContext().showDocument(new URL(field1995.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
