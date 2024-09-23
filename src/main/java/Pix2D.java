import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix2D extends DoublyLinkable {

    @OriginalMember(owner = "hb", name = "i", descriptor = "I")
    private static int field641 = 741;

    @OriginalMember(owner = "hb", name = "j", descriptor = "B")
    private static byte field642 = 2;

    @OriginalMember(owner = "hb", name = "k", descriptor = "B")
    private static byte field643 = -119;

    @OriginalMember(owner = "hb", name = "m", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "hb", name = "n", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "hb", name = "o", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "hb", name = "p", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "hb", name = "q", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "hb", name = "r", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "hb", name = "s", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "hb", name = "t", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "hb", name = "u", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "hb", name = "v", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "hb", name = "l", descriptor = "[I")
    public static int[] field644;

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIII)V")
    public static void method165(int[] arg0, int arg1, int arg2, int arg3) {
        field644 = arg0;
        field645 = arg2;
        field646 = arg3;
        int var4 = 54 / arg1;
        method167(true, arg2, 0, 0, arg3);
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I)V")
    public static void method166(int arg0) {
        field649 = 0;
        field647 = 0;
        field650 = field645;
        field648 = field646;
        field651 = field650 - 1;
        if (arg0 == 0) {
            field652 = field650 / 2;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(ZIIII)V")
    public static void method167(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg1 > field645) {
            arg1 = field645;
        }
        if (arg4 > field646) {
            arg4 = field646;
        }
        field649 = arg2;
        field647 = arg3;
        field650 = arg1;
        field648 = arg4;
        if (!arg0) {
            field641 = 166;
        }
        field651 = field650 - 1;
        field652 = field650 / 2;
        field653 = field648 / 2;
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(I)V")
    public static void method168(int arg0) {
        if (arg0 < 0) {
            int var1 = field646 * field645;
            for (int var2 = 0; var2 < var1; var2++) {
                field644[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIIII)V")
    public static void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field649) {
            arg2 -= field649 - arg5;
            arg5 = field649;
        }
        if (arg4 < field647) {
            arg1 -= field647 - arg4;
            arg4 = field647;
        }
        if (arg2 + arg5 > field650) {
            arg2 = field650 - arg5;
        }
        if (arg1 + arg4 > field648) {
            arg1 = field648 - arg4;
        }
        int var7 = 256 - arg0;
        int var8 = (arg6 >> 16 & 0xFF) * arg0;
        int var9 = (arg6 >> 8 & 0xFF) * arg0;
        int var10 = (arg6 & 0xFF) * arg0;
        int var11 = field645 - arg2;
        if (arg3 <= 0) {
            field641 = 226;
        }
        int var12 = field645 * arg4 + arg5;
        for (int var13 = 0; var13 < arg1; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = (field644[var12] >> 16 & 0xFF) * var7;
                int var16 = (field644[var12] >> 8 & 0xFF) * var7;
                int var17 = (field644[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field644[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIBI)V")
    public static void method170(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg1 < field649) {
            arg3 -= field649 - arg1;
            arg1 = field649;
        }
        if (arg0 < field647) {
            arg5 -= field647 - arg0;
            arg0 = field647;
        }
        if (arg1 + arg3 > field650) {
            arg3 = field650 - arg1;
        }
        if (arg0 + arg5 > field648) {
            arg5 = field648 - arg0;
        }
        int var6 = field645 - arg3;
        int var7 = field645 * arg0 + arg1;
        if (arg4 != 51) {
            return;
        }
        for (int var8 = -arg5; var8 < 0; var8++) {
            for (int var9 = -arg3; var9 < 0; var9++) {
                field644[var7++] = arg2;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(BIIIII)V")
    public static void method171(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method173(field642, arg1, arg5, arg3, arg2);
        method173(field642, arg1, arg5, arg3, arg2 + arg4 - 1);
        if (arg0 != -97) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method175(arg4, arg1, (byte) -119, arg2, arg5);
        method175(arg4, arg1, (byte) -119, arg2, arg3 + arg5 - 1);
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIZIIII)V")
    public static void method172(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        method174(arg1, arg4, arg5, arg6, 44931, arg3);
        if (arg2) {
            return;
        }
        method174(arg0 + arg1 - 1, arg4, arg5, arg6, 44931, arg3);
        if (arg0 >= 3) {
            method176((byte) -46, arg4, arg1 + 1, arg5, arg6, arg0 - 2);
            method176((byte) -46, arg4, arg1 + 1, arg5, arg3 + arg6 - 1, arg0 - 2);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(BIIII)V")
    public static void method173(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field647 || arg4 >= field648) {
            return;
        }
        if (arg2 < field649) {
            arg3 -= field649 - arg2;
            arg2 = field649;
        }
        if (arg2 + arg3 > field650) {
            arg3 = field650 - arg2;
        }
        int var5 = field645 * arg4 + arg2;
        if (arg0 != 2) {
            field641 = 149;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            field644[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIIII)V")
    public static void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field647 || arg0 >= field648) {
            return;
        }
        if (arg3 < field649) {
            arg5 -= field649 - arg3;
            arg3 = field649;
        }
        if (arg3 + arg5 > field650) {
            arg5 = field650 - arg3;
        }
        int var6 = 256 - arg2;
        int var7 = (arg1 >> 16 & 0xFF) * arg2;
        int var8 = (arg1 >> 8 & 0xFF) * arg2;
        int var9 = (arg1 & 0xFF) * arg2;
        int var10 = field645 * arg0 + arg3;
        if (arg4 != 44931) {
            return;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field644[var10] >> 16 & 0xFF) * var6;
            int var13 = (field644[var10] >> 8 & 0xFF) * var6;
            int var14 = (field644[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field644[var10++] = var15;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIBII)V")
    public static void method175(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (field643 != arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg4 < field649 || arg4 >= field650) {
            return;
        }
        if (arg3 < field647) {
            arg0 -= field647 - arg3;
            arg3 = field647;
        }
        if (arg0 + arg3 > field648) {
            arg0 = field648 - arg3;
        }
        int var6 = field645 * arg3 + arg4;
        for (int var7 = 0; var7 < arg0; var7++) {
            field644[field645 * var7 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(BIIIII)V")
    public static void method176(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < field649 || arg4 >= field650) {
            return;
        }
        if (arg2 < field647) {
            arg5 -= field647 - arg2;
            arg2 = field647;
        }
        if (arg2 + arg5 > field648) {
            arg5 = field648 - arg2;
        }
        int var6 = 256 - arg3;
        int var7 = (arg1 >> 16 & 0xFF) * arg3;
        int var8 = (arg1 >> 8 & 0xFF) * arg3;
        int var9 = (arg1 & 0xFF) * arg3;
        int var10 = field645 * arg2 + arg4;
        if (arg0 != -46) {
            return;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            int var12 = (field644[var10] >> 16 & 0xFF) * var6;
            int var13 = (field644[var10] >> 8 & 0xFF) * var6;
            int var14 = (field644[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field644[var10] = var15;
            var10 += field645;
        }
    }
}
