import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class33 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Z")
    public boolean field391 = true;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Z")
    public static boolean field387 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[I")
    public static int[] field392;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)[Lch;", line = 5)
    public static final class158[] method227(int arg0) {
        class158[] var1 = new class158[class10.field101];
        for (int var2 = arg0; var2 < class10.field101; var2++) {
            int var3 = class259.field4093[var2] * class245.field3855[var2];
            byte[] var4 = class14.field145[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class251.field3978[class261.method1840(255, var4[var6])];
            }
            var1[var2] = new class158(class122.field1683, class253.field4004, class110.field1518[var2], field392[var2], class245.field3855[var2], class259.field4093[var2], var5);
        }
        field379++;
        class99.method627(3735);
        return var1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 44)
    public static final void method228(boolean arg0, byte arg1, String arg2) {
        field381++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg0 ? 32768 : 0;
        int var6 = var5 + (arg0 ? class309.field4844 : class293.field4613);
        int var7 = 0;
        for (int var8 = var5; var8 < var6; var8++) {
            class328 var9 = class259.method1822(128, var8);
            if (var9.field5272 && var9.method2286((byte) 12).toLowerCase().indexOf(var3) != -1) {
                if (var7 >= 50) {
                    class181.field2733 = null;
                    class142.field2217 = -1;
                    return;
                }
                if (var4.length <= var7) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var7; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var7++] = (short) var8;
            }
        }
        class181.field2733 = var4;
        class142.field2217 = var7;
        String[] var12 = new String[class142.field2217];
        class279.field4387 = 0;
        if (arg1 <= 102) {
            method231((class262[]) null, 48, false, (int[][][]) ((int[][][]) null));
        }
        for (int var13 = 0; var13 < class142.field2217; var13++) {
            var12[var13] = class259.method1822(128, var4[var13]).method2286((byte) 12);
        }
        class5.method33((byte) -119, class181.field2733, var12);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([[I[[I[[I[[[I[[BI[[F[[II[[B[[I[[B[[F[[F[[B[[[B)[Lwb;", line = 125)
    private static final class175[] method229(int[][] arg0, int[][] arg1, int[][] arg2, int[][][] arg3, byte[][] arg4, int arg5, float[][] arg6, int[][] arg7, int arg8, byte[][] arg9, int[][] arg10, byte[][] arg11, float[][] arg12, float[][] arg13, byte[][] arg14, byte[][][] arg15) {
        field384++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg3 != null) {
                    int var20 = arg3[arg8][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x6) >> 1;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg14[var17][var18];
                    if (var22 == 0) {
                        var22 = arg14[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg14[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg14[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg14[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg14[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg14[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg14[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg14[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg14[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg14[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg14[var17][var18];
                    }
                } else {
                    var22 = arg14[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg14[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg14[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg14[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class199 var23 = class250.method1783((byte) -61, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field3020 + 1 << 16) + var23.field3019;
                }
            }
        }
        class117 var24 = new class117(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg14[var25][var26] != 0) {
                    int[] var27;
                    if (arg11[var25][var26] == 0) {
                        var27 = class279.field4400[0];
                    } else {
                        var27 = class110.field1520[arg9[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = var16[var25][var26];
                    int var29 = var16[var25 + 1][var26 + 1];
                    int var30 = var16[var25][var26 + 1];
                    int var31 = var16[var25 + 1][var26];
                    int var32 = 0;
                    if (arg10 != null) {
                        var32 = arg10[var25][var26] & 0xFFFFFF;
                    }
                    long var33 = (long) var32 | (long) var28 << 32;
                    long var35 = (long) var31 << 32 | (long) var32;
                    int var37 = var27.length / 2;
                    long var38 = (long) var29 << 32 | (long) var32;
                    class175 var40 = (class175) var24.method770(var33, 68);
                    if (var40 == null) {
                        var40 = new class175((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg2 != null, var32);
                        var24.method764(24369, var40, var33);
                    }
                    var40.field2649++;
                    var40.field2661 += var37;
                    if (var33 != var35) {
                        class175 var41 = (class175) var24.method770(var35, -94);
                        if (var41 == null) {
                            var41 = new class175((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg2 != null, var32);
                            var24.method764(24369, var41, var35);
                        }
                        var41.field2661 += var37;
                        var41.field2649++;
                    }
                    long var42 = (long) var32 | (long) var30 << 32;
                    if (var33 != var38 && var35 != var38) {
                        class175 var44 = (class175) var24.method770(var38, 93);
                        if (var44 == null) {
                            var44 = new class175((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg2 != null, var32);
                            var24.method764(24369, var44, var38);
                        }
                        var44.field2661 += var37;
                        var44.field2649++;
                    }
                    if (var33 != var42 && var35 != var42 && var38 != var42) {
                        class175 var45 = (class175) var24.method770(var42, 80);
                        if (var45 == null) {
                            var45 = new class175((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg2 != null, var32);
                            var24.method764(24369, var45, var42);
                        }
                        var45.field2649++;
                        var45.field2661 += var37;
                    }
                }
            }
        }
        for (class175 var46 = (class175) var24.method761(85); var46 != null; var46 = (class175) var24.method757(-1)) {
            var46.method1218();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg14[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg15[arg8][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg15[1][var47][var48] & 0x2) == 2 && arg8 > 0) {
                        var50 = arg8 - 1;
                    } else {
                        var50 = arg8;
                    }
                    int var51 = 0;
                    int var52 = 128;
                    if (arg10 != null) {
                        var51 = arg10[var47][var48] & 0xFFFFFF;
                        var52 = arg10[var47][var48] >>> 24 << 3;
                    }
                    boolean[] var53 = null;
                    int[] var55;
                    byte var65;
                    if (arg11[var47][var48] == 0) {
                        byte var54 = 0;
                        var55 = class279.field4400[0];
                        int var56 = var54 + (arg14[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var57 = 0;
                        byte var58 = 0;
                        byte var59 = 0;
                        int var60 = var57 + (arg14[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        int var61 = var59 + (arg14[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        int var62 = var58 + (arg14[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg14[var47][var48 - 1] == var49) {
                            var60++;
                            var56++;
                        } else {
                            var60--;
                            var56--;
                        }
                        if (arg14[var47 + 1][var48] == var49) {
                            var60++;
                            var62++;
                        } else {
                            var60--;
                            var62--;
                        }
                        if (arg14[var47][var48 + 1] == var49) {
                            var62++;
                            var61++;
                        } else {
                            var62--;
                            var61--;
                        }
                        if (arg14[var47 - 1][var48] == var49) {
                            var56++;
                            var61++;
                        } else {
                            var61--;
                            var56--;
                        }
                        int var63 = var60 - var61;
                        if (var63 < 0) {
                            var63 = -var63;
                        }
                        int var64 = var56 - var62;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        var65 = (byte) (var63 > var64 ? 1 : 0);
                        arg4[var47][var48] = var65;
                    } else {
                        var53 = class140.field2137[arg9[var47][var48]];
                        var55 = class110.field1520[arg9[var47][var48]];
                        var65 = arg4[var47][var48];
                        if (var55.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47 + 1][var48];
                    int var67 = var16[var47 + 1][var48 + 1];
                    int var68 = var16[var47][var48];
                    int var69 = var16[var47][var48 + 1];
                    long var70 = (long) var66 << 32 | (long) var51;
                    long var72 = (long) var51 | (long) var67 << 32;
                    int var74 = arg0[var47][var48];
                    long var75 = (long) var51 | (long) var68 << 32;
                    int var77 = arg0[var47 + 1][var48];
                    long var78 = (long) var69 << 32 | (long) var51;
                    int var80 = arg0[var47 + 1][var48 + 1];
                    int var81 = arg7[var47][var48];
                    int var82 = arg0[var47][var48 + 1];
                    int var83 = arg7[var47 + 1][var48 + 1];
                    int var84 = arg7[var47 + 1][var48];
                    int var85 = arg7[var47][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var68 >> 16) - 1;
                    int var88 = (var69 >> 16) - 1;
                    int var89 = (var67 >> 16) - 1;
                    class175 var90 = (class175) var24.method770(var75, 113);
                    class337.method2330(true, var53, var68 <= var68, var68 <= var66, var52, class348.method2411(var87, var80, var83, -2108503000), var90, class348.method2411(var87, var82, var85, -2108503000), var55, arg13, var48, arg1, var65, arg6, var50, arg12, class348.method2411(var87, var74, var81, -2108503000), class348.method2411(var87, var77, var84, -2108503000), var47, arg2, var68 <= var69, var67 >= var68);
                    if (var70 != var75) {
                        class175 var91 = (class175) var24.method770(var70, -101);
                        class337.method2330(true, var53, var66 <= var68, var66 <= var66, var52, class348.method2411(var86, var80, var83, -2108503000), var91, class348.method2411(var86, var82, var85, -2108503000), var55, arg13, var48, arg1, var65, arg6, var50, arg12, class348.method2411(var86, var74, var81, -2108503000), class348.method2411(var86, var77, var84, -2108503000), var47, arg2, var66 <= var69, var66 <= var67);
                    }
                    if (var72 != var75 && var70 != var72) {
                        class175 var92 = (class175) var24.method770(var72, 88);
                        class337.method2330(true, var53, var67 <= var68, var67 <= var66, var52, class348.method2411(var89, var80, var83, -2108503000), var92, class348.method2411(var89, var82, var85, -2108503000), var55, arg13, var48, arg1, var65, arg6, var50, arg12, class348.method2411(var89, var74, var81, -2108503000), class348.method2411(var89, var77, var84, -2108503000), var47, arg2, var67 <= var69, var67 <= var67);
                    }
                    if (var75 != var78 && var70 != var78 && var72 != var78) {
                        class175 var93 = (class175) var24.method770(var78, 122);
                        class337.method2330(true, var53, var69 <= var68, var69 <= var66, var52, class348.method2411(var88, var80, var83, -2108503000), var93, class348.method2411(var88, var82, var85, -2108503000), var55, arg13, var48, arg1, var65, arg6, var50, arg12, class348.method2411(var88, var74, var81, -2108503000), class348.method2411(var88, var77, var84, -2108503000), var47, arg2, var69 >= var69, var69 <= var67);
                    }
                }
            }
        }
        for (class175 var94 = (class175) var24.method761(81); var94 != null; var94 = (class175) var24.method757(-1)) {
            if (var94.field2655 == 0) {
                var94.method1290(-18);
            } else {
                var94.method1216();
            }
        }
        int var95 = var24.method756(1);
        long[] var96 = new long[var95];
        class175[] var97 = new class175[var95];
        var24.method767(var97, (byte) -10);
        for (int var98 = 0; var98 < var95; var98++) {
            var96[var98] = var97[var98].field2834;
        }
        int var99 = 62 / ((20 - arg5) / 43);
        class222.method1553(0, var97, var96);
        return var97;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 587)
    public static void method230(int arg0) {
        if (arg0 == -5734) {
            field392 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([Lne;IZ[[[I)V", line = 602)
    public static final void method231(class262[] arg0, int arg1, boolean arg2, int[][][] arg3) {
        if (arg1 < 31) {
            return;
        }
        field382++;
        byte var4;
        if (arg2) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg2) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class225.field3398[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class225.field3398[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method1857(var6, var7, (byte) -14);
                            }
                        }
                    }
                }
            }
            class237.field3639 += (int) (Math.random() * 5.0D) - 2;
            class6.field71 += (int) (Math.random() * 5.0D) - 2;
            if (class6.field71 < -16) {
                class6.field71 = -16;
            }
            if (class6.field71 > 16) {
                class6.field71 = 16;
            }
            if (class237.field3639 < -8) {
                class237.field3639 = -8;
            }
            if (class237.field3639 > 8) {
                class237.field3639 = 8;
            }
        }
        int var9 = class237.field3639 >> 2 << 10;
        int var10 = class6.field71 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class300.field4687[var13];
            if (!class272.field4317) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        byte var39 = 74;
                        int var40 = class72.field902[var13][var38 + 1][var37] - class72.field902[var13][var38 - 1][var37];
                        int var41 = class72.field902[var13][var38][var37 + 1] - class72.field902[var13][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var41 * var41 + (var40 * var40 + 65536)));
                        int var43 = (var14[var38][var37 - 1] >> 2) + ((var14[var38 - 1][var37] >> 2) - (-(var14[var38][var37 + 1] >> 3) - (var14[var38 + 1][var37] >> 3) - (var14[var38][var37] >> 1)));
                        int var44 = (var41 << 8) / var42;
                        int var45 = -65536 / var42;
                        int var46 = (var40 << 8) / var42;
                        int var47 = (var46 * -50 - (-(var44 * -50) - (var45 * -10))) / var36 + var39;
                        var12[var38][var37] = var47 - var43;
                    }
                }
            } else if (class290.field4566) {
                for (int var31 = 1; var31 < 103; var31++) {
                    for (int var32 = 1; var32 < 103; var32++) {
                        int var33 = (var14[var32][var31 - 1] >> 2) + (var14[var32 + 1][var31] >> 3) + (var14[var32][var31] >> 1) + (var14[var32][var31 + 1] >> 3) + (var14[var32 + -1][var31] >> 2);
                        byte var34 = 74;
                        var12[var32][var31] = var34 - var33;
                    }
                }
            } else {
                int var15 = (int) class26.field307[0];
                int var16 = (int) class26.field307[2];
                int var17 = (int) class26.field307[1];
                int var18 = (int) Math.sqrt((double) (var17 * var17 + (var15 * var15 + (var16 * var16))));
                int var19 = var18 * 1024 >> 8;
                for (int var20 = 1; var20 < 103; var20++) {
                    for (int var21 = 1; var21 < 103; var21++) {
                        byte var22 = 96;
                        int var23 = class72.field902[var13][var21 + 1][var20] - class72.field902[var13][var21 - 1][var20];
                        int var24 = class72.field902[var13][var21][var20 + 1] - class72.field902[var13][var21][var20 - 1];
                        int var25 = (int) Math.sqrt((double) (var24 * var24 + var23 * var23 + 65536));
                        int var26 = (var23 << 8) / var25;
                        int var27 = -65536 / var25;
                        int var28 = (var24 << 8) / var25;
                        int var29 = (var16 * var28 + var15 * var26 + var17 * var27) / var19 + var22;
                        int var30 = (var14[var21][var20] >> 1) + ((var14[var21][var20 + 1] >> 3) + (var14[var21 - 1][var20] >> 2) + (var14[var21 + 1][var20] >> 3) + (var14[var21][var20 + -1] >> 2));
                        var12[var21][var20] = var29 - (int) ((float) var30 * 1.7F);
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class84.field1093[var48] = 0;
                class254.field4026[var48] = 0;
                class42.field474[var48] = 0;
                class72.field893[var48] = 0;
                class174.field2629[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class110.field1519[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class199 var53 = class250.method1783((byte) -54, var52 - 1);
                            class84.field1093[var50] += var53.field3017;
                            class254.field4026[var50] += var53.field3021;
                            class42.field474[var50] += var53.field3022;
                            class72.field893[var50] += var53.field3015;
                            var10002 = class174.field2629[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class110.field1519[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class199 var56 = class250.method1783((byte) -117, var55 - 1);
                            class84.field1093[var50] -= var56.field3017;
                            class254.field4026[var50] -= var56.field3021;
                            class42.field474[var50] -= var56.field3022;
                            class72.field893[var50] -= var56.field3015;
                            var10002 = class174.field2629[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        if (var63 < 104) {
                            var61 += class42.field474[var63];
                            var59 += class72.field893[var63];
                            var60 += class174.field2629[var63];
                            var58 += class84.field1093[var63];
                            var57 += class254.field4026[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0) {
                            var59 -= class72.field893[var64];
                            var60 -= class174.field2629[var64];
                            var57 -= class254.field4026[var64];
                            var61 -= class42.field474[var64];
                            var58 -= class84.field1093[var64];
                        }
                        if (var62 >= 0 && var60 > 0) {
                            var11[var49][var62] = class186.method1284(var58 * 256 / var59, var57 / var60, (byte) 125, var61 / var60);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label767: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg2 || class103.method653(-29308) || (class225.field3398[0][var65][var66] & 0x2) != 0 || (class225.field3398[var13][var65][var66] & 0x10) == 0 && class246.method1747((byte) -84, var13, var66, var65) == class207.field3127) {
                        if (class303.field4731 > var13) {
                            class303.field4731 = var13;
                        }
                        int var67 = class110.field1519[var13][var65][var66] & 0xFF;
                        int var68 = class111.field1554[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class72.field902[var13][var65 + 1][var66];
                            int var70 = class72.field902[var13][var65 + 1][var66 + 1];
                            int var71 = class72.field902[var13][var65][var66];
                            int var72 = class72.field902[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class168.field2578[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class348.method2412(true, var68 - 1).field2317) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var71 && var70 == var71 && var71 == var72) {
                                    class28.field337[var13][var65][var66] = class77.method492(class28.field337[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var67 <= 0) {
                                var74 = 0;
                                var75 = -1;
                            } else {
                                var75 = var11[var65][var66];
                                int var76 = (var75 & 0x7F) + var10;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var75 & 0x380) + (var9 + var75 & 0xFC00) + var76;
                                var74 = class104.field1440[class174.method1213(96, var77, (byte) 4)];
                            }
                            int var78 = var12[var65][var66];
                            int var79 = var12[var65 + 1][var66];
                            int var80 = var12[var65 + 1][var66 + 1];
                            int var81 = var12[var65][var66 + 1];
                            if (var68 == 0) {
                                class315.method2226(var13, var65, var66, 0, 0, -1, var71, var69, var70, var72, class174.method1213(var78, var75, (byte) 1), class174.method1213(var79, var75, (byte) 122), class174.method1213(var80, var75, (byte) 125), class174.method1213(var81, var75, (byte) -14), 0, 0, 0, 0, var74, 0);
                                if (class272.field4317 && var13 > 0 && var75 != -1 && class250.method1783((byte) -70, var67 - 1).field3014) {
                                    class358.method2471(0, 0, true, false, var65, var66, var71 - class72.field902[0][var65][var66], -class72.field902[0][var65 + 1][var66] + var69, var70 - class72.field902[0][var65 + 1][var66 + 1], -class72.field902[0][var65][var66 + 1] + var72);
                                }
                                if (class272.field4317 && !arg2 && class161.field2484 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                        for (int var83 = var66 - 1; var83 <= (var66 + 1); var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class111.field1554[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class146 var85 = class348.method2412(true, var84 - 1);
                                                    if (var85.field2323 != -1 && class77.method497(class104.field1438.method892(21235, var85.field2323), (byte) 96)) {
                                                        class161.field2484[var65][var66] = (var85.field2313 << 24) + var85.field2315;
                                                        continue label767;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var86 = class254.field4018[var13][var65][var66];
                                int var87 = class168.field2578[var13][var65][var66] + 1;
                                class146 var88 = class348.method2412(true, var68 - 1);
                                if (class272.field4317 && !arg2 && class161.field2484 != null && var13 == 0) {
                                    if (var88.field2323 != -1 && class77.method497(class104.field1438.method892(21235, var88.field2323), (byte) 96)) {
                                        class161.field2484[var65][var66] = (var88.field2313 << 24) + var88.field2315;
                                    } else {
                                        label748: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= (var66 + 1); var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class111.field1554[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class146 var92 = class348.method2412(true, var91 - 1);
                                                        if (var92.field2323 != -1 && class77.method497(class104.field1438.method892(21235, var92.field2323), (byte) 96)) {
                                                            class161.field2484[var65][var66] = (var92.field2313 << 24) + var92.field2315;
                                                            break label748;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field2323;
                                if (var93 >= 0 && !class104.field1438.method880(var93, (byte) -60)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var94 = class104.field1440[class13.method76(-10845, class104.field1438.method878(126, var93), 96)];
                                    var95 = -1;
                                } else if (var88.field2328 == -1) {
                                    var95 = -2;
                                    var94 = 0;
                                } else {
                                    var95 = var88.field2328;
                                    int var96 = (var95 & 0x7F) + var10;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var95 + var9 & 0xFC00) + (var95 & 0x380) + var96;
                                    var94 = class104.field1440[class13.method76(-10845, var97, 96)];
                                }
                                if (var88.field2325 >= 0) {
                                    int var98 = var88.field2325;
                                    int var99 = (var98 & 0x7F) + var10;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var9 + var98 & 0xFC00) + (var98 & 0x380) + var99;
                                    var94 = class104.field1440[class13.method76(-10845, var100, 96)];
                                }
                                class315.method2226(var13, var65, var66, var87, var86, var93, var71, var69, var70, var72, class174.method1213(var78, var75, (byte) 124), class174.method1213(var79, var75, (byte) -100), class174.method1213(var80, var75, (byte) -71), class174.method1213(var81, var75, (byte) -86), class13.method76(-10845, var95, var78), class13.method76(-10845, var95, var79), class13.method76(-10845, var95, var80), class13.method76(-10845, var95, var81), var74, var94);
                                if (class272.field4317 && var13 > 0) {
                                    class358.method2471(var87, var86, var95 == -2 || !var88.field2321, var75 == -1 || !class250.method1783((byte) -80, var67 - 1).field3014, var65, var66, var71 - class72.field902[0][var65][var66], -class72.field902[0][var65 - -1][var66] + var69, var70 - class72.field902[0][var65 + 1][var66 + 1], -class72.field902[0][var65][var66 + 1] + var72);
                                }
                            }
                        }
                    }
                }
            }
            if (class272.field4317) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class72.field902[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg2) {
                            class175[] var110 = method229(var11, class72.field902[var13], class214.field3247[0], arg3, class254.field4018[var13], 83, var101, var12, var13, class168.field2578[var13], class161.field2484, class111.field1554[var13], var103, var102, class110.field1519[var13], class225.field3398);
                            class79.method514(var13, var110);
                            break;
                        }
                        class175[] var111 = method229(var11, class72.field902[var13], (int[][]) null, arg3, class254.field4018[var13], 110, var101, var12, var13, class168.field2578[var13], (int[][]) null, class111.field1554[var13], var103, var102, class110.field1519[var13], class225.field3398);
                        class175[] var112 = class345.method2394(class225.field3398, var103, (byte) 63, class72.field902[var13], var102, var101, var12, var13, class168.field2578[var13], class254.field4018[var13], class111.field1554[var13], class110.field1519[var13]);
                        class175[] var113 = new class175[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var115 + var111.length] = var112[var115];
                        }
                        class79.method514(var13, var113);
                        class291.method2076(var101, (byte) -41, class72.field902[var13], class168.field2578[var13], class195.field2970, var13, class110.field1519[var13], var103, class254.field4018[var13], class195.field2960, var102, class111.field1554[var13]);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        int var108 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + (var108 * var108 + 65536)));
                        var103[var106][var105] = (float) var108 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var102[var106][var105] = (float) var107 / var109;
                    }
                    var105++;
                }
            }
            class110.field1519[var13] = (byte[][]) null;
            class111.field1554[var13] = (byte[][]) null;
            class168.field2578[var13] = (byte[][]) null;
            class254.field4018[var13] = (byte[][]) null;
            class300.field4687[var13] = (byte[][]) null;
        }
        class13.method77(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class225.field3398[1][var116][var117] & 0x2) == 2) {
                    class119.method775(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class28.field337[var118][var120][var119] & 0x1) != 0) {
                        int var121 = var119;
                        int var122 = var119;
                        while (var121 > 0 && (class28.field337[var118][var120][var121 - 1] & 0x1) != 0) {
                            var121--;
                        }
                        while (var122 < 104 && (class28.field337[var118][var120][var122 + 1] & 0x1) != 0) {
                            var122++;
                        }
                        int var123;
                        label450: for (var123 = var118; var123 > 0; var123--) {
                            for (int var124 = var121; var124 <= var122; var124++) {
                                if ((class28.field337[var123 - 1][var120][var124] & 0x1) == 0) {
                                    break label450;
                                }
                            }
                        }
                        int var125;
                        label438: for (var125 = var118; var125 < 3; var125++) {
                            for (int var126 = var121; var126 <= var122; var126++) {
                                if ((class28.field337[var125 + 1][var120][var126] & 0x1) == 0) {
                                    break label438;
                                }
                            }
                        }
                        int var127 = (var125 + 1 - var123) * (var122 + 1 - var121);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class72.field902[var125][var120][var121] - var128;
                            int var130 = class72.field902[var123][var120][var121];
                            class56.method338(1, var120 * 128, var120 * 128, var121 * 128, var122 * 128 + 128, var129, var130);
                            for (int var131 = var123; var131 <= var125; var131++) {
                                for (int var132 = var121; var132 <= var122; var132++) {
                                    class28.field337[var131][var120][var132] = class261.method1840(class28.field337[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class28.field337[var118][var120][var119] & 0x2) != 0) {
                        int var133;
                        for (var133 = var120; var133 > 0 && (class28.field337[var118][var133 - 1][var119] & 0x2) != 0; var133--) {
                        }
                        int var134 = var120;
                        int var135 = var118;
                        while (var134 < 104 && (class28.field337[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        int var136;
                        label504: for (var136 = var118; var136 > 0; var136--) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class28.field337[var136 - 1][var137][var119] & 0x2) == 0) {
                                    break label504;
                                }
                            }
                        }
                        label493: while (var135 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class28.field337[var135 + 1][var138][var119] & 0x2) == 0) {
                                    break label493;
                                }
                            }
                            var135++;
                        }
                        int var139 = (var134 + 1 - var133) * (var135 + 1 - var136);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class72.field902[var136][var133][var119];
                            int var142 = class72.field902[var135][var133][var119] - var140;
                            class56.method338(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var142, var141);
                            for (int var143 = var136; var143 <= var135; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class28.field337[var143][var144][var119] = class261.method1840(class28.field337[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class28.field337[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147 = var119;
                        int var148 = var119;
                        while (var147 > 0 && (class28.field337[var118][var120][var147 - 1] & 0x4) != 0) {
                            var147--;
                        }
                        while (var148 < 104 && (class28.field337[var118][var120][var148 + 1] & 0x4) != 0) {
                            var148++;
                        }
                        label559: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class28.field337[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label559;
                                }
                            }
                            var145--;
                        }
                        label548: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class28.field337[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label548;
                                }
                            }
                            var146++;
                        }
                        if ((var148 + 1 - var147) * (var146 + 1 - var145) >= 4) {
                            int var151 = class72.field902[var118][var145][var147];
                            class56.method338(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class28.field337[var118][var152][var153] = class261.method1840(class28.field337[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIZ)V", line = 1577)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field391 = arg6;
        this.field380 = arg5;
        this.field390 = arg1;
        this.field388 = arg3;
        this.field386 = arg0;
        this.field383 = arg4;
        this.field385 = arg2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;", line = 1592)
    public static final String method232(int arg0, int arg1, String[] arg2, int arg3) {
        field389++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var12 = arg2[arg1];
            return var12 == null ? "null" : var12.toString();
        } else {
            int var4 = arg3 + arg1;
            int var5 = 0;
            int var6 = -88 % ((arg0 - 28) / 54);
            for (int var7 = arg1; var7 < var4; var7++) {
                String var8 = arg2[var7];
                if (var8 == null) {
                    var5 += 4;
                } else {
                    var5 += var8.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var5);
            for (int var10 = arg1; var10 < var4; var10++) {
                String var11 = arg2[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }
}
