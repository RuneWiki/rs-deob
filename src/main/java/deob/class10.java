package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("s")
public class class10 {

    @ObfuscatedName("s.a")
    public static final Map field161 = new HashMap();

    @ObfuscatedName("s.v")
    public static final class181 field152 = new class181(1024);

    @ObfuscatedName("s.i")
    public static final class183 field155 = new class183();

    @ObfuscatedName("s.b")
    public static int field153 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.a(S)I")
    public static int method1878() {
        return ++field153 - 1;
    }

    @ObfuscatedName("ee.v(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2599(int arg0, String arg1, String arg2) {
        method3354(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("gh.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method3354(int arg0, String arg1, String arg2, String arg3) {
        class25 var4 = (class25) field161.get(arg0);
        if (var4 == null) {
            var4 = new class25();
            field161.put(arg0, var4);
        }
        class32 var5 = var4.method539(arg0, arg1, arg2, arg3);
        field152.method3235(var5, (long) var5.field719);
        field155.method3288(var5);
        client.field452 = client.field414;
    }

    @ObfuscatedName("i.b(IIB)Lav;")
    public static class32 method28(int arg0, int arg1) {
        class25 var2 = (class25) field161.get(arg0);
        return var2.method540(arg1);
    }

    @ObfuscatedName("bn.l(IB)Lav;")
    public static class32 method1407(int arg0) {
        return (class32) field152.method3234((long) arg0);
    }

    @ObfuscatedName("fj.m(II)I")
    public static int method3176(int arg0) {
        class25 var1 = (class25) field161.get(arg0);
        return var1 == null ? 0 : var1.method541();
    }

    @ObfuscatedName("av.w(I)V")
    public static void method592() {
        field161.clear();
        field152.method3243();
        field155.method3289();
        field153 = 0;
    }

    @ObfuscatedName("fo.e(IB)I")
    public static int method2928(int arg0) {
        class32 var1 = (class32) field152.method3234((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field155.field2893 == var1.field2897) {
            return -1;
        } else {
            return ((class32) var1.field2897).field719;
        }
    }
}
