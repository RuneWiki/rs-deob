package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ea")
public class class111 {

    @ObfuscatedName("ea.au")
    public static final Map field1419 = new HashMap();

    @ObfuscatedName("ea.ae")
    public static final class488 field1420 = new class488(1024);

    @ObfuscatedName("ea.ao")
    public static final class383 field1421 = new class383();

    @ObfuscatedName("ea.at")
    public static int field1422 = 0;

    public class111() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.au(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method683(int arg0, String arg1, String arg2) {
        method7089(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("qe.ae(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method7089(int arg0, String arg1, String arg2, String arg3) {
        class81 var4 = (class81) field1419.get(arg0);
        if (var4 == null) {
            var4 = new class81();
            field1419.put(arg0, var4);
        }
        class65 var5 = var4.method2097(arg0, arg1, arg2, arg3);
        field1420.method8016(var5, (long) var5.field503);
        field1421.method6532(var5);
        client.field732 = client.field529;
    }

    @ObfuscatedName("ma.ao(IIB)Lco;")
    public static class65 method6024(int arg0, int arg1) {
        class81 var2 = (class81) field1419.get(arg0);
        return var2.method2098(arg1);
    }

    @ObfuscatedName("bs.at(II)Lco;")
    public static class65 method483(int arg0) {
        return (class65) field1420.method8008((long) arg0);
    }

    @ObfuscatedName("he.ac(IB)I")
    public static int method3399(int arg0) {
        class81 var1 = (class81) field1419.get(arg0);
        return var1 == null ? 0 : var1.method2096();
    }

    @ObfuscatedName("di.ai(I)V")
    public static void method2108() {
        field1419.clear();
        field1420.method8010();
        field1421.method6557();
        field1422 = 0;
    }

    @ObfuscatedName("fu.az(IB)I")
    public static int method2959(int arg0) {
        class65 var1 = (class65) field1420.method8008((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1421.field4422 == var1.field4808) {
            return -1;
        } else {
            return ((class65) var1.field4808).field503;
        }
    }

    @ObfuscatedName("lw.ap(II)I")
    public static int method5187(int arg0) {
        class65 var1 = (class65) field1420.method8008((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1421.field4422 == var1.field4807) {
            return -1;
        } else {
            return ((class65) var1.field4807).field503;
        }
    }
}
