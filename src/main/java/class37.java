import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class37 extends class10 {

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "I")
    public static int field454 = 0;

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "I")
    private static int field459;

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "[I")
    public static int[] field457;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field455) {
            arg2 -= field455 - arg0;
            arg0 = field455;
        }
        if (arg1 < field458) {
            arg3 -= field458 - arg1;
            arg1 = field458;
        }
        if (arg0 + arg2 > field460) {
            arg2 = field460 - arg0;
        }
        if (arg1 + arg3 > field454) {
            arg3 = field454 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field456 - arg2;
        int var11 = field456 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field457[var11] >> 16 & 0xFF) * var6;
                int var15 = (field457[var11] >> 8 & 0xFF) * var6;
                int var16 = (field457[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field457[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIII)V", line = 63)
    private static final void method232(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method241(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field458) {
            var4 = field458;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field454) {
            var5 = field454;
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
            if (var12 < field455) {
                var12 = field455;
            }
            int var13 = arg0 + var8;
            if (var13 > field460) {
                var13 = field460;
            }
            int var14 = field456 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field457[var14++] = arg3;
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
            if (var21 < field455) {
                var21 = field455;
            }
            int var22 = arg0 + var16;
            if (var22 > field460 - 1) {
                var22 = field460 - 1;
            }
            int var23 = field456 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field457[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIIII)V", line = 169)
    public static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method232(arg0, arg1, arg2, arg3);
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
        if (var9 < field458) {
            var9 = field458;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field454) {
            var10 = field454;
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
            if (var17 < field455) {
                var17 = field455;
            }
            int var18 = arg0 + var13;
            if (var18 > field460) {
                var18 = field460;
            }
            int var19 = field456 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field457[var19] >> 16 & 0xFF) * var5;
                int var22 = (field457[var19] >> 8 & 0xFF) * var5;
                int var23 = (field457[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field457[var19++] = var24;
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
            if (var30 < field455) {
                var30 = field455;
            }
            int var31 = arg0 + var25;
            if (var31 > field460 - 1) {
                var31 = field460 - 1;
            }
            int var32 = field456 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field457[var32] >> 16 & 0xFF) * var5;
                int var35 = (field457[var32] >> 8 & 0xFF) * var5;
                int var36 = (field457[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field457[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(IIII)V", line = 302)
    public static final void method234(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field458 || arg1 >= field454) {
            return;
        }
        if (arg0 < field455) {
            arg2 -= field455 - arg0;
            arg0 = field455;
        }
        if (arg0 + arg2 > field460) {
            arg2 = field460 - arg0;
        }
        int var4 = field456 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field457[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(IIIII)V", line = 328)
    public static final void method235(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field455) {
            arg2 -= field455 - arg0;
            arg0 = field455;
        }
        if (arg1 < field458) {
            arg3 -= field458 - arg1;
            arg1 = field458;
        }
        if (arg0 + arg2 > field460) {
            arg2 = field460 - arg0;
        }
        if (arg1 + arg3 > field454) {
            arg3 = field454 - arg1;
        }
        int var5 = field456 - arg2;
        int var6 = field456 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field457[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "()V", line = 371)
    public static void method236() {
        field457 = null;
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(IIIII)V", line = 385)
    public static final void method237(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method234(arg0, arg1, arg2, arg4);
        method234(arg0, arg1 + arg3 - 1, arg2, arg4);
        method239(arg0, arg1, arg3, arg4);
        method239(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(IIII)V", line = 392)
    private static final void method238(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field456) {
            arg2 = field456;
        }
        if (arg3 > field459) {
            arg3 = field459;
        }
        field455 = arg0;
        field458 = arg1;
        field460 = arg2;
        field454 = arg3;
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(IIII)V", line = 412)
    public static final void method239(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field455 || arg0 >= field460) {
            return;
        }
        if (arg1 < field458) {
            arg2 -= field458 - arg1;
            arg1 = field458;
        }
        if (arg1 + arg2 > field454) {
            arg2 = field454 - arg1;
        }
        int var4 = field456 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field457[field456 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "()V", line = 444)
    public static final void method240() {
        int var0 = 0;
        int var1 = field459 * field456 - 7;
        while (var0 < var1) {
            field457[var0++] = 0;
            field457[var0++] = 0;
            field457[var0++] = 0;
            field457[var0++] = 0;
            field457[var0++] = 0;
            field457[var0++] = 0;
            field457[var0++] = 0;
            field457[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field457[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(III)V", line = 468)
    private static final void method241(int arg0, int arg1, int arg2) {
        if (arg0 >= field455 && arg1 >= field458 && arg0 < field460 && arg1 < field454) {
            field457[field456 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([III)V", line = 478)
    public static final void method242(int[] arg0, int arg1, int arg2) {
        field457 = arg0;
        field456 = arg1;
        field459 = arg2;
        method238(0, 0, arg1, arg2);
    }
}
