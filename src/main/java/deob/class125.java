package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dz")
public class class125 {

    @ObfuscatedName("dz.z")
    public static Applet field1970 = null;

    @ObfuscatedName("dz.j")
    public static String field1967 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ft.z(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method3144(Applet arg0, String arg1) {
        field1970 = arg0;
        field1967 = arg1;
    }

    @ObfuscatedName("y.j(Ljava/lang/String;ZZB)V")
    public static void method29(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method578(arg0, 3);
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field1967.startsWith("win") && !arg2) {
            method578(arg0, 0);
        } else if (field1967.startsWith("mac")) {
            method1964(arg0, 1, "openjs");
        } else {
            method578(arg0, 2);
        }
    }

    @ObfuscatedName("ak.a(Ljava/lang/String;IB)Z")
    public static boolean method578(String arg0, int arg1) {
        return method1964(arg0, arg1, "openjs");
    }

    @ObfuscatedName("cl.y(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method1964(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1967.startsWith("win")) {
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
                Applet var6 = field1970;
                Object[] var7 = new Object[] { (new URL(field1970.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1970.getAppletContext().showDocument(new URL(field1970.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2453(field1970, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field1970.getAppletContext().showDocument(new URL(field1970.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
