import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class164 extends class35 {

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field2649 = -1;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public int field2651 = 0;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
    public static int[] field2656 = new int[128];

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "[[B")
    public static byte[][] field2654;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 5)
    public static void method1046(int arg0) {
        if (arg0 != 14712) {
            method1049(-126, -1.190335683611899D);
        }
        field2656 = null;
        field2654 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[IIIIIIZIII)V", line = 21)
    public static final void method1047(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2;
        field2645++;
        if (arg2 >= class270.field4166) {
            return;
        }
        if (class270.field4171 > arg2) {
            var11 = class270.field4171;
        }
        int var12 = arg2 + arg8;
        if (class270.field4171 >= var12) {
            return;
        }
        if (class270.field4166 < var12) {
            var12 = class270.field4166;
        }
        int var13 = arg10;
        if (arg10 >= class270.field4168) {
            return;
        }
        if (arg10 < class270.field4165) {
            var13 = class270.field4165;
        }
        int var14 = arg0 + arg10;
        if (var14 <= class270.field4165) {
            return;
        }
        if (var14 > class270.field4168) {
            var14 = class270.field4168;
        }
        if (arg3 == 9) {
            arg5 = arg5 + 1 & 0x3;
            arg3 = 1;
        }
        if (arg3 == 10) {
            arg3 = 1;
            arg5 = arg5 + 3 & 0x3;
        }
        if (arg3 == 11) {
            arg3 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        int var15 = var14 - arg10;
        int var16 = class270.field4172 + var11 - var12;
        int var17 = arg0 - var15;
        int var18 = var12 - arg2;
        if (arg6 != 2) {
            return;
        }
        int var19 = arg8 - var18;
        int var20 = class270.field4172 * var13 + var11;
        int var21 = var11 - arg2;
        int var22 = arg8 - var21;
        int var23 = var13 - arg10;
        int var24 = arg0 - var23;
        if (arg3 == 1) {
            if (arg5 == 0) {
                for (int var25 = var23; var25 < var15; var25++) {
                    for (int var26 = var21; var26 < var18; var26++) {
                        if (var25 >= var26) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 1) {
                for (int var31 = var24 - 1; var31 >= var17; var31--) {
                    for (int var32 = var21; var32 < var18; var32++) {
                        if (var32 <= var31) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 2) {
                for (int var29 = var23; var29 < var15; var29++) {
                    for (int var30 = var21; var30 < var18; var30++) {
                        if (var30 >= var29) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 3) {
                for (int var27 = var24 - 1; var27 >= var17; var27--) {
                    for (int var28 = var21; var28 < var18; var28++) {
                        if (var27 <= var28) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            }
        } else if (arg3 == 2) {
            if (arg5 == 0) {
                for (int var39 = var24 - 1; var39 >= var17; var39--) {
                    for (int var40 = var21; var40 < var18; var40++) {
                        if (var40 <= (var39 >> 1)) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 1) {
                for (int var33 = var23; var33 < var15; var33++) {
                    for (int var34 = var21; var34 < var18; var34++) {
                        if (var20 >= 0 && var20 < arg1.length) {
                            if (var34 >= var33 << 1) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        } else {
                            var20++;
                        }
                    }
                    var20 += var16;
                }
            } else if (arg5 == 2) {
                for (int var37 = var23; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var19; var38--) {
                        if (var38 <= var37 >> 1) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 3) {
                for (int var35 = var24 - 1; var35 >= var17; var35--) {
                    for (int var36 = var22 - 1; var36 >= var19; var36--) {
                        if ((var35 << 1) <= var36) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            }
        } else if (arg3 == 3) {
            if (arg5 == 0) {
                for (int var87 = var24 - 1; var87 >= var17; var87--) {
                    for (int var88 = var22 - 1; var88 >= var19; var88--) {
                        if (var87 >> 1 >= var88) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 1) {
                for (int var81 = var24 - 1; var81 >= var17; var81--) {
                    for (int var82 = var21; var82 < var18; var82++) {
                        if ((var81 << 1) <= var82) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 2) {
                for (int var83 = var23; var83 < var15; var83++) {
                    for (int var84 = var21; var84 < var18; var84++) {
                        if (var84 <= (var83 >> 1)) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 3) {
                for (int var85 = var23; var85 < var15; var85++) {
                    for (int var86 = var22 - 1; var86 >= var19; var86--) {
                        if ((var85 << 1) <= var86) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            }
        } else if (arg3 == 4) {
            if (arg5 == 0) {
                for (int var47 = var24 - 1; var47 >= var17; var47--) {
                    for (int var48 = var21; var48 < var18; var48++) {
                        if (var48 >= var47 >> 1) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 1) {
                for (int var41 = var23; var41 < var15; var41++) {
                    for (int var42 = var21; var42 < var18; var42++) {
                        if (var42 <= (var41 << 1)) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 2) {
                for (int var45 = var23; var45 < var15; var45++) {
                    for (int var46 = var22 - 1; var46 >= var19; var46--) {
                        if (var46 >= var45 >> 1) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg5 == 3) {
                for (int var43 = var24 - 1; var43 >= var17; var43--) {
                    for (int var44 = var22 - 1; var44 >= var19; var44--) {
                        if (var44 <= (var43 << 1)) {
                            arg1[var20] = arg4;
                        } else if (arg7) {
                            arg1[var20] = arg9;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            }
        } else if (arg3 != 5) {
            if (arg3 == 6) {
                if (arg5 == 0) {
                    for (int var55 = var23; var55 < var15; var55++) {
                        for (int var56 = var21; var56 < var18; var56++) {
                            if (arg8 / 2 >= var56) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var53 = var23; var53 < var15; var53++) {
                        for (int var54 = var21; var54 < var18; var54++) {
                            if (var53 <= (arg0 / 2)) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var49 = var23; var49 < var15; var49++) {
                        for (int var50 = var21; var50 < var18; var50++) {
                            if (var50 >= arg8 / 2) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var51 = var23; var51 < var15; var51++) {
                        for (int var52 = var21; var52 < var18; var52++) {
                            if ((arg0 / 2) <= var51) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
            }
            if (arg3 == 7) {
                if (arg5 == 0) {
                    for (int var63 = var23; var63 < var15; var63++) {
                        for (int var64 = var21; var64 < var18; var64++) {
                            if (var63 - arg0 / 2 >= var64) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var57 = var24 - 1; var57 >= var17; var57--) {
                        for (int var58 = var21; var58 < var18; var58++) {
                            if (var57 - (arg0 / 2) >= var58) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var61 = var24 - 1; var61 >= var17; var61--) {
                        for (int var62 = var22 - 1; var62 >= var19; var62--) {
                            if (var61 - (arg0 / 2) >= var62) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var59 = var23; var59 < var15; var59++) {
                        for (int var60 = var22 - 1; var60 >= var19; var60--) {
                            if ((var59 - arg0 / 2) >= var60) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
            }
            if (arg3 == 8) {
                if (arg5 == 0) {
                    for (int var65 = var23; var65 < var15; var65++) {
                        for (int var66 = var21; var66 < var18; var66++) {
                            if (var66 >= (var65 - (arg0 / 2))) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var67 = var24 - 1; var67 >= var17; var67--) {
                        for (int var68 = var21; var68 < var18; var68++) {
                            if (var68 >= (var67 - (arg0 / 2))) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var71 = var24 - 1; var71 >= var17; var71--) {
                        for (int var72 = var22 - 1; var72 >= var19; var72--) {
                            if (var72 >= (var71 - (arg0 / 2))) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var69 = var23; var69 < var15; var69++) {
                        for (int var70 = var22 - 1; var70 >= var19; var70--) {
                            if ((var69 - (arg0 / 2)) <= var70) {
                                arg1[var20] = arg4;
                            } else if (arg7) {
                                arg1[var20] = arg9;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
            }
        } else if (arg5 == 0) {
            for (int var73 = var24 - 1; var73 >= var17; var73--) {
                for (int var74 = var22 - 1; var74 >= var19; var74--) {
                    if (var74 >= (var73 >> 1)) {
                        arg1[var20] = arg4;
                    } else if (arg7) {
                        arg1[var20] = arg9;
                    }
                    var20++;
                }
                var20 += var16;
            }
        } else if (arg5 == 1) {
            for (int var79 = var24 - 1; var79 >= var17; var79--) {
                for (int var80 = var21; var80 < var18; var80++) {
                    if (var79 << 1 >= var80) {
                        arg1[var20] = arg4;
                    } else if (arg7) {
                        arg1[var20] = arg9;
                    }
                    var20++;
                }
                var20 += var16;
            }
        } else if (arg5 == 2) {
            for (int var75 = var23; var75 < var15; var75++) {
                for (int var76 = var21; var76 < var18; var76++) {
                    if (var76 >= var75 >> 1) {
                        arg1[var20] = arg4;
                    } else if (arg7) {
                        arg1[var20] = arg9;
                    }
                    var20++;
                }
                var20 += var16;
            }
        } else if (arg5 == 3) {
            for (int var77 = var23; var77 < var15; var77++) {
                for (int var78 = var22 - 1; var78 >= var19; var78--) {
                    if ((var77 << 1) >= var78) {
                        arg1[var20] = arg4;
                    } else if (arg7) {
                        arg1[var20] = arg9;
                    }
                    var20++;
                }
                var20 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILbm;BIZI)V", line = 1207)
    public static final void method1048(int arg0, class307 arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        class177.field2846 = 10000;
        class291.field4472 = arg4;
        class18.field327 = 1;
        int var6 = 19 % ((-arg2 - 44) / 33);
        class204.field3340 = arg5;
        class112.field1976 = arg3;
        class147.field2402 = arg1;
        field2641++;
        class38.field731 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ID)V", line = 1249)
    public static final void method1049(int arg0, double arg1) {
        if (class155.field2526 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class220.field3491[var3] = var4 > 255 ? 255 : var4;
            }
            class155.field2526 = arg1;
        }
        if (arg0 != -7319) {
            method1048(67, (class307) null, (byte) -35, 98, true, 97);
        }
        field2644++;
    }
}
