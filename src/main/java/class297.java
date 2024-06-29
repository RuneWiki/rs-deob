import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class297 extends class68 {

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    private int field4688 = 0;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    private int field4686 = 0;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    private int field4691 = 1;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field4687 = 0;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field4683 = -1;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "I")
    public static int field4696 = 0;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "Lhc;")
    public static class235 field4689;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "Z")
    public static boolean field4681;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "[Log;")
    public static class227[] field4694;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "[[[B")
    public static byte[][][] field4697;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "[[[Lab;")
    public static class148[][][] field4690;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(B)Z")
    public static final boolean method1983(byte arg0) {
        if (arg0 >= -74) {
            method1986((String) null, 76);
        }
        ++field4698;
        if (class282.field4371) {
            try {
                class259.method1722("showVideoAd", 3787, class200.field2784.field3715);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field4684;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int var4 = class127.field1794[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class89.field1248; ++var6) {
                int var7 = class215.field3231[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (~this.field4688 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field4691 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field4691;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field4686 != 0) {
                    if (this.field4686 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class160.field2245[(4093 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg1 >= -118) {
            this.field4688 = 76;
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        if (arg0 > -18) {
            this.method32(-123, -31);
        }
        class250.method1674(true);
        ++field4695;
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
    public static final void method1984(int arg0) {
        ++field4693;
        if (~class253.field3868 == -200) {
            int var1 = class233.field3518.method1453((byte) -127);
            int var2 = (var1 & 15) + class145.field2023 * 2;
            int var3 = class141.field1961 * 2 - -((var1 & 248) >> 4);
            int var4 = class233.field3518.method1437((byte) -97) + var3;
            int var5 = var2 - -class233.field3518.method1437((byte) -95);
            int var6 = class233.field3518.method1479(false);
            int var7 = class233.field3518.method1445(false);
            int var8 = class233.field3518.method1453((byte) -128) * 4;
            int var9 = 4 * class233.field3518.method1453((byte) -127);
            int var10 = class233.field3518.method1445(false);
            int var11 = class233.field3518.method1445(false);
            int var12 = class233.field3518.method1453((byte) -127);
            int var13 = class233.field3518.method1453((byte) -127);
            if (~var12 == -256) {
                var12 = -1;
            }
            if (~var3 <= -1 && var2 >= 0 && var3 < 208 && ~var2 > -209 && ~var4 <= -1 && var5 >= 0 && var4 < 208 && ~var5 > -209 && var7 != 65535) {
                int var14 = var4 * 64;
                int var15 = var2 * 64;
                int var16 = var5 * 64;
                int var17 = var3 * 64;
                class286 var18 = new class286(var7, class295.field4642, var17, var15, class275.method1836(class295.field4642, var15, var17, -123) - var8, class52.field740 + var10, class52.field740 + var11, var12, var13, var6, var9);
                var18.method1927((byte) 4, var14, var16, var10 - -class52.field740, class275.method1836(class295.field4642, var16, var14, arg0 ^ -117) - var9);
                class168.field2318.method988(new class79(var18), (byte) -77);
            }
        } else if (class253.field3868 == 31) {
            int var19 = class233.field3518.method1453((byte) -127);
            int var20 = ((117 & var19) >> 4) + class141.field1961;
            int var21 = class145.field2023 - -(7 & var19);
            int var22 = class233.field3518.method1445(false);
            int var23 = class233.field3518.method1453((byte) -128);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var24 = var23 >> 4 & 15;
            int var25 = class233.field3518.method1453((byte) -127);
            int var26 = var23 & 7;
            int var27 = class233.field3518.method1453((byte) -127);
            if (var20 >= 0 && var21 >= 0 && ~var20 > -105 && var21 < 104) {
                int var28 = var24 - -1;
                if (~class217.field3280.field4076[0] <= ~(var20 - var28) && ~(var20 + var28) <= ~class217.field3280.field4076[0] && ~(-var28 + var21) >= ~class217.field3280.field4032[0] && ~class217.field3280.field4032[0] >= ~(var21 + var28) && class122.field1701 != 0 && ~var26 < -1 && ~class84.field1151 > -51 && var22 != -1) {
                    class71.field994[class84.field1151] = var22;
                    class140.field1939[class84.field1151] = var26;
                    class66.field900[class84.field1151] = var25;
                    class102.field1429[class84.field1151] = null;
                    class8.field68[class84.field1151] = (var20 << 16) + (var21 << 8) + var24;
                    class174.field2439[class84.field1151] = var27;
                    ++class84.field1151;
                }
            }
        } else if (class253.field3868 == 123) {
            int var29 = class233.field3518.method1453((byte) -128);
            int var30 = (var29 >> 4 & 7) + class141.field1961;
            int var31 = (7 & var29) + class145.field2023;
            int var32 = class233.field3518.method1437((byte) -120) + var30;
            int var33 = class233.field3518.method1437((byte) -110) + var31;
            int var34 = class233.field3518.method1479(false);
            int var35 = class233.field3518.method1445(false);
            int var36 = class233.field3518.method1453((byte) -127) * 4;
            int var37 = class233.field3518.method1453((byte) -127) * 4;
            int var38 = class233.field3518.method1445(false);
            int var39 = class233.field3518.method1445(false);
            int var40 = class233.field3518.method1453((byte) -127);
            if (var40 == 255) {
                var40 = -1;
            }
            int var41 = class233.field3518.method1453((byte) -128);
            if (var30 >= 0 && ~var31 <= -1 && var30 < 104 && ~var31 > -105 && ~var32 <= -1 && var33 >= 0 && ~var32 > -105 && ~var33 > -105 && ~var35 != -65536) {
                int var42 = var30 * 128 + 64;
                int var43 = var32 * 128 + 64;
                int var44 = var31 * 128 + 64;
                int var45 = var33 * 128 + 64;
                class286 var46 = new class286(var35, class295.field4642, var42, var44, class275.method1836(class295.field4642, var44, var42, -113) + -var36, class52.field740 + var38, var39 - -class52.field740, var40, var41, var34, var37);
                var46.method1927((byte) 4, var43, var45, class52.field740 + var38, -var37 + class275.method1836(class295.field4642, var45, var43, 3));
                class168.field2318.method988(new class79(var46), (byte) -77);
            }
        } else if (~class253.field3868 == -102) {
            int var47 = class233.field3518.method1492(2971768);
            int var48 = var47 >> 2;
            int var49 = var47 & 3;
            int var50 = class102.field1425[var48];
            int var51 = class233.field3518.method1453((byte) -127);
            int var52 = ((var51 & 124) >> 4) + class141.field1961;
            int var53 = (7 & var51) + class145.field2023;
            int var54 = class233.field3518.method1474((byte) -118);
            if (var54 == 65535) {
                var54 = -1;
            }
            class155.method1032(var53, var52, var48, var54, var49, var50, class295.field4642, (byte) 67);
        } else if (~class253.field3868 == -223) {
            int var55 = class233.field3518.method1495((byte) -87);
            int var56 = var55 >> 2;
            int var57 = var55 & 3;
            int var58 = class102.field1425[var56];
            int var59 = class233.field3518.method1495((byte) -75);
            int var60 = class141.field1961 - -(7 & var59 >> 4);
            int var61 = class145.field2023 - -(7 & var59);
            int var62 = class233.field3518.method1465(-1691509480);
            if (~var60 <= -1 && ~var61 <= -1 && ~var60 > -105 && var61 < 104) {
                class86.method537(var60, var62, var57, -1, var58, var56, (byte) -92, class295.field4642, var61, 0);
            }
        } else if (~class253.field3868 == -152) {
            int var63 = class233.field3518.method1495((byte) -101);
            int var64 = class141.field1961 - -(var63 >> 4 & 7);
            int var65 = (var63 & 7) + class145.field2023;
            int var66 = class233.field3518.method1460(2095725128);
            int var67 = var66 >> 2;
            int var68 = var66 & 3;
            int var69 = class102.field1425[var67];
            if (~var64 <= -1 && var65 >= 0 && ~var64 > -105 && var65 < 104) {
                class86.method537(var64, -1, var68, -1, var69, var67, (byte) -97, class295.field4642, var65, 0);
            }
        } else if (class253.field3868 == 38) {
            int var70 = class233.field3518.method1453((byte) -127);
            int var71 = (15 & var70) + class145.field2023 * 2;
            int var72 = ((248 & var70) >> 4) + class141.field1961 * 2;
            int var73 = var72 - -class233.field3518.method1437((byte) -113);
            int var74 = var71 - -class233.field3518.method1437((byte) -74);
            int var75 = class233.field3518.method1479(false);
            int var76 = class233.field3518.method1479(false);
            int var77 = class233.field3518.method1445(false);
            int var78 = class233.field3518.method1437((byte) -86);
            int var79 = class233.field3518.method1453((byte) -127) * 4;
            int var80 = class233.field3518.method1445(false);
            int var81 = class233.field3518.method1445(false);
            int var82 = class233.field3518.method1453((byte) -128);
            int var83 = class233.field3518.method1453((byte) -128);
            if (var82 == 255) {
                var82 = -1;
            }
            if (~var72 <= -1 && ~var71 <= -1 && var72 < 208 && var71 < 208 && ~var73 <= -1 && var74 >= 0 && ~var73 > -209 && var74 < 208 && var77 != 65535) {
                int var84 = var72 * 64;
                int var85 = var74 * 64;
                int var86 = var73 * 64;
                int var87 = var71 * 64;
                if (~var75 != -1) {
                    int var89;
                    class266 var91;
                    if (var75 < 0) {
                        int var88 = -var75 + -1;
                        var89 = (31888 & var88) >> 11;
                        int var90 = var88 & 2047;
                        if (~class35.field550 == ~var90) {
                            var91 = class217.field3280;
                        } else {
                            var91 = class154.field2133[var90];
                        }
                    } else {
                        int var92 = var75 + -1;
                        int var93 = var92 & 2047;
                        var89 = (var92 & 32115) >> 11;
                        var91 = class119.field1679[var93];
                    }
                    if (var91 != null) {
                        class151 var94 = var91.method1741((byte) 94);
                        if (var94.field2095 != null && var94.field2095[var89] != null) {
                            int var95 = var94.field2095[var89][0];
                            int var96 = var94.field2095[var89][2];
                            int var97 = class90.field1259[var91.field4010];
                            int var98 = class90.field1255[var91.field4010];
                            var78 -= var94.field2095[var89][1];
                            int var99 = var96 * var97 - -(var95 * var98) >> 16;
                            int var100 = var96 * var98 + -(var95 * var97) >> 16;
                            var87 += var100;
                            var84 += var99;
                        }
                    }
                }
                class286 var102 = new class286(var77, class295.field4642, var84, var87, class275.method1836(class295.field4642, var87, var84, 85) + -var78, class52.field740 + var80, class52.field740 + var81, var82, var83, var76, var79);
                var102.method1927((byte) 4, var86, var85, var80 - -class52.field740, class275.method1836(class295.field4642, var85, var86, 25) + -var79);
                class168.field2318.method988(new class79(var102), (byte) -77);
            }
        } else if (class253.field3868 == 95) {
            int var103 = class233.field3518.method1453((byte) -127);
            int var104 = class141.field1961 - -(7 & var103 >> 4);
            int var105 = (var103 & 7) + class145.field2023;
            int var106 = class233.field3518.method1445(false);
            int var107 = class233.field3518.method1445(false);
            int var108 = class233.field3518.method1445(false);
            if (~var104 <= -1 && ~var105 <= -1 && ~var104 > -105 && var105 < 104) {
                class148 var109 = field4690[class295.field4642][var104][var105];
                if (var109 != null) {
                    for (class207 var110 = (class207) var109.method990(arg0 ^ -73); var110 != null; var110 = (class207) var109.method993(arg0 ^ -75)) {
                        class170 var111 = var110.field2893;
                        if (~(var106 & 32767) == ~var111.field2355 && ~var111.field2358 == ~var107) {
                            var111.field2358 = var108;
                            break;
                        }
                    }
                    class249.method1667(var105, 4, var104);
                }
            }
        } else if (~class253.field3868 != -19) {
            if (class253.field3868 == 89) {
                int var118 = class233.field3518.method1465(arg0 + -1691509480);
                int var119 = class233.field3518.method1453((byte) -128);
                int var120 = (var119 & 7) + class145.field2023;
                int var121 = (var119 >> 4 & 7) + class141.field1961;
                int var122 = class233.field3518.method1465(-1691509480);
                if (~var121 <= -1 && ~var120 <= -1 && var121 < 104 && var120 < 104) {
                    class170 var123 = new class170();
                    var123.field2358 = var122;
                    var123.field2355 = var118;
                    if (field4690[class295.field4642][var121][var120] == null) {
                        field4690[class295.field4642][var121][var120] = new class148();
                    }
                    field4690[class295.field4642][var121][var120].method988(new class207(var123), (byte) -77);
                    class249.method1667(var120, arg0 + 4, var121);
                }
            } else if (~class253.field3868 == -107) {
                int var124 = class233.field3518.method1453((byte) -127);
                int var125 = (var124 & 7) + class145.field2023;
                int var126 = (7 & var124 >> 4) + class141.field1961;
                int var127 = class233.field3518.method1445(false);
                int var128 = class233.field3518.method1453((byte) -127);
                int var129 = class233.field3518.method1445(false);
                if (~var126 <= -1 && var125 >= 0 && var126 < 104 && var125 < 104) {
                    int var130 = var125 * 128 - -64;
                    int var131 = var126 * 128 + 64;
                    class246 var132 = new class246(var127, class295.field4642, var131, var130, class275.method1836(class295.field4642, var130, var131, arg0 + 103) + -var128, var129, class52.field740);
                    class256.field3914.method988(new class199(var132), (byte) -77);
                }
            } else if (~class253.field3868 == -84) {
                int var133 = class233.field3518.method1445(false);
                int var134 = class233.field3518.method1453((byte) -128);
                class76.method489(var133, 33).method714(var134, (byte) -102);
            } else if (arg0 == 0) {
                if (class253.field3868 == 112) {
                    int var135 = class233.field3518.method1495((byte) -114);
                    int var136 = (var135 & 7) + class145.field2023;
                    int var137 = (var135 >> 4 & 7) + class141.field1961;
                    int var138 = class233.field3518.method1465(-1691509480);
                    int var139 = class233.field3518.method1474((byte) -123);
                    int var140 = class233.field3518.method1445(false);
                    if (var137 >= 0 && var136 >= 0 && var137 < 104 && ~var136 > -105 && class35.field550 != var138) {
                        class170 var141 = new class170();
                        var141.field2355 = var139;
                        var141.field2358 = var140;
                        if (field4690[class295.field4642][var137][var136] == null) {
                            field4690[class295.field4642][var137][var136] = new class148();
                        }
                        field4690[class295.field4642][var137][var136].method988(new class207(var141), (byte) -77);
                        class249.method1667(var136, 4, var137);
                    }
                } else if (~class253.field3868 == -119) {
                    int var142 = class233.field3518.method1492(2971768);
                    int var143 = var142 & 3;
                    int var144 = var142 >> 2;
                    byte var145 = class233.field3518.method1456(arg0 + 128);
                    int var146 = class233.field3518.method1481((byte) 40);
                    int var147 = class233.field3518.method1474((byte) -100);
                    byte var148 = class233.field3518.method1493((byte) -114);
                    byte var149 = class233.field3518.method1473((byte) -86);
                    int var150 = class233.field3518.method1460(2095725128);
                    int var151 = class141.field1961 - -(var150 >> 4 & 7);
                    int var152 = (var150 & 7) + class145.field2023;
                    int var153 = class233.field3518.method1445(false);
                    int var154 = class233.field3518.method1442(255);
                    byte var155 = class233.field3518.method1493((byte) -128);
                    class103.method676(var148, var143, 121, var147, var153, var155, var144, var145, var149, var146, var151, var152, var154);
                }
            }
        } else {
            int var112 = class233.field3518.method1460(2095725128);
            int var113 = class141.field1961 - -(7 & var112 >> 4);
            int var114 = (var112 & 7) + class145.field2023;
            int var115 = class233.field3518.method1474((byte) -118);
            if (~var113 <= -1 && var114 >= 0 && var113 < 104 && var114 < 104) {
                class148 var116 = field4690[class295.field4642][var113][var114];
                if (var116 != null) {
                    for (class207 var117 = (class207) var116.method990(-113); var117 != null; var117 = (class207) var116.method993(-114)) {
                        if (~(var115 & 32767) == ~var117.field2893.field2355) {
                            var117.method1115(-126);
                            break;
                        }
                    }
                    if (var116.method990(-123) == null) {
                        field4690[class295.field4642][var113][var114] = null;
                    }
                    class249.method1667(var114, 4, var113);
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field4680;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field4691 = arg0.method1453((byte) -128);
                }
            } else {
                this.field4686 = arg0.method1453((byte) -127);
            }
        } else {
            this.field4688 = arg0.method1453((byte) -128);
        }
        if (!arg2) {
            field4687 = -77;
        }
    }

    @OriginalMember(owner = "client!li", name = "h", descriptor = "(I)V")
    public static final void method1985(int arg0) {
        class281.field4359.method1864(80, (byte) -69);
        ++class154.field2146;
        class56 var1 = (class56) class289.field4559.method21((byte) 67);
        if (arg0 != -1) {
            method1985(18);
        }
        while (var1 != null) {
            if (~var1.field802 == -1) {
                class136.method924((byte) 86, var1, true);
            }
            var1 = (class56) class289.field4559.method22(true);
        }
        ++field4682;
        if (class233.field3524 != null) {
            class236.method1583(class233.field3524, 0);
            class233.field3524 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1986(String arg0, int arg1) {
        ++field4685;
        System.out.println("Error: " + class213.method1394("\n", "%0a", 65408, arg0));
        if (arg1 != 32767) {
            method1986((String) null, 103);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 < 69) {
            field4697 = null;
        }
        if (arg0 == arg4 && arg5 == arg7 && arg1 == arg8 && ~arg2 == ~arg3) {
            class211.method1365(arg1, arg6, arg3, arg7, -127, arg0);
        } else {
            int var10 = arg0;
            int var11 = arg7;
            int var12 = arg0 * 3;
            int var13 = arg7 * 3;
            int var14 = arg5 * 3;
            int var15 = arg2 * 3;
            int var16 = arg4 * 3;
            int var17 = arg8 * 3;
            int var18 = arg3 - arg7 + -var15 + var14;
            int var19 = -var16 + var17 + -var16 + var12;
            int var20 = var16 - var12;
            int var21 = -var14 + var15 - var14 + var13;
            int var22 = -arg0 + var16 + -var17 + arg1;
            int var23 = var14 - var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var26;
                int var28 = var19 * var25;
                int var29 = var21 * var25;
                int var30 = var18 * var26;
                int var31 = var20 * var24;
                int var32 = var23 * var24;
                int var33 = (var28 + var31 + var27 >> 12) + arg0;
                int var34 = arg7 - -(var30 - -var29 + var32 >> 12);
                class211.method1365(var33, arg6, var34, var11, 37, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field4692;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class297() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method1988(boolean arg0) {
        field4689 = null;
        if (!arg0) {
            field4694 = null;
            field4690 = null;
            field4697 = null;
        }
    }
}
