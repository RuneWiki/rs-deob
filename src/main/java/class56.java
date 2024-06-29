import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class56 extends Exception {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Leba;")
    public static class550 field727 = new class550(81, 0);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lga;")
    public static class332 field728;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method329(int arg0) {
        if (arg0 == 0) {
            field727 = null;
            field728 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
    public static final int method330(int arg0, int arg1) {
        return class400.field5303 == null ? 0 : class400.field5303[arg0][arg1] & 0xFFFF;
    }
}
