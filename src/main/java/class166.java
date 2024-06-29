import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class166 extends class123 {

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "Leb;")
    public static class230 field2934 = class68.method589(0, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "Z")
    public static boolean field2931 = false;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "Leb;")
    public static class230 field2937 = class68.method589(0, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "Leb;")
    public static class230 field2939 = class68.method589(0, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
    public static int field2940 = -1;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)I")
    private final int method1231(int arg0, int arg1, int arg2) {
        if (arg2 != 15731) {
            field2937 = null;
        }
        ++field2938;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * 15731 * var5 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBLkk;)Leh;")
    public static final class80 method1232(int arg0, byte arg1, class223 arg2) {
        ++field2935;
        if (!class48.method402(arg2, arg0, true)) {
            return null;
        } else {
            if (arg1 != 84) {
                method1232(-64, (byte) 6, (class223) null);
            }
            return class45.method385(-85);
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        field2934 = null;
        field2939 = null;
        if (arg0 <= 48) {
            field2933 = -48;
        }
        field2937 = null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class166() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = 64 / ((-24 - arg1) / 57);
        ++field2941;
        int[] var4 = super.field2160.method1323((byte) -91, arg0);
        if (super.field2160.field3243) {
            int var5 = class154.field2753[arg0];
            for (int var6 = 0; ~var6 > ~class140.field2505; ++var6) {
                var4[var6] = this.method1231(class214.field3705[var6], var5, 15731) % 4096;
            }
        }
        return var4;
    }
}
