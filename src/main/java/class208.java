import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class208 extends class1 {

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "Loc;")
    private static class151 field3662 = class137.method873(2, "Attack");

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "Loc;")
    public static class151 field3669 = class137.method873(2, "settings=");

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "Loc;")
    public static class151 field3664 = class137.method873(2, ")1j");

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "Loc;")
    public static class151 field3666 = field3662;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!u", name = "rb", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "[I")
    public static int[] field3665;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static void method1302(int arg0) {
        field3662 = null;
        if (arg0 > 36) {
            field3669 = null;
            field3666 = null;
            field3664 = null;
            field3665 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)V")
    public static final void method1303(int arg0, int arg1) {
        class106.field1877 = -1;
        field3661++;
        class110.field1943 = arg0;
        if (arg1 == 27760) {
            class138.field2508 = -1;
            class237.method1541(true);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        field3668++;
        return arg0 == 107 ? class195.field3477 : null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)Lhh;")
    public static final class84 method1304(int arg0) {
        class84 var1 = new class84();
        var1.field1587 = class128.field2302[0];
        var1.field1592 = class124.field2236;
        if (arg0 >= -26) {
            field3669 = null;
        }
        var1.field1589 = class148.field2650[0];
        field3667++;
        var1.field1588 = class169.field3079;
        var1.field1591 = class181.field3271[0];
        var1.field1586 = class159.field2862[0];
        byte[] var2 = class174.field3147[0];
        int var3 = var1.field1591 * var1.field1586;
        var1.field1590 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field1590[var4] = class67.field1312[class26.method206(255, var2[var4])];
        }
        class99.method612(-20444);
        return var1;
    }
}
