import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LFYNQWSZ")
public class Draw2D extends DoublyLinkable {

    @OriginalMember(owner = "client!LFYNQWSZ", name = "j", descriptor = "Z")
    private static boolean field1092 = true;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "k", descriptor = "I")
    private static int field1093 = -291;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "h", descriptor = "I")
    private static int field1090;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "m", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "n", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "o", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "p", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "q", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "r", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "s", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "t", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "u", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "i", descriptor = "Z")
    private static boolean field1091;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "v", descriptor = "Z")
    public static boolean field1104;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "l", descriptor = "[I")
    public static int[] field1094;

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(ZII[I)V")
    public static void method332(boolean arg0, int arg1, int arg2, int[] arg3) {
        if (!arg0) {
            field1093 = -394;
        }
        field1094 = arg3;
        field1095 = arg1;
        field1096 = arg2;
        method334(0, 0, arg2, arg1, true);
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(B)V")
    public static void method333(byte arg0) {
        field1099 = 0;
        field1097 = 0;
        field1100 = field1095;
        field1098 = field1096;
        field1101 = field1100 - 1;
        if (arg0 != 82) {
            field1093 = -258;
        }
        field1102 = field1100 / 2;
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIIZ)V")
    public static void method334(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 > field1095) {
            arg3 = field1095;
        }
        if (arg2 > field1096) {
            arg2 = field1096;
        }
        field1099 = arg1;
        field1097 = arg0;
        field1100 = arg3;
        field1098 = arg2;
        if (arg4) {
            field1101 = field1100 - 1;
            field1102 = field1100 / 2;
            field1103 = field1098 / 2;
        }
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(I)V")
    public static void method335(int arg0) {
        int var1 = field1096 * field1095;
        if (arg0 != 4) {
            field1091 = !field1091;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            field1094[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(ZIIIIII)V")
    public static void method336(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < field1099) {
            arg3 -= field1099 - arg6;
            arg6 = field1099;
        }
        if (arg2 < field1097) {
            arg4 -= field1097 - arg2;
            arg2 = field1097;
        }
        if (arg3 + arg6 > field1100) {
            arg3 = field1100 - arg6;
        }
        if (arg2 + arg4 > field1098) {
            arg4 = field1098 - arg2;
        }
        int var7 = 256 - arg5;
        int var8 = (arg1 >> 16 & 0xFF) * arg5;
        int var9 = (arg1 >> 8 & 0xFF) * arg5;
        int var10 = (arg1 & 0xFF) * arg5;
        if (arg0) {
            field1091 = !field1091;
        }
        int var11 = field1095 - arg3;
        int var12 = field1095 * arg2 + arg6;
        for (int var13 = 0; var13 < arg4; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = (field1094[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1094[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1094[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1094[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIBII)V")
    public static void method337(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg5 < field1099) {
            arg4 -= field1099 - arg5;
            arg5 = field1099;
        }
        if (arg1 < field1097) {
            arg0 -= field1097 - arg1;
            arg1 = field1097;
        }
        if (arg4 + arg5 > field1100) {
            arg4 = field1100 - arg5;
        }
        if (arg0 + arg1 > field1098) {
            arg0 = field1098 - arg1;
        }
        int var6 = field1095 - arg4;
        int var7 = field1095 * arg1 + arg5;
        for (int var8 = -arg0; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field1094[var7++] = arg2;
            }
            var7 += var6;
        }
        if (arg3 == -24) {
            ;
        }
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIIII)V")
    public static void method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method340(arg4, arg3, arg1, arg5, true);
        method340(arg4, arg3, arg1 + arg2 - 1, arg5, true);
        if (arg0 != 0) {
            field1090 = -278;
        }
        method342(arg4, arg3, arg2, false, arg1);
        method342(arg4 + arg5 - 1, arg3, arg2, false, arg1);
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIIIIB)V")
    public static void method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != -113) {
            return;
        }
        method341(arg4, arg0, arg1, 1388, arg5, arg2);
        method341(arg3 + arg4 - 1, arg0, arg1, 1388, arg5, arg2);
        if (arg3 >= 3) {
            method343(0, arg4 + 1, arg0, arg2, arg3 - 2, arg5);
            method343(0, arg4 + 1, arg0 + arg1 - 1, arg2, arg3 - 2, arg5);
        }
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "b", descriptor = "(IIIIZ)V")
    public static void method340(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < field1097 || arg2 >= field1098) {
            return;
        }
        if (arg0 < field1099) {
            arg3 -= field1099 - arg0;
            arg0 = field1099;
        }
        if (arg0 + arg3 > field1100) {
            arg3 = field1100 - arg0;
        }
        int var5 = field1095 * arg2 + arg0;
        if (!arg4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < arg3; var7++) {
            field1094[var5 + var7] = arg1;
        }
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "b", descriptor = "(IIIIII)V")
    public static void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1097 || arg0 >= field1098) {
            return;
        }
        if (arg1 < field1099) {
            arg2 -= field1099 - arg1;
            arg1 = field1099;
        }
        if (arg1 + arg2 > field1100) {
            arg2 = field1100 - arg1;
        }
        int var6 = 256 - arg4;
        int var7 = (arg5 >> 16 & 0xFF) * arg4;
        int var8 = (arg5 >> 8 & 0xFF) * arg4;
        int var9 = (arg5 & 0xFF) * arg4;
        int var10 = field1095 * arg0 + arg1;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1094[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1094[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1094[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1094[var10++] = var15;
        }
        if (arg3 != 1388) {
            field1090 = -36;
        }
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIZI)V")
    public static void method342(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3 || (arg0 < field1099 || arg0 >= field1100)) {
            return;
        }
        if (arg4 < field1097) {
            arg2 -= field1097 - arg4;
            arg4 = field1097;
        }
        if (arg2 + arg4 > field1098) {
            arg2 = field1098 - arg4;
        }
        int var5 = field1095 * arg4 + arg0;
        for (int var6 = 0; var6 < arg2; var6++) {
            field1094[field1095 * var6 + var5] = arg1;
        }
    }

    @OriginalMember(owner = "client!LFYNQWSZ", name = "c", descriptor = "(IIIIII)V")
    public static void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field1099 || arg2 >= field1100) {
            return;
        }
        if (arg1 < field1097) {
            arg4 -= field1097 - arg1;
            arg1 = field1097;
        }
        if (arg1 + arg4 > field1098) {
            arg4 = field1098 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg3 >> 16 & 0xFF) * arg5;
        int var8 = (arg3 >> 8 & 0xFF) * arg5;
        int var9 = (arg3 & 0xFF) * arg5;
        if (arg0 != 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = field1095 * arg1 + arg2;
        for (int var12 = 0; var12 < arg4; var12++) {
            int var13 = (field1094[var11] >> 16 & 0xFF) * var6;
            int var14 = (field1094[var11] >> 8 & 0xFF) * var6;
            int var15 = (field1094[var11] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field1094[var11] = var16;
            var11 += field1095;
        }
    }
}
