import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class283 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lbd;")
    public static class162 field4797 = class17.method142(0, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[I")
    public static int[] field4799 = new int[100];

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[S")
    public static short[] field4801 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 4)
    public static void method1961(int arg0) {
        field4797 = null;
        if (arg0 != 960) {
            field4799 = (int[]) null;
        }
        field4801 = null;
        field4799 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lbd;B)Z", line = 17)
    public static final boolean method1962(class162 arg0, byte arg1) {
        field4798++;
        if (arg1 <= 102) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class264.field4403; var2++) {
                if (arg0.method1282(class290.field4891[var2], 55)) {
                    return true;
                }
            }
            if (arg0.method1282(class122.field2215.field611, 119)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
