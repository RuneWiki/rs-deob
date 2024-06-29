import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class446 extends class449 {

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "Lka;")
    private class140 field6352;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "Lfu;")
    private class42 field6356;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "Lnq;")
    private class104 field6350;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    private int field6362;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
    private int field6368;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    private int field6358;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    private int field6351;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "[[F")
    private float[][] field6354;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "[[F")
    private float[][] field6360;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "[[F")
    private float[][] field6361;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "Lfm;")
    private class170 field6355;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "Lpc;")
    private class171 field6363;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "Lfm;")
    private class170 field6357;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "Ljj;")
    private class159 field6366;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "Lkk;")
    private class161 field6367;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "Lfi;")
    private class160 field6359;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "Lwk;")
    private class155 field6364;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    private int field6353;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    private int field6365;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IS)V", line = 8)
    private final void method2704(int arg0, short arg1) {
        if (this.field6356.field622) {
            this.field6367.method1173(arg1, (byte) 124);
        } else {
            this.field6367.method1196(arg1, (byte) -68);
        }
        this.field6353++;
        if (arg0 < 53) {
            this.method2705(89, 32, -87, (boolean[][]) ((boolean[][]) null), 27);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III[[ZI)V", line = 34)
    public final void method2705(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        if (this.field6366 == null || this.field6362 > (arg2 + arg4) || this.field6368 < (arg2 - arg4) || this.field6358 > (arg0 + arg4) || arg0 - arg4 > this.field6351) {
            return;
        }
        for (int var6 = this.field6358; var6 <= this.field6351; var6++) {
            for (int var7 = this.field6362; var7 <= this.field6368; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg0;
                if ((-arg4) < var8 && arg4 > var8 && -arg4 < var9 && arg4 > var9 && arg3[var8 + arg4][arg4 + var9]) {
                    this.field6356.method436((int) (this.field6350.field1460 * 255.0F) << 24);
                    this.field6356.method406(this.field6357, (class170) null, this.field6355, (class170) null);
                    this.field6356.method312(this.field6366, 4, 0, this.field6353);
                    return;
                }
            }
        }
        if (arg1 != -17263) {
            this.field6362 = -34;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIBIII)V", line = 92)
    private final void method2706(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg2 << this.field6352.field1952) + arg6;
        int var11 = (arg0 << this.field6352.field1952) + arg1;
        int var12 = this.field6352.method590(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 & 0xFFFFL << 16;
            class449 var13 = this.field6364.method1104(-125, var8);
            if (var13 != null) {
                this.method2704(71, ((class434) var13).field6139);
                return;
            }
        }
        short var14 = (short) (this.field6365++);
        if (var8 != -1L) {
            this.field6364.method1100(new class434(var14), -124, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg1 == 0) {
            var15 = this.field6354[arg5][arg4];
            var16 = this.field6360[arg5][arg4];
            var17 = this.field6361[arg5][arg4];
        } else if (this.field6352.field1943 == arg6 && arg1 == 0) {
            var16 = this.field6360[arg5 + 1][arg4];
            var15 = this.field6354[arg5 + 1][arg4];
            var17 = this.field6361[arg5 + 1][arg4];
        } else if (this.field6352.field1943 == arg6 && this.field6352.field1943 == arg1) {
            var16 = this.field6360[arg5 + 1][arg4 + 1];
            var17 = this.field6361[arg5 + 1][arg4 + 1];
            var15 = this.field6354[arg5 + 1][arg4 + 1];
        } else if (arg6 == 0 && this.field6352.field1943 == arg1) {
            var15 = this.field6354[arg5][arg4 + 1];
            var17 = this.field6361[arg5][arg4 + 1];
            var16 = this.field6360[arg5][arg4 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field6352.field1943;
            float var19 = (float) arg1 / (float) this.field6352.field1943;
            float var20 = this.field6354[arg5][arg4];
            float var21 = this.field6360[arg5][arg4];
            float var22 = this.field6361[arg5][arg4];
            float var23 = this.field6354[arg5 + 1][arg4];
            float var24 = this.field6360[arg5 + 1][arg4];
            float var25 = (this.field6354[arg5 + 1][arg4 + 1] - var23) * var18 + var23;
            float var26 = (this.field6360[arg5 + 1][arg4 + 1] - var24) * var18 + var24;
            float var27 = (this.field6361[arg5][arg4 + 1] - var22) * var18 + var22;
            float var28 = (this.field6360[arg5][arg4 + 1] - var21) * var18 + var21;
            float var29 = this.field6361[arg5 + 1][arg4];
            float var30 = (this.field6354[arg5][arg4 + 1] - var20) * var18 + var20;
            var15 = (var25 - var30) * var19 + var30;
            var16 = (var26 - var28) * var19 + var28;
            float var31 = (this.field6361[arg5 + 1][arg4 + 1] - var29) * var18 + var29;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field6350.field1466 - var10);
        float var33 = (float) (this.field6350.field1465 - var12);
        float var34 = (float) (this.field6350.field1461 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field6350.field1467;
        if (arg3 != 115) {
            return;
        }
        float var41 = 1.0F - (var40 * var40);
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
        int var44 = this.field6350.field1464;
        int var45 = (int) ((float) ((var44 & 0xFFFDEE) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF5E) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field6356.field622) {
            this.field6359.method1131((float) var10, -122);
            this.field6359.method1131((float) var12, -111);
            this.field6359.method1131((float) var11, -119);
        } else {
            this.field6359.method1132((byte) 87, (float) var10);
            this.field6359.method1132((byte) 87, (float) var12);
            this.field6359.method1132((byte) 87, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field6359.method1180((byte) -110, var45);
        this.field6359.method1180((byte) -110, var46);
        this.field6359.method1180((byte) -110, var47);
        this.field6359.method1180((byte) -110, 255);
        this.method2704(58, var14);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lfu;Lka;Lnq;[I)V", line = 259)
    public class446(class42 arg0, class140 arg1, class104 arg2, int[] arg3) {
        this.field6352 = arg1;
        this.field6356 = arg0;
        this.field6350 = arg2;
        int var5 = this.field6350.field1467 - (arg1.field1943 >> 1);
        this.field6362 = this.field6350.field1466 - var5 >> arg1.field1952;
        this.field6368 = this.field6350.field1466 + var5 >> arg1.field1952;
        this.field6358 = this.field6350.field1461 - var5 >> arg1.field1952;
        this.field6351 = this.field6350.field1461 + var5 >> arg1.field1952;
        int var6 = this.field6368 + 1 - this.field6362;
        int var7 = this.field6351 + 1 - this.field6358;
        this.field6354 = new float[var6 + 1][var7 + 1];
        this.field6360 = new float[var6 + 1][var7 + 1];
        this.field6361 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field6358 + var8;
            if (var9 > 0 && (this.field6352.field3517 - 1) > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field6362 + var10;
                    if (var11 > 0 && this.field6352.field3518 - 1 > var11) {
                        int var12 = arg1.method591(var11 + 1, var9) - arg1.method591(var11 - 1, var9);
                        int var13 = arg1.method591(var11, var9 + 1) - arg1.method591(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                        this.field6354[var10][var8] = (float) var12 * var14;
                        this.field6360[var10][var8] = var14 * -256.0F;
                        this.field6361[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field6358; var17 <= this.field6351; var17++) {
            if (var17 >= 0 && arg1.field3517 > var17) {
                for (int var18 = this.field6362; var18 <= this.field6368; var18++) {
                    if (var18 >= 0 && var18 < arg1.field3518) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field1941[var18][var17];
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
                var16 += this.field6368 - this.field6362;
            }
        }
        if (var15 <= 0) {
            this.field6355 = null;
            this.field6363 = null;
            this.field6357 = null;
            this.field6366 = null;
        } else {
            this.field6367 = new class161(var15 * 2);
            this.field6359 = new class160(var15 * 16);
            this.field6364 = new class155(class169.method1230(0, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field6358; var23 <= this.field6351; var23++) {
                if (var23 >= 0 && var23 < arg1.field3517) {
                    int var24 = 0;
                    for (int var25 = this.field6362; var25 <= this.field6368; var25++) {
                        if (var25 >= 0 && var25 < arg1.field3518) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field1941[var25][var23];
                            int[] var28 = arg1.field1946[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method2706(var23, var28[var29], var25, (byte) 115, var21, var24, var27[var29]);
                                    }
                                } else if (var26 == 3) {
                                    this.method2706(var23, 0, var25, (byte) 115, var21, var24, 0);
                                    this.method2706(var23, 0, var25, (byte) 115, var21, var24, arg1.field1943);
                                    this.method2706(var23, arg1.field1943, var25, (byte) 115, var21, var24, 0);
                                } else if (var26 == 2) {
                                    this.method2706(var23, 0, var25, (byte) 115, var21, var24, arg1.field1943);
                                    this.method2706(var23, arg1.field1943, var25, (byte) 115, var21, var24, arg1.field1943);
                                    this.method2706(var23, 0, var25, (byte) 115, var21, var24, 0);
                                } else if (var26 == 5) {
                                    this.method2706(var23, arg1.field1943, var25, (byte) 115, var21, var24, arg1.field1943);
                                    this.method2706(var23, arg1.field1943, var25, (byte) 115, var21, var24, 0);
                                    this.method2706(var23, 0, var25, (byte) 115, var21, var24, arg1.field1943);
                                } else if (var26 == 4) {
                                    this.method2706(var23, arg1.field1943, var25, (byte) 115, var21, var24, 0);
                                    this.method2706(var23, 0, var25, (byte) 115, var21, var24, 0);
                                    this.method2706(var23, arg1.field1943, var25, (byte) 115, var21, var24, arg1.field1943);
                                }
                            }
                        }
                        var24++;
                        var22++;
                    }
                } else {
                    var22 += this.field6368 - this.field6362;
                }
                var21++;
            }
            this.field6366 = this.field6356.method380(5123, this.field6367.field2262, this.field6367.field2298, false);
            this.field6363 = this.field6356.method401(16, this.field6359.field2262, this.field6359.field2298, false);
            this.field6357 = new class170(this.field6356, this.field6363, 5126, 3, 0);
            this.field6355 = new class170(this.field6356, this.field6363, 5121, 4, 12);
        }
        this.field6367 = null;
        this.field6364 = null;
        this.field6354 = this.field6360 = this.field6361 = (float[][]) null;
        this.field6359 = null;
    }
}
