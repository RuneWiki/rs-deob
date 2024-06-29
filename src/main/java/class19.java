import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class28 {

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field425 = 0;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field426 = 0;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "[I")
    public static int[] field423;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
    public static final void method130(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field425 || arg1 >= field426) {
            return;
        }
        if (arg0 < field428) {
            arg2 -= field428 - arg0;
            arg0 = field428;
        }
        if (arg0 + arg2 > field422) {
            arg2 = field422 - arg0;
        }
        int var4 = field424 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field423[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII)V")
    public static final void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method135(arg0, arg1, arg2, arg4, arg5);
        method135(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method138(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method138(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method130(arg0, arg1, var5 + 1, arg4);
            } else {
                method130(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field428) {
                    var8 += (field428 - arg0) * var10;
                    arg0 = field428;
                }
                if (var11 >= field422) {
                    var11 = field422 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field425 && var12 < field426) {
                        field423[field424 * var12 + arg0] = arg4;
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
                if (var17 >= field426) {
                    var17 = field426 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field428 && var18 < field422) {
                        field423[field424 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method134(arg0, arg1, var6 + 1, arg4);
        } else {
            method134(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
    public static final void method133() {
        int var0 = 0;
        int var1 = field427 * field424 - 7;
        while (var0 < var1) {
            field423[var0++] = 0;
            field423[var0++] = 0;
            field423[var0++] = 0;
            field423[var0++] = 0;
            field423[var0++] = 0;
            field423[var0++] = 0;
            field423[var0++] = 0;
            field423[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field423[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIII)V")
    public static final void method134(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field428 || arg0 >= field422) {
            return;
        }
        if (arg1 < field425) {
            arg2 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg1 + arg2 > field426) {
            arg2 = field426 - arg1;
        }
        int var4 = field424 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field423[field424 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIII)V")
    private static final void method135(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field425 || arg1 >= field426) {
            return;
        }
        if (arg0 < field428) {
            arg2 -= field428 - arg0;
            arg0 = field428;
        }
        if (arg0 + arg2 > field422) {
            arg2 = field422 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field424 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field423[var9] >> 16 & 0xFF) * var5;
            int var12 = (field423[var9] >> 8 & 0xFF) * var5;
            int var13 = (field423[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field423[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([III)V")
    public static final void method136(int[] arg0, int arg1, int arg2) {
        field423 = arg0;
        field424 = arg1;
        field427 = arg2;
        method141(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field428) {
            arg2 -= field428 - arg0;
            arg0 = field428;
        }
        if (arg1 < field425) {
            arg3 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg0 + arg2 > field422) {
            arg2 = field422 - arg0;
        }
        if (arg1 + arg3 > field426) {
            arg3 = field426 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field424 - arg2;
        int var9 = field424 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field423[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field423[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(IIIII)V")
    private static final void method138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field428 || arg0 >= field422) {
            return;
        }
        if (arg1 < field425) {
            arg2 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg1 + arg2 > field426) {
            arg2 = field426 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field424 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field423[var9] >> 16 & 0xFF) * var5;
            int var12 = (field423[var9] >> 8 & 0xFF) * var5;
            int var13 = (field423[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field423[var9] = var14;
            var9 += field424;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(IIII)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3) {
        if (field428 < arg0) {
            field428 = arg0;
        }
        if (field425 < arg1) {
            field425 = arg1;
        }
        if (field422 > arg2) {
            field422 = arg2;
        }
        if (field426 > arg3) {
            field426 = arg3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([I)V")
    public static final void method140(int[] arg0) {
        arg0[0] = field428;
        arg0[1] = field425;
        arg0[2] = field422;
        arg0[3] = field426;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(IIII)V")
    public static final void method141(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field424) {
            arg2 = field424;
        }
        if (arg3 > field427) {
            arg3 = field427;
        }
        field428 = arg0;
        field425 = arg1;
        field422 = arg2;
        field426 = arg3;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
    public static final void method142() {
        field428 = 0;
        field425 = 0;
        field422 = field424;
        field426 = field427;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(IIIII)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field428) {
            arg2 -= field428 - arg0;
            arg0 = field428;
        }
        if (arg1 < field425) {
            arg3 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg0 + arg2 > field422) {
            arg2 = field422 - arg0;
        }
        if (arg1 + arg3 > field426) {
            arg3 = field426 - arg1;
        }
        int var5 = field424 - arg2;
        int var6 = field424 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field423[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(IIIII)V")
    public static final void method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method130(arg0, arg1, arg2, arg4);
        method130(arg0, arg1 + arg3 - 1, arg2, arg4);
        method134(arg0, arg1, arg3, arg4);
        method134(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(IIIIII)V")
    public static final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field428) {
            arg2 -= field428 - arg0;
            arg0 = field428;
        }
        if (arg1 < field425) {
            var6 += (field425 - arg1) * var7;
            arg3 -= field425 - arg1;
            arg1 = field425;
        }
        if (arg0 + arg2 > field422) {
            arg2 = field422 - arg0;
        }
        if (arg1 + arg3 > field426) {
            arg3 = field426 - arg1;
        }
        int var8 = field424 - arg2;
        int var9 = field424 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field423[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III[I[I)V")
    public static final void method146(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field424 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field423[var7++] = arg2;
            }
            var5 += field424;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "([I)V")
    public static final void method147(int[] arg0) {
        field428 = arg0[0];
        field425 = arg0[1];
        field422 = arg0[2];
        field426 = arg0[3];
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()V")
    public static void method148() {
        field423 = null;
    }
}
