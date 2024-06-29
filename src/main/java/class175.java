import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class175 extends class213 {

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lob;")
    public static class141 field3470 = method1195(40, "settings");

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Lob;")
    private static class141 field3472 = method1195(40, "blinken1:");

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field3475 = -1;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field3473 = -1;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Lob;")
    public static class141 field3468 = method1195(40, "sl_back");

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lob;")
    private static class141 field3479 = method1195(40, "Could not complete login)3");

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Lob;")
    private static class141 field3477 = method1195(40, "Schlie-8en");

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "Lob;")
    public static class141 field3471 = field3479;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "Lbh;")
    public static class19 field3476;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "Lja;")
    public static class90 field3482;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I")
    public static final int method1194(int arg0) {
        if (arg0 != 255) {
            method1195(-91, null);
        }
        field3466++;
        int var1 = class206.method1360(class66.field1287, class178.field3508, (byte) 40, class184.field3589);
        return var1 - class191.field3683 >= 800 || (class164.field3177[class66.field1287][class178.field3508 >> 7][class184.field3589 >> 7] & 0x4) == 0 ? 3 : class66.field1287;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/String;)Lob;")
    public static final class141 method1195(int arg0, String arg1) {
        field3469++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        if (arg0 != 40) {
            return null;
        }
        class141 var5 = new class141();
        var5.field2701 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field2701[var5.field2705++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field2701[var5.field2705++] = (byte) var6;
            }
        }
        var5.method936((byte) 108);
        return var5.method903((byte) -103);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static final void method1196(byte arg0) {
        class209.field3973 = class43.field836;
        class204.field3912 = class135.field2564;
        class182.field3583 = class47.field901;
        class123.field2351 = class123.field2357;
        class22.field391 = class201.field3802;
        class160.field3116 = class136.field2600;
        class36.field718 = class94.field1869;
        class209.field3933 = class49.field923;
        class204.field3904 = class81.field1627;
        class181.field3563 = class90.field1782;
        class187.field3633 = class65.field1268;
        class59.field1157 = class184.field3591;
        if (arg0 < 44) {
            method1197((byte) -82);
        }
        class22.field383 = class212.field4053;
        class182.field3574 = class215.field4103;
        class79.field1608 = class45.field871;
        class79.field1589 = class83.field1660;
        class224.field4221 = class170.field3370;
        class168.field3238 = class79.field1598;
        class83.field1661 = class91.field1832;
        class91.field1834 = class172.field3426;
        class223.field4209 = class47.field898;
        class69.field1362 = class200.field3784;
        class7.field109 = class202.field3821;
        class59.field1150 = class58.field1141;
        class209.field3945 = class157.field3021;
        class94.field1880 = class45.field865;
        class1.field13 = class197.field3760;
        field3471 = class141.field2738;
        class125.field2406 = class115.field2202;
        class35.field700 = class159.field3068;
        class200.field3779 = class84.field1672;
        class174.field3450 = class108.field2073;
        class209.field3966 = class49.field923;
        class3.field38 = class98.field1945;
        class81.field1623 = class176.field3496;
        class108.field2091 = class210.field3992;
        class83.field1646 = class166.field3220;
        class164.field3175 = class125.field2412;
        class209.field3956 = class49.field923;
        class3.field34 = class200.field3794;
        class98.field1938 = class177.field3499;
        class76.field1554 = class220.field4175;
        class22.field374 = class54.field1069;
        class209.field3969 = class211.field3998;
        class204.field3899 = class166.field3219;
        class209.field3934 = class49.field923;
        class61.field1204 = field3477;
        class87.field1721 = class83.field1657;
        class76.field1560 = class30.field576;
        class209.field3957 = class49.field923;
        class191.field3684 = class172.field3419;
        class49.field920 = class20.field343;
        class152.field2912 = class100.field1957;
        class18.field317 = class223.field4216;
        class161.field3129 = class124.field2384;
        class126.field2429 = class105.field2022;
        class114.field2190 = class200.field3790;
        class34.field692 = class1.field8;
        class136.field2595 = class195.field3733;
        class12.field239 = class68.field1342;
        class114.field2177 = class119.field2316;
        class25.field467 = class136.field2596;
        class224.field4231 = class180.field3545;
        class209.field3977 = class49.field923;
        class8.field122 = class209.field3980;
        class1.field16 = class170.field3282;
        class206.field3921 = class106.field2044;
        class86.field1708 = class176.field3483;
        class202.field3825 = class92.field1847;
        class209.field3955 = class69.field1357;
        class114.field2178 = class49.field923;
        class42.field819 = class139.field2675;
        class191.field3687 = class172.field3419;
        class83.field1641 = class91.field1832;
        class126.field2420 = class203.field3895;
        class172.field3415 = class130.field2471;
        class154.field2998 = class182.field3577;
        client.field604 = class36.field726;
        class209.field3935 = class49.field923;
        class40.field795 = class135.field2580;
        class98.field1939 = class124.field2380;
        class209.field3982 = class49.field923;
        class113.field2167 = class126.field2430;
        class172.field3424 = class178.field3520;
        class188.field3644 = class31.field618;
        class4.field43 = class185.field3609;
        class190.field3672 = class3.field29;
        class57.field1098 = class49.field919;
        class173.field3439 = class95.field1883;
        class96.field1896 = class68.field1322;
        class211.field4025 = class65.field1259;
        class135.field2578 = class211.field3999;
        class209.field3983 = class132.field2512;
        class68.field1324 = class152.field2911;
        class146.field2836 = class154.field2995;
        class70.field1424 = class50.field926;
        class209.field3963 = class49.field923;
        class6.field88 = class98.field1942;
        class209.field3961 = class49.field923;
        class209.field3949 = class49.field923;
        class138.field2652 = class110.field2113;
        client.field586 = field3472;
        class60.field1176 = class179.field3525;
        class60.field1180 = class85.field1700;
        class6.field82 = class147.field2868;
        class220.field4174 = class141.field2728;
        class86.field1717 = class176.field3483;
        class209.field3948 = class178.field3512;
        class61.field1203 = class138.field2667;
        class209.field3972 = class211.field3998;
        class209.field3941 = class49.field923;
        class178.field3516 = class63.field1237;
        class21.field359 = class190.field3681;
        class76.field1558 = class32.field669;
        class184.field3586 = class221.field4195;
        class209.field3950 = class178.field3512;
        class125.field2411 = class60.field1175;
        class97.field1917 = class111.field2141;
        class61.field1193 = class36.field713;
        class49.field925 = class96.field1910;
        class76.field1532 = class179.field3526;
        client.field601 = class66.field1273;
        class72.field1441 = class32.field637;
        class91.field1825 = class79.field1614;
        class158.field3047 = class196.field3759;
        class22.field373 = class54.field1069;
        class63.field1239 = class214.field4076;
        class30.field571 = class110.field2117;
        class209.field3939 = class49.field923;
        class84.field1682 = class119.field2319;
        class46.field876 = class128.field2435;
        class209.field3936 = class49.field923;
        class8.field131 = class138.field2668;
        class62.field1216 = class68.field1351;
        class167.field3231 = class22.field387;
        class209.field3971 = class63.field1231;
        class129.field2453 = class36.field721;
        class209.field3954 = class49.field923;
        class166.field3212 = class202.field3809;
        class209.field3947 = class49.field923;
        class22.field375 = class212.field4053;
        class58.field1125 = class77.field1565;
        class105.field2023 = class173.field3444;
        class84.field1675 = class62.field1225;
        class106.field2041 = class8.field139;
        class53.field1013 = class4.field55;
        class82.field1634 = class87.field1737;
        class209.field3968 = class108.field2088;
        class209.field3974 = class212.field4053;
        class138.field2660 = class9.field161;
        class11.field218 = class128.field2442;
        class180.field3543 = class185.field3611;
        class41.field812 = class17.field297;
        class209.field3940 = class105.field2026;
        class8.field132 = class143.field2761;
        class68.field1326 = class165.field3206;
        class220.field4152 = class201.field3800;
        class22.field364 = class212.field4053;
        class94.field1874 = class15.field269;
        class209.field3951 = class49.field923;
        class196.field3752 = class184.field3596;
        class39.field791 = class214.field4079;
        class35.field705 = class21.field350;
        class94.field1870 = class123.field2369;
        class160.field3113 = class196.field3748;
        class144.field2793 = class161.field3128;
        class29.field564 = class143.field2772;
        class35.field704 = class159.field3068;
        class209.field3937 = class49.field923;
        class60.field1173 = class85.field1700;
        class209.field3959 = class49.field923;
        class47.field902 = class182.field3576;
        class209.field3967 = class100.field1952;
        class1.field14 = class17.field296;
        class206.field3928 = class15.field270;
        class162.field3147 = class98.field1944;
        class209.field3960 = class49.field923;
        class79.field1591 = class39.field789;
        class91.field1816 = class83.field1645;
        class144.field2786 = class25.field477;
        class22.field384 = class201.field3802;
        class124.field2383 = class100.field1954;
        class110.field2115 = class41.field813;
        field3465++;
        class6.field83 = class91.field1815;
        class209.field3946 = class14.field245;
        class136.field2592 = class37.field744;
        class103.field2003 = class27.field518;
        class22.field400 = client.field612;
        class203.field3836 = class225.field4248;
        class84.field1668 = class190.field3677;
        class216.field4121 = class84.field1669;
        class209.field3978 = class103.field1995;
        class91.field1829 = class35.field703;
        class223.field4215 = class73.field1451;
        class163.field3155 = class150.field2890;
        class209.field3962 = class49.field923;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static void method1197(byte arg0) {
        field3477 = null;
        field3476 = null;
        if (arg0 <= 48) {
            field3475 = -30;
        }
        field3471 = null;
        field3479 = null;
        field3468 = null;
        field3470 = null;
        field3472 = null;
        field3482 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V")
    public class175(int arg0, int arg1) {
        this.field3467 = arg0;
        this.field3481 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Lfc;")
    public static final class54 method1198(int arg0, int arg1) {
        field3480++;
        class54 var2 = (class54) class209.field3952.method1383((long) arg1, (byte) -71);
        if (arg0 != -14098) {
            field3482 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class77.field1566.method1065((byte) 84, class2.method11((byte) 39, arg1), class61.method412(128, arg1));
        class54 var4 = new class54();
        var4.field1028 = arg1;
        if (var3 != null) {
            var4.method363(45, new class146(var3));
        }
        var4.method362((byte) 64);
        if (var4.field1045) {
            var4.field1061 = 0;
            var4.field1036 = false;
        }
        class209.field3952.method1378(var4, (byte) -50, (long) arg1);
        return var4;
    }
}
