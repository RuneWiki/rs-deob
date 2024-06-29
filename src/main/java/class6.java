import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BAXODNVH")
public class class6 extends class26 {

    @OriginalMember(owner = "client!BAXODNVH", name = "i", descriptor = "I")
    private static int field43 = 859;

    @OriginalMember(owner = "client!BAXODNVH", name = "j", descriptor = "I")
    private static int field44 = -34531;

    @OriginalMember(owner = "client!BAXODNVH", name = "k", descriptor = "I")
    private static int field45 = -34531;

    @OriginalMember(owner = "client!BAXODNVH", name = "m", descriptor = "I")
    private static int field47 = -794;

    @OriginalMember(owner = "client!BAXODNVH", name = "o", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!BAXODNVH", name = "p", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!BAXODNVH", name = "q", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!BAXODNVH", name = "r", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!BAXODNVH", name = "s", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!BAXODNVH", name = "t", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!BAXODNVH", name = "u", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!BAXODNVH", name = "v", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!BAXODNVH", name = "w", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!BAXODNVH", name = "l", descriptor = "Z")
    private static boolean field46;

    @OriginalMember(owner = "client!BAXODNVH", name = "x", descriptor = "Z")
    public static boolean field58;

    @OriginalMember(owner = "client!BAXODNVH", name = "n", descriptor = "[I")
    public static int[] field48;

    @OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(I[IIB)V")
    public static void method17(int arg0, int[] arg1, int arg2, byte arg3) {
        field48 = arg1;
        field49 = arg0;
        field50 = arg2;
        method19(-180, 0, arg2, arg0, 0);
        if (arg3 == 67) {
            ;
        }
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(I)V")
    public static void method18(int arg0) {
        field53 = 0;
        if (arg0 >= 0) {
            field46 = !field46;
        }
        field51 = 0;
        field54 = field49;
        field52 = field50;
        field55 = field54 - 1;
        field56 = field54 / 2;
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IIIII)V")
    public static void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > field49) {
            arg3 = field49;
        }
        if (arg2 > field50) {
            arg2 = field50;
        }
        field53 = arg4;
        if (arg0 >= 0) {
            return;
        }
        field51 = arg1;
        field54 = arg3;
        field52 = arg2;
        field55 = field54 - 1;
        field56 = field54 / 2;
        field57 = field52 / 2;
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "b", descriptor = "(I)V")
    public static void method20(int arg0) {
        if (arg0 == 12847) {
            int var1 = field50 * field49;
            for (int var2 = 0; var2 < var1; var2++) {
                field48[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IZIIIII)V")
    public static void method21(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field53) {
            arg2 -= field53 - arg5;
            arg5 = field53;
        }
        if (arg3 < field51) {
            arg4 -= field51 - arg3;
            arg3 = field51;
        }
        if (arg2 + arg5 > field54) {
            arg2 = field54 - arg5;
        }
        if (arg3 + arg4 > field52) {
            arg4 = field52 - arg3;
        }
        int var7 = 256 - arg0;
        int var8 = (arg6 >> 16 & 0xFF) * arg0;
        int var9 = (arg6 >> 8 & 0xFF) * arg0;
        int var10 = (arg6 & 0xFF) * arg0;
        int var11 = field49 - arg2;
        int var12 = field49 * arg3 + arg5;
        if (arg1) {
            field47 = -394;
        }
        for (int var13 = 0; var13 < arg4; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (field48[var12] >> 16 & 0xFF) * var7;
                int var16 = (field48[var12] >> 8 & 0xFF) * var7;
                int var17 = (field48[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field48[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IIIIII)V")
    public static void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -16614) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg2 < field53) {
            arg0 -= field53 - arg2;
            arg2 = field53;
        }
        if (arg5 < field51) {
            arg3 -= field51 - arg5;
            arg5 = field51;
        }
        if (arg0 + arg2 > field54) {
            arg0 = field54 - arg2;
        }
        if (arg3 + arg5 > field52) {
            arg3 = field52 - arg5;
        }
        int var7 = field49 - arg0;
        int var8 = field49 * arg5 + arg2;
        for (int var9 = -arg3; var9 < 0; var9++) {
            for (int var10 = -arg0; var10 < 0; var10++) {
                field48[var8++] = arg4;
            }
            var8 += var7;
        }
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "b", descriptor = "(IIIIII)V")
    public static void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method25(arg1, arg3, arg2, 31754, arg5);
        method25(arg1, arg3, arg2, 31754, arg0 + arg5 - 1);
        method27(arg0, field44, arg3, arg5, arg2);
        method27(arg0, field44, arg1 + arg3 - 1, arg5, arg2);
        int var6 = 20 / arg4;
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IIIIIIZ)V")
    public static void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        method26(arg1, 27015, arg3, arg5, arg4, arg0);
        if (arg6) {
            field47 = -288;
        }
        method26(arg1 + arg2 - 1, 27015, arg3, arg5, arg4, arg0);
        if (arg2 >= 3) {
            method28(arg3, arg5, (byte) -119, arg2 - 2, arg4, arg1 + 1);
            method28(arg3, arg5, (byte) -119, arg2 - 2, arg0 + arg4 - 1, arg1 + 1);
        }
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "b", descriptor = "(IIIII)V")
    public static void method25(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field51 || arg4 >= field52) {
            return;
        }
        if (arg1 < field53) {
            arg0 -= field53 - arg1;
            arg1 = field53;
        }
        if (arg0 + arg1 > field54) {
            arg0 = field54 - arg1;
        }
        int var5 = field49 * arg4 + arg1;
        if (arg3 != 31754) {
            field46 = !field46;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            field48[var5 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "c", descriptor = "(IIIIII)V")
    public static void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field51 || arg0 >= field52) {
            return;
        }
        if (arg4 < field53) {
            arg5 -= field53 - arg4;
            arg4 = field53;
        }
        if (arg4 + arg5 > field54) {
            arg5 = field54 - arg4;
        }
        int var6 = 256 - arg3;
        int var7 = (arg2 >> 16 & 0xFF) * arg3;
        int var8 = (arg2 >> 8 & 0xFF) * arg3;
        int var9 = (arg2 & 0xFF) * arg3;
        int var10 = field49 * arg0 + arg4;
        if (arg1 != 27015) {
            return;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field48[var10] >> 16 & 0xFF) * var6;
            int var13 = (field48[var10] >> 8 & 0xFF) * var6;
            int var14 = (field48[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field48[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "c", descriptor = "(IIIII)V")
    public static void method27(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field53 || arg2 >= field54) {
            return;
        }
        if (arg3 < field51) {
            arg0 -= field51 - arg3;
            arg3 = field51;
        }
        if (arg0 + arg3 > field52) {
            arg0 = field52 - arg3;
        }
        int var5 = field49 * arg3 + arg2;
        if (field45 == arg1) {
            for (int var6 = 0; var6 < arg0; var6++) {
                field48[field49 * var6 + var5] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IIBIII)V")
    public static void method28(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field53 || arg4 >= field54) {
            return;
        }
        if (arg5 < field51) {
            arg3 -= field51 - arg5;
            arg5 = field51;
        }
        if (arg3 + arg5 > field52) {
            arg3 = field52 - arg5;
        }
        int var6 = 256 - arg1;
        int var7 = (arg0 >> 16 & 0xFF) * arg1;
        int var8 = (arg0 >> 8 & 0xFF) * arg1;
        int var9 = (arg0 & 0xFF) * arg1;
        if (arg2 != -119) {
            field46 = !field46;
        }
        int var10 = field49 * arg5 + arg4;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field48[var10] >> 16 & 0xFF) * var6;
            int var13 = (field48[var10] >> 8 & 0xFF) * var6;
            int var14 = (field48[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field48[var10] = var15;
            var10 += field49;
        }
    }
}
