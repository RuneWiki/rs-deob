import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class467 extends class96 {

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field6867 = 0;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field6868 = 0;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field6866;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field1331.field863) {
                int var4 = class74.field933[arg0];
                for (int var5 = 0; ~var5 > ~class269.field3403; ++var5) {
                    var3[var5] = this.method2818(57, class510.field7476[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class467() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(III)I")
    private final int method2818(int arg0, int arg1, int arg2) {
        ++field6869;
        int var4 = arg0 * arg2 + arg1;
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
