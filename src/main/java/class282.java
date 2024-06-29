import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class282 extends class72 {

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Z")
    private boolean field4011 = true;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[I")
    public static int[] field4008 = new int[13];

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "Lkca;")
    public static class82 field4019 = new class82(4);

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1840(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1841((byte) 112);
        }
        ++field4009;
        return (458752 & arg2) != 0 | class206.method1433(arg2, (byte) -103, arg0) || class260.method1772(15, arg0, arg2);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field4012;
        if (!super.field1286.method2820(false).method3612(4)) {
            return 0;
        } else {
            if (arg0 != -3271) {
                field4010 = 79;
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        if (arg1 == 3) {
            super.field1282 = arg0;
            ++field4015;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1841(byte arg0) {
        field4019 = null;
        int var1 = 28 % ((48 - arg0) / 34);
        field4008 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 <= 30) {
            field4019 = null;
        }
        if (!super.field1286.method2820(false).method3612(4)) {
            super.field1282 = 0;
        }
        ++field4017;
        if (~super.field1282 > -1 || ~super.field1282 < -6) {
            super.field1282 = this.method60(-3271);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field4013;
        if (!super.field1286.method2820(false).method3612(arg1 ^ 11256)) {
            return 3;
        } else {
            if (arg1 != 11260) {
                field4008 = null;
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V")
    public final void method1842(boolean arg0, int arg1) {
        this.field4011 = arg0;
        if (arg1 >= -92) {
            this.method1844(49);
        }
        ++field4014;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)I")
    public final int method1843(int arg0) {
        ++field4016;
        return arg0 != 27669 ? 39 : super.field1282;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lcq;)V")
    public class282(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)Z")
    public final boolean method1844(int arg0) {
        ++field4018;
        return arg0 != 13 ? true : this.field4011;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(ILcq;)V")
    public class282(int arg0, class464 arg1) {
        super(arg0, arg1);
    }
}
