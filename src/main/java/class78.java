import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class78 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field1353 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field1352 = 0;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field1354 = 0;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    public static int[] field1356;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[I")
    public static int[] field1357;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
    public static int[] field1360;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V", line = 13)
    public static final void method509(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1353 || arg0 >= field1359) {
            return;
        }
        if (arg1 < field1354) {
            arg2 -= field1354 - arg1;
            arg1 = field1354;
        }
        if (arg1 + arg2 > field1352) {
            arg2 = field1352 - arg1;
        }
        int var4 = field1358 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1357[field1358 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V", line = 38)
    private static final void method510(int arg0, int arg1, int arg2) {
        if (arg0 >= field1353 && arg1 >= field1354 && arg0 < field1359 && arg1 < field1352) {
            field1357[field1358 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([I)V", line = 56)
    public static final void method511(int[] arg0) {
        arg0[0] = field1353;
        arg0[1] = field1354;
        arg0[2] = field1359;
        arg0[3] = field1352;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([III)V", line = 66)
    public static final void method512(int[] arg0, int arg1, int arg2) {
        field1357 = arg0;
        field1358 = arg1;
        field1355 = arg2;
        method516(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V", line = 92)
    public static final void method513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1353) {
            arg2 -= field1353 - arg0;
            arg0 = field1353;
        }
        if (arg1 < field1354) {
            arg3 -= field1354 - arg1;
            arg1 = field1354;
        }
        if (arg0 + arg2 > field1359) {
            arg2 = field1359 - arg0;
        }
        if (arg1 + arg3 > field1352) {
            arg3 = field1352 - arg1;
        }
        int var5 = field1358 - arg2;
        int var6 = field1358 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1357[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V", line = 134)
    private static final void method514() {
        field1356 = null;
        field1360 = null;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()V", line = 143)
    public static void method515() {
        field1357 = null;
        field1356 = null;
        field1360 = null;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIII)V", line = 157)
    private static final void method516(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1358) {
            arg2 = field1358;
        }
        if (arg3 > field1355) {
            arg3 = field1355;
        }
        field1353 = arg0;
        field1354 = arg1;
        field1359 = arg2;
        field1352 = arg3;
        method514();
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIIII)V", line = 178)
    public static final void method517(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method519(arg0, arg1, arg2, arg3);
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
        if (var9 < field1354) {
            var9 = field1354;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field1352) {
            var10 = field1352;
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
            if (var17 < field1353) {
                var17 = field1353;
            }
            int var18 = arg0 + var13;
            if (var18 > field1359) {
                var18 = field1359;
            }
            int var19 = field1358 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field1357[var19] >> 16 & 0xFF) * var5;
                int var22 = (field1357[var19] >> 8 & 0xFF) * var5;
                int var23 = (field1357[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field1357[var19++] = var24;
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
            if (var30 < field1353) {
                var30 = field1353;
            }
            int var31 = arg0 + var25;
            if (var31 > field1359 - 1) {
                var31 = field1359 - 1;
            }
            int var32 = field1358 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field1357[var32] >> 16 & 0xFF) * var5;
                int var35 = (field1357[var32] >> 8 & 0xFF) * var5;
                int var36 = (field1357[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field1357[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "([I)V", line = 315)
    public static final void method518(int[] arg0) {
        field1353 = arg0[0];
        field1354 = arg0[1];
        field1359 = arg0[2];
        field1352 = arg0[3];
        method514();
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(IIII)V", line = 322)
    private static final void method519(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method510(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field1354) {
            var4 = field1354;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field1352) {
            var5 = field1352;
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
            if (var12 < field1353) {
                var12 = field1353;
            }
            int var13 = arg0 + var8;
            if (var13 > field1359) {
                var13 = field1359;
            }
            int var14 = field1358 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field1357[var14++] = arg3;
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
            if (var21 < field1353) {
                var21 = field1353;
            }
            int var22 = arg0 + var16;
            if (var22 > field1359 - 1) {
                var22 = field1359 - 1;
            }
            int var23 = field1358 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field1357[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(IIII)V", line = 427)
    public static final void method520(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1354 || arg1 >= field1352) {
            return;
        }
        if (arg0 < field1353) {
            arg2 -= field1353 - arg0;
            arg0 = field1353;
        }
        if (arg0 + arg2 > field1359) {
            arg2 = field1359 - arg0;
        }
        int var4 = field1358 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1357[var4 + var5] = arg3;
        }
    }
}
