import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class587 {

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lkaa;")
    public static class47 field7673 = new class47(83, 0);

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
    public static void method3208(boolean arg0) {
        if (!arg0) {
            field7673 = null;
        }
        field7673 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)V")
    public static final void method3209(int arg0, int arg1) {
        field7671++;
        if (arg0 < 23) {
            field7673 = null;
        }
        class459.field6277 = arg1;
        class96.field1190.method561((byte) -78);
    }
}
