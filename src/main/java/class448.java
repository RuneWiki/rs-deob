import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class448 {

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
    private int[] field6347 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[I")
    private int[] field6353 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lvu;")
    private class337 field6340;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Z")
    public boolean field6356;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lri;")
    private class111 field6339;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public int field6366;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public int field6351;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "[[[B")
    private byte[][][] field6363;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[[[B")
    private byte[][][] field6338;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[[[I")
    public int[][][] field6352;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[[[B")
    public byte[][][] field6343;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[[[B")
    private byte[][][] field6336;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[[[B")
    private byte[][][] field6350;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Las;")
    public static class151 field6354 = new class151(14, 0, 4, 1);

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6360 = null;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "F")
    public static float field6361;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "F")
    public static float field6365;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[Lgd;")
    public static class339[] field6358;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[Lum;")
    public static class524[] field6355;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[[[B")
    public byte[][][] field6342;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V")
    public final void method2675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1;
        if (arg5 != 29274) {
            this.field6351 = 113;
        }
        while ((arg0 + arg1) > var7) {
            for (int var10 = arg2; var10 < (arg2 + arg3); var10++) {
                if (var10 >= 0 && this.field6351 > var10 && var7 >= 0 && this.field6362 > var7) {
                    this.field6352[arg4][var10][var7] = arg4 > 0 ? this.field6352[arg4 - 1][var10][var7] - 960 : 0;
                }
            }
            var7++;
        }
        field6337++;
        if (arg2 > 0 && arg2 < this.field6351) {
            for (int var8 = arg1 + 1; var8 < arg1 + arg0; var8++) {
                if (var8 >= 0 && this.field6362 > var8) {
                    this.field6352[arg4][arg2][var8] = this.field6352[arg4][arg2 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && this.field6362 > arg1) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && this.field6351 > var9) {
                    this.field6352[arg4][var9][arg1] = this.field6352[arg4][var9][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || arg2 >= this.field6351 || this.field6362 <= arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 > 0 && this.field6352[arg4][arg2 - 1][arg1] != 0) {
                this.field6352[arg4][arg2][arg1] = this.field6352[arg4][arg2 - 1][arg1];
                return;
            }
            if (arg1 > 0 && this.field6352[arg4][arg2][arg1 - 1] != 0) {
                this.field6352[arg4][arg2][arg1] = this.field6352[arg4][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field6352[arg4][arg2 - 1][arg1 - 1] != 0) {
                this.field6352[arg4][arg2][arg1] = this.field6352[arg4][arg2 - 1][arg1 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field6352[arg4][arg2 - 1][arg1] == this.field6352[arg4 - 1][arg2 - 1][arg1]) {
            if (arg1 <= 0 || this.field6352[arg4 - 1][arg2][arg1 - 1] == this.field6352[arg4][arg2][arg1 - 1]) {
                if (arg2 > 0 && arg1 > 0 && this.field6352[arg4 - 1][arg2 - 1][arg1 - 1] != this.field6352[arg4][arg2 - 1][arg1 - 1]) {
                    this.field6352[arg4][arg2][arg1] = this.field6352[arg4][arg2 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field6352[arg4][arg2][arg1] = this.field6352[arg4][arg2][arg1 - 1];
        } else {
            this.field6352[arg4][arg2][arg1] = this.field6352[arg4][arg2 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([[IZI)V")
    public final void method2676(int[][] arg0, boolean arg1, int arg2) {
        field6359++;
        int[][] var4 = this.field6352[arg2];
        if (!arg1) {
            this.method2682(null, null, null, -95);
        }
        for (int var5 = 0; var5 < (this.field6351 + 1); var5++) {
            for (int var6 = 0; var6 < this.field6362 + 1; var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method2677(int arg0) {
        if (arg0 != -3053) {
            method2677(-43);
        }
        field6360 = null;
        field6358 = null;
        field6354 = null;
        field6355 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILee;I[Luu;IIIBI)V")
    public final void method2678(int arg0, int arg1, class675 arg2, int arg3, class285[] arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field6341++;
        int var11 = (arg6 & 0x7) * 8;
        int var12 = (arg1 & 0x7) * 8;
        if (!this.field6356) {
            class285 var13 = arg4[arg7];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class622.method3499((byte) 16, var14 & 0x7, var15 & 0x7, arg5) + arg3;
                    int var17 = class681.method3813(arg5, var15 & 0x7, 3, var14 & 0x7) + arg9;
                    if (var16 > 0 && this.field6351 - 1 > var16 && var17 > 0 && (this.field6362 - 1) > var17) {
                        var13.method1863((byte) -47, var17, var16);
                    }
                }
            }
        }
        int var18 = arg6 & 0x1FFFFFF8 << 3;
        int var19 = (arg1 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        if (arg8 >= -107) {
            return;
        }
        byte var21 = 0;
        if (arg5 == 1) {
            var21 = 1;
        } else if (arg5 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg5 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field6366; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg0 == var22 && var11 <= var23 && var23 <= (var11 + 8) && var12 <= var24 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg5 == 0) {
                                var26 = arg9 - (var12 - var24);
                                var25 = arg3 + var23 - var11;
                            } else if (arg5 == 1) {
                                var25 = arg3 + var24 - var12;
                                var26 = var11 + arg9 + 8 - var23;
                            } else if (arg5 == 2) {
                                var26 = var12 + arg9 + 8 - var24;
                                var25 = arg3 + 8 - (var23 - var11);
                            } else {
                                var25 = var12 + arg3 + 8 - var24;
                                var26 = var23 + arg9 - var11;
                            }
                            this.method2685(arg2, arg7, 0, true, 0, true, 0, var25, var19 + var24, var18 + var23, var26);
                        } else {
                            var25 = class622.method3499((byte) 16, var23 & 0x7, var24 & 0x7, arg5) + arg3;
                            var26 = class681.method3813(arg5, var24 & 0x7, 3, var23 & 0x7) + arg9;
                            this.method2685(arg2, arg7, arg5, true, var20, false, var21, var25, var19 + var24, var18 + var23, var26);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg5 == 0) {
                                    var32 = var29 + arg3 - var11;
                                    var31 = arg9 + var30 - var12;
                                } else if (arg5 == 1) {
                                    var32 = var30 + arg3 - var12;
                                    var31 = arg9 + var11 + 8 - var29;
                                } else if (arg5 == 2) {
                                    var32 = arg3 - (var29 - var11 - 8);
                                    var31 = var12 + arg9 + 8 - var30;
                                } else {
                                    var31 = var29 - (var11 - arg9);
                                    var32 = var12 + arg3 + 8 - var30;
                                }
                                if (var32 >= 0 && this.field6351 > var32 && var31 >= 0 && this.field6362 > var31) {
                                    this.field6352[arg7][var32][var31] = this.field6352[arg7][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2685(arg2, 0, 0, true, 0, false, 0, -1, 0, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ls;[[ILs;Lha;IBLs;)V")
    private final void method2679(class278 arg0, int[][] arg1, class278 arg2, class58 arg3, int arg4, byte arg5, class278 arg6) {
        field6333++;
        byte[][] var8 = this.field6363[arg4];
        byte[][] var9 = this.field6336[arg4];
        if (arg5 != -71) {
            this.field6350 = null;
        }
        byte[][] var10 = this.field6338[arg4];
        byte[][] var11 = this.field6350[arg4];
        for (int var12 = 0; var12 < this.field6351; var12++) {
            int var13 = this.field6351 - 1 <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field6362; var14++) {
                int var15 = this.field6362 - 1 > var14 ? var14 + 1 : var14;
                if (class349.field4945 == -1 || class325.method2113(var14, -1, arg4, var12, class349.field4945)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class192 var26 = var21 == 0 ? null : this.field6339.method792(arg5 + 75, var21 + -1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class293 var27 = var22 == 0 ? null : this.field6340.method2186(var22 - 1, true);
                        class192 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2562 == -1 && var26.field2558 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2574;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field6351 > var12 && var14 < this.field6362) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var32--;
                                var33--;
                            }
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var35--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var33--;
                                var36--;
                            }
                            int var37 = var33 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg2.method1816((byte) -102, var14, var12) - arg2.method1816((byte) 127, var15, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg2.method1816((byte) -14, var14, var13) - arg2.method1816((byte) 46, var15, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class347.field4913[var39] = -1;
                            class657.field9015[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2574 ? class427.field5996[var19] : class303.field4257[var19];
                        this.method2683(var20, var19, this.field6351, var8, var9, (byte) 116, var11, var27, var26, var12, this.field6362, var18, arg3, var14);
                        boolean var41 = var26 != null && var26.field2562 != var26.field2558;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class347.field4913[var42] >= 0 && class486.field6818[var42] != class325.field4510[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class278.method1808(var18[1], class286.method1877(class657.field9015[4], class657.field9015[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class278.method1808(var18[3], class286.method1877(class657.field9015[0], class657.field9015[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class278.method1808(var18[0], class286.method1877(class657.field9015[2], class657.field9015[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class278.method1808(var18[2], class286.method1877(class657.field9015[4], class657.field9015[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int var49;
                        if (var43) {
                            var46 = class562.field7890[var19];
                            var47 = class434.field6183[var19];
                            var48 = var27 == null ? 0 : class434.field6182[var19];
                            var49 = var26 == null ? 0 : class668.field9076[var19];
                            var45 = class498.field7156[var19];
                        } else if (var17) {
                            var45 = class450.field6377[var19];
                            var46 = class592.field8347[var19];
                            var47 = class473.field6720[var19];
                            var48 = var27 == null ? 0 : class489.field6914[var19];
                            var49 = var26 == null ? 0 : class228.field3066[var19];
                            var44 = class441.field6291[var19];
                        } else {
                            var46 = class515.field7348[var19];
                            var48 = var27 == null ? 0 : class429.field6121[var19];
                            var47 = class642.field8810[var19];
                            var44 = class423.field5963[var19];
                            var45 = class61.field749[var19];
                            var49 = var26 == null ? 0 : class757.field10524[var19];
                        }
                        int var50 = var48 + var49;
                        if (var50 <= 0) {
                            class745.method4149(arg4, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg0 == null ? null : new int[var53];
                            int[] var61 = arg0 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field2554;
                                var62 = var26.field2562;
                                var63 = var26.field2563;
                                int var65 = class684.method3832(arg3, true, var26);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = 1;
                                        class340.field4703[2] = var45[var51];
                                        class340.field4703[3] = 1;
                                        class340.field4703[4] = var47[var51];
                                        class340.field4703[5] = var45[var51];
                                        var99 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = 5;
                                        class340.field4703[2] = var45[var51];
                                        class340.field4703[3] = 5;
                                        class340.field4703[4] = var47[var51];
                                        var99 = 6;
                                        class340.field4703[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = 3;
                                        class340.field4703[2] = var45[var51];
                                        class340.field4703[3] = 3;
                                        class340.field4703[4] = var47[var51];
                                        class340.field4703[5] = var45[var51];
                                        var99 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = 7;
                                        class340.field4703[2] = var45[var51];
                                        class340.field4703[3] = 7;
                                        class340.field4703[4] = var47[var51];
                                        class340.field4703[5] = var45[var51];
                                        var99 = 6;
                                    } else {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = var47[var51];
                                        var99 = 3;
                                        class340.field4703[2] = var45[var51];
                                    }
                                    var51++;
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class340.field4703[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field6353[var101];
                                        int var104 = this.field6347[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var106 = 512 - var103;
                                            var105 = var104;
                                        } else if (var20 == 2) {
                                            var105 = 512 - var103;
                                            var106 = 512 - var104;
                                        } else if (var20 == 3) {
                                            var106 = var103;
                                            var105 = 512 - var104;
                                        } else {
                                            var106 = var104;
                                            var105 = var103;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var106;
                                        if (var60 != null && class705.field9809[var19][var101]) {
                                            int var107 = (var12 << 9) + var105;
                                            int var108 = (var14 << 9) + var106;
                                            var60[var52] = arg0.method1815(var108, var107, 119) - arg2.method1815(var108, var107, -11);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class705.field9809[var19][var101]) {
                                                int var109 = (var12 << 9) + var105;
                                                int var110 = (var14 << 9) + var106;
                                                var61[var52] = arg2.method1815(var110, var109, 69) - arg0.method1815(var110, var109, -125);
                                            } else if (arg6 != null && !class677.field9253[var19][var101]) {
                                                int var111 = (var12 << 9) + var105;
                                                int var112 = (var14 << 9) + var106;
                                                var61[var52] = arg6.method1815(var112, var111, 64) - arg2.method1815(var112, var111, -125);
                                            }
                                        }
                                        if (var101 < 8 && class347.field4913[var102] > var26.field2567) {
                                            if (var54 != null) {
                                                var54[var52] = class486.field6818[var102];
                                            }
                                            var59[var52] = class138.field2002[var102];
                                            var58[var52] = class491.field6925[var102];
                                            var57[var52] = class325.field4510[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field2563;
                                            var59[var52] = var26.field2554;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field6356 && arg4 == 0) {
                                    class348.method2248(var12, var14, var26.field2569, var26.field2559 * 8, var26.field2573);
                                }
                                if (var19 != 12 && var26.field2562 != -1 && var26.field2557) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class668.field9076[var19];
                            } else if (var17) {
                                var51 += class228.field3066[var19];
                            } else {
                                var51 += class757.field10524[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class293 var67 = this.field6340.method2186(var22 - 1, true);
                                class293 var68 = this.field6340.method2186(var23 - 1, true);
                                class293 var69 = this.field6340.method2186(var24 - 1, true);
                                class293 var70 = this.field6340.method2186(var25 - 1, true);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = 1;
                                        class340.field4703[2] = var45[var51];
                                        class340.field4703[3] = 1;
                                        class340.field4703[4] = var47[var51];
                                        var73 = 6;
                                        class340.field4703[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = 5;
                                        class340.field4703[2] = var45[var51];
                                        class340.field4703[3] = 5;
                                        class340.field4703[4] = var47[var51];
                                        class340.field4703[5] = var45[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = 3;
                                        class340.field4703[2] = var45[var51];
                                        class340.field4703[3] = 3;
                                        class340.field4703[4] = var47[var51];
                                        class340.field4703[5] = var45[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = 7;
                                        class340.field4703[2] = var45[var51];
                                        class340.field4703[3] = 7;
                                        class340.field4703[4] = var47[var51];
                                        var73 = 6;
                                        class340.field4703[5] = var45[var51];
                                    } else {
                                        class340.field4703[0] = var46[var51];
                                        class340.field4703[1] = var47[var51];
                                        class340.field4703[2] = var45[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class340.field4703[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field6353[var75];
                                        int var78 = this.field6347[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 512 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var80 = 512 - var77;
                                            var79 = 512 - var78;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 512 - var78;
                                        } else {
                                            var79 = var78;
                                            var80 = var77;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class705.field9809[var19][var75]) {
                                            int var81 = (var12 << 9) + var80;
                                            int var82 = (var14 << 9) + var79;
                                            var60[var52] = arg0.method1815(var82, var81, class286.method1875(arg5, 63)) - arg2.method1815(var82, var81, -125);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class705.field9809[var19][var75]) {
                                                int var83 = (var12 << 9) + var80;
                                                int var84 = (var14 << 9) + var79;
                                                var61[var52] = arg2.method1815(var84, var83, 103) - arg0.method1815(var84, var83, -124);
                                            } else if (arg6 != null && !class677.field9253[var19][var75]) {
                                                int var85 = (var12 << 9) + var80;
                                                int var86 = (var14 << 9) + var79;
                                                var61[var52] = arg6.method1815(var86, var85, -126) - arg2.method1815(var86, var85, -26);
                                            }
                                        }
                                        if (var75 < 8 && class347.field4913[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class486.field6818[var76];
                                            }
                                            var59[var52] = class138.field2002[var76];
                                            var58[var52] = class491.field6925[var76];
                                            var57[var52] = class325.field4510[var76];
                                        } else {
                                            if (var17 && class705.field9809[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg1[var12][var14];
                                                var58[var52] = var67.field4112;
                                                var59[var52] = var67.field4113;
                                            } else if (var80 == 0 && var79 == 512) {
                                                var57[var52] = arg1[var12][var15];
                                                var58[var52] = var68.field4112;
                                                var59[var52] = var68.field4113;
                                            } else if (var80 == 512 && var79 == 512) {
                                                var57[var52] = arg1[var13][var15];
                                                var58[var52] = var69.field4112;
                                                var59[var52] = var69.field4113;
                                            } else if (var80 == 512 && var79 == 0) {
                                                var57[var52] = arg1[var13][var14];
                                                var58[var52] = var70.field4112;
                                                var59[var52] = var70.field4113;
                                            } else {
                                                if (var80 < 256) {
                                                    if (var79 < 256) {
                                                        var58[var52] = var67.field4112;
                                                        var59[var52] = var67.field4113;
                                                    } else {
                                                        var58[var52] = var68.field4112;
                                                        var59[var52] = var68.field4113;
                                                    }
                                                } else if (var79 >= 256) {
                                                    var58[var52] = var69.field4112;
                                                    var59[var52] = var69.field4113;
                                                } else {
                                                    var58[var52] = var70.field4112;
                                                    var59[var52] = var70.field4113;
                                                }
                                                int var87 = class261.method1706(arg1[var13][var14], (byte) 101, arg1[var12][var14], var80 << 7 >> 9);
                                                int var88 = class261.method1706(arg1[var13][var15], (byte) 79, arg1[var12][var15], var80 << 7 >> 9);
                                                var57[var52] = class261.method1706(var88, (byte) 50, var87, var79 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field4115) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg2.method1816((byte) 125, var14, var12);
                            int var90 = arg2.method1816((byte) 123, var14, var13);
                            int var91 = arg2.method1816((byte) 125, var15, var13);
                            int var92 = arg2.method1816((byte) 48, var15, var12);
                            boolean var93 = class364.method2319((byte) -70, var12, var14);
                            if (var93 && arg4 > 1 || !var93 && arg4 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field4123) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field2570) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field6343[arg4][var12][var14] = (byte) class325.method2116(this.field6343[arg4][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field6356) {
                                var95 = class438.method2646(var12, var14);
                                var96 = class226.method1414(var12, var14);
                                var97 = class356.method2291(var12, var14);
                            }
                            arg2.method1818(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class745.method4149(arg4, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lee;IIII[Luu;I)V")
    public final void method2680(class675 arg0, int arg1, int arg2, int arg3, int arg4, class285[] arg5, int arg6) {
        field6364++;
        if (!this.field6356) {
            for (int var8 = 0; var8 < 4; var8++) {
                class285 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg2 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && var12 < this.field6351 && var13 >= 0 && var13 < this.field6362) {
                            var9.method1863((byte) -47, var13, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg2 + arg6;
        int var15 = arg1 + arg4;
        for (int var16 = arg3; var16 < this.field6366; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2685(arg0, var16, 0, true, 0, false, 0, arg2 + var17, var15 + var18, var14 + var17, arg1 + var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ls;Lha;[[IIILs;Ls;)V")
    private final void method2681(class278 arg0, class58 arg1, int[][] arg2, int arg3, int arg4, class278 arg5, class278 arg6) {
        int var8 = 0;
        if (arg3 != 1) {
            this.method2683(-122, -119, 16, null, null, (byte) -110, null, null, null, 93, -101, null, null, -11);
        }
        while (var8 < this.field6351) {
            for (int var9 = 0; var9 < this.field6362; var9++) {
                if (class349.field4945 == -1 || class325.method2113(var9, -1, arg4, var8, class349.field4945)) {
                    byte var10 = this.field6363[arg4][var8][var9];
                    byte var11 = this.field6336[arg4][var8][var9];
                    int var12 = this.field6350[arg4][var8][var9] & 0xFF;
                    int var13 = this.field6338[arg4][var8][var9] & 0xFF;
                    class192 var14 = var12 == 0 ? null : this.field6339.method792(4, var12 - 1);
                    class293 var15 = var13 == 0 ? null : this.field6340.method2186(var13 - 1, true);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class668.field9076[var10];
                        var16 = var15 == null ? 0 : class434.field6182[var10];
                    } else if (var14 != null) {
                        var17 = class668.field9076[var10];
                    } else if (var15 != null) {
                        var16 = class668.field9076[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20 = var14 == null ? -1 : var14.field2563;
                        int var21 = var15 == null ? -1 : var15.field4112;
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        int[] var25 = new int[var18];
                        boolean var26 = false;
                        boolean var27 = false;
                        if (var14 != null && (var14.field2562 != -1 || var14.field2558 != -1 || var20 != -1)) {
                            for (int var28 = 0; var28 < var17; var28++) {
                                var24[var19] = var20;
                                var25[var19] = var14.field2554;
                                if (var14.field2562 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field2562;
                                }
                                if (var14.field2558 == -1) {
                                    var23[var19] = -1;
                                } else {
                                    var26 = true;
                                    var23[var19] = var14.field2558;
                                }
                                var19++;
                            }
                            if (!this.field6356 && arg4 == 0) {
                                class348.method2248(var8, var9, var14.field2569, var14.field2559 * 8, var14.field2573);
                            }
                        } else {
                            var27 = true;
                            for (int var29 = 0; var29 < var17; var29++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        }
                        if (!var26) {
                            var23 = null;
                        }
                        if (var15 == null) {
                            if (var27) {
                                continue;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        } else {
                            for (int var31 = 0; var31 < var16; var31++) {
                                var24[var19] = var21;
                                var25[var19] = var15.field4113;
                                var22[var19] = arg2[var8][var9];
                                if (var23 != null) {
                                    var23[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var32 = this.field6353.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg0 == null ? null : new int[var32];
                        int[] var36 = arg0 == null && arg6 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var47 = this.field6353[var37];
                            int var48 = this.field6347[var37];
                            if (var11 == 0) {
                                var33[var37] = var47;
                                var34[var37] = var48;
                            } else if (var11 == 1) {
                                var33[var37] = var48;
                                var34[var37] = 512 - var47;
                            } else if (var11 == 2) {
                                var33[var37] = 512 - var47;
                                var34[var37] = 512 - var48;
                            } else if (var11 == 3) {
                                var33[var37] = 512 - var48;
                                var34[var37] = var47;
                            }
                            if (var35 != null && class705.field9809[var10][var37]) {
                                int var51 = (var8 << 9) + var33[var37];
                                int var52 = (var9 << 9) + var34[var37];
                                var35[var37] = arg0.method1815(var52, var51, -127) - arg5.method1815(var52, var51, -127);
                            }
                            if (var36 != null) {
                                if (arg0 != null && !class705.field9809[var10][var37]) {
                                    int var53 = (var8 << 9) + var33[var37];
                                    int var54 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg5.method1815(var54, var53, 45) - arg0.method1815(var54, var53, 3);
                                } else if (arg6 != null && !class677.field9253[var10][var37]) {
                                    int var55 = (var8 << 9) + var33[var37];
                                    int var56 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg6.method1815(var56, var55, 82) - arg5.method1815(var56, var55, -123);
                                }
                            }
                        }
                        int var38 = arg5.method1816((byte) 123, var9, var8);
                        int var39 = arg5.method1816((byte) 127, var9, var8 + 1);
                        int var40 = arg5.method1816((byte) -41, var9 + 1, var8 - -1);
                        int var41 = arg5.method1816((byte) 126, var9 + 1, var8);
                        boolean var42 = class364.method2319((byte) -57, var8, var9);
                        if (var42 && arg4 > 1 || !var42 && arg4 > 0) {
                            boolean var43 = true;
                            if (var15 != null && !var15.field4123) {
                                var43 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var43 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field2570) {
                                var43 = false;
                            }
                            if (var43 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field6343[arg4][var8][var9] = (byte) class325.method2116(this.field6343[arg4][var8][var9], 4);
                            }
                        }
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        if (this.field6356) {
                            var44 = class438.method2646(var8, var9);
                            var45 = class226.method1414(var8, var9);
                            var46 = class356.method2291(var8, var9);
                        }
                        arg5.method1825(var8, var9, var33, var35, var34, var36, class562.field7890[var10], class434.field6183[var10], class498.field7156[var10], var22, var23, var24, var25, var44, var45, var46, false);
                        class745.method4149(arg4, var8, var9);
                    }
                }
            }
            var8++;
        }
        field6348++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Luu;[[[ILha;I)V")
    public final void method2682(class285[] arg0, int[][][] arg1, class58 arg2, int arg3) {
        int var5 = 37 / ((arg3 + 54) / 33);
        field6357++;
        if (!this.field6356) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < this.field6351; var7++) {
                    for (int var8 = 0; var8 < this.field6362; var8++) {
                        if ((class651.field8948[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class651.field8948[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg0[var9].method1867(var7, false, var8);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < this.field6366; var10++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field6356) {
                if (class106.field1275) {
                    var11 |= 0x2;
                }
                if (class534.field7517) {
                    var12 |= 0x8;
                }
                if (class138.field2004 != 0) {
                    if (var10 == 0 | class454.field6419) {
                        var12 |= 0x10;
                    }
                    var11 |= 0x1;
                }
            }
            if (class106.field1275) {
                var12 |= 0x7;
            }
            if (!class195.field2596) {
                var12 |= 0x20;
            }
            int[][] var13 = arg1 == null || var10 >= arg1.length ? this.field6352[var10] : arg1[var10];
            class242.method1547(var10, arg2.method419(this.field6351, this.field6362, this.field6352[var10], var13, 512, var11, var12));
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[[B[[BB[[BLtr;Lme;II[ZLha;I)V")
    private final void method2683(int arg0, int arg1, int arg2, byte[][] arg3, byte[][] arg4, byte arg5, byte[][] arg6, class293 arg7, class192 arg8, int arg9, int arg10, boolean[] arg11, class58 arg12, int arg13) {
        field6345++;
        boolean[] var15 = arg8 != null && arg8.field2574 ? class427.field5996[arg1] : class303.field4257[arg1];
        if (arg13 > 0) {
            if (arg9 > 0) {
                int var16 = arg6[arg9 - 1][arg13 - 1] & 0xFF;
                if (var16 > 0) {
                    class192 var17 = this.field6339.method792(4, var16 - 1);
                    if (var17.field2562 != -1 && var17.field2574) {
                        byte var18 = arg3[arg9 - 1][arg13 - 1];
                        int var19 = arg4[arg9 - 1][arg13 - 1] * 2 + 4 & 0x7;
                        int var20 = class684.method3832(arg12, true, var17);
                        if (class705.field9809[var18][var19]) {
                            class325.field4510[0] = var17.field2562;
                            class486.field6818[0] = var20;
                            class491.field6925[0] = var17.field2563;
                            class138.field2002[0] = var17.field2554;
                            class347.field4913[0] = var17.field2567;
                            class657.field9015[0] = 256;
                        }
                    }
                }
            }
            if (arg9 < arg2 - 1) {
                int var21 = arg6[arg9 + 1][arg13 - 1] & 0xFF;
                if (var21 > 0) {
                    class192 var22 = this.field6339.method792(4, var21 - 1);
                    if (var22.field2562 != -1 && var22.field2574) {
                        byte var23 = arg3[arg9 + 1][arg13 - 1];
                        int var24 = (arg4[arg9 + 1][arg13 - 1] * 2) + 6 & 0x7;
                        int var25 = class684.method3832(arg12, true, var22);
                        if (class705.field9809[var23][var24]) {
                            class325.field4510[2] = var22.field2562;
                            class486.field6818[2] = var25;
                            class491.field6925[2] = var22.field2563;
                            class138.field2002[2] = var22.field2554;
                            class347.field4913[2] = var22.field2567;
                            class657.field9015[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg13 < (arg10 - 1)) {
            if (arg9 > 0) {
                int var26 = arg6[arg9 - 1][arg13 + 1] & 0xFF;
                if (var26 > 0) {
                    class192 var27 = this.field6339.method792(4, var26 - 1);
                    if (var27.field2562 != -1 && var27.field2574) {
                        byte var28 = arg3[arg9 - 1][arg13 + 1];
                        int var29 = (arg4[arg9 - 1][arg13 + 1] * 2) + 2 & 0x7;
                        int var30 = class684.method3832(arg12, true, var27);
                        if (class705.field9809[var28][var29]) {
                            class325.field4510[6] = var27.field2562;
                            class486.field6818[6] = var30;
                            class491.field6925[6] = var27.field2563;
                            class138.field2002[6] = var27.field2554;
                            class347.field4913[6] = var27.field2567;
                            class657.field9015[6] = 64;
                        }
                    }
                }
            }
            if (arg9 < (arg2 - 1)) {
                int var31 = arg6[arg9 + 1][arg13 + 1] & 0xFF;
                if (var31 > 0) {
                    class192 var32 = this.field6339.method792(4, var31 - 1);
                    if (var32.field2562 != -1 && var32.field2574) {
                        byte var33 = arg3[arg9 + 1][arg13 + 1];
                        int var34 = arg4[arg9 + 1][arg13 + 1] * 2 & 0x7;
                        int var35 = class684.method3832(arg12, true, var32);
                        if (class705.field9809[var33][var34]) {
                            class325.field4510[4] = var32.field2562;
                            class486.field6818[4] = var35;
                            class491.field6925[4] = var32.field2563;
                            class138.field2002[4] = var32.field2554;
                            class347.field4913[4] = var32.field2567;
                            class657.field9015[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var36 = arg6[arg9][arg13 - 1] & 0xFF;
            if (var36 > 0) {
                class192 var37 = this.field6339.method792(4, var36 - 1);
                if (var37.field2562 != -1) {
                    byte var38 = arg3[arg9][arg13 - 1];
                    byte var39 = arg4[arg9][arg13 - 1];
                    if (var37.field2574) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class684.method3832(arg12, true, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class705.field9809[var38][var41] && var37.field2567 >= class347.field4913[var40]) {
                                class325.field4510[var40] = var37.field2562;
                                class486.field6818[var40] = var42;
                                class491.field6925[var40] = var37.field2563;
                                class138.field2002[var40] = var37.field2554;
                                if (class347.field4913[var40] == var37.field2567) {
                                    class657.field9015[var40] = class325.method2116(class657.field9015[var40], 32);
                                } else {
                                    class657.field9015[var40] = 32;
                                }
                                class347.field4913[var40] = var37.field2567;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg0 & 0x3]) {
                            arg11[0] = class427.field5996[var38][class286.method1877(3, var39 + 2)];
                        }
                    } else if (!var15[arg0 & 0x3]) {
                        arg11[0] = class303.field4257[var38][class286.method1877(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg13 < (arg10 - 1)) {
            int var44 = arg6[arg9][arg13 + 1] & 0xFF;
            if (var44 > 0) {
                class192 var45 = this.field6339.method792(4, var44 - 1);
                if (var45.field2562 != -1) {
                    byte var46 = arg3[arg9][arg13 + 1];
                    byte var47 = arg4[arg9][arg13 + 1];
                    if (var45.field2574) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class684.method3832(arg12, true, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class705.field9809[var46][var49] && class347.field4913[var48] <= var45.field2567) {
                                class325.field4510[var48] = var45.field2562;
                                class486.field6818[var48] = var50;
                                class491.field6925[var48] = var45.field2563;
                                class138.field2002[var48] = var45.field2554;
                                if (class347.field4913[var48] == var45.field2567) {
                                    class657.field9015[var48] = class325.method2116(class657.field9015[var48], 16);
                                } else {
                                    class657.field9015[var48] = 16;
                                }
                                class347.field4913[var48] = var45.field2567;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg0 + 2 & 0x3]) {
                            arg11[2] = class427.field5996[var46][class286.method1877(var47, 3)];
                        }
                    } else if (!var15[arg0 + 2 & 0x3]) {
                        arg11[2] = class303.field4257[var46][class286.method1877(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg9 > 0) {
            int var52 = arg6[arg9 - 1][arg13] & 0xFF;
            if (var52 > 0) {
                class192 var53 = this.field6339.method792(4, var52 - 1);
                if (var53.field2562 != -1) {
                    byte var54 = arg3[arg9 - 1][arg13];
                    byte var55 = arg4[arg9 - 1][arg13];
                    if (var53.field2574) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class684.method3832(arg12, true, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class705.field9809[var54][var57] && class347.field4913[var56] <= var53.field2567) {
                                class325.field4510[var56] = var53.field2562;
                                class486.field6818[var56] = var58;
                                class491.field6925[var56] = var53.field2563;
                                class138.field2002[var56] = var53.field2554;
                                if (class347.field4913[var56] == var53.field2567) {
                                    class657.field9015[var56] = class325.method2116(class657.field9015[var56], 8);
                                } else {
                                    class657.field9015[var56] = 8;
                                }
                                class347.field4913[var56] = var53.field2567;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg0 + 3 & 0x3]) {
                            arg11[3] = class427.field5996[var54][class286.method1877(var55 + 1, 3)];
                        }
                    } else if (!var15[arg0 + 3 & 0x3]) {
                        arg11[3] = class303.field4257[var54][class286.method1877(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg5 < 115) {
            this.method2679(null, null, null, null, 8, (byte) 94, null);
        }
        if (arg9 < arg2 - 1) {
            int var60 = arg6[arg9 + 1][arg13] & 0xFF;
            if (var60 > 0) {
                class192 var61 = this.field6339.method792(4, var60 - 1);
                if (var61.field2562 != -1) {
                    byte var62 = arg3[arg9 + 1][arg13];
                    byte var63 = arg4[arg9 + 1][arg13];
                    if (var61.field2574) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class684.method3832(arg12, true, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class705.field9809[var62][var65] && class347.field4913[var64] <= var61.field2567) {
                                class325.field4510[var64] = var61.field2562;
                                class486.field6818[var64] = var66;
                                class491.field6925[var64] = var61.field2563;
                                class138.field2002[var64] = var61.field2554;
                                if (class347.field4913[var64] == var61.field2567) {
                                    class657.field9015[var64] = class325.method2116(class657.field9015[var64], 4);
                                } else {
                                    class657.field9015[var64] = 4;
                                }
                                class347.field4913[var64] = var61.field2567;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg0 + 1 & 0x3]) {
                            arg11[1] = class427.field5996[var62][class286.method1877(var63 + 3, 3)];
                        }
                    } else if (!var15[arg0 + 1 & 0x3]) {
                        arg11[1] = class303.field4257[var62][class286.method1877(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var68 = class684.method3832(arg12, true, arg8);
        if (!arg8.field2574) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg0 * 2) & 0x7;
            if (class705.field9809[arg1][var69] && class347.field4913[var70] <= arg8.field2567) {
                class325.field4510[var70] = arg8.field2562;
                class486.field6818[var70] = var68;
                class491.field6925[var70] = arg8.field2563;
                class138.field2002[var70] = arg8.field2554;
                if (class347.field4913[var70] == arg8.field2567) {
                    class657.field9015[var70] = class325.method2116(class657.field9015[var70], 2);
                } else {
                    class657.field9015[var70] = 2;
                }
                class347.field4913[var70] = arg8.field2567;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ls;ILha;Ls;)V")
    public final void method2684(class278 arg0, int arg1, class58 arg2, class278 arg3) {
        field6335++;
        if (arg1 != -1) {
            return;
        }
        if (class278.field3937 == null || class278.field3937.length != this.field6362) {
            class278.field3937 = new int[this.field6362];
            class124.field1496 = new int[this.field6362];
            class462.field6506 = new int[this.field6362];
            class543.field7582 = new int[this.field6362];
            class603.field8477 = new int[this.field6362];
        }
        int[][] var5 = new int[this.field6351][this.field6362];
        for (int var6 = 0; var6 < this.field6366; var6++) {
            for (int var8 = 0; var8 < this.field6362; var8++) {
                class278.field3937[var8] = 0;
                class543.field7582[var8] = 0;
                class462.field6506[var8] = 0;
                class603.field8477[var8] = 0;
                class124.field1496[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field6351; var9++) {
                for (int var10 = 0; var10 < this.field6362; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field6351 > var19) {
                        int var20 = this.field6338[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class293 var21 = this.field6340.method2186(var20 - 1, true);
                            class278.field3937[var10] += var21.field4119;
                            class543.field7582[var10] += var21.field4120;
                            class462.field6506[var10] += var21.field4125;
                            class603.field8477[var10] += var21.field4124;
                            var10002 = class124.field1496[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field6338[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class293 var24 = this.field6340.method2186(var23 - 1, true);
                            class278.field3937[var10] -= var24.field4119;
                            class543.field7582[var10] -= var24.field4120;
                            class462.field6506[var10] -= var24.field4125;
                            class603.field8477[var10] -= var24.field4124;
                            var10002 = class124.field1496[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field6362; var16++) {
                        int var17 = var16 + 5;
                        if (this.field6362 > var17) {
                            var15 += class124.field1496[var17];
                            var13 += class462.field6506[var17];
                            var11 += class278.field3937[var17];
                            var12 += class543.field7582[var17];
                            var14 += class603.field8477[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class543.field7582[var18];
                            var14 -= class603.field8477[var18];
                            var13 -= class462.field6506[var18];
                            var11 -= class278.field3937[var18];
                            var15 -= class124.field1496[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class478.method2858(var12 / var15, -1260895222, var13 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class299.field4222) {
                this.method2679(var6 == 0 ? arg3 : null, var5, class459.field6474[var6], arg2, var6, (byte) -71, var6 == 0 ? arg0 : null);
            } else {
                this.method2681(var6 == 0 ? arg3 : null, arg2, var5, 1, var6, class459.field6474[var6], var6 == 0 ? arg0 : null);
            }
            this.field6338[var6] = null;
            this.field6350[var6] = null;
            this.field6363[var6] = null;
            this.field6336[var6] = null;
        }
        if (!this.field6356) {
            if (class138.field2004 != 0) {
                class465.method2779();
            }
            if (class106.field1275) {
                class106.method760();
            }
        }
        for (int var7 = 0; var7 < this.field6366; var7++) {
            class459.field6474[var7].method1821();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lee;IIZIZIIIII)V")
    private final void method2685(class675 arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg2 == 1) {
            arg6 = 1;
        } else if (arg2 == 2) {
            arg4 = 1;
            arg6 = 1;
        } else if (arg2 == 3) {
            arg4 = 1;
        }
        field6346++;
        if (!arg3) {
            this.method2684(null, 30, null, null);
        }
        if (arg7 < 0 || arg7 >= this.field6351 || arg10 < 0 || arg10 >= this.field6362) {
            while (true) {
                int var14 = arg0.method3750((byte) 35);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg0.method3750((byte) 35);
                    return;
                }
                if (var14 <= 49) {
                    arg0.method3750((byte) 35);
                }
            }
        }
        if (!this.field6356 && !arg5) {
            class651.field8948[arg1][arg7][arg10] = 0;
        }
        while (true) {
            int var12 = arg0.method3750((byte) 35);
            if (var12 == 0) {
                if (this.field6356) {
                    this.field6352[0][arg7 + arg4][arg6 + arg10] = 0;
                    return;
                } else if (arg1 == 0) {
                    this.field6352[0][arg7 + arg4][arg10 + arg6] = -class135.method960(false, arg9 + 932731, arg8 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field6352[arg1][arg4 + arg7][arg10 + arg6] = this.field6352[arg1 - 1][arg4 + arg7][arg6 + arg10] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg0.method3750((byte) 35);
                if (!this.field6356) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg1 == 0) {
                        this.field6352[0][arg4 + arg7][arg6 + arg10] = -var13 * 8 << 2;
                        return;
                    }
                    this.field6352[arg1][arg4 + arg7][arg6 + arg10] = this.field6352[arg1 - 1][arg7 + arg4][arg6 + arg10] - (var13 * 8 << 2);
                    return;
                }
                this.field6352[0][arg4 + arg7][arg10 + arg6] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg5) {
                    arg0.method3750((byte) 35);
                } else {
                    this.field6350[arg1][arg7][arg10] = arg0.method3719(1854307120);
                    this.field6363[arg1][arg7][arg10] = (byte) ((var12 - 2) / 4);
                    this.field6336[arg1][arg7][arg10] = (byte) class286.method1877(3, arg2 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field6356 && !arg5) {
                    class651.field8948[arg1][arg7][arg10] = (byte) (var12 - 49);
                }
            } else if (!arg5) {
                this.field6338[arg1][arg7][arg10] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIII)V")
    public static final void method2686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6349++;
        int var6 = arg0;
        int var7 = arg2;
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg0 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (arg0 + 1) * var16;
        class643.method3557(arg4 - arg1, class445.field6320[arg3], (byte) 58, arg5, arg4 + arg1);
        int var20 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class643.method3557(var24, class445.field6320[var21], (byte) 91, arg5, var23);
            class643.method3557(var24, class445.field6320[var22], (byte) 66, arg5, var23);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIB)V")
    public final void method2687(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6344++;
        int var6 = -68 % ((arg4 - 38) / 61);
        for (int var7 = 0; var7 < this.field6366; var7++) {
            this.method2675(arg3, arg0, arg2, arg1, var7, 29274);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIZLri;Lvu;)V")
    public class448(int arg0, int arg1, int arg2, boolean arg3, class111 arg4, class337 arg5) {
        this.field6340 = arg5;
        this.field6356 = arg3;
        this.field6339 = arg4;
        this.field6366 = arg0;
        this.field6351 = arg1;
        this.field6362 = arg2;
        this.field6363 = new byte[this.field6366][this.field6351][this.field6362];
        this.field6338 = new byte[this.field6366][this.field6351][this.field6362];
        this.field6352 = new int[this.field6366][this.field6351 + 1][this.field6362 + 1];
        this.field6343 = new byte[this.field6366][this.field6351 + 1][this.field6362 + 1];
        this.field6336 = new byte[this.field6366][this.field6351][this.field6362];
        this.field6350 = new byte[this.field6366][this.field6351][this.field6362];
    }
}
