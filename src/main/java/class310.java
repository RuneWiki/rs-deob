import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class310 extends class17 {

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    private int field5359 = 2048;

    @OriginalMember(owner = "client!ug", name = "mb", descriptor = "I")
    private int field5367 = 10;

    @OriginalMember(owner = "client!ug", name = "jb", descriptor = "I")
    private int field5364 = 0;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    public static int field5356 = 0;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "Lsf;")
    public static class108 field5358 = class140.method973(255, "www)2wtqa");

    @OriginalMember(owner = "client!ug", name = "ib", descriptor = "Z")
    public static boolean field5363 = false;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!ug", name = "kb", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!ug", name = "lb", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ug", name = "nb", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "[I")
    private int[] field5355;

    @OriginalMember(owner = "client!ug", name = "ob", descriptor = "[I")
    private int[] field5369;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)[I", line = 4)
    public final int[] method120(int arg0, int arg1) {
        field5365++;
        int[] var3 = this.field217.method1698(122, arg1);
        if (this.field217.field4295) {
            int var4 = class36.field504[arg1];
            if (this.field5364 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field5367; var6++) {
                    if (var4 >= this.field5369[var6] && var4 < this.field5369[var6 + 1]) {
                        if (this.field5355[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class23.method155(var3, 0, class116.field2008, var5);
            } else {
                for (int var7 = 0; var7 < class116.field2008; var7++) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class61.field979[var7];
                    int var11 = this.field5364;
                    if (var11 == 1) {
                        var8 = var10;
                    } else if (var11 == 2) {
                        var8 = (var10 + var4 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var10 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field5367; var12++) {
                        if (var8 >= this.field5369[var12] && this.field5369[var12 + 1] > var8) {
                            if (var8 < this.field5355[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return arg0 > -95 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([[FI[[I[[B[[B[[B[[F[[I[[BI[[F[[[B)[Lcl;", line = 122)
    public static final class133[] method2161(float[][] arg0, int arg1, int[][] arg2, byte[][] arg3, byte[][] arg4, byte[][] arg5, float[][] arg6, int[][] arg7, byte[][] arg8, int arg9, float[][] arg10, byte[][][] arg11) {
        class242 var12 = new class242(128);
        field5360++;
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg4[var13][var14] & 0xFF;
                int var16 = arg8[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class7 var17 = class290.method2071((byte) -16, var16 - 1);
                    if (var17.field89 == -1) {
                        continue;
                    }
                    class133 var18 = class115.method821(var17, (byte) -58, var12);
                    byte var19 = arg5[var13][var14];
                    int[] var20 = class14.field166[var19];
                    var18.field2278 += var20.length / 2;
                    var18.field2277++;
                    if (var17.field78 && var15 != 0) {
                        var18.field2278 += class199.field3583[var19];
                    }
                }
                if ((arg4[var13][var14] & 0xFF) != 0 || var16 != 0 && arg5[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg8[var13][var14 + 1] & 0xFF;
                    int var28 = arg8[var13][var14 - 1] & 0xFF;
                    int var29 = arg8[var13 - 1][var14 - 1] & 0xFF;
                    int var30 = arg8[var13 + 1][var14 - 1] & 0xFF;
                    int var31 = arg8[var13 + 1][var14] & 0xFF;
                    int var32 = arg8[var13 + 1][var14 + 1] & 0xFF;
                    int var33 = arg8[var13 - 1][var14 + 1] & 0xFF;
                    int var34 = arg8[var13 - 1][var14] & 0xFF;
                    if (var33 == 0 || var16 == var33) {
                        boolean var43 = false;
                    } else {
                        class7 var35 = class290.method2071((byte) -16, var33 - 1);
                        if (var35.field78 && var35.field89 != -1) {
                            byte var36 = arg3[var13 - 1][var14 + 1];
                            byte var37 = arg5[var13 - 1][var14 + 1];
                            int var38 = class299.field5198[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class299.field5198[var37 * 4 + (var36 + 2 & 0x3)];
                            if (class64.field1034[var38][1] && class64.field1034[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var22 == var41) {
                                        var21[var22++] = var33;
                                        break;
                                    }
                                    if (var21[var41] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var29 == 0 || var16 == var29) {
                        boolean var52 = false;
                    } else {
                        class7 var44 = class290.method2071((byte) -16, var29 - 1);
                        if (var44.field78 && var44.field89 != -1) {
                            byte var45 = arg5[var13 - 1][var14 - 1];
                            byte var46 = arg3[var13 - 1][var14 - 1];
                            int var47 = class299.field5198[(var46 & 0x3) + var45 * 4];
                            int var48 = class299.field5198[(var46 + 3 & 0x3) + var45 * 4];
                            if (class64.field1034[var47][1] && class64.field1034[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var22 == var50) {
                                        var21[var22++] = var29;
                                        break;
                                    }
                                    if (var21[var50] == var29) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var30 == 0 || var16 == var30) {
                        boolean var61 = false;
                    } else {
                        class7 var53 = class290.method2071((byte) -16, var30 - 1);
                        if (var53.field78 && var53.field89 != -1) {
                            byte var54 = arg3[var13 + 1][var14 - 1];
                            byte var55 = arg5[var13 + 1][var14 - 1];
                            int var56 = class299.field5198[var55 * 4 + (var54 & 0x3)];
                            int var57 = class299.field5198[var55 * 4 + (var54 + 1 & 0x3)];
                            if (class64.field1034[var57][1] && class64.field1034[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var22 == var59) {
                                        var21[var22++] = var30;
                                        break;
                                    }
                                    if (var21[var59] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var70 = false;
                    } else {
                        class7 var62 = class290.method2071((byte) -16, var32 - 1);
                        if (var62.field78 && var62.field89 != -1) {
                            byte var63 = arg3[var13 + 1][var14 + 1];
                            byte var64 = arg5[var13 + 1][var14 + 1];
                            int var65 = class299.field5198[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class299.field5198[(var63 + 1 & 0x3) + var64 * 4];
                            if (class64.field1034[var65][1] && class64.field1034[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var22 == var68) {
                                        var21[var22++] = var32;
                                        break;
                                    }
                                    if (var21[var68] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class7 var71 = class290.method2071((byte) -16, var27 - 1);
                        if (var71.field78 && var71.field89 != -1) {
                            var25 = class299.field5198[(arg3[var13][var14 + 1] + 2 & 0x3) + arg5[var13][var14 + 1] * 4];
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
                    if (var34 != 0 && var16 != var34) {
                        class7 var73 = class290.method2071((byte) -16, var34 - 1);
                        if (var73.field78 && var73.field89 != -1) {
                            var23 = class299.field5198[(arg3[var13 - 1][var14] + 3 & 0x3) + arg5[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var22 == var74) {
                                    var21[var22++] = var34;
                                    break;
                                }
                                if (var21[var74] == var34) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class7 var75 = class290.method2071((byte) -16, var28 - 1);
                        if (var75.field78 && var75.field89 != -1) {
                            var24 = class299.field5198[(arg3[var13][var14 - 1] & 0x3) + arg5[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var22 == var76) {
                                    var21[var22++] = var28;
                                    break;
                                }
                                if (var21[var76] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var31 != 0 && var16 != var31) {
                        class7 var77 = class290.method2071((byte) -16, var31 - 1);
                        if (var77.field78 && var77.field89 != -1) {
                            var26 = class299.field5198[(arg3[var13 + 1][var14] + 1 & 0x3) + arg5[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var22 == var78) {
                                    var21[var22++] = var31;
                                    break;
                                }
                                if (var21[var78] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var22; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class64.field1034[var27 == var80 ? var25 : 0];
                        boolean[] var82 = class64.field1034[var28 == var80 ? var24 : 0];
                        boolean[] var83 = class64.field1034[var31 == var80 ? var26 : 0];
                        boolean[] var84 = class64.field1034[var34 == var80 ? var23 : 0];
                        class7 var85 = class290.method2071((byte) -16, var80 - 1);
                        class133 var86 = class115.method821(var85, (byte) -58, var12);
                        var86.field2278 += 5;
                        var86.field2278 += var81.length - 2;
                        var86.field2278 += var84.length - 2;
                        var86.field2278 += var82.length - 2;
                        var86.field2278 += var83.length - 2;
                        var86.field2277++;
                    }
                }
            }
        }
        for (class133 var87 = (class133) var12.method1672(0); var87 != null; var87 = (class133) var12.method1678(-8)) {
            var87.method913();
        }
        if (arg1 != 26702) {
            return (class133[]) null;
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg11[arg9][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg11[1][var88][var89] & 0x2) == 2 && arg9 > 0) {
                    var90 = arg9 - 1;
                } else {
                    var90 = arg9;
                }
                int var91 = arg4[var88][var89] & 0xFF;
                int var92 = arg8[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class7 var93 = class290.method2071((byte) -16, var92 - 1);
                    if (var93.field89 == -1) {
                        continue;
                    }
                    class133 var94 = class115.method821(var93, (byte) -58, var12);
                    byte var95 = arg5[var88][var89];
                    byte var96 = arg3[var88][var89];
                    int var97 = class73.method485(arg2[var88][var89], true, var93.field89, var93.field77);
                    int var98 = class73.method485(arg2[var88 + 1][var89], true, var93.field89, var93.field77);
                    int var99 = class73.method485(arg2[var88 + 1][var89 + 1], true, var93.field89, var93.field77);
                    int var100 = class73.method485(arg2[var88][var89 + 1], true, var93.field89, var93.field77);
                    class143.method987(var89, arg7, var90, var91 != 0 && var93.field78, var95, var100, var96, var94, var88, arg10, arg0, var98, arg6, var99, (byte) 121, var97);
                }
                if ((arg4[var88][var89] & 0xFF) != 0 || var92 != 0 && arg5[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg8[var88][var89 + 1] & 0xFF;
                    int var108 = arg8[var88 - 1][var89] & 0xFF;
                    int var109 = arg8[var88][var89 - 1] & 0xFF;
                    int var110 = arg8[var88 + 1][var89] & 0xFF;
                    int var111 = arg8[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg8[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg8[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg8[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class7 var115 = class290.method2071((byte) -16, var111 - 1);
                        if (var115.field78 && var115.field89 != -1) {
                            byte var116 = arg5[var88 - 1][var89 + 1];
                            byte var117 = arg3[var88 - 1][var89 + 1];
                            int var118 = class299.field5198[(var117 + 2 & 0x3) + var116 * 4];
                            int var119 = class299.field5198[(var117 + 3 & 0x3) + var116 * 4];
                            if (class64.field1034[var119][1] && class64.field1034[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var111;
                                        break;
                                    }
                                    if (var102[var120] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class7 var121 = class290.method2071((byte) -16, var112 - 1);
                        if (var121.field78 && var121.field89 != -1) {
                            byte var122 = arg3[var88 - 1][var89 - 1];
                            byte var123 = arg5[var88 - 1][var89 - 1];
                            int var124 = class299.field5198[var123 * 4 + (var122 & 0x3)];
                            int var125 = class299.field5198[var123 * 4 + (var122 + 3 & 0x3)];
                            if (class64.field1034[var124][1] && class64.field1034[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var126] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class7 var127 = class290.method2071((byte) -16, var113 - 1);
                        if (var127.field78 && var127.field89 != -1) {
                            byte var128 = arg3[var88 + 1][var89 - 1];
                            byte var129 = arg5[var88 + 1][var89 - 1];
                            int var130 = class299.field5198[(var128 & 0x3) + var129 * 4];
                            int var131 = class299.field5198[(var128 + 1 & 0x3) + var129 * 4];
                            if (class64.field1034[var131][1] && class64.field1034[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var113;
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
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class7 var133 = class290.method2071((byte) -16, var114 - 1);
                        if (var133.field78 && var133.field89 != -1) {
                            byte var134 = arg3[var88 + 1][var89 + 1];
                            byte var135 = arg5[var88 + 1][var89 + 1];
                            int var136 = class299.field5198[(var134 + 1 & 0x3) + var135 * 4];
                            int var137 = class299.field5198[(var134 + 2 & 0x3) + var135 * 4];
                            if (class64.field1034[var137][1] && class64.field1034[var136][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class7 var139 = class290.method2071((byte) -16, var107 - 1);
                        if (var139.field78 && var139.field89 != -1) {
                            var103 = class299.field5198[(arg3[var88][var89 + 1] + 2 & 0x3) + arg5[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class7 var141 = class290.method2071((byte) -16, var108 - 1);
                        if (var141.field78 && var141.field89 != -1) {
                            var104 = class299.field5198[(arg3[var88 - 1][var89] + 3 & 0x3) + arg5[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class7 var143 = class290.method2071((byte) -16, var109 - 1);
                        if (var143.field78 && var143.field89 != -1) {
                            var105 = class299.field5198[(arg3[var88][var89 - 1] & 0x3) + arg5[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var109;
                                    break;
                                }
                                if (var102[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class7 var145 = class290.method2071((byte) -16, var110 - 1);
                        if (var145.field78 && var145.field89 != -1) {
                            var106 = class299.field5198[(arg3[var88 + 1][var89] + 1 & 0x3) + arg5[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class64.field1034[var107 == var148 ? var103 : 0];
                        boolean[] var150 = class64.field1034[var108 == var148 ? var104 : 0];
                        boolean[] var151 = class64.field1034[var109 == var148 ? var105 : 0];
                        boolean[] var152 = class64.field1034[var110 == var148 ? var106 : 0];
                        class7 var153 = class290.method2071((byte) -16, var148 - 1);
                        class133 var154 = class115.method821(var153, (byte) -58, var12);
                        int var155 = class73.method485(arg2[var88][var89], true, var153.field89, var153.field77) << 8 | 0xFF;
                        byte var156 = 6;
                        int var157 = class73.method485(arg2[var88 + 1][var89], true, var153.field89, var153.field77) << 8 | 0xFF;
                        int var158 = class73.method485(arg2[var88 + 1][var89 + 1], true, var153.field89, var153.field77) << 8 | 0xFF;
                        int var159 = class73.method485(arg2[var88][var89 + 1], true, var153.field89, var153.field77) << 8 | 0xFF;
                        int var160 = var149.length + var156 - 2;
                        int var161 = var150.length + var160 - 2;
                        boolean var162 = var111 != var148 && var150[0] && var149[1];
                        int var163 = var151.length + var161 - 2;
                        int var164 = var152.length + var163 - 2;
                        boolean var165 = var114 != var148 && var149[0] && var152[1];
                        int[] var166 = new int[var164];
                        byte var167 = 0;
                        boolean var168 = var112 != var148 && var151[0] && var150[1];
                        boolean var169 = var113 != var148 && var152[0] && var151[1];
                        int var170 = class121.method846(arg6, arg7, -31999, (int[][]) null, 0, true, var157, 64, arg10, var158, arg0, var89, var155, 0.0F, 64, var154, var159, var88);
                        int var171 = class121.method846(arg6, arg7, -31999, (int[][]) null, 0, var162, var157, 0, arg10, var158, arg0, var89, var155, 0.0F, 128, var154, var159, var88);
                        int var172 = class121.method846(arg6, arg7, -31999, (int[][]) null, 0, var165, var157, 128, arg10, var158, arg0, var89, var155, 0.0F, 128, var154, var159, var88);
                        int var173 = class121.method846(arg6, arg7, -31999, (int[][]) null, 0, var168, var157, 0, arg10, var158, arg0, var89, var155, 0.0F, 0, var154, var159, var88);
                        int var174 = class121.method846(arg6, arg7, arg1 - 58701, (int[][]) null, 0, var169, var157, 128, arg10, var158, arg0, var89, var155, 0.0F, 0, var154, var159, var88);
                        int var180 = var167 + 1;
                        var166[var167] = var170;
                        var166[var180++] = var172;
                        if (var149.length > 2) {
                            var166[var180++] = class121.method846(arg6, arg7, -31999, (int[][]) null, 0, var149[2], var157, 64, arg10, var158, arg0, var89, var155, 0.0F, 128, var154, var159, var88);
                        }
                        var166[var180++] = var171;
                        if (var150.length > 2) {
                            var166[var180++] = class121.method846(arg6, arg7, -31999, (int[][]) null, 0, var150[2], var157, 0, arg10, var158, arg0, var89, var155, 0.0F, 64, var154, var159, var88);
                        }
                        var166[var180++] = var173;
                        if (var151.length > 2) {
                            var166[var180++] = class121.method846(arg6, arg7, class84.method565(arg1, -5297), (int[][]) null, 0, var151[2], var157, 64, arg10, var158, arg0, var89, var155, 0.0F, 0, var154, var159, var88);
                        }
                        var166[var180++] = var174;
                        if (var152.length > 2) {
                            var166[var180++] = class121.method846(arg6, arg7, -31999, (int[][]) null, 0, var152[2], var157, 128, arg10, var158, arg0, var89, var155, 0.0F, 64, var154, var159, var88);
                        }
                        var166[var180++] = var172;
                        var154.method914(var90, var88, var89, var166, (int[]) null, true);
                    }
                }
            }
        }
        for (class133 var175 = (class133) var12.method1672(0); var175 != null; var175 = (class133) var12.method1678(25)) {
            if (var175.field2292 == 0) {
                var175.method1325(0);
            } else {
                var175.method916();
            }
        }
        int var176 = var12.method1675(true);
        long[] var177 = new long[var176];
        class133[] var178 = new class133[var176];
        var12.method1683(var178, (byte) 113);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field3375;
        }
        class143.method984(var178, var177, 128);
        return var178;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLrm;I)V", line = 1056)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field5366++;
        if (arg2 == 0) {
            this.field5367 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field5359 = arg1.method1712(-1);
        } else if (arg2 == 2) {
            this.field5364 = arg1.method1731(true);
        }
        if (arg0 != -114) {
            this.method2165(89);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JB)V", line = 1117)
    public static final void method2162(long arg0, byte arg1) {
        field5361++;
        class256.field4471.field4314 = 0;
        class256.field4471.method1759(-32768, 75);
        int var3 = 41 / ((arg1 + 32) / 41);
        class256.field4471.method1735((byte) -87, arg0);
        class287.field5022 = 1;
        class1.field26 = 0;
        class98.field1603 = 0;
        class15.field196 = -3;
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)V", line = 1133)
    public static void method2163(int arg0) {
        if (arg0 == 0) {
            field5358 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lrm;I)Lqa;", line = 1151)
    public static final class130 method2164(class249 arg0, int arg1) {
        if (arg1 != 0) {
            field5358 = (class108) null;
        }
        field5357++;
        class130 var2 = new class130();
        var2.field2231 = arg0.method1712(~arg1);
        var2.field2223 = class36.method248(var2.field2231, -4394);
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 1230)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)V", line = 1178)
    private final void method2165(int arg0) {
        this.field5369 = new int[this.field5367 + 1];
        this.field5355 = new int[this.field5367 + 1];
        field5362++;
        int var2 = 0;
        int var3 = 4096 / this.field5367;
        int var4 = this.field5359 * var3 >> 12;
        for (int var5 = 0; var5 < this.field5367; var5++) {
            this.field5369[var5] = var2;
            this.field5355[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 == -28573) {
            this.field5369[this.field5367] = 4096;
            this.field5355[this.field5367] = this.field5355[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V", line = 1216)
    public final void method116(boolean arg0) {
        if (arg0) {
            this.method2165(-28573);
            field5368++;
        }
    }
}
