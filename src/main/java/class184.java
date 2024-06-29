import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class184 {

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    private int field3501 = -1;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    private int field3509 = 0;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lvb;")
    private class192 field3513 = new class192();

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Z")
    public boolean field3516 = false;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[Lwf;")
    private class205[] field3499;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    private int field3512;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    private int field3498;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[[I")
    private int[][] field3496;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lai;")
    public static class10 field3497 = class44.method278("Bitte geben Sie Ihren Benutzenamen ein)3", 122);

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lai;")
    public static class10 field3494 = class44.method278("Bitte versuchen Sie es erneut)3", 122);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lai;")
    public static class10 field3502 = class44.method278("<)4col>", 102);

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
    public static boolean field3507 = false;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Lai;")
    public static class10 field3514 = class44.method278(":clan:", 122);

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lai;")
    public static class10 field3510 = class44.method278(" )2>", -68);

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3493 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Llb;")
    public static class102 field3508;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[Lta;")
    public static class173[] field3492;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method1185(boolean arg0) {
        class108.field2014 = 0;
        class34.field532 = 0;
        class49.method347(-72);
        if (arg0) {
            field3500 = 81;
        }
        field3515++;
        class38.method255(-28);
        class56.method384(-3);
        for (int var1 = 0; var1 < class108.field2014; var1++) {
            int var3 = class42.field703[var1];
            if (class120.field2304 != class168.field3249[var3].field1085) {
                class168.field3249[var3].field2386 = null;
                class168.field3249[var3] = null;
            }
        }
        if (class154.field2972 != class74.field1273.field2170) {
            throw new RuntimeException("gnp1 pos:" + class74.field1273.field2170 + " psize:" + class154.field2972);
        }
        for (int var2 = 0; var2 < class93.field1690; var2++) {
            if (class168.field3249[class166.field3187[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class93.field1690);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
    public final int[] method1186(byte arg0, int arg1) {
        if (arg0 != -114) {
            return null;
        }
        field3504++;
        if (this.field3512 == this.field3498) {
            this.field3516 = this.field3499[arg1] == null;
            this.field3499[arg1] = class4.field39;
            return this.field3496[arg1];
        } else if (this.field3512 == 1) {
            this.field3516 = this.field3501 != arg1;
            this.field3501 = arg1;
            return this.field3496[0];
        } else {
            class205 var3 = this.field3499[arg1];
            if (this.field3516 = var3 == null) {
                if (this.field3509 >= this.field3512) {
                    class205 var4 = (class205) this.field3513.method1219(-14190);
                    var3 = new class205(arg1, var4.field3975);
                    this.field3499[var4.field3982] = null;
                    var4.method848(false);
                } else {
                    var3 = new class205(arg1, this.field3509);
                    this.field3509++;
                }
                this.field3499[arg1] = var3;
            }
            this.field3513.method1231((byte) -27, var3);
            return this.field3496[var3.field3975];
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)[[I")
    public final int[][] method1187(int arg0) {
        field3491++;
        if (this.field3512 != this.field3498) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3512; var2++) {
            this.field3499[var2] = class4.field39;
        }
        return this.field3496;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public final void method1188(int arg0) {
        if (arg0 < 80) {
            field3511 = 84;
        }
        for (int var2 = 0; var2 < this.field3512; var2++) {
            this.field3496[var2] = null;
        }
        field3503++;
        this.field3496 = null;
        this.field3499 = null;
        this.field3513.method1224((byte) 24);
        this.field3513 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Leh;")
    public static final class47 method1189(int arg0, int arg1) {
        class47 var2 = (class47) class94.field1742.method222(114, (long) arg0);
        field3495++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field2347.method159((byte) -83, arg0, arg1);
        class47 var4 = new class47();
        var4.field830 = arg0;
        if (var3 != null) {
            var4.method300(new class114(var3), arg1 - 6);
        }
        var4.method294(1);
        if (var4.field807) {
            var4.field789 = 0;
            var4.field825 = false;
        }
        class94.field1742.method225(-21284, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
    public static void method1190(boolean arg0) {
        field3494 = null;
        field3510 = null;
        field3497 = null;
        field3492 = null;
        field3502 = null;
        if (arg0) {
            method1189(93, -87);
        }
        field3508 = null;
        field3514 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static final void method1191(int arg0) {
        class158.field3048 = 0L;
        class170.field3281 = 0;
        class160.field3079 = true;
        class96.field1772 = true;
        class42.field701.field1957 = 0;
        field3505++;
        class57.method385(-1);
        class37.field584 = 0;
        class162.field3111 = -1;
        class155.field3001 = 0;
        class93.field1687 = 0;
        class131.field2478 = 0;
        class163.field3130 = 0;
        class192.field3647 = 0;
        class10.field126 = 0;
        client.field447 = 0;
        class97.field1779 = 0;
        class129.field2456 = 0;
        class149.field2869 = 0;
        class27.field400 = 0;
        class10.field155 = 0;
        class193.field3671 = 0;
        class102.field1915 = 0;
        class206.field3998 = 0;
        class148.field2828 = 0;
        class64.field1060 = 0;
        class20.field302 = 0;
        class91.field1610 = 0;
        class203.field3963 = 0;
        class2.field15 = 0;
        class114.field2174 = 0;
        class64.field1075 = 0;
        class78.field1381 = 0;
        class144.field2739 = 0;
        class179.field3392 = 0;
        class65.field1124 = 0;
        class77.field1331 = 0;
        class87.field1539 = 0;
        class21.field330 = 0;
        class47.field790 = 0;
        class19.field287 = 0;
        class172.field3323 = 0;
        class85.field1511 = 0;
        class2.field14 = 0;
        class102.field1913 = 0;
        class168.field3240 = 0;
        class34.field526 = 0;
        class192.field3639 = 0;
        class142.field2686 = 0;
        class10.field133 = 0;
        class47.field785 = 0;
        class159.field3058 = 0;
        class146.field2794 = 0;
        class75.field1300 = 0;
        class124.field2375 = 0;
        class130.field2461 = 0;
        class100.field1864 = 0;
        class117.field2252 = 0;
        class144.field2716 = 0;
        class100.field1861 = 0;
        class114.field2138 = 0;
        class11.field188 = 0;
        class76.field1315 = 0;
        class140.field2636 = 0;
        class41.field678 = 0;
        class205.field3992 = 0;
        class190.field3618 = 0;
        class10.field159 = 0;
        class10.field165 = 0;
        class117.field2243 = 0;
        class25.field379 = 0;
        class114.field2147 = 0;
        class193.field3666 = 0;
        class21.field333 = 0;
        class38.field595 = 0;
        class99.field1834 = 0;
        class124.field2372 = 0;
        class108.field2006 = 0;
        class96.field1766 = 0;
        class36.field574 = 0;
        class30.field463 = 0;
        class179.field3401 = 0;
        class100.field1850 = 0;
        class54.field974 = 0;
        class10.field168 = 0;
        class47.field794 = 0;
        class192.field3646 = 0;
        class83.field1447 = 0;
        class44.field722 = 0;
        class79.field1393 = 0;
        class84.field1464 = 0;
        class42.field686 = 0;
        class77.field1329 = 0;
        class3.field26 = 0;
        class180.field3425 = 0;
        class141.field2654 = 0;
        class32.field479 = 0;
        class30.field458 = 0;
        class157.field3039 = 0;
        class144.field2738 = 0;
        class144.field2735 = 0;
        class93.field1677 = 0;
        class45.field739 = 0;
        class34.field519 = 0;
        class33.field497 = 0;
        class130.field2468 = 0;
        class54.field965 = 0;
        class114.field2133 = 0;
        class145.field2779 = 0;
        class68.field1195 = 0;
        class35.field548 = 0;
        class200.field3900 = 0;
        class136.field2561 = 0;
        class206.field4023 = 0;
        class122.field2340 = 0;
        class21.field315 = 0;
        class38.field604 = 0;
        class49.field865 = 0;
        class27.field405 = 0;
        class7.field95 = 0;
        class144.field2702 = 0;
        class206.field4026 = 0;
        class180.field3435 = 0;
        class195.field3705 = 0;
        class108.field1994 = 0;
        class82.field1431 = 0;
        class67.field1180 = 0;
        class68.field1193 = 0;
        class37.field581 = 0;
        class44.field727 = 0;
        class34.field513 = 0;
        class67.field1167 = 0;
        class94.field1716 = 0;
        class144.field2722 = 0;
        class87.field1544 = 0;
        class182.field3472 = 0;
        class151.field2904 = 0;
        class144.field2728 = 0;
        class144.field2755 = 0;
        class94.field1724 = 0;
        class97.field1777 = 0;
        class53.field936 = 0;
        class45.field731 = 0;
        class14.field225 = 0;
        class191.field3632 = 0;
        class125.field2394 = 0;
        class84.field1463 = 0;
        class94.field1699 = 0;
        class186.field3532 = 0;
        class207.field4035 = 0;
        class160.field3078 = 0;
        class163.field3118 = 0;
        client.field442 = 0;
        class126.field2398 = 0;
        class180.field3451 = 0;
        class175.field3367 = 0;
        class183.field3481 = 0;
        class10.field138 = 0;
        class168.field3241 = 0;
        class82.field1436 = 0;
        class21.field336 = 0;
        class179.field3414 = 0;
        class50.field893 = 0;
        class153.field2927 = 0;
        class94.field1712 = 0;
        class10.field122 = 0;
        class32.field476 = 0;
        class114.field2159 = 0;
        class97.field1791 = 0;
        class11.field203 = 0;
        class84.field1467 = 0;
        class21.field316 = 0;
        class117.field2242 = 0;
        class149.field2870 = 0;
        class193.field3680 = 0;
        class193.field3684 = 0;
        class111.field2044 = 0;
        class11.field190 = 0;
        class152.field2923 = 0;
        class7.field85 = 0;
        class28.field424 = 0;
        class180.field3423 = 0;
        class119.field2290 = 0;
        class49.field870 = 0;
        class94.field1698 = 0;
        class136.field2558 = 0;
        class79.field1390 = 0;
        client.field456 = 0;
        class76.field1314 = 0;
        class98.field1811 = 0;
        class45.field743 = 0;
        class10.field124 = 0;
        class27.field410 = 0;
        class97.field1789 = 0;
        class100.field1878 = 0;
        class7.field90 = 0;
        class192.field3648 = 0;
        class147.field2809 = 0;
        class38.field613 = 0;
        class151.field2908 = 0;
        class185.field3522 = 0;
        class25.field386 = 0;
        class206.field4000 = 0;
        class154.field2967 = 0;
        class180.field3457 = 0;
        class67.field1182 = 0;
        class201.field3938 = 0;
        class124.field2370 = 0;
        class114.field2167 = 0;
        class76.field1319 = 0;
        class75.field1296 = 0;
        class166.field3181 = 0;
        class97.field1790 = 0;
        class108.field2019 = 0;
        class104.field1945 = 0;
        class115.field2210 = 0;
        class13.field213 = 0;
        client.field441 = 0;
        class135.field2527 = 0;
        class58.field1012 = 0;
        class114.field2158 = 0;
        class21.field313 = 0;
        class174.field3354 = 0;
        class32.field488 = 0;
        class192.field3633 = 0;
        class114.field2140 = 0;
        class200.field3869 = 0;
        class33.field509 = 0;
        class163.field3123 = 0;
        class165.field3155 = 0;
        class180.field3447 = 0;
        class77.field1348 = 0;
        class78.field1373 = 0;
        class93.field1670 = 0;
        class55.field984 = 0;
        class85.field1503 = 0;
        class89.field1558 = 0;
        class117.field2255 = 0;
        class166.field3177 = 0;
        class89.field1566 = 0;
        class94.field1708 = 0;
        class49.field868 = 0;
        class87.field1543 = 0;
        class168.field3250 = 0;
        class136.field2560 = 0;
        class144.field2695 = 0;
        class49.field859 = 0;
        class129.field2451 = 0;
        class35.field543 = 0;
        class180.field3439 = 0;
        class10.field132 = 0;
        class71.field1211 = 0;
        class196.field3715 = 0;
        class137.field2574 = 0;
        class205.field3978 = 0;
        class193.field3683 = 0;
        class47.field834 = 0;
        class114.field2184 = 0;
        class182.field3467 = 0;
        class153.field2939 = 0;
        class30.field462 = 0;
        class193.field3669 = 0;
        class200.field3882 = 0;
        class85.field1525 = 0;
        class180.field3430 = 0;
        class89.field1562 = 0;
        class96.field1774 = 0;
        class77.field1344 = 0;
        class192.field3643 = 0;
        class46.field766 = 0;
        class42.field695 = 0;
        class49.field874 = 0;
        class137.field2572 = 0;
        class21.field326 = 0;
        class200.field3861 = 0;
        class11.field176 = 0;
        class10.field121 = 0;
        class144.field2710 = 0;
        class21.field339 = 0;
        class24.field359 = 0;
        class87.field1552 = 0;
        class33.field496 = 0;
        class32.field489 = 0;
        class96.field1760 = 0;
        class67.field1168 = 0;
        class70.field1204 = 0;
        class10.field169 = 0;
        class135.field2535 = 0;
        class188.field3574 = 0;
        class34.field531 = 0;
        class24.field361 = 0;
        class117.field2259 = 0;
        class206.field4006 = 0;
        class108.field2016 = 0;
        class109.field2030 = 0;
        class192.field3650 = 0;
        class13.field207 = 0;
        class180.field3421 = 0;
        class207.field4047 = 0;
        class172.field3333 = 0;
        class40.field665 = 0;
        class3.field22 = 0;
        class80.field1403 = 0;
        class196.field3712 = 0;
        class128.field2422 = 0;
        class82.field1427 = 0;
        class30.field464 = 0;
        class58.field1016 = 0;
        class35.field549 = 0;
        class188.field3579 = 0;
        class180.field3450 = 0;
        class42.field691 = 0;
        class180.field3434 = 0;
        class200.field3776 = 0;
        class100.field1877 = 0;
        class115.field2201 = 0;
        class114.field2183 = 0;
        class21.field308 = 0;
        class9.field102 = 0;
        class133.field2500 = 0;
        class114.field2156 = 0;
        class73.field1250 = 0;
        class100.field1867 = 0;
        class151.field2916 = 0;
        class6.field71 = 0;
        class111.field2041 = 0;
        class144.field2740 = 0;
        class206.field4011 = 0;
        class29.field429 = 0;
        class14.field228 = 0;
        class158.field3051 = 0;
        class144.field2744 = 0;
        class50.field878 = 0;
        field3515 = 0;
        class129.field2458 = 0;
        class139.field2619 = 0;
        class170.field3286 = 0;
        class191.field3627 = 0;
        class116.field2221 = 0;
        class126.field2405 = 0;
        class159.field3061 = 0;
        class10.field157 = 0;
        class71.field1224 = 0;
        class44.field714 = 0;
        class168.field3235 = 0;
        class117.field2245 = 0;
        class19.field293 = 0;
        class172.field3321 = 0;
        class106.field1975 = 0;
        class100.field1862 = 0;
        class85.field1526 = 0;
        class191.field3624 = 0;
        class165.field3158 = 0;
        class117.field2256 = 0;
        client.field453 = 0;
        class145.field2780 = 0;
        class75.field1278 = 0;
        class10.field166 = 0;
        class188.field3590 = 0;
        class91.field1609 = 0;
        class106.field1973 = 0;
        class24.field362 = 0;
        class68.field1186 = 0;
        class146.field2783 = 0;
        class192.field3642 = 0;
        class20.field300 = 0;
        class144.field2701 = 0;
        class117.field2264 = 0;
        class180.field3422 = 0;
        class162.field3110 = 0;
        class119.field2286 = 0;
        class78.field1366 = 0;
        class153.field2964 = 0;
        class123.field2351 = 0;
        class125.field2384 = 0;
        class120.field2316 = 0;
        class155.field2993 = 0;
        class45.field740 = 0;
        class87.field1540 = 0;
        class58.field1013 = 0;
        class96.field1765 = 0;
        class75.field1287 = 0;
        class180.field3427 = 0;
        class147.field2805 = 0;
        class75.field1277 = 0;
        class21.field344 = 0;
        class119.field2293 = 0;
        class80.field1404 = 0;
        class104.field1942 = 0;
        class206.field4014 = 0;
        class206.field4025 = 0;
        class89.field1563 = 0;
        class180.field3419 = 0;
        class116.field2228 = 0;
        class77.field1340 = 0;
        class180.field3426 = 0;
        class100.field1859 = 0;
        class11.field195 = 0;
        class76.field1313 = 0;
        class134.field2515 = 0;
        class109.field2022 = 0;
        class72.field1233 = 0;
        class142.field2687 = 0;
        class124.field2367 = 0;
        class151.field2899 = 0;
        class100.field1863 = 0;
        class91.field1595 = 0;
        class114.field2155 = 0;
        class66.field1147 = 0;
        class137.field2570 = 0;
        class10.field146 = 0;
        class144.field2700 = 0;
        class139.field2626 = 0;
        class116.field2229 = 0;
        class11.field191 = 0;
        class6.field73 = 0;
        class195.field3703 = 0;
        class144.field2715 = 0;
        class136.field2554 = 0;
        class68.field1200 = 0;
        field3504 = 0;
        class135.field2537 = 0;
        class45.field733 = 0;
        class98.field1800 = 0;
        class114.field2145 = 0;
        class159.field3071 = 0;
        class192.field3645 = 0;
        class87.field1541 = 0;
        class42.field699 = 0;
        class46.field750 = 0;
        class121.field2326 = 0;
        class82.field1432 = 0;
        class180.field3443 = 0;
        class102.field1907 = 0;
        class118.field2278 = 0;
        class47.field811 = 0;
        class183.field3485 = 0;
        class10.field151 = 0;
        class190.field3623 = 0;
        class200.field3857 = 0;
        class144.field2729 = 0;
        class1.field5 = 0;
        class168.field3239 = 0;
        field3503 = 0;
        class87.field1537 = 0;
        class24.field360 = 0;
        class201.field3946 = 0;
        class195.field3701 = 0;
        class20.field303 = 0;
        class206.field4002 = 0;
        class193.field3665 = 0;
        class64.field1076 = 0;
        class193.field3686 = 0;
        client.field440 = 0;
        class188.field3576 = 0;
        class188.field3582 = 0;
        class49.field872 = 0;
        class144.field2706 = 0;
        class175.field3360 = 0;
        class116.field2226 = 0;
        class75.field1297 = 0;
        class169.field3262 = 0;
        class97.field1796 = 0;
        class155.field2991 = 0;
        class116.field2238 = 0;
        class140.field2637 = 0;
        class33.field500 = 0;
        class77.field1335 = 0;
        class4.field44 = 0;
        class114.field2187 = 0;
        class123.field2353 = 0;
        class96.field1771 = 0;
        class26.field394 = 0;
        class169.field3261 = 0;
        class114.field2185 = 0;
        class68.field1191 = 0;
        class10.field148 = 0;
        class56.field990 = 0;
        class180.field3441 = 0;
        class144.field2741 = 0;
        class37.field583 = 0;
        class7.field83 = 0;
        class165.field3172 = 0;
        class114.field2191 = 0;
        class144.field2703 = 0;
        class53.field959 = 0;
        class91.field1593 = 0;
        class147.field2807 = 0;
        class100.field1875 = 0;
        class94.field1729 = 0;
        class200.field3910 = 0;
        class200.field3908 = 0;
        class104.field1941 = 0;
        class185.field3517 = 0;
        class100.field1851 = 0;
        class142.field2674 = 0;
        class6.field68 = 0;
        class97.field1783 = 0;
        class54.field970 = 0;
        class28.field425 = 0;
        class25.field383 = 0;
        class142.field2676 = 0;
        class192.field3640 = 0;
        class9.field108 = 0;
        class30.field465 = 0;
        class139.field2618 = 0;
        class116.field2237 = 0;
        class128.field2420 = 0;
        class145.field2768 = 0;
        class201.field3940 = 0;
        field3505 = 0;
        class169.field3268 = 0;
        class126.field2403 = 0;
        class144.field2696 = 0;
        class147.field2806 = 0;
        class47.field816 = 0;
        class10.field140 = 0;
        class114.field2177 = 0;
        class111.field2052 = 0;
        class155.field2996 = 0;
        class106.field1977 = 0;
        class74.field1267 = 0;
        class42.field690 = 0;
        class207.field4043 = 0;
        class145.field2765 = 0;
        class89.field1560 = 0;
        class135.field2529 = 0;
        class142.field2680 = 0;
        class78.field1382 = 0;
        class168.field3243 = 0;
        class34.field522 = 0;
        class126.field2401 = 0;
        class119.field2300 = 0;
        class172.field3335 = 0;
        class192.field3636 = 0;
        class144.field2704 = 0;
        class154.field2966 = 0;
        class95.field1750 = 0;
        class91.field1600 = 0;
        field3495 = 0;
        class114.field2154 = 0;
        class43.field711 = 0;
        class200.field3840 = 0;
        class153.field2944 = 0;
        class106.field1962 = 0;
        class116.field2215 = 0;
        class190.field3620 = 0;
        class21.field306 = 0;
        class114.field2152 = 0;
        class203.field3959 = 0;
        class144.field2737 = 0;
        class114.field2189 = 0;
        class7.field81 = 0;
        class2.field12 = 0;
        class68.field1196 = 0;
        class144.field2745 = 0;
        class56.field998 = 0;
        class142.field2672 = 0;
        class129.field2445 = 0;
        class139.field2630 = 0;
        class126.field2399 = 0;
        class57.field1002 = 0;
        class163.field3128 = 0;
        class76.field1321 = 0;
        class111.field2047 = 0;
        class43.field713 = 0;
        class142.field2675 = 0;
        class106.field1979 = 0;
        class182.field3465 = 0;
        class206.field3996 = 0;
        class180.field3437 = 0;
        class114.field2137 = 0;
        class7.field84 = 0;
        class27.field397 = 0;
        class10.field154 = 0;
        class114.field2173 = 0;
        class144.field2752 = 0;
        class174.field3352 = 0;
        class172.field3320 = 0;
        class165.field3156 = 0;
        class182.field3474 = 0;
        class42.field692 = 0;
        class28.field417 = 0;
        class180.field3424 = 0;
        class146.field2792 = 0;
        class146.field2788 = 0;
        class101.field1883 = 0;
        class114.field2196 = 0;
        class77.field1334 = 0;
        class166.field3184 = 0;
        class123.field2355 = 0;
        class190.field3621 = 0;
        class34.field523 = 0;
        class126.field2408 = 0;
        class114.field2179 = 0;
        class119.field2288 = 0;
        class10.field117 = 0;
        class114.field2166 = 0;
        class74.field1262 = 0;
        class193.field3678 = 0;
        class44.field716 = 0;
        class142.field2669 = 0;
        class10.field137 = 0;
        class207.field4034 = 0;
        class47.field819 = 0;
        class97.field1780 = 0;
        class25.field380 = 0;
        class135.field2538 = 0;
        class146.field2799 = 0;
        class125.field2387 = 0;
        class39.field657 = 0;
        class43.field706 = 0;
        class77.field1345 = 0;
        class94.field1727 = 0;
        class172.field3331 = 0;
        class124.field2369 = 0;
        class101.field1881 = 0;
        class120.field2301 = 0;
        class10.field116 = 0;
        class44.field726 = 0;
        class206.field4029 = 0;
        class114.field2162 = 0;
        class24.field369 = 0;
        class82.field1437 = 0;
        class53.field963 = 0;
        class97.field1786 = 0;
        class6.field74 = 0;
        class107.field1980 = 0;
        class207.field4045 = 0;
        class36.field572 = 0;
        field3491 = 0;
        class55.field978 = 0;
        class56.field988 = 0;
        class196.field3708 = 0;
        class46.field762 = 0;
        class122.field2343 = 0;
        class129.field2442 = 0;
        class93.field1679 = 0;
        class47.field774 = 0;
        class151.field2910 = 0;
        class145.field2771 = 0;
        class109.field2031 = 0;
        class114.field2176 = 0;
        class10.field141 = 0;
        class47.field801 = 0;
        class76.field1312 = 0;
        class104.field1943 = 0;
        class141.field2648 = 0;
        class76.field1318 = 0;
        class21.field332 = 0;
        class42.field683 = 0;
        class102.field1916 = 0;
        class111.field2040 = 0;
        class158.field3041 = 0;
        class147.field2803 = 0;
        class41.field680 = 0;
        class97.field1778 = 0;
        class144.field2724 = 0;
        class174.field3347 = 0;
        class104.field1946 = 0;
        class57.field999 = 0;
        class129.field2453 = 0;
        class96.field1768 = 0;
        class67.field1163 = 0;
        class78.field1364 = 0;
        class193.field3685 = 0;
        class115.field2200 = 0;
        class180.field3440 = 0;
        class38.field612 = 0;
        class154.field2979 = 0;
        class203.field3955 = 0;
        class21.field340 = 0;
        class166.field3180 = 0;
        class135.field2528 = 0;
        class45.field729 = 0;
        class180.field3420 = 0;
        class114.field2135 = 0;
        class160.field3074 = 0;
        class136.field2548 = 0;
        class98.field1815 = 0;
        class36.field564 = 0;
        class28.field427 = 0;
        class53.field948 = 0;
        client.field454 = 0;
        class206.field4005 = 0;
        class79.field1394 = 0;
        class114.field2178 = 0;
        class183.field3479 = 0;
        class114.field2192 = 0;
        class19.field274 = 0;
        class183.field3484 = 0;
        class21.field319 = 0;
        class36.field579 = 0;
        client.field446 = 0;
        class74.field1270 = 0;
        class180.field3429 = 0;
        class154.field2989 = 0;
        class137.field2568 = 0;
        class176.field3369 = 0;
        class100.field1856 = 0;
        class107.field1981 = 0;
        class10.field120 = 0;
        class123.field2352 = 0;
        class56.field993 = 0;
        class82.field1435 = 0;
        class27.field411 = 0;
        class107.field1988 = 0;
        class27.field412 = 0;
        class21.field305 = 0;
        class25.field374 = 0;
        class45.field734 = 0;
        class42.field689 = 0;
        class72.field1243 = 0;
        class38.field596 = 0;
        class30.field461 = 0;
        class85.field1484 = 0;
        class180.field3436 = 0;
        class147.field2804 = 0;
        class179.field3404 = 0;
        class135.field2534 = 0;
        class117.field2253 = 0;
        class140.field2641 = 0;
        class157.field3036 = 0;
        class10.field158 = 0;
        class111.field2042 = 0;
        class114.field2188 = 0;
        class15.field235 = 0;
        class114.field2141 = 0;
        class76.field1316 = 0;
        class135.field2524 = 0;
        class27.field403 = 0;
        class106.field1970 = 0;
        class21.field310 = 0;
        class136.field2556 = 0;
        class163.field3129 = 0;
        class121.field2327 = 0;
        class10.field115 = 0;
        class114.field2148 = 0;
        class13.field217 = 0;
        class192.field3637 = 0;
        class35.field539 = 0;
        class65.field1129 = 0;
        class180.field3416 = 0;
        class10.field161 = 0;
        class180.field3442 = 0;
        class121.field2337 = 0;
        client.field438 = 0;
        class7.field82 = 0;
        class180.field3433 = 0;
        class68.field1187 = 0;
        class29.field434 = 0;
        class42.field696 = 0;
        class45.field738 = 0;
        class118.field2285 = 0;
        class189.field3605 = 0;
        class114.field2149 = 0;
        class142.field2685 = 0;
        class10.field128 = 0;
        class116.field2236 = 0;
        class144.field2732 = 0;
        class28.field416 = 0;
        class180.field3444 = 0;
        class206.field3997 = 0;
        class70.field1202 = 0;
        class11.field192 = 0;
        class108.field2007 = 0;
        class27.field398 = 0;
        class104.field1949 = 0;
        class65.field1102 = 0;
        client.field450 = 0;
        class136.field2550 = 0;
        class125.field2389 = 0;
        class10.field153 = 0;
        class133.field2504 = 0;
        class182.field3464 = 0;
        class114.field2164 = 0;
        class15.field238 = 0;
        class129.field2455 = 0;
        class189.field3604 = 0;
        class111.field2050 = 0;
        class10.field150 = 0;
        class182.field3469 = 0;
        client.field445 = 0;
        class180.field3438 = 0;
        class193.field3682 = 0;
        class123.field2363 = 0;
        class139.field2617 = 0;
        class56.field991 = 0;
        class43.field709 = 0;
        class207.field4036 = 0;
        class58.field1017 = 0;
        class107.field1983 = 0;
        class107.field1982 = 0;
        class121.field2325 = 0;
        class144.field2736 = 0;
        class40.field669 = 0;
        class116.field2232 = 0;
        class27.field408 = 0;
        class55.field976 = 0;
        class11.field173 = 0;
        class66.field1150 = 0;
        class96.field1763 = 0;
        class116.field2225 = 0;
        class117.field2263 = 0;
        class85.field1515 = 0;
        class117.field2244 = 0;
        class94.field1717 = 0;
        class188.field3560 = 0;
        class97.field1794 = 0;
        class126.field2396 = 0;
        class47.field805 = 0;
        class136.field2566 = 0;
        class174.field3358 = 0;
        class78.field1365 = 0;
        class10.field142 = 0;
        class115.field2203 = 0;
        class162.field3104 = 0;
        class144.field2734 = 0;
        class32.field487 = 0;
        class94.field1723 = 0;
        class21.field321 = 0;
        class25.field376 = 0;
        class30.field467 = 0;
        class129.field2454 = 0;
        class14.field233 = 0;
        class49.field869 = 0;
        class136.field2565 = 0;
        class114.field2194 = 0;
        class14.field223 = 0;
        class100.field1870 = 0;
        class77.field1336 = 0;
        class97.field1781 = 0;
        class79.field1391 = 0;
        class176.field3376 = 0;
        class33.field498 = 0;
        class58.field1011 = 0;
        class49.field866 = 0;
        class32.field491 = 0;
        class117.field2260 = 0;
        class91.field1592 = 0;
        class117.field2251 = 0;
        class160.field3072 = 0;
        class114.field2132 = 0;
        class206.field4010 = 0;
        class21.field341 = 0;
        class183.field3487 = 0;
        class49.field855 = 0;
        class114.field2150 = 0;
        class68.field1192 = 0;
        class47.field814 = 0;
        class47.field828 = 0;
        class172.field3326 = 0;
        class180.field3456 = 0;
        class116.field2222 = 0;
        class74.field1271 = 0;
        class63.field1056 = 0;
        class65.field1123 = 0;
        class120.field2302 = 0;
        class153.field2949 = 0;
        class126.field2397 = 0;
        class201.field3933 = 0;
        class122.field2345 = 0;
        class32.field475 = 0;
        class186.field3531 = 0;
        class67.field1170 = 0;
        class36.field576 = 0;
        class151.field2894 = 0;
        class152.field2921 = 0;
        class73.field1252 = 0;
        class10.field167 = 0;
        class91.field1608 = 0;
        class65.field1107 = 0;
        class153.field2951 = 0;
        class186.field3547 = 0;
        class99.field1822 = 0;
        class67.field1164 = 0;
        class159.field3055 = 0;
        class18.field268 = 0;
        class50.field888 = 0;
        class192.field3634 = 0;
        class102.field1909 = 0;
        class65.field1078 = 0;
        class114.field2165 = 0;
        class141.field2649 = 0;
        class84.field1468 = 0;
        class192.field3644 = 0;
        class10.field163 = 0;
        class28.field419 = 0;
        class84.field1466 = 0;
        class47.field773 = 0;
        class179.field3394 = 0;
        class34.field517 = 0;
        class114.field2186 = 0;
        class139.field2628 = 0;
        class142.field2691 = 0;
        class35.field545 = 0;
        class111.field2045 = 0;
        class169.field3263 = 0;
        class65.field1113 = 0;
        class65.field1144 = 0;
        class77.field1332 = 0;
        class114.field2195 = 0;
        class67.field1171 = 0;
        class49.field857 = 0;
        class38.field607 = 0;
        class111.field2039 = 0;
        class158.field3040 = 0;
        class124.field2366 = 0;
        class46.field758 = 0;
        class182.field3473 = 0;
        class203.field3953 = 0;
        class133.field2495 = 0;
        class114.field2142 = 0;
        class5.field64 = 0;
        class157.field3033 = 0;
        class179.field3393 = 0;
        class129.field2457 = 0;
        class200.field3884 = 0;
        class21.field347 = 0;
        class192.field3635 = 0;
        class114.field2134 = 0;
        class118.field2277 = 0;
        class13.field214 = 0;
        class104.field1954 = 0;
        class102.field1911 = 0;
        class151.field2903 = 0;
        class87.field1549 = 0;
        class64.field1063 = 0;
        class66.field1152 = 0;
        class97.field1784 = 0;
        class186.field3543 = 0;
        class129.field2449 = 0;
        class84.field1461 = 0;
        class116.field2239 = 0;
        class174.field3348 = 0;
        class10.field145 = 0;
        class34.field533 = 0;
        class188.field3584 = 0;
        class21.field307 = 0;
        class18.field267 = 0;
        class180.field3453 = 0;
        class137.field2576 = 0;
        class97.field1782 = 0;
        class114.field2163 = 0;
        class201.field3948 = 0;
        class157.field3034 = 0;
        class193.field3677 = 0;
        class108.field1996 = 0;
        class147.field2802 = 0;
        class144.field2742 = 0;
        class30.field466 = 0;
        class43.field705 = 0;
        class158.field3043 = 0;
        class77.field1357 = 0;
        class171.field3305 = 0;
        class162.field3109 = 0;
        class136.field2559 = 0;
        class174.field3350 = 0;
        client.field439 = 0;
        class147.field2811 = 0;
        class85.field1517 = 0;
        class96.field1767 = 0;
        class117.field2248 = 0;
        class114.field2190 = 0;
        class121.field2320 = 0;
        class47.field778 = 0;
        class66.field1157 = 0;
        class85.field1483 = 0;
        class147.field2801 = 0;
        class36.field562 = 0;
        class185.field3524 = 0;
        class46.field768 = 0;
        class114.field2168 = 0;
        class152.field2922 = 0;
        class129.field2450 = 0;
        class111.field2049 = 0;
        class21.field328 = 0;
        class14.field231 = 0;
        class10.field135 = 0;
        class180.field3449 = 0;
        class36.field559 = 0;
        class10.field127 = 0;
        class10.field164 = 0;
        class25.field381 = 0;
        class75.field1291 = 0;
        class26.field390 = 0;
        class154.field2970 = 0;
        class114.field2151 = 0;
        class154.field2971 = 0;
        class83.field1448 = 0;
        class179.field3398 = 0;
        class117.field2250 = 0;
        class27.field401 = 0;
        class80.field1401 = 0;
        class15.field253 = 0;
        class47.field777 = 0;
        class55.field983 = 0;
        class1.field2 = 0;
        class137.field2578 = 0;
        class171.field3312 = 0;
        class144.field2750 = 0;
        class206.field4003 = 0;
        class141.field2652 = 0;
        if (arg0 != 23606) {
            field3497 = null;
        }
        class147.field2808 = 0;
        class117.field2267 = 0;
        class58.field1023 = 0;
        class149.field2868 = 0;
        class193.field3672 = 0;
        class195.field3699 = 0;
        class114.field2136 = 0;
        class68.field1188 = 0;
        class193.field3676 = 0;
        class160.field3075 = 0;
        class100.field1874 = 0;
        class135.field2543 = 0;
        class180.field3458 = 0;
        class21.field327 = 0;
        class157.field3037 = 0;
        class27.field399 = 0;
        class200.field3779 = 0;
        class57.field1001 = 0;
        class144.field2749 = 0;
        class33.field512 = 0;
        class57.field1005 = 0;
        class34.field527 = 0;
        class94.field1740 = 0;
        class145.field2773 = 0;
        class128.field2434 = 0;
        class10.field134 = 0;
        class85.field1501 = 0;
        class114.field2139 = 0;
        class75.field1281 = 0;
        class151.field2913 = 0;
        class142.field2665 = 0;
        class114.field2131 = 0;
        class144.field2718 = 0;
        class193.field3673 = 0;
        class144.field2730 = 0;
        class10.field144 = 0;
        class83.field1458 = 0;
        class114.field2181 = 0;
        class72.field1237 = 0;
        class114.field2172 = 0;
        class66.field1159 = 0;
        class200.field3793 = 0;
        class133.field2503 = 0;
        class114.field2169 = 0;
        class21.field346 = 0;
        class76.field1310 = 0;
        class96.field1769 = 0;
        class49.field863 = 0;
        class130.field2463 = 0;
        class106.field1978 = 0;
        class182.field3475 = 0;
        class191.field3628 = 0;
        class96.field1764 = 0;
        class144.field2693 = 0;
        class185.field3526 = 0;
        class97.field1788 = 0;
        class172.field3334 = 0;
        class179.field3399 = 0;
        class34.field530 = 0;
        class148.field2826 = 0;
        class29.field428 = 0;
        class180.field3445 = 0;
        class94.field1720 = 0;
        class200.field3912 = 0;
        class10.field143 = 0;
        class206.field4019 = 0;
        class124.field2373 = 0;
        class135.field2542 = 0;
        class64.field1073 = 0;
        class89.field1568 = 0;
        class159.field3065 = 0;
        class73.field1257 = 0;
        class7.field97 = 0;
        class36.field575 = 0;
        class94.field1701 = 0;
        class109.field2033 = 0;
        class114.field2157 = 0;
        class70.field1205 = 0;
        class207.field4038 = 0;
        class142.field2689 = 0;
        class83.field1456 = 0;
        class185.field3523 = 0;
        class162.field3113 = 0;
        class193.field3668 = 0;
        class26.field389 = 0;
        class57.field1004 = 0;
        class73.field1253 = 0;
        class49.field864 = 0;
        class91.field1594 = 0;
        class144.field2711 = 0;
        class34.field521 = 0;
        class142.field2690 = 0;
        class144.field2708 = 0;
        class54.field964 = 0;
        class159.field3057 = 0;
        class72.field1241 = 0;
        class203.field3954 = 0;
        class108.field2004 = 0;
        class32.field481 = 0;
        class111.field2051 = 0;
        class53.field956 = 0;
        class32.field477 = 0;
        class10.field147 = 0;
        class144.field2694 = 0;
        class114.field2161 = 0;
        class146.field2790 = 0;
        class9.field112 = 0;
        class158.field3045 = 0;
        class100.field1860 = 0;
        class21.field325 = 0;
        class146.field2786 = 0;
        class157.field3032 = -1;
        class180.field3415 = false;
        class101.field1890 = -1;
        class98.field1818 = -1;
        class74.field1274 = 0;
        class76.field1323.field2170 = 0;
        class53.field946 = 0;
        class37.field585 = 0;
        class74.field1273.field2170 = 0;
        class50.method357(true, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            client.field443[var1] = null;
        }
        class152.field2917 = (int) (Math.random() * 80.0D) - 40;
        class120.field2314 = 0;
        class42.field698 = (int) (Math.random() * 30.0D) - 20;
        class32.field482 = false;
        class53.field950 = (int) (Math.random() * 120.0D) - 60;
        class169.field3270 = 0;
        class104.field1951 = (int) (Math.random() * 100.0D) - 50;
        class171.field3316 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class93.field1690 = 0;
        class169.field3257 = 0;
        class70.field1209 = (int) (Math.random() * 110.0D) - 55;
        class126.field2404 = 0;
        class13.field220 = -1;
        class135.field2539 = 0;
        class189.field3616 = 0;
        class135.field2540 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class2.field10[var2] = null;
            class53.field944[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class168.field3249[var3] = null;
        }
        class145.field2767 = class2.field10[2047] = new class38();
        class125.field2392.method1224((byte) 24);
        class171.field3298.method1224((byte) 24);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var12 = 0; var12 < 104; var12++) {
                for (int var13 = 0; var13 < 104; var13++) {
                    class33.field508[var4][var12][var13] = null;
                }
            }
        }
        class123.field2360 = new class192();
        class124.field2380 = 0;
        class129.field2452 = 0;
        for (int var5 = 0; var5 < class5.field63; var5++) {
            class20 var11 = class45.method280(16, var5);
            if (var11 != null && var11.field299 == 0) {
                class33.field506[var5] = 0;
                class13.field215[var5] = 0;
            }
        }
        for (int var6 = 0; var6 < class152.field2918.length; var6++) {
            class152.field2918[var6] = -1;
        }
        if (class27.field402 != -1) {
            class80.method490(class27.field402, 0);
        }
        for (class118 var7 = (class118) class165.field3162.method212((byte) -114); var7 != null; var7 = (class118) class165.field3162.method215((byte) 34)) {
            class27.method176(true, var7, true);
        }
        class27.field402 = -1;
        class165.field3162 = new class32(8);
        class180.field3415 = false;
        class137.field2569 = null;
        class53.field946 = 0;
        class160.field3077.method824(-1, null, (byte) 57, new int[5], false);
        for (int var8 = 0; var8 < 8; var8++) {
            class55.field985[var8] = null;
            class140.field2642[var8] = false;
        }
        class44.method276(arg0 ^ 0x5C4D);
        class131.field2485 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            class98.field1810[var9] = true;
        }
        class193.field3674 = 0;
        class75.field1288 = null;
        class64.field1061 = null;
        for (int var10 = 0; var10 < 6; var10++) {
            class47.field818[var10] = new class115();
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(III)V")
    public class184(int arg0, int arg1, int arg2) {
        this.field3499 = new class205[arg1];
        this.field3512 = arg0;
        this.field3498 = arg1;
        this.field3496 = new int[arg0][arg2];
    }
}
