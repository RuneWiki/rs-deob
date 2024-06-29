import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 extends class8 {

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "mapview!l", name = "q", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "mapview!l", name = "n", descriptor = "I")
    public static int field248 = 0;

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "mapview!l", name = "p", descriptor = "I")
    private static int field250;

    @OriginalMember(owner = "mapview!l", name = "o", descriptor = "[I")
    public static int[] field249;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "()V", line = 4)
    public static void method103() {
        field249 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method111(arg0, arg1, arg2, arg3);
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
        if (var9 < field247) {
            var9 = field247;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field245) {
            var10 = field245;
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
            if (var17 < field248) {
                var17 = field248;
            }
            int var18 = arg0 + var13;
            if (var18 > field251) {
                var18 = field251;
            }
            int var19 = field246 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field249[var19] >> 16 & 0xFF) * var5;
                int var22 = (field249[var19] >> 8 & 0xFF) * var5;
                int var23 = (field249[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field249[var19++] = var24;
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
            if (var30 < field248) {
                var30 = field248;
            }
            int var31 = arg0 + var25;
            if (var31 > field251 - 1) {
                var31 = field251 - 1;
            }
            int var32 = field246 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field249[var32] >> 16 & 0xFF) * var5;
                int var35 = (field249[var32] >> 8 & 0xFF) * var5;
                int var36 = (field249[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field249[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "()V", line = 147)
    public static final void method105() {
        int var0 = 0;
        int var1 = field250 * field246 - 7;
        while (var0 < var1) {
            field249[var0++] = 0;
            field249[var0++] = 0;
            field249[var0++] = 0;
            field249[var0++] = 0;
            field249[var0++] = 0;
            field249[var0++] = 0;
            field249[var0++] = 0;
            field249[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field249[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIIII)V", line = 168)
    public static final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field248) {
            arg2 -= field248 - arg0;
            arg0 = field248;
        }
        if (arg1 < field247) {
            arg3 -= field247 - arg1;
            arg1 = field247;
        }
        if (arg0 + arg2 > field251) {
            arg2 = field251 - arg0;
        }
        if (arg1 + arg3 > field245) {
            arg3 = field245 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field246 - arg2;
        int var9 = field246 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field249[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field249[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIII)V", line = 217)
    private static final void method107(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field246) {
            arg2 = field246;
        }
        if (arg3 > field250) {
            arg3 = field250;
        }
        field248 = arg0;
        field247 = arg1;
        field251 = arg2;
        field245 = arg3;
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(IIIII)V", line = 244)
    public static final void method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field248) {
            arg2 -= field248 - arg0;
            arg0 = field248;
        }
        if (arg1 < field247) {
            arg3 -= field247 - arg1;
            arg1 = field247;
        }
        if (arg0 + arg2 > field251) {
            arg2 = field251 - arg0;
        }
        if (arg1 + arg3 > field245) {
            arg3 = field245 - arg1;
        }
        int var5 = field246 - arg2;
        int var6 = field246 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field249[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([III)V", line = 287)
    public static final void method109(int[] arg0, int arg1, int arg2) {
        field249 = arg0;
        field246 = arg1;
        field250 = arg2;
        method107(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(IIII)V", line = 297)
    public static final void method110(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field248 || arg0 >= field251) {
            return;
        }
        if (arg1 < field247) {
            arg2 -= field247 - arg1;
            arg1 = field247;
        }
        if (arg1 + arg2 > field245) {
            arg2 = field245 - arg1;
        }
        int var4 = field246 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field249[field246 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(IIII)V", line = 344)
    private static final void method111(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method113(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field247) {
            var4 = field247;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field245) {
            var5 = field245;
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
            if (var12 < field248) {
                var12 = field248;
            }
            int var13 = arg0 + var8;
            if (var13 > field251) {
                var13 = field251;
            }
            int var14 = field246 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field249[var14++] = arg3;
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
            if (var21 < field248) {
                var21 = field248;
            }
            int var22 = arg0 + var16;
            if (var22 > field251 - 1) {
                var22 = field251 - 1;
            }
            int var23 = field246 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field249[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "(IIII)V", line = 450)
    public static final void method112(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field247 || arg1 >= field245) {
            return;
        }
        if (arg0 < field248) {
            arg2 -= field248 - arg0;
            arg0 = field248;
        }
        if (arg0 + arg2 > field251) {
            arg2 = field251 - arg0;
        }
        int var4 = field246 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field249[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(III)V", line = 474)
    private static final void method113(int arg0, int arg1, int arg2) {
        if (arg0 >= field248 && arg1 >= field247 && arg0 < field251 && arg1 < field245) {
            field249[field246 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(IIIII)V", line = 486)
    public static final void method114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method112(arg0, arg1, arg2, arg4);
        method112(arg0, arg1 + arg3 - 1, arg2, arg4);
        method110(arg0, arg1, arg3, arg4);
        method110(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
}
