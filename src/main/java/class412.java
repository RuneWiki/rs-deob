import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class412 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field5621 = 0;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
    public static int[] field5620;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IC)Z", line = 3)
    public static final boolean method2524(int arg0, char arg1) {
        field5622++;
        if (arg0 != 48) {
            field5621 = -6;
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 23)
    public static void method2525(boolean arg0) {
        field5620 = null;
        if (arg0) {
            method2525(false);
        }
    }
}
