package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("n")
public class class12 {

    @ObfuscatedName("n.e")
    public static final Map field173 = new HashMap();

    @ObfuscatedName("n.w")
    public static final class199 field172 = new class199(1024);

    @ObfuscatedName("n.f")
    public static final class201 field174 = new class201();

    @ObfuscatedName("n.s")
    public static int field171 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.e(I)I")
    public static int method132() {
        return ++field171 - 1;
    }

    @ObfuscatedName("cm.w(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1945(int arg0, String arg1, String arg2) {
        method948(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("au.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method948(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field173.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field173.put(arg0, var4);
        }
        class36 var5 = var4.method629(arg0, arg1, arg2, arg3);
        field172.method3525(var5, (long) var5.field761);
        field174.method3573(var5);
        client.field471 = client.field464;
    }

    @ObfuscatedName("ak.s(IIB)Lay;")
    public static class36 method988(int arg0, int arg1) {
        class28 var2 = (class28) field173.get(arg0);
        return var2.method630(arg1);
    }

    @ObfuscatedName("fi.p(II)I")
    public static int method3020(int arg0) {
        class36 var1 = (class36) field172.method3528((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field174.field3101 == var1.field3106) {
            return -1;
        } else {
            return ((class36) var1.field3106).field761;
        }
    }
}
