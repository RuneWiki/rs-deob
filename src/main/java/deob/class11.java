package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("m")
public class class11 {

    @ObfuscatedName("m.n")
    public static final Map field160 = new HashMap();

    @ObfuscatedName("m.w")
    public static final class189 field145 = new class189(1024);

    @ObfuscatedName("m.i")
    public static final class191 field147 = new class191();

    @ObfuscatedName("m.e")
    public static int field149 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.n(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method582(int arg0, String arg1, String arg2) {
        method36(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("h.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method36(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field160.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field160.put(arg0, var4);
        }
        class33 var5 = var4.method555(arg0, arg1, arg2, arg3);
        field145.method3363(var5, (long) var5.field737);
        field147.method3415(var5);
        client.field463 = client.field445;
    }

    @ObfuscatedName("u.e(II)I")
    public static int method154(int arg0) {
        class26 var1 = (class26) field160.get(arg0);
        return var1 == null ? 0 : var1.method558();
    }

    @ObfuscatedName("cd.h(I)V")
    public static void method1616() {
        field160.clear();
        field145.method3374();
        field147.method3424();
        field149 = 0;
    }

    @ObfuscatedName("aq.q(II)I")
    public static int method594(int arg0) {
        class33 var1 = (class33) field145.method3364((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field147.field2998 == var1.field3003) {
            return -1;
        } else {
            return ((class33) var1.field3003).field737;
        }
    }
}
