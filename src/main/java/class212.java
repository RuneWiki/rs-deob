import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class212 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[S")
    public static short[] field2970 = new short[] { 40, 51, 36, 7, 23, 46, 57, 20 };

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2974 = null;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2975 = "Loaded defaults";

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2971 = "Loading defaults - ";

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2969;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field2975 = null;
        field2969 = null;
        if (arg0 == 40) {
            field2970 = null;
            field2971 = null;
            field2974 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILbc;II)[Lwj;")
    public static final class130[] method1339(int arg0, class282 arg1, int arg2, int arg3) {
        field2973++;
        if (arg0 == 57) {
            return class282.method1875(arg1, arg2, 0, arg3) ? class14.method87(true) : null;
        } else {
            return null;
        }
    }
}
