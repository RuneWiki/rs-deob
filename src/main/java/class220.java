import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class220 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Z")
    public static boolean field2542 = false;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "[I")
    public static int[] field2541;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZBII)V")
    public static final void method1284(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field2540++;
        if (class650.method3697(arg2 - 45, arg3)) {
            class453.method2785(arg0, arg4, arg1, -1, (byte) -113, class643.field9209[arg3]);
            if (arg2 != 45) {
                method1285((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public static final void method1285(byte arg0) {
        field2543++;
        class210.field2474.method1728(29632);
        if (arg0 != -39) {
            field2541 = null;
        }
        class189.field2242 = 0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1286(int arg0) {
        if (arg0 > -51) {
            field2542 = false;
        }
        field2541 = null;
    }
}
