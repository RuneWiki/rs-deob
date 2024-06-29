import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PGTLMTYR")
public class class45 extends class21 {

    @OriginalMember(owner = "client!PGTLMTYR", name = "h", descriptor = "I")
    private static int field1105 = 4;

    @OriginalMember(owner = "client!PGTLMTYR", name = "i", descriptor = "I")
    private static int field1106 = -24987;

    @OriginalMember(owner = "client!PGTLMTYR", name = "j", descriptor = "Z")
    private static boolean field1107 = true;

    @OriginalMember(owner = "client!PGTLMTYR", name = "k", descriptor = "I")
    private static int field1108 = 37900;

    @OriginalMember(owner = "client!PGTLMTYR", name = "m", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!PGTLMTYR", name = "n", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!PGTLMTYR", name = "o", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!PGTLMTYR", name = "p", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!PGTLMTYR", name = "q", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!PGTLMTYR", name = "r", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!PGTLMTYR", name = "s", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!PGTLMTYR", name = "t", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!PGTLMTYR", name = "u", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!PGTLMTYR", name = "v", descriptor = "Z")
    public static boolean field1119;

    @OriginalMember(owner = "client!PGTLMTYR", name = "l", descriptor = "[I")
    public static int[] field1109;

    @OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(III[I)V")
    public static void method339(int arg0, int arg1, int arg2, int[] arg3) {
        field1109 = arg3;
        field1110 = arg0;
        field1111 = arg1;
        method341(0, arg0, 0, arg1, -44482);
        if (arg2 != 0) {
            field1105 = -287;
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(I)V")
    public static void method340(int arg0) {
        if (arg0 != 3393) {
            field1105 = -5;
        }
        field1114 = 0;
        field1112 = 0;
        field1115 = field1110;
        field1113 = field1111;
        field1116 = field1115 - 1;
        field1117 = field1115 / 2;
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IIIII)V")
    public static void method341(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 > field1110) {
            arg1 = field1110;
        }
        if (arg3 > field1111) {
            arg3 = field1111;
        }
        field1114 = arg2;
        field1112 = arg0;
        field1115 = arg1;
        field1113 = arg3;
        field1116 = field1115 - 1;
        field1117 = field1115 / 2;
        field1118 = field1113 / 2;
        if (arg4 != -44482) {
            field1108 = -222;
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(B)V")
    public static void method342(byte arg0) {
        int var1 = field1111 * field1110;
        if (arg0 != 32) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field1109[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IZIIIII)V")
    public static void method343(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < field1114) {
            arg2 -= field1114 - arg0;
            arg0 = field1114;
        }
        if (arg4 < field1112) {
            arg5 -= field1112 - arg4;
            arg4 = field1112;
        }
        if (arg0 + arg2 > field1115) {
            arg2 = field1115 - arg0;
        }
        if (arg4 + arg5 > field1113) {
            arg5 = field1113 - arg4;
        }
        int var7 = 256 - arg6;
        int var8 = (arg3 >> 16 & 0xFF) * arg6;
        int var9 = (arg3 >> 8 & 0xFF) * arg6;
        int var10 = (arg3 & 0xFF) * arg6;
        if (arg1) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = field1110 - arg2;
        int var13 = field1110 * arg4 + arg0;
        for (int var14 = 0; var14 < arg5; var14++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                int var16 = (field1109[var13] >> 16 & 0xFF) * var7;
                int var17 = (field1109[var13] >> 8 & 0xFF) * var7;
                int var18 = (field1109[var13] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field1109[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IIIIZI)V")
    public static void method344(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 < field1114) {
            arg1 -= field1114 - arg0;
            arg0 = field1114;
        }
        if (arg3 < field1112) {
            arg2 -= field1112 - arg3;
            arg3 = field1112;
        }
        if (arg0 + arg1 > field1115) {
            arg1 = field1115 - arg0;
        }
        if (arg2 + arg3 > field1113) {
            arg2 = field1113 - arg3;
        }
        int var6 = field1110 - arg1;
        int var7 = field1110 * arg3 + arg0;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var10 = -arg1; var10 < 0; var10++) {
                field1109[var7++] = arg5;
            }
            var7 += var6;
        }
        if (!arg4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IIIIII)V")
    public static void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method347(arg5, 160, arg0, arg3, arg1);
        method347(arg4 + arg5 - 1, 160, arg0, arg3, arg1);
        method349(arg0, 14380, arg5, arg3, arg4);
        if (field1106 != arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method349(arg0, 14380, arg5, arg1 + arg3 - 1, arg4);
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IIIIIII)V")
    public static void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method348(arg4, arg2, arg1, arg6, 919, arg0);
        if (arg5 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method348(arg4, arg2 + arg3 - 1, arg1, arg6, 919, arg0);
        if (arg3 >= 3) {
            method350(arg6, arg2 + 1, -716, arg4, arg3 - 2, arg1);
            method350(arg6, arg2 + 1, -716, arg0 + arg4 - 1, arg3 - 2, arg1);
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "b", descriptor = "(IIIII)V")
    public static void method347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 44 / arg1;
        if (arg0 < field1112 || arg0 >= field1113) {
            return;
        }
        if (arg3 < field1114) {
            arg4 -= field1114 - arg3;
            arg3 = field1114;
        }
        if (arg3 + arg4 > field1115) {
            arg4 = field1115 - arg3;
        }
        int var6 = field1110 * arg0 + arg3;
        for (int var7 = 0; var7 < arg4; var7++) {
            field1109[var6 + var7] = arg2;
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "b", descriptor = "(IIIIII)V")
    public static void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field1112 || arg1 >= field1113) {
            return;
        }
        if (arg0 < field1114) {
            arg5 -= field1114 - arg0;
            arg0 = field1114;
        }
        if (arg0 + arg5 > field1115) {
            arg5 = field1115 - arg0;
        }
        int var6 = 256 - arg3;
        int var7 = (arg2 >> 16 & 0xFF) * arg3;
        int var8 = (arg2 >> 8 & 0xFF) * arg3;
        int var9 = (arg2 & 0xFF) * arg3;
        int var10 = field1110 * arg1 + arg0;
        if (arg4 <= 0) {
            return;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field1109[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1109[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1109[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1109[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "c", descriptor = "(IIIII)V")
    public static void method349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 14380) {
            field1108 = -275;
        }
        if (arg3 < field1114 || arg3 >= field1115) {
            return;
        }
        if (arg2 < field1112) {
            arg4 -= field1112 - arg2;
            arg2 = field1112;
        }
        if (arg2 + arg4 > field1113) {
            arg4 = field1113 - arg2;
        }
        int var5 = field1110 * arg2 + arg3;
        for (int var6 = 0; var6 < arg4; var6++) {
            field1109[field1110 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "client!PGTLMTYR", name = "c", descriptor = "(IIIIII)V")
    public static void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= 0 || (arg3 < field1114 || arg3 >= field1115)) {
            return;
        }
        if (arg1 < field1112) {
            arg4 -= field1112 - arg1;
            arg1 = field1112;
        }
        if (arg1 + arg4 > field1113) {
            arg4 = field1113 - arg1;
        }
        int var6 = 256 - arg0;
        int var7 = (arg5 >> 16 & 0xFF) * arg0;
        int var8 = (arg5 >> 8 & 0xFF) * arg0;
        int var9 = (arg5 & 0xFF) * arg0;
        int var10 = field1110 * arg1 + arg3;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1109[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1109[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1109[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1109[var10] = var15;
            var10 += field1110;
        }
    }
}
