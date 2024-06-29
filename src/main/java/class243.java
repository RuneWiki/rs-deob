import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class243 extends class118 {

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "Lpf;")
    public static class425 field3645 = new class425(78, 4);

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field3646 = 0;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "Lcm;")
    public static class382 field3648 = new class382(16);

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field3650 = 0;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field3649 = 0;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "Ljd;")
    public static class361 field3647;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
    public static void method1494(int arg0) {
        field3645 = null;
        field3648 = null;
        field3647 = null;
        if (arg0 < 93) {
            field3647 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field3642;
        if (arg0 != 1) {
            field3647 = null;
        }
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int var4 = class160.field2210[arg1];
            for (int var5 = 0; var5 < class440.field6474; ++var5) {
                var3[var5] = this.method1496((byte) -125, class6.field73[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class243() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)I")
    public static final int method1495(int arg0, int arg1) {
        if (arg1 > -13) {
            field3647 = null;
        }
        ++field3644;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BII)I")
    private final int method1496(byte arg0, int arg1, int arg2) {
        if (arg0 > -73) {
            return -73;
        } else {
            ++field3643;
            int var4 = arg1 - -(arg2 * 57);
            int var5 = var4 ^ var4 << 1;
            return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }
}
