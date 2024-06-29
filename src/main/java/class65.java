import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class65 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field1021 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lve;")
    public static class233 field1024;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method448(int arg0) {
        field1024 = null;
        if (arg0 > -82) {
            field1021 = -92;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static final void method449(int arg0) {
        field1022++;
        class181.field2596.method260(0);
        if (arg0 != 1) {
            method448(-78);
        }
    }
}
