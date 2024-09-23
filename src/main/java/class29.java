import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LRYUPGSZ")
public class class29 extends class6 {

    @OriginalMember(owner = "LRYUPGSZ", name = "i", descriptor = "I")
    private static int field996 = 7;

    @OriginalMember(owner = "LRYUPGSZ", name = "j", descriptor = "B")
    private static byte field997 = 88;

    @OriginalMember(owner = "LRYUPGSZ", name = "k", descriptor = "Z")
    private static boolean field998 = true;

    @OriginalMember(owner = "LRYUPGSZ", name = "l", descriptor = "B")
    private static byte field999 = -87;

    @OriginalMember(owner = "LRYUPGSZ", name = "m", descriptor = "I")
    private static int field1000 = 10280;

    @OriginalMember(owner = "LRYUPGSZ", name = "n", descriptor = "Z")
    private static boolean field1001 = true;

    @OriginalMember(owner = "LRYUPGSZ", name = "p", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "LRYUPGSZ", name = "q", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "LRYUPGSZ", name = "r", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "LRYUPGSZ", name = "s", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "LRYUPGSZ", name = "t", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "LRYUPGSZ", name = "u", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "LRYUPGSZ", name = "v", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "LRYUPGSZ", name = "w", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "LRYUPGSZ", name = "x", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "LRYUPGSZ", name = "y", descriptor = "Z")
    public static boolean field1012;

    @OriginalMember(owner = "LRYUPGSZ", name = "o", descriptor = "[I")
    public static int[] field1002;

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(ZI[II)V")
    public static void method264(boolean arg0, int arg1, int[] arg2, int arg3) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1002 = arg2;
        field1003 = arg1;
        field1004 = arg3;
        method266(0, 0, (byte) -109, arg1, arg3);
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(B)V")
    public static void method265(byte arg0) {
        field1007 = 0;
        if (field997 != arg0) {
            field1000 = -441;
        }
        field1005 = 0;
        field1008 = field1003;
        field1006 = field1004;
        field1009 = field1008 - 1;
        field1010 = field1008 / 2;
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(IIBII)V")
    public static void method266(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 > field1003) {
            arg3 = field1003;
        }
        if (arg4 > field1004) {
            arg4 = field1004;
        }
        field1007 = arg1;
        field1005 = arg0;
        field1008 = arg3;
        field1006 = arg4;
        field1009 = field1008 - 1;
        if (arg2 != -109) {
            field1001 = !field1001;
        }
        field1010 = field1008 / 2;
        field1011 = field1006 / 2;
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(I)V")
    public static void method267(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            field996 = -41;
        }
        int var1 = field1004 * field1003;
        for (int var2 = 0; var2 < var1; var2++) {
            field1002[var2] = 0;
        }
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(IIIIIII)V")
    public static void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < field1007) {
            arg3 -= field1007 - arg4;
            arg4 = field1007;
        }
        if (arg5 < field1005) {
            arg0 -= field1005 - arg5;
            arg5 = field1005;
        }
        if (arg3 + arg4 > field1008) {
            arg3 = field1008 - arg4;
        }
        if (arg0 + arg5 > field1006) {
            arg0 = field1006 - arg5;
        }
        int var7 = 256 - arg1;
        if (arg2 != 0) {
            return;
        }
        int var8 = (arg6 >> 16 & 0xFF) * arg1;
        int var9 = (arg6 >> 8 & 0xFF) * arg1;
        int var10 = (arg6 & 0xFF) * arg1;
        int var11 = field1003 - arg3;
        int var12 = field1003 * arg5 + arg4;
        for (int var13 = 0; var13 < arg0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = (field1002[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1002[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1002[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1002[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(IIIIII)V")
    public static void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field1007) {
            arg1 -= field1007 - arg4;
            arg4 = field1007;
        }
        if (arg3 < field1005) {
            arg2 -= field1005 - arg3;
            arg3 = field1005;
        }
        if (arg1 + arg4 > field1008) {
            arg1 = field1008 - arg4;
        }
        if (arg2 + arg3 > field1006) {
            arg2 = field1006 - arg3;
        }
        int var6 = field1003 - arg1;
        if (arg5 != -48531) {
            field1001 = !field1001;
        }
        int var7 = field1003 * arg3 + arg4;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg1; var9 < 0; var9++) {
                field1002[var7++] = arg0;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(IZIIII)V")
    public static void method270(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        method272(arg5, -399, arg3, arg4, arg0);
        method272(arg5, -399, arg3, arg4, arg0 + arg2 - 1);
        method274(arg2, arg5, true, arg0, arg4);
        method274(arg2, arg5, true, arg0, arg3 + arg4 - 1);
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(IIIBIII)V")
    public static void method271(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        method273(arg1, arg4, arg6, true, arg5, arg0);
        if (arg3 != 8) {
            return;
        }
        method273(arg1 + arg2 - 1, arg4, arg6, true, arg5, arg0);
        if (arg2 >= 3) {
            method275((byte) -87, arg0, arg2 - 2, arg1 + 1, arg4, arg6);
            method275((byte) -87, arg0, arg2 - 2, arg1 + 1, arg4, arg5 + arg6 - 1);
        }
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(IIIII)V")
    public static void method272(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field1005 || arg4 >= field1006) {
            return;
        }
        if (arg3 < field1007) {
            arg2 -= field1007 - arg3;
            arg3 = field1007;
        }
        if (arg2 + arg3 > field1008) {
            arg2 = field1008 - arg3;
        }
        int var5 = field1003 * arg4 + arg3;
        if (arg1 < 0) {
            for (int var6 = 0; var6 < arg2; var6++) {
                field1002[var5 + var6] = arg0;
            }
        }
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(IIIZII)V")
    public static void method273(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 < field1005 || arg0 >= field1006) {
            return;
        }
        if (arg2 < field1007) {
            arg4 -= field1007 - arg2;
            arg2 = field1007;
        }
        if (arg2 + arg4 > field1008) {
            arg4 = field1008 - arg2;
        }
        int var6 = 256 - arg5;
        if (!arg3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = (arg1 >> 16 & 0xFF) * arg5;
        int var9 = (arg1 >> 8 & 0xFF) * arg5;
        int var10 = (arg1 & 0xFF) * arg5;
        int var11 = field1003 * arg0 + arg2;
        for (int var12 = 0; var12 < arg4; var12++) {
            int var13 = (field1002[var11] >> 16 & 0xFF) * var6;
            int var14 = (field1002[var11] >> 8 & 0xFF) * var6;
            int var15 = (field1002[var11] & 0xFF) * var6;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field1002[var11++] = var16;
        }
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(IIZII)V")
    public static void method274(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 < field1007 || arg4 >= field1008) {
            return;
        }
        if (arg3 < field1005) {
            arg0 -= field1005 - arg3;
            arg3 = field1005;
        }
        if (arg0 + arg3 > field1006) {
            arg0 = field1006 - arg3;
        }
        int var5 = field1003 * arg3 + arg4;
        if (!arg2) {
            field1000 = -317;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            field1002[field1003 * var6 + var5] = arg1;
        }
    }

    @OriginalMember(owner = "LRYUPGSZ", name = "a", descriptor = "(BIIIII)V")
    public static void method275(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field1007 || arg5 >= field1008) {
            return;
        }
        if (arg3 < field1005) {
            arg2 -= field1005 - arg3;
            arg3 = field1005;
        }
        if (arg2 + arg3 > field1006) {
            arg2 = field1006 - arg3;
        }
        int var6 = 256 - arg1;
        int var7 = (arg4 >> 16 & 0xFF) * arg1;
        int var8 = (arg4 >> 8 & 0xFF) * arg1;
        int var9 = (arg4 & 0xFF) * arg1;
        int var10 = field1003 * arg3 + arg5;
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = (field1002[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1002[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1002[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1002[var10] = var15;
            var10 += field1003;
        }
        if (field999 == arg0) {
            ;
        }
    }
}
