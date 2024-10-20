package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("q")
public class class12 {

    @ObfuscatedName("q.e")
    public static final Map field192 = new HashMap();

    @ObfuscatedName("q.l")
    public static final class202 field189 = new class202(1024);

    @ObfuscatedName("q.c")
    public static final class204 field185 = new class204();

    @ObfuscatedName("q.h")
    public static int field186 = 0;

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.e(B)I")
    public static int method3335() {
        return ++field186 - 1;
    }

    @ObfuscatedName("s.l(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method577(int arg0, String arg1, String arg2) {
        method1624(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ck.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1624(int arg0, String arg1, String arg2, String arg3) {
        class30 var4 = (class30) field192.get(arg0);
        if (var4 == null) {
            var4 = new class30();
            field192.put(arg0, var4);
        }
        class38 var5 = var4.method640(arg0, arg1, arg2, arg3);
        field189.method3638(var5, (long) var5.field834);
        field185.method3682(var5);
        client.field309 = client.field507;
    }

    @ObfuscatedName("ci.h(II)I")
    public static int method2057(int arg0) {
        class30 var1 = (class30) field192.get(arg0);
        return var1 == null ? 0 : var1.method645();
    }

    @ObfuscatedName("m.r(I)V")
    public static void method529() {
        field192.clear();
        field189.method3639();
        field185.method3681();
        field186 = 0;
    }

    @ObfuscatedName("fd.a(IB)I")
    public static int method3052(int arg0) {
        class38 var1 = (class38) field189.method3637((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field185.field3147 == var1.field3152) {
            return -1;
        } else {
            return ((class38) var1.field3152).field834;
        }
    }

    @ObfuscatedName("ai.b(IB)I")
    public static int method882(int arg0) {
        class38 var1 = (class38) field189.method3637((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field185.field3147 == var1.field3153) {
            return -1;
        } else {
            return ((class38) var1.field3153).field834;
        }
    }
}
