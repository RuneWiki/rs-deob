import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class514 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "Lqt;")
    public static class459 field7464 = new class459(42, 4);

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Lqt;")
    public static class459 field7466 = new class459(57, 8);

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Lnf;")
    public static class414 field7468;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIBII)V", line = 14)
    public static final void method3002(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field7465++;
        if (arg2 == arg5) {
            class462.method2739(arg4, arg1, arg0, 0, arg5);
            return;
        }
        if (arg3 != 93) {
            method3002(-45, 77, -104, (byte) 66, 100, 20);
        }
        if (class465.field6763 <= (arg0 - arg5) && arg0 + arg5 <= class176.field2630 && class424.field5996 <= (arg4 - arg2) && arg2 + arg4 <= class333.field4936) {
            class418.method2494(arg0, arg1, (byte) -105, arg4, arg2, arg5);
        } else {
            class440.method2585((byte) -42, arg1, arg4, arg0, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)Z", line = 38)
    public static final boolean method3003(byte arg0, int arg1, int arg2) {
        if (arg0 >= -97) {
            return false;
        } else {
            field7467++;
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 50)
    public static void method3004(int arg0) {
        field7468 = null;
        field7464 = null;
        if (arg0 > -13) {
            method3004(45);
        }
        field7466 = null;
    }
}
