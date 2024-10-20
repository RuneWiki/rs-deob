package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("d")
public class class10 {

    @ObfuscatedName("d.p")
    public static final Map field157 = new HashMap();

    @ObfuscatedName("d.g")
    public static final class177 field155 = new class177(1024);

    @ObfuscatedName("d.x")
    public static final class179 field156 = new class179();

    @ObfuscatedName("d.c")
    public static int field159 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.p(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method849(int arg0, String arg1, String arg2) {
        method10(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("g.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method10(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field157.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field157.put(arg0, var4);
        }
        class31 var5 = var4.method524(arg0, arg1, arg2, arg3);
        field155.method3282(var5, (long) var5.field706);
        field156.method3325(var5);
        client.field388 = client.field443;
    }

    @ObfuscatedName("eh.x(II)Las;")
    public static class31 method2953(int arg0) {
        return (class31) field155.method3284((long) arg0);
    }

    @ObfuscatedName("c.c(B)V")
    public static void method38() {
        field157.clear();
        field155.method3283();
        field156.method3320();
        field159 = 0;
    }

    @ObfuscatedName("p.n(II)I")
    public static int method5(int arg0) {
        class31 var1 = (class31) field155.method3284((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field156.field2865 == var1.field2869) {
            return -1;
        } else {
            return ((class31) var1.field2869).field706;
        }
    }

    @ObfuscatedName("cb.s(IB)I")
    public static int method1933(int arg0) {
        class31 var1 = (class31) field155.method3284((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field156.field2865 == var1.field2870) {
            return -1;
        } else {
            return ((class31) var1.field2870).field706;
        }
    }

    @ObfuscatedName("ef.r(B)Ljava/lang/String;")
    public static String method2727() {
        String var0 = "";
        Iterator var1 = field155.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field704 + ':' + var2.field708 + '\n';
        }
        return var0;
    }
}
