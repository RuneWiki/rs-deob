import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class277 extends class97 {

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[B")
    public byte[] field4213;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field4212 = 0;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Ljg;")
    public static class241 field4214 = new class241(64);

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lnn;")
    public static class151 field4215 = new class151("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lwl;")
    public static class452 field4217 = new class452(60, -2);

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "[[[Ldc;")
    public static class13[][][] field4216;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBI)V")
    public static final void method1713(int arg0, byte arg1, int arg2) {
        int var3 = 50 % ((arg1 - 62) / 54);
        class287.field4375[arg2] = arg0;
        field4211++;
        class106 var4 = (class106) class456.field6773.method2302((long) arg2, 23576);
        if (var4 == null) {
            class106 var5 = new class106(class445.method2750(-27580) + 500L);
            class456.field6773.method2301(91, var5, (long) arg2);
        } else {
            var4.field1418 = class445.method2750(-27580) + 500L;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static void method1714(int arg0) {
        field4216 = null;
        field4217 = null;
        field4215 = null;
        if (arg0 == 13454) {
            field4214 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V")
    public static final void method1715(int arg0, boolean arg1) {
        int var2 = -81 / ((arg0 - 2) / 41);
        field4210++;
        class151.field2088 = arg1;
        if (!class151.field2088) {
            int var25 = class424.field6232.method2323(-99);
            boolean var26 = class424.field6232.method2343(255) == 1;
            int var27 = class424.field6232.method2328(-108);
            int var28 = class424.field6232.method2365(0);
            class465.method2868((byte) -127, var28);
            int var29 = (class44.field547 - class424.field6232.field5666) / 16;
            class333.field4969 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class333.field4969[var30][var34] = class424.field6232.method2354(255);
                }
            }
            class244.field3663 = new int[var29];
            class435.field6412 = new byte[var29][];
            class77.field1025 = new int[var29];
            class62.field789 = new int[var29];
            class161.field2243 = new int[var29];
            class351.field5207 = null;
            class154.field2122 = new byte[var29][];
            class432.field6343 = new byte[var29][];
            class37.field450 = new int[var29];
            class446.field6568 = new byte[var29][];
            class236.field3544 = null;
            int var31 = 0;
            for (int var32 = (var27 - (class115.field1522 >> 4)) / 8; var32 <= (((class115.field1522 >> 4) + var27) / 8); var32++) {
                for (int var33 = (var25 - (class198.field3004 >> 4)) / 8; var33 <= ((var25 + (class198.field3004 >> 4)) / 8); var33++) {
                    class161.field2243[var31] = (var32 << 8) + var33;
                    class244.field3663[var31] = class265.field4048.method836(-1, "m" + var32 + "_" + var33);
                    class77.field1025[var31] = class265.field4048.method836(-1, "l" + var32 + "_" + var33);
                    class37.field450[var31] = class265.field4048.method836(-1, "um" + var32 + "_" + var33);
                    class62.field789[var31] = class265.field4048.method836(-1, "ul" + var32 + "_" + var33);
                    var31++;
                }
            }
            class207.method1212(-5, var25, false, var26, var27);
            return;
        }
        boolean var3 = class424.field6232.method2365(0) == 1;
        int var4 = class424.field6232.method2323(-20);
        int var5 = class424.field6232.method2335(94);
        int var6 = class424.field6232.method2359((byte) -21);
        class465.method2868((byte) -128, var6);
        class424.field6232.method710(255);
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var22 = 0; var22 < (class115.field1522 >> 3); var22++) {
                for (int var23 = 0; var23 < class198.field3004 >> 3; var23++) {
                    int var24 = class424.field6232.method717(1, false);
                    if (var24 == 1) {
                        class310.field4666[var7][var22][var23] = class424.field6232.method717(26, false);
                    } else {
                        class310.field4666[var7][var22][var23] = -1;
                    }
                }
            }
        }
        class424.field6232.method709(-17701);
        int var8 = (class44.field547 - class424.field6232.field5666) / 16;
        class333.field4969 = new int[var8][4];
        for (int var9 = 0; var9 < var8; var9++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class333.field4969[var9][var21] = class424.field6232.method2354(255);
            }
        }
        class446.field6568 = new byte[var8][];
        class154.field2122 = new byte[var8][];
        class77.field1025 = new int[var8];
        class236.field3544 = null;
        class161.field2243 = new int[var8];
        class37.field450 = new int[var8];
        class432.field6343 = new byte[var8][];
        class435.field6412 = new byte[var8][];
        class62.field789 = new int[var8];
        class244.field3663 = new int[var8];
        class351.field5207 = null;
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < (class115.field1522 >> 3); var12++) {
                for (int var13 = 0; var13 < (class198.field3004 >> 3); var13++) {
                    int var14 = class310.field4666[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = (var14 & 0x3FFC) >> 3;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class161.field2243[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class161.field2243[var10] = var17;
                            int var19 = (var17 & 0xFF8F) >> 8;
                            int var20 = var17 & 0xFF;
                            class244.field3663[var10] = class265.field4048.method836(-1, "m" + var19 + "_" + var20);
                            class77.field1025[var10] = class265.field4048.method836(-1, "l" + var19 + "_" + var20);
                            class37.field450[var10] = class265.field4048.method836(-1, "um" + var19 + "_" + var20);
                            class62.field789[var10] = class265.field4048.method836(-1, "ul" + var19 + "_" + var20);
                            var10++;
                        }
                    }
                }
            }
        }
        class207.method1212(-5, var5, false, var3, var4);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
    public class277(byte[] arg0) {
        this.field4213 = arg0;
    }
}
