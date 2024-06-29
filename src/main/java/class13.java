import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class13 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lfd;")
    private static class130 field164 = new class130(16);

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field168 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field170 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Ljg;")
    public static class177 field166 = new class177();

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "F")
    public static float field172;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "F")
    public static float field174;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lel;")
    public static class218 field171;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lfa;")
    public static class273 field163;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lmg;")
    public static class288 field167;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "[I")
    public static int[] field190;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "[[[B")
    public static byte[][][] field179;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "[[[B")
    public static byte[][][] field182;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "[[[B")
    public static byte[][][] field185;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "[[[B")
    public static byte[][][] field186;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "[[[B")
    public static byte[][][] field187;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "[[[I")
    public static int[][][] field181;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "[[[I")
    public static int[][][] field188;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V")
    public static final void method67() {
        int var0 = field183 - field184;
        int var1 = field176 - field180;
        int var2 = (field191 - field178 << 16) / var0;
        int var3 = (field189 - field177 << 16) / var1;
        method84(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lma;Z)V")
    public static final void method68(class202 arg0, boolean arg1) {
        while (arg0.field3272 < arg0.field3234.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg0.method1420((byte) 0) == 1) {
                var2 = true;
                var3 = arg0.method1420((byte) 0);
                var4 = arg0.method1420((byte) 0);
            }
            int var5 = arg0.method1420((byte) 0);
            int var6 = arg0.method1420((byte) 0);
            int var7 = var5 * 64 - field173;
            int var8 = field165 - (var6 * 64 - field169) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field175 && var8 < field165) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                            int var13 = arg0.method1420((byte) 0);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg0.method1420((byte) 0);
                                    if (field187[var9][var10] == null) {
                                        field187[var9][var10] = new byte[4096];
                                    }
                                    field187[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg0.method1401((byte) -86);
                                    if (field188[var9][var10] == null) {
                                        field188[var9][var10] = new int[4096];
                                    }
                                    field188[var9][var10][(63 - var12 << 6) + var11] = var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = arg0.method1419(81);
                                    int var17 = arg0.method1420((byte) 0);
                                    int var22 = var16 - 1;
                                    class74 var18 = class216.method1510(0, var22);
                                    if (var18.field1149 != null) {
                                        var18 = var18.method488(-93);
                                        if (var18 == null || var18.field1128 == -1) {
                                            continue;
                                        }
                                    }
                                    if ((!var18.field1103 || arg1) && var18.field1128 != -1) {
                                        class314 var19 = new class314();
                                        var19.field5051 = var18.field1128;
                                        var19.field5052 = var17;
                                        var19.field5065 = var9 * 64 + var11;
                                        var19.field5056 = var10 * 64 + (64 - var12);
                                        field166.method1190(8217, var19);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < (var2 ? 64 : 4096); var20++) {
                    int var21 = arg0.method1420((byte) 0);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field3272++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field3272 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field3272 += 3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Ljg;")
    public static final class177 method69(int arg0, int arg1) {
        class177 var2 = new class177();
        for (class218 var3 = (class218) field164.method871(-36); var3 != null; var3 = (class218) field164.method869(-14210)) {
            if (var3.field3473 && var3.method1525(-12421, arg1, arg0)) {
                var2.method1190(8217, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lfa;)V")
    public static final void method70(class273 arg0) {
        field163 = arg0;
        field164.method874((byte) -124);
        int var1 = field163.method1895("details", false);
        int[] var2 = field163.method1875(var1, 0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field164.method857(false, class178.method1197(-80, var2[var3], new class202(field163.method1877(var2[var3], var1, (byte) 53))), (long) var2[var3]);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([IIIIIIIIIZ)V")
    private static final void method71(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class62.field933) {
            return;
        }
        if (arg1 < class62.field929) {
            var10 = class62.field929;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class62.field929) {
            return;
        }
        if (var11 > class62.field933) {
            var11 = class62.field933;
        }
        int var12 = arg2;
        if (arg2 >= class62.field935) {
            return;
        }
        if (arg2 < class62.field930) {
            var12 = class62.field930;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class62.field930) {
            return;
        }
        if (var13 > class62.field935) {
            var13 = class62.field935;
        }
        int var14 = class62.field934 * var12 + var10;
        int var15 = class62.field934 + var10 - var11;
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

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lli;IIII)V")
    private static final void method72(class314 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field5060 = ((arg0.field5065 - field184) * arg1 + arg3 >> 16) + field178;
        arg0.field5062 = ((arg0.field5056 - field180) * arg2 + arg4 >> 16) + field177;
        class195 var5 = class192.method1334(false, arg0.field5051);
        if (var5.field3104 != -1) {
            class110 var6 = var5.method1357(true, 0, false);
            if (var6 != null) {
                if (arg0.field5060 - (var6.field1681 + 1 >> 1) <= field191 && (var6.field1681 + 1 >> 1) + arg0.field5060 >= field178 && arg0.field5062 - (var6.field1672 + 1 >> 1) <= field189 && (var6.field1672 + 1 >> 1) + arg0.field5062 >= field177) {
                    arg0.field5068 = false;
                    return;
                }
                arg0.field5068 = true;
                return;
            }
        }
        if (arg0.field5065 >= field184 && arg0.field5065 <= field183 && arg0.field5056 >= field180 && arg0.field5056 <= field176) {
            arg0.field5068 = false;
        } else {
            arg0.field5068 = true;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()Lwa;")
    public static final class281 method73() {
        int var0 = field183 - field184;
        int var1 = field176 - field180;
        int var2 = (field191 - field178 << 16) / var0;
        int var3 = (field189 - field177 << 16) / var1;
        return method74(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)Lwa;")
    private static final class281 method74(int arg0, int arg1, int arg2, int arg3) {
        class281 var4 = new class281();
        for (class314 var5 = (class314) field166.method1187((byte) 127); var5 != null; var5 = (class314) field166.method1186(true)) {
            method72(var5, arg0, arg1, arg2, arg3);
            var4.method1952(var5, 76);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field167.field4792; var7++) {
            class314 var8 = field167.field4796[var7];
            boolean var9 = field171.method1526(false, field167.field4795[var7] >> 14 & 0x3FFF, field167.field4795[var7] & 0x3FFF, field167.field4795[var7] >> 28 & 0x3, var6);
            if (var9) {
                var8.field5065 = var6[1] - field173;
                var8.field5056 = field165 - (var6[2] - field169) - 1;
                method72(var8, arg0, arg1, arg2, arg3);
                var4.method1952(var8, 76);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Lel;")
    public static final class218 method75(int arg0) {
        return (class218) field164.method872((byte) -83, (long) arg0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field184 = arg0;
        field180 = arg1;
        field183 = arg2;
        field176 = arg3;
        field178 = arg4;
        field177 = arg5;
        field191 = arg6;
        field189 = arg7;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)Lel;")
    public static final class218 method77(int arg0, int arg1) {
        for (class218 var2 = (class218) field164.method871(-36); var2 != null; var2 = (class218) field164.method869(-14210)) {
            if (var2.field3473 && var2.method1525(-12421, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lma;)V")
    public static final void method78(class202 arg0) {
        while (arg0.field3272 < arg0.field3234.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1420((byte) 0) == 1) {
                var1 = true;
                var2 = arg0.method1420((byte) 0);
                var3 = arg0.method1420((byte) 0);
            }
            int var4 = arg0.method1420((byte) 0);
            int var5 = arg0.method1420((byte) 0);
            int var6 = var4 * 64 - field173;
            int var7 = field165 - (var5 * 64 - field169) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field175 && var7 < field165) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1457((byte) -108);
                            if (var12 != 0) {
                                if (field185[var8][var9] == null) {
                                    field185[var8][var9] = new byte[4096];
                                }
                                field185[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1457((byte) -68);
                                if (field179[var8][var9] == null) {
                                    field179[var8][var9] = new byte[4096];
                                }
                                field179[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1457((byte) -49);
                    if (var15 != 0) {
                        arg0.field3272++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method79(int arg0) {
        field171 = (class218) field164.method872((byte) -89, (long) arg0);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V")
    public static void method80() {
        field163 = null;
        field164 = null;
        field171 = null;
        field167 = null;
        field166 = null;
        field181 = null;
        field186 = null;
        field182 = null;
        field185 = null;
        field179 = null;
        field187 = null;
        field188 = null;
        field190 = null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lma;)V")
    public static final void method81(class202 arg0) {
        while (arg0.field3272 < arg0.field3234.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1420((byte) 0) == 1) {
                var1 = true;
                var2 = arg0.method1420((byte) 0);
                var3 = arg0.method1420((byte) 0);
            }
            int var4 = arg0.method1420((byte) 0);
            int var5 = arg0.method1420((byte) 0);
            int var6 = var4 * 64 - field173;
            int var7 = field165 - (var5 * 64 - field169) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field175 && var7 < field165) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1457((byte) -103);
                            if (var12 != 0) {
                                if (field186[var8][var9] == null) {
                                    field186[var8][var9] = new byte[4096];
                                }
                                field186[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1457((byte) -65);
                                if (field182[var8][var9] == null) {
                                    field182[var8][var9] = new byte[4096];
                                }
                                field182[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1457((byte) -37);
                    if (var15 != 0) {
                        arg0.field3272++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)V")
    public static final void method82(int arg0, int arg1) {
        for (int var2 = 0; var2 < class137.field2124; var2++) {
            class215 var3 = class195.method1358(var2, true);
            if (var3 != null) {
                int var4 = var3.field3436;
                if (var4 >= 0 && !class172.field2670.method1121(0, var4)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field3428 >= 0) {
                    int var5 = var3.field3428;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class172.field2654[class52.method311(true, var7, 96)];
                } else if (var4 >= 0) {
                    var8 = class172.field2654[class52.method311(true, class172.field2670.method1120(var4, 47), 96)];
                } else if (var3.field3432 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field3432;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class172.field2654[class52.method311(true, var11, 96)];
                }
                field190[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()V")
    public static final void method83() {
        for (int var0 = 0; var0 < field167.field4792; var0++) {
            if (field167.field4796[var0] != null) {
                field166.method1190(8217, field167.field4796[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIII)V")
    private static final void method84(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field183 - field184;
        int var5 = field176 - field180;
        if (field183 < field175) {
            var4++;
        }
        if (field176 < field165) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var34 = arg0 * var6 + arg2 >> 16;
            int var35 = (var6 + 1) * arg0 + arg2 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                int var37 = field184 + var6 >> 6;
                if (var37 >= 0 && var37 <= field181.length - 1) {
                    int[][] var38 = field181[var37];
                    byte[][] var39 = field186[var37];
                    byte[][] var40 = field182[var37];
                    byte[][] var41 = field185[var37];
                    byte[][] var42 = field179[var37];
                    byte[][] var43 = field187[var37];
                    int var44 = field178 + var34;
                    int var45 = field178 + var35;
                    for (int var46 = 0; var46 < var5; var46++) {
                        int var47 = arg1 * var46 + arg3 >> 16;
                        int var48 = (var46 + 1) * arg1 + arg3 >> 16;
                        int var49 = var48 - var47;
                        if (var49 > 0) {
                            int var50 = field177 + var47;
                            int var51 = field177 + var48;
                            int var52 = field180 + var46 >> 6;
                            int var53 = field180 + var46 & 0x3F;
                            int var54 = field184 + var6 & 0x3F;
                            int var55 = (var53 << 6) + var54;
                            int var56;
                            if (var52 < 0 || var52 > var38.length - 1 || var38[var52] == null) {
                                if (field171.field3485 != -1) {
                                    var56 = field171.field3485;
                                } else if ((field184 + var6 & 0x4) == (field180 + var46 & 0x4)) {
                                    var56 = field190[class252.field3995 + 1];
                                } else {
                                    var56 = 4936552;
                                }
                                if (var52 < 0 || var52 > var38.length - 1) {
                                    if (var56 == 0) {
                                        var56 = 1;
                                    }
                                    class62.method380(var44, var50, var36, var49, var56);
                                    continue;
                                }
                            } else {
                                var56 = var38[var52][var55];
                            }
                            if (var56 == 0) {
                                var56 = 1;
                            }
                            int var57 = var39[var52] == null ? 0 : field190[var39[var52][var55] & 0xFF];
                            int var58 = var41[var52] == null ? 0 : field190[var41[var52][var55] & 0xFF];
                            if (var57 == 0 && var58 == 0) {
                                class62.method380(var44, var50, var36, var49, var56);
                            } else {
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = 1;
                                    }
                                    byte var59 = var40[var52] == null ? 0 : var40[var52][var55];
                                    int var60 = var59 & 0xFC;
                                    if (var60 == 0 || var36 <= 1 || var49 <= 1) {
                                        class62.method380(var44, var50, var36, var49, var57);
                                    } else {
                                        method71(class62.field932, var44, var50, var56, var57, var36, var49, var60 >> 2, var59 & 0x3, true);
                                    }
                                }
                                if (var58 != 0) {
                                    if (var58 == -1) {
                                        var58 = var56;
                                    }
                                    byte var61 = var42[var52][var55];
                                    int var62 = var61 & 0xFC;
                                    if (var62 == 0 || var36 <= 1 || var49 <= 1) {
                                        class62.method380(var44, var50, var36, var49, var58);
                                    }
                                    method71(class62.field932, var44, var50, 0, var58, var36, var49, var62 >> 2, var61 & 0x3, var57 == 0);
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
                                        class62.method392(var44, var50, var49, var66);
                                    } else if (var63 == 2) {
                                        class62.method385(var44, var50, var36, var66);
                                    } else if (var63 == 3) {
                                        class62.method392(var64, var50, var49, var66);
                                    } else if (var63 == 4) {
                                        class62.method385(var44, var65, var36, var66);
                                    } else if (var63 == 9) {
                                        class62.method392(var44, var50, var49, 16777215);
                                        class62.method385(var44, var50, var36, var66);
                                    } else if (var63 == 10) {
                                        class62.method392(var64, var50, var49, 16777215);
                                        class62.method385(var44, var50, var36, var66);
                                    } else if (var63 == 11) {
                                        class62.method392(var64, var50, var49, 16777215);
                                        class62.method385(var44, var65, var36, var66);
                                    } else if (var63 == 12) {
                                        class62.method392(var44, var50, var49, 16777215);
                                        class62.method385(var44, var65, var36, var66);
                                    } else if (var63 == 17) {
                                        class62.method385(var44, var50, 1, var66);
                                    } else if (var63 == 18) {
                                        class62.method385(var64, var50, 1, var66);
                                    } else if (var63 == 19) {
                                        class62.method385(var64, var65, 1, var66);
                                    } else if (var63 == 20) {
                                        class62.method385(var44, var65, 1, var66);
                                    } else if (var63 == 25) {
                                        for (int var67 = 0; var67 < var49; var67++) {
                                            class62.method385(var44 + var67, var65 - var67, 1, var66);
                                        }
                                    } else if (var63 == 26) {
                                        for (int var68 = 0; var68 < var49; var68++) {
                                            class62.method385(var44 + var68, var50 + var68, 1, var66);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var69 = field178 + var34;
                    var10000 = field178 + var35;
                    for (int var71 = 0; var71 < var5; var71++) {
                        int var72 = (arg1 * var71 + arg3 >> 16) + field177;
                        int var73 = ((var71 + 1) * arg1 + arg3 >> 16) + field177;
                        int var74 = var73 - var72;
                        int var75;
                        if (field171.field3485 != -1) {
                            var75 = field171.field3485;
                        } else if ((field184 + var6 & 0x4) == (field180 + var71 & 0x4)) {
                            var75 = field190[class252.field3995 + 1];
                        } else {
                            var75 = 4936552;
                        }
                        if (var75 == 0) {
                            var75 = 1;
                        }
                        class62.method380(var69, var72, var36, var74, var75);
                    }
                }
            }
        }
        for (int var7 = -2; var7 < var4 + 2; var7++) {
            int var8 = arg0 * var7 + arg2 >> 16;
            int var9 = (var7 + 1) * arg0 + arg2 >> 16;
            int var10 = var9 - var8;
            if (var10 > 0) {
                int var11 = field178 + var8;
                var10000 = field178 + var9;
                int var13 = field184 + var7 >> 6;
                if (var13 >= 0 && var13 <= field188.length - 1) {
                    int[][] var14 = field188[var13];
                    for (int var15 = -2; var15 < var5 + 2; var15++) {
                        int var16 = arg1 * var15 + arg3 >> 16;
                        int var17 = (var15 + 1) * arg1 + arg3 >> 16;
                        int var18 = var17 - var16;
                        if (var18 > 0) {
                            int var19 = field177 + var16;
                            var10000 = field177 + var17;
                            int var21 = field180 + var15 >> 6;
                            if (var21 >= 0 && var21 <= var14.length - 1) {
                                int var22 = ((field180 + var15 & 0x3F) << 6) + (field184 + var7 & 0x3F);
                                if (var14[var21] != null) {
                                    int var23 = var14[var21][var22];
                                    int var24 = var23 & 0x1FFF;
                                    if (var24 != 0) {
                                        class184 var25 = class182.method1209((byte) -84, var24 - 1);
                                        int var26 = var23 >> 13 & 0x3;
                                        boolean var27 = (var23 >> 15 & 0x1) == 1;
                                        class5 var28 = var25.method1225(var27, (byte) -79, var26);
                                        if (var28 != null) {
                                            int var29 = var28.field1681 * var10 / 4;
                                            int var30 = var28.field1672 * var18 / 4;
                                            if (var25.field2867) {
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
                                                if (var25.field2859 == 0) {
                                                    var28.method25(var11, var19 + var18 - var30, var29, var30);
                                                } else {
                                                    var28.method22(var11, var19 + var18 - var30, var29, var30, var25.field2859);
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
}
