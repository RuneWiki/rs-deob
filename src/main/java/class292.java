import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class292 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Luw;")
    public static class208 field3716 = new class208(67, 0);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field3717 = 2;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field3719 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1762(int arg0) {
        if (arg0 != 15754) {
            field3719 = -25;
        }
        field3716 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lmc;Ljava/lang/String;B)I")
    public static final int method1763(class234 arg0, String arg1, byte arg2) {
        field3715++;
        int var3 = arg0.field3133;
        byte[] var4 = class318.method1858(arg1, (byte) -105);
        arg0.method1539(var4.length, false);
        arg0.field3133 += class157.field2033.method3899(0, arg0.field3193, -86, var4.length, arg0.field3133, var4);
        if (arg2 < 28) {
            method1763(null, null, (byte) 85);
        }
        return arg0.field3133 - var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZIIII)V")
    public static final void method1764(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3718++;
        if (class28.field252 == null) {
            class576.field7320.method3068(false, arg5, arg3, arg4, -16777216, arg0);
        } else if (class422.field5564.field2896 >= 0 && class240.field3280 * 512 > class422.field5564.field2896 && class422.field5564.field2900 >= 0 && (class276.field3602 * 512) > class422.field5564.field2900) {
            class495.field6333++;
            if (class422.field5564 != null && (class422.field5564.field2896 + 256 - (class422.field5564.method190((byte) 61) * 256) >> 9) == class270.field3560 && class422.field5564.field2900 - (class422.field5564.method190((byte) 104) * 256 - 256) >> 9 == class167.field2221) {
                class270.field3560 = -1;
                class167.field2221 = -1;
                class20.method91((byte) -84);
            }
            class648.method3501(false);
            if (!arg1) {
                class178.method1144(126);
            }
            class634.method3383(-5);
            class634.method3390(true, (byte) 102, arg0, arg5, arg4, arg3);
            int var6 = class281.field3639;
            int var7 = class368.field4503;
            class628.field7974 = class628.field7979;
            int var8 = class203.field2817;
            int var9 = class244.field3360;
            if (class507.field6476 == 1) {
                int var12 = (int) class297.field3762;
                if (class162.field2160 >> 8 > var12) {
                    var12 = class162.field2160 >> 8;
                }
                if (class420.field5545[4] && (class600.field7632[4] + 128) > var12) {
                    var12 = class600.field7632[4] + 128;
                }
                int var13 = (int) class698.field9250 + class181.field2474 & 0x3FFF;
                class88.method539(var12, class572.field7251, var7, (var12 >> 3) * 3 + 600 << 2, class599.field7622, var13, -85, class512.method2831(class309.field3877, (byte) 84, class422.field5564.field2896, class422.field5564.field2900) - 200);
            } else if (class507.field6476 == 4) {
                int var10 = (int) class297.field3762;
                if (var10 < (class162.field2160 >> 8)) {
                    var10 = class162.field2160 >> 8;
                }
                if (class420.field5545[4] && var10 < (class600.field7632[4] + 128)) {
                    var10 = class600.field7632[4] + 128;
                }
                int var11 = (int) class698.field9250 & 0x3FFF;
                class88.method539(var10, class572.field7251, var7, (var10 >> 3) * 3 + 600 << 2, class599.field7622, var11, -40, class512.method2831(class309.field3877, (byte) 51, class12.field125, class433.field5674) - 200);
            } else if (class507.field6476 == 5) {
                class59.method352(var7, 10971);
            }
            int var14 = class97.field1309;
            int var15 = class439.field5770;
            int var16 = class148.field1890;
            int var17 = class463.field6022;
            int var18 = class232.field3122;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class420.field5545[var19]) {
                    int var23 = (int) ((double) (class82.field1166[var19] * 2 + 1) * Math.random() + Math.sin((double) class519.field6602[var19] / 100.0D * (double) class15.field155[var19]) * (double) class600.field7632[var19] - (double) class82.field1166[var19]);
                    if (var19 == 1) {
                        class439.field5770 += var23 << 2;
                    }
                    if (var19 == 0) {
                        class97.field1309 += var23 << 2;
                    }
                    if (var19 == 2) {
                        class148.field1890 += var23 << 2;
                    }
                    if (var19 == 4) {
                        class463.field6022 += var23;
                        if (class463.field6022 < 1024) {
                            class463.field6022 = 1024;
                        } else if (class463.field6022 > 3072) {
                            class463.field6022 = 3072;
                        }
                    }
                    if (var19 == 3) {
                        class232.field3122 = class232.field3122 + var23 & 0x3FFF;
                    }
                }
            }
            if (class97.field1309 < 0) {
                class97.field1309 = 0;
            }
            if (class148.field1890 < 0) {
                class148.field1890 = 0;
            }
            if (((class330.field4039 << 9) - 1) < class97.field1309) {
                class97.field1309 = (class330.field4039 << 9) - 1;
            }
            if (class148.field1890 > (class559.field7102 << 9) - 1) {
                class148.field1890 = (class559.field7102 << 9) - 1;
            }
            class253.method1643(0);
            class599.method3237(583371395);
            class576.field7320.method915(var8, var9, var6 + var8, var9 - -var7);
            class351.method2027((byte) -120, true);
            if (class602.field7657) {
                class477.method2681(class117.field1596, 0);
                if (class705.field9319 != class628.field7974) {
                    class689.field8852 = true;
                }
                class705.field9319 = class628.field7974;
            } else {
                class576.field7320.method937();
                int var20 = class117.field1596;
                if (class38.field430 == null) {
                    class576.field7320.method907(var20);
                } else {
                    class38.field430.method354((byte) -121, var20, class576.field7320, class463.field6022, var9, var8, var7, var6, class313.field3898 << 3, class232.field3122);
                }
            }
            class204.method1385(46);
            class129.field1724.method465(class97.field1309, class439.field5770, class148.field1890, -class463.field6022 & 0x3FFF, -class232.field3122 & 0x3FFF, -class511.field6521 & 0x3FFF);
            class576.field7320.method991(class129.field1724);
            class576.field7320.method967(var6 / 2 + var8, var7 / 2 + var9, class438.field5765 << 1, class438.field5765 << 1);
            class82.method517(class438.field5765 << 1, var7 / 2 + var9, -28231, var6 / 2 + var8, class438.field5765 << 1);
            class91.method550(118, class97.field1309, -class463.field6022 & 0x3FFF, class439.field5770, class148.field1890, -class232.field3122 & 0x3FFF, -class511.field6521 & 0x3FFF);
            byte var21 = class485.field6252.field6954.method3616(false) == 2 ? (byte) class495.field6333 : 1;
            if (class602.field7657) {
                class580.method3107(112, -class463.field6022 & 0x3FFF, -class511.field6521 & 0x3FFF, -class232.field3122 & 0x3FFF);
                class477.method2682(class561.field7133, class485.field6252.field6906.method731(false) == 0, class693.field8900, class422.field5564.field2900 >> 9, class628.field7974, class422.field5564.field2895 + 1, true, class765.field10411, class97.field1309, var21, class380.field4654, class416.field5489, class246.field3369, 20205, class422.field5564.field2896 >> 9, class439.field5770, class568.field7181, class148.field1890);
            } else {
                class139.method796(class693.field8900, class97.field1309, class439.field5770, class148.field1890, class561.field7133, class568.field7181, class765.field10411, class246.field3369, class380.field4654, class416.field5489, class422.field5564.field2895 + 1, var21, class422.field5564.field2896 >> 9, class422.field5564.field2900 >> 9, class485.field6252.field6906.method731(false) == 0, true, class653.field8360 ? class628.field7974 : -1, 0, false);
            }
            class204.method1385(124);
            if (class332.field4052 == 10) {
                class404.method2358(256, var8, var6, var7, (byte) 125, 256, var9);
                class143.method823(256, 6566, 256, var6, var8, var7, var9);
                class598.method3234(var8, 256, 256, true, var9, var7, var6);
                class464.method2605(var8, var7, var9, var6, false);
            }
            class541.method2944();
            class148.field1890 = var16;
            class97.field1309 = var14;
            class463.field6022 = var17;
            class439.field5770 = var15;
            int var22 = 39 / ((67 - arg2) / 45);
            class232.field3122 = var18;
            if (class196.field2726 && class722.field9484.method675(77) == 0) {
                class196.field2726 = false;
            }
            if (class196.field2726) {
                class576.field7320.method3068(false, var8, var9, var6, -16777216, var7);
                class530.method2903(class659.field8556.method3589(class496.field6338, -22395), class576.field7320, class225.field3058, false, -1, class411.field5453);
            }
            class351.method2027((byte) -125, false);
        } else {
            class576.field7320.method3068(false, arg5, arg3, arg4, -16777216, arg0);
        }
    }
}
