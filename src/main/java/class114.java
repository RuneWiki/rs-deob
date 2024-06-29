import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class114 extends class190 {

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Z")
    public boolean field1859 = false;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Lqe;")
    public static class168 field1860 = class66.method448("hint_mapedge", 74);

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lqe;")
    private static class168 field1862 = class66.method448("flash2:", -112);

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Lqe;")
    public static class168 field1856 = field1862;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lqe;")
    public static class168 field1865 = field1862;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "Lwc;")
    public static class232 field1858 = new class232(64);

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public int field1857;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Lpc;")
    public static class202 field1866;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Loe;")
    public static class256 field1867;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Loe;Z)Z")
    public static final boolean method785(class256 arg0, boolean arg1) {
        if (arg1) {
            method787(-87);
        }
        field1863++;
        return arg0.method1692(class96.field1518, 0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLoe;)Lgd;")
    public static final class65 method786(int arg0, byte arg1, class256 arg2) {
        field1855++;
        if (arg1 != -2) {
            method785(null, true);
        }
        return class105.method697(false, arg0, arg2) ? class198.method1274(0) : null;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method787(int arg0) {
        if (arg0 != -18789) {
            return;
        }
        field1867 = null;
        field1865 = null;
        field1856 = null;
        field1862 = null;
        field1866 = null;
        field1860 = null;
        field1858 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
    public static final void method788(int arg0, int arg1, int arg2, int arg3) {
        if (class62.field847 != 0 && arg0 != 0 && class95.field1502 < 50 && arg2 != -1) {
            class221.field3799[class95.field1502] = arg2;
            class64.field878[class95.field1502] = arg0;
            class101.field1596[class95.field1502] = arg1;
            class152.field2642[class95.field1502] = null;
            class237.field4056[class95.field1502] = 0;
            class95.field1502++;
        }
        if (arg3 < 95) {
            method787(105);
        }
        field1861++;
    }
}
