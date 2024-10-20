package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("dx")
public class class125 {

    @ObfuscatedName("dx.i")
    public static Applet field1975 = null;

    @ObfuscatedName("dx.c")
    public static String field1973 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.c(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method502(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method51(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1973.startsWith("win") && !arg3) {
            method51(arg0, 0, "openjs");
            return;
        }
        if (field1973.startsWith("mac")) {
            method51(arg0, 1, arg2);
            return;
        }
        method51(arg0, 2, "openjs");
    }

    @ObfuscatedName("s.h(Ljava/lang/String;ILjava/lang/String;S)Z")
    public static boolean method51(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1973.startsWith("win")) {
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
                Object var6 = class119.method2463(field1975, arg2, new Object[] { (new URL(field1975.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1975.getAppletContext().showDocument(new URL(field1975.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2464(field1975, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1975.getAppletContext().showDocument(new URL(field1975.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
