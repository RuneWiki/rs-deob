import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KPYGFVMA")
public class class32 extends class42 {

    @OriginalMember(owner = "client!KPYGFVMA", name = "i", descriptor = "I")
    private static int field1089 = -39;

    @OriginalMember(owner = "client!KPYGFVMA", name = "j", descriptor = "I")
    private static int field1090 = -26550;

    @OriginalMember(owner = "client!KPYGFVMA", name = "m", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!KPYGFVMA", name = "n", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!KPYGFVMA", name = "o", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!KPYGFVMA", name = "p", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!KPYGFVMA", name = "q", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!KPYGFVMA", name = "r", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!KPYGFVMA", name = "s", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!KPYGFVMA", name = "t", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!KPYGFVMA", name = "u", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!KPYGFVMA", name = "k", descriptor = "Z")
    private static boolean field1091;

    @OriginalMember(owner = "client!KPYGFVMA", name = "v", descriptor = "Z")
    public static boolean field1102;

    @OriginalMember(owner = "client!KPYGFVMA", name = "l", descriptor = "[I")
    public static int[] field1092;

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IBI[I)V")
    public static void method310(int arg0, byte arg1, int arg2, int[] arg3) {
        if (arg1 == 28) {
            field1092 = arg3;
            field1093 = arg0;
            field1094 = arg2;
            method312(0, 0, arg2, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(I)V")
    public static void method311(int arg0) {
        field1097 = 0;
        field1095 = 0;
        field1098 = field1093;
        if (arg0 == 0) {
            field1096 = field1094;
            field1099 = field1098 - 1;
            field1100 = field1098 / 2;
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIIII)V")
    public static void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 > field1093) {
            arg3 = field1093;
        }
        if (arg2 > field1094) {
            arg2 = field1094;
        }
        field1097 = arg4;
        field1095 = arg0;
        field1098 = arg3;
        field1096 = arg2;
        if (arg1 == 0) {
            field1099 = field1098 - 1;
            field1100 = field1098 / 2;
            field1101 = field1096 / 2;
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(B)V")
    public static void method313(byte arg0) {
        if (arg0 != 73) {
            field1089 = 306;
        }
        int var1 = field1094 * field1093;
        for (int var2 = 0; var2 < var1; var2++) {
            field1092[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIIIIII)V")
    public static void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < field1097) {
            arg4 -= field1097 - arg1;
            arg1 = field1097;
        }
        if (arg6 < field1095) {
            arg5 -= field1095 - arg6;
            arg6 = field1095;
        }
        if (arg1 + arg4 > field1098) {
            arg4 = field1098 - arg1;
        }
        if (arg5 + arg6 > field1096) {
            arg5 = field1096 - arg6;
        }
        int var7 = 256 - arg2;
        int var8 = (arg0 >> 16 & 0xFF) * arg2;
        int var9 = (arg0 >> 8 & 0xFF) * arg2;
        int var10 = (arg0 & 0xFF) * arg2;
        int var11 = field1093 - arg4;
        if (field1090 != arg3) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = field1093 * arg6 + arg1;
        for (int var14 = 0; var14 < arg5; var14++) {
            for (int var15 = -arg4; var15 < 0; var15++) {
                int var16 = (field1092[var13] >> 16 & 0xFF) * var7;
                int var17 = (field1092[var13] >> 8 & 0xFF) * var7;
                int var18 = (field1092[var13] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field1092[var13++] = var19;
            }
            var13 += var11;
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IBIIII)V")
    public static void method315(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field1097) {
            arg5 -= field1097 - arg2;
            arg2 = field1097;
        }
        if (arg3 < field1095) {
            arg4 -= field1095 - arg3;
            arg3 = field1095;
        }
        if (arg2 + arg5 > field1098) {
            arg5 = field1098 - arg2;
        }
        if (arg3 + arg4 > field1096) {
            arg4 = field1096 - arg3;
        }
        int var6 = field1093 - arg5;
        if (arg1 != 0) {
            return;
        }
        boolean var7 = false;
        int var8 = field1093 * arg3 + arg2;
        for (int var9 = -arg4; var9 < 0; var9++) {
            for (int var10 = -arg5; var10 < 0; var10++) {
                field1092[var8++] = arg0;
            }
            var8 += var6;
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIIIII)V")
    public static void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method318(arg1, arg0, true, arg3, arg5);
        method318(arg1 + arg2 - 1, arg0, true, arg3, arg5);
        method320((byte) 109, arg3, arg5, arg1, arg2);
        if (arg4 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method320((byte) 109, arg0 + arg3 - 1, arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "b", descriptor = "(IIIIIII)V")
    public static void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            return;
        }
        method319(arg4, -186, arg5, arg1, arg3, arg6);
        method319(arg4, -186, arg5, arg1, arg3, arg0 + arg6 - 1);
        if (arg0 >= 3) {
            method321(arg5, arg6 + 1, arg3, (byte) -100, arg0 - 2, arg4);
            method321(arg1 + arg5 - 1, arg6 + 1, arg3, (byte) -100, arg0 - 2, arg4);
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIZII)V")
    public static void method318(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 < field1095 || arg0 >= field1096) {
            return;
        }
        if (arg3 < field1097) {
            arg1 -= field1097 - arg3;
            arg3 = field1097;
        }
        if (arg1 + arg3 > field1098) {
            arg1 = field1098 - arg3;
        }
        int var5 = field1093 * arg0 + arg3;
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg1; var7++) {
            field1092[var5 + var7] = arg4;
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "b", descriptor = "(IIIIII)V")
    public static void method319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field1095 || arg5 >= field1096) {
            return;
        }
        if (arg2 < field1097) {
            arg3 -= field1097 - arg2;
            arg2 = field1097;
        }
        if (arg2 + arg3 > field1098) {
            arg3 = field1098 - arg2;
        }
        int var6 = 256 - arg0;
        if (arg1 >= 0) {
            return;
        }
        int var7 = (arg4 >> 16 & 0xFF) * arg0;
        int var8 = (arg4 >> 8 & 0xFF) * arg0;
        int var9 = (arg4 & 0xFF) * arg0;
        int var10 = field1093 * arg5 + arg2;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field1092[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1092[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1092[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1092[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(BIIII)V")
    public static void method320(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1097 || arg1 >= field1098) {
            return;
        }
        if (arg3 < field1095) {
            arg4 -= field1095 - arg3;
            arg3 = field1095;
        }
        if (arg3 + arg4 > field1096) {
            arg4 = field1096 - arg3;
        }
        int var5 = field1093 * arg3 + arg1;
        if (arg0 != 109) {
            field1089 = -231;
        }
        for (int var6 = 0; var6 < arg4; var6++) {
            field1092[field1093 * var6 + var5] = arg2;
        }
    }

    @OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIIBII)V")
    public static void method321(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg0 < field1097 || arg0 >= field1098) {
            return;
        }
        if (arg1 < field1095) {
            arg4 -= field1095 - arg1;
            arg1 = field1095;
        }
        if (arg1 + arg4 > field1096) {
            arg4 = field1096 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg2 >> 16 & 0xFF) * arg5;
        int var8 = (arg2 >> 8 & 0xFF) * arg5;
        int var9 = (arg2 & 0xFF) * arg5;
        if (arg3 != -100) {
            field1091 = !field1091;
        }
        int var10 = field1093 * arg1 + arg0;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field1092[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1092[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1092[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1092[var10] = var15;
            var10 += field1093;
        }
    }
}
