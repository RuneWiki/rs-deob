import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class187 extends class252 {

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    private int field3206 = 0;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    private int field3204 = 0;

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "I")
    private int field3217 = 0;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "Ljd;")
    public static class85 field3212 = class221.method1499("p12_full", (byte) 115);

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "Ljd;")
    public static class85 field3209 = class221.method1499("::rect_debug", (byte) -58);

    @OriginalMember(owner = "client!gg", name = "lb", descriptor = "Ljd;")
    private static class85 field3219 = class221.method1499("M", (byte) -45);

    @OriginalMember(owner = "client!gg", name = "mb", descriptor = "Ljd;")
    public static class85 field3220 = field3219;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "Ljd;")
    public static class85 field3213 = field3219;

    @OriginalMember(owner = "client!gg", name = "kb", descriptor = "Lwe;")
    public static class15 field3218 = new class15();

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    private int field3202;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    private int field3207;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    private int field3211;

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
    private int field3214;

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!gg", name = "pb", descriptor = "J")
    public static long field3223;

    @OriginalMember(owner = "client!gg", name = "nb", descriptor = "[I")
    public static int[] field3221;

    @OriginalMember(owner = "client!gg", name = "ob", descriptor = "[I")
    public static int[] field3222;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "[Lfg;")
    public static class12[] field3203;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)V")
    private final void method1284(int arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg0 < -2049 ? -(arg0 * arg2 >> 12) + arg0 - -arg2 : (4096 - -arg2) * arg0 >> 12;
        if (arg1 != -30135) {
            this.field3207 = 3;
        }
        ++field3216;
        if (var5 <= 0) {
            this.field3208 = this.field3201 = this.field3214 = arg0;
        } else {
            int var6 = arg0 - -arg0 + -var5;
            int var7 = arg3 * 6;
            int var8 = (-var6 + var5 << 12) / var5;
            int var9 = var7 >> 12;
            int var10 = -(var9 << 12) + var7;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var6 + var13;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field3201 = var6;
                                    this.field3208 = var5;
                                    this.field3214 = var14;
                                }
                            } else {
                                this.field3201 = var6;
                                this.field3208 = var15;
                                this.field3214 = var5;
                            }
                        } else {
                            this.field3201 = var14;
                            this.field3214 = var5;
                            this.field3208 = var6;
                        }
                    } else {
                        this.field3214 = var15;
                        this.field3201 = var5;
                        this.field3208 = var6;
                    }
                } else {
                    this.field3214 = var6;
                    this.field3201 = var5;
                    this.field3208 = var14;
                }
            } else {
                this.field3208 = var5;
                this.field3214 = var6;
                this.field3201 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIII)V")
    private final void method1285(int arg0, int arg1, int arg2, int arg3) {
        ++field3205;
        int var5 = ~arg1 <= ~arg2 ? arg1 : arg2;
        int var6 = arg0 <= var5 ? var5 : arg0;
        int var7 = arg2 >= arg1 ? arg1 : arg2;
        if (arg3 == 126) {
            int var8 = ~arg0 <= ~var7 ? var7 : arg0;
            this.field3202 = (var6 + var8) / 2;
            int var9 = -var8 + var6;
            if (~var9 >= -1) {
                this.field3207 = 0;
            } else {
                int var10 = (var6 - arg2 << 12) / var9;
                int var11 = (var6 - arg0 << 12) / var9;
                int var12 = (-arg1 + var6 << 12) / var9;
                if (arg2 != var6) {
                    if (~arg1 == ~var6) {
                        this.field3207 = ~arg0 != ~var8 ? 12288 - var11 : var10 + 4096;
                    } else {
                        this.field3207 = arg2 == var8 ? var12 + 12288 : 20480 - var10;
                    }
                } else {
                    this.field3207 = ~arg1 != ~var8 ? -var12 + 4096 : var11 + 20480;
                }
                this.field3207 /= 6;
            }
            if (~this.field3202 < -1 && ~this.field3202 > -4097) {
                this.field3211 = (var9 << 12) / (this.field3202 > 2048 ? 8192 - this.field3202 * 2 : this.field3202 * 2);
            } else {
                this.field3211 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
    public static void method1286(boolean arg0) {
        field3222 = null;
        field3218 = null;
        field3219 = null;
        if (arg0) {
            field3219 = null;
        }
        field3213 = null;
        field3209 = null;
        field3220 = null;
        field3221 = null;
        field3203 = null;
        field3212 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field3210;
        int[][] var3 = super.field4350.method155(arg0, false);
        if (arg1 != -123) {
            method1286(true);
        }
        if (super.field4350.field338) {
            int[][] var4 = this.method1737(0, 3, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class5.field63 > var11; ++var11) {
                this.method1285(var7[var11], var6[var11], var5[var11], 126);
                this.field3211 += this.field3204;
                if (this.field3211 < 0) {
                    this.field3211 = 0;
                }
                this.field3202 += this.field3206;
                if (~this.field3202 > -1) {
                    this.field3202 = 0;
                }
                for (this.field3207 += this.field3217; ~this.field3207 > -1; this.field3207 += 4096) {
                }
                if (~this.field3211 < -4097) {
                    this.field3211 = 4096;
                }
                while (~this.field3207 < -4097) {
                    this.field3207 -= 4096;
                }
                if (this.field3202 > 4096) {
                    this.field3202 = 4096;
                }
                this.method1284(this.field3202, -30135, this.field3211, this.field3207);
                var8[var11] = this.field3208;
                var9[var11] = this.field3201;
                var10[var11] = this.field3214;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
    public static final int method1287(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field3215;
        if (arg2 == -99) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field3206 = (arg0.method1690(true) << 12) / 100;
                    }
                } else {
                    this.field3204 = (arg0.method1690(true) << 12) / 100;
                }
            } else {
                this.field3217 = arg0.method1677(true);
            }
        }
    }
}
