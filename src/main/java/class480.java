import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class480 extends class328 {

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field6825 = 0;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "[Z")
    public static boolean[] field6824 = new boolean[8];

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V", line = 3)
    public static final void method2765(boolean arg0, int arg1, String arg2, String arg3) {
        class501.field7029 = arg0;
        class621.field8755 = arg2;
        ++field6823;
        class646.field9387 = arg3;
        if (class501.field7029 || ~class490.field6891 == -4 || !class646.field9387.equals("") && !class621.field8755.equals("")) {
            if (class490.field6891 != 1) {
                class340.field4886 = -1;
                class634.field9222 = 0;
            }
            class554.field7835 = false;
            class276.method1780(16711935, -3);
            class133.field2152 = arg1;
            class34.field461 = 0;
            class599.field8510 = 1;
        } else {
            class276.method1780(16711935, 3);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BILco;)V", line = 33)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (~arg1 == -1) {
            super.field4728 = ~arg2.method1738(255) == -2;
        }
        ++field6826;
        if (arg0 < 75) {
            this.method1((byte) -24, 89, (class268) null);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I", line = 47)
    public final int[] method4(int arg0, int arg1) {
        ++field6828;
        int[] var3 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int[] var4 = this.method2042(0, arg0, (byte) 119);
            int[] var5 = this.method2042(1, arg0, (byte) 119);
            int[] var6 = this.method2042(2, arg0, (byte) 119);
            for (int var7 = 0; ~var7 > ~class449.field6539; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        int var9 = -125 / ((48 - arg1) / 56);
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V", line = 98)
    public static void method2766(byte arg0) {
        if (arg0 < -108) {
            field6824 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 110)
    public class480() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[[I", line = 113)
    public final int[][] method7(int arg0, int arg1) {
        ++field6827;
        int[][] var3 = super.field4725.method1886((byte) 11, arg0);
        int var4 = -33 % ((46 - arg1) / 54);
        if (super.field4725.field4371) {
            int[] var5 = this.method2042(2, arg0, (byte) 119);
            int[][] var6 = this.method2040(0, arg0, 0);
            int[][] var7 = this.method2040(1, arg0, 0);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; ~class449.field6539 < ~var17; ++var17) {
                int var18 = var5[var17];
                if (var18 != 4096) {
                    if (var18 == 0) {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                    } else {
                        int var19 = -var18 + 4096;
                        var8[var17] = var11[var17] * var18 - -(var14[var17] * var19) >> 12;
                        var9[var17] = var12[var17] * var18 - -(var15[var17] * var19) >> 12;
                        var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                    }
                } else {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                }
            }
        }
        return var3;
    }
}
