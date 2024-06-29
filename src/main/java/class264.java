import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class264 extends class601 {

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
    private int field3677 = 585;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
    public static int field3679 = 0;

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "[I")
    public static int[] field3682 = new int[4096];

    @OriginalMember(owner = "client!oba", name = "E", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!oba", name = "L", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "[I")
    public static int[] field3681;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lee;BI)V", line = 3)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field3678;
        if (arg1 != -61) {
            this.method5((byte) -34, 78);
        }
        if (~arg2 == -1) {
            this.field3677 = arg0.method3807(-1);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V", line = 32)
    public static void method1599(byte arg0) {
        field3682 = null;
        if (arg0 != -69) {
            field3682 = null;
        }
        field3681 = null;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V", line = 44)
    public class264() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BI)[I", line = 62)
    public final int[] method5(byte arg0, int arg1) {
        ++field3684;
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int var4 = class250.field3446[arg1];
            for (int var5 = 0; var5 < class171.field2624; ++var5) {
                int var6 = class453.field6186[var5];
                if (var6 > this.field3677 && var6 < -this.field3677 + 4096 && var4 > -this.field3677 + 2048 && var4 < this.field3677 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3677);
                    var3[var5] = -var10 + 4096;
                } else if (2048 - this.field3677 < var6 && var6 < this.field3677 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field3677;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3677 + 2048);
                } else if (~this.field3677 >= ~var4 && ~var4 >= ~(-this.field3677 + 4096)) {
                    if (var6 >= this.field3677 && ~var6 >= ~(-this.field3677 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3677 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3677;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3677 + 2048);
                }
            }
        }
        if (arg0 != -40) {
            field3680 = -14;
        }
        return var3;
    }
}
