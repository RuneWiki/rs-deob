import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class316 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[J")
    public static long[] field4313 = new long[100];

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lkn;")
    public static class442 field4314 = new class442("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method2047(boolean arg0, int arg1) {
        field4316++;
        if (arg1 == 128 && class128.field1804 != arg0) {
            class128.field1804 = arg0;
            class337.method2155((byte) 82);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 22)
    public static final void method2048(int arg0, int arg1, int arg2) {
        if (arg1 > 97) {
            field4318++;
            class192.field2649 = arg2 - class354.field4858;
            class277.field3854 = arg0 - class354.field4843;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZLms;I)V", line = 35)
    public static final void method2049(int arg0, boolean arg1, class453 arg2, int arg3) {
        class87.field1222 = arg3;
        class338.field4647 = arg0;
        field4315++;
        if (!arg1) {
            class188.field2600 = arg2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 55)
    public static void method2050(int arg0) {
        if (arg0 != 128) {
            field4313 = null;
        }
        field4313 = null;
        field4314 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZIIZIIII)V", line = 66)
    public static final void method2051(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4317++;
        if (!arg3 && class218.field3021 == arg2 && field4320 == arg6 && class125.field1760 == arg7 || class51.method428(-1)) {
            return;
        }
        class125.field1760 = arg7;
        class218.field3021 = arg2;
        field4320 = arg6;
        if (class51.method428(-1)) {
            class125.field1760 = 0;
        }
        if (arg0) {
            class139.method958(28, false);
        } else {
            class139.method958(25, false);
        }
        class427.method2692(class159.field2234, 60, true, class80.field1149.method2763(96, class210.field2935));
        int var8 = class212.field2968;
        class212.field2968 = (class218.field3021 - (class211.field2954 >> 4)) * 8;
        int var9 = class447.field6269;
        class447.field6269 = (field4320 - (class290.field4061 >> 4)) * 8;
        class388.field5576 = class354.method2268(class218.field3021 * 8, field4320 * 8);
        class282.field3952 = null;
        int var10 = class212.field2968 - var8;
        int var11 = class447.field6269 - var9;
        if (arg0) {
            class125.field1758 = 0;
            int var12 = class211.field2954 * 128 - 128;
            int var13 = class290.field4061 * 128 - 128;
            for (int var14 = 0; var14 < 32768; var14++) {
                class198 var15 = class98.field1358[var14];
                if (var15 != null) {
                    var15.field6262 -= var10 * 128;
                    var15.field6266 -= var11 * 128;
                    if (var15.field6262 >= 0 && var15.field6262 <= var12 && var15.field6266 >= 0 && var15.field6266 <= var13) {
                        boolean var16 = true;
                        for (int var17 = 0; var17 < 10; var17++) {
                            var15.field5326[var17] -= var10;
                            var15.field5332[var17] -= var11;
                            if (var15.field5326[var17] < 0 || class211.field2954 <= var15.field5326[var17] || var15.field5332[var17] < 0 || var15.field5332[var17] >= class290.field4061) {
                                var16 = false;
                            }
                        }
                        if (var16) {
                            class135.field1967[class125.field1758++] = var14;
                        } else {
                            class98.field1358[var14].method1290((byte) 114, (class327) null);
                            class98.field1358[var14] = null;
                        }
                    } else {
                        class98.field1358[var14].method1290((byte) 114, (class327) null);
                        class98.field1358[var14] = null;
                    }
                }
            }
        } else {
            for (int var18 = 0; var18 < 32768; var18++) {
                class198 var24 = class98.field1358[var18];
                if (var24 != null) {
                    for (int var25 = 0; var25 < 10; var25++) {
                        var24.field5326[var25] -= var10;
                        var24.field5332[var25] -= var11;
                    }
                    var24.field6266 -= var11 * 128;
                    var24.field6262 -= var10 * 128;
                }
            }
        }
        int var19 = 9 % ((arg4 + 22) / 40);
        for (int var20 = 0; var20 < 2048; var20++) {
            class134 var22 = class381.field5447[var20];
            if (var22 != null) {
                for (int var23 = 0; var23 < 10; var23++) {
                    var22.field5326[var23] -= var10;
                    var22.field5332[var23] -= var11;
                }
                var22.field6266 -= var11 * 128;
                var22.field6262 -= var10 * 128;
            }
        }
        class142.field2034 = arg7;
        class412.field5841.method930(arg1, false, arg5, -76, class142.field2034);
        class164.method1082(var11, 90, var10);
        for (class380 var21 = (class380) class24.field414.method646(48); var21 != null; var21 = (class380) class24.field414.method641(false)) {
            var21.field5422 -= var10;
            var21.field5419 -= var11;
            if (var21.field5422 < 0 || var21.field5419 < 0 || class211.field2954 <= var21.field5422 || var21.field5419 >= class290.field4061) {
                var21.method2467((byte) -120);
            }
        }
        class108.field1556 = 0;
        if (class50.field697 != 0) {
            class50.field697 -= var10;
            class251.field3547 -= var11;
        }
        if (arg0) {
            class197.field2711 -= var11;
            class106.field1447 -= var10 * 128;
            class389.field5585 -= var10;
            class89.field1239 -= var11;
            class94.field1302 -= var10;
            class20.field376 -= var11 * 128;
            if (Math.abs(var10) > class211.field2954 || Math.abs(var11) > class290.field4061) {
                class9.method146(-22904);
            }
        } else if (class128.field1807 == 4) {
            class51.field702 -= var10 * 128;
            class76.field1100 -= var11 * 128;
            class67.field999 -= var10 * 128;
            class447.field6265 -= var11 * 128;
        } else {
            class128.field1807 = 1;
        }
        class126.method859(false);
        class247.method1666((byte) -123);
        class59.field802.method644(false);
        class243.field3450.method644(false);
        class62.field855.method1011((byte) 35);
        class338.method2163(0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lmf;I)Lmf;")
    public abstract class240 method2052(class240 arg0, int arg1);
}
