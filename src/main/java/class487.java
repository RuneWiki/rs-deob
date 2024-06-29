import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class487 extends class139 {

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    private int field6854 = 0;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    private int field6857 = 12288;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    private int field6855 = 8192;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    private int field6852 = 2048;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    private int field6856 = 4096;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    private int field6860 = 0;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    private int field6865 = 2048;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Lwf;")
    public static class79 field6853 = new class79(43, 4);

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public static int field6862 = -1;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    public static int field6867 = 0;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(III)Z")
    private final boolean method2852(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2856((byte) 42);
        }
        ++field6863;
        int var4 = (-arg0 + arg2) * this.field6857 >> 12;
        int var5 = class311.field4401[(var4 * 255 & 1045997) >> 12];
        int var6 = (var5 << 12) / this.field6857;
        int var7 = (var6 << 12) / this.field6855;
        int var8 = this.field6856 * var7 >> 12;
        return arg0 + arg2 < var8 && -var8 < arg0 + arg2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILnp;)V")
    public static final void method2853(int arg0, class313 arg1) {
        ++field6858;
        if (~class61.field801 != ~class492.field6935.field4319) {
            if (class330.field4786 != null) {
                if (class203.method1268(-16777216, class492.field6935.field4319, arg1)) {
                    class61.field801 = class492.field6935.field4319;
                }
                if (arg0 >= -74) {
                    method2856((byte) -86);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        ++field6864;
        if (arg0 == 7) {
            class224.method1439(-91);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[BII)Z")
    public static final boolean method2854(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        ++field6859;
        if (arg2 != 24330) {
            return true;
        } else {
            boolean var6 = true;
            class276 var7 = new class276(arg3);
            int var8 = -1;
            label74: while (true) {
                int var9 = var7.method1739(-35);
                if (var9 == 0) {
                    return var6;
                }
                var8 += var9;
                int var10 = 0;
                boolean var11 = false;
                while (true) {
                    int var15;
                    class453 var18;
                    do {
                        int var16;
                        int var17;
                        do {
                            do {
                                do {
                                    do {
                                        while (var11) {
                                            int var19 = var7.method1712(-1);
                                            if (~var19 == -1) {
                                                continue label74;
                                            }
                                            var7.method1701(-23121);
                                        }
                                        int var12 = var7.method1712(-1);
                                        if (var12 == 0) {
                                            continue label74;
                                        }
                                        var10 += var12 + -1;
                                        int var13 = 63 & var10;
                                        int var14 = (4034 & var10) >> 6;
                                        var15 = var7.method1701(arg2 ^ -1371) >> 2;
                                        var16 = arg1 + var14;
                                        var17 = arg0 + var13;
                                    } while (var16 <= 0);
                                } while (~var17 >= -1);
                            } while (~(arg5 + -1) >= ~var16);
                        } while (arg4 + -1 <= var17);
                        var18 = class156.field2325.method808(var8, arg2 ^ 24330);
                    } while (~var15 == -23 && !class314.field4438.field5801 && var18.field6366 == 0 && var18.field6371 != 1 && !var18.field6374);
                    if (!var18.method2662((byte) 2)) {
                        ++class132.field1745;
                        var6 = false;
                    }
                    var11 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(III)Z")
    private final boolean method2855(int arg0, int arg1, int arg2) {
        ++field6861;
        if (arg2 != 0) {
            this.field6852 = 51;
        }
        int var4 = (arg0 + arg1) * this.field6857 >> 12;
        int var5 = class311.field4401[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field6857;
        int var7 = (var6 << 12) / this.field6855;
        int var8 = this.field6856 * var7 >> 12;
        return var8 > -arg0 + arg1 && ~(-arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(B)V")
    public static final void method2856(byte arg0) {
        ++field6850;
        if (arg0 != 46) {
            field6853 = null;
        }
        class37.field491 = 0;
        for (int var1 = 0; var1 < 2048; ++var1) {
            class486.field6847[var1] = null;
            class8.field80[var1] = 1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field6849;
        int[] var3 = super.field1844.method2176(arg0, arg1 ^ arg1);
        if (super.field1844.field5045) {
            int var4 = class237.field3559[arg0] - 2048;
            for (int var5 = 0; ~class356.field5147 < ~var5; ++var5) {
                int var6 = class216.field3245[var5] - 2048;
                int var7 = this.field6865 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = this.field6860 + var4;
                int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field6854;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = this.field6852 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method2852(var9, class125.method786(arg1, 27782), var12) && !this.method2855(var15, var18, 0) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class487() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public static void method2857(boolean arg0) {
        if (!arg0) {
            method2853(-11, (class313) null);
        }
        field6853 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field6866;
        if (arg1 != -45) {
            method2856((byte) 37);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field6855 = arg0.method1729(65280);
                                }
                            } else {
                                this.field6856 = arg0.method1729(arg1 ^ -65325);
                            }
                        } else {
                            this.field6857 = arg0.method1729(65280);
                        }
                    } else {
                        this.field6852 = arg0.method1729(arg1 ^ -65325);
                    }
                } else {
                    this.field6854 = arg0.method1729(65280);
                }
            } else {
                this.field6860 = arg0.method1729(65280);
            }
        } else {
            this.field6865 = arg0.method1729(65280);
        }
    }
}
