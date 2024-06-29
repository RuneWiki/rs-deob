import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class359 extends class17 {

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    private int field5141 = 585;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Ltn;")
    public static class60 field5137 = new class60(39, 8);

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "Ltn;")
    public static class60 field5143 = new class60(19, -1);

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method27(int arg0, int arg1) {
        if (arg1 <= 53) {
            return null;
        } else {
            ++field5138;
            int[] var3 = super.field210.method2683(-17, arg0);
            if (super.field210.field6442) {
                int var4 = class40.field427[arg0];
                for (int var5 = 0; ~class530.field7763 < ~var5; ++var5) {
                    int var6 = class492.field6966[var5];
                    if (this.field5141 < var6 && -this.field5141 + 4096 > var6 && ~(-this.field5141 + 2048) > ~var4 && var4 < this.field5141 + 2048) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 >= 0 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field5141 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (2048 - this.field5141 < var6 && ~var6 > ~(this.field5141 + 2048)) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field5141;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field5141 + 2048);
                    } else if (~var4 <= ~this.field5141 && -this.field5141 + 4096 >= var4) {
                        if (~this.field5141 >= ~var6 && var6 <= -this.field5141 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field5141 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = ~var19 > -1 ? -var19 : var19;
                        int var21 = var20 - this.field5141;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (2048 - this.field5141);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 84)
    public static void method2121(boolean arg0) {
        if (!arg0) {
            field5143 = null;
            field5137 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 100)
    public class359() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lwm;II)V", line = 104)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field5141 = arg0.method2338(0);
        }
        if (arg2 != 5159) {
            field5137 = null;
        }
        ++field5140;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[S)[S", line = 134)
    public static final short[] method2122(int arg0, int arg1, short[] arg2) {
        ++field5142;
        short[] var3 = new short[arg0];
        class182.method1141(arg2, arg1, var3, 0, arg0);
        return var3;
    }
}
