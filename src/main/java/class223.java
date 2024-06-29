import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class223 extends class115 {

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    private int field3827 = 12288;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    private int field3820 = 4096;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    private int field3824 = 2048;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    private int field3829 = 0;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    private int field3832 = 2048;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    private int field3830 = 0;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    private int field3836 = 8192;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "Lqe;")
    public static class168 field3834 = class66.method448("Clientscript error )2 check log for details", 41);

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Lrd;")
    public static class207 field3821;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB)Z")
    private final boolean method1456(int arg0, int arg1, byte arg2) {
        ++field3826;
        int var4 = (-arg0 + arg1) * this.field3827 >> 12;
        int var5 = class170.field2961[(1047589 & var4 * 255) >> 12];
        if (arg2 <= 111) {
            this.method5(66, (byte) -100);
        }
        int var6 = (var5 << 12) / this.field3827;
        int var7 = (var6 << 12) / this.field3836;
        int var8 = this.field3820 * var7 >> 12;
        return var8 > arg0 + arg1 && ~(arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIB)Z")
    private final boolean method1457(int arg0, int arg1, byte arg2) {
        ++field3819;
        int var4 = (arg0 + arg1) * this.field3827 >> 12;
        int var5 = class170.field2961[(1046904 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3827;
        int var7 = (var6 << 12) / this.field3836;
        int var8 = this.field3820 * var7 >> 12;
        if (arg2 != -63) {
            return true;
        } else {
            return ~(-arg1 + arg0) > ~var8 && -arg1 + arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
    public static final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3828;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = class97.method639(arg1 + arg2, (byte) 12, class174.field3055, class249.field4314);
        int var9 = class97.method639(-arg2 + arg1, (byte) 12, class174.field3055, class249.field4314);
        if (arg0 != 5785) {
            field3835 = -75;
        }
        int var10 = -1;
        class232.method1501(arg3, var9, (byte) -108, class241.field4117[arg4], var8);
        while (~var6 < ~var5) {
            var10 += 2;
            var7 += var10;
            if (~var7 < -1) {
                --var6;
                var7 -= var6 << 1;
                int var11 = arg4 - -var6;
                int var12 = -var6 + arg4;
                if (~var11 <= ~class222.field3811 && class196.field3402 >= var12) {
                    int var13 = class97.method639(arg1 + var5, (byte) 12, class174.field3055, class249.field4314);
                    int var14 = class97.method639(-var5 + arg1, (byte) 12, class174.field3055, class249.field4314);
                    if (var11 <= class196.field3402) {
                        class232.method1501(arg3, var14, (byte) -108, class241.field4117[var11], var13);
                    }
                    if (var12 >= class222.field3811) {
                        class232.method1501(arg3, var14, (byte) -108, class241.field4117[var12], var13);
                    }
                }
            }
            ++var5;
            int var15 = arg4 + var5;
            int var16 = -var5 + arg4;
            if (class222.field3811 <= var15 && var16 <= class196.field3402) {
                int var17 = class97.method639(arg1 + var6, (byte) 12, class174.field3055, class249.field4314);
                int var18 = class97.method639(arg1 - var6, (byte) 12, class174.field3055, class249.field4314);
                if (var15 <= class196.field3402) {
                    class232.method1501(arg3, var18, (byte) -108, class241.field4117[var15], var17);
                }
                if (class222.field3811 <= var16) {
                    class232.method1501(arg3, var18, (byte) -108, class241.field4117[var16], var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field3836 = arg1.method731(false);
                                }
                            } else {
                                this.field3820 = arg1.method731(false);
                            }
                        } else {
                            this.field3827 = arg1.method731(false);
                        }
                    } else {
                        this.field3832 = arg1.method731(false);
                    }
                } else {
                    this.field3829 = arg1.method731(false);
                }
            } else {
                this.field3830 = arg1.method731(false);
            }
        } else {
            this.field3824 = arg1.method731(false);
        }
        ++field3831;
        if (arg0 != 107) {
            this.field3830 = -107;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public static void method1459(boolean arg0) {
        if (arg0) {
            field3821 = null;
        }
        field3834 = null;
        field3821 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII)I")
    public static final int method1460(boolean arg0, int arg1, int arg2) {
        ++field3823;
        if (!arg0) {
            return 73;
        } else {
            class170 var3 = (class170) class119.field1941.method1527((long) arg2, (byte) -103);
            if (var3 == null) {
                return -1;
            } else {
                return arg1 >= 0 && var3.field2964.length > arg1 ? var3.field2964[arg1] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        ++field3822;
        if (arg0 != 395462996) {
            this.field3827 = 23;
        }
        class142.method969(-15046);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class223() {
        super(0, true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Lgi;")
    public static final class123 method1461(int arg0, boolean arg1) {
        ++field3833;
        class123 var2 = (class123) class131.field2310.method1499(0, (long) arg0);
        if (arg1) {
            field3837 = 124;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class91.field1420.method1712(arg0, 1, -1);
            class123 var4 = new class123();
            if (var3 != null) {
                var4.method839(new class112(var3), (byte) -81, arg0);
            }
            class131.field2310.method1502((byte) -18, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 < 37) {
            this.field3827 = 108;
        }
        ++field3825;
        int[] var3 = super.field1872.method182((byte) -87, arg0);
        if (super.field1872.field341) {
            int var4 = class170.field2963[arg0] - 2048;
            for (int var5 = 0; class130.field2297 > var5; ++var5) {
                int var6 = class193.field3367[var5] + -2048;
                int var7 = this.field3829 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field3830 + var4;
                int var11 = var4 - -this.field3832;
                int var12 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var13 = ~var12 < -2049 ? var12 + -4096 : var12;
                int var14 = var11 < -2048 ? var11 + 4096 : var11;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field3824 + var6;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method1456(var18, var13, (byte) 113) && !this.method1457(var15, var9, (byte) -63) ? 0 : 4096;
            }
        }
        return var3;
    }
}
