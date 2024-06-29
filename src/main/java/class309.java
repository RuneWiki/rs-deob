import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class309 extends class86 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "J")
    public static volatile long field3866 = 0L;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "[I")
    public static int[] field3868;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lsf;)V", line = 4)
    public class309(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method1819(boolean arg0) {
        ++field3870;
        if (!arg0) {
            class62.method368(-1, (byte) 75, 255);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Z", line = 25)
    public final boolean method1820(byte arg0) {
        if (arg0 >= -47) {
            return true;
        } else {
            ++field3876;
            return class778.method4262(super.field1200, 111);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 37)
    public final void method71(byte arg0) {
        if (this.method1820((byte) -119)) {
            if (super.field1203.field6949.method2400(-25176) && !class161.method1025(super.field1203.field6949.method2402(false), arg0 ^ 14959)) {
                super.field1200 = 1;
            }
            if (super.field1203.field6917.method643(false) == 1) {
                super.field1200 = 1;
            }
        }
        ++field3869;
        if (super.field1200 == 3) {
            super.field1200 = 2;
        }
        if (arg0 == -65) {
            if (~super.field1200 > -1 || ~super.field1200 < -4) {
                super.field1200 = this.method73(0);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I", line = 66)
    public final int method72(int arg0, int arg1) {
        ++field3873;
        if (class778.method4262(arg0, arg1 ^ -125)) {
            if (super.field1203.field6949.method2400(-25176) && !class161.method1025(super.field1203.field6949.method2402(false), -14896)) {
                return 3;
            }
            if (super.field1203.field6917.method643(false) == 1) {
                return 3;
            }
        }
        if (arg0 == 3) {
            return 3;
        } else if (class778.method4262(arg0, -116)) {
            return 2;
        } else {
            return arg1 != -2 ? 65 : 1;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)I", line = 96)
    public final int method1821(boolean arg0) {
        ++field3867;
        if (arg0) {
            field3866 = 79L;
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)I", line = 108)
    public final int method73(int arg0) {
        ++field3874;
        if (arg0 != 0) {
            field3866 = 17L;
        }
        return 0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V", line = 120)
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        if (arg1) {
            field3875 = 73;
        }
        ++field3871;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(ILsf;)V", line = 132)
    public class309(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)Z", line = 137)
    public final boolean method1822(int arg0) {
        ++field3872;
        int var2 = 46 % ((-57 - arg0) / 57);
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 151)
    public static void method1823(byte arg0) {
        field3868 = null;
        if (arg0 > -126) {
            field3866 = 103L;
        }
    }
}
