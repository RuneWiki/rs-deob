package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("de")
public class class129 {

    @ObfuscatedName("de.a")
    public static Applet field2009 = null;

    @ObfuscatedName("de.v")
    public static String field2013 = null;

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.a(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method5(Applet arg0, String arg1) {
        field2009 = arg0;
        field2013 = arg1;
    }

    @ObfuscatedName("u.v(Ljava/lang/String;ZZI)V")
    public static void method497(String arg0, boolean arg1, boolean arg2) {
        method926(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("aj.i(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method926(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method3175(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field2013.startsWith("win") && !arg3) {
            method3175(arg0, 0);
            return;
        }
        if (field2013.startsWith("mac")) {
            method2505(arg0, 1, arg2);
            return;
        }
        method3175(arg0, 2);
    }

    @ObfuscatedName("fy.b(Ljava/lang/String;IB)Z")
    public static boolean method3175(String arg0, int arg1) {
        return method2505(arg0, arg1, "openjs");
    }

    @ObfuscatedName("db.l(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method2505(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2013.startsWith("win")) {
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
                Applet var6 = field2009;
                Object[] var7 = new Object[] { (new URL(field2009.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2009.getAppletContext().showDocument(new URL(field2009.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class123.method2447(field2009, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field2009.getAppletContext().showDocument(new URL(field2009.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
