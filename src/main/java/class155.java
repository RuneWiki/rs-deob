import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class155 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    public static int[] field2512 = new int[2];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Ljc;")
    public static class356 field2510 = new class356(11, 17);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2513 = -1;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 5)
    public static void method1082(int arg0) {
        field2510 = null;
        field2512 = null;
        if (arg0 != 17) {
            method1082(21);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBZZ)V", line = 20)
    public static final void method1083(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        class289.method1868(0, class441.field6575.length - 1, arg4, -123, arg0, arg1, arg3);
        field2511++;
        if (arg2 != -109) {
            field2512 = null;
        }
        class129.field2223 = 0;
        class516.field7640 = null;
    }
}
