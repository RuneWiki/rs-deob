import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class269 extends class96 {

    @OriginalMember(owner = "client!ew", name = "U", descriptor = "I")
    private int field3409 = 0;

    @OriginalMember(owner = "client!ew", name = "N", descriptor = "I")
    private int field3402 = 0;

    @OriginalMember(owner = "client!ew", name = "bb", descriptor = "I")
    private int field3416 = 0;

    @OriginalMember(owner = "client!ew", name = "P", descriptor = "[[I")
    public static int[][] field3404 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ew", name = "K", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ew", name = "L", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ew", name = "M", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ew", name = "O", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ew", name = "Q", descriptor = "I")
    private int field3405;

    @OriginalMember(owner = "client!ew", name = "T", descriptor = "I")
    private int field3408;

    @OriginalMember(owner = "client!ew", name = "V", descriptor = "I")
    private int field3410;

    @OriginalMember(owner = "client!ew", name = "W", descriptor = "I")
    private int field3411;

    @OriginalMember(owner = "client!ew", name = "X", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ew", name = "Y", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ew", name = "Z", descriptor = "I")
    private int field3414;

    @OriginalMember(owner = "client!ew", name = "ab", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!ew", name = "db", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ew", name = "cb", descriptor = "Lf;")
    public static class404 field3417;

    @OriginalMember(owner = "client!ew", name = "R", descriptor = "[I")
    public static int[] field3406;

    @OriginalMember(owner = "client!ew", name = "S", descriptor = "[Lf;")
    public static class404[] field3407;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILbt;)V", line = 7)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3402 = (arg2.method575(-56) << 12) / 100;
                }
            } else {
                this.field3409 = (arg2.method575(-20) << 12) / 100;
            }
        } else {
            this.field3416 = arg2.method603((byte) -48);
        }
        if (arg1 != -1) {
            field3417 = null;
        }
        ++field3401;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V", line = 55)
    public class269() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "(I)V", line = 60)
    public static void method1658(int arg0) {
        if (arg0 != 128) {
            field3407 = null;
        }
        field3417 = null;
        field3407 = null;
        field3404 = null;
        field3406 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILgf;)V", line = 77)
    public static final void method1659(int arg0, class395 arg1) {
        ++field3400;
        boolean var2 = false;
        if (class264.field3353 != arg1.field5208 && ~arg1.field5191 != 0 && arg1.field5177 == 0) {
            class44 var3 = class403.field5429.method1962(arg1.field5191, false);
            if (var3.field660 || ~var3.field647[arg1.field5176] > ~(arg1.field5180 - -1)) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg1.field5228 + arg1.field5208;
            int var5 = -arg1.field5228 + class264.field3353;
            int var6 = arg1.field5158 * 128 + 64 * arg1.method2342(arg0 ^ 10807);
            int var7 = arg1.field5154 * 128 + 64 * arg1.method2342(10804);
            int var8 = arg1.field5164 * 128 - -(64 * arg1.method2342(10804));
            int var9 = arg1.field5179 * 128 + 64 * arg1.method2342(10804);
            arg1.field6241 = ((-var5 + var4) * var7 + var5 * var9) / var4;
            arg1.field6239 = ((-var5 + var4) * var6 + var5 * var8) / var4;
        }
        arg1.field5245 = 0;
        if (arg1.field5187 == 0) {
            arg1.method2344(8192, -18840);
        }
        if (arg1.field5187 == 1) {
            arg1.method2344(12288, arg0 ^ -18837);
        }
        if (arg1.field5187 == 2) {
            arg1.method2344(0, -18840);
        }
        if (arg1.field5187 == arg0) {
            arg1.method2344(4096, -18840);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIFIIIFIFI[FII)V", line = 136)
    public static final void method1660(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6, int arg7, float arg8, int arg9, float[] arg10, int arg11, int arg12) {
        int var13 = arg1 - arg7;
        if (arg0 != 18822) {
            field3403 = 25;
        }
        int var14 = arg9 - arg5;
        int var15 = arg4 - arg3;
        ++field3399;
        float var16 = arg10[2] * (float) var15 + arg10[0] * (float) var14 + arg10[1] * (float) var13;
        float var17 = arg10[5] * (float) var15 + arg10[4] * (float) var13 + arg10[3] * (float) var14;
        float var18 = arg10[8] * (float) var15 + arg10[7] * (float) var13 + arg10[6] * (float) var14;
        float var19;
        float var20;
        if (~arg12 == -1) {
            var19 = arg6 + var16 + 0.5F;
            var20 = -var18 + arg8 + 0.5F;
        } else if (arg12 != 1) {
            if (~arg12 != -3) {
                if (arg12 == 3) {
                    var19 = arg6 + var16 + 0.5F;
                    var20 = -var17 + arg2 + 0.5F;
                } else if (~arg12 == -5) {
                    var19 = arg8 + var18 + 0.5F;
                    var20 = -var17 + arg2 + 0.5F;
                } else {
                    var19 = -var18 + arg8 + 0.5F;
                    var20 = -var17 + arg2 + 0.5F;
                }
            } else {
                var19 = -var16 + arg6 + 0.5F;
                var20 = -var17 + arg2 + 0.5F;
            }
        } else {
            var20 = arg8 + var18 + 0.5F;
            var19 = arg6 + var16 + 0.5F;
        }
        if (arg11 != 1) {
            if (~arg11 == -3) {
                var19 = -var19;
                var20 = -var20;
            } else if (arg11 == 3) {
                float var21 = var19;
                var19 = var20;
                var20 = -var21;
            }
        } else {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        }
        class308.field3965 = var19;
        class221.field2852 = var20;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BIII)V", line = 223)
    private final void method1661(byte arg0, int arg1, int arg2, int arg3) {
        ++field3412;
        if (arg0 > 24) {
            int var5 = ~arg3 <= ~arg1 ? arg3 : arg1;
            int var6 = ~arg3 < ~arg1 ? arg1 : arg3;
            int var7 = arg2 <= var5 ? var5 : arg2;
            int var8 = var6 > arg2 ? arg2 : var6;
            int var9 = -var8 + var7;
            this.field3410 = (var7 + var8) / 2;
            if (~var9 < -1) {
                int var10 = (-arg1 + var7 << 12) / var9;
                int var11 = (-arg3 + var7 << 12) / var9;
                int var12 = (-arg2 + var7 << 12) / var9;
                if (~arg1 != ~var7) {
                    if (~arg3 != ~var7) {
                        this.field3405 = arg1 != var8 ? 20480 - var10 : var11 + 12288;
                    } else {
                        this.field3405 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
                    }
                } else {
                    this.field3405 = arg3 == var8 ? 20480 - -var12 : -var11 + 4096;
                }
                this.field3405 /= 6;
            } else {
                this.field3405 = 0;
            }
            if (this.field3410 > 0 && ~this.field3410 > -4097) {
                this.field3408 = (var9 << 12) / (~this.field3410 < -2049 ? -(this.field3410 * 2) + 8192 : this.field3410 * 2);
            } else {
                this.field3408 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(BIII)V", line = 283)
    private final void method1662(byte arg0, int arg1, int arg2, int arg3) {
        ++field3413;
        int var5 = -93 % ((arg0 - -77) / 44);
        int var6 = ~arg1 < -2049 ? arg1 - -arg3 + -(arg1 * arg3 >> 12) : (arg3 + 4096) * arg1 >> 12;
        if (~var6 >= -1) {
            this.field3411 = this.field3415 = this.field3414 = arg1;
        } else {
            int var7 = arg2 * 6;
            int var8 = arg1 - var6 + arg1;
            int var9 = (-var8 + var6 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = var6 - var14;
            if (var10 != 0) {
                if (var10 != 1) {
                    if (var10 != 2) {
                        if (var10 != 3) {
                            if (var10 != 4) {
                                if (var10 == 5) {
                                    this.field3411 = var6;
                                    this.field3415 = var8;
                                    this.field3414 = var16;
                                }
                            } else {
                                this.field3415 = var8;
                                this.field3414 = var6;
                                this.field3411 = var15;
                            }
                        } else {
                            this.field3414 = var6;
                            this.field3415 = var16;
                            this.field3411 = var8;
                        }
                    } else {
                        this.field3411 = var8;
                        this.field3414 = var15;
                        this.field3415 = var6;
                    }
                } else {
                    this.field3414 = var8;
                    this.field3415 = var6;
                    this.field3411 = var16;
                }
            } else {
                this.field3414 = var8;
                this.field3415 = var15;
                this.field3411 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)[[I", line = 399)
    public final int[][] method36(int arg0, int arg1) {
        ++field3418;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (arg0 != 3) {
            this.field3405 = 87;
        }
        if (super.field1333.field1423) {
            int[][] var4 = this.method659(0, -119, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; field3403 > var11; ++var11) {
                this.method1661((byte) 64, var5[var11], var7[var11], var6[var11]);
                this.field3410 += this.field3402;
                this.field3405 += this.field3416;
                this.field3408 += this.field3409;
                while (~this.field3405 > -1) {
                    this.field3405 += 4096;
                }
                while (~this.field3405 < -4097) {
                    this.field3405 -= 4096;
                }
                if (this.field3408 < 0) {
                    this.field3408 = 0;
                }
                if (~this.field3408 < -4097) {
                    this.field3408 = 4096;
                }
                if (~this.field3410 > -1) {
                    this.field3410 = 0;
                }
                if (this.field3410 > 4096) {
                    this.field3410 = 4096;
                }
                this.method1662((byte) -126, this.field3410, this.field3405, this.field3408);
                var8[var11] = this.field3411;
                var9[var11] = this.field3415;
                var10[var11] = this.field3414;
            }
        }
        return var3;
    }
}
