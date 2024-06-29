import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class257 extends class666 {

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    private int field3281 = 0;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    private int field3288 = 0;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    private int field3286 = 0;

    @OriginalMember(owner = "client!uu", name = "P", descriptor = "[[B")
    public static byte[][] field3292 = new byte[250][];

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    private int field3282;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    private int field3284;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    private int field3285;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    private int field3287;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    private int field3291;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!uu", name = "R", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBII)V")
    private final void method1466(int arg0, byte arg1, int arg2, int arg3) {
        ++field3290;
        int var5 = ~arg2 > ~arg3 ? arg3 : arg2;
        int var6 = var5 >= arg0 ? var5 : arg0;
        int var7 = ~arg3 <= ~arg2 ? arg2 : arg3;
        int var8 = var7 > arg0 ? arg0 : var7;
        this.field3284 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (var9 > 0) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (var6 - arg2 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (~arg3 == ~var6) {
                this.field3294 = arg2 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg2 == ~var6) {
                this.field3294 = ~arg0 == ~var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field3294 = ~arg3 == ~var8 ? 12288 - -var11 : -var10 + 20480;
            }
            this.field3294 /= 6;
        } else {
            this.field3294 = 0;
        }
        if (arg1 != -58) {
            field3292 = null;
        }
        if (this.field3284 > 0 && this.field3284 < 4096) {
            this.field3287 = (var9 << 12) / (~this.field3284 >= -2049 ? this.field3284 * 2 : -(this.field3284 * 2) + 8192);
        } else {
            this.field3287 = 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public static void method1467(byte arg0) {
        if (arg0 < 77) {
            field3292 = null;
        }
        field3292 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field3283;
        int[][] var3 = super.field9471.method3639(34, arg0);
        if (arg1 != 98) {
            this.field3284 = -76;
        }
        if (super.field9471.field9180) {
            int[][] var4 = this.method3737(arg0, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class501.field7222; ++var11) {
                this.method1466(var7[var11], (byte) -58, var6[var11], var5[var11]);
                this.field3287 += this.field3286;
                this.field3294 += this.field3281;
                this.field3284 += this.field3288;
                while (~this.field3294 > -1) {
                    this.field3294 += 4096;
                }
                while (this.field3294 > 4096) {
                    this.field3294 -= 4096;
                }
                if (~this.field3287 > -1) {
                    this.field3287 = 0;
                }
                if (~this.field3284 > -1) {
                    this.field3284 = 0;
                }
                if (this.field3287 > 4096) {
                    this.field3287 = 4096;
                }
                if (~this.field3284 < -4097) {
                    this.field3284 = 4096;
                }
                this.method1468(this.field3284, true, this.field3287, this.field3294);
                var8[var11] = this.field3285;
                var9[var11] = this.field3291;
                var10[var11] = this.field3282;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZII)V")
    private final void method1468(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3289;
        int var5 = arg0 <= 2048 ? (4096 - -arg2) * arg0 >> 12 : -(arg0 * arg2 >> 12) + arg0 - -arg2;
        if (var5 <= 0) {
            this.field3285 = this.field3291 = this.field3282 = arg0;
        } else {
            int var6 = arg3 * 6;
            int var7 = -var5 + arg0 - -arg0;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field3291 = var7;
                                    this.field3282 = var15;
                                    this.field3285 = var5;
                                }
                            } else {
                                this.field3291 = var7;
                                this.field3282 = var5;
                                this.field3285 = var14;
                            }
                        } else {
                            this.field3285 = var7;
                            this.field3282 = var5;
                            this.field3291 = var15;
                        }
                    } else {
                        this.field3282 = var14;
                        this.field3285 = var7;
                        this.field3291 = var5;
                    }
                } else {
                    this.field3291 = var5;
                    this.field3282 = var7;
                    this.field3285 = var15;
                }
            } else {
                this.field3282 = var7;
                this.field3285 = var5;
                this.field3291 = var14;
            }
        }
        if (!arg1) {
            method1467((byte) -80);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field3293;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field3288 = (arg1.method2547(arg2) << 12) / 100;
                }
            } else {
                this.field3286 = (arg1.method2547(true) << 12) / 100;
            }
        } else {
            this.field3281 = arg1.method2549((byte) 32);
        }
        if (!arg2) {
            method1467((byte) 84);
        }
    }
}
