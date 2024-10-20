package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ek")
public class class114 {

    @ObfuscatedName("ek.aq")
    public static final Map field1451 = new HashMap();

    @ObfuscatedName("ek.ad")
    public static final class520 field1447 = new class520(1024);

    @ObfuscatedName("ek.ag")
    public static final class412 field1448 = new class412();

    @ObfuscatedName("ek.ak")
    public static int field1449 = 0;

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hc.aq(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3518(int arg0, String arg1, String arg2) {
        Statics.method6464(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dt.ag(IIB)Lck;")
    public static class65 method2289(int arg0, int arg1) {
        class83 var2 = (class83) field1451.get(arg0);
        return var2.method2169(arg1);
    }

    @ObfuscatedName("lf.ak(II)Lck;")
    public static class65 method5182(int arg0) {
        return (class65) field1447.method8442((long) arg0);
    }

    @ObfuscatedName("cv.ap(II)I")
    public static int method1032(int arg0) {
        class83 var1 = (class83) field1451.get(arg0);
        return var1 == null ? 0 : var1.method2170();
    }

    @ObfuscatedName("dh.an(I)V")
    public static void method2399() {
        field1451.clear();
        field1447.method8444();
        field1448.method6927();
        field1449 = 0;
    }

    @ObfuscatedName("cz.aj(IB)I")
    public static int method2062(int arg0) {
        class65 var1 = (class65) field1447.method8442((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1448.field4667 == var1.field5075) {
            return -1;
        } else {
            return ((class65) var1.field5075).field448;
        }
    }

    @ObfuscatedName("bx.av(IB)I")
    public static int method706(int arg0) {
        class65 var1 = (class65) field1447.method8442((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1448.field4667 == var1.field5077) {
            return -1;
        } else {
            return ((class65) var1.field5077).field448;
        }
    }

    @ObfuscatedName("ek.ab(B)Ljava/lang/String;")
    public static String method2768() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1447.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            if (var2.field451 != null && !var2.field451.isEmpty()) {
                var0.append(var2.field451).append(':');
            }
            var0.append(var2.field456).append('\n');
        }
        return var0.toString();
    }
}
