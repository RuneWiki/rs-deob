import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class438 extends class322 {

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field6239 = 0;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V", line = 4)
    public static final void method2645(byte arg0) {
        if (arg0 != -27) {
            field6239 = -41;
        }
        ++field6242;
        int var1 = 0;
        if (class557.field7812 != null) {
            var1 = class557.field7812.field6552.method4108(false);
        }
        if (var1 == 2) {
            int var2 = ~class494.field7122 >= -801 ? class494.field7122 : 800;
            class633.field8741 = (-var2 + class494.field7122) / 2;
            int var3 = ~class261.field3756 < -601 ? 600 : class261.field3756;
            class446.field6323 = var2;
            class172.field2348 = var3;
            class657.field9009 = 0;
        } else if (var1 != 1) {
            class446.field6323 = class494.field7122;
            class633.field8741 = 0;
            class657.field9009 = 0;
            class172.field2348 = class261.field3756;
        } else {
            int var4 = class494.field7122 > 1024 ? 1024 : class494.field7122;
            class633.field8741 = (-var4 + class494.field7122) / 2;
            class446.field6323 = var4;
            int var5 = class261.field3756 > 768 ? 768 : class261.field3756;
            class657.field9009 = 0;
            class172.field2348 = var5;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lch;)V", line = 52)
    public class438(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)I", line = 56)
    public static final int method2646(int arg0, int arg1) {
        return class200.field2636 != null ? class200.field2636[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)I", line = 60)
    public final int method2647(boolean arg0) {
        ++field6247;
        if (arg0) {
            field6239 = 73;
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)Z", line = 73)
    public final boolean method2648(byte arg0) {
        ++field6245;
        if (arg0 != -53) {
            field6239 = -104;
        }
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I", line = 85)
    public final int method17(byte arg0) {
        int var2 = -65 % ((arg0 - 70) / 51);
        ++field6240;
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V", line = 98)
    public final void method22(int arg0, int arg1) {
        ++field6241;
        super.field4451 = arg1;
        if (arg0 != 0) {
            field6243 = 81;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(ILch;)V", line = 111)
    public class438(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(B)Z", line = 114)
    public final boolean method2649(byte arg0) {
        int var2 = -19 / ((arg0 - 21) / 56);
        ++field6244;
        return class709.method3975(super.field4451, 88);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V", line = 126)
    public final void method23(boolean arg0) {
        ++field6238;
        if (this.method2649((byte) 125)) {
            if (super.field4450.field6521.method2558(5) && !class18.method113(-3, super.field4450.field6521.method2556(false))) {
                super.field4451 = 1;
            }
            if (~super.field4450.field6549.method290(false) == -2) {
                super.field4451 = 1;
            }
        }
        if (arg0) {
            this.method2647(true);
        }
        if (~super.field4451 == -4) {
            super.field4451 = 2;
        }
        if (~super.field4451 > -1 || super.field4451 > 3) {
            super.field4451 = this.method17((byte) -4);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I", line = 156)
    public final int method19(int arg0, int arg1) {
        ++field6246;
        if (class709.method3975(arg0, 94)) {
            if (super.field4450.field6521.method2558(5) && !class18.method113(-3, super.field4450.field6521.method2556(false))) {
                return 3;
            }
            if (super.field4450.field6549.method290(false) == 1) {
                return 3;
            }
        }
        if (arg1 <= 10) {
            method2646(8, -33);
        }
        if (arg0 == 3) {
            return 3;
        } else {
            return class709.method3975(arg0, 110) ? 2 : 1;
        }
    }
}
