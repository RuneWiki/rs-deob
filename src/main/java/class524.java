import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class524 extends class192 {

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    private int field6821 = 4;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    private int field6824 = 4;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Leg;")
    public static class366 field6825 = new class366();

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6827;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "[[S")
    public static short[][] field6828;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method118(int arg0, byte arg1) {
        ++field6822;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 > -123) {
            method2807((long[]) null, -126, (int[]) null);
        }
        if (super.field2448.field7266) {
            int var4 = class561.field7319 / this.field6821;
            int var5 = class505.field6643 / this.field6824;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1253(0, class505.field6643 * var6 / var5, 0);
            } else {
                var7 = this.method1253(0, 0, 0);
            }
            for (int var8 = 0; ~class561.field7319 < ~var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class561.field7319 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)[[I", line = 56)
    public final int[][] method107(int arg0, byte arg1) {
        ++field6820;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        int var4 = -88 % ((arg1 - -14) / 34);
        if (super.field2467.field5565) {
            int var5 = class561.field7319 / this.field6821;
            int var6 = class505.field6643 / this.field6824;
            int[][] var8;
            if (~var6 < -1) {
                int var7 = arg0 % var6;
                var8 = this.method1251(0, class505.field6643 * var7 / var6, (byte) -38);
            } else {
                var8 = this.method1251(0, 0, (byte) 89);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var3[0];
            int[] var13 = var3[1];
            int[] var14 = var3[2];
            for (int var15 = 0; ~var15 > ~class561.field7319; ++var15) {
                int var16;
                if (var5 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class561.field7319 * var17 / var5;
                }
                var12[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V", line = 123)
    public static void method2806(byte arg0) {
        field6828 = null;
        field6825 = null;
        if (arg0 > 56) {
            field6827 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([JI[I)V", line = 137)
    public static final void method2807(long[] arg0, int arg1, int[] arg2) {
        class437.method2485(0, arg2, 80, arg0, arg0.length - arg1);
        ++field6823;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 193)
    public class524() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILfd;I)V", line = 154)
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field6826;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field6824 = arg1.method2396(46);
            }
        } else {
            this.field6821 = arg1.method2396(arg2 + 12226);
        }
        if (arg2 != -12160) {
            field6828 = null;
        }
    }
}
