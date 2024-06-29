import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class478 extends class11 implements class338 {

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Lid;")
    public class412 field6585;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Z")
    private boolean field6579;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Lff;")
    public static class9 field6582 = new class9(55, -2);

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lff;")
    public static class9 field6595 = new class9(93, 6);

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lff;")
    public static class9 field6596 = new class9(82, 8);

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        ++field6594;
        class121 var3 = this.field6585.method2380(false, arg1, arg0, super.field242, super.field241, 262144, -1);
        if (var3 != null) {
            int var4 = super.field241 >> 7;
            int var5 = super.field242 >> 7;
            this.field6585.method2376(var3, arg0, var4, true, var5, var5, var4, false);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)I")
    public final int method345(int arg0) {
        ++field6584;
        if (arg0 != -1736) {
            method2742(76, 3, -117, -106, -41);
        }
        return this.field6585.field5659;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        ++field6593;
        if (arg0 >= -8) {
            this.method128((byte) 61);
        }
        return this.field6585.method2387(false);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBII)I")
    public static final int method2741(int arg0, byte arg1, int arg2, int arg3) {
        ++field6589;
        int var4 = arg2 & 3;
        if (var4 == 0) {
            return arg0;
        } else {
            if (arg1 < 30) {
                field6582 = null;
            }
            if (~var4 == -2) {
                return 1023 - arg3;
            } else {
                return var4 == 2 ? -arg0 + 1023 : arg3;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I")
    public final int method347(byte arg0) {
        if (arg0 != -87) {
            this.method337(56, (class162) null);
        }
        ++field6578;
        return this.field6585.field5671;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        ++field6590;
        int var2 = 109 % ((56 - arg0) / 52);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lqa;Lus;IIIIIZIIIIII)V")
    public class478(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class162.method1097(arg11, arg12, 103));
        this.field6585 = new class412(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field6579 = arg1.field83 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    public static final void method2742(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class71.field1077 = arg3;
        if (arg1 != 375) {
            method2741(-96, (byte) 34, -31, 98);
        }
        class353.field4777 = arg2;
        class300.field3971 = arg0;
        ++field6580;
        class308.field4055 = arg4;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        ++field6591;
        class121 var3 = this.field6585.method2380(false, true, arg1, super.field242, super.field241, 2048, arg0 + -9125);
        if (arg0 != 9124) {
            this.method338(-10);
        }
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method611();
            var4.method971(super.field241 + super.field233, super.field237, super.field242 - -super.field235);
            class514 var5 = null;
            if (this.field6579) {
                var5 = class148.method1020(arg0 ^ 9124, 1);
            }
            if (this.field6585.field5691 == null) {
                var3.method853(var4, var5 != null ? var5.field7563[0] : null, 0);
            } else {
                class411 var6 = this.field6585.field5691.method3100();
                arg1.method534(var3, var6, var4, var5 != null ? var5.field7563[0] : null, 0);
            }
            int var7 = super.field241 >> 7;
            int var8 = super.field242 >> 7;
            this.field6585.method2376(var3, arg1, var7, true, var8, var8, var7, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field6583;
        class121 var5 = this.field6585.method2380(false, false, arg2, super.field242, super.field241, 131072, arg0);
        if (var5 == null) {
            return false;
        } else {
            class414 var6 = arg2.method611();
            var6.method971(super.field241 + super.field233, super.field237, super.field242 - -super.field235);
            return var5.method847(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLqa;I)Lc;")
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        ++field6581;
        if (arg0 != -102) {
            field6595 = null;
        }
        return this.field6585.method2380(false, false, arg1, 0, 0, arg2, arg0 ^ 101);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)I")
    public final int method128(byte arg0) {
        ++field6592;
        if (arg0 <= 44) {
            method2742(-36, 75, -40, 108, -65);
        }
        return this.field6585.method2385(-1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILqa;)V")
    public final void method337(int arg0, class162 arg1) {
        if (arg0 == -7803) {
            ++field6588;
            this.field6585.method2379(arg1, -6659);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
    public final int method344(int arg0) {
        if (arg0 != -4534) {
            this.method128((byte) 26);
        }
        ++field6587;
        return this.field6585.field5667;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lqa;I)V")
    public final void method340(class162 arg0, int arg1) {
        this.field6585.method2381(0, arg0);
        ++field6586;
        if (arg1 != 20203) {
            this.method347((byte) 14);
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static void method2743(int arg0) {
        if (arg0 == 0) {
            field6595 = null;
            field6582 = null;
            field6596 = null;
        }
    }
}
