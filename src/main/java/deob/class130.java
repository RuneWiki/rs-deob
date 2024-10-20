package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dv")
public class class130 {

    @ObfuscatedName("dv.n")
    public static Applet field2042 = null;

    @ObfuscatedName("dv.d")
    public static String field2040 = null;

    public class130() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.n(Ljava/lang/String;ZZI)V")
    public static void method133(String arg0, boolean arg1, boolean arg2) {
        method513(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("v.d(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method513(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            Statics.method2673(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2040.startsWith("win") && !arg3) {
            method80(arg0, 0, "openjs");
            return;
        }
        if (field2040.startsWith("mac")) {
            method80(arg0, 1, arg2);
            return;
        }
        method80(arg0, 2, "openjs");
    }

    @ObfuscatedName("g.y(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method80(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2040.startsWith("win")) {
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
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class124.method2584(field2042, arg2, new Object[] { (new URL(field2042.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2042.getAppletContext().showDocument(new URL(field2042.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field2042;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field2042.getAppletContext().showDocument(new URL(field2042.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
