import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class318 extends class354 {

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4114 = null;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lvi;")
    public static class542 field4118 = class645.method3619(-97);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "F")
    public static float field4113;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    public static void method1875(int arg0) {
        field4114 = null;
        if (arg0 != 3) {
            field4113 = -0.4610387F;
        }
        field4118 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZII)V")
    public static final void method1876(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class427.method2450(arg1);
        ++field4115;
        class686.field9560 = 0L;
        int var5 = class120.method926(15492);
        if (~arg3 == -4 || var5 == 3) {
            arg2 = true;
        }
        if (!class386.field4930.method474()) {
            arg2 = true;
        }
        class218.method1418(66, arg2, arg0, arg4, arg3, var5);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)I")
    public final int method1877(byte arg0) {
        ++field4117;
        int var2 = -64 % ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field4116;
        if (arg0 != 3) {
            return -74;
        } else if (super.field4544.method4153(-9) == class211.field2791) {
            if (super.field4544.method4149((byte) 33)) {
                return 3;
            } else {
                return arg1 != 0 && super.field4544.field10405.method3198((byte) 66) != 1 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(ILwo;)V")
    public class318(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (super.field4544.method4153(arg0 + -6393) != class211.field2791) {
            super.field4545 = 1;
        } else if (super.field4544.method4149((byte) 33)) {
            super.field4545 = 0;
        }
        ++field4119;
        if (~super.field4545 != -1 && ~super.field4545 != -2) {
            super.field4545 = this.method393((byte) 119);
        }
        if (arg0 != 6384) {
            field4121 = 64;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lwo;)V")
    public class318(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)Z")
    public final boolean method1878(int arg0) {
        ++field4112;
        int var2 = -119 / ((-34 - arg0) / 41);
        if (super.field4544.method4153(-9) == class211.field2791) {
            return !super.field4544.method4149((byte) 33);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field4120;
        int var2 = -4 % ((arg0 - 37) / 63);
        return 1;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        super.field4545 = arg1;
        if (arg0 != -1) {
            this.method1877((byte) 111);
        }
        ++field4122;
    }
}
