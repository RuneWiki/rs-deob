import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class17 extends class15 {

    @OriginalMember(owner = "mapview!ia", name = "x", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "mapview!ia", name = "z", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "mapview!ia", name = "C", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "mapview!ia", name = "y", descriptor = "I")
    public static int field178 = 0;

    @OriginalMember(owner = "mapview!ia", name = "w", descriptor = "I")
    private static int field176;

    @OriginalMember(owner = "mapview!ia", name = "B", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "mapview!ia", name = "A", descriptor = "[I")
    public static int[] field180;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "()V", line = 3)
    public static void method119() {
        field180 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IIIIII)V", line = 9)
    public static final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field179) {
            arg2 -= field179 - arg0;
            arg0 = field179;
        }
        if (arg1 < field177) {
            arg3 -= field177 - arg1;
            arg1 = field177;
        }
        if (arg0 + arg2 > field182) {
            arg2 = field182 - arg0;
        }
        if (arg1 + arg3 > field178) {
            arg3 = field178 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field181 - arg2;
        int var11 = field181 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field180[var11] >> 16 & 0xFF) * var6;
                int var15 = (field180[var11] >> 8 & 0xFF) * var6;
                int var16 = (field180[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field180[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "()V", line = 68)
    public static final void method121() {
        int var0 = 0;
        int var1 = field181 * field176 - 7;
        while (var0 < var1) {
            field180[var0++] = 0;
            field180[var0++] = 0;
            field180[var0++] = 0;
            field180[var0++] = 0;
            field180[var0++] = 0;
            field180[var0++] = 0;
            field180[var0++] = 0;
            field180[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field180[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IIII)V", line = 91)
    public static final void method122(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field177 || arg1 >= field178) {
            return;
        }
        if (arg0 < field179) {
            arg2 -= field179 - arg0;
            arg0 = field179;
        }
        if (arg0 + arg2 > field182) {
            arg2 = field182 - arg0;
        }
        int var4 = field181 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field180[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IIIII)V", line = 115)
    public static final void method123(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field179) {
            arg2 -= field179 - arg0;
            arg0 = field179;
        }
        if (arg1 < field177) {
            arg3 -= field177 - arg1;
            arg1 = field177;
        }
        if (arg0 + arg2 > field182) {
            arg2 = field182 - arg0;
        }
        if (arg1 + arg3 > field178) {
            arg3 = field178 - arg1;
        }
        int var5 = field181 - arg2;
        int var6 = field181 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field180[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([III)V", line = 157)
    public static final void method124(int[] arg0, int arg1, int arg2) {
        field180 = arg0;
        field181 = arg1;
        field176 = arg2;
        method126(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(III)V", line = 171)
    private static final void method125(int arg0, int arg1, int arg2) {
        if (arg0 >= field179 && arg1 >= field177 && arg0 < field182 && arg1 < field178) {
            field180[field181 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(IIII)V", line = 182)
    private static final void method126(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field181) {
            arg2 = field181;
        }
        if (arg3 > field176) {
            arg3 = field176;
        }
        field179 = arg0;
        field177 = arg1;
        field182 = arg2;
        field178 = arg3;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(IIIII)V", line = 201)
    public static final void method127(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method128(arg0, arg1, arg2, arg3);
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
        if (var9 < field177) {
            var9 = field177;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field178) {
            var10 = field178;
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
            if (var17 < field179) {
                var17 = field179;
            }
            int var18 = arg0 + var13;
            if (var18 > field182) {
                var18 = field182;
            }
            int var19 = field181 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field180[var19] >> 16 & 0xFF) * var5;
                int var22 = (field180[var19] >> 8 & 0xFF) * var5;
                int var23 = (field180[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field180[var19++] = var24;
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
            if (var30 < field179) {
                var30 = field179;
            }
            int var31 = arg0 + var25;
            if (var31 > field182 - 1) {
                var31 = field182 - 1;
            }
            int var32 = field181 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field180[var32] >> 16 & 0xFF) * var5;
                int var35 = (field180[var32] >> 8 & 0xFF) * var5;
                int var36 = (field180[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field180[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(IIII)V", line = 340)
    private static final void method128(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method125(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field177) {
            var4 = field177;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field178) {
            var5 = field178;
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
            if (var12 < field179) {
                var12 = field179;
            }
            int var13 = arg0 + var8;
            if (var13 > field182) {
                var13 = field182;
            }
            int var14 = field181 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field180[var14++] = arg3;
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
            if (var21 < field179) {
                var21 = field179;
            }
            int var22 = arg0 + var16;
            if (var22 > field182 - 1) {
                var22 = field182 - 1;
            }
            int var23 = field181 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field180[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "(IIII)V", line = 449)
    public static final void method129(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field179 || arg0 >= field182) {
            return;
        }
        if (arg1 < field177) {
            arg2 -= field177 - arg1;
            arg1 = field177;
        }
        if (arg1 + arg2 > field178) {
            arg2 = field178 - arg1;
        }
        int var4 = field181 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field180[field181 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(IIIII)V", line = 481)
    public static final void method130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method122(arg0, arg1, arg2, arg4);
        method122(arg0, arg1 + arg3 - 1, arg2, arg4);
        method129(arg0, arg1, arg3, arg4);
        method129(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
}
