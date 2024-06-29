import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class40 extends class9 {

    @OriginalMember(owner = "mapview!v", name = "w", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "mapview!v", name = "x", descriptor = "I")
    public static int field517 = 0;

    @OriginalMember(owner = "mapview!v", name = "z", descriptor = "I")
    public static int field519 = 0;

    @OriginalMember(owner = "mapview!v", name = "A", descriptor = "I")
    public static int field520 = 0;

    @OriginalMember(owner = "mapview!v", name = "y", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "mapview!v", name = "B", descriptor = "I")
    private static int field521;

    @OriginalMember(owner = "mapview!v", name = "v", descriptor = "[I")
    public static int[] field515;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(III)V", line = 13)
    private static final void method254(int arg0, int arg1, int arg2) {
        if (arg0 >= field519 && arg1 >= field520 && arg0 < field516 && arg1 < field517) {
            field515[field518 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method255(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field519) {
            arg2 -= field519 - arg0;
            arg0 = field519;
        }
        if (arg1 < field520) {
            arg3 -= field520 - arg1;
            arg1 = field520;
        }
        if (arg0 + arg2 > field516) {
            arg2 = field516 - arg0;
        }
        if (arg1 + arg3 > field517) {
            arg3 = field517 - arg1;
        }
        int var5 = field518 - arg2;
        int var6 = field518 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field515[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "()V", line = 64)
    public static final void method256() {
        int var0 = 0;
        int var1 = field521 * field518 - 7;
        while (var0 < var1) {
            field515[var0++] = 0;
            field515[var0++] = 0;
            field515[var0++] = 0;
            field515[var0++] = 0;
            field515[var0++] = 0;
            field515[var0++] = 0;
            field515[var0++] = 0;
            field515[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field515[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IIII)V", line = 85)
    public static final void method257(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field519 || arg0 >= field516) {
            return;
        }
        if (arg1 < field520) {
            arg2 -= field520 - arg1;
            arg1 = field520;
        }
        if (arg1 + arg2 > field517) {
            arg2 = field517 - arg1;
        }
        int var4 = field518 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field515[field518 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(IIIII)V", line = 111)
    public static final void method258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method264(arg0, arg1, arg2, arg3);
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
        if (var9 < field520) {
            var9 = field520;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field517) {
            var10 = field517;
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
            if (var17 < field519) {
                var17 = field519;
            }
            int var18 = arg0 + var13;
            if (var18 > field516) {
                var18 = field516;
            }
            int var19 = field518 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field515[var19] >> 16 & 0xFF) * var5;
                int var22 = (field515[var19] >> 8 & 0xFF) * var5;
                int var23 = (field515[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field515[var19++] = var24;
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
            if (var30 < field519) {
                var30 = field519;
            }
            int var31 = arg0 + var25;
            if (var31 > field516 - 1) {
                var31 = field516 - 1;
            }
            int var32 = field518 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field515[var32] >> 16 & 0xFF) * var5;
                int var35 = (field515[var32] >> 8 & 0xFF) * var5;
                int var36 = (field515[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field515[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(IIIII)V", line = 245)
    public static final void method259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method262(arg0, arg1, arg2, arg4);
        method262(arg0, arg1 + arg3 - 1, arg2, arg4);
        method257(arg0, arg1, arg3, arg4);
        method257(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IIIIII)V", line = 252)
    public static final void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field519) {
            arg2 -= field519 - arg0;
            arg0 = field519;
        }
        if (arg1 < field520) {
            arg3 -= field520 - arg1;
            arg1 = field520;
        }
        if (arg0 + arg2 > field516) {
            arg2 = field516 - arg0;
        }
        if (arg1 + arg3 > field517) {
            arg3 = field517 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field518 - arg2;
        int var9 = field518 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field515[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field515[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(IIII)V", line = 305)
    private static final void method261(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field518) {
            arg2 = field518;
        }
        if (arg3 > field521) {
            arg3 = field521;
        }
        field519 = arg0;
        field520 = arg1;
        field516 = arg2;
        field517 = arg3;
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(IIII)V", line = 323)
    public static final void method262(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field520 || arg1 >= field517) {
            return;
        }
        if (arg0 < field519) {
            arg2 -= field519 - arg0;
            arg0 = field519;
        }
        if (arg0 + arg2 > field516) {
            arg2 = field516 - arg0;
        }
        int var4 = field518 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field515[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "([III)V", line = 351)
    public static final void method263(int[] arg0, int arg1, int arg2) {
        field515 = arg0;
        field518 = arg1;
        field521 = arg2;
        method261(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "(IIII)V", line = 360)
    private static final void method264(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method254(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field520) {
            var4 = field520;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field517) {
            var5 = field517;
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
            if (var12 < field519) {
                var12 = field519;
            }
            int var13 = arg0 + var8;
            if (var13 > field516) {
                var13 = field516;
            }
            int var14 = field518 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field515[var14++] = arg3;
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
            if (var21 < field519) {
                var21 = field519;
            }
            int var22 = arg0 + var16;
            if (var22 > field516 - 1) {
                var22 = field516 - 1;
            }
            int var23 = field518 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field515[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "()V", line = 480)
    public static void method265() {
        field515 = null;
    }
}
