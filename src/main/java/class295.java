import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class295 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
    public static int[] field4322 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field4321 = 1;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZIIB)V")
    public static final void method1940(boolean arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        class458.method2755(arg1, arg3, arg2, class254.field3765.length - 1, 0, 1, arg0);
        field4320++;
        class712.field9917 = 0;
        class694.field9682 = null;
        if (arg4 >= -44) {
            method1941((byte) 77);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static void method1941(byte arg0) {
        field4322 = null;
        if (arg0 >= -119) {
            method1940(true, false, 59, -71, (byte) 28);
        }
    }
}
