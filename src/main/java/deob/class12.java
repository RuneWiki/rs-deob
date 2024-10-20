package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("w")
public class class12 {

    @ObfuscatedName("w.s")
    public static final Map field164 = new HashMap();

    @ObfuscatedName("w.z")
    public static final class202 field169 = new class202(1024);

    @ObfuscatedName("w.t")
    public static final class204 field166 = new class204();

    @ObfuscatedName("w.y")
    public static int field163 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.s(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method37(int arg0, String arg1, String arg2) {
        method976(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("as.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method976(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field164.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field164.put(arg0, var4);
        }
        class38 var5 = var4.method659(arg0, arg1, arg2, arg3);
        field169.method3573(var5, (long) var5.field775);
        field166.method3620(var5);
        client.field461 = client.field454;
    }

    @ObfuscatedName("r.t(III)Lav;")
    public static class38 method126(int arg0, int arg1) {
        class30 var2 = (class30) field164.get(arg0);
        return var2.method657(arg1);
    }

    @ObfuscatedName("j.y(II)I")
    public static int method586(int arg0) {
        class30 var1 = (class30) field164.get(arg0);
        return var1 == null ? 0 : var1.method661();
    }

    @ObfuscatedName("eo.p(I)V")
    public static void method2799() {
        field164.clear();
        field169.method3574();
        field166.method3619();
        field163 = 0;
    }

    @ObfuscatedName("d.g(II)I")
    public static int method170(int arg0) {
        class38 var1 = (class38) field169.method3572((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field166.field3151 == var1.field3157) {
            return -1;
        } else {
            return ((class38) var1.field3157).field775;
        }
    }

    @ObfuscatedName("c.m(II)I")
    public static int method192(int arg0) {
        class38 var1 = (class38) field169.method3572((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field166.field3151 == var1.field3156) {
            return -1;
        } else {
            return ((class38) var1.field3156).field775;
        }
    }
}
