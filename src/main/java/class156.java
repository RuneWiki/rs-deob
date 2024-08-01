import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qh")
public class class156 implements Runnable {

    @OriginalMember(owner = "qh", name = "h", descriptor = "Z")
    public boolean field2938 = true;

    @OriginalMember(owner = "qh", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field2936 = new Object();

    @OriginalMember(owner = "qh", name = "o", descriptor = "[I")
    public int[] field2945 = new int[500];

    @OriginalMember(owner = "qh", name = "p", descriptor = "I")
    public int field2946 = 0;

    @OriginalMember(owner = "qh", name = "q", descriptor = "[I")
    public int[] field2947 = new int[500];

    @OriginalMember(owner = "qh", name = "g", descriptor = "Llf;")
    private static class109 field2937 = class35.method275("Benutzername: ", 2);

    @OriginalMember(owner = "qh", name = "k", descriptor = "Llf;")
    private static class109 field2941 = class35.method275("flash2:", 2);

    @OriginalMember(owner = "qh", name = "e", descriptor = "Llf;")
    public static class109 field2935 = field2941;

    @OriginalMember(owner = "qh", name = "m", descriptor = "Llf;")
    public static class109 field2943 = field2941;

    @OriginalMember(owner = "qh", name = "a", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "qh", name = "b", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "qh", name = "c", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "qh", name = "d", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "qh", name = "i", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "qh", name = "j", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "qh", name = "l", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "qh", name = "n", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "qh", name = "a", descriptor = "(IIIZI)V")
    public static final void method1067(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2933++;
        class11.method71(arg4, arg0, arg1 + arg4, arg0 + arg2);
        class124.method888();
        class55.field1115++;
        class63.method408(true, 0);
        class179.method1222((byte) -33, true);
        class63.method408(arg3, 0);
        class179.method1222((byte) -99, false);
        class41.method298((byte) 56);
        class18.method172(117);
        if (!class109.field2148) {
            int var5 = class142.field2742;
            if (var5 < class9.field128 / 256) {
                var5 = class9.field128 / 256;
            }
            if (class140.field2713[4] && var5 < client.field667[4] + 128) {
                var5 = client.field667[4] + 128;
            }
            int var6 = class76.field1464 + class69.field1343 & 0x7FF;
            class139.method995(67, var6, class1.field5, var5 * 3 + 600, class19.method180(class157.field2955.field3609, arg3, class72.field1405, class157.field2955.field3549) + -50, class12.field189, var5);
        }
        int var7;
        if (class109.field2148) {
            var7 = class157.method1072(662);
        } else {
            var7 = class55.method361(80);
        }
        int var8 = class125.field2419;
        int var9 = class39.field836;
        int var10 = class114.field2267;
        int var11 = class72.field1397;
        int var12 = class143.field2748;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class140.field2713[var13]) {
                int var16 = (int) ((double) -class107.field2117[var13] + Math.random() * (double) (class107.field2117[var13] * 2 + 1) + Math.sin((double) class182.field3425[var13] / 100.0D * (double) class68.field1311[var13]) * (double) client.field667[var13]);
                if (var13 == 0) {
                    class39.field836 += var16;
                }
                if (var13 == 3) {
                    class143.field2748 = class143.field2748 + var16 & 0x7FF;
                }
                if (var13 == 2) {
                    class114.field2267 += var16;
                }
                if (var13 == 1) {
                    class125.field2419 += var16;
                }
                if (var13 == 4) {
                    class72.field1397 += var16;
                    if (class72.field1397 < 128) {
                        class72.field1397 = 128;
                    }
                    if (class72.field1397 > 383) {
                        class72.field1397 = 383;
                    }
                }
            }
        }
        int var14 = class21.field479;
        int var15 = class109.field2134;
        if (arg4 <= var14 && var14 < arg4 + arg1 && arg0 <= var15 && var15 < arg0 + arg2) {
            class189.field3640 = class21.field479 - arg4;
            class189.field3631 = true;
            class189.field3623 = 0;
            class189.field3638 = class109.field2134 - arg0;
        } else {
            class189.field3631 = false;
            class189.field3623 = 0;
        }
        class190.method1285((byte) 98);
        class11.method76(arg4, arg0, arg1, arg2, 0);
        class190.method1285((byte) 89);
        class75.method478(class39.field836, class125.field2419, class114.field2267, class72.field1397, class143.field2748, var7);
        class190.method1285((byte) 104);
        class161.method1095();
        class90.method662(arg2, arg0, (byte) 63, arg4, arg1);
        class65.method417(arg0, -28, arg4);
        ((class14) class124.field2385).method90(36, class193.field3694);
        class127.method920((byte) 124, arg4, arg0, arg1, arg2);
        class125.field2419 = var8;
        class39.field836 = var9;
        class143.field2748 = var12;
        class72.field1397 = var11;
        class114.field2267 = var10;
        if (class48.field994 && class162.method1098(true, false, false) == 0) {
            class48.field994 = false;
        }
        if (class48.field994) {
            class11.method76(arg4, arg0, arg1, arg2, 0);
            class103.method742(class117.field2315, -1, false);
        }
        if (!class48.field994 && !class51.field1041 && var14 >= arg4 && arg1 + arg4 > var14 && arg0 <= var15 && var15 < arg0 + arg2) {
            class134.method948(arg4, var15, var14, arg0, (byte) 29);
        }
    }

    @OriginalMember(owner = "qh", name = "a", descriptor = "(III)Lei;")
    public static final class50 method1068(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        return var3 == null || var3.field27 == null ? null : var3.field27;
    }

    @OriginalMember(owner = "qh", name = "a", descriptor = "(B)V")
    public static final void method1069(byte arg0) {
        class140.field2716 = class129.field2513;
        class178.field3348 = class13.field210;
        class14.field274 = class152.field2907;
        class14.field248 = class129.field2513;
        class178.field3370 = class78.field1555;
        class14.field213 = class129.field2513;
        class23.field509 = class168.field3117;
        class82.field1614 = class91.field1877;
        class147.field2825 = class181.field3421;
        class137.field2649 = class182.field3433;
        class92.field1903 = class116.field2299;
        class77.field1484 = class88.field1835;
        class147.field2833 = class181.field3421;
        class14.field269 = class129.field2513;
        class117.field2307 = class140.field2706;
        class96.field1960 = class123.field2367;
        class14.field223 = class129.field2513;
        if (arg0 <= 52) {
            method1069((byte) -57);
        }
        class91.field1876 = class62.field1203;
        class163.field3058 = class143.field2768;
        class5.field76 = class171.field3208;
        class68.field1319 = class184.field3469;
        class184.field3487 = class161.field3025;
        class205.field4025 = class75.field1443;
        class95.field1951 = class177.field3338;
        class53.field1072 = class143.field2769;
        class29.field634 = class102.field2021;
        class201.field3964 = class193.field3689;
        class172.field3221 = class111.field2212;
        class194.field3707 = class8.field113;
        class51.field1046 = class113.field2249;
        class38.field822 = class96.field1955;
        class209.field4067 = class127.field2448;
        class178.field3364 = class20.field433;
        class36.field794 = class5.field77;
        class113.field2243 = class137.field2652;
        class117.field2315 = class210.field4083;
        class14.field273 = class129.field2513;
        class141.field2730 = class168.field3112;
        class113.field2250 = class26.field552;
        class31.field738 = class200.field3858;
        class136.field2640 = class95.field1942;
        class23.field526 = class131.field2534;
        class141.field2729 = class159.field2986;
        class107.field2118 = class194.field3720;
        class126.field2427 = class1.field1;
        class71.field1388 = class1.field2;
        class86.field1775 = class16.field311;
        class180.field3402 = class42.field876;
        class80.field1574 = class160.field3012;
        class14.field220 = class129.field2513;
        class14.field264 = class129.field2513;
        class141.field2740 = class69.field1340;
        class186.field3543 = class127.field2463;
        class139.field2692 = class168.field3122;
        class14.field246 = class129.field2513;
        class53.field1068 = class143.field2769;
        class162.field3040 = class1.field3;
        class199.field3785 = class40.field852;
        class172.field3222 = class74.field1418;
        class14.field245 = class148.field2867;
        class136.field2627 = class48.field993;
        class147.field2835 = class82.field1623;
        class20.field441 = class204.field4003;
        class106.field2106 = class186.field3541;
        class157.field2960 = class204.field4008;
        class14.field234 = class129.field2513;
        class177.field3336 = class53.field1067;
        class82.field1610 = class82.field1618;
        class138.field2662 = class20.field446;
        class14.field233 = class129.field2513;
        class14.field256 = class9.field125;
        class144.field2786 = class153.field2914;
        class14.field255 = class26.field553;
        class50.field1022 = class85.field1724;
        class128.field2465 = class55.field1102;
        class147.field2831 = class73.field1414;
        class210.field4090 = class116.field2293;
        class14.field263 = class129.field2513;
        class14.field218 = class19.field414;
        class23.field521 = class84.field1715;
        class44.field912 = class160.field2997;
        class14.field228 = class130.field2516;
        class131.field2530 = class90.field1859;
        class163.field3061 = class185.field3531;
        class194.field3723 = class51.field1032;
        class199.field3784 = class147.field2843;
        class14.field258 = class130.field2515;
        class152.field2908 = class183.field3439;
        class45.field951 = class83.field1692;
        class141.field2732 = class152.field2907;
        class13.field207 = class69.field1348;
        class92.field1896 = class181.field3409;
        class14.field222 = class109.field2185;
        class88.field1833 = class112.field2221;
        class140.field2727 = class45.field953;
        class140.field2724 = class170.field3194;
        class14.field262 = class129.field2513;
        class10.field168 = class210.field4093;
        class70.field1370 = class84.field1699;
        class14.field212 = class129.field2513;
        class14.field236 = class129.field2513;
        class74.field1416 = class47.field969;
        class185.field3526 = class79.field1564;
        class187.field3586 = class170.field3197;
        class138.field2682 = class52.field1061;
        class85.field1739 = class171.field3213;
        class105.field2081 = class80.field1588;
        class141.field2731 = class168.field3112;
        class123.field2365 = class4.field51;
        class15.field287 = class162.field3029;
        class14.field217 = class109.field2185;
        class14.field242 = class40.field848;
        class73.field1409 = class180.field3395;
        class137.field2651 = class78.field1551;
        class116.field2301 = class30.field649;
        class105.field2080 = class145.field2796;
        class68.field1330 = class126.field2442;
        class14.field216 = class129.field2513;
        class138.field2674 = class106.field2097;
        class91.field1870 = class138.field2672;
        class67.field1298 = class140.field2707;
        class34.field753 = class144.field2774;
        class127.field2460 = class129.field2500;
        class178.field3359 = class29.field621;
        class27.field595 = class74.field1424;
        class23.field530 = class41.field867;
        class22.field496 = class21.field469;
        class145.field2809 = class36.field793;
        class49.field1000 = class30.field652;
        class39.field832 = class54.field1094;
        class14.field259 = class121.field2345;
        class14.field231 = class182.field3437;
        field2935 = class178.field3372;
        class31.field737 = class200.field3858;
        class210.field4086 = class12.field178;
        class55.field1103 = class200.field3892;
        class191.field3658 = class91.field1886;
        class126.field2441 = class4.field52;
        class70.field1365 = class159.field2989;
        class13.field197 = class90.field1854;
        class111.field2202 = class67.field1307;
        class145.field2789 = class186.field3537;
        class14.field237 = class148.field2867;
        class31.field729 = class29.field630;
        class127.field2453 = class49.field1005;
        class57.field1154 = class162.field3033;
        class14.field249 = class129.field2513;
        class177.field3341 = class79.field1570;
        class14.field229 = class98.field1981;
        class105.field2085 = class147.field2837;
        class194.field3722 = class53.field1081;
        class184.field3481 = class161.field3015;
        class14.field225 = class129.field2513;
        class141.field2741 = class152.field2907;
        class14.field267 = class179.field3378;
        class90.field1851 = class105.field2095;
        class14.field227 = class129.field2513;
        class44.field925 = class49.field996;
        class163.field3065 = class201.field3969;
        class162.field3041 = class42.field873;
        class141.field2739 = class152.field2907;
        class60.field1182 = class16.field309;
        class14.field230 = class182.field3437;
        class197.field3776 = class8.field117;
        class70.field1350 = class13.field198;
        class179.field3381 = class93.field1917;
        class57.field1162 = class145.field2802;
        field2940++;
        class137.field2659 = class84.field1708;
        class52.field1050 = class126.field2446;
        class42.field878 = class38.field825;
        class68.field1325 = class54.field1093;
        class92.field1900 = class6.field92;
        class145.field2793 = class128.field2474;
        class53.field1082 = class39.field829;
        class18.field360 = class171.field3210;
        class14.field244 = class129.field2513;
        class77.field1472 = class191.field3653;
        class84.field1705 = class73.field1406;
        class112.field2215 = class184.field3467;
        class83.field1690 = class152.field2905;
        class14.field272 = class129.field2513;
        class179.field3385 = field2937;
        class5.field80 = class39.field831;
        class5.field83 = class171.field3208;
        class150.field2890 = class181.field3405;
        class190.field3645 = class7.field98;
        class53.field1070 = class48.field988;
        class20.field451 = class81.field1592;
        class4.field60 = class30.field645;
        class134.field2568 = class148.field2860;
        class184.field3465 = class27.field568;
        class14.field268 = class129.field2513;
        class210.field4088 = class12.field178;
        class159.field2991 = class141.field2737;
        class88.field1834 = class1.field4;
        if (class185.field3532) {
        }
    }

    @OriginalMember(owner = "qh", name = "b", descriptor = "(B)V")
    public static void method1070(byte arg0) {
        field2941 = null;
        field2935 = null;
        field2943 = null;
        field2937 = null;
        int var1 = -80 % ((arg0 - 83) / 38);
    }

    @OriginalMember(owner = "qh", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2938) {
            Object var1 = this.field2936;
            synchronized (this.field2936) {
                if (this.field2946 < 500) {
                    this.field2947[this.field2946] = class21.field479;
                    this.field2945[this.field2946] = class109.field2134;
                    this.field2946++;
                }
            }
            class54.method354(50L, -23);
        }
        field2932++;
    }
}
