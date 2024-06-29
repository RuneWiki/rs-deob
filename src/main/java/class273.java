import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class273 {

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
    private int[] field3575 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
    private int[] field3602 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Luk;")
    private class170 field3594;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Z")
    public boolean field3592;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lu;")
    private class52 field3589;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[[[I")
    public int[][][] field3574;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "[[[B")
    private byte[][][] field3600;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "[[[B")
    private byte[][][] field3584;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[[[B")
    private byte[][][] field3571;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "[[[B")
    public byte[][][] field3599;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[[[B")
    private byte[][][] field3595;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lpc;")
    public static class473 field3581;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field3572;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3588;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "[I")
    public static int[] field3590;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "[[[B")
    public byte[][][] field3593;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public static final void method1622() {
        class40.field607 = 0;
        label212: for (int var0 = 0; var0 < class234.field3151; var0++) {
            class435 var1 = class466.field6426[var0];
            if (class1.field95 != null) {
                for (int var2 = 0; var2 < class1.field95.length; var2++) {
                    if (class1.field95[var2] != -1000000 && (var1.field5970 <= class1.field95[var2] || var1.field5979 <= class1.field95[var2]) && (var1.field5975 <= class150.field2134[var2] || var1.field5967 <= class150.field2134[var2]) && (var1.field5975 >= class225.field3042[var2] || var1.field5967 >= class225.field3042[var2]) && (var1.field5968 <= class470.field6470[var2] || var1.field5981 <= class470.field6470[var2]) && (var1.field5968 >= class242.field3229[var2] || var1.field5981 >= class242.field3229[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field5957 == 1) {
                int var3 = var1.field5959 + class22.field388 - class95.field1428;
                if (var3 >= 0 && var3 <= class22.field388 + class22.field388) {
                    int var4 = var1.field5978 + class22.field388 - class259.field3429;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class22.field388 + class22.field388) {
                        continue;
                    }
                    int var5 = var1.field5960 + class22.field388 - class259.field3429;
                    if (var5 > class22.field388 + class22.field388) {
                        var5 = class22.field388 + class22.field388;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class461.field6365[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class128.field1868 - var1.field5975;
                        if (var7 > class1.field94) {
                            var1.field5958 = 1;
                        } else {
                            if (var7 >= -class1.field94) {
                                continue;
                            }
                            var1.field5958 = 2;
                            var7 = -var7;
                        }
                        var1.field5962 = (var1.field5968 - class427.field5836 << 8) / var7;
                        var1.field5966 = (var1.field5981 - class427.field5836 << 8) / var7;
                        var1.field5961 = (var1.field5970 - class267.field3525 << 8) / var7;
                        var1.field5974 = (var1.field5979 - class267.field3525 << 8) / var7;
                        class508.field7059[class40.field607++] = var1;
                    }
                }
            } else if (var1.field5957 == 2) {
                int var8 = var1.field5978 + class22.field388 - class259.field3429;
                if (var8 >= 0 && var8 <= class22.field388 + class22.field388) {
                    int var9 = var1.field5959 + class22.field388 - class95.field1428;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class22.field388 + class22.field388) {
                        continue;
                    }
                    int var10 = var1.field5963 + class22.field388 - class95.field1428;
                    if (var10 > class22.field388 + class22.field388) {
                        var10 = class22.field388 + class22.field388;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class461.field6365[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class427.field5836 - var1.field5968;
                        if (var12 > class1.field94) {
                            var1.field5958 = 3;
                        } else {
                            if (var12 >= -class1.field94) {
                                continue;
                            }
                            var1.field5958 = 4;
                            var12 = -var12;
                        }
                        var1.field5972 = (var1.field5975 - class128.field1868 << 8) / var12;
                        var1.field5965 = (var1.field5967 - class128.field1868 << 8) / var12;
                        var1.field5961 = (var1.field5970 - class267.field3525 << 8) / var12;
                        var1.field5974 = (var1.field5979 - class267.field3525 << 8) / var12;
                        class508.field7059[class40.field607++] = var1;
                    }
                }
            } else if (var1.field5957 == 4) {
                int var13 = var1.field5970 - class267.field3525;
                if (var13 > class258.field3413) {
                    int var14 = var1.field5978 + class22.field388 - class259.field3429;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class22.field388 + class22.field388) {
                        continue;
                    }
                    int var15 = var1.field5960 + class22.field388 - class259.field3429;
                    if (var15 > class22.field388 + class22.field388) {
                        var15 = class22.field388 + class22.field388;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field5959 + class22.field388 - class95.field1428;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class22.field388 + class22.field388) {
                        continue;
                    }
                    int var17 = var1.field5963 + class22.field388 - class95.field1428;
                    if (var17 > class22.field388 + class22.field388) {
                        var17 = class22.field388 + class22.field388;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class461.field6365[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field5958 = 5;
                        var1.field5972 = (var1.field5975 - class128.field1868 << 8) / var13;
                        var1.field5965 = (var1.field5967 - class128.field1868 << 8) / var13;
                        var1.field5962 = (var1.field5968 - class427.field5836 << 8) / var13;
                        var1.field5966 = (var1.field5981 - class427.field5836 << 8) / var13;
                        class508.field7059[class40.field607++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[Lcl;IIIILmd;)V")
    public final void method1623(int arg0, int arg1, int arg2, int arg3, class173[] arg4, int arg5, int arg6, int arg7, int arg8, class379 arg9) {
        field3579++;
        int var11 = (arg6 & 0x7) * 8;
        if (!this.field3592) {
            class173 var12 = arg4[arg3];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg7 + class241.method1483(-30927, var13 & 0x7, arg5, var14 & 0x7);
                    int var16 = arg2 + class40.method294(var14 & 0x7, (byte) -58, arg5, var13 & 0x7);
                    if (var15 > 0 && (this.field3585 - 1) > var15 && var16 > 0 && var16 < this.field3586 - 1) {
                        var12.method1157(var16, var15, (byte) -113);
                    }
                }
            }
        }
        int var17 = (arg0 & 0x7) * 8;
        int var18 = (arg6 & 0xFFFFFFF8) << 3;
        int var19 = arg0 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg5 == 1) {
            var21 = 1;
        } else if (arg5 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg5 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field3591; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg8 != var22 || var23 < var11 || (var11 + 8) < var23 || var17 > var24 || var24 > var17 + 8) {
                        this.method1632(arg9, 0, 0, -1, false, arg1 ^ 0xFFFF9AEF, 0, 0, 0, -1, 0);
                    } else if ((var11 + 8) == var23 || var17 + 8 == var24) {
                        int var31;
                        int var32;
                        if (arg5 == 0) {
                            var31 = arg7 + var23 - var11;
                            var32 = arg2 + var24 - var17;
                        } else if (arg5 == 1) {
                            var31 = var24 + arg7 - var17;
                            var32 = var11 + arg2 + 8 - var23;
                        } else if (arg5 == 2) {
                            var31 = arg7 + var11 + 8 - var23;
                            var32 = -var24 - (-var17 - (arg2 + 8));
                        } else {
                            var32 = var23 + arg2 - var11;
                            var31 = arg7 + 8 - (-var17 + var24);
                        }
                        this.method1632(arg9, 0, var19 + var24, var31, true, 13, 0, var18 + var23, arg3, var32, 0);
                    } else {
                        int var25 = arg7 + class241.method1483(-30927, var23 & 0x7, arg5, var24 & 0x7);
                        int var26 = arg2 + class40.method294(var24 & 0x7, (byte) -58, arg5, var23 & 0x7);
                        this.method1632(arg9, var21, var19 + var24, var25, false, 13, var20, var18 + var23, arg3, var26, arg5);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg5 == 0) {
                                var29 = arg2 + var28 - var17;
                                var30 = var27 - (var11 - arg7);
                            } else if (arg5 == 1) {
                                var29 = arg2 + 8 - (-var11 + var27);
                                var30 = arg7 + var28 - var17;
                            } else if (arg5 == 2) {
                                var30 = var11 + arg7 + 8 - var27;
                                var29 = var17 + arg2 + 8 - var28;
                            } else {
                                var30 = arg7 + 8 - (-var17 + var28);
                                var29 = arg2 + var27 - var11;
                            }
                            if (var30 >= 0 && this.field3585 > var30 && var29 >= 0 && var29 < this.field3586) {
                                this.field3574[arg3][var30][var29] = this.field3574[arg3][var25 + var20][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -25886) {
            this.field3595 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[BI[BII)V")
    public static final void method1624(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field3587++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        if (arg5 != 1906915842) {
            method1622();
        }
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg4[var10001] += arg6[arg0++];
                int var14 = arg1++;
                arg4[var14] += arg6[arg0++];
                int var15 = arg1++;
                arg4[var15] += arg6[arg0++];
                int var16 = arg1++;
                arg4[var16] += arg6[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg4[var10001] += arg6[arg0++];
            }
            arg0 += arg3;
            arg1 += arg8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[[II)V")
    public final void method1625(int arg0, int[][] arg1, int arg2) {
        field3576++;
        int[][] var4 = this.field3574[arg2];
        for (int var5 = 0; var5 < this.field3585 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field3586 + 1); var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
        if (arg0 != -7185) {
            this.field3584 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILna;BLna;[[ILqa;Lna;)V")
    private final void method1626(int arg0, class35 arg1, byte arg2, class35 arg3, int[][] arg4, class162 arg5, class35 arg6) {
        field3578++;
        byte[][] var8 = this.field3595[arg0];
        byte[][] var9 = this.field3600[arg0];
        byte[][] var10 = this.field3584[arg0];
        byte[][] var11 = this.field3571[arg0];
        for (int var12 = 0; var12 < this.field3585; var12++) {
            int var13 = (this.field3585 - 1) <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3586; var14++) {
                int var15 = this.field3586 - 1 > var14 ? var14 + 1 : var14;
                if (class308.field4053 == -1 || class63.method436(arg0, var14, var12, class308.field4053, -2860)) {
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
                        class490 var26 = var21 == 0 ? null : this.field3594.method1138(var21 - 1, (byte) 12);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class363 var27 = var22 == 0 ? null : this.field3589.method386(false, var22 - 1);
                        class490 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6820 == -1 && var26.field6819 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6828;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field3585 > var12 && var14 < this.field3586) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var34++;
                            } else {
                                var32--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var32--;
                                var36--;
                            }
                            int var37 = var32 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method272(var12, var14) - arg3.method272(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method272(var13, var14) - arg3.method272(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class304.field4005[var39] = -1;
                            class154.field2246[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6828 ? class186.field2637[var19] : class17.field291[var19];
                        this.method1636(var12, var8, var27, var19, var11, var26, arg5, var18, var20, this.field3585, 1, var14, this.field3586, var9);
                        boolean var41 = var26 != null && var26.field6820 != var26.field6819;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class304.field4005[var42] >= 0 && class517.field7659[var42] != class455.field6240[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class138.method980(var18[1], class494.method2839(class154.field2246[2], class154.field2246[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class138.method980(var18[3], class494.method2839(class154.field2246[6], class154.field2246[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class138.method980(var18[0], class494.method2839(class154.field2246[0], class154.field2246[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class138.method980(var18[2], class494.method2839(class154.field2246[6], class154.field2246[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
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
                            var48 = class179.field2579[var19];
                            var49 = var27 == null ? 0 : class71.field1079[var19];
                            var46 = var26 == null ? 0 : class16.field287[var19];
                            var47 = class97.field1469[var19];
                            var45 = class337.field4416[var19];
                        } else if (var17) {
                            var46 = var26 == null ? 0 : class236.field3158[var19];
                            var47 = class153.field2235[var19];
                            var45 = class386.field5260[var19];
                            var48 = class344.field4555[var19];
                            var44 = class88.field1334[var19];
                            var49 = var27 == null ? 0 : class411.field5654[var19];
                        } else {
                            var45 = class85.field1292[var19];
                            var46 = var26 == null ? 0 : class154.field2240[var19];
                            var47 = class247.field3286[var19];
                            var48 = class98.field1473[var19];
                            var49 = var27 == null ? 0 : class452.field6151[var19];
                            var44 = class237.field3178[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class191.method1232(arg0, var12, var14);
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
                                var62 = var26.field6820;
                                var63 = arg5.method627() ? var26.field6810 : var26.field6831;
                                var64 = var26.field6812;
                                int var65 = class74.method477(arg5, var26, 6);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = 1;
                                        class466.field6436[2] = var47[var51];
                                        class466.field6436[3] = 1;
                                        class466.field6436[4] = var48[var51];
                                        class466.field6436[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = 5;
                                        class466.field6436[2] = var47[var51];
                                        class466.field6436[3] = 5;
                                        class466.field6436[4] = var48[var51];
                                        var98 = 6;
                                        class466.field6436[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = 3;
                                        class466.field6436[2] = var47[var51];
                                        class466.field6436[3] = 3;
                                        class466.field6436[4] = var48[var51];
                                        class466.field6436[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = 7;
                                        class466.field6436[2] = var47[var51];
                                        class466.field6436[3] = 7;
                                        class466.field6436[4] = var48[var51];
                                        class466.field6436[5] = var47[var51];
                                        var98 = 6;
                                    } else {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = var48[var51];
                                        class466.field6436[2] = var47[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class466.field6436[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field3602[var100];
                                        int var103 = this.field3575[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var105 = 128 - var102;
                                            var104 = var103;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var102;
                                            var105 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var104 = 128 - var103;
                                            var105 = var102;
                                        } else {
                                            var104 = var102;
                                            var105 = var103;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class156.field2278[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg6.method276(var106, var107) - arg3.method276(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class156.field2278[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg3.method276(var108, var109) - arg6.method276(var108, var109);
                                            } else if (arg1 != null && !class316.field4146[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg1.method276(var110, var111) - arg3.method276(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field6823 < class304.field4005[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class455.field6240[var101];
                                            }
                                            var59[var52] = class58.field910[var101];
                                            var58[var52] = class421.field5759[var101];
                                            var57[var52] = class517.field7659[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg5.method627() ? var26.field6810 : var26.field6831;
                                            var59[var52] = var26.field6812;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field3592 && arg0 == 0) {
                                    class54.method397(var12, var14, var26.field6827, var26.field6809 * 8, var26.field6830);
                                }
                                if (var19 != 12 && var26.field6820 != -1 && var26.field6808) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class16.field287[var19];
                            } else if (var17) {
                                var51 += class236.field3158[var19];
                            } else {
                                var51 += class154.field2240[var19];
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
                                class363 var67 = this.field3589.method386(false, var22 - 1);
                                class363 var68 = this.field3589.method386(false, var23 - 1);
                                class363 var69 = this.field3589.method386(false, var24 - 1);
                                class363 var70 = this.field3589.method386(false, var25 - 1);
                                for (int var71 = 0; var71 < var49; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = 1;
                                        class466.field6436[2] = var47[var51];
                                        class466.field6436[3] = 1;
                                        class466.field6436[4] = var48[var51];
                                        var73 = 6;
                                        class466.field6436[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = 5;
                                        class466.field6436[2] = var47[var51];
                                        class466.field6436[3] = 5;
                                        class466.field6436[4] = var48[var51];
                                        class466.field6436[5] = var47[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = 3;
                                        class466.field6436[2] = var47[var51];
                                        class466.field6436[3] = 3;
                                        class466.field6436[4] = var48[var51];
                                        class466.field6436[5] = var47[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = 7;
                                        class466.field6436[2] = var47[var51];
                                        class466.field6436[3] = 7;
                                        class466.field6436[4] = var48[var51];
                                        var73 = 6;
                                        class466.field6436[5] = var47[var51];
                                    } else {
                                        class466.field6436[0] = var45[var51];
                                        class466.field6436[1] = var48[var51];
                                        var73 = 3;
                                        class466.field6436[2] = var47[var51];
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class466.field6436[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field3602[var75];
                                        int var78 = this.field3575[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var80 = 128 - var77;
                                            var79 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var77;
                                            var80 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var79 = 128 - var78;
                                            var80 = var77;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class156.field2278[var19][var75]) {
                                            int var81 = (var12 << 7) + var79;
                                            int var82 = (var14 << 7) + var80;
                                            var60[var52] = arg6.method276(var81, var82) - arg3.method276(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class156.field2278[var19][var75]) {
                                                int var83 = (var12 << 7) + var79;
                                                int var84 = (var14 << 7) + var80;
                                                var61[var52] = arg3.method276(var83, var84) - arg6.method276(var83, var84);
                                            } else if (arg1 != null && !class316.field4146[var19][var75]) {
                                                int var85 = (var12 << 7) + var79;
                                                int var86 = (var14 << 7) + var80;
                                                var61[var52] = arg1.method276(var85, var86) - arg3.method276(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class304.field4005[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class455.field6240[var76];
                                            }
                                            var59[var52] = class58.field910[var76];
                                            var58[var52] = class421.field5759[var76];
                                            var57[var52] = class517.field7659[var76];
                                        } else {
                                            if (var17 && class156.field2278[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var67.field4906;
                                                var59[var52] = var67.field4920;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var68.field4906;
                                                var59[var52] = var68.field4920;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var69.field4906;
                                                var59[var52] = var69.field4920;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var70.field4906;
                                                var59[var52] = var70.field4920;
                                            } else {
                                                if (var79 < 64) {
                                                    if (var80 >= 64) {
                                                        var58[var52] = var68.field4906;
                                                        var59[var52] = var68.field4920;
                                                    } else {
                                                        var58[var52] = var67.field4906;
                                                        var59[var52] = var67.field4920;
                                                    }
                                                } else if (var80 >= 64) {
                                                    var58[var52] = var69.field4906;
                                                    var59[var52] = var69.field4920;
                                                } else {
                                                    var58[var52] = var70.field4906;
                                                    var59[var52] = var70.field4920;
                                                }
                                                int var87 = class312.method1810(-15980, var79 << 7 >> 7, arg4[var12][var14], arg4[var13][var14]);
                                                int var88 = class312.method1810(-15980, var79 << 7 >> 7, arg4[var12][var15], arg4[var13][var15]);
                                                var57[var52] = class312.method1810(-15980, var80 << 7 >> 7, var87, var88);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field4911) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg3.method272(var12, var14);
                            int var90 = arg3.method272(var13, var14);
                            int var91 = arg3.method272(var13, var15);
                            int var92 = arg3.method272(var12, var15);
                            if (arg0 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field6822) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field3599[arg0][var12][var14] = (byte) class191.method1230(this.field3599[arg0][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field3592) {
                                var94 = class461.method2626(var12, var14);
                                var95 = class157.method1076(var12, var14);
                                var96 = class50.method379(var12, var14);
                            }
                            arg3.method280(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class191.method1232(arg0, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg2 != 109) {
            field3581 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1627(int arg0, int arg1, byte arg2) {
        if (arg2 != -46) {
            method1624(88, -111, 34, -92, null, 65, null, 2, 125);
        }
        field3601++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1628(int arg0) {
        int var1 = -58 / ((arg0 + 76) / 40);
        field3572 = null;
        field3581 = null;
        field3588 = null;
        field3590 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lna;IILqa;Lna;[[ILna;)V")
    private final void method1629(class35 arg0, int arg1, int arg2, class162 arg3, class35 arg4, int[][] arg5, class35 arg6) {
        for (int var8 = arg2; var8 < this.field3585; var8++) {
            for (int var9 = 0; var9 < this.field3586; var9++) {
                if (class308.field4053 == -1 || class63.method436(arg1, var9, var8, class308.field4053, -2860)) {
                    byte var10 = this.field3595[arg1][var8][var9];
                    byte var11 = this.field3600[arg1][var8][var9];
                    int var12 = this.field3571[arg1][var8][var9] & 0xFF;
                    int var13 = this.field3584[arg1][var8][var9] & 0xFF;
                    class490 var14 = var12 == 0 ? null : this.field3594.method1138(var12 - 1, (byte) 12);
                    class363 var15 = var13 == 0 ? null : this.field3589.method386(false, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class71.field1079[var10];
                        var17 = var14 == null ? 0 : class16.field287[var10];
                    } else if (var14 != null) {
                        var17 = class16.field287[var10];
                    } else if (var15 != null) {
                        var16 = class16.field287[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field6820 == -1 && var14.field6819 == -1 && var14.field6810 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method627() ? var14.field6810 : var14.field6831;
                            if (class441.field6052) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field6812;
                                if (var14.field6820 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field6820;
                                }
                                if (var14.field6819 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field6819;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field3592 && arg1 == 0) {
                                class54.method397(var8, var9, var14.field6827, var14.field6809 * 8, var14.field6830);
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
                            int var28 = var15.field4906;
                            if (class441.field6052) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field4920;
                                var20[var19] = arg5[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field3602.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field3602[var36];
                            int var46 = this.field3575[var36];
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
                            if (var34 != null && class156.field2278[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method276(var49, var50) - arg6.method276(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class156.field2278[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method276(var51, var52) - arg0.method276(var51, var52);
                                } else if (arg4 != null && !class316.field4146[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method276(var53, var54) - arg6.method276(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method272(var8, var9);
                        int var38 = arg6.method272(var8 + 1, var9);
                        int var39 = arg6.method272(var8 + 1, var9 + 1);
                        int var40 = arg6.method272(var8, var9 + 1);
                        if (arg1 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field6822) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field3599[arg1][var8][var9] = (byte) class191.method1230(this.field3599[arg1][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field3592) {
                            var42 = class461.method2626(var8, var9);
                            var43 = class157.method1076(var8, var9);
                            var44 = class50.method379(var8, var9);
                        }
                        arg6.method275(var8, var9, var32, var34, var33, var35, class337.field4416[var10], class179.field2579[var10], class97.field1469[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class191.method1232(arg1, var8, var9);
                    }
                }
            }
        }
        field3582++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILqa;[Lcl;[[[I)V")
    public final void method1630(int arg0, class162 arg1, class173[] arg2, int[][][] arg3) {
        if (!this.field3592) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3585; var6++) {
                    for (int var7 = 0; var7 < this.field3586; var7++) {
                        if ((class117.field1677[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class117.field1677[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method1160(var6, var7, (byte) 56);
                            }
                        }
                    }
                }
            }
        }
        field3583++;
        if (arg0 != 1) {
            return;
        }
        for (int var9 = 0; var9 < this.field3591; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3592) {
                if (class56.field876) {
                    var10 |= 0x2;
                }
                if (class162.field2370) {
                    var11 |= 0x8;
                }
                if (class176.field2559 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class339.field4427) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class56.field876) {
                var11 |= 0x7;
            }
            if (!class53.field832) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field3574[var9] : arg3[var9];
            class217.method1380(var9, arg1.method556(this.field3585, this.field3586, this.field3574[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lna;Lna;BLqa;)V")
    public final void method1631(class35 arg0, class35 arg1, byte arg2, class162 arg3) {
        field3577++;
        int[][] var5 = new int[this.field3585][this.field3586];
        if (class88.field1339 == null || class88.field1339.length != this.field3586) {
            class88.field1339 = new int[this.field3586];
            class525.field7770 = new int[this.field3586];
            class327.field4327 = new int[this.field3586];
            class256.field3379 = new int[this.field3586];
            class525.field7776 = new int[this.field3586];
        }
        if (arg2 != 58) {
            this.field3584 = null;
        }
        for (int var6 = 0; var6 < this.field3591; var6++) {
            for (int var8 = 0; var8 < this.field3586; var8++) {
                class88.field1339[var8] = 0;
                class525.field7776[var8] = 0;
                class525.field7770[var8] = 0;
                class327.field4327[var8] = 0;
                class256.field3379[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3585; var9++) {
                for (int var10 = 0; var10 < this.field3586; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field3585) {
                        int var20 = this.field3584[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class363 var21 = this.field3589.method386(false, var20 - 1);
                            class88.field1339[var10] += var21.field4904;
                            class525.field7776[var10] += var21.field4910;
                            class525.field7770[var10] += var21.field4905;
                            class327.field4327[var10] += var21.field4907;
                            var10002 = class256.field3379[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3584[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class363 var24 = this.field3589.method386(false, var23 - 1);
                            class88.field1339[var10] -= var24.field4904;
                            class525.field7776[var10] -= var24.field4910;
                            class525.field7770[var10] -= var24.field4905;
                            class327.field4327[var10] -= var24.field4907;
                            var10002 = class256.field3379[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3586; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field3586) {
                            var12 += class525.field7776[var17];
                            var15 += class256.field3379[var17];
                            var13 += class525.field7770[var17];
                            var14 += class327.field4327[var17];
                            var11 += class88.field1339[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class525.field7776[var18];
                            var15 -= class256.field3379[var18];
                            var13 -= class525.field7770[var18];
                            var14 -= class327.field4327[var18];
                            var11 -= class88.field1339[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class29.method237(var11 * 256 / var14, var13 / var15, 8906, var12 / var15);
                        }
                    }
                }
            }
            if (class316.field4138) {
                this.method1626(var6, var6 == 0 ? arg1 : null, (byte) 109, class141.field2049[var6], var5, arg3, var6 == 0 ? arg0 : null);
            } else {
                this.method1629(var6 == 0 ? arg0 : null, var6, 0, arg3, var6 == 0 ? arg1 : null, var5, class141.field2049[var6]);
            }
            this.field3584[var6] = null;
            this.field3571[var6] = null;
            this.field3595[var6] = null;
            this.field3600[var6] = null;
        }
        if (!this.field3592) {
            if (class176.field2559 != 0) {
                class123.method902();
            }
            if (class56.field876) {
                class370.method2142();
            }
        }
        for (int var7 = 0; var7 < this.field3591; var7++) {
            class141.field2049[var7].method268();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lmd;IIIZIIIIII)V")
    private final void method1632(class379 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 != 13) {
            return;
        }
        if (arg10 == 1) {
            arg1 = 1;
        } else if (arg10 == 2) {
            arg6 = 1;
            arg1 = 1;
        } else if (arg10 == 3) {
            arg6 = 1;
        }
        field3596++;
        if (arg3 < 0 || this.field3585 <= arg3 || arg9 < 0 || arg9 >= this.field3586) {
            while (true) {
                int var14 = arg0.method2238(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg0.method2238(255);
                    return;
                }
                if (var14 <= 49) {
                    arg0.method2238(255);
                }
            }
        }
        if (!this.field3592 && !arg4) {
            class117.field1677[arg8][arg3][arg9] = 0;
        }
        while (true) {
            int var12 = arg0.method2238(255);
            if (var12 == 0) {
                if (this.field3592) {
                    this.field3574[0][arg3 + arg6][arg1 + arg9] = 0;
                    return;
                } else if (arg8 == 0) {
                    this.field3574[0][arg3 + arg6][arg1 + arg9] = -class149.method1028(arg2 + 556238, class106.method743(arg5, -65), arg7 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field3574[arg8][arg3 + arg6][arg1 + arg9] = this.field3574[arg8 - 1][arg3 + arg6][arg1 + arg9] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg0.method2238(arg5 ^ 0xF2);
                if (!this.field3592) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg8 != 0) {
                        this.field3574[arg8][arg3 + arg6][arg1 + arg9] = this.field3574[arg8 - 1][arg3 + arg6][arg1 + arg9] - (var13 * 8 << 0);
                        return;
                    }
                    this.field3574[0][arg3 + arg6][arg1 + arg9] = -var13 * 8 << 0;
                    return;
                }
                this.field3574[0][arg3 + arg6][arg1 + arg9] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg4) {
                    arg0.method2238(arg5 ^ 0xF2);
                } else {
                    this.field3571[arg8][arg3][arg9] = arg0.method2194(-1);
                    this.field3595[arg8][arg3][arg9] = (byte) ((var12 - 2) / 4);
                    this.field3600[arg8][arg3][arg9] = (byte) class494.method2839(3, arg10 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field3592 && !arg4) {
                    class117.field1677[arg8][arg3][arg9] = (byte) (var12 - 49);
                }
            } else if (!arg4) {
                this.field3584[arg8][arg3][arg9] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIB[Lcl;Lmd;)V")
    public final void method1633(int arg0, int arg1, int arg2, int arg3, byte arg4, class173[] arg5, class379 arg6) {
        field3573++;
        if (!this.field3592) {
            for (int var8 = 0; var8 < 4; var8++) {
                class173 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && this.field3585 > var12 && var13 >= 0 && this.field3586 > var13) {
                            var9.method1157(var13, var12, (byte) -108);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg3;
        int var15 = arg0 + arg2;
        int var16 = 13 / ((arg4 - 54) / 59);
        for (int var17 = 0; var17 < this.field3591; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method1632(arg6, 0, var15 + var19, arg3 + var18, false, 13, 0, var14 + var18, var17, arg2 + var19, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIIIII)V")
    public final void method1634(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < arg3 + arg4; var7++) {
            for (int var10 = arg1; var10 < arg1 + arg5; var10++) {
                if (var10 >= 0 && this.field3585 > var10 && var7 >= 0 && this.field3586 > var7) {
                    this.field3574[arg2][var10][var7] = arg2 > 0 ? this.field3574[arg2 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        field3597++;
        if (arg1 > 0 && this.field3585 > arg1) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg4); var8++) {
                if (var8 >= 0 && this.field3586 > var8) {
                    this.field3574[arg2][arg1][var8] = this.field3574[arg2][arg1 - 1][var8];
                }
            }
        }
        if (arg0 != 2) {
            this.field3593 = null;
        }
        if (arg3 > 0 && this.field3586 > arg3) {
            for (int var9 = arg1 + 1; var9 < arg1 + arg5; var9++) {
                if (var9 >= 0 && this.field3585 > var9) {
                    this.field3574[arg2][var9][arg3] = this.field3574[arg2][var9][arg3 - 1];
                }
            }
        }
        if (arg1 < 0 || arg3 < 0 || arg1 >= this.field3585 || this.field3586 <= arg3) {
            return;
        }
        if (arg2 != 0) {
            if (arg1 > 0 && this.field3574[arg2 - 1][arg1 - 1][arg3] != this.field3574[arg2][arg1 - 1][arg3]) {
                this.field3574[arg2][arg1][arg3] = this.field3574[arg2][arg1 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field3574[arg2][arg1][arg3 - 1] != this.field3574[arg2 - 1][arg1][arg3 - 1]) {
                this.field3574[arg2][arg1][arg3] = this.field3574[arg2][arg1][arg3 - 1];
                return;
            }
            if (arg1 > 0 && arg3 > 0 && this.field3574[arg2 - 1][arg1 - 1][arg3 - 1] != this.field3574[arg2][arg1 - 1][arg3 - 1]) {
                this.field3574[arg2][arg1][arg3] = this.field3574[arg2][arg1 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg1 > 0 && this.field3574[arg2][arg1 - 1][arg3] != 0) {
            this.field3574[arg2][arg1][arg3] = this.field3574[arg2][arg1 - 1][arg3];
            return;
        }
        if (arg3 > 0 && this.field3574[arg2][arg1][arg3 - 1] != 0) {
            this.field3574[arg2][arg1][arg3] = this.field3574[arg2][arg1][arg3 - 1];
            return;
        }
        if (arg1 > 0 && arg3 > 0 && this.field3574[arg2][arg1 - 1][arg3 - 1] != 0) {
            this.field3574[arg2][arg1][arg3] = this.field3574[arg2][arg1 - 1][arg3 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIII)V")
    public final void method1635(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            method1627(26, 28, (byte) -25);
        }
        for (int var6 = 0; var6 < this.field3591; var6++) {
            this.method1634((byte) 2, arg3, var6, arg4, arg2, arg1);
        }
        field3598++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[[BLhr;I[[BLdq;Lqa;[ZIIIII[[B)V")
    private final void method1636(int arg0, byte[][] arg1, class363 arg2, int arg3, byte[][] arg4, class490 arg5, class162 arg6, boolean[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, byte[][] arg13) {
        if (arg10 != 1) {
            this.field3599 = null;
        }
        field3570++;
        if (arg5 != null && arg2 != null || arg2 != null && arg3 == 12 || arg5 != null && arg3 == 0) {
            boolean[] var15 = arg5 != null && arg5.field6828 ? class186.field2637[arg3] : class17.field291[arg3];
            if (arg11 > 0) {
                if (arg0 > 0) {
                    int var16 = arg4[arg0 - 1][arg11 - 1] & 0xFF;
                    if (var16 > 0) {
                        class490 var17 = this.field3594.method1138(var16 - 1, (byte) 12);
                        if (var17.field6820 != -1 && var17.field6828) {
                            byte var18 = arg1[arg0 - 1][arg11 - 1];
                            int var19 = (arg13[arg0 - 1][arg11 - 1] * 2) + 4 & 0x7;
                            int var20 = class74.method477(arg6, var17, arg10 ^ 0x7);
                            if (class156.field2278[var18][var19]) {
                                class517.field7659[0] = var17.field6820;
                                class455.field6240[0] = var20;
                                class421.field5759[0] = arg6.method627() ? var17.field6810 : var17.field6831;
                                class58.field910[0] = var17.field6812;
                                class304.field4005[0] = var17.field6823;
                                class154.field2246[0] = 256;
                            }
                        }
                    }
                }
                if ((arg9 - 1) > arg0) {
                    int var21 = arg4[arg0 + 1][arg11 - 1] & 0xFF;
                    if (var21 > 0) {
                        class490 var22 = this.field3594.method1138(var21 - 1, (byte) 12);
                        if (var22.field6820 != -1 && var22.field6828) {
                            byte var23 = arg1[arg0 + 1][arg11 - 1];
                            int var24 = arg13[arg0 + 1][arg11 - 1] * 2 + 6 & 0x7;
                            int var25 = class74.method477(arg6, var22, 6);
                            if (class156.field2278[var23][var24]) {
                                class517.field7659[2] = var22.field6820;
                                class455.field6240[2] = var25;
                                class421.field5759[2] = arg6.method627() ? var22.field6810 : var22.field6831;
                                class58.field910[2] = var22.field6812;
                                class304.field4005[2] = var22.field6823;
                                class154.field2246[2] = 512;
                            }
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg11) {
                if (arg0 > 0) {
                    int var26 = arg4[arg0 - 1][arg11 + 1] & 0xFF;
                    if (var26 > 0) {
                        class490 var27 = this.field3594.method1138(var26 - 1, (byte) 12);
                        if (var27.field6820 != -1 && var27.field6828) {
                            byte var28 = arg1[arg0 - 1][arg11 + 1];
                            int var29 = (arg13[arg0 - 1][arg11 + 1] * 2) + 2 & 0x7;
                            int var30 = class74.method477(arg6, var27, arg10 ^ 0x7);
                            if (class156.field2278[var28][var29]) {
                                class517.field7659[6] = var27.field6820;
                                class455.field6240[6] = var30;
                                class421.field5759[6] = arg6.method627() ? var27.field6810 : var27.field6831;
                                class58.field910[6] = var27.field6812;
                                class304.field4005[6] = var27.field6823;
                                class154.field2246[6] = 64;
                            }
                        }
                    }
                }
                if ((arg9 - 1) > arg0) {
                    int var31 = arg4[arg0 + 1][arg11 + 1] & 0xFF;
                    if (var31 > 0) {
                        class490 var32 = this.field3594.method1138(var31 - 1, (byte) 12);
                        if (var32.field6820 != -1 && var32.field6828) {
                            byte var33 = arg1[arg0 + 1][arg11 + 1];
                            int var34 = -(-(arg13[arg0 + 1][arg11 + 1] * 2)) & 0x7;
                            int var35 = class74.method477(arg6, var32, 6);
                            if (class156.field2278[var33][var34]) {
                                class517.field7659[4] = var32.field6820;
                                class455.field6240[4] = var35;
                                class421.field5759[4] = arg6.method627() ? var32.field6810 : var32.field6831;
                                class58.field910[4] = var32.field6812;
                                class304.field4005[4] = var32.field6823;
                                class154.field2246[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg11 > 0) {
                int var36 = arg4[arg0][arg11 - 1] & 0xFF;
                if (var36 > 0) {
                    class490 var37 = this.field3594.method1138(var36 - 1, (byte) 12);
                    if (var37.field6820 != -1) {
                        byte var38 = arg1[arg0][arg11 - 1];
                        byte var39 = arg13[arg0][arg11 - 1];
                        if (var37.field6828) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class74.method477(arg6, var37, 6);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class156.field2278[var38][var41] && class304.field4005[var40] <= var37.field6823) {
                                    class517.field7659[var40] = var37.field6820;
                                    class455.field6240[var40] = var42;
                                    class421.field5759[var40] = arg6.method627() ? var37.field6810 : var37.field6831;
                                    class58.field910[var40] = var37.field6812;
                                    if (class304.field4005[var40] == var37.field6823) {
                                        class154.field2246[var40] = class191.method1230(class154.field2246[var40], 32);
                                    } else {
                                        class154.field2246[var40] = 32;
                                    }
                                    class304.field4005[var40] = var37.field6823;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg8 & 0x3]) {
                                arg7[0] = class186.field2637[var38][class494.method2839(var39 + 2, 3)];
                            }
                        } else if (!var15[arg8 & 0x3]) {
                            arg7[0] = class17.field291[var38][class494.method2839(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg12 - 1 > arg11) {
                int var44 = arg4[arg0][arg11 + 1] & 0xFF;
                if (var44 > 0) {
                    class490 var45 = this.field3594.method1138(var44 - 1, (byte) 12);
                    if (var45.field6820 != -1) {
                        byte var46 = arg1[arg0][arg11 + 1];
                        byte var47 = arg13[arg0][arg11 + 1];
                        if (var45.field6828) {
                            int var48 = 4;
                            int var49 = (var47 * 2) + 2;
                            int var50 = class74.method477(arg6, var45, 6);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class156.field2278[var46][var49] && class304.field4005[var48] <= var45.field6823) {
                                    class517.field7659[var48] = var45.field6820;
                                    class455.field6240[var48] = var50;
                                    class421.field5759[var48] = arg6.method627() ? var45.field6810 : var45.field6831;
                                    class58.field910[var48] = var45.field6812;
                                    if (class304.field4005[var48] == var45.field6823) {
                                        class154.field2246[var48] = class191.method1230(class154.field2246[var48], 16);
                                    } else {
                                        class154.field2246[var48] = 16;
                                    }
                                    class304.field4005[var48] = var45.field6823;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg8 + 2 & 0x3]) {
                                arg7[2] = class186.field2637[var46][class494.method2839(var47, 3)];
                            }
                        } else if (!var15[arg8 + 2 & 0x3]) {
                            arg7[2] = class17.field291[var46][class494.method2839(var47, 3)];
                        }
                    }
                }
            }
            if (arg0 > 0) {
                int var52 = arg4[arg0 - 1][arg11] & 0xFF;
                if (var52 > 0) {
                    class490 var53 = this.field3594.method1138(var52 - 1, (byte) 12);
                    if (var53.field6820 != -1) {
                        byte var54 = arg1[arg0 - 1][arg11];
                        byte var55 = arg13[arg0 - 1][arg11];
                        if (var53.field6828) {
                            int var56 = 6;
                            int var57 = (var55 * 2) + 4;
                            int var58 = class74.method477(arg6, var53, arg10 + 5);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class156.field2278[var54][var57] && class304.field4005[var56] <= var53.field6823) {
                                    class517.field7659[var56] = var53.field6820;
                                    class455.field6240[var56] = var58;
                                    class421.field5759[var56] = arg6.method627() ? var53.field6810 : var53.field6831;
                                    class58.field910[var56] = var53.field6812;
                                    if (class304.field4005[var56] == var53.field6823) {
                                        class154.field2246[var56] = class191.method1230(class154.field2246[var56], 8);
                                    } else {
                                        class154.field2246[var56] = 8;
                                    }
                                    class304.field4005[var56] = var53.field6823;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg8 + 3 & 0x3]) {
                                arg7[3] = class186.field2637[var54][class494.method2839(var55 + 1, 3)];
                            }
                        } else if (!var15[arg8 + 3 & 0x3]) {
                            arg7[3] = class17.field291[var54][class494.method2839(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg0 < arg9 - 1) {
                int var60 = arg4[arg0 + 1][arg11] & 0xFF;
                if (var60 > 0) {
                    class490 var61 = this.field3594.method1138(var60 - 1, (byte) 12);
                    if (var61.field6820 != -1) {
                        byte var62 = arg1[arg0 + 1][arg11];
                        byte var63 = arg13[arg0 + 1][arg11];
                        if (var61.field6828) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class74.method477(arg6, var61, 6);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class156.field2278[var62][var65] && class304.field4005[var64] <= var61.field6823) {
                                    class517.field7659[var64] = var61.field6820;
                                    class455.field6240[var64] = var66;
                                    class421.field5759[var64] = arg6.method627() ? var61.field6810 : var61.field6831;
                                    class58.field910[var64] = var61.field6812;
                                    if (class304.field4005[var64] == var61.field6823) {
                                        class154.field2246[var64] = class191.method1230(class154.field2246[var64], 4);
                                    } else {
                                        class154.field2246[var64] = 4;
                                    }
                                    class304.field4005[var64] = var61.field6823;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg8 + 1 & 0x3]) {
                                arg7[1] = class186.field2637[var62][class494.method2839(3, var63 + 3)];
                            }
                        } else if (!var15[arg8 + 1 & 0x3]) {
                            arg7[1] = class17.field291[var62][class494.method2839(3, var63 + 3)];
                        }
                    }
                }
            }
        }
        if (arg5 == null) {
            return;
        }
        int var68 = class74.method477(arg6, arg5, 6);
        if (!arg5.field6828) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg8 * 2) & 0x7;
            if (class156.field2278[arg3][var69] && arg5.field6823 >= class304.field4005[var70]) {
                class517.field7659[var70] = arg5.field6820;
                class455.field6240[var70] = var68;
                class421.field5759[var70] = arg6.method627() ? arg5.field6810 : arg5.field6831;
                class58.field910[var70] = arg5.field6812;
                if (class304.field4005[var70] == arg5.field6823) {
                    class154.field2246[var70] = class191.method1230(class154.field2246[var70], 2);
                } else {
                    class154.field2246[var70] = 2;
                }
                class304.field4005[var70] = arg5.field6823;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIZLuk;Lu;)V")
    public class273(int arg0, int arg1, int arg2, boolean arg3, class170 arg4, class52 arg5) {
        this.field3586 = arg2;
        this.field3594 = arg4;
        this.field3591 = arg0;
        this.field3592 = arg3;
        this.field3585 = arg1;
        this.field3589 = arg5;
        this.field3574 = new int[this.field3591][this.field3585 + 1][this.field3586 + 1];
        this.field3600 = new byte[this.field3591][this.field3585][this.field3586];
        this.field3584 = new byte[this.field3591][this.field3585][this.field3586];
        this.field3571 = new byte[this.field3591][this.field3585][this.field3586];
        this.field3599 = new byte[this.field3591][this.field3585 + 1][this.field3586 + 1];
        this.field3595 = new byte[this.field3591][this.field3585][this.field3586];
    }
}
