package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dh")
public class class127 {

    @ObfuscatedName("dh.e")
    public static Applet field1989 = null;

    @ObfuscatedName("dh.v")
    public static String field1986 = null;

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.e(Ljava/lang/String;ZZI)V")
    public static void method570(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method494(arg0, 3, "openjs");
            return;
        }
        if (!arg2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var4) {
            }
        }
        if (field1986.startsWith("win") && !arg2) {
            method494(arg0, 0, "openjs");
        } else if (field1986.startsWith("mac")) {
            method494(arg0, 1, "openjs");
        } else {
            method494(arg0, 2, "openjs");
        }
    }

    @ObfuscatedName("x.v(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method494(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1986.startsWith("win")) {
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
                Object var6 = class121.method2458(field1989, arg2, new Object[] { (new URL(field1989.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1989.getAppletContext().showDocument(new URL(field1989.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field1989;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field1989.getAppletContext().showDocument(new URL(field1989.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
