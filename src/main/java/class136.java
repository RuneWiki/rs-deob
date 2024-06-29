import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class136 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    public static int[] field2343 = new int[14];

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2341 = 0;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lqk;")
    public static class207 field2345 = class24.method212(255, "hint_mapmarkers");

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient;")
    public static client field2347;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLv;)Lqk;")
    public static final class207 method944(byte arg0, class149 arg1) {
        if (arg0 != 17) {
            field2341 = 105;
        }
        field2340++;
        return class247.method1735(arg1, 32767, arg0 + 106);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method945(byte arg0) {
        field2347 = null;
        field2343 = null;
        field2345 = null;
        if (arg0 <= 11) {
            method947(57, 22, 30, 67, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII[IIZII)V")
    public static final void method946(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var11 = arg10;
        field2346++;
        if (class23.field433 <= arg10) {
            return;
        }
        if (class23.field436 > arg10) {
            var11 = class23.field436;
        }
        int var12 = arg2 + arg10;
        if (arg7 >= -83) {
            field2347 = null;
        }
        if (var12 <= class23.field436) {
            return;
        }
        if (class23.field433 < var12) {
            var12 = class23.field433;
        }
        int var13 = arg3;
        if (class23.field441 <= arg3) {
            return;
        }
        int var14 = arg3 + arg5;
        if (class23.field437 > arg3) {
            var13 = class23.field437;
        }
        if (var14 <= class23.field437) {
            return;
        }
        if (var14 > class23.field441) {
            var14 = class23.field441;
        }
        if (arg1 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg1 = 1;
        }
        if (arg1 == 10) {
            arg1 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        int var15 = class23.field440 * var13 + var11;
        int var16 = var13 - arg3;
        int var17 = var14 - arg3;
        if (arg1 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg1 = 8;
        }
        int var18 = class23.field440 + var11 - var12;
        int var19 = var12 - arg10;
        int var20 = arg2 - var19;
        int var21 = var11 - arg10;
        int var22 = arg5 - var16;
        int var23 = arg5 - var17;
        int var24 = arg2 - var21;
        if (arg1 == 1) {
            if (arg9 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var21; var26 < var19; var26++) {
                        if (var26 <= var25) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var27 = var22 - 1; var27 >= var23; var27--) {
                    for (int var28 = var21; var28 < var19; var28++) {
                        if (var28 <= var27) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var21; var30 < var19; var30++) {
                        if (var29 <= var30) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var31 = var22 - 1; var31 >= var23; var31--) {
                    for (int var32 = var21; var32 < var19; var32++) {
                        if (var32 >= var31) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 2) {
            if (arg9 == 0) {
                for (int var33 = var22 - 1; var33 >= var23; var33--) {
                    for (int var34 = var21; var34 < var19; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var21; var36 < var19; var36++) {
                        if (var15 >= 0 && var15 < arg6.length) {
                            if (var36 >= (var35 << 1)) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var24 - 1; var38 >= var20; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var39 = var22 - 1; var39 >= var23; var39--) {
                    for (int var40 = var24 - 1; var40 >= var20; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 3) {
            if (arg9 == 0) {
                for (int var41 = var22 - 1; var41 >= var23; var41--) {
                    for (int var42 = var24 - 1; var42 >= var20; var42--) {
                        if ((var41 >> 1) >= var42) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var43 = var22 - 1; var43 >= var23; var43--) {
                    for (int var44 = var21; var44 < var19; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var45 = var16; var45 < var17; var45++) {
                    for (int var46 = var21; var46 < var19; var46++) {
                        if (var46 <= var45 >> 1) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var47 = var16; var47 < var17; var47++) {
                    for (int var48 = var24 - 1; var48 >= var20; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 4) {
            if (arg9 == 0) {
                for (int var49 = var22 - 1; var49 >= var23; var49--) {
                    for (int var50 = var21; var50 < var19; var50++) {
                        if ((var49 >> 1) <= var50) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 1) {
                for (int var51 = var16; var51 < var17; var51++) {
                    for (int var52 = var21; var52 < var19; var52++) {
                        if (var51 << 1 >= var52) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 2) {
                for (int var53 = var16; var53 < var17; var53++) {
                    for (int var54 = var24 - 1; var54 >= var20; var54--) {
                        if (var54 >= (var53 >> 1)) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg9 == 3) {
                for (int var55 = var22 - 1; var55 >= var23; var55--) {
                    for (int var56 = var24 - 1; var56 >= var20; var56--) {
                        if (var55 << 1 >= var56) {
                            arg6[var15] = arg0;
                        } else if (arg8) {
                            arg6[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 != 5) {
            if (arg1 == 6) {
                if (arg9 == 0) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var21; var66 < var19; var66++) {
                            if (arg2 / 2 >= var66) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var21; var68 < var19; var68++) {
                            if ((arg5 / 2) >= var67) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var21; var70 < var19; var70++) {
                            if (var70 >= arg2 / 2) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var21; var72 < var19; var72++) {
                            if (var71 >= arg5 / 2) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 7) {
                if (arg9 == 0) {
                    for (int var73 = var16; var73 < var17; var73++) {
                        for (int var74 = var21; var74 < var19; var74++) {
                            if (var74 <= var73 - (arg5 / 2)) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var75 = var22 - 1; var75 >= var23; var75--) {
                        for (int var76 = var21; var76 < var19; var76++) {
                            if (var75 - arg5 / 2 >= var76) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var77 = var22 - 1; var77 >= var23; var77--) {
                        for (int var78 = var24 - 1; var78 >= var20; var78--) {
                            if (var78 <= (var77 - arg5 / 2)) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var79 = var16; var79 < var17; var79++) {
                        for (int var80 = var24 - 1; var80 >= var20; var80--) {
                            if (var80 <= (var79 - (arg5 / 2))) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg1 == 8) {
                if (arg9 == 0) {
                    for (int var81 = var16; var81 < var17; var81++) {
                        for (int var82 = var21; var82 < var19; var82++) {
                            if ((var81 - (arg5 / 2)) <= var82) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var83 = var22 - 1; var83 >= var23; var83--) {
                        for (int var84 = var21; var84 < var19; var84++) {
                            if (var84 >= var83 - (arg5 / 2)) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var85 = var22 - 1; var85 >= var23; var85--) {
                        for (int var86 = var24 - 1; var86 >= var20; var86--) {
                            if (var86 >= (var85 - (arg5 / 2))) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var87 = var16; var87 < var17; var87++) {
                        for (int var88 = var24 - 1; var88 >= var20; var88--) {
                            if (var88 >= (var87 - (arg5 / 2))) {
                                arg6[var15] = arg0;
                            } else if (arg8) {
                                arg6[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var57 = var22 - 1; var57 >= var23; var57--) {
                for (int var58 = var24 - 1; var58 >= var20; var58--) {
                    if (var58 >= var57 >> 1) {
                        arg6[var15] = arg0;
                    } else if (arg8) {
                        arg6[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 1) {
            for (int var59 = var22 - 1; var59 >= var23; var59--) {
                for (int var60 = var21; var60 < var19; var60++) {
                    if (var60 <= var59 << 1) {
                        arg6[var15] = arg0;
                    } else if (arg8) {
                        arg6[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 2) {
            for (int var61 = var16; var61 < var17; var61++) {
                for (int var62 = var21; var62 < var19; var62++) {
                    if (var62 >= (var61 >> 1)) {
                        arg6[var15] = arg0;
                    } else if (arg8) {
                        arg6[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg9 == 3) {
            for (int var63 = var16; var63 < var17; var63++) {
                for (int var64 = var24 - 1; var64 >= var20; var64--) {
                    if (var63 << 1 >= var64) {
                        arg6[var15] = arg0;
                    } else if (arg8) {
                        arg6[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIB)V")
    public static final void method947(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class178.field3209 == 1) {
            class124.field2170[class22.field377 / 100].method381(class204.field3599 - 8, class13.field193 + -8);
        }
        if (arg4 != 9) {
            method944((byte) 88, (class149) null);
        }
        field2342++;
        if (class178.field3209 == 2) {
            class124.field2170[class22.field377 / 100 + 4].method381(class204.field3599 - 8, class13.field193 + -8);
        }
        class175.method1257((byte) -117);
    }
}
