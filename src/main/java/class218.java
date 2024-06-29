import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class218 extends class747 {

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "I")
    public int field2842 = 0;

    @OriginalMember(owner = "client!mu", name = "J", descriptor = "Z")
    public boolean field2843 = true;

    @OriginalMember(owner = "client!mu", name = "O", descriptor = "I")
    public int field2847 = 4;

    @OriginalMember(owner = "client!mu", name = "V", descriptor = "I")
    public int field2853 = 4;

    @OriginalMember(owner = "client!mu", name = "K", descriptor = "I")
    public int field2844 = 4;

    @OriginalMember(owner = "client!mu", name = "P", descriptor = "[B")
    private byte[] field2848 = new byte[512];

    @OriginalMember(owner = "client!mu", name = "Q", descriptor = "I")
    public int field2849 = 1638;

    @OriginalMember(owner = "client!mu", name = "M", descriptor = "Lmba;")
    public static class646 field2845 = new class646();

    @OriginalMember(owner = "client!mu", name = "X", descriptor = "Liv;")
    public static class25 field2855 = new class25(3);

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!mu", name = "S", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!mu", name = "T", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!mu", name = "U", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!mu", name = "W", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "[S")
    private short[] field2839;

    @OriginalMember(owner = "client!mu", name = "N", descriptor = "[S")
    private short[] field2846;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 7)
    public final void method184(int arg0) {
        this.field2848 = class417.method2593(arg0 ^ 20709, this.field2842);
        ++field2850;
        this.method1281(true);
        int var2 = this.field2847 - 1;
        if (arg0 != -2) {
            this.method1281(false);
        }
        while (~var2 <= -2) {
            short var3 = this.field2839[var2];
            if (var3 > 8 || var3 < -8) {
                return;
            }
            --this.field2847;
            --var2;
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V", line = 37)
    public class218() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V", line = 40)
    public static void method1278(int arg0) {
        field2855 = null;
        field2845 = null;
        if (arg0 >= -25) {
            field2855 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ldc;II)V", line = 52)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field2853 = arg0.method505((byte) -119);
                                }
                            } else {
                                this.field2844 = arg0.method505((byte) -119);
                            }
                        } else {
                            this.field2842 = arg0.method505((byte) -119);
                        }
                    } else {
                        this.field2844 = this.field2853 = arg0.method505((byte) -119);
                    }
                } else {
                    this.field2849 = arg0.method496(-63);
                    if (this.field2849 < 0) {
                        this.field2839 = new short[this.field2847];
                        for (int var5 = 0; this.field2847 > var5; ++var5) {
                            this.field2839[var5] = (short) arg0.method496(-19);
                        }
                    }
                }
            } else {
                this.field2847 = arg0.method505((byte) -119);
            }
        } else {
            this.field2843 = arg0.method505((byte) -119) == 1;
        }
        if (arg1 != 11608) {
            this.field2839 = null;
        }
        ++field2838;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)[I", line = 151)
    public final int[] method182(int arg0, int arg1) {
        if (arg1 > -89) {
            field2845 = null;
        }
        ++field2841;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            this.method1280(-97, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZIIIII)I", line = 174)
    private final int method1279(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2852;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        int var10 = arg5 & 4095;
        int var11 = var8 & 255;
        if (~var9 <= ~arg2) {
            var9 = 0;
        }
        int var12 = var9 & 255;
        int var13 = arg6 + -4096;
        int var14 = var10 + -4096;
        if (!arg1) {
            this.method182(-77, -5);
        }
        int var15 = this.field2848[arg4 + var11] & 3;
        int var16 = class282.field4090[var10];
        int var17;
        if (~var15 < -2) {
            var17 = ~var15 == -3 ? -arg6 + var10 : -arg6 + -var10;
        } else {
            var17 = ~var15 == -1 ? arg6 + var10 : -var10 + arg6;
        }
        int var18 = this.field2848[arg4 + var12] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = var18 != 0 ? -var14 + arg6 : var14 - -arg6;
        } else {
            var19 = var18 == 2 ? -arg6 + var14 : -arg6 + -var14;
        }
        int var20 = 3 & this.field2848[var11 - -arg3];
        int var21 = ((-var17 + var19) * var16 >> 12) + var17;
        int var22;
        if (var20 > 1) {
            var22 = ~var20 == -3 ? var10 - var13 : -var10 + -var13;
        } else {
            var22 = ~var20 == -1 ? var10 - -var13 : var13 - var10;
        }
        int var23 = this.field2848[arg3 + var12] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 != -1 ? -var14 + var13 : var13 + var14;
        } else {
            var24 = var23 == 2 ? var14 - var13 : -var13 + -var14;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg0 >> 12);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[II)V", line = 272)
    public final void method1280(int arg0, int[] arg1, int arg2) {
        ++field2840;
        int var4 = class515.field7103[arg2] * this.field2853;
        int var5 = 118 % ((-46 - arg0) / 48);
        if (~this.field2847 != -2) {
            short var6 = this.field2839[0];
            if (~var6 < -9 || ~var6 > 7) {
                int var7 = this.field2846[0] << 12;
                int var8 = var4 * var7 >> 12;
                int var9 = this.field2844 * var7 >> 12;
                int var10 = this.field2853 * var7 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 + 1;
                if (~var12 <= ~var10) {
                    var12 = 0;
                }
                int var13 = var8 & 4095;
                int var14 = 255 & this.field2848[255 & var12];
                int var15 = class282.field4090[var13];
                int var16 = this.field2848[var11 & 255] & 255;
                for (int var17 = 0; ~class73.field1095 < ~var17; ++var17) {
                    int var37 = class639.field8571[var17] * this.field2844;
                    int var38 = this.method1279(var15, true, var9, var14, var16, var7 * var37 >> 12, var13);
                    arg1[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; ~var18 > ~this.field2847; ++var18) {
                short var19 = this.field2839[var18];
                if (var19 > 8 || ~var19 > 7) {
                    int var20 = this.field2846[var18] << 12;
                    int var21 = this.field2853 * var20 >> 12;
                    int var22 = this.field2844 * var20 >> 12;
                    int var23 = var4 * var20 >> 12;
                    int var24 = var23 >> 12;
                    int var25 = var24 + 1;
                    int var26 = var23 & 4095;
                    if (~var25 <= ~var21) {
                        var25 = 0;
                    }
                    int var27 = this.field2848[var25 & 255] & 255;
                    int var28 = class282.field4090[var26];
                    int var29 = this.field2848[255 & var24] & 255;
                    if (this.field2843 && this.field2847 + -1 == var18) {
                        for (int var30 = 0; class73.field1095 > var30; ++var30) {
                            int var31 = class639.field8571[var30] * this.field2844;
                            int var32 = this.method1279(var28, true, var22, var27, var29, var20 * var31 >> 12, var26);
                            int var33 = (var19 * var32 >> 12) + arg1[var30];
                            arg1[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; class73.field1095 > var34; ++var34) {
                            int var35 = class639.field8571[var34] * this.field2844;
                            int var36 = this.method1279(var28, true, var22, var27, var29, var20 * var35 >> 12, var26);
                            arg1[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            int var39 = this.field2846[0] << 12;
            short var40 = this.field2839[0];
            int var41 = this.field2853 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = this.field2844 * var39 >> 12;
            int var44 = var42 >> 12;
            int var45 = var44 + 1;
            int var46 = var42 & 4095;
            if (var45 >= var41) {
                var45 = 0;
            }
            int var47 = 255 & this.field2848[var44 & 255];
            int var48 = class282.field4090[var46];
            int var49 = this.field2848[var45 & 255] & 255;
            if (!this.field2843) {
                for (int var50 = 0; class73.field1095 > var50; ++var50) {
                    int var51 = class639.field8571[var50] * this.field2844;
                    int var52 = this.method1279(var48, true, var43, var49, var47, var39 * var51 >> 12, var46);
                    arg1[var50] = var40 * var52 >> 12;
                }
            } else {
                for (int var53 = 0; ~class73.field1095 < ~var53; ++var53) {
                    int var54 = class639.field8571[var53] * this.field2844;
                    int var55 = this.method1279(var48, true, var43, var49, var47, var39 * var54 >> 12, var46);
                    int var56 = var40 * var55 >> 12;
                    arg1[var53] = (var56 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(Z)V", line = 428)
    private final void method1281(boolean arg0) {
        if (!arg0) {
            this.method1280(-82, (int[]) null, 3);
        }
        ++field2851;
        if (this.field2849 > 0) {
            this.field2846 = new short[this.field2847];
            this.field2839 = new short[this.field2847];
            for (int var2 = 0; ~this.field2847 < ~var2; ++var2) {
                this.field2839[var2] = (short) ((int) (Math.pow((double) ((float) this.field2849 / 4096.0F), (double) var2) * 4096.0D));
                this.field2846[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2839 != null && this.field2839.length == this.field2847) {
            this.field2846 = new short[this.field2847];
            for (int var3 = 0; var3 < this.field2847; ++var3) {
                this.field2846[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }
}
