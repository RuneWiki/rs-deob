import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 {

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field714 = 0;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field720 = 0;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[I")
    public static int[] field713;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
    public static int[] field718;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
    public static int[] field721;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V", line = 5)
    private static final void method290(int arg0, int arg1, int arg2) {
        if (arg0 >= field715 && arg1 >= field719 && arg0 < field714 && arg1 < field720) {
            field721[field717 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V", line = 11)
    public static final void method291(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field715) {
            arg2 -= field715 - arg0;
            arg0 = field715;
        }
        if (arg1 < field719) {
            arg3 -= field719 - arg1;
            arg1 = field719;
        }
        if (arg0 + arg2 > field714) {
            arg2 = field714 - arg0;
        }
        if (arg1 + arg3 > field720) {
            arg3 = field720 - arg1;
        }
        int var5 = field717 - arg2;
        int var6 = field717 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field721[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V", line = 53)
    private static final void method292(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method290(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field719) {
            var4 = field719;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field720) {
            var5 = field720;
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
            if (var12 < field715) {
                var12 = field715;
            }
            int var13 = arg0 + var8;
            if (var13 > field714) {
                var13 = field714;
            }
            int var14 = field717 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field721[var14++] = arg3;
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
            if (var21 < field715) {
                var21 = field715;
            }
            int var22 = arg0 + var16;
            if (var22 > field714 - 1) {
                var22 = field714 - 1;
            }
            int var23 = field717 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field721[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIII)V", line = 171)
    public static final void method293(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field719 || arg1 >= field720) {
            return;
        }
        if (arg0 < field715) {
            arg2 -= field715 - arg0;
            arg0 = field715;
        }
        if (arg0 + arg2 > field714) {
            arg2 = field714 - arg0;
        }
        int var4 = field717 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field721[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([I)V", line = 200)
    public static final void method294(int[] arg0) {
        field715 = arg0[0];
        field719 = arg0[1];
        field714 = arg0[2];
        field720 = arg0[3];
        method297();
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(IIII)V", line = 207)
    public static final void method295(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field715 || arg0 >= field714) {
            return;
        }
        if (arg1 < field719) {
            arg2 -= field719 - arg1;
            arg1 = field719;
        }
        if (arg1 + arg2 > field720) {
            arg2 = field720 - arg1;
        }
        int var4 = field717 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field721[field717 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(IIII)V", line = 236)
    private static final void method296(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field717) {
            arg2 = field717;
        }
        if (arg3 > field716) {
            arg3 = field716;
        }
        field715 = arg0;
        field719 = arg1;
        field714 = arg2;
        field720 = arg3;
        method297();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 258)
    private static final void method297() {
        field713 = null;
        field718 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([III)V", line = 267)
    public static final void method298(int[] arg0, int arg1, int arg2) {
        field721 = arg0;
        field717 = arg1;
        field716 = arg2;
        method296(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIII)V", line = 275)
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method292(arg0, arg1, arg2, arg3);
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
        if (var9 < field719) {
            var9 = field719;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field720) {
            var10 = field720;
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
            if (var17 < field715) {
                var17 = field715;
            }
            int var18 = arg0 + var13;
            if (var18 > field714) {
                var18 = field714;
            }
            int var19 = field717 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field721[var19] >> 16 & 0xFF) * var5;
                int var22 = (field721[var19] >> 8 & 0xFF) * var5;
                int var23 = (field721[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field721[var19++] = var24;
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
            if (var30 < field715) {
                var30 = field715;
            }
            int var31 = arg0 + var25;
            if (var31 > field714 - 1) {
                var31 = field714 - 1;
            }
            int var32 = field717 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field721[var32] >> 16 & 0xFF) * var5;
                int var35 = (field721[var32] >> 8 & 0xFF) * var5;
                int var36 = (field721[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field721[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()V", line = 408)
    public static void method300() {
        field721 = null;
        field713 = null;
        field718 = null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([I)V", line = 424)
    public static final void method301(int[] arg0) {
        arg0[0] = field715;
        arg0[1] = field719;
        arg0[2] = field714;
        arg0[3] = field720;
    }
}
