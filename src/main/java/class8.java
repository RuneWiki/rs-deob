import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 extends class30 {

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field150 = 0;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field156 = 0;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "[I")
    public static int[] field152;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)V")
    private static final void method59(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field151 || arg0 >= field156) {
            return;
        }
        if (arg1 < field155) {
            arg2 -= field155 - arg1;
            arg1 = field155;
        }
        if (arg1 + arg2 > field150) {
            arg2 = field150 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field154 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field152[var9] >> 16 & 0xFF) * var5;
            int var12 = (field152[var9] >> 8 & 0xFF) * var5;
            int var13 = (field152[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field152[var9] = var14;
            var9 += field154;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field154) {
            arg2 = field154;
        }
        if (arg3 > field153) {
            arg3 = field153;
        }
        field151 = arg0;
        field155 = arg1;
        field156 = arg2;
        field150 = arg3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public static void method61() {
        field152 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIII)V")
    public static final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method65(arg0, arg1, arg2, arg4, arg5);
        method65(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method59(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method59(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([I)V")
    public static final void method63(int[] arg0) {
        arg0[0] = field151;
        arg0[1] = field155;
        arg0[2] = field156;
        arg0[3] = field150;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public static final void method64() {
        field151 = 0;
        field155 = 0;
        field156 = field154;
        field150 = field153;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IIIII)V")
    private static final void method65(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field155 || arg1 >= field150) {
            return;
        }
        if (arg0 < field151) {
            arg2 -= field151 - arg0;
            arg0 = field151;
        }
        if (arg0 + arg2 > field156) {
            arg2 = field156 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field154 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field152[var9] >> 16 & 0xFF) * var5;
            int var12 = (field152[var9] >> 8 & 0xFF) * var5;
            int var13 = (field152[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field152[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IIII)V")
    public static final void method66(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field151 || arg0 >= field156) {
            return;
        }
        if (arg1 < field155) {
            arg2 -= field155 - arg1;
            arg1 = field155;
        }
        if (arg1 + arg2 > field150) {
            arg2 = field150 - arg1;
        }
        int var4 = field154 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field152[field154 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([I)V")
    public static final void method67(int[] arg0) {
        field151 = arg0[0];
        field155 = arg0[1];
        field156 = arg0[2];
        field150 = arg0[3];
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(IIIII)V")
    public static final void method68(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method77(arg0, arg1, arg2, arg4);
        method77(arg0, arg1 + arg3 - 1, arg2, arg4);
        method66(arg0, arg1, arg3, arg4);
        method66(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IIIIII)V")
    public static final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field151) {
            arg2 -= field151 - arg0;
            arg0 = field151;
        }
        if (arg1 < field155) {
            var6 += (field155 - arg1) * var7;
            arg3 -= field155 - arg1;
            arg1 = field155;
        }
        if (arg0 + arg2 > field156) {
            arg2 = field156 - arg0;
        }
        if (arg1 + arg3 > field150) {
            arg3 = field150 - arg1;
        }
        int var8 = field154 - arg2;
        int var9 = field154 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field152[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(IIIII)V")
    public static final void method70(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field151) {
            arg2 -= field151 - arg0;
            arg0 = field151;
        }
        if (arg1 < field155) {
            arg3 -= field155 - arg1;
            arg1 = field155;
        }
        if (arg0 + arg2 > field156) {
            arg2 = field156 - arg0;
        }
        if (arg1 + arg3 > field150) {
            arg3 = field150 - arg1;
        }
        int var5 = field154 - arg2;
        int var6 = field154 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field152[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III[I[I)V")
    public static final void method71(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field154 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field152[var7++] = arg2;
            }
            var5 += field154;
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(IIIII)V")
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method77(arg0, arg1, var5 + 1, arg4);
            } else {
                method77(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field151) {
                    var8 += (field151 - arg0) * var10;
                    arg0 = field151;
                }
                if (var11 >= field156) {
                    var11 = field156 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field155 && var12 < field150) {
                        field152[field154 * var12 + arg0] = arg4;
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
                if (arg1 < field155) {
                    var14 += (field155 - arg1) * var16;
                    arg1 = field155;
                }
                if (var17 >= field150) {
                    var17 = field150 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field151 && var18 < field156) {
                        field152[field154 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method66(arg0, arg1, var6 + 1, arg4);
        } else {
            method66(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([III)V")
    public static final void method73(int[] arg0, int arg1, int arg2) {
        field152 = arg0;
        field154 = arg1;
        field153 = arg2;
        method60(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(IIIIII)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field151) {
            arg2 -= field151 - arg0;
            arg0 = field151;
        }
        if (arg1 < field155) {
            arg3 -= field155 - arg1;
            arg1 = field155;
        }
        if (arg0 + arg2 > field156) {
            arg2 = field156 - arg0;
        }
        if (arg1 + arg3 > field150) {
            arg3 = field150 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field154 - arg2;
        int var9 = field154 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field152[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field152[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(IIII)V")
    public static final void method75(int arg0, int arg1, int arg2, int arg3) {
        if (field151 < arg0) {
            field151 = arg0;
        }
        if (field155 < arg1) {
            field155 = arg1;
        }
        if (field156 > arg2) {
            field156 = arg2;
        }
        if (field150 > arg3) {
            field150 = arg3;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()V")
    public static final void method76() {
        int var0 = 0;
        int var1 = field154 * field153 - 7;
        while (var0 < var1) {
            field152[var0++] = 0;
            field152[var0++] = 0;
            field152[var0++] = 0;
            field152[var0++] = 0;
            field152[var0++] = 0;
            field152[var0++] = 0;
            field152[var0++] = 0;
            field152[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field152[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(IIII)V")
    public static final void method77(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field155 || arg1 >= field150) {
            return;
        }
        if (arg0 < field151) {
            arg2 -= field151 - arg0;
            arg0 = field151;
        }
        if (arg0 + arg2 > field156) {
            arg2 = field156 - arg0;
        }
        int var4 = field154 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field152[var4 + var5] = arg3;
        }
    }
}
