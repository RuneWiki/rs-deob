import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class273 extends class297 {

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    private int field4270 = 204;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    private int field4266 = 1;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    private int field4264 = 1;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "[I")
    public static int[] field4268 = new int[5];

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)I", line = 4)
    public static final int method1945(int arg0) {
        if (arg0 != 30472) {
            field4271 = 23;
        }
        field4265++;
        return class281.field4404 && class48.field737[81] && class137.field2225 > 2 ? class179.field2856[class137.field2225 - 2] : class179.field2856[class137.field2225 - 1];
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)[I", line = 22)
    public final int[] method173(int arg0, boolean arg1) {
        field4267++;
        if (!arg1) {
            field4271 = 120;
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            for (int var4 = 0; var4 < class31.field491; var4++) {
                int var5 = class264.field3901[arg0];
                int var6 = class251.field3705[var4];
                int var7 = var5 % (4096 / this.field4264) * this.field4264;
                int var8 = var6 % (4096 / this.field4266) * this.field4266;
                int var9 = this.field4264 * var5 >> 12;
                int var10 = this.field4266 * var6 >> 12;
                if (var7 < this.field4270) {
                    for (var10 -= var9; var10 < 0; var10 += 4) {
                    }
                    while (var10 > 3) {
                        var10 -= 4;
                    }
                    if (var10 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field4270 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field4270) {
                    int var11;
                    for (var11 = var10 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 111)
    public class273() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILaj;)V", line = 134)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg1 != 255) {
            field4268 = (int[]) null;
        }
        if (arg0 == 0) {
            this.field4266 = arg2.method15((byte) 94);
        } else if (arg0 == 1) {
            this.field4264 = arg2.method15((byte) -107);
        } else if (arg0 == 2) {
            this.field4270 = arg2.method56(19612);
        }
        field4272++;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 177)
    public static void method1946(byte arg0) {
        field4268 = null;
        if (arg0 != -36) {
            field4268 = (int[]) null;
        }
    }
}
