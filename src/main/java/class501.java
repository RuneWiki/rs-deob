import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class501 extends class431 {

    @OriginalMember(owner = "client!bca", name = "Lb", descriptor = "I")
    public static int field6873 = 1;

    @OriginalMember(owner = "client!bca", name = "Qb", descriptor = "[I")
    public static int[] field6878 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!bca", name = "Ob", descriptor = "Lin;")
    public static class380 field6876 = new class380(91, 6);

    @OriginalMember(owner = "client!bca", name = "Kb", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!bca", name = "Mb", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!bca", name = "Nb", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!bca", name = "Pb", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(I)V", line = 5)
    public class501(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I[II[IILmj;)Llh;", line = 12)
    public static final class381 method2924(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, class114 arg5) {
        ++field6872;
        if (arg2 != -16777216) {
            return null;
        } else if (arg5.method69((byte) 100, class547.field7573, class629.field8918)) {
            byte[] var6 = new byte[arg0 * arg4];
            for (int var7 = 0; arg0 > var7; ++var7) {
                int var8 = arg4 * var7 + arg3[var7];
                for (int var9 = 0; ~var9 > ~arg1[var7]; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class381(arg5, arg4, arg0, var6);
        } else {
            int[] var10 = new int[arg0 * arg4];
            for (int var11 = 0; ~arg0 < ~var11; ++var11) {
                int var12 = arg4 * var11 - -arg3[var11];
                for (int var13 = 0; var13 < arg1[var11]; ++var13) {
                    var10[var12++] = -16777216;
                }
            }
            return new class381(arg5, arg4, arg0, var10);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(FZ)V", line = 69)
    public final void method2925(float arg0, boolean arg1) {
        ++field6877;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field6002[super.field5983++] = (byte) var3;
        super.field6002[super.field5983++] = (byte) (var3 >> 8);
        super.field6002[super.field5983++] = (byte) (var3 >> 16);
        if (!arg1) {
            field6873 = 79;
        }
        super.field6002[super.field5983++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BF)V", line = 87)
    public final void method2926(byte arg0, float arg1) {
        if (arg0 < 55) {
            field6873 = 11;
        }
        ++field6874;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field6002[super.field5983++] = (byte) (var3 >> 24);
        super.field6002[super.field5983++] = (byte) (var3 >> 16);
        super.field6002[super.field5983++] = (byte) (var3 >> 8);
        super.field6002[super.field5983++] = (byte) var3;
    }

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "(B)V", line = 105)
    public static void method2927(byte arg0) {
        field6876 = null;
        if (arg0 <= -65) {
            field6878 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILvi;)V", line = 117)
    public static final void method2928(int arg0, class302 arg1) {
        class163.field2502.method3728((byte) 105, arg1);
        ++field6875;
        arg1.field4336 = arg1.field4341.field5983;
        arg1.field4341.field5983 = arg0;
        class289.field4225 += arg1.field4336;
    }
}
