import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class252 extends class86 {

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "Lrn;")
    public static class633 field3435 = new class633(53, 2);

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "D")
    public static double field3436;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "Lrga;")
    public static class308 field3437;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I", line = 3)
    public final int method73(int arg0) {
        if (arg0 != 0) {
            field3436 = -0.4209063538046946D;
        }
        ++field3434;
        return 0;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)Z", line = 14)
    public final boolean method1638(int arg0) {
        int var2 = -44 / ((-57 - arg0) / 57);
        ++field3431;
        int var3 = super.field1203.method2983(-19236).method723((byte) 90);
        return var3 >= 96;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(II)I", line = 31)
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            return -62;
        } else {
            ++field3429;
            int var3 = super.field1203.method2983(-19236).method723((byte) 90);
            if (~var3 > -97) {
                return 3;
            } else if (arg0 > 1 && ~var3 > -129) {
                return 3;
            } else {
                return ~arg0 < -4 && var3 < 192 ? 3 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)V", line = 54)
    public static void method1639(byte arg0) {
        field3435 = null;
        field3437 = null;
        if (arg0 != -23) {
            method1640(-67);
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)V", line = 65)
    public static final void method1640(int arg0) {
        class689.field8858 = arg0;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lsf;)V", line = 69)
    public class252(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V", line = 76)
    public final void method71(byte arg0) {
        ++field3430;
        int var2 = super.field1203.method2983(-19236).method723((byte) 90);
        if (var2 < 96) {
            super.field1200 = 0;
        }
        if (~super.field1200 < -2 && var2 < 128) {
            super.field1200 = 1;
        }
        if (arg0 != -65) {
            field3437 = null;
        }
        if (~super.field1200 < -3 && ~var2 > -193) {
            super.field1200 = 2;
        }
        if (super.field1200 < 0 || ~super.field1200 < -4) {
            super.field1200 = this.method73(arg0 ^ -65);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)I", line = 103)
    public final int method1641(boolean arg0) {
        ++field3433;
        if (arg0) {
            this.method73(-1);
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(ILsf;)V", line = 114)
    public class252(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IZ)V", line = 118)
    public final void method76(int arg0, boolean arg1) {
        if (arg1) {
            field3436 = 0.3949565340144207D;
        }
        super.field1200 = arg0;
        ++field3432;
    }
}
