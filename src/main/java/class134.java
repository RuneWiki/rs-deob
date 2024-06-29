import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class134 extends class190 {

    @OriginalMember(owner = "client!mg", name = "Nb", descriptor = "[S")
    public static short[] field2346 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!mg", name = "Fb", descriptor = "Llc;")
    public static class143 field2338 = class66.method374("::tele ", -1);

    @OriginalMember(owner = "client!mg", name = "Hb", descriptor = "Llc;")
    public static class143 field2340 = class66.method374("W-=hlen Sie eine Option", -1);

    @OriginalMember(owner = "client!mg", name = "Sb", descriptor = "I")
    public static int field2351 = 3353893;

    @OriginalMember(owner = "client!mg", name = "Wb", descriptor = "[I")
    public static int[] field2355 = new int[128];

    @OriginalMember(owner = "client!mg", name = "Tb", descriptor = "I")
    public static int field2352 = -1;

    @OriginalMember(owner = "client!mg", name = "Kb", descriptor = "Llc;")
    public static class143 field2343 = class66.method374("Bitte warten Sie)3)3)3", -1);

    @OriginalMember(owner = "client!mg", name = "Ub", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!mg", name = "Yb", descriptor = "Llc;")
    public static class143 field2357 = class66.method374("Lade Konfiguration )2 ", -1);

    @OriginalMember(owner = "client!mg", name = "Zb", descriptor = "[[I")
    public static int[][] field2358 = new int[5][5000];

    @OriginalMember(owner = "client!mg", name = "Db", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!mg", name = "Eb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!mg", name = "Gb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!mg", name = "Jb", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!mg", name = "Lb", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!mg", name = "Ob", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!mg", name = "Pb", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!mg", name = "Rb", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!mg", name = "Vb", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!mg", name = "Xb", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!mg", name = "bc", descriptor = "I")
    private int field2360;

    @OriginalMember(owner = "client!mg", name = "dc", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!mg", name = "Ib", descriptor = "Lrb;")
    public static class193 field2341;

    @OriginalMember(owner = "client!mg", name = "cc", descriptor = "Lkc;")
    private class30 field2361;

    @OriginalMember(owner = "client!mg", name = "Qb", descriptor = "Lgf;")
    public static class7 field2349;

    @OriginalMember(owner = "client!mg", name = "ac", descriptor = "Lgf;")
    public static class7 field2359;

    @OriginalMember(owner = "client!mg", name = "Mb", descriptor = "Lca;")
    public static class82 field2345;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "(II)I")
    public final int method798(int arg0, int arg1) {
        int var3 = this.field2360 >> 3;
        ++field2350;
        int var4 = -(this.field2360 & 7) + arg1;
        this.field2360 += arg0;
        int var5 = 0;
        while (var4 < arg0) {
            var5 += (class185.field3360[var4] & super.field3465[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (class185.field3360[var4] & super.field3465[var3]) + var5;
        } else {
            var6 = (super.field3465[var3] >> -arg0 + var4 & class185.field3360[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "(II)V")
    public final void method799(int arg0, int arg1) {
        ++field2336;
        if (arg0 != 103) {
            this.method798(-64, 99);
        }
        super.field3465[super.field3487++] = (byte) (arg1 + this.field2361.method203(-1));
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(Z)V")
    public final void method800(boolean arg0) {
        super.field3487 = (this.field2360 + 7) / 8;
        ++field2362;
        if (!arg0) {
            field2345 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([IB)V")
    public final void method801(int[] arg0, byte arg1) {
        if (arg1 > -94) {
            this.method807((byte) -53);
        }
        ++field2344;
        this.field2361 = new class30(arg0);
    }

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "(I)V")
    public static void method802(int arg0) {
        field2359 = null;
        field2341 = null;
        field2358 = null;
        field2346 = null;
        if (arg0 <= 42) {
            method803(false);
        }
        field2349 = null;
        field2345 = null;
        field2338 = null;
        field2355 = null;
        field2357 = null;
        field2343 = null;
        field2340 = null;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(Z)V")
    public static final void method803(boolean arg0) {
        if (!arg0) {
            ++field2356;
            if (class91.method520(1) == 2) {
                int var1 = class141.field2460 % 104;
                byte var2 = (byte) (255 & class141.field2460 + -4);
                for (int var3 = 0; ~var3 > -5; ++var3) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        class36.field623[var3][var1][var16] = var2;
                    }
                }
                if (~class170.field3044 != -4) {
                    for (int var4 = 0; var4 < 2; ++var4) {
                        class42.field707[var4] = -1000000;
                        class63.field1196[var4] = 1000000;
                        class159.field2863[var4] = 0;
                        class13.field245[var4] = 1000000;
                        class158.field2858[var4] = 0;
                    }
                    if (class21.field349 == 1) {
                        if ((4 & class231.field4225[class170.field3044][class229.field4195.field4178 >> 7][class229.field4195.field4108 >> 7]) != 0) {
                            class268.method1777(class229.field4195.field4108 >> 7, 0, false, class229.field4195.field4178 >> 7, class7.field122, -105);
                        }
                        if (~class163.field2925 > -311) {
                            int var5 = class167.field2992 >> 7;
                            int var6 = class154.field2776 >> 7;
                            int var7 = class229.field4195.field4178 >> 7;
                            int var8 = class229.field4195.field4108 >> 7;
                            int var9;
                            if (~var8 >= ~var6) {
                                var9 = -var8 + var6;
                            } else {
                                var9 = -var6 + var8;
                            }
                            int var10;
                            if (var5 >= var7) {
                                var10 = var5 - var7;
                            } else {
                                var10 = var7 - var5;
                            }
                            if (var10 <= var9) {
                                int var11 = 32768;
                                int var12 = var10 * 65536 / var9;
                                while (~var6 != ~var8) {
                                    if (~var8 >= ~var6) {
                                        if (var6 > var8) {
                                            --var6;
                                        }
                                    } else {
                                        ++var6;
                                    }
                                    if ((4 & class231.field4225[class170.field3044][var5][var6]) != 0) {
                                        class268.method1777(var6, 1, false, var5, class7.field122, -105);
                                        return;
                                    }
                                    var11 += var12;
                                    if (~var11 <= -65537) {
                                        var11 -= 65536;
                                        if (~var5 > ~var7) {
                                            ++var5;
                                        } else if (var5 > var7) {
                                            --var5;
                                        }
                                        if ((4 & class231.field4225[class170.field3044][var5][var6]) != 0) {
                                            class268.method1777(var6, 1, false, var5, class7.field122, -105);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var13 = var9 * 65536 / var10;
                            int var14 = 32768;
                            while (var5 != var7) {
                                if (var5 >= var7) {
                                    if (var5 > var7) {
                                        --var5;
                                    }
                                } else {
                                    ++var5;
                                }
                                if ((4 & class231.field4225[class170.field3044][var5][var6]) != 0) {
                                    class268.method1777(var6, 1, false, var5, class7.field122, -105);
                                    return;
                                }
                                var14 += var13;
                                if (~var14 <= -65537) {
                                    if (var8 > var6) {
                                        ++var6;
                                    } else if (~var8 > ~var6) {
                                        --var6;
                                    }
                                    var14 -= 65536;
                                    if ((class231.field4225[class170.field3044][var5][var6] & 4) != 0) {
                                        class268.method1777(var6, 1, false, var5, class7.field122, -105);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                    } else {
                        int var15 = class20.method140(class167.field2992, 122, class154.field2776, class170.field3044);
                        if (~(-class92.field1658 + var15) <= -801 || (4 & class231.field4225[class170.field3044][class167.field2992 >> 7][class154.field2776 >> 7]) == 0) {
                            return;
                        }
                        class268.method1777(class154.field2776 >> 7, 1, false, class167.field2992 >> 7, class7.field122, -105);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(B)V")
    public final void method804(byte arg0) {
        if (arg0 < 105) {
            this.method801((int[]) null, (byte) -53);
        }
        ++field2339;
        this.field2360 = super.field3487 * 8;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III[B)V")
    public final void method805(int arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 0;
        if (arg0 >= 16) {
            while (~var5 > ~arg1) {
                arg3[arg2 + var5] = (byte) (super.field3465[super.field3487++] + -this.field2361.method203(-1));
                ++var5;
            }
            ++field2342;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
    public class134(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "(II)V")
    public static final void method806(int arg0, int arg1) {
        ++field2347;
        class160 var2;
        if (class105.field1849 != null) {
            var2 = (class160) class105.field1849;
        } else {
            var2 = new class160(512, 512);
        }
        int[] var3 = var2.field2894;
        int var4 = var3.length;
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (-var6 + 103) * 4 * 512 + 24628;
            for (int var25 = 1; ~var25 > -104; ++var25) {
                if (~(24 & class231.field4225[arg0][var25][var6]) == -1) {
                    class38.method248(var3, var24, 512, arg0, var25, var6);
                }
                if (~arg0 > -4 && (8 & class231.field4225[arg0 + 1][var25][var6]) != 0) {
                    class38.method248(var3, var24, 512, arg0 - -1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1064();
        int var7 = -10 + (int) (20.0D * Math.random()) + 238 + (-10 + (int) (20.0D * Math.random()) + 238 << 8) + (238 + (int) (Math.random() * 20.0D) + -10 << 16);
        int var8 = -10 + 238 + (int) (Math.random() * 20.0D) << 16;
        if (arg1 != 3) {
            field2357 = null;
        }
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if (~(24 & class231.field4225[arg0][var23][var9]) == -1) {
                    class79.method447(var7, (byte) 92, arg0, var23, var8, var9);
                }
                if (arg0 < 3 && (class231.field4225[arg0 + 1][var23][var9] & 8) != 0) {
                    class79.method447(var7, (byte) 115, arg0 + 1, var23, var8, var9);
                }
            }
        }
        class47.field927 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                long var12 = class273.method1801(class170.field3044, var10, var11);
                if (~var12 != -1L) {
                    class209 var14 = class34.method232(arg1 ^ 164, Integer.MAX_VALUE & (int) (var12 >>> 32));
                    int var15 = var14.field3851;
                    if (var14.field3868 != null) {
                        for (int var16 = 0; var16 < var14.field3868.length; ++var16) {
                            if (~var14.field3868[var16] != 0) {
                                class209 var17 = class34.method232(167, var14.field3868[var16]);
                                if (var17.field3851 >= 0) {
                                    var15 = var17.field3851;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (~var15 != -23 && ~var15 != -30 && ~var15 != -35 && var15 != 36 && ~var15 != -47 && ~var15 != -48 && ~var15 != -49) {
                            int[][] var20 = class171.field3052[class170.field3044].field1868;
                            for (int var21 = 0; ~var21 > -11; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && var18 > var10 - 3 && ~(19661064 & var20[var18 + -1][var19]) == -1) {
                                    --var18;
                                }
                                if (~var22 == -2 && var18 < 103 && var10 + 3 > var18 && ~(var20[var18 + 1][var19] & 19661184) == -1) {
                                    ++var18;
                                }
                                if (var22 == 2 && var19 > 0 && var19 > var11 - 3 && ~(19661058 & var20[var18][var19 - 1]) == -1) {
                                    --var19;
                                }
                                if (~var22 == -4 && ~var19 > -104 && var11 + 3 > var19 && (var20[var18][var19 - -1] & 19661088) == 0) {
                                    ++var19;
                                }
                            }
                        }
                        class71.field1343[class47.field927] = var14.field3879;
                        class202.field3676[class47.field927] = var18;
                        class159.field2877[class47.field927] = var19;
                        ++class47.field927;
                    }
                }
            }
        }
        class105.field1849 = var2;
        class35.field608.method923((byte) 110);
    }

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "(B)I")
    public final int method807(byte arg0) {
        ++field2348;
        if (arg0 < 95) {
            field2343 = null;
        }
        return super.field3465[super.field3487++] + -this.field2361.method203(-1) & 255;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BII)I")
    public static final int method808(byte arg0, int arg1, int arg2) {
        class162 var3 = (class162) class143.field2518.method1824((long) arg1, 0);
        if (arg0 != -29) {
            field2353 = -83;
        }
        ++field2337;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2911.length; ++var5) {
                if (var3.field2916[var5] == arg2) {
                    var4 += var3.field2911[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "(II)I")
    public final int method809(int arg0, int arg1) {
        ++field2354;
        if (arg1 != -2542) {
            method803(true);
        }
        return arg0 * 8 - this.field2360;
    }
}
