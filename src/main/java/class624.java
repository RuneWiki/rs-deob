import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class624 {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[I")
    private int[] field8817 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!b", name = "C", descriptor = "[I")
    private int[] field8833 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Z")
    public boolean field8821;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lmh;")
    private class153 field8809;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public int field8811;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public int field8807;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field8816;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lfh;")
    private class268 field8820;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[[[B")
    public byte[][][] field8815;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "[[[B")
    private byte[][][] field8835;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[[[B")
    private byte[][][] field8808;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[[[I")
    public int[][][] field8806;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[[[B")
    private byte[][][] field8819;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "[[[B")
    private byte[][][] field8825;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
    public static int[] field8805 = new int[2048];

    @OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
    public static int[] field8832 = new int[6];

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lhh;")
    public static class665 field8826;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Ltf;")
    public static class701 field8827;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[[[B")
    public byte[][][] field8823;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lnp;[Ljw;IIIIIIII)V")
    public final void method3502(class115 arg0, class263[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8828++;
        int var11 = (arg5 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * 8;
        if (!this.field8821) {
            class263 var13 = arg1[arg4];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class486.method2802(var14 & 0x7, 451, var15 & 0x7, arg9) + arg2;
                    int var17 = arg6 + class619.method3455(arg9, arg7 ^ 0x4EEA, var14 & 0x7, var15 & 0x7);
                    if (var16 > 0 && (this.field8816 - 1) > var16 && var17 > 0 && var17 < (this.field8811 - 1)) {
                        var13.method1551(var17, false, var16);
                    }
                }
            }
        }
        int var18 = arg5 & 0x1FFFFFF8 << 3;
        int var19 = arg3 & 0x1FFFFFF8 << 3;
        if (arg7 != 5816) {
            method3511(true);
        }
        byte var20 = 0;
        byte var21 = 0;
        if (arg9 == 1) {
            var21 = 1;
        } else if (arg9 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg9 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field8807; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg8 == var22 && var11 <= var23 && var11 + 8 >= var23 && var12 <= var24 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                            if (arg9 == 0) {
                                var25 = arg2 + var23 - var11;
                                var26 = var24 + arg6 - var12;
                            } else if (arg9 == 1) {
                                var25 = var24 + arg2 - var12;
                                var26 = var11 + arg6 + 8 - var23;
                            } else if (arg9 == 2) {
                                var26 = var12 + arg6 + 8 - var24;
                                var25 = var11 + arg2 + 8 - var23;
                            } else {
                                var26 = var23 + arg6 - var11;
                                var25 = var12 + arg2 + 8 - var24;
                            }
                            this.method3512(0, var25, var18 + var23, 0, true, arg4, var26, arg0, 0, (byte) -108, var19 + var24);
                        } else {
                            var25 = class486.method2802(var23 & 0x7, arg7 ^ 0x177B, var24 & 0x7, arg9) + arg2;
                            var26 = class619.method3455(arg9, 22610, var23 & 0x7, var24 & 0x7) + arg6;
                            this.method3512(var21, var25, var18 + var23, arg9, false, arg4, var26, arg0, var20, (byte) -113, var19 + var24);
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
                                if (arg9 == 0) {
                                    var31 = arg6 + var30 - var12;
                                    var32 = var29 + arg2 - var11;
                                } else if (arg9 == 1) {
                                    var31 = arg6 - (-var11 - 8) - var29;
                                    var32 = var30 + arg2 - var12;
                                } else if (arg9 == 2) {
                                    var31 = -var30 - (-var12 - arg6 - 8);
                                    var32 = arg2 + 8 - (var29 - var11);
                                } else {
                                    var32 = arg2 + 8 - (var30 - var12);
                                    var31 = arg6 + var29 - var11;
                                }
                                if (var32 >= 0 && var32 < this.field8816 && var31 >= 0 && var31 < this.field8811) {
                                    this.field8806[arg4][var32][var31] = this.field8806[arg4][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method3512(0, -1, 0, 0, false, 0, -1, arg0, 0, (byte) -89, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB[[I)V")
    public final void method3503(int arg0, byte arg1, int[][] arg2) {
        field8834++;
        int[][] var4 = this.field8806[arg0];
        for (int var5 = 0; var5 < (this.field8816 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field8811 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
        if (arg1 != 97) {
            this.field8835 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Li;Li;IBLi;[[ILr;)V")
    private final void method3504(class274 arg0, class274 arg1, int arg2, byte arg3, class274 arg4, int[][] arg5, class564 arg6) {
        if (arg3 > -69) {
            return;
        }
        field8818++;
        for (int var8 = 0; var8 < this.field8816; var8++) {
            for (int var9 = 0; var9 < this.field8811; var9++) {
                if (class480.field6920 == -1 || class457.method2624(-25097, var8, arg2, class480.field6920, var9)) {
                    byte var10 = this.field8825[arg2][var8][var9];
                    byte var11 = this.field8835[arg2][var8][var9];
                    int var12 = this.field8808[arg2][var8][var9] & 0xFF;
                    int var13 = this.field8819[arg2][var8][var9] & 0xFF;
                    class226 var14 = var12 == 0 ? null : this.field8820.method1579(var12 - 1, -116);
                    class379 var15 = var13 == 0 ? null : this.field8809.method829(1, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class499.field7210[var10];
                        var16 = var15 == null ? 0 : class587.field8316[var10];
                    } else if (var14 != null) {
                        var17 = class499.field7210[var10];
                    } else if (var15 != null) {
                        var16 = class499.field7210[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20;
                        if (class240.field2976) {
                            var20 = var14 == null ? -1 : var14.field2792;
                        } else {
                            var20 = -1;
                        }
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        boolean var25 = false;
                        if (var14 != null && (var14.field2799 != -1 || var14.field2795 != -1 || var20 != -1)) {
                            for (int var26 = 0; var26 < var17; var26++) {
                                var23[var19] = var20;
                                var24[var19] = var14.field2801;
                                if (var14.field2799 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field2799;
                                }
                                if (var14.field2795 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field2795;
                                    var25 = true;
                                }
                                var19++;
                            }
                            if (!this.field8821 && arg2 == 0) {
                                class99.method537(var8, var9, var14.field2790, var14.field2798 * 8, var14.field2786);
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field5128;
                            if (class240.field2976) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var23[var19] = var29;
                                var24[var19] = var15.field5133;
                                var21[var19] = arg5[var8][var9];
                                if (var22 != null) {
                                    var22[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field8817.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg4 == null ? null : new int[var31];
                        int[] var35 = arg4 == null && arg0 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var46 = this.field8817[var36];
                            int var47 = this.field8833[var36];
                            if (var11 == 0) {
                                var32[var36] = var46;
                                var33[var36] = var47;
                            } else if (var11 == 1) {
                                var32[var36] = var47;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var46;
                                var33[var36] = 512 - var47;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var47;
                                var33[var36] = var46;
                            }
                            if (var34 != null && class166.field1871[var10][var36]) {
                                int var50 = (var8 << 9) + var46;
                                int var51 = (var9 << 9) + var46;
                                var34[var36] = arg4.method1610(var50, 101, var51) - arg1.method1610(var50, 114, var51);
                            }
                            if (var35 != null) {
                                if (arg4 != null && !class166.field1871[var10][var36]) {
                                    int var52 = (var8 << 9) + var46;
                                    int var53 = (var9 << 9) + var46;
                                    var35[var36] = arg1.method1610(var52, 124, var53) - arg4.method1610(var52, 98, var53);
                                } else if (arg0 != null && !class384.field5191[var10][var36]) {
                                    int var54 = (var8 << 9) + var46;
                                    int var55 = (var9 << 9) + var46;
                                    var35[var36] = arg0.method1610(var54, 110, var55) - arg1.method1610(var54, 97, var55);
                                }
                            }
                        }
                        int var37 = arg1.method1608(var9, 840, var8);
                        int var38 = arg1.method1608(var9, 840, var8 + 1);
                        int var39 = arg1.method1608(var9 + 1, 840, var8 + 1);
                        int var40 = arg1.method1608(var9 + 1, 840, var8);
                        boolean var41 = class568.method3221(var9, var8, 0);
                        if (var41 && arg2 > 1 || !var41 && arg2 > 0) {
                            boolean var42 = true;
                            if (var15 != null && !var15.field5136) {
                                var42 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var42 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field2791) {
                                var42 = false;
                            }
                            if (var42 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field8815[arg2][var8][var9] = (byte) class422.method2436(this.field8815[arg2][var8][var9], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field8821) {
                            var43 = class87.method447(var8, var9);
                            var44 = class542.method3051(var8, var9);
                            var45 = class323.method1826(var8, var9);
                        }
                        arg1.method391(var8, var9, var32, var34, var33, var35, class196.field2270[var10], class654.field9175[var10], class697.field9782[var10], var21, var22, var23, var24, var43, var44, var45, false);
                        class579.method3277(arg2, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILnp;I[Ljw;I)V")
    public final void method3505(int arg0, int arg1, int arg2, class115 arg3, int arg4, class263[] arg5, int arg6) {
        field8831++;
        if (!this.field8821) {
            for (int var8 = 0; var8 < 4; var8++) {
                class263 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && this.field8816 > var12 && var13 >= 0 && this.field8811 > var13) {
                            var9.method1551(var13, false, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg0;
        if (arg4 < 28) {
            this.method3504(null, null, -98, (byte) -115, null, null, null);
        }
        int var15 = arg2 + arg6;
        for (int var16 = 0; var16 < this.field8807; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3512(0, arg0 + var17, var14 + var17, 0, false, var16, arg6 + var18, arg3, 0, (byte) -125, var15 + var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZIIII)V")
    private final void method3506(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < (arg3 + arg4); var7++) {
            for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
                if (var10 >= 0 && this.field8816 > var10 && var7 >= 0 && var7 < this.field8811) {
                    this.field8806[arg0][var10][var7] = arg0 > 0 ? this.field8806[arg0 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        if (!arg1) {
            this.field8833 = null;
        }
        field8814++;
        if (arg2 > 0 && arg2 < this.field8816) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg4); var8++) {
                if (var8 >= 0 && var8 < this.field8811) {
                    this.field8806[arg0][arg2][var8] = this.field8806[arg0][arg2 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field8811) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && this.field8816 > var9) {
                    this.field8806[arg0][var9][arg3] = this.field8806[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg2 < 0 || arg3 < 0 || this.field8816 <= arg2 || this.field8811 <= arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 > 0 && this.field8806[arg0][arg2 - 1][arg3] != 0) {
                this.field8806[arg0][arg2][arg3] = this.field8806[arg0][arg2 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field8806[arg0][arg2][arg3 - 1] != 0) {
                this.field8806[arg0][arg2][arg3] = this.field8806[arg0][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && this.field8806[arg0][arg2 - 1][arg3 - 1] != 0) {
                this.field8806[arg0][arg2][arg3] = this.field8806[arg0][arg2 - 1][arg3 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field8806[arg0 - 1][arg2 - 1][arg3] == this.field8806[arg0][arg2 - 1][arg3]) {
            if (arg3 > 0 && this.field8806[arg0][arg2][arg3 - 1] != this.field8806[arg0 - 1][arg2][arg3 - 1]) {
                this.field8806[arg0][arg2][arg3] = this.field8806[arg0][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && this.field8806[arg0][arg2 - 1][arg3 - 1] != this.field8806[arg0 - 1][arg2 - 1][arg3 - 1]) {
                this.field8806[arg0][arg2][arg3] = this.field8806[arg0][arg2 - 1][arg3 - 1];
                return;
            }
            return;
        } else {
            this.field8806[arg0][arg2][arg3] = this.field8806[arg0][arg2 - 1][arg3];
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILr;IIBI[[B[ZII[[B[[BLot;Lov;)V")
    private final void method3507(int arg0, class564 arg1, int arg2, int arg3, byte arg4, int arg5, byte[][] arg6, boolean[] arg7, int arg8, int arg9, byte[][] arg10, byte[][] arg11, class226 arg12, class379 arg13) {
        field8813++;
        boolean[] var15 = arg12 != null && arg12.field2789 ? class459.field6523[arg9] : class626.field8846[arg9];
        if (arg4 != -73) {
            return;
        }
        if (arg5 > 0) {
            if (arg3 > 0) {
                int var16 = arg6[arg3 - 1][arg5 - 1] & 0xFF;
                if (var16 > 0) {
                    class226 var17 = this.field8820.method1579(var16 - 1, -93);
                    if (var17.field2799 != -1 && var17.field2789) {
                        byte var18 = arg11[arg3 - 1][arg5 - 1];
                        int var19 = (arg10[arg3 - 1][arg5 - 1] * 2) + 4 & 0x7;
                        int var20 = class247.method1459(arg4 ^ 0xFFFFC5F2, var17, arg1);
                        if (class166.field1871[var18][var19]) {
                            class72.field720[0] = var17.field2799;
                            class320.field3939[0] = var20;
                            class490.field7124[0] = var17.field2792;
                            class162.field1813[0] = var17.field2801;
                            class460.field6539[0] = var17.field2805;
                            class359.field4808[0] = 256;
                        }
                    }
                }
            }
            if (arg8 - 1 > arg3) {
                int var21 = arg6[arg3 + 1][arg5 - 1] & 0xFF;
                if (var21 > 0) {
                    class226 var22 = this.field8820.method1579(var21 - 1, -56);
                    if (var22.field2799 != -1 && var22.field2789) {
                        byte var23 = arg11[arg3 + 1][arg5 - 1];
                        int var24 = arg10[arg3 + 1][arg5 - 1] * 2 + 6 & 0x7;
                        int var25 = class247.method1459(14917, var22, arg1);
                        if (class166.field1871[var23][var24]) {
                            class72.field720[2] = var22.field2799;
                            class320.field3939[2] = var25;
                            class490.field7124[2] = var22.field2792;
                            class162.field1813[2] = var22.field2801;
                            class460.field6539[2] = var22.field2805;
                            class359.field4808[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg2 - 1 > arg5) {
            if (arg3 > 0) {
                int var26 = arg6[arg3 - 1][arg5 + 1] & 0xFF;
                if (var26 > 0) {
                    class226 var27 = this.field8820.method1579(var26 - 1, -116);
                    if (var27.field2799 != -1 && var27.field2789) {
                        byte var28 = arg11[arg3 - 1][arg5 + 1];
                        int var29 = (arg10[arg3 - 1][arg5 + 1] * 2) + 2 & 0x7;
                        int var30 = class247.method1459(14917, var27, arg1);
                        if (class166.field1871[var28][var29]) {
                            class72.field720[6] = var27.field2799;
                            class320.field3939[6] = var30;
                            class490.field7124[6] = var27.field2792;
                            class162.field1813[6] = var27.field2801;
                            class460.field6539[6] = var27.field2805;
                            class359.field4808[6] = 64;
                        }
                    }
                }
            }
            if (arg3 < (arg8 - 1)) {
                int var31 = arg6[arg3 + 1][arg5 + 1] & 0xFF;
                if (var31 > 0) {
                    class226 var32 = this.field8820.method1579(var31 - 1, -89);
                    if (var32.field2799 != -1 && var32.field2789) {
                        byte var33 = arg11[arg3 + 1][arg5 + 1];
                        int var34 = arg10[arg3 + 1][arg5 + 1] * 2 & 0x7;
                        int var35 = class247.method1459(14917, var32, arg1);
                        if (class166.field1871[var33][var34]) {
                            class72.field720[4] = var32.field2799;
                            class320.field3939[4] = var35;
                            class490.field7124[4] = var32.field2792;
                            class162.field1813[4] = var32.field2801;
                            class460.field6539[4] = var32.field2805;
                            class359.field4808[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var36 = arg6[arg3][arg5 - 1] & 0xFF;
            if (var36 > 0) {
                class226 var37 = this.field8820.method1579(var36 - 1, arg4 + 32);
                if (var37.field2799 != -1) {
                    byte var38 = arg11[arg3][arg5 - 1];
                    byte var39 = arg10[arg3][arg5 - 1];
                    if (var37.field2789) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class247.method1459(14917, var37, arg1);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class166.field1871[var38][var41] && var37.field2805 >= class460.field6539[var40]) {
                                class72.field720[var40] = var37.field2799;
                                class320.field3939[var40] = var42;
                                class490.field7124[var40] = var37.field2792;
                                class162.field1813[var40] = var37.field2801;
                                if (class460.field6539[var40] == var37.field2805) {
                                    class359.field4808[var40] = class422.method2436(class359.field4808[var40], 32);
                                } else {
                                    class359.field4808[var40] = 32;
                                }
                                class460.field6539[var40] = var37.field2805;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg0 & 0x3]) {
                            arg7[0] = class459.field6523[var38][class105.method572(var39 + 2, 3)];
                        }
                    } else if (!var15[arg0 & 0x3]) {
                        arg7[0] = class626.field8846[var38][class105.method572(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg2 - 1) > arg5) {
            int var44 = arg6[arg3][arg5 + 1] & 0xFF;
            if (var44 > 0) {
                class226 var45 = this.field8820.method1579(var44 - 1, arg4 + -35);
                if (var45.field2799 != -1) {
                    byte var46 = arg11[arg3][arg5 + 1];
                    byte var47 = arg10[arg3][arg5 + 1];
                    if (var45.field2789) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class247.method1459(14917, var45, arg1);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class166.field1871[var46][var49] && class460.field6539[var48] <= var45.field2805) {
                                class72.field720[var48] = var45.field2799;
                                class320.field3939[var48] = var50;
                                class490.field7124[var48] = var45.field2792;
                                class162.field1813[var48] = var45.field2801;
                                if (class460.field6539[var48] == var45.field2805) {
                                    class359.field4808[var48] = class422.method2436(class359.field4808[var48], 16);
                                } else {
                                    class359.field4808[var48] = 16;
                                }
                                class460.field6539[var48] = var45.field2805;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg0 + 2 & 0x3]) {
                            arg7[2] = class459.field6523[var46][class105.method572(3, var47)];
                        }
                    } else if (!var15[arg0 + 2 & 0x3]) {
                        arg7[2] = class626.field8846[var46][class105.method572(var47, 3)];
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var52 = arg6[arg3 - 1][arg5] & 0xFF;
            if (var52 > 0) {
                class226 var53 = this.field8820.method1579(var52 - 1, -99);
                if (var53.field2799 != -1) {
                    byte var54 = arg11[arg3 - 1][arg5];
                    byte var55 = arg10[arg3 - 1][arg5];
                    if (var53.field2789) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class247.method1459(14917, var53, arg1);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class166.field1871[var54][var57] && var53.field2805 >= class460.field6539[var56]) {
                                class72.field720[var56] = var53.field2799;
                                class320.field3939[var56] = var58;
                                class490.field7124[var56] = var53.field2792;
                                class162.field1813[var56] = var53.field2801;
                                if (class460.field6539[var56] == var53.field2805) {
                                    class359.field4808[var56] = class422.method2436(class359.field4808[var56], 8);
                                } else {
                                    class359.field4808[var56] = 8;
                                }
                                class460.field6539[var56] = var53.field2805;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg0 + 3 & 0x3]) {
                            arg7[3] = class459.field6523[var54][class105.method572(3, var55 + 1)];
                        }
                    } else if (!var15[arg0 + 3 & 0x3]) {
                        arg7[3] = class626.field8846[var54][class105.method572(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg3 < arg8 - 1) {
            int var60 = arg6[arg3 + 1][arg5] & 0xFF;
            if (var60 > 0) {
                class226 var61 = this.field8820.method1579(var60 - 1, -62);
                if (var61.field2799 != -1) {
                    byte var62 = arg11[arg3 + 1][arg5];
                    byte var63 = arg10[arg3 + 1][arg5];
                    if (var61.field2789) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class247.method1459(14917, var61, arg1);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class166.field1871[var62][var65] && var61.field2805 >= class460.field6539[var64]) {
                                class72.field720[var64] = var61.field2799;
                                class320.field3939[var64] = var66;
                                class490.field7124[var64] = var61.field2792;
                                class162.field1813[var64] = var61.field2801;
                                if (class460.field6539[var64] == var61.field2805) {
                                    class359.field4808[var64] = class422.method2436(class359.field4808[var64], 4);
                                } else {
                                    class359.field4808[var64] = 4;
                                }
                                class460.field6539[var64] = var61.field2805;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg0 + 1 & 0x3]) {
                            arg7[1] = class459.field6523[var62][class105.method572(3, var63 + 3)];
                        }
                    } else if (!var15[arg0 + 1 & 0x3]) {
                        arg7[1] = class626.field8846[var62][class105.method572(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg12 == null) {
            return;
        }
        int var68 = class247.method1459(14917, arg12, arg1);
        if (!arg12.field2789) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg0 * 2) & 0x7;
            if (class166.field1871[arg9][var69] && arg12.field2805 >= class460.field6539[var70]) {
                class72.field720[var70] = arg12.field2799;
                class320.field3939[var70] = var68;
                class490.field7124[var70] = arg12.field2792;
                class162.field1813[var70] = arg12.field2801;
                if (class460.field6539[var70] == arg12.field2805) {
                    class359.field4808[var70] = class422.method2436(class359.field4808[var70], 2);
                } else {
                    class359.field4808[var70] = 2;
                }
                class460.field6539[var70] = arg12.field2805;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method3508(int arg0) {
        if (arg0 == 1) {
            field8832 = null;
            field8826 = null;
            field8827 = null;
            field8805 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBII)V")
    public final void method3509(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = -95 % ((arg2 - 48) / 39);
        for (int var7 = 0; var7 < this.field8807; var7++) {
            this.method3506(var7, true, arg4, arg1, arg0, arg3);
        }
        field8812++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;ILi;Li;)V")
    public final void method3510(class564 arg0, int arg1, class274 arg2, class274 arg3) {
        field8829++;
        int[][] var5 = new int[this.field8816][this.field8811];
        if (class112.field1185 == null || class112.field1185.length != this.field8811) {
            class46.field479 = new int[this.field8811];
            class46.field473 = new int[this.field8811];
            class273.field3419 = new int[this.field8811];
            class381.field5162 = new int[this.field8811];
            class112.field1185 = new int[this.field8811];
        }
        if (arg1 >= -115) {
            method3508(83);
        }
        for (int var6 = 0; var6 < this.field8807; var6++) {
            for (int var8 = 0; var8 < this.field8811; var8++) {
                class112.field1185[var8] = 0;
                class46.field479[var8] = 0;
                class273.field3419[var8] = 0;
                class381.field5162[var8] = 0;
                class46.field473[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field8816; var9++) {
                for (int var10 = 0; var10 < this.field8811; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field8816) {
                        int var20 = this.field8819[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class379 var21 = this.field8809.method829(1, var20 - 1);
                            class112.field1185[var10] += var21.field5130;
                            class46.field479[var10] += var21.field5138;
                            class273.field3419[var10] += var21.field5132;
                            class381.field5162[var10] += var21.field5129;
                            var10002 = class46.field473[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field8819[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class379 var24 = this.field8809.method829(1, var23 - 1);
                            class112.field1185[var10] -= var24.field5130;
                            class46.field479[var10] -= var24.field5138;
                            class273.field3419[var10] -= var24.field5132;
                            class381.field5162[var10] -= var24.field5129;
                            var10002 = class46.field473[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field8811; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field8811) {
                            var14 += class381.field5162[var17];
                            var11 += class112.field1185[var17];
                            var15 += class46.field473[var17];
                            var13 += class273.field3419[var17];
                            var12 += class46.field479[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class112.field1185[var18];
                            var13 -= class273.field3419[var18];
                            var12 -= class46.field479[var18];
                            var15 -= class46.field473[var18];
                            var14 -= class381.field5162[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class684.method3789(var12 / var15, var11 * 256 / var14, -22054, var13 / var15);
                        }
                    }
                }
            }
            if (class146.field1617) {
                this.method3513(var5, var6 == 0 ? arg2 : null, arg0, 1, var6 == 0 ? arg3 : null, class156.field1743[var6], var6);
            } else {
                this.method3504(var6 == 0 ? arg2 : null, class156.field1743[var6], var6, (byte) -125, var6 == 0 ? arg3 : null, var5, arg0);
            }
            this.field8819[var6] = null;
            this.field8808[var6] = null;
            this.field8825[var6] = null;
            this.field8835[var6] = null;
        }
        if (!this.field8821) {
            if (class612.field8619 != 0) {
                class496.method2867();
            }
            if (class470.field6717) {
                class127.method725();
            }
        }
        for (int var7 = 0; var7 < this.field8807; var7++) {
            class156.field1743[var7].method392();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static final void method3511(boolean arg0) {
        class156.field1748.method1577(64, 5);
        field8824++;
        class573.field8132.method834(0, 5);
        class508.field7303.method2950(64, 5);
        class364.field4891.method2135(!arg0, 5);
        class369.field5055.method336(59, 5);
        class19.field153.method277(5, (byte) 118);
        class265.field3301.method3041((byte) -89, 5);
        class63.field654.method2193(5, (byte) -92);
        class259.field3254.method3831(5, -121);
        field8826.method3689(5, (byte) 33);
        class400.field5381.method2169(5, arg0);
        class247.field3060.method702(5, 0);
        class689.field9695.method1118(5, 70);
        class53.field531.method1561(5, (byte) -65);
        class600.field8445.method1057(32, 5);
        class66.field669.method2491(5, 82);
        class328.field4021.method1374(arg0, 5);
        class211.field2553.method2804(5, 512);
        class693.field9725.method2464((byte) 126, 5);
        class304.field3768.method1111(22425, 5);
        class41.method214(5, (byte) -113);
        class305.method1761(27, 50);
        class366.method2152(50, 1);
        class278.method1623(5, 1400);
        class129.method734(1846, 5);
        class162.field1815.method83((byte) -2, 5);
        class697.field9777.method83((byte) -2, 5);
        class66.field667.method83((byte) -2, 5);
        class664.field9289.method83((byte) -2, 5);
        class281.field3516.method83((byte) -2, 5);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIZIILnp;IBI)V")
    private final void method3512(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class115 arg7, int arg8, byte arg9, int arg10) {
        if (arg9 > -85) {
            return;
        }
        if (arg3 == 1) {
            arg0 = 1;
        } else if (arg3 == 2) {
            arg0 = 1;
            arg8 = 1;
        } else if (arg3 == 3) {
            arg8 = 1;
        }
        field8822++;
        if (arg1 < 0 || arg1 >= this.field8816 || arg6 < 0 || this.field8811 <= arg6) {
            while (true) {
                int var14 = arg7.method620((byte) -126);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method620((byte) -126);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method620((byte) 73);
                }
            }
        }
        if (!this.field8821 && !arg4) {
            class16.field131[arg5][arg1][arg6] = 0;
        }
        while (true) {
            int var12 = arg7.method620((byte) -128);
            if (var12 == 0) {
                if (this.field8821) {
                    this.field8806[0][arg1 + arg8][arg0 + arg6] = 0;
                    return;
                } else if (arg5 == 0) {
                    this.field8806[0][arg1 + arg8][arg6 + arg0] = -class295.method1725(-108, arg10 + 556238, 932731 - -arg2) * 8 << 2;
                    return;
                } else {
                    this.field8806[arg5][arg1 + arg8][arg0 + arg6] = this.field8806[arg5 - 1][arg1 + arg8][arg6 + arg0] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method620((byte) 122);
                if (this.field8821) {
                    this.field8806[0][arg1 + arg8][arg0 + arg6] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg5 != 0) {
                    this.field8806[arg5][arg1 + arg8][arg0 + arg6] = this.field8806[arg5 - 1][arg1 + arg8][arg0 + arg6] - (var13 * 8 << 2);
                    return;
                }
                this.field8806[0][arg1 + arg8][arg6 + arg0] = -var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg4) {
                    arg7.method620((byte) 38);
                } else {
                    this.field8808[arg5][arg1][arg6] = arg7.method657(false);
                    this.field8825[arg5][arg1][arg6] = (byte) ((var12 - 2) / 4);
                    this.field8835[arg5][arg1][arg6] = (byte) class105.method572(var12 + arg3 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field8821 && !arg4) {
                    class16.field131[arg5][arg1][arg6] = (byte) (var12 - 49);
                }
            } else if (!arg4) {
                this.field8819[arg5][arg1][arg6] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([[ILi;Lr;ILi;Li;I)V")
    private final void method3513(int[][] arg0, class274 arg1, class564 arg2, int arg3, class274 arg4, class274 arg5, int arg6) {
        field8810++;
        byte[][] var8 = this.field8825[arg6];
        byte[][] var9 = this.field8835[arg6];
        byte[][] var10 = this.field8819[arg6];
        byte[][] var11 = this.field8808[arg6];
        for (int var12 = 0; var12 < this.field8816; var12++) {
            int var13 = (this.field8816 - 1) > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field8811; var14++) {
                int var15 = (this.field8811 - 1) > var14 ? var14 + 1 : var14;
                if (class480.field6920 == -1 || class457.method2624(-25097, var12, arg6, class480.field6920, var14)) {
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
                        class226 var26 = var21 == 0 ? null : this.field8820.method1579(var21 - 1, -115);
                        class379 var27 = var22 == 0 ? null : this.field8809.method829(1, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class226 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2799 == -1 && var26.field2795 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2789;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field8816 && this.field8811 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var33 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method1608(var14, arg3 + 839, var12) - arg5.method1608(var15, arg3 ^ 0x349, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method1608(var14, 840, var13) - arg5.method1608(var15, 840, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class460.field6539[var39] = -1;
                            class359.field4808[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2789 ? class459.field6523[var19] : class626.field8846[var19];
                        this.method3507(var20, arg2, this.field8811, var12, (byte) -73, var14, var11, var18, this.field8816, var19, var9, var8, var26, var27);
                        boolean var41 = var26 != null && var26.field2799 != var26.field2795;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class460.field6539[var42] >= 0 && class72.field720[var42] != class320.field3939[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class288.method1679(var18[1], class105.method572(class359.field4808[2], class359.field4808[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class288.method1679(var18[3], class105.method572(class359.field4808[0], class359.field4808[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class288.method1679(var18[0], class105.method572(class359.field4808[0], class359.field4808[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class288.method1679(var18[2], class105.method572(class359.field4808[6], class359.field4808[4]) == 0);
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
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
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
                            var45 = var26 == null ? 0 : class499.field7210[var19];
                            var46 = class654.field9175[var19];
                            var47 = class196.field2270[var19];
                            var48 = var27 == null ? 0 : class587.field8316[var19];
                            var49 = class697.field9782[var19];
                        } else if (var17) {
                            var46 = class119.field1334[var19];
                            var48 = var27 == null ? 0 : class666.field9305[var19];
                            var47 = class566.field8072[var19];
                            var45 = var26 == null ? 0 : class310.field3834[var19];
                            var49 = class307.field3792[var19];
                            var44 = class309.field3829[var19];
                        } else {
                            var45 = var26 == null ? 0 : class507.field7286[var19];
                            var44 = class620.field8765[var19];
                            var46 = class139.field1527[var19];
                            var47 = class349.field4726[var19];
                            var48 = var27 == null ? 0 : class603.field8473[var19];
                            var49 = class148.field1633[var19];
                        }
                        int var50 = var45 + var48;
                        if (var50 <= 0) {
                            class579.method3277(arg6, var12, var14);
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
                            int[] var61 = arg4 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field2801;
                                var63 = var26.field2792;
                                var62 = var26.field2799;
                                int var65 = class247.method1459(14917, var26, arg2);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = 1;
                                        class334.field4183[2] = var49[var51];
                                        class334.field4183[3] = 1;
                                        class334.field4183[4] = var46[var51];
                                        var68 = 6;
                                        class334.field4183[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = 5;
                                        class334.field4183[2] = var49[var51];
                                        class334.field4183[3] = 5;
                                        class334.field4183[4] = var46[var51];
                                        var68 = 6;
                                        class334.field4183[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = 3;
                                        class334.field4183[2] = var49[var51];
                                        class334.field4183[3] = 3;
                                        class334.field4183[4] = var46[var51];
                                        var68 = 6;
                                        class334.field4183[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = 7;
                                        class334.field4183[2] = var49[var51];
                                        class334.field4183[3] = 7;
                                        class334.field4183[4] = var46[var51];
                                        class334.field4183[5] = var49[var51];
                                        var68 = 6;
                                    } else {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = var46[var51];
                                        var68 = 3;
                                        class334.field4183[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class334.field4183[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field8817[var70];
                                        int var73 = this.field8833[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = 512 - var72;
                                            var75 = var73;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 3) {
                                            var74 = var72;
                                            var75 = 512 - var73;
                                        } else {
                                            var75 = var72;
                                            var74 = var73;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class166.field1871[var19][var70]) {
                                            int var76 = (var12 << 9) + var75;
                                            int var77 = (var14 << 9) + var74;
                                            var60[var52] = arg4.method1610(var76, 99, var77) - arg5.method1610(var76, 119, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class166.field1871[var19][var70]) {
                                                int var78 = (var12 << 9) + var75;
                                                int var79 = (var14 << 9) + var74;
                                                var61[var52] = arg5.method1610(var78, 121, var79) - arg4.method1610(var78, 125, var79);
                                            } else if (arg1 != null && !class384.field5191[var19][var70]) {
                                                int var80 = (var12 << 9) + var75;
                                                int var81 = (var14 << 9) + var74;
                                                var61[var52] = arg1.method1610(var80, arg3 + 98, var81) - arg5.method1610(var80, 93, var81);
                                            }
                                        }
                                        if (var70 < 8 && class460.field6539[var71] > var26.field2805) {
                                            if (var54 != null) {
                                                var54[var52] = class320.field3939[var71];
                                            }
                                            var59[var52] = class162.field1813[var71];
                                            var58[var52] = class490.field7124[var71];
                                            var57[var52] = class72.field720[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field2792;
                                            var59[var52] = var26.field2801;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field8821 && arg6 == 0) {
                                    class99.method537(var12, var14, var26.field2790, var26.field2798 * 8, var26.field2786);
                                }
                                if (var19 != 12 && var26.field2799 != -1 && var26.field2802) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class499.field7210[var19];
                            } else if (var17) {
                                var51 += class310.field3834[var19];
                            } else {
                                var51 += class507.field7286[var19];
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
                                class379 var82 = this.field8809.method829(arg3, var22 - 1);
                                class379 var83 = this.field8809.method829(arg3, var23 - 1);
                                class379 var84 = this.field8809.method829(1, var24 - 1);
                                class379 var85 = this.field8809.method829(arg3, var25 - 1);
                                for (int var86 = 0; var86 < var48; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = 1;
                                        class334.field4183[2] = var49[var51];
                                        class334.field4183[3] = 1;
                                        class334.field4183[4] = var46[var51];
                                        class334.field4183[5] = var49[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = 5;
                                        class334.field4183[2] = var49[var51];
                                        class334.field4183[3] = 5;
                                        class334.field4183[4] = var46[var51];
                                        var88 = 6;
                                        class334.field4183[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = 3;
                                        class334.field4183[2] = var49[var51];
                                        class334.field4183[3] = 3;
                                        class334.field4183[4] = var46[var51];
                                        var88 = 6;
                                        class334.field4183[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = 7;
                                        class334.field4183[2] = var49[var51];
                                        class334.field4183[3] = 7;
                                        class334.field4183[4] = var46[var51];
                                        var88 = 6;
                                        class334.field4183[5] = var49[var51];
                                    } else {
                                        class334.field4183[0] = var47[var51];
                                        class334.field4183[1] = var46[var51];
                                        var88 = 3;
                                        class334.field4183[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class334.field4183[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field8817[var90];
                                        int var93 = this.field8833[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 512 - var93;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class166.field1871[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg4.method1610(var96, 121, var97) - arg5.method1610(var96, 121, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class166.field1871[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg5.method1610(var98, arg3 + 96, var99) - arg4.method1610(var98, 127, var99);
                                            } else if (arg1 != null && !class384.field5191[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg1.method1610(var100, class2.method13(arg3, 89), var101) - arg5.method1610(var100, 108, var101);
                                            }
                                        }
                                        if (var90 < 8 && class460.field6539[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class320.field3939[var91];
                                            }
                                            var59[var52] = class162.field1813[var91];
                                            var58[var52] = class490.field7124[var91];
                                            var57[var52] = class72.field720[var91];
                                        } else {
                                            if (var17 && class166.field1871[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var82.field5128;
                                                var59[var52] = var82.field5133;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var83.field5128;
                                                var59[var52] = var83.field5133;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var84.field5128;
                                                var59[var52] = var84.field5133;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var85.field5128;
                                                var59[var52] = var85.field5133;
                                            } else {
                                                if (var94 < 256) {
                                                    if (var95 < 256) {
                                                        var58[var52] = var82.field5128;
                                                        var59[var52] = var82.field5133;
                                                    } else {
                                                        var58[var52] = var83.field5128;
                                                        var59[var52] = var83.field5133;
                                                    }
                                                } else if (var95 < 256) {
                                                    var58[var52] = var85.field5128;
                                                    var59[var52] = var85.field5133;
                                                } else {
                                                    var58[var52] = var84.field5128;
                                                    var59[var52] = var84.field5133;
                                                }
                                                int var102 = class593.method3337(arg0[var13][var14], var94 << 7 >> 9, arg0[var12][var14], arg3 + 10990);
                                                int var103 = class593.method3337(arg0[var13][var15], var94 << 7 >> 9, arg0[var12][var15], 10991);
                                                var57[var52] = class593.method3337(var103, var95 << 7 >> 9, var102, arg3 + 10990);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field5135) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg5.method1608(var14, 840, var12);
                            int var105 = arg5.method1608(var14, arg3 + 839, var13);
                            int var106 = arg5.method1608(var15, 840, var13);
                            int var107 = arg5.method1608(var15, 840, var12);
                            boolean var108 = class568.method3221(var14, var12, 0);
                            if (var108 && arg6 > 1 || !var108 && arg6 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field5136) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field2791) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field8815[arg6][var12][var14] = (byte) class422.method2436(this.field8815[arg6][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field8821) {
                                var110 = class87.method447(var12, var14);
                                var111 = class542.method3051(var12, var14);
                                var112 = class323.method1826(var12, var14);
                            }
                            arg5.method387(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class579.method3277(arg6, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg3 != 1) {
            this.field8806 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[Ljw;Lr;[[[I)V")
    public final void method3514(int arg0, class263[] arg1, class564 arg2, int[][][] arg3) {
        if (!this.field8821) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field8816; var6++) {
                    for (int var7 = 0; var7 < this.field8811; var7++) {
                        if ((class16.field131[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class16.field131[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1556(var6, (byte) -126, var7);
                            }
                        }
                    }
                }
            }
        }
        field8830++;
        int var9 = 0;
        int var10 = 36 % ((51 - arg0) / 39);
        while (this.field8807 > var9) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field8821) {
                if (class412.field5528) {
                    var12 |= 0x8;
                }
                if (class470.field6717) {
                    var11 |= 0x2;
                }
                if (class612.field8619 != 0) {
                    var11 |= 0x1;
                    if (class379.field5141 | var9 == 0) {
                        var12 |= 0x10;
                    }
                }
            }
            if (class470.field6717) {
                var12 |= 0x7;
            }
            if (!class674.field9392) {
                var12 |= 0x20;
            }
            int[][] var13 = arg3 == null || arg3.length <= var9 ? this.field8806[var9] : arg3[var9];
            class659.method3656(var9, arg2.method1001(this.field8816, this.field8811, this.field8806[var9], var13, 512, var11, var12));
            var9++;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIZLfh;Lmh;)V")
    public class624(int arg0, int arg1, int arg2, boolean arg3, class268 arg4, class153 arg5) {
        this.field8821 = arg3;
        this.field8809 = arg5;
        this.field8811 = arg2;
        this.field8807 = arg0;
        this.field8816 = arg1;
        this.field8820 = arg4;
        this.field8815 = new byte[this.field8807][this.field8816 + 1][this.field8811 + 1];
        this.field8835 = new byte[this.field8807][this.field8816][this.field8811];
        this.field8808 = new byte[this.field8807][this.field8816][this.field8811];
        this.field8806 = new int[this.field8807][this.field8816 + 1][this.field8811 + 1];
        this.field8819 = new byte[this.field8807][this.field8816][this.field8811];
        this.field8825 = new byte[this.field8807][this.field8816][this.field8811];
    }
}
