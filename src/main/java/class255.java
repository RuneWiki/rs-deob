import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class255 extends class465 {

    @OriginalMember(owner = "client!up", name = "o", descriptor = "[I")
    public static int[] field3541 = new int[4096];

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V")
    public static final void method1569(byte arg0) {
        if (class263.field3647 == null) {
            class263.field3647 = class555.method3068(22751);
            class171.field2633 = class263.field3647[0];
            class690.field9730 = class681.method3802(-23600);
        }
        ++field3535;
        if (class2.field11 == null) {
            class647.method3546(127);
        }
        class555 var1 = class171.field2633;
        int var2 = class64.method511(arg0 ^ -49);
        if (class171.field2633 != var1) {
            if (class555.field7386 == class171.field2633) {
                class2.field11 = null;
                class472.method2658(19093, 3);
            } else {
                class62.field958 = var1.field7362.method546(class516.field6892, (byte) -35);
                class3.field35 = var1.field7365;
                if (class171.field2633.field7367) {
                    class62.field958 = class62.field958 + var1.field7365 + "%";
                }
                if (class171.field2633.field7356 || var1.field7356) {
                    class690.field9730 = class681.method3802(arg0 ^ 23582);
                }
            }
        } else {
            class62.field958 = class171.field2633.field7354.method546(class516.field6892, (byte) -35);
            if (class171.field2633.field7356) {
                class3.field35 = (class171.field2633.field7365 - class171.field2633.field7363) * var2 / 100 + class171.field2633.field7363;
            }
            if (class171.field2633.field7367) {
                class62.field958 = class62.field958 + class3.field35 + "%";
            }
        }
        if (arg0 == -50) {
            if (class2.field11 != null) {
                class2.field11.method1436(class62.field958, (byte) 40, class171.field2633, class3.field35, class690.field9730);
                if (class23.field388 != null) {
                    for (int var3 = class118.field2010 + 1; var3 < class23.field388.length; ++var3) {
                        if (~class23.field388[var3].method1826(2265) <= -101 && ~(var3 + -1) == ~class118.field2010 && ~class32.field525 <= -2 && class2.field11.method1432((byte) 67)) {
                            try {
                                class23.field388[var3].method1828((byte) 46);
                            } catch (Exception var4) {
                                class23.field388 = null;
                                return;
                            }
                            class2.field11.method1434(class23.field388[var3], (byte) 125);
                            ++class118.field2010;
                            if (~(class23.field388.length + -1) >= ~class118.field2010 && class23.field388.length > 1) {
                                class118.field2010 = !class187.field2785.method2990((byte) 109) ? -1 : 0;
                            }
                        }
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IILhf;)V")
    public final void method212(int arg0, int arg1, class367 arg2) {
        super.field6268.method3630(arg2, -2);
        ++field3534;
        super.field6268.method3603((byte) -34, arg1);
        if (arg0 != 0) {
            this.method210(-13, true);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZ)V")
    public final void method210(int arg0, boolean arg1) {
        ++field3537;
        int var3 = 104 % ((arg0 - -30) / 38);
        super.field6268.method3637(true, -81);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BZ)V")
    public final void method214(byte arg0, boolean arg1) {
        ++field3533;
        if (arg0 != 99) {
            this.method215(86, 98, 73);
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
    public static void method1570(int arg0) {
        if (arg0 == 1) {
            field3541 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V")
    public final void method215(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method212(69, 80, (class367) null);
        }
        ++field3538;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public final void method213(int arg0) {
        ++field3539;
        super.field6268.method3637(false, -117);
        if (arg0 != 15495) {
            field3536 = 10;
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Z")
    public final boolean method218(int arg0) {
        if (arg0 <= 110) {
            return false;
        } else {
            ++field3540;
            return true;
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lno;)V")
    public class255(class658 arg0) {
        super(arg0);
    }
}
