import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class148 extends class512 {

    @OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
    private int field2400 = 4096;

    @OriginalMember(owner = "client!vu", name = "I", descriptor = "Z")
    private boolean field2402 = true;

    @OriginalMember(owner = "client!vu", name = "H", descriptor = "F")
    public static float field2401;

    @OriginalMember(owner = "client!vu", name = "J", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!vu", name = "K", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)[[I")
    public final int[][] method278(int arg0, int arg1) {
        ++field2404;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942) {
            int[] var4 = this.method3013(false, 0, class270.field4492 & arg1 + -1);
            int[] var5 = this.method3013(false, 0, arg1);
            int[] var6 = this.method3013(false, 0, class270.field4492 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class402.field6113 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2400;
                int var12 = (var5[class269.field4478 & var10 + 1] - var5[var10 - 1 & class269.field4478]) * this.field2400;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 - -4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var18 = var12 / var17;
                    var20 = var11 / var17;
                }
                if (this.field2402) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        int var21 = 35 / ((-40 - arg0) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (!arg0) {
            this.method278(-85, 126);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field2402 = ~arg2.method126((byte) -89) == -2;
            }
        } else {
            this.field2400 = arg2.method132(78);
        }
        ++field2403;
    }
}
