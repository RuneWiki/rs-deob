import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class98 extends class12 {

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Lkh;")
    public static class117 field1806 = class224.method1450((byte) -35, "underlay)3dat");

    @OriginalMember(owner = "client!j", name = "E", descriptor = "Lkh;")
    public static class117 field1805 = class224.method1450((byte) 116, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Lkh;")
    public static class117 field1808 = class224.method1450((byte) 106, "Lade)3)3)3");

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field1804 = 0;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Lkh;")
    public static class117 field1801 = class224.method1450((byte) -106, "::qa_op_test");

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "[I")
    public static int[] field1800;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "[Lr;")
    public static class186[] field1810;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static final void method666(int arg0) {
        class136.field2457 = new class62(32);
        int var1 = 99 % ((41 - arg0) / 55);
        field1798++;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)Lr;")
    public static final class186 method667(byte arg0) {
        field1807++;
        if (arg0 <= 41) {
            method668(-105);
        }
        class153 var1 = new class153(class106.field1934, class199.field3582, class100.field1827[0], class106.field1927[0], class204.field3690[0], class11.field376[0], class105.field1921[0], class122.field2287);
        class45.method376(5851);
        return var1;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1800 = null;
        field1810 = null;
        field1801 = null;
        if (arg0 != 60) {
            method666(-127);
        }
        field1808 = null;
        field1806 = null;
        field1805 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V")
    public class98(int arg0, int arg1) {
        this.field1799 = arg1;
        this.field1797 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public static final void method669(int arg0) {
        for (class105 var1 = (class105) class173.field3114.method314((byte) -26); var1 != null; var1 = (class105) class173.field3114.method320(0)) {
            class190 var2 = var1.field1909;
            if (class203.field3675 != var2.field3380 || var2.field3365 < class44.field966) {
                var1.method123((byte) -126);
            } else if (var2.field3385 <= class44.field966) {
                if (var2.field3372 > 0) {
                    class207 var3 = class1.field18[var2.field3372 - 1];
                    if (var3 != null && var3.field4244 >= 0 && var3.field4244 < 13312 && var3.field4221 >= 0 && var3.field4221 < 13312) {
                        var2.method1277(var3.field4244, var3.field4221, class44.field966, class186.method1265(true, var3.field4221, var2.field3380, var3.field4244) - var2.field3368, -1);
                    }
                }
                if (var2.field3372 < 0) {
                    int var4 = -var2.field3372 - 1;
                    class56 var5;
                    if (class72.field1387 == var4) {
                        var5 = class93.field1712;
                    } else {
                        var5 = class43.field950[var4];
                    }
                    if (var5 != null && var5.field4244 >= 0 && var5.field4244 < 13312 && var5.field4221 >= 0 && var5.field4221 < 13312) {
                        var2.method1277(var5.field4244, var5.field4221, class44.field966, class186.method1265(true, var5.field4221, var2.field3380, var5.field4244) - var2.field3368, arg0);
                    }
                }
                var2.method1275((byte) 44, class28.field691);
                class58.method438(class203.field3675, (int) var2.field3360, (int) var2.field3398, (int) var2.field3390, 60, var2, var2.field3383, -1L, false);
            }
        }
        if (arg0 != -1) {
            method666(23);
        }
        field1796++;
    }
}
