import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class23 extends class28 {

    @OriginalMember(owner = "mapview!l", name = "w", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "mapview!l", name = "A", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "mapview!l", name = "x", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "mapview!l", name = "v", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "mapview!l", name = "y", descriptor = "I")
    private static int field230;

    @OriginalMember(owner = "mapview!l", name = "z", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "mapview!l", name = "u", descriptor = "[I")
    public static int[] field226;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method117(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field227 || arg1 >= field228) {
            return;
        }
        if (arg0 < field229) {
            arg2 -= field229 - arg0;
            arg0 = field229;
        }
        if (arg0 + arg2 > field232) {
            arg2 = field232 - arg0;
        }
        int var4 = field231 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field226[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field229) {
            arg2 -= field229 - arg0;
            arg0 = field229;
        }
        if (arg1 < field227) {
            arg3 -= field227 - arg1;
            arg1 = field227;
        }
        if (arg0 + arg2 > field232) {
            arg2 = field232 - arg0;
        }
        if (arg1 + arg3 > field228) {
            arg3 = field228 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field231 - arg2;
        int var9 = field231 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field226[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field226[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIII)V", line = 89)
    public static final void method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method117(arg0, arg1, arg2, arg4);
        method117(arg0, arg1 + arg3 - 1, arg2, arg4);
        method128(arg0, arg1, arg3, arg4);
        method128(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(IIIII)V", line = 95)
    public static final void method120(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method121(arg0, arg1, arg2, arg3);
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
        if (var9 < field227) {
            var9 = field227;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field228) {
            var10 = field228;
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
            if (var17 < field229) {
                var17 = field229;
            }
            int var18 = arg0 + var13;
            if (var18 > field232) {
                var18 = field232;
            }
            int var19 = field231 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field226[var19] >> 16 & 0xFF) * var5;
                int var22 = (field226[var19] >> 8 & 0xFF) * var5;
                int var23 = (field226[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field226[var19++] = var24;
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
            if (var30 < field229) {
                var30 = field229;
            }
            int var31 = arg0 + var25;
            if (var31 > field232 - 1) {
                var31 = field232 - 1;
            }
            int var32 = field231 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field226[var32] >> 16 & 0xFF) * var5;
                int var35 = (field226[var32] >> 8 & 0xFF) * var5;
                int var36 = (field226[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field226[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(IIII)V", line = 238)
    private static final void method121(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method126(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field227) {
            var4 = field227;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field228) {
            var5 = field228;
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
            if (var12 < field229) {
                var12 = field229;
            }
            int var13 = arg0 + var8;
            if (var13 > field232) {
                var13 = field232;
            }
            int var14 = field231 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field226[var14++] = arg3;
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
            if (var21 < field229) {
                var21 = field229;
            }
            int var22 = arg0 + var16;
            if (var22 > field232 - 1) {
                var22 = field232 - 1;
            }
            int var23 = field231 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field226[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(IIIII)V", line = 343)
    public static final void method122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field229) {
            arg2 -= field229 - arg0;
            arg0 = field229;
        }
        if (arg1 < field227) {
            arg3 -= field227 - arg1;
            arg1 = field227;
        }
        if (arg0 + arg2 > field232) {
            arg2 = field232 - arg0;
        }
        if (arg1 + arg3 > field228) {
            arg3 = field228 - arg1;
        }
        int var5 = field231 - arg2;
        int var6 = field231 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field226[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(IIII)V", line = 388)
    private static final void method123(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field231) {
            arg2 = field231;
        }
        if (arg3 > field230) {
            arg3 = field230;
        }
        field229 = arg0;
        field227 = arg1;
        field232 = arg2;
        field228 = arg3;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "()V", line = 418)
    public static void method124() {
        field226 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([III)V", line = 424)
    public static final void method125(int[] arg0, int arg1, int arg2) {
        field226 = arg0;
        field231 = arg1;
        field230 = arg2;
        method123(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(III)V", line = 433)
    private static final void method126(int arg0, int arg1, int arg2) {
        if (arg0 >= field229 && arg1 >= field227 && arg0 < field232 && arg1 < field228) {
            field226[field231 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "()V", line = 448)
    public static final void method127() {
        int var0 = 0;
        int var1 = field231 * field230 - 7;
        while (var0 < var1) {
            field226[var0++] = 0;
            field226[var0++] = 0;
            field226[var0++] = 0;
            field226[var0++] = 0;
            field226[var0++] = 0;
            field226[var0++] = 0;
            field226[var0++] = 0;
            field226[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field226[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "(IIII)V", line = 476)
    public static final void method128(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field229 || arg0 >= field232) {
            return;
        }
        if (arg1 < field227) {
            arg2 -= field227 - arg1;
            arg1 = field227;
        }
        if (arg1 + arg2 > field228) {
            arg2 = field228 - arg1;
        }
        int var4 = field231 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field226[field231 * var5 + var4] = arg3;
        }
    }
}
