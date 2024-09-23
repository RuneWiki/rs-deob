import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GEFFBGXP")
public class class13 extends class20 {

    @OriginalMember(owner = "GEFFBGXP", name = "h", descriptor = "I")
    private static int field706 = 111;

    @OriginalMember(owner = "GEFFBGXP", name = "i", descriptor = "B")
    private static byte field707 = 118;

    @OriginalMember(owner = "GEFFBGXP", name = "j", descriptor = "I")
    private static int field708 = -459;

    @OriginalMember(owner = "GEFFBGXP", name = "l", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "GEFFBGXP", name = "m", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "GEFFBGXP", name = "n", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "GEFFBGXP", name = "o", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "GEFFBGXP", name = "p", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "GEFFBGXP", name = "q", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "GEFFBGXP", name = "r", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "GEFFBGXP", name = "s", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "GEFFBGXP", name = "t", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "GEFFBGXP", name = "u", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "GEFFBGXP", name = "k", descriptor = "[I")
    public static int[] field709;

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(III[I)V")
    public static void method223(int arg0, int arg1, int arg2, int[] arg3) {
        int var4 = 81 / arg0;
        field709 = arg3;
        field710 = arg2;
        field711 = arg1;
        method225(arg1, 0, -841, arg2, 0);
    }

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(Z)V")
    public static void method224(boolean arg0) {
        field714 = 0;
        field712 = 0;
        if (!arg0) {
            field715 = field710;
            field713 = field711;
            field716 = field715 - 1;
            field717 = field715 / 2;
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(IIIII)V")
    public static void method225(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg3 > field710) {
            arg3 = field710;
        }
        if (arg0 > field711) {
            arg0 = field711;
        }
        field714 = arg1;
        field712 = arg4;
        field715 = arg3;
        if (arg2 < 0) {
            field713 = arg0;
            field716 = field715 - 1;
            field717 = field715 / 2;
            field718 = field713 / 2;
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "b", descriptor = "(Z)V")
    public static void method226(boolean arg0) {
        if (!arg0) {
            int var1 = field711 * field710;
            for (int var2 = 0; var2 < var1; var2++) {
                field709[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(IIIIIBI)V")
    public static void method227(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg3 < field714) {
            arg6 -= field714 - arg3;
            arg3 = field714;
        }
        if (arg2 < field712) {
            arg0 -= field712 - arg2;
            arg2 = field712;
        }
        if (arg3 + arg6 > field715) {
            arg6 = field715 - arg3;
        }
        if (arg0 + arg2 > field713) {
            arg0 = field713 - arg2;
        }
        int var7 = 256 - arg4;
        int var8 = (arg1 >> 16 & 0xFF) * arg4;
        int var9 = (arg1 >> 8 & 0xFF) * arg4;
        int var10 = (arg1 & 0xFF) * arg4;
        int var11 = field710 - arg6;
        int var12 = field710 * arg2 + arg3;
        if (arg5 != 3) {
            return;
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = (field709[var12] >> 16 & 0xFF) * var7;
                int var16 = (field709[var12] >> 8 & 0xFF) * var7;
                int var17 = (field709[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field709[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(IIIIIZ)V")
    public static void method228(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 < field714) {
            arg2 -= field714 - arg3;
            arg3 = field714;
        }
        if (arg0 < field712) {
            arg1 -= field712 - arg0;
            arg0 = field712;
        }
        if (arg2 + arg3 > field715) {
            arg2 = field715 - arg3;
        }
        if (arg0 + arg1 > field713) {
            arg1 = field713 - arg0;
        }
        int var6 = field710 - arg2;
        if (!arg5) {
            field708 = -189;
        }
        int var7 = field710 * arg0 + arg3;
        for (int var8 = -arg1; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field709[var7++] = arg4;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(IIIIBI)V")
    public static void method229(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        method231(arg0, arg2, (byte) 31, arg3, arg5);
        if (field707 != arg4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method231(arg0, arg2, (byte) 31, arg1 + arg3 - 1, arg5);
        method233(arg1, arg0, -267, arg3, arg5);
        method233(arg1, arg0 + arg2 - 1, -267, arg3, arg5);
    }

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(IIIIIIB)V")
    public static void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 == 6) {
            boolean var7 = false;
        } else {
            field708 = -153;
        }
        method232(arg0, arg2, 47, arg5, arg4, arg1);
        method232(arg0, arg2 + arg3 - 1, 47, arg5, arg4, arg1);
        if (arg3 >= 3) {
            method234(arg4, 909, arg3 - 2, arg5, arg1, arg2 + 1);
            method234(arg4, 909, arg3 - 2, arg5, arg0 + arg1 - 1, arg2 + 1);
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(IIBII)V")
    public static void method231(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 31 || (arg3 < field712 || arg3 >= field713)) {
            return;
        }
        if (arg0 < field714) {
            arg1 -= field714 - arg0;
            arg0 = field714;
        }
        if (arg0 + arg1 > field715) {
            arg1 = field715 - arg0;
        }
        int var5 = field710 * arg3 + arg0;
        for (int var6 = 0; var6 < arg1; var6++) {
            field709[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "a", descriptor = "(IIIIII)V")
    public static void method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field712 || arg1 >= field713) {
            return;
        }
        if (arg5 < field714) {
            arg0 -= field714 - arg5;
            arg5 = field714;
        }
        if (arg0 + arg5 > field715) {
            arg0 = field715 - arg5;
        }
        int var6 = 256 - arg4;
        int var7 = 24 / arg2;
        int var8 = (arg3 >> 16 & 0xFF) * arg4;
        int var9 = (arg3 >> 8 & 0xFF) * arg4;
        int var10 = (arg3 & 0xFF) * arg4;
        int var11 = field710 * arg1 + arg5;
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = (field709[var11] >> 16 & 0xFF) * var6;
            int var14 = (field709[var11] >> 8 & 0xFF) * var6;
            int var15 = (field709[var11] & 0xFF) * var6;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field709[var11++] = var16;
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "b", descriptor = "(IIIII)V")
    public static void method233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= 0) {
            field706 = 357;
        }
        if (arg1 < field714 || arg1 >= field715) {
            return;
        }
        if (arg3 < field712) {
            arg0 -= field712 - arg3;
            arg3 = field712;
        }
        if (arg0 + arg3 > field713) {
            arg0 = field713 - arg3;
        }
        int var5 = field710 * arg3 + arg1;
        for (int var6 = 0; var6 < arg0; var6++) {
            field709[field710 * var6 + var5] = arg4;
        }
    }

    @OriginalMember(owner = "GEFFBGXP", name = "b", descriptor = "(IIIIII)V")
    public static void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field714 || arg4 >= field715) {
            return;
        }
        if (arg5 < field712) {
            arg2 -= field712 - arg5;
            arg5 = field712;
        }
        if (arg2 + arg5 > field713) {
            arg2 = field713 - arg5;
        }
        int var6 = 256 - arg0;
        int var7 = (arg3 >> 16 & 0xFF) * arg0;
        int var8 = (arg3 >> 8 & 0xFF) * arg0;
        int var9 = (arg3 & 0xFF) * arg0;
        int var10 = 68 / arg1;
        int var11 = field710 * arg5 + arg4;
        for (int var12 = 0; var12 < arg2; var12++) {
            int var13 = (field709[var11] >> 16 & 0xFF) * var6;
            int var14 = (field709[var11] >> 8 & 0xFF) * var6;
            int var15 = (field709[var11] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field709[var11] = var16;
            var11 += field710;
        }
    }
}
