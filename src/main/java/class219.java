import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class219 extends class43 {

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field3744 = 0;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "[I")
    public static int[] field3746 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Lp;")
    private static class280 field3740 = class18.method140((byte) -118, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lp;")
    private static class280 field3741 = class18.method140((byte) -120, " is already on your ignore list)3");

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "Lp;")
    public static class280 field3750 = class18.method140((byte) -125, "<col=40ff00>");

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Lp;")
    public static class280 field3749 = field3741;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "Lp;")
    public static class280 field3745 = field3740;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "[J")
    public static long[] field3753 = new long[500];

    @OriginalMember(owner = "client!re", name = "R", descriptor = "B")
    public byte field3743;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Llj;")
    public class25 field3742;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "[[[B")
    public static byte[][][] field3754;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)I")
    public final int method329(int arg0) {
        ++field3755;
        if (this.field3742 == null) {
            return 0;
        } else {
            if (arg0 < 120) {
                method1461(-117);
            }
            return this.field3742.field481 * 100 / (this.field3742.field475.length + -this.field3743);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
    public static final int method1460(int arg0, int arg1) {
        int var2 = -122 % (-arg0 / 46);
        ++field3752;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)[B")
    public final byte[] method324(int arg0) {
        if (arg0 >= -14) {
            this.field3751 = -6;
        }
        ++field3747;
        if (!super.field721 && this.field3742.field481 >= this.field3742.field475.length + -this.field3743) {
            return this.field3742.field475;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
    public static void method1461(int arg0) {
        field3753 = null;
        field3741 = null;
        field3754 = null;
        field3746 = null;
        field3745 = null;
        if (arg0 != 1) {
            field3749 = null;
        }
        field3749 = null;
        field3740 = null;
        field3750 = null;
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V")
    public static final void method1462(int arg0) {
        class24.field439.method1481(false);
        ++field3748;
        if (arg0 > -78) {
            method1461(121);
        }
    }
}
