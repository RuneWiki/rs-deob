package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("g")
public class class12 {

    @ObfuscatedName("g.k")
    public static final Map field162 = new HashMap();

    @ObfuscatedName("g.h")
    public static final class198 field161 = new class198(1024);

    @ObfuscatedName("g.o")
    public static final class200 field160 = new class200();

    @ObfuscatedName("g.z")
    public static int field163 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.k(B)I")
    public static int method691() {
        return ++field163 - 1;
    }

    @ObfuscatedName("o.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method31(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field162.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field162.put(arg0, var4);
        }
        class36 var5 = var4.method597(arg0, arg1, arg2, arg3);
        field161.method3574(var5, (long) var5.field765);
        field160.method3607(var5);
        client.field487 = client.field468;
    }

    @ObfuscatedName("ej.z(B)V")
    public static void method2778() {
        field162.clear();
        field161.method3566();
        field160.method3612();
        field163 = 0;
    }

    @ObfuscatedName("cq.c(IS)I")
    public static int method2130(int arg0) {
        class36 var1 = (class36) field161.method3564((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field160.field3095 == var1.field3100) {
            return -1;
        } else {
            return ((class36) var1.field3100).field765;
        }
    }

    @ObfuscatedName("bv.d(II)I")
    public static int method1456(int arg0) {
        class36 var1 = (class36) field161.method3564((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field160.field3095 == var1.field3099) {
            return -1;
        } else {
            return ((class36) var1.field3099).field765;
        }
    }

    @ObfuscatedName("a.l(B)Ljava/lang/String;")
    public static String method184() {
        String var0 = "";
        Iterator var1 = field161.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field762 + ':' + var2.field764 + '\n';
        }
        return var0;
    }
}
