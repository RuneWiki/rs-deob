import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IIPNJDNO")
public class class29 extends class14 {

    @OriginalMember(owner = "IIPNJDNO", name = "i", descriptor = "Z")
    private static boolean field939 = true;

    @OriginalMember(owner = "IIPNJDNO", name = "k", descriptor = "I")
    private static int field941 = 7;

    @OriginalMember(owner = "IIPNJDNO", name = "m", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "IIPNJDNO", name = "n", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "IIPNJDNO", name = "o", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "IIPNJDNO", name = "p", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "IIPNJDNO", name = "q", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "IIPNJDNO", name = "r", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "IIPNJDNO", name = "s", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "IIPNJDNO", name = "t", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "IIPNJDNO", name = "u", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "IIPNJDNO", name = "j", descriptor = "Z")
    private static boolean field940;

    @OriginalMember(owner = "IIPNJDNO", name = "v", descriptor = "Z")
    public static boolean field952;

    @OriginalMember(owner = "IIPNJDNO", name = "l", descriptor = "[I")
    public static int[] field942;

    @OriginalMember(owner = "IIPNJDNO", name = "a", descriptor = "([IIIZ)V")
    public static void method317(int[] arg0, int arg1, int arg2, boolean arg3) {
        field942 = arg0;
        if (arg3) {
            field943 = arg2;
            field944 = arg1;
            method319(arg2, 7, 0, 0, arg1);
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "a", descriptor = "(I)V")
    public static void method318(int arg0) {
        field947 = 0;
        field945 = 0;
        if (arg0 == 0) {
            field948 = field943;
            field946 = field944;
            field949 = field948 - 1;
            field950 = field948 / 2;
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "a", descriptor = "(IIIII)V")
    public static void method319(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg0 > field943) {
            arg0 = field943;
        }
        if (arg4 > field944) {
            arg4 = field944;
        }
        field947 = arg3;
        if (arg1 < 7 || arg1 > 7) {
            return;
        }
        field945 = arg2;
        field948 = arg0;
        field946 = arg4;
        field949 = field948 - 1;
        field950 = field948 / 2;
        field951 = field946 / 2;
    }

    @OriginalMember(owner = "IIPNJDNO", name = "b", descriptor = "(I)V")
    public static void method320(int arg0) {
        if (arg0 != 7) {
            field941 = -487;
        }
        int var1 = field944 * field943;
        for (int var2 = 0; var2 < var1; var2++) {
            field942[var2] = 0;
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "a", descriptor = "(IIIIIII)V")
    public static void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field947) {
            arg4 -= field947 - arg5;
            arg5 = field947;
        }
        if (arg2 < field945) {
            arg0 -= field945 - arg2;
            arg2 = field945;
        }
        if (arg4 + arg5 > field948) {
            arg4 = field948 - arg5;
        }
        if (arg0 + arg2 > field946) {
            arg0 = field946 - arg2;
        }
        int var7 = 256 - arg3;
        int var8 = (arg6 >> 16 & 0xFF) * arg3;
        int var9 = (arg6 >> 8 & 0xFF) * arg3;
        int var10 = (arg6 & 0xFF) * arg3;
        if (arg1 <= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = field943 - arg4;
        int var13 = field943 * arg2 + arg5;
        for (int var14 = 0; var14 < arg0; var14++) {
            for (int var15 = -arg4; var15 < 0; var15++) {
                int var16 = (field942[var13] >> 16 & 0xFF) * var7;
                int var17 = (field942[var13] >> 8 & 0xFF) * var7;
                int var18 = (field942[var13] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field942[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "a", descriptor = "(BIIIII)V")
    public static void method322(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -37) {
            return;
        }
        if (arg2 < field947) {
            arg4 -= field947 - arg2;
            arg2 = field947;
        }
        if (arg1 < field945) {
            arg5 -= field945 - arg1;
            arg1 = field945;
        }
        if (arg2 + arg4 > field948) {
            arg4 = field948 - arg2;
        }
        if (arg1 + arg5 > field946) {
            arg5 = field946 - arg1;
        }
        int var6 = field943 - arg4;
        int var7 = field943 * arg1 + arg2;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field942[var7++] = arg3;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "a", descriptor = "(IIIIBI)V")
    public static void method323(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        method325((byte) 3, arg1, arg0, arg3, arg2);
        method325((byte) 3, arg1, arg0, arg3, arg2 + arg5 - 1);
        method327(arg1, arg5, arg3, arg2, 1);
        method327(arg1, arg5, arg0 + arg3 - 1, arg2, 1);
        if (arg4 == 87) {
            ;
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "b", descriptor = "(IIIIIII)V")
    public static void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method326(arg5, true, arg0, arg1, arg4, arg2);
        if (arg6 != 0) {
            field940 = !field940;
        }
        method326(arg5, true, arg0, arg1, arg3 + arg4 - 1, arg2);
        if (arg3 >= 3) {
            method328(arg4 + 1, arg0, arg5, arg3 - 2, (byte) 35, arg2);
            method328(arg4 + 1, arg0, arg1 + arg5 - 1, arg3 - 2, (byte) 35, arg2);
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "a", descriptor = "(BIIII)V")
    public static void method325(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field945 || arg4 >= field946) {
            return;
        }
        if (arg3 < field947) {
            arg2 -= field947 - arg3;
            arg3 = field947;
        }
        if (arg2 + arg3 > field948) {
            arg2 = field948 - arg3;
        }
        int var5 = field943 * arg4 + arg3;
        if (arg0 == 3) {
            boolean var6 = false;
            for (int var7 = 0; var7 < arg2; var7++) {
                field942[var5 + var7] = arg1;
            }
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "a", descriptor = "(IZIIII)V")
    public static void method326(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field945 || arg4 >= field946) {
            return;
        }
        if (arg0 < field947) {
            arg3 -= field947 - arg0;
            arg0 = field947;
        }
        if (arg0 + arg3 > field948) {
            arg3 = field948 - arg0;
        }
        int var6 = 256 - arg2;
        if (!arg1) {
            return;
        }
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        int var10 = field943 * arg4 + arg0;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field942[var10] >> 16 & 0xFF) * var6;
            int var13 = (field942[var10] >> 8 & 0xFF) * var6;
            int var14 = (field942[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field942[var10++] = var15;
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "b", descriptor = "(IIIII)V")
    public static void method327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 1 || (arg2 < field947 || arg2 >= field948)) {
            return;
        }
        if (arg3 < field945) {
            arg1 -= field945 - arg3;
            arg3 = field945;
        }
        if (arg1 + arg3 > field946) {
            arg1 = field946 - arg3;
        }
        int var5 = field943 * arg3 + arg2;
        for (int var6 = 0; var6 < arg1; var6++) {
            field942[field943 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "IIPNJDNO", name = "b", descriptor = "(IIIIBI)V")
    public static void method328(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg2 < field947 || arg2 >= field948) {
            return;
        }
        if (arg0 < field945) {
            arg3 -= field945 - arg0;
            arg0 = field945;
        }
        if (arg0 + arg3 > field946) {
            arg3 = field946 - arg0;
        }
        int var6 = 256 - arg1;
        if (arg4 != 35) {
            return;
        }
        int var7 = (arg5 >> 16 & 0xFF) * arg1;
        int var8 = (arg5 >> 8 & 0xFF) * arg1;
        int var9 = (arg5 & 0xFF) * arg1;
        int var10 = field943 * arg0 + arg2;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field942[var10] >> 16 & 0xFF) * var6;
            int var13 = (field942[var10] >> 8 & 0xFF) * var6;
            int var14 = (field942[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field942[var10] = var15;
            var10 += field943;
        }
    }
}
