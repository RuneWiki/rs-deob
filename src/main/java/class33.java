import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class33 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Ljava/lang/String;")
    public static String field526 = "";

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
    public static int[] field527 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lbc;")
    public static class178 field528 = new class178(0, 0);

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lta;")
    public static class262 field532 = new class262(64);

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lti;")
    public static class5 field531;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method264(int arg0) {
        field531 = null;
        field527 = null;
        field528 = null;
        field526 = null;
        field532 = null;
        if (arg0 < 36) {
            method263(-47, 94, 57, -79, 56, -12, -4, -111);
        }
    }
}
