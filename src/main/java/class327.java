import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class327 extends class615 {

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    private int field4512 = 1;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private int field4511 = 0;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    private int field4516 = 0;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Z")
    public static boolean field4515 = true;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 > 44) {
            ++field4514;
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 == 3) {
                        this.field4512 = arg2.method2034(255);
                    }
                } else {
                    this.field4516 = arg2.method2034(255);
                }
            } else {
                this.field4511 = arg2.method2034(255);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class327() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field4513;
        int[] var3 = super.field8125.method298(arg0, -116);
        if (super.field8125.field579) {
            int var4 = class402.field5353[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class505.field6740 < ~var6; ++var6) {
                int var7 = class168.field2599[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (~this.field4511 == -1) {
                    var9 = (-var4 + var7) * this.field4512;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4512 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field4516 != 0) {
                    if (~this.field4516 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class418.field5721[255 & var12 >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return arg1 != -18 ? null : var3;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        class201.method1312((byte) 100);
        ++field4510;
        if (arg0 != 12404) {
            this.field4512 = 109;
        }
    }
}
