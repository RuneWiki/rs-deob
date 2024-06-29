import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class427 {

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "Ltn;")
    public static class58 field6247 = null;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "Lhh;")
    public static class84 field6244;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static void method2607(int arg0) {
        field6247 = null;
        field6244 = null;
        if (arg0 != 18545) {
            field6244 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)Z")
    public static final boolean method2608(int arg0, int arg1, int arg2) {
        field6245++;
        if (arg2 != 27466) {
            field6247 = null;
        }
        return class97.method769(arg0, arg1, (byte) 87) & class390.method2445(arg1, -5, arg0);
    }
}
