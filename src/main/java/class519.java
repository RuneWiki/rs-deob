import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class519 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Z")
    public static boolean field7509 = false;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static final void method3130(int arg0) {
        field7511++;
        for (int var1 = arg0; var1 < class690.field9676.length; var1++) {
            for (int var2 = 0; var2 < class690.field9676[0].length; var2++) {
                for (int var3 = 0; var3 < class690.field9676[0][0].length; var3++) {
                    class690.field9676[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lr;IILpca;I)V")
    public static final void method3131(class167 arg0, int arg1, int arg2, class665 arg3, int arg4) {
        field7510++;
        if (arg4 != -26192) {
            method3130(-121);
        }
        class617 var5 = arg3.method3808(arg4 + 36684, arg0);
        if (var5 == null) {
            return;
        }
        arg0.method352(arg2, arg1, arg3.field9411 + arg2, arg1 - -arg3.field9282);
        if (class106.field1720 == 2 || class106.field1720 == 5 || class532.field7752 == null) {
            arg0.method310(-16777216, var5, arg2, arg1);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class126.field2062 == 4) {
            var9 = class664.field9238;
            var6 = 4096;
            var7 = (int) (-class37.field514) & 0x3FFF;
            var8 = class204.field3333;
        } else {
            var6 = 4096 - (class64.field820 * 16);
            var7 = (int) (-class37.field514) + class44.field616 & 0x3FFF;
            var8 = class567.field8141.field9705;
            var9 = class567.field8141.field9696;
        }
        int var10 = 208 - (class275.field4426 * 2 - (var9 / 128 + 48));
        int var11 = class417.field6374 * 4 + 48 - (var8 / 128) - (class417.field6374 - 104) * 2;
        class532.field7752.method3957((float) arg3.field9411 / 2.0F + (float) arg2, (float) arg3.field9282 / 2.0F + (float) arg1, (float) var10, (float) var11, var6, var7 << 2, var5, arg2, arg1);
        for (class160 var12 = (class160) class527.field7696.method3465((byte) -23); var12 != null; var12 = (class160) class527.field7696.method3469(arg4 + 26192)) {
            int var58 = var12.field2728;
            int var59 = (class26.field417.field8439[var58] >> 14 & 0x3FFF) - class612.field8702;
            int var60 = (class26.field417.field8439[var58] & 0x3FFF) - class626.field8855;
            int var61 = var59 * 4 + 2 - (var9 / 128);
            int var62 = var60 * 4 + 2 - (var8 / 128);
            class579.method3394(var61, arg1, 2, var5, var62, arg3, arg2, class26.field417.field8433[var58], arg0);
        }
        for (int var13 = 0; var13 < class532.field7744; var13++) {
            int var55 = class194.field3218[var13] * 4 + 2 - (var9 / 128);
            int var56 = class518.field7506[var13] * 4 + 2 - var8 / 128;
            class698 var57 = class213.field3537.method94(class41.field572[var13], (byte) -42);
            if (var57.field9826 != null) {
                var57 = var57.method3934(class539.field7869, 97);
                if (var57 == null || var57.field9848 == -1) {
                    continue;
                }
            }
            class579.method3394(var55, arg1, arg4 ^ 0xFFFF99B2, var5, var56, arg3, arg2, var57.field9848, arg0);
        }
        for (class138 var14 = (class138) class290.field4590.method1556(84); var14 != null; var14 = (class138) class290.field4590.method1559(74)) {
            int var50 = (int) (var14.field844 >> 28 & 0x3L);
            if (class416.field6365 == var50) {
                int var51 = (int) (var14.field844 & 0x3FFFL) - class612.field8702;
                int var52 = (int) (var14.field844 >> 14 & 0x3FFFL) - class626.field8855;
                int var53 = var51 * 4 + 2 - var9 / 128;
                int var54 = var52 * 4 + (2 - var8 / 128);
                class418.method2671(var5, var53, arg2, arg1, true, arg3, var54, class672.field9480[0]);
            }
        }
        for (int var15 = 0; var15 < class283.field4523; var15++) {
            class348 var45 = (class348) class592.field8395.method1558((long) class102.field1690[var15], (byte) -93);
            if (var45 != null) {
                class589 var46 = var45.field5577;
                if (var46.method3446(160) && class567.field8141.field9695 == var46.field9695) {
                    class705 var47 = var46.field8354;
                    if (var47 != null && var47.field9912 != null) {
                        var47 = var47.method3973(true, class539.field7869);
                    }
                    if (var47 != null && var47.field9947 && var47.field9981) {
                        int var48 = var46.field9696 / 128 - (var9 / 128);
                        int var49 = var46.field9705 / 128 - (var8 / 128);
                        if (var47.field9948 == -1) {
                            class418.method2671(var5, var48, arg2, arg1, true, arg3, var49, class672.field9480[1]);
                        } else {
                            class579.method3394(var48, arg1, 2, var5, var49, arg3, arg2, var47.field9948, arg0);
                        }
                    }
                }
            }
        }
        int var16 = class99.field1607;
        int[] var17 = class359.field5700;
        for (int var18 = 0; var18 < var16; var18++) {
            class304 var37 = class597.field8465[var17[var18]];
            if (var37 != null && var37.method2106(160) && !var37.field4760 && class567.field8141 != var37 && class567.field8141.field9695 == var37.field9695) {
                int var38 = var37.field9696 / 128 - var9 / 128;
                int var39 = var37.field9705 / 128 - var8 / 128;
                boolean var40 = false;
                for (int var41 = 0; var41 < class204.field3334; var41++) {
                    if (var37.field4792.equals(class527.field7700[var41]) && class185.field3113[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class307.field4836; var43++) {
                    if (var37.field4792.equals(class92.field1171[var43].field3588)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class567.field8141.field4744 != 0 && var37.field4744 != 0 && class567.field8141.field4744 == var37.field4744) {
                    var44 = true;
                }
                if (var37.field4758) {
                    class418.method2671(var5, var38, arg2, arg1, true, arg3, var39, class672.field9480[6]);
                } else if (var40) {
                    class418.method2671(var5, var38, arg2, arg1, true, arg3, var39, class672.field9480[3]);
                } else if (var42) {
                    class418.method2671(var5, var38, arg2, arg1, true, arg3, var39, class672.field9480[5]);
                } else if (var44) {
                    class418.method2671(var5, var38, arg2, arg1, true, arg3, var39, class672.field9480[4]);
                } else {
                    class418.method2671(var5, var38, arg2, arg1, true, arg3, var39, class672.field9480[2]);
                }
            }
        }
        class515[] var19 = class472.field6987;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class515 var23 = var19[var20];
            if (var23 != null && var23.field7483 != 0 && class562.field8084 % 20 < 10) {
                if (var23.field7483 == 1) {
                    class348 var24 = (class348) class592.field8395.method1558((long) var23.field7485, (byte) -93);
                    if (var24 != null) {
                        class589 var25 = var24.field5577;
                        int var26 = var25.field9696 / 128 - (var9 / 128);
                        int var27 = var25.field9705 / 128 - (var8 / 128);
                        class621.method3602(360000L, (byte) -115, arg3, var27, arg1, arg2, var26, var23.field7480, var5);
                    }
                }
                if (var23.field7483 == 2) {
                    int var28 = var23.field7492 / 128 - (var9 / 128);
                    int var29 = var23.field7488 / 128 - (var8 / 128);
                    long var30 = (long) (var23.field7484 << 7);
                    long var32 = var30 * var30;
                    class621.method3602(var32, (byte) 103, arg3, var29, arg1, arg2, var28, var23.field7480, var5);
                }
                if (var23.field7483 == 10 && var23.field7485 >= 0 && var23.field7485 < class597.field8465.length) {
                    class304 var34 = class597.field8465[var23.field7485];
                    if (var34 != null) {
                        int var35 = var34.field9696 / 128 - (var9 / 128);
                        int var36 = var34.field9705 / 128 - (var8 / 128);
                        class621.method3602(360000L, (byte) -119, arg3, var36, arg1, arg2, var35, var23.field7480, var5);
                    }
                }
            }
        }
        if (class126.field2062 == 4) {
            return;
        }
        if (class43.field599 != 0) {
            int var21 = class43.field599 * 4 + (class567.field8141.method1841(20744) * 2) + 2 - (var9 / 128) - 2;
            int var22 = class473.field7005 * 4 + ((class567.field8141.method1841(20744) * 2) - (var8 / 128)) + 2 - 2;
            class418.method2671(var5, var21, arg2, arg1, true, arg3, var22, class706.field9991[class353.field5615 ? 1 : 0]);
        }
        if (!class567.field8141.field4760) {
            arg0.method1355(arg1 + (arg3.field9282 / 2) - 1, arg2 + -1 - -(arg3.field9411 / 2), 3, 3, -1, arg4 ^ -26191);
            return;
        }
    }
}
