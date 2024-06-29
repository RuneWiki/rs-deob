import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 extends class36 {

    @OriginalMember(owner = "mapview!aa", name = "r", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "mapview!aa", name = "q", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "mapview!aa", name = "s", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "mapview!aa", name = "u", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "mapview!aa", name = "t", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "mapview!aa", name = "v", descriptor = "I")
    private static int field47;

    @OriginalMember(owner = "mapview!aa", name = "w", descriptor = "[I")
    public static int[] field48;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field42) {
            arg2 -= field42 - arg0;
            arg0 = field42;
        }
        if (arg1 < field44) {
            arg3 -= field44 - arg1;
            arg1 = field44;
        }
        if (arg0 + arg2 > field46) {
            arg2 = field46 - arg0;
        }
        if (arg1 + arg3 > field43) {
            arg3 = field43 - arg1;
        }
        int var5 = field45 - arg2;
        int var6 = field45 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field48[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(IIII)V", line = 53)
    public static final void method7(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field42 || arg0 >= field46) {
            return;
        }
        if (arg1 < field44) {
            arg2 -= field44 - arg1;
            arg1 = field44;
        }
        if (arg1 + arg2 > field43) {
            arg2 = field43 - arg1;
        }
        int var4 = field45 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field48[field45 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "([III)V", line = 79)
    public static final void method8(int[] arg0, int arg1, int arg2) {
        field48 = arg0;
        field45 = arg1;
        field47 = arg2;
        method10(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(IIII)V", line = 85)
    public static final void method9(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field44 || arg1 >= field43) {
            return;
        }
        if (arg0 < field42) {
            arg2 -= field42 - arg0;
            arg0 = field42;
        }
        if (arg0 + arg2 > field46) {
            arg2 = field46 - arg0;
        }
        int var4 = field45 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field48[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "(IIII)V", line = 110)
    private static final void method10(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field45) {
            arg2 = field45;
        }
        if (arg3 > field47) {
            arg3 = field47;
        }
        field42 = arg0;
        field44 = arg1;
        field46 = arg2;
        field43 = arg3;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "()V", line = 132)
    public static final void method11() {
        int var0 = 0;
        int var1 = field47 * field45 - 7;
        while (var0 < var1) {
            field48[var0++] = 0;
            field48[var0++] = 0;
            field48[var0++] = 0;
            field48[var0++] = 0;
            field48[var0++] = 0;
            field48[var0++] = 0;
            field48[var0++] = 0;
            field48[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field48[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(IIIII)V", line = 155)
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method17(arg0, arg1, arg2, arg3);
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
        if (var9 < field44) {
            var9 = field44;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field43) {
            var10 = field43;
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
            if (var17 < field42) {
                var17 = field42;
            }
            int var18 = arg0 + var13;
            if (var18 > field46) {
                var18 = field46;
            }
            int var19 = field45 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field48[var19] >> 16 & 0xFF) * var5;
                int var22 = (field48[var19] >> 8 & 0xFF) * var5;
                int var23 = (field48[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field48[var19++] = var24;
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
            if (var30 < field42) {
                var30 = field42;
            }
            int var31 = arg0 + var25;
            if (var31 > field46 - 1) {
                var31 = field46 - 1;
            }
            int var32 = field45 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field48[var32] >> 16 & 0xFF) * var5;
                int var35 = (field48[var32] >> 8 & 0xFF) * var5;
                int var36 = (field48[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field48[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "()V", line = 289)
    public static void method13() {
        field48 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(IIIIII)V", line = 294)
    public static final void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field42) {
            arg2 -= field42 - arg0;
            arg0 = field42;
        }
        if (arg1 < field44) {
            arg3 -= field44 - arg1;
            arg1 = field44;
        }
        if (arg0 + arg2 > field46) {
            arg2 = field46 - arg0;
        }
        if (arg1 + arg3 > field43) {
            arg3 = field43 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field45 - arg2;
        int var9 = field45 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field48[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field48[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(III)V", line = 355)
    private static final void method15(int arg0, int arg1, int arg2) {
        if (arg0 >= field42 && arg1 >= field44 && arg0 < field46 && arg1 < field43) {
            field48[field45 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "(IIIII)V", line = 362)
    public static final void method16(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method9(arg0, arg1, arg2, arg4);
        method9(arg0, arg1 + arg3 - 1, arg2, arg4);
        method7(arg0, arg1, arg3, arg4);
        method7(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "(IIII)V", line = 385)
    private static final void method17(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method15(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field44) {
            var4 = field44;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field43) {
            var5 = field43;
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
            if (var12 < field42) {
                var12 = field42;
            }
            int var13 = arg0 + var8;
            if (var13 > field46) {
                var13 = field46;
            }
            int var14 = field45 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field48[var14++] = arg3;
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
            if (var21 < field42) {
                var21 = field42;
            }
            int var22 = arg0 + var16;
            if (var22 > field46 - 1) {
                var22 = field46 - 1;
            }
            int var23 = field45 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field48[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }
}
