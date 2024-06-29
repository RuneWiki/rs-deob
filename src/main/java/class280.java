import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class280 {

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3725 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "[I")
    public static int[] field3724;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static void method1679(int arg0) {
        field3725 = null;
        if (arg0 >= -121) {
            field3725 = null;
        }
        field3724 = null;
    }
}
