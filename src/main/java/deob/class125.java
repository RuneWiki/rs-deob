package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dj")
public class class125 {

    @ObfuscatedName("dj.e")
    public static Applet field1982 = null;

    @ObfuscatedName("dj.o")
    public static String field1981 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.e(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2387(Applet arg0, String arg1) {
        field1982 = arg0;
        field1981 = arg1;
    }

    @ObfuscatedName("ew.o(Ljava/lang/String;ZZI)V")
    public static void method2615(String arg0, boolean arg1, boolean arg2) {
        method1995(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("cz.y(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method1995(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method1911(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1981.startsWith("win") && !arg3) {
            method1911(arg0, 0, "openjs");
            return;
        }
        if (field1981.startsWith("mac")) {
            method1911(arg0, 1, arg2);
            return;
        }
        method1911(arg0, 2, "openjs");
    }

    @ObfuscatedName("cs.b(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method1911(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1981.startsWith("win")) {
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
                Object var6 = class119.method2377(field1982, arg2, new Object[] { (new URL(field1982.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1982.getAppletContext().showDocument(new URL(field1982.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2376(field1982, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1982.getAppletContext().showDocument(new URL(field1982.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
