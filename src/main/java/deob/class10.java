package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("q")
public class class10 {

    @ObfuscatedName("q.k")
    public static final Map field153 = new HashMap();

    @ObfuscatedName("q.b")
    public static final class176 field145 = new class176(1024);

    @ObfuscatedName("q.e")
    public static final class178 field150 = new class178();

    @ObfuscatedName("q.i")
    public static int field149 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.k(I)I")
    public static int method490() {
        return ++field149 - 1;
    }

    @ObfuscatedName("cr.b(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1970(int arg0, String arg1, String arg2) {
        method1315(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bk.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1315(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field153.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field153.put(arg0, var4);
        }
        class31 var5 = var4.method495(arg0, arg1, arg2, arg3);
        field145.method3206(var5, (long) var5.field710);
        field150.method3257(var5);
        client.field450 = client.field443;
    }

    @ObfuscatedName("at.i(II)I")
    public static int method570(int arg0) {
        class24 var1 = (class24) field153.get(arg0);
        return var1 == null ? 0 : var1.method497();
    }

    @ObfuscatedName("dz.t(I)V")
    public static void method2404() {
        field153.clear();
        field145.method3215();
        field150.method3256();
        field149 = 0;
    }

    @ObfuscatedName("cq.z(II)I")
    public static int method1876(int arg0) {
        class31 var1 = (class31) field145.method3205((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field150.field2852 == var1.field2856) {
            return -1;
        } else {
            return ((class31) var1.field2856).field710;
        }
    }
}
