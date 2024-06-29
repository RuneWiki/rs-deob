import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class543 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[I")
    public static int[] field7049 = new int[1];

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lcs;")
    public static class566 field7052;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field7051;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILtc;Loa;II)V", line = 3)
    public static final void method2880(int arg0, class477 arg1, class43 arg2, int arg3, int arg4) {
        field7050++;
        class619 var5 = arg1.method2647(false, arg2);
        if (var5 == null) {
            return;
        }
        if (arg3 != -10421) {
            field7051 = null;
        }
        arg2.method376(arg4, arg0, arg1.field6372 + arg4, arg1.field6224 + arg0);
        if (class323.field4195 == 2 || class323.field4195 == 5 || class667.field9255 == null) {
            arg2.method357(-16777216, var5, arg4, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class704.field9810 == 4) {
            var8 = class425.field5518;
            var9 = class509.field6669;
            var6 = 4096;
            var7 = (int) (-class141.field1859) & 0x3FFF;
        } else {
            var6 = 4096 - (class279.field3653 * 16);
            var7 = (int) (-class141.field1859) + class7.field56 & 0x3FFF;
            var8 = class233.field3130.field506;
            var9 = class233.field3130.field503;
        }
        int var10 = var8 / 128 + 48 + 208 - (class611.field8258 * 2);
        int var11 = 48 - ((class656.field9155 - 104) * 2 - (class656.field9155 * 4)) - (var9 / 128);
        class667.field9255.method2753((float) arg1.field6372 / 2.0F + (float) arg4, (float) arg1.field6224 / 2.0F + (float) arg0, (float) var10, (float) var11, var6, var7 << 2, var5, arg4, arg0);
        for (class195 var12 = (class195) class223.field2911.method2090(true); var12 != null; var12 = (class195) class223.field2911.method2088(arg3 ^ 0x2823)) {
            int var58 = var12.field2546;
            int var59 = ((class155.field1966.field9165[var58] & 0xFFFE7A2) >> 14) - class100.field1326;
            int var60 = (class155.field1966.field9165[var58] & 0x3FFF) - class186.field2376;
            int var61 = var59 * 4 + 2 - var8 / 128;
            int var62 = var60 * 4 + 2 - (var9 / 128);
            class190.method1247(var61, arg0, arg3 ^ 0xFFFFD74A, arg1, var62, arg2, class155.field1966.field9162[var58], arg4, var5);
        }
        for (int var13 = 0; var13 < class542.field7042; var13++) {
            int var55 = class72.field981[var13] * 4 - (var8 / 128 - 2);
            int var56 = class559.field7302[var13] * 4 + 2 - (var9 / 128);
            class698 var57 = class348.field4436.method1900(92, class696.field9530[var13]);
            if (var57.field9630 != null) {
                var57 = var57.method3815(65535, class397.field5054);
                if (var57 == null || var57.field9681 == -1) {
                    continue;
                }
            }
            class190.method1247(var55, arg0, 1, arg1, var56, arg2, var57.field9681, arg4, var5);
        }
        for (class37 var14 = (class37) class197.field2589.method42((byte) 105); var14 != null; var14 = (class37) class197.field2589.method40(false)) {
            int var50 = (int) (var14.field5499 >> 28 & 0x3L);
            if (class165.field2055 == var50) {
                int var51 = (int) (var14.field5499 & 0x3FFFL) - class100.field1326;
                int var52 = (int) (var14.field5499 >> 14 & 0x3FFFL) - class186.field2376;
                int var53 = var51 * 4 + 2 - (var8 / 128);
                int var54 = var52 * 4 + 2 - (var9 / 128);
                class60.method508(class49.field687[0], arg0, var5, var54, arg1, var53, arg4, -3468);
            }
        }
        for (int var15 = 0; var15 < class248.field3351; var15++) {
            class234 var45 = (class234) class505.field6640.method39((long) class40.field558[var15], arg3 + 42171);
            if (var45 != null) {
                class532 var46 = var45.field3131;
                if (var46.method2829((byte) -57) && class233.field3130.field508 == var46.field508) {
                    class699 var47 = var46.field6914;
                    if (var47 != null && var47.field9714 != null) {
                        var47 = var47.method3823(class397.field5054, arg3 ^ 0x5789);
                    }
                    if (var47 != null && var47.field9708 && var47.field9685) {
                        int var48 = var46.field506 / 128 - var8 / 128;
                        int var49 = var46.field503 / 128 - (var9 / 128);
                        if (var47.field9734 == -1) {
                            class60.method508(class49.field687[1], arg0, var5, var49, arg1, var48, arg4, -3468);
                        } else {
                            class190.method1247(var48, arg0, 1, arg1, var49, arg2, var47.field9734, arg4, var5);
                        }
                    }
                }
            }
        }
        int var16 = class260.field3508;
        int[] var17 = class135.field1779;
        for (int var18 = 0; var18 < var16; var18++) {
            class193 var37 = class592.field8019[var17[var18]];
            if (var37 != null && var37.method1272((byte) 88) && class233.field3130 != var37 && class233.field3130.field508 == var37.field508) {
                int var38 = var37.field506 / 128 - (var8 / 128);
                int var39 = var37.field503 / 128 - (var9 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class665.field9225; var41++) {
                    if (var37.field2492.equals(class405.field5160[var41]) && class565.field7387[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class76.field1038; var43++) {
                    if (var37.field2492.equals(class265.field3540[var43].field9052)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class233.field3130.field2484 != 0 && var37.field2484 != 0 && class233.field3130.field2484 == var37.field2484) {
                    var44 = true;
                }
                if (var37.field2500) {
                    class60.method508(class49.field687[6], arg0, var5, var39, arg1, var38, arg4, -3468);
                } else if (var40) {
                    class60.method508(class49.field687[3], arg0, var5, var39, arg1, var38, arg4, -3468);
                } else if (var42) {
                    class60.method508(class49.field687[5], arg0, var5, var39, arg1, var38, arg4, -3468);
                } else if (var44) {
                    class60.method508(class49.field687[4], arg0, var5, var39, arg1, var38, arg4, arg3 ^ 0x253F);
                } else {
                    class60.method508(class49.field687[2], arg0, var5, var39, arg1, var38, arg4, -3468);
                }
            }
        }
        class514[] var19 = class434.field5591;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class514 var23 = var19[var20];
            if (var23 != null && var23.field6726 != 0 && class424.field5503 % 20 < 10) {
                if (var23.field6726 == 1) {
                    class234 var24 = (class234) class505.field6640.method39((long) var23.field6730, arg3 + 42171);
                    if (var24 != null) {
                        class532 var25 = var24.field3131;
                        int var26 = var25.field506 / 128 - var8 / 128;
                        int var27 = var25.field503 / 128 - var9 / 128;
                        class656.method3612(var23.field6732, arg3 + 10295, 360000L, arg4, var27, arg0, var26, arg1, var5);
                    }
                }
                if (var23.field6726 == 2) {
                    int var28 = var23.field6727 / 128 - (var8 / 128);
                    int var29 = var23.field6731 / 128 - (var9 / 128);
                    long var30 = (long) (var23.field6733 << 7);
                    long var32 = var30 * var30;
                    class656.method3612(var23.field6732, -88, var32, arg4, var29, arg0, var28, arg1, var5);
                }
                if (var23.field6726 == 10 && var23.field6730 >= 0 && var23.field6730 < class592.field8019.length) {
                    class193 var34 = class592.field8019[var23.field6730];
                    if (var34 != null) {
                        int var35 = var34.field506 / 128 - (var8 / 128);
                        int var36 = var34.field503 / 128 - (var9 / 128);
                        class656.method3612(var23.field6732, -99, 360000L, arg4, var36, arg0, var35, arg1, var5);
                    }
                }
            }
        }
        if (class704.field9810 == 4) {
            return;
        }
        if (class199.field2598 != 0) {
            int var21 = class199.field2598 * 4 + class233.field3130.method1265(98) * 2 + 2 - (var8 / 128) - 2;
            int var22 = class247.field3310 * 4 + (class233.field3130.method1265(107) * 2 - 2) + 2 - (var9 / 128);
            class60.method508(class3.field25[class49.field689 ? 1 : 0], arg0, var5, var22, arg1, var21, arg4, -3468);
        }
        arg2.method400(-1, arg1.field6372 / 2 + (arg4 - 1), 3, (byte) 61, 3, arg1.field6224 / 2 + arg0 - 1);
        return;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZII)V", line = 317)
    public static final void method2881(boolean arg0, int arg1, int arg2) {
        if (arg2 != 128) {
            method2880(-18, null, null, -108, -29);
        }
        field7048++;
        class263 var3 = class265.method1643(false, arg0, arg1);
        if (var3 != null) {
            var3.method2438((byte) 123);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 336)
    public static void method2882(byte arg0) {
        field7052 = null;
        field7049 = null;
        field7051 = null;
        int var1 = 57 / ((53 - arg0) / 35);
    }
}
