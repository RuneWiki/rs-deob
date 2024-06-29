import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class192 {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3331 = 0;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field3333 = 0;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3336 = 0;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "[I")
    public static int[] field3329;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
    public static int[] field3330;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[I")
    public static int[] field3332;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V")
    public static final void method1294(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1306(arg0, arg1, arg2, arg3);
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
        if (var9 < field3336) {
            var9 = field3336;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3331) {
            var10 = field3331;
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
            if (var30 < field3334) {
                var30 = field3334;
            }
            int var31 = arg0 + var13;
            if (var31 > field3333) {
                var31 = field3333;
            }
            int var32 = field3335 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field3330[var32] >> 16 & 0xFF) * var5;
                int var35 = (field3330[var32] >> 8 & 0xFF) * var5;
                int var36 = (field3330[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field3330[var32++] = var37;
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
            if (var22 < field3334) {
                var22 = field3334;
            }
            int var23 = arg0 + var17;
            if (var23 > field3333 - 1) {
                var23 = field3333 - 1;
            }
            int var24 = field3335 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field3330[var24] >> 16 & 0xFF) * var5;
                int var27 = (field3330[var24] >> 8 & 0xFF) * var5;
                int var28 = (field3330[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field3330[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public static final void method1295() {
        field3334 = 0;
        field3336 = 0;
        field3333 = field3335;
        field3331 = field3337;
        method1314();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([I[I)V")
    public static final void method1296(int[] arg0, int[] arg1) {
        if (field3331 - field3336 != arg0.length || field3331 - field3336 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field3332 = arg0;
        field3329 = arg1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public static void method1297() {
        field3330 = null;
        field3332 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    private static final void method1298(int arg0, int arg1, int arg2) {
        if (arg0 >= field3334 && arg1 >= field3336 && arg0 < field3333 && arg1 < field3331) {
            field3330[field3335 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([I)V")
    public static final void method1299(int[] arg0) {
        field3334 = arg0[0];
        field3336 = arg0[1];
        field3333 = arg0[2];
        field3331 = arg0[3];
        method1314();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V")
    public static final void method1300(int[] arg0, int arg1, int arg2) {
        field3330 = arg0;
        field3335 = arg1;
        field3337 = arg2;
        method1309(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIII)V")
    public static final void method1301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3334) {
            arg2 -= field3334 - arg0;
            arg0 = field3334;
        }
        if (arg1 < field3336) {
            arg3 -= field3336 - arg1;
            arg1 = field3336;
        }
        if (arg0 + arg2 > field3333) {
            arg2 = field3333 - arg0;
        }
        if (arg1 + arg3 > field3331) {
            arg3 = field3331 - arg1;
        }
        int var5 = field3335 - arg2;
        int var6 = field3335 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3330[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([I)V")
    public static final void method1302(int[] arg0) {
        arg0[0] = field3334;
        arg0[1] = field3336;
        arg0[2] = field3333;
        arg0[3] = field3331;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIII)V")
    public static final void method1303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1308(arg0, arg1, arg2, arg4, arg5);
        method1308(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1317(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1317(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(IIIII)V")
    public static final void method1304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1307(arg0, arg1, var5 + 1, arg4);
            } else {
                method1307(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3334) {
                    var8 += (field3334 - arg0) * var10;
                    arg0 = field3334;
                }
                if (var11 >= field3333) {
                    var11 = field3333 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3336 && var12 < field3331) {
                        field3330[field3335 * var12 + arg0] = arg4;
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
                if (arg1 < field3336) {
                    var14 += (field3336 - arg1) * var16;
                    arg1 = field3336;
                }
                if (var17 >= field3331) {
                    var17 = field3331 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3334 && var18 < field3333) {
                        field3330[field3335 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1312(arg0, arg1, var6 + 1, arg4);
        } else {
            method1312(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[I[I)V")
    public static final void method1305(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3335 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3330[var7++] = arg2;
            }
            var5 += field3335;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    private static final void method1306(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1298(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3336) {
            var4 = field3336;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3331) {
            var5 = field3331;
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
            if (var21 < field3334) {
                var21 = field3334;
            }
            int var22 = arg0 + var8;
            if (var22 > field3333) {
                var22 = field3333;
            }
            int var23 = field3335 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field3330[var23++] = arg3;
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
            if (var17 < field3334) {
                var17 = field3334;
            }
            int var18 = arg0 + var12;
            if (var18 > field3333 - 1) {
                var18 = field3333 - 1;
            }
            int var19 = field3335 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field3330[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)V")
    public static final void method1307(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3336 || arg1 >= field3331) {
            return;
        }
        if (arg0 < field3334) {
            arg2 -= field3334 - arg0;
            arg0 = field3334;
        }
        if (arg0 + arg2 > field3333) {
            arg2 = field3333 - arg0;
        }
        int var4 = field3335 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3330[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(IIIII)V")
    private static final void method1308(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3336 || arg1 >= field3331) {
            return;
        }
        if (arg0 < field3334) {
            arg2 -= field3334 - arg0;
            arg0 = field3334;
        }
        if (arg0 + arg2 > field3333) {
            arg2 = field3333 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3335 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3330[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3330[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3330[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3330[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(IIII)V")
    public static final void method1309(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3335) {
            arg2 = field3335;
        }
        if (arg3 > field3337) {
            arg3 = field3337;
        }
        field3334 = arg0;
        field3336 = arg1;
        field3333 = arg2;
        field3331 = arg3;
        method1314();
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()V")
    public static final void method1310() {
        int var0 = 0;
        int var1 = field3337 * field3335 - 7;
        while (var0 < var1) {
            field3330[var0++] = 0;
            field3330[var0++] = 0;
            field3330[var0++] = 0;
            field3330[var0++] = 0;
            field3330[var0++] = 0;
            field3330[var0++] = 0;
            field3330[var0++] = 0;
            field3330[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3330[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIIII)V")
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class150.method1017();
        int var18 = arg1 - class150.method1022();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class150.method1023(var19, var20, var21);
        class150.method1010(var23, var24, var25, var19, var20, var21, arg4);
        class150.method1023(var19, var21, var22);
        class150.method1010(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(IIII)V")
    public static final void method1312(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3334 || arg0 >= field3333) {
            return;
        }
        if (arg1 < field3336) {
            arg2 -= field3336 - arg1;
            arg1 = field3336;
        }
        if (arg1 + arg2 > field3331) {
            arg2 = field3331 - arg1;
        }
        int var4 = field3335 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3330[field3335 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(IIIIII)V")
    public static final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3334) {
            arg2 -= field3334 - arg0;
            arg0 = field3334;
        }
        if (arg1 < field3336) {
            arg3 -= field3336 - arg1;
            arg1 = field3336;
        }
        if (arg0 + arg2 > field3333) {
            arg2 = field3333 - arg0;
        }
        if (arg1 + arg3 > field3331) {
            arg3 = field3331 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3335 - arg2;
        int var9 = field3335 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3330[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3330[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
    public static final void method1314() {
        field3332 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(IIII)V")
    public static final void method1315(int arg0, int arg1, int arg2, int arg3) {
        if (field3334 < arg0) {
            field3334 = arg0;
        }
        if (field3336 < arg1) {
            field3336 = arg1;
        }
        if (field3333 > arg2) {
            field3333 = arg2;
        }
        if (field3331 > arg3) {
            field3331 = arg3;
        }
        method1314();
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(IIIII)V")
    public static final void method1316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1307(arg0, arg1, arg2, arg4);
        method1307(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1312(arg0, arg1, arg3, arg4);
        method1312(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(IIIII)V")
    private static final void method1317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3334 || arg0 >= field3333) {
            return;
        }
        if (arg1 < field3336) {
            arg2 -= field3336 - arg1;
            arg1 = field3336;
        }
        if (arg1 + arg2 > field3331) {
            arg2 = field3331 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3335 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3330[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3330[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3330[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3330[var9] = var14;
            var9 += field3335;
        }
    }
}
