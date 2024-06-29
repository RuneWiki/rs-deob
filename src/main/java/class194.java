import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class194 extends class82 {

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2964 = " is already on your friend list.";

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    public static void method1213(byte arg0) {
        if (arg0 != -19) {
            field2964 = null;
        }
        field2964 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZIIIIIII[II)V")
    public static final void method1214(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var11 = arg0;
        field2960++;
        if (arg0 >= class111.field1722) {
            return;
        }
        if (class111.field1721 > arg0) {
            var11 = class111.field1721;
        }
        int var12 = arg0 + arg2;
        if (class111.field1721 >= var12) {
            return;
        }
        if (var12 > class111.field1722) {
            var12 = class111.field1722;
        }
        int var13 = arg7;
        if (class111.field1715 <= arg7) {
            return;
        }
        int var14 = arg7 + arg4;
        if (arg7 < class111.field1714) {
            var13 = class111.field1714;
        }
        if (var14 <= class111.field1714) {
            return;
        }
        if (arg6 == 9) {
            arg5 = arg5 + 1 & 0x3;
            arg6 = 1;
        }
        if (var14 > class111.field1715) {
            var14 = class111.field1715;
        }
        int var15 = var14 - arg7;
        if (arg6 == 10) {
            arg5 = arg5 + 3 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        int var16 = class111.field1719 * var13 + var11;
        if (arg8 >= -120) {
            return;
        }
        int var17 = var13 - arg7;
        int var18 = class111.field1719 + var11 - var12;
        int var19 = var12 - arg0;
        int var20 = arg2 - var19;
        int var21 = var11 - arg0;
        int var22 = arg2 - var21;
        int var23 = arg4 - var15;
        int var24 = arg4 - var17;
        if (arg6 == 1) {
            if (arg5 == 0) {
                for (int var25 = var17; var25 < var15; var25++) {
                    for (int var26 = var21; var26 < var19; var26++) {
                        if (var26 <= var25) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var21; var28 < var19; var28++) {
                        if (var27 >= var28) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var21; var30 < var19; var30++) {
                        if (var29 <= var30) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var21; var32 < var19; var32++) {
                        if (var31 <= var32) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg6 == 2) {
            if (arg5 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var21; var34 < var19; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var21; var36 < var19; var36++) {
                        if (var16 >= 0 && var16 < arg9.length) {
                            if (var35 << 1 <= var36) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg5 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var20; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var22 - 1; var40 >= var20; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg6 == 3) {
            if (arg5 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var22 - 1; var42 >= var20; var42--) {
                        if (var42 <= var41 >> 1) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var21; var44 < var19; var44++) {
                        if (var44 >= var43 << 1) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 2) {
                for (int var45 = var17; var45 < var15; var45++) {
                    for (int var46 = var21; var46 < var19; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 3) {
                for (int var47 = var17; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var20; var48--) {
                        if (var48 >= (var47 << 1)) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg6 == 4) {
            if (arg5 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var21; var50 < var19; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 1) {
                for (int var51 = var17; var51 < var15; var51++) {
                    for (int var52 = var21; var52 < var19; var52++) {
                        if ((var51 << 1) >= var52) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 2) {
                for (int var53 = var17; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var20; var54--) {
                        if (var54 >= (var53 >> 1)) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg5 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var22 - 1; var56 >= var20; var56--) {
                        if (var55 << 1 >= var56) {
                            arg9[var16] = arg3;
                        } else if (arg1) {
                            arg9[var16] = arg10;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg5 == 0) {
                    for (int var65 = var17; var65 < var15; var65++) {
                        for (int var66 = var21; var66 < var19; var66++) {
                            if ((arg2 / 2) >= var66) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var67 = var17; var67 < var15; var67++) {
                        for (int var68 = var21; var68 < var19; var68++) {
                            if ((arg4 / 2) >= var67) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var69 = var17; var69 < var15; var69++) {
                        for (int var70 = var21; var70 < var19; var70++) {
                            if ((arg2 / 2) <= var70) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var71 = var17; var71 < var15; var71++) {
                        for (int var72 = var21; var72 < var19; var72++) {
                            if ((arg4 / 2) <= var71) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg5 == 0) {
                    for (int var73 = var17; var73 < var15; var73++) {
                        for (int var74 = var21; var74 < var19; var74++) {
                            if ((var73 - (arg4 / 2)) >= var74) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var21; var76 < var19; var76++) {
                            if (var76 <= var75 - arg4 / 2) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var22 - 1; var78 >= var20; var78--) {
                            if (var78 <= var77 - arg4 / 2) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var79 = var17; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var20; var80--) {
                            if (var80 <= var79 - arg4 / 2) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg5 == 0) {
                    for (int var81 = var17; var81 < var15; var81++) {
                        for (int var82 = var21; var82 < var19; var82++) {
                            if ((var81 - (arg4 / 2)) <= var82) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var21; var84 < var19; var84++) {
                            if (var83 - (arg4 / 2) <= var84) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var22 - 1; var86 >= var20; var86--) {
                            if ((var85 - (arg4 / 2)) <= var86) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var87 = var17; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var20; var88--) {
                            if (var88 >= (var87 - arg4 / 2)) {
                                arg9[var16] = arg3;
                            } else if (arg1) {
                                arg9[var16] = arg10;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg5 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var22 - 1; var58 >= var20; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg9[var16] = arg3;
                    } else if (arg1) {
                        arg9[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg5 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var21; var60 < var19; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg9[var16] = arg3;
                    } else if (arg1) {
                        arg9[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg5 == 2) {
            for (int var61 = var17; var61 < var15; var61++) {
                for (int var62 = var21; var62 < var19; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg9[var16] = arg3;
                    } else if (arg1) {
                        arg9[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg5 == 3) {
            for (int var63 = var17; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var20; var64--) {
                    if (var63 << 1 >= var64) {
                        arg9[var16] = arg3;
                    } else if (arg1) {
                        arg9[var16] = arg10;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V")
    public class194(int arg0, int arg1) {
        this.field2962 = arg1;
        this.field2961 = arg0;
    }
}
