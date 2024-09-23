import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "eb", name = "h", descriptor = "I")
    private static int field504 = 837;

    @OriginalMember(owner = "eb", name = "i", descriptor = "B")
    private static byte field505 = 5;

    @OriginalMember(owner = "eb", name = "k", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "eb", name = "l", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "eb", name = "m", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "eb", name = "n", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "eb", name = "o", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "eb", name = "p", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "eb", name = "q", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "eb", name = "t", descriptor = "Z")
    public static boolean field516;

    @OriginalMember(owner = "eb", name = "j", descriptor = "[I")
    public static int[] field506;

    @OriginalMember(owner = "eb", name = "a", descriptor = "(ZI[II)V")
    public static void method127(boolean arg0, int arg1, int[] arg2, int arg3) {
        field506 = arg2;
        if (!arg0) {
            field504 = 256;
        }
        field507 = arg1;
        field508 = arg3;
        method129(arg1, field505, 0, 0, arg3);
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(B)V")
    public static void method128(byte arg0) {
        field511 = 0;
        if (arg0 == 9) {
            boolean var1 = false;
        } else {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field509 = 0;
        field512 = field507;
        field510 = field508;
        field513 = field512 - 1;
        field514 = field512 / 2;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IBIII)V")
    public static void method129(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg0 > field507) {
            arg0 = field507;
        }
        if (arg4 > field508) {
            arg4 = field508;
        }
        field511 = arg2;
        field509 = arg3;
        field512 = arg0;
        if (arg1 != 5) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field510 = arg4;
        field513 = field512 - 1;
        field514 = field512 / 2;
        field515 = field510 / 2;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(I)V")
    public static void method130(int arg0) {
        int var1 = field508 * field507;
        if (arg0 != 2) {
            field504 = -185;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            field506[var2] = 0;
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IIIZII)V")
    public static void method131(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 < field511) {
            arg1 -= field511 - arg5;
            arg5 = field511;
        }
        if (arg2 < field509) {
            arg4 -= field509 - arg2;
            arg2 = field509;
        }
        if (arg1 + arg5 > field512) {
            arg1 = field512 - arg5;
        }
        if (arg2 + arg4 > field510) {
            arg4 = field510 - arg2;
        }
        int var6 = field507 - arg1;
        int var7 = field507 * arg2 + arg5;
        for (int var8 = -arg4; var8 < 0; var8++) {
            for (int var10 = -arg1; var10 < 0; var10++) {
                field506[var7++] = arg0;
            }
            var7 += var6;
        }
        if (arg3) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IIIIZI)V")
    public static void method132(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        method133(true, arg5, arg3, arg0, arg2);
        if (!arg4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method133(true, arg5, arg1 + arg3 - 1, arg0, arg2);
        method134(arg3, arg2, arg1, false, arg5);
        method134(arg3, arg0 + arg2 - 1, arg1, false, arg5);
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(ZIIII)V")
    public static void method133(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0 || (arg2 < field509 || arg2 >= field510)) {
            return;
        }
        if (arg4 < field511) {
            arg3 -= field511 - arg4;
            arg4 = field511;
        }
        if (arg3 + arg4 > field512) {
            arg3 = field512 - arg4;
        }
        int var5 = field507 * arg2 + arg4;
        for (int var6 = 0; var6 < arg3; var6++) {
            field506[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IIIZI)V")
    public static void method134(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg1 < field511 || arg1 >= field512) {
            return;
        }
        if (arg0 < field509) {
            arg2 -= field509 - arg0;
            arg0 = field509;
        }
        if (arg0 + arg2 > field510) {
            arg2 = field510 - arg0;
        }
        int var5 = field507 * arg0 + arg1;
        if (!arg3) {
            for (int var6 = 0; var6 < arg2; var6++) {
                field506[field507 * var6 + var5] = arg4;
            }
        }
    }
}
