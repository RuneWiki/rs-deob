import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class122 extends class642 {

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public static int field1815 = 0;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field1816 = 0;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field1817 = -1;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(BII)I")
    private final int method894(byte arg0, int arg1, int arg2) {
        if (arg0 >= -102) {
            field1815 = 111;
        }
        ++field1813;
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
    public class122() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field1814;
        if (arg1 != -9) {
            this.method894((byte) -19, -116, -117);
        }
        int[] var3 = super.field9216.method1185(arg0, arg1 + -101);
        if (super.field9216.field2418) {
            int var4 = class400.field6026[arg0];
            for (int var5 = 0; ~class338.field4909 < ~var5; ++var5) {
                var3[var5] = this.method894((byte) -114, var4, class542.field8026[var5]) % 4096;
            }
        }
        return var3;
    }
}
