import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class246 extends class646 {

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    private int field3578 = 4;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    private int field3577 = 4;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Ljn;")
    public static class117 field3574 = new class117(8);

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field3583 = 64;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Lvh;")
    public static class125 field3581 = new class125(28, 7);

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Lll;")
    public static class490 field3584;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V", line = 8)
    public static final void method1583(int arg0, int arg1) {
        ++field3580;
        if (arg1 != 11475) {
            method1583(42, -45);
        }
        if (class56.method437((byte) 61, arg0)) {
            class124.method996(-1, 124, class265.field3806[arg0]);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method298(int arg0, int arg1) {
        if (arg0 != -12424) {
            this.method424(-107, (byte) 69);
        }
        ++field3579;
        int[][] var3 = super.field9164.method1002(115, arg1);
        if (super.field9164.field2082) {
            int var4 = class89.field1330 / this.field3578;
            int var5 = class236.field3492 / this.field3577;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method3626(70, class236.field3492 * var6 / var5, 0);
            } else {
                var7 = this.method3626(44, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class89.field1330 < ~var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class89.field1330 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIZI)V", line = 92)
    public static final void method1584(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        int var5 = 69 / ((arg0 - -50) / 33);
        ++field3582;
        class382.field5353 = 0L;
        int var6 = class154.method1160(112);
        if (~arg2 == -4 || var6 == 3) {
            arg3 = true;
        }
        if (!class637.field9048.method766()) {
            arg3 = true;
        }
        class591.method3389(arg1, arg2, 0, arg3, var6, arg4);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 168)
    public class246() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lek;IB)V", line = 115)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 >= 7) {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    this.field3577 = arg0.method2705(-42);
                }
            } else {
                this.field3578 = arg0.method2705(-103);
            }
            ++field3575;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V", line = 150)
    public static void method1585(boolean arg0) {
        if (!arg0) {
            method1585(false);
        }
        field3581 = null;
        field3584 = null;
        field3574 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IB)[I", line = 175)
    public final int[] method424(int arg0, byte arg1) {
        ++field3576;
        if (arg1 != -120) {
            field3574 = null;
        }
        int[] var3 = super.field9156.method2193(arg1 + 1389, arg0);
        if (super.field9156.field5075) {
            int var4 = class89.field1330 / this.field3578;
            int var5 = class236.field3492 / this.field3577;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method3628(false, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method3628(false, 0, class236.field3492 * var7 / var5);
            }
            for (int var8 = 0; ~var8 > ~class89.field1330; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class89.field1330 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }
}
