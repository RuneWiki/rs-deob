import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FVBHOYJF")
public class class15 extends class37 {

    @OriginalMember(owner = "client!FVBHOYJF", name = "h", descriptor = "I")
    private static int field719 = -446;

    @OriginalMember(owner = "client!FVBHOYJF", name = "i", descriptor = "I")
    private static int field720 = 625;

    @OriginalMember(owner = "client!FVBHOYJF", name = "l", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!FVBHOYJF", name = "m", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!FVBHOYJF", name = "n", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!FVBHOYJF", name = "o", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!FVBHOYJF", name = "p", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!FVBHOYJF", name = "q", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!FVBHOYJF", name = "r", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!FVBHOYJF", name = "s", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!FVBHOYJF", name = "t", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!FVBHOYJF", name = "j", descriptor = "Z")
    private static boolean field721;

    @OriginalMember(owner = "client!FVBHOYJF", name = "u", descriptor = "Z")
    public static boolean field732;

    @OriginalMember(owner = "client!FVBHOYJF", name = "k", descriptor = "[I")
    public static int[] field722;

    @OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "([IIIB)V")
    public static void method209(int[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 0) {
            boolean var4 = false;
        } else {
            field720 = 194;
        }
        field722 = arg0;
        field723 = arg2;
        field724 = arg1;
        method211(0, 0, arg1, arg2, -39271);
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(I)V")
    public static void method210(int arg0) {
        if (arg0 != 9) {
            return;
        }
        field727 = 0;
        field725 = 0;
        field728 = field723;
        field726 = field724;
        field729 = field728 - 1;
        field730 = field728 / 2;
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIIII)V")
    public static void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 > field723) {
            arg3 = field723;
        }
        if (arg2 > field724) {
            arg2 = field724;
        }
        field727 = arg1;
        field725 = arg0;
        field728 = arg3;
        if (arg4 == -39271) {
            field726 = arg2;
            field729 = field728 - 1;
            field730 = field728 / 2;
            field731 = field726 / 2;
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(B)V")
    public static void method212(byte arg0) {
        if (arg0 != 0) {
            return;
        }
        boolean var1 = false;
        int var2 = field724 * field723;
        for (int var3 = 0; var3 < var2; var3++) {
            field722[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIIIIII)V")
    public static void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field727) {
            arg3 -= field727 - arg5;
            arg5 = field727;
        }
        if (arg2 < field725) {
            arg6 -= field725 - arg2;
            arg2 = field725;
        }
        if (arg3 + arg5 > field728) {
            arg3 = field728 - arg5;
        }
        if (arg2 + arg6 > field726) {
            arg6 = field726 - arg2;
        }
        int var7 = 256 - arg4;
        int var8 = (arg1 >> 16 & 0xFF) * arg4;
        int var9 = (arg1 >> 8 & 0xFF) * arg4;
        int var10 = (arg1 & 0xFF) * arg4;
        int var11 = field723 - arg3;
        int var12 = field723 * arg2 + arg5;
        while (arg0 >= 0) {
            field720 = 68;
        }
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = (field722[var12] >> 16 & 0xFF) * var7;
                int var16 = (field722[var12] >> 8 & 0xFF) * var7;
                int var17 = (field722[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field722[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIIIII)V")
    public static void method214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field727) {
            arg5 -= field727 - arg3;
            arg3 = field727;
        }
        if (arg4 < field725) {
            arg2 -= field725 - arg4;
            arg4 = field725;
        }
        if (arg3 + arg5 > field728) {
            arg5 = field728 - arg3;
        }
        if (arg2 + arg4 > field726) {
            arg2 = field726 - arg4;
        }
        int var6 = field723 - arg5;
        if (arg1 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = field723 * arg4 + arg3;
        for (int var9 = -arg2; var9 < 0; var9++) {
            for (int var10 = -arg5; var10 < 0; var10++) {
                field722[var8++] = arg0;
            }
            var8 += var6;
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "b", descriptor = "(IIIIII)V")
    public static void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method217(arg5, arg4, -368, arg2, arg3);
        method217(arg5, arg0 + arg4 - 1, -368, arg2, arg3);
        method219(arg4, arg0, (byte) 81, arg5, arg2);
        method219(arg4, arg0, (byte) 81, arg3 + arg5 - 1, arg2);
        if (arg1 <= 0) {
            field721 = !field721;
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIIIIIB)V")
    public static void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != -16) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method218(arg1, arg0, arg4, 0, arg2, arg5);
        method218(arg1, arg0, arg4, 0, arg2, arg3 + arg5 - 1);
        if (arg3 >= 3) {
            method220(arg2, arg5 + 1, arg0, arg3 - 2, arg1, -142);
            method220(arg2, arg5 + 1, arg0 + arg4 - 1, arg3 - 2, arg1, -142);
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "b", descriptor = "(IIIII)V")
    public static void method217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field725 || arg1 >= field726) {
            return;
        }
        if (arg0 < field727) {
            arg4 -= field727 - arg0;
            arg0 = field727;
        }
        if (arg0 + arg4 > field728) {
            arg4 = field728 - arg0;
        }
        int var5 = field723 * arg1 + arg0;
        while (arg2 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var6 = 0; var6 < arg4; var6++) {
            field722[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "c", descriptor = "(IIIIII)V")
    public static void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field725 || arg5 >= field726) {
            return;
        }
        if (arg1 < field727) {
            arg2 -= field727 - arg1;
            arg1 = field727;
        }
        if (arg1 + arg2 > field728) {
            arg2 = field728 - arg1;
        }
        int var6 = 256 - arg4;
        if (arg3 != 0) {
            return;
        }
        int var7 = (arg0 >> 16 & 0xFF) * arg4;
        int var8 = (arg0 >> 8 & 0xFF) * arg4;
        int var9 = (arg0 & 0xFF) * arg4;
        int var10 = field723 * arg5 + arg1;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field722[var10] >> 16 & 0xFF) * var6;
            int var13 = (field722[var10] >> 8 & 0xFF) * var6;
            int var14 = (field722[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field722[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIBII)V")
    public static void method219(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 81) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg3 < field727 || arg3 >= field728) {
            return;
        }
        if (arg0 < field725) {
            arg1 -= field725 - arg0;
            arg0 = field725;
        }
        if (arg0 + arg1 > field726) {
            arg1 = field726 - arg0;
        }
        int var6 = field723 * arg0 + arg3;
        for (int var7 = 0; var7 < arg1; var7++) {
            field722[field723 * var7 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "client!FVBHOYJF", name = "d", descriptor = "(IIIIII)V")
    public static void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= 0 || (arg2 < field727 || arg2 >= field728)) {
            return;
        }
        if (arg1 < field725) {
            arg3 -= field725 - arg1;
            arg1 = field725;
        }
        if (arg1 + arg3 > field726) {
            arg3 = field726 - arg1;
        }
        int var6 = 256 - arg0;
        int var7 = (arg4 >> 16 & 0xFF) * arg0;
        int var8 = (arg4 >> 8 & 0xFF) * arg0;
        int var9 = (arg4 & 0xFF) * arg0;
        int var10 = field723 * arg1 + arg2;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field722[var10] >> 16 & 0xFF) * var6;
            int var13 = (field722[var10] >> 8 & 0xFF) * var6;
            int var14 = (field722[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field722[var10] = var15;
            var10 += field723;
        }
    }
}
