package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("e")
public class class12 {

    @ObfuscatedName("e.i")
    public static final Map field167 = new HashMap();

    @ObfuscatedName("e.v")
    public static final class198 field166 = new class198(1024);

    @ObfuscatedName("e.r")
    public static final class200 field168 = new class200();

    @ObfuscatedName("e.n")
    public static int field169 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.i(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method112(int arg0, String arg1, String arg2) {
        method2682(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ec.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2682(int arg0, String arg1, String arg2, String arg3) {
        class28 var4 = (class28) field167.get(arg0);
        if (var4 == null) {
            var4 = new class28();
            field167.put(arg0, var4);
        }
        class36 var5 = var4.method651(arg0, arg1, arg2, arg3);
        field166.method3513(var5, (long) var5.field789);
        field168.method3559(var5);
        client.field478 = client.field566;
    }

    @ObfuscatedName("o.r(I)V")
    public static void method567() {
        field167.clear();
        field166.method3514();
        field168.method3562();
        field169 = 0;
    }

    @ObfuscatedName("v.x(II)I")
    public static int method14(int arg0) {
        class36 var1 = (class36) field166.method3512((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field168.field3085 == var1.field3090) {
            return -1;
        } else {
            return ((class36) var1.field3090).field789;
        }
    }

    @ObfuscatedName("ap.q(I)Ljava/lang/String;")
    public static String method821() {
        String var0 = "";
        Iterator var1 = field166.iterator();
        while (var1.hasNext()) {
            class36 var2 = (class36) var1.next();
            var0 = var0 + var2.field788 + ':' + var2.field786 + '\n';
        }
        return var0;
    }
}
