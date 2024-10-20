package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dg")
public class class122 {

    @ObfuscatedName("dg.z")
    public static Applet field1966 = null;

    @ObfuscatedName("dg.n")
    public static String field1961 = null;

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.n(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method154(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method150(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1961.startsWith("win") && !arg3) {
            method150(arg0, 0);
            return;
        }
        if (field1961.startsWith("mac")) {
            method2459(arg0, 1, arg2);
            return;
        }
        method150(arg0, 2);
    }

    @ObfuscatedName("d.u(Ljava/lang/String;II)Z")
    public static boolean method150(String arg0, int arg1) {
        return method2459(arg0, arg1, "openjs");
    }

    @ObfuscatedName("dk.t(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method2459(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1961.startsWith("win")) {
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
                Object var6 = class116.method2466(field1966, arg2, new Object[] { (new URL(field1966.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1966.getAppletContext().showDocument(new URL(field1966.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field1966;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field1966.getAppletContext().showDocument(new URL(field1966.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
