import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class332 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lkr;")
    public static class602 field4705 = new class602(46, 6);

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field4708 = -2;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "J")
    public static long field4706;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lqea;")
    public static class339 field4707;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljo;Z)Z", line = 5)
    public static final boolean method2125(class21 arg0, boolean arg1) {
        field4704++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field221) {
            return false;
        } else if (arg0.method109(false, class461.field6380)) {
            if (!arg1) {
                method2125(null, false);
            }
            if (class676.field9376.method812(125, (long) arg0.field245) == null) {
                return class561.field7801.method812(124, (long) arg0.field235) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIBIIII)V", line = 35)
    public static final void method2126(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4703++;
        if (arg1 == arg4) {
            class240.method1619(arg5, arg7, (byte) 127, arg0, arg2, arg6, arg1);
            return;
        }
        if (class607.field8185 <= (arg6 - arg1) && class726.field10064 >= arg1 + arg6 && class291.field4181 <= (arg2 - arg4) && class262.field3848 >= arg2 + arg4) {
            class404.method2535(arg4, arg2, arg7, arg5, (byte) 123, arg6, arg0, arg1);
        } else {
            class264.method1811(arg6, arg5, arg4, arg7, arg2, 115, arg1, arg0);
        }
        if (arg3 != 77) {
            field4706 = -63L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 65)
    public static void method2127(byte arg0) {
        field4707 = null;
        field4705 = null;
        if (arg0 >= -31) {
            field4706 = -5L;
        }
    }
}
