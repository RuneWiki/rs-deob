import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class369 extends class11 {

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    private int field5400 = 4096;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field5401 = 0;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class369() {
        super(1, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 > -40) {
            field5401 = 67;
        }
        if (~arg2 == -1) {
            this.field5400 = arg0.method2353((byte) 80);
        }
        ++field5402;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field5399;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int[] var4 = this.method48(class183.field2683 & arg1 - 1, 0, (byte) -87);
            int[] var5 = this.method48(arg1, 0, (byte) -44);
            int[] var6 = this.method48(class183.field2683 & arg1 + 1, 0, (byte) -74);
            for (int var7 = 0; ~class90.field1316 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field5400;
                int var9 = (var5[var7 - -1 & class99.field1490] + -var5[var7 - 1 & class99.field1490]) * this.field5400;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg0 > -42) {
            this.method43((class391) null, -65, -3);
        }
        return var3;
    }
}
