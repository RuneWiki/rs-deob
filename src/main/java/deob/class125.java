package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ds")
public class class125 {

    @ObfuscatedName("ds.t")
    public static Applet field1980 = null;

    @ObfuscatedName("ds.s")
    public static String field1975 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.t(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method28(Applet arg0, String arg1) {
        field1980 = arg0;
        field1975 = arg1;
    }

    @ObfuscatedName("cy.s(Ljava/lang/String;ZZI)V")
    public static void method2029(String arg0, boolean arg1, boolean arg2) {
        method174(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("x.f(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method174(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            method2417(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (field1975.startsWith("win") && !arg3) {
            method2417(arg0, 0, "openjs");
            return;
        }
        if (field1975.startsWith("mac")) {
            method2417(arg0, 1, arg2);
            return;
        }
        method2417(arg0, 2, "openjs");
    }

    @ObfuscatedName("di.e(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method2417(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1975.startsWith("win")) {
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
                Object var6 = Statics.method2431(field1980, arg2, new Object[] { (new URL(field1980.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1980.getAppletContext().showDocument(new URL(field1980.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2430(field1980, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1980.getAppletContext().showDocument(new URL(field1980.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
