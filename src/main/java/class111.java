import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class111 extends class115 {

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    private int field1596 = 4;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    private int field1598 = 4;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "[I")
    public static int[] field1594 = new int[14];

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "[I")
    public static int[] field1599 = new int[32];

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field1597 = 0;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "[[[B")
    public static byte[][][] field1600;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1602;
        if (arg0 != 242152972) {
            return null;
        } else {
            int[] var3 = super.field1705.method463(arg1, false);
            if (super.field1705.field1072) {
                int var4 = class77.field1178 / this.field1598;
                int var5 = class192.field2753 / this.field1596;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method797(0, 0, 114);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method797(0, class192.field2753 * var7 / var5, 120);
                }
                for (int var8 = 0; var8 < class77.field1178; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class77.field1178 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field1603;
        int[][] var3 = super.field1716.method6(arg1, (byte) 52);
        if (arg0 > -33) {
            this.field1598 = -110;
        }
        if (super.field1716.field23) {
            int var4 = class77.field1178 / this.field1598;
            int var5 = class192.field2753 / this.field1596;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method798(0, 0, class192.field2753 * var6 / var5);
            } else {
                var7 = this.method798(0, 0, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var3[1];
            int[] var11 = var7[2];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class77.field1178; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class77.field1178 * var16 / var4;
                }
                var12[var14] = var9[var15];
                var10[var14] = var8[var15];
                var13[var14] = var11[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class111() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field1596 = arg1.method760(false);
            }
        } else {
            this.field1598 = arg1.method760(false);
        }
        if (arg0 == -1) {
            ++field1595;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public static void method724(int arg0) {
        field1594 = null;
        if (arg0 < 33) {
            method724(-2);
        }
        field1599 = null;
        field1600 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZILve;I)[Lij;")
    public static final class69[] method725(boolean arg0, int arg1, class233 arg2, int arg3) {
        ++field1601;
        if (arg0) {
            return null;
        } else {
            return !class110.method718(arg2, (byte) -117, arg1, arg3) ? null : class131.method901(-14549);
        }
    }
}
