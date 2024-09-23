import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ACKHPAZA")
public class class1 extends class40 {

    @OriginalMember(owner = "ACKHPAZA", name = "k", descriptor = "I")
    private static int field2 = 7;

    @OriginalMember(owner = "ACKHPAZA", name = "m", descriptor = "Z")
    private static boolean field4 = true;

    @OriginalMember(owner = "ACKHPAZA", name = "n", descriptor = "B")
    private static byte field5 = 4;

    @OriginalMember(owner = "ACKHPAZA", name = "o", descriptor = "I")
    private static int field6 = 13242;

    @OriginalMember(owner = "ACKHPAZA", name = "j", descriptor = "I")
    private static int field1;

    @OriginalMember(owner = "ACKHPAZA", name = "s", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "ACKHPAZA", name = "t", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "ACKHPAZA", name = "u", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "ACKHPAZA", name = "v", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "ACKHPAZA", name = "w", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "ACKHPAZA", name = "x", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "ACKHPAZA", name = "y", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "ACKHPAZA", name = "z", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "ACKHPAZA", name = "A", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "ACKHPAZA", name = "l", descriptor = "I")
    private static int field3;

    @OriginalMember(owner = "ACKHPAZA", name = "p", descriptor = "I")
    private static int field7;

    @OriginalMember(owner = "ACKHPAZA", name = "B", descriptor = "Z")
    public static boolean field19;

    @OriginalMember(owner = "ACKHPAZA", name = "q", descriptor = "Z")
    private static boolean field8;

    @OriginalMember(owner = "ACKHPAZA", name = "r", descriptor = "[I")
    public static int[] field9;

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(I[III)V")
    public static void method1(int arg0, int[] arg1, int arg2, int arg3) {
        field9 = arg1;
        if (arg2 < field2 || arg2 > field2) {
            field8 = !field8;
        }
        field10 = arg3;
        field11 = arg0;
        method3(0, arg3, false, 0, arg0);
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(B)V")
    public static void method2(byte arg0) {
        field14 = 0;
        field12 = 0;
        field15 = field10;
        field13 = field11;
        field16 = field15 - 1;
        if (arg0 != -82) {
            field7 = -310;
        }
        field17 = field15 / 2;
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(IIZII)V")
    public static void method3(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 > field10) {
            arg1 = field10;
        }
        if (arg4 > field11) {
            arg4 = field11;
        }
        field14 = arg3;
        field12 = arg0;
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field15 = arg1;
        field13 = arg4;
        field16 = field15 - 1;
        field17 = field15 / 2;
        field18 = field13 / 2;
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        while (arg0 >= 0) {
            field2 = 20;
        }
        int var1 = field11 * field10;
        for (int var2 = 0; var2 < var1; var2++) {
            field9[var2] = 0;
        }
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(IBIIIII)V")
    public static void method5(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < field14) {
            arg5 -= field14 - arg2;
            arg2 = field14;
        }
        if (arg6 < field12) {
            arg3 -= field12 - arg6;
            arg6 = field12;
        }
        if (arg2 + arg5 > field15) {
            arg5 = field15 - arg2;
        }
        if (arg3 + arg6 > field13) {
            arg3 = field13 - arg6;
        }
        int var7 = 256 - arg0;
        int var8 = (arg4 >> 16 & 0xFF) * arg0;
        int var9 = (arg4 >> 8 & 0xFF) * arg0;
        int var10 = (arg4 & 0xFF) * arg0;
        if (arg1 != -92) {
            field1 = 449;
        }
        int var11 = field10 - arg5;
        int var12 = field10 * arg6 + arg2;
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = (field9[var12] >> 16 & 0xFF) * var7;
                int var16 = (field9[var12] >> 8 & 0xFF) * var7;
                int var17 = (field9[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field9[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(IIIIII)V")
    public static void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -19550) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg5 < field14) {
            arg0 -= field14 - arg5;
            arg5 = field14;
        }
        if (arg2 < field12) {
            arg1 -= field12 - arg2;
            arg2 = field12;
        }
        if (arg0 + arg5 > field15) {
            arg0 = field15 - arg5;
        }
        if (arg1 + arg2 > field13) {
            arg1 = field13 - arg2;
        }
        int var7 = field10 - arg0;
        int var8 = field10 * arg2 + arg5;
        for (int var9 = -arg1; var9 < 0; var9++) {
            for (int var10 = -arg0; var10 < 0; var10++) {
                field9[var8++] = arg4;
            }
            var8 += var7;
        }
    }

    @OriginalMember(owner = "ACKHPAZA", name = "b", descriptor = "(IIIIII)V")
    public static void method7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method9(arg2, arg0, field3, arg1, arg3);
        method9(arg2, arg0, field3, arg1 + arg5 - 1, arg3);
        if (arg4 == 0) {
            method11(arg0, arg1, arg5, (byte) 4, arg2);
            method11(arg0 + arg3 - 1, arg1, arg5, (byte) 4, arg2);
        }
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(IIIIIII)V")
    public static void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method10(arg4, arg3, field4, arg1, arg0, arg6);
        method10(arg4, arg3, field4, arg1, arg0, arg5 + arg6 - 1);
        if (arg2 > 0 && arg5 >= 3) {
            method12(arg1, arg6 + 1, arg4, arg0, arg5 - 2, field6);
            method12(arg1, arg6 + 1, arg4, arg0 + arg3 - 1, arg5 - 2, field6);
        }
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(IIIII)V")
    public static void method9(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < field12 || arg3 >= field13) {
            return;
        }
        if (arg1 < field14) {
            arg4 -= field14 - arg1;
            arg1 = field14;
        }
        if (arg1 + arg4 > field15) {
            arg4 = field15 - arg1;
        }
        int var5 = field10 * arg3 + arg1;
        if (arg2 >= 0 && arg2 <= 0) {
            for (int var6 = 0; var6 < arg4; var6++) {
                field9[var5 + var6] = arg0;
            }
        }
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(IIZIII)V")
    public static void method10(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field12 || arg5 >= field13) {
            return;
        }
        if (arg4 < field14) {
            arg1 -= field14 - arg4;
            arg4 = field14;
        }
        if (arg1 + arg4 > field15) {
            arg1 = field15 - arg4;
        }
        int var6 = 256 - arg0;
        int var7 = (arg3 >> 16 & 0xFF) * arg0;
        int var8 = (arg3 >> 8 & 0xFF) * arg0;
        int var9 = (arg3 & 0xFF) * arg0;
        if (!arg2) {
            field4 = !field4;
        }
        int var10 = field10 * arg5 + arg4;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field9[var10] >> 16 & 0xFF) * var6;
            int var13 = (field9[var10] >> 8 & 0xFF) * var6;
            int var14 = (field9[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field9[var10++] = var15;
        }
    }

    @OriginalMember(owner = "ACKHPAZA", name = "a", descriptor = "(IIIBI)V")
    public static void method11(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg0 < field14 || arg0 >= field15) {
            return;
        }
        if (arg1 < field12) {
            arg2 -= field12 - arg1;
            arg1 = field12;
        }
        if (arg1 + arg2 > field13) {
            arg2 = field13 - arg1;
        }
        int var5 = field10 * arg1 + arg0;
        if (field5 == arg3) {
            for (int var6 = 0; var6 < arg2; var6++) {
                field9[field10 * var6 + var5] = arg4;
            }
        }
    }

    @OriginalMember(owner = "ACKHPAZA", name = "c", descriptor = "(IIIIII)V")
    public static void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field14 || arg3 >= field15) {
            return;
        }
        if (arg1 < field12) {
            arg4 -= field12 - arg1;
            arg1 = field12;
        }
        if (arg1 + arg4 > field13) {
            arg4 = field13 - arg1;
        }
        int var6 = 256 - arg2;
        int var7 = (arg0 >> 16 & 0xFF) * arg2;
        int var8 = (arg0 >> 8 & 0xFF) * arg2;
        int var9 = (arg0 & 0xFF) * arg2;
        if (arg5 != 13242) {
            return;
        }
        int var10 = field10 * arg1 + arg3;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field9[var10] >> 16 & 0xFF) * var6;
            int var13 = (field9[var10] >> 8 & 0xFF) * var6;
            int var14 = (field9[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field9[var10] = var15;
            var10 += field10;
        }
    }
}
