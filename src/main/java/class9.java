import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "[I")
    private int[] field128 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "[I")
    private int[] field130 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lhl;")
    private class530 field139;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Ltfa;")
    private class34 field134;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Z")
    public boolean field122;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "[[[B")
    private byte[][][] field127;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "[[[I")
    public int[][][] field137;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[[[B")
    private byte[][][] field120;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "[[[B")
    private byte[][][] field116;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[[[B")
    public byte[][][] field119;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[[[B")
    private byte[][][] field118;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lqe;")
    public static class469 field112 = new class469(103, 10);

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field142 = -1;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Lvd;")
    public static class39 field143;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "[I")
    public static int[] field141;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[[[B")
    public byte[][][] field124;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([[III)V", line = 4)
    public final void method55(int[][] arg0, int arg1, int arg2) {
        field136++;
        int[][] var4 = this.field137[arg1];
        for (int var5 = 0; var5 < (this.field140 + 1); var5++) {
            for (int var6 = 0; var6 < this.field138 + 1; var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
        if (arg2 != -1) {
            this.method68(-42, null, null, null, null, null, -92);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILs;Ls;Lha;[[IILs;)V", line = 32)
    private final void method56(int arg0, class280 arg1, class280 arg2, class60 arg3, int[][] arg4, int arg5, class280 arg6) {
        field129++;
        if (arg0 != 1) {
            this.method55(null, 88, -74);
        }
        for (int var8 = 0; var8 < this.field140; var8++) {
            for (int var9 = 0; var9 < this.field138; var9++) {
                if (class218.field3213 == -1 || class46.method350(class218.field3213, 25380, var9, arg5, var8)) {
                    byte var10 = this.field127[arg5][var8][var9];
                    byte var11 = this.field118[arg5][var8][var9];
                    int var12 = this.field120[arg5][var8][var9] & 0xFF;
                    int var13 = this.field116[arg5][var8][var9] & 0xFF;
                    class456 var14 = var12 == 0 ? null : this.field139.method3096(var12 - 1, (byte) 28);
                    class707 var15 = var13 == 0 ? null : this.field134.method173(var13 - 1, arg0 + 122);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class456 var16 = var14;
                    if (var14 != null && var14.field6713 == -1 && var14.field6721 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class371.field5326[var10];
                        int var18 = class290.field4148[var10];
                        int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field6728;
                        int var23 = var15 == null ? -1 : var15.field9964;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field6721 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class424.field6303[var10][var21];
                                var25[var20] = class434.field6464[var10][var21];
                                var26[var20] = class72.field1018[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field6732;
                                var27[var20] = var14.field6713;
                                if (var30 != null) {
                                    var30[var20] = var14.field6721;
                                }
                                var21++;
                                var20++;
                            }
                            if (!this.field122 && arg5 == 0) {
                                class506.method3002(var8, var9, var14.field6715, var14.field6733 * 8, var14.field6736);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class424.field6303[var10][var21];
                                var25[var20] = class434.field6464[var10][var21];
                                var26[var20] = class72.field1018[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field9963;
                                var27[var20] = arg4[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var21++;
                                var20++;
                            }
                        }
                        int var33 = this.field128.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg2 == null ? null : new int[var33];
                        int[] var37 = arg2 == null && arg1 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field128[var38];
                            int var49 = this.field130[var38];
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
                            if (var36 != null && class359.field5217[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg2.method1786(var53, (byte) 113, var52) - arg6.method1786(var53, (byte) 113, var52);
                            }
                            if (var37 != null) {
                                if (arg2 != null && !class359.field5217[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg6.method1786(var55, (byte) 113, var54) - arg2.method1786(var55, (byte) 113, var54);
                                } else if (arg1 != null && !class740.field10374[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg1.method1786(var57, (byte) 113, var56) - arg6.method1786(var57, (byte) 113, var56);
                                }
                            }
                        }
                        int var39 = arg6.method1787(var8, 19646, var9);
                        int var40 = arg6.method1787(var8 + 1, 19646, var9);
                        int var41 = arg6.method1787(var8 + 1, 19646, var9 + 1);
                        int var42 = arg6.method1787(var8, 19646, var9 + 1);
                        boolean var43 = class286.method1827(var8, var9, (byte) -56);
                        if (var43 && arg5 > 1 || !var43 && arg5 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field9965) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field6717) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field119[arg5][var8][var9] = (byte) class625.method3600(this.field119[arg5][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field122) {
                            var45 = class303.method1912(var8, var9);
                            var46 = class311.method1966(var8, var9);
                            var47 = class466.method2829(var8, var9);
                        }
                        arg6.method957(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class252.method1660(arg5, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Loda;Z)Z", line = 316)
    public static final boolean method57(class119 arg0, boolean arg1) {
        boolean var2 = class582.field8287 == class46.field568;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method736((byte) -120);
        if (arg0.field1628 < 0 || arg0.field1626 < 0 || arg0.field1632 >= class34.field356 || arg0.field1624 >= class565.field8040) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field1628; var7 <= arg0.field1632; var7++) {
            for (int var11 = arg0.field1626; var11 <= arg0.field1624; var11++) {
                class186 var12 = class467.method2834(arg0.field8429, var7, var11);
                if (var12 != null) {
                    class754 var13 = class131.method930(arg0, (byte) 114);
                    class754 var14 = var12.field2830;
                    if (var14 == null) {
                        var12.field2830 = var13;
                    } else {
                        while (var14.field10537 != null) {
                            var14 = var14.field10537;
                        }
                        var14.field10537 = var13;
                    }
                    if (var2 && (class624.field8740[var7][var11] & 0xFF000000) != 0) {
                        var3 = class624.field8740[var7][var11];
                        var4 = class21.field225[var7][var11];
                        var5 = class289.field4115[var7][var11];
                    }
                    if (!arg1 && var12.field2844 != null && var12.field2844.field4980 > var6) {
                        var6 = var12.field2844.field4980;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field1628; var8 <= arg0.field1632; var8++) {
                for (int var9 = arg0.field1626; var9 <= arg0.field1624; var9++) {
                    if ((class624.field8740[var8][var9] & 0xFF000000) == 0) {
                        class624.field8740[var8][var9] = var3;
                        class21.field225[var8][var9] = var4;
                        class289.field4115[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class187.field2850[class425.field6313++] = arg0;
        } else {
            int var10 = class582.field8287 == class46.field568 ? 1 : 0;
            if (!arg0.method320((byte) 84)) {
                arg0.field8431 = class374.field5677[var10];
                class374.field5677[var10] = arg0;
            } else if (arg0.method329((byte) -117)) {
                arg0.field8431 = class614.field8664[var10];
                class614.field8664[var10] = arg0;
            } else {
                arg0.field8431 = class577.field8153[var10];
                class577.field8153[var10] = arg0;
                class226.field3323 = true;
            }
        }
        if (arg1) {
            arg0.field8421 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 449)
    public static void method58(byte arg0) {
        field143 = null;
        field141 = null;
        if (arg0 < -25) {
            field112 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILrg;II[Ltea;II)V", line = 461)
    public final void method59(int arg0, class645 arg1, int arg2, int arg3, class240[] arg4, int arg5, int arg6) {
        if (!this.field122) {
            for (int var8 = 0; var8 < 4; var8++) {
                class240 var9 = arg4[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && this.field140 > var12 && var13 >= 0 && var13 < this.field138) {
                            var9.method1601(var12, arg5 ^ 0x20000C, var13);
                        }
                    }
                }
            }
        }
        field123++;
        int var14 = arg2 + arg3;
        int var15 = arg0 + arg6;
        for (int var16 = 0; var16 < this.field133; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method67(false, 0, false, 0, var15 + var18, var18 - -arg0, arg3 + var17, arg1, 0, var14 + var17, var16);
                }
            }
        }
        if (arg5 != -13) {
            this.method63(null, 122, null, null, null, 7, 34, null, -78, null, 8, null, 83, -77);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V", line = 541)
    public final void method60(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -13557) {
            this.field139 = null;
        }
        field121++;
        for (int var6 = 0; var6 < this.field133; var6++) {
            this.method64(true, var6, arg1, arg0, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ls;Lha;Ls;I)V", line = 558)
    public final void method61(class280 arg0, class60 arg1, class280 arg2, int arg3) {
        field111++;
        int[][] var5 = new int[this.field140][this.field138];
        if (class704.field9884 == null || class704.field9884.length != this.field138) {
            class704.field9884 = new int[this.field138];
            class707.field9960 = new int[this.field138];
            class624.field8737 = new int[this.field138];
            class21.field226 = new int[this.field138];
            class531.field7562 = new int[this.field138];
        }
        for (int var6 = 0; var6 < this.field133; var6++) {
            for (int var8 = 0; var8 < this.field138; var8++) {
                class704.field9884[var8] = 0;
                class21.field226[var8] = 0;
                class624.field8737[var8] = 0;
                class707.field9960[var8] = 0;
                class531.field7562[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field140; var9++) {
                for (int var10 = 0; var10 < this.field138; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field140 > var19) {
                        int var20 = this.field116[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class707 var21 = this.field134.method173(var20 - 1, arg3 + -16);
                            class704.field9884[var10] += var21.field9954;
                            class21.field226[var10] += var21.field9950;
                            class624.field8737[var10] += var21.field9957;
                            class707.field9960[var10] += var21.field9961;
                            var10002 = class531.field7562[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field116[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class707 var24 = this.field134.method173(var23 - 1, -106);
                            class704.field9884[var10] -= var24.field9954;
                            class21.field226[var10] -= var24.field9950;
                            class624.field8737[var10] -= var24.field9957;
                            class707.field9960[var10] -= var24.field9961;
                            var10002 = class531.field7562[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field138; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field138) {
                            var15 += class531.field7562[var17];
                            var11 += class704.field9884[var17];
                            var13 += class624.field8737[var17];
                            var12 += class21.field226[var17];
                            var14 += class707.field9960[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class704.field9884[var18];
                            var14 -= class707.field9960[var18];
                            var13 -= class624.field8737[var18];
                            var15 -= class531.field7562[var18];
                            var12 -= class21.field226[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class248.method1645(var11 * 256 / var14, -193, var13 / var15, var12 / var15);
                        }
                    }
                }
            }
            if (class57.field793) {
                this.method68(3, var6 == 0 ? arg0 : null, var5, class582.field8287[var6], var6 == 0 ? arg2 : null, arg1, var6);
            } else {
                this.method56(1, var6 == 0 ? arg2 : null, var6 == 0 ? arg0 : null, arg1, var5, var6, class582.field8287[var6]);
            }
            this.field116[var6] = null;
            this.field120[var6] = null;
            this.field127[var6] = null;
            this.field118[var6] = null;
        }
        if (arg3 != 4) {
            this.method60(-38, 73, -4, -73, 92);
        }
        if (!this.field122) {
            if (class681.field9446 != 0) {
                class8.method51();
            }
            if (class267.field3823) {
                class672.method3846();
            }
        }
        for (int var7 = 0; var7 < this.field133; var7++) {
            class582.field8287[var7].method972();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B[Ltea;Lrg;IIIIIII)V", line = 736)
    public final void method62(byte arg0, class240[] arg1, class645 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field115++;
        int var11 = (arg8 & 0x7) * 8;
        if (!this.field122) {
            class240 var12 = arg1[arg3];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class575.method3333(arg7, var13 & 0x7, var14 & 0x7, arg0 - 29316) + arg9;
                    int var16 = arg5 + class445.method2758(var13 & 0x7, var14 & 0x7, arg7, 7);
                    if (var15 > 0 && var15 < this.field140 - 1 && var16 > 0 && var16 < (this.field138 - 1)) {
                        var12.method1601(var15, -2097153, var16);
                    }
                }
            }
        }
        int var17 = (arg6 & 0x7) * 8;
        if (arg0 != 79) {
            return;
        }
        int var18 = (arg8 & 0xFFFFFFF8) << 3;
        int var19 = arg6 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg7 == 1) {
            var21 = 1;
        } else if (arg7 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg7 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field133; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg4 == var22 && var11 <= var23 && var11 + 8 >= var23 && var24 >= var17 && var24 <= var17 + 8) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                            if (arg7 == 0) {
                                var26 = arg5 - (var17 - var24);
                                var25 = var23 + arg9 - var11;
                            } else if (arg7 == 1) {
                                var26 = arg5 + 8 - (var23 - var11);
                                var25 = arg9 - (var17 - var24);
                            } else if (arg7 == 2) {
                                var25 = var11 + arg9 + 8 - var23;
                                var26 = arg5 + var17 + 8 - var24;
                            } else {
                                var26 = var23 + arg5 - var11;
                                var25 = var17 + arg9 + 8 - var24;
                            }
                            this.method67(true, 0, false, 0, var19 + var24, var26, var25, arg2, 0, var18 + var23, arg3);
                        } else {
                            var25 = class575.method3333(arg7, var23 & 0x7, var24 & 0x7, -29237) + arg9;
                            var26 = arg5 + class445.method2758(var23 & 0x7, var24 & 0x7, arg7, 7);
                            this.method67(false, arg7, false, var21, var19 + var24, var26, var25, arg2, var20, var18 + var23, arg3);
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
                                if (arg7 == 0) {
                                    var31 = var29 - (var11 - arg9);
                                    var32 = arg5 + var30 - var17;
                                } else if (arg7 == 1) {
                                    var31 = var30 + arg9 - var17;
                                    var32 = arg5 + var11 + 8 - var29;
                                } else if (arg7 == 2) {
                                    var32 = arg5 + var17 + 8 - var30;
                                    var31 = var11 + arg9 + 8 - var29;
                                } else {
                                    var31 = var17 + arg9 + 8 - var30;
                                    var32 = arg5 + var29 - var11;
                                }
                                if (var31 >= 0 && this.field140 > var31 && var32 >= 0 && var32 < this.field138) {
                                    this.field137[arg3][var31][var32] = this.field137[arg3][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method67(false, 0, false, 0, 0, -1, -1, arg2, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([[BI[Z[[BLed;IILha;ILrca;I[[BII)V", line = 944)
    private final void method63(byte[][] arg0, int arg1, boolean[] arg2, byte[][] arg3, class707 arg4, int arg5, int arg6, class60 arg7, int arg8, class456 arg9, int arg10, byte[][] arg11, int arg12, int arg13) {
        field144++;
        boolean[] var15 = arg9 != null && arg9.field6718 ? class575.field8146[arg12] : class166.field2623[arg12];
        if (arg5 > 0) {
            if (arg1 > 0) {
                int var16 = arg11[arg1 - 1][arg5 - 1] & 0xFF;
                if (var16 > 0) {
                    class456 var17 = this.field139.method3096(var16 - 1, (byte) 28);
                    if (var17.field6713 != -1 && var17.field6718) {
                        byte var18 = arg0[arg1 - 1][arg5 - 1];
                        int var19 = arg3[arg1 - 1][arg5 - 1] * 2 + 4 & 0x7;
                        int var20 = class573.method3316(arg7, var17, 0);
                        if (class359.field5217[var18][var19]) {
                            class547.field7813[0] = var17.field6713;
                            class279.field3950[0] = var20;
                            class412.field6196[0] = var17.field6728;
                            class222.field3260[0] = var17.field6732;
                            class448.field6623[0] = var17.field6726;
                            class67.field960[0] = 256;
                        }
                    }
                }
            }
            if (arg13 - 1 > arg1) {
                int var21 = arg11[arg1 + 1][arg5 - 1] & 0xFF;
                if (var21 > 0) {
                    class456 var22 = this.field139.method3096(var21 - 1, (byte) 28);
                    if (var22.field6713 != -1 && var22.field6718) {
                        byte var23 = arg0[arg1 + 1][arg5 - 1];
                        int var24 = arg3[arg1 + 1][arg5 - 1] * 2 + 6 & 0x7;
                        int var25 = class573.method3316(arg7, var22, 0);
                        if (class359.field5217[var23][var24]) {
                            class547.field7813[2] = var22.field6713;
                            class279.field3950[2] = var25;
                            class412.field6196[2] = var22.field6728;
                            class222.field3260[2] = var22.field6732;
                            class448.field6623[2] = var22.field6726;
                            class67.field960[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg5 < (arg8 - 1)) {
            if (arg1 > 0) {
                int var26 = arg11[arg1 - 1][arg5 + 1] & 0xFF;
                if (var26 > 0) {
                    class456 var27 = this.field139.method3096(var26 - 1, (byte) 28);
                    if (var27.field6713 != -1 && var27.field6718) {
                        byte var28 = arg0[arg1 - 1][arg5 + 1];
                        int var29 = arg3[arg1 - 1][arg5 + 1] * 2 + 2 & 0x7;
                        int var30 = class573.method3316(arg7, var27, 0);
                        if (class359.field5217[var28][var29]) {
                            class547.field7813[6] = var27.field6713;
                            class279.field3950[6] = var30;
                            class412.field6196[6] = var27.field6728;
                            class222.field3260[6] = var27.field6732;
                            class448.field6623[6] = var27.field6726;
                            class67.field960[6] = 64;
                        }
                    }
                }
            }
            if (arg1 < (arg13 - 1)) {
                int var31 = arg11[arg1 + 1][arg5 + 1] & 0xFF;
                if (var31 > 0) {
                    class456 var32 = this.field139.method3096(var31 - 1, (byte) 28);
                    if (var32.field6713 != -1 && var32.field6718) {
                        byte var33 = arg0[arg1 + 1][arg5 + 1];
                        int var34 = -(-(arg3[arg1 + 1][arg5 + 1] * 2)) & 0x7;
                        int var35 = class573.method3316(arg7, var32, 0);
                        if (class359.field5217[var33][var34]) {
                            class547.field7813[4] = var32.field6713;
                            class279.field3950[4] = var35;
                            class412.field6196[4] = var32.field6728;
                            class222.field3260[4] = var32.field6732;
                            class448.field6623[4] = var32.field6726;
                            class67.field960[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var36 = arg11[arg1][arg5 - 1] & 0xFF;
            if (var36 > 0) {
                class456 var37 = this.field139.method3096(var36 - 1, (byte) 28);
                if (var37.field6713 != -1) {
                    byte var38 = arg0[arg1][arg5 - 1];
                    byte var39 = arg3[arg1][arg5 - 1];
                    if (var37.field6718) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class573.method3316(arg7, var37, 0);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class359.field5217[var38][var41] && class448.field6623[var40] <= var37.field6726) {
                                class547.field7813[var40] = var37.field6713;
                                class279.field3950[var40] = var42;
                                class412.field6196[var40] = var37.field6728;
                                class222.field3260[var40] = var37.field6732;
                                if (class448.field6623[var40] == var37.field6726) {
                                    class67.field960[var40] = class625.method3600(class67.field960[var40], 32);
                                } else {
                                    class67.field960[var40] = 32;
                                }
                                class448.field6623[var40] = var37.field6726;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg10 & 0x3]) {
                            arg2[0] = class575.field8146[var38][class493.method2943(var39 + 2, 3)];
                        }
                    } else if (!var15[arg10 & 0x3]) {
                        arg2[0] = class166.field2623[var38][class493.method2943(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg5 < arg8 - 1) {
            int var44 = arg11[arg1][arg5 + 1] & 0xFF;
            if (var44 > 0) {
                class456 var45 = this.field139.method3096(var44 - 1, (byte) 28);
                if (var45.field6713 != -1) {
                    byte var46 = arg0[arg1][arg5 + 1];
                    byte var47 = arg3[arg1][arg5 + 1];
                    if (var45.field6718) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class573.method3316(arg7, var45, 0);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class359.field5217[var46][var49] && var45.field6726 >= class448.field6623[var48]) {
                                class547.field7813[var48] = var45.field6713;
                                class279.field3950[var48] = var50;
                                class412.field6196[var48] = var45.field6728;
                                class222.field3260[var48] = var45.field6732;
                                if (class448.field6623[var48] == var45.field6726) {
                                    class67.field960[var48] = class625.method3600(class67.field960[var48], 16);
                                } else {
                                    class67.field960[var48] = 16;
                                }
                                class448.field6623[var48] = var45.field6726;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg10 + 2 & 0x3]) {
                            arg2[2] = class575.field8146[var46][class493.method2943(-(-var47), 3)];
                        }
                    } else if (!var15[arg10 + 2 & 0x3]) {
                        arg2[2] = class166.field2623[var46][class493.method2943(var47, 3)];
                    }
                }
            }
        }
        if (arg1 > 0) {
            int var52 = arg11[arg1 - 1][arg5] & 0xFF;
            if (var52 > 0) {
                class456 var53 = this.field139.method3096(var52 - 1, (byte) 28);
                if (var53.field6713 != -1) {
                    byte var54 = arg0[arg1 - 1][arg5];
                    byte var55 = arg3[arg1 - 1][arg5];
                    if (var53.field6718) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class573.method3316(arg7, var53, 0);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class359.field5217[var54][var57] && var53.field6726 >= class448.field6623[var56]) {
                                class547.field7813[var56] = var53.field6713;
                                class279.field3950[var56] = var58;
                                class412.field6196[var56] = var53.field6728;
                                class222.field3260[var56] = var53.field6732;
                                if (class448.field6623[var56] == var53.field6726) {
                                    class67.field960[var56] = class625.method3600(class67.field960[var56], 8);
                                } else {
                                    class67.field960[var56] = 8;
                                }
                                class448.field6623[var56] = var53.field6726;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg10 + 3 & 0x3]) {
                            arg2[3] = class575.field8146[var54][class493.method2943(3, var55 + 1)];
                        }
                    } else if (!var15[arg10 + 3 & 0x3]) {
                        arg2[3] = class166.field2623[var54][class493.method2943(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg6 < 111) {
            this.method67(true, -50, true, 36, -52, -32, 79, null, -71, -12, 85);
        }
        if (arg1 < arg13 - 1) {
            int var60 = arg11[arg1 + 1][arg5] & 0xFF;
            if (var60 > 0) {
                class456 var61 = this.field139.method3096(var60 - 1, (byte) 28);
                if (var61.field6713 != -1) {
                    byte var62 = arg0[arg1 + 1][arg5];
                    byte var63 = arg3[arg1 + 1][arg5];
                    if (var61.field6718) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class573.method3316(arg7, var61, 0);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class359.field5217[var62][var65] && var61.field6726 >= class448.field6623[var64]) {
                                class547.field7813[var64] = var61.field6713;
                                class279.field3950[var64] = var66;
                                class412.field6196[var64] = var61.field6728;
                                class222.field3260[var64] = var61.field6732;
                                if (class448.field6623[var64] == var61.field6726) {
                                    class67.field960[var64] = class625.method3600(class67.field960[var64], 4);
                                } else {
                                    class67.field960[var64] = 4;
                                }
                                class448.field6623[var64] = var61.field6726;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg10 + 1 & 0x3]) {
                            arg2[1] = class575.field8146[var62][class493.method2943(var63 + 3, 3)];
                        }
                    } else if (!var15[arg10 + 1 & 0x3]) {
                        arg2[1] = class166.field2623[var62][class493.method2943(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg9 == null) {
            return;
        }
        int var68 = class573.method3316(arg7, arg9, 0);
        if (!arg9.field6718) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg10 * 2) & 0x7;
            if (class359.field5217[arg12][var69] && arg9.field6726 >= class448.field6623[var70]) {
                class547.field7813[var70] = arg9.field6713;
                class279.field3950[var70] = var68;
                class412.field6196[var70] = arg9.field6728;
                class222.field3260[var70] = arg9.field6732;
                if (class448.field6623[var70] == arg9.field6726) {
                    class67.field960[var70] = class625.method3600(class67.field960[var70], 2);
                } else {
                    class67.field960[var70] = 2;
                }
                class448.field6623[var70] = arg9.field6726;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIIIII)V", line = 1415)
    public final void method64(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field113++;
        if (!arg0) {
            this.field118 = null;
        }
        for (int var7 = arg5; var7 < (arg4 + arg5); var7++) {
            for (int var10 = arg2; var10 < arg2 + arg3; var10++) {
                if (var10 >= 0 && this.field140 > var10 && var7 >= 0 && this.field138 > var7) {
                    this.field137[arg1][var10][var7] = arg1 > 0 ? this.field137[arg1 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        if (arg2 > 0 && this.field140 > arg2) {
            for (int var8 = arg5 + 1; var8 < arg4 + arg5; var8++) {
                if (var8 >= 0 && this.field138 > var8) {
                    this.field137[arg1][arg2][var8] = this.field137[arg1][arg2 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < this.field138) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field140) {
                    this.field137[arg1][var9][arg5] = this.field137[arg1][var9][arg5 - 1];
                }
            }
        }
        if (arg2 < 0 || arg5 < 0 || this.field140 <= arg2 || arg5 >= this.field138) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 <= 0 || this.field137[arg1][arg2 - 1][arg5] == 0) {
                if (arg5 > 0 && this.field137[arg1][arg2][arg5 - 1] != 0) {
                    this.field137[arg1][arg2][arg5] = this.field137[arg1][arg2][arg5 - 1];
                    return;
                }
                if (arg2 > 0 && arg5 > 0 && this.field137[arg1][arg2 - 1][arg5 - 1] != 0) {
                    this.field137[arg1][arg2][arg5] = this.field137[arg1][arg2 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            this.field137[arg1][arg2][arg5] = this.field137[arg1][arg2 - 1][arg5];
        } else if (arg2 <= 0 || this.field137[arg1 - 1][arg2 - 1][arg5] == this.field137[arg1][arg2 - 1][arg5]) {
            if (arg5 > 0 && this.field137[arg1 - 1][arg2][arg5 - 1] != this.field137[arg1][arg2][arg5 - 1]) {
                this.field137[arg1][arg2][arg5] = this.field137[arg1][arg2][arg5 - 1];
                return;
            }
            if (arg2 > 0 && arg5 > 0 && this.field137[arg1 - 1][arg2 - 1][arg5 - 1] != this.field137[arg1][arg2 - 1][arg5 - 1]) {
                this.field137[arg1][arg2][arg5] = this.field137[arg1][arg2 - 1][arg5 - 1];
                return;
            }
        } else {
            this.field137[arg1][arg2][arg5] = this.field137[arg1][arg2 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBZIII)V", line = 1515)
    public static final void method65(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field125++;
        if (class80.field1136 == null) {
            class736.field10316.method482(arg4, -16777216, arg5, 1, arg0, arg3);
        } else if (class130.field1749.field8423 >= 0 && class130.field1749.field8423 < class194.field2946 * 512 && class130.field1749.field8428 >= 0 && class130.field1749.field8428 < class255.field3656 * 512) {
            class412.field6195++;
            if (class130.field1749 != null && (class130.field1749.field8423 + 256 - class130.field1749.method2579(false) * 256 >> 9) == class344.field4987 && (class130.field1749.field8428 + 256 - class130.field1749.method2579(false) * 256 >> 9) == class445.field6615) {
                class344.field4987 = -1;
                class445.field6615 = -1;
                class557.method3248((byte) -23);
            }
            class587.method3399((byte) -69);
            if (!arg2) {
                class602.method3495(true);
            }
            class2.method18(-95);
            class444.method2753(arg3, arg4, true, arg5, arg0, 2514);
            int var6 = class43.field471;
            int var7 = class548.field7826;
            int var8 = class622.field8734;
            int var9 = class191.field2890;
            class188.field2859 = class188.field2856;
            if (class264.field3784 == 1) {
                int var12 = (int) class418.field6261;
                if (class521.field7455 >> 8 > var12) {
                    var12 = class521.field7455 >> 8;
                }
                if (class251.field3626[4] && (class357.field5192[4] + 128) > var12) {
                    var12 = class357.field5192[4] + 128;
                }
                int var13 = (int) class255.field3659 + class378.field5721 & 0x3FFF;
                class455.method2786(var13, var12, class384.method2468(true, class130.field1749.field8423, class341.field4946, class130.field1749.field8428) - 200, class383.field5783, class398.field5951, (byte) -101, var7, (var12 >> 3) * 3 + 600 << 2);
            } else if (class264.field3784 == 4) {
                int var10 = (int) class418.field6261;
                if (var10 < class521.field7455 >> 8) {
                    var10 = class521.field7455 >> 8;
                }
                if (class251.field3626[4] && var10 < class357.field5192[4] + 128) {
                    var10 = class357.field5192[4] + 128;
                }
                int var11 = (int) class255.field3659 & 0x3FFF;
                class455.method2786(var11, var10, class384.method2468(true, class189.field2869, class341.field4946, class537.field7685) - 200, class383.field5783, class398.field5951, (byte) -101, var7, (var10 >> 3) * 3 + 600 << 2);
            } else if (class264.field3784 == 5) {
                class182.method1291(-1902766269, var7);
            }
            int var14 = class364.field5254;
            int var15 = class259.field3700;
            int var16 = class460.field6783;
            int var17 = class120.field1650;
            int var18 = class660.field9234;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class251.field3626[var19]) {
                    int var22 = (int) (Math.random() * (double) (class603.field8530[var19] * 2 + 1) + Math.sin((double) class227.field3330[var19] / 100.0D * (double) class602.field8518[var19]) * (double) class357.field5192[var19] - (double) class603.field8530[var19]);
                    if (var19 == 3) {
                        class660.field9234 = class660.field9234 + var22 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class460.field6783 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class259.field3700 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class120.field1650 += var22;
                        if (class120.field1650 < 1024) {
                            class120.field1650 = 1024;
                        } else if (class120.field1650 > 3072) {
                            class120.field1650 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class364.field5254 += var22 << 2;
                    }
                }
            }
            if (class364.field5254 < 0) {
                class364.field5254 = 0;
            }
            if (((class34.field356 << 9) - 1) < class364.field5254) {
                class364.field5254 = (class34.field356 << 9) - 1;
            }
            if (class460.field6783 < 0) {
                class460.field6783 = 0;
            }
            if (arg1 < -88) {
                if (class460.field6783 > (class565.field8040 << 9) - 1) {
                    class460.field6783 = (class565.field8040 << 9) - 1;
                }
                class367.method2265((byte) -65);
                class497.method2958((byte) -107);
                class736.field10316.method476(var6, var9, var6 + var8, var9 - -var7);
                class120.method867(104, true);
                if (class419.field6265) {
                    class307.method1937(-6830, class281.field3978);
                    if (class296.field4212 != class188.field2859) {
                        class226.field3323 = true;
                    }
                    class296.field4212 = class188.field2859;
                } else {
                    class736.field10316.method444();
                    int var20 = class281.field3978;
                    if (class704.field9842 == null) {
                        class736.field10316.method502(var20);
                    } else {
                        class704.field9842.method2669(class120.field1650, var9, var20, var8, class736.field10316, var6, class660.field9234, var7, 1, class291.field4170 << 3);
                    }
                }
                class290.method1858((byte) 119);
                class124.field1673.method775(class364.field5254, class259.field3700, class460.field6783, -class120.field1650 & 0x3FFF, -class660.field9234 & 0x3FFF, -class253.field3649 & 0x3FFF);
                class736.field10316.method534(class124.field1673);
                class736.field10316.method500(var8 / 2 + var6, var7 / 2 + var9, class309.field4384 << 1, class309.field4384 << 1);
                class19.method107(var7 / 2 + var9, class309.field4384 << 1, class309.field4384 << 1, var6 + (var8 / 2), (byte) 125);
                class430.method2676(-class253.field3649 & 0x3FFF, (byte) -123, class259.field3700, -class660.field9234 & 0x3FFF, class460.field6783, class364.field5254, -class120.field1650 & 0x3FFF);
                byte var21 = class63.field916.field10203.method3093(17503) == 2 ? (byte) class412.field6195 : 1;
                if (class419.field6265) {
                    class289.method1839(-class660.field9234 & 0x3FFF, -class120.field1650 & 0x3FFF, -class253.field3649 & 0x3FFF, 0);
                    class274.method1734(var21, class193.field2931, class259.field3700, class188.field2859, class460.field6783, class375.field5687, class364.field5254, true, class130.field1749.field8429 + 1, class130.field1749.field8428 >> 9, class421.field6281, class242.field3535, class640.field8989, -1, class130.field1749.field8423 >> 9, class238.field3469, class357.field5189, class63.field916.field10170.method3053(17503) == 0);
                } else {
                    class142.method987(class357.field5189, class364.field5254, class259.field3700, class460.field6783, class238.field3469, class193.field2931, class640.field8989, class375.field5687, class421.field6281, class242.field3535, class130.field1749.field8429 + 1, var21, class130.field1749.field8423 >> 9, class130.field1749.field8428 >> 9, class63.field916.field10170.method3053(17503) == 0, true, class418.field6258 ? class188.field2859 : -1, 0, false);
                }
                class290.method1858((byte) 52);
                if (class87.field1246 == 10) {
                    class587.method3398(256, var6, (byte) 85, var8, var9, var7, 256);
                    class352.method2214(256, var8, var9, var7, var6, 256, 120);
                    class88.method717(256, var8, var9, (byte) -39, var7, var6, 256);
                    class333.method2099(-124, var6, var8, var9, var7);
                }
                class356.method2228();
                class364.field5254 = var14;
                class120.field1650 = var17;
                class460.field6783 = var16;
                class660.field9234 = var18;
                class259.field3700 = var15;
                if (class136.field1814 && class115.field1594.method13((byte) 114) == 0) {
                    class136.field1814 = false;
                }
                if (class136.field1814) {
                    class736.field10316.method482(var6, -16777216, var8, 1, var9, var7);
                    class310.method1960(false, class430.field6382.method2679(class650.field9160, 85), class55.field764, class358.field5201, (byte) -124, class736.field10316);
                }
                class120.method867(95, false);
            }
        } else {
            class736.field10316.method482(arg4, -16777216, arg5, 1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[[[I[Ltea;Lha;)V", line = 1737)
    public final void method66(int arg0, int[][][] arg1, class240[] arg2, class60 arg3) {
        if (!this.field122) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field140; var6++) {
                    for (int var7 = 0; var7 < this.field138; var7++) {
                        if ((class60.field847[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class60.field847[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method1595(var7, var6, (byte) -126);
                            }
                        }
                    }
                }
            }
        }
        field131++;
        for (int var9 = 0; var9 < this.field133; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field122) {
                if (class579.field8242) {
                    var11 |= 0x8;
                }
                if (class267.field3823) {
                    var10 |= 0x2;
                }
                if (class681.field9446 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class165.field2607) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class267.field3823) {
                var11 |= 0x7;
            }
            if (!class209.field3068) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || arg1.length <= var9 ? this.field137[var9] : arg1[var9];
            class310.method1964(var9, arg3.method477(this.field140, this.field138, this.field137[var9], var12, 512, var10, var11));
        }
        if (arg0 != 8) {
            field135 = 106;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIZIIIILrg;III)V", line = 1834)
    private final void method67(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class645 arg7, int arg8, int arg9, int arg10) {
        if (arg1 == 1) {
            arg3 = 1;
        } else if (arg1 == 2) {
            arg8 = 1;
            arg3 = 1;
        } else if (arg1 == 3) {
            arg8 = 1;
        }
        field117++;
        if (arg2) {
            return;
        }
        if (arg6 < 0 || this.field140 <= arg6 || arg5 < 0 || arg5 >= this.field138) {
            while (true) {
                int var14 = arg7.method3745(-6314);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method3745(-6314);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method3745(-6314);
                }
            }
        }
        if (!this.field122 && !arg0) {
            class60.field847[arg10][arg6][arg5] = 0;
        }
        while (true) {
            int var12 = arg7.method3745(-6314);
            if (var12 == 0) {
                if (this.field122) {
                    this.field137[0][arg6 + arg8][arg3 + arg5] = 0;
                    return;
                } else if (arg10 == 0) {
                    this.field137[0][arg6 + arg8][arg3 + arg5] = -class492.method2937(arg4 + 556238, arg9 + 932731, (byte) -94) * 8 << 2;
                    return;
                } else {
                    this.field137[arg10][arg6 + arg8][arg3 + arg5] = this.field137[arg10 - 1][arg6 + arg8][arg3 + arg5] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method3745(-6314);
                if (this.field122) {
                    this.field137[0][arg6 + arg8][arg3 + arg5] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg10 == 0) {
                    this.field137[0][arg6 + arg8][arg5 + arg3] = -var13 * 8 << 2;
                    return;
                }
                this.field137[arg10][arg6 + arg8][arg5 + arg3] = this.field137[arg10 - 1][arg6 + arg8][arg3 + arg5] - (var13 * 8 << 2);
                return;
            }
            if (var12 <= 49) {
                if (arg0) {
                    arg7.method3745(-6314);
                } else {
                    this.field120[arg10][arg6][arg5] = arg7.method3743(!arg2);
                    this.field127[arg10][arg6][arg5] = (byte) ((var12 - 2) / 4);
                    this.field118[arg10][arg6][arg5] = (byte) class493.method2943(3, var12 + arg1 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field122 && !arg0) {
                    class60.field847[arg10][arg6][arg5] = (byte) (var12 - 49);
                }
            } else if (!arg0) {
                this.field116[arg10][arg6][arg5] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIZLhl;Ltfa;)V", line = 2852)
    public class9(int arg0, int arg1, int arg2, boolean arg3, class530 arg4, class34 arg5) {
        this.field133 = arg0;
        this.field139 = arg4;
        this.field134 = arg5;
        this.field122 = arg3;
        this.field140 = arg1;
        this.field138 = arg2;
        this.field127 = new byte[this.field133][this.field140][this.field138];
        this.field137 = new int[this.field133][this.field140 + 1][this.field138 + 1];
        this.field120 = new byte[this.field133][this.field140][this.field138];
        this.field116 = new byte[this.field133][this.field140][this.field138];
        this.field119 = new byte[this.field133][this.field140 + 1][this.field138 + 1];
        this.field118 = new byte[this.field133][this.field140][this.field138];
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILs;[[ILs;Ls;Lha;I)V", line = 1968)
    private final void method68(int arg0, class280 arg1, int[][] arg2, class280 arg3, class280 arg4, class60 arg5, int arg6) {
        field114++;
        byte[][] var8 = this.field127[arg6];
        byte[][] var9 = this.field118[arg6];
        byte[][] var10 = this.field116[arg6];
        byte[][] var11 = this.field120[arg6];
        if (arg0 != 3) {
            return;
        }
        for (int var12 = 0; var12 < this.field140; var12++) {
            int var13 = var12 >= (this.field140 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field138; var14++) {
                int var15 = (this.field138 - 1) <= var14 ? var14 : var14 + 1;
                if (class218.field3213 == -1 || class46.method350(class218.field3213, 25380, var14, arg6, var12)) {
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
                        class456 var26 = var21 == 0 ? null : this.field139.method3096(var21 - 1, (byte) 28);
                        class707 var27 = var22 == 0 ? null : this.field134.method173(var22 - 1, arg0 ^ 0x7C);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class456 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6713 == -1 && var26.field6721 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6718;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field140 && this.field138 > var14) {
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
                                var35--;
                                var33--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
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
                                var37 = arg3.method1787(var12, 19646, var14) - arg3.method1787(var13, 19646, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method1787(var13, 19646, var14) - arg3.method1787(var12, 19646, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class448.field6623[var39] = -1;
                            class67.field960[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6718 ? class575.field8146[var19] : class166.field2623[var19];
                        this.method63(var8, var12, var18, var9, var27, var14, 118, arg5, this.field138, var26, var20, var11, var19, this.field140);
                        boolean var41 = var26 != null && var26.field6721 != var26.field6713;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class448.field6623[var42] >= 0 && class547.field7813[var42] != class279.field3950[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class356.method2230(var18[1], class493.method2943(class67.field960[4], class67.field960[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class356.method2230(var18[3], class493.method2943(class67.field960[6], class67.field960[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class356.method2230(var18[0], class493.method2943(class67.field960[2], class67.field960[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class356.method2230(var18[2], class493.method2943(class67.field960[4], class67.field960[6]) == 0);
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
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = class424.field6303[var19];
                            var46 = var26 == null ? 0 : class290.field4148[var19];
                            var47 = var27 == null ? 0 : class371.field5326[var19];
                            var48 = class434.field6464[var19];
                            var49 = class72.field1018[var19];
                        } else if (var17) {
                            var49 = class37.field375[var19];
                            var48 = class376.field5695[var19];
                            var44 = class471.field6867[var19];
                            var46 = var26 == null ? 0 : class748.field10466[var19];
                            var45 = class438.field6496[var19];
                            var47 = var27 == null ? 0 : class611.field8640[var19];
                        } else {
                            var48 = class46.field606[var19];
                            var45 = class632.field8839[var19];
                            var44 = class712.field10050[var19];
                            var46 = var26 == null ? 0 : class320.field4526[var19];
                            var47 = var27 == null ? 0 : class483.field6966[var19];
                            var49 = class397.field5949[var19];
                        }
                        int var50 = var46 + var47;
                        if (var50 <= 0) {
                            class252.method1660(arg6, var12, var14);
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
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg4 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field6732;
                                var63 = var26.field6728;
                                var62 = var26.field6713;
                                int var65 = class573.method3316(arg5, var26, 0);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = 1;
                                        class186.field2836[2] = var49[var51];
                                        class186.field2836[3] = 1;
                                        class186.field2836[4] = var48[var51];
                                        var68 = 6;
                                        class186.field2836[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = 5;
                                        class186.field2836[2] = var49[var51];
                                        class186.field2836[3] = 5;
                                        class186.field2836[4] = var48[var51];
                                        var68 = 6;
                                        class186.field2836[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = 3;
                                        class186.field2836[2] = var49[var51];
                                        class186.field2836[3] = 3;
                                        class186.field2836[4] = var48[var51];
                                        var68 = 6;
                                        class186.field2836[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = 7;
                                        class186.field2836[2] = var49[var51];
                                        class186.field2836[3] = 7;
                                        class186.field2836[4] = var48[var51];
                                        class186.field2836[5] = var49[var51];
                                        var68 = 6;
                                    } else {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = var48[var51];
                                        var68 = 3;
                                        class186.field2836[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class186.field2836[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field128[var70];
                                        int var73 = this.field130[var70];
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
                                            var75 = var72;
                                            var74 = var73;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class359.field5217[var19][var70]) {
                                            int var76 = (var12 << 9) + var75;
                                            int var77 = (var14 << 9) + var74;
                                            var60[var52] = arg1.method1786(var77, (byte) 113, var76) - arg3.method1786(var77, (byte) 113, var76);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class359.field5217[var19][var70]) {
                                                int var78 = (var12 << 9) + var75;
                                                int var79 = (var14 << 9) + var74;
                                                var61[var52] = arg3.method1786(var79, (byte) 113, var78) - arg1.method1786(var79, (byte) 113, var78);
                                            } else if (arg4 != null && !class740.field10374[var19][var70]) {
                                                int var80 = (var12 << 9) + var75;
                                                int var81 = (var14 << 9) + var74;
                                                var61[var52] = arg4.method1786(var81, (byte) 113, var80) - arg3.method1786(var81, (byte) 113, var80);
                                            }
                                        }
                                        if (var70 < 8 && var26.field6726 < class448.field6623[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class279.field3950[var71];
                                            }
                                            var59[var52] = class222.field3260[var71];
                                            var58[var52] = class412.field6196[var71];
                                            var57[var52] = class547.field7813[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field6728;
                                            var59[var52] = var26.field6732;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field122 && arg6 == 0) {
                                    class506.method3002(var12, var14, var26.field6715, var26.field6733 * 8, var26.field6736);
                                }
                                if (var19 != 12 && var26.field6713 != -1 && var26.field6720) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class290.field4148[var19];
                            } else if (var17) {
                                var51 += class748.field10466[var19];
                            } else {
                                var51 += class320.field4526[var19];
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
                                class707 var82 = this.field134.method173(var22 - 1, 125);
                                class707 var83 = this.field134.method173(var23 - 1, 124);
                                class707 var84 = this.field134.method173(var24 - 1, arg0 + -88);
                                class707 var85 = this.field134.method173(var25 - 1, 7);
                                for (int var86 = 0; var86 < var47; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = 1;
                                        class186.field2836[2] = var49[var51];
                                        class186.field2836[3] = 1;
                                        class186.field2836[4] = var48[var51];
                                        class186.field2836[5] = var49[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = 5;
                                        class186.field2836[2] = var49[var51];
                                        class186.field2836[3] = 5;
                                        class186.field2836[4] = var48[var51];
                                        var88 = 6;
                                        class186.field2836[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = 3;
                                        class186.field2836[2] = var49[var51];
                                        class186.field2836[3] = 3;
                                        class186.field2836[4] = var48[var51];
                                        class186.field2836[5] = var49[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = 7;
                                        class186.field2836[2] = var49[var51];
                                        class186.field2836[3] = 7;
                                        class186.field2836[4] = var48[var51];
                                        var88 = 6;
                                        class186.field2836[5] = var49[var51];
                                    } else {
                                        class186.field2836[0] = var45[var51];
                                        class186.field2836[1] = var48[var51];
                                        var88 = 3;
                                        class186.field2836[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class186.field2836[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field128[var90];
                                        int var93 = this.field130[var90];
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
                                            var94 = var93;
                                            var95 = var92;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class359.field5217[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg1.method1786(var97, (byte) 113, var96) - arg3.method1786(var97, (byte) 113, var96);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class359.field5217[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg3.method1786(var99, (byte) 113, var98) - arg1.method1786(var99, (byte) 113, var98);
                                            } else if (arg4 != null && !class740.field10374[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg4.method1786(var101, (byte) 113, var100) - arg3.method1786(var101, (byte) 113, var100);
                                            }
                                        }
                                        if (var90 < 8 && class448.field6623[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class279.field3950[var91];
                                            }
                                            var59[var52] = class222.field3260[var91];
                                            var58[var52] = class412.field6196[var91];
                                            var57[var52] = class547.field7813[var91];
                                        } else {
                                            if (var17 && class359.field5217[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var82.field9964;
                                                var59[var52] = var82.field9963;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var83.field9964;
                                                var59[var52] = var83.field9963;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var84.field9964;
                                                var59[var52] = var84.field9963;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var85.field9964;
                                                var59[var52] = var85.field9963;
                                            } else {
                                                if (var95 < 256) {
                                                    if (var94 >= 256) {
                                                        var58[var52] = var83.field9964;
                                                        var59[var52] = var83.field9963;
                                                    } else {
                                                        var58[var52] = var82.field9964;
                                                        var59[var52] = var82.field9963;
                                                    }
                                                } else if (var94 >= 256) {
                                                    var58[var52] = var84.field9964;
                                                    var59[var52] = var84.field9963;
                                                } else {
                                                    var58[var52] = var85.field9964;
                                                    var59[var52] = var85.field9963;
                                                }
                                                int var102 = class159.method1170(arg2[var13][var14], var95 << 7 >> 9, arg2[var12][var14], 1);
                                                int var103 = class159.method1170(arg2[var13][var15], var95 << 7 >> 9, arg2[var12][var15], 1);
                                                var57[var52] = class159.method1170(var103, var94 << 7 >> 9, var102, class513.method3033(arg0, 2));
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field9962) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg3.method1787(var12, 19646, var14);
                            int var105 = arg3.method1787(var13, 19646, var14);
                            int var106 = arg3.method1787(var13, 19646, var15);
                            int var107 = arg3.method1787(var12, arg0 ^ 0x4CBD, var15);
                            boolean var108 = class286.method1827(var12, var14, (byte) -54);
                            if (var108 && arg6 > 1 || !var108 && arg6 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field9965) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field6717) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field119[arg6][var12][var14] = (byte) class625.method3600(this.field119[arg6][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field122) {
                                var110 = class303.method1912(var12, var14);
                                var111 = class311.method1966(var12, var14);
                                var112 = class466.method2829(var12, var14);
                            }
                            arg3.method974(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class252.method1660(arg6, var12, var14);
                        }
                    }
                }
            }
        }
    }
}
