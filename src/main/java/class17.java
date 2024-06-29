import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 extends class45 {

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field501 = 0;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field502 = 0;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field504 = 0;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "[I")
    public static int[] field506;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([III)V")
    public static final void method132(int[] arg0, int arg1, int arg2) {
        field506 = arg0;
        field503 = arg1;
        field505 = arg2;
        method143(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIII)V")
    public static final void method133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field502) {
            arg2 -= field502 - arg0;
            arg0 = field502;
        }
        if (arg1 < field504) {
            arg3 -= field504 - arg1;
            arg1 = field504;
        }
        if (arg0 + arg2 > field507) {
            arg2 = field507 - arg0;
        }
        if (arg1 + arg3 > field501) {
            arg3 = field501 - arg1;
        }
        int var5 = field503 - arg2;
        int var6 = field503 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field506[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIII)V")
    public static final void method134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method136(arg0, arg1, arg2, arg4);
        method136(arg0, arg1 + arg3 - 1, arg2, arg4);
        method147(arg0, arg1, arg3, arg4);
        method147(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    public static final void method135() {
        field502 = 0;
        field504 = 0;
        field507 = field503;
        field501 = field505;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V")
    public static final void method136(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field504 || arg1 >= field501) {
            return;
        }
        if (arg0 < field502) {
            arg2 -= field502 - arg0;
            arg0 = field502;
        }
        if (arg0 + arg2 > field507) {
            arg2 = field507 - arg0;
        }
        int var4 = field503 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field506[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([I)V")
    public static final void method137(int[] arg0) {
        field502 = arg0[0];
        field504 = arg0[1];
        field507 = arg0[2];
        field501 = arg0[3];
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
    public static void method138() {
        field506 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field502) {
            arg2 -= field502 - arg0;
            arg0 = field502;
        }
        if (arg1 < field504) {
            var6 += (field504 - arg1) * var7;
            arg3 -= field504 - arg1;
            arg1 = field504;
        }
        if (arg0 + arg2 > field507) {
            arg2 = field507 - arg0;
        }
        if (arg1 + arg3 > field501) {
            arg3 = field501 - arg1;
        }
        int var8 = field503 - arg2;
        int var9 = field503 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field506[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
    public static final void method140() {
        int var0 = 0;
        int var1 = field505 * field503 - 7;
        while (var0 < var1) {
            field506[var0++] = 0;
            field506[var0++] = 0;
            field506[var0++] = 0;
            field506[var0++] = 0;
            field506[var0++] = 0;
            field506[var0++] = 0;
            field506[var0++] = 0;
            field506[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field506[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(IIIII)V")
    private static final void method141(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field504 || arg1 >= field501) {
            return;
        }
        if (arg0 < field502) {
            arg2 -= field502 - arg0;
            arg0 = field502;
        }
        if (arg0 + arg2 > field507) {
            arg2 = field507 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field503 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field506[var9] >> 16 & 0xFF) * var5;
            int var12 = (field506[var9] >> 8 & 0xFF) * var5;
            int var13 = (field506[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field506[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIII)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method141(arg0, arg1, arg2, arg4, arg5);
        method141(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method148(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method148(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIII)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field503) {
            arg2 = field503;
        }
        if (arg3 > field505) {
            arg3 = field505;
        }
        field502 = arg0;
        field504 = arg1;
        field507 = arg2;
        field501 = arg3;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(IIIII)V")
    public static final void method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method136(arg0, arg1, var5 + 1, arg4);
            } else {
                method136(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field502) {
                    var8 += (field502 - arg0) * var10;
                    arg0 = field502;
                }
                if (var11 >= field507) {
                    var11 = field507 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field504 && var12 < field501) {
                        field506[field503 * var12 + arg0] = arg4;
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
                if (arg1 < field504) {
                    var14 += (field504 - arg1) * var16;
                    arg1 = field504;
                }
                if (var17 >= field501) {
                    var17 = field501 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field502 && var18 < field507) {
                        field506[field503 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method147(arg0, arg1, var6 + 1, arg4);
        } else {
            method147(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "([I)V")
    public static final void method145(int[] arg0) {
        arg0[0] = field502;
        arg0[1] = field504;
        arg0[2] = field507;
        arg0[3] = field501;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIIII)V")
    public static final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field502) {
            arg2 -= field502 - arg0;
            arg0 = field502;
        }
        if (arg1 < field504) {
            arg3 -= field504 - arg1;
            arg1 = field504;
        }
        if (arg0 + arg2 > field507) {
            arg2 = field507 - arg0;
        }
        if (arg1 + arg3 > field501) {
            arg3 = field501 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field503 - arg2;
        int var9 = field503 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field506[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field506[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIII)V")
    public static final void method147(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field502 || arg0 >= field507) {
            return;
        }
        if (arg1 < field504) {
            arg2 -= field504 - arg1;
            arg1 = field504;
        }
        if (arg1 + arg2 > field501) {
            arg2 = field501 - arg1;
        }
        int var4 = field503 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field506[field503 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(IIIII)V")
    private static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field502 || arg0 >= field507) {
            return;
        }
        if (arg1 < field504) {
            arg2 -= field504 - arg1;
            arg1 = field504;
        }
        if (arg1 + arg2 > field501) {
            arg2 = field501 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field503 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field506[var9] >> 16 & 0xFF) * var5;
            int var12 = (field506[var9] >> 8 & 0xFF) * var5;
            int var13 = (field506[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field506[var9] = var14;
            var9 += field503;
        }
    }
}
