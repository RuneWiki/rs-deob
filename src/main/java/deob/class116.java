package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("eo")
public class class116 {

    @ObfuscatedName("eo.ac")
    public static final Map field1478 = new HashMap();

    @ObfuscatedName("eo.ae")
    public static final class523 field1476 = new class523(1024);

    @ObfuscatedName("eo.ag")
    public static final class415 field1477 = new class415();

    @ObfuscatedName("eo.am")
    public static int field1479 = 0;

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oj.ac(I)I")
    public static int method6701() {
        return ++field1479 - 1;
    }

    @ObfuscatedName("ho.ae(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method3755(int arg0, String arg1, String arg2) {
        method5096(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("kh.ag(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method5096(int arg0, String arg1, String arg2, String arg3) {
        class84 var4 = (class84) field1478.get(arg0);
        if (var4 == null) {
            var4 = new class84();
            field1478.put(arg0, var4);
        }
        class65 var5 = var4.method2293(arg0, arg1, arg2, arg3);
        field1476.method8663(var5, (long) var5.field470);
        field1477.method7157(var5);
        client.field699 = client.field710;
    }

    @ObfuscatedName("dh.am(IIB)Lct;")
    public static class65 method2411(int arg0, int arg1) {
        class84 var2 = (class84) field1478.get(arg0);
        return var2.method2294(arg1);
    }

    @ObfuscatedName("cq.ax(IB)Lct;")
    public static class65 method1180(int arg0) {
        return (class65) field1476.method8666((long) arg0);
    }

    @ObfuscatedName("hf.aq(IB)I")
    public static int method3465(int arg0) {
        class84 var1 = (class84) field1478.get(arg0);
        return var1 == null ? 0 : var1.method2295();
    }

    @ObfuscatedName("nt.af(B)V")
    public static void method6021() {
        field1478.clear();
        field1476.method8664();
        field1477.method7165();
        field1479 = 0;
    }

    @ObfuscatedName("cw.at(IB)I")
    public static int method1209(int arg0) {
        class65 var1 = (class65) field1476.method8666((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1477.field4689 == var1.field5117) {
            return -1;
        } else {
            return ((class65) var1.field5117).field470;
        }
    }

    @ObfuscatedName("go.au(IB)I")
    public static int method3365(int arg0) {
        class65 var1 = (class65) field1476.method8666((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1477.field4689 == var1.field5115) {
            return -1;
        } else {
            return ((class65) var1.field5115).field470;
        }
    }
}
