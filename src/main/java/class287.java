import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class287 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field4448 = 0;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field4454 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field4451 = 0;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field4456 = 0;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[I")
    public static int[] field4449;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[I")
    public static int[] field4453;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "[I")
    public static int[] field4455;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V", line = 5)
    private static final void method1972(int arg0, int arg1, int arg2) {
        if (arg0 >= field4451 && arg1 >= field4454 && arg0 < field4448 && arg1 < field4456) {
            field4453[field4452 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([I[I)V", line = 13)
    public static final void method1973(int[] arg0, int[] arg1) {
        if (field4456 - field4454 != arg0.length || field4456 - field4454 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field4455 = arg0;
        field4449 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([I)V", line = 24)
    public static final void method1974(int[] arg0) {
        arg0[0] = field4451;
        arg0[1] = field4454;
        arg0[2] = field4448;
        arg0[3] = field4456;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[I[I)V", line = 40)
    public static final void method1975(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field4452 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field4453[var7++] = arg2;
            }
            var5 += field4452;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V", line = 60)
    private static final void method1976(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1972(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4454) {
            var4 = field4454;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field4456) {
            var5 = field4456;
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
            if (var12 < field4451) {
                var12 = field4451;
            }
            int var13 = arg0 + var8;
            if (var13 > field4448) {
                var13 = field4448;
            }
            int var14 = field4452 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field4453[var14++] = arg3;
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
            if (var21 < field4451) {
                var21 = field4451;
            }
            int var22 = arg0 + var16;
            if (var22 > field4448 - 1) {
                var22 = field4448 - 1;
            }
            int var23 = field4452 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field4453[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V", line = 165)
    public static final void method1977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1994(arg0, arg1, arg2, arg4, arg5);
        method1994(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1993(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1993(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIII)V", line = 182)
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field4451) {
            arg2 -= field4451 - arg0;
            arg0 = field4451;
        }
        if (arg1 < field4454) {
            arg3 -= field4454 - arg1;
            arg1 = field4454;
        }
        if (arg0 + arg2 > field4448) {
            arg2 = field4448 - arg0;
        }
        if (arg1 + arg3 > field4456) {
            arg3 = field4456 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field4452 - arg2;
        int var9 = field4452 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field4453[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field4453[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)V", line = 231)
    public static final void method1979(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field4451 || arg0 >= field4448) {
            return;
        }
        if (arg1 < field4454) {
            arg2 -= field4454 - arg1;
            arg1 = field4454;
        }
        if (arg1 + arg2 > field4456) {
            arg2 = field4456 - arg1;
        }
        int var4 = field4452 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field4453[var4] = arg3;
            var5++;
            var4 += field4452;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIII)V", line = 255)
    public static final void method1980(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field4452) {
            arg2 = field4452;
        }
        if (arg3 > field4450) {
            arg3 = field4450;
        }
        field4451 = arg0;
        field4454 = arg1;
        field4448 = arg2;
        field4456 = arg3;
        method1983();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V", line = 274)
    public static final void method1981(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1990(arg0, arg1, arg2, arg4);
        method1990(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1979(arg0, arg1, arg3, arg4);
        method1979(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 281)
    public static void method1982() {
        field4453 = null;
        field4455 = null;
        field4449 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 286)
    public static final void method1983() {
        field4455 = null;
        field4449 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIII)V", line = 295)
    public static final void method1984(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1976(arg0, arg1, arg2, arg3);
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
        if (var9 < field4454) {
            var9 = field4454;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field4456) {
            var10 = field4456;
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
            if (var17 < field4451) {
                var17 = field4451;
            }
            int var18 = arg0 + var13;
            if (var18 > field4448) {
                var18 = field4448;
            }
            int var19 = field4452 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field4453[var19] >> 16 & 0xFF) * var5;
                int var22 = (field4453[var19] >> 8 & 0xFF) * var5;
                int var23 = (field4453[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field4453[var19++] = var24;
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
            if (var30 < field4451) {
                var30 = field4451;
            }
            int var31 = arg0 + var25;
            if (var31 > field4448 - 1) {
                var31 = field4448 - 1;
            }
            int var32 = field4452 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field4453[var32] >> 16 & 0xFF) * var5;
                int var35 = (field4453[var32] >> 8 & 0xFF) * var5;
                int var36 = (field4453[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field4453[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()V", line = 428)
    public static final void method1985() {
        field4451 = 0;
        field4454 = 0;
        field4448 = field4452;
        field4456 = field4450;
        method1983();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([III)V", line = 441)
    public static final void method1986(int[] arg0, int arg1, int arg2) {
        field4453 = arg0;
        field4452 = arg1;
        field4450 = arg2;
        method1980(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIII)V", line = 447)
    public static final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4451) {
            arg2 -= field4451 - arg0;
            arg0 = field4451;
        }
        if (arg1 < field4454) {
            arg3 -= field4454 - arg1;
            arg1 = field4454;
        }
        if (arg0 + arg2 > field4448) {
            arg2 = field4448 - arg0;
        }
        if (arg1 + arg3 > field4456) {
            arg3 = field4456 - arg1;
        }
        int var5 = field4452 - arg2;
        int var6 = field4452 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field4453[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(IIII)V", line = 491)
    public static final void method1988(int arg0, int arg1, int arg2, int arg3) {
        if (field4451 < arg0) {
            field4451 = arg0;
        }
        if (field4454 < arg1) {
            field4454 = arg1;
        }
        if (field4448 > arg2) {
            field4448 = arg2;
        }
        if (field4456 > arg3) {
            field4456 = arg3;
        }
        method1983();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([I)V", line = 507)
    public static final void method1989(int[] arg0) {
        field4451 = arg0[0];
        field4454 = arg0[1];
        field4448 = arg0[2];
        field4456 = arg0[3];
        method1983();
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(IIII)V", line = 514)
    public static final void method1990(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4454 || arg1 >= field4456) {
            return;
        }
        if (arg0 < field4451) {
            arg2 -= field4451 - arg0;
            arg0 = field4451;
        }
        if (arg0 + arg2 > field4448) {
            arg2 = field4448 - arg0;
        }
        int var4 = field4452 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4453[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(IIIII)V", line = 537)
    public static final void method1991(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1990(arg0, arg1, var5 + 1, arg4);
            } else {
                method1990(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field4451) {
                    var8 += (field4451 - arg0) * var10;
                    arg0 = field4451;
                }
                if (var11 >= field4448) {
                    var11 = field4448 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field4454 && var12 < field4456) {
                        field4453[field4452 * var12 + arg0] = arg4;
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
                if (arg1 < field4454) {
                    var14 += (field4454 - arg1) * var16;
                    arg1 = field4454;
                }
                if (var17 >= field4456) {
                    var17 = field4456 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field4451 && var18 < field4448) {
                        field4453[field4452 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1979(arg0, arg1, var6 + 1, arg4);
        } else {
            method1979(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()V", line = 637)
    public static final void method1992() {
        int var0 = 0;
        int var1 = field4452 * field4450 - 7;
        while (var0 < var1) {
            field4453[var0++] = 0;
            field4453[var0++] = 0;
            field4453[var0++] = 0;
            field4453[var0++] = 0;
            field4453[var0++] = 0;
            field4453[var0++] = 0;
            field4453[var0++] = 0;
            field4453[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field4453[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(IIIII)V", line = 659)
    private static final void method1993(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4451 || arg0 >= field4448) {
            return;
        }
        if (arg1 < field4454) {
            arg2 -= field4454 - arg1;
            arg1 = field4454;
        }
        if (arg1 + arg2 > field4456) {
            arg2 = field4456 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field4452 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field4453[var9] >> 16 & 0xFF) * var5;
            int var12 = (field4453[var9] >> 8 & 0xFF) * var5;
            int var13 = (field4453[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field4453[var9] = var14;
            var9 += field4452;
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(IIIII)V", line = 704)
    private static final void method1994(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field4454 || arg1 >= field4456) {
            return;
        }
        if (arg0 < field4451) {
            arg2 -= field4451 - arg0;
            arg0 = field4451;
        }
        if (arg0 + arg2 > field4448) {
            arg2 = field4448 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field4452 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field4453[var9] >> 16 & 0xFF) * var5;
            int var12 = (field4453[var9] >> 8 & 0xFF) * var5;
            int var13 = (field4453[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field4453[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIIII)V", line = 756)
    public static final void method1995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class164.method1232();
        int var18 = arg1 - class164.method1225();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class164.method1234(var19, var20, var21);
        class164.method1226(var23, var24, var25, var19, var20, var21, arg4);
        class164.method1234(var19, var21, var22);
        class164.method1226(var23, var25, var26, var19, var21, var22, arg4);
    }
}
