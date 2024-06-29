import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class630 {

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[I")
    private int[] field9044 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!am", name = "m", descriptor = "[I")
    private int[] field9046 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lfs;")
    private class553 field9042;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public int field9048;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Z")
    public boolean field9052;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public int field9051;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "Lwea;")
    private class156 field9057;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public int field9060;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[[[B")
    private byte[][][] field9045;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "[[[B")
    private byte[][][] field9039;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[[[B")
    private byte[][][] field9036;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[[[I")
    public int[][][] field9038;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "[[[B")
    private byte[][][] field9043;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "[[[B")
    public byte[][][] field9035;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Ldh;")
    public static class320 field9050 = new class320(106, 4);

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field9058 = 0;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "[[B")
    public static byte[][] field9059;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[[[B")
    public byte[][][] field9034;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 5)
    public static void method3608(byte arg0) {
        field9050 = null;
        if (arg0 == 1) {
            field9059 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lha;BILs;Ls;[[ILs;)V", line = 17)
    private final void method3609(class58 arg0, byte arg1, int arg2, class278 arg3, class278 arg4, int[][] arg5, class278 arg6) {
        if (arg1 > -8) {
            return;
        }
        field9055++;
        byte[][] var8 = this.field9036[arg2];
        byte[][] var9 = this.field9039[arg2];
        byte[][] var10 = this.field9045[arg2];
        byte[][] var11 = this.field9043[arg2];
        for (int var12 = 0; var12 < this.field9048; var12++) {
            int var13 = var12 >= this.field9048 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field9060; var14++) {
                int var15 = var14 < (this.field9060 - 1) ? var14 + 1 : var14;
                if (class526.field7498 == -1 || class755.method4199(0, class526.field7498, arg2, var12, var14)) {
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
                        class287 var26 = var21 == 0 ? null : this.field9057.method965(var21 - 1, (byte) -42);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class350 var27 = var22 == 0 ? null : this.field9042.method3244(var22 - 1, (byte) -68);
                        class287 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3529 == -1 && var26.field3537 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3538;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field9048 && this.field9060 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var35--;
                                var32--;
                            }
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var34++;
                            } else {
                                var32--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var34--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg4.method1671(var14, var12, (byte) 63) - arg4.method1671(var15, var13, (byte) -77);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg4.method1671(var14, var13, (byte) -71) - arg4.method1671(var15, var12, (byte) 70);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class555.field7955[var39] = -1;
                            class279.field3426[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3538 ? class374.field4813[var19] : class342.field4438[var19];
                        this.method3610(var27, var8, var12, this.field9048, var19, var18, this.field9060, var9, var26, var14, var20, 0, var11, arg0);
                        boolean var41 = var26 != null && var26.field3537 != var26.field3529;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class555.field7955[var42] >= 0 && class520.field7406[var42] != class174.field2052[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class640.method3652(var18[1], class327.method1956(class279.field3426[2], class279.field3426[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class640.method3652(var18[3], class327.method1956(class279.field3426[6], class279.field3426[0]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class640.method3652(var18[0], class327.method1956(class279.field3426[0], class279.field3426[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class640.method3652(var18[2], class327.method1956(class279.field3426[6], class279.field3426[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = class556.field7972[var19];
                            var46 = class170.field1913[var19];
                            var47 = var27 == null ? 0 : class430.field6250[var19];
                            var48 = var26 == null ? 0 : class56.field569[var19];
                            var49 = class199.field2356[var19];
                        } else if (var17) {
                            var46 = class502.field7054[var19];
                            var49 = class67.field685[var19];
                            var44 = class624.field8960[var19];
                            var48 = var26 == null ? 0 : class136.field1542[var19];
                            var47 = var27 == null ? 0 : class486.field6969[var19];
                            var45 = class29.field321[var19];
                        } else {
                            var49 = class567.field8059[var19];
                            var45 = class381.field5208[var19];
                            var47 = var27 == null ? 0 : class65.field660[var19];
                            var46 = class41.field467[var19];
                            var48 = var26 == null ? 0 : class742.field10365[var19];
                            var44 = class11.field89[var19];
                        }
                        int var50 = var47 + var48;
                        if (var50 <= 0) {
                            class267.method1603(arg2, var12, var14);
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
                            int[] var60 = arg6 == null ? null : new int[var53];
                            int[] var61 = arg6 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field3530;
                                var64 = var26.field3536;
                                var62 = var26.field3529;
                                int var65 = class647.method3688(var26, arg0, 0);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = 1;
                                        class128.field1341[2] = var46[var51];
                                        class128.field1341[3] = 1;
                                        class128.field1341[4] = var49[var51];
                                        var68 = 6;
                                        class128.field1341[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = 5;
                                        class128.field1341[2] = var46[var51];
                                        class128.field1341[3] = 5;
                                        class128.field1341[4] = var49[var51];
                                        class128.field1341[5] = var46[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = 3;
                                        class128.field1341[2] = var46[var51];
                                        class128.field1341[3] = 3;
                                        class128.field1341[4] = var49[var51];
                                        var68 = 6;
                                        class128.field1341[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = 7;
                                        class128.field1341[2] = var46[var51];
                                        class128.field1341[3] = 7;
                                        class128.field1341[4] = var49[var51];
                                        class128.field1341[5] = var46[var51];
                                        var68 = 6;
                                    } else {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = var49[var51];
                                        class128.field1341[2] = var46[var51];
                                        var68 = 3;
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class128.field1341[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field9046[var70];
                                        int var73 = this.field9044[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var72;
                                            var75 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var74 = 512 - var73;
                                            var75 = var72;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class203.field2405[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg6.method1675(var77, var76, 65286) - arg4.method1675(var77, var76, 65286);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class203.field2405[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg4.method1675(var79, var78, 65286) - arg6.method1675(var79, var78, 65286);
                                            } else if (arg3 != null && !class15.field134[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg3.method1675(var81, var80, 65286) - arg4.method1675(var81, var80, 65286);
                                            }
                                        }
                                        if (var70 < 8 && var26.field3533 < class555.field7955[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class520.field7406[var71];
                                            }
                                            var59[var52] = class733.field10264[var71];
                                            var58[var52] = class65.field664[var71];
                                            var57[var52] = class174.field2052[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field3530;
                                            var59[var52] = var26.field3536;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field9052 && arg2 == 0) {
                                    class293.method1744(var12, var14, var26.field3535, var26.field3519 * 8, var26.field3520);
                                }
                                if (var19 != 12 && var26.field3529 != -1 && var26.field3526) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class56.field569[var19];
                            } else if (var17) {
                                var51 += class136.field1542[var19];
                            } else {
                                var51 += class742.field10365[var19];
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
                                class350 var82 = this.field9042.method3244(var22 - 1, (byte) -68);
                                class350 var83 = this.field9042.method3244(var23 - 1, (byte) -68);
                                class350 var84 = this.field9042.method3244(var24 - 1, (byte) -68);
                                class350 var85 = this.field9042.method3244(var25 - 1, (byte) -68);
                                for (int var86 = 0; var86 < var47; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = 1;
                                        class128.field1341[2] = var46[var51];
                                        class128.field1341[3] = 1;
                                        class128.field1341[4] = var49[var51];
                                        class128.field1341[5] = var46[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = 5;
                                        class128.field1341[2] = var46[var51];
                                        class128.field1341[3] = 5;
                                        class128.field1341[4] = var49[var51];
                                        var88 = 6;
                                        class128.field1341[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = 3;
                                        class128.field1341[2] = var46[var51];
                                        class128.field1341[3] = 3;
                                        class128.field1341[4] = var49[var51];
                                        class128.field1341[5] = var46[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = 7;
                                        class128.field1341[2] = var46[var51];
                                        class128.field1341[3] = 7;
                                        class128.field1341[4] = var49[var51];
                                        var88 = 6;
                                        class128.field1341[5] = var46[var51];
                                    } else {
                                        class128.field1341[0] = var45[var51];
                                        class128.field1341[1] = var49[var51];
                                        var88 = 3;
                                        class128.field1341[2] = var46[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class128.field1341[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field9046[var90];
                                        int var93 = this.field9044[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var95 = var93;
                                            var94 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 3) {
                                            var95 = 512 - var93;
                                            var94 = var92;
                                        } else {
                                            var94 = var93;
                                            var95 = var92;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class203.field2405[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg6.method1675(var97, var96, 65286) - arg4.method1675(var97, var96, 65286);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class203.field2405[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg4.method1675(var99, var98, 65286) - arg6.method1675(var99, var98, 65286);
                                            } else if (arg3 != null && !class15.field134[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg3.method1675(var101, var100, 65286) - arg4.method1675(var101, var100, 65286);
                                            }
                                        }
                                        if (var90 < 8 && class555.field7955[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class520.field7406[var91];
                                            }
                                            var59[var52] = class733.field10264[var91];
                                            var58[var52] = class65.field664[var91];
                                            var57[var52] = class174.field2052[var91];
                                        } else {
                                            if (var17 && class203.field2405[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg5[var12][var14];
                                                var58[var52] = var82.field4508;
                                                var59[var52] = var82.field4516;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg5[var12][var15];
                                                var58[var52] = var83.field4508;
                                                var59[var52] = var83.field4516;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg5[var13][var15];
                                                var58[var52] = var84.field4508;
                                                var59[var52] = var84.field4516;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg5[var13][var14];
                                                var58[var52] = var85.field4508;
                                                var59[var52] = var85.field4516;
                                            } else {
                                                if (var95 < 256) {
                                                    if (var94 < 256) {
                                                        var58[var52] = var82.field4508;
                                                        var59[var52] = var82.field4516;
                                                    } else {
                                                        var58[var52] = var83.field4508;
                                                        var59[var52] = var83.field4516;
                                                    }
                                                } else if (var94 >= 256) {
                                                    var58[var52] = var84.field4508;
                                                    var59[var52] = var84.field4516;
                                                } else {
                                                    var58[var52] = var85.field4508;
                                                    var59[var52] = var85.field4516;
                                                }
                                                int var102 = class726.method4037(arg5[var12][var14], arg5[var13][var14], var95 << 7 >> 9, (byte) 81);
                                                int var103 = class726.method4037(arg5[var12][var15], arg5[var13][var15], var95 << 7 >> 9, (byte) 81);
                                                var57[var52] = class726.method4037(var102, var103, var94 << 7 >> 9, (byte) 81);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field4512) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg4.method1671(var14, var12, (byte) 66);
                            int var105 = arg4.method1671(var14, var13, (byte) -118);
                            int var106 = arg4.method1671(var15, var13, (byte) 65);
                            int var107 = arg4.method1671(var15, var12, (byte) -81);
                            boolean var108 = class728.method4056(var14, var12, (byte) -109);
                            if (var108 && arg2 > 1 || !var108 && arg2 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field4517) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field3522) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field9035[arg2][var12][var14] = (byte) class695.method3919(this.field9035[arg2][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field9052) {
                                var110 = class439.method2739(var12, var14);
                                var111 = class429.method2681(var12, var14);
                                var112 = class304.method1827(var12, var14);
                            }
                            arg4.method1673(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class267.method1603(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lrq;[[BIII[ZI[[BLoaa;III[[BLha;)V", line = 887)
    private final void method3610(class350 arg0, byte[][] arg1, int arg2, int arg3, int arg4, boolean[] arg5, int arg6, byte[][] arg7, class287 arg8, int arg9, int arg10, int arg11, byte[][] arg12, class58 arg13) {
        field9049++;
        boolean[] var15 = arg8 != null && arg8.field3538 ? class374.field4813[arg4] : class342.field4438[arg4];
        if (arg11 != 0) {
            this.field9034 = null;
        }
        if (arg9 > 0) {
            if (arg2 > 0) {
                int var16 = arg12[arg2 - 1][arg9 - 1] & 0xFF;
                if (var16 > 0) {
                    class287 var17 = this.field9057.method965(var16 - 1, (byte) 127);
                    if (var17.field3529 != -1 && var17.field3538) {
                        byte var18 = arg1[arg2 - 1][arg9 - 1];
                        int var19 = arg7[arg2 - 1][arg9 - 1] * 2 + 4 & 0x7;
                        int var20 = class647.method3688(var17, arg13, 0);
                        if (class203.field2405[var18][var19]) {
                            class174.field2052[0] = var17.field3529;
                            class520.field7406[0] = var20;
                            class65.field664[0] = var17.field3530;
                            class733.field10264[0] = var17.field3536;
                            class555.field7955[0] = var17.field3533;
                            class279.field3426[0] = 256;
                        }
                    }
                }
            }
            if ((arg3 - 1) > arg2) {
                int var21 = arg12[arg2 + 1][arg9 - 1] & 0xFF;
                if (var21 > 0) {
                    class287 var22 = this.field9057.method965(var21 - 1, (byte) 110);
                    if (var22.field3529 != -1 && var22.field3538) {
                        byte var23 = arg1[arg2 + 1][arg9 - 1];
                        int var24 = arg7[arg2 + 1][arg9 - 1] * 2 + 6 & 0x7;
                        int var25 = class647.method3688(var22, arg13, arg11);
                        if (class203.field2405[var23][var24]) {
                            class174.field2052[2] = var22.field3529;
                            class520.field7406[2] = var25;
                            class65.field664[2] = var22.field3530;
                            class733.field10264[2] = var22.field3536;
                            class555.field7955[2] = var22.field3533;
                            class279.field3426[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg6 - 1) > arg9) {
            if (arg2 > 0) {
                int var26 = arg12[arg2 - 1][arg9 + 1] & 0xFF;
                if (var26 > 0) {
                    class287 var27 = this.field9057.method965(var26 - 1, (byte) 121);
                    if (var27.field3529 != -1 && var27.field3538) {
                        byte var28 = arg1[arg2 - 1][arg9 + 1];
                        int var29 = (arg7[arg2 - 1][arg9 + 1] * 2) + 2 & 0x7;
                        int var30 = class647.method3688(var27, arg13, arg11);
                        if (class203.field2405[var28][var29]) {
                            class174.field2052[6] = var27.field3529;
                            class520.field7406[6] = var30;
                            class65.field664[6] = var27.field3530;
                            class733.field10264[6] = var27.field3536;
                            class555.field7955[6] = var27.field3533;
                            class279.field3426[6] = 64;
                        }
                    }
                }
            }
            if ((arg3 - 1) > arg2) {
                int var31 = arg12[arg2 + 1][arg9 + 1] & 0xFF;
                if (var31 > 0) {
                    class287 var32 = this.field9057.method965(var31 - 1, (byte) -60);
                    if (var32.field3529 != -1 && var32.field3538) {
                        byte var33 = arg1[arg2 + 1][arg9 + 1];
                        int var34 = arg7[arg2 + 1][arg9 + 1] * 2 & 0x7;
                        int var35 = class647.method3688(var32, arg13, arg11);
                        if (class203.field2405[var33][var34]) {
                            class174.field2052[4] = var32.field3529;
                            class520.field7406[4] = var35;
                            class65.field664[4] = var32.field3530;
                            class733.field10264[4] = var32.field3536;
                            class555.field7955[4] = var32.field3533;
                            class279.field3426[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg9 > 0) {
            int var36 = arg12[arg2][arg9 - 1] & 0xFF;
            if (var36 > 0) {
                class287 var37 = this.field9057.method965(var36 - 1, (byte) -77);
                if (var37.field3529 != -1) {
                    byte var38 = arg1[arg2][arg9 - 1];
                    byte var39 = arg7[arg2][arg9 - 1];
                    if (var37.field3538) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class647.method3688(var37, arg13, 0);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class203.field2405[var38][var41] && var37.field3533 >= class555.field7955[var40]) {
                                class174.field2052[var40] = var37.field3529;
                                class520.field7406[var40] = var42;
                                class65.field664[var40] = var37.field3530;
                                class733.field10264[var40] = var37.field3536;
                                if (class555.field7955[var40] == var37.field3533) {
                                    class279.field3426[var40] = class695.method3919(class279.field3426[var40], 32);
                                } else {
                                    class279.field3426[var40] = 32;
                                }
                                class555.field7955[var40] = var37.field3533;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg10 & 0x3]) {
                            arg5[0] = class374.field4813[var38][class327.method1956(3, var39 + 2)];
                        }
                    } else if (!var15[arg10 & 0x3]) {
                        arg5[0] = class342.field4438[var38][class327.method1956(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg9 < (arg6 - 1)) {
            int var44 = arg12[arg2][arg9 + 1] & 0xFF;
            if (var44 > 0) {
                class287 var45 = this.field9057.method965(var44 - 1, (byte) 100);
                if (var45.field3529 != -1) {
                    byte var46 = arg1[arg2][arg9 + 1];
                    byte var47 = arg7[arg2][arg9 + 1];
                    if (var45.field3538) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class647.method3688(var45, arg13, arg11);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class203.field2405[var46][var49] && var45.field3533 >= class555.field7955[var48]) {
                                class174.field2052[var48] = var45.field3529;
                                class520.field7406[var48] = var50;
                                class65.field664[var48] = var45.field3530;
                                class733.field10264[var48] = var45.field3536;
                                if (class555.field7955[var48] == var45.field3533) {
                                    class279.field3426[var48] = class695.method3919(class279.field3426[var48], 16);
                                } else {
                                    class279.field3426[var48] = 16;
                                }
                                class555.field7955[var48] = var45.field3533;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg10 + 2 & 0x3]) {
                            arg5[2] = class374.field4813[var46][class327.method1956(var47, 3)];
                        }
                    } else if (!var15[arg10 + 2 & 0x3]) {
                        arg5[2] = class342.field4438[var46][class327.method1956(3, var47)];
                    }
                }
            }
        }
        if (arg2 > 0) {
            int var52 = arg12[arg2 - 1][arg9] & 0xFF;
            if (var52 > 0) {
                class287 var53 = this.field9057.method965(var52 - 1, (byte) 93);
                if (var53.field3529 != -1) {
                    byte var54 = arg1[arg2 - 1][arg9];
                    byte var55 = arg7[arg2 - 1][arg9];
                    if (var53.field3538) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class647.method3688(var53, arg13, 0);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class203.field2405[var54][var57] && var53.field3533 >= class555.field7955[var56]) {
                                class174.field2052[var56] = var53.field3529;
                                class520.field7406[var56] = var58;
                                class65.field664[var56] = var53.field3530;
                                class733.field10264[var56] = var53.field3536;
                                if (class555.field7955[var56] == var53.field3533) {
                                    class279.field3426[var56] = class695.method3919(class279.field3426[var56], 8);
                                } else {
                                    class279.field3426[var56] = 8;
                                }
                                class555.field7955[var56] = var53.field3533;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg10 + 3 & 0x3]) {
                            arg5[3] = class374.field4813[var54][class327.method1956(3, var55 + 1)];
                        }
                    } else if (!var15[arg10 + 3 & 0x3]) {
                        arg5[3] = class342.field4438[var54][class327.method1956(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg3 - 1 > arg2) {
            int var60 = arg12[arg2 + 1][arg9] & 0xFF;
            if (var60 > 0) {
                class287 var61 = this.field9057.method965(var60 - 1, (byte) 84);
                if (var61.field3529 != -1) {
                    byte var62 = arg1[arg2 + 1][arg9];
                    byte var63 = arg7[arg2 + 1][arg9];
                    if (var61.field3538) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class647.method3688(var61, arg13, arg11);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class203.field2405[var62][var65] && class555.field7955[var64] <= var61.field3533) {
                                class174.field2052[var64] = var61.field3529;
                                class520.field7406[var64] = var66;
                                class65.field664[var64] = var61.field3530;
                                class733.field10264[var64] = var61.field3536;
                                if (class555.field7955[var64] == var61.field3533) {
                                    class279.field3426[var64] = class695.method3919(class279.field3426[var64], 4);
                                } else {
                                    class279.field3426[var64] = 4;
                                }
                                class555.field7955[var64] = var61.field3533;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg10 + 1 & 0x3]) {
                            arg5[1] = class374.field4813[var62][class327.method1956(3, var63 + 3)];
                        }
                    } else if (!var15[arg10 + 1 & 0x3]) {
                        arg5[1] = class342.field4438[var62][class327.method1956(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var68 = class647.method3688(arg8, arg13, 0);
        if (!arg8.field3538) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg10 * 2) & 0x7;
            if (class203.field2405[arg4][var69] && arg8.field3533 >= class555.field7955[var70]) {
                class174.field2052[var70] = arg8.field3529;
                class520.field7406[var70] = var68;
                class65.field664[var70] = arg8.field3530;
                class733.field10264[var70] = arg8.field3536;
                if (class555.field7955[var70] == arg8.field3533) {
                    class279.field3426[var70] = class695.method3919(class279.field3426[var70], 2);
                } else {
                    class279.field3426[var70] = 2;
                }
                class555.field7955[var70] = arg8.field3533;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILig;BII[Lcaa;I)V", line = 1353)
    public final void method3611(int arg0, class244 arg1, byte arg2, int arg3, int arg4, class302[] arg5, int arg6) {
        field9037++;
        if (arg2 >= -86) {
            this.field9034 = null;
        }
        if (!this.field9052) {
            for (int var8 = 0; var8 < 4; var8++) {
                class302 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && var12 < this.field9048 && var13 >= 0 && this.field9060 > var13) {
                            var9.method1814(var12, -2097153, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg0 + arg3;
        int var15 = arg4 + arg6;
        for (int var16 = 0; var16 < this.field9051; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3617(0, var14 + var17, false, 0, var16, var15 + var18, var18 - -arg6, 0, -11286, arg0 + var17, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILs;Lha;[[ILs;Ls;)V", line = 1430)
    private final void method3612(int arg0, int arg1, class278 arg2, class58 arg3, int[][] arg4, class278 arg5, class278 arg6) {
        for (int var8 = 0; var8 < this.field9048; var8++) {
            for (int var9 = 0; var9 < this.field9060; var9++) {
                if (class526.field7498 == -1 || class755.method4199(0, class526.field7498, arg1, var8, var9)) {
                    byte var10 = this.field9036[arg1][var8][var9];
                    byte var11 = this.field9039[arg1][var8][var9];
                    int var12 = this.field9043[arg1][var8][var9] & 0xFF;
                    int var13 = this.field9045[arg1][var8][var9] & 0xFF;
                    class287 var14 = var12 == 0 ? null : this.field9057.method965(var12 - 1, (byte) 89);
                    class350 var15 = var13 == 0 ? null : this.field9042.method3244(var13 - 1, (byte) -68);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class56.field569[var10];
                        var16 = var15 == null ? 0 : class430.field6250[var10];
                    } else if (var14 != null) {
                        var17 = class56.field569[var10];
                    } else if (var15 != null) {
                        var16 = class56.field569[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20 = var14 == null ? -1 : var14.field3530;
                        int var21 = var15 == null ? -1 : var15.field4508;
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        int[] var25 = new int[var18];
                        boolean var26 = false;
                        boolean var27 = false;
                        if (var14 != null && (var14.field3529 != -1 || var14.field3537 != -1 || var20 != -1)) {
                            for (int var28 = 0; var28 < var17; var28++) {
                                var24[var19] = var20;
                                var25[var19] = var14.field3536;
                                if (var14.field3529 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field3529;
                                }
                                if (var14.field3537 == -1) {
                                    var23[var19] = -1;
                                } else {
                                    var26 = true;
                                    var23[var19] = var14.field3537;
                                }
                                var19++;
                            }
                            if (!this.field9052 && arg1 == 0) {
                                class293.method1744(var8, var9, var14.field3535, var14.field3519 * 8, var14.field3520);
                            }
                        } else {
                            for (int var29 = 0; var29 < var17; var29++) {
                                var22[var19] = -1;
                                var19++;
                            }
                            var27 = true;
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
                                var25[var19] = var15.field4516;
                                var22[var19] = arg4[var8][var9];
                                if (var23 != null) {
                                    var23[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var32 = this.field9046.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg6 == null ? null : new int[var32];
                        int[] var36 = arg6 == null && arg5 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var47 = this.field9046[var37];
                            int var48 = this.field9044[var37];
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
                            if (var35 != null && class203.field2405[var10][var37]) {
                                int var51 = (var8 << 9) + var33[var37];
                                int var52 = (var9 << 9) + var34[var37];
                                var35[var37] = arg6.method1675(var52, var51, 65286) - arg2.method1675(var52, var51, 65286);
                            }
                            if (var36 != null) {
                                if (arg6 != null && !class203.field2405[var10][var37]) {
                                    int var53 = (var8 << 9) + var33[var37];
                                    int var54 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg2.method1675(var54, var53, 65286) - arg6.method1675(var54, var53, class555.method3251(arg0, -65287));
                                } else if (arg5 != null && !class15.field134[var10][var37]) {
                                    int var55 = (var8 << 9) + var33[var37];
                                    int var56 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg5.method1675(var56, var55, arg0 + 65287) - arg2.method1675(var56, var55, 65286);
                                }
                            }
                        }
                        int var38 = arg2.method1671(var9, var8, (byte) -98);
                        int var39 = arg2.method1671(var9, var8 + 1, (byte) 108);
                        int var40 = arg2.method1671(var9 + 1, var8 - -1, (byte) 120);
                        int var41 = arg2.method1671(var9 + 1, var8, (byte) 93);
                        boolean var42 = class728.method4056(var9, var8, (byte) 111);
                        if (var42 && arg1 > 1 || !var42 && arg1 > 0) {
                            boolean var43 = true;
                            if (var15 != null && !var15.field4517) {
                                var43 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var43 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field3522) {
                                var43 = false;
                            }
                            if (var43 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field9035[arg1][var8][var9] = (byte) class695.method3919(this.field9035[arg1][var8][var9], 4);
                            }
                        }
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        if (this.field9052) {
                            var44 = class439.method2739(var8, var9);
                            var45 = class429.method2681(var8, var9);
                            var46 = class304.method1827(var8, var9);
                        }
                        arg2.method1665(var8, var9, var33, var35, var34, var36, class556.field7972[var10], class199.field2356[var10], class170.field1913[var10], var22, var23, var24, var25, var44, var45, var46, false);
                        class267.method1603(arg1, var8, var9);
                    }
                }
            }
        }
        field9041++;
        if (arg0 != -1) {
            this.field9060 = -28;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB[Lcaa;IILig;IIII)V", line = 1752)
    public final void method3613(int arg0, byte arg1, class302[] arg2, int arg3, int arg4, class244 arg5, int arg6, int arg7, int arg8, int arg9) {
        field9056++;
        if (arg1 != -120) {
            return;
        }
        int var11 = (arg8 & 0x7) * 8;
        if (!this.field9052) {
            class302 var12 = arg2[arg0];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg4 + class325.method1936(var14 & 0x7, var13 & 0x7, -104, arg3);
                    int var16 = class9.method36(var13 & 0x7, arg3, var14 & 0x7, -60) + arg6;
                    if (var15 > 0 && var15 < (this.field9048 - 1) && var16 > 0 && var16 < (this.field9060 - 1)) {
                        var12.method1814(var15, -2097153, var16);
                    }
                }
            }
        }
        int var17 = (arg9 & 0x7) * 8;
        int var18 = (arg8 & 0xFFFFFFF8) << 3;
        int var19 = arg9 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg3 == 1) {
            var21 = 1;
        } else if (arg3 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg3 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field9051; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg7 == var22 && var11 <= var23 && (var11 + 8) >= var23 && var17 <= var24 && var24 <= (var17 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var17 + 8 == var24) {
                            if (arg3 == 0) {
                                var26 = arg6 + var24 - var17;
                                var25 = arg4 - (var11 - var23);
                            } else if (arg3 == 1) {
                                var26 = arg6 + var11 + 8 - var23;
                                var25 = var24 + arg4 - var17;
                            } else if (arg3 == 2) {
                                var26 = arg6 + 8 - (-var17 + var24);
                                var25 = var11 + arg4 + 8 - var23;
                            } else {
                                var25 = var17 + arg4 + 8 - var24;
                                var26 = arg6 + var23 - var11;
                            }
                            this.method3617(0, var18 + var23, true, 0, arg0, var19 + var24, var26, 0, -11286, var25, arg5);
                        } else {
                            var25 = class325.method1936(var24 & 0x7, var23 & 0x7, -108, arg3) + arg4;
                            var26 = arg6 + class9.method36(var23 & 0x7, arg3, var24 & 0x7, arg1 ^ 0x3F);
                            this.method3617(arg3, var18 + var23, false, var20, arg0, var19 + var24, var26, var21, arg1 ^ 0x2C62, var25, arg5);
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
                                if (arg3 == 0) {
                                    var31 = var30 + arg6 - var17;
                                    var32 = arg4 + var29 - var11;
                                } else if (arg3 == 1) {
                                    var32 = var30 + arg4 - var17;
                                    var31 = var11 + (arg6 - -8) - var29;
                                } else if (arg3 == 2) {
                                    var31 = var17 + arg6 + 8 - var30;
                                    var32 = arg4 + var11 + 8 - var29;
                                } else {
                                    var31 = var29 + arg6 - var11;
                                    var32 = arg4 + 8 - (-var17 + var30);
                                }
                                if (var32 >= 0 && var32 < this.field9048 && var31 >= 0 && var31 < this.field9060) {
                                    this.field9038[arg0][var32][var31] = this.field9038[arg0][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method3617(0, 0, false, 0, 0, 0, -1, 0, arg1 - 11166, -1, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ls;Lha;Ls;Z)V", line = 1960)
    public final void method3614(class278 arg0, class58 arg1, class278 arg2, boolean arg3) {
        field9053++;
        if (class592.field8348 == null || class592.field8348.length != this.field9060) {
            class683.field9669 = new int[this.field9060];
            class75.field798 = new int[this.field9060];
            class274.field3366 = new int[this.field9060];
            class188.field2238 = new int[this.field9060];
            class592.field8348 = new int[this.field9060];
        }
        int[][] var5 = new int[this.field9048][this.field9060];
        int var6 = 0;
        if (arg3) {
            return;
        }
        while (this.field9051 > var6) {
            for (int var8 = 0; var8 < this.field9060; var8++) {
                class592.field8348[var8] = 0;
                class683.field9669[var8] = 0;
                class188.field2238[var8] = 0;
                class75.field798[var8] = 0;
                class274.field3366[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field9048; var9++) {
                for (int var10 = 0; var10 < this.field9060; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field9048) {
                        int var20 = this.field9045[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class350 var21 = this.field9042.method3244(var20 - 1, (byte) -68);
                            class592.field8348[var10] += var21.field4515;
                            class683.field9669[var10] += var21.field4502;
                            class188.field2238[var10] += var21.field4513;
                            class75.field798[var10] += var21.field4507;
                            var10002 = class274.field3366[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field9045[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class350 var24 = this.field9042.method3244(var23 - 1, (byte) -68);
                            class592.field8348[var10] -= var24.field4515;
                            class683.field9669[var10] -= var24.field4502;
                            class188.field2238[var10] -= var24.field4513;
                            class75.field798[var10] -= var24.field4507;
                            var10002 = class274.field3366[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field9060; var16++) {
                        int var17 = var16 + 5;
                        if (this.field9060 > var17) {
                            var14 += class75.field798[var17];
                            var12 += class683.field9669[var17];
                            var15 += class274.field3366[var17];
                            var11 += class592.field8348[var17];
                            var13 += class188.field2238[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class683.field9669[var18];
                            var13 -= class188.field2238[var18];
                            var11 -= class592.field8348[var18];
                            var14 -= class75.field798[var18];
                            var15 -= class274.field3366[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class394.method2419(-1575722079, var12 / var15, var13 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class326.field4232) {
                this.method3609(arg1, (byte) -96, var6, var6 == 0 ? arg0 : null, class504.field7120[var6], var5, var6 == 0 ? arg2 : null);
            } else {
                this.method3612(-1, var6, class504.field7120[var6], arg1, var5, var6 == 0 ? arg0 : null, var6 == 0 ? arg2 : null);
            }
            this.field9045[var6] = null;
            this.field9043[var6] = null;
            this.field9036[var6] = null;
            this.field9039[var6] = null;
            var6++;
        }
        if (!this.field9052) {
            if (class288.field3543 != 0) {
                class480.method2888();
            }
            if (class452.field6507) {
                class368.method2146();
            }
        }
        for (int var7 = 0; var7 < this.field9051; var7++) {
            class504.field7120[var7].method1674();
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIZLwea;Lfs;)V", line = 2539)
    public class630(int arg0, int arg1, int arg2, boolean arg3, class156 arg4, class553 arg5) {
        this.field9042 = arg5;
        this.field9048 = arg1;
        this.field9052 = arg3;
        this.field9051 = arg0;
        this.field9057 = arg4;
        this.field9060 = arg2;
        this.field9045 = new byte[this.field9051][this.field9048][this.field9060];
        this.field9039 = new byte[this.field9051][this.field9048][this.field9060];
        this.field9036 = new byte[this.field9051][this.field9048][this.field9060];
        this.field9038 = new int[this.field9051][this.field9048 + 1][this.field9060 + 1];
        this.field9043 = new byte[this.field9051][this.field9048][this.field9060];
        this.field9035 = new byte[this.field9051][this.field9048 + 1][this.field9060 + 1];
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBIII)V", line = 2140)
    public final void method3615(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < arg3 + arg1; var7++) {
            for (int var10 = arg4; var10 < arg4 + arg5; var10++) {
                if (var10 >= 0 && this.field9048 > var10 && var7 >= 0 && var7 < this.field9060) {
                    this.field9038[arg0][var10][var7] = arg0 <= 0 ? 0 : this.field9038[arg0 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg2 < 60) {
            method3608((byte) 4);
        }
        field9054++;
        if (arg4 > 0 && arg4 < this.field9048) {
            for (int var8 = arg3 + 1; var8 < arg1 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field9060) {
                    this.field9038[arg0][arg4][var8] = this.field9038[arg0][arg4 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field9060) {
            for (int var9 = arg4 + 1; var9 < arg4 + arg5; var9++) {
                if (var9 >= 0 && this.field9048 > var9) {
                    this.field9038[arg0][var9][arg3] = this.field9038[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg4 < 0 || arg3 < 0 || arg4 >= this.field9048 || this.field9060 <= arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 > 0 && this.field9038[arg0][arg4 - 1][arg3] != 0) {
                this.field9038[arg0][arg4][arg3] = this.field9038[arg0][arg4 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field9038[arg0][arg4][arg3 - 1] != 0) {
                this.field9038[arg0][arg4][arg3] = this.field9038[arg0][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && this.field9038[arg0][arg4 - 1][arg3 - 1] != 0) {
                this.field9038[arg0][arg4][arg3] = this.field9038[arg0][arg4 - 1][arg3 - 1];
                return;
            }
        } else if (arg4 <= 0 || this.field9038[arg0][arg4 - 1][arg3] == this.field9038[arg0 - 1][arg4 - 1][arg3]) {
            if (arg3 > 0 && this.field9038[arg0 - 1][arg4][arg3 - 1] != this.field9038[arg0][arg4][arg3 - 1]) {
                this.field9038[arg0][arg4][arg3] = this.field9038[arg0][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && this.field9038[arg0 - 1][arg4 - 1][arg3 - 1] != this.field9038[arg0][arg4 - 1][arg3 - 1]) {
                this.field9038[arg0][arg4][arg3] = this.field9038[arg0][arg4 - 1][arg3 - 1];
                return;
            }
            return;
        } else {
            this.field9038[arg0][arg4][arg3] = this.field9038[arg0][arg4 - 1][arg3];
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B[Lcaa;Lha;[[[I)V", line = 2257)
    public final void method3616(byte arg0, class302[] arg1, class58 arg2, int[][][] arg3) {
        if (!this.field9052) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field9048; var6++) {
                    for (int var7 = 0; var7 < this.field9060; var7++) {
                        if ((class100.field1043[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class100.field1043[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1816((byte) -34, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        field9063++;
        for (int var9 = 0; var9 < this.field9051; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field9052) {
                if (class220.field2542) {
                    var11 |= 0x8;
                }
                if (class452.field6507) {
                    var10 |= 0x2;
                }
                if (class288.field3543 != 0) {
                    if (class633.field9107 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class452.field6507) {
                var11 |= 0x7;
            }
            if (!class668.field9503) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field9038[var9] : arg3[var9];
            class563.method3282(var9, arg2.method424(this.field9048, this.field9060, this.field9038[var9], var12, 512, var10, var11));
        }
        if (arg0 != -84) {
            this.method3612(112, -71, null, null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZIIIIIIILig;)V", line = 2356)
    private final void method3617(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class244 arg10) {
        field9047++;
        if (arg0 == 1) {
            arg7 = 1;
        } else if (arg0 == 2) {
            arg3 = 1;
            arg7 = 1;
        } else if (arg0 == 3) {
            arg3 = 1;
        }
        if (arg8 != -11286) {
            this.method3613(62, (byte) -99, null, -108, 85, null, -15, -25, -42, 19);
        }
        if (arg9 < 0 || this.field9048 <= arg9 || arg6 < 0 || this.field9060 <= arg6) {
            while (true) {
                int var14 = arg10.method1423(-19);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method1423(-74);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method1423(arg8 ^ 0x2C4A);
                }
            }
        }
        if (!this.field9052 && !arg2) {
            class100.field1043[arg4][arg9][arg6] = 0;
        }
        while (true) {
            int var12 = arg10.method1423(arg8 + 11192);
            if (var12 == 0) {
                if (this.field9052) {
                    this.field9038[0][arg3 + arg9][arg6 + arg7] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field9038[0][arg3 + arg9][arg6 + arg7] = -class745.method4142(-1, arg1 + 932731, arg5 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field9038[arg4][arg9 + arg3][arg6 + arg7] = this.field9038[arg4 - 1][arg3 + arg9][arg6 + arg7] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method1423(arg8 + 11277);
                if (!this.field9052) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg4 == 0) {
                        this.field9038[0][arg3 + arg9][arg6 + arg7] = -var13 * 8 << 2;
                        return;
                    }
                    this.field9038[arg4][arg3 + arg9][arg6 + arg7] = this.field9038[arg4 - 1][arg3 + arg9][arg6 + arg7] - (var13 * 8 << 2);
                    return;
                }
                this.field9038[0][arg9 + arg3][arg6 + arg7] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg2) {
                    arg10.method1423(-30);
                } else {
                    this.field9043[arg4][arg9][arg6] = arg10.method1448((byte) -116);
                    this.field9036[arg4][arg9][arg6] = (byte) ((var12 - 2) / 4);
                    this.field9039[arg4][arg9][arg6] = (byte) class327.method1956(arg0 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field9052 && !arg2) {
                    class100.field1043[arg4][arg9][arg6] = (byte) (var12 - 49);
                }
            } else if (!arg2) {
                this.field9045[arg4][arg9][arg6] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V", line = 2490)
    public final void method3618(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < -28) {
            for (int var6 = 0; var6 < this.field9051; var6++) {
                this.method3615(var6, arg3, (byte) 114, arg4, arg0, arg1);
            }
            field9061++;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II[[I)V", line = 2512)
    public final void method3619(int arg0, int arg1, int[][] arg2) {
        field9040++;
        if (arg0 != 1) {
            return;
        }
        int[][] var4 = this.field9038[arg1];
        for (int var5 = 0; var5 < (this.field9048 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field9060 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }
}
