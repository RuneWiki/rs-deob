import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class502 extends class694 {

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    private int field6873 = 4096;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "Luc;")
    public static class27 field6874 = new class27(11, 7);

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field6875 = -50;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 7)
    public class502() {
        super(1, true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I", line = 15)
    public final int[] method39(int arg0, int arg1) {
        ++field6876;
        if (arg0 <= 112) {
            this.field6873 = 118;
        }
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int[] var4 = this.method3809(0, arg1 + -1 & class384.field5383, (byte) 35);
            int[] var5 = this.method3809(0, arg1, (byte) 35);
            int[] var6 = this.method3809(0, arg1 + 1 & class384.field5383, (byte) 35);
            for (int var7 = 0; ~class465.field6544 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field6873;
                int var9 = (var5[class168.field2537 & var7 + 1] + -var5[class168.field2537 & var7 + -1]) * this.field6873;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "i", descriptor = "(I)V", line = 72)
    public static void method2799(int arg0) {
        field6874 = null;
        if (arg0 != -28509) {
            method2799(126);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjr;B)V", line = 83)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field6873 = arg1.method743((byte) -60);
        }
        int var4 = -1 % ((arg2 - 58) / 63);
        ++field6872;
    }
}
