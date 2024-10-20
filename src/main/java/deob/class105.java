package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eq")
public class class105 {

    @ObfuscatedName("eq.f")
    public static CRC32 field1426 = new CRC32();

    @ObfuscatedName("eq.g")
    public static int field1434 = 0;

    @ObfuscatedName("eq.d")
    public static class18 field1433 = new class18();

    @ObfuscatedName("eq.e")
    public static class28 field1438 = new class28(8);

    @ObfuscatedName("eq.c")
    public static int field1427 = 0;

    @ObfuscatedName("eq.a")
    public static int field1440 = 0;

    @ObfuscatedName("eq.o")
    public static int field1442 = 0;

    @ObfuscatedName("eq.l")
    public static int field1445 = 0;

    @ObfuscatedName("eq.m")
    public static int field1429 = 0;

    @ObfuscatedName("eq.j")
    public static class3 field1446 = new class3(4096);

    @ObfuscatedName("eq.i")
    public static class3 field1428 = new class3(4096);

    @ObfuscatedName("eq.w")
    public static byte field1444 = 0;

    @ObfuscatedName("eq.t")
    public static class83[] field1439 = new class83[256];

    @ObfuscatedName("eq.r")
    public static int field1436 = 0;

    @ObfuscatedName("eq.z")
    public static class3 field1432 = new class3(32);

    @ObfuscatedName("eq.y")
    public static class3 field1435 = new class3(4096);

    @ObfuscatedName("eq.x")
    public static int field1431 = 0;

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.m(ZZB)I")
    public static int method1033(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field1431 + field1429;
        }
        if (arg1) {
            var2 += field1440 + field1434;
        }
        return var2;
    }

    @ObfuscatedName("l.v(ZI)V")
    public static void method1088(boolean arg0) {
        if (Statics.field1443 == null) {
            return;
        }
        try {
            class28 var1 = new class28(4);
            var1.method443(arg0 ? 2 : 3);
            var1.method301(0);
            Statics.field1443.method2153(var1.field306, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field1443.method2148();
            } catch (Exception var4) {
            }
            field1445++;
            Statics.field1443 = null;
        }
    }

    @ObfuscatedName("br.i(III)V")
    public static void method2051(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class79 var4 = (class79) field1446.method8(var2);
        if (var4 != null) {
            field1433.method172(var4);
        }
    }

    @ObfuscatedName("aj.b(Lef;IIIBZI)V")
    public static void method3166(class83 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class79 var8 = (class79) field1428.method8(var6);
        if (var8 != null) {
            return;
        }
        class79 var9 = (class79) field1432.method8(var6);
        if (var9 != null) {
            return;
        }
        class79 var10 = (class79) field1446.method8(var6);
        if (var10 == null) {
            if (!arg5) {
                class79 var11 = (class79) field1435.method8(var6);
                if (var11 != null) {
                    return;
                }
            }
            class79 var12 = new class79();
            var12.field1110 = arg0;
            var12.field1107 = arg3;
            var12.field1109 = arg4;
            if (arg5) {
                field1428.method9(var12, var6);
                field1429++;
            } else {
                field1433.method175(var12);
                field1446.method9(var12, var6);
                field1434++;
            }
        } else if (arg5) {
            var10.method49();
            field1428.method9(var10, var6);
            field1434--;
            field1429++;
        }
    }

    @ObfuscatedName("ac.c(Lef;II)V")
    public static void method3261(class83 arg0, int arg1) {
        if (Statics.field1441 == null) {
            method3166((class83) null, 255, 255, 0, (byte) 0, true);
            field1439[arg1] = arg0;
        } else {
            Statics.field1441.field303 = arg1 * 8 + 5;
            int var2 = Statics.field1441.method504();
            int var3 = Statics.field1441.method504();
            arg0.method1230(var2, var3);
        }
    }
}
