import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class9 extends class416 {

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "Lgo;")
    public class628 field163;

    @OriginalMember(owner = "client!hba", name = "y", descriptor = "Lht;")
    public static class582 field164 = new class582(13, 3);

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!hba", name = "A", descriptor = "Lee;")
    public static class677 field166;

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lgo;)V")
    public class9(class628 arg0) {
        this.field163 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public static void method96(int arg0) {
        field164 = null;
        if (arg0 == 3006) {
            field166 = null;
        }
    }
}
