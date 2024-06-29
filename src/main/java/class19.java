import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class243 {

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
    private int field129 = 4096;

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
    private int field128 = 4096;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
    private int field132 = 4096;

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "[I")
    public static int[] field127 = new int[13];

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field130 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
    public static void method79(int arg0) {
        field127 = null;
        int var1 = 78 % ((arg0 - 58) / 60);
        field130 = null;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field131;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (arg0 > -76) {
            return null;
        } else {
            if (super.field3156.field8335) {
                int[][] var4 = this.method1457(arg1, 24431, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class687.field9628 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && ~var13 == ~var14) {
                        var8[var11] = this.field128 * var12 >> 12;
                        var9[var11] = this.field132 * var13 >> 12;
                        var10[var11] = this.field129 * var14 >> 12;
                    } else {
                        var8[var11] = this.field128;
                        var9[var11] = this.field132;
                        var10[var11] = this.field129;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
    public class19() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field129 = arg1.method3402((byte) 127);
                }
            } else {
                this.field132 = arg1.method3402((byte) 127);
            }
        } else {
            this.field128 = arg1.method3402((byte) 127);
        }
        if (arg2 <= -92) {
            ++field133;
        }
    }
}
