import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class212 extends class190 {

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lqe;")
    private static class168 field3658 = class66.method448("Take", 67);

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lqe;")
    public static class168 field3661 = class66.method448(" )2> <col=ffffff>", 58);

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lqe;")
    public static class168 field3664 = field3658;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lug;")
    public static class57 field3659 = new class57();

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Lqe;")
    public static class168 field3666 = class66.method448("Bitte entfernen Sie ", 33);

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "J")
    public long field3663;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Lmd;")
    public class212 field3660;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Lmd;")
    public class212 field3662;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Loe;")
    public static class256 field3668;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Lwd;")
    public static class67 field3669;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "[I")
    public static int[] field3667;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public static void method1367(int arg0) {
        field3659 = null;
        field3658 = null;
        field3669 = null;
        field3668 = null;
        if (arg0 != 22908) {
            method1368(true);
        }
        field3661 = null;
        field3664 = null;
        field3667 = null;
        field3666 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)Z")
    public static final boolean method1368(boolean arg0) {
        field3665++;
        if (arg0) {
            method1367(12);
        }
        return class135.field2361 == 0 ? class114.field1866.method1295(82) : true;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    public final void method1369(int arg0) {
        if (arg0 > -119) {
            field3664 = null;
        }
        field3657++;
        if (this.field3662 != null) {
            this.field3662.field3660 = this.field3660;
            this.field3660.field3662 = this.field3662;
            this.field3660 = null;
            this.field3662 = null;
        }
    }
}
