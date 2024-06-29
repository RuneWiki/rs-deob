import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class158 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2725 = 0;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2727 = 0;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2726 = 0;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2728 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    public static int[] field2729;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([I)V")
    public static final void method1098(int[] arg0) {
        arg0[0] = field2728;
        arg0[1] = field2727;
        arg0[2] = field2725;
        arg0[3] = field2726;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public static final void method1099(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1107(arg0, arg1, var5 + 1, arg4);
            } else {
                method1107(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2728) {
                    var8 += (field2728 - arg0) * var10;
                    arg0 = field2728;
                }
                if (var11 >= field2725) {
                    var11 = field2725 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2727 && var12 < field2726) {
                        field2729[field2724 * var12 + arg0] = arg4;
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
                if (arg1 < field2727) {
                    var14 += (field2727 - arg1) * var16;
                    arg1 = field2727;
                }
                if (var17 >= field2726) {
                    var17 = field2726 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2728 && var18 < field2725) {
                        field2729[field2724 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1114(arg0, arg1, var6 + 1, arg4);
        } else {
            method1114(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IIIII)V")
    private static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2727 || arg1 >= field2726) {
            return;
        }
        if (arg0 < field2728) {
            arg2 -= field2728 - arg0;
            arg0 = field2728;
        }
        if (arg0 + arg2 > field2725) {
            arg2 = field2725 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2724 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2729[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2729[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2729[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2729[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V")
    public static final void method1101() {
        field2728 = 0;
        field2727 = 0;
        field2725 = field2724;
        field2726 = field2730;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()V")
    public static final void method1102() {
        int var0 = 0;
        int var1 = field2730 * field2724 - 7;
        while (var0 < var1) {
            field2729[var0++] = 0;
            field2729[var0++] = 0;
            field2729[var0++] = 0;
            field2729[var0++] = 0;
            field2729[var0++] = 0;
            field2729[var0++] = 0;
            field2729[var0++] = 0;
            field2729[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2729[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2728) {
            arg2 -= field2728 - arg0;
            arg0 = field2728;
        }
        if (arg1 < field2727) {
            var6 += (field2727 - arg1) * var7;
            arg3 -= field2727 - arg1;
            arg1 = field2727;
        }
        if (arg0 + arg2 > field2725) {
            arg2 = field2725 - arg0;
        }
        if (arg1 + arg3 > field2726) {
            arg3 = field2726 - arg1;
        }
        int var8 = field2724 - arg2;
        int var9 = field2724 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field2729[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(IIIII)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2728) {
            arg2 -= field2728 - arg0;
            arg0 = field2728;
        }
        if (arg1 < field2727) {
            arg3 -= field2727 - arg1;
            arg1 = field2727;
        }
        if (arg0 + arg2 > field2725) {
            arg2 = field2725 - arg0;
        }
        if (arg1 + arg3 > field2726) {
            arg3 = field2726 - arg1;
        }
        int var5 = field2724 - arg2;
        int var6 = field2724 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2729[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII)V")
    public static final void method1105(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2724) {
            arg2 = field2724;
        }
        if (arg3 > field2730) {
            arg3 = field2730;
        }
        field2728 = arg0;
        field2727 = arg1;
        field2725 = arg2;
        field2726 = arg3;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IIII)V")
    private static final void method1106(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1108(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field2727) {
            var4 = field2727;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field2726) {
            var5 = field2726;
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
            if (var21 < field2728) {
                var21 = field2728;
            }
            int var22 = arg0 + var8;
            if (var22 > field2725) {
                var22 = field2725;
            }
            int var23 = field2724 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field2729[var23++] = arg3;
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
            if (var17 < field2728) {
                var17 = field2728;
            }
            int var18 = arg0 + var12;
            if (var18 > field2725 - 1) {
                var18 = field2725 - 1;
            }
            int var19 = field2724 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field2729[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(IIII)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2727 || arg1 >= field2726) {
            return;
        }
        if (arg0 < field2728) {
            arg2 -= field2728 - arg0;
            arg0 = field2728;
        }
        if (arg0 + arg2 > field2725) {
            arg2 = field2725 - arg0;
        }
        int var4 = field2724 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2729[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    private static final void method1108(int arg0, int arg1, int arg2) {
        if (arg0 >= field2728 && arg1 >= field2727 && arg0 < field2725 && arg1 < field2726) {
            field2729[field2724 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IIIIII)V")
    public static final void method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class13.method99();
        int var18 = arg1 - class13.method93();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class13.method85(var19, var20, var21);
        class13.method103(var23, var24, var25, var19, var20, var21, arg4);
        class13.method85(var19, var21, var22);
        class13.method103(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(IIII)V")
    public static final void method1110(int arg0, int arg1, int arg2, int arg3) {
        if (field2728 < arg0) {
            field2728 = arg0;
        }
        if (field2727 < arg1) {
            field2727 = arg1;
        }
        if (field2725 > arg2) {
            field2725 = arg2;
        }
        if (field2726 > arg3) {
            field2726 = arg3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(IIIIII)V")
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1100(arg0, arg1, arg2, arg4, arg5);
        method1100(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1118(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1118(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()V")
    public static void method1112() {
        field2729 = null;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(IIIIII)V")
    public static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2728) {
            arg2 -= field2728 - arg0;
            arg0 = field2728;
        }
        if (arg1 < field2727) {
            arg3 -= field2727 - arg1;
            arg1 = field2727;
        }
        if (arg0 + arg2 > field2725) {
            arg2 = field2725 - arg0;
        }
        if (arg1 + arg3 > field2726) {
            arg3 = field2726 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2724 - arg2;
        int var9 = field2724 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2729[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2729[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(IIII)V")
    public static final void method1114(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2728 || arg0 >= field2725) {
            return;
        }
        if (arg1 < field2727) {
            arg2 -= field2727 - arg1;
            arg1 = field2727;
        }
        if (arg1 + arg2 > field2726) {
            arg2 = field2726 - arg1;
        }
        int var4 = field2724 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2729[field2724 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III[I[I)V")
    public static final void method1115(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2724 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2729[var7++] = arg2;
            }
            var5 += field2724;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(IIIII)V")
    public static final void method1116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1106(arg0, arg1, arg2, arg3);
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
        if (var9 < field2727) {
            var9 = field2727;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field2726) {
            var10 = field2726;
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
            if (var30 < field2728) {
                var30 = field2728;
            }
            int var31 = arg0 + var13;
            if (var31 > field2725) {
                var31 = field2725;
            }
            int var32 = field2724 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field2729[var32] >> 16 & 0xFF) * var5;
                int var35 = (field2729[var32] >> 8 & 0xFF) * var5;
                int var36 = (field2729[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field2729[var32++] = var37;
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
            if (var22 < field2728) {
                var22 = field2728;
            }
            int var23 = arg0 + var17;
            if (var23 > field2725 - 1) {
                var23 = field2725 - 1;
            }
            int var24 = field2724 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field2729[var24] >> 16 & 0xFF) * var5;
                int var27 = (field2729[var24] >> 8 & 0xFF) * var5;
                int var28 = (field2729[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field2729[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([III)V")
    public static final void method1117(int[] arg0, int arg1, int arg2) {
        field2729 = arg0;
        field2724 = arg1;
        field2730 = arg2;
        method1105(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(IIIII)V")
    private static final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2728 || arg0 >= field2725) {
            return;
        }
        if (arg1 < field2727) {
            arg2 -= field2727 - arg1;
            arg1 = field2727;
        }
        if (arg1 + arg2 > field2726) {
            arg2 = field2726 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2724 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2729[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2729[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2729[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2729[var9] = var14;
            var9 += field2724;
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(IIIII)V")
    public static final void method1119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1107(arg0, arg1, arg2, arg4);
        method1107(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1114(arg0, arg1, arg3, arg4);
        method1114(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "([I)V")
    public static final void method1120(int[] arg0) {
        field2728 = arg0[0];
        field2727 = arg0[1];
        field2725 = arg0[2];
        field2726 = arg0[3];
    }
}
