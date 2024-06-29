import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class505 extends class601 {

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field7023 = 0;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "Lkr;")
    public static class602 field7026 = new class602(61, 6);

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "[[I")
    public static int[][] field7030 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7028 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
    public static int field7031 = -1;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "J")
    public static long field7029;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "Leia;")
    public static class752 field7027;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[B)[B", line = 3)
    public static final byte[] method3039(int arg0, int arg1, byte[] arg2) {
        ++field7020;
        byte[] var3 = new byte[arg1];
        class245.method1646(arg2, 0, var3, 0, arg1);
        return arg0 > -57 ? null : var3;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lqea;)V", line = 18)
    public class505(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I", line = 24)
    public final int method3040(int arg0) {
        if (arg0 != 0) {
            return -4;
        } else {
            ++field7025;
            return super.field8131;
        }
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V", line = 37)
    public static void method3041(int arg0) {
        if (arg0 == 2) {
            field7027 = null;
            field7028 = null;
            field7026 = null;
            field7030 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(ILqea;)V", line = 50)
    public class505(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)I", line = 54)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            this.method36(-95, (byte) 103);
        }
        ++field7021;
        return 3;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 65)
    public final void method41(byte arg0) {
        ++field7022;
        if (super.field8131 < 0 || ~super.field8131 < -5) {
            super.field8131 = this.method45(8976);
        }
        int var2 = 86 % ((arg0 - 59) / 33);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)I", line = 78)
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return -32;
        } else {
            ++field7024;
            return 1;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)V", line = 89)
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        ++field7019;
        int var3 = -117 % ((arg0 - 22) / 34);
    }
}
