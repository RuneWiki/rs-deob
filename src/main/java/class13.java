import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class13 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "J")
    public static long field169 = 0L;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field171 = -1;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lhh;")
    public static class49 field176 = new class49();

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
    public static int[] field172;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[Lrd;")
    public static class135[] field179;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[[B")
    public static byte[][] field178;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[[[B")
    public static byte[][][] field175;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V", line = 6)
    public static final void method75(int arg0, int arg1) {
        field177++;
        class77 var2 = class156.method1158(9, false, arg1);
        if (arg0 != -4210) {
            field169 = 27L;
        }
        var2.method586((byte) 98);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 21)
    public static void method76(int arg0) {
        if (arg0 != 10456) {
            field172 = (int[]) null;
        }
        field178 = (byte[][]) null;
        field179 = null;
        field176 = null;
        field175 = (byte[][][]) null;
        field172 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIII)V", line = 36)
    public static final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field174++;
        int var6 = arg2 - arg4;
        int var7 = arg3 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class179.method1317(arg4, arg5, arg1, -25639, arg3);
            }
        } else if (var7 == 0) {
            class175.method1278(arg4, arg5, arg2, arg1, -105);
        } else {
            if (arg0 != 992642156) {
                field171 = -46;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class244.field4161) {
                var11 = class244.field4161;
                var10 = var9 + (class244.field4161 * var8 >> 12);
            } else if (arg2 <= class175.field3106) {
                var10 = arg3;
                var11 = arg2;
            } else {
                var10 = (class175.field3106 * var8 >> 12) + var9;
                var11 = class175.field3106;
            }
            int var12;
            int var13;
            if (class244.field4161 > arg4) {
                var12 = (class244.field4161 * var8 >> 12) + var9;
                var13 = class244.field4161;
            } else if (arg4 <= class175.field3106) {
                var12 = arg1;
                var13 = arg4;
            } else {
                var12 = (class175.field3106 * var8 >> 12) + var9;
                var13 = class175.field3106;
            }
            if (class105.field1887 > var12) {
                var13 = (class105.field1887 - var9 << 12) / var8;
                var12 = class105.field1887;
            } else if (var12 > class274.field4748) {
                var12 = class274.field4748;
                var13 = (class274.field4748 - var9 << 12) / var8;
            }
            if (class105.field1887 > var10) {
                var11 = (class105.field1887 - var9 << 12) / var8;
                var10 = class105.field1887;
            } else if (class274.field4748 < var10) {
                var10 = class274.field4748;
                var11 = (class274.field4748 - var9 << 12) / var8;
            }
            class318.method2213(arg5, var11, var12, (byte) -122, var13, var10);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([[FI[[B[[F[[BI[[B[[B[[I[[FI[Lsm;)V", line = 140)
    public static final void method78(float[][] arg0, int arg1, byte[][] arg2, float[][] arg3, byte[][] arg4, int arg5, byte[][] arg6, byte[][] arg7, int[][] arg8, float[][] arg9, int arg10, class118[] arg11) {
        field170++;
        if (arg10 != 3254) {
            field179 = (class135[]) null;
        }
        for (int var12 = 0; var12 < arg1; var12++) {
            class118 var13 = arg11[var12];
            if (var13.field2099 == arg5) {
                class158 var14 = new class158();
                int var15 = (var13.field2096 >> 7) - var13.field2082;
                int var16 = 0;
                int var17 = (var13.field2092 >> 7) - var13.field2082;
                if (var17 < 0) {
                    var16 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field2092 >> 7) + var13.field2082;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field2094[var16];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg2[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg6[var23][var19] & 0xFF;
                        if (var24 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class192 var27 = class252.method1695(var26 - 1, -31903);
                            if (var27.field3506 == -1) {
                                continue;
                            }
                            if (arg4[var23][var19] != 0) {
                                int[] var28 = class145.field2567[arg4[var23][var19]];
                                var14.field2825 += (var28.length >> 1) * 3 - 6;
                                var14.field2814 += var28.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class192 var29 = class252.method1695(var26 - 1, -31903);
                            if (var29.field3506 == -1) {
                                byte var30 = arg4[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class74.field1387[var30];
                                    var14.field2825 += ((var31.length >> 1) - 2) * 3;
                                    var14.field2814 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg4[var23][var19];
                            if (var32 != 0) {
                                var25 = true;
                            }
                        }
                        class269 var33 = class48.method384(arg5, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field4601 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var35 = (int) (var33.field4601 >> 20) & 0x3;
                                int[] var36 = null;
                                if ((var35 & 0x1) == 0) {
                                    boolean var37 = var21 <= (var23 - 1);
                                    boolean var38 = var22 >= var23 + 1;
                                    if (!var37 && (var19 + 1) <= var18) {
                                        short var39 = var13.field2094[var16 + 1];
                                        int var40 = (var39 >> 8) + var15;
                                        int var41 = var40 + (var39 & 0xFF);
                                        var37 = var23 > var40 && var41 > var23;
                                    }
                                    if (!var38 && (var19 - 1) >= var17) {
                                        short var42 = var13.field2094[var16 - 1];
                                        int var43 = (var42 >> 8) + var15;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var38 = var23 > var43 && var44 > var23;
                                    }
                                    if (var37 && var38) {
                                        var36 = class145.field2567[0];
                                    } else if (var37) {
                                        var36 = class145.field2567[1];
                                    } else if (var38) {
                                        var36 = class145.field2567[1];
                                    }
                                } else {
                                    boolean var45 = var23 + 1 <= var22;
                                    boolean var46 = var21 <= (var23 - 1);
                                    if (!var46 && var17 <= var19 - 1) {
                                        short var47 = var13.field2094[var16 - 1];
                                        int var48 = (var47 >> 8) + var15;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var23 > var48 && var49 > var23;
                                    }
                                    if (!var45 && var19 + 1 <= var18) {
                                        short var50 = var13.field2094[var16 + 1];
                                        int var51 = (var50 >> 8) + var15;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var45 = var51 < var23 && var52 > var23;
                                    }
                                    if (var46 && var45) {
                                        var36 = class145.field2567[0];
                                    } else if (var46) {
                                        var36 = class145.field2567[1];
                                    } else if (var45) {
                                        var36 = class145.field2567[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field2825 += (var36.length >> 1) * 3 - 6;
                                    var14.field2814 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var54 = class145.field2567[arg4[var23][var19]];
                            int[] var55 = class74.field1387[arg4[var23][var19]];
                            var14.field2825 += ((var54.length >> 1) - 2) * 3;
                            var14.field2825 += ((var55.length >> 1) - 2) * 3;
                            var14.field2814 += var54.length >> 1;
                            var14.field2814 += var55.length >> 1;
                        } else {
                            int[] var53 = class145.field2567[0];
                            var14.field2825 += ((var53.length >> 1) - 2) * 3;
                            var14.field2814 += var53.length >> 1;
                        }
                    }
                    var16++;
                }
                var14.method1172();
                int var56 = 0;
                if ((var13.field2092 >> 7) - var13.field2082 < 0) {
                    var56 -= (var13.field2092 >> 7) - var13.field2082;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field2094[var56];
                    int var59 = (var58 >> 8) + var15;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg2[var61][var57] & 0xFF;
                        int var63 = arg6[var61][var57] & 0xFF;
                        byte var64 = arg7[var61][var57];
                        boolean var65 = false;
                        if (var62 == 0) {
                            if (var63 == 0) {
                                continue;
                            }
                            class192 var68 = class252.method1695(var63 - 1, -31903);
                            if (var68.field3506 == -1) {
                                continue;
                            }
                            if (arg4[var61][var57] != 0) {
                                class84.method620(var57, arg7[var61][var57], arg3, arg9, -30594, var13, var61, var14, arg0, class145.field2567[arg4[var61][var57]], arg8);
                                continue;
                            }
                        } else if (var63 != 0) {
                            class192 var66 = class252.method1695(var63 - 1, arg10 ^ 0xFFFF8FD7);
                            if (var66.field3506 == -1) {
                                class84.method620(var57, arg7[var61][var57], arg3, arg9, -30594, var13, var61, var14, arg0, class74.field1387[arg4[var61][var57]], arg8);
                                continue;
                            }
                            byte var67 = arg4[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class269 var69 = class48.method384(arg5, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4601 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4601 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var60 >= var61 + 1;
                                    boolean var82 = var61 - 1 >= var59;
                                    if (!var82 && var18 >= var57 + 1) {
                                        short var83 = var13.field2094[var56 + 1];
                                        int var84 = (var83 >> 8) + var15;
                                        int var85 = var84 + (var83 & 0xFF);
                                        var82 = var61 > var84 && var61 < var85;
                                    }
                                    if (!var81 && (var57 - 1) >= var17) {
                                        short var86 = var13.field2094[var56 - 1];
                                        int var87 = (var86 >> 8) + var15;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var81 = var87 < var61 && var88 > var61;
                                    }
                                    if (var82 && var81) {
                                        var71 = class145.field2567[0];
                                    } else if (var82) {
                                        var71 = class145.field2567[1];
                                        var64 = 1;
                                    } else if (var81) {
                                        var64 = 3;
                                        var71 = class145.field2567[1];
                                    }
                                } else {
                                    boolean var73 = (var61 - 1) >= var59;
                                    if (!var73 && var57 - 1 >= var17) {
                                        short var74 = var13.field2094[var56 - 1];
                                        int var75 = (var74 >> 8) + var15;
                                        int var76 = var75 + (var74 & 0xFF);
                                        var73 = var61 > var75 && var61 < var76;
                                    }
                                    boolean var77 = (var61 + 1) <= var60;
                                    if (!var77 && var18 >= var57 + 1) {
                                        short var78 = var13.field2094[var56 + 1];
                                        int var79 = var15 + (var78 >> 8);
                                        int var80 = (var78 & 0xFF) + var79;
                                        var77 = var61 > var79 && var61 < var80;
                                    }
                                    if (var73 && var77) {
                                        var71 = class145.field2567[0];
                                    } else if (var73) {
                                        var64 = 0;
                                        var71 = class145.field2567[1];
                                    } else if (var77) {
                                        var71 = class145.field2567[1];
                                        var64 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class84.method620(var57, var64, arg3, arg9, -30594, var13, var61, var14, arg0, var71, arg8);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class84.method620(var57, arg7[var61][var57], arg3, arg9, arg10 ^ 0xFFFF84C8, var13, var61, var14, arg0, class74.field1387[arg4[var61][var57]], arg8);
                            class84.method620(var57, arg7[var61][var57], arg3, arg9, -30594, var13, var61, var14, arg0, class145.field2567[arg4[var61][var57]], arg8);
                        } else {
                            class84.method620(var57, var64, arg3, arg9, -30594, var13, var61, var14, arg0, class145.field2567[0], arg8);
                        }
                    }
                    var56++;
                }
                if (var14.field2823 > 0 && var14.field2813 > 0) {
                    var14.method1173();
                    var13.field2098 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 678)
    public static final void method79(boolean arg0) {
        field180++;
        if (arg0) {
            method77(-71, 9, -15, -28, -82, -14);
        }
        class45.field837.method2076(109);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V", line = 689)
    public static final void method80(int arg0, int arg1, int arg2) {
        class91.field1665 = arg0 + class8.field133 + class154.field2753 - arg2;
        field173++;
        class185.field3257 = arg1 - class313.field5383;
        int var3 = class185.field3257 + ((int) ((float) class100.field1774.field3391 / class213.field3816));
        int var4 = class185.field3257 - (int) ((float) class100.field1774.field3391 / class213.field3816);
        if (var4 < 0) {
            class185.field3257 = (int) ((float) class100.field1774.field3391 / class213.field3816);
        }
        if (var3 > class40.field731) {
            class185.field3257 = class40.field731 - ((int) ((float) class100.field1774.field3391 / class213.field3816));
        }
        int var5 = class91.field1665 - (int) ((float) class100.field1774.field3343 / class213.field3816);
        int var6 = (int) ((float) class100.field1774.field3343 / class213.field3816) + class91.field1665;
        if (var5 < 0) {
            class91.field1665 = (int) ((float) class100.field1774.field3343 / class213.field3816);
        }
        if (var6 > class154.field2753) {
            class91.field1665 = class154.field2753 - ((int) ((float) class100.field1774.field3343 / class213.field3816));
        }
    }
}
