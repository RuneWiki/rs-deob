import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class551 extends class601 {

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(ILqea;)V", line = 3)
    public class551(int arg0, class339 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)I", line = 6)
    public final int method3266(int arg0) {
        ++field7656;
        return arg0 != 0 ? -76 : super.field8131;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)Z", line = 17)
    public static final boolean method3267(byte arg0, int arg1, int arg2) {
        int var3 = 115 % ((arg0 - 51) / 48);
        ++field7655;
        return ~(arg1 & 256) != -1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)I", line = 27)
    public final int method36(int arg0, byte arg1) {
        ++field7657;
        return arg1 != 22 ? 123 : 1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 42)
    public final void method41(byte arg0) {
        int var2 = -126 / ((arg0 - 59) / 33);
        if (super.field8131 != 1 && super.field8131 != 0) {
            super.field8131 = this.method45(8976);
        }
        ++field7653;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lqea;)V", line = 55)
    public class551(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I", line = 59)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            return 23;
        } else {
            ++field7654;
            return 1;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V", line = 73)
    public final void method43(int arg0, int arg1) {
        ++field7658;
        super.field8131 = arg1;
        int var3 = -124 / ((arg0 - 22) / 34);
    }
}
