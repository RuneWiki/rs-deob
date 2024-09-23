import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KVJNUKIT")
public class class36 extends class70 {

    @OriginalMember(owner = "KVJNUKIT", name = "i", descriptor = "Z")
    private static boolean field1082 = true;

    @OriginalMember(owner = "KVJNUKIT", name = "j", descriptor = "I")
    private static int field1083 = -822;

    @OriginalMember(owner = "KVJNUKIT", name = "k", descriptor = "I")
    private static int field1084 = 3;

    @OriginalMember(owner = "KVJNUKIT", name = "l", descriptor = "I")
    private static int field1085 = 9;

    @OriginalMember(owner = "KVJNUKIT", name = "n", descriptor = "Z")
    private static boolean field1087 = true;

    @OriginalMember(owner = "KVJNUKIT", name = "p", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "KVJNUKIT", name = "q", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "KVJNUKIT", name = "r", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "KVJNUKIT", name = "s", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "KVJNUKIT", name = "t", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "KVJNUKIT", name = "u", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "KVJNUKIT", name = "v", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "KVJNUKIT", name = "w", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "KVJNUKIT", name = "x", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "KVJNUKIT", name = "m", descriptor = "Z")
    private static boolean field1086;

    @OriginalMember(owner = "KVJNUKIT", name = "y", descriptor = "Z")
    public static boolean field1098;

    @OriginalMember(owner = "KVJNUKIT", name = "o", descriptor = "[I")
    public static int[] field1088;

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(II[II)V")
    public static void method339(int arg0, int arg1, int[] arg2, int arg3) {
        field1088 = arg2;
        field1089 = arg1;
        field1090 = arg0;
        if (arg3 != 0) {
            field1082 = !field1082;
        }
        method341(0, 0, false, arg1, arg0);
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(B)V")
    public static void method340(byte arg0) {
        if (arg0 == 3) {
            boolean var1 = false;
        }
        field1093 = 0;
        field1091 = 0;
        field1094 = field1089;
        field1092 = field1090;
        field1095 = field1094 - 1;
        field1096 = field1094 / 2;
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(IIZII)V")
    public static void method341(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > field1089) {
            arg3 = field1089;
        }
        if (arg4 > field1090) {
            arg4 = field1090;
        }
        field1093 = arg0;
        field1091 = arg1;
        if (arg2) {
            field1086 = true;
        }
        field1094 = arg3;
        field1092 = arg4;
        field1095 = field1094 - 1;
        field1096 = field1094 / 2;
        field1097 = field1092 / 2;
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(Z)V")
    public static void method342(boolean arg0) {
        if (!arg0) {
            int var1 = field1090 * field1089;
            for (int var2 = 0; var2 < var1; var2++) {
                field1088[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(IIIIIII)V")
    public static void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= 0) {
            return;
        }
        if (arg0 < field1093) {
            arg1 -= field1093 - arg0;
            arg0 = field1093;
        }
        if (arg5 < field1091) {
            arg2 -= field1091 - arg5;
            arg5 = field1091;
        }
        if (arg0 + arg1 > field1094) {
            arg1 = field1094 - arg0;
        }
        if (arg2 + arg5 > field1092) {
            arg2 = field1092 - arg5;
        }
        int var7 = 256 - arg4;
        int var8 = (arg3 >> 16 & 0xFF) * arg4;
        int var9 = (arg3 >> 8 & 0xFF) * arg4;
        int var10 = (arg3 & 0xFF) * arg4;
        int var11 = field1089 - arg1;
        int var12 = field1089 * arg5 + arg0;
        for (int var13 = 0; var13 < arg2; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = (field1088[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1088[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1088[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1088[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(IIZIII)V")
    public static void method344(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1093) {
            arg0 -= field1093 - arg4;
            arg4 = field1093;
        }
        if (arg3 < field1091) {
            arg5 -= field1091 - arg3;
            arg3 = field1091;
        }
        if (arg0 + arg4 > field1094) {
            arg0 = field1094 - arg4;
        }
        if (arg3 + arg5 > field1092) {
            arg5 = field1092 - arg3;
        }
        int var6 = field1089 - arg0;
        int var7 = field1089 * arg3 + arg4;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var10 = -arg0; var10 < 0; var10++) {
                field1088[var7++] = arg1;
            }
            var7 += var6;
        }
        if (!arg2) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(IIIIBI)V")
    public static void method345(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 6) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method347(arg0, arg5, 0, arg3, arg1);
        method347(arg0, arg2 + arg5 - 1, 0, arg3, arg1);
        method349(arg1, 964, arg2, arg5, arg3);
        method349(arg0 + arg1 - 1, 964, arg2, arg5, arg3);
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(BIIIIII)V")
    public static void method346(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 3) {
            field1087 = !field1087;
        }
        method348(arg6, false, arg2, arg3, arg1, arg4);
        method348(arg6, false, arg2, arg3, arg1 + arg5 - 1, arg4);
        if (arg5 >= 3) {
            method350(arg2, arg1 + 1, arg6, true, arg5 - 2, arg4);
            method350(arg2, arg1 + 1, arg3 + arg6 - 1, true, arg5 - 2, arg4);
        }
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(IIIII)V")
    public static void method347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            field1087 = !field1087;
        }
        if (arg1 < field1091 || arg1 >= field1092) {
            return;
        }
        if (arg4 < field1093) {
            arg0 -= field1093 - arg4;
            arg4 = field1093;
        }
        if (arg0 + arg4 > field1094) {
            arg0 = field1094 - arg4;
        }
        int var5 = field1089 * arg1 + arg4;
        for (int var6 = 0; var6 < arg0; var6++) {
            field1088[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(IZIIII)V")
    public static void method348(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1091 || arg4 >= field1092) {
            return;
        }
        if (arg0 < field1093) {
            arg3 -= field1093 - arg0;
            arg0 = field1093;
        }
        if (arg0 + arg3 > field1094) {
            arg3 = field1094 - arg0;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        int var10 = field1089 * arg4 + arg0;
        if (arg1) {
            field1086 = true;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field1088[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1088[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1088[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1088[var10++] = var15;
        }
    }

    @OriginalMember(owner = "KVJNUKIT", name = "b", descriptor = "(IIIII)V")
    public static void method349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 0 || (arg0 < field1093 || arg0 >= field1094)) {
            return;
        }
        if (arg3 < field1091) {
            arg2 -= field1091 - arg3;
            arg3 = field1091;
        }
        if (arg2 + arg3 > field1092) {
            arg2 = field1092 - arg3;
        }
        int var5 = field1089 * arg3 + arg0;
        for (int var6 = 0; var6 < arg2; var6++) {
            field1088[field1089 * var6 + var5] = arg4;
        }
    }

    @OriginalMember(owner = "KVJNUKIT", name = "a", descriptor = "(IIIZII)V")
    public static void method350(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 < field1093 || arg2 >= field1094) {
            return;
        }
        if (arg1 < field1091) {
            arg4 -= field1091 - arg1;
            arg1 = field1091;
        }
        if (arg1 + arg4 > field1092) {
            arg4 = field1092 - arg1;
        }
        int var6 = 256 - arg0;
        int var7 = (arg5 >> 16 & 0xFF) * arg0;
        int var8 = (arg5 >> 8 & 0xFF) * arg0;
        int var9 = (arg5 & 0xFF) * arg0;
        if (!arg3) {
            return;
        }
        int var10 = field1089 * arg1 + arg2;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1088[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1088[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1088[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1088[var10] = var15;
            var10 += field1089;
        }
    }
}
