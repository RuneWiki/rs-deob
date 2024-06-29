import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class59 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field956 = 0;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    public static int[] field957;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    public static int[] field959;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
    public static int[] field962;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
    public static final void method370() {
        field959 = null;
        field962 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
    public static final void method371(int arg0, int arg1, int arg2, int arg3) {
        if (field958 < arg0) {
            field958 = arg0;
        }
        if (field964 < arg1) {
            field964 = arg1;
        }
        if (field956 > arg2) {
            field956 = arg2;
        }
        if (field961 > arg3) {
            field961 = arg3;
        }
        method370();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
    public static final void method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class73.method525();
        int var18 = arg1 - class73.method522();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class73.method517(var19, var20, var21);
        class73.method515(var23, var24, var25, var19, var20, var21, arg4);
        class73.method517(var19, var21, var22);
        class73.method515(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([I)V")
    public static final void method373(int[] arg0) {
        field958 = arg0[0];
        field964 = arg0[1];
        field956 = arg0[2];
        field961 = arg0[3];
        method370();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    private static final void method374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field958 || arg0 >= field956) {
            return;
        }
        if (arg1 < field964) {
            arg2 -= field964 - arg1;
            arg1 = field964;
        }
        if (arg1 + arg2 > field961) {
            arg2 = field961 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field960 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field957[var9] >> 16 & 0xFF) * var5;
            int var12 = (field957[var9] >> 8 & 0xFF) * var5;
            int var13 = (field957[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field957[var9] = var14;
            var9 += field960;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIII)V")
    public static final void method375(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method386(arg0, arg1, arg2, arg4);
        method386(arg0, arg1 + arg3 - 1, arg2, arg4);
        method376(arg0, arg1, arg3, arg4);
        method376(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIII)V")
    public static final void method376(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field958 || arg0 >= field956) {
            return;
        }
        if (arg1 < field964) {
            arg2 -= field964 - arg1;
            arg1 = field964;
        }
        if (arg1 + arg2 > field961) {
            arg2 = field961 - arg1;
        }
        int var4 = field960 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field957[field960 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(IIIII)V")
    public static final void method377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method385(arg0, arg1, arg2, arg3);
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
        if (var9 < field964) {
            var9 = field964;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field961) {
            var10 = field961;
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
            int var30 = arg0 + 1 - var13;
            if (var30 < field958) {
                var30 = field958;
            }
            int var31 = arg0 + var13;
            if (var31 > field956) {
                var31 = field956;
            }
            int var32 = field960 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field957[var32] >> 16 & 0xFF) * var5;
                int var35 = (field957[var32] >> 8 & 0xFF) * var5;
                int var36 = (field957[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field957[var32++] = var37;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var17 = arg2;
        int var18 = -var14;
        int var19 = var18 * var18 + var12;
        int var20 = var19 - arg2;
        int var21 = var19 - var18;
        while (var11 < var10) {
            while (var21 > var12 && var20 > var12) {
                var21 -= var17-- + var17;
                var20 -= var17 + var17;
            }
            int var22 = arg0 - var17;
            if (var22 < field958) {
                var22 = field958;
            }
            int var23 = arg0 + var17;
            if (var23 > field956 - 1) {
                var23 = field956 - 1;
            }
            int var24 = field960 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field957[var24] >> 16 & 0xFF) * var5;
                int var27 = (field957[var24] >> 8 & 0xFF) * var5;
                int var28 = (field957[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field957[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "([I)V")
    public static final void method378(int[] arg0) {
        arg0[0] = field958;
        arg0[1] = field964;
        arg0[2] = field956;
        arg0[3] = field961;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III[I[I)V")
    public static final void method379(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field960 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field957[var7++] = arg2;
            }
            var5 += field960;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([I[I)V")
    public static final void method380(int[] arg0, int[] arg1) {
        if (field961 - field964 != arg0.length || field961 - field964 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field959 = arg0;
        field962 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
    private static final void method381(int arg0, int arg1, int arg2) {
        if (arg0 >= field958 && arg1 >= field964 && arg0 < field956 && arg1 < field961) {
            field957[field960 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIIII)V")
    public static final void method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field958) {
            arg2 -= field958 - arg0;
            arg0 = field958;
        }
        if (arg1 < field964) {
            var6 += (field964 - arg1) * var7;
            arg3 -= field964 - arg1;
            arg1 = field964;
        }
        if (arg0 + arg2 > field956) {
            arg2 = field956 - arg0;
        }
        if (arg1 + arg3 > field961) {
            arg3 = field961 - arg1;
        }
        int var8 = field960 - arg2;
        int var9 = field960 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field957[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(IIIIII)V")
    public static final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method392(arg0, arg1, arg2, arg4, arg5);
        method392(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method374(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method374(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([III)V")
    public static final void method384(int[] arg0, int arg1, int arg2) {
        field957 = arg0;
        field960 = arg1;
        field963 = arg2;
        method390(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(IIII)V")
    private static final void method385(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method381(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field964) {
            var4 = field964;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field961) {
            var5 = field961;
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
            int var21 = arg0 + 1 - var8;
            if (var21 < field958) {
                var21 = field958;
            }
            int var22 = arg0 + var8;
            if (var22 > field956) {
                var22 = field956;
            }
            int var23 = field960 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field957[var23++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var12 = arg2;
        int var13 = var6 - arg1;
        int var14 = var13 * var13 + var7;
        int var15 = var14 - arg2;
        int var16 = var14 - var13;
        while (var6 < var5) {
            while (var16 > var7 && var15 > var7) {
                var16 -= var12-- + var12;
                var15 -= var12 + var12;
            }
            int var17 = arg0 - var12;
            if (var17 < field958) {
                var17 = field958;
            }
            int var18 = arg0 + var12;
            if (var18 > field956 - 1) {
                var18 = field956 - 1;
            }
            int var19 = field960 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field957[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(IIII)V")
    public static final void method386(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field964 || arg1 >= field961) {
            return;
        }
        if (arg0 < field958) {
            arg2 -= field958 - arg0;
            arg0 = field958;
        }
        if (arg0 + arg2 > field956) {
            arg2 = field956 - arg0;
        }
        int var4 = field960 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field957[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(IIIIII)V")
    public static final void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field958) {
            arg2 -= field958 - arg0;
            arg0 = field958;
        }
        if (arg1 < field964) {
            arg3 -= field964 - arg1;
            arg1 = field964;
        }
        if (arg0 + arg2 > field956) {
            arg2 = field956 - arg0;
        }
        if (arg1 + arg3 > field961) {
            arg3 = field961 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field960 - arg2;
        int var9 = field960 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field957[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field957[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
    public static final void method388() {
        int var0 = 0;
        int var1 = field963 * field960 - 7;
        while (var0 < var1) {
            field957[var0++] = 0;
            field957[var0++] = 0;
            field957[var0++] = 0;
            field957[var0++] = 0;
            field957[var0++] = 0;
            field957[var0++] = 0;
            field957[var0++] = 0;
            field957[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field957[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(IIIII)V")
    public static final void method389(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method386(arg0, arg1, var5 + 1, arg4);
            } else {
                method386(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field958) {
                    var8 += (field958 - arg0) * var10;
                    arg0 = field958;
                }
                if (var11 >= field956) {
                    var11 = field956 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field964 && var12 < field961) {
                        field957[field960 * var12 + arg0] = arg4;
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
                if (arg1 < field964) {
                    var14 += (field964 - arg1) * var16;
                    arg1 = field964;
                }
                if (var17 >= field961) {
                    var17 = field961 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field958 && var18 < field956) {
                        field957[field960 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method376(arg0, arg1, var6 + 1, arg4);
        } else {
            method376(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(IIII)V")
    public static final void method390(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field960) {
            arg2 = field960;
        }
        if (arg3 > field963) {
            arg3 = field963;
        }
        field958 = arg0;
        field964 = arg1;
        field956 = arg2;
        field961 = arg3;
        method370();
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
    public static final void method391() {
        field958 = 0;
        field964 = 0;
        field956 = field960;
        field961 = field963;
        method370();
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(IIIII)V")
    private static final void method392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field964 || arg1 >= field961) {
            return;
        }
        if (arg0 < field958) {
            arg2 -= field958 - arg0;
            arg0 = field958;
        }
        if (arg0 + arg2 > field956) {
            arg2 = field956 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field960 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field957[var9] >> 16 & 0xFF) * var5;
            int var12 = (field957[var9] >> 8 & 0xFF) * var5;
            int var13 = (field957[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field957[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(IIIII)V")
    public static final void method393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field958) {
            arg2 -= field958 - arg0;
            arg0 = field958;
        }
        if (arg1 < field964) {
            arg3 -= field964 - arg1;
            arg1 = field964;
        }
        if (arg0 + arg2 > field956) {
            arg2 = field956 - arg0;
        }
        if (arg1 + arg3 > field961) {
            arg3 = field961 - arg1;
        }
        int var5 = field960 - arg2;
        int var6 = field960 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field957[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
    public static void method394() {
        field957 = null;
        field959 = null;
        field962 = null;
    }
}
