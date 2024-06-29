import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class23 extends class28 {

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lqe;")
    private static class179 field553 = class206.method1380("Bitte warten Sie)3)3)3", (byte) 124);

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "[Lkg;")
    public static class115[] field554 = new class115[2048];

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "[S")
    public static short[] field552 = new short[500];

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field561 = -1;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "[Lqe;")
    public static class179[] field567 = new class179[500];

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Lqe;")
    public static class179 field568 = class206.method1380(":clanreq:", (byte) -2);

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "Lqe;")
    public static class179 field566 = class206.method1380("<col=ffffff>", (byte) -128);

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "Lae;")
    public static class6 field560 = null;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "Lqe;")
    public static class179 field572 = class206.method1380("::rect_debug", (byte) -27);

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field569 = 0;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "[I")
    public static int[] field571;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lqe;ILqe;Leh;)[Lgg;")
    public static final class72[] method153(class179 arg0, int arg1, class179 arg2, class52 arg3) {
        field557++;
        int var4 = arg3.method359(-1, arg2);
        if (arg1 <= 8) {
            return null;
        } else {
            int var5 = arg3.method362(123, var4, arg0);
            return class13.method90(arg3, var4, var5, 2);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lra;I)V")
    public final void method154(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1243(3);
            if (var3 == 0) {
                field564++;
                if (arg1 != -1) {
                    this.field570 = 35;
                    return;
                }
                return;
            }
            this.method158(var3, -2, arg0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3) {
        field573++;
        if (class152.method976(true, arg0)) {
            class236.method1536(arg2, arg3, class199.field3710[arg0], arg1, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIII)V")
    public static final void method156(int arg0, int arg1, int arg2, int arg3) {
        class197 var4 = class229.field4232[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class169 var5 = var4.field3678;
        if (var5 != null) {
            var5.field3046 = var5.field3046 * arg3 / 16;
            var5.field3039 = var5.field3039 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lra;B)Llb;")
    public static final class121 method157(class185 arg0, byte arg1) {
        if (arg1 < 113) {
            method157(null, (byte) -116);
        }
        field563++;
        return new class121(arg0.method1225((byte) -77), arg0.method1225((byte) -77), arg0.method1225((byte) -77), arg0.method1225((byte) -77), arg0.method1244(-27523), arg0.method1243(3));
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILra;)V")
    private final void method158(int arg0, int arg1, class185 arg2) {
        if (~arg0 == arg1) {
            this.field559 = arg2.method1252(2);
            this.field565 = arg2.method1243(3);
            this.field570 = arg2.method1243(3);
        }
        field558++;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static final void method159(int arg0) {
        class17.field452 = class165.field2980;
        class34.field765 = class10.field272;
        class77.field1505 = class84.field1633;
        class217.field4025 = class189.field3518;
        class110.field2057 = class179.field3276;
        class98.field1843 = class196.field3642;
        class34.field755 = class60.field1279;
        class152.field2756 = class230.field4248;
        class168.field3028 = class177.field3225;
        class78.field1516 = class60.field1279;
        class34.field760 = class60.field1279;
        class173.field3106 = class174.field3121;
        class186.field3463 = class114.field2144;
        class39.field836 = class80.field1540;
        class138.field2538 = class100.field1852;
        class155.field2788 = class17.field448;
        class98.field1842 = class162.field2925;
        class34.field730 = class60.field1279;
        class135.field2498 = class147.field2658;
        class143.field2595 = class100.field1870;
        class243.field4441 = class111.field2064;
        class187.field3471 = class50.field1078;
        class10.field283 = class29.field630;
        class209.field3929 = class243.field4439;
        class34.field747 = class60.field1279;
        class189.field3517 = class88.field1682;
        class192.field3578 = class16.field443;
        class197.field3654 = class197.field3664;
        class60.field1282 = class163.field2952;
        class194.field3609 = class54.field1189;
        class134.field2437 = class81.field1569;
        class17.field455 = class138.field2539;
        class40.field849 = class9.field267;
        class16.field433 = class74.field1451;
        class205.field3840 = class18.field478;
        class136.field2510 = class230.field4252;
        class74.field1455 = class239.field4402;
        class22.field537 = class110.field2052;
        class150.field2700 = class146.field2644;
        class86.field1655 = class7.field237;
        class34.field737 = class60.field1279;
        class206.field3853 = class91.field1727;
        class139.field2557 = class130.field2366;
        class135.field2504 = class229.field4236;
        class215.field3988 = class120.field2243;
        class18.field484 = class125.field2313;
        class17.field467 = class85.field1641;
        class240.field4408 = class53.field1165;
        class128.field2347 = class134.field2453;
        class49.field1062 = class207.field3877;
        class62.field1310 = class237.field4370;
        class232.field4285 = class39.field831;
        class222.field4095 = class155.field2791;
        class209.field3923 = class194.field3620;
        class59.field1270 = class206.field3857;
        class173.field3103 = class189.field3507;
        class14.field343 = class16.field441;
        class116.field2187 = class207.field3876;
        class34.field745 = class134.field2453;
        class127.field2320 = class236.field4344;
        class128.field2337 = class134.field2453;
        class223.field4117 = class71.field1427;
        class199.field3713 = class188.field3503;
        class18.field482 = class227.field4200;
        class161.field2915 = class70.field1410;
        class191.field3566 = class43.field920;
        class7.field234 = class112.field2114;
        class92.field1747 = class231.field4258;
        class192.field3582 = class93.field1757;
        class8.field254 = class214.field3970;
        class34.field740 = class157.field2851;
        class194.field3602 = class54.field1189;
        class34.field768 = class60.field1279;
        class135.field2505 = class115.field2177;
        class34.field729 = class60.field1279;
        class189.field3509 = class199.field3705;
        class34.field751 = class22.field539;
        class241.field4428 = class215.field3996;
        class227.field4195 = class9.field264;
        class17.field463 = class208.field3890;
        class33.field721 = class123.field2279;
        class34.field748 = class162.field2926;
        class177.field3216 = class111.field2091;
        if (arg0 <= 47) {
            field569 = -42;
        }
        class8.field250 = class214.field3968;
        class52.field1111 = class96.field1809;
        class69.field1381 = class46.field1001;
        class174.field3110 = class96.field1807;
        class172.field3076 = class84.field1620;
        class143.field2600 = class183.field3374;
        class149.field2680 = class58.field1256;
        class30.field655 = class54.field1195;
        class29.field645 = class168.field3029;
        class34.field742 = class60.field1279;
        class34.field743 = class60.field1279;
        class32.field683 = class174.field3123;
        class46.field992 = class164.field2971;
        class50.field1074 = class136.field2516;
        class34.field773 = class157.field2851;
        class78.field1526 = class64.field1330;
        class34.field735 = class159.field2879;
        class34.field754 = class241.field4434;
        class81.field1572 = class50.field1077;
        class229.field4238 = class49.field1056;
        class206.field3847 = class47.field1024;
        class78.field1512 = class201.field3729;
        class38.field821 = class112.field2109;
        class120.field2246 = class219.field4048;
        class237.field4357 = class101.field1906;
        class42.field911 = class136.field2523;
        class11.field298 = class165.field2985;
        class34.field772 = class60.field1279;
        class34.field767 = class60.field1279;
        class146.field2652 = class100.field1878;
        class15.field411 = class96.field1808;
        class172.field3084 = field553;
        class136.field2518 = class15.field398;
        class34.field727 = class60.field1279;
        class180.field3302 = class4.field51;
        class135.field2496 = class100.field1879;
        field562++;
        class236.field4347 = class55.field1227;
        class121.field2260 = class133.field2418;
        class135.field2499 = class116.field2188;
        class56.field1239 = class163.field2941;
        class34.field750 = class211.field3945;
        class4.field56 = class205.field3836;
        class44.field955 = class240.field4417;
        class123.field2283 = class61.field1297;
        class159.field2897 = class59.field1267;
        class178.field3229 = class202.field3737;
        class40.field863 = class190.field3542;
        class164.field2965 = class14.field349;
        class180.field3348 = class149.field2686;
        class233.field4306 = class238.field4391;
        class150.field2706 = class211.field3938;
        class34.field759 = class60.field1279;
        class34.field734 = class56.field1231;
        class33.field720 = class54.field1196;
        class53.field1170 = class25.field580;
        class100.field1872 = class186.field3457;
        class34.field774 = class60.field1279;
        class6.field185 = class176.field3212;
        class134.field2451 = class32.field688;
        class164.field2973 = class14.field349;
        class53.field1149 = class135.field2501;
        class62.field1308 = class237.field4370;
        class196.field3639 = class43.field923;
        class127.field2327 = class236.field4344;
        class147.field2662 = class62.field1317;
        class19.field486 = class46.field1011;
        class128.field2333 = class134.field2453;
        class196.field3637 = class28.field621;
        class34.field769 = class60.field1279;
        class191.field3572 = class215.field3987;
        class6.field71 = client.field700;
        class112.field2111 = class117.field2209;
        class172.field3077 = class167.field3021;
        class70.field1407 = class174.field3125;
        class34.field771 = class60.field1279;
        class32.field681 = class5.field66;
        class152.field2747 = class186.field3458;
        class186.field3462 = class206.field3856;
        class232.field4275 = class17.field449;
        class211.field3942 = class85.field1642;
        class207.field3864 = class221.field4088;
        class34.field766 = class117.field2219;
        class34.field725 = class60.field1279;
        class34.field738 = class155.field2792;
        class128.field2349 = class163.field2949;
        class42.field887 = class195.field3625;
        class34.field758 = class19.field488;
        class171.field3064 = class234.field4323;
        class133.field2414 = class52.field1099;
        class165.field2986 = class110.field2054;
        class34.field733 = class60.field1279;
        class116.field2193 = class201.field3723;
        class137.field2528 = class185.field3442;
        class197.field3656 = class102.field1971;
        class34.field736 = class117.field2219;
        class182.field3368 = class74.field1443;
        class66.field1345 = class227.field4209;
        class125.field2302 = class185.field3443;
        class93.field1756 = class55.field1228;
        class34.field757 = class40.field864;
        class90.field1705 = class4.field47;
        class121.field2273 = class215.field3997;
        class128.field2352 = class163.field2949;
        class139.field2560 = class5.field67;
        class209.field3927 = class68.field1368;
        class30.field664 = class167.field3008;
        class34.field770 = class60.field1279;
        class152.field2754 = class151.field2715;
        class165.field2987 = class110.field2054;
        class128.field2346 = class68.field1366;
        class34.field746 = class60.field1279;
        class173.field3093 = class189.field3507;
        class34.field756 = class60.field1279;
        class60.field1288 = class36.field803;
        class183.field3382 = class2.field28;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
    public static void method160(byte arg0) {
        field553 = null;
        if (arg0 < 56) {
            field567 = null;
        }
        field567 = null;
        field552 = null;
        field568 = null;
        field566 = null;
        field560 = null;
        field554 = null;
        field572 = null;
        field571 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII[I)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg3--;
        field556++;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg4[var7] = arg2;
            int var8 = var7 + 1;
            arg4[var8] = arg2;
            int var9 = var8 + 1;
            arg4[var9] = arg2;
            int var10 = var9 + 1;
            arg4[var10] = arg2;
            int var11 = var10 + 1;
            arg4[var11] = arg2;
            int var12 = var11 + 1;
            arg4[var12] = arg2;
            int var13 = var12 + 1;
            arg4[var13] = arg2;
            arg3 = var13 + 1;
            arg4[arg3] = arg2;
        }
        while (var6 > arg3) {
            arg3++;
            arg4[arg3] = arg2;
        }
        if (arg1 != -1) {
            method155(32, -98, -36, -124);
        }
    }
}
