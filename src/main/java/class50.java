import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class50 extends class185 {

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    private int field795 = 0;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    private int field808 = 0;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    private int field806 = 0;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "Z")
    public static boolean field802 = false;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field801 = 0;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "Lik;")
    public static class267 field792 = new class267(30);

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    private int field807;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "I")
    private int field809;

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "I")
    private int field810;

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "Lda;")
    public static class189 field811;

    @OriginalMember(owner = "client!sj", name = "eb", descriptor = "Lpf;")
    public static class294 field812;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(Z)V")
    public static void method329(boolean arg0) {
        field792 = null;
        field811 = null;
        if (!arg0) {
            field792 = null;
        }
        field812 = null;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
    public static final void method330(byte arg0) {
        class99.field1560.method1775(27147);
        ++field803;
        if (arg0 < -60) {
            class265.field3992.method1775(27147);
            class191.field2931.method1775(27147);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIII)V")
    private final void method331(byte arg0, int arg1, int arg2, int arg3) {
        ++field793;
        int var5 = arg3 <= 2048 ? (arg2 + 4096) * arg3 >> 12 : arg2 + arg3 + -(arg2 * arg3 >> 12);
        if (arg0 != -117) {
            method329(false);
        }
        if (var5 <= 0) {
            this.field794 = this.field798 = this.field809 = arg3;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg3 + arg3 - var5;
            int var9 = (-var7 + var5 << 12) / var5;
            int var10 = var6 >> 12;
            int var11 = var5 * var9 >> 12;
            int var12 = -(var10 << 12) + var6;
            int var13 = var11 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (var10 != 0) {
                if (~var10 != -2) {
                    if (var10 != 2) {
                        if (~var10 != -4) {
                            if (var10 != 4) {
                                if (~var10 == -6) {
                                    this.field809 = var15;
                                    this.field798 = var7;
                                    this.field794 = var5;
                                }
                            } else {
                                this.field809 = var5;
                                this.field798 = var7;
                                this.field794 = var14;
                            }
                        } else {
                            this.field794 = var7;
                            this.field798 = var15;
                            this.field809 = var5;
                        }
                    } else {
                        this.field798 = var5;
                        this.field809 = var14;
                        this.field794 = var7;
                    }
                } else {
                    this.field809 = var7;
                    this.field798 = var5;
                    this.field794 = var15;
                }
            } else {
                this.field809 = var7;
                this.field794 = var5;
                this.field798 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILpf;)[Lmc;")
    public static final class201[] method332(int arg0, int arg1, int arg2, class294 arg3) {
        if (arg0 != 12288) {
            field812 = null;
        }
        ++field805;
        return !class66.method451(arg3, arg1, 2048, arg2) ? null : class24.method154((byte) -1);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            this.method27(-14, (class248) null, 93);
        }
        ++field804;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int[][] var4 = this.method1152(!arg0, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; class174.field2648 > var11; ++var11) {
                this.method334(-28454, var5[var11], var6[var11], var7[var11]);
                this.field807 += this.field806;
                this.field800 += this.field795;
                while (this.field807 < 0) {
                    this.field807 += 4096;
                }
                while (this.field807 > 4096) {
                    this.field807 -= 4096;
                }
                if (~this.field800 > -1) {
                    this.field800 = 0;
                }
                this.field810 += this.field808;
                if (this.field800 > 4096) {
                    this.field800 = 4096;
                }
                if (~this.field810 > -1) {
                    this.field810 = 0;
                }
                if (this.field810 > 4096) {
                    this.field810 = 4096;
                }
                this.method331((byte) -117, this.field807, this.field800, this.field810);
                var10[var11] = this.field794;
                var8[var11] = this.field798;
                var9[var11] = this.field809;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field808 = (arg1.method1604(arg2 + 6361) << 12) / 100;
                }
            } else {
                this.field795 = (arg1.method1604(arg2 ^ -6353) << 12) / 100;
            }
        } else {
            this.field806 = arg1.method1606((byte) 77);
        }
        ++field796;
        if (arg2 != -6357) {
            this.field794 = 49;
        }
    }

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "(I)V")
    public static final void method333(int arg0) {
        if (arg0 > -55) {
            method332(79, -48, -53, (class294) null);
        }
        ++field797;
        class200 var1 = class284.field4244;
        synchronized (class284.field4244) {
            ++class239.field3598;
            class176.field2695 = class75.field1221;
            if (class174.field2655 < 0) {
                for (int var2 = 0; ~var2 > -113; ++var2) {
                    class140.field2048[var2] = false;
                }
                class174.field2655 = class97.field1528;
            } else {
                while (class97.field1528 != class174.field2655) {
                    int var3 = class220.field3316[class97.field1528];
                    class97.field1528 = 127 & class97.field1528 + 1;
                    if (var3 >= 0) {
                        class140.field2048[var3] = true;
                    } else {
                        class140.field2048[~var3] = false;
                    }
                }
            }
            class75.field1221 = class39.field531;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)V")
    private final void method334(int arg0, int arg1, int arg2, int arg3) {
        ++field799;
        int var5 = ~arg2 >= ~arg1 ? arg1 : arg2;
        int var6 = ~arg3 < ~var5 ? arg3 : var5;
        int var7 = ~arg1 < ~arg2 ? arg2 : arg1;
        if (arg0 != -28454) {
            this.field798 = -9;
        }
        int var8 = var7 <= arg3 ? var7 : arg3;
        int var9 = var6 - var8;
        if (~var9 >= -1) {
            this.field807 = 0;
        } else {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (var6 - arg1 << 12) / var9;
            int var12 = (var6 - arg3 << 12) / var9;
            if (arg2 != var6) {
                if (~arg1 == ~var6) {
                    this.field807 = ~arg3 == ~var8 ? 4096 - -var10 : -var12 + 12288;
                } else {
                    this.field807 = arg2 != var8 ? -var10 + 20480 : var11 + 12288;
                }
            } else {
                this.field807 = ~arg1 == ~var8 ? 20480 - -var12 : 4096 - var11;
            }
            this.field807 /= 6;
        }
        this.field810 = (var8 - -var6) / 2;
        if (this.field810 > 0 && this.field810 < 4096) {
            this.field800 = (var9 << 12) / (this.field810 > 2048 ? -(this.field810 * 2) + 8192 : this.field810 * 2);
        } else {
            this.field800 = 0;
        }
    }
}
