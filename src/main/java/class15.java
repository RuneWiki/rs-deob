import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field202 = 0;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field208 = 0;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[I")
    public static int[] field201;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
    public static int[] field203;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[I")
    public static int[] field205;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V")
    private static final void method75(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method91(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field202) {
            var4 = field202;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field208) {
            var5 = field208;
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
            if (var21 < field204) {
                var21 = field204;
            }
            int var22 = arg0 + var8;
            if (var22 > field209) {
                var22 = field209;
            }
            int var23 = field206 * var6 + var21;
            for (int var24 = var21; var24 < var22; var24++) {
                field201[var23++] = arg3;
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
            if (var17 < field204) {
                var17 = field204;
            }
            int var18 = arg0 + var12;
            if (var18 > field209 - 1) {
                var18 = field209 - 1;
            }
            int var19 = field206 * var6 + var17;
            for (int var20 = var17; var20 <= var18; var20++) {
                field201[var19++] = arg3;
            }
            var6++;
            var16 += var13 + var13;
            var15 += var13++ + var13;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III[I[I)V")
    public static final void method76(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field206 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field201[var7++] = arg2;
            }
            var5 += field206;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
    public static final void method77(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field204) {
            arg2 -= field204 - arg0;
            arg0 = field204;
        }
        if (arg1 < field202) {
            arg3 -= field202 - arg1;
            arg1 = field202;
        }
        if (arg0 + arg2 > field209) {
            arg2 = field209 - arg0;
        }
        if (arg1 + arg3 > field208) {
            arg3 = field208 - arg1;
        }
        int var5 = field206 - arg2;
        int var6 = field206 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field201[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
    public static final void method78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field204) {
            arg2 -= field204 - arg0;
            arg0 = field204;
        }
        if (arg1 < field202) {
            var6 += (field202 - arg1) * var7;
            arg3 -= field202 - arg1;
            arg1 = field202;
        }
        if (arg0 + arg2 > field209) {
            arg2 = field209 - arg0;
        }
        if (arg1 + arg3 > field208) {
            arg3 = field208 - arg1;
        }
        int var8 = field206 - arg2;
        int var9 = field206 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field201[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
    public static void method79() {
        field201 = null;
        field205 = null;
        field203 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIII)V")
    public static final void method80(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method94(arg0, arg1, var5 + 1, arg4);
            } else {
                method94(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field204) {
                    var8 += (field204 - arg0) * var10;
                    arg0 = field204;
                }
                if (var11 >= field209) {
                    var11 = field209 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field202 && var12 < field208) {
                        field201[field206 * var12 + arg0] = arg4;
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
                if (arg1 < field202) {
                    var14 += (field202 - arg1) * var16;
                    arg1 = field202;
                }
                if (var17 >= field208) {
                    var17 = field208 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field204 && var18 < field209) {
                        field201[field206 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method93(arg0, arg1, var6 + 1, arg4);
        } else {
            method93(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIIII)V")
    public static final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method88(arg0, arg1, arg2, arg4, arg5);
        method88(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method92(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method92(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(IIIII)V")
    public static final void method82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method94(arg0, arg1, arg2, arg4);
        method94(arg0, arg1 + arg3 - 1, arg2, arg4);
        method93(arg0, arg1, arg3, arg4);
        method93(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([I)V")
    public static final void method83(int[] arg0) {
        field204 = arg0[0];
        field202 = arg0[1];
        field209 = arg0[2];
        field208 = arg0[3];
        method96();
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "([I)V")
    public static final void method84(int[] arg0) {
        arg0[0] = field204;
        arg0[1] = field202;
        arg0[2] = field209;
        arg0[3] = field208;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(IIIIII)V")
    public static final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class178.method1302();
        int var18 = arg1 - class178.method1287();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class178.method1283(var19, var20, var21);
        class178.method1285(var23, var24, var25, var19, var20, var21, arg4);
        class178.method1283(var19, var21, var22);
        class178.method1285(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V")
    public static final void method86() {
        int var0 = 0;
        int var1 = field207 * field206 - 7;
        while (var0 < var1) {
            field201[var0++] = 0;
            field201[var0++] = 0;
            field201[var0++] = 0;
            field201[var0++] = 0;
            field201[var0++] = 0;
            field201[var0++] = 0;
            field201[var0++] = 0;
            field201[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field201[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIII)V")
    public static final void method87(int arg0, int arg1, int arg2, int arg3) {
        if (field204 < arg0) {
            field204 = arg0;
        }
        if (field202 < arg1) {
            field202 = arg1;
        }
        if (field209 > arg2) {
            field209 = arg2;
        }
        if (field208 > arg3) {
            field208 = arg3;
        }
        method96();
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(IIIII)V")
    private static final void method88(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field202 || arg1 >= field208) {
            return;
        }
        if (arg0 < field204) {
            arg2 -= field204 - arg0;
            arg0 = field204;
        }
        if (arg0 + arg2 > field209) {
            arg2 = field209 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field206 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field201[var9] >> 16 & 0xFF) * var5;
            int var12 = (field201[var9] >> 8 & 0xFF) * var5;
            int var13 = (field201[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field201[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(IIII)V")
    public static final void method89(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field206) {
            arg2 = field206;
        }
        if (arg3 > field207) {
            arg3 = field207;
        }
        field204 = arg0;
        field202 = arg1;
        field209 = arg2;
        field208 = arg3;
        method96();
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(IIIII)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method75(arg0, arg1, arg2, arg3);
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
        if (var9 < field202) {
            var9 = field202;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field208) {
            var10 = field208;
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
            if (var30 < field204) {
                var30 = field204;
            }
            int var31 = arg0 + var13;
            if (var31 > field209) {
                var31 = field209;
            }
            int var32 = field206 * var11 + var30;
            for (int var33 = var30; var33 < var31; var33++) {
                int var34 = (field201[var32] >> 16 & 0xFF) * var5;
                int var35 = (field201[var32] >> 8 & 0xFF) * var5;
                int var36 = (field201[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field201[var32++] = var37;
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
            if (var22 < field204) {
                var22 = field204;
            }
            int var23 = arg0 + var17;
            if (var23 > field209 - 1) {
                var23 = field209 - 1;
            }
            int var24 = field206 * var11 + var22;
            for (int var25 = var22; var25 <= var23; var25++) {
                int var26 = (field201[var24] >> 16 & 0xFF) * var5;
                int var27 = (field201[var24] >> 8 & 0xFF) * var5;
                int var28 = (field201[var24] & 0xFF) * var5;
                int var29 = (var8 + var28 >> 8) + (var6 + var26 >> 8 << 16) + (var7 + var27 >> 8 << 8);
                field201[var24++] = var29;
            }
            var11++;
            var21 += var18 + var18;
            var20 += var18++ + var18;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    private static final void method91(int arg0, int arg1, int arg2) {
        if (arg0 >= field204 && arg1 >= field202 && arg0 < field209 && arg1 < field208) {
            field201[field206 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(IIIII)V")
    private static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field204 || arg0 >= field209) {
            return;
        }
        if (arg1 < field202) {
            arg2 -= field202 - arg1;
            arg1 = field202;
        }
        if (arg1 + arg2 > field208) {
            arg2 = field208 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field206 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field201[var9] >> 16 & 0xFF) * var5;
            int var12 = (field201[var9] >> 8 & 0xFF) * var5;
            int var13 = (field201[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field201[var9] = var14;
            var9 += field206;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(IIII)V")
    public static final void method93(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field204 || arg0 >= field209) {
            return;
        }
        if (arg1 < field202) {
            arg2 -= field202 - arg1;
            arg1 = field202;
        }
        if (arg1 + arg2 > field208) {
            arg2 = field208 - arg1;
        }
        int var4 = field206 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field201[field206 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(IIII)V")
    public static final void method94(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field202 || arg1 >= field208) {
            return;
        }
        if (arg0 < field204) {
            arg2 -= field204 - arg0;
            arg0 = field204;
        }
        if (arg0 + arg2 > field209) {
            arg2 = field209 - arg0;
        }
        int var4 = field206 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field201[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(IIIIII)V")
    public static final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field204) {
            arg2 -= field204 - arg0;
            arg0 = field204;
        }
        if (arg1 < field202) {
            arg3 -= field202 - arg1;
            arg1 = field202;
        }
        if (arg0 + arg2 > field209) {
            arg2 = field209 - arg0;
        }
        if (arg1 + arg3 > field208) {
            arg3 = field208 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field206 - arg2;
        int var9 = field206 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field201[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field201[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()V")
    public static final void method96() {
        field205 = null;
        field203 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([I[I)V")
    public static final void method97(int[] arg0, int[] arg1) {
        if (field208 - field202 != arg0.length || field208 - field202 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field205 = arg0;
        field203 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([III)V")
    public static final void method98(int[] arg0, int arg1, int arg2) {
        field201 = arg0;
        field206 = arg1;
        field207 = arg2;
        method89(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()V")
    public static final void method99() {
        field204 = 0;
        field202 = 0;
        field209 = field206;
        field208 = field207;
        method96();
    }
}
