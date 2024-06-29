import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class232 extends class354 {

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Z")
    public static boolean field3307 = false;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "Lee;")
    public static class486 field3306;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIB)I")
    private final int method1553(int arg0, int arg1, byte arg2) {
        ++field3308;
        if (arg2 != -40) {
            return -63;
        } else {
            int var4 = arg1 * 57 + arg0;
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public static void method1554(byte arg0) {
        field3306 = null;
        if (arg0 < 74) {
            field3306 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field3309;
        if (arg0 > -74) {
            return null;
        } else {
            int[] var3 = super.field5478.method2522(arg1, 16863);
            if (super.field5478.field6213) {
                int var4 = class350.field5392[arg1];
                for (int var5 = 0; class531.field7814 > var5; ++var5) {
                    var3[var5] = this.method1553(class195.field2616[var5], var4, (byte) -40) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class232() {
        super(0, true);
    }
}
