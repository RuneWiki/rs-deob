import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class523 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "[I")
    private int[] field7085 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
    private int[] field7098 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public int field7101;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field7090;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public int field7105;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Lud;")
    private class39 field7112;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Z")
    public boolean field7093;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lbe;")
    private class41 field7089;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[[[I")
    public int[][][] field7103;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[[[B")
    private byte[][][] field7095;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "[[[B")
    public byte[][][] field7099;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "[[[B")
    private byte[][][] field7094;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "[[[B")
    private byte[][][] field7107;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "[[[B")
    private byte[][][] field7104;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lvl;")
    public static class15 field7087 = new class15(72, 7);

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "Lfja;")
    public static class783 field7113 = new class783(31, 10);

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field7117 = 2;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "Lud;")
    public static class39 field7116;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Lnf;")
    public static class604 field7115;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[[[B")
    public byte[][][] field7088;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ls;Lha;ILs;)V")
    public final void method2969(class296 arg0, class66 arg1, int arg2, class296 arg3) {
        field7111++;
        if (class505.field6890 == null || class505.field6890.length != this.field7105) {
            class480.field6484 = new int[this.field7105];
            class269.field3780 = new int[this.field7105];
            class498.field6810 = new int[this.field7105];
            class505.field6890 = new int[this.field7105];
            class397.field5476 = new int[this.field7105];
        }
        int[][] var5 = new int[this.field7101][this.field7105];
        for (int var6 = 0; var6 < this.field7090; var6++) {
            for (int var8 = 0; var8 < this.field7105; var8++) {
                class505.field6890[var8] = 0;
                class498.field6810[var8] = 0;
                class397.field5476[var8] = 0;
                class269.field3780[var8] = 0;
                class480.field6484[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field7101; var9++) {
                for (int var10 = 0; var10 < this.field7105; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field7101 > var19) {
                        int var20 = this.field7095[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class153 var21 = this.field7089.method249(73, var20 - 1);
                            class505.field6890[var10] += var21.field2511;
                            class498.field6810[var10] += var21.field2520;
                            class397.field5476[var10] += var21.field2513;
                            class269.field3780[var10] += var21.field2510;
                            var10002 = class480.field6484[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field7095[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class153 var24 = this.field7089.method249(arg2 - 3330, var23 + -1);
                            class505.field6890[var10] -= var24.field2511;
                            class498.field6810[var10] -= var24.field2520;
                            class397.field5476[var10] -= var24.field2513;
                            class269.field3780[var10] -= var24.field2510;
                            var10002 = class480.field6484[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field7105; var16++) {
                        int var17 = var16 + 5;
                        if (this.field7105 > var17) {
                            var11 += class505.field6890[var17];
                            var12 += class498.field6810[var17];
                            var14 += class269.field3780[var17];
                            var15 += class480.field6484[var17];
                            var13 += class397.field5476[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class480.field6484[var18];
                            var11 -= class505.field6890[var18];
                            var13 -= class397.field5476[var18];
                            var14 -= class269.field3780[var18];
                            var12 -= class498.field6810[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class276.method1780(arg2 - 3418, var12 / var15, var13 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class650.field8980) {
                this.method2970(var5, var6 == 0 ? arg3 : null, arg1, (byte) 21, var6, class745.field10286[var6], var6 == 0 ? arg0 : null);
            } else {
                this.method2979((byte) -66, var6 == 0 ? arg0 : null, var6 == 0 ? arg3 : null, arg1, var5, class745.field10286[var6], var6);
            }
            this.field7095[var6] = null;
            this.field7094[var6] = null;
            this.field7107[var6] = null;
            this.field7104[var6] = null;
        }
        if (!this.field7093) {
            if (class618.field8595 != 0) {
                class744.method4128();
            }
            if (class661.field9161) {
                class53.method391();
            }
        }
        int var7 = 0;
        if (arg2 != 3400) {
            field7087 = null;
        }
        while (this.field7090 > var7) {
            class745.field10286[var7].method1905();
            var7++;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([[ILs;Lha;BILs;Ls;)V")
    private final void method2970(int[][] arg0, class296 arg1, class66 arg2, byte arg3, int arg4, class296 arg5, class296 arg6) {
        field7110++;
        byte[][] var8 = this.field7107[arg4];
        byte[][] var9 = this.field7104[arg4];
        byte[][] var10 = this.field7095[arg4];
        byte[][] var11 = this.field7094[arg4];
        for (int var12 = 0; var12 < this.field7101; var12++) {
            int var13 = var12 >= this.field7101 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field7105; var14++) {
                int var15 = var14 >= this.field7105 - 1 ? var14 : var14 + 1;
                if (class347.field4686 == -1 || class652.method3654(18334, var12, var14, arg4, class347.field4686)) {
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
                        class184 var26 = var21 == 0 ? null : this.field7112.method238(var21 - 1, false);
                        class153 var27 = var22 == 0 ? null : this.field7089.method249(arg3 ^ 0x49, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class184 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2858 == -1 && var26.field2853 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2866;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field7101 > var12 && var14 < this.field7105) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var36--;
                                var34--;
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
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method1897((byte) -34, var14, var12) - arg5.method1897((byte) -34, var15, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method1897((byte) -34, var14, var13) - arg5.method1897((byte) -34, var15, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class472.field6400[var39] = -1;
                            class10.field177[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2866 ? class733.field10117[var19] : class135.field2292[var19];
                        this.method2980(arg2, var8, var27, var9, (byte) 44, var14, var18, var11, var12, this.field7105, var20, this.field7101, var26, var19);
                        boolean var41 = var26 != null && var26.field2858 != var26.field2853;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class472.field6400[var42] >= 0 && class317.field4325[var42] != class133.field2279[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class659.method3705(var18[1], class204.method1456(class10.field177[4], class10.field177[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class659.method3705(var18[3], class204.method1456(class10.field177[6], class10.field177[0]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class659.method3705(var18[0], class204.method1456(class10.field177[2], class10.field177[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class659.method3705(var18[2], class204.method1456(class10.field177[6], class10.field177[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var49 = class67.field976[var19];
                            var47 = class184.field2868[var19];
                            var45 = var26 == null ? 0 : class548.field7454[var19];
                            var48 = class102.field1646[var19];
                            var46 = var27 == null ? 0 : class780.field10744[var19];
                        } else if (var17) {
                            var45 = var26 == null ? 0 : class320.field4369[var19];
                            var46 = var27 == null ? 0 : class318.field4328[var19];
                            var47 = class760.field10471[var19];
                            var48 = class230.field3354[var19];
                            var49 = class479.field6467[var19];
                            var44 = class735.field10150[var19];
                        } else {
                            var46 = var27 == null ? 0 : class662.field9192[var19];
                            var44 = class506.field6925[var19];
                            var47 = class509.field6994[var19];
                            var49 = class479.field6469[var19];
                            var45 = var26 == null ? 0 : class236.field3395[var19];
                            var48 = class177.field2801[var19];
                        }
                        int var50 = var45 + var46;
                        if (var50 <= 0) {
                            class681.method3839(arg4, var12, var14);
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
                            int[] var61 = arg6 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2858;
                                var63 = var26.field2865;
                                var64 = var26.field2867;
                                int var65 = class617.method3485(true, var26, arg2);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = 1;
                                        class664.field9230[2] = var49[var51];
                                        class664.field9230[3] = 1;
                                        class664.field9230[4] = var48[var51];
                                        var99 = 6;
                                        class664.field9230[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = 5;
                                        class664.field9230[2] = var49[var51];
                                        class664.field9230[3] = 5;
                                        class664.field9230[4] = var48[var51];
                                        var99 = 6;
                                        class664.field9230[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = 3;
                                        class664.field9230[2] = var49[var51];
                                        class664.field9230[3] = 3;
                                        class664.field9230[4] = var48[var51];
                                        var99 = 6;
                                        class664.field9230[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = 7;
                                        class664.field9230[2] = var49[var51];
                                        class664.field9230[3] = 7;
                                        class664.field9230[4] = var48[var51];
                                        class664.field9230[5] = var49[var51];
                                        var99 = 6;
                                    } else {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = var48[var51];
                                        var99 = 3;
                                        class664.field9230[2] = var49[var51];
                                    }
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class664.field9230[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field7085[var101];
                                        int var104 = this.field7098[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var105 = 512 - var103;
                                            var106 = var104;
                                        } else if (var20 == 2) {
                                            var105 = 512 - var104;
                                            var106 = 512 - var103;
                                        } else if (var20 == 3) {
                                            var106 = 512 - var104;
                                            var105 = var103;
                                        } else {
                                            var106 = var103;
                                            var105 = var104;
                                        }
                                        var55[var52] = var106;
                                        var56[var52] = var105;
                                        if (var60 != null && class106.field1692[var19][var101]) {
                                            int var107 = (var12 << 9) + var106;
                                            int var108 = (var14 << 9) + var105;
                                            var60[var52] = arg6.method1907(var107, (byte) -102, var108) - arg5.method1907(var107, (byte) 112, var108);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class106.field1692[var19][var101]) {
                                                int var109 = (var12 << 9) + var106;
                                                int var110 = (var14 << 9) + var105;
                                                var61[var52] = arg5.method1907(var109, (byte) -121, var110) - arg6.method1907(var109, (byte) 110, var110);
                                            } else if (arg1 != null && !class451.field6178[var19][var101]) {
                                                int var111 = (var12 << 9) + var106;
                                                int var112 = (var14 << 9) + var105;
                                                var61[var52] = arg1.method1907(var111, (byte) -78, var112) - arg5.method1907(var111, (byte) 103, var112);
                                            }
                                        }
                                        if (var101 < 8 && class472.field6400[var102] > var26.field2869) {
                                            if (var54 != null) {
                                                var54[var52] = class317.field4325[var102];
                                            }
                                            var59[var52] = class274.field3807[var102];
                                            var58[var52] = class329.field4477[var102];
                                            var57[var52] = class133.field2279[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field2865;
                                            var59[var52] = var26.field2867;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field7093 && arg4 == 0) {
                                    class626.method3523(var12, var14, var26.field2857, var26.field2859 * 8, var26.field2861);
                                }
                                if (var19 != 12 && var26.field2858 != -1 && var26.field2860) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class548.field7454[var19];
                            } else if (var17) {
                                var51 += class320.field4369[var19];
                            } else {
                                var51 += class236.field3395[var19];
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
                                class153 var67 = this.field7089.method249(34, var22 - 1);
                                class153 var68 = this.field7089.method249(arg3 - 6, var23 + -1);
                                class153 var69 = this.field7089.method249(14, var24 - 1);
                                class153 var70 = this.field7089.method249(53, var25 - 1);
                                for (int var71 = 0; var71 < var46; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = 1;
                                        class664.field9230[2] = var49[var51];
                                        class664.field9230[3] = 1;
                                        class664.field9230[4] = var48[var51];
                                        var73 = 6;
                                        class664.field9230[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = 5;
                                        class664.field9230[2] = var49[var51];
                                        class664.field9230[3] = 5;
                                        class664.field9230[4] = var48[var51];
                                        var73 = 6;
                                        class664.field9230[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = 3;
                                        class664.field9230[2] = var49[var51];
                                        class664.field9230[3] = 3;
                                        class664.field9230[4] = var48[var51];
                                        var73 = 6;
                                        class664.field9230[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = 7;
                                        class664.field9230[2] = var49[var51];
                                        class664.field9230[3] = 7;
                                        class664.field9230[4] = var48[var51];
                                        var73 = 6;
                                        class664.field9230[5] = var49[var51];
                                    } else {
                                        class664.field9230[0] = var47[var51];
                                        class664.field9230[1] = var48[var51];
                                        var73 = 3;
                                        class664.field9230[2] = var49[var51];
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class664.field9230[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field7085[var75];
                                        int var78 = this.field7098[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var80 = 512 - var77;
                                            var79 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 512 - var77;
                                            var80 = 512 - var78;
                                        } else if (var20 == 3) {
                                            var79 = 512 - var78;
                                            var80 = var77;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class106.field1692[var19][var75]) {
                                            int var81 = (var12 << 9) + var79;
                                            int var82 = (var14 << 9) + var80;
                                            var60[var52] = arg6.method1907(var81, (byte) 98, var82) - arg5.method1907(var81, (byte) 90, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class106.field1692[var19][var75]) {
                                                int var83 = (var12 << 9) + var79;
                                                int var84 = (var14 << 9) + var80;
                                                var61[var52] = arg5.method1907(var83, (byte) 122, var84) - arg6.method1907(var83, (byte) 115, var84);
                                            } else if (arg1 != null && !class451.field6178[var19][var75]) {
                                                int var85 = (var12 << 9) + var79;
                                                int var86 = (var14 << 9) + var80;
                                                var61[var52] = arg1.method1907(var85, (byte) -120, var86) - arg5.method1907(var85, (byte) -39, var86);
                                            }
                                        }
                                        if (var75 < 8 && class472.field6400[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class317.field4325[var76];
                                            }
                                            var59[var52] = class274.field3807[var76];
                                            var58[var52] = class329.field4477[var76];
                                            var57[var52] = class133.field2279[var76];
                                        } else {
                                            if (var17 && class106.field1692[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var67.field2519;
                                                var59[var52] = var67.field2507;
                                            } else if (var79 == 0 && var80 == 512) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var68.field2519;
                                                var59[var52] = var68.field2507;
                                            } else if (var79 == 512 && var80 == 512) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var69.field2519;
                                                var59[var52] = var69.field2507;
                                            } else if (var79 == 512 && var80 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var70.field2519;
                                                var59[var52] = var70.field2507;
                                            } else {
                                                if (var79 >= 256) {
                                                    if (var80 < 256) {
                                                        var58[var52] = var70.field2519;
                                                        var59[var52] = var70.field2507;
                                                    } else {
                                                        var58[var52] = var69.field2519;
                                                        var59[var52] = var69.field2507;
                                                    }
                                                } else if (var80 >= 256) {
                                                    var58[var52] = var68.field2519;
                                                    var59[var52] = var68.field2507;
                                                } else {
                                                    var58[var52] = var67.field2519;
                                                    var59[var52] = var67.field2507;
                                                }
                                                int var87 = class414.method2447(0, arg0[var13][var14], var79 << 7 >> 9, arg0[var12][var14]);
                                                int var88 = class414.method2447(arg3 - 21, arg0[var13][var15], var79 << 7 >> 9, arg0[var12][var15]);
                                                var57[var52] = class414.method2447(0, var88, var80 << 7 >> 9, var87);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field2518) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg5.method1897((byte) -34, var14, var12);
                            int var90 = arg5.method1897((byte) -34, var14, var13);
                            int var91 = arg5.method1897((byte) -34, var15, var13);
                            int var92 = arg5.method1897((byte) -34, var15, var12);
                            boolean var93 = class61.method425(var14, 16340, var12);
                            if (var93 && arg4 > 1 || !var93 && arg4 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field2517) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field2864) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field7099[arg4][var12][var14] = (byte) class530.method3011(this.field7099[arg4][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field7093) {
                                var95 = class755.method4184(var12, var14);
                                var96 = class576.method3323(var12, var14);
                                var97 = class27.method179(var12, var14);
                            }
                            arg5.method1896(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class681.method3839(arg4, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg3 != 21) {
            field7113 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIZ)V")
    public final void method2971(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var6 = 0; var6 < this.field7090; var6++) {
            this.method2973(var6, 3, arg1, arg3, arg2, arg0);
        }
        field7100++;
        if (!arg4) {
            this.field7107 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Ljo;IIIBILfca;)V")
    public final void method2972(class355[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class93 arg6) {
        int var8 = -52 % ((arg4 - 50) / 44);
        if (!this.field7093) {
            for (int var9 = 0; var9 < 4; var9++) {
                class355 var10 = arg0[var9];
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        int var13 = arg5 + var11;
                        int var14 = arg1 + var12;
                        if (var13 >= 0 && var13 < this.field7101 && var14 >= 0 && var14 < this.field7105) {
                            var10.method2177(var14, var13, 123);
                        }
                    }
                }
            }
        }
        field7084++;
        int var15 = arg3 + arg5;
        int var16 = arg2 + arg1;
        for (int var17 = 0; var17 < this.field7090; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method2976(arg1 + var19, 0, false, var15 + var18, var16 + var19, 0, var17, -118, arg6, 0, arg5 + var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
    public final void method2973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < arg3 + arg4; var7++) {
            for (int var10 = arg5; var10 < (arg5 + arg2); var10++) {
                if (var10 >= 0 && var10 < this.field7101 && var7 >= 0 && this.field7105 > var7) {
                    this.field7103[arg0][var10][var7] = arg0 <= 0 ? 0 : this.field7103[arg0 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg1 != 3) {
            this.field7107 = null;
        }
        field7109++;
        if (arg5 > 0 && arg5 < this.field7101) {
            for (int var8 = arg3 + 1; var8 < arg3 + arg4; var8++) {
                if (var8 >= 0 && this.field7105 > var8) {
                    this.field7103[arg0][arg5][var8] = this.field7103[arg0][arg5 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field7105) {
            for (int var9 = arg5 + 1; var9 < (arg5 + arg2); var9++) {
                if (var9 >= 0 && this.field7101 > var9) {
                    this.field7103[arg0][var9][arg3] = this.field7103[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg5 < 0 || arg3 < 0 || arg5 >= this.field7101 || arg3 >= this.field7105) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 <= 0 || this.field7103[arg0][arg5 - 1][arg3] == 0) {
                if (arg3 > 0 && this.field7103[arg0][arg5][arg3 - 1] != 0) {
                    this.field7103[arg0][arg5][arg3] = this.field7103[arg0][arg5][arg3 - 1];
                    return;
                }
                if (arg5 > 0 && arg3 > 0 && this.field7103[arg0][arg5 - 1][arg3 - 1] != 0) {
                    this.field7103[arg0][arg5][arg3] = this.field7103[arg0][arg5 - 1][arg3 - 1];
                    return;
                }
                return;
            }
            this.field7103[arg0][arg5][arg3] = this.field7103[arg0][arg5 - 1][arg3];
        } else if (arg5 <= 0 || this.field7103[arg0 - 1][arg5 - 1][arg3] == this.field7103[arg0][arg5 - 1][arg3]) {
            if (arg3 > 0 && this.field7103[arg0 - 1][arg5][arg3 - 1] != this.field7103[arg0][arg5][arg3 - 1]) {
                this.field7103[arg0][arg5][arg3] = this.field7103[arg0][arg5][arg3 - 1];
                return;
            }
            if (arg5 > 0 && arg3 > 0 && this.field7103[arg0 - 1][arg5 - 1][arg3 - 1] != this.field7103[arg0][arg5 - 1][arg3 - 1]) {
                this.field7103[arg0][arg5][arg3] = this.field7103[arg0][arg5 - 1][arg3 - 1];
                return;
            }
        } else {
            this.field7103[arg0][arg5][arg3] = this.field7103[arg0][arg5 - 1][arg3];
            return;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method2974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class761.field10481 = arg1;
        class152.field2496 = arg5;
        class741.field10224 = arg3;
        field7092++;
        class100.field1625 = arg0;
        class113.field2114 = arg2;
        if (arg6 && class761.field10481 >= 100) {
            class733.field10131 = class152.field2496 * 512 + 256;
            class450.field6172 = class113.field2114 * 512 + 256;
            class605.field8452 = class309.method1973(arg4 ^ 0x7CE6, class733.field10131, class450.field6172, class282.field3917) - class741.field10224;
        }
        class536.field7291 = 2;
        if (arg4 != 18202) {
            method2974(104, -90, 107, 105, -118, -93, true);
        }
        class100.field1626 = -1;
        class577.field8185 = -1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method2975(int arg0) {
        field7116 = null;
        field7115 = null;
        field7087 = null;
        field7113 = null;
        int var1 = -52 % ((arg0 + 40) / 33);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZIIIIILfca;II)V")
    private final void method2976(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class93 arg8, int arg9, int arg10) {
        field7096++;
        if (arg1 == 1) {
            arg5 = 1;
        } else if (arg1 == 2) {
            arg9 = 1;
            arg5 = 1;
        } else if (arg1 == 3) {
            arg9 = 1;
        }
        if (arg10 >= 0 && this.field7101 > arg10 && arg0 >= 0 && arg0 < this.field7105) {
            if (!this.field7093 && !arg2) {
                class554.field7832[arg6][arg10][arg0] = 0;
            }
            while (true) {
                int var12 = arg8.method793((byte) 12);
                if (var12 == 0) {
                    if (this.field7093) {
                        this.field7103[0][arg10 + arg9][arg0 + arg5] = 0;
                    } else if (arg6 == 0) {
                        this.field7103[0][arg9 + arg10][arg0 + arg5] = -class565.method3267(arg3 + 932731, -22, arg4 + 556238) * 8 << 2;
                    } else {
                        this.field7103[arg6][arg9 + arg10][arg0 + arg5] = this.field7103[arg6 - 1][arg9 + arg10][arg0 + arg5] - 960;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg8.method793((byte) 44);
                    if (this.field7093) {
                        this.field7103[0][arg10 + arg9][arg0 + arg5] = var13 * 8 << 2;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg6 == 0) {
                            this.field7103[0][arg9 + arg10][arg0 + arg5] = -var13 * 8 << 2;
                        } else {
                            this.field7103[arg6][arg9 + arg10][arg0 + arg5] = this.field7103[arg6 - 1][arg9 + arg10][arg0 + arg5] - (var13 * 8 << 2);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg2) {
                        arg8.method793((byte) 56);
                    } else {
                        this.field7094[arg6][arg10][arg0] = arg8.method766((byte) 122);
                        this.field7107[arg6][arg10][arg0] = (byte) ((var12 - 2) / 4);
                        this.field7104[arg6][arg10][arg0] = (byte) class204.method1456(3, var12 + arg1 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!this.field7093 && !arg2) {
                        class554.field7832[arg6][arg10][arg0] = (byte) (var12 - 49);
                    }
                } else if (!arg2) {
                    this.field7095[arg6][arg10][arg0] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg8.method793((byte) 118);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg8.method793((byte) 85);
                    break;
                }
                if (var14 <= 49) {
                    arg8.method793((byte) 90);
                }
            }
        }
        int var15 = -126 / ((arg7 + 17) / 41);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[FIIII)V")
    public static final void method2977(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field7097++;
        if (arg6 > 0 && !class461.method2656(0, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class461.method2656(0, arg1)) {
            int var7 = class622.method3510(arg5 ^ 0xFFFF9962, arg3);
            int var8 = 0;
            int var9 = arg1 <= arg6 ? arg1 : arg6;
            int var10 = arg6 >> 1;
            if (arg5 != 26266) {
                method2974(-5, 123, 108, 53, -47, -21, false);
            }
            int var11 = arg1 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var8, arg4, arg6, arg1, 0, arg3, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg6 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg6 = var10;
                arg1 = var11;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB[[I)V")
    public final void method2978(int arg0, byte arg1, int[][] arg2) {
        field7106++;
        int[][] var4 = this.field7103[arg0];
        if (arg1 != -18) {
            this.field7098 = null;
        }
        for (int var5 = 0; var5 < this.field7101 + 1; var5++) {
            for (int var6 = 0; var6 < this.field7105 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLs;Ls;Lha;[[ILs;I)V")
    private final void method2979(byte arg0, class296 arg1, class296 arg2, class66 arg3, int[][] arg4, class296 arg5, int arg6) {
        field7086++;
        for (int var8 = 0; var8 < this.field7101; var8++) {
            for (int var9 = 0; var9 < this.field7105; var9++) {
                if (class347.field4686 == -1 || class652.method3654(arg0 ^ 0xFFFFB820, var8, var9, arg6, class347.field4686)) {
                    byte var10 = this.field7107[arg6][var8][var9];
                    byte var11 = this.field7104[arg6][var8][var9];
                    int var12 = this.field7094[arg6][var8][var9] & 0xFF;
                    int var13 = this.field7095[arg6][var8][var9] & 0xFF;
                    class184 var14 = var12 == 0 ? null : this.field7112.method238(var12 - 1, false);
                    class153 var15 = var13 == 0 ? null : this.field7089.method249(arg0 + 94, var13 + -1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class184 var16 = var14;
                    if (var14 != null && var14.field2858 == -1 && var14.field2853 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class780.field10744[var10];
                        int var18 = class548.field7454[var10];
                        int var19 = (var14 == null ? 0 : var18) + (var15 == null ? 0 : var17);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field2865;
                        int var23 = var15 == null ? -1 : var15.field2519;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field2853 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class184.field2868[var10][var21];
                                var25[var20] = class102.field1646[var10][var21];
                                var26[var20] = class67.field976[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field2867;
                                var27[var20] = var14.field2858;
                                if (var30 != null) {
                                    var30[var20] = var14.field2853;
                                }
                                var21++;
                                var20++;
                            }
                            if (!this.field7093 && arg6 == 0) {
                                class626.method3523(var8, var9, var14.field2857, var14.field2859 * 8, var14.field2861);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class184.field2868[var10][var21];
                                var25[var20] = class102.field1646[var10][var21];
                                var26[var20] = class67.field976[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field2507;
                                var27[var20] = arg4[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var20++;
                                var21++;
                            }
                        }
                        int var33 = this.field7085.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg1 == null ? null : new int[var33];
                        int[] var37 = arg1 == null && arg2 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field7085[var38];
                            int var49 = this.field7098[var38];
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
                            if (var36 != null && class106.field1692[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg1.method1907(var52, (byte) -30, var53) - arg5.method1907(var52, (byte) -36, var53);
                            }
                            if (var37 != null) {
                                if (arg1 != null && !class106.field1692[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg5.method1907(var54, (byte) -56, var55) - arg1.method1907(var54, (byte) 119, var55);
                                } else if (arg2 != null && !class451.field6178[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg2.method1907(var56, (byte) -79, var57) - arg5.method1907(var56, (byte) 105, var57);
                                }
                            }
                        }
                        int var39 = arg5.method1897((byte) -34, var9, var8);
                        int var40 = arg5.method1897((byte) -34, var9, var8 + 1);
                        int var41 = arg5.method1897((byte) -34, var9 + 1, var8 + 1);
                        int var42 = arg5.method1897((byte) -34, var9 + 1, var8);
                        boolean var43 = class61.method425(var9, arg0 + 16406, var8);
                        if (var43 && arg6 > 1 || !var43 && arg6 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field2517) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field2864) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field7099[arg6][var8][var9] = (byte) class530.method3011(this.field7099[arg6][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field7093) {
                            var45 = class755.method4184(var8, var9);
                            var46 = class576.method3323(var8, var9);
                            var47 = class27.method179(var8, var9);
                        }
                        arg5.method1898(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class681.method3839(arg6, var8, var9);
                    }
                }
            }
        }
        if (arg0 != -66) {
            field7115 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lha;[[BLfea;[[BBI[Z[[BIIIILcda;I)V")
    private final void method2980(class66 arg0, byte[][] arg1, class153 arg2, byte[][] arg3, byte arg4, int arg5, boolean[] arg6, byte[][] arg7, int arg8, int arg9, int arg10, int arg11, class184 arg12, int arg13) {
        field7108++;
        boolean[] var15 = arg12 != null && arg12.field2866 ? class733.field10117[arg13] : class135.field2292[arg13];
        if (arg5 > 0) {
            if (arg8 > 0) {
                int var16 = arg7[arg8 - 1][arg5 - 1] & 0xFF;
                if (var16 > 0) {
                    class184 var17 = this.field7112.method238(var16 - 1, false);
                    if (var17.field2858 != -1 && var17.field2866) {
                        byte var18 = arg1[arg8 - 1][arg5 - 1];
                        int var19 = (arg3[arg8 - 1][arg5 - 1] * 2) + 4 & 0x7;
                        int var20 = class617.method3485(true, var17, arg0);
                        if (class106.field1692[var18][var19]) {
                            class133.field2279[0] = var17.field2858;
                            class317.field4325[0] = var20;
                            class329.field4477[0] = var17.field2865;
                            class274.field3807[0] = var17.field2867;
                            class472.field6400[0] = var17.field2869;
                            class10.field177[0] = 256;
                        }
                    }
                }
            }
            if (arg8 < arg11 - 1) {
                int var21 = arg7[arg8 + 1][arg5 - 1] & 0xFF;
                if (var21 > 0) {
                    class184 var22 = this.field7112.method238(var21 - 1, false);
                    if (var22.field2858 != -1 && var22.field2866) {
                        byte var23 = arg1[arg8 + 1][arg5 - 1];
                        int var24 = arg3[arg8 + 1][arg5 - 1] * 2 + 6 & 0x7;
                        int var25 = class617.method3485(true, var22, arg0);
                        if (class106.field1692[var23][var24]) {
                            class133.field2279[2] = var22.field2858;
                            class317.field4325[2] = var25;
                            class329.field4477[2] = var22.field2865;
                            class274.field3807[2] = var22.field2867;
                            class472.field6400[2] = var22.field2869;
                            class10.field177[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg5 < arg9 - 1) {
            if (arg8 > 0) {
                int var26 = arg7[arg8 - 1][arg5 + 1] & 0xFF;
                if (var26 > 0) {
                    class184 var27 = this.field7112.method238(var26 - 1, false);
                    if (var27.field2858 != -1 && var27.field2866) {
                        byte var28 = arg1[arg8 - 1][arg5 + 1];
                        int var29 = arg3[arg8 - 1][arg5 + 1] * 2 + 2 & 0x7;
                        int var30 = class617.method3485(true, var27, arg0);
                        if (class106.field1692[var28][var29]) {
                            class133.field2279[6] = var27.field2858;
                            class317.field4325[6] = var30;
                            class329.field4477[6] = var27.field2865;
                            class274.field3807[6] = var27.field2867;
                            class472.field6400[6] = var27.field2869;
                            class10.field177[6] = 64;
                        }
                    }
                }
            }
            if (arg8 < (arg11 - 1)) {
                int var31 = arg7[arg8 + 1][arg5 + 1] & 0xFF;
                if (var31 > 0) {
                    class184 var32 = this.field7112.method238(var31 - 1, false);
                    if (var32.field2858 != -1 && var32.field2866) {
                        byte var33 = arg1[arg8 + 1][arg5 + 1];
                        int var34 = arg3[arg8 + 1][arg5 + 1] * 2 & 0x7;
                        int var35 = class617.method3485(true, var32, arg0);
                        if (class106.field1692[var33][var34]) {
                            class133.field2279[4] = var32.field2858;
                            class317.field4325[4] = var35;
                            class329.field4477[4] = var32.field2865;
                            class274.field3807[4] = var32.field2867;
                            class472.field6400[4] = var32.field2869;
                            class10.field177[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var36 = arg7[arg8][arg5 - 1] & 0xFF;
            if (var36 > 0) {
                class184 var37 = this.field7112.method238(var36 - 1, false);
                if (var37.field2858 != -1) {
                    byte var38 = arg1[arg8][arg5 - 1];
                    byte var39 = arg3[arg8][arg5 - 1];
                    if (var37.field2866) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class617.method3485(true, var37, arg0);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class106.field1692[var38][var41] && var37.field2869 >= class472.field6400[var40]) {
                                class133.field2279[var40] = var37.field2858;
                                class317.field4325[var40] = var42;
                                class329.field4477[var40] = var37.field2865;
                                class274.field3807[var40] = var37.field2867;
                                if (class472.field6400[var40] == var37.field2869) {
                                    class10.field177[var40] = class530.method3011(class10.field177[var40], 32);
                                } else {
                                    class10.field177[var40] = 32;
                                }
                                class472.field6400[var40] = var37.field2869;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg10 & 0x3]) {
                            arg6[0] = class733.field10117[var38][class204.method1456(3, var39 + 2)];
                        }
                    } else if (!var15[arg10 & 0x3]) {
                        arg6[0] = class135.field2292[var38][class204.method1456(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg5 < (arg9 - 1)) {
            int var44 = arg7[arg8][arg5 + 1] & 0xFF;
            if (var44 > 0) {
                class184 var45 = this.field7112.method238(var44 - 1, false);
                if (var45.field2858 != -1) {
                    byte var46 = arg1[arg8][arg5 + 1];
                    byte var47 = arg3[arg8][arg5 + 1];
                    if (var45.field2866) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class617.method3485(true, var45, arg0);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class106.field1692[var46][var49] && var45.field2869 >= class472.field6400[var48]) {
                                class133.field2279[var48] = var45.field2858;
                                class317.field4325[var48] = var50;
                                class329.field4477[var48] = var45.field2865;
                                class274.field3807[var48] = var45.field2867;
                                if (class472.field6400[var48] == var45.field2869) {
                                    class10.field177[var48] = class530.method3011(class10.field177[var48], 16);
                                } else {
                                    class10.field177[var48] = 16;
                                }
                                class472.field6400[var48] = var45.field2869;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg10 + 2 & 0x3]) {
                            arg6[2] = class733.field10117[var46][class204.method1456(3, var47)];
                        }
                    } else if (!var15[arg10 + 2 & 0x3]) {
                        arg6[2] = class135.field2292[var46][class204.method1456(3, var47)];
                    }
                }
            }
        }
        if (arg4 != 44) {
            return;
        }
        if (arg8 > 0) {
            int var52 = arg7[arg8 - 1][arg5] & 0xFF;
            if (var52 > 0) {
                class184 var53 = this.field7112.method238(var52 - 1, false);
                if (var53.field2858 != -1) {
                    byte var54 = arg1[arg8 - 1][arg5];
                    byte var55 = arg3[arg8 - 1][arg5];
                    if (var53.field2866) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class617.method3485(true, var53, arg0);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class106.field1692[var54][var57] && var53.field2869 >= class472.field6400[var56]) {
                                class133.field2279[var56] = var53.field2858;
                                class317.field4325[var56] = var58;
                                class329.field4477[var56] = var53.field2865;
                                class274.field3807[var56] = var53.field2867;
                                if (class472.field6400[var56] == var53.field2869) {
                                    class10.field177[var56] = class530.method3011(class10.field177[var56], 8);
                                } else {
                                    class10.field177[var56] = 8;
                                }
                                class472.field6400[var56] = var53.field2869;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg10 + 3 & 0x3]) {
                            arg6[3] = class733.field10117[var54][class204.method1456(3, var55 + 1)];
                        }
                    } else if (!var15[arg10 + 3 & 0x3]) {
                        arg6[3] = class135.field2292[var54][class204.method1456(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg8 < arg11 - 1) {
            int var60 = arg7[arg8 + 1][arg5] & 0xFF;
            if (var60 > 0) {
                class184 var61 = this.field7112.method238(var60 - 1, false);
                if (var61.field2858 != -1) {
                    byte var62 = arg1[arg8 + 1][arg5];
                    byte var63 = arg3[arg8 + 1][arg5];
                    if (var61.field2866) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class617.method3485(true, var61, arg0);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class106.field1692[var62][var65] && class472.field6400[var64] <= var61.field2869) {
                                class133.field2279[var64] = var61.field2858;
                                class317.field4325[var64] = var66;
                                class329.field4477[var64] = var61.field2865;
                                class274.field3807[var64] = var61.field2867;
                                if (class472.field6400[var64] == var61.field2869) {
                                    class10.field177[var64] = class530.method3011(class10.field177[var64], 4);
                                } else {
                                    class10.field177[var64] = 4;
                                }
                                class472.field6400[var64] = var61.field2869;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg10 + 1 & 0x3]) {
                            arg6[1] = class733.field10117[var62][class204.method1456(3, var63 + 3)];
                        }
                    } else if (!var15[arg10 + 1 & 0x3]) {
                        arg6[1] = class135.field2292[var62][class204.method1456(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg12 == null) {
            return;
        }
        int var68 = class617.method3485(true, arg12, arg0);
        if (!arg12.field2866) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg10 * 2) & 0x7;
            if (class106.field1692[arg13][var69] && class472.field6400[var70] <= arg12.field2869) {
                class133.field2279[var70] = arg12.field2858;
                class317.field4325[var70] = var68;
                class329.field4477[var70] = arg12.field2865;
                class274.field3807[var70] = arg12.field2867;
                if (class472.field6400[var70] == arg12.field2869) {
                    class10.field177[var70] = class530.method3011(class10.field177[var70], 2);
                } else {
                    class10.field177[var70] = 2;
                }
                class472.field6400[var70] = arg12.field2869;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Ljo;IIIIIILfca;II)V")
    public final void method2981(class355[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class93 arg7, int arg8, int arg9) {
        field7091++;
        int var11 = (arg6 & 0x7) * 8;
        if (!this.field7093) {
            class355 var12 = arg0[arg4];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class180.method1354(arg8, var13 & 0x7, (byte) 113, var14 & 0x7) + arg1;
                    int var16 = class239.method1592(arg8, var13 & 0x7, var14 & 0x7, false) + arg2;
                    if (var15 > 0 && var15 < (this.field7101 - 1) && var16 > 0 && var16 < this.field7105 - 1) {
                        var12.method2177(var16, var15, 77);
                    }
                }
            }
        }
        int var17 = (arg3 & 0x7) * 8;
        int var18 = (arg6 & 0xFFFFFFF8) << 3;
        int var19 = (arg3 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        if (arg9 != 11193) {
            this.method2980(null, null, null, null, (byte) 103, 28, null, null, -71, 28, -38, 93, null, 49);
        }
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field7090; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg5 == var22 && var23 >= var11 && var23 <= (var11 + 8) && var17 <= var24 && (var17 + 8) >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var17 + 8) == var24) {
                            if (arg8 == 0) {
                                var25 = arg1 + var23 - var11;
                                var26 = arg2 + var24 - var17;
                            } else if (arg8 == 1) {
                                var26 = arg2 + var11 + 8 - var23;
                                var25 = var24 + arg1 - var17;
                            } else if (arg8 == 2) {
                                var26 = var17 + arg2 + 8 - var24;
                                var25 = arg1 + var11 + 8 - var23;
                            } else {
                                var25 = var17 + arg1 + 8 - var24;
                                var26 = var23 + arg2 - var11;
                            }
                            this.method2976(var26, 0, true, var18 + var23, var19 - -var24, 0, arg4, -62, arg7, 0, var25);
                        } else {
                            var25 = arg1 + class180.method1354(arg8, var23 & 0x7, (byte) 113, var24 & 0x7);
                            var26 = arg2 + class239.method1592(arg8, var23 & 0x7, var24 & 0x7, false);
                            this.method2976(var26, arg8, false, var18 + var23, var19 + var24, var21, arg4, arg9 - 11287, arg7, var20, var25);
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
                                if (arg8 == 0) {
                                    var31 = arg1 + var29 - var11;
                                    var32 = var30 + arg2 - var17;
                                } else if (arg8 == 1) {
                                    var32 = var11 + 8 - (var29 - arg2);
                                    var31 = arg1 + var30 - var17;
                                } else if (arg8 == 2) {
                                    var31 = arg1 + var11 + 8 - var29;
                                    var32 = var17 + arg2 + 8 - var30;
                                } else {
                                    var32 = arg2 + var29 - var11;
                                    var31 = arg1 + 8 - (var30 - var17);
                                }
                                if (var31 >= 0 && var31 < this.field7101 && var32 >= 0 && var32 < this.field7105) {
                                    this.field7103[arg4][var31][var32] = this.field7103[arg4][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2976(-1, 0, false, 0, 0, 0, 0, -86, arg7, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([[[ILha;I[Ljo;)V")
    public final void method2982(int[][][] arg0, class66 arg1, int arg2, class355[] arg3) {
        field7102++;
        if (!this.field7093) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field7101; var6++) {
                    for (int var7 = 0; var7 < this.field7105; var7++) {
                        if ((class554.field7832[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class554.field7832[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method2183(55, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 >= -46) {
            field7115 = null;
        }
        for (int var9 = 0; var9 < this.field7090; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field7093) {
                if (class448.field6146) {
                    var11 |= 0x8;
                }
                if (class661.field9161) {
                    var10 |= 0x2;
                }
                if (class618.field8595 != 0) {
                    var10 |= 0x1;
                    if (class735.field10153 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class661.field9161) {
                var11 |= 0x7;
            }
            if (!class771.field10628) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field7103[var9] : arg0[var9];
            class39.method241(var9, arg1.method589(this.field7101, this.field7105, this.field7103[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIZLud;Lbe;)V")
    public class523(int arg0, int arg1, int arg2, boolean arg3, class39 arg4, class41 arg5) {
        this.field7101 = arg1;
        this.field7090 = arg0;
        this.field7105 = arg2;
        this.field7112 = arg4;
        this.field7093 = arg3;
        this.field7089 = arg5;
        this.field7103 = new int[this.field7090][this.field7101 + 1][this.field7105 + 1];
        this.field7095 = new byte[this.field7090][this.field7101][this.field7105];
        this.field7099 = new byte[this.field7090][this.field7101 + 1][this.field7105 + 1];
        this.field7094 = new byte[this.field7090][this.field7101][this.field7105];
        this.field7107 = new byte[this.field7090][this.field7101][this.field7105];
        this.field7104 = new byte[this.field7090][this.field7101][this.field7105];
    }
}
