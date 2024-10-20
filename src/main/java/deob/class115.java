package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("da")
public class class115 {

    @ObfuscatedName("da.q")
    public static Applet field1790 = null;

    @ObfuscatedName("da.d")
    public static String field1792 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.q(Ljava/applet/Applet;Ljava/lang/String;B)V")
    public static void method701(Applet arg0, String arg1) {
        field1790 = arg0;
        field1792 = arg1;
    }

    @ObfuscatedName("bi.d(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method1442(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method692(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1792.startsWith("win") && !arg3) {
            method692(arg0, 0, "openjs");
            return;
        }
        if (field1792.startsWith("mac")) {
            method692(arg0, 1, arg2);
            return;
        }
        method692(arg0, 2, "openjs");
    }

    @ObfuscatedName("am.h(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method692(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1792.startsWith("win")) {
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
                Object var6 = class101.method1912(field1790, arg2, new Object[] { (new URL(field1790.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1790.getAppletContext().showDocument(new URL(field1790.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class101.method1908(field1790, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1790.getAppletContext().showDocument(new URL(field1790.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
