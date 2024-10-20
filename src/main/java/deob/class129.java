package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("da")
public class class129 {

    @ObfuscatedName("da.b")
    public static Applet field2014 = null;

    @ObfuscatedName("da.e")
    public static String field2009 = null;

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.b(Ljava/lang/String;ZZI)V")
    public static void method531(String arg0, boolean arg1, boolean arg2) {
        method3206(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("fk.e(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method3206(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method847(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2009.startsWith("win") && !arg3) {
            method847(arg0, 0, "openjs");
            return;
        }
        if (field2009.startsWith("mac")) {
            method847(arg0, 1, arg2);
            return;
        }
        method847(arg0, 2, "openjs");
    }

    @ObfuscatedName("ax.i(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method847(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2009.startsWith("win")) {
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
                Object var6 = class123.method2462(field2014, arg2, new Object[] { (new URL(field2014.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2014.getAppletContext().showDocument(new URL(field2014.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field2014;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field2014.getAppletContext().showDocument(new URL(field2014.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
