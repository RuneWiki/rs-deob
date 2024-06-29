import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class284 {

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "[I")
    private int[] field4311 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "[I")
    private int[] field4298 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "Lku;")
    private class244 field4300;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public int field4291;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "Lmn;")
    private class237 field4310;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "Z")
    public boolean field4301;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "[[[B")
    private byte[][][] field4315;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "[[[B")
    private byte[][][] field4289;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "[[[B")
    private byte[][][] field4284;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "[[[B")
    public byte[][][] field4308;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "[[[B")
    private byte[][][] field4307;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "[[[I")
    public int[][][] field4286;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "[I")
    public static int[] field4294 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    public static int field4304 = 0;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "Lno;")
    public static class476 field4297;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "[[[B")
    public byte[][][] field4290;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lfo;[[IILfo;Lfo;ILqq;)V", line = 3)
    private final void method1724(class343 arg0, int[][] arg1, int arg2, class343 arg3, class343 arg4, int arg5, class318 arg6) {
        field4296++;
        if (arg2 >= -18) {
            return;
        }
        byte[][] var8 = this.field4315[arg5];
        byte[][] var9 = this.field4284[arg5];
        byte[][] var10 = this.field4289[arg5];
        byte[][] var11 = this.field4307[arg5];
        for (int var12 = 0; var12 < this.field4291; var12++) {
            int var13 = var12 >= (this.field4291 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field4293; var14++) {
                int var15 = this.field4293 - 1 <= var14 ? var14 : var14 + 1;
                if (class511.field7752 == -1 || class29.method153(var12, var14, arg5, (byte) -126, class511.field7752)) {
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
                        class448 var26 = var21 == 0 ? null : this.field4300.method1461(4, var21 - 1);
                        class147 var27 = var22 == 0 ? null : this.field4310.method1427(false, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class448 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6895 == -1 && var26.field6908 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6891;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field4291 && this.field4293 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var32--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method318(var12, var14) - arg0.method318(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg0.method318(var13, var14) - arg0.method318(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class213.field3309[var39] = -1;
                            class306.field4642[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6891 ? class58.field994[var19] : class14.field194[var19];
                        this.method1728(var12, var19, var9, var8, var11, var14, var18, var27, var26, 16, var20, this.field4291, arg6, this.field4293);
                        boolean var41 = var26 != null && var26.field6908 != var26.field6895;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class213.field3309[var42] >= 0 && class69.field1214[var42] != class412.field5970[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class15.method85(var18[1], class330.method2050(class306.field4642[4], class306.field4642[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class15.method85(var18[3], class330.method2050(class306.field4642[6], class306.field4642[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class15.method85(var18[0], class330.method2050(class306.field4642[0], class306.field4642[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class15.method85(var18[2], class330.method2050(class306.field4642[4], class306.field4642[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
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
                            var49 = var26 == null ? 0 : class237.field3585[var19];
                            var47 = class388.field5616[var19];
                            var48 = var27 == null ? 0 : class76.field1371[var19];
                            var46 = class224.field3454[var19];
                            var45 = class231.field3514[var19];
                        } else if (var17) {
                            var45 = class114.field1931[var19];
                            var46 = class486.field7408[var19];
                            var44 = class469.field7191[var19];
                            var49 = var26 == null ? 0 : class179.field2797[var19];
                            var48 = var27 == null ? 0 : class14.field193[var19];
                            var47 = class58.field1000[var19];
                        } else {
                            var44 = class256.field3899[var19];
                            var45 = class120.field2002[var19];
                            var46 = class415.field6012[var19];
                            var47 = class355.field5293[var19];
                            var48 = var27 == null ? 0 : class215.field3322[var19];
                            var49 = var26 == null ? 0 : class444.field6854[var19];
                        }
                        int var50 = var48 + var49;
                        if (var50 <= 0) {
                            class162.method1036(arg5, var12, var14);
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
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field6895;
                                var63 = arg6.method1893() ? var26.field6899 : var26.field6906;
                                var64 = var26.field6890;
                                int var65 = class149.method969(arg6, 0, var26);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = 1;
                                        class12.field144[2] = var47[var51];
                                        class12.field144[3] = 1;
                                        class12.field144[4] = var45[var51];
                                        var98 = 6;
                                        class12.field144[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = 5;
                                        class12.field144[2] = var47[var51];
                                        class12.field144[3] = 5;
                                        class12.field144[4] = var45[var51];
                                        var98 = 6;
                                        class12.field144[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = 3;
                                        class12.field144[2] = var47[var51];
                                        class12.field144[3] = 3;
                                        class12.field144[4] = var45[var51];
                                        var98 = 6;
                                        class12.field144[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = 7;
                                        class12.field144[2] = var47[var51];
                                        class12.field144[3] = 7;
                                        class12.field144[4] = var45[var51];
                                        class12.field144[5] = var47[var51];
                                        var98 = 6;
                                    } else {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = var45[var51];
                                        class12.field144[2] = var47[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class12.field144[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field4298[var100];
                                        int var103 = this.field4311[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = 128 - var102;
                                            var105 = var103;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var105 = 128 - var103;
                                            var104 = var102;
                                        } else {
                                            var105 = var102;
                                            var104 = var103;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var104;
                                        if (var60 != null && class319.field4803[var19][var100]) {
                                            int var106 = (var12 << 7) + var105;
                                            int var107 = (var14 << 7) + var104;
                                            var60[var52] = arg4.method314(var106, var107) - arg0.method314(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class319.field4803[var19][var100]) {
                                                int var108 = (var12 << 7) + var105;
                                                int var109 = (var14 << 7) + var104;
                                                var61[var52] = arg0.method314(var108, var109) - arg4.method314(var108, var109);
                                            } else if (arg3 != null && !class317.field4776[var19][var100]) {
                                                int var110 = (var12 << 7) + var105;
                                                int var111 = (var14 << 7) + var104;
                                                var61[var52] = arg3.method314(var110, var111) - arg0.method314(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && class213.field3309[var101] > var26.field6901) {
                                            if (var54 != null) {
                                                var54[var52] = class412.field5970[var101];
                                            }
                                            var59[var52] = class475.field7253[var101];
                                            var58[var52] = class386.field5595[var101];
                                            var57[var52] = class69.field1214[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg6.method1893() ? var26.field6899 : var26.field6906;
                                            var59[var52] = var26.field6890;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field4301 && arg5 == 0) {
                                    class75.method559(var12, var14, var26.field6893, var26.field6892 * 8, var26.field6909);
                                }
                                if (var19 != 12 && var26.field6895 != -1 && var26.field6902) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class237.field3585[var19];
                            } else if (var17) {
                                var51 += class179.field2797[var19];
                            } else {
                                var51 += class444.field6854[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class147 var67 = this.field4310.method1427(false, var22 - 1);
                                class147 var68 = this.field4310.method1427(false, var23 - 1);
                                class147 var69 = this.field4310.method1427(false, var24 - 1);
                                class147 var70 = this.field4310.method1427(false, var25 - 1);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = 1;
                                        class12.field144[2] = var47[var51];
                                        class12.field144[3] = 1;
                                        class12.field144[4] = var45[var51];
                                        var73 = 6;
                                        class12.field144[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = 5;
                                        class12.field144[2] = var47[var51];
                                        class12.field144[3] = 5;
                                        class12.field144[4] = var45[var51];
                                        class12.field144[5] = var47[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = 3;
                                        class12.field144[2] = var47[var51];
                                        class12.field144[3] = 3;
                                        class12.field144[4] = var45[var51];
                                        var73 = 6;
                                        class12.field144[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = 7;
                                        class12.field144[2] = var47[var51];
                                        class12.field144[3] = 7;
                                        class12.field144[4] = var45[var51];
                                        var73 = 6;
                                        class12.field144[5] = var47[var51];
                                    } else {
                                        class12.field144[0] = var46[var51];
                                        class12.field144[1] = var45[var51];
                                        var73 = 3;
                                        class12.field144[2] = var47[var51];
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class12.field144[var74];
                                        int var76 = var75 - var20 * 2 & 0x7;
                                        int var77 = this.field4298[var75];
                                        int var78 = this.field4311[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var80 = 128 - var77;
                                            var79 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class319.field4803[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg4.method314(var81, var82) - arg0.method314(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class319.field4803[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg0.method314(var83, var84) - arg4.method314(var83, var84);
                                            } else if (arg3 != null && !class317.field4776[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg3.method314(var85, var86) - arg0.method314(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class213.field3309[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class412.field5970[var76];
                                            }
                                            var59[var52] = class475.field7253[var76];
                                            var58[var52] = class386.field5595[var76];
                                            var57[var52] = class69.field1214[var76];
                                        } else {
                                            if (var17 && class319.field4803[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg1[var12][var14];
                                                var58[var52] = var67.field2374;
                                                var59[var52] = var67.field2377;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg1[var12][var15];
                                                var58[var52] = var68.field2374;
                                                var59[var52] = var68.field2377;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg1[var13][var15];
                                                var58[var52] = var69.field2374;
                                                var59[var52] = var69.field2377;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg1[var13][var14];
                                                var58[var52] = var70.field2374;
                                                var59[var52] = var70.field2377;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 >= 64) {
                                                        var58[var52] = var68.field2374;
                                                        var59[var52] = var68.field2377;
                                                    } else {
                                                        var58[var52] = var67.field2374;
                                                        var59[var52] = var67.field2377;
                                                    }
                                                } else if (var79 >= 64) {
                                                    var58[var52] = var69.field2374;
                                                    var59[var52] = var69.field2377;
                                                } else {
                                                    var58[var52] = var70.field2374;
                                                    var59[var52] = var70.field2377;
                                                }
                                                int var87 = class420.method2458(arg1[var13][var14], arg1[var12][var14], 64512, var80 << 7 >> 7);
                                                int var88 = class420.method2458(arg1[var13][var15], arg1[var12][var15], 64512, var80 << 7 >> 7);
                                                var57[var52] = class420.method2458(var88, var87, 64512, var79 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field2383) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg0.method318(var12, var14);
                            int var90 = arg0.method318(var13, var14);
                            int var91 = arg0.method318(var13, var15);
                            int var92 = arg0.method318(var12, var15);
                            if (arg5 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field6910) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field4308[arg5][var12][var14] = (byte) class318.method1973(this.field4308[arg5][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field4301) {
                                var94 = class399.method2368(var12, var14);
                                var95 = class173.method1084(var12, var14);
                                var96 = class347.method2120(var12, var14);
                            }
                            arg0.method311(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class162.method1036(arg5, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILha;IIBIIII[Lea;)V", line = 865)
    public final void method1725(int arg0, class40 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class367[] arg9) {
        field4305++;
        int var11 = (arg7 & 0x7) * 8;
        if (!this.field4301) {
            class367 var12 = arg9[arg5];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class261.method1588((byte) 123, var14 & 0x7, arg3, var13 & 0x7) + arg8;
                    int var16 = class198.method1229(var13 & 0x7, var14 & 0x7, -2, arg3) + arg0;
                    if (var15 > 0 && this.field4291 - 1 > var15 && var16 > 0 && var16 < (this.field4293 - 1)) {
                        var12.method2227(var15, var16, -2097153);
                    }
                }
            }
        }
        int var17 = (arg2 & 0x7) * 8;
        int var18 = (arg7 & 0xFFFFFFF8) << 3;
        int var19 = (arg2 & 0xFFFFFFF8) << 3;
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
        int var22 = 0;
        if (arg4 < 19) {
            this.field4301 = false;
        }
        while (var22 < this.field4299) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 != var22 || var11 > var23 || var23 > (var11 + 8) || var17 > var24 || (var17 + 8) < var24) {
                        this.method1734(0, false, 0, arg1, 0, 0, -1, 0, -9621, 0, -1);
                    } else if (var11 + 8 == var23 || (var17 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg3 == 0) {
                            var32 = arg8 + var23 - var11;
                            var31 = arg0 + var24 - var17;
                        } else if (arg3 == 1) {
                            var32 = arg8 + var24 - var17;
                            var31 = arg0 + var11 + 8 - var23;
                        } else if (arg3 == 2) {
                            var31 = arg0 + var17 + 8 - var24;
                            var32 = arg8 + var11 + 8 - var23;
                        } else {
                            var31 = arg0 + var23 - var11;
                            var32 = arg8 + 8 - (var24 - var17);
                        }
                        this.method1734(0, true, var18 + var23, arg1, arg5, 0, var31, 0, -9621, var19 + var24, var32);
                    } else {
                        int var25 = arg8 + class261.method1588((byte) -103, var24 & 0x7, arg3, var23 & 0x7);
                        int var26 = class198.method1229(var23 & 0x7, var24 & 0x7, -2, arg3) + arg0;
                        this.method1734(var21, false, var18 + var23, arg1, arg5, var20, var26, arg3, -9621, var19 + var24, var25);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg3 == 0) {
                                var29 = arg8 - (var11 - var27);
                                var30 = arg0 + var28 - var17;
                            } else if (arg3 == 1) {
                                var30 = var11 + arg0 + 8 - var27;
                                var29 = arg8 - (var17 - var28);
                            } else if (arg3 == 2) {
                                var29 = arg8 + var11 + 8 - var27;
                                var30 = arg0 + var17 + 8 - var28;
                            } else {
                                var30 = var27 + arg0 - var11;
                                var29 = var17 + arg8 + 8 - var28;
                            }
                            if (var29 >= 0 && var29 < this.field4291 && var30 >= 0 && var30 < this.field4293) {
                                this.field4286[arg5][var29][var30] = this.field4286[arg5][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
            var22++;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lqq;[Lea;I[[[I)V", line = 1041)
    public final void method1726(class318 arg0, class367[] arg1, int arg2, int[][][] arg3) {
        if (!this.field4301) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field4291; var6++) {
                    for (int var7 = 0; var7 < this.field4293; var7++) {
                        if ((class146.field2369[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class146.field2369[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method2217(var6, 2097152, var7);
                            }
                        }
                    }
                }
            }
        }
        field4282++;
        if (arg2 <= 65) {
            return;
        }
        for (int var9 = 0; var9 < this.field4299; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field4301) {
                if (class469.field7196) {
                    var11 |= 0x8;
                }
                if (class383.field5571) {
                    var10 |= 0x2;
                }
                if (class257.field3916 != 0) {
                    var10 |= 0x1;
                    if (class455.field6983 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class383.field5571) {
                var11 |= 0x7;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field4286[var9] : arg3[var9];
            class476.method2870(var9, arg0.method1919(this.field4291, this.field4293, this.field4286[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBIII)V", line = 1135)
    public final void method1727(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -9) {
            this.method1733(null, 2, null, null, null, null, 23);
        }
        field4283++;
        for (int var6 = 0; var6 < this.field4299; var6++) {
            this.method1737(arg4, arg0, arg1 ^ 0xFFFFFF89, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II[[B[[B[[BI[ZLtg;Lpb;IIILqq;I)V", line = 1152)
    private final void method1728(int arg0, int arg1, byte[][] arg2, byte[][] arg3, byte[][] arg4, int arg5, boolean[] arg6, class147 arg7, class448 arg8, int arg9, int arg10, int arg11, class318 arg12, int arg13) {
        if (arg8 != null && arg7 != null || arg7 != null && arg1 == 12 || arg8 != null && arg1 == 0) {
            boolean[] var15 = arg8 != null && arg8.field6891 ? class58.field994[arg1] : class14.field194[arg1];
            if (arg5 > 0) {
                if (arg0 > 0) {
                    int var16 = arg4[arg0 - 1][arg5 - 1] & 0xFF;
                    if (var16 > 0) {
                        class448 var17 = this.field4300.method1461(4, var16 - 1);
                        if (var17.field6895 != -1 && var17.field6891) {
                            byte var18 = arg3[arg0 - 1][arg5 - 1];
                            int var19 = arg2[arg0 - 1][arg5 - 1] * 2 + 4 & 0x7;
                            int var20 = class149.method969(arg12, 0, var17);
                            if (class319.field4803[var18][var19]) {
                                class69.field1214[0] = var17.field6895;
                                class412.field5970[0] = var20;
                                class386.field5595[0] = arg12.method1893() ? var17.field6899 : var17.field6906;
                                class475.field7253[0] = var17.field6890;
                                class213.field3309[0] = var17.field6901;
                                class306.field4642[0] = 256;
                            }
                        }
                    }
                }
                if (arg11 - 1 > arg0) {
                    int var21 = arg4[arg0 + 1][arg5 - 1] & 0xFF;
                    if (var21 > 0) {
                        class448 var22 = this.field4300.method1461(4, var21 - 1);
                        if (var22.field6895 != -1 && var22.field6891) {
                            byte var23 = arg3[arg0 + 1][arg5 - 1];
                            int var24 = arg2[arg0 + 1][arg5 - 1] * 2 + 6 & 0x7;
                            int var25 = class149.method969(arg12, arg9 - 16, var22);
                            if (class319.field4803[var23][var24]) {
                                class69.field1214[2] = var22.field6895;
                                class412.field5970[2] = var25;
                                class386.field5595[2] = arg12.method1893() ? var22.field6899 : var22.field6906;
                                class475.field7253[2] = var22.field6890;
                                class213.field3309[2] = var22.field6901;
                                class306.field4642[2] = 512;
                            }
                        }
                    }
                }
            }
            if ((arg13 - 1) > arg5) {
                if (arg0 > 0) {
                    int var26 = arg4[arg0 - 1][arg5 + 1] & 0xFF;
                    if (var26 > 0) {
                        class448 var27 = this.field4300.method1461(arg9 ^ 0x14, var26 - 1);
                        if (var27.field6895 != -1 && var27.field6891) {
                            byte var28 = arg3[arg0 - 1][arg5 + 1];
                            int var29 = arg2[arg0 - 1][arg5 + 1] * 2 + 2 & 0x7;
                            int var30 = class149.method969(arg12, 0, var27);
                            if (class319.field4803[var28][var29]) {
                                class69.field1214[6] = var27.field6895;
                                class412.field5970[6] = var30;
                                class386.field5595[6] = arg12.method1893() ? var27.field6899 : var27.field6906;
                                class475.field7253[6] = var27.field6890;
                                class213.field3309[6] = var27.field6901;
                                class306.field4642[6] = 64;
                            }
                        }
                    }
                }
                if (arg11 - 1 > arg0) {
                    int var31 = arg4[arg0 + 1][arg5 + 1] & 0xFF;
                    if (var31 > 0) {
                        class448 var32 = this.field4300.method1461(4, var31 - 1);
                        if (var32.field6895 != -1 && var32.field6891) {
                            byte var33 = arg3[arg0 + 1][arg5 + 1];
                            int var34 = arg2[arg0 + 1][arg5 + 1] * 2 & 0x7;
                            int var35 = class149.method969(arg12, 0, var32);
                            if (class319.field4803[var33][var34]) {
                                class69.field1214[4] = var32.field6895;
                                class412.field5970[4] = var35;
                                class386.field5595[4] = arg12.method1893() ? var32.field6899 : var32.field6906;
                                class475.field7253[4] = var32.field6890;
                                class213.field3309[4] = var32.field6901;
                                class306.field4642[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg5 > 0) {
                int var36 = arg4[arg0][arg5 - 1] & 0xFF;
                if (var36 > 0) {
                    class448 var37 = this.field4300.method1461(4, var36 - 1);
                    if (var37.field6895 != -1) {
                        byte var38 = arg3[arg0][arg5 - 1];
                        byte var39 = arg2[arg0][arg5 - 1];
                        if (var37.field6891) {
                            int var40 = 2;
                            int var41 = (var39 * 2) + 4;
                            int var42 = class149.method969(arg12, 0, var37);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class319.field4803[var38][var41] && var37.field6901 >= class213.field3309[var40]) {
                                    class69.field1214[var40] = var37.field6895;
                                    class412.field5970[var40] = var42;
                                    class386.field5595[var40] = arg12.method1893() ? var37.field6899 : var37.field6906;
                                    class475.field7253[var40] = var37.field6890;
                                    if (class213.field3309[var40] == var37.field6901) {
                                        class306.field4642[var40] = class318.method1973(class306.field4642[var40], 32);
                                    } else {
                                        class306.field4642[var40] = 32;
                                    }
                                    class213.field3309[var40] = var37.field6901;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg10 & 0x3]) {
                                arg6[0] = class58.field994[var38][class330.method2050(3, var39 + 2)];
                            }
                        } else if (!var15[arg10 & 0x3]) {
                            arg6[0] = class14.field194[var38][class330.method2050(var39 + 2, 3)];
                        }
                    }
                }
            }
            if (arg13 - 1 > arg5) {
                int var44 = arg4[arg0][arg5 + 1] & 0xFF;
                if (var44 > 0) {
                    class448 var45 = this.field4300.method1461(4, var44 - 1);
                    if (var45.field6895 != -1) {
                        byte var46 = arg3[arg0][arg5 + 1];
                        byte var47 = arg2[arg0][arg5 + 1];
                        if (var45.field6891) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class149.method969(arg12, 0, var45);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class319.field4803[var46][var49] && class213.field3309[var48] <= var45.field6901) {
                                    class69.field1214[var48] = var45.field6895;
                                    class412.field5970[var48] = var50;
                                    class386.field5595[var48] = arg12.method1893() ? var45.field6899 : var45.field6906;
                                    class475.field7253[var48] = var45.field6890;
                                    if (class213.field3309[var48] == var45.field6901) {
                                        class306.field4642[var48] = class318.method1973(class306.field4642[var48], 16);
                                    } else {
                                        class306.field4642[var48] = 16;
                                    }
                                    class213.field3309[var48] = var45.field6901;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg10 + 2 & 0x3]) {
                                arg6[2] = class58.field994[var46][class330.method2050(3, var47)];
                            }
                        } else if (!var15[arg10 + 2 & 0x3]) {
                            arg6[2] = class14.field194[var46][class330.method2050(var47, 3)];
                        }
                    }
                }
            }
            if (arg0 > 0) {
                int var52 = arg4[arg0 - 1][arg5] & 0xFF;
                if (var52 > 0) {
                    class448 var53 = this.field4300.method1461(arg9 ^ 0x14, var52 - 1);
                    if (var53.field6895 != -1) {
                        byte var54 = arg3[arg0 - 1][arg5];
                        byte var55 = arg2[arg0 - 1][arg5];
                        if (var53.field6891) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class149.method969(arg12, arg9 ^ 0x10, var53);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class319.field4803[var54][var57] && class213.field3309[var56] <= var53.field6901) {
                                    class69.field1214[var56] = var53.field6895;
                                    class412.field5970[var56] = var58;
                                    class386.field5595[var56] = arg12.method1893() ? var53.field6899 : var53.field6906;
                                    class475.field7253[var56] = var53.field6890;
                                    if (class213.field3309[var56] == var53.field6901) {
                                        class306.field4642[var56] = class318.method1973(class306.field4642[var56], 8);
                                    } else {
                                        class306.field4642[var56] = 8;
                                    }
                                    class213.field3309[var56] = var53.field6901;
                                }
                                var56++;
                                var57--;
                            }
                            if (!var15[arg10 + 3 & 0x3]) {
                                arg6[3] = class58.field994[var54][class330.method2050(3, var55 + 1)];
                            }
                        } else if (!var15[arg10 + 3 & 0x3]) {
                            arg6[3] = class14.field194[var54][class330.method2050(3, var55 + 1)];
                        }
                    }
                }
            }
            if ((arg11 - 1) > arg0) {
                int var60 = arg4[arg0 + 1][arg5] & 0xFF;
                if (var60 > 0) {
                    class448 var61 = this.field4300.method1461(arg9 ^ 0x14, var60 - 1);
                    if (var61.field6895 != -1) {
                        byte var62 = arg3[arg0 + 1][arg5];
                        byte var63 = arg2[arg0 + 1][arg5];
                        if (var61.field6891) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class149.method969(arg12, 0, var61);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class319.field4803[var62][var65] && var61.field6901 >= class213.field3309[var64]) {
                                    class69.field1214[var64] = var61.field6895;
                                    class412.field5970[var64] = var66;
                                    class386.field5595[var64] = arg12.method1893() ? var61.field6899 : var61.field6906;
                                    class475.field7253[var64] = var61.field6890;
                                    if (class213.field3309[var64] == var61.field6901) {
                                        class306.field4642[var64] = class318.method1973(class306.field4642[var64], 4);
                                    } else {
                                        class306.field4642[var64] = 4;
                                    }
                                    class213.field3309[var64] = var61.field6901;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg10 + 1 & 0x3]) {
                                arg6[1] = class58.field994[var62][class330.method2050(var63 + 3, 3)];
                            }
                        } else if (!var15[arg10 + 1 & 0x3]) {
                            arg6[1] = class14.field194[var62][class330.method2050(3, var63 + 3)];
                        }
                    }
                }
            }
        }
        field4312++;
        if (arg9 != 16 || arg8 == null) {
            return;
        }
        int var68 = class149.method969(arg12, 0, arg8);
        if (!arg8.field6891) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg10 * 2) & 0x7;
            if (class319.field4803[arg1][var69] && arg8.field6901 >= class213.field3309[var70]) {
                class69.field1214[var70] = arg8.field6895;
                class412.field5970[var70] = var68;
                class386.field5595[var70] = arg12.method1893() ? arg8.field6899 : arg8.field6906;
                class475.field7253[var70] = arg8.field6890;
                if (class213.field3309[var70] == arg8.field6901) {
                    class306.field4642[var70] = class318.method1973(class306.field4642[var70], 2);
                } else {
                    class306.field4642[var70] = 2;
                }
                class213.field3309[var70] = arg8.field6901;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lha;II[Lea;III)V", line = 1624)
    public final void method1729(class40 arg0, int arg1, int arg2, class367[] arg3, int arg4, int arg5, int arg6) {
        field4285++;
        if (!this.field4301) {
            for (int var8 = 0; var8 < 4; var8++) {
                class367 var9 = arg3[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && this.field4291 > var12 && var13 >= 0 && this.field4293 > var13) {
                            var9.method2227(var12, var13, -2097153);
                        }
                    }
                }
            }
        }
        int var14 = arg4 + arg1;
        int var15 = arg2 + arg6;
        if (arg5 != 7) {
            return;
        }
        for (int var16 = 0; var16 < this.field4299; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1734(0, false, var14 + var17, arg0, var16, 0, arg2 + var18, 0, -9621, var15 + var18, arg1 + var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)V", line = 1703)
    public static final void method1730(byte arg0, int arg1) {
        if (arg0 != -57) {
            field4292 = 94;
        }
        field4288++;
        class64 var2 = class230.method1387(arg1, (byte) 40, 3);
        var2.method446(-20033);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lfo;Lfo;Lqq;B)V", line = 1725)
    public final void method1731(class343 arg0, class343 arg1, class318 arg2, byte arg3) {
        field4295++;
        int[][] var5 = new int[this.field4291][this.field4293];
        if (class241.field3634 == null || class241.field3634.length != this.field4293) {
            class447.field6877 = new int[this.field4293];
            class96.field1739 = new int[this.field4293];
            class241.field3634 = new int[this.field4293];
            class429.field6298 = new int[this.field4293];
            class314.field4742 = new int[this.field4293];
        }
        for (int var6 = 0; var6 < this.field4299; var6++) {
            for (int var9 = 0; var9 < this.field4293; var9++) {
                class241.field3634[var9] = 0;
                class314.field4742[var9] = 0;
                class429.field6298[var9] = 0;
                class96.field1739[var9] = 0;
                class447.field6877[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field4291; var10++) {
                for (int var11 = 0; var11 < this.field4293; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (this.field4291 > var20) {
                        int var21 = this.field4289[var6][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class147 var22 = this.field4310.method1427(false, var21 - 1);
                            class241.field3634[var11] += var22.field2373;
                            class314.field4742[var11] += var22.field2386;
                            class429.field6298[var11] += var22.field2385;
                            class96.field1739[var11] += var22.field2380;
                            var10002 = class447.field6877[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field4289[var6][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class147 var25 = this.field4310.method1427(false, var24 - 1);
                            class241.field3634[var11] -= var25.field2373;
                            class314.field4742[var11] -= var25.field2386;
                            class429.field6298[var11] -= var25.field2385;
                            class96.field1739[var11] -= var25.field2380;
                            var10002 = class447.field6877[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field4293; var17++) {
                        int var18 = var17 + 5;
                        if (var18 < this.field4293) {
                            var13 += class314.field4742[var18];
                            var14 += class429.field6298[var18];
                            var16 += class447.field6877[var18];
                            var15 += class96.field1739[var18];
                            var12 += class241.field3634[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var12 -= class241.field3634[var19];
                            var14 -= class429.field6298[var19];
                            var16 -= class447.field6877[var19];
                            var15 -= class96.field1739[var19];
                            var13 -= class314.field4742[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var5[var10][var17] = class500.method3006(1164698437, var14 / var16, var12 * 256 / var15, var13 / var16);
                        }
                    }
                }
            }
            if (class275.field4168) {
                this.method1724(class99.field1801[var6], var5, -89, var6 == 0 ? arg0 : null, var6 == 0 ? arg1 : null, var6, arg2);
            } else {
                this.method1733(var6 == 0 ? arg1 : null, 4, arg2, class99.field1801[var6], var5, var6 == 0 ? arg0 : null, var6);
            }
            this.field4289[var6] = null;
            this.field4307[var6] = null;
            this.field4315[var6] = null;
            this.field4284[var6] = null;
        }
        int var7 = 121 % ((arg3 - 84) / 42);
        if (!this.field4301) {
            if (class257.field3916 != 0) {
                class111.method795();
            }
            if (class383.field5571) {
                class362.method2201();
            }
        }
        for (int var8 = 0; var8 < this.field4299; var8++) {
            class99.field1801[var8].method308();
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z", line = 1902)
    public static final boolean method1732(int arg0, int arg1, int arg2) {
        field4313++;
        return arg1 != 0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lfo;ILqq;Lfo;[[ILfo;I)V", line = 1914)
    private final void method1733(class343 arg0, int arg1, class318 arg2, class343 arg3, int[][] arg4, class343 arg5, int arg6) {
        if (arg1 != 4) {
            this.field4284 = null;
        }
        field4314++;
        for (int var8 = 0; var8 < this.field4291; var8++) {
            for (int var9 = 0; var9 < this.field4293; var9++) {
                if (class511.field7752 == -1 || class29.method153(var8, var9, arg6, (byte) -122, class511.field7752)) {
                    byte var10 = this.field4315[arg6][var8][var9];
                    byte var11 = this.field4284[arg6][var8][var9];
                    int var12 = this.field4307[arg6][var8][var9] & 0xFF;
                    int var13 = this.field4289[arg6][var8][var9] & 0xFF;
                    class448 var14 = var12 == 0 ? null : this.field4300.method1461(4, var12 - 1);
                    class147 var15 = var13 == 0 ? null : this.field4310.method1427(false, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class237.field3585[var10];
                        var16 = var15 == null ? 0 : class76.field1371[var10];
                    } else if (var14 != null) {
                        var17 = class237.field3585[var10];
                    } else if (var15 != null) {
                        var16 = class237.field3585[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field6895 == -1 && var14.field6908 == -1 && var14.field6899 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg2.method1893() ? var14.field6899 : var14.field6906;
                            if (class27.field350) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field6890;
                                if (var14.field6895 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field6895;
                                }
                                if (var14.field6908 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field6908;
                                }
                                var19++;
                            }
                            if (!this.field4301 && arg6 == 0) {
                                class75.method559(var8, var9, var14.field6893, var14.field6892 * 8, var14.field6909);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field2374;
                            if (class27.field350) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field2377;
                                var20[var19] = arg4[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field4298.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field4298[var36];
                            int var46 = this.field4311[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class319.field4803[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method314(var49, var50) - arg3.method314(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class319.field4803[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg3.method314(var51, var52) - arg0.method314(var51, var52);
                                } else if (arg5 != null && !class317.field4776[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method314(var53, var54) - arg3.method314(var53, var54);
                                }
                            }
                        }
                        int var37 = arg3.method318(var8, var9);
                        int var38 = arg3.method318(var8 + 1, var9);
                        int var39 = arg3.method318(var8 + 1, var9 + 1);
                        int var40 = arg3.method318(var8, var9 + 1);
                        if (arg6 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field6910) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field4308[arg6][var8][var9] = (byte) class318.method1973(this.field4308[arg6][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field4301) {
                            var42 = class399.method2368(var8, var9);
                            var43 = class173.method1084(var8, var9);
                            var44 = class347.method2120(var8, var9);
                        }
                        arg3.method310(var8, var9, var32, var34, var33, var35, class224.field3454[var10], class231.field3514[var10], class388.field5616[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class162.method1036(arg6, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZILha;IIIIIII)V", line = 2237)
    private final void method1734(int arg0, boolean arg1, int arg2, class40 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg7 == 1) {
            arg0 = 1;
        } else if (arg7 == 2) {
            arg0 = 1;
            arg5 = 1;
        } else if (arg7 == 3) {
            arg5 = 1;
        }
        if (arg8 != -9621) {
            return;
        }
        field4287++;
        if (arg10 < 0 || this.field4291 <= arg10 || arg6 < 0 || arg6 >= this.field4293) {
            while (true) {
                int var14 = arg3.method257((byte) 123);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg3.method257((byte) 123);
                    return;
                }
                if (var14 <= 49) {
                    arg3.method257((byte) 122);
                }
            }
        }
        if (!this.field4301 && !arg1) {
            class146.field2369[arg4][arg10][arg6] = 0;
        }
        while (true) {
            int var12 = arg3.method257((byte) 65);
            if (var12 == 0) {
                if (this.field4301) {
                    this.field4286[0][arg5 + arg10][arg0 + arg6] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field4286[0][arg10 + arg5][arg0 + arg6] = -class45.method319(arg9 + 556238, true, arg2 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field4286[arg4][arg5 + arg10][arg6 + arg0] = this.field4286[arg4 - 1][arg5 + arg10][arg0 + arg6] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg3.method257((byte) 66);
                if (this.field4301) {
                    this.field4286[0][arg5 + arg10][arg0 + arg6] = var13 * 8 << 0;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg4 != 0) {
                    this.field4286[arg4][arg5 + arg10][arg6 + arg0] = this.field4286[arg4 - 1][arg10 + arg5][arg6 + arg0] - (var13 * 8 << 0);
                    return;
                }
                this.field4286[0][arg10 + arg5][arg0 + arg6] = -var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg1) {
                    arg3.method257((byte) 40);
                } else {
                    this.field4307[arg4][arg10][arg6] = arg3.method262(class103.method764(arg8, 9621));
                    this.field4315[arg4][arg10][arg6] = (byte) ((var12 - 2) / 4);
                    this.field4284[arg4][arg10][arg6] = (byte) class330.method2050(arg7 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field4301 && !arg1) {
                    class146.field2369[arg4][arg10][arg6] = (byte) (var12 - 49);
                }
            } else if (!arg1) {
                this.field4289[arg4][arg10][arg6] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[[IB)V", line = 2373)
    public final void method1735(int arg0, int[][] arg1, byte arg2) {
        field4302++;
        int[][] var4 = this.field4286[arg0];
        if (arg2 > -99) {
            this.field4291 = 9;
        }
        for (int var5 = 0; var5 < this.field4291 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field4293 + 1); var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 2400)
    public static void method1736(byte arg0) {
        field4297 = null;
        if (arg0 > 50) {
            field4294 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)V", line = 2411)
    public final void method1737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = -112 / ((83 - arg2) / 42);
        field4306++;
        for (int var8 = arg5; var8 < arg5 + arg1; var8++) {
            for (int var11 = arg0; var11 < (arg0 + arg4); var11++) {
                if (var11 >= 0 && this.field4291 > var11 && var8 >= 0 && var8 < this.field4293) {
                    this.field4286[arg3][var11][var8] = arg3 <= 0 ? 0 : this.field4286[arg3 - 1][var11][var8] - 240;
                }
            }
        }
        if (arg0 > 0 && arg0 < this.field4291) {
            for (int var9 = arg5 + 1; var9 < arg1 + arg5; var9++) {
                if (var9 >= 0 && var9 < this.field4293) {
                    this.field4286[arg3][arg0][var9] = this.field4286[arg3][arg0 - 1][var9];
                }
            }
        }
        if (arg5 > 0 && this.field4293 > arg5) {
            for (int var10 = arg0 + 1; var10 < arg0 + arg4; var10++) {
                if (var10 >= 0 && var10 < this.field4291) {
                    this.field4286[arg3][var10][arg5] = this.field4286[arg3][var10][arg5 - 1];
                }
            }
        }
        if (arg0 < 0 || arg5 < 0 || arg0 >= this.field4291 || arg5 >= this.field4293) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 <= 0 || this.field4286[arg3][arg0 - 1][arg5] == 0) {
                if (arg5 > 0 && this.field4286[arg3][arg0][arg5 - 1] != 0) {
                    this.field4286[arg3][arg0][arg5] = this.field4286[arg3][arg0][arg5 - 1];
                    return;
                }
                if (arg0 > 0 && arg5 > 0 && this.field4286[arg3][arg0 - 1][arg5 - 1] != 0) {
                    this.field4286[arg3][arg0][arg5] = this.field4286[arg3][arg0 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            this.field4286[arg3][arg0][arg5] = this.field4286[arg3][arg0 - 1][arg5];
        } else if (arg0 <= 0 || this.field4286[arg3][arg0 - 1][arg5] == this.field4286[arg3 - 1][arg0 - 1][arg5]) {
            if (arg5 > 0 && this.field4286[arg3 - 1][arg0][arg5 - 1] != this.field4286[arg3][arg0][arg5 - 1]) {
                this.field4286[arg3][arg0][arg5] = this.field4286[arg3][arg0][arg5 - 1];
                return;
            }
            if (arg0 > 0 && arg5 > 0 && this.field4286[arg3 - 1][arg0 - 1][arg5 - 1] != this.field4286[arg3][arg0 - 1][arg5 - 1]) {
                this.field4286[arg3][arg0][arg5] = this.field4286[arg3][arg0 - 1][arg5 - 1];
                return;
            }
        } else {
            this.field4286[arg3][arg0][arg5] = this.field4286[arg3][arg0 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 2510)
    public static final void method1738(int arg0) {
        if (arg0 > -30) {
            method1732(28, 123, -80);
        }
        field4309++;
        class194.field3056.method660((byte) 97);
        class107.field1871 = null;
        class322.field4842 = 1;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IIIZLku;Lmn;)V", line = 2535)
    public class284(int arg0, int arg1, int arg2, boolean arg3, class244 arg4, class237 arg5) {
        this.field4300 = arg4;
        this.field4291 = arg1;
        this.field4299 = arg0;
        this.field4293 = arg2;
        this.field4310 = arg5;
        this.field4301 = arg3;
        this.field4315 = new byte[this.field4299][this.field4291][this.field4293];
        this.field4289 = new byte[this.field4299][this.field4291][this.field4293];
        this.field4284 = new byte[this.field4299][this.field4291][this.field4293];
        this.field4308 = new byte[this.field4299][this.field4291 + 1][this.field4293 + 1];
        this.field4307 = new byte[this.field4299][this.field4291][this.field4293];
        this.field4286 = new int[this.field4299][this.field4291 + 1][this.field4293 + 1];
    }
}
