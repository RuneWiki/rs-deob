import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class48 extends class297 {

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "[Z")
    public static boolean[] field737 = new boolean[112];

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public static int field740 = 0;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 4)
    public class48() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)[I", line = 13)
    public final int[] method173(int arg0, boolean arg1) {
        field738++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (!arg1) {
            field737 = (boolean[]) null;
        }
        if (this.field4760.field388) {
            int var4 = class264.field3901[arg0];
            for (int var5 = 0; var5 < class31.field491; var5++) {
                var3[var5] = this.method410(class251.field3705[var5], (byte) -60, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 42)
    public static void method409(int arg0) {
        field737 = null;
        if (arg0 != -789221) {
            field740 = 106;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IBI)I", line = 56)
    private final int method410(int arg0, byte arg1, int arg2) {
        if (arg1 != -60) {
            this.method410(120, (byte) -123, -16);
        }
        int var4 = arg2 * 57 + arg0;
        field739++;
        int var5 = var4 << 1 ^ var4;
        return 4096 - ((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144);
    }
}
