import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class430 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public int field6547;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lof;")
    public static class446 field6549 = new class446("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[Z")
    public static boolean[] field6553 = new boolean[100];

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Low;")
    public static class234 field6548;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Laa;")
    public static class341 field6552;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 7)
    public static void method2627(int arg0) {
        if (arg0 != 100) {
            method2628(null, -22);
        }
        field6549 = null;
        field6552 = null;
        field6553 = null;
        field6548 = null;
    }

    @OriginalMember(owner = "client!th", name = "toString", descriptor = "()Ljava/lang/String;", line = 21)
    public final String toString() {
        field6550++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V", line = 28)
    public class430(int arg0, int arg1) {
        this.field6547 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lgm;I)V", line = 45)
    public static final void method2628(class80 arg0, int arg1) {
        field6551++;
        class278.field3943 = arg0;
        if (arg1 > -17) {
            field6553 = null;
        }
    }
}
