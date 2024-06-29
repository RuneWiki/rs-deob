import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class56 extends class5 {

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    private int field799 = 585;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
    public static int field795 = 0;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    public static int field798 = -1;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
    public static int field801 = 0;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "F")
    public static float field800;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field797;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = 91 / ((81 - arg0) / 36);
        if (super.field126.field8392) {
            int var5 = class272.field3439[arg1];
            for (int var6 = 0; var6 < class657.field9287; ++var6) {
                int var7 = class269.field3405[var6];
                if (var7 > this.field799 && var7 < 4096 - this.field799 && ~(-this.field799 + 2048) > ~var5 && this.field799 + 2048 > var5) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 >= 0 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field799 + 2048);
                    var3[var6] = 4096 - var11;
                } else if (var7 > 2048 - this.field799 && var7 < 2048 - -this.field799) {
                    int var12 = var5 + -2048;
                    int var13 = var12 < 0 ? -var12 : var12;
                    int var14 = var13 - this.field799;
                    int var15 = var14 << 12;
                    var3[var6] = var15 / (2048 - this.field799);
                } else if (var5 >= this.field799 && var5 <= -this.field799 + 4096) {
                    if (~var7 <= ~this.field799 && ~var7 >= ~(4096 - this.field799)) {
                        var3[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = var16 >= 0 ? var16 : -var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field799 + 2048);
                        var3[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 - 2048;
                    int var21 = ~var20 <= -1 ? var20 : -var20;
                    int var22 = var21 - this.field799;
                    int var23 = var22 << 12;
                    var3[var6] = var23 / (-this.field799 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
    public class56() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 == 0) {
            this.field799 = arg1.method3470(13111);
        }
        if (arg0 != 1) {
            field795 = -88;
        }
        ++field796;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIB)I")
    public static final int method355(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -69) {
            field798 = -89;
        }
        ++field802;
        int var5 = -class453.field5811[arg1 * 8192 / arg0] + 65536 >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }
}
