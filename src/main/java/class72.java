import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class72 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1332 = 0;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1336 = 0;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1335 = 0;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[I")
    public static int[] field1331;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    public static final void method476(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method489(arg0, arg1, arg2, arg4);
        method489(arg0, arg1 + arg3 - 1, arg2, arg4);
        method487(arg0, arg1, arg3, arg4);
        method487(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIII)V")
    public static final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method489(arg0, arg1, var5 + 1, arg4);
            } else {
                method489(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1332) {
                    var8 += (field1332 - arg0) * var10;
                    arg0 = field1332;
                }
                if (var11 >= field1336) {
                    var11 = field1336 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1334 && var12 < field1335) {
                        field1331[field1333 * var12 + arg0] = arg4;
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
                if (arg1 < field1334) {
                    var14 += (field1334 - arg1) * var16;
                    arg1 = field1334;
                }
                if (var17 >= field1335) {
                    var17 = field1335 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1332 && var18 < field1336) {
                        field1331[field1333 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method487(arg0, arg1, var6 + 1, arg4);
        } else {
            method487(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(IIIII)V")
    public static final void method478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg1 < field1334) {
            arg3 -= field1334 - arg1;
            arg1 = field1334;
        }
        if (arg0 + arg2 > field1336) {
            arg2 = field1336 - arg0;
        }
        if (arg1 + arg3 > field1335) {
            arg3 = field1335 - arg1;
        }
        int var5 = field1333 - arg2;
        int var6 = field1333 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1331[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
    public static final void method479() {
        field1332 = 0;
        field1334 = 0;
        field1336 = field1333;
        field1335 = field1337;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V")
    public static final void method480(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1333) {
            arg2 = field1333;
        }
        if (arg3 > field1337) {
            arg3 = field1337;
        }
        field1332 = arg0;
        field1334 = arg1;
        field1336 = arg2;
        field1335 = arg3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()V")
    public static final void method481() {
        int var0 = 0;
        int var1 = field1337 * field1333 - 7;
        while (var0 < var1) {
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
            field1331[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1331[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
    public static final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg1 < field1334) {
            var6 += (field1334 - arg1) * var7;
            arg3 -= field1334 - arg1;
            arg1 = field1334;
        }
        if (arg0 + arg2 > field1336) {
            arg2 = field1336 - arg0;
        }
        if (arg1 + arg3 > field1335) {
            arg3 = field1335 - arg1;
        }
        int var8 = field1333 - arg2;
        int var9 = field1333 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field1331[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(IIIII)V")
    public static final void method483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method498(arg0, arg1, arg2, arg3);
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
        if (var9 < field1334) {
            var9 = field1334;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field1335) {
            var10 = field1335;
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
            if (var30 < field1332) {
                var30 = field1332;
            }
            int var31 = arg0 + var13;
            if (var31 > field1336) {
                var31 = field1336;
            }
            int var32 = field1333 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field1331[var32] >> 16 & 0xFF) * var5;
                int var35 = (field1331[var32] >> 8 & 0xFF) * var5;
                int var36 = (field1331[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field1331[var32++] = var37;
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
            if (var22 < field1332) {
                var22 = field1332;
            }
            int var23 = arg0 + var17;
            if (var23 > field1336 - 1) {
                var23 = field1336 - 1;
            }
            int var24 = field1333 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field1331[var24] >> 16 & 0xFF) * var5;
                int var27 = (field1331[var24] >> 8 & 0xFF) * var5;
                int var28 = (field1331[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field1331[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIIII)V")
    public static final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method490(arg0, arg1, arg2, arg4, arg5);
        method490(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method488(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method488(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(IIIIII)V")
    public static final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class173.method1225();
        int var18 = arg1 - class173.method1236();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class173.method1224(var19, var20, var21);
        class173.method1235(var23, var24, var25, var19, var20, var21, arg4);
        class173.method1224(var19, var21, var22);
        class173.method1235(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([I)V")
    public static final void method486(int[] arg0) {
        arg0[0] = field1332;
        arg0[1] = field1334;
        arg0[2] = field1336;
        arg0[3] = field1335;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIII)V")
    public static final void method487(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1332 || arg0 >= field1336) {
            return;
        }
        if (arg1 < field1334) {
            arg2 -= field1334 - arg1;
            arg1 = field1334;
        }
        if (arg1 + arg2 > field1335) {
            arg2 = field1335 - arg1;
        }
        int var4 = field1333 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1331[field1333 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(IIIII)V")
    private static final void method488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1332 || arg0 >= field1336) {
            return;
        }
        if (arg1 < field1334) {
            arg2 -= field1334 - arg1;
            arg1 = field1334;
        }
        if (arg1 + arg2 > field1335) {
            arg2 = field1335 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1333 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1331[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1331[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1331[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1331[var9] = var14;
            var9 += field1333;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(IIII)V")
    public static final void method489(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1334 || arg1 >= field1335) {
            return;
        }
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg0 + arg2 > field1336) {
            arg2 = field1336 - arg0;
        }
        int var4 = field1333 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1331[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(IIIII)V")
    private static final void method490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1334 || arg1 >= field1335) {
            return;
        }
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg0 + arg2 > field1336) {
            arg2 = field1336 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1333 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1331[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1331[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1331[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1331[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III[I[I)V")
    public static final void method491(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field1333 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field1331[var7++] = arg2;
            }
            var5 += field1333;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "()V")
    public static void method492() {
        field1331 = null;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(IIII)V")
    public static final void method493(int arg0, int arg1, int arg2, int arg3) {
        if (field1332 < arg0) {
            field1332 = arg0;
        }
        if (field1334 < arg1) {
            field1334 = arg1;
        }
        if (field1336 > arg2) {
            field1336 = arg2;
        }
        if (field1335 > arg3) {
            field1335 = arg3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "([I)V")
    public static final void method494(int[] arg0) {
        field1332 = arg0[0];
        field1334 = arg0[1];
        field1336 = arg0[2];
        field1335 = arg0[3];
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
    private static final void method495(int arg0, int arg1, int arg2) {
        if (arg0 >= field1332 && arg1 >= field1334 && arg0 < field1336 && arg1 < field1335) {
            field1331[field1333 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([III)V")
    public static final void method496(int[] arg0, int arg1, int arg2) {
        field1331 = arg0;
        field1333 = arg1;
        field1337 = arg2;
        method480(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(IIIIII)V")
    public static final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg1 < field1334) {
            arg3 -= field1334 - arg1;
            arg1 = field1334;
        }
        if (arg0 + arg2 > field1336) {
            arg2 = field1336 - arg0;
        }
        if (arg1 + arg3 > field1335) {
            arg3 = field1335 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field1333 - arg2;
        int var9 = field1333 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field1331[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field1331[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(IIII)V")
    private static final void method498(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method495(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field1334) {
            var4 = field1334;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field1335) {
            var5 = field1335;
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
            if (var21 < field1332) {
                var21 = field1332;
            }
            int var22 = arg0 + var8;
            if (var22 > field1336) {
                var22 = field1336;
            }
            int var23 = field1333 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field1331[var23++] = arg3;
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
            if (var17 < field1332) {
                var17 = field1332;
            }
            int var18 = arg0 + var12;
            if (var18 > field1336 - 1) {
                var18 = field1336 - 1;
            }
            int var19 = field1333 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field1331[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }
}
