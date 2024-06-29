import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class128 {

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field2287 = 0;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
    public static int[] field2286;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
    public static int[] field2288;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
    public static int[] field2290;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
    public static final void method953(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method966(arg0, arg1, var5 + 1, arg4);
            } else {
                method966(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2287) {
                    var8 += (field2287 - arg0) * var10;
                    arg0 = field2287;
                }
                if (var11 >= field2293) {
                    var11 = field2293 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2289 && var12 < field2292) {
                        field2286[field2294 * var12 + arg0] = arg4;
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
                if (arg1 < field2289) {
                    var14 += (field2289 - arg1) * var16;
                    arg1 = field2289;
                }
                if (var17 >= field2292) {
                    var17 = field2292 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2287 && var18 < field2293) {
                        field2286[field2294 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method958(arg0, arg1, var6 + 1, arg4);
        } else {
            method958(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
    public static final void method954() {
        field2287 = 0;
        field2289 = 0;
        field2293 = field2294;
        field2292 = field2291;
        method970();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III[I[I)V")
    public static final void method955(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2294 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2286[var7++] = arg2;
            }
            var5 += field2294;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIIII)V")
    private static final void method956(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2287 || arg0 >= field2293) {
            return;
        }
        if (arg1 < field2289) {
            arg2 -= field2289 - arg1;
            arg1 = field2289;
        }
        if (arg1 + arg2 > field2292) {
            arg2 = field2292 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2294 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2286[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2286[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2286[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2286[var9] = var14;
            var9 += field2294;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    private static final void method957(int arg0, int arg1, int arg2) {
        if (arg0 >= field2287 && arg1 >= field2289 && arg0 < field2293 && arg1 < field2292) {
            field2286[field2294 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V")
    public static final void method958(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2287 || arg0 >= field2293) {
            return;
        }
        if (arg1 < field2289) {
            arg2 -= field2289 - arg1;
            arg1 = field2289;
        }
        if (arg1 + arg2 > field2292) {
            arg2 = field2292 - arg1;
        }
        int var4 = field2294 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2286[field2294 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()V")
    public static void method959() {
        field2286 = null;
        field2290 = null;
        field2288 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([I[I)V")
    public static final void method960(int[] arg0, int[] arg1) {
        if (field2292 - field2289 != arg0.length || field2292 - field2289 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field2290 = arg0;
        field2288 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
    public static final void method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method974(arg0, arg1, arg2, arg4, arg5);
        method974(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method956(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method956(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(IIIII)V")
    public static final void method962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method976(arg0, arg1, arg2, arg3);
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
        if (var9 < field2289) {
            var9 = field2289;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field2292) {
            var10 = field2292;
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
            if (var30 < field2287) {
                var30 = field2287;
            }
            int var31 = arg0 + var13;
            if (var31 > field2293) {
                var31 = field2293;
            }
            int var32 = field2294 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field2286[var32] >> 16 & 0xFF) * var5;
                int var35 = (field2286[var32] >> 8 & 0xFF) * var5;
                int var36 = (field2286[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field2286[var32++] = var37;
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
            if (var22 < field2287) {
                var22 = field2287;
            }
            int var23 = arg0 + var17;
            if (var23 > field2293 - 1) {
                var23 = field2293 - 1;
            }
            int var24 = field2294 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field2286[var24] >> 16 & 0xFF) * var5;
                int var27 = (field2286[var24] >> 8 & 0xFF) * var5;
                int var28 = (field2286[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field2286[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(IIIII)V")
    public static final void method963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method966(arg0, arg1, arg2, arg4);
        method966(arg0, arg1 + arg3 - 1, arg2, arg4);
        method958(arg0, arg1, arg3, arg4);
        method958(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIII)V")
    public static final void method964(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2294) {
            arg2 = field2294;
        }
        if (arg3 > field2291) {
            arg3 = field2291;
        }
        field2287 = arg0;
        field2289 = arg1;
        field2293 = arg2;
        field2292 = arg3;
        method970();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([I)V")
    public static final void method965(int[] arg0) {
        arg0[0] = field2287;
        arg0[1] = field2289;
        arg0[2] = field2293;
        arg0[3] = field2292;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(IIII)V")
    public static final void method966(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2289 || arg1 >= field2292) {
            return;
        }
        if (arg0 < field2287) {
            arg2 -= field2287 - arg0;
            arg0 = field2287;
        }
        if (arg0 + arg2 > field2293) {
            arg2 = field2293 - arg0;
        }
        int var4 = field2294 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2286[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(IIIII)V")
    public static final void method967(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2287) {
            arg2 -= field2287 - arg0;
            arg0 = field2287;
        }
        if (arg1 < field2289) {
            arg3 -= field2289 - arg1;
            arg1 = field2289;
        }
        if (arg0 + arg2 > field2293) {
            arg2 = field2293 - arg0;
        }
        if (arg1 + arg3 > field2292) {
            arg3 = field2292 - arg1;
        }
        int var5 = field2294 - arg2;
        int var6 = field2294 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2286[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIIIII)V")
    public static final void method968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2287) {
            arg2 -= field2287 - arg0;
            arg0 = field2287;
        }
        if (arg1 < field2289) {
            arg3 -= field2289 - arg1;
            arg1 = field2289;
        }
        if (arg0 + arg2 > field2293) {
            arg2 = field2293 - arg0;
        }
        if (arg1 + arg3 > field2292) {
            arg3 = field2292 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2294 - arg2;
        int var9 = field2294 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2286[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2286[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(IIIIII)V")
    public static final void method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class160.method1158();
        int var18 = arg1 - class160.method1147();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class160.method1154(var19, var20, var21);
        class160.method1155(var23, var24, var25, var19, var20, var21, arg4);
        class160.method1154(var19, var21, var22);
        class160.method1155(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()V")
    public static final void method970() {
        field2290 = null;
        field2288 = null;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()V")
    public static final void method971() {
        int var0 = 0;
        int var1 = field2294 * field2291 - 7;
        while (var0 < var1) {
            field2286[var0++] = 0;
            field2286[var0++] = 0;
            field2286[var0++] = 0;
            field2286[var0++] = 0;
            field2286[var0++] = 0;
            field2286[var0++] = 0;
            field2286[var0++] = 0;
            field2286[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2286[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(IIII)V")
    public static final void method972(int arg0, int arg1, int arg2, int arg3) {
        if (field2287 < arg0) {
            field2287 = arg0;
        }
        if (field2289 < arg1) {
            field2289 = arg1;
        }
        if (field2293 > arg2) {
            field2293 = arg2;
        }
        if (field2292 > arg3) {
            field2292 = arg3;
        }
        method970();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)V")
    public static final void method973(int[] arg0, int arg1, int arg2) {
        field2286 = arg0;
        field2294 = arg1;
        field2291 = arg2;
        method964(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(IIIII)V")
    private static final void method974(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2289 || arg1 >= field2292) {
            return;
        }
        if (arg0 < field2287) {
            arg2 -= field2287 - arg0;
            arg0 = field2287;
        }
        if (arg0 + arg2 > field2293) {
            arg2 = field2293 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2294 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2286[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2286[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2286[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2286[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "([I)V")
    public static final void method975(int[] arg0) {
        field2287 = arg0[0];
        field2289 = arg0[1];
        field2293 = arg0[2];
        field2292 = arg0[3];
        method970();
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(IIII)V")
    private static final void method976(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method957(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field2289) {
            var4 = field2289;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field2292) {
            var5 = field2292;
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
            if (var21 < field2287) {
                var21 = field2287;
            }
            int var22 = arg0 + var8;
            if (var22 > field2293) {
                var22 = field2293;
            }
            int var23 = field2294 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field2286[var23++] = arg3;
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
            if (var17 < field2287) {
                var17 = field2287;
            }
            int var18 = arg0 + var12;
            if (var18 > field2293 - 1) {
                var18 = field2293 - 1;
            }
            int var19 = field2294 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field2286[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(IIIIII)V")
    public static final void method977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2287) {
            arg2 -= field2287 - arg0;
            arg0 = field2287;
        }
        if (arg1 < field2289) {
            var6 += (field2289 - arg1) * var7;
            arg3 -= field2289 - arg1;
            arg1 = field2289;
        }
        if (arg0 + arg2 > field2293) {
            arg2 = field2293 - arg0;
        }
        if (arg1 + arg3 > field2292) {
            arg3 = field2292 - arg1;
        }
        int var8 = field2294 - arg2;
        int var9 = field2294 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field2286[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }
}
