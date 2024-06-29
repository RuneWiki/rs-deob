import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class206 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
    public static int[] field2997 = new int[1];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lmu;")
    public static class196 field3000;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1435(boolean arg0) {
        field3000 = null;
        if (!arg0) {
            field2997 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1436(int arg0) {
        class324.field4553 = 0;
        class81.field1106 = 0;
        class411.field6104 = 0;
        class127.field1853 = 0;
        field2998++;
        if (arg0 >= -76) {
            field2996 = -52;
        }
    }
}
