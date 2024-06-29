import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class236 extends class57 {

    @OriginalMember(owner = "client!re", name = "wb", descriptor = "I")
    public static int field4122 = 0;

    @OriginalMember(owner = "client!re", name = "vb", descriptor = "Lvf;")
    public static class265 field4121 = class87.method582(-46, "M-Bmoire attribu-Be");

    @OriginalMember(owner = "client!re", name = "rb", descriptor = "Lvf;")
    public static class265 field4117 = class87.method582(-46, ":chalreq:");

    @OriginalMember(owner = "client!re", name = "tb", descriptor = "Lvf;")
    private static class265 field4119 = class87.method582(-46, "shake:");

    @OriginalMember(owner = "client!re", name = "pb", descriptor = "Lvf;")
    public static class265 field4115 = field4119;

    @OriginalMember(owner = "client!re", name = "qb", descriptor = "Lvf;")
    public static class265 field4116 = field4119;

    @OriginalMember(owner = "client!re", name = "xb", descriptor = "B")
    public static byte field4123;

    @OriginalMember(owner = "client!re", name = "ob", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!re", name = "sb", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!re", name = "ub", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!re", name = "yb", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!re", name = "zb", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!re", name = "Ab", descriptor = "Lvf;")
    public static class265 field4126;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V")
    public static void method1575(int arg0) {
        field4116 = null;
        field4121 = null;
        if (arg0 != 1) {
            field4116 = null;
        }
        field4119 = null;
        field4115 = null;
        field4117 = null;
        field4126 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        int[][] var3 = super.field1870.method569((byte) 119, arg0);
        if (super.field1870.field1567 && this.method429(4080)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1163 * super.field1163;
            for (int var8 = 0; var8 < class94.field1668; ++var8) {
                int var9 = super.field1172[var8 % super.field1178 + var7];
                var6[var8] = class203.method1395(var9, 255) << 4;
                var5[var8] = class203.method1395(var9, 65280) >> 4;
                var4[var8] = class203.method1395(4080, var9 >> 12);
            }
        }
        ++field4114;
        if (arg1 > -110) {
            method1577(17, -12, -9);
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)I")
    public static final int method1576(int arg0, int arg1) {
        ++field4125;
        if (arg0 < 0) {
            return 0;
        } else {
            class256 var2 = (class256) class4.field52.method1842(-1, (long) arg0);
            if (var2 == null) {
                return class43.method361(arg0, true).field4171;
            } else {
                int var3 = arg1;
                for (int var4 = 0; var4 < var2.field4378.length; ++var4) {
                    if (var2.field4378[var4] == -1) {
                        ++var3;
                    }
                }
                return var3 + class43.method361(arg0, true).field4171 + -var2.field4378.length;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
    public static final boolean method1577(int arg0, int arg1, int arg2) {
        ++field4118;
        if (arg0 < 31) {
            field4119 = null;
        }
        return ~(arg2 >> arg1 + 1 & 1) != -1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lkh;Lkh;I)V")
    public static final void method1578(class12 arg0, class12 arg1, int arg2) {
        ++field4120;
        if (arg1.field394 != null) {
            arg1.method97(arg2 ^ 159);
        }
        arg1.field394 = arg0.field394;
        arg1.field388 = arg0;
        if (arg2 != 1) {
            field4122 = -45;
        }
        arg1.field394.field388 = arg1;
        arg1.field388.field394 = arg1;
    }
}
