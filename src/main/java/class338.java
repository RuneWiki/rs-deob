import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class338 extends class242 {

    @OriginalMember(owner = "client!kl", name = "Mb", descriptor = "Z")
    public static boolean field4610 = false;

    @OriginalMember(owner = "client!kl", name = "Nb", descriptor = "I")
    public static int field4611 = 0;

    @OriginalMember(owner = "client!kl", name = "zb", descriptor = "I")
    private int field4597;

    @OriginalMember(owner = "client!kl", name = "Ab", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!kl", name = "Bb", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!kl", name = "Cb", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!kl", name = "Db", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!kl", name = "Eb", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!kl", name = "Fb", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!kl", name = "Gb", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!kl", name = "Hb", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!kl", name = "Jb", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!kl", name = "Kb", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!kl", name = "Lb", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!kl", name = "Ib", descriptor = "Lgq;")
    private class212 field4606;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kl", name = "Ob", descriptor = "Ljava/lang/Class;")
    public static Class field4612;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2173(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(ZI)V", line = 3)
    public final void method2162(boolean arg0, int arg1) {
        if (arg0) {
            this.method2167(95);
        }
        ++field4603;
        super.field3188[super.field3211++] = (byte) (this.field4606.method1293((byte) -111) + arg1);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V", line = 15)
    public static final void method2163(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4609;
        if (arg4 != 23251) {
            field4611 = 105;
        }
        if (~arg1 <= ~class295.field3937 && ~arg1 >= ~class427.field5844) {
            int var5 = class65.method376(class53.field624, class118.field1356, arg0, (byte) -102);
            int var6 = class65.method376(class53.field624, class118.field1356, arg3, (byte) 107);
            class122.method802(78, arg2, var5, var6, arg1);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[I)V", line = 34)
    public final void method2164(int arg0, int[] arg1) {
        ++field4601;
        if (arg0 <= -51) {
            this.field4606 = new class212(arg1);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(IZ)Z", line = 46)
    public static final boolean method2165(int arg0, boolean arg1) {
        if (arg0 != -1) {
            method2165(-77, false);
        }
        ++field4600;
        boolean var2 = class267.field3454.method714();
        if (arg1 != var2) {
            if (arg1) {
                if (!class267.field3454.method779()) {
                    arg1 = false;
                }
            } else {
                class267.field3454.method735();
            }
            if (var2 != !arg1) {
                return false;
            } else {
                class265.field3408 = arg1;
                class362.method2273(class401.field5525, (byte) 108);
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "(I)I", line = 88)
    public final int method2166(int arg0) {
        int var2 = -34 / ((25 - arg0) / 56);
        ++field4599;
        return 255 & super.field3188[super.field3211++] + -this.field4606.method1293((byte) -111);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V", line = 101)
    public class338(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "(I)V", line = 109)
    public final void method2167(int arg0) {
        if (arg0 <= -11) {
            ++field4598;
            this.field4597 = super.field3211 * 8;
        }
    }

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "(I)V", line = 121)
    public final void method2168(int arg0) {
        super.field3211 = (this.field4597 + 7) / 8;
        ++field4605;
        if (arg0 < 0) {
            this.method2164(58, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILuo;I)Z", line = 134)
    public static final boolean method2169(int arg0, class118 arg1, int arg2) {
        ++field4604;
        int var3 = (class22.field232 - 104) / 2;
        int var4 = (class196.field2329 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~(var3 + 104) < ~var6; ++var6) {
            for (int var52 = var4; var4 + 104 > var52; ++var52) {
                for (int var53 = arg2; var53 <= 3; ++var53) {
                    if (class221.method1341(127, var52, var6, arg2, var53)) {
                        int var54 = var53;
                        if (class449.method2782(var6, (byte) -7, var52)) {
                            var54 = var53 - 1;
                        }
                        if (~var54 <= -1) {
                            var5 &= class2.method8(var54, var6, var52, (byte) -54);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            int var8 = -108 / ((arg0 - -30) / 41);
            for (int var9 = 0; ~var9 > ~var7.length; ++var9) {
                var7[var9] = -16777216;
            }
            class62.field768 = arg1.method703(var7, 0, 512, 512, 512);
            class423.method2590(true);
            int var10 = -16777216 | ((int) (20.0D * Math.random()) + 228 << 8) + (-10 + (int) (20.0D * Math.random()) + 238 << 16) + 228 - -((int) (20.0D * Math.random()));
            int var11 = -10 + (int) (Math.random() * 20.0D) + 238 << 16 | -16777216;
            int var12 = (int) (8.0D * Math.random()) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
            boolean[][] var13 = new boolean[class208.field2525][class208.field2525];
            for (int var14 = var3; var3 + 104 > var14; var14 += class208.field2525) {
                for (int var37 = var4; var37 < var4 + 104; var37 += class208.field2525) {
                    arg1.method774(0, 0, class208.field2525 * 4, class208.field2525 * 4);
                    arg1.method728(-16777216);
                    for (int var38 = arg2; ~var38 >= -4; ++var38) {
                        for (int var45 = 0; ~var45 > ~class208.field2525; ++var45) {
                            for (int var51 = 0; ~class208.field2525 < ~var51; ++var51) {
                                var13[var45][var51] = class221.method1341(123, var37 + var51, var14 - -var45, arg2, var38);
                            }
                        }
                        class219.field2709[var38].method1052(0, 0, 1024, var14, var37, class208.field2525 + var14, class208.field2525 + var37, var13);
                        if (!class427.field5841) {
                            for (int var46 = -4; var46 < class208.field2525; ++var46) {
                                for (int var47 = -4; class208.field2525 > var47; ++var47) {
                                    int var48 = var14 + var46;
                                    int var49 = var37 - -var47;
                                    if (var3 <= var48 && ~var49 <= ~var4 && class221.method1341(126, var49, var48, arg2, var38)) {
                                        int var50 = var38;
                                        if (class449.method2782(var48, (byte) -7, var49)) {
                                            var50 = var38 - 1;
                                        }
                                        if (var50 >= 0) {
                                            class241.method1536(var50, var11, var49, var10, false, var46 * 4, (class208.field2525 - var47) * 4 - 4, arg1, var48);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class427.field5841) {
                        class366 var39 = class156.field1815[arg2];
                        for (int var40 = 0; ~var40 > ~class208.field2525; ++var40) {
                            for (int var41 = 0; ~var41 > ~class208.field2525; ++var41) {
                                int var42 = var14 + var40;
                                int var43 = var37 + var41;
                                int var44 = var39.field4977[-var39.field4982 + var42][var43 - var39.field4992];
                                if (~(1076101120 & var44) == -1) {
                                    if ((var44 & 8388608) != 0) {
                                        arg1.method705((byte) 98, 4, (-var41 + class208.field2525) * 4 + -4, var40 * 4, -1713569622);
                                    } else if ((var44 & 33554432) == 0) {
                                        if ((var44 & 134217728) != 0) {
                                            arg1.method705((byte) 110, 4, (class208.field2525 - var41) * 4 + 3 + -4, var40 * 4, -1713569622);
                                        } else if ((536870912 & var44) != 0) {
                                            arg1.method754(4, -1713569622, -123, (class208.field2525 - var41) * 4 - 4, var40 * 4);
                                        }
                                    } else {
                                        arg1.method754(4, -1713569622, -123, (-var41 + class208.field2525) * 4 + -4, var40 * 4 + 3);
                                    }
                                } else {
                                    arg1.method739((byte) 5, -1713569622, var40 * 4, 4, (-var41 + class208.field2525) * 4 + -4, 4);
                                }
                            }
                        }
                    }
                    arg1.method789(0, 0, class208.field2525 * 4, class208.field2525 * 4, var12, 2);
                    class62.field768.method168((-var3 + var14) * 4 + 48, -((-var4 + var37) * 4) + -(class208.field2525 * 4) + 464, class208.field2525 * 4, class208.field2525 * 4, 0, 0);
                }
            }
            arg1.method732();
            arg1.method728(-16777215);
            class11.method53(16026);
            class414.field5686 = 0;
            class23.field245.method1701(true);
            if (!class427.field5841) {
                for (int var15 = var3; ~(var3 + 104) < ~var15; ++var15) {
                    for (int var21 = var4; var4 + 104 > var21; ++var21) {
                        for (int var22 = arg2; ~var22 >= ~(arg2 + 1) && var22 <= 3; ++var22) {
                            if (class221.method1341(120, var21, var15, arg2, var22)) {
                                class171 var23 = (class171) class451.method2792(var22, var15, var21);
                                if (var23 == null) {
                                    var23 = (class171) class246.method1610(var22, var15, var21, field4612 != null ? field4612 : (field4612 = method2173("ol")));
                                }
                                if (var23 == null) {
                                    var23 = (class171) class440.method2708(var22, var15, var21);
                                }
                                if (var23 == null) {
                                    var23 = (class171) class65.method373(var22, var15, var21);
                                }
                                if (var23 != null) {
                                    class446 var24 = class380.method2361(var23.method409(-50), -29012);
                                    if (!var24.field6203 || class357.field4843) {
                                        int var25 = var24.field6202;
                                        if (var24.field6233 != null) {
                                            for (int var26 = 0; var24.field6233.length > var26; ++var26) {
                                                if (var24.field6233[var26] != -1) {
                                                    class446 var27 = class380.method2361(var24.field6233[var26], -29012);
                                                    if (~var27.field6202 <= -1) {
                                                        var25 = var27.field6202;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var25 <= -1) {
                                            boolean var28 = false;
                                            if (var25 >= 0) {
                                                class222 var29 = class339.method2178(false, var25);
                                                if (var29 != null && var29.field2775) {
                                                    var28 = true;
                                                }
                                            }
                                            int var30 = var15;
                                            int var31 = var21;
                                            if (var28) {
                                                int[][] var32 = class156.field1815[var22].field4977;
                                                int var33 = class156.field1815[var22].field4982;
                                                int var34 = class156.field1815[var22].field4992;
                                                for (int var35 = 0; ~var35 > -11; ++var35) {
                                                    int var36 = (int) (Math.random() * 4.0D);
                                                    if (~var36 == -1 && ~var30 < ~var3 && ~(var15 - 3) > ~var30 && (2883848 & var32[-var33 + var30 - 1][-var34 + var31]) == 0) {
                                                        --var30;
                                                    }
                                                    if (var36 == 1 && var30 < var3 + 104 + -1 && var30 < var15 + 3 && ~(2883968 & var32[1 - var33 + var30][-var34 + var31]) == -1) {
                                                        ++var30;
                                                    }
                                                    if (~var36 == -3 && ~var4 > ~var31 && ~(var21 + -3) > ~var31 && ~(var32[-var33 + var30][var31 + -1 - var34] & 2883842) == -1) {
                                                        --var31;
                                                    }
                                                    if (~var36 == -4 && var31 < var4 + -1 - -104 && var31 < var21 + 3 && ~(2883872 & var32[-var33 + var30][var31 + 1 - var34]) == -1) {
                                                        ++var31;
                                                    }
                                                }
                                            }
                                            class439.field6041[class414.field5686] = var24.field6209;
                                            class278.field3597[class414.field5686] = var30;
                                            class244.field3248[class414.field5686] = var31;
                                            ++class414.field5686;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class234.field3075 != null) {
                    class332.field4520.field3759 = 1;
                    class356.method2251(45, 1024, 64);
                    for (int var16 = 0; var16 < class234.field3075.field5337; ++var16) {
                        int var17 = class234.field3075.field5342[var16];
                        if (~(var17 >> 28) == ~class43.field513) {
                            int var18 = (16383 & var17 >> 14) + -class278.field3608;
                            int var19 = (var17 & 16383) + -class129.field1432;
                            if (~var18 <= -1 && var18 < class22.field232 && var19 >= 0 && class196.field2329 > var19) {
                                class23.field245.method1696(false, new class369(var16));
                            } else {
                                class222 var20 = class339.method2178(false, class234.field3075.field5338[var16]);
                                if (var20.field2773 != null && var20.field2764 + var18 >= 0 && class22.field232 > var20.field2761 + var18 && ~(var19 - -var20.field2762) <= -1 && var19 - -var20.field2781 < class196.field2329) {
                                    class23.field245.method1696(false, new class369(var16));
                                }
                            }
                        }
                    }
                    class356.method2251(45, 128, 64);
                    class332.field4520.field3759 = 2;
                    class332.field4520.method1802((byte) 28);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "(II)I", line = 543)
    public final int method2170(int arg0, int arg1) {
        if (arg1 != 7329) {
            field4611 = -3;
        }
        ++field4608;
        return arg0 * 8 + -this.field4597;
    }

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "(II)I", line = 556)
    public final int method2171(int arg0, int arg1) {
        ++field4607;
        int var3 = this.field4597 >> 3;
        if (arg1 < 69) {
            return 36;
        } else {
            int var4 = -(this.field4597 & 7) + 8;
            this.field4597 += arg0;
            int var5 = 0;
            while (~var4 > ~arg0) {
                var5 += (super.field3188[var3++] & class162.field1893[var4]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg0 == ~var4) {
                var6 = (class162.field1893[var4] & super.field3188[var3]) + var5;
            } else {
                var6 = (super.field3188[var3] >> var4 - arg0 & class162.field1893[arg0]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([BIII)V", line = 588)
    public final void method2172(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg1; var5 < arg3; ++var5) {
            arg0[var5 - -arg2] = (byte) (super.field3188[super.field3211++] + -this.field4606.method1293((byte) -111));
        }
        ++field4602;
    }
}
