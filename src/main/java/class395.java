import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class395 extends class55 {

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Lac;")
    private class541 field5592;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "Lok;")
    private class257 field5614;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Lcba;")
    private class551 field5591;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    private int field5613;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    private int field5601;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    private int field5603;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    private int field5602;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "[[F")
    private float[][] field5593;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "[[F")
    private float[][] field5600;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "[[F")
    private float[][] field5608;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    private int field5596;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "Lji;")
    private class611 field5599;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Lvda;")
    private class183 field5594;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "Lwr;")
    private class459 field5611;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "Ldw;")
    private class718 field5598;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "Lob;")
    private class738 field5607;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "Lgk;")
    private class475 field5612;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "Lgk;")
    private class475 field5615;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Llga;")
    public static class712 field5597 = new class712(80, 3);

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    private int field5606;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "Lofa;")
    public static class332 field5609;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "Lha;")
    public static class60 field5617;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIII[FFIIF[F)V")
    public static final void method2296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, int arg9, float arg10, float[] arg11) {
        field5610++;
        int var12 = arg5 - arg4;
        int var13 = arg3 - arg1;
        int var14 = arg0 - arg9;
        float var15 = arg6[2] * (float) var13 + arg6[0] * (float) var14 + arg6[1] * (float) var12;
        float var16 = arg6[5] * (float) var13 + arg6[4] * (float) var12 + arg6[3] * (float) var14;
        float var17 = arg6[arg2] * (float) var13 + arg6[7] * (float) var12 + arg6[6] * (float) var14;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var18 = arg7 * var18;
        }
        float var19 = var16 + arg10 + 0.5F;
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg11[0] = var18;
        arg11[1] = var19;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III[[ZB)V")
    public final void method2297(int arg0, int arg1, int arg2, boolean[][] arg3, byte arg4) {
        field5605++;
        if (this.field5598 == null || (arg1 + arg2) < this.field5613 || arg2 - arg1 > this.field5601 || arg4 < 31 || arg0 + arg1 < this.field5603 || this.field5602 < arg0 - arg1) {
            return;
        }
        for (int var6 = this.field5603; var6 <= this.field5602; var6++) {
            for (int var7 = this.field5613; var7 <= this.field5601; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg0;
                if (-arg1 < var8 && var8 < arg1 && (-arg1) < var9 && var9 < arg1 && arg3[arg1 + var8][arg1 + var9]) {
                    this.field5592.method3025((int) (this.field5591.method3131(false) * 255.0F) << 24, -120);
                    this.field5592.method3011(this.field5615, null, null, this.field5612, 0);
                    this.field5592.method3008(this.field5596, 4, this.field5598, false, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIII)V")
    private final void method2298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5595++;
        long var8 = -1L;
        int var10 = arg4 + (arg5 << this.field5614.field3722);
        int var11 = (arg3 << this.field5614.field3722) + arg1;
        int var12 = this.field5614.method1683(var10, var11, true);
        if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class55 var13 = this.field5611.method2552(var8, -1);
            if (var13 != null) {
                this.method2300(1522918928, ((class450) var13).field6288);
                return;
            }
        }
        short var14 = (short) (this.field5606++);
        if (var8 != -1L) {
            this.field5611.method2558(new class450(var14), var8, -1);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg1 == 0) {
            var15 = this.field5593[arg6][arg2];
            var16 = this.field5600[arg6][arg2];
            var17 = this.field5608[arg6][arg2];
        } else if (this.field5614.field3730 == arg4 && arg1 == 0) {
            var16 = this.field5600[arg6 + 1][arg2];
            var15 = this.field5593[arg6 + 1][arg2];
            var17 = this.field5608[arg6 + 1][arg2];
        } else if (this.field5614.field3730 == arg4 && this.field5614.field3730 == arg1) {
            var16 = this.field5600[arg6 + 1][arg2 + 1];
            var15 = this.field5593[arg6 + 1][arg2 + 1];
            var17 = this.field5608[arg6 + 1][arg2 + 1];
        } else if (arg4 == 0 && this.field5614.field3730 == arg1) {
            var16 = this.field5600[arg6][arg2 + 1];
            var17 = this.field5608[arg6][arg2 + 1];
            var15 = this.field5593[arg6][arg2 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field5614.field3730;
            float var19 = (float) arg1 / (float) this.field5614.field3730;
            float var20 = this.field5593[arg6][arg2];
            float var21 = this.field5600[arg6][arg2];
            float var22 = this.field5608[arg6][arg2];
            float var23 = this.field5593[arg6 + 1][arg2];
            float var24 = this.field5600[arg6 + 1][arg2];
            float var25 = this.field5608[arg6 + 1][arg2];
            float var26 = (this.field5593[arg6][arg2 + 1] - var20) * var18 + var20;
            float var27 = (this.field5600[arg6 + 1][arg2 + 1] - var24) * var18 + var24;
            float var28 = (this.field5608[arg6][arg2 + 1] - var22) * var18 + var22;
            float var29 = (this.field5593[arg6 + 1][arg2 + 1] - var23) * var18 + var23;
            float var30 = (this.field5600[arg6][arg2 + 1] - var21) * var18 + var21;
            float var31 = (this.field5608[arg6 + 1][arg2 + 1] - var25) * var18 + var25;
            var16 = (var27 - var30) * var19 + var30;
            var15 = (var29 - var26) * var19 + var26;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field5591.method3130(7019) - var10);
        float var33 = (float) (this.field5591.method3137((byte) 73) - var12);
        float var34 = (float) (this.field5591.method3136(28699) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field5591.method3133(127);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var39 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field5591.method3135((byte) -78);
        int var45 = (int) ((float) ((var44 & 0xFF1301) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field5592.field7608) {
            this.field5594.method1037((byte) -126, (float) var10);
            this.field5594.method1037((byte) 7, (float) var12);
            this.field5594.method1037((byte) -116, (float) var11);
        } else {
            this.field5594.method1038((byte) -52, (float) var10);
            this.field5594.method1038((byte) -52, (float) var12);
            this.field5594.method1038((byte) -52, (float) var11);
        }
        this.field5594.method3393(var45, -92);
        this.field5594.method3393(var46, -85);
        this.field5594.method3393(var47, 124);
        this.field5594.method3393(255, -44);
        this.method2300(1522918928, var14);
        if (arg0 < 85) {
            method2299((byte) -76);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public static void method2299(byte arg0) {
        field5597 = null;
        if (arg0 != 119) {
            field5597 = null;
        }
        field5609 = null;
        field5617 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IS)V")
    private final void method2300(int arg0, short arg1) {
        if (this.field5592.field7608) {
            this.field5599.method3423(arg1, arg0 + 48943960);
        } else {
            this.field5599.method3446(arg1, 4);
        }
        if (arg0 != 1522918928) {
            field5597 = null;
        }
        field5604++;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lac;Lok;Lcba;[I)V")
    public class395(class541 arg0, class257 arg1, class551 arg2, int[] arg3) {
        this.field5592 = arg0;
        this.field5614 = arg1;
        this.field5591 = arg2;
        int var5 = this.field5591.method3133(-33) - (arg1.field3730 >> 1);
        this.field5613 = this.field5591.method3130(7019) - var5 >> arg1.field3722;
        this.field5601 = this.field5591.method3130(7019) + var5 >> arg1.field3722;
        this.field5603 = this.field5591.method3136(28699) - var5 >> arg1.field3722;
        this.field5602 = var5 + this.field5591.method3136(28699) >> arg1.field3722;
        int var6 = this.field5601 + 1 - this.field5613;
        int var7 = this.field5602 + 1 - this.field5603;
        this.field5593 = new float[var6 + 1][var7 + 1];
        this.field5600 = new float[var6 + 1][var7 + 1];
        this.field5608 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field5603 + var8;
            if (var25 > 0 && var25 < (this.field5614.field3728 - 1)) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field5613 + var26;
                    if (var27 > 0 && (this.field5614.field3727 - 1) > var27) {
                        int var28 = arg1.method1685(var25, -12639, var27 + 1) - arg1.method1685(var25, -12639, var27 - 1);
                        int var29 = arg1.method1685(var25 + 1, -12639, var27) - arg1.method1685(var25 - 1, -12639, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field5593[var26][var8] = (float) var28 * var30;
                        this.field5600[var26][var8] = var30 * -256.0F;
                        this.field5608[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field5603; var10 <= this.field5602; var10++) {
            if (var10 >= 0 && var10 < arg1.field3728) {
                for (int var21 = this.field5613; var21 <= this.field5601; var21++) {
                    if (var21 >= 0 && arg1.field3727 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field3358[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field5596 += 3;
                                    }
                                }
                            } else {
                                this.field5596 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field5601 - this.field5613;
            }
        }
        if (this.field5596 > 0) {
            this.field5599 = new class611(this.field5596 * 2);
            this.field5594 = new class183(this.field5596 * 16);
            this.field5611 = new class459(class128.method814(423660257, this.field5596));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field5603; var13 <= this.field5602; var13++) {
                if (var13 >= 0 && arg1.field3728 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field5613; var15 <= this.field5601; var15++) {
                        if (var15 >= 0 && arg1.field3727 > var15) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field3358[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field3326[var15][var13];
                                    int[] var19 = arg1.field3329[var15][var13];
                                    int var20 = 0;
                                    label109: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label109;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2298(101, var19[var20], var12, var13, var18[var20], var15, var14);
                                                var20++;
                                                this.method2298(97, var19[var20], var12, var13, var18[var20], var15, var14);
                                                var20++;
                                                this.method2298(106, var19[var20], var12, var13, var18[var20], var15, var14);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2298(117, 0, var12, var13, 0, var15, var14);
                                    this.method2298(118, 0, var12, var13, arg1.field3730, var15, var14);
                                    this.method2298(98, arg1.field3730, var12, var13, 0, var15, var14);
                                } else if (var16 == 2) {
                                    this.method2298(91, 0, var12, var13, arg1.field3730, var15, var14);
                                    this.method2298(122, arg1.field3730, var12, var13, arg1.field3730, var15, var14);
                                    this.method2298(120, 0, var12, var13, 0, var15, var14);
                                } else if (var16 == 5) {
                                    this.method2298(122, arg1.field3730, var12, var13, arg1.field3730, var15, var14);
                                    this.method2298(90, arg1.field3730, var12, var13, 0, var15, var14);
                                    this.method2298(102, 0, var12, var13, arg1.field3730, var15, var14);
                                } else if (var16 == 4) {
                                    this.method2298(116, arg1.field3730, var12, var13, 0, var15, var14);
                                    this.method2298(105, 0, var12, var13, 0, var15, var14);
                                    this.method2298(92, arg1.field3730, var12, var13, arg1.field3730, var15, var14);
                                }
                            }
                        }
                        var11++;
                        var14++;
                    }
                } else {
                    var11 += this.field5601 - this.field5613;
                }
                var12++;
            }
            this.field5598 = this.field5592.method2981(5123, this.field5599.field8529, 7, false, this.field5599.field8520);
            this.field5607 = this.field5592.method3021(this.field5594.field8520, false, 16, -55, this.field5594.field8529);
            this.field5612 = new class475(this.field5607, 5126, 3, 0);
            this.field5615 = new class475(this.field5607, 5121, 4, 12);
        } else {
            this.field5615 = null;
            this.field5598 = null;
            this.field5612 = null;
            this.field5607 = null;
        }
        this.field5593 = this.field5600 = this.field5608 = null;
        this.field5594 = null;
        this.field5611 = null;
        this.field5599 = null;
    }
}
