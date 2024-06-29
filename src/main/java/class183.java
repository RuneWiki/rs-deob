import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class183 extends class213 {

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public int field3381 = -1;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public int field3383 = -1;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public int field3380 = 5;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public int field3391 = -1;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public int field3384 = 99;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public int field3385 = -1;

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "Z")
    public boolean field3403 = false;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "I")
    public int field3402 = -1;

    @OriginalMember(owner = "client!re", name = "ob", descriptor = "I")
    public int field3407 = 2;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "Lvd;")
    private static class222 field3388 = class212.method1357("Bitte wenden Sie sich an den Kundendienst)3", 10731);

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public static int field3395 = 0;

    @OriginalMember(owner = "client!re", name = "qb", descriptor = "Lvd;")
    private static class222 field3409 = class212.method1357(" has logged out)3", 10731);

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lvd;")
    public static class222 field3382 = field3409;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!re", name = "nb", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!re", name = "pb", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "[I")
    private int[] field3392;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "[I")
    private int[] field3394;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "[I")
    public int[] field3396;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "[I")
    public int[] field3397;

    @OriginalMember(owner = "client!re", name = "lb", descriptor = "[I")
    public int[] field3404;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILee;Lre;II)Lee;")
    public final class49 method1143(int arg0, class49 arg1, class183 arg2, int arg3, int arg4) {
        field3401++;
        int var6 = this.field3404[arg0];
        if (arg3 != -6) {
            this.method1143(-14, null, null, -58, -80);
        }
        class97 var7 = class184.method1154(var6 >> 16, 26245);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method1152(arg4, arg1, 126);
        }
        int var9 = arg2.field3404[arg4];
        class97 var10 = class184.method1154(var9 >> 16, 26245);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class49 var12 = arg1.method362(!var7.method609(var8, 88));
            var12.method350(var7, var8);
            return var12;
        } else {
            class49 var13 = arg1.method362(!var7.method609(var8, 113) & !var10.method609(var11, 26));
            var13.method347(var7, var8, var10, var11, this.field3394);
            return var13;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lka;I)V")
    public final void method1144(class109 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method662((byte) -128);
            if (var3 == 0) {
                if (arg1 >= -126) {
                    this.field3402 = -92;
                }
                field3387++;
                return;
            }
            this.method1150(arg0, -7, var3);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public final void method1145(byte arg0) {
        field3393++;
        if (arg0 > -117) {
            field3388 = null;
        }
        if (this.field3381 == -1) {
            if (this.field3394 == null) {
                this.field3381 = 0;
            } else {
                this.field3381 = 2;
            }
        }
        if (this.field3391 != -1) {
            return;
        }
        if (this.field3394 == null) {
            this.field3391 = 0;
        } else {
            this.field3391 = 2;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILee;)Lee;")
    public final class49 method1146(int arg0, int arg1, int arg2, class49 arg3) {
        field3405++;
        int var5 = this.field3404[arg1];
        class97 var6 = class184.method1154(var5 >> 16, 26245);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method362(true);
        }
        int var8 = arg0 & 0x3;
        class49 var9 = arg3.method362(!var6.method609(var7, 39));
        if (var8 == 1) {
            var9.method361();
        } else if (var8 == 2) {
            var9.method363();
        } else if (var8 == 3) {
            var9.method357();
        }
        if (arg2 != 3399) {
            return null;
        }
        var9.method350(var6, var7);
        if (var8 == 1) {
            var9.method357();
        } else if (var8 == 2) {
            var9.method363();
        } else if (var8 == 3) {
            var9.method361();
        }
        return var9;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lee;II)Lee;")
    public final class49 method1147(class49 arg0, int arg1, int arg2) {
        int var4 = this.field3404[arg2];
        if (arg1 != 1778103792) {
            this.field3402 = -67;
        }
        class97 var5 = class184.method1154(var4 >> 16, 26245);
        int var6 = var4 & 0xFFFF;
        field3386++;
        if (var5 == null) {
            return arg0.method353(true);
        } else {
            class49 var7 = arg0.method353(!var5.method609(var6, arg1 - 1778103912));
            var7.method350(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public static void method1148(int arg0) {
        if (arg0 != -3592) {
            method1149(-73);
        }
        field3388 = null;
        field3409 = null;
        field3382 = null;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
    public static final void method1149(int arg0) {
        class126.field2395 = class149.field2845;
        class76.field1486 = class220.field4069;
        class157.field3011 = class40.field886;
        class39.field876 = class103.field1912;
        class200.field3663 = class202.field3701;
        class113.field2130 = field3388;
        class84.field1606 = class213.field3946;
        class29.field640 = class180.field3347;
        class102.field1895 = class187.field3448;
        class213.field3957 = class73.field1450;
        class126.field2439 = class83.field1595;
        class173.field3253 = class227.field4253;
        class162.field3092 = client.field696;
        class16.field424 = class44.field926;
        class118.field2238 = class97.field1812;
        class29.field642 = class160.field3045;
        class126.field2399 = class103.field1914;
        class181.field3366 = class237.field4421;
        class137.field2653 = class110.field2065;
        class156.field2983 = class230.field4321;
        class73.field1456 = class139.field2686;
        class143.field2766 = class5.field80;
        class188.field3483 = class51.field984;
        class203.field3730 = class214.field3967;
        class126.field2393 = class132.field2562;
        class123.field2345 = class18.field436;
        class193.field3556 = class68.field1281;
        class217.field4023 = class111.field2073;
        class126.field2419 = class103.field1914;
        class173.field3243 = class36.field775;
        class165.field3151 = class110.field2063;
        class126.field2413 = class128.field2476;
        class212.field3939 = class191.field3513;
        class175.field3282 = class88.field1669;
        class213.field3954 = class80.field1541;
        class9.field161 = class113.field2118;
        class108.field1990 = class98.field1838;
        class126.field2417 = class103.field1914;
        class228.field4271 = class129.field2515;
        class132.field2556 = class234.field4372;
        class126.field2442 = class9.field170;
        class157.field3010 = class40.field886;
        class22.field529 = class24.field553;
        class126.field2430 = class103.field1914;
        class20.field465 = class10.field180;
        class107.field1968 = class28.field613;
        class114.field2157 = class66.field1243;
        class126.field2423 = class103.field1914;
        class97.field1806 = class165.field3108;
        class231.field4331 = class139.field2685;
        client.field706 = class192.field3539;
        class11.field215 = class131.field2545;
        class84.field1611 = class206.field3833;
        class80.field1543 = class234.field4367;
        class214.field3971 = class208.field3874;
        class46.field945 = class35.field770;
        class126.field2398 = class103.field1914;
        class81.field1558 = class51.field980;
        class212.field3934 = class132.field2565;
        class101.field1886 = class217.field4041;
        class50.field976 = class114.field2144;
        class122.field2323 = class13.field284;
        class157.field3013 = class40.field886;
        class9.field163 = class172.field3229;
        class94.field1766 = class22.field508;
        class106.field1966 = class58.field1079;
        class126.field2403 = class103.field1914;
        class126.field2435 = class103.field1914;
        class126.field2394 = class103.field1914;
        class167.field3192 = class111.field2102;
        class143.field2770 = class86.field1629;
        class215.field3996 = class115.field2199;
        class226.field4233 = class202.field3694;
        class28.field625 = class208.field3869;
        class78.field1512 = class181.field3365;
        class87.field1651 = class206.field3840;
        class20.field478 = class98.field1847;
        class96.field1797 = class173.field3262;
        class222.field4142 = class10.field192;
        class173.field3257 = class77.field1491;
        class52.field1004 = class149.field2853;
        class126.field2434 = class103.field1914;
        class126.field2410 = class103.field1914;
        class234.field4375 = class7.field105;
        class149.field2846 = class137.field2657;
        class14.field399 = class46.field947;
        class124.field2370 = class83.field1591;
        class228.field4279 = class58.field1082;
        class126.field2446 = class167.field3198;
        class52.field1001 = class39.field877;
        class155.field2953 = class137.field2655;
        class216.field4017 = class25.field575;
        class1.field2 = class115.field2195;
        class3.field44 = class16.field415;
        class196.field3565 = class196.field3578;
        class126.field2422 = class103.field1914;
        class23.field550 = class65.field1227;
        class126.field2443 = class103.field1914;
        class126.field2441 = class92.field1736;
        class140.field2710 = class107.field1980;
        class102.field1889 = class188.field3478;
        class103.field1909 = class205.field3821;
        class202.field3704 = class96.field1798;
        class111.field2094 = class155.field2956;
        class132.field2563 = class57.field1075;
        class25.field565 = class211.field3918;
        class126.field2445 = class103.field1914;
        class9.field174 = class94.field1757;
        class69.field1292 = class225.field4203;
        class161.field3080 = class168.field3207;
        class36.field790 = class47.field961;
        if (arg0 != -1) {
            field3395 = -73;
        }
        class68.field1278 = class94.field1775;
        class134.field2587 = class124.field2369;
        class16.field419 = class88.field1660;
        class197.field3605 = class31.field650;
        class173.field3251 = class46.field949;
        class225.field4204 = class130.field2533;
        class99.field1864 = class17.field431;
        class126.field2428 = class9.field170;
        class213.field3948 = class80.field1541;
        class131.field2541 = class105.field1939;
        class126.field2421 = class103.field1914;
        class131.field2543 = class127.field2452;
        class205.field3813 = class231.field4333;
        class196.field3576 = class173.field3249;
        class28.field623 = class6.field91;
        class110.field2061 = class121.field2282;
        class14.field390 = class226.field4229;
        class127.field2453 = class108.field1988;
        class161.field3075 = class228.field4274;
        class197.field3602 = class166.field3170;
        class126.field2437 = class103.field1914;
        class134.field2586 = class26.field591;
        class56.field1060 = class104.field1932;
        class46.field935 = class184.field3413;
        class126.field2420 = class128.field2476;
        class98.field1843 = class44.field920;
        class180.field3346 = class111.field2093;
        class126.field2406 = class103.field1914;
        class131.field2546 = class127.field2452;
        class22.field524 = class217.field4035;
        class106.field1961 = class153.field2947;
        class98.field1851 = class161.field3067;
        class39.field875 = class37.field793;
        class143.field2767 = class137.field2648;
        class172.field3232 = class6.field101;
        class129.field2510 = class52.field999;
        class32.field672 = class213.field3962;
        class131.field2540 = class159.field3035;
        class111.field2092 = class103.field1914;
        class157.field2993 = class47.field956;
        class157.field3014 = class137.field2658;
        class157.field3009 = class203.field3722;
        class123.field2354 = class187.field3470;
        class126.field2426 = class40.field886;
        class193.field3552 = class193.field3551;
        class187.field3473 = class105.field1949;
        class126.field2438 = class103.field1914;
        class173.field3259 = class78.field1507;
        class68.field1284 = class143.field2777;
        class92.field1734 = class9.field162;
        class153.field2946 = class64.field1169;
        class81.field1552 = class208.field3873;
        class105.field1937 = class167.field3189;
        class211.field3929 = class172.field3226;
        class76.field1482 = class52.field997;
        class126.field2412 = class1.field9;
        class126.field2416 = class174.field3278;
        class126.field2444 = class221.field4097;
        class111.field2082 = class72.field1391;
        class179.field3321 = class47.field960;
        class139.field2683 = class27.field601;
        class140.field2698 = class107.field1980;
        class10.field179 = class111.field2100;
        class185.field3424 = class94.field1776;
        class52.field1005 = class39.field877;
        class121.field2279 = class200.field3662;
        class111.field2103 = class200.field3649;
        class126.field2425 = class103.field1914;
        class126.field2402 = class103.field1914;
        class126.field2401 = class187.field3474;
        class121.field2316 = class200.field3648;
        class126.field2431 = class103.field1914;
        class22.field517 = client.field705;
        class47.field959 = class203.field3709;
        field3408++;
        client.field694 = class83.field1587;
        class22.field531 = class217.field4035;
        class143.field2778 = class86.field1629;
        class196.field3577 = class84.field1605;
        class165.field3127 = class105.field1943;
        class197.field3603 = class205.field3828;
        field3382 = class27.field605;
        class181.field3352 = class73.field1448;
        class157.field3008 = class137.field2658;
        class59.field1110 = class234.field4376;
        class56.field1053 = class95.field1783;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lka;II)V")
    private final void method1150(class109 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg0.method675(2);
            this.field3396 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3396[var5] = arg0.method675(2);
            }
            this.field3404 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3404[var6] = arg0.method675(2);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3404[var7] = (arg0.method675(class168.method1082(arg1, -5)) << 16) + this.field3404[var7];
            }
        } else if (arg2 == 2) {
            this.field3385 = arg0.method675(2);
        } else if (arg2 == 3) {
            int var13 = arg0.method662((byte) -120);
            this.field3394 = new int[var13 + 1];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3394[var14] = arg0.method662((byte) -117);
            }
            this.field3394[var13] = 9999999;
        } else if (arg2 == 4) {
            this.field3403 = true;
        } else if (arg2 == 5) {
            this.field3380 = arg0.method662((byte) -121);
        } else if (arg2 == 6) {
            this.field3402 = arg0.method675(2);
        } else if (arg2 == 7) {
            this.field3383 = arg0.method675(2);
        } else if (arg2 == 8) {
            this.field3384 = arg0.method662((byte) -124);
        } else if (arg2 == 9) {
            this.field3381 = arg0.method662((byte) -117);
        } else if (arg2 == 10) {
            this.field3391 = arg0.method662((byte) -99);
        } else if (arg2 == 11) {
            this.field3407 = arg0.method662((byte) -111);
        } else if (arg2 == 12) {
            int var10 = arg0.method662((byte) -84);
            this.field3392 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3392[var11] = arg0.method675(2);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3392[var12] = (arg0.method675(class168.method1082(arg1, -5)) << 16) + this.field3392[var12];
            }
        } else if (arg2 == 13) {
            int var8 = arg0.method662((byte) -88);
            this.field3397 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3397[var9] = arg0.method701(869322848);
            }
        }
        field3390++;
        if (arg1 != -7) {
            this.method1146(-62, -85, 2, null);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BILee;)Lee;")
    public final class49 method1151(byte arg0, int arg1, class49 arg2) {
        field3406++;
        if (arg0 < 43) {
            field3382 = null;
        }
        int var4 = this.field3404[arg1];
        class97 var5 = class184.method1154(var4 >> 16, 26245);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method362(true);
        }
        int var7 = 0;
        class97 var8 = null;
        if (this.field3392 != null && arg1 < this.field3392.length) {
            int var9 = this.field3392[arg1];
            var8 = class184.method1154(var9 >> 16, 26245);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class49 var11 = arg2.method362(!var5.method609(var6, -5));
            var11.method350(var5, var6);
            return var11;
        } else {
            class49 var10 = arg2.method362(!var5.method609(var6, -106) & !var8.method609(var7, 102));
            var10.method350(var5, var6);
            var10.method350(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILee;I)Lee;")
    public final class49 method1152(int arg0, class49 arg1, int arg2) {
        if (arg2 <= 88) {
            return null;
        }
        int var4 = this.field3404[arg0];
        class97 var5 = class184.method1154(var4 >> 16, 26245);
        field3400++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method362(true);
        } else {
            class49 var7 = arg1.method362(!var5.method609(var6, 82));
            var7.method350(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)V")
    public static final void method1153(int arg0, int arg1, byte arg2) {
        field3398++;
        class28 var3 = class237.field4408[class217.field4036][arg1][arg0];
        if (var3 == null) {
            class186.method1167(class217.field4036, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class27 var5 = null;
        class27 var6 = (class27) var3.method236(0);
        if (arg2 >= -7) {
            method1153(117, 125, (byte) -80);
        }
        while (var6 != null) {
            class204 var13 = class112.method728(var6.field598.field911, (byte) 27);
            int var14 = var13.field3768;
            if (var13.field3740 == 1) {
                var14 = (var6.field598.field902 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var5 = var6;
            }
            var6 = (class27) var3.method237(true);
        }
        if (var5 == null) {
            class186.method1167(class217.field4036, arg1, arg0);
            return;
        }
        var3.method240(var5, (byte) 77);
        class27 var7 = (class27) var3.method236(0);
        class43 var8 = null;
        class43 var9 = null;
        while (var7 != null) {
            class43 var12 = var7.field598;
            if (var5.field598.field911 != var12.field911) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field911 != var12.field911 && var8 == null) {
                    var8 = var12;
                }
            }
            var7 = (class27) var3.method237(true);
        }
        long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class113.method733(class217.field4036, arg1, arg0, class71.method482(arg0 * 128 + 64, arg1 * 128 + 64, class217.field4036, (byte) 126), var5.field598, var10, var9, var8);
    }
}
