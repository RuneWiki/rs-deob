import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class208 extends class371 {

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    private int field3084 = 585;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field3085;
        if (arg0 > -80) {
            this.method79((byte) 92, 99);
        }
        int[] var3 = super.field5378.method1451(-127, arg1);
        if (super.field5378.field3254) {
            int var4 = class614.field9004[arg1];
            for (int var5 = 0; ~class41.field455 < ~var5; ++var5) {
                int var6 = class287.field4215[var5];
                if (var6 > this.field3084 && ~var6 > ~(-this.field3084 + 4096) && ~(-this.field3084 + 2048) > ~var4 && var4 < this.field3084 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3084 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > 2048 - this.field3084 && ~var6 > ~(this.field3084 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3084;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3084 + 2048);
                } else if (~var4 <= ~this.field3084 && -this.field3084 + 4096 >= var4) {
                    if (~var6 <= ~this.field3084 && -this.field3084 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3084 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3084;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3084);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        if (arg0 == 0) {
            this.field3084 = arg2.method2620(75);
        }
        int var5 = -77 % ((-15 - arg1) / 39);
        ++field3083;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class208() {
        super(0, true);
    }
}
