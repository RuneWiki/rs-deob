import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class62 extends class196 {

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field1048 = 0;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field1047 = 0;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field1049 = 0;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field1051 = 0;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "[I")
    public static int[] field1052;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
    public static final void method399() {
        int var0 = 0;
        int var1 = field1050 * field1046 - 7;
        while (var0 < var1) {
            field1052[var0++] = 0;
            field1052[var0++] = 0;
            field1052[var0++] = 0;
            field1052[var0++] = 0;
            field1052[var0++] = 0;
            field1052[var0++] = 0;
            field1052[var0++] = 0;
            field1052[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1052[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
    public static final void method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1051) {
            arg2 -= field1051 - arg0;
            arg0 = field1051;
        }
        if (arg1 < field1049) {
            var6 += (field1049 - arg1) * var7;
            arg3 -= field1049 - arg1;
            arg1 = field1049;
        }
        if (arg0 + arg2 > field1047) {
            arg2 = field1047 - arg0;
        }
        if (arg1 + arg3 > field1048) {
            arg3 = field1048 - arg1;
        }
        int var8 = field1050 - arg2;
        int var9 = field1050 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field1052[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()V")
    public static void method401() {
        field1052 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III[I[I)V")
    public static final void method402(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field1050 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field1052[var7++] = arg2;
            }
            var5 += field1050;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([I)V")
    public static final void method403(int[] arg0) {
        field1051 = arg0[0];
        field1049 = arg0[1];
        field1047 = arg0[2];
        field1048 = arg0[3];
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V")
    public static final void method404(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1051 || arg0 >= field1047) {
            return;
        }
        if (arg1 < field1049) {
            arg2 -= field1049 - arg1;
            arg1 = field1049;
        }
        if (arg1 + arg2 > field1048) {
            arg2 = field1048 - arg1;
        }
        int var4 = field1050 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1052[field1050 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    private static final void method405(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1051 || arg0 >= field1047) {
            return;
        }
        if (arg1 < field1049) {
            arg2 -= field1049 - arg1;
            arg1 = field1049;
        }
        if (arg1 + arg2 > field1048) {
            arg2 = field1048 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1050 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1052[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1052[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1052[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1052[var9] = var14;
            var9 += field1050;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIIII)V")
    public static final void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1051) {
            arg2 -= field1051 - arg0;
            arg0 = field1051;
        }
        if (arg1 < field1049) {
            arg3 -= field1049 - arg1;
            arg1 = field1049;
        }
        if (arg0 + arg2 > field1047) {
            arg2 = field1047 - arg0;
        }
        if (arg1 + arg3 > field1048) {
            arg3 = field1048 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field1050 - arg2;
        int var9 = field1050 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field1052[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field1052[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIII)V")
    private static final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1049 || arg1 >= field1048) {
            return;
        }
        if (arg0 < field1051) {
            arg2 -= field1051 - arg0;
            arg0 = field1051;
        }
        if (arg0 + arg2 > field1047) {
            arg2 = field1047 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1050 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1052[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1052[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1052[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1052[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([III)V")
    public static final void method408(int[] arg0, int arg1, int arg2) {
        field1052 = arg0;
        field1050 = arg1;
        field1046 = arg2;
        method409(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIII)V")
    public static final void method409(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1050) {
            arg2 = field1050;
        }
        if (arg3 > field1046) {
            arg3 = field1046;
        }
        field1051 = arg0;
        field1049 = arg1;
        field1047 = arg2;
        field1048 = arg3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "([I)V")
    public static final void method410(int[] arg0) {
        arg0[0] = field1051;
        arg0[1] = field1049;
        arg0[2] = field1047;
        arg0[3] = field1048;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "()V")
    public static final void method411() {
        field1051 = 0;
        field1049 = 0;
        field1047 = field1050;
        field1048 = field1046;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(IIIII)V")
    public static final void method412(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1051) {
            arg2 -= field1051 - arg0;
            arg0 = field1051;
        }
        if (arg1 < field1049) {
            arg3 -= field1049 - arg1;
            arg1 = field1049;
        }
        if (arg0 + arg2 > field1047) {
            arg2 = field1047 - arg0;
        }
        if (arg1 + arg3 > field1048) {
            arg3 = field1048 - arg1;
        }
        int var5 = field1050 - arg2;
        int var6 = field1050 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1052[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(IIIII)V")
    public static final void method413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method415(arg0, arg1, var5 + 1, arg4);
            } else {
                method415(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1051) {
                    var8 += (field1051 - arg0) * var10;
                    arg0 = field1051;
                }
                if (var11 >= field1047) {
                    var11 = field1047 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1049 && var12 < field1048) {
                        field1052[field1050 * var12 + arg0] = arg4;
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
                if (arg1 < field1049) {
                    var14 += (field1049 - arg1) * var16;
                    arg1 = field1049;
                }
                if (var17 >= field1048) {
                    var17 = field1048 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1051 && var18 < field1047) {
                        field1052[field1050 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method404(arg0, arg1, var6 + 1, arg4);
        } else {
            method404(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(IIII)V")
    public static final void method414(int arg0, int arg1, int arg2, int arg3) {
        if (field1051 < arg0) {
            field1051 = arg0;
        }
        if (field1049 < arg1) {
            field1049 = arg1;
        }
        if (field1047 > arg2) {
            field1047 = arg2;
        }
        if (field1048 > arg3) {
            field1048 = arg3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(IIII)V")
    public static final void method415(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1049 || arg1 >= field1048) {
            return;
        }
        if (arg0 < field1051) {
            arg2 -= field1051 - arg0;
            arg0 = field1051;
        }
        if (arg0 + arg2 > field1047) {
            arg2 = field1047 - arg0;
        }
        int var4 = field1050 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1052[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(IIIIII)V")
    public static final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method407(arg0, arg1, arg2, arg4, arg5);
        method407(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method405(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method405(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(IIIII)V")
    public static final void method417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method415(arg0, arg1, arg2, arg4);
        method415(arg0, arg1 + arg3 - 1, arg2, arg4);
        method404(arg0, arg1, arg3, arg4);
        method404(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
}
