import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class701 extends class601 {

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
    public static int field9772 = 2;

    @OriginalMember(owner = "client!hfa", name = "o", descriptor = "Z")
    public static boolean field9775 = false;

    @OriginalMember(owner = "client!hfa", name = "t", descriptor = "Z")
    public static boolean field9780 = true;

    @OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!hfa", name = "p", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!hfa", name = "q", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!hfa", name = "r", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!hfa", name = "s", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!hfa", name = "n", descriptor = "Luu;")
    public static class237 field9774;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IB)I", line = 4)
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            this.method3961(80);
        }
        ++field9778;
        return 1;
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V", line = 15)
    public static void method3960(int arg0) {
        if (arg0 != 1) {
            method3960(-1);
        }
        field9774 = null;
    }

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(I)I", line = 25)
    public final int method3961(int arg0) {
        ++field9773;
        if (arg0 != 0) {
            field9775 = false;
        }
        return super.field8131;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V", line = 38)
    public final void method41(byte arg0) {
        int var2 = -93 % ((59 - arg0) / 33);
        ++field9776;
        if (super.field8131 != 1 && ~super.field8131 != -1) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(II)V", line = 54)
    public final void method43(int arg0, int arg1) {
        int var3 = -88 % ((arg0 - 22) / 34);
        super.field8131 = arg1;
        ++field9779;
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(ILqea;)V", line = 66)
    public class701(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lqea;)V", line = 69)
    public class701(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I", line = 75)
    public final int method45(int arg0) {
        ++field9777;
        if (arg0 != 8976) {
            this.method36(69, (byte) 127);
        }
        return 1;
    }
}
