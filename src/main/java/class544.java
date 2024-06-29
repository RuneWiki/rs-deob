import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class544 {

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "Lhh;")
    public static class168 field7991 = new class168();

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field7992 = 0;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "[[I")
    public static int[][] field7990;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V", line = 3)
    public static void method3195(byte arg0) {
        field7991 = null;
        if (arg0 >= 97) {
            field7990 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 19)
    public static final void method3196(int arg0) {
        class265.field3806 = new class101[class515.field7631.method2102(true)][];
        field7989++;
        if (arg0 != 0) {
            field7991 = null;
        }
        class700.field9917 = new class101[class515.field7631.method2102(true)][];
        class529.field7803 = new boolean[class515.field7631.method2102(true)];
    }
}
