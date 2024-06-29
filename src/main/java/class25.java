import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[Lu;")
    public static class135[] field589 = new class135[100];

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lu;")
    private static class135 field591 = class87.method676((byte) -60, "Connecting to update server");

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lu;")
    private static class135 field592 = class87.method676((byte) -42, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lu;")
    private static class135 field585 = class87.method676((byte) -48, "Please use a different world)3");

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lu;")
    public static class135 field598 = field585;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "[I")
    public static int[] field597 = new int[256];

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lu;")
    public static class135 field593 = field591;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lu;")
    public static class135 field587 = field585;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Lu;")
    private static class135 field609 = class87.method676((byte) -63, "This world is full)3");

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lu;")
    public static class135 field606 = class87.method676((byte) -44, " )2> @yel@");

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Lu;")
    public static class135 field608 = field609;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
    public static int[] field603 = new int[50];

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Lu;")
    private static class135 field617;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lu;")
    private static class135 field618;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "Lu;")
    public static class135 field616;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Lu;")
    public static class135 field620;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Lu;")
    public static class135 field619;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "[I")
    public static int[] field621;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "J")
    private long field590;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "J")
    private long field604;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Z")
    public boolean field594;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "[I")
    private int[] field611;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "[I")
    private int[] field614;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ[I[IB)V")
    public final void method200(int arg0, boolean arg1, int[] arg2, int[] arg3, byte arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class63.field1589; var7++) {
                    class42 var8 = class2.method8(-64, var7);
                    if (var8 != null && !var8.field980 && var8.field972 == (arg1 ? 7 : 0) + var6) {
                        arg3[class130.field3124[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field611 = arg3;
        if (arg4 != 24) {
            field597 = null;
        }
        field605++;
        this.field614 = arg2;
        this.field594 = arg1;
        this.field600 = arg0;
        this.method205((byte) 76);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method201(int arg0) {
        field620 = null;
        field589 = null;
        field598 = null;
        if (arg0 != -8) {
            return;
        }
        field609 = null;
        field618 = null;
        field593 = null;
        field587 = null;
        field621 = null;
        field592 = null;
        field606 = null;
        field591 = null;
        field585 = null;
        field619 = null;
        field617 = null;
        field597 = null;
        field616 = null;
        field603 = null;
        field608 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)V")
    public final void method202(int arg0, int arg1, boolean arg2) {
        field599++;
        if (arg0 == 1 && this.field594) {
            return;
        }
        int var4 = this.field611[class130.field3124[arg0]];
        if (arg1 == var4) {
            return;
        }
        var4 -= 256;
        class42 var5;
        do {
            if (arg2) {
                var4++;
                if (class63.field1589 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class63.field1589 - 1;
                }
            }
            var5 = class2.method8(-65, var4);
        } while (var5 == null || var5.field980 || arg0 + (this.field594 ? 7 : 0) != var5.field972);
        this.field611[class130.field3124[arg0]] = var4 + 256;
        this.method205((byte) 55);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)I")
    public final int method203(byte arg0) {
        field613++;
        if (arg0 != -74) {
            this.method203((byte) -7);
        }
        return this.field600 == -1 ? (this.field611[11] << 5) + (this.field614[0] << 25) + (this.field614[4] << 20) + (this.field611[8] << 10) + this.field611[1] + (this.field611[0] << 15) : class10.method55((byte) 124, this.field600).field1296 + 305419896;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZII)V")
    public final void method204(boolean arg0, int arg1, int arg2) {
        int var4 = -63 % ((-arg1 - 13) / 47);
        field595++;
        int var5 = this.field614[arg2];
        if (arg0) {
            var5++;
            if (var5 >= class125.field2988[arg2].length) {
                var5 = 0;
            }
        } else {
            var5--;
            if (var5 < 0) {
                var5 = class125.field2988[arg2].length - 1;
            }
        }
        this.field614[arg2] = var5;
        this.method205((byte) 67);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    private final void method205(byte arg0) {
        field596++;
        long var2 = this.field604;
        this.field604 = 0L;
        int var4 = this.field611[5];
        int var5 = this.field611[9];
        this.field611[5] = var5;
        this.field611[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field604 <<= 0x4;
            if (this.field611[var6] >= 256) {
                this.field604 += this.field611[var6] - 256;
            }
        }
        if (this.field611[0] >= 256) {
            this.field604 += this.field611[0] - 256 >> 4;
        }
        if (this.field611[1] >= 256) {
            this.field604 += this.field611[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field604 <<= 0x3;
            this.field604 += this.field614[var7];
        }
        this.field604 <<= 0x1;
        this.field611[9] = var5;
        this.field611[5] = var4;
        this.field604 += this.field594 ? 1 : 0;
        if (arg0 > 46 && (var2 != 0L && this.field604 != var2)) {
            class32.field757.method235(var2, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static final void method206(boolean arg0) {
        class80.field1911 = class8.field154;
        class42.field983 = class106.field2558;
        class69.field1711 = class58.field1417;
        class133.field3205 = class39.field902;
        class122.field2931 = class116.field2794;
        class30.field721 = class17.field372;
        class14.field308 = class138.field3346;
        class48.field1148 = class104.field2502;
        class44.field1076 = class14.field302;
        class120.field2913 = class138.field3348;
        class109.field2645 = class113.field2732;
        class87.field2064 = class113.field2717;
        class1.field5 = class55.field1297;
        class14.field348 = class39.field905;
        class35.field804 = class109.field2651;
        class12.field286 = class108.field2596;
        class57.field1404 = class101.field2433;
        class30.field732 = class20.field463;
        class124.field2970 = class130.field3123;
        class48.field1136 = class65.field1607;
        class97.field2350 = class68.field1680;
        class80.field1910 = class103.field2500;
        class122.field2932 = class75.field1763;
        class14.field307 = class39.field905;
        class99.field2403 = class131.field3169;
        class79.field1871 = class123.field2943;
        class102.field2460 = class93.field2217;
        field616 = class84.field1983;
        class47.field1115 = class12.field292;
        class14.field300 = class39.field905;
        class79.field1880 = class21.field502;
        class43.field1040 = class68.field1661;
        class94.field2243 = class41.field963;
        class79.field1883 = class126.field3000;
        class58.field1442 = class60.field1535;
        class116.field2799 = class84.field1999;
        class108.field2607 = class21.field498;
        class20.field469 = class104.field2509;
        class2.field67 = class84.field1987;
        class77.field1827 = class94.field2261;
        class80.field1894 = class123.field2942;
        class26.field627 = class43.field1044;
        class49.field1170 = class82.field1953;
        class128.field3087 = class103.field2497;
        class14.field301 = class69.field1697;
        class14.field316 = class39.field905;
        class109.field2641 = class56.field1371;
        class82.field1936 = class55.field1336;
        class106.field2553 = class90.field2105;
        class14.field317 = class39.field905;
        class105.field2524 = class111.field2692;
        class83.field1966 = class109.field2650;
        class68.field1673 = class117.field2813;
        class14.field330 = class106.field2556;
        field598 = class39.field905;
        class58.field1440 = class3.field92;
        class84.field1988 = class41.field957;
        class49.field1171 = class82.field1953;
        class23.field576 = class152.field3755;
        class17.field385 = class97.field2361;
        class102.field2458 = class82.field1959;
        class108.field2606 = class21.field493;
        class58.field1413 = class77.field1830;
        class49.field1157 = class14.field309;
        class32.field756 = class141.field3460;
        class40.field921 = class131.field3175;
        class40.field925 = class82.field1958;
        class3.field76 = class43.field1039;
        class126.field3006 = class125.field2980;
        class14.field334 = class69.field1700;
        class107.field2581 = class98.field2375;
        class57.field1395 = class113.field2733;
        class14.field345 = class130.field3120;
        class152.field3758 = class130.field3118;
        class14.field341 = class39.field905;
        class28.field688 = class141.field3423;
        class101.field2450 = class48.field1132;
        class14.field342 = class39.field905;
        class12.field273 = class42.field984;
        class148.field3697 = class37.field848;
        class14.field305 = class39.field905;
        class76.field1797 = class68.field1688;
        class43.field1053 = class90.field2117;
        class68.field1662 = class86.field2046;
        class96.field2327 = class95.field2290;
        class136.field3288 = class58.field1434;
        class76.field1801 = class87.field2070;
        class1.field27 = class39.field912;
        class126.field2999 = class50.field1201;
        class151.field3732 = class87.field2063;
        class148.field3676 = class37.field848;
        class14.field347 = class39.field905;
        class96.field2338 = class101.field2445;
        class107.field2586 = class44.field1067;
        class39.field914 = class2.field57;
        class20.field471 = class97.field2345;
        class124.field2948 = class57.field1407;
        field593 = class124.field2961;
        class138.field3360 = class115.field2747;
        class87.field2068 = class82.field1956;
        class85.field2036 = class94.field2283;
        class34.field798 = class55.field1340;
        class148.field3683 = class62.field1551;
        class55.field1320 = class87.field2078;
        class132.field3195 = class55.field1306;
        class77.field1835 = class117.field2812;
        class14.field323 = class39.field905;
        class58.field1424 = class46.field1095;
        class14.field350 = class126.field3000;
        class41.field966 = class106.field2544;
        class69.field1705 = class53.field1251;
        class14.field333 = class69.field1703;
        class46.field1105 = class95.field2295;
        class85.field2029 = class63.field1580;
        class79.field1870 = class126.field3000;
        class23.field580 = class152.field3755;
        class115.field2757 = class55.field1314;
        class15.field355 = class113.field2730;
        class80.field1914 = class57.field1393;
        class14.field332 = class39.field905;
        class68.field1678 = class37.field850;
        class132.field3188 = class126.field3007;
        class102.field2463 = client.field508;
        class4.field100 = class21.field490;
        class14.field338 = class39.field905;
        class39.field909 = class98.field2371;
        class14.field324 = field617;
        class94.field2286 = class99.field2402;
        class22.field539 = class113.field2745;
        class2.field66 = class106.field2544;
        class60.field1510 = class116.field2771;
        class17.field382 = class47.field1116;
        class139.field3363 = class1.field7;
        class83.field1968 = class10.field241;
        class106.field2561 = class4.field96;
        class35.field810 = class83.field1967;
        class95.field2298 = class135.field3254;
        class94.field2236 = class48.field1138;
        class124.field2962 = class108.field2618;
        class129.field3098 = class15.field357;
        class136.field3293 = class79.field1876;
        field587 = class104.field2504;
        class82.field1960 = class87.field2065;
        class1.field18 = class55.field1297;
        class95.field2309 = class84.field1999;
        class12.field283 = class60.field1532;
        class42.field971 = class56.field1360;
        class122.field2918 = class4.field104;
        class1.field4 = class98.field2365;
        class102.field2475 = class37.field854;
        class5.field123 = class93.field2203;
        class79.field1872 = class21.field502;
        class122.field2929 = class32.field758;
        class14.field322 = class39.field905;
        client.field531 = class128.field3092;
        class14.field339 = class39.field905;
        class56.field1348 = class90.field2114;
        class14.field315 = class50.field1192;
        class79.field1889 = class43.field1032;
        class14.field303 = class39.field905;
        class63.field1569 = class143.field3502;
        class107.field2578 = class101.field2444;
        class90.field2111 = field592;
        class139.field3382 = class17.field378;
        class14.field299 = class39.field905;
        class65.field1622 = class76.field1791;
        class57.field1409 = class50.field1198;
        class23.field570 = class101.field2441;
        class138.field3353 = class113.field2729;
        class2.field59 = class138.field3349;
        class79.field1874 = class126.field3000;
        class141.field3441 = class119.field2864;
        class38.field870 = class145.field3535;
        class146.field3550 = class135.field3245;
        client.field519 = class128.field3096;
        class139.field3383 = class34.field800;
        class3.field80 = class47.field1118;
        class98.field2368 = class30.field719;
        field607++;
        class83.field1971 = class102.field2478;
        class42.field976 = class40.field917;
        class103.field2496 = class29.field698;
        class83.field1972 = class145.field3512;
        class28.field675 = class69.field1713;
        class119.field2824 = class139.field3387;
        class151.field3717 = class102.field2462;
        class113.field2720 = class42.field998;
        class8.field150 = class30.field742;
        class78.field1836 = class3.field95;
        class38.field856 = class79.field1865;
        class44.field1081 = class82.field1931;
        field608 = class132.field3187;
        class14.field306 = class39.field905;
        class1.field1 = class2.field70;
        class130.field3121 = class29.field701;
        class47.field1120 = class34.field803;
        class14.field337 = class39.field905;
        class14.field313 = class46.field1109;
        class14.field325 = class87.field2063;
        class87.field2077 = class75.field1746;
        class14.field336 = class39.field905;
        class14.field310 = field617;
        class14.field326 = class39.field905;
        class28.field666 = client.field521;
        class136.field3295 = class99.field2380;
        class14.field328 = class120.field2904;
        class145.field3543 = class93.field2210;
        class14.field312 = class116.field2766;
        class119.field2889 = class52.field1224;
        if (arg0) {
            return;
        }
        class9.field175 = class35.field809;
        class82.field1948 = class68.field1685;
        class105.field2520 = class35.field817;
        class14.field311 = class120.field2904;
        class53.field1266 = class113.field2740;
        class102.field2459 = class9.field176;
        class30.field726 = class53.field1265;
        class141.field3421 = class123.field2941;
        class12.field281 = class86.field2054;
        class14.field319 = class69.field1712;
        class5.field122 = class57.field1392;
        class97.field2348 = class65.field1629;
        class26.field635 = class130.field3119;
        class12.field270 = class76.field1805;
        class138.field3352 = class90.field2121;
        class15.field356 = class125.field2992;
        class10.field253 = class1.field8;
        class152.field3756 = class12.field279;
        class107.field2571 = class38.field862;
        class148.field3685 = class148.field3680;
        class139.field3372 = class143.field3501;
        class111.field2704 = class108.field2589;
        class58.field1422 = class152.field3752;
        class5.field120 = class9.field165;
        class35.field821 = class109.field2651;
        class14.field321 = class39.field905;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lic;I)V")
    public final void method207(class59 arg0, int arg1) {
        arg0.method452(this.field594 ? 1 : 0, 255);
        field601++;
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field611[class130.field3124[var3]];
            if (var5 == 0) {
                arg0.method452(-1, 255);
            } else {
                arg0.method452(var5 - 256, 255);
            }
        }
        for (int var4 = arg1; var4 < 5; var4++) {
            arg0.method452(this.field614[var4], arg1 + 255);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V")
    public final void method208(int arg0, boolean arg1) {
        field586++;
        if (this.field594 != arg1) {
            this.method200(arg0, arg1, this.field614, null, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILma;Lma;I)Lna;")
    public final class91 method209(int arg0, int arg1, class84 arg2, class84 arg3, int arg4) {
        field602++;
        if (this.field600 != -1) {
            return class10.method55((byte) 124, this.field600).method415(arg2, (byte) 117, arg4, arg1, arg3);
        }
        long var6 = this.field604;
        int[] var8 = this.field611;
        if (arg3 != null && (arg3.field1995 >= 0 || arg3.field1979 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field611[var9];
            }
            if (arg3.field1995 >= 0) {
                var6 += arg3.field1995 - this.field611[5] << 8;
                var8[5] = arg3.field1995;
            }
            if (arg3.field1979 >= 0) {
                var6 += arg3.field1979 - this.field611[3] << 16;
                var8[3] = arg3.field1979;
            }
        }
        class91 var10 = (class91) class32.field757.method239(9325, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class2.method8(122, var21 - 256).method311(false)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class41.method306(-93, var21 - 512).method768(this.field594, (byte) 113)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field590 != -1L) {
                    var10 = (class91) class32.field757.method239(9325, this.field590);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class110[] var14 = new class110[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class110 var19 = class2.method8(-74, var18 - 256).method307(125);
                        if (var19 != null) {
                            var14[var13++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class110 var20 = class41.method306(-113, var18 - 512).method772(this.field594, (byte) 106);
                        if (var20 != null) {
                            var14[var13++] = var20;
                        }
                    }
                }
                class110 var16 = new class110(var14, var13);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field614[var17] != 0) {
                        var16.method904(class125.field2988[var17][0], class125.field2988[var17][this.field614[var17]]);
                        if (var17 == 1) {
                            var16.method904(class30.field725[0], class30.field725[this.field614[var17]]);
                        }
                    }
                }
                var10 = var16.method901(64, 850, -30, -50, -30);
                class32.field757.method241(var10, 0, var6);
                this.field590 = var6;
            }
        }
        if (arg0 > -108) {
            return null;
        } else if (arg3 == null && arg2 == null) {
            return var10;
        } else {
            class91 var22;
            if (arg3 != null && arg2 != null) {
                var22 = arg3.method653(arg4, arg1, -5926, var10, arg2);
            } else if (arg3 == null) {
                var22 = arg2.method647(var10, arg1, 65535);
            } else {
                var22 = arg3.method647(var10, arg4, 65535);
            }
            return var22;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Color;ZLu;)V")
    public static final void method210(int arg0, Color arg1, boolean arg2, class135 arg3) {
        field610++;
        try {
            Graphics var4 = class59.field1484.getGraphics();
            if (class29.field700 == null) {
                class29.field700 = new Font("Helvetica", 1, 13);
                class43.field1051 = class59.field1484.getFontMetrics(class29.field700);
            }
            if (class53.field1258) {
                class53.field1258 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class145.field3525, class60.field1530);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class50.field1196 == null) {
                    class50.field1196 = class59.field1484.createImage(304, 34);
                }
                if (!arg2) {
                    method201(-4);
                }
                Graphics var5 = class50.field1196.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class29.field700);
                var5.setColor(Color.white);
                arg3.method1085(var5, (304 - arg3.method1084(class43.field1051, 0)) / 2, -128, 22);
                var4.drawImage(class50.field1196, class145.field3525 / 2 - 152, class60.field1530 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class60.field1530 / 2 - 18;
                int var7 = class145.field3525 / 2 - 152;
                var4.setColor(arg1);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var6 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class29.field700);
                var4.setColor(Color.white);
                arg3.method1085(var4, var7 + (304 - arg3.method1084(class43.field1051, 0)) / 2, -128, var6 + 22);
            }
        } catch (Exception var9) {
            class59.field1484.repaint();
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lpf;")
    public final class110 method211(int arg0) {
        field612++;
        if (this.field600 != -1) {
            return class10.method55((byte) 124, this.field600).method417((byte) -124);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field611[var3];
            if (var12 >= 256 && var12 < 512 && !class2.method8(110, var12 - 256).method314(0)) {
                var2 = true;
            }
            if (var12 >= 512 && !class41.method306(-74, var12 - 512).method762((byte) -119, this.field594)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class110[] var4 = new class110[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field611[var6];
            if (var9 >= 256 && var9 < 512) {
                class110 var10 = class2.method8(-71, var9 - 256).method310(-27118);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class110 var11 = class41.method306(-65, var9 - 512).method766((byte) -51, this.field594);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        if (arg0 != 26515) {
            return null;
        }
        class110 var7 = new class110(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field614[var8] != 0) {
                var7.method904(class125.field2988[var8][0], class125.field2988[var8][this.field614[var8]]);
                if (var8 == 1) {
                    var7.method904(class30.field725[0], class30.field725[this.field614[var8]]);
                }
            }
        }
        return var7;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field597[var0] = var1;
        }
        field617 = class87.method676((byte) -111, "und loggen sich dann erneut ein)3");
        field618 = class87.method676((byte) -123, "Account locked as we suspect it has been stolen)3");
        field616 = field618;
        field620 = class87.method676((byte) -97, "@yel@");
        field619 = class87.method676((byte) -92, "redstone2");
        field621 = new int[128];
    }
}
