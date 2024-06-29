import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MVOWZCMY")
public class class35 extends class57 {

    @OriginalMember(owner = "client!MVOWZCMY", name = "h", descriptor = "I")
    private static int field1105 = -705;

    @OriginalMember(owner = "client!MVOWZCMY", name = "i", descriptor = "I")
    private static int field1106 = -34;

    @OriginalMember(owner = "client!MVOWZCMY", name = "j", descriptor = "I")
    private static int field1107 = -487;

    @OriginalMember(owner = "client!MVOWZCMY", name = "k", descriptor = "B")
    private static byte field1108 = -24;

    @OriginalMember(owner = "client!MVOWZCMY", name = "l", descriptor = "Z")
    private static boolean field1109 = true;

    @OriginalMember(owner = "client!MVOWZCMY", name = "n", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!MVOWZCMY", name = "o", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!MVOWZCMY", name = "p", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!MVOWZCMY", name = "q", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!MVOWZCMY", name = "r", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!MVOWZCMY", name = "s", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!MVOWZCMY", name = "t", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!MVOWZCMY", name = "u", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!MVOWZCMY", name = "v", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!MVOWZCMY", name = "w", descriptor = "Z")
    public static boolean field1120;

    @OriginalMember(owner = "client!MVOWZCMY", name = "m", descriptor = "[I")
    public static int[] field1110;

    @OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(III[I)V")
    public static void method340(int arg0, int arg1, int arg2, int[] arg3) {
        field1110 = arg3;
        field1111 = arg2;
        field1112 = arg0;
        method342(0, 0, arg2, arg0, 14641);
        if (arg1 == 26380) {
            ;
        }
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(I)V")
    public static void method341(int arg0) {
        field1115 = 0;
        if (arg0 < 2 || arg0 > 2) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1113 = 0;
        field1116 = field1111;
        field1114 = field1112;
        field1117 = field1116 - 1;
        field1118 = field1116 / 2;
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIII)V")
    public static void method342(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > field1111) {
            arg2 = field1111;
        }
        if (arg3 > field1112) {
            arg3 = field1112;
        }
        field1115 = arg1;
        field1113 = arg0;
        field1116 = arg2;
        if (arg4 != 14641) {
            field1105 = -296;
        }
        field1114 = arg3;
        field1117 = field1116 - 1;
        field1118 = field1116 / 2;
        field1119 = field1114 / 2;
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "b", descriptor = "(I)V")
    public static void method343(int arg0) {
        int var1 = field1112 * field1111;
        if (arg0 < 0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field1110[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIIIII)V")
    public static void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < field1115) {
            arg0 -= field1115 - arg1;
            arg1 = field1115;
        }
        if (arg3 < field1113) {
            arg5 -= field1113 - arg3;
            arg3 = field1113;
        }
        if (arg0 + arg1 > field1116) {
            arg0 = field1116 - arg1;
        }
        if (arg3 + arg5 > field1114) {
            arg5 = field1114 - arg3;
        }
        int var7 = 256 - arg4;
        int var8 = (arg2 >> 16 & 0xFF) * arg4;
        int var9 = (arg2 >> 8 & 0xFF) * arg4;
        int var10 = (arg2 & 0xFF) * arg4;
        if (arg6 >= 0) {
            return;
        }
        int var11 = field1111 - arg0;
        int var12 = field1111 * arg3 + arg1;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = (field1110[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1110[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1110[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1110[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIIII)V")
    public static void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field1115) {
            arg0 -= field1115 - arg3;
            arg3 = field1115;
        }
        if (arg5 < field1113) {
            arg4 -= field1113 - arg5;
            arg5 = field1113;
        }
        if (arg0 + arg3 > field1116) {
            arg0 = field1116 - arg3;
        }
        if (arg4 + arg5 > field1114) {
            arg4 = field1114 - arg5;
        }
        int var6 = field1111 - arg0;
        if (arg1 != 0) {
            field1109 = !field1109;
        }
        int var7 = field1111 * arg5 + arg3;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var9 = -arg0; var9 < 0; var9++) {
                field1110[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "b", descriptor = "(IIIIII)V")
    public static void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method348(0, arg1, arg2, arg0, arg4);
        if (arg3 > 0) {
            method348(0, arg1, arg2 + arg5 - 1, arg0, arg4);
            method350(arg2, arg1, arg5, arg0, true);
            method350(arg2, arg1, arg5, arg0 + arg4 - 1, true);
        }
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "b", descriptor = "(IIIIIII)V")
    public static void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method349(arg6, arg5, 153, arg3, arg0, arg2);
        method349(arg6, arg5, 153, arg1 + arg3 - 1, arg0, arg2);
        if (arg4 < 0 && arg1 >= 3) {
            method351(arg5, arg3 + 1, arg1 - 2, arg6, false, arg0);
            method351(arg2 + arg5 - 1, arg3 + 1, arg1 - 2, arg6, false, arg0);
        }
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "b", descriptor = "(IIIII)V")
    public static void method348(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 < field1113 || arg2 >= field1114) {
            return;
        }
        if (arg3 < field1115) {
            arg4 -= field1115 - arg3;
            arg3 = field1115;
        }
        if (arg3 + arg4 > field1116) {
            arg4 = field1116 - arg3;
        }
        int var6 = field1111 * arg2 + arg3;
        for (int var7 = 0; var7 < arg4; var7++) {
            field1110[var6 + var7] = arg1;
        }
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "c", descriptor = "(IIIIII)V")
    public static void method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field1113 || arg3 >= field1114) {
            return;
        }
        if (arg1 < field1115) {
            arg5 -= field1115 - arg1;
            arg1 = field1115;
        }
        if (arg1 + arg5 > field1116) {
            arg5 = field1116 - arg1;
        }
        int var6 = 256 - arg4;
        int var7 = (arg0 >> 16 & 0xFF) * arg4;
        int var8 = (arg0 >> 8 & 0xFF) * arg4;
        int var9 = (arg0 & 0xFF) * arg4;
        int var10 = field1111 * arg3 + arg1;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var13 = (field1110[var10] >> 16 & 0xFF) * var6;
            int var14 = (field1110[var10] >> 8 & 0xFF) * var6;
            int var15 = (field1110[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field1110[var10++] = var16;
        }
        int var12 = 59 / arg2;
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIIZ)V")
    public static void method350(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 < field1115 || arg3 >= field1116) {
            return;
        }
        if (arg0 < field1113) {
            arg2 -= field1113 - arg0;
            arg0 = field1113;
        }
        if (arg0 + arg2 > field1114) {
            arg2 = field1114 - arg0;
        }
        int var5 = field1111 * arg0 + arg3;
        if (arg4) {
            for (int var6 = 0; var6 < arg2; var6++) {
                field1110[field1111 * var6 + var5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIIZI)V")
    public static void method351(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 < field1115 || arg0 >= field1116) {
            return;
        }
        if (arg1 < field1113) {
            arg2 -= field1113 - arg1;
            arg1 = field1113;
        }
        if (arg1 + arg2 > field1114) {
            arg2 = field1114 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg3 >> 16 & 0xFF) * arg5;
        int var8 = (arg3 >> 8 & 0xFF) * arg5;
        int var9 = (arg3 & 0xFF) * arg5;
        if (arg4) {
            return;
        }
        int var10 = field1111 * arg1 + arg0;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1110[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1110[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1110[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1110[var10] = var15;
            var10 += field1111;
        }
    }
}
