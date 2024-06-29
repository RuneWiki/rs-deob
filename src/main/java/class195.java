import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class195 extends class406 {

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Lao;")
    private class157 field2806;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Lqp;")
    private class397 field2807;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lje;")
    private class228 field2804;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    private int field2802;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    private int field2801;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "[[F")
    private float[][] field2805;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "[[F")
    private float[][] field2808;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "[[F")
    private float[][] field2814;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "Lhf;")
    private class224 field2809;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Las;")
    private class84 field2813;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Lhf;")
    private class224 field2817;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lum;")
    private class307 field2799;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Ldg;")
    private class236 field2816;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lpq;")
    private class104 field2800;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Lva;")
    private class288 field2810;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    private int field2815;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)V", line = 8)
    private final void method1312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg0 << this.field2804.field3201) + arg4;
        int var11 = arg3 + (arg6 << this.field2804.field3201);
        int var12 = this.field2804.method342(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class406 var13 = this.field2810.method1888(var8, (byte) -30);
            if (var13 != null) {
                this.method1313(16599, ((class325) var13).field4623);
                return;
            }
        }
        short var14 = (short) (this.field2815++);
        if (var8 != -1L) {
            this.field2810.method1886(new class325(var14), var8, 1);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg3 == 0) {
            var15 = this.field2814[arg2][arg5];
            var16 = this.field2805[arg2][arg5];
            var17 = this.field2808[arg2][arg5];
        } else if (this.field2804.field3212 == arg4 && arg3 == 0) {
            var17 = this.field2808[arg2 + 1][arg5];
            var16 = this.field2805[arg2 + 1][arg5];
            var15 = this.field2814[arg2 + 1][arg5];
        } else if (this.field2804.field3212 == arg4 && this.field2804.field3212 == arg3) {
            var15 = this.field2814[arg2 + 1][arg5 + 1];
            var17 = this.field2808[arg2 + 1][arg5 + 1];
            var16 = this.field2805[arg2 + 1][arg5 + 1];
        } else if (arg4 == 0 && this.field2804.field3212 == arg3) {
            var16 = this.field2805[arg2][arg5 + 1];
            var15 = this.field2814[arg2][arg5 + 1];
            var17 = this.field2808[arg2][arg5 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field2804.field3212;
            float var19 = (float) arg3 / (float) this.field2804.field3212;
            float var20 = this.field2814[arg2][arg5];
            float var21 = this.field2808[arg2][arg5];
            float var22 = this.field2805[arg2][arg5];
            float var23 = this.field2814[arg2 + 1][arg5];
            float var24 = this.field2808[arg2 + 1][arg5];
            float var25 = this.field2805[arg2 + 1][arg5];
            float var26 = (this.field2814[arg2][arg5 + 1] - var20) * var18 + var20;
            float var27 = (this.field2808[arg2 + 1][arg5 + 1] - var24) * var18 + var24;
            float var28 = (this.field2805[arg2][arg5 + 1] - var22) * var18 + var22;
            float var29 = (this.field2808[arg2][arg5 + 1] - var21) * var18 + var21;
            float var30 = (this.field2814[arg2 + 1][arg5 + 1] - var23) * var18 + var23;
            float var31 = (this.field2805[arg2 + 1][arg5 + 1] - var25) * var18 + var25;
            var17 = (var27 - var29) * var19 + var29;
            var15 = (var30 - var26) * var19 + var26;
            var16 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field2807.field5682 - var10);
        float var33 = (float) (this.field2807.field5680 - var12);
        float var34 = (float) (this.field2807.field5687 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field2807.field5679;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2807.field5690;
        int var45 = (int) ((float) ((var44 & 0xFF1585) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (arg1 > -34) {
            return;
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2806.field1976) {
            this.field2800.method576(239332760, (float) var10);
            this.field2800.method576(239332760, (float) var12);
            this.field2800.method576(239332760, (float) var11);
        } else {
            this.field2800.method575(false, (float) var10);
            this.field2800.method575(false, (float) var12);
            this.field2800.method575(false, (float) var11);
        }
        this.field2800.method1583(var45, (byte) -123);
        this.field2800.method1583(var46, (byte) -63);
        this.field2800.method1583(var47, (byte) -108);
        this.field2800.method1583(255, (byte) -100);
        this.method1313(16599, var14);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IS)V", line = 175)
    private final void method1313(int arg0, short arg1) {
        if (this.field2806.field1976) {
            this.field2816.method1605(arg1, false);
        } else {
            this.field2816.method1609(arg1, 5544);
        }
        this.field2812++;
        if (arg0 != 16599) {
            this.method1312(124, 50, 47, -76, 30, 66, -44);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([[ZIBII)V", line = 195)
    public final void method1314(boolean[][] arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (this.field2813 == null || arg3 + arg4 < this.field2802 || this.field2803 < arg3 - arg4 || this.field2811 > (arg1 + arg4) || this.field2801 < arg1 - arg4 || arg2 > -125) {
            return;
        }
        for (int var6 = this.field2811; var6 <= this.field2801; var6++) {
            for (int var7 = this.field2802; var7 <= this.field2803; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg1;
                if ((-arg4) < var8 && var8 < arg4 && var9 > (-arg4) && var9 < arg4 && arg0[arg4 + var8][arg4 + var9]) {
                    this.field2806.method988((int) (this.field2807.field5688 * 255.0F) << 24);
                    this.field2806.method985(this.field2817, (class224) null, this.field2809, (class224) null);
                    this.field2806.method968(this.field2813, 4, 0, this.field2812);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lao;Lje;Lqp;[I)V", line = 257)
    public class195(class157 arg0, class228 arg1, class397 arg2, int[] arg3) {
        this.field2806 = arg0;
        this.field2807 = arg2;
        this.field2804 = arg1;
        int var5 = this.field2807.field5679 - (arg1.field3212 >> 1);
        this.field2802 = this.field2807.field5682 - var5 >> arg1.field3201;
        this.field2803 = this.field2807.field5682 + var5 >> arg1.field3201;
        this.field2811 = this.field2807.field5687 - var5 >> arg1.field3201;
        this.field2801 = this.field2807.field5687 + var5 >> arg1.field3201;
        int var6 = this.field2803 + 1 - this.field2802;
        int var7 = this.field2801 + 1 - this.field2811;
        this.field2805 = new float[var6 + 1][var7 + 1];
        this.field2808 = new float[var6 + 1][var7 + 1];
        this.field2814 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field2811 + var8;
            if (var9 > 0 && (this.field2804.field4642 - 1) > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field2802 + var10;
                    if (var11 > 0 && var11 < (this.field2804.field4635 - 1)) {
                        int var12 = arg1.method328(var11 + 1, var9) - arg1.method328(var11 - 1, var9);
                        int var13 = arg1.method328(var11, var9 + 1) - arg1.method328(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field2814[var10][var8] = (float) var12 * var14;
                        this.field2808[var10][var8] = var14 * -256.0F;
                        this.field2805[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field2811; var17 <= this.field2801; var17++) {
            if (var17 >= 0 && arg1.field4642 > var17) {
                for (int var18 = this.field2802; var18 <= this.field2803; var18++) {
                    if (var18 >= 0 && arg1.field4635 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field3198[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field2803 - this.field2802;
            }
        }
        if (var15 <= 0) {
            this.field2809 = null;
            this.field2813 = null;
            this.field2817 = null;
            this.field2799 = null;
        } else {
            this.field2816 = new class236(var15 * 2);
            this.field2800 = new class104(var15 * 16);
            this.field2810 = new class288(class328.method2123(var15, 20867));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field2811; var23 <= this.field2801; var23++) {
                if (var23 >= 0 && var23 < arg1.field4642) {
                    int var24 = 0;
                    for (int var25 = this.field2802; var25 <= this.field2803; var25++) {
                        if (var25 >= 0 && var25 < arg1.field4635) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field3198[var25][var23];
                            int[] var28 = arg1.field3203[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method1312(var25, -39, var24, var28[var29], var27[var29], var22, var23);
                                    }
                                } else if (var26 == 3) {
                                    this.method1312(var25, -122, var24, 0, 0, var22, var23);
                                    this.method1312(var25, -123, var24, 0, arg1.field3212, var22, var23);
                                    this.method1312(var25, -118, var24, arg1.field3212, 0, var22, var23);
                                } else if (var26 == 2) {
                                    this.method1312(var25, -86, var24, 0, arg1.field3212, var22, var23);
                                    this.method1312(var25, -76, var24, arg1.field3212, arg1.field3212, var22, var23);
                                    this.method1312(var25, -49, var24, 0, 0, var22, var23);
                                } else if (var26 == 5) {
                                    this.method1312(var25, -114, var24, arg1.field3212, arg1.field3212, var22, var23);
                                    this.method1312(var25, -57, var24, arg1.field3212, 0, var22, var23);
                                    this.method1312(var25, -60, var24, 0, arg1.field3212, var22, var23);
                                } else if (var26 == 4) {
                                    this.method1312(var25, -117, var24, arg1.field3212, 0, var22, var23);
                                    this.method1312(var25, -85, var24, 0, 0, var22, var23);
                                    this.method1312(var25, -101, var24, arg1.field3212, arg1.field3212, var22, var23);
                                }
                            }
                        }
                        var21++;
                        var24++;
                    }
                } else {
                    var21 += this.field2803 - this.field2802;
                }
                var22++;
            }
            this.field2813 = this.field2806.method967(5123, this.field2816.field3364, this.field2816.field3320, false);
            this.field2799 = this.field2806.method952(16, this.field2800.field3364, this.field2800.field3320, false);
            this.field2817 = new class224(this.field2806, this.field2799, 5126, 3, 0);
            this.field2809 = new class224(this.field2806, this.field2799, 5121, 4, 12);
        }
        this.field2810 = null;
        this.field2814 = this.field2808 = this.field2805 = (float[][]) null;
        this.field2800 = null;
        this.field2816 = null;
    }
}
