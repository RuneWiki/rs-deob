import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class356 {

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public static int field5068 = 0;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "Lqfa;")
    public static class98 field5070 = new class98(2, -1);

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "Lbga;")
    public class356 field5066;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "Lum;")
    public class524 field5067;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V", line = 6)
    public static void method2288(byte arg0) {
        if (arg0 == 46) {
            field5070 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(CI)Z", line = 17)
    public static final boolean method2289(char arg0, int arg1) {
        field5071++;
        if (arg1 == 1000) {
            return arg0 >= '0' && arg0 <= '9';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZII)Z", line = 28)
    public static final boolean method2290(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field5068 = 64;
        }
        field5069++;
        if (arg1 >= 1000 && arg2 < 1000) {
            return true;
        } else if (arg1 >= 1000 || arg2 >= 1000) {
            return arg1 >= 1000 && arg2 >= 1000;
        } else if (class278.method1820(true, arg1)) {
            return false;
        } else {
            return class278.method1820(!arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)I", line = 59)
    public static final int method2291(int arg0, int arg1) {
        return class414.field5823 == null ? 0 : class414.field5823[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 68)
    public final void method2292(int arg0) {
        field5065++;
        if (~class622.field8667 > arg0) {
            this.field5067 = null;
            this.field5066 = class745.field10349;
            class745.field10349 = this;
            class622.field8667++;
        }
    }
}
