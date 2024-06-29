import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class304 extends class328 {

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field4385 = 0;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "Ljda;")
    public static class275 field4387;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Lgp;")
    public static class561 field4388;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 4)
    public static void method1896(byte arg0) {
        if (arg0 <= -13) {
            field4388 = null;
            field4387 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 16)
    public class304() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I", line = 20)
    public final int[] method4(int arg0, int arg1) {
        ++field4386;
        int[] var3 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int[][] var4 = this.method2040(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class449.field6539 < ~var8; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        int var9 = -11 % ((arg1 - 48) / 56);
        return var3;
    }
}
