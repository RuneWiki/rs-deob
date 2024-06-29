import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public abstract class class46 {

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "Lpr;")
    public static class407 field506 = new class407(48, -2);

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "S")
    public static short field508 = 32767;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "Lqi;")
    public static class518 field505;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V", line = 6)
    public static void method222(int arg0) {
        field506 = null;
        field505 = null;
        if (arg0 != 0) {
            field505 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IFIBIFIFFI[F)V")
    public abstract void method223(int arg0, float arg1, int arg2, byte arg3, int arg4, float arg5, int arg6, float arg7, float arg8, int arg9, float[] arg10);
}
