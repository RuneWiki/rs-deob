import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class21 extends class16 {

    @OriginalMember(owner = "mapview!l", name = "s", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "mapview!l", name = "r", descriptor = "I")
    public static int field288 = 0;

    @OriginalMember(owner = "mapview!l", name = "t", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "mapview!l", name = "v", descriptor = "I")
    public static int field292 = 0;

    @OriginalMember(owner = "mapview!l", name = "u", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "mapview!l", name = "w", descriptor = "I")
    private static int field293;

    @OriginalMember(owner = "mapview!l", name = "x", descriptor = "[I")
    public static int[] field294;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(III)V", line = 3)
    private static final void method128(int arg0, int arg1, int arg2) {
        if (arg0 >= field292 && arg1 >= field290 && arg0 < field289 && arg1 < field288) {
            field294[field291 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIII)V", line = 10)
    private static final void method129(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field291) {
            arg2 = field291;
        }
        if (arg3 > field293) {
            arg3 = field293;
        }
        field292 = arg0;
        field290 = arg1;
        field289 = arg2;
        field288 = arg3;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([III)V", line = 30)
    public static final void method130(int[] arg0, int arg1, int arg2) {
        field294 = arg0;
        field291 = arg1;
        field293 = arg2;
        method129(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(IIII)V", line = 43)
    private static final void method131(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method128(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field290) {
            var4 = field290;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field288) {
            var5 = field288;
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
            if (var12 < field292) {
                var12 = field292;
            }
            int var13 = arg0 + var8;
            if (var13 > field289) {
                var13 = field289;
            }
            int var14 = field291 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field294[var14++] = arg3;
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
            if (var21 < field292) {
                var21 = field292;
            }
            int var22 = arg0 + var16;
            if (var22 > field289 - 1) {
                var22 = field289 - 1;
            }
            int var23 = field291 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field294[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "()V", line = 153)
    public static final void method132() {
        int var0 = 0;
        int var1 = field293 * field291 - 7;
        while (var0 < var1) {
            field294[var0++] = 0;
            field294[var0++] = 0;
            field294[var0++] = 0;
            field294[var0++] = 0;
            field294[var0++] = 0;
            field294[var0++] = 0;
            field294[var0++] = 0;
            field294[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field294[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(IIII)V", line = 182)
    public static final void method133(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field290 || arg1 >= field288) {
            return;
        }
        if (arg0 < field292) {
            arg2 -= field292 - arg0;
            arg0 = field292;
        }
        if (arg0 + arg2 > field289) {
            arg2 = field289 - arg0;
        }
        int var4 = field291 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field294[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIII)V", line = 206)
    public static final void method134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field292) {
            arg2 -= field292 - arg0;
            arg0 = field292;
        }
        if (arg1 < field290) {
            arg3 -= field290 - arg1;
            arg1 = field290;
        }
        if (arg0 + arg2 > field289) {
            arg2 = field289 - arg0;
        }
        if (arg1 + arg3 > field288) {
            arg3 = field288 - arg1;
        }
        int var5 = field291 - arg2;
        int var6 = field291 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field294[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "()V", line = 249)
    public static void method135() {
        field294 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(IIIII)V", line = 265)
    public static final void method136(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method133(arg0, arg1, arg2, arg4);
        method133(arg0, arg1 + arg3 - 1, arg2, arg4);
        method138(arg0, arg1, arg3, arg4);
        method138(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(IIIII)V", line = 281)
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method131(arg0, arg1, arg2, arg3);
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
        if (var9 < field290) {
            var9 = field290;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field288) {
            var10 = field288;
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
            if (var17 < field292) {
                var17 = field292;
            }
            int var18 = arg0 + var13;
            if (var18 > field289) {
                var18 = field289;
            }
            int var19 = field291 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field294[var19] >> 16 & 0xFF) * var5;
                int var22 = (field294[var19] >> 8 & 0xFF) * var5;
                int var23 = (field294[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field294[var19++] = var24;
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
            if (var30 < field292) {
                var30 = field292;
            }
            int var31 = arg0 + var25;
            if (var31 > field289 - 1) {
                var31 = field289 - 1;
            }
            int var32 = field291 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field294[var32] >> 16 & 0xFF) * var5;
                int var35 = (field294[var32] >> 8 & 0xFF) * var5;
                int var36 = (field294[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field294[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "(IIII)V", line = 416)
    public static final void method138(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field292 || arg0 >= field289) {
            return;
        }
        if (arg1 < field290) {
            arg2 -= field290 - arg1;
            arg1 = field290;
        }
        if (arg1 + arg2 > field288) {
            arg2 = field288 - arg1;
        }
        int var4 = field291 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field294[field291 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIIII)V", line = 440)
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field292) {
            arg2 -= field292 - arg0;
            arg0 = field292;
        }
        if (arg1 < field290) {
            arg3 -= field290 - arg1;
            arg1 = field290;
        }
        if (arg0 + arg2 > field289) {
            arg2 = field289 - arg0;
        }
        if (arg1 + arg3 > field288) {
            arg3 = field288 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field291 - arg2;
        int var9 = field291 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field294[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field294[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }
}
