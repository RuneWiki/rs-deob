import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class382 {

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "[I")
    private int[] field5495 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "[I")
    private int[] field5492 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    public int field5490;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "Z")
    public boolean field5485;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lpg;")
    private class289 field5473;

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "Lbj;")
    private class547 field5483;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "[[[B")
    private byte[][][] field5488;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "[[[B")
    private byte[][][] field5479;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "[[[B")
    private byte[][][] field5468;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "[[[I")
    public int[][][] field5489;

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "[[[B")
    private byte[][][] field5493;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "[[[B")
    public byte[][][] field5472;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "Ldi;")
    public static class5 field5486;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "[[[B")
    public byte[][][] field5471;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method2389(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5484++;
        if (arg1 != -26215) {
            this.field5493 = null;
        }
        for (int var6 = 0; var6 < this.field5487; var6++) {
            this.method2401(arg4, arg2, arg0, arg3, var6, arg1 + 47728);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ldc;IIB[Lnfa;IIIII)V", line = 21)
    public final void method2390(class63 arg0, int arg1, int arg2, byte arg3, class228[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5481++;
        int var11 = (arg1 & 0x7) * 8;
        if (arg3 > -103) {
            this.method2398(null, null, -73, null);
        }
        int var12 = (arg6 & 0x7) * 8;
        if (!this.field5485) {
            class228 var13 = arg4[arg9];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg5 + class627.method3531(var15 & 0x7, (byte) 19, arg2, var14 & 0x7);
                    int var17 = arg8 + class627.method3528(arg2, var14 & 0x7, (byte) 119, var15 & 0x7);
                    if (var16 > 0 && var16 < this.field5494 - 1 && var17 > 0 && var17 < this.field5490 - 1) {
                        var13.method1355(var17, var16, -2097153);
                    }
                }
            }
        }
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        int var19 = arg6 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg2 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field5487; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg7 == var22 && var11 <= var23 && var23 <= var11 + 8 && var24 >= var12 && var24 <= var12 + 8) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var12 + 8 == var24) {
                            if (arg2 == 0) {
                                var25 = var23 + arg5 - var11;
                                var26 = arg8 - (var12 - var24);
                            } else if (arg2 == 1) {
                                var26 = var11 + arg8 + 8 - var23;
                                var25 = arg5 + var24 - var12;
                            } else if (arg2 == 2) {
                                var26 = arg8 + var12 + 8 - var24;
                                var25 = arg5 + var11 + 8 - var23;
                            } else {
                                var26 = arg8 + var23 - var11;
                                var25 = var12 + arg5 + 8 - var24;
                            }
                            this.method2392(var18 + var23, var19 + var24, arg0, 0, var26, 0, 0, arg9, var25, true, 1);
                        } else {
                            var25 = class627.method3531(var24 & 0x7, (byte) 19, arg2, var23 & 0x7) + arg5;
                            var26 = arg8 + class627.method3528(arg2, var23 & 0x7, (byte) 124, var24 & 0x7);
                            this.method2392(var18 + var23, var19 - -var24, arg0, var21, var26, arg2, var20, arg9, var25, false, 1);
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
                                if (arg2 == 0) {
                                    var31 = arg5 + var29 - var11;
                                    var32 = var30 + arg8 - var12;
                                } else if (arg2 == 1) {
                                    var31 = var30 + arg5 - var12;
                                    var32 = arg8 + var11 + 8 - var29;
                                } else if (arg2 == 2) {
                                    var31 = var11 + arg5 + 8 - var29;
                                    var32 = arg8 + var12 + 8 - var30;
                                } else {
                                    var31 = arg5 + 8 - (-var12 + var30);
                                    var32 = arg8 + var29 - var11;
                                }
                                if (var31 >= 0 && this.field5494 > var31 && var32 >= 0 && this.field5490 > var32) {
                                    this.field5489[arg9][var31][var32] = this.field5489[arg9][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2392(0, 0, arg0, 0, -1, 0, 0, 0, -1, false, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ls;ILs;Ls;Lha;[[II)V", line = 223)
    private final void method2391(class341 arg0, int arg1, class341 arg2, class341 arg3, class548 arg4, int[][] arg5, int arg6) {
        field5469++;
        byte[][] var8 = this.field5468[arg1];
        byte[][] var9 = this.field5488[arg1];
        byte[][] var10 = this.field5493[arg1];
        byte[][] var11 = this.field5479[arg1];
        for (int var12 = arg6; var12 < this.field5494; var12++) {
            int var13 = var12 >= this.field5494 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field5490; var14++) {
                int var15 = var14 < this.field5490 - 1 ? var14 + 1 : var14;
                if (class327.field4520 == -1 || class718.method4028((byte) -112, var14, arg1, class327.field4520, var12)) {
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
                        class230 var26 = var21 == 0 ? null : this.field5483.method3240(var21 - 1, -125);
                        class634 var27 = var22 == 0 ? null : this.field5473.method1911(var22 - 1, -65);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class230 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3114 == -1 && var26.field3113 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3106;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field5494 && var14 < this.field5490) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var36--;
                                var32--;
                            }
                            int var37 = var32 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method2171(var14, var12, 31) - arg3.method2171(var15, var13, 31);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method2171(var14, var13, 31) - arg3.method2171(var15, var12, 31);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class563.field7810[var39] = -1;
                            class447.field6199[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3106 ? class762.field10628[var19] : class568.field7863[var19];
                        this.method2394(var27, var18, var19, var8, var11, arg4, 2, this.field5490, this.field5494, var20, var9, var14, var12, var26);
                        boolean var41 = var26 != null && var26.field3114 != var26.field3113;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class563.field7810[var42] >= 0 && class60.field867[var42] != class18.field189[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class340.method2167(var18[1], class665.method3759(class447.field6199[4], class447.field6199[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class340.method2167(var18[3], class665.method3759(class447.field6199[6], class447.field6199[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class340.method2167(var18[0], class665.method3759(class447.field6199[0], class447.field6199[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class340.method2167(var18[2], class665.method3759(class447.field6199[6], class447.field6199[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var48 = class594.field8075[var19];
                            var47 = class465.field6468[var19];
                            var49 = var26 == null ? 0 : class522.field7268[var19];
                            var45 = class33.field436[var19];
                            var46 = var27 == null ? 0 : class84.field1202[var19];
                        } else if (var17) {
                            var45 = class255.field3722[var19];
                            var46 = var27 == null ? 0 : class379.field5427[var19];
                            var47 = class505.field7030[var19];
                            var44 = class464.field6462[var19];
                            var48 = class708.field9878[var19];
                            var49 = var26 == null ? 0 : class22.field262[var19];
                        } else {
                            var44 = class630.field8468[var19];
                            var47 = class29.field354[var19];
                            var48 = class705.field9810[var19];
                            var46 = var27 == null ? 0 : class149.field2067[var19];
                            var49 = var26 == null ? 0 : class436.field6093[var19];
                            var45 = class525.field7294[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class462.method2830(arg1, var12, var14);
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
                            int[] var60 = arg2 == null ? null : new int[var53];
                            int[] var61 = arg2 == null && arg0 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field3117;
                                var63 = var26.field3125;
                                var62 = var26.field3114;
                                int var65 = class504.method3037(var26, -1, arg4);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = 1;
                                        class335.field4719[2] = var48[var51];
                                        class335.field4719[3] = 1;
                                        class335.field4719[4] = var47[var51];
                                        class335.field4719[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = 5;
                                        class335.field4719[2] = var48[var51];
                                        class335.field4719[3] = 5;
                                        class335.field4719[4] = var47[var51];
                                        class335.field4719[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = 3;
                                        class335.field4719[2] = var48[var51];
                                        class335.field4719[3] = 3;
                                        class335.field4719[4] = var47[var51];
                                        class335.field4719[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = 7;
                                        class335.field4719[2] = var48[var51];
                                        class335.field4719[3] = 7;
                                        class335.field4719[4] = var47[var51];
                                        class335.field4719[5] = var48[var51];
                                        var68 = 6;
                                    } else {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = var47[var51];
                                        var68 = 3;
                                        class335.field4719[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class335.field4719[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field5495[var70];
                                        int var73 = this.field5492[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = 512 - var72;
                                            var75 = var73;
                                        } else if (var20 == 2) {
                                            var75 = 512 - var72;
                                            var74 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var74 = var72;
                                            var75 = 512 - var73;
                                        } else {
                                            var74 = var73;
                                            var75 = var72;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class596.field8098[var19][var70]) {
                                            int var76 = (var12 << 9) + var75;
                                            int var77 = (var14 << 9) + var74;
                                            var60[var52] = arg2.method2172(var76, class134.method848(arg6, -1), var77) - arg3.method2172(var76, -1, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class596.field8098[var19][var70]) {
                                                int var78 = (var12 << 9) + var75;
                                                int var79 = (var14 << 9) + var74;
                                                var61[var52] = arg3.method2172(var78, class134.method848(arg6, -1), var79) - arg2.method2172(var78, arg6 - 1, var79);
                                            } else if (arg0 != null && !class594.field8073[var19][var70]) {
                                                int var80 = (var12 << 9) + var75;
                                                int var81 = (var14 << 9) + var74;
                                                var61[var52] = arg0.method2172(var80, -1, var81) - arg3.method2172(var80, class134.method848(arg6, -1), var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field3119 < class563.field7810[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class60.field867[var71];
                                            }
                                            var59[var52] = class61.field879[var71];
                                            var58[var52] = class344.field4897[var71];
                                            var57[var52] = class18.field189[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field3125;
                                            var59[var52] = var26.field3117;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field5485 && arg1 == 0) {
                                    class129.method810(var12, var14, var26.field3115, var26.field3126 * 8, var26.field3120);
                                }
                                if (var19 != 12 && var26.field3114 != -1 && var26.field3112) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class522.field7268[var19];
                            } else if (var17) {
                                var51 += class22.field262[var19];
                            } else {
                                var51 += class436.field6093[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class634 var82 = this.field5473.method1911(var22 - 1, arg6 ^ 0xFFFFFFA4);
                                class634 var83 = this.field5473.method1911(var23 - 1, arg6 ^ 0x7D);
                                class634 var84 = this.field5473.method1911(var24 - 1, 102);
                                class634 var85 = this.field5473.method1911(var25 - 1, 111);
                                for (int var86 = 0; var86 < var46; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = 1;
                                        class335.field4719[2] = var48[var51];
                                        class335.field4719[3] = 1;
                                        class335.field4719[4] = var47[var51];
                                        class335.field4719[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = 5;
                                        class335.field4719[2] = var48[var51];
                                        class335.field4719[3] = 5;
                                        class335.field4719[4] = var47[var51];
                                        class335.field4719[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = 3;
                                        class335.field4719[2] = var48[var51];
                                        class335.field4719[3] = 3;
                                        class335.field4719[4] = var47[var51];
                                        class335.field4719[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = 7;
                                        class335.field4719[2] = var48[var51];
                                        class335.field4719[3] = 7;
                                        class335.field4719[4] = var47[var51];
                                        var88 = 6;
                                        class335.field4719[5] = var48[var51];
                                    } else {
                                        class335.field4719[0] = var45[var51];
                                        class335.field4719[1] = var47[var51];
                                        var88 = 3;
                                        class335.field4719[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class335.field4719[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field5495[var90];
                                        int var93 = this.field5492[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 512 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 3) {
                                            var95 = 512 - var93;
                                            var94 = var92;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class596.field8098[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg2.method2172(var96, -1, var97) - arg3.method2172(var96, arg6 - 1, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class596.field8098[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg3.method2172(var98, -1, var99) - arg2.method2172(var98, -1, var99);
                                            } else if (arg0 != null && !class594.field8073[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg0.method2172(var100, class134.method848(arg6, -1), var101) - arg3.method2172(var100, class134.method848(arg6, -1), var101);
                                            }
                                        }
                                        if (var90 < 8 && class563.field7810[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class60.field867[var91];
                                            }
                                            var59[var52] = class61.field879[var91];
                                            var58[var52] = class344.field4897[var91];
                                            var57[var52] = class18.field189[var91];
                                        } else {
                                            if (var17 && class596.field8098[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg5[var12][var14];
                                                var58[var52] = var82.field8537;
                                                var59[var52] = var82.field8530;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg5[var12][var15];
                                                var58[var52] = var83.field8537;
                                                var59[var52] = var83.field8530;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg5[var13][var15];
                                                var58[var52] = var84.field8537;
                                                var59[var52] = var84.field8530;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg5[var13][var14];
                                                var58[var52] = var85.field8537;
                                                var59[var52] = var85.field8530;
                                            } else {
                                                if (var95 < 256) {
                                                    if (var94 < 256) {
                                                        var58[var52] = var82.field8537;
                                                        var59[var52] = var82.field8530;
                                                    } else {
                                                        var58[var52] = var83.field8537;
                                                        var59[var52] = var83.field8530;
                                                    }
                                                } else if (var94 >= 256) {
                                                    var58[var52] = var84.field8537;
                                                    var59[var52] = var84.field8530;
                                                } else {
                                                    var58[var52] = var85.field8537;
                                                    var59[var52] = var85.field8530;
                                                }
                                                int var102 = class96.method646(arg5[var12][var14], (byte) 10, var95 << 7 >> 9, arg5[var13][var14]);
                                                int var103 = class96.method646(arg5[var12][var15], (byte) 47, var95 << 7 >> 9, arg5[var13][var15]);
                                                var57[var52] = class96.method646(var102, (byte) 21, var94 << 7 >> 9, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field8533) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg3.method2171(var14, var12, 31);
                            int var105 = arg3.method2171(var14, var13, 31);
                            int var106 = arg3.method2171(var15, var13, 31);
                            int var107 = arg3.method2171(var15, var12, 31);
                            boolean var108 = class479.method2918(var14, true, var12);
                            if (var108 && arg1 > 1 || !var108 && arg1 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field8534) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field3116) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field5472[arg1][var12][var14] = (byte) class678.method3817(this.field5472[arg1][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field5485) {
                                var110 = class391.method2456(var12, var14);
                                var111 = class494.method2990(var12, var14);
                                var112 = class200.method1213(var12, var14);
                            }
                            arg3.method1040(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class462.method2830(arg1, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IILdc;IIIIIIZI)V", line = 1098)
    private final void method2392(int arg0, int arg1, class63 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg5 == 1) {
            arg3 = 1;
        } else if (arg5 == 2) {
            arg3 = 1;
            arg6 = 1;
        } else if (arg5 == 3) {
            arg6 = 1;
        }
        if (arg10 != 1) {
            return;
        }
        field5491++;
        if (arg8 < 0 || this.field5494 <= arg8 || arg4 < 0 || arg4 >= this.field5490) {
            while (true) {
                int var14 = arg2.method505((byte) -119);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg2.method505((byte) -119);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method505((byte) -119);
                }
            }
        }
        if (!this.field5485 && !arg9) {
            class692.field9623[arg7][arg8][arg4] = 0;
        }
        while (true) {
            int var12 = arg2.method505((byte) -119);
            if (var12 == 0) {
                if (this.field5485) {
                    this.field5489[0][arg6 + arg8][arg3 + arg4] = 0;
                    return;
                } else if (arg7 == 0) {
                    this.field5489[0][arg6 + arg8][arg4 + arg3] = -class46.method252(arg0 + 932731, 556238 - -arg1, class134.method848(arg10, 115)) * 8 << 2;
                    return;
                } else {
                    this.field5489[arg7][arg6 + arg8][arg3 + arg4] = this.field5489[arg7 - 1][arg6 + arg8][arg3 + arg4] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg2.method505((byte) -119);
                if (this.field5485) {
                    this.field5489[0][arg6 + arg8][arg3 + arg4] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg7 != 0) {
                    this.field5489[arg7][arg6 + arg8][arg4 + arg3] = this.field5489[arg7 - 1][arg8 + arg6][arg4 + arg3] - (var13 * 8 << 2);
                    return;
                }
                this.field5489[0][arg6 + arg8][arg4 + arg3] = -var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg9) {
                    arg2.method505((byte) -119);
                } else {
                    this.field5479[arg7][arg8][arg4] = arg2.method491(false);
                    this.field5468[arg7][arg8][arg4] = (byte) ((var12 - 2) / 4);
                    this.field5488[arg7][arg8][arg4] = (byte) class665.method3759(3, arg5 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field5485 && !arg9) {
                    class692.field9623[arg7][arg8][arg4] = (byte) (var12 - 49);
                }
            } else if (!arg9) {
                this.field5493[arg7][arg8][arg4] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V", line = 1226)
    public static final void method2393(byte arg0) {
        field5478++;
        for (class429 var1 = (class429) class228.field3055.method1644(-23698); var1 != null; var1 = (class429) class228.field3055.method1644(-23698)) {
            class55.method405(var1, -64);
        }
        if (arg0 > -77) {
            method2397(78);
        }
        int var2;
        int var3;
        if (class332.field4707.field4774.method1242(0) == 1) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class622.field8328;
            var3 = class622.field8328;
        }
        client.method2754();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method2739();
            client.method2742(var4);
            client.method2747(var4);
        }
        client.method2744();
        client.method2753();
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lrh;[ZI[[B[[BLha;IIII[[BIILbe;)V", line = 1269)
    private final void method2394(class634 arg0, boolean[] arg1, int arg2, byte[][] arg3, byte[][] arg4, class548 arg5, int arg6, int arg7, int arg8, int arg9, byte[][] arg10, int arg11, int arg12, class230 arg13) {
        field5476++;
        boolean[] var15 = arg13 != null && arg13.field3106 ? class762.field10628[arg2] : class568.field7863[arg2];
        if (arg6 != 2) {
            return;
        }
        if (arg11 > 0) {
            if (arg12 > 0) {
                int var16 = arg4[arg12 - 1][arg11 - 1] & 0xFF;
                if (var16 > 0) {
                    class230 var17 = this.field5483.method3240(var16 - 1, -121);
                    if (var17.field3114 != -1 && var17.field3106) {
                        byte var18 = arg3[arg12 - 1][arg11 - 1];
                        int var19 = arg10[arg12 - 1][arg11 - 1] * 2 + 4 & 0x7;
                        int var20 = class504.method3037(var17, -1, arg5);
                        if (class596.field8098[var18][var19]) {
                            class18.field189[0] = var17.field3114;
                            class60.field867[0] = var20;
                            class344.field4897[0] = var17.field3125;
                            class61.field879[0] = var17.field3117;
                            class563.field7810[0] = var17.field3119;
                            class447.field6199[0] = 256;
                        }
                    }
                }
            }
            if (arg8 - 1 > arg12) {
                int var21 = arg4[arg12 + 1][arg11 - 1] & 0xFF;
                if (var21 > 0) {
                    class230 var22 = this.field5483.method3240(var21 - 1, arg6 + -127);
                    if (var22.field3114 != -1 && var22.field3106) {
                        byte var23 = arg3[arg12 + 1][arg11 - 1];
                        int var24 = arg10[arg12 + 1][arg11 - 1] * 2 + 6 & 0x7;
                        int var25 = class504.method3037(var22, -1, arg5);
                        if (class596.field8098[var23][var24]) {
                            class18.field189[2] = var22.field3114;
                            class60.field867[2] = var25;
                            class344.field4897[2] = var22.field3125;
                            class61.field879[2] = var22.field3117;
                            class563.field7810[2] = var22.field3119;
                            class447.field6199[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg11 < arg7 - 1) {
            if (arg12 > 0) {
                int var26 = arg4[arg12 - 1][arg11 + 1] & 0xFF;
                if (var26 > 0) {
                    class230 var27 = this.field5483.method3240(var26 - 1, -106);
                    if (var27.field3114 != -1 && var27.field3106) {
                        byte var28 = arg3[arg12 - 1][arg11 + 1];
                        int var29 = arg10[arg12 - 1][arg11 + 1] * 2 + 2 & 0x7;
                        int var30 = class504.method3037(var27, arg6 - 3, arg5);
                        if (class596.field8098[var28][var29]) {
                            class18.field189[6] = var27.field3114;
                            class60.field867[6] = var30;
                            class344.field4897[6] = var27.field3125;
                            class61.field879[6] = var27.field3117;
                            class563.field7810[6] = var27.field3119;
                            class447.field6199[6] = 64;
                        }
                    }
                }
            }
            if ((arg8 - 1) > arg12) {
                int var31 = arg4[arg12 + 1][arg11 + 1] & 0xFF;
                if (var31 > 0) {
                    class230 var32 = this.field5483.method3240(var31 - 1, -112);
                    if (var32.field3114 != -1 && var32.field3106) {
                        byte var33 = arg3[arg12 + 1][arg11 + 1];
                        int var34 = arg10[arg12 + 1][arg11 + 1] * 2 & 0x7;
                        int var35 = class504.method3037(var32, -1, arg5);
                        if (class596.field8098[var33][var34]) {
                            class18.field189[4] = var32.field3114;
                            class60.field867[4] = var35;
                            class344.field4897[4] = var32.field3125;
                            class61.field879[4] = var32.field3117;
                            class563.field7810[4] = var32.field3119;
                            class447.field6199[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg11 > 0) {
            int var36 = arg4[arg12][arg11 - 1] & 0xFF;
            if (var36 > 0) {
                class230 var37 = this.field5483.method3240(var36 - 1, arg6 ^ 0xFFFFFF88);
                if (var37.field3114 != -1) {
                    byte var38 = arg3[arg12][arg11 - 1];
                    byte var39 = arg10[arg12][arg11 - 1];
                    if (var37.field3106) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class504.method3037(var37, -1, arg5);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class596.field8098[var38][var41] && var37.field3119 >= class563.field7810[var40]) {
                                class18.field189[var40] = var37.field3114;
                                class60.field867[var40] = var42;
                                class344.field4897[var40] = var37.field3125;
                                class61.field879[var40] = var37.field3117;
                                if (class563.field7810[var40] == var37.field3119) {
                                    class447.field6199[var40] = class678.method3817(class447.field6199[var40], 32);
                                } else {
                                    class447.field6199[var40] = 32;
                                }
                                class563.field7810[var40] = var37.field3119;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg9 & 0x3]) {
                            arg1[0] = class762.field10628[var38][class665.method3759(3, var39 + 2)];
                        }
                    } else if (!var15[-(-arg9) & 0x3]) {
                        arg1[0] = class568.field7863[var38][class665.method3759(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg7 - 1 > arg11) {
            int var44 = arg4[arg12][arg11 + 1] & 0xFF;
            if (var44 > 0) {
                class230 var45 = this.field5483.method3240(var44 - 1, -104);
                if (var45.field3114 != -1) {
                    byte var46 = arg3[arg12][arg11 + 1];
                    byte var47 = arg10[arg12][arg11 + 1];
                    if (var45.field3106) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class504.method3037(var45, -1, arg5);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class596.field8098[var46][var49] && var45.field3119 >= class563.field7810[var48]) {
                                class18.field189[var48] = var45.field3114;
                                class60.field867[var48] = var50;
                                class344.field4897[var48] = var45.field3125;
                                class61.field879[var48] = var45.field3117;
                                if (class563.field7810[var48] == var45.field3119) {
                                    class447.field6199[var48] = class678.method3817(class447.field6199[var48], 16);
                                } else {
                                    class447.field6199[var48] = 16;
                                }
                                class563.field7810[var48] = var45.field3119;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg9 + 2 & 0x3]) {
                            arg1[2] = class762.field10628[var46][class665.method3759(var47, 3)];
                        }
                    } else if (!var15[arg9 + 2 & 0x3]) {
                        arg1[2] = class568.field7863[var46][class665.method3759(3, var47)];
                    }
                }
            }
        }
        if (arg12 > 0) {
            int var52 = arg4[arg12 - 1][arg11] & 0xFF;
            if (var52 > 0) {
                class230 var53 = this.field5483.method3240(var52 - 1, -101);
                if (var53.field3114 != -1) {
                    byte var54 = arg3[arg12 - 1][arg11];
                    byte var55 = arg10[arg12 - 1][arg11];
                    if (var53.field3106) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class504.method3037(var53, -1, arg5);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class596.field8098[var54][var57] && class563.field7810[var56] <= var53.field3119) {
                                class18.field189[var56] = var53.field3114;
                                class60.field867[var56] = var58;
                                class344.field4897[var56] = var53.field3125;
                                class61.field879[var56] = var53.field3117;
                                if (class563.field7810[var56] == var53.field3119) {
                                    class447.field6199[var56] = class678.method3817(class447.field6199[var56], 8);
                                } else {
                                    class447.field6199[var56] = 8;
                                }
                                class563.field7810[var56] = var53.field3119;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg9 + 3 & 0x3]) {
                            arg1[3] = class762.field10628[var54][class665.method3759(var55 + 1, 3)];
                        }
                    } else if (!var15[arg9 + 3 & 0x3]) {
                        arg1[3] = class568.field7863[var54][class665.method3759(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg12 < arg8 - 1) {
            int var60 = arg4[arg12 + 1][arg11] & 0xFF;
            if (var60 > 0) {
                class230 var61 = this.field5483.method3240(var60 - 1, -89);
                if (var61.field3114 != -1) {
                    byte var62 = arg3[arg12 + 1][arg11];
                    byte var63 = arg10[arg12 + 1][arg11];
                    if (var61.field3106) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class504.method3037(var61, -1, arg5);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class596.field8098[var62][var65] && class563.field7810[var64] <= var61.field3119) {
                                class18.field189[var64] = var61.field3114;
                                class60.field867[var64] = var66;
                                class344.field4897[var64] = var61.field3125;
                                class61.field879[var64] = var61.field3117;
                                if (class563.field7810[var64] == var61.field3119) {
                                    class447.field6199[var64] = class678.method3817(class447.field6199[var64], 4);
                                } else {
                                    class447.field6199[var64] = 4;
                                }
                                class563.field7810[var64] = var61.field3119;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg9 + 1 & 0x3]) {
                            arg1[1] = class762.field10628[var62][class665.method3759(3, var63 + 3)];
                        }
                    } else if (!var15[arg9 + 1 & 0x3]) {
                        arg1[1] = class568.field7863[var62][class665.method3759(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg13 == null) {
            return;
        }
        int var68 = class504.method3037(arg13, -1, arg5);
        if (!arg13.field3106) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg9 * 2) & 0x7;
            if (class596.field8098[arg2][var69] && arg13.field3119 >= class563.field7810[var70]) {
                class18.field189[var70] = arg13.field3114;
                class60.field867[var70] = var68;
                class344.field4897[var70] = arg13.field3125;
                class61.field879[var70] = arg13.field3117;
                if (class563.field7810[var70] == arg13.field3119) {
                    class447.field6199[var70] = class678.method3817(class447.field6199[var70], 2);
                } else {
                    class447.field6199[var70] = 2;
                }
                class563.field7810[var70] = arg13.field3119;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ls;BLs;Lha;)V", line = 1738)
    public final void method2395(class341 arg0, byte arg1, class341 arg2, class548 arg3) {
        field5477++;
        if (arg1 != -96) {
            return;
        }
        if (class157.field2198 == null || class157.field2198.length != this.field5490) {
            class238.field3554 = new int[this.field5490];
            class157.field2198 = new int[this.field5490];
            class79.field1141 = new int[this.field5490];
            class545.field7567 = new int[this.field5490];
            class32.field432 = new int[this.field5490];
        }
        int[][] var5 = new int[this.field5494][this.field5490];
        for (int var6 = 0; var6 < this.field5487; var6++) {
            for (int var8 = 0; var8 < this.field5490; var8++) {
                class157.field2198[var8] = 0;
                class238.field3554[var8] = 0;
                class545.field7567[var8] = 0;
                class79.field1141[var8] = 0;
                class32.field432[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field5494; var9++) {
                for (int var10 = 0; var10 < this.field5490; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field5494) {
                        int var20 = this.field5493[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class634 var21 = this.field5473.method1911(var20 - 1, 118);
                            class157.field2198[var10] += var21.field8528;
                            class238.field3554[var10] += var21.field8535;
                            class545.field7567[var10] += var21.field8526;
                            class79.field1141[var10] += var21.field8536;
                            var10002 = class32.field432[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field5493[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class634 var24 = this.field5473.method1911(var23 - 1, -111);
                            class157.field2198[var10] -= var24.field8528;
                            class238.field3554[var10] -= var24.field8535;
                            class545.field7567[var10] -= var24.field8526;
                            class79.field1141[var10] -= var24.field8536;
                            var10002 = class32.field432[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field5490; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field5490) {
                            var14 += class79.field1141[var17];
                            var11 += class157.field2198[var17];
                            var12 += class238.field3554[var17];
                            var15 += class32.field432[var17];
                            var13 += class545.field7567[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class238.field3554[var18];
                            var11 -= class157.field2198[var18];
                            var13 -= class545.field7567[var18];
                            var15 -= class32.field432[var18];
                            var14 -= class79.field1141[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class258.method1742((byte) 73, var11 * 256 / var14, var12 / var15, var13 / var15);
                        }
                    }
                }
            }
            if (class297.field4234) {
                this.method2391(var6 == 0 ? arg0 : null, var6, var6 == 0 ? arg2 : null, class433.field6043[var6], arg3, var5, 0);
            } else {
                this.method2400(class433.field6043[var6], var5, var6 == 0 ? arg0 : null, var6, 71, var6 == 0 ? arg2 : null, arg3);
            }
            this.field5493[var6] = null;
            this.field5479[var6] = null;
            this.field5468[var6] = null;
            this.field5488[var6] = null;
        }
        if (!this.field5485) {
            if (class204.field2692 != 0) {
                class126.method788();
            }
            if (class677.field9397) {
                class543.method3212();
            }
        }
        for (int var7 = 0; var7 < this.field5487; var7++) {
            class433.field6043[var7].method1028();
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[[I)V", line = 1919)
    public final void method2396(int arg0, int arg1, int[][] arg2) {
        field5480++;
        int[][] var4 = this.field5489[arg0];
        if (arg1 != 1) {
            this.field5485 = true;
        }
        for (int var5 = 0; var5 < (this.field5494 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field5490 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 1947)
    public static void method2397(int arg0) {
        field5486 = null;
        if (arg0 != 1) {
            method2393((byte) 99);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([[[I[Lnfa;ILha;)V", line = 1958)
    public final void method2398(int[][][] arg0, class228[] arg1, int arg2, class548 arg3) {
        field5474++;
        if (arg2 != 512) {
            this.method2395(null, (byte) -74, null, null);
        }
        if (!this.field5485) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field5494; var6++) {
                    for (int var7 = 0; var7 < this.field5490; var7++) {
                        if ((class692.field9623[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class692.field9623[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1347(var7, (byte) -96, var6);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field5487; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field5485) {
                if (class159.field2225) {
                    var11 |= 0x8;
                }
                if (class677.field9397) {
                    var10 |= 0x2;
                }
                if (class204.field2692 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class293.field4213) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class677.field9397) {
                var11 |= 0x7;
            }
            if (!class312.field4336) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field5489[var9] : arg0[var9];
            class178.method1119(var9, arg3.method1542(this.field5494, this.field5490, this.field5489[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BIILdc;II[Lnfa;)V", line = 2062)
    public final void method2399(byte arg0, int arg1, int arg2, class63 arg3, int arg4, int arg5, class228[] arg6) {
        field5475++;
        if (!this.field5485) {
            for (int var8 = 0; var8 < 4; var8++) {
                class228 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && this.field5494 > var12 && var13 >= 0 && this.field5490 > var13) {
                            var9.method1355(var13, var12, -2097153);
                        }
                    }
                }
            }
        }
        int var14 = arg5 + arg1;
        int var15 = arg2 + arg4;
        int var16 = -105 % ((arg0 + 10) / 63);
        for (int var17 = 0; var17 < this.field5487; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method2392(var14 + var18, var15 + var19, arg3, 0, var19 + arg4, 0, 0, var17, arg1 + var18, false, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ls;[[ILs;IILs;Lha;)V", line = 2143)
    private final void method2400(class341 arg0, int[][] arg1, class341 arg2, int arg3, int arg4, class341 arg5, class548 arg6) {
        int var8 = 0;
        if (arg4 < 6) {
            this.method2394(null, null, -11, null, null, null, -86, 107, -95, -43, null, 78, 110, null);
        }
        while (var8 < this.field5494) {
            for (int var9 = 0; var9 < this.field5490; var9++) {
                if (class327.field4520 == -1 || class718.method4028((byte) 72, var9, arg3, class327.field4520, var8)) {
                    byte var10 = this.field5468[arg3][var8][var9];
                    byte var11 = this.field5488[arg3][var8][var9];
                    int var12 = this.field5479[arg3][var8][var9] & 0xFF;
                    int var13 = this.field5493[arg3][var8][var9] & 0xFF;
                    class230 var14 = var12 == 0 ? null : this.field5483.method3240(var12 - 1, -115);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class634 var15 = var13 == 0 ? null : this.field5473.method1911(var13 - 1, 124);
                    class230 var16 = var14;
                    if (var14 != null && var14.field3114 == -1 && var14.field3113 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class84.field1202[var10];
                        int var18 = class522.field7268[var10];
                        int var19 = (var14 == null ? 0 : var18) + (var15 == null ? 0 : var17);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field3125;
                        int var23 = var15 == null ? -1 : var15.field8537;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field3113 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class33.field436[var10][var21];
                                var25[var20] = class465.field6468[var10][var21];
                                var26[var20] = class594.field8075[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field3117;
                                var27[var20] = var14.field3114;
                                if (var30 != null) {
                                    var30[var20] = var14.field3113;
                                }
                                var20++;
                                var21++;
                            }
                            if (!this.field5485 && arg3 == 0) {
                                class129.method810(var8, var9, var14.field3115, var14.field3126 * 8, var14.field3120);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class33.field436[var10][var21];
                                var25[var20] = class465.field6468[var10][var21];
                                var26[var20] = class594.field8075[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field8530;
                                var27[var20] = arg1[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var20++;
                                var21++;
                            }
                        }
                        int var33 = this.field5495.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg5 == null ? null : new int[var33];
                        int[] var37 = arg5 == null && arg2 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field5495[var38];
                            int var49 = this.field5492[var38];
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
                            if (var36 != null && class596.field8098[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg5.method2172(var52, -1, var53) - arg0.method2172(var52, -1, var53);
                            }
                            if (var37 != null) {
                                if (arg5 != null && !class596.field8098[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg0.method2172(var54, -1, var55) - arg5.method2172(var54, -1, var55);
                                } else if (arg2 != null && !class594.field8073[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg2.method2172(var56, -1, var57) - arg0.method2172(var56, -1, var57);
                                }
                            }
                        }
                        int var39 = arg0.method2171(var9, var8, 31);
                        int var40 = arg0.method2171(var9, var8 + 1, 31);
                        int var41 = arg0.method2171(var9 + 1, var8 + 1, 31);
                        int var42 = arg0.method2171(var9 + 1, var8, 31);
                        boolean var43 = class479.method2918(var9, true, var8);
                        if (var43 && arg3 > 1 || !var43 && arg3 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field8534) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field3116) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field5472[arg3][var8][var9] = (byte) class678.method3817(this.field5472[arg3][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field5485) {
                            var45 = class391.method2456(var8, var9);
                            var46 = class494.method2990(var8, var9);
                            var47 = class200.method1213(var8, var9);
                        }
                        arg0.method1034(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class462.method2830(arg3, var8, var9);
                    }
                }
            }
            var8++;
        }
        field5470++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIIII)V", line = 2425)
    public final void method2401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg0; var7 < (arg0 + arg2); var7++) {
            for (int var10 = arg3; var10 < (arg1 + arg3); var10++) {
                if (var10 >= 0 && this.field5494 > var10 && var7 >= 0 && this.field5490 > var7) {
                    this.field5489[arg4][var10][var7] = arg4 > 0 ? this.field5489[arg4 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        field5482++;
        if (arg3 > 0 && this.field5494 > arg3) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg2; var8++) {
                if (var8 >= 0 && this.field5490 > var8) {
                    this.field5489[arg4][arg3][var8] = this.field5489[arg4][arg3 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < this.field5490) {
            for (int var9 = arg3 + 1; var9 < (arg1 + arg3); var9++) {
                if (var9 >= 0 && var9 < this.field5494) {
                    this.field5489[arg4][var9][arg0] = this.field5489[arg4][var9][arg0 - 1];
                }
            }
        }
        if (arg5 != 21513) {
            method2397(-103);
        }
        if (arg3 < 0 || arg0 < 0 || arg3 >= this.field5494 || arg0 >= this.field5490) {
            return;
        }
        if (arg4 != 0) {
            if (arg3 > 0 && this.field5489[arg4 - 1][arg3 - 1][arg0] != this.field5489[arg4][arg3 - 1][arg0]) {
                this.field5489[arg4][arg3][arg0] = this.field5489[arg4][arg3 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field5489[arg4 - 1][arg3][arg0 - 1] != this.field5489[arg4][arg3][arg0 - 1]) {
                this.field5489[arg4][arg3][arg0] = this.field5489[arg4][arg3][arg0 - 1];
                return;
            }
            if (arg3 > 0 && arg0 > 0 && this.field5489[arg4 - 1][arg3 - 1][arg0 - 1] != this.field5489[arg4][arg3 - 1][arg0 - 1]) {
                this.field5489[arg4][arg3][arg0] = this.field5489[arg4][arg3 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg3 > 0 && this.field5489[arg4][arg3 - 1][arg0] != 0) {
            this.field5489[arg4][arg3][arg0] = this.field5489[arg4][arg3 - 1][arg0];
            return;
        }
        if (arg0 > 0 && this.field5489[arg4][arg3][arg0 - 1] != 0) {
            this.field5489[arg4][arg3][arg0] = this.field5489[arg4][arg3][arg0 - 1];
            return;
        }
        if (arg3 > 0 && arg0 > 0 && this.field5489[arg4][arg3 - 1][arg0 - 1] != 0) {
            this.field5489[arg4][arg3][arg0] = this.field5489[arg4][arg3 - 1][arg0 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(IIIZLbj;Lpg;)V", line = 2534)
    public class382(int arg0, int arg1, int arg2, boolean arg3, class547 arg4, class289 arg5) {
        this.field5490 = arg2;
        this.field5485 = arg3;
        this.field5473 = arg5;
        this.field5494 = arg1;
        this.field5487 = arg0;
        this.field5483 = arg4;
        this.field5488 = new byte[this.field5487][this.field5494][this.field5490];
        this.field5479 = new byte[this.field5487][this.field5494][this.field5490];
        this.field5468 = new byte[this.field5487][this.field5494][this.field5490];
        this.field5489 = new int[this.field5487][this.field5494 + 1][this.field5490 + 1];
        this.field5493 = new byte[this.field5487][this.field5494][this.field5490];
        this.field5472 = new byte[this.field5487][this.field5494 + 1][this.field5490 + 1];
    }
}
