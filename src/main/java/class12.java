import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CXMSQZVC")
public class class12 extends class40 {

    @OriginalMember(owner = "CXMSQZVC", name = "i", descriptor = "Z")
    private static boolean field630 = true;

    @OriginalMember(owner = "CXMSQZVC", name = "j", descriptor = "Z")
    private static boolean field631 = true;

    @OriginalMember(owner = "CXMSQZVC", name = "l", descriptor = "I")
    private static int field633 = 770;

    @OriginalMember(owner = "CXMSQZVC", name = "n", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "CXMSQZVC", name = "o", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "CXMSQZVC", name = "p", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "CXMSQZVC", name = "q", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "CXMSQZVC", name = "r", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "CXMSQZVC", name = "s", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "CXMSQZVC", name = "t", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "CXMSQZVC", name = "u", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "CXMSQZVC", name = "v", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "CXMSQZVC", name = "k", descriptor = "Z")
    private static boolean field632;

    @OriginalMember(owner = "CXMSQZVC", name = "w", descriptor = "Z")
    public static boolean field644;

    @OriginalMember(owner = "CXMSQZVC", name = "m", descriptor = "[I")
    public static int[] field634;

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(III[I)V")
    public static void method197(int arg0, int arg1, int arg2, int[] arg3) {
        field634 = arg3;
        field635 = arg2;
        if (arg1 != 4) {
            field633 = 325;
        }
        field636 = arg0;
        method199(arg0, 0, 0, (byte) 6, arg2);
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(I)V")
    public static void method198(int arg0) {
        field639 = 0;
        field637 = 0;
        field640 = field635;
        field638 = field636;
        field641 = field640 - 1;
        field642 = field640 / 2;
        int var1 = 99 / arg0;
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(IIIBI)V")
    public static void method199(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg4 > field635) {
            arg4 = field635;
        }
        if (arg0 > field636) {
            arg0 = field636;
        }
        field639 = arg2;
        field637 = arg1;
        field640 = arg4;
        if (arg3 != 6) {
            return;
        }
        boolean var5 = false;
        field638 = arg0;
        field641 = field640 - 1;
        field642 = field640 / 2;
        field643 = field638 / 2;
    }

    @OriginalMember(owner = "CXMSQZVC", name = "b", descriptor = "(I)V")
    public static void method200(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            field631 = !field631;
        }
        int var1 = field636 * field635;
        for (int var2 = 0; var2 < var1; var2++) {
            field634[var2] = 0;
        }
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(ZIIIIII)V")
    public static void method201(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (arg5 < field639) {
            arg6 -= field639 - arg5;
            arg5 = field639;
        }
        if (arg2 < field637) {
            arg3 -= field637 - arg2;
            arg2 = field637;
        }
        if (arg5 + arg6 > field640) {
            arg6 = field640 - arg5;
        }
        if (arg2 + arg3 > field638) {
            arg3 = field638 - arg2;
        }
        int var8 = 256 - arg4;
        int var9 = (arg1 >> 16 & 0xFF) * arg4;
        int var10 = (arg1 >> 8 & 0xFF) * arg4;
        int var11 = (arg1 & 0xFF) * arg4;
        int var12 = field635 - arg6;
        int var13 = field635 * arg2 + arg5;
        for (int var14 = 0; var14 < arg3; var14++) {
            for (int var15 = -arg6; var15 < 0; var15++) {
                int var16 = (field634[var13] >> 16 & 0xFF) * var8;
                int var17 = (field634[var13] >> 8 & 0xFF) * var8;
                int var18 = (field634[var13] & 0xFF) * var8;
                int var19 = (var11 + var18 >> 8) + (var9 + var16 >> 8 << 16) + (var10 + var17 >> 8 << 8);
                field634[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(IIIIII)V")
    public static void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field639) {
            arg2 -= field639 - arg1;
            arg1 = field639;
        }
        if (arg4 < field637) {
            arg5 -= field637 - arg4;
            arg4 = field637;
        }
        if (arg1 + arg2 > field640) {
            arg2 = field640 - arg1;
        }
        if (arg4 + arg5 > field638) {
            arg5 = field638 - arg4;
        }
        int var6 = field635 - arg2;
        int var7 = field635 * arg4 + arg1;
        if (arg3 != 8) {
            return;
        }
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field634[var7++] = arg0;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(IIIIZI)V")
    public static void method203(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            field633 = 403;
        }
        method205(arg5, arg2, (byte) -92, arg3, arg0);
        method205(arg5, arg2, (byte) -92, arg3, arg0 + arg1 - 1);
        method207(arg2, arg1, arg0, arg3, (byte) -85);
        method207(arg2, arg1, arg0, arg3 + arg5 - 1, (byte) -85);
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(IIIIIII)V")
    public static void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            field631 = !field631;
        }
        method206(-14852, arg3, arg2, arg5, arg1, arg6);
        method206(-14852, arg3, arg2, arg4 + arg5 - 1, arg1, arg6);
        if (arg4 >= 3) {
            method208(arg3, arg2, arg6, arg5 + 1, (byte) -25, arg4 - 2);
            method208(arg1 + arg3 - 1, arg2, arg6, arg5 + 1, (byte) -25, arg4 - 2);
        }
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(IIBII)V")
    public static void method205(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -92 || (arg4 < field637 || arg4 >= field638)) {
            return;
        }
        if (arg3 < field639) {
            arg0 -= field639 - arg3;
            arg3 = field639;
        }
        if (arg0 + arg3 > field640) {
            arg0 = field640 - arg3;
        }
        int var5 = field635 * arg4 + arg3;
        for (int var6 = 0; var6 < arg0; var6++) {
            field634[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "CXMSQZVC", name = "b", descriptor = "(IIIIII)V")
    public static void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field637 || arg3 >= field638) {
            return;
        }
        if (arg1 < field639) {
            arg4 -= field639 - arg1;
            arg1 = field639;
        }
        if (arg1 + arg4 > field640) {
            arg4 = field640 - arg1;
        }
        int var6 = 256 - arg2;
        int var7 = (arg5 >> 16 & 0xFF) * arg2;
        int var8 = (arg5 >> 8 & 0xFF) * arg2;
        int var9 = (arg5 & 0xFF) * arg2;
        if (arg0 != -14852) {
            return;
        }
        int var10 = field635 * arg3 + arg1;
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field634[var10] >> 16 & 0xFF) * var6;
            int var13 = (field634[var10] >> 8 & 0xFF) * var6;
            int var14 = (field634[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field634[var10++] = var15;
        }
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(IIIIB)V")
    public static void method207(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg3 < field639 || arg3 >= field640) {
            return;
        }
        if (arg2 < field637) {
            arg1 -= field637 - arg2;
            arg2 = field637;
        }
        if (arg1 + arg2 > field638) {
            arg1 = field638 - arg2;
        }
        int var5 = field635 * arg2 + arg3;
        if (arg4 != -85) {
            field632 = !field632;
        }
        for (int var6 = 0; var6 < arg1; var6++) {
            field634[field635 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "CXMSQZVC", name = "a", descriptor = "(IIIIBI)V")
    public static void method208(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -25 || (arg0 < field639 || arg0 >= field640)) {
            return;
        }
        if (arg3 < field637) {
            arg5 -= field637 - arg3;
            arg3 = field637;
        }
        if (arg3 + arg5 > field638) {
            arg5 = field638 - arg3;
        }
        int var6 = 256 - arg1;
        int var7 = (arg2 >> 16 & 0xFF) * arg1;
        int var8 = (arg2 >> 8 & 0xFF) * arg1;
        int var9 = (arg2 & 0xFF) * arg1;
        int var10 = field635 * arg3 + arg0;
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field634[var10] >> 16 & 0xFF) * var6;
            int var13 = (field634[var10] >> 8 & 0xFF) * var6;
            int var14 = (field634[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field634[var10] = var15;
            var10 += field635;
        }
    }
}
