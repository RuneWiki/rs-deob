import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class132 extends class272 {

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    private int field2365 = 4096;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "Z")
    private boolean field2370 = true;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "[I")
    public static int[] field2362 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Lli;")
    public static class185 field2361 = class245.method1649(":assist:", 123);

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Lli;")
    public static class185 field2364 = class245.method1649("k", -51);

    @OriginalMember(owner = "client!e", name = "S", descriptor = "Lli;")
    public static class185 field2369 = class245.method1649("<br>", -116);

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Lgf;")
    public static class7 field2368 = new class7(64);

    @OriginalMember(owner = "client!e", name = "X", descriptor = "[I")
    public static int[] field2374 = new int[25];

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "Lli;")
    public static class185 field2375 = class245.method1649("scrollen:", -24);

    @OriginalMember(owner = "client!e", name = "U", descriptor = "[I")
    public static int[] field2371 = new int[2];

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Lmh;")
    public static class114 field2373;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "Ldd;")
    public static class211 field2372;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field2362 = null;
        field2364 = null;
        field2369 = null;
        field2372 = null;
        field2373 = null;
        field2374 = null;
        field2368 = null;
        if (arg0 != 100) {
            field2371 = null;
        }
        field2375 = null;
        field2361 = null;
        field2371 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZZII[Lwf;I[BI)V")
    public static final void method938(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, class47[] arg7, int arg8, byte[] arg9, int arg10) {
        if (!arg3) {
            for (int var11 = 0; var11 < 8; ++var11) {
                for (int var12 = 0; var12 < 8; ++var12) {
                    if (arg2 + var11 > 0 && ~(arg2 + var11) > -104 && arg6 - -var12 > 0 && ~(arg6 - -var12) > -104) {
                        arg7[arg1].field757[arg2 + var11][arg6 - -var12] = class220.method1526(arg7[arg1].field757[arg2 + var11][arg6 - -var12], -16777217);
                    }
                }
            }
        }
        ++field2366;
        class118 var13 = new class118(arg9);
        byte var14;
        if (arg3) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        for (int var15 = 0; var15 < var14; ++var15) {
            for (int var35 = 0; ~var35 > -65; ++var35) {
                for (int var36 = 0; var36 < 64; ++var36) {
                    if (arg0 == var15 && ~arg5 >= ~var35 && arg5 - -8 > var35 && arg10 <= var36 && ~var36 > ~(arg10 + 8)) {
                        class22.method155(arg8, (byte) -77, 0, arg2 - -class280.method1916(arg8, var35 & 7, 7 & var36, -21942), 0, class280.method1913(103, var36 & 7, var35 & 7, arg8) + arg6, var13, arg3, arg1);
                    } else {
                        class22.method155(0, (byte) -77, 0, -1, 0, -1, var13, arg3, 0);
                    }
                }
            }
        }
        if (!arg4) {
            method939(-107, 117);
        }
        boolean var16 = false;
        while (~var13.field2115.length < ~var13.field2155) {
            int var17 = var13.method867(false);
            if (~var17 != -130) {
                --var13.field2155;
                break;
            }
            for (int var22 = 0; var22 < 4; ++var22) {
                byte var23 = var13.method838(1275919136);
                if (var23 != 0) {
                    if (var23 == 1) {
                        for (int var24 = 0; ~var24 > -65; var24 += 4) {
                            for (int var25 = 0; ~var25 > -65; var25 += 4) {
                                byte var26 = var13.method838(1275919136);
                                if (~var22 >= ~arg0) {
                                    int var27 = var24;
                                    while (var27 < var24 + 4) {
                                        int var28 = var25;
                                        while (~var28 > ~(var25 - -4)) {
                                            if (~var27 <= ~arg5 && ~(arg5 + 8) < ~var27 && arg10 <= var28 && ~(arg10 + 8) < ~arg10) {
                                                int var29 = class280.method1916(arg8, var27 & 7, 7 & var28, -21942) + arg2;
                                                int var30 = arg6 + class280.method1913(117, var28 & 7, 7 & var27, arg8);
                                                if (~var29 <= -1 && ~var29 > -105 && var30 >= 0 && ~var30 > -105) {
                                                    class150.field2836[arg1][var29][var30] = var26;
                                                }
                                            }
                                            ++var25;
                                        }
                                        ++var24;
                                    }
                                }
                            }
                        }
                    }
                } else if (~arg0 <= ~var22) {
                    int var31 = arg2;
                    if (~arg2 > -1) {
                        var31 = 0;
                    } else if (arg2 >= 104) {
                        var31 = 104;
                    }
                    int var32 = arg6;
                    if (arg6 < 0) {
                        var32 = 0;
                    } else if (~arg6 <= -105) {
                        var32 = 104;
                    }
                    int var33 = arg2 + 7;
                    if (~var33 > -1) {
                        var33 = 0;
                    } else if (var33 >= 104) {
                        var33 = 104;
                    }
                    int var34 = arg6 + 7;
                    if (var34 >= 0) {
                        if (var34 >= 104) {
                            var34 = 104;
                        }
                    } else {
                        var34 = 0;
                    }
                    while (~var31 > ~var33) {
                        while (~var32 > ~var34) {
                            class150.field2836[arg1][var31][var32] = 0;
                            ++var32;
                        }
                        ++var31;
                    }
                }
            }
        }
        if (!var16) {
            int var18 = arg2 - -7;
            int var19 = arg6 + 7;
            for (int var20 = arg2; var20 < var18; ++var20) {
                for (int var21 = arg6; var21 < var19; ++var21) {
                    class150.field2836[arg1][var20][var21] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field2370 = ~arg0.method867(false) == -2;
            }
        } else {
            this.field2365 = arg0.method827(255);
        }
        ++field2367;
        int var5 = 74 / ((-21 - arg1) / 55);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        int var3 = -1 / ((-60 - arg1) / 45);
        ++field2360;
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int[] var5 = this.method1866(class99.field1826 & arg0 - 1, 0, 74);
            int[] var6 = this.method1866(arg0, 0, 80);
            int[] var7 = this.method1866(class99.field1826 & arg0 + 1, 0, 75);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; class246.field4385 > var11; ++var11) {
                int var12 = (var6[class59.field1037 & var11 - -1] + -var6[class59.field1037 & var11 + -1]) * this.field2365;
                int var13 = var12 >> 12;
                int var14 = (var7[var11] + -var5[var11]) * this.field2365;
                int var15 = var14 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = var13 * var13 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 - (-var16 + -4096)) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = 16777216 / var18;
                    var20 = var14 / var18;
                    var21 = var12 / var18;
                } else {
                    var21 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field2370) {
                    var20 = 2048 - -(var20 >> 1);
                    var21 = (var21 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var21;
                var9[var11] = var20;
                var10[var11] = var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I")
    public static final int method939(int arg0, int arg1) {
        if (arg0 != 0) {
            method939(76, 124);
        }
        class209 var2 = class111.method775(arg1, -119);
        ++field2363;
        int var3 = var2.field3819;
        int var4 = var2.field3820;
        int var5 = var2.field3823;
        int var6 = class73.field1275[-var4 + var5];
        return class59.field1059[var3] >> var4 & var6;
    }
}
