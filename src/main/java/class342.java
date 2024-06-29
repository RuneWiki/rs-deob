import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class342 extends class210 {

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    private int field5030 = 1024;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    private int field5029 = 3072;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    private int field5040 = 2048;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "Z")
    public static boolean field5039 = false;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field5041 = -1;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "Llf;")
    public static class350 field5034;

    // $FF: synthetic field
    @OriginalMember(owner = "client!se", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field5042;

    // $FF: synthetic method
    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2227(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZZ)V", line = 3)
    public static final void method2223(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            --class252.field3710;
            if (~class252.field3710 == -1) {
                class79.field992 = null;
            }
        }
        if (arg1) {
            --class282.field4148;
            if (~class282.field4148 == -1) {
                class10.field129 = null;
            }
        }
        ++field5032;
        if (arg0 != -10703) {
            field5039 = false;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V", line = 34)
    public final void method363(int arg0) {
        ++field5031;
        this.field5040 = -this.field5030 + this.field5029;
        if (arg0 != 0) {
            this.field5030 = -78;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 45)
    public class342() {
        super(1, false);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[I", line = 51)
    public final int[] method361(int arg0, byte arg1) {
        ++field5035;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[] var4 = this.method1447(arg0, -122, 0);
            for (int var5 = 0; ~var5 > ~class202.field2852; ++var5) {
                var3[var5] = (var4[var5] * this.field5040 >> 12) + this.field5030;
            }
        }
        if (arg1 != -38) {
            method2226(35);
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIII)V", line = 83)
    public static final void method2224(boolean arg0, int arg1, int arg2, int arg3) {
        ++field5038;
        if (class178.field2530 != null) {
            long var4 = (long) (arg2 << 14 | arg3 << 28 | arg1);
            class447 var6 = (class447) class200.field2828.method609(var4, 67);
            if (var6 == null) {
                class60.method458(arg3, arg1, arg2);
            } else {
                class188 var7 = (class188) var6.field6542.method2478(1603);
                if (var7 == null) {
                    class60.method458(arg3, arg1, arg2);
                } else {
                    class171 var8 = (class171) class60.method458(arg3, arg1, arg2);
                    if (var8 == null) {
                        var8 = new class171();
                    } else {
                        var8.field2225 = var8.field2234 = -1;
                    }
                    var8.field2233 = var7.field2624;
                    var8.field2227 = var7.field2623;
                    label48: while (true) {
                        class188 var9 = (class188) var6.field6542.method2486((byte) -82);
                        if (var9 == null) {
                            break;
                        }
                        if (var8.field2227 != var9.field2623) {
                            var8.field2228 = var9.field2624;
                            var8.field2225 = var9.field2623;
                            while (true) {
                                class188 var10 = (class188) var6.field6542.method2486((byte) -82);
                                if (var10 == null) {
                                    break label48;
                                }
                                if (~var8.field2227 != ~var10.field2623 && ~var8.field2225 != ~var10.field2623) {
                                    var8.field2234 = var10.field2623;
                                    var8.field2224 = var10.field2624;
                                }
                            }
                        }
                    }
                    if (!arg0) {
                        field5034 = null;
                    }
                    int var11 = class133.method889(arg3, (arg1 << 7) + 64, (arg2 << 7) + 64, false);
                    class18.method231(arg3, arg1, arg2, var11, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lfp;II)Z", line = 165)
    public static final boolean method2225(class9 arg0, int arg1, int arg2) {
        ++field5037;
        int var3 = (class195.field2745 + -104) / 2;
        int var4 = (class78.field984 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var3 - -104 > var6; ++var6) {
            for (int var51 = var4; ~(var4 + 104) < ~var51; ++var51) {
                for (int var52 = arg1; var52 <= 3; ++var52) {
                    if (class136.method907(var6, var51, var52, false, arg1)) {
                        int var53 = var52;
                        if (class274.method1872(false, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (~var53 <= -1) {
                            var5 &= class96.method642(var51, var53, var6, 1);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var8 < var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class241.field3571 = arg0.method98(var7, 0, 512, 512, 512);
            class88.method590(11805);
            int var9 = 238 + (int) (Math.random() * 20.0D) - (10 - ((238 + (int) (20.0D * Math.random()) + -10 << 16) + (-10 + (int) (Math.random() * 20.0D) + 238 << 8))) | -16777216;
            int var10 = -10 + (238 - -((int) (20.0D * Math.random()))) << 16 | -16777216;
            int var11 = (int) (8.0D * Math.random()) << 16 | (int) (8.0D * Math.random()) << 8 | (int) (8.0D * Math.random());
            boolean[][] var12 = new boolean[class202.field2860][class202.field2860];
            for (int var13 = var3; ~var13 > ~(var3 - -104); var13 += class202.field2860) {
                for (int var36 = var4; var4 + 104 > var36; var36 += class202.field2860) {
                    arg0.method77(0, 0, class202.field2860 * 4, class202.field2860 * 4);
                    arg0.method138(-16777216);
                    for (int var37 = arg1; var37 <= 3; ++var37) {
                        for (int var44 = 0; class202.field2860 > var44; ++var44) {
                            for (int var50 = 0; ~class202.field2860 < ~var50; ++var50) {
                                var12[var44][var50] = class136.method907(var13 + var44, var36 + var50, var37, false, arg1);
                            }
                        }
                        class28.field401[var37].method1422(0, 0, 1024, var13, var36, class202.field2860 + var13, class202.field2860 + var36, var12);
                        if (!class131.field1788) {
                            for (int var45 = -4; class202.field2860 > var45; ++var45) {
                                for (int var46 = -4; class202.field2860 > var46; ++var46) {
                                    int var47 = var13 - -var45;
                                    int var48 = var36 - -var46;
                                    if (var3 <= var47 && var4 <= var48 && class136.method907(var47, var48, var37, false, arg1)) {
                                        int var49 = var37;
                                        if (class274.method1872(false, var48, var47)) {
                                            var49 = var37 - 1;
                                        }
                                        if (var49 >= 0) {
                                            class247.method1637(var9, (-var46 + class202.field2860) * 4 + -4, var47, var45 * 4, arg0, var10, var49, var48, 123);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class131.field1788) {
                        class175 var38 = class382.field5610[arg1];
                        for (int var39 = 0; ~var39 > ~class202.field2860; ++var39) {
                            for (int var40 = 0; var40 < class202.field2860; ++var40) {
                                int var41 = var13 + var39;
                                int var42 = var36 - -var40;
                                int var43 = var38.field2408[-var38.field2419 + var41][var42 - var38.field2400];
                                if ((var43 & 1076101120) != 0) {
                                    arg0.method150(-63, (-var40 + class202.field2860) * 4 + -4, var39 * 4, 4, -1713569622, 4);
                                } else if (~(8388608 & var43) == -1) {
                                    if (~(33554432 & var43) != -1) {
                                        arg0.method155(var39 * 4 + 3, 4, -1713569622, 1, (-var40 + class202.field2860) * 4 + -4);
                                    } else if (~(134217728 & var43) != -1) {
                                        arg0.method126(var39 * 4, -1713569622, 4, 2702, (-var40 + class202.field2860) * 4 + -1);
                                    } else if (~(var43 & 536870912) != -1) {
                                        arg0.method155(var39 * 4, 4, -1713569622, 1, (class202.field2860 - var40) * 4 + -4);
                                    }
                                } else {
                                    arg0.method126(var39 * 4, -1713569622, 4, 2702, (class202.field2860 - var40) * 4 - 4);
                                }
                            }
                        }
                    }
                    arg0.method164(0, 0, class202.field2860 * 4, class202.field2860 * 4, var11, 2);
                    class241.field3571.method930((-var3 + var13) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class202.field2860 * 4), class202.field2860 * 4, class202.field2860 * 4, 0, 0);
                }
            }
            arg0.method162();
            arg0.method138(-16777215);
            class51.method400(-97);
            class458.field6766 = 0;
            class5.field75.method2477(-14221);
            if (!class131.field1788) {
                for (int var14 = var3; ~(var3 + 104) < ~var14; ++var14) {
                    for (int var20 = var4; ~var20 > ~(var4 + 104); ++var20) {
                        for (int var21 = arg1; var21 <= arg1 + 1 && ~var21 >= -4; ++var21) {
                            if (class136.method907(var14, var20, var21, false, arg1)) {
                                class438 var22 = (class438) class137.method913(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class438) class188.method1287(var21, var14, var20, field5042 != null ? field5042 : (field5042 = method2227("jb")));
                                }
                                if (var22 == null) {
                                    var22 = (class438) class319.method2098(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class438) class77.method538(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class178 var23 = class450.method2785(var22.method9((byte) 123), (byte) 94);
                                    if (!var23.field2463 || class33.field472) {
                                        int var24 = var23.field2460;
                                        if (var23.field2489 != null) {
                                            for (int var25 = 0; ~var25 > ~var23.field2489.length; ++var25) {
                                                if (var23.field2489[var25] != -1) {
                                                    class178 var26 = class450.method2785(var23.field2489[var25], (byte) 109);
                                                    if (var26.field2460 >= 0) {
                                                        var24 = var26.field2460;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class110 var28 = class443.method2721(-12, var24);
                                                if (var28 != null && var28.field1493) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class382.field5610[var21].field2408;
                                                int var32 = class382.field5610[var21].field2419;
                                                int var33 = class382.field5610[var21].field2400;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (~var35 == -1 && ~var3 > ~var29 && var29 > var14 + -3 && ~(var31[var29 + -1 + -var32][-var33 + var30] & 2883848) == -1) {
                                                        --var29;
                                                    }
                                                    if (var35 == 1 && ~var29 > ~(var3 + 103) && ~var29 > ~(var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && var4 < var30 && var30 > var20 + -3 && ~(2883842 & var31[-var32 + var29][var30 + -1 - var33]) == -1) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && ~(var4 + 104 + -1) < ~var30 && ~(var20 + 3) < ~var30 && ~(var31[var29 - var32][-var33 + var30 + 1] & 2883872) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class316.field4619[class458.field6766] = var23.field2455;
                                            class346.field5103[class458.field6766] = var29;
                                            class298.field4333[class458.field6766] = var30;
                                            ++class458.field6766;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class339.field5003 != null) {
                    class373.field5445.field1369 = 1;
                    class282.method1903((byte) 91, 64, 1024);
                    for (int var15 = 0; var15 < class339.field5003.field1056; ++var15) {
                        int var16 = class339.field5003.field1052[var15];
                        if (~(var16 >> 28) == ~class187.field2619.field4960) {
                            int var17 = ((268431651 & var16) >> 14) - class28.field399;
                            int var18 = (var16 & 16383) + -class134.field1846;
                            if (~var17 <= -1 && var17 < class195.field2745 && ~var18 <= -1 && ~class78.field984 < ~var18) {
                                class5.field75.method2484(0, new class13(var15));
                            } else {
                                class110 var19 = class443.method2721(-12, class339.field5003.field1053[var15]);
                                if (var19.field1500 != null && var19.field1520 + var17 >= 0 && ~class195.field2745 < ~(var19.field1495 + var17) && var18 - -var19.field1517 >= 0 && var19.field1490 + var18 < class78.field984) {
                                    class5.field75.method2484(0, new class13(var15));
                                }
                            }
                        }
                    }
                    class282.method1903((byte) 100, 64, 128);
                    class373.field5445.field1369 = 2;
                    class373.field5445.method720(24394);
                }
            }
            if (arg2 <= 38) {
                method2225((class9) null, -29, -120);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILat;)V", line = 572)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field5036;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2956 = ~arg2.method1738((byte) -45) == -2;
                }
            } else {
                this.field5029 = arg2.method1767(1930493576);
            }
        } else {
            this.field5030 = arg2.method1767(1930493576);
        }
        if (arg1 != -11941) {
            field5034 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[[I", line = 625)
    public final int[][] method58(int arg0, int arg1) {
        ++field5033;
        int[][] var3 = super.field2967.method1572(122, arg0);
        if (super.field2967.field3454) {
            int[][] var4 = this.method1444(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class202.field2852 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field5040 >> 12) + this.field5030;
                var9[var11] = (var6[var11] * this.field5040 >> 12) + this.field5030;
                var10[var11] = (var7[var11] * this.field5040 >> 12) + this.field5030;
            }
        }
        if (arg1 <= 94) {
            this.method363(82);
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V", line = 683)
    public static void method2226(int arg0) {
        int var1 = -12 / ((33 - arg0) / 43);
        field5034 = null;
    }
}
