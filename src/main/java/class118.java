import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class118 extends class61 {

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field2109 = 0;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public static int field2110 = 0;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "[I")
    public static int[] field2106;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBIIIII)V")
    public static final void method943(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class78.field1404 <= arg5 - arg3 && (arg3 + arg5) <= class42.field769 && class15.field345 <= (arg0 - arg3) && class259.field4587 >= (arg0 + arg3)) {
            class252.method1780(arg4, arg6, arg5, -1, arg3, arg2, arg0);
        } else {
            class145.method1107(arg2, arg3, arg4, arg0, false, arg6, arg5);
        }
        if (arg1 != -78) {
            field2109 = -47;
        }
        field2108++;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method944(int arg0) {
        field2106 = null;
        if (arg0 != 0) {
            field2106 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V")
    public class118(int arg0, int arg1) {
        this.field2107 = arg0;
        this.field2111 = arg1;
    }
}
