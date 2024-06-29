import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class242 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Leg;")
    public static class188 field3826 = new class188(30);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Z")
    public static boolean field3831 = false;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3830 = new String[500];

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3832 = 0;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1647(int arg0) {
        field3833++;
        if (arg0 != 1082299393) {
            field3830 = (String[]) null;
        }
        class283.field4351.method1298((byte) 110);
        class291.field4479.method1298((byte) 110);
        class336.field5220.method1298((byte) 110);
        class285.field4377.method1298((byte) 110);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIIIIIII[III)V", line = 36)
    public static final void method1648(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        field3829++;
        int var11 = arg1;
        if (arg1 >= class57.field800) {
            return;
        }
        if (class57.field801 > arg1) {
            var11 = class57.field801;
        }
        int var12 = arg1 + arg10;
        if (class57.field801 >= var12 || arg5 != -25383) {
            return;
        }
        if (var12 > class57.field800) {
            var12 = class57.field800;
        }
        int var13 = arg2;
        if (class57.field799 <= arg2) {
            return;
        }
        if (class57.field795 > arg2) {
            var13 = class57.field795;
        }
        int var14 = arg2 + arg7;
        if (var14 <= class57.field795) {
            return;
        }
        if (arg6 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg6 = 1;
        }
        if (var14 > class57.field799) {
            var14 = class57.field799;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg3 = arg3 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg3 = arg3 + 3 & 0x3;
            arg6 = 8;
        }
        int var15 = class57.field798 * var13 + var11;
        int var16 = class57.field798 + var11 - var12;
        int var17 = var13 - arg2;
        int var18 = var11 - arg1;
        int var19 = var12 - arg1;
        int var20 = var14 - arg2;
        int var21 = arg7 - var20;
        int var22 = arg7 - var17;
        int var23 = arg10 - var18;
        int var24 = arg10 - var19;
        if (arg6 == 1) {
            if (arg3 == 0) {
                for (int var31 = var17; var31 < var20; var31++) {
                    for (int var32 = var18; var32 < var19; var32++) {
                        if (var31 >= var32) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var29 = var22 - 1; var29 >= var21; var29--) {
                    for (int var30 = var18; var30 < var19; var30++) {
                        if (var30 <= var29) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var25 = var17; var25 < var20; var25++) {
                    for (int var26 = var18; var26 < var19; var26++) {
                        if (var25 <= var26) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var27 = var22 - 1; var27 >= var21; var27--) {
                    for (int var28 = var18; var28 < var19; var28++) {
                        if (var27 <= var28) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 == 2) {
            if (arg3 == 0) {
                for (int var33 = var22 - 1; var33 >= var21; var33--) {
                    for (int var34 = var18; var34 < var19; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var39 = var17; var39 < var20; var39++) {
                    for (int var40 = var18; var40 < var19; var40++) {
                        if (var15 >= 0 && var15 < arg8.length) {
                            if (var39 << 1 <= var40) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var35 = var17; var35 < var20; var35++) {
                    for (int var36 = var23 - 1; var36 >= var24; var36--) {
                        if (var35 >> 1 >= var36) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var37 = var22 - 1; var37 >= var21; var37--) {
                    for (int var38 = var23 - 1; var38 >= var24; var38--) {
                        if (var38 >= (var37 << 1)) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 == 3) {
            if (arg3 == 0) {
                for (int var87 = var22 - 1; var87 >= var21; var87--) {
                    for (int var88 = var23 - 1; var88 >= var24; var88--) {
                        if (var88 <= (var87 >> 1)) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var85 = var22 - 1; var85 >= var21; var85--) {
                    for (int var86 = var18; var86 < var19; var86++) {
                        if (var86 >= (var85 << 1)) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var81 = var17; var81 < var20; var81++) {
                    for (int var82 = var18; var82 < var19; var82++) {
                        if (var82 <= var81 >> 1) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var83 = var17; var83 < var20; var83++) {
                    for (int var84 = var23 - 1; var84 >= var24; var84--) {
                        if (var83 << 1 <= var84) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 == 4) {
            if (arg3 == 0) {
                for (int var73 = var22 - 1; var73 >= var21; var73--) {
                    for (int var74 = var18; var74 < var19; var74++) {
                        if (var74 >= (var73 >> 1)) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 1) {
                for (int var75 = var17; var75 < var20; var75++) {
                    for (int var76 = var18; var76 < var19; var76++) {
                        if ((var75 << 1) >= var76) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 2) {
                for (int var77 = var17; var77 < var20; var77++) {
                    for (int var78 = var23 - 1; var78 >= var24; var78--) {
                        if (var78 >= var77 >> 1) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg3 == 3) {
                for (int var79 = var22 - 1; var79 >= var21; var79--) {
                    for (int var80 = var23 - 1; var80 >= var24; var80--) {
                        if (var80 <= (var79 << 1)) {
                            arg8[var15] = arg9;
                        } else if (arg0) {
                            arg8[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg3 == 0) {
                    for (int var71 = var17; var71 < var20; var71++) {
                        for (int var72 = var18; var72 < var19; var72++) {
                            if ((arg10 / 2) >= var72) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var49 = var17; var49 < var20; var49++) {
                        for (int var50 = var18; var50 < var19; var50++) {
                            if (var49 <= arg7 / 2) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var51 = var17; var51 < var20; var51++) {
                        for (int var52 = var18; var52 < var19; var52++) {
                            if (var52 >= arg10 / 2) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var69 = var17; var69 < var20; var69++) {
                        for (int var70 = var18; var70 < var19; var70++) {
                            if (var69 >= (arg7 / 2)) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg3 == 0) {
                    for (int var53 = var17; var53 < var20; var53++) {
                        for (int var54 = var18; var54 < var19; var54++) {
                            if (var53 - arg7 / 2 >= var54) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var55 = var22 - 1; var55 >= var21; var55--) {
                        for (int var56 = var18; var56 < var19; var56++) {
                            if (var56 <= (var55 - arg7 / 2)) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var57 = var22 - 1; var57 >= var21; var57--) {
                        for (int var58 = var23 - 1; var58 >= var24; var58--) {
                            if ((var57 - (arg7 / 2)) >= var58) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var67 = var17; var67 < var20; var67++) {
                        for (int var68 = var23 - 1; var68 >= var24; var68--) {
                            if (var68 <= (var67 - arg7 / 2)) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg3 == 0) {
                    for (int var65 = var17; var65 < var20; var65++) {
                        for (int var66 = var18; var66 < var19; var66++) {
                            if ((var65 - arg7 / 2) <= var66) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var59 = var22 - 1; var59 >= var21; var59--) {
                        for (int var60 = var18; var60 < var19; var60++) {
                            if ((var59 - (arg7 / 2)) <= var60) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var63 = var22 - 1; var63 >= var21; var63--) {
                        for (int var64 = var23 - 1; var64 >= var24; var64--) {
                            if (var64 >= var63 - (arg7 / 2)) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var61 = var17; var61 < var20; var61++) {
                        for (int var62 = var23 - 1; var62 >= var24; var62--) {
                            if (var62 >= (var61 - (arg7 / 2))) {
                                arg8[var15] = arg9;
                            } else if (arg0) {
                                arg8[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var41 = var22 - 1; var41 >= var21; var41--) {
                for (int var42 = var23 - 1; var42 >= var24; var42--) {
                    if (var42 >= var41 >> 1) {
                        arg8[var15] = arg9;
                    } else if (arg0) {
                        arg8[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg3 == 1) {
            for (int var47 = var22 - 1; var47 >= var21; var47--) {
                for (int var48 = var18; var48 < var19; var48++) {
                    if (var48 <= (var47 << 1)) {
                        arg8[var15] = arg9;
                    } else if (arg0) {
                        arg8[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg3 == 2) {
            for (int var43 = var17; var43 < var20; var43++) {
                for (int var44 = var18; var44 < var19; var44++) {
                    if (var44 >= var43 >> 1) {
                        arg8[var15] = arg9;
                    } else if (arg0) {
                        arg8[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg3 == 3) {
            for (int var45 = var17; var45 < var20; var45++) {
                for (int var46 = var23 - 1; var46 >= var24; var46--) {
                    if (var46 <= (var45 << 1)) {
                        arg8[var15] = arg9;
                    } else if (arg0) {
                        arg8[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 1223)
    public static final void method1649(int arg0) {
        field3827++;
        if (class129.field2023 < 0) {
            class129.field2023 = 0;
            class121.field1869 = -1;
            class324.field5050 = -1;
        }
        if (class204.field3088 < class129.field2023) {
            class129.field2023 = class204.field3088;
            class324.field5050 = -1;
            class121.field1869 = -1;
        }
        if (class342.field5334 < 0) {
            class342.field5334 = 0;
            class324.field5050 = -1;
            class121.field1869 = -1;
        }
        if (arg0 != 1) {
            method1647(46);
        }
        if (class342.field5334 > class129.field2021) {
            class342.field5334 = class129.field2021;
            class121.field1869 = -1;
            class324.field5050 = -1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 1270)
    public static void method1650(int arg0) {
        int var1 = -30 / ((arg0 - 1) / 59);
        field3826 = null;
        field3830 = null;
    }
}
