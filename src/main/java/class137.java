import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class137 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[Z")
    public static boolean[] field2066 = new boolean[5];

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2067 = 0;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method1018(boolean arg0) {
        field2066 = null;
        if (arg0) {
            method1018(true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method1019(int arg0) {
        class7.field121 = false;
        if (arg0 < 71) {
            field2067 = -82;
        }
        class216.field3315 = -1;
        class278.field4411 = 1;
        class129.field1921 = -3;
        class234.field3691 = 0;
        class216.field3314 = 0;
        field2065++;
        class185.field2916 = 0;
    }
}
