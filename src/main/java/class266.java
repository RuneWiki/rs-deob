import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class266 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIZIIII)V", line = 6)
    public static final void method1634(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3764++;
        for (class154 var7 = (class154) class238.field3325.method242(arg2); var7 != null; var7 = (class154) class238.field3325.method244((byte) -73)) {
            if (var7.field1968 <= class263.field3748) {
                var7.method1435(true);
            } else {
                class319.method1924((var7.field1971 << 7) + 64, false, arg4 >> 1, arg6 >> 1, arg5, var7.field1974, arg1, var7.field1969 * 2, (var7.field1976 << 7) + 64);
                class458.field6676.method2107(class447.field6506[0] + arg0, var7.field1970, class447.field6506[1] + arg3, var7.field1977 | 0xFF000000, -14014, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lqp;Lqp;IZIZI)I", line = 31)
    public static final int method1635(class450 arg0, class450 arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field3765++;
        int var7 = class501.method3017((byte) -100, arg1, arg0, arg2, arg3);
        if (var7 == 0) {
            if (arg4 != -16777216) {
                method1636(true, null);
            }
            if (arg6 == -1) {
                return 0;
            } else {
                int var8 = class501.method3017((byte) -67, arg1, arg0, arg6, arg5);
                return arg5 ? -var8 : var8;
            }
        } else if (arg3) {
            return -var7;
        } else {
            return var7;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLeq;)V", line = 63)
    public static final void method1636(boolean arg0, class134 arg1) {
        if (!arg0) {
            return;
        }
        if (class174.field2387) {
            class442.method2584(arg1, false);
        } else {
            class416.method2470(arg1, 17178);
        }
        field3766++;
    }
}
