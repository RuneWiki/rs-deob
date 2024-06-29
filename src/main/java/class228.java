import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class228 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lid;")
    private static class149 field3991 = class60.method382("Loading title screen )2 ", (byte) 31);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[Lke;")
    public static class108[] field3989 = new class108[4];

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lid;")
    public static class149 field3993 = field3991;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lid;")
    private static class149 field3995 = class60.method382("Loading textures )2 ", (byte) 42);

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lid;")
    public static class149 field3994 = field3995;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3988 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
    public static boolean field3987;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[[[B")
    public static byte[][][] field3992;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method1527(int arg0) {
        field3991 = null;
        if (arg0 != 26513) {
            field3994 = null;
        }
        field3989 = null;
        field3993 = null;
        field3992 = null;
        field3994 = null;
        field3995 = null;
        field3988 = null;
    }
}
