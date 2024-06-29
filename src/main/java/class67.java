import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class67 extends class634 {

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    private int field678 = 3216;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    private int field684 = 4096;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    private int field686 = 3216;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "[I")
    private int[] field687 = new int[3];

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "[I")
    public static int[] field677 = new int[14];

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "[[I")
    public static int[][] field685 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "Z")
    public static boolean field683 = true;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 6)
    public static void method495(boolean arg0) {
        field677 = null;
        field685 = null;
        if (!arg0) {
            field683 = true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)[I", line = 21)
    public final int[] method13(byte arg0, int arg1) {
        ++field679;
        if (arg0 >= -55) {
            this.field687 = null;
        }
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int var4 = class291.field3584 * this.field684 >> 12;
            int[] var5 = this.method3641(class312.field3870 & arg1 + -1, 20604, 0);
            int[] var6 = this.method3641(arg1, 20604, 0);
            int[] var7 = this.method3641(arg1 + 1 & class312.field3870, 20604, 0);
            for (int var8 = 0; ~var8 > ~class635.field9139; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class110.field1162 & var8 + -1] - var6[class110.field1162 & var8 - -1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class533.field7711[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field687[2] * var16 >> 12;
                int var18 = this.field687[0] * var15 >> 12;
                int var19 = this.field687[1] * var14 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 93)
    private final void method496(int arg0) {
        ++field682;
        double var2 = Math.cos((double) ((float) this.field678 / 4096.0F));
        this.field687[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field686 / 4096.0F)));
        this.field687[1] = (int) (Math.cos((double) ((float) this.field686 / 4096.0F)) * var2 * 4096.0D);
        this.field687[2] = (int) (4096.0D * Math.sin((double) ((float) this.field678 / 4096.0F)));
        if (arg0 >= -26) {
            field683 = false;
        }
        int var4 = this.field687[0] * this.field687[0] >> 12;
        int var5 = this.field687[1] * this.field687[1] >> 12;
        int var6 = this.field687[2] * this.field687[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (var7 != 0) {
            this.field687[1] = (this.field687[1] << 12) / var7;
            this.field687[2] = (this.field687[2] << 12) / var7;
            this.field687[0] = (this.field687[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 129)
    public final void method87(byte arg0) {
        if (arg0 < 65) {
            this.method496(-41);
        }
        this.method496(-115);
        ++field681;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 204)
    public class67() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILig;Z)V", line = 153)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (!arg2) {
            ++field680;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field678 = arg1.method1476(16);
                    }
                } else {
                    this.field686 = arg1.method1476(34);
                }
            } else {
                this.field684 = arg1.method1476(114);
            }
        }
    }
}
