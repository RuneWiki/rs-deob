package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("v")
public class class12 {

    @ObfuscatedName("v.x")
    public static final Map field175 = new HashMap();

    @ObfuscatedName("v.r")
    public static final class202 field165 = new class202(1024);

    @ObfuscatedName("v.j")
    public static final class204 field166 = new class204();

    @ObfuscatedName("v.z")
    public static int field167 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.x(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method558(int arg0, String arg1, String arg2) {
        method156(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("t.r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method156(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field175.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field175.put(arg0, var4);
        }
        class38 var5 = var4.method637(arg0, arg1, arg2, arg3);
        field165.method3584(var5, (long) var5.field794);
        field166.method3627(var5);
        client.field472 = client.field533;
    }

    @ObfuscatedName("cu.j(II)Lab;")
    public static class38 method2095(int arg0) {
        return (class38) field165.method3589((long) arg0);
    }

    @ObfuscatedName("f.z(IS)I")
    public static int method119(int arg0) {
        class30 var1 = (class30) field175.get(arg0);
        return var1 == null ? 0 : var1.method628();
    }

    @ObfuscatedName("r.i(I)V")
    public static void method13() {
        field175.clear();
        field165.method3585();
        field166.method3623();
        field167 = 0;
    }

    @ObfuscatedName("ch.b(II)I")
    public static int method2006(int arg0) {
        class38 var1 = (class38) field165.method3589((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field166.field3158 == var1.field3163) {
            return -1;
        } else {
            return ((class38) var1.field3163).field794;
        }
    }
}
