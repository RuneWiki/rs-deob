import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class179 extends class166 {

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "[I")
    public static int[] field3253 = new int[25];

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field3255 = 500;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "Lhj;")
    public static class69 field3256 = class181.method1318("lila:", (byte) -121);

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "[I")
    public static int[] field3249;

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class179() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
    public static final void method1303(byte arg0) {
        if (arg0 == -7) {
            ++field3251;
            if (class113.field2173 != null) {
                class44 var1 = class113.field2173;
                synchronized (class113.field2173) {
                    class113.field2173 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field3259;
        if (arg1 != 8388607) {
            this.method20(-117, 118);
        }
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            class1.method2(var3, 0, class253.field4565, class13.field187[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLvb;)V")
    public static final void method1304(byte arg0, class58 arg1) {
        ++field3250;
        int var2 = 107 % ((arg0 - -53) / 43);
        class39.method217((byte) -107, 200000, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
    public static void method1305(int arg0) {
        field3249 = null;
        field3256 = null;
        int var1 = -55 / ((arg0 - -36) / 46);
        field3253 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class144.field2680 == 0) {
            ++class114.field2189;
            int var7 = class44.field632;
            int var8 = class36.field509;
            int var9 = class155.field2895;
            int var10 = (-arg2 + arg5) * (-var8 + var9) / arg4 + var8;
            int var11 = class266.field4733;
            int var12 = (-arg3 + arg6) * (-var7 + var11) / arg0 - -var7;
            if (class65.field1254 && ~(64 & class149.field2769) == -65) {
                class50 var13 = class108.method814(class20.field276, class228.field4164, -13706);
                if (var13 != null) {
                    class69.method492(108, var10, 0L, class51.field899, class200.field3624, var12, (short) 58);
                } else {
                    class11.method55(87);
                }
            } else {
                class69.method492(126, var10, 0L, class209.field3816, class188.field3416, var12, (short) 19);
            }
        }
        ++field3254;
        long var14 = -1L;
        if (arg1 != 4) {
            field3257 = -103;
        }
        for (int var16 = 0; ~var16 > ~class268.field4775; ++var16) {
            long var17 = class93.field1745[var16];
            int var19 = (int) var17 & 127;
            int var20 = ((int) var17 & 16314) >> 7;
            int var21 = ((int) var17 & 1810883515) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (~var14 != ~var17) {
                var14 = var17;
                if (var21 == 2 && class170.method1243(class52.field927, var19, var20, var17)) {
                    class12 var23 = class145.method1102(var22, 0);
                    if (var23.field120 != null) {
                        var23 = var23.method63(arg1 ^ 127);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class144.field2680 == 1) {
                        class69.method492(96, var20, var17, class9.method42(-112, new class69[] { class223.field4072, class227.field4140, var23.field173 }), class228.field4165, var19, (short) 31);
                        ++class271.field4792;
                    } else if (!class65.field1254) {
                        ++class242.field4445;
                        class69[] var24 = var23.field148;
                        if (class147.field2735) {
                            var24 = class170.method1248(var24, (byte) 70);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; ~var25 <= -1; --var25) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    ++class112.field2140;
                                    if (~var25 == -1) {
                                        var26 = 32;
                                    }
                                    if (var25 == 1) {
                                        var26 = 15;
                                    }
                                    if (var25 == 2) {
                                        var26 = 25;
                                    }
                                    if (~var25 == -4) {
                                        var26 = 42;
                                    }
                                    if (~var25 == -5) {
                                        var26 = 1001;
                                    }
                                    class69.method492(100, var20, var17, class9.method42(-74, new class69[] { class203.field3657, var23.field173 }), var24[var25], var19, var26);
                                }
                            }
                        }
                        class69.method492(103, var20, (long) var23.field179, class9.method42(arg1 + -97, new class69[] { class203.field3657, var23.field173 }), class73.field1406, var19, (short) 1005);
                    } else if (~(class149.field2769 & 4) == -5) {
                        class69.method492(arg1 ^ 99, var20, var17, class9.method42(119, new class69[] { class66.field1279, class227.field4140, var23.field173 }), class200.field3624, var19, (short) 17);
                        ++class105.field1980;
                    }
                }
                if (~var21 == -2) {
                    class38 var27 = class131.field2428[var22];
                    if (var27.field517.field3359 == 1 && ~(var27.field3985 & 127) == -65 && ~(var27.field4005 & 127) == -65) {
                        for (int var28 = 0; ~class46.field659 < ~var28; ++var28) {
                            class38 var31 = class131.field2428[class245.field4490[var28]];
                            if (var31 != null && var27 != var31 && ~var31.field517.field3359 == -2 && var27.field3985 == var31.field3985 && var27.field4005 == var31.field4005) {
                                class206.method1500((byte) -110, var19, class245.field4490[var28], var20, var31.field517);
                            }
                        }
                        for (int var29 = 0; ~var29 > ~class98.field1856; ++var29) {
                            class108 var30 = class35.field491[class38.field525[var29]];
                            if (var30 != null && var27.field3985 == var30.field3985 && var27.field4005 == var30.field4005) {
                                class152.method1157(var20, (byte) 125, var30, class38.field525[var29], var19);
                            }
                        }
                    }
                    class206.method1500((byte) -41, var19, var22, var20, var27.field517);
                }
                if (var21 == 0) {
                    class108 var32 = class35.field491[var22];
                    if (~(var32.field3985 & 127) == -65 && ~(127 & var32.field4005) == -65) {
                        for (int var33 = 0; class46.field659 > var33; ++var33) {
                            class38 var36 = class131.field2428[class245.field4490[var33]];
                            if (var36 != null && var36.field517.field3359 == 1 && var32.field3985 == var36.field3985 && ~var32.field4005 == ~var36.field4005) {
                                class206.method1500((byte) 124, var19, class245.field4490[var33], var20, var36.field517);
                            }
                        }
                        for (int var34 = 0; ~class98.field1856 < ~var34; ++var34) {
                            class108 var35 = class35.field491[class38.field525[var34]];
                            if (var35 != null && var32 != var35 && ~var32.field3985 == ~var35.field3985 && ~var32.field4005 == ~var35.field4005) {
                                class152.method1157(var20, (byte) 89, var35, class38.field525[var34], var19);
                            }
                        }
                    }
                    class152.method1157(var20, (byte) 82, var32, var22, var19);
                }
                if (~var21 == -4) {
                    class243 var37 = class32.field437[class52.field927][var19][var20];
                    if (var37 != null) {
                        for (class41 var38 = (class41) var37.method1729(7113); var38 != null; var38 = (class41) var37.method1722(-29709)) {
                            int var39 = var38.field579.field4518;
                            class205 var40 = class83.method585(var39, -1);
                            if (~class144.field2680 == -2) {
                                ++class237.field4308;
                                class69.method492(arg1 + 95, var20, (long) var39, class9.method42(-113, new class69[] { class223.field4072, class157.field2922, var40.field3741 }), class228.field4165, var19, (short) 30);
                            } else if (class65.field1254) {
                                if ((1 & class149.field2769) == 1) {
                                    ++class13.field193;
                                    class69.method492(94, var20, (long) var39, class9.method42(-102, new class69[] { class66.field1279, class157.field2922, var40.field3741 }), class200.field3624, var19, (short) 6);
                                }
                            } else {
                                ++class54.field966;
                                class69[] var41 = var40.field3752;
                                if (class147.field2735) {
                                    var41 = class170.method1248(var41, (byte) 38);
                                }
                                for (int var42 = 4; ~var42 <= -1; --var42) {
                                    if (var41 != null && var41[var42] != null) {
                                        ++class70.field1373;
                                        byte var43 = 0;
                                        if (~var42 == -1) {
                                            var43 = 1;
                                        }
                                        if (var42 == 1) {
                                            var43 = 49;
                                        }
                                        if (var42 == 2) {
                                            var43 = 10;
                                        }
                                        if (~var42 == -4) {
                                            var43 = 13;
                                        }
                                        if (var42 == 4) {
                                            var43 = 4;
                                        }
                                        class69.method492(126, var20, (long) var39, class9.method42(-85, new class69[] { class46.field664, var40.field3741 }), var41[var42], var19, var43);
                                    } else if (~var42 == -3) {
                                        class69.method492(101, var20, (long) var39, class9.method42(arg1 ^ -116, new class69[] { class46.field664, var40.field3741 }), class161.field2990, var19, (short) 10);
                                        ++class158.field2933;
                                    }
                                }
                                class69.method492(arg1 ^ 105, var20, (long) var39, class9.method42(arg1 ^ 119, new class69[] { class46.field664, var40.field3741 }), class73.field1406, var19, (short) 1004);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lfh;IZLsd;)V")
    public static final void method1307(class128 arg0, int arg1, boolean arg2, class42 arg3) {
        ++field3252;
        class52 var4 = new class52();
        var4.field931 = arg0.method937(false);
        var4.field933 = arg0.method923(arg2);
        var4.field922 = new int[var4.field931];
        var4.field915 = new int[var4.field931];
        var4.field925 = new byte[var4.field931][][];
        var4.field914 = new class86[var4.field931];
        var4.field919 = new class86[var4.field931];
        var4.field935 = new int[var4.field931];
        for (int var5 = 0; var4.field931 > var5; ++var5) {
            try {
                int var6 = arg0.method937(false);
                if (var6 != 0 && var6 != 1 && ~var6 != -3) {
                    if (~var6 == -4 || var6 == 4) {
                        String var10 = new String(arg0.method963(false).method469(126));
                        String var11 = new String(arg0.method963(!arg2).method469(126));
                        int var12 = arg0.method937(!arg2);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var12 > var14; ++var14) {
                            var13[var14] = new String(arg0.method963(false).method469(126));
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; ~var16 > ~var12; ++var16) {
                                int var17 = arg0.method923(true);
                                var15[var16] = new byte[var17];
                                arg0.method960(var17, var15[var16], -449085448, 0);
                            }
                        }
                        var4.field935[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; ~var12 < ~var19; ++var19) {
                            var18[var19] = class194.method1407(var13[var19], 124);
                        }
                        var4.field919[var5] = arg3.method243(var11, -35, var18, class194.method1407(var10, -74));
                        var4.field925[var5] = var15;
                    }
                } else {
                    String var7 = new String(arg0.method963(false).method469(126));
                    String var8 = new String(arg0.method963(false).method469(126));
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg0.method923(true);
                    }
                    var4.field935[var5] = var6;
                    var4.field922[var5] = var9;
                    var4.field914[var5] = arg3.method237((byte) -47, class194.method1407(var7, -105), var8);
                }
            } catch (ClassNotFoundException var20) {
                var4.field915[var5] = -1;
            } catch (SecurityException var21) {
                var4.field915[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field915[var5] = -3;
            } catch (Exception var23) {
                var4.field915[var5] = -4;
            } catch (Throwable var24) {
                var4.field915[var5] = -5;
            }
        }
        class98.field1860.method1727(-107, var4);
    }
}
