import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class305 extends class601 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Ldh;")
    public static class320 field3798 = new class320(74, 28);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Ldh;")
    public static class320 field3806 = new class320(32, 11);

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)I")
    public final int method1829(int arg0) {
        int var2 = 65 / ((arg0 - -59) / 61);
        ++field3799;
        return super.field8565;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Z")
    public final boolean method1830(int arg0) {
        ++field3805;
        if (arg0 != -9242) {
            field3798 = null;
        }
        return !super.field8563.method3930(19);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field3803;
        if (super.field8563.method3930(19)) {
            return 3;
        } else if (arg0 != 0 && super.field8563.field9845.method3265(arg1 + -15651) != 1) {
            if (arg1 != 15706) {
                this.method35((byte) -128);
            }
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            method1833((byte) -21);
        }
        ++field3807;
        return 1;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lgn;)V")
    public class305(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(ILgn;)V")
    public class305(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
    public static final void method1831(byte arg0) {
        ++field3800;
        int var1 = 59 / ((6 - arg0) / 50);
        class73 var2 = (class73) class578.field8170.method1719(65280);
        boolean var3 = class344.field4474 != null || ~class92.field958 < -1;
        int var4 = var2.method530(-1);
        int var5 = var2.method535((byte) -25);
        if (var3) {
            class634.field9120 = 1;
        }
        if (var3) {
            class713.field10035 = class10.field74;
        } else {
            class229.method1326(var4, (byte) 68, class10.field74, var5);
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I")
    public static final int method1832(int arg0) {
        ++field3804;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class289.field3549.field7851 && !class289.field3549.field7847) {
            var1 = true;
            if (class463.field6618.field2979 < 512 && ~class463.field6618.field2979 != -1) {
                var1 = false;
            }
            if (!class546.field7836.startsWith("win")) {
                var2 = true;
            } else {
                var3 = true;
                var2 = true;
            }
        }
        if (class540.field7776) {
            var3 = false;
        }
        if (class237.field2827) {
            var1 = false;
        }
        if (class209.field2466) {
            var2 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class190.method1158(false);
        } else {
            int var4 = -1;
            int var5 = arg0;
            int var6 = -1;
            if (var1) {
                try {
                    var4 = class411.method2519(arg0 + 1, 1000, 2);
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class411.method2519(arg0 + 1, 1000, 3);
                    if (~class654.field9334.field9850.method1512(78) == -4) {
                        class261 var7 = class275.field3370.method395();
                        long var8 = 281474976710655L & var7.field3238;
                        int var10 = var7.field3236;
                        if (~var10 != -4319) {
                            if (~var10 == -4099) {
                                var2 &= var8 >= 60129613779L;
                            }
                        } else {
                            var2 &= var8 >= 64425238954L;
                        }
                    }
                } catch (Exception var14) {
                }
            }
            if (var2) {
                try {
                    var5 = class411.method2519(arg0 + 1, 1000, 1);
                } catch (Exception var13) {
                }
            }
            if (~var4 == 0 && ~var5 == 0 && ~var6 == 0) {
                return class190.method1158(false);
            } else {
                int var11 = (int) ((float) var6 * 1.1F);
                int var12 = (int) ((float) var5 * 1.1F);
                if (var11 < var4 && ~var12 > ~var4) {
                    return class504.method2995(1, var4);
                } else {
                    return var11 > var12 ? class126.method802(3, var11, (byte) -49) : class126.method802(1, var12, (byte) -49);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        super.field8565 = arg0;
        ++field3802;
        if (arg1) {
            this.method40(87, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        if (arg0 >= -37) {
            field3808 = 31;
        }
        ++field3801;
        if (super.field8563.method3930(19)) {
            super.field8565 = 0;
        }
        if (~super.field8565 > -1 && super.field8565 > 2) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
    public static void method1833(byte arg0) {
        field3798 = null;
        field3806 = null;
        int var1 = 21 % ((arg0 - 71) / 42);
    }
}
