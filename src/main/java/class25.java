import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class25 extends class13 {

    @OriginalMember(owner = "mapview!n", name = "r", descriptor = "I")
    public static int field324 = 0;

    @OriginalMember(owner = "mapview!n", name = "t", descriptor = "I")
    public static int field326 = 0;

    @OriginalMember(owner = "mapview!n", name = "v", descriptor = "I")
    public static int field328 = 0;

    @OriginalMember(owner = "mapview!n", name = "w", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "mapview!n", name = "u", descriptor = "I")
    private static int field327;

    @OriginalMember(owner = "mapview!n", name = "x", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "mapview!n", name = "s", descriptor = "[I")
    public static int[] field325;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(III)V", line = 4)
    private static final void method164(int arg0, int arg1, int arg2) {
        if (arg0 >= field326 && arg1 >= field324 && arg0 < field328 && arg1 < field329) {
            field325[field330 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "()V", line = 11)
    public static final void method165() {
        int var0 = 0;
        int var1 = field330 * field327 - 7;
        while (var0 < var1) {
            field325[var0++] = 0;
            field325[var0++] = 0;
            field325[var0++] = 0;
            field325[var0++] = 0;
            field325[var0++] = 0;
            field325[var0++] = 0;
            field325[var0++] = 0;
            field325[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field325[var0++] = 0;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIII)V", line = 33)
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method173(arg0, arg1, arg2, arg3);
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
        if (var9 < field324) {
            var9 = field324;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field329) {
            var10 = field329;
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
            if (var17 < field326) {
                var17 = field326;
            }
            int var18 = arg0 + var13;
            if (var18 > field328) {
                var18 = field328;
            }
            int var19 = field330 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field325[var19] >> 16 & 0xFF) * var5;
                int var22 = (field325[var19] >> 8 & 0xFF) * var5;
                int var23 = (field325[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field325[var19++] = var24;
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
            if (var30 < field326) {
                var30 = field326;
            }
            int var31 = arg0 + var25;
            if (var31 > field328 - 1) {
                var31 = field328 - 1;
            }
            int var32 = field330 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field325[var32] >> 16 & 0xFF) * var5;
                int var35 = (field325[var32] >> 8 & 0xFF) * var5;
                int var36 = (field325[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field325[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(IIIII)V", line = 166)
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method168(arg0, arg1, arg2, arg4);
        method168(arg0, arg1 + arg3 - 1, arg2, arg4);
        method170(arg0, arg1, arg3, arg4);
        method170(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIII)V", line = 181)
    public static final void method168(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field324 || arg1 >= field329) {
            return;
        }
        if (arg0 < field326) {
            arg2 -= field326 - arg0;
            arg0 = field326;
        }
        if (arg0 + arg2 > field328) {
            arg2 = field328 - arg0;
        }
        int var4 = field330 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field325[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIIII)V", line = 207)
    public static final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field326) {
            arg2 -= field326 - arg0;
            arg0 = field326;
        }
        if (arg1 < field324) {
            arg3 -= field324 - arg1;
            arg1 = field324;
        }
        if (arg0 + arg2 > field328) {
            arg2 = field328 - arg0;
        }
        if (arg1 + arg3 > field329) {
            arg3 = field329 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field330 - arg2;
        int var11 = field330 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field325[var11] >> 16 & 0xFF) * var6;
                int var15 = (field325[var11] >> 8 & 0xFF) * var6;
                int var16 = (field325[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field325[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(IIII)V", line = 265)
    public static final void method170(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field326 || arg0 >= field328) {
            return;
        }
        if (arg1 < field324) {
            arg2 -= field324 - arg1;
            arg1 = field324;
        }
        if (arg1 + arg2 > field329) {
            arg2 = field329 - arg1;
        }
        int var4 = field330 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field325[field330 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(IIII)V", line = 288)
    private static final void method171(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field330) {
            arg2 = field330;
        }
        if (arg3 > field327) {
            arg3 = field327;
        }
        field326 = arg0;
        field324 = arg1;
        field328 = arg2;
        field329 = arg3;
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "()V", line = 313)
    public static void method172() {
        field325 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "(IIII)V", line = 317)
    private static final void method173(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method164(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field324) {
            var4 = field324;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field329) {
            var5 = field329;
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
            if (var12 < field326) {
                var12 = field326;
            }
            int var13 = arg0 + var8;
            if (var13 > field328) {
                var13 = field328;
            }
            int var14 = field330 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field325[var14++] = arg3;
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
            if (var21 < field326) {
                var21 = field326;
            }
            int var22 = arg0 + var16;
            if (var22 > field328 - 1) {
                var22 = field328 - 1;
            }
            int var23 = field330 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field325[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(IIIII)V", line = 427)
    public static final void method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field326) {
            arg2 -= field326 - arg0;
            arg0 = field326;
        }
        if (arg1 < field324) {
            arg3 -= field324 - arg1;
            arg1 = field324;
        }
        if (arg0 + arg2 > field328) {
            arg2 = field328 - arg0;
        }
        if (arg1 + arg3 > field329) {
            arg3 = field329 - arg1;
        }
        int var5 = field330 - arg2;
        int var6 = field330 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field325[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([III)V", line = 477)
    public static final void method175(int[] arg0, int arg1, int arg2) {
        field325 = arg0;
        field330 = arg1;
        field327 = arg2;
        method171(0, 0, arg1, arg2);
    }
}
