import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class115 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field1833 = -1;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lka;")
    public static class473 field1831 = new class473(8);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field1832;

    static {
        new class157("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)I", line = 6)
    public final int method860(boolean arg0) {
        if (!arg0) {
            this.toString();
        }
        field1832++;
        return this.field1834;
    }

    @OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;", line = 21)
    public final String toString() {
        field1829++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V", line = 34)
    public static final void method861(boolean arg0) {
        class473.field6842 = null;
        field1830++;
        class271.field3670 = null;
        if (arg0) {
            method861(false);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 53)
    public class115(String arg0, int arg1) {
        this.field1834 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 63)
    public static void method862(int arg0) {
        if (arg0 != -1) {
            field1831 = null;
        }
        field1831 = null;
    }
}
