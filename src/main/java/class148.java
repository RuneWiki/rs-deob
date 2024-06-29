import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class148 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Luj;")
    private static class132 field2432 = new class132(16);

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2440 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field2443 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Loe;")
    public static class65 field2439 = new class65();

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "F")
    public static float field2442;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "F")
    public static float field2444;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Laj;")
    public static class151 field2433;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lf;")
    public static class205 field2441;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Ljh;")
    public static class238 field2435;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[I")
    public static int[] field2458;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[[[B")
    public static byte[][][] field2445;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "[[[B")
    public static byte[][][] field2446;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[[[B")
    public static byte[][][] field2448;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[[[B")
    public static byte[][][] field2454;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[[[B")
    public static byte[][][] field2456;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[[[I")
    public static int[][][] field2447;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[[[I")
    public static int[][][] field2455;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)Lbb;")
    private static final class49 method1091(int arg0, int arg1, int arg2, int arg3) {
        class49 var4 = new class49();
        for (class206 var5 = (class206) field2439.method452(1576); var5 != null; var5 = (class206) field2439.method448(631244930)) {
            method1101(var5, arg0, arg1, arg2, arg3);
            var4.method311(112, var5);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field2435.field4005; var7++) {
            class206 var8 = field2435.field4008[var7];
            boolean var9 = field2441.method1432(var6, field2435.field4001[var7] & 0x3FFF, field2435.field4001[var7] >> 28 & 0x3, -97, field2435.field4001[var7] >> 14 & 0x3FFF);
            if (var9) {
                var8.field3324 = var6[1] - field2438;
                var8.field3313 = field2434 - (var6[2] - field2437) - 1;
                method1101(var8, arg0, arg1, arg2, arg3);
                var4.method311(115, var8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Lf;")
    public static final class205 method1092(int arg0) {
        return (class205) field2432.method987(-104, (long) arg0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Loe;")
    public static final class65 method1093(int arg0, int arg1) {
        class65 var2 = new class65();
        for (class205 var3 = (class205) field2432.method982(-9570); var3 != null; var3 = (class205) field2432.method981(-1)) {
            if (var3.field3284 && var3.method1430(0, arg0, arg1)) {
                var2.method449((byte) -64, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
    public static final void method1094() {
        for (int var0 = 0; var0 < field2435.field4005; var0++) {
            if (field2435.field4008[var0] != null) {
                field2439.method449((byte) -64, field2435.field4008[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
    public static final void method1095() {
        int var0 = field2451 - field2449;
        int var1 = field2453 - field2459;
        int var2 = (field2460 - field2450 << 16) / var0;
        int var3 = (field2457 - field2452 << 16) / var1;
        method1099(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()Lbb;")
    public static final class49 method1096() {
        int var0 = field2451 - field2449;
        int var1 = field2453 - field2459;
        int var2 = (field2460 - field2450 << 16) / var0;
        int var3 = (field2457 - field2452 << 16) / var1;
        return method1091(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([IIIIIIIIIZ)V")
    private static final void method1097(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class211.field3552) {
            return;
        }
        if (arg1 < class211.field3553) {
            var10 = class211.field3553;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class211.field3553) {
            return;
        }
        if (var11 > class211.field3552) {
            var11 = class211.field3552;
        }
        int var12 = arg2;
        if (arg2 >= class211.field3554) {
            return;
        }
        if (arg2 < class211.field3550) {
            var12 = class211.field3550;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class211.field3550) {
            return;
        }
        if (var13 > class211.field3554) {
            var13 = class211.field3554;
        }
        int var14 = class211.field3557 * var12 + var10;
        int var15 = class211.field3557 + var10 - var11;
        int var16 = var10 - arg1;
        int var17 = var11 - arg1;
        int var18 = var12 - arg2;
        int var19 = var13 - arg2;
        int var20 = arg5 - var17;
        int var21 = arg5 - var16;
        int var22 = arg6 - var19;
        int var23 = arg6 - var18;
        if (arg7 == 9) {
            arg7 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 1) {
            if (arg8 == 0) {
                for (int var24 = var18; var24 < var19; var24++) {
                    for (int var25 = var16; var25 < var17; var25++) {
                        if (var25 <= var24) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var26 = var23 - 1; var26 >= var22; var26--) {
                    for (int var27 = var16; var27 < var17; var27++) {
                        if (var27 <= var26) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var28 = var18; var28 < var19; var28++) {
                    for (int var29 = var16; var29 < var17; var29++) {
                        if (var29 >= var28) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var30 = var23 - 1; var30 >= var22; var30--) {
                    for (int var31 = var16; var31 < var17; var31++) {
                        if (var31 >= var30) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 2) {
            if (arg8 == 0) {
                for (int var32 = var23 - 1; var32 >= var22; var32--) {
                    for (int var33 = var16; var33 < var17; var33++) {
                        if (var33 <= var32 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var34 = var18; var34 < var19; var34++) {
                    for (int var35 = var16; var35 < var17; var35++) {
                        if (var14 >= 0 && var14 < arg0.length) {
                            if (var35 >= var34 << 1) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        } else {
                            var14++;
                        }
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var36 = var18; var36 < var19; var36++) {
                    for (int var37 = var21 - 1; var37 >= var20; var37--) {
                        if (var37 <= var36 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var38 = var23 - 1; var38 >= var22; var38--) {
                    for (int var39 = var21 - 1; var39 >= var20; var39--) {
                        if (var39 >= var38 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 3) {
            if (arg8 == 0) {
                for (int var40 = var23 - 1; var40 >= var22; var40--) {
                    for (int var41 = var21 - 1; var41 >= var20; var41--) {
                        if (var41 <= var40 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var42 = var23 - 1; var42 >= var22; var42--) {
                    for (int var43 = var16; var43 < var17; var43++) {
                        if (var43 >= var42 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var44 = var18; var44 < var19; var44++) {
                    for (int var45 = var16; var45 < var17; var45++) {
                        if (var45 <= var44 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var46 = var18; var46 < var19; var46++) {
                    for (int var47 = var21 - 1; var47 >= var20; var47--) {
                        if (var47 >= var46 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 4) {
            if (arg8 == 0) {
                for (int var48 = var23 - 1; var48 >= var22; var48--) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        if (var49 >= var48 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var50 = var18; var50 < var19; var50++) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        if (var51 <= var50 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var52 = var18; var52 < var19; var52++) {
                    for (int var53 = var21 - 1; var53 >= var20; var53--) {
                        if (var53 >= var52 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var54 = var23 - 1; var54 >= var22; var54--) {
                    for (int var55 = var21 - 1; var55 >= var20; var55--) {
                        if (var55 <= var54 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg8 == 0) {
                    for (int var64 = var18; var64 < var19; var64++) {
                        for (int var65 = var16; var65 < var17; var65++) {
                            if (var65 <= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var66 = var18; var66 < var19; var66++) {
                        for (int var67 = var16; var67 < var17; var67++) {
                            if (var66 <= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var68 = var18; var68 < var19; var68++) {
                        for (int var69 = var16; var69 < var17; var69++) {
                            if (var69 >= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var70 = var18; var70 < var19; var70++) {
                        for (int var71 = var16; var71 < var17; var71++) {
                            if (var70 >= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg8 == 0) {
                    for (int var72 = var18; var72 < var19; var72++) {
                        for (int var73 = var16; var73 < var17; var73++) {
                            if (var73 <= var72 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var74 = var23 - 1; var74 >= var22; var74--) {
                        for (int var75 = var16; var75 < var17; var75++) {
                            if (var75 <= var74 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var76 = var23 - 1; var76 >= var22; var76--) {
                        for (int var77 = var21 - 1; var77 >= var20; var77--) {
                            if (var77 <= var76 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var78 = var18; var78 < var19; var78++) {
                        for (int var79 = var21 - 1; var79 >= var20; var79--) {
                            if (var79 <= var78 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg8 == 0) {
                    for (int var80 = var18; var80 < var19; var80++) {
                        for (int var81 = var16; var81 < var17; var81++) {
                            if (var81 >= var80 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var82 = var23 - 1; var82 >= var22; var82--) {
                        for (int var83 = var16; var83 < var17; var83++) {
                            if (var83 >= var82 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var84 = var23 - 1; var84 >= var22; var84--) {
                        for (int var85 = var21 - 1; var85 >= var20; var85--) {
                            if (var85 >= var84 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var86 = var18; var86 < var19; var86++) {
                        for (int var87 = var21 - 1; var87 >= var20; var87--) {
                            if (var87 >= var86 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var56 = var23 - 1; var56 >= var22; var56--) {
                for (int var57 = var21 - 1; var57 >= var20; var57--) {
                    if (var57 >= var56 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 1) {
            for (int var58 = var23 - 1; var58 >= var22; var58--) {
                for (int var59 = var16; var59 < var17; var59++) {
                    if (var59 <= var58 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 2) {
            for (int var60 = var18; var60 < var19; var60++) {
                for (int var61 = var16; var61 < var17; var61++) {
                    if (var61 >= var60 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 3) {
            for (int var62 = var18; var62 < var19; var62++) {
                for (int var63 = var21 - 1; var63 >= var20; var63--) {
                    if (var63 <= var62 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lf;")
    public static final class205 method1098(int arg0, int arg1) {
        for (class205 var2 = (class205) field2432.method982(-9570); var2 != null; var2 = (class205) field2432.method981(-1)) {
            if (var2.field3284 && var2.method1430(0, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIII)V")
    private static final void method1099(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field2451 - field2449;
        int var5 = field2453 - field2459;
        if (field2451 < field2436) {
            var4++;
        }
        if (field2453 < field2434) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var34 = arg0 * var6 + arg2 >> 16;
            int var35 = (var6 + 1) * arg0 + arg2 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                int var37 = field2449 + var6 >> 6;
                if (var37 >= 0 && var37 <= field2447.length - 1) {
                    int[][] var38 = field2447[var37];
                    byte[][] var39 = field2445[var37];
                    byte[][] var40 = field2456[var37];
                    byte[][] var41 = field2454[var37];
                    byte[][] var42 = field2446[var37];
                    byte[][] var43 = field2448[var37];
                    int var44 = field2450 + var34;
                    int var45 = field2450 + var35;
                    for (int var46 = 0; var46 < var5; var46++) {
                        int var47 = arg1 * var46 + arg3 >> 16;
                        int var48 = (var46 + 1) * arg1 + arg3 >> 16;
                        int var49 = var48 - var47;
                        if (var49 > 0) {
                            int var50 = field2452 + var47;
                            int var51 = field2452 + var48;
                            int var52 = field2459 + var46 >> 6;
                            int var53 = field2459 + var46 & 0x3F;
                            int var54 = field2449 + var6 & 0x3F;
                            int var55 = (var53 << 6) + var54;
                            int var56;
                            if (var52 < 0 || var52 > var38.length - 1 || var38[var52] == null) {
                                if (field2441.field3311 != -1) {
                                    var56 = field2441.field3311;
                                } else if ((field2459 + var46 & 0x4) == (field2449 + var6 & 0x4)) {
                                    var56 = field2458[class227.field3846 + 1];
                                } else {
                                    var56 = 4936552;
                                }
                                if (var52 < 0 || var52 > var38.length - 1) {
                                    if (var56 == 0) {
                                        var56 = 1;
                                    }
                                    class211.method1483(var44, var50, var36, var49, var56);
                                    continue;
                                }
                            } else {
                                var56 = var38[var52][var55];
                            }
                            if (var56 == 0) {
                                var56 = 1;
                            }
                            int var57 = var39[var52] == null ? 0 : field2458[var39[var52][var55] & 0xFF];
                            int var58 = var41[var52] == null ? 0 : field2458[var41[var52][var55] & 0xFF];
                            if (var57 == 0 && var58 == 0) {
                                class211.method1483(var44, var50, var36, var49, var56);
                            } else {
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = 1;
                                    }
                                    byte var59 = var40[var52] == null ? 0 : var40[var52][var55];
                                    int var60 = var59 & 0xFC;
                                    if (var60 == 0 || var36 <= 1 || var49 <= 1) {
                                        class211.method1483(var44, var50, var36, var49, var57);
                                    } else {
                                        method1097(class211.field3551, var44, var50, var56, var57, var36, var49, var60 >> 2, var59 & 0x3, true);
                                    }
                                }
                                if (var58 != 0) {
                                    if (var58 == -1) {
                                        var58 = var56;
                                    }
                                    byte var61 = var42[var52][var55];
                                    int var62 = var61 & 0xFC;
                                    if (var62 == 0 || var36 <= 1 || var49 <= 1) {
                                        class211.method1483(var44, var50, var36, var49, var58);
                                    }
                                    method1097(class211.field3551, var44, var50, 0, var58, var36, var49, var62 >> 2, var61 & 0x3, var57 == 0);
                                }
                            }
                            if (var43[var52] != null) {
                                int var63 = var43[var52][var55] & 0xFF;
                                if (var63 != 0) {
                                    int var64;
                                    if (var36 == 1) {
                                        var64 = var44;
                                    } else {
                                        var64 = var45 - 1;
                                    }
                                    int var65;
                                    if (var49 == 1) {
                                        var65 = var50;
                                    } else {
                                        var65 = var51 - 1;
                                    }
                                    int var66 = 13421772;
                                    if (var63 >= 5 && var63 <= 8 || var63 >= 13 && var63 <= 16 || var63 >= 21 && var63 <= 24 || var63 == 27 || var63 == 28) {
                                        var66 = 13369344;
                                        var63 -= 4;
                                    }
                                    if (var63 == 1) {
                                        class211.method1491(var44, var50, var49, var66);
                                    } else if (var63 == 2) {
                                        class211.method1495(var44, var50, var36, var66);
                                    } else if (var63 == 3) {
                                        class211.method1491(var64, var50, var49, var66);
                                    } else if (var63 == 4) {
                                        class211.method1495(var44, var65, var36, var66);
                                    } else if (var63 == 9) {
                                        class211.method1491(var44, var50, var49, 16777215);
                                        class211.method1495(var44, var50, var36, var66);
                                    } else if (var63 == 10) {
                                        class211.method1491(var64, var50, var49, 16777215);
                                        class211.method1495(var44, var50, var36, var66);
                                    } else if (var63 == 11) {
                                        class211.method1491(var64, var50, var49, 16777215);
                                        class211.method1495(var44, var65, var36, var66);
                                    } else if (var63 == 12) {
                                        class211.method1491(var44, var50, var49, 16777215);
                                        class211.method1495(var44, var65, var36, var66);
                                    } else if (var63 == 17) {
                                        class211.method1495(var44, var50, 1, var66);
                                    } else if (var63 == 18) {
                                        class211.method1495(var64, var50, 1, var66);
                                    } else if (var63 == 19) {
                                        class211.method1495(var64, var65, 1, var66);
                                    } else if (var63 == 20) {
                                        class211.method1495(var44, var65, 1, var66);
                                    } else if (var63 == 25) {
                                        for (int var67 = 0; var67 < var49; var67++) {
                                            class211.method1495(var44 + var67, var65 - var67, 1, var66);
                                        }
                                    } else if (var63 == 26) {
                                        for (int var68 = 0; var68 < var49; var68++) {
                                            class211.method1495(var44 + var68, var50 + var68, 1, var66);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var69 = field2450 + var34;
                    var10000 = field2450 + var35;
                    for (int var71 = 0; var71 < var5; var71++) {
                        int var72 = (arg1 * var71 + arg3 >> 16) + field2452;
                        int var73 = ((var71 + 1) * arg1 + arg3 >> 16) + field2452;
                        int var74 = var73 - var72;
                        int var75;
                        if (field2441.field3311 != -1) {
                            var75 = field2441.field3311;
                        } else if ((field2459 + var71 & 0x4) == (field2449 + var6 & 0x4)) {
                            var75 = field2458[class227.field3846 + 1];
                        } else {
                            var75 = 4936552;
                        }
                        if (var75 == 0) {
                            var75 = 1;
                        }
                        class211.method1483(var69, var72, var36, var74, var75);
                    }
                }
            }
        }
        for (int var7 = -2; var7 < var4 + 2; var7++) {
            int var8 = arg0 * var7 + arg2 >> 16;
            int var9 = (var7 + 1) * arg0 + arg2 >> 16;
            int var10 = var9 - var8;
            if (var10 > 0) {
                int var11 = field2450 + var8;
                var10000 = field2450 + var9;
                int var13 = field2449 + var7 >> 6;
                if (var13 >= 0 && var13 <= field2455.length - 1) {
                    int[][] var14 = field2455[var13];
                    for (int var15 = -2; var15 < var5 + 2; var15++) {
                        int var16 = arg1 * var15 + arg3 >> 16;
                        int var17 = (var15 + 1) * arg1 + arg3 >> 16;
                        int var18 = var17 - var16;
                        if (var18 > 0) {
                            int var19 = field2452 + var16;
                            var10000 = field2452 + var17;
                            int var21 = field2459 + var15 >> 6;
                            if (var21 >= 0 && var21 <= var14.length - 1) {
                                int var22 = ((field2459 + var15 & 0x3F) << 6) + (field2449 + var7 & 0x3F);
                                if (var14[var21] != null) {
                                    int var23 = var14[var21][var22];
                                    int var24 = var23 & 0x1FFF;
                                    if (var24 != 0) {
                                        class81 var25 = class17.method101(var24 - 1, 34);
                                        int var26 = var23 >> 13 & 0x3;
                                        boolean var27 = (var23 >> 15 & 0x1) == 1;
                                        class230 var28 = var25.method564(var26, var27, true);
                                        if (var28 != null) {
                                            int var29 = var28.field4225 * var10 / 4;
                                            int var30 = var28.field4235 * var18 / 4;
                                            if (var25.field1357) {
                                                int var31 = var23 >> 16 & 0xF;
                                                int var32 = var23 >> 20 & 0xF;
                                                if ((var26 & 0x1) == 1) {
                                                    int var33 = var31;
                                                    var31 = var32;
                                                    var32 = var33;
                                                }
                                                var29 = var10 * var31;
                                                var30 = var18 * var32;
                                            }
                                            if (var29 != 0 && var30 != 0) {
                                                if (var25.field1350 == 0) {
                                                    var28.method1647(var11, var19 + var18 - var30, var29, var30);
                                                } else {
                                                    var28.method1660(var11, var19 + var18 - var30, var29, var30, var25.field1350);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2449 = arg0;
        field2459 = arg1;
        field2451 = arg2;
        field2453 = arg3;
        field2450 = arg4;
        field2452 = arg5;
        field2460 = arg6;
        field2457 = arg7;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lnj;IIII)V")
    private static final void method1101(class206 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field3315 = ((arg0.field3324 - field2449) * arg1 + arg3 >> 16) + field2450;
        arg0.field3318 = ((arg0.field3313 - field2459) * arg2 + arg4 >> 16) + field2452;
        class195 var5 = class22.method146((byte) -44, arg0.field3327);
        if (var5.field3150 != -1) {
            class250 var6 = var5.method1388(false, true, false);
            if (var6 != null) {
                if (arg0.field3315 - (var6.field4225 + 1 >> 1) <= field2460 && (var6.field4225 + 1 >> 1) + arg0.field3315 >= field2450 && arg0.field3318 - (var6.field4235 + 1 >> 1) <= field2457 && (var6.field4235 + 1 >> 1) + arg0.field3318 >= field2452) {
                    arg0.field3322 = false;
                    return;
                }
                arg0.field3322 = true;
                return;
            }
        }
        if (arg0.field3324 >= field2449 && arg0.field3324 <= field2451 && arg0.field3313 >= field2459 && arg0.field3313 <= field2453) {
            arg0.field3322 = false;
        } else {
            arg0.field3322 = true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lab;)V")
    public static final void method1102(class249 arg0) {
        while (arg0.field4160 < arg0.field4182.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1802((byte) -104) == 1) {
                var1 = true;
                var2 = arg0.method1802((byte) -97);
                var3 = arg0.method1802((byte) -108);
            }
            int var4 = arg0.method1802((byte) 88);
            int var5 = arg0.method1802((byte) -102);
            int var6 = var4 * 64 - field2438;
            int var7 = field2434 - (var5 * 64 - field2437) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field2436 && var7 < field2434) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1768(83);
                            if (var12 != 0) {
                                if (field2445[var8][var9] == null) {
                                    field2445[var8][var9] = new byte[4096];
                                }
                                field2445[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1768(103);
                                if (field2456[var8][var9] == null) {
                                    field2456[var8][var9] = new byte[4096];
                                }
                                field2456[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1768(121);
                    if (var15 != 0) {
                        arg0.field4160++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static final void method1103(int arg0) {
        field2441 = (class205) field2432.method987(-123, (long) arg0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lab;Z)V")
    public static final void method1104(class249 arg0, boolean arg1) {
        while (arg0.field4160 < arg0.field4182.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg0.method1802((byte) -107) == 1) {
                var2 = true;
                var3 = arg0.method1802((byte) 98);
                var4 = arg0.method1802((byte) 87);
            }
            int var5 = arg0.method1802((byte) 46);
            int var6 = arg0.method1802((byte) 50);
            int var7 = var5 * 64 - field2438;
            int var8 = field2434 - (var6 * 64 - field2437) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field2436 && var8 < field2434) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                            int var13 = arg0.method1802((byte) -114);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg0.method1802((byte) 30);
                                    if (field2448[var9][var10] == null) {
                                        field2448[var9][var10] = new byte[4096];
                                    }
                                    field2448[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg0.method1812((byte) 52);
                                    if (field2455[var9][var10] == null) {
                                        field2455[var9][var10] = new int[4096];
                                    }
                                    field2455[var9][var10][(63 - var12 << 6) + var11] = var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = arg0.method1821((byte) 51);
                                    int var17 = arg0.method1802((byte) 48);
                                    int var22 = var16 - 1;
                                    class1 var18 = class110.method827(var22, (byte) -90);
                                    if (var18.field34 != null) {
                                        var18 = var18.method22((byte) 117);
                                        if (var18 == null || var18.field21 == -1) {
                                            continue;
                                        }
                                    }
                                    if ((!var18.field45 || arg1) && var18.field21 != -1) {
                                        class206 var19 = new class206();
                                        var19.field3327 = var18.field21;
                                        var19.field3316 = var17;
                                        var19.field3324 = var9 * 64 + var11;
                                        var19.field3313 = var10 * 64 + (64 - var12);
                                        field2439.method449((byte) -64, var19);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < (var2 ? 64 : 4096); var20++) {
                    int var21 = arg0.method1802((byte) -102);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field4160++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field4160 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field4160 += 3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Laj;)V")
    public static final void method1105(class151 arg0) {
        field2433 = arg0;
        field2432.method990((byte) 44);
        int var1 = field2433.method1121(2, "details");
        int[] var2 = field2433.method1143(-18696, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field2432.method986((long) var2[var3], true, class227.method1608(var2[var3], new class249(field2433.method1149(var1, (byte) 34, var2[var3])), (byte) 107));
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lab;)V")
    public static final void method1106(class249 arg0) {
        while (arg0.field4160 < arg0.field4182.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1802((byte) 122) == 1) {
                var1 = true;
                var2 = arg0.method1802((byte) -96);
                var3 = arg0.method1802((byte) 32);
            }
            int var4 = arg0.method1802((byte) -121);
            int var5 = arg0.method1802((byte) -109);
            int var6 = var4 * 64 - field2438;
            int var7 = field2434 - (var5 * 64 - field2437) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field2436 && var7 < field2434) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1768(102);
                            if (var12 != 0) {
                                if (field2454[var8][var9] == null) {
                                    field2454[var8][var9] = new byte[4096];
                                }
                                field2454[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1768(99);
                                if (field2446[var8][var9] == null) {
                                    field2446[var8][var9] = new byte[4096];
                                }
                                field2446[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1768(100);
                    if (var15 != 0) {
                        arg0.field4160++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)V")
    public static final void method1107(int arg0, int arg1) {
        for (int var2 = 0; var2 < class238.field4013; var2++) {
            class294 var3 = class27.method172(var2, (byte) -79);
            if (var3 != null) {
                int var4 = var3.field4833;
                if (var4 >= 0 && !class128.field2136.method702(var4, 64)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field4830 >= 0) {
                    int var5 = var3.field4830;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class128.field2139[class256.method1844(96, var7, true)];
                } else if (var4 >= 0) {
                    var8 = class128.field2139[class256.method1844(96, class128.field2136.method703(2213, var4), true)];
                } else if (var3.field4835 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field4835;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class128.field2139[class256.method1844(96, var11, true)];
                }
                field2458[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()V")
    public static void method1108() {
        field2433 = null;
        field2432 = null;
        field2441 = null;
        field2435 = null;
        field2439 = null;
        field2447 = null;
        field2445 = null;
        field2456 = null;
        field2454 = null;
        field2446 = null;
        field2448 = null;
        field2455 = null;
        field2458 = null;
    }
}
