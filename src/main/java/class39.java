import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OMVHXJFV")
public class class39 extends class37 {

    @OriginalMember(owner = "OMVHXJFV", name = "i", descriptor = "I")
    private static int field1199 = 5758;

    @OriginalMember(owner = "OMVHXJFV", name = "j", descriptor = "Z")
    private static boolean field1200 = true;

    @OriginalMember(owner = "OMVHXJFV", name = "k", descriptor = "I")
    private static int field1201;

    @OriginalMember(owner = "OMVHXJFV", name = "m", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "OMVHXJFV", name = "n", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "OMVHXJFV", name = "o", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "OMVHXJFV", name = "p", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "OMVHXJFV", name = "q", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "OMVHXJFV", name = "r", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "OMVHXJFV", name = "s", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "OMVHXJFV", name = "t", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "OMVHXJFV", name = "u", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "OMVHXJFV", name = "h", descriptor = "Z")
    private static boolean field1198;

    @OriginalMember(owner = "OMVHXJFV", name = "v", descriptor = "Z")
    public static boolean field1212;

    @OriginalMember(owner = "OMVHXJFV", name = "l", descriptor = "[I")
    public static int[] field1202;

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(I[III)V")
    public static void method415(int arg0, int[] arg1, int arg2, int arg3) {
        field1202 = arg1;
        field1203 = arg3;
        int var4 = 83 / arg0;
        field1204 = arg2;
        method417(arg3, 0, arg2, 0, 42773);
    }

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(I)V")
    public static void method416(int arg0) {
        field1207 = 0;
        field1205 = 0;
        field1208 = field1203;
        field1206 = field1204;
        if (field1199 != arg0) {
            field1198 = !field1198;
        }
        field1209 = field1208 - 1;
        field1210 = field1208 / 2;
    }

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(IIIII)V")
    public static void method417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 > field1203) {
            arg0 = field1203;
        }
        if (arg2 > field1204) {
            arg2 = field1204;
        }
        field1207 = arg3;
        field1205 = arg1;
        field1208 = arg0;
        field1206 = arg2;
        if (arg4 == 42773) {
            field1209 = field1208 - 1;
            field1210 = field1208 / 2;
            field1211 = field1206 / 2;
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "b", descriptor = "(I)V")
    public static void method418(int arg0) {
        int var1 = 31 / arg0;
        int var2 = field1204 * field1203;
        for (int var3 = 0; var3 < var2; var3++) {
            field1202[var3] = 0;
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(IIIIIII)V")
    public static void method419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < field1207) {
            arg5 -= field1207 - arg4;
            arg4 = field1207;
        }
        if (arg6 < field1205) {
            arg0 -= field1205 - arg6;
            arg6 = field1205;
        }
        if (arg4 + arg5 > field1208) {
            arg5 = field1208 - arg4;
        }
        if (arg0 + arg6 > field1206) {
            arg0 = field1206 - arg6;
        }
        int var7 = 256 - arg1;
        int var8 = (arg2 >> 16 & 0xFF) * arg1;
        int var9 = (arg2 >> 8 & 0xFF) * arg1;
        int var10 = (arg2 & 0xFF) * arg1;
        if (arg3 < 7 || arg3 > 7) {
            return;
        }
        int var11 = field1203 - arg5;
        int var12 = field1203 * arg6 + arg4;
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = (field1202[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1202[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1202[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1202[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(IBIIII)V")
    public static void method420(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 2) {
            return;
        }
        boolean var6 = false;
        if (arg0 < field1207) {
            arg4 -= field1207 - arg0;
            arg0 = field1207;
        }
        if (arg5 < field1205) {
            arg3 -= field1205 - arg5;
            arg5 = field1205;
        }
        if (arg0 + arg4 > field1208) {
            arg4 = field1208 - arg0;
        }
        if (arg3 + arg5 > field1206) {
            arg3 = field1206 - arg5;
        }
        int var7 = field1203 - arg4;
        int var8 = field1203 * arg5 + arg0;
        for (int var9 = -arg3; var9 < 0; var9++) {
            for (int var10 = -arg4; var10 < 0; var10++) {
                field1202[var8++] = arg2;
            }
            var8 += var7;
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "b", descriptor = "(IBIIII)V")
    public static void method421(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == -22) {
            method423(arg4, 265, arg0, arg5, arg3);
            method423(arg2 + arg4 - 1, 265, arg0, arg5, arg3);
            method425(arg2, arg5, arg4, arg3, field1200);
            method425(arg2, arg0 + arg5 - 1, arg4, arg3, field1200);
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(IIZIIII)V")
    public static void method422(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        method424(arg4, 876, arg1, arg5, arg3, arg6);
        if (arg2) {
            field1201 = 352;
        }
        method424(arg4, 876, arg1, arg5, arg3, arg0 + arg6 - 1);
        if (arg0 >= 3) {
            method426(arg4, arg1, arg0 - 2, (byte) 8, arg6 + 1, arg3);
            method426(arg4, arg1 + arg5 - 1, arg0 - 2, (byte) 8, arg6 + 1, arg3);
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "b", descriptor = "(IIIII)V")
    public static void method423(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 61 / arg1;
        if (arg0 < field1205 || arg0 >= field1206) {
            return;
        }
        if (arg3 < field1207) {
            arg2 -= field1207 - arg3;
            arg3 = field1207;
        }
        if (arg2 + arg3 > field1208) {
            arg2 = field1208 - arg3;
        }
        int var6 = field1203 * arg0 + arg3;
        for (int var7 = 0; var7 < arg2; var7++) {
            field1202[var6 + var7] = arg4;
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(IIIIII)V")
    public static void method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= 0 || (arg5 < field1205 || arg5 >= field1206)) {
            return;
        }
        if (arg2 < field1207) {
            arg3 -= field1207 - arg2;
            arg2 = field1207;
        }
        if (arg2 + arg3 > field1208) {
            arg3 = field1208 - arg2;
        }
        int var6 = 256 - arg4;
        int var7 = (arg0 >> 16 & 0xFF) * arg4;
        int var8 = (arg0 >> 8 & 0xFF) * arg4;
        int var9 = (arg0 & 0xFF) * arg4;
        int var10 = field1203 * arg5 + arg2;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field1202[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1202[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1202[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1202[var10++] = var15;
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(IIIIZ)V")
    public static void method425(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 < field1207 || arg1 >= field1208) {
            return;
        }
        if (arg2 < field1205) {
            arg0 -= field1205 - arg2;
            arg2 = field1205;
        }
        if (arg0 + arg2 > field1206) {
            arg0 = field1206 - arg2;
        }
        int var5 = field1203 * arg2 + arg1;
        if (arg4) {
            for (int var6 = 0; var6 < arg0; var6++) {
                field1202[field1203 * var6 + var5] = arg3;
            }
        }
    }

    @OriginalMember(owner = "OMVHXJFV", name = "a", descriptor = "(IIIBII)V")
    public static void method426(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg1 < field1207 || arg1 >= field1208) {
            return;
        }
        if (arg4 < field1205) {
            arg2 -= field1205 - arg4;
            arg4 = field1205;
        }
        if (arg2 + arg4 > field1206) {
            arg2 = field1206 - arg4;
        }
        int var6 = 256 - arg5;
        int var7 = (arg0 >> 16 & 0xFF) * arg5;
        int var8 = (arg0 >> 8 & 0xFF) * arg5;
        int var9 = (arg0 & 0xFF) * arg5;
        int var10 = field1203 * arg4 + arg1;
        if (arg3 != 8) {
            return;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1202[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1202[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1202[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1202[var10] = var15;
            var10 += field1203;
        }
    }
}
