import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class501 extends class450 {

    @OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
    public static int field6729 = 1400;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
    public static int field6728 = 0;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!bia", name = "i", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!bia", name = "j", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!bia", name = "k", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!bia", name = "l", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!bia", name = "m", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!bia", name = "n", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!bia", name = "o", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!bia", name = "p", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V", line = 3)
    public final void method73(byte arg0) {
        ++field6735;
        if (arg0 == 98) {
            if (super.field6171.method1680(-18640).method1231(true) < 96) {
                super.field6170 = 0;
            }
            if (~super.field6170 > -1 || super.field6170 > 2) {
                super.field6170 = this.method68(false);
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "(II)V", line = 23)
    public static final void method2820(int arg0, int arg1) {
        ++field6730;
        class107 var2 = (class107) class1.field12.method2135((long) arg1, (byte) 31);
        if (var2 != null) {
            var2.field1452.method1589(16383);
            class721.method4057((byte) -57, var2.field1459, var2.field1458);
            var2.method3564(true);
        }
        if (arg0 != 8718) {
            method2824(58, -37, -33);
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Ljava/lang/Object;III)[B", line = 43)
    public static final byte[] method2821(Object arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 22) {
            field6728 = 45;
        }
        ++field6734;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class425.method2457(arg2, 20569, var4, arg3);
        } else if (arg0 instanceof class434) {
            class434 var5 = (class434) arg0;
            return var5.method1469(-93, arg2, arg3);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lup;)V", line = 74)
    public class501(class278 arg0) {
        super(arg0);
        class469.method2646(super.field6170, false);
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)Z", line = 87)
    public final boolean method2822(int arg0) {
        if (arg0 != 260) {
            method2824(6, -24, -40);
        }
        ++field6727;
        return ~super.field6171.method1680(-18640).method1231(true) <= -97;
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(ILup;)V", line = 102)
    public class501(int arg0, class278 arg1) {
        super(arg0, arg1);
        class469.method2646(super.field6170, false);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(ZI)V", line = 114)
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        ++field6731;
        class469.method2646(super.field6170, false);
        if (!arg0) {
            method2824(46, -3, -53);
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)I", line = 126)
    public final int method68(boolean arg0) {
        ++field6733;
        if (super.field6171.method1680(-18640).method1231(!arg0) < 96) {
            return 0;
        } else {
            if (arg0) {
                field6729 = -74;
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(Z)I", line = 144)
    public final int method2823(boolean arg0) {
        if (!arg0) {
            return 94;
        } else {
            ++field6737;
            return super.field6170;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)V", line = 160)
    public static final void method2824(int arg0, int arg1, int arg2) {
        class640.field8484 = arg2;
        ++field6732;
        class394.field5491 = arg1;
        if (~class410.field5681 == arg0) {
            class195.field2938 = class696.field9703 * 2 + class394.field5491;
            class425.field5857 = class640.field8484 - -(class229.field3266 * 2);
        } else if (class410.field5681 == 1) {
            class176.field2654 = class394.field5491 / class296.field4227 + class640.field8503 + 2;
            class237.field3335 = class640.field8484 / class300.field4261 + 2 - -class262.field3654;
            class425.field5857 = class300.field4261 * class237.field3335;
            class195.field2938 = class296.field4227 * class176.field2654;
            class229.field3266 = -class640.field8484 + class425.field5857 >> 1;
            class696.field9703 = -class394.field5491 + class195.field2938 >> 1;
        } else if (class410.field5681 == 2) {
            class425.field5857 = class640.field8484;
            class195.field2938 = class394.field5491;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)I", line = 193)
    public final int method75(int arg0, int arg1) {
        if (arg0 != 0) {
            method2824(-49, -114, 49);
        }
        ++field6736;
        return super.field6171.method1680(-18640).method1231(true) < 96 ? 3 : 1;
    }
}
