import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class675 extends class207 {

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field9036 = -1;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)I", line = 3)
    public final int method3724(int arg0) {
        if (arg0 != 43) {
            field9036 = -112;
        }
        ++field9037;
        return super.field2669;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 14)
    public final void method37(int arg0) {
        ++field9031;
        int var2 = super.field2668.method2249((byte) 122).method2153(true);
        if (~var2 > -97) {
            super.field2669 = 0;
        }
        if (~super.field2669 < -2 && ~var2 > -129) {
            super.field2669 = 1;
        }
        int var3 = 105 / ((-58 - arg0) / 48);
        if (~super.field2669 < -3 && ~var2 > -193) {
            super.field2669 = 2;
        }
        if (~super.field2669 > -1 || super.field2669 > 3) {
            super.field2669 = this.method36(-20);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I", line = 42)
    public final int method36(int arg0) {
        ++field9032;
        if (arg0 > -14) {
            field9036 = 17;
        }
        return 0;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lrd;)V", line = 54)
    public class675(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(IB)I", line = 59)
    public final int method39(int arg0, byte arg1) {
        ++field9033;
        if (arg1 != 69) {
            this.method36(-87);
        }
        int var3 = super.field2668.method2249((byte) 118).method2153(true);
        if (~var3 > -97) {
            return 3;
        } else if (arg0 > 1 && ~var3 > -129) {
            return 3;
        } else {
            return ~arg0 < -4 && ~var3 > -193 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V", line = 83)
    public final void method41(int arg0, byte arg1) {
        if (arg1 >= -7) {
            field9036 = -38;
        }
        super.field2669 = arg0;
        ++field9034;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(ILrd;)V", line = 95)
    public class675(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Z", line = 104)
    public final boolean method3725(byte arg0) {
        if (arg0 != 8) {
            this.method41(67, (byte) 109);
        }
        ++field9035;
        int var2 = super.field2668.method2249((byte) 125).method2153(true);
        return var2 >= 96;
    }
}
