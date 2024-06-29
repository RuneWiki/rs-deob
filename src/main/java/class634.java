import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class634 extends class5 {

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    private int field8887 = 4;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    private int field8885 = 4;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILes;I)V", line = 3)
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field8888;
        if (arg0 == 1) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field8885 = arg1.method3501(-9268);
                }
            } else {
                this.field8887 = arg1.method3501(-9268);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[I", line = 39)
    public final int[] method39(int arg0, int arg1) {
        int var3 = -56 % ((81 - arg0) / 36);
        ++field8889;
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int var5 = class657.field9287 / this.field8887;
            int var6 = class622.field8706 / this.field8885;
            int[] var8;
            if (~var6 < -1) {
                int var7 = arg1 % var6;
                var8 = this.method49(class622.field8706 * var7 / var6, false, 0);
            } else {
                var8 = this.method49(0, false, 0);
            }
            for (int var9 = 0; ~class657.field9287 < ~var9; ++var9) {
                if (~var5 >= -1) {
                    var4[var9] = var8[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var8[class657.field9287 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[IBI[I)V", line = 90)
    public static final void method3543(int arg0, int[] arg1, byte arg2, int arg3, int[] arg4) {
        ++field8886;
        if (arg2 == 8) {
            if (~arg3 < ~arg0) {
                int var5 = (arg0 - -arg3) / 2;
                int var6 = arg0;
                int var7 = arg4[var5];
                arg4[var5] = arg4[arg3];
                arg4[arg3] = var7;
                int var8 = arg1[var5];
                arg1[var5] = arg1[arg3];
                arg1[arg3] = var8;
                int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
                for (int var10 = arg0; ~arg3 < ~var10; ++var10) {
                    if (~((var10 & var9) + var7) < ~arg4[var10]) {
                        int var11 = arg4[var10];
                        arg4[var10] = arg4[var6];
                        arg4[var6] = var11;
                        int var12 = arg1[var10];
                        arg1[var10] = arg1[var6];
                        arg1[var6++] = var12;
                    }
                }
                arg4[arg3] = arg4[var6];
                arg4[var6] = var7;
                arg1[arg3] = arg1[var6];
                arg1[var6] = var8;
                method3543(arg0, arg1, (byte) 8, var6 - 1, arg4);
                method3543(var6 + 1, arg1, (byte) 8, arg3, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)[[I", line = 146)
    public final int[][] method44(int arg0, boolean arg1) {
        ++field8890;
        int[][] var3 = super.field135.method2706(arg0, -41);
        if (!arg1) {
            this.field8887 = 38;
        }
        if (super.field135.field6667) {
            int var4 = class657.field9287 / this.field8887;
            int var5 = class622.field8706 / this.field8885;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method45(0, class622.field8706 * var6 / var5, 0);
            } else {
                var7 = this.method45(0, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class657.field9287 > var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class657.field9287 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 220)
    public class634() {
        super(1, false);
    }
}
