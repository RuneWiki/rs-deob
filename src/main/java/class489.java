import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class489 extends class440 {

    @OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
    public static int field6942 = 0;

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!iba", name = "D", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!iba", name = "F", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZZB)V")
    public static final void method2838(boolean arg0, boolean arg1, byte arg2) {
        if (arg0) {
            ++class181.field2560;
            class555.method3148(true);
        }
        ++field6943;
        if (arg1) {
            ++class23.field321;
            class187.method1264((byte) 10);
        }
        if (arg2 != 58) {
            method2838(true, false, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field6940;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int var4 = class418.field6099[arg1];
            for (int var5 = 0; ~var5 > ~class549.field7715; ++var5) {
                var3[var5] = this.method2839(class499.field7073[var5], (byte) -119, var4) % 4096;
            }
        }
        int var6 = 65 / ((arg0 - -56) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IBI)I")
    private final int method2839(int arg0, byte arg1, int arg2) {
        ++field6941;
        if (arg1 != -119) {
            return -59;
        } else {
            int var4 = arg2 * 57 + arg0;
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * var5 * 15731 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
    public class489() {
        super(0, true);
    }
}
