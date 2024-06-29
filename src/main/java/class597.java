import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class597 extends class328 {

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    private int field8496 = 4096;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "[I")
    public static int[] field8498 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "Liu;")
    public static class517 field8495 = new class517(35, 5);

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "Lpp;")
    public static class464 field8499 = new class464(2, 2);

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "Lgp;")
    public static class561 field8501;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (~arg1 == -1) {
            this.field8496 = arg2.method1745(32132);
        }
        if (arg0 < 75) {
            field8501 = null;
        }
        ++field8497;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(III)I")
    public static final int method3405(int arg0, int arg1, int arg2) {
        int var3 = -34 / ((arg2 - -61) / 61);
        ++field8494;
        return arg0 != 1 && arg0 != 3 ? class576.field8226[arg1 & 3] : class603.field8586[3 & arg1];
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field8493;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = -116 % ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(0, class589.field8379 & arg0 - 1, (byte) 119);
            int[] var6 = this.method2042(0, arg0, (byte) 119);
            int[] var7 = this.method2042(0, arg0 + 1 & class589.field8379, (byte) 119);
            for (int var8 = 0; ~var8 > ~class449.field6539; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * this.field8496;
                int var10 = (var6[var8 - -1 & class108.field1799] + -var6[var8 + -1 & class108.field1799]) * this.field8496;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + var14 + 4096) / 4096.0F)));
                int var16 = var15 == 0 ? 0 : 16777216 / var15;
                var3[var8] = -var16 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
    public static void method3406(int arg0) {
        field8498 = null;
        if (arg0 != 0) {
            field8498 = null;
        }
        field8495 = null;
        field8501 = null;
        field8499 = null;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class597() {
        super(1, true);
    }
}
