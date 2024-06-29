import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class131 extends class12 {

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "Lvf;")
    public static class265 field2390 = class87.method582(-46, "Votre liste noire est pleine (X100 noms maximum(Y)3");

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "Lvf;")
    private static class265 field2393 = class87.method582(-46, "Checking for updates )2 ");

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Lvf;")
    public static class265 field2386 = field2393;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Lqe;")
    public class158 field2389;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "Lii;")
    public class180 field2377;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "Lfi;")
    public class222 field2387;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Lic;")
    public class98 field2378;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BII)I")
    public static final int method869(byte arg0, int arg1, int arg2) {
        field2399++;
        if (arg0 < 24) {
            field2376 = -8;
        }
        class256 var3 = (class256) class4.field52.method1842(-1, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field4382.length > arg1) {
            return var3.field4382[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)I")
    public static final int method870(byte arg0) {
        field2391++;
        if (arg0 < 72) {
            method875(true);
        }
        return class116.field2049;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V")
    public static final void method871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class203.method1394(class44.field973[arg0], arg5, arg1, -7249, arg4);
        field2383++;
        int var9 = arg3 - 1;
        class203.method1394(class44.field973[arg3], arg5, arg1, -7249, arg4);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class44.field973[var6];
            var7[arg5] = var7[arg1] = arg4;
        }
        if (arg2 != 3698) {
            field2393 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public final void method872(boolean arg0) {
        this.field2387 = null;
        this.field2377 = null;
        this.field2378 = null;
        field2382++;
        if (arg0) {
            this.field2371 = 68;
        }
        this.field2389 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIZIII[I)V")
    public static final void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int[] arg10) {
        field2395++;
        int var11 = arg2;
        if (class35.field828 <= arg2) {
            return;
        }
        int var12 = arg2 + arg3;
        if (arg2 < class35.field826) {
            var11 = class35.field826;
        }
        if (class35.field826 >= var12) {
            return;
        }
        int var13 = arg1;
        if (var12 > class35.field828) {
            var12 = class35.field828;
        }
        if (arg1 >= class35.field827) {
            return;
        }
        if (arg1 < class35.field825) {
            var13 = class35.field825;
        }
        int var14 = arg1 + arg4;
        if (class35.field825 >= var14) {
            return;
        }
        if (var14 > class35.field827) {
            var14 = class35.field827;
        }
        int var15 = var14 - arg1;
        if (arg7 == 9) {
            arg7 = 1;
            arg9 = arg9 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg7 = 8;
        }
        int var16 = class35.field824 * var13 + var11;
        int var17 = var13 - arg1;
        int var18 = arg4 - var15;
        int var19 = class35.field824 + var11 - var12;
        int var20 = var11 - arg2;
        int var21 = arg4 - var17;
        int var22 = arg3 - var20;
        int var23 = var12 - arg2;
        int var24 = arg3 - var23;
        if (arg7 == 1) {
            if (arg9 == 0) {
                for (int var25 = var17; var25 < var15; var25++) {
                    for (int var26 = var20; var26 < var23; var26++) {
                        if (var25 >= var26) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 1) {
                for (int var27 = var21 - 1; var27 >= var18; var27--) {
                    for (int var28 = var20; var28 < var23; var28++) {
                        if (var27 >= var28) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var20; var30 < var23; var30++) {
                        if (var29 <= var30) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 3) {
                for (int var31 = var21 - 1; var31 >= var18; var31--) {
                    for (int var32 = var20; var32 < var23; var32++) {
                        if (var31 <= var32) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg7 == 2) {
            if (arg9 == 0) {
                for (int var33 = var21 - 1; var33 >= var18; var33--) {
                    for (int var34 = var20; var34 < var23; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var20; var36 < var23; var36++) {
                        if (var16 >= 0 && arg10.length > var16) {
                            if ((var35 << 1) <= var36) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var19;
                }
            } else if (arg9 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var24; var38--) {
                        if (var37 >> 1 >= var38) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 3) {
                for (int var39 = var21 - 1; var39 >= var18; var39--) {
                    for (int var40 = var22 - 1; var40 >= var24; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg7 == 3) {
            if (arg9 == 0) {
                for (int var41 = var21 - 1; var41 >= var18; var41--) {
                    for (int var42 = var22 - 1; var42 >= var24; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 1) {
                for (int var43 = var21 - 1; var43 >= var18; var43--) {
                    for (int var44 = var20; var44 < var23; var44++) {
                        if (var44 >= (var43 << 1)) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 2) {
                for (int var45 = var17; var45 < var15; var45++) {
                    for (int var46 = var20; var46 < var23; var46++) {
                        if (var46 <= var45 >> 1) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 3) {
                for (int var47 = var17; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var24; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg7 == 4) {
            if (arg9 == 0) {
                for (int var49 = var21 - 1; var49 >= var18; var49--) {
                    for (int var50 = var20; var50 < var23; var50++) {
                        if ((var49 >> 1) <= var50) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 1) {
                for (int var51 = var17; var51 < var15; var51++) {
                    for (int var52 = var20; var52 < var23; var52++) {
                        if (var52 <= (var51 << 1)) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 2) {
                for (int var53 = var17; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var24; var54--) {
                        if (var54 >= (var53 >> 1)) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg9 == 3) {
                for (int var55 = var21 - 1; var55 >= var18; var55--) {
                    for (int var56 = var22 - 1; var56 >= var24; var56--) {
                        if (var56 <= (var55 << 1)) {
                            arg10[var16] = arg0;
                        } else if (arg6) {
                            arg10[var16] = arg8;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg9 == 0) {
                    for (int var65 = var17; var65 < var15; var65++) {
                        for (int var66 = var20; var66 < var23; var66++) {
                            if (arg3 / 2 >= var66) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var17; var67 < var15; var67++) {
                        for (int var68 = var20; var68 < var23; var68++) {
                            if ((arg4 / 2) >= var67) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var69 = var17; var69 < var15; var69++) {
                        for (int var70 = var20; var70 < var23; var70++) {
                            if (var70 >= arg3 / 2) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var71 = var17; var71 < var15; var71++) {
                        for (int var72 = var20; var72 < var23; var72++) {
                            if ((arg4 / 2) <= var71) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg9 == 0) {
                    for (int var73 = var17; var73 < var15; var73++) {
                        for (int var74 = var20; var74 < var23; var74++) {
                            if (var74 <= var73 - arg4 / 2) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var75 = var21 - 1; var75 >= var18; var75--) {
                        for (int var76 = var20; var76 < var23; var76++) {
                            if ((var75 - (arg4 / 2)) >= var76) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var77 = var21 - 1; var77 >= var18; var77--) {
                        for (int var78 = var22 - 1; var78 >= var24; var78--) {
                            if ((var77 - (arg4 / 2)) >= var78) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var79 = var17; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var24; var80--) {
                            if (var80 <= var79 - (arg4 / 2)) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
            if (~arg7 == arg5) {
                if (arg9 == 0) {
                    for (int var81 = var17; var81 < var15; var81++) {
                        for (int var82 = var20; var82 < var23; var82++) {
                            if (var82 >= (var81 - arg4 / 2)) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var83 = var21 - 1; var83 >= var18; var83--) {
                        for (int var84 = var20; var84 < var23; var84++) {
                            if ((var83 - (arg4 / 2)) <= var84) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var85 = var21 - 1; var85 >= var18; var85--) {
                        for (int var86 = var22 - 1; var86 >= var24; var86--) {
                            if ((var85 - (arg4 / 2)) <= var86) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var87 = var17; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var24; var88--) {
                            if (var88 >= var87 - arg4 / 2) {
                                arg10[var16] = arg0;
                            } else if (arg6) {
                                arg10[var16] = arg8;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var57 = var21 - 1; var57 >= var18; var57--) {
                for (int var58 = var22 - 1; var58 >= var24; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg10[var16] = arg0;
                    } else if (arg6) {
                        arg10[var16] = arg8;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg9 == 1) {
            for (int var59 = var21 - 1; var59 >= var18; var59--) {
                for (int var60 = var20; var60 < var23; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg10[var16] = arg0;
                    } else if (arg6) {
                        arg10[var16] = arg8;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg9 == 2) {
            for (int var61 = var17; var61 < var15; var61++) {
                for (int var62 = var20; var62 < var23; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg10[var16] = arg0;
                    } else if (arg6) {
                        arg10[var16] = arg8;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg9 == 3) {
            for (int var63 = var17; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var24; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg10[var16] = arg0;
                    } else if (arg6) {
                        arg10[var16] = arg8;
                    }
                    var16++;
                }
                var16 += var19;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)Z")
    public static final boolean method874(int arg0) {
        if (arg0 != -111502399) {
            method869((byte) -72, -120, 71);
        }
        field2379++;
        if (class153.field2848) {
            try {
                if ((Boolean) class97.field1713.method1782(class281.field4957.field4024, 0)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
    public static void method875(boolean arg0) {
        field2393 = null;
        field2386 = null;
        if (arg0) {
            method873(-115, -111, -73, 89, -8, 41, false, -98, 87, -39, (int[]) null);
        }
        field2390 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
    public static final void method876(int arg0, int arg1, int arg2) {
        field2370++;
        class117 var3 = class210.field3768[class216.field3902][arg2][arg0];
        if (var3 == null) {
            class160.method1067(class216.field3902, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class139 var5 = null;
        if (arg1 != 1) {
            method870((byte) 105);
        }
        for (class139 var6 = (class139) var3.method789((byte) -85); var6 != null; var6 = (class139) var3.method787((byte) -76)) {
            class261 var13 = class54.method418(var6.field2532.field939, 0);
            int var14 = var13.field4510;
            if (var13.field4565 == 1) {
                var14 = (var6.field2532.field936 + 1) * var14;
            }
            if (var14 > var4) {
                var5 = var6;
                var4 = var14;
            }
        }
        if (var5 == null) {
            class160.method1067(class216.field3902, arg2, arg0);
            return;
        }
        class42 var7 = null;
        class42 var8 = null;
        var3.method794(109, var5);
        for (class139 var9 = (class139) var3.method789((byte) -93); var9 != null; var9 = (class139) var3.method787((byte) -76)) {
            class42 var12 = var9.field2532;
            if (var5.field2532.field939 != var12.field939) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field939 != var12.field939 && var8 == null) {
                    var8 = var12;
                }
            }
        }
        long var10 = (long) ((arg0 << 7) + arg2 + 1610612736);
        class202.method1387(class216.field3902, arg2, arg0, class67.method483(arg0 * 128 + 64, -128, arg2 * 128 + 64, class216.field3902), var5.field2532, var10, var7, var8);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method877(int arg0, Component arg1) {
        field2385++;
        arg1.removeMouseListener(class232.field4089);
        arg1.removeMouseMotionListener(class232.field4089);
        arg1.removeFocusListener(class232.field4089);
        class89.field1598 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BB)V")
    public static final void method878(byte arg0, byte arg1) {
        if (class261.field4570 == null) {
            class261.field4570 = new byte[4][104][104];
        }
        field2396++;
        if (arg1 >= -31) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class261.field4570[var2][var3][var4] = arg0;
                }
            }
        }
    }
}
