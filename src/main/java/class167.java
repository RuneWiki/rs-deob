import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class167 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "F")
    public static float field2540 = 1.0F;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[I")
    public static int[] field2542 = new int[1000];

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZII)Z", line = 4)
    public static final boolean method1241(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field2541++;
            return (arg2 & 0x70000) != 0 | class219.method1510(79, arg1, arg2) || class692.method3890(arg2, arg1, (byte) 85);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 37)
    public static void method1242(int arg0) {
        field2542 = null;
        if (arg0 != 0) {
            field2540 = -0.9856561F;
        }
    }
}
