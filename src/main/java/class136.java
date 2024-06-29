import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class136 extends class337 {

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "Z")
    public boolean field1805 = true;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "Z")
    public boolean field1803 = false;

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
    public static int field1797 = -1;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "Lrn;")
    public static class633 field1794 = new class633(35, 4);

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!baa", name = "y", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!baa", name = "A", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!baa", name = "B", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!baa", name = "t", descriptor = "Lmea;")
    public class702 field1801;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public static void method787(byte arg0) {
        field1794 = null;
        int var1 = -126 / ((3 - arg0) / 44);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILha;ILuaa;B)V")
    public static final void method788(int arg0, class570 arg1, int arg2, class391 arg3, byte arg4) {
        if (arg4 != -27) {
            field1802 = -86;
        }
        field1798++;
        class596 var5 = arg3.method2251(true, arg1);
        if (var5 == null) {
            return;
        }
        arg1.method915(arg2, arg0, arg2 + arg3.field5117, arg3.field5031 + arg0);
        if (class380.field4658 == 2 || class380.field4658 == 5 || class737.field9982 == null) {
            arg1.method940(-16777216, var5, arg2, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class507.field6476 == 4) {
            var6 = 4096;
            var7 = class12.field125;
            var8 = (int) (-class698.field9250) & 0x3FFF;
            var9 = class433.field5674;
        } else {
            var9 = class422.field5564.field2900;
            var6 = 4096 - (class718.field9432 * 16);
            var7 = class422.field5564.field2896;
            var8 = (int) (-class698.field9250) + class757.field10329 & 0x3FFF;
        }
        int var10 = (var7 / 128) + 48 - ((class240.field3280 - 104) * 2);
        int var11 = class276.field3602 * 4 + 208 + 48 - (class276.field3602 * 2) - (var9 / 128);
        class737.field9982.method4207((float) arg3.field5117 / 2.0F + (float) arg2, (float) arg3.field5031 / 2.0F + (float) arg0, (float) var10, (float) var11, var6, var8 << 2, var5, arg2, arg0);
        for (class405 var12 = (class405) class33.field363.method3591(0); var12 != null; var12 = (class405) class33.field363.method3600((byte) 100)) {
            int var58 = var12.field5378;
            int var59 = (class17.field159.field7690[var58] >> 14 & 0x3FFF) - class714.field9407;
            int var60 = (class17.field159.field7690[var58] & 0x3FFF) - class240.field3293;
            int var61 = var59 * 4 + 2 - (var7 / 128);
            int var62 = var60 * 4 + 2 - (var9 / 128);
            class472.method2661(arg3, var5, var61, var62, arg0, arg1, class17.field159.field7688[var58], 63, arg2);
        }
        for (int var13 = 0; var13 < class223.field3033; var13++) {
            int var55 = class323.field3998[var13] * 4 + 2 - (var7 / 128);
            int var56 = class645.field8250[var13] * 4 + 2 - (var9 / 128);
            class773 var57 = class390.field4983.method4292(class382.field4783[var13], (byte) -74);
            if (var57.field10536 != null) {
                var57 = var57.method4213(class381.field4705, -100);
                if (var57 == null || var57.field10443 == -1) {
                    continue;
                }
            }
            class472.method2661(arg3, var5, var55, var56, arg0, arg1, var57.field10443, 60, arg2);
        }
        for (class89 var14 = (class89) class407.field5401.method2610((byte) -35); var14 != null; var14 = (class89) class407.field5401.method2620(0)) {
            int var50 = (int) (var14.field4108 >> 28 & 0x3L);
            if (class621.field7861 == var50) {
                int var51 = (int) (var14.field4108 & 0x3FFFL) - class714.field9407;
                int var52 = (int) (var14.field4108 >> 14 & 0x3FFFL) - class240.field3293;
                int var53 = var51 * 4 + 2 - (var7 / 128);
                int var54 = var52 * 4 + 2 - (var9 / 128);
                class510.method2817(var5, arg3, class207.field2858[0], arg2, (byte) 7, var53, var54, arg0);
            }
        }
        for (int var15 = 0; var15 < class349.field4271; var15++) {
            class232 var45 = (class232) class444.field5811.method2616((long) class88.field1224[var15], (byte) -84);
            if (var45 != null) {
                class727 var46 = var45.field3125;
                if (var46.method3892((byte) -106) && class422.field5564.field2895 == var46.field2895) {
                    class240 var47 = var46.field9545;
                    if (var47 != null && var47.field3289 != null) {
                        var47 = var47.method1585((byte) -100, class381.field4705);
                    }
                    if (var47 != null && var47.field3302 && var47.field3291) {
                        int var48 = var46.field2896 / 128 - (var7 / 128);
                        int var49 = var46.field2900 / 128 - (var9 / 128);
                        if (var47.field3295 == -1) {
                            class510.method2817(var5, arg3, class207.field2858[1], arg2, (byte) -92, var48, var49, arg0);
                        } else {
                            class472.method2661(arg3, var5, var48, var49, arg0, arg1, var47.field3295, 57, arg2);
                        }
                    }
                }
            }
        }
        int var16 = class20.field189;
        int[] var17 = class503.field6451;
        for (int var18 = 0; var18 < var16; var18++) {
            class33 var37 = class263.field3508[var17[var18]];
            if (var37 != null && var37.method181((byte) -106) && !var37.field374 && class422.field5564 != var37 && class422.field5564.field2895 == var37.field2895) {
                int var38 = var37.field2896 / 128 - var7 / 128;
                int var39 = var37.field2900 / 128 - (var9 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class703.field9297; var41++) {
                    if (var37.field375.equals(class176.field2319[var41]) && class459.field5995[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class566.field7170; var43++) {
                    if (var37.field375.equals(class638.field8105[var43].field1829)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class422.field5564.field337 != 0 && var37.field337 != 0 && class422.field5564.field337 == var37.field337) {
                    var44 = true;
                }
                if (var37.field342) {
                    class510.method2817(var5, arg3, class207.field2858[6], arg2, (byte) -128, var38, var39, arg0);
                } else if (var44) {
                    class510.method2817(var5, arg3, class207.field2858[4], arg2, (byte) 52, var38, var39, arg0);
                } else if (var37.field344) {
                    class510.method2817(var5, arg3, class207.field2858[7], arg2, (byte) 46, var38, var39, arg0);
                } else if (var40) {
                    class510.method2817(var5, arg3, class207.field2858[3], arg2, (byte) -105, var38, var39, arg0);
                } else if (var42) {
                    class510.method2817(var5, arg3, class207.field2858[5], arg2, (byte) -17, var38, var39, arg0);
                } else {
                    class510.method2817(var5, arg3, class207.field2858[2], arg2, (byte) -116, var38, var39, arg0);
                }
            }
        }
        class28[] var19 = class589.field7475;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class28 var23 = var19[var20];
            if (var23 != null && var23.field250 != 0 && (class693.field8900 % 20) < 10) {
                if (var23.field250 == 1) {
                    class232 var24 = (class232) class444.field5811.method2616((long) var23.field251, (byte) -103);
                    if (var24 != null) {
                        class727 var25 = var24.field3125;
                        int var26 = var25.field2896 / 128 - (var7 / 128);
                        int var27 = var25.field2900 / 128 - (var9 / 128);
                        class263.method1670(var26, var27, arg3, (byte) 98, arg0, var5, arg2, 360000L, var23.field244);
                    }
                }
                if (var23.field250 == 2) {
                    int var28 = var23.field240 / 128 - (var7 / 128);
                    int var29 = var23.field249 / 128 - (var9 / 128);
                    long var30 = (long) (var23.field241 << 7);
                    long var32 = var30 * var30;
                    class263.method1670(var28, var29, arg3, (byte) 98, arg0, var5, arg2, var32, var23.field244);
                }
                if (var23.field250 == 10 && var23.field251 >= 0 && var23.field251 < class263.field3508.length) {
                    class33 var34 = class263.field3508[var23.field251];
                    if (var34 != null) {
                        int var35 = var34.field2896 / 128 - (var7 / 128);
                        int var36 = var34.field2900 / 128 - (var9 / 128);
                        class263.method1670(var35, var36, arg3, (byte) 98, arg0, var5, arg2, 360000L, var23.field244);
                    }
                }
            }
        }
        if (class507.field6476 == 4) {
            return;
        }
        if (class270.field3560 != 0) {
            int var21 = class270.field3560 * 4 + (class422.field5564.method190((byte) 66) - 1) * 2 + 2 - (var7 / 128);
            int var22 = class167.field2221 * 4 + (class422.field5564.method190((byte) -35) - 1) * 2 + 2 - (var9 / 128);
            class510.method2817(var5, arg3, class152.field1926[class102.field1357 ? 1 : 0], arg2, (byte) -122, var21, var22, arg0);
        }
        if (!class422.field5564.field374) {
            arg1.method3068(false, arg3.field5117 / 2 + arg2 - 1, arg3.field5031 / 2 + (arg0 - 1), 3, -1, 3);
            return;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V")
    public static final void method789(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class733.method3911(var3.field10433);
        class733.method3911(var3.field10423);
        if (var3.field10433 != null) {
            var3.field10433 = null;
        }
        if (var3.field10423 != null) {
            var3.field10423 = null;
        }
    }
}
