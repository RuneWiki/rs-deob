package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("x")
public class class12 {

    @ObfuscatedName("x.a")
    public static final Map field166 = new HashMap();

    @ObfuscatedName("x.d")
    public static final class202 field167 = new class202(1024);

    @ObfuscatedName("x.v")
    public static final class204 field168 = new class204();

    @ObfuscatedName("x.r")
    public static int field169 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hw.a(B)I")
    public static int method3796() {
        return ++field169 - 1;
    }

    @ObfuscatedName("k.d(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method130(int arg0, String arg1, String arg2) {
        method3762(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("hb.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3762(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field166.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field166.put(arg0, var4);
        }
        class38 var5 = var4.method663(arg0, arg1, arg2, arg3);
        field167.method3600(var5, (long) var5.field820);
        field168.method3651(var5);
        client.field561 = client.field466;
    }

    @ObfuscatedName("fv.r(III)Lat;")
    public static class38 method3021(int arg0, int arg1) {
        class30 var2 = (class30) field166.get(arg0);
        return var2.method664(arg1);
    }

    @ObfuscatedName("ex.z(II)I")
    public static int method3004(int arg0) {
        class30 var1 = (class30) field166.get(arg0);
        return var1 == null ? 0 : var1.method668();
    }

    @ObfuscatedName("at.t(II)I")
    public static int method755(int arg0) {
        class38 var1 = (class38) field167.method3599((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field168.field3155 == var1.field3161) {
            return -1;
        } else {
            return ((class38) var1.field3161).field820;
        }
    }

    @ObfuscatedName("dy.n(S)Ljava/lang/String;")
    public static String method2643() {
        String var0 = "";
        Iterator var1 = field167.iterator();
        while (var1.hasNext()) {
            class38 var2 = (class38) var1.next();
            var0 = var0 + var2.field817 + ':' + var2.field815 + '\n';
        }
        return var0;
    }
}
