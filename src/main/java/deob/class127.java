package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dh")
public class class127 {

    @ObfuscatedName("dh.l")
    public static Applet field1976 = null;

    @ObfuscatedName("dh.y")
    public static String field1974 = null;

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.l(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2089(Applet arg0, String arg1) {
        field1976 = arg0;
        field1974 = arg1;
    }

    @ObfuscatedName("dr.y(Ljava/lang/String;ZZI)V")
    public static void method2444(String arg0, boolean arg1, boolean arg2) {
        method2591(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ds.g(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2591(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2106(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1974.startsWith("win") && !arg3) {
            method2106(arg0, 0);
            return;
        }
        if (field1974.startsWith("mac")) {
            method600(arg0, 1, arg2);
            return;
        }
        method2106(arg0, 2);
    }

    @ObfuscatedName("dv.j(Ljava/lang/String;II)Z")
    public static boolean method2106(String arg0, int arg1) {
        return method600(arg0, arg1, "openjs");
    }

    @ObfuscatedName("aa.w(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method600(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1974.startsWith("win")) {
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
                Object var6 = class121.method2461(field1976, arg2, new Object[] { (new URL(field1976.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1976.getAppletContext().showDocument(new URL(field1976.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field1976;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field1976.getAppletContext().showDocument(new URL(field1976.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
