package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("dk")
public class class111 {

    @ObfuscatedName("dk.v")
    public static final Map field1400 = new HashMap();

    @ObfuscatedName("dk.n")
    public static final class361 field1396 = new class361(1024);

    @ObfuscatedName("dk.f")
    public static final class299 field1398 = new class299();

    @ObfuscatedName("dk.y")
    public static int field1399 = 0;

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.v(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1459(int arg0, String arg1, String arg2) {
        method48(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("j.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method48(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) field1400.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            field1400.put(arg0, var4);
        }
        class73 var5 = var4.method1815(arg0, arg1, arg2, arg3);
        field1396.method5754(var5, (long) var5.field626);
        field1398.method4853(var5);
        client.field836 = client.field827;
    }

    @ObfuscatedName("s.f(IIB)Lbi;")
    public static class73 method67(int arg0, int arg1) {
        class89 var2 = (class89) field1400.get(arg0);
        return var2.method1816(arg1);
    }

    @ObfuscatedName("dl.y(II)Lbi;")
    public static class73 method2279(int arg0) {
        return (class73) field1396.method5752((long) arg0);
    }

    @ObfuscatedName("h.p(II)I")
    public static int method176(int arg0) {
        class89 var1 = (class89) field1400.get(arg0);
        return var1 == null ? 0 : var1.method1814();
    }

    @ObfuscatedName("ao.j(I)V")
    public static void method338() {
        field1400.clear();
        field1396.method5761();
        field1398.method4862();
        field1399 = 0;
    }

    @ObfuscatedName("mb.r(B)V")
    public static void method5505() {
        Iterator var0 = field1396.iterator();
        while (var0.hasNext()) {
            class73 var1 = (class73) var0.next();
            var1.method975();
        }
    }

    @ObfuscatedName("kv.b(II)I")
    public static int method5122(int arg0) {
        class73 var1 = (class73) field1396.method5752((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1398.field3718 == var1.field3933) {
            return -1;
        } else {
            return ((class73) var1.field3933).field626;
        }
    }

    @ObfuscatedName("k.d(II)I")
    public static int method151(int arg0) {
        class73 var1 = (class73) field1396.method5752((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1398.field3718 == var1.field3931) {
            return -1;
        } else {
            return ((class73) var1.field3931).field626;
        }
    }
}
