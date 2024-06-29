import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class292 extends class207 {

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[[B")
    public static byte[][] field4160 = new byte[1000][];

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field4166 = 1;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 4)
    public static void method1870(byte arg0) {
        field4160 = null;
        int var1 = -50 / ((48 - arg0) / 46);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IB)I", line = 15)
    public final int method39(int arg0, byte arg1) {
        ++field4158;
        if (arg1 != 69) {
            field4166 = 82;
        }
        return 1;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I", line = 26)
    public final int method1871(int arg0) {
        ++field4165;
        if (arg0 != 43) {
            field4160 = null;
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 39)
    public final void method37(int arg0) {
        int var2 = 62 % ((-58 - arg0) / 48);
        ++field4163;
        if (~super.field2669 > -1 && ~super.field2669 < -128) {
            super.field2669 = this.method36(-22);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(ILrd;)V", line = 52)
    public class292(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z", line = 57)
    public static final boolean method1872(int arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            return true;
        } else {
            ++field4161;
            return class479.method2828(arg0, arg2 ^ -1021, arg1) & class197.method1291(arg0, -22235, arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)J", line = 70)
    public static final long method1873(byte arg0) {
        int var1 = -91 / ((arg0 - 15) / 59);
        ++field4162;
        return class719.field9773.method1516((byte) -34);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I", line = 82)
    public final int method36(int arg0) {
        if (arg0 >= -14) {
            method1872(-60, -20, -116);
        }
        ++field4157;
        return 127;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)V", line = 93)
    public final void method41(int arg0, byte arg1) {
        if (arg1 > -7) {
            field4166 = -28;
        }
        ++field4164;
        super.field2669 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lrd;)V", line = 112)
    public class292(class355 arg0) {
        super(arg0);
    }
}
