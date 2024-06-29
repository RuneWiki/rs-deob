import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class229 extends class297 {

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    private int field3524 = 4096;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "Z")
    public static boolean field3528 = false;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Z")
    public static boolean field3531 = true;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "[I")
    public static int[] field3525 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "F")
    public static float field3530;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "Lpk;")
    public static class120 field3520;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)[I", line = 9)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            return (int[]) null;
        }
        field3532++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0 - 1 & class175.field2801, (byte) 40, 0);
            int[] var5 = this.method2109(arg0, (byte) 44, 0);
            int[] var6 = this.method2109(arg0 + 1 & class175.field2801, (byte) 62, 0);
            for (int var7 = 0; var7 < class31.field491; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3524;
                int var9 = (var5[class257.field3813 & var7 + 1] - var5[var7 - 1 & class257.field3813]) * this.field3524;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 73)
    public class229() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIII)Luf;", line = 80)
    public static final class24 method1664(boolean arg0, int arg1, int arg2, int arg3) {
        field3529++;
        class24 var4 = new class24();
        var4.field413 = arg3;
        var4.field417 = arg2;
        class158.field2584.method75(var4, -1, (long) arg1);
        class2.method67(arg2, (byte) -112);
        class266 var5 = class171.method1276(arg1, (byte) -128);
        if (var5 != null) {
            class280.method1971((byte) 101, var5);
        }
        if (class49.field757 != null) {
            class280.method1971((byte) 101, class49.field757);
            class49.field757 = null;
        }
        int var6 = class137.field2225;
        int var7 = 0;
        if (arg0) {
            field3521 = 123;
        }
        while (var6 > var7) {
            if (class331.method2327(class120.field1960[var7], (byte) 37)) {
                class49.method412(var7, 2);
            }
            var7++;
        }
        if (class137.field2225 == 1) {
            class260.field3858 = false;
            class318.method2250(class99.field1591, -120, class326.field5096, class37.field554, class315.field4968);
        } else {
            class318.method2250(class99.field1591, -124, class326.field5096, class37.field554, class315.field4968);
            int var8 = class146.field2392.method1468(class307.field4872);
            for (int var9 = 0; var9 < class137.field2225; var9++) {
                int var10 = class146.field2392.method1468(class71.method574(79, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class99.field1591 = var8 + 8;
            class326.field5096 = class137.field2225 * 15 + (class183.field2908 ? 26 : 22);
        }
        if (var5 != null) {
            class76.method602(false, 0, var5);
        }
        class268.method1860((byte) -8, arg2);
        if (class168.field2707 != -1) {
            class79.method618(1, class168.field2707, 26822);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILaj;)V", line = 157)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field3527++;
        if (arg1 != 255) {
            field3531 = true;
        }
        if (arg0 == 0) {
            this.field3524 = arg2.method56(19612);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[IIIIIIIZI)V", line = 178)
    public static final void method1665(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field3522++;
        int var11 = arg6;
        if (class33.field508 <= arg6) {
            return;
        }
        int var12 = arg4 + arg6;
        if (class33.field505 > arg6) {
            var11 = class33.field505;
        }
        if (var12 <= class33.field505) {
            return;
        }
        if (class33.field508 < var12) {
            var12 = class33.field508;
        }
        int var13 = arg8;
        if (class33.field504 <= arg8) {
            return;
        }
        if (arg8 < class33.field507) {
            var13 = class33.field507;
        }
        if (arg3 != 3) {
            method1664(true, -53, 108, 81);
        }
        int var14 = arg8 + arg10;
        if (var14 <= class33.field507) {
            return;
        }
        if (var14 > class33.field504) {
            var14 = class33.field504;
        }
        if (arg0 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg0 = 1;
        }
        int var15 = var11 + class33.field506 - var12;
        int var16 = var14 - arg8;
        int var17 = var12 - arg6;
        int var18 = class33.field506 * var13 + var11;
        int var19 = var11 - arg6;
        if (arg0 == 10) {
            arg0 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg0 == 11) {
            arg0 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        int var20 = arg4 - var19;
        int var21 = arg4 - var17;
        int var22 = var13 - arg8;
        int var23 = arg10 - var16;
        int var24 = arg10 - var22;
        if (arg0 == 1) {
            if (arg1 == 0) {
                for (int var25 = var22; var25 < var16; var25++) {
                    for (int var26 = var19; var26 < var17; var26++) {
                        if (var25 >= var26) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var19; var28 < var17; var28++) {
                        if (var28 <= var27) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 2) {
                for (int var29 = var22; var29 < var16; var29++) {
                    for (int var30 = var19; var30 < var17; var30++) {
                        if (var30 >= var29) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var19; var32 < var17; var32++) {
                        if (var31 <= var32) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg0 == 2) {
            if (arg1 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var19; var34 < var17; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 1) {
                for (int var39 = var22; var39 < var16; var39++) {
                    for (int var40 = var19; var40 < var17; var40++) {
                        if (var18 >= 0 && var18 < arg2.length) {
                            if (var40 >= var39 << 1) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        } else {
                            var18++;
                        }
                    }
                    var18 += var15;
                }
            } else if (arg1 == 2) {
                for (int var35 = var22; var35 < var16; var35++) {
                    for (int var36 = var20 - 1; var36 >= var21; var36--) {
                        if ((var35 >> 1) >= var36) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 3) {
                for (int var37 = var24 - 1; var37 >= var23; var37--) {
                    for (int var38 = var20 - 1; var38 >= var21; var38--) {
                        if (var37 << 1 <= var38) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg0 == 3) {
            if (arg1 == 0) {
                for (int var81 = var24 - 1; var81 >= var23; var81--) {
                    for (int var82 = var20 - 1; var82 >= var21; var82--) {
                        if (var82 <= (var81 >> 1)) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 1) {
                for (int var83 = var24 - 1; var83 >= var23; var83--) {
                    for (int var84 = var19; var84 < var17; var84++) {
                        if (var83 << 1 <= var84) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 2) {
                for (int var87 = var22; var87 < var16; var87++) {
                    for (int var88 = var19; var88 < var17; var88++) {
                        if (var87 >> 1 >= var88) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 3) {
                for (int var85 = var22; var85 < var16; var85++) {
                    for (int var86 = var20 - 1; var86 >= var21; var86--) {
                        if (var85 << 1 <= var86) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg0 == 4) {
            if (arg1 == 0) {
                for (int var47 = var24 - 1; var47 >= var23; var47--) {
                    for (int var48 = var19; var48 < var17; var48++) {
                        if (var48 >= (var47 >> 1)) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 1) {
                for (int var45 = var22; var45 < var16; var45++) {
                    for (int var46 = var19; var46 < var17; var46++) {
                        if ((var45 << 1) >= var46) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 2) {
                for (int var41 = var22; var41 < var16; var41++) {
                    for (int var42 = var20 - 1; var42 >= var21; var42--) {
                        if ((var41 >> 1) <= var42) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 3) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var20 - 1; var44 >= var21; var44--) {
                        if (var43 << 1 >= var44) {
                            arg2[var18] = arg7;
                        } else if (arg9) {
                            arg2[var18] = arg5;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg1 == 0) {
                    for (int var57 = var22; var57 < var16; var57++) {
                        for (int var58 = var19; var58 < var17; var58++) {
                            if (arg4 / 2 >= var58) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var59 = var22; var59 < var16; var59++) {
                        for (int var60 = var19; var60 < var17; var60++) {
                            if ((arg10 / 2) >= var59) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var79 = var22; var79 < var16; var79++) {
                        for (int var80 = var19; var80 < var17; var80++) {
                            if (var80 >= arg4 / 2) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var77 = var22; var77 < var16; var77++) {
                        for (int var78 = var19; var78 < var17; var78++) {
                            if ((arg10 / 2) <= var77) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg1 == 0) {
                    for (int var61 = var22; var61 < var16; var61++) {
                        for (int var62 = var19; var62 < var17; var62++) {
                            if (var61 - (arg10 / 2) >= var62) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var63 = var24 - 1; var63 >= var23; var63--) {
                        for (int var64 = var19; var64 < var17; var64++) {
                            if (var64 <= (var63 - (arg10 / 2))) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var20 - 1; var76 >= var21; var76--) {
                            if (var76 <= var75 - (arg10 / 2)) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var73 = var22; var73 < var16; var73++) {
                        for (int var74 = var20 - 1; var74 >= var21; var74--) {
                            if (var73 - arg10 / 2 >= var74) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg1 == 0) {
                    for (int var71 = var22; var71 < var16; var71++) {
                        for (int var72 = var19; var72 < var17; var72++) {
                            if (var72 >= var71 - (arg10 / 2)) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var69 = var24 - 1; var69 >= var23; var69--) {
                        for (int var70 = var19; var70 < var17; var70++) {
                            if ((var69 - (arg10 / 2)) <= var70) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var65 = var24 - 1; var65 >= var23; var65--) {
                        for (int var66 = var20 - 1; var66 >= var21; var66--) {
                            if (var66 >= (var65 - arg10 / 2)) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var67 = var22; var67 < var16; var67++) {
                        for (int var68 = var20 - 1; var68 >= var21; var68--) {
                            if (var68 >= var67 - (arg10 / 2)) {
                                arg2[var18] = arg7;
                            } else if (arg9) {
                                arg2[var18] = arg5;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var49 = var24 - 1; var49 >= var23; var49--) {
                for (int var50 = var20 - 1; var50 >= var21; var50--) {
                    if (var50 >= (var49 >> 1)) {
                        arg2[var18] = arg7;
                    } else if (arg9) {
                        arg2[var18] = arg5;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg1 == 1) {
            for (int var55 = var24 - 1; var55 >= var23; var55--) {
                for (int var56 = var19; var56 < var17; var56++) {
                    if ((var55 << 1) >= var56) {
                        arg2[var18] = arg7;
                    } else if (arg9) {
                        arg2[var18] = arg5;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg1 == 2) {
            for (int var53 = var22; var53 < var16; var53++) {
                for (int var54 = var19; var54 < var17; var54++) {
                    if (var54 >= var53 >> 1) {
                        arg2[var18] = arg7;
                    } else if (arg9) {
                        arg2[var18] = arg5;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg1 == 3) {
            for (int var51 = var22; var51 < var16; var51++) {
                for (int var52 = var20 - 1; var52 >= var21; var52--) {
                    if ((var51 << 1) >= var52) {
                        arg2[var18] = arg7;
                    } else if (arg9) {
                        arg2[var18] = arg5;
                    }
                    var18++;
                }
                var18 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V", line = 1367)
    public static void method1666(int arg0) {
        field3520 = null;
        if (arg0 != -1) {
            method1664(true, 80, 0, 89);
        }
        field3525 = null;
    }
}
