import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class19 extends class29 {

    @OriginalMember(owner = "mapview!ja", name = "v", descriptor = "I")
    public static int field202 = 0;

    @OriginalMember(owner = "mapview!ja", name = "x", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "mapview!ja", name = "y", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "mapview!ja", name = "z", descriptor = "I")
    public static int field206 = 0;

    @OriginalMember(owner = "mapview!ja", name = "t", descriptor = "I")
    private static int field200;

    @OriginalMember(owner = "mapview!ja", name = "u", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "mapview!ja", name = "w", descriptor = "[I")
    public static int[] field203;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "()V", line = 4)
    public static final void method128() {
        int var0 = 0;
        int var1 = field201 * field200 - 7;
        while (var0 < var1) {
            field203[var0++] = 0;
            field203[var0++] = 0;
            field203[var0++] = 0;
            field203[var0++] = 0;
            field203[var0++] = 0;
            field203[var0++] = 0;
            field203[var0++] = 0;
            field203[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field203[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIII)V", line = 28)
    public static final void method129(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field205 || arg0 >= field206) {
            return;
        }
        if (arg1 < field202) {
            arg2 -= field202 - arg1;
            arg1 = field202;
        }
        if (arg1 + arg2 > field204) {
            arg2 = field204 - arg1;
        }
        int var4 = field201 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field203[field201 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(III)V", line = 51)
    private static final void method130(int arg0, int arg1, int arg2) {
        if (arg0 >= field205 && arg1 >= field202 && arg0 < field206 && arg1 < field204) {
            field203[field201 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIIII)V", line = 60)
    public static final void method131(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field205) {
            arg2 -= field205 - arg0;
            arg0 = field205;
        }
        if (arg1 < field202) {
            arg3 -= field202 - arg1;
            arg1 = field202;
        }
        if (arg0 + arg2 > field206) {
            arg2 = field206 - arg0;
        }
        if (arg1 + arg3 > field204) {
            arg3 = field204 - arg1;
        }
        int var5 = field201 - arg2;
        int var6 = field201 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field203[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(IIIII)V", line = 103)
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method139(arg0, arg1, arg2, arg4);
        method139(arg0, arg1 + arg3 - 1, arg2, arg4);
        method129(arg0, arg1, arg3, arg4);
        method129(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIIIII)V", line = 114)
    public static final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field205) {
            arg2 -= field205 - arg0;
            arg0 = field205;
        }
        if (arg1 < field202) {
            arg3 -= field202 - arg1;
            arg1 = field202;
        }
        if (arg0 + arg2 > field206) {
            arg2 = field206 - arg0;
        }
        if (arg1 + arg3 > field204) {
            arg3 = field204 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field201 - arg2;
        int var11 = field201 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field203[var11] >> 16 & 0xFF) * var6;
                int var15 = (field203[var11] >> 8 & 0xFF) * var6;
                int var16 = (field203[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field203[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "()V", line = 172)
    public static void method134() {
        field203 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(IIII)V", line = 176)
    private static final void method135(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method130(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field202) {
            var4 = field202;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field204) {
            var5 = field204;
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
            if (var12 < field205) {
                var12 = field205;
            }
            int var13 = arg0 + var8;
            if (var13 > field206) {
                var13 = field206;
            }
            int var14 = field201 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field203[var14++] = arg3;
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
            if (var21 < field205) {
                var21 = field205;
            }
            int var22 = arg0 + var16;
            if (var22 > field206 - 1) {
                var22 = field206 - 1;
            }
            int var23 = field201 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field203[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([III)V", line = 285)
    public static final void method136(int[] arg0, int arg1, int arg2) {
        field203 = arg0;
        field201 = arg1;
        field200 = arg2;
        method137(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(IIII)V", line = 298)
    private static final void method137(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field201) {
            arg2 = field201;
        }
        if (arg3 > field200) {
            arg3 = field200;
        }
        field205 = arg0;
        field202 = arg1;
        field206 = arg2;
        field204 = arg3;
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(IIIII)V", line = 316)
    public static final void method138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method135(arg0, arg1, arg2, arg3);
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
        if (var9 < field202) {
            var9 = field202;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field204) {
            var10 = field204;
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
            if (var17 < field205) {
                var17 = field205;
            }
            int var18 = arg0 + var13;
            if (var18 > field206) {
                var18 = field206;
            }
            int var19 = field201 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field203[var19] >> 16 & 0xFF) * var5;
                int var22 = (field203[var19] >> 8 & 0xFF) * var5;
                int var23 = (field203[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field203[var19++] = var24;
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
            if (var30 < field205) {
                var30 = field205;
            }
            int var31 = arg0 + var25;
            if (var31 > field206 - 1) {
                var31 = field206 - 1;
            }
            int var32 = field201 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field203[var32] >> 16 & 0xFF) * var5;
                int var35 = (field203[var32] >> 8 & 0xFF) * var5;
                int var36 = (field203[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field203[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "(IIII)V", line = 449)
    public static final void method139(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field202 || arg1 >= field204) {
            return;
        }
        if (arg0 < field205) {
            arg2 -= field205 - arg0;
            arg0 = field205;
        }
        if (arg0 + arg2 > field206) {
            arg2 = field206 - arg0;
        }
        int var4 = field201 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field203[var4 + var5] = arg3;
        }
    }
}
