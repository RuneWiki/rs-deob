import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class270 extends class297 {

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "Lsk;")
    public static class623 field3806 = new class623("RC", 1);

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "Lfa;")
    public static class235 field3807;

    static {
        new class418("", 73);
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V", line = 4)
    public static final void method1789(int arg0) {
        if (arg0 != 22385) {
            field3807 = null;
        }
        ++field3808;
        class344.field4819.method996(-110);
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(III)I", line = 15)
    private final int method1790(int arg0, int arg1, int arg2) {
        ++field3805;
        if (arg2 < 14) {
            field3807 = null;
        }
        int var4 = arg1 - -(arg0 * 57);
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 29)
    public class270() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V", line = 32)
    public static void method1791(boolean arg0) {
        if (!arg0) {
            field3807 = null;
            field3806 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(II)[I", line = 43)
    public final int[] method15(int arg0, int arg1) {
        ++field3804;
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int var4 = class620.field8445[arg0];
            for (int var5 = 0; ~class525.field7275 < ~var5; ++var5) {
                var3[var5] = this.method1790(var4, class733.field9899[var5], 22) % 4096;
            }
        }
        if (arg1 != 255) {
            this.method15(38, -42);
        }
        return var3;
    }
}
