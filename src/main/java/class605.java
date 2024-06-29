import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class605 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lbn;")
    public static class378 field8999 = new class378(9, 7);

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field9001 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lbn;")
    public static class378 field9000 = new class378(13, 7);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method3564(int arg0) {
        if (arg0 == -11732) {
            field8999 = null;
            field9000 = null;
        }
    }
}
