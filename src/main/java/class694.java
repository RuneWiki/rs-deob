import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class694 extends class330 {

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    private int field9681 = 0;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    private int field9687 = 0;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    private int field9688 = 20;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    private int field9686 = 1365;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "Ljw;")
    public static class474 field9682 = null;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "Llaa;")
    public static class498 field9684 = null;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class694() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.field9687 = arg0.method3002(-1);
                    }
                } else {
                    this.field9681 = arg0.method3002(-1);
                }
            } else {
                this.field9688 = arg0.method3002(-1);
            }
        } else {
            this.field9686 = arg0.method3002(-1);
        }
        int var5 = 45 / ((arg2 - -41) / 42);
        ++field9685;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)V")
    public static void method3928(byte arg0) {
        field9682 = null;
        if (arg0 == 120) {
            field9684 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field9683;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            for (int var4 = 0; class80.field901 > var4; ++var4) {
                int var5 = (class404.field5705[var4] << 12) / this.field9686 + this.field9681;
                int var6 = (class300.field4352[arg0] << 12) / this.field9686 + this.field9687;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~this.field9688 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field9688 + -1) < ~var13 ? (var13 << 12) / this.field9688 : 0;
            }
        }
        if (arg1) {
            this.field9687 = 70;
        }
        return var3;
    }
}
