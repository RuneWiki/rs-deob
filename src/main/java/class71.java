import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class71 extends class17 {

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    private int field887 = 4096;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "Lrd;")
    public static class226 field884 = new class226();

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public static int field885 = -1;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "Lle;")
    public static class205 field886 = new class205("stellardawn", 1);

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "Lum;")
    public static class370 field889;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "Lwm;")
    public static class403 field882;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method27(int arg0, int arg1) {
        ++field883;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 < 53) {
            field889 = null;
        }
        if (super.field210.field6442) {
            int[] var4 = this.method88(class38.field417 & arg0 + -1, -4526, 0);
            int[] var5 = this.method88(arg0, -4526, 0);
            int[] var6 = this.method88(arg0 + 1 & class38.field417, -4526, 0);
            for (int var7 = 0; ~class530.field7763 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field887;
                int var9 = (var5[class43.field499 & var7 + 1] + -var5[class43.field499 & var7 + -1]) * this.field887;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 - -4096 + var12) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 55)
    public static void method537(byte arg0) {
        field882 = null;
        field884 = null;
        field886 = null;
        field889 = null;
        if (arg0 != 23) {
            method537((byte) 9);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 70)
    public class71() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lwm;II)V", line = 85)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field887 = arg0.method2338(0);
        }
        ++field888;
        if (arg2 != 5159) {
            this.field887 = 2;
        }
    }
}
