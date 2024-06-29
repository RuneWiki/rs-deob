import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class16 extends class282 {

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "Ljf;")
    private class229 field251 = class224.field3837;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public static int field253 = 0;

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "Ljf;")
    public static class229 field261 = class212.method1457((byte) 102, ":allyreq:");

    @OriginalMember(owner = "client!oh", name = "lb", descriptor = "I")
    public static int field263 = -1;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "Z")
    public static boolean field241 = true;

    @OriginalMember(owner = "client!oh", name = "mb", descriptor = "[I")
    public static int[] field264 = new int[128];

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!oh", name = "nb", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!oh", name = "ob", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!oh", name = "pb", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Lui;")
    private class268 field239;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "Lui;")
    public class268 field245;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "[Ljj;")
    public static class150[] field250;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "[[[I")
    public static int[][][] field256;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V", line = 8)
    private final void method153(int arg0) {
        this.field239 = new class268(this.field245.method1891(0));
        field248++;
        class93 var2 = (class93) this.field245.method1884((byte) -100);
        if (arg0 > -105) {
            method161((byte) -124);
        }
        while (var2 != null) {
            class93 var3 = new class93((int) var2.field4265);
            this.field239.method1885((long) var2.field1678, var3, (byte) -80);
            var2 = (class93) this.field245.method1886(-125);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Ljf;", line = 39)
    public final class229 method154(int arg0, byte arg1) {
        field262++;
        if (this.field245 == null) {
            return this.field251;
        }
        class29 var3 = (class29) this.field245.method1890((long) arg0, -108);
        if (var3 == null) {
            return this.field251;
        } else {
            if (arg1 != 82) {
                this.method159(102, (byte) 37);
            }
            return var3.field515;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V", line = 62)
    private final void method155(byte arg0) {
        field240++;
        this.field239 = new class268(this.field245.method1891(0));
        for (class29 var2 = (class29) this.field245.method1884((byte) 127); var2 != null; var2 = (class29) this.field245.method1886(-126)) {
            class299 var3 = new class299(var2.field515, (int) var2.field4265);
            this.field239.method1885(var2.field515.method1611(-25514), var3, (byte) -112);
        }
        if (arg0 > -120) {
            field242 = 91;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)I", line = 84)
    public final int method156(int arg0, int arg1) {
        field257++;
        if (this.field245 == null) {
            return this.field260;
        } else {
            class93 var3 = (class93) this.field245.method1890((long) arg0, -94);
            int var4 = -96 % ((-arg1 - 70) / 33);
            return var3 == null ? this.field260 : var3.field1678;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lkh;IZ)V", line = 105)
    private final void method157(class14 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field265 = arg0.method93(false);
        } else if (arg1 == 2) {
            this.field247 = arg0.method93(false);
        } else if (arg1 == 3) {
            this.field251 = arg0.method105((byte) 98);
        } else if (arg1 == 4) {
            this.field260 = arg0.method128((byte) 4);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method116(-1);
            this.field245 = new class268(class5.method28(-93, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method128((byte) 4);
                class242 var7;
                if (arg1 == 5) {
                    var7 = new class29(arg0.method105((byte) 83));
                } else {
                    var7 = new class93(arg0.method128((byte) 4));
                }
                this.field245.method1885((long) var6, var7, (byte) -111);
            }
        }
        field255++;
        if (!arg2) {
            this.field251 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[[B[[BI[[I[[F[[F[[B[[I[[F[[[B[[B)[Lkc;", line = 159)
    public static final class37[] method158(int arg0, byte[][] arg1, byte[][] arg2, int arg3, int[][] arg4, float[][] arg5, float[][] arg6, byte[][] arg7, int[][] arg8, float[][] arg9, byte[][][] arg10, byte[][] arg11) {
        field259++;
        class268 var12 = new class268(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg11[var13][var14] & 0xFF;
                int var16 = arg1[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class323 var17 = class122.method874(-2702, var16 - 1);
                    if (var17.field5443 == -1) {
                        continue;
                    }
                    class37 var18 = class264.method1870(var17, var12, -29966);
                    byte var19 = arg7[var13][var14];
                    int[] var20 = class169.field2948[var19];
                    var18.field677 += var20.length / 2;
                    var18.field688++;
                    if (var17.field5451 && var15 != 0) {
                        var18.field677 += class223.field3809[var19];
                    }
                }
                if ((arg11[var13][var14] & 0xFF) != 0 || var16 != 0 && arg7[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg1[var13][var14 + 1] & 0xFF;
                    int var28 = arg1[var13][var14 - 1] & 0xFF;
                    int var29 = arg1[var13 - 1][var14] & 0xFF;
                    int var30 = arg1[var13 + 1][var14] & 0xFF;
                    int var31 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class323 var35 = class122.method874(arg0 - 2957, var31 + -1);
                        if (var35.field5451 && var35.field5443 != -1) {
                            byte var36 = arg7[var13 - 1][var14 + 1];
                            byte var37 = arg2[var13 - 1][var14 + 1];
                            int var38 = class18.field281[(var37 + 3 & 0x3) + var36 * 4];
                            int var39 = class18.field281[(var37 + 2 & 0x3) + var36 * 4];
                            if (class234.field4046[var38][1] && class234.field4046[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var23[var21++] = var31;
                                        break;
                                    }
                                    if (var23[var41] == var31) {
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
                        class323 var44 = class122.method874(-2702, var32 - 1);
                        if (var44.field5451 && var44.field5443 != -1) {
                            byte var45 = arg2[var13 - 1][var14 - 1];
                            byte var46 = arg7[var13 - 1][var14 - 1];
                            int var47 = class18.field281[(var45 + 3 & 0x3) + var46 * 4];
                            int var48 = class18.field281[var46 * 4 + (var45 & 0x3)];
                            if (class234.field4046[var48][1] && class234.field4046[var47][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var23[var21++] = var32;
                                        break;
                                    }
                                    if (var23[var50] == var32) {
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
                        class323 var53 = class122.method874(arg0 - 2957, var33 + -1);
                        if (var53.field5451 && var53.field5443 != -1) {
                            byte var54 = arg2[var13 + 1][var14 - 1];
                            byte var55 = arg7[var13 + 1][var14 - 1];
                            int var56 = class18.field281[var55 * 4 + (var54 + 1 & 0x3)];
                            int var57 = class18.field281[var55 * 4 + (var54 & 0x3)];
                            if (class234.field4046[var56][1] && class234.field4046[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var23[var21++] = var33;
                                        break;
                                    }
                                    if (var23[var59] == var33) {
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
                        class323 var62 = class122.method874(-2702, var34 - 1);
                        if (var62.field5451 && var62.field5443 != -1) {
                            byte var63 = arg7[var13 + 1][var14 + 1];
                            byte var64 = arg2[var13 + 1][var14 + 1];
                            int var65 = class18.field281[(var64 + 2 & 0x3) + var63 * 4];
                            int var66 = class18.field281[(var64 + 1 & 0x3) + var63 * 4];
                            if (class234.field4046[var65][1] && class234.field4046[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var23[var21++] = var34;
                                        break;
                                    }
                                    if (var23[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class323 var71 = class122.method874(-2702, var27 - 1);
                        if (var71.field5451 && var71.field5443 != -1) {
                            var22 = class18.field281[arg7[var13][var14 + 1] * 4 + (arg2[var13][var14 + 1] + 2 & 0x3)];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var23[var21++] = var27;
                                    break;
                                }
                                if (var23[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class323 var73 = class122.method874(-2702, var29 - 1);
                        if (var73.field5451 && var73.field5443 != -1) {
                            var26 = class18.field281[arg7[var13 - 1][var14] * 4 + (arg2[var13 - 1][var14] + 3 & 0x3)];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var23[var21++] = var29;
                                    break;
                                }
                                if (var23[var74] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class323 var75 = class122.method874(-2702, var28 - 1);
                        if (var75.field5451 && var75.field5443 != -1) {
                            var24 = class18.field281[(arg2[var13][var14 - 1] & 0x3) + arg7[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var23[var21++] = var28;
                                    break;
                                }
                                if (var23[var76] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class323 var77 = class122.method874(-2702, var30 - 1);
                        if (var77.field5451 && var77.field5443 != -1) {
                            var25 = class18.field281[(arg2[var13 + 1][var14] + 1 & 0x3) + arg7[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var23[var21++] = var30;
                                    break;
                                }
                                if (var23[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var23[var79];
                        boolean[] var81 = class234.field4046[var29 == var80 ? var26 : 0];
                        boolean[] var82 = class234.field4046[var27 == var80 ? var22 : 0];
                        boolean[] var83 = class234.field4046[var30 == var80 ? var25 : 0];
                        boolean[] var84 = class234.field4046[var28 == var80 ? var24 : 0];
                        class323 var85 = class122.method874(-2702, var80 - 1);
                        class37 var86 = class264.method1870(var85, var12, -29966);
                        var86.field677 += 5;
                        var86.field677 += var82.length - 2;
                        var86.field677 += var81.length - 2;
                        var86.field677 += var84.length - 2;
                        var86.field677 += var83.length - 2;
                        var86.field688++;
                    }
                }
            }
        }
        for (class37 var87 = (class37) var12.method1884((byte) -110); var87 != null; var87 = (class37) var12.method1886(arg0 - 374)) {
            var87.method326();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg10[arg3][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg10[1][var88][var89] & 0x2) == 2 && arg3 > 0) {
                    var90 = arg3 - 1;
                } else {
                    var90 = arg3;
                }
                int var91 = arg11[var88][var89] & 0xFF;
                int var92 = arg1[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class323 var93 = class122.method874(arg0 ^ 0xFFFFF58D, var92 - 1);
                    if (var93.field5443 == -1) {
                        continue;
                    }
                    class37 var94 = class264.method1870(var93, var12, -29966);
                    byte var95 = arg7[var88][var89];
                    byte var96 = arg2[var88][var89];
                    int var97 = class59.method453(arg4[var88][var89], var93.field5443, var93.field5442, arg0 ^ 0x2AD5CB77);
                    int var98 = class59.method453(arg4[var88 + 1][var89], var93.field5443, var93.field5442, 718654344);
                    int var99 = class59.method453(arg4[var88 + 1][var89 + 1], var93.field5443, var93.field5442, 718654344);
                    int var100 = class59.method453(arg4[var88][var89 + 1], var93.field5443, var93.field5442, 718654344);
                    class143.method997(arg5, (byte) -18, var95, var97, var98, var94, var90, var99, arg8, var91 != 0 && var93.field5451, var88, var100, var96, arg9, var89, arg6);
                }
                if ((arg11[var88][var89] & 0xFF) != 0 || var92 != 0 && arg7[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg1[var88 - 1][var89] & 0xFF;
                    int var108 = arg1[var88][var89 + 1] & 0xFF;
                    int var109 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var110 = arg1[var88][var89 - 1] & 0xFF;
                    int var111 = arg1[var88 + 1][var89] & 0xFF;
                    int var112 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    if (var109 == 0 || var92 == var109) {
                        var109 = 0;
                    } else {
                        class323 var115 = class122.method874(-2702, var109 - 1);
                        if (var115.field5451 && var115.field5443 != -1) {
                            byte var116 = arg2[var88 - 1][var89 + 1];
                            byte var117 = arg7[var88 - 1][var89 + 1];
                            int var118 = class18.field281[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class18.field281[var117 * 4 + (var116 + 3 & 0x3)];
                            if (class234.field4046[var119][1] && class234.field4046[var118][0]) {
                                var109 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var109;
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
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class323 var121 = class122.method874(-2702, var112 - 1);
                        if (var121.field5451 && var121.field5443 != -1) {
                            byte var122 = arg2[var88 - 1][var89 - 1];
                            byte var123 = arg7[var88 - 1][var89 - 1];
                            int var124 = class18.field281[(var122 & 0x3) + var123 * 4];
                            int var125 = class18.field281[var123 * 4 + (var122 + 3 & 0x3)];
                            if (class234.field4046[var124][1] && class234.field4046[var125][0]) {
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
                        class323 var127 = class122.method874(-2702, var113 - 1);
                        if (var127.field5451 && var127.field5443 != -1) {
                            byte var128 = arg2[var88 + 1][var89 - 1];
                            byte var129 = arg7[var88 + 1][var89 - 1];
                            int var130 = class18.field281[(var128 + 1 & 0x3) + var129 * 4];
                            int var131 = class18.field281[(var128 & 0x3) + var129 * 4];
                            if (class234.field4046[var130][1] && class234.field4046[var131][0]) {
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
                        class323 var133 = class122.method874(-2702, var114 - 1);
                        if (var133.field5451 && var133.field5443 != -1) {
                            byte var134 = arg2[var88 + 1][var89 + 1];
                            byte var135 = arg7[var88 + 1][var89 + 1];
                            int var136 = class18.field281[(var134 + 1 & 0x3) + var135 * 4];
                            int var137 = class18.field281[(var134 + 2 & 0x3) + var135 * 4];
                            if (class234.field4046[var137][1] && class234.field4046[var136][0]) {
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
                    if (var108 != 0 && var92 != var108) {
                        class323 var139 = class122.method874(-2702, var108 - 1);
                        if (var139.field5451 && var139.field5443 != -1) {
                            var103 = class18.field281[(arg2[var88][var89 + 1] + 2 & 0x3) + arg7[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var140] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class323 var141 = class122.method874(-2702, var107 - 1);
                        if (var141.field5451 && var141.field5443 != -1) {
                            var104 = class18.field281[(arg2[var88 - 1][var89] + 3 & 0x3) + arg7[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class323 var143 = class122.method874(-2702, var110 - 1);
                        if (var143.field5451 && var143.field5443 != -1) {
                            var106 = class18.field281[(arg2[var88][var89 - 1] & 0x3) + arg7[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var144] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var92 != var111) {
                        class323 var145 = class122.method874(-2702, var111 - 1);
                        if (var145.field5451 && var145.field5443 != -1) {
                            var105 = class18.field281[(arg2[var88 + 1][var89] + 1 & 0x3) + arg7[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var111;
                                    break;
                                }
                                if (var102[var146] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class234.field4046[var108 == var148 ? var103 : 0];
                        boolean[] var150 = class234.field4046[var110 == var148 ? var106 : 0];
                        boolean[] var151 = class234.field4046[var107 == var148 ? var104 : 0];
                        boolean[] var152 = class234.field4046[var111 == var148 ? var105 : 0];
                        class323 var153 = class122.method874(-2702, var148 - 1);
                        byte var154 = 6;
                        class37 var155 = class264.method1870(var153, var12, -29966);
                        int var156 = class59.method453(arg4[var88][var89], var153.field5443, var153.field5442, arg0 ^ 0x2AD5CB77) << 8 | 0xFF;
                        int var157 = class59.method453(arg4[var88 + 1][var89], var153.field5443, var153.field5442, 718654344) << 8 | 0xFF;
                        int var158 = class59.method453(arg4[var88 + 1][var89 + 1], var153.field5443, var153.field5442, 718654344) << 8 | 0xFF;
                        int var159 = class59.method453(arg4[var88][var89 + 1], var153.field5443, var153.field5442, 718654344) << 8 | 0xFF;
                        boolean var160 = var114 != var148 && var149[0] && var152[1];
                        boolean var161 = var112 != var148 && var150[0] && var151[1];
                        int var162 = var149.length + var154 - 2;
                        boolean var163 = var109 != var148 && var151[0] && var149[1];
                        int var164 = var151.length + var162 - 2;
                        int var165 = var150.length + var164 - 2;
                        boolean var166 = var113 != var148 && var152[0] && var150[1];
                        int var167 = var152.length + var165 - 2;
                        int[] var168 = new int[var167];
                        byte var169 = 0;
                        int var170 = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 64, arg8, var89, true, arg5, 0, var155, 64, var156, 0.0F, var159);
                        int var171 = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 128, arg8, var89, var163, arg5, 0, var155, 0, var156, 0.0F, var159);
                        int var172 = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 128, arg8, var89, var160, arg5, 0, var155, 128, var156, 0.0F, var159);
                        int var173 = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 0, arg8, var89, var161, arg5, 0, var155, 0, var156, 0.0F, var159);
                        int var174 = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 0, arg8, var89, var166, arg5, 0, var155, 128, var156, 0.0F, var159);
                        int var180 = var169 + 1;
                        var168[var169] = var170;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 128, arg8, var89, var149[2], arg5, 0, var155, 64, var156, 0.0F, var159);
                        }
                        var168[var180++] = var171;
                        if (var151.length > 2) {
                            var168[var180++] = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 64, arg8, var89, var151[2], arg5, 0, var155, 0, var156, 0.0F, var159);
                        }
                        var168[var180++] = var173;
                        if (var150.length > 2) {
                            var168[var180++] = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 0, arg8, var89, var150[2], arg5, 0, var155, 64, var156, 0.0F, var159);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class45.method389(var158, var157, (int[][]) null, arg9, true, var88, arg6, 64, arg8, var89, var152[2], arg5, 0, var155, 128, var156, 0.0F, var159);
                        }
                        var168[var180++] = var172;
                        var155.method331(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class37 var175 = (class37) var12.method1884((byte) 124); var175 != null; var175 = (class37) var12.method1886(arg0 ^ 0xFFFFFF75)) {
            if (var175.field675 == 0) {
                var175.method1747((byte) -70);
            } else {
                var175.method332();
            }
        }
        int var176 = var12.method1895(0);
        long[] var177 = new long[var176];
        class37[] var178 = new class37[var176];
        var12.method1894(var178, true);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field4265;
        }
        class183.method1252(var177, arg0 ^ arg0, var178);
        return var178;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)Z", line = 1091)
    public final boolean method159(int arg0, byte arg1) {
        field244++;
        if (this.field245 == null) {
            return false;
        }
        int var3 = -98 / ((-arg1 - 59) / 42);
        if (this.field239 == null) {
            this.method153(-114);
        }
        class93 var4 = (class93) this.field239.method1890((long) arg0, -106);
        return var4 != null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IBI)V", line = 1132)
    public static final void method160(int arg0, byte arg1, int arg2) {
        if (arg1 != -20) {
            method161((byte) -102);
        }
        class28.field497[arg2] = arg0;
        field249++;
        class223 var3 = (class223) class298.field5082.method1890((long) arg2, arg1 - 77);
        if (var3 == null) {
            class223 var4 = new class223(4611686018427387905L);
            class298.field5082.method1885((long) arg2, var4, (byte) -61);
        } else if (var3.field3808 != 4611686018427387905L) {
            var3.field3808 = class153.method1032(118) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)V", line = 1163)
    public static void method161(byte arg0) {
        field250 = null;
        field264 = null;
        field261 = null;
        if (arg0 == 73) {
            field256 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLkh;)V", line = 1179)
    public final void method162(byte arg0, class14 arg1) {
        while (true) {
            int var3 = arg1.method93(false);
            if (var3 == 0) {
                field252++;
                int var4 = -25 % ((-arg0 - 48) / 50);
                return;
            }
            this.method157(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjf;)Z", line = 1196)
    public final boolean method163(byte arg0, class229 arg1) {
        field258++;
        if (this.field245 == null) {
            return false;
        }
        if (this.field239 == null) {
            this.method155((byte) -123);
        }
        class299 var3 = (class299) this.field239.method1890(arg1.method1611(-25514), -91);
        int var4 = -84 % ((82 - arg0) / 40);
        while (var3 != null) {
            if (var3.field5098.method1641((byte) -64, arg1)) {
                return true;
            }
            var3 = (class299) this.field239.method1883((byte) 32);
        }
        return false;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Lsm;", line = 1228)
    public static final class159 method164(int arg0) {
        field246++;
        int var1 = class6.field71[0] * class232.field4025[0];
        byte[] var2 = class21.field357[0];
        int[] var3 = new int[var1];
        if (arg0 != 3362) {
            field263 = 102;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class64.field1115[class305.method2086(255, var2[var4])];
        }
        class159 var5 = new class159(class97.field1722, class307.field5192, class272.field4659[0], class256.field4473[0], class232.field4025[0], class6.field71[0], var3);
        class62.method466((byte) 94);
        return var5;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V", line = 1260)
    public static final void method165(boolean arg0, int arg1) {
        field266++;
        byte[][] var2;
        byte var3;
        if (class108.field1900 && arg0) {
            var2 = class328.field5535;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class117.field2089;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class29.field511[var5] >> 8) * 64 - class258.field4503;
            int var7 = (class29.field511[var5] & 0xFF) * 64 - class213.field3649;
            byte[] var8 = var2[var5];
            if (var8 != null) {
                class18.method179((byte) 101);
                class5.method34(class80.field1460, var6, class184.field3188 * 8 - 48, var8, 127, class70.field1339 * 8 - 48, arg0, var7);
            }
        }
        if (arg1 != -365448216) {
            return;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class29.field511[var9] >> 8) * 64 - class258.field4503;
            int var11 = (class29.field511[var9] & 0xFF) * 64 - class213.field3649;
            byte[] var12 = var2[var9];
            if (var12 == null && class70.field1339 < 800) {
                class18.method179((byte) 101);
                for (int var13 = 0; var13 < var3; var13++) {
                    class39.method340(64, var11, 64, var13, var10, -45);
                }
            }
        }
    }
}
