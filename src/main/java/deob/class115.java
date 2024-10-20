package deob;

import java.applet.Applet;
import java.net.URL;

@ObfuscatedName("dr")
public class class115 {

    @ObfuscatedName("dr.x")
    public static Applet field1788 = null;

    @ObfuscatedName("dr.n")
    public static String field1787 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.x(Ljava/lang/String;ILjava/lang/String;S)Z")
    public static boolean method956(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1787.startsWith("win")) {
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
                Object var6 = class101.method1927(field1788, arg2, new Object[] { (new URL(field1788.getCodeBase(), arg0)).toString() });
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1788.getAppletContext().showDocument(new URL(field1788.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class101.method1926(field1788, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                field1788.getAppletContext().showDocument(new URL(field1788.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
