package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dh")
public class class115 {

    @ObfuscatedName("dh.b")
    public static Applet field1784 = null;

    @ObfuscatedName("dh.l")
    public static String field1788 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.b(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method80(Applet arg0, String arg1) {
        field1784 = arg0;
        field1788 = arg1;
    }

    @ObfuscatedName("h.l(Ljava/lang/String;IB)Z")
    public static boolean method85(String arg0, int arg1) {
        return method909(arg0, arg1, "openjs");
    }

    @ObfuscatedName("ak.i(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method909(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1788.startsWith("win")) {
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
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field1784;
                Object[] var7 = new Object[] { (new URL(field1784.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1784.getAppletContext().showDocument(new URL(field1784.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field1784;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field1784.getAppletContext().showDocument(new URL(field1784.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
