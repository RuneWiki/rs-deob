import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CCFLBOBS")
public class class8 extends class13 {

    @OriginalMember(owner = "client!CCFLBOBS", name = "i", descriptor = "I")
    private static int field148 = 107;

    @OriginalMember(owner = "client!CCFLBOBS", name = "k", descriptor = "I")
    private static int field150;

    @OriginalMember(owner = "client!CCFLBOBS", name = "m", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!CCFLBOBS", name = "n", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!CCFLBOBS", name = "o", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!CCFLBOBS", name = "p", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!CCFLBOBS", name = "q", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!CCFLBOBS", name = "r", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!CCFLBOBS", name = "s", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!CCFLBOBS", name = "t", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!CCFLBOBS", name = "u", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!CCFLBOBS", name = "j", descriptor = "Z")
    private static boolean field149;

    @OriginalMember(owner = "client!CCFLBOBS", name = "v", descriptor = "Z")
    public static boolean field161;

    @OriginalMember(owner = "client!CCFLBOBS", name = "l", descriptor = "[I")
    public static int[] field151;

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(I[III)V")
    public static void method138(int arg0, int[] arg1, int arg2, int arg3) {
        field151 = arg1;
        field152 = arg3;
        if (arg2 != 0) {
            field150 = -17;
        }
        field153 = arg0;
        method140(0, true, 0, arg3, arg0);
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(I)V")
    public static void method139(int arg0) {
        field156 = 0;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field154 = 0;
        field157 = field152;
        field155 = field153;
        field158 = field157 - 1;
        field159 = field157 / 2;
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IZIII)V")
    public static void method140(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            return;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 > field152) {
            arg3 = field152;
        }
        if (arg4 > field153) {
            arg4 = field153;
        }
        field156 = arg0;
        field154 = arg2;
        field157 = arg3;
        field155 = arg4;
        field158 = field157 - 1;
        field159 = field157 / 2;
        field160 = field155 / 2;
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(Z)V")
    public static void method141(boolean arg0) {
        int var1 = field153 * field152;
        if (arg0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field151[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIIIII)V")
    public static void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < field156) {
            arg3 -= field156 - arg2;
            arg2 = field156;
        }
        if (arg4 < field154) {
            arg0 -= field154 - arg4;
            arg4 = field154;
        }
        if (arg2 + arg3 > field157) {
            arg3 = field157 - arg2;
        }
        if (arg0 + arg4 > field155) {
            arg0 = field155 - arg4;
        }
        int var7 = 256 - arg5;
        int var8 = (arg1 >> 16 & 0xFF) * arg5;
        int var9 = (arg1 >> 8 & 0xFF) * arg5;
        int var10 = (arg1 & 0xFF) * arg5;
        int var11 = field152 - arg3;
        int var12 = field152 * arg4 + arg2;
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = (field151[var12] >> 16 & 0xFF) * var7;
                int var16 = (field151[var12] >> 8 & 0xFF) * var7;
                int var17 = (field151[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field151[var12++] = var18;
            }
            var12 += var11;
        }
        if (arg6 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIIIZ)V")
    public static void method143(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            return;
        }
        if (arg1 < field156) {
            arg3 -= field156 - arg1;
            arg1 = field156;
        }
        if (arg2 < field154) {
            arg4 -= field154 - arg2;
            arg2 = field154;
        }
        if (arg1 + arg3 > field157) {
            arg3 = field157 - arg1;
        }
        if (arg2 + arg4 > field155) {
            arg4 = field155 - arg2;
        }
        int var6 = field152 - arg3;
        int var7 = field152 * arg2 + arg1;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg3; var9 < 0; var9++) {
                field151[var7++] = arg0;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIIII)V")
    public static void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method146(-898, arg5, arg3, arg1, arg0);
        method146(-898, arg5, arg3, arg1, arg0 + arg4 - 1);
        method148(arg1, arg4, arg3, true, arg0);
        if (arg2 > 0) {
            method148(arg1, arg4, arg3 + arg5 - 1, true, arg0);
        }
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "b", descriptor = "(IIIIIII)V")
    public static void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method147(arg1, arg6, arg0, 0, arg2, arg4);
        method147(arg1, arg6, arg0, 0, arg2 + arg3 - 1, arg4);
        if (arg5 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (arg3 >= 3) {
            method149(arg6, arg2 + 1, arg1, -32286, arg4, arg3 - 2);
            method149(arg6, arg2 + 1, arg0 + arg1 - 1, -32286, arg4, arg3 - 2);
        }
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIII)V")
    public static void method146(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field154 || arg4 >= field155) {
            return;
        }
        if (arg2 < field156) {
            arg1 -= field156 - arg2;
            arg2 = field156;
        }
        if (arg1 + arg2 > field157) {
            arg1 = field157 - arg2;
        }
        int var5 = field152 * arg4 + arg2;
        if (arg0 != -898) {
            field150 = -240;
        }
        for (int var6 = 0; var6 < arg1; var6++) {
            field151[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "b", descriptor = "(IIIIII)V")
    public static void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field154 || arg4 >= field155) {
            return;
        }
        if (arg0 < field156) {
            arg2 -= field156 - arg0;
            arg0 = field156;
        }
        if (arg0 + arg2 > field157) {
            arg2 = field157 - arg0;
        }
        int var6 = 256 - arg5;
        int var7 = (arg1 >> 16 & 0xFF) * arg5;
        int var8 = (arg1 >> 8 & 0xFF) * arg5;
        int var9 = (arg1 & 0xFF) * arg5;
        if (arg3 != 0) {
            field149 = !field149;
        }
        int var10 = field152 * arg4 + arg0;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field151[var10] >> 16 & 0xFF) * var6;
            int var13 = (field151[var10] >> 8 & 0xFF) * var6;
            int var14 = (field151[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field151[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIZI)V")
    public static void method148(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            field148 = -441;
        }
        if (arg2 < field156 || arg2 >= field157) {
            return;
        }
        if (arg4 < field154) {
            arg1 -= field154 - arg4;
            arg4 = field154;
        }
        if (arg1 + arg4 > field155) {
            arg1 = field155 - arg4;
        }
        int var5 = field152 * arg4 + arg2;
        for (int var6 = 0; var6 < arg1; var6++) {
            field151[field152 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "client!CCFLBOBS", name = "c", descriptor = "(IIIIII)V")
    public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field156 || arg2 >= field157) {
            return;
        }
        if (arg1 < field154) {
            arg5 -= field154 - arg1;
            arg1 = field154;
        }
        if (arg1 + arg5 > field155) {
            arg5 = field155 - arg1;
        }
        int var6 = 256 - arg4;
        if (arg3 != -32286) {
            return;
        }
        int var7 = (arg0 >> 16 & 0xFF) * arg4;
        int var8 = (arg0 >> 8 & 0xFF) * arg4;
        int var9 = (arg0 & 0xFF) * arg4;
        int var10 = field152 * arg1 + arg2;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field151[var10] >> 16 & 0xFF) * var6;
            int var13 = (field151[var10] >> 8 & 0xFF) * var6;
            int var14 = (field151[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field151[var10] = var15;
            var10 += field152;
        }
    }
}
