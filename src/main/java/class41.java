import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class41 extends class260 {

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field530 = 0;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field539 = -1;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lbu;")
    public static class21 field537 = new class21(20, -2);

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field541 = 0;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I", line = 3)
    public static final int method312(byte arg0) {
        if (arg0 != 24) {
            field539 = -5;
        }
        ++field533;
        return class715.field9934;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I", line = 16)
    public final int method123(int arg0) {
        ++field532;
        if (arg0 != 4377) {
            this.method126(-34);
        }
        return 3;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 27)
    public static void method313(byte arg0) {
        field537 = null;
        if (arg0 != 33) {
            method316(-40, (int[][]) null);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 39)
    public final void method126(int arg0) {
        if (arg0 > 102) {
            if (~super.field3828 > -1 || ~super.field3828 < -5) {
                super.field3828 = this.method123(4377);
            }
            ++field535;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILha;IIII)V", line = 53)
    public static final void method314(int arg0, int arg1, int arg2, class65 arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field538;
        class571.field8060 = arg3;
        class757.field10437 = class571.field8060.method505();
        class416.field5706 = class571.field8060.method505();
        class784.field10773 = class571.field8060.method505();
        class673.field9376 = arg2;
        class103.field1192 = arg0;
        class523.field7393 = null;
        if (arg1 >= -59) {
            method312((byte) 62);
        }
        class373.field5148 = arg5;
        class763.field10520 = 1;
        class725.field10028 = 0;
        class793.field10902 = 0;
        class724.field10025 = arg4;
        class368.method2298(arg6, arg7, 0);
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)I", line = 76)
    public final int method315(int arg0) {
        ++field534;
        if (arg0 > -14) {
            method314(75, 9, 118, (class65) null, 16, -112, 83, 92);
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)I", line = 87)
    public final int method129(int arg0, int arg1) {
        ++field536;
        if (arg0 != -1) {
            field541 = -101;
        }
        return 1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[[I)V", line = 111)
    public static final void method316(int arg0, int[][] arg1) {
        ++field531;
        class746.field10330 = arg1;
        if (arg0 != 1) {
            method314(20, 84, 89, (class65) null, 4, -75, 40, 17);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lgn;)V", line = 125)
    public class41(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILgn;)V", line = 129)
    public class41(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V", line = 132)
    public final void method128(int arg0, byte arg1) {
        if (arg1 == 122) {
            ++field540;
            super.field3828 = arg0;
        }
    }
}
