import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class469 {

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "B")
    private byte field6410;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public int field6407;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field6415;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public int field6412;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field6411;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public int field6406;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Z")
    public static boolean field6405 = false;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6414;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6416;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V")
    public static final void method2791(int arg0, int arg1, int[] arg2, int arg3, Object[] arg4) {
        if (arg3 != 9116) {
            method2794(true);
        }
        field6414++;
        if (arg0 <= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg1;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var7;
        Object var8 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg0; var10++) {
            if ((var9 & var10) + var7 > arg2[var10]) {
                int var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                Object var12 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var12;
            }
        }
        arg2[arg0] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg0] = arg4[var6];
        arg4[var6] = var8;
        method2791(var6 - 1, arg1, arg2, arg3, arg4);
        method2791(arg0, var6 + 1, arg2, 9116, arg4);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
    public final int method2792(int arg0) {
        int var2 = 70 % ((arg0 + 52) / 59);
        field6408++;
        return this.field6410 & 0x7;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
    public static final void method2793() {
        for (int var0 = 0; var0 < class442.field6068; var0++) {
            if (!class226.field3165[var0]) {
                class519 var1 = class146.field2026[var0];
                class757 var2 = var1.field7244;
                int var3 = var1.field7249;
                int var4 = var2.method4206((byte) -119) - class457.field6297;
                int var5 = (var4 * 2 >> class509.field7106) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method4203(20918) - var4 >> class509.field7106;
                int var9 = var2.method4205((byte) 8) - var4 >> class509.field7106;
                int var10 = var2.method4205((byte) 8) + var4 >> class509.field7106;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class314.field4059) {
                    var10 = class314.field4059 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field7242[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class485.field6556) {
                        var16 = class485.field6556 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class743 var19 = class151.method970(var3, var17, var11, field6416 == null ? (field6416 = method2797("gs")) : field6416);
                        if (var19 != null && var19.field10361 != 0) {
                            if (var19.field10361 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field7242[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field7242[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field7242[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field7242[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class226.field3165[var0] = true;
                class52.field741[var3].method513(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    public static final void method2794(boolean arg0) {
        field6404++;
        int var1 = 0;
        if (class674.field9500.field5162.method1586(0) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class674.field9500.field5130.method1257(0) == 0) {
            var1 |= 0x40;
        }
        class723.method4052(-18815, var1);
        class264.field3604.method3189(var1, !arg0);
        class487.field6572.method3052(-125, var1);
        class643.field9112.method3888(var1, 16);
        class267.field3625.method3981(6495, var1);
        class663.method3807(-30664, var1);
        class319.method1858(var1, 65535);
        class146.method950(0, var1);
        if (arg0) {
            method2791(90, 64, null, 114, null);
        }
        class596.method3530(var1, -66);
        class126.method817(-1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
    public final int method2795(byte arg0) {
        if (arg0 < 119) {
            method2791(81, -109, null, 45, null);
        }
        field6413++;
        return (this.field6410 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIZIZ)V")
    public static final void method2796(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        field6409++;
        if (class352.field4549 == null) {
            class96.field1401.method3255(arg2, arg0, arg1, -16777216, (byte) -107, arg4);
        } else if (class473.field6483.field9490 >= 0 && class473.field6483.field9490 < (class514.field7179 * 512) && class473.field6483.field9489 >= 0 && class473.field6483.field9489 < class456.field6281 * 512) {
            class54.field757++;
            if (class473.field6483 != null && class473.field6483.field9490 - (class473.field6483.method3470(-1) * 256 - 256) >> 9 == class729.field10226 && (class473.field6483.field9489 + 256 - class473.field6483.method3470(-1) * 256 >> 9) == class93.field1329) {
                class729.field10226 = -1;
                class93.field1329 = -1;
                class463.method2767(126);
            }
            class720.method4038(55);
            if (!arg5) {
                class311.method1819((byte) -82);
            }
            class323.method1889(11629);
            class538.method3214(arg2, -121, arg1, arg4, arg3, arg0);
            int var6 = class304.field3957;
            int var7 = class729.field10213;
            int var8 = class355.field4566;
            class527.field7375 = class527.field7374;
            int var9 = class159.field2150;
            if (class665.field9377 == 1) {
                int var10 = (int) class223.field3131;
                if ((class652.field9224 >> 8) > var10) {
                    var10 = class652.field9224 >> 8;
                }
                if (class400.field5549[4] && class692.field9687[4] + 128 > var10) {
                    var10 = class692.field9687[4] + 128;
                }
                int var11 = (int) class403.field5597 + class97.field1409 & 0x3FFF;
                class590.method3504(class128.field1755, var11, var10, (byte) 45, class595.field8572, class438.method2628(class473.field6483.field9490, class392.field5459, class473.field6483.field9489, (byte) -127) - 200, var8, ((var10 >> 3) * 3) + 600 << 2);
            } else if (class665.field9377 == 4) {
                int var12 = (int) class223.field3131;
                if (var12 < (class652.field9224 >> 8)) {
                    var12 = class652.field9224 >> 8;
                }
                if (class400.field5549[4] && class692.field9687[4] + 128 > var12) {
                    var12 = class692.field9687[4] + 128;
                }
                int var13 = (int) class403.field5597 & 0x3FFF;
                class590.method3504(class128.field1755, var13, var12, (byte) 52, class595.field8572, class438.method2628(class264.field3603, class392.field5459, class668.field9412, (byte) -42) - 200, var8, (var12 >> 3) * 3 + 600 << 2);
            } else if (class665.field9377 == 5) {
                class63.method410(-1, var8);
            }
            int var14 = class24.field266;
            int var15 = class57.field798;
            int var16 = class235.field3250;
            int var17 = class403.field5594;
            int var18 = class645.field9148;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class400.field5549[var19]) {
                    int var22 = (int) (Math.random() * (double) (class459.field6316[var19] * 2 + 1) + Math.sin((double) class708.field9888[var19] / 100.0D * (double) class511.field7132[var19]) * (double) class692.field9687[var19] - (double) class459.field6316[var19]);
                    if (var19 == 1) {
                        class57.field798 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class403.field5594 += var22;
                        if (class403.field5594 < 1024) {
                            class403.field5594 = 1024;
                        } else if (class403.field5594 > 3072) {
                            class403.field5594 = 3072;
                        }
                    }
                    if (var19 == 3) {
                        class645.field9148 = class645.field9148 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class24.field266 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class235.field3250 += var22 << 2;
                    }
                }
            }
            if (class24.field266 < 0) {
                class24.field266 = 0;
            }
            if (class24.field266 > (class485.field6556 << 9) - 1) {
                class24.field266 = (class485.field6556 << 9) - 1;
            }
            if (class235.field3250 < 0) {
                class235.field3250 = 0;
            }
            if (class235.field3250 > ((class314.field4059 << 9) - 1)) {
                class235.field3250 = (class314.field4059 << 9) - 1;
            }
            class448.method2695(85);
            class70.method443((byte) 98);
            class96.field1401.method2097(var6, var9, var6 + var7, var8 + var9);
            class290.method1711(100, true);
            if (class264.field3595) {
                class488.method2859(0, class547.field7715);
                if (class527.field7375 != class470.field6424) {
                    class380.field5357 = true;
                }
                class470.field6424 = class527.field7375;
            } else {
                class96.field1401.method610();
                int var20 = class547.field7715;
                if (class67.field932 == null) {
                    class96.field1401.method563(var20);
                } else {
                    class67.field932.method3558(class96.field1401, class143.field1986 << 3, class403.field5594, var20, var7, var6, var9, class645.field9148, var8, 23206);
                }
            }
            class350.method1993(26779);
            class123.field1685.method853(class24.field266, class57.field798, class235.field3250, -class403.field5594 & 0x3FFF, -class645.field9148 & 0x3FFF, -class520.field7268 & 0x3FFF);
            class96.field1401.method2068(class123.field1685);
            class96.field1401.method2081(var7 / 2 + var6, var9 - -(var8 / 2), class602.field8611 << 1, class602.field8611 << 1);
            class424.method2585(0, class602.field8611 << 1, class602.field8611 << 1, var6 + (var7 / 2), var8 / 2 + var9);
            class534.method3183(-class403.field5594 & 0x3FFF, class24.field266, -class520.field7268 & 0x3FFF, class57.field798, -class645.field9148 & 0x3FFF, 62, class235.field3250);
            byte var21 = class674.field9500.field5122.method3071(0) == 2 ? (byte) class54.field757 : 1;
            if (class264.field3595) {
                class237.method1511(-class645.field9148 & 0x3FFF, -class403.field5594 & 0x3FFF, -class520.field7268 & 0x3FFF, 123);
                class478.method2828(var21, class473.field6483.field9490 >> 9, class57.field798, class527.field7375, class611.field8693, class24.field266, class504.field7062, class634.field9017, class5.field27, !arg3, class674.field9500.field5154.method1259(0) == 0, class477.field6508, class235.field3250, class473.field6483.field9489 >> 9, class245.field3409, class473.field6483.field9501 + 1, true, class405.field5619);
            } else {
                class218.method1428(class245.field3409, class24.field266, class57.field798, class235.field3250, class634.field9017, class504.field7062, class5.field27, class405.field5619, class611.field8693, class477.field6508, class473.field6483.field9501 + 1, var21, class473.field6483.field9490 >> 9, class473.field6483.field9489 >> 9, class674.field9500.field5154.method1259(0) == 0, true, class286.field3774 ? class527.field7375 : -1, 0, false);
            }
            class350.method1993(26779);
            if (class213.field3004 == 10) {
                class333.method1927(var7, 256, var6, 24935, var8, var9, 256);
                class345.method1980(256, var6, var9, false, var7, 256, var8);
                class267.method1637(256, var6, var9, var8, false, var7, 256);
                class285.method1702(var7, var9, false, var8, var6);
            }
            class5.method22();
            class645.field9148 = var18;
            class24.field266 = var14;
            class57.field798 = var15;
            class235.field3250 = var16;
            class403.field5594 = var17;
            if (class158.field2143 && class480.field6528.method1752((byte) 117) == 0) {
                class158.field2143 = false;
            }
            if (class158.field2143) {
                class96.field1401.method3255(var8, var7, var6, -16777216, (byte) 109, var9);
                class665.method3817(class442.field6064, -128, class138.field1848.method891(-2041650704, class369.field4721), class339.field4345, false, class96.field1401);
            }
            class290.method1711(100, false);
        } else {
            class96.field1401.method3255(arg2, arg0, arg1, -16777216, (byte) 117, arg4);
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class469() {
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lvj;)V")
    public class469(class26 arg0) {
        this.field6410 = arg0.method195(128);
        this.field6407 = arg0.method193(2);
        this.field6415 = arg0.method189(255);
        this.field6412 = arg0.method189(255);
        this.field6411 = arg0.method189(255);
        this.field6406 = arg0.method189(255);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2797(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
