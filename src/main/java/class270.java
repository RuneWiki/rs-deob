import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class270 extends class257 {

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "[I")
    public static int[] field4130 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!pp", name = "R", descriptor = "B")
    public byte field4137;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!pp", name = "Q", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "Lhp;")
    public class217 field4135;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method1784(int arg0, int arg1, byte arg2) {
        ++field4131;
        if (arg2 != 30) {
            field4130 = null;
        }
        return (arg0 & 32) != 0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I", line = 17)
    public final int method1717(byte arg0) {
        ++field4136;
        if (this.field4135 == null) {
            return 0;
        } else {
            if (arg0 != -105) {
                this.field4134 = -128;
            }
            return this.field4135.field3556 * 100 / (this.field4135.field3572.length + -this.field4137);
        }
    }

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "(I)V", line = 34)
    public static final void method1785(int arg0) {
        ++field4128;
        class307.field4631 = false;
        class107.method827(arg0 ^ arg0, class397.field5941, class498.field7158, class521.field7630, class267.field4085);
    }

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "(I)I", line = 44)
    public static final int method1786(int arg0) {
        ++field4133;
        if ((double) class7.field92 == 3.0D) {
            return 37;
        } else if ((double) class7.field92 == 4.0D) {
            return 50;
        } else if ((double) class7.field92 == 6.0D) {
            return 75;
        } else if ((double) class7.field92 == 8.0D) {
            return 100;
        } else {
            if (arg0 != 9093) {
                method1785(124);
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V", line = 78)
    public static void method1787(byte arg0) {
        field4130 = null;
        if (arg0 <= 3) {
            method1786(-57);
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)[B", line = 93)
    public final byte[] method1718(boolean arg0) {
        ++field4129;
        if (!super.field3927 && ~this.field4135.field3556 <= ~(this.field4135.field3572.length + -this.field4137)) {
            return !arg0 ? null : this.field4135.field3572;
        } else {
            throw new RuntimeException();
        }
    }
}
