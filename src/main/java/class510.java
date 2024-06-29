import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class510 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "D")
    public static double field7295;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Loia;")
    public static class88 field7297;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[S")
    public static short[] field7298;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3014(int arg0) {
        if (class222.field2897 == arg0) {
            class60.method514(false, 4);
        } else if (class222.field2897 == 7) {
            class60.method514(false, 8);
        } else if (class222.field2897 == 10) {
            class60.method514(false, 11);
        }
        field7296++;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 31)
    public static void method3015(int arg0) {
        if (arg0 == 8) {
            field7297 = null;
            field7298 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method3016(boolean arg0) {
        field7294++;
        class77.field1002.method1175((byte) 91);
        if (!arg0) {
            field7297 = null;
        }
    }
}
