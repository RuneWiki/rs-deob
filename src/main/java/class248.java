import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class248 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4106 = 0;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lhm;")
    public static class19 field4107;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 5)
    public static void method1753(int arg0) {
        field4107 = null;
        if (arg0 != 7354) {
            field4106 = 16;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)V", line = 17)
    public static final void method1754(boolean arg0, byte arg1) {
        field4109++;
        if (arg1 <= 42) {
            field4106 = 64;
        }
        class173.method1272(arg0, class112.field1945, class148.field2499, class73.field1287, -105);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIII)V", line = 38)
    public static final void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4105++;
        int var6 = class110.method827((byte) -98, arg3, class72.field1275, class220.field3664);
        int var7 = class110.method827((byte) -74, arg5, class72.field1275, class220.field3664);
        int var8 = class110.method827((byte) -76, arg0, class48.field941, class125.field2164);
        int var9 = class110.method827((byte) 64, arg4, class48.field941, class125.field2164);
        for (int var10 = var6; var10 <= var7; var10++) {
            class150.method1124(var9, var8, arg2, true, class37.field694[var10]);
        }
        if (arg1 != 6885) {
            field4106 = -89;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZII[IIIIII)V", line = 70)
    public static final void method1756(int arg0, int arg1, boolean arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4104++;
        int var11 = arg8;
        if (class115.field1979 <= arg8) {
            return;
        }
        if (class115.field1980 > arg8) {
            var11 = class115.field1980;
        }
        int var12 = arg8 + arg1;
        if (var12 <= class115.field1980) {
            return;
        }
        if (var12 > class115.field1979) {
            var12 = class115.field1979;
        }
        int var13 = arg6;
        if (class115.field1984 <= arg6) {
            return;
        }
        int var14 = arg6 + arg7;
        if (arg6 < class115.field1982) {
            var13 = class115.field1982;
        }
        if (var14 <= class115.field1982) {
            return;
        }
        if (arg4 == 9) {
            arg4 = 1;
            arg9 = arg9 + 1 & 0x3;
        }
        if (class115.field1984 < var14) {
            var14 = class115.field1984;
        }
        if (arg10 != -12478) {
            field4107 = (class19) null;
        }
        int var15 = class115.field1986 * var13 + var11;
        if (arg4 == 10) {
            arg4 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        int var16 = var11 + class115.field1986 - var12;
        int var17 = var12 - arg8;
        int var18 = var14 - arg6;
        int var19 = var11 - arg8;
        if (arg4 == 11) {
            arg4 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        int var20 = arg7 - var18;
        int var21 = var13 - arg6;
        int var22 = arg1 - var17;
        int var23 = arg7 - var21;
        int var24 = arg1 - var19;
        if (arg4 == 1) {
            if (arg9 == 0) {
                for (int var31 = var21; var31 < var18; var31++) {
                    for (int var32 = var19; var32 < var17; var32++) {
                        if (var31 >= var32) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 1) {
                for (int var29 = var23 - 1; var29 >= var20; var29--) {
                    for (int var30 = var19; var30 < var17; var30++) {
                        if (var29 >= var30) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 2) {
                for (int var25 = var21; var25 < var18; var25++) {
                    for (int var26 = var19; var26 < var17; var26++) {
                        if (var26 >= var25) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 3) {
                for (int var27 = var23 - 1; var27 >= var20; var27--) {
                    for (int var28 = var19; var28 < var17; var28++) {
                        if (var27 <= var28) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg4 == 2) {
            if (arg9 == 0) {
                for (int var33 = var23 - 1; var33 >= var20; var33--) {
                    for (int var34 = var19; var34 < var17; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 1) {
                for (int var35 = var21; var35 < var18; var35++) {
                    for (int var36 = var19; var36 < var17; var36++) {
                        if (var15 >= 0 && var15 < arg5.length) {
                            if ((var35 << 1) <= var36) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var16;
                }
            } else if (arg9 == 2) {
                for (int var39 = var21; var39 < var18; var39++) {
                    for (int var40 = var24 - 1; var40 >= var22; var40--) {
                        if ((var39 >> 1) >= var40) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 3) {
                for (int var37 = var23 - 1; var37 >= var20; var37--) {
                    for (int var38 = var24 - 1; var38 >= var22; var38--) {
                        if (var38 >= var37 << 1) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg4 == 3) {
            if (arg9 == 0) {
                for (int var81 = var23 - 1; var81 >= var20; var81--) {
                    for (int var82 = var24 - 1; var82 >= var22; var82--) {
                        if (var81 >> 1 >= var82) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 1) {
                for (int var83 = var23 - 1; var83 >= var20; var83--) {
                    for (int var84 = var19; var84 < var17; var84++) {
                        if (var84 >= var83 << 1) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 2) {
                for (int var85 = var21; var85 < var18; var85++) {
                    for (int var86 = var19; var86 < var17; var86++) {
                        if ((var85 >> 1) >= var86) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 3) {
                for (int var87 = var21; var87 < var18; var87++) {
                    for (int var88 = var24 - 1; var88 >= var22; var88--) {
                        if ((var87 << 1) <= var88) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg4 == 4) {
            if (arg9 == 0) {
                for (int var41 = var23 - 1; var41 >= var20; var41--) {
                    for (int var42 = var19; var42 < var17; var42++) {
                        if (var42 >= var41 >> 1) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 1) {
                for (int var43 = var21; var43 < var18; var43++) {
                    for (int var44 = var19; var44 < var17; var44++) {
                        if (var44 <= (var43 << 1)) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 2) {
                for (int var47 = var21; var47 < var18; var47++) {
                    for (int var48 = var24 - 1; var48 >= var22; var48--) {
                        if (var48 >= (var47 >> 1)) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg9 == 3) {
                for (int var45 = var23 - 1; var45 >= var20; var45--) {
                    for (int var46 = var24 - 1; var46 >= var22; var46--) {
                        if ((var45 << 1) >= var46) {
                            arg5[var15] = arg3;
                        } else if (arg2) {
                            arg5[var15] = arg0;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg9 == 0) {
                    for (int var49 = var21; var49 < var18; var49++) {
                        for (int var50 = var19; var50 < var17; var50++) {
                            if (var50 <= arg1 / 2) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var71 = var21; var71 < var18; var71++) {
                        for (int var72 = var19; var72 < var17; var72++) {
                            if (arg7 / 2 >= var71) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var51 = var21; var51 < var18; var51++) {
                        for (int var52 = var19; var52 < var17; var52++) {
                            if (var52 >= arg1 / 2) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var69 = var21; var69 < var18; var69++) {
                        for (int var70 = var19; var70 < var17; var70++) {
                            if ((arg7 / 2) <= var69) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg9 == 0) {
                    for (int var53 = var21; var53 < var18; var53++) {
                        for (int var54 = var19; var54 < var17; var54++) {
                            if (var54 <= var53 - (arg7 / 2)) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var55 = var23 - 1; var55 >= var20; var55--) {
                        for (int var56 = var19; var56 < var17; var56++) {
                            if ((var55 - (arg7 / 2)) >= var56) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var59 = var23 - 1; var59 >= var20; var59--) {
                        for (int var60 = var24 - 1; var60 >= var22; var60--) {
                            if ((var59 - (arg7 / 2)) >= var60) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var57 = var21; var57 < var18; var57++) {
                        for (int var58 = var24 - 1; var58 >= var22; var58--) {
                            if (var57 - (arg7 / 2) >= var58) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg9 == 0) {
                    for (int var61 = var21; var61 < var18; var61++) {
                        for (int var62 = var19; var62 < var17; var62++) {
                            if (var62 >= var61 - (arg7 / 2)) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var23 - 1; var67 >= var20; var67--) {
                        for (int var68 = var19; var68 < var17; var68++) {
                            if (var67 - (arg7 / 2) <= var68) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var63 = var23 - 1; var63 >= var20; var63--) {
                        for (int var64 = var24 - 1; var64 >= var22; var64--) {
                            if ((var63 - arg7 / 2) <= var64) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var65 = var21; var65 < var18; var65++) {
                        for (int var66 = var24 - 1; var66 >= var22; var66--) {
                            if (var66 >= (var65 - arg7 / 2)) {
                                arg5[var15] = arg3;
                            } else if (arg2) {
                                arg5[var15] = arg0;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var73 = var23 - 1; var73 >= var20; var73--) {
                for (int var74 = var24 - 1; var74 >= var22; var74--) {
                    if (var73 >> 1 <= var74) {
                        arg5[var15] = arg3;
                    } else if (arg2) {
                        arg5[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg9 == 1) {
            for (int var75 = var23 - 1; var75 >= var20; var75--) {
                for (int var76 = var19; var76 < var17; var76++) {
                    if (var76 <= (var75 << 1)) {
                        arg5[var15] = arg3;
                    } else if (arg2) {
                        arg5[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg9 == 2) {
            for (int var79 = var21; var79 < var18; var79++) {
                for (int var80 = var19; var80 < var17; var80++) {
                    if (var80 >= (var79 >> 1)) {
                        arg5[var15] = arg3;
                    } else if (arg2) {
                        arg5[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg9 == 3) {
            for (int var77 = var21; var77 < var18; var77++) {
                for (int var78 = var24 - 1; var78 >= var22; var78--) {
                    if ((var77 << 1) >= var78) {
                        arg5[var15] = arg3;
                    } else if (arg2) {
                        arg5[var15] = arg0;
                    }
                    var15++;
                }
                var15 += var16;
            }
        }
    }
}
