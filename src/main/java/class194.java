import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class194 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3112 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3111 = null;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3113 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
    public static boolean field3110 = false;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method1386(int arg0, boolean arg1) {
        field3114++;
        if (arg0 < 999999999) {
            return Integer.toString(arg0);
        } else if (arg1) {
            return "*";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1387(int arg0) {
        if (arg0 == 0) {
            field3111 = null;
            field3113 = null;
        }
    }
}
