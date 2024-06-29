import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 extends class75 {

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field922 = 0;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "[I")
    public static int[] field923;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V")
    public static final void method273(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field928 || arg0 >= field925) {
            return;
        }
        if (arg1 < field922) {
            arg2 -= field922 - arg1;
            arg1 = field922;
        }
        if (arg1 + arg2 > field926) {
            arg2 = field926 - arg1;
        }
        int var4 = field924 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field923[field924 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([I)V")
    public static final void method274(int[] arg0) {
        field928 = arg0[0];
        field922 = arg0[1];
        field925 = arg0[2];
        field926 = arg0[3];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
    public static final void method275(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field928) {
            arg2 -= field928 - arg0;
            arg0 = field928;
        }
        if (arg1 < field922) {
            arg3 -= field922 - arg1;
            arg1 = field922;
        }
        if (arg0 + arg2 > field925) {
            arg2 = field925 - arg0;
        }
        if (arg1 + arg3 > field926) {
            arg3 = field926 - arg1;
        }
        int var5 = field924 - arg2;
        int var6 = field924 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field923[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIII)V")
    public static final void method276(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method280(arg0, arg1, arg2, arg4);
        method280(arg0, arg1 + arg3 - 1, arg2, arg4);
        method273(arg0, arg1, arg3, arg4);
        method273(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(IIIII)V")
    private static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field922 || arg1 >= field926) {
            return;
        }
        if (arg0 < field928) {
            arg2 -= field928 - arg0;
            arg0 = field928;
        }
        if (arg0 + arg2 > field925) {
            arg2 = field925 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field924 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field923[var9] >> 16 & 0xFF) * var5;
            int var12 = (field923[var9] >> 8 & 0xFF) * var5;
            int var13 = (field923[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field923[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIII)V")
    public static final void method278(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field924) {
            arg2 = field924;
        }
        if (arg3 > field927) {
            arg3 = field927;
        }
        field928 = arg0;
        field922 = arg1;
        field925 = arg2;
        field926 = arg3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III[I[I)V")
    public static final void method279(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field924 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field923[var7++] = arg2;
            }
            var5 += field924;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(IIII)V")
    public static final void method280(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field922 || arg1 >= field926) {
            return;
        }
        if (arg0 < field928) {
            arg2 -= field928 - arg0;
            arg0 = field928;
        }
        if (arg0 + arg2 > field925) {
            arg2 = field925 - arg0;
        }
        int var4 = field924 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field923[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V")
    public static final void method281(int[] arg0, int arg1, int arg2) {
        field923 = arg0;
        field924 = arg1;
        field927 = arg2;
        method278(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(IIIII)V")
    private static final void method282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field928 || arg0 >= field925) {
            return;
        }
        if (arg1 < field922) {
            arg2 -= field922 - arg1;
            arg1 = field922;
        }
        if (arg1 + arg2 > field926) {
            arg2 = field926 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field924 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field923[var9] >> 16 & 0xFF) * var5;
            int var12 = (field923[var9] >> 8 & 0xFF) * var5;
            int var13 = (field923[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field923[var9] = var14;
            var9 += field924;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
    public static final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field928) {
            arg2 -= field928 - arg0;
            arg0 = field928;
        }
        if (arg1 < field922) {
            var6 += (field922 - arg1) * var7;
            arg3 -= field922 - arg1;
            arg1 = field922;
        }
        if (arg0 + arg2 > field925) {
            arg2 = field925 - arg0;
        }
        if (arg1 + arg3 > field926) {
            arg3 = field926 - arg1;
        }
        int var8 = field924 - arg2;
        int var9 = field924 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field923[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIIII)V")
    public static final void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field928) {
            arg2 -= field928 - arg0;
            arg0 = field928;
        }
        if (arg1 < field922) {
            arg3 -= field922 - arg1;
            arg1 = field922;
        }
        if (arg0 + arg2 > field925) {
            arg2 = field925 - arg0;
        }
        if (arg1 + arg3 > field926) {
            arg3 = field926 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field924 - arg2;
        int var9 = field924 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field923[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field923[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public static final void method285() {
        int var0 = 0;
        int var1 = field927 * field924 - 7;
        while (var0 < var1) {
            field923[var0++] = 0;
            field923[var0++] = 0;
            field923[var0++] = 0;
            field923[var0++] = 0;
            field923[var0++] = 0;
            field923[var0++] = 0;
            field923[var0++] = 0;
            field923[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field923[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(IIIII)V")
    public static final void method286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method280(arg0, arg1, var5 + 1, arg4);
            } else {
                method280(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field928) {
                    var8 += (field928 - arg0) * var10;
                    arg0 = field928;
                }
                if (var11 >= field925) {
                    var11 = field925 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field922 && var12 < field926) {
                        field923[field924 * var12 + arg0] = arg4;
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
                if (arg1 < field922) {
                    var14 += (field922 - arg1) * var16;
                    arg1 = field922;
                }
                if (var17 >= field926) {
                    var17 = field926 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field928 && var18 < field925) {
                        field923[field924 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method273(arg0, arg1, var6 + 1, arg4);
        } else {
            method273(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(IIII)V")
    public static final void method287(int arg0, int arg1, int arg2, int arg3) {
        if (field928 < arg0) {
            field928 = arg0;
        }
        if (field922 < arg1) {
            field922 = arg1;
        }
        if (field925 > arg2) {
            field925 = arg2;
        }
        if (field926 > arg3) {
            field926 = arg3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
    public static final void method288() {
        field928 = 0;
        field922 = 0;
        field925 = field924;
        field926 = field927;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(IIIIII)V")
    public static final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method277(arg0, arg1, arg2, arg4, arg5);
        method277(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method282(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method282(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "([I)V")
    public static final void method290(int[] arg0) {
        arg0[0] = field928;
        arg0[1] = field922;
        arg0[2] = field925;
        arg0[3] = field926;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
    public static void method291() {
        field923 = null;
    }
}
