import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class249 {

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3718;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "F")
    public static float field3719;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field3720;

    static {
        new class44("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field3718 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 6)
    public static void method1621(int arg0) {
        if (arg0 <= -54) {
            field3718 = null;
        }
    }
}
