package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("df")
public class class125 {

    @ObfuscatedName("df.g")
    public static Applet field2008 = null;

    @ObfuscatedName("df.v")
    public static String field2002 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.g(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2083(Applet arg0, String arg1) {
        field2008 = arg0;
        field2002 = arg1;
    }

    @ObfuscatedName("ag.v(Ljava/lang/String;ZZB)V")
    public static void method757(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method147(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field2002.startsWith("win") && !arg2) {
            method147(arg0, 0, "openjs");
        } else if (field2002.startsWith("mac")) {
            method147(arg0, 1, "openjs");
        } else {
            method147(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("q.z(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method147(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2002.startsWith("win")) {
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
                Object var6 = class119.method2432(field2008, arg2, new Object[] { (new URL(field2008.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2008.getAppletContext().showDocument(new URL(field2008.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2440(field2008, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field2008.getAppletContext().showDocument(new URL(field2008.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
