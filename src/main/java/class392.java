import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class392 extends class397 {

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
    private int field5801 = 585;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "Ldc;")
    public static class5 field5804 = new class5(4);

    @OriginalMember(owner = "client!gu", name = "Q", descriptor = "F")
    public static float field5806;

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field5802;
        if (arg0 != -780833076) {
            return null;
        } else {
            int[] var3 = super.field5854.method465(arg1, 125);
            if (super.field5854.field991) {
                int var4 = class447.field6523[arg1];
                for (int var5 = 0; class164.field2152 > var5; ++var5) {
                    int var6 = class228.field3210[var5];
                    if (~this.field5801 > ~var6 && ~var6 > ~(-this.field5801 + 4096) && -this.field5801 + 2048 < var4 && var4 < this.field5801 + 2048) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 <= -1 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (2048 - this.field5801);
                        var3[var5] = -var10 + 4096;
                    } else if (var6 > 2048 - this.field5801 && this.field5801 + 2048 > var6) {
                        int var11 = var4 + -2048;
                        int var12 = var11 < 0 ? -var11 : var11;
                        int var13 = var12 - this.field5801;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field5801 + 2048);
                    } else if (var4 >= this.field5801 && -this.field5801 + 4096 >= var4) {
                        if (var6 >= this.field5801 && ~var6 >= ~(-this.field5801 + 4096)) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field5801 + 2048);
                            var3[var5] = 4096 - var18;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 >= 0 ? var19 : -var19;
                        int var21 = var20 - this.field5801;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field5801 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field5803;
        if (arg1 != 80) {
            method2357(true);
        }
        if (~arg0 == -1) {
            this.field5801 = arg2.method993((byte) -122);
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
    public class392() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(Z)V")
    public static void method2357(boolean arg0) {
        if (!arg0) {
            field5804 = null;
        }
    }

    static {
        new class194("Ok", "Okay", "OK", "Ok");
    }
}
