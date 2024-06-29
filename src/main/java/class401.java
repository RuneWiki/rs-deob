import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class401 extends class404 {

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
    private int field5839 = 4;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "I")
    private int field5836 = 4;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
    public static int field5838 = 2;

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "Loe;")
    public static class127 field5840 = new class127(106, -1);

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!vs", name = "H", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!vs", name = "I", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!vs", name = "J", descriptor = "Lwn;")
    public static class488 field5845;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method90(int arg0, int arg1) {
        if (arg0 >= -47) {
            method2382(85, -119, false);
        }
        ++field5844;
        int[] var3 = super.field5870.method372(arg1, (byte) -124);
        if (super.field5870.field810) {
            int var4 = class431.field6348 / this.field5836;
            int var5 = class437.field6437 / this.field5839;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method2394(0, (byte) 64, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2394(0, (byte) 64, class437.field6437 * var7 / var5);
            }
            for (int var8 = 0; ~var8 > ~class431.field6348; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class431.field6348 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)V", line = 57)
    public static void method2381(boolean arg0) {
        if (!arg0) {
            method2382(103, 76, true);
        }
        field5840 = null;
        field5845 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILha;I)V", line = 68)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field5843;
        if (arg0 != 0) {
            method2382(-98, 125, true);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field5839 = arg1.method257((byte) 53);
            }
        } else {
            this.field5836 = arg1.method257((byte) 58);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZ)I", line = 108)
    public static final int method2382(int arg0, int arg1, boolean arg2) {
        ++field5837;
        int var3 = 0;
        while (~arg1 < -1) {
            var3 = var3 << 1 | arg0 & 1;
            --arg1;
            arg0 >>>= 1;
        }
        return arg2 ? -21 : var3;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V", line = 134)
    public class401() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)[[I", line = 146)
    public final int[][] method89(int arg0, int arg1) {
        ++field5842;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (arg0 != -1) {
            return null;
        } else {
            if (super.field5869.field7156) {
                int var4 = class431.field6348 / this.field5836;
                int var5 = class437.field6437 / this.field5839;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method2400(-11872, class437.field6437 * var6 / var5, 0);
                } else {
                    var7 = this.method2400(arg0 ^ 11871, 0, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class431.field6348 < ~var14; ++var14) {
                    int var15;
                    if (var4 <= 0) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class431.field6348 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var13[var14] = var10[var15];
                }
            }
            return var3;
        }
    }
}
