import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class20 {

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    private int field51 = -32768;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Llk;")
    public static class232 field47 = new class232(50);

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Lmc;")
    public static class151 field54;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field53;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIZIIZI[I)V")
    public static final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9, int[] arg10) {
        field46++;
        int var11 = arg4;
        if (arg4 >= class188.field3434) {
            return;
        }
        if (class188.field3438 > arg4) {
            var11 = class188.field3438;
        }
        int var12 = arg3 + arg4;
        if (var12 <= class188.field3438) {
            return;
        }
        if (class188.field3434 < var12) {
            var12 = class188.field3434;
        }
        int var13 = arg0;
        if (!arg8) {
            field53 = null;
        }
        if (class188.field3435 <= arg0) {
            return;
        }
        int var14 = arg0 + arg7;
        if (class188.field3432 > arg0) {
            var13 = class188.field3432;
        }
        if (var14 <= class188.field3432) {
            return;
        }
        if (arg2 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg2 = 1;
        }
        if (class188.field3435 < var14) {
            var14 = class188.field3435;
        }
        if (arg2 == 10) {
            arg2 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        int var15 = var14 - arg0;
        if (arg2 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg2 = 8;
        }
        int var16 = class188.field3436 + var11 - var12;
        int var17 = class188.field3436 * var13 + var11;
        int var18 = var11 - arg4;
        int var19 = var13 - arg0;
        int var20 = var12 - arg4;
        int var21 = arg3 - var18;
        int var22 = arg7 - var19;
        int var23 = arg7 - var15;
        int var24 = arg3 - var20;
        if (arg2 == 1) {
            if (arg6 == 0) {
                for (int var25 = var19; var25 < var15; var25++) {
                    for (int var26 = var18; var26 < var20; var26++) {
                        if (var25 >= var26) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 1) {
                for (int var27 = var22 - 1; var27 >= var23; var27--) {
                    for (int var28 = var18; var28 < var20; var28++) {
                        if (var28 <= var27) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 2) {
                for (int var29 = var19; var29 < var15; var29++) {
                    for (int var30 = var18; var30 < var20; var30++) {
                        if (var29 <= var30) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 3) {
                for (int var31 = var22 - 1; var31 >= var23; var31--) {
                    for (int var32 = var18; var32 < var20; var32++) {
                        if (var32 >= var31) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg2 == 2) {
            if (arg6 == 0) {
                for (int var33 = var22 - 1; var33 >= var23; var33--) {
                    for (int var34 = var18; var34 < var20; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 1) {
                for (int var35 = var19; var35 < var15; var35++) {
                    for (int var36 = var18; var36 < var20; var36++) {
                        if (var17 >= 0 && var17 < arg10.length) {
                            if (var36 >= var35 << 1) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        } else {
                            var17++;
                        }
                    }
                    var17 += var16;
                }
            } else if (arg6 == 2) {
                for (int var37 = var19; var37 < var15; var37++) {
                    for (int var38 = var21 - 1; var38 >= var24; var38--) {
                        if (var38 <= var37 >> 1) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 3) {
                for (int var39 = var22 - 1; var39 >= var23; var39--) {
                    for (int var40 = var21 - 1; var40 >= var24; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg2 == 3) {
            if (arg6 == 0) {
                for (int var41 = var22 - 1; var41 >= var23; var41--) {
                    for (int var42 = var21 - 1; var42 >= var24; var42--) {
                        if (var41 >> 1 >= var42) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 1) {
                for (int var43 = var22 - 1; var43 >= var23; var43--) {
                    for (int var44 = var18; var44 < var20; var44++) {
                        if (var43 << 1 <= var44) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 2) {
                for (int var45 = var19; var45 < var15; var45++) {
                    for (int var46 = var18; var46 < var20; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 3) {
                for (int var47 = var19; var47 < var15; var47++) {
                    for (int var48 = var21 - 1; var48 >= var24; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg2 == 4) {
            if (arg6 == 0) {
                for (int var49 = var22 - 1; var49 >= var23; var49--) {
                    for (int var50 = var18; var50 < var20; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 1) {
                for (int var51 = var19; var51 < var15; var51++) {
                    for (int var52 = var18; var52 < var20; var52++) {
                        if (var52 <= (var51 << 1)) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 2) {
                for (int var53 = var19; var53 < var15; var53++) {
                    for (int var54 = var21 - 1; var54 >= var24; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg6 == 3) {
                for (int var55 = var22 - 1; var55 >= var23; var55--) {
                    for (int var56 = var21 - 1; var56 >= var24; var56--) {
                        if (var55 << 1 >= var56) {
                            arg10[var17] = arg9;
                        } else if (arg5) {
                            arg10[var17] = arg1;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg2 != 5) {
            if (arg2 == 6) {
                if (arg6 == 0) {
                    for (int var65 = var19; var65 < var15; var65++) {
                        for (int var66 = var18; var66 < var20; var66++) {
                            if ((arg3 / 2) >= var66) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var67 = var19; var67 < var15; var67++) {
                        for (int var68 = var18; var68 < var20; var68++) {
                            if ((arg7 / 2) >= var67) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var69 = var19; var69 < var15; var69++) {
                        for (int var70 = var18; var70 < var20; var70++) {
                            if (var70 >= arg3 / 2) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var71 = var19; var71 < var15; var71++) {
                        for (int var72 = var18; var72 < var20; var72++) {
                            if (arg7 / 2 <= var71) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
            if (arg2 == 7) {
                if (arg6 == 0) {
                    for (int var73 = var19; var73 < var15; var73++) {
                        for (int var74 = var18; var74 < var20; var74++) {
                            if (var73 - arg7 / 2 >= var74) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var75 = var22 - 1; var75 >= var23; var75--) {
                        for (int var76 = var18; var76 < var20; var76++) {
                            if (var76 <= var75 - arg7 / 2) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var77 = var22 - 1; var77 >= var23; var77--) {
                        for (int var78 = var21 - 1; var78 >= var24; var78--) {
                            if ((var77 - arg7 / 2) >= var78) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var79 = var19; var79 < var15; var79++) {
                        for (int var80 = var21 - 1; var80 >= var24; var80--) {
                            if (var79 - (arg7 / 2) >= var80) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
            if (arg2 == 8) {
                if (arg6 == 0) {
                    for (int var81 = var19; var81 < var15; var81++) {
                        for (int var82 = var18; var82 < var20; var82++) {
                            if (var81 - (arg7 / 2) <= var82) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var83 = var22 - 1; var83 >= var23; var83--) {
                        for (int var84 = var18; var84 < var20; var84++) {
                            if (var83 - (arg7 / 2) <= var84) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var85 = var22 - 1; var85 >= var23; var85--) {
                        for (int var86 = var21 - 1; var86 >= var24; var86--) {
                            if (var86 >= var85 - arg7 / 2) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var87 = var19; var87 < var15; var87++) {
                        for (int var88 = var21 - 1; var88 >= var24; var88--) {
                            if ((var87 - arg7 / 2) <= var88) {
                                arg10[var17] = arg9;
                            } else if (arg5) {
                                arg10[var17] = arg1;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var57 = var22 - 1; var57 >= var23; var57--) {
                for (int var58 = var21 - 1; var58 >= var24; var58--) {
                    if ((var57 >> 1) <= var58) {
                        arg10[var17] = arg9;
                    } else if (arg5) {
                        arg10[var17] = arg1;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg6 == 1) {
            for (int var59 = var22 - 1; var59 >= var23; var59--) {
                for (int var60 = var18; var60 < var20; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg10[var17] = arg9;
                    } else if (arg5) {
                        arg10[var17] = arg1;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg6 == 2) {
            for (int var61 = var19; var61 < var15; var61++) {
                for (int var62 = var18; var62 < var20; var62++) {
                    if (var62 >= var61 >> 1) {
                        arg10[var17] = arg9;
                    } else if (arg5) {
                        arg10[var17] = arg1;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg6 == 3) {
            for (int var63 = var19; var63 < var15; var63++) {
                for (int var64 = var21 - 1; var64 >= var24; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg10[var17] = arg9;
                    } else if (arg5) {
                        arg10[var17] = arg1;
                    }
                    var17++;
                }
                var17 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method20(int arg0) {
        field53 = null;
        if (arg0 != -8984) {
            method20(-68);
        }
        field54 = null;
        field47 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field48++;
        class217 var11 = class201.method1425(44, this.field49).method1236((class138) null, 0, this.field50, (byte) 113);
        if (var11 != null) {
            var11.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field51 = var11.method22();
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()I")
    public final int method22() {
        field52++;
        return this.field51;
    }
}
