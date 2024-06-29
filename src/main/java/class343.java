import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class343 extends class297 {

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    private int field5320 = 4;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    private int field5312 = 204;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    private int field5321 = 409;

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "I")
    private int field5326 = 1024;

    @OriginalMember(owner = "client!dj", name = "hb", descriptor = "I")
    private int field5328 = 0;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "I")
    private int field5327 = 81;

    @OriginalMember(owner = "client!dj", name = "ib", descriptor = "I")
    private int field5329 = 1024;

    @OriginalMember(owner = "client!dj", name = "lb", descriptor = "I")
    private int field5332 = 8;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field5310 = 3;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field5319 = 7759444;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    private int field5307;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    private int field5317;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!dj", name = "jb", descriptor = "I")
    private int field5330;

    @OriginalMember(owner = "client!dj", name = "kb", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "[I")
    private int[] field5308;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "[[I")
    private int[][] field5323;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "[[I")
    private int[][] field5324;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILpk;Lpk;)V", line = 4)
    public static final void method2377(int arg0, class120 arg1, class120 arg2) {
        if (arg0 == 2) {
            class147.field2408 = arg2;
            class316.field4984 = arg1;
            field5315++;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILaj;)V", line = 16)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field5311++;
        if (arg1 != 255) {
            this.field5329 = -54;
        }
        if (arg0 == 0) {
            this.field5320 = arg2.method15((byte) 86);
        } else if (arg0 == 1) {
            this.field5332 = arg2.method15((byte) -99);
        } else if (arg0 == 2) {
            this.field5321 = arg2.method56(19612);
        } else if (arg0 == 3) {
            this.field5312 = arg2.method56(19612);
        } else if (arg0 == 4) {
            this.field5326 = arg2.method56(19612);
        } else if (arg0 == 5) {
            this.field5328 = arg2.method56(19612);
        } else if (arg0 == 6) {
            this.field5327 = arg2.method56(arg1 + 19357);
        } else if (arg0 == 7) {
            this.field5329 = arg2.method56(19612);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBIIIIII)V", line = 107)
    public static final void method2378(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5306++;
        int var9 = arg5 - arg4;
        int var10 = (arg0 - arg1 << 16) / var9;
        int var11 = 110 % ((arg2 + 69) / 57);
        int var12 = arg7 - arg8;
        int var13 = (arg6 - arg3 << 16) / var12;
        class226.method1656(arg8, arg3, arg1, 0, arg4, 0, 115, var13, arg5, arg7, var10);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([[B[[B[[[B[[B[[FZ[[I[[F[[B[[FI[[I)[Ltd;", line = 127)
    public static final class256[] method2379(byte[][] arg0, byte[][] arg1, byte[][][] arg2, byte[][] arg3, float[][] arg4, boolean arg5, int[][] arg6, float[][] arg7, byte[][] arg8, float[][] arg9, int arg10, int[][] arg11) {
        field5318++;
        class3 var12 = new class3(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg8[var13][var14] & 0xFF;
                int var16 = arg0[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class183 var17 = class49.method411(var16 - 1, false);
                    if (var17.field2903 == -1) {
                        continue;
                    }
                    class256 var18 = class130.method1005(var12, -6739, var17);
                    byte var19 = arg1[var13][var14];
                    int[] var20 = class122.field1995[var19];
                    var18.field3781 += var20.length / 2;
                    var18.field3801++;
                    if (var17.field2892 && var15 != 0) {
                        var18.field3781 += class70.field1060[var19];
                    }
                }
                if ((arg8[var13][var14] & 0xFF) != 0 || var16 != 0 && arg1[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg0[var13][var14 + 1] & 0xFF;
                    int var27 = 0;
                    int var28 = arg0[var13 - 1][var14] & 0xFF;
                    int var29 = arg0[var13][var14 - 1] & 0xFF;
                    int var30 = arg0[var13 + 1][var14] & 0xFF;
                    int var31 = arg0[var13 - 1][var14 - 1] & 0xFF;
                    int var32 = arg0[var13 - 1][var14 + 1] & 0xFF;
                    int var33 = arg0[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg0[var13 + 1][var14 + 1] & 0xFF;
                    if (var32 == 0 || var16 == var32) {
                        boolean var43 = false;
                    } else {
                        class183 var35 = class49.method411(var32 - 1, false);
                        if (var35.field2892 && var35.field2903 != -1) {
                            byte var36 = arg3[var13 - 1][var14 + 1];
                            byte var37 = arg1[var13 - 1][var14 + 1];
                            int var38 = class323.field5055[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class323.field5055[(var36 + 2 & 0x3) + var37 * 4];
                            if (class264.field3914[var38][1] && class264.field3914[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var41] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var31 == 0 || var16 == var31) {
                        boolean var52 = false;
                    } else {
                        class183 var44 = class49.method411(var31 - 1, arg5);
                        if (var44.field2892 && var44.field2903 != -1) {
                            byte var45 = arg3[var13 - 1][var14 - 1];
                            byte var46 = arg1[var13 - 1][var14 - 1];
                            int var47 = class323.field5055[(var45 & 0x3) + var46 * 4];
                            int var48 = class323.field5055[var46 * 4 + (var45 + 3 & 0x3)];
                            if (class264.field3914[var47][1] && class264.field3914[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var50] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var61 = false;
                    } else {
                        class183 var53 = class49.method411(var33 - 1, false);
                        if (var53.field2892 && var53.field2903 != -1) {
                            byte var54 = arg3[var13 + 1][var14 - 1];
                            byte var55 = arg1[var13 + 1][var14 - 1];
                            int var56 = class323.field5055[var55 * 4 + (var54 & 0x3)];
                            int var57 = class323.field5055[(var54 + 1 & 0x3) + var55 * 4];
                            if (class264.field3914[var57][1] && class264.field3914[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var59] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var34 == 0 || var16 == var34) {
                        boolean var70 = false;
                    } else {
                        class183 var62 = class49.method411(var34 - 1, false);
                        if (var62.field2892 && var62.field2903 != -1) {
                            byte var63 = arg3[var13 + 1][var14 + 1];
                            byte var64 = arg1[var13 + 1][var14 + 1];
                            int var65 = class323.field5055[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class323.field5055[(var63 + 1 & 0x3) + var64 * 4];
                            if (class264.field3914[var65][1] && class264.field3914[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var26 != 0 && var16 != var26) {
                        class183 var71 = class49.method411(var26 - 1, false);
                        if (var71.field2892 && var71.field2903 != -1) {
                            var23 = class323.field5055[(arg3[var13][var14 + 1] + 2 & 0x3) + arg1[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var26;
                                    break;
                                }
                                if (var22[var72] == var26) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class183 var73 = class49.method411(var28 - 1, false);
                        if (var73.field2892 && var73.field2903 != -1) {
                            var24 = class323.field5055[arg1[var13 - 1][var14] * 4 + (arg3[var13 - 1][var14] + 3 & 0x3)];
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
                    if (var29 != 0 && var16 != var29) {
                        class183 var75 = class49.method411(var29 - 1, false);
                        if (var75.field2892 && var75.field2903 != -1) {
                            var25 = class323.field5055[(arg3[var13][var14 - 1] & 0x3) + arg1[var13][var14 - 1] * 4];
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
                    if (var30 != 0 && var16 != var30) {
                        class183 var77 = class49.method411(var30 - 1, false);
                        if (var77.field2892 && var77.field2903 != -1) {
                            var27 = class323.field5055[arg1[var13 + 1][var14] * 4 + (arg3[var13 + 1][var14] + 1 & 0x3)];
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
                        boolean[] var81 = class264.field3914[var28 == var80 ? var24 : 0];
                        boolean[] var82 = class264.field3914[var26 == var80 ? var23 : 0];
                        boolean[] var83 = class264.field3914[var29 == var80 ? var25 : 0];
                        boolean[] var84 = class264.field3914[var30 == var80 ? var27 : 0];
                        class183 var85 = class49.method411(var80 - 1, false);
                        class256 var86 = class130.method1005(var12, -6739, var85);
                        var86.field3781 += 5;
                        var86.field3781 += var82.length - 2;
                        var86.field3781 += var81.length - 2;
                        var86.field3781 += var83.length - 2;
                        var86.field3781 += var84.length - 2;
                        var86.field3801++;
                    }
                }
            }
        }
        for (class256 var87 = (class256) var12.method71((byte) -93); var87 != null; var87 = (class256) var12.method84(1)) {
            var87.method1771();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg8[var88][var89] & 0xFF;
                int var91 = arg0[var88][var89] & 0xFF;
                int var92;
                if ((arg2[arg10][var88][var89] & 0x8) != 0) {
                    var92 = 0;
                } else if ((arg2[1][var88][var89] & 0x2) == 2 && arg10 > 0) {
                    var92 = arg10 - 1;
                } else {
                    var92 = arg10;
                }
                if (var91 != 0) {
                    class183 var93 = class49.method411(var91 - 1, arg5);
                    if (var93.field2903 == -1) {
                        continue;
                    }
                    class256 var94 = class130.method1005(var12, -6739, var93);
                    byte var95 = arg1[var88][var89];
                    byte var96 = arg3[var88][var89];
                    int var97 = class174.method1287(var93.field2898, -341, arg6[var88][var89], var93.field2903);
                    int var98 = class174.method1287(var93.field2898, -341, arg6[var88 + 1][var89], var93.field2903);
                    int var99 = class174.method1287(var93.field2898, -341, arg6[var88 + 1][var89 + 1], var93.field2903);
                    int var100 = class174.method1287(var93.field2898, -341, arg6[var88][var89 + 1], var93.field2903);
                    client.method1868(var90 != 0 && var93.field2892, arg9, var95, var97, var100, var98, arg4, arg11, var88, (byte) -95, var89, var99, var92, var96, var94, arg7);
                }
                if ((arg8[var88][var89] & 0xFF) != 0 || var91 != 0 && arg1[var88][var89] == 0) {
                    int[] var101 = new int[8];
                    int var102 = 0;
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg0[var88][var89 + 1] & 0xFF;
                    int var108 = arg0[var88][var89 - 1] & 0xFF;
                    int var109 = arg0[var88 - 1][var89] & 0xFF;
                    int var110 = arg0[var88 + 1][var89] & 0xFF;
                    int var111 = arg0[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg0[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg0[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg0[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class183 var115 = class49.method411(var111 - 1, false);
                        if (var115.field2892 && var115.field2903 != -1) {
                            byte var116 = arg3[var88 - 1][var89 + 1];
                            byte var117 = arg1[var88 - 1][var89 + 1];
                            int var118 = class323.field5055[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class323.field5055[var117 * 4 + (var116 + 3 & 0x3)];
                            if (class264.field3914[var119][1] && class264.field3914[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var102 == var120) {
                                        var101[var102++] = var111;
                                        break;
                                    }
                                    if (var101[var120] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class183 var121 = class49.method411(var112 - 1, arg5);
                        if (var121.field2892 && var121.field2903 != -1) {
                            byte var122 = arg3[var88 - 1][var89 - 1];
                            byte var123 = arg1[var88 - 1][var89 - 1];
                            int var124 = class323.field5055[(var122 & 0x3) + var123 * 4];
                            int var125 = class323.field5055[(var122 + 3 & 0x3) + var123 * 4];
                            if (class264.field3914[var124][1] && class264.field3914[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var102 == var126) {
                                        var101[var102++] = var112;
                                        break;
                                    }
                                    if (var101[var126] == var112) {
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
                        class183 var127 = class49.method411(var113 - 1, arg5);
                        if (var127.field2892 && var127.field2903 != -1) {
                            byte var128 = arg3[var88 + 1][var89 - 1];
                            byte var129 = arg1[var88 + 1][var89 - 1];
                            int var130 = class323.field5055[(var128 + 1 & 0x3) + var129 * 4];
                            int var131 = class323.field5055[(var128 & 0x3) + var129 * 4];
                            if (class264.field3914[var130][1] && class264.field3914[var131][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var102 == var132) {
                                        var101[var102++] = var113;
                                        break;
                                    }
                                    if (var101[var132] == var113) {
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
                        class183 var133 = class49.method411(var114 - 1, false);
                        if (var133.field2892 && var133.field2903 != -1) {
                            byte var134 = arg3[var88 + 1][var89 + 1];
                            byte var135 = arg1[var88 + 1][var89 + 1];
                            int var136 = class323.field5055[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class323.field5055[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class264.field3914[var136][1] && class264.field3914[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var102 == var138) {
                                        var101[var102++] = var114;
                                        break;
                                    }
                                    if (var101[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class183 var139 = class49.method411(var107 - 1, arg5);
                        if (var139.field2892 && var139.field2903 != -1) {
                            var104 = class323.field5055[(arg3[var88][var89 + 1] + 2 & 0x3) + arg1[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var102 == var140) {
                                    var101[var102++] = var107;
                                    break;
                                }
                                if (var101[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class183 var141 = class49.method411(var109 - 1, false);
                        if (var141.field2892 && var141.field2903 != -1) {
                            var103 = class323.field5055[arg1[var88 - 1][var89] * 4 + (arg3[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var102 == var142) {
                                    var101[var102++] = var109;
                                    break;
                                }
                                if (var101[var142] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class183 var143 = class49.method411(var108 - 1, arg5);
                        if (var143.field2892 && var143.field2903 != -1) {
                            var105 = class323.field5055[arg1[var88][var89 - 1] * 4 + (arg3[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var102 == var144) {
                                    var101[var102++] = var108;
                                    break;
                                }
                                if (var101[var144] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class183 var145 = class49.method411(var110 - 1, false);
                        if (var145.field2892 && var145.field2903 != -1) {
                            var106 = class323.field5055[(arg3[var88 + 1][var89] + 1 & 0x3) + arg1[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var102 == var146) {
                                    var101[var102++] = var110;
                                    break;
                                }
                                if (var101[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var102; var147++) {
                        int var148 = var101[var147];
                        boolean[] var149 = class264.field3914[var109 == var148 ? var103 : 0];
                        boolean[] var150 = class264.field3914[var110 == var148 ? var106 : 0];
                        boolean[] var151 = class264.field3914[var108 == var148 ? var105 : 0];
                        boolean[] var152 = class264.field3914[var107 == var148 ? var104 : 0];
                        class183 var153 = class49.method411(var148 - 1, false);
                        class256 var154 = class130.method1005(var12, -6739, var153);
                        int var155 = class174.method1287(var153.field2898, -341, arg6[var88][var89], var153.field2903) << 8 | 0xFF;
                        int var156 = class174.method1287(var153.field2898, -341, arg6[var88 + 1][var89], var153.field2903) << 8 | 0xFF;
                        int var157 = class174.method1287(var153.field2898, -341, arg6[var88 + 1][var89 + 1], var153.field2903) << 8 | 0xFF;
                        int var158 = class174.method1287(var153.field2898, -341, arg6[var88][var89 + 1], var153.field2903) << 8 | 0xFF;
                        byte var159 = 6;
                        int var160 = var152.length + var159 - 2;
                        int var161 = var149.length + var160 - 2;
                        int var162 = var151.length + var161 - 2;
                        boolean var163 = var114 != var148 && var152[0] && var150[1];
                        int var164 = var150.length + var162 - 2;
                        int[] var165 = new int[var164];
                        boolean var166 = var111 != var148 && var149[0] && var152[1];
                        byte var167 = 0;
                        boolean var168 = var113 != var148 && var150[0] && var151[1];
                        boolean var169 = var112 != var148 && var151[0] && var149[1];
                        int var170 = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 64, 64, (int[][]) null, arg11, 0, -8515, true, var88, arg9, arg4, var155);
                        int var171 = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 128, 0, (int[][]) null, arg11, 0, -8515, var166, var88, arg9, arg4, var155);
                        int var172 = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 128, 128, (int[][]) null, arg11, 0, -8515, var163, var88, arg9, arg4, var155);
                        int var173 = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 0, 0, (int[][]) null, arg11, 0, -8515, var169, var88, arg9, arg4, var155);
                        int var174 = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 0, 128, (int[][]) null, arg11, 0, -8515, var168, var88, arg9, arg4, var155);
                        int var180 = var167 + 1;
                        var165[var167] = var170;
                        var165[var180++] = var172;
                        if (var152.length > 2) {
                            var165[var180++] = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 128, 64, (int[][]) null, arg11, 0, -8515, var152[2], var88, arg9, arg4, var155);
                        }
                        var165[var180++] = var171;
                        if (var149.length > 2) {
                            var165[var180++] = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 64, 0, (int[][]) null, arg11, 0, -8515, var149[2], var88, arg9, arg4, var155);
                        }
                        var165[var180++] = var173;
                        if (var151.length > 2) {
                            var165[var180++] = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 0, 64, (int[][]) null, arg11, 0, -8515, var151[2], var88, arg9, arg4, var155);
                        }
                        var165[var180++] = var174;
                        if (var150.length > 2) {
                            var165[var180++] = class218.method1575(var157, var158, 0.0F, arg7, var154, var89, var156, 64, 128, (int[][]) null, arg11, 0, -8515, var150[2], var88, arg9, arg4, var155);
                        }
                        var165[var180++] = var172;
                        var154.method1772(var92, var88, var89, var165, (int[]) null, true);
                    }
                }
            }
        }
        for (class256 var175 = (class256) var12.method71((byte) -93); var175 != null; var175 = (class256) var12.method84(1)) {
            if (var175.field3796 == 0) {
                var175.method489(false);
            } else {
                var175.method1774();
            }
        }
        if (arg5) {
            field5319 = 46;
        }
        int var176 = var12.method76((byte) -123);
        long[] var177 = new long[var176];
        class256[] var178 = new class256[var176];
        var12.method81(var178, 0);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field879;
        }
        class165.method1238((byte) 86, var178, var177);
        return var178;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 1065)
    public final void method247(byte arg0) {
        this.method2380(-109);
        field5314++;
        if (arg0 != 68) {
            method2383(-116, (class69) null, 29, 23, (Component) null);
        }
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V", line = 1077)
    private final void method2380(int arg0) {
        field5305++;
        Random var2 = new Random((long) this.field5332);
        this.field5317 = 4096 / this.field5332;
        this.field5307 = this.field5327 / 2;
        this.field5330 = 4096 / this.field5320;
        int var3 = this.field5317 / 2;
        this.field5308 = new int[this.field5332 + 1];
        if (arg0 > -55) {
            this.field5308 = (int[]) null;
        }
        int var4 = this.field5330 / 2;
        this.field5324 = new int[this.field5332][this.field5320 + 1];
        this.field5323 = new int[this.field5332][this.field5320];
        this.field5308[0] = 0;
        for (int var5 = 0; var5 < this.field5332; var5++) {
            if (var5 > 0) {
                int var6 = this.field5317;
                int var7 = (class64.method509(4096, var2, 121) - 2048) * this.field5312 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field5308[var5] = this.field5308[var5 - 1] + var8;
            }
            this.field5324[var5][0] = 0;
            for (int var9 = 0; var9 < this.field5320; var9++) {
                if (var9 > 0) {
                    int var10 = this.field5330;
                    int var11 = (class64.method509(4096, var2, 44) - 2048) * this.field5321 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field5324[var5][var9] = this.field5324[var5][var9 - 1] + var12;
                }
                this.field5323[var5][var9] = this.field5329 > 0 ? 4096 - class64.method509(this.field5329, var2, 114) : 4096;
            }
            this.field5324[var5][this.field5320] = 4096;
        }
        this.field5308[this.field5332] = 4096;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Lwd;", line = 1145)
    public static final class88 method2381(int arg0) {
        if (arg0 < 52) {
            field5331 = 86;
        }
        int var1 = class83.field1288[0] * class309.field4887[0];
        field5316++;
        byte[] var2 = class207.field3277[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class260.field3873[class164.method1234(255, var2[var4])];
        }
        class88 var5;
        if (class162.field2623) {
            var5 = new class196(class185.field2926, class112.field1821, class61.field892[0], class183.field2902[0], class309.field4887[0], class83.field1288[0], var3);
        } else {
            var5 = new class317(class185.field2926, class112.field1821, class61.field892[0], class183.field2902[0], class309.field4887[0], class83.field1288[0], var3);
        }
        class260.method1796(1952227009);
        return var5;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)[I", line = 1176)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            this.field5328 = -4;
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        field5304++;
        if (this.field4760.field388) {
            int var4 = 0;
            int var5;
            for (var5 = class264.field3901[arg0] + this.field5328; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field5332 > var4 && var5 >= this.field5308[var4]) {
                var4++;
            }
            int var6 = this.field5308[var4];
            int var7 = var4 - 1;
            int var8 = this.field5308[var4 - 1];
            boolean var9 = (var4 & 0x1) == 0;
            if (var5 > this.field5307 + var8 && var5 < var6 - this.field5307) {
                for (int var10 = 0; var10 < class31.field491; var10++) {
                    int var11 = 0;
                    int var12 = var9 ? this.field5326 : -this.field5326;
                    int var13;
                    for (var13 = (this.field5330 * var12 >> 12) + class251.field3705[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field5320 > var11 && var13 >= this.field5324[var7][var11]) {
                        var11++;
                    }
                    int var14 = this.field5324[var7][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field5324[var7][var15];
                    if (var13 > (this.field5307 + var16) && var13 < (var14 - this.field5307)) {
                        var3[var10] = this.field5323[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class330.method2313(var3, 0, class31.field491, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 1277)
    public static final void method2382(int arg0, String arg1) {
        if (arg0 > -43) {
            field5331 = 107;
        }
        field5325++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILbk;IILjava/awt/Component;)Lnb;", line = 1289)
    public static final class331 method2383(int arg0, class69 arg1, int arg2, int arg3, Component arg4) {
        field5322++;
        if (class297.field4778 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class331 var5 = (class331) Class.forName("md").getDeclaredConstructor().newInstance();
                var5.field5167 = arg0;
                var5.field5140 = new int[(class52.field774 ? 2 : 1) * 256];
                var5.method1854(arg4);
                var5.field5170 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field5170 > 16384) {
                    var5.field5170 = 16384;
                }
                var5.method1852(var5.field5170);
                if (class58.field877 > 0 && class136.field2220 == null) {
                    class136.field2220 = new class62();
                    class136.field2220.field899 = arg1;
                    arg1.method553(class136.field2220, (byte) 108, class58.field877);
                }
                if (class136.field2220 != null) {
                    if (class136.field2220.field905[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class136.field2220.field905[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class324 var7 = new class324(arg1, arg2);
                    var7.field5140 = new int[(class52.field774 ? 2 : 1) * 256];
                    var7.field5167 = arg0;
                    var7.method1854(arg4);
                    var7.field5170 = 16384;
                    var7.method1852(var7.field5170);
                    if (class58.field877 > 0 && class136.field2220 == null) {
                        class136.field2220 = new class62();
                        class136.field2220.field899 = arg1;
                        arg1.method553(class136.field2220, (byte) 83, class58.field877);
                    }
                    if (class136.field2220 != null) {
                        if (class136.field2220.field905[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class136.field2220.field905[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return arg3 < 109 ? (class331) null : new class331();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 1510)
    public class343() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V", line = 1394)
    public static final void method2384(int arg0) {
        field5313++;
        int var1 = class80.field1248.method1800(79, 8);
        if (class45.field703 > var1) {
            for (int var2 = var1; var2 < class45.field703; var2++) {
                class251.field3703[class96.field1550++] = class325.field5068[var2];
            }
        }
        if (class45.field703 < var1) {
            throw new RuntimeException("gppov1");
        }
        class45.field703 = 0;
        if (arg0 <= 89) {
            field5331 = -8;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class325.field5068[var3];
            class92 var5 = class74.field1140[var4];
            int var6 = class80.field1248.method1800(7, 1);
            if (var6 == 0) {
                class325.field5068[class45.field703++] = var4;
                var5.field4673 = class307.field4869;
            } else {
                int var7 = class80.field1248.method1800(-16, 2);
                if (var7 == 0) {
                    class325.field5068[class45.field703++] = var4;
                    var5.field4673 = class307.field4869;
                    class251.field3708[class88.field1420++] = var4;
                } else if (var7 == 1) {
                    class325.field5068[class45.field703++] = var4;
                    var5.field4673 = class307.field4869;
                    int var8 = class80.field1248.method1800(115, 3);
                    var5.method2064(true, var8, 1);
                    int var9 = class80.field1248.method1800(83, 1);
                    if (var9 == 1) {
                        class251.field3708[class88.field1420++] = var4;
                    }
                } else if (var7 == 2) {
                    class325.field5068[class45.field703++] = var4;
                    var5.field4673 = class307.field4869;
                    if (class80.field1248.method1800(-113, 1) == 1) {
                        int var10 = class80.field1248.method1800(114, 3);
                        var5.method2064(true, var10, 2);
                        int var11 = class80.field1248.method1800(109, 3);
                        var5.method2064(true, var11, 2);
                    } else {
                        int var12 = class80.field1248.method1800(93, 3);
                        var5.method2064(true, var12, 0);
                    }
                    int var13 = class80.field1248.method1800(-81, 1);
                    if (var13 == 1) {
                        class251.field3708[class88.field1420++] = var4;
                    }
                } else if (var7 == 3) {
                    class251.field3703[class96.field1550++] = var4;
                }
            }
        }
    }
}
