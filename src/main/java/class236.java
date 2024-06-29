import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class236 {

    @OriginalMember(owner = "client!es", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3121 = new String[100];

    @OriginalMember(owner = "client!es", name = "a", descriptor = "Z")
    public static boolean field3120 = false;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3123 = 1;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Lh;")
    public static class434 field3122 = new class434(54, 12);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 11)
    public static void method1313(int arg0) {
        if (arg0 != 54) {
            field3121 = null;
        }
        field3122 = null;
        field3121 = null;
    }
}
