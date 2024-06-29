import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class137 extends class224 {

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "[I")
    public static int[] field2040 = new int[4096];

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field2039;
        if (!arg1) {
            method931(37);
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int var4 = class251.field4018[arg0];
            for (int var5 = 0; class78.field1108 > var5; ++var5) {
                var3[var5] = this.method932(var4, (byte) 69, class243.field3893[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public static void method931(int arg0) {
        field2040 = null;
        if (arg0 != -1829358495) {
            method931(83);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class137() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)I")
    private final int method932(int arg0, byte arg1, int arg2) {
        ++field2041;
        if (arg1 <= 9) {
            field2040 = null;
        }
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
