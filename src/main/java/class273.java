import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class273 extends class166 {

    @OriginalMember(owner = "client!li", name = "T", descriptor = "Z")
    private boolean field4831 = true;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "Z")
    private boolean field4834 = true;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "[I")
    public static int[] field4827 = new int[2];

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "Lnc;")
    public static class83 field4826;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "[Lwb;")
    public static class26[] field4833;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field4832;
        if (arg0 != 96) {
            field4828 = -4;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3074 = arg1.method937(false) == 1;
                }
            } else {
                this.field4831 = ~arg1.method937(false) == -2;
            }
        } else {
            this.field4834 = ~arg1.method937(false) == -2;
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public static void method1864(int arg0) {
        field4826 = null;
        field4833 = null;
        field4827 = null;
        if (arg0 != 0) {
            method1866(14, 104, 101);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4835;
        if (arg1 != 8388607) {
            this.method134(112, -120);
        }
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(27, this.field4831 ? class138.field2583 - arg0 : arg0, 0);
            if (this.field4834) {
                for (int var5 = 0; class253.field4565 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class12.field183];
                }
            } else {
                class1.method1(var4, 0, var3, 0, class253.field4565);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        int[][] var3 = super.field3064.method320(arg1, (byte) -104);
        if (arg0 != 0) {
            method1866(88, -2, -121);
        }
        if (super.field3064.field979) {
            int[][] var4 = this.method1229(this.field4831 ? -arg1 + class138.field2583 : arg1, 23580, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (!this.field4834) {
                for (int var11 = 0; ~class253.field4565 < ~var11; ++var11) {
                    var6[var11] = var5[var11];
                    var10[var11] = var8[var11];
                    var9[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class253.field4565 > var12; ++var12) {
                    var6[var12] = var5[-var12 + class12.field183];
                    var10[var12] = var8[class12.field183 - var12];
                    var9[var12] = var7[class12.field183 - var12];
                }
            }
        }
        ++field4829;
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V")
    public static final void method1865(int arg0) {
        class170.field3118 = -1;
        if (arg0 != -9435) {
            field4828 = 51;
        }
        class13.field190 = -1;
        class265.field4715 = 0;
        class177.field3218 = 0;
        class129.field2408 = 0;
        class163.field3016 = -1;
        class208.field3789 = 0;
        class48.field692.field2379 = 0;
        class157.field2930 = -1;
        class199.field3595.field2379 = 0;
        class33.field451 = 0;
        class103.field1936 = false;
        class230.field4213 = 0;
        ++field4830;
        for (int var1 = 0; var1 < class35.field491.length; ++var1) {
            if (class35.field491[var1] != null) {
                class35.field491[var1].field4025 = -1;
            }
        }
        for (int var2 = 0; class131.field2428.length > var2; ++var2) {
            if (class131.field2428[var2] != null) {
                class131.field2428[var2].field4025 = -1;
            }
        }
        class192.method1394(arg0 ^ -9467);
        class265.field4711 = 1;
        class115.method851(arg0 ^ -9393, 30);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class40.field576[var3] = true;
        }
        class171.method1254(-29135);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(III)Ljd;")
    public static final class85 method1866(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field3940; ++var4) {
                class85 var5 = var3.field3933[var4];
                if ((var5.field1656 >> 29 & 3L) == 2L && var5.field1662 == arg1 && var5.field1653 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }
}
