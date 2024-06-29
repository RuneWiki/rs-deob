import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class456 {

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
    private int[] field6361 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
    private int[] field6365 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public int field6351;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Z")
    public boolean field6377;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public int field6376;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Lvv;")
    private class293 field6355;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "Lbc;")
    private class332 field6353;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public int field6373;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "[[[B")
    public byte[][][] field6359;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "[[[B")
    private byte[][][] field6374;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[[[B")
    private byte[][][] field6356;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "[[[I")
    public int[][][] field6375;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[[[B")
    private byte[][][] field6352;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[[[B")
    private byte[][][] field6354;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Z")
    public static boolean field6350 = false;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "[[[B")
    public byte[][][] field6360;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[[I)V", line = 3)
    public final void method2593(int arg0, int arg1, int[][] arg2) {
        field6358++;
        int[][] var4 = this.field6375[arg0];
        for (int var5 = 0; var5 < this.field6351 + 1; var5++) {
            for (int var6 = 0; var6 < this.field6376 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
        if (arg1 != 1) {
            this.field6377 = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Loa;Ld;ILd;)V", line = 36)
    public final void method2594(class635 arg0, class137 arg1, int arg2, class137 arg3) {
        field6366++;
        int[][] var5 = new int[this.field6351][this.field6376];
        if (class260.field3312 == null || class260.field3312.length != this.field6376) {
            class599.field8521 = new int[this.field6376];
            class501.field7212 = new int[this.field6376];
            class567.field8026 = new int[this.field6376];
            class260.field3312 = new int[this.field6376];
            class627.field8902 = new int[this.field6376];
        }
        for (int var6 = 0; var6 < this.field6373; var6++) {
            for (int var8 = 0; var8 < this.field6376; var8++) {
                class260.field3312[var8] = 0;
                class501.field7212[var8] = 0;
                class627.field8902[var8] = 0;
                class599.field8521[var8] = 0;
                class567.field8026[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field6351; var9++) {
                for (int var10 = 0; var10 < this.field6376; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field6351) {
                        int var20 = this.field6374[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class462 var21 = this.field6353.method1873(50, var20 - 1);
                            class260.field3312[var10] += var21.field6425;
                            class501.field7212[var10] += var21.field6416;
                            class627.field8902[var10] += var21.field6418;
                            class599.field8521[var10] += var21.field6415;
                            var10002 = class567.field8026[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field6374[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class462 var24 = this.field6353.method1873(arg2 + 73, var23 - 1);
                            class260.field3312[var10] -= var24.field6425;
                            class501.field7212[var10] -= var24.field6416;
                            class627.field8902[var10] -= var24.field6418;
                            class599.field8521[var10] -= var24.field6415;
                            var10002 = class567.field8026[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field6376; var16++) {
                        int var17 = var16 + 5;
                        if (this.field6376 > var17) {
                            var11 += class260.field3312[var17];
                            var13 += class627.field8902[var17];
                            var12 += class501.field7212[var17];
                            var15 += class567.field8026[var17];
                            var14 += class599.field8521[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class567.field8026[var18];
                            var13 -= class627.field8902[var18];
                            var14 -= class599.field8521[var18];
                            var11 -= class260.field3312[var18];
                            var12 -= class501.field7212[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class354.method1958(var11 * 256 / var14, var12 / var15, (byte) -19, var13 / var15);
                        }
                    }
                }
            }
            if (class435.field5797) {
                this.method2598((byte) -36, var5, var6 == 0 ? arg1 : null, arg0, var6, var6 == 0 ? arg3 : null, class628.field8912[var6]);
            } else {
                this.method2596((byte) 3, var6 == 0 ? arg1 : null, var6 == 0 ? arg3 : null, var6, class628.field8912[var6], arg0, var5);
            }
            this.field6374[var6] = null;
            this.field6356[var6] = null;
            this.field6352[var6] = null;
            this.field6354[var6] = null;
        }
        if (!this.field6377) {
            if (class224.field2838 != 0) {
                class520.method2967();
            }
            if (class266.field3357) {
                class484.method2811();
            }
        }
        if (arg2 != 1) {
            this.field6359 = null;
        }
        for (int var7 = 0; var7 < this.field6373; var7++) {
            class628.field8912[var7].method248();
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III[Lle;IIILiaa;II)V", line = 211)
    public final void method2595(int arg0, int arg1, int arg2, class277[] arg3, int arg4, int arg5, int arg6, class452 arg7, int arg8, int arg9) {
        field6357++;
        int var11 = (arg2 & 0x7) * 8;
        if (!this.field6377) {
            class277 var12 = arg3[arg6];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg4 + class511.method2930(arg0, var14 & 0x7, -31746, var13 & 0x7);
                    int var16 = arg8 + class634.method3546(var13 & 0x7, arg0, (byte) 68, var14 & 0x7);
                    if (var15 > 0 && var15 < (this.field6351 - 1) && var16 > 0 && var16 < this.field6376 - 1) {
                        var12.method1581(-32251, var16, var15);
                    }
                }
            }
        }
        int var17 = (arg9 & 0x7) * 8;
        int var18 = (arg2 & 0xFFFFFFF8) << 3;
        int var19 = arg9 & 0x1FFFFFF8 << 3;
        if (arg5 != 3) {
            return;
        }
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
        for (int var22 = 0; var22 < this.field6373; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var23 >= var11 && (var11 + 8) >= var23 && var24 >= var17 && (var17 + 8) >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || var17 + 8 == var24) {
                            if (arg0 == 0) {
                                var25 = -var11 - (-var23 - arg4);
                                var26 = arg8 - (var17 - var24);
                            } else if (arg0 == 1) {
                                var26 = arg8 + var11 - (var23 - 8);
                                var25 = arg4 + var24 - var17;
                            } else if (arg0 == 2) {
                                var26 = arg8 + 8 - (var24 - var17);
                                var25 = arg4 + 8 - (-var11 + var23);
                            } else {
                                var25 = arg4 + var17 + 8 - var24;
                                var26 = var23 + arg8 - var11;
                            }
                            this.method2602(0, arg6, arg7, true, var19 + var24, 0, var26, 0, var25, (byte) 57, var18 + var23);
                        } else {
                            var25 = arg4 + class511.method2930(arg0, var24 & 0x7, -31746, var23 & 0x7);
                            var26 = arg8 + class634.method3546(var23 & 0x7, arg0, (byte) 68, var24 & 0x7);
                            this.method2602(var20, arg6, arg7, false, var19 + var24, var21, var26, arg0, var25, (byte) 57, var18 + var23);
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
                                if (arg0 == 0) {
                                    var31 = var29 + arg4 - var11;
                                    var32 = arg8 + var30 - var17;
                                } else if (arg0 == 1) {
                                    var32 = arg8 + var11 + 8 - var29;
                                    var31 = arg4 + var30 - var17;
                                } else if (arg0 == 2) {
                                    var31 = var11 + arg4 + 8 - var29;
                                    var32 = arg8 - (var30 - var17 - 8);
                                } else {
                                    var32 = arg8 - (var11 - var29);
                                    var31 = var17 + arg4 + 8 - var30;
                                }
                                if (var31 >= 0 && var31 < this.field6351 && var32 >= 0 && this.field6376 > var32) {
                                    this.field6375[arg6][var31][var32] = this.field6375[arg6][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2602(0, 0, arg7, false, 0, 0, -1, 0, -1, (byte) 57, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLd;Ld;ILd;Loa;[[I)V", line = 412)
    private final void method2596(byte arg0, class137 arg1, class137 arg2, int arg3, class137 arg4, class635 arg5, int[][] arg6) {
        field6367++;
        if (arg0 != 3) {
            this.method2596((byte) -49, null, null, -39, null, null, null);
        }
        for (int var8 = 0; var8 < this.field6351; var8++) {
            for (int var9 = 0; var9 < this.field6376; var9++) {
                if (class36.field412 == -1 || class177.method1042(var9, (byte) -44, var8, arg3, class36.field412)) {
                    byte var10 = this.field6352[arg3][var8][var9];
                    byte var11 = this.field6354[arg3][var8][var9];
                    int var12 = this.field6356[arg3][var8][var9] & 0xFF;
                    int var13 = this.field6374[arg3][var8][var9] & 0xFF;
                    class250 var14 = var12 == 0 ? null : this.field6355.method1669(120, var12 - 1);
                    class462 var15 = var13 == 0 ? null : this.field6353.method1873(48, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class32.field380[var10];
                        var16 = var15 == null ? 0 : class536.field7659[var10];
                    } else if (var14 != null) {
                        var17 = class32.field380[var10];
                    } else if (var15 != null) {
                        var16 = class32.field380[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field3203 == -1 && var14.field3204 == -1 && var14.field3208 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg5.method315() ? var14.field3208 : var14.field3214;
                            if (class229.field2917) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field3213;
                                if (var14.field3203 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field3203;
                                }
                                if (var14.field3204 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field3204;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field6377 && arg3 == 0) {
                                class186.method1082(var8, var9, var14.field3202, var14.field3215 * 8, var14.field3217);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field6420;
                            if (class229.field2917) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field6417;
                                var20[var19] = arg6[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field6365.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg2 == null ? null : new int[var31];
                        int[] var35 = arg2 == null && arg1 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field6365[var36];
                            int var46 = this.field6361[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 512 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var45;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class265.field3348[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg2.method242(var49, var50) - arg4.method242(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg2 != null && !class265.field3348[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg4.method242(var51, var52) - arg2.method242(var51, var52);
                                } else if (arg1 != null && !class600.field8524[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg1.method242(var53, var54) - arg4.method242(var53, var54);
                                }
                            }
                        }
                        int var37 = arg4.method253(var8, var9);
                        int var38 = arg4.method253(var8 + 1, var9);
                        int var39 = arg4.method253(var8 + 1, var9 + 1);
                        int var40 = arg4.method253(var8, var9 + 1);
                        if (arg3 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field3205) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field6359[arg3][var8][var9] = (byte) class139.method776(this.field6359[arg3][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field6377) {
                            var42 = class577.method3264(var8, var9);
                            var43 = class172.method1017(var8, var9);
                            var44 = class535.method3044(var8, var9);
                        }
                        arg4.method244(var8, var9, var32, var34, var33, var35, class92.field1042[var10], class449.field6186[var10], class574.field8140[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class66.method432(arg3, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([[[ILoa;I[Lle;)V", line = 725)
    public final void method2597(int[][][] arg0, class635 arg1, int arg2, class277[] arg3) {
        field6371++;
        if (!this.field6377) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field6351; var6++) {
                    for (int var7 = 0; var7 < this.field6376; var7++) {
                        if ((class379.field4922[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class379.field4922[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method1571(true, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field6373; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field6377) {
                if (class266.field3357) {
                    var10 |= 0x2;
                }
                if (class544.field7786) {
                    var11 |= 0x8;
                }
                if (class224.field2838 != 0) {
                    var10 |= 0x1;
                    if (class103.field1120 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class266.field3357) {
                var11 |= 0x7;
            }
            if (!class545.field7803) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field6375[var9] : arg0[var9];
            class168.method1005(var9, arg1.method282(this.field6351, this.field6376, this.field6375[var9], var12, 512, var10, var11));
        }
        if (arg2 != 1) {
            this.method2596((byte) -25, null, null, -68, null, null, null);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B[[ILd;Loa;ILd;Ld;)V", line = 825)
    private final void method2598(byte arg0, int[][] arg1, class137 arg2, class635 arg3, int arg4, class137 arg5, class137 arg6) {
        field6362++;
        byte[][] var8 = this.field6352[arg4];
        byte[][] var9 = this.field6354[arg4];
        byte[][] var10 = this.field6374[arg4];
        byte[][] var11 = this.field6356[arg4];
        int var12 = 0;
        if (arg0 > -21) {
            this.method2598((byte) 9, null, null, null, -10, null, null);
        }
        while (var12 < this.field6351) {
            int var13 = var12 >= this.field6351 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field6376; var14++) {
                int var15 = (this.field6376 - 1) <= var14 ? var14 : var14 + 1;
                if (class36.field412 == -1 || class177.method1042(var14, (byte) -112, var12, arg4, class36.field412)) {
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
                        class250 var26 = var21 == 0 ? null : this.field6355.method1669(123, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class462 var27 = var22 == 0 ? null : this.field6353.method1873(124, var22 - 1);
                        class250 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3203 == -1 && var26.field3204 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3219;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field6351 > var12 && this.field6376 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var32++;
                            } else {
                                var35--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var36--;
                                var32--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            int var37 = var34 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg6.method253(var12, var14) - arg6.method253(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg6.method253(var13, var14) - arg6.method253(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class61.field645[var39] = -1;
                            class671.field9530[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3219 ? class104.field1123[var19] : class463.field6444[var19];
                        this.method2605(var19, var9, var27, var26, var20, var14, arg3, var18, var12, var8, this.field6376, (byte) 64, var11, this.field6351);
                        boolean var41 = var26 != null && var26.field3204 != var26.field3203;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class61.field645[var42] >= 0 && class332.field4290[var42] != class207.field2514[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class482.method2809(var18[1], class203.method1246(class671.field9530[4], class671.field9530[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class482.method2809(var18[3], class203.method1246(class671.field9530[6], class671.field9530[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class482.method2809(var18[0], class203.method1246(class671.field9530[0], class671.field9530[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class482.method2809(var18[2], class203.method1246(class671.field9530[4], class671.field9530[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
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
                            var45 = class449.field6186[var19];
                            var46 = var27 == null ? 0 : class536.field7659[var19];
                            var47 = class92.field1042[var19];
                            var48 = class574.field8140[var19];
                            var49 = var26 == null ? 0 : class32.field380[var19];
                        } else if (var17) {
                            var45 = class379.field4921[var19];
                            var48 = class515.field7375[var19];
                            var49 = var26 == null ? 0 : class226.field2897[var19];
                            var47 = class8.field68[var19];
                            var44 = class319.field4131[var19];
                            var46 = var27 == null ? 0 : class506.field7288[var19];
                        } else {
                            var46 = var27 == null ? 0 : class229.field2918[var19];
                            var45 = class447.field6139[var19];
                            var44 = class638.field9057[var19];
                            var48 = class437.field6084[var19];
                            var49 = var26 == null ? 0 : class226.field2890[var19];
                            var47 = class99.field1092[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class66.method432(arg4, var12, var14);
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
                            int[] var61 = arg5 == null && arg2 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3203;
                                var63 = arg3.method315() ? var26.field3208 : var26.field3214;
                                var64 = var26.field3213;
                                int var65 = class80.method518(true, arg3, var26);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = 1;
                                        class583.field8291[2] = var48[var51];
                                        class583.field8291[3] = 1;
                                        class583.field8291[4] = var45[var51];
                                        var98 = 6;
                                        class583.field8291[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = 5;
                                        class583.field8291[2] = var48[var51];
                                        class583.field8291[3] = 5;
                                        class583.field8291[4] = var45[var51];
                                        var98 = 6;
                                        class583.field8291[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = 3;
                                        class583.field8291[2] = var48[var51];
                                        class583.field8291[3] = 3;
                                        class583.field8291[4] = var45[var51];
                                        var98 = 6;
                                        class583.field8291[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = 7;
                                        class583.field8291[2] = var48[var51];
                                        class583.field8291[3] = 7;
                                        class583.field8291[4] = var45[var51];
                                        var98 = 6;
                                        class583.field8291[5] = var48[var51];
                                    } else {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = var45[var51];
                                        var98 = 3;
                                        class583.field8291[2] = var48[var51];
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class583.field8291[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field6365[var100];
                                        int var103 = this.field6361[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 512 - var102;
                                        } else if (var20 == 2) {
                                            var104 = 512 - var102;
                                            var105 = 512 - var103;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 512 - var103;
                                        } else {
                                            var105 = var103;
                                            var104 = var102;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class265.field3348[var19][var100]) {
                                            int var106 = (var12 << 9) + var104;
                                            int var107 = (var14 << 9) + var105;
                                            var60[var52] = arg5.method242(var106, var107) - arg6.method242(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class265.field3348[var19][var100]) {
                                                int var108 = (var12 << 9) + var104;
                                                int var109 = (var14 << 9) + var105;
                                                var61[var52] = arg6.method242(var108, var109) - arg5.method242(var108, var109);
                                            } else if (arg2 != null && !class600.field8524[var19][var100]) {
                                                int var110 = (var12 << 9) + var104;
                                                int var111 = (var14 << 9) + var105;
                                                var61[var52] = arg2.method242(var110, var111) - arg6.method242(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && class61.field645[var101] > var26.field3225) {
                                            if (var54 != null) {
                                                var54[var52] = class332.field4290[var101];
                                            }
                                            var59[var52] = class490.field7112[var101];
                                            var58[var52] = class32.field362[var101];
                                            var57[var52] = class207.field2514[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg3.method315() ? var26.field3208 : var26.field3214;
                                            var59[var52] = var26.field3213;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field6377 && arg4 == 0) {
                                    class186.method1082(var12, var14, var26.field3202, var26.field3215 * 8, var26.field3217);
                                }
                                if (var19 != 12 && var26.field3203 != -1 && var26.field3207) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class32.field380[var19];
                            } else if (var17) {
                                var51 += class226.field2897[var19];
                            } else {
                                var51 += class226.field2890[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class462 var67 = this.field6353.method1873(-47, var22 - 1);
                                class462 var68 = this.field6353.method1873(-116, var23 - 1);
                                class462 var69 = this.field6353.method1873(-41, var24 - 1);
                                class462 var70 = this.field6353.method1873(-58, var25 - 1);
                                for (int var71 = 0; var71 < var46; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = 1;
                                        class583.field8291[2] = var48[var51];
                                        class583.field8291[3] = 1;
                                        class583.field8291[4] = var45[var51];
                                        var73 = 6;
                                        class583.field8291[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = 5;
                                        class583.field8291[2] = var48[var51];
                                        class583.field8291[3] = 5;
                                        class583.field8291[4] = var45[var51];
                                        class583.field8291[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = 3;
                                        class583.field8291[2] = var48[var51];
                                        class583.field8291[3] = 3;
                                        class583.field8291[4] = var45[var51];
                                        class583.field8291[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = 7;
                                        class583.field8291[2] = var48[var51];
                                        class583.field8291[3] = 7;
                                        class583.field8291[4] = var45[var51];
                                        class583.field8291[5] = var48[var51];
                                        var73 = 6;
                                    } else {
                                        class583.field8291[0] = var47[var51];
                                        class583.field8291[1] = var45[var51];
                                        var73 = 3;
                                        class583.field8291[2] = var48[var51];
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class583.field8291[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field6365[var75];
                                        int var78 = this.field6361[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var80 = var78;
                                            var79 = 512 - var77;
                                        } else if (var20 == 2) {
                                            var80 = 512 - var77;
                                            var79 = 512 - var78;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 512 - var78;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class265.field3348[var19][var75]) {
                                            int var81 = (var12 << 9) + var80;
                                            int var82 = (var14 << 9) + var79;
                                            var60[var52] = arg5.method242(var81, var82) - arg6.method242(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class265.field3348[var19][var75]) {
                                                int var83 = (var12 << 9) + var80;
                                                int var84 = (var14 << 9) + var79;
                                                var61[var52] = arg6.method242(var83, var84) - arg5.method242(var83, var84);
                                            } else if (arg2 != null && !class600.field8524[var19][var75]) {
                                                int var85 = (var12 << 9) + var80;
                                                int var86 = (var14 << 9) + var79;
                                                var61[var52] = arg2.method242(var85, var86) - arg6.method242(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class61.field645[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class332.field4290[var76];
                                            }
                                            var59[var52] = class490.field7112[var76];
                                            var58[var52] = class32.field362[var76];
                                            var57[var52] = class207.field2514[var76];
                                        } else {
                                            if (var17 && class265.field3348[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg1[var12][var14];
                                                var58[var52] = var67.field6420;
                                                var59[var52] = var67.field6417;
                                            } else if (var80 == 0 && var79 == 512) {
                                                var57[var52] = arg1[var12][var15];
                                                var58[var52] = var68.field6420;
                                                var59[var52] = var68.field6417;
                                            } else if (var80 == 512 && var79 == 512) {
                                                var57[var52] = arg1[var13][var15];
                                                var58[var52] = var69.field6420;
                                                var59[var52] = var69.field6417;
                                            } else if (var80 == 512 && var79 == 0) {
                                                var57[var52] = arg1[var13][var14];
                                                var58[var52] = var70.field6420;
                                                var59[var52] = var70.field6417;
                                            } else {
                                                if (var80 < 256) {
                                                    if (var79 < 256) {
                                                        var58[var52] = var67.field6420;
                                                        var59[var52] = var67.field6417;
                                                    } else {
                                                        var58[var52] = var68.field6420;
                                                        var59[var52] = var68.field6417;
                                                    }
                                                } else if (var79 >= 256) {
                                                    var58[var52] = var69.field6420;
                                                    var59[var52] = var69.field6417;
                                                } else {
                                                    var58[var52] = var70.field6420;
                                                    var59[var52] = var70.field6417;
                                                }
                                                int var87 = class235.method1365(arg1[var13][var14], -154640633, var80 << 7 >> 9, arg1[var12][var14]);
                                                int var88 = class235.method1365(arg1[var13][var15], -154640633, var80 << 7 >> 9, arg1[var12][var15]);
                                                var57[var52] = class235.method1365(var88, -154640633, var79 << 7 >> 9, var87);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field6414) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg6.method253(var12, var14);
                            int var90 = arg6.method253(var13, var14);
                            int var91 = arg6.method253(var13, var15);
                            int var92 = arg6.method253(var12, var15);
                            if (arg4 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3205) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field6359[arg4][var12][var14] = (byte) class139.method776(this.field6359[arg4][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field6377) {
                                var94 = class577.method3264(var12, var14);
                                var95 = class172.method1017(var12, var14);
                                var96 = class535.method3044(var12, var14);
                            }
                            arg6.method249(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class66.method432(arg4, var12, var14);
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 1704)
    public static final byte[] method2599(int arg0, String arg1) {
        field6378++;
        if (arg0 != 8431) {
            return null;
        }
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIZLvv;Lbc;)V", line = 3159)
    public class456(int arg0, int arg1, int arg2, boolean arg3, class293 arg4, class332 arg5) {
        this.field6351 = arg1;
        this.field6377 = arg3;
        this.field6376 = arg2;
        this.field6355 = arg4;
        this.field6353 = arg5;
        this.field6373 = arg0;
        this.field6359 = new byte[this.field6373][this.field6351 + 1][this.field6376 + 1];
        this.field6374 = new byte[this.field6373][this.field6351][this.field6376];
        this.field6356 = new byte[this.field6373][this.field6351][this.field6376];
        this.field6375 = new int[this.field6373][this.field6351 + 1][this.field6376 + 1];
        this.field6352 = new byte[this.field6373][this.field6351][this.field6376];
        this.field6354 = new byte[this.field6373][this.field6351][this.field6376];
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I", line = 1850)
    public static final int method2600(int arg0) {
        field6370++;
        if (!class601.field8530.field2848) {
            for (int var1 = 0; var1 < class411.field5452; var1++) {
                if (class420.field5582[var1].method41(113) == 's' || class420.field5582[var1].method41(120) == 'S') {
                    class601.field8530.field2848 = true;
                    break;
                }
            }
        }
        if (class534.field7635 == class44.field460) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class641.method3604(false);
            if (class506.field7289 == 0L) {
                class506.field7289 = var4;
            }
            if (var3 > 16384 && (var4 - class506.field7289) < 5000L) {
                if ((var4 - class13.field117) > 1000L) {
                    System.gc();
                    class13.field117 = var4;
                }
                return 0;
            }
        }
        if (class534.field7635 == class44.field465) {
            if (class215.field2613 == null) {
                class215.field2613 = new class355(class448.field6156, class254.field3247, class277.field3499, class285.field3613);
            }
            if (!class215.field2613.method1963(false)) {
                return 0;
            }
            class217.method1288(0, false, -97);
            class253.field3243 = class184.method1072((byte) -112, 32, true, 1, false);
            class682.field9686 = class184.method1072((byte) -112, 33, true, 1, false);
            class57.field593 = class184.method1072((byte) -112, 13, true, 1, false);
        }
        if (class534.field7635 == class44.field466) {
            class682.field9686.method1726(false);
            int var6 = class294.field3864[33].method1212((byte) -1);
            int var7 = var6 + class294.field3864[32].method1212((byte) -1);
            int var8 = var7 + class294.field3864[13].method1212((byte) -1);
            int var9 = var8 + class682.field9686.method1715(-126);
            if (var9 != 400) {
                return var9 / 4;
            }
            class220.field2666 = class253.field3243.method1737(true);
            class24.field299 = class682.field9686.method1737(true);
            class320.method1796(32, class253.field3243);
            int var10 = class601.field8530.field2856;
            class415.field5509 = new class589(class220.field2668, class226.field2899, class682.field9686);
            int[] var11 = class415.field5509.method3309(false, var10);
            class410 var12 = new class410(class253.field3243);
            if (var11.length > 0) {
                class465.field6456 = new class307[var11.length];
                for (int var13 = 0; var13 < class465.field6456.length; var13++) {
                    class465.field6456[var13] = new class466(class415.field5509.method3308(class555.method3127(arg0, 485), var11[var13]), var12);
                }
            }
        }
        if (class534.field7635 == class44.field467) {
            class200.method1221((byte) -70, class57.field593, class415.method2242(12397), class253.field3243);
        }
        if (class534.field7635 == class44.field468) {
            int var14 = class372.method2043(-25453);
            int var15 = class604.method3370(-91);
            if (var14 < var15) {
                return var14 * 100 / var15;
            }
        }
        if (arg0 != 18) {
            method2599(-3, null);
        }
        if (class534.field7635 == class44.field469) {
            class647.method3631(class453.field6284, true);
            class178.method1052((byte) 3, class453.field6284);
            class508.method2921(1, (byte) -116);
        }
        if (class534.field7635 == class44.field470) {
            for (int var16 = 0; var16 < 4; var16++) {
                class475.field6919[var16] = class289.method1633(class349.field4567, true, class399.field5338);
            }
        }
        if (class534.field7635 == class44.field471) {
            class633.field8972 = class184.method1072((byte) -112, 8, true, 1, false);
            class300.field3924 = class184.method1072((byte) -112, 0, true, 1, false);
            class408.field5434 = class184.method1072((byte) -112, 1, true, 1, false);
            class294.field3869 = class184.method1072((byte) -112, 2, true, 1, false);
            class443.field6110 = class184.method1072((byte) -112, 3, true, 1, false);
            class581.field8259 = class184.method1072((byte) -112, 4, true, 1, false);
            class299.field3914 = class184.method1072((byte) -112, 5, true, 1, true);
            class403.field5364 = class184.method1072((byte) -112, 6, false, 1, true);
            class389.field5195 = class184.method1072((byte) -112, 7, true, 1, false);
            class344.field4480 = class184.method1072((byte) -112, 9, true, 1, false);
            class70.field750 = class184.method1072((byte) -112, 10, true, 1, false);
            class674.field9566 = class184.method1072((byte) -112, 11, true, 1, false);
            class178.field2179 = class184.method1072((byte) -112, 12, true, 1, false);
            class194.field2332 = class184.method1072((byte) -112, 14, false, 1, false);
            class639.field9069 = class184.method1072((byte) -112, 15, true, 1, false);
            class85.field900 = class184.method1072((byte) -112, 16, true, 1, false);
            class144.field1615 = class184.method1072((byte) -112, 17, true, 1, false);
            class315.field4096 = class184.method1072((byte) -112, 18, true, 1, false);
            class147.field1648 = class184.method1072((byte) -112, 19, true, 1, false);
            class516.field7385 = class184.method1072((byte) -112, 20, true, 1, false);
            class135.field1527 = class184.method1072((byte) -112, 21, true, 1, false);
            class314.field4050 = class184.method1072((byte) -112, 22, true, 1, false);
            class683.field9689 = class184.method1072((byte) -112, 23, true, 1, true);
            class386.field5156 = class184.method1072((byte) -112, 24, true, 1, false);
            class355.field4661 = class184.method1072((byte) -112, 25, true, 1, false);
            class393.field5240 = class184.method1072((byte) -112, 26, true, 1, true);
            class198.field2402 = class184.method1072((byte) -112, 27, true, 1, false);
            class67.field723 = class184.method1072((byte) -112, 28, true, 1, true);
            class345.field4510 = class184.method1072((byte) -112, 29, true, 1, false);
            class311.field4023 = class184.method1072((byte) -112, 30, true, 1, true);
            class457.field6380 = class184.method1072((byte) -112, 31, true, 1, true);
        }
        if (class534.field7635 == class44.field472) {
            int var17 = 0;
            for (int var18 = 0; var18 < 34; var18++) {
                var17 += class294.field3864[var18].method1212((byte) -1) * class405.field5407[var18] / 100;
            }
            if (var17 != 100) {
                return var17;
            }
            class404.method2200(class633.field8972, (byte) 115);
            class200.method1221((byte) -105, class57.field593, class415.method2242(12397), class633.field8972);
        }
        if (class534.field7635 == class44.field473) {
            class110.method689(22050);
            class508.method2921(2, (byte) -109);
        }
        if (class534.field7635 == class44.field474) {
            class5.method26(class311.field4023, arg0 ^ 0x4E, class623.field8837);
        }
        if (class534.field7635 == class44.field475) {
            if (!class67.field723.method1726(false)) {
                return class67.field723.method1715(-116);
            }
            class178.method1053(class67.field723.method1722(1, arg0 - 18), (byte) -126);
            class468.method2655((byte) 116, class67.field723.method1722(3, 0));
            if (class220.field2665 != -1 && !class389.field5195.method1739(class220.field2665, 0, arg0 - 20)) {
                return 99;
            }
        }
        if (class534.field7635 == class44.field476) {
            int var19 = class305.method1747(arg0 ^ 0x4545, "jaggl");
            if (var19 >= 0 && var19 < 100) {
                return var19;
            }
        }
        if (class534.field7635 == class44.field477) {
            int var20 = class305.method1747(arg0 + 17733, "jagdx");
            if (var20 >= 0 && var20 < 100) {
                return var20;
            }
        }
        if (class534.field7635 == class44.field478) {
            int var21 = class305.method1747(arg0 + 17733, "jagmisc");
            if (var21 >= 0 && var21 < 100) {
                return var21;
            }
            if (var21 == 100) {
                class239.field3025.method3022(0);
            }
        }
        if (class534.field7635 == class44.field479) {
            int var22 = class305.method1747(17751, "sw3d");
            if (var22 >= 0 && var22 < 100) {
                return var22;
            }
        }
        if (class534.field7635 == class44.field480) {
            int var23 = class305.method1747(17751, "jaclib");
            if (var23 >= 0 && var23 < 100) {
                return var23;
            }
            if (var23 == 100) {
                class239.field3025.method3012((byte) -107);
            }
        }
        if (class534.field7635 == class44.field481) {
            int var24 = class305.method1747(17751, "hw3d");
            if (var24 >= 0 && var24 < 100) {
                return var24;
            }
        }
        if (class534.field7635 == class44.field482 && !class457.field6380.method1726(false)) {
            return 0;
        }
        if (class534.field7635 == class44.field483) {
            if (!class393.field5240.method1726(false)) {
                return class393.field5240.method1715(-107);
            }
            class209.field2545 = new class156(class393.field5240, class344.field4480, class633.field8972);
        }
        if (class534.field7635 == class44.field484) {
            byte var25 = 0;
            class294.field3869.method1726(false);
            int var26 = var25 + class294.field3869.method1715(-121);
            class85.field900.method1726(false);
            int var27 = var26 + class85.field900.method1715(arg0 ^ 0xFFFFFF80);
            class144.field1615.method1726(false);
            int var28 = var27 + class144.field1615.method1715(arg0 - 138);
            class315.field4096.method1726(false);
            int var29 = var28 + class315.field4096.method1715(-115);
            class147.field1648.method1726(false);
            int var30 = var29 + class147.field1648.method1715(-119);
            class516.field7385.method1726(false);
            int var31 = var30 + class516.field7385.method1715(arg0 ^ 0xFFFFFF9E);
            class135.field1527.method1726(false);
            int var32 = var31 + class135.field1527.method1715(-109);
            class314.field4050.method1726(false);
            int var33 = var32 + class314.field4050.method1715(-123);
            class386.field5156.method1726(false);
            int var34 = var33 + class386.field5156.method1715(-118);
            class355.field4661.method1726(false);
            int var35 = var34 + class355.field4661.method1715(-108);
            class198.field2402.method1726(false);
            int var36 = var35 + class198.field2402.method1715(-119);
            class345.field4510.method1726(false);
            int var37 = var36 + class345.field4510.method1715(arg0 ^ 0xFFFFFF87);
            if (var37 < 1200) {
                return var37 / 12;
            }
            class80.field854 = new class110(class220.field2668, class226.field2899, class294.field3869);
            class422.field5623 = new class593(class220.field2668, class226.field2899, class294.field3869);
            class498.field7190 = new class504(class220.field2668, class226.field2899, class294.field3869, class633.field8972);
            class281.field3563 = new class194(class220.field2668, class226.field2899, class144.field1615);
            class166.field2002 = new class293(class220.field2668, class226.field2899, class294.field3869);
            class649.field9287 = new class332(class220.field2668, class226.field2899, class294.field3869);
            class209.field2546 = new class361(class220.field2668, class226.field2899, class294.field3869, class389.field5195);
            class369.field4791 = new class592(class220.field2668, class226.field2899, class294.field3869);
            class168.field2010 = new class185(class220.field2668, class226.field2899, class294.field3869);
            class195.field2339 = new class664(class220.field2668, class226.field2899, true, class85.field900, class389.field5195);
            class147.field1644 = new class357(class220.field2668, class226.field2899, class294.field3869, class633.field8972);
            class536.field7655 = new class476(class220.field2668, class226.field2899, class294.field3869, class633.field8972);
            class608.field8585 = new class582(class220.field2668, class226.field2899, true, class315.field4096, class389.field5195);
            class472.field6588 = new class343(class220.field2668, class226.field2899, true, class80.field854, class147.field1648, class389.field5195);
            class106.field1209 = new class260(class220.field2668, class226.field2899, class294.field3869);
            class618.field8696 = new class25(class220.field2668, class226.field2899, class516.field7385, class300.field3924, class408.field5434);
            class196.field2366 = new class87(class220.field2668, class226.field2899, class294.field3869);
            class246.field3174 = new class500(class220.field2668, class226.field2899, class294.field3869);
            class203.field2487 = new class373(class220.field2668, class226.field2899, class135.field1527, class389.field5195);
            class368.field4788 = new class22(class220.field2668, class226.field2899, class294.field3869);
            class477.field6943 = new class45(class220.field2668, class226.field2899, class294.field3869);
            class410.field5444 = new class565(class220.field2668, class226.field2899, class294.field3869);
            class470.field6566 = new class299(class220.field2668, class226.field2899, class314.field4050);
            class692.field9748 = new class363(class220.field2668, class226.field2899, class294.field3869);
            class522.method2976(class389.field5195, class633.field8972, class57.field593, class443.field6110, 0);
            class641.method3603((byte) -100, class345.field4510);
            class447.field6140 = new class266(class226.field2899, class386.field5156, class355.field4661);
            class58.field599 = new class268(class226.field2899, class386.field5156, class355.field4661, new class525());
            class255.method1459(arg0 ^ 0x2F);
            class195.field2339.method3734(!class601.field8530.method1835(class150.field1711, (byte) 74), 500);
            class491.field7127 = new class239();
            class593.method3325((byte) -118);
            class314.method1773(class198.field2402, true);
            class602.method3365(arg0 + 86, class209.field2545, class389.field5195);
        }
        if (class534.field7635 == class44.field485) {
            int var38 = class281.method1605(class633.field8972, (byte) -109) + class648.method3644(true, -19558);
            int var39 = class680.method3802(arg0 ^ 0x2) + class604.method3370(arg0 ^ 0xFFFFFFA1);
            if (var39 > var38) {
                return var38 * 100 / var39;
            }
        }
        if (class534.field7635 == class44.field486) {
            if (!class70.field750.method1728("huffman", "", 0)) {
                return 0;
            }
            class351 var40 = new class351(class70.field750.method1734("", 11434, "huffman"));
            class487.method2818(12, var40);
        }
        if (class534.field7635 == class44.field487 && !class443.field6110.method1726(false)) {
            return class443.field6110.method1715(-127);
        } else if (class534.field7635 == class44.field488 && !class178.field2179.method1726(false)) {
            return class178.field2179.method1715(-109);
        } else if (class534.field7635 == class44.field489 && !class57.field593.method1726(false)) {
            return class57.field593.method1715(-124);
        } else {
            if (class534.field7635 == class44.field490) {
                if (!class683.field9689.method1721("details", 124)) {
                    return class683.field9689.method1741("details", 9312);
                }
                class637.method3583(class683.field9689, class166.field2002, class649.field9287, class195.field2339, class147.field1644, class536.field7655, class491.field7127);
            }
            if (class534.field7635 == class44.field491) {
                class462.field6424 = new boolean[class410.field5444.field8015];
                class53.field550 = new String[class477.field6943.field502];
                class585.field8313 = new int[class410.field5444.field8015];
                for (int var41 = 0; var41 < class410.field5444.field8015; var41++) {
                    if (class410.field5444.method3195(var41, 19).field4108 == 0) {
                        class462.field6424[var41] = true;
                        class137.field1559++;
                    }
                    class585.field8313[var41] = -1;
                }
                class144.method789(0);
                class36.field410 = class443.field6110.method1716(true, "loginscreen");
                class293.field3847 = class443.field6110.method1716(true, "lobbyscreen");
                class299.field3914.method1735(false, (byte) 111, true);
                class403.field5364.method1735(true, (byte) 111, true);
                class633.field8972.method1735(true, (byte) 111, true);
                class57.field593.method1735(true, (byte) 111, true);
                class70.field750.method1735(true, (byte) 111, true);
                class443.field6110.method1735(true, (byte) 111, true);
                class294.field3869.field3945 = 2;
                class204.field2493 = true;
                class144.field1615.field3945 = 2;
                class85.field900.field3945 = 2;
                class315.field4096.field3945 = 2;
                class147.field1648.field3945 = 2;
                class516.field7385.field3945 = 2;
                class135.field1527.field3945 = 2;
            }
            if (class534.field7635 == class44.field493) {
                class264.field3343 = class601.field8530.field2848;
                class601.field8530.field2848 = true;
                class601.field8530.method1841(120, class623.field8837);
                if (class264.field3343) {
                    class466.method2646(8000, 0);
                } else {
                    class466.method2646(8000, class601.field8530.field2884);
                }
                class472.method2676(class601.field8530.field2869, -1, 0, false, -1);
                class647.method3631(class453.field6284, true);
                class178.method1052((byte) 3, class453.field6284);
                class548.method3098(23096, class453.field6284, class633.field8972);
                class292.method1666(116, class387.field5169);
                class136.method763(null, true);
                class682.field9686 = null;
                class253.field3243 = null;
                class415.field5509 = null;
                class465.field6456 = null;
            }
            return class90.method565(-13176);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 2358)
    public final void method2601(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg2; var6 < this.field6373; var6++) {
            this.method2603(arg3, arg4, arg0, var6, arg2 - 118, arg1);
        }
        field6369++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILiaa;ZIIIIIBI)V", line = 2381)
    private final void method2602(int arg0, int arg1, class452 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        if (arg9 != 57) {
            return;
        }
        if (arg7 == 1) {
            arg5 = 1;
        } else if (arg7 == 2) {
            arg0 = 1;
            arg5 = 1;
        } else if (arg7 == 3) {
            arg0 = 1;
        }
        field6368++;
        if (arg8 < 0 || this.field6351 <= arg8 || arg6 < 0 || this.field6376 <= arg6) {
            while (true) {
                int var14 = arg2.method2541(arg9 ^ 0x59);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg2.method2541(106);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method2541(arg9 + 22);
                }
            }
        }
        if (!this.field6377 && !arg3) {
            class379.field4922[arg1][arg8][arg6] = 0;
        }
        while (true) {
            int var12 = arg2.method2541(93);
            if (var12 == 0) {
                if (this.field6377) {
                    this.field6375[0][arg0 + arg8][arg5 + arg6] = 0;
                    return;
                } else if (arg1 == 0) {
                    this.field6375[0][arg0 + arg8][arg6 + arg5] = -class223.method1306(arg4 + 556238, arg10 + 932731, arg9 - 52) * 8 << 2;
                    return;
                } else {
                    this.field6375[arg1][arg0 + arg8][arg5 + arg6] = this.field6375[arg1 - 1][arg0 + arg8][arg5 + arg6] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg2.method2541(87);
                if (this.field6377) {
                    this.field6375[0][arg0 + arg8][arg5 + arg6] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg1 != 0) {
                    this.field6375[arg1][arg0 + arg8][arg5 + arg6] = this.field6375[arg1 - 1][arg8 + arg0][arg5 + arg6] - (var13 * 8 << 2);
                    return;
                }
                this.field6375[0][arg0 + arg8][arg5 + arg6] = -var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg3) {
                    arg2.method2541(62);
                } else {
                    this.field6356[arg1][arg8][arg6] = arg2.method2547(true);
                    this.field6352[arg1][arg8][arg6] = (byte) ((var12 - 2) / 4);
                    this.field6354[arg1][arg8][arg6] = (byte) class203.method1246(arg7 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field6377 && !arg3) {
                    class379.field4922[arg1][arg8][arg6] = (byte) (var12 - 49);
                }
            } else if (!arg3) {
                this.field6374[arg1][arg8][arg6] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIII)V", line = 2510)
    private final void method2603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6364++;
        for (int var7 = arg1; var7 < (arg0 + arg1); var7++) {
            for (int var10 = arg2; var10 < (arg2 + arg5); var10++) {
                if (var10 >= 0 && this.field6351 > var10 && var7 >= 0 && this.field6376 > var7) {
                    this.field6375[arg3][var10][var7] = arg3 > 0 ? this.field6375[arg3 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        if (arg4 > -112) {
            this.field6359 = null;
        }
        if (arg2 > 0 && this.field6351 > arg2) {
            for (int var8 = arg1 + 1; var8 < (arg0 + arg1); var8++) {
                if (var8 >= 0 && var8 < this.field6376) {
                    this.field6375[arg3][arg2][var8] = this.field6375[arg3][arg2 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < this.field6376) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && this.field6351 > var9) {
                    this.field6375[arg3][var9][arg1] = this.field6375[arg3][var9][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || this.field6351 <= arg2 || this.field6376 <= arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 > 0 && this.field6375[arg3][arg2 - 1][arg1] != 0) {
                this.field6375[arg3][arg2][arg1] = this.field6375[arg3][arg2 - 1][arg1];
                return;
            }
            if (arg1 > 0 && this.field6375[arg3][arg2][arg1 - 1] != 0) {
                this.field6375[arg3][arg2][arg1] = this.field6375[arg3][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field6375[arg3][arg2 - 1][arg1 - 1] != 0) {
                this.field6375[arg3][arg2][arg1] = this.field6375[arg3][arg2 - 1][arg1 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field6375[arg3 - 1][arg2 - 1][arg1] == this.field6375[arg3][arg2 - 1][arg1]) {
            if (arg1 <= 0 || this.field6375[arg3][arg2][arg1 - 1] == this.field6375[arg3 - 1][arg2][arg1 - 1]) {
                if (arg2 > 0 && arg1 > 0 && this.field6375[arg3 - 1][arg2 - 1][arg1 - 1] != this.field6375[arg3][arg2 - 1][arg1 - 1]) {
                    this.field6375[arg3][arg2][arg1] = this.field6375[arg3][arg2 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field6375[arg3][arg2][arg1] = this.field6375[arg3][arg2][arg1 - 1];
        } else {
            this.field6375[arg3][arg2][arg1] = this.field6375[arg3][arg2 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lle;Liaa;IIIII)V", line = 2610)
    public final void method2604(class277[] arg0, class452 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field6377) {
            for (int var8 = 0; var8 < 4; var8++) {
                class277 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg5 + var11;
                        if (var12 >= 0 && this.field6351 > var12 && var13 >= 0 && var13 < this.field6376) {
                            var9.method1581(arg6 ^ 0xFFFF8706, var13, var12);
                        }
                    }
                }
            }
        }
        field6363++;
        int var14 = arg3 + arg4;
        if (arg6 != 1283) {
            return;
        }
        int var15 = arg2 + arg5;
        for (int var16 = 0; var16 < this.field6373; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2602(0, var16, arg1, false, var15 + var18, 0, arg5 + var18, 0, arg4 + var17, (byte) 57, var14 + var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[[BLbda;Lgf;IILoa;[ZI[[BIB[[BI)V", line = 2690)
    private final void method2605(int arg0, byte[][] arg1, class462 arg2, class250 arg3, int arg4, int arg5, class635 arg6, boolean[] arg7, int arg8, byte[][] arg9, int arg10, byte arg11, byte[][] arg12, int arg13) {
        field6372++;
        boolean[] var15 = arg3 != null && arg3.field3219 ? class104.field1123[arg0] : class463.field6444[arg0];
        if (arg5 > 0) {
            if (arg8 > 0) {
                int var16 = arg12[arg8 - 1][arg5 - 1] & 0xFF;
                if (var16 > 0) {
                    class250 var17 = this.field6355.method1669(120, var16 - 1);
                    if (var17.field3203 != -1 && var17.field3219) {
                        byte var18 = arg9[arg8 - 1][arg5 - 1];
                        int var19 = arg1[arg8 - 1][arg5 - 1] * 2 + 4 & 0x7;
                        int var20 = class80.method518(true, arg6, var17);
                        if (class265.field3348[var18][var19]) {
                            class207.field2514[0] = var17.field3203;
                            class332.field4290[0] = var20;
                            class32.field362[0] = arg6.method315() ? var17.field3208 : var17.field3214;
                            class490.field7112[0] = var17.field3213;
                            class61.field645[0] = var17.field3225;
                            class671.field9530[0] = 256;
                        }
                    }
                }
            }
            if (arg8 < (arg13 - 1)) {
                int var21 = arg12[arg8 + 1][arg5 - 1] & 0xFF;
                if (var21 > 0) {
                    class250 var22 = this.field6355.method1669(116, var21 - 1);
                    if (var22.field3203 != -1 && var22.field3219) {
                        byte var23 = arg9[arg8 + 1][arg5 - 1];
                        int var24 = arg1[arg8 + 1][arg5 - 1] * 2 + 6 & 0x7;
                        int var25 = class80.method518(true, arg6, var22);
                        if (class265.field3348[var23][var24]) {
                            class207.field2514[2] = var22.field3203;
                            class332.field4290[2] = var25;
                            class32.field362[2] = arg6.method315() ? var22.field3208 : var22.field3214;
                            class490.field7112[2] = var22.field3213;
                            class61.field645[2] = var22.field3225;
                            class671.field9530[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg5 < arg10 - 1) {
            if (arg8 > 0) {
                int var26 = arg12[arg8 - 1][arg5 + 1] & 0xFF;
                if (var26 > 0) {
                    class250 var27 = this.field6355.method1669(119, var26 - 1);
                    if (var27.field3203 != -1 && var27.field3219) {
                        byte var28 = arg9[arg8 - 1][arg5 + 1];
                        int var29 = arg1[arg8 - 1][arg5 + 1] * 2 + 2 & 0x7;
                        int var30 = class80.method518(true, arg6, var27);
                        if (class265.field3348[var28][var29]) {
                            class207.field2514[6] = var27.field3203;
                            class332.field4290[6] = var30;
                            class32.field362[6] = arg6.method315() ? var27.field3208 : var27.field3214;
                            class490.field7112[6] = var27.field3213;
                            class61.field645[6] = var27.field3225;
                            class671.field9530[6] = 64;
                        }
                    }
                }
            }
            if ((arg13 - 1) > arg8) {
                int var31 = arg12[arg8 + 1][arg5 + 1] & 0xFF;
                if (var31 > 0) {
                    class250 var32 = this.field6355.method1669(115, var31 - 1);
                    if (var32.field3203 != -1 && var32.field3219) {
                        byte var33 = arg9[arg8 + 1][arg5 + 1];
                        int var34 = arg1[arg8 + 1][arg5 + 1] * 2 & 0x7;
                        int var35 = class80.method518(true, arg6, var32);
                        if (class265.field3348[var33][var34]) {
                            class207.field2514[4] = var32.field3203;
                            class332.field4290[4] = var35;
                            class32.field362[4] = arg6.method315() ? var32.field3208 : var32.field3214;
                            class490.field7112[4] = var32.field3213;
                            class61.field645[4] = var32.field3225;
                            class671.field9530[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var36 = arg12[arg8][arg5 - 1] & 0xFF;
            if (var36 > 0) {
                class250 var37 = this.field6355.method1669(127, var36 - 1);
                if (var37.field3203 != -1) {
                    byte var38 = arg9[arg8][arg5 - 1];
                    byte var39 = arg1[arg8][arg5 - 1];
                    if (var37.field3219) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class80.method518(true, arg6, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class265.field3348[var38][var41] && class61.field645[var40] <= var37.field3225) {
                                class207.field2514[var40] = var37.field3203;
                                class332.field4290[var40] = var42;
                                class32.field362[var40] = arg6.method315() ? var37.field3208 : var37.field3214;
                                class490.field7112[var40] = var37.field3213;
                                if (class61.field645[var40] == var37.field3225) {
                                    class671.field9530[var40] = class139.method776(class671.field9530[var40], 32);
                                } else {
                                    class671.field9530[var40] = 32;
                                }
                                class61.field645[var40] = var37.field3225;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg4 & 0x3]) {
                            arg7[0] = class104.field1123[var38][class203.method1246(var39 + 2, 3)];
                        }
                    } else if (!var15[arg4 & 0x3]) {
                        arg7[0] = class463.field6444[var38][class203.method1246(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg10 - 1 > arg5) {
            int var44 = arg12[arg8][arg5 + 1] & 0xFF;
            if (var44 > 0) {
                class250 var45 = this.field6355.method1669(124, var44 - 1);
                if (var45.field3203 != -1) {
                    byte var46 = arg9[arg8][arg5 + 1];
                    byte var47 = arg1[arg8][arg5 + 1];
                    if (var45.field3219) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class80.method518(true, arg6, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class265.field3348[var46][var49] && var45.field3225 >= class61.field645[var48]) {
                                class207.field2514[var48] = var45.field3203;
                                class332.field4290[var48] = var50;
                                class32.field362[var48] = arg6.method315() ? var45.field3208 : var45.field3214;
                                class490.field7112[var48] = var45.field3213;
                                if (class61.field645[var48] == var45.field3225) {
                                    class671.field9530[var48] = class139.method776(class671.field9530[var48], 16);
                                } else {
                                    class671.field9530[var48] = 16;
                                }
                                class61.field645[var48] = var45.field3225;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg4 + 2 & 0x3]) {
                            arg7[2] = class104.field1123[var46][class203.method1246(3, -(-var47))];
                        }
                    } else if (!var15[arg4 + 2 & 0x3]) {
                        arg7[2] = class463.field6444[var46][class203.method1246(3, -(-var47))];
                    }
                }
            }
        }
        if (arg8 > 0) {
            int var52 = arg12[arg8 - 1][arg5] & 0xFF;
            if (var52 > 0) {
                class250 var53 = this.field6355.method1669(126, var52 - 1);
                if (var53.field3203 != -1) {
                    byte var54 = arg9[arg8 - 1][arg5];
                    byte var55 = arg1[arg8 - 1][arg5];
                    if (var53.field3219) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class80.method518(true, arg6, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class265.field3348[var54][var57] && var53.field3225 >= class61.field645[var56]) {
                                class207.field2514[var56] = var53.field3203;
                                class332.field4290[var56] = var58;
                                class32.field362[var56] = arg6.method315() ? var53.field3208 : var53.field3214;
                                class490.field7112[var56] = var53.field3213;
                                if (class61.field645[var56] == var53.field3225) {
                                    class671.field9530[var56] = class139.method776(class671.field9530[var56], 8);
                                } else {
                                    class671.field9530[var56] = 8;
                                }
                                class61.field645[var56] = var53.field3225;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg4 + 3 & 0x3]) {
                            arg7[3] = class104.field1123[var54][class203.method1246(3, var55 + 1)];
                        }
                    } else if (!var15[arg4 + 3 & 0x3]) {
                        arg7[3] = class463.field6444[var54][class203.method1246(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg13 - 1 > arg8) {
            int var60 = arg12[arg8 + 1][arg5] & 0xFF;
            if (var60 > 0) {
                class250 var61 = this.field6355.method1669(114, var60 - 1);
                if (var61.field3203 != -1) {
                    byte var62 = arg9[arg8 + 1][arg5];
                    byte var63 = arg1[arg8 + 1][arg5];
                    if (var61.field3219) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class80.method518(true, arg6, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class265.field3348[var62][var65] && class61.field645[var64] <= var61.field3225) {
                                class207.field2514[var64] = var61.field3203;
                                class332.field4290[var64] = var66;
                                class32.field362[var64] = arg6.method315() ? var61.field3208 : var61.field3214;
                                class490.field7112[var64] = var61.field3213;
                                if (class61.field645[var64] == var61.field3225) {
                                    class671.field9530[var64] = class139.method776(class671.field9530[var64], 4);
                                } else {
                                    class671.field9530[var64] = 4;
                                }
                                class61.field645[var64] = var61.field3225;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg4 + 1 & 0x3]) {
                            arg7[1] = class104.field1123[var62][class203.method1246(3, var63 + 3)];
                        }
                    } else if (!var15[arg4 + 1 & 0x3]) {
                        arg7[1] = class463.field6444[var62][class203.method1246(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg11 <= 12) {
            this.method2596((byte) -60, null, null, 114, null, null, null);
        }
        if (arg3 == null) {
            return;
        }
        int var68 = class80.method518(true, arg6, arg3);
        if (!arg3.field3219) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg4 * 2) & 0x7;
            if (class265.field3348[arg0][var69] && class61.field645[var70] <= arg3.field3225) {
                class207.field2514[var70] = arg3.field3203;
                class332.field4290[var70] = var68;
                class32.field362[var70] = arg6.method315() ? arg3.field3208 : arg3.field3214;
                class490.field7112[var70] = arg3.field3213;
                if (class61.field645[var70] == arg3.field3225) {
                    class671.field9530[var70] = class139.method776(class671.field9530[var70], 2);
                } else {
                    class671.field9530[var70] = 2;
                }
                class61.field645[var70] = arg3.field3225;
            }
        }
        return;
    }
}
