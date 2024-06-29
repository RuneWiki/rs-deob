import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class20 {

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lwg;")
    private class441 field332;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "Z")
    public boolean field352;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Li;")
    private class332 field339;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "[[[I")
    public int[][][] field348;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[[[B")
    private byte[][][] field326;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[[[B")
    public byte[][][] field331;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "[[[B")
    private byte[][][] field333;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "[[[B")
    private byte[][][] field340;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "[[[B")
    private byte[][][] field337;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "Lfn;")
    public static class52 field347 = new class52(13, -1);

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field353 = new String[100];

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "[I")
    public static int[] field356 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "Lcs;")
    public static class351 field351 = new class351(39, 3);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "[[[B")
    public byte[][][] field336;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIB)V")
    public final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = arg0;
        int var8 = 115 % ((12 - arg5) / 60);
        while (var7 < (arg0 + arg3)) {
            for (int var11 = arg1; var11 < (arg1 + arg4); var11++) {
                if (var11 >= 0 && var11 < this.field355 && var7 >= 0 && this.field334 > var7) {
                    this.field348[arg2][var11][var7] = arg2 <= 0 ? 0 : this.field348[arg2 - 1][var11][var7] - 240;
                }
            }
            var7++;
        }
        field342++;
        if (arg1 > 0 && arg1 < this.field355) {
            for (int var9 = arg0 + 1; var9 < (arg0 + arg3); var9++) {
                if (var9 >= 0 && this.field334 > var9) {
                    this.field348[arg2][arg1][var9] = this.field348[arg2][arg1 - 1][var9];
                }
            }
        }
        if (arg0 > 0 && this.field334 > arg0) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg4; var10++) {
                if (var10 >= 0 && var10 < this.field355) {
                    this.field348[arg2][var10][arg0] = this.field348[arg2][var10][arg0 - 1];
                }
            }
        }
        if (arg1 < 0 || arg0 < 0 || arg1 >= this.field355 || this.field334 <= arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 > 0 && this.field348[arg2][arg1 - 1][arg0] != 0) {
                this.field348[arg2][arg1][arg0] = this.field348[arg2][arg1 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field348[arg2][arg1][arg0 - 1] != 0) {
                this.field348[arg2][arg1][arg0] = this.field348[arg2][arg1][arg0 - 1];
                return;
            }
            if (arg1 > 0 && arg0 > 0 && this.field348[arg2][arg1 - 1][arg0 - 1] != 0) {
                this.field348[arg2][arg1][arg0] = this.field348[arg2][arg1 - 1][arg0 - 1];
                return;
            }
        } else if (arg1 <= 0 || this.field348[arg2 - 1][arg1 - 1][arg0] == this.field348[arg2][arg1 - 1][arg0]) {
            if (arg0 > 0 && this.field348[arg2][arg1][arg0 - 1] != this.field348[arg2 - 1][arg1][arg0 - 1]) {
                this.field348[arg2][arg1][arg0] = this.field348[arg2][arg1][arg0 - 1];
                return;
            }
            if (arg1 > 0 && arg0 > 0 && this.field348[arg2][arg1 - 1][arg0 - 1] != this.field348[arg2 - 1][arg1 - 1][arg0 - 1]) {
                this.field348[arg2][arg1][arg0] = this.field348[arg2][arg1 - 1][arg0 - 1];
                return;
            }
            return;
        } else {
            this.field348[arg2][arg1][arg0] = this.field348[arg2][arg1 - 1][arg0];
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBILlk;[Lvk;II)V")
    public final void method166(int arg0, byte arg1, int arg2, class425 arg3, class272[] arg4, int arg5, int arg6) {
        if (!this.field352) {
            for (int var8 = 0; var8 < 4; var8++) {
                class272 var9 = arg4[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg6 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && this.field355 > var12 && var13 >= 0 && var13 < this.field334) {
                            var9.method1702(var12, var13, 117);
                        }
                    }
                }
            }
        }
        field346++;
        int var14 = arg2 + arg6;
        int var15 = arg5 + arg0;
        for (int var16 = 0; var16 < this.field345; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method173(arg6 + var17, 0, arg3, false, var14 + var17, var18 - -arg0, var16, 0, -128, 0, var15 + var18);
                }
            }
        }
        if (arg1 < 58) {
            method167((class425) null, -125);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Llk;I)Lst;")
    public static final class299 method167(class425 arg0, int arg1) {
        if (arg1 != 227) {
            field350 = 55;
        }
        field329++;
        return new class299(arg0.method2514(arg1 + 9559), arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2498(arg1 ^ 0xE0), arg0.method2498(3), arg0.method2503(true));
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ldh;Ldh;IILkm;Ldh;[[I)V")
    private final void method168(class269 arg0, class269 arg1, int arg2, int arg3, class487 arg4, class269 arg5, int[][] arg6) {
        if (arg2 != -1) {
            this.method173(82, 30, (class425) null, false, 16, 105, -13, -9, 15, -41, 65);
        }
        field344++;
        byte[][] var8 = this.field340[arg3];
        byte[][] var9 = this.field337[arg3];
        byte[][] var10 = this.field326[arg3];
        byte[][] var11 = this.field333[arg3];
        for (int var12 = 0; var12 < this.field355; var12++) {
            int var13 = (this.field355 - 1) > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field334; var14++) {
                int var15 = var14 < this.field334 - 1 ? var14 + 1 : var14;
                if (class257.field3600 == -1 || class341.method2020(class257.field3600, var12, arg3, (byte) 112, var14)) {
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
                        class277 var26 = var21 == 0 ? null : this.field332.method2556(101, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class228 var27 = var22 == 0 ? null : this.field339.method1979(var22 - 1, arg2 + 18927);
                        class277 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3826 == -1 && var26.field3836 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3828;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field355 && var14 < this.field334) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var34--;
                                var35--;
                            }
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var32--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var32++;
                                var36++;
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
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg1.method710(var12, var14) - arg1.method710(var13, var15);
                                var38 = arg1.method710(var13, var14) - arg1.method710(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class222.field3132[var39] = -1;
                            class305.field4177[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3828 ? class475.field6717[var19] : class441.field6057[var19];
                        this.method179(arg2 - 8720, var9, var26, var27, var12, var11, var8, arg4, var18, this.field355, var19, var20, var14, this.field334);
                        boolean var41 = var26 != null && var26.field3836 != var26.field3826;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class222.field3132[var42] >= 0 && class66.field980[var42] != class3.field35[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class167.method1023(var18[1], class347.method2074(class305.field4177[2], class305.field4177[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class167.method1023(var18[3], class347.method2074(class305.field4177[6], class305.field4177[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class167.method1023(var18[0], class347.method2074(class305.field4177[2], class305.field4177[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class167.method1023(var18[2], class347.method2074(class305.field4177[4], class305.field4177[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var46 = class46.field737[var19];
                            var45 = var26 == null ? 0 : class386.field5441[var19];
                            var49 = class145.field2023[var19];
                            var48 = var27 == null ? 0 : class283.field3891[var19];
                            var47 = class436.field5987[var19];
                        } else if (var17) {
                            var45 = var26 == null ? 0 : class299.field4115[var19];
                            var46 = class48.field785[var19];
                            var47 = class306.field4189[var19];
                            var48 = var27 == null ? 0 : class236.field3334[var19];
                            var44 = class444.field6136[var19];
                            var49 = class118.field1653[var19];
                        } else {
                            var48 = var27 == null ? 0 : class195.field2768[var19];
                            var47 = class438.field6013[var19];
                            var45 = var26 == null ? 0 : class42.field724[var19];
                            var44 = class272.field3765[var19];
                            var49 = class249.field3506[var19];
                            var46 = class155.field2239[var19];
                        }
                        int var50 = var45 + var48;
                        if (var50 <= 0) {
                            class41.method337(arg3, var12, var14);
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
                            int[] var60 = arg5 == null ? null : new int[var53];
                            int[] var61 = arg5 == null && arg0 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3826;
                                var63 = arg4.method1092() ? var26.field3831 : var26.field3833;
                                var64 = var26.field3823;
                                int var65 = class389.method2314(var26, (byte) -40, arg4);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = 1;
                                        class254.field3557[2] = var47[var51];
                                        class254.field3557[3] = 1;
                                        class254.field3557[4] = var46[var51];
                                        var98 = 6;
                                        class254.field3557[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = 5;
                                        class254.field3557[2] = var47[var51];
                                        class254.field3557[3] = 5;
                                        class254.field3557[4] = var46[var51];
                                        var98 = 6;
                                        class254.field3557[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = 3;
                                        class254.field3557[2] = var47[var51];
                                        class254.field3557[3] = 3;
                                        class254.field3557[4] = var46[var51];
                                        var98 = 6;
                                        class254.field3557[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = 7;
                                        class254.field3557[2] = var47[var51];
                                        class254.field3557[3] = 7;
                                        class254.field3557[4] = var46[var51];
                                        class254.field3557[5] = var47[var51];
                                        var98 = 6;
                                    } else {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = var46[var51];
                                        class254.field3557[2] = var47[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class254.field3557[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = class353.field4926[var100];
                                        int var103 = class180.field2616[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var103;
                                            var104 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 128 - var103;
                                        } else {
                                            var105 = var103;
                                            var104 = var102;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class484.field6826[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg5.method701(var106, var107) - arg1.method701(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class484.field6826[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg1.method701(var108, var109) - arg5.method701(var108, var109);
                                            } else if (arg0 != null && !class211.field2980[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg0.method701(var110, var111) - arg1.method701(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field3843 < class222.field3132[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class3.field35[var101];
                                            }
                                            var59[var52] = class236.field3332[var101];
                                            var58[var52] = class431.field5944[var101];
                                            var57[var52] = class66.field980[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg4.method1092() ? var26.field3831 : var26.field3833;
                                            var59[var52] = var26.field3823;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field352 && arg3 == 0) {
                                    class229.method1445(var12, var14, var26.field3825, var26.field3837 * 8, var26.field3824);
                                }
                                if (var19 != 12 && var26.field3826 != -1 && var26.field3842) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class386.field5441[var19];
                            } else if (var17) {
                                var51 += class299.field4115[var19];
                            } else {
                                var51 += class42.field724[var19];
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
                                class228 var67 = this.field339.method1979(var22 - 1, arg2 + 18927);
                                class228 var68 = this.field339.method1979(var23 - 1, 18926);
                                class228 var69 = this.field339.method1979(var24 - 1, 18926);
                                class228 var70 = this.field339.method1979(var25 - 1, arg2 ^ 0xFFFFB611);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = 1;
                                        class254.field3557[2] = var47[var51];
                                        class254.field3557[3] = 1;
                                        class254.field3557[4] = var46[var51];
                                        var73 = 6;
                                        class254.field3557[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = 5;
                                        class254.field3557[2] = var47[var51];
                                        class254.field3557[3] = 5;
                                        class254.field3557[4] = var46[var51];
                                        var73 = 6;
                                        class254.field3557[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = 3;
                                        class254.field3557[2] = var47[var51];
                                        class254.field3557[3] = 3;
                                        class254.field3557[4] = var46[var51];
                                        class254.field3557[5] = var47[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = 7;
                                        class254.field3557[2] = var47[var51];
                                        class254.field3557[3] = 7;
                                        class254.field3557[4] = var46[var51];
                                        class254.field3557[5] = var47[var51];
                                        var73 = 6;
                                    } else {
                                        class254.field3557[0] = var49[var51];
                                        class254.field3557[1] = var46[var51];
                                        class254.field3557[2] = var47[var51];
                                        var73 = 3;
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class254.field3557[var74];
                                        int var76 = var75 - var20 * 2 & 0x7;
                                        int var77 = class353.field4926[var75];
                                        int var78 = class180.field2616[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var80 = 128 - var77;
                                            var79 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var80 = 128 - var78;
                                            var79 = var77;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class484.field6826[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg5.method701(var81, var82) - arg1.method701(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class484.field6826[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg1.method701(var83, var84) - arg5.method701(var83, var84);
                                            } else if (arg0 != null && !class211.field2980[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg0.method701(var85, var86) - arg1.method701(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class222.field3132[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class3.field35[var76];
                                            }
                                            var59[var52] = class236.field3332[var76];
                                            var58[var52] = class431.field5944[var76];
                                            var57[var52] = class66.field980[var76];
                                        } else {
                                            if (var17 && class484.field6826[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var67.field3224;
                                                var59[var52] = var67.field3222;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var68.field3224;
                                                var59[var52] = var68.field3222;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var69.field3224;
                                                var59[var52] = var69.field3222;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var70.field3224;
                                                var59[var52] = var70.field3222;
                                            } else {
                                                if (var80 >= 64) {
                                                    if (var79 < 64) {
                                                        var58[var52] = var70.field3224;
                                                        var59[var52] = var70.field3222;
                                                    } else {
                                                        var58[var52] = var69.field3224;
                                                        var59[var52] = var69.field3222;
                                                    }
                                                } else if (var79 < 64) {
                                                    var58[var52] = var67.field3224;
                                                    var59[var52] = var67.field3222;
                                                } else {
                                                    var58[var52] = var68.field3224;
                                                    var59[var52] = var68.field3222;
                                                }
                                                int var87 = class13.method112(arg6[var12][var14], arg6[var13][var14], -57, var80 << 7 >> 7);
                                                int var88 = class13.method112(arg6[var12][var15], arg6[var13][var15], -122, var80 << 7 >> 7);
                                                var57[var52] = class13.method112(var87, var88, -97, var79 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field3225) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg1.method710(var12, var14);
                            int var90 = arg1.method710(var13, var14);
                            int var91 = arg1.method710(var13, var15);
                            int var92 = arg1.method710(var12, var15);
                            if (arg3 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3838) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field331[arg3][var12][var14] = (byte) class366.method2215(this.field331[arg3][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field352) {
                                var94 = class357.method2143(var12, var14);
                                var95 = class442.method2569(var12, var14);
                                var96 = class269.method1685(var12, var14);
                            }
                            arg1.method708(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class41.method337(arg3, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIBLlk;[Lvk;I)V")
    public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class425 arg7, class272[] arg8, int arg9) {
        field357++;
        int var11 = (arg3 & 0x7) * 8;
        if (!this.field352) {
            class272 var12 = arg8[arg2];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg9 + class259.method1605(var13 & 0x7, arg0, var14 & 0x7, false);
                    int var16 = arg5 + class239.method1498(arg0, var13 & 0x7, (byte) -114, var14 & 0x7);
                    if (var15 > 0 && (this.field355 - 1) > var15 && var16 > 0 && (this.field334 - 1) > var16) {
                        var12.method1702(var15, var16, 112);
                    }
                }
            }
        }
        int var17 = (arg4 & 0x7) * 8;
        int var18 = arg3 & 0x1FFFFFF8 << 3;
        int var19 = (arg4 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg0 == 1) {
            var21 = 1;
        } else if (arg0 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg0 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field345; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 != var22 || var11 > var23 || var11 + 8 < var23 || var24 < var17 || var24 > (var17 + 8)) {
                        this.method173(-1, 0, arg7, false, 0, -1, 0, 0, -125, 0, 0);
                    } else if (var11 + 8 == var23 || var17 + 8 == var24) {
                        int var31;
                        int var32;
                        if (arg0 == 0) {
                            var31 = arg9 + var23 - var11;
                            var32 = arg5 + var24 - var17;
                        } else if (arg0 == 1) {
                            var32 = var11 + arg5 + 8 - var23;
                            var31 = arg9 + var24 - var17;
                        } else if (arg0 == 2) {
                            var31 = var11 + arg9 + 8 - var23;
                            var32 = var17 - (var24 - arg5 - 8);
                        } else {
                            var31 = arg9 - (var24 - var17 - 8);
                            var32 = var23 + arg5 - var11;
                        }
                        this.method173(var31, 0, arg7, true, var18 + var23, var32, arg2, 0, -126, 0, var19 + var24);
                    } else {
                        int var25 = class259.method1605(var23 & 0x7, arg0, var24 & 0x7, false) + arg9;
                        int var26 = arg5 + class239.method1498(arg0, var23 & 0x7, (byte) -114, var24 & 0x7);
                        this.method173(var25, arg0, arg7, false, var18 + var23, var26, arg2, var21, -128, var20, var19 + var24);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg0 == 0) {
                                var30 = var28 + arg5 - var17;
                                var29 = var27 + arg9 - var11;
                            } else if (arg0 == 1) {
                                var30 = arg5 + (var11 - var27) + 8;
                                var29 = arg9 + var28 - var17;
                            } else if (arg0 == 2) {
                                var29 = var11 + arg9 + 8 - var27;
                                var30 = -var28 - (-var17 - arg5 - 8);
                            } else {
                                var29 = var17 + arg9 + 8 - var28;
                                var30 = -var11 - (-var27 - arg5);
                            }
                            if (var29 >= 0 && var29 < this.field355 && var30 >= 0 && this.field334 > var30) {
                                this.field348[arg2][var29][var30] = this.field348[arg2][var20 + var25][var26 + var21];
                            }
                        }
                    }
                }
            }
        }
        if (arg6 < 85) {
            this.field326 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLkm;[Lvk;[[[I)V")
    public final void method170(boolean arg0, class487 arg1, class272[] arg2, int[][][] arg3) {
        if (!this.field352) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field355; var6++) {
                    for (int var7 = 0; var7 < this.field334; var7++) {
                        if ((class205.field2947[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class205.field2947[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method1701(var7, var6, (byte) 93);
                            }
                        }
                    }
                }
            }
        }
        field343++;
        for (int var9 = 0; var9 < this.field345; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field352) {
                if (class232.field3276) {
                    var10 |= 0x2;
                }
                if (class121.field1697) {
                    var11 |= 0x8;
                }
                if (class131.field1848 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class221.field3117) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class232.field3276) {
                var11 |= 0x7;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field348[var9] : arg3[var9];
            class48.method373(var9, arg1.method1143(this.field355, this.field334, this.field348[var9], var12, 128, var10, var11));
        }
        if (arg0) {
            this.field340 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method171(int arg0) {
        field353 = null;
        if (arg0 >= 76) {
            field347 = null;
            field356 = null;
            field351 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([[III)V")
    public final void method172(int[][] arg0, int arg1, int arg2) {
        field327++;
        int[][] var4 = this.field348[arg2];
        for (int var5 = 0; var5 < this.field355 + 1; var5++) {
            for (int var6 = 0; var6 < this.field334 + 1; var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
        if (arg1 != 3) {
            this.method175(31, -24, (byte) -32, 124, 124);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILlk;ZIIIIIII)V")
    private final void method173(int arg0, int arg1, class425 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field330++;
        if (arg1 == 1) {
            arg7 = 1;
        } else if (arg1 == 2) {
            arg9 = 1;
            arg7 = 1;
        } else if (arg1 == 3) {
            arg9 = 1;
        }
        if (arg8 > -122) {
            field353 = null;
        }
        if (arg0 < 0 || this.field355 <= arg0 || arg5 < 0 || arg5 >= this.field334) {
            while (true) {
                int var14 = arg2.method2503(true);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg2.method2503(true);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method2503(true);
                }
            }
        }
        if (!this.field352 && !arg3) {
            class205.field2947[arg6][arg0][arg5] = 0;
        }
        while (true) {
            int var12 = arg2.method2503(true);
            if (var12 == 0) {
                if (this.field352) {
                    this.field348[0][arg0 + arg9][arg5 + arg7] = 0;
                    return;
                } else if (arg6 == 0) {
                    this.field348[0][arg0 + arg9][arg5 + arg7] = -method174(arg4 + 932731, arg10 + 556238, -70) * 8;
                    return;
                } else {
                    this.field348[arg6][arg0 + arg9][arg5 + arg7] = this.field348[arg6 - 1][arg0 + arg9][arg5 + arg7] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg2.method2503(true);
                if (!this.field352) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg6 != 0) {
                        this.field348[arg6][arg0 + arg9][arg5 + arg7] = this.field348[arg6 - 1][arg0 + arg9][arg5 + arg7] - (var13 * 8);
                        return;
                    }
                    this.field348[0][arg0 + arg9][arg5 + arg7] = -var13 * 8;
                    return;
                }
                this.field348[0][arg0 + arg9][arg5 + arg7] = var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg3) {
                    arg2.method2503(true);
                } else {
                    this.field333[arg6][arg0][arg5] = arg2.method2480(-8315);
                    this.field340[arg6][arg0][arg5] = (byte) ((var12 - 2) / 4);
                    this.field337[arg6][arg0][arg5] = (byte) class347.method2074(var12 + arg1 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field352 && !arg3) {
                    class205.field2947[arg6][arg0][arg5] = (byte) (var12 - 49);
                }
            } else if (!arg3) {
                this.field326[arg6][arg0][arg5] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)I")
    private static final int method174(int arg0, int arg1, int arg2) {
        field335++;
        if (arg2 >= -57) {
            return 58;
        }
        int var3 = class117.method739(arg0 + 45365, 4, -6108, arg1 + 91923) + ((class117.method739(arg0 + 10294, 2, -6108, arg1 + 37821) - 128 >> 1) - -(class117.method739(arg0, 1, -6108, arg1) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIBII)V")
    public final void method175(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field328++;
        for (int var6 = 0; var6 < this.field345; var6++) {
            this.method165(arg1, arg0, var6, arg4, arg3, (byte) -62);
        }
        if (arg2 > -106) {
            field353 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([[ILdh;ILdh;Ldh;ILkm;)V")
    private final void method176(int[][] arg0, class269 arg1, int arg2, class269 arg3, class269 arg4, int arg5, class487 arg6) {
        field338++;
        for (int var8 = 0; var8 < this.field355; var8++) {
            for (int var10 = 0; var10 < this.field334; var10++) {
                if (class257.field3600 == -1 || class341.method2020(class257.field3600, var8, arg2, (byte) 87, var10)) {
                    byte var11 = this.field340[arg2][var8][var10];
                    byte var12 = this.field337[arg2][var8][var10];
                    int var13 = this.field333[arg2][var8][var10] & 0xFF;
                    int var14 = this.field326[arg2][var8][var10] & 0xFF;
                    class277 var15 = var13 == 0 ? null : this.field332.method2556(105, var13 - 1);
                    class228 var16 = var14 == 0 ? null : this.field339.method1979(var14 - 1, 18926);
                    int var17 = 0;
                    int var18 = 0;
                    if (var11 != 0) {
                        var17 = var16 == null ? 0 : class283.field3891[var11];
                        var18 = var15 == null ? 0 : class386.field5441[var11];
                    } else if (var15 != null) {
                        var18 = class386.field5441[var11];
                    } else if (var16 != null) {
                        var17 = class386.field5441[var11];
                    }
                    int var19 = var17 + var18;
                    int var20 = 0;
                    if (var19 != 0) {
                        int[] var21 = new int[var19];
                        int[] var22 = new int[var19];
                        int[] var23 = new int[var19];
                        int[] var24 = new int[var19];
                        boolean var25 = false;
                        if (var15 == null || var15.field3826 == -1 && var15.field3836 == -1 && var15.field3831 == -1) {
                            for (int var28 = 0; var28 < var18; var28++) {
                                var21[var20] = -1;
                                var20++;
                            }
                        } else {
                            int var26 = arg6.method1092() ? var15.field3831 : var15.field3833;
                            if (class375.field5313) {
                                var26 = -1;
                            }
                            for (int var27 = 0; var27 < var18; var27++) {
                                var23[var20] = var26;
                                var24[var20] = var15.field3823;
                                if (var15.field3826 == -1) {
                                    var21[var20] = -1;
                                } else {
                                    var21[var20] = var15.field3826;
                                }
                                if (var15.field3836 == -1) {
                                    var22[var20] = -1;
                                } else {
                                    var22[var20] = var15.field3836;
                                    var25 = true;
                                }
                                var20++;
                            }
                            if (!this.field352 && arg2 == 0) {
                                class229.method1445(var8, var10, var15.field3825, var15.field3837 * 8, var15.field3824);
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var16 == null) {
                            for (int var31 = 0; var31 < var17; var31++) {
                                var21[var20] = -1;
                                var20++;
                            }
                        } else {
                            int var29 = var16.field3224;
                            if (class375.field5313) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var17; var30++) {
                                var23[var20] = var29;
                                var24[var20] = var16.field3222;
                                var21[var20] = arg0[var8][var10];
                                if (var22 != null) {
                                    var22[var20] = -1;
                                }
                                var20++;
                            }
                        }
                        int var32 = class353.field4926.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg4 == null ? null : new int[var32];
                        int[] var36 = arg4 == null && arg1 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var46 = class353.field4926[var37];
                            int var47 = class180.field2616[var37];
                            if (var12 == 0) {
                                var33[var37] = var46;
                                var34[var37] = var47;
                            } else if (var12 == 1) {
                                var33[var37] = var47;
                                var34[var37] = 128 - var46;
                            } else if (var12 == 2) {
                                var33[var37] = 128 - var46;
                                var34[var37] = 128 - var47;
                            } else if (var12 == 3) {
                                var33[var37] = 128 - var47;
                                var34[var37] = var46;
                            }
                            if (var35 != null && class484.field6826[var11][var37]) {
                                int var50 = (var8 << 7) + var46;
                                int var51 = (var10 << 7) + var46;
                                var35[var37] = arg4.method701(var50, var51) - arg3.method701(var50, var51);
                            }
                            if (var36 != null) {
                                if (arg4 != null && !class484.field6826[var11][var37]) {
                                    int var52 = (var8 << 7) + var46;
                                    int var53 = (var10 << 7) + var46;
                                    var36[var37] = arg3.method701(var52, var53) - arg4.method701(var52, var53);
                                } else if (arg1 != null && !class211.field2980[var11][var37]) {
                                    int var54 = (var8 << 7) + var46;
                                    int var55 = (var10 << 7) + var46;
                                    var36[var37] = arg1.method701(var54, var55) - arg3.method701(var54, var55);
                                }
                            }
                        }
                        int var38 = arg3.method710(var8, var10);
                        int var39 = arg3.method710(var8 + 1, var10);
                        int var40 = arg3.method710(var8 + 1, var10 + 1);
                        int var41 = arg3.method710(var8, var10 + 1);
                        if (arg2 > 0) {
                            boolean var42 = true;
                            if (var14 == 0 && var11 != 0) {
                                var42 = false;
                            }
                            if (var13 > 0 && var15 != null && !var15.field3838) {
                                var42 = false;
                            }
                            if (var42 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field331[arg2][var8][var10] = (byte) class366.method2215(this.field331[arg2][var8][var10], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field352) {
                            var43 = class357.method2143(var8, var10);
                            var44 = class442.method2569(var8, var10);
                            var45 = class269.method1685(var8, var10);
                        }
                        arg3.method715(var8, var10, var33, var35, var34, var36, class145.field2023[var11], class46.field737[var11], class436.field5987[var11], var21, var22, var23, var24, var43, var44, var45, false);
                        class41.method337(arg2, var8, var10);
                    }
                }
            }
        }
        int var9 = -115 / ((arg5 + 34) / 45);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static final void method177(int arg0) {
        class254.method1575(true, class338.field4636, (long) class356.field4972);
        field354++;
        if (class182.field2652 != -1) {
            class82.method565(-1, class182.field2652);
        }
        for (int var1 = 0; var1 < class417.field5736; var1++) {
            if (class127.field1809[var1]) {
                class258.field3607[var1] = true;
            }
            class180.field2613[var1] = class127.field1809[var1];
            class127.field1809[var1] = false;
        }
        if (arg0 != 5) {
            field350 = -90;
        }
        class287.field3913 = class356.field4972;
        if (class338.field4636.method1092()) {
            class485.field6852 = true;
        }
        if (class182.field2652 != -1) {
            class417.field5736 = 0;
            class33.method254(1);
        }
        class338.field4636.method1137();
        class478.method2812(true, class326.field4500);
        class42.field717 = 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lwk;IIB)J")
    public static final long method178(class278 arg0, int arg1, int arg2, byte arg3) {
        field341++;
        long var4 = 4194304L;
        if (arg3 >= -53) {
            method174(112, 33, -79);
        }
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class475 var10 = class304.field4160.method2075(arg0.method211(true), false);
        long var11 = (long) (arg2 | arg1 << 7 | arg0.method219(-17942) << 14 | arg0.method215(-11524) << 20 | 0x40000000);
        if (var10.field6681 == 0) {
            var11 |= var8;
        }
        if (var10.field6729 == 1) {
            var11 |= var4;
        }
        if (var10.field6650) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method211(true) << 32;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I[[BLhc;Loc;I[[B[[BLkm;[ZIIIII)V")
    private final void method179(int arg0, byte[][] arg1, class277 arg2, class228 arg3, int arg4, byte[][] arg5, byte[][] arg6, class487 arg7, boolean[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        if (arg0 != -8721) {
            this.method170(true, (class487) null, (class272[]) null, (int[][][]) null);
        }
        if (arg2 != null && arg3 != null || arg3 != null && arg10 == 12 || arg2 != null && arg10 == 0) {
            boolean[] var15 = arg2 != null && arg2.field3828 ? class475.field6717[arg10] : class441.field6057[arg10];
            if (arg12 > 0) {
                if (arg4 > 0) {
                    int var16 = arg5[arg4 - 1][arg12 - 1] & 0xFF;
                    if (var16 > 0) {
                        class277 var17 = this.field332.method2556(93, var16 - 1);
                        if (var17.field3826 != -1 && var17.field3828) {
                            byte var18 = arg6[arg4 - 1][arg12 - 1];
                            int var19 = arg1[arg4 - 1][arg12 - 1] * 2 + 4 & 0x7;
                            int var20 = class389.method2314(var17, (byte) -40, arg7);
                            if (class484.field6826[var18][var19]) {
                                class66.field980[0] = var17.field3826;
                                class3.field35[0] = var20;
                                class431.field5944[0] = arg7.method1092() ? var17.field3831 : var17.field3833;
                                class236.field3332[0] = var17.field3823;
                                class222.field3132[0] = var17.field3843;
                                class305.field4177[0] = 256;
                            }
                        }
                    }
                }
                if (arg4 < (arg9 - 1)) {
                    int var21 = arg5[arg4 + 1][arg12 - 1] & 0xFF;
                    if (var21 > 0) {
                        class277 var22 = this.field332.method2556(arg0 ^ 0xFFFFDD88, var21 - 1);
                        if (var22.field3826 != -1 && var22.field3828) {
                            byte var23 = arg6[arg4 + 1][arg12 - 1];
                            int var24 = (arg1[arg4 + 1][arg12 - 1] * 2) + 6 & 0x7;
                            int var25 = class389.method2314(var22, (byte) -40, arg7);
                            if (class484.field6826[var23][var24]) {
                                class66.field980[2] = var22.field3826;
                                class3.field35[2] = var25;
                                class431.field5944[2] = arg7.method1092() ? var22.field3831 : var22.field3833;
                                class236.field3332[2] = var22.field3823;
                                class222.field3132[2] = var22.field3843;
                                class305.field4177[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg13 - 1 > arg12) {
                if (arg4 > 0) {
                    int var26 = arg5[arg4 - 1][arg12 + 1] & 0xFF;
                    if (var26 > 0) {
                        class277 var27 = this.field332.method2556(114, var26 - 1);
                        if (var27.field3826 != -1 && var27.field3828) {
                            byte var28 = arg6[arg4 - 1][arg12 + 1];
                            int var29 = arg1[arg4 - 1][arg12 + 1] * 2 + 2 & 0x7;
                            int var30 = class389.method2314(var27, (byte) -40, arg7);
                            if (class484.field6826[var28][var29]) {
                                class66.field980[6] = var27.field3826;
                                class3.field35[6] = var30;
                                class431.field5944[6] = arg7.method1092() ? var27.field3831 : var27.field3833;
                                class236.field3332[6] = var27.field3823;
                                class222.field3132[6] = var27.field3843;
                                class305.field4177[6] = 64;
                            }
                        }
                    }
                }
                if ((arg9 - 1) > arg4) {
                    int var31 = arg5[arg4 + 1][arg12 + 1] & 0xFF;
                    if (var31 > 0) {
                        class277 var32 = this.field332.method2556(114, var31 - 1);
                        if (var32.field3826 != -1 && var32.field3828) {
                            byte var33 = arg6[arg4 + 1][arg12 + 1];
                            int var34 = arg1[arg4 + 1][arg12 + 1] * 2 & 0x7;
                            int var35 = class389.method2314(var32, (byte) -40, arg7);
                            if (class484.field6826[var33][var34]) {
                                class66.field980[4] = var32.field3826;
                                class3.field35[4] = var35;
                                class431.field5944[4] = arg7.method1092() ? var32.field3831 : var32.field3833;
                                class236.field3332[4] = var32.field3823;
                                class222.field3132[4] = var32.field3843;
                                class305.field4177[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg12 > 0) {
                int var36 = arg5[arg4][arg12 - 1] & 0xFF;
                if (var36 > 0) {
                    class277 var37 = this.field332.method2556(arg0 ^ 0xFFFFDDB3, var36 - 1);
                    if (var37.field3826 != -1) {
                        byte var38 = arg6[arg4][arg12 - 1];
                        byte var39 = arg1[arg4][arg12 - 1];
                        if (var37.field3828) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class389.method2314(var37, (byte) -40, arg7);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var41 &= 0x7;
                                var40 &= 0x7;
                                if (class484.field6826[var38][var41] && class222.field3132[var40] <= var37.field3843) {
                                    class66.field980[var40] = var37.field3826;
                                    class3.field35[var40] = var42;
                                    class431.field5944[var40] = arg7.method1092() ? var37.field3831 : var37.field3833;
                                    class236.field3332[var40] = var37.field3823;
                                    if (class222.field3132[var40] == var37.field3843) {
                                        class305.field4177[var40] = class366.method2215(class305.field4177[var40], 32);
                                    } else {
                                        class305.field4177[var40] = 32;
                                    }
                                    class222.field3132[var40] = var37.field3843;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg11 & 0x3]) {
                                arg8[0] = class475.field6717[var38][class347.method2074(var39 + 2, 3)];
                            }
                        } else if (!var15[arg11 & 0x3]) {
                            arg8[0] = class441.field6057[var38][class347.method2074(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg12 < arg13 - 1) {
                int var44 = arg5[arg4][arg12 + 1] & 0xFF;
                if (var44 > 0) {
                    class277 var45 = this.field332.method2556(120, var44 - 1);
                    if (var45.field3826 != -1) {
                        byte var46 = arg6[arg4][arg12 + 1];
                        byte var47 = arg1[arg4][arg12 + 1];
                        if (var45.field3828) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class389.method2314(var45, (byte) -40, arg7);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class484.field6826[var46][var49] && class222.field3132[var48] <= var45.field3843) {
                                    class66.field980[var48] = var45.field3826;
                                    class3.field35[var48] = var50;
                                    class431.field5944[var48] = arg7.method1092() ? var45.field3831 : var45.field3833;
                                    class236.field3332[var48] = var45.field3823;
                                    if (class222.field3132[var48] == var45.field3843) {
                                        class305.field4177[var48] = class366.method2215(class305.field4177[var48], 16);
                                    } else {
                                        class305.field4177[var48] = 16;
                                    }
                                    class222.field3132[var48] = var45.field3843;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg11 + 2 & 0x3]) {
                                arg8[2] = class475.field6717[var46][class347.method2074(-(-var47), 3)];
                            }
                        } else if (!var15[arg11 + 2 & 0x3]) {
                            arg8[2] = class441.field6057[var46][class347.method2074(-(-var47), 3)];
                        }
                    }
                }
            }
            if (arg4 > 0) {
                int var52 = arg5[arg4 - 1][arg12] & 0xFF;
                if (var52 > 0) {
                    class277 var53 = this.field332.method2556(arg0 ^ 0xFFFFDDB2, var52 - 1);
                    if (var53.field3826 != -1) {
                        byte var54 = arg6[arg4 - 1][arg12];
                        byte var55 = arg1[arg4 - 1][arg12];
                        if (var53.field3828) {
                            int var56 = 6;
                            int var57 = (var55 * 2) + 4;
                            int var58 = class389.method2314(var53, (byte) -40, arg7);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class484.field6826[var54][var57] && var53.field3843 >= class222.field3132[var56]) {
                                    class66.field980[var56] = var53.field3826;
                                    class3.field35[var56] = var58;
                                    class431.field5944[var56] = arg7.method1092() ? var53.field3831 : var53.field3833;
                                    class236.field3332[var56] = var53.field3823;
                                    if (class222.field3132[var56] == var53.field3843) {
                                        class305.field4177[var56] = class366.method2215(class305.field4177[var56], 8);
                                    } else {
                                        class305.field4177[var56] = 8;
                                    }
                                    class222.field3132[var56] = var53.field3843;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg11 + 3 & 0x3]) {
                                arg8[3] = class475.field6717[var54][class347.method2074(3, var55 + 1)];
                            }
                        } else if (!var15[arg11 + 3 & 0x3]) {
                            arg8[3] = class441.field6057[var54][class347.method2074(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg4 < arg9 - 1) {
                int var60 = arg5[arg4 + 1][arg12] & 0xFF;
                if (var60 > 0) {
                    class277 var61 = this.field332.method2556(126, var60 - 1);
                    if (var61.field3826 != -1) {
                        byte var62 = arg6[arg4 + 1][arg12];
                        byte var63 = arg1[arg4 + 1][arg12];
                        if (var61.field3828) {
                            int var64 = 4;
                            int var65 = (var63 * 2) + 6;
                            int var66 = class389.method2314(var61, (byte) -40, arg7);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class484.field6826[var62][var65] && class222.field3132[var64] <= var61.field3843) {
                                    class66.field980[var64] = var61.field3826;
                                    class3.field35[var64] = var66;
                                    class431.field5944[var64] = arg7.method1092() ? var61.field3831 : var61.field3833;
                                    class236.field3332[var64] = var61.field3823;
                                    if (class222.field3132[var64] == var61.field3843) {
                                        class305.field4177[var64] = class366.method2215(class305.field4177[var64], 4);
                                    } else {
                                        class305.field4177[var64] = 4;
                                    }
                                    class222.field3132[var64] = var61.field3843;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg11 + 1 & 0x3]) {
                                arg8[1] = class475.field6717[var62][class347.method2074(var63 + 3, 3)];
                            }
                        } else if (!var15[arg11 + 1 & 0x3]) {
                            arg8[1] = class441.field6057[var62][class347.method2074(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        field325++;
        if (arg2 == null) {
            return;
        }
        int var68 = class389.method2314(arg2, (byte) -40, arg7);
        if (!arg2.field3828) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg11 * 2) & 0x7;
            if (class484.field6826[arg10][var69] && class222.field3132[var70] <= arg2.field3843) {
                class66.field980[var70] = arg2.field3826;
                class3.field35[var70] = var68;
                class431.field5944[var70] = arg7.method1092() ? arg2.field3831 : arg2.field3833;
                class236.field3332[var70] = arg2.field3823;
                if (class222.field3132[var70] == arg2.field3843) {
                    class305.field4177[var70] = class366.method2215(class305.field4177[var70], 2);
                } else {
                    class305.field4177[var70] = 2;
                }
                class222.field3132[var70] = arg2.field3843;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lkm;ILdh;Ldh;)V")
    public final void method180(class487 arg0, int arg1, class269 arg2, class269 arg3) {
        field349++;
        int[][] var5 = new int[this.field355][this.field334];
        if (class289.field3964 == null || class289.field3964.length != this.field334) {
            class289.field3964 = new int[this.field334];
            class224.field3175 = new int[this.field334];
            class465.field6534 = new int[this.field334];
            class47.field764 = new int[this.field334];
            class478.field6760 = new int[this.field334];
        }
        for (int var6 = 0; var6 < this.field345; var6++) {
            for (int var8 = 0; var8 < this.field334; var8++) {
                class289.field3964[var8] = 0;
                class478.field6760[var8] = 0;
                class224.field3175[var8] = 0;
                class47.field764[var8] = 0;
                class465.field6534[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field355; var9++) {
                for (int var10 = 0; var10 < this.field334; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field355) {
                        int var20 = this.field326[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class228 var21 = this.field339.method1979(var20 - 1, arg1 + 18926);
                            class289.field3964[var10] += var21.field3221;
                            class478.field6760[var10] += var21.field3223;
                            class224.field3175[var10] += var21.field3217;
                            class47.field764[var10] += var21.field3216;
                            var10002 = class465.field6534[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field326[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class228 var24 = this.field339.method1979(var23 - 1, 18926);
                            class289.field3964[var10] -= var24.field3221;
                            class478.field6760[var10] -= var24.field3223;
                            class224.field3175[var10] -= var24.field3217;
                            class47.field764[var10] -= var24.field3216;
                            var10002 = class465.field6534[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field334; var16++) {
                        int var17 = var16 + 5;
                        if (this.field334 > var17) {
                            var13 += class224.field3175[var17];
                            var12 += class478.field6760[var17];
                            var14 += class47.field764[var17];
                            var11 += class289.field3964[var17];
                            var15 += class465.field6534[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class224.field3175[var18];
                            var15 -= class465.field6534[var18];
                            var12 -= class478.field6760[var18];
                            var14 -= class47.field764[var18];
                            var11 -= class289.field3964[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class56.method429(var12 / var15, var11 * 256 / var14, (byte) 100, var13 / var15);
                        }
                    }
                }
            }
            if (class272.field3774) {
                this.method168(var6 == 0 ? arg3 : null, class317.field4306[var6], -1, var6, arg0, var6 == 0 ? arg2 : null, var5);
            } else {
                this.method176(var5, var6 == 0 ? arg3 : null, var6, class317.field4306[var6], var6 == 0 ? arg2 : null, 106, arg0);
            }
            this.field326[var6] = null;
            this.field333[var6] = null;
            this.field340[var6] = null;
            this.field337[var6] = null;
        }
        if (!this.field352) {
            if (class131.field1848 != 0) {
                class394.method2352();
            }
            if (class232.field3276) {
                class476.method2800();
            }
        }
        for (int var7 = arg1; var7 < this.field345; var7++) {
            class317.field4306[var7].method707();
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIZLwg;Li;)V")
    public class20(int arg0, int arg1, int arg2, boolean arg3, class441 arg4, class332 arg5) {
        this.field332 = arg4;
        this.field355 = arg1;
        this.field334 = arg2;
        this.field345 = arg0;
        this.field352 = arg3;
        this.field339 = arg5;
        this.field348 = new int[this.field345][this.field355 + 1][this.field334 + 1];
        this.field326 = new byte[this.field345][this.field355][this.field334];
        this.field331 = new byte[this.field345][this.field355 + 1][this.field334 + 1];
        this.field333 = new byte[this.field345][this.field355][this.field334];
        this.field340 = new byte[this.field345][this.field355][this.field334];
        this.field337 = new byte[this.field345][this.field355][this.field334];
    }
}
