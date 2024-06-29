import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class197 extends class160 {

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "[I")
    public static int[] field3105 = new int[14];

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "Ljava/lang/String;")
    public static String field3109 = "glow3:";

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "[Lui;")
    public static class234[] field3114 = new class234[4];

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "Z")
    public static boolean field3116 = true;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "[I")
    public static int[] field3112;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "[Led;")
    public static class186[] field3108;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field3107;
        int[] var3 = super.field2488.method15((byte) 123, arg0);
        if (super.field2488.field42) {
            int[][] var4 = this.method1079(arg0, 97, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class240.field3896 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return arg1 != 57 ? null : var3;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class197() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILai;)V")
    public static final void method1340(int arg0, class88 arg1) {
        int var2 = class260.field4160 >> 2 << 10;
        if (arg0 != 174) {
            field3114 = null;
        }
        ++field3110;
        byte[][] var3 = new byte[class85.field1431][class191.field2970];
        int var4 = class86.field1447 >> 1;
        while (arg1.field1535 < arg1.field1471.length) {
            int var33 = 0;
            int var34 = 0;
            boolean var35 = false;
            if (arg1.method633(arg0 ^ 241) == 1) {
                var33 = arg1.method633(57);
                var35 = true;
                var34 = arg1.method633(68);
            }
            int var36 = arg1.method633(arg0 + -104);
            int var37 = arg1.method633(48);
            int var38 = -(var37 * 64) + class164.field2584 + class191.field2970 + -1;
            int var39 = var36 * 64 + -class101.field1697;
            if (var39 >= 0 && var38 + -63 >= 0 && ~class85.field1431 < ~(var39 + 63) && ~var38 > ~class191.field2970) {
                for (int var40 = 0; var40 < 64; ++var40) {
                    byte[] var41 = var3[var39 + var40];
                    for (int var42 = 0; var42 < 64; ++var42) {
                        if (!var35 || ~(var33 * 8) >= ~var40 && var33 * 8 + 8 > var40 && var34 * 8 <= var42 && var34 * 8 + 8 > var42) {
                            var41[-var42 + var38] = arg1.method656(-252);
                        }
                    }
                }
            } else if (!var35) {
                arg1.field1535 += 4096;
            } else {
                arg1.field1535 += 64;
            }
        }
        int var5 = class85.field1431;
        int var6 = class191.field2970;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; ++var12) {
            for (int var13 = 0; ~var13 > ~var6; ++var13) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = 255 & var3[var27][var13];
                    if (~var28 < -1) {
                        class204 var29 = class51.method380(1, var28 + -1);
                        var8[var13] += var29.field3180;
                        var7[var13] += var29.field3191;
                        var9[var13] += var29.field3183;
                        var10[var13] += var29.field3190;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 255;
                    if (~var31 < -1) {
                        class204 var32 = class51.method380(1, var31 - 1);
                        var8[var13] -= var32.field3180;
                        var7[var13] -= var32.field3191;
                        var9[var13] -= var32.field3183;
                        var10[var13] -= var32.field3190;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class56.field923[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; ~var6 < ~var20; ++var20) {
                    int var21 = var20 + 5;
                    if (var21 < var6) {
                        var17 += var11[var21];
                        var19 += var10[var21];
                        var14 += var8[var21];
                        var18 += var7[var21];
                        var16 += var9[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var18 -= var7[var22];
                        var16 -= var9[var22];
                        var17 -= var11[var22];
                        var19 -= var10[var22];
                        var14 -= var8[var22];
                    }
                    if (var20 >= 0 && ~var17 < -1) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var19 != 0 ? class217.method1458(var18 / var17, true, var16 / var17, var14 * 256 / var19) : 0;
                        if (~var3[var12][var20] == -1) {
                            if (var23 != null) {
                                var23[(class55.method420(63, var20) << 6) + class55.method420(63, var12)] = 0;
                            }
                        } else {
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            int var25 = (127 & var24) - -var4;
                            if (~var25 > -1) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (896 & var24) + (var2 + var24 & 64512) + var25;
                            var23[class55.method420(var12, 63) + class55.method420(var20 << 6, 4032)] = class195.field3077[class281.method1890(var26, 96, (byte) 12)];
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1341(int arg0, int arg1, String arg2) {
        ++class144.field2244;
        client.field2435.method536((byte) -104, 45);
        ++field3104;
        client.field2435.method676(arg0, (byte) 112);
        if (arg1 < 13) {
            method1342((class235) null, (class235) null, 12);
        }
        client.field2435.method624((byte) 96, class148.method1000(arg2, 934));
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lhc;Lhc;I)V")
    public static final void method1342(class235 arg0, class235 arg1, int arg2) {
        class291.field4582 = arg1;
        ++field3113;
        if (arg2 > -54) {
            method1342((class235) null, (class235) null, -37);
        }
        class30.field430 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    public static void method1343(int arg0) {
        if (arg0 == 3) {
            field3105 = null;
            field3114 = null;
            field3108 = null;
            field3112 = null;
            field3109 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILre;I)V")
    public static final void method1344(int arg0, int arg1, int arg2, class228 arg3, int arg4) {
        ++field3106;
        if (arg1 != 4) {
            method1345((byte) -33, (byte[]) null);
        }
        class230.method1534(false);
        class211.method1418(arg2, arg4, arg3.field3574 + arg2, arg3.field3625 + arg4);
        if (class53.field806 != 2 && class53.field806 != 5 && class214.field3334 != null) {
            int var5 = 2047 & (int) class16.field244 + class103.field1732;
            int var6 = 48 - -(class283.field4473.field2240 / 32);
            int var7 = -(class283.field4473.field2278 / 32) + 464;
            ((class276) class214.field3334).method848(arg2, arg4, arg3.field3574, arg3.field3625, var6, var7, var5, class77.field1265 + 256, arg3.field3589, arg3.field3544);
            if (class193.field3005 != null) {
                for (int var8 = 0; var8 < class193.field3005.field3233; ++var8) {
                    if (class193.field3005.method1392(118, var8)) {
                        int var9 = (((268428125 & class193.field3005.field3243[var8]) >> 14) + -class46.field656) * 4 + 2 - class283.field4473.field2240 / 32;
                        int var10 = ((16383 & class193.field3005.field3243[var8]) + -class260.field4162) * 4 - class283.field4473.field2278 / 32 + 2;
                        int var11 = class195.field3089[var5];
                        int var12 = class195.field3091[var5];
                        int var13 = var12 * 256 / (class77.field1265 + 256);
                        int var14 = var11 * 256 / (class77.field1265 - -256);
                        int var15 = var10 * var14 + -(var9 * var13) >> 16;
                        class242 var16 = class28.field392;
                        int var17 = var9 * var14 + var10 * var13 >> 16;
                        if (~class193.field3005.method1394(var8, -98) == -2) {
                            var16 = class179.field2784;
                        }
                        if (~class193.field3005.method1394(var8, -105) == -3) {
                            var16 = class228.field3517;
                        }
                        int var18 = var16.method1656(class193.field3005.field3242[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg3.field3574 && ~var19 >= ~arg3.field3574 && ~(-arg3.field3625) >= ~var15 && ~arg3.field3625 <= ~var15) {
                            int var20 = 16777215;
                            if (~class193.field3005.field3240[var8] != 0) {
                                var20 = class193.field3005.field3240[var8];
                            }
                            class211.method1416(arg3.field3589, arg3.field3544);
                            var16.method1672(class193.field3005.field3242[var8], arg2 + var19 - -(arg3.field3574 / 2), arg3.field3625 / 2 + -var15 + arg4, var18, 50, var20, 0, 256, 1, 0, 0);
                            class211.method1432();
                        }
                    }
                }
            }
            for (int var21 = 0; ~var21 > ~class238.field3870; ++var21) {
                int var58 = class194.field3075[var21] * 4 + 2 + -(class283.field4473.field2278 / 32);
                int var59 = class102.field1712[var21] * 4 + 2 - class283.field4473.field2240 / 32;
                class193 var60 = class69.method501(0, class115.field1881[var21]);
                if (var60.field2997 != null) {
                    var60 = var60.method1297(false);
                    if (var60 == null || var60.field3040 == -1) {
                        continue;
                    }
                }
                class177.method1200((byte) -115, arg4, var58, arg3, var59, arg2, field3108[var60.field3040]);
            }
            for (int var22 = 0; ~var22 > -105; ++var22) {
                for (int var54 = 0; ~var54 > -105; ++var54) {
                    class180 var55 = class222.field3411[class240.field3892][var22][var54];
                    if (var55 != null) {
                        int var56 = var22 * 4 - -2 + -(class283.field4473.field2240 / 32);
                        int var57 = var54 * 4 - (class283.field4473.field2278 / 32 + -2);
                        class177.method1200((byte) 91, arg4, var57, arg3, var56, arg2, class275.field4385[0]);
                    }
                }
            }
            for (int var23 = 0; ~var23 > ~class70.field1119; ++var23) {
                class45 var50 = class255.field4082[class284.field4506[var23]];
                if (var50 != null && var50.method328(0)) {
                    class60 var51 = var50.field645;
                    if (var51 != null && var51.field1020 != null) {
                        var51 = var51.method459(true);
                    }
                    if (var51 != null && var51.field996 && var51.field985) {
                        int var52 = var50.field2240 / 32 + -(class283.field4473.field2240 / 32);
                        int var53 = var50.field2278 / 32 + -(class283.field4473.field2278 / 32);
                        if (~var51.field1008 == 0) {
                            class177.method1200((byte) -119, arg4, var53, arg3, var52, arg2, class275.field4385[1]);
                        } else {
                            class177.method1200((byte) -108, arg4, var53, arg3, var52, arg2, field3108[var51.field1008]);
                        }
                    }
                }
            }
            for (int var24 = 0; ~class137.field2110 < ~var24; ++var24) {
                class236 var40 = class210.field3267[class99.field1660[var24]];
                if (var40 != null && var40.method328(0)) {
                    int var41 = var40.field2240 / 32 + -(class283.field4473.field2240 / 32);
                    boolean var42 = false;
                    int var43 = var40.field2278 / 32 + -(class283.field4473.field2278 / 32);
                    long var44 = class148.method1000(var40.field3803, 934);
                    for (int var46 = 0; var46 < class166.field2604; ++var46) {
                        if (~class173.field2718[var46] == ~var44 && ~class295.field4659[var46] != -1) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; ~var48 > ~class139.field2119; ++var48) {
                        if (~class83.field1401[var48].field2603 == ~var44) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (class283.field4473.field3824 != 0 && var40.field3824 != 0 && class283.field4473.field3824 == var40.field3824) {
                        var49 = true;
                    }
                    if (!var42) {
                        if (!var47) {
                            if (var49) {
                                class177.method1200((byte) 112, arg4, var43, arg3, var41, arg2, class275.field4385[4]);
                            } else {
                                class177.method1200((byte) 39, arg4, var43, arg3, var41, arg2, class275.field4385[2]);
                            }
                        } else {
                            class177.method1200((byte) -112, arg4, var43, arg3, var41, arg2, class275.field4385[5]);
                        }
                    } else {
                        class177.method1200((byte) -117, arg4, var43, arg3, var41, arg2, class275.field4385[3]);
                    }
                }
            }
            class83[] var25 = class28.field393;
            for (int var26 = 0; var25.length > var26; ++var26) {
                class83 var29 = var25[var26];
                if (var29 != null && var29.field1397 != 0 && ~(class192.field2978 % 20) > -11) {
                    if (var29.field1397 == 1 && ~var29.field1409 <= -1 && class255.field4082.length > var29.field1409) {
                        class45 var30 = class255.field4082[var29.field1409];
                        if (var30 != null) {
                            int var31 = var30.field2240 / 32 + -(class283.field4473.field2240 / 32);
                            int var32 = var30.field2278 / 32 + -(class283.field4473.field2278 / 32);
                            class105.method755((byte) -109, var29.field1404, arg3, var32, arg2, var31, arg4, 360000);
                        }
                    }
                    if (var29.field1397 == 2) {
                        int var33 = (-class46.field656 + var29.field1402) * 4 + -(class283.field4473.field2240 / 32) + 2;
                        int var34 = (-class260.field4162 + var29.field1400) * 4 - -2 + -(class283.field4473.field2278 / 32);
                        int var35 = var29.field1403 * 4;
                        int var36 = var35 * var35;
                        class105.method755((byte) 81, var29.field1404, arg3, var34, arg2, var33, arg4, var36);
                    }
                    if (var29.field1397 == 10 && var29.field1409 >= 0 && ~var29.field1409 > ~class210.field3267.length) {
                        class236 var37 = class210.field3267[var29.field1409];
                        if (var37 != null) {
                            int var38 = var37.field2278 / 32 + -(class283.field4473.field2278 / 32);
                            int var39 = var37.field2240 / 32 + -(class283.field4473.field2240 / 32);
                            class105.method755((byte) -112, var29.field1404, arg3, var38, arg2, var39, arg4, 360000);
                        }
                    }
                }
            }
            if (~class167.field2620 != -1) {
                int var27 = 2 + (class167.field2620 * 4 + -(class283.field4473.field2240 / 32) - -((-1 + class283.field4473.method971(65535)) * 2));
                int var28 = class130.field2057 * 4 + 2 + -(class283.field4473.field2278 / 32) - -((class283.field4473.method971(65535) - 1) * 2);
                class177.method1200((byte) 17, arg4, var28, arg3, var27, arg2, class214.field3330);
            }
            class211.method1424(arg2 + -1 - -(arg3.field3574 / 2), arg3.field3625 / 2 + arg4 + -1, 3, 3, 16777215);
        } else {
            class211.method1421(arg2, arg4, 0, arg3.field3589, arg3.field3544);
        }
        class85.field1428[arg0] = true;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B[B)Z")
    public static final boolean method1345(byte arg0, byte[] arg1) {
        ++field3111;
        class88 var2 = new class88(arg1);
        if (arg0 <= 94) {
            return true;
        } else {
            int var3 = var2.method633(117);
            if (var3 != 1) {
                return false;
            } else {
                boolean var4 = var2.method633(119) == 1;
                if (var4) {
                    class31.method245(var2, -46);
                }
                class260.method1764((byte) -75, var2);
                return true;
            }
        }
    }
}
