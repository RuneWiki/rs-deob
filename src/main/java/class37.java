import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class37 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field446 = 0;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field450 = 0;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    public static int[] field447;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[I")
    public static int[] field448;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
    public static int[] field452;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method230(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method240(arg0, arg1, var5 + 1, arg4);
            } else {
                method240(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field450) {
                    var8 += (field450 - arg0) * var10;
                    arg0 = field450;
                }
                if (var11 >= field451) {
                    var11 = field451 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field446 && var12 < field453) {
                        field452[field454 * var12 + arg0] = arg4;
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
                if (arg1 < field446) {
                    var14 += (field446 - arg1) * var16;
                    arg1 = field446;
                }
                if (var17 >= field453) {
                    var17 = field453 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field450 && var18 < field451) {
                        field452[field454 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method238(arg0, arg1, var6 + 1, arg4);
        } else {
            method238(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIII)V", line = 96)
    public static final void method231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field450) {
            arg2 -= field450 - arg0;
            arg0 = field450;
        }
        if (arg1 < field446) {
            arg3 -= field446 - arg1;
            arg1 = field446;
        }
        if (arg0 + arg2 > field451) {
            arg2 = field451 - arg0;
        }
        if (arg1 + arg3 > field453) {
            arg3 = field453 - arg1;
        }
        int var5 = field454 - arg2;
        int var6 = field454 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field452[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIIII)V", line = 140)
    public static final void method232(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method234(arg0, arg1, arg2, arg3);
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
        if (var9 < field446) {
            var9 = field446;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field453) {
            var10 = field453;
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
            int var17 = arg0 + 1 - var13;
            if (var17 < field450) {
                var17 = field450;
            }
            int var18 = arg0 + var13;
            if (var18 > field451) {
                var18 = field451;
            }
            int var19 = field454 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field452[var19] >> 16 & 0xFF) * var5;
                int var22 = (field452[var19] >> 8 & 0xFF) * var5;
                int var23 = (field452[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field452[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field450) {
                var30 = field450;
            }
            int var31 = arg0 + var25;
            if (var31 > field451 - 1) {
                var31 = field451 - 1;
            }
            int var32 = field454 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field452[var32] >> 16 & 0xFF) * var5;
                int var35 = (field452[var32] >> 8 & 0xFF) * var5;
                int var36 = (field452[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field452[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII[I[I)V", line = 273)
    private static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field453 - field446 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg0 >= field450 && arg0 < field451) {
            if (arg1 < field446) {
                arg2 -= field446 - arg1;
                arg1 = field446;
            }
            if (arg1 + arg2 > field453) {
                arg2 = field453 - arg1;
            }
            int var7 = 256 - arg4;
            int var8 = (arg3 >> 16 & 0xFF) * arg4;
            int var9 = (arg3 >> 8 & 0xFF) * arg4;
            int var10 = (arg3 & 0xFF) * arg4;
            int var11 = field454 * arg1 + arg0;
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1 + var12 - field446;
                if (arg0 - field450 >= arg5[var13] && arg0 - field450 < arg5[var13] + arg6[var13]) {
                    int var14 = (field452[var11] >> 16 & 0xFF) * var7;
                    int var15 = (field452[var11] >> 8 & 0xFF) * var7;
                    int var16 = (field452[var11] & 0xFF) * var7;
                    int var17 = (var10 + var16 >> 8) + (var8 + var14 >> 8 << 16) + (var9 + var15 >> 8 << 8);
                    field452[var11] = var17;
                }
                var11 += field454;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V", line = 324)
    private static final void method234(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method237(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field446) {
            var4 = field446;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field453) {
            var5 = field453;
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
            int var12 = arg0 + 1 - var8;
            if (var12 < field450) {
                var12 = field450;
            }
            int var13 = arg0 + var8;
            if (var13 > field451) {
                var13 = field451;
            }
            int var14 = field454 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field452[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field450) {
                var21 = field450;
            }
            int var22 = arg0 + var16;
            if (var22 > field451 - 1) {
                var22 = field451 - 1;
            }
            int var23 = field454 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field452[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIII)V", line = 431)
    public static final void method235(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field454) {
            arg2 = field454;
        }
        if (arg3 > field449) {
            arg3 = field449;
        }
        field450 = arg0;
        field446 = arg1;
        field451 = arg2;
        field453 = arg3;
        method254();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III[I[I)V", line = 455)
    public static final void method236(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field454 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field452[var7++] = arg2;
            }
            var5 += field454;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V", line = 476)
    private static final void method237(int arg0, int arg1, int arg2) {
        if (arg0 >= field450 && arg1 >= field446 && arg0 < field451 && arg1 < field453) {
            field452[field454 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIII)V", line = 493)
    public static final void method238(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field450 || arg0 >= field451) {
            return;
        }
        if (arg1 < field446) {
            arg2 -= field446 - arg1;
            arg1 = field446;
        }
        if (arg1 + arg2 > field453) {
            arg2 = field453 - arg1;
        }
        int var4 = field454 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field452[var4] = arg3;
            var5++;
            var4 += field454;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V", line = 517)
    public static final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field450) {
            arg2 -= field450 - arg0;
            arg0 = field450;
        }
        if (arg1 < field446) {
            arg3 -= field446 - arg1;
            arg1 = field446;
        }
        if (arg0 + arg2 > field451) {
            arg2 = field451 - arg0;
        }
        if (arg1 + arg3 > field453) {
            arg3 = field453 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field454 - arg2;
        int var9 = field454 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field452[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field452[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(IIII)V", line = 566)
    public static final void method240(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field446 || arg1 >= field453) {
            return;
        }
        if (arg0 < field450) {
            arg2 -= field450 - arg0;
            arg0 = field450;
        }
        if (arg0 + arg2 > field451) {
            arg2 = field451 - arg0;
        }
        int var4 = field454 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field452[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIIII)V", line = 593)
    public static final void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class350.method2431();
        int var18 = arg1 - class350.method2429();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class350.method2425(var19, var20, var21);
        class350.method2433(var23, var24, var25, var19, var20, var21, arg4);
        class350.method2425(var19, var21, var22);
        class350.method2433(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(IIIII)V", line = 651)
    private static final void method242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field450 || arg0 >= field451) {
            return;
        }
        if (arg1 < field446) {
            arg2 -= field446 - arg1;
            arg1 = field446;
        }
        if (arg1 + arg2 > field453) {
            arg2 = field453 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field454 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field452[var9] >> 16 & 0xFF) * var5;
            int var12 = (field452[var9] >> 8 & 0xFF) * var5;
            int var13 = (field452[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field452[var9] = var14;
            var9 += field454;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 695)
    public static void method243() {
        field452 = null;
        field447 = null;
        field448 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([I[I)V", line = 704)
    public static final void method244(int[] arg0, int[] arg1) {
        if (field453 - field446 != arg0.length || field453 - field446 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field447 = arg0;
        field448 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII[I[I)V", line = 717)
    public static final void method245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        if (field453 - field446 != arg6.length) {
            throw new IllegalStateException();
        }
        int var8 = arg2 - arg0;
        int var9 = arg3 - arg1;
        if (var9 == 0) {
            if (var8 >= 0) {
                method257(arg0, arg1, var8, arg4, arg5, arg6, arg7);
            } else {
                method257(arg0 + var8 + 1, arg1, -var8, arg4, arg5, arg6, arg7);
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
                if (arg0 < field450) {
                    var16 += (field450 - arg0) * var18;
                    arg0 = field450;
                }
                if (var19 >= field451) {
                    var19 = field451 - 1;
                }
                if (!var10) {
                    var19--;
                }
                while (arg0 <= var19) {
                    int var20 = var16 >> 16;
                    int var21 = var20 - field446;
                    if (var20 >= field446 && var20 < field453 && arg0 - field450 >= arg6[var21] && arg0 - field450 < arg6[var21] + arg7[var21]) {
                        int var22 = field454 * var20 + arg0;
                        int var23 = (field452[var22] >> 16 & 0xFF) * var11;
                        int var24 = (field452[var22] >> 8 & 0xFF) * var11;
                        int var25 = (field452[var22] & 0xFF) * var11;
                        int var26 = (var14 + var25 >> 8) + (var12 + var23 >> 8 << 16) + (var13 + var24 >> 8 << 8);
                        field452[var22] = var26;
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
                if (arg1 < field446) {
                    var28 += (field446 - arg1) * var30;
                    arg1 = field446;
                }
                if (var31 >= field453) {
                    var31 = field453 - 1;
                }
                if (!var10) {
                    var31--;
                }
                while (arg1 <= var31) {
                    int var32 = var28 >> 16;
                    int var33 = arg1 - field446;
                    if (var32 >= field450 && var32 < field451 && var32 - field450 >= arg6[var33] && var32 - field450 < arg6[var33] + arg7[var33]) {
                        int var34 = field454 * arg1 + var32;
                        int var35 = (field452[var34] >> 16 & 0xFF) * var11;
                        int var36 = (field452[var34] >> 8 & 0xFF) * var11;
                        int var37 = (field452[var34] & 0xFF) * var11;
                        int var38 = (var14 + var37 >> 8) + (var12 + var35 >> 8 << 16) + (var13 + var36 >> 8 << 8);
                        field452[var34] = var38;
                    }
                    var28 += var30;
                    arg1++;
                }
            }
        } else if (var9 >= 0) {
            method233(arg0, arg1, var9, arg4, arg5, arg6, arg7);
        } else {
            method233(arg0, arg1 + var9 + 1, -var9, arg4, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(IIII)V", line = 868)
    public static final void method246(int arg0, int arg1, int arg2, int arg3) {
        if (field450 < arg0) {
            field450 = arg0;
        }
        if (field446 < arg1) {
            field446 = arg1;
        }
        if (field451 > arg2) {
            field451 = arg2;
        }
        if (field453 > arg3) {
            field453 = arg3;
        }
        method254();
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIIIII)V", line = 884)
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method251(arg0, arg1, arg2, arg4, arg5);
        method251(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method242(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method242(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(IIIII)V", line = 895)
    public static final void method248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method240(arg0, arg1, arg2, arg4);
        method240(arg0, arg1 + arg3 - 1, arg2, arg4);
        method238(arg0, arg1, arg3, arg4);
        method238(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([I)V", line = 906)
    public static final void method249(int[] arg0) {
        arg0[0] = field450;
        arg0[1] = field446;
        arg0[2] = field451;
        arg0[3] = field453;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([III)V", line = 912)
    public static final void method250(int[] arg0, int arg1, int arg2) {
        field452 = arg0;
        field454 = arg1;
        field449 = arg2;
        method235(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(IIIII)V", line = 921)
    public static final void method251(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field446 || arg1 >= field453) {
            return;
        }
        if (arg0 < field450) {
            arg2 -= field450 - arg0;
            arg0 = field450;
        }
        if (arg0 + arg2 > field451) {
            arg2 = field451 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field454 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field452[var9] >> 16 & 0xFF) * var5;
            int var12 = (field452[var9] >> 8 & 0xFF) * var5;
            int var13 = (field452[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field452[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "([I)V", line = 962)
    public static final void method252(int[] arg0) {
        field450 = arg0[0];
        field446 = arg0[1];
        field451 = arg0[2];
        field453 = arg0[3];
        method254();
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()V", line = 977)
    public static final void method253() {
        int var0 = 0;
        int var1 = field454 * field449 - 7;
        while (var0 < var1) {
            field452[var0++] = 0;
            field452[var0++] = 0;
            field452[var0++] = 0;
            field452[var0++] = 0;
            field452[var0++] = 0;
            field452[var0++] = 0;
            field452[var0++] = 0;
            field452[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field452[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()V", line = 998)
    public static final void method254() {
        field447 = null;
        field448 = null;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()V", line = 1004)
    public static final void method255() {
        field450 = 0;
        field446 = 0;
        field451 = field454;
        field453 = field449;
        method254();
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(IIIIII)V", line = 1012)
    public static final void method256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        if (var7 == 0) {
            if (var6 >= 0) {
                method251(arg0, arg1, var6, arg4, arg5);
            } else {
                method251(arg0 + var6 + 1, arg1, -var6, arg4, arg5);
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
                if (arg0 < field450) {
                    var14 += (field450 - arg0) * var16;
                    arg0 = field450;
                }
                if (var17 >= field451) {
                    var17 = field451 - 1;
                }
                if (!var8) {
                    var17--;
                }
                while (arg0 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field446 && var18 < field453) {
                        int var19 = field454 * var18 + arg0;
                        int var20 = (field452[var19] >> 16 & 0xFF) * var9;
                        int var21 = (field452[var19] >> 8 & 0xFF) * var9;
                        int var22 = (field452[var19] & 0xFF) * var9;
                        int var23 = (var12 + var22 >> 8) + (var10 + var20 >> 8 << 16) + (var11 + var21 >> 8 << 8);
                        field452[var19] = var23;
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
                if (arg1 < field446) {
                    var25 += (field446 - arg1) * var27;
                    arg1 = field446;
                }
                if (var28 >= field453) {
                    var28 = field453 - 1;
                }
                if (!var8) {
                    var28--;
                }
                while (arg1 <= var28) {
                    int var29 = var25 >> 16;
                    if (var29 >= field450 && var29 < field451) {
                        int var30 = field454 * arg1 + var29;
                        int var31 = (field452[var30] >> 16 & 0xFF) * var9;
                        int var32 = (field452[var30] >> 8 & 0xFF) * var9;
                        int var33 = (field452[var30] & 0xFF) * var9;
                        int var34 = (var12 + var33 >> 8) + (var10 + var31 >> 8 << 16) + (var11 + var32 >> 8 << 8);
                        field452[var30] = var34;
                    }
                    var25 += var27;
                    arg1++;
                }
            }
        } else if (var7 >= 0) {
            method242(arg0, arg1, var7, arg4, arg5);
        } else {
            method242(arg0, arg1 + var7 + 1, -var7, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIII[I[I)V", line = 1157)
    private static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field453 - field446 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg1 >= field446 && arg1 < field453) {
            int var7 = arg5[arg1 - field446] + field450;
            if (arg0 < var7) {
                arg2 -= var7 - arg0;
                arg0 = var7;
            }
            int var8 = arg5[arg1 - field446] + field450 + arg6[arg1 - field446];
            if (arg0 + arg2 > var8) {
                arg2 = var8 - arg0;
            }
            int var9 = 256 - arg4;
            int var10 = (arg3 >> 16 & 0xFF) * arg4;
            int var11 = (arg3 >> 8 & 0xFF) * arg4;
            int var12 = (arg3 & 0xFF) * arg4;
            int var13 = field454 * arg1 + arg0;
            for (int var14 = 0; var14 < arg2; var14++) {
                int var15 = (field452[var13] >> 16 & 0xFF) * var9;
                int var16 = (field452[var13] >> 8 & 0xFF) * var9;
                int var17 = (field452[var13] & 0xFF) * var9;
                int var18 = (var12 + var17 >> 8) + (var10 + var15 >> 8 << 16) + (var11 + var16 >> 8 << 8);
                field452[var13++] = var18;
            }
        }
    }
}
