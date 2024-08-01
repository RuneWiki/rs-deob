import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("b")
public class class11 extends class147 {

    @OriginalMember(owner = "b", name = "H", descriptor = "I")
    public static int field170 = 0;

    @OriginalMember(owner = "b", name = "K", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "b", name = "L", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "b", name = "I", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "b", name = "G", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "b", name = "J", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "b", name = "M", descriptor = "[I")
    public static int[] field175;

    @OriginalMember(owner = "b", name = "a", descriptor = "()V")
    public static final void method61() {
        int var0 = 0;
        int var1 = field172 * field169 - 7;
        while (var0 < var1) {
            field175[var0++] = 0;
            field175[var0++] = 0;
            field175[var0++] = 0;
            field175[var0++] = 0;
            field175[var0++] = 0;
            field175[var0++] = 0;
            field175[var0++] = 0;
            field175[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field175[var0++] = 0;
        }
    }

    @OriginalMember(owner = "b", name = "a", descriptor = "([III)V")
    public static final void method62(int[] arg0, int arg1, int arg2) {
        field175 = arg0;
        field172 = arg1;
        field169 = arg2;
        method71(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "b", name = "a", descriptor = "(IIIII)V")
    public static final void method63(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method68(arg0, arg1, var5 + 1, arg4);
            } else {
                method68(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field171) {
                    var8 += (field171 - arg0) * var10;
                    arg0 = field171;
                }
                if (var11 >= field173) {
                    var11 = field173 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field170 && var12 < field174) {
                        field175[field172 * var12 + arg0] = arg4;
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
                if (arg1 < field170) {
                    var14 += (field170 - arg1) * var16;
                    arg1 = field170;
                }
                if (var17 >= field174) {
                    var17 = field174 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field171 && var18 < field173) {
                        field175[field172 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method70(arg0, arg1, var6 + 1, arg4);
        } else {
            method70(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "b", name = "a", descriptor = "([I)V")
    public static final void method64(int[] arg0) {
        arg0[0] = field171;
        arg0[1] = field170;
        arg0[2] = field173;
        arg0[3] = field174;
    }

    @OriginalMember(owner = "b", name = "a", descriptor = "(IIIIII)V")
    public static final void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field171) {
            arg2 -= field171 - arg0;
            arg0 = field171;
        }
        if (arg1 < field170) {
            arg3 -= field170 - arg1;
            arg1 = field170;
        }
        if (arg0 + arg2 > field173) {
            arg2 = field173 - arg0;
        }
        if (arg1 + arg3 > field174) {
            arg3 = field174 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field172 - arg2;
        int var9 = field172 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field175[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field175[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "b", name = "b", descriptor = "(IIIIII)V")
    public static final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field171) {
            arg2 -= field171 - arg0;
            arg0 = field171;
        }
        if (arg1 < field170) {
            var6 += (field170 - arg1) * var7;
            arg3 -= field170 - arg1;
            arg1 = field170;
        }
        if (arg0 + arg2 > field173) {
            arg2 = field173 - arg0;
        }
        if (arg1 + arg3 > field174) {
            arg3 = field174 - arg1;
        }
        int var8 = field172 - arg2;
        int var9 = field172 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field175[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "b", name = "b", descriptor = "(IIIII)V")
    private static final void method67(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field170 || arg1 >= field174) {
            return;
        }
        if (arg0 < field171) {
            arg2 -= field171 - arg0;
            arg0 = field171;
        }
        if (arg0 + arg2 > field173) {
            arg2 = field173 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field172 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field175[var9] >> 16 & 0xFF) * var5;
            int var12 = (field175[var9] >> 8 & 0xFF) * var5;
            int var13 = (field175[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field175[var9++] = var14;
        }
    }

    @OriginalMember(owner = "b", name = "a", descriptor = "(IIII)V")
    public static final void method68(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field170 || arg1 >= field174) {
            return;
        }
        if (arg0 < field171) {
            arg2 -= field171 - arg0;
            arg0 = field171;
        }
        if (arg0 + arg2 > field173) {
            arg2 = field173 - arg0;
        }
        int var4 = field172 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field175[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "b", name = "c", descriptor = "(IIIII)V")
    public static final void method69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method68(arg0, arg1, arg2, arg4);
        method68(arg0, arg1 + arg3 - 1, arg2, arg4);
        method70(arg0, arg1, arg3, arg4);
        method70(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "b", name = "b", descriptor = "(IIII)V")
    public static final void method70(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field171 || arg0 >= field173) {
            return;
        }
        if (arg1 < field170) {
            arg2 -= field170 - arg1;
            arg1 = field170;
        }
        if (arg1 + arg2 > field174) {
            arg2 = field174 - arg1;
        }
        int var4 = field172 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field175[field172 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "b", name = "c", descriptor = "(IIII)V")
    public static final void method71(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field172) {
            arg2 = field172;
        }
        if (arg3 > field169) {
            arg3 = field169;
        }
        field171 = arg0;
        field170 = arg1;
        field173 = arg2;
        field174 = arg3;
    }

    @OriginalMember(owner = "b", name = "d", descriptor = "(IIIII)V")
    private static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field171 || arg0 >= field173) {
            return;
        }
        if (arg1 < field170) {
            arg2 -= field170 - arg1;
            arg1 = field170;
        }
        if (arg1 + arg2 > field174) {
            arg2 = field174 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field172 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field175[var9] >> 16 & 0xFF) * var5;
            int var12 = (field175[var9] >> 8 & 0xFF) * var5;
            int var13 = (field175[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field175[var9] = var14;
            var9 += field172;
        }
    }

    @OriginalMember(owner = "b", name = "b", descriptor = "()V")
    public static void method73() {
        field175 = null;
    }

    @OriginalMember(owner = "b", name = "d", descriptor = "(IIII)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3) {
        if (field171 < arg0) {
            field171 = arg0;
        }
        if (field170 < arg1) {
            field170 = arg1;
        }
        if (field173 > arg2) {
            field173 = arg2;
        }
        if (field174 > arg3) {
            field174 = arg3;
        }
    }

    @OriginalMember(owner = "b", name = "c", descriptor = "(IIIIII)V")
    public static final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method67(arg0, arg1, arg2, arg4, arg5);
        method67(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method72(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method72(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "b", name = "e", descriptor = "(IIIII)V")
    public static final void method76(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field171) {
            arg2 -= field171 - arg0;
            arg0 = field171;
        }
        if (arg1 < field170) {
            arg3 -= field170 - arg1;
            arg1 = field170;
        }
        if (arg0 + arg2 > field173) {
            arg2 = field173 - arg0;
        }
        if (arg1 + arg3 > field174) {
            arg3 = field174 - arg1;
        }
        int var5 = field172 - arg2;
        int var6 = field172 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field175[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "b", name = "a", descriptor = "(III[I[I)V")
    public static final void method77(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field172 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field175[var7++] = arg2;
            }
            var5 += field172;
        }
    }

    @OriginalMember(owner = "b", name = "b", descriptor = "([I)V")
    public static final void method78(int[] arg0) {
        field171 = arg0[0];
        field170 = arg0[1];
        field173 = arg0[2];
        field174 = arg0[3];
    }

    @OriginalMember(owner = "b", name = "c", descriptor = "()V")
    public static final void method79() {
        field171 = 0;
        field170 = 0;
        field173 = field172;
        field174 = field169;
    }
}
