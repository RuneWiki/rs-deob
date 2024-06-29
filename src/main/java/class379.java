import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class379 extends class334 {

    @OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
    private int field5306 = 0;

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "I")
    private int field5304 = 0;

    @OriginalMember(owner = "client!tda", name = "T", descriptor = "I")
    private int field5316 = 0;

    @OriginalMember(owner = "client!tda", name = "R", descriptor = "I")
    public static volatile int field5314 = -1;

    @OriginalMember(owner = "client!tda", name = "P", descriptor = "Lvd;")
    public static class710 field5312 = new class710();

    @OriginalMember(owner = "client!tda", name = "V", descriptor = "Laq;")
    public static class494 field5318 = new class494(64);

    @OriginalMember(owner = "client!tda", name = "X", descriptor = "I")
    public static int field5320 = 0;

    @OriginalMember(owner = "client!tda", name = "E", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "I")
    private int field5303;

    @OriginalMember(owner = "client!tda", name = "I", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!tda", name = "K", descriptor = "I")
    private int field5307;

    @OriginalMember(owner = "client!tda", name = "L", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!tda", name = "M", descriptor = "I")
    private int field5309;

    @OriginalMember(owner = "client!tda", name = "N", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!tda", name = "O", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!tda", name = "Q", descriptor = "I")
    private int field5313;

    @OriginalMember(owner = "client!tda", name = "S", descriptor = "I")
    private int field5315;

    @OriginalMember(owner = "client!tda", name = "U", descriptor = "I")
    private int field5317;

    @OriginalMember(owner = "client!tda", name = "W", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!tda", name = "Y", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
    public class379() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II[III)V")
    public static final void method2284(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        ++field5302;
        --arg0;
        int var8 = arg1 - 1;
        int var5 = -7 + var8;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg2[var6] = arg3;
            int var7 = var6 + 1;
            arg2[var7] = arg3;
            int var9 = var7 + 1;
            arg2[var9] = arg3;
            int var10 = var9 + 1;
            arg2[var10] = arg3;
            int var11 = var10 + 1;
            arg2[var11] = arg3;
            int var12 = var11 + 1;
            arg2[var12] = arg3;
            int var13 = var12 + 1;
            arg2[var13] = arg3;
            arg0 = var13 + 1;
            arg2[arg0] = arg3;
        }
        if (arg4 != 2) {
            field5319 = -20;
        }
        while (arg0 < var8) {
            ++arg0;
            arg2[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)V")
    public static void method2285(boolean arg0) {
        field5318 = null;
        field5312 = null;
        if (!arg0) {
            method2285(false);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            this.method2286(23, false, -34, 69);
        }
        ++field5308;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field5316 = (arg2.method2529(120) << 12) / 100;
                }
            } else {
                this.field5304 = (arg2.method2529(118) << 12) / 100;
            }
        } else {
            this.field5306 = arg2.method2528((byte) 89);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method283(boolean arg0, int arg1) {
        ++field5305;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (!arg0) {
            this.method283(true, 94);
        }
        if (super.field4734.field425) {
            int[][] var4 = this.method2053(1, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class439.field6099 < ~var11; ++var11) {
                this.method2286(var5[var11], false, var7[var11], var6[var11]);
                this.field5315 += this.field5316;
                this.field5303 += this.field5304;
                for (this.field5309 += this.field5306; this.field5309 < 0; this.field5309 += 4096) {
                }
                while (~this.field5309 < -4097) {
                    this.field5309 -= 4096;
                }
                if (this.field5303 < 0) {
                    this.field5303 = 0;
                }
                if (~this.field5303 < -4097) {
                    this.field5303 = 4096;
                }
                if (~this.field5315 > -1) {
                    this.field5315 = 0;
                }
                if (this.field5315 > 4096) {
                    this.field5315 = 4096;
                }
                this.method2287(this.field5309, 4096, this.field5315, this.field5303);
                var8[var11] = this.field5313;
                var9[var11] = this.field5317;
                var10[var11] = this.field5307;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZII)V")
    private final void method2286(int arg0, boolean arg1, int arg2, int arg3) {
        ++field5310;
        int var5 = ~arg3 <= ~arg0 ? arg3 : arg0;
        int var6 = ~arg3 >= ~arg0 ? arg3 : arg0;
        if (arg1) {
            this.method2286(93, true, -88, -81);
        }
        int var7 = arg2 <= var5 ? var5 : arg2;
        int var8 = ~arg2 > ~var6 ? arg2 : var6;
        this.field5315 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (~this.field5315 < -1 && this.field5315 < 4096) {
            this.field5303 = (var9 << 12) / (this.field5315 <= 2048 ? this.field5315 * 2 : -(this.field5315 * 2) + 8192);
        } else {
            this.field5303 = 0;
        }
        if (var9 <= 0) {
            this.field5309 = 0;
        } else {
            int var10 = (-arg0 + var7 << 12) / var9;
            int var11 = (-arg3 + var7 << 12) / var9;
            int var12 = (-arg2 + var7 << 12) / var9;
            if (arg0 == var7) {
                this.field5309 = arg3 == var8 ? 20480 - -var12 : -var11 + 4096;
            } else if (arg3 == var7) {
                this.field5309 = arg2 != var8 ? -var12 + 12288 : var10 + 4096;
            } else {
                this.field5309 = arg0 == var8 ? 12288 - -var11 : -var10 + 20480;
            }
            this.field5309 /= 6;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)V")
    private final void method2287(int arg0, int arg1, int arg2, int arg3) {
        ++field5311;
        int var5 = arg2 <= 2048 ? (arg3 + 4096) * arg2 >> 12 : -(arg2 * arg3 >> 12) + arg2 + arg3;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = arg2 + arg2 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field5317 = var7;
                                    this.field5313 = var5;
                                    this.field5307 = var15;
                                }
                            } else {
                                this.field5307 = var5;
                                this.field5317 = var7;
                                this.field5313 = var14;
                            }
                        } else {
                            this.field5317 = var15;
                            this.field5313 = var7;
                            this.field5307 = var5;
                        }
                    } else {
                        this.field5313 = var7;
                        this.field5317 = var5;
                        this.field5307 = var14;
                    }
                } else {
                    this.field5313 = var15;
                    this.field5317 = var5;
                    this.field5307 = var7;
                }
            } else {
                this.field5307 = var7;
                this.field5317 = var14;
                this.field5313 = var5;
            }
        } else {
            this.field5313 = this.field5317 = this.field5307 = arg2;
        }
        if (arg1 != 4096) {
            this.method283(false, 0);
        }
    }
}
