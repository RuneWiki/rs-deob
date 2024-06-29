import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class638 extends class72 {

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Lqca;")
    public static class115 field9095 = new class115(7, 0, 1, 1);

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field9103 = 0;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "Lcda;")
    public static class170 field9102;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "Lvfa;")
    public static class668 field9104;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Z")
    public final boolean method3650(int arg0) {
        ++field9099;
        if (super.field1286.method2818(true)) {
            return false;
        } else {
            if (arg0 <= 97) {
                field9104 = null;
            }
            return super.field1286.method2815(-112) == class87.field1576;
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lcq;)V")
    public class638(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public static void method3651(byte arg0) {
        field9104 = null;
        field9095 = null;
        if (arg0 < -82) {
            field9102 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field9096;
        if (super.field1286.method2818(true)) {
            return 3;
        } else if (arg1 != 11260) {
            return -10;
        } else if (super.field1286.method2815(-101) == class87.field1576) {
            if (~arg0 == -1) {
                if (~super.field1286.field6673.method2920(27669) == -2) {
                    return 2;
                }
                if (super.field1286.field6696.method3214(27669) == 1) {
                    return 2;
                }
                if (~super.field1286.field6714.method3368(27669) < -1) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field9098;
        if (arg0 != -3271) {
            this.method59(-100, -113);
        }
        return 1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        ++field9100;
        super.field1282 = arg0;
        if (arg1 != 3) {
            field9102 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(ILcq;)V")
    public class638(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (super.field1286.method2815(-95) == class87.field1576) {
            if (super.field1286.method2818(true)) {
                super.field1282 = 0;
            }
        } else {
            super.field1282 = 1;
        }
        ++field9101;
        if (super.field1282 != 0 && super.field1282 != 1) {
            super.field1282 = this.method60(-3271);
        }
        if (arg0 <= 30) {
            field9104 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)I")
    public final int method3652(int arg0) {
        if (arg0 != 27669) {
            return 12;
        } else {
            ++field9094;
            return super.field1282;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BIIIII)V")
    public static final void method3653(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9097;
        if (arg0 < 77) {
            field9103 = 105;
        }
        for (int var6 = arg2; arg3 >= var6; ++var6) {
            class399.method2472(27113, arg5, arg1, arg4, class329.field4651[var6]);
        }
    }
}
