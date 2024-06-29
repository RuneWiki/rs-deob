import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class64 extends class223 {

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    private int field1004 = 0;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    private int field1007 = 0;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    private int field1000 = 0;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1010 = "scroll:";

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[I")
    public static int[] field1006 = new int[32];

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "[I")
    public static int[] field1018;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field1021;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field1020;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field1015;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lwd;")
    public static class23 field1016;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
    private final void method509(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -2016422100) {
            field1010 = null;
        }
        ++field1014;
        int var5 = ~arg3 > ~arg1 ? arg1 : arg3;
        int var6 = ~arg0 >= ~var5 ? var5 : arg0;
        int var7 = arg1 < arg3 ? arg1 : arg3;
        int var8 = var7 > arg0 ? arg0 : var7;
        this.field1003 = (var8 - -var6) / 2;
        int var9 = -var8 + var6;
        if (this.field1003 > 0 && ~this.field1003 > -4097) {
            this.field999 = (var9 << 12) / (~this.field1003 >= -2049 ? this.field1003 * 2 : -(this.field1003 * 2) + 8192);
        } else {
            this.field999 = 0;
        }
        if (var9 <= 0) {
            this.field1002 = 0;
        } else {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (~arg1 != ~var6) {
                if (arg3 == var6) {
                    this.field1002 = arg0 == var8 ? 4096 - -var10 : -var12 + 12288;
                } else {
                    this.field1002 = ~arg1 != ~var8 ? -var10 + 20480 : 12288 - -var11;
                }
            } else {
                this.field1002 = ~arg3 != ~var8 ? -var11 + 4096 : 20480 - -var12;
            }
            this.field1002 /= 6;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIZI[II)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int[] arg9, int arg10) {
        int var11 = arg1;
        ++field1001;
        if (~class66.field1030 < ~arg1) {
            if (~class66.field1031 < ~arg1) {
                var11 = class66.field1031;
            }
            int var12 = arg1 + arg10;
            if (class66.field1031 < var12) {
                if (var12 > class66.field1030) {
                    var12 = class66.field1030;
                }
                int var13 = arg2;
                if (~arg2 > ~class66.field1029) {
                    int var14 = arg2 + arg6;
                    if (arg2 < class66.field1033) {
                        var13 = class66.field1033;
                    }
                    if (class66.field1033 < var14) {
                        if (~arg3 == -10) {
                            arg8 = 3 & arg8 + 1;
                            arg3 = 1;
                        }
                        if (~arg3 == -11) {
                            arg3 = 1;
                            arg8 = 3 & arg8 - -3;
                        }
                        if (class66.field1029 < var14) {
                            var14 = class66.field1029;
                        }
                        int var15 = var14 - arg2;
                        if (arg3 == 11) {
                            arg3 = 8;
                            arg8 = 3 & arg8 + 3;
                        }
                        int var16 = class66.field1036 * var13 + var11;
                        int var17 = var13 - arg2;
                        int var18 = -var12 + class66.field1036 + var11;
                        int var19 = var11 - arg1;
                        int var20 = var12 - arg1;
                        int var21 = arg6 - var15;
                        int var22 = arg10 - var19;
                        int var23 = -var20 + arg10;
                        int var24 = -var17 + arg6;
                        if (~arg3 == -2) {
                            if (arg8 == 0) {
                                for (int var25 = var17; var15 > var25; ++var25) {
                                    for (int var26 = var19; ~var26 > ~var20; ++var26) {
                                        if (~var25 <= ~var26) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (arg8 == 1) {
                                for (int var27 = var24 + -1; ~var27 <= ~var21; --var27) {
                                    for (int var28 = var19; var28 < var20; ++var28) {
                                        if (var28 <= var27) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg8 == -3) {
                                for (int var29 = var17; var29 < var15; ++var29) {
                                    for (int var30 = var19; ~var30 > ~var20; ++var30) {
                                        if (var29 > var30) {
                                            if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                        } else {
                                            arg9[var16] = arg4;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (arg8 == 3) {
                                for (int var31 = var24 + -1; var21 <= var31; --var31) {
                                    for (int var32 = var19; ~var20 < ~var32; ++var32) {
                                        if (var31 <= var32) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else if (~arg3 == -3) {
                            if (arg8 == 0) {
                                for (int var33 = var24 + -1; var33 >= var21; --var33) {
                                    for (int var34 = var19; var34 < var20; ++var34) {
                                        if (~var34 >= ~(var33 >> 1)) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg8 == -2) {
                                for (int var35 = var17; ~var35 > ~var15; ++var35) {
                                    for (int var36 = var19; ~var36 > ~var20; ++var36) {
                                        if (var16 >= 0 && var16 < arg9.length) {
                                            if (~var36 <= ~(var35 << 1)) {
                                                arg9[var16] = arg4;
                                            } else if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        } else {
                                            ++var16;
                                        }
                                    }
                                    var16 += var18;
                                }
                            } else if (arg8 == 2) {
                                for (int var37 = var17; var37 < var15; ++var37) {
                                    for (int var38 = var22 + -1; var38 >= var23; --var38) {
                                        if (var37 >> 1 < var38) {
                                            if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                        } else {
                                            arg9[var16] = arg4;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg8 == -4) {
                                for (int var39 = var24 + -1; var39 >= var21; --var39) {
                                    for (int var40 = var22 + -1; var40 >= var23; --var40) {
                                        if (~(var39 << 1) < ~var40) {
                                            if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                        } else {
                                            arg9[var16] = arg4;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else if (arg3 == 3) {
                            if (arg8 == 0) {
                                for (int var41 = var24 - 1; var41 >= var21; --var41) {
                                    for (int var42 = var22 - 1; ~var42 <= ~var23; --var42) {
                                        if (~(var41 >> 1) <= ~var42) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg8 == -2) {
                                for (int var43 = var24 + -1; ~var43 <= ~var21; --var43) {
                                    for (int var44 = var19; var44 < var20; ++var44) {
                                        if (var43 << 1 > var44) {
                                            if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                        } else {
                                            arg9[var16] = arg4;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg8 == -3) {
                                for (int var45 = var17; ~var15 < ~var45; ++var45) {
                                    for (int var46 = var19; ~var46 > ~var20; ++var46) {
                                        if (var46 <= var45 >> 1) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg8 == -4) {
                                for (int var47 = var17; var15 > var47; ++var47) {
                                    for (int var48 = var22 - 1; ~var23 >= ~var48; --var48) {
                                        if (~var48 > ~(var47 << 1)) {
                                            if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                        } else {
                                            arg9[var16] = arg4;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else if (arg3 == 4) {
                            if (arg8 == 0) {
                                for (int var49 = var24 + -1; var49 >= var21; --var49) {
                                    for (int var50 = var19; var50 < var20; ++var50) {
                                        if (~var50 <= ~(var49 >> 1)) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (arg8 == 1) {
                                for (int var51 = var17; var51 < var15; ++var51) {
                                    for (int var52 = var19; ~var52 > ~var20; ++var52) {
                                        if (~(var51 << 1) <= ~var52) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg8 == -3) {
                                for (int var53 = var17; ~var15 < ~var53; ++var53) {
                                    for (int var54 = var22 + -1; var23 <= var54; --var54) {
                                        if (~(var53 >> 1) >= ~var54) {
                                            arg9[var16] = arg4;
                                        } else if (arg7) {
                                            arg9[var16] = arg0;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            } else if (~arg8 == -4) {
                                for (int var55 = var24 + -1; var21 <= var55; --var55) {
                                    for (int var56 = var22 + -1; var56 >= var23; --var56) {
                                        if (var55 << 1 < var56) {
                                            if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                        } else {
                                            arg9[var16] = arg4;
                                        }
                                        ++var16;
                                    }
                                    var16 += var18;
                                }
                            }
                        } else {
                            if (arg5 != -863571583) {
                                method510(-46, 86, 68, 125, -105, -32, -84, true, -17, (int[]) null, -113);
                            }
                            if (arg3 == 5) {
                                if (arg8 == 0) {
                                    for (int var57 = var24 + -1; ~var21 >= ~var57; --var57) {
                                        for (int var58 = var22 + -1; var58 >= var23; --var58) {
                                            if (var57 >> 1 > var58) {
                                                if (arg7) {
                                                    arg9[var16] = arg0;
                                                }
                                            } else {
                                                arg9[var16] = arg4;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                } else if (~arg8 == -2) {
                                    for (int var59 = var24 + -1; var21 <= var59; --var59) {
                                        for (int var60 = var19; var20 > var60; ++var60) {
                                            if (var59 << 1 >= var60) {
                                                arg9[var16] = arg4;
                                            } else if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                } else if (arg8 == 2) {
                                    for (int var61 = var17; ~var61 > ~var15; ++var61) {
                                        for (int var62 = var19; var20 > var62; ++var62) {
                                            if (var62 >= var61 >> 1) {
                                                arg9[var16] = arg4;
                                            } else if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                } else if (arg8 == 3) {
                                    for (int var63 = var17; ~var15 < ~var63; ++var63) {
                                        for (int var64 = var22 + -1; ~var23 >= ~var64; --var64) {
                                            if (var64 <= var63 << 1) {
                                                arg9[var16] = arg4;
                                            } else if (arg7) {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var18;
                                    }
                                }
                            } else {
                                if (arg3 == 6) {
                                    if (~arg8 == -1) {
                                        for (int var65 = var17; ~var15 < ~var65; ++var65) {
                                            for (int var66 = var19; ~var20 < ~var66; ++var66) {
                                                if (arg10 / 2 < var66) {
                                                    if (arg7) {
                                                        arg9[var16] = arg0;
                                                    }
                                                } else {
                                                    arg9[var16] = arg4;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (~arg8 == -2) {
                                        for (int var67 = var17; var67 < var15; ++var67) {
                                            for (int var68 = var19; var68 < var20; ++var68) {
                                                if (arg6 / 2 >= var67) {
                                                    arg9[var16] = arg4;
                                                } else if (arg7) {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (~arg8 == -3) {
                                        for (int var69 = var17; ~var69 > ~var15; ++var69) {
                                            for (int var70 = var19; ~var20 < ~var70; ++var70) {
                                                if (arg10 / 2 <= var70) {
                                                    arg9[var16] = arg4;
                                                } else if (arg7) {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (arg8 == 3) {
                                        for (int var71 = var17; var15 > var71; ++var71) {
                                            for (int var72 = var19; ~var72 > ~var20; ++var72) {
                                                if (arg6 / 2 > var71) {
                                                    if (arg7) {
                                                        arg9[var16] = arg0;
                                                    }
                                                } else {
                                                    arg9[var16] = arg4;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                }
                                if (~arg3 == -8) {
                                    if (arg8 == 0) {
                                        for (int var73 = var17; var73 < var15; ++var73) {
                                            for (int var74 = var19; var20 > var74; ++var74) {
                                                if (~var74 < ~(-(arg6 / 2) + var73)) {
                                                    if (arg7) {
                                                        arg9[var16] = arg0;
                                                    }
                                                } else {
                                                    arg9[var16] = arg4;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (arg8 == 1) {
                                        for (int var75 = var24 - 1; ~var21 >= ~var75; --var75) {
                                            for (int var76 = var19; ~var20 < ~var76; ++var76) {
                                                if (-(arg6 / 2) + var75 >= var76) {
                                                    arg9[var16] = arg4;
                                                } else if (arg7) {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (arg8 == 2) {
                                        for (int var77 = var24 + -1; var21 <= var77; --var77) {
                                            for (int var78 = var22 + -1; ~var23 >= ~var78; --var78) {
                                                if (var78 <= -(arg6 / 2) + var77) {
                                                    arg9[var16] = arg4;
                                                } else if (arg7) {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (arg8 == 3) {
                                        for (int var79 = var17; ~var15 < ~var79; ++var79) {
                                            for (int var80 = var22 + -1; ~var80 <= ~var23; --var80) {
                                                if (~var80 < ~(var79 - arg6 / 2)) {
                                                    if (arg7) {
                                                        arg9[var16] = arg0;
                                                    }
                                                } else {
                                                    arg9[var16] = arg4;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                }
                                if (arg3 == 8) {
                                    if (~arg8 == -1) {
                                        for (int var81 = var17; ~var81 > ~var15; ++var81) {
                                            for (int var82 = var19; var20 > var82; ++var82) {
                                                if (~var82 <= ~(-(arg6 / 2) + var81)) {
                                                    arg9[var16] = arg4;
                                                } else if (arg7) {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (~arg8 == -2) {
                                        for (int var83 = var24 - 1; var21 <= var83; --var83) {
                                            for (int var84 = var19; ~var20 < ~var84; ++var84) {
                                                if (~var84 > ~(-(arg6 / 2) + var83)) {
                                                    if (arg7) {
                                                        arg9[var16] = arg0;
                                                    }
                                                } else {
                                                    arg9[var16] = arg4;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (arg8 == 2) {
                                        for (int var85 = var24 + -1; var85 >= var21; --var85) {
                                            for (int var86 = var22 + -1; ~var23 >= ~var86; --var86) {
                                                if (~var86 <= ~(-(arg6 / 2) + var85)) {
                                                    arg9[var16] = arg4;
                                                } else if (arg7) {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var18;
                                        }
                                        return;
                                    }
                                    if (~arg8 == -4) {
                                        for (int var87 = var17; ~var87 > ~var15; ++var87) {
                                            for (int var88 = var22 + -1; var88 >= var23; --var88) {
                                                if (var88 >= -(arg6 / 2) + var87) {
                                                    arg9[var16] = arg4;
                                                } else if (arg7) {
                                                    arg9[var16] = arg0;
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
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIII)V")
    private final void method511(byte arg0, int arg1, int arg2, int arg3) {
        ++field1013;
        int var5 = ~arg3 < -2049 ? arg3 - (arg2 * arg3 >> 12) + arg2 : (4096 - -arg2) * arg3 >> 12;
        if (~var5 >= -1) {
            this.field1008 = this.field1009 = this.field1012 = arg3;
        } else {
            int var6 = arg1 * 6;
            int var7 = var6 >> 12;
            int var8 = var6 - (var7 << 12);
            int var10 = arg3 + arg3 + -var5;
            int var11 = (-var10 + var5 << 12) / var5;
            int var12 = var5 * var11 >> 12;
            int var13 = var8 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var10 + var13;
            if (var7 != 0) {
                if (var7 != 1) {
                    if (~var7 != -3) {
                        if (var7 != 3) {
                            if (~var7 != -5) {
                                if (~var7 == -6) {
                                    this.field1012 = var14;
                                    this.field1008 = var5;
                                    this.field1009 = var10;
                                }
                            } else {
                                this.field1008 = var15;
                                this.field1009 = var10;
                                this.field1012 = var5;
                            }
                        } else {
                            this.field1009 = var14;
                            this.field1008 = var10;
                            this.field1012 = var5;
                        }
                    } else {
                        this.field1009 = var5;
                        this.field1012 = var15;
                        this.field1008 = var10;
                    }
                } else {
                    this.field1012 = var10;
                    this.field1008 = var14;
                    this.field1009 = var5;
                }
            } else {
                this.field1008 = var5;
                this.field1009 = var15;
                this.field1012 = var10;
            }
        }
        int var17 = -72 / ((35 - arg0) / 44);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[][] var4 = this.method1534(false, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class250.field4008 > var11; ++var11) {
                this.method509(var7[var11], var6[var11], -2016422100, var5[var11]);
                this.field1002 += this.field1007;
                this.field999 += this.field1000;
                while (~this.field1002 > -1) {
                    this.field1002 += 4096;
                }
                if (this.field999 < 0) {
                    this.field999 = 0;
                }
                while (this.field1002 > 4096) {
                    this.field1002 -= 4096;
                }
                if (~this.field999 < -4097) {
                    this.field999 = 4096;
                }
                this.field1003 += this.field1004;
                if (~this.field1003 > -1) {
                    this.field1003 = 0;
                }
                if (~this.field1003 < -4097) {
                    this.field1003 = 4096;
                }
                this.method511((byte) -122, this.field1002, this.field999, this.field1003);
                var8[var11] = this.field1008;
                var9[var11] = this.field1009;
                var10[var11] = this.field1012;
            }
        }
        if (arg0 <= 0) {
            this.method511((byte) -46, -2, -35, -72);
        }
        ++field1011;
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field1004 = (arg0.method266(-129) << 12) / 100;
                }
            } else {
                this.field1000 = (arg0.method266(-129) << 12) / 100;
            }
        } else {
            this.field1007 = arg0.method308((byte) -127);
        }
        if (arg2 != 102) {
            field1018 = null;
        }
        ++field1005;
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public static void method512(int arg0) {
        field1010 = null;
        field1020 = null;
        field1016 = null;
        field1006 = null;
        field1021 = null;
        field1015 = null;
        field1018 = null;
        if (arg0 != 511) {
            method510(-91, -70, -46, 42, -69, -89, 88, true, -62, (int[]) null, 78);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class64() {
        super(1, false);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field1006[var1] = var0 + -1;
            var0 += var0;
        }
        field1022 = 0;
        field1017 = 0;
        field1018 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1021 = "Loading interfaces - ";
        field1020 = "yellow:";
        field1015 = new String[200];
    }
}
