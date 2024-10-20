package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("dl")
public class class130 {

    @ObfuscatedName("dl.n")
    public static Applet field2040 = null;

    @ObfuscatedName("dl.g")
    public static String field2044 = null;

    public class130() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.n(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method32(Applet arg0, String arg1) {
        field2040 = arg0;
        field2044 = arg1;
    }

    @ObfuscatedName("af.g(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method863(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field2044.startsWith("win")) {
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
            } catch (Throwable var14) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = field2040;
                Object[] var7 = new Object[] { (new URL(field2040.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field2040.getAppletContext().showDocument(new URL(field2040.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class124.method2540(field2040, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field2040.getAppletContext().showDocument(new URL(field2040.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
