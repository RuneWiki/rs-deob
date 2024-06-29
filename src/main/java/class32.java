import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class32 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[I")
    public static int[] field441 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
    public static float field439;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lpb;")
    public static class366 field438;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method294(int arg0, boolean arg1) {
        field437++;
        if (arg1) {
            field441 = null;
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZI)V")
    public static final void method295(int arg0, int arg1, boolean arg2, int arg3) {
        field442++;
        String var4 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class170.method1174(var4, arg2, arg2, true);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method296(int arg0) {
        if (arg0 == -9716) {
            field441 = null;
            field438 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBIII)V")
    public static final void method297(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field440++;
        if (arg3 == arg4) {
            class127.method998(108, arg1, arg5, arg0, arg3);
            return;
        }
        int var6 = 113 % ((arg2 - 6) / 36);
        if (arg0 - arg3 >= class183.field2638 && class268.field3911 >= (arg0 + arg3) && arg1 - arg4 >= class222.field3350 && class409.field6071 >= (arg1 + arg4)) {
            class62.method491(126, arg0, arg1, arg4, arg5, arg3);
        } else {
            class325.method2011(arg1, arg4, arg0, arg3, arg5, 4);
        }
    }
}
