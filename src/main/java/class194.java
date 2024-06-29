import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class194 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lcg;")
    public static class48 field3107;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[I")
    public static int[] field3108;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method1371(byte arg0) {
        field3107 = null;
        int var1 = 32 % ((-arg0 - 75) / 46);
        field3108 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3110++;
        if (arg2 >= class116.field1653 && arg4 <= class114.field1634 && class117.field1656 <= arg6 && class132.field2105 >= arg0) {
            if (arg5 == 1) {
                class148.method1019(arg3, arg6, arg2, arg0, arg4, (byte) -78);
            } else {
                class253.method1735(arg5, arg3, arg4, 127, arg6, arg0, arg2);
            }
        } else if (arg5 == 1) {
            class119.method766(arg3, arg4, 1, arg2, arg0, arg6);
        } else {
            class191.method1323(arg3, arg6, arg0, arg5, 256, arg2, arg4);
        }
        if (arg1 <= 75) {
            method1371((byte) 69);
        }
    }
}
