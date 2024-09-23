import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "gb", name = "j", descriptor = "I")
    private static int field634 = 2;

    @OriginalMember(owner = "gb", name = "l", descriptor = "Z")
    private static boolean field636 = true;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    private static int field638 = 315;

    @OriginalMember(owner = "gb", name = "k", descriptor = "I")
    private static int field635;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "gb", name = "w", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "gb", name = "x", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "gb", name = "y", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Z")
    private static boolean field637;

    @OriginalMember(owner = "gb", name = "o", descriptor = "[I")
    public static int[] field639;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II[II)V")
    public static void method152(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 >= 0) {
            field636 = !field636;
        }
        field639 = arg2;
        field640 = arg1;
        field641 = arg3;
        method154(arg3, 0, -134, arg1, 0);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Z)V")
    public static void method153(boolean arg0) {
        field644 = 0;
        if (arg0) {
            return;
        }
        field642 = 0;
        field645 = field640;
        field643 = field641;
        field646 = field645 - 1;
        field647 = field645 / 2;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIII)V")
    public static void method154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > field640) {
            arg3 = field640;
        }
        if (arg0 > field641) {
            arg0 = field641;
        }
        field644 = arg4;
        field642 = arg1;
        field645 = arg3;
        field643 = arg0;
        while (arg2 >= 0) {
        }
        field646 = field645 - 1;
        field647 = field645 / 2;
        field648 = field643 / 2;
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(Z)V")
    public static void method155(boolean arg0) {
        int var1 = field641 * field640;
        if (arg0) {
            for (int var2 = 0; var2 < var1; var2++) {
                field639[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIZIII)V")
    public static void method156(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            field634 = 127;
        }
        if (arg5 < field644) {
            arg0 -= field644 - arg5;
            arg5 = field644;
        }
        if (arg1 < field642) {
            arg6 -= field642 - arg1;
            arg1 = field642;
        }
        if (arg0 + arg5 > field645) {
            arg0 = field645 - arg5;
        }
        if (arg1 + arg6 > field643) {
            arg6 = field643 - arg1;
        }
        int var7 = 256 - arg2;
        int var8 = (arg4 >> 16 & 0xFF) * arg2;
        int var9 = (arg4 >> 8 & 0xFF) * arg2;
        int var10 = (arg4 & 0xFF) * arg2;
        int var11 = field640 - arg0;
        int var12 = field640 * arg1 + arg5;
        for (int var13 = 0; var13 < arg6; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                int var15 = (field639[var12] >> 16 & 0xFF) * var7;
                int var16 = (field639[var12] >> 8 & 0xFF) * var7;
                int var17 = (field639[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field639[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII)V")
    public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field644) {
            arg5 -= field644 - arg4;
            arg4 = field644;
        }
        if (arg1 < field642) {
            arg2 -= field642 - arg1;
            arg1 = field642;
        }
        if (arg4 + arg5 > field645) {
            arg5 = field645 - arg4;
        }
        if (arg1 + arg2 > field643) {
            arg2 = field643 - arg1;
        }
        int var6 = field640 - arg5;
        int var7 = field640 * arg1 + arg4;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg5; var9 < 0; var9++) {
                field639[var7++] = arg0;
            }
            var7 += var6;
        }
        while (arg3 >= 0) {
            field636 = !field636;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIIII)V")
    public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method160(arg2, arg0, -380, arg5, arg4);
        method160(arg2, arg0, -380, arg3 + arg5 - 1, arg4);
        while (arg1 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method162(arg0, arg4, arg3, -40022, arg5);
        method162(arg0, arg2 + arg4 - 1, arg3, -40022, arg5);
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIIII)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method161(arg3, (byte) 4, arg0, arg4, arg6, arg5);
        method161(arg3, (byte) 4, arg0, arg4, arg2 + arg6 - 1, arg5);
        if (arg1 < 9 || arg1 > 9) {
            field636 = !field636;
        }
        if (arg2 >= 3) {
            method163((byte) 116, arg0, arg6 + 1, arg4, arg2 - 2, arg5);
            method163((byte) 116, arg0, arg6 + 1, arg4, arg2 - 2, arg3 + arg5 - 1);
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= 0 || (arg3 < field642 || arg3 >= field643)) {
            return;
        }
        if (arg4 < field644) {
            arg0 -= field644 - arg4;
            arg4 = field644;
        }
        if (arg0 + arg4 > field645) {
            arg0 = field645 - arg4;
        }
        int var5 = field640 * arg3 + arg4;
        for (int var6 = 0; var6 < arg0; var6++) {
            field639[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IBIIII)V")
    public static void method161(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field642 || arg4 >= field643) {
            return;
        }
        if (arg5 < field644) {
            arg0 -= field644 - arg5;
            arg5 = field644;
        }
        if (arg0 + arg5 > field645) {
            arg0 = field645 - arg5;
        }
        int var6 = 256 - arg2;
        int var7 = (arg3 >> 16 & 0xFF) * arg2;
        int var8 = (arg3 >> 8 & 0xFF) * arg2;
        int var9 = (arg3 & 0xFF) * arg2;
        if (arg1 != 4) {
            return;
        }
        boolean var10 = false;
        int var11 = field640 * arg4 + arg5;
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = (field639[var11] >> 16 & 0xFF) * var6;
            int var14 = (field639[var11] >> 8 & 0xFF) * var6;
            int var15 = (field639[var11] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field639[var11++] = var16;
        }
    }

    @OriginalMember(owner = "gb", name = "c", descriptor = "(IIIII)V")
    public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -40022 || (arg1 < field644 || arg1 >= field645)) {
            return;
        }
        if (arg4 < field642) {
            arg2 -= field642 - arg4;
            arg4 = field642;
        }
        if (arg2 + arg4 > field643) {
            arg2 = field643 - arg4;
        }
        int var5 = field640 * arg4 + arg1;
        for (int var6 = 0; var6 < arg2; var6++) {
            field639[field640 * var6 + var5] = arg0;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(BIIIII)V")
    public static void method163(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field644 || arg5 >= field645) {
            return;
        }
        if (arg2 < field642) {
            arg4 -= field642 - arg2;
            arg2 = field642;
        }
        if (arg2 + arg4 > field643) {
            arg4 = field643 - arg2;
        }
        int var6 = 256 - arg1;
        int var7 = (arg3 >> 16 & 0xFF) * arg1;
        int var8 = (arg3 >> 8 & 0xFF) * arg1;
        int var9 = (arg3 & 0xFF) * arg1;
        int var10 = field640 * arg2 + arg5;
        if (arg0 != 116) {
            field635 = 255;
        }
        for (int var11 = 0; var11 < arg4; var11++) {
            int var12 = (field639[var10] >> 16 & 0xFF) * var6;
            int var13 = (field639[var10] >> 8 & 0xFF) * var6;
            int var14 = (field639[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field639[var10] = var15;
            var10 += field640;
        }
    }
}
