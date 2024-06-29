import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 extends class16 {

    @OriginalMember(owner = "mapview!da", name = "x", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "mapview!da", name = "y", descriptor = "I")
    public static int field111 = 0;

    @OriginalMember(owner = "mapview!da", name = "v", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "mapview!da", name = "A", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "mapview!da", name = "w", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "mapview!da", name = "z", descriptor = "I")
    private static int field112;

    @OriginalMember(owner = "mapview!da", name = "B", descriptor = "[I")
    public static int[] field114;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "([III)V", line = 3)
    public static final void method66(int[] arg0, int arg1, int arg2) {
        field114 = arg0;
        field109 = arg1;
        field112 = arg2;
        method74(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(III)V", line = 13)
    private static final void method67(int arg0, int arg1, int arg2) {
        if (arg0 >= field108 && arg1 >= field110 && arg0 < field111 && arg1 < field113) {
            field114[field109 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "()V", line = 22)
    public static final void method68() {
        int var0 = 0;
        int var1 = field112 * field109 - 7;
        while (var0 < var1) {
            field114[var0++] = 0;
            field114[var0++] = 0;
            field114[var0++] = 0;
            field114[var0++] = 0;
            field114[var0++] = 0;
            field114[var0++] = 0;
            field114[var0++] = 0;
            field114[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field114[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIIII)V", line = 45)
    public static final void method69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method76(arg0, arg1, arg2, arg4);
        method76(arg0, arg1 + arg3 - 1, arg2, arg4);
        method72(arg0, arg1, arg3, arg4);
        method72(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIII)V", line = 51)
    private static final void method70(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method67(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field110) {
            var4 = field110;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field113) {
            var5 = field113;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 + 1 - var8;
            if (var12 < field108) {
                var12 = field108;
            }
            int var13 = arg0 + var8;
            if (var13 > field111) {
                var13 = field111;
            }
            int var14 = field109 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field114[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field108) {
                var21 = field108;
            }
            int var22 = arg0 + var16;
            if (var22 > field111 - 1) {
                var22 = field111 - 1;
            }
            int var23 = field109 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field114[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "()V", line = 165)
    public static void method71() {
        field114 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(IIII)V", line = 174)
    public static final void method72(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field108 || arg0 >= field111) {
            return;
        }
        if (arg1 < field110) {
            arg2 -= field110 - arg1;
            arg1 = field110;
        }
        if (arg1 + arg2 > field113) {
            arg2 = field113 - arg1;
        }
        int var4 = field109 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field114[field109 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIIIII)V", line = 204)
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field108) {
            arg2 -= field108 - arg0;
            arg0 = field108;
        }
        if (arg1 < field110) {
            arg3 -= field110 - arg1;
            arg1 = field110;
        }
        if (arg0 + arg2 > field111) {
            arg2 = field111 - arg0;
        }
        if (arg1 + arg3 > field113) {
            arg3 = field113 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field109 - arg2;
        int var11 = field109 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field114[var11] >> 16 & 0xFF) * var6;
                int var15 = (field114[var11] >> 8 & 0xFF) * var6;
                int var16 = (field114[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field114[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "(IIII)V", line = 263)
    private static final void method74(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field109) {
            arg2 = field109;
        }
        if (arg3 > field112) {
            arg3 = field112;
        }
        field108 = arg0;
        field110 = arg1;
        field111 = arg2;
        field113 = arg3;
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(IIIII)V", line = 293)
    public static final void method75(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field108) {
            arg2 -= field108 - arg0;
            arg0 = field108;
        }
        if (arg1 < field110) {
            arg3 -= field110 - arg1;
            arg1 = field110;
        }
        if (arg0 + arg2 > field111) {
            arg2 = field111 - arg0;
        }
        if (arg1 + arg3 > field113) {
            arg3 = field113 - arg1;
        }
        int var5 = field109 - arg2;
        int var6 = field109 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field114[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "(IIII)V", line = 339)
    public static final void method76(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field110 || arg1 >= field113) {
            return;
        }
        if (arg0 < field108) {
            arg2 -= field108 - arg0;
            arg0 = field108;
        }
        if (arg0 + arg2 > field111) {
            arg2 = field111 - arg0;
        }
        int var4 = field109 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field114[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "(IIIII)V", line = 362)
    public static final void method77(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method70(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field110) {
            var9 = field110;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field113) {
            var10 = field113;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 + 1 - var13;
            if (var17 < field108) {
                var17 = field108;
            }
            int var18 = arg0 + var13;
            if (var18 > field111) {
                var18 = field111;
            }
            int var19 = field109 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field114[var19] >> 16 & 0xFF) * var5;
                int var22 = (field114[var19] >> 8 & 0xFF) * var5;
                int var23 = (field114[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field114[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field108) {
                var30 = field108;
            }
            int var31 = arg0 + var25;
            if (var31 > field111 - 1) {
                var31 = field111 - 1;
            }
            int var32 = field109 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field114[var32] >> 16 & 0xFF) * var5;
                int var35 = (field114[var32] >> 8 & 0xFF) * var5;
                int var36 = (field114[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field114[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }
}
