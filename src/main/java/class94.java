import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class94 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1494 = 0;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field1500 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    public static int[] field1495;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    public static int[] field1498;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
    public static int[] field1502;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIII)V")
    public static final void method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        if (var7 == 0) {
            if (var6 >= 0) {
                method679(arg0, arg1, var6, arg4, arg5);
            } else {
                method679(arg0 + var6 + 1, arg1, -var6, arg4, arg5);
            }
        } else if (var6 != 0) {
            boolean var8 = false;
            if (var6 + var7 < 0) {
                arg0 += var6;
                var6 = -var6;
                arg1 += var7;
                var7 = -var7;
                var8 = true;
            }
            int var9 = 256 - arg5;
            int var10 = (arg4 >> 16 & 0xFF) * arg5;
            int var11 = (arg4 >> 8 & 0xFF) * arg5;
            int var12 = (arg4 & 0xFF) * arg5;
            if (var6 > var7) {
                int var13 = arg1 << 16;
                int var14 = var13 + 32768;
                int var15 = var7 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg0 + var6;
                if (var8) {
                    var14 += var16;
                    arg0++;
                }
                if (arg0 < field1500) {
                    var14 += (field1500 - arg0) * var16;
                    arg0 = field1500;
                }
                if (var17 >= field1499) {
                    var17 = field1499 - 1;
                }
                if (!var8) {
                    var17--;
                }
                while (arg0 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1501 && var18 < field1494) {
                        int var19 = field1496 * var18 + arg0;
                        int var20 = (field1495[var19] >> 16 & 0xFF) * var9;
                        int var21 = (field1495[var19] >> 8 & 0xFF) * var9;
                        int var22 = (field1495[var19] & 0xFF) * var9;
                        int var23 = (var12 + var22 >> 8) + (var10 + var20 >> 8 << 16) + (var11 + var21 >> 8 << 8);
                        field1495[var19] = var23;
                    }
                    var14 += var16;
                    arg0++;
                }
            } else {
                int var24 = arg0 << 16;
                int var25 = var24 + 32768;
                int var26 = var6 << 16;
                int var27 = (int) Math.floor((double) var26 / (double) var7 + 0.5D);
                int var28 = arg1 + var7;
                if (var8) {
                    var25 += var27;
                    arg1++;
                }
                if (arg1 < field1501) {
                    var25 += (field1501 - arg1) * var27;
                    arg1 = field1501;
                }
                if (var28 >= field1494) {
                    var28 = field1494 - 1;
                }
                if (!var8) {
                    var28--;
                }
                while (arg1 <= var28) {
                    int var29 = var25 >> 16;
                    if (var29 >= field1500 && var29 < field1499) {
                        int var30 = field1496 * arg1 + var29;
                        int var31 = (field1495[var30] >> 16 & 0xFF) * var9;
                        int var32 = (field1495[var30] >> 8 & 0xFF) * var9;
                        int var33 = (field1495[var30] & 0xFF) * var9;
                        int var34 = (var12 + var33 >> 8) + (var10 + var31 >> 8 << 16) + (var11 + var32 >> 8 << 8);
                        field1495[var30] = var34;
                    }
                    var25 += var27;
                    arg1++;
                }
            }
        } else if (var7 >= 0) {
            method662(arg0, arg1, var7, arg4, arg5);
        } else {
            method662(arg0, arg1 + var7 + 1, -var7, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([I)V")
    public static final void method657(int[] arg0) {
        arg0[0] = field1500;
        arg0[1] = field1501;
        arg0[2] = field1499;
        arg0[3] = field1494;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
    public static final void method658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method674(arg0, arg1, arg2, arg3);
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
        if (var9 < field1501) {
            var9 = field1501;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field1494) {
            var10 = field1494;
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
            if (var30 < field1500) {
                var30 = field1500;
            }
            int var31 = arg0 + var13;
            if (var31 > field1499) {
                var31 = field1499;
            }
            int var32 = field1496 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field1495[var32] >> 16 & 0xFF) * var5;
                int var35 = (field1495[var32] >> 8 & 0xFF) * var5;
                int var36 = (field1495[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field1495[var32++] = var37;
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
            if (var22 < field1500) {
                var22 = field1500;
            }
            int var23 = arg0 + var17;
            if (var23 > field1499 - 1) {
                var23 = field1499 - 1;
            }
            int var24 = field1496 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field1495[var24] >> 16 & 0xFF) * var5;
                int var27 = (field1495[var24] >> 8 & 0xFF) * var5;
                int var28 = (field1495[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field1495[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "([I)V")
    public static final void method659(int[] arg0) {
        field1500 = arg0[0];
        field1501 = arg0[1];
        field1499 = arg0[2];
        field1494 = arg0[3];
        method677();
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIII)V")
    public static final void method660(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1500) {
            arg2 -= field1500 - arg0;
            arg0 = field1500;
        }
        if (arg1 < field1501) {
            arg3 -= field1501 - arg1;
            arg1 = field1501;
        }
        if (arg0 + arg2 > field1499) {
            arg2 = field1499 - arg0;
        }
        if (arg1 + arg3 > field1494) {
            arg3 = field1494 - arg1;
        }
        int var5 = field1496 - arg2;
        int var6 = field1496 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1495[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([I[I)V")
    public static final void method661(int[] arg0, int[] arg1) {
        if (field1494 - field1501 != arg0.length || field1494 - field1501 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field1498 = arg0;
        field1502 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(IIIII)V")
    private static final void method662(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1500 || arg0 >= field1499) {
            return;
        }
        if (arg1 < field1501) {
            arg2 -= field1501 - arg1;
            arg1 = field1501;
        }
        if (arg1 + arg2 > field1494) {
            arg2 = field1494 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1496 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1495[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1495[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1495[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1495[var9] = var14;
            var9 += field1496;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
    public static final void method663(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1500 || arg0 >= field1499) {
            return;
        }
        if (arg1 < field1501) {
            arg2 -= field1501 - arg1;
            arg1 = field1501;
        }
        if (arg1 + arg2 > field1494) {
            arg2 = field1494 - arg1;
        }
        int var4 = field1496 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field1495[var4] = arg3;
            var5++;
            var4 += field1496;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII[I[I)V")
    private static final void method664(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field1494 - field1501 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg0 >= field1500 && arg0 < field1499) {
            if (arg1 < field1501) {
                arg2 -= field1501 - arg1;
                arg1 = field1501;
            }
            if (arg1 + arg2 > field1494) {
                arg2 = field1494 - arg1;
            }
            int var7 = 256 - arg4;
            int var8 = (arg3 >> 16 & 0xFF) * arg4;
            int var9 = (arg3 >> 8 & 0xFF) * arg4;
            int var10 = (arg3 & 0xFF) * arg4;
            int var11 = field1496 * arg1 + arg0;
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1 + var12 - field1501;
                if (arg0 - field1500 >= arg5[var13] && arg0 - field1500 < arg5[var13] + arg6[var13]) {
                    int var14 = (field1495[var11] >> 16 & 0xFF) * var7;
                    int var15 = (field1495[var11] >> 8 & 0xFF) * var7;
                    int var16 = (field1495[var11] & 0xFF) * var7;
                    int var17 = (var10 + var16 >> 8) + (var8 + var14 >> 8 << 16) + (var9 + var15 >> 8 << 8);
                    field1495[var11] = var17;
                }
                var11 += field1496;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIII)V")
    public static final void method665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method679(arg0, arg1, arg2, arg4, arg5);
        method679(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method662(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method662(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    private static final void method666(int arg0, int arg1, int arg2) {
        if (arg0 >= field1500 && arg1 >= field1501 && arg0 < field1499 && arg1 < field1494) {
            field1495[field1496 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[I[I)V")
    public static final void method667(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field1496 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field1495[var7++] = arg2;
            }
            var5 += field1496;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(IIIIII)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1500) {
            arg2 -= field1500 - arg0;
            arg0 = field1500;
        }
        if (arg1 < field1501) {
            arg3 -= field1501 - arg1;
            arg1 = field1501;
        }
        if (arg0 + arg2 > field1499) {
            arg2 = field1499 - arg0;
        }
        if (arg1 + arg3 > field1494) {
            arg3 = field1494 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field1496 - arg2;
        int var9 = field1496 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field1495[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field1495[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIII[I[I)V")
    private static final void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field1494 - field1501 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg1 >= field1501 && arg1 < field1494) {
            int var7 = arg5[arg1 - field1501] + field1500;
            if (arg0 < var7) {
                arg2 -= var7 - arg0;
                arg0 = var7;
            }
            int var8 = arg5[arg1 - field1501] + field1500 + arg6[arg1 - field1501];
            if (arg0 + arg2 > var8) {
                arg2 = var8 - arg0;
            }
            int var9 = 256 - arg4;
            int var10 = (arg3 >> 16 & 0xFF) * arg4;
            int var11 = (arg3 >> 8 & 0xFF) * arg4;
            int var12 = (arg3 & 0xFF) * arg4;
            int var13 = field1496 * arg1 + arg0;
            for (int var14 = 0; var14 < arg2; var14++) {
                int var15 = (field1495[var13] >> 16 & 0xFF) * var9;
                int var16 = (field1495[var13] >> 8 & 0xFF) * var9;
                int var17 = (field1495[var13] & 0xFF) * var9;
                int var18 = (var12 + var17 >> 8) + (var10 + var15 >> 8 << 16) + (var11 + var16 >> 8 << 8);
                field1495[var13++] = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(IIIII)V")
    public static final void method670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method675(arg0, arg1, arg2, arg4);
        method675(arg0, arg1 + arg3 - 1, arg2, arg4);
        method663(arg0, arg1, arg3, arg4);
        method663(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public static final void method671() {
        field1500 = 0;
        field1501 = 0;
        field1499 = field1496;
        field1494 = field1497;
        method677();
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(IIIIII)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class136.method931();
        int var18 = arg1 - class136.method944();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class136.method930(var19, var20, var21);
        class136.method937(var23, var24, var25, var19, var20, var21, arg4);
        class136.method930(var19, var21, var22);
        class136.method937(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIII)V")
    public static final void method673(int arg0, int arg1, int arg2, int arg3) {
        if (field1500 < arg0) {
            field1500 = arg0;
        }
        if (field1501 < arg1) {
            field1501 = arg1;
        }
        if (field1499 > arg2) {
            field1499 = arg2;
        }
        if (field1494 > arg3) {
            field1494 = arg3;
        }
        method677();
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(IIII)V")
    private static final void method674(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method666(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field1501) {
            var4 = field1501;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field1494) {
            var5 = field1494;
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
            if (var21 < field1500) {
                var21 = field1500;
            }
            int var22 = arg0 + var8;
            if (var22 > field1499) {
                var22 = field1499;
            }
            int var23 = field1496 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field1495[var23++] = arg3;
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
            if (var17 < field1500) {
                var17 = field1500;
            }
            int var18 = arg0 + var12;
            if (var18 > field1499 - 1) {
                var18 = field1499 - 1;
            }
            int var19 = field1496 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field1495[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(IIII)V")
    public static final void method675(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1501 || arg1 >= field1494) {
            return;
        }
        if (arg0 < field1500) {
            arg2 -= field1500 - arg0;
            arg0 = field1500;
        }
        if (arg0 + arg2 > field1499) {
            arg2 = field1499 - arg0;
        }
        int var4 = field1496 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1495[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(IIII)V")
    public static final void method676(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1496) {
            arg2 = field1496;
        }
        if (arg3 > field1497) {
            arg3 = field1497;
        }
        field1500 = arg0;
        field1501 = arg1;
        field1499 = arg2;
        field1494 = arg3;
        method677();
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
    public static final void method677() {
        field1498 = null;
        field1502 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
    public static final void method678() {
        int var0 = 0;
        int var1 = field1497 * field1496 - 7;
        while (var0 < var1) {
            field1495[var0++] = 0;
            field1495[var0++] = 0;
            field1495[var0++] = 0;
            field1495[var0++] = 0;
            field1495[var0++] = 0;
            field1495[var0++] = 0;
            field1495[var0++] = 0;
            field1495[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1495[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(IIIII)V")
    public static final void method679(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1501 || arg1 >= field1494) {
            return;
        }
        if (arg0 < field1500) {
            arg2 -= field1500 - arg0;
            arg0 = field1500;
        }
        if (arg0 + arg2 > field1499) {
            arg2 = field1499 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1496 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1495[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1495[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1495[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1495[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()V")
    public static void method680() {
        field1495 = null;
        field1498 = null;
        field1502 = null;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(IIIII)V")
    public static final void method681(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method675(arg0, arg1, var5 + 1, arg4);
            } else {
                method675(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1500) {
                    var8 += (field1500 - arg0) * var10;
                    arg0 = field1500;
                }
                if (var11 >= field1499) {
                    var11 = field1499 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1501 && var12 < field1494) {
                        field1495[field1496 * var12 + arg0] = arg4;
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
                if (arg1 < field1501) {
                    var14 += (field1501 - arg1) * var16;
                    arg1 = field1501;
                }
                if (var17 >= field1494) {
                    var17 = field1494 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1500 && var18 < field1499) {
                        field1495[field1496 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method663(arg0, arg1, var6 + 1, arg4);
        } else {
            method663(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([III)V")
    public static final void method682(int[] arg0, int arg1, int arg2) {
        field1495 = arg0;
        field1496 = arg1;
        field1497 = arg2;
        method676(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIII[I[I)V")
    public static final void method683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        if (field1494 - field1501 != arg6.length) {
            throw new IllegalStateException();
        }
        int var8 = arg2 - arg0;
        int var9 = arg3 - arg1;
        if (var9 == 0) {
            if (var8 >= 0) {
                method669(arg0, arg1, var8, arg4, arg5, arg6, arg7);
            } else {
                method669(arg0 + var8 + 1, arg1, -var8, arg4, arg5, arg6, arg7);
            }
        } else if (var8 != 0) {
            boolean var10 = false;
            if (var8 + var9 < 0) {
                arg0 += var8;
                var8 = -var8;
                arg1 += var9;
                var9 = -var9;
                var10 = true;
            }
            int var11 = 256 - arg5;
            int var12 = (arg4 >> 16 & 0xFF) * arg5;
            int var13 = (arg4 >> 8 & 0xFF) * arg5;
            int var14 = (arg4 & 0xFF) * arg5;
            if (var8 > var9) {
                int var15 = arg1 << 16;
                int var16 = var15 + 32768;
                int var17 = var9 << 16;
                int var18 = (int) Math.floor((double) var17 / (double) var8 + 0.5D);
                int var19 = arg0 + var8;
                if (var10) {
                    var16 += var18;
                    arg0++;
                }
                if (arg0 < field1500) {
                    var16 += (field1500 - arg0) * var18;
                    arg0 = field1500;
                }
                if (var19 >= field1499) {
                    var19 = field1499 - 1;
                }
                if (!var10) {
                    var19--;
                }
                while (arg0 <= var19) {
                    int var20 = var16 >> 16;
                    int var21 = var20 - field1501;
                    if (var20 >= field1501 && var20 < field1494 && arg0 - field1500 >= arg6[var21] && arg0 - field1500 < arg6[var21] + arg7[var21]) {
                        int var22 = field1496 * var20 + arg0;
                        int var23 = (field1495[var22] >> 16 & 0xFF) * var11;
                        int var24 = (field1495[var22] >> 8 & 0xFF) * var11;
                        int var25 = (field1495[var22] & 0xFF) * var11;
                        int var26 = (var14 + var25 >> 8) + (var12 + var23 >> 8 << 16) + (var13 + var24 >> 8 << 8);
                        field1495[var22] = var26;
                    }
                    var16 += var18;
                    arg0++;
                }
            } else {
                int var27 = arg0 << 16;
                int var28 = var27 + 32768;
                int var29 = var8 << 16;
                int var30 = (int) Math.floor((double) var29 / (double) var9 + 0.5D);
                int var31 = arg1 + var9;
                if (var10) {
                    var28 += var30;
                    arg1++;
                }
                if (arg1 < field1501) {
                    var28 += (field1501 - arg1) * var30;
                    arg1 = field1501;
                }
                if (var31 >= field1494) {
                    var31 = field1494 - 1;
                }
                if (!var10) {
                    var31--;
                }
                while (arg1 <= var31) {
                    int var32 = var28 >> 16;
                    int var33 = arg1 - field1501;
                    if (var32 >= field1500 && var32 < field1499 && var32 - field1500 >= arg6[var33] && var32 - field1500 < arg6[var33] + arg7[var33]) {
                        int var34 = field1496 * arg1 + var32;
                        int var35 = (field1495[var34] >> 16 & 0xFF) * var11;
                        int var36 = (field1495[var34] >> 8 & 0xFF) * var11;
                        int var37 = (field1495[var34] & 0xFF) * var11;
                        int var38 = (var14 + var37 >> 8) + (var12 + var35 >> 8 << 16) + (var13 + var36 >> 8 << 8);
                        field1495[var34] = var38;
                    }
                    var28 += var30;
                    arg1++;
                }
            }
        } else if (var9 >= 0) {
            method664(arg0, arg1, var9, arg4, arg5, arg6, arg7);
        } else {
            method664(arg0, arg1 + var9 + 1, -var9, arg4, arg5, arg6, arg7);
        }
    }
}
