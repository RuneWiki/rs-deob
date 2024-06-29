import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class265 extends class40 {

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    private int field3893 = 4096;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "Z")
    public static boolean field3895 = false;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "[I")
    public static int[] field3892 = new int[50];

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field3897 = 0;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
    public static int field3898 = -1;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        if (arg0 >= -20) {
            return null;
        } else {
            ++field3896;
            int[] var3 = super.field551.method185(65280, arg1);
            if (super.field551.field441) {
                int[] var4 = this.method266((byte) -116, arg1 + -1 & class169.field2395, 0);
                int[] var5 = this.method266((byte) -116, arg1, 0);
                int[] var6 = this.method266((byte) -116, class169.field2395 & arg1 + 1, 0);
                for (int var7 = 0; ~class410.field5886 < ~var7; ++var7) {
                    int var8 = (var6[var7] - var4[var7]) * this.field3893;
                    int var9 = (var5[var7 - -1 & class84.field1067] + -var5[var7 + -1 & class84.field1067]) * this.field3893;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                    int var15 = var14 == 0 ? 0 : 16777216 / var14;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
    public class265() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "(B)V")
    public static void method1818(byte arg0) {
        if (arg0 <= 9) {
            method1818((byte) 56);
        }
        field3892 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg1 > 79) {
            if (arg0 == 0) {
                this.field3893 = arg2.method798(false);
            }
            ++field3894;
        }
    }
}
