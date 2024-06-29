import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class119 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
    public static int[] field1525 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
    public static int[] field1524;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 4)
    public static void method832(int arg0) {
        field1524 = null;
        if (arg0 != 11337) {
            field1526 = 47;
        }
        field1525 = null;
    }
}
