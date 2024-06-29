import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class285 {

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "[I")
    private int[] field3785 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "[I")
    private int[] field3782 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "Lcfa;")
    private class170 field3783;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Z")
    public boolean field3769;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Lkf;")
    private class256 field3772;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "[[[I")
    public int[][][] field3778;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "[[[B")
    private byte[][][] field3789;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "[[[B")
    public byte[][][] field3781;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "[[[B")
    private byte[][][] field3763;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "[[[B")
    private byte[][][] field3775;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "[[[B")
    private byte[][][] field3790;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "F")
    public static float field3771 = 0.0F;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "[I")
    public static int[] field3764 = new int[8];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "[[[B")
    public byte[][][] field3786;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIII)V")
    public final void method1703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3762++;
        for (int var7 = arg4; var7 < arg3 + arg4; var7++) {
            for (int var10 = arg2; var10 < arg0 + arg2; var10++) {
                if (var10 >= 0 && var10 < this.field3767 && var7 >= 0 && var7 < this.field3766) {
                    this.field3778[arg1][var10][var7] = arg1 <= 0 ? 0 : this.field3778[arg1 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field3767) {
            for (int var8 = arg4 + 1; var8 < (arg3 + arg4); var8++) {
                if (var8 >= 0 && var8 < this.field3766) {
                    this.field3778[arg1][arg2][var8] = this.field3778[arg1][arg2 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < this.field3766) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg0); var9++) {
                if (var9 >= 0 && var9 < this.field3767) {
                    this.field3778[arg1][var9][arg4] = this.field3778[arg1][var9][arg4 - 1];
                }
            }
        }
        if (arg5 < ~arg2 || arg4 < 0 || this.field3767 <= arg2 || this.field3766 <= arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 > 0 && this.field3778[arg1][arg2 - 1][arg4] != 0) {
                this.field3778[arg1][arg2][arg4] = this.field3778[arg1][arg2 - 1][arg4];
                return;
            }
            if (arg4 > 0 && this.field3778[arg1][arg2][arg4 - 1] != 0) {
                this.field3778[arg1][arg2][arg4] = this.field3778[arg1][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && this.field3778[arg1][arg2 - 1][arg4 - 1] != 0) {
                this.field3778[arg1][arg2][arg4] = this.field3778[arg1][arg2 - 1][arg4 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field3778[arg1][arg2 - 1][arg4] == this.field3778[arg1 - 1][arg2 - 1][arg4]) {
            if (arg4 > 0 && this.field3778[arg1][arg2][arg4 - 1] != this.field3778[arg1 - 1][arg2][arg4 - 1]) {
                this.field3778[arg1][arg2][arg4] = this.field3778[arg1][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && this.field3778[arg1 - 1][arg2 - 1][arg4 - 1] != this.field3778[arg1][arg2 - 1][arg4 - 1]) {
                this.field3778[arg1][arg2][arg4] = this.field3778[arg1][arg2 - 1][arg4 - 1];
                return;
            }
            return;
        } else {
            this.field3778[arg1][arg2][arg4] = this.field3778[arg1][arg2 - 1][arg4];
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ls;BLs;Lha;)V")
    public final void method1704(class281 arg0, byte arg1, class281 arg2, class60 arg3) {
        field3777++;
        int[][] var5 = new int[this.field3767][this.field3766];
        if (class342.field4598 == null || class342.field4598.length != this.field3766) {
            class410.field5783 = new int[this.field3766];
            class342.field4598 = new int[this.field3766];
            class351.field4701 = new int[this.field3766];
            class566.field7991 = new int[this.field3766];
            class343.field4611 = new int[this.field3766];
        }
        for (int var6 = 0; var6 < this.field3774; var6++) {
            for (int var9 = 0; var9 < this.field3766; var9++) {
                class342.field4598[var9] = 0;
                class351.field4701[var9] = 0;
                class566.field7991[var9] = 0;
                class410.field5783[var9] = 0;
                class343.field4611[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field3767; var10++) {
                for (int var11 = 0; var11 < this.field3766; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (this.field3767 > var20) {
                        int var21 = this.field3775[var6][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class548 var22 = this.field3772.method1520(var21 - 1, 123);
                            class342.field4598[var11] += var22.field7728;
                            class351.field4701[var11] += var22.field7733;
                            class566.field7991[var11] += var22.field7734;
                            class410.field5783[var11] += var22.field7731;
                            var10002 = class343.field4611[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field3775[var6][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class548 var25 = this.field3772.method1520(var24 - 1, 121);
                            class342.field4598[var11] -= var25.field7728;
                            class351.field4701[var11] -= var25.field7733;
                            class566.field7991[var11] -= var25.field7734;
                            class410.field5783[var11] -= var25.field7731;
                            var10002 = class343.field4611[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field3766; var17++) {
                        int var18 = var17 + 5;
                        if (var18 < this.field3766) {
                            var12 += class342.field4598[var18];
                            var15 += class410.field5783[var18];
                            var14 += class566.field7991[var18];
                            var16 += class343.field4611[var18];
                            var13 += class351.field4701[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var16 -= class343.field4611[var19];
                            var13 -= class351.field4701[var19];
                            var12 -= class342.field4598[var19];
                            var15 -= class410.field5783[var19];
                            var14 -= class566.field7991[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var5[var10][var17] = class262.method1570((byte) -11, var13 / var16, var12 * 256 / var15, var14 / var16);
                        }
                    }
                }
            }
            if (class619.field8684) {
                this.method1714(var6 == 0 ? arg2 : null, arg3, class25.field188[var6], var5, var6 == 0 ? arg0 : null, -22657, var6);
            } else {
                this.method1712(arg3, var6 == 0 ? arg0 : null, var5, var6 == 0 ? arg2 : null, class25.field188[var6], var6, (byte) 126);
            }
            this.field3775[var6] = null;
            this.field3763[var6] = null;
            this.field3789[var6] = null;
            this.field3790[var6] = null;
        }
        if (!this.field3769) {
            if (class237.field3105 != 0) {
                class307.method1859();
            }
            if (class300.field4057) {
                class472.method2657();
            }
        }
        for (int var7 = 0; var7 < this.field3774; var7++) {
            class25.field188[var7].method1542();
        }
        int var8 = -70 / ((arg1 - 9) / 56);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZIII)V")
    public final void method1705(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            for (int var6 = 0; var6 < this.field3774; var6++) {
                this.method1703(arg0, var6, arg4, arg3, arg2, -1);
            }
            field3776++;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILha;B[[BILel;II[Z[[B[[BLnba;I)V")
    private final void method1706(int arg0, int arg1, class60 arg2, byte arg3, byte[][] arg4, int arg5, class548 arg6, int arg7, int arg8, boolean[] arg9, byte[][] arg10, byte[][] arg11, class301 arg12, int arg13) {
        field3770++;
        int var15 = -70 / ((-arg3 - 13) / 63);
        boolean[] var16 = arg12 != null && arg12.field4059 ? class489.field6695[arg8] : class742.field10330[arg8];
        if (arg7 > 0) {
            if (arg0 > 0) {
                int var17 = arg4[arg0 - 1][arg7 - 1] & 0xFF;
                if (var17 > 0) {
                    class301 var18 = this.field3783.method987(4, var17 - 1);
                    if (var18.field4074 != -1 && var18.field4059) {
                        byte var19 = arg10[arg0 - 1][arg7 - 1];
                        int var20 = (arg11[arg0 - 1][arg7 - 1] * 2) + 4 & 0x7;
                        int var21 = class426.method2444(false, var18, arg2);
                        if (class355.field4736[var19][var20]) {
                            class19.field127[0] = var18.field4074;
                            class201.field2383[0] = var21;
                            class232.field3000[0] = var18.field4081;
                            class604.field8423[0] = var18.field4063;
                            class4.field37[0] = var18.field4072;
                            class539.field7310[0] = 256;
                        }
                    }
                }
            }
            if (arg0 < arg1 - 1) {
                int var22 = arg4[arg0 + 1][arg7 - 1] & 0xFF;
                if (var22 > 0) {
                    class301 var23 = this.field3783.method987(4, var22 - 1);
                    if (var23.field4074 != -1 && var23.field4059) {
                        byte var24 = arg10[arg0 + 1][arg7 - 1];
                        int var25 = arg11[arg0 + 1][arg7 - 1] * 2 + 6 & 0x7;
                        int var26 = class426.method2444(false, var23, arg2);
                        if (class355.field4736[var24][var25]) {
                            class19.field127[2] = var23.field4074;
                            class201.field2383[2] = var26;
                            class232.field3000[2] = var23.field4081;
                            class604.field8423[2] = var23.field4063;
                            class4.field37[2] = var23.field4072;
                            class539.field7310[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg13 - 1 > arg7) {
            if (arg0 > 0) {
                int var27 = arg4[arg0 - 1][arg7 + 1] & 0xFF;
                if (var27 > 0) {
                    class301 var28 = this.field3783.method987(4, var27 - 1);
                    if (var28.field4074 != -1 && var28.field4059) {
                        byte var29 = arg10[arg0 - 1][arg7 + 1];
                        int var30 = arg11[arg0 - 1][arg7 + 1] * 2 + 2 & 0x7;
                        int var31 = class426.method2444(false, var28, arg2);
                        if (class355.field4736[var29][var30]) {
                            class19.field127[6] = var28.field4074;
                            class201.field2383[6] = var31;
                            class232.field3000[6] = var28.field4081;
                            class604.field8423[6] = var28.field4063;
                            class4.field37[6] = var28.field4072;
                            class539.field7310[6] = 64;
                        }
                    }
                }
            }
            if (arg0 < arg1 - 1) {
                int var32 = arg4[arg0 + 1][arg7 + 1] & 0xFF;
                if (var32 > 0) {
                    class301 var33 = this.field3783.method987(4, var32 - 1);
                    if (var33.field4074 != -1 && var33.field4059) {
                        byte var34 = arg10[arg0 + 1][arg7 + 1];
                        int var35 = -(-(arg11[arg0 + 1][arg7 + 1] * 2)) & 0x7;
                        int var36 = class426.method2444(false, var33, arg2);
                        if (class355.field4736[var34][var35]) {
                            class19.field127[4] = var33.field4074;
                            class201.field2383[4] = var36;
                            class232.field3000[4] = var33.field4081;
                            class604.field8423[4] = var33.field4063;
                            class4.field37[4] = var33.field4072;
                            class539.field7310[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg7 > 0) {
            int var37 = arg4[arg0][arg7 - 1] & 0xFF;
            if (var37 > 0) {
                class301 var38 = this.field3783.method987(4, var37 - 1);
                if (var38.field4074 != -1) {
                    byte var39 = arg10[arg0][arg7 - 1];
                    byte var40 = arg11[arg0][arg7 - 1];
                    if (var38.field4059) {
                        int var41 = 2;
                        int var42 = var40 * 2 + 4;
                        int var43 = class426.method2444(false, var38, arg2);
                        for (int var44 = 0; var44 < 3; var44++) {
                            var42 &= 0x7;
                            var41 &= 0x7;
                            if (class355.field4736[var39][var42] && class4.field37[var41] <= var38.field4072) {
                                class19.field127[var41] = var38.field4074;
                                class201.field2383[var41] = var43;
                                class232.field3000[var41] = var38.field4081;
                                class604.field8423[var41] = var38.field4063;
                                if (class4.field37[var41] == var38.field4072) {
                                    class539.field7310[var41] = class344.method2020(class539.field7310[var41], 32);
                                } else {
                                    class539.field7310[var41] = 32;
                                }
                                class4.field37[var41] = var38.field4072;
                            }
                            var42++;
                            var41--;
                        }
                        if (!var16[arg5 & 0x3]) {
                            arg9[0] = class489.field6695[var39][class321.method1919(var40 + 2, 3)];
                        }
                    } else if (!var16[arg5 & 0x3]) {
                        arg9[0] = class742.field10330[var39][class321.method1919(var40 + 2, 3)];
                    }
                }
            }
        }
        if ((arg13 - 1) > arg7) {
            int var45 = arg4[arg0][arg7 + 1] & 0xFF;
            if (var45 > 0) {
                class301 var46 = this.field3783.method987(4, var45 - 1);
                if (var46.field4074 != -1) {
                    byte var47 = arg10[arg0][arg7 + 1];
                    byte var48 = arg11[arg0][arg7 + 1];
                    if (var46.field4059) {
                        int var49 = 4;
                        int var50 = var48 * 2 + 2;
                        int var51 = class426.method2444(false, var46, arg2);
                        for (int var52 = 0; var52 < 3; var52++) {
                            var50 &= 0x7;
                            var49 &= 0x7;
                            if (class355.field4736[var47][var50] && var46.field4072 >= class4.field37[var49]) {
                                class19.field127[var49] = var46.field4074;
                                class201.field2383[var49] = var51;
                                class232.field3000[var49] = var46.field4081;
                                class604.field8423[var49] = var46.field4063;
                                if (class4.field37[var49] == var46.field4072) {
                                    class539.field7310[var49] = class344.method2020(class539.field7310[var49], 16);
                                } else {
                                    class539.field7310[var49] = 16;
                                }
                                class4.field37[var49] = var46.field4072;
                            }
                            var50--;
                            var49++;
                        }
                        if (!var16[arg5 + 2 & 0x3]) {
                            arg9[2] = class489.field6695[var47][class321.method1919(var48, 3)];
                        }
                    } else if (!var16[arg5 + 2 & 0x3]) {
                        arg9[2] = class742.field10330[var47][class321.method1919(3, -(-var48))];
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var53 = arg4[arg0 - 1][arg7] & 0xFF;
            if (var53 > 0) {
                class301 var54 = this.field3783.method987(4, var53 - 1);
                if (var54.field4074 != -1) {
                    byte var55 = arg10[arg0 - 1][arg7];
                    byte var56 = arg11[arg0 - 1][arg7];
                    if (var54.field4059) {
                        int var57 = 6;
                        int var58 = var56 * 2 + 4;
                        int var59 = class426.method2444(false, var54, arg2);
                        for (int var60 = 0; var60 < 3; var60++) {
                            var57 &= 0x7;
                            var58 &= 0x7;
                            if (class355.field4736[var55][var58] && var54.field4072 >= class4.field37[var57]) {
                                class19.field127[var57] = var54.field4074;
                                class201.field2383[var57] = var59;
                                class232.field3000[var57] = var54.field4081;
                                class604.field8423[var57] = var54.field4063;
                                if (class4.field37[var57] == var54.field4072) {
                                    class539.field7310[var57] = class344.method2020(class539.field7310[var57], 8);
                                } else {
                                    class539.field7310[var57] = 8;
                                }
                                class4.field37[var57] = var54.field4072;
                            }
                            var58--;
                            var57++;
                        }
                        if (!var16[arg5 + 3 & 0x3]) {
                            arg9[3] = class489.field6695[var55][class321.method1919(3, var56 + 1)];
                        }
                    } else if (!var16[arg5 + 3 & 0x3]) {
                        arg9[3] = class742.field10330[var55][class321.method1919(var56 + 1, 3)];
                    }
                }
            }
        }
        if (arg1 - 1 > arg0) {
            int var61 = arg4[arg0 + 1][arg7] & 0xFF;
            if (var61 > 0) {
                class301 var62 = this.field3783.method987(4, var61 - 1);
                if (var62.field4074 != -1) {
                    byte var63 = arg10[arg0 + 1][arg7];
                    byte var64 = arg11[arg0 + 1][arg7];
                    if (var62.field4059) {
                        int var65 = 4;
                        int var66 = var64 * 2 + 6;
                        int var67 = class426.method2444(false, var62, arg2);
                        for (int var68 = 0; var68 < 3; var68++) {
                            var65 &= 0x7;
                            var66 &= 0x7;
                            if (class355.field4736[var63][var66] && var62.field4072 >= class4.field37[var65]) {
                                class19.field127[var65] = var62.field4074;
                                class201.field2383[var65] = var67;
                                class232.field3000[var65] = var62.field4081;
                                class604.field8423[var65] = var62.field4063;
                                if (class4.field37[var65] == var62.field4072) {
                                    class539.field7310[var65] = class344.method2020(class539.field7310[var65], 4);
                                } else {
                                    class539.field7310[var65] = 4;
                                }
                                class4.field37[var65] = var62.field4072;
                            }
                            var66++;
                            var65--;
                        }
                        if (!var16[arg5 + 1 & 0x3]) {
                            arg9[1] = class489.field6695[var63][class321.method1919(var64 + 3, 3)];
                        }
                    } else if (!var16[arg5 + 1 & 0x3]) {
                        arg9[1] = class742.field10330[var63][class321.method1919(3, var64 + 3)];
                    }
                }
            }
        }
        if (arg12 == null) {
            return;
        }
        int var69 = class426.method2444(false, arg12, arg2);
        if (!arg12.field4059) {
            return;
        }
        for (int var70 = 0; var70 < 8; var70++) {
            int var71 = var70 - (arg5 * 2) & 0x7;
            if (class355.field4736[arg8][var70] && class4.field37[var71] <= arg12.field4072) {
                class19.field127[var71] = arg12.field4074;
                class201.field2383[var71] = var69;
                class232.field3000[var71] = arg12.field4081;
                class604.field8423[var71] = arg12.field4063;
                if (class4.field37[var71] == arg12.field4072) {
                    class539.field7310[var71] = class344.method2020(class539.field7310[var71], 2);
                } else {
                    class539.field7310[var71] = 2;
                }
                class4.field37[var71] = arg12.field4072;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static final void method1707(int arg0) {
        field3791++;
        if (class144.field1868 == null) {
            return;
        }
        try {
            String var1 = class144.field1868.getParameter("cookiehost");
            int var2 = (int) (class538.method2963(-47) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class679.method3853(class144.field1868, "document.cookie=\"" + var3 + "\"", 9202);
        } catch (Throwable var5) {
        }
        int var4 = -96 / ((52 - arg0) / 62);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILbr;)V")
    public static final void method1708(int arg0, class396 arg1) {
        arg1.field5626 = null;
        field3779++;
        if (class677.field9458 < arg0) {
            class342.field4599.method118(true, arg1);
            class677.field9458++;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1709(byte arg0) {
        field3764 = null;
        if (arg0 != -20) {
            field3771 = -0.16454314F;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BIIILji;I[Lpfa;)V")
    public final void method1710(byte arg0, int arg1, int arg2, int arg3, class611 arg4, int arg5, class298[] arg6) {
        if (!this.field3769) {
            for (int var8 = 0; var8 < 4; var8++) {
                class298 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && var12 < this.field3767 && var13 >= 0 && var13 < this.field3766) {
                            var9.method1782(var13, 101, var12);
                        }
                    }
                }
            }
        }
        field3788++;
        int var14 = arg3 + arg5;
        int var15 = arg1 + arg2;
        for (int var16 = 0; var16 < this.field3774; var16++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method1717(arg1 + var19, false, 0, var14 + var18, var15 + var19, arg5 + var18, (byte) -111, 0, 0, var16, arg4);
                }
            }
        }
        int var17 = 111 % ((arg0 - 67) / 48);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILji;IIIII[Lpfa;I)V")
    public final void method1711(int arg0, int arg1, class611 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class298[] arg8, int arg9) {
        field3780++;
        int var11 = (arg7 & 0x7) * 8;
        int var12 = (arg0 & 0x7) * 8;
        if (!this.field3769) {
            class298 var13 = arg8[arg9];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg5 + class49.method284(var14 & 0x7, arg6, var15 & 0x7, arg3);
                    int var17 = class650.method3671(var14 & 0x7, var15 & 0x7, arg3, (byte) 64) + arg1;
                    if (var16 > 0 && var16 < this.field3767 - 1 && var17 > 0 && var17 < this.field3766 - 1) {
                        var13.method1782(var17, arg6 ^ 0x31, var16);
                    }
                }
            }
        }
        int var18 = (arg7 & 0xFFFFFFF8) << 3;
        int var19 = (arg0 & 0xFFFFFFF8) << 3;
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
        for (int var22 = arg6; var22 < this.field3774; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg4 == var22 && var11 <= var23 && var23 <= var11 + 8 && var24 >= var12 && var24 <= var12 + 8) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var12 + 8 == var24) {
                            if (arg3 == 0) {
                                var26 = arg1 + var24 - var12;
                                var25 = -var11 - (-var23 - arg5);
                            } else if (arg3 == 1) {
                                var26 = var11 + arg1 + 8 - var23;
                                var25 = arg5 + var24 - var12;
                            } else if (arg3 == 2) {
                                var26 = var12 + arg1 + 8 - var24;
                                var25 = arg5 + var11 + 8 - var23;
                            } else {
                                var25 = var12 + arg5 + 8 - var24;
                                var26 = arg1 + var23 - var11;
                            }
                            this.method1717(var26, true, 0, var18 + var23, var19 + var24, var25, (byte) -111, 0, 0, arg9, arg2);
                        } else {
                            var25 = class49.method284(var23 & 0x7, 0, var24 & 0x7, arg3) + arg5;
                            var26 = arg1 + class650.method3671(var23 & 0x7, var24 & 0x7, arg3, (byte) -125);
                            this.method1717(var26, false, arg3, var18 + var23, var19 + var24, var25, (byte) -111, var21, var20, arg9, arg2);
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
                                if (arg3 == 0) {
                                    var31 = arg5 + var29 - var11;
                                    var32 = arg1 + var30 - var12;
                                } else if (arg3 == 1) {
                                    var31 = -var12 - (-var30 - arg5);
                                    var32 = arg1 + (var11 - var29) + 8;
                                } else if (arg3 == 2) {
                                    var31 = var11 + arg5 + 8 - var29;
                                    var32 = var12 + arg1 + 8 - var30;
                                } else {
                                    var32 = arg1 + var29 - var11;
                                    var31 = arg5 - (-var12 - 8) - var30;
                                }
                                if (var31 >= 0 && var31 < this.field3767 && var32 >= 0 && var32 < this.field3766) {
                                    this.field3778[arg9][var31][var32] = this.field3778[arg9][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method1717(-1, false, 0, 0, 0, -1, (byte) -111, 0, 0, 0, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lha;Ls;[[ILs;Ls;IB)V")
    private final void method1712(class60 arg0, class281 arg1, int[][] arg2, class281 arg3, class281 arg4, int arg5, byte arg6) {
        field3787++;
        if (arg6 <= 118) {
            return;
        }
        for (int var8 = 0; var8 < this.field3767; var8++) {
            for (int var9 = 0; var9 < this.field3766; var9++) {
                if (class750.field10393 == -1 || class351.method2038(var9, arg5, var8, class750.field10393, -86)) {
                    byte var10 = this.field3789[arg5][var8][var9];
                    byte var11 = this.field3790[arg5][var8][var9];
                    int var12 = this.field3763[arg5][var8][var9] & 0xFF;
                    int var13 = this.field3775[arg5][var8][var9] & 0xFF;
                    class301 var14 = var12 == 0 ? null : this.field3783.method987(4, var12 - 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class548 var15 = var13 == 0 ? null : this.field3772.method1520(var13 - 1, 125);
                    class301 var16 = var14;
                    if (var14 != null && var14.field4074 == -1 && var14.field4077 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class333.field4499[var10];
                        int var18 = class8.field56[var10];
                        int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field4081;
                        int var23 = var15 == null ? -1 : var15.field7726;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field4077 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class190.field2289[var10][var21];
                                var25[var20] = class270.field3571[var10][var21];
                                var26[var20] = class424.field5957[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field4063;
                                var27[var20] = var14.field4074;
                                if (var30 != null) {
                                    var30[var20] = var14.field4077;
                                }
                                var20++;
                                var21++;
                            }
                            if (!this.field3769 && arg5 == 0) {
                                class439.method2483(var8, var9, var14.field4068, var14.field4064 * 8, var14.field4070);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class190.field2289[var10][var21];
                                var25[var20] = class270.field3571[var10][var21];
                                var26[var20] = class424.field5957[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field7725;
                                var27[var20] = arg2[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var21++;
                                var20++;
                            }
                        }
                        int var33 = this.field3782.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg1 == null ? null : new int[var33];
                        int[] var37 = arg1 == null && arg3 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field3782[var38];
                            int var49 = this.field3785[var38];
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
                            if (var36 != null && class355.field4736[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg1.method1683(var52, var53, true) - arg4.method1683(var52, var53, true);
                            }
                            if (var37 != null) {
                                if (arg1 != null && !class355.field4736[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg4.method1683(var54, var55, true) - arg1.method1683(var54, var55, true);
                                } else if (arg3 != null && !class623.field8722[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg3.method1683(var56, var57, true) - arg4.method1683(var56, var57, true);
                                }
                            }
                        }
                        int var39 = arg4.method1685(var9, -12639, var8);
                        int var40 = arg4.method1685(var9, -12639, var8 + 1);
                        int var41 = arg4.method1685(var9 + 1, -12639, var8 + 1);
                        int var42 = arg4.method1685(var9 + 1, -12639, var8);
                        boolean var43 = class669.method3767(var9, (byte) -115, var8);
                        if (var43 && arg5 > 1 || !var43 && arg5 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field7735) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field4060) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field3781[arg5][var8][var9] = (byte) class344.method2020(this.field3781[arg5][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field3769) {
                            var45 = class34.method175(var8, var9);
                            var46 = class149.method915(var8, var9);
                            var47 = class73.method538(var8, var9);
                        }
                        arg4.method1530(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class689.method3896(arg5, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[[I)V")
    public final void method1713(int arg0, int arg1, int[][] arg2) {
        field3773++;
        int[][] var4 = this.field3778[arg0];
        int var5 = 17 % ((-arg1 - 11) / 36);
        for (int var6 = 0; var6 < this.field3767 + 1; var6++) {
            for (int var7 = 0; var7 < this.field3766 + 1; var7++) {
                var4[var6][var7] += arg2[var6][var7];
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ls;Lha;Ls;[[ILs;II)V")
    private final void method1714(class281 arg0, class60 arg1, class281 arg2, int[][] arg3, class281 arg4, int arg5, int arg6) {
        field3768++;
        byte[][] var8 = this.field3789[arg6];
        byte[][] var9 = this.field3790[arg6];
        byte[][] var10 = this.field3775[arg6];
        byte[][] var11 = this.field3763[arg6];
        for (int var12 = 0; var12 < this.field3767; var12++) {
            int var13 = var12 >= this.field3767 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3766; var14++) {
                int var15 = this.field3766 - 1 <= var14 ? var14 : var14 + 1;
                if (class750.field10393 == -1 || class351.method2038(var14, arg6, var12, class750.field10393, 65)) {
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
                        class301 var26 = var21 == 0 ? null : this.field3783.method987(arg5 ^ 0xFFFFA77B, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class548 var27 = var22 == 0 ? null : this.field3772.method1520(var22 - 1, 120);
                        class301 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4074 == -1 && var26.field4077 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4059;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field3767 > var12 && this.field3766 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var34--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            int var37 = var34 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg2.method1685(var14, -12639, var12) - arg2.method1685(var15, arg5 + 10018, var13);
                                var38 = arg2.method1685(var14, arg5 ^ 0x69DE, var13) - arg2.method1685(var15, arg5 + 10018, var12);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class4.field37[var39] = -1;
                            class539.field7310[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4059 ? class489.field6695[var19] : class742.field10330[var19];
                        this.method1706(var12, this.field3767, arg1, (byte) 53, var11, var20, var27, var14, var19, var18, var8, var9, var26, this.field3766);
                        boolean var41 = var26 != null && var26.field4077 != var26.field4074;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class4.field37[var42] >= 0 && class201.field2383[var42] != class19.field127[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class526.method2920(var18[1], class321.method1919(class539.field7310[4], class539.field7310[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class526.method2920(var18[3], class321.method1919(class539.field7310[0], class539.field7310[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class526.method2920(var18[0], class321.method1919(class539.field7310[2], class539.field7310[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class526.method2920(var18[2], class321.method1919(class539.field7310[6], class539.field7310[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
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
                            var48 = class190.field2289[var19];
                            var47 = var26 == null ? 0 : class8.field56[var19];
                            var49 = class424.field5957[var19];
                            var45 = var27 == null ? 0 : class333.field4499[var19];
                            var46 = class270.field3571[var19];
                        } else if (var17) {
                            var44 = class203.field2411[var19];
                            var45 = var27 == null ? 0 : class531.field7206[var19];
                            var46 = class469.field6478[var19];
                            var47 = var26 == null ? 0 : class348.field4630[var19];
                            var48 = class408.field5761[var19];
                            var49 = class753.field10444[var19];
                        } else {
                            var47 = var26 == null ? 0 : class386.field5453[var19];
                            var48 = class294.field3942[var19];
                            var46 = class553.field7814[var19];
                            var44 = class666.field9277[var19];
                            var49 = class623.field8719[var19];
                            var45 = var27 == null ? 0 : class440.field6153[var19];
                        }
                        int var50 = var45 + var47;
                        if (var50 <= 0) {
                            class689.method3896(arg6, var12, var14);
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
                            int[] var61 = arg4 == null && arg0 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field4074;
                                var64 = var26.field4063;
                                var63 = var26.field4081;
                                int var65 = class426.method2444(false, var26, arg1);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = 1;
                                        class658.field9184[2] = var49[var51];
                                        class658.field9184[3] = 1;
                                        class658.field9184[4] = var46[var51];
                                        class658.field9184[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = 5;
                                        class658.field9184[2] = var49[var51];
                                        class658.field9184[3] = 5;
                                        class658.field9184[4] = var46[var51];
                                        class658.field9184[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = 3;
                                        class658.field9184[2] = var49[var51];
                                        class658.field9184[3] = 3;
                                        class658.field9184[4] = var46[var51];
                                        class658.field9184[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = 7;
                                        class658.field9184[2] = var49[var51];
                                        class658.field9184[3] = 7;
                                        class658.field9184[4] = var46[var51];
                                        class658.field9184[5] = var49[var51];
                                        var68 = 6;
                                    } else {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = var46[var51];
                                        var68 = 3;
                                        class658.field9184[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class658.field9184[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field3782[var70];
                                        int var73 = this.field3785[var70];
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
                                            var75 = var73;
                                            var74 = var72;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class355.field4736[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg4.method1683(var76, var77, true) - arg2.method1683(var76, var77, true);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class355.field4736[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg2.method1683(var78, var79, true) - arg4.method1683(var78, var79, true);
                                            } else if (arg0 != null && !class623.field8722[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg0.method1683(var80, var81, true) - arg2.method1683(var80, var81, true);
                                            }
                                        }
                                        if (var70 < 8 && class4.field37[var71] > var26.field4072) {
                                            if (var54 != null) {
                                                var54[var52] = class201.field2383[var71];
                                            }
                                            var59[var52] = class604.field8423[var71];
                                            var58[var52] = class232.field3000[var71];
                                            var57[var52] = class19.field127[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field4081;
                                            var59[var52] = var26.field4063;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field3769 && arg6 == 0) {
                                    class439.method2483(var12, var14, var26.field4068, var26.field4064 * 8, var26.field4070);
                                }
                                if (var19 != 12 && var26.field4074 != -1 && var26.field4075) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class8.field56[var19];
                            } else if (var17) {
                                var51 += class348.field4630[var19];
                            } else {
                                var51 += class386.field5453[var19];
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
                                class548 var82 = this.field3772.method1520(var22 - 1, 126);
                                class548 var83 = this.field3772.method1520(var23 - 1, 122);
                                class548 var84 = this.field3772.method1520(var24 - 1, arg5 ^ 0xFFFFA704);
                                class548 var85 = this.field3772.method1520(var25 - 1, arg5 + 22775);
                                for (int var86 = 0; var86 < var45; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = 1;
                                        class658.field9184[2] = var49[var51];
                                        class658.field9184[3] = 1;
                                        class658.field9184[4] = var46[var51];
                                        var88 = 6;
                                        class658.field9184[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = 5;
                                        class658.field9184[2] = var49[var51];
                                        class658.field9184[3] = 5;
                                        class658.field9184[4] = var46[var51];
                                        var88 = 6;
                                        class658.field9184[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = 3;
                                        class658.field9184[2] = var49[var51];
                                        class658.field9184[3] = 3;
                                        class658.field9184[4] = var46[var51];
                                        class658.field9184[5] = var49[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = 7;
                                        class658.field9184[2] = var49[var51];
                                        class658.field9184[3] = 7;
                                        class658.field9184[4] = var46[var51];
                                        var88 = 6;
                                        class658.field9184[5] = var49[var51];
                                    } else {
                                        class658.field9184[0] = var48[var51];
                                        class658.field9184[1] = var46[var51];
                                        var88 = 3;
                                        class658.field9184[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class658.field9184[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field3782[var90];
                                        int var93 = this.field3785[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 512 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 512 - var93;
                                        } else {
                                            var94 = var93;
                                            var95 = var92;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class355.field4736[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg4.method1683(var96, var97, true) - arg2.method1683(var96, var97, true);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class355.field4736[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg2.method1683(var98, var99, true) - arg4.method1683(var98, var99, true);
                                            } else if (arg0 != null && !class623.field8722[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg0.method1683(var100, var101, true) - arg2.method1683(var100, var101, true);
                                            }
                                        }
                                        if (var90 < 8 && class4.field37[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class201.field2383[var91];
                                            }
                                            var59[var52] = class604.field8423[var91];
                                            var58[var52] = class232.field3000[var91];
                                            var57[var52] = class19.field127[var91];
                                        } else {
                                            if (var17 && class355.field4736[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg3[var12][var14];
                                                var58[var52] = var82.field7726;
                                                var59[var52] = var82.field7725;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg3[var12][var15];
                                                var58[var52] = var83.field7726;
                                                var59[var52] = var83.field7725;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg3[var13][var15];
                                                var58[var52] = var84.field7726;
                                                var59[var52] = var84.field7725;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg3[var13][var14];
                                                var58[var52] = var85.field7726;
                                                var59[var52] = var85.field7725;
                                            } else {
                                                if (var95 >= 256) {
                                                    if (var94 < 256) {
                                                        var58[var52] = var85.field7726;
                                                        var59[var52] = var85.field7725;
                                                    } else {
                                                        var58[var52] = var84.field7726;
                                                        var59[var52] = var84.field7725;
                                                    }
                                                } else if (var94 < 256) {
                                                    var58[var52] = var82.field7726;
                                                    var59[var52] = var82.field7725;
                                                } else {
                                                    var58[var52] = var83.field7726;
                                                    var59[var52] = var83.field7725;
                                                }
                                                int var102 = class73.method537(var95 << 7 >> 9, arg5 + 22533, arg3[var12][var14], arg3[var13][var14]);
                                                int var103 = class73.method537(var95 << 7 >> 9, -84, arg3[var12][var15], arg3[var13][var15]);
                                                var57[var52] = class73.method537(var94 << 7 >> 9, -51, var102, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field7736) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg2.method1685(var14, arg5 ^ 0x69DE, var12);
                            int var105 = arg2.method1685(var14, -12639, var13);
                            int var106 = arg2.method1685(var15, -12639, var13);
                            int var107 = arg2.method1685(var15, -12639, var12);
                            boolean var108 = class669.method3767(var14, (byte) -92, var12);
                            if (var108 && arg6 > 1 || !var108 && arg6 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field7735) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field4060) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field3781[arg6][var12][var14] = (byte) class344.method2020(this.field3781[arg6][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field3769) {
                                var110 = class34.method175(var12, var14);
                                var111 = class149.method915(var12, var14);
                                var112 = class73.method538(var12, var14);
                            }
                            arg2.method1544(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class689.method3896(arg6, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg5 != -22657) {
            this.field3786 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[Lpfa;Lha;[[[I)V")
    public final void method1715(int arg0, class298[] arg1, class60 arg2, int[][][] arg3) {
        if (!this.field3769) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3767; var6++) {
                    for (int var7 = 0; var7 < this.field3766; var7++) {
                        if ((class114.field1506[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class114.field1506[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1779(var7, 23254, var6);
                            }
                        }
                    }
                }
            }
        }
        field3761++;
        for (int var9 = arg0; var9 < this.field3774; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3769) {
                if (class756.field10558) {
                    var11 |= 0x8;
                }
                if (class300.field4057) {
                    var10 |= 0x2;
                }
                if (class237.field3105 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class321.field4310) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class300.field4057) {
                var11 |= 0x7;
            }
            if (!class158.field1999) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field3778[var9] : arg3[var9];
            class342.method2014(var9, arg2.method344(this.field3767, this.field3766, this.field3778[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1716(String arg0, boolean arg1) {
        field3765++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - class153.method933((byte) 88, arg0.charAt(var4)));
        }
        if (arg1) {
            method1708(-128, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZIIIIBIIILji;)V")
    private final void method1717(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, class611 arg10) {
        if (arg6 != -111) {
            this.method1711(88, -38, null, 117, -34, -46, -20, -114, null, -78);
        }
        if (arg2 == 1) {
            arg7 = 1;
        } else if (arg2 == 2) {
            arg7 = 1;
            arg8 = 1;
        } else if (arg2 == 3) {
            arg8 = 1;
        }
        field3784++;
        if (arg5 < 0 || this.field3767 <= arg5 || arg0 < 0 || this.field3766 <= arg0) {
            while (true) {
                int var14 = arg10.method3428((byte) 76);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method3428((byte) 122);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method3428((byte) -124);
                }
            }
        }
        if (!this.field3769 && !arg1) {
            class114.field1506[arg9][arg5][arg0] = 0;
        }
        while (true) {
            int var12 = arg10.method3428((byte) 3);
            if (var12 == 0) {
                if (this.field3769) {
                    this.field3778[0][arg5 + arg8][arg0 + arg7] = 0;
                    return;
                } else if (arg9 == 0) {
                    this.field3778[0][arg5 + arg8][arg0 + arg7] = -class33.method160(arg4 + 556238, arg6 + 115, arg3 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field3778[arg9][arg5 + arg8][arg0 + arg7] = this.field3778[arg9 - 1][arg5 + arg8][arg0 + arg7] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method3428((byte) -114);
                if (!this.field3769) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg9 != 0) {
                        this.field3778[arg9][arg5 + arg8][arg0 + arg7] = this.field3778[arg9 - 1][arg5 + arg8][arg0 + arg7] - (var13 * 8 << 2);
                        return;
                    }
                    this.field3778[0][arg5 + arg8][arg0 + arg7] = -var13 * 8 << 2;
                    return;
                }
                this.field3778[0][arg5 + arg8][arg0 + arg7] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg1) {
                    arg10.method3428((byte) -105);
                } else {
                    this.field3763[arg9][arg5][arg0] = arg10.method3390((byte) -19);
                    this.field3789[arg9][arg5][arg0] = (byte) ((var12 - 2) / 4);
                    this.field3790[arg9][arg5][arg0] = (byte) class321.method1919(3, arg2 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field3769 && !arg1) {
                    class114.field1506[arg9][arg5][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg1) {
                this.field3775[arg9][arg5][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIZLcfa;Lkf;)V")
    public class285(int arg0, int arg1, int arg2, boolean arg3, class170 arg4, class256 arg5) {
        this.field3766 = arg2;
        this.field3783 = arg4;
        this.field3774 = arg0;
        this.field3769 = arg3;
        this.field3767 = arg1;
        this.field3772 = arg5;
        this.field3778 = new int[this.field3774][this.field3767 + 1][this.field3766 + 1];
        this.field3789 = new byte[this.field3774][this.field3767][this.field3766];
        this.field3781 = new byte[this.field3774][this.field3767 + 1][this.field3766 + 1];
        this.field3763 = new byte[this.field3774][this.field3767][this.field3766];
        this.field3775 = new byte[this.field3774][this.field3767][this.field3766];
        this.field3790 = new byte[this.field3774][this.field3767][this.field3766];
    }
}
