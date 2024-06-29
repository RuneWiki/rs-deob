import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class164 extends class646 {

    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
    public static int field2715 = 0;

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!cfa", name = "L", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!cfa", name = "M", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IBZLr;)Lla;")
    public static final class395 method1250(int arg0, byte arg1, boolean arg2, class98 arg3) {
        ++field2716;
        class173 var4 = class673.method3811(arg2, arg3, arg0, (byte) -47);
        int var5 = -7 / ((-21 - arg1) / 53);
        return var4 == null ? null : var4.field2791;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(IB)V")
    public static final void method1251(int arg0, byte arg1) {
        ++field2713;
        class449 var2 = class611.method3463(arg0, (byte) -119, 14);
        int var3 = -56 % ((arg1 - -86) / 34);
        var2.method2614(31);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field2717;
        int[] var3 = super.field9156.method2193(arg1 + 1389, arg0);
        if (super.field9156.field5075) {
            int var4 = class78.field1195[arg0];
            for (int var5 = 0; var5 < class89.field1330; ++var5) {
                var3[var5] = this.method1252(var4, class518.field7652[var5], (byte) -121) % 4096;
            }
        }
        return arg1 != -120 ? null : var3;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIB)I")
    private final int method1252(int arg0, int arg1, byte arg2) {
        ++field2714;
        if (arg2 >= -111) {
            this.method424(15, (byte) -29);
        }
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        return 4096 - ((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
    }
}
