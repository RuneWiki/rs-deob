import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class428 extends class642 {

    @OriginalMember(owner = "client!mw", name = "G", descriptor = "I")
    private int field6248 = 585;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "Liba;")
    public static class211 field6247 = new class211(43, 3);

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V", line = 3)
    public class428() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(II)[I", line = 6)
    public final int[] method3(int arg0, int arg1) {
        ++field6246;
        if (arg1 != -9) {
            this.method3(-120, 115);
        }
        int[] var3 = super.field9216.method1185(arg0, arg1 ^ 83);
        if (super.field9216.field2418) {
            int var4 = class400.field6026[arg0];
            for (int var5 = 0; class338.field4909 > var5; ++var5) {
                int var6 = class542.field8026[var5];
                if (~this.field6248 > ~var6 && 4096 - this.field6248 > var6 && ~(-this.field6248 + 2048) > ~var4 && ~(this.field6248 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field6248 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (var6 > -this.field6248 + 2048 && this.field6248 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field6248;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field6248);
                } else if (this.field6248 <= var4 && ~(4096 - this.field6248) <= ~var4) {
                    if (~this.field6248 >= ~var6 && ~var6 >= ~(4096 - this.field6248)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field6248);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field6248;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field6248 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V", line = 88)
    public static void method2567(byte arg0) {
        int var1 = -109 % ((83 - arg0) / 37);
        field6247 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILgk;B)V", line = 99)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field6248 = arg1.method3169(26488);
        }
        if (arg2 > 29) {
            ++field6245;
        }
    }
}
