package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dq")
public class class115 {

    @ObfuscatedName("dq.x")
    public static Applet field1799 = null;

    @ObfuscatedName("dq.j")
    public static String field1795 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.x(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method2089(Applet arg0, String arg1) {
        field1799 = arg0;
        field1795 = arg1;
    }

    @ObfuscatedName("dj.j(Ljava/lang/String;ZZB)V")
    public static void method2013(String arg0, boolean arg1, boolean arg2) {
        method3065(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("fj.c(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method3065(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2610(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1795.startsWith("win") && !arg3) {
            method2610(arg0, 0, "openjs");
            return;
        }
        if (field1795.startsWith("mac")) {
            method2610(arg0, 1, arg2);
            return;
        }
        method2610(arg0, 2, "openjs");
    }

    @ObfuscatedName("ez.d(Ljava/lang/String;ILjava/lang/String;S)Z")
    public static boolean method2610(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1795.startsWith("win")) {
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
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field1799;
                Object[] var7 = new Object[] { (new URL(field1799.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1799.getAppletContext().showDocument(new URL(field1799.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field1799;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field1799.getAppletContext().showDocument(new URL(field1799.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
