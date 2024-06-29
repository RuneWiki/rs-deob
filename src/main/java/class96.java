import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 extends class121 {

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field2327 = 0;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field2328 = 0;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field2325 = 0;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "[I")
    public static int[] field2330;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([I)V")
    public static final void method784(int[] arg0) {
        field2327 = arg0[0];
        field2325 = arg0[1];
        field2331 = arg0[2];
        field2328 = arg0[3];
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)V")
    public static final void method785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2327) {
            arg2 -= field2327 - arg0;
            arg0 = field2327;
        }
        if (arg1 < field2325) {
            var6 += (field2325 - arg1) * var7;
            arg3 -= field2325 - arg1;
            arg1 = field2325;
        }
        if (arg0 + arg2 > field2331) {
            arg2 = field2331 - arg0;
        }
        if (arg1 + arg3 > field2328) {
            arg3 = field2328 - arg1;
        }
        int var8 = field2329 - arg2;
        int var9 = field2329 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field2330[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "([I)V")
    public static final void method786(int[] arg0) {
        arg0[0] = field2327;
        arg0[1] = field2325;
        arg0[2] = field2331;
        arg0[3] = field2328;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
    public static final void method787() {
        int var0 = 0;
        int var1 = field2329 * field2326 - 7;
        while (var0 < var1) {
            field2330[var0++] = 0;
            field2330[var0++] = 0;
            field2330[var0++] = 0;
            field2330[var0++] = 0;
            field2330[var0++] = 0;
            field2330[var0++] = 0;
            field2330[var0++] = 0;
            field2330[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2330[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V")
    public static final void method788(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2327 || arg0 >= field2331) {
            return;
        }
        if (arg1 < field2325) {
            arg2 -= field2325 - arg1;
            arg1 = field2325;
        }
        if (arg1 + arg2 > field2328) {
            arg2 = field2328 - arg1;
        }
        int var4 = field2329 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2330[field2329 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
    public static void method789() {
        field2330 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([III)V")
    public static final void method790(int[] arg0, int arg1, int arg2) {
        field2330 = arg0;
        field2329 = arg1;
        field2326 = arg2;
        method795(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIIII)V")
    public static final void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method800(arg0, arg1, arg2, arg4, arg5);
        method800(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method797(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method797(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
    public static final void method792(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method793(arg0, arg1, var5 + 1, arg4);
            } else {
                method793(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2327) {
                    var8 += (field2327 - arg0) * var10;
                    arg0 = field2327;
                }
                if (var11 >= field2331) {
                    var11 = field2331 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2325 && var12 < field2328) {
                        field2330[field2329 * var12 + arg0] = arg4;
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
                if (arg1 < field2325) {
                    var14 += (field2325 - arg1) * var16;
                    arg1 = field2325;
                }
                if (var17 >= field2328) {
                    var17 = field2328 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2327 && var18 < field2331) {
                        field2330[field2329 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method788(arg0, arg1, var6 + 1, arg4);
        } else {
            method788(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIII)V")
    public static final void method793(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2325 || arg1 >= field2328) {
            return;
        }
        if (arg0 < field2327) {
            arg2 -= field2327 - arg0;
            arg0 = field2327;
        }
        if (arg0 + arg2 > field2331) {
            arg2 = field2331 - arg0;
        }
        int var4 = field2329 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2330[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIII)V")
    public static final void method794(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2327) {
            arg2 -= field2327 - arg0;
            arg0 = field2327;
        }
        if (arg1 < field2325) {
            arg3 -= field2325 - arg1;
            arg1 = field2325;
        }
        if (arg0 + arg2 > field2331) {
            arg2 = field2331 - arg0;
        }
        if (arg1 + arg3 > field2328) {
            arg3 = field2328 - arg1;
        }
        int var5 = field2329 - arg2;
        int var6 = field2329 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2330[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIII)V")
    public static final void method795(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2329) {
            arg2 = field2329;
        }
        if (arg3 > field2326) {
            arg3 = field2326;
        }
        field2327 = arg0;
        field2325 = arg1;
        field2331 = arg2;
        field2328 = arg3;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIIIII)V")
    public static final void method796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2327) {
            arg2 -= field2327 - arg0;
            arg0 = field2327;
        }
        if (arg1 < field2325) {
            arg3 -= field2325 - arg1;
            arg1 = field2325;
        }
        if (arg0 + arg2 > field2331) {
            arg2 = field2331 - arg0;
        }
        if (arg1 + arg3 > field2328) {
            arg3 = field2328 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field2329 - arg2;
        int var11 = field2329 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field2330[var11] >> 16 & 0xFF) * var6;
                int var15 = (field2330[var11] >> 8 & 0xFF) * var6;
                int var16 = (field2330[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field2330[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIIII)V")
    private static final void method797(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2327 || arg0 >= field2331) {
            return;
        }
        if (arg1 < field2325) {
            arg2 -= field2325 - arg1;
            arg1 = field2325;
        }
        if (arg1 + arg2 > field2328) {
            arg2 = field2328 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2329 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2330[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2330[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2330[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2330[var9] = var14;
            var9 += field2329;
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(IIIII)V")
    public static final void method798(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method793(arg0, arg1, arg2, arg4);
        method793(arg0, arg1 + arg3 - 1, arg2, arg4);
        method788(arg0, arg1, arg3, arg4);
        method788(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()V")
    public static final void method799() {
        field2327 = 0;
        field2325 = 0;
        field2331 = field2329;
        field2328 = field2326;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(IIIII)V")
    private static final void method800(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2325 || arg1 >= field2328) {
            return;
        }
        if (arg0 < field2327) {
            arg2 -= field2327 - arg0;
            arg0 = field2327;
        }
        if (arg0 + arg2 > field2331) {
            arg2 = field2331 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2329 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2330[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2330[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2330[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2330[var9++] = var14;
        }
    }
}
