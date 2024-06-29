import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class275 implements class637 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lns;")
    public static class406 field3677 = new class406();

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
    public static int[] field3679 = new int[14];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "D")
    public static double field3675;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lhda;")
    public final class750 method333(int arg0) {
        if (arg0 != 30778) {
            field3677 = null;
        }
        field3678++;
        return class51.field535;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static void method1643(boolean arg0) {
        field3677 = null;
        field3679 = null;
        if (!arg0) {
            method1643(false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class275(int arg0) {
        this.field3676 = arg0;
    }
}
