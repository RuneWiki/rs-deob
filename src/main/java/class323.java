import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class323 extends class43 {

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lsi;")
    private class92 field4325;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lh;")
    private class327 field4317;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "Lef;")
    private class377 field4328;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    private int field4318;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    private int field4314;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "[[F")
    private float[][] field4320;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "[[F")
    private float[][] field4324;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[[F")
    private float[][] field4316;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lks;")
    private class19 field4311;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Lva;")
    private class415 field4322;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Lig;")
    private class205 field4321;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Lig;")
    private class205 field4319;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lbg;")
    private class242 field4312;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Lqd;")
    private class245 field4326;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Ltm;")
    private class349 field4315;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    private int field4313;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIBII)V")
    private final void method2035(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg2 << this.field4328.field5095) + arg0;
        int var11 = arg6 + (arg1 << this.field4328.field5095);
        int var12 = this.field4328.method1054(var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class43 var13 = this.field4315.method2218(1, var8);
            if (var13 != null) {
                this.method2037(-104, ((class32) var13).field363);
                return;
            }
        }
        short var14 = (short) (this.field4323++);
        if (var8 != -1L) {
            this.field4315.method2227(new class32(var14), arg4 ^ 0xFFFFDFC8, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg6 == 0) {
            var15 = this.field4324[arg5][arg3];
            var16 = this.field4316[arg5][arg3];
            var17 = this.field4320[arg5][arg3];
        } else if (this.field4328.field5111 == arg0 && arg6 == 0) {
            var15 = this.field4324[arg5 + 1][arg3];
            var17 = this.field4320[arg5 + 1][arg3];
            var16 = this.field4316[arg5 + 1][arg3];
        } else if (this.field4328.field5111 == arg0 && this.field4328.field5111 == arg6) {
            var15 = this.field4324[arg5 + 1][arg3 + 1];
            var16 = this.field4316[arg5 + 1][arg3 + 1];
            var17 = this.field4320[arg5 + 1][arg3 + 1];
        } else if (arg0 == 0 && this.field4328.field5111 == arg6) {
            var17 = this.field4320[arg5][arg3 + 1];
            var15 = this.field4324[arg5][arg3 + 1];
            var16 = this.field4316[arg5][arg3 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field4328.field5111;
            float var19 = (float) arg6 / (float) this.field4328.field5111;
            float var20 = this.field4324[arg5][arg3];
            float var21 = this.field4316[arg5][arg3];
            float var22 = this.field4320[arg5][arg3];
            float var23 = this.field4324[arg5 + 1][arg3];
            float var24 = this.field4316[arg5 + 1][arg3];
            float var25 = (this.field4324[arg5 + 1][arg3 + 1] - var23) * var18 + var23;
            float var26 = (this.field4320[arg5][arg3 + 1] - var22) * var18 + var22;
            float var27 = (this.field4316[arg5][arg3 + 1] - var21) * var18 + var21;
            float var28 = (this.field4316[arg5 + 1][arg3 + 1] - var24) * var18 + var24;
            float var29 = (this.field4324[arg5][arg3 + 1] - var20) * var18 + var20;
            float var30 = this.field4320[arg5 + 1][arg3];
            var16 = (var28 - var27) * var19 + var27;
            var15 = (var25 - var29) * var19 + var29;
            float var31 = (this.field4320[arg5 + 1][arg3 + 1] - var30) * var18 + var30;
            var17 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field4325.field1073 - var10);
        float var33 = (float) (this.field4325.field1072 - var12);
        float var34 = (float) (this.field4325.field1071 - var11);
        if (arg4 != 46) {
            this.field4328 = (class377) null;
        }
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field4325.field1076;
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4325.field1078;
        int var45 = (int) ((float) ((var44 & 0xFFE112) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field4317.field4448) {
            this.field4326.method1607((float) var10, -11107);
            this.field4326.method1607((float) var12, arg4 ^ 0xFFFFD4B3);
            this.field4326.method1607((float) var11, -11107);
        } else {
            this.field4326.method1608((float) var10, 922092592);
            this.field4326.method1608((float) var12, 922092592);
            this.field4326.method1608((float) var11, arg4 + 922092546);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field4326.method1593(var45, -119);
        this.field4326.method1593(var46, -124);
        this.field4326.method1593(var47, -100);
        this.field4326.method1593(255, -117);
        this.method2037(-124, var14);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([[ZZIII)V")
    public final void method2036(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (this.field4311 == null || this.field4327 > (arg2 + arg3) || (arg2 - arg3) > this.field4329 || arg3 + arg4 < this.field4318 || this.field4314 < (arg4 - arg3) || arg1) {
            return;
        }
        for (int var6 = this.field4318; var6 <= this.field4314; var6++) {
            for (int var7 = this.field4327; var7 <= this.field4329; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg4;
                if (-arg3 < var8 && arg3 > var8 && -arg3 < var9 && var9 < arg3 && arg0[arg3 + var8][arg3 + var9]) {
                    this.field4317.method2055((int) (this.field4325.field1075 * 255.0F) << 24);
                    this.field4317.method2070(this.field4321, (class205) null, this.field4319, (class205) null);
                    this.field4317.method2053(this.field4311, 4, 0, this.field4313);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IS)V")
    private final void method2037(int arg0, short arg1) {
        if (this.field4317.field4448) {
            this.field4312.method1573(-6266, arg1);
        } else {
            this.field4312.method1540(true, arg1);
        }
        if (arg0 >= -94) {
            this.field4317 = (class327) null;
        }
        this.field4313++;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lh;Lef;Lsi;[I)V")
    public class323(class327 arg0, class377 arg1, class92 arg2, int[] arg3) {
        this.field4325 = arg2;
        this.field4317 = arg0;
        this.field4328 = arg1;
        int var5 = this.field4325.field1076 - (arg1.field5111 >> 1);
        this.field4327 = this.field4325.field1073 - var5 >> arg1.field5095;
        this.field4329 = this.field4325.field1073 + var5 >> arg1.field5095;
        this.field4318 = this.field4325.field1071 - var5 >> arg1.field5095;
        this.field4314 = this.field4325.field1071 + var5 >> arg1.field5095;
        int var6 = this.field4329 + 1 - this.field4327;
        int var7 = this.field4314 + 1 - this.field4318;
        this.field4320 = new float[var6 + 1][var7 + 1];
        this.field4324 = new float[var6 + 1][var7 + 1];
        this.field4316 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = var8 + this.field4318;
            if (var9 > 0 && var9 < this.field4328.field3611 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field4327 + var10;
                    if (var11 > 0 && var11 < (this.field4328.field3612 - 1)) {
                        int var12 = arg1.method1050(var11 + 1, var9) - arg1.method1050(var11 - 1, var9);
                        int var13 = arg1.method1050(var11, var9 + 1) - arg1.method1050(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - (-(var13 * var13) - 65536))));
                        this.field4324[var10][var8] = (float) var12 * var14;
                        this.field4316[var10][var8] = var14 * -256.0F;
                        this.field4320[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field4318; var17 <= this.field4314; var17++) {
            if (var17 >= 0 && var17 < arg1.field3611) {
                for (int var18 = this.field4327; var18 <= this.field4329; var18++) {
                    if (var18 >= 0 && arg1.field3612 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field5100[var18][var17];
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
                var16 += this.field4329 - this.field4327;
            }
        }
        if (var15 <= 0) {
            this.field4311 = null;
            this.field4322 = null;
            this.field4321 = null;
            this.field4319 = null;
        } else {
            this.field4312 = new class242(var15 * 2);
            this.field4326 = new class245(var15 * 16);
            this.field4315 = new class349(class39.method249(var15, true));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field4318; var23 <= this.field4314; var23++) {
                if (var23 >= 0 && var23 < arg1.field3611) {
                    int var24 = 0;
                    for (int var25 = this.field4327; var25 <= this.field4329; var25++) {
                        if (var25 >= 0 && var25 < arg1.field3612) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field5100[var25][var23];
                            int[] var28 = arg1.field5114[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method2035(var27[var29], var23, var25, var21, (byte) 46, var24, var28[var29]);
                                    }
                                } else if (var26 == 3) {
                                    this.method2035(0, var23, var25, var21, (byte) 46, var24, 0);
                                    this.method2035(arg1.field5111, var23, var25, var21, (byte) 46, var24, 0);
                                    this.method2035(0, var23, var25, var21, (byte) 46, var24, arg1.field5111);
                                } else if (var26 == 2) {
                                    this.method2035(arg1.field5111, var23, var25, var21, (byte) 46, var24, 0);
                                    this.method2035(arg1.field5111, var23, var25, var21, (byte) 46, var24, arg1.field5111);
                                    this.method2035(0, var23, var25, var21, (byte) 46, var24, 0);
                                } else if (var26 == 5) {
                                    this.method2035(arg1.field5111, var23, var25, var21, (byte) 46, var24, arg1.field5111);
                                    this.method2035(0, var23, var25, var21, (byte) 46, var24, arg1.field5111);
                                    this.method2035(arg1.field5111, var23, var25, var21, (byte) 46, var24, 0);
                                } else if (var26 == 4) {
                                    this.method2035(0, var23, var25, var21, (byte) 46, var24, arg1.field5111);
                                    this.method2035(0, var23, var25, var21, (byte) 46, var24, 0);
                                    this.method2035(arg1.field5111, var23, var25, var21, (byte) 46, var24, arg1.field5111);
                                }
                            }
                        }
                        var22++;
                        var24++;
                    }
                } else {
                    var22 += this.field4329 - this.field4327;
                }
                var21++;
            }
            this.field4311 = this.field4317.method2102(5123, this.field4312.field3188, this.field4312.field3211, false);
            this.field4322 = this.field4317.method2106(16, this.field4326.field3188, this.field4326.field3211, false);
            this.field4321 = new class205(this.field4317, this.field4322, 5126, 3, 0);
            this.field4319 = new class205(this.field4317, this.field4322, 5121, 4, 12);
        }
        this.field4324 = this.field4316 = this.field4320 = (float[][]) null;
        this.field4326 = null;
        this.field4312 = null;
        this.field4315 = null;
    }
}
