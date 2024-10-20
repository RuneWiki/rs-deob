package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ex")
public class class108 {

    @ObfuscatedName("ex.aj")
    public static final Map field1375 = new HashMap();

    @ObfuscatedName("ex.al")
    public static final class454 field1370 = new class454(1024);

    @ObfuscatedName("ex.ac")
    public static final class364 field1369 = new class364();

    @ObfuscatedName("ex.ab")
    public static int field1372 = 0;

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oy.aj(I)I")
    public static int method6751() {
        return ++field1372 - 1;
    }

    @ObfuscatedName("lp.al(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method5191(int arg0, String arg1, String arg2) {
        method144(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("as.ac(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method144(int arg0, String arg1, String arg2, String arg3) {
        class79 var4 = (class79) field1375.get(arg0);
        if (var4 == null) {
            var4 = new class79();
            field1375.put(arg0, var4);
        }
        class62 var5 = var4.method2059(arg0, arg1, arg2, arg3);
        field1370.method7595(var5, (long) var5.field463);
        field1369.method6238(var5);
        client.field631 = client.field671;
    }

    @ObfuscatedName("ge.ab(IIB)Lct;")
    public static class62 method3182(int arg0, int arg1) {
        class79 var2 = (class79) field1375.get(arg0);
        return var2.method2045(arg1);
    }

    @ObfuscatedName("ic.an(IB)Lct;")
    public static class62 method3766(int arg0) {
        return (class62) field1370.method7611((long) arg0);
    }

    @ObfuscatedName("dc.ao(II)I")
    public static int method2127(int arg0) {
        class79 var1 = (class79) field1375.get(arg0);
        return var1 == null ? 0 : var1.method2057();
    }

    @ObfuscatedName("fe.av(I)V")
    public static void method2896() {
        field1375.clear();
        field1370.method7596();
        field1369.method6244();
        field1372 = 0;
    }

    @ObfuscatedName("lg.aq(I)V")
    public static void method4972() {
        Iterator var0 = field1370.iterator();
        while (var0.hasNext()) {
            class62 var1 = (class62) var0.next();
            var1.method1091();
        }
    }

    @ObfuscatedName("bk.ap(I)V")
    public static void method469() {
        Iterator var0 = field1370.iterator();
        while (var0.hasNext()) {
            class62 var1 = (class62) var0.next();
            var1.method1094();
        }
    }

    @ObfuscatedName("mc.ar(II)I")
    public static int method5778(int arg0) {
        class62 var1 = (class62) field1370.method7611((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1369.field4331 == var1.field4665) {
            return -1;
        } else {
            return ((class62) var1.field4665).field463;
        }
    }

    @ObfuscatedName("al.ak(II)I")
    public static int method8(int arg0) {
        class62 var1 = (class62) field1370.method7611((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1369.field4331 == var1.field4666) {
            return -1;
        } else {
            return ((class62) var1.field4666).field463;
        }
    }

    @ObfuscatedName("ea.ax(I)Ljava/lang/String;")
    public static String method2752() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1370.iterator();
        while (var1.hasNext()) {
            class62 var2 = (class62) var1.next();
            if (var2.field460 != null && !var2.field460.isEmpty()) {
                var0.append(var2.field460).append(':');
            }
            var0.append(var2.field465).append('\n');
        }
        return var0.toString();
    }
}
