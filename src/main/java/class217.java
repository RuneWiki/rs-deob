import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class217 {

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "[I")
    private int[] field2893 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[I")
    private int[] field2890 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lrq;")
    private class372 field2892;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Lcka;")
    private class186 field2904;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Z")
    public boolean field2895;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[[[B")
    private byte[][][] field2889;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "[[[B")
    private byte[][][] field2899;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[[[B")
    private byte[][][] field2886;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "[[[B")
    public byte[][][] field2891;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "[[[I")
    public int[][][] field2897;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "[[[B")
    private byte[][][] field2902;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "Lhca;")
    public static class517 field2906;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[[[B")
    public byte[][][] field2885;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method1422(byte arg0) {
        field2906 = null;
        if (arg0 > -84) {
            field2906 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIZ)V")
    public final void method1423(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2887++;
        if (!arg4) {
            for (int var6 = 0; var6 < this.field2883; var6++) {
                this.method1430(arg3, arg2, var6, arg0, arg1, (byte) 111);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([[ILs;ILha;ILs;Ls;)V")
    private final void method1424(int[][] arg0, class296 arg1, int arg2, class65 arg3, int arg4, class296 arg5, class296 arg6) {
        field2903++;
        byte[][] var8 = this.field2886[arg2];
        byte[][] var9 = this.field2899[arg2];
        int var10 = -43 / ((arg4 + 79) / 37);
        byte[][] var11 = this.field2902[arg2];
        byte[][] var12 = this.field2889[arg2];
        for (int var13 = 0; var13 < this.field2888; var13++) {
            int var14 = var13 < (this.field2888 - 1) ? var13 + 1 : var13;
            for (int var15 = 0; var15 < this.field2900; var15++) {
                int var16 = var15 >= (this.field2900 - 1) ? var15 : var15 + 1;
                if (class365.field5314 == -1 || class349.method2202(var15, var13, class365.field5314, false, arg2)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = var8[var13][var15];
                    int var21 = var9[var13][var15];
                    int var22 = var12[var13][var15] & 0xFF;
                    int var23 = var11[var13][var15] & 0xFF;
                    int var24 = var11[var13][var16] & 0xFF;
                    int var25 = var11[var14][var16] & 0xFF;
                    int var26 = var11[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class669 var27 = var22 == 0 ? null : this.field2904.method1296(var22 - 1, (byte) 87);
                        class42 var28 = var23 == 0 ? null : this.field2892.method2305(18912, var23 - 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class669 var29 = var27;
                        if (var27 != null) {
                            if (var27.field9415 == -1 && var27.field9417 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field9414;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && this.field2888 > var13 && this.field2900 > var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            int var34 = var31 + (var11[var14][var15 - 1] == var23 ? 1 : -1);
                            int var35 = var30 + (var11[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            int var36 = var32 + (var11[var14][var16] == var23 ? 1 : -1);
                            if (var11[var13][var15 - 1] == var23) {
                                var35++;
                                var34++;
                            } else {
                                var35--;
                                var34--;
                            }
                            int var37 = var33 + (var11[var13 - 1][var16] == var23 ? 1 : -1);
                            if (var11[var14][var15] == var23) {
                                var36++;
                                var34++;
                            } else {
                                var34--;
                                var36--;
                            }
                            if (var11[var13][var16] == var23) {
                                var37++;
                                var36++;
                            } else {
                                var37--;
                                var36--;
                            }
                            if (var11[var13 - 1][var15] == var23) {
                                var35++;
                                var37++;
                            } else {
                                var37--;
                                var35--;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var34 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg1.method1880(var13, false, var15) - arg1.method1880(var14, false, var16);
                                var39 = arg1.method1880(var14, false, var15) - arg1.method1880(var13, false, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 > var38 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class429.field6111[var40] = -1;
                            class713.field9979[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field9414 ? class501.field6917[var20] : class784.field10801[var20];
                        this.method1428(var21, this.field2900, this.field2888, var13, var20, var28, var8, arg3, 126, var19, var27, var12, var15, var9);
                        boolean var42 = var27 != null && var27.field9417 != var27.field9415;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class429.field6111[var43] >= 0 && class486.field6732[var43] != class454.field6314[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class497.method2873(var19[1], class440.method2643(class713.field9979[4], class713.field9979[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class497.method2873(var19[3], class440.method2643(class713.field9979[6], class713.field9979[0]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class497.method2873(var19[0], class440.method2643(class713.field9979[2], class713.field9979[0]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class497.method2873(var19[2], class440.method2643(class713.field9979[6], class713.field9979[4]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 0;
                                var19[0] = var19[3] = false;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[1] = false;
                                var21 = 3;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var21 = 2;
                                var19[1] = var19[2] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[2] = var19[3] = false;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        int var50;
                        if (var44) {
                            var49 = class351.field5158[var20];
                            var47 = var27 == null ? 0 : class775.field10669[var20];
                            var46 = class483.field6675[var20];
                            var48 = class387.field5630[var20];
                            var50 = var28 == null ? 0 : class162.field2207[var20];
                        } else if (var18) {
                            var46 = class164.field2222[var20];
                            var45 = class178.field2376[var20];
                            var47 = var27 == null ? 0 : class444.field6233[var20];
                            var48 = class523.field7168[var20];
                            var49 = class436.field6151[var20];
                            var50 = var28 == null ? 0 : class468.field6484[var20];
                        } else {
                            var47 = var27 == null ? 0 : class372.field5381[var20];
                            var45 = class641.field8898[var20];
                            var49 = class691.field9700[var20];
                            var46 = class548.field7411[var20];
                            var48 = class182.field2416[var20];
                            var50 = var28 == null ? 0 : class733.field10171[var20];
                        }
                        int var51 = var47 + var50;
                        if (var51 <= 0) {
                            class712.method3981(arg2, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = var42 ? new int[var54] : null;
                            int[] var56 = new int[var54];
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = arg5 == null ? null : new int[var54];
                            int[] var62 = arg5 == null && arg6 == null ? null : new int[var54];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var27 != null) {
                                var64 = var27.field9405;
                                var63 = var27.field9415;
                                var65 = var27.field9401;
                                int var66 = class277.method1794(true, arg3, var27);
                                for (int var67 = 0; var67 < var47; var67++) {
                                    boolean var68 = false;
                                    byte var69;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = 1;
                                        class454.field6305[2] = var48[var52];
                                        class454.field6305[3] = 1;
                                        class454.field6305[4] = var49[var52];
                                        class454.field6305[5] = var48[var52];
                                        var69 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = 5;
                                        class454.field6305[2] = var48[var52];
                                        class454.field6305[3] = 5;
                                        class454.field6305[4] = var49[var52];
                                        class454.field6305[5] = var48[var52];
                                        var69 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = 3;
                                        class454.field6305[2] = var48[var52];
                                        class454.field6305[3] = 3;
                                        class454.field6305[4] = var49[var52];
                                        class454.field6305[5] = var48[var52];
                                        var69 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = 7;
                                        class454.field6305[2] = var48[var52];
                                        class454.field6305[3] = 7;
                                        class454.field6305[4] = var49[var52];
                                        class454.field6305[5] = var48[var52];
                                        var69 = 6;
                                    } else {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = var49[var52];
                                        var69 = 3;
                                        class454.field6305[2] = var48[var52];
                                    }
                                    for (int var70 = 0; var70 < var69; var70++) {
                                        int var71 = class454.field6305[var70];
                                        int var72 = var71 - (var21 * 2) & 0x7;
                                        int var73 = this.field2890[var71];
                                        int var74 = this.field2893[var71];
                                        int var75;
                                        int var76;
                                        if (var21 == 1) {
                                            var75 = 512 - var73;
                                            var76 = var74;
                                        } else if (var21 == 2) {
                                            var76 = 512 - var73;
                                            var75 = 512 - var74;
                                        } else if (var21 == 3) {
                                            var75 = var73;
                                            var76 = 512 - var74;
                                        } else {
                                            var76 = var73;
                                            var75 = var74;
                                        }
                                        var56[var53] = var76;
                                        var57[var53] = var75;
                                        if (var61 != null && class321.field4617[var20][var71]) {
                                            int var77 = (var13 << 9) + var76;
                                            int var78 = (var15 << 9) + var75;
                                            var61[var53] = arg5.method1882(var78, 0, var77) - arg1.method1882(var78, 0, var77);
                                        }
                                        if (var62 != null) {
                                            if (arg5 != null && !class321.field4617[var20][var71]) {
                                                int var79 = (var13 << 9) + var76;
                                                int var80 = (var15 << 9) + var75;
                                                var62[var53] = arg1.method1882(var80, 0, var79) - arg5.method1882(var80, 0, var79);
                                            } else if (arg6 != null && !class374.field5404[var20][var71]) {
                                                int var81 = (var13 << 9) + var76;
                                                int var82 = (var15 << 9) + var75;
                                                var62[var53] = arg6.method1882(var82, 0, var81) - arg1.method1882(var82, 0, var81);
                                            }
                                        }
                                        if (var71 < 8 && class429.field6111[var72] > var27.field9418) {
                                            if (var55 != null) {
                                                var55[var53] = class486.field6732[var72];
                                            }
                                            var60[var53] = class219.field2918[var72];
                                            var59[var53] = class26.field389[var72];
                                            var58[var53] = class454.field6314[var72];
                                        } else {
                                            if (var55 != null) {
                                                var55[var53] = var66;
                                            }
                                            var59[var53] = var27.field9405;
                                            var60[var53] = var27.field9401;
                                            var58[var53] = var63;
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (!this.field2895 && arg2 == 0) {
                                    class765.method4247(var13, var15, var27.field9416, var27.field9412 * 8, var27.field9400);
                                }
                                if (var20 != 12 && var27.field9415 != -1 && var27.field9407) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class775.field10669[var20];
                            } else if (var18) {
                                var52 += class444.field6233[var20];
                            } else {
                                var52 += class372.field5381[var20];
                            }
                            if (var28 != null) {
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                class42 var83 = this.field2892.method2305(18912, var23 - 1);
                                class42 var84 = this.field2892.method2305(18912, var24 - 1);
                                class42 var85 = this.field2892.method2305(18912, var25 - 1);
                                class42 var86 = this.field2892.method2305(18912, var26 - 1);
                                for (int var87 = 0; var87 < var50; var87++) {
                                    boolean var88 = false;
                                    byte var89;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = 1;
                                        class454.field6305[2] = var48[var52];
                                        class454.field6305[3] = 1;
                                        class454.field6305[4] = var49[var52];
                                        class454.field6305[5] = var48[var52];
                                        var89 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = 5;
                                        class454.field6305[2] = var48[var52];
                                        class454.field6305[3] = 5;
                                        class454.field6305[4] = var49[var52];
                                        class454.field6305[5] = var48[var52];
                                        var89 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = 3;
                                        class454.field6305[2] = var48[var52];
                                        class454.field6305[3] = 3;
                                        class454.field6305[4] = var49[var52];
                                        class454.field6305[5] = var48[var52];
                                        var89 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = 7;
                                        class454.field6305[2] = var48[var52];
                                        class454.field6305[3] = 7;
                                        class454.field6305[4] = var49[var52];
                                        var89 = 6;
                                        class454.field6305[5] = var48[var52];
                                    } else {
                                        class454.field6305[0] = var46[var52];
                                        class454.field6305[1] = var49[var52];
                                        var89 = 3;
                                        class454.field6305[2] = var48[var52];
                                    }
                                    for (int var90 = 0; var90 < var89; var90++) {
                                        int var91 = class454.field6305[var90];
                                        int var92 = var91 - (var21 * 2) & 0x7;
                                        int var93 = this.field2890[var91];
                                        int var94 = this.field2893[var91];
                                        int var95;
                                        int var96;
                                        if (var21 == 1) {
                                            var96 = 512 - var93;
                                            var95 = var94;
                                        } else if (var21 == 2) {
                                            var96 = 512 - var94;
                                            var95 = 512 - var93;
                                        } else if (var21 == 3) {
                                            var95 = 512 - var94;
                                            var96 = var93;
                                        } else {
                                            var95 = var93;
                                            var96 = var94;
                                        }
                                        var56[var53] = var95;
                                        var57[var53] = var96;
                                        if (var61 != null && class321.field4617[var20][var91]) {
                                            int var97 = (var13 << 9) + var95;
                                            int var98 = (var15 << 9) + var96;
                                            var61[var53] = arg5.method1882(var98, 0, var97) - arg1.method1882(var98, 0, var97);
                                        }
                                        if (var62 != null) {
                                            if (arg5 != null && !class321.field4617[var20][var91]) {
                                                int var99 = (var13 << 9) + var95;
                                                int var100 = (var15 << 9) + var96;
                                                var62[var53] = arg1.method1882(var100, 0, var99) - arg5.method1882(var100, 0, var99);
                                            } else if (arg6 != null && !class374.field5404[var20][var91]) {
                                                int var101 = (var13 << 9) + var95;
                                                int var102 = (var15 << 9) + var96;
                                                var62[var53] = arg6.method1882(var102, 0, var101) - arg1.method1882(var102, 0, var101);
                                            }
                                        }
                                        if (var91 < 8 && class429.field6111[var92] >= 0) {
                                            if (var55 != null) {
                                                var55[var53] = class486.field6732[var92];
                                            }
                                            var60[var53] = class219.field2918[var92];
                                            var59[var53] = class26.field389[var92];
                                            var58[var53] = class454.field6314[var92];
                                        } else {
                                            if (var18 && class321.field4617[var20][var91]) {
                                                var59[var53] = var64;
                                                var60[var53] = var65;
                                                var58[var53] = var63;
                                            } else if (var95 == 0 && var96 == 0) {
                                                var58[var53] = arg0[var13][var15];
                                                var59[var53] = var83.field651;
                                                var60[var53] = var83.field664;
                                            } else if (var95 == 0 && var96 == 512) {
                                                var58[var53] = arg0[var13][var16];
                                                var59[var53] = var84.field651;
                                                var60[var53] = var84.field664;
                                            } else if (var95 == 512 && var96 == 512) {
                                                var58[var53] = arg0[var14][var16];
                                                var59[var53] = var85.field651;
                                                var60[var53] = var85.field664;
                                            } else if (var95 == 512 && var96 == 0) {
                                                var58[var53] = arg0[var14][var15];
                                                var59[var53] = var86.field651;
                                                var60[var53] = var86.field664;
                                            } else {
                                                if (var95 < 256) {
                                                    if (var96 >= 256) {
                                                        var59[var53] = var84.field651;
                                                        var60[var53] = var84.field664;
                                                    } else {
                                                        var59[var53] = var83.field651;
                                                        var60[var53] = var83.field664;
                                                    }
                                                } else if (var96 < 256) {
                                                    var59[var53] = var86.field651;
                                                    var60[var53] = var86.field664;
                                                } else {
                                                    var59[var53] = var85.field651;
                                                    var60[var53] = var85.field664;
                                                }
                                                int var103 = class544.method3096(arg0[var13][var15], var95 << 7 >> 9, -22459, arg0[var14][var15]);
                                                int var104 = class544.method3096(arg0[var13][var16], var95 << 7 >> 9, -22459, arg0[var14][var16]);
                                                var58[var53] = class544.method3096(var103, var96 << 7 >> 9, -22459, var104);
                                            }
                                            if (var55 != null) {
                                                var55[var53] = var58[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field654) {
                                    var17 = true;
                                }
                            }
                            int var105 = arg1.method1880(var13, false, var15);
                            int var106 = arg1.method1880(var14, false, var15);
                            int var107 = arg1.method1880(var14, false, var16);
                            int var108 = arg1.method1880(var13, false, var16);
                            boolean var109 = class74.method661(var13, var15, 1);
                            if (var109 && arg2 > 1 || !var109 && arg2 > 0) {
                                boolean var110 = true;
                                if (var28 != null && !var28.field660) {
                                    var110 = false;
                                } else if (var23 == 0 && var20 != 0) {
                                    var110 = false;
                                } else if (var22 > 0 && var29 != null && !var29.field9398) {
                                    var110 = false;
                                }
                                if (var110 && var105 == var106 && var105 == var107 && var105 == var108) {
                                    this.field2891[arg2][var13][var15] = (byte) class213.method1409(this.field2891[arg2][var13][var15], 4);
                                }
                            }
                            int var111 = 0;
                            int var112 = 0;
                            int var113 = 0;
                            if (this.field2895) {
                                var111 = class356.method2243(var13, var15);
                                var112 = class132.method1050(var13, var15);
                                var113 = class674.method3747(var13, var15);
                            }
                            arg1.method1145(var13, var15, var56, var61, var57, var62, var58, var55, var59, var60, var111, var112, var113, var17);
                            class712.method3981(arg2, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljp;I)Ljava/lang/String;")
    public static final String method1425(class376 arg0, int arg1) {
        field2896++;
        if (arg1 >= -59) {
            method1422((byte) 47);
        }
        return class570.method3191(false, 32767, arg0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ls;Ls;ILha;)V")
    public final void method1426(class296 arg0, class296 arg1, int arg2, class65 arg3) {
        field2881++;
        if (class782.field10790 == null || class782.field10790.length != this.field2900) {
            class565.field7570 = new int[this.field2900];
            class498.field6876 = new int[this.field2900];
            class494.field6838 = new int[this.field2900];
            class782.field10790 = new int[this.field2900];
            class73.field1056 = new int[this.field2900];
        }
        int[][] var5 = new int[this.field2888][this.field2900];
        if (arg2 <= 118) {
            this.field2897 = null;
        }
        for (int var6 = 0; var6 < this.field2883; var6++) {
            for (int var8 = 0; var8 < this.field2900; var8++) {
                class782.field10790[var8] = 0;
                class494.field6838[var8] = 0;
                class565.field7570[var8] = 0;
                class498.field6876[var8] = 0;
                class73.field1056[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field2888; var9++) {
                for (int var10 = 0; var10 < this.field2900; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field2888) {
                        int var20 = this.field2902[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class42 var21 = this.field2892.method2305(18912, var20 - 1);
                            class782.field10790[var10] += var21.field652;
                            class494.field6838[var10] += var21.field662;
                            class565.field7570[var10] += var21.field649;
                            class498.field6876[var10] += var21.field658;
                            var10002 = class73.field1056[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field2902[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class42 var24 = this.field2892.method2305(18912, var23 - 1);
                            class782.field10790[var10] -= var24.field652;
                            class494.field6838[var10] -= var24.field662;
                            class565.field7570[var10] -= var24.field649;
                            class498.field6876[var10] -= var24.field658;
                            var10002 = class73.field1056[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field2900; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field2900) {
                            var11 += class782.field10790[var17];
                            var13 += class565.field7570[var17];
                            var12 += class494.field6838[var17];
                            var15 += class73.field1056[var17];
                            var14 += class498.field6876[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class494.field6838[var18];
                            var15 -= class73.field1056[var18];
                            var13 -= class565.field7570[var18];
                            var11 -= class782.field10790[var18];
                            var14 -= class498.field6876[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class259.method1717(var13 / var15, var11 * 256 / var14, (byte) 104, var12 / var15);
                        }
                    }
                }
            }
            if (class54.field772) {
                this.method1424(var5, class528.field7227[var6], var6, arg3, -124, ~var6 == -1 ? arg1 : null, var6 == 0 ? arg0 : null);
            } else {
                this.method1431(var6 == 0 ? arg1 : null, var5, var6 == 0 ? arg0 : null, arg3, -1, class528.field7227[var6], var6);
            }
            this.field2902[var6] = null;
            this.field2889[var6] = null;
            this.field2886[var6] = null;
            this.field2899[var6] = null;
        }
        if (!this.field2895) {
            if (class34.field557 != 0) {
                class740.method4097();
            }
            if (class229.field3117) {
                class22.method182();
            }
        }
        for (int var7 = 0; var7 < this.field2883; var7++) {
            class528.field7227[var7].method1139();
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([Loga;[[[IILha;)V")
    public final void method1427(class502[] arg0, int[][][] arg1, int arg2, class65 arg3) {
        field2880++;
        if (!this.field2895) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field2888; var6++) {
                    for (int var7 = 0; var7 < this.field2900; var7++) {
                        if ((class66.field931[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class66.field931[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method2905(var7, 2097152, var6);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != -14360) {
            this.method1430(-45, -56, 52, -84, 38, (byte) 48);
        }
        for (int var9 = 0; var9 < this.field2883; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field2895) {
                if (class669.field9410) {
                    var11 |= 0x8;
                }
                if (class229.field3117) {
                    var10 |= 0x2;
                }
                if (class34.field557 != 0) {
                    if (class624.field8385 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class229.field3117) {
                var11 |= 0x7;
            }
            if (!class195.field2610) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || arg1.length <= var9 ? this.field2897[var9] : arg1[var9];
            class338.method2146(var9, arg3.method547(this.field2888, this.field2900, this.field2897[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIILpja;[[BLha;I[ZLck;[[BI[[B)V")
    private final void method1428(int arg0, int arg1, int arg2, int arg3, int arg4, class42 arg5, byte[][] arg6, class65 arg7, int arg8, boolean[] arg9, class669 arg10, byte[][] arg11, int arg12, byte[][] arg13) {
        field2878++;
        boolean[] var15 = arg10 != null && arg10.field9414 ? class501.field6917[arg4] : class784.field10801[arg4];
        if (arg12 > 0) {
            if (arg3 > 0) {
                int var16 = arg11[arg3 - 1][arg12 - 1] & 0xFF;
                if (var16 > 0) {
                    class669 var17 = this.field2904.method1296(var16 - 1, (byte) 82);
                    if (var17.field9415 != -1 && var17.field9414) {
                        byte var18 = arg6[arg3 - 1][arg12 - 1];
                        int var19 = (arg13[arg3 - 1][arg12 - 1] * 2) + 4 & 0x7;
                        int var20 = class277.method1794(true, arg7, var17);
                        if (class321.field4617[var18][var19]) {
                            class454.field6314[0] = var17.field9415;
                            class486.field6732[0] = var20;
                            class26.field389[0] = var17.field9405;
                            class219.field2918[0] = var17.field9401;
                            class429.field6111[0] = var17.field9418;
                            class713.field9979[0] = 256;
                        }
                    }
                }
            }
            if (arg3 < (arg2 - 1)) {
                int var21 = arg11[arg3 + 1][arg12 - 1] & 0xFF;
                if (var21 > 0) {
                    class669 var22 = this.field2904.method1296(var21 - 1, (byte) 107);
                    if (var22.field9415 != -1 && var22.field9414) {
                        byte var23 = arg6[arg3 + 1][arg12 - 1];
                        int var24 = (arg13[arg3 + 1][arg12 - 1] * 2) + 6 & 0x7;
                        int var25 = class277.method1794(true, arg7, var22);
                        if (class321.field4617[var23][var24]) {
                            class454.field6314[2] = var22.field9415;
                            class486.field6732[2] = var25;
                            class26.field389[2] = var22.field9405;
                            class219.field2918[2] = var22.field9401;
                            class429.field6111[2] = var22.field9418;
                            class713.field9979[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg1 - 1 > arg12) {
            if (arg3 > 0) {
                int var26 = arg11[arg3 - 1][arg12 + 1] & 0xFF;
                if (var26 > 0) {
                    class669 var27 = this.field2904.method1296(var26 - 1, (byte) 122);
                    if (var27.field9415 != -1 && var27.field9414) {
                        byte var28 = arg6[arg3 - 1][arg12 + 1];
                        int var29 = arg13[arg3 - 1][arg12 + 1] * 2 + 2 & 0x7;
                        int var30 = class277.method1794(true, arg7, var27);
                        if (class321.field4617[var28][var29]) {
                            class454.field6314[6] = var27.field9415;
                            class486.field6732[6] = var30;
                            class26.field389[6] = var27.field9405;
                            class219.field2918[6] = var27.field9401;
                            class429.field6111[6] = var27.field9418;
                            class713.field9979[6] = 64;
                        }
                    }
                }
            }
            if ((arg2 - 1) > arg3) {
                int var31 = arg11[arg3 + 1][arg12 + 1] & 0xFF;
                if (var31 > 0) {
                    class669 var32 = this.field2904.method1296(var31 - 1, (byte) 127);
                    if (var32.field9415 != -1 && var32.field9414) {
                        byte var33 = arg6[arg3 + 1][arg12 + 1];
                        int var34 = arg13[arg3 + 1][arg12 + 1] * 2 & 0x7;
                        int var35 = class277.method1794(true, arg7, var32);
                        if (class321.field4617[var33][var34]) {
                            class454.field6314[4] = var32.field9415;
                            class486.field6732[4] = var35;
                            class26.field389[4] = var32.field9405;
                            class219.field2918[4] = var32.field9401;
                            class429.field6111[4] = var32.field9418;
                            class713.field9979[4] = 128;
                        }
                    }
                }
            }
        }
        int var36 = -117 / ((83 - arg8) / 34);
        if (arg12 > 0) {
            int var37 = arg11[arg3][arg12 - 1] & 0xFF;
            if (var37 > 0) {
                class669 var38 = this.field2904.method1296(var37 - 1, (byte) 94);
                if (var38.field9415 != -1) {
                    byte var39 = arg6[arg3][arg12 - 1];
                    byte var40 = arg13[arg3][arg12 - 1];
                    if (var38.field9414) {
                        int var41 = 2;
                        int var42 = var40 * 2 + 4;
                        int var43 = class277.method1794(true, arg7, var38);
                        for (int var44 = 0; var44 < 3; var44++) {
                            var41 &= 0x7;
                            var42 &= 0x7;
                            if (class321.field4617[var39][var42] && var38.field9418 >= class429.field6111[var41]) {
                                class454.field6314[var41] = var38.field9415;
                                class486.field6732[var41] = var43;
                                class26.field389[var41] = var38.field9405;
                                class219.field2918[var41] = var38.field9401;
                                if (class429.field6111[var41] == var38.field9418) {
                                    class713.field9979[var41] = class213.method1409(class713.field9979[var41], 32);
                                } else {
                                    class713.field9979[var41] = 32;
                                }
                                class429.field6111[var41] = var38.field9418;
                            }
                            var41--;
                            var42++;
                        }
                        if (!var15[-(-arg0) & 0x3]) {
                            arg9[0] = class501.field6917[var39][class440.method2643(3, var40 + 2)];
                        }
                    } else if (!var15[arg0 & 0x3]) {
                        arg9[0] = class784.field10801[var39][class440.method2643(3, var40 + 2)];
                    }
                }
            }
        }
        if ((arg1 - 1) > arg12) {
            int var45 = arg11[arg3][arg12 + 1] & 0xFF;
            if (var45 > 0) {
                class669 var46 = this.field2904.method1296(var45 - 1, (byte) 92);
                if (var46.field9415 != -1) {
                    byte var47 = arg6[arg3][arg12 + 1];
                    byte var48 = arg13[arg3][arg12 + 1];
                    if (var46.field9414) {
                        int var49 = 4;
                        int var50 = (var48 * 2) + 2;
                        int var51 = class277.method1794(true, arg7, var46);
                        for (int var52 = 0; var52 < 3; var52++) {
                            var50 &= 0x7;
                            var49 &= 0x7;
                            if (class321.field4617[var47][var50] && var46.field9418 >= class429.field6111[var49]) {
                                class454.field6314[var49] = var46.field9415;
                                class486.field6732[var49] = var51;
                                class26.field389[var49] = var46.field9405;
                                class219.field2918[var49] = var46.field9401;
                                if (class429.field6111[var49] == var46.field9418) {
                                    class713.field9979[var49] = class213.method1409(class713.field9979[var49], 16);
                                } else {
                                    class713.field9979[var49] = 16;
                                }
                                class429.field6111[var49] = var46.field9418;
                            }
                            var49++;
                            var50--;
                        }
                        if (!var15[arg0 + 2 & 0x3]) {
                            arg9[2] = class501.field6917[var47][class440.method2643(var48, 3)];
                        }
                    } else if (!var15[arg0 + 2 & 0x3]) {
                        arg9[2] = class784.field10801[var47][class440.method2643(3, var48)];
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var53 = arg11[arg3 - 1][arg12] & 0xFF;
            if (var53 > 0) {
                class669 var54 = this.field2904.method1296(var53 - 1, (byte) 82);
                if (var54.field9415 != -1) {
                    byte var55 = arg6[arg3 - 1][arg12];
                    byte var56 = arg13[arg3 - 1][arg12];
                    if (var54.field9414) {
                        int var57 = 6;
                        int var58 = (var56 * 2) + 4;
                        int var59 = class277.method1794(true, arg7, var54);
                        for (int var60 = 0; var60 < 3; var60++) {
                            var57 &= 0x7;
                            var58 &= 0x7;
                            if (class321.field4617[var55][var58] && class429.field6111[var57] <= var54.field9418) {
                                class454.field6314[var57] = var54.field9415;
                                class486.field6732[var57] = var59;
                                class26.field389[var57] = var54.field9405;
                                class219.field2918[var57] = var54.field9401;
                                if (class429.field6111[var57] == var54.field9418) {
                                    class713.field9979[var57] = class213.method1409(class713.field9979[var57], 8);
                                } else {
                                    class713.field9979[var57] = 8;
                                }
                                class429.field6111[var57] = var54.field9418;
                            }
                            var57++;
                            var58--;
                        }
                        if (!var15[arg0 + 3 & 0x3]) {
                            arg9[3] = class501.field6917[var55][class440.method2643(var56 + 1, 3)];
                        }
                    } else if (!var15[arg0 + 3 & 0x3]) {
                        arg9[3] = class784.field10801[var55][class440.method2643(var56 + 1, 3)];
                    }
                }
            }
        }
        if (arg3 < (arg2 - 1)) {
            int var61 = arg11[arg3 + 1][arg12] & 0xFF;
            if (var61 > 0) {
                class669 var62 = this.field2904.method1296(var61 - 1, (byte) 87);
                if (var62.field9415 != -1) {
                    byte var63 = arg6[arg3 + 1][arg12];
                    byte var64 = arg13[arg3 + 1][arg12];
                    if (var62.field9414) {
                        int var65 = 4;
                        int var66 = var64 * 2 + 6;
                        int var67 = class277.method1794(true, arg7, var62);
                        for (int var68 = 0; var68 < 3; var68++) {
                            var65 &= 0x7;
                            var66 &= 0x7;
                            if (class321.field4617[var63][var66] && var62.field9418 >= class429.field6111[var65]) {
                                class454.field6314[var65] = var62.field9415;
                                class486.field6732[var65] = var67;
                                class26.field389[var65] = var62.field9405;
                                class219.field2918[var65] = var62.field9401;
                                if (class429.field6111[var65] == var62.field9418) {
                                    class713.field9979[var65] = class213.method1409(class713.field9979[var65], 4);
                                } else {
                                    class713.field9979[var65] = 4;
                                }
                                class429.field6111[var65] = var62.field9418;
                            }
                            var65--;
                            var66++;
                        }
                        if (!var15[arg0 + 1 & 0x3]) {
                            arg9[1] = class501.field6917[var63][class440.method2643(3, var64 + 3)];
                        }
                    } else if (!var15[arg0 + 1 & 0x3]) {
                        arg9[1] = class784.field10801[var63][class440.method2643(var64 + 3, 3)];
                    }
                }
            }
        }
        if (arg10 == null) {
            return;
        }
        int var69 = class277.method1794(true, arg7, arg10);
        if (!arg10.field9414) {
            return;
        }
        for (int var70 = 0; var70 < 8; var70++) {
            int var71 = var70 - (arg0 * 2) & 0x7;
            if (class321.field4617[arg4][var70] && class429.field6111[var71] <= arg10.field9418) {
                class454.field6314[var71] = arg10.field9415;
                class486.field6732[var71] = var69;
                class26.field389[var71] = arg10.field9405;
                class219.field2918[var71] = arg10.field9401;
                if (class429.field6111[var71] == arg10.field9418) {
                    class713.field9979[var71] = class213.method1409(class713.field9979[var71], 2);
                } else {
                    class713.field9979[var71] = 2;
                }
                class429.field6111[var71] = arg10.field9418;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljp;[Loga;IIZII)V")
    public final void method1429(class376 arg0, class502[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!this.field2895) {
            for (int var8 = 0; var8 < 4; var8++) {
                class502 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg2 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && var12 < this.field2888 && var13 >= 0 && var13 < this.field2900) {
                            var9.method2917(var13, 90, var12);
                        }
                    }
                }
            }
        }
        field2894++;
        int var14 = arg2 + arg3;
        int var15 = arg5 + arg6;
        for (int var16 = 0; var16 < this.field2883; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1435(var16, 0, (byte) -96, 0, 0, false, var14 + var17, arg6 + var18, var15 + var18, arg2 + var17, arg0);
                }
            }
        }
        if (!arg4) {
            this.field2886 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIB)V")
    public final void method1430(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2879++;
        int var7 = arg0;
        if (arg5 != 111) {
            this.method1430(-93, -73, -69, -122, -74, (byte) -72);
        }
        while (var7 < (arg0 + arg1)) {
            for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && var10 < this.field2888 && var7 >= 0 && var7 < this.field2900) {
                    this.field2897[arg2][var10][var7] = arg2 <= 0 ? 0 : this.field2897[arg2 - 1][var10][var7] - 960;
                }
            }
            var7++;
        }
        if (arg3 > 0 && this.field2888 > arg3) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg1; var8++) {
                if (var8 >= 0 && this.field2900 > var8) {
                    this.field2897[arg2][arg3][var8] = this.field2897[arg2][arg3 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < this.field2900) {
            for (int var9 = arg3 + 1; var9 < arg3 + arg4; var9++) {
                if (var9 >= 0 && var9 < this.field2888) {
                    this.field2897[arg2][var9][arg0] = this.field2897[arg2][var9][arg0 - 1];
                }
            }
        }
        if (arg3 < 0 || arg0 < 0 || this.field2888 <= arg3 || this.field2900 <= arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 > 0 && this.field2897[arg2][arg3 - 1][arg0] != 0) {
                this.field2897[arg2][arg3][arg0] = this.field2897[arg2][arg3 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field2897[arg2][arg3][arg0 - 1] != 0) {
                this.field2897[arg2][arg3][arg0] = this.field2897[arg2][arg3][arg0 - 1];
                return;
            }
            if (arg3 > 0 && arg0 > 0 && this.field2897[arg2][arg3 - 1][arg0 - 1] != 0) {
                this.field2897[arg2][arg3][arg0] = this.field2897[arg2][arg3 - 1][arg0 - 1];
                return;
            }
        } else if (arg3 <= 0 || this.field2897[arg2 - 1][arg3 - 1][arg0] == this.field2897[arg2][arg3 - 1][arg0]) {
            if (arg0 > 0 && this.field2897[arg2 - 1][arg3][arg0 - 1] != this.field2897[arg2][arg3][arg0 - 1]) {
                this.field2897[arg2][arg3][arg0] = this.field2897[arg2][arg3][arg0 - 1];
                return;
            }
            if (arg3 > 0 && arg0 > 0 && this.field2897[arg2 - 1][arg3 - 1][arg0 - 1] != this.field2897[arg2][arg3 - 1][arg0 - 1]) {
                this.field2897[arg2][arg3][arg0] = this.field2897[arg2][arg3 - 1][arg0 - 1];
                return;
            }
            return;
        } else {
            this.field2897[arg2][arg3][arg0] = this.field2897[arg2][arg3 - 1][arg0];
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ls;[[ILs;Lha;ILs;I)V")
    private final void method1431(class296 arg0, int[][] arg1, class296 arg2, class65 arg3, int arg4, class296 arg5, int arg6) {
        for (int var8 = 0; var8 < this.field2888; var8++) {
            for (int var9 = 0; var9 < this.field2900; var9++) {
                if (class365.field5314 == -1 || class349.method2202(var9, var8, class365.field5314, false, arg6)) {
                    byte var10 = this.field2886[arg6][var8][var9];
                    byte var11 = this.field2899[arg6][var8][var9];
                    int var12 = this.field2889[arg6][var8][var9] & 0xFF;
                    int var13 = this.field2902[arg6][var8][var9] & 0xFF;
                    class669 var14 = var12 == 0 ? null : this.field2904.method1296(var12 - 1, (byte) 96);
                    class42 var15 = var13 == 0 ? null : this.field2892.method2305(18912, var13 - 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class669 var16 = var14;
                    if (var14 != null && var14.field9415 == -1 && var14.field9417 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class162.field2207[var10];
                        int var18 = class775.field10669[var10];
                        int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field9405;
                        int var23 = var15 == null ? -1 : var15.field651;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field9417 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class483.field6675[var10][var21];
                                var25[var20] = class351.field5158[var10][var21];
                                var26[var20] = class387.field5630[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field9401;
                                var27[var20] = var14.field9415;
                                if (var30 != null) {
                                    var30[var20] = var14.field9417;
                                }
                                var21++;
                                var20++;
                            }
                            if (!this.field2895 && arg6 == 0) {
                                class765.method4247(var8, var9, var14.field9416, var14.field9412 * 8, var14.field9400);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class483.field6675[var10][var21];
                                var25[var20] = class351.field5158[var10][var21];
                                var26[var20] = class387.field5630[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field664;
                                var27[var20] = arg1[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var20++;
                                var21++;
                            }
                        }
                        int var33 = this.field2890.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg0 == null ? null : new int[var33];
                        int[] var37 = arg0 == null && arg2 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field2890[var38];
                            int var49 = this.field2893[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class321.field4617[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg0.method1882(var53, class471.method2773(arg4, -1), var52) - arg5.method1882(var53, 0, var52);
                            }
                            if (var37 != null) {
                                if (arg0 != null && !class321.field4617[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg5.method1882(var55, 0, var54) - arg0.method1882(var55, 0, var54);
                                } else if (arg2 != null && !class374.field5404[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg2.method1882(var57, 0, var56) - arg5.method1882(var57, 0, var56);
                                }
                            }
                        }
                        int var39 = arg5.method1880(var8, false, var9);
                        int var40 = arg5.method1880(var8 + 1, false, var9);
                        int var41 = arg5.method1880(var8 + 1, false, var9 + 1);
                        int var42 = arg5.method1880(var8, false, var9 + 1);
                        boolean var43 = class74.method661(var8, var9, arg4 ^ 0xFFFFFFFE);
                        if (var43 && arg6 > 1 || !var43 && arg6 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field660) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field9398) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field2891[arg6][var8][var9] = (byte) class213.method1409(this.field2891[arg6][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field2895) {
                            var45 = class356.method2243(var8, var9);
                            var46 = class132.method1050(var8, var9);
                            var47 = class674.method3747(var8, var9);
                        }
                        arg5.method1149(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class712.method3981(arg6, var8, var9);
                    }
                }
            }
        }
        if (arg4 == -1) {
            field2898++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[[II)V")
    public final void method1432(int arg0, int[][] arg1, int arg2) {
        field2884++;
        int var4 = -83 % ((-arg2 - 67) / 54);
        int[][] var5 = this.field2897[arg0];
        for (int var6 = 0; var6 < (this.field2888 + 1); var6++) {
            for (int var7 = 0; var7 < (this.field2900 + 1); var7++) {
                var5[var6][var7] += arg1[var6][var7];
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Z")
    public static final boolean method1433(int arg0) {
        field2901++;
        if (arg0 != -1) {
            field2906 = null;
        }
        return class674.field9468 != 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[Loga;IIILjp;II)V")
    public final void method1434(int arg0, int arg1, int arg2, class502[] arg3, int arg4, int arg5, int arg6, class376 arg7, int arg8, int arg9) {
        field2882++;
        int var11 = (arg6 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (!this.field2895) {
            class502 var13 = arg3[arg5];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class758.method4217(var15 & 0x7, arg9 ^ 0xFFFFBD84, var14 & 0x7, arg0) + arg1;
                    int var17 = arg2 + class22.method181(false, arg0, var15 & 0x7, var14 & 0x7);
                    if (var16 > 0 && (this.field2888 - 1) > var16 && var17 > 0 && var17 < this.field2900 - 1) {
                        var13.method2917(var17, 110, var16);
                    }
                }
            }
        }
        int var18 = arg6 & 0x1FFFFFF8 << 3;
        int var19 = (arg8 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg0 == 1) {
            var21 = 1;
        } else if (arg0 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg0 == 3) {
            var20 = 1;
        }
        for (int var22 = arg9; var22 < this.field2883; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg4 == var22 && var23 >= var11 && var23 <= (var11 + 8) && var12 <= var24 && (var12 + 8) >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg0 == 0) {
                                var26 = arg2 + var24 - var12;
                                var25 = var23 + arg1 - var11;
                            } else if (arg0 == 1) {
                                var26 = arg2 + var11 + 8 - var23;
                                var25 = arg1 - (var12 - var24);
                            } else if (arg0 == 2) {
                                var26 = var12 + arg2 + 8 - var24;
                                var25 = arg1 + var11 + 8 - var23;
                            } else {
                                var26 = var23 + arg2 - var11;
                                var25 = -var24 - (-var12 - (arg1 + 8));
                            }
                            this.method1435(arg5, 0, (byte) 18, 0, 0, true, var18 + var23, var26, var19 + var24, var25, arg7);
                        } else {
                            var25 = class758.method4217(var24 & 0x7, -17020, var23 & 0x7, arg0) + arg1;
                            var26 = arg2 + class22.method181(false, arg0, var24 & 0x7, var23 & 0x7);
                            this.method1435(arg5, var21, (byte) -126, arg0, var20, false, var18 + var23, var26, var19 + var24, var25, arg7);
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
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg0 == 0) {
                                    var31 = var29 + arg1 - var11;
                                    var32 = arg2 + var30 - var12;
                                } else if (arg0 == 1) {
                                    var31 = -var12 - (-var30 - arg1);
                                    var32 = var11 + arg2 + 8 - var29;
                                } else if (arg0 == 2) {
                                    var32 = var12 + arg2 + 8 - var30;
                                    var31 = arg1 + var11 + 8 - var29;
                                } else {
                                    var31 = arg1 + var12 + 8 - var30;
                                    var32 = var29 + arg2 - var11;
                                }
                                if (var31 >= 0 && this.field2888 > var31 && var32 >= 0 && this.field2900 > var32) {
                                    this.field2897[arg5][var31][var32] = this.field2897[arg5][var20 + var25][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method1435(0, 0, (byte) -89, 0, 0, false, 0, -1, 0, -1, arg7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIZLcka;Lrq;)V")
    public class217(int arg0, int arg1, int arg2, boolean arg3, class186 arg4, class372 arg5) {
        this.field2883 = arg0;
        this.field2892 = arg5;
        this.field2888 = arg1;
        this.field2900 = arg2;
        this.field2904 = arg4;
        this.field2895 = arg3;
        this.field2889 = new byte[this.field2883][this.field2888][this.field2900];
        this.field2899 = new byte[this.field2883][this.field2888][this.field2900];
        this.field2886 = new byte[this.field2883][this.field2888][this.field2900];
        this.field2891 = new byte[this.field2883][this.field2888 + 1][this.field2900 + 1];
        this.field2897 = new int[this.field2883][this.field2888 + 1][this.field2900 + 1];
        this.field2902 = new byte[this.field2883][this.field2888][this.field2900];
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBIIZIIIILjp;)V")
    private final void method1435(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class376 arg10) {
        field2905++;
        if (arg3 == 1) {
            arg1 = 1;
        } else if (arg3 == 2) {
            arg4 = 1;
            arg1 = 1;
        } else if (arg3 == 3) {
            arg4 = 1;
        }
        int var12 = 117 / ((arg2 + 47) / 35);
        if (arg9 < 0 || this.field2888 <= arg9 || arg7 < 0 || arg7 >= this.field2900) {
            while (true) {
                int var15 = arg10.method2398(-1372747256);
                if (var15 == 0) {
                    return;
                }
                if (var15 == 1) {
                    arg10.method2398(-1372747256);
                    return;
                }
                if (var15 <= 49) {
                    arg10.method2398(-1372747256);
                }
            }
        }
        if (!this.field2895 && !arg5) {
            class66.field931[arg0][arg9][arg7] = 0;
        }
        while (true) {
            int var13 = arg10.method2398(-1372747256);
            if (var13 == 0) {
                if (this.field2895) {
                    this.field2897[0][arg9 + arg4][arg1 + arg7] = 0;
                    return;
                } else if (arg0 == 0) {
                    this.field2897[0][arg4 + arg9][arg7 + arg1] = -class77.method667(arg6 + 932731, 556238 - -arg8, 95) * 8 << 2;
                    return;
                } else {
                    this.field2897[arg0][arg4 + arg9][arg1 + arg7] = this.field2897[arg0 - 1][arg4 + arg9][arg1 + arg7] - 960;
                    return;
                }
            }
            if (var13 == 1) {
                int var14 = arg10.method2398(-1372747256);
                if (this.field2895) {
                    this.field2897[0][arg4 + arg9][arg1 + arg7] = var14 * 8 << 2;
                    return;
                }
                if (var14 == 1) {
                    var14 = 0;
                }
                if (arg0 == 0) {
                    this.field2897[0][arg4 + arg9][arg1 + arg7] = -var14 * 8 << 2;
                    return;
                }
                this.field2897[arg0][arg4 + arg9][arg1 + arg7] = this.field2897[arg0 - 1][arg4 + arg9][arg1 + arg7] - (var14 * 8 << 2);
                return;
            }
            if (var13 <= 49) {
                if (arg5) {
                    arg10.method2398(-1372747256);
                } else {
                    this.field2889[arg0][arg9][arg7] = arg10.method2387((byte) -107);
                    this.field2886[arg0][arg9][arg7] = (byte) ((var13 - 2) / 4);
                    this.field2899[arg0][arg9][arg7] = (byte) class440.method2643(3, arg3 + var13 - 2);
                }
            } else if (var13 <= 81) {
                if (!this.field2895 && !arg5) {
                    class66.field931[arg0][arg9][arg7] = (byte) (var13 - 49);
                }
            } else if (!arg5) {
                this.field2902[arg0][arg9][arg7] = (byte) (var13 - 81);
            }
        }
    }
}
