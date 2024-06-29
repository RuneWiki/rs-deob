import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class595 extends class72 {

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field8697 = -1;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Z")
    public static boolean field8702 = false;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field8699 = 999999;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[I")
    public static int[] field8703 = new int[50];

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 3)
    public final void method55(int arg0) {
        if (arg0 >= 30) {
            ++field8701;
            if (!super.field1286.method2818(true)) {
                if (super.field1286.field6684.method1844(13) && class138.method1101(false, super.field1286.field6684.method1843(27669))) {
                    if (~super.field1282 == -1) {
                        super.field1282 = 1;
                    }
                } else {
                    super.field1282 = 0;
                }
            } else {
                super.field1282 = 2;
            }
            if (super.field1282 < 0 || super.field1282 > 2) {
                super.field1282 = this.method60(-3271);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V", line = 32)
    public final void method59(int arg0, int arg1) {
        if (arg1 != 3) {
            field8703 = null;
        }
        ++field8700;
        super.field1282 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)I", line = 43)
    public final int method60(int arg0) {
        ++field8706;
        if (arg0 != -3271) {
            return 66;
        } else if (super.field1286.method2818(true)) {
            return 2;
        } else {
            return super.field1286.field6684.method1844(13) && class138.method1101(false, super.field1286.field6684.method1843(27669)) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lcq;)V", line = 64)
    public class595(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(ILcq;)V", line = 68)
    public class595(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)I", line = 79)
    public final int method3488(int arg0) {
        ++field8705;
        return arg0 != 27669 ? 69 : super.field1282;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)Z", line = 93)
    public final boolean method3489(int arg0) {
        ++field8708;
        int var2 = super.field1286.field6684.method1843(27669);
        if (arg0 < 97) {
            this.method3489(-19);
        }
        if (super.field1286.method2818(true)) {
            return false;
        } else {
            return !super.field1286.field6684.method1844(13) || !class283.method1849(var2, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I", line = 114)
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            field8699 = -27;
        }
        ++field8704;
        int var3 = super.field1286.field6684.method1843(27669);
        if (super.field1286.method2818(true)) {
            return 3;
        } else if (super.field1286.field6684.method1844(arg1 + -11247) && class138.method1101(false, var3) && ~arg0 == -1) {
            return 3;
        } else {
            return super.field1286.field6684.method1844(arg1 + -11247) && class283.method1849(var3, (byte) -35) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 149)
    public static void method3490(boolean arg0) {
        field8703 = null;
        if (!arg0) {
            method3490(false);
        }
    }
}
