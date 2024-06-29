import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class338 extends class601 {

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!jia", name = "m", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!jia", name = "n", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!jia", name = "o", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!jia", name = "p", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!jia", name = "q", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!jia", name = "r", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!jia", name = "s", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!jia", name = "t", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!jia", name = "u", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!jia", name = "v", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!jia", name = "w", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lqea;)V")
    public class338(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(III)Z")
    public static final boolean method2146(int arg0, int arg1, int arg2) {
        if (arg0 != 544) {
            return false;
        } else {
            ++field4744;
            return (544 & arg2) == 544 | ~(arg2 & 24) != -1;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIIII)V")
    public static final void method2147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4748;
        class346 var5 = class299.method1976(arg1 ^ 4, arg1, arg0);
        var5.method2209(arg1 + 251);
        var5.field4919 = arg4;
        var5.field4926 = arg2;
        var5.field4916 = arg3;
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(III)Z")
    public static final boolean method2148(int arg0, int arg1, int arg2) {
        ++field4750;
        int var3 = -81 % ((arg1 - -49) / 38);
        return (34 & arg2) != 0;
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(ILqea;)V")
    public class338(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "()V")
    public static final void method2149() {
        class269.field3931 = class269.field3929;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        ++field4741;
        if (super.field8137.method2161(arg1 + -22)) {
            return 3;
        } else {
            if (arg1 != 22) {
                method2148(127, -74, -47);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        ++field4740;
        int var3 = -119 / ((22 - arg0) / 34);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        if (super.field8137.method2161(0)) {
            super.field8131 = 0;
        }
        ++field4747;
        if (super.field8131 != 1 && super.field8131 != 0) {
            super.field8131 = this.method45(8976);
        }
        int var2 = 81 / ((59 - arg0) / 33);
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)Z")
    public final boolean method2150(int arg0) {
        ++field4745;
        if (super.field8137.method2161(arg0 + -2048)) {
            return false;
        } else {
            if (arg0 != 2048) {
                method2148(30, -118, -65);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(I)I")
    public final int method2151(int arg0) {
        ++field4743;
        return arg0 != 0 ? -57 : super.field8131;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        ++field4742;
        if (arg0 != 8976) {
            field4751 = 24;
        }
        return 1;
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(B)V")
    public static final void method2152(byte arg0) {
        if (~class102.field1401 == -10) {
            class647.method3624(5, true);
        } else if (class102.field1401 != 5 && ~class102.field1401 != -7) {
            if (~class102.field1401 == -13) {
                class647.method3624(3, true);
            }
        } else {
            class647.method3624(3, true);
        }
        if (arg0 == -66) {
            ++field4746;
        }
    }
}
