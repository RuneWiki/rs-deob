import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class130 extends class89 {

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Z")
    public static boolean field2387 = false;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field2388 = 0;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field2394 = -1;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field2393 = 0;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Lbk;")
    public static class20 field2391 = new class20();

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Loh;")
    public class263 field2392;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Loh;")
    public class263 field2395;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lue;")
    public static class86 field2384;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field2381;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[[[B")
    public static byte[][][] field2386;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLue;)V")
    public static final void method839(byte arg0, class86 arg1) {
        int var2 = 91 % ((75 - arg0) / 40);
        class57.field1203 = arg1.method573(-1, class196.field3544);
        ++field2390;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIBI[IZIII)V")
    public static final void method840(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        ++field2396;
        int var11 = arg2;
        if (class133.field2446 > arg2) {
            if (arg2 < class133.field2448) {
                var11 = class133.field2448;
            }
            int var12 = arg2 + arg8;
            if (~var12 < ~class133.field2448) {
                int var13 = arg10;
                if (class133.field2446 < var12) {
                    var12 = class133.field2446;
                }
                if (~class133.field2443 < ~arg10) {
                    if (class133.field2450 > arg10) {
                        var13 = class133.field2450;
                    }
                    int var14 = arg0 + arg10;
                    if (~class133.field2450 > ~var14) {
                        if (arg3 == 9) {
                            arg3 = 1;
                            arg5 = 3 & arg5 - -1;
                        }
                        int var15 = class133.field2442 * var13 + var11;
                        if (~var14 < ~class133.field2443) {
                            var14 = class133.field2443;
                        }
                        int var16 = var14 - arg10;
                        if (~arg3 == -11) {
                            arg3 = 1;
                            arg5 = arg5 - -3 & 3;
                        }
                        if (arg3 == 11) {
                            arg3 = 8;
                            arg5 = 3 & arg5 - -3;
                        }
                        int var17 = var13 - arg10;
                        int var18 = class133.field2442 + var11 - var12;
                        int var19 = var11 - arg2;
                        int var20 = var12 - arg2;
                        int var21 = -var20 + arg8;
                        int var22 = -var19 + arg8;
                        if (arg4 != 30) {
                            field2385 = 88;
                        }
                        int var23 = -var16 + arg0;
                        int var24 = -var17 + arg0;
                        if (arg3 == 1) {
                            if (arg5 == 0) {
                                for (int var25 = var17; ~var16 < ~var25; ++var25) {
                                    for (int var26 = var19; var26 < var20; ++var26) {
                                        if (~var26 < ~var25) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg5 == -2) {
                                for (int var27 = var24 + -1; ~var27 <= ~var23; --var27) {
                                    for (int var28 = var19; ~var20 < ~var28; ++var28) {
                                        if (~var28 >= ~var27) {
                                            arg6[var15] = arg1;
                                        } else if (arg7) {
                                            arg6[var15] = arg9;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg5 == -3) {
                                for (int var29 = var17; ~var29 > ~var16; ++var29) {
                                    for (int var30 = var19; var20 > var30; ++var30) {
                                        if (var29 > var30) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg5 == 3) {
                                for (int var31 = var24 - 1; var31 >= var23; --var31) {
                                    for (int var32 = var19; ~var32 > ~var20; ++var32) {
                                        if (var32 >= var31) {
                                            arg6[var15] = arg1;
                                        } else if (arg7) {
                                            arg6[var15] = arg9;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else if (arg3 == 2) {
                            if (arg5 == 0) {
                                for (int var33 = var24 + -1; ~var23 >= ~var33; --var33) {
                                    for (int var34 = var19; var34 < var20; ++var34) {
                                        if (var34 > var33 >> 1) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg5 == 1) {
                                for (int var35 = var17; var35 < var16; ++var35) {
                                    for (int var36 = var19; var20 > var36; ++var36) {
                                        if (~var15 <= -1 && var15 < arg6.length) {
                                            if (~var36 <= ~(var35 << 1)) {
                                                arg6[var15] = arg1;
                                            } else if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                            ++var15;
                                        } else {
                                            ++var15;
                                        }
                                    }
                                    var15 += var18;
                                }
                            } else if (arg5 == 2) {
                                for (int var37 = var17; var16 > var37; ++var37) {
                                    for (int var38 = var22 + -1; var21 <= var38; --var38) {
                                        if (~var38 >= ~(var37 >> 1)) {
                                            arg6[var15] = arg1;
                                        } else if (arg7) {
                                            arg6[var15] = arg9;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg5 == 3) {
                                for (int var39 = var24 + -1; ~var23 >= ~var39; --var39) {
                                    for (int var40 = var22 + -1; var40 >= var21; --var40) {
                                        if (var40 < var39 << 1) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else if (~arg3 == -4) {
                            if (arg5 == 0) {
                                for (int var41 = var24 + -1; ~var41 <= ~var23; --var41) {
                                    for (int var42 = var22 + -1; ~var21 >= ~var42; --var42) {
                                        if (~(var41 >> 1) > ~var42) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg5 == 1) {
                                for (int var43 = var24 + -1; var23 <= var43; --var43) {
                                    for (int var44 = var19; var44 < var20; ++var44) {
                                        if (var44 < var43 << 1) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg5 == 2) {
                                for (int var45 = var17; var45 < var16; ++var45) {
                                    for (int var46 = var19; ~var20 < ~var46; ++var46) {
                                        if (~var46 < ~(var45 >> 1)) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg5 == -4) {
                                for (int var47 = var17; var16 > var47; ++var47) {
                                    for (int var48 = var22 + -1; var21 <= var48; --var48) {
                                        if (~var48 <= ~(var47 << 1)) {
                                            arg6[var15] = arg1;
                                        } else if (arg7) {
                                            arg6[var15] = arg9;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else if (arg3 == 4) {
                            if (arg5 == 0) {
                                for (int var49 = var24 - 1; var49 >= var23; --var49) {
                                    for (int var50 = var19; var50 < var20; ++var50) {
                                        if (var50 < var49 >> 1) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg5 == -2) {
                                for (int var51 = var17; var51 < var16; ++var51) {
                                    for (int var52 = var19; var20 > var52; ++var52) {
                                        if (var51 << 1 < var52) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg5 == -3) {
                                for (int var53 = var17; ~var16 < ~var53; ++var53) {
                                    for (int var54 = var22 + -1; ~var54 <= ~var21; --var54) {
                                        if (var53 >> 1 > var54) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg5 == 3) {
                                for (int var55 = var24 + -1; var55 >= var23; --var55) {
                                    for (int var56 = var22 - 1; var21 <= var56; --var56) {
                                        if (var56 > var55 << 1) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else if (~arg3 == -6) {
                            if (arg5 == 0) {
                                for (int var57 = var24 + -1; var57 >= var23; --var57) {
                                    for (int var58 = var22 + -1; ~var58 <= ~var21; --var58) {
                                        if (~(var57 >> 1) < ~var58) {
                                            if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                        } else {
                                            arg6[var15] = arg1;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg5 == -2) {
                                for (int var59 = var24 + -1; var23 <= var59; --var59) {
                                    for (int var60 = var19; var60 < var20; ++var60) {
                                        if (var59 << 1 >= var60) {
                                            arg6[var15] = arg1;
                                        } else if (arg7) {
                                            arg6[var15] = arg9;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (~arg5 == -3) {
                                for (int var61 = var17; ~var61 > ~var16; ++var61) {
                                    for (int var62 = var19; var20 > var62; ++var62) {
                                        if (var62 >= var61 >> 1) {
                                            arg6[var15] = arg1;
                                        } else if (arg7) {
                                            arg6[var15] = arg9;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            } else if (arg5 == 3) {
                                for (int var63 = var17; var16 > var63; ++var63) {
                                    for (int var64 = var22 - 1; var64 >= var21; --var64) {
                                        if (var64 <= var63 << 1) {
                                            arg6[var15] = arg1;
                                        } else if (arg7) {
                                            arg6[var15] = arg9;
                                        }
                                        ++var15;
                                    }
                                    var15 += var18;
                                }
                            }
                        } else {
                            if (~arg3 == -7) {
                                if (~arg5 == -1) {
                                    for (int var65 = var17; ~var65 > ~var16; ++var65) {
                                        for (int var66 = var19; ~var20 < ~var66; ++var66) {
                                            if (arg8 / 2 < var66) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (arg5 == 1) {
                                    for (int var67 = var17; var67 < var16; ++var67) {
                                        for (int var68 = var19; ~var68 > ~var20; ++var68) {
                                            if (~(arg0 / 2) > ~var67) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (arg5 == 2) {
                                    for (int var69 = var17; ~var69 > ~var16; ++var69) {
                                        for (int var70 = var19; ~var70 > ~var20; ++var70) {
                                            if (var70 < arg8 / 2) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (arg5 == 3) {
                                    for (int var71 = var17; ~var71 > ~var16; ++var71) {
                                        for (int var72 = var19; ~var20 < ~var72; ++var72) {
                                            if (var71 < arg0 / 2) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                            }
                            if (arg3 == 7) {
                                if (arg5 == 0) {
                                    for (int var73 = var17; ~var16 < ~var73; ++var73) {
                                        for (int var74 = var19; var74 < var20; ++var74) {
                                            if (var73 - arg0 / 2 >= var74) {
                                                arg6[var15] = arg1;
                                            } else if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (arg5 == 1) {
                                    for (int var75 = var24 - 1; var23 <= var75; --var75) {
                                        for (int var76 = var19; ~var20 < ~var76; ++var76) {
                                            if (-(arg0 / 2) + var75 < var76) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (arg5 == 2) {
                                    for (int var77 = var24 - 1; ~var77 <= ~var23; --var77) {
                                        for (int var78 = var22 + -1; ~var21 >= ~var78; --var78) {
                                            if (-(arg0 / 2) + var77 >= var78) {
                                                arg6[var15] = arg1;
                                            } else if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg5 == -4) {
                                    for (int var79 = var17; var79 < var16; ++var79) {
                                        for (int var80 = var22 + -1; var21 <= var80; --var80) {
                                            if (var79 - arg0 / 2 < var80) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                            }
                            if (~arg3 == -9) {
                                if (~arg5 == -1) {
                                    for (int var81 = var17; ~var16 < ~var81; ++var81) {
                                        for (int var82 = var19; ~var82 > ~var20; ++var82) {
                                            if (~(-(arg0 / 2) + var81) >= ~var82) {
                                                arg6[var15] = arg1;
                                            } else if (arg7) {
                                                arg6[var15] = arg9;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg5 == -2) {
                                    for (int var83 = var24 - 1; var83 >= var23; --var83) {
                                        for (int var84 = var19; ~var84 > ~var20; ++var84) {
                                            if (~(-(arg0 / 2) + var83) < ~var84) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (arg5 == 2) {
                                    for (int var85 = var24 + -1; var23 <= var85; --var85) {
                                        for (int var86 = var22 - 1; var86 >= var21; --var86) {
                                            if (~(-(arg0 / 2) + var85) < ~var86) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
                                    }
                                    return;
                                }
                                if (~arg5 == -4) {
                                    for (int var87 = var17; ~var87 > ~var16; ++var87) {
                                        for (int var88 = var22 + -1; var21 <= var88; --var88) {
                                            if (var87 - arg0 / 2 > var88) {
                                                if (arg7) {
                                                    arg6[var15] = arg9;
                                                }
                                            } else {
                                                arg6[var15] = arg1;
                                            }
                                            ++var15;
                                        }
                                        var15 += var18;
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

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static void method841(byte arg0) {
        field2391 = null;
        if (arg0 != 79) {
            method840(-111, 69, 60, 77, (byte) 76, -28, (int[]) null, false, 83, 39, -110);
        }
        field2384 = null;
        field2386 = null;
        field2381 = null;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Lge;")
    public final class68 method842(int arg0) {
        if (arg0 != 23626) {
            return null;
        } else {
            ++field2383;
            return class102.field1948[super.field1762];
        }
    }
}
