import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class488 extends class397 {

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
    private int field7465 = 4096;

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
    private int field7466 = 4096;

    @OriginalMember(owner = "client!wn", name = "S", descriptor = "I")
    private int field7469 = 4096;

    @OriginalMember(owner = "client!wn", name = "R", descriptor = "Liu;")
    public static class390 field7468 = new class390(30, 2);

    @OriginalMember(owner = "client!wn", name = "T", descriptor = "Lum;")
    public static class347 field7470 = new class347();

    @OriginalMember(owner = "client!wn", name = "U", descriptor = "Liu;")
    public static class390 field7471 = new class390(70, 12);

    @OriginalMember(owner = "client!wn", name = "V", descriptor = "[[I")
    public static int[][] field7472 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!wn", name = "Q", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
    public class488() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V")
    public static void method2932(int arg0) {
        field7471 = null;
        field7470 = null;
        field7472 = null;
        if (arg0 == 6) {
            field7468 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        ++field7467;
        int[][] var3 = super.field5848.method1692(arg1, 116);
        if (super.field5848.field3939) {
            int[][] var4 = this.method2377(arg1, -109, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class164.field2152 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field7469 * var12 >> 12;
                    var9[var11] = this.field7466 * var13 >> 12;
                    var10[var11] = this.field7465 * var14 >> 12;
                } else {
                    var8[var11] = this.field7469;
                    var9[var11] = this.field7466;
                    var10[var11] = this.field7465;
                }
            }
        }
        if (arg0 < 81) {
            this.method486((byte) -37, 44);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 != 80) {
            this.field7469 = -87;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field7465 = arg2.method993((byte) -61);
                }
            } else {
                this.field7466 = arg2.method993((byte) -60);
            }
        } else {
            this.field7469 = arg2.method993((byte) -72);
        }
        ++field7464;
    }
}
