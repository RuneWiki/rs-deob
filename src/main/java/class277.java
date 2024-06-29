import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class277 {

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
    private int[] field4435;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Z")
    public static boolean field4433 = false;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Z")
    public static boolean field4434 = true;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4436 = "Examine";

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
    public final int method1812(int arg0, int arg1) {
        if (arg1 != 5643) {
            return 58;
        }
        field4438++;
        int var3 = (this.field4435.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4435[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4435[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[IIIIIIIIZ)V")
    public static final void method1813(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field4431++;
        if (arg5 >= -95) {
            field4436 = null;
        }
        int var11 = arg7;
        if (arg7 >= class283.field4484) {
            return;
        }
        if (arg7 < class283.field4487) {
            var11 = class283.field4487;
        }
        int var12 = arg7 + arg8;
        if (class283.field4487 >= var12) {
            return;
        }
        if (class283.field4484 < var12) {
            var12 = class283.field4484;
        }
        int var13 = arg0;
        if (class283.field4489 <= arg0) {
            return;
        }
        if (arg0 < class283.field4486) {
            var13 = class283.field4486;
        }
        int var14 = arg0 + arg1;
        if (class283.field4486 >= var14) {
            return;
        }
        if (class283.field4489 < var14) {
            var14 = class283.field4489;
        }
        int var15 = var14 - arg0;
        if (arg6 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg6 = 1;
        }
        int var16 = class283.field4491 + var11 - var12;
        int var17 = class283.field4491 * var13 + var11;
        int var18 = var12 - arg7;
        int var19 = arg8 - var18;
        int var20 = var13 - arg0;
        int var21 = arg1 - var15;
        int var22 = var11 - arg7;
        int var23 = arg8 - var22;
        int var24 = arg1 - var20;
        if (arg6 == 11) {
            arg3 = arg3 + 3 & 0x3;
            arg6 = 8;
        }
        if (arg6 == 1) {
            if (arg3 == 0) {
                for (int var25 = var20; var25 < var15; var25++) {
                    for (int var26 = var22; var26 < var18; var26++) {
                        if (var25 >= var26) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 1) {
                for (int var27 = var24 - 1; var27 >= var21; var27--) {
                    for (int var28 = var22; var28 < var18; var28++) {
                        if (var27 >= var28) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 2) {
                for (int var29 = var20; var29 < var15; var29++) {
                    for (int var30 = var22; var30 < var18; var30++) {
                        if (var29 <= var30) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 3) {
                for (int var31 = var24 - 1; var31 >= var21; var31--) {
                    for (int var32 = var22; var32 < var18; var32++) {
                        if (var32 >= var31) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg6 == 2) {
            if (arg3 == 0) {
                for (int var33 = var24 - 1; var33 >= var21; var33--) {
                    for (int var34 = var22; var34 < var18; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 1) {
                for (int var35 = var20; var35 < var15; var35++) {
                    for (int var36 = var22; var36 < var18; var36++) {
                        if (var17 >= 0 && arg2.length > var17) {
                            if (var36 >= var35 << 1) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        } else {
                            var17++;
                        }
                    }
                    var17 += var16;
                }
            } else if (arg3 == 2) {
                for (int var37 = var20; var37 < var15; var37++) {
                    for (int var38 = var23 - 1; var38 >= var19; var38--) {
                        if (var38 <= var37 >> 1) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 3) {
                for (int var39 = var24 - 1; var39 >= var21; var39--) {
                    for (int var40 = var23 - 1; var40 >= var19; var40--) {
                        if (var39 << 1 <= var40) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg6 == 3) {
            if (arg3 == 0) {
                for (int var41 = var24 - 1; var41 >= var21; var41--) {
                    for (int var42 = var23 - 1; var42 >= var19; var42--) {
                        if (var41 >> 1 >= var42) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 1) {
                for (int var43 = var24 - 1; var43 >= var21; var43--) {
                    for (int var44 = var22; var44 < var18; var44++) {
                        if (var44 >= (var43 << 1)) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 2) {
                for (int var45 = var20; var45 < var15; var45++) {
                    for (int var46 = var22; var46 < var18; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 3) {
                for (int var47 = var20; var47 < var15; var47++) {
                    for (int var48 = var23 - 1; var48 >= var19; var48--) {
                        if (var47 << 1 <= var48) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg6 == 4) {
            if (arg3 == 0) {
                for (int var49 = var24 - 1; var49 >= var21; var49--) {
                    for (int var50 = var22; var50 < var18; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 1) {
                for (int var51 = var20; var51 < var15; var51++) {
                    for (int var52 = var22; var52 < var18; var52++) {
                        if (var52 <= (var51 << 1)) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 2) {
                for (int var53 = var20; var53 < var15; var53++) {
                    for (int var54 = var23 - 1; var54 >= var19; var54--) {
                        if ((var53 >> 1) <= var54) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            } else if (arg3 == 3) {
                for (int var55 = var24 - 1; var55 >= var21; var55--) {
                    for (int var56 = var23 - 1; var56 >= var19; var56--) {
                        if (var55 << 1 >= var56) {
                            arg2[var17] = arg4;
                        } else if (arg10) {
                            arg2[var17] = arg9;
                        }
                        var17++;
                    }
                    var17 += var16;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg3 == 0) {
                    for (int var65 = var20; var65 < var15; var65++) {
                        for (int var66 = var22; var66 < var18; var66++) {
                            if (arg8 / 2 >= var66) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var67 = var20; var67 < var15; var67++) {
                        for (int var68 = var22; var68 < var18; var68++) {
                            if (var67 <= (arg1 / 2)) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var69 = var20; var69 < var15; var69++) {
                        for (int var70 = var22; var70 < var18; var70++) {
                            if (arg8 / 2 <= var70) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var71 = var20; var71 < var15; var71++) {
                        for (int var72 = var22; var72 < var18; var72++) {
                            if (var71 >= arg1 / 2) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg3 == 0) {
                    for (int var73 = var20; var73 < var15; var73++) {
                        for (int var74 = var22; var74 < var18; var74++) {
                            if ((var73 - (arg1 / 2)) >= var74) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var75 = var24 - 1; var75 >= var21; var75--) {
                        for (int var76 = var22; var76 < var18; var76++) {
                            if (var75 - arg1 / 2 >= var76) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var77 = var24 - 1; var77 >= var21; var77--) {
                        for (int var78 = var23 - 1; var78 >= var19; var78--) {
                            if (var78 <= (var77 - (arg1 / 2))) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var79 = var20; var79 < var15; var79++) {
                        for (int var80 = var23 - 1; var80 >= var19; var80--) {
                            if (var79 - (arg1 / 2) >= var80) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg3 == 0) {
                    for (int var81 = var20; var81 < var15; var81++) {
                        for (int var82 = var22; var82 < var18; var82++) {
                            if (var81 - (arg1 / 2) <= var82) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var83 = var24 - 1; var83 >= var21; var83--) {
                        for (int var84 = var22; var84 < var18; var84++) {
                            if (var84 >= (var83 - (arg1 / 2))) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var85 = var24 - 1; var85 >= var21; var85--) {
                        for (int var86 = var23 - 1; var86 >= var19; var86--) {
                            if (var86 >= var85 - arg1 / 2) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var87 = var20; var87 < var15; var87++) {
                        for (int var88 = var23 - 1; var88 >= var19; var88--) {
                            if ((var87 - arg1 / 2) <= var88) {
                                arg2[var17] = arg4;
                            } else if (arg10) {
                                arg2[var17] = arg9;
                            }
                            var17++;
                        }
                        var17 += var16;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var57 = var24 - 1; var57 >= var21; var57--) {
                for (int var58 = var23 - 1; var58 >= var19; var58--) {
                    if (var58 >= var57 >> 1) {
                        arg2[var17] = arg4;
                    } else if (arg10) {
                        arg2[var17] = arg9;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg3 == 1) {
            for (int var59 = var24 - 1; var59 >= var21; var59--) {
                for (int var60 = var22; var60 < var18; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg2[var17] = arg4;
                    } else if (arg10) {
                        arg2[var17] = arg9;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg3 == 2) {
            for (int var61 = var20; var61 < var15; var61++) {
                for (int var62 = var22; var62 < var18; var62++) {
                    if (var62 >= (var61 >> 1)) {
                        arg2[var17] = arg4;
                    } else if (arg10) {
                        arg2[var17] = arg9;
                    }
                    var17++;
                }
                var17 += var16;
            }
        } else if (arg3 == 3) {
            for (int var63 = var20; var63 < var15; var63++) {
                for (int var64 = var23 - 1; var64 >= var19; var64--) {
                    if (var64 <= (var63 << 1)) {
                        arg2[var17] = arg4;
                    } else if (arg10) {
                        arg2[var17] = arg9;
                    }
                    var17++;
                }
                var17 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([I)V")
    public class277(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4435 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4435[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4435[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field4435[var5 + var5] = arg0[var4];
            this.field4435[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1814(byte arg0) {
        field4436 = null;
        if (arg0 != -72) {
            field4436 = null;
        }
    }
}
