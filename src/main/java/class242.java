import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class242 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Loh;")
    private static class258 field4194 = class153.method1046("Checking for updates )2 ", 90);

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "[I")
    public static int[] field4203 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "[J")
    public static long[] field4200 = new long[32];

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Loh;")
    public static class258 field4207 = field4194;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field4202 = 0;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Z")
    public static boolean field4196 = false;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "[Loh;")
    public static class258[] field4205 = new class258[500];

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "[I")
    public static int[] field4197;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "[[[B")
    public static byte[][][] field4206;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[IBIIIZIII)V", line = 15)
    public static final void method1647(int arg0, int arg1, int[] arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field4198++;
        int var11 = arg4;
        if (class211.field3641 <= arg4) {
            return;
        }
        if (class211.field3636 > arg4) {
            var11 = class211.field3636;
        }
        int var12 = arg0 + arg4;
        if (var12 <= class211.field3636) {
            return;
        }
        if (var12 > class211.field3641) {
            var12 = class211.field3641;
        }
        int var13 = arg1;
        if (arg1 >= class211.field3642) {
            return;
        }
        if (class211.field3637 > arg1) {
            var13 = class211.field3637;
        }
        int var14 = arg1 + arg5;
        if (class211.field3637 >= var14) {
            return;
        }
        if (var14 > class211.field3642) {
            var14 = class211.field3642;
        }
        int var15 = var14 - arg1;
        int var16 = class211.field3635 * var13 + var11;
        if (arg9 == 9) {
            arg9 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        int var17 = var13 - arg1;
        if (arg9 == 10) {
            arg9 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg9 == 11) {
            arg8 = arg8 + 3 & 0x3;
            arg9 = 8;
        }
        int var18 = class211.field3635 + var11 - var12;
        int var19 = var12 - arg4;
        int var20 = var11 - arg4;
        int var21 = arg5 - var17;
        int var22 = arg5 - var15;
        int var23 = arg0 - var20;
        int var24 = arg0 - var19;
        if (arg9 == 1) {
            if (arg8 == 0) {
                for (int var87 = var17; var87 < var15; var87++) {
                    for (int var88 = var20; var88 < var19; var88++) {
                        if (var88 <= var87) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 1) {
                for (int var81 = var21 - 1; var81 >= var22; var81--) {
                    for (int var82 = var20; var82 < var19; var82++) {
                        if (var82 <= var81) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 2) {
                for (int var83 = var17; var83 < var15; var83++) {
                    for (int var84 = var20; var84 < var19; var84++) {
                        if (var84 >= var83) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 3) {
                for (int var85 = var21 - 1; var85 >= var22; var85--) {
                    for (int var86 = var20; var86 < var19; var86++) {
                        if (var85 <= var86) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 2) {
            if (arg8 == 0) {
                for (int var25 = var21 - 1; var25 >= var22; var25--) {
                    for (int var26 = var20; var26 < var19; var26++) {
                        if (var26 <= (var25 >> 1)) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 1) {
                for (int var31 = var17; var31 < var15; var31++) {
                    for (int var32 = var20; var32 < var19; var32++) {
                        if (var16 >= 0 && var16 < arg2.length) {
                            if (var32 >= var31 << 1) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg8 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var23 - 1; var30 >= var24; var30--) {
                        if (var29 >> 1 >= var30) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 3) {
                for (int var27 = var21 - 1; var27 >= var22; var27--) {
                    for (int var28 = var23 - 1; var28 >= var24; var28--) {
                        if (var28 >= var27 << 1) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 3) {
            if (arg8 == 0) {
                for (int var33 = var21 - 1; var33 >= var22; var33--) {
                    for (int var34 = var23 - 1; var34 >= var24; var34--) {
                        if (var34 <= (var33 >> 1)) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 1) {
                for (int var39 = var21 - 1; var39 >= var22; var39--) {
                    for (int var40 = var20; var40 < var19; var40++) {
                        if (var40 >= var39 << 1) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var20; var38 < var19; var38++) {
                        if (var37 >> 1 >= var38) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 3) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var23 - 1; var36 >= var24; var36--) {
                        if ((var35 << 1) <= var36) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 == 4) {
            if (arg8 == 0) {
                for (int var79 = var21 - 1; var79 >= var22; var79--) {
                    for (int var80 = var20; var80 < var19; var80++) {
                        if (var80 >= var79 >> 1) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 1) {
                for (int var77 = var17; var77 < var15; var77++) {
                    for (int var78 = var20; var78 < var19; var78++) {
                        if ((var77 << 1) >= var78) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 2) {
                for (int var75 = var17; var75 < var15; var75++) {
                    for (int var76 = var23 - 1; var76 >= var24; var76--) {
                        if (var76 >= (var75 >> 1)) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg8 == 3) {
                for (int var73 = var21 - 1; var73 >= var22; var73--) {
                    for (int var74 = var23 - 1; var74 >= var24; var74--) {
                        if (var74 <= (var73 << 1)) {
                            arg2[var16] = arg10;
                        } else if (arg7) {
                            arg2[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg8 == 0) {
                    for (int var41 = var17; var41 < var15; var41++) {
                        for (int var42 = var20; var42 < var19; var42++) {
                            if (arg0 / 2 >= var42) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var47 = var17; var47 < var15; var47++) {
                        for (int var48 = var20; var48 < var19; var48++) {
                            if (arg5 / 2 >= var47) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var45 = var17; var45 < var15; var45++) {
                        for (int var46 = var20; var46 < var19; var46++) {
                            if (arg0 / 2 <= var46) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var43 = var17; var43 < var15; var43++) {
                        for (int var44 = var20; var44 < var19; var44++) {
                            if (var43 >= arg5 / 2) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg3 != -8) {
                method1651((byte) -85);
            }
            if (arg9 == 7) {
                if (arg8 == 0) {
                    for (int var63 = var17; var63 < var15; var63++) {
                        for (int var64 = var20; var64 < var19; var64++) {
                            if ((var63 - (arg5 / 2)) >= var64) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var49 = var21 - 1; var49 >= var22; var49--) {
                        for (int var50 = var20; var50 < var19; var50++) {
                            if ((var49 - (arg5 / 2)) >= var50) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var61 = var21 - 1; var61 >= var22; var61--) {
                        for (int var62 = var23 - 1; var62 >= var24; var62--) {
                            if (var61 - (arg5 / 2) >= var62) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var59 = var17; var59 < var15; var59++) {
                        for (int var60 = var23 - 1; var60 >= var24; var60--) {
                            if (var60 <= (var59 - (arg5 / 2))) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg8 == 0) {
                    for (int var51 = var17; var51 < var15; var51++) {
                        for (int var52 = var20; var52 < var19; var52++) {
                            if (var51 - (arg5 / 2) <= var52) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var53 = var21 - 1; var53 >= var22; var53--) {
                        for (int var54 = var20; var54 < var19; var54++) {
                            if (var53 - (arg5 / 2) <= var54) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var57 = var21 - 1; var57 >= var22; var57--) {
                        for (int var58 = var23 - 1; var58 >= var24; var58--) {
                            if (var57 - (arg5 / 2) <= var58) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var55 = var17; var55 < var15; var55++) {
                        for (int var56 = var23 - 1; var56 >= var24; var56--) {
                            if (var55 - (arg5 / 2) <= var56) {
                                arg2[var16] = arg10;
                            } else if (arg7) {
                                arg2[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var65 = var21 - 1; var65 >= var22; var65--) {
                for (int var66 = var23 - 1; var66 >= var24; var66--) {
                    if (var65 >> 1 <= var66) {
                        arg2[var16] = arg10;
                    } else if (arg7) {
                        arg2[var16] = arg6;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg8 == 1) {
            for (int var67 = var21 - 1; var67 >= var22; var67--) {
                for (int var68 = var20; var68 < var19; var68++) {
                    if (var67 << 1 >= var68) {
                        arg2[var16] = arg10;
                    } else if (arg7) {
                        arg2[var16] = arg6;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg8 == 2) {
            for (int var69 = var17; var69 < var15; var69++) {
                for (int var70 = var20; var70 < var19; var70++) {
                    if ((var69 >> 1) <= var70) {
                        arg2[var16] = arg10;
                    } else if (arg7) {
                        arg2[var16] = arg6;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg8 == 3) {
            for (int var71 = var17; var71 < var15; var71++) {
                for (int var72 = var23 - 1; var72 >= var24; var72--) {
                    if ((var71 << 1) >= var72) {
                        arg2[var16] = arg10;
                    } else if (arg7) {
                        arg2[var16] = arg6;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 1215)
    public static final void method1648(int arg0) {
        class121.field2132 = -1;
        class237.field4141 = arg0;
        class91.field1610 = 0;
        class252.field4342 = false;
        class241.field4184 = 0;
        field4199++;
        class48.field725 = -1;
        class36.field468 = 0;
        class159.field2710.field4051 = 0;
        class15.field193 = -1;
        class10.field118 = 0;
        class69.field1195 = 0;
        class249.field4303 = 0;
        class293.field5036.field4051 = 0;
        for (int var1 = 0; var1 < class38.field527.length; var1++) {
            if (class38.field527[var1] != null) {
                class38.field527[var1].field963 = -1;
            }
        }
        for (int var2 = 0; var2 < class16.field214.length; var2++) {
            if (class16.field214[var2] != null) {
                class16.field214[var2].field963 = -1;
            }
        }
        class225.method1515(32);
        class109.field1926 = 1;
        class106.method791((byte) 8, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class238.field4151[var3] = true;
        }
        class218.method1480(96);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZIIII)V", line = 1283)
    public static final void method1649(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4201++;
        if (!arg1) {
            field4202 = 76;
        }
        for (int var6 = arg3; var6 <= arg3 + arg4; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class214.field3721[arg2][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg3; var8 < (arg3 + arg4); var8++) {
            for (int var9 = arg0; var9 < arg0 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class201.field3482[arg2][var9][var8] = arg2 <= 0 ? 0 : class201.field3482[arg2 - 1][var9][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg3 + 1; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class201.field3482[arg2][arg0][var10] = class201.field3482[arg2][arg0 - 1][var10];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var11 = arg0 + 1; var11 < arg0 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class201.field3482[arg2][var11][arg3] = class201.field3482[arg2][var11][arg3 - 1];
                }
            }
        }
        if (arg0 < 0 || arg3 < 0 || arg0 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 > 0 && class201.field3482[arg2][arg0 - 1][arg3] != 0) {
                class201.field3482[arg2][arg0][arg3] = class201.field3482[arg2][arg0 - 1][arg3];
            } else if (arg3 > 0 && class201.field3482[arg2][arg0][arg3 - 1] != 0) {
                class201.field3482[arg2][arg0][arg3] = class201.field3482[arg2][arg0][arg3 - 1];
            } else if (arg0 > 0 && arg3 > 0 && class201.field3482[arg2][arg0 - 1][arg3 - 1] != 0) {
                class201.field3482[arg2][arg0][arg3] = class201.field3482[arg2][arg0 - 1][arg3 - 1];
            }
        } else if (arg0 > 0 && class201.field3482[arg2 - 1][arg0 - 1][arg3] != class201.field3482[arg2][arg0 - 1][arg3]) {
            class201.field3482[arg2][arg0][arg3] = class201.field3482[arg2][arg0 - 1][arg3];
        } else if (arg3 > 0 && class201.field3482[arg2][arg0][arg3 - 1] != class201.field3482[arg2 - 1][arg0][arg3 - 1]) {
            class201.field3482[arg2][arg0][arg3] = class201.field3482[arg2][arg0][arg3 - 1];
        } else if (arg0 > 0 && arg3 > 0 && class201.field3482[arg2 - 1][arg0 - 1][arg3 - 1] != class201.field3482[arg2][arg0 - 1][arg3 - 1]) {
            class201.field3482[arg2][arg0][arg3] = class201.field3482[arg2][arg0 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lva;B)Ltl;", line = 1415)
    public static final class59 method1650(class235 arg0, byte arg1) {
        if (arg1 != -111) {
            field4206 = (byte[][][]) ((byte[][][]) null);
        }
        field4204++;
        class59 var2 = new class59();
        var2.field983 = arg0.method1615(21);
        var2.field989 = class57.method443((byte) 22, var2.field983);
        return var2;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 1431)
    public static void method1651(byte arg0) {
        field4194 = null;
        field4203 = null;
        if (arg0 != 2) {
            field4196 = false;
        }
        field4207 = null;
        field4197 = null;
        field4206 = (byte[][][]) null;
        field4200 = null;
        field4205 = null;
    }
}
