import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class492 extends class72 {

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
    public static int field7007 = 1337;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZIIB)V")
    public static final void method2959(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        ++field7010;
        if (arg4 >= 60) {
            class633.method3638(true);
            class404.field5630 = 0L;
            int var5 = class190.method1336((byte) -106);
            if (~arg0 == -4 || var5 == 3) {
                arg1 = true;
            }
            if (!class359.field5046.method605()) {
                arg1 = true;
            }
            class201.method1408(arg1, arg3, arg2, (byte) -88, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field7006;
        if (arg1 != 11260) {
            field7007 = -116;
        }
        return !class283.method1849(super.field1286.field6684.method1843(arg1 ^ 18409), (byte) -94) ? 3 : 1;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lcq;)V")
    public class492(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)Z")
    public final boolean method2960(int arg0) {
        if (arg0 <= 97) {
            method2959(67, true, 85, 82, (byte) 32);
        }
        ++field7012;
        return class283.method1849(super.field1286.field6684.method1843(27669), (byte) -81);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (super.field1286.field6684.method1844(13) && !class283.method1849(super.field1286.field6684.method1843(27669), (byte) -78)) {
            super.field1282 = 0;
        }
        ++field7011;
        if (super.field1282 < 0 || ~super.field1282 < -3) {
            super.field1282 = this.method60(-3271);
        }
        if (arg0 < 30) {
            this.method2960(-38);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field7009;
        return arg0 != -3271 ? 8 : 0;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(ILcq;)V")
    public class492(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        if (arg1 != 3) {
            this.method55(-120);
        }
        ++field7008;
    }

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "(I)I")
    public final int method2961(int arg0) {
        if (arg0 != 27669) {
            return -88;
        } else {
            ++field7013;
            return super.field1282;
        }
    }
}
