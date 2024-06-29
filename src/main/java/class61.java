import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class61 extends class204 {

    @OriginalMember(owner = "client!fka", name = "k", descriptor = "[I")
    public static int[] field697 = new int[8];

    @OriginalMember(owner = "client!fka", name = "h", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!fka", name = "i", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!fka", name = "j", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!fka", name = "l", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!fka", name = "n", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!fka", name = "o", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!fka", name = "m", descriptor = "Ljava/lang/Object;")
    public static Object field699;

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "(I)Z")
    public final boolean method485(int arg0) {
        ++field695;
        int var2 = -113 / ((-13 - arg0) / 44);
        if (super.field2853.method3505(125)) {
            return false;
        } else {
            return super.field2853.method3510(-78) == class692.field9661;
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        ++field696;
        if (super.field2853.method3510(-108) == class692.field9661) {
            if (super.field2853.method3505(arg0 ^ -4502)) {
                super.field2852 = 0;
            }
        } else {
            super.field2852 = 1;
        }
        if (~super.field2852 != -1 && super.field2852 != 1) {
            super.field2852 = this.method490((byte) 116);
        }
        if (arg0 != -4591) {
            field699 = null;
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        ++field694;
        int var3 = 34 / ((arg1 - -57) / 60);
        if (super.field2853.method3505(124)) {
            return 3;
        } else {
            return super.field2853.method3510(-96) == class692.field9661 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!fka", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        if (arg1 < -105) {
            ++field698;
            super.field2852 = arg0;
        }
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(Z)V")
    public static void method489(boolean arg0) {
        if (!arg0) {
            method489(false);
        }
        field699 = null;
        field697 = null;
    }

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lfs;)V")
    public class61(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        ++field701;
        if (arg0 <= 83) {
            this.method487(-44, 44);
        }
        return 1;
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(B)I")
    public final int method491(byte arg0) {
        if (arg0 != -98) {
            field699 = null;
        }
        ++field700;
        return super.field2852;
    }

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(ILfs;)V")
    public class61(int arg0, class607 arg1) {
        super(arg0, arg1);
    }
}
