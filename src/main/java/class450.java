import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class450 extends class615 {

    @OriginalMember(owner = "client!cga", name = "H", descriptor = "Z")
    private boolean field6168 = true;

    @OriginalMember(owner = "client!cga", name = "N", descriptor = "Z")
    private boolean field6174 = true;

    @OriginalMember(owner = "client!cga", name = "M", descriptor = "Lcu;")
    public static class206 field6173 = new class206(51, 3);

    @OriginalMember(owner = "client!cga", name = "O", descriptor = "Ldb;")
    public static class298 field6175 = new class298(11, 6);

    @OriginalMember(owner = "client!cga", name = "F", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!cga", name = "I", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!cga", name = "J", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!cga", name = "K", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!cga", name = "L", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!cga", name = "Q", descriptor = "Lta;")
    public static class200 field6177;

    @OriginalMember(owner = "client!cga", name = "P", descriptor = "Lii;")
    public static class519 field6176;

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V", line = 7)
    public class450() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)V", line = 10)
    public static final void method2558(int arg0) {
        class654.field8866 = 0;
        if (arg0 != 26592) {
            method2558(-39);
        }
        ++field6169;
        int var1 = (class199.field2897.field8620 >> 9) - -class473.field6334;
        int var2 = (class199.field2897.field8612 >> 9) + class233.field3269;
        if (~var1 <= -3054 && var1 <= 3156 && var2 >= 3056 && ~var2 >= -3137) {
            class654.field8866 = 1;
        }
        if (~var1 <= -3073 && ~var1 >= -3119 && ~var2 <= -9493 && ~var2 >= -9536) {
            class654.field8866 = 1;
        }
        if (~class654.field8866 == -2 && ~var1 <= -3140 && ~var1 >= -3200 && var2 >= 3008 && ~var2 >= -3063) {
            class654.field8866 = 0;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V", line = 45)
    public static void method2559(boolean arg0) {
        field6173 = null;
        if (arg0) {
            field6177 = null;
        }
        field6177 = null;
        field6176 = null;
        field6175 = null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IB)[I", line = 58)
    public final int[] method8(int arg0, byte arg1) {
        ++field6170;
        int[] var3 = super.field8125.method298(arg0, -117);
        if (super.field8125.field579) {
            int[] var4 = this.method3366(0, 997, !this.field6168 ? arg0 : -arg0 + class658.field9107);
            if (this.field6174) {
                for (int var5 = 0; ~class505.field6740 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class313.field4306];
                }
            } else {
                class83.method682(var4, 0, var3, 0, class505.field6740);
            }
        }
        return arg1 != -18 ? null : var3;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BILeh;)V", line = 96)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 > 44) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        super.field8118 = ~arg2.method2034(255) == -2;
                    }
                } else {
                    this.field6168 = ~arg2.method2034(255) == -2;
                }
            } else {
                this.field6174 = arg2.method2034(255) == 1;
            }
            ++field6167;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)[[I", line = 140)
    public final int[][] method223(int arg0, int arg1) {
        ++field6172;
        if (arg0 != 2) {
            field6177 = null;
        }
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int[][] var4 = this.method3368(true, 0, this.field6168 ? -arg1 + class658.field9107 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6174) {
                for (int var11 = 0; class505.field6740 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; var12 < class505.field6740; ++var12) {
                    var8[var12] = var5[-var12 + class313.field4306];
                    var9[var12] = var6[-var12 + class313.field4306];
                    var10[var12] = var7[-var12 + class313.field4306];
                }
            }
        }
        return var3;
    }
}
