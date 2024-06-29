import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class82 extends class270 {

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Lkc;")
    public class44 field1441;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Ldw;")
    public static class403 field1442 = new class403("", 17);

    @OriginalMember(owner = "client!th", name = "A", descriptor = "[I")
    public static int[] field1443 = new int[4096];

    @OriginalMember(owner = "client!th", name = "B", descriptor = "Llo;")
    public static class306 field1444 = new class306("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!th", name = "C", descriptor = "Lqs;")
    public static class496 field1445;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method594(int arg0) {
        field1442 = null;
        field1443 = null;
        if (arg0 == 17) {
            field1445 = null;
            field1444 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lkc;)V")
    public class82(class44 arg0) {
        this.field1441 = arg0;
    }
}
