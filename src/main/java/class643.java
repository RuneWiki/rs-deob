import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class643 extends class649 {

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field9184 = -1;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "Lq;")
    public static class671 field9183 = new class671(8);

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "Z")
    public static boolean field9186 = false;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)I")
    public final int method3631(int arg0) {
        ++field9179;
        return arg0 != 3 ? -39 : super.field9223;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field9185;
        if (arg0 != 18648) {
            this.method135(-83);
        }
        return 3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 > -120) {
            field9184 = 119;
        }
        ++field9182;
        super.field9223 = arg0;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lhs;)V")
    public class643(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 == 1) {
            super.field9223 = this.method135(-116);
            ++field9178;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BZ)I")
    public static final int method3632(byte arg0, boolean arg1) {
        ++field9181;
        if (class440.field6416 == null) {
            return 0;
        } else if (!arg1 && class519.field7510 != null) {
            return class440.field6416.length * 2;
        } else {
            int var2 = 0;
            if (arg0 >= -96) {
                return 85;
            } else {
                for (int var3 = 0; ~class440.field6416.length < ~var3; ++var3) {
                    int var4 = class440.field6416[var3];
                    if (class549.field7836.method2621(var4, -28975)) {
                        ++var2;
                    }
                    if (class411.field6065.method2621(var4, -28975)) {
                        ++var2;
                    }
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
    public static void method3633(int arg0) {
        if (arg0 != 0) {
            method3632((byte) -82, false);
        }
        field9183 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        int var2 = 89 / ((arg0 - -18) / 50);
        ++field9180;
        return !super.field9224.method2294((byte) -118) ? 0 : 1;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(ILhs;)V")
    public class643(int arg0, class358 arg1) {
        super(arg0, arg1);
    }
}
