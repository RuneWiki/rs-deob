import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class258 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
    public static int[] field3754 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3755 = "flash1:";

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3756 = "wave2:";

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "F")
    public static float field3753;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lfh;")
    public static class140 field3751;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 9)
    public static void method1789(int arg0) {
        field3755 = null;
        field3756 = null;
        field3751 = null;
        if (arg0 == -23477) {
            field3754 = null;
        }
    }
}
