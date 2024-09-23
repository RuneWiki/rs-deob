import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JJCVVTJN")
public class class23 extends class68 {

    @OriginalMember(owner = "JJCVVTJN", name = "h", descriptor = "I")
    private static int field778 = -548;

    @OriginalMember(owner = "JJCVVTJN", name = "i", descriptor = "B")
    private static byte field779 = 3;

    @OriginalMember(owner = "JJCVVTJN", name = "k", descriptor = "I")
    private static int field781 = 1;

    @OriginalMember(owner = "JJCVVTJN", name = "m", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "JJCVVTJN", name = "n", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "JJCVVTJN", name = "o", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "JJCVVTJN", name = "p", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "JJCVVTJN", name = "q", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "JJCVVTJN", name = "r", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "JJCVVTJN", name = "s", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "JJCVVTJN", name = "t", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "JJCVVTJN", name = "u", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "JJCVVTJN", name = "j", descriptor = "Z")
    private static boolean field780;

    @OriginalMember(owner = "JJCVVTJN", name = "v", descriptor = "Z")
    public static boolean field792;

    @OriginalMember(owner = "JJCVVTJN", name = "l", descriptor = "[I")
    public static int[] field782;

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IIZ[I)V")
    public static void method253(int arg0, int arg1, boolean arg2, int[] arg3) {
        field782 = arg3;
        field783 = arg1;
        if (arg2) {
            field784 = arg0;
            method255(arg0, 0, arg1, 0, false);
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(B)V")
    public static void method254(byte arg0) {
        field787 = 0;
        field785 = 0;
        field788 = field783;
        field786 = field784;
        field789 = field788 - 1;
        field790 = field788 / 2;
        if (field779 != arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IIIIZ)V")
    public static void method255(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field783) {
            arg2 = field783;
        }
        if (arg0 > field784) {
            arg0 = field784;
        }
        field787 = arg3;
        field785 = arg1;
        field788 = arg2;
        field786 = arg0;
        field789 = field788 - 1;
        if (arg4) {
            field778 = -83;
        }
        field790 = field788 / 2;
        field791 = field786 / 2;
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(I)V")
    public static void method256(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            field780 = !field780;
        }
        int var1 = field784 * field783;
        for (int var2 = 0; var2 < var1; var2++) {
            field782[var2] = 0;
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IIIBIII)V")
    public static void method257(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field787) {
            arg1 -= field787 - arg5;
            arg5 = field787;
        }
        if (arg2 < field785) {
            arg6 -= field785 - arg2;
            arg2 = field785;
        }
        if (arg1 + arg5 > field788) {
            arg1 = field788 - arg5;
        }
        if (arg2 + arg6 > field786) {
            arg6 = field786 - arg2;
        }
        int var7 = 256 - arg0;
        int var8 = (arg4 >> 16 & 0xFF) * arg0;
        int var9 = (arg4 >> 8 & 0xFF) * arg0;
        int var10 = (arg4 & 0xFF) * arg0;
        int var11 = field783 - arg1;
        int var12 = field783 * arg2 + arg5;
        if (arg3 != -58) {
            return;
        }
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = (field782[var12] >> 16 & 0xFF) * var7;
                int var16 = (field782[var12] >> 8 & 0xFF) * var7;
                int var17 = (field782[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field782[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IBIIII)V")
    public static void method258(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field787) {
            arg0 -= field787 - arg2;
            arg2 = field787;
        }
        if (arg4 < field785) {
            arg5 -= field785 - arg4;
            arg4 = field785;
        }
        if (arg0 + arg2 > field788) {
            arg0 = field788 - arg2;
        }
        if (arg4 + arg5 > field786) {
            arg5 = field786 - arg4;
        }
        int var6 = field783 - arg0;
        int var7 = field783 * arg4 + arg2;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var10 = -arg0; var10 < 0; var10++) {
                field782[var7++] = arg3;
            }
            var7 += var6;
        }
        if (arg1 != -33) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IIIZII)V")
    public static void method259(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        method261(arg2, (byte) 6, arg0, arg5, arg1);
        method261(arg2, (byte) 6, arg0, arg5, arg1 + arg4 - 1);
        method263(arg4, (byte) -83, arg2, arg1, arg0);
        method263(arg4, (byte) -83, arg2, arg1, arg0 + arg5 - 1);
        if (arg3) {
            field781 = 50;
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IIIIIII)V")
    public static void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 7 || arg1 > 7) {
            field781 = 424;
        }
        method262(arg5, arg3, arg0, arg6, 0, arg4);
        method262(arg5, arg3, arg0 + arg2 - 1, arg6, 0, arg4);
        if (arg2 >= 3) {
            method264(arg3, arg6, arg0 + 1, arg5, false, arg2 - 2);
            method264(arg3, arg6, arg0 + 1, arg4 + arg5 - 1, false, arg2 - 2);
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IBIII)V")
    public static void method261(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field785 || arg4 >= field786) {
            return;
        }
        if (arg2 < field787) {
            arg3 -= field787 - arg2;
            arg2 = field787;
        }
        if (arg2 + arg3 > field788) {
            arg3 = field788 - arg2;
        }
        int var5 = field783 * arg4 + arg2;
        if (arg1 == 6) {
            for (int var6 = 0; var6 < arg3; var6++) {
                field782[var5 + var6] = arg0;
            }
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IIIIII)V")
    public static void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field785 || arg2 >= field786) {
            return;
        }
        if (arg0 < field787) {
            arg5 -= field787 - arg0;
            arg0 = field787;
        }
        if (arg0 + arg5 > field788) {
            arg5 = field788 - arg0;
        }
        int var6 = 256 - arg1;
        if (arg4 != 0) {
            field778 = 219;
        }
        int var7 = (arg3 >> 16 & 0xFF) * arg1;
        int var8 = (arg3 >> 8 & 0xFF) * arg1;
        int var9 = (arg3 & 0xFF) * arg1;
        int var10 = field783 * arg2 + arg0;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field782[var10] >> 16 & 0xFF) * var6;
            int var13 = (field782[var10] >> 8 & 0xFF) * var6;
            int var14 = (field782[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field782[var10++] = var15;
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "b", descriptor = "(IBIII)V")
    public static void method263(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -83) {
            field781 = 182;
        }
        if (arg4 < field787 || arg4 >= field788) {
            return;
        }
        if (arg3 < field785) {
            arg0 -= field785 - arg3;
            arg3 = field785;
        }
        if (arg0 + arg3 > field786) {
            arg0 = field786 - arg3;
        }
        int var5 = field783 * arg3 + arg4;
        for (int var6 = 0; var6 < arg0; var6++) {
            field782[field783 * var6 + var5] = arg2;
        }
    }

    @OriginalMember(owner = "JJCVVTJN", name = "a", descriptor = "(IIIIZI)V")
    public static void method264(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4 || (arg3 < field787 || arg3 >= field788)) {
            return;
        }
        if (arg2 < field785) {
            arg5 -= field785 - arg2;
            arg2 = field785;
        }
        if (arg2 + arg5 > field786) {
            arg5 = field786 - arg2;
        }
        int var6 = 256 - arg0;
        int var7 = (arg1 >> 16 & 0xFF) * arg0;
        int var8 = (arg1 >> 8 & 0xFF) * arg0;
        int var9 = (arg1 & 0xFF) * arg0;
        int var10 = field783 * arg2 + arg3;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field782[var10] >> 16 & 0xFF) * var6;
            int var13 = (field782[var10] >> 8 & 0xFF) * var6;
            int var14 = (field782[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field782[var10] = var15;
            var10 += field783;
        }
    }
}
