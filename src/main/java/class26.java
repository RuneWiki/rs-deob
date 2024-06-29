import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IBBQNXJX")
public class class26 extends class33 {

    @OriginalMember(owner = "client!IBBQNXJX", name = "j", descriptor = "I")
    private static int field912 = 37470;

    @OriginalMember(owner = "client!IBBQNXJX", name = "k", descriptor = "I")
    private static int field913 = -76;

    @OriginalMember(owner = "client!IBBQNXJX", name = "l", descriptor = "I")
    private static int field914 = 252;

    @OriginalMember(owner = "client!IBBQNXJX", name = "m", descriptor = "I")
    private static int field915 = 506;

    @OriginalMember(owner = "client!IBBQNXJX", name = "n", descriptor = "I")
    private static int field916 = -340;

    @OriginalMember(owner = "client!IBBQNXJX", name = "p", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!IBBQNXJX", name = "q", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!IBBQNXJX", name = "r", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!IBBQNXJX", name = "s", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!IBBQNXJX", name = "t", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!IBBQNXJX", name = "u", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!IBBQNXJX", name = "v", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!IBBQNXJX", name = "w", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!IBBQNXJX", name = "x", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!IBBQNXJX", name = "i", descriptor = "Z")
    private static boolean field911;

    @OriginalMember(owner = "client!IBBQNXJX", name = "y", descriptor = "Z")
    public static boolean field927;

    @OriginalMember(owner = "client!IBBQNXJX", name = "o", descriptor = "[I")
    public static int[] field917;

    @OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "([IIII)V")
    public static void method251(int[] arg0, int arg1, int arg2, int arg3) {
        while (arg3 >= 0) {
            field916 = -122;
        }
        field917 = arg0;
        field918 = arg1;
        field919 = arg2;
        method253(-76, 0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(I)V")
    public static void method252(int arg0) {
        if (arg0 <= 0) {
            field912 = -148;
        }
        field922 = 0;
        field920 = 0;
        field923 = field918;
        field921 = field919;
        field924 = field923 - 1;
        field925 = field923 / 2;
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIII)V")
    public static void method253(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > field918) {
            arg3 = field918;
        }
        if (arg4 > field919) {
            arg4 = field919;
        }
        field922 = arg2;
        field920 = arg1;
        field923 = arg3;
        if (arg0 >= 0) {
            field912 = -264;
        }
        field921 = arg4;
        field924 = field923 - 1;
        field925 = field923 / 2;
        field926 = field921 / 2;
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "b", descriptor = "(I)V")
    public static void method254(int arg0) {
        int var1 = field919 * field918;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field917[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIIIII)V")
    public static void method255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < field922) {
            arg1 -= field922 - arg6;
            arg6 = field922;
        }
        if (arg4 < field920) {
            arg3 -= field920 - arg4;
            arg4 = field920;
        }
        if (arg1 + arg6 > field923) {
            arg1 = field923 - arg6;
        }
        if (arg3 + arg4 > field921) {
            arg3 = field921 - arg4;
        }
        int var7 = 256 - arg2;
        int var8 = (arg0 >> 16 & 0xFF) * arg2;
        int var9 = (arg0 >> 8 & 0xFF) * arg2;
        int var10 = (arg0 & 0xFF) * arg2;
        int var11 = 61 / arg5;
        int var12 = field918 - arg1;
        int var13 = field918 * arg4 + arg6;
        for (int var14 = 0; var14 < arg3; var14++) {
            for (int var15 = -arg1; var15 < 0; var15++) {
                int var16 = (field917[var13] >> 16 & 0xFF) * var7;
                int var17 = (field917[var13] >> 8 & 0xFF) * var7;
                int var18 = (field917[var13] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field917[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIIIB)V")
    public static void method256(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg0 < field922) {
            arg1 -= field922 - arg0;
            arg0 = field922;
        }
        if (arg2 < field920) {
            arg4 -= field920 - arg2;
            arg2 = field920;
        }
        if (arg0 + arg1 > field923) {
            arg1 = field923 - arg0;
        }
        if (arg2 + arg4 > field921) {
            arg4 = field921 - arg2;
        }
        int var6 = field918 - arg1;
        if (arg5 != 127) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = field918 * arg2 + arg0;
        for (int var9 = -arg4; var9 < 0; var9++) {
            for (int var10 = -arg1; var10 < 0; var10++) {
                field917[var8++] = arg3;
            }
            var8 += var6;
        }
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIIII)V")
    public static void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method259(arg3, arg0, arg1, arg4, (byte) 3);
        method259(arg3, arg0, arg1 + arg2 - 1, arg4, (byte) 3);
        int var6 = 52 / arg5;
        method261(arg2, arg1, arg0, 1, arg4);
        method261(arg2, arg1, arg0 + arg3 - 1, 1, arg4);
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "b", descriptor = "(IIIIIII)V")
    public static void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method260(arg0, 506, arg6, arg3, arg2, arg1);
        method260(arg0, 506, arg6, arg3, arg2, arg1 + arg5 - 1);
        if (arg4 >= 0 && arg4 <= 0 && arg5 >= 3) {
            method262(arg3, arg1 + 1, arg5 - 2, (byte) 5, arg6, arg0);
            method262(arg3, arg1 + 1, arg5 - 2, (byte) 5, arg2 + arg6 - 1, arg0);
        }
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIIB)V")
    public static void method259(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg2 < field920 || arg2 >= field921) {
            return;
        }
        if (arg1 < field922) {
            arg0 -= field922 - arg1;
            arg1 = field922;
        }
        if (arg0 + arg1 > field923) {
            arg0 = field923 - arg1;
        }
        int var5 = field918 * arg2 + arg1;
        if (arg4 == 3) {
            boolean var6 = false;
            for (int var7 = 0; var7 < arg0; var7++) {
                field917[var5 + var7] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "b", descriptor = "(IIIIII)V")
    public static void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field920 || arg5 >= field921) {
            return;
        }
        if (arg2 < field922) {
            arg4 -= field922 - arg2;
            arg2 = field922;
        }
        if (arg2 + arg4 > field923) {
            arg4 = field923 - arg2;
        }
        int var6 = 256 - arg0;
        int var7 = (arg3 >> 16 & 0xFF) * arg0;
        int var8 = (arg3 >> 8 & 0xFF) * arg0;
        int var9 = (arg3 & 0xFF) * arg0;
        if (arg1 <= 0) {
            field911 = !field911;
        }
        int var10 = field918 * arg5 + arg2;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field917[var10] >> 16 & 0xFF) * var6;
            int var13 = (field917[var10] >> 8 & 0xFF) * var6;
            int var14 = (field917[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field917[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "b", descriptor = "(IIIII)V")
    public static void method261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 1 || arg3 > 1 || (arg2 < field922 || arg2 >= field923)) {
            return;
        }
        if (arg1 < field920) {
            arg0 -= field920 - arg1;
            arg1 = field920;
        }
        if (arg0 + arg1 > field921) {
            arg0 = field921 - arg1;
        }
        int var5 = field918 * arg1 + arg2;
        for (int var6 = 0; var6 < arg0; var6++) {
            field917[field918 * var6 + var5] = arg4;
        }
    }

    @OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIBII)V")
    public static void method262(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg4 < field922 || arg4 >= field923) {
            return;
        }
        if (arg1 < field920) {
            arg2 -= field920 - arg1;
            arg1 = field920;
        }
        if (arg1 + arg2 > field921) {
            arg2 = field921 - arg1;
        }
        int var6 = 256 - arg5;
        if (arg3 != 5) {
            return;
        }
        boolean var7 = false;
        int var8 = (arg0 >> 16 & 0xFF) * arg5;
        int var9 = (arg0 >> 8 & 0xFF) * arg5;
        int var10 = (arg0 & 0xFF) * arg5;
        int var11 = field918 * arg1 + arg4;
        for (int var12 = 0; var12 < arg2; var12++) {
            int var13 = (field917[var11] >> 16 & 0xFF) * var6;
            int var14 = (field917[var11] >> 8 & 0xFF) * var6;
            int var15 = (field917[var11] & 0xFF) * var6;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field917[var11] = var16;
            var11 += field918;
        }
    }
}
