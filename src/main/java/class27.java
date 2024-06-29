import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class27 extends class30 {

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field562 = 0;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field563 = 0;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "[I")
    public static int[] field561;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
    public static final void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field563) {
            arg2 -= field563 - arg0;
            arg0 = field563;
        }
        if (arg1 < field564) {
            var6 += (field564 - arg1) * var7;
            arg3 -= field564 - arg1;
            arg1 = field564;
        }
        if (arg0 + arg2 > field562) {
            arg2 = field562 - arg0;
        }
        if (arg1 + arg3 > field565) {
            arg3 = field565 - arg1;
        }
        int var8 = field566 - arg2;
        int var9 = field566 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field561[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([I)V")
    public static final void method205(int[] arg0) {
        arg0[0] = field563;
        arg0[1] = field564;
        arg0[2] = field562;
        arg0[3] = field565;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
    private static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field564 || arg1 >= field565) {
            return;
        }
        if (arg0 < field563) {
            arg2 -= field563 - arg0;
            arg0 = field563;
        }
        if (arg0 + arg2 > field562) {
            arg2 = field562 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field566 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field561[var9] >> 16 & 0xFF) * var5;
            int var12 = (field561[var9] >> 8 & 0xFF) * var5;
            int var13 = (field561[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field561[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIII)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method216(arg0, arg1, arg2, arg4);
        method216(arg0, arg1 + arg3 - 1, arg2, arg4);
        method217(arg0, arg1, arg3, arg4);
        method217(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[I[I)V")
    public static final void method208(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field566 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field561[var7++] = arg2;
            }
            var5 += field566;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    public static final void method209() {
        int var0 = 0;
        int var1 = field567 * field566 - 7;
        while (var0 < var1) {
            field561[var0++] = 0;
            field561[var0++] = 0;
            field561[var0++] = 0;
            field561[var0++] = 0;
            field561[var0++] = 0;
            field561[var0++] = 0;
            field561[var0++] = 0;
            field561[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field561[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(IIIII)V")
    private static final void method210(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field563 || arg0 >= field562) {
            return;
        }
        if (arg1 < field564) {
            arg2 -= field564 - arg1;
            arg1 = field564;
        }
        if (arg1 + arg2 > field565) {
            arg2 = field565 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field566 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field561[var9] >> 16 & 0xFF) * var5;
            int var12 = (field561[var9] >> 8 & 0xFF) * var5;
            int var13 = (field561[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field561[var9] = var14;
            var9 += field566;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(IIIII)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method216(arg0, arg1, var5 + 1, arg4);
            } else {
                method216(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field563) {
                    var8 += (field563 - arg0) * var10;
                    arg0 = field563;
                }
                if (var11 >= field562) {
                    var11 = field562 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field564 && var12 < field565) {
                        field561[field566 * var12 + arg0] = arg4;
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
                if (arg1 < field564) {
                    var14 += (field564 - arg1) * var16;
                    arg1 = field564;
                }
                if (var17 >= field565) {
                    var17 = field565 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field563 && var18 < field562) {
                        field561[field566 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method217(arg0, arg1, var6 + 1, arg4);
        } else {
            method217(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
    public static final void method212(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field566) {
            arg2 = field566;
        }
        if (arg3 > field567) {
            arg3 = field567;
        }
        field563 = arg0;
        field564 = arg1;
        field562 = arg2;
        field565 = arg3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIII)V")
    public static final void method213(int arg0, int arg1, int arg2, int arg3) {
        if (field563 < arg0) {
            field563 = arg0;
        }
        if (field564 < arg1) {
            field564 = arg1;
        }
        if (field562 > arg2) {
            field562 = arg2;
        }
        if (field565 > arg3) {
            field565 = arg3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V")
    public static final void method214() {
        field563 = 0;
        field564 = 0;
        field562 = field566;
        field565 = field567;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "([I)V")
    public static final void method215(int[] arg0) {
        field563 = arg0[0];
        field564 = arg0[1];
        field562 = arg0[2];
        field565 = arg0[3];
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(IIII)V")
    public static final void method216(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field564 || arg1 >= field565) {
            return;
        }
        if (arg0 < field563) {
            arg2 -= field563 - arg0;
            arg0 = field563;
        }
        if (arg0 + arg2 > field562) {
            arg2 = field562 - arg0;
        }
        int var4 = field566 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field561[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(IIII)V")
    public static final void method217(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field563 || arg0 >= field562) {
            return;
        }
        if (arg1 < field564) {
            arg2 -= field564 - arg1;
            arg1 = field564;
        }
        if (arg1 + arg2 > field565) {
            arg2 = field565 - arg1;
        }
        int var4 = field566 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field561[field566 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIIII)V")
    public static final void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field563) {
            arg2 -= field563 - arg0;
            arg0 = field563;
        }
        if (arg1 < field564) {
            arg3 -= field564 - arg1;
            arg1 = field564;
        }
        if (arg0 + arg2 > field562) {
            arg2 = field562 - arg0;
        }
        if (arg1 + arg3 > field565) {
            arg3 = field565 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field566 - arg2;
        int var9 = field566 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field561[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field561[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(IIIII)V")
    public static final void method219(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field563) {
            arg2 -= field563 - arg0;
            arg0 = field563;
        }
        if (arg1 < field564) {
            arg3 -= field564 - arg1;
            arg1 = field564;
        }
        if (arg0 + arg2 > field562) {
            arg2 = field562 - arg0;
        }
        if (arg1 + arg3 > field565) {
            arg3 = field565 - arg1;
        }
        int var5 = field566 - arg2;
        int var6 = field566 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field561[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(IIIIII)V")
    public static final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method206(arg0, arg1, arg2, arg4, arg5);
        method206(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method210(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method210(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([III)V")
    public static final void method221(int[] arg0, int arg1, int arg2) {
        field561 = arg0;
        field566 = arg1;
        field567 = arg2;
        method212(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()V")
    public static void method222() {
        field561 = null;
    }
}
