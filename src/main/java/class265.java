import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class265 extends class114 {

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    private int field4272 = 32768;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field4266 = 0;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lnh;")
    public static class305 field4270;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lnh;")
    public static class305 field4273;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "[[S")
    public static short[][] field4264;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
    public static void method1716(boolean arg0) {
        if (arg0) {
            field4271 = 94;
        }
        field4264 = null;
        field4273 = null;
        field4270 = null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)Lnj;")
    public static final class240 method1717(int arg0, int arg1) {
        int var2 = -62 / ((-34 - arg0) / 37);
        ++field4261;
        class240 var3 = (class240) class90.field1304.method950((long) arg1, (byte) -45);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class6.field49.method2050(126, class272.method1776(arg1, (byte) -98), class85.method554(arg1, false));
            class240 var5 = new class240();
            var5.field3710 = arg1;
            if (var4 != null) {
                var5.method1566(new class215(var4), -18328);
            }
            var5.method1576(-10);
            if (var5.field3723) {
                var5.field3779 = 0;
                var5.field3715 = false;
            }
            if (!class29.field452 && var5.field3726) {
                var5.field3769 = null;
            }
            class90.field1304.method942((long) arg1, (byte) 29, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1648 = ~arg0.method1374((byte) -60) == -2;
            }
        } else {
            this.field4272 = arg0.method1379(arg2 ^ -13036) << 4;
        }
        if (arg2 != 12953) {
            field4271 = 37;
        }
        ++field4262;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    public static final void method1718(int arg0) {
        ++field4267;
        if (arg0 == 17086) {
            for (class60 var1 = (class60) class186.field2821.method1458(arg0 + -17086); var1 != null; var1 = (class60) class186.field2821.method1462(arg0 + -10017087)) {
                int var2 = var1.field831;
                if (class311.method2104(37, var2)) {
                    boolean var3 = true;
                    class178[] var4 = class262.field4214[var2];
                    for (int var5 = 0; var5 < var4.length; ++var5) {
                        if (var4[var5] != null) {
                            var3 = var4[var5].field2611;
                            break;
                        }
                    }
                    if (!var3) {
                        int var6 = (int) var1.field2141;
                        class178 var7 = class166.method1057(91, var6);
                        if (var7 != null) {
                            class312.method2108(false, var7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field4268;
        if (arg1) {
            field4270 = null;
        }
        int[] var3 = super.field1630.method302(arg0, -115);
        if (super.field1630.field710) {
            int[] var4 = this.method729(arg0, 0, 1);
            int[] var5 = this.method729(arg0, 0, 2);
            for (int var6 = 0; class145.field2009 > var6; ++var6) {
                int var7 = var5[var6] * this.field4272 >> 12;
                int var8 = 255 & var4[var6] >> 4;
                int var9 = class197.field3023[var8] * var7 >> 12;
                int var10 = class134.field1843[var8] * var7 >> 12;
                int var11 = class309.field4977 & var6 - -(var10 >> 12);
                int var12 = class134.field1840 & (var9 >> 12) + arg0;
                int[] var13 = this.method729(var12, 0, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIIJ)Z")
    public static final boolean method1719(byte arg0, int arg1, int arg2, long arg3) {
        ++field4260;
        if (arg0 < 110) {
            method1720((byte) 3, -81);
        }
        int var5 = ((int) arg3 & 512947) >> 14;
        int var6 = ((int) arg3 & 3430642) >> 20;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && ~var5 != -23) {
            class143.method898(0, 0, arg1, class250.field3905.field4053[0], var6, var5 - -1, class250.field3905.field4143[0], true, (byte) -19, 0, arg2);
        } else {
            class240 var8 = method1717(4, var7);
            int var9 = var8.field3776;
            int var10;
            int var11;
            if (~var6 != -1 && var6 != 2) {
                var10 = var8.field3760;
                var11 = var8.field3713;
            } else {
                var11 = var8.field3760;
                var10 = var8.field3713;
            }
            if (var6 != 0) {
                var9 = (var9 << var6 & 15) - -(var9 >> -var6 + 4);
            }
            class143.method898(var11, var10, arg1, class250.field3905.field4053[0], 0, 0, class250.field3905.field4143[0], true, (byte) -19, var9, arg2);
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field4269;
        int[][] var3 = super.field1627.method104(arg1, (byte) 112);
        if (arg0 != -112) {
            this.field4272 = 58;
        }
        if (super.field1627.field280) {
            int[] var4 = this.method729(arg1, 0, 1);
            int[] var5 = this.method729(arg1, 0, 2);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class145.field2009 < ~var9; ++var9) {
                int var10 = var5[var9] * this.field4272 >> 12;
                int var11 = (var4[var9] * 255 & 1046359) >> 12;
                int var12 = class134.field1843[var11] * var10 >> 12;
                int var13 = var9 - -(var12 >> 12) & class309.field4977;
                int var14 = class197.field3023[var11] * var10 >> 12;
                int var15 = arg1 - -(var14 >> 12) & class134.field1840;
                int[][] var16 = this.method727(0, var15, 842);
                var7[var9] = var16[0][var13];
                var6[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class265() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1720(byte arg0, int arg1) {
        if (arg0 < 3) {
            method1720((byte) -8, 40);
        }
        ++field4265;
        String var2 = Integer.toString(arg1);
        for (int var3 = -3 + var2.length(); var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, var2.length() + -8) + class117.field1683 + " (" + var2 + ")</col>";
        } else {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, -4 + var2.length()) + class156.field2154 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIZIIZIIII)V")
    public static final void method1721(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4259;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var27 = 0; var27 < 104; ++var27) {
                class238.field3693[var11][var27] = 0;
                class106.field1517[var11][var27] = 99999999;
            }
        }
        class238.field3693[arg7][arg0] = 99;
        class106.field1517[arg7][arg0] = 0;
        if (arg6) {
            int var12 = arg7;
            int var13 = arg0;
            int var14 = 0;
            boolean var15 = false;
            byte var16 = 0;
            class23.field357[var16] = arg7;
            int var28 = var16 + 1;
            class301.field4784[var16] = arg0;
            int[][] var17 = class156.field2153[class166.field2364].field3204;
            while (var14 != var28) {
                var13 = class301.field4784[var14];
                var12 = class23.field357[var14];
                var14 = 4095 & var14 + 1;
                if (arg2 == var12 && arg4 == var13) {
                    var15 = true;
                    break;
                }
                if (arg10 != 0) {
                    if ((~arg10 > -6 || arg10 == 10) && class156.field2153[class166.field2364].method1328(90, arg4, arg10 + -1, arg2, 1, var13, arg8, var12)) {
                        var15 = true;
                        break;
                    }
                    if (~arg10 > -11 && class156.field2153[class166.field2364].method1329(arg8, arg4, var13, (byte) -108, arg2, var12, arg10 - 1, 1)) {
                        var15 = true;
                        break;
                    }
                }
                if (arg5 != 0 && ~arg9 != -1 && class156.field2153[class166.field2364].method1337((byte) -110, arg5, var12, var13, arg2, 1, arg1, arg9, arg4)) {
                    var15 = true;
                    break;
                }
                int var26 = class106.field1517[var12][var13] + 1;
                if (var12 > 0 && ~class238.field3693[var12 + -1][var13] == -1 && ~(var17[var12 + -1][var13] & 2883848) == -1) {
                    class23.field357[var28] = var12 + -1;
                    class301.field4784[var28] = var13;
                    class238.field3693[var12 - 1][var13] = 2;
                    var28 = var28 + 1 & 4095;
                    class106.field1517[var12 + -1][var13] = var26;
                }
                if (~var12 > -104 && class238.field3693[var12 + 1][var13] == 0 && ~(2883968 & var17[var12 + 1][var13]) == -1) {
                    class23.field357[var28] = var12 + 1;
                    class301.field4784[var28] = var13;
                    var28 = var28 - -1 & 4095;
                    class238.field3693[var12 - -1][var13] = 8;
                    class106.field1517[var12 + 1][var13] = var26;
                }
                if (var13 > 0 && ~class238.field3693[var12][var13 + -1] == -1 && ~(2883842 & var17[var12][var13 + -1]) == -1) {
                    class23.field357[var28] = var12;
                    class301.field4784[var28] = var13 + -1;
                    var28 = 4095 & var28 + 1;
                    class238.field3693[var12][var13 + -1] = 1;
                    class106.field1517[var12][var13 + -1] = var26;
                }
                if (var13 < 103 && ~class238.field3693[var12][var13 + 1] == -1 && (2883872 & var17[var12][var13 + 1]) == 0) {
                    class23.field357[var28] = var12;
                    class301.field4784[var28] = var13 + 1;
                    class238.field3693[var12][var13 + 1] = 4;
                    var28 = var28 - -1 & 4095;
                    class106.field1517[var12][var13 + 1] = var26;
                }
                if (var12 > 0 && ~var13 < -1 && ~class238.field3693[var12 + -1][var13 - 1] == -1 && (2883854 & var17[var12 + -1][var13 + -1]) == 0 && ~(2883848 & var17[var12 - 1][var13]) == -1 && (var17[var12][var13 + -1] & 2883842) == 0) {
                    class23.field357[var28] = var12 - 1;
                    class301.field4784[var28] = var13 + -1;
                    var28 = var28 + 1 & 4095;
                    class238.field3693[var12 + -1][var13 + -1] = 3;
                    class106.field1517[var12 + -1][var13 + -1] = var26;
                }
                if (~var12 > -104 && ~var13 < -1 && ~class238.field3693[var12 - -1][var13 - 1] == -1 && (2883971 & var17[var12 - -1][var13 + -1]) == 0 && (2883968 & var17[var12 + 1][var13]) == 0 && ~(2883842 & var17[var12][var13 + -1]) == -1) {
                    class23.field357[var28] = var12 - -1;
                    class301.field4784[var28] = var13 - 1;
                    var28 = 4095 & var28 - -1;
                    class238.field3693[var12 + 1][var13 + -1] = 9;
                    class106.field1517[var12 - -1][var13 + -1] = var26;
                }
                if (~var12 < -1 && var13 < 103 && class238.field3693[var12 + -1][var13 + 1] == 0 && (2883896 & var17[var12 + -1][var13 - -1]) == 0 && (2883848 & var17[var12 + -1][var13]) == 0 && (2883872 & var17[var12][var13 + 1]) == 0) {
                    class23.field357[var28] = var12 + -1;
                    class301.field4784[var28] = var13 + 1;
                    var28 = 4095 & var28 + 1;
                    class238.field3693[var12 + -1][var13 - -1] = 6;
                    class106.field1517[var12 - 1][var13 + 1] = var26;
                }
                if (~var12 > -104 && var13 < 103 && ~class238.field3693[var12 + 1][var13 - -1] == -1 && (2884064 & var17[var12 - -1][var13 - -1]) == 0 && ~(var17[var12 + 1][var13] & 2883968) == -1 && (2883872 & var17[var12][var13 + 1]) == 0) {
                    class23.field357[var28] = var12 + 1;
                    class301.field4784[var28] = var13 + 1;
                    var28 = var28 - -1 & 4095;
                    class238.field3693[var12 + 1][var13 + 1] = 12;
                    class106.field1517[var12 - -1][var13 + 1] = var26;
                }
            }
            if (!var15) {
                if (!arg3) {
                    return;
                }
                int var18 = 1000;
                int var19 = 100;
                byte var20 = 10;
                for (int var21 = -var20 + arg2; arg2 + var20 >= var21; ++var21) {
                    for (int var22 = -var20 + arg4; ~var22 >= ~(arg4 - -var20); ++var22) {
                        if (~var21 <= -1 && ~var22 <= -1 && var21 < 104 && ~var22 > -105 && class106.field1517[var21][var22] < 100) {
                            int var23 = 0;
                            int var24 = 0;
                            if (~var22 <= ~arg4) {
                                if (arg4 - 1 + arg9 < var22) {
                                    var23 = 1 - arg4 - (arg9 - var22);
                                }
                            } else {
                                var23 = -var22 + arg4;
                            }
                            if (~arg2 >= ~var21) {
                                if (~(arg2 - -arg5 + -1) > ~var21) {
                                    var24 = -arg5 - (arg2 + -1 - var21);
                                }
                            } else {
                                var24 = arg2 - var21;
                            }
                            int var25 = var23 * var23 + var24 * var24;
                            if (~var18 < ~var25 || ~var18 == ~var25 && class106.field1517[var21][var22] < var19) {
                                var13 = var22;
                                var12 = var21;
                                var18 = var25;
                                var19 = class106.field1517[var21][var22];
                            }
                        }
                    }
                }
                if (~var18 == -1001) {
                    return;
                }
                if (~arg7 == ~var12 && arg0 == var13) {
                    return;
                }
            }
            class274.field4354 = var13;
            class141.field1939 = var12;
            class176.field2485 = false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field4258;
        if (arg0 > 101) {
            class288.method1923((byte) -113);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public static final void method1722(byte arg0) {
        ++field4263;
        if (class307.field4933 == null) {
            if (class8.field92 == null) {
                if (class69.field991 <= 0) {
                    if (arg0 < -73) {
                        int var1 = class2.field15;
                        if (class171.field2447) {
                            if (~var1 != -2) {
                                int var7 = class249.field3891;
                                int var8 = class17.field304;
                                if (~(class295.field4707 - 10) < ~var8 || var8 > class243.field3815 + 10 + class295.field4707 || class189.field2868 - 10 > var7 || class227.field3557 + class189.field2868 + 10 < var7) {
                                    class171.field2447 = false;
                                    class166.method1055(class243.field3815, class227.field3557, class189.field2868, class295.field4707, true);
                                }
                            }
                            if (var1 != 1) {
                                return;
                            }
                            int var9 = class295.field4707;
                            int var10 = class59.field826;
                            int var11 = class25.field393;
                            int var12 = class189.field2868;
                            int var13 = class243.field3815;
                            int var14 = -1;
                            for (int var15 = 0; var15 < class179.field2721; ++var15) {
                                if (!class158.field2193) {
                                    int var16 = (class179.field2721 + -1 + -var15) * 15 + var12 + 31;
                                    if (var10 > var9 && ~var10 > ~(var9 + var13) && var16 + -13 < var11 && var11 < var16 - -3) {
                                        var14 = var15;
                                    }
                                } else {
                                    int var17 = (-var15 + -1 + class179.field2721) * 15 + var12 + 33;
                                    if (~var10 < ~var9 && var10 < var9 + var13 && var11 > var17 + -13 && var11 < var17 + 3) {
                                        var14 = var15;
                                    }
                                }
                            }
                            if (var14 != -1) {
                                class53.method335(var14, 0);
                            }
                            class171.field2447 = false;
                            class166.method1055(class243.field3815, class227.field3557, class189.field2868, class295.field4707, true);
                        } else {
                            if (var1 == 1 && ~class179.field2721 < -1) {
                                short var2 = class151.field2101[class179.field2721 - 1];
                                if (~var2 == -25 || ~var2 == -60 || ~var2 == -16 || ~var2 == -11 || var2 == 30 || ~var2 == -12 || ~var2 == -45 || ~var2 == -38 || var2 == 13 || var2 == 40 || ~var2 == -35 || ~var2 == -1003) {
                                    int var3 = class250.field3910[class179.field2721 + -1];
                                    int var4 = class228.field3567[class179.field2721 + -1];
                                    class178 var5 = class166.method1057(52, var3);
                                    class297 var6 = client.method2028(var5);
                                    if (var6.method1995(3420) || var6.method1990(10449)) {
                                        class226.field3538 = false;
                                        class232.field3633 = 0;
                                        if (class307.field4933 != null) {
                                            class312.method2108(false, class307.field4933);
                                        }
                                        class307.field4933 = class166.method1057(-103, var3);
                                        class310.field4997 = class25.field393;
                                        class151.field2100 = class59.field826;
                                        class90.field1315 = var4;
                                        class312.method2108(false, class307.field4933);
                                        return;
                                    }
                                }
                            }
                            if (~var1 == -2 && (class60.field835 == 1 && class179.field2721 > 2 || class147.method924(class179.field2721 + -1, true))) {
                                var1 = 2;
                            }
                            if (~var1 == -3 && class179.field2721 > 0 || ~class276.field4386 == -2) {
                                class160.method996((byte) -38);
                            }
                            if (~var1 == -2 && class179.field2721 > 0 || ~class276.field4386 == -3) {
                                class37.method253((byte) -125);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
