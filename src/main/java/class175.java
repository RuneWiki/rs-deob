import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class175 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lg;")
    public static class276 field3040 = new class276(128);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public static int method1248(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method1249(boolean arg0) {
        field3040 = null;
        if (!arg0) {
            field3040 = null;
        }
    }
}
