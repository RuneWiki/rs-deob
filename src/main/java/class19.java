import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FBOVVAQK")
public class class19 extends class1 {

    @OriginalMember(owner = "FBOVVAQK", name = "j", descriptor = "I")
    private static int field681 = -13196;

    @OriginalMember(owner = "FBOVVAQK", name = "k", descriptor = "I")
    private static int field682 = -673;

    @OriginalMember(owner = "FBOVVAQK", name = "l", descriptor = "Z")
    private static boolean field683 = true;

    @OriginalMember(owner = "FBOVVAQK", name = "n", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "FBOVVAQK", name = "o", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "FBOVVAQK", name = "p", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "FBOVVAQK", name = "q", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "FBOVVAQK", name = "r", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "FBOVVAQK", name = "s", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "FBOVVAQK", name = "t", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "FBOVVAQK", name = "u", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "FBOVVAQK", name = "v", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "FBOVVAQK", name = "i", descriptor = "Z")
    private static boolean field680;

    @OriginalMember(owner = "FBOVVAQK", name = "w", descriptor = "Z")
    public static boolean field694;

    @OriginalMember(owner = "FBOVVAQK", name = "m", descriptor = "[I")
    public static int[] field684;

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "([IIII)V")
    public static void method230(int[] arg0, int arg1, int arg2, int arg3) {
        field684 = arg0;
        field685 = arg1;
        if (arg3 > 0) {
            field686 = arg2;
            method232(arg1, 0, (byte) -87, arg2, 0);
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "(Z)V")
    public static void method231(boolean arg0) {
        field689 = 0;
        field687 = 0;
        field690 = field685;
        field688 = field686;
        field691 = field690 - 1;
        field692 = field690 / 2;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "(IIBII)V")
    public static void method232(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 > field685) {
            arg0 = field685;
        }
        if (arg3 > field686) {
            arg3 = field686;
        }
        field689 = arg1;
        field687 = arg4;
        field690 = arg0;
        if (arg2 != -87) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field688 = arg3;
        field691 = field690 - 1;
        field692 = field690 / 2;
        field693 = field688 / 2;
    }

    @OriginalMember(owner = "FBOVVAQK", name = "b", descriptor = "(Z)V")
    public static void method233(boolean arg0) {
        if (!arg0) {
            int var1 = field686 * field685;
            for (int var2 = 0; var2 < var1; var2++) {
                field684[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "(IIIIZII)V")
    public static void method234(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 < field689) {
            arg3 -= field689 - arg1;
            arg1 = field689;
        }
        if (arg0 < field687) {
            arg5 -= field687 - arg0;
            arg0 = field687;
        }
        if (arg1 + arg3 > field690) {
            arg3 = field690 - arg1;
        }
        if (arg0 + arg5 > field688) {
            arg5 = field688 - arg0;
        }
        int var7 = 256 - arg2;
        int var8 = (arg6 >> 16 & 0xFF) * arg2;
        int var9 = (arg6 >> 8 & 0xFF) * arg2;
        int var10 = (arg6 & 0xFF) * arg2;
        if (arg4) {
            field680 = !field680;
        }
        int var11 = field685 - arg3;
        int var12 = field685 * arg0 + arg1;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = (field684[var12] >> 16 & 0xFF) * var7;
                int var16 = (field684[var12] >> 8 & 0xFF) * var7;
                int var17 = (field684[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field684[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "(ZIIIII)V")
    public static void method235(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < field689) {
            arg2 -= field689 - arg5;
            arg5 = field689;
        }
        if (arg3 < field687) {
            arg1 -= field687 - arg3;
            arg3 = field687;
        }
        if (arg2 + arg5 > field690) {
            arg2 = field690 - arg5;
        }
        if (arg1 + arg3 > field688) {
            arg1 = field688 - arg3;
        }
        int var6 = field685 - arg2;
        int var7 = field685 * arg3 + arg5;
        for (int var8 = -arg1; var8 < 0; var8++) {
            for (int var9 = -arg2; var9 < 0; var9++) {
                field684[var7++] = arg4;
            }
            var7 += var6;
        }
        if (arg0) {
            field680 = !field680;
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "(IIIIII)V")
    public static void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 3 || arg0 > 3) {
            field680 = !field680;
        }
        method238(arg3, arg4, -518, arg2, arg5);
        method238(arg3, arg4, -518, arg2, arg1 + arg5 - 1);
        method240(arg2, arg5, arg4, arg1, 0);
        method240(arg2 + arg3 - 1, arg5, arg4, arg1, 0);
    }

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "(IIIIIIZ)V")
    public static void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        method239(arg0, 9, arg5, arg1, arg3, arg4);
        if (arg6) {
            field682 = -221;
        }
        method239(arg0, 9, arg5, arg1 + arg2 - 1, arg3, arg4);
        if (arg2 >= 3) {
            method241(arg5, (byte) -121, arg2 - 2, arg0, arg3, arg1 + 1);
            method241(arg4 + arg5 - 1, (byte) -121, arg2 - 2, arg0, arg3, arg1 + 1);
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "(IIIII)V")
    public static void method238(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field687 || arg4 >= field688) {
            return;
        }
        if (arg3 < field689) {
            arg0 -= field689 - arg3;
            arg3 = field689;
        }
        if (arg0 + arg3 > field690) {
            arg0 = field690 - arg3;
        }
        int var5 = field685 * arg4 + arg3;
        while (arg2 >= 0) {
            field682 = -486;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            field684[var5 + var6] = arg1;
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "b", descriptor = "(IIIIII)V")
    public static void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field687 || arg3 >= field688) {
            return;
        }
        if (arg2 < field689) {
            arg5 -= field689 - arg2;
            arg2 = field689;
        }
        if (arg2 + arg5 > field690) {
            arg5 = field690 - arg2;
        }
        int var6 = 256 - arg0;
        int var7 = (arg4 >> 16 & 0xFF) * arg0;
        int var8 = (arg4 >> 8 & 0xFF) * arg0;
        int var9 = (arg4 & 0xFF) * arg0;
        if (arg1 < 9 || arg1 > 9) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = field685 * arg3 + arg2;
        for (int var12 = 0; var12 < arg5; var12++) {
            int var13 = (field684[var11] >> 16 & 0xFF) * var6;
            int var14 = (field684[var11] >> 8 & 0xFF) * var6;
            int var15 = (field684[var11] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field684[var11++] = var16;
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "b", descriptor = "(IIIII)V")
    public static void method240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field681 = -465;
        }
        if (arg0 < field689 || arg0 >= field690) {
            return;
        }
        if (arg1 < field687) {
            arg3 -= field687 - arg1;
            arg1 = field687;
        }
        if (arg1 + arg3 > field688) {
            arg3 = field688 - arg1;
        }
        int var5 = field685 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3; var6++) {
            field684[field685 * var6 + var5] = arg2;
        }
    }

    @OriginalMember(owner = "FBOVVAQK", name = "a", descriptor = "(IBIIII)V")
    public static void method241(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field689 || arg0 >= field690) {
            return;
        }
        if (arg5 < field687) {
            arg2 -= field687 - arg5;
            arg5 = field687;
        }
        if (arg2 + arg5 > field688) {
            arg2 = field688 - arg5;
        }
        int var6 = 256 - arg3;
        int var7 = (arg4 >> 16 & 0xFF) * arg3;
        int var8 = (arg4 >> 8 & 0xFF) * arg3;
        int var9 = (arg4 & 0xFF) * arg3;
        int var10 = field685 * arg5 + arg0;
        if (arg1 != -121) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            int var13 = (field684[var10] >> 16 & 0xFF) * var6;
            int var14 = (field684[var10] >> 8 & 0xFF) * var6;
            int var15 = (field684[var10] & 0xFF) * var6;
            int var16 = (var9 + var15 >> 8) + (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8);
            field684[var10] = var16;
            var10 += field685;
        }
    }
}
