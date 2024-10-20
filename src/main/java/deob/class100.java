package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cr")
public class class100 {

    @ObfuscatedName("cr.e")
    public static final Map field1518 = new HashMap();

    @ObfuscatedName("cr.n")
    public static final class188 field1517 = new class188(1024);

    @ObfuscatedName("cr.g")
    public static final class203 field1521 = new class203();

    @ObfuscatedName("cr.y")
    public static int field1516 = 0;

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method112(int arg0, String arg1, String arg2, String arg3) {
        class103 var4 = (class103) field1518.get(arg0);
        if (var4 == null) {
            var4 = new class103();
            field1518.put(arg0, var4);
        }
        class74 var5 = var4.method1766(arg0, arg1, arg2, arg3);
        field1517.method3250(var5, (long) var5.field872);
        field1521.method3420(var5);
        client.field1095 = client.field1088;
    }

    @ObfuscatedName("i.g(IIB)Lbs;")
    public static class74 method167(int arg0, int arg1) {
        class103 var2 = (class103) field1518.get(arg0);
        return var2.method1765(arg1);
    }

    @ObfuscatedName("en.y(II)Lbs;")
    public static class74 method2699(int arg0) {
        return (class74) field1517.method3249((long) arg0);
    }

    @ObfuscatedName("cu.w(II)I")
    public static int method1501(int arg0) {
        class103 var1 = (class103) field1518.get(arg0);
        return var1 == null ? 0 : var1.method1760();
    }

    @ObfuscatedName("p.k(I)Ljava/lang/String;")
    public static String method145() {
        String var0 = "";
        Iterator var1 = field1517.iterator();
        while (var1.hasNext()) {
            class74 var2 = (class74) var1.next();
            var0 = var0 + var2.field870 + ':' + var2.field874 + '\n';
        }
        return var0;
    }
}
