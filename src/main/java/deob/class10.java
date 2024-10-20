package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("l")
public class class10 {

    @ObfuscatedName("l.b")
    public static final Map field170 = new HashMap();

    @ObfuscatedName("l.u")
    public static final class176 field153 = new class176(1024);

    @ObfuscatedName("l.x")
    public static final class178 field166 = new class178();

    @ObfuscatedName("l.j")
    public static int field152 = 0;

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.b(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method88(int arg0, String arg1, String arg2) {
        method2862(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("en.u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2862(int arg0, String arg1, String arg2, String arg3) {
        class24 var4 = (class24) field170.get(arg0);
        if (var4 == null) {
            var4 = new class24();
            field170.put(arg0, var4);
        }
        class31 var5 = var4.method520(arg0, arg1, arg2, arg3);
        field153.method3170(var5, (long) var5.field706);
        field166.method3220(var5);
        client.field451 = client.field443;
    }

    @ObfuscatedName("bn.j(IB)I")
    public static int method1619(int arg0) {
        class31 var1 = (class31) field153.method3167((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field166.field2850 == var1.field2854) {
            return -1;
        } else {
            return ((class31) var1.field2854).field706;
        }
    }

    @ObfuscatedName("fd.o(I)Ljava/lang/String;")
    public static String method3106() {
        String var0 = "";
        Iterator var1 = field153.iterator();
        while (var1.hasNext()) {
            class31 var2 = (class31) var1.next();
            var0 = var0 + var2.field698 + ':' + var2.field700 + '\n';
        }
        return var0;
    }
}
