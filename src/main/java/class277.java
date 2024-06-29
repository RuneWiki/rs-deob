import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class277 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field4650 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field4649 = 0;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field4651 = 0;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    public static int[] field4653;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[I")
    public static int[] field4656;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
    public static int[] field4657;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method1906(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4655 || arg1 >= field4651) {
            return;
        }
        if (arg0 < field4649) {
            arg2 -= field4649 - arg0;
            arg0 = field4649;
        }
        if (arg0 + arg2 > field4650) {
            arg2 = field4650 - arg0;
        }
        int var4 = field4652 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4657[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([I)V", line = 33)
    public static final void method1907(int[] arg0) {
        field4649 = arg0[0];
        field4655 = arg0[1];
        field4650 = arg0[2];
        field4651 = arg0[3];
        method1916();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V", line = 41)
    public static final void method1908(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1913(arg0, arg1, arg2, arg3);
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
        if (var9 < field4655) {
            var9 = field4655;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field4651) {
            var10 = field4651;
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
            if (var17 < field4649) {
                var17 = field4649;
            }
            int var18 = arg0 + var13;
            if (var18 > field4650) {
                var18 = field4650;
            }
            int var19 = field4652 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field4657[var19] >> 16 & 0xFF) * var5;
                int var22 = (field4657[var19] >> 8 & 0xFF) * var5;
                int var23 = (field4657[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field4657[var19++] = var24;
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
            if (var30 < field4649) {
                var30 = field4649;
            }
            int var31 = arg0 + var25;
            if (var31 > field4650 - 1) {
                var31 = field4650 - 1;
            }
            int var32 = field4652 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field4657[var32] >> 16 & 0xFF) * var5;
                int var35 = (field4657[var32] >> 8 & 0xFF) * var5;
                int var36 = (field4657[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field4657[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IIII)V", line = 176)
    public static final void method1909(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field4649 || arg0 >= field4650) {
            return;
        }
        if (arg1 < field4655) {
            arg2 -= field4655 - arg1;
            arg1 = field4655;
        }
        if (arg1 + arg2 > field4651) {
            arg2 = field4651 - arg1;
        }
        int var4 = field4652 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4657[field4652 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(IIII)V", line = 201)
    private static final void method1910(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field4652) {
            arg2 = field4652;
        }
        if (arg3 > field4654) {
            arg3 = field4654;
        }
        field4649 = arg0;
        field4655 = arg1;
        field4650 = arg2;
        field4651 = arg3;
        method1916();
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IIIII)V", line = 220)
    public static final void method1911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4649) {
            arg2 -= field4649 - arg0;
            arg0 = field4649;
        }
        if (arg1 < field4655) {
            arg3 -= field4655 - arg1;
            arg1 = field4655;
        }
        if (arg0 + arg2 > field4650) {
            arg2 = field4650 - arg0;
        }
        if (arg1 + arg3 > field4651) {
            arg3 = field4651 - arg1;
        }
        int var5 = field4652 - arg2;
        int var6 = field4652 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field4657[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([I)V", line = 264)
    public static final void method1912(int[] arg0) {
        arg0[0] = field4649;
        arg0[1] = field4655;
        arg0[2] = field4650;
        arg0[3] = field4651;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(IIII)V", line = 275)
    private static final void method1913(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1915(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4655) {
            var4 = field4655;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field4651) {
            var5 = field4651;
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
            if (var12 < field4649) {
                var12 = field4649;
            }
            int var13 = arg0 + var8;
            if (var13 > field4650) {
                var13 = field4650;
            }
            int var14 = field4652 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field4657[var14++] = arg3;
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
            if (var21 < field4649) {
                var21 = field4649;
            }
            int var22 = arg0 + var16;
            if (var22 > field4650 - 1) {
                var22 = field4650 - 1;
            }
            int var23 = field4652 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field4657[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([III)V", line = 382)
    public static final void method1914(int[] arg0, int arg1, int arg2) {
        field4657 = arg0;
        field4652 = arg1;
        field4654 = arg2;
        method1910(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V", line = 390)
    private static final void method1915(int arg0, int arg1, int arg2) {
        if (arg0 >= field4649 && arg1 >= field4655 && arg0 < field4650 && arg1 < field4651) {
            field4657[field4652 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 412)
    private static final void method1916() {
        field4653 = null;
        field4656 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V", line = 438)
    public static void method1917() {
        field4657 = null;
        field4653 = null;
        field4656 = null;
    }
}
