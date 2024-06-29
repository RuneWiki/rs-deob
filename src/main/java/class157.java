import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class157 extends class5 {

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    private int field2044 = 4096;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    private int field2046 = 0;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "Lrga;")
    public static class280 field2042 = new class280(20, 6);

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "[Z")
    public static boolean[] field2047 = new boolean[8];

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "Lf;")
    public static class536 field2048;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)V")
    public static void method898(int arg0) {
        field2047 = null;
        field2042 = null;
        if (arg0 < 23) {
            method898(-17);
        }
        field2048 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field2050;
        if (!arg1) {
            this.method39(6, 70);
        }
        int[][] var3 = super.field135.method2706(arg0, -70);
        if (super.field135.field6667) {
            int[][] var4 = this.method45(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class657.field9287; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field2046) {
                    if (~this.field2044 > ~var12) {
                        var8[var11] = this.field2044;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field2046;
                }
                if (var13 < this.field2046) {
                    var9[var11] = this.field2046;
                } else if (var13 > this.field2044) {
                    var9[var11] = this.field2044;
                } else {
                    var9[var11] = var13;
                }
                if (~this.field2046 < ~var14) {
                    var10[var11] = this.field2046;
                } else if (var14 > this.field2044) {
                    var10[var11] = this.field2044;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field2043;
        int var3 = -112 / ((81 - arg0) / 36);
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int[] var5 = this.method49(arg1, false, 0);
            for (int var6 = 0; ~var6 > ~class657.field9287; ++var6) {
                int var7 = var5[var6];
                if (this.field2046 > var7) {
                    var4[var6] = this.field2046;
                } else if (var7 > this.field2044) {
                    var4[var6] = this.field2044;
                } else {
                    var4[var6] = var7;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field2049;
        if (arg0 != 1) {
            field2045 = 53;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field120 = arg1.method3501(-9268) == 1;
                }
            } else {
                this.field2044 = arg1.method3470(13111);
            }
        } else {
            this.field2046 = arg1.method3470(13111);
        }
    }
}
