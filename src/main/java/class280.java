import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class280 {

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field3963;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[[I")
    public int[][] field3968;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lfa;")
    public static class235 field3961 = new class235(13, 0, 1, 0);

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[Lcq;")
    public static class468[] field3964 = new class468[300];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lu;")
    public static class74 field3967;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Ljo;")
    public static final class336 method1782(byte arg0) {
        if (arg0 <= 94) {
            method1790(67, 20, true);
        }
        field3959++;
        return class520.field7449;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljo;I)Ljo;")
    public static final class336 method1783(class336 arg0, int arg1) {
        field3954++;
        if (arg1 != 52) {
            method1784(-77, -82, -127);
        }
        class336 var2 = arg0 == null ? new class336() : new class336(arg0);
        var2.method2115(128, 9, (byte) 39);
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method976(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method977(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method963(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Z")
    public static final boolean method1784(int arg0, int arg1, int arg2) {
        field3957++;
        if (arg1 != -715130066) {
            field3967 = null;
        }
        return class99.method761(arg0, 13, arg2) | (arg2 & 0x60000) != 0 || class530.method3099(arg2, 83, arg0) || class516.method3047(arg0, -1, arg2);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1785(int arg0) {
        int var1 = -103 % ((arg0 + 22) / 34);
        field3964 = null;
        field3967 = null;
        field3961 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lraa;[I)V")
    public abstract void method966(class609 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method974(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class183 method967(int arg0, int arg1, class183 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method964(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method960(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method957(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method973(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I")
    public final int method1786(int arg0, byte arg1, int arg2) {
        field3956++;
        if (arg1 != 113) {
            return -12;
        }
        int var4 = arg2 >> this.field3955;
        int var5 = arg0 >> this.field3955;
        if (var4 < 0 || var5 < 0 || var4 > (this.field3963 - 1) || this.field3962 - 1 < var5) {
            return 0;
        }
        int var6 = this.field3965 - 1 & arg2;
        int var7 = arg0 & this.field3965 - 1;
        int var8 = (this.field3965 - var6) * this.field3968[var4][var5] + this.field3968[var4 + 1][var5] * var6 >> this.field3955;
        int var9 = (this.field3965 - var6) * this.field3968[var4][var5 + 1] + (this.field3968[var4 + 1][var5 + 1] * var6) >> this.field3955;
        return (this.field3965 - var7) * var8 + (var7 * var9) >> this.field3955;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I")
    public final int method1787(int arg0, int arg1, int arg2) {
        if (arg1 != 19646) {
            this.method1786(15, (byte) 82, 44);
        }
        field3958++;
        return this.field3968[arg0][arg2];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILsca;Lha;IIIILaa;I)V")
    public static final void method1788(int arg0, class46 arg1, class60 arg2, int arg3, int arg4, int arg5, int arg6, class488 arg7, int arg8) {
        if (arg5 != 22087) {
            return;
        }
        field3953++;
        class519 var9 = class637.field8949.method864(arg5 ^ 0x5633, arg0);
        if (var9 == null || !var9.field7432 || !var9.method3065(class83.field1160, -93)) {
            return;
        }
        if (var9.field7419 != null) {
            int[] var10 = new int[var9.field7419.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var28;
                if (class264.field3784 == 4) {
                    var28 = (int) class255.field3659 & 0x3FFF;
                } else {
                    var28 = (int) class255.field3659 + class748.field10464 & 0x3FFF;
                }
                int var29 = class373.field5548[var28];
                int var30 = class373.field5549[var28];
                if (class264.field3784 != 4) {
                    var30 = var30 * 256 / (class305.field4322 + 256);
                    var29 = var29 * 256 / (class305.field4322 + 256);
                }
                var10[var11 * 2] = ((var9.field7419[var11 * 2] * 4 + arg6) * var30 + (var9.field7419[var11 * 2 + 1] * 4 + arg3) * var29 >> 14) + (arg4 + (arg1.field549 / 2));
                var10[var11 * 2 + 1] = arg1.field574 / 2 + arg8 - ((arg3 - -(var9.field7419[var11 * 2 + 1] * 4)) * var30 + -((var9.field7419[var11 * 2] * 4 + arg6) * var29) >> 14);
            }
            class65.method579(arg2, var10, var9.field7399, arg1.field672, arg1.field552);
            if (var9.field7398 <= 0) {
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg2.method423(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field7447[var9.field7441[var12] & 0xFF], 1, arg7, arg4, arg8);
                }
                arg2.method423(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field7447[var9.field7441[var9.field7441.length - 1] & 0xFF], 1, arg7, arg4, arg8);
            } else {
                for (int var13 = 0; var13 < (var10.length / 2 - 1); var13++) {
                    int var21 = var10[var13 * 2];
                    int var22 = var10[var13 * 2 + 1];
                    int var23 = var10[(var13 + 1) * 2];
                    int var24 = var10[(var13 + 1) * 2 + 1];
                    if (var21 > var23) {
                        int var25 = var21;
                        int var26 = var22;
                        var21 = var23;
                        var22 = var24;
                        var23 = var25;
                        var24 = var26;
                    } else if (var21 == var23 && var22 > var24) {
                        int var27 = var22;
                        var22 = var24;
                        var24 = var27;
                    }
                    arg2.method449(var21, var22, var23, var24, var9.field7447[var9.field7441[var13] & 0xFF], 1, arg7, arg4, arg8, var9.field7398, var9.field7404, var9.field7430);
                }
                int var14 = var10[var10.length - 2];
                int var15 = var10[var10.length - 1];
                int var16 = var10[0];
                int var17 = var10[1];
                if (var16 < var14) {
                    int var18 = var14;
                    int var19 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                    var17 = var19;
                } else if (var14 == var16 && var15 > var17) {
                    int var20 = var15;
                    var15 = var17;
                    var17 = var20;
                }
                arg2.method449(var14, var15, var16, var17, var9.field7447[var9.field7441[var9.field7441.length - 1] & 0xFF], 1, arg7, arg4, arg8, var9.field7398, var9.field7404, var9.field7430);
            }
        }
        class536 var31 = null;
        if (var9.field7439 != -1) {
            var31 = var9.method3057(arg2, false, (byte) -125);
            if (var31 != null) {
                class260.method1688((byte) -96, arg7, arg3, arg8, arg1, var31, arg4, arg6);
            }
        }
        if (var9.field7424 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method1510();
        }
        class61 var33 = class427.field6332;
        class66 var34 = class232.field3385;
        if (var9.field7448 == 1) {
            var34 = class55.field764;
            var33 = class358.field5201;
        }
        if (var9.field7448 == 2) {
            var34 = class335.field4827;
            var33 = class298.field4225;
        }
        class297.method1880(arg1, var9.field7428, arg7, arg8, arg6, arg3, var9.field7424, var33, arg4, var34, (byte) -58, var32);
        return;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(FFFFFIFI)F")
    public static final float method1789(float arg0, float arg1, float arg2, float arg3, float arg4, int arg5, float arg6, int arg7) {
        if (arg7 >= -102) {
            method1784(23, 8, 40);
        }
        field3960++;
        float var8 = 0.0F;
        float var9 = arg2 - arg3;
        float var10 = arg1 - arg6;
        float var11 = arg4 - arg0;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg3;
            float var16 = var8 * var10 + arg6;
            float var17 = var8 * var11 + arg0;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && var18 < class194.field2946 && var19 < class255.field3656) {
                int var20 = class130.field1749.field8429;
                if (var20 < 3 && (class60.field847[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class531.field7566[var20].method1786((int) var17, (byte) 113, (int) var15);
                if (var16 > (float) var21) {
                    if (arg5 >= 2) {
                        return method1789(var14, var16, var15, var12, var17, arg5 - 1, var13, -113) * 0.1F + (var8 - 0.1F);
                    }
                    return var8;
                }
            }
            var13 = var16;
            var12 = var15;
            var14 = var17;
            var8 += 0.1F;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method975(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method972();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1790(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1785(-84);
        }
        field3966++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class280(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3962 = arg1;
        this.field3963 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field3965 = 0x1 << var5;
        this.field3955 = var5;
        this.field3968 = arg3;
    }
}
