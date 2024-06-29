import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class695 extends class56 {

    @OriginalMember(owner = "client!sfa", name = "I", descriptor = "I")
    private int field9581 = 1365;

    @OriginalMember(owner = "client!sfa", name = "E", descriptor = "I")
    private int field9577 = 0;

    @OriginalMember(owner = "client!sfa", name = "G", descriptor = "I")
    private int field9579 = 0;

    @OriginalMember(owner = "client!sfa", name = "H", descriptor = "I")
    private int field9580 = 20;

    @OriginalMember(owner = "client!sfa", name = "J", descriptor = "[I")
    public static int[] field9582 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sfa", name = "D", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!sfa", name = "F", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IZ)[I", line = 3)
    public final int[] method24(int arg0, boolean arg1) {
        ++field9576;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            return null;
        } else {
            if (super.field673.field8073) {
                for (int var4 = 0; ~var4 > ~class328.field4576; ++var4) {
                    int var5 = (class132.field1945[var4] << 12) / this.field9581 + this.field9577;
                    int var6 = (class720.field10000[arg0] << 12) / this.field9581 - -this.field9579;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~this.field9580 < ~var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var11 + var7;
                        var12 = var10 * var10 >> 12;
                        ++var13;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = this.field9580 + -1 > var13 ? (var13 << 12) / this.field9580 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "()V", line = 62)
    public class695() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(B)V", line = 65)
    public static void method3919(byte arg0) {
        field9582 = null;
        if (arg0 <= 36) {
            method3920(false);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V", line = 76)
    public static final void method3920(boolean arg0) {
        if (arg0) {
            class553.field7776 = class480.field6790;
            class459.field6474 = class135.field1969;
        } else {
            class553.field7776 = class656.field8999;
            class459.field6474 = class588.field8292;
        }
        class634.field8744 = class553.field7776.length;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILee;I)V", line = 90)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 == 3731) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 == 3) {
                            this.field9579 = arg1.method3757((byte) -65);
                        }
                    } else {
                        this.field9577 = arg1.method3757((byte) -65);
                    }
                } else {
                    this.field9580 = arg1.method3757((byte) -65);
                }
            } else {
                this.field9581 = arg1.method3757((byte) -65);
            }
            ++field9578;
        }
    }
}
