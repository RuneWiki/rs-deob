import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class260 extends class739 {

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field3283 = 1401;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field3284;
        int[] var3 = super.field10311.method2116(arg1, (byte) 79);
        if (arg0 != -23347) {
            return null;
        } else {
            if (super.field10311.field4728) {
                int var4 = class287.field3604[arg1];
                for (int var5 = 0; var5 < class29.field523; ++var5) {
                    var3[var5] = this.method1568(var4, class634.field8751[var5], 108) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)I")
    private final int method1568(int arg0, int arg1, int arg2) {
        ++field3285;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        int var6 = 100 % ((arg2 - 16) / 49);
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class260() {
        super(0, true);
    }
}
