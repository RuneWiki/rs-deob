import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 extends class99 {

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field863 = 0;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "[I")
    public static int[] field858;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public static final void method287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method291(arg0, arg1, var5 + 1, arg4);
            } else {
                method291(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field861) {
                    var8 += (field861 - arg0) * var10;
                    arg0 = field861;
                }
                if (var11 >= field859) {
                    var11 = field859 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field863 && var12 < field857) {
                        field858[field862 * var12 + arg0] = arg4;
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
                if (arg1 < field863) {
                    var14 += (field863 - arg1) * var16;
                    arg1 = field863;
                }
                if (var17 >= field857) {
                    var17 = field857 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field861 && var18 < field859) {
                        field858[field862 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method288(arg0, arg1, var6 + 1, arg4);
        } else {
            method288(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
    public static final void method288(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field861 || arg0 >= field859) {
            return;
        }
        if (arg1 < field863) {
            arg2 -= field863 - arg1;
            arg1 = field863;
        }
        if (arg1 + arg2 > field857) {
            arg2 = field857 - arg1;
        }
        int var4 = field862 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field858[field862 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIII)V")
    private static final void method289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field863 || arg1 >= field857) {
            return;
        }
        if (arg0 < field861) {
            arg2 -= field861 - arg0;
            arg0 = field861;
        }
        if (arg0 + arg2 > field859) {
            arg2 = field859 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field862 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field858[var9] >> 16 & 0xFF) * var5;
            int var12 = (field858[var9] >> 8 & 0xFF) * var5;
            int var13 = (field858[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field858[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public static final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field861) {
            arg2 -= field861 - arg0;
            arg0 = field861;
        }
        if (arg1 < field863) {
            var6 += (field863 - arg1) * var7;
            arg3 -= field863 - arg1;
            arg1 = field863;
        }
        if (arg0 + arg2 > field859) {
            arg2 = field859 - arg0;
        }
        if (arg1 + arg3 > field857) {
            arg3 = field857 - arg1;
        }
        int var8 = field862 - arg2;
        int var9 = field862 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field858[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIII)V")
    public static final void method291(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field863 || arg1 >= field857) {
            return;
        }
        if (arg0 < field861) {
            arg2 -= field861 - arg0;
            arg0 = field861;
        }
        if (arg0 + arg2 > field859) {
            arg2 = field859 - arg0;
        }
        int var4 = field862 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field858[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
    public static void method292() {
        field858 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([I)V")
    public static final void method293(int[] arg0) {
        field861 = arg0[0];
        field863 = arg0[1];
        field859 = arg0[2];
        field857 = arg0[3];
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[I[I)V")
    public static final void method294(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field862 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field858[var7++] = arg2;
            }
            var5 += field862;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([III)V")
    public static final void method295(int[] arg0, int arg1, int arg2) {
        field858 = arg0;
        field862 = arg1;
        field860 = arg2;
        method301(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIII)V")
    public static final void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method289(arg0, arg1, arg2, arg4, arg5);
        method289(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method298(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method298(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "([I)V")
    public static final void method297(int[] arg0) {
        arg0[0] = field861;
        arg0[1] = field863;
        arg0[2] = field859;
        arg0[3] = field857;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIIII)V")
    private static final void method298(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field861 || arg0 >= field859) {
            return;
        }
        if (arg1 < field863) {
            arg2 -= field863 - arg1;
            arg1 = field863;
        }
        if (arg1 + arg2 > field857) {
            arg2 = field857 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field862 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field858[var9] >> 16 & 0xFF) * var5;
            int var12 = (field858[var9] >> 8 & 0xFF) * var5;
            int var13 = (field858[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field858[var9] = var14;
            var9 += field862;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(IIIII)V")
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method291(arg0, arg1, arg2, arg4);
        method291(arg0, arg1 + arg3 - 1, arg2, arg4);
        method288(arg0, arg1, arg3, arg4);
        method288(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()V")
    public static final void method300() {
        int var0 = 0;
        int var1 = field862 * field860 - 7;
        while (var0 < var1) {
            field858[var0++] = 0;
            field858[var0++] = 0;
            field858[var0++] = 0;
            field858[var0++] = 0;
            field858[var0++] = 0;
            field858[var0++] = 0;
            field858[var0++] = 0;
            field858[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field858[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIII)V")
    public static final void method301(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field862) {
            arg2 = field862;
        }
        if (arg3 > field860) {
            arg3 = field860;
        }
        field861 = arg0;
        field863 = arg1;
        field859 = arg2;
        field857 = arg3;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "()V")
    public static final void method302() {
        field861 = 0;
        field863 = 0;
        field859 = field862;
        field857 = field860;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIIIII)V")
    public static final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field861) {
            arg2 -= field861 - arg0;
            arg0 = field861;
        }
        if (arg1 < field863) {
            arg3 -= field863 - arg1;
            arg1 = field863;
        }
        if (arg0 + arg2 > field859) {
            arg2 = field859 - arg0;
        }
        if (arg1 + arg3 > field857) {
            arg3 = field857 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field862 - arg2;
        int var9 = field862 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field858[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field858[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(IIIII)V")
    public static final void method304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field861) {
            arg2 -= field861 - arg0;
            arg0 = field861;
        }
        if (arg1 < field863) {
            arg3 -= field863 - arg1;
            arg1 = field863;
        }
        if (arg0 + arg2 > field859) {
            arg2 = field859 - arg0;
        }
        if (arg1 + arg3 > field857) {
            arg3 = field857 - arg1;
        }
        int var5 = field862 - arg2;
        int var6 = field862 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field858[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(IIII)V")
    public static final void method305(int arg0, int arg1, int arg2, int arg3) {
        if (field861 < arg0) {
            field861 = arg0;
        }
        if (field863 < arg1) {
            field863 = arg1;
        }
        if (field859 > arg2) {
            field859 = arg2;
        }
        if (field857 > arg3) {
            field857 = arg3;
        }
    }
}
