package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ek")
public class class114 {

    @ObfuscatedName("ek.ab")
    public static final Map field1441 = new HashMap();

    @ObfuscatedName("ek.ay")
    public static final class521 field1442 = new class521(1024);

    @ObfuscatedName("ek.an")
    public static final class413 field1443 = new class413();

    @ObfuscatedName("ek.au")
    public static int field1444 = 0;

    public class114() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pg.ab(I)I")
    public static int method6872() {
        return ++field1444 - 1;
    }

    @ObfuscatedName("ka.ay(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method4997(int arg0, String arg1, String arg2) {
        method8651(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("uy.an(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method8651(int arg0, String arg1, String arg2, String arg3) {
        class83 var4 = (class83) field1441.get(arg0);
        if (var4 == null) {
            var4 = new class83();
            field1441.put(arg0, var4);
        }
        class65 var5 = var4.method2225(arg0, arg1, arg2, arg3);
        field1442.method8513(var5, (long) var5.field454);
        field1443.method7043(var5);
        client.field700 = client.field691;
    }

    @ObfuscatedName("ax.au(IIS)Lci;")
    public static class65 method11(int arg0, int arg1) {
        class83 var2 = (class83) field1441.get(arg0);
        return var2.method2218(arg1);
    }

    @ObfuscatedName("nh.ax(II)Lci;")
    public static class65 method6525(int arg0) {
        return (class65) field1442.method8512((long) arg0);
    }

    @ObfuscatedName("oi.ao(II)I")
    public static int method6563(int arg0) {
        class83 var1 = (class83) field1441.get(arg0);
        return var1 == null ? 0 : var1.method2231();
    }

    @ObfuscatedName("df.am(I)V")
    public static void method2286() {
        Iterator var0 = field1442.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1109();
        }
    }

    @ObfuscatedName("om.ac(II)I")
    public static int method6552(int arg0) {
        class65 var1 = (class65) field1442.method8512((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1443.field4638 == var1.field5069) {
            return -1;
        } else {
            return ((class65) var1.field5069).field454;
        }
    }

    @ObfuscatedName("mf.ae(II)I")
    public static int method5618(int arg0) {
        class65 var1 = (class65) field1442.method8512((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1443.field4638 == var1.field5068) {
            return -1;
        } else {
            return ((class65) var1.field5068).field454;
        }
    }
}
