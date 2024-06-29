import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class203 extends class97 {

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "Lpj;")
    private class156 field3046;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Lcg;")
    private class393 field3054;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "Ldt;")
    private class147 field3051;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    private int field3058;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    private int field3045;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    private int field3049;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    private int field3055;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "[[F")
    private float[][] field3059;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[[F")
    private float[][] field3041;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "[[F")
    private float[][] field3057;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "Ltf;")
    private class464 field3053;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Ltf;")
    private class464 field3047;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Lna;")
    private class226 field3042;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "Lio;")
    private class104 field3056;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "Lef;")
    private class385 field3044;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Ljj;")
    private class41 field3048;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Lcm;")
    private class382 field3050;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    private int field3052;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1204(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (arg4 || this.field3056 == null || (arg1 + arg2) < this.field3058 || arg1 - arg2 > this.field3045 || arg0 + arg2 < this.field3049 || arg0 - arg2 > this.field3055) {
            return;
        }
        for (int var6 = this.field3049; var6 <= this.field3055; var6++) {
            for (int var7 = this.field3058; var7 <= this.field3045; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if ((-arg2) < var8 && arg2 > var8 && var9 > (-arg2) && arg2 > var9 && arg3[arg2 + var8][var9 + arg2]) {
                    this.field3054.method2431((int) (this.field3051.field2036 * 255.0F) << 24);
                    this.field3054.method2430(this.field3053, (class464) null, this.field3047, (class464) null);
                    this.field3054.method2458(this.field3056, 4, 0, this.field3043);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)V")
    private final void method1205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = arg5 + (arg1 << this.field3046.field2173);
        int var11 = (arg2 << this.field3046.field2173) + arg6;
        int var12 = this.field3046.method100(var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 & 0xFFFFL << 16;
            class97 var13 = this.field3050.method2302(var8, 23576);
            if (var13 != null) {
                this.method1206(((class114) var13).field1507, 1);
                return;
            }
        }
        short var14 = (short) (this.field3052++);
        if (var8 != -1L) {
            this.field3050.method2301(80, new class114(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg6 == 0) {
            var15 = this.field3059[arg0][arg3];
            var16 = this.field3057[arg0][arg3];
            var17 = this.field3041[arg0][arg3];
        } else if (this.field3046.field2168 == arg5 && arg6 == 0) {
            var17 = this.field3041[arg0 + 1][arg3];
            var16 = this.field3057[arg0 + 1][arg3];
            var15 = this.field3059[arg0 + 1][arg3];
        } else if (this.field3046.field2168 == arg5 && this.field3046.field2168 == arg6) {
            var16 = this.field3057[arg0 + 1][arg3 + 1];
            var15 = this.field3059[arg0 + 1][arg3 + 1];
            var17 = this.field3041[arg0 + 1][arg3 + 1];
        } else if (arg5 == 0 && this.field3046.field2168 == arg6) {
            var17 = this.field3041[arg0][arg3 + 1];
            var16 = this.field3057[arg0][arg3 + 1];
            var15 = this.field3059[arg0][arg3 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field3046.field2168;
            float var19 = (float) arg6 / (float) this.field3046.field2168;
            float var20 = this.field3041[arg0][arg3];
            float var21 = this.field3057[arg0][arg3];
            float var22 = this.field3059[arg0][arg3];
            float var23 = this.field3041[arg0 + 1][arg3];
            float var24 = this.field3057[arg0 + 1][arg3];
            float var25 = (this.field3041[arg0][arg3 + 1] - var20) * var18 + var20;
            float var26 = (this.field3057[arg0 + 1][arg3 + 1] - var24) * var18 + var24;
            float var27 = this.field3059[arg0 + 1][arg3];
            float var28 = (this.field3059[arg0][arg3 + 1] - var22) * var18 + var22;
            float var29 = (this.field3057[arg0][arg3 + 1] - var21) * var18 + var21;
            float var30 = (this.field3041[arg0 + 1][arg3 + 1] - var23) * var18 + var23;
            var17 = (var30 - var25) * var19 + var25;
            float var31 = (this.field3059[arg0 + 1][arg3 + 1] - var27) * var18 + var27;
            var16 = (var26 - var29) * var19 + var29;
            var15 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field3051.field2033 - var10);
        float var33 = (float) (this.field3051.field2040 - var12);
        float var34 = (float) (this.field3051.field2038 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = (float) arg4 / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field3051.field2037;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var39 + var16 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3051.field2035;
        int var45 = (int) ((float) ((var44 & 0xFF7211) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF71) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field3054.field5879) {
            this.field3048.method229((float) var10, -120);
            this.field3048.method229((float) var12, -117);
            this.field3048.method229((float) var11, -128);
        } else {
            this.field3048.method228(-1839018424, (float) var10);
            this.field3048.method228(arg4 ^ 0x9262CE49, (float) var12);
            this.field3048.method228(-1839018424, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field3048.method2366(var45, true);
        this.field3048.method2366(var46, true);
        this.field3048.method2366(var47, true);
        this.field3048.method2366(255, true);
        this.method1206(var14, arg4);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(SI)V")
    private final void method1206(short arg0, int arg1) {
        if (this.field3054.field5879) {
            this.field3044.method2377(arg0, -116);
        } else {
            this.field3044.method2329(arg0, -59);
        }
        if (arg1 != 1) {
            this.method1205(-11, 49, -116, -117, -40, 108, 111);
        }
        this.field3043++;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lcg;Lpj;Ldt;[I)V")
    public class203(class393 arg0, class156 arg1, class147 arg2, int[] arg3) {
        this.field3046 = arg1;
        this.field3054 = arg0;
        this.field3051 = arg2;
        int var5 = this.field3051.field2037 - (arg1.field2168 >> 1);
        this.field3058 = this.field3051.field2033 - var5 >> arg1.field2173;
        this.field3045 = this.field3051.field2033 + var5 >> arg1.field2173;
        this.field3049 = this.field3051.field2038 - var5 >> arg1.field2173;
        this.field3055 = this.field3051.field2038 + var5 >> arg1.field2173;
        int var6 = this.field3045 + 1 - this.field3058;
        int var7 = this.field3055 + 1 - this.field3049;
        this.field3059 = new float[var6 + 1][var7 + 1];
        this.field3041 = new float[var6 + 1][var7 + 1];
        this.field3057 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field3049 + var8;
            if (var9 > 0 && var9 < (this.field3046.field1908 - 1)) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field3058 + var10;
                    if (var11 > 0 && var11 < this.field3046.field1906 - 1) {
                        int var12 = arg1.method92(var11 + 1, var9) - arg1.method92(var11 - 1, var9);
                        int var13 = arg1.method92(var11, var9 + 1) - arg1.method92(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field3041[var10][var8] = (float) var12 * var14;
                        this.field3057[var10][var8] = var14 * -256.0F;
                        this.field3059[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field3049; var17 <= this.field3055; var17++) {
            if (var17 >= 0 && var17 < arg1.field1908) {
                for (int var18 = this.field3058; var18 <= this.field3045; var18++) {
                    if (var18 >= 0 && arg1.field1906 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field2177[var18][var17];
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
                var16 += this.field3045 - this.field3058;
            }
        }
        if (var15 <= 0) {
            this.field3053 = null;
            this.field3047 = null;
            this.field3042 = null;
            this.field3056 = null;
        } else {
            this.field3044 = new class385(var15 * 2);
            this.field3048 = new class41(var15 * 16);
            this.field3050 = new class382(class196.method1174(20, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field3049; var23 <= this.field3055; var23++) {
                if (var23 >= 0 && var23 < arg1.field1908) {
                    int var24 = 0;
                    for (int var25 = this.field3058; var25 <= this.field3045; var25++) {
                        if (var25 >= 0 && arg1.field1906 > var25) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field2177[var25][var23];
                            int[] var28 = arg1.field2170[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method1205(var24, var25, var23, var21, 1, var27[var29], var28[var29]);
                                    }
                                } else if (var26 == 3) {
                                    this.method1205(var24, var25, var23, var21, 1, 0, 0);
                                    this.method1205(var24, var25, var23, var21, 1, arg1.field2168, 0);
                                    this.method1205(var24, var25, var23, var21, 1, 0, arg1.field2168);
                                } else if (var26 == 2) {
                                    this.method1205(var24, var25, var23, var21, 1, arg1.field2168, 0);
                                    this.method1205(var24, var25, var23, var21, 1, arg1.field2168, arg1.field2168);
                                    this.method1205(var24, var25, var23, var21, 1, 0, 0);
                                } else if (var26 == 5) {
                                    this.method1205(var24, var25, var23, var21, 1, arg1.field2168, arg1.field2168);
                                    this.method1205(var24, var25, var23, var21, 1, 0, arg1.field2168);
                                    this.method1205(var24, var25, var23, var21, 1, arg1.field2168, 0);
                                } else if (var26 == 4) {
                                    this.method1205(var24, var25, var23, var21, 1, 0, arg1.field2168);
                                    this.method1205(var24, var25, var23, var21, 1, 0, 0);
                                    this.method1205(var24, var25, var23, var21, 1, arg1.field2168, arg1.field2168);
                                }
                            }
                        }
                        var24++;
                        var22++;
                    }
                } else {
                    var22 += this.field3045 - this.field3058;
                }
                var21++;
            }
            this.field3056 = this.field3054.method2470(5123, this.field3044.field5685, this.field3044.field5666, false);
            this.field3042 = this.field3054.method2439(16, this.field3048.field5685, this.field3048.field5666, false);
            this.field3053 = new class464(this.field3054, this.field3042, 5126, 3, 0);
            this.field3047 = new class464(this.field3054, this.field3042, 5121, 4, 12);
        }
        this.field3048 = null;
        this.field3044 = null;
        this.field3050 = null;
        this.field3041 = this.field3057 = this.field3059 = (float[][]) null;
    }
}
