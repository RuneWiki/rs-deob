import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class10 extends class161 {

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "Lkg;")
    private class147 field122;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "Lsq;")
    private class96 field129;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lej;")
    private class62 field116;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "[[F")
    private float[][] field130;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "[[F")
    private float[][] field125;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "[[F")
    private float[][] field126;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "Ljg;")
    private class186 field115;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Lbh;")
    private class24 field118;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "Lbn;")
    private class256 field123;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "Lmq;")
    private class295 field132;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "Leb;")
    private class371 field128;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Lqd;")
    private class259 field119;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Lqd;")
    private class259 field114;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BIIIIII)V", line = 9)
    private final void method101(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg1 << this.field122.field2298) + arg4;
        int var11 = (arg6 << this.field122.field2298) + arg5;
        int var12 = this.field122.method771(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class161 var13 = this.field123.method1770(-880, var8);
            if (var13 != null) {
                this.method102(((class43) var13).field537, 127);
                return;
            }
        }
        short var14 = (short) (this.field121++);
        if (var8 != -1L) {
            this.field123.method1766(var8, new class43(var14), -101);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg5 == 0) {
            var15 = this.field125[arg2][arg3];
            var16 = this.field126[arg2][arg3];
            var17 = this.field130[arg2][arg3];
        } else if (this.field122.field2297 == arg4 && arg5 == 0) {
            var15 = this.field125[arg2 + 1][arg3];
            var16 = this.field126[arg2 + 1][arg3];
            var17 = this.field130[arg2 + 1][arg3];
        } else if (this.field122.field2297 == arg4 && this.field122.field2297 == arg5) {
            var17 = this.field130[arg2 + 1][arg3 + 1];
            var15 = this.field125[arg2 + 1][arg3 + 1];
            var16 = this.field126[arg2 + 1][arg3 + 1];
        } else if (arg4 == 0 && this.field122.field2297 == arg5) {
            var15 = this.field125[arg2][arg3 + 1];
            var16 = this.field126[arg2][arg3 + 1];
            var17 = this.field130[arg2][arg3 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field122.field2297;
            float var19 = (float) arg5 / (float) this.field122.field2297;
            float var20 = this.field126[arg2][arg3];
            float var21 = this.field125[arg2][arg3];
            float var22 = this.field130[arg2][arg3];
            float var23 = this.field126[arg2 + 1][arg3];
            float var24 = this.field125[arg2 + 1][arg3];
            float var25 = (this.field126[arg2 + 1][arg3 + 1] - var23) * var18 + var23;
            float var26 = (this.field126[arg2][arg3 + 1] - var20) * var18 + var20;
            float var27 = (this.field130[arg2][arg3 + 1] - var22) * var18 + var22;
            float var28 = (this.field125[arg2][arg3 + 1] - var21) * var18 + var21;
            float var29 = (this.field125[arg2 + 1][arg3 + 1] - var24) * var18 + var24;
            float var30 = this.field130[arg2 + 1][arg3];
            var16 = (var25 - var26) * var19 + var26;
            var15 = (var29 - var28) * var19 + var28;
            float var31 = (this.field130[arg2 + 1][arg3 + 1] - var30) * var18 + var30;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field116.field812 - var10);
        float var33 = (float) (this.field116.field805 - var12);
        float var34 = (float) (this.field116.field809 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field116.field810;
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        int var42 = -33 % ((arg0 - 4) / 37);
        float var43 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var43 < 0.0F) {
            var43 = 0.0F;
        }
        float var44 = var41 * var43 * 2.0F;
        if (var44 > 1.0F) {
            var44 = 1.0F;
        }
        int var45 = this.field116.field808;
        int var46 = (int) ((float) (var45 >> 16 & 0xFF) * var44);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var45 >> 8 & 0xFF) * var44);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var44);
        if (this.field129.field1280) {
            this.field118.method160((byte) 117, (float) var10);
            this.field118.method160((byte) 114, (float) var12);
            this.field118.method160((byte) -17, (float) var11);
        } else {
            this.field118.method161((float) var10, (byte) 78);
            this.field118.method161((float) var12, (byte) -108);
            this.field118.method161((float) var11, (byte) -113);
        }
        if (var48 > 255) {
            var48 = 255;
        }
        this.field118.method1312(var46, -42);
        this.field118.method1312(var47, -111);
        this.field118.method1312(var48, -79);
        this.field118.method1312(255, -55);
        this.method102(var14, 127);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(SI)V", line = 178)
    private final void method102(short arg0, int arg1) {
        if (arg1 != 127) {
            this.method103((boolean[][]) ((boolean[][]) null), 120, -15, 35, -93);
        }
        if (this.field129.field1280) {
            this.field115.method1283(8, arg0);
        } else {
            this.field115.method1319(-13, arg0);
        }
        this.field117++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([[ZIIII)V", line = 204)
    public final void method103(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field132 == null || this.field124 > (arg3 + arg4) || (arg3 - arg4) > this.field127 || (arg1 + arg4) < this.field131 || this.field120 < arg1 - arg4 || arg2 > -11) {
            return;
        }
        for (int var6 = this.field131; var6 <= this.field120; var6++) {
            for (int var7 = this.field124; var7 <= this.field127; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg1;
                if (-arg4 < var8 && arg4 > var8 && (-arg4) < var9 && var9 < arg4 && arg0[arg4 + var8][arg4 + var9]) {
                    this.field129.method599((int) (this.field116.field806 * 255.0F) << 24);
                    this.field129.method607(this.field119, (class259) null, this.field114, (class259) null);
                    this.field129.method646(this.field132, 4, 0, this.field117);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lsq;Lkg;Lej;[I)V", line = 257)
    public class10(class96 arg0, class147 arg1, class62 arg2, int[] arg3) {
        this.field122 = arg1;
        this.field129 = arg0;
        this.field116 = arg2;
        int var5 = this.field116.field810 - (arg1.field2297 >> 1);
        this.field124 = this.field116.field812 - var5 >> arg1.field2298;
        this.field127 = this.field116.field812 + var5 >> arg1.field2298;
        this.field131 = this.field116.field809 - var5 >> arg1.field2298;
        this.field120 = this.field116.field809 + var5 >> arg1.field2298;
        int var6 = this.field127 + 1 - this.field124;
        int var7 = this.field120 + 1 - this.field131;
        this.field130 = new float[var6 + 1][var7 + 1];
        this.field125 = new float[var6 + 1][var7 + 1];
        this.field126 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field131 + var8;
            if (var9 > 0 && (this.field122.field2040 - 1) > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field124 + var10;
                    if (var11 > 0 && var11 < this.field122.field2036 - 1) {
                        int var12 = arg1.method779(var11 + 1, var9) - arg1.method779(var11 - 1, var9);
                        int var13 = arg1.method779(var11, var9 + 1) - arg1.method779(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                        this.field126[var10][var8] = (float) var12 * var14;
                        this.field125[var10][var8] = var14 * -256.0F;
                        this.field130[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field131; var17 <= this.field120; var17++) {
            if (var17 >= 0 && var17 < arg1.field2040) {
                for (int var18 = this.field124; var18 <= this.field127; var18++) {
                    if (var18 >= 0 && arg1.field2036 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field2291[var18][var17];
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
                var16 += this.field127 - this.field124;
            }
        }
        if (var15 > 0) {
            this.field115 = new class186(var15 * 2);
            this.field118 = new class24(var15 * 16);
            this.field123 = new class256(class111.method822((byte) 106, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field131; var23 <= this.field120; var23++) {
                if (var23 >= 0 && var23 < arg1.field2040) {
                    int var24 = 0;
                    for (int var25 = this.field124; var25 <= this.field127; var25++) {
                        if (var25 >= 0 && var25 < arg1.field2036) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field2291[var25][var23];
                            int[] var28 = arg1.field2308[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method101((byte) 51, var25, var24, var21, var27[var29], var28[var29], var23);
                                    }
                                } else if (var26 == 3) {
                                    this.method101((byte) -62, var25, var24, var21, 0, 0, var23);
                                    this.method101((byte) -125, var25, var24, var21, arg1.field2297, 0, var23);
                                    this.method101((byte) 117, var25, var24, var21, 0, arg1.field2297, var23);
                                } else if (var26 == 2) {
                                    this.method101((byte) 89, var25, var24, var21, arg1.field2297, 0, var23);
                                    this.method101((byte) 44, var25, var24, var21, arg1.field2297, arg1.field2297, var23);
                                    this.method101((byte) 54, var25, var24, var21, 0, 0, var23);
                                } else if (var26 == 5) {
                                    this.method101((byte) -70, var25, var24, var21, arg1.field2297, arg1.field2297, var23);
                                    this.method101((byte) 48, var25, var24, var21, 0, arg1.field2297, var23);
                                    this.method101((byte) 72, var25, var24, var21, arg1.field2297, 0, var23);
                                } else if (var26 == 4) {
                                    this.method101((byte) -88, var25, var24, var21, 0, arg1.field2297, var23);
                                    this.method101((byte) 60, var25, var24, var21, 0, 0, var23);
                                    this.method101((byte) -109, var25, var24, var21, arg1.field2297, arg1.field2297, var23);
                                }
                            }
                        }
                        var22++;
                        var24++;
                    }
                } else {
                    var22 += this.field127 - this.field124;
                }
                var21++;
            }
            this.field132 = this.field129.method653(5123, this.field115.field3066, this.field115.field3044, false);
            this.field128 = this.field129.method644(16, this.field118.field3066, this.field118.field3044, false);
            this.field119 = new class259(this.field129, this.field128, 5126, 3, 0);
            this.field114 = new class259(this.field129, this.field128, 5121, 4, 12);
        } else {
            this.field128 = null;
            this.field132 = null;
            this.field114 = null;
            this.field119 = null;
        }
        this.field115 = null;
        this.field118 = null;
        this.field123 = null;
        this.field126 = this.field125 = this.field130 = (float[][]) null;
    }
}
