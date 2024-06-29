import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class36 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "J")
    public static long field550 = -1L;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field551 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field549 = new String[100];

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lfw;")
    public class337 field552;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[Lya;")
    public static class11[] field554;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method262(int arg0) {
        field551 = null;
        if (arg0 != 27846) {
            field550 = 0L;
        }
        field549 = null;
        field554 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
    public static final int method263(int arg0) {
        field548++;
        if ((double) class472.field6810 == 3.0D) {
            return 37;
        }
        if (arg0 != 15737) {
            field551 = null;
        }
        if ((double) class472.field6810 == 4.0D) {
            return 50;
        } else if ((double) class472.field6810 == 6.0D) {
            return 75;
        } else if ((double) class472.field6810 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
