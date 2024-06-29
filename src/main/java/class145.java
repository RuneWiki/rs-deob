import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class145 extends class117 {

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    private int field2751 = 204;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    private int field2753 = 409;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    private int field2758 = 81;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
    private int field2764 = 4;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    private int field2748 = 1024;

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "I")
    private int field2767 = 8;

    @OriginalMember(owner = "client!bf", name = "qb", descriptor = "I")
    private int field2773 = 0;

    @OriginalMember(owner = "client!bf", name = "pb", descriptor = "I")
    private int field2772 = 1024;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    public static int field2759 = 0;

    @OriginalMember(owner = "client!bf", name = "lb", descriptor = "I")
    public static int field2768 = 0;

    @OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    private int field2762;

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!bf", name = "mb", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!bf", name = "rb", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
    private int field2775;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "Lkk;")
    public static class231 field2760;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "[I")
    private int[] field2750;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "[I")
    public static int[] field2763;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "[[I")
    private int[][] field2765;

    @OriginalMember(owner = "client!bf", name = "ob", descriptor = "[[I")
    private int[][] field2771;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field2761;
        if (arg0 != -21393) {
            this.field2748 = 21;
        }
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int var4 = 0;
            int var5;
            for (var5 = class214.field3911[arg1] + this.field2773; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field2767 && ~var5 <= ~this.field2750[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            int var7 = this.field2750[var4];
            int var8 = this.field2750[var4 - 1];
            boolean var9 = (var4 & 1) == 0;
            if (var8 - -this.field2775 < var5 && ~var5 > ~(-this.field2775 + var7)) {
                for (int var10 = 0; ~var10 > ~class143.field2702; ++var10) {
                    int var11 = var9 ? this.field2772 : -this.field2772;
                    int var12;
                    for (var12 = (this.field2762 * var11 >> 12) + class26.field402[var10]; ~var12 > -1; var12 += 4096) {
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    int var13;
                    for (var13 = 0; var13 < this.field2764 && ~this.field2765[var6][var13] >= ~var12; ++var13) {
                    }
                    int var14 = var13 + -1;
                    int var15 = this.field2765[var6][var13];
                    int var16 = this.field2765[var6][var14];
                    if (var12 > this.field2775 + var16 && ~var12 > ~(-this.field2775 + var15)) {
                        var3[var10] = this.field2771[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class241.method1665(var3, 0, class143.field2702, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[IIIIIZI)V")
    public static final void method1097(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        ++field2757;
        int var11 = arg1;
        if (arg1 < class206.field3718) {
            if (~arg1 > ~class206.field3719) {
                var11 = class206.field3719;
            }
            int var12 = arg1 + arg8;
            if (~class206.field3719 > ~var12) {
                if (class206.field3718 < var12) {
                    var12 = class206.field3718;
                }
                int var13 = arg7;
                if (arg7 < class206.field3717) {
                    if (~class206.field3712 < ~arg7) {
                        var13 = class206.field3712;
                    }
                    int var14 = arg0 + arg7;
                    if (var14 > class206.field3712) {
                        if (~arg6 == -10) {
                            arg6 = 1;
                            arg2 = arg2 - -1 & 3;
                        }
                        if (class206.field3717 < var14) {
                            var14 = class206.field3717;
                        }
                        if (~arg6 == -11) {
                            arg6 = 1;
                            arg2 = arg2 + 3 & 3;
                        }
                        int var15 = var14 - arg7;
                        int var16 = class206.field3713 * var13 + var11;
                        if (~arg6 == -12) {
                            arg6 = 8;
                            arg2 = 3 & arg2 + 3;
                        }
                        int var17 = var13 - arg7;
                        int var18 = var11 - var12 + class206.field3713;
                        int var19 = var12 - arg1;
                        int var20 = var11 - arg1;
                        int var21 = arg8 - var19;
                        if (arg3 != 5841) {
                            field2768 = 90;
                        }
                        int var22 = -var15 + arg0;
                        int var23 = -var20 + arg8;
                        int var24 = arg0 - var17;
                        if (~arg6 == -2) {
                            if (~arg2 == -1) {
                                for (int var25 = var17; ~var15 < ~var25; ++var25) {
                                    for (int var26 = var20; var19 > var26; ++var26) {
                                        if (~var26 < ~var25) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -2) {
                                for (int var27 = var24 - 1; var22 <= var27; --var27) {
                                    for (int var28 = var20; var28 < var19; ++var28) {
                                        if (~var28 < ~var27) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -3) {
                                for (int var29 = var17; ~var29 > ~var15; ++var29) {
                                    for (int var30 = var20; ~var19 < ~var30; ++var30) {
                                        if (~var29 < ~var30) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -4) {
                                for (int var31 = var24 + -1; var22 <= var31; --var31) {
                                    for (int var32 = var20; ~var32 > ~var19; ++var32) {
                                        if (var31 <= var32) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else if (arg6 == 2) {
                            if (arg2 == 0) {
                                for (int var33 = var24 + -1; var33 >= var22; --var33) {
                                    for (int var34 = var20; ~var19 < ~var34; ++var34) {
                                        if (~(var33 >> 1) > ~var34) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -2) {
                                for (int var35 = var17; var35 < var15; ++var35) {
                                    for (int var36 = var20; ~var19 < ~var36; ++var36) {
                                        if (var16 >= 0 && ~var16 > ~arg4.length) {
                                            if (var36 < var35 << 1) {
                                                if (arg9) {
                                                    arg4[var16] = arg10;
                                                }
                                            } else {
                                                arg4[var16] = arg5;
                                            }
                                            ++var16;
                                        } else {
                                            ++var16;
                                        }
                                    }
                                    var16 += var18;
                                }
                            } else if (arg2 == 2) {
                                for (int var37 = var17; var15 > var37; ++var37) {
                                    for (int var38 = var23 - 1; var38 >= var21; --var38) {
                                        if (var37 >> 1 < var38) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -4) {
                                for (int var39 = var24 - 1; var22 <= var39; --var39) {
                                    for (int var40 = var23 + -1; var21 <= var40; --var40) {
                                        if (~var40 > ~(var39 << 1)) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else if (arg6 == 3) {
                            if (~arg2 == -1) {
                                for (int var41 = var24 - 1; var22 <= var41; --var41) {
                                    for (int var42 = var23 + -1; ~var42 <= ~var21; --var42) {
                                        if (~(var41 >> 1) <= ~var42) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -2) {
                                for (int var43 = var24 - 1; ~var43 <= ~var22; --var43) {
                                    for (int var44 = var20; ~var19 < ~var44; ++var44) {
                                        if (~var44 > ~(var43 << 1)) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (arg2 == 2) {
                                for (int var45 = var17; var15 > var45; ++var45) {
                                    for (int var46 = var20; ~var19 < ~var46; ++var46) {
                                        if (~(var45 >> 1) > ~var46) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -4) {
                                for (int var47 = var17; var47 < var15; ++var47) {
                                    for (int var48 = var23 - 1; var48 >= var21; --var48) {
                                        if (var47 << 1 <= var48) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else if (~arg6 == -5) {
                            if (arg2 == 0) {
                                for (int var49 = var24 - 1; var22 <= var49; --var49) {
                                    for (int var50 = var20; var19 > var50; ++var50) {
                                        if (~(var49 >> 1) < ~var50) {
                                            if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                        } else {
                                            arg4[var16] = arg5;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (arg2 == 1) {
                                for (int var51 = var17; var51 < var15; ++var51) {
                                    for (int var52 = var20; var52 < var19; ++var52) {
                                        if (~(var51 << 1) <= ~var52) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -3) {
                                for (int var53 = var17; ~var53 > ~var15; ++var53) {
                                    for (int var54 = var23 + -1; ~var21 >= ~var54; --var54) {
                                        if (~var54 <= ~(var53 >> 1)) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -4) {
                                for (int var55 = var24 + -1; ~var55 <= ~var22; --var55) {
                                    for (int var56 = var23 + -1; ~var56 <= ~var21; --var56) {
                                        if (~(var55 << 1) <= ~var56) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else if (~arg6 == -6) {
                            if (arg2 == 0) {
                                for (int var57 = var24 + -1; ~var22 >= ~var57; --var57) {
                                    for (int var58 = var23 + -1; var58 >= var21; --var58) {
                                        if (~var58 <= ~(var57 >> 1)) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg2 == -2) {
                                for (int var59 = var24 + -1; var59 >= var22; --var59) {
                                    for (int var60 = var20; var19 > var60; ++var60) {
                                        if (~var60 >= ~(var59 << 1)) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (arg2 == 2) {
                                for (int var61 = var17; ~var15 < ~var61; ++var61) {
                                    for (int var62 = var20; ~var19 < ~var62; ++var62) {
                                        if (var62 >= var61 >> 1) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (arg2 == 3) {
                                for (int var63 = var17; ~var63 > ~var15; ++var63) {
                                    for (int var64 = var23 - 1; ~var64 <= ~var21; --var64) {
                                        if (var63 << 1 >= var64) {
                                            arg4[var16] = arg5;
                                        } else if (arg9) {
                                            arg4[var16] = arg10;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else {
                            if (~arg6 == -7) {
                                if (arg2 == 0) {
                                    for (int var65 = var17; var65 < var15; ++var65) {
                                        for (int var66 = var20; ~var66 > ~var19; ++var66) {
                                            if (arg8 / 2 >= var66) {
                                                arg4[var16] = arg5;
                                            } else if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (~arg2 == -2) {
                                    for (int var67 = var17; var67 < var15; ++var67) {
                                        for (int var68 = var20; ~var68 > ~var19; ++var68) {
                                            if (~var67 < ~(arg0 / 2)) {
                                                if (arg9) {
                                                    arg4[var16] = arg10;
                                                }
                                            } else {
                                                arg4[var16] = arg5;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (arg2 == 2) {
                                    for (int var69 = var17; ~var69 > ~var15; ++var69) {
                                        for (int var70 = var20; var70 < var19; ++var70) {
                                            if (arg8 / 2 > var70) {
                                                if (arg9) {
                                                    arg4[var16] = arg10;
                                                }
                                            } else {
                                                arg4[var16] = arg5;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (~arg2 == -4) {
                                    for (int var71 = var17; ~var15 < ~var71; ++var71) {
                                        for (int var72 = var20; var19 > var72; ++var72) {
                                            if (var71 < arg0 / 2) {
                                                if (arg9) {
                                                    arg4[var16] = arg10;
                                                }
                                            } else {
                                                arg4[var16] = arg5;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                            }
                            if (arg6 == 7) {
                                if (arg2 == 0) {
                                    for (int var73 = var17; ~var15 < ~var73; ++var73) {
                                        for (int var74 = var20; ~var74 > ~var19; ++var74) {
                                            if (~var74 >= ~(-(arg0 / 2) + var73)) {
                                                arg4[var16] = arg5;
                                            } else if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (arg2 == 1) {
                                    for (int var75 = var24 + -1; ~var22 >= ~var75; --var75) {
                                        for (int var76 = var20; var76 < var19; ++var76) {
                                            if (~var76 >= ~(-(arg0 / 2) + var75)) {
                                                arg4[var16] = arg5;
                                            } else if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (arg2 == 2) {
                                    for (int var77 = var24 + -1; var22 <= var77; --var77) {
                                        for (int var78 = var23 + -1; var21 <= var78; --var78) {
                                            if (~(-(arg0 / 2) + var77) > ~var78) {
                                                if (arg9) {
                                                    arg4[var16] = arg10;
                                                }
                                            } else {
                                                arg4[var16] = arg5;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (~arg2 == -4) {
                                    for (int var79 = var17; ~var15 < ~var79; ++var79) {
                                        for (int var80 = var23 + -1; ~var21 >= ~var80; --var80) {
                                            if (~(-(arg0 / 2) + var79) <= ~var80) {
                                                arg4[var16] = arg5;
                                            } else if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                            }
                            if (arg6 == 8) {
                                if (~arg2 == -1) {
                                    for (int var81 = var17; ~var81 > ~var15; ++var81) {
                                        for (int var82 = var20; ~var82 > ~var19; ++var82) {
                                            if (var82 < -(arg0 / 2) + var81) {
                                                if (arg9) {
                                                    arg4[var16] = arg10;
                                                }
                                            } else {
                                                arg4[var16] = arg5;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (arg2 == 1) {
                                    for (int var83 = var24 + -1; ~var22 >= ~var83; --var83) {
                                        for (int var84 = var20; var84 < var19; ++var84) {
                                            if (~(-(arg0 / 2) + var83) >= ~var84) {
                                                arg4[var16] = arg5;
                                            } else if (arg9) {
                                                arg4[var16] = arg10;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (~arg2 == -3) {
                                    for (int var85 = var24 - 1; ~var22 >= ~var85; --var85) {
                                        for (int var86 = var23 + -1; ~var86 <= ~var21; --var86) {
                                            if (var86 < -(arg0 / 2) + var85) {
                                                if (arg9) {
                                                    arg4[var16] = arg10;
                                                }
                                            } else {
                                                arg4[var16] = arg5;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                    return;
                                }
                                if (arg2 == 3) {
                                    for (int var87 = var17; var87 < var15; ++var87) {
                                        for (int var88 = var23 + -1; ~var88 <= ~var21; --var88) {
                                            if (-(arg0 / 2) + var87 > var88) {
                                                if (arg9) {
                                                    arg4[var16] = arg10;
                                                }
                                            } else {
                                                arg4[var16] = arg5;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
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

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lje;ZLje;)V")
    public static final void method1098(class152 arg0, boolean arg1, class152 arg2) {
        ++field2756;
        if (arg2.field2855 != null) {
            arg2.method1127(-24137);
        }
        arg2.field2855 = arg0;
        arg2.field2854 = arg0.field2854;
        if (arg1) {
            method1100(-69);
        }
        arg2.field2855.field2854 = arg2;
        arg2.field2854.field2855 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field2748 = arg2.method658(arg0 ^ 88);
                                    }
                                } else {
                                    this.field2758 = arg2.method658(-124);
                                }
                            } else {
                                this.field2773 = arg2.method658(arg0 ^ -128);
                            }
                        } else {
                            this.field2772 = arg2.method658(arg0 ^ -92);
                        }
                    } else {
                        this.field2751 = arg2.method658(93);
                    }
                } else {
                    this.field2753 = arg2.method658(-82);
                }
            } else {
                this.field2767 = arg2.method622(true);
            }
        } else {
            this.field2764 = arg2.method622(true);
        }
        if (arg0 != 0) {
            this.field2753 = -123;
        }
        ++field2769;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        if (arg0 > -92) {
            this.method61(101, -98);
        }
        this.method1099(true);
        ++field2754;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    private final void method1099(boolean arg0) {
        ++field2752;
        Random var2 = new Random((long) this.field2767);
        this.field2762 = 4096 / this.field2764;
        this.field2750 = new int[this.field2767 - -1];
        this.field2750[0] = 0;
        this.field2775 = this.field2758 / 2;
        if (arg0) {
            this.field2765 = new int[this.field2767][this.field2764 + 1];
            this.field2755 = 4096 / this.field2767;
            this.field2771 = new int[this.field2767][this.field2764];
            int var3 = this.field2762 / 2;
            int var4 = this.field2755 / 2;
            for (int var5 = 0; ~this.field2767 < ~var5; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field2755;
                    int var7 = (class127.method1012(4096, var2, -22067) + -2048) * this.field2751 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field2750[var5] = this.field2750[var5 + -1] - -var8;
                }
                this.field2765[var5][0] = 0;
                for (int var9 = 0; var9 < this.field2764; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field2762;
                        int var11 = (-2048 + class127.method1012(4096, var2, -22067)) * this.field2753 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field2765[var5][var9] = this.field2765[var5][var9 + -1] + var12;
                    }
                    this.field2771[var5][var9] = ~this.field2748 < -1 ? 4096 - class127.method1012(this.field2748, var2, -22067) : 4096;
                }
                this.field2765[var5][this.field2764] = 4096;
            }
            this.field2750[this.field2767] = 4096;
        }
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
    public static void method1100(int arg0) {
        if (arg0 == 24913) {
            field2763 = null;
            field2760 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[Lhh;)Lhh;")
    public static final class163 method1101(int arg0, class163[] arg1) {
        ++field2766;
        if (~arg1.length > -3) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 != 0) {
                field2760 = null;
            }
            return class182.method1349(0, arg1, -105, arg1.length);
        }
    }
}
