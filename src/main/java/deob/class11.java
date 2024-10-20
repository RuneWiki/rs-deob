package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("c")
public class class11 {

    @ObfuscatedName("c.n")
    public static final Map field170 = new HashMap();

    @ObfuscatedName("c.g")
    public static final class189 field171 = new class189(1024);

    @ObfuscatedName("c.a")
    public static final class191 field181 = new class191();

    @ObfuscatedName("c.m")
    public static int field172 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.n(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2846(int arg0, String arg1, String arg2) {
        method1862(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ck.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1862(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field170.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field170.put(arg0, var4);
        }
        class33 var5 = var4.method546(arg0, arg1, arg2, arg3);
        field171.method3450(var5, (long) var5.field757);
        field181.method3496(var5);
        client.field474 = client.field467;
    }

    @ObfuscatedName("an.a(II)I")
    public static int method828(int arg0) {
        class26 var1 = (class26) field170.get(arg0);
        return var1 == null ? 0 : var1.method547();
    }

    @ObfuscatedName("bz.m(I)V")
    public static void method1497() {
        field170.clear();
        field171.method3459();
        field181.method3500();
        field172 = 0;
    }

    @ObfuscatedName("bw.s(II)I")
    public static int method1424(int arg0) {
        class33 var1 = (class33) field171.method3449((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field181.field3003 == var1.field3007) {
            return -1;
        } else {
            return ((class33) var1.field3007).field757;
        }
    }

    @ObfuscatedName("aq.j(II)I")
    public static int method569(int arg0) {
        class33 var1 = (class33) field171.method3449((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field181.field3003 == var1.field3008) {
            return -1;
        } else {
            return ((class33) var1.field3008).field757;
        }
    }
}
