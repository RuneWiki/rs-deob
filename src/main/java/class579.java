import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class579 {

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "Liea;")
    public static class12 field7334 = new class12();

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "Lvba;")
    public static class765 field7335;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lwm;Leka;Lwm;ILwm;Lnr;)Z", line = 3)
    public static final boolean method3105(class30 arg0, class654 arg1, class30 arg2, int arg3, class30 arg4, class161 arg5) {
        class106.field1439 = arg4;
        class176.field2318 = new int[arg3];
        class318.field3965 = arg2;
        field7333++;
        class41.field472 = arg0;
        class687.field8841 = arg1;
        class366.field4469 = arg5;
        for (int var6 = 0; var6 < 16; var6++) {
            class176.field2318[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)V", line = 32)
    public static void method3106(int arg0) {
        if (arg0 < 37) {
            field7334 = null;
        }
        field7334 = null;
        field7335 = null;
    }
}
