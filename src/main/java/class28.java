import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class28 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field425 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
    public static int[] field424;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[I")
    public static int[] field426;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[I")
    public static int[] field427;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method192(arg0, arg1, arg2, arg4, arg5);
        method192(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method194(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method194(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V", line = 19)
    public static final void method180(int arg0, int arg1, int arg2, int arg3) {
        if (field422 < arg0) {
            field422 = arg0;
        }
        if (field425 < arg1) {
            field425 = arg1;
        }
        if (field423 > arg2) {
            field423 = arg2;
        }
        if (field421 > arg3) {
            field421 = arg3;
        }
        method196();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([I)V", line = 40)
    public static final void method181(int[] arg0) {
        arg0[0] = field422;
        arg0[1] = field425;
        arg0[2] = field423;
        arg0[3] = field421;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "([I)V", line = 46)
    public static final void method182(int[] arg0) {
        field422 = arg0[0];
        field425 = arg0[1];
        field423 = arg0[2];
        field421 = arg0[3];
        method196();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V", line = 53)
    public static final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method184(arg0, arg1, arg2, arg4);
        method184(arg0, arg1 + arg3 - 1, arg2, arg4);
        method188(arg0, arg1, arg3, arg4);
        method188(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIII)V", line = 65)
    public static final void method184(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field425 || arg1 >= field421) {
            return;
        }
        if (arg0 < field422) {
            arg2 -= field422 - arg0;
            arg0 = field422;
        }
        if (arg0 + arg2 > field423) {
            arg2 = field423 - arg0;
        }
        int var4 = field428 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field427[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIII)V", line = 90)
    public static final void method185(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field428) {
            arg2 = field428;
        }
        if (arg3 > field420) {
            arg3 = field420;
        }
        field422 = arg0;
        field425 = arg1;
        field423 = arg2;
        field421 = arg3;
        method196();
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIII)V", line = 110)
    public static final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field422) {
            arg2 -= field422 - arg0;
            arg0 = field422;
        }
        if (arg1 < field425) {
            arg3 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg0 + arg2 > field423) {
            arg2 = field423 - arg0;
        }
        if (arg1 + arg3 > field421) {
            arg3 = field421 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field428 - arg2;
        int var9 = field428 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field427[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field427[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V", line = 165)
    public static final void method187() {
        int var0 = 0;
        int var1 = field428 * field420 - 7;
        while (var0 < var1) {
            field427[var0++] = 0;
            field427[var0++] = 0;
            field427[var0++] = 0;
            field427[var0++] = 0;
            field427[var0++] = 0;
            field427[var0++] = 0;
            field427[var0++] = 0;
            field427[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field427[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(IIII)V", line = 186)
    public static final void method188(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field422 || arg0 >= field423) {
            return;
        }
        if (arg1 < field425) {
            arg2 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg1 + arg2 > field421) {
            arg2 = field421 - arg1;
        }
        int var4 = field428 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field427[field428 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([III)V", line = 209)
    public static final void method189(int[] arg0, int arg1, int arg2) {
        field427 = arg0;
        field428 = arg1;
        field420 = arg2;
        method185(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V", line = 215)
    private static final void method190(int arg0, int arg1, int arg2) {
        if (arg0 >= field422 && arg1 >= field425 && arg0 < field423 && arg1 < field421) {
            field427[field428 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V", line = 222)
    public static final void method191() {
        field422 = 0;
        field425 = 0;
        field423 = field428;
        field421 = field420;
        method196();
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIII)V", line = 236)
    private static final void method192(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field425 || arg1 >= field421) {
            return;
        }
        if (arg0 < field422) {
            arg2 -= field422 - arg0;
            arg0 = field422;
        }
        if (arg0 + arg2 > field423) {
            arg2 = field423 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field428 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field427[var9] >> 16 & 0xFF) * var5;
            int var12 = (field427[var9] >> 8 & 0xFF) * var5;
            int var13 = (field427[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field427[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIIII)V", line = 279)
    public static final void method193(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field422) {
            arg2 -= field422 - arg0;
            arg0 = field422;
        }
        if (arg1 < field425) {
            arg3 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg0 + arg2 > field423) {
            arg2 = field423 - arg0;
        }
        if (arg1 + arg3 > field421) {
            arg3 = field421 - arg1;
        }
        int var5 = field428 - arg2;
        int var6 = field428 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field427[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(IIIII)V", line = 325)
    private static final void method194(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field422 || arg0 >= field423) {
            return;
        }
        if (arg1 < field425) {
            arg2 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg1 + arg2 > field421) {
            arg2 = field421 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field428 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field427[var9] >> 16 & 0xFF) * var5;
            int var12 = (field427[var9] >> 8 & 0xFF) * var5;
            int var13 = (field427[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field427[var9] = var14;
            var9 += field428;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(IIII)V", line = 371)
    private static final void method195(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method190(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field425) {
            var4 = field425;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field421) {
            var5 = field421;
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
            if (var12 < field422) {
                var12 = field422;
            }
            int var13 = arg0 + var8;
            if (var13 > field423) {
                var13 = field423;
            }
            int var14 = field428 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field427[var14++] = arg3;
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
            if (var21 < field422) {
                var21 = field422;
            }
            int var22 = arg0 + var16;
            if (var22 > field423 - 1) {
                var22 = field423 - 1;
            }
            int var23 = field428 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field427[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()V", line = 477)
    public static final void method196() {
        field426 = null;
        field424 = null;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()V", line = 484)
    public static void method197() {
        field427 = null;
        field426 = null;
        field424 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[I[I)V", line = 491)
    public static final void method198(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field428 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field427[var7++] = arg2;
            }
            var5 += field428;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(IIIII)V", line = 511)
    public static final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method195(arg0, arg1, arg2, arg3);
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
        if (var9 < field425) {
            var9 = field425;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field421) {
            var10 = field421;
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
            if (var17 < field422) {
                var17 = field422;
            }
            int var18 = arg0 + var13;
            if (var18 > field423) {
                var18 = field423;
            }
            int var19 = field428 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field427[var19] >> 16 & 0xFF) * var5;
                int var22 = (field427[var19] >> 8 & 0xFF) * var5;
                int var23 = (field427[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field427[var19++] = var24;
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
            if (var30 < field422) {
                var30 = field422;
            }
            int var31 = arg0 + var25;
            if (var31 > field423 - 1) {
                var31 = field423 - 1;
            }
            int var32 = field428 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field427[var32] >> 16 & 0xFF) * var5;
                int var35 = (field427[var32] >> 8 & 0xFF) * var5;
                int var36 = (field427[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field427[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([I[I)V", line = 645)
    public static final void method200(int[] arg0, int[] arg1) {
        if (field421 - field425 != arg0.length || field421 - field425 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field426 = arg0;
        field424 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIIIII)V", line = 657)
    public static final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class263.method1892();
        int var18 = arg1 - class263.method1914();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class263.method1912(var19, var20, var21);
        class263.method1903(var23, var24, var25, var19, var20, var21, arg4);
        class263.method1912(var19, var21, var22);
        class263.method1903(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(IIIII)V", line = 713)
    public static final void method202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method184(arg0, arg1, var5 + 1, arg4);
            } else {
                method184(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field422) {
                    var8 += (field422 - arg0) * var10;
                    arg0 = field422;
                }
                if (var11 >= field423) {
                    var11 = field423 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field425 && var12 < field421) {
                        field427[field428 * var12 + arg0] = arg4;
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
                if (arg1 < field425) {
                    var14 += (field425 - arg1) * var16;
                    arg1 = field425;
                }
                if (var17 >= field421) {
                    var17 = field421 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field422 && var18 < field423) {
                        field427[field428 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method188(arg0, arg1, var6 + 1, arg4);
        } else {
            method188(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }
}
