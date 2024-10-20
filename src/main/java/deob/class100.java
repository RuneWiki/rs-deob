package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cd")
public class class100 {

    @ObfuscatedName("cd.c")
    public static final Map field1334 = new HashMap();

    @ObfuscatedName("cd.p")
    public static final class421 field1333 = new class421(1024);

    @ObfuscatedName("cd.f")
    public static final class341 field1335 = new class341();

    @ObfuscatedName("cd.n")
    public static int field1336 = 0;

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1932(int arg0, String arg1, String arg2) {
        method2791(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dt.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2791(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1334.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1334.put(arg0, var4);
        }
        class58 var5 = var4.method2042(arg0, arg1, arg2, arg3);
        field1333.method6918(var5, (long) var5.field470);
        field1335.method5789(var5);
        client.field700 = client.field691;
    }

    @ObfuscatedName("p.f(IIB)Lbj;")
    public static class58 method15(int arg0, int arg1) {
        class74 var2 = (class74) field1334.get(arg0);
        return var2.method2043(arg1);
    }

    @ObfuscatedName("cv.n(II)Lbj;")
    public static class58 method2141(int arg0) {
        return (class58) field1333.method6917((long) arg0);
    }

    @ObfuscatedName("cz.w(I)V")
    public static void method2379() {
        Iterator var0 = field1333.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1081();
        }
    }

    @ObfuscatedName("kb.s(II)I")
    public static int method5120(int arg0) {
        class58 var1 = (class58) field1333.method6917((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1335.field4180 == var1.field4499) {
            return -1;
        } else {
            return ((class58) var1.field4499).field470;
        }
    }

    @ObfuscatedName("mb.q(IB)I")
    public static int method6111(int arg0) {
        class58 var1 = (class58) field1333.method6917((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1335.field4180 == var1.field4498) {
            return -1;
        } else {
            return ((class58) var1.field4498).field470;
        }
    }
}
