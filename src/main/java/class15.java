import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class15 extends class1 {

    @OriginalMember(owner = "mapview!ia", name = "y", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "mapview!ia", name = "B", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "mapview!ia", name = "z", descriptor = "I")
    public static int field134 = 0;

    @OriginalMember(owner = "mapview!ia", name = "A", descriptor = "I")
    public static int field135 = 0;

    @OriginalMember(owner = "mapview!ia", name = "C", descriptor = "I")
    private static int field137;

    @OriginalMember(owner = "mapview!ia", name = "E", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "mapview!ia", name = "D", descriptor = "[I")
    public static int[] field138;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "()V", line = 10)
    public static final void method73() {
        int var0 = 0;
        int var1 = field139 * field137 - 7;
        while (var0 < var1) {
            field138[var0++] = 0;
            field138[var0++] = 0;
            field138[var0++] = 0;
            field138[var0++] = 0;
            field138[var0++] = 0;
            field138[var0++] = 0;
            field138[var0++] = 0;
            field138[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field138[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "()V", line = 31)
    public static void method74() {
        field138 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IIIII)V", line = 45)
    public static final void method75(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method83(arg0, arg1, arg2, arg3);
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
        if (var9 < field134) {
            var9 = field134;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field136) {
            var10 = field136;
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
            if (var17 < field135) {
                var17 = field135;
            }
            int var18 = arg0 + var13;
            if (var18 > field133) {
                var18 = field133;
            }
            int var19 = field139 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field138[var19] >> 16 & 0xFF) * var5;
                int var22 = (field138[var19] >> 8 & 0xFF) * var5;
                int var23 = (field138[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field138[var19++] = var24;
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
            if (var30 < field135) {
                var30 = field135;
            }
            int var31 = arg0 + var25;
            if (var31 > field133 - 1) {
                var31 = field133 - 1;
            }
            int var32 = field139 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field138[var32] >> 16 & 0xFF) * var5;
                int var35 = (field138[var32] >> 8 & 0xFF) * var5;
                int var36 = (field138[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field138[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IIIIII)V", line = 178)
    public static final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field135) {
            arg2 -= field135 - arg0;
            arg0 = field135;
        }
        if (arg1 < field134) {
            arg3 -= field134 - arg1;
            arg1 = field134;
        }
        if (arg0 + arg2 > field133) {
            arg2 = field133 - arg0;
        }
        if (arg1 + arg3 > field136) {
            arg3 = field136 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field139 - arg2;
        int var11 = field139 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field138[var11] >> 16 & 0xFF) * var6;
                int var15 = (field138[var11] >> 8 & 0xFF) * var6;
                int var16 = (field138[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field138[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IIII)V", line = 238)
    private static final void method77(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field139) {
            arg2 = field139;
        }
        if (arg3 > field137) {
            arg3 = field137;
        }
        field135 = arg0;
        field134 = arg1;
        field133 = arg2;
        field136 = arg3;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(III)V", line = 259)
    private static final void method78(int arg0, int arg1, int arg2) {
        if (arg0 >= field135 && arg1 >= field134 && arg0 < field133 && arg1 < field136) {
            field138[field139 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([III)V", line = 265)
    public static final void method79(int[] arg0, int arg1, int arg2) {
        field138 = arg0;
        field139 = arg1;
        field137 = arg2;
        method77(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(IIIII)V", line = 278)
    public static final void method80(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field135) {
            arg2 -= field135 - arg0;
            arg0 = field135;
        }
        if (arg1 < field134) {
            arg3 -= field134 - arg1;
            arg1 = field134;
        }
        if (arg0 + arg2 > field133) {
            arg2 = field133 - arg0;
        }
        if (arg1 + arg3 > field136) {
            arg3 = field136 - arg1;
        }
        int var5 = field139 - arg2;
        int var6 = field139 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field138[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(IIII)V", line = 322)
    public static final void method81(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field134 || arg1 >= field136) {
            return;
        }
        if (arg0 < field135) {
            arg2 -= field135 - arg0;
            arg0 = field135;
        }
        if (arg0 + arg2 > field133) {
            arg2 = field133 - arg0;
        }
        int var4 = field139 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field138[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(IIII)V", line = 353)
    public static final void method82(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field135 || arg0 >= field133) {
            return;
        }
        if (arg1 < field134) {
            arg2 -= field134 - arg1;
            arg1 = field134;
        }
        if (arg1 + arg2 > field136) {
            arg2 = field136 - arg1;
        }
        int var4 = field139 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field138[field139 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "(IIII)V", line = 376)
    private static final void method83(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method78(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field134) {
            var4 = field134;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field136) {
            var5 = field136;
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
            if (var12 < field135) {
                var12 = field135;
            }
            int var13 = arg0 + var8;
            if (var13 > field133) {
                var13 = field133;
            }
            int var14 = field139 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field138[var14++] = arg3;
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
            if (var21 < field135) {
                var21 = field135;
            }
            int var22 = arg0 + var16;
            if (var22 > field133 - 1) {
                var22 = field133 - 1;
            }
            int var23 = field139 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field138[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(IIIII)V", line = 484)
    public static final void method84(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method81(arg0, arg1, arg2, arg4);
        method81(arg0, arg1 + arg3 - 1, arg2, arg4);
        method82(arg0, arg1, arg3, arg4);
        method82(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
}
