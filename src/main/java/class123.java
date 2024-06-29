import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class123 {

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "Lig;")
    public static class206 field1535 = new class206(54, 20);

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
    public static int field1537 = 0;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "Lig;")
    public static class206 field1536 = new class206(99, 6);

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
    public static int field1539 = -2;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "J")
    public static long field1538;

    @OriginalMember(owner = "client!fea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1534++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
    public static void method759(int arg0) {
        field1536 = null;
        field1535 = null;
        if (arg0 < 16) {
            field1538 = 27L;
        }
    }
}
