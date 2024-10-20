package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("df")
public class class106 {

    @ObfuscatedName("df.a")
    public static final Map field1365 = new HashMap();

    @ObfuscatedName("df.f")
    public static final class440 field1361 = new class440(1024);

    @ObfuscatedName("df.c")
    public static final class354 field1360 = new class354();

    @ObfuscatedName("df.x")
    public static int field1363 = 0;

    public class106() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pn.a(I)I")
    public static int method7135() {
        return ++field1363 - 1;
    }

    @ObfuscatedName("ci.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2139(int arg0, String arg1, String arg2, String arg3) {
        class78 var4 = (class78) field1365.get(arg0);
        if (var4 == null) {
            var4 = new class78();
            field1365.put(arg0, var4);
        }
        class62 var5 = var4.method2052(arg0, arg1, arg2, arg3);
        field1361.method7448(var5, (long) var5.field467);
        field1360.method6180(var5);
        client.field701 = client.field736;
    }

    @ObfuscatedName("ly.x(III)Lbk;")
    public static class62 method5888(int arg0, int arg1) {
        class78 var2 = (class78) field1365.get(arg0);
        return var2.method2046(arg1);
    }

    @ObfuscatedName("q.h(II)Lbk;")
    public static class62 method289(int arg0) {
        return (class62) field1361.method7455((long) arg0);
    }

    @ObfuscatedName("ir.j(II)I")
    public static int method4672(int arg0) {
        class78 var1 = (class78) field1365.get(arg0);
        return var1 == null ? 0 : var1.method2047();
    }

    @ObfuscatedName("aw.y(I)V")
    public static void method852() {
        Iterator var0 = field1361.iterator();
        while (var0.hasNext()) {
            class62 var1 = (class62) var0.next();
            var1.method1082();
        }
    }

    @ObfuscatedName("jv.d(IS)I")
    public static int method4911(int arg0) {
        class62 var1 = (class62) field1361.method7455((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1360.field4287 == var1.field4630) {
            return -1;
        } else {
            return ((class62) var1.field4630).field467;
        }
    }

    @ObfuscatedName("eb.n(IB)I")
    public static int method2838(int arg0) {
        class62 var1 = (class62) field1361.method7455((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1360.field4287 == var1.field4629) {
            return -1;
        } else {
            return ((class62) var1.field4629).field467;
        }
    }
}
