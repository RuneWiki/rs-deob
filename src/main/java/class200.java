import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class200 extends class278 {

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    private int field2857 = 3072;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    private int field2860 = 1024;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    private int field2854 = 2048;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field2856 = 0;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "[[I")
    public static int[][] field2862 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[[I")
    public final int[][] method324(int arg0, int arg1) {
        ++field2859;
        if (arg0 <= 75) {
            this.field2854 = -30;
        }
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int[][] var4 = this.method1568(5426, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class507.field7456; ++var11) {
                var8[var11] = this.field2860 - -(var5[var11] * this.field2854 >> 12);
                var9[var11] = (var6[var11] * this.field2854 >> 12) + this.field2860;
                var10[var11] = (var7[var11] * this.field2854 >> 12) + this.field2860;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3754 = arg0.method2099(arg1 ^ -30227) == 1;
                }
            } else {
                this.field2857 = arg0.method2062((byte) 14);
            }
        } else {
            this.field2860 = arg0.method2062((byte) 14);
        }
        if (arg1 != -30446) {
            this.method208(17, 85);
        }
        ++field2858;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class200() {
        super(1, false);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            this.field2860 = 72;
        }
        ++field2861;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int[] var4 = this.method1570(0, 0, arg1);
            for (int var5 = 0; ~var5 > ~class507.field7456; ++var5) {
                var3[var5] = (var4[var5] * this.field2854 >> 12) + this.field2860;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public static void method1233(boolean arg0) {
        field2862 = null;
        if (arg0) {
            field2862 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public final void method207(int arg0) {
        ++field2855;
        if (arg0 != 2) {
            this.field2857 = 42;
        }
        this.field2854 = -this.field2860 + this.field2857;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)Z")
    public static final boolean method1234(int arg0, int arg1, int arg2) {
        ++field2863;
        int var3 = -38 / ((arg0 - 38) / 38);
        return ~(2048 & arg2) != -1 && (arg1 & 55) != 0;
    }
}
