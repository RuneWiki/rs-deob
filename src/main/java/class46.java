import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class46 extends class42 {

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Lbb;")
    public class90 field764 = new class90();

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "Lkc;")
    public class274 field775 = new class274();

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Lwf;")
    private class1 field768;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "[Loc;")
    public static class61[] field756 = new class61[32768];

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "[I")
    public static int[] field758 = new int[25];

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "[I")
    public static int[] field767 = new int[32768];

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "Lp;")
    public static class280 field761 = class18.method140((byte) -123, "name_icons");

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "Lp;")
    private static class280 field772 = class18.method140((byte) -123, "glow1:");

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "Lp;")
    public static class280 field754 = field772;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Lp;")
    public static class280 field770 = field772;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "J")
    public static long field759;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "Lde;")
    public static class108 field755;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "Ltg;")
    public static class180 field763;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method345(byte arg0) {
        if (arg0 != -128) {
            field759 = -116L;
        }
        field754 = null;
        field756 = null;
        field758 = null;
        field767 = null;
        field761 = null;
        field770 = null;
        field763 = null;
        field772 = null;
        field755 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()Lji;")
    public final class42 method37() {
        class64 var1 = (class64) this.field764.method651(12916);
        field752++;
        if (var1 == null) {
            return null;
        } else if (var1.field1047 == null) {
            return this.method3();
        } else {
            return var1.field1047;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([IIIIIZIIBII)V")
    public static final void method346(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field753++;
        int var11 = arg10;
        if (class151.field2613 <= arg10) {
            return;
        }
        if (class151.field2611 > arg10) {
            var11 = class151.field2611;
        }
        int var12 = arg3 + arg10;
        if (class151.field2611 >= var12) {
            return;
        }
        if (var12 > class151.field2613) {
            var12 = class151.field2613;
        }
        int var13 = arg1;
        if (class151.field2614 <= arg1) {
            return;
        }
        if (class151.field2612 > arg1) {
            var13 = class151.field2612;
        }
        int var14 = arg1 + arg2;
        if (var14 <= class151.field2612) {
            return;
        }
        int var15 = class151.field2615 * var13 + var11;
        if (var14 > class151.field2614) {
            var14 = class151.field2614;
        }
        if (arg4 == 9) {
            arg4 = 1;
            arg7 = arg7 + 1 & 0x3;
        }
        int var16 = class151.field2615 + var11 - var12;
        int var17 = var11 - arg10;
        int var18 = var12 - arg10;
        int var19 = var14 - arg1;
        int var20 = arg2 - var19;
        int var21 = arg3 - var18;
        if (arg4 == 10) {
            arg7 = arg7 + 3 & 0x3;
            arg4 = 1;
        }
        int var22 = arg3 - var17;
        int var23 = var13 - arg1;
        int var24 = arg2 - var23;
        if (arg4 == 11) {
            arg4 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        if (arg4 == 1) {
            if (arg7 == 0) {
                for (int var25 = var23; var25 < var19; var25++) {
                    for (int var26 = var17; var26 < var18; var26++) {
                        if (var25 >= var26) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 1) {
                for (int var27 = var24 - 1; var27 >= var20; var27--) {
                    for (int var28 = var17; var28 < var18; var28++) {
                        if (var28 <= var27) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 2) {
                for (int var29 = var23; var29 < var19; var29++) {
                    for (int var30 = var17; var30 < var18; var30++) {
                        if (var30 >= var29) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 3) {
                for (int var31 = var24 - 1; var31 >= var20; var31--) {
                    for (int var32 = var17; var32 < var18; var32++) {
                        if (var32 >= var31) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg4 == 2) {
            if (arg7 == 0) {
                for (int var33 = var24 - 1; var33 >= var20; var33--) {
                    for (int var34 = var17; var34 < var18; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 1) {
                for (int var35 = var23; var35 < var19; var35++) {
                    for (int var36 = var17; var36 < var18; var36++) {
                        if (var15 >= 0 && var15 < arg0.length) {
                            if (var36 >= var35 << 1) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var16;
                }
            } else if (arg7 == 2) {
                for (int var37 = var23; var37 < var19; var37++) {
                    for (int var38 = var22 - 1; var38 >= var21; var38--) {
                        if (var38 <= var37 >> 1) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 3) {
                for (int var39 = var24 - 1; var39 >= var20; var39--) {
                    for (int var40 = var22 - 1; var40 >= var21; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg4 == 3) {
            if (arg7 == 0) {
                for (int var41 = var24 - 1; var41 >= var20; var41--) {
                    for (int var42 = var22 - 1; var42 >= var21; var42--) {
                        if ((var41 >> 1) >= var42) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 1) {
                for (int var43 = var24 - 1; var43 >= var20; var43--) {
                    for (int var44 = var17; var44 < var18; var44++) {
                        if (var44 >= var43 << 1) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 2) {
                for (int var45 = var23; var45 < var19; var45++) {
                    for (int var46 = var17; var46 < var18; var46++) {
                        if (var46 <= (var45 >> 1)) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 3) {
                for (int var47 = var23; var47 < var19; var47++) {
                    for (int var48 = var22 - 1; var48 >= var21; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg4 == 4) {
            if (arg7 == 0) {
                for (int var49 = var24 - 1; var49 >= var20; var49--) {
                    for (int var50 = var17; var50 < var18; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 1) {
                for (int var51 = var23; var51 < var19; var51++) {
                    for (int var52 = var17; var52 < var18; var52++) {
                        if (var52 <= var51 << 1) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 2) {
                for (int var53 = var23; var53 < var19; var53++) {
                    for (int var54 = var22 - 1; var54 >= var21; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            } else if (arg7 == 3) {
                for (int var55 = var24 - 1; var55 >= var20; var55--) {
                    for (int var56 = var22 - 1; var56 >= var21; var56--) {
                        if (var56 <= var55 << 1) {
                            arg0[var15] = arg9;
                        } else if (arg5) {
                            arg0[var15] = arg6;
                        }
                        var15++;
                    }
                    var15 += var16;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg7 == 0) {
                    for (int var65 = var23; var65 < var19; var65++) {
                        for (int var66 = var17; var66 < var18; var66++) {
                            if (var66 <= (arg3 / 2)) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var67 = var23; var67 < var19; var67++) {
                        for (int var68 = var17; var68 < var18; var68++) {
                            if (var67 <= (arg2 / 2)) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var69 = var23; var69 < var19; var69++) {
                        for (int var70 = var17; var70 < var18; var70++) {
                            if (var70 >= arg3 / 2) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var71 = var23; var71 < var19; var71++) {
                        for (int var72 = var17; var72 < var18; var72++) {
                            if (arg2 / 2 <= var71) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg7 == 0) {
                    for (int var73 = var23; var73 < var19; var73++) {
                        for (int var74 = var17; var74 < var18; var74++) {
                            if (var74 <= (var73 - arg2 / 2)) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var75 = var24 - 1; var75 >= var20; var75--) {
                        for (int var76 = var17; var76 < var18; var76++) {
                            if (var76 <= (var75 - (arg2 / 2))) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var77 = var24 - 1; var77 >= var20; var77--) {
                        for (int var78 = var22 - 1; var78 >= var21; var78--) {
                            if (var78 <= (var77 - (arg2 / 2))) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var79 = var23; var79 < var19; var79++) {
                        for (int var80 = var22 - 1; var80 >= var21; var80--) {
                            if (var79 - arg2 / 2 >= var80) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
            if (arg8 > 108 && arg4 == 8) {
                if (arg7 == 0) {
                    for (int var81 = var23; var81 < var19; var81++) {
                        for (int var82 = var17; var82 < var18; var82++) {
                            if ((var81 - (arg2 / 2)) <= var82) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var83 = var24 - 1; var83 >= var20; var83--) {
                        for (int var84 = var17; var84 < var18; var84++) {
                            if ((var83 - (arg2 / 2)) <= var84) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var85 = var24 - 1; var85 >= var20; var85--) {
                        for (int var86 = var22 - 1; var86 >= var21; var86--) {
                            if (var85 - arg2 / 2 <= var86) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var87 = var23; var87 < var19; var87++) {
                        for (int var88 = var22 - 1; var88 >= var21; var88--) {
                            if (var87 - (arg2 / 2) <= var88) {
                                arg0[var15] = arg9;
                            } else if (arg5) {
                                arg0[var15] = arg6;
                            }
                            var15++;
                        }
                        var15 += var16;
                    }
                    return;
                }
            }
        } else if (arg7 == 0) {
            for (int var57 = var24 - 1; var57 >= var20; var57--) {
                for (int var58 = var22 - 1; var58 >= var21; var58--) {
                    if (var57 >> 1 <= var58) {
                        arg0[var15] = arg9;
                    } else if (arg5) {
                        arg0[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg7 == 1) {
            for (int var59 = var24 - 1; var59 >= var20; var59--) {
                for (int var60 = var17; var60 < var18; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg0[var15] = arg9;
                    } else if (arg5) {
                        arg0[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg7 == 2) {
            for (int var61 = var23; var61 < var19; var61++) {
                for (int var62 = var17; var62 < var18; var62++) {
                    if ((var61 >> 1) <= var62) {
                        arg0[var15] = arg9;
                    } else if (arg5) {
                        arg0[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var16;
            }
        } else if (arg7 == 3) {
            for (int var63 = var23; var63 < var19; var63++) {
                for (int var64 = var22 - 1; var64 >= var21; var64--) {
                    if (var63 << 1 >= var64) {
                        arg0[var15] = arg9;
                    } else if (arg5) {
                        arg0[var15] = arg6;
                    }
                    var15++;
                }
                var15 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public final void method21(int arg0) {
        field762++;
        this.field775.method21(arg0);
        for (class64 var2 = (class64) this.field764.method651(12916); var2 != null; var2 = (class64) this.field764.method643(11066)) {
            if (!this.field768.method26(var2, (byte) 66)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1068) {
                        this.method347(var2, var3, (byte) 90);
                        var2.field1068 -= var3;
                        break;
                    }
                    this.method347(var2, var2.field1068, (byte) 69);
                    var3 -= var2.field1068;
                } while (!this.field768.method19(var3, 0, 100, (int[]) null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()I")
    public final int method27() {
        field757++;
        return 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljf;IB)V")
    private final void method347(class64 arg0, int arg1, byte arg2) {
        if ((this.field768.field43[arg0.field1069] & 0x4) != 0 && arg0.field1075 < 0) {
            int var4 = this.field768.field33[arg0.field1069] / class204.field3549;
            int var5 = (var4 + 1048575 - arg0.field1064) / var4;
            arg0.field1064 = arg1 * var4 + arg0.field1064 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field768.field56[arg0.field1069] == 0) {
                    arg0.field1047 = class70.method472(arg0.field1063, arg0.field1047.method507(), arg0.field1047.method497(), arg0.field1047.method496());
                } else {
                    arg0.field1047 = class70.method472(arg0.field1063, arg0.field1047.method507(), 0, arg0.field1047.method496());
                    this.field768.method33(false, arg0.field1079.field4572[arg0.field1056] < 0, arg0);
                }
                if (arg0.field1079.field4572[arg0.field1056] < 0) {
                    arg0.field1047.method493(-1);
                }
                arg1 = arg0.field1064 / var4;
            }
        }
        arg0.field1047.method21(arg1);
        field774++;
        if (arg2 <= 8) {
            this.method349(-81, (class64) null, -90, 38, 58, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public static final void method348(int arg0, int arg1, int arg2) {
        field766++;
        class248 var3 = class59.method422((byte) 122, arg2);
        if (arg0 != -20703) {
            method345((byte) -43);
        }
        int var4 = var3.field4338;
        int var5 = var3.field4341;
        int var6 = class150.field2607[var5 - var4];
        int var7 = var3.field4342;
        if (arg1 < 0 || var6 < arg1) {
            arg1 = 0;
        }
        int var8 = var6 << var4;
        class154.method1089(-10, ~var8 & class183.field3225[var7] | arg1 << var4 & var8, var7);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjf;III[I)V")
    private final void method349(int arg0, class64 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field773++;
        if (arg4 != 1) {
            return;
        }
        if ((this.field768.field43[arg1.field1069] & 0x4) != 0 && arg1.field1075 < 0) {
            int var7 = this.field768.field33[arg1.field1069] / class204.field3549;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field1064) / var7;
                if (var8 > arg0) {
                    arg1.field1064 += arg0 * var7;
                    break;
                }
                arg1.field1047.method20(arg5, arg3, var8);
                arg3 += var8;
                arg0 -= var8;
                int var9 = 262144 / var7;
                int var10 = class204.field3549 / 100;
                arg1.field1064 += var7 * var8 - 1048576;
                class70 var11 = arg1.field1047;
                if (var9 < var10) {
                    var10 = var9;
                }
                if (this.field768.field56[arg1.field1069] == 0) {
                    arg1.field1047 = class70.method472(arg1.field1063, var11.method507(), var11.method497(), var11.method496());
                } else {
                    arg1.field1047 = class70.method472(arg1.field1063, var11.method507(), 0, var11.method496());
                    this.field768.method33(false, arg1.field1079.field4572[arg1.field1056] < 0, arg1);
                    arg1.field1047.method504(var10, var11.method497());
                }
                if (arg1.field1079.field4572[arg1.field1056] < 0) {
                    arg1.field1047.method493(-1);
                }
                var11.method508(var10);
                var11.method20(arg5, arg3, arg2 - arg3);
                if (var11.method503()) {
                    this.field775.method1821(var11);
                }
            }
        }
        arg1.field1047.method20(arg5, arg3, arg0);
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()Lji;")
    public final class42 method3() {
        field765++;
        class64 var1;
        do {
            var1 = (class64) this.field764.method643(11066);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1047 == null);
        return var1.field1047;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "([III)V")
    public final void method20(int[] arg0, int arg1, int arg2) {
        this.field775.method20(arg0, arg1, arg2);
        field760++;
        for (class64 var4 = (class64) this.field764.method651(12916); var4 != null; var4 = (class64) this.field764.method643(11066)) {
            if (!this.field768.method26(var4, (byte) 116)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1068) {
                        this.method349(var5, var4, var5 + var6, var6, 1, arg0);
                        var4.field1068 -= var5;
                        break;
                    }
                    this.method349(var4.field1068, var4, var5 + var6, var6, 1, arg0);
                    var5 -= var4.field1068;
                    var6 += var4.field1068;
                } while (!this.field768.method19(var5, var6, 100, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lwf;)V")
    public class46(class1 arg0) {
        this.field768 = arg0;
    }
}
