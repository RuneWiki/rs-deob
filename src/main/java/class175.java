import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class175 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lkb;")
    private static class93 field3453 = class76.method390("Username: ", 0);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lkb;")
    public static class93 field3454 = class76.method390("(Udns", 0);

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3455 = 0;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3457 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3452 = 0;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lkb;")
    public static class93 field3459 = field3453;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Log;")
    public static class134 field3458;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public static int[] field3451;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Loc;")
    public static final class130 method1159(int arg0) {
        field3456++;
        try {
            return arg0 >= -90 ? null : (class130) Class.forName("kh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method1160(int arg0) {
        if (arg0 >= -57) {
            return;
        }
        field3453 = null;
        field3451 = null;
        field3458 = null;
        field3454 = null;
        field3459 = null;
    }
}
