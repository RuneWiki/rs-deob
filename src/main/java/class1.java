import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 extends class2 {

    @OriginalMember(owner = "mapview!a", name = "u", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "mapview!a", name = "w", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "mapview!a", name = "x", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "mapview!a", name = "z", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "mapview!a", name = "t", descriptor = "I")
    private static int field1;

    @OriginalMember(owner = "mapview!a", name = "v", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "mapview!a", name = "y", descriptor = "[I")
    public static int[] field6;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "()V", line = 4)
    public static final void method1() {
        int var0 = 0;
        int var1 = field3 * field1 - 7;
        while (var0 < var1) {
            field6[var0++] = 0;
            field6[var0++] = 0;
            field6[var0++] = 0;
            field6[var0++] = 0;
            field6[var0++] = 0;
            field6[var0++] = 0;
            field6[var0++] = 0;
            field6[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field6[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "()V", line = 26)
    public static void method2() {
        field6 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([III)V", line = 30)
    public static final void method3(int[] arg0, int arg1, int arg2) {
        field6 = arg0;
        field3 = arg1;
        field1 = arg2;
        method9(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIII)V", line = 36)
    public static final void method4(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4 || arg1 >= field2) {
            return;
        }
        if (arg0 < field5) {
            arg2 -= field5 - arg0;
            arg0 = field5;
        }
        if (arg0 + arg2 > field7) {
            arg2 = field7 - arg0;
        }
        int var4 = field3 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field6[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIIII)V", line = 60)
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method4(arg0, arg1, arg2, arg4);
        method4(arg0, arg1 + arg3 - 1, arg2, arg4);
        method7(arg0, arg1, arg3, arg4);
        method7(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(IIIII)V", line = 66)
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method12(arg0, arg1, arg2, arg3);
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
        if (var9 < field4) {
            var9 = field4;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field2) {
            var10 = field2;
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
            if (var17 < field5) {
                var17 = field5;
            }
            int var18 = arg0 + var13;
            if (var18 > field7) {
                var18 = field7;
            }
            int var19 = field3 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field6[var19] >> 16 & 0xFF) * var5;
                int var22 = (field6[var19] >> 8 & 0xFF) * var5;
                int var23 = (field6[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field6[var19++] = var24;
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
            if (var30 < field5) {
                var30 = field5;
            }
            int var31 = arg0 + var25;
            if (var31 > field7 - 1) {
                var31 = field7 - 1;
            }
            int var32 = field3 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field6[var32] >> 16 & 0xFF) * var5;
                int var35 = (field6[var32] >> 8 & 0xFF) * var5;
                int var36 = (field6[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field6[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(IIII)V", line = 204)
    public static final void method7(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field5 || arg0 >= field7) {
            return;
        }
        if (arg1 < field4) {
            arg2 -= field4 - arg1;
            arg1 = field4;
        }
        if (arg1 + arg2 > field2) {
            arg2 = field2 - arg1;
        }
        int var4 = field3 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field6[field3 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(III)V", line = 234)
    private static final void method8(int arg0, int arg1, int arg2) {
        if (arg0 >= field5 && arg1 >= field4 && arg0 < field7 && arg1 < field2) {
            field6[field3 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "(IIII)V", line = 249)
    private static final void method9(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field3) {
            arg2 = field3;
        }
        if (arg3 > field1) {
            arg3 = field1;
        }
        field5 = arg0;
        field4 = arg1;
        field7 = arg2;
        field2 = arg3;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIIIII)V", line = 272)
    public static final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field5) {
            arg2 -= field5 - arg0;
            arg0 = field5;
        }
        if (arg1 < field4) {
            arg3 -= field4 - arg1;
            arg1 = field4;
        }
        if (arg0 + arg2 > field7) {
            arg2 = field7 - arg0;
        }
        if (arg1 + arg3 > field2) {
            arg3 = field2 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field3 - arg2;
        int var11 = field3 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field6[var11] >> 16 & 0xFF) * var6;
                int var15 = (field6[var11] >> 8 & 0xFF) * var6;
                int var16 = (field6[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field6[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "(IIIII)V", line = 331)
    public static final void method11(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5) {
            arg2 -= field5 - arg0;
            arg0 = field5;
        }
        if (arg1 < field4) {
            arg3 -= field4 - arg1;
            arg1 = field4;
        }
        if (arg0 + arg2 > field7) {
            arg2 = field7 - arg0;
        }
        if (arg1 + arg3 > field2) {
            arg3 = field2 - arg1;
        }
        int var5 = field3 - arg2;
        int var6 = field3 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field6[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "(IIII)V", line = 379)
    private static final void method12(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method8(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4) {
            var4 = field4;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field2) {
            var5 = field2;
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
            if (var12 < field5) {
                var12 = field5;
            }
            int var13 = arg0 + var8;
            if (var13 > field7) {
                var13 = field7;
            }
            int var14 = field3 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field6[var14++] = arg3;
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
            if (var21 < field5) {
                var21 = field5;
            }
            int var22 = arg0 + var16;
            if (var22 > field7 - 1) {
                var22 = field7 - 1;
            }
            int var23 = field3 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field6[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }
}
