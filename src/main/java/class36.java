import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NBXZFIDS")
public class class36 extends class65 {

    @OriginalMember(owner = "client!NBXZFIDS", name = "i", descriptor = "Z")
    private static boolean field1143 = true;

    @OriginalMember(owner = "client!NBXZFIDS", name = "j", descriptor = "B")
    private static byte field1144 = 79;

    @OriginalMember(owner = "client!NBXZFIDS", name = "k", descriptor = "I")
    private static int field1145 = 16067;

    @OriginalMember(owner = "client!NBXZFIDS", name = "l", descriptor = "Z")
    private static boolean field1146 = true;

    @OriginalMember(owner = "client!NBXZFIDS", name = "m", descriptor = "I")
    private static int field1147 = 5;

    @OriginalMember(owner = "client!NBXZFIDS", name = "n", descriptor = "I")
    private static int field1148 = -578;

    @OriginalMember(owner = "client!NBXZFIDS", name = "p", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!NBXZFIDS", name = "q", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!NBXZFIDS", name = "r", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!NBXZFIDS", name = "s", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!NBXZFIDS", name = "t", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!NBXZFIDS", name = "u", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!NBXZFIDS", name = "v", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!NBXZFIDS", name = "w", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!NBXZFIDS", name = "x", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!NBXZFIDS", name = "h", descriptor = "Z")
    private static boolean field1142;

    @OriginalMember(owner = "client!NBXZFIDS", name = "y", descriptor = "Z")
    public static boolean field1159;

    @OriginalMember(owner = "client!NBXZFIDS", name = "o", descriptor = "[I")
    public static int[] field1149;

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(II[IZ)V")
    public static void method286(int arg0, int arg1, int[] arg2, boolean arg3) {
        if (arg3) {
            field1148 = -333;
        }
        field1149 = arg2;
        field1150 = arg1;
        field1151 = arg0;
        method288(0, arg0, 0, arg1, -586);
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(Z)V")
    public static void method287(boolean arg0) {
        field1154 = 0;
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1152 = 0;
        field1155 = field1150;
        field1153 = field1151;
        field1156 = field1155 - 1;
        field1157 = field1155 / 2;
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIIII)V")
    public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4) {
        while (arg4 >= 0) {
            field1145 = -261;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 > field1150) {
            arg3 = field1150;
        }
        if (arg1 > field1151) {
            arg1 = field1151;
        }
        field1154 = arg0;
        field1152 = arg2;
        field1155 = arg3;
        field1153 = arg1;
        field1156 = field1155 - 1;
        field1157 = field1155 / 2;
        field1158 = field1153 / 2;
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(I)V")
    public static void method289(int arg0) {
        if (arg0 != 5) {
            field1142 = !field1142;
        }
        int var1 = field1151 * field1150;
        for (int var2 = 0; var2 < var1; var2++) {
            field1149[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIZIIII)V")
    public static void method290(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < field1154) {
            arg6 -= field1154 - arg1;
            arg1 = field1154;
        }
        if (arg5 < field1152) {
            arg3 -= field1152 - arg5;
            arg5 = field1152;
        }
        if (arg1 + arg6 > field1155) {
            arg6 = field1155 - arg1;
        }
        if (arg3 + arg5 > field1153) {
            arg3 = field1153 - arg5;
        }
        int var7 = 256 - arg0;
        int var8 = (arg4 >> 16 & 0xFF) * arg0;
        int var9 = (arg4 >> 8 & 0xFF) * arg0;
        int var10 = (arg4 & 0xFF) * arg0;
        if (arg2) {
            return;
        }
        int var11 = field1150 - arg6;
        int var12 = field1150 * arg5 + arg1;
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = (field1149[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1149[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1149[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1149[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIIIII)V")
    public static void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1154) {
            arg1 -= field1154 - arg0;
            arg0 = field1154;
        }
        if (arg3 < field1152) {
            arg5 -= field1152 - arg3;
            arg3 = field1152;
        }
        if (arg0 + arg1 > field1155) {
            arg1 = field1155 - arg0;
        }
        if (arg3 + arg5 > field1153) {
            arg5 = field1153 - arg3;
        }
        int var6 = field1150 - arg1;
        if (arg2 != 42613) {
            return;
        }
        int var7 = field1150 * arg3 + arg0;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field1149[var7++] = arg4;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIIIIB)V")
    public static void method292(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        method294(arg2, arg3, arg1, 0, arg4);
        if (arg5 == 1) {
            boolean var6 = false;
            method294(arg2, arg0 + arg3 - 1, arg1, 0, arg4);
            method296(arg4, arg0, (byte) 79, arg3, arg2);
            method296(arg4, arg0, (byte) 79, arg3, arg1 + arg2 - 1);
        }
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIIIIII)V")
    public static void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method295(arg5, arg2, arg6, arg4, arg1, 3466);
        if (arg0 != 0) {
            return;
        }
        method295(arg5, arg2, arg3 + arg6 - 1, arg4, arg1, 3466);
        if (arg3 >= 3) {
            method297(arg6 + 1, (byte) -85, arg2, arg4, arg3 - 2, arg1);
            method297(arg6 + 1, (byte) -85, arg2, arg4 + arg5 - 1, arg3 - 2, arg1);
        }
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "b", descriptor = "(IIIII)V")
    public static void method294(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1152 || arg1 >= field1153) {
            return;
        }
        if (arg0 < field1154) {
            arg2 -= field1154 - arg0;
            arg0 = field1154;
        }
        if (arg0 + arg2 > field1155) {
            arg2 = field1155 - arg0;
        }
        int var5 = field1150 * arg1 + arg0;
        if (arg3 != 0) {
            field1143 = !field1143;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            field1149[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "b", descriptor = "(IIIIII)V")
    public static void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field1152 || arg2 >= field1153) {
            return;
        }
        if (arg3 < field1154) {
            arg0 -= field1154 - arg3;
            arg3 = field1154;
        }
        if (arg0 + arg3 > field1155) {
            arg0 = field1155 - arg3;
        }
        int var6 = 256 - arg1;
        if (arg5 != 3466) {
            field1143 = !field1143;
        }
        int var7 = (arg4 >> 16 & 0xFF) * arg1;
        int var8 = (arg4 >> 8 & 0xFF) * arg1;
        int var9 = (arg4 & 0xFF) * arg1;
        int var10 = field1150 * arg2 + arg3;
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field1149[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1149[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1149[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1149[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIBII)V")
    public static void method296(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg4 < field1154 || arg4 >= field1155) {
            return;
        }
        if (arg3 < field1152) {
            arg1 -= field1152 - arg3;
            arg3 = field1152;
        }
        if (arg1 + arg3 > field1153) {
            arg1 = field1153 - arg3;
        }
        int var5 = field1150 * arg3 + arg4;
        if (field1144 == arg2) {
            for (int var6 = 0; var6 < arg1; var6++) {
                field1149[field1150 * var6 + var5] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IBIIII)V")
    public static void method297(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -85) {
            field1143 = !field1143;
        }
        if (arg3 < field1154 || arg3 >= field1155) {
            return;
        }
        if (arg0 < field1152) {
            arg4 -= field1152 - arg0;
            arg0 = field1152;
        }
        if (arg0 + arg4 > field1153) {
            arg4 = field1153 - arg0;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        int var10 = field1150 * arg0 + arg3;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1149[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1149[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1149[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1149[var10] = var15;
            var10 += field1150;
        }
    }
}
