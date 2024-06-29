import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class230 extends class76 {

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
    private int field3867 = 4096;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "Lia;")
    public static class257 field3864 = class28.method234(115, "null");

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lia;")
    public static class257 field3866 = class28.method234(-24, " ");

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field3859 = -1;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "[I")
    public static int[] field3870 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field3860;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (arg0 != -9351) {
            method1503((byte) 24);
        }
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1 - 1 & class105.field1950, 0, (byte) -104);
            int[] var5 = this.method562(arg1, 0, (byte) -104);
            int[] var6 = this.method562(class105.field1950 & arg1 + 1, 0, (byte) -104);
            for (int var7 = 0; ~class96.field1807 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3867;
                int var9 = (var5[var7 + 1 & class157.field2753] + -var5[var7 + -1 & class157.field2753]) * this.field3867;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg1 >= -86) {
            field3866 = null;
        }
        ++field3861;
        if (~arg2 == -1) {
            this.field3867 = arg0.method1063(-17162);
        }
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V")
    public static void method1498(int arg0) {
        field3866 = null;
        field3864 = null;
        field3870 = null;
        if (arg0 >= -70) {
            method1500(106, -103);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method1499(boolean arg0) {
        ++field3868;
        if (class39.field793[96]) {
            class14.field290 += (-24 - class14.field290) / 2;
        } else if (!class39.field793[97]) {
            class14.field290 /= 2;
        } else {
            class14.field290 += (24 - class14.field290) / 2;
        }
        if (class39.field793[98]) {
            class73.field1417 += (-class73.field1417 + 12) / 2;
        } else if (!class39.field793[99]) {
            class73.field1417 /= 2;
        } else {
            class73.field1417 += (-class73.field1417 + -12) / 2;
        }
        class25.field479 += class14.field290 / 2;
        class243.field4212 += class73.field1417 / 2;
        if (!arg0) {
            field3870 = null;
        }
        int var1 = class211.field3598 + class137.field2441.field4143;
        int var2 = class29.field560 + class137.field2441.field4177;
        if (-var2 + class95.field1801 < -500 || -var2 + class95.field1801 > 500 || class238.field4099 - var1 < -500 || -var1 + class238.field4099 > 500) {
            class238.field4099 = var1;
            class95.field1801 = var2;
        }
        if (~class95.field1801 != ~var2) {
            class95.field1801 += (-class95.field1801 + var2) / 16;
        }
        if (~class238.field4099 != ~var1) {
            class238.field4099 += (var1 - class238.field4099) / 16;
        }
        class71.method534(383);
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)I")
    public static final int method1500(int arg0, int arg1) {
        ++field3869;
        if (arg0 != -105) {
            return 102;
        } else {
            class161 var2 = class80.method603(-121, arg1);
            int var3 = var2.field2826;
            int var4 = var2.field2816;
            int var5 = var2.field2825;
            int var6 = class28.field538[var5 - var4];
            return var6 & class117.field2100[var3] >> var4;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class230() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIZLme;I)V")
    public static final void method1501(byte arg0, int arg1, boolean arg2, class44 arg3, int arg4) {
        ++field3862;
        int var5 = arg3.field926;
        if (~arg3.field950 != -1) {
            if (arg3.field950 == 1) {
                arg3.field926 = -arg3.field1019 + arg4;
            } else if (arg3.field950 != 2) {
                if (arg3.field950 == 3) {
                    if (~arg3.field871 == -3) {
                        arg3.field926 = (arg3.field1019 + -1) * arg3.field927 + arg3.field1019 * 32;
                    } else if (arg3.field871 == 7) {
                        arg3.field926 = (arg3.field1019 + -1) * arg3.field927 + arg3.field1019 * 115;
                    }
                }
            } else {
                arg3.field926 = arg3.field1019 * arg4 >> 14;
            }
        } else {
            arg3.field926 = arg3.field1019;
        }
        int var6 = arg3.field981;
        if (arg3.field864 != 0) {
            if (~arg3.field864 == -2) {
                arg3.field981 = -arg3.field912 + arg1;
            } else if (~arg3.field864 != -3) {
                if (arg3.field864 == 3) {
                    if (arg3.field871 != 2) {
                        if (~arg3.field871 == -8) {
                            arg3.field981 = (arg3.field912 + -1) * arg3.field967 + arg3.field912 * 12;
                        }
                    } else {
                        arg3.field981 = (arg3.field912 + -1) * arg3.field967 + arg3.field912 * 32;
                    }
                }
            } else {
                arg3.field981 = arg3.field912 * arg1 >> 14;
            }
        } else {
            arg3.field981 = arg3.field912;
        }
        if (~arg3.field950 == -5) {
            arg3.field926 = arg3.field981 * arg3.field921 / arg3.field872;
        }
        if (arg3.field864 == 4) {
            arg3.field981 = arg3.field926 * arg3.field872 / arg3.field921;
        }
        if (class87.field1695 && (~client.method590(arg3) != -1 || arg3.field871 == 0)) {
            if (~arg3.field981 > -6 && arg3.field926 < 5) {
                arg3.field981 = 5;
                arg3.field926 = 5;
            } else {
                if (~arg3.field981 >= -1) {
                    arg3.field981 = 5;
                }
                if (arg3.field926 <= 0) {
                    arg3.field926 = 5;
                }
            }
        }
        if (arg0 <= -3) {
            if (arg3.field949 == 1337) {
                class243.field4206 = arg3;
            }
            if (arg2 && arg3.field962 != null) {
                if (~arg3.field926 != ~var5 || ~arg3.field981 != ~var6) {
                    class164 var7 = new class164();
                    var7.field2867 = arg3.field962;
                    var7.field2864 = arg3;
                    class154.field2706.method287(var7, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBIIIIIIIIIZI)Z")
    public static final boolean method1502(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        for (int var13 = 0; ~var13 > -105; ++var13) {
            for (int var40 = 0; var40 < 104; ++var40) {
                class92.field1750[var13][var40] = 0;
                class137.field2443[var13][var40] = 99999999;
            }
        }
        class92.field1750[arg2][arg9] = 99;
        if (arg1 < 90) {
            field3870 = null;
        }
        ++field3858;
        class137.field2443[arg2][arg9] = 0;
        int var14 = arg9;
        int var15 = arg2;
        byte var16 = 0;
        class36.field718[var16] = arg2;
        int var41 = var16 + 1;
        class80.field1565[var16] = arg9;
        boolean var17 = false;
        int var18 = 0;
        int[][] var19 = class173.field2961[class189.field3261].field4075;
        label372: while (~var41 != ~var18) {
            var15 = class36.field718[var18];
            var14 = class80.field1565[var18];
            var18 = 4095 & var18 + 1;
            if (arg10 == var15 && ~arg4 == ~var14) {
                var17 = true;
                break;
            }
            if (~arg5 != -1) {
                if ((arg5 < 5 || ~arg5 == -11) && class173.field2961[class189.field3261].method1571(var15, arg4, (byte) 118, arg5 + -1, arg0, arg3, var14, arg10)) {
                    var17 = true;
                    break;
                }
                if (~arg5 > -11 && class173.field2961[class189.field3261].method1561(var14, arg5 + -1, var15, arg4, arg10, arg3, (byte) 97, arg0)) {
                    var17 = true;
                    break;
                }
            }
            if (~arg8 != -1 && ~arg12 != -1 && class173.field2961[class189.field3261].method1562(var14, var15, arg3, arg10, arg8, -78, arg4, arg12, arg7)) {
                var17 = true;
                break;
            }
            int var31 = class137.field2443[var15][var14] + 1;
            if (~var15 < -1 && ~class92.field1750[var15 - 1][var14] == -1 && ~(19661070 & var19[var15 + -1][var14]) == -1 && ~(var19[var15 - 1][var14 - -arg3 + -1] & 19661112) == -1) {
                int var32 = 1;
                while (true) {
                    if (~var32 <= ~(arg3 + -1)) {
                        class36.field718[var41] = var15 + -1;
                        class80.field1565[var41] = var14;
                        var41 = 4095 & var41 + 1;
                        class92.field1750[var15 + -1][var14] = 2;
                        class137.field2443[var15 + -1][var14] = var31;
                        break;
                    }
                    if (~(var19[var15 - 1][var14 + var32] & 19661118) != -1) {
                        break;
                    }
                    ++var32;
                }
            }
            if (var15 < 102 && class92.field1750[var15 + 1][var14] == 0 && ~(19661187 & var19[arg3 + var15][var14]) == -1 && (19661280 & var19[arg3 + var15][var14 + -1 + arg3]) == 0) {
                int var33 = 1;
                while (true) {
                    if (~(arg3 + -1) >= ~var33) {
                        class36.field718[var41] = var15 + 1;
                        class80.field1565[var41] = var14;
                        class92.field1750[var15 + 1][var14] = 8;
                        var41 = 4095 & var41 + 1;
                        class137.field2443[var15 + 1][var14] = var31;
                        break;
                    }
                    if ((var19[arg3 + var15][var14 + var33] & 19661283) != 0) {
                        break;
                    }
                    ++var33;
                }
            }
            if (var14 > 0 && class92.field1750[var15][var14 - 1] == 0 && (19661070 & var19[var15][var14 + -1]) == 0 && ~(19661187 & var19[arg3 + var15 + -1][var14 - 1]) == -1) {
                int var34 = 1;
                while (true) {
                    if (arg3 + -1 <= var34) {
                        class36.field718[var41] = var15;
                        class80.field1565[var41] = var14 + -1;
                        var41 = 4095 & var41 + 1;
                        class92.field1750[var15][var14 - 1] = 1;
                        class137.field2443[var15][var14 + -1] = var31;
                        break;
                    }
                    if ((var19[var15 - -var34][var14 + -1] & 19661199) != 0) {
                        break;
                    }
                    ++var34;
                }
            }
            if (var14 < 102 && ~class92.field1750[var15][var14 - -1] == -1 && (19661112 & var19[var15][var14 - -arg3]) == 0 && ~(19661280 & var19[arg3 + var15 + -1][arg3 + var14]) == -1) {
                int var35 = 1;
                while (true) {
                    if (~(arg3 + -1) >= ~var35) {
                        class36.field718[var41] = var15;
                        class80.field1565[var41] = var14 + 1;
                        class92.field1750[var15][var14 + 1] = 4;
                        var41 = 4095 & var41 + 1;
                        class137.field2443[var15][var14 + 1] = var31;
                        break;
                    }
                    if ((19661304 & var19[var15 + var35][arg3 + var14]) != 0) {
                        break;
                    }
                    ++var35;
                }
            }
            if (var15 > 0 && var14 > 0 && ~class92.field1750[var15 + -1][var14 + -1] == -1 && (var19[var15 - 1][arg3 + var14 + -2] & 19661112) == 0 && ~(var19[var15 + -1][var14 + -1] & 19661070) == -1 && ~(var19[arg3 + -1 + var15 + -1][var14 + -1] & 19661187) == -1) {
                int var36 = 1;
                while (true) {
                    if (arg3 + -1 <= var36) {
                        class36.field718[var41] = var15 + -1;
                        class80.field1565[var41] = var14 + -1;
                        var41 = var41 + 1 & 4095;
                        class92.field1750[var15 - 1][var14 - 1] = 3;
                        class137.field2443[var15 - 1][var14 + -1] = var31;
                        break;
                    }
                    if ((19661118 & var19[var15 + -1][var14 + -1 + var36]) != 0 || ~(var19[var15 + -1 - -var36][var14 + -1] & 19661199) != -1) {
                        break;
                    }
                    ++var36;
                }
            }
            if (var15 < 102 && var14 > 0 && ~class92.field1750[var15 + 1][var14 + -1] == -1 && ~(var19[var15 + 1][var14 + -1] & 19661070) == -1 && (19661187 & var19[var15 - -arg3][var14 - 1]) == 0 && (var19[arg3 + var15][arg3 + -1 + var14 + -1] & 19661280) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= arg3 - 1) {
                        class36.field718[var41] = var15 + 1;
                        class80.field1565[var41] = var14 + -1;
                        class92.field1750[var15 + 1][var14 + -1] = 9;
                        var41 = 4095 & var41 + 1;
                        class137.field2443[var15 + 1][var14 + -1] = var31;
                        break;
                    }
                    if (~(var19[arg3 + var15][var14 + var37 + -1] & 19661283) != -1 || ~(var19[var15 + 1 + var37][var14 + -1] & 19661199) != -1) {
                        break;
                    }
                    ++var37;
                }
            }
            if (~var15 < -1 && ~var14 > -103 && ~class92.field1750[var15 + -1][var14 - -1] == -1 && ~(19661070 & var19[var15 + -1][var14 + 1]) == -1 && ~(var19[var15 + -1][arg3 + var14] & 19661112) == -1 && ~(var19[var15][arg3 + var14] & 19661280) == -1) {
                int var38 = 1;
                while (true) {
                    if (~(arg3 - 1) >= ~var38) {
                        class36.field718[var41] = var15 + -1;
                        class80.field1565[var41] = var14 - -1;
                        var41 = 4095 & var41 + 1;
                        class92.field1750[var15 + -1][var14 + 1] = 6;
                        class137.field2443[var15 + -1][var14 - -1] = var31;
                        break;
                    }
                    if ((var19[var15 + -1][var14 + 1 - -var38] & 19661118) != 0 || (19661304 & var19[var15 + var38 + -1][arg3 + var14]) != 0) {
                        break;
                    }
                    ++var38;
                }
            }
            if (~var15 > -103 && var14 < 102 && class92.field1750[var15 + 1][var14 + 1] == 0 && ~(19661112 & var19[var15 + 1][arg3 + var14]) == -1 && (19661280 & var19[arg3 + var15][arg3 + var14]) == 0 && ~(var19[arg3 + var15][var14 - -1] & 19661187) == -1) {
                for (int var39 = 1; ~var39 > ~(arg3 + -1); ++var39) {
                    if ((19661304 & var19[var15 - -1 - -var39][arg3 + var14]) != 0 || (var19[var15 - -arg3][var39 + 1 + var14] & 19661283) != 0) {
                        continue label372;
                    }
                }
                class36.field718[var41] = var15 - -1;
                class80.field1565[var41] = var14 + 1;
                var41 = var41 + 1 & 4095;
                class92.field1750[var15 + 1][var14 + 1] = 12;
                class137.field2443[var15 + 1][var14 + 1] = var31;
            }
        }
        class71.field1392 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = -var21 + arg10; arg10 + var21 >= var23; ++var23) {
                for (int var24 = arg4 - var21; arg4 - -var21 >= var24; ++var24) {
                    if (~var23 <= -1 && ~var24 <= -1 && ~var23 > -105 && var24 < 104 && class137.field2443[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg4) {
                            var25 = -var24 + arg4;
                        } else if (~(arg4 + arg12 + -1) > ~var24) {
                            var25 = var24 - arg4 + -arg12 + 1;
                        }
                        if (var23 < arg10) {
                            var26 = -var23 + arg10;
                        } else if (var23 > arg10 + -1 - -arg8) {
                            var26 = -arg10 + 1 - arg8 + var23;
                        }
                        int var27 = var26 * var26 - -(var25 * var25);
                        if (~var27 > ~var20 || var20 == var27 && ~var22 < ~class137.field2443[var23][var24]) {
                            var14 = var24;
                            var20 = var27;
                            var15 = var23;
                            var22 = class137.field2443[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg2 == var15 && arg9 == var14) {
                return false;
            }
            class71.field1392 = 1;
        }
        byte var28 = 0;
        class36.field718[var28] = var15;
        int var42 = var28 + 1;
        class80.field1565[var28] = var14;
        int var29;
        int var30 = var29 = class92.field1750[var15][var14];
        while (arg2 != var15 || arg9 != var14) {
            if (~var29 != ~var30) {
                var29 = var30;
                class36.field718[var42] = var15;
                class80.field1565[var42++] = var14;
            }
            if (~(var30 & 1) == -1) {
                if ((4 & var30) != 0) {
                    --var14;
                }
            } else {
                ++var14;
            }
            if (~(var30 & 2) == -1) {
                if (~(var30 & 8) != -1) {
                    --var15;
                }
            } else {
                ++var15;
            }
            var30 = class92.field1750[var15][var14];
        }
        if (var42 > 0) {
            class70.method530(arg6, true, var42);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
    public static final void method1503(byte arg0) {
        if (arg0 != -14) {
            field3870 = null;
        }
        ++field3863;
        while (true) {
            class33 var1 = class34.field659;
            class108 var2;
            synchronized (class34.field659) {
                var2 = (class108) class10.field187.method285(0);
            }
            if (var2 == null) {
                return;
            }
            var2.field2009.method1483(var2.field2016, (int) var2.field573, 127, var2.field2018, false);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIILq;II)V")
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, class238 arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class40.method327(arg6, arg2, arg1);
        } else if (arg5 == 1) {
            var7 = class46.method360(arg6, arg2, arg1);
        } else if (arg5 == 2) {
            var7 = class200.method1348(arg6, arg2, arg1);
        } else if (~arg5 == -4) {
            var7 = class129.method900(arg6, arg2, arg1);
        }
        ++field3865;
        if (arg0 <= 13) {
            field3864 = null;
        }
        boolean var9 = true;
        boolean var10 = false;
        int var11 = 31 & (int) var7 >> 14;
        int var12 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var13 = false;
        class233 var14 = class5.method96(var12, false);
        if (var14.method1524(-74)) {
            class87.method647(var14, arg2, arg1, arg6, -103);
        }
        int var15 = (int) var7 >> 20 & 3;
        if (~var7 != -1L) {
            if (arg5 == 0) {
                class105.method759(arg6, arg2, arg1);
                if (var14.field4016 != 0) {
                    arg4.method1554((byte) 77, arg1, var15, var11, var14.field4012, arg2);
                    return;
                }
            } else if (~arg5 != -2) {
                if (~arg5 != -3) {
                    if (arg5 == 3) {
                        class211.method1422(arg6, arg2, arg1);
                        if (~var14.field4016 == -2) {
                            arg4.method1565(arg2, (byte) -118, arg1);
                            return;
                        }
                    }
                    return;
                }
                class89.method662(arg6, arg2, arg1);
                if (~var14.field4016 != -1 && ~(arg2 - -var14.field3950) > -105 && ~(var14.field3950 + arg1) > -105 && ~(var14.field3986 + arg2) > -105 && var14.field3986 + arg1 < 104) {
                    arg4.method1564(arg1, var14.field3950, var14.field3986, arg2, var15, false, var14.field4012);
                    return;
                }
            } else {
                class149.method1002(arg6, arg2, arg1);
            }
        }
    }
}
