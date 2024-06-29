import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class124 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lcf;")
    private static class93 field2201 = class147.method1066("Loading fonts )2 ", -48);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lcf;")
    public static class93 field2199 = class147.method1066("Angreifen", -48);

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
    public static int[] field2212 = new int[2];

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[J")
    public static long[] field2205 = new long[32];

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static volatile int field2204 = 0;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lcf;")
    public static class93 field2210 = field2201;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[[I")
    public static int[][] field2202 = new int[104][104];

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[I")
    public static int[] field2209 = new int[32];

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
    public static boolean field2211;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    public static int[] field2200;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method909(byte arg0) {
        field2214++;
        int var1 = -125 % ((arg0 - 5) / 56);
        class45.field733.method300(0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Lik;")
    public static final class259 method910(byte arg0, int arg1) {
        if (arg0 <= 24) {
            method909((byte) 36);
        }
        field2213++;
        class259 var2 = (class259) class152.field2668.method302((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field778.method1271(34, -2154, arg1);
        class259 var4 = new class259();
        if (var3 != null) {
            var4.method1748(0, new class280(var3), arg1);
        }
        class152.field2668.method297((long) arg1, var4, 10414);
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method911(int arg0) {
        class254.method1731(class148.field2611, (byte) 57);
        class273.field4857++;
        field2208++;
        if (class241.field4363 && class54.field894) {
            int var1 = class227.field4056;
            int var2 = var1 - class31.field493;
            int var3 = class157.field2793;
            int var4 = var3 - class74.field1353;
            if (var2 < class220.field3993) {
                var2 = class220.field3993;
            }
            int var5 = class148.field2611.field3185;
            if (var2 + class148.field2611.field3270 > class220.field3993 - -class1.field8.field3270) {
                var2 = class220.field3993 + class1.field8.field3270 - class148.field2611.field3270;
            }
            if (class233.field4153 > var4) {
                var4 = class233.field4153;
            }
            if (arg0 != -2) {
                field2200 = null;
            }
            int var6 = var2 - class160.field2819;
            if (class148.field2611.field3252 + var4 > class233.field4153 - -class1.field8.field3252) {
                var4 = class233.field4153 + class1.field8.field3252 - class148.field2611.field3252;
            }
            int var7 = class1.field8.field3310 + var2 - class220.field3993;
            int var8 = class1.field8.field3282 + var4 - class233.field4153;
            int var9 = var4 - class25.field317;
            if (class273.field4857 > class148.field2611.field3208 && (var6 > var5 || (-var5) > var6 || var9 > var5 || var9 < -var5)) {
                class56.field932 = true;
            }
            if (class148.field2611.field3181 != null && class56.field932) {
                class223 var10 = new class223();
                var10.field4017 = class148.field2611;
                var10.field4022 = var7;
                var10.field4015 = class148.field2611.field3181;
                var10.field4014 = var8;
                class106.method763(var10, (byte) -43);
            }
            if (class218.field3969 == 0) {
                if (class56.field932) {
                    if (class148.field2611.field3251 != null) {
                        class223 var11 = new class223();
                        var11.field4017 = class148.field2611;
                        var11.field4014 = var8;
                        var11.field4016 = class272.field4851;
                        var11.field4022 = var7;
                        var11.field4015 = class148.field2611.field3251;
                        class106.method763(var11, (byte) -86);
                    }
                    if (class272.field4851 != null && client.method1116(class148.field2611) != null) {
                        class160.field2823++;
                        class285.field5105.method1568(97, (byte) 116);
                        class285.field5105.method1892(class272.field4851.field3293, (byte) 124);
                        class285.field5105.method1906(1304783144, class272.field4851.field3219);
                        class285.field5105.method1892(class148.field2611.field3293, (byte) 122);
                        class285.field5105.method1906(1304783144, class148.field2611.field3219);
                    }
                } else if ((class67.field1227 == 1 || class73.method494(class253.field4549 - 1, -1)) && class253.field4549 > 2) {
                    class193.method1384((byte) -42);
                } else if (class253.field4549 > 0) {
                    class255.method1732(78);
                }
                class148.field2611 = null;
            }
        } else if (class273.field4857 > 1) {
            class148.field2611 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([BI)V")
    public static final void method912(byte[] arg0, int arg1) {
        field2203++;
        class280 var2 = new class280(arg0);
        var2.field5027 = arg0.length - 2;
        class245.field4415 = var2.method1891(arg1 ^ 0xFFFFFF86);
        class72.field1291 = new boolean[class245.field4415];
        class169.field2974 = new int[class245.field4415];
        class67.field1230 = new int[class245.field4415];
        class246.field4435 = new int[class245.field4415];
        class246.field4439 = new byte[class245.field4415][];
        class42.field663 = new int[class245.field4415];
        class255.field4614 = new byte[class245.field4415][];
        var2.field5027 = arg0.length - (class245.field4415 * 8) - 7;
        class153.field2693 = var2.method1891(-115);
        class226.field4044 = var2.method1891(-120);
        int var3 = (var2.method1907(16832) & 0xFF) + 1;
        for (int var4 = 0; var4 < class245.field4415; var4++) {
            class169.field2974[var4] = var2.method1891(-128);
        }
        for (int var5 = 0; var5 < class245.field4415; var5++) {
            class67.field1230[var5] = var2.method1891(class175.method1248(arg1, -117));
        }
        for (int var6 = 0; var6 < class245.field4415; var6++) {
            class246.field4435[var6] = var2.method1891(-123);
        }
        for (int var7 = 0; var7 < class245.field4415; var7++) {
            class42.field663[var7] = var2.method1891(-125);
        }
        var2.field5027 = arg0.length - (class245.field4415 * 8) - ((var3 + -1) * 3) - 7;
        class248.field4475 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class248.field4475[var8] = var2.method1893((byte) -125);
            if (class248.field4475[var8] == 0) {
                class248.field4475[var8] = 1;
            }
        }
        var2.field5027 = arg1;
        for (int var9 = 0; var9 < class245.field4415; var9++) {
            int var10 = class246.field4435[var9];
            int var11 = class42.field663[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class255.field4614[var9] = var13;
            boolean var15 = false;
            class246.field4439[var9] = var14;
            int var16 = var2.method1907(16832);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1925(true);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method1925(true);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label97: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var10) {
                                break label97;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var10 * var22 + var21] = var2.method1925(true);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var13[var10 * var24 + var20] = var2.method1925(true);
                    }
                    var20++;
                }
            }
            class72.field1291[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static final void method913(byte arg0) {
        class126.field2235 = class195.field3554;
        class200.field3624 = class162.field2868;
        class258.field4648 = class89.field1580;
        class76.field1416 = client.field2732;
        class258.field4646 = class24.field300;
        class156.field2763 = class214.field3918;
        class32.field502 = class137.field2398;
        class263.field4689 = class61.field1025;
        class126.field2239 = class196.field3594;
        class200.field3621 = class73.field1343;
        class134.field2349 = class268.field4785;
        class42.field662 = class241.field4362;
        class104.field1807 = class163.field2876;
        class19.field255 = class167.field2947;
        class264.field4704 = class74.field1375;
        class263.field4694 = class258.field4644;
        class228.field4093 = class55.field917;
        class18.field233 = class200.field3630;
        class68.field1236 = class24.field309;
        class19.field253 = class231.field4132;
        field2210 = class148.field2602;
        class256.field4618 = class26.field338;
        if (arg0 != -107) {
            field2209 = null;
        }
        class152.field2671 = class180.field3169;
        class48.field781 = class121.field2177;
        class43.field696 = class82.field1510;
        class32.field509 = class19.field248;
        class249.field4483 = class149.field2615;
        class185.field3414 = class54.field898;
        class129.field2266 = class44.field703;
        class205.field3697 = class288.field5145;
        class253.field4566 = class18.field243;
        class70.field1281 = class198.field3597;
        class129.field2278 = class288.field5142;
        class156.field2768 = class200.field3640;
        class11.field154 = class172.field3016;
        class280.field5041 = class120.field2137;
        class53.field884 = class287.field5135;
        class251.field4522 = class227.field4069;
        class234.field4180 = class247.field4444;
        class104.field1800 = class149.field2616;
        class8.field109 = class287.field5134;
        class31.field501 = class214.field3916;
        class151.field2645 = class267.field4742;
        class78.field1464 = class188.field3462;
        class181.field3226 = class50.field797;
        class177.field3103 = class33.field524;
        class85.field1548 = class277.field4961;
        class46.field749 = class6.field81;
        class5.field72 = class208.field3726;
        class19.field245 = class93.field1639;
        class257.field4633 = class156.field2764;
        class177.field3094 = class33.field524;
        class45.field735 = class187.field3446;
        class73.field1337 = class279.field4990;
        class141.field2444 = class5.field73;
        class35.field541 = class82.field1514;
        class51.field846 = class182.field3363;
        class140.field2430 = class45.field734;
        class66.field1218 = class56.field931;
        class220.field3997 = class260.field4677;
        class266.field4735 = class200.field3638;
        class15.field204 = class78.field1468;
        class232.field4137 = class25.field313;
        class200.field3635 = class183.field3377;
        class50.field830 = class232.field4136;
        class285.field5108 = class185.field3404;
        class1.field9 = class223.field4021;
        class183.field3379 = class38.field577;
        class271.field4824 = class57.field969;
        class282.field5071 = class235.field4205;
        field2206++;
        class147.field2591 = class155.field2712;
        class276.field4956 = class86.field1560;
        class86.field1556 = class147.field2583;
        class277.field4969 = class25.field318;
        class181.field3338 = class111.field1896;
        class5.field69 = class5.field61;
        class76.field1420 = class252.field4547;
        class147.field2594 = class275.field4925;
        class183.field3380 = class38.field577;
        class156.field2767 = class214.field3918;
        class276.field4942 = class105.field1825;
        class101.field1756 = class279.field4985;
        class217.field3954 = class102.field1773;
        class151.field2646 = class144.field2493;
        class31.field496 = class146.field2578;
        class68.field1247 = class51.field838;
        class111.field1895 = client.field2726;
        class205.field3698 = class105.field1816;
        class131.field2322 = class76.field1423;
        class275.field4927 = class186.field3433;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method914(int arg0) {
        field2205 = null;
        if (arg0 <= 57) {
            return;
        }
        field2202 = null;
        field2201 = null;
        field2199 = null;
        field2210 = null;
        field2200 = null;
        field2209 = null;
        field2212 = null;
    }
}
