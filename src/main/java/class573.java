import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class573 extends class440 {

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Lrw;")
    public static class703 field8065 = new class703(0, 1);

    @OriginalMember(owner = "client!a", name = "L", descriptor = "Lsn;")
    public static class583 field8067 = new class583("WTI", 5);

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "J")
    public static long field8061;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Lpga;")
    public static class494 field8063;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "[I")
    public static int[] field8064;

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 7)
    public class573() {
        super(3, false);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lla;ILvg;IILuq;Lua;ILjava/lang/String;BII)V", line = 13)
    public static final void method3254(class416 arg0, int arg1, class49 arg2, int arg3, int arg4, class146 arg5, class617 arg6, int arg7, String arg8, byte arg9, int arg10, int arg11) {
        ++field8062;
        int var12;
        if (class43.field700 == 4) {
            var12 = 16383 & (int) class630.field8811;
        } else {
            var12 = 16383 & (int) class630.field8811 + class252.field3880;
        }
        int var13 = Math.max(arg2.field967 / 2, arg2.field877 / 2) + 10;
        int var14 = arg4 * arg4 + arg10 * arg10;
        if (~(var13 * var13) <= ~var14) {
            int var15 = class189.field2719[var12];
            int var16 = class189.field2721[var12];
            if (~class43.field700 != -5) {
                var15 = var15 * 256 / (class287.field4280 + 256);
                var16 = var16 * 256 / (class287.field4280 + 256);
            }
            int var17 = arg4 * var16 + arg10 * var15 >> 14;
            int var18 = arg10 * var16 + -(arg4 * var15) >> 14;
            int var19 = arg5.method1037(arg8, (class702[]) null, 100, true);
            if (arg9 != -49) {
                field8066 = 16;
            }
            int var20 = arg5.method1036((class702[]) null, arg8, 100, (byte) 12, 0);
            int var21 = var17 - var19 / 2;
            if (-arg2.field967 <= var21 && ~var21 >= ~arg2.field967 && ~var18 <= ~(-arg2.field877) && ~arg2.field877 <= ~var18) {
                arg0.method2501((int[]) null, 0, arg2.field967 / 2 + (var21 - -arg1), 50, 0, arg6, arg8, 0, (class702[]) null, arg7, arg1, arg2.field877 / 2 + -var18 + -arg11 + -var20 + arg7, 0, var19, arg3, 1);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V", line = 62)
    public static void method3255(int arg0) {
        field8064 = null;
        field8067 = null;
        if (arg0 != -1) {
            method3255(63);
        }
        field8063 = null;
        field8065 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILmo;I)V", line = 77)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 != 5) {
            field8061 = 55L;
        }
        ++field8058;
        if (~arg2 == -1) {
            super.field6424 = ~arg1.method3826(false) == -2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[[I", line = 92)
    public final int[][] method763(int arg0, int arg1) {
        if (arg0 != -5766) {
            field8063 = null;
        }
        ++field8059;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (super.field6417.field9606) {
            int[] var4 = this.method2611(-24, arg1, 2);
            int[][] var5 = this.method2606(arg1, 0, -1);
            int[][] var6 = this.method2606(arg1, 1, -1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class549.field7715; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)[I", line = 174)
    public final int[] method229(byte arg0, int arg1) {
        ++field8060;
        int var3 = 121 / ((-56 - arg0) / 41);
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[] var5 = this.method2611(115, arg1, 0);
            int[] var6 = this.method2611(-109, arg1, 1);
            int[] var7 = this.method2611(-42, arg1, 2);
            for (int var8 = 0; ~class549.field7715 < ~var8; ++var8) {
                int var9 = var7[var8];
                if (var9 == 4096) {
                    var4[var8] = var5[var8];
                } else if (~var9 != -1) {
                    var4[var8] = (-var9 + 4096) * var6[var8] + var5[var8] * var9 >> 12;
                } else {
                    var4[var8] = var6[var8];
                }
            }
        }
        return var4;
    }
}
