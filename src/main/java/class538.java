import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class538 {

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "[I")
    public static int[] field7818 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "Ldj;")
    public static class703 field7819 = new class703(13, 0, 1, 0);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public static void method3247(int arg0) {
        field7819 = null;
        field7818 = null;
        if (arg0 != -1) {
            field7820 = 121;
        }
    }
}
