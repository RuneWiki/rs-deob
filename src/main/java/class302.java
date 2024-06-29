import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class302 {

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "[I")
    private int[] field4157 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[I")
    private int[] field4145 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Z")
    public boolean field4139;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "Ler;")
    private class90 field4163;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "Lcaa;")
    private class253 field4165;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "[[[B")
    private byte[][][] field4164;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "[[[B")
    private byte[][][] field4144;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "[[[B")
    private byte[][][] field4141;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "[[[B")
    public byte[][][] field4142;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "[[[I")
    public int[][][] field4150;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "[[[B")
    private byte[][][] field4153;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field4137 = 0;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "Lha;")
    public static class53 field4155;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "[[Lvp;")
    public static class162[][] field4135;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "[[[B")
    public byte[][][] field4148;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([[BIII[[BLls;Lqa;I[[BBILdp;I[Z)V")
    private final void method1846(byte[][] arg0, int arg1, int arg2, int arg3, byte[][] arg4, class121 arg5, class208 arg6, int arg7, byte[][] arg8, byte arg9, int arg10, class3 arg11, int arg12, boolean[] arg13) {
        field4151++;
        boolean[] var15 = arg5 != null && arg5.field1697 ? class359.field4886[arg10] : class549.field8210[arg10];
        if (arg3 > 0) {
            if (arg12 > 0) {
                int var16 = arg4[arg12 - 1][arg3 - 1] & 0xFF;
                if (var16 > 0) {
                    class121 var17 = this.field4163.method676(38, var16 - 1);
                    if (var17.field1699 != -1 && var17.field1697) {
                        byte var18 = arg8[arg12 - 1][arg3 - 1];
                        int var19 = arg0[arg12 - 1][arg3 - 1] * 2 + 4 & 0x7;
                        int var20 = class116.method833(arg6, 124, var17);
                        if (class94.field1401[var18][var19]) {
                            class183.field2755[0] = var17.field1699;
                            class504.field7142[0] = var20;
                            class375.field5186[0] = arg6.method499() ? var17.field1698 : var17.field1708;
                            class586.field8610[0] = var17.field1714;
                            class388.field5332[0] = var17.field1702;
                            class132.field1815[0] = 256;
                        }
                    }
                }
            }
            if ((arg7 - 1) > arg12) {
                int var21 = arg4[arg12 + 1][arg3 - 1] & 0xFF;
                if (var21 > 0) {
                    class121 var22 = this.field4163.method676(32, var21 - 1);
                    if (var22.field1699 != -1 && var22.field1697) {
                        byte var23 = arg8[arg12 + 1][arg3 - 1];
                        int var24 = (arg0[arg12 + 1][arg3 - 1] * 2) + 6 & 0x7;
                        int var25 = class116.method833(arg6, 122, var22);
                        if (class94.field1401[var23][var24]) {
                            class183.field2755[2] = var22.field1699;
                            class504.field7142[2] = var25;
                            class375.field5186[2] = arg6.method499() ? var22.field1698 : var22.field1708;
                            class586.field8610[2] = var22.field1714;
                            class388.field5332[2] = var22.field1702;
                            class132.field1815[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg3 < (arg2 - 1)) {
            if (arg12 > 0) {
                int var26 = arg4[arg12 - 1][arg3 + 1] & 0xFF;
                if (var26 > 0) {
                    class121 var27 = this.field4163.method676(13, var26 - 1);
                    if (var27.field1699 != -1 && var27.field1697) {
                        byte var28 = arg8[arg12 - 1][arg3 + 1];
                        int var29 = (arg0[arg12 - 1][arg3 + 1] * 2) + 2 & 0x7;
                        int var30 = class116.method833(arg6, 119, var27);
                        if (class94.field1401[var28][var29]) {
                            class183.field2755[6] = var27.field1699;
                            class504.field7142[6] = var30;
                            class375.field5186[6] = arg6.method499() ? var27.field1698 : var27.field1708;
                            class586.field8610[6] = var27.field1714;
                            class388.field5332[6] = var27.field1702;
                            class132.field1815[6] = 64;
                        }
                    }
                }
            }
            if ((arg7 - 1) > arg12) {
                int var31 = arg4[arg12 + 1][arg3 + 1] & 0xFF;
                if (var31 > 0) {
                    class121 var32 = this.field4163.method676(51, var31 - 1);
                    if (var32.field1699 != -1 && var32.field1697) {
                        byte var33 = arg8[arg12 + 1][arg3 + 1];
                        int var34 = -(-(arg0[arg12 + 1][arg3 + 1] * 2)) & 0x7;
                        int var35 = class116.method833(arg6, 118, var32);
                        if (class94.field1401[var33][var34]) {
                            class183.field2755[4] = var32.field1699;
                            class504.field7142[4] = var35;
                            class375.field5186[4] = arg6.method499() ? var32.field1698 : var32.field1708;
                            class586.field8610[4] = var32.field1714;
                            class388.field5332[4] = var32.field1702;
                            class132.field1815[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var36 = arg4[arg12][arg3 - 1] & 0xFF;
            if (var36 > 0) {
                class121 var37 = this.field4163.method676(113, var36 - 1);
                if (var37.field1699 != -1) {
                    byte var38 = arg8[arg12][arg3 - 1];
                    byte var39 = arg0[arg12][arg3 - 1];
                    if (var37.field1697) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class116.method833(arg6, 126, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class94.field1401[var38][var41] && class388.field5332[var40] <= var37.field1702) {
                                class183.field2755[var40] = var37.field1699;
                                class504.field7142[var40] = var42;
                                class375.field5186[var40] = arg6.method499() ? var37.field1698 : var37.field1708;
                                class586.field8610[var40] = var37.field1714;
                                if (class388.field5332[var40] == var37.field1702) {
                                    class132.field1815[var40] = class473.method2847(class132.field1815[var40], 32);
                                } else {
                                    class132.field1815[var40] = 32;
                                }
                                class388.field5332[var40] = var37.field1702;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg1 & 0x3]) {
                            arg13[0] = class359.field4886[var38][class37.method245(3, var39 + 2)];
                        }
                    } else if (!var15[arg1 & 0x3]) {
                        arg13[0] = class549.field8210[var38][class37.method245(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg9 <= 32) {
            this.method1856(53, -20, null, -62, 123, 43, -3, -55, 37, false, 106);
        }
        if (arg2 - 1 > arg3) {
            int var44 = arg4[arg12][arg3 + 1] & 0xFF;
            if (var44 > 0) {
                class121 var45 = this.field4163.method676(18, var44 - 1);
                if (var45.field1699 != -1) {
                    byte var46 = arg8[arg12][arg3 + 1];
                    byte var47 = arg0[arg12][arg3 + 1];
                    if (var45.field1697) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class116.method833(arg6, 124, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class94.field1401[var46][var49] && class388.field5332[var48] <= var45.field1702) {
                                class183.field2755[var48] = var45.field1699;
                                class504.field7142[var48] = var50;
                                class375.field5186[var48] = arg6.method499() ? var45.field1698 : var45.field1708;
                                class586.field8610[var48] = var45.field1714;
                                if (class388.field5332[var48] == var45.field1702) {
                                    class132.field1815[var48] = class473.method2847(class132.field1815[var48], 16);
                                } else {
                                    class132.field1815[var48] = 16;
                                }
                                class388.field5332[var48] = var45.field1702;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg1 + 2 & 0x3]) {
                            arg13[2] = class359.field4886[var46][class37.method245(3, -(-var47))];
                        }
                    } else if (!var15[arg1 + 2 & 0x3]) {
                        arg13[2] = class549.field8210[var46][class37.method245(var47, 3)];
                    }
                }
            }
        }
        if (arg12 > 0) {
            int var52 = arg4[arg12 - 1][arg3] & 0xFF;
            if (var52 > 0) {
                class121 var53 = this.field4163.method676(89, var52 - 1);
                if (var53.field1699 != -1) {
                    byte var54 = arg8[arg12 - 1][arg3];
                    byte var55 = arg0[arg12 - 1][arg3];
                    if (var53.field1697) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class116.method833(arg6, 122, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class94.field1401[var54][var57] && var53.field1702 >= class388.field5332[var56]) {
                                class183.field2755[var56] = var53.field1699;
                                class504.field7142[var56] = var58;
                                class375.field5186[var56] = arg6.method499() ? var53.field1698 : var53.field1708;
                                class586.field8610[var56] = var53.field1714;
                                if (class388.field5332[var56] == var53.field1702) {
                                    class132.field1815[var56] = class473.method2847(class132.field1815[var56], 8);
                                } else {
                                    class132.field1815[var56] = 8;
                                }
                                class388.field5332[var56] = var53.field1702;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg1 + 3 & 0x3]) {
                            arg13[3] = class359.field4886[var54][class37.method245(3, var55 + 1)];
                        }
                    } else if (!var15[arg1 + 3 & 0x3]) {
                        arg13[3] = class549.field8210[var54][class37.method245(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg12 < arg7 - 1) {
            int var60 = arg4[arg12 + 1][arg3] & 0xFF;
            if (var60 > 0) {
                class121 var61 = this.field4163.method676(79, var60 - 1);
                if (var61.field1699 != -1) {
                    byte var62 = arg8[arg12 + 1][arg3];
                    byte var63 = arg0[arg12 + 1][arg3];
                    if (var61.field1697) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class116.method833(arg6, 124, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class94.field1401[var62][var65] && var61.field1702 >= class388.field5332[var64]) {
                                class183.field2755[var64] = var61.field1699;
                                class504.field7142[var64] = var66;
                                class375.field5186[var64] = arg6.method499() ? var61.field1698 : var61.field1708;
                                class586.field8610[var64] = var61.field1714;
                                if (class388.field5332[var64] == var61.field1702) {
                                    class132.field1815[var64] = class473.method2847(class132.field1815[var64], 4);
                                } else {
                                    class132.field1815[var64] = 4;
                                }
                                class388.field5332[var64] = var61.field1702;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg1 + 1 & 0x3]) {
                            arg13[1] = class359.field4886[var62][class37.method245(3, var63 + 3)];
                        }
                    } else if (!var15[arg1 + 1 & 0x3]) {
                        arg13[1] = class549.field8210[var62][class37.method245(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg5 == null) {
            return;
        }
        int var68 = class116.method833(arg6, 116, arg5);
        if (!arg5.field1697) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg1 * 2) & 0x7;
            if (class94.field1401[arg10][var69] && arg5.field1702 >= class388.field5332[var70]) {
                class183.field2755[var70] = arg5.field1699;
                class504.field7142[var70] = var68;
                class375.field5186[var70] = arg6.method499() ? arg5.field1698 : arg5.field1708;
                class586.field8610[var70] = arg5.field1714;
                if (class388.field5332[var70] == arg5.field1702) {
                    class132.field1815[var70] = class473.method2847(class132.field1815[var70], 2);
                } else {
                    class132.field1815[var70] = 2;
                }
                class388.field5332[var70] = arg5.field1702;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static void method1847(byte arg0) {
        if (arg0 < 81) {
            field4135 = null;
        }
        field4155 = null;
        field4135 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lsa;Lsa;Lqa;I)V")
    public final void method1848(class176 arg0, class176 arg1, class208 arg2, int arg3) {
        field4161++;
        if (class496.field7055 == null || class496.field7055.length != this.field4149) {
            class408.field5573 = new int[this.field4149];
            class496.field7055 = new int[this.field4149];
            class601.field8919 = new int[this.field4149];
            class133.field1822 = new int[this.field4149];
            class482.field6883 = new int[this.field4149];
        }
        int[][] var5 = new int[this.field4138][this.field4149];
        for (int var6 = 0; var6 < this.field4140; var6++) {
            for (int var8 = 0; var8 < this.field4149; var8++) {
                class496.field7055[var8] = 0;
                class408.field5573[var8] = 0;
                class482.field6883[var8] = 0;
                class601.field8919[var8] = 0;
                class133.field1822[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field4138; var9++) {
                for (int var10 = 0; var10 < this.field4149; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field4138 > var19) {
                        int var20 = this.field4164[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class3 var21 = this.field4165.method1630(125, var20 - 1);
                            class496.field7055[var10] += var21.field23;
                            class408.field5573[var10] += var21.field26;
                            class482.field6883[var10] += var21.field15;
                            class601.field8919[var10] += var21.field16;
                            var10002 = class133.field1822[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field4164[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class3 var24 = this.field4165.method1630(125, var23 - 1);
                            class496.field7055[var10] -= var24.field23;
                            class408.field5573[var10] -= var24.field26;
                            class482.field6883[var10] -= var24.field15;
                            class601.field8919[var10] -= var24.field16;
                            var10002 = class133.field1822[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field4149; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field4149) {
                            var11 += class496.field7055[var17];
                            var13 += class482.field6883[var17];
                            var14 += class601.field8919[var17];
                            var15 += class133.field1822[var17];
                            var12 += class408.field5573[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class482.field6883[var18];
                            var11 -= class496.field7055[var18];
                            var14 -= class601.field8919[var18];
                            var15 -= class133.field1822[var18];
                            var12 -= class408.field5573[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class423.method2482(var11 * 256 / var14, var12 / var15, (byte) 99, var13 / var15);
                        }
                    }
                }
            }
            if (class196.field2896) {
                this.method1854(var6 == 0 ? arg1 : null, var5, (byte) 93, class165.field2609[var6], arg2, var6 == 0 ? arg0 : null, var6);
            } else {
                this.method1849(var6, var6 == 0 ? arg1 : null, class165.field2609[var6], arg2, 0, var6 == 0 ? arg0 : null, var5);
            }
            this.field4164[var6] = null;
            this.field4153[var6] = null;
            this.field4141[var6] = null;
            this.field4144[var6] = null;
        }
        if (!this.field4139) {
            if (class473.field6690 != 0) {
                class236.method1514();
            }
            if (class521.field7438) {
                class643.method3718();
            }
        }
        if (arg3 <= 20) {
            this.field4165 = null;
        }
        for (int var7 = 0; var7 < this.field4140; var7++) {
            class165.field2609[var7].method1237();
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILsa;Lsa;Lqa;ILsa;[[I)V")
    private final void method1849(int arg0, class176 arg1, class176 arg2, class208 arg3, int arg4, class176 arg5, int[][] arg6) {
        for (int var8 = arg4; var8 < this.field4138; var8++) {
            for (int var9 = 0; var9 < this.field4149; var9++) {
                if (class42.field486 == -1 || class615.method3610(15488, class42.field486, var9, var8, arg0)) {
                    byte var10 = this.field4141[arg0][var8][var9];
                    byte var11 = this.field4144[arg0][var8][var9];
                    int var12 = this.field4153[arg0][var8][var9] & 0xFF;
                    int var13 = this.field4164[arg0][var8][var9] & 0xFF;
                    class121 var14 = var12 == 0 ? null : this.field4163.method676(arg4 + 52, var12 + -1);
                    class3 var15 = var13 == 0 ? null : this.field4165.method1630(arg4 - 52, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class351.field4784[var10];
                        var17 = var14 == null ? 0 : class444.field5997[var10];
                    } else if (var14 != null) {
                        var17 = class444.field5997[var10];
                    } else if (var15 != null) {
                        var16 = class444.field5997[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field1699 == -1 && var14.field1703 == -1 && var14.field1698 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method499() ? var14.field1698 : var14.field1708;
                            if (class193.field2863) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field1714;
                                if (var14.field1699 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field1699;
                                }
                                if (var14.field1703 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field1703;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field4139 && arg0 == 0) {
                                class516.method3057(var8, var9, var14.field1711, var14.field1707 * 8, var14.field1706);
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
                            int var29 = var15.field19;
                            if (class193.field2863) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field21;
                                var20[var19] = arg6[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field4145.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field4145[var36];
                            int var46 = this.field4157[var36];
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
                            if (var34 != null && class94.field1401[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg1.method1233(var49, var50) - arg2.method1233(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class94.field1401[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method1233(var51, var52) - arg1.method1233(var51, var52);
                                } else if (arg5 != null && !class527.field7681[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method1233(var53, var54) - arg2.method1233(var53, var54);
                                }
                            }
                        }
                        int var37 = arg2.method1239(var8, var9);
                        int var38 = arg2.method1239(var8 + 1, var9);
                        int var39 = arg2.method1239(var8 + 1, var9 + 1);
                        int var40 = arg2.method1239(var8, var9 + 1);
                        if (arg0 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field1704) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field4142[arg0][var8][var9] = (byte) class473.method2847(this.field4142[arg0][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field4139) {
                            var42 = class255.method1639(var8, var9);
                            var43 = class606.method3565(var8, var9);
                            var44 = class487.method2916(var8, var9);
                        }
                        arg2.method1235(var8, var9, var32, var34, var33, var35, class175.field2681[var10], class159.field2372[var10], class315.field4340[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class630.method3672(arg0, var8, var9);
                    }
                }
            }
        }
        field4152++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIII)V")
    private final void method1850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 > -66) {
            return;
        }
        field4162++;
        for (int var7 = arg3; var7 < (arg1 + arg3); var7++) {
            for (int var10 = arg4; var10 < (arg4 + arg5); var10++) {
                if (var10 >= 0 && var10 < this.field4138 && var7 >= 0 && this.field4149 > var7) {
                    this.field4150[arg2][var10][var7] = arg2 > 0 ? this.field4150[arg2 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        if (arg4 > 0 && arg4 < this.field4138) {
            for (int var8 = arg3 + 1; var8 < arg1 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field4149) {
                    this.field4150[arg2][arg4][var8] = this.field4150[arg2][arg4 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field4149) {
            for (int var9 = arg4 + 1; var9 < (arg4 + arg5); var9++) {
                if (var9 >= 0 && var9 < this.field4138) {
                    this.field4150[arg2][var9][arg3] = this.field4150[arg2][var9][arg3 - 1];
                }
            }
        }
        if (arg4 < 0 || arg3 < 0 || this.field4138 <= arg4 || arg3 >= this.field4149) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 <= 0 || this.field4150[arg2][arg4 - 1][arg3] == 0) {
                if (arg3 > 0 && this.field4150[arg2][arg4][arg3 - 1] != 0) {
                    this.field4150[arg2][arg4][arg3] = this.field4150[arg2][arg4][arg3 - 1];
                    return;
                }
                if (arg4 > 0 && arg3 > 0 && this.field4150[arg2][arg4 - 1][arg3 - 1] != 0) {
                    this.field4150[arg2][arg4][arg3] = this.field4150[arg2][arg4 - 1][arg3 - 1];
                    return;
                }
                return;
            }
            this.field4150[arg2][arg4][arg3] = this.field4150[arg2][arg4 - 1][arg3];
        } else if (arg4 <= 0 || this.field4150[arg2][arg4 - 1][arg3] == this.field4150[arg2 - 1][arg4 - 1][arg3]) {
            if (arg3 > 0 && this.field4150[arg2 - 1][arg4][arg3 - 1] != this.field4150[arg2][arg4][arg3 - 1]) {
                this.field4150[arg2][arg4][arg3] = this.field4150[arg2][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && this.field4150[arg2 - 1][arg4 - 1][arg3 - 1] != this.field4150[arg2][arg4 - 1][arg3 - 1]) {
                this.field4150[arg2][arg4][arg3] = this.field4150[arg2][arg4 - 1][arg3 - 1];
                return;
            }
        } else {
            this.field4150[arg2][arg4][arg3] = this.field4150[arg2][arg4 - 1][arg3];
            return;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII[Lvba;IBLgw;II)V")
    public final void method1851(int arg0, int arg1, int arg2, int arg3, class37[] arg4, int arg5, byte arg6, class148 arg7, int arg8, int arg9) {
        field4146++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg9 & 0x7) * 8;
        if (!this.field4139) {
            class37 var13 = arg4[arg1];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class392.method2331(arg8, 18779, var15 & 0x7, var14 & 0x7) + arg5;
                    int var17 = arg0 + class102.method771(var14 & 0x7, -2, arg8, var15 & 0x7);
                    if (var16 > 0 && var16 < this.field4138 - 1 && var17 > 0 && (this.field4149 - 1) > var17) {
                        var13.method235(var17, var16, (byte) 27);
                    }
                }
            }
        }
        int var18 = arg2 & 0x1FFFFFF8 << 3;
        int var19 = arg9 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        int var22 = 0;
        if (arg6 <= 18) {
            return;
        }
        while (var22 < this.field4140) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg3 == var22 && var23 >= var11 && var11 + 8 >= var23 && var24 >= var12 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var12 + 8 == var24) {
                            if (arg8 == 0) {
                                var25 = var23 + arg5 - var11;
                                var26 = arg0 + var24 - var12;
                            } else if (arg8 == 1) {
                                var26 = arg0 + 8 - (-var11 + var23);
                                var25 = arg5 + var24 - var12;
                            } else if (arg8 == 2) {
                                var26 = arg0 + var12 + 8 - var24;
                                var25 = var11 + arg5 + 8 - var23;
                            } else {
                                var25 = var12 + arg5 + 8 - var24;
                                var26 = var23 - (var11 - arg0);
                            }
                            this.method1856(0, 0, arg7, 464500800, var19 + var24, var18 + var23, var25, var26, arg1, true, 0);
                        } else {
                            var25 = class392.method2331(arg8, 18779, var24 & 0x7, var23 & 0x7) + arg5;
                            var26 = arg0 + class102.method771(var23 & 0x7, -2, arg8, var24 & 0x7);
                            this.method1856(var20, var21, arg7, 464500800, var19 + var24, var18 + var23, var25, var26, arg1, false, arg8);
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
                                    var31 = var30 - (var12 - arg0);
                                    var32 = arg5 + var29 - var11;
                                } else if (arg8 == 1) {
                                    var31 = arg0 + var11 + 8 - var29;
                                    var32 = arg5 - (var12 - var30);
                                } else if (arg8 == 2) {
                                    var31 = var12 + 8 - (var30 - arg0);
                                    var32 = arg5 + 8 - (-var11 + var29);
                                } else {
                                    var31 = -var11 - (-var29 - arg0);
                                    var32 = arg5 + var12 + 8 - var30;
                                }
                                if (var32 >= 0 && this.field4138 > var32 && var31 >= 0 && this.field4149 > var31) {
                                    this.field4150[arg1][var32][var31] = this.field4150[arg1][var20 + var25][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method1856(0, 0, arg7, 464500800, 0, 0, -1, -1, 0, false, 0);
                    }
                }
            }
            var22++;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lqa;[Lvba;[[[II)V")
    public final void method1852(class208 arg0, class37[] arg1, int[][][] arg2, int arg3) {
        field4136++;
        if (!this.field4139) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field4138; var6++) {
                    for (int var7 = 0; var7 < this.field4149; var7++) {
                        if ((class146.field2114[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class146.field2114[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method246(var7, (byte) 27, var6);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = arg3; var9 < this.field4140; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field4139) {
                if (class329.field4545) {
                    var11 |= 0x8;
                }
                if (class521.field7438) {
                    var10 |= 0x2;
                }
                if (class473.field6690 != 0) {
                    if (var9 == 0 | class309.field4266) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class521.field7438) {
                var11 |= 0x7;
            }
            if (!class3.field29) {
                var11 |= 0x20;
            }
            int[][] var12 = arg2 == null || var9 >= arg2.length ? this.field4150[var9] : arg2[var9];
            class291.method1793(var9, arg0.method458(this.field4138, this.field4149, this.field4150[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method1853(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field4154++;
        if (arg0 == arg9 && arg2 == arg8 && arg3 == arg4 && arg1 == arg6) {
            class627.method3666(-848573300, arg2, arg6, arg0, arg7, arg4);
        } else {
            int var10 = arg0;
            int var11 = arg2;
            int var12 = arg0 * 3;
            int var13 = arg2 * 3;
            int var14 = arg9 * 3;
            int var15 = arg8 * 3;
            int var16 = arg3 * 3;
            int var17 = arg1 * 3;
            int var18 = arg4 + var14 - var16 - arg0;
            int var19 = arg6 + var15 - var17 - arg2;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg0;
                int var34 = arg2 + (var28 + var30 + var32 >> 12);
                class627.method3666(-848573300, var11, var34, var10, arg7, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg5 < 80) {
            method1847((byte) 96);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lsa;[[IBLsa;Lqa;Lsa;I)V")
    private final void method1854(class176 arg0, int[][] arg1, byte arg2, class176 arg3, class208 arg4, class176 arg5, int arg6) {
        field4147++;
        byte[][] var8 = this.field4141[arg6];
        byte[][] var9 = this.field4144[arg6];
        if (arg2 != 93) {
            this.method1856(-108, -113, null, -55, -26, 0, -59, 92, -120, false, 39);
        }
        byte[][] var10 = this.field4164[arg6];
        byte[][] var11 = this.field4153[arg6];
        for (int var12 = 0; var12 < this.field4138; var12++) {
            int var13 = var12 >= this.field4138 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field4149; var14++) {
                int var15 = (this.field4149 - 1) > var14 ? var14 + 1 : var14;
                if (class42.field486 == -1 || class615.method3610(arg2 + 15395, class42.field486, var14, var12, arg6)) {
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
                        class121 var26 = var21 == 0 ? null : this.field4163.method676(105, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class3 var27 = var22 == 0 ? null : this.field4165.method1630(127, var22 - 1);
                        class121 var28 = var26;
                        if (var26 != null) {
                            if (var26.field1699 == -1 && var26.field1703 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field1697;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field4138 > var12 && this.field4149 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
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
                                var36--;
                                var32--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method1239(var12, var14) - arg3.method1239(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method1239(var13, var14) - arg3.method1239(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class388.field5332[var39] = -1;
                            class132.field1815[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field1697 ? class359.field4886[var19] : class549.field8210[var19];
                        this.method1846(var9, var20, this.field4149, var14, var11, var26, arg4, this.field4138, var8, (byte) 92, var19, var27, var12, var18);
                        boolean var41 = var26 != null && var26.field1703 != var26.field1699;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class388.field5332[var42] >= 0 && class504.field7142[var42] != class183.field2755[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class148.method1013(var18[1], class37.method245(class132.field1815[2], class132.field1815[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class148.method1013(var18[3], class37.method245(class132.field1815[0], class132.field1815[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class148.method1013(var18[0], class37.method245(class132.field1815[0], class132.field1815[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class148.method1013(var18[2], class37.method245(class132.field1815[4], class132.field1815[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
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
                        int[] var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var27 == null ? 0 : class351.field4784[var19];
                            var46 = class159.field2372[var19];
                            var47 = var26 == null ? 0 : class444.field5997[var19];
                            var48 = class175.field2681[var19];
                            var49 = class315.field4340[var19];
                        } else if (var17) {
                            var45 = var27 == null ? 0 : class24.field238[var19];
                            var46 = class159.field2371[var19];
                            var49 = class18.field168[var19];
                            var47 = var26 == null ? 0 : class230.field3369[var19];
                            var44 = class186.field2780[var19];
                            var48 = class13.field120[var19];
                        } else {
                            var48 = class450.field6325[var19];
                            var49 = class317.field4372[var19];
                            var47 = var26 == null ? 0 : class244.field3509[var19];
                            var44 = class168.field2628[var19];
                            var45 = var27 == null ? 0 : class169.field2639[var19];
                            var46 = class461.field6513[var19];
                        }
                        int var50 = var45 + var47;
                        if (var50 <= 0) {
                            class630.method3672(arg6, var12, var14);
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
                            int[] var60 = arg0 == null ? null : new int[var53];
                            int[] var61 = arg0 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field1699;
                                var63 = arg4.method499() ? var26.field1698 : var26.field1708;
                                var64 = var26.field1714;
                                int var65 = class116.method833(arg4, arg2 + 23, var26);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = 1;
                                        class213.field3137[2] = var49[var51];
                                        class213.field3137[3] = 1;
                                        class213.field3137[4] = var46[var51];
                                        var98 = 6;
                                        class213.field3137[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = 5;
                                        class213.field3137[2] = var49[var51];
                                        class213.field3137[3] = 5;
                                        class213.field3137[4] = var46[var51];
                                        class213.field3137[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = 3;
                                        class213.field3137[2] = var49[var51];
                                        class213.field3137[3] = 3;
                                        class213.field3137[4] = var46[var51];
                                        class213.field3137[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = 7;
                                        class213.field3137[2] = var49[var51];
                                        class213.field3137[3] = 7;
                                        class213.field3137[4] = var46[var51];
                                        class213.field3137[5] = var49[var51];
                                        var98 = 6;
                                    } else {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = var46[var51];
                                        var98 = 3;
                                        class213.field3137[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class213.field3137[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field4145[var100];
                                        int var103 = this.field4157[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
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
                                        if (var60 != null && class94.field1401[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg0.method1233(var106, var107) - arg3.method1233(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class94.field1401[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg3.method1233(var108, var109) - arg0.method1233(var108, var109);
                                            } else if (arg5 != null && !class527.field7681[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg5.method1233(var110, var111) - arg3.method1233(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field1702 < class388.field5332[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class504.field7142[var101];
                                            }
                                            var59[var52] = class586.field8610[var101];
                                            var58[var52] = class375.field5186[var101];
                                            var57[var52] = class183.field2755[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg4.method499() ? var26.field1698 : var26.field1708;
                                            var59[var52] = var26.field1714;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field4139 && arg6 == 0) {
                                    class516.method3057(var12, var14, var26.field1711, var26.field1707 * 8, var26.field1706);
                                }
                                if (var19 != 12 && var26.field1699 != -1 && var26.field1710) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class444.field5997[var19];
                            } else if (var17) {
                                var51 += class230.field3369[var19];
                            } else {
                                var51 += class244.field3509[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class3 var67 = this.field4165.method1630(124, var22 - 1);
                                class3 var68 = this.field4165.method1630(12, var23 - 1);
                                class3 var69 = this.field4165.method1630(127, var24 - 1);
                                class3 var70 = this.field4165.method1630(126, var25 - 1);
                                for (int var71 = 0; var71 < var45; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = 1;
                                        class213.field3137[2] = var49[var51];
                                        class213.field3137[3] = 1;
                                        class213.field3137[4] = var46[var51];
                                        class213.field3137[5] = var49[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = 5;
                                        class213.field3137[2] = var49[var51];
                                        class213.field3137[3] = 5;
                                        class213.field3137[4] = var46[var51];
                                        class213.field3137[5] = var49[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = 3;
                                        class213.field3137[2] = var49[var51];
                                        class213.field3137[3] = 3;
                                        class213.field3137[4] = var46[var51];
                                        var73 = 6;
                                        class213.field3137[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = 7;
                                        class213.field3137[2] = var49[var51];
                                        class213.field3137[3] = 7;
                                        class213.field3137[4] = var46[var51];
                                        class213.field3137[5] = var49[var51];
                                        var73 = 6;
                                    } else {
                                        class213.field3137[0] = var48[var51];
                                        class213.field3137[1] = var46[var51];
                                        class213.field3137[2] = var49[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class213.field3137[var74];
                                        int var76 = var75 - var20 * 2 & 0x7;
                                        int var77 = this.field4145[var75];
                                        int var78 = this.field4157[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var80 = 128 - var78;
                                            var79 = var77;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class94.field1401[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg0.method1233(var81, var82) - arg3.method1233(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class94.field1401[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg3.method1233(var83, var84) - arg0.method1233(var83, var84);
                                            } else if (arg5 != null && !class527.field7681[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg5.method1233(var85, var86) - arg3.method1233(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class388.field5332[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class504.field7142[var76];
                                            }
                                            var59[var52] = class586.field8610[var76];
                                            var58[var52] = class375.field5186[var76];
                                            var57[var52] = class183.field2755[var76];
                                        } else {
                                            if (var17 && class94.field1401[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg1[var12][var14];
                                                var58[var52] = var67.field19;
                                                var59[var52] = var67.field21;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg1[var12][var15];
                                                var58[var52] = var68.field19;
                                                var59[var52] = var68.field21;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg1[var13][var15];
                                                var58[var52] = var69.field19;
                                                var59[var52] = var69.field21;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg1[var13][var14];
                                                var58[var52] = var70.field19;
                                                var59[var52] = var70.field21;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 >= 64) {
                                                        var58[var52] = var68.field19;
                                                        var59[var52] = var68.field21;
                                                    } else {
                                                        var58[var52] = var67.field19;
                                                        var59[var52] = var67.field21;
                                                    }
                                                } else if (var79 >= 64) {
                                                    var58[var52] = var69.field19;
                                                    var59[var52] = var69.field21;
                                                } else {
                                                    var58[var52] = var70.field19;
                                                    var59[var52] = var70.field21;
                                                }
                                                int var87 = class459.method2782((byte) 84, arg1[var13][var14], arg1[var12][var14], var80 << 7 >> 7);
                                                int var88 = class459.method2782((byte) 84, arg1[var13][var15], arg1[var12][var15], var80 << 7 >> 7);
                                                var57[var52] = class459.method2782((byte) 84, var88, var87, var79 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field28) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg3.method1239(var12, var14);
                            int var90 = arg3.method1239(var13, var14);
                            int var91 = arg3.method1239(var13, var15);
                            int var92 = arg3.method1239(var12, var15);
                            if (arg6 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field1704) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field4142[arg6][var12][var14] = (byte) class473.method2847(this.field4142[arg6][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field4139) {
                                var94 = class255.method1639(var12, var14);
                                var95 = class606.method3565(var12, var14);
                                var96 = class487.method2916(var12, var14);
                            }
                            arg3.method1234(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class630.method3672(arg6, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIII)V")
    public final void method1855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4159++;
        int var6 = 0;
        if (arg3 != -13111) {
            this.field4144 = null;
        }
        while (this.field4140 > var6) {
            this.method1850(-84, arg0, var6, arg4, arg1, arg2);
            var6++;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILgw;IIIIIIZI)V")
    private final void method1856(int arg0, int arg1, class148 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg10 == 1) {
            arg1 = 1;
        } else if (arg10 == 2) {
            arg1 = 1;
            arg0 = 1;
        } else if (arg10 == 3) {
            arg0 = 1;
        }
        field4160++;
        if (arg3 != 464500800) {
            this.field4138 = -96;
        }
        if (arg6 < 0 || arg6 >= this.field4138 || arg7 < 0 || this.field4149 <= arg7) {
            while (true) {
                int var14 = arg2.method1032((byte) -33);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg2.method1032((byte) -33);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method1032((byte) -33);
                }
            }
        }
        if (!this.field4139 && !arg9) {
            class146.field2114[arg8][arg6][arg7] = 0;
        }
        while (true) {
            int var12 = arg2.method1032((byte) -33);
            if (var12 == 0) {
                if (this.field4139) {
                    this.field4150[0][arg6 + arg0][arg1 + arg7] = 0;
                    return;
                } else if (arg8 == 0) {
                    this.field4150[0][arg0 + arg6][arg1 + arg7] = -class146.method998(arg4 + 556238, -18, arg5 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field4150[arg8][arg0 + arg6][arg1 + arg7] = this.field4150[arg8 - 1][arg6 + arg0][arg7 + arg1] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg2.method1032((byte) -33);
                if (!this.field4139) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg8 != 0) {
                        this.field4150[arg8][arg6 + arg0][arg1 + arg7] = this.field4150[arg8 - 1][arg0 + arg6][arg7 + arg1] - (var13 * 8 << 0);
                        return;
                    }
                    this.field4150[0][arg0 + arg6][arg7 + arg1] = -var13 * 8 << 0;
                    return;
                }
                this.field4150[0][arg0 + arg6][arg1 + arg7] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg9) {
                    arg2.method1032((byte) -33);
                } else {
                    this.field4153[arg8][arg6][arg7] = arg2.method1062(class354.method2138(arg3, -464513668));
                    this.field4141[arg8][arg6][arg7] = (byte) ((var12 - 2) / 4);
                    this.field4144[arg8][arg6][arg7] = (byte) class37.method245(3, arg10 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field4139 && !arg9) {
                    class146.field2114[arg8][arg6][arg7] = (byte) (var12 - 49);
                }
            } else if (!arg9) {
                this.field4164[arg8][arg6][arg7] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B[[II)V")
    public final void method1857(byte arg0, int[][] arg1, int arg2) {
        field4156++;
        int[][] var4 = this.field4150[arg2];
        if (arg0 != 66) {
            this.field4148 = null;
        }
        for (int var5 = 0; var5 < this.field4138 + 1; var5++) {
            for (int var6 = 0; var6 < this.field4149 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III[Lvba;ZLgw;I)V")
    public final void method1858(int arg0, int arg1, int arg2, class37[] arg3, boolean arg4, class148 arg5, int arg6) {
        field4158++;
        if (!this.field4139) {
            for (int var8 = 0; var8 < 4; var8++) {
                class37 var9 = arg3[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg6 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && this.field4138 > var12 && var13 >= 0 && var13 < this.field4149) {
                            var9.method235(var13, var12, (byte) 27);
                        }
                    }
                }
            }
        }
        if (!arg4) {
            return;
        }
        int var14 = arg2 + arg6;
        int var15 = arg0 + arg1;
        for (int var16 = 0; var16 < this.field4140; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1856(0, 0, arg5, 464500800, var15 + var18, var14 + var17, var17 + arg6, arg1 + var18, var16, false, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIZLer;Lcaa;)V")
    public class302(int arg0, int arg1, int arg2, boolean arg3, class90 arg4, class253 arg5) {
        this.field4138 = arg1;
        this.field4140 = arg0;
        this.field4139 = arg3;
        this.field4149 = arg2;
        this.field4163 = arg4;
        this.field4165 = arg5;
        this.field4164 = new byte[this.field4140][this.field4138][this.field4149];
        this.field4144 = new byte[this.field4140][this.field4138][this.field4149];
        this.field4141 = new byte[this.field4140][this.field4138][this.field4149];
        this.field4142 = new byte[this.field4140][this.field4138 + 1][this.field4149 + 1];
        this.field4150 = new int[this.field4140][this.field4138 + 1][this.field4149 + 1];
        this.field4153 = new byte[this.field4140][this.field4138][this.field4149];
    }
}
