import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class140 extends class191 {

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field2967 = 0;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field2969 = 0;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "[I")
    public static int[] field2964;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIII)V")
    public static final void method954(int arg0, int arg1, int arg2, int arg3) {
        if (field2967 < arg0) {
            field2967 = arg0;
        }
        if (field2966 < arg1) {
            field2966 = arg1;
        }
        if (field2965 > arg2) {
            field2965 = arg2;
        }
        if (field2969 > arg3) {
            field2969 = arg3;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
    public static final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method957(arg0, arg1, arg2, arg4, arg5);
        method957(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method969(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method969(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIIII)V")
    public static final void method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2967) {
            arg2 -= field2967 - arg0;
            arg0 = field2967;
        }
        if (arg1 < field2966) {
            arg3 -= field2966 - arg1;
            arg1 = field2966;
        }
        if (arg0 + arg2 > field2965) {
            arg2 = field2965 - arg0;
        }
        if (arg1 + arg3 > field2969) {
            arg3 = field2969 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2968 - arg2;
        int var9 = field2968 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2964[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2964[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
    private static final void method957(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2966 || arg1 >= field2969) {
            return;
        }
        if (arg0 < field2967) {
            arg2 -= field2967 - arg0;
            arg0 = field2967;
        }
        if (arg0 + arg2 > field2965) {
            arg2 = field2965 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2968 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2964[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2964[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2964[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2964[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(IIII)V")
    public static final void method958(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2968) {
            arg2 = field2968;
        }
        if (arg3 > field2963) {
            arg3 = field2963;
        }
        field2967 = arg0;
        field2966 = arg1;
        field2965 = arg2;
        field2969 = arg3;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIII)V")
    public static final void method959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method963(arg0, arg1, arg2, arg4);
        method963(arg0, arg1 + arg3 - 1, arg2, arg4);
        method964(arg0, arg1, arg3, arg4);
        method964(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(IIIIII)V")
    public static final void method960(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2967) {
            arg2 -= field2967 - arg0;
            arg0 = field2967;
        }
        if (arg1 < field2966) {
            var6 += (field2966 - arg1) * var7;
            arg3 -= field2966 - arg1;
            arg1 = field2966;
        }
        if (arg0 + arg2 > field2965) {
            arg2 = field2965 - arg0;
        }
        if (arg1 + arg3 > field2969) {
            arg3 = field2969 - arg1;
        }
        int var8 = field2968 - arg2;
        int var9 = field2968 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field2964[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([I)V")
    public static final void method961(int[] arg0) {
        field2967 = arg0[0];
        field2966 = arg0[1];
        field2965 = arg0[2];
        field2969 = arg0[3];
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
    public static final void method962() {
        field2967 = 0;
        field2966 = 0;
        field2965 = field2968;
        field2969 = field2963;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(IIII)V")
    public static final void method963(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2966 || arg1 >= field2969) {
            return;
        }
        if (arg0 < field2967) {
            arg2 -= field2967 - arg0;
            arg0 = field2967;
        }
        if (arg0 + arg2 > field2965) {
            arg2 = field2965 - arg0;
        }
        int var4 = field2968 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2964[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(IIII)V")
    public static final void method964(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2967 || arg0 >= field2965) {
            return;
        }
        if (arg1 < field2966) {
            arg2 -= field2966 - arg1;
            arg1 = field2966;
        }
        if (arg1 + arg2 > field2969) {
            arg2 = field2969 - arg1;
        }
        int var4 = field2968 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2964[field2968 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(IIIII)V")
    public static final void method965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method963(arg0, arg1, var5 + 1, arg4);
            } else {
                method963(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2967) {
                    var8 += (field2967 - arg0) * var10;
                    arg0 = field2967;
                }
                if (var11 >= field2965) {
                    var11 = field2965 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2966 && var12 < field2969) {
                        field2964[field2968 * var12 + arg0] = arg4;
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
                if (arg1 < field2966) {
                    var14 += (field2966 - arg1) * var16;
                    arg1 = field2966;
                }
                if (var17 >= field2969) {
                    var17 = field2969 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2967 && var18 < field2965) {
                        field2964[field2968 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method964(arg0, arg1, var6 + 1, arg4);
        } else {
            method964(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "([I)V")
    public static final void method966(int[] arg0) {
        arg0[0] = field2967;
        arg0[1] = field2966;
        arg0[2] = field2965;
        arg0[3] = field2969;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()V")
    public static void method967() {
        field2964 = null;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()V")
    public static final void method968() {
        int var0 = 0;
        int var1 = field2968 * field2963 - 7;
        while (var0 < var1) {
            field2964[var0++] = 0;
            field2964[var0++] = 0;
            field2964[var0++] = 0;
            field2964[var0++] = 0;
            field2964[var0++] = 0;
            field2964[var0++] = 0;
            field2964[var0++] = 0;
            field2964[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2964[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(IIIII)V")
    private static final void method969(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2967 || arg0 >= field2965) {
            return;
        }
        if (arg1 < field2966) {
            arg2 -= field2966 - arg1;
            arg1 = field2966;
        }
        if (arg1 + arg2 > field2969) {
            arg2 = field2969 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2968 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2964[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2964[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2964[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2964[var9] = var14;
            var9 += field2968;
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(IIIII)V")
    public static final void method970(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2967) {
            arg2 -= field2967 - arg0;
            arg0 = field2967;
        }
        if (arg1 < field2966) {
            arg3 -= field2966 - arg1;
            arg1 = field2966;
        }
        if (arg0 + arg2 > field2965) {
            arg2 = field2965 - arg0;
        }
        if (arg1 + arg3 > field2969) {
            arg3 = field2969 - arg1;
        }
        int var5 = field2968 - arg2;
        int var6 = field2968 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2964[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III[I[I)V")
    public static final void method971(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2968 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2964[var7++] = arg2;
            }
            var5 += field2968;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([III)V")
    public static final void method972(int[] arg0, int arg1, int arg2) {
        field2964 = arg0;
        field2968 = arg1;
        field2963 = arg2;
        method958(0, 0, arg1, arg2);
    }
}
