package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("f")
public class class10 {

    @ObfuscatedName("f.e")
    public static final Map field155 = new HashMap();

    @ObfuscatedName("f.p")
    public static final class175 field153 = new class175(1024);

    @ObfuscatedName("f.a")
    public static final class177 field154 = new class177();

    @ObfuscatedName("f.g")
    public static int field159 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.e(I)I")
    public static int method1787() {
        return ++field159 - 1;
    }

    @ObfuscatedName("bp.p(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1607(int arg0, String arg1, String arg2) {
        method1(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("e.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field155.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field155.put(arg0, var4);
        }
        class31 var5 = var4.method512(arg0, arg1, arg2, arg3);
        field153.method3216(var5, (long) var5.field685);
        field154.method3263(var5);
        client.field448 = client.field441;
    }

    @ObfuscatedName("m.g(IS)Lai;")
    public static class31 method80(int arg0) {
        return (class31) field153.method3215((long) arg0);
    }

    @ObfuscatedName("ez.u(I)V")
    public static void method2890() {
        field155.clear();
        field153.method3209();
        field154.method3261();
        field159 = 0;
    }

    @ObfuscatedName("dr.k(II)I")
    public static int method2527(int arg0) {
        class31 var1 = (class31) field153.method3215((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field154.field2833 == var1.field2837) {
            return -1;
        } else {
            return ((class31) var1.field2837).field685;
        }
    }

    @ObfuscatedName("aw.m(IB)I")
    public static int method598(int arg0) {
        class31 var1 = (class31) field153.method3215((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field154.field2833 == var1.field2836) {
            return -1;
        } else {
            return ((class31) var1.field2836).field685;
        }
    }
}
