import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ANTOHTCU")
public class class2 extends class64 {

    @OriginalMember(owner = "client!ANTOHTCU", name = "j", descriptor = "Z")
    private static boolean field53 = true;

    @OriginalMember(owner = "client!ANTOHTCU", name = "k", descriptor = "I")
    private static int field54 = -899;

    @OriginalMember(owner = "client!ANTOHTCU", name = "l", descriptor = "I")
    private static int field55 = -15334;

    @OriginalMember(owner = "client!ANTOHTCU", name = "o", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ANTOHTCU", name = "p", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ANTOHTCU", name = "q", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ANTOHTCU", name = "r", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ANTOHTCU", name = "s", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ANTOHTCU", name = "t", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ANTOHTCU", name = "u", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ANTOHTCU", name = "v", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ANTOHTCU", name = "w", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ANTOHTCU", name = "m", descriptor = "Z")
    private static boolean field56;

    @OriginalMember(owner = "client!ANTOHTCU", name = "x", descriptor = "Z")
    public static boolean field67;

    @OriginalMember(owner = "client!ANTOHTCU", name = "n", descriptor = "[I")
    public static int[] field57;

    @OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(II[IZ)V")
    public static void method12(int arg0, int arg1, int[] arg2, boolean arg3) {
        field57 = arg2;
        field58 = arg0;
        field59 = arg1;
        if (!arg3) {
            method14(arg0, 0, arg1, 0, 357);
        }
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(I)V")
    public static void method13(int arg0) {
        field62 = 0;
        field60 = 0;
        field63 = field58;
        if (field55 != arg0) {
            field53 = !field53;
        }
        field61 = field59;
        field64 = field63 - 1;
        field65 = field63 / 2;
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(IIIII)V")
    public static void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 > field58) {
            arg0 = field58;
        }
        if (arg2 > field59) {
            arg2 = field59;
        }
        field62 = arg3;
        field60 = arg1;
        field63 = arg0;
        if (arg4 <= 0) {
            field53 = !field53;
        }
        field61 = arg2;
        field64 = field63 - 1;
        field65 = field63 / 2;
        field66 = field61 / 2;
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(Z)V")
    public static void method15(boolean arg0) {
        if (arg0) {
            int var1 = field59 * field58;
            for (int var2 = 0; var2 < var1; var2++) {
                field57[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(IIIIZII)V")
    public static void method16(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 < field62) {
            arg2 -= field62 - arg0;
            arg0 = field62;
        }
        if (arg6 < field60) {
            arg3 -= field60 - arg6;
            arg6 = field60;
        }
        if (arg0 + arg2 > field63) {
            arg2 = field63 - arg0;
        }
        if (arg3 + arg6 > field61) {
            arg3 = field61 - arg6;
        }
        int var7 = 256 - arg1;
        int var8 = (arg5 >> 16 & 0xFF) * arg1;
        int var9 = (arg5 >> 8 & 0xFF) * arg1;
        int var10 = (arg5 & 0xFF) * arg1;
        if (arg4) {
            field54 = -486;
        }
        int var11 = field58 - arg2;
        int var12 = field58 * arg6 + arg0;
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (field57[var12] >> 16 & 0xFF) * var7;
                int var16 = (field57[var12] >> 8 & 0xFF) * var7;
                int var17 = (field57[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field57[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(IIIIII)V")
    public static void method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field62) {
            arg4 -= field62 - arg0;
            arg0 = field62;
        }
        if (arg1 < field60) {
            arg5 -= field60 - arg1;
            arg1 = field60;
        }
        if (arg0 + arg4 > field63) {
            arg4 = field63 - arg0;
        }
        if (arg1 + arg5 > field61) {
            arg5 = field61 - arg1;
        }
        int var6 = field58 - arg4;
        if (arg2 != -6771) {
            field55 = 351;
        }
        int var7 = field58 * arg1 + arg0;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field57[var7++] = arg3;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "b", descriptor = "(IIIIII)V")
    public static void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method20(arg1, 129, arg5, arg2, arg3);
        method20(arg1, 129, arg4 + arg5 - 1, arg2, arg3);
        method22(485, arg3, arg4, arg1, arg5);
        if (arg0 != 0) {
            field56 = !field56;
        }
        method22(485, arg3, arg4, arg1 + arg2 - 1, arg5);
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(ZIIIIII)V")
    public static void method19(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method21(arg3, arg5, false, arg6, arg4, arg1);
        if (!arg0) {
            return;
        }
        method21(arg3, arg5, false, arg2 + arg6 - 1, arg4, arg1);
        if (arg2 >= 3) {
            method23(30853, arg6 + 1, arg1, arg5, arg2 - 2, arg3);
            method23(30853, arg6 + 1, arg1 + arg4 - 1, arg5, arg2 - 2, arg3);
        }
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "b", descriptor = "(IIIII)V")
    public static void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 60 / arg1;
        if (arg2 < field60 || arg2 >= field61) {
            return;
        }
        if (arg0 < field62) {
            arg3 -= field62 - arg0;
            arg0 = field62;
        }
        if (arg0 + arg3 > field63) {
            arg3 = field63 - arg0;
        }
        int var6 = field58 * arg2 + arg0;
        for (int var7 = 0; var7 < arg3; var7++) {
            field57[var6 + var7] = arg4;
        }
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(IIZIII)V")
    public static void method21(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field60 || arg3 >= field61) {
            return;
        }
        if (arg5 < field62) {
            arg4 -= field62 - arg5;
            arg5 = field62;
        }
        if (arg4 + arg5 > field63) {
            arg4 = field63 - arg5;
        }
        int var6 = 256 - arg0;
        int var7 = (arg1 >> 16 & 0xFF) * arg0;
        int var8 = (arg1 >> 8 & 0xFF) * arg0;
        int var9 = (arg1 & 0xFF) * arg0;
        if (arg2) {
            field54 = -354;
        }
        int var10 = field58 * arg3 + arg5;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field57[var10] >> 16 & 0xFF) * var6;
            int var13 = (field57[var10] >> 8 & 0xFF) * var6;
            int var14 = (field57[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field57[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "c", descriptor = "(IIIII)V")
    public static void method22(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < field62 || arg3 >= field63) {
            return;
        }
        if (arg4 < field60) {
            arg2 -= field60 - arg4;
            arg4 = field60;
        }
        if (arg2 + arg4 > field61) {
            arg2 = field61 - arg4;
        }
        int var5 = field58 * arg4 + arg3;
        int var6 = 10 / arg0;
        for (int var7 = 0; var7 < arg2; var7++) {
            field57[field58 * var7 + var5] = arg1;
        }
    }

    @OriginalMember(owner = "client!ANTOHTCU", name = "c", descriptor = "(IIIIII)V")
    public static void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field62 || arg2 >= field63) {
            return;
        }
        if (arg1 < field60) {
            arg4 -= field60 - arg1;
            arg1 = field60;
        }
        if (arg1 + arg4 > field61) {
            arg4 = field61 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg3 >> 16 & 0xFF) * arg5;
        int var8 = (arg3 >> 8 & 0xFF) * arg5;
        int var9 = (arg3 & 0xFF) * arg5;
        if (arg0 != 30853) {
            field55 = -302;
        }
        int var10 = field58 * arg1 + arg2;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field57[var10] >> 16 & 0xFF) * var6;
            int var13 = (field57[var10] >> 8 & 0xFF) * var6;
            int var14 = (field57[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field57[var10] = var15;
            var10 += field58;
        }
    }
}
