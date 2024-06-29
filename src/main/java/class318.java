import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class318 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[[I")
    public static int[][] field4598 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ltn;")
    public static class60 field4599 = new class60(4, -1);

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4601 = -1;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Leh;")
    public static class246 field4600 = new class246(70, 6);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1911(boolean arg0) {
        field4598 = null;
        field4600 = null;
        field4599 = null;
        if (!arg0) {
            method1911(true);
        }
    }
}
