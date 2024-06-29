import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class552 extends class264 {

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Lsi;")
    public static class583 field7866 = new class583();

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lmfa;)V")
    public class552(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field7865;
        if (arg0 != -38) {
            field7866 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public static void method3210(int arg0) {
        field7866 = null;
        int var1 = -57 / ((71 - arg0) / 42);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
    public static final void method3211(byte arg0) {
        if (arg0 > -43) {
            method3210(-66);
        }
        ++field7860;
        class731.field10209.method396(class129.field1693, class452.field6512, class276.field3846);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(ILmfa;)V")
    public class552(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        ++field7863;
        if (arg0 >= -114) {
            field7866 = null;
        }
        super.field3733 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)I")
    public final int method3212(byte arg0) {
        ++field7859;
        if (arg0 >= -31) {
            this.method660(78);
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)Z")
    public final boolean method3213(int arg0) {
        ++field7864;
        if (super.field3731.method3633(119)) {
            return false;
        } else {
            if (arg0 != 14996) {
                field7866 = null;
            }
            return super.field3731.field9031.method2235((byte) -53) != 0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        if (arg0 != 112) {
            method3211((byte) 101);
        }
        ++field7861;
        if (super.field3731.method3633(arg0 + 10)) {
            return 3;
        } else {
            return ~super.field3731.field9031.method2235((byte) -81) == -1 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field7862;
        int var2 = 127 % ((1 - arg0) / 41);
        if (super.field3731.method3633(93)) {
            super.field3733 = 0;
        }
        if (~super.field3731.field9031.method2235((byte) -121) == -1) {
            super.field3733 = 0;
        }
        if (super.field3733 < 0 || ~super.field3733 < -3) {
            super.field3733 = this.method663((byte) -38);
        }
    }
}
