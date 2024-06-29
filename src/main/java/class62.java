import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class62 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lwe;")
    public static class147 field1110 = new class147(64);

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Le;")
    public static class191 field1116 = class54.method368("sch-Utteln:", 2047);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Le;")
    public static class191 field1117 = class54.method368(" <col=ffff00>", 2047);

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Le;")
    public static class191 field1115 = class54.method368("Schrifts-=tze geladen)3", 2047);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method414(boolean arg0) {
        if (arg0) {
            field1117 = null;
        }
        field1117 = null;
        field1116 = null;
        field1110 = null;
        field1115 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method415(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0) {
            field1116 = null;
        }
        if (arg5 == arg8 && arg3 == arg7 && arg4 == arg9 && arg1 == arg2) {
            class63.method419(arg3, arg6, 7185, arg5, arg2, arg9);
        } else {
            int var10 = arg5;
            int var11 = arg3;
            int var12 = arg8 * 3;
            int var13 = arg3 * 3;
            int var14 = arg7 * 3;
            int var15 = arg4 * 3;
            int var16 = arg5 * 3;
            int var17 = arg1 * 3;
            int var18 = arg2 + var14 - var17 - arg3;
            int var19 = var12 + arg9 - arg5 - var15;
            int var20 = var14 - var13;
            int var21 = var15 + var16 - var12 - var12;
            int var22 = var12 - var16;
            int var23 = var13 + var17 - var14 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var21 * var25;
                int var30 = var23 * var25;
                int var31 = var22 * var24;
                int var32 = var20 * var24;
                int var33 = (var27 + var30 + var32 >> 12) + arg3;
                int var34 = (var29 + var31 + var28 >> 12) + arg5;
                class63.method419(var11, arg6, 7185, var10, var33, var34);
                var11 = var33;
                var10 = var34;
            }
        }
        field1109++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
    public static int method416(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZIIII[IIII)V")
    public static final void method417(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        field1111++;
        int var11 = arg5;
        if (arg5 >= class7.field63) {
            return;
        }
        int var12 = arg5 + arg8;
        if (class7.field65 > arg5) {
            var11 = class7.field65;
        }
        if (var12 <= class7.field65) {
            return;
        }
        int var13 = arg10;
        if (var12 > class7.field63) {
            var12 = class7.field63;
        }
        if (arg10 >= class7.field66) {
            return;
        }
        if (arg10 < class7.field68) {
            var13 = class7.field68;
        }
        int var14 = arg10 + arg4;
        if (var14 <= class7.field68) {
            return;
        }
        int var15 = class7.field67 * var13 + var11;
        int var16 = var13 - arg10;
        if (arg9 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg9 = 1;
        }
        if (class7.field66 < var14) {
            var14 = class7.field66;
        }
        int var17 = var14 - arg10;
        if (arg9 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg9 = 1;
        }
        if (arg9 == 11) {
            arg9 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        int var18 = arg4 - var16;
        int var19 = var11 + class7.field67 - var12;
        int var20 = var12 - arg5;
        int var21 = arg8 - var20;
        int var22 = arg4 - var17;
        int var23 = var11 - arg5;
        if (arg6 != -30848) {
            method414(false);
        }
        int var24 = arg8 - var23;
        if (arg9 == 1) {
            if (arg3 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var23; var26 < var20; var26++) {
                        if (var25 >= var26) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 1) {
                for (int var27 = var18 - 1; var27 >= var22; var27--) {
                    for (int var28 = var23; var28 < var20; var28++) {
                        if (var28 <= var27) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 2) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var23; var30 < var20; var30++) {
                        if (var29 <= var30) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 3) {
                for (int var31 = var18 - 1; var31 >= var22; var31--) {
                    for (int var32 = var23; var32 < var20; var32++) {
                        if (var32 >= var31) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            }
        } else if (arg9 == 2) {
            if (arg3 == 0) {
                for (int var33 = var18 - 1; var33 >= var22; var33--) {
                    for (int var34 = var23; var34 < var20; var34++) {
                        if (var34 <= (var33 >> 1)) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var23; var36 < var20; var36++) {
                        if (var15 >= 0 && arg7.length > var15) {
                            if (var36 >= var35 << 1) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var19;
                }
            } else if (arg3 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var24 - 1; var38 >= var21; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 3) {
                for (int var39 = var18 - 1; var39 >= var22; var39--) {
                    for (int var40 = var24 - 1; var40 >= var21; var40--) {
                        if (var39 << 1 <= var40) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            }
        } else if (arg9 == 3) {
            if (arg3 == 0) {
                for (int var41 = var18 - 1; var41 >= var22; var41--) {
                    for (int var42 = var24 - 1; var42 >= var21; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 1) {
                for (int var43 = var18 - 1; var43 >= var22; var43--) {
                    for (int var44 = var23; var44 < var20; var44++) {
                        if (var44 >= var43 << 1) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 2) {
                for (int var45 = var16; var45 < var17; var45++) {
                    for (int var46 = var23; var46 < var20; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 3) {
                for (int var47 = var16; var47 < var17; var47++) {
                    for (int var48 = var24 - 1; var48 >= var21; var48--) {
                        if (var47 << 1 <= var48) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            }
        } else if (arg9 == 4) {
            if (arg3 == 0) {
                for (int var49 = var18 - 1; var49 >= var22; var49--) {
                    for (int var50 = var23; var50 < var20; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 1) {
                for (int var51 = var16; var51 < var17; var51++) {
                    for (int var52 = var23; var52 < var20; var52++) {
                        if (var51 << 1 >= var52) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 2) {
                for (int var53 = var16; var53 < var17; var53++) {
                    for (int var54 = var24 - 1; var54 >= var21; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            } else if (arg3 == 3) {
                for (int var55 = var18 - 1; var55 >= var22; var55--) {
                    for (int var56 = var24 - 1; var56 >= var21; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg7[var15] = arg1;
                        } else if (arg2) {
                            arg7[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var19;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg3 == 0) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var23; var66 < var20; var66++) {
                            if (var66 <= arg8 / 2) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var23; var68 < var20; var68++) {
                            if (var67 <= (arg4 / 2)) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var23; var70 < var20; var70++) {
                            if (var70 >= arg8 / 2) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var23; var72 < var20; var72++) {
                            if (var71 >= (arg4 / 2)) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
            }
            if (arg9 == 7) {
                if (arg3 == 0) {
                    for (int var73 = var16; var73 < var17; var73++) {
                        for (int var74 = var23; var74 < var20; var74++) {
                            if (var74 <= var73 - (arg4 / 2)) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var75 = var18 - 1; var75 >= var22; var75--) {
                        for (int var76 = var23; var76 < var20; var76++) {
                            if (var76 <= var75 - (arg4 / 2)) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var77 = var18 - 1; var77 >= var22; var77--) {
                        for (int var78 = var24 - 1; var78 >= var21; var78--) {
                            if ((var77 - (arg4 / 2)) >= var78) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var79 = var16; var79 < var17; var79++) {
                        for (int var80 = var24 - 1; var80 >= var21; var80--) {
                            if (var80 <= (var79 - (arg4 / 2))) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg3 == 0) {
                    for (int var81 = var16; var81 < var17; var81++) {
                        for (int var82 = var23; var82 < var20; var82++) {
                            if (var81 - arg4 / 2 <= var82) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var83 = var18 - 1; var83 >= var22; var83--) {
                        for (int var84 = var23; var84 < var20; var84++) {
                            if ((var83 - arg4 / 2) <= var84) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var85 = var18 - 1; var85 >= var22; var85--) {
                        for (int var86 = var24 - 1; var86 >= var21; var86--) {
                            if (var86 >= (var85 - arg4 / 2)) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var87 = var16; var87 < var17; var87++) {
                        for (int var88 = var24 - 1; var88 >= var21; var88--) {
                            if (var88 >= (var87 - (arg4 / 2))) {
                                arg7[var15] = arg1;
                            } else if (arg2) {
                                arg7[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var19;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var57 = var18 - 1; var57 >= var22; var57--) {
                for (int var58 = var24 - 1; var58 >= var21; var58--) {
                    if ((var57 >> 1) <= var58) {
                        arg7[var15] = arg1;
                    } else if (arg2) {
                        arg7[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var19;
            }
        } else if (arg3 == 1) {
            for (int var59 = var18 - 1; var59 >= var22; var59--) {
                for (int var60 = var23; var60 < var20; var60++) {
                    if (var60 <= var59 << 1) {
                        arg7[var15] = arg1;
                    } else if (arg2) {
                        arg7[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var19;
            }
        } else if (arg3 == 2) {
            for (int var61 = var16; var61 < var17; var61++) {
                for (int var62 = var23; var62 < var20; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg7[var15] = arg1;
                    } else if (arg2) {
                        arg7[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var19;
            }
        } else if (arg3 == 3) {
            for (int var63 = var16; var63 < var17; var63++) {
                for (int var64 = var24 - 1; var64 >= var21; var64--) {
                    if (var64 <= var63 << 1) {
                        arg7[var15] = arg1;
                    } else if (arg2) {
                        arg7[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var19;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)I")
    public static final int method418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1114++;
        int var7 = arg3 & 0x3;
        if ((arg6 & arg0) == 1) {
            int var8 = arg1;
            arg1 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return (7 - arg4) + 1 - arg1;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg5;
        } else {
            return arg4;
        }
    }
}
