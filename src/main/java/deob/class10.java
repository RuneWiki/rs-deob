package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("m")
public class class10 {

    @ObfuscatedName("m.v")
    public static final Map field146 = new HashMap();

    @ObfuscatedName("m.t")
    public static final class181 field150 = new class181(1024);

    @ObfuscatedName("m.f")
    public static final class183 field148 = new class183();

    @ObfuscatedName("m.j")
    public static int field149 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.v(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method591(int arg0, String arg1, String arg2) {
        method2766(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("en.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2766(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field146.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field146.put(arg0, var4);
        }
        class32 var5 = var4.method513(arg0, arg1, arg2, arg3);
        field150.method3286(var5, (long) var5.field712);
        field148.method3333(var5);
        client.field440 = client.field435;
    }

    @ObfuscatedName("ch.f(II)I")
    public static int method1791(int arg0) {
        class25 var1 = (class25) field146.get(arg0);
        return var1 == null ? 0 : var1.method512();
    }

    @ObfuscatedName("x.j(I)V")
    public static void method511() {
        field146.clear();
        field150.method3287();
        field148.method3332();
        field149 = 0;
    }

    @ObfuscatedName("client.l(IB)I")
    public static int method453(int arg0) {
        class32 var1 = (class32) field150.method3285((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field148.field2897 == var1.field2902) {
            return -1;
        } else {
            return ((class32) var1.field2902).field712;
        }
    }

    @ObfuscatedName("at.g(IB)I")
    public static int method587(int arg0) {
        class32 var1 = (class32) field150.method3285((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field148.field2897 == var1.field2901) {
            return -1;
        } else {
            return ((class32) var1.field2901).field712;
        }
    }

    @ObfuscatedName("u.k(B)Ljava/lang/String;")
    public static String method531() {
        String var0 = "";
        Iterator var1 = field150.iterator();
        while (var1.hasNext()) {
            class32 var2 = (class32) var1.next();
            var0 = var0 + var2.field706 + ':' + var2.field708 + '\n';
        }
        return var0;
    }
}
