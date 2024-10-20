package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("da")
public class class115 {

    @ObfuscatedName("da.o")
    public static Applet field1801 = null;

    @ObfuscatedName("da.m")
    public static String field1800 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.o(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2870(Applet arg0, String arg1) {
        field1801 = arg0;
        field1800 = arg1;
    }

    @ObfuscatedName("cp.m(Ljava/lang/String;ZZI)V")
    public static void method1442(String arg0, boolean arg1, boolean arg2) {
        method1767(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ci.b(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method1767(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method160(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1800.startsWith("win") && !arg3) {
            method160(arg0, 0, "openjs");
            return;
        }
        if (field1800.startsWith("mac")) {
            method160(arg0, 1, arg2);
            return;
        }
        method160(arg0, 2, "openjs");
    }

    @ObfuscatedName("j.g(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method160(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1800.startsWith("win")) {
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
                Object var6 = class101.method1795(field1801, arg2, new Object[] { (new URL(field1801.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1801.getAppletContext().showDocument(new URL(field1801.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class101.method1796(field1801, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1801.getAppletContext().showDocument(new URL(field1801.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
