import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class158 extends class124 {

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "Le;")
    public static class191 field2684 = class54.method368("<img=1>", 2047);

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "[I")
    public static int[] field2680 = new int[2000];

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "Leg;")
    public static class33 field2686 = null;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "[Lwa;")
    public static class226[] field2687;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field2683;
        if (!arg2) {
            field2680 = null;
        }
        if (~arg0 == -1) {
            super.field2063 = ~arg1.method1580(-60) == -2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class158() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    public static final void method1074(int arg0, int arg1) {
        --class167.field2824;
        ++field2681;
        if (class167.field2824 != arg1) {
            if (arg0 != 0) {
                field2686 = null;
            }
            class58.method386(class170.field2881, arg1 + 1, class170.field2881, arg1, -arg1 + class167.field2824);
            class58.method386(class33.field475, arg1 - -1, class33.field475, arg1, class167.field2824 - arg1);
            class58.method392(class188.field3306, arg1 + 1, class188.field3306, arg1, -arg1 + class167.field2824);
            class58.method388(class209.field3727, arg1 + 1, class209.field3727, arg1, class167.field2824 - arg1);
            class58.method387(class270.field4761, arg1 + 1, class270.field4761, arg1, -arg1 + class167.field2824);
            class58.method387(class166.field2800, arg1 + 1, class166.field2800, arg1, -arg1 + class167.field2824);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)I")
    public static final int method1075(byte arg0, int arg1) {
        ++field2682;
        if (arg0 < 104) {
            field2687 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZIIIIIZIIII)Z")
    public static final boolean method1076(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; ~var13 > -105; ++var13) {
            for (int var40 = 0; var40 < 104; ++var40) {
                class49.field871[var13][var40] = 0;
                class111.field1861[var13][var40] = 99999999;
            }
        }
        class49.field871[arg5][arg3] = 99;
        class111.field1861[arg5][arg3] = 0;
        ++field2685;
        int var14 = arg5;
        int var15 = arg3;
        byte var16 = 0;
        int var17 = 0;
        class19.field256[var16] = arg5;
        int var41 = var16 + 1;
        class196.field3502[var16] = arg3;
        if (!arg2) {
            field2684 = null;
        }
        boolean var18 = false;
        int[][] var19 = class82.field1383[class261.field4598].field3873;
        label372: while (var41 != var17) {
            var14 = class19.field256[var17];
            var15 = class196.field3502[var17];
            var17 = 4095 & var17 + 1;
            if (arg1 == var14 && arg7 == var15) {
                var18 = true;
                break;
            }
            if (arg10 != 0) {
                if ((~arg10 > -6 || ~arg10 == -11) && class82.field1383[class261.field4598].method1496(arg6, arg7, arg1, var15, var14, arg9, arg10 + -1, -5591)) {
                    var18 = true;
                    break;
                }
                if (arg10 < 10 && class82.field1383[class261.field4598].method1501(19661064, var14, arg9, arg1, arg10 + -1, arg7, arg6, var15)) {
                    var18 = true;
                    break;
                }
            }
            if (~arg4 != -1 && arg11 != 0 && class82.field1383[class261.field4598].method1498(var14, -1, arg9, var15, arg11, arg1, arg7, arg4, arg12)) {
                var18 = true;
                break;
            }
            int var31 = class111.field1861[var14][var15] - -1;
            if (var14 > 0 && class49.field871[var14 + -1][var15] == 0 && ~(var19[var14 + -1][var15] & 19661070) == -1 && (19661112 & var19[var14 + -1][arg9 + -1 + var15]) == 0) {
                int var32 = 1;
                while (true) {
                    if (~(arg9 + -1) >= ~var32) {
                        class19.field256[var41] = var14 - 1;
                        class196.field3502[var41] = var15;
                        var41 = var41 - -1 & 4095;
                        class49.field871[var14 - 1][var15] = 2;
                        class111.field1861[var14 + -1][var15] = var31;
                        break;
                    }
                    if (~(var19[var14 + -1][var15 + var32] & 19661118) != -1) {
                        break;
                    }
                    ++var32;
                }
            }
            if (~var14 > -103 && class49.field871[var14 - -1][var15] == 0 && (19661187 & var19[arg9 + var14][var15]) == 0 && (var19[arg9 + var14][arg9 + var15 + -1] & 19661280) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg9 + -1) {
                        class19.field256[var41] = var14 + 1;
                        class196.field3502[var41] = var15;
                        var41 = var41 + 1 & 4095;
                        class49.field871[var14 - -1][var15] = 8;
                        class111.field1861[var14 + 1][var15] = var31;
                        break;
                    }
                    if (~(19661283 & var19[arg9 + var14][var15 + var33]) != -1) {
                        break;
                    }
                    ++var33;
                }
            }
            if (var15 > 0 && class49.field871[var14][var15 + -1] == 0 && (var19[var14][var15 + -1] & 19661070) == 0 && ~(19661187 & var19[arg9 + var14 + -1][var15 - 1]) == -1) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg9 - 1) {
                        class19.field256[var41] = var14;
                        class196.field3502[var41] = var15 - 1;
                        class49.field871[var14][var15 + -1] = 1;
                        var41 = var41 + 1 & 4095;
                        class111.field1861[var14][var15 + -1] = var31;
                        break;
                    }
                    if (~(var19[var14 + var34][var15 + -1] & 19661199) != -1) {
                        break;
                    }
                    ++var34;
                }
            }
            if (var15 < 102 && ~class49.field871[var14][var15 + 1] == -1 && ~(var19[var14][arg9 + var15] & 19661112) == -1 && (19661280 & var19[arg9 + var14 - 1][arg9 + var15]) == 0) {
                int var35 = 1;
                while (true) {
                    if (~(arg9 - 1) >= ~var35) {
                        class19.field256[var41] = var14;
                        class196.field3502[var41] = var15 - -1;
                        var41 = var41 + 1 & 4095;
                        class49.field871[var14][var15 + 1] = 4;
                        class111.field1861[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((19661304 & var19[var14 + var35][arg9 + var15]) != 0) {
                        break;
                    }
                    ++var35;
                }
            }
            if (var14 > 0 && ~var15 < -1 && ~class49.field871[var14 - 1][var15 + -1] == -1 && ~(19661112 & var19[var14 - 1][var15 + -1 + arg9 + -1]) == -1 && (19661070 & var19[var14 + -1][var15 + -1]) == 0 && ~(var19[arg9 + var14 + -2][var15 - 1] & 19661187) == -1) {
                int var36 = 1;
                while (true) {
                    if (var36 >= arg9 - 1) {
                        class19.field256[var41] = var14 + -1;
                        class196.field3502[var41] = var15 - 1;
                        var41 = 4095 & var41 + 1;
                        class49.field871[var14 + -1][var15 + -1] = 3;
                        class111.field1861[var14 + -1][var15 + -1] = var31;
                        break;
                    }
                    if (~(19661118 & var19[var14 + -1][var15 + -1 + var36]) != -1 || ~(var19[var14 - -var36 + -1][var15 + -1] & 19661199) != -1) {
                        break;
                    }
                    ++var36;
                }
            }
            if (~var14 > -103 && ~var15 < -1 && class49.field871[var14 + 1][var15 + -1] == 0 && ~(19661070 & var19[var14 + 1][var15 + -1]) == -1 && (19661187 & var19[var14 - -arg9][var15 - 1]) == 0 && (var19[arg9 + var14][var15 - 1 - (-arg9 + 1)] & 19661280) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg9 + -1 <= var37) {
                        class19.field256[var41] = var14 + 1;
                        class196.field3502[var41] = var15 + -1;
                        class49.field871[var14 + 1][var15 + -1] = 9;
                        var41 = var41 + 1 & 4095;
                        class111.field1861[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if (~(var19[arg9 + var14][var15 - 1 - -var37] & 19661283) != -1 || ~(19661199 & var19[var14 + 1 + var37][var15 - 1]) != -1) {
                        break;
                    }
                    ++var37;
                }
            }
            if (var14 > 0 && var15 < 102 && ~class49.field871[var14 + -1][var15 + 1] == -1 && (var19[var14 + -1][var15 + 1] & 19661070) == 0 && (19661112 & var19[var14 + -1][var15 - -arg9]) == 0 && (var19[var14][arg9 + var15] & 19661280) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg9 - 1) {
                        class19.field256[var41] = var14 + -1;
                        class196.field3502[var41] = var15 - -1;
                        var41 = 4095 & var41 + 1;
                        class49.field871[var14 + -1][var15 - -1] = 6;
                        class111.field1861[var14 + -1][var15 + 1] = var31;
                        break;
                    }
                    if (~(var19[var14 - 1][var15 + 1 - -var38] & 19661118) != -1 || (var19[var14 - (-var38 + 1)][arg9 + var15] & 19661304) != 0) {
                        break;
                    }
                    ++var38;
                }
            }
            if (~var14 > -103 && ~var15 > -103 && ~class49.field871[var14 - -1][var15 + 1] == -1 && ~(19661112 & var19[var14 + 1][var15 - -arg9]) == -1 && (var19[var14 - -arg9][var15 - -arg9] & 19661280) == 0 && (var19[arg9 + var14][var15 + 1] & 19661187) == 0) {
                for (int var39 = 1; var39 < arg9 + -1; ++var39) {
                    if (~(19661304 & var19[var14 + var39 - -1][var15 - -arg9]) != -1 || (19661283 & var19[var14 - -arg9][var15 + 1 - -var39]) != 0) {
                        continue label372;
                    }
                }
                class19.field256[var41] = var14 + 1;
                class196.field3502[var41] = var15 - -1;
                var41 = var41 + 1 & 4095;
                class49.field871[var14 + 1][var15 + 1] = 12;
                class111.field1861[var14 - -1][var15 + 1] = var31;
            }
        }
        class45.field809 = 0;
        if (!var18) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = -var22 + arg1; ~(arg1 + var22) <= ~var23; ++var23) {
                for (int var24 = -var22 + arg7; ~var24 >= ~(arg7 - -var22); ++var24) {
                    if (var23 >= 0 && var24 >= 0 && ~var23 > -105 && ~var24 > -105 && class111.field1861[var23][var24] < 100) {
                        int var25 = 0;
                        if (~arg1 >= ~var23) {
                            if (~(arg1 + -1 - -arg4) > ~var23) {
                                var25 = -arg1 + -arg4 + 1 + var23;
                            }
                        } else {
                            var25 = arg1 - var23;
                        }
                        int var26 = 0;
                        if (~arg7 < ~var24) {
                            var26 = -var24 + arg7;
                        } else if (var24 > arg7 + -1 + arg11) {
                            var26 = -arg7 + 1 + var24 - arg11;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class111.field1861[var23][var24] < var21) {
                            var15 = var24;
                            var20 = var27;
                            var21 = class111.field1861[var23][var24];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg5 == var14 && arg3 == var15) {
                return false;
            }
            class45.field809 = 1;
        }
        byte var28 = 0;
        class19.field256[var28] = var14;
        int var42 = var28 + 1;
        class196.field3502[var28] = var15;
        int var29;
        int var30 = var29 = class49.field871[var14][var15];
        while (arg5 != var14 || ~arg3 != ~var15) {
            if (~var29 != ~var30) {
                var29 = var30;
                class19.field256[var42] = var14;
                class196.field3502[var42++] = var15;
            }
            if (~(var30 & 2) != -1) {
                ++var14;
            } else if ((var30 & 8) != 0) {
                --var14;
            }
            if (~(var30 & 1) == -1) {
                if ((4 & var30) != 0) {
                    --var15;
                }
            } else {
                ++var15;
            }
            var30 = class49.field871[var14][var15];
        }
        if (var42 > 0) {
            class17.method130(var42, arg0, 82);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
    public static void method1077(byte arg0) {
        field2686 = null;
        field2687 = null;
        field2684 = null;
        if (arg0 == -57) {
            field2680 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        int[][] var3 = super.field2053.method1775((byte) -103, arg0);
        if (arg1 != -7) {
            return null;
        } else {
            if (super.field2053.field4558) {
                int[] var4 = this.method844(2, arg1 ^ -92, arg0);
                int[][] var5 = this.method843((byte) -79, arg0, 0);
                int[][] var6 = this.method843((byte) -71, arg0, 1);
                int[] var7 = var6[1];
                int[] var8 = var5[2];
                int[] var9 = var6[2];
                int[] var10 = var3[0];
                int[] var11 = var6[0];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var3[1];
                int[] var15 = var3[2];
                for (int var16 = 0; var16 < class64.field1132; ++var16) {
                    int var17 = var4[var16];
                    if (var17 == 4096) {
                        var10[var16] = var12[var16];
                        var14[var16] = var13[var16];
                        var15[var16] = var8[var16];
                    } else if (~var17 == -1) {
                        var10[var16] = var11[var16];
                        var14[var16] = var7[var16];
                        var15[var16] = var9[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var10[var16] = var11[var16] * var18 + var12[var16] * var17 >> 12;
                        var14[var16] = var7[var16] * var18 + var13[var16] * var17 >> 12;
                        var15[var16] = var8[var16] * var17 + var9[var16] * var18 >> 12;
                    }
                }
            }
            ++field2689;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lng;[Lc;[Lc;[Lli;[Lc;[Lc;I)V")
    public static final void method1078(class121 arg0, class60[] arg1, class60[] arg2, class155[] arg3, class60[] arg4, class60[] arg5, int arg6) {
        int var7 = 106 / ((37 - arg6) / 56);
        class55.field1017 = arg5;
        class227.field4090 = arg3;
        ++field2688;
        class153.field2627 = arg0;
        class242.field4320 = arg1;
        class218.field3834 = arg4;
        class22.field313 = arg2;
        class149.field2577.method1178(true);
        int var8 = class153.field2627.method824(true, class51.field910);
        int[] var9 = class153.field2627.method811(var8, 0);
        for (int var10 = 0; var10 < var9.length; ++var10) {
            class149.field2577.method1176(class117.method779(85, new class225(class153.field2627.method826((byte) 35, var8, var9[var10]))), (byte) 38);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        int[] var3 = super.field2064.method378(arg1, 0);
        ++field2691;
        if (arg0 < 68) {
            field2686 = null;
        }
        if (super.field2064.field1035) {
            int[] var4 = this.method844(0, 119, arg1);
            int[] var5 = this.method844(1, 54, arg1);
            int[] var6 = this.method844(2, 124, arg1);
            for (int var7 = 0; ~class64.field1132 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 != 0) {
                        var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }
}
