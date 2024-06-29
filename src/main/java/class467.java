import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class467 extends class5 {

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Z")
    private boolean field5931 = true;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Z")
    private boolean field5938 = true;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Lae;")
    public static class40 field5934 = new class40();

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IIII)I")
    public static final int method2469(int arg0, int arg1, int arg2, int arg3) {
        ++field5932;
        if (class491.field6485 == null) {
            return 0;
        } else {
            if (arg2 != -20214) {
                field5936 = 72;
            }
            int var4 = arg0 >> 9;
            int var5 = arg3 >> 9;
            if (var4 >= 0 && ~var5 <= -1 && class431.field5395 - 1 >= var4 && var5 <= class452.field5802 + -1) {
                int var6 = arg1;
                if (~arg1 > -4 && ~(class10.field190[1][var4][var5] & 2) != -1) {
                    var6 = arg1 + 1;
                }
                return class491.field6485[var6].method1565(arg3, arg0, true);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "i", descriptor = "(I)V")
    public static void method2470(int arg0) {
        field5934 = null;
        if (arg0 != 1) {
            field5939 = -4;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field5930;
        int[] var3 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int[] var4 = this.method49(this.field5931 ? class669.field9431 - arg1 : arg1, false, 0);
            if (this.field5938) {
                for (int var5 = 0; var5 < class657.field9287; ++var5) {
                    var3[var5] = var4[-var5 + class194.field2440];
                }
            } else {
                class293.method1640(var4, 0, var3, 0, class657.field9287);
            }
        }
        int var6 = 63 / ((arg0 - 81) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 == 1) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        super.field120 = ~arg1.method3501(arg0 + -9269) == -2;
                    }
                } else {
                    this.field5931 = ~arg1.method3501(-9268) == -2;
                }
            } else {
                this.field5938 = arg1.method3501(-9268) == 1;
            }
            ++field5935;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
    public static final void method2471(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5937;
        int var5 = arg4;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        class57.method362(-arg0 + arg3, class550.field7650[arg1], arg2, arg3 - -arg0, -104);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class550.field7650[arg1 + var6];
                int[] var10 = class550.field7650[-var6 + arg1];
                int var11 = arg3 + var5;
                int var12 = -var5 + arg3;
                class57.method362(var12, var9, arg2, var11, -126);
                class57.method362(var12, var10, arg2, var11, -106);
            }
            int var13 = arg3 + var6;
            int var14 = -var6 + arg3;
            int[] var15 = class550.field7650[arg1 + var5];
            int[] var16 = class550.field7650[-var5 + arg1];
            class57.method362(var14, var15, arg2, var13, 69);
            class57.method362(var14, var16, arg2, var13, arg4 + 26);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field5933;
        int[][] var3 = super.field135.method2706(arg0, -49);
        if (!arg1) {
            field5936 = 40;
        }
        if (super.field135.field6667) {
            int[][] var4 = this.method45(0, !this.field5931 ? arg0 : -arg0 + class669.field9431, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field5938) {
                for (int var11 = 0; var11 < class657.field9287; ++var11) {
                    var8[var11] = var5[-var11 + class194.field2440];
                    var9[var11] = var6[-var11 + class194.field2440];
                    var10[var11] = var7[class194.field2440 - var11];
                }
            } else {
                for (int var12 = 0; class657.field9287 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class467() {
        super(1, false);
    }
}
