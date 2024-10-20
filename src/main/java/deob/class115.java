package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dw")
public class class115 {

    @ObfuscatedName("dw.d")
    public static Applet field1794 = null;

    @ObfuscatedName("dw.c")
    public static String field1789 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.d(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method799(Applet arg0, String arg1) {
        field1794 = arg0;
        field1789 = arg1;
    }

    @ObfuscatedName("dd.c(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method2213(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2141(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1789.startsWith("win") && !arg3) {
            method2141(arg0, 0, "openjs");
            return;
        }
        if (field1789.startsWith("mac")) {
            method2141(arg0, 1, arg2);
            return;
        }
        method2141(arg0, 2, "openjs");
    }

    @ObfuscatedName("di.n(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method2141(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1789.startsWith("win")) {
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
                class101.method1834(field1794, "loggedout");
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
