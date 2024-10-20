package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dt")
public class class115 {

    @ObfuscatedName("dt.i")
    public static Applet field1789 = null;

    @ObfuscatedName("dt.e")
    public static String field1785 = null;

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.i(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method697(Applet arg0, String arg1) {
        field1789 = arg0;
        field1785 = arg1;
    }

    @ObfuscatedName("cn.e(Ljava/lang/String;II)Z")
    public static boolean method1450(String arg0, int arg1) {
        return method678(arg0, arg1, "openjs");
    }

    @ObfuscatedName("av.f(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method678(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1785.startsWith("win")) {
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
                Applet var6 = field1789;
                Object[] var7 = new Object[] { (new URL(field1789.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1789.getAppletContext().showDocument(new URL(field1789.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = field1789;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                field1789.getAppletContext().showDocument(new URL(field1789.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
