import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class686 {

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "Lqe;")
    public static class469 field9484 = new class469(108, -2);

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "[I")
    public static int[] field9486 = new int[200];

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "Lcda;")
    public static class172 field9488 = new class172("WIP", 2);

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static void method3907(int arg0) {
        field9484 = null;
        if (arg0 != -6089) {
            method3907(-105);
        }
        field9486 = null;
        field9488 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)I")
    public static final int method3908(boolean arg0, int arg1) {
        if (arg0) {
            field9488 = null;
        }
        field9487++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)V")
    public static final void method3909(int arg0, boolean arg1) {
        field9485++;
        if (class241.field3505.length() == 0) {
            return;
        }
        class533.method3136(121, "--> " + class241.field3505);
        class284.method1822(arg1, false, 29061, class241.field3505);
        class37.field379 = 0;
        if (arg0 < 35) {
            method3909(17, true);
        }
        class753.field10517 = 0;
        class241.field3505 = "";
    }
}
