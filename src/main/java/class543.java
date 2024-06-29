import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class543 extends class72 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lqaa;")
    public static class27 field7659 = new class27(51, 11);

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lqe;")
    public static class465 field7661 = new class465(95, 10);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field7663 = 0;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Luf;")
    public static class445 field7664 = new class445();

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
    public static int[] field7662;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        ++field7657;
        if (arg0 < 30) {
            this.method55(45);
        }
        if (super.field1286.method2815(-120) != class87.field1576) {
            super.field1282 = 1;
        } else if (super.field1286.method2818(true)) {
            super.field1282 = 0;
        }
        if (super.field1282 != 0 && super.field1282 != 1) {
            super.field1282 = this.method60(-3271);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Z")
    public static final boolean method3211(byte arg0) {
        ++field7658;
        if (class255.field3698) {
            try {
                if ((Boolean) class101.method889("showingVideoAd", class476.field6812, -27420)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 >= -120) {
            method3213((byte) -105);
        }
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(ILcq;)V")
    public class543(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lkr;B)V")
    public static final void method3212(class743[] arg0, byte arg1) {
        class364.field5109 = arg0.length;
        ++field7654;
        class698.field9810 = new class743[class364.field5109 + 10];
        class610.field8827 = new int[class364.field5109 + 10];
        class622.method3594(arg0, 0, class698.field9810, 0, class364.field5109);
        for (int var2 = 0; ~class364.field5109 < ~var2; ++var2) {
            class610.field8827[var2] = class698.field9810[var2].method83();
        }
        for (int var3 = class364.field5109; class698.field9810.length > var3; ++var3) {
            class610.field8827[var3] = 12;
        }
        if (arg1 != 73) {
            field7664 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field7652;
        return arg0 != -3271 ? 123 : 1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method3213(byte arg0) {
        if (arg0 < 4) {
            method3213((byte) 77);
        }
        field7664 = null;
        field7659 = null;
        field7661 = null;
        field7662 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lcq;)V")
    public class543(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)I")
    public final int method3214(int arg0) {
        ++field7660;
        if (arg0 != 27669) {
            field7661 = null;
        }
        return super.field1282;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Z")
    public final boolean method3215(int arg0) {
        if (arg0 <= 97) {
            method3211((byte) -26);
        }
        ++field7656;
        if (super.field1286.method2815(-127) == class87.field1576) {
            return !super.field1286.method2818(true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        if (arg1 != 3) {
            field7664 = null;
        }
        ++field7653;
        super.field1282 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            field7662 = null;
        }
        ++field7655;
        if (super.field1286.method2815(-123) == class87.field1576) {
            if (super.field1286.method2818(true)) {
                return 3;
            } else {
                return arg0 != 0 && ~super.field1286.field6674.method3652(27669) != -2 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }
}
