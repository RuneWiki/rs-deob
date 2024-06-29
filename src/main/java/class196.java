import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class196 extends class113 {

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field3870 = 0;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field3869 = 0;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field3873 = 0;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "[I")
    public static int[] field3871;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3870) {
            arg2 -= field3870 - arg0;
            arg0 = field3870;
        }
        if (arg1 < field3873) {
            var6 += (field3873 - arg1) * var7;
            arg3 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg0 + arg2 > field3869) {
            arg2 = field3869 - arg0;
        }
        if (arg1 + arg3 > field3867) {
            arg3 = field3867 - arg1;
        }
        int var8 = field3872 - arg2;
        int var9 = field3872 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field3871[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    private static final void method1267(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3870 || arg0 >= field3869) {
            return;
        }
        if (arg1 < field3873) {
            arg2 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg1 + arg2 > field3867) {
            arg2 = field3867 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3872 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3871[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3871[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3871[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3871[var9] = var14;
            var9 += field3872;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIIII)V")
    public static final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1276(arg0, arg1, arg2, arg4, arg5);
        method1276(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1267(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1267(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
    public static final void method1269() {
        int var0 = 0;
        int var1 = field3872 * field3868 - 7;
        while (var0 < var1) {
            field3871[var0++] = 0;
            field3871[var0++] = 0;
            field3871[var0++] = 0;
            field3871[var0++] = 0;
            field3871[var0++] = 0;
            field3871[var0++] = 0;
            field3871[var0++] = 0;
            field3871[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field3871[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIII)V")
    public static final void method1270(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1284(arg0, arg1, var5 + 1, arg4);
            } else {
                method1284(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field3870) {
                    var8 += (field3870 - arg0) * var10;
                    arg0 = field3870;
                }
                if (var11 >= field3869) {
                    var11 = field3869 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3873 && var12 < field3867) {
                        field3871[field3872 * var12 + arg0] = arg4;
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
                if (arg1 < field3873) {
                    var14 += (field3873 - arg1) * var16;
                    arg1 = field3873;
                }
                if (var17 >= field3867) {
                    var17 = field3867 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3870 && var18 < field3869) {
                        field3871[field3872 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1283(arg0, arg1, var6 + 1, arg4);
        } else {
            method1283(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(IIIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3870) {
            arg2 -= field3870 - arg0;
            arg0 = field3870;
        }
        if (arg1 < field3873) {
            arg3 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg0 + arg2 > field3869) {
            arg2 = field3869 - arg0;
        }
        if (arg1 + arg3 > field3867) {
            arg3 = field3867 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field3872 - arg2;
        int var9 = field3872 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field3871[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field3871[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIII)V")
    public static final void method1272(int arg0, int arg1, int arg2, int arg3) {
        if (field3870 < arg0) {
            field3870 = arg0;
        }
        if (field3873 < arg1) {
            field3873 = arg1;
        }
        if (field3869 > arg2) {
            field3869 = arg2;
        }
        if (field3867 > arg3) {
            field3867 = arg3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(IIIII)V")
    public static final void method1273(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1284(arg0, arg1, arg2, arg4);
        method1284(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1283(arg0, arg1, arg3, arg4);
        method1283(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([III)V")
    public static final void method1274(int[] arg0, int arg1, int arg2) {
        field3871 = arg0;
        field3872 = arg1;
        field3868 = arg2;
        method1278(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[I[I)V")
    public static final void method1275(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field3872 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field3871[var7++] = arg2;
            }
            var5 += field3872;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(IIIII)V")
    private static final void method1276(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3873 || arg1 >= field3867) {
            return;
        }
        if (arg0 < field3870) {
            arg2 -= field3870 - arg0;
            arg0 = field3870;
        }
        if (arg0 + arg2 > field3869) {
            arg2 = field3869 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field3872 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field3871[var9] >> 16 & 0xFF) * var5;
            int var12 = (field3871[var9] >> 8 & 0xFF) * var5;
            int var13 = (field3871[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field3871[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()V")
    public static final void method1277() {
        field3870 = 0;
        field3873 = 0;
        field3869 = field3872;
        field3867 = field3868;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(IIII)V")
    public static final void method1278(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3872) {
            arg2 = field3872;
        }
        if (arg3 > field3868) {
            arg3 = field3868;
        }
        field3870 = arg0;
        field3873 = arg1;
        field3869 = arg2;
        field3867 = arg3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([I)V")
    public static final void method1279(int[] arg0) {
        field3870 = arg0[0];
        field3873 = arg0[1];
        field3869 = arg0[2];
        field3867 = arg0[3];
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()V")
    public static void method1280() {
        field3871 = null;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(IIIII)V")
    public static final void method1281(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3870) {
            arg2 -= field3870 - arg0;
            arg0 = field3870;
        }
        if (arg1 < field3873) {
            arg3 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg0 + arg2 > field3869) {
            arg2 = field3869 - arg0;
        }
        if (arg1 + arg3 > field3867) {
            arg3 = field3867 - arg1;
        }
        int var5 = field3872 - arg2;
        int var6 = field3872 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field3871[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "([I)V")
    public static final void method1282(int[] arg0) {
        arg0[0] = field3870;
        arg0[1] = field3873;
        arg0[2] = field3869;
        arg0[3] = field3867;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(IIII)V")
    public static final void method1283(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3870 || arg0 >= field3869) {
            return;
        }
        if (arg1 < field3873) {
            arg2 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg1 + arg2 > field3867) {
            arg2 = field3867 - arg1;
        }
        int var4 = field3872 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3871[field3872 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(IIII)V")
    public static final void method1284(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3873 || arg1 >= field3867) {
            return;
        }
        if (arg0 < field3870) {
            arg2 -= field3870 - arg0;
            arg0 = field3870;
        }
        if (arg0 + arg2 > field3869) {
            arg2 = field3869 - arg0;
        }
        int var4 = field3872 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field3871[var4 + var5] = arg3;
        }
    }
}
