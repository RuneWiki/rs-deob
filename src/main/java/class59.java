import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class59 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
    public static int[] field829;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
    public static int[] field831;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[I")
    public static int[] field833;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V", line = 3)
    private static final void method381(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method387(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field832) {
            var4 = field832;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field826) {
            var5 = field826;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 + 1 - var8;
            if (var12 < field834) {
                var12 = field834;
            }
            int var13 = arg0 + var8;
            if (var13 > field830) {
                var13 = field830;
            }
            int var14 = field827 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field833[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field834) {
                var21 = field834;
            }
            int var22 = arg0 + var16;
            if (var22 > field830 - 1) {
                var22 = field830 - 1;
            }
            int var23 = field827 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field833[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V", line = 112)
    public static final void method382(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field834) {
            arg2 -= field834 - arg0;
            arg0 = field834;
        }
        if (arg1 < field832) {
            arg3 -= field832 - arg1;
            arg1 = field832;
        }
        if (arg0 + arg2 > field830) {
            arg2 = field830 - arg0;
        }
        if (arg1 + arg3 > field826) {
            arg3 = field826 - arg1;
        }
        int var5 = field827 - arg2;
        int var6 = field827 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field833[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V", line = 158)
    public static final void method383(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field834 || arg0 >= field830) {
            return;
        }
        if (arg1 < field832) {
            arg2 -= field832 - arg1;
            arg1 = field832;
        }
        if (arg1 + arg2 > field826) {
            arg2 = field826 - arg1;
        }
        int var4 = field827 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field833[var4] = arg3;
            var5++;
            var4 += field827;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIII)V", line = 185)
    private static final void method384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field832 || arg1 >= field826) {
            return;
        }
        if (arg0 < field834) {
            arg2 -= field834 - arg0;
            arg0 = field834;
        }
        if (arg0 + arg2 > field830) {
            arg2 = field830 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field827 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field833[var9] >> 16 & 0xFF) * var5;
            int var12 = (field833[var9] >> 8 & 0xFF) * var5;
            int var13 = (field833[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field833[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([I)V", line = 226)
    public static final void method385(int[] arg0) {
        field834 = arg0[0];
        field832 = arg0[1];
        field830 = arg0[2];
        field826 = arg0[3];
        method395();
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(IIII)V", line = 235)
    public static final void method386(int arg0, int arg1, int arg2, int arg3) {
        if (field834 < arg0) {
            field834 = arg0;
        }
        if (field832 < arg1) {
            field832 = arg1;
        }
        if (field830 > arg2) {
            field830 = arg2;
        }
        if (field826 > arg3) {
            field826 = arg3;
        }
        method395();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V", line = 250)
    private static final void method387(int arg0, int arg1, int arg2) {
        if (arg0 >= field834 && arg1 >= field832 && arg0 < field830 && arg1 < field826) {
            field833[field827 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 256)
    public static void method388() {
        field833 = null;
        field831 = null;
        field829 = null;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(IIII)V", line = 265)
    public static final void method389(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field827) {
            arg2 = field827;
        }
        if (arg3 > field828) {
            arg3 = field828;
        }
        field834 = arg0;
        field832 = arg1;
        field830 = arg2;
        field826 = arg3;
        method395();
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(IIIII)V", line = 288)
    public static final void method390(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method400(arg0, arg1, arg2, arg4);
        method400(arg0, arg1 + arg3 - 1, arg2, arg4);
        method383(arg0, arg1, arg3, arg4);
        method383(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()V", line = 297)
    public static final void method391() {
        field834 = 0;
        field832 = 0;
        field830 = field827;
        field826 = field828;
        method395();
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(IIIII)V", line = 305)
    public static final void method392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method381(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field832) {
            var9 = field832;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field826) {
            var10 = field826;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 + 1 - var13;
            if (var17 < field834) {
                var17 = field834;
            }
            int var18 = arg0 + var13;
            if (var18 > field830) {
                var18 = field830;
            }
            int var19 = field827 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field833[var19] >> 16 & 0xFF) * var5;
                int var22 = (field833[var19] >> 8 & 0xFF) * var5;
                int var23 = (field833[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field833[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field834) {
                var30 = field834;
            }
            int var31 = arg0 + var25;
            if (var31 > field830 - 1) {
                var31 = field830 - 1;
            }
            int var32 = field827 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field833[var32] >> 16 & 0xFF) * var5;
                int var35 = (field833[var32] >> 8 & 0xFF) * var5;
                int var36 = (field833[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field833[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(IIIII)V", line = 442)
    private static final void method393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field834 || arg0 >= field830) {
            return;
        }
        if (arg1 < field832) {
            arg2 -= field832 - arg1;
            arg1 = field832;
        }
        if (arg1 + arg2 > field826) {
            arg2 = field826 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field827 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field833[var9] >> 16 & 0xFF) * var5;
            int var12 = (field833[var9] >> 8 & 0xFF) * var5;
            int var13 = (field833[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field833[var9] = var14;
            var9 += field827;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V", line = 485)
    public static final void method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field834) {
            arg2 -= field834 - arg0;
            arg0 = field834;
        }
        if (arg1 < field832) {
            arg3 -= field832 - arg1;
            arg1 = field832;
        }
        if (arg0 + arg2 > field830) {
            arg2 = field830 - arg0;
        }
        if (arg1 + arg3 > field826) {
            arg3 = field826 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field827 - arg2;
        int var9 = field827 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field833[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field833[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()V", line = 534)
    public static final void method395() {
        field831 = null;
        field829 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III[I[I)V", line = 542)
    public static final void method396(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field827 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field833[var7++] = arg2;
            }
            var5 += field827;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIII)V", line = 563)
    public static final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class170.method1253();
        int var18 = arg1 - class170.method1252();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class170.method1259(var19, var20, var21);
        class170.method1249(var23, var24, var25, var19, var20, var21, arg4);
        class170.method1259(var19, var21, var22);
        class170.method1249(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(IIIIII)V", line = 619)
    public static final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method384(arg0, arg1, arg2, arg4, arg5);
        method384(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method393(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method393(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()V", line = 630)
    public static final void method399() {
        int var0 = 0;
        int var1 = field828 * field827 - 7;
        while (var0 < var1) {
            field833[var0++] = 0;
            field833[var0++] = 0;
            field833[var0++] = 0;
            field833[var0++] = 0;
            field833[var0++] = 0;
            field833[var0++] = 0;
            field833[var0++] = 0;
            field833[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field833[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(IIII)V", line = 661)
    public static final void method400(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field832 || arg1 >= field826) {
            return;
        }
        if (arg0 < field834) {
            arg2 -= field834 - arg0;
            arg0 = field834;
        }
        if (arg0 + arg2 > field830) {
            arg2 = field830 - arg0;
        }
        int var4 = field827 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field833[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([III)V", line = 689)
    public static final void method401(int[] arg0, int arg1, int arg2) {
        field833 = arg0;
        field827 = arg1;
        field828 = arg2;
        method389(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[I)V", line = 695)
    public static final void method402(int[] arg0, int[] arg1) {
        if (field826 - field832 != arg0.length || field826 - field832 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field831 = arg0;
        field829 = arg1;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(IIIII)V", line = 710)
    public static final void method403(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method400(arg0, arg1, var5 + 1, arg4);
            } else {
                method400(arg0 + var5, arg1, 1 - var5, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field834) {
                    var8 += (field834 - arg0) * var10;
                    arg0 = field834;
                }
                if (var11 >= field830) {
                    var11 = field830 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field832 && var12 < field826) {
                        field833[field827 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field832) {
                    var14 += (field832 - arg1) * var16;
                    arg1 = field832;
                }
                if (var17 >= field826) {
                    var17 = field826 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field834 && var18 < field830) {
                        field833[field827 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method383(arg0, arg1, var6 + 1, arg4);
        } else {
            method383(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "([I)V", line = 805)
    public static final void method404(int[] arg0) {
        arg0[0] = field834;
        arg0[1] = field832;
        arg0[2] = field830;
        arg0[3] = field826;
    }
}
