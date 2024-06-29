import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class719 extends class601 {

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field10009 = -1;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public static int field10003;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "[Lfd;")
    public static class298[] field10005;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)I", line = 8)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            return -116;
        } else {
            ++field10003;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I", line = 19)
    public final int method4029(int arg0) {
        if (arg0 != 0) {
            field10004 = -48;
        }
        ++field10007;
        return super.field8131;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 31)
    public final void method41(byte arg0) {
        ++field10011;
        int var2 = 62 % ((arg0 - 59) / 33);
        int var3 = super.field8137.method2156((byte) 105).method1934(10135);
        if (~var3 > -97) {
            super.field8131 = 0;
        }
        if (super.field8131 > 1 && ~var3 > -129) {
            super.field8131 = 1;
        }
        if (~super.field8131 < -3 && var3 < 192) {
            super.field8131 = 2;
        }
        if (super.field8131 < 0 || super.field8131 > 3) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(ILqea;)V", line = 55)
    public class719(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)I", line = 59)
    public final int method36(int arg0, byte arg1) {
        ++field10010;
        if (arg1 != 22) {
            this.method4030(-5);
        }
        int var3 = super.field8137.method2156((byte) 112).method1934(arg1 + 10113);
        if (~var3 > -97) {
            return 3;
        } else if (~arg0 < -2 && ~var3 > -129) {
            return 3;
        } else {
            return ~arg0 < -4 && var3 < 192 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lqea;)V", line = 86)
    public class719(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Z", line = 89)
    public final boolean method4030(int arg0) {
        if (arg0 != 2048) {
            return true;
        } else {
            ++field10008;
            int var2 = super.field8137.method2156((byte) 119).method1934(10135);
            return ~var2 <= -97;
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V", line = 108)
    public static void method4031(int arg0) {
        field10005 = null;
        if (arg0 != -14581) {
            field10009 = 29;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V", line = 118)
    public final void method43(int arg0, int arg1) {
        ++field10006;
        int var3 = 85 / ((22 - arg0) / 34);
        super.field8131 = arg1;
    }
}
