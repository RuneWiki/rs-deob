import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class404 extends class331 {

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "Lus;")
    public static class328 field5701 = new class328(38, -1);

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "[I")
    public static int[] field5704 = new int[1];

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "Ltj;")
    public static class662 field5703;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)I", line = 4)
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return -27;
        } else {
            ++field5694;
            return 1;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lts;)V", line = 15)
    public class404(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)V", line = 20)
    public static void method2397(byte arg0) {
        field5703 = null;
        if (arg0 <= -71) {
            field5704 = null;
            field5701 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V", line = 37)
    public static final void method2398(int arg0) {
        ++field5702;
        if (arg0 == -29653) {
            for (int var1 = 0; class665.field9109 > var1; ++var1) {
                int var2 = class222.method1440(class665.field9109, class304.field3930 + var1, arg0 + -2128) * class680.field9231;
                for (int var3 = 0; class680.field9231 > var3; ++var3) {
                    int var4 = class222.method1440(class680.field9231, var3 - -class117.field1427, -31781) + var2;
                    if (~class87.field1109[var4] == ~class743.field10378) {
                        class641.field8860[var4].method332(0, 0, class112.field1383, class664.field9087, class112.field1383 * var3, class664.field9087 * var1, true, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)I", line = 70)
    public final int method2399(byte arg0) {
        if (arg0 > -119) {
            field5703 = null;
        }
        ++field5696;
        return super.field4202;
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)Z", line = 81)
    public final boolean method2400(byte arg0) {
        ++field5697;
        if (super.field4203.method345((byte) 122) == class400.field5535) {
            return !super.field4203.method344((byte) -96);
        } else {
            return arg0 <= 103;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(ILts;)V", line = 102)
    public class404(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(II)V", line = 106)
    public final void method227(int arg0, int arg1) {
        ++field5699;
        super.field4202 = arg1;
        if (arg0 < 113) {
            method2397((byte) 59);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 121)
    public final void method224(int arg0) {
        if (super.field4203.method345((byte) 122) != class400.field5535) {
            super.field4202 = 1;
        } else if (super.field4203.method344((byte) 118)) {
            super.field4202 = 0;
        }
        ++field5698;
        if (arg0 != -1959) {
            method2397((byte) 122);
        }
        if (~super.field4202 != -1 && ~super.field4202 != -2) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)I", line = 145)
    public final int method222(int arg0, int arg1) {
        ++field5695;
        if (arg1 != 1) {
            return -19;
        } else if (super.field4203.method345((byte) 122) == class400.field5535) {
            if (super.field4203.method344((byte) -82)) {
                return 3;
            } else {
                return arg0 != 0 && ~super.field4203.field591.method3604((byte) -121) != -2 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }
}
