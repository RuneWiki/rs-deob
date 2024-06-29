import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class205 extends class144 {

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    private int field2912 = 585;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field2911 = 0;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field2910 = 0;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Lbh;")
    public static class234 field2914 = new class234();

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "[[S")
    public static short[][] field2916;

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = super.field2069.method425(true, arg0);
        ++field2913;
        if (super.field2069.field820) {
            int var4 = class143.field2045[arg0];
            for (int var5 = 0; class104.field1411 > var5; ++var5) {
                int var6 = class87.field1178[var5];
                if (this.field2912 < var6 && ~(-this.field2912 + 4096) < ~var6 && ~var4 < ~(2048 - this.field2912) && ~(this.field2912 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2912 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (-this.field2912 + 2048 < var6 && var6 < this.field2912 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2912;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2912);
                } else if (~this.field2912 >= ~var4 && ~var4 >= ~(-this.field2912 + 4096)) {
                    if (var6 >= this.field2912 && ~var6 >= ~(-this.field2912 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field2912);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field2912;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2912 + 2048);
                }
            }
        }
        return arg1 != 255 ? null : var3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 != 20630) {
            this.field2912 = 86;
        }
        if (arg0 == 0) {
            this.field2912 = arg1.method1380(true);
        }
        ++field2915;
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(B)V")
    public static void method1320(byte arg0) {
        field2916 = null;
        if (arg0 > 95) {
            field2914 = null;
        }
    }
}
