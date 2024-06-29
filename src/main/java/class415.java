import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class415 extends class634 {

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    private int field5685 = 585;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILig;Z)V", line = 7)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (!arg2) {
            if (arg0 == 0) {
                this.field5685 = arg1.method1476(-84);
            }
            ++field5689;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 38)
    public class415() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(IIZ)Z", line = 41)
    public static final boolean method2540(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field5687 = 62;
        }
        ++field5686;
        return (arg0 & 32768) != 0;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(BI)[I", line = 52)
    public final int[] method13(byte arg0, int arg1) {
        ++field5688;
        if (arg0 > -55) {
            method2540(-22, 103, true);
        }
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int var4 = class164.field1840[arg1];
            for (int var5 = 0; var5 < class635.field9139; ++var5) {
                int var6 = class246.field2980[var5];
                if (this.field5685 < var6 && ~(4096 - this.field5685) < ~var6 && var4 > 2048 - this.field5685 && ~var4 > ~(this.field5685 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field5685 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field5685 + 2048 && var6 < this.field5685 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field5685;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field5685 + 2048);
                } else if (~var4 <= ~this.field5685 && ~(4096 - this.field5685) <= ~var4) {
                    if (~this.field5685 >= ~var6 && var6 <= -this.field5685 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field5685 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field5685;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field5685);
                }
            }
        }
        return var3;
    }
}
