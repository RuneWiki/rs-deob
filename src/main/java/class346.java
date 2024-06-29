import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class346 extends class115 {

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field5334 = 0;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)Z", line = 12)
    public static final boolean method2099(byte arg0, int arg1, int arg2) {
        if (arg0 < 89) {
            return false;
        } else {
            field5333++;
            return class330.method2043(arg2, true, arg1) || class465.method2699(arg2, arg1, -103);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)V", line = 28)
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 > -117) {
            return;
        }
        field5332++;
        if (class297.field4427 <= (arg3 - arg4) && (arg3 + arg4) <= class102.field1544 && (arg0 - arg4) >= class305.field4555 && class286.field4290 >= arg0 + arg4) {
            class170.method1177(arg5, arg3, arg4, arg6, arg0, 2, arg1);
        } else {
            class188.method1264(-1, arg0, arg1, arg5, arg4, arg6, arg3);
        }
    }
}
