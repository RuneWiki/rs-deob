import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class92 extends class5 {

    @OriginalMember(owner = "client!ow", name = "K", descriptor = "I")
    private int field1286 = 4096;

    @OriginalMember(owner = "client!ow", name = "L", descriptor = "Z")
    private boolean field1287 = true;

    @OriginalMember(owner = "client!ow", name = "H", descriptor = "Lwp;")
    public static class453 field1283 = new class453(9, 20);

    @OriginalMember(owner = "client!ow", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1288 = null;

    @OriginalMember(owner = "client!ow", name = "I", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ow", name = "J", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V", line = 6)
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(B)V", line = 12)
    public static void method531(byte arg0) {
        if (arg0 >= -81) {
            field1283 = null;
        }
        field1283 = null;
        field1288 = null;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILes;I)V", line = 24)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1287 = ~arg1.method3501(-9268) == -2;
            }
        } else {
            this.field1286 = arg1.method3470(13111);
        }
        if (arg0 != 1) {
            this.field1287 = true;
        }
        ++field1285;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZ)[[I", line = 65)
    public final int[][] method44(int arg0, boolean arg1) {
        ++field1284;
        int[][] var3 = super.field135.method2706(arg0, -108);
        if (super.field135.field6667) {
            int[] var4 = this.method49(class669.field9431 & arg0 + -1, !arg1, 0);
            int[] var5 = this.method49(arg0, false, 0);
            int[] var6 = this.method49(class669.field9431 & arg0 + 1, false, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class657.field9287; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1286;
                int var12 = (var5[var10 + 1 & class194.field2440] - var5[var10 + -1 & class194.field2440]) * this.field1286;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 - -4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field1287) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return !arg1 ? null : var3;
    }
}
