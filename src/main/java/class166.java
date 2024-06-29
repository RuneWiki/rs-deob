import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class166 extends class237 {

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field2666 = -1;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2681 = "wave2:";

    @OriginalMember(owner = "client!li", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2682 = "scroll:";

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public int field2659;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public int field2668;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "Lol;")
    public static class109 field2664;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "Lod;")
    public class193 field2678;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "Led;")
    public class283 field2665;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "Lqh;")
    public class29 field2677;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "Lib;")
    public static class56 field2673;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Lqk;")
    public class8 field2661;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "[I")
    public static int[] field2657;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "[[[B")
    public static byte[][][] field2679;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIB)I")
    public static final int method1148(int arg0, int arg1, int arg2, byte arg3) {
        field2656++;
        if (class17.field209 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg0;
        int var7 = arg1 & 0x7F;
        if (arg0 < 3 && (class117.field1664[1][var5][var4] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class17.field209[var6][var5][var4] + class17.field209[var6][var5 + 1][var4] * var7 >> 7;
        int var10 = (128 - var7) * class17.field209[var6][var5][var4 + 1] + (class17.field209[var6][var5 + 1][var4 + 1] * var7) >> 7;
        int var11 = -51 % ((-arg3 - 8) / 60);
        return (128 - var8) * var9 + (var8 * var10) >> 7;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public final void method1149(int arg0) {
        this.field2678 = null;
        field2671++;
        this.field2661 = null;
        this.field2677 = null;
        this.field2665 = null;
        if (arg0 != -13001) {
            field2679 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII[IIIZI)V")
    public static final void method1150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field2655++;
        int var11 = arg3;
        if (class217.field3485 <= arg3) {
            return;
        }
        if (class217.field3477 > arg3) {
            var11 = class217.field3477;
        }
        int var12 = arg3 + arg5;
        if (class217.field3477 >= var12) {
            return;
        }
        if (var12 > class217.field3485) {
            var12 = class217.field3485;
        }
        int var13 = arg4;
        if (class217.field3482 <= arg4) {
            return;
        }
        if (class217.field3479 > arg4) {
            var13 = class217.field3479;
        }
        int var14 = arg4 + arg7;
        if (var14 <= class217.field3479) {
            return;
        }
        if (class217.field3482 < var14) {
            var14 = class217.field3482;
        }
        int var15 = class217.field3481 - (var12 - var11);
        if (arg10 == 9) {
            arg10 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg10 == 10) {
            arg10 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        int var16 = class217.field3481 * var13 + var11;
        int var17 = var12 - arg3;
        int var18 = arg5 - var17;
        int var19 = var11 - arg3;
        int var20 = var14 - arg4;
        int var21 = var13 - arg4;
        int var22 = arg5 - var19;
        if (arg10 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg10 = 8;
        }
        int var23 = arg7 - var21;
        int var24 = arg7 - var20;
        if (arg10 == 1) {
            if (arg1 == 0) {
                for (int var25 = var21; var25 < var20; var25++) {
                    for (int var26 = var19; var26 < var17; var26++) {
                        if (var26 <= var25) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 1) {
                for (int var27 = var23 - 1; var27 >= var24; var27--) {
                    for (int var28 = var19; var28 < var17; var28++) {
                        if (var28 <= var27) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 2) {
                for (int var29 = var21; var29 < var20; var29++) {
                    for (int var30 = var19; var30 < var17; var30++) {
                        if (var30 >= var29) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 3) {
                for (int var31 = var23 - 1; var31 >= var24; var31--) {
                    for (int var32 = var19; var32 < var17; var32++) {
                        if (var31 <= var32) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            }
        } else if (arg10 == 2) {
            if (arg1 == 0) {
                for (int var33 = var23 - 1; var33 >= var24; var33--) {
                    for (int var34 = var19; var34 < var17; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 1) {
                for (int var35 = var21; var35 < var20; var35++) {
                    for (int var36 = var19; var36 < var17; var36++) {
                        if (var16 >= 0 && arg6.length > var16) {
                            if (var36 >= var35 << 1) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var15;
                }
            } else if (arg1 == 2) {
                for (int var37 = var21; var37 < var20; var37++) {
                    for (int var38 = var22 - 1; var38 >= var18; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 3) {
                for (int var39 = var23 - 1; var39 >= var24; var39--) {
                    for (int var40 = var22 - 1; var40 >= var18; var40--) {
                        if (var39 << 1 <= var40) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            }
        } else if (arg2 >= 120) {
            if (arg10 == 3) {
                if (arg1 == 0) {
                    for (int var41 = var23 - 1; var41 >= var24; var41--) {
                        for (int var42 = var22 - 1; var42 >= var18; var42--) {
                            if (var42 <= (var41 >> 1)) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                } else if (arg1 == 1) {
                    for (int var43 = var23 - 1; var43 >= var24; var43--) {
                        for (int var44 = var19; var44 < var17; var44++) {
                            if ((var43 << 1) <= var44) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                } else if (arg1 == 2) {
                    for (int var45 = var21; var45 < var20; var45++) {
                        for (int var46 = var19; var46 < var17; var46++) {
                            if (var45 >> 1 >= var46) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                } else if (arg1 == 3) {
                    for (int var47 = var21; var47 < var20; var47++) {
                        for (int var48 = var22 - 1; var48 >= var18; var48--) {
                            if ((var47 << 1) <= var48) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                }
            } else if (arg10 == 4) {
                if (arg1 == 0) {
                    for (int var49 = var23 - 1; var49 >= var24; var49--) {
                        for (int var50 = var19; var50 < var17; var50++) {
                            if (var49 >> 1 <= var50) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                } else if (arg1 == 1) {
                    for (int var51 = var21; var51 < var20; var51++) {
                        for (int var52 = var19; var52 < var17; var52++) {
                            if ((var51 << 1) >= var52) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                } else if (arg1 == 2) {
                    for (int var53 = var21; var53 < var20; var53++) {
                        for (int var54 = var22 - 1; var54 >= var18; var54--) {
                            if (var53 >> 1 <= var54) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                } else if (arg1 == 3) {
                    for (int var55 = var23 - 1; var55 >= var24; var55--) {
                        for (int var56 = var22 - 1; var56 >= var18; var56--) {
                            if (var56 <= (var55 << 1)) {
                                arg6[var16] = arg8;
                            } else if (arg9) {
                                arg6[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                }
            } else if (arg10 != 5) {
                if (arg10 == 6) {
                    if (arg1 == 0) {
                        for (int var65 = var21; var65 < var20; var65++) {
                            for (int var66 = var19; var66 < var17; var66++) {
                                if (var66 <= (arg5 / 2)) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var67 = var21; var67 < var20; var67++) {
                            for (int var68 = var19; var68 < var17; var68++) {
                                if (var67 <= arg7 / 2) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var69 = var21; var69 < var20; var69++) {
                            for (int var70 = var19; var70 < var17; var70++) {
                                if ((arg5 / 2) <= var70) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var71 = var21; var71 < var20; var71++) {
                            for (int var72 = var19; var72 < var17; var72++) {
                                if ((arg7 / 2) <= var71) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                }
                if (arg10 == 7) {
                    if (arg1 == 0) {
                        for (int var73 = var21; var73 < var20; var73++) {
                            for (int var74 = var19; var74 < var17; var74++) {
                                if (var73 - (arg7 / 2) >= var74) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var75 = var23 - 1; var75 >= var24; var75--) {
                            for (int var76 = var19; var76 < var17; var76++) {
                                if (var75 - arg7 / 2 >= var76) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var77 = var23 - 1; var77 >= var24; var77--) {
                            for (int var78 = var22 - 1; var78 >= var18; var78--) {
                                if ((var77 - arg7 / 2) >= var78) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var79 = var21; var79 < var20; var79++) {
                            for (int var80 = var22 - 1; var80 >= var18; var80--) {
                                if (var79 - (arg7 / 2) >= var80) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                }
                if (arg10 == 8) {
                    if (arg1 == 0) {
                        for (int var81 = var21; var81 < var20; var81++) {
                            for (int var82 = var19; var82 < var17; var82++) {
                                if (var82 >= (var81 - arg7 / 2)) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var83 = var23 - 1; var83 >= var24; var83--) {
                            for (int var84 = var19; var84 < var17; var84++) {
                                if (var84 >= var83 - (arg7 / 2)) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var85 = var23 - 1; var85 >= var24; var85--) {
                            for (int var86 = var22 - 1; var86 >= var18; var86--) {
                                if ((var85 - (arg7 / 2)) <= var86) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var87 = var21; var87 < var20; var87++) {
                            for (int var88 = var22 - 1; var88 >= var18; var88--) {
                                if (var88 >= (var87 - (arg7 / 2))) {
                                    arg6[var16] = arg8;
                                } else if (arg9) {
                                    arg6[var16] = arg0;
                                }
                                var16++;
                            }
                            var16 += var15;
                        }
                        return;
                    }
                }
            } else if (arg1 == 0) {
                for (int var57 = var23 - 1; var57 >= var24; var57--) {
                    for (int var58 = var22 - 1; var58 >= var18; var58--) {
                        if (var58 >= (var57 >> 1)) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 1) {
                for (int var59 = var23 - 1; var59 >= var24; var59--) {
                    for (int var60 = var19; var60 < var17; var60++) {
                        if (var60 <= var59 << 1) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 2) {
                for (int var61 = var21; var61 < var20; var61++) {
                    for (int var62 = var19; var62 < var17; var62++) {
                        if ((var61 >> 1) <= var62) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 3) {
                for (int var63 = var21; var63 < var20; var63++) {
                    for (int var64 = var22 - 1; var64 >= var18; var64--) {
                        if (var64 <= (var63 << 1)) {
                            arg6[var16] = arg8;
                        } else if (arg9) {
                            arg6[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public static void method1151(int arg0) {
        field2682 = null;
        if (arg0 != -1) {
            field2657 = null;
        }
        field2664 = null;
        field2679 = null;
        field2657 = null;
        field2681 = null;
        field2673 = null;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Lhl;")
    public static final class202 method1152(int arg0, int arg1) {
        field2660++;
        class202 var2 = (class202) class138.field2215.method1693((long) arg0, 111);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class53.field683.method928(29, (byte) 111, arg0);
        class202 var4 = new class202();
        if (arg1 >= -89) {
            field2666 = -1;
        }
        if (var3 != null) {
            var4.method1407(0, new class96(var3), arg0);
        }
        class138.field2215.method1694(true, (long) arg0, var4);
        return var4;
    }
}
