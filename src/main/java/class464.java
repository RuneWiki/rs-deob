import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class464 {

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "[I")
    private int[] field6741 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "[I")
    private int[] field6749 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "Lsv;")
    private class320 field6747;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public int field6759;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "Lmg;")
    private class529 field6750;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public int field6753;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Z")
    public boolean field6746;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "[[[I")
    public int[][][] field6742;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "[[[B")
    public byte[][][] field6758;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "[[[B")
    private byte[][][] field6757;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "[[[B")
    private byte[][][] field6739;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "[[[B")
    private byte[][][] field6754;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "[[[B")
    private byte[][][] field6738;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "Lgn;")
    public static class526 field6748 = new class526(14, -1);

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "[[[B")
    public byte[][][] field6751;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZIILgk;IIIIII)V")
    private final void method2683(int arg0, boolean arg1, int arg2, int arg3, class468 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg2 == 1) {
            arg6 = 1;
        } else if (arg2 == 2) {
            arg0 = 1;
            arg6 = 1;
        } else if (arg2 == 3) {
            arg0 = 1;
        }
        field6744++;
        if (arg5 >= 0 && arg5 < this.field6753 && arg7 >= 0 && this.field6759 > arg7) {
            if (!this.field6746 && !arg1) {
                class524.field7736[arg9][arg5][arg7] = 0;
            }
            while (true) {
                int var12 = arg4.method2765(arg8 - 8889);
                if (var12 == 0) {
                    if (this.field6746) {
                        this.field6742[0][arg0 + arg5][arg6 + arg7] = 0;
                    } else if (arg9 == 0) {
                        this.field6742[0][arg0 + arg5][arg6 + arg7] = -class23.method235(arg10 + 556238, 932731 - -arg3, (byte) -79) * 8 << 0;
                    } else {
                        this.field6742[arg9][arg0 + arg5][arg7 + arg6] = this.field6742[arg9 - 1][arg0 + arg5][arg6 + arg7] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg4.method2765(115);
                    if (this.field6746) {
                        this.field6742[0][arg0 + arg5][arg7 + arg6] = var13 * 8 << 0;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg9 == 0) {
                            this.field6742[0][arg0 + arg5][arg7 + arg6] = -var13 * 8 << 0;
                        } else {
                            this.field6742[arg9][arg0 + arg5][arg6 + arg7] = this.field6742[arg9 - 1][arg0 + arg5][arg6 + arg7] - (var13 * 8 << 0);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg1) {
                        arg4.method2765(arg8 - 8956);
                    } else {
                        this.field6738[arg9][arg5][arg7] = arg4.method2714((byte) -126);
                        this.field6739[arg9][arg5][arg7] = (byte) ((var12 - 2) / 4);
                        this.field6754[arg9][arg5][arg7] = (byte) class140.method1023(3, arg2 + var12 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!this.field6746 && !arg1) {
                        class524.field7736[arg9][arg5][arg7] = (byte) (var12 - 49);
                    }
                } else if (!arg1) {
                    this.field6757[arg9][arg5][arg7] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg4.method2765(107);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg4.method2765(56);
                    break;
                }
                if (var14 <= 49) {
                    arg4.method2765(arg8 - 8913);
                }
            }
        }
        if (arg8 != 9016) {
            this.method2696(null, (byte) -85, 89, null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public static final void method2684(int arg0) {
        class133.field1990 = arg0;
        class389.field5862 = null;
        field6755++;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V")
    public final void method2685(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6745++;
        for (int var6 = 0; var6 < this.field6761; var6++) {
            this.method2690(arg3, var6, arg0, arg4, arg1, arg2 + 12983);
        }
        if (arg2 != -12984) {
            this.method2695(48, null, 112, null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([[[I[Lep;Lya;I)V")
    public final void method2686(int[][][] arg0, class311[] arg1, class11 arg2, int arg3) {
        field6766++;
        if (!this.field6746) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field6753; var6++) {
                    for (int var7 = 0; var7 < this.field6759; var7++) {
                        if ((class524.field7736[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class524.field7736[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1957(true, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        int var9 = 0;
        if (arg3 != 6199) {
            this.field6753 = -38;
        }
        while (var9 < this.field6761) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field6746) {
                if (class83.field1330) {
                    var11 |= 0x8;
                }
                if (class181.field2693) {
                    var10 |= 0x2;
                }
                if (class351.field5405 != 0) {
                    if (var9 == 0 | class50.field637) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class181.field2693) {
                var11 |= 0x7;
            }
            if (!class203.field2966) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field6742[var9] : arg0[var9];
            class502.method2977(var9, arg2.method70(this.field6753, this.field6759, this.field6742[var9], var12, 128, var10, var11));
            var9++;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[Lep;BIILgk;I)V")
    public final void method2687(int arg0, class311[] arg1, byte arg2, int arg3, int arg4, class468 arg5, int arg6) {
        field6765++;
        if (!this.field6746) {
            for (int var8 = 0; var8 < 4; var8++) {
                class311 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && this.field6753 > var12 && var13 >= 0 && var13 < this.field6759) {
                            var9.method1949(var13, var12, -2097153);
                        }
                    }
                }
            }
        }
        int var14 = arg4 + arg0;
        int var15 = arg3 + arg6;
        int var16 = 0;
        if (arg2 >= -56) {
            this.method2686(null, null, null, -52);
        }
        while (var16 < this.field6761) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2683(0, false, 0, var14 + var17, arg5, arg0 + var17, 0, arg6 + var18, 9016, var16, var15 + var18);
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIILgk;III[Lep;)V")
    public final void method2688(int arg0, int arg1, int arg2, int arg3, int arg4, class468 arg5, int arg6, int arg7, int arg8, class311[] arg9) {
        field6760++;
        int var11 = (arg8 & 0x7) * 8;
        if (!this.field6746) {
            class311 var12 = arg9[arg0];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg7 + class276.method1724(arg1, var13 & 0x7, (byte) -5, var14 & 0x7);
                    int var16 = arg2 + class163.method1148(-2, var13 & 0x7, arg1, var14 & 0x7);
                    if (var15 > 0 && this.field6753 - 1 > var15 && var16 > 0 && (this.field6759 - 1) > var16) {
                        var12.method1949(var16, var15, -2097153);
                    }
                }
            }
        }
        int var17 = (arg3 & 0x7) * 8;
        int var18 = (arg8 & 0xFFFFFFF8) << 3;
        int var19 = arg3 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        int var21 = 21 % (arg4 / 42);
        byte var22 = 0;
        if (arg1 == 1) {
            var22 = 1;
        } else if (arg1 == 2) {
            var22 = 1;
            var20 = 1;
        } else if (arg1 == 3) {
            var20 = 1;
        }
        for (int var23 = 0; var23 < this.field6761; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg6 != var23 || var11 > var24 || var24 > (var11 + 8) || var25 < var17 || var25 > var17 + 8) {
                        this.method2683(0, false, 0, 0, arg5, -1, 0, -1, 9016, 0, 0);
                    } else if (var11 + 8 == var24 || var17 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg1 == 0) {
                            var32 = arg2 + var25 - var17;
                            var33 = arg7 + var24 - var11;
                        } else if (arg1 == 1) {
                            var33 = arg7 + var25 - var17;
                            var32 = arg2 + var11 + 8 - var24;
                        } else if (arg1 == 2) {
                            var33 = arg7 + 8 - (-var11 + var24);
                            var32 = arg2 + var17 + 8 - var25;
                        } else {
                            var32 = arg2 + var24 - var11;
                            var33 = var17 + arg7 + 8 - var25;
                        }
                        this.method2683(0, true, 0, var18 + var24, arg5, var33, 0, var32, 9016, arg0, var19 + var25);
                    } else {
                        int var26 = arg7 + class276.method1724(arg1, var24 & 0x7, (byte) -5, var25 & 0x7);
                        int var27 = class163.method1148(-2, var24 & 0x7, arg1, var25 & 0x7) + arg2;
                        this.method2683(var20, false, arg1, var18 + var24, arg5, var26, var22, var27, 9016, arg0, var19 + var25);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg1 == 0) {
                                var30 = arg7 + var28 - var11;
                                var31 = arg2 - (var17 - var29);
                            } else if (arg1 == 1) {
                                var30 = arg7 + var29 - var17;
                                var31 = arg2 + var11 + 8 - var28;
                            } else if (arg1 == 2) {
                                var30 = arg7 + var11 + 8 - var28;
                                var31 = arg2 - (var29 - var17 - 8);
                            } else {
                                var30 = -var29 - (-var17 - (arg7 + 8));
                                var31 = var28 + arg2 - var11;
                            }
                            if (var30 >= 0 && this.field6753 > var30 && var31 >= 0 && this.field6759 > var31) {
                                this.field6742[arg0][var30][var31] = this.field6742[arg0][var26 + var20][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIBI)I")
    public static final int method2689(int arg0, int arg1, byte arg2, int arg3) {
        field6756++;
        int var4 = arg3 & 0x3;
        if (arg2 <= 58) {
            return -93;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIII)V")
    private final void method2690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg4; var7 < (arg4 + arg0); var7++) {
            for (int var10 = arg3; var10 < arg2 + arg3; var10++) {
                if (var10 >= 0 && var10 < this.field6753 && var7 >= 0 && var7 < this.field6759) {
                    this.field6742[arg1][var10][var7] = arg1 > 0 ? this.field6742[arg1 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        field6752++;
        if (arg3 > 0 && this.field6753 > arg3) {
            for (int var8 = arg4 + 1; var8 < arg0 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field6759) {
                    this.field6742[arg1][arg3][var8] = this.field6742[arg1][arg3 - 1][var8];
                }
            }
        }
        if (~arg4 < arg5 && this.field6759 > arg4) {
            for (int var9 = arg3 + 1; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field6753) {
                    this.field6742[arg1][var9][arg4] = this.field6742[arg1][var9][arg4 - 1];
                }
            }
        }
        if (arg3 < 0 || arg4 < 0 || this.field6753 <= arg3 || this.field6759 <= arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 <= 0 || this.field6742[arg1][arg3 - 1][arg4] == 0) {
                if (arg4 > 0 && this.field6742[arg1][arg3][arg4 - 1] != 0) {
                    this.field6742[arg1][arg3][arg4] = this.field6742[arg1][arg3][arg4 - 1];
                    return;
                }
                if (arg3 > 0 && arg4 > 0 && this.field6742[arg1][arg3 - 1][arg4 - 1] != 0) {
                    this.field6742[arg1][arg3][arg4] = this.field6742[arg1][arg3 - 1][arg4 - 1];
                    return;
                }
                return;
            }
            this.field6742[arg1][arg3][arg4] = this.field6742[arg1][arg3 - 1][arg4];
        } else if (arg3 <= 0 || this.field6742[arg1 - 1][arg3 - 1][arg4] == this.field6742[arg1][arg3 - 1][arg4]) {
            if (arg4 > 0 && this.field6742[arg1 - 1][arg3][arg4 - 1] != this.field6742[arg1][arg3][arg4 - 1]) {
                this.field6742[arg1][arg3][arg4] = this.field6742[arg1][arg3][arg4 - 1];
                return;
            }
            if (arg3 > 0 && arg4 > 0 && this.field6742[arg1][arg3 - 1][arg4 - 1] != this.field6742[arg1 - 1][arg3 - 1][arg4 - 1]) {
                this.field6742[arg1][arg3][arg4] = this.field6742[arg1][arg3 - 1][arg4 - 1];
                return;
            }
        } else {
            this.field6742[arg1][arg3][arg4] = this.field6742[arg1][arg3 - 1][arg4];
            return;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Canvas;BLga;Lec;I)Lya;")
    public static final class11 method2691(Canvas arg0, byte arg1, class243 arg2, class109 arg3, int arg4) {
        field6740++;
        if (arg1 != 45) {
            field6748 = null;
        }
        return new class131(arg4, arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lut;III[[BB[Z[[BLkm;ILya;[[BII)V")
    private final void method2692(class148 arg0, int arg1, int arg2, int arg3, byte[][] arg4, byte arg5, boolean[] arg6, byte[][] arg7, class95 arg8, int arg9, class11 arg10, byte[][] arg11, int arg12, int arg13) {
        field6764++;
        if (arg5 < 59) {
            this.method2693(null, 79, null, null);
        }
        boolean[] var15 = arg0 != null && arg0.field2238 ? class522.field7679[arg1] : class229.field3216[arg1];
        if (arg12 > 0) {
            if (arg2 > 0) {
                int var16 = arg11[arg2 - 1][arg12 - 1] & 0xFF;
                if (var16 > 0) {
                    class148 var17 = this.field6750.method3143((byte) -91, var16 - 1);
                    if (var17.field2232 != -1 && var17.field2238) {
                        byte var18 = arg4[arg2 - 1][arg12 - 1];
                        int var19 = arg7[arg2 - 1][arg12 - 1] * 2 + 4 & 0x7;
                        int var20 = class365.method2183(arg10, 0, var17);
                        if (class365.field5578[var18][var19]) {
                            class355.field5458[0] = var17.field2232;
                            class257.field3495[0] = var20;
                            class517.field7577[0] = arg10.method112() ? var17.field2240 : var17.field2231;
                            class210.field3030[0] = var17.field2229;
                            class470.field6884[0] = var17.field2228;
                            class503.field7410[0] = 256;
                        }
                    }
                }
            }
            if ((arg3 - 1) > arg2) {
                int var21 = arg11[arg2 + 1][arg12 - 1] & 0xFF;
                if (var21 > 0) {
                    class148 var22 = this.field6750.method3143((byte) -91, var21 - 1);
                    if (var22.field2232 != -1 && var22.field2238) {
                        byte var23 = arg4[arg2 + 1][arg12 - 1];
                        int var24 = arg7[arg2 + 1][arg12 - 1] * 2 + 6 & 0x7;
                        int var25 = class365.method2183(arg10, 0, var22);
                        if (class365.field5578[var23][var24]) {
                            class355.field5458[2] = var22.field2232;
                            class257.field3495[2] = var25;
                            class517.field7577[2] = arg10.method112() ? var22.field2240 : var22.field2231;
                            class210.field3030[2] = var22.field2229;
                            class470.field6884[2] = var22.field2228;
                            class503.field7410[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg12 < (arg13 - 1)) {
            if (arg2 > 0) {
                int var26 = arg11[arg2 - 1][arg12 + 1] & 0xFF;
                if (var26 > 0) {
                    class148 var27 = this.field6750.method3143((byte) -91, var26 - 1);
                    if (var27.field2232 != -1 && var27.field2238) {
                        byte var28 = arg4[arg2 - 1][arg12 + 1];
                        int var29 = (arg7[arg2 - 1][arg12 + 1] * 2) + 2 & 0x7;
                        int var30 = class365.method2183(arg10, 0, var27);
                        if (class365.field5578[var28][var29]) {
                            class355.field5458[6] = var27.field2232;
                            class257.field3495[6] = var30;
                            class517.field7577[6] = arg10.method112() ? var27.field2240 : var27.field2231;
                            class210.field3030[6] = var27.field2229;
                            class470.field6884[6] = var27.field2228;
                            class503.field7410[6] = 64;
                        }
                    }
                }
            }
            if (arg3 - 1 > arg2) {
                int var31 = arg11[arg2 + 1][arg12 + 1] & 0xFF;
                if (var31 > 0) {
                    class148 var32 = this.field6750.method3143((byte) -91, var31 - 1);
                    if (var32.field2232 != -1 && var32.field2238) {
                        byte var33 = arg4[arg2 + 1][arg12 + 1];
                        int var34 = -(-(arg7[arg2 + 1][arg12 + 1] * 2)) & 0x7;
                        int var35 = class365.method2183(arg10, 0, var32);
                        if (class365.field5578[var33][var34]) {
                            class355.field5458[4] = var32.field2232;
                            class257.field3495[4] = var35;
                            class517.field7577[4] = arg10.method112() ? var32.field2240 : var32.field2231;
                            class210.field3030[4] = var32.field2229;
                            class470.field6884[4] = var32.field2228;
                            class503.field7410[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg12 > 0) {
            int var36 = arg11[arg2][arg12 - 1] & 0xFF;
            if (var36 > 0) {
                class148 var37 = this.field6750.method3143((byte) -91, var36 - 1);
                if (var37.field2232 != -1) {
                    byte var38 = arg4[arg2][arg12 - 1];
                    byte var39 = arg7[arg2][arg12 - 1];
                    if (var37.field2238) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class365.method2183(arg10, 0, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class365.field5578[var38][var41] && var37.field2228 >= class470.field6884[var40]) {
                                class355.field5458[var40] = var37.field2232;
                                class257.field3495[var40] = var42;
                                class517.field7577[var40] = arg10.method112() ? var37.field2240 : var37.field2231;
                                class210.field3030[var40] = var37.field2229;
                                if (class470.field6884[var40] == var37.field2228) {
                                    class503.field7410[var40] = class390.method2340(class503.field7410[var40], 32);
                                } else {
                                    class503.field7410[var40] = 32;
                                }
                                class470.field6884[var40] = var37.field2228;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg9 & 0x3]) {
                            arg6[0] = class522.field7679[var38][class140.method1023(var39 + 2, 3)];
                        }
                    } else if (!var15[arg9 & 0x3]) {
                        arg6[0] = class229.field3216[var38][class140.method1023(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg13 - 1 > arg12) {
            int var44 = arg11[arg2][arg12 + 1] & 0xFF;
            if (var44 > 0) {
                class148 var45 = this.field6750.method3143((byte) -91, var44 - 1);
                if (var45.field2232 != -1) {
                    byte var46 = arg4[arg2][arg12 + 1];
                    byte var47 = arg7[arg2][arg12 + 1];
                    if (var45.field2238) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class365.method2183(arg10, 0, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class365.field5578[var46][var49] && class470.field6884[var48] <= var45.field2228) {
                                class355.field5458[var48] = var45.field2232;
                                class257.field3495[var48] = var50;
                                class517.field7577[var48] = arg10.method112() ? var45.field2240 : var45.field2231;
                                class210.field3030[var48] = var45.field2229;
                                if (class470.field6884[var48] == var45.field2228) {
                                    class503.field7410[var48] = class390.method2340(class503.field7410[var48], 16);
                                } else {
                                    class503.field7410[var48] = 16;
                                }
                                class470.field6884[var48] = var45.field2228;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg9 + 2 & 0x3]) {
                            arg6[2] = class522.field7679[var46][class140.method1023(-(-var47), 3)];
                        }
                    } else if (!var15[arg9 + 2 & 0x3]) {
                        arg6[2] = class229.field3216[var46][class140.method1023(var47, 3)];
                    }
                }
            }
        }
        if (arg2 > 0) {
            int var52 = arg11[arg2 - 1][arg12] & 0xFF;
            if (var52 > 0) {
                class148 var53 = this.field6750.method3143((byte) -91, var52 - 1);
                if (var53.field2232 != -1) {
                    byte var54 = arg4[arg2 - 1][arg12];
                    byte var55 = arg7[arg2 - 1][arg12];
                    if (var53.field2238) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class365.method2183(arg10, 0, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class365.field5578[var54][var57] && class470.field6884[var56] <= var53.field2228) {
                                class355.field5458[var56] = var53.field2232;
                                class257.field3495[var56] = var58;
                                class517.field7577[var56] = arg10.method112() ? var53.field2240 : var53.field2231;
                                class210.field3030[var56] = var53.field2229;
                                if (class470.field6884[var56] == var53.field2228) {
                                    class503.field7410[var56] = class390.method2340(class503.field7410[var56], 8);
                                } else {
                                    class503.field7410[var56] = 8;
                                }
                                class470.field6884[var56] = var53.field2228;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg9 + 3 & 0x3]) {
                            arg6[3] = class522.field7679[var54][class140.method1023(3, var55 + 1)];
                        }
                    } else if (!var15[arg9 + 3 & 0x3]) {
                        arg6[3] = class229.field3216[var54][class140.method1023(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg3 - 1 > arg2) {
            int var60 = arg11[arg2 + 1][arg12] & 0xFF;
            if (var60 > 0) {
                class148 var61 = this.field6750.method3143((byte) -91, var60 - 1);
                if (var61.field2232 != -1) {
                    byte var62 = arg4[arg2 + 1][arg12];
                    byte var63 = arg7[arg2 + 1][arg12];
                    if (var61.field2238) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class365.method2183(arg10, 0, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class365.field5578[var62][var65] && class470.field6884[var64] <= var61.field2228) {
                                class355.field5458[var64] = var61.field2232;
                                class257.field3495[var64] = var66;
                                class517.field7577[var64] = arg10.method112() ? var61.field2240 : var61.field2231;
                                class210.field3030[var64] = var61.field2229;
                                if (class470.field6884[var64] == var61.field2228) {
                                    class503.field7410[var64] = class390.method2340(class503.field7410[var64], 4);
                                } else {
                                    class503.field7410[var64] = 4;
                                }
                                class470.field6884[var64] = var61.field2228;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg9 + 1 & 0x3]) {
                            arg6[1] = class522.field7679[var62][class140.method1023(3, var63 + 3)];
                        }
                    } else if (!var15[arg9 + 1 & 0x3]) {
                        arg6[1] = class229.field3216[var62][class140.method1023(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        int var68 = class365.method2183(arg10, 0, arg0);
        if (!arg0.field2238) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg9 * 2 & 0x7;
            if (class365.field5578[arg1][var69] && class470.field6884[var70] <= arg0.field2228) {
                class355.field5458[var70] = arg0.field2232;
                class257.field3495[var70] = var68;
                class517.field7577[var70] = arg10.method112() ? arg0.field2240 : arg0.field2231;
                class210.field3030[var70] = arg0.field2229;
                if (class470.field6884[var70] == arg0.field2228) {
                    class503.field7410[var70] = class390.method2340(class503.field7410[var70], 2);
                } else {
                    class503.field7410[var70] = 2;
                }
                class470.field6884[var70] = arg0.field2228;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lta;ILya;Lta;)V")
    public final void method2693(class337 arg0, int arg1, class11 arg2, class337 arg3) {
        if (arg1 != 20949) {
            this.field6761 = 44;
        }
        field6743++;
        if (class265.field3956 == null || class265.field3956.length != this.field6759) {
            class405.field6097 = new int[this.field6759];
            class174.field2548 = new int[this.field6759];
            class265.field3956 = new int[this.field6759];
            class147.field2222 = new int[this.field6759];
            class352.field5424 = new int[this.field6759];
        }
        int[][] var5 = new int[this.field6753][this.field6759];
        for (int var6 = 0; var6 < this.field6761; var6++) {
            for (int var8 = 0; var8 < this.field6759; var8++) {
                class265.field3956[var8] = 0;
                class352.field5424[var8] = 0;
                class405.field6097[var8] = 0;
                class174.field2548[var8] = 0;
                class147.field2222[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field6753; var9++) {
                for (int var10 = 0; var10 < this.field6759; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field6753 > var19) {
                        int var20 = this.field6757[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class95 var21 = this.field6747.method2001(true, var20 - 1);
                            class265.field3956[var10] += var21.field1464;
                            class352.field5424[var10] += var21.field1470;
                            class405.field6097[var10] += var21.field1475;
                            class174.field2548[var10] += var21.field1466;
                            var10002 = class147.field2222[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field6757[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class95 var24 = this.field6747.method2001(true, var23 - 1);
                            class265.field3956[var10] -= var24.field1464;
                            class352.field5424[var10] -= var24.field1470;
                            class405.field6097[var10] -= var24.field1475;
                            class174.field2548[var10] -= var24.field1466;
                            var10002 = class147.field2222[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field6759; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field6759) {
                            var12 += class352.field5424[var17];
                            var14 += class174.field2548[var17];
                            var13 += class405.field6097[var17];
                            var11 += class265.field3956[var17];
                            var15 += class147.field2222[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class265.field3956[var18];
                            var13 -= class405.field6097[var18];
                            var15 -= class147.field2222[var18];
                            var12 -= class352.field5424[var18];
                            var14 -= class174.field2548[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class350.method2118(var11 * 256 / var14, (byte) -52, var12 / var15, var13 / var15);
                        }
                    }
                }
            }
            if (class368.field5604) {
                this.method2696(var6 == 0 ? arg0 : null, (byte) -84, var6, var6 == 0 ? arg3 : null, class249.field3405[var6], arg2, var5);
            } else {
                this.method2695(var6, arg2, 0, class249.field3405[var6], var6 == 0 ? arg0 : null, var6 == 0 ? arg3 : null, var5);
            }
            this.field6757[var6] = null;
            this.field6738[var6] = null;
            this.field6739[var6] = null;
            this.field6754[var6] = null;
        }
        if (!this.field6746) {
            if (class351.field5405 != 0) {
                class330.method2045();
            }
            if (class181.field2693) {
                class88.method689();
            }
        }
        for (int var7 = 0; var7 < this.field6761; var7++) {
            class249.field3405[var7].method705();
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI[[I)V")
    public final void method2694(byte arg0, int arg1, int[][] arg2) {
        if (arg0 != -7) {
            this.method2695(-86, null, 121, null, null, null, null);
        }
        field6767++;
        int[][] var4 = this.field6742[arg1];
        for (int var5 = 0; var5 < this.field6753 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field6759 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILya;ILta;Lta;Lta;[[I)V")
    private final void method2695(int arg0, class11 arg1, int arg2, class337 arg3, class337 arg4, class337 arg5, int[][] arg6) {
        field6762++;
        for (int var8 = arg2; var8 < this.field6753; var8++) {
            for (int var9 = 0; var9 < this.field6759; var9++) {
                if (class224.field3173 == -1 || class41.method328(arg0, 2, var9, class224.field3173, var8)) {
                    byte var10 = this.field6739[arg0][var8][var9];
                    byte var11 = this.field6754[arg0][var8][var9];
                    int var12 = this.field6738[arg0][var8][var9] & 0xFF;
                    int var13 = this.field6757[arg0][var8][var9] & 0xFF;
                    class148 var14 = var12 == 0 ? null : this.field6750.method3143((byte) -91, var12 - 1);
                    class95 var15 = var13 == 0 ? null : this.field6747.method2001(true, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class278.field4207[var10];
                        var16 = var15 == null ? 0 : class30.field435[var10];
                    } else if (var14 != null) {
                        var17 = class278.field4207[var10];
                    } else if (var15 != null) {
                        var16 = class278.field4207[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field2232 == -1 && var14.field2239 == -1 && var14.field2240 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg1.method112() ? var14.field2240 : var14.field2231;
                            if (class495.field7347) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field2229;
                                if (var14.field2232 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field2232;
                                }
                                if (var14.field2239 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field2239;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field6746 && arg0 == 0) {
                                class71.method504(var8, var9, var14.field2236, var14.field2246 * 8, var14.field2237);
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
                            int var28 = var15.field1468;
                            if (class495.field7347) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field1467;
                                var20[var19] = arg6[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field6741.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg4 == null ? null : new int[var31];
                        int[] var35 = arg4 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field6741[var36];
                            int var46 = this.field6749[var36];
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
                            if (var34 != null && class365.field5578[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg4.method718(var49, var50) - arg3.method718(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg4 != null && !class365.field5578[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg3.method718(var51, var52) - arg4.method718(var51, var52);
                                } else if (arg5 != null && !class204.field2987[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method718(var53, var54) - arg3.method718(var53, var54);
                                }
                            }
                        }
                        int var37 = arg3.method707(var8, var9);
                        int var38 = arg3.method707(var8 + 1, var9);
                        int var39 = arg3.method707(var8 + 1, var9 + 1);
                        int var40 = arg3.method707(var8, var9 + 1);
                        if (arg0 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field2248) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field6758[arg0][var8][var9] = (byte) class390.method2340(this.field6758[arg0][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field6746) {
                            var42 = class471.method2802(var8, var9);
                            var43 = class498.method2967(var8, var9);
                            var44 = class49.method370(var8, var9);
                        }
                        arg3.method714(var8, var9, var32, var34, var33, var35, class443.field6515[var10], class29.field420[var10], class468.field6857[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class181.method1235(arg0, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIZLmg;Lsv;)V")
    public class464(int arg0, int arg1, int arg2, boolean arg3, class529 arg4, class320 arg5) {
        this.field6747 = arg5;
        this.field6759 = arg2;
        this.field6750 = arg4;
        this.field6753 = arg1;
        this.field6746 = arg3;
        this.field6761 = arg0;
        this.field6742 = new int[this.field6761][this.field6753 + 1][this.field6759 + 1];
        this.field6758 = new byte[this.field6761][this.field6753 + 1][this.field6759 + 1];
        this.field6757 = new byte[this.field6761][this.field6753][this.field6759];
        this.field6739 = new byte[this.field6761][this.field6753][this.field6759];
        this.field6754 = new byte[this.field6761][this.field6753][this.field6759];
        this.field6738 = new byte[this.field6761][this.field6753][this.field6759];
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lta;BILta;Lta;Lya;[[I)V")
    private final void method2696(class337 arg0, byte arg1, int arg2, class337 arg3, class337 arg4, class11 arg5, int[][] arg6) {
        field6763++;
        byte[][] var8 = this.field6739[arg2];
        byte[][] var9 = this.field6754[arg2];
        byte[][] var10 = this.field6757[arg2];
        byte[][] var11 = this.field6738[arg2];
        int var12 = 0;
        if (arg1 != -84) {
            method2689(82, -4, (byte) 115, -93);
        }
        while (var12 < this.field6753) {
            int var13 = var12 >= (this.field6753 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field6759; var14++) {
                int var15 = var14 < (this.field6759 - 1) ? var14 + 1 : var14;
                if (class224.field3173 == -1 || class41.method328(arg2, 2, var14, class224.field3173, var12)) {
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
                        class148 var26 = var21 == 0 ? null : this.field6750.method3143((byte) -91, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class95 var27 = var22 == 0 ? null : this.field6747.method2001(true, var22 - 1);
                        class148 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2232 == -1 && var26.field2239 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2238;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field6753 > var12 && this.field6759 > var14) {
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
                                var32++;
                                var33++;
                            } else {
                                var32--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var36--;
                                var32--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
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
                                var37 = arg4.method707(var12, var14) - arg4.method707(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg4.method707(var13, var14) - arg4.method707(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class470.field6884[var39] = -1;
                            class503.field7410[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2238 ? class522.field7679[var19] : class229.field3216[var19];
                        this.method2692(var26, var19, var12, this.field6753, var8, (byte) 98, var18, var9, var27, var20, arg5, var11, var14, this.field6759);
                        boolean var41 = var26 != null && var26.field2239 != var26.field2232;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class470.field6884[var42] >= 0 && class355.field5458[var42] != class257.field3495[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class32.method280(var18[1], class140.method1023(class503.field7410[4], class503.field7410[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class32.method280(var18[3], class140.method1023(class503.field7410[0], class503.field7410[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class32.method280(var18[0], class140.method1023(class503.field7410[2], class503.field7410[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class32.method280(var18[2], class140.method1023(class503.field7410[4], class503.field7410[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int var49;
                        if (var43) {
                            var45 = class29.field420[var19];
                            var48 = var27 == null ? 0 : class30.field435[var19];
                            var49 = var26 == null ? 0 : class278.field4207[var19];
                            var46 = class468.field6857[var19];
                            var47 = class443.field6515[var19];
                        } else if (var17) {
                            var45 = class391.field5877[var19];
                            var46 = class26.field388[var19];
                            var47 = class33.field456[var19];
                            var48 = var27 == null ? 0 : class332.field5156[var19];
                            var44 = class301.field4484[var19];
                            var49 = var26 == null ? 0 : class213.field3049[var19];
                        } else {
                            var49 = var26 == null ? 0 : class338.field5215[var19];
                            var47 = class58.field794[var19];
                            var44 = class407.field6150[var19];
                            var45 = class335.field5178[var19];
                            var46 = class460.field6712[var19];
                            var48 = var27 == null ? 0 : class229.field3223[var19];
                        }
                        int var50 = var48 + var49;
                        if (var50 <= 0) {
                            class181.method1235(arg2, var12, var14);
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
                            int[] var61 = arg0 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2232;
                                var63 = arg5.method112() ? var26.field2240 : var26.field2231;
                                var64 = var26.field2229;
                                int var65 = class365.method2183(arg5, 0, var26);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = 1;
                                        class432.field6406[2] = var46[var51];
                                        class432.field6406[3] = 1;
                                        class432.field6406[4] = var45[var51];
                                        class432.field6406[5] = var46[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = 5;
                                        class432.field6406[2] = var46[var51];
                                        class432.field6406[3] = 5;
                                        class432.field6406[4] = var45[var51];
                                        class432.field6406[5] = var46[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = 3;
                                        class432.field6406[2] = var46[var51];
                                        class432.field6406[3] = 3;
                                        class432.field6406[4] = var45[var51];
                                        var98 = 6;
                                        class432.field6406[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = 7;
                                        class432.field6406[2] = var46[var51];
                                        class432.field6406[3] = 7;
                                        class432.field6406[4] = var45[var51];
                                        var98 = 6;
                                        class432.field6406[5] = var46[var51];
                                    } else {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = var45[var51];
                                        class432.field6406[2] = var46[var51];
                                        var98 = 3;
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class432.field6406[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field6741[var100];
                                        int var103 = this.field6749[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var102;
                                            var105 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 128 - var103;
                                        } else {
                                            var104 = var102;
                                            var105 = var103;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class365.field5578[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg0.method718(var106, var107) - arg4.method718(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class365.field5578[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg4.method718(var108, var109) - arg0.method718(var108, var109);
                                            } else if (arg3 != null && !class204.field2987[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg3.method718(var110, var111) - arg4.method718(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field2228 < class470.field6884[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class257.field3495[var101];
                                            }
                                            var59[var52] = class210.field3030[var101];
                                            var58[var52] = class517.field7577[var101];
                                            var57[var52] = class355.field5458[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg5.method112() ? var26.field2240 : var26.field2231;
                                            var59[var52] = var26.field2229;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field6746 && arg2 == 0) {
                                    class71.method504(var12, var14, var26.field2236, var26.field2246 * 8, var26.field2237);
                                }
                                if (var19 != 12 && var26.field2232 != -1 && var26.field2235) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class278.field4207[var19];
                            } else if (var17) {
                                var51 += class213.field3049[var19];
                            } else {
                                var51 += class338.field5215[var19];
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
                                class95 var67 = this.field6747.method2001(true, var22 - 1);
                                class95 var68 = this.field6747.method2001(true, var23 - 1);
                                class95 var69 = this.field6747.method2001(true, var24 - 1);
                                class95 var70 = this.field6747.method2001(true, var25 - 1);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = 1;
                                        class432.field6406[2] = var46[var51];
                                        class432.field6406[3] = 1;
                                        class432.field6406[4] = var45[var51];
                                        class432.field6406[5] = var46[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = 5;
                                        class432.field6406[2] = var46[var51];
                                        class432.field6406[3] = 5;
                                        class432.field6406[4] = var45[var51];
                                        class432.field6406[5] = var46[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = 3;
                                        class432.field6406[2] = var46[var51];
                                        class432.field6406[3] = 3;
                                        class432.field6406[4] = var45[var51];
                                        var73 = 6;
                                        class432.field6406[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = 7;
                                        class432.field6406[2] = var46[var51];
                                        class432.field6406[3] = 7;
                                        class432.field6406[4] = var45[var51];
                                        class432.field6406[5] = var46[var51];
                                        var73 = 6;
                                    } else {
                                        class432.field6406[0] = var47[var51];
                                        class432.field6406[1] = var45[var51];
                                        class432.field6406[2] = var46[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class432.field6406[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field6741[var75];
                                        int var78 = this.field6749[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class365.field5578[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg0.method718(var81, var82) - arg4.method718(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class365.field5578[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg4.method718(var83, var84) - arg0.method718(var83, var84);
                                            } else if (arg3 != null && !class204.field2987[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg3.method718(var85, var86) - arg4.method718(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class470.field6884[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class257.field3495[var76];
                                            }
                                            var59[var52] = class210.field3030[var76];
                                            var58[var52] = class517.field7577[var76];
                                            var57[var52] = class355.field5458[var76];
                                        } else {
                                            if (var17 && class365.field5578[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var67.field1468;
                                                var59[var52] = var67.field1467;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var68.field1468;
                                                var59[var52] = var68.field1467;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var69.field1468;
                                                var59[var52] = var69.field1467;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var70.field1468;
                                                var59[var52] = var70.field1467;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 < 64) {
                                                        var58[var52] = var67.field1468;
                                                        var59[var52] = var67.field1467;
                                                    } else {
                                                        var58[var52] = var68.field1468;
                                                        var59[var52] = var68.field1467;
                                                    }
                                                } else if (var79 >= 64) {
                                                    var58[var52] = var69.field1468;
                                                    var59[var52] = var69.field1467;
                                                } else {
                                                    var58[var52] = var70.field1468;
                                                    var59[var52] = var70.field1467;
                                                }
                                                int var87 = class149.method1081(arg6[var13][var14], -1, var80 << 7 >> 7, arg6[var12][var14]);
                                                int var88 = class149.method1081(arg6[var13][var15], -1, var80 << 7 >> 7, arg6[var12][var15]);
                                                var57[var52] = class149.method1081(var88, -1, var79 << 7 >> 7, var87);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field1473) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg4.method707(var12, var14);
                            int var90 = arg4.method707(var13, var14);
                            int var91 = arg4.method707(var13, var15);
                            int var92 = arg4.method707(var12, var15);
                            if (arg2 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field2248) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field6758[arg2][var12][var14] = (byte) class390.method2340(this.field6758[arg2][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field6746) {
                                var94 = class471.method2802(var12, var14);
                                var95 = class498.method2967(var12, var14);
                                var96 = class49.method370(var12, var14);
                            }
                            arg4.method717(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class181.method1235(arg2, var12, var14);
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
    public static void method2697(int arg0) {
        field6748 = null;
        if (arg0 != 4) {
            method2684(-113);
        }
    }
}
