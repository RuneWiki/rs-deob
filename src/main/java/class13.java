import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class13 extends class17 {

    @OriginalMember(owner = "mapview!ga", name = "B", descriptor = "I")
    public static int field128 = 0;

    @OriginalMember(owner = "mapview!ga", name = "D", descriptor = "I")
    public static int field130 = 0;

    @OriginalMember(owner = "mapview!ga", name = "A", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "mapview!ga", name = "F", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "mapview!ga", name = "C", descriptor = "I")
    private static int field129;

    @OriginalMember(owner = "mapview!ga", name = "E", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "mapview!ga", name = "z", descriptor = "[I")
    public static int[] field126;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "()V", line = 4)
    public static final void method88() {
        int var0 = 0;
        int var1 = field131 * field129 - 7;
        while (var0 < var1) {
            field126[var0++] = 0;
            field126[var0++] = 0;
            field126[var0++] = 0;
            field126[var0++] = 0;
            field126[var0++] = 0;
            field126[var0++] = 0;
            field126[var0++] = 0;
            field126[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field126[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IIIIII)V", line = 26)
    public static final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field127) {
            arg2 -= field127 - arg0;
            arg0 = field127;
        }
        if (arg1 < field130) {
            arg3 -= field130 - arg1;
            arg1 = field130;
        }
        if (arg0 + arg2 > field128) {
            arg2 = field128 - arg0;
        }
        if (arg1 + arg3 > field132) {
            arg3 = field132 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field131 - arg2;
        int var9 = field131 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field126[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field126[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IIIII)V", line = 77)
    public static final void method90(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method97(arg0, arg1, arg2, arg4);
        method97(arg0, arg1 + arg3 - 1, arg2, arg4);
        method94(arg0, arg1, arg3, arg4);
        method94(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(III)V", line = 89)
    private static final void method91(int arg0, int arg1, int arg2) {
        if (arg0 >= field127 && arg1 >= field130 && arg0 < field128 && arg1 < field132) {
            field126[field131 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IIII)V", line = 100)
    private static final void method92(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field131) {
            arg2 = field131;
        }
        if (arg3 > field129) {
            arg3 = field129;
        }
        field127 = arg0;
        field130 = arg1;
        field128 = arg2;
        field132 = arg3;
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(IIIII)V", line = 118)
    public static final void method93(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method95(arg0, arg1, arg2, arg3);
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
        if (var9 < field130) {
            var9 = field130;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field132) {
            var10 = field132;
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
            if (var17 < field127) {
                var17 = field127;
            }
            int var18 = arg0 + var13;
            if (var18 > field128) {
                var18 = field128;
            }
            int var19 = field131 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field126[var19] >> 16 & 0xFF) * var5;
                int var22 = (field126[var19] >> 8 & 0xFF) * var5;
                int var23 = (field126[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field126[var19++] = var24;
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
            if (var30 < field127) {
                var30 = field127;
            }
            int var31 = arg0 + var25;
            if (var31 > field128 - 1) {
                var31 = field128 - 1;
            }
            int var32 = field131 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field126[var32] >> 16 & 0xFF) * var5;
                int var35 = (field126[var32] >> 8 & 0xFF) * var5;
                int var36 = (field126[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field126[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(IIII)V", line = 258)
    public static final void method94(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field127 || arg0 >= field128) {
            return;
        }
        if (arg1 < field130) {
            arg2 -= field130 - arg1;
            arg1 = field130;
        }
        if (arg1 + arg2 > field132) {
            arg2 = field132 - arg1;
        }
        int var4 = field131 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field126[field131 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(IIII)V", line = 282)
    private static final void method95(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method91(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field130) {
            var4 = field130;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field132) {
            var5 = field132;
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
            if (var12 < field127) {
                var12 = field127;
            }
            int var13 = arg0 + var8;
            if (var13 > field128) {
                var13 = field128;
            }
            int var14 = field131 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field126[var14++] = arg3;
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
            if (var21 < field127) {
                var21 = field127;
            }
            int var22 = arg0 + var16;
            if (var22 > field128 - 1) {
                var22 = field128 - 1;
            }
            int var23 = field131 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field126[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(IIIII)V", line = 398)
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field127) {
            arg2 -= field127 - arg0;
            arg0 = field127;
        }
        if (arg1 < field130) {
            arg3 -= field130 - arg1;
            arg1 = field130;
        }
        if (arg0 + arg2 > field128) {
            arg2 = field128 - arg0;
        }
        if (arg1 + arg3 > field132) {
            arg3 = field132 - arg1;
        }
        int var5 = field131 - arg2;
        int var6 = field131 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field126[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "(IIII)V", line = 441)
    public static final void method97(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field130 || arg1 >= field132) {
            return;
        }
        if (arg0 < field127) {
            arg2 -= field127 - arg0;
            arg0 = field127;
        }
        if (arg0 + arg2 > field128) {
            arg2 = field128 - arg0;
        }
        int var4 = field131 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field126[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([III)V", line = 479)
    public static final void method98(int[] arg0, int arg1, int arg2) {
        field126 = arg0;
        field131 = arg1;
        field129 = arg2;
        method92(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "()V", line = 497)
    public static void method99() {
        field126 = null;
    }
}
