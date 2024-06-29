import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class265 extends class452 {

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "[I")
    public static int[] field4069 = new int[4];

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "[[Z")
    public static boolean[][] field4070;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1767(byte arg0) {
        field4070 = null;
        if (arg0 < -99) {
            field4069 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1768(int arg0, byte arg1, int arg2) {
        if (arg1 == -79) {
            field4071++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lbn;")
    public static final class310 method1769(byte arg0) {
        field4067++;
        try {
            if (arg0 != -27) {
                method1767((byte) -115);
            }
            return (class310) Class.forName("wa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
