import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class546 {

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "Lcb;")
    public static class631 field7806 = new class631(16, 11);

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public static int field7807 = -1;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "[[I")
    public static int[][] field7808 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field7809 = new String[100];

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "[I")
    public static int[] field7810 = new int[3];

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)V")
    public static void method3199(boolean arg0) {
        if (arg0) {
            method3199(true);
        }
        field7809 = null;
        field7810 = null;
        field7806 = null;
        field7808 = null;
    }
}
