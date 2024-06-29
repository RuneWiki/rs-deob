import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class96 {

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field1374 = 0;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field1375 = 0;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
    public static int[] field1372;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "[I")
    public static int[] field1373;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
    public static int[] field1376;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V", line = 5)
    public static final void method628() {
        int var0 = 0;
        int var1 = field1380 * field1377 - 7;
        while (var0 < var1) {
            field1376[var0++] = 0;
            field1376[var0++] = 0;
            field1376[var0++] = 0;
            field1376[var0++] = 0;
            field1376[var0++] = 0;
            field1376[var0++] = 0;
            field1376[var0++] = 0;
            field1376[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1376[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()V", line = 26)
    public static final void method629() {
        field1379 = 0;
        field1375 = 0;
        field1378 = field1380;
        field1374 = field1377;
        method637();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V", line = 36)
    public static final void method630(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1379 || arg0 >= field1378) {
            return;
        }
        if (arg1 < field1375) {
            arg2 -= field1375 - arg1;
            arg1 = field1375;
        }
        if (arg1 + arg2 > field1374) {
            arg2 = field1374 - arg1;
        }
        int var4 = field1380 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1376[field1380 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIII)V", line = 63)
    private static final void method631(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method643(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field1375) {
            var4 = field1375;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field1374) {
            var5 = field1374;
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
            if (var12 < field1379) {
                var12 = field1379;
            }
            int var13 = arg0 + var8;
            if (var13 > field1378) {
                var13 = field1378;
            }
            int var14 = field1380 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field1376[var14++] = arg3;
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
            if (var21 < field1379) {
                var21 = field1379;
            }
            int var22 = arg0 + var16;
            if (var22 > field1378 - 1) {
                var22 = field1378 - 1;
            }
            int var23 = field1380 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field1376[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III[I[I)V", line = 169)
    public static final void method632(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field1380 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field1376[var7++] = arg2;
            }
            var5 += field1380;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V", line = 188)
    private static final void method633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1375 || arg1 >= field1374) {
            return;
        }
        if (arg0 < field1379) {
            arg2 -= field1379 - arg0;
            arg0 = field1379;
        }
        if (arg0 + arg2 > field1378) {
            arg2 = field1378 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1380 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1376[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1376[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1376[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1376[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(IIII)V", line = 229)
    public static final void method634(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1380) {
            arg2 = field1380;
        }
        if (arg3 > field1377) {
            arg3 = field1377;
        }
        field1379 = arg0;
        field1375 = arg1;
        field1378 = arg2;
        field1374 = arg3;
        method637();
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIIII)V", line = 249)
    public static final void method635(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1379) {
            arg2 -= field1379 - arg0;
            arg0 = field1379;
        }
        if (arg1 < field1375) {
            arg3 -= field1375 - arg1;
            arg1 = field1375;
        }
        if (arg0 + arg2 > field1378) {
            arg2 = field1378 - arg0;
        }
        if (arg1 + arg3 > field1374) {
            arg3 = field1374 - arg1;
        }
        int var5 = field1380 - arg2;
        int var6 = field1380 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1376[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([I)V", line = 294)
    public static final void method636(int[] arg0) {
        arg0[0] = field1379;
        arg0[1] = field1375;
        arg0[2] = field1378;
        arg0[3] = field1374;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()V", line = 300)
    public static final void method637() {
        field1372 = null;
        field1373 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([III)V", line = 305)
    public static final void method638(int[] arg0, int arg1, int arg2) {
        field1376 = arg0;
        field1380 = arg1;
        field1377 = arg2;
        method634(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()V", line = 315)
    public static void method639() {
        field1376 = null;
        field1372 = null;
        field1373 = null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "([I)V", line = 334)
    public static final void method640(int[] arg0) {
        field1379 = arg0[0];
        field1375 = arg0[1];
        field1378 = arg0[2];
        field1374 = arg0[3];
        method637();
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(IIIII)V", line = 341)
    public static final void method641(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method631(arg0, arg1, arg2, arg3);
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
        if (var9 < field1375) {
            var9 = field1375;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field1374) {
            var10 = field1374;
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
            if (var17 < field1379) {
                var17 = field1379;
            }
            int var18 = arg0 + var13;
            if (var18 > field1378) {
                var18 = field1378;
            }
            int var19 = field1380 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field1376[var19] >> 16 & 0xFF) * var5;
                int var22 = (field1376[var19] >> 8 & 0xFF) * var5;
                int var23 = (field1376[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field1376[var19++] = var24;
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
            if (var30 < field1379) {
                var30 = field1379;
            }
            int var31 = arg0 + var25;
            if (var31 > field1378 - 1) {
                var31 = field1378 - 1;
            }
            int var32 = field1380 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field1376[var32] >> 16 & 0xFF) * var5;
                int var35 = (field1376[var32] >> 8 & 0xFF) * var5;
                int var36 = (field1376[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field1376[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V", line = 474)
    public static final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method633(arg0, arg1, arg2, arg4, arg5);
        method633(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method650(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method650(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V", line = 484)
    private static final void method643(int arg0, int arg1, int arg2) {
        if (arg0 >= field1379 && arg1 >= field1375 && arg0 < field1378 && arg1 < field1374) {
            field1376[field1380 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIIIII)V", line = 493)
    public static final void method644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1379) {
            arg2 -= field1379 - arg0;
            arg0 = field1379;
        }
        if (arg1 < field1375) {
            arg3 -= field1375 - arg1;
            arg1 = field1375;
        }
        if (arg0 + arg2 > field1378) {
            arg2 = field1378 - arg0;
        }
        if (arg1 + arg3 > field1374) {
            arg3 = field1374 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field1380 - arg2;
        int var9 = field1380 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field1376[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field1376[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(IIIIII)V", line = 546)
    public static final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class181.method1202();
        int var18 = arg1 - class181.method1194();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class181.method1199(var19, var20, var21);
        class181.method1207(var23, var24, var25, var19, var20, var21, arg4);
        class181.method1199(var19, var21, var22);
        class181.method1207(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([I[I)V", line = 609)
    public static final void method646(int[] arg0, int[] arg1) {
        if (field1374 - field1375 != arg0.length || field1374 - field1375 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field1372 = arg0;
        field1373 = arg1;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(IIII)V", line = 620)
    public static final void method647(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1375 || arg1 >= field1374) {
            return;
        }
        if (arg0 < field1379) {
            arg2 -= field1379 - arg0;
            arg0 = field1379;
        }
        if (arg0 + arg2 > field1378) {
            arg2 = field1378 - arg0;
        }
        int var4 = field1380 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1376[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(IIIII)V", line = 646)
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method647(arg0, arg1, arg2, arg4);
        method647(arg0, arg1 + arg3 - 1, arg2, arg4);
        method630(arg0, arg1, arg3, arg4);
        method630(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(IIIII)V", line = 655)
    public static final void method649(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method647(arg0, arg1, var5 + 1, arg4);
            } else {
                method647(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1379) {
                    var8 += (field1379 - arg0) * var10;
                    arg0 = field1379;
                }
                if (var11 >= field1378) {
                    var11 = field1378 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1375 && var12 < field1374) {
                        field1376[field1380 * var12 + arg0] = arg4;
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
                if (arg1 < field1375) {
                    var14 += (field1375 - arg1) * var16;
                    arg1 = field1375;
                }
                if (var17 >= field1374) {
                    var17 = field1374 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1379 && var18 < field1378) {
                        field1376[field1380 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method630(arg0, arg1, var6 + 1, arg4);
        } else {
            method630(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(IIIII)V", line = 754)
    private static final void method650(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1379 || arg0 >= field1378) {
            return;
        }
        if (arg1 < field1375) {
            arg2 -= field1375 - arg1;
            arg1 = field1375;
        }
        if (arg1 + arg2 > field1374) {
            arg2 = field1374 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1380 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1376[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1376[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1376[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1376[var9] = var14;
            var9 += field1380;
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(IIII)V", line = 797)
    public static final void method651(int arg0, int arg1, int arg2, int arg3) {
        if (field1379 < arg0) {
            field1379 = arg0;
        }
        if (field1375 < arg1) {
            field1375 = arg1;
        }
        if (field1378 > arg2) {
            field1378 = arg2;
        }
        if (field1374 > arg3) {
            field1374 = arg3;
        }
        method637();
    }
}
