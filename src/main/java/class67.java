import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class67 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
    public static int[] field791 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method412(int arg0) {
        field791 = null;
        if (arg0 != 0) {
            method412(66);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)V")
    public static final void method413(byte arg0, int arg1) {
        class59.field703.method62(-53, arg1);
        class227.field3199.method62(-61, arg1);
        if (arg0 <= 56) {
            field792 = -79;
        }
        field793++;
        class110.field1471.method62(-55, arg1);
        class118.field1667.method62(-72, arg1);
    }
}
