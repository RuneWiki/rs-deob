import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class649 extends class314 {

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    private int field9097 = 585;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "[S")
    public static short[] field9098;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLie;I)V", line = 3)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field9100;
        if (arg0 < -1) {
            if (arg2 == 0) {
                this.field9097 = arg1.method67(12021);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I", line = 30)
    public final int[] method6(int arg0, int arg1) {
        ++field9099;
        if (arg1 <= 109) {
            this.method6(30, -11);
        }
        int[] var3 = super.field4928.method534((byte) -69, arg0);
        if (super.field4928.field618) {
            int var4 = class657.field9166[arg0];
            for (int var5 = 0; ~class81.field1009 < ~var5; ++var5) {
                int var6 = class328.field5091[var5];
                if (this.field9097 < var6 && -this.field9097 + 4096 > var6 && -this.field9097 + 2048 < var4 && var4 < 2048 - -this.field9097) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field9097 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field9097 + 2048 < var6 && ~(this.field9097 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field9097;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field9097 + 2048);
                } else if (~var4 <= ~this.field9097 && 4096 - this.field9097 >= var4) {
                    if (var6 >= this.field9097 && var6 <= 4096 - this.field9097) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field9097 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field9097;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field9097 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 117)
    public class649() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Z", line = 121)
    public static final boolean method3742(int arg0, int arg1) {
        if (arg1 > -59) {
            return false;
        } else {
            ++field9101;
            return arg0 == 3 || arg0 == 7 || arg0 == 10;
        }
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V", line = 133)
    public static void method3743(int arg0) {
        field9098 = null;
        int var1 = -42 / ((arg0 - -16) / 36);
    }
}
