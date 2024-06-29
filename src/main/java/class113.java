import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 extends class1 {

    @OriginalMember(owner = "client!ke", name = "pb", descriptor = "Z")
    private boolean field2015 = true;

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
    private int field2012 = 4096;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "Loc;")
    public static class151 field2008 = class137.method873(2, "hint_mapedge");

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "Loc;")
    public static class151 field2006 = class137.method873(2, "::tele 0)1");

    @OriginalMember(owner = "client!ke", name = "ob", descriptor = "Loc;")
    private static class151 field2014 = class137.method873(2, "Select a world");

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "Loc;")
    public static class151 field2009 = field2014;

    @OriginalMember(owner = "client!ke", name = "nb", descriptor = "Luc;")
    public static class211 field2013 = new class211(128);

    @OriginalMember(owner = "client!ke", name = "wb", descriptor = "Loc;")
    private static class151 field2022 = class137.method873(2, "Existing User");

    @OriginalMember(owner = "client!ke", name = "tb", descriptor = "Loc;")
    public static class151 field2019 = field2022;

    @OriginalMember(owner = "client!ke", name = "vb", descriptor = "Luc;")
    public static class211 field2021 = new class211(16);

    @OriginalMember(owner = "client!ke", name = "xb", descriptor = "[I")
    public static int[] field2023 = new int[5];

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ke", name = "rb", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ke", name = "sb", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ke", name = "ub", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ke", name = "qb", descriptor = "Ljh;")
    public static class105 field2016;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != -81) {
            field2008 = null;
        }
        int[][] var3 = super.field13.method578(arg0, -1);
        ++field2010;
        if (super.field13.field1658) {
            int[] var4 = this.method4(class155.field2804 & arg0 - 1, arg1 + -38, 0);
            int[] var5 = this.method4(arg0, -126, 0);
            int[] var6 = this.method4(class155.field2804 & arg0 + 1, -127, 0);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class202.field3603; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2012;
                int var12 = (var5[class78.field1510 & var10 + 1] + -var5[var10 + -1 & class78.field1510]) * this.field2012;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                    var18 = 16777216 / var17;
                }
                if (this.field2015) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var10] = var19;
                var7[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static void method681(int arg0) {
        field2006 = null;
        field2021 = null;
        field2009 = null;
        field2022 = null;
        field2008 = null;
        field2023 = null;
        field2019 = null;
        field2014 = null;
        field2013 = null;
        if (arg0 <= 17) {
            field2008 = null;
        }
        field2016 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)Z")
    public static final boolean method682(int arg0, int arg1, int arg2, int arg3) {
        if (!class233.method1527(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class9.method53(var4 + 1, class233.field4286[arg0][arg1][arg2] + arg3, var5 + 1) && class9.method53(var4 + 128 - 1, class233.field4286[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class9.method53(var4 + 128 - 1, class233.field4286[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class9.method53(var4 + 1, class233.field4286[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
    public static final void method683(int arg0, int arg1) {
        class210.field3678 += arg0 * 128;
        ++field2007;
        short var2 = 256;
        if (class189.field3346.length < class210.field3678) {
            class210.field3678 -= class189.field3346.length;
            int var3 = (int) (12.0D * Math.random());
            class147.method934(class228.field3988[var3], 9049);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var6 > var7; ++var7) {
            int var27 = class192.field3419[var4 + var5] + -(class189.field3346[class189.field3346.length + -1 & class210.field3678 + var4] * arg0 / 6);
            if (~var27 > -1) {
                var27 = 0;
            }
            class192.field3419[var4++] = var27;
        }
        for (int var8 = -arg0 + var2; var8 < var2; ++var8) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; ++var25) {
                int var26 = (int) (100.0D * Math.random());
                if (~var26 > -51 && var25 > 10 && ~var25 > -119) {
                    class192.field3419[var24 + var25] = 255;
                } else {
                    class192.field3419[var24 + var25] = 0;
                }
            }
        }
        if (class5.field98 > 0) {
            class5.field98 -= arg0 * 4;
        }
        if (~class64.field1249 < -1) {
            class64.field1249 -= arg0 * 4;
        }
        if (~class5.field98 == -1 && ~class64.field1249 == -1) {
            int var9 = (int) (Math.random() * (double) (2000 / arg0));
            if (~var9 == -2) {
                class64.field1249 = 1024;
            }
            if (~var9 == -1) {
                class5.field98 = 1024;
            }
        }
        int var10 = 0;
        if (arg1 > 22) {
            while (~var10 > ~(-arg0 + var2)) {
                class63.field1232[var10] = class63.field1232[arg0 + var10];
                ++var10;
            }
            for (int var11 = -arg0 + var2; ~var11 > ~var2; ++var11) {
                class63.field1232[var11] = (int) (Math.sin((double) class26.field555 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class26.field555 / 15.0D) + Math.sin((double) class26.field555 / 16.0D) * 12.0D);
                ++class26.field555;
            }
            class20.field450 += arg0;
            int var12 = ((class200.field3541 & 1) + arg0) / 2;
            if (~var12 < -1) {
                for (int var13 = 0; ~var13 > ~(class20.field450 * 100); ++var13) {
                    int var22 = 2 + (int) (124.0D * Math.random());
                    int var23 = 128 + (int) (Math.random() * 128.0D);
                    class192.field3419[(var23 << 7) + var22] = 192;
                }
                class20.field450 = 0;
                for (int var14 = 0; ~var2 < ~var14; ++var14) {
                    int var19 = 0;
                    int var20 = var14 * 128;
                    for (int var21 = -var12; ~var21 > -129; ++var21) {
                        if (~(var12 + var21) > -129) {
                            var19 += class192.field3419[var12 + var21 + var20];
                        }
                        if (-var12 + var21 + -1 >= 0) {
                            var19 -= class192.field3419[var20 + var21 - (var12 + 1)];
                        }
                        if (~var21 <= -1) {
                            class67.field1323[var20 + var21] = var19 / (var12 * 2 + 1);
                        }
                    }
                }
                for (int var15 = 0; var15 < 128; ++var15) {
                    int var16 = 0;
                    for (int var17 = -var12; ~var2 < ~var17; ++var17) {
                        int var18 = var17 * 128;
                        if (var12 + var17 < var2) {
                            var16 += class67.field1323[var15 - (-(var12 * 128) + -var18)];
                        }
                        if (~(-var12 + -1 + var17) <= -1) {
                            var16 -= class67.field1323[-(var12 * 128) + -128 + var15 + var18];
                        }
                        if (~var17 <= -1) {
                            class192.field3419[var15 - -var18] = var16 / (var12 * 2 + 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIII)I")
    public static final int method684(int arg0, int arg1, int arg2, int arg3) {
        ++field2020;
        if (arg3 != -302) {
            return 4;
        } else {
            if (~arg2 >= -244) {
                if (arg2 > 217) {
                    arg0 >>= 3;
                } else if (~arg2 < -193) {
                    arg0 >>= 2;
                } else if (arg2 > 179) {
                    arg0 >>= 1;
                }
            } else {
                arg0 >>= 4;
            }
            return (arg0 >> 5 << 7) + (arg1 >> 2 << 10) + (arg2 >> 1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
    public static final void method685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0 + arg4;
        if (arg5 != 11874) {
            field2023 = null;
        }
        int var7 = arg3 - arg2;
        ++field2018;
        if (~var6 == -1) {
            if (~var7 != -1) {
                class54.method370(35, arg3, arg0, arg1, arg2);
            }
        } else if (var7 == 0) {
            class174.method1109(arg4, (byte) 120, arg2, arg0, arg1);
        } else {
            if (~var6 > -1) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg4;
                arg4 = arg3;
                arg3 = var9;
                int var10 = arg0;
                arg0 = arg2;
                arg2 = var10;
            }
            if (arg0 > arg4) {
                int var11 = arg0;
                arg0 = arg4;
                int var12 = arg2;
                arg2 = arg3;
                arg3 = var12;
                arg4 = var11;
            }
            int var13 = arg2;
            int var14 = arg4 - arg0;
            int var15 = -(var14 >> 1);
            int var16 = -arg2 + arg3;
            if (~var16 > -1) {
                var16 = -var16;
            }
            int var17 = arg2 < arg3 ? 1 : -1;
            if (!var8) {
                for (int var18 = arg0; ~arg4 <= ~var18; ++var18) {
                    var15 += var16;
                    class43.field887[var13][var18] = arg1;
                    if (~var15 < -1) {
                        var15 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg0; ~arg4 <= ~var19; ++var19) {
                    var15 += var16;
                    class43.field887[var19][var13] = arg1;
                    if (~var15 < -1) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2015 = arg2.method1475(255) == 1;
            }
        } else {
            this.field2012 = arg2.method1490((byte) 73);
        }
        if (arg0 != 0) {
            field2023 = null;
        }
        ++field2017;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class113() {
        super(1, false);
    }
}
