import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class259 extends class397 {

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    private int field3703 = 0;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    private int field3714 = 0;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    private int field3709 = 0;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "[S")
    public static short[] field3704 = new short[256];

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "J")
    public static long field3713 = 0L;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "Liu;")
    public static class390 field3707 = new class390(87, 6);

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "Liu;")
    public static class390 field3718 = new class390(0, -2);

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    private int field3700;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    private int field3701;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    private int field3702;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    private int field3705;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    private int field3711;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "Lqn;")
    public static class44 field3712;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 != 80) {
            field3718 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3714 = (arg2.method946(76) << 12) / 100;
                }
            } else {
                this.field3703 = (arg2.method946(24) << 12) / 100;
            }
        } else {
            this.field3709 = arg2.method936((byte) -96);
        }
        ++field3708;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
    private final void method1610(int arg0, int arg1, int arg2, int arg3) {
        ++field3716;
        int var5 = ~arg1 <= ~arg3 ? arg1 : arg3;
        int var6 = arg3 >= arg1 ? arg1 : arg3;
        int var7 = var5 < arg0 ? arg0 : var5;
        int var8 = var6 > arg0 ? arg0 : var6;
        int var9 = -var8 + var7;
        this.field3711 = (var7 + var8) / arg2;
        if (~this.field3711 < -1 && this.field3711 < 4096) {
            this.field3700 = (var9 << 12) / (~this.field3711 >= -2049 ? this.field3711 * 2 : 8192 - this.field3711 * 2);
        } else {
            this.field3700 = 0;
        }
        if (var9 <= 0) {
            this.field3705 = 0;
        } else {
            int var10 = (-arg3 + var7 << 12) / var9;
            int var11 = (-arg1 + var7 << 12) / var9;
            int var12 = (var7 - arg0 << 12) / var9;
            if (arg3 == var7) {
                this.field3705 = ~arg1 == ~var8 ? var12 + 20480 : 4096 - var11;
            } else if (~arg1 != ~var7) {
                this.field3705 = arg3 == var8 ? 12288 - -var11 : -var10 + 20480;
            } else {
                this.field3705 = arg0 == var8 ? 4096 - -var10 : -var12 + 12288;
            }
            this.field3705 /= 6;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Llc;")
    public static final class440 method1611(int arg0, int arg1) {
        ++field3717;
        if (arg1 != -18663) {
            return null;
        } else {
            class440 var2 = (class440) class277.field3959.method40(0, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class449.field6550.method1470(4, arg0, 0);
                class440 var4 = new class440();
                if (var3 != null) {
                    var4.method2575(new class156(var3), -8, arg0);
                }
                class277.field3959.method36(arg1 ^ 6457, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        if (arg0 < 81) {
            return null;
        } else {
            ++field3715;
            int[][] var3 = super.field5848.method1692(arg1, 47);
            if (super.field5848.field3939) {
                int[][] var4 = this.method2377(arg1, -58, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class164.field2152; ++var11) {
                    this.method1610(var7[var11], var6[var11], 2, var5[var11]);
                    this.field3711 += this.field3714;
                    this.field3705 += this.field3709;
                    this.field3700 += this.field3703;
                    while (~this.field3705 > -1) {
                        this.field3705 += 4096;
                    }
                    while (this.field3705 > 4096) {
                        this.field3705 -= 4096;
                    }
                    if (this.field3700 < 0) {
                        this.field3700 = 0;
                    }
                    if (this.field3711 < 0) {
                        this.field3711 = 0;
                    }
                    if (this.field3700 > 4096) {
                        this.field3700 = 4096;
                    }
                    if (this.field3711 > 4096) {
                        this.field3711 = 4096;
                    }
                    this.method1612(this.field3705, this.field3700, 81, this.field3711);
                    var8[var11] = this.field3710;
                    var9[var11] = this.field3702;
                    var10[var11] = this.field3701;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class259() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)V")
    private final void method1612(int arg0, int arg1, int arg2, int arg3) {
        ++field3706;
        int var5 = ~arg3 < -2049 ? -(arg1 * arg3 >> 12) + arg1 + arg3 : (4096 - -arg1) * arg3 >> 12;
        int var6 = 2 / ((arg2 - 11) / 35);
        if (~var5 >= -1) {
            this.field3710 = this.field3702 = this.field3701 = arg3;
        } else {
            int var7 = arg0 * 6;
            int var8 = -var5 + arg3 + arg3;
            int var9 = (-var8 + var5 << 12) / var5;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var5 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = -var14 + var5;
            if (var10 != 0) {
                if (~var10 != -2) {
                    if (var10 != 2) {
                        if (var10 != 3) {
                            if (var10 != 4) {
                                if (~var10 == -6) {
                                    this.field3701 = var16;
                                    this.field3702 = var8;
                                    this.field3710 = var5;
                                }
                            } else {
                                this.field3702 = var8;
                                this.field3701 = var5;
                                this.field3710 = var15;
                            }
                        } else {
                            this.field3702 = var16;
                            this.field3701 = var5;
                            this.field3710 = var8;
                        }
                    } else {
                        this.field3710 = var8;
                        this.field3701 = var15;
                        this.field3702 = var5;
                    }
                } else {
                    this.field3702 = var5;
                    this.field3701 = var8;
                    this.field3710 = var16;
                }
            } else {
                this.field3702 = var15;
                this.field3710 = var5;
                this.field3701 = var8;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public static void method1613(int arg0) {
        field3718 = null;
        field3712 = null;
        field3704 = null;
        field3707 = null;
        if (arg0 != 100) {
            field3704 = null;
        }
    }
}
