import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class249 extends class45 {

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "Lqea;")
    private class392 field3232;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "Lal;")
    private class303 field3226;

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "Lag;")
    private class469 field3235;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
    private int field3229;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    private int field3223;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "[[F")
    private float[][] field3224;

    @OriginalMember(owner = "client!wda", name = "B", descriptor = "[[F")
    private float[][] field3238;

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "[[F")
    private float[][] field3239;

    @OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "Lcw;")
    private class511 field3237;

    @OriginalMember(owner = "client!wda", name = "F", descriptor = "Lfe;")
    private class199 field3242;

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "Lfe;")
    private class199 field3234;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Lvh;")
    private class265 field3219;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "Lio;")
    private class157 field3227;

    @OriginalMember(owner = "client!wda", name = "D", descriptor = "Lkv;")
    private class210 field3240;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Lwh;")
    private class546 field3220;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "Luf;")
    public static class380 field3225 = new class380(64);

    @OriginalMember(owner = "client!wda", name = "E", descriptor = "Leba;")
    public static class550 field3241 = new class550(7, 7);

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
    private int field3228;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 16)
    public static void method1505(int arg0) {
        field3225 = null;
        if (arg0 == -16103) {
            field3241 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(SI)V", line = 27)
    private final void method1506(short arg0, int arg1) {
        if (arg1 > -115) {
            return;
        }
        field3233++;
        if (this.field3235.field6466) {
            this.field3227.method918(24551, arg0);
        } else {
            this.field3227.method913(arg0, true);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lr;BLwv;)V", line = 44)
    public static final void method1507(class562 arg0, byte arg1, class423 arg2) {
        field3244++;
        if (arg1 != 20) {
            return;
        }
        boolean var3 = class87.field1058.method1402(arg2.field5552, arg2.field5642, arg2.field5557, arg0, arg2.field5663, (byte) -3, arg2.field5671 | 0xFF000000, arg2.field5651 ? class408.field5369.field7810 : null) == null;
        if (var3) {
            class169.field2419.method2507(new class227(arg2.field5552, arg2.field5557, arg2.field5642, arg2.field5671 | 0xFF000000, arg2.field5663, arg2.field5651), (byte) -120);
            class552.method3091(arg2, 12618);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BII[[ZI)V", line = 67)
    public final void method1508(byte arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field3222++;
        if (this.field3219 == null || this.field3229 > (arg1 + arg2) || arg1 - arg2 > this.field3236 || this.field3223 > (arg4 + arg2)) {
            return;
        }
        int var6 = 124 / ((arg0 + 76) / 47);
        if (this.field3231 < arg4 - arg2) {
            return;
        }
        for (int var7 = this.field3223; var7 <= this.field3231; var7++) {
            for (int var8 = this.field3229; var8 <= this.field3236; var8++) {
                int var9 = var8 - arg1;
                int var10 = var7 - arg4;
                if ((-arg2) < var9 && var9 < arg2 && var10 > (-arg2) && var10 < arg2 && arg3[arg2 + var9][arg2 + var10]) {
                    this.field3235.method2624((byte) 26, (int) (this.field3232.method2259(false) * 255.0F) << 24);
                    this.field3235.method2677(this.field3234, null, 17560, this.field3242, null);
                    this.field3235.method2674(0, 4, this.field3219, 8704, this.field3243);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/lang/String;II)Lew;", line = 126)
    public static final class364 method1509(String arg0, int arg1, int arg2) {
        field3230++;
        class364 var3;
        try {
            var3 = (class364) Class.forName("bea").getDeclaredConstructor().newInstance();
            int var4 = 50 % ((85 - arg1) / 37);
        } catch (Throwable var5) {
            var3 = new class278();
        }
        var3.field4814 = arg2;
        var3.field4806 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIII)V", line = 146)
    private final void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3221++;
        long var8 = -1L;
        int var10 = (arg6 << this.field3226.field3530) + arg0;
        int var11 = arg4 + (arg5 << this.field3226.field3530);
        int var12 = this.field3226.method1609(var10, var11, -124);
        if ((arg0 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class45 var13 = this.field3220.method3057(1, var8);
            if (var13 != null) {
                this.method1506(((class401) var13).field5317, -116);
                return;
            }
        }
        short var14 = (short) (this.field3228++);
        if (var8 != -1L) {
            this.field3220.method3061(123, var8, new class401(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg4 == 0) {
            var15 = this.field3238[arg1][arg2];
            var16 = this.field3224[arg1][arg2];
            var17 = this.field3239[arg1][arg2];
        } else if (this.field3226.field3527 == arg0 && arg4 == 0) {
            var17 = this.field3239[arg1 + 1][arg2];
            var15 = this.field3238[arg1 + 1][arg2];
            var16 = this.field3224[arg1 + 1][arg2];
        } else if (this.field3226.field3527 == arg0 && this.field3226.field3527 == arg4) {
            var15 = this.field3238[arg1 + 1][arg2 + 1];
            var16 = this.field3224[arg1 + 1][arg2 + 1];
            var17 = this.field3239[arg1 + 1][arg2 + 1];
        } else if (arg0 == 0 && this.field3226.field3527 == arg4) {
            var17 = this.field3239[arg1][arg2 + 1];
            var15 = this.field3238[arg1][arg2 + 1];
            var16 = this.field3224[arg1][arg2 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field3226.field3527;
            float var19 = (float) arg4 / (float) this.field3226.field3527;
            float var20 = this.field3224[arg1][arg2];
            float var21 = this.field3239[arg1][arg2];
            float var22 = this.field3238[arg1][arg2];
            float var23 = this.field3224[arg1 + 1][arg2];
            float var24 = this.field3239[arg1 + 1][arg2];
            float var25 = this.field3238[arg1 + 1][arg2];
            float var26 = (this.field3224[arg1][arg2 + 1] - var20) * var18 + var20;
            float var27 = (this.field3238[arg1][arg2 + 1] - var22) * var18 + var22;
            float var28 = (this.field3224[arg1 + 1][arg2 + 1] - var23) * var18 + var23;
            float var29 = (this.field3239[arg1 + 1][arg2 + 1] - var24) * var18 + var24;
            float var30 = (this.field3239[arg1][arg2 + 1] - var21) * var18 + var21;
            float var31 = (this.field3238[arg1 + 1][arg2 + 1] - var25) * var18 + var25;
            var16 = (var28 - var26) * var19 + var26;
            var17 = (var29 - var30) * var19 + var30;
            var15 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field3232.method2258((byte) -30) - var10);
        float var33 = (float) (this.field3232.method2261((byte) 37) - var12);
        float var34 = (float) (this.field3232.method2257(-17895) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        if (arg3 > -67) {
            method1505(86);
        }
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field3232.method2260(2);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var39 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3232.method2263(0);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFF2) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field3235.field6466) {
            this.field3240.method1334(917876560, (float) var10);
            this.field3240.method1334(917876560, (float) var12);
            this.field3240.method1334(917876560, (float) var11);
        } else {
            this.field3240.method1332((byte) -13, (float) var10);
            this.field3240.method1332((byte) -13, (float) var12);
            this.field3240.method1332((byte) -13, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field3240.method915(-31914, var45);
        this.field3240.method915(-31914, var46);
        this.field3240.method915(-31914, var47);
        this.field3240.method915(-31914, 255);
        this.method1506(var14, -128);
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lag;Lal;Lqea;[I)V", line = 325)
    public class249(class469 arg0, class303 arg1, class392 arg2, int[] arg3) {
        this.field3232 = arg2;
        this.field3226 = arg1;
        this.field3235 = arg0;
        int var5 = this.field3232.method2260(2) - (arg1.field3527 >> 1);
        this.field3229 = this.field3232.method2258((byte) -33) - var5 >> arg1.field3530;
        this.field3236 = this.field3232.method2258((byte) -31) + var5 >> arg1.field3530;
        this.field3223 = this.field3232.method2257(-17895) - var5 >> arg1.field3530;
        this.field3231 = this.field3232.method2257(-17895) + var5 >> arg1.field3530;
        int var6 = this.field3236 + 1 - this.field3229;
        int var7 = this.field3231 + 1 - this.field3223;
        this.field3224 = new float[var6 + 1][var7 + 1];
        this.field3238 = new float[var6 + 1][var7 + 1];
        this.field3239 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field3223 + var8;
            if (var25 > 0 && var25 < (this.field3226.field3525 - 1)) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field3229;
                    if (var27 > 0 && var27 < this.field3226.field3524 - 1) {
                        int var28 = arg1.method1611(var27 + 1, true, var25) - arg1.method1611(var27 - 1, true, var25);
                        int var29 = arg1.method1611(var27, true, var25 + 1) - arg1.method1611(var27, true, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field3224[var26][var8] = (float) var28 * var30;
                        this.field3239[var26][var8] = var30 * -256.0F;
                        this.field3238[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field3223; var10 <= this.field3231; var10++) {
            if (var10 >= 0 && arg1.field3525 > var10) {
                for (int var21 = this.field3229; var21 <= this.field3236; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3524) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field4003[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field3243 += 3;
                                    }
                                }
                            } else {
                                this.field3243 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field3236 - this.field3229;
            }
        }
        if (this.field3243 <= 0) {
            this.field3237 = null;
            this.field3242 = null;
            this.field3234 = null;
            this.field3219 = null;
        } else {
            this.field3227 = new class157(this.field3243 * 2);
            this.field3240 = new class210(this.field3243 * 16);
            this.field3220 = new class546(class385.method2206(0, this.field3243));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field3223; var13 <= this.field3231; var13++) {
                if (var13 >= 0 && arg1.field3525 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field3229; var15 <= this.field3236; var15++) {
                        if (var15 >= 0 && arg1.field3524 > var15) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field4003[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field4018[var15][var13];
                                    int[] var19 = arg1.field4028[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method1510(var18[var20], var14, var12, -78, var19[var20], var13, var15);
                                                var20++;
                                                this.method1510(var18[var20], var14, var12, -70, var19[var20], var13, var15);
                                                var20++;
                                                this.method1510(var18[var20], var14, var12, -112, var19[var20], var13, var15);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method1510(0, var14, var12, -115, 0, var13, var15);
                                    this.method1510(arg1.field3527, var14, var12, -100, 0, var13, var15);
                                    this.method1510(0, var14, var12, -95, arg1.field3527, var13, var15);
                                } else if (var16 == 2) {
                                    this.method1510(arg1.field3527, var14, var12, -112, 0, var13, var15);
                                    this.method1510(arg1.field3527, var14, var12, -98, arg1.field3527, var13, var15);
                                    this.method1510(0, var14, var12, -111, 0, var13, var15);
                                } else if (var16 == 5) {
                                    this.method1510(arg1.field3527, var14, var12, -122, arg1.field3527, var13, var15);
                                    this.method1510(0, var14, var12, -91, arg1.field3527, var13, var15);
                                    this.method1510(arg1.field3527, var14, var12, -110, 0, var13, var15);
                                } else if (var16 == 4) {
                                    this.method1510(0, var14, var12, -117, arg1.field3527, var13, var15);
                                    this.method1510(0, var14, var12, -105, 0, var13, var15);
                                    this.method1510(arg1.field3527, var14, var12, -94, arg1.field3527, var13, var15);
                                }
                            }
                        }
                        var14++;
                        var11++;
                    }
                } else {
                    var11 += this.field3236 - this.field3229;
                }
                var12++;
            }
            this.field3219 = this.field3235.method2654(false, this.field3227.field2219, (byte) -112, this.field3227.field2199, 5123);
            this.field3237 = this.field3235.method2658(this.field3240.field2199, (byte) -128, this.field3240.field2219, false, 16);
            this.field3234 = new class199(this.field3237, 5126, 3, 0);
            this.field3242 = new class199(this.field3237, 5121, 4, 12);
        }
        this.field3227 = null;
        this.field3220 = null;
        this.field3240 = null;
        this.field3224 = this.field3239 = this.field3238 = null;
    }
}
