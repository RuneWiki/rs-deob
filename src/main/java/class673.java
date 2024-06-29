import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class673 extends class739 {

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
    private int field9418 = 585;

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!vfa", name = "F", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!vfa", name = "H", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field9418 = arg0.method2566(-2);
        }
        if (arg2 != -3) {
            this.field9418 = 6;
        }
        ++field9419;
    }

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(III)I")
    public static final int method3778(int arg0, int arg1, int arg2) {
        ++field9416;
        int var3 = arg1 >>> 31;
        if (arg2 != -247) {
            method3778(-24, 108, -128);
        }
        return (arg1 + var3) / arg0 + -var3;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field9417;
        if (arg0 != -23347) {
            this.method215(-30, -47);
        }
        int[] var3 = super.field10311.method2116(arg1, (byte) 72);
        if (super.field10311.field4728) {
            int var4 = class287.field3604[arg1];
            for (int var5 = 0; ~var5 > ~class29.field523; ++var5) {
                int var6 = class634.field8751[var5];
                if (var6 > this.field9418 && ~(-this.field9418 + 4096) < ~var6 && ~(-this.field9418 + 2048) > ~var4 && ~(this.field9418 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field9418);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field9418) && this.field9418 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field9418;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field9418 + 2048);
                } else if (var4 >= this.field9418 && 4096 - this.field9418 >= var4) {
                    if (~this.field9418 >= ~var6 && ~var6 >= ~(-this.field9418 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field9418 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field9418;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field9418 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "()V")
    public class673() {
        super(0, true);
    }
}
