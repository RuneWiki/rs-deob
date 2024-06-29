import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class585 extends class330 {

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "[I")
    public static int[] field8267 = new int[32];

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Lqk;")
    public static class1 field8270;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "[Z")
    public static boolean[] field8271;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field8269;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field8267[var1] = var0 + -1;
            var0 += var0;
        }
        field8270 = new class1(42, 2);
        field8271 = new boolean[100];
        field8272 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)I", line = 3)
    private final int method3435(int arg0, int arg1, int arg2) {
        ++field8269;
        if (arg2 != -1376312589) {
            this.method3435(113, 44, -16);
        }
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V", line = 20)
    public static void method3436(byte arg0) {
        field8271 = null;
        if (arg0 == -116) {
            field8270 = null;
            field8267 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)[I", line = 32)
    public final int[] method464(int arg0, boolean arg1) {
        ++field8266;
        if (arg1) {
            method3436((byte) -13);
        }
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int var4 = class300.field4352[arg0];
            for (int var5 = 0; var5 < class80.field901; ++var5) {
                var3[var5] = this.method3435(var4, class404.field5705[var5], -1376312589) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 66)
    public class585() {
        super(0, true);
    }
}
