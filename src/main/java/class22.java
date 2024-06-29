import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class22 {

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[[I")
    public int[][] field282;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field286 = new Random();

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
    public static int field305 = -1;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "[I")
    public static int[] field304 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lml;")
    public static class142 field283;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "Lqd;")
    public static class50 field287;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZLjava/lang/String;Lcc;)Ljava/lang/String;", line = 13)
    public static final String method131(boolean arg0, String arg1, class263 arg2) {
        field302++;
        if (arg1.indexOf("%") == -1) {
            return arg0 ? arg1 : (String) null;
        }
        while (true) {
            int var3 = arg1.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg0 ? arg1 : (String) null;
                                                    }
                                                    String var9 = "";
                                                    if (class135.field1872 != null) {
                                                        if (class135.field1872.field241 == null) {
                                                            var9 = class328.method2272(class135.field1872.field240, 121);
                                                        } else {
                                                            var9 = (String) class135.field1872.field241;
                                                        }
                                                    }
                                                    arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                }
                                            }
                                            arg1 = arg1.substring(0, var7) + class73.method442(-1000000000, class60.method354(arg2, 4, arg0)) + arg1.substring(var7 + 2);
                                        }
                                    }
                                    arg1 = arg1.substring(0, var6) + class73.method442(-1000000000, class60.method354(arg2, 3, arg0)) + arg1.substring(var6 + 2);
                                }
                            }
                            arg1 = arg1.substring(0, var5) + class73.method442(-1000000000, class60.method354(arg2, 2, arg0)) + arg1.substring(var5 + 2);
                        }
                    }
                    arg1 = arg1.substring(0, var4) + class73.method442(-1000000000, class60.method354(arg2, 1, true)) + arg1.substring(var4 + 2);
                }
            }
            arg1 = arg1.substring(0, var3) + class73.method442(-1000000000, class60.method354(arg2, 0, arg0)) + arg1.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI)V", line = 106)
    public final void method132(int arg0, byte arg1, int arg2) {
        field296++;
        int var4 = arg0 - this.field293;
        int var5 = arg2 - this.field292;
        this.field282[var5][var4] = class48.method283(this.field282[var5][var4], 262144);
        if (arg1 > -123) {
            method131(false, (String) null, (class263) null);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIZZIII)V", line = 120)
    public final void method133(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field293;
        if (arg1 != 8) {
            this.field293 = -93;
        }
        int var9 = arg5 - this.field292;
        int var10 = 256;
        if (arg3) {
            var10 |= 0x20000;
        }
        if (arg2) {
            var10 |= 0x40000000;
        }
        for (int var11 = var9; var11 < var9 + arg0; var11++) {
            if (var11 >= 0 && var11 < this.field295) {
                for (int var12 = var8; var12 < (arg4 + var8); var12++) {
                    if (var12 >= 0 && var12 < this.field281) {
                        this.method136(var12, var11, var10, -1);
                    }
                }
            }
        }
        field299++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 173)
    public static final void method134(int arg0) {
        field279++;
        if (class162.field2236) {
            return;
        }
        class162.field2236 = true;
        class90.field1125 = true;
        if (arg0 < 94) {
            method131(true, (String) null, (class263) null);
        }
        if (class258.field3925) {
            class184.field2664 = (float) ((int) class184.field2664 - 17 & 0xFFFFFFF0);
        } else {
            class163.field2261 += (-12.0F - class163.field2261) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 198)
    public static void method135(int arg0) {
        field283 = null;
        field286 = null;
        field304 = null;
        field287 = null;
        if (arg0 != 255) {
            field303 = -26;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)V", line = 212)
    private final void method136(int arg0, int arg1, int arg2, int arg3) {
        field294++;
        if (arg3 == -1) {
            this.field282[arg1][arg0] = class48.method283(this.field282[arg1][arg0], arg2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIZZII)V", line = 224)
    public final void method137(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        int var9 = arg1 - this.field292;
        field298++;
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg7;
            arg7 = arg6;
            arg6 = var10;
        }
        int var11 = 256;
        int var12 = arg2 - this.field293;
        if (arg5) {
            var11 |= 0x20000;
        }
        if (arg4) {
            var11 |= 0x40000000;
        }
        for (int var13 = var9; var13 < arg7 + var9; var13++) {
            if (var13 >= 0 && this.field295 > var13) {
                for (int var14 = var12; var14 < var12 + arg6; var14++) {
                    if (var14 >= 0 && var14 < this.field281) {
                        this.method146(var11, 4, var14, var13);
                    }
                }
            }
        }
        if (arg3 != 128) {
            this.field295 = 79;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([[I[[I[[B[[F[[B[[B[[F[[BI[[[B[[FB)[Lgj;", line = 286)
    public static final class245[] method138(int[][] arg0, int[][] arg1, byte[][] arg2, float[][] arg3, byte[][] arg4, byte[][] arg5, float[][] arg6, byte[][] arg7, int arg8, byte[][][] arg9, float[][] arg10, byte arg11) {
        field289++;
        class224 var12 = new class224(128);
        int var13 = 1;
        if (arg11 != -64) {
            return (class245[]) null;
        }
        while (var13 <= 102) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg4[var13][var14] & 0xFF;
                int var16 = arg7[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class300 var17 = class272.method1971(var16 - 1, (byte) 96);
                    if (var17.field4676 == -1) {
                        continue;
                    }
                    class245 var18 = class145.method982((byte) -105, var12, var17);
                    byte var19 = arg5[var13][var14];
                    int[] var20 = class280.field4348[var19];
                    var18.field3703 += var20.length / 2;
                    var18.field3709++;
                    if (var17.field4680 && var15 != 0) {
                        var18.field3703 += class67.field880[var19];
                    }
                }
                if ((arg4[var13][var14] & 0xFF) != 0 || var16 != 0 && arg5[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = arg7[var13][var14 + 1] & 0xFF;
                    int var27 = 0;
                    int var28 = arg7[var13 - 1][var14] & 0xFF;
                    int var29 = arg7[var13 + 1][var14] & 0xFF;
                    int var30 = arg7[var13 + 1][var14 - 1] & 0xFF;
                    int var31 = arg7[var13][var14 - 1] & 0xFF;
                    int var32 = arg7[var13 - 1][var14 + 1] & 0xFF;
                    int var33 = arg7[var13 - 1][var14 - 1] & 0xFF;
                    int var34 = arg7[var13 + 1][var14 + 1] & 0xFF;
                    if (var32 == 0 || var16 == var32) {
                        boolean var43 = false;
                    } else {
                        class300 var35 = class272.method1971(var32 - 1, (byte) 96);
                        if (var35.field4680 && var35.field4676 != -1) {
                            byte var36 = arg5[var13 - 1][var14 + 1];
                            byte var37 = arg2[var13 - 1][var14 + 1];
                            int var38 = class217.field3042[(var37 + 2 & 0x3) + var36 * 4];
                            int var39 = class217.field3042[(var37 + 3 & 0x3) + var36 * 4];
                            if (class219.field3072[var39][1] && class219.field3072[var38][0]) {
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
                    if (var33 == 0 || var16 == var33) {
                        boolean var52 = false;
                    } else {
                        class300 var44 = class272.method1971(var33 - 1, (byte) 96);
                        if (var44.field4680 && var44.field4676 != -1) {
                            byte var45 = arg2[var13 - 1][var14 - 1];
                            byte var46 = arg5[var13 - 1][var14 - 1];
                            int var47 = class217.field3042[(var45 & 0x3) + var46 * 4];
                            int var48 = class217.field3042[var46 * 4 + (var45 + 3 & 0x3)];
                            if (class219.field3072[var47][1] && class219.field3072[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var50] == var33) {
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
                        class300 var53 = class272.method1971(var30 - 1, (byte) 96);
                        if (var53.field4680 && var53.field4676 != -1) {
                            byte var54 = arg5[var13 + 1][var14 - 1];
                            byte var55 = arg2[var13 + 1][var14 - 1];
                            int var56 = class217.field3042[var54 * 4 + (var55 & 0x3)];
                            int var57 = class217.field3042[(var55 + 1 & 0x3) + var54 * 4];
                            if (class219.field3072[var57][1] && class219.field3072[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var59] == var30) {
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
                        class300 var62 = class272.method1971(var34 - 1, (byte) 96);
                        if (var62.field4680 && var62.field4676 != -1) {
                            byte var63 = arg2[var13 + 1][var14 + 1];
                            byte var64 = arg5[var13 + 1][var14 + 1];
                            int var65 = class217.field3042[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class217.field3042[var64 * 4 + (var63 + 1 & 0x3)];
                            if (class219.field3072[var65][1] && class219.field3072[var66][0]) {
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
                        class300 var71 = class272.method1971(var26 - 1, (byte) 96);
                        if (var71.field4680 && var71.field4676 != -1) {
                            var24 = class217.field3042[arg5[var13][var14 + 1] * 4 + (arg2[var13][var14 + 1] + 2 & 0x3)];
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
                        class300 var73 = class272.method1971(var28 - 1, (byte) 96);
                        if (var73.field4680 && var73.field4676 != -1) {
                            var23 = class217.field3042[(arg2[var13 - 1][var14] + 3 & 0x3) + arg5[var13 - 1][var14] * 4];
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
                    if (var31 != 0 && var16 != var31) {
                        class300 var75 = class272.method1971(var31 - 1, (byte) 96);
                        if (var75.field4680 && var75.field4676 != -1) {
                            var25 = class217.field3042[(arg2[var13][var14 - 1] & 0x3) + arg5[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var31;
                                    break;
                                }
                                if (var22[var76] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class300 var77 = class272.method1971(var29 - 1, (byte) 96);
                        if (var77.field4680 && var77.field4676 != -1) {
                            var27 = class217.field3042[(arg2[var13 + 1][var14] + 1 & 0x3) + arg5[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var78] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class219.field3072[var28 == var80 ? var23 : 0];
                        boolean[] var82 = class219.field3072[var26 == var80 ? var24 : 0];
                        boolean[] var83 = class219.field3072[var31 == var80 ? var25 : 0];
                        boolean[] var84 = class219.field3072[var29 == var80 ? var27 : 0];
                        class300 var85 = class272.method1971(var80 - 1, (byte) 96);
                        class245 var86 = class145.method982((byte) -105, var12, var85);
                        var86.field3703 += 5;
                        var86.field3703 += var82.length - 2;
                        var86.field3703 += var81.length - 2;
                        var86.field3703 += var83.length - 2;
                        var86.field3703 += var84.length - 2;
                        var86.field3709++;
                    }
                }
            }
            var13++;
        }
        for (class245 var87 = (class245) var12.method1540(-125); var87 != null; var87 = (class245) var12.method1544(126)) {
            var87.method1766();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg9[arg8][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg9[1][var88][var89] & 0x2) == 2 && arg8 > 0) {
                    var90 = arg8 - 1;
                } else {
                    var90 = arg8;
                }
                int var91 = arg4[var88][var89] & 0xFF;
                int var92 = arg7[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class300 var93 = class272.method1971(var92 - 1, (byte) 96);
                    if (var93.field4676 == -1) {
                        continue;
                    }
                    class245 var94 = class145.method982((byte) -105, var12, var93);
                    byte var95 = arg5[var88][var89];
                    byte var96 = arg2[var88][var89];
                    int var97 = class233.method1645(var93.field4676, var93.field4673, -64, arg0[var88][var89]);
                    int var98 = class233.method1645(var93.field4676, var93.field4673, arg11 - 47, arg0[var88 - -1][var89]);
                    int var99 = class233.method1645(var93.field4676, var93.field4673, -72, arg0[var88 + 1][var89 + 1]);
                    int var100 = class233.method1645(var93.field4676, var93.field4673, -126, arg0[var88][var89 + 1]);
                    class117.method799(var98, -16658, var99, var88, arg6, arg1, var89, var94, var96, var97, arg3, var95, var100, arg10, var90, var91 != 0 && var93.field4680);
                }
                if ((arg4[var88][var89] & 0xFF) != 0 || var92 != 0 && arg5[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg7[var88][var89 + 1] & 0xFF;
                    int var107 = 0;
                    int var108 = arg7[var88 - 1][var89] & 0xFF;
                    int var109 = arg7[var88][var89 - 1] & 0xFF;
                    int var110 = arg7[var88 + 1][var89] & 0xFF;
                    int var111 = arg7[var88 - 1][var89 - 1] & 0xFF;
                    int var112 = arg7[var88 + 1][var89 - 1] & 0xFF;
                    int var113 = arg7[var88 - 1][var89 + 1] & 0xFF;
                    int var114 = arg7[var88 + 1][var89 + 1] & 0xFF;
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class300 var115 = class272.method1971(var113 - 1, (byte) 96);
                        if (var115.field4680 && var115.field4676 != -1) {
                            byte var116 = arg2[var88 - 1][var89 + 1];
                            byte var117 = arg5[var88 - 1][var89 + 1];
                            int var118 = class217.field3042[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class217.field3042[(var116 + 3 & 0x3) + var117 * 4];
                            if (class219.field3072[var119][1] && class219.field3072[var118][0]) {
                                var113 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var120] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class300 var121 = class272.method1971(var111 - 1, (byte) 96);
                        if (var121.field4680 && var121.field4676 != -1) {
                            byte var122 = arg2[var88 - 1][var89 - 1];
                            byte var123 = arg5[var88 - 1][var89 - 1];
                            int var124 = class217.field3042[var123 * 4 + (var122 & 0x3)];
                            int var125 = class217.field3042[var123 * 4 + (var122 + 3 & 0x3)];
                            if (class219.field3072[var124][1] && class219.field3072[var125][0]) {
                                var111 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var111;
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
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class300 var127 = class272.method1971(var112 - 1, (byte) 96);
                        if (var127.field4680 && var127.field4676 != -1) {
                            byte var128 = arg2[var88 + 1][var89 - 1];
                            byte var129 = arg5[var88 + 1][var89 - 1];
                            int var130 = class217.field3042[(var128 & 0x3) + var129 * 4];
                            int var131 = class217.field3042[(var128 + 1 & 0x3) + var129 * 4];
                            if (class219.field3072[var131][1] && class219.field3072[var130][0]) {
                                var112 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var132] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class300 var133 = class272.method1971(var114 - 1, (byte) 96);
                        if (var133.field4680 && var133.field4676 != -1) {
                            byte var134 = arg2[var88 + 1][var89 + 1];
                            byte var135 = arg5[var88 + 1][var89 + 1];
                            int var136 = class217.field3042[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class217.field3042[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class219.field3072[var136][1] && class219.field3072[var137][0]) {
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
                    if (var106 != 0 && var92 != var106) {
                        class300 var139 = class272.method1971(var106 - 1, (byte) 96);
                        if (var139.field4680 && var139.field4676 != -1) {
                            var107 = class217.field3042[(arg2[var88][var89 + 1] + 2 & 0x3) + arg5[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var106;
                                    break;
                                }
                                if (var102[var140] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class300 var141 = class272.method1971(var108 - 1, (byte) 96);
                        if (var141.field4680 && var141.field4676 != -1) {
                            var105 = class217.field3042[arg5[var88 - 1][var89] * 4 + (arg2[var88 - 1][var89] + 3 & 0x3)];
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
                        class300 var143 = class272.method1971(var109 - 1, (byte) 96);
                        if (var143.field4680 && var143.field4676 != -1) {
                            var104 = class217.field3042[(arg2[var88][var89 - 1] & 0x3) + arg5[var88][var89 - 1] * 4];
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
                        class300 var145 = class272.method1971(var110 - 1, (byte) 96);
                        if (var145.field4680 && var145.field4676 != -1) {
                            var103 = class217.field3042[(arg2[var88 + 1][var89] + 1 & 0x3) + arg5[var88 + 1][var89] * 4];
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
                        boolean[] var149 = class219.field3072[var106 == var148 ? var107 : 0];
                        boolean[] var150 = class219.field3072[var108 == var148 ? var105 : 0];
                        boolean[] var151 = class219.field3072[var109 == var148 ? var104 : 0];
                        boolean[] var152 = class219.field3072[var110 == var148 ? var103 : 0];
                        class300 var153 = class272.method1971(var148 - 1, (byte) 96);
                        class245 var154 = class145.method982((byte) -105, var12, var153);
                        int var155 = class233.method1645(var153.field4676, var153.field4673, arg11 ^ 0x71, arg0[var88][var89]) << 8 | 0xFF;
                        int var156 = class233.method1645(var153.field4676, var153.field4673, -113, arg0[var88 + 1][var89]) << 8 | 0xFF;
                        byte var157 = 6;
                        int var158 = class233.method1645(var153.field4676, var153.field4673, -63, arg0[var88 + 1][var89 + 1]) << 8 | 0xFF;
                        int var159 = class233.method1645(var153.field4676, var153.field4673, -111, arg0[var88][var89 + 1]) << 8 | 0xFF;
                        boolean var160 = var113 != var148 && var150[0] && var149[1];
                        boolean var161 = var114 != var148 && var149[0] && var152[1];
                        boolean var162 = var112 != var148 && var152[0] && var151[1];
                        boolean var163 = var111 != var148 && var151[0] && var150[1];
                        int var164 = var149.length + var157 - 2;
                        int var165 = var150.length + var164 - 2;
                        int var166 = var151.length + var165 - 2;
                        int var167 = var152.length + var166 - 2;
                        int var168 = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 64, var89, arg1, var159, arg10, true, 0.0F, arg3, var156, (int[][]) null, 64, 0);
                        int var169 = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 0, var89, arg1, var159, arg10, var160, 0.0F, arg3, var156, (int[][]) null, 128, 0);
                        int[] var170 = new int[var167];
                        byte var171 = 0;
                        int var172 = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 128, var89, arg1, var159, arg10, var161, 0.0F, arg3, var156, (int[][]) null, 128, 0);
                        int var173 = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 0, var89, arg1, var159, arg10, var163, 0.0F, arg3, var156, (int[][]) null, 0, 0);
                        int var174 = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 128, var89, arg1, var159, arg10, var162, 0.0F, arg3, var156, (int[][]) null, 0, 0);
                        int var180 = var171 + 1;
                        var170[var171] = var168;
                        var170[var180++] = var172;
                        if (var149.length > 2) {
                            var170[var180++] = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 64, var89, arg1, var159, arg10, var149[2], 0.0F, arg3, var156, (int[][]) null, 128, 0);
                        }
                        var170[var180++] = var169;
                        if (var150.length > 2) {
                            var170[var180++] = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 0, var89, arg1, var159, arg10, var150[2], 0.0F, arg3, var156, (int[][]) null, 64, 0);
                        }
                        var170[var180++] = var173;
                        if (var151.length > 2) {
                            var170[var180++] = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 64, var89, arg1, var159, arg10, var151[2], 0.0F, arg3, var156, (int[][]) null, 0, 0);
                        }
                        var170[var180++] = var174;
                        if (var152.length > 2) {
                            var170[var180++] = class309.method2173(var155, arg6, var158, var88, (byte) 103, var154, 128, var89, arg1, var159, arg10, var152[2], 0.0F, arg3, var156, (int[][]) null, 64, 0);
                        }
                        var170[var180++] = var172;
                        var154.method1761(var90, var88, var89, var170, (int[]) null, true);
                    }
                }
            }
        }
        for (class245 var175 = (class245) var12.method1540(73); var175 != null; var175 = (class245) var12.method1544(-74)) {
            if (var175.field3692 == 0) {
                var175.method2285(true);
            } else {
                var175.method1762();
            }
        }
        int var176 = var12.method1539(69);
        class245[] var177 = new class245[var176];
        long[] var178 = new long[var176];
        var12.method1536(var177, 1);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field5065;
        }
        class208.method1430(22590, var177, var178);
        return var177;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 1222)
    public final void method139(int arg0) {
        field300++;
        int var2 = 0;
        int var3 = 119 / ((arg0 + 23) / 62);
        while (var2 < this.field295) {
            for (int var4 = 0; var4 < this.field281; var4++) {
                if (var2 == 0 || var4 == 0 || var2 >= (this.field295 - 5) || (this.field281 - 5) <= var4) {
                    this.field282[var2][var4] = 16777215;
                } else {
                    this.field282[var2][var4] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V", line = 1255)
    public final void method140(int arg0, int arg1, int arg2) {
        if (arg1 < 50) {
            method138((int[][]) ((int[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), -97, (byte[][][]) ((byte[][][]) null), (float[][]) ((float[][]) null), (byte) -118);
        }
        int var4 = arg0 - this.field293;
        field285++;
        int var5 = arg2 - this.field292;
        this.field282[var5][var4] = class48.method283(this.field282[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIB)Z", line = 1270)
    public final boolean method141(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field288++;
        if (arg2 == arg3 && arg0 == arg1) {
            return true;
        }
        int var6 = arg2 - this.field292;
        int var7 = arg0 - this.field293;
        if (var6 < 0 || var6 >= this.field295 || var7 < 0 || this.field281 <= var7) {
            return false;
        } else if (arg4 < 115) {
            return true;
        } else {
            int var8 = arg1 - this.field293;
            int var9 = arg3 - this.field292;
            int var10;
            if (var6 > var9) {
                var10 = var6 - var9;
            } else {
                var10 = var9 - var6;
            }
            int var11;
            if (var7 <= var8) {
                var11 = var8 - var7;
            } else {
                var11 = var7 - var8;
            }
            if (var11 >= var10) {
                int var12 = var10 * 65536 / var11;
                int var13 = 32768;
                while (var7 != var8) {
                    if (var8 < var7) {
                        if ((this.field282[var9][var8] & 0x2C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field282[var9][var8] & 0x2C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var6 > var9) {
                            if ((this.field282[var9][var8] & 0x2C0108) != 0) {
                                return false;
                            }
                            var9++;
                        } else if (var9 > var6) {
                            if ((this.field282[var9][var8] & 0x2C0180) != 0) {
                                return false;
                            }
                            var9--;
                        }
                    }
                }
            } else {
                int var14 = var11 * 65536 / var10;
                int var15 = 32768;
                while (var6 != var9) {
                    if (var6 > var9) {
                        if ((this.field282[var9][var8] & 0x2C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field282[var9][var8] & 0x2C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var7 > var8) {
                            if ((this.field282[var9][var8] & 0x2C0102) != 0) {
                                return false;
                            }
                            var8++;
                        } else if (var8 > var7) {
                            if ((this.field282[var9][var8] & 0x2C0120) != 0) {
                                return false;
                            }
                            var8--;
                        }
                    }
                }
            }
            return (this.field282[var6][var7] & 0x240100) == 0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIZZII)V", line = 1426)
    public final void method142(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field291++;
        int var8 = arg5 - this.field292;
        int var9 = arg0 - this.field293;
        if (arg6 == 0) {
            if (arg2 == 0) {
                this.method146(128, arg1 ^ 0x6C7F, var9, var8);
                this.method146(8, 4, var9, var8 - 1);
            }
            if (arg2 == 1) {
                this.method146(2, arg1 - 27767, var9, var8);
                this.method146(32, 4, var9 + 1, var8);
            }
            if (arg2 == 2) {
                this.method146(8, 4, var9, var8);
                this.method146(128, 4, var9, var8 + 1);
            }
            if (arg2 == 3) {
                this.method146(32, arg1 - 27767, var9, var8);
                this.method146(2, 4, var9 - 1, var8);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg2 == 0) {
                this.method146(1, 4, var9, var8);
                this.method146(16, 4, var9 + 1, var8 - 1);
            }
            if (arg2 == 1) {
                this.method146(4, 4, var9, var8);
                this.method146(64, arg1 ^ 0x6C7F, var9 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method146(16, 4, var9, var8);
                this.method146(1, 4, var9 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method146(64, 4, var9, var8);
                this.method146(4, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg1 != 27771) {
            field305 = 69;
        }
        if (arg6 == 2) {
            if (arg2 == 0) {
                this.method146(130, arg1 - 27767, var9, var8);
                this.method146(8, arg1 - 27767, var9, var8 - 1);
                this.method146(32, arg1 - 27767, var9 + 1, var8);
            }
            if (arg2 == 1) {
                this.method146(10, 4, var9, var8);
                this.method146(32, 4, var9 + 1, var8);
                this.method146(128, 4, var9, var8 + 1);
            }
            if (arg2 == 2) {
                this.method146(40, arg1 ^ 0x6C7F, var9, var8);
                this.method146(128, 4, var9, var8 + 1);
                this.method146(2, 4, var9 - 1, var8);
            }
            if (arg2 == 3) {
                this.method146(160, 4, var9, var8);
                this.method146(2, arg1 ^ 0x6C7F, var9 - 1, var8);
                this.method146(8, 4, var9, var8 - 1);
            }
        }
        if (arg3) {
            if (arg6 == 0) {
                if (arg2 == 0) {
                    this.method146(65536, 4, var9, var8);
                    this.method146(4096, 4, var9, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method146(1024, 4, var9, var8);
                    this.method146(16384, 4, var9 + 1, var8);
                }
                if (arg2 == 2) {
                    this.method146(4096, 4, var9, var8);
                    this.method146(65536, 4, var9, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method146(16384, 4, var9, var8);
                    this.method146(1024, 4, var9 - 1, var8);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg2 == 0) {
                    this.method146(512, 4, var9, var8);
                    this.method146(8192, 4, var9 + 1, var8 + -1);
                }
                if (arg2 == 1) {
                    this.method146(2048, arg1 ^ 0x6C7F, var9, var8);
                    this.method146(32768, 4, var9 + 1, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method146(8192, arg1 ^ 0x6C7F, var9, var8);
                    this.method146(512, 4, var9 - 1, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method146(32768, arg1 - 27767, var9, var8);
                    this.method146(2048, 4, var9 - 1, var8 + -1);
                }
            }
            if (arg6 == 2) {
                if (arg2 == 0) {
                    this.method146(66560, 4, var9, var8);
                    this.method146(4096, 4, var9, var8 - 1);
                    this.method146(16384, 4, var9 + 1, var8);
                }
                if (arg2 == 1) {
                    this.method146(5120, 4, var9, var8);
                    this.method146(16384, 4, var9 + 1, var8);
                    this.method146(65536, 4, var9, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method146(20480, 4, var9, var8);
                    this.method146(65536, 4, var9, var8 + 1);
                    this.method146(1024, 4, var9 - 1, var8);
                }
                if (arg2 == 3) {
                    this.method146(81920, 4, var9, var8);
                    this.method146(1024, 4, var9 - 1, var8);
                    this.method146(4096, 4, var9, var8 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg6 == 0) {
            if (arg2 == 0) {
                this.method146(536870912, 4, var9, var8);
                this.method146(33554432, arg1 ^ 0x6C7F, var9, var8 - 1);
            }
            if (arg2 == 1) {
                this.method146(8388608, 4, var9, var8);
                this.method146(134217728, arg1 ^ 0x6C7F, var9 + 1, var8);
            }
            if (arg2 == 2) {
                this.method146(33554432, arg1 - 27767, var9, var8);
                this.method146(536870912, arg1 - 27767, var9, var8 + 1);
            }
            if (arg2 == 3) {
                this.method146(134217728, 4, var9, var8);
                this.method146(8388608, 4, var9 - 1, var8);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg2 == 0) {
                this.method146(4194304, 4, var9, var8);
                this.method146(67108864, arg1 ^ 0x6C7F, var9 + 1, var8 + -1);
            }
            if (arg2 == 1) {
                this.method146(16777216, arg1 ^ 0x6C7F, var9, var8);
                this.method146(268435456, 4, var9 + 1, var8 - -1);
            }
            if (arg2 == 2) {
                this.method146(67108864, 4, var9, var8);
                this.method146(4194304, 4, var9 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method146(268435456, 4, var9, var8);
                this.method146(16777216, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method146(545259520, 4, var9, var8);
            this.method146(33554432, 4, var9, var8 - 1);
            this.method146(134217728, 4, var9 + 1, var8);
        }
        if (arg2 == 1) {
            this.method146(41943040, 4, var9, var8);
            this.method146(134217728, arg1 ^ 0x6C7F, var9 + 1, var8);
            this.method146(536870912, 4, var9, var8 + 1);
        }
        if (arg2 == 2) {
            this.method146(167772160, 4, var9, var8);
            this.method146(536870912, 4, var9, var8 + 1);
            this.method146(8388608, 4, var9 - 1, var8);
        }
        if (arg2 == 3) {
            this.method146(671088640, 4, var9, var8);
            this.method146(8388608, 4, var9 - 1, var8);
            this.method146(33554432, 4, var9, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)V", line = 1733)
    public final void method143(int arg0, int arg1, int arg2) {
        field301++;
        int var4 = arg1 - this.field292;
        if (arg2 == 1) {
            int var5 = arg0 - this.field293;
            this.field282[var4][var5] = class229.method1613(this.field282[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILlc;B)[Ltb;", line = 1746)
    public static final class234[] method144(int arg0, class175 arg1, byte arg2) {
        if (arg2 > -102) {
            method131(false, (String) null, (class263) null);
        }
        field280++;
        return class115.method786(arg0, 123, arg1) ? class10.method51(119) : null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZIIIZI)V", line = 1765)
    public final void method145(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field293;
        int var9 = arg0 - this.field292;
        field290++;
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method136(var8, var9, 128, -1);
                this.method136(var8, var9 - 1, 8, -1);
            }
            if (arg6 == 1) {
                this.method136(var8, var9, 2, -1);
                this.method136(var8 + 1, var9, 32, -1);
            }
            if (arg6 == 2) {
                this.method136(var8, var9, 8, -1);
                this.method136(var8, var9 + 1, 128, -1);
            }
            if (arg6 == 3) {
                this.method136(var8, var9, 32, -1);
                this.method136(var8 - 1, var9, 2, -1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method136(var8, var9, 1, -1);
                this.method136(var8 + 1, var9 + -1, 16, -1);
            }
            if (arg6 == 1) {
                this.method136(var8, var9, 4, -1);
                this.method136(var8 + 1, var9 + 1, 64, -1);
            }
            if (arg6 == 2) {
                this.method136(var8, var9, 16, -1);
                this.method136(var8 - 1, var9 + 1, 1, -1);
            }
            if (arg6 == 3) {
                this.method136(var8, var9, 64, -1);
                this.method136(var8 - 1, var9 - 1, 4, -1);
            }
        }
        if (arg3 < 81) {
            this.method141(-65, 11, 37, 35, (byte) 59);
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                this.method136(var8, var9, 130, -1);
                this.method136(var8, var9 - 1, 8, -1);
                this.method136(var8 + 1, var9, 32, -1);
            }
            if (arg6 == 1) {
                this.method136(var8, var9, 10, -1);
                this.method136(var8 + 1, var9, 32, -1);
                this.method136(var8, var9 + 1, 128, -1);
            }
            if (arg6 == 2) {
                this.method136(var8, var9, 40, -1);
                this.method136(var8, var9 + 1, 128, -1);
                this.method136(var8 - 1, var9, 2, -1);
            }
            if (arg6 == 3) {
                this.method136(var8, var9, 160, -1);
                this.method136(var8 - 1, var9, 2, -1);
                this.method136(var8, var9 - 1, 8, -1);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    this.method136(var8, var9, 65536, -1);
                    this.method136(var8, var9 - 1, 4096, -1);
                }
                if (arg6 == 1) {
                    this.method136(var8, var9, 1024, -1);
                    this.method136(var8 + 1, var9, 16384, -1);
                }
                if (arg6 == 2) {
                    this.method136(var8, var9, 4096, -1);
                    this.method136(var8, var9 + 1, 65536, -1);
                }
                if (arg6 == 3) {
                    this.method136(var8, var9, 16384, -1);
                    this.method136(var8 - 1, var9, 1024, -1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg6 == 0) {
                    this.method136(var8, var9, 512, -1);
                    this.method136(var8 + 1, var9 + -1, 8192, -1);
                }
                if (arg6 == 1) {
                    this.method136(var8, var9, 2048, -1);
                    this.method136(var8 + 1, var9 + 1, 32768, -1);
                }
                if (arg6 == 2) {
                    this.method136(var8, var9, 8192, -1);
                    this.method136(var8 - 1, var9 - -1, 512, -1);
                }
                if (arg6 == 3) {
                    this.method136(var8, var9, 32768, -1);
                    this.method136(var8 - 1, var9 + -1, 2048, -1);
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    this.method136(var8, var9, 66560, -1);
                    this.method136(var8, var9 - 1, 4096, -1);
                    this.method136(var8 + 1, var9, 16384, -1);
                }
                if (arg6 == 1) {
                    this.method136(var8, var9, 5120, -1);
                    this.method136(var8 + 1, var9, 16384, -1);
                    this.method136(var8, var9 + 1, 65536, -1);
                }
                if (arg6 == 2) {
                    this.method136(var8, var9, 20480, -1);
                    this.method136(var8, var9 + 1, 65536, -1);
                    this.method136(var8 - 1, var9, 1024, -1);
                }
                if (arg6 == 3) {
                    this.method136(var8, var9, 81920, -1);
                    this.method136(var8 - 1, var9, 1024, -1);
                    this.method136(var8, var9 - 1, 4096, -1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method136(var8, var9, 536870912, -1);
                this.method136(var8, var9 - 1, 33554432, -1);
            }
            if (arg6 == 1) {
                this.method136(var8, var9, 8388608, -1);
                this.method136(var8 + 1, var9, 134217728, -1);
            }
            if (arg6 == 2) {
                this.method136(var8, var9, 33554432, -1);
                this.method136(var8, var9 + 1, 536870912, -1);
            }
            if (arg6 == 3) {
                this.method136(var8, var9, 134217728, -1);
                this.method136(var8 - 1, var9, 8388608, -1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method136(var8, var9, 4194304, -1);
                this.method136(var8 + 1, var9 + -1, 67108864, -1);
            }
            if (arg6 == 1) {
                this.method136(var8, var9, 16777216, -1);
                this.method136(var8 + 1, var9 + 1, 268435456, -1);
            }
            if (arg6 == 2) {
                this.method136(var8, var9, 67108864, -1);
                this.method136(var8 - 1, var9 + 1, 4194304, -1);
            }
            if (arg6 == 3) {
                this.method136(var8, var9, 268435456, -1);
                this.method136(var8 - 1, var9 - 1, 16777216, -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method136(var8, var9, 545259520, -1);
            this.method136(var8, var9 - 1, 33554432, -1);
            this.method136(var8 + 1, var9, 134217728, -1);
        }
        if (arg6 == 1) {
            this.method136(var8, var9, 41943040, -1);
            this.method136(var8 + 1, var9, 134217728, -1);
            this.method136(var8, var9 + 1, 536870912, -1);
        }
        if (arg6 == 2) {
            this.method136(var8, var9, 167772160, -1);
            this.method136(var8, var9 + 1, 536870912, -1);
            this.method136(var8 - 1, var9, 8388608, -1);
        }
        if (arg6 == 3) {
            this.method136(var8, var9, 671088640, -1);
            this.method136(var8 - 1, var9, 8388608, -1);
            this.method136(var8, var9 - 1, 33554432, -1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V", line = 2071)
    public class22(int arg0, int arg1) {
        this.field295 = arg0;
        this.field292 = 0;
        this.field281 = arg1;
        this.field293 = 0;
        this.field282 = new int[this.field295][this.field281];
        this.method139(-126);
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIII)V", line = 2087)
    private final void method146(int arg0, int arg1, int arg2, int arg3) {
        this.field282[arg3][arg2] = class229.method1613(this.field282[arg3][arg2], ~arg0);
        field284++;
        if (arg1 != 4) {
            this.field295 = -85;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)V", line = 2103)
    public static final void method147(int arg0, boolean arg1) {
        if (!arg1) {
            method131(true, (String) null, (class263) null);
        }
        class259.field3929.method1236(-495037017, arg0);
        field297++;
    }
}
