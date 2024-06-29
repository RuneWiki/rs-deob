import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 extends class24 {

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field1029 = 0;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    public static int field1034 = 0;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
    public static int field1035 = 0;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "[I")
    public static int[] field1032;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([I)V")
    public static final void method349(int[] arg0) {
        arg0[0] = field1034;
        arg0[1] = field1030;
        arg0[2] = field1035;
        arg0[3] = field1029;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    private static final void method350(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1034 || arg0 >= field1035) {
            return;
        }
        if (arg1 < field1030) {
            arg2 -= field1030 - arg1;
            arg1 = field1030;
        }
        if (arg1 + arg2 > field1029) {
            arg2 = field1029 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1033 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1032[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1032[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1032[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1032[var9] = var14;
            var9 += field1033;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIII)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method352(arg0, arg1, arg2, arg4);
        method352(arg0, arg1 + arg3 - 1, arg2, arg4);
        method357(arg0, arg1, arg3, arg4);
        method357(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
    public static final void method352(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1030 || arg1 >= field1029) {
            return;
        }
        if (arg0 < field1034) {
            arg2 -= field1034 - arg0;
            arg0 = field1034;
        }
        if (arg0 + arg2 > field1035) {
            arg2 = field1035 - arg0;
        }
        int var4 = field1033 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1032[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
    public static final void method353() {
        int var0 = 0;
        int var1 = field1033 * field1031 - 7;
        while (var0 < var1) {
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
            field1032[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1032[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIII)V")
    public static final void method354(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method352(arg0, arg1, var5 + 1, arg4);
            } else {
                method352(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1034) {
                    var8 += (field1034 - arg0) * var10;
                    arg0 = field1034;
                }
                if (var11 >= field1035) {
                    var11 = field1035 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1030 && var12 < field1029) {
                        field1032[field1033 * var12 + arg0] = arg4;
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
                if (arg1 < field1030) {
                    var14 += (field1030 - arg1) * var16;
                    arg1 = field1030;
                }
                if (var17 >= field1029) {
                    var17 = field1029 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1034 && var18 < field1035) {
                        field1032[field1033 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method357(arg0, arg1, var6 + 1, arg4);
        } else {
            method357(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "([I)V")
    public static final void method355(int[] arg0) {
        field1034 = arg0[0];
        field1030 = arg0[1];
        field1035 = arg0[2];
        field1029 = arg0[3];
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
    public static final void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method359(arg0, arg1, arg2, arg4, arg5);
        method359(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method350(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method350(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIII)V")
    public static final void method357(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1034 || arg0 >= field1035) {
            return;
        }
        if (arg1 < field1030) {
            arg2 -= field1030 - arg1;
            arg1 = field1030;
        }
        if (arg1 + arg2 > field1029) {
            arg2 = field1029 - arg1;
        }
        int var4 = field1033 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1032[field1033 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIII)V")
    public static final void method358(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1033) {
            arg2 = field1033;
        }
        if (arg3 > field1031) {
            arg3 = field1031;
        }
        field1034 = arg0;
        field1030 = arg1;
        field1035 = arg2;
        field1029 = arg3;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIII)V")
    private static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1030 || arg1 >= field1029) {
            return;
        }
        if (arg0 < field1034) {
            arg2 -= field1034 - arg0;
            arg0 = field1034;
        }
        if (arg0 + arg2 > field1035) {
            arg2 = field1035 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1033 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1032[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1032[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1032[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1032[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(IIIII)V")
    public static final void method360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1034) {
            arg2 -= field1034 - arg0;
            arg0 = field1034;
        }
        if (arg1 < field1030) {
            arg3 -= field1030 - arg1;
            arg1 = field1030;
        }
        if (arg0 + arg2 > field1035) {
            arg2 = field1035 - arg0;
        }
        if (arg1 + arg3 > field1029) {
            arg3 = field1029 - arg1;
        }
        int var5 = field1033 - arg2;
        int var6 = field1033 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1032[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1034) {
            arg2 -= field1034 - arg0;
            arg0 = field1034;
        }
        if (arg1 < field1030) {
            arg3 -= field1030 - arg1;
            arg1 = field1030;
        }
        if (arg0 + arg2 > field1035) {
            arg2 = field1035 - arg0;
        }
        if (arg1 + arg3 > field1029) {
            arg3 = field1029 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field1033 - arg2;
        int var9 = field1033 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field1032[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field1032[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1034) {
            arg2 -= field1034 - arg0;
            arg0 = field1034;
        }
        if (arg1 < field1030) {
            var6 += (field1030 - arg1) * var7;
            arg3 -= field1030 - arg1;
            arg1 = field1030;
        }
        if (arg0 + arg2 > field1035) {
            arg2 = field1035 - arg0;
        }
        if (arg1 + arg3 > field1029) {
            arg3 = field1029 - arg1;
        }
        int var8 = field1033 - arg2;
        int var9 = field1033 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field1032[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()V")
    public static final void method363() {
        field1034 = 0;
        field1030 = 0;
        field1035 = field1033;
        field1029 = field1031;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([III)V")
    public static final void method364(int[] arg0, int arg1, int arg2) {
        field1032 = arg0;
        field1033 = arg1;
        field1031 = arg2;
        method358(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
    public static void method365() {
        field1032 = null;
    }
}
