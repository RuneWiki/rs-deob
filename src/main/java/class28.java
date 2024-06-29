import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 extends class325 {

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "J")
    public static long field410;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "Loja;")
    public static class480 field412;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)[I", line = 11)
    public final int[] method100(byte arg0, int arg1) {
        ++field413;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 <= 21) {
            field412 = null;
        }
        if (super.field4727.field6067) {
            int var4 = class621.field8370[arg1];
            for (int var5 = 0; var5 < class261.field3874; ++var5) {
                var3[var5] = this.method212(var4, class556.field7498[var5], 262144) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(III)I", line = 43)
    private final int method212(int arg0, int arg1, int arg2) {
        ++field411;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return arg2 != 262144 ? 76 : -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V", line = 59)
    public class28() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 62)
    public static void method213(int arg0) {
        if (arg0 != 4096) {
            field410 = 7L;
        }
        field412 = null;
    }
}
