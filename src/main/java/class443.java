import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class443 extends class45 {

    @OriginalMember(owner = "client!sn", name = "K", descriptor = "I")
    public static int field6621 = 0;

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "[J")
    public static long[] field6618 = new long[32];

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "I")
    public static int field6620 = 0;

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!sn", name = "L", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!sn", name = "N", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!sn", name = "M", descriptor = "Lfb;")
    public static class474 field6623;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIB)I", line = 6)
    private final int method2654(int arg0, int arg1, byte arg2) {
        ++field6622;
        int var4 = arg1 - -(arg0 * 57);
        int var5 = var4 ^ var4 << 1;
        if (arg2 != 98) {
            method2655(83);
        }
        return 4096 - ((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I", line = 21)
    public final int[] method35(int arg0, int arg1) {
        ++field6624;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (arg0 != 0) {
            this.method2654(-68, 119, (byte) 28);
        }
        if (super.field854.field1928) {
            int var4 = class433.field6429[arg1];
            for (int var5 = 0; class259.field3768 > var5; ++var5) {
                var3[var5] = this.method2654(var4, class69.field1199[var5], (byte) 98) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V", line = 61)
    public class443() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V", line = 67)
    public static void method2655(int arg0) {
        field6618 = null;
        if (arg0 != -9385) {
            method2655(-55);
        }
        field6623 = null;
    }
}
