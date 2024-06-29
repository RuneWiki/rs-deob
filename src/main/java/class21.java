import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GBJWVQAY")
public class class21 extends class29 {

    @OriginalMember(owner = "client!GBJWVQAY", name = "h", descriptor = "B")
    private static byte field926 = 21;

    @OriginalMember(owner = "client!GBJWVQAY", name = "i", descriptor = "I")
    private static int field927 = -135;

    @OriginalMember(owner = "client!GBJWVQAY", name = "l", descriptor = "I")
    private static int field930 = 3148;

    @OriginalMember(owner = "client!GBJWVQAY", name = "n", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!GBJWVQAY", name = "o", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!GBJWVQAY", name = "p", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!GBJWVQAY", name = "q", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!GBJWVQAY", name = "r", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!GBJWVQAY", name = "s", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!GBJWVQAY", name = "t", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!GBJWVQAY", name = "u", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!GBJWVQAY", name = "v", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!GBJWVQAY", name = "j", descriptor = "Z")
    private static boolean field928;

    @OriginalMember(owner = "client!GBJWVQAY", name = "k", descriptor = "Z")
    private static boolean field929;

    @OriginalMember(owner = "client!GBJWVQAY", name = "w", descriptor = "Z")
    public static boolean field941;

    @OriginalMember(owner = "client!GBJWVQAY", name = "m", descriptor = "[I")
    public static int[] field931;

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(III[I)V")
    public static void method284(int arg0, int arg1, int arg2, int[] arg3) {
        field931 = arg3;
        field932 = arg1;
        if (arg2 >= 0) {
            field929 = !field929;
        }
        field933 = arg0;
        method286(0, 0, (byte) 21, arg1, arg0);
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(I)V")
    public static void method285(int arg0) {
        field936 = 0;
        field934 = 0;
        field937 = field932;
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field935 = field933;
        field938 = field937 - 1;
        field939 = field937 / 2;
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIBII)V")
    public static void method286(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 > field932) {
            arg3 = field932;
        }
        if (arg4 > field933) {
            arg4 = field933;
        }
        field936 = arg1;
        field934 = arg0;
        field937 = arg3;
        field935 = arg4;
        field938 = field937 - 1;
        field939 = field937 / 2;
        if (field926 != arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field940 = field935 / 2;
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(Z)V")
    public static void method287(boolean arg0) {
        int var1 = field933 * field932;
        if (arg0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field931[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIIIII)V")
    public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < field936) {
            arg2 -= field936 - arg1;
            arg1 = field936;
        }
        if (arg5 < field934) {
            arg3 -= field934 - arg5;
            arg5 = field934;
        }
        if (arg1 + arg2 > field937) {
            arg2 = field937 - arg1;
        }
        if (arg3 + arg5 > field935) {
            arg3 = field935 - arg5;
        }
        int var7 = 256 - arg0;
        int var8 = (arg6 >> 16 & 0xFF) * arg0;
        int var9 = (arg6 >> 8 & 0xFF) * arg0;
        int var10 = (arg6 & 0xFF) * arg0;
        int var11 = field932 - arg2;
        int var12 = field932 * arg5 + arg1;
        while (arg4 >= 0) {
            field929 = !field929;
        }
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (field931[var12] >> 16 & 0xFF) * var7;
                int var16 = (field931[var12] >> 8 & 0xFF) * var7;
                int var17 = (field931[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field931[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIIII)V")
    public static void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < field936) {
            arg0 -= field936 - arg2;
            arg2 = field936;
        }
        if (arg4 < field934) {
            arg5 -= field934 - arg4;
            arg4 = field934;
        }
        if (arg0 + arg2 > field937) {
            arg0 = field937 - arg2;
        }
        if (arg4 + arg5 > field935) {
            arg5 = field935 - arg4;
        }
        int var6 = field932 - arg0;
        int var7 = field932 * arg4 + arg2;
        if (arg1 != 2) {
            field930 = -191;
        }
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg0; var9 < 0; var9++) {
                field931[var7++] = arg3;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "b", descriptor = "(IIIIII)V")
    public static void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method292(arg4, arg3, 0, arg5, arg1);
        method292(arg4, arg3, 0, arg0 + arg5 - 1, arg1);
        method294(arg0, arg5, arg3, arg1, (byte) 105);
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method294(arg0, arg5, arg3 + arg4 - 1, arg1, (byte) 105);
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "b", descriptor = "(IIIIIII)V")
    public static void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method293(arg6, arg2, arg0, arg1, arg3, true);
        int var7 = 7 / arg5;
        method293(arg6, arg2, arg0, arg1 + arg4 - 1, arg3, true);
        if (arg4 >= 3) {
            method295(arg4 - 2, 278, arg0, arg2, arg1 + 1, arg6);
            method295(arg4 - 2, 278, arg0, arg2 + arg3 - 1, arg1 + 1, arg6);
        }
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIII)V")
    public static void method292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < field934 || arg3 >= field935) {
            return;
        }
        if (arg1 < field936) {
            arg0 -= field936 - arg1;
            arg1 = field936;
        }
        if (arg0 + arg1 > field937) {
            arg0 = field937 - arg1;
        }
        int var5 = field932 * arg3 + arg1;
        if (arg2 == 0) {
            for (int var6 = 0; var6 < arg0; var6++) {
                field931[var5 + var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIIIZ)V")
    public static void method293(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 < field934 || arg3 >= field935) {
            return;
        }
        if (arg1 < field936) {
            arg4 -= field936 - arg1;
            arg1 = field936;
        }
        if (arg1 + arg4 > field937) {
            arg4 = field937 - arg1;
        }
        int var6 = 256 - arg0;
        int var7 = (arg2 >> 16 & 0xFF) * arg0;
        int var8 = (arg2 >> 8 & 0xFF) * arg0;
        int var9 = (arg2 & 0xFF) * arg0;
        if (!arg5) {
            field930 = 63;
        }
        int var10 = field932 * arg3 + arg1;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field931[var10] >> 16 & 0xFF) * var6;
            int var13 = (field931[var10] >> 8 & 0xFF) * var6;
            int var14 = (field931[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field931[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIIB)V")
    public static void method294(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg2 < field936 || arg2 >= field937) {
            return;
        }
        if (arg1 < field934) {
            arg0 -= field934 - arg1;
            arg1 = field934;
        }
        if (arg0 + arg1 > field935) {
            arg0 = field935 - arg1;
        }
        int var5 = field932 * arg1 + arg2;
        if (arg4 == 105) {
            for (int var6 = 0; var6 < arg0; var6++) {
                field931[field932 * var6 + var5] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!GBJWVQAY", name = "c", descriptor = "(IIIIII)V")
    public static void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field936 || arg3 >= field937) {
            return;
        }
        if (arg4 < field934) {
            arg0 -= field934 - arg4;
            arg4 = field934;
        }
        if (arg0 + arg4 > field935) {
            arg0 = field935 - arg4;
        }
        int var6 = 256 - arg5;
        if (arg1 <= 0) {
            field928 = !field928;
        }
        int var7 = (arg2 >> 16 & 0xFF) * arg5;
        int var8 = (arg2 >> 8 & 0xFF) * arg5;
        int var9 = (arg2 & 0xFF) * arg5;
        int var10 = field932 * arg4 + arg3;
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = (field931[var10] >> 16 & 0xFF) * var6;
            int var13 = (field931[var10] >> 8 & 0xFF) * var6;
            int var14 = (field931[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field931[var10] = var15;
            var10 += field932;
        }
    }
}
