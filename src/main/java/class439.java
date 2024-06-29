import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class439 extends class83 {

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "Z")
    private boolean field6427 = true;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    private int field6428 = 4096;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "J")
    public static long field6425;

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 18)
    public class439() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBLtq;)V", line = 28)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field6426;
        int var4 = 31 / ((arg1 - -27) / 50);
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field6427 = ~arg2.method1350(31351) == -2;
            }
        } else {
            this.field6428 = arg2.method1374(-2);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)[[I", line = 63)
    public final int[][] method21(boolean arg0, int arg1) {
        ++field6424;
        int[][] var3 = super.field927.method1774((byte) -39, arg1);
        if (!arg0) {
            field6425 = 75L;
        }
        if (super.field927.field4104) {
            int[] var4 = this.method451(0, 82, arg1 + -1 & class109.field1348);
            int[] var5 = this.method451(0, 125, arg1);
            int[] var6 = this.method451(0, 82, class109.field1348 & arg1 - -1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class420.field6139; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field6428;
                int var12 = (var5[var10 - -1 & class213.field2881] + -var5[class213.field2881 & var10 - 1]) * this.field6428;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field6427) {
                    var18 = 2048 - -(var18 >> 1);
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }
}
