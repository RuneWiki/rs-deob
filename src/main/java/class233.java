import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class233 extends class68 {

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field3516 = 4096;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Z")
    private boolean field3519 = true;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Lh;")
    public static class278 field3518 = new class278(5000);

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field3520 = -1;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "Lic;")
    public static class143 field3522 = new class143(64);

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "Lse;")
    public static class211 field3524 = null;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "[I")
    public static int[] field3523;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)V")
    public static void method1536(int arg0) {
        field3524 = null;
        field3522 = null;
        int var1 = 34 / ((-48 - arg0) / 57);
        field3518 = null;
        field3523 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class233() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        int var3 = 4 % ((arg1 - 63) / 61);
        ++field3517;
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int[] var5 = this.method423(0, (byte) -54, class17.field184 & arg0 + -1);
            int[] var6 = this.method423(0, (byte) -54, arg0);
            int[] var7 = this.method423(0, (byte) -54, class17.field184 & arg0 - -1);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; ~var11 > ~class89.field1248; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field3516;
                int var13 = (var6[class173.field2411 & var11 + 1] + -var6[class173.field2411 & var11 + -1]) * this.field3516;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                } else {
                    var21 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field3519) {
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var8[var11] = var21;
                var9[var11] = var20;
                var10[var11] = var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    this.field3519 = ~arg0.method1453((byte) -127) == -2;
                }
            } else {
                this.field3516 = arg0.method1445(false);
            }
            ++field3515;
        }
    }
}
