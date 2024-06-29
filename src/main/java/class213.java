import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class213 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3408 = 3;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lcc;")
    public static class216 field3406 = new class216(16);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lek;")
    public static class167 field3411;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Llc;")
    public static class86 field3410;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1543(int arg0) {
        field3410 = null;
        field3411 = null;
        field3406 = null;
        if (arg0 != 0) {
            field3409 = -53;
        }
    }
}
