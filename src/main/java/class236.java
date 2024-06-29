import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class236 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lqd;")
    public static class40 field3863 = class147.method1106("::wm1", (byte) -70);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lqd;")
    private static class40 field3862 = class147.method1106("Connecting to update server", (byte) -114);

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field3871 = 0;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lqd;")
    private static class40 field3875 = class147.method1106(" is already on your ignore list)3", (byte) -107);

    @OriginalMember(owner = "client!le", name = "A", descriptor = "Lqd;")
    public static class40 field3886 = field3862;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Lqd;")
    public static class40 field3884 = field3875;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "Lqd;")
    private static class40 field3893 = class147.method1106("Hidden", (byte) -110);

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lqd;")
    public static class40 field3868 = field3893;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public int field3866;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public int field3869;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V", line = 14)
    public static final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class125.field2164 && arg3 <= class48.field941) {
            int var5 = class110.method827((byte) 61, arg0, class72.field1275, class220.field3664);
            int var6 = class110.method827((byte) -54, arg1, class72.field1275, class220.field3664);
            class87.method672(arg2, var5, var6, arg3, (byte) 120);
        }
        field3870++;
        if (arg4 != -105) {
            field3862 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLce;)V", line = 34)
    public static final void method1633(byte arg0, class239 arg1) {
        class81.field1420 = arg1;
        if (arg0 < 56) {
            field3862 = (class40) null;
        }
        field3881++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BIIIIIIZIIII)Z", line = 55)
    public static final boolean method1634(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field3861++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class5.field58[var12][var13] = 0;
                class272.field4514[var12][var13] = 99999999;
            }
        }
        int var14 = arg2;
        byte var15 = 0;
        int var16 = arg9;
        class5.field58[arg2][arg9] = 99;
        class272.field4514[arg2][arg9] = 0;
        class71.field1266[var15] = arg2;
        int var32 = var15 + 1;
        class308.field5169[var15] = arg9;
        boolean var17 = false;
        int[][] var18 = class255.field4247[class160.field2671].field839;
        int var19 = 0;
        while (var32 != var19) {
            var14 = class71.field1266[var19];
            var16 = class308.field5169[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg1 == var14 && arg4 == var16) {
                var17 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class255.field4247[class160.field2671].method411(var16, (byte) 87, var14, arg4, arg1, arg10 - 1, arg8, 2)) {
                    var17 = true;
                    break;
                }
                if (arg10 < 10 && class255.field4247[class160.field2671].method405(arg1, arg10 - 1, arg8, var16, false, arg4, 2, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg3 != 0 && class255.field4247[class160.field2671].method408(arg11, false, arg1, arg4, var16, var14, arg6, arg3, 2)) {
                var17 = true;
                break;
            }
            int var20 = class272.field4514[var14][var16] + 1;
            if (var14 > 0 && class5.field58[var14 - 1][var16] == 0 && (var18[var14 - 1][var16] & 0x12C010E) == 0 && (var18[var14 - 1][var16 + 1] & 0x12C0138) == 0) {
                class71.field1266[var32] = var14 - 1;
                class308.field5169[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class5.field58[var14 - 1][var16] = 2;
                class272.field4514[var14 - 1][var16] = var20;
            }
            if (var14 < 102 && class5.field58[var14 + 1][var16] == 0 && (var18[var14 + 2][var16] & 0x12C0183) == 0 && (var18[var14 + 2][var16 + 1] & 0x12C01E0) == 0) {
                class71.field1266[var32] = var14 + 1;
                class308.field5169[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class5.field58[var14 + 1][var16] = 8;
                class272.field4514[var14 + 1][var16] = var20;
            }
            if (var16 > 0 && class5.field58[var14][var16 - 1] == 0 && (var18[var14][var16 - 1] & 0x12C010E) == 0 && (var18[var14 + 1][var16 - 1] & 0x12C0183) == 0) {
                class71.field1266[var32] = var14;
                class308.field5169[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class5.field58[var14][var16 - 1] = 1;
                class272.field4514[var14][var16 - 1] = var20;
            }
            if (var16 < 102 && class5.field58[var14][var16 + 1] == 0 && (var18[var14][var16 + 2] & 0x12C0138) == 0 && (var18[var14 + 1][var16 + 2] & 0x12C01E0) == 0) {
                class71.field1266[var32] = var14;
                class308.field5169[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class5.field58[var14][var16 + 1] = 4;
                class272.field4514[var14][var16 + 1] = var20;
            }
            if (var14 > 0 && var16 > 0 && class5.field58[var14 - 1][var16 - 1] == 0 && (var18[var14 - 1][var16] & 0x12C0138) == 0 && (var18[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var18[var14][var16 - 1] & 0x12C0183) == 0) {
                class71.field1266[var32] = var14 - 1;
                class308.field5169[var32] = var16 - 1;
                class5.field58[var14 - 1][var16 - 1] = 3;
                class272.field4514[var14 - 1][var16 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && var16 > 0 && class5.field58[var14 + 1][var16 - 1] == 0 && (var18[var14 + 1][var16 - 1] & 0x12C010E) == 0 && (var18[var14 + 2][var16 - 1] & 0x12C0183) == 0 && (var18[var14 + 2][var16] & 0x12C01E0) == 0) {
                class71.field1266[var32] = var14 + 1;
                class308.field5169[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class5.field58[var14 + 1][var16 - 1] = 9;
                class272.field4514[var14 + 1][var16 - 1] = var20;
            }
            if (var14 > 0 && var16 < 102 && class5.field58[var14 - 1][var16 + 1] == 0 && (var18[var14 - 1][var16 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][var16 + 2] & 0x12C0138) == 0 && (var18[var14][var16 + 2] & 0x12C01E0) == 0) {
                class71.field1266[var32] = var14 - 1;
                class308.field5169[var32] = var16 + 1;
                class5.field58[var14 - 1][var16 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class272.field4514[var14 - 1][var16 + 1] = var20;
            }
            if (var14 < 102 && var16 < 102 && class5.field58[var14 + 1][var16 + 1] == 0 && (var18[var14 + 1][var16 + 2] & 0x12C0138) == 0 && (var18[var14 + 2][var16 + 2] & 0x12C01E0) == 0 && (var18[var14 + 2][var16 + 1] & 0x12C0183) == 0) {
                class71.field1266[var32] = var14 + 1;
                class308.field5169[var32] = var16 + 1;
                class5.field58[var14 + 1][var16 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class272.field4514[var14 + 1][var16 + 1] = var20;
            }
        }
        class303.field5081 = 0;
        if (!var17) {
            if (!arg7) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= arg1 + var23; var24++) {
                for (int var25 = arg4 - var23; var25 <= arg4 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class272.field4514[var24][var25] < 100) {
                        int var26 = 0;
                        if (var25 < arg4) {
                            var26 = arg4 - var25;
                        } else if (var25 > arg3 + arg4 - 1) {
                            var26 = var25 + 1 - (arg4 - -arg3);
                        }
                        int var27 = 0;
                        if (var24 < arg1) {
                            var27 = arg1 - var24;
                        } else if (var24 > arg1 + arg11 - 1) {
                            var27 = var24 + 1 - arg1 - arg11;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class272.field4514[var24][var25] < var22) {
                            var14 = var24;
                            var21 = var28;
                            var16 = var25;
                            var22 = class272.field4514[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var14 && arg9 == var16) {
                return false;
            }
            class303.field5081 = 1;
        }
        byte var29 = 0;
        class71.field1266[var29] = var14;
        if (arg0 > -43) {
            field3884 = (class40) null;
        }
        int var33 = var29 + 1;
        class308.field5169[var29] = var16;
        int var30;
        int var31 = var30 = class5.field58[var14][var16];
        while (arg2 != var14 || arg9 != var16) {
            if (var30 != var31) {
                class71.field1266[var33] = var14;
                var30 = var31;
                class308.field5169[var33++] = var16;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            var31 = class5.field58[var14][var16];
        }
        if (var33 > 0) {
            class226.method1586(arg5, var33, -9065);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)I", line = 483)
    public static final int method1635(int arg0, byte arg1) {
        int var2 = -95 % ((-arg1) / 50);
        field3877++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 496)
    public static final void method1636(byte arg0) {
        class204.field3229 = class207.field3298;
        class134.field2283 = class313.field5276;
        class307.field5147 = class225.field3713;
        class204.field3233 = class182.field2954;
        class12.field202 = class3.field38;
        class252.field4180 = class206.field3278;
        class73.field1289 = class171.field2802;
        class313.field5286 = class211.field3366;
        class301.field5047 = class171.field2796;
        class290.field4853 = class158.field2647;
        class314.field5304 = class186.field3002;
        class240.field3976 = class19.field300;
        class298.field4975 = class274.field4563;
        class142.field2381 = class207.field3302;
        class71.field1269 = class309.field5188;
        class276.field4612 = class310.field5207;
        class284.field4779 = class45.field863;
        class29.field620 = class160.field2673;
        field3886 = class172.field2813;
        class125.field2167 = class297.field4958;
        class169.field2783 = class23.field396;
        class54.field1064 = class162.field2688;
        class189.field3062 = class229.field3777;
        class54.field1044 = class41.field782;
        class237.field3914 = class12.field203;
        class118.field2007 = class88.field1588;
        field3884 = client.field4050;
        class88.field1592 = class126.field2180;
        class142.field2390 = class207.field3302;
        class293.field4926 = class286.field4813;
        class52.field998 = class60.field1151;
        class220.field3668 = class214.field3586;
        class313.field5283 = class40.field723;
        class250.field4130 = class94.field1695;
        class299.field5000 = class289.field4843;
        class204.field3231 = class230.field3792;
        class220.field3661 = class317.field5368;
        class242.field3993 = class122.field2117;
        class129.field2221 = class291.field4871;
        class300.field5010 = class9.field142;
        class28.field609 = class252.field4175;
        field3868 = class93.field1680;
        class307.field5138 = class225.field3713;
        class195.field3148 = class269.field4477;
        class293.field4914 = class239.field3942;
        class218.field3642 = class263.field4391;
        class98.field1756 = class233.field3837;
        class265.field4435 = class303.field5080;
        class223.field3709 = class251.field4158;
        class57.field1097 = class31.field642;
        class239.field3933 = class246.field4082;
        class285.field4810 = class112.field1948;
        class192.field3099 = class307.field5156;
        class5.field73 = class270.field4482;
        class312.field5262 = class91.field1661;
        if (arg0 < 91) {
            method1634((byte) -76, 30, -87, -81, 17, 65, -32, false, 84, -47, 86, -14);
        }
        class230.field3794 = class267.field4453;
        class180.field2941 = class62.field1170;
        class157.field2636 = class29.field614;
        class92.field1667 = class242.field3988;
        class76.field1309 = class221.field3670;
        class62.field1177 = class312.field5267;
        class12.field207 = class6.field84;
        class207.field3307 = class279.field4709;
        class87.field1558 = class110.field1920;
        class292.field4883 = class133.field2252;
        class142.field2391 = class49.field943;
        class204.field3239 = class284.field4763;
        class128.field2210 = class185.field2973;
        class54.field1050 = class85.field1475;
        field3887++;
        class142.field2384 = class49.field943;
        class304.field5102 = class23.field405;
        class81.field1432 = class261.field4383;
        class30.field641 = class92.field1671;
        class88.field1590 = class104.field1841;
        class207.field3303 = class268.field4459;
        class233.field3842 = class71.field1271;
        class125.field2163 = class228.field3765;
        class7.field104 = class195.field3139;
        class209.field3339 = class252.field4183;
        class156.field2618 = class278.field4697;
        class284.field4765 = class43.field820;
        class118.field1997 = class257.field4281;
        class23.field399 = class210.field3353;
        class276.field4599 = class279.field4704;
        class195.field3143 = class129.field2218;
        class186.field3006 = class256.field4268;
        class60.field1153 = class10.field154;
        class250.field4136 = class78.field1331;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 829)
    public static void method1637(int arg0) {
        field3862 = null;
        field3884 = null;
        field3875 = null;
        field3886 = null;
        field3893 = null;
        if (arg0 != -1) {
            field3863 = (class40) null;
        }
        field3868 = null;
        field3863 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZLqd;)V", line = 852)
    public static final void method1638(int arg0, boolean arg1, class40 arg2) {
        field3872++;
        int var3 = -62 % ((-arg0) / 59);
        if (!arg1) {
            try {
                class92.field1664.getAppletContext().showDocument(arg2.method347(0, class92.field1664.getCodeBase()), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class21.field350 && class264.field4417) {
            try {
                class216.method1520(class275.field4573.field1876, "openjs", (byte) -31, new Object[] { arg2.method347(0, class92.field1664.getCodeBase()).toString() });
                return;
            } catch (Throwable var9) {
            }
        }
        try {
            class92.field1664.getAppletContext().showDocument(arg2.method347(0, class92.field1664.getCodeBase()), "_blank");
        } catch (Exception var8) {
        }
    }
}
