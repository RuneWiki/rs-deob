package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dx")
public class class125 {

    @ObfuscatedName("dx.e")
    public static Applet field1975 = null;

    @ObfuscatedName("dx.v")
    public static String field1976 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.e(Ljava/lang/String;ZZI)V")
    public static void method2396(String arg0, boolean arg1, boolean arg2) {
        method128(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("u.v(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method128(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method100(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1976.startsWith("win") && !arg3) {
            method100(arg0, 0, "openjs");
            return;
        }
        if (field1976.startsWith("mac")) {
            method100(arg0, 1, arg2);
            return;
        }
        method100(arg0, 2, "openjs");
    }

    @ObfuscatedName("m.i(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method100(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1976.startsWith("win")) {
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
                Applet var6 = field1975;
                Object[] var7 = new Object[] { (new URL(field1975.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1975.getAppletContext().showDocument(new URL(field1975.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2432(field1975, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field1975.getAppletContext().showDocument(new URL(field1975.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
