package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dg")
public class class115 {

    @ObfuscatedName("dg.p")
    public static Applet field1794 = null;

    @ObfuscatedName("dg.g")
    public static String field1793 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.p(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method855(Applet arg0, String arg1) {
        field1794 = arg0;
        field1793 = arg1;
    }

    @ObfuscatedName("ay.g(Ljava/lang/String;ZZI)V")
    public static void method702(String arg0, boolean arg1, boolean arg2) {
        method1941(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("dq.x(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method1941(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1353(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1793.startsWith("win") && !arg3) {
            method1353(arg0, 0);
            return;
        }
        if (field1793.startsWith("mac")) {
            method192(arg0, 1, arg2);
            return;
        }
        method1353(arg0, 2);
    }

    @ObfuscatedName("bh.q(Ljava/lang/String;II)Z")
    public static boolean method1353(String arg0, int arg1) {
        return method192(arg0, arg1, "openjs");
    }

    @ObfuscatedName("y.d(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method192(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1793.startsWith("win")) {
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
            } catch (Throwable var14) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field1794;
                Object[] var7 = new Object[] { (new URL(field1794.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1794.getAppletContext().showDocument(new URL(field1794.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class101.method1812(field1794, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field1794.getAppletContext().showDocument(new URL(field1794.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
