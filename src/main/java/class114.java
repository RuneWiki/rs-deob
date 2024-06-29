import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class114 extends class160 {

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "Lad;")
    public static class259 field1857;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "[[S")
    public static short[][] field1859;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIZIIII[II)V")
    public static final void method805(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        ++field1858;
        int var11 = arg6;
        if (arg6 < class211.field3276) {
            if (~class211.field3274 < ~arg6) {
                var11 = class211.field3274;
            }
            int var12 = arg6 + arg10;
            if (~var12 < ~class211.field3274) {
                if (class211.field3276 < var12) {
                    var12 = class211.field3276;
                }
                int var13 = arg8;
                if (class211.field3272 > arg8) {
                    if (~arg8 > ~class211.field3280) {
                        var13 = class211.field3280;
                    }
                    int var14 = arg5 + arg8;
                    if (~var14 < ~class211.field3280) {
                        if (~arg1 == -10) {
                            arg1 = 1;
                            arg2 = 3 & arg2 + 1;
                        }
                        if (arg1 == 10) {
                            arg2 = arg2 + 3 & 3;
                            arg1 = 1;
                        }
                        if (~var14 < ~class211.field3272) {
                            var14 = class211.field3272;
                        }
                        int var15 = var14 - arg8;
                        int var16 = class211.field3279 * var13 + var11;
                        int var17 = class211.field3279 + var11 + -var12;
                        int var18 = var11 - arg6;
                        int var19 = var13 - arg8;
                        if (~arg1 == -12) {
                            arg1 = 8;
                            arg2 = 3 & arg2 - -3;
                        }
                        int var20 = var12 - arg6;
                        int var21 = -var18 + arg10;
                        int var22 = arg10 - var20;
                        int var23 = -var15 + arg5;
                        if (arg3 >= 116) {
                            int var24 = -var19 + arg5;
                            if (arg1 == 1) {
                                if (arg2 == 0) {
                                    for (int var25 = var19; ~var15 < ~var25; ++var25) {
                                        for (int var26 = var18; ~var26 > ~var20; ++var26) {
                                            if (var26 <= var25) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 1) {
                                    for (int var27 = var24 + -1; ~var23 >= ~var27; --var27) {
                                        for (int var28 = var18; var20 > var28; ++var28) {
                                            if (var28 > var27) {
                                                if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                            } else {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 2) {
                                    for (int var29 = var19; var15 > var29; ++var29) {
                                        for (int var30 = var18; var30 < var20; ++var30) {
                                            if (~var30 <= ~var29) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 3) {
                                    for (int var31 = var24 + -1; ~var23 >= ~var31; --var31) {
                                        for (int var32 = var18; ~var32 > ~var20; ++var32) {
                                            if (~var31 >= ~var32) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                }
                            } else if (arg1 == 2) {
                                if (arg2 == 0) {
                                    for (int var33 = var24 + -1; ~var23 >= ~var33; --var33) {
                                        for (int var34 = var18; ~var34 > ~var20; ++var34) {
                                            if (var33 >> 1 >= var34) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (~arg2 == -2) {
                                    for (int var35 = var19; var15 > var35; ++var35) {
                                        for (int var36 = var18; var20 > var36; ++var36) {
                                            if (var16 >= 0 && ~arg9.length < ~var16) {
                                                if (~(var35 << 1) < ~var36) {
                                                    if (arg4) {
                                                        arg9[var16] = arg7;
                                                    }
                                                } else {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            } else {
                                                ++var16;
                                            }
                                        }
                                        var16 += var17;
                                    }
                                } else if (~arg2 == -3) {
                                    for (int var37 = var19; ~var37 > ~var15; ++var37) {
                                        for (int var38 = var21 + -1; var22 <= var38; --var38) {
                                            if (~(var37 >> 1) <= ~var38) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (~arg2 == -4) {
                                    for (int var39 = var24 + -1; ~var23 >= ~var39; --var39) {
                                        for (int var40 = var21 - 1; var22 <= var40; --var40) {
                                            if (~(var39 << 1) >= ~var40) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                }
                            } else if (arg1 == 3) {
                                if (~arg2 == -1) {
                                    for (int var41 = var24 + -1; ~var23 >= ~var41; --var41) {
                                        for (int var42 = var21 - 1; ~var42 <= ~var22; --var42) {
                                            if (var41 >> 1 < var42) {
                                                if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                            } else {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (~arg2 == -2) {
                                    for (int var43 = var24 + -1; var43 >= var23; --var43) {
                                        for (int var44 = var18; ~var44 > ~var20; ++var44) {
                                            if (~(var43 << 1) < ~var44) {
                                                if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                            } else {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (~arg2 == -3) {
                                    for (int var45 = var19; var15 > var45; ++var45) {
                                        for (int var46 = var18; var20 > var46; ++var46) {
                                            if (~(var45 >> 1) > ~var46) {
                                                if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                            } else {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 3) {
                                    for (int var47 = var19; ~var15 < ~var47; ++var47) {
                                        for (int var48 = var21 + -1; ~var22 >= ~var48; --var48) {
                                            if (var47 << 1 <= var48) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                }
                            } else if (~arg1 == -5) {
                                if (~arg2 == -1) {
                                    for (int var49 = var24 + -1; var49 >= var23; --var49) {
                                        for (int var50 = var18; ~var20 < ~var50; ++var50) {
                                            if (~(var49 >> 1) >= ~var50) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 1) {
                                    for (int var51 = var19; ~var51 > ~var15; ++var51) {
                                        for (int var52 = var18; var52 < var20; ++var52) {
                                            if (var52 <= var51 << 1) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (~arg2 == -3) {
                                    for (int var53 = var19; var15 > var53; ++var53) {
                                        for (int var54 = var21 + -1; ~var54 <= ~var22; --var54) {
                                            if (~var54 > ~(var53 >> 1)) {
                                                if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                            } else {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 3) {
                                    for (int var55 = var24 + -1; var23 <= var55; --var55) {
                                        for (int var56 = var21 + -1; ~var56 <= ~var22; --var56) {
                                            if (var55 << 1 < var56) {
                                                if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                            } else {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                }
                            } else if (~arg1 == -6) {
                                if (arg2 == 0) {
                                    for (int var57 = var24 + -1; var57 >= var23; --var57) {
                                        for (int var58 = var21 + -1; var22 <= var58; --var58) {
                                            if (~var58 <= ~(var57 >> 1)) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 1) {
                                    for (int var59 = var24 - 1; var23 <= var59; --var59) {
                                        for (int var60 = var18; var20 > var60; ++var60) {
                                            if (~(var59 << 1) > ~var60) {
                                                if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                            } else {
                                                arg9[var16] = arg0;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 2) {
                                    for (int var61 = var19; ~var61 > ~var15; ++var61) {
                                        for (int var62 = var18; ~var20 < ~var62; ++var62) {
                                            if (var62 >= var61 >> 1) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                } else if (arg2 == 3) {
                                    for (int var63 = var19; var63 < var15; ++var63) {
                                        for (int var64 = var21 + -1; var22 <= var64; --var64) {
                                            if (var63 << 1 >= var64) {
                                                arg9[var16] = arg0;
                                            } else if (arg4) {
                                                arg9[var16] = arg7;
                                            }
                                            ++var16;
                                        }
                                        var16 += var17;
                                    }
                                }
                            } else {
                                if (~arg1 == -7) {
                                    if (~arg2 == -1) {
                                        for (int var65 = var19; var15 > var65; ++var65) {
                                            for (int var66 = var18; ~var20 < ~var66; ++var66) {
                                                if (~(arg10 / 2) > ~var66) {
                                                    if (arg4) {
                                                        arg9[var16] = arg7;
                                                    }
                                                } else {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (arg2 == 1) {
                                        for (int var67 = var19; var67 < var15; ++var67) {
                                            for (int var68 = var18; var68 < var20; ++var68) {
                                                if (var67 <= arg5 / 2) {
                                                    arg9[var16] = arg0;
                                                } else if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (arg2 == 2) {
                                        for (int var69 = var19; ~var69 > ~var15; ++var69) {
                                            for (int var70 = var18; ~var70 > ~var20; ++var70) {
                                                if (~var70 > ~(arg10 / 2)) {
                                                    if (arg4) {
                                                        arg9[var16] = arg7;
                                                    }
                                                } else {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (~arg2 == -4) {
                                        for (int var71 = var19; ~var71 > ~var15; ++var71) {
                                            for (int var72 = var18; ~var20 < ~var72; ++var72) {
                                                if (arg5 / 2 > var71) {
                                                    if (arg4) {
                                                        arg9[var16] = arg7;
                                                    }
                                                } else {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                }
                                if (~arg1 == -8) {
                                    if (~arg2 == -1) {
                                        for (int var73 = var19; ~var15 < ~var73; ++var73) {
                                            for (int var74 = var18; ~var20 < ~var74; ++var74) {
                                                if (var74 <= -(arg5 / 2) + var73) {
                                                    arg9[var16] = arg0;
                                                } else if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (~arg2 == -2) {
                                        for (int var75 = var24 + -1; ~var23 >= ~var75; --var75) {
                                            for (int var76 = var18; var20 > var76; ++var76) {
                                                if (var76 <= -(arg5 / 2) + var75) {
                                                    arg9[var16] = arg0;
                                                } else if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (arg2 == 2) {
                                        for (int var77 = var24 + -1; ~var77 <= ~var23; --var77) {
                                            for (int var78 = var21 + -1; var22 <= var78; --var78) {
                                                if (var78 > -(arg5 / 2) + var77) {
                                                    if (arg4) {
                                                        arg9[var16] = arg7;
                                                    }
                                                } else {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (arg2 == 3) {
                                        for (int var79 = var19; var79 < var15; ++var79) {
                                            for (int var80 = var21 + -1; ~var80 <= ~var22; --var80) {
                                                if (~var80 < ~(-(arg5 / 2) + var79)) {
                                                    if (arg4) {
                                                        arg9[var16] = arg7;
                                                    }
                                                } else {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                }
                                if (arg1 == 8) {
                                    if (arg2 == 0) {
                                        for (int var81 = var19; var15 > var81; ++var81) {
                                            for (int var82 = var18; var20 > var82; ++var82) {
                                                if (~var82 <= ~(-(arg5 / 2) + var81)) {
                                                    arg9[var16] = arg0;
                                                } else if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (~arg2 == -2) {
                                        for (int var83 = var24 - 1; var83 >= var23; --var83) {
                                            for (int var84 = var18; var84 < var20; ++var84) {
                                                if (var84 < -(arg5 / 2) + var83) {
                                                    if (arg4) {
                                                        arg9[var16] = arg7;
                                                    }
                                                } else {
                                                    arg9[var16] = arg0;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (arg2 == 2) {
                                        for (int var85 = var24 + -1; var23 <= var85; --var85) {
                                            for (int var86 = var21 + -1; var22 <= var86; --var86) {
                                                if (var86 >= -(arg5 / 2) + var85) {
                                                    arg9[var16] = arg0;
                                                } else if (arg4) {
                                                    arg9[var16] = arg7;
                                                }
                                                ++var16;
                                            }
                                            var16 += var17;
                                        }
                                        return;
                                    }
                                    if (~arg2 == -4) {
                                        for (int var87 = var19; var87 < var15; ++var87) {
                                            for (int var88 = var21 - 1; ~var88 <= ~var22; --var88) {
                                                if (-(arg5 / 2) + var87 > var88) {
                                                    if (arg4) {
                                                        arg9[var16] = arg7;
                                                    }
                                                } else {
                                                    arg9[var16] = arg0;
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
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILhd;IIB)V")
    public static final void method806(int arg0, int arg1, class11 arg2, int arg3, int arg4, byte arg5) {
        ++field1854;
        if (~arg2.field188 != 0 || arg2.field205 != null) {
            int var6 = 0;
            if (~arg1 < ~arg2.field190) {
                var6 += -arg2.field190 + arg1;
            } else if (arg2.field182 > arg1) {
                var6 += -arg1 + arg2.field182;
            }
            if (~arg2.field202 > ~arg3) {
                var6 += -arg2.field202 + arg3;
            } else if (arg2.field185 > arg3) {
                var6 += -arg3 + arg2.field185;
            }
            int var7 = class86.field1445 * arg2.field184 >> 8;
            if (arg2.field196 != 0 && arg2.field196 >= var6 + -64 && ~class86.field1445 != -1 && arg2.field186 == arg0) {
                var6 -= 64;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg2.field196) * var7 / arg2.field196;
                if (arg5 != -50) {
                    field1857 = null;
                }
                if (arg2.field206 == null) {
                    if (~arg2.field188 <= -1) {
                        class92 var9 = class92.method699(class135.field2097, arg2.field188, 0);
                        if (var9 != null) {
                            class285 var10 = var9.method698().method1914(class42.field601);
                            class14 var11 = class14.method117(var10, 100, var8);
                            var11.method152(-1);
                            class257.field4118.method1203(var11);
                            arg2.field206 = var11;
                        }
                    }
                } else {
                    arg2.field206.method138(var8);
                }
                if (arg2.field195 == null) {
                    if (arg2.field205 != null && ~(arg2.field203 -= arg4) >= -1) {
                        int var12 = (int) (Math.random() * (double) arg2.field205.length);
                        class92 var13 = class92.method699(class135.field2097, arg2.field205[var12], 0);
                        if (var13 != null) {
                            class285 var14 = var13.method698().method1914(class42.field601);
                            class14 var15 = class14.method117(var14, 100, var8);
                            var15.method152(0);
                            class257.field4118.method1203(var15);
                            arg2.field203 = (int) (Math.random() * (double) (-arg2.field204 + arg2.field198)) + arg2.field204;
                            arg2.field195 = var15;
                            return;
                        }
                    }
                } else {
                    arg2.field195.method138(var8);
                    if (arg2.field195.method1122((byte) -67)) {
                        return;
                    }
                    arg2.field195 = null;
                }
            } else {
                if (arg2.field206 != null) {
                    class257.field4118.method1205(arg2.field206);
                    arg2.field206 = null;
                }
                if (arg2.field195 != null) {
                    class257.field4118.method1205(arg2.field195);
                    arg2.field195 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
    public static void method807(int arg0) {
        field1857 = null;
        field1859 = null;
        if (arg0 != 0) {
            field1857 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(III)I")
    private final int method808(int arg0, int arg1, int arg2) {
        int var4 = arg1 - -(arg2 * 57);
        int var5 = var4 ^ var4 << 1;
        if (arg0 >= -1) {
            field1857 = null;
        }
        ++field1856;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        if (arg1 != 57) {
            return null;
        } else {
            ++field1855;
            int[] var3 = super.field2488.method15((byte) 122, arg0);
            if (super.field2488.field42) {
                int var4 = class103.field1713[arg0];
                for (int var5 = 0; var5 < class240.field3896; ++var5) {
                    var3[var5] = this.method808(-115, class190.field2946[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }
}
