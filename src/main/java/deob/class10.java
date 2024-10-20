package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("x")
public class class10 {

    @ObfuscatedName("x.e")
    public static final Map field156 = new HashMap();

    @ObfuscatedName("x.o")
    public static final class176 field154 = new class176(1024);

    @ObfuscatedName("x.y")
    public static final class178 field152 = new class178();

    @ObfuscatedName("x.b")
    public static int field153 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.e(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1313(int arg0, String arg1, String arg2) {
        method97(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("f.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method97(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field156.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field156.put(arg0, var4);
        }
        class31 var5 = var4.method507(arg0, arg1, arg2, arg3);
        field154.method3106(var5, (long) var5.field727);
        field152.method3152(var5);
        client.field456 = client.field449;
    }

    @ObfuscatedName("dg.y(IB)Lao;")
    public static class31 method2331(int arg0) {
        return (class31) field154.method3109((long) arg0);
    }

    @ObfuscatedName("x.b(II)I")
    public static int method117(int arg0) {
        class24 var1 = (class24) field156.get(arg0);
        return var1 == null ? 0 : var1.method509();
    }

    @ObfuscatedName("cx.w(B)Ljava/lang/String;")
    public static String method1826() {
        String var0 = "";
        Iterator var1 = field154.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field719 + ':' + var2.field721 + '\n';
        }
        return var0;
    }
}
