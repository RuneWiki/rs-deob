import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class566 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field7172 = -1;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "Lwm;")
    public static class30 field7173;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 25)
    public static void method3056(byte arg0) {
        field7173 = null;
        if (arg0 < 103) {
            method3056((byte) 8);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIILwm;Z)V", line = 37)
    public static final void method3057(int arg0, int arg1, int arg2, int arg3, int arg4, class30 arg5, boolean arg6) {
        field7171++;
        int var7 = 111 % ((21 - arg0) / 45);
        if (arg2 <= 0) {
            class636.method3433(arg4, arg5, arg3, 0, arg6, arg1);
            return;
        }
        class483.field6236 = arg4;
        class168.field2234 = null;
        class693.field8903 = 1;
        class745.field10115 = arg3;
        class691.field8879 = arg6;
        class416.field5500 = arg5;
        class540.field6799 = arg1;
        class685.field8831 = class687.field8841.method3575(true) / arg2;
        if (class685.field8831 < 1) {
            class685.field8831 = 1;
        }
    }
}
