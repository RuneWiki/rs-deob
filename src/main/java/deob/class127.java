package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dr")
public class class127 {

    @ObfuscatedName("dr.g")
    public static Applet field1973 = null;

    @ObfuscatedName("dr.j")
    public static String field1977 = null;

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.g(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method482(Applet arg0, String arg1) {
        field1973 = arg0;
        field1977 = arg1;
    }

    @ObfuscatedName("o.j(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method507(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method135(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1977.startsWith("win") && !arg3) {
            method135(arg0, 0, "openjs");
            return;
        }
        if (field1977.startsWith("mac")) {
            method135(arg0, 1, arg2);
            return;
        }
        method135(arg0, 2, "openjs");
    }

    @ObfuscatedName("p.z(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method135(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1977.startsWith("win")) {
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
                Object var6 = class121.method2411(field1973, arg2, new Object[] { (new URL(field1973.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var13) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1973.getAppletContext().showDocument(new URL(field1973.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var9 = field1973;
                JSObject.getWindow(var9).call("loggedout", (Object[]) null);
            } catch (Throwable var16) {
            }
            try {
                field1973.getAppletContext().showDocument(new URL(field1973.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var15) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
