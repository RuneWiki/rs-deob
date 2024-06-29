import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class645 extends class322 {

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field8833 = 0;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)I")
    public final int method3560(boolean arg0) {
        if (arg0) {
            field8833 = -44;
        }
        ++field8829;
        return super.field4451;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
    public static final void method3561(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field8834;
        int var5 = 106 / ((arg2 - -37) / 55);
        class101.method728(arg3, (String) null, false, arg4, arg1, true, arg0);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(B)Z")
    public final boolean method3562(byte arg0) {
        if (arg0 != -53) {
            field8833 = -93;
        }
        ++field8830;
        return class416.method2555(super.field4450.field6521.method2556(false), false);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)I")
    public static final int method3563(int arg0) {
        ++field8827;
        byte var2;
        if (~class698.field9627 <= -97) {
            int var1 = class675.method3740(-79);
            if (var1 > 100) {
                if (var1 > 500) {
                    if (var1 <= 1000) {
                        class493.method2941(arg0 + -65539);
                        var2 = 2;
                    } else {
                        class546.method3170(54, true);
                        var2 = 1;
                    }
                } else {
                    class262.method1713(arg0 + -2);
                    var2 = 3;
                }
            } else {
                var2 = 4;
                class643.method3555(arg0 ^ -4);
            }
        } else {
            var2 = 1;
            class546.method3170(116, true);
        }
        if (~class557.field7812.field6521.method2556(false) != -1) {
            class557.field7812.method2755(249682952, 0, class557.field7812.field6555);
            class759.method4212(false, arg0 + -3, 0);
        }
        if (arg0 != 3) {
            method3561((String) null, false, -105, 52, -76);
        }
        class90.method681(10343);
        return var2;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field8831;
        if (arg0 != 0) {
            field8833 = -92;
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lch;)V")
    public class645(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field8835;
        int var2 = -44 / ((70 - arg0) / 51);
        return 0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (arg0) {
            field8833 = 57;
        }
        ++field8832;
        if (super.field4450.field6521.method2558(5) && !class416.method2555(super.field4450.field6521.method2556(false), false)) {
            super.field4451 = 0;
        }
        if (super.field4451 < 0 || ~super.field4451 < -3) {
            super.field4451 = this.method17((byte) -33);
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(ILch;)V")
    public class645(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        if (arg1 <= 10) {
            field8833 = -110;
        }
        ++field8828;
        return !class416.method2555(super.field4450.field6521.method2556(false), false) ? 3 : 1;
    }
}
