package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("w")
public class class10 {

    @ObfuscatedName("w.y")
    public static final Map field152 = new HashMap();

    @ObfuscatedName("w.u")
    public static final class175 field150 = new class175(1024);

    @ObfuscatedName("w.k")
    public static final class177 field151 = new class177();

    @ObfuscatedName("w.v")
    public static int field153 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.y(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2659(int arg0, String arg1, String arg2) {
        method662(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ax.u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method662(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field152.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field152.put(arg0, var4);
        }
        class31 var5 = var4.method481(arg0, arg1, arg2, arg3);
        field150.method3191(var5, (long) var5.field688);
        field151.method3237(var5);
        client.field444 = client.field437;
    }

    @ObfuscatedName("ab.v(B)V")
    public static void method584() {
        field152.clear();
        field150.method3192();
        field151.method3240();
        field153 = 0;
    }

    @ObfuscatedName("br.l(II)I")
    public static int method1593(int arg0) {
        class31 var1 = (class31) field150.method3190((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field151.field2819 == var1.field2823) {
            return -1;
        } else {
            return ((class31) var1.field2823).field688;
        }
    }

    @ObfuscatedName("cw.g(II)I")
    public static int method1871(int arg0) {
        class31 var1 = (class31) field150.method3190((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field151.field2819 == var1.field2822) {
            return -1;
        } else {
            return ((class31) var1.field2822).field688;
        }
    }

    @ObfuscatedName("ct.a(I)Ljava/lang/String;")
    public static String method1851() {
        String var0 = "";
        Iterator var1 = field150.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field685 + ':' + var2.field687 + '\n';
        }
        return var0;
    }
}
