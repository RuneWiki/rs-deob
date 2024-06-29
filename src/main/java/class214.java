import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class214 {

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    private int[] field3680;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
    private int[] field3682;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Llf;")
    private class99 field3687;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Llf;")
    private class99 field3688;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "[Llf;")
    private class99[] field3681;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[S")
    public static short[] field3674 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[Lhb;")
    public static class71[] field3679 = new class71[50];

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[I")
    public static int[] field3678 = new int[2000];

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field3684 = -1;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lha;")
    public static class63 field3672;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[[B")
    public static byte[][] field3677;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZLcj;Lri;IIDI)[I")
    public final int[] method1374(boolean arg0, boolean arg1, class28 arg2, class116 arg3, int arg4, int arg5, double arg6, int arg7) {
        class131.method912((byte) 47, arg6);
        int[] var10 = new int[arg4 * arg5];
        class129.field2404 = arg3;
        class79.field1555 = arg2;
        class187.method1231(arg4, arg5, true);
        for (int var11 = 0; var11 < this.field3681.length; var11++) {
            this.field3681[var11].method681(arg4, -256, arg5);
        }
        field3676++;
        byte var12;
        int var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = arg4 - 1;
            var14 = -1;
        } else {
            var14 = arg4;
            var13 = 0;
            var12 = 1;
        }
        int var15 = 0;
        if (arg7 != 2000) {
            field3674 = null;
        }
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3687.field1938) {
                int[] var18 = this.field3687.method10((byte) -61, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3687.method37(var16, true);
                var20 = var22[0];
                var19 = var22[2];
                var21 = var22[1];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class160.field2865[var24];
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class160.field2865[var26];
                int var28 = var19[var23] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                int var29 = class160.field2865[var28];
                var10[var15++] = (var25 << 16) + (var27 << 8) + var29;
                if (arg0) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3681.length; var17++) {
            this.field3681[var17].method680(arg7 - 1992);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class165.field2972 <= (arg1 - arg3) && arg1 + arg3 <= class215.field3706 && arg4 - arg3 >= class241.field4186 && class222.field3788 >= arg3 + arg4) {
            class259.method1770(arg3, arg2, arg1, true, arg6, arg0, arg4);
        } else {
            class119.method812(arg6, arg4, arg0, arg2, arg1, -135, arg3);
        }
        if (arg5 <= 72) {
            method1377(-99, 50, 81, 76, -97, 76, (class20) null, 15, 29L);
        }
        field3673++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lri;ILcj;)Z")
    public final boolean method1376(class116 arg0, int arg1, class28 arg2) {
        field3685++;
        for (int var4 = arg1; var4 < this.field3682.length; var4++) {
            if (!arg2.method157(this.field3682[var4], 0)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field3680.length; var5++) {
            if (!arg0.method416(true, this.field3680[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIILa;IJ)Z")
    public static final boolean method1377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class20 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class176.method1186(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1378(int arg0) {
        field3674 = null;
        field3678 = null;
        field3672 = null;
        int var1 = -17 % ((arg0 + 24) / 35);
        field3677 = null;
        field3679 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIIIIII)I")
    public static final int method1379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg4;
            arg4 = var7;
        }
        field3675++;
        if (arg5 > -75) {
            method1378(-23);
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 7 - arg3 - (arg2 - 1);
        } else {
            return 7 + 1 - (arg1 + arg4);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class214() {
        this.field3680 = new int[0];
        this.field3682 = new int[0];
        this.field3687 = new class122();
        this.field3687.field1949 = 1;
        this.field3688 = new class122();
        this.field3688.field1949 = 1;
        this.field3681 = new class99[] { this.field3687, this.field3688 };
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Llh;)V")
    public class214(class249 arg0) {
        int var2 = arg0.method1677(-6677);
        int var3 = 0;
        this.field3681 = new class99[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class99 var16 = class263.method1784(true, arg0);
            if (var16.method676(9485) >= 0) {
                var3++;
            }
            if (var16.method679((byte) -116) >= 0) {
                var4++;
            }
            int var17 = var16.field1948.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1677(-6677);
            }
            this.field3681[var6] = var16;
        }
        this.field3680 = new int[var4];
        int var7 = 0;
        this.field3682 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class99 var11 = this.field3681[var9];
            int var12 = var11.field1948.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1948[var13] = this.field3681[var5[var9][var13]];
            }
            int var14 = var11.method676(9485);
            int var15 = var11.method679((byte) -127);
            if (var14 > 0) {
                this.field3682[var8++] = var14;
            }
            if (var15 > 0) {
                this.field3680[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field3687 = this.field3681[arg0.method1677(-6677)];
        this.field3688 = this.field3681[arg0.method1677(-6677)];
        Object var10 = null;
    }
}
