import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class151 extends class60 {

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "[I")
    public int[] field2625 = new int[] { -1 };

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "[I")
    public int[] field2626 = new int[1];

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "Lub;")
    private static class227 field2633 = class257.method1749("level)2", 17263);

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lub;")
    public static class227 field2620 = class257.method1749(")2", 17263);

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "Lub;")
    public static class227 field2630 = field2633;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "Z")
    public static boolean field2635 = false;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "[I")
    public static int[] field2637 = new int[200];

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "J")
    public static long field2632;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "[I")
    public static int[] field2628;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(BLn;)V")
    public static final void method951(byte arg0, class138 arg1) {
        if (arg0 < 104) {
            field2635 = true;
        }
        class92.field1573 = arg1;
        field2634++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIII[IZI)V")
    public static final void method952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, boolean arg9, int arg10) {
        field2623++;
        if (arg10 == 9) {
            arg10 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg10 == 10) {
            arg10 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (class111.field2067 > arg3) {
            arg4 -= class111.field2067 - arg3;
            arg3 = class111.field2067;
        }
        if (arg2 < class111.field2063) {
            arg7 -= class111.field2063 - arg2;
            arg2 = class111.field2063;
        }
        if (class111.field2068 < arg3 + arg4) {
            arg4 = class111.field2068 - arg3;
        }
        if (arg10 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg10 = 8;
        }
        int var11 = class111.field2066 - arg4;
        int var12 = class111.field2066 * arg2 + arg3;
        if (arg2 + arg7 > class111.field2065) {
            arg7 = class111.field2065 - arg2;
        }
        if (arg10 == 1) {
            if (arg1 == 0) {
                for (int var13 = 0; var13 < arg7; var13++) {
                    for (int var14 = 0; var14 < arg4; var14++) {
                        if (var13 >= var14) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 1) {
                for (int var15 = arg7 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg4; var16++) {
                        if (var16 <= var15) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 2) {
                for (int var17 = 0; var17 < arg7; var17++) {
                    for (int var18 = 0; var18 < arg4; var18++) {
                        if (var17 <= var18) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 3) {
                for (int var19 = arg7 - 1; var19 >= 0; var19--) {
                    for (int var20 = 0; var20 < arg4; var20++) {
                        if (var20 >= var19) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg10 == 2) {
            if (arg1 == 0) {
                for (int var21 = arg7 - 1; var21 >= 0; var21--) {
                    for (int var22 = 0; var22 < arg4; var22++) {
                        if (var22 <= (var21 >> 1)) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 1) {
                for (int var23 = 0; var23 < arg7; var23++) {
                    for (int var24 = 0; var24 < arg4; var24++) {
                        if (var24 >= (var23 << 1)) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 2) {
                for (int var25 = 0; var25 < arg7; var25++) {
                    for (int var26 = arg4 - 1; var26 >= 0; var26--) {
                        if ((var25 >> 1) >= var26) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 3) {
                for (int var27 = arg7 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg4 - 1; var28 >= 0; var28--) {
                        if ((var27 << 1) <= var28) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg10 == 3) {
            if (arg1 == 0) {
                for (int var29 = arg7 - 1; var29 >= 0; var29--) {
                    for (int var30 = arg4 - 1; var30 >= 0; var30--) {
                        if ((var29 >> 1) >= var30) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 1) {
                for (int var31 = arg7 - 1; var31 >= 0; var31--) {
                    for (int var32 = 0; var32 < arg4; var32++) {
                        if (var32 >= (var31 << 1)) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 2) {
                for (int var33 = 0; var33 < arg7; var33++) {
                    for (int var34 = 0; var34 < arg4; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 3) {
                for (int var35 = 0; var35 < arg7; var35++) {
                    for (int var36 = arg4 - 1; var36 >= 0; var36--) {
                        if ((var35 << 1) <= var36) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        } else if (arg5 == -23737) {
            if (arg10 == 4) {
                if (arg1 == 0) {
                    for (int var37 = arg7 - 1; var37 >= 0; var37--) {
                        for (int var38 = 0; var38 < arg4; var38++) {
                            if (var38 >= var37 >> 1) {
                                arg8[var12] = arg6;
                            } else if (arg9) {
                                arg8[var12] = arg0;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 1) {
                    for (int var39 = 0; var39 < arg7; var39++) {
                        for (int var40 = 0; var40 < arg4; var40++) {
                            if (var39 << 1 >= var40) {
                                arg8[var12] = arg6;
                            } else if (arg9) {
                                arg8[var12] = arg0;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 2) {
                    for (int var41 = 0; var41 < arg7; var41++) {
                        for (int var42 = arg4 - 1; var42 >= 0; var42--) {
                            if (var41 >> 1 <= var42) {
                                arg8[var12] = arg6;
                            } else if (arg9) {
                                arg8[var12] = arg0;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                } else if (arg1 == 3) {
                    for (int var43 = arg7 - 1; var43 >= 0; var43--) {
                        for (int var44 = arg4 - 1; var44 >= 0; var44--) {
                            if (var44 <= var43 << 1) {
                                arg8[var12] = arg6;
                            } else if (arg9) {
                                arg8[var12] = arg0;
                            }
                            var12++;
                        }
                        var12 += var11;
                    }
                }
            } else if (arg10 != 5) {
                if (arg10 == 6) {
                    if (arg1 == 0) {
                        for (int var53 = 0; var53 < arg7; var53++) {
                            for (int var54 = 0; var54 < arg4; var54++) {
                                if (arg4 / 2 >= var54) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var55 = 0; var55 < arg7; var55++) {
                            for (int var56 = 0; var56 < arg4; var56++) {
                                if (var55 <= (arg7 / 2)) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var57 = 0; var57 < arg7; var57++) {
                            for (int var58 = 0; var58 < arg4; var58++) {
                                if (arg4 / 2 <= var58) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var59 = 0; var59 < arg7; var59++) {
                            for (int var60 = 0; var60 < arg4; var60++) {
                                if ((arg7 / 2) <= var59) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                }
                if (arg10 == 7) {
                    if (arg1 == 0) {
                        for (int var61 = 0; var61 < arg7; var61++) {
                            for (int var62 = 0; var62 < arg4; var62++) {
                                if (var61 - (arg7 / 2) >= var62) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var63 = arg7 - 1; var63 >= 0; var63--) {
                            for (int var64 = 0; var64 < arg4; var64++) {
                                if (var63 - (arg7 / 2) >= var64) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var65 = arg7 - 1; var65 >= 0; var65--) {
                            for (int var66 = arg4 - 1; var66 >= 0; var66--) {
                                if (var66 <= (var65 - arg7 / 2)) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var67 = 0; var67 < arg7; var67++) {
                            for (int var68 = arg4 - 1; var68 >= 0; var68--) {
                                if ((var67 - arg7 / 2) >= var68) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                }
                if (arg10 == 8) {
                    if (arg1 == 0) {
                        for (int var69 = 0; var69 < arg7; var69++) {
                            for (int var70 = 0; var70 < arg4; var70++) {
                                if ((var69 - (arg7 / 2)) <= var70) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var71 = arg7 - 1; var71 >= 0; var71--) {
                            for (int var72 = 0; var72 < arg4; var72++) {
                                if (var71 - (arg7 / 2) <= var72) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var73 = arg7 - 1; var73 >= 0; var73--) {
                            for (int var74 = arg4 - 1; var74 >= 0; var74--) {
                                if (var74 >= var73 - arg7 / 2) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var75 = 0; var75 < arg7; var75++) {
                            for (int var76 = arg4 - 1; var76 >= 0; var76--) {
                                if (var75 - (arg7 / 2) <= var76) {
                                    arg8[var12] = arg6;
                                } else if (arg9) {
                                    arg8[var12] = arg0;
                                }
                                var12++;
                            }
                            var12 += var11;
                        }
                        return;
                    }
                }
            } else if (arg1 == 0) {
                for (int var45 = arg7 - 1; var45 >= 0; var45--) {
                    for (int var46 = arg4 - 1; var46 >= 0; var46--) {
                        if (var46 >= (var45 >> 1)) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 1) {
                for (int var47 = arg7 - 1; var47 >= 0; var47--) {
                    for (int var48 = 0; var48 < arg4; var48++) {
                        if (var47 << 1 >= var48) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 2) {
                for (int var49 = 0; var49 < arg7; var49++) {
                    for (int var50 = 0; var50 < arg4; var50++) {
                        if (var50 >= (var49 >> 1)) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            } else if (arg1 == 3) {
                for (int var51 = 0; var51 < arg7; var51++) {
                    for (int var52 = arg4 - 1; var52 >= 0; var52--) {
                        if (var52 <= (var51 << 1)) {
                            arg8[var12] = arg6;
                        } else if (arg9) {
                            arg8[var12] = arg0;
                        }
                        var12++;
                    }
                    var12 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIILn;)[Lna;")
    public static final class209[] method953(int arg0, int arg1, int arg2, class138 arg3) {
        field2621++;
        if (arg0 != -30400) {
            method956((class138) null, 57);
        }
        return class123.method760(arg3, arg1, arg2, -75) ? class148.method939(arg0 ^ 0x6E59) : null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILqa;II)V")
    public static final void method954(int arg0, class225 arg1, int arg2, int arg3) {
        field2627++;
        if (arg1.field101 == arg3 && arg3 != -1) {
            class51 var4 = class25.method127(true, arg3);
            int var5 = var4.field896;
            if (var5 == 1) {
                arg1.field52 = 0;
                arg1.field85 = 0;
                arg1.field95 = 0;
                arg1.field60 = arg2;
                class67.method421(128, var4, arg1.field99, arg1.field50, arg1.field52, class216.field3639 == arg1);
            }
            if (var5 == 2) {
                arg1.field85 = 0;
            }
        } else if (arg3 == -1 || arg1.field101 == -1 || class25.method127(true, arg3).field897 >= class25.method127(true, arg1.field101).field897) {
            arg1.field85 = 0;
            arg1.field52 = 0;
            arg1.field76 = arg1.field111;
            arg1.field101 = arg3;
            arg1.field60 = arg2;
            arg1.field95 = 0;
            if (arg1.field101 != -1) {
                class67.method421(arg0 ^ 0x83, class25.method127(true, arg1.field101), arg1.field99, arg1.field50, arg1.field52, class216.field3639 == arg1);
            }
        }
        if (arg0 != 3) {
            field2635 = true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static void method955(int arg0) {
        field2628 = null;
        field2630 = null;
        field2637 = null;
        field2620 = null;
        field2633 = null;
        int var1 = 123 % ((arg0 - 22) / 46);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ln;I)I")
    public static final int method956(class138 arg0, int arg1) {
        field2624++;
        if (arg1 != 7) {
            return -99;
        }
        int var2 = 0;
        if (arg0.method876(true, class52.field918)) {
            var2++;
        }
        if (arg0.method876(true, class223.field3780)) {
            var2++;
        }
        return var2;
    }
}
