package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("l")
public class class11 {

    @ObfuscatedName("l.n")
    public static final Map field153 = new HashMap();

    @ObfuscatedName("l.d")
    public static final class189 field152 = new class189(1024);

    @ObfuscatedName("l.z")
    public static final class191 field154 = new class191();

    @ObfuscatedName("l.y")
    public static int field156 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.n(B)I")
    public static int method963() {
        return ++field156 - 1;
    }

    @ObfuscatedName("ej.d(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2783(int arg0, String arg1, String arg2) {
        Statics.method838(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ci.y(II)Las;")
    public static class33 method2062(int arg0) {
        return (class33) field152.method3471((long) arg0);
    }

    @ObfuscatedName("dk.e(II)I")
    public static int method2523(int arg0) {
        class26 var1 = (class26) field153.get(arg0);
        return var1 == null ? 0 : var1.method594();
    }

    @ObfuscatedName("d.g(II)I")
    public static int method13(int arg0) {
        class33 var1 = (class33) field152.method3471((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field154.field2993 == var1.field2998) {
            return -1;
        } else {
            return ((class33) var1.field2998).field726;
        }
    }

    @ObfuscatedName("eq.f(B)Ljava/lang/String;")
    public static String method2714() {
        String var0 = "";
        Iterator var1 = field152.iterator();
        while (var1.hasNext()) {
            class33 var2 = (class33) var1.next();
            var0 = var0 + var2.field730 + ':' + var2.field724 + '\n';
        }
        return var0;
    }
}
