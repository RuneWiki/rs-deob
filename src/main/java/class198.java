import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class198 extends class28 {

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lrc;")
    public static class9 field2817 = new class9(50);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2823 = "Members object";

    @OriginalMember(owner = "client!da", name = "P", descriptor = "B")
    public byte field2818;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lqi;")
    public class216 field2812;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2815;
        int var9 = 0;
        if (arg7 != -1) {
            field2817 = null;
        }
        while (~var9 > ~class200.field2840.field2238) {
            if (class200.field2840.method1009(var9, 13578)) {
                int[] var10 = class173.field2480.method434(class200.field2840.field2228[var9] & 16383, (268425473 & class200.field2840.field2228[var9]) >> 14, -1, (class200.field2840.field2228[var9] & 1033958301) >> 28);
                if (var10 != null) {
                    int var11 = var10[1] + -class230.field3313;
                    int var12 = class133.field1940 + -1 - (var10[2] + -class1.field1);
                    int var13 = (var11 - arg1) * (-arg3 + arg5) / (arg2 - arg1) + arg3;
                    int var14 = (arg4 - arg0) * (-arg6 + var12) / (-arg6 + arg8) + arg0;
                    int var15 = class200.field2840.method1006(arg7 ^ 102, var9);
                    int var16 = 16777215;
                    class262 var17 = null;
                    if (~var15 == -1) {
                        if ((double) class35.field414 == 3.0D) {
                            var17 = class59.field700;
                        }
                        if ((double) class35.field414 == 4.0D) {
                            var17 = class103.field1406;
                        }
                        if ((double) class35.field414 == 6.0D) {
                            var17 = class130.field1874;
                        }
                        if ((double) class35.field414 >= 8.0D) {
                            var17 = class87.field1183;
                        }
                    }
                    if (~var15 == -2) {
                        if ((double) class35.field414 == 3.0D) {
                            var17 = class130.field1874;
                        }
                        if ((double) class35.field414 == 4.0D) {
                            var17 = class87.field1183;
                        }
                        if ((double) class35.field414 == 6.0D) {
                            var17 = class80.field952;
                        }
                        if ((double) class35.field414 >= 8.0D) {
                            var17 = class238.field3439;
                        }
                    }
                    if (~var15 == -3) {
                        var16 = 16755200;
                        if ((double) class35.field414 == 3.0D) {
                            var17 = class80.field952;
                        }
                        if ((double) class35.field414 == 4.0D) {
                            var17 = class238.field3439;
                        }
                        if ((double) class35.field414 == 6.0D) {
                            var17 = class24.field292;
                        }
                        if ((double) class35.field414 >= 8.0D) {
                            var17 = class220.field3117;
                        }
                    }
                    if (~class200.field2840.field2225[var9] != 0) {
                        var16 = class200.field2840.field2225[var9];
                    }
                    if (var17 != null) {
                        int var18 = class11.field141.method535(class200.field2840.field2229[var9], (int[]) null, class175.field2490);
                        int var19 = var14 - (var18 - 1) * var17.method1674() / 2;
                        int var20 = var19 + var17.method1681() / 2;
                        for (int var21 = 0; ~var21 > ~var18; ++var21) {
                            String var22 = class175.field2490[var21];
                            if (~(var18 + -1) < ~var21) {
                                var22 = var22.substring(0, -4 + var22.length());
                            }
                            var17.method1678(var22, var13, var20, var16, true);
                            var20 += var17.method1674();
                        }
                    }
                }
            }
            ++var9;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)I")
    public final int method169(int arg0) {
        if (arg0 != 16) {
            return 56;
        } else {
            ++field2813;
            return this.field2812 == null ? 0 : this.field2812.field3021 * 100 / (this.field2812.field3030.length - this.field2818);
        }
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(I)V")
    public static void method1274(int arg0) {
        field2823 = null;
        if (arg0 == 16777215) {
            field2817 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
    public static final void method1275(boolean arg0, int arg1) {
        class173.field2480 = (class71) class28.field342.method1895((long) arg1, -111);
        if (!arg0) {
            field2822 = 46;
        }
        ++field2820;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[IIZIIIIII)V")
    public static final void method1276(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2814;
        int var11 = arg7;
        if (arg7 < class155.field2246) {
            if (~class155.field2248 < ~arg7) {
                var11 = class155.field2248;
            }
            int var12 = arg7 + arg8;
            if (~class155.field2248 > ~var12) {
                if (arg5 <= 110) {
                    field2819 = -40;
                }
                int var13 = arg6;
                if (class155.field2246 < var12) {
                    var12 = class155.field2246;
                }
                if (class155.field2241 > arg6) {
                    int var14 = arg1 + arg6;
                    if (class155.field2240 > arg6) {
                        var13 = class155.field2240;
                    }
                    if (~class155.field2240 > ~var14) {
                        if (~var14 < ~class155.field2241) {
                            var14 = class155.field2241;
                        }
                        int var15 = var14 - arg6;
                        int var16 = class155.field2244 * var13 + var11;
                        int var17 = class155.field2244 - var12 + var11;
                        int var18 = var11 - arg7;
                        int var19 = -var18 + arg8;
                        if (arg0 == 9) {
                            arg0 = 1;
                            arg9 = arg9 - -1 & 3;
                        }
                        int var20 = var13 - arg6;
                        int var21 = arg1 - var20;
                        int var22 = -var15 + arg1;
                        int var23 = var12 - arg7;
                        int var24 = arg8 - var23;
                        if (arg0 == 10) {
                            arg0 = 1;
                            arg9 = arg9 - -3 & 3;
                        }
                        if (~arg0 == -12) {
                            arg9 = arg9 + 3 & 3;
                            arg0 = 8;
                        }
                        if (~arg0 == -2) {
                            if (~arg9 == -1) {
                                for (int var25 = var20; var25 < var15; ++var25) {
                                    for (int var26 = var18; ~var23 < ~var26; ++var26) {
                                        if (var26 <= var25) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 1) {
                                for (int var27 = var21 + -1; ~var27 <= ~var22; --var27) {
                                    for (int var28 = var18; ~var28 > ~var23; ++var28) {
                                        if (~var27 > ~var28) {
                                            if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                        } else {
                                            arg2[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (~arg9 == -3) {
                                for (int var29 = var20; ~var15 < ~var29; ++var29) {
                                    for (int var30 = var18; var23 > var30; ++var30) {
                                        if (~var30 > ~var29) {
                                            if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                        } else {
                                            arg2[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 3) {
                                for (int var31 = var21 + -1; ~var22 >= ~var31; --var31) {
                                    for (int var32 = var18; var23 > var32; ++var32) {
                                        if (var32 < var31) {
                                            if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                        } else {
                                            arg2[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            }
                        } else if (~arg0 == -3) {
                            if (~arg9 == -1) {
                                for (int var33 = var21 + -1; ~var33 <= ~var22; --var33) {
                                    for (int var34 = var18; ~var34 > ~var23; ++var34) {
                                        if (var34 > var33 >> 1) {
                                            if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                        } else {
                                            arg2[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 1) {
                                for (int var35 = var20; ~var35 > ~var15; ++var35) {
                                    for (int var36 = var18; ~var23 < ~var36; ++var36) {
                                        if (var16 >= 0 && ~var16 > ~arg2.length) {
                                            if (var35 << 1 <= var36) {
                                                arg2[var16] = arg10;
                                            } else if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                            ++var16;
                                        } else {
                                            ++var16;
                                        }
                                    }
                                    var16 += var17;
                                }
                            } else if (~arg9 == -3) {
                                for (int var37 = var20; ~var15 < ~var37; ++var37) {
                                    for (int var38 = var19 + -1; ~var24 >= ~var38; --var38) {
                                        if (~(var37 >> 1) <= ~var38) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 3) {
                                for (int var39 = var21 - 1; var39 >= var22; --var39) {
                                    for (int var40 = var19 - 1; ~var40 <= ~var24; --var40) {
                                        if (~(var39 << 1) >= ~var40) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            }
                        } else if (arg0 == 3) {
                            if (arg9 == 0) {
                                for (int var41 = var21 + -1; ~var22 >= ~var41; --var41) {
                                    for (int var42 = var19 + -1; var24 <= var42; --var42) {
                                        if (~(var41 >> 1) > ~var42) {
                                            if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                        } else {
                                            arg2[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (~arg9 == -2) {
                                for (int var43 = var21 + -1; var43 >= var22; --var43) {
                                    for (int var44 = var18; var23 > var44; ++var44) {
                                        if (var44 >= var43 << 1) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 2) {
                                for (int var45 = var20; ~var15 < ~var45; ++var45) {
                                    for (int var46 = var18; var23 > var46; ++var46) {
                                        if (var46 <= var45 >> 1) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 3) {
                                for (int var47 = var20; ~var47 > ~var15; ++var47) {
                                    for (int var48 = var19 + -1; var24 <= var48; --var48) {
                                        if (var47 << 1 <= var48) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            }
                        } else if (~arg0 == -5) {
                            if (~arg9 == -1) {
                                for (int var49 = var21 + -1; ~var22 >= ~var49; --var49) {
                                    for (int var50 = var18; var50 < var23; ++var50) {
                                        if (~(var49 >> 1) >= ~var50) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (~arg9 == -2) {
                                for (int var51 = var20; var15 > var51; ++var51) {
                                    for (int var52 = var18; var23 > var52; ++var52) {
                                        if (~var52 >= ~(var51 << 1)) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (~arg9 == -3) {
                                for (int var53 = var20; ~var53 > ~var15; ++var53) {
                                    for (int var54 = var19 + -1; var24 <= var54; --var54) {
                                        if (~(var53 >> 1) < ~var54) {
                                            if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                        } else {
                                            arg2[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 3) {
                                for (int var55 = var21 - 1; var22 <= var55; --var55) {
                                    for (int var56 = var19 - 1; ~var56 <= ~var24; --var56) {
                                        if (var56 <= var55 << 1) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            }
                        } else if (arg0 == 5) {
                            if (arg9 == 0) {
                                for (int var57 = var21 + -1; var22 <= var57; --var57) {
                                    for (int var58 = var19 + -1; ~var58 <= ~var24; --var58) {
                                        if (~var58 <= ~(var57 >> 1)) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (~arg9 == -2) {
                                for (int var59 = var21 - 1; ~var59 <= ~var22; --var59) {
                                    for (int var60 = var18; var60 < var23; ++var60) {
                                        if (~(var59 << 1) <= ~var60) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 2) {
                                for (int var61 = var20; ~var15 < ~var61; ++var61) {
                                    for (int var62 = var18; ~var23 < ~var62; ++var62) {
                                        if (~(var61 >> 1) >= ~var62) {
                                            arg2[var16] = arg10;
                                        } else if (arg4) {
                                            arg2[var16] = arg3;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            } else if (arg9 == 3) {
                                for (int var63 = var20; ~var15 < ~var63; ++var63) {
                                    for (int var64 = var19 - 1; ~var64 <= ~var24; --var64) {
                                        if (var63 << 1 < var64) {
                                            if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                        } else {
                                            arg2[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var17;
                                }
                            }
                        } else {
                            if (arg0 == 6) {
                                if (arg9 == 0) {
                                    for (int var65 = var20; ~var65 > ~var15; ++var65) {
                                        for (int var66 = var18; var66 < var23; ++var66) {
                                            if (~(arg8 / 2) > ~var66) {
                                                if (arg4) {
                                                    arg2[var16] = arg3;
                                                }
                                            } else {
                                                arg2[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (~arg9 == -2) {
                                    for (int var67 = var20; ~var67 > ~var15; ++var67) {
                                        for (int var68 = var18; var68 < var23; ++var68) {
                                            if (~(arg1 / 2) > ~var67) {
                                                if (arg4) {
                                                    arg2[var16] = arg3;
                                                }
                                            } else {
                                                arg2[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (arg9 == 2) {
                                    for (int var69 = var20; var15 > var69; ++var69) {
                                        for (int var70 = var18; var23 > var70; ++var70) {
                                            if (~var70 <= ~(arg8 / 2)) {
                                                arg2[var16] = arg10;
                                            } else if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (arg9 == 3) {
                                    for (int var71 = var20; var15 > var71; ++var71) {
                                        for (int var72 = var18; var72 < var23; ++var72) {
                                            if (arg1 / 2 > var71) {
                                                if (arg4) {
                                                    arg2[var16] = arg3;
                                                }
                                            } else {
                                                arg2[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                            }
                            if (arg0 == 7) {
                                if (~arg9 == -1) {
                                    for (int var73 = var20; ~var73 > ~var15; ++var73) {
                                        for (int var74 = var18; var23 > var74; ++var74) {
                                            if (~var74 < ~(-(arg1 / 2) + var73)) {
                                                if (arg4) {
                                                    arg2[var16] = arg3;
                                                }
                                            } else {
                                                arg2[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (arg9 == 1) {
                                    for (int var75 = var21 + -1; var75 >= var22; --var75) {
                                        for (int var76 = var18; var76 < var23; ++var76) {
                                            if (-(arg1 / 2) + var75 < var76) {
                                                if (arg4) {
                                                    arg2[var16] = arg3;
                                                }
                                            } else {
                                                arg2[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (arg9 == 2) {
                                    for (int var77 = var21 + -1; ~var22 >= ~var77; --var77) {
                                        for (int var78 = var19 + -1; ~var78 <= ~var24; --var78) {
                                            if (var78 <= -(arg1 / 2) + var77) {
                                                arg2[var16] = arg10;
                                            } else if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (~arg9 == -4) {
                                    for (int var79 = var20; ~var79 > ~var15; ++var79) {
                                        for (int var80 = var19 + -1; var80 >= var24; --var80) {
                                            if (~var80 < ~(-(arg1 / 2) + var79)) {
                                                if (arg4) {
                                                    arg2[var16] = arg3;
                                                }
                                            } else {
                                                arg2[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                            }
                            if (~arg0 == -9) {
                                if (~arg9 == -1) {
                                    for (int var81 = var20; var81 < var15; ++var81) {
                                        for (int var82 = var18; ~var23 < ~var82; ++var82) {
                                            if (var82 >= -(arg1 / 2) + var81) {
                                                arg2[var16] = arg10;
                                            } else if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (~arg9 == -2) {
                                    for (int var83 = var21 + -1; ~var22 >= ~var83; --var83) {
                                        for (int var84 = var18; var84 < var23; ++var84) {
                                            if (-(arg1 / 2) + var83 > var84) {
                                                if (arg4) {
                                                    arg2[var16] = arg3;
                                                }
                                            } else {
                                                arg2[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (~arg9 == -3) {
                                    for (int var85 = var21 + -1; ~var85 <= ~var22; --var85) {
                                        for (int var86 = var19 + -1; ~var24 >= ~var86; --var86) {
                                            if (var86 < var85 - arg1 / 2) {
                                                if (arg4) {
                                                    arg2[var16] = arg3;
                                                }
                                            } else {
                                                arg2[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                                if (~arg9 == -4) {
                                    for (int var87 = var20; var15 > var87; ++var87) {
                                        for (int var88 = var19 + -1; ~var24 >= ~var88; --var88) {
                                            if (~var88 <= ~(-(arg1 / 2) + var87)) {
                                                arg2[var16] = arg10;
                                            } else if (arg4) {
                                                arg2[var16] = arg3;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/util/Random;)I")
    public static final int method1277(byte arg0, int arg1, Random arg2) {
        if (arg0 != 37) {
            method1276(-55, -91, (int[]) null, -84, true, 27, 27, -104, 92, -40, 58);
        }
        ++field2811;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class227.method1472((byte) -88, arg1)) {
            return (int) (((long) arg2.nextInt() & 4294967295L) * (long) arg1 >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class294.method1968(var4, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)[B")
    public final byte[] method170(int arg0) {
        ++field2816;
        if (!super.field338 && this.field2812.field3030.length - this.field2818 <= this.field2812.field3021) {
            if (arg0 > -42) {
                method1274(65);
            }
            return this.field2812.field3030;
        } else {
            throw new RuntimeException();
        }
    }
}
