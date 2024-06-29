import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class280 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field4788 = 0;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field4790 = 0;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field4789 = 0;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field4794 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[I")
    public static int[] field4791;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
    public static int[] field4793;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[I")
    public static int[] field4795;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([I)V", line = 3)
    public static final void method1904(int[] arg0) {
        field4788 = arg0[0];
        field4794 = arg0[1];
        field4790 = arg0[2];
        field4789 = arg0[3];
        method1906();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIII)V", line = 13)
    public static final void method1905(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4794 || arg1 >= field4789) {
            return;
        }
        if (arg0 < field4788) {
            arg2 -= field4788 - arg0;
            arg0 = field4788;
        }
        if (arg0 + arg2 > field4790) {
            arg2 = field4790 - arg0;
        }
        int var4 = field4787 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4795[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V", line = 39)
    private static final void method1906() {
        field4793 = null;
        field4791 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIII)V", line = 43)
    private static final void method1907(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field4787) {
            arg2 = field4787;
        }
        if (arg3 > field4792) {
            arg3 = field4792;
        }
        field4788 = arg0;
        field4794 = arg1;
        field4790 = arg2;
        field4789 = arg3;
        method1906();
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "([I)V", line = 69)
    public static final void method1908(int[] arg0) {
        arg0[0] = field4788;
        arg0[1] = field4794;
        arg0[2] = field4790;
        arg0[3] = field4789;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V", line = 78)
    public static final void method1909(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method1915(arg0, arg1, arg2, arg3);
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
        if (var9 < field4794) {
            var9 = field4794;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field4789) {
            var10 = field4789;
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
            if (var17 < field4788) {
                var17 = field4788;
            }
            int var18 = arg0 + var13;
            if (var18 > field4790) {
                var18 = field4790;
            }
            int var19 = field4787 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field4795[var19] >> 16 & 0xFF) * var5;
                int var22 = (field4795[var19] >> 8 & 0xFF) * var5;
                int var23 = (field4795[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field4795[var19++] = var24;
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
            if (var30 < field4788) {
                var30 = field4788;
            }
            int var31 = arg0 + var25;
            if (var31 > field4790 - 1) {
                var31 = field4790 - 1;
            }
            int var32 = field4787 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field4795[var32] >> 16 & 0xFF) * var5;
                int var35 = (field4795[var32] >> 8 & 0xFF) * var5;
                int var36 = (field4795[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field4795[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()V", line = 212)
    public static void method1910() {
        field4795 = null;
        field4793 = null;
        field4791 = null;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(IIII)V", line = 228)
    public static final void method1911(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field4788 || arg0 >= field4790) {
            return;
        }
        if (arg1 < field4794) {
            arg2 -= field4794 - arg1;
            arg1 = field4794;
        }
        if (arg1 + arg2 > field4789) {
            arg2 = field4789 - arg1;
        }
        int var4 = field4787 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field4795[field4787 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V", line = 260)
    private static final void method1912(int arg0, int arg1, int arg2) {
        if (arg0 >= field4788 && arg1 >= field4794 && arg0 < field4790 && arg1 < field4789) {
            field4795[field4787 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIIII)V", line = 266)
    public static final void method1913(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4788) {
            arg2 -= field4788 - arg0;
            arg0 = field4788;
        }
        if (arg1 < field4794) {
            arg3 -= field4794 - arg1;
            arg1 = field4794;
        }
        if (arg0 + arg2 > field4790) {
            arg2 = field4790 - arg0;
        }
        if (arg1 + arg3 > field4789) {
            arg3 = field4789 - arg1;
        }
        int var5 = field4787 - arg2;
        int var6 = field4787 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field4795[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V", line = 337)
    public static final void method1914(int[] arg0, int arg1, int arg2) {
        field4795 = arg0;
        field4787 = arg1;
        field4792 = arg2;
        method1907(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(IIII)V", line = 345)
    private static final void method1915(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method1912(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4794) {
            var4 = field4794;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field4789) {
            var5 = field4789;
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
            if (var12 < field4788) {
                var12 = field4788;
            }
            int var13 = arg0 + var8;
            if (var13 > field4790) {
                var13 = field4790;
            }
            int var14 = field4787 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field4795[var14++] = arg3;
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
            if (var21 < field4788) {
                var21 = field4788;
            }
            int var22 = arg0 + var16;
            if (var22 > field4790 - 1) {
                var22 = field4790 - 1;
            }
            int var23 = field4787 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field4795[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }
}
