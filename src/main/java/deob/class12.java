package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("q")
public class class12 {

    @ObfuscatedName("q.c")
    public static final Map field168 = new HashMap();

    @ObfuscatedName("q.h")
    public static final class198 field171 = new class198(1024);

    @ObfuscatedName("q.k")
    public static final class200 field161 = new class200();

    @ObfuscatedName("q.t")
    public static int field162 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.c(I)I")
    public static int method2632() {
        return ++field162 - 1;
    }

    @ObfuscatedName("x.h(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method156(int arg0, String arg1, String arg2) {
        method126(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("r.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method126(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field168.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field168.put(arg0, var4);
        }
        class36 var5 = var4.method623(arg0, arg1, arg2, arg3);
        field171.method3538(var5, (long) var5.field792);
        field161.method3589(var5);
        client.field467 = client.field460;
    }

    @ObfuscatedName("cl.t(III)Lao;")
    public static class36 method1895(int arg0, int arg1) {
        class28 var2 = (class28) field168.get(arg0);
        return var2.method624(arg1);
    }

    @ObfuscatedName("fd.g(II)I")
    public static int method2900(int arg0) {
        class28 var1 = (class28) field168.get(arg0);
        return var1 == null ? 0 : var1.method627();
    }

    @ObfuscatedName("ae.o(B)V")
    public static void method948() {
        field168.clear();
        field171.method3536();
        field161.method3592();
        field162 = 0;
    }

    @ObfuscatedName("ap.i(II)I")
    public static int method907(int arg0) {
        class36 var1 = (class36) field171.method3548((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field161.field3082 == var1.field3087) {
            return -1;
        } else {
            return ((class36) var1.field3087).field792;
        }
    }
}
