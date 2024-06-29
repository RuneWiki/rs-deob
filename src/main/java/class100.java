import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class100 {

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1599 = "scroll:";

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field1605 = 500;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "J")
    public static long field1593 = 0L;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field1612 = 0;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1615 = "Started 3d Library";

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lag;")
    public static class188 field1607;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public static int[] field1589;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIZ[IIIIIZI)V")
    public static final void method774(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        int var11 = arg8;
        field1610++;
        if (class201.field3147 <= arg8) {
            return;
        }
        if (class201.field3142 > arg8) {
            var11 = class201.field3142;
        }
        int var12 = arg0 + arg8;
        if (var12 <= class201.field3142) {
            return;
        }
        if (var12 > class201.field3147) {
            var12 = class201.field3147;
        }
        int var13 = arg1;
        if (class201.field3143 <= arg1) {
            return;
        }
        int var14 = arg1 + arg6;
        if (arg1 < class201.field3149) {
            var13 = class201.field3149;
        }
        if (class201.field3149 >= var14) {
            return;
        }
        if (arg5 == 9) {
            arg5 = 1;
            arg10 = arg10 + 1 & 0x3;
        }
        if (var14 > class201.field3143) {
            var14 = class201.field3143;
        }
        if (arg5 == 10) {
            arg5 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        int var15 = var14 - arg1;
        if (arg5 == 11) {
            arg5 = 8;
            arg10 = arg10 + 3 & 0x3;
        }
        if (arg9) {
            field1608 = -3;
        }
        int var16 = class201.field3146 * var13 + var11;
        int var17 = var13 - arg1;
        int var18 = arg6 - var15;
        int var19 = class201.field3146 + var11 - var12;
        int var20 = var12 - arg8;
        int var21 = arg6 - var17;
        int var22 = var11 - arg8;
        int var23 = arg0 - var20;
        int var24 = arg0 - var22;
        if (arg5 == 1) {
            if (arg10 == 0) {
                for (int var25 = var17; var25 < var15; var25++) {
                    for (int var26 = var22; var26 < var20; var26++) {
                        if (var26 <= var25) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 1) {
                for (int var27 = var21 - 1; var27 >= var18; var27--) {
                    for (int var28 = var22; var28 < var20; var28++) {
                        if (var28 <= var27) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var22; var30 < var20; var30++) {
                        if (var29 <= var30) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 3) {
                for (int var31 = var21 - 1; var31 >= var18; var31--) {
                    for (int var32 = var22; var32 < var20; var32++) {
                        if (var32 >= var31) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg5 == 2) {
            if (arg10 == 0) {
                for (int var33 = var21 - 1; var33 >= var18; var33--) {
                    for (int var34 = var22; var34 < var20; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var22; var36 < var20; var36++) {
                        if (var16 >= 0 && arg4.length > var16) {
                            if ((var35 << 1) <= var36) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var19;
                }
            } else if (arg10 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var24 - 1; var38 >= var23; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 3) {
                for (int var39 = var21 - 1; var39 >= var18; var39--) {
                    for (int var40 = var24 - 1; var40 >= var23; var40--) {
                        if ((var39 << 1) <= var40) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg5 == 3) {
            if (arg10 == 0) {
                for (int var41 = var21 - 1; var41 >= var18; var41--) {
                    for (int var42 = var24 - 1; var42 >= var23; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 1) {
                for (int var43 = var21 - 1; var43 >= var18; var43--) {
                    for (int var44 = var22; var44 < var20; var44++) {
                        if (var44 >= var43 << 1) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 2) {
                for (int var45 = var17; var45 < var15; var45++) {
                    for (int var46 = var22; var46 < var20; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 3) {
                for (int var47 = var17; var47 < var15; var47++) {
                    for (int var48 = var24 - 1; var48 >= var23; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg5 == 4) {
            if (arg10 == 0) {
                for (int var49 = var21 - 1; var49 >= var18; var49--) {
                    for (int var50 = var22; var50 < var20; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 1) {
                for (int var51 = var17; var51 < var15; var51++) {
                    for (int var52 = var22; var52 < var20; var52++) {
                        if ((var51 << 1) >= var52) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 2) {
                for (int var53 = var17; var53 < var15; var53++) {
                    for (int var54 = var24 - 1; var54 >= var23; var54--) {
                        if ((var53 >> 1) <= var54) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg10 == 3) {
                for (int var55 = var21 - 1; var55 >= var18; var55--) {
                    for (int var56 = var24 - 1; var56 >= var23; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg4[var16] = arg7;
                        } else if (arg3) {
                            arg4[var16] = arg2;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg10 == 0) {
                    for (int var65 = var17; var65 < var15; var65++) {
                        for (int var66 = var22; var66 < var20; var66++) {
                            if (arg0 / 2 >= var66) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var67 = var17; var67 < var15; var67++) {
                        for (int var68 = var22; var68 < var20; var68++) {
                            if ((arg6 / 2) >= var67) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var69 = var17; var69 < var15; var69++) {
                        for (int var70 = var22; var70 < var20; var70++) {
                            if (arg0 / 2 <= var70) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var71 = var17; var71 < var15; var71++) {
                        for (int var72 = var22; var72 < var20; var72++) {
                            if (var71 >= arg6 / 2) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg10 == 0) {
                    for (int var73 = var17; var73 < var15; var73++) {
                        for (int var74 = var22; var74 < var20; var74++) {
                            if (var74 <= var73 - (arg6 / 2)) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var75 = var21 - 1; var75 >= var18; var75--) {
                        for (int var76 = var22; var76 < var20; var76++) {
                            if (var76 <= var75 - arg6 / 2) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var77 = var21 - 1; var77 >= var18; var77--) {
                        for (int var78 = var24 - 1; var78 >= var23; var78--) {
                            if (var78 <= var77 - (arg6 / 2)) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var79 = var17; var79 < var15; var79++) {
                        for (int var80 = var24 - 1; var80 >= var23; var80--) {
                            if (var80 <= var79 - (arg6 / 2)) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
            if (arg5 == 8) {
                if (arg10 == 0) {
                    for (int var81 = var17; var81 < var15; var81++) {
                        for (int var82 = var22; var82 < var20; var82++) {
                            if ((var81 - arg6 / 2) <= var82) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var83 = var21 - 1; var83 >= var18; var83--) {
                        for (int var84 = var22; var84 < var20; var84++) {
                            if (var84 >= var83 - arg6 / 2) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var85 = var21 - 1; var85 >= var18; var85--) {
                        for (int var86 = var24 - 1; var86 >= var23; var86--) {
                            if (var86 >= (var85 - (arg6 / 2))) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var87 = var17; var87 < var15; var87++) {
                        for (int var88 = var24 - 1; var88 >= var23; var88--) {
                            if ((var87 - arg6 / 2) <= var88) {
                                arg4[var16] = arg7;
                            } else if (arg3) {
                                arg4[var16] = arg2;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
        } else if (arg10 == 0) {
            for (int var57 = var21 - 1; var57 >= var18; var57--) {
                for (int var58 = var24 - 1; var58 >= var23; var58--) {
                    if (var58 >= var57 >> 1) {
                        arg4[var16] = arg7;
                    } else if (arg3) {
                        arg4[var16] = arg2;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg10 == 1) {
            for (int var59 = var21 - 1; var59 >= var18; var59--) {
                for (int var60 = var22; var60 < var20; var60++) {
                    if (var59 << 1 >= var60) {
                        arg4[var16] = arg7;
                    } else if (arg3) {
                        arg4[var16] = arg2;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg10 == 2) {
            for (int var61 = var17; var61 < var15; var61++) {
                for (int var62 = var22; var62 < var20; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg4[var16] = arg7;
                    } else if (arg3) {
                        arg4[var16] = arg2;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg10 == 3) {
            for (int var63 = var17; var63 < var15; var63++) {
                for (int var64 = var24 - 1; var64 >= var23; var64--) {
                    if (var63 << 1 >= var64) {
                        arg4[var16] = arg7;
                    } else if (arg3) {
                        arg4[var16] = arg2;
                    }
                    var16++;
                }
                var16 += var19;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method775(int arg0) {
        field1611++;
        if (class227.field3554 == arg0) {
            if (class155.field2362 == class135.field2111 && class287.field4525 == class112.field1765) {
                class227.field3554 = 0;
                if (class181.field2697 && class145.field2256[81] && class220.field3450 > 2) {
                    class188.method1269((byte) -119, class220.field3450 - 2);
                } else {
                    class188.method1269((byte) -67, class220.field3450 - 1);
                }
            }
        } else if (class78.field1317 == class155.field2362 && class287.field4525 == class126.field1985) {
            class227.field3554 = 0;
            if (class181.field2697 && class145.field2256[81] && class220.field3450 > 2) {
                class188.method1269((byte) -96, class220.field3450 - 2);
            } else {
                class188.method1269((byte) -34, class220.field3450 - 1);
            }
        } else {
            class227.field3554 = 2;
            class135.field2111 = class78.field1317;
            class112.field1765 = class126.field1985;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method776(int arg0) {
        field1607 = null;
        field1599 = null;
        if (arg0 != 5248) {
            field1593 = -87L;
        }
        field1589 = null;
        field1615 = null;
    }
}
