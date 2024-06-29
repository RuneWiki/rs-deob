import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 extends class57 {

    @OriginalMember(owner = "client!be", name = "Gc", descriptor = "I")
    public int field266 = -1;

    @OriginalMember(owner = "client!be", name = "Cc", descriptor = "I")
    public int field262 = -1;

    @OriginalMember(owner = "client!be", name = "Hc", descriptor = "I")
    public int field267 = 0;

    @OriginalMember(owner = "client!be", name = "Pc", descriptor = "I")
    public int field275 = 0;

    @OriginalMember(owner = "client!be", name = "Fc", descriptor = "I")
    public int field265 = 0;

    @OriginalMember(owner = "client!be", name = "Ac", descriptor = "Z")
    public boolean field260 = false;

    @OriginalMember(owner = "client!be", name = "Mc", descriptor = "I")
    public int field272 = 0;

    @OriginalMember(owner = "client!be", name = "Zc", descriptor = "I")
    public int field285 = 0;

    @OriginalMember(owner = "client!be", name = "Oc", descriptor = "Lod;")
    public static class101 field274 = class46.method335(-64, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!be", name = "Wc", descriptor = "Lod;")
    public static class101 field282 = class46.method335(100, "Cabbage");

    @OriginalMember(owner = "client!be", name = "Yc", descriptor = "[I")
    public static int[] field284 = new int[50];

    @OriginalMember(owner = "client!be", name = "Rc", descriptor = "Lcb;")
    public static class17 field277 = new class17(200);

    @OriginalMember(owner = "client!be", name = "bd", descriptor = "I")
    public static int field287 = 0;

    @OriginalMember(owner = "client!be", name = "wc", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!be", name = "xc", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!be", name = "yc", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!be", name = "zc", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!be", name = "Bc", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!be", name = "Dc", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!be", name = "Ec", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!be", name = "Ic", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!be", name = "Kc", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!be", name = "Lc", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!be", name = "Nc", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!be", name = "Sc", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!be", name = "Tc", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!be", name = "Uc", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!be", name = "Vc", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!be", name = "ad", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!be", name = "Qc", descriptor = "Lod;")
    public class101 field276;

    @OriginalMember(owner = "client!be", name = "Jc", descriptor = "Lqb;")
    public class113 field269;

    @OriginalMember(owner = "client!be", name = "Xc", descriptor = "Ljb;")
    public static class64 field283;

    @OriginalMember(owner = "client!be", name = "vc", descriptor = "Llf;")
    public class82 field255;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "(I)V")
    public static void method91(int arg0) {
        field282 = null;
        field277 = null;
        field283 = null;
        field284 = null;
        if (arg0 <= 68) {
            method93(-56, (byte[]) null, 127, -48);
        }
        field274 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Lqb;")
    public final class113 method88(byte arg0) {
        ++field256;
        if (this.field255 == null) {
            return null;
        } else {
            class95 var2 = super.field1300 != -1 && ~super.field1303 == -1 ? class8.method39(super.field1300, (byte) -92) : null;
            class95 var3 = ~super.field1278 == 0 || this.field260 || super.field1289 == super.field1278 && var2 != null ? null : class8.method39(super.field1278, (byte) -41);
            class113 var4 = this.field255.method606(super.field1301, var3, (byte) -22, super.field1318, var2);
            if (arg0 != -93) {
                this.field267 = 117;
            }
            if (var4 == null) {
                return null;
            } else {
                var4.method828();
                super.field1316 = var4.field1157;
                if (!this.field260 && super.field1311 != -1 && super.field1329 != -1) {
                    class113 var5 = class52.method376(false, super.field1311).method199((byte) 79, super.field1329);
                    if (var5 != null) {
                        class113[] var6 = new class113[] { var4, var5 };
                        var5.method840(0, -super.field1332, 0);
                        var4 = new class113(var6, 2);
                    }
                }
                if (!this.field260 && this.field269 != null) {
                    if (class143.field3305 >= this.field275) {
                        this.field269 = null;
                    }
                    if (class143.field3305 >= this.field272 && this.field275 > class143.field3305) {
                        class113 var7 = this.field269;
                        class113[] var8 = new class113[] { var4, var7 };
                        var7.method840(this.field259 - super.field1341, -this.field278 + this.field280, -super.field1298 + this.field258);
                        if (super.field1307 == 512) {
                            var7.method842();
                            var7.method842();
                            var7.method842();
                        } else if (~super.field1307 != -1025) {
                            if (super.field1307 == 1536) {
                                var7.method842();
                            }
                        } else {
                            var7.method842();
                            var7.method842();
                        }
                        var4 = new class113(var8, 2);
                        if (~super.field1307 == -513) {
                            var7.method842();
                        } else if (~super.field1307 != -1025) {
                            if (super.field1307 == 1536) {
                                var7.method842();
                                var7.method842();
                                var7.method842();
                            }
                        } else {
                            var7.method842();
                            var7.method842();
                        }
                        var7.method840(-this.field259 + super.field1341, -this.field280 + this.field278, super.field1298 - this.field258);
                    }
                }
                var4.field2440 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ltf;Z)V")
    public final void method92(class138 arg0, boolean arg1) {
        arg0.field3175 = 0;
        int[] var3 = new int[12];
        int var4 = arg0.method1055(112);
        int var5 = -1;
        this.field266 = arg0.method1079((byte) 0);
        ++field263;
        this.field262 = arg0.method1079((byte) 0);
        this.field285 = 0;
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg0.method1055(110);
            if (~var7 == -1) {
                var3[var6] = 0;
            } else {
                int var8 = arg0.method1055(114);
                var3[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var3[0] == 65535) {
                    var5 = arg0.method1098(true);
                    break;
                }
                if (var3[var6] >= 512) {
                    int var12 = class137.method1045((byte) -113, var3[var6] - 512).field3520;
                    if (var12 != 0) {
                        this.field285 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; ++var10) {
            int var11 = arg0.method1055(112);
            if (var11 < 0 || class133.field3049[var10].length <= var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field1289 = arg0.method1098(true);
        if (super.field1289 == 65535) {
            super.field1289 = -1;
        }
        super.field1292 = arg0.method1098(arg1);
        if (~super.field1292 == -65536) {
            super.field1292 = -1;
        }
        super.field1335 = super.field1292;
        super.field1302 = arg0.method1098(arg1);
        if (~super.field1302 == -65536) {
            super.field1302 = -1;
        }
        super.field1327 = arg0.method1098(true);
        if (~super.field1327 == -65536) {
            super.field1327 = -1;
        }
        super.field1273 = arg0.method1098(true);
        if (super.field1273 == 65535) {
            super.field1273 = -1;
        }
        super.field1296 = arg0.method1098(true);
        if (super.field1296 == 65535) {
            super.field1296 = -1;
        }
        super.field1297 = arg0.method1098(arg1);
        if (super.field1297 == 65535) {
            super.field1297 = -1;
        }
        this.field276 = class67.method452(105, arg0.method1065(-25)).method714(-125);
        this.field265 = arg0.method1055(112);
        this.field267 = arg0.method1098(true);
        if (this.field255 == null) {
            this.field255 = new class82();
        }
        this.field255.method598(var3, var9, var5, -30739, var4 == 1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BII)I")
    public static final int method93(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg0; arg3 > var5; ++var5) {
            var4 = class25.field651[255 & (var4 ^ arg1[var5])] ^ var4 >>> 8;
        }
        ++field273;
        if (arg2 >= -43) {
            method94(false);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
    public static final void method94(boolean arg0) {
        class149.field3392 = class137.field3136;
        class26.field670 = class53.field1205;
        class148.field3371 = class93.field1988;
        class93.field2005 = class41.field994;
        class80.field1687 = class25.field657;
        class101.field2208 = class17.field356;
        class96.field2088 = class65.field1483;
        class80.field1686 = class148.field3377;
        class6.field86 = class82.field1775;
        class7.field102 = class126.field2749;
        class62.field1380 = class6.field78;
        class80.field1701 = class148.field3377;
        class84.field1836 = class63.field1417;
        class102.field2251 = class3.field40;
        class130.field2963 = class31.field792;
        class89.field1934 = class8.field130;
        class73.field1577 = class63.field1419;
        class1.field2 = class73.field1583;
        class80.field1703 = class23.field546;
        class80.field1670 = class52.field1198;
        class149.field3386 = class140.field3234;
        class78.field1625 = class87.field1925;
        class47.field1121 = class52.field1186;
        class111.field2382 = class54.field1215;
        class112.field2400 = class130.field2966;
        class54.field1254 = class35.field897;
        class127.field2891 = class138.field3198;
        class140.field3226 = class40.field948;
        class41.field981 = class132.field3034;
        class112.field2399 = class101.field2213;
        class52.field1195 = class33.field853;
        class80.field1673 = class148.field3377;
        class24.field626 = class5.field68;
        class80.field1679 = class148.field3377;
        class80.field1691 = class84.field1845;
        class142.field3270 = class111.field2366;
        class36.field905 = class5.field63;
        class18.field390 = class44.field1051;
        class84.field1844 = class92.field1984;
        class141.field3251 = class90.field1963;
        class84.field1827 = class73.field1584;
        class153.field3502 = class34.field864;
        class80.field1702 = class148.field3377;
        class31.field793 = class28.field760;
        class28.field748 = class7.field107;
        class80.field1675 = class148.field3377;
        class95.field2050 = class67.field1517;
        class148.field3379 = class157.field3627;
        class34.field871 = class79.field1651;
        class130.field2961 = class84.field1832;
        class22.field500 = class48.field1144;
        class62.field1377 = class32.field820;
        class80.field1678 = class148.field3377;
        class75.field1613 = class57.field1346;
        class112.field2402 = class101.field2213;
        class134.field3059 = class35.field903;
        class29.field771 = class130.field2974;
        class87.field1913 = class149.field3391;
        class46.field1098 = class83.field1814;
        class147.field3357 = class158.field3633;
        class7.field112 = class39.field942;
        class31.field807 = class30.field784;
        class15.field339 = class138.field3168;
        if (arg0) {
            method93(-122, (byte[]) null, -80, -26);
        }
        class46.field1082 = class90.field1968;
        class138.field3149 = class23.field552;
        class35.field885 = class119.field2627;
        class80.field1682 = class3.field43;
        class130.field2972 = class83.field1805;
        class18.field389 = class147.field3362;
        class80.field1715 = class148.field3377;
        class65.field1468 = class147.field3358;
        class20.field444 = class6.field91;
        class41.field993 = class84.field1843;
        class152.field3476 = class65.field1469;
        class80.field1708 = class148.field3377;
        class2.field20 = class147.field3367;
        class95.field2047 = class56.field1265;
        class23.field559 = class7.field101;
        class129.field2949 = class155.field3516;
        class96.field2091 = class157.field3609;
        class80.field1698 = class65.field1489;
        class142.field3276 = class101.field2181;
        class36.field904 = class148.field3377;
        class64.field1456 = class47.field1125;
        class111.field2386 = class26.field675;
        class101.field2176 = class6.field85;
        class40.field969 = class5.field71;
        class42.field1016 = class43.field1028;
        class96.field2083 = class157.field3609;
        class80.field1712 = class25.field657;
        class2.field28 = class144.field3322;
        class98.field2118 = class47.field1129;
        class80.field1680 = class148.field3377;
        class90.field1967 = class57.field1330;
        class64.field1465 = class12.field249;
        class18.field381 = class157.field3610;
        class64.field1466 = class35.field902;
        class27.field714 = class119.field2626;
        class57.field1336 = class48.field1138;
        class96.field2075 = class85.field1883;
        class27.field723 = class17.field363;
        class34.field863 = class94.field2020;
        class2.field23 = class135.field3092;
        class80.field1696 = class148.field3377;
        class92.field1985 = class138.field3216;
        class46.field1088 = class158.field3645;
        class94.field2028 = class135.field3090;
        class85.field1884 = class54.field1250;
        class54.field1220 = class56.field1266;
        class17.field365 = class46.field1095;
        class137.field3137 = class115.field2545;
        class134.field3070 = class42.field1011;
        class143.field3293 = class3.field46;
        class80.field1681 = class148.field3377;
        class7.field111 = class78.field1648;
        class27.field722 = class17.field363;
        class28.field758 = class153.field3497;
        class119.field2635 = class134.field3060;
        class61.field1352 = class11.field175;
        class120.field2639 = class27.field719;
        class35.field900 = class20.field446;
        class64.field1435 = class97.field2097;
        class79.field1662 = class5.field73;
        class27.field708 = class46.field1091;
        class89.field1932 = class145.field3331;
        class102.field2253 = class3.field40;
        class99.field2137 = class23.field532;
        class80.field1711 = class148.field3377;
        class61.field1351 = class133.field3052;
        class65.field1479 = class8.field136;
        class80.field1685 = class148.field3377;
        class137.field3131 = class54.field1234;
        class47.field1126 = class143.field3286;
        class84.field1829 = class73.field1584;
        class78.field1631 = class148.field3380;
        class80.field1700 = class98.field2125;
        class85.field1886 = class73.field1581;
        class80.field1676 = class15.field294;
        class80.field1677 = class148.field3377;
        class84.field1828 = class73.field1584;
        class40.field943 = class6.field89;
        class98.field2124 = class23.field544;
        class157.field3606 = class130.field2967;
        class5.field65 = class32.field825;
        class80.field1672 = class56.field1256;
        class65.field1487 = class25.field641;
        class105.field2262 = class134.field3073;
        class144.field3327 = class22.field522;
        class41.field996 = class158.field3640;
        class79.field1657 = class94.field2027;
        class30.field783 = class6.field81;
        class64.field1441 = class150.field3441;
        class118.field2616 = class12.field246;
        class23.field538 = class31.field808;
        class67.field1520 = class8.field135;
        class78.field1643 = class148.field3380;
        class23.field536 = class138.field3146;
        class36.field911 = class100.field2165;
        class53.field1212 = class121.field2673;
        class84.field1833 = class100.field2163;
        class40.field973 = class23.field539;
        class98.field2132 = class44.field1041;
        class111.field2367 = class140.field3235;
        class80.field1690 = class112.field2391;
        class23.field550 = class10.field143;
        class83.field1819 = class96.field2073;
        class129.field2946 = class155.field3516;
        class63.field1411 = class158.field3635;
        class127.field2894 = class85.field1850;
        class52.field1187 = class26.field663;
        class120.field2643 = class111.field2381;
        class80.field1669 = class148.field3377;
        class80.field1674 = class148.field3377;
        class79.field1665 = class54.field1249;
        class26.field694 = class101.field2224;
        class49.field1161 = class39.field940;
        class80.field1694 = class142.field3264;
        class80.field1699 = class98.field2125;
        class28.field752 = class138.field3183;
        class40.field954 = class2.field27;
        class80.field1683 = class148.field3377;
        class80.field1688 = class148.field3377;
        class20.field445 = class10.field139;
        class10.field146 = class82.field1803;
        class64.field1464 = class93.field2007;
        class80.field1713 = class73.field1584;
        class32.field837 = client.field490;
        class84.field1838 = class63.field1417;
        ++field279;
        class146.field3354 = class10.field142;
        class54.field1242 = class7.field100;
        class11.field190 = class119.field2630;
        class53.field1208 = class112.field2415;
        class80.field1705 = class24.field585;
        class115.field2544 = class75.field1605;
        class80.field1716 = class148.field3377;
        class80.field1671 = class148.field3377;
        if (class121.field2688) {
        }
    }

    @OriginalMember(owner = "client!be", name = "j", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        ++field268;
        if (this.field255 == null) {
            return false;
        } else {
            if (arg0 != -21094) {
                field286 = 87;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    public static int method96(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
