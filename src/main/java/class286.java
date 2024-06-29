import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class286 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field4722 = 0;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field4724 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field4720 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field4723 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
    public static int[] field4718;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1910(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1912(arg0, arg1, arg2, arg3);
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
        if (var9 < field4724) {
            var9 = field4724;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field4722) {
            var10 = field4722;
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
            if (var17 < field4723) {
                var17 = field4723;
            }
            int var18 = arg0 + var13;
            if (var18 > field4720) {
                var18 = field4720;
            }
            int var19 = field4719 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field4718[var19] >> 16 & 0xFF) * var5;
                int var22 = (field4718[var19] >> 8 & 0xFF) * var5;
                int var23 = (field4718[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field4718[var19++] = var24;
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
            if (var30 < field4723) {
                var30 = field4723;
            }
            int var31 = arg0 + var25;
            if (var31 > field4720 - 1) {
                var31 = field4720 - 1;
            }
            int var32 = field4719 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field4718[var32] >> 16 & 0xFF) * var5;
                int var35 = (field4718[var32] >> 8 & 0xFF) * var5;
                int var36 = (field4718[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field4718[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V", line = 145)
    private static final void method1911(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field4719) {
            arg2 = field4719;
        }
        if (arg3 > field4721) {
            arg3 = field4721;
        }
        field4723 = arg0;
        field4724 = arg1;
        field4720 = arg2;
        field4722 = arg3;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIII)V", line = 166)
    private static final void method1912(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1917(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4724) {
            var4 = field4724;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field4722) {
            var5 = field4722;
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
            if (var12 < field4723) {
                var12 = field4723;
            }
            int var13 = arg0 + var8;
            if (var13 > field4720) {
                var13 = field4720;
            }
            int var14 = field4719 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field4718[var14++] = arg3;
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
            if (var21 < field4723) {
                var21 = field4723;
            }
            int var22 = arg0 + var16;
            if (var22 > field4720 - 1) {
                var22 = field4720 - 1;
            }
            int var23 = field4719 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field4718[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(IIII)V", line = 281)
    public static final void method1913(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field4723 || arg0 >= field4720) {
            return;
        }
        if (arg1 < field4724) {
            arg2 -= field4724 - arg1;
            arg1 = field4724;
        }
        if (arg1 + arg2 > field4722) {
            arg2 = field4722 - arg1;
        }
        int var4 = field4719 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4718[field4719 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([I)V", line = 306)
    public static final void method1914(int[] arg0) {
        arg0[0] = field4723;
        arg0[1] = field4724;
        arg0[2] = field4720;
        arg0[3] = field4722;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 325)
    public static void method1915() {
        field4718 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIIII)V", line = 331)
    public static final void method1916(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4723) {
            arg2 -= field4723 - arg0;
            arg0 = field4723;
        }
        if (arg1 < field4724) {
            arg3 -= field4724 - arg1;
            arg1 = field4724;
        }
        if (arg0 + arg2 > field4720) {
            arg2 = field4720 - arg0;
        }
        if (arg1 + arg3 > field4722) {
            arg3 = field4722 - arg1;
        }
        int var5 = field4719 - arg2;
        int var6 = field4719 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field4718[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 378)
    private static final void method1917(int arg0, int arg1, int arg2) {
        if (arg0 >= field4723 && arg1 >= field4724 && arg0 < field4720 && arg1 < field4722) {
            field4718[field4719 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "([I)V", line = 388)
    public static final void method1918(int[] arg0) {
        field4723 = arg0[0];
        field4724 = arg0[1];
        field4720 = arg0[2];
        field4722 = arg0[3];
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(IIII)V", line = 394)
    public static final void method1919(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4724 || arg1 >= field4722) {
            return;
        }
        if (arg0 < field4723) {
            arg2 -= field4723 - arg0;
            arg0 = field4723;
        }
        if (arg0 + arg2 > field4720) {
            arg2 = field4720 - arg0;
        }
        int var4 = field4719 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4718[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([III)V", line = 421)
    public static final void method1920(int[] arg0, int arg1, int arg2) {
        field4718 = arg0;
        field4719 = arg1;
        field4721 = arg2;
        method1911(0, 0, arg1, arg2);
    }
}
