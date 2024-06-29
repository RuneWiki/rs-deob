import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class289 {

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
    private int[] field3969 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
    private int[] field3974 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lfb;")
    private class627 field3971;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lew;")
    private class456 field3965;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "Z")
    public boolean field3981;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[[[B")
    private byte[][][] field3975;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[[[B")
    private byte[][][] field3962;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[[[B")
    public byte[][][] field3964;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[[[B")
    private byte[][][] field3968;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[[[B")
    private byte[][][] field3980;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "[[[I")
    public int[][][] field3989;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field3966 = -1;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3961 = -1;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Lem;")
    public static class206 field3982 = new class206(116, 3);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lin;")
    public static class78 field3960;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "[[[B")
    public byte[][][] field3983;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[[II)V", line = 4)
    public final void method1772(int arg0, int[][] arg1, int arg2) {
        field3972++;
        int[][] var4 = this.field3989[arg0];
        if (arg2 != -65) {
            return;
        }
        for (int var5 = 0; var5 < this.field3986 + 1; var5++) {
            for (int var6 = 0; var6 < this.field3976 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLi;Li;Lr;)V", line = 34)
    public final void method1773(byte arg0, class37 arg1, class37 arg2, class166 arg3) {
        field3970++;
        int[][] var5 = new int[this.field3986][this.field3976];
        if (arg0 > -74) {
            method1779(false, 121, 14);
        }
        if (class550.field7436 == null || class550.field7436.length != this.field3976) {
            class285.field3925 = new int[this.field3976];
            class660.field9176 = new int[this.field3976];
            class550.field7436 = new int[this.field3976];
            class51.field602 = new int[this.field3976];
            class184.field2667 = new int[this.field3976];
        }
        for (int var6 = 0; var6 < this.field3985; var6++) {
            for (int var8 = 0; var8 < this.field3976; var8++) {
                class550.field7436[var8] = 0;
                class51.field602[var8] = 0;
                class660.field9176[var8] = 0;
                class285.field3925[var8] = 0;
                class184.field2667[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3986; var9++) {
                for (int var10 = 0; var10 < this.field3976; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field3986 > var19) {
                        int var20 = this.field3980[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class386 var21 = this.field3971.method3501((byte) -121, var20 - 1);
                            class550.field7436[var10] += var21.field5475;
                            class51.field602[var10] += var21.field5462;
                            class660.field9176[var10] += var21.field5467;
                            class285.field3925[var10] += var21.field5468;
                            var10002 = class184.field2667[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3980[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class386 var24 = this.field3971.method3501((byte) -122, var23 - 1);
                            class550.field7436[var10] -= var24.field5475;
                            class51.field602[var10] -= var24.field5462;
                            class660.field9176[var10] -= var24.field5467;
                            class285.field3925[var10] -= var24.field5468;
                            var10002 = class184.field2667[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3976; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field3976) {
                            var11 += class550.field7436[var17];
                            var13 += class660.field9176[var17];
                            var15 += class184.field2667[var17];
                            var14 += class285.field3925[var17];
                            var12 += class51.field602[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class550.field7436[var18];
                            var13 -= class660.field9176[var18];
                            var14 -= class285.field3925[var18];
                            var12 -= class51.field602[var18];
                            var15 -= class184.field2667[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class664.method3756(var11 * 256 / var14, var13 / var15, var12 / var15, 4);
                        }
                    }
                }
            }
            if (class20.field235) {
                this.method1776(var5, -26624, var6, var6 == 0 ? arg2 : null, arg3, var6 == 0 ? arg1 : null, class409.field5812[var6]);
            } else {
                this.method1782(var5, class409.field5812[var6], (byte) -93, arg3, var6 == 0 ? arg2 : null, var6 == 0 ? arg1 : null, var6);
            }
            this.field3980[var6] = null;
            this.field3975[var6] = null;
            this.field3968[var6] = null;
            this.field3962[var6] = null;
        }
        if (!this.field3981) {
            if (class332.field4479 != 0) {
                class185.method1273();
            }
            if (class588.field8262) {
                class274.method1708();
            }
        }
        for (int var7 = 0; var7 < this.field3985; var7++) {
            class409.field5812[var7].method325();
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[[BI[[B[[BIILko;B[ZLr;ILij;)V", line = 212)
    private final void method1774(int arg0, int arg1, byte[][] arg2, int arg3, byte[][] arg4, byte[][] arg5, int arg6, int arg7, class466 arg8, byte arg9, boolean[] arg10, class166 arg11, int arg12, class386 arg13) {
        field3977++;
        int var15 = -88 / ((arg9 + 3) / 62);
        boolean[] var16 = arg8 != null && arg8.field6398 ? class107.field1490[arg0] : class140.field1987[arg0];
        if (arg3 > 0) {
            if (arg6 > 0) {
                int var17 = arg5[arg6 - 1][arg3 - 1] & 0xFF;
                if (var17 > 0) {
                    class466 var18 = this.field3965.method2601(var17 - 1, 4);
                    if (var18.field6403 != -1 && var18.field6398) {
                        byte var19 = arg4[arg6 - 1][arg3 - 1];
                        int var20 = arg2[arg6 - 1][arg3 - 1] * 2 + 4 & 0x7;
                        int var21 = class652.method3675(arg11, 102, var18);
                        if (class366.field4889[var19][var20]) {
                            class298.field4070[0] = var18.field6403;
                            class474.field6522[0] = var21;
                            class266.field3610[0] = var18.field6399;
                            class143.field2059[0] = var18.field6410;
                            class303.field4214[0] = var18.field6404;
                            class456.field6328[0] = 256;
                        }
                    }
                }
            }
            if (arg7 - 1 > arg6) {
                int var22 = arg5[arg6 + 1][arg3 - 1] & 0xFF;
                if (var22 > 0) {
                    class466 var23 = this.field3965.method2601(var22 - 1, 4);
                    if (var23.field6403 != -1 && var23.field6398) {
                        byte var24 = arg4[arg6 + 1][arg3 - 1];
                        int var25 = arg2[arg6 + 1][arg3 - 1] * 2 + 6 & 0x7;
                        int var26 = class652.method3675(arg11, 115, var23);
                        if (class366.field4889[var24][var25]) {
                            class298.field4070[2] = var23.field6403;
                            class474.field6522[2] = var26;
                            class266.field3610[2] = var23.field6399;
                            class143.field2059[2] = var23.field6410;
                            class303.field4214[2] = var23.field6404;
                            class456.field6328[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg3 < (arg1 - 1)) {
            if (arg6 > 0) {
                int var27 = arg5[arg6 - 1][arg3 + 1] & 0xFF;
                if (var27 > 0) {
                    class466 var28 = this.field3965.method2601(var27 - 1, 4);
                    if (var28.field6403 != -1 && var28.field6398) {
                        byte var29 = arg4[arg6 - 1][arg3 + 1];
                        int var30 = arg2[arg6 - 1][arg3 + 1] * 2 + 2 & 0x7;
                        int var31 = class652.method3675(arg11, -86, var28);
                        if (class366.field4889[var29][var30]) {
                            class298.field4070[6] = var28.field6403;
                            class474.field6522[6] = var31;
                            class266.field3610[6] = var28.field6399;
                            class143.field2059[6] = var28.field6410;
                            class303.field4214[6] = var28.field6404;
                            class456.field6328[6] = 64;
                        }
                    }
                }
            }
            if (arg7 - 1 > arg6) {
                int var32 = arg5[arg6 + 1][arg3 + 1] & 0xFF;
                if (var32 > 0) {
                    class466 var33 = this.field3965.method2601(var32 - 1, 4);
                    if (var33.field6403 != -1 && var33.field6398) {
                        byte var34 = arg4[arg6 + 1][arg3 + 1];
                        int var35 = arg2[arg6 + 1][arg3 + 1] * 2 & 0x7;
                        int var36 = class652.method3675(arg11, 117, var33);
                        if (class366.field4889[var34][var35]) {
                            class298.field4070[4] = var33.field6403;
                            class474.field6522[4] = var36;
                            class266.field3610[4] = var33.field6399;
                            class143.field2059[4] = var33.field6410;
                            class303.field4214[4] = var33.field6404;
                            class456.field6328[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var37 = arg5[arg6][arg3 - 1] & 0xFF;
            if (var37 > 0) {
                class466 var38 = this.field3965.method2601(var37 - 1, 4);
                if (var38.field6403 != -1) {
                    byte var39 = arg4[arg6][arg3 - 1];
                    byte var40 = arg2[arg6][arg3 - 1];
                    if (var38.field6398) {
                        int var41 = 2;
                        int var42 = (var40 * 2) + 4;
                        int var43 = class652.method3675(arg11, -27, var38);
                        for (int var44 = 0; var44 < 3; var44++) {
                            var42 &= 0x7;
                            var41 &= 0x7;
                            if (class366.field4889[var39][var42] && class303.field4214[var41] <= var38.field6404) {
                                class298.field4070[var41] = var38.field6403;
                                class474.field6522[var41] = var43;
                                class266.field3610[var41] = var38.field6399;
                                class143.field2059[var41] = var38.field6410;
                                if (class303.field4214[var41] == var38.field6404) {
                                    class456.field6328[var41] = class647.method3617(class456.field6328[var41], 32);
                                } else {
                                    class456.field6328[var41] = 32;
                                }
                                class303.field4214[var41] = var38.field6404;
                            }
                            var41--;
                            var42++;
                        }
                        if (!var16[arg12 & 0x3]) {
                            arg10[0] = class107.field1490[var39][class136.method950(var40 + 2, 3)];
                        }
                    } else if (!var16[-(-arg12) & 0x3]) {
                        arg10[0] = class140.field1987[var39][class136.method950(var40 + 2, 3)];
                    }
                }
            }
        }
        if (arg3 < (arg1 - 1)) {
            int var45 = arg5[arg6][arg3 + 1] & 0xFF;
            if (var45 > 0) {
                class466 var46 = this.field3965.method2601(var45 - 1, 4);
                if (var46.field6403 != -1) {
                    byte var47 = arg4[arg6][arg3 + 1];
                    byte var48 = arg2[arg6][arg3 + 1];
                    if (var46.field6398) {
                        int var49 = 4;
                        int var50 = var48 * 2 + 2;
                        int var51 = class652.method3675(arg11, 126, var46);
                        for (int var52 = 0; var52 < 3; var52++) {
                            var50 &= 0x7;
                            var49 &= 0x7;
                            if (class366.field4889[var47][var50] && class303.field4214[var49] <= var46.field6404) {
                                class298.field4070[var49] = var46.field6403;
                                class474.field6522[var49] = var51;
                                class266.field3610[var49] = var46.field6399;
                                class143.field2059[var49] = var46.field6410;
                                if (class303.field4214[var49] == var46.field6404) {
                                    class456.field6328[var49] = class647.method3617(class456.field6328[var49], 16);
                                } else {
                                    class456.field6328[var49] = 16;
                                }
                                class303.field4214[var49] = var46.field6404;
                            }
                            var49++;
                            var50--;
                        }
                        if (!var16[arg12 + 2 & 0x3]) {
                            arg10[2] = class107.field1490[var47][class136.method950(3, var48)];
                        }
                    } else if (!var16[arg12 + 2 & 0x3]) {
                        arg10[2] = class140.field1987[var47][class136.method950(-(-var48), 3)];
                    }
                }
            }
        }
        if (arg6 > 0) {
            int var53 = arg5[arg6 - 1][arg3] & 0xFF;
            if (var53 > 0) {
                class466 var54 = this.field3965.method2601(var53 - 1, 4);
                if (var54.field6403 != -1) {
                    byte var55 = arg4[arg6 - 1][arg3];
                    byte var56 = arg2[arg6 - 1][arg3];
                    if (var54.field6398) {
                        int var57 = 6;
                        int var58 = var56 * 2 + 4;
                        int var59 = class652.method3675(arg11, 118, var54);
                        for (int var60 = 0; var60 < 3; var60++) {
                            var57 &= 0x7;
                            var58 &= 0x7;
                            if (class366.field4889[var55][var58] && var54.field6404 >= class303.field4214[var57]) {
                                class298.field4070[var57] = var54.field6403;
                                class474.field6522[var57] = var59;
                                class266.field3610[var57] = var54.field6399;
                                class143.field2059[var57] = var54.field6410;
                                if (class303.field4214[var57] == var54.field6404) {
                                    class456.field6328[var57] = class647.method3617(class456.field6328[var57], 8);
                                } else {
                                    class456.field6328[var57] = 8;
                                }
                                class303.field4214[var57] = var54.field6404;
                            }
                            var57++;
                            var58--;
                        }
                        if (!var16[arg12 + 3 & 0x3]) {
                            arg10[3] = class107.field1490[var55][class136.method950(3, var56 + 1)];
                        }
                    } else if (!var16[arg12 + 3 & 0x3]) {
                        arg10[3] = class140.field1987[var55][class136.method950(var56 + 1, 3)];
                    }
                }
            }
        }
        if (arg6 < (arg7 - 1)) {
            int var61 = arg5[arg6 + 1][arg3] & 0xFF;
            if (var61 > 0) {
                class466 var62 = this.field3965.method2601(var61 - 1, 4);
                if (var62.field6403 != -1) {
                    byte var63 = arg4[arg6 + 1][arg3];
                    byte var64 = arg2[arg6 + 1][arg3];
                    if (var62.field6398) {
                        int var65 = 4;
                        int var66 = var64 * 2 + 6;
                        int var67 = class652.method3675(arg11, 114, var62);
                        for (int var68 = 0; var68 < 3; var68++) {
                            var66 &= 0x7;
                            var65 &= 0x7;
                            if (class366.field4889[var63][var66] && var62.field6404 >= class303.field4214[var65]) {
                                class298.field4070[var65] = var62.field6403;
                                class474.field6522[var65] = var67;
                                class266.field3610[var65] = var62.field6399;
                                class143.field2059[var65] = var62.field6410;
                                if (class303.field4214[var65] == var62.field6404) {
                                    class456.field6328[var65] = class647.method3617(class456.field6328[var65], 4);
                                } else {
                                    class456.field6328[var65] = 4;
                                }
                                class303.field4214[var65] = var62.field6404;
                            }
                            var65--;
                            var66++;
                        }
                        if (!var16[arg12 + 1 & 0x3]) {
                            arg10[1] = class107.field1490[var63][class136.method950(3, var64 + 3)];
                        }
                    } else if (!var16[arg12 + 1 & 0x3]) {
                        arg10[1] = class140.field1987[var63][class136.method950(3, var64 + 3)];
                    }
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var69 = class652.method3675(arg11, 124, arg8);
        if (!arg8.field6398) {
            return;
        }
        for (int var70 = 0; var70 < 8; var70++) {
            int var71 = var70 - (arg12 * 2) & 0x7;
            if (class366.field4889[arg0][var70] && class303.field4214[var71] <= arg8.field6404) {
                class298.field4070[var71] = arg8.field6403;
                class474.field6522[var71] = var69;
                class266.field3610[var71] = arg8.field6399;
                class143.field2059[var71] = arg8.field6410;
                if (class303.field4214[var71] == arg8.field6404) {
                    class456.field6328[var71] = class647.method3617(class456.field6328[var71], 2);
                } else {
                    class456.field6328[var71] = 2;
                }
                class303.field4214[var71] = arg8.field6404;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lac;II[Lnn;BII)V", line = 680)
    public final void method1775(class501 arg0, int arg1, int arg2, class380[] arg3, byte arg4, int arg5, int arg6) {
        field3984++;
        if (!this.field3981) {
            for (int var8 = 0; var8 < 4; var8++) {
                class380 var9 = arg3[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg2 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && var12 < this.field3986 && var13 >= 0 && this.field3976 > var13) {
                            var9.method2175(3, var12, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg2 + arg6;
        if (arg4 != -32) {
            return;
        }
        int var15 = arg1 + arg5;
        for (int var16 = 0; var16 < this.field3985; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1778(false, var15 + var18, var17 - -arg2, 0, 128, arg0, 0, arg1 + var18, var16, var14 + var17, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([[IIILi;Lr;Li;Li;)V", line = 760)
    private final void method1776(int[][] arg0, int arg1, int arg2, class37 arg3, class166 arg4, class37 arg5, class37 arg6) {
        field3967++;
        byte[][] var8 = this.field3968[arg2];
        byte[][] var9 = this.field3962[arg2];
        if (arg1 != -26624) {
            this.field3971 = null;
        }
        byte[][] var10 = this.field3980[arg2];
        byte[][] var11 = this.field3975[arg2];
        for (int var12 = 0; var12 < this.field3986; var12++) {
            int var13 = var12 >= this.field3986 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3976; var14++) {
                int var15 = var14 < (this.field3976 - 1) ? var14 + 1 : var14;
                if (class69.field933 == -1 || class659.method3701(class69.field933, arg2, var12, (byte) -51, var14)) {
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
                        class466 var26 = var21 == 0 ? null : this.field3965.method2601(var21 - 1, 4);
                        class386 var27 = var22 == 0 ? null : this.field3971.method3501((byte) -124, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class466 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6403 == -1 && var26.field6414 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6398;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field3986 > var12 && var14 < this.field3976) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var34--;
                                var32--;
                            }
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg6.method332(var14, 1, var12) - arg6.method332(var15, 1, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg6.method332(var14, 1, var13) - arg6.method332(var15, arg1 ^ 0xFFFF9801, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class303.field4214[var39] = -1;
                            class456.field6328[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6398 ? class107.field1490[var19] : class140.field1987[var19];
                        this.method1774(var19, this.field3976, var9, var14, var8, var11, var12, this.field3986, var26, (byte) 76, var18, arg4, var20, var27);
                        boolean var41 = var26 != null && var26.field6414 != var26.field6403;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class303.field4214[var42] >= 0 && class474.field6522[var42] != class298.field4070[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class556.method3117(var18[1], class136.method950(class456.field6328[4], class456.field6328[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class556.method3117(var18[3], class136.method950(class456.field6328[6], class456.field6328[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class556.method3117(var18[0], class136.method950(class456.field6328[2], class456.field6328[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class556.method3117(var18[2], class136.method950(class456.field6328[6], class456.field6328[4]) == 0);
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
                        int[] var46;
                        int var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var46 = class557.field7501[var19];
                            var49 = var27 == null ? 0 : class568.field8039[var19];
                            var45 = class599.field8365[var19];
                            var47 = var26 == null ? 0 : class497.field6755[var19];
                            var48 = class296.field4063[var19];
                        } else if (var17) {
                            var46 = class242.field3303[var19];
                            var45 = class589.field8269[var19];
                            var48 = class685.field9773[var19];
                            var44 = class7.field57[var19];
                            var49 = var27 == null ? 0 : class562.field7594[var19];
                            var47 = var26 == null ? 0 : class226.field3137[var19];
                        } else {
                            var45 = class131.field1889[var19];
                            var46 = class272.field3702[var19];
                            var47 = var26 == null ? 0 : class670.field9406[var19];
                            var48 = class270.field3698[var19];
                            var44 = class489.field6702[var19];
                            var49 = var27 == null ? 0 : class698.field9906[var19];
                        }
                        int var50 = var47 + var49;
                        if (var50 <= 0) {
                            class413.method2398(arg2, var12, var14);
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
                            int[] var61 = arg5 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field6403;
                                var64 = var26.field6410;
                                var63 = var26.field6399;
                                int var65 = class652.method3675(arg4, 105, var26);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = 1;
                                        class596.field8335[2] = var46[var51];
                                        class596.field8335[3] = 1;
                                        class596.field8335[4] = var45[var51];
                                        var68 = 6;
                                        class596.field8335[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = 5;
                                        class596.field8335[2] = var46[var51];
                                        class596.field8335[3] = 5;
                                        class596.field8335[4] = var45[var51];
                                        var68 = 6;
                                        class596.field8335[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = 3;
                                        class596.field8335[2] = var46[var51];
                                        class596.field8335[3] = 3;
                                        class596.field8335[4] = var45[var51];
                                        var68 = 6;
                                        class596.field8335[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = 7;
                                        class596.field8335[2] = var46[var51];
                                        class596.field8335[3] = 7;
                                        class596.field8335[4] = var45[var51];
                                        class596.field8335[5] = var46[var51];
                                        var68 = 6;
                                    } else {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = var45[var51];
                                        class596.field8335[2] = var46[var51];
                                        var68 = 3;
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class596.field8335[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field3969[var70];
                                        int var73 = this.field3974[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var75 = 512 - var73;
                                            var74 = 512 - var72;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 512 - var73;
                                        } else {
                                            var75 = var73;
                                            var74 = var72;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class366.field4889[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg5.method331(var77, (byte) 50, var76) - arg6.method331(var77, (byte) 50, var76);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class366.field4889[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg6.method331(var79, (byte) 50, var78) - arg5.method331(var79, (byte) 50, var78);
                                            } else if (arg3 != null && !class129.field1842[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg3.method331(var81, (byte) 50, var80) - arg6.method331(var81, (byte) 50, var80);
                                            }
                                        }
                                        if (var70 < 8 && var26.field6404 < class303.field4214[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class474.field6522[var71];
                                            }
                                            var59[var52] = class143.field2059[var71];
                                            var58[var52] = class266.field3610[var71];
                                            var57[var52] = class298.field4070[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field6399;
                                            var59[var52] = var26.field6410;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field3981 && arg2 == 0) {
                                    class6.method17(var12, var14, var26.field6413, var26.field6401 * 8, var26.field6411);
                                }
                                if (var19 != 12 && var26.field6403 != -1 && var26.field6397) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class497.field6755[var19];
                            } else if (var17) {
                                var51 += class226.field3137[var19];
                            } else {
                                var51 += class670.field9406[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class386 var82 = this.field3971.method3501((byte) -125, var22 - 1);
                                class386 var83 = this.field3971.method3501((byte) -127, var23 - 1);
                                class386 var84 = this.field3971.method3501((byte) -124, var24 - 1);
                                class386 var85 = this.field3971.method3501((byte) -127, var25 - 1);
                                for (int var86 = 0; var86 < var49; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = 1;
                                        class596.field8335[2] = var46[var51];
                                        class596.field8335[3] = 1;
                                        class596.field8335[4] = var45[var51];
                                        class596.field8335[5] = var46[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = 5;
                                        class596.field8335[2] = var46[var51];
                                        class596.field8335[3] = 5;
                                        class596.field8335[4] = var45[var51];
                                        var88 = 6;
                                        class596.field8335[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = 3;
                                        class596.field8335[2] = var46[var51];
                                        class596.field8335[3] = 3;
                                        class596.field8335[4] = var45[var51];
                                        var88 = 6;
                                        class596.field8335[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = 7;
                                        class596.field8335[2] = var46[var51];
                                        class596.field8335[3] = 7;
                                        class596.field8335[4] = var45[var51];
                                        class596.field8335[5] = var46[var51];
                                        var88 = 6;
                                    } else {
                                        class596.field8335[0] = var48[var51];
                                        class596.field8335[1] = var45[var51];
                                        var88 = 3;
                                        class596.field8335[2] = var46[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class596.field8335[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field3969[var90];
                                        int var93 = this.field3974[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var95 = 512 - var93;
                                            var94 = 512 - var92;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 512 - var93;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class366.field4889[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg5.method331(var97, (byte) 50, var96) - arg6.method331(var97, (byte) 50, var96);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class366.field4889[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg6.method331(var99, (byte) 50, var98) - arg5.method331(var99, (byte) 50, var98);
                                            } else if (arg3 != null && !class129.field1842[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg3.method331(var101, (byte) 50, var100) - arg6.method331(var101, (byte) 50, var100);
                                            }
                                        }
                                        if (var90 < 8 && class303.field4214[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class474.field6522[var91];
                                            }
                                            var59[var52] = class143.field2059[var91];
                                            var58[var52] = class266.field3610[var91];
                                            var57[var52] = class298.field4070[var91];
                                        } else {
                                            if (var17 && class366.field4889[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var82.field5473;
                                                var59[var52] = var82.field5466;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var83.field5473;
                                                var59[var52] = var83.field5466;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var84.field5473;
                                                var59[var52] = var84.field5466;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var85.field5473;
                                                var59[var52] = var85.field5466;
                                            } else {
                                                if (var94 < 256) {
                                                    if (var95 < 256) {
                                                        var58[var52] = var82.field5473;
                                                        var59[var52] = var82.field5466;
                                                    } else {
                                                        var58[var52] = var83.field5473;
                                                        var59[var52] = var83.field5466;
                                                    }
                                                } else if (var95 >= 256) {
                                                    var58[var52] = var84.field5473;
                                                    var59[var52] = var84.field5466;
                                                } else {
                                                    var58[var52] = var85.field5473;
                                                    var59[var52] = var85.field5466;
                                                }
                                                int var102 = class703.method3937(arg0[var12][var14], -41, arg0[var13][var14], var94 << 7 >> 9);
                                                int var103 = class703.method3937(arg0[var12][var15], arg1 ^ 0x67D5, arg0[var13][var15], var94 << 7 >> 9);
                                                var57[var52] = class703.method3937(var102, -63, var103, var95 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field5463) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg6.method332(var14, arg1 + 26625, var12);
                            int var105 = arg6.method332(var14, 1, var13);
                            int var106 = arg6.method332(var15, 1, var13);
                            int var107 = arg6.method332(var15, 1, var12);
                            boolean var108 = class467.method2640(var12, var14, (byte) 116);
                            if (var108 && arg2 > 1 || !var108 && arg2 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field5470) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field6405) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field3964[arg2][var12][var14] = (byte) class647.method3617(this.field3964[arg2][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field3981) {
                                var110 = class564.method3158(var12, var14);
                                var111 = class402.method2346(var12, var14);
                                var112 = class130.method921(var12, var14);
                            }
                            arg6.method323(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class413.method2398(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V", line = 1633)
    private final void method1777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3990++;
        for (int var7 = arg4; var7 < (arg2 + arg4); var7++) {
            for (int var10 = arg3; var10 < arg1 + arg3; var10++) {
                if (var10 >= 0 && this.field3986 > var10 && var7 >= 0 && this.field3976 > var7) {
                    this.field3989[arg0][var10][var7] = arg0 <= 0 ? 0 : this.field3989[arg0 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg3 > 0 && this.field3986 > arg3) {
            for (int var8 = arg4 + 1; var8 < arg2 + arg4; var8++) {
                if (var8 >= 0 && this.field3976 > var8) {
                    this.field3989[arg0][arg3][var8] = this.field3989[arg0][arg3 - 1][var8];
                }
            }
        }
        if (~arg4 < arg5 && arg4 < this.field3976) {
            for (int var9 = arg3 + 1; var9 < (arg1 + arg3); var9++) {
                if (var9 >= 0 && var9 < this.field3986) {
                    this.field3989[arg0][var9][arg4] = this.field3989[arg0][var9][arg4 - 1];
                }
            }
        }
        if (arg3 < 0 || arg4 < 0 || this.field3986 <= arg3 || arg4 >= this.field3976) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 > 0 && this.field3989[arg0][arg3 - 1][arg4] != 0) {
                this.field3989[arg0][arg3][arg4] = this.field3989[arg0][arg3 - 1][arg4];
                return;
            }
            if (arg4 > 0 && this.field3989[arg0][arg3][arg4 - 1] != 0) {
                this.field3989[arg0][arg3][arg4] = this.field3989[arg0][arg3][arg4 - 1];
                return;
            }
            if (arg3 > 0 && arg4 > 0 && this.field3989[arg0][arg3 - 1][arg4 - 1] != 0) {
                this.field3989[arg0][arg3][arg4] = this.field3989[arg0][arg3 - 1][arg4 - 1];
                return;
            }
        } else if (arg3 <= 0 || this.field3989[arg0 - 1][arg3 - 1][arg4] == this.field3989[arg0][arg3 - 1][arg4]) {
            if (arg4 > 0 && this.field3989[arg0 - 1][arg3][arg4 - 1] != this.field3989[arg0][arg3][arg4 - 1]) {
                this.field3989[arg0][arg3][arg4] = this.field3989[arg0][arg3][arg4 - 1];
                return;
            }
            if (arg3 > 0 && arg4 > 0 && this.field3989[arg0 - 1][arg3 - 1][arg4 - 1] != this.field3989[arg0][arg3 - 1][arg4 - 1]) {
                this.field3989[arg0][arg3][arg4] = this.field3989[arg0][arg3 - 1][arg4 - 1];
                return;
            }
            return;
        } else {
            this.field3989[arg0][arg3][arg4] = this.field3989[arg0][arg3 - 1][arg4];
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIILac;IIIII)V", line = 1730)
    private final void method1778(boolean arg0, int arg1, int arg2, int arg3, int arg4, class501 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4 != 128) {
            this.field3983 = null;
        }
        field3979++;
        if (arg10 == 1) {
            arg3 = 1;
        } else if (arg10 == 2) {
            arg6 = 1;
            arg3 = 1;
        } else if (arg10 == 3) {
            arg6 = 1;
        }
        if (arg2 < 0 || this.field3986 <= arg2 || arg7 < 0 || this.field3976 <= arg7) {
            while (true) {
                int var14 = arg5.method2874((byte) -75);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg5.method2874((byte) -75);
                    return;
                }
                if (var14 <= 49) {
                    arg5.method2874((byte) -75);
                }
            }
        }
        if (!this.field3981 && !arg0) {
            class492.field6720[arg8][arg2][arg7] = 0;
        }
        while (true) {
            int var12 = arg5.method2874((byte) -75);
            if (var12 == 0) {
                if (this.field3981) {
                    this.field3989[0][arg2 + arg6][arg3 + arg7] = 0;
                    return;
                } else if (arg8 == 0) {
                    this.field3989[0][arg2 + arg6][arg3 + arg7] = -class527.method2997(true, arg1 + 556238, arg9 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field3989[arg8][arg2 + arg6][arg3 + arg7] = this.field3989[arg8 - 1][arg2 + arg6][arg3 + arg7] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg5.method2874((byte) -75);
                if (!this.field3981) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg8 != 0) {
                        this.field3989[arg8][arg2 + arg6][arg3 + arg7] = this.field3989[arg8 - 1][arg2 + arg6][arg3 + arg7] - (var13 * 8 << 2);
                        return;
                    }
                    this.field3989[0][arg2 + arg6][arg3 + arg7] = -var13 * 8 << 2;
                    return;
                }
                this.field3989[0][arg2 + arg6][arg3 + arg7] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg0) {
                    arg5.method2874((byte) -75);
                } else {
                    this.field3975[arg8][arg2][arg7] = arg5.method2863(120);
                    this.field3968[arg8][arg2][arg7] = (byte) ((var12 - 2) / 4);
                    this.field3962[arg8][arg2][arg7] = (byte) class136.method950(arg10 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field3981 && !arg0) {
                    class492.field6720[arg8][arg2][arg7] = (byte) (var12 - 49);
                }
            } else if (!arg0) {
                this.field3980[arg8][arg2][arg7] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIZLew;Lfb;)V", line = 2521)
    public class289(int arg0, int arg1, int arg2, boolean arg3, class456 arg4, class627 arg5) {
        this.field3985 = arg0;
        this.field3971 = arg5;
        this.field3976 = arg2;
        this.field3965 = arg4;
        this.field3986 = arg1;
        this.field3981 = arg3;
        this.field3975 = new byte[this.field3985][this.field3986][this.field3976];
        this.field3962 = new byte[this.field3985][this.field3986][this.field3976];
        this.field3964 = new byte[this.field3985][this.field3986 + 1][this.field3976 + 1];
        this.field3968 = new byte[this.field3985][this.field3986][this.field3976];
        this.field3980 = new byte[this.field3985][this.field3986][this.field3976];
        this.field3989 = new int[this.field3985][this.field3986 + 1][this.field3976 + 1];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZII)Z", line = 1867)
    public static final boolean method1779(boolean arg0, int arg1, int arg2) {
        field3963++;
        if (arg0) {
            field3961 = 93;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lnn;[[[IBLr;)V", line = 1880)
    public final void method1780(class380[] arg0, int[][][] arg1, byte arg2, class166 arg3) {
        field3959++;
        if (!this.field3981) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3986; var6++) {
                    for (int var7 = 0; var7 < this.field3976; var7++) {
                        if ((class492.field6720[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class492.field6720[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method2184(var7, var6, 2097152);
                            }
                        }
                    }
                }
            }
        }
        int var9 = 0;
        if (arg2 != -64) {
            this.field3971 = null;
        }
        while (var9 < this.field3985) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3981) {
                if (class588.field8262) {
                    var10 |= 0x2;
                }
                if (class286.field3937) {
                    var11 |= 0x8;
                }
                if (class332.field4479 != 0) {
                    var10 |= 0x1;
                    if (class316.field4353 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class588.field8262) {
                var11 |= 0x7;
            }
            if (!class704.field9953) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || arg1.length <= var9 ? this.field3989[var9] : arg1[var9];
            class406.method2363(var9, arg3.method195(this.field3986, this.field3976, this.field3989[var9], var12, 512, var10, var11));
            var9++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII[Lnn;IILac;II)V", line = 1982)
    public final void method1781(int arg0, int arg1, int arg2, int arg3, class380[] arg4, int arg5, int arg6, class501 arg7, int arg8, int arg9) {
        field3988++;
        int var11 = (arg1 & 0x7) * 8;
        if (arg0 >= -10) {
            this.field3980 = null;
        }
        if (!this.field3981) {
            class380 var12 = arg4[arg2];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class216.method1391(var14 & 0x7, 116, arg3, var13 & 0x7) + arg9;
                    int var16 = class681.method3863((byte) 94, var13 & 0x7, var14 & 0x7, arg3) + arg8;
                    if (var15 > 0 && var15 < this.field3986 - 1 && var16 > 0 && var16 < (this.field3976 - 1)) {
                        var12.method2175(3, var15, var16);
                    }
                }
            }
        }
        int var17 = (arg5 & 0x7) * 8;
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        int var19 = (arg5 & 0xFFFFFFF8) << 3;
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
        for (int var22 = 0; var22 < this.field3985; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 == var22 && var23 >= var11 && var11 + 8 >= var23 && var24 >= var17 && var24 <= (var17 + 8)) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                            if (arg3 == 0) {
                                var26 = var24 + arg8 - var17;
                                var25 = var23 + arg9 - var11;
                            } else if (arg3 == 1) {
                                var26 = var11 + arg8 + 8 - var23;
                                var25 = arg9 - (var17 - var24);
                            } else if (arg3 == 2) {
                                var25 = arg9 + var11 + 8 - var23;
                                var26 = var17 + arg8 + 8 - var24;
                            } else {
                                var26 = arg8 + var23 - var11;
                                var25 = arg9 + var17 + 8 - var24;
                            }
                            this.method1778(true, var19 + var24, var25, 0, 128, arg7, 0, var26, arg2, var18 + var23, 0);
                        } else {
                            var25 = arg9 + class216.method1391(var24 & 0x7, 103, arg3, var23 & 0x7);
                            var26 = arg8 + class681.method3863((byte) 94, var23 & 0x7, var24 & 0x7, arg3);
                            this.method1778(false, var19 + var24, var25, var21, 128, arg7, var20, var26, arg2, var18 + var23, arg3);
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
                                    var31 = var30 - (var17 - arg8);
                                    var32 = arg9 - (var11 - var29);
                                } else if (arg3 == 1) {
                                    var32 = var30 + arg9 - var17;
                                    var31 = var11 + arg8 + 8 - var29;
                                } else if (arg3 == 2) {
                                    var32 = arg9 + var11 + 8 - var29;
                                    var31 = -var30 - (-var17 - arg8 - 8);
                                } else {
                                    var32 = var17 - (var30 - (arg9 + 8));
                                    var31 = var29 + arg8 - var11;
                                }
                                if (var32 >= 0 && var32 < this.field3986 && var31 >= 0 && this.field3976 > var31) {
                                    this.field3989[arg2][var32][var31] = this.field3989[arg2][var20 + var25][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method1778(false, 0, -1, 0, 128, arg7, 0, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([[ILi;BLr;Li;Li;I)V", line = 2191)
    private final void method1782(int[][] arg0, class37 arg1, byte arg2, class166 arg3, class37 arg4, class37 arg5, int arg6) {
        field3973++;
        int var8 = 0;
        int var9 = -84 / ((arg2 - 55) / 57);
        while (this.field3986 > var8) {
            for (int var10 = 0; var10 < this.field3976; var10++) {
                if (class69.field933 == -1 || class659.method3701(class69.field933, arg6, var8, (byte) -51, var10)) {
                    byte var11 = this.field3968[arg6][var8][var10];
                    byte var12 = this.field3962[arg6][var8][var10];
                    int var13 = this.field3975[arg6][var8][var10] & 0xFF;
                    int var14 = this.field3980[arg6][var8][var10] & 0xFF;
                    class466 var15 = var13 == 0 ? null : this.field3965.method2601(var13 - 1, 4);
                    class386 var16 = var14 == 0 ? null : this.field3971.method3501((byte) -127, var14 - 1);
                    int var17 = 0;
                    int var18 = 0;
                    if (var11 != 0) {
                        var17 = var16 == null ? 0 : class568.field8039[var11];
                        var18 = var15 == null ? 0 : class497.field6755[var11];
                    } else if (var15 != null) {
                        var18 = class497.field6755[var11];
                    } else if (var16 != null) {
                        var17 = class497.field6755[var11];
                    }
                    int var19 = var18 + var17;
                    int var20 = 0;
                    if (var19 != 0) {
                        int var21;
                        if (class69.field928) {
                            var21 = var15 == null ? -1 : var15.field6399;
                        } else {
                            var21 = -1;
                        }
                        int[] var22 = new int[var19];
                        int[] var23 = new int[var19];
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        boolean var26 = false;
                        if (var15 == null || var15.field6403 == -1 && var15.field6414 == -1 && var21 == -1) {
                            for (int var28 = 0; var28 < var18; var28++) {
                                var22[var20] = -1;
                                var20++;
                            }
                        } else {
                            for (int var27 = 0; var27 < var18; var27++) {
                                var24[var20] = var21;
                                var25[var20] = var15.field6410;
                                if (var15.field6403 == -1) {
                                    var22[var20] = -1;
                                } else {
                                    var22[var20] = var15.field6403;
                                }
                                if (var15.field6414 == -1) {
                                    var23[var20] = -1;
                                } else {
                                    var23[var20] = var15.field6414;
                                    var26 = true;
                                }
                                var20++;
                            }
                            if (!this.field3981 && arg6 == 0) {
                                class6.method17(var8, var10, var15.field6413, var15.field6401 * 8, var15.field6411);
                            }
                        }
                        if (!var26) {
                            var23 = null;
                        }
                        if (var16 == null) {
                            for (int var29 = 0; var29 < var17; var29++) {
                                var22[var20] = -1;
                                var20++;
                            }
                        } else {
                            int var30 = var16.field5473;
                            if (class69.field928) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var17; var31++) {
                                var24[var20] = var30;
                                var25[var20] = var16.field5466;
                                var22[var20] = arg0[var8][var10];
                                if (var23 != null) {
                                    var23[var20] = -1;
                                }
                                var20++;
                            }
                        }
                        int var32 = this.field3969.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg5 == null ? null : new int[var32];
                        int[] var36 = arg5 == null && arg4 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var47 = this.field3969[var37];
                            int var48 = this.field3974[var37];
                            if (var12 == 0) {
                                var33[var37] = var47;
                                var34[var37] = var48;
                            } else if (var12 == 1) {
                                var33[var37] = var48;
                                var34[var37] = 512 - var47;
                            } else if (var12 == 2) {
                                var33[var37] = 512 - var47;
                                var34[var37] = 512 - var48;
                            } else if (var12 == 3) {
                                var33[var37] = 512 - var48;
                                var34[var37] = var47;
                            }
                            if (var35 != null && class366.field4889[var11][var37]) {
                                int var51 = (var8 << 9) + var47;
                                int var52 = (var10 << 9) + var47;
                                var35[var37] = arg5.method331(var52, (byte) 50, var51) - arg1.method331(var52, (byte) 50, var51);
                            }
                            if (var36 != null) {
                                if (arg5 != null && !class366.field4889[var11][var37]) {
                                    int var53 = (var8 << 9) + var47;
                                    int var54 = (var10 << 9) + var47;
                                    var36[var37] = arg1.method331(var54, (byte) 50, var53) - arg5.method331(var54, (byte) 50, var53);
                                } else if (arg4 != null && !class129.field1842[var11][var37]) {
                                    int var55 = (var8 << 9) + var47;
                                    int var56 = (var10 << 9) + var47;
                                    var36[var37] = arg4.method331(var56, (byte) 50, var55) - arg1.method331(var56, (byte) 50, var55);
                                }
                            }
                        }
                        int var38 = arg1.method332(var10, 1, var8);
                        int var39 = arg1.method332(var10, 1, var8 + 1);
                        int var40 = arg1.method332(var10 + 1, 1, var8 + 1);
                        int var41 = arg1.method332(var10 + 1, 1, var8);
                        boolean var42 = class467.method2640(var8, var10, (byte) 127);
                        if (var42 && arg6 > 1 || !var42 && arg6 > 0) {
                            boolean var43 = true;
                            if (var16 != null && !var16.field5470) {
                                var43 = false;
                            } else if (var14 == 0 && var11 != 0) {
                                var43 = false;
                            } else if (var13 > 0 && var15 != null && !var15.field6405) {
                                var43 = false;
                            }
                            if (var43 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field3964[arg6][var8][var10] = (byte) class647.method3617(this.field3964[arg6][var8][var10], 4);
                            }
                        }
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        if (this.field3981) {
                            var44 = class564.method3158(var8, var10);
                            var45 = class402.method2346(var8, var10);
                            var46 = class130.method921(var8, var10);
                        }
                        arg1.method318(var8, var10, var33, var35, var34, var36, class296.field4063[var11], class599.field8365[var11], class557.field7501[var11], var22, var23, var24, var25, var44, var45, var46, false);
                        class413.method2398(arg6, var8, var10);
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 2541)
    public final void method1783(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 1) {
            this.method1780(null, null, (byte) 54, null);
        }
        for (int var6 = 0; var6 < this.field3985; var6++) {
            this.method1777(var6, arg2, arg4, arg0, arg3, -1);
        }
        field3978++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 2558)
    public static void method1784(int arg0) {
        field3982 = null;
        field3960 = null;
        int var1 = 30 / ((33 - arg0) / 62);
    }
}
