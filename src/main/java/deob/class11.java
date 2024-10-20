package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("v")
public class class11 {

    @ObfuscatedName("v.t")
    public static final Map field163 = new HashMap();

    @ObfuscatedName("v.b")
    public static final class189 field156 = new class189(1024);

    @ObfuscatedName("v.p")
    public static final class191 field162 = new class191();

    @ObfuscatedName("v.e")
    public static int field158 = 0;

    public class11() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fp.t(B)I")
    public static int method3321() {
        return ++field158 - 1;
    }

    @ObfuscatedName("ck.b(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method1835(int arg0, String arg1, String arg2) {
        method2757(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ez.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2757(int arg0, String arg1, String arg2, String arg3) {
        class26 var4 = (class26) field163.get(arg0);
        if (var4 == null) {
            var4 = new class26();
            field163.put(arg0, var4);
        }
        class33 var5 = var4.method595(arg0, arg1, arg2, arg3);
        field156.method3396(var5, (long) var5.field712);
        field162.method3447(var5);
        client.field442 = client.field435;
    }

    @ObfuscatedName("s.e(III)Las;")
    public static class33 method606(int arg0, int arg1) {
        class26 var2 = (class26) field163.get(arg0);
        return var2.method596(arg1);
    }

    @ObfuscatedName("af.i(II)I")
    public static int method979(int arg0) {
        class26 var1 = (class26) field163.get(arg0);
        return var1 == null ? 0 : var1.method594();
    }

    @ObfuscatedName("cv.o(B)V")
    public static void method1836() {
        field163.clear();
        field156.method3404();
        field162.method3450();
        field158 = 0;
    }

    @ObfuscatedName("j.f(I)Ljava/lang/String;")
    public static String method102() {
        String var0 = "";
        Iterator var1 = field156.iterator();
        while (var1.hasNext()) {
            class33 var2 = (class33) var1.next();
            var0 = var0 + var2.field715 + ':' + var2.field717 + '\n';
        }
        return var0;
    }
}
