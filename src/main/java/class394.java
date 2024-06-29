import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class394 extends class145 {

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    private int field6022 = 4096;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "[[S")
    public static short[][] field6025 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public static int field6023 = 0;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class394() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field6026;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (arg0) {
            this.method27(true, 92);
        }
        if (super.field1779.field4602) {
            int[] var4 = this.method865(0, arg1 + -1 & class444.field6649, (byte) -86);
            int[] var5 = this.method865(0, arg1, (byte) -108);
            int[] var6 = this.method865(0, class444.field6649 & arg1 + 1, (byte) -94);
            for (int var7 = 0; ~var7 > ~class647.field9368; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field6022;
                int var9 = (var5[class619.field8980 & var7 + 1] - var5[var7 + -1 & class619.field8980]) * this.field6022;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - (-var13 - 4096)) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "(I)V")
    public static void method2535(int arg0) {
        int var1 = -53 % ((arg0 - 12) / 54);
        field6025 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field6024;
        if (arg1 > -67) {
            field6025 = null;
        }
        if (arg0 == 0) {
            this.field6022 = arg2.method1220(115);
        }
    }
}
