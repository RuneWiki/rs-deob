import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class351 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Lcn;")
    private static class37 field5591 = new class37(16);

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field5594 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field5600 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "Lmm;")
    public static class43 field5599 = new class43();

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "F")
    public static float field5595;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "F")
    public static float field5597;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lrn;")
    public static class18 field5590;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Ljo;")
    public static class57 field5602;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Leh;")
    public static class59 field5601;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "[I")
    public static int[] field5607;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "[[[B")
    public static byte[][][] field5608;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "[[[B")
    public static byte[][][] field5612;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "[[[B")
    public static byte[][][] field5613;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "[[[B")
    public static byte[][][] field5617;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "[[[B")
    public static byte[][][] field5618;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "[[[I")
    public static int[][][] field5609;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "[[[I")
    public static int[][][] field5616;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Ljo;", line = 5)
    public static final class57 method2467(int arg0, int arg1) {
        for (class57 var2 = (class57) field5591.method371(-19139); var2 != null; var2 = (class57) field5591.method378((byte) -80)) {
            if (var2.field884 && var2.method572(arg0, arg1, 12800)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()Lfk;", line = 18)
    public static final class317 method2468() {
        int var0 = field5611 - field5603;
        int var1 = field5606 - field5615;
        int var2 = (field5610 - field5614 << 16) / var0;
        int var3 = (field5604 - field5605 << 16) / var1;
        return method2473(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([IIIIIIIIIZ)V", line = 33)
    private static final void method2469(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class60.field935) {
            return;
        }
        if (arg1 < class60.field936) {
            var10 = class60.field936;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class60.field936) {
            return;
        }
        if (var11 > class60.field935) {
            var11 = class60.field935;
        }
        int var12 = arg2;
        if (arg2 >= class60.field931) {
            return;
        }
        if (arg2 < class60.field934) {
            var12 = class60.field934;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class60.field934) {
            return;
        }
        if (var13 > class60.field931) {
            var13 = class60.field931;
        }
        int var14 = class60.field933 * var12 + var10;
        int var15 = class60.field933 + var10 - var11;
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

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "()V", line = 1168)
    public static void method2470() {
        field5590 = null;
        field5591 = null;
        field5602 = null;
        field5601 = null;
        field5599 = null;
        field5609 = (int[][][]) null;
        field5613 = (byte[][][]) null;
        field5608 = (byte[][][]) null;
        field5612 = (byte[][][]) null;
        field5618 = (byte[][][]) null;
        field5617 = (byte[][][]) null;
        field5616 = (int[][][]) null;
        field5607 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lug;)V", line = 1184)
    public static final void method2471(class25 arg0) {
        label83: while (true) {
            if (arg0.field397 < arg0.field448.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method281(68) == 1) {
                    var1 = true;
                    var2 = arg0.method281(89);
                    var3 = arg0.method281(53);
                }
                int var4 = arg0.method281(23);
                int var5 = arg0.method281(116);
                int var6 = var4 * 64 - field5592;
                int var7 = field5593 - (var5 * 64 - field5598) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field5596 && var7 < field5593) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method286((byte) 120);
                                if (var12 != 0) {
                                    if (field5613[var8][var9] == null) {
                                        field5613[var8][var9] = new byte[4096];
                                    }
                                    field5613[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method286((byte) 112);
                                    if (field5608[var8][var9] == null) {
                                        field5608[var8][var9] = new byte[4096];
                                    }
                                    field5608[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method286((byte) 96);
                    if (var15 != 0) {
                        arg0.field397++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIII)V", line = 1268)
    public static final void method2472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5603 = arg0;
        field5615 = arg1;
        field5611 = arg2;
        field5606 = arg3;
        field5614 = arg4;
        field5605 = arg5;
        field5610 = arg6;
        field5604 = arg7;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIII)Lfk;", line = 1279)
    private static final class317 method2473(int arg0, int arg1, int arg2, int arg3) {
        class317 var4 = new class317();
        for (class22 var5 = (class22) field5599.method442((byte) -123); var5 != null; var5 = (class22) field5599.method448(0)) {
            method2481(var5, arg0, arg1, arg2, arg3);
            var4.method2245(var5, 21);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field5601.field920; var7++) {
            class22 var8 = field5601.field922[var7];
            boolean var9 = field5602.method568(field5601.field914[var7] & 0x3FFF, field5601.field914[var7] >> 14 & 0x3FFF, field5601.field914[var7] >> 28 & 0x3, var6, (byte) 91);
            if (var9) {
                var8.field339 = var6[1] - field5592;
                var8.field348 = field5593 - (var6[2] - field5598) - 1;
                method2481(var8, arg0, arg1, arg2, arg3);
                var4.method2245(var8, 51);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Ljo;", line = 1316)
    public static final class57 method2474(int arg0) {
        return (class57) field5591.method370((byte) -120, (long) arg0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lrn;)V", line = 1320)
    public static final void method2475(class18 arg0) {
        field5590 = arg0;
        field5591.method374(15975);
        int var1 = field5590.method186(false, "details");
        int[] var2 = field5590.method183(false, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field5591.method375(class113.method967(new class25(field5590.method187(var1, var2[var3], -1)), var2[var3], -2), (long) var2[var3], 14);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lug;Z)V", line = 1339)
    public static final void method2476(class25 arg0, boolean arg1) {
        label125: while (true) {
            if (arg0.field397 < arg0.field448.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method281(-126) == 1) {
                    var2 = true;
                    var3 = arg0.method281(-127);
                    var4 = arg0.method281(-126);
                }
                int var5 = arg0.method281(28);
                int var6 = arg0.method281(-127);
                int var7 = var5 * 64 - field5592;
                int var8 = field5593 - (var6 * 64 - field5598) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field5596 && var8 < field5593) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label125;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method281(15);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method281(57);
                                        if (field5617[var9][var10] == null) {
                                            field5617[var9][var10] = new byte[4096];
                                        }
                                        field5617[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method265(true);
                                        if (field5616[var9][var10] == null) {
                                            field5616[var9][var10] = new int[4096];
                                        }
                                        field5616[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method314((byte) 85);
                                        int var17 = arg0.method281(74);
                                        int var22 = var16 - 1;
                                        class212 var18 = class43.method437(96, var22);
                                        if (var18.field3289 != null) {
                                            var18 = var18.method1568((byte) 88);
                                            if (var18 == null || var18.field3336 == -1) {
                                                continue;
                                            }
                                        }
                                        if ((!var18.field3269 || arg1) && var18.field3336 != -1) {
                                            class22 var19 = new class22();
                                            var19.field349 = var18.field3336;
                                            var19.field344 = var17;
                                            var19.field339 = var9 * 64 + var11;
                                            var19.field348 = var10 * 64 + (64 - var12);
                                            field5599.method438(true, var19);
                                        }
                                    }
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var20 = 0;
                while (true) {
                    if (var20 >= (var2 ? 64 : 4096)) {
                        continue label125;
                    }
                    int var21 = arg0.method281(-127);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field397++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field397 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field397 += 3;
                        }
                    }
                    var20++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(IIII)V", line = 1476)
    private static final void method2477(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field5611 - field5603;
        int var5 = field5606 - field5615;
        if (field5611 < field5596) {
            var4++;
        }
        if (field5606 < field5593) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0 * var6 + arg2 >> 16;
            int var8 = (var6 + 1) * arg0 + arg2 >> 16;
            int var9 = var8 - var7;
            if (var9 > 0) {
                int var10 = field5603 + var6 >> 6;
                if (var10 >= 0 && var10 <= field5609.length - 1) {
                    int[][] var11 = field5609[var10];
                    byte[][] var12 = field5613[var10];
                    byte[][] var13 = field5608[var10];
                    byte[][] var14 = field5612[var10];
                    byte[][] var15 = field5618[var10];
                    byte[][] var16 = field5617[var10];
                    int var17 = field5614 + var7;
                    int var18 = field5614 + var8;
                    for (int var19 = 0; var19 < var5; var19++) {
                        int var20 = arg1 * var19 + arg3 >> 16;
                        int var21 = (var19 + 1) * arg1 + arg3 >> 16;
                        int var22 = var21 - var20;
                        if (var22 > 0) {
                            int var23 = field5605 + var20;
                            int var24 = field5605 + var21;
                            int var25 = field5615 + var19 >> 6;
                            int var26 = field5615 + var19 & 0x3F;
                            int var27 = field5603 + var6 & 0x3F;
                            int var28 = (var26 << 6) + var27;
                            int var29;
                            if (var25 < 0 || var25 > var11.length - 1 || var11[var25] == null) {
                                if (field5602.field889 != -1) {
                                    var29 = field5602.field889;
                                } else if ((field5615 + var19 & 0x4) == (field5603 + var6 & 0x4)) {
                                    var29 = field5607[class58.field913 + 1];
                                } else {
                                    var29 = 4936552;
                                }
                                if (var25 < 0 || var25 > var11.length - 1) {
                                    if (var29 == 0) {
                                        var29 = 1;
                                    }
                                    class60.method611(var17, var23, var9, var22, var29);
                                    continue;
                                }
                            } else {
                                var29 = var11[var25][var28];
                            }
                            if (var29 == 0) {
                                var29 = 1;
                            }
                            int var30 = var12[var25] == null ? 0 : field5607[var12[var25][var28] & 0xFF];
                            int var31 = var14[var25] == null ? 0 : field5607[var14[var25][var28] & 0xFF];
                            if (var30 == 0 && var31 == 0) {
                                class60.method611(var17, var23, var9, var22, var29);
                            } else {
                                if (var30 != 0) {
                                    if (var30 == -1) {
                                        var30 = 1;
                                    }
                                    byte var32 = var13[var25] == null ? 0 : var13[var25][var28];
                                    int var33 = var32 & 0xFC;
                                    if (var33 == 0 || var9 <= 1 || var22 <= 1) {
                                        class60.method611(var17, var23, var9, var22, var30);
                                    } else {
                                        method2469(class60.field928, var17, var23, var29, var30, var9, var22, var33 >> 2, var32 & 0x3, true);
                                    }
                                }
                                if (var31 != 0) {
                                    if (var31 == -1) {
                                        var31 = var29;
                                    }
                                    byte var34 = var15[var25][var28];
                                    int var35 = var34 & 0xFC;
                                    if (var35 == 0 || var9 <= 1 || var22 <= 1) {
                                        class60.method611(var17, var23, var9, var22, var31);
                                    }
                                    method2469(class60.field928, var17, var23, 0, var31, var9, var22, var35 >> 2, var34 & 0x3, var30 == 0);
                                }
                            }
                            if (var16[var25] != null) {
                                int var36 = var16[var25][var28] & 0xFF;
                                if (var36 != 0) {
                                    int var37;
                                    if (var9 == 1) {
                                        var37 = var17;
                                    } else {
                                        var37 = var18 - 1;
                                    }
                                    int var38;
                                    if (var22 == 1) {
                                        var38 = var23;
                                    } else {
                                        var38 = var24 - 1;
                                    }
                                    int var39 = 13421772;
                                    if (var36 >= 5 && var36 <= 8 || var36 >= 13 && var36 <= 16 || var36 >= 21 && var36 <= 24 || var36 == 27 || var36 == 28) {
                                        var39 = 13369344;
                                        var36 -= 4;
                                    }
                                    if (var36 == 1) {
                                        class60.method602(var17, var23, var22, var39);
                                    } else if (var36 == 2) {
                                        class60.method609(var17, var23, var9, var39);
                                    } else if (var36 == 3) {
                                        class60.method602(var37, var23, var22, var39);
                                    } else if (var36 == 4) {
                                        class60.method609(var17, var38, var9, var39);
                                    } else if (var36 == 9) {
                                        class60.method602(var17, var23, var22, 16777215);
                                        class60.method609(var17, var23, var9, var39);
                                    } else if (var36 == 10) {
                                        class60.method602(var37, var23, var22, 16777215);
                                        class60.method609(var17, var23, var9, var39);
                                    } else if (var36 == 11) {
                                        class60.method602(var37, var23, var22, 16777215);
                                        class60.method609(var17, var38, var9, var39);
                                    } else if (var36 == 12) {
                                        class60.method602(var17, var23, var22, 16777215);
                                        class60.method609(var17, var38, var9, var39);
                                    } else if (var36 == 17) {
                                        class60.method609(var17, var23, 1, var39);
                                    } else if (var36 == 18) {
                                        class60.method609(var37, var23, 1, var39);
                                    } else if (var36 == 19) {
                                        class60.method609(var37, var38, 1, var39);
                                    } else if (var36 == 20) {
                                        class60.method609(var17, var38, 1, var39);
                                    } else if (var36 == 25) {
                                        for (int var40 = 0; var40 < var22; var40++) {
                                            class60.method609(var17 + var40, var38 - var40, 1, var39);
                                        }
                                    } else if (var36 == 26) {
                                        for (int var41 = 0; var41 < var22; var41++) {
                                            class60.method609(var17 + var41, var23 + var41, 1, var39);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var42 = field5614 + var7;
                    var10000 = field5614 + var8;
                    for (int var44 = 0; var44 < var5; var44++) {
                        int var45 = (arg1 * var44 + arg3 >> 16) + field5605;
                        int var46 = ((var44 + 1) * arg1 + arg3 >> 16) + field5605;
                        int var47 = var46 - var45;
                        int var48;
                        if (field5602.field889 != -1) {
                            var48 = field5602.field889;
                        } else if ((field5615 + var44 & 0x4) == (field5603 + var6 & 0x4)) {
                            var48 = field5607[class58.field913 + 1];
                        } else {
                            var48 = 4936552;
                        }
                        if (var48 == 0) {
                            var48 = 1;
                        }
                        class60.method611(var42, var45, var9, var47, var48);
                    }
                }
            }
        }
        for (int var49 = -2; var49 < var4 + 2; var49++) {
            int var50 = arg0 * var49 + arg2 >> 16;
            int var51 = (var49 + 1) * arg0 + arg2 >> 16;
            int var52 = var51 - var50;
            if (var52 > 0) {
                int var53 = field5614 + var50;
                var10000 = field5614 + var51;
                int var55 = field5603 + var49 >> 6;
                if (var55 >= 0 && var55 <= field5616.length - 1) {
                    int[][] var56 = field5616[var55];
                    for (int var57 = -2; var57 < var5 + 2; var57++) {
                        int var58 = arg1 * var57 + arg3 >> 16;
                        int var59 = (var57 + 1) * arg1 + arg3 >> 16;
                        int var60 = var59 - var58;
                        if (var60 > 0) {
                            int var61 = field5605 + var58;
                            var10000 = field5605 + var59;
                            int var63 = field5615 + var57 >> 6;
                            if (var63 >= 0 && var63 <= var56.length - 1) {
                                int var64 = ((field5615 + var57 & 0x3F) << 6) + (field5603 + var49 & 0x3F);
                                if (var56[var63] != null) {
                                    int var65 = var56[var63][var64];
                                    int var66 = var65 & 0x1FFF;
                                    if (var66 != 0) {
                                        class178 var67 = class25.method251(var66 - 1, 34);
                                        int var68 = var65 >> 13 & 0x3;
                                        boolean var69 = (var65 >> 15 & 0x1) == 1;
                                        class77 var70 = var67.method1389(var69, (byte) 74, var68);
                                        if (var70 != null) {
                                            int var71 = var70.field3827 * var52 / 4;
                                            int var72 = var70.field3826 * var60 / 4;
                                            if (var67.field2804) {
                                                int var73 = var65 >> 16 & 0xF;
                                                int var74 = var65 >> 20 & 0xF;
                                                if ((var68 & 0x1) == 1) {
                                                    int var75 = var73;
                                                    var73 = var74;
                                                    var74 = var75;
                                                }
                                                var71 = var52 * var73;
                                                var72 = var60 * var74;
                                            }
                                            if (var71 != 0 && var72 != 0) {
                                                if (var67.field2806 == 0) {
                                                    var70.method709(var53, var61 + var60 - var72, var71, var72);
                                                } else {
                                                    var70.method702(var53, var61 + var60 - var72, var71, var72, var67.field2806);
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

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 1873)
    public static final void method2478(int arg0) {
        field5602 = (class57) field5591.method370((byte) -120, (long) arg0);
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "()V", line = 1878)
    public static final void method2479() {
        for (int var0 = 0; var0 < field5601.field920; var0++) {
            if (field5601.field922[var0] != null) {
                field5599.method438(true, field5601.field922[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "()V", line = 1893)
    public static final void method2480() {
        int var0 = field5611 - field5603;
        int var1 = field5606 - field5615;
        int var2 = (field5610 - field5614 << 16) / var0;
        int var3 = (field5604 - field5605 << 16) / var1;
        method2477(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lvo;IIII)V", line = 1903)
    private static final void method2481(class22 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field343 = ((arg0.field339 - field5603) * arg1 + arg3 >> 16) + field5614;
        arg0.field345 = ((arg0.field348 - field5615) * arg2 + arg4 >> 16) + field5605;
        class181 var5 = class334.method2351(arg0.field349, (byte) -53);
        if (var5.field2863 != -1) {
            class246 var6 = var5.method1406(true, false, -113);
            if (var6 != null) {
                if (arg0.field343 - (var6.field3827 + 1 >> 1) <= field5610 && (var6.field3827 + 1 >> 1) + arg0.field343 >= field5614 && arg0.field345 - (var6.field3826 + 1 >> 1) <= field5604 && (var6.field3826 + 1 >> 1) + arg0.field345 >= field5605) {
                    arg0.field347 = false;
                } else {
                    arg0.field347 = true;
                }
                return;
            }
        }
        if (arg0.field339 >= field5603 && arg0.field339 <= field5611 && arg0.field348 >= field5615 && arg0.field348 <= field5606) {
            arg0.field347 = false;
        } else {
            arg0.field347 = true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)Lmm;", line = 1941)
    public static final class43 method2482(int arg0, int arg1) {
        class43 var2 = new class43();
        for (class57 var3 = (class57) field5591.method371(-19139); var3 != null; var3 = (class57) field5591.method378((byte) -96)) {
            if (var3.field884 && var3.method572(arg0, arg1, 12800)) {
                var2.method438(true, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Lug;)V", line = 1959)
    public static final void method2483(class25 arg0) {
        label83: while (true) {
            if (arg0.field397 < arg0.field448.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method281(-128) == 1) {
                    var1 = true;
                    var2 = arg0.method281(48);
                    var3 = arg0.method281(-126);
                }
                int var4 = arg0.method281(103);
                int var5 = arg0.method281(-124);
                int var6 = var4 * 64 - field5592;
                int var7 = field5593 - (var5 * 64 - field5598) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field5596 && var7 < field5593) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method286((byte) 110);
                                if (var12 != 0) {
                                    if (field5612[var8][var9] == null) {
                                        field5612[var8][var9] = new byte[4096];
                                    }
                                    field5612[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method286((byte) 127);
                                    if (field5618[var8][var9] == null) {
                                        field5618[var8][var9] = new byte[4096];
                                    }
                                    field5618[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method286((byte) 94);
                    if (var15 != 0) {
                        arg0.field397++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)V", line = 2066)
    public static final void method2484(int arg0, int arg1) {
        for (int var2 = 0; var2 < class51.field798; var2++) {
            class192 var3 = class91.method810(var2, (byte) 127);
            if (var3 != null) {
                int var4 = var3.field3024;
                if (var4 >= 0 && !class107.field1619.method763(var4, (byte) -118)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field3018 >= 0) {
                    int var5 = var3.field3018;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class107.field1603[class104.method908((byte) 84, var7, 96)];
                } else if (var4 >= 0) {
                    var8 = class107.field1603[class104.method908((byte) 81, class107.field1619.method760(var4, 1), 96)];
                } else if (var3.field3019 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field3019;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class107.field1603[class104.method908((byte) 49, var11, 96)];
                }
                field5607[var2 + 1] = var8;
            }
        }
    }
}
