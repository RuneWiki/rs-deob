import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class66 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1029 = 0;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1031 = 0;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "[I")
    public static int[] field1032;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "[I")
    public static int[] field1034;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
    public static int[] field1037;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII)V")
    public static final void method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method537(arg0, arg1, arg2, arg4, arg5);
        method537(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method518(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method518(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
    public static final void method515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method528(arg0, arg1, arg2, arg3);
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
        if (var9 < field1033) {
            var9 = field1033;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field1029) {
            var10 = field1029;
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
            if (var30 < field1031) {
                var30 = field1031;
            }
            int var31 = arg0 + var13;
            if (var31 > field1030) {
                var31 = field1030;
            }
            int var32 = field1036 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field1032[var32] >> 16 & 0xFF) * var5;
                int var35 = (field1032[var32] >> 8 & 0xFF) * var5;
                int var36 = (field1032[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field1032[var32++] = var37;
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
            if (var22 < field1031) {
                var22 = field1031;
            }
            int var23 = arg0 + var17;
            if (var23 > field1030 - 1) {
                var23 = field1030 - 1;
            }
            int var24 = field1036 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field1032[var24] >> 16 & 0xFF) * var5;
                int var27 = (field1032[var24] >> 8 & 0xFF) * var5;
                int var28 = (field1032[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field1032[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public static final void method516(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1031 || arg0 >= field1030) {
            return;
        }
        if (arg1 < field1033) {
            arg2 -= field1033 - arg1;
            arg1 = field1033;
        }
        if (arg1 + arg2 > field1029) {
            arg2 = field1029 - arg1;
        }
        int var4 = field1036 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field1032[var4] = arg3;
            var5++;
            var4 += field1036;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public static final void method517() {
        field1031 = 0;
        field1033 = 0;
        field1030 = field1036;
        field1029 = field1035;
        method526();
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIII)V")
    private static final void method518(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1031 || arg0 >= field1030) {
            return;
        }
        if (arg1 < field1033) {
            arg2 -= field1033 - arg1;
            arg1 = field1033;
        }
        if (arg1 + arg2 > field1029) {
            arg2 = field1029 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1036 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1032[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1032[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1032[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1032[var9] = var14;
            var9 += field1036;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIIII)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class224.method1540();
        int var18 = arg1 - class224.method1541();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class224.method1557(var19, var20, var21);
        class224.method1542(var23, var24, var25, var19, var20, var21, arg4);
        class224.method1557(var19, var21, var22);
        class224.method1542(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIIII)V")
    public static final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1031) {
            arg2 -= field1031 - arg0;
            arg0 = field1031;
        }
        if (arg1 < field1033) {
            arg3 -= field1033 - arg1;
            arg1 = field1033;
        }
        if (arg0 + arg2 > field1030) {
            arg2 = field1030 - arg0;
        }
        if (arg1 + arg3 > field1029) {
            arg3 = field1029 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field1036 - arg2;
        int var9 = field1036 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field1032[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field1032[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([I)V")
    public static final void method521(int[] arg0) {
        arg0[0] = field1031;
        arg0[1] = field1033;
        arg0[2] = field1030;
        arg0[3] = field1029;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III[I[I)V")
    public static final void method522(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field1036 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field1032[var7++] = arg2;
            }
            var5 += field1036;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIII)V")
    public static final void method523(int arg0, int arg1, int arg2, int arg3) {
        if (field1031 < arg0) {
            field1031 = arg0;
        }
        if (field1033 < arg1) {
            field1033 = arg1;
        }
        if (field1030 > arg2) {
            field1030 = arg2;
        }
        if (field1029 > arg3) {
            field1029 = arg3;
        }
        method526();
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IIII)V")
    public static final void method524(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1036) {
            arg2 = field1036;
        }
        if (arg3 > field1035) {
            arg3 = field1035;
        }
        field1031 = arg0;
        field1033 = arg1;
        field1030 = arg2;
        field1029 = arg3;
        method526();
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(IIII)V")
    public static final void method525(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1033 || arg1 >= field1029) {
            return;
        }
        if (arg0 < field1031) {
            arg2 -= field1031 - arg0;
            arg0 = field1031;
        }
        if (arg0 + arg2 > field1030) {
            arg2 = field1030 - arg0;
        }
        int var4 = field1036 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1032[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
    public static final void method526() {
        field1034 = null;
        field1037 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([III)V")
    public static final void method527(int[] arg0, int arg1, int arg2) {
        field1032 = arg0;
        field1036 = arg1;
        field1035 = arg2;
        method524(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(IIII)V")
    private static final void method528(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method530(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field1033) {
            var4 = field1033;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field1029) {
            var5 = field1029;
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
            if (var21 < field1031) {
                var21 = field1031;
            }
            int var22 = arg0 + var8;
            if (var22 > field1030) {
                var22 = field1030;
            }
            int var23 = field1036 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field1032[var23++] = arg3;
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
            if (var17 < field1031) {
                var17 = field1031;
            }
            int var18 = arg0 + var12;
            if (var18 > field1030 - 1) {
                var18 = field1030 - 1;
            }
            int var19 = field1036 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field1032[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "([I)V")
    public static final void method529(int[] arg0) {
        field1031 = arg0[0];
        field1033 = arg0[1];
        field1030 = arg0[2];
        field1029 = arg0[3];
        method526();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    private static final void method530(int arg0, int arg1, int arg2) {
        if (arg0 >= field1031 && arg1 >= field1033 && arg0 < field1030 && arg1 < field1029) {
            field1032[field1036 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([I[I)V")
    public static final void method531(int[] arg0, int[] arg1) {
        if (field1029 - field1033 != arg0.length || field1029 - field1033 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field1034 = arg0;
        field1037 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIII)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1031) {
            arg2 -= field1031 - arg0;
            arg0 = field1031;
        }
        if (arg1 < field1033) {
            arg3 -= field1033 - arg1;
            arg1 = field1033;
        }
        if (arg0 + arg2 > field1030) {
            arg2 = field1030 - arg0;
        }
        if (arg1 + arg3 > field1029) {
            arg3 = field1029 - arg1;
        }
        int var5 = field1036 - arg2;
        int var6 = field1036 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1032[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(IIIII)V")
    public static final void method533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method525(arg0, arg1, arg2, arg4);
        method525(arg0, arg1 + arg3 - 1, arg2, arg4);
        method516(arg0, arg1, arg3, arg4);
        method516(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()V")
    public static final void method534() {
        int var0 = 0;
        int var1 = field1036 * field1035 - 7;
        while (var0 < var1) {
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1032[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(IIIII)V")
    public static final void method535(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method525(arg0, arg1, var5 + 1, arg4);
            } else {
                method525(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1031) {
                    var8 += (field1031 - arg0) * var10;
                    arg0 = field1031;
                }
                if (var11 >= field1030) {
                    var11 = field1030 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1033 && var12 < field1029) {
                        field1032[field1036 * var12 + arg0] = arg4;
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
                if (arg1 < field1033) {
                    var14 += (field1033 - arg1) * var16;
                    arg1 = field1033;
                }
                if (var17 >= field1029) {
                    var17 = field1029 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1031 && var18 < field1030) {
                        field1032[field1036 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method516(arg0, arg1, var6 + 1, arg4);
        } else {
            method516(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
    public static void method536() {
        field1032 = null;
        field1034 = null;
        field1037 = null;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(IIIII)V")
    private static final void method537(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1033 || arg1 >= field1029) {
            return;
        }
        if (arg0 < field1031) {
            arg2 -= field1031 - arg0;
            arg0 = field1031;
        }
        if (arg0 + arg2 > field1030) {
            arg2 = field1030 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1036 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1032[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1032[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1032[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1032[var9++] = var14;
        }
    }
}
