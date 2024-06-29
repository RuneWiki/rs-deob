import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class280 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field4305 = 0;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field4306 = 0;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field4308 = 0;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field4311 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public static int[] field4304;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "[I")
    public static int[] field4309;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
    public static int[] field4310;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III[I[I)V", line = 5)
    public static final void method1962(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field4303 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field4310[var7++] = arg2;
            }
            var5 += field4303;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V", line = 28)
    private static final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field4311 || arg1 >= field4306) {
            return;
        }
        if (arg0 < field4305) {
            arg2 -= field4305 - arg0;
            arg0 = field4305;
        }
        if (arg0 + arg2 > field4308) {
            arg2 = field4308 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field4303 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field4310[var9] >> 16 & 0xFF) * var5;
            int var12 = (field4310[var9] >> 8 & 0xFF) * var5;
            int var13 = (field4310[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field4310[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIII)V", line = 70)
    public static final void method1964(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1982(arg0, arg1, arg2, arg3);
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
        if (var9 < field4311) {
            var9 = field4311;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field4306) {
            var10 = field4306;
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
            if (var17 < field4305) {
                var17 = field4305;
            }
            int var18 = arg0 + var13;
            if (var18 > field4308) {
                var18 = field4308;
            }
            int var19 = field4303 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field4310[var19] >> 16 & 0xFF) * var5;
                int var22 = (field4310[var19] >> 8 & 0xFF) * var5;
                int var23 = (field4310[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field4310[var19++] = var24;
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
            if (var30 < field4305) {
                var30 = field4305;
            }
            int var31 = arg0 + var25;
            if (var31 > field4308 - 1) {
                var31 = field4308 - 1;
            }
            int var32 = field4303 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field4310[var32] >> 16 & 0xFF) * var5;
                int var35 = (field4310[var32] >> 8 & 0xFF) * var5;
                int var36 = (field4310[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field4310[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V", line = 204)
    private static final void method1965(int arg0, int arg1, int arg2) {
        if (arg0 >= field4305 && arg1 >= field4311 && arg0 < field4308 && arg1 < field4306) {
            field4310[field4303 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([I)V", line = 212)
    public static final void method1966(int[] arg0) {
        arg0[0] = field4305;
        arg0[1] = field4311;
        arg0[2] = field4308;
        arg0[3] = field4306;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V", line = 222)
    public static final void method1967(int arg0, int arg1, int arg2, int arg3) {
        if (field4305 < arg0) {
            field4305 = arg0;
        }
        if (field4311 < arg1) {
            field4311 = arg1;
        }
        if (field4308 > arg2) {
            field4308 = arg2;
        }
        if (field4306 > arg3) {
            field4306 = arg3;
        }
        method1981();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V", line = 243)
    public static final void method1968() {
        int var0 = 0;
        int var1 = field4307 * field4303 - 7;
        while (var0 < var1) {
            field4310[var0++] = 0;
            field4310[var0++] = 0;
            field4310[var0++] = 0;
            field4310[var0++] = 0;
            field4310[var0++] = 0;
            field4310[var0++] = 0;
            field4310[var0++] = 0;
            field4310[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field4310[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([I[I)V", line = 266)
    public static final void method1969(int[] arg0, int[] arg1) {
        if (field4306 - field4311 != arg0.length || field4306 - field4311 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field4309 = arg0;
        field4304 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)V", line = 277)
    public static final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field4305) {
            arg2 -= field4305 - arg0;
            arg0 = field4305;
        }
        if (arg1 < field4311) {
            arg3 -= field4311 - arg1;
            arg1 = field4311;
        }
        if (arg0 + arg2 > field4308) {
            arg2 = field4308 - arg0;
        }
        if (arg1 + arg3 > field4306) {
            arg3 = field4306 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field4303 - arg2;
        int var9 = field4303 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field4310[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field4310[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(IIIII)V", line = 329)
    public static final void method1971(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4305) {
            arg2 -= field4305 - arg0;
            arg0 = field4305;
        }
        if (arg1 < field4311) {
            arg3 -= field4311 - arg1;
            arg1 = field4311;
        }
        if (arg0 + arg2 > field4308) {
            arg2 = field4308 - arg0;
        }
        if (arg1 + arg3 > field4306) {
            arg3 = field4306 - arg1;
        }
        int var5 = field4303 - arg2;
        int var6 = field4303 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field4310[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIIII)V", line = 373)
    public static final void method1972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1963(arg0, arg1, arg2, arg4, arg5);
        method1963(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1974(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1974(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)V", line = 385)
    public static final void method1973(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field4305 || arg0 >= field4308) {
            return;
        }
        if (arg1 < field4311) {
            arg2 -= field4311 - arg1;
            arg1 = field4311;
        }
        if (arg1 + arg2 > field4306) {
            arg2 = field4306 - arg1;
        }
        int var4 = field4303 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field4310[var4] = arg3;
            var5++;
            var4 += field4303;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(IIIII)V", line = 408)
    private static final void method1974(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4305 || arg0 >= field4308) {
            return;
        }
        if (arg1 < field4311) {
            arg2 -= field4311 - arg1;
            arg1 = field4311;
        }
        if (arg1 + arg2 > field4306) {
            arg2 = field4306 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field4303 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field4310[var9] >> 16 & 0xFF) * var5;
            int var12 = (field4310[var9] >> 8 & 0xFF) * var5;
            int var13 = (field4310[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field4310[var9] = var14;
            var9 += field4303;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(IIII)V", line = 450)
    public static final void method1975(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4311 || arg1 >= field4306) {
            return;
        }
        if (arg0 < field4305) {
            arg2 -= field4305 - arg0;
            arg0 = field4305;
        }
        if (arg0 + arg2 > field4308) {
            arg2 = field4308 - arg0;
        }
        int var4 = field4303 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4310[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(IIIII)V", line = 478)
    public static final void method1976(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1975(arg0, arg1, var5 + 1, arg4);
            } else {
                method1975(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field4305) {
                    var8 += (field4305 - arg0) * var10;
                    arg0 = field4305;
                }
                if (var11 >= field4308) {
                    var11 = field4308 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field4311 && var12 < field4306) {
                        field4310[field4303 * var12 + arg0] = arg4;
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
                if (arg1 < field4311) {
                    var14 += (field4311 - arg1) * var16;
                    arg1 = field4311;
                }
                if (var17 >= field4306) {
                    var17 = field4306 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field4305 && var18 < field4308) {
                        field4310[field4303 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1973(arg0, arg1, var6 + 1, arg4);
        } else {
            method1973(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()V", line = 571)
    public static void method1977() {
        field4310 = null;
        field4309 = null;
        field4304 = null;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(IIII)V", line = 580)
    public static final void method1978(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field4303) {
            arg2 = field4303;
        }
        if (arg3 > field4307) {
            arg3 = field4307;
        }
        field4305 = arg0;
        field4311 = arg1;
        field4308 = arg2;
        field4306 = arg3;
        method1981();
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(IIIII)V", line = 600)
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1975(arg0, arg1, arg2, arg4);
        method1975(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1973(arg0, arg1, arg3, arg4);
        method1973(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()V", line = 611)
    public static final void method1980() {
        field4305 = 0;
        field4311 = 0;
        field4308 = field4303;
        field4306 = field4307;
        method1981();
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()V", line = 619)
    public static final void method1981() {
        field4309 = null;
        field4304 = null;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(IIII)V", line = 626)
    private static final void method1982(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1965(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4311) {
            var4 = field4311;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field4306) {
            var5 = field4306;
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
            if (var12 < field4305) {
                var12 = field4305;
            }
            int var13 = arg0 + var8;
            if (var13 > field4308) {
                var13 = field4308;
            }
            int var14 = field4303 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field4310[var14++] = arg3;
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
            if (var21 < field4305) {
                var21 = field4305;
            }
            int var22 = arg0 + var16;
            if (var22 > field4308 - 1) {
                var22 = field4308 - 1;
            }
            int var23 = field4303 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field4310[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([III)V", line = 736)
    public static final void method1983(int[] arg0, int arg1, int arg2) {
        field4310 = arg0;
        field4303 = arg1;
        field4307 = arg2;
        method1978(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "([I)V", line = 743)
    public static final void method1984(int[] arg0) {
        field4305 = arg0[0];
        field4311 = arg0[1];
        field4308 = arg0[2];
        field4306 = arg0[3];
        method1981();
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(IIIIII)V", line = 751)
    public static final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class31.method296();
        int var18 = arg1 - class31.method284();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class31.method294(var19, var20, var21);
        class31.method286(var23, var24, var25, var19, var20, var21, arg4);
        class31.method294(var19, var21, var22);
        class31.method286(var23, var25, var26, var19, var21, var22, arg4);
    }
}
