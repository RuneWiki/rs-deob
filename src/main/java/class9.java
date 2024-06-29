import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class601 {

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Ldh;")
    public static class320 field67 = new class320(88, 10);

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field61;
        if (super.field8563.method3930(19)) {
            return 3;
        } else {
            return arg1 != 15706 ? -92 : 1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        ++field65;
        if (super.field8563.method3930(19)) {
            super.field8565 = 0;
        }
        if (arg0 > -37) {
            field67 = null;
        }
        if (super.field8565 != 1 && ~super.field8565 != -1) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)I")
    public static final int method36(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field63;
        if (var4 == 0) {
            return arg2;
        } else {
            if (arg3 >= -51) {
                field67 = null;
            }
            if (var4 == 1) {
                return -arg0 + 7;
            } else {
                return var4 == 2 ? -arg2 + 7 : arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
    public final int method37(int arg0) {
        ++field62;
        int var2 = 60 / ((arg0 - -59) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
    public final boolean method38(int arg0) {
        ++field64;
        if (super.field8563.method3930(19)) {
            return false;
        } else {
            if (arg0 != -9242) {
                field67 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        ++field66;
        return arg0 != -17 ? -70 : 1;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lgn;)V")
    public class9(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(ILgn;)V")
    public class9(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        super.field8565 = arg0;
        ++field60;
        if (arg1) {
            method36(-109, -118, -125, 30);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static void method41(byte arg0) {
        if (arg0 > -85) {
            field67 = null;
        }
        field67 = null;
    }
}
