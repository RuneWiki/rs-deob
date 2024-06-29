import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class218 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[[Z")
    public static boolean[][] field3656 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field3663 = 0;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field3664 = -1;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lce;")
    public static class126 field3666 = class206.method1445(-7923, "Abbrechen");

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Lce;")
    public static class126 field3665 = class206.method1445(-7923, "Nehmen");

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lvj;")
    public static class184 field3662;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ljk;")
    public static class273 field3658;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "[I")
    public static int[] field3659;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Lbb;", line = 7)
    public static final class134 method1494(int arg0) {
        field3660++;
        class134 var1 = new class134(34);
        var1.method933(-3, 11);
        var1.method933(arg0 ^ 0xFFFF821C, class287.field4776);
        var1.method933(arg0 - 32228, class91.field1424 ? 1 : 0);
        var1.method933(arg0 - 32228, class301.field5016 ? 1 : 0);
        var1.method933(-3, class44.field677 ? 1 : 0);
        var1.method933(-3, class214.field3644 ? 1 : 0);
        var1.method933(-3, class94.field1474 ? 1 : 0);
        var1.method933(-3, class74.field1200 ? 1 : 0);
        var1.method933(-3, class44.field684 ? 1 : 0);
        var1.method933(-3, class32.field472 ? 1 : 0);
        var1.method933(-3, class55.field836);
        var1.method933(-3, class249.field4166 ? 1 : 0);
        var1.method933(-3, class40.field640 ? 1 : 0);
        var1.method933(-3, class13.field172 ? 1 : 0);
        var1.method933(-3, class226.field3814);
        var1.method933(-3, class280.field4660 ? 1 : 0);
        var1.method933(-3, class69.field1144);
        var1.method933(arg0 ^ 0xFFFF821C, class159.field2866);
        var1.method933(-3, class205.field3523);
        if (arg0 != 32225) {
            field3659 = (int[]) null;
        }
        var1.method959(arg0 - 32196, class95.field1503);
        var1.method959(85, class212.field3613);
        var1.method933(arg0 ^ 0xFFFF821C, class211.method1473());
        var1.method947(class143.field2607, (byte) 118);
        var1.method933(-3, class189.field3242);
        var1.method933(-3, class228.field3846 ? 1 : 0);
        var1.method933(-3, class68.field1121 ? 1 : 0);
        var1.method933(arg0 - 32228, class71.field1163);
        var1.method933(-3, class267.field4534 ? 1 : 0);
        var1.method933(-3, class297.field4942 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 53)
    public static void method1495(int arg0) {
        field3665 = null;
        field3659 = null;
        field3658 = null;
        field3656 = (boolean[][]) null;
        field3666 = null;
        field3662 = null;
        if (arg0 != 1) {
            field3666 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)V", line = 69)
    public static final void method1496(byte arg0, int arg1, int arg2) {
        class245 var3 = class139.method1022(7, (byte) -118, arg1);
        field3661++;
        var3.method1683(0);
        var3.field4154 = arg2;
        if (arg0 != 29) {
            field3664 = 9;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V", line = 92)
    public static final void method1497(boolean arg0, int arg1) {
        class100.field1624 = -1;
        class139.field2522 = arg1;
        field3657++;
        class134.field2335 = -1;
        class245.method1686(arg0);
    }
}
