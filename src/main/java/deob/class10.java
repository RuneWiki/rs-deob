package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("y")
public class class10 {

    @ObfuscatedName("y.i")
    public static final Map field165 = new HashMap();

    @ObfuscatedName("y.c")
    public static final class176 field160 = new class176(1024);

    @ObfuscatedName("y.h")
    public static final class178 field161 = new class178();

    @ObfuscatedName("y.v")
    public static int field162 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.i(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method566(int arg0, String arg1, String arg2) {
        method50(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("s.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method50(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field165.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field165.put(arg0, var4);
        }
        class31 var5 = var4.method505(arg0, arg1, arg2, arg3);
        field160.method3245(var5, (long) var5.field716);
        field161.method3277(var5);
        client.field452 = client.field439;
    }

    @ObfuscatedName("g.h(III)Laj;")
    public static class31 method81(int arg0, int arg1) {
        class24 var2 = (class24) field165.get(arg0);
        return var2.method506(arg1);
    }

    @ObfuscatedName("ex.v(IB)Laj;")
    public static class31 method2709(int arg0) {
        return (class31) field160.method3237((long) arg0);
    }

    @ObfuscatedName("ab.q(B)Ljava/lang/String;")
    public static String method649() {
        String var0 = "";
        Iterator var1 = field160.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field714 + ':' + var2.field712 + '\n';
        }
        return var0;
    }
}
