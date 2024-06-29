import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class248 extends class264 {

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    private int field4104 = 6;

    @OriginalMember(owner = "client!te", name = "qb", descriptor = "Lma;")
    public static class5 field4112 = class12.method119("<col=c0ff00>", (byte) 62);

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "Lma;")
    public static class5 field4103 = class12.method119("Fertigkeit)2", (byte) 120);

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!te", name = "sb", descriptor = "Lje;")
    public static class158 field4114;

    @OriginalMember(owner = "client!te", name = "rb", descriptor = "Lni;")
    public static class202 field4113;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "[I")
    public static int[] field4101;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "[[[I")
    public static int[][][] field4102;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)[[I", line = 6)
    public final int[][] method138(byte arg0, int arg1) {
        int[][] var3 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[][] var4 = this.method1817(-85, 0, arg1);
            int[][] var5 = this.method1817(-81, 1, arg1);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4104;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class226.field3716; var63++) {
                    var7[var63] = var9[var63] + var12[var63];
                    var8[var63] = var10[var63] + var13[var63];
                    var6[var63] = var11[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class226.field3716; var16++) {
                    var7[var16] = var9[var16] - var12[var16];
                    var8[var16] = var10[var16] - var13[var16];
                    var6[var16] = var11[var16] - var14[var16];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class226.field3716; var17++) {
                    var7[var17] = var9[var17] * var12[var17] >> 12;
                    var8[var17] = var10[var17] * var13[var17] >> 12;
                    var6[var17] = var11[var17] * var14[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var59 = 0; var59 < class226.field3716; var59++) {
                    int var60 = var12[var59];
                    int var61 = var14[var59];
                    int var62 = var13[var59];
                    var7[var59] = var60 == 0 ? 4096 : (var9[var59] << 12) / var60;
                    var8[var59] = var62 == 0 ? 4096 : (var10[var59] << 12) / var62;
                    var6[var59] = var61 == 0 ? 4096 : (var11[var59] << 12) / var61;
                }
            } else if (var15 == 5) {
                for (int var58 = 0; var58 < class226.field3716; var58++) {
                    var7[var58] = 4096 - ((4096 - var9[var58]) * (4096 - var12[var58]) >> 12);
                    var8[var58] = 4096 - ((4096 - var10[var58]) * (4096 - var13[var58]) >> 12);
                    var6[var58] = 4096 - ((4096 - var11[var58]) * (4096 - var14[var58]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var54 = 0; var54 < class226.field3716; var54++) {
                    int var55 = var13[var54];
                    int var56 = var12[var54];
                    int var57 = var14[var54];
                    var7[var54] = var56 < 2048 ? var9[var54] * var56 >> 11 : 4096 - ((4096 - var9[var54]) * (4096 - var56) >> 11);
                    var8[var54] = var55 >= 2048 ? 4096 - ((4096 - var10[var54]) * (4096 - var55) >> 11) : var10[var54] * var55 >> 11;
                    var6[var54] = var57 < 2048 ? var11[var54] * var57 >> 11 : 4096 - ((4096 - var11[var54]) * (4096 - var57) >> 11);
                }
            } else if (var15 == 7) {
                for (int var50 = 0; var50 < class226.field3716; var50++) {
                    int var51 = var10[var50];
                    int var52 = var9[var50];
                    int var53 = var11[var50];
                    var7[var50] = var52 == 4096 ? 4096 : (var12[var50] << 12) / (4096 - var52);
                    var8[var50] = var51 == 4096 ? 4096 : (var13[var50] << 12) / (4096 - var51);
                    var6[var50] = var53 == 4096 ? 4096 : (var14[var50] << 12) / (4096 - var53);
                }
            } else if (var15 == 8) {
                for (int var18 = 0; var18 < class226.field3716; var18++) {
                    int var19 = var9[var18];
                    int var20 = var10[var18];
                    int var21 = var11[var18];
                    var7[var18] = var19 == 0 ? 0 : 4096 - ((4096 - var12[var18] << 12) / var19);
                    var8[var18] = var20 == 0 ? 0 : 4096 - ((4096 - var13[var18] << 12) / var20);
                    var6[var18] = var21 == 0 ? 0 : 4096 - ((4096 - var14[var18] << 12) / var21);
                }
            } else if (var15 == 9) {
                for (int var43 = 0; var43 < class226.field3716; var43++) {
                    int var44 = var10[var43];
                    int var45 = var11[var43];
                    int var46 = var13[var43];
                    int var47 = var12[var43];
                    int var48 = var9[var43];
                    int var49 = var14[var43];
                    var7[var43] = var48 >= var47 ? var47 : var48;
                    var8[var43] = var44 >= var46 ? var46 : var44;
                    var6[var43] = var45 >= var49 ? var49 : var45;
                }
            } else if (var15 == 10) {
                for (int var36 = 0; var36 < class226.field3716; var36++) {
                    int var37 = var13[var36];
                    int var38 = var11[var36];
                    int var39 = var10[var36];
                    int var40 = var14[var36];
                    int var41 = var9[var36];
                    int var42 = var12[var36];
                    var7[var36] = var42 >= var41 ? var42 : var41;
                    var8[var36] = var39 <= var37 ? var37 : var39;
                    var6[var36] = var40 >= var38 ? var40 : var38;
                }
            } else if (var15 == 11) {
                for (int var29 = 0; var29 < class226.field3716; var29++) {
                    int var30 = var12[var29];
                    int var31 = var13[var29];
                    int var32 = var9[var29];
                    int var33 = var10[var29];
                    int var34 = var14[var29];
                    int var35 = var11[var29];
                    var7[var29] = var30 < var32 ? var32 - var30 : -var32 + var30;
                    var8[var29] = var33 <= var31 ? var31 - var33 : -var31 + var33;
                    var6[var29] = var35 > var34 ? var35 - var34 : -var35 + var34;
                }
            } else if (var15 == 12) {
                for (int var22 = 0; var22 < class226.field3716; var22++) {
                    int var23 = var13[var22];
                    int var24 = var14[var22];
                    int var25 = var12[var22];
                    int var26 = var10[var22];
                    int var27 = var11[var22];
                    int var28 = var9[var22];
                    var7[var22] = var25 + var28 - (var25 * var28 >> 11);
                    var8[var22] = var23 + var26 - (var23 * var26 >> 11);
                    var6[var22] = var24 + var27 - (var24 * var27 >> 11);
                }
            }
        }
        field4111++;
        int var64 = 63 / ((-arg0 - 43) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V", line = 324)
    public static final void method1732(int arg0) {
        field4105++;
        for (int var1 = arg0; var1 < class129.field1940; var1++) {
            int var2 = class73.field1153[var1];
            class177 var3 = class119.field1804[var2];
            if (var3 != null) {
                method1734(var3.field2699.field4905, 255, var3);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([[F[[F[[BB[[B[[I[[BI[[F[[I[[[B[[B)[Lwh;", line = 357)
    public static final class56[] method1733(float[][] arg0, float[][] arg1, byte[][] arg2, byte arg3, byte[][] arg4, int[][] arg5, byte[][] arg6, int arg7, float[][] arg8, int[][] arg9, byte[][][] arg10, byte[][] arg11) {
        field4106++;
        if (arg3 != -23) {
            method1736(120);
        }
        class209 var12 = new class209(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg11[var13][var14] & 0xFF;
                int var16 = arg4[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class16 var17 = class236.method1672(var16 - 1, arg3 ^ 0xFFFF8B9C);
                    if (var17.field295 == -1) {
                        continue;
                    }
                    class56 var18 = class68.method494(var12, -389482464, var17);
                    byte var19 = arg6[var13][var14];
                    int[] var20 = client.field1759[var19];
                    var18.field875 += var20.length / 2;
                    var18.field869++;
                    if (var17.field297 && var15 != 0) {
                        var18.field875 += class157.field2354[var19];
                    }
                }
                if ((arg11[var13][var14] & 0xFF) != 0 || var16 != 0 && arg6[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg4[var13 - 1][var14] & 0xFF;
                    int var27 = arg4[var13][var14 + 1] & 0xFF;
                    int var28 = 0;
                    int var29 = arg4[var13][var14 - 1] & 0xFF;
                    int var30 = arg4[var13 + 1][var14] & 0xFF;
                    int var31 = arg4[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg4[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg4[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg4[var13 + 1][var14 - 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class16 var35 = class236.method1672(var31 - 1, arg3 ^ 0xFFFF8B9C);
                        if (var35.field297 && var35.field295 != -1) {
                            byte var36 = arg2[var13 - 1][var14 + 1];
                            byte var37 = arg6[var13 - 1][var14 + 1];
                            int var38 = class287.field4839[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class287.field4839[(var36 + 3 & 0x3) + var37 * 4];
                            if (class301.field5081[var39][1] && class301.field5081[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var22 == var41) {
                                        var21[var22++] = var31;
                                        break;
                                    }
                                    if (var21[var41] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var52 = false;
                    } else {
                        class16 var44 = class236.method1672(var32 - 1, 29813);
                        if (var44.field297 && var44.field295 != -1) {
                            byte var45 = arg2[var13 - 1][var14 - 1];
                            byte var46 = arg6[var13 - 1][var14 - 1];
                            int var47 = class287.field4839[var46 * 4 + (var45 & 0x3)];
                            int var48 = class287.field4839[var46 * 4 + (var45 + 3 & 0x3)];
                            if (class301.field5081[var47][1] && class301.field5081[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var22 == var50) {
                                        var21[var22++] = var32;
                                        break;
                                    }
                                    if (var21[var50] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var34 == 0 || var16 == var34) {
                        boolean var61 = false;
                    } else {
                        class16 var53 = class236.method1672(var34 - 1, 29813);
                        if (var53.field297 && var53.field295 != -1) {
                            byte var54 = arg2[var13 + 1][var14 - 1];
                            byte var55 = arg6[var13 + 1][var14 - 1];
                            int var56 = class287.field4839[var55 * 4 + (var54 + 1 & 0x3)];
                            int var57 = class287.field4839[(var54 & 0x3) + var55 * 4];
                            if (class301.field5081[var56][1] && class301.field5081[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var22 == var59) {
                                        var21[var22++] = var34;
                                        break;
                                    }
                                    if (var21[var59] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var70 = false;
                    } else {
                        class16 var62 = class236.method1672(var33 - 1, 29813);
                        if (var62.field297 && var62.field295 != -1) {
                            byte var63 = arg2[var13 + 1][var14 + 1];
                            byte var64 = arg6[var13 + 1][var14 + 1];
                            int var65 = class287.field4839[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class287.field4839[(var63 + 1 & 0x3) + var64 * 4];
                            if (class301.field5081[var65][1] && class301.field5081[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var22 == var68) {
                                        var21[var22++] = var33;
                                        break;
                                    }
                                    if (var21[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class16 var71 = class236.method1672(var27 - 1, 29813);
                        if (var71.field297 && var71.field295 != -1) {
                            var23 = class287.field4839[(arg2[var13][var14 + 1] + 2 & 0x3) + arg6[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var22 == var72) {
                                    var21[var22++] = var27;
                                    break;
                                }
                                if (var21[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var26 != 0 && var16 != var26) {
                        class16 var73 = class236.method1672(var26 - 1, arg3 + 29836);
                        if (var73.field297 && var73.field295 != -1) {
                            var24 = class287.field4839[(arg2[var13 - 1][var14] + 3 & 0x3) + arg6[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var22 == var74) {
                                    var21[var22++] = var26;
                                    break;
                                }
                                if (var21[var74] == var26) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class16 var75 = class236.method1672(var29 - 1, 29813);
                        if (var75.field297 && var75.field295 != -1) {
                            var25 = class287.field4839[(arg2[var13][var14 - 1] & 0x3) + arg6[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var22 == var76) {
                                    var21[var22++] = var29;
                                    break;
                                }
                                if (var21[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class16 var77 = class236.method1672(var30 - 1, arg3 ^ 0xFFFF8B9C);
                        if (var77.field297 && var77.field295 != -1) {
                            var28 = class287.field4839[arg6[var13 + 1][var14] * 4 + (arg2[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var22 == var78) {
                                    var21[var22++] = var30;
                                    break;
                                }
                                if (var21[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var22; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class301.field5081[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class301.field5081[var26 == var80 ? var24 : 0];
                        boolean[] var83 = class301.field5081[var30 == var80 ? var28 : 0];
                        boolean[] var84 = class301.field5081[var29 == var80 ? var25 : 0];
                        class16 var85 = class236.method1672(var80 - 1, 29813);
                        class56 var86 = class68.method494(var12, -389482464, var85);
                        var86.field875 += 5;
                        var86.field875 += var81.length - 2;
                        var86.field875 += var82.length - 2;
                        var86.field875 += var84.length - 2;
                        var86.field875 += var83.length - 2;
                        var86.field869++;
                    }
                }
            }
        }
        for (class56 var87 = (class56) var12.method1379(true); var87 != null; var87 = (class56) var12.method1380((byte) 66)) {
            var87.method425();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg10[arg7][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg10[1][var88][var89] & 0x2) == 2 && arg7 > 0) {
                    var90 = arg7 - 1;
                } else {
                    var90 = arg7;
                }
                int var91 = arg4[var88][var89] & 0xFF;
                int var92 = arg11[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class16 var93 = class236.method1672(var91 - 1, 29813);
                    if (var93.field295 == -1) {
                        continue;
                    }
                    class56 var94 = class68.method494(var12, -389482464, var93);
                    byte var95 = arg6[var88][var89];
                    byte var96 = arg2[var88][var89];
                    int var97 = class149.method937(arg9[var88][var89], var93.field283, var93.field295, (byte) -49);
                    int var98 = class149.method937(arg9[var88 + 1][var89], var93.field283, var93.field295, (byte) -80);
                    int var99 = class149.method937(arg9[var88 + 1][var89 + 1], var93.field283, var93.field295, (byte) -73);
                    int var100 = class149.method937(arg9[var88][var89 + 1], var93.field283, var93.field295, (byte) -83);
                    class289.method1955(var97, var99, var96, arg8, arg5, arg0, var94, var100, (byte) -109, var98, var95, var90, var88, var89, var92 != 0 && var93.field297, arg1);
                }
                if ((arg11[var88][var89] & 0xFF) != 0 || var91 != 0 && arg6[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int var103 = 0;
                    int[] var104 = new int[8];
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg4[var88 - 1][var89] & 0xFF;
                    int var108 = arg4[var88][var89 + 1] & 0xFF;
                    int var109 = arg4[var88][var89 - 1] & 0xFF;
                    int var110 = arg4[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg4[var88 + 1][var89] & 0xFF;
                    int var112 = arg4[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg4[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg4[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var91 == var110) {
                        var110 = 0;
                    } else {
                        class16 var115 = class236.method1672(var110 - 1, 29813);
                        if (var115.field297 && var115.field295 != -1) {
                            byte var116 = arg2[var88 - 1][var89 + 1];
                            byte var117 = arg6[var88 - 1][var89 + 1];
                            int var118 = class287.field4839[var117 * 4 + (var116 + 2 & 0x3)];
                            int var119 = class287.field4839[(var116 + 3 & 0x3) + var117 * 4];
                            if (class301.field5081[var119][1] && class301.field5081[var118][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var104[var101++] = var110;
                                        break;
                                    }
                                    if (var104[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class16 var121 = class236.method1672(var112 - 1, 29813);
                        if (var121.field297 && var121.field295 != -1) {
                            byte var122 = arg2[var88 - 1][var89 - 1];
                            byte var123 = arg6[var88 - 1][var89 - 1];
                            int var124 = class287.field4839[var123 * 4 + (var122 & 0x3)];
                            int var125 = class287.field4839[(var122 + 3 & 0x3) + var123 * 4];
                            if (class301.field5081[var124][1] && class301.field5081[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var104[var101++] = var112;
                                        break;
                                    }
                                    if (var104[var126] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var113 == 0 || var91 == var113) {
                        var113 = 0;
                    } else {
                        class16 var127 = class236.method1672(var113 - 1, 29813);
                        if (var127.field297 && var127.field295 != -1) {
                            byte var128 = arg2[var88 + 1][var89 - 1];
                            byte var129 = arg6[var88 + 1][var89 - 1];
                            int var130 = class287.field4839[var129 * 4 + (var128 & 0x3)];
                            int var131 = class287.field4839[(var128 + 1 & 0x3) + var129 * 4];
                            if (class301.field5081[var131][1] && class301.field5081[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var104[var101++] = var113;
                                        break;
                                    }
                                    if (var104[var132] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var114 == 0 || var91 == var114) {
                        var114 = 0;
                    } else {
                        class16 var133 = class236.method1672(var114 - 1, arg3 + 29836);
                        if (var133.field297 && var133.field295 != -1) {
                            byte var134 = arg2[var88 + 1][var89 + 1];
                            byte var135 = arg6[var88 + 1][var89 + 1];
                            int var136 = class287.field4839[var135 * 4 + (var134 + 2 & 0x3)];
                            int var137 = class287.field4839[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class301.field5081[var136][1] && class301.field5081[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var104[var101++] = var114;
                                        break;
                                    }
                                    if (var104[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class16 var139 = class236.method1672(var108 - 1, 29813);
                        if (var139.field297 && var139.field295 != -1) {
                            var105 = class287.field4839[(arg2[var88][var89 + 1] + 2 & 0x3) + arg6[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var104[var101++] = var108;
                                    break;
                                }
                                if (var104[var140] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class16 var141 = class236.method1672(var107 - 1, 29813);
                        if (var141.field297 && var141.field295 != -1) {
                            var102 = class287.field4839[(arg2[var88 - 1][var89] + 3 & 0x3) + arg6[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var104[var101++] = var107;
                                    break;
                                }
                                if (var104[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class16 var143 = class236.method1672(var109 - 1, arg3 + 29836);
                        if (var143.field297 && var143.field295 != -1) {
                            var103 = class287.field4839[(arg2[var88][var89 - 1] & 0x3) + arg6[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var104[var101++] = var109;
                                    break;
                                }
                                if (var104[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var91 != var111) {
                        class16 var145 = class236.method1672(var111 - 1, arg3 + 29836);
                        if (var145.field297 && var145.field295 != -1) {
                            var106 = class287.field4839[arg6[var88 + 1][var89] * 4 + (arg2[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var104[var101++] = var111;
                                    break;
                                }
                                if (var104[var146] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var104[var147];
                        boolean[] var149 = class301.field5081[var108 == var148 ? var105 : 0];
                        boolean[] var150 = class301.field5081[var107 == var148 ? var102 : 0];
                        boolean[] var151 = class301.field5081[var111 == var148 ? var106 : 0];
                        boolean[] var152 = class301.field5081[var109 == var148 ? var103 : 0];
                        class16 var153 = class236.method1672(var148 - 1, 29813);
                        class56 var154 = class68.method494(var12, -389482464, var153);
                        int var155 = class149.method937(arg9[var88][var89], var153.field283, var153.field295, (byte) -76) << 8 | 0xFF;
                        int var156 = class149.method937(arg9[var88 + 1][var89], var153.field283, var153.field295, (byte) -96) << 8 | 0xFF;
                        int var157 = class149.method937(arg9[var88 + 1][var89 + 1], var153.field283, var153.field295, (byte) -58) << 8 | 0xFF;
                        byte var158 = 6;
                        int var159 = class149.method937(arg9[var88][var89 + 1], var153.field283, var153.field295, (byte) -112) << 8 | 0xFF;
                        int var160 = var149.length + var158 - 2;
                        int var161 = var150.length + var160 - 2;
                        int var162 = var152.length + var161 - 2;
                        int var163 = var151.length + var162 - 2;
                        boolean var164 = var112 != var148 && var152[0] && var150[1];
                        boolean var165 = var110 != var148 && var150[0] && var149[1];
                        int[] var166 = new int[var163];
                        byte var167 = 0;
                        boolean var168 = var114 != var148 && var149[0] && var151[1];
                        boolean var169 = var113 != var148 && var151[0] && var152[1];
                        int var170 = class297.method2000(arg1, var156, arg3 + 24, 64, (int[][]) null, var155, arg5, 64, true, var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        int var171 = class297.method2000(arg1, var156, 1, 0, (int[][]) null, var155, arg5, 128, var165, var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        int var172 = class297.method2000(arg1, var156, arg3 + 24, 128, (int[][]) null, var155, arg5, 128, var168, var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        int var173 = class297.method2000(arg1, var156, 1, 0, (int[][]) null, var155, arg5, 0, var164, var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        int var174 = class297.method2000(arg1, var156, arg3 + 24, 128, (int[][]) null, var155, arg5, 0, var169, var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        int var180 = var167 + 1;
                        var166[var167] = var170;
                        var166[var180++] = var172;
                        if (var149.length > 2) {
                            var166[var180++] = class297.method2000(arg1, var156, 1, 64, (int[][]) null, var155, arg5, 128, var149[2], var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        }
                        var166[var180++] = var171;
                        if (var150.length > 2) {
                            var166[var180++] = class297.method2000(arg1, var156, 1, 0, (int[][]) null, var155, arg5, 64, var150[2], var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        }
                        var166[var180++] = var173;
                        if (var152.length > 2) {
                            var166[var180++] = class297.method2000(arg1, var156, 1, 64, (int[][]) null, var155, arg5, 0, var152[2], var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        }
                        var166[var180++] = var174;
                        if (var151.length > 2) {
                            var166[var180++] = class297.method2000(arg1, var156, class259.method1798(arg3, -24), 128, (int[][]) null, var155, arg5, 64, var151[2], var159, var89, var154, arg8, var88, arg0, 0, 0.0F, var157);
                        }
                        var166[var180++] = var172;
                        var154.method428(var90, var88, var89, var166, (int[]) null, true);
                    }
                }
            }
        }
        for (class56 var175 = (class56) var12.method1379(true); var175 != null; var175 = (class56) var12.method1380((byte) 66)) {
            if (var175.field885 == 0) {
                var175.method1997(arg3 - 27358);
            } else {
                var175.method423();
            }
        }
        int var176 = var12.method1375(arg3 ^ 0xFFFFCD8D);
        class56[] var177 = new class56[var176];
        var12.method1374(var177, -120);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field5004;
        }
        class106.method670(var177, false, var178);
        return var177;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 1294)
    public class248() {
        super(2, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILnc;)V", line = 1313)
    public static final void method1734(int arg0, int arg1, class12 arg2) {
        if (class50.field784 < arg2.field198) {
            class281.method1903(arg1 ^ 0x2FF, arg2);
        } else if (arg2.field231 >= class50.field784) {
            class301.method2042(arg2, arg1 ^ 0xFFFF8400);
        } else {
            class153.method965(arg1 ^ 0xFFFFFF1F, arg2);
        }
        if (arg2.field178 < 128 || arg2.field211 < 128 || arg2.field178 >= 13184 || arg2.field211 >= 13184) {
            arg2.field238 = -1;
            arg2.field178 = arg2.field175[0] * 128 + arg2.field226 * 64;
            arg2.field198 = 0;
            arg2.field222 = -1;
            arg2.field211 = arg2.field186[0] * 128 + arg2.field226 * 64;
            arg2.field231 = 0;
            arg2.method118((byte) -92);
        }
        field4109++;
        if (class151.field2183 == arg2 && (arg2.field178 < 1536 || arg2.field211 < 1536 || arg2.field178 >= 11776 || arg2.field211 >= 11776)) {
            arg2.field198 = 0;
            arg2.field231 = 0;
            arg2.field222 = -1;
            arg2.field178 = arg2.field175[0] * 128 + arg2.field226 * 64;
            arg2.field211 = arg2.field186[0] * 128 + arg2.field226 * 64;
            arg2.field238 = -1;
            arg2.method118((byte) -92);
        }
        class219.method1491((byte) 113, arg2);
        if (arg1 != 255) {
            field4114 = (class158) null;
        }
        class10.method106(arg2, 22896);
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V", line = 1369)
    public static final void method1735(int arg0) {
        field4108++;
        if (arg0 > -72) {
            return;
        }
        while (true) {
            class218 var1 = class29.field477;
            class119 var2;
            synchronized (class29.field477) {
                var2 = (class119) class267.field4578.method1481(true);
            }
            if (var2 == null) {
                return;
            }
            var2.field1797.method1021(var2.field1799, -27430, false, var2.field1795, (int) var2.field5004);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[I", line = 1404)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 >= -58) {
            field4114 = (class158) null;
        }
        int[] var3 = this.field4501.method1176(arg1, 125);
        field4107++;
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, arg1, -98);
            int[] var5 = this.method1815(1, arg1, 103);
            int var6 = this.field4104;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class226.field3716; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class226.field3716; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var7 = 0; var7 < class226.field3716; var7++) {
                    var3[var7] = var4[var7] * var5[var7] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class226.field3716; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var28 = 0; var28 < class226.field3716; var28++) {
                    var3[var28] = 4096 - ((4096 - var4[var28]) * (4096 - var5[var28]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var10 = 0; var10 < class226.field3716; var10++) {
                    int var11 = var5[var10];
                    var3[var10] = var11 >= 2048 ? 4096 - ((4096 - var4[var10]) * (4096 - var11) >> 11) : var4[var10] * var11 >> 11;
                }
            } else if (var6 == 7) {
                for (int var26 = 0; var26 < class226.field3716; var26++) {
                    int var27 = var4[var26];
                    var3[var26] = var27 == 4096 ? 4096 : (var5[var26] << 12) / (4096 - var27);
                }
            } else if (var6 == 8) {
                for (int var24 = 0; var24 < class226.field3716; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 0 ? 0 : 4096 - ((4096 - var5[var24] << 12) / var25);
                }
            } else if (var6 == 9) {
                for (int var12 = 0; var12 < class226.field3716; var12++) {
                    int var13 = var5[var12];
                    int var14 = var4[var12];
                    var3[var12] = var14 < var13 ? var14 : var13;
                }
            } else if (var6 == 10) {
                for (int var15 = 0; var15 < class226.field3716; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var17 > var16 ? var17 : var16;
                }
            } else if (var6 == 11) {
                for (int var21 = 0; var21 < class226.field3716; var21++) {
                    int var22 = var4[var21];
                    int var23 = var5[var21];
                    var3[var21] = var22 > var23 ? var22 - var23 : -var22 + var23;
                }
            } else if (var6 == 12) {
                for (int var18 = 0; var18 < class226.field3716; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var20 + var19 - (var19 * var20 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "j", descriptor = "(I)V", line = 1647)
    public static void method1736(int arg0) {
        int var1 = -37 % ((37 - arg0) / 40);
        field4101 = null;
        field4102 = (int[][][]) null;
        field4113 = null;
        field4112 = null;
        field4114 = null;
        field4103 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILii;)V", line = 1665)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field4110++;
        if (arg1 > -27) {
            return;
        }
        if (arg0 == 0) {
            this.field4104 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field4496 = arg2.method1509(true) == 1;
        }
    }
}
