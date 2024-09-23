import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IFHRXNFO")
public class class26 extends class8 {

    @OriginalMember(owner = "IFHRXNFO", name = "j", descriptor = "I")
    private static int field873 = -548;

    @OriginalMember(owner = "IFHRXNFO", name = "k", descriptor = "I")
    private static int field874 = 745;

    @OriginalMember(owner = "IFHRXNFO", name = "i", descriptor = "I")
    private static int field872;

    @OriginalMember(owner = "IFHRXNFO", name = "n", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "IFHRXNFO", name = "o", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "IFHRXNFO", name = "p", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "IFHRXNFO", name = "q", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "IFHRXNFO", name = "r", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "IFHRXNFO", name = "s", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "IFHRXNFO", name = "t", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "IFHRXNFO", name = "u", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "IFHRXNFO", name = "v", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "IFHRXNFO", name = "h", descriptor = "Z")
    private static boolean field871;

    @OriginalMember(owner = "IFHRXNFO", name = "l", descriptor = "Z")
    private static boolean field875;

    @OriginalMember(owner = "IFHRXNFO", name = "w", descriptor = "Z")
    public static boolean field886;

    @OriginalMember(owner = "IFHRXNFO", name = "m", descriptor = "[I")
    public static int[] field876;

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(I[III)V")
    public static void method310(int arg0, int[] arg1, int arg2, int arg3) {
        field876 = arg1;
        field877 = arg3;
        field878 = arg0;
        method312(arg3, arg0, 0, field872, 0);
        if (arg2 != 6821) {
            field872 = 209;
        }
    }

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(B)V")
    public static void method311(byte arg0) {
        field881 = 0;
        field879 = 0;
        field882 = field877;
        field880 = field878;
        field883 = field882 - 1;
        if (arg0 != 2) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field884 = field882 / 2;
    }

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(IIIII)V")
    public static void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 > field877) {
            arg0 = field877;
        }
        if (arg1 > field878) {
            arg1 = field878;
        }
        field881 = arg2;
        field879 = arg4;
        field882 = arg0;
        if (arg3 != 0) {
            field875 = true;
        }
        field880 = arg1;
        field883 = field882 - 1;
        field884 = field882 / 2;
        field885 = field880 / 2;
    }

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(I)V")
    public static void method313(int arg0) {
        int var1 = field878 * field877;
        if (arg0 > 0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field876[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(IZIIIII)V")
    public static void method314(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < field881) {
            arg5 -= field881 - arg2;
            arg2 = field881;
        }
        if (arg4 < field879) {
            arg0 -= field879 - arg4;
            arg4 = field879;
        }
        if (arg2 + arg5 > field882) {
            arg5 = field882 - arg2;
        }
        if (arg0 + arg4 > field880) {
            arg0 = field880 - arg4;
        }
        int var7 = 256 - arg3;
        int var8 = (arg6 >> 16 & 0xFF) * arg3;
        int var9 = (arg6 >> 8 & 0xFF) * arg3;
        int var10 = (arg6 & 0xFF) * arg3;
        int var11 = field877 - arg5;
        if (arg1) {
            return;
        }
        int var12 = field877 * arg4 + arg2;
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = (field876[var12] >> 16 & 0xFF) * var7;
                int var16 = (field876[var12] >> 8 & 0xFF) * var7;
                int var17 = (field876[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field876[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(IIIIII)V")
    public static void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 73 / arg2;
        if (arg1 < field881) {
            arg3 -= field881 - arg1;
            arg1 = field881;
        }
        if (arg5 < field879) {
            arg4 -= field879 - arg5;
            arg5 = field879;
        }
        if (arg1 + arg3 > field882) {
            arg3 = field882 - arg1;
        }
        if (arg4 + arg5 > field880) {
            arg4 = field880 - arg5;
        }
        int var7 = field877 - arg3;
        int var8 = field877 * arg5 + arg1;
        for (int var9 = -arg4; var9 < 0; var9++) {
            for (int var10 = -arg3; var10 < 0; var10++) {
                field876[var8++] = arg0;
            }
            var8 += var7;
        }
    }

    @OriginalMember(owner = "IFHRXNFO", name = "b", descriptor = "(IIIIII)V")
    public static void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        while (arg3 >= 0) {
        }
        method318(arg1, arg0, arg2, -548, arg5);
        method318(arg1, arg0 + arg4 - 1, arg2, -548, arg5);
        method320(arg2, -83, arg5, arg0, arg4);
        method320(arg1 + arg2 - 1, -83, arg5, arg0, arg4);
    }

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(IIIIIII)V")
    public static void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            field872 = 309;
        }
        method319(arg5, arg1, (byte) -12, arg4, arg3, arg0);
        method319(arg5, arg1, (byte) -12, arg4 + arg6 - 1, arg3, arg0);
        if (arg6 >= 3) {
            method321((byte) 5, arg5, arg3, arg6 - 2, arg1, arg4 + 1);
            method321((byte) 5, arg5, arg0 + arg3 - 1, arg6 - 2, arg1, arg4 + 1);
        }
    }

    @OriginalMember(owner = "IFHRXNFO", name = "b", descriptor = "(IIIII)V")
    public static void method318(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= 0 || (arg1 < field879 || arg1 >= field880)) {
            return;
        }
        if (arg2 < field881) {
            arg0 -= field881 - arg2;
            arg2 = field881;
        }
        if (arg0 + arg2 > field882) {
            arg0 = field882 - arg2;
        }
        int var5 = field877 * arg1 + arg2;
        for (int var6 = 0; var6 < arg0; var6++) {
            field876[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(IIBIII)V")
    public static void method319(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field879 || arg3 >= field880) {
            return;
        }
        if (arg4 < field881) {
            arg5 -= field881 - arg4;
            arg4 = field881;
        }
        if (arg4 + arg5 > field882) {
            arg5 = field882 - arg4;
        }
        int var6 = 256 - arg0;
        int var7 = (arg1 >> 16 & 0xFF) * arg0;
        int var8 = (arg1 >> 8 & 0xFF) * arg0;
        int var9 = (arg1 & 0xFF) * arg0;
        int var10 = field877 * arg3 + arg4;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var13 = (field876[var10] >> 16 & 0xFF) * var6;
            int var14 = (field876[var10] >> 8 & 0xFF) * var6;
            int var15 = (field876[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field876[var10++] = var16;
        }
        if (arg2 != -12) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
    }

    @OriginalMember(owner = "IFHRXNFO", name = "c", descriptor = "(IIIII)V")
    public static void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= 0) {
            field871 = !field871;
        }
        if (arg0 < field881 || arg0 >= field882) {
            return;
        }
        if (arg3 < field879) {
            arg4 -= field879 - arg3;
            arg3 = field879;
        }
        if (arg3 + arg4 > field880) {
            arg4 = field880 - arg3;
        }
        int var5 = field877 * arg3 + arg0;
        for (int var6 = 0; var6 < arg4; var6++) {
            field876[field877 * var6 + var5] = arg2;
        }
    }

    @OriginalMember(owner = "IFHRXNFO", name = "a", descriptor = "(BIIIII)V")
    public static void method321(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field881 || arg2 >= field882) {
            return;
        }
        if (arg5 < field879) {
            arg3 -= field879 - arg5;
            arg5 = field879;
        }
        if (arg3 + arg5 > field880) {
            arg3 = field880 - arg5;
        }
        int var6 = 256 - arg1;
        int var7 = (arg4 >> 16 & 0xFF) * arg1;
        int var8 = (arg4 >> 8 & 0xFF) * arg1;
        int var9 = (arg4 & 0xFF) * arg1;
        int var10 = field877 * arg5 + arg2;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var13 = (field876[var10] >> 16 & 0xFF) * var6;
            int var14 = (field876[var10] >> 8 & 0xFF) * var6;
            int var15 = (field876[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field876[var10] = var16;
            var10 += field877;
        }
        if (arg0 == 5) {
            boolean var12 = false;
        }
    }
}
