import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class4 extends class450 {

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
    public static boolean field116 = false;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lhda;")
    public static class752 field117 = new class752(122, 0);

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lhu;")
    public static class133 field119;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (arg0) {
            ++field112;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(ILup;)V")
    public class4(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        ++field118;
        if (arg0) {
            field117 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method69(int arg0) {
        if (arg0 <= -78) {
            field119 = null;
            field117 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Z")
    public final boolean method70(int arg0) {
        ++field111;
        if (arg0 != 260) {
            field120 = -121;
        }
        return class640.method3499(super.field6171.field3913.method3282(true), 18107);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method71(int arg0, int arg1, String arg2) {
        if (arg1 == 16504) {
            ++field115;
            class127 var3 = class760.method4231(arg0, -874792672, 2);
            var3.method1010(614);
            var3.field2090 = arg2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILaea;)I")
    public static final int method72(int arg0, class50 arg1) {
        ++field110;
        if (arg0 != 122) {
            method69(-74);
        }
        if (class99.field1265 != arg1) {
            if (class312.field4469 == arg1) {
                return 8448;
            } else if (class314.field4479 != arg1) {
                if (class759.field10559 != arg1) {
                    if (class569.field7475 == arg1) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 34165;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (super.field6171.field3913.method3277((byte) 51) && !class640.method3499(super.field6171.field3913.method3282(true), 18107)) {
            super.field6170 = 0;
        }
        ++field109;
        if (~super.field6170 > -1 || ~super.field6170 < -3) {
            super.field6170 = this.method68(false);
        }
        if (arg0 != 98) {
            field116 = true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)I")
    public final int method74(boolean arg0) {
        if (!arg0) {
            field117 = null;
        }
        ++field114;
        return super.field6170;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lup;)V")
    public class4(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field113;
        if (arg0 != 0) {
            this.method67(true, 51);
        }
        return !class640.method3499(super.field6171.field3913.method3282(true), 18107) ? 3 : 1;
    }
}
