import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class191 extends class615 {

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "Llj;")
    public static class570 field2806 = new class570(1, 2, 2, 0);

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "Ldn;")
    public static class483 field2813;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "[[[B")
    public static byte[][][] field2811;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field2811 = null;
        field2813 = null;
        field2806 = null;
        if (arg0 <= 35) {
            method1248(true);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
    public static final void method1246(int arg0, int arg1) {
        class269.field3750 = arg0;
        ++field2810;
        if (arg1 == 3) {
            class666 var2 = class322.field4481;
            synchronized (class322.field4481) {
                class322.field4481.method3739(0);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != -942200340) {
            field2809 = 11;
        }
        if (arg2 == arg9 && ~arg4 == ~arg7 && ~arg0 == ~arg8 && arg5 == arg6) {
            class668.method3755(arg3, arg0, arg5, arg2, arg4, (byte) -120);
        } else {
            int var10 = arg2;
            int var11 = arg4;
            int var12 = arg2 * 3;
            int var13 = arg4 * 3;
            int var14 = arg9 * 3;
            int var15 = arg7 * 3;
            int var16 = arg8 * 3;
            int var17 = arg6 * 3;
            int var18 = -var16 + arg0 + var14 - arg2;
            int var19 = arg5 - var17 + -arg4 + var15;
            int var20 = var16 - var14 + var12 + -var14;
            int var21 = -var15 + var13 + -var15 + var17;
            int var22 = var14 - var12;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg2;
                int var34 = arg4 - -(var28 + var30 - -var32 >> 12);
                class668.method3755(arg3, var33, var34, var10, var11, (byte) -56);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field2804;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static final void method1248(boolean arg0) {
        ++field2803;
        class152.field2404.method3739(0);
        if (arg0) {
            field2806 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field2807;
        if (arg1 != -18) {
            method1249(17, 97, -67, 96, 56, 6);
        }
        int[] var3 = super.field8125.method298(arg0, -115);
        if (super.field8125.field579) {
            int[] var4 = this.method3366(0, arg1 + 1015, arg0);
            for (int var5 = 0; class505.field6740 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2812;
        for (int var6 = arg0; ~arg1 <= ~var6; ++var6) {
            class475.method2668(arg5, arg3, 7, class236.field3325[var6], arg4);
        }
        if (arg2 <= 126) {
            method1248(false);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I")
    public final int[][] method223(int arg0, int arg1) {
        ++field2808;
        if (arg0 != 2) {
            return null;
        } else {
            int[][] var3 = super.field8129.method2654(false, arg1);
            if (super.field8129.field6315) {
                int[][] var4 = this.method3368(true, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class505.field6740; ++var11) {
                    var8[var11] = 4096 - var5[var11];
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field2805;
        if (arg1 == 0) {
            super.field8118 = ~arg2.method2034(255) == -2;
        }
        if (arg0 <= 44) {
            this.method223(68, -95);
        }
    }
}
