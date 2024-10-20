package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("db")
public class class125 {

    @ObfuscatedName("db.y")
    public static Applet field1980 = null;

    @ObfuscatedName("db.u")
    public static String field1987 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.y(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method1402(Applet arg0, String arg1) {
        field1980 = arg0;
        field1987 = arg1;
    }

    @ObfuscatedName("e.u(Ljava/lang/String;ZZB)V")
    public static void method497(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2832(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field1987.startsWith("win") && !arg2) {
            method2832(arg0, 0);
        } else if (field1987.startsWith("mac")) {
            method2366(arg0, 1, "openjs");
        } else {
            method2832(arg0, 2);
        }
    }

    @ObfuscatedName("eo.k(Ljava/lang/String;IB)Z")
    public static boolean method2832(String arg0, int arg1) {
        return method2366(arg0, arg1, "openjs");
    }

    @ObfuscatedName("da.v(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2366(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1987.startsWith("win")) {
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
                Applet var6 = field1980;
                Object[] var7 = new Object[] { (new URL(field1980.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1980.getAppletContext().showDocument(new URL(field1980.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2421(field1980, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field1980.getAppletContext().showDocument(new URL(field1980.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
