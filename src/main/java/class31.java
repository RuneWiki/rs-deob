import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class31 extends class529 {

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
    private int field495 = 1;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "I")
    private int field491 = 0;

    @OriginalMember(owner = "client!ov", name = "K", descriptor = "I")
    private int field497 = 0;

    @OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ov", name = "H", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ov", name = "J", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V", line = 4)
    public final void method303(int arg0) {
        class713.method3947((byte) -104);
        ++field494;
        if (arg0 >= -92) {
            this.field495 = -5;
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V", line = 17)
    public class31() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IBLtn;)V", line = 25)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 <= 45) {
            this.method191(-77, (byte) 7);
        }
        ++field496;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field495 = arg2.method1094(255);
                }
            } else {
                this.field491 = arg2.method1094(255);
            }
        } else {
            this.field497 = arg2.method1094(255);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IB)[I", line = 72)
    public final int[] method191(int arg0, byte arg1) {
        ++field492;
        int var3 = -95 % ((arg1 - 27) / 49);
        int[] var4 = super.field7456.method1635(arg0, -105);
        if (super.field7456.field3449) {
            int var5 = class310.field3960[arg0];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; ~var7 > ~class304.field3909; ++var7) {
                int var8 = class225.field2973[var7];
                int var9 = var8 + -2048 >> 1;
                int var12;
                if (~this.field497 != -1) {
                    int var10 = var6 * var6 + var9 * var9 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var12 = (int) ((double) (this.field495 * var11) * 3.141592653589793D);
                } else {
                    var12 = (var8 - var5) * this.field495;
                }
                int var13 = var12 - (-4096 & var12);
                if (this.field491 != 0) {
                    if (~this.field491 == -3) {
                        var13 -= 2048;
                        if (~var13 > -1) {
                            var13 = -var13;
                        }
                        var13 = -var13 + 2048 << 1;
                    }
                } else {
                    var13 = class550.field7739[(var13 & 4095) >> 4] - -4096 >> 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }
}
