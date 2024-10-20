package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dq")
public class class130 {

    @ObfuscatedName("dq.e")
    public static Applet field1995 = null;

    @ObfuscatedName("dq.a")
    public static String field1985 = null;

    public class130() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fo.e(Ljava/lang/String;ZZI)V")
    public static void method2942(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method738(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field1985.startsWith("win") && !arg2) {
            method738(arg0, 0, "openjs");
        } else if (field1985.startsWith("mac")) {
            method738(arg0, 1, "openjs");
        } else {
            method738(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("aj.a(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method738(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1985.startsWith("win")) {
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
            } catch (Throwable var11) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = class124.method2527(field1995, arg2, new Object[] { (new URL(field1995.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1995.getAppletContext().showDocument(new URL(field1995.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class124.method2526(field1995, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1995.getAppletContext().showDocument(new URL(field1995.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
