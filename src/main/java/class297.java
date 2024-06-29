import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class297 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field4769 = -1;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field4771 = 0;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
    public static int[] field4772 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljh;[I[I[IZ)V", line = 24)
    public static final void method2126(class258 arg0, int[] arg1, int[] arg2, int[] arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg0.field3539.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field3539[var9] = null;
                    } else {
                        class43 var10 = class198.method1524(var6, 69);
                        int var11 = var10.field668;
                        class194 var12 = arg0.field3539[var9];
                        if (var12 != null) {
                            if (var12.field3092 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field3539[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3090 = var8;
                                    var12.field3091 = 0;
                                    var12.field3088 = 0;
                                    var12.field3089 = 0;
                                    var12.field3087 = 1;
                                    class334.method2338(class6.field55 == arg0, arg0.field3577, arg0.field3511, 0, (byte) -13, var10);
                                } else if (var11 == 2) {
                                    var12.field3088 = 0;
                                }
                            } else if (var10.field660 >= class198.method1524(var12.field3092, 84).field660) {
                                var12 = arg0.field3539[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class194 var13 = arg0.field3539[var9] = new class194();
                            var13.field3087 = 1;
                            var13.field3089 = 0;
                            var13.field3088 = 0;
                            var13.field3091 = 0;
                            var13.field3090 = var8;
                            var13.field3092 = var6;
                            class334.method2338(class6.field55 == arg0, arg0.field3577, arg0.field3511, 0, (byte) -13, var10);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg4) {
            field4770++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 121)
    public static void method2127(boolean arg0) {
        field4772 = null;
        if (!arg0) {
            field4769 = -104;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 135)
    public static final void method2128(int arg0) {
        class208 var1 = class4.field38;
        synchronized (class4.field38) {
            class125.field2129++;
            class198.field3157 = class138.field2276;
            class333.field5275 = class294.field4743;
            class77.field1343 = class260.field4367;
            class325.field5165 = class315.field5021;
            class333.field5278 = class122.field2097;
            if (arg0 != -1) {
                return;
            }
            class229.field3812 = class350.field5548;
            class286.field4660 = class241.field3993;
            class315.field5021 = 0;
        }
        field4768++;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)I", line = 162)
    public static final int method2129(boolean arg0) {
        if (arg0) {
            field4774++;
            return class326.field5176.method2331(false);
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[[B[[F[[B[[F[[B[[II[[B[[[B[[I[[F)[Lua;", line = 173)
    public static final class299[] method2130(int arg0, byte[][] arg1, float[][] arg2, byte[][] arg3, float[][] arg4, byte[][] arg5, int[][] arg6, int arg7, byte[][] arg8, byte[][][] arg9, int[][] arg10, float[][] arg11) {
        field4773++;
        class164 var12 = new class164(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg1[var13][var14] & 0xFF;
                int var16 = arg8[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class31 var17 = class124.method974(arg7 + 28159, var15 + -1);
                    if (var17.field440 == -1) {
                        continue;
                    }
                    class299 var18 = class44.method327((byte) 96, var17, var12);
                    byte var19 = arg5[var13][var14];
                    int[] var20 = class21.field242[var19];
                    var18.field4804 += var20.length / 2;
                    var18.field4815++;
                    if (var17.field447 && var16 != 0) {
                        var18.field4804 += class113.field1853[var19];
                    }
                }
                if ((arg8[var13][var14] & 0xFF) != 0 || var15 != 0 && arg5[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg1[var13][var14 + 1] & 0xFF;
                    int var28 = arg1[var13 - 1][var14] & 0xFF;
                    int var29 = arg1[var13][var14 - 1] & 0xFF;
                    int var30 = arg1[var13 + 1][var14] & 0xFF;
                    int var31 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    if (var31 == 0 || var15 == var31) {
                        boolean var43 = false;
                    } else {
                        class31 var35 = class124.method974(-58, var31 - 1);
                        if (var35.field447 && var35.field440 != -1) {
                            byte var36 = arg5[var13 - 1][var14 + 1];
                            byte var37 = arg3[var13 - 1][var14 + 1];
                            int var38 = class113.field1859[(var37 + 2 & 0x3) + var36 * 4];
                            int var39 = class113.field1859[var36 * 4 + (var37 + 3 & 0x3)];
                            if (class273.field4524[var39][1] && class273.field4524[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var41] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var32 == 0 || var15 == var32) {
                        boolean var52 = false;
                    } else {
                        class31 var44 = class124.method974(-56, var32 - 1);
                        if (var44.field447 && var44.field440 != -1) {
                            byte var45 = arg3[var13 - 1][var14 - 1];
                            byte var46 = arg5[var13 - 1][var14 - 1];
                            int var47 = class113.field1859[(var45 & 0x3) + var46 * 4];
                            int var48 = class113.field1859[(var45 + 3 & 0x3) + var46 * 4];
                            if (class273.field4524[var47][1] && class273.field4524[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var50] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var34 == 0 || var15 == var34) {
                        boolean var61 = false;
                    } else {
                        class31 var53 = class124.method974(arg7 + 28192, var34 + -1);
                        if (var53.field447 && var53.field440 != -1) {
                            byte var54 = arg3[var13 + 1][var14 - 1];
                            byte var55 = arg5[var13 + 1][var14 - 1];
                            int var56 = class113.field1859[(var54 & 0x3) + var55 * 4];
                            int var57 = class113.field1859[(var54 + 1 & 0x3) + var55 * 4];
                            if (class273.field4524[var57][1] && class273.field4524[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var59] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var15 == var33) {
                        boolean var70 = false;
                    } else {
                        class31 var62 = class124.method974(-119, var33 - 1);
                        if (var62.field447 && var62.field440 != -1) {
                            byte var63 = arg3[var13 + 1][var14 + 1];
                            byte var64 = arg5[var13 + 1][var14 + 1];
                            int var65 = class113.field1859[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class113.field1859[var64 * 4 + (var63 + 1 & 0x3)];
                            if (class273.field4524[var65][1] && class273.field4524[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var15 != var27) {
                        class31 var71 = class124.method974(-79, var27 - 1);
                        if (var71.field447 && var71.field440 != -1) {
                            var24 = class113.field1859[(arg3[var13][var14 + 1] + 2 & 0x3) + arg5[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var15 != var28) {
                        class31 var73 = class124.method974(-116, var28 - 1);
                        if (var73.field447 && var73.field440 != -1) {
                            var23 = class113.field1859[(arg3[var13 - 1][var14] + 3 & 0x3) + arg5[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var15 != var29) {
                        class31 var75 = class124.method974(-126, var29 - 1);
                        if (var75.field447 && var75.field440 != -1) {
                            var25 = class113.field1859[(arg3[var13][var14 - 1] & 0x3) + arg5[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var15 != var30) {
                        class31 var77 = class124.method974(arg7 + 28148, var30 + -1);
                        if (var77.field447 && var77.field440 != -1) {
                            var26 = class113.field1859[(arg3[var13 + 1][var14] + 1 & 0x3) + arg5[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var30;
                                    break;
                                }
                                if (var22[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class273.field4524[var27 == var80 ? var24 : 0];
                        boolean[] var82 = class273.field4524[var28 == var80 ? var23 : 0];
                        boolean[] var83 = class273.field4524[var29 == var80 ? var25 : 0];
                        boolean[] var84 = class273.field4524[var30 == var80 ? var26 : 0];
                        class31 var85 = class124.method974(-120, var80 - 1);
                        class299 var86 = class44.method327((byte) -98, var85, var12);
                        var86.field4804 += 5;
                        var86.field4804 += var81.length - 2;
                        var86.field4804 += var82.length - 2;
                        var86.field4804 += var83.length - 2;
                        var86.field4804 += var84.length - 2;
                        var86.field4815++;
                    }
                }
            }
        }
        for (class299 var87 = (class299) var12.method1265(44); var87 != null; var87 = (class299) var12.method1277((byte) -112)) {
            var87.method2137();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg8[var88][var89] & 0xFF;
                int var91 = arg1[var88][var89] & 0xFF;
                int var92;
                if ((arg9[arg0][var88][var89] & 0x8) != 0) {
                    var92 = 0;
                } else if ((arg9[1][var88][var89] & 0x2) == 2 && arg0 > 0) {
                    var92 = arg0 - 1;
                } else {
                    var92 = arg0;
                }
                if (var91 != 0) {
                    class31 var93 = class124.method974(-54, var91 - 1);
                    if (var93.field440 == -1) {
                        continue;
                    }
                    class299 var94 = class44.method327((byte) -89, var93, var12);
                    byte var95 = arg5[var88][var89];
                    byte var96 = arg3[var88][var89];
                    int var97 = class65.method565(var93.field440, var93.field444, arg10[var88][var89], arg7 + 28265);
                    int var98 = class65.method565(var93.field440, var93.field444, arg10[var88 + 1][var89], 0);
                    int var99 = class65.method565(var93.field440, var93.field444, arg10[var88 + 1][var89 + 1], 0);
                    int var100 = class65.method565(var93.field440, var93.field444, arg10[var88][var89 + 1], 0);
                    class66.method566(var96, var88, var97, arg11, var90 != 0 && var93.field447, (byte) -100, var99, arg6, var92, arg4, var98, var100, var89, var94, var95, arg2);
                }
                if ((arg8[var88][var89] & 0xFF) != 0 || var91 != 0 && arg5[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg1[var88][var89 + 1] & 0xFF;
                    int var108 = arg1[var88 - 1][var89] & 0xFF;
                    int var109 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var110 = arg1[var88 + 1][var89] & 0xFF;
                    int var111 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    int var112 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    int var113 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg1[var88][var89 - 1] & 0xFF;
                    if (var109 == 0 || var91 == var109) {
                        var109 = 0;
                    } else {
                        class31 var115 = class124.method974(-80, var109 - 1);
                        if (var115.field447 && var115.field440 != -1) {
                            byte var116 = arg3[var88 - 1][var89 + 1];
                            byte var117 = arg5[var88 - 1][var89 + 1];
                            int var118 = class113.field1859[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class113.field1859[(var116 + 3 & 0x3) + var117 * 4];
                            if (class273.field4524[var119][1] && class273.field4524[var118][0]) {
                                var109 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var103 == var120) {
                                        var102[var103++] = var109;
                                        break;
                                    }
                                    if (var102[var120] == var109) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var109 = 0;
                        }
                    }
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class31 var121 = class124.method974(arg7 ^ 0x6E1F, var111 - 1);
                        if (var121.field447 && var121.field440 != -1) {
                            byte var122 = arg3[var88 - 1][var89 - 1];
                            byte var123 = arg5[var88 - 1][var89 - 1];
                            int var124 = class113.field1859[(var122 + 3 & 0x3) + var123 * 4];
                            int var125 = class113.field1859[(var122 & 0x3) + var123 * 4];
                            if (class273.field4524[var125][1] && class273.field4524[var124][0]) {
                                var111 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var103 == var126) {
                                        var102[var103++] = var111;
                                        break;
                                    }
                                    if (var102[var126] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var113 == 0 || var91 == var113) {
                        var113 = 0;
                    } else {
                        class31 var127 = class124.method974(-57, var113 - 1);
                        if (var127.field447 && var127.field440 != -1) {
                            byte var128 = arg3[var88 + 1][var89 - 1];
                            byte var129 = arg5[var88 + 1][var89 - 1];
                            int var130 = class113.field1859[(var128 & 0x3) + var129 * 4];
                            int var131 = class113.field1859[(var128 + 1 & 0x3) + var129 * 4];
                            if (class273.field4524[var131][1] && class273.field4524[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var103 == var132) {
                                        var102[var103++] = var113;
                                        break;
                                    }
                                    if (var102[var132] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class31 var133 = class124.method974(-57, var112 - 1);
                        if (var133.field447 && var133.field440 != -1) {
                            byte var134 = arg3[var88 + 1][var89 + 1];
                            byte var135 = arg5[var88 + 1][var89 + 1];
                            int var136 = class113.field1859[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class113.field1859[(var134 + 1 & 0x3) + var135 * 4];
                            if (class273.field4524[var136][1] && class273.field4524[var137][0]) {
                                var112 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var103 == var138) {
                                        var102[var103++] = var112;
                                        break;
                                    }
                                    if (var102[var138] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class31 var139 = class124.method974(arg7 + 28160, var107 + -1);
                        if (var139.field447 && var139.field440 != -1) {
                            var101 = class113.field1859[(arg3[var88][var89 + 1] + 2 & 0x3) + arg5[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var103 == var140) {
                                    var102[var103++] = var107;
                                    break;
                                }
                                if (var102[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class31 var141 = class124.method974(-59, var108 - 1);
                        if (var141.field447 && var141.field440 != -1) {
                            var104 = class113.field1859[(arg3[var88 - 1][var89] + 3 & 0x3) + arg5[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var103 == var142) {
                                    var102[var103++] = var108;
                                    break;
                                }
                                if (var102[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var114 != 0 && var91 != var114) {
                        class31 var143 = class124.method974(-95, var114 - 1);
                        if (var143.field447 && var143.field440 != -1) {
                            var105 = class113.field1859[(arg3[var88][var89 - 1] & 0x3) + arg5[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var103 == var144) {
                                    var102[var103++] = var114;
                                    break;
                                }
                                if (var102[var144] == var114) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class31 var145 = class124.method974(-58, var110 - 1);
                        if (var145.field447 && var145.field440 != -1) {
                            var106 = class113.field1859[(arg3[var88 + 1][var89] + 1 & 0x3) + arg5[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var103 == var146) {
                                    var102[var103++] = var110;
                                    break;
                                }
                                if (var102[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var103; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class273.field4524[var107 == var148 ? var101 : 0];
                        boolean[] var150 = class273.field4524[var108 == var148 ? var104 : 0];
                        boolean[] var151 = class273.field4524[var110 == var148 ? var106 : 0];
                        boolean[] var152 = class273.field4524[var114 == var148 ? var105 : 0];
                        class31 var153 = class124.method974(-111, var148 - 1);
                        class299 var154 = class44.method327((byte) -76, var153, var12);
                        int var155 = class65.method565(var153.field440, var153.field444, arg10[var88][var89], 0) << 8 | 0xFF;
                        byte var156 = 6;
                        int var157 = class65.method565(var153.field440, var153.field444, arg10[var88 + 1][var89], arg7 + 28265) << 8 | 0xFF;
                        int var158 = class65.method565(var153.field440, var153.field444, arg10[var88 + 1][var89 + 1], 0) << 8 | 0xFF;
                        int var159 = class65.method565(var153.field440, var153.field444, arg10[var88][var89 + 1], 0) << 8 | 0xFF;
                        boolean var160 = var112 != var148 && var149[0] && var151[1];
                        int var161 = var149.length + var156 - 2;
                        boolean var162 = var109 != var148 && var150[0] && var149[1];
                        int var163 = var150.length + var161 - 2;
                        int var164 = var152.length + var163 - 2;
                        int var165 = var151.length + var164 - 2;
                        boolean var166 = var113 != var148 && var151[0] && var152[1];
                        int[] var167 = new int[var165];
                        byte var168 = 0;
                        boolean var169 = var111 != var148 && var152[0] && var150[1];
                        int var170 = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 64, var89, var159, 0, 0.0F, true, (int[][]) null, 64, var155, var88, arg6);
                        int var171 = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 0, var89, var159, 0, 0.0F, var162, (int[][]) null, 128, var155, var88, arg6);
                        int var172 = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 128, var89, var159, 0, 0.0F, var160, (int[][]) null, 128, var155, var88, arg6);
                        int var173 = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 0, var89, var159, 0, 0.0F, var169, (int[][]) null, 0, var155, var88, arg6);
                        int var174 = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 128, var89, var159, 0, 0.0F, var166, (int[][]) null, 0, var155, var88, arg6);
                        int var180 = var168 + 1;
                        var167[var168] = var170;
                        var167[var180++] = var172;
                        if (var149.length > 2) {
                            var167[var180++] = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 64, var89, var159, 0, 0.0F, var149[2], (int[][]) null, 128, var155, var88, arg6);
                        }
                        var167[var180++] = var171;
                        if (var150.length > 2) {
                            var167[var180++] = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 0, var89, var159, 0, 0.0F, var150[2], (int[][]) null, 64, var155, var88, arg6);
                        }
                        var167[var180++] = var173;
                        if (var152.length > 2) {
                            var167[var180++] = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 64, var89, var159, 0, 0.0F, var152[2], (int[][]) null, 0, var155, var88, arg6);
                        }
                        var167[var180++] = var174;
                        if (var151.length > 2) {
                            var167[var180++] = class321.method2266(arg11, var154, var157, (byte) -21, arg2, var158, arg4, 128, var89, var159, 0, 0.0F, var151[2], (int[][]) null, 64, var155, var88, arg6);
                        }
                        var167[var180++] = var172;
                        var154.method2143(var92, var88, var89, var167, (int[]) null, true);
                    }
                }
            }
        }
        for (class299 var175 = (class299) var12.method1265(122); var175 != null; var175 = (class299) var12.method1277((byte) -110)) {
            if (var175.field4793 == 0) {
                var175.method330(15);
            } else {
                var175.method2138();
            }
        }
        if (arg7 != -28265) {
            return (class299[]) null;
        }
        int var176 = var12.method1274((byte) 122);
        long[] var177 = new long[var176];
        class299[] var178 = new class299[var176];
        var12.method1269(-6, var178);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field698;
        }
        class70.method597(var178, var177, -537);
        return var178;
    }
}
