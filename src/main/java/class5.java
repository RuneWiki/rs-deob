import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CBERHIHM")
public class class5 extends class9 {

    @OriginalMember(owner = "client!CBERHIHM", name = "i", descriptor = "Z")
    private static boolean field39 = true;

    @OriginalMember(owner = "client!CBERHIHM", name = "j", descriptor = "I")
    private static int field40 = -866;

    @OriginalMember(owner = "client!CBERHIHM", name = "k", descriptor = "B")
    private static byte field41 = -2;

    @OriginalMember(owner = "client!CBERHIHM", name = "m", descriptor = "Z")
    private static boolean field43 = true;

    @OriginalMember(owner = "client!CBERHIHM", name = "n", descriptor = "I")
    private static int field44;

    @OriginalMember(owner = "client!CBERHIHM", name = "p", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!CBERHIHM", name = "q", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!CBERHIHM", name = "r", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!CBERHIHM", name = "s", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!CBERHIHM", name = "t", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!CBERHIHM", name = "u", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!CBERHIHM", name = "v", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!CBERHIHM", name = "w", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!CBERHIHM", name = "x", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!CBERHIHM", name = "l", descriptor = "Z")
    private static boolean field42;

    @OriginalMember(owner = "client!CBERHIHM", name = "y", descriptor = "Z")
    public static boolean field55;

    @OriginalMember(owner = "client!CBERHIHM", name = "o", descriptor = "[I")
    public static int[] field45;

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(B[III)V")
    public static void method28(byte arg0, int[] arg1, int arg2, int arg3) {
        field45 = arg1;
        field46 = arg3;
        field47 = arg2;
        method30(arg2, 0, 0, arg3, false);
        if (field41 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(Z)V")
    public static void method29(boolean arg0) {
        field50 = 0;
        field48 = 0;
        if (!arg0) {
            field51 = field46;
            field49 = field47;
            field52 = field51 - 1;
            field53 = field51 / 2;
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIIZ)V")
    public static void method30(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field39 = !field39;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > field46) {
            arg3 = field46;
        }
        if (arg0 > field47) {
            arg0 = field47;
        }
        field50 = arg2;
        field48 = arg1;
        field51 = arg3;
        field49 = arg0;
        field52 = field51 - 1;
        field53 = field51 / 2;
        field54 = field49 / 2;
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(B)V")
    public static void method31(byte arg0) {
        if (arg0 != 4) {
            field44 = -199;
        }
        int var1 = field47 * field46;
        for (int var2 = 0; var2 < var1; var2++) {
            field45[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIIIII)V")
    public static void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < field50) {
            arg2 -= field50 - arg1;
            arg1 = field50;
        }
        if (arg6 < field48) {
            arg3 -= field48 - arg6;
            arg6 = field48;
        }
        if (arg1 + arg2 > field51) {
            arg2 = field51 - arg1;
        }
        if (arg3 + arg6 > field49) {
            arg3 = field49 - arg6;
        }
        int var7 = 256 - arg5;
        int var8 = (arg4 >> 16 & 0xFF) * arg5;
        int var9 = (arg4 >> 8 & 0xFF) * arg5;
        int var10 = (arg4 & 0xFF) * arg5;
        int var11 = field46 - arg2;
        int var12 = field46 * arg6 + arg1;
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                int var16 = (field45[var12] >> 16 & 0xFF) * var7;
                int var17 = (field45[var12] >> 8 & 0xFF) * var7;
                int var18 = (field45[var12] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field45[var12++] = var19;
            }
            var12 += var11;
        }
        if (arg0 <= 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIIII)V")
    public static void method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 5948) {
            return;
        }
        if (arg0 < field50) {
            arg5 -= field50 - arg0;
            arg0 = field50;
        }
        if (arg2 < field48) {
            arg3 -= field48 - arg2;
            arg2 = field48;
        }
        if (arg0 + arg5 > field51) {
            arg5 = field51 - arg0;
        }
        if (arg2 + arg3 > field49) {
            arg3 = field49 - arg2;
        }
        int var6 = field46 - arg5;
        int var7 = field46 * arg2 + arg0;
        for (int var8 = -arg3; var8 < 0; var8++) {
            for (int var9 = -arg5; var9 < 0; var9++) {
                field45[var7++] = arg1;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIIIZ)V")
    public static void method34(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        method36(0, arg4, arg3, arg2, arg0);
        method36(0, arg1 + arg4 - 1, arg3, arg2, arg0);
        if (arg5) {
            method38(arg1, field42, arg2, arg4, arg3);
            method38(arg1, field42, arg2, arg4, arg0 + arg3 - 1);
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "b", descriptor = "(IIIIIII)V")
    public static void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 12912) {
            field39 = !field39;
        }
        method37(arg6, arg1, (byte) -70, arg4, arg3, arg0);
        method37(arg6, arg1, (byte) -70, arg2 + arg4 - 1, arg3, arg0);
        if (arg2 >= 3) {
            method39((byte) 85, arg0, arg6, arg2 - 2, arg4 + 1, arg3);
            method39((byte) 85, arg0 + arg1 - 1, arg6, arg2 - 2, arg4 + 1, arg3);
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIII)V")
    public static void method36(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field48 || arg1 >= field49) {
            return;
        }
        if (arg2 < field50) {
            arg4 -= field50 - arg2;
            arg2 = field50;
        }
        if (arg2 + arg4 > field51) {
            arg4 = field51 - arg2;
        }
        int var5 = field46 * arg1 + arg2;
        if (arg0 != 0) {
            field42 = !field42;
        }
        for (int var6 = 0; var6 < arg4; var6++) {
            field45[var5 + var6] = arg3;
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIBIII)V")
    public static void method37(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field48 || arg3 >= field49) {
            return;
        }
        if (arg5 < field50) {
            arg1 -= field50 - arg5;
            arg5 = field50;
        }
        if (arg1 + arg5 > field51) {
            arg1 = field51 - arg5;
        }
        int var6 = 256 - arg4;
        int var7 = (arg0 >> 16 & 0xFF) * arg4;
        int var8 = (arg0 >> 8 & 0xFF) * arg4;
        int var9 = (arg0 & 0xFF) * arg4;
        int var10 = field46 * arg3 + arg5;
        if (arg2 != -70) {
            field39 = !field39;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field45[var10] >> 16 & 0xFF) * var6;
            int var13 = (field45[var10] >> 8 & 0xFF) * var6;
            int var14 = (field45[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field45[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IZIII)V")
    public static void method38(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg4 < field50 || arg4 >= field51) {
            return;
        }
        if (arg3 < field48) {
            arg0 -= field48 - arg3;
            arg3 = field48;
        }
        if (arg0 + arg3 > field49) {
            arg0 = field49 - arg3;
        }
        int var6 = field46 * arg3 + arg4;
        for (int var7 = 0; var7 < arg0; var7++) {
            field45[field46 * var7 + var6] = arg2;
        }
    }

    @OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(BIIIII)V")
    public static void method39(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field50 || arg1 >= field51) {
            return;
        }
        if (arg4 < field48) {
            arg3 -= field48 - arg4;
            arg4 = field48;
        }
        if (arg3 + arg4 > field49) {
            arg3 = field49 - arg4;
        }
        int var6 = 256 - arg5;
        int var7 = (arg2 >> 16 & 0xFF) * arg5;
        int var8 = (arg2 >> 8 & 0xFF) * arg5;
        int var9 = (arg2 & 0xFF) * arg5;
        if (arg0 != 85) {
            field43 = !field43;
        }
        int var10 = field46 * arg4 + arg1;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field45[var10] >> 16 & 0xFF) * var6;
            int var13 = (field45[var10] >> 8 & 0xFF) * var6;
            int var14 = (field45[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field45[var10] = var15;
            var10 += field46;
        }
    }
}
