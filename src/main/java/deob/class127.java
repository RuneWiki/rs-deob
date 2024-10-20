package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("di")
public class class127 {

    @ObfuscatedName("di.x")
    public static Applet field1989 = null;

    @ObfuscatedName("di.v")
    public static String field1983 = null;

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.x(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method784(Applet arg0, String arg1) {
        field1989 = arg0;
        field1983 = arg1;
    }

    @ObfuscatedName("dd.v(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2494(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method502(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1983.startsWith("win") && !arg3) {
            method502(arg0, 0);
            return;
        }
        if (field1983.startsWith("mac")) {
            method29(arg0, 1, arg2);
            return;
        }
        method502(arg0, 2);
    }

    @ObfuscatedName("d.m(Ljava/lang/String;II)Z")
    public static boolean method502(String arg0, int arg1) {
        return method29(arg0, arg1, "openjs");
    }

    @ObfuscatedName("h.e(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method29(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1983.startsWith("win")) {
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
                Object var6 = class121.method2464(field1989, arg2, new Object[] { (new URL(field1989.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1989.getAppletContext().showDocument(new URL(field1989.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class121.method2463(field1989, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1989.getAppletContext().showDocument(new URL(field1989.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
