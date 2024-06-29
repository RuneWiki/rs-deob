import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class4 extends class190 {

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field43 = -1;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Lqe;")
    public static class168 field42 = class66.method448("<col=ffb000>", -120);

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lqe;")
    public static class168 field44 = class66.method448("::gc", -128);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Lqe;")
    public static class168 field46 = class66.method448("mem=", -119);

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Lqe;")
    public static class168 field50 = class66.method448("Lade Titelbild )2 ", 35);

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lqe;")
    public static class168 field53 = class66.method448("leuchten2:", 17);

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Lqe;")
    private static class168 field45 = class66.method448("Loading wordpack )2 ", -116);

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Lqe;")
    public static class168 field48 = field45;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "Lqe;")
    public class168 field52;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[Lqe;")
    public class168[] field49;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public static void method24(boolean arg0) {
        if (arg0) {
            return;
        }
        field44 = null;
        field50 = null;
        field48 = null;
        field45 = null;
        field42 = null;
        field46 = null;
        field53 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)V")
    public static final void method25(boolean arg0, int arg1) {
        field41++;
        int var2 = 91 / ((arg1 - 71) / 46);
        class81.method541(class42.field551, arg0, class137.field2426, -1, class223.field3837);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Loe;ZLoe;)I")
    public static final int method26(class256 arg0, boolean arg1, class256 arg2) {
        field56++;
        int var3 = 0;
        if (arg2.method1692(class251.field4347, 0)) {
            var3++;
        }
        if (arg2.method1692(class253.field4373, 0)) {
            var3++;
        }
        if (arg2.method1692(class143.field2517, 0)) {
            var3++;
        }
        if (arg0.method1692(class251.field4347, 0)) {
            var3++;
        }
        if (arg1) {
            return 87;
        }
        if (arg0.method1692(class253.field4373, 0)) {
            var3++;
        }
        if (arg0.method1692(class143.field2517, 0)) {
            var3++;
        }
        return var3;
    }
}
