import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class283 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4487 = 0;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4484 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4486 = 0;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    public static int[] field4485;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[I")
    public static int[] field4490;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    public static int[] field4492;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([I)V")
    public static final void method1837(int[] arg0) {
        arg0[0] = field4487;
        arg0[1] = field4486;
        arg0[2] = field4484;
        arg0[3] = field4489;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V")
    public static final void method1838() {
        field4487 = 0;
        field4486 = 0;
        field4484 = field4491;
        field4489 = field4488;
        method1845();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
    public static final void method1839(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4486 || arg1 >= field4489) {
            return;
        }
        if (arg0 < field4487) {
            arg2 -= field4487 - arg0;
            arg0 = field4487;
        }
        if (arg0 + arg2 > field4484) {
            arg2 = field4484 - arg0;
        }
        int var4 = field4491 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4490[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V")
    private static final void method1840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4487 || arg0 >= field4484) {
            return;
        }
        if (arg1 < field4486) {
            arg2 -= field4486 - arg1;
            arg1 = field4486;
        }
        if (arg1 + arg2 > field4489) {
            arg2 = field4489 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field4491 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field4490[var9] >> 16 & 0xFF) * var5;
            int var12 = (field4490[var9] >> 8 & 0xFF) * var5;
            int var13 = (field4490[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field4490[var9] = var14;
            var9 += field4491;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)V")
    private static final void method1841(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1851(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4486) {
            var4 = field4486;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field4489) {
            var5 = field4489;
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
            if (var21 < field4487) {
                var21 = field4487;
            }
            int var22 = arg0 + var8;
            if (var22 > field4484) {
                var22 = field4484;
            }
            int var23 = field4491 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field4490[var23++] = arg3;
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
            if (var17 < field4487) {
                var17 = field4487;
            }
            int var18 = arg0 + var12;
            if (var18 > field4484 - 1) {
                var18 = field4484 - 1;
            }
            int var19 = field4491 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field4490[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([I[I)V")
    public static final void method1842(int[] arg0, int[] arg1) {
        if (field4489 - field4486 != arg0.length || field4489 - field4486 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field4485 = arg0;
        field4492 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III[I[I)V")
    public static final void method1843(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field4491 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field4490[var7++] = arg2;
            }
            var5 += field4491;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()V")
    public static void method1844() {
        field4490 = null;
        field4485 = null;
        field4492 = null;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "()V")
    public static final void method1845() {
        field4485 = null;
        field4492 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIIII)V")
    public static final void method1846(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1839(arg0, arg1, arg2, arg4);
        method1839(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1857(arg0, arg1, arg3, arg4);
        method1857(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "([I)V")
    public static final void method1847(int[] arg0) {
        field4487 = arg0[0];
        field4486 = arg0[1];
        field4484 = arg0[2];
        field4489 = arg0[3];
        method1845();
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(IIIII)V")
    public static final void method1848(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1841(arg0, arg1, arg2, arg3);
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
        if (var9 < field4486) {
            var9 = field4486;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field4489) {
            var10 = field4489;
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
            if (var30 < field4487) {
                var30 = field4487;
            }
            int var31 = arg0 + var13;
            if (var31 > field4484) {
                var31 = field4484;
            }
            int var32 = field4491 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field4490[var32] >> 16 & 0xFF) * var5;
                int var35 = (field4490[var32] >> 8 & 0xFF) * var5;
                int var36 = (field4490[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field4490[var32++] = var37;
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
            if (var22 < field4487) {
                var22 = field4487;
            }
            int var23 = arg0 + var17;
            if (var23 > field4484 - 1) {
                var23 = field4484 - 1;
            }
            int var24 = field4491 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field4490[var24] >> 16 & 0xFF) * var5;
                int var27 = (field4490[var24] >> 8 & 0xFF) * var5;
                int var28 = (field4490[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field4490[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(IIIII)V")
    private static final void method1849(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field4486 || arg1 >= field4489) {
            return;
        }
        if (arg0 < field4487) {
            arg2 -= field4487 - arg0;
            arg0 = field4487;
        }
        if (arg0 + arg2 > field4484) {
            arg2 = field4484 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field4491 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field4490[var9] >> 16 & 0xFF) * var5;
            int var12 = (field4490[var9] >> 8 & 0xFF) * var5;
            int var13 = (field4490[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field4490[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(IIII)V")
    public static final void method1850(int arg0, int arg1, int arg2, int arg3) {
        if (field4487 < arg0) {
            field4487 = arg0;
        }
        if (field4486 < arg1) {
            field4486 = arg1;
        }
        if (field4484 > arg2) {
            field4484 = arg2;
        }
        if (field4489 > arg3) {
            field4489 = arg3;
        }
        method1845();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
    private static final void method1851(int arg0, int arg1, int arg2) {
        if (arg0 >= field4487 && arg1 >= field4486 && arg0 < field4484 && arg1 < field4489) {
            field4490[field4491 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "()V")
    public static final void method1852() {
        int var0 = 0;
        int var1 = field4491 * field4488 - 7;
        while (var0 < var1) {
            field4490[var0++] = 0;
            field4490[var0++] = 0;
            field4490[var0++] = 0;
            field4490[var0++] = 0;
            field4490[var0++] = 0;
            field4490[var0++] = 0;
            field4490[var0++] = 0;
            field4490[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field4490[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field4487) {
            arg2 -= field4487 - arg0;
            arg0 = field4487;
        }
        if (arg1 < field4486) {
            arg3 -= field4486 - arg1;
            arg1 = field4486;
        }
        if (arg0 + arg2 > field4484) {
            arg2 = field4484 - arg0;
        }
        if (arg1 + arg3 > field4489) {
            arg3 = field4489 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field4491 - arg2;
        int var9 = field4491 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field4490[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field4490[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(IIIII)V")
    public static final void method1854(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1839(arg0, arg1, var5 + 1, arg4);
            } else {
                method1839(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field4487) {
                    var8 += (field4487 - arg0) * var10;
                    arg0 = field4487;
                }
                if (var11 >= field4484) {
                    var11 = field4484 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field4486 && var12 < field4489) {
                        field4490[field4491 * var12 + arg0] = arg4;
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
                if (arg1 < field4486) {
                    var14 += (field4486 - arg1) * var16;
                    arg1 = field4486;
                }
                if (var17 >= field4489) {
                    var17 = field4489 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field4487 && var18 < field4484) {
                        field4490[field4491 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1857(arg0, arg1, var6 + 1, arg4);
        } else {
            method1857(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(IIIII)V")
    public static final void method1855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4487) {
            arg2 -= field4487 - arg0;
            arg0 = field4487;
        }
        if (arg1 < field4486) {
            arg3 -= field4486 - arg1;
            arg1 = field4486;
        }
        if (arg0 + arg2 > field4484) {
            arg2 = field4484 - arg0;
        }
        if (arg1 + arg3 > field4489) {
            arg3 = field4489 - arg1;
        }
        int var5 = field4491 - arg2;
        int var6 = field4491 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field4490[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIIIII)V")
    public static final void method1856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class287.method1938();
        int var18 = arg1 - class287.method1934();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class287.method1942(var19, var20, var21);
        class287.method1928(var23, var24, var25, var19, var20, var21, arg4);
        class287.method1942(var19, var21, var22);
        class287.method1928(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(IIII)V")
    public static final void method1857(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field4487 || arg0 >= field4484) {
            return;
        }
        if (arg1 < field4486) {
            arg2 -= field4486 - arg1;
            arg1 = field4486;
        }
        if (arg1 + arg2 > field4489) {
            arg2 = field4489 - arg1;
        }
        int var4 = field4491 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field4490[var4] = arg3;
            var5++;
            var4 += field4491;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(IIII)V")
    public static final void method1858(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field4491) {
            arg2 = field4491;
        }
        if (arg3 > field4488) {
            arg3 = field4488;
        }
        field4487 = arg0;
        field4486 = arg1;
        field4484 = arg2;
        field4489 = arg3;
        method1845();
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(IIIIII)V")
    public static final void method1859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1849(arg0, arg1, arg2, arg4, arg5);
        method1849(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1840(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1840(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([III)V")
    public static final void method1860(int[] arg0, int arg1, int arg2) {
        field4490 = arg0;
        field4491 = arg1;
        field4488 = arg2;
        method1858(0, 0, arg1, arg2);
    }
}
