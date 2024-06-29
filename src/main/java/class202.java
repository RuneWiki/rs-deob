import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class202 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
    public static int[] field3297 = new int[14];

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Ltl;")
    public static class222 field3301 = new class222(64);

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Z")
    public static boolean field3302 = true;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIZZIII[II)V", line = 4)
    public static final void method1474(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        field3298++;
        int var11 = arg3;
        if (class216.field3486 <= arg3) {
            return;
        }
        int var12 = arg3 + arg10;
        if (arg3 < class216.field3483) {
            var11 = class216.field3483;
        }
        if (var12 <= class216.field3483) {
            return;
        }
        if (var12 > class216.field3486) {
            var12 = class216.field3486;
        }
        int var13 = arg1;
        if (arg1 >= class216.field3479) {
            return;
        }
        if (class216.field3485 > arg1) {
            var13 = class216.field3485;
        }
        int var14 = arg1 + arg2;
        if (var14 <= class216.field3485) {
            return;
        }
        if (arg7 == 9) {
            arg7 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg5) {
            return;
        }
        if (arg7 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg7 = 1;
        }
        if (class216.field3479 < var14) {
            var14 = class216.field3479;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        int var15 = class216.field3482 * var13 + var11;
        int var16 = var13 - arg1;
        int var17 = var14 - arg1;
        int var18 = var11 + class216.field3482 - var12;
        int var19 = var12 - arg3;
        int var20 = var11 - arg3;
        int var21 = arg10 - var19;
        int var22 = arg2 - var17;
        int var23 = arg2 - var16;
        int var24 = arg10 - var20;
        if (arg7 == 1) {
            if (arg8 == 0) {
                for (int var87 = var16; var87 < var17; var87++) {
                    for (int var88 = var20; var88 < var19; var88++) {
                        if (var88 <= var87) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var85 = var23 - 1; var85 >= var22; var85--) {
                    for (int var86 = var20; var86 < var19; var86++) {
                        if (var85 >= var86) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var83 = var16; var83 < var17; var83++) {
                    for (int var84 = var20; var84 < var19; var84++) {
                        if (var84 >= var83) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var81 = var23 - 1; var81 >= var22; var81--) {
                    for (int var82 = var20; var82 < var19; var82++) {
                        if (var81 <= var82) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg7 == 2) {
            if (arg8 == 0) {
                for (int var79 = var23 - 1; var79 >= var22; var79--) {
                    for (int var80 = var20; var80 < var19; var80++) {
                        if ((var79 >> 1) >= var80) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var77 = var16; var77 < var17; var77++) {
                    for (int var78 = var20; var78 < var19; var78++) {
                        if (var15 >= 0 && arg9.length > var15) {
                            if ((var77 << 1) <= var78) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var73 = var16; var73 < var17; var73++) {
                    for (int var74 = var24 - 1; var74 >= var21; var74--) {
                        if (var73 >> 1 >= var74) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var75 = var23 - 1; var75 >= var22; var75--) {
                    for (int var76 = var24 - 1; var76 >= var21; var76--) {
                        if (var76 >= var75 << 1) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg7 == 3) {
            if (arg8 == 0) {
                for (int var31 = var23 - 1; var31 >= var22; var31--) {
                    for (int var32 = var24 - 1; var32 >= var21; var32--) {
                        if (var31 >> 1 >= var32) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var25 = var23 - 1; var25 >= var22; var25--) {
                    for (int var26 = var20; var26 < var19; var26++) {
                        if (var25 << 1 <= var26) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var27 = var16; var27 < var17; var27++) {
                    for (int var28 = var20; var28 < var19; var28++) {
                        if (var28 <= (var27 >> 1)) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var24 - 1; var30 >= var21; var30--) {
                        if ((var29 << 1) <= var30) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg7 == 4) {
            if (arg8 == 0) {
                for (int var39 = var23 - 1; var39 >= var22; var39--) {
                    for (int var40 = var20; var40 < var19; var40++) {
                        if (var40 >= (var39 >> 1)) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 1) {
                for (int var33 = var16; var33 < var17; var33++) {
                    for (int var34 = var20; var34 < var19; var34++) {
                        if ((var33 << 1) >= var34) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var24 - 1; var38 >= var21; var38--) {
                        if (var38 >= var37 >> 1) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg8 == 3) {
                for (int var35 = var23 - 1; var35 >= var22; var35--) {
                    for (int var36 = var24 - 1; var36 >= var21; var36--) {
                        if (var35 << 1 >= var36) {
                            arg9[var15] = arg0;
                        } else if (arg4) {
                            arg9[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg8 == 0) {
                    for (int var41 = var16; var41 < var17; var41++) {
                        for (int var42 = var20; var42 < var19; var42++) {
                            if (var42 <= (arg10 / 2)) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var47 = var16; var47 < var17; var47++) {
                        for (int var48 = var20; var48 < var19; var48++) {
                            if (var47 <= arg2 / 2) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var45 = var16; var45 < var17; var45++) {
                        for (int var46 = var20; var46 < var19; var46++) {
                            if (arg10 / 2 <= var46) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var43 = var16; var43 < var17; var43++) {
                        for (int var44 = var20; var44 < var19; var44++) {
                            if ((arg2 / 2) <= var43) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg8 == 0) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        for (int var50 = var20; var50 < var19; var50++) {
                            if ((var49 - (arg2 / 2)) >= var50) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var55 = var23 - 1; var55 >= var22; var55--) {
                        for (int var56 = var20; var56 < var19; var56++) {
                            if (var55 - (arg2 / 2) >= var56) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var51 = var23 - 1; var51 >= var22; var51--) {
                        for (int var52 = var24 - 1; var52 >= var21; var52--) {
                            if (var52 <= var51 - (arg2 / 2)) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var53 = var16; var53 < var17; var53++) {
                        for (int var54 = var24 - 1; var54 >= var21; var54--) {
                            if (var54 <= (var53 - arg2 / 2)) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg8 == 0) {
                    for (int var57 = var16; var57 < var17; var57++) {
                        for (int var58 = var20; var58 < var19; var58++) {
                            if (var58 >= (var57 - (arg2 / 2))) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var59 = var23 - 1; var59 >= var22; var59--) {
                        for (int var60 = var20; var60 < var19; var60++) {
                            if (var60 >= (var59 - (arg2 / 2))) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var61 = var23 - 1; var61 >= var22; var61--) {
                        for (int var62 = var24 - 1; var62 >= var21; var62--) {
                            if ((var61 - (arg2 / 2)) <= var62) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var63 = var16; var63 < var17; var63++) {
                        for (int var64 = var24 - 1; var64 >= var21; var64--) {
                            if (var63 - (arg2 / 2) <= var64) {
                                arg9[var15] = arg0;
                            } else if (arg4) {
                                arg9[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var65 = var23 - 1; var65 >= var22; var65--) {
                for (int var66 = var24 - 1; var66 >= var21; var66--) {
                    if ((var65 >> 1) <= var66) {
                        arg9[var15] = arg0;
                    } else if (arg4) {
                        arg9[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 1) {
            for (int var71 = var23 - 1; var71 >= var22; var71--) {
                for (int var72 = var20; var72 < var19; var72++) {
                    if (var72 <= (var71 << 1)) {
                        arg9[var15] = arg0;
                    } else if (arg4) {
                        arg9[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 2) {
            for (int var69 = var16; var69 < var17; var69++) {
                for (int var70 = var20; var70 < var19; var70++) {
                    if (var69 >> 1 <= var70) {
                        arg9[var15] = arg0;
                    } else if (arg4) {
                        arg9[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg8 == 3) {
            for (int var67 = var16; var67 < var17; var67++) {
                for (int var68 = var24 - 1; var68 >= var21; var68--) {
                    if (var68 <= (var67 << 1)) {
                        arg9[var15] = arg0;
                    } else if (arg4) {
                        arg9[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 1184)
    public static void method1475(int arg0) {
        field3297 = null;
        if (arg0 >= -111) {
            method1474(111, 111, -25, -124, true, false, 106, -109, -79, (int[]) null, -116);
        }
        field3301 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Ltf;", line = 1197)
    public static final class271 method1476(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3680; var4++) {
            class271 var5 = var3.field3687[var4];
            if ((var5.field4294 >> 29 & 0x3L) == 2L && var5.field4285 == arg1 && var5.field4297 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIII)V", line = 1222)
    public static final void method1477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3299++;
        if (arg1 != 3) {
            field3301 = (class222) null;
        }
        if (arg4 >= class224.field3575 && arg7 <= class231.field3697 && class233.field3721 <= arg0 && class235.field3735 >= arg5) {
            class214.method1564(arg6, arg0, arg3, arg7, arg2, arg4, (byte) 83, arg5);
        } else {
            class227.method1652(arg3, -62, arg4, arg5, arg6, arg2, arg0, arg7);
        }
    }
}
