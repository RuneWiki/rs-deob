import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class55 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lkfa;")
    public static class549 field566 = new class549(63, 2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method271(int arg0) {
        if (class32.field358 != null) {
            class32.field358.method721(false);
        }
        field565++;
        if (class600.field8522 != null) {
            class600.field8522.method721(false);
        }
        if (arg0 != -26890) {
            method272(-114);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static void method272(int arg0) {
        field566 = null;
        if (arg0 != -21675) {
            field566 = null;
        }
    }
}
