import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class89 extends class148 {

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "Lki;")
    public static class498 field1358 = new class498(2, 3);

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(B)V")
    public static void method521(byte arg0) {
        if (arg0 != -80) {
            field1358 = null;
        }
        field1358 = null;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
    public class89() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field1356;
        if (arg0 > -65) {
            return null;
        } else {
            int[] var3 = super.field2193.method497(arg1, false);
            if (super.field2193.field1312) {
                int var4 = class456.field6752[arg1];
                for (int var5 = 0; var5 < class320.field4579; ++var5) {
                    var3[var5] = this.method522(-9630, var4, class517.field7539[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)I")
    private final int method522(int arg0, int arg1, int arg2) {
        if (arg0 != -9630) {
            field1358 = null;
        }
        ++field1357;
        int var4 = arg2 - -(arg1 * 57);
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }
}
