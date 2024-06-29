import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class118 extends class12 {

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field2200 = 0;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field2206 = 0;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field2205 = 0;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "[I")
    public static int[] field2204;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
    public static final void method651(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2205) {
            arg2 -= field2205 - arg0;
            arg0 = field2205;
        }
        if (arg1 < field2203) {
            arg3 -= field2203 - arg1;
            arg1 = field2203;
        }
        if (arg0 + arg2 > field2206) {
            arg2 = field2206 - arg0;
        }
        if (arg1 + arg3 > field2200) {
            arg3 = field2200 - arg1;
        }
        int var5 = field2202 - arg2;
        int var6 = field2202 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2204[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IIIII)V")
    private static final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2205 || arg0 >= field2206) {
            return;
        }
        if (arg1 < field2203) {
            arg2 -= field2203 - arg1;
            arg1 = field2203;
        }
        if (arg1 + arg2 > field2200) {
            arg2 = field2200 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2202 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2204[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2204[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2204[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2204[var9] = var14;
            var9 += field2202;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V")
    public static final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method657(arg0, arg1, arg2, arg4, arg5);
        method657(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method652(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method652(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IIIIII)V")
    public static final void method654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2205) {
            arg2 -= field2205 - arg0;
            arg0 = field2205;
        }
        if (arg1 < field2203) {
            arg3 -= field2203 - arg1;
            arg1 = field2203;
        }
        if (arg0 + arg2 > field2206) {
            arg2 = field2206 - arg0;
        }
        if (arg1 + arg3 > field2200) {
            arg3 = field2200 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field2202 - arg2;
        int var9 = field2202 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field2204[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field2204[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[I[I)V")
    public static final void method655(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field2202 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field2204[var7++] = arg2;
            }
            var5 += field2202;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IIII)V")
    public static final void method656(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2202) {
            arg2 = field2202;
        }
        if (arg3 > field2201) {
            arg3 = field2201;
        }
        field2205 = arg0;
        field2203 = arg1;
        field2206 = arg2;
        field2200 = arg3;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(IIIII)V")
    private static final void method657(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2203 || arg1 >= field2200) {
            return;
        }
        if (arg0 < field2205) {
            arg2 -= field2205 - arg0;
            arg0 = field2205;
        }
        if (arg0 + arg2 > field2206) {
            arg2 = field2206 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2202 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2204[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2204[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2204[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2204[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(IIII)V")
    public static final void method658(int arg0, int arg1, int arg2, int arg3) {
        if (field2205 < arg0) {
            field2205 = arg0;
        }
        if (field2203 < arg1) {
            field2203 = arg1;
        }
        if (field2206 > arg2) {
            field2206 = arg2;
        }
        if (field2200 > arg3) {
            field2200 = arg3;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(IIIIII)V")
    public static final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2205) {
            arg2 -= field2205 - arg0;
            arg0 = field2205;
        }
        if (arg1 < field2203) {
            var6 += (field2203 - arg1) * var7;
            arg3 -= field2203 - arg1;
            arg1 = field2203;
        }
        if (arg0 + arg2 > field2206) {
            arg2 = field2206 - arg0;
        }
        if (arg1 + arg3 > field2200) {
            arg3 = field2200 - arg1;
        }
        int var8 = field2202 - arg2;
        int var9 = field2202 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field2204[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(IIII)V")
    public static final void method660(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2205 || arg0 >= field2206) {
            return;
        }
        if (arg1 < field2203) {
            arg2 -= field2203 - arg1;
            arg1 = field2203;
        }
        if (arg1 + arg2 > field2200) {
            arg2 = field2200 - arg1;
        }
        int var4 = field2202 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2204[field2202 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public static final void method661() {
        field2205 = 0;
        field2203 = 0;
        field2206 = field2202;
        field2200 = field2201;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V")
    public static final void method662() {
        int var0 = 0;
        int var1 = field2202 * field2201 - 7;
        while (var0 < var1) {
            field2204[var0++] = 0;
            field2204[var0++] = 0;
            field2204[var0++] = 0;
            field2204[var0++] = 0;
            field2204[var0++] = 0;
            field2204[var0++] = 0;
            field2204[var0++] = 0;
            field2204[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2204[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([I)V")
    public static final void method663(int[] arg0) {
        arg0[0] = field2205;
        arg0[1] = field2203;
        arg0[2] = field2206;
        arg0[3] = field2200;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(IIII)V")
    public static final void method664(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2203 || arg1 >= field2200) {
            return;
        }
        if (arg0 < field2205) {
            arg2 -= field2205 - arg0;
            arg0 = field2205;
        }
        if (arg0 + arg2 > field2206) {
            arg2 = field2206 - arg0;
        }
        int var4 = field2202 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2204[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([I)V")
    public static final void method665(int[] arg0) {
        field2205 = arg0[0];
        field2203 = arg0[1];
        field2206 = arg0[2];
        field2200 = arg0[3];
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    public static void method666() {
        field2204 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([III)V")
    public static final void method667(int[] arg0, int arg1, int arg2) {
        field2204 = arg0;
        field2202 = arg1;
        field2201 = arg2;
        method656(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(IIIII)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method664(arg0, arg1, var5 + 1, arg4);
            } else {
                method664(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2205) {
                    var8 += (field2205 - arg0) * var10;
                    arg0 = field2205;
                }
                if (var11 >= field2206) {
                    var11 = field2206 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2203 && var12 < field2200) {
                        field2204[field2202 * var12 + arg0] = arg4;
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
                if (arg1 < field2203) {
                    var14 += (field2203 - arg1) * var16;
                    arg1 = field2203;
                }
                if (var17 >= field2200) {
                    var17 = field2200 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2205 && var18 < field2206) {
                        field2204[field2202 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method660(arg0, arg1, var6 + 1, arg4);
        } else {
            method660(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(IIIII)V")
    public static final void method669(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method664(arg0, arg1, arg2, arg4);
        method664(arg0, arg1 + arg3 - 1, arg2, arg4);
        method660(arg0, arg1, arg3, arg4);
        method660(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
}
