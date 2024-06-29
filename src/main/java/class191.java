import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class191 extends class61 {

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public int field3368 = -1;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public int field3366 = 0;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "Z")
    public static boolean field3372 = true;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Leb;")
    public static class230 field3365 = class68.method589(0, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field3378 = 0;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Leb;")
    public static class230 field3379 = class68.method589(0, "cookiehost");

    @OriginalMember(owner = "client!t", name = "R", descriptor = "Leb;")
    private static class230 field3383 = class68.method589(0, "Loading world list data");

    @OriginalMember(owner = "client!t", name = "I", descriptor = "Leb;")
    public static class230 field3374 = field3383;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "Z")
    public static boolean field3376;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V")
    public static void method1358(byte arg0) {
        field3379 = null;
        field3374 = null;
        field3383 = null;
        if (arg0 != 0) {
            method1358((byte) -33);
        }
        field3365 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)J")
    public static final long method1359(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        return var3 == null || var3.field4052 == null ? 0L : var3.field4052.field1031;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZIIIII[III)V")
    public static final void method1360(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        field3371++;
        int var11 = arg7;
        if (class87.field1519 <= arg7) {
            return;
        }
        int var12 = arg3 + arg7;
        if (class87.field1517 > arg7) {
            var11 = class87.field1517;
        }
        if (class87.field1517 >= var12) {
            return;
        }
        if (class87.field1519 < var12) {
            var12 = class87.field1519;
        }
        int var13 = arg9;
        if (arg9 >= class87.field1522) {
            return;
        }
        if (class87.field1518 > arg9) {
            var13 = class87.field1518;
        }
        int var14 = arg0 + arg9;
        if (var14 <= class87.field1518) {
            return;
        }
        if (var14 > class87.field1522) {
            var14 = class87.field1522;
        }
        if (arg4 == 9) {
            arg4 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        int var15 = class87.field1523 * var13 + var11;
        int var16 = var14 - arg9;
        int var17 = class87.field1523 + var11 - var12;
        int var18 = var13 - arg9;
        int var19 = var11 - arg7;
        if (arg4 == 10) {
            arg4 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        int var20 = var12 - arg7;
        if (arg1 != 20513) {
            return;
        }
        int var21 = arg3 - var20;
        if (arg4 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg4 = 8;
        }
        int var22 = arg3 - var19;
        int var23 = arg0 - var18;
        int var24 = arg0 - var16;
        if (arg4 == 1) {
            if (arg6 == 0) {
                for (int var25 = var18; var25 < var16; var25++) {
                    for (int var26 = var19; var26 < var20; var26++) {
                        if (var25 >= var26) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var27 = var23 - 1; var27 >= var24; var27--) {
                    for (int var28 = var19; var28 < var20; var28++) {
                        if (var28 <= var27) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var29 = var18; var29 < var16; var29++) {
                    for (int var30 = var19; var30 < var20; var30++) {
                        if (var29 <= var30) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var31 = var23 - 1; var31 >= var24; var31--) {
                    for (int var32 = var19; var32 < var20; var32++) {
                        if (var32 >= var31) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg4 == 2) {
            if (arg6 == 0) {
                for (int var33 = var23 - 1; var33 >= var24; var33--) {
                    for (int var34 = var19; var34 < var20; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var35 = var18; var35 < var16; var35++) {
                    for (int var36 = var19; var36 < var20; var36++) {
                        if (var15 >= 0 && var15 < arg8.length) {
                            if (var35 << 1 <= var36) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var37 = var18; var37 < var16; var37++) {
                    for (int var38 = var22 - 1; var38 >= var21; var38--) {
                        if (var37 >> 1 >= var38) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var39 = var23 - 1; var39 >= var24; var39--) {
                    for (int var40 = var22 - 1; var40 >= var21; var40--) {
                        if (var39 << 1 <= var40) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg4 == 3) {
            if (arg6 == 0) {
                for (int var41 = var23 - 1; var41 >= var24; var41--) {
                    for (int var42 = var22 - 1; var42 >= var21; var42--) {
                        if ((var41 >> 1) >= var42) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var43 = var23 - 1; var43 >= var24; var43--) {
                    for (int var44 = var19; var44 < var20; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var45 = var18; var45 < var16; var45++) {
                    for (int var46 = var19; var46 < var20; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var47 = var18; var47 < var16; var47++) {
                    for (int var48 = var22 - 1; var48 >= var21; var48--) {
                        if (var47 << 1 <= var48) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg4 == 4) {
            if (arg6 == 0) {
                for (int var49 = var23 - 1; var49 >= var24; var49--) {
                    for (int var50 = var19; var50 < var20; var50++) {
                        if (var50 >= var49 >> 1) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var51 = var18; var51 < var16; var51++) {
                    for (int var52 = var19; var52 < var20; var52++) {
                        if (var51 << 1 >= var52) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var53 = var18; var53 < var16; var53++) {
                    for (int var54 = var22 - 1; var54 >= var21; var54--) {
                        if (var54 >= (var53 >> 1)) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var55 = var23 - 1; var55 >= var24; var55--) {
                    for (int var56 = var22 - 1; var56 >= var21; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg8[var15] = arg5;
                        } else if (arg2) {
                            arg8[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg6 == 0) {
                    for (int var65 = var18; var65 < var16; var65++) {
                        for (int var66 = var19; var66 < var20; var66++) {
                            if (var66 <= (arg3 / 2)) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var67 = var18; var67 < var16; var67++) {
                        for (int var68 = var19; var68 < var20; var68++) {
                            if ((arg0 / 2) >= var67) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var69 = var18; var69 < var16; var69++) {
                        for (int var70 = var19; var70 < var20; var70++) {
                            if (var70 >= (arg3 / 2)) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var71 = var18; var71 < var16; var71++) {
                        for (int var72 = var19; var72 < var20; var72++) {
                            if (var71 >= arg0 / 2) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg6 == 0) {
                    for (int var73 = var18; var73 < var16; var73++) {
                        for (int var74 = var19; var74 < var20; var74++) {
                            if (var74 <= var73 - arg0 / 2) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var75 = var23 - 1; var75 >= var24; var75--) {
                        for (int var76 = var19; var76 < var20; var76++) {
                            if (var76 <= (var75 - (arg0 / 2))) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var77 = var23 - 1; var77 >= var24; var77--) {
                        for (int var78 = var22 - 1; var78 >= var21; var78--) {
                            if (var78 <= var77 - (arg0 / 2)) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var79 = var18; var79 < var16; var79++) {
                        for (int var80 = var22 - 1; var80 >= var21; var80--) {
                            if ((var79 - (arg0 / 2)) >= var80) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg6 == 0) {
                    for (int var81 = var18; var81 < var16; var81++) {
                        for (int var82 = var19; var82 < var20; var82++) {
                            if ((var81 - (arg0 / 2)) <= var82) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var83 = var23 - 1; var83 >= var24; var83--) {
                        for (int var84 = var19; var84 < var20; var84++) {
                            if (var84 >= (var83 - arg0 / 2)) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var85 = var23 - 1; var85 >= var24; var85--) {
                        for (int var86 = var22 - 1; var86 >= var21; var86--) {
                            if (var86 >= var85 - (arg0 / 2)) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var87 = var18; var87 < var16; var87++) {
                        for (int var88 = var22 - 1; var88 >= var21; var88--) {
                            if (var87 - (arg0 / 2) <= var88) {
                                arg8[var15] = arg5;
                            } else if (arg2) {
                                arg8[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var57 = var23 - 1; var57 >= var24; var57--) {
                for (int var58 = var22 - 1; var58 >= var21; var58--) {
                    if (var57 >> 1 <= var58) {
                        arg8[var15] = arg5;
                    } else if (arg2) {
                        arg8[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 1) {
            for (int var59 = var23 - 1; var59 >= var24; var59--) {
                for (int var60 = var19; var60 < var20; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg8[var15] = arg5;
                    } else if (arg2) {
                        arg8[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 2) {
            for (int var61 = var18; var61 < var16; var61++) {
                for (int var62 = var19; var62 < var20; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg8[var15] = arg5;
                    } else if (arg2) {
                        arg8[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 3) {
            for (int var63 = var18; var63 < var16; var63++) {
                for (int var64 = var22 - 1; var64 >= var21; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg8[var15] = arg5;
                    } else if (arg2) {
                        arg8[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var17;
            }
        }
    }
}
