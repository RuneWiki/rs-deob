import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class565 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[Lsca;")
    public static class251[] field7981 = new class251[8];

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field7983 = 503;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method3337(int arg0) {
        field7981 = null;
        if (arg0 != 503) {
            method3337(63);
        }
    }
}
