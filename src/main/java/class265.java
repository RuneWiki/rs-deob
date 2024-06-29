import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class265 extends class297 {

    @OriginalMember(owner = "client!oca", name = "K", descriptor = "I")
    private int field3767 = 585;

    @OriginalMember(owner = "client!oca", name = "I", descriptor = "[I")
    public static int[] field3765 = new int[50];

    @OriginalMember(owner = "client!oca", name = "J", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!oca", name = "L", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(Z)V")
    public static void method1765(boolean arg0) {
        field3765 = null;
        if (arg0) {
            field3765 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V")
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field3766;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            field3765 = null;
        }
        if (super.field4165.field266) {
            int var4 = class620.field8445[arg0];
            for (int var5 = 0; ~class525.field7275 < ~var5; ++var5) {
                int var6 = class733.field9899[var5];
                if (~var6 < ~this.field3767 && ~var6 > ~(4096 - this.field3767) && ~(-this.field3767 + 2048) > ~var4 && ~(this.field3767 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3767);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field3767) && ~var6 > ~(this.field3767 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3767;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3767 + 2048);
                } else if (this.field3767 <= var4 && var4 <= 4096 - this.field3767) {
                    if (var6 >= this.field3767 && var6 <= -this.field3767 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3767 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field3767;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3767 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field3768;
        if (arg2 == 31015) {
            if (arg1 == 0) {
                this.field3767 = arg0.method1478(842397944);
            }
        }
    }
}
