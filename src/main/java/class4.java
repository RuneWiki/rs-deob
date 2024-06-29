import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class101 {

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field69 = 0;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[I")
    public static int[] field71;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
    public static final void method17() {
        int var0 = 0;
        int var1 = field74 * field68 - 7;
        while (var0 < var1) {
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
            field71[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field71[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    public static final void method18(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method26(arg0, arg1, arg2, arg4);
        method26(arg0, arg1 + arg3 - 1, arg2, arg4);
        method23(arg0, arg1, arg3, arg4);
        method23(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
    public static final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field72) {
            arg2 -= field72 - arg0;
            arg0 = field72;
        }
        if (arg1 < field70) {
            arg3 -= field70 - arg1;
            arg1 = field70;
        }
        if (arg0 + arg2 > field73) {
            arg2 = field73 - arg0;
        }
        if (arg1 + arg3 > field69) {
            arg3 = field69 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field74 - arg2;
        int var9 = field74 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field71[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field71[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V")
    public static final void method20(int[] arg0, int arg1, int arg2) {
        field71 = arg0;
        field74 = arg1;
        field68 = arg2;
        method31(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([I)V")
    public static final void method21(int[] arg0) {
        field72 = arg0[0];
        field70 = arg0[1];
        field73 = arg0[2];
        field69 = arg0[3];
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
    public static final void method22(int arg0, int arg1, int arg2, int arg3) {
        if (field72 < arg0) {
            field72 = arg0;
        }
        if (field70 < arg1) {
            field70 = arg1;
        }
        if (field73 > arg2) {
            field73 = arg2;
        }
        if (field69 > arg3) {
            field69 = arg3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIII)V")
    public static final void method23(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field72 || arg0 >= field73) {
            return;
        }
        if (arg1 < field70) {
            arg2 -= field70 - arg1;
            arg1 = field70;
        }
        if (arg1 + arg2 > field69) {
            arg2 = field69 - arg1;
        }
        int var4 = field74 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field71[field74 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIII)V")
    private static final void method24(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field72 || arg0 >= field73) {
            return;
        }
        if (arg1 < field70) {
            arg2 -= field70 - arg1;
            arg1 = field70;
        }
        if (arg1 + arg2 > field69) {
            arg2 = field69 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field74 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field71[var9] >> 16 & 0xFF) * var5;
            int var12 = (field71[var9] >> 8 & 0xFF) * var5;
            int var13 = (field71[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field71[var9] = var14;
            var9 += field74;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIIII)V")
    public static final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field72) {
            arg2 -= field72 - arg0;
            arg0 = field72;
        }
        if (arg1 < field70) {
            var6 += (field70 - arg1) * var7;
            arg3 -= field70 - arg1;
            arg1 = field70;
        }
        if (arg0 + arg2 > field73) {
            arg2 = field73 - arg0;
        }
        if (arg1 + arg3 > field69) {
            arg3 = field69 - arg1;
        }
        int var8 = field74 - arg2;
        int var9 = field74 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field71[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIII)V")
    public static final void method26(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field70 || arg1 >= field69) {
            return;
        }
        if (arg0 < field72) {
            arg2 -= field72 - arg0;
            arg0 = field72;
        }
        if (arg0 + arg2 > field73) {
            arg2 = field73 - arg0;
        }
        int var4 = field74 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field71[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIIII)V")
    public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field72) {
            arg2 -= field72 - arg0;
            arg0 = field72;
        }
        if (arg1 < field70) {
            arg3 -= field70 - arg1;
            arg1 = field70;
        }
        if (arg0 + arg2 > field73) {
            arg2 = field73 - arg0;
        }
        if (arg1 + arg3 > field69) {
            arg3 = field69 - arg1;
        }
        int var5 = field74 - arg2;
        int var6 = field74 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field71[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIIIII)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method30(arg0, arg1, arg2, arg4, arg5);
        method30(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method24(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method24(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([I)V")
    public static final void method29(int[] arg0) {
        arg0[0] = field72;
        arg0[1] = field70;
        arg0[2] = field73;
        arg0[3] = field69;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(IIIII)V")
    private static final void method30(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field70 || arg1 >= field69) {
            return;
        }
        if (arg0 < field72) {
            arg2 -= field72 - arg0;
            arg0 = field72;
        }
        if (arg0 + arg2 > field73) {
            arg2 = field73 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field74 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field71[var9] >> 16 & 0xFF) * var5;
            int var12 = (field71[var9] >> 8 & 0xFF) * var5;
            int var13 = (field71[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field71[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(IIII)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field74) {
            arg2 = field74;
        }
        if (arg3 > field68) {
            arg3 = field68;
        }
        field72 = arg0;
        field70 = arg1;
        field73 = arg2;
        field69 = arg3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()V")
    public static final void method32() {
        field72 = 0;
        field70 = 0;
        field73 = field74;
        field69 = field68;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[I[I)V")
    public static final void method33(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field74 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field71[var7++] = arg2;
            }
            var5 += field74;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()V")
    public static void method34() {
        field71 = null;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(IIIII)V")
    public static final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method26(arg0, arg1, var5 + 1, arg4);
            } else {
                method26(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field72) {
                    var8 += (field72 - arg0) * var10;
                    arg0 = field72;
                }
                if (var11 >= field73) {
                    var11 = field73 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field70 && var12 < field69) {
                        field71[field74 * var12 + arg0] = arg4;
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
                if (arg1 < field70) {
                    var14 += (field70 - arg1) * var16;
                    arg1 = field70;
                }
                if (var17 >= field69) {
                    var17 = field69 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field72 && var18 < field73) {
                        field71[field74 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method23(arg0, arg1, var6 + 1, arg4);
        } else {
            method23(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }
}
