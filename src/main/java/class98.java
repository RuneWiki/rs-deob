import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class98 {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lai;")
    private static class10 field1809 = class44.method278("flash3:", -80);

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lai;")
    public static class10 field1802 = field1809;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lai;")
    public static class10 field1805 = field1809;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lai;")
    private static class10 field1808 = class44.method278("wave2:", -123);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lai;")
    public static class10 field1798 = field1808;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "[Z")
    public static boolean[] field1810 = new boolean[100];

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "[[I")
    public static int[][] field1804 = new int[104][104];

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lai;")
    public static class10 field1806 = class44.method278(" )2> <col=00ffff>", -32);

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field1812 = 0;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Z")
    public static boolean field1813 = false;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Lai;")
    public static class10 field1816 = field1808;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Ldb;")
    public static class32 field1803 = new class32(4096);

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "Lcf;")
    public static class27 field1819 = new class27();

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method644(int arg0) {
        field1803 = null;
        field1806 = null;
        field1809 = null;
        field1804 = null;
        field1798 = null;
        if (arg0 != 0) {
            method645(-102, -112, -65);
        }
        field1808 = null;
        field1802 = null;
        field1819 = null;
        field1805 = null;
        field1816 = null;
        field1810 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    public static final void method645(int arg0, int arg1, int arg2) {
        field1815++;
        if (class93.field1688 != arg2 && arg0 != -1) {
            class205.method1323(class93.field1688, arg2 + 10000, class200.field3892, false, arg0, 0);
            class61.field1040 = true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class98() {
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lkg;)V")
    public class98(class98 arg0) {
        this.field1801 = arg0.field1801;
        this.field1807 = arg0.field1807;
        this.field1817 = arg0.field1817;
        this.field1814 = arg0.field1814;
    }
}
