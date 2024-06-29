import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class516 extends class192 {

    @OriginalMember(owner = "client!aea", name = "I", descriptor = "I")
    public static int field6758 = 0;

    @OriginalMember(owner = "client!aea", name = "J", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field6759;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int[][] var4 = this.method1251(0, arg0, (byte) -65);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class561.field7319; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        if (arg1 > -123) {
            this.method118(-90, (byte) -72);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
    public class516() {
        super(1, true);
    }
}
