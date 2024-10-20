package deob;

@ObfuscatedName("es")
public class class101 {

    @ObfuscatedName("es.m")
    public static int field1381 = 0;

    public class101() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.b(Lel;IIIZS)V")
    public static void method1488(class87 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1381 = 1;
        Statics.field1384 = arg0;
        Statics.field1385 = arg1;
        Statics.field1394 = arg2;
        Statics.field1801 = arg3;
        Statics.field2356 = arg4;
        Statics.field1388 = 10000;
    }

    @ObfuscatedName("dn.z(B)Z")
    public static boolean method864() {
        try {
            if (field1381 == 2) {
                if (Statics.field1389 == null) {
                    Statics.field1389 = class34.method576(Statics.field1384, Statics.field1385, Statics.field1394);
                    if (Statics.field1389 == null) {
                        return false;
                    }
                }
                if (Statics.field1390 == null) {
                    Statics.field1390 = new class112(Statics.field294, Statics.field1382);
                }
                if (Statics.field1383.method583(Statics.field1389, Statics.field1387, Statics.field1390, 22050)) {
                    Statics.field1383.method584();
                    Statics.field1383.method581(Statics.field1801);
                    Statics.field1383.method586(Statics.field1389, Statics.field2356);
                    field1381 = 0;
                    Statics.field1389 = null;
                    Statics.field1390 = null;
                    Statics.field1384 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1383.method587();
            field1381 = 0;
            Statics.field1389 = null;
            Statics.field1390 = null;
            Statics.field1384 = null;
        }
        return false;
    }

    @ObfuscatedName("ef.v(Lel;Lel;Lel;Lec;I)Z")
    public static boolean method1259(class87 arg0, class87 arg1, class87 arg2, class35 arg3) {
        Statics.field1387 = arg0;
        Statics.field1382 = arg1;
        Statics.field294 = arg2;
        Statics.field1383 = arg3;
        return true;
    }

    @ObfuscatedName("eo.c(Lel;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1399(class87 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method1310(arg1);
        int var6 = arg0.method1311(var5, arg2);
        method1488(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bk.i(II)V")
    public static void method2166(int arg0) {
        field1381 = 1;
        Statics.field1384 = null;
        Statics.field1385 = -1;
        Statics.field1394 = -1;
        Statics.field1801 = 0;
        Statics.field2356 = false;
        Statics.field1388 = arg0;
    }

    @ObfuscatedName("an.m(I)Z")
    public static boolean method3251() {
        return field1381 == 0 ? Statics.field1383.method641() : true;
    }
}
