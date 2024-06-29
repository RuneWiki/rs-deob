import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class645 extends class62 {

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "I")
    private int field9386 = 4096;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
    private int field9385 = 0;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "Lhm;")
    public static class188 field9388 = new class188();

    @OriginalMember(owner = "client!rw", name = "J", descriptor = "[J")
    public static long[] field9390 = new long[100];

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "Lgaa;")
    public static class248 field9389;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "(I)V")
    public static final void method3725(int arg0) {
        class606.field9004 = arg0;
        for (int var1 = 0; var1 < class145.field2083; ++var1) {
            for (int var2 = 0; var2 < class384.field5282; ++var2) {
                if (class420.field5697[arg0][var1][var2] == null) {
                    class420.field5697[arg0][var1][var2] = new class205(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field9384;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (arg1 != 656024161) {
            method3726(71, 65, -126);
        }
        if (super.field774.field7499) {
            int[] var4 = this.method408(arg0, 0, (byte) -69);
            for (int var5 = 0; class438.field5847 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field9385 >= ~var6 && ~this.field9386 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field9389 = null;
        }
        ++field9383;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field9386 = arg0.method1045(true);
            }
        } else {
            this.field9385 = arg0.method1045(true);
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(III)I")
    public static final int method3726(int arg0, int arg1, int arg2) {
        ++field9387;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        if (arg2 != 10262) {
            method3726(33, 102, 75);
        }
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (133734106 & var5) >> 19;
    }

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "(I)V")
    public static void method3727(int arg0) {
        field9390 = null;
        if (arg0 != -25271) {
            field9389 = null;
        }
        field9388 = null;
        field9389 = null;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
    public class645() {
        super(1, true);
    }
}
