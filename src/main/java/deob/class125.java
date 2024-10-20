package deob;

import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfuscatedName("do")
public class class125 {

    @ObfuscatedName("do.j")
    public static Applet field1998 = null;

    @ObfuscatedName("do.z")
    public static String field1995 = null;

    public class125() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.j(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method588(Applet arg0, String arg1) {
        field1998 = arg0;
        field1995 = arg1;
    }

    @ObfuscatedName("de.z(Ljava/lang/String;II)Z")
    public static boolean method2325(String arg0, int arg1) {
        return method454(arg0, arg1, "openjs");
    }

    @ObfuscatedName("v.y(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method454(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!field1995.startsWith("win")) {
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
                Applet var6 = field1998;
                Object[] var7 = new Object[] { (new URL(field1998.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                field1998.getAppletContext().showDocument(new URL(field1998.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class119.method2453(field1998, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                field1998.getAppletContext().showDocument(new URL(field1998.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
