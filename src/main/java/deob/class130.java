package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dc")
public class class130 {

    @ObfuscatedName("dc.p")
    public static Applet field2033 = null;

    @ObfuscatedName("dc.k")
    public static String field2030 = null;

    public class130() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.p(Ljava/lang/String;ZZS)V")
    public static void method841(String arg0, boolean arg1, boolean arg2) {
        Statics.method3365(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("z.e(Ljava/lang/String;II)Z")
    public static boolean method560(String arg0, int arg1) {
        return method128(arg0, arg1, "openjs");
    }

    @ObfuscatedName("h.f(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method128(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2030.startsWith("win")) {
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
                Applet var6 = field2033;
                Object[] var7 = new Object[] { (new URL(field2033.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2033.getAppletContext().showDocument(new URL(field2033.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field2033;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field2033.getAppletContext().showDocument(new URL(field2033.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
