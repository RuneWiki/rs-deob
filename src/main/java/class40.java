import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class40 extends class62 {

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
    public static int field478 = -1;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "Lada;")
    public static class144 field480 = new class144(26, 19);

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(III)I")
    private final int method253(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return -111;
        } else {
            ++field477;
            int var4 = arg2 * 57 + arg1;
            int var5 = var4 ^ var4 << 1;
            return 4096 - ((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public static final void method254(byte arg0) {
        ++field479;
        if (class465.field6546) {
            class583.field8560 = null;
            class465.field6546 = false;
            if (arg0 >= 79) {
                class236.field3412 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class40() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)V")
    public static void method255(int arg0) {
        field480 = null;
        if (arg0 != 789221) {
            method255(97);
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field481;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            int var4 = class309.field4265[arg0];
            for (int var5 = 0; class438.field5847 > var5; ++var5) {
                var3[var5] = this.method253(0, class200.field2965[var5], var4) % 4096;
            }
        }
        if (arg1 != 656024161) {
            field478 = -99;
        }
        return var3;
    }
}
