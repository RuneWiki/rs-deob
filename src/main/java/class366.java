import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class366 extends class666 {

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    private int field4779 = 1;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    private int field4785 = 204;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    private int field4781 = 1;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "[I")
    public static int[] field4782;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field4783;
        int[] var3 = super.field9466.method1811(arg1, 86);
        if (arg0 >= -21) {
            field4780 = -82;
        }
        if (super.field9466.field4172) {
            for (int var4 = 0; ~class501.field7222 < ~var4; ++var4) {
                int var5 = class579.field8246[var4];
                int var6 = class476.field6935[arg1];
                int var7 = this.field4781 * var5 >> 12;
                int var8 = this.field4779 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4781) * this.field4781;
                int var10 = var6 % (4096 / this.field4779) * this.field4779;
                if (this.field4785 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field4785 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4785 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
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

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field4785 = arg1.method2574(-1758460248);
                }
            } else {
                this.field4779 = arg1.method2541(80);
            }
        } else {
            this.field4781 = arg1.method2541(93);
        }
        ++field4784;
        if (!arg2) {
            method2013(true);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class366() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public static void method2013(boolean arg0) {
        if (!arg0) {
            field4780 = -128;
        }
        field4782 = null;
    }
}
