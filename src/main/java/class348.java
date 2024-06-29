import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class348 extends class214 {

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
    public static int field5128 = 0;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "Ltm;")
    public static class334 field5126 = new class334(76, 0);

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method64(int arg0, byte arg1) {
        ++field5125;
        if (arg1 != 5) {
            field5126 = null;
        }
        int[] var3 = super.field3544.method3869(arg0, -128);
        if (super.field3544.field9836) {
            int var4 = class131.field2138[arg0];
            for (int var5 = 0; var5 < class626.field8787; ++var5) {
                var3[var5] = this.method2218((byte) -33, class592.field8328[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V", line = 39)
    public static void method2217(int arg0) {
        if (arg0 != 0) {
            field5126 = null;
        }
        field5126 = null;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V", line = 49)
    public class348() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(BII)I", line = 53)
    private final int method2218(byte arg0, int arg1, int arg2) {
        ++field5127;
        if (arg0 != -33) {
            field5126 = null;
        }
        int var4 = arg1 - -(arg2 * 57);
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
