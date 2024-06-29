import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class300 {

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "Lwo;")
    public static class690 field4036 = new class690(97, 28);

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field4039 = 2;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
    public static int field4041 = 0;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1784(boolean arg0) {
        field4036 = null;
        if (arg0) {
            field4036 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BI)Lie;", line = 19)
    public static final class6 method1785(byte arg0, int arg1) {
        field4037++;
        if (arg0 != 47) {
            method1785((byte) 74, 36);
        }
        return arg1 >= 0 && arg1 < 100 ? class265.field3643[arg1] : null;
    }
}
