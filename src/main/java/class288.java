import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class288 {

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Lmq;")
    public static class78 field3663 = new class78(20, 8);

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "[J")
    public static long[] field3664 = new long[10];

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "Lmq;")
    public static class78 field3665 = new class78(69, 3);

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "[I")
    public static int[] field3668 = new int[14];

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field3669 = 0;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method1726(int arg0, int arg1) {
        field3666++;
        if (arg0 != 31685) {
            method1727(-71);
        }
        return arg1 == 2 || arg1 == 3;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 15)
    public static void method1727(int arg0) {
        field3665 = null;
        field3668 = null;
        field3664 = null;
        if (arg0 < 68) {
            field3663 = null;
        }
        field3663 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIBIIIIIIII)V", line = 40)
    public static final void method1728(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3667++;
        if (!class666.method3606(90, arg0) || arg3 <= 125) {
            return;
        }
        if (class238.field3072[arg0] == null) {
            client.method709(class323.field4125[arg0], -1, arg1, arg4, arg11, arg7, arg10, arg9, arg6, arg5, arg2, arg8);
        } else {
            client.method709(class238.field3072[arg0], -1, arg1, arg4, arg11, arg7, arg10, arg9, arg6, arg5, arg2, arg8);
        }
    }
}
