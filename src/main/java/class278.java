import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class278 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lwi;")
    public static class340 field3847 = new class340(6, 0, 4, 2);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[I")
    public static int[] field3848 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)I", line = 8)
    public static final int method1758(int arg0, int arg1, int arg2, int arg3) {
        field3846++;
        int var4 = 115 / ((-arg3 - 4) / 60);
        if (arg1 <= arg2) {
            return arg0 >= arg2 ? arg2 : arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 29)
    public static void method1759(boolean arg0) {
        field3848 = null;
        if (arg0) {
            method1759(false);
        }
        field3847 = null;
    }
}
