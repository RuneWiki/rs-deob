import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class271 extends class326 {

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "Lld;")
    public static class105 field3611;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Ljd;")
    public static class139 field3614;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V", line = 7)
    public static void method1537(byte arg0) {
        field3611 = null;
        if (arg0 >= 74) {
            field3614 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 19)
    public class271() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)[I", line = 22)
    public final int[] method30(byte arg0, int arg1) {
        ++field3615;
        if (arg0 > -6) {
            field3611 = null;
        }
        int[] var3 = super.field4344.method130(arg1, -123);
        if (super.field4344.field286) {
            int var4 = class95.field1400[arg1];
            for (int var5 = 0; ~class181.field2495 < ~var5; ++var5) {
                var3[var5] = this.method1538(var4, 25965, class389.field5375[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)I", line = 55)
    private final int method1538(int arg0, int arg1, int arg2) {
        ++field3612;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        if (arg1 != 25965) {
            field3611 = null;
        }
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
