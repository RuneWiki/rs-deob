import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "i", descriptor = "I")
    private static int field627 = -37;

    @OriginalMember(owner = "gb", name = "j", descriptor = "B")
    private static byte field628 = 5;

    @OriginalMember(owner = "gb", name = "k", descriptor = "I")
    private static int field629 = -646;

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private static int field630 = 9527;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "gb", name = "w", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "gb", name = "x", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Z")
    private static boolean field631;

    @OriginalMember(owner = "gb", name = "n", descriptor = "[I")
    public static int[] field632;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I[IIB)V")
    public static void method152(int arg0, int[] arg1, int arg2, byte arg3) {
        field632 = arg1;
        if (field628 != arg3) {
            field630 = -101;
        }
        field633 = arg0;
        field634 = arg2;
        method154(0, arg2, arg0, 0, -227);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)V")
    public static void method153(int arg0) {
        field637 = 0;
        if (arg0 >= 0) {
            return;
        }
        field635 = 0;
        field638 = field633;
        field636 = field634;
        field639 = field638 - 1;
        field640 = field638 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg2 > field633) {
            arg2 = field633;
        }
        if (arg1 > field634) {
            arg1 = field634;
        }
        field637 = arg0;
        field635 = arg3;
        field638 = arg2;
        while (arg4 >= 0) {
        }
        field636 = arg1;
        field639 = field638 - 1;
        field640 = field638 / 2;
        field641 = field636 / 2;
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(I)V")
    public static void method155(int arg0) {
        int var1 = field634 * field633;
        if (arg0 != 17698) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field632[var3] = 0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIZII)V")
    public static void method156(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg3 < field637) {
            arg2 -= field637 - arg3;
            arg3 = field637;
        }
        if (arg1 < field635) {
            arg0 -= field635 - arg1;
            arg1 = field635;
        }
        if (arg2 + arg3 > field638) {
            arg2 = field638 - arg3;
        }
        if (arg0 + arg1 > field636) {
            arg0 = field636 - arg1;
        }
        int var7 = 256 - arg5;
        int var8 = (arg6 >> 16 & 0xFF) * arg5;
        int var9 = (arg6 >> 8 & 0xFF) * arg5;
        int var10 = (arg6 & 0xFF) * arg5;
        if (!arg4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = field633 - arg2;
        int var13 = field633 * arg1 + arg3;
        for (int var14 = 0; var14 < arg0; var14++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                int var16 = (field632[var13] >> 16 & 0xFF) * var7;
                int var17 = (field632[var13] >> 8 & 0xFF) * var7;
                int var18 = (field632[var13] & 0xFF) * var7;
                int var19 = (var10 + var18 >> 8) + (var8 + var16 >> 8 << 16) + (var9 + var17 >> 8 << 8);
                field632[var13++] = var19;
            }
            var13 += var12;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(ZIIIII)V")
    public static void method157(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            return;
        }
        if (arg1 < field637) {
            arg2 -= field637 - arg1;
            arg1 = field637;
        }
        if (arg4 < field635) {
            arg5 -= field635 - arg4;
            arg4 = field635;
        }
        if (arg1 + arg2 > field638) {
            arg2 = field638 - arg1;
        }
        if (arg4 + arg5 > field636) {
            arg5 = field636 - arg4;
        }
        int var6 = field633 - arg2;
        int var7 = field633 * arg4 + arg1;
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field632[var7++] = arg3;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method160(arg3, arg4, false, arg1, arg0);
        method160(arg3 + arg5 - 1, arg4, false, arg1, arg0);
        method162(arg5, arg0, arg3, -825, arg1);
        method162(arg5, arg0, arg3, -825, arg1 + arg4 - 1);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method161(arg5, arg1, arg4, arg3, arg0, -646);
        if (arg2 < 3 || arg2 > 3) {
            field627 = -110;
        }
        method161(arg5, arg1, arg4, arg3 + arg6 - 1, arg0, -646);
        if (arg6 >= 3) {
            method163(arg0, arg6 - 2, arg3 + 1, true, arg4, arg5);
            method163(arg0, arg6 - 2, arg3 + 1, true, arg1 + arg4 - 1, arg5);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIZII)V")
    public static void method160(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2 || (arg0 < field635 || arg0 >= field636)) {
            return;
        }
        if (arg3 < field637) {
            arg1 -= field637 - arg3;
            arg3 = field637;
        }
        if (arg1 + arg3 > field638) {
            arg1 = field638 - arg3;
        }
        int var5 = field633 * arg0 + arg3;
        for (int var6 = 0; var6 < arg1; var6++) {
            field632[var5 + var6] = arg4;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field635 || arg3 >= field636) {
            return;
        }
        if (arg2 < field637) {
            arg1 -= field637 - arg2;
            arg2 = field637;
        }
        if (arg1 + arg2 > field638) {
            arg1 = field638 - arg2;
        }
        int var6 = 256 - arg4;
        int var7 = (arg0 >> 16 & 0xFF) * arg4;
        int var8 = (arg0 >> 8 & 0xFF) * arg4;
        int var9 = (arg0 & 0xFF) * arg4;
        int var10 = field633 * arg3 + arg2;
        while (arg5 >= 0) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field632[var10] >> 16 & 0xFF) * var6;
            int var13 = (field632[var10] >> 8 & 0xFF) * var6;
            int var14 = (field632[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field632[var10++] = var15;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field637 || arg4 >= field638) {
            return;
        }
        if (arg2 < field635) {
            arg0 -= field635 - arg2;
            arg2 = field635;
        }
        if (arg0 + arg2 > field636) {
            arg0 = field636 - arg2;
        }
        int var5 = field633 * arg2 + arg4;
        while (arg3 >= 0) {
            field631 = true;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            field632[field633 * var6 + var5] = arg1;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIZII)V")
    public static void method163(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            field629 = 284;
        }
        if (arg4 < field637 || arg4 >= field638) {
            return;
        }
        if (arg2 < field635) {
            arg1 -= field635 - arg2;
            arg2 = field635;
        }
        if (arg1 + arg2 > field636) {
            arg1 = field636 - arg2;
        }
        int var6 = 256 - arg0;
        int var7 = (arg5 >> 16 & 0xFF) * arg0;
        int var8 = (arg5 >> 8 & 0xFF) * arg0;
        int var9 = (arg5 & 0xFF) * arg0;
        int var10 = field633 * arg2 + arg4;
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field632[var10] >> 16 & 0xFF) * var6;
            int var13 = (field632[var10] >> 8 & 0xFF) * var6;
            int var14 = (field632[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field632[var10] = var15;
            var10 += field633;
        }
    }
}
