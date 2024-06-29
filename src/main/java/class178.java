import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class178 extends class573 {

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "I")
    private int field2898 = 4096;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "Lqfa;")
    public static class85 field2897 = new class85(39, -1);

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "(I)V")
    public static void method1321(int arg0) {
        field2897 = null;
        if (arg0 != 4096) {
            field2897 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field2896;
        int[] var3 = super.field8321.method3164(arg0, -120);
        if (super.field8321.field7825) {
            int[] var4 = this.method3292(0, 0, arg0 + -1 & class189.field3019);
            int[] var5 = this.method3292(0, 0, arg0);
            int[] var6 = this.method3292(0, arg1 ^ 1, arg0 - -1 & class189.field3019);
            for (int var7 = 0; class540.field7555 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2898;
                int var9 = (var5[class591.field8492 & var7 + 1] + -var5[var7 - 1 & class591.field8492]) * this.field2898;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != 1) {
            field2897 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            field2897 = null;
        }
        if (~arg1 == -1) {
            this.field2898 = arg0.method723((byte) -25);
        }
        ++field2894;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, true);
    }
}
