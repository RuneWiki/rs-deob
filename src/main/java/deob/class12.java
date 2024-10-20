package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("x")
public class class12 {

    @ObfuscatedName("x.a")
    public static final Map field184 = new HashMap();

    @ObfuscatedName("x.w")
    public static final class199 field182 = new class199(1024);

    @ObfuscatedName("x.d")
    public static final class201 field183 = new class201();

    @ObfuscatedName("x.c")
    public static int field186 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.a(B)I")
    public static int method622() {
        return ++field186 - 1;
    }

    @ObfuscatedName("dt.w(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2783(int arg0, String arg1, String arg2) {
        method877(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ae.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method877(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field184.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field184.put(arg0, var4);
        }
        class36 var5 = var4.method716(arg0, arg1, arg2, arg3);
        field182.method3629(var5, (long) var5.field798);
        field183.method3676(var5);
        client.field304 = client.field478;
    }

    @ObfuscatedName("client.c(III)Lac;")
    public static class36 method624(int arg0, int arg1) {
        class28 var2 = (class28) field184.get(arg0);
        return var2.method717(arg1);
    }

    @ObfuscatedName("ab.y(II)I")
    public static int method834(int arg0) {
        class28 var1 = (class28) field184.get(arg0);
        return var1 == null ? 0 : var1.method722();
    }

    @ObfuscatedName("bv.k(IB)I")
    public static int method1661(int arg0) {
        class36 var1 = (class36) field182.method3628((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field183.field3110 == var1.field3115) {
            return -1;
        } else {
            return ((class36) var1.field3115).field798;
        }
    }
}
