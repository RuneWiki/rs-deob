import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BDJXDJBP")
public class class5 extends class68 {

    @OriginalMember(owner = "client!BDJXDJBP", name = "j", descriptor = "I")
    private static int field57 = -21200;

    @OriginalMember(owner = "client!BDJXDJBP", name = "k", descriptor = "I")
    private static int field58 = 26030;

    @OriginalMember(owner = "client!BDJXDJBP", name = "l", descriptor = "I")
    private static int field59 = 11419;

    @OriginalMember(owner = "client!BDJXDJBP", name = "n", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!BDJXDJBP", name = "o", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!BDJXDJBP", name = "p", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!BDJXDJBP", name = "q", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!BDJXDJBP", name = "r", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!BDJXDJBP", name = "s", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!BDJXDJBP", name = "t", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!BDJXDJBP", name = "u", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!BDJXDJBP", name = "v", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!BDJXDJBP", name = "i", descriptor = "Z")
    private static boolean field56;

    @OriginalMember(owner = "client!BDJXDJBP", name = "w", descriptor = "Z")
    public static boolean field70;

    @OriginalMember(owner = "client!BDJXDJBP", name = "m", descriptor = "[I")
    public static int[] field60;

    @OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(II[IZ)V")
    public static void method24(int arg0, int arg1, int[] arg2, boolean arg3) {
        field60 = arg2;
        field61 = arg0;
        if (arg3) {
            field62 = arg1;
            method26(0, arg0, true, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(I)V")
    public static void method25(int arg0) {
        field65 = 0;
        field63 = 0;
        int var1 = 97 / arg0;
        field66 = field61;
        field64 = field62;
        field67 = field66 - 1;
        field68 = field66 / 2;
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIZII)V")
    public static void method26(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 > field61) {
            arg1 = field61;
        }
        if (arg3 > field62) {
            arg3 = field62;
        }
        field65 = arg4;
        field63 = arg0;
        field66 = arg1;
        if (arg2) {
            field64 = arg3;
            field67 = field66 - 1;
            field68 = field66 / 2;
            field69 = field64 / 2;
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "b", descriptor = "(I)V")
    public static void method27(int arg0) {
        int var1 = field62 * field61;
        int var2 = 82 / arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            field60[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIIBII)V")
    public static void method28(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg0 < field65) {
            arg1 -= field65 - arg0;
            arg0 = field65;
        }
        if (arg3 < field63) {
            arg5 -= field63 - arg3;
            arg3 = field63;
        }
        if (arg0 + arg1 > field66) {
            arg1 = field66 - arg0;
        }
        if (arg3 + arg5 > field64) {
            arg5 = field64 - arg3;
        }
        int var7 = 256 - arg6;
        int var8 = (arg2 >> 16 & 0xFF) * arg6;
        int var9 = (arg2 >> 8 & 0xFF) * arg6;
        int var10 = (arg2 & 0xFF) * arg6;
        int var11 = field61 - arg1;
        int var12 = field61 * arg3 + arg0;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = (field60[var12] >> 16 & 0xFF) * var7;
                int var16 = (field60[var12] >> 8 & 0xFF) * var7;
                int var17 = (field60[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field60[var12++] = var18;
            }
            var12 += var11;
        }
        if (arg4 == -6) {
            ;
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIIII)V")
    public static void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field65) {
            arg2 -= field65 - arg0;
            arg0 = field65;
        }
        if (arg4 < field63) {
            arg5 -= field63 - arg4;
            arg4 = field63;
        }
        if (arg0 + arg2 > field66) {
            arg2 = field66 - arg0;
        }
        if (arg4 + arg5 > field64) {
            arg5 = field64 - arg4;
        }
        int var6 = field61 - arg2;
        if (arg1 != 35224) {
            return;
        }
        int var7 = field61 * arg4 + arg0;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field60[var7++] = arg3;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "b", descriptor = "(IIIIII)V")
    public static void method30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method32(arg5, arg1, arg2, field57, arg0);
        method32(arg4 + arg5 - 1, arg1, arg2, field57, arg0);
        method34(607, arg1, arg5, arg2, arg4);
        if (arg3 != -41001) {
            field59 = -25;
        }
        method34(607, arg1, arg5, arg0 + arg2 - 1, arg4);
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIIIII)V")
    public static void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method33(arg3, arg0, arg1, 26030, arg6, arg4);
        method33(arg3 + arg5 - 1, arg0, arg1, 26030, arg6, arg4);
        if (arg5 >= 3) {
            method35(arg0, arg5 - 2, arg3 + 1, false, arg4, arg1);
            method35(arg0, arg5 - 2, arg3 + 1, false, arg4 + arg6 - 1, arg1);
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIII)V")
    public static void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -21200 || (arg0 < field63 || arg0 >= field64)) {
            return;
        }
        if (arg2 < field65) {
            arg4 -= field65 - arg2;
            arg2 = field65;
        }
        if (arg2 + arg4 > field66) {
            arg4 = field66 - arg2;
        }
        int var5 = field61 * arg0 + arg2;
        for (int var6 = 0; var6 < arg4; var6++) {
            field60[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "c", descriptor = "(IIIIII)V")
    public static void method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field63 || arg0 >= field64) {
            return;
        }
        if (arg5 < field65) {
            arg4 -= field65 - arg5;
            arg5 = field65;
        }
        if (arg4 + arg5 > field66) {
            arg4 = field66 - arg5;
        }
        int var6 = 256 - arg1;
        int var7 = (arg2 >> 16 & 0xFF) * arg1;
        int var8 = (arg2 >> 8 & 0xFF) * arg1;
        int var9 = (arg2 & 0xFF) * arg1;
        if (field58 != arg3) {
            field56 = !field56;
        }
        int var10 = field61 * arg0 + arg5;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field60[var10] >> 16 & 0xFF) * var6;
            int var13 = (field60[var10] >> 8 & 0xFF) * var6;
            int var14 = (field60[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field60[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "b", descriptor = "(IIIII)V")
    public static void method34(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < field65 || arg3 >= field66) {
            return;
        }
        if (arg2 < field63) {
            arg4 -= field63 - arg2;
            arg2 = field63;
        }
        if (arg2 + arg4 > field64) {
            arg4 = field64 - arg2;
        }
        int var5 = field61 * arg2 + arg3;
        if (arg0 > 0) {
            for (int var6 = 0; var6 < arg4; var6++) {
                field60[field61 * var6 + var5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIZII)V")
    public static void method35(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 < field65 || arg4 >= field66) {
            return;
        }
        if (arg2 < field63) {
            arg1 -= field63 - arg2;
            arg2 = field63;
        }
        if (arg1 + arg2 > field64) {
            arg1 = field64 - arg2;
        }
        int var6 = 256 - arg0;
        int var7 = (arg5 >> 16 & 0xFF) * arg0;
        int var8 = (arg5 >> 8 & 0xFF) * arg0;
        int var9 = (arg5 & 0xFF) * arg0;
        int var10 = field61 * arg2 + arg4;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field60[var10] >> 16 & 0xFF) * var6;
            int var13 = (field60[var10] >> 8 & 0xFF) * var6;
            int var14 = (field60[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field60[var10] = var15;
            var10 += field61;
        }
        if (arg3) {
            field59 = -70;
        }
    }
}
