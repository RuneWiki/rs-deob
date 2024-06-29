import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class434 extends class214 {

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
    private int field5970 = 4096;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "Lfn;")
    public static class52 field5969 = new class52(57, -2);

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "F")
    public static float field5966;

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 7)
    public class434() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Llk;II)V", line = 12)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field5967;
        if (arg1 <= -114) {
            if (~arg2 == -1) {
                this.field5970 = arg0.method2508(true);
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)[I", line = 38)
    public final int[] method14(byte arg0, int arg1) {
        ++field5968;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int[] var4 = this.method1352(class183.field2659 & arg1 - 1, 0, arg0 ^ -50);
            int[] var5 = this.method1352(arg1, 0, -109);
            int[] var6 = this.method1352(class183.field2659 & arg1 - -1, 0, -80);
            for (int var7 = 0; ~class399.field5585 < ~var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field5970;
                int var9 = (var5[var7 + 1 & class467.field6551] + -var5[var7 + -1 & class467.field6551]) * this.field5970;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg0 != 123) {
            method2529(-22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V", line = 90)
    public static void method2529(int arg0) {
        field5969 = null;
        if (arg0 != 1) {
            field5969 = null;
        }
    }
}
