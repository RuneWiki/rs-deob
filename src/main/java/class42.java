import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class42 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field690 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[Lwa;")
    public static class139[] field691 = new class139[27];

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lr;")
    public static class66 field692 = null;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[Z")
    public static boolean[] field693 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lmk;")
    public static final class127 method274(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        return var3 == null ? null : var3.field212;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method275(int arg0) {
        field691 = null;
        field692 = null;
        int var1 = 75 % ((-arg0 - 57) / 44);
        field693 = null;
    }
}
