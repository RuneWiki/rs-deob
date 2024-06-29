import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class257 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
    public static int[] field4473 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field4474 = 0;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4471 = 0;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lue;")
    public static class86 field4470;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1702(int arg0) {
        field4470 = null;
        if (arg0 != -250) {
            method1703(67);
        }
        field4473 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Ldd;")
    public static final class130 method1703(int arg0) {
        field4469++;
        if (arg0 != -3249) {
            method1703(107);
        }
        return class241.field4233 < class214.field3810.length ? class214.field3810[class241.field4233++] : null;
    }
}
