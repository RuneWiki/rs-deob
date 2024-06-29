import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class97 extends class50 {

    @OriginalMember(owner = "client!qa", name = "Rc", descriptor = "I")
    public static int field2435 = 0;

    @OriginalMember(owner = "client!qa", name = "ad", descriptor = "I")
    public static int field2444 = 5063219;

    @OriginalMember(owner = "client!qa", name = "cd", descriptor = "Lmc;")
    public static class75 field2446 = class30.method234(true, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!qa", name = "Zc", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!qa", name = "Sc", descriptor = "I")
    public static int field2436 = 0;

    @OriginalMember(owner = "client!qa", name = "hd", descriptor = "Lmc;")
    private static class75 field2451 = class30.method234(true, "Create a free account");

    @OriginalMember(owner = "client!qa", name = "fd", descriptor = "Lmc;")
    private static class75 field2449 = class30.method234(true, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!qa", name = "Yc", descriptor = "Lmc;")
    public static class75 field2442 = field2451;

    @OriginalMember(owner = "client!qa", name = "Tc", descriptor = "Lmc;")
    public static class75 field2437 = field2449;

    @OriginalMember(owner = "client!qa", name = "ed", descriptor = "Loa;")
    public static class85 field2448 = new class85(5000);

    @OriginalMember(owner = "client!qa", name = "ld", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!qa", name = "md", descriptor = "Lmc;")
    public static class75 field2456 = class30.method234(true, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!qa", name = "Uc", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!qa", name = "Vc", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!qa", name = "Wc", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!qa", name = "Xc", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!qa", name = "bd", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!qa", name = "gd", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!qa", name = "id", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!qa", name = "jd", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!qa", name = "dd", descriptor = "Lfc;")
    public class34 field2447;

    @OriginalMember(owner = "client!qa", name = "kd", descriptor = "Lja;")
    public static class55 field2454;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)Z", line = 4)
    public final boolean method395(int arg0) {
        if (arg0 != 28619) {
            field2435 = -122;
        }
        ++field2445;
        return this.field2447 != null;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(II)Z", line = 30)
    public static final boolean method812(int arg0, int arg1) {
        ++field2439;
        if (~arg1 <= -98 && ~arg1 >= -123) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return true;
        } else {
            if (arg0 < 34) {
                field2442 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)Z", line = 53)
    public static final boolean method813(byte arg0) {
        ++field2441;
        class84 var1 = class129.field3136;
        synchronized (class129.field3136) {
            if (~class61.field1607 == ~class130.field3162) {
                return false;
            } else {
                class38.field900 = class69.field1768[class130.field3162];
                class104.field2640 = class17.field343[class130.field3162];
                class130.field3162 = 127 & class130.field3162 + 1;
                if (arg0 != -67) {
                    method816((byte) -39, (class8[]) null, (class29) null);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V", line = 83)
    public static void method814(boolean arg0) {
        field2448 = null;
        field2456 = null;
        field2442 = null;
        field2437 = null;
        if (arg0) {
            field2449 = null;
        }
        field2454 = null;
        field2451 = null;
        field2449 = null;
        field2446 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)Lpc;", line = 101)
    public final class93 method561(boolean arg0) {
        ++field2450;
        if (this.field2447 == null) {
            return null;
        } else {
            if (arg0) {
                field2442 = null;
            }
            class107 var2 = super.field1265 != -1 && ~super.field1227 == -1 ? class37.method289(super.field1265, (byte) -127) : null;
            class107 var3 = super.field1219 == -1 || ~super.field1223 == ~super.field1219 && var2 != null ? null : class37.method289(super.field1219, (byte) -125);
            class93 var4 = this.field2447.method270(var3, -50, super.field1264, super.field1273, var2);
            if (var4 == null) {
                return null;
            } else {
                var4.method798();
                super.field1230 = var4.field1690;
                if (~super.field1216 != 0 && super.field1255 != -1) {
                    class93 var5 = class64.method564(86, super.field1216).method715(25187, super.field1255);
                    if (var5 != null) {
                        class93[] var6 = new class93[] { var4, var5 };
                        var5.method781(0, -super.field1269, 0);
                        var4 = new class93(var6, 2, true);
                    }
                }
                if (this.field2447.field767 == 1) {
                    var4.field2310 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V", line = 156)
    public static final void method815(byte arg0) {
        if (arg0 >= 87) {
            Object var1 = class74.field1831;
            synchronized (class74.field1831) {
                if (~class76.field1942 == -1) {
                    class78.field1967.method986(0, new class6(), 5);
                }
                class76.field1942 = 600;
            }
            ++field2440;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B[Lba;Led;)V", line = 189)
    public static final void method816(byte arg0, class8[] arg1, class29 arg2) {
        ++field2453;
        for (int var3 = 0; var3 < 4; ++var3) {
            for (int var111 = 0; var111 < 104; ++var111) {
                for (int var112 = 0; var112 < 104; ++var112) {
                    if ((1 & class74.field1836[var3][var111][var112]) == 1) {
                        int var113 = var3;
                        if (~(class74.field1836[1][var111][var112] & 2) == -3) {
                            var113 = var3 - 1;
                        }
                        if (var113 >= 0) {
                            arg1[var113].method43(2097152, var112, var111);
                        }
                    }
                }
            }
        }
        class40.field947 += -2 + (int) (Math.random() * 5.0D);
        class91.field2255 += -2 + (int) (Math.random() * 5.0D);
        if (~class40.field947 > 15) {
            class40.field947 = -16;
        }
        if (~class40.field947 < -17) {
            class40.field947 = 16;
        }
        if (class91.field2255 < -8) {
            class91.field2255 = -8;
        }
        if (~class91.field2255 < -9) {
            class91.field2255 = 8;
        }
        for (int var4 = 0; ~var4 > -5; ++var4) {
            byte[][] var48 = class63.field1676[var4];
            int var49 = (int) Math.sqrt(5100.0D);
            int var50 = var49 * 768 >> 8;
            for (int var51 = 1; var51 < 103; ++var51) {
                for (int var102 = 1; ~var102 > -104; ++var102) {
                    int var103 = class15.field280[var4][var102 + 1][var51] + -class15.field280[var4][var102 + -1][var51];
                    int var104 = class15.field280[var4][var102][var51 + 1] + -class15.field280[var4][var102][var51 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var48[var102 - 1][var51] >> 2) + (var48[var102][var51 + 1] >> 3) - -(var48[var102][var51] >> 1) + ((var48[var102 + 1][var51] >> 3) - -(var48[var102][var51 + -1] >> 2));
                    int var110 = (var108 * -50 + var106 * -50 + var107 * -10) / var50 + 96;
                    class108.field2734[var102][var51] = -var109 + var110;
                }
            }
            for (int var52 = 0; var52 < 104; ++var52) {
                class52.field1287[var52] = 0;
                class28.field594[var52] = 0;
                class17.field336[var52] = 0;
                class56.field1437[var52] = 0;
                class62.field1626[var52] = 0;
            }
            for (int var53 = -5; var53 < 109; ++var53) {
                for (int var56 = 0; ~var56 > -105; ++var56) {
                    int var96 = var53 + 5;
                    int var10002;
                    if (~var96 <= -1 && var96 < 104) {
                        int var97 = 255 & class85.field2100[var4][var96][var56];
                        if (~var97 < -1) {
                            class15 var98 = class84.method698((byte) -56, var97 + -1);
                            class52.field1287[var56] += var98.field278;
                            class28.field594[var56] += var98.field281;
                            class17.field336[var56] += var98.field263;
                            class56.field1437[var56] += var98.field269;
                            var10002 = class62.field1626[var56]++;
                        }
                    }
                    int var99 = var53 - 5;
                    if (var99 >= 0 && ~var99 > -105) {
                        int var100 = 255 & class85.field2100[var4][var99][var56];
                        if (~var100 < -1) {
                            class15 var101 = class84.method698((byte) -56, var100 - 1);
                            class52.field1287[var56] -= var101.field278;
                            class28.field594[var56] -= var101.field281;
                            class17.field336[var56] -= var101.field263;
                            class56.field1437[var56] -= var101.field269;
                            var10002 = class62.field1626[var56]--;
                        }
                    }
                }
                if (~var53 <= -2 && ~var53 > -104) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 109; ++var62) {
                        int var63 = var62 - -5;
                        int var64 = var62 + -5;
                        if (~var63 <= -1 && var63 < 104) {
                            var57 += class28.field594[var63];
                            var58 += class52.field1287[var63];
                            var60 += class56.field1437[var63];
                            var61 += class62.field1626[var63];
                            var59 += class17.field336[var63];
                        }
                        if (var64 >= 0 && ~var64 > -105) {
                            var60 -= class56.field1437[var64];
                            var61 -= class62.field1626[var64];
                            var58 -= class52.field1287[var64];
                            var59 -= class17.field336[var64];
                            var57 -= class28.field594[var64];
                        }
                        if (var62 >= 1 && var62 < 103 && (!class92.field2270 || ~(class74.field1836[0][var53][var62] & 2) != -1 || (16 & class74.field1836[var4][var53][var62]) == 0 && ~class40.method304(-32245, var4, var53, var62) == ~class28.field591)) {
                            if (~class92.field2280 < ~var4) {
                                class92.field2280 = var4;
                            }
                            int var65 = 255 & class85.field2100[var4][var53][var62];
                            int var66 = 255 & class27.field546[var4][var53][var62];
                            if (~var65 < -1 || ~var66 < -1) {
                                int var67 = class15.field280[var4][var53][var62];
                                int var68 = class15.field280[var4][var53 + 1][var62];
                                int var69 = class15.field280[var4][var53 + 1][var62 - -1];
                                int var70 = class108.field2734[var53][var62];
                                int var71 = class15.field280[var4][var53][var62 + 1];
                                int var72 = class108.field2734[var53 + 1][var62];
                                int var73 = class108.field2734[var53 - -1][var62 - -1];
                                int var74 = class108.field2734[var53][var62 - -1];
                                int var75 = -1;
                                int var76 = -1;
                                if (var65 > 0) {
                                    int var77 = var58 * 256 / var60;
                                    int var78 = var57 / var61;
                                    int var79 = var59 / var61;
                                    var75 = class62.method549(var78, var79, var77, 2);
                                    int var80 = 255 & var77 - -class91.field2255;
                                    int var81 = class40.field947 + var79;
                                    if (~var81 > -1) {
                                        var81 = 0;
                                    } else if (~var81 < -256) {
                                        var81 = 255;
                                    }
                                    var76 = class62.method549(var78, var81, var80, 2);
                                }
                                if (~var4 < -1) {
                                    boolean var82 = true;
                                    if (var65 == 0 && class35.field827[var4][var53][var62] != 0) {
                                        var82 = false;
                                    }
                                    if (var66 > 0 && !class47.method353((byte) -115, var66 + -1).field405) {
                                        var82 = false;
                                    }
                                    if (var82 && var67 == var68 && var67 == var69 && ~var67 == ~var71) {
                                        class63.field1675[var4][var53][var62] = class34.method263(class63.field1675[var4][var53][var62], 2340);
                                    }
                                }
                                int var83 = 0;
                                if (var76 != -1) {
                                    var83 = class49.field1185[class30.method236(var76, 0, 96)];
                                }
                                if (~var66 != -1) {
                                    int var84 = class35.field827[var4][var53][var62] + 1;
                                    byte var85 = class8.field123[var4][var53][var62];
                                    class21 var86 = class47.method353((byte) -127, var66 + -1);
                                    int var87 = var86.field407;
                                    int var88;
                                    int var89;
                                    if (~var87 <= -1) {
                                        var88 = class49.field1192.method106(var87, (byte) -106);
                                        var89 = -1;
                                    } else if (~var86.field409 == -16711936) {
                                        var88 = -2;
                                        var89 = -2;
                                        var87 = -1;
                                    } else {
                                        var89 = class62.method549(var86.field396, var86.field408, var86.field391, 2);
                                        int var90 = class91.field2255 + var86.field391 & 255;
                                        int var91 = class40.field947 + var86.field408;
                                        if (~var91 <= -1) {
                                            if (~var91 < -256) {
                                                var91 = 255;
                                            }
                                        } else {
                                            var91 = 0;
                                        }
                                        var88 = class62.method549(var86.field396, var91, var90, 2);
                                    }
                                    int var92 = 0;
                                    if (~var88 != 1) {
                                        var92 = class49.field1185[class70.method596((byte) -107, var88, 96)];
                                    }
                                    if (~var86.field402 != 0) {
                                        int var93 = class91.field2255 + var86.field414 & 255;
                                        int var94 = class40.field947 + var86.field398;
                                        if (~var94 <= -1) {
                                            if (var94 > 255) {
                                                var94 = 255;
                                            }
                                        } else {
                                            var94 = 0;
                                        }
                                        int var95 = class62.method549(var86.field403, var94, var93, 2);
                                        var92 = class49.field1185[class70.method596((byte) 113, var95, 96)];
                                    }
                                    arg2.method227(var4, var53, var62, var84, var85, var87, var67, var68, var69, var71, class30.method236(var75, 0, var70), class30.method236(var75, 0, var72), class30.method236(var75, 0, var73), class30.method236(var75, 0, var74), class70.method596((byte) -93, var89, var70), class70.method596((byte) -96, var89, var72), class70.method596((byte) 63, var89, var73), class70.method596((byte) 104, var89, var74), var83, var92);
                                } else {
                                    arg2.method227(var4, var53, var62, 0, 0, -1, var67, var68, var69, var71, class30.method236(var75, 0, var70), class30.method236(var75, 0, var72), class30.method236(var75, 0, var73), class30.method236(var75, 0, var74), 0, 0, 0, 0, var83, 0);
                                }
                            }
                        }
                    }
                }
            }
            for (int var54 = 1; ~var54 > -104; ++var54) {
                for (int var55 = 1; ~var55 > -104; ++var55) {
                    arg2.method198(var4, var55, var54, class40.method304(-32245, var4, var55, var54));
                }
            }
            class85.field2100[var4] = null;
            class27.field546[var4] = null;
            class35.field827[var4] = null;
            class8.field123[var4] = null;
            class63.field1676[var4] = null;
        }
        arg2.method219(-50, -10, -50);
        int var5 = -75 % ((-14 - arg0) / 36);
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var47 = 0; var47 < 104; ++var47) {
                if (~(2 & class74.field1836[1][var6][var47]) == -3) {
                    arg2.method190(var6, var47);
                }
            }
        }
        int var7 = 1;
        int var8 = 4;
        int var9 = 2;
        for (int var10 = 0; var10 < 4; ++var10) {
            if (~var10 < -1) {
                var7 <<= 3;
                var8 <<= 3;
                var9 <<= 3;
            }
            for (int var11 = 0; var10 >= var11; ++var11) {
                for (int var12 = 0; ~var12 >= -105; ++var12) {
                    for (int var13 = 0; var13 <= 104; ++var13) {
                        if (~(class63.field1675[var11][var13][var12] & var7) != -1) {
                            int var14 = var11;
                            int var15 = var11;
                            int var16 = var12;
                            int var17;
                            for (var17 = var12; var17 < 104 && (class63.field1675[var11][var13][var17 - -1] & var7) != 0; ++var17) {
                            }
                            while (var16 > 0 && ~(class63.field1675[var11][var13][var16 + -1] & var7) != -1) {
                                --var16;
                            }
                            label351: while (~var14 < -1) {
                                for (int var18 = var16; var18 <= var17; ++var18) {
                                    if (~(class63.field1675[var14 - 1][var13][var18] & var7) == -1) {
                                        break label351;
                                    }
                                }
                                --var14;
                            }
                            label340: while (~var10 < ~var15) {
                                for (int var19 = var16; var17 >= var19; ++var19) {
                                    if ((var7 & class63.field1675[var15 - -1][var13][var19]) == 0) {
                                        break label340;
                                    }
                                }
                                ++var15;
                            }
                            int var20 = (var15 + 1 + -var14) * (var17 + 1 + -var16);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = class15.field280[var15][var13][var16] + -var21;
                                int var23 = class15.field280[var14][var13][var16];
                                class29.method209(var10, 1, var13 * 128, var13 * 128, var16 * 128, var17 * 128 + 128, var22, var23);
                                for (int var24 = var14; ~var15 <= ~var24; ++var24) {
                                    for (int var25 = var16; ~var25 >= ~var17; ++var25) {
                                        class63.field1675[var24][var13][var25] = class56.method456(class63.field1675[var24][var13][var25], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class63.field1675[var11][var13][var12] & var9) != 0) {
                            int var26;
                            for (var26 = var13; ~var26 > -105 && (class63.field1675[var11][var26 + 1][var12] & var9) != 0; ++var26) {
                            }
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (~var27 < -1 && ~(var9 & class63.field1675[var11][var27 + -1][var12]) != -1) {
                                --var27;
                            }
                            label404: while (var28 > 0) {
                                for (int var30 = var27; ~var30 >= ~var26; ++var30) {
                                    if (~(var9 & class63.field1675[var28 + -1][var30][var12]) == -1) {
                                        break label404;
                                    }
                                }
                                --var28;
                            }
                            label393: while (var10 > var29) {
                                for (int var31 = var27; ~var26 <= ~var31; ++var31) {
                                    if (~(class63.field1675[var29 + 1][var31][var12] & var9) == -1) {
                                        break label393;
                                    }
                                }
                                ++var29;
                            }
                            int var32 = (-var27 + 1 + var26) * (-var28 + var29 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = class15.field280[var29][var27][var12] + -var33;
                                int var35 = class15.field280[var28][var27][var12];
                                class29.method209(var10, 2, var27 * 128, var26 * 128 + 128, var12 * 128, var12 * 128, var34, var35);
                                for (int var36 = var28; ~var29 <= ~var36; ++var36) {
                                    for (int var37 = var27; ~var26 <= ~var37; ++var37) {
                                        class63.field1675[var36][var37][var12] = class56.method456(class63.field1675[var36][var37][var12], ~var9);
                                    }
                                }
                            }
                        }
                        if ((var8 & class63.field1675[var11][var13][var12]) != 0) {
                            int var38 = var13;
                            int var39;
                            for (var39 = var12; var39 < 104 && (class63.field1675[var11][var13][var39 + 1] & var8) != 0; ++var39) {
                            }
                            int var40;
                            for (var40 = var12; ~var40 < -1 && ~(var8 & class63.field1675[var11][var13][var40 + -1]) != -1; --var40) {
                            }
                            label459: while (~var38 < -1) {
                                for (int var41 = var40; var41 <= var39; ++var41) {
                                    if ((class63.field1675[var11][var38 - 1][var41] & var8) == 0) {
                                        break label459;
                                    }
                                }
                                --var38;
                            }
                            int var42;
                            label447: for (var42 = var13; var42 < 104; ++var42) {
                                for (int var43 = var40; ~var39 <= ~var43; ++var43) {
                                    if ((class63.field1675[var11][var42 + 1][var43] & var8) == 0) {
                                        break label447;
                                    }
                                }
                            }
                            if ((-var38 + var42 - -1) * (-var40 + var39 - -1) >= 4) {
                                int var44 = class15.field280[var11][var38][var40];
                                class29.method209(var10, 4, var38 * 128, var42 * 128 + 128, var40 * 128, var39 * 128 - -128, var44, var44);
                                for (int var45 = var38; ~var45 >= ~var42; ++var45) {
                                    for (int var46 = var40; var39 >= var46; ++var46) {
                                        class63.field1675[var11][var45][var46] = class56.method456(class63.field1675[var11][var45][var46], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmc;Lmc;ZLja;)Lj;", line = 931)
    public static final class54 method817(class75 arg0, class75 arg1, boolean arg2, class55 arg3) {
        if (arg2) {
            field2446 = null;
        }
        ++field2452;
        int var4 = arg3.method433(arg0, (byte) 72);
        int var5 = arg3.method451(arg1, var4, (byte) 124);
        return class10.method74(arg3, -2097, var5, var4);
    }
}
