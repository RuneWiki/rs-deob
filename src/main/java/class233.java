import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class233 extends class185 {

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Z")
    private boolean field3509 = true;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    private int field3514 = 4096;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field3516 = 0;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "[I")
    public static int[] field3513;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field3512;
        if (arg2 != -6357) {
            field3513 = null;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field3509 = ~arg1.method1593((byte) 27) == -2;
            }
        } else {
            this.field3514 = arg1.method1575(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class233() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    public static void method1483(byte arg0) {
        field3513 = null;
        if (arg0 > -55) {
            field3513 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
    public static final void method1484(byte arg0) {
        if (arg0 > 72) {
            class177.field2709.method1775(27147);
            ++field3515;
            class80.field1289.method1775(27147);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1485(int arg0, int arg1, int arg2, int arg3) {
        if (!class236.method1501(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class255.method1684(var4 + 1, class67.field1072[arg0][arg1][arg2] + arg3, var5 + 1) && class255.method1684(var4 + 128 - 1, class67.field1072[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class255.method1684(var4 + 128 - 1, class67.field1072[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class255.method1684(var4 + 1, class67.field1072[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1486(int arg0, int arg1) {
        ++field3511;
        return arg0 >= class46.field754[arg1].length() ? class199.field3021[arg1] : class199.field3021[arg1] + class106.field1627 + class46.field754[arg1];
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int[] var4 = this.method1146((byte) 122, arg1 + -1 & class10.field133, 0);
            int[] var5 = this.method1146((byte) 125, arg1, 0);
            int[] var6 = this.method1146((byte) 125, arg1 + 1 & class10.field133, 0);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class174.field2648; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field3514;
                int var12 = (var5[var10 + 1 & class53.field873] + -var5[class53.field873 & var10 + -1]) * this.field3514;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field3509) {
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var10] = var20;
                var7[var10] = var19;
                var9[var10] = var18;
            }
        }
        ++field3517;
        return !arg0 ? null : var3;
    }
}
