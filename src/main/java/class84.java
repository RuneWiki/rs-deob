import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class84 extends class137 {

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "Ljava/lang/Object;")
    private Object field1604;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "[I")
    public static int[] field1606 = new int[32];

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "Lfa;")
    public static class200 field1608 = new class200(5000);

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "Ljf;")
    public static class229 field1609 = class212.method1457((byte) 60, "hint_headicons");

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "[Z")
    public static boolean[] field1613 = new boolean[112];

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "Z")
    public static boolean field1616 = false;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "Lpm;")
    public static class103 field1615;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "[I")
    public static int[] field1610;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "[Lkb;")
    public static class35[] field1612;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 18)
    public final Object method604(int arg0) {
        if (arg0 <= 11) {
            method607(102, 111);
        }
        field1601++;
        return this.field1604;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)Z", line = 33)
    public final boolean method605(int arg0) {
        if (arg0 != 0) {
            this.method604(28);
        }
        field1607++;
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V", line = 48)
    public static void method606(int arg0) {
        field1615 = null;
        field1606 = null;
        field1613 = null;
        field1608 = null;
        field1610 = null;
        field1609 = null;
        if (arg0 != 32) {
            method607(6, -5);
        }
        field1612 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 62)
    public class84(Object arg0) {
        this.field1604 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)Ljf;", line = 72)
    public static final class229 method607(int arg0, int arg1) {
        int var2 = 121 % ((20 - arg0) / 52);
        field1605++;
        return class288.method2011(10, arg1, 27097, false);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V", line = 86)
    public static final void method608(int arg0, int arg1) {
        field1603++;
        class122 var2 = class323.method2175(12, arg0, -25873);
        var2.method865(-113);
        if (arg1 != -12586) {
            method607(89, 95);
        }
    }
}
