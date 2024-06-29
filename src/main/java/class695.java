import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class695 extends class362 {

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
    private int field9614 = 585;

    @OriginalMember(owner = "client!aga", name = "E", descriptor = "F")
    public static float field9620;

    @OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!aga", name = "B", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!aga", name = "C", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!aga", name = "F", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!aga", name = "H", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!aga", name = "D", descriptor = "Lfia;")
    public static class602 field9619;

    @OriginalMember(owner = "client!aga", name = "G", descriptor = "[B")
    public static byte[] field9622;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "[I")
    public static int[] field9615;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V", line = 9)
    public static void method3877(int arg0) {
        field9622 = null;
        field9615 = null;
        field9619 = null;
        if (arg0 != -11727) {
            method3878(-76, 55, -38, -103, 35, 107);
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "()V", line = 30)
    public class695() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIII)V", line = 33)
    public static final void method3878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -3096) {
            field9615 = null;
        }
        ++field9618;
        if (~class268.field3766 >= ~arg3 && ~class236.field3392 <= ~arg2 && class223.field3260 <= arg1 && class706.field9700 >= arg4) {
            class456.method2631(arg2, arg3, arg4, arg1, 15901, arg0);
        } else {
            class740.method4097(arg1, arg5 + 3089, arg0, arg4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)[I", line = 50)
    public final int[] method156(int arg0, int arg1) {
        ++field9623;
        if (arg0 != -2026769311) {
            return null;
        } else {
            int[] var3 = super.field4927.method808(-125, arg1);
            if (super.field4927.field1471) {
                int var4 = class135.field2287[arg1];
                for (int var5 = 0; ~var5 > ~class769.field10597; ++var5) {
                    int var6 = class172.field2750[var5];
                    if (var6 > this.field9614 && -this.field9614 + 4096 > var6 && -this.field9614 + 2048 < var4 && var4 < this.field9614 + 2048) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 > -1 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (2048 - this.field9614);
                        var3[var5] = -var10 + 4096;
                    } else if (~(-this.field9614 + 2048) > ~var6 && ~var6 > ~(this.field9614 + 2048)) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field9614;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (2048 - this.field9614);
                    } else if (var4 >= this.field9614 && var4 <= -this.field9614 + 4096) {
                        if (var6 >= this.field9614 && ~(-this.field9614 + 4096) <= ~var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 >= 0 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (2048 - this.field9614);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 < 0 ? -var19 : var19;
                        int var21 = var20 - this.field9614;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field9614 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lfca;II)V", line = 134)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field9617;
        if (~arg1 == -1) {
            this.field9614 = arg0.method763(88);
        }
        if (arg2 != -1) {
            this.method156(60, -15);
        }
    }
}
