import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class104 extends class169 {

    @OriginalMember(owner = "client!ke", name = "rb", descriptor = "[Leg;")
    public static class48[] field2012 = new class48[50];

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
    public static int field2007 = -1;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "[I")
    public static int[] field2004 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ke", name = "sb", descriptor = "Z")
    public static volatile boolean field2013 = true;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ke", name = "nb", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ke", name = "ob", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ke", name = "tb", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ke", name = "ub", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ke", name = "qb", descriptor = "[I")
    public static int[] field2011;

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "[Lfa;")
    public static class52[] field2006;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBIIII)V")
    public static final void method693(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2009;
        if (arg2 == 86) {
            int var7 = 0;
            class182.method1229(-16361, arg0);
            int var8 = arg0;
            int var9 = -arg5 + arg0;
            if (var9 < 0) {
                var9 = 0;
            }
            int var10 = var9;
            int var11 = -arg0;
            int var12 = -var9;
            int var13 = -1;
            int var14 = -1;
            if (~arg1 <= ~class35.field698 && class130.field2470 >= arg1) {
                int[] var15 = class41.field805[arg1];
                int var16 = class106.method703(class68.field1323, class136.field2590, true, arg6 - arg0);
                int var17 = class106.method703(class68.field1323, class136.field2590, true, arg0 + arg6);
                int var18 = class106.method703(class68.field1323, class136.field2590, true, -var9 + arg6);
                int var19 = class106.method703(class68.field1323, class136.field2590, true, arg6 + var9);
                class180.method1217(var18, (byte) 52, var16, arg4, var15);
                class180.method1217(var19, (byte) 52, var18, arg3, var15);
                class180.method1217(var17, (byte) 52, var19, arg4, var15);
            }
            while (var8 > var7) {
                var13 += 2;
                var11 += var13;
                var14 += 2;
                var12 += var14;
                if (~var12 <= -1 && ~var10 <= -2) {
                    --var10;
                    class211.field4014[var10] = var7;
                    var12 -= var10 << 1;
                }
                ++var7;
                if (var11 >= 0) {
                    --var8;
                    int var20 = arg1 - var8;
                    var11 -= var8 << 1;
                    int var21 = arg1 - -var8;
                    if (~class35.field698 >= ~var21 && ~var20 >= ~class130.field2470) {
                        if (~var9 < ~var8) {
                            int var22 = class211.field4014[var8];
                            int var23 = class106.method703(class68.field1323, class136.field2590, true, arg6 + var7);
                            int var24 = class106.method703(class68.field1323, class136.field2590, true, -var7 + arg6);
                            int var25 = class106.method703(class68.field1323, class136.field2590, true, arg6 + var22);
                            int var26 = class106.method703(class68.field1323, class136.field2590, true, -var22 + arg6);
                            if (~class130.field2470 <= ~var21) {
                                int[] var27 = class41.field805[var21];
                                class180.method1217(var26, (byte) 52, var24, arg4, var27);
                                class180.method1217(var25, (byte) 52, var26, arg3, var27);
                                class180.method1217(var23, (byte) 52, var25, arg4, var27);
                            }
                            if (~var20 <= ~class35.field698) {
                                int[] var28 = class41.field805[var20];
                                class180.method1217(var26, (byte) 52, var24, arg4, var28);
                                class180.method1217(var25, (byte) 52, var26, arg3, var28);
                                class180.method1217(var23, (byte) 52, var25, arg4, var28);
                            }
                        } else {
                            int var29 = class106.method703(class68.field1323, class136.field2590, true, arg6 - -var7);
                            int var30 = class106.method703(class68.field1323, class136.field2590, true, -var7 + arg6);
                            if (~class130.field2470 <= ~var21) {
                                class180.method1217(var29, (byte) 52, var30, arg4, class41.field805[var21]);
                            }
                            if (~class35.field698 >= ~var20) {
                                class180.method1217(var29, (byte) 52, var30, arg4, class41.field805[var20]);
                            }
                        }
                    }
                }
                int var31 = arg1 + var7;
                int var32 = -var7 + arg1;
                if (~class35.field698 >= ~var31 && var32 <= class130.field2470) {
                    int var33 = arg6 + var8;
                    int var34 = -var8 + arg6;
                    if (~class68.field1323 >= ~var33 && ~var34 >= ~class136.field2590) {
                        int var35 = class106.method703(class68.field1323, class136.field2590, true, var33);
                        int var36 = class106.method703(class68.field1323, class136.field2590, true, var34);
                        if (var9 > var7) {
                            int var37 = ~var10 <= ~var7 ? var10 : class211.field4014[var7];
                            int var38 = class106.method703(class68.field1323, class136.field2590, true, arg6 + var37);
                            int var39 = class106.method703(class68.field1323, class136.field2590, true, -var37 + arg6);
                            if (~class130.field2470 <= ~var31) {
                                int[] var40 = class41.field805[var31];
                                class180.method1217(var39, (byte) 52, var36, arg4, var40);
                                class180.method1217(var38, (byte) 52, var39, arg3, var40);
                                class180.method1217(var35, (byte) 52, var38, arg4, var40);
                            }
                            if (~class35.field698 >= ~var32) {
                                int[] var41 = class41.field805[var32];
                                class180.method1217(var39, (byte) 52, var36, arg4, var41);
                                class180.method1217(var38, (byte) 52, var39, arg3, var41);
                                class180.method1217(var35, (byte) 52, var38, arg4, var41);
                            }
                        } else {
                            if (var31 <= class130.field2470) {
                                class180.method1217(var35, (byte) 52, var36, arg4, class41.field805[var31]);
                            }
                            if (~class35.field698 >= ~var32) {
                                class180.method1217(var35, (byte) 52, var36, arg4, class41.field805[var32]);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lud;II)V")
    public static final void method694(class203 arg0, int arg1, int arg2) {
        if (arg2 == 13184) {
            ++field2014;
            if (~arg0.field3843 < ~class20.field344) {
                class35.method244(arg0, 776);
            } else if (arg0.field3881 >= class20.field344) {
                class178.method1211((byte) 121, arg0);
            } else {
                class103.method690(arg0, -105);
            }
            if (arg0.field3889 < 128 || ~arg0.field3854 > -129 || arg0.field3889 >= 13184 || arg0.field3854 >= 13184) {
                arg0.field3889 = arg0.field3870[0] * 128 - -(arg0.field3871 * 64);
                arg0.field3854 = arg0.field3892[0] * 128 + arg0.field3871 * 64;
                arg0.field3881 = 0;
                arg0.field3843 = 0;
                arg0.field3851 = -1;
                arg0.field3827 = -1;
                arg0.method1349((byte) -99);
            }
            if (class114.field2176 == arg0 && (~arg0.field3889 > -1537 || arg0.field3854 < 1536 || arg0.field3889 >= 11776 || arg0.field3854 >= 11776)) {
                arg0.field3854 = arg0.field3892[0] * 128 - -(arg0.field3871 * 64);
                arg0.field3827 = -1;
                arg0.field3881 = 0;
                arg0.field3851 = -1;
                arg0.field3843 = 0;
                arg0.field3889 = arg0.field3870[0] * 128 + arg0.field3871 * 64;
                arg0.method1349((byte) 118);
            }
            class147.method1019(arg2 ^ -13302, arg0);
            class139.method892(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V")
    public static void method695(int arg0) {
        field2004 = null;
        field2011 = null;
        field2006 = null;
        if (arg0 == 128) {
            field2012 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = -120 % ((arg1 - -42) / 41);
        ++field2008;
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093 && this.method1159(26239)) {
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int var8 = arg0 % super.field3253 * super.field3253;
            for (int var9 = 0; var9 < class117.field2272; ++var9) {
                int var10 = super.field3252[var9 % super.field3245 + var8];
                var6[var9] = class15.method94(4080, var10 << 4);
                var5[var9] = class15.method94(65280, var10) >> 4;
                var7[var9] = class15.method94(var10 >> 12, 4080);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
    public static final void method696(int arg0, int arg1) {
        ++field2015;
        class201.field3796 += arg1 * 128;
        if (class201.field3796 > class142.field2748.length) {
            int var2 = (int) (Math.random() * 12.0D);
            class201.field3796 -= class142.field2748.length;
            class200.method1334(class224.field4230[var2], 29499);
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = (var3 - arg1) * 128;
        int var6 = arg1 * 128;
        for (int var7 = 0; ~var5 < ~var7; ++var7) {
            int var27 = class169.field3244[var4 + var6] - class142.field2748[var4 - -class201.field3796 & class142.field2748.length + -1] * arg1 / 6;
            if (~var27 > -1) {
                var27 = 0;
            }
            class169.field3244[var4++] = var27;
        }
        for (int var8 = -arg1 + var3; var8 < var3; ++var8) {
            int var24 = var8 * 128;
            for (int var25 = 0; ~var25 > -129; ++var25) {
                int var26 = (int) (Math.random() * 100.0D);
                if (~var26 > -51 && var25 > 10 && var25 < 118) {
                    class169.field3244[var24 + var25] = 255;
                } else {
                    class169.field3244[var24 + var25] = 0;
                }
            }
        }
        if (~class150.field2893 < -1) {
            class150.field2893 -= arg1 * 4;
        }
        if (class188.field3648 > 0) {
            class188.field3648 -= arg1 * 4;
        }
        if (~class150.field2893 == -1 && ~class188.field3648 == -1) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 1) {
                class188.field3648 = 1024;
            }
            if (var9 == 0) {
                class150.field2893 = 1024;
            }
        }
        for (int var10 = 0; ~var10 > ~(-arg1 + var3); ++var10) {
            class187.field3634[var10] = class187.field3634[arg1 + var10];
        }
        int var11 = -arg1 + var3;
        if (arg0 > -73) {
            field2011 = null;
        }
        while (var3 > var11) {
            class187.field3634[var11] = (int) (Math.sin((double) class16.field295 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class16.field295 / 15.0D) + 12.0D * Math.sin((double) class16.field295 / 16.0D));
            ++class16.field295;
            ++var11;
        }
        class117.field2263 += arg1;
        int var12 = ((1 & class20.field344) + arg1) / 2;
        if (~var12 < -1) {
            for (int var13 = 0; ~(class117.field2263 * 100) < ~var13; ++var13) {
                int var22 = 128 + (int) (128.0D * Math.random());
                int var23 = (int) (Math.random() * 124.0D) - -2;
                class169.field3244[var23 - -(var22 << 7)] = 192;
            }
            class117.field2263 = 0;
            for (int var14 = 0; ~var3 < ~var14; ++var14) {
                int var19 = var14 * 128;
                int var20 = 0;
                for (int var21 = -var12; var21 < 128; ++var21) {
                    if (~(var12 + var21) > -129) {
                        var20 += class169.field3244[var21 - -var19 + var12];
                    }
                    if (-1 - (var12 - var21) >= 0) {
                        var20 -= class169.field3244[var21 - -var19 - (var12 + 1)];
                    }
                    if (var21 >= 0) {
                        class9.field149[var19 + var21] = var20 / (var12 * 2 - -1);
                    }
                }
            }
            for (int var15 = 0; ~var15 > -129; ++var15) {
                int var16 = 0;
                for (int var17 = -var12; var3 > var17; ++var17) {
                    int var18 = var17 * 128;
                    if (var3 > var12 + var17) {
                        var16 += class9.field149[var12 * 128 + var18 + var15];
                    }
                    if (~(var17 - var12 - 1) <= -1) {
                        var16 -= class9.field149[var15 - -var18 - (var12 - -1) * 128];
                    }
                    if (var17 >= 0) {
                        class169.field3244[var15 + var18] = var16 / (var12 * 2 + 1);
                    }
                }
            }
        }
    }
}
