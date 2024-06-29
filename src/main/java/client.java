import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class237 {

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3481 = 0;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 4)
    public static final void method1529() {
        int var0 = class237.field3185 ? class65.field861 : class65.field861 + class198.field2637;
        for (int var1 = -1; var1 < var0; var1++) {
            class298 var2;
            if (var1 < 0) {
                var2 = class227.field2988;
            } else if (var1 < class65.field861) {
                var2 = class206.field2777[class229.field3071[var1]];
            } else {
                var2 = class306.field4496[class398.field5938[var1 - class65.field861]];
            }
            var2.field4308 = 0;
            if (var2.field4319 < 0) {
                var2.field4334 = false;
            } else {
                int var3 = var2.method168(-115);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field740 & 0x7F) != 0 || (var2.field734 & 0x7F) != 0) {
                        var2.field4334 = false;
                        continue;
                    }
                } else if ((var2.field740 & 0x7F) != 64 || (var2.field734 & 0x7F) != 64) {
                    var2.field4334 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field740 >> 7;
                    int var5 = var2.field734 >> 7;
                    if (class181.field2391[var4][var5] != var2.field4319) {
                        var2.field4334 = true;
                        continue;
                    }
                    if (class56.field769[var4][var5] > 1) {
                        var10002 = class56.field769[var4][var5]--;
                        var2.field4334 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field740 - var6 >> 7;
                    int var8 = var2.field734 - var6 >> 7;
                    int var9 = var2.field740 + var6 >> 7;
                    int var10 = var2.field734 + var6 >> 7;
                    if (!class277.method1910(var7, var8, var2.field4319, var9, var10, -2)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class181.field2391[var11][var12] == var2.field4319) {
                                    var10002 = class56.field769[var11][var12]--;
                                }
                            }
                        }
                        var2.field4334 = true;
                        continue;
                    }
                }
                if (var2 instanceof class25 && var2.field4368 != null && class28.field418 >= var2.field4351 && class28.field418 < var2.field4355) {
                    ((class25) var2).field330 = false;
                }
                var2.field4334 = false;
                var2.field729 = class52.method359((byte) -116, var2.field734, var2.field740, class227.field2981);
                class21.method146(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 120)
    public static final void method1530() {
        for (int var0 = -1; var0 < class65.field861 + class198.field2637; var0++) {
            class298 var1;
            if (var0 < 0) {
                var1 = class227.field2988;
            } else if (var0 < class65.field861) {
                var1 = class206.field2777[class229.field3071[var0]];
            } else {
                var1 = class306.field4496[class398.field5938[var0 - class65.field861]];
            }
            if (var1.field4319 >= 0) {
                int var2 = var1.method168(-124);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field740 & 0x7F) != 0 || (var1.field734 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field740 & 0x7F) != 64 || (var1.field734 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field740 >> 7;
                    int var4 = var1.field734 >> 7;
                    if (var1.field4319 > class181.field2391[var3][var4]) {
                        class181.field2391[var3][var4] = var1.field4319;
                        class56.field769[var3][var4] = 1;
                    } else if (class181.field2391[var3][var4] == var1.field4319) {
                        var10002 = class56.field769[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field740 - var5 >> 7;
                    int var7 = var1.field734 - var5 >> 7;
                    int var8 = var1.field740 + var5 >> 7;
                    int var9 = var1.field734 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field4319 > class181.field2391[var10][var11]) {
                                class181.field2391[var10][var11] = var1.field4319;
                                class56.field769[var10][var11] = 1;
                            } else if (class181.field2391[var10][var11] == var1.field4319) {
                                var10002 = class56.field769[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 214)
    public final void method1437(boolean arg0) {
        field3480++;
        class153.method958((byte) -115);
        class343.method2238(-118);
        class237.method1431((byte) -3);
        class219.method1280((byte) 107);
        class177.method1081(arg0);
        class405.method2609(31542);
        class110.method723(32186);
        class194.method1165(-2001);
        class228.method1322(false);
        class233.method1395(-1);
        class445.method2803((byte) -62);
        class248.method1496(101);
        class347.method2260((byte) -104);
        class278.method1926((byte) 127);
        class241.method1449((byte) 74);
        class189.method1140((byte) 104);
        class43.method314(-85);
        class1.method15(false);
        class270.method1860((byte) -125);
        class252.method1528(false);
        class65.method446(0);
        class439.method2762(21490);
        class162.method1006((byte) 62);
        class394.method2531(-30003);
        class309.method2103((byte) -25);
        class25.method177(94);
        class56.method382(true);
        class47.method341((byte) -32);
        class152.method955(false);
        class422.method2694((byte) 6);
        class199.method1182((byte) -123);
        class70.method475((byte) 52);
        class202.method1197(89);
        class296.method2026(110);
        class12.method88((byte) -119);
        class298.method2045(50);
        class273.method1892((byte) 72);
        class254.method1550(0);
        class306.method2087((byte) 72);
        class200.method1186((byte) -120);
        class169.method1044(0);
        class304.method2071(false);
        class139.method898(124);
        class313.method2115(0);
        class245.method1485(-1);
        class375.method2426(0);
        class367.method2390((byte) 56);
        class420.method2686(-2);
        class183.method1118((byte) 114);
        class45.method326(81);
        class346.method2248(false);
        class3.method21(24941);
        class102.method687(-115);
        class10.method77((byte) 91);
        class442.method2781(-19);
        class316.method2133(15);
        class407.method2626(91);
        class119.method770((byte) 108);
        class291.method1980((byte) 102);
        class372.method2410((byte) -32);
        class142.method901(0);
        class163.method1012(-111);
        class104.method703((byte) -120);
        class324.method2179(-74);
        class438.method2753(-1);
        class63.method437(-32635);
        class249.method1511((byte) 65);
        class83.method597(3);
        class178.method1085((byte) -58);
        class236.method1414(3);
        class368.method2394(1);
        class122.method779(-116);
        class397.method2553(true);
        class140.method899(true);
        class400.method2576((byte) 71);
        class265.method1819(-84);
        class87.method615(false);
        class423.method2699((byte) -66);
        class403.method2602(-126);
        class76.method564((byte) 127);
        class92.method646(false);
        class243.method1458(10);
        class57.method394(-124);
        class120.method773(true);
        class211.method1258((byte) -121);
        class18.method131();
        class307.method2091(62);
        class35.method239(0);
        class315.method2129(-102);
        class356.method2335(-10380);
        class8.method62(1);
        class130.method819(0);
        class39.method280((byte) 35);
        class123.method780();
        class293.method1991();
        class247.method1489(5787);
        class246.method1488((byte) 76);
        class427.method2713();
        class179.method1096((byte) -32);
        class7.method56((byte) 80);
        class4.method28((byte) -121);
        class26.method188(0);
        class418.method2676(true);
        class444.method2793(11910);
        class294.method2007(false);
        class59.method413(2);
        class99.method670((byte) -106);
        class225.method1305((byte) -68);
        class100.method683(true);
        class284.method1957((byte) -95);
        class264.method1813((byte) 109);
        class40.method286((byte) -116);
        class333.method2197((byte) 125);
        class197.method1173((byte) -10);
        class302.method2063(0);
        class396.method2547(12);
        class300.method2053(-129);
        class373.method2412(-22313);
        class426.method2709(-128);
        class277.method1911((byte) 123);
        class379.method2459(0);
        class449.method2818(-32);
        class295.method2014(126);
        class318.method2145(3);
        class353.method2323(0);
        class395.method2538(79);
        class230.method1386(19);
        class399.method2566(-1719249469);
        class23.method153(-1412584499);
        class166.method1020(0);
        class312.method2111(119);
        class253.method1549(-12704);
        class282.method1940((byte) 102);
        class431.method2730(0);
        class223.method1299(-1);
        class275.method1897((byte) -123);
        class269.method1832();
        class393.method2516((byte) 93);
        class435.method2745(true);
        class41.method296(-13);
        class192.method1156((byte) 105);
        class145.method928(-97);
        class55.method375(0);
        class126.method803((byte) -108);
        class382.method2472(-10250);
        class415.method2645((byte) 76);
        class6.method34();
        class75.method561((byte) -104);
        class432.method2734(0);
        class227.method1314(false);
        class147.method935((byte) -21);
        class308.method2099((byte) -24);
        class328.method2186((byte) -96);
        class21.method144(18269);
        class98.method669(true);
        class288.method1965((byte) 84);
        class174.method1071((byte) -13);
        class226.method1313((byte) -86);
        class72.method532((byte) -50);
        class129.method817(-127);
        class11.method78((byte) 112);
        class205.method1214(1);
        class416.method2648(117);
        class263.method1805(-44);
        class365.method2383(1);
        class182.method1109(2);
        class90.method632(1);
        class366.method2388(false);
        class411.method2635(true);
        class5.method32(98);
        class222.method1291();
        class339.method2221((byte) -91);
        class73.method534(4306);
        class71.method513(false);
        class52.method365(126);
        class286.method1962(-26507);
        class259.method1794(-24262);
        class390.method2507(!arg0);
        class38.method276((byte) 123);
        class156.method969(58);
        class268.method1828(43);
        class349.method2303(true);
        class317.method2140(-31510);
        class62.method431(12047);
        class164.method1014(-69);
        class448.method2816((byte) 126);
        class340.method2222();
        class215.method1267(2);
        class362.method2370(-119);
        class191.method1153(0);
        class414.method2639(14);
        class96.method659((byte) 116);
        class135.method851(-17);
        class157.method975(64);
        class235.method1405(-16777216);
        class377.method2446(false);
        class289.method1970();
        class424.method2703(-105);
        class380.method2468((byte) 60);
        class86.method612((byte) -118);
        class242.method1455(-4);
        class376.method2433(-108);
        class354.method2330(1);
        class374.method2420(true);
        class412.method2636();
        class37.method273();
        class363.method2373((byte) 23);
        class61.method427((byte) 117);
        class260.method1798(7395);
        class451.method2823((byte) -118);
        class134.method843(6);
        class279.method1932(32324);
        class240.method1442(83);
        class48.method346(125);
        class196.method1172(-66);
        class370.method2398();
        class305.method2081();
        class89.method628(250);
        class106.method713(true);
        class170.method1048();
        class84.method605(!arg0);
        class398.method2564(0);
        class193.method1162(1);
        class229.method1381(14);
        class335.method2208((byte) -93);
        class42.method304(arg0);
        class384.method2477((byte) -87);
        class218.method1275((byte) 67);
        class369.method2395(-1172);
        class385.method2481(false);
        class267.method1827((byte) -60);
        class201.method1192(true);
        class27.method190(-23358);
        class319.method2148(100);
        class143.method911(false);
        class171.method1055(2);
        class32.method217(110);
        class262.method1803(false);
        class213.method1263((byte) -85);
        class310.method2108((byte) 118);
        class112.method730((byte) -120);
        class93.method652(-19935);
        class17.method107((byte) 84);
        class9.method75(false);
        class131.method828((byte) 115);
        class185.method1128(-100);
        class125.method797(100);
        class88.method623(8);
        class419.method2681(22273);
        class250.method1516((byte) -108);
        class447.method2810((byte) 77);
        class198.method1178(95);
        class117.method759(4096);
        class69.method464(0);
        class31.method211(!arg0);
        class184.method1120((byte) 7);
        class234.method1403(0);
        class138.method893((byte) -116);
        class165.method1018(false);
        class364.method2381(4096);
        class244.method1467(100);
        class16.method98((byte) 28);
        class331.method2195((byte) -21);
        class103.method689(51);
        class94.method655(115);
        class329.method2191((byte) -52);
        class15.method96(true);
        class148.method937((byte) -70);
        class323.method2172(arg0);
        class149.method942(false);
        class124.method788(75);
        class181.method1104((byte) 82);
        class146.method930(23466);
        class44.method318(-1);
        class161.method992(-77);
        class167.method1031(4590);
        class118.method768(5513);
        class255.method1600();
        class85.method609();
        class188.method1133(17);
        class281.method1939((byte) -64);
        class28.method196(6860);
        class261.method1799(-128);
        class159.method989(0);
        class180.method1100(47);
        class33.method223(85);
        class406.method2618((byte) -97);
        class151.method947(256);
        class173.method1067(55);
        class115.method736(true);
        class434.method2740(-26801);
        class105.method711(255);
        class272.method1872(-115);
        class276.method1903(-1);
        class283.method1949(87);
        class430.method2723(83);
        class144.method921((byte) 86);
        class212.method1260(-18763);
        class22.method148(-338092991);
        class388.method2496(true);
        class30.method204(true);
        class34.method229(-1);
        class206.method1218(-540);
        class321.method2162((byte) 105);
        class195.method1167((byte) 123);
        class410.method2630((byte) 28);
        if (class237.field3189) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lps;IIIIIII)V", line = 529)
    public static final void method1531(class394[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class394 var9 = arg0[var8];
            if (var9 != null && var9.field5639 == arg1) {
                int var10 = var9.field5821 + arg6;
                int var11 = var9.field5779 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field5671 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field5773 + var10;
                    int var17 = var9.field5672 + var11;
                    if (var9.field5671 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (!var9.field5790 || var9.field5671 == 0 || var9.field5772 || method1544(var9).field4475 != 0 || class179.field2370 == var9 || var9.field5654 == 1338) {
                    if (!var9.field5790 || !method1546(var9)) {
                        if (class16.field224 == var9) {
                            class69.field887 = true;
                            class56.field758 = var10;
                            class319.field4666 = var11;
                        }
                        if (!var9.field5790 || var9.field5665 || var12 < var14 && var13 < var15) {
                            if (var9.field5671 == 0) {
                                if (!var9.field5790 && method1546(var9) && class96.field1358 != var9) {
                                    continue;
                                }
                                if (var9.field5718 && class124.field1728 >= var12 && class323.field4747 >= var13 && class124.field1728 < var14 && class323.field4747 < var15) {
                                    for (class192 var18 = (class192) class234.field3126.method332(-2130841184); var18 != null; var18 = (class192) class234.field3126.method343((byte) -108)) {
                                        if (var18.field2567) {
                                            var18.method322(11);
                                            var18.field2566.field5673 = false;
                                        }
                                    }
                                    if (class396.field5871 == 0) {
                                        class16.field224 = null;
                                        class179.field2370 = null;
                                    }
                                    class435.field6397 = 0;
                                    class265.field3841 = false;
                                    class230.field3076 = false;
                                    if (!class2.field26) {
                                        class71.method520(125);
                                    }
                                }
                            }
                            boolean var19;
                            if (class124.field1728 >= var12 && class323.field4747 >= var13 && class124.field1728 < var14 && class323.field4747 < var15) {
                                var19 = true;
                            } else {
                                var19 = false;
                            }
                            if (!class2.field26 && var19) {
                                class380.method2466(var9, class124.field1728 - var10, class323.field4747 - var11, -1);
                            }
                            if (var9.field5790) {
                                boolean var20 = false;
                                if (class129.field1788 == 1 && var19) {
                                    var20 = true;
                                }
                                boolean var21 = false;
                                if (class252.field3464 == 1 && class319.field4668 >= var12 && class32.field453 >= var13 && class319.field4668 < var14 && class32.field453 < var15) {
                                    var21 = true;
                                }
                                if (var9.field5641 != null) {
                                    for (int var22 = 0; var22 < var9.field5641.length; var22++) {
                                        if (class30.field437[var9.field5641[var22]]) {
                                            if (var9.field5796 == null || class28.field418 >= var9.field5796[var22]) {
                                                byte var23 = var9.field5806[var22];
                                                if (var23 == 0 || ((var23 & 0x8) == 0 || !class30.field437[86] && !class30.field437[82] && !class30.field437[81]) && ((var23 & 0x2) == 0 || class30.field437[86]) && ((var23 & 0x1) == 0 || class30.field437[82]) && ((var23 & 0x4) == 0 || class30.field437[81])) {
                                                    class403.method2601(-1, var9.field5698, var22 + 1, "", (byte) 104);
                                                    int var24 = var9.field5822[var22];
                                                    if (var9.field5796 == null) {
                                                        var9.field5796 = new int[var9.field5641.length];
                                                    }
                                                    if (var24 == 0) {
                                                        var9.field5796[var22] = Integer.MAX_VALUE;
                                                    } else {
                                                        var9.field5796[var22] = class28.field418 + var24;
                                                    }
                                                }
                                            }
                                        } else if (var9.field5796 != null) {
                                            var9.field5796[var22] = 0;
                                        }
                                    }
                                }
                                if (var21) {
                                    class333.method2200(var9, 872, class32.field453 - var11, class319.field4668 - var10);
                                }
                                if (class16.field224 != null && class16.field224 != var9 && var19 && method1544(var9).method2074(97)) {
                                    class244.field3258 = var9;
                                }
                                if (class179.field2370 == var9) {
                                    class218.field2881 = true;
                                    class71.field996 = var10;
                                    class302.field4446 = var11;
                                }
                                if (var9.field5772 || var9.field5654 != 0) {
                                    if (var19 && class349.field5060 != 0 && var9.field5781 != null) {
                                        class192 var25 = new class192();
                                        var25.field2567 = true;
                                        var25.field2566 = var9;
                                        var25.field2568 = class349.field5060;
                                        var25.field2578 = var9.field5781;
                                        class234.field3126.method330(var25, -2130841184);
                                    }
                                    if (class16.field224 != null || class192.field2570 != null || class2.field26 || var9.field5654 != 1400 && class435.field6397 > 0) {
                                        var21 = false;
                                        var20 = false;
                                        var19 = false;
                                    }
                                    if (var9.field5654 != 0) {
                                        if (var9.field5654 == 1337 || var9.field5654 == 1403) {
                                            class393.field5624 = var9;
                                            if (class247.field3331 != null) {
                                                class247.field3331.method2765(var9.field5672, class61.field807, 90);
                                            }
                                            if (var9.field5654 == 1337) {
                                                if (!class2.field26 && var19) {
                                                    class310.method2106((byte) -58, class61.field807);
                                                    for (class413 var26 = (class413) class407.field6039.method1005(77); var26 != null; var26 = (class413) class407.field6039.method1009(false)) {
                                                        if (class124.field1728 >= var26.field6084 && class124.field1728 < var26.field6082 && class323.field4747 >= var26.field6080 && class323.field4747 < var26.field6081) {
                                                            class71.method520(127);
                                                            class329.method2187(-99, var26.field6077);
                                                        }
                                                    }
                                                }
                                                class97.method662(var9, var10, var11, 0);
                                                continue;
                                            }
                                        }
                                        if (var9.field5654 == 1338) {
                                            if (var9.method2525((byte) 42, class61.field807) == null || class351.field5090 != 0 && class351.field5090 != 3 || class2.field26 || !var19) {
                                                continue;
                                            }
                                            int var27 = class124.field1728 - var10;
                                            int var28 = class323.field4747 - var11;
                                            int var29 = var9.field5708[var28];
                                            if (var27 < var29 || var27 > var9.field5679[var28] + var29) {
                                                continue;
                                            }
                                            int var30 = var27 - var9.field5773 / 2;
                                            int var31 = var28 - var9.field5672 / 2;
                                            int var32;
                                            if (class346.field4979 == 4) {
                                                var32 = (int) class396.field5847 & 0x3FFF;
                                            } else {
                                                var32 = (int) class396.field5847 + class399.field5948 & 0x3FFF;
                                            }
                                            int var33 = class117.field1644[var32];
                                            int var34 = class117.field1636[var32];
                                            if (class346.field4979 != 4) {
                                                var33 = (class364.field5261 + 256) * var33 >> 8;
                                                var34 = (class364.field5261 + 256) * var34 >> 8;
                                            }
                                            int var35 = var30 * var34 + var31 * var33 >> 15;
                                            int var36 = var31 * var34 - var30 * var33 >> 15;
                                            int var37;
                                            int var38;
                                            if (class346.field4979 == 4) {
                                                var37 = (class363.field5238 >> 7) + (var35 >> 2);
                                                var38 = (class122.field1687 >> 7) - (var36 >> 2);
                                            } else {
                                                int var39 = (class227.field2988.method168(-115) - 1) * 64;
                                                var37 = (class227.field2988.field740 - var39 >> 7) + (var35 >> 2);
                                                var38 = (class227.field2988.field734 - var39 >> 7) - (var36 >> 2);
                                            }
                                            if (class263.field3821 && (class189.field2547 & 0x40) != 0) {
                                                class394 var40 = class388.method2492((byte) -123, class306.field4506, class442.field6471);
                                                if (var40 == null) {
                                                    class151.method946(117);
                                                } else {
                                                    class41.method299(var38, class445.field6532, class394.field5739, 1L, " ->", 4, false, var37);
                                                }
                                                continue;
                                            }
                                            if (class71.field1017 == 1) {
                                                class41.method299(var38, -1, class407.field6037, 1L, "", 11, false, var37);
                                            }
                                            class41.method299(var38, -1, class319.field4669, 1L, "", 60, false, var37);
                                            continue;
                                        }
                                        if (var9.field5654 == 1400) {
                                            class259.field3785 = var9;
                                            if (var19) {
                                                class265.field3841 = true;
                                            }
                                            if (var21) {
                                                int var41 = (int) ((double) (class319.field4668 - var10 - var9.field5773 / 2) * 2.0D / (double) class293.field4176);
                                                int var42 = (int) (-((double) (class32.field453 - var11 - var9.field5672 / 2) * 2.0D / (double) class293.field4176));
                                                int var43 = class44.field624 + var41 + class293.field4205;
                                                int var44 = class373.field5426 + var42 + class293.field4197;
                                                class252 var45 = class236.method1415((byte) -69);
                                                if (var45 == null) {
                                                    continue;
                                                }
                                                int[] var46 = new int[3];
                                                var45.method1521(var46, var43, var44, (byte) -63);
                                                if (var46 != null) {
                                                    if (class30.field437[82] && class185.field2510 > 0) {
                                                        class316.method2134(var46[1], var46[2], var46[0], -87);
                                                        continue;
                                                    }
                                                    class230.field3076 = true;
                                                    class184.field2487 = var46[0];
                                                    class2.field28 = var46[1];
                                                    class156.field2119 = var46[2];
                                                }
                                                class435.field6397 = 1;
                                                class45.field642 = false;
                                                class218.field2886 = class124.field1728;
                                                class252.field3471 = class323.field4747;
                                                continue;
                                            }
                                            if (var20 && class435.field6397 > 0) {
                                                if (class435.field6397 == 1 && (class218.field2886 != class124.field1728 || class323.field4747 != class252.field3471)) {
                                                    class153.field2074 = class44.field624;
                                                    class365.field5267 = class373.field5426;
                                                    class435.field6397 = 2;
                                                }
                                                if (class435.field6397 == 2) {
                                                    class45.field642 = true;
                                                    class17.method106(1024, (int) ((double) (class218.field2886 - class124.field1728) * 2.0D / (double) class293.field4179) + class153.field2074);
                                                    class362.method2365(class365.field5267 - (int) ((double) (class252.field3471 - class323.field4747) * 2.0D / (double) class293.field4179), -1);
                                                }
                                                continue;
                                            }
                                            if (class435.field6397 > 0 && !class45.field642) {
                                                if ((class88.field1232 == 1 || class194.method1163(false)) && class212.field2844 > 2) {
                                                    class432.method2736(0, 2);
                                                } else if (class308.method2095(-22199)) {
                                                    class432.method2736(0, 1);
                                                }
                                            }
                                            class435.field6397 = 0;
                                            continue;
                                        }
                                        if (var9.field5654 == 1401) {
                                            if (var20) {
                                                class281.method1937(4096, class323.field4747 - var11, var9.field5773, class124.field1728 - var10, var9.field5672);
                                            }
                                            continue;
                                        }
                                        if (var9.field5654 == 1402) {
                                            class407.method2621(var9, 15);
                                            continue;
                                        }
                                        if (var9.field5654 == 1406) {
                                            class300.method2057(var9, var11, var10, (byte) -51);
                                            continue;
                                        }
                                    }
                                    if (!var9.field5647 && var21) {
                                        var9.field5647 = true;
                                        if (var9.field5678 != null) {
                                            class192 var47 = new class192();
                                            var47.field2567 = true;
                                            var47.field2566 = var9;
                                            var47.field2583 = class319.field4668 - var10;
                                            var47.field2568 = class32.field453 - var11;
                                            var47.field2578 = var9.field5678;
                                            class234.field3126.method330(var47, -2130841184);
                                        }
                                    }
                                    if (var9.field5647 && var20 && var9.field5664 != null) {
                                        class192 var48 = new class192();
                                        var48.field2567 = true;
                                        var48.field2566 = var9;
                                        var48.field2583 = class124.field1728 - var10;
                                        var48.field2568 = class323.field4747 - var11;
                                        var48.field2578 = var9.field5664;
                                        class234.field3126.method330(var48, -2130841184);
                                    }
                                    if (var9.field5647 && !var20) {
                                        var9.field5647 = false;
                                        if (var9.field5801 != null) {
                                            class192 var49 = new class192();
                                            var49.field2567 = true;
                                            var49.field2566 = var9;
                                            var49.field2583 = class124.field1728 - var10;
                                            var49.field2568 = class323.field4747 - var11;
                                            var49.field2578 = var9.field5801;
                                            class331.field4812.method330(var49, -2130841184);
                                        }
                                    }
                                    if (var20 && var9.field5697 != null) {
                                        class192 var50 = new class192();
                                        var50.field2567 = true;
                                        var50.field2566 = var9;
                                        var50.field2583 = class124.field1728 - var10;
                                        var50.field2568 = class323.field4747 - var11;
                                        var50.field2578 = var9.field5697;
                                        class234.field3126.method330(var50, -2130841184);
                                    }
                                    if (!var9.field5673 && var19) {
                                        var9.field5673 = true;
                                        if (var9.field5787 != null) {
                                            class192 var51 = new class192();
                                            var51.field2567 = true;
                                            var51.field2566 = var9;
                                            var51.field2583 = class124.field1728 - var10;
                                            var51.field2568 = class323.field4747 - var11;
                                            var51.field2578 = var9.field5787;
                                            class234.field3126.method330(var51, -2130841184);
                                        }
                                    }
                                    if (var9.field5673 && var19 && var9.field5686 != null) {
                                        class192 var52 = new class192();
                                        var52.field2567 = true;
                                        var52.field2566 = var9;
                                        var52.field2583 = class124.field1728 - var10;
                                        var52.field2568 = class323.field4747 - var11;
                                        var52.field2578 = var9.field5686;
                                        class234.field3126.method330(var52, -2130841184);
                                    }
                                    if (var9.field5673 && !var19) {
                                        var9.field5673 = false;
                                        if (var9.field5791 != null) {
                                            class192 var53 = new class192();
                                            var53.field2567 = true;
                                            var53.field2566 = var9;
                                            var53.field2583 = class124.field1728 - var10;
                                            var53.field2568 = class323.field4747 - var11;
                                            var53.field2578 = var9.field5791;
                                            class331.field4812.method330(var53, -2130841184);
                                        }
                                    }
                                    if (var9.field5786 != null) {
                                        class192 var54 = new class192();
                                        var54.field2566 = var9;
                                        var54.field2578 = var9.field5786;
                                        class447.field6555.method330(var54, -2130841184);
                                    }
                                    if (var9.field5778 != null && class309.field4552 > var9.field5632) {
                                        if (var9.field5656 == null || class309.field4552 - var9.field5632 > 32) {
                                            class192 var59 = new class192();
                                            var59.field2566 = var9;
                                            var59.field2578 = var9.field5778;
                                            class234.field3126.method330(var59, -2130841184);
                                        } else {
                                            label688: for (int var55 = var9.field5632; var55 < class309.field4552; var55++) {
                                                int var56 = class62.field817[var55 & 0x1F];
                                                for (int var57 = 0; var57 < var9.field5656.length; var57++) {
                                                    if (var9.field5656[var57] == var56) {
                                                        class192 var58 = new class192();
                                                        var58.field2566 = var9;
                                                        var58.field2578 = var9.field5778;
                                                        class234.field3126.method330(var58, -2130841184);
                                                        break label688;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field5632 = class309.field4552;
                                    }
                                    if (var9.field5743 != null && class247.field3334 > var9.field5633) {
                                        if (var9.field5797 == null || class247.field3334 - var9.field5633 > 32) {
                                            class192 var64 = new class192();
                                            var64.field2566 = var9;
                                            var64.field2578 = var9.field5743;
                                            class234.field3126.method330(var64, -2130841184);
                                        } else {
                                            label668: for (int var60 = var9.field5633; var60 < class247.field3334; var60++) {
                                                int var61 = class201.field2703[var60 & 0x1F];
                                                for (int var62 = 0; var62 < var9.field5797.length; var62++) {
                                                    if (var9.field5797[var62] == var61) {
                                                        class192 var63 = new class192();
                                                        var63.field2566 = var9;
                                                        var63.field2578 = var9.field5743;
                                                        class234.field3126.method330(var63, -2130841184);
                                                        break label668;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field5633 = class247.field3334;
                                    }
                                    if (var9.field5714 != null && class159.field2151 > var9.field5663) {
                                        if (var9.field5648 == null || class159.field2151 - var9.field5663 > 32) {
                                            class192 var69 = new class192();
                                            var69.field2566 = var9;
                                            var69.field2578 = var9.field5714;
                                            class234.field3126.method330(var69, -2130841184);
                                        } else {
                                            label648: for (int var65 = var9.field5663; var65 < class159.field2151; var65++) {
                                                int var66 = class42.field581[var65 & 0x1F];
                                                for (int var67 = 0; var67 < var9.field5648.length; var67++) {
                                                    if (var9.field5648[var67] == var66) {
                                                        class192 var68 = new class192();
                                                        var68.field2566 = var9;
                                                        var68.field2578 = var9.field5714;
                                                        class234.field3126.method330(var68, -2130841184);
                                                        break label648;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field5663 = class159.field2151;
                                    }
                                    if (var9.field5695 != null && class346.field4983 > var9.field5784) {
                                        if (var9.field5652 == null || class346.field4983 - var9.field5784 > 32) {
                                            class192 var74 = new class192();
                                            var74.field2566 = var9;
                                            var74.field2578 = var9.field5695;
                                            class234.field3126.method330(var74, -2130841184);
                                        } else {
                                            label628: for (int var70 = var9.field5784; var70 < class346.field4983; var70++) {
                                                int var71 = class61.field808[var70 & 0x1F];
                                                for (int var72 = 0; var72 < var9.field5652.length; var72++) {
                                                    if (var9.field5652[var72] == var71) {
                                                        class192 var73 = new class192();
                                                        var73.field2566 = var9;
                                                        var73.field2578 = var9.field5695;
                                                        class234.field3126.method330(var73, -2130841184);
                                                        break label628;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field5784 = class346.field4983;
                                    }
                                    if (var9.field5734 != null && class241.field3230 > var9.field5808) {
                                        if (var9.field5780 == null || class241.field3230 - var9.field5808 > 32) {
                                            class192 var79 = new class192();
                                            var79.field2566 = var9;
                                            var79.field2578 = var9.field5734;
                                            class234.field3126.method330(var79, -2130841184);
                                        } else {
                                            label608: for (int var75 = var9.field5808; var75 < class241.field3230; var75++) {
                                                int var76 = class125.field1763[var75 & 0x1F];
                                                for (int var77 = 0; var77 < var9.field5780.length; var77++) {
                                                    if (var9.field5780[var77] == var76) {
                                                        class192 var78 = new class192();
                                                        var78.field2566 = var9;
                                                        var78.field2578 = var9.field5734;
                                                        class234.field3126.method330(var78, -2130841184);
                                                        break label608;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field5808 = class241.field3230;
                                    }
                                    if (class355.field5139 > var9.field5726 && var9.field5768 != null) {
                                        class192 var80 = new class192();
                                        var80.field2566 = var9;
                                        var80.field2578 = var9.field5768;
                                        class234.field3126.method330(var80, -2130841184);
                                    }
                                    if (class416.field6111 > var9.field5726 && var9.field5814 != null) {
                                        class192 var81 = new class192();
                                        var81.field2566 = var9;
                                        var81.field2578 = var9.field5814;
                                        class234.field3126.method330(var81, -2130841184);
                                    }
                                    if (class368.field5317 > var9.field5726 && var9.field5815 != null) {
                                        class192 var82 = new class192();
                                        var82.field2566 = var9;
                                        var82.field2578 = var9.field5815;
                                        class234.field3126.method330(var82, -2130841184);
                                    }
                                    if (class346.field4976 > var9.field5726 && var9.field5677 != null) {
                                        class192 var83 = new class192();
                                        var83.field2566 = var9;
                                        var83.field2578 = var9.field5677;
                                        class234.field3126.method330(var83, -2130841184);
                                    }
                                    if (class367.field5298 > var9.field5726 && var9.field5684 != null) {
                                        class192 var84 = new class192();
                                        var84.field2566 = var9;
                                        var84.field2578 = var9.field5684;
                                        class234.field3126.method330(var84, -2130841184);
                                    }
                                    var9.field5726 = class207.field2788;
                                    if (var9.field5738 != null) {
                                        for (int var85 = 0; var85 < class254.field3526; var85++) {
                                            class192 var86 = new class192();
                                            var86.field2566 = var9;
                                            var86.field2581 = class192.field2575[var85];
                                            var86.field2569 = class369.field5332[var85];
                                            var86.field2578 = var9.field5738;
                                            class234.field3126.method330(var86, -2130841184);
                                        }
                                    }
                                    if (class39.field539 && var9.field5792 != null) {
                                        class192 var87 = new class192();
                                        var87.field2566 = var9;
                                        var87.field2578 = var9.field5792;
                                        class234.field3126.method330(var87, -2130841184);
                                    }
                                }
                                if (var9.field5671 == 5 && var9.field5723 != -1) {
                                    var9.method2521(268435456).method2765(var9.field5672, class61.field807, 35);
                                }
                            }
                            if (!var9.field5790 && class16.field224 == null && class192.field2570 == null && !class2.field26) {
                                if ((var9.field5758 >= 0 || var9.field5724 != 0) && class124.field1728 >= var12 && class323.field4747 >= var13 && class124.field1728 < var14 && class323.field4747 < var15) {
                                    if (var9.field5758 >= 0) {
                                        class96.field1358 = arg0[var9.field5758];
                                    } else {
                                        class96.field1358 = var9;
                                    }
                                }
                                if (var9.field5671 == 8 && class124.field1728 >= var12 && class323.field4747 >= var13 && class124.field1728 < var14 && class323.field4747 < var15) {
                                    class71.field1007 = var9;
                                }
                                if (var9.field5771 > var9.field5672) {
                                    class447.method2811(var9.field5773 + var10, class124.field1728, var9.field5771, var11, var9, (byte) 73, var9.field5672, class323.field4747);
                                }
                            }
                            class310.method2107(arg2, var11, arg4, arg3, var9, var10, arg5, 4);
                            if (var9.field5671 == 0) {
                                method1531(arg0, var9.field5698, var12, var13, var14, var15, var10 - var9.field5742, var11 - var9.field5764);
                                if (var9.field5820 != null) {
                                    method1531(var9.field5820, var9.field5698, var12, var13, var14, var15, var10 - var9.field5742, var11 - var9.field5764);
                                }
                                class169 var88 = (class169) class99.field1377.method384((long) var9.field5698, true);
                                if (var88 != null) {
                                    if (var88.field2276 == 0 && !class2.field26 && var19 && !class62.field818) {
                                        class71.method520(126);
                                    }
                                    class103.method691(256, var12, var10, var13, var88.field2275, var14, var15, var11);
                                }
                            }
                        }
                    }
                } else if (var12 < var14 && var13 < var15) {
                    class310.method2107(arg2, var11, arg4, arg3, var9, var10, arg5, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1445)
    public final void method1424(boolean arg0) {
        field3475++;
        if (arg0 || class70.field932 == 1000) {
            return;
        }
        class28.field418++;
        if ((class28.field418 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class380.field5533 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class253.field3495.setSeed((long) class380.field5533);
        }
        this.method1536(12649);
        if (class164.field2211 != null) {
            class164.field2211.method639(-19);
        }
        class88.method622((byte) 88);
        class281.method1935(71);
        class117.method763(4096);
        class84.method604(-49);
        if (class61.field807 != null) {
            class61.field807.method1699((int) class114.method735(116));
        }
        if (class229.field3061 != null) {
            int var3 = class229.field3061.method954(125);
            class349.field5060 = var3;
        }
        class110.method726((byte) -128);
        if (class70.field932 == 0) {
            this.method1541((byte) -115);
            class390.method2508(-1);
        } else if (class70.field932 == 5) {
            this.method1541((byte) -115);
            class390.method2508(-1);
        } else if (class70.field932 == 25 || class70.field932 == 28) {
            class321.method2164(1057001181);
        }
        if (class70.field932 == 10) {
            this.method1538(-109);
            class283.method1948(0);
            class372.method2409(true);
            class254.method1555(-112);
        } else if (class70.field932 == 30) {
            class271.method1865(-124);
        } else if (class70.field932 == 40) {
            class254.method1555(-112);
            if (class102.field1416 != -3) {
                if (class102.field1416 == 15) {
                    class373.method2414((byte) 72);
                } else if (class102.field1416 != 2) {
                    class91.method637(-111);
                }
            }
        }
        class235.method1412(-20579, class61.field807);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lps;)Lps;", line = 1539)
    public static final class394 method1532(class394 arg0) {
        int var1 = method1544(arg0).method2077(-97);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class196.method1168((byte) -105, arg0.field5639);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1558)
    public final void init() {
        field3482++;
        if (!this.method1421((byte) -45)) {
            return;
        }
        class92.field1304 = Integer.parseInt(this.getParameter("worldid"));
        class61.field803 = Integer.parseInt(this.getParameter("modewhere"));
        if (class61.field803 < 0 || class61.field803 > 1) {
            class61.field803 = 0;
        }
        class63.field846 = Integer.parseInt(this.getParameter("modewhat"));
        if (class63.field846 < 0 || class63.field846 > 2) {
            class63.field846 = 0;
        }
        try {
            class177.field2337 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class177.field2337 = 0;
        }
        class124.method787(class177.field2337, (byte) -78);
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class416.field6113 = true;
        } else {
            class416.field6113 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class329.field4789 = true;
        } else {
            class329.field4789 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class71.field1017 = 1;
        } else {
            class71.field1017 = 0;
        }
        try {
            class223.field2944 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class223.field2944 = 0;
        }
        class182.field2431 = this.getParameter("quiturl");
        class174.field2328 = this.getParameter("settings");
        if (class174.field2328 == null) {
            class174.field2328 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class419.field6197 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class419.field6197 = 0;
            }
        }
        class202.field2714 = Integer.parseInt(this.getParameter("colourid"));
        if (class202.field2714 < 0 || class416.field6112.length <= class202.field2714) {
            class202.field2714 = 0;
        }
        class328.field4784 = this;
        this.method1417(503, -127, 561, 765, class63.field846 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Lsc;", line = 1632)
    public static final class395 method1533(int arg0, int arg1) {
        field3472++;
        class395 var2 = (class395) class55.field735.method1137((long) arg0, arg1 ^ 0x7DAF808B);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class447.field6554.method2261(arg0, 31, arg1 ^ 0x72);
        class395 var4 = new class395();
        if (var3 != null) {
            var4.method2540(new class228(var3), arg0, -4554);
        }
        class55.field735.method1144((long) arg0, var4, -3480);
        if (arg1 != 4) {
            method1533(-117, 3);
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 1661)
    private final void method1534(int arg0, int arg1) {
        class182.field2480.field6540 = arg0;
        class275.field3979 = null;
        class125.field1764 = 0;
        field3484++;
        if (arg1 != -1413) {
            field3481 = 94;
        }
        class182.field2480.field6537++;
        class237.field3186 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 1676)
    private final void method1535(boolean arg0) {
        field3478++;
        if (class434.field6379 < class182.field2480.field6537) {
            if (class430.field6322 == class153.field2070) {
                class153.field2070 = class162.field2171;
            } else {
                class153.field2070 = class430.field6322;
            }
            class439.field6437 = (class182.field2480.field6537 - 1) * 50 * 5;
            if (class439.field6437 > 3000) {
                class439.field6437 = 3000;
            }
            if (class182.field2480.field6537 >= 2 && class182.field2480.field6540 == 6) {
                this.method1432("js5connect_outofdate", 14231);
                class70.field932 = 1000;
                return;
            }
            if (class182.field2480.field6537 >= 4 && class182.field2480.field6540 == -1) {
                this.method1432("js5crc", 14231);
                class70.field932 = 1000;
                return;
            }
            if (class182.field2480.field6537 >= 4 && (class70.field932 == 0 || class70.field932 == 5)) {
                if (class182.field2480.field6540 == 7 || class182.field2480.field6540 == 9) {
                    this.method1432("js5connect_full", 14231);
                } else if (class182.field2480.field6540 <= 0) {
                    this.method1432("js5io", 14231);
                } else {
                    this.method1432("js5connect", 14231);
                }
                class70.field932 = 1000;
                return;
            }
        }
        class434.field6379 = class182.field2480.field6537;
        if (class439.field6437 > 0) {
            class439.field6437--;
            return;
        }
        if (!arg0) {
            field3481 = 2;
        }
        try {
            if (class125.field1764 == 0) {
                class275.field3979 = class76.field1085.method261(-5159, class153.field2070, class298.field4302);
                class125.field1764++;
            }
            if (class125.field1764 == 1) {
                if (class275.field3979.field6308 == 2) {
                    this.method1534(1000, -1413);
                    return;
                }
                if (class275.field3979.field6308 == 1) {
                    class125.field1764++;
                }
            }
            if (class125.field1764 == 2) {
                class237.field3186 = new class233((Socket) class275.field3979.field6309, class76.field1085);
                class228 var2 = new class228(5);
                var2.method1346(15, 32767);
                var2.method1330(561, -106);
                class237.field3186.method1401(3, 0, 5, var2.field3040);
                class125.field1764++;
                class259.field3784 = class114.method735(92);
            }
            if (class125.field1764 == 3) {
                if (class70.field932 == 0 || class70.field932 == 5 || class237.field3186.method1394(true) > 0) {
                    int var3 = class237.field3186.method1399(-7573);
                    if (var3 != 0) {
                        this.method1534(var3, -1413);
                        return;
                    }
                    class125.field1764++;
                } else if ((class114.method735(116) - class259.field3784) > 30000L) {
                    this.method1534(1001, -1413);
                    return;
                }
            }
            if (class125.field1764 == 4) {
                boolean var4 = class70.field932 == 5 || class70.field932 == 10 || class70.field932 == 28;
                class182.field2480.method2795(class237.field3186, (byte) 27, !var4);
                class125.field1764 = 0;
                class237.field3186 = null;
                class275.field3979 = null;
            }
        } catch (IOException var5) {
            this.method1534(1002, -1413);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1828)
    private final void method1536(int arg0) {
        field3473++;
        boolean var2 = class182.field2480.method2804(4);
        if (!var2) {
            this.method1535(true);
        }
        if (arg0 != 12649) {
            this.method1535(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 1847)
    public static final void method1537() {
        for (int var0 = 0; var0 < class192.field2574; var0++) {
            int[] var1 = class181.field2391[var0];
            for (int var2 = 0; var2 < class364.field5262; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1864)
    public final void method1429(int arg0) {
        field3476++;
        if (class70.field932 == 1000) {
            return;
        }
        long var2 = class207.method1220((byte) 86) / 1000000L - class149.field2039;
        class149.field2039 = class207.method1220((byte) 19) / 1000000L;
        boolean var4 = class205.method1216(125);
        if (var4 && class7.field123 && class230.field3073 != null) {
            class230.field3073.method1196(arg0 ^ 0xFFFFFF86);
        }
        if (class70.field932 == 30 || class70.field932 == 10) {
            if (class359.field5189 != 0L && class114.method735(97) > class359.field5189) {
                class147.method933(class215.method1266(2), false, class406.field6030, 1, class122.field1692);
            } else if (class61.field807.method1773() && class22.field286) {
                class83.method598(0);
            }
        }
        if (arg0 != 1) {
            field3481 = 111;
        }
        if (class103.field1428 == null) {
            Container var5;
            if (class374.field5447 == null) {
                var5 = class76.field1085.field519;
            } else {
                var5 = class374.field5447;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class374.field5447 == var5) {
                Insets var8 = class374.field5447.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class273.field3956 != var6 || class180.field2384 != var7) {
                if (class61.field807 == null || class61.field807.method1743()) {
                    class9.method72(1024);
                } else {
                    class180.field2384 = var7;
                    class273.field3956 = var6;
                }
                class359.field5189 = class114.method735(arg0 ^ 0x6D) + 500L;
            }
        }
        if (class103.field1428 != null && !class65.field865 && (class70.field932 == 30 || class70.field932 == 10)) {
            class147.method933(class11.field171, false, -1, 1, -1);
        }
        boolean var9 = false;
        if (class171.field2296) {
            class171.field2296 = false;
            var9 = true;
        }
        if (var9) {
            class329.method2189((byte) -121);
        }
        if (class61.field807 != null && class61.field807.method1684() || class215.method1266(2) != 1) {
            class145.method927(0);
        }
        if (class70.field932 == 0) {
            class265.method1817(1, class451.field6587, class89.field1246, class140.field1918[class202.field2714], class321.field4732[class202.field2714], var9, class416.field6112[class202.field2714]);
        } else if (class70.field932 == 5) {
            class247.method1490(class61.field807, class321.field4732[class202.field2714].getRGB(), var9 | class61.field807.method1684(), class422.field6227, true, class140.field1918[class202.field2714].getRGB(), class416.field6112[class202.field2714].getRGB());
        } else if (class70.field932 == 10) {
            class275.method1896(-105);
        } else if (class70.field932 == 25 || class70.field932 == 28) {
            if (class351.field5088 == 1) {
                if (class181.field2397 > class143.field1954) {
                    class143.field1954 = class181.field2397;
                }
                int var10 = (class143.field1954 - class181.field2397) * 50 / class143.field1954;
                class89.method629(0, true, class372.field5413 + "<br>(" + var10 + "%)", class393.field5626);
            } else if (class351.field5088 == 2) {
                if (class161.field2155 < class267.field3851) {
                    class161.field2155 = class267.field3851;
                }
                int var11 = (class161.field2155 - class267.field3851) * 50 / class161.field2155 + 50;
                class89.method629(0, true, class372.field5413 + "<br>(" + var11 + "%)", class393.field5626);
            } else {
                class89.method629(0, true, class372.field5413, class393.field5626);
            }
        } else if (class70.field932 == 30) {
            class447.method2813(var2, (byte) -101);
        } else if (class70.field932 == 40) {
            class89.method629(0, true, class442.field6475 + "<br>" + class211.field2829, class393.field5626);
        }
        if (class202.field2720 == 3) {
            for (int var12 = 0; var12 < class1.field13; var12++) {
                Rectangle var13 = class229.field3062[var12];
                if (class140.field1920[var12]) {
                    class61.field807.method2610(var13.height, -1996553985, true, var13.width, var13.x, var13.y);
                } else if (class57.field775[var12]) {
                    class61.field807.method2610(var13.height, -1996554240, true, var13.width, var13.x, var13.y);
                }
            }
        }
        if (class423.method2700(arg0 ^ 0x3)) {
            class98.method664((byte) 111, class61.field807);
        }
        if ((class70.field932 == 30 || class70.field932 == 10) && class202.field2720 == 0 && class215.method1266(2) == 1 && !var9 && class36.field518.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class1.field13; var15++) {
                if (class57.field775[var15]) {
                    class57.field775[var15] = false;
                    class180.field2382[var14++] = class229.field3062[var15];
                }
            }
            class61.field807.method1719(class180.field2382, var14);
        } else if (class70.field932 != 0) {
            class61.field807.method1748();
            for (int var16 = 0; var16 < class1.field13; var16++) {
                class57.field775[var16] = false;
            }
        }
        if (class200.field2663) {
            class359.method2345(arg0 - 1);
        }
        if (class275.field3987 && class70.field932 == 10 && class329.field4790 != -1) {
            class275.field3987 = false;
            class253.method1547(23912, class76.field1085);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 2091)
    public final void method1434(int arg0) {
        field3477++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class9.method72(1024);
        class94.field1343 = new class248(class76.field1085);
        class182.field2480 = new class445();
        if (class63.field846 != 0) {
            class419.field6200 = new byte[50][];
        }
        class88.method620(class76.field1085, (byte) 44);
        if (class61.field803 == 0) {
            class354.field5129 = this.getCodeBase().getHost();
            class308.field4528 = 443;
            class110.field1565 = 43594;
        } else if (class61.field803 == 1) {
            class354.field5129 = this.getCodeBase().getHost();
            class110.field1565 = class92.field1304 + 40000;
            class308.field4528 = class92.field1304 + 50000;
        } else if (class61.field803 == 2) {
            class308.field4528 = class92.field1304 + 50000;
            class110.field1565 = class92.field1304 + 40000;
            class354.field5129 = "127.0.0.1";
        }
        class298.field4302 = class354.field5129;
        class430.field6322 = class110.field1565;
        class162.field2171 = class308.field4528;
        class393.field5627 = class110.field1565;
        if (class36.field511 == 3) {
            class43.field616 = class92.field1304;
        }
        if (class71.field1017 == 1) {
            class394.field5729 = class248.field3337;
            class404.field6009 = true;
            class177.field2341 = 16777215;
            class308.field4539 = class261.field3795;
            class442.field6478 = class267.field3863;
            class434.field6384 = 0;
            class98.field1371 = class308.field4531;
        } else {
            class442.field6478 = class308.field4530;
            class394.field5729 = class135.field1883;
            class308.field4539 = class21.field283;
            class98.field1371 = class226.field2973;
        }
        class153.field2070 = class393.field5627;
        class294.field4219 = class104.field1479 = class426.field6286 = class143.field1950 = new short[256];
        class57.method397((byte) -119);
        class4.method30(-28172, class202.field2708);
        class328.method2183(class202.field2708, 82);
        class229.field3061 = class87.method616((byte) 76);
        if (class229.field3061 != null) {
            class229.field3061.method956(class202.field2708, 109);
        }
        if (arg0 < 75) {
            method1540();
        }
        class212.field2845 = class36.field511;
        try {
            if (class76.field1085.field505 != null) {
                class43.field595 = new class278(class76.field1085.field505, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class9.field161[var3] = new class278(class76.field1085.field502[var3], 6000, 0);
                }
                class89.field1248 = new class278(class76.field1085.field504, 6000, 0);
                class55.field744 = new class241(255, class43.field595, class89.field1248, 500000);
                class434.field6386 = new class278(class76.field1085.field510, 24, 0);
                class76.field1085.field504 = null;
                class76.field1085.field505 = null;
                class76.field1085.field510 = null;
                class76.field1085.field502 = null;
            }
        } catch (IOException var4) {
            class43.field595 = null;
            class89.field1248 = null;
            class55.field744 = null;
            class434.field6386 = null;
        }
        if (class71.field1017 == 0) {
            class73.field1047 = class278.field4027;
        } else if (class71.field1017 == 1) {
            class73.field1047 = class288.field4159;
        }
        if (class61.field803 != 0) {
            class196.field2625 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2217)
    private final void method1538(int arg0) {
        field3485++;
        class254.field3526 = 0;
        while (class157.method974(14648) && class254.field3526 < 128) {
            if (!class39.method278(-16884) || !(class331.field4810 == '`' || class331.field4810 == '§')) {
                class192.field2575[class254.field3526] = class90.field1275;
                class369.field5332[class254.field3526] = class331.field4810;
                class254.field3526++;
            } else if (class423.method2700(2)) {
                class399.method2567(false);
            } else {
                class7.method53(-18954);
            }
        }
        if (class423.method2700(2)) {
            class419.method2684(107);
        }
        class379.field5514++;
        class97.method662((class394) null, -1, -1, 0);
        class300.method2057((class394) null, -1, -1, (byte) -51);
        if (class329.field4790 != -1) {
            class103.method691(256, 0, 0, 0, class329.field4790, class138.field1907, class92.field1294, 0);
        }
        class207.field2788++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class43 var13 = class306.field4496[var2];
            if (var13 != null) {
                byte var14 = var13.field606.field3390;
                if ((var14 & 0x1) != 0) {
                    int var15 = var13.method168(-119);
                    if ((var14 & 0x2) != 0 && var13.field4369 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var17 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var16 != 0 || var17 != 0) {
                            int var18 = var13.field4360[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class192.field2574 - var15 - 1)) {
                                var18 = class192.field2574 - var15 - 1;
                            }
                            int var19 = var13.field4362[0] + var17;
                            if (var19 < 0) {
                                var19 = 0;
                            } else if ((class364.field5262 - var15 - 1) < var19) {
                                var19 = class364.field5262 - (var15 + 1);
                            }
                            int var20 = class260.method1797(class379.field5500, var15, var19, 0, true, var15, var15, var13.field4360[0], class365.field5294[var13.field727], class277.field4004, 123, 0, -1, var18, var13.field4362[0]);
                            if (var20 > 0) {
                                if (var20 > 9) {
                                    var20 = 9;
                                }
                                for (int var21 = 0; var21 < var20; var21++) {
                                    var13.field4360[var21] = class277.field4004[var20 - var21 - 1];
                                    var13.field4362[var21] = class379.field5500[var20 - var21 - 1];
                                    var13.field4359[var21] = 1;
                                }
                                var13.field4369 = var20;
                            }
                        }
                    }
                    class375.method2431(true, 27994, var13);
                    int var22 = class2.method17(var13, (byte) -94);
                    class368.method2391(var22, class294.field4213, false, var13, class21.field278);
                    class143.method913(var13, false);
                }
            }
        }
        if (class188.field2532 == 0 && class163.field2190 == 0) {
            if (class346.field4979 == 2) {
                class399.method2570(113);
            } else {
                class368.method2392((byte) 117);
            }
            if (class400.field5971 >> 7 < 14 || class192.field2574 - 14 <= class400.field5971 >> 7 || class179.field2371 >> 7 < 14 || (class179.field2371 >> 7) >= (class364.field5262 - 14)) {
                class69.method461(true);
            }
        }
        while (true) {
            class192 var3;
            class394 var4;
            class394 var5;
            do {
                var3 = (class192) class447.field6555.method340(false);
                if (var3 == null) {
                    while (true) {
                        class192 var6;
                        class394 var7;
                        class394 var8;
                        do {
                            var6 = (class192) class331.field4812.method340(false);
                            if (var6 == null) {
                                while (true) {
                                    class192 var9;
                                    class394 var10;
                                    class394 var11;
                                    do {
                                        var9 = (class192) class234.field3126.method340(false);
                                        if (var9 == null) {
                                            if (class16.field224 != null) {
                                                class1.method2((byte) -30);
                                            }
                                            int var12 = 68 % ((71 - arg0) / 52);
                                            if ((class28.field418 % 1500) == 0) {
                                                class267.method1826((byte) -126);
                                            }
                                            class323.method2171((byte) -122);
                                            if (class257.field3768 && class114.method735(95) - 60000L > class295.field4227) {
                                                class278.method1917(false);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2566;
                                        if (var10.field5649 < 0) {
                                            break;
                                        }
                                        var11 = class196.method1168((byte) -72, var10.field5639);
                                    } while (var11 == null || var11.field5820 == null || var11.field5820.length <= var10.field5649 || var11.field5820[var10.field5649] != var10);
                                    class123.method783(var9);
                                }
                            }
                            var7 = var6.field2566;
                            if (var7.field5649 < 0) {
                                break;
                            }
                            var8 = class196.method1168((byte) -112, var7.field5639);
                        } while (var8 == null || var8.field5820 == null || var8.field5820.length <= var7.field5649 || var8.field5820[var7.field5649] != var7);
                        class123.method783(var6);
                    }
                }
                var4 = var3.field2566;
                if (var4.field5649 < 0) {
                    break;
                }
                var5 = class196.method1168((byte) -93, var4.field5639);
            } while (var5 == null || var5.field5820 == null || var5.field5820.length <= var4.field5649 || var5.field5820[var4.field5649] != var4);
            class123.method783(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2444)
    public static final void method1539(int arg0) {
        if (arg0 > -58) {
            method1546((class394) null);
        }
        field3479++;
        if (class26.field379) {
            class267.field3859 = null;
            class26.field379 = false;
            class273.field3971 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 2464)
    public static final void method1540() {
        int var0 = class237.field3185 ? class65.field861 : class65.field861 + class198.field2637;
        for (int var1 = -1; var1 < var0; var1++) {
            class298 var2;
            if (var1 < 0) {
                var2 = class227.field2988;
            } else if (var1 < class65.field861) {
                var2 = class206.field2777[class229.field3071[var1]];
            } else {
                var2 = class306.field4496[class398.field5938[var1 - class65.field861]];
            }
            if (var2.field4319 >= 0) {
                int var3 = var2.method168(-123);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field740 & 0x7F) == 0 && (var2.field734 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field740 & 0x7F) == 64 && (var2.field734 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class25 && var2.field4368 != null && class28.field418 >= var2.field4351 && class28.field418 < var2.field4355) {
                    ((class25) var2).field330 = false;
                }
                var2.field729 = class52.method359((byte) -116, var2.field734, var2.field740, class227.field2981);
                class21.method146(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2508)
    private final void method1541(byte arg0) {
        if (!class275.field3987) {
            label227: while (true) {
                do {
                    if (!class157.method974(14648)) {
                        break label227;
                    }
                } while (class331.field4810 != 's' && class331.field4810 != 'S');
                class275.field3987 = true;
            }
        }
        field3487++;
        if (arg0 != -115) {
            field3481 = 51;
        }
        if (class92.field1301 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class114.method735(124);
            if (class418.field6185 == 0L) {
                class418.field6185 = var4;
            }
            if (var3 > 16384 && (var4 - class418.field6185) < 5000L) {
                if (var4 - class152.field2064 > 1000L) {
                    System.gc();
                    class152.field2064 = var4;
                }
                class451.field6587 = 5;
                class89.field1246 = class353.field5109;
            } else {
                class89.field1246 = class234.field3125;
                class451.field6587 = 5;
                class92.field1301 = 10;
            }
        } else if (class92.field1301 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class365.field5294[var6] = class164.method1015(class364.field5262, -19129, class192.field2574);
            }
            class92.field1301 = 20;
            class451.field6587 = 10;
            class89.field1246 = class205.field2769;
        } else if (class92.field1301 == 20) {
            if (class164.field2211 == null) {
                class164.field2211 = new class91(class182.field2480, class94.field1343);
            }
            if (class164.field2211.method635((byte) 8)) {
                class148.field2035 = class41.method295(true, 0, 1, (byte) 50, false);
                class71.field1034 = class41.method295(true, 1, 1, (byte) 50, false);
                class130.field1798 = class41.method295(true, 2, 1, (byte) 50, false);
                class184.field2492 = class41.method295(true, 3, 1, (byte) 50, false);
                class309.field4551 = class41.method295(true, 4, 1, (byte) 50, false);
                class153.field2066 = class41.method295(true, 5, 1, (byte) 50, true);
                class385.field5583 = class41.method295(false, 6, 1, (byte) 50, true);
                class246.field3318 = class41.method295(true, 7, 1, (byte) 50, false);
                class362.field5227 = class41.method295(true, 8, 1, (byte) 50, false);
                class329.field4796 = class41.method295(true, 9, 1, (byte) 50, false);
                class1.field10 = class41.method295(true, 10, 1, (byte) 50, false);
                class151.field2056 = class41.method295(true, 11, 1, (byte) 50, false);
                class21.field280 = class41.method295(true, 12, 1, (byte) 50, false);
                class291.field4169 = class41.method295(true, 13, 1, (byte) 50, false);
                class448.field6573 = class41.method295(false, 14, 1, (byte) 50, false);
                class149.field2040 = class41.method295(true, 15, 1, (byte) 50, false);
                class349.field5056 = class41.method295(true, 16, 1, (byte) 50, false);
                class169.field2272 = class41.method295(true, 17, 1, (byte) 50, false);
                class93.field1339 = class41.method295(true, 18, 1, (byte) 50, false);
                class181.field2390 = class41.method295(true, 19, 1, (byte) 50, false);
                class393.field5629 = class41.method295(true, 20, 1, (byte) 50, false);
                class432.field6348 = class41.method295(true, 21, 1, (byte) 50, false);
                class180.field2381 = class41.method295(true, 22, 1, (byte) 50, false);
                class28.field417 = class41.method295(true, 23, 1, (byte) 50, true);
                class426.field6285 = class41.method295(true, 24, 1, (byte) 50, false);
                class273.field3973 = class41.method295(true, 25, 1, (byte) 50, false);
                class335.field4836 = class41.method295(true, 26, 1, (byte) 50, true);
                class69.field893 = class41.method295(true, 27, 1, (byte) 50, false);
                class315.field4604 = class41.method295(true, 28, 1, (byte) 50, true);
                class89.field1246 = class259.field3783;
                class451.field6587 = 15;
                class92.field1301 = 30;
            } else {
                class451.field6587 = 12;
                class89.field1246 = class7.field93;
            }
        } else if (class92.field1301 == 30) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class87.field1229[var8].method2153(63) * class146.field2000[var8] / 100;
            }
            if (var7 == 100) {
                class451.field6587 = 20;
                class89.field1246 = class315.field4600;
                class71.method518((byte) -123, class362.field5227);
                class83.method592((byte) 94, class362.field5227);
                class92.field1301 = 40;
            } else {
                class451.field6587 = 20;
                if (var7 != 0) {
                    class89.field1246 = class169.field2270 + var7 + "%";
                }
            }
        } else if (class92.field1301 == 40) {
            if (class315.field4604.method2283((byte) 120)) {
                this.method1545(-123, class315.field4604.method2266((byte) 55, 1));
                class451.field6587 = 25;
                class92.field1301 = 50;
                class89.field1246 = class166.field2244;
            } else {
                class89.field1246 = class44.field628 + class315.field4604.method2258(arg0 + 115) + "%";
                class451.field6587 = 25;
            }
        } else if (class92.field1301 == 50) {
            class153.method957(false, 2, class299.field4384, 22050);
            class70.field907 = new class70();
            class70.field907.method512(9, -3, 128);
            class230.field3073 = class151.method945(22050, class202.field2708, class76.field1085, 0, 0);
            class230.field3073.method1198((byte) -67, class70.field907);
            class323.method2169(class309.field4551, 2, class149.field2040, class70.field907, class448.field6573);
            class281.field4093 = class151.method945(2048, class202.field2708, class76.field1085, 0, 1);
            class156.field2122 = new class389();
            class281.field4093.method1198((byte) -77, class156.field2122);
            class375.field5450 = new class79(22050, class9.field153);
            class40.field551 = class385.field5583.method2270("scape main", (byte) 115);
            class92.field1301 = 60;
            class89.field1246 = class423.field6237;
            class451.field6587 = 30;
        } else if (class92.field1301 == 60) {
            int var9 = class232.method1390(class291.field4169, class362.field5227, (byte) -17);
            int var10 = class184.method1121(true);
            if (var10 > var9) {
                class89.field1246 = class52.field714 + var9 * 100 / var10 + "%";
                class451.field6587 = 35;
            } else {
                class451.field6587 = 35;
                class92.field1301 = 70;
                class89.field1246 = class148.field2034;
            }
        } else if (class92.field1301 == 70) {
            int var11 = class181.method1102(class362.field5227, arg0 ^ 0x5F87);
            int var12 = class124.method792(94);
            if (var12 > var11) {
                class89.field1246 = class218.field2882 + var11 * 100 / var12 + "%";
                class451.field6587 = 40;
            } else {
                class89.field1246 = class264.field3831;
                class451.field6587 = 40;
                class92.field1301 = 80;
            }
        } else if (class92.field1301 == 80) {
            if (class335.field4836.method2283((byte) 83)) {
                class328.field4780 = new class26(class335.field4836, class329.field4796, class362.field5227);
                class92.field1301 = 90;
                class89.field1246 = class202.field2706;
                class451.field6587 = 45;
            } else {
                class89.field1246 = class405.field6016 + class335.field4836.method2258(0) + "%";
                class451.field6587 = 45;
            }
        } else if (class92.field1301 == 90) {
            class89.field1246 = class167.field2262;
            class92.field1301 = 95;
            class451.field6587 = 50;
        } else if (class92.field1301 == 95) {
            if (class275.field3987) {
                class365.field5288 = 0;
                class11.field171 = 1;
                class286.field4145 = 0;
                class115.field1611 = 0;
                class196.field2622 = 0;
            }
            class275.field3987 = true;
            class253.method1547(23912, class76.field1085);
            class1.method8(arg0 ^ 0x78);
            class100.method684(false, class196.field2622, 64);
            class92.field1301 = 100;
            class451.field6587 = 55;
            class89.field1246 = class331.field4814;
        } else if (class92.field1301 == 100) {
            class343.method2240(-20667, class362.field5227, class61.field807, class291.field4169);
            class89.field1246 = class296.field4252;
            class451.field6587 = 60;
            class232.method1391(-26, 5);
            class92.field1301 = 110;
        } else if (class92.field1301 == 110) {
            byte var13 = 0;
            class130.field1798.method2283((byte) -34);
            int var14 = var13 + class130.field1798.method2258(0);
            class349.field5056.method2283((byte) 100);
            int var15 = var14 + class349.field5056.method2258(0);
            class169.field2272.method2283((byte) 93);
            int var16 = var15 + class169.field2272.method2258(0);
            class93.field1339.method2283((byte) -69);
            int var17 = var16 + class93.field1339.method2258(arg0 + 115);
            class181.field2390.method2283((byte) -14);
            int var18 = var17 + class181.field2390.method2258(0);
            class393.field5629.method2283((byte) 109);
            int var19 = var18 + class393.field5629.method2258(0);
            class432.field6348.method2283((byte) -116);
            int var20 = var19 + class432.field6348.method2258(0);
            class180.field2381.method2283((byte) 14);
            int var21 = var20 + class180.field2381.method2258(arg0 ^ 0xFFFFFF8D);
            class426.field6285.method2283((byte) 120);
            int var22 = var21 + class426.field6285.method2258(arg0 ^ 0xFFFFFF8D);
            class273.field3973.method2283((byte) 123);
            int var23 = var22 + class273.field3973.method2258(0);
            class69.field893.method2283((byte) -62);
            int var24 = var23 + class69.field893.method2258(0);
            if (var24 < 1100) {
                class89.field1246 = class161.field2161 + var24 / 11 + "%";
                class451.field6587 = 65;
            } else {
                class78.method568(class130.field1798, true);
                class321.method2163(4, class130.field1798);
                class430.method2726(31124, class130.field1798);
                class382.method2471((byte) 89, class130.field1798, class246.field3318);
                class241.method1445(class349.field5056, true, class246.field3318, arg0 ^ 0xFFFFFF8C);
                class171.method1062(true, -124, class246.field3318, class93.field1339);
                class309.method2102(class181.field2390, class246.field3318, true, 64);
                class439.method2759(arg0 ^ 0xFFFF85A2, class130.field1798);
                class364.method2379(class148.field2035, class393.field5629, class71.field1034, true);
                class55.method376(false, class130.field1798);
                class177.method1078(class246.field3318, false, class432.field6348);
                class119.method772((byte) -113, class180.field2381);
                class309.method2100((byte) -103, class130.field1798);
                class249.method1503(class291.field4169, 0, class246.field3318, class362.field5227, class184.field2492);
                class69.method465(class130.field1798, (byte) 87);
                class4.method29(true, class169.field2272);
                class379.method2453(new class449(), class273.field3973, class426.field6285, false);
                class235.method1406(-1, class273.field3973, class426.field6285);
                class185.method1122(class130.field1798, (byte) 18);
                class403.method2600(arg0 ^ 0x70, class130.field1798);
                class63.method441(false, class130.field1798);
                class179.method1098(class130.field1798, (byte) -37, class362.field5227);
                class2.method19(class362.field5227, 34, class130.field1798);
                class70.method486(class130.field1798, 29788);
                class193.method1160(-2, class362.field5227, class130.field1798);
                class230.method1387(class130.field1798, 19);
                class380.method2465(class130.field1798, (byte) -105);
                class89.field1246 = class171.field2300;
                class451.field6587 = 65;
                class276.method1901(false);
                class92.field1301 = 120;
            }
        } else if (class92.field1301 == 120) {
            int var25 = class206.method1219(10455, class362.field5227);
            int var26 = class448.method2814((byte) -93);
            if (var25 < var26) {
                class451.field6587 = 70;
                class89.field1246 = class353.field5112 + var25 * 100 / var26 + "%";
            } else {
                class352.method2317(0, class61.field807, class362.field5227);
                class338.method2215(arg0 - 12, class270.field3931);
                class89.field1246 = class306.field4502;
                class92.field1301 = 130;
                class451.field6587 = 70;
            }
        } else if (class92.field1301 == 130) {
            class27.field383 = new class110();
            class76.field1085.method242(class27.field383, (byte) -102, 10);
            class92.field1301 = 140;
            class451.field6587 = 75;
            class89.field1246 = class323.field4736;
        } else if (class92.field1301 == 140) {
            if (class1.field10.method2264("", "huffman", -6)) {
                class282 var27 = new class282(class1.field10.method2281("", "huffman", (byte) -46));
                class52.method361(19569, var27);
                class89.field1246 = class333.field4829;
                class92.field1301 = 150;
                class451.field6587 = 80;
            } else {
                class451.field6587 = 80;
                class89.field1246 = class284.field4136 + "0%";
            }
        } else if (class92.field1301 == 150) {
            if (!class184.field2492.method2283((byte) -4)) {
                class89.field1246 = class277.field4014 + class184.field2492.method2258(arg0 + 115) * 3 / 4 + "%";
                class451.field6587 = 85;
            } else if (!class21.field280.method2283((byte) 92)) {
                class89.field1246 = class277.field4014 + (class21.field280.method2258(0) / 10 + 75) + "%";
                class451.field6587 = 85;
            } else if (!class291.field4169.method2283((byte) -43)) {
                class89.field1246 = class277.field4014 + ((class291.field4169.method2258(0) / 20) + 85) + "%";
                class451.field6587 = 85;
            } else if (class28.field417.method2282("details", (byte) 115)) {
                class293.method1986(class28.field417);
                class333.method2199(class69.field893, (byte) -128);
                class219.method1283(class328.field4780, (byte) -46, class246.field3318);
                class92.field1301 = 160;
                class89.field1246 = class267.field3857;
                class451.field6587 = 85;
            } else {
                class89.field1246 = class277.field4014 + (class28.field417.method2275("details", -1) / 10 + 90) + "%";
                class451.field6587 = 85;
            }
        } else if (class92.field1301 == 160) {
            int var28 = class71.method519(-1);
            if (var28 == -1) {
                class451.field6587 = 90;
                class89.field1246 = class432.field6342;
            } else if (var28 == 7 || var28 == 9) {
                this.method1432("worldlistfull", 14231);
                class232.method1391(-26, 1000);
            } else if (class352.field5101) {
                class89.field1246 = class353.field5116;
                class92.field1301 = 170;
                class451.field6587 = 90;
            } else {
                this.method1432("worldlistio_" + var28, arg0 ^ 0xFFFFC81A);
                class232.method1391(-26, 1000);
            }
        } else if (class92.field1301 == 170) {
            class63.field842 = new boolean[class240.field3215];
            class283.field4125 = new String[class28.field412];
            class43.field594 = new int[class240.field3215];
            for (int var29 = 0; var29 < class240.field3215; var29++) {
                if (class284.method1954(arg0 ^ 0xFFFFFF04, var29).field2236 == 0) {
                    class63.field842[var29] = true;
                    class117.field1648++;
                }
                class43.field594[var29] = -1;
            }
            class100.method681(true);
            class180.field2379 = class184.field2492.method2270("loginscreen", (byte) 115);
            class153.field2066.method2273(false, true, 3);
            class385.field5583.method2273(true, true, arg0 + 118);
            class362.field5227.method2273(true, true, 3);
            class291.field4169.method2273(true, true, 3);
            class1.field10.method2273(true, true, 3);
            class184.field2492.method2273(true, true, arg0 + 118);
            class130.field1798.field5018 = 2;
            class200.field2663 = true;
            class169.field2272.field5018 = 2;
            class349.field5056.field5018 = 2;
            class93.field1339.field5018 = 2;
            class181.field2390.field5018 = 2;
            class393.field5629.field5018 = 2;
            class432.field6348.field5018 = 2;
            class147.method933(class11.field171, false, -1, 1, -1);
            class92.field1301 = 180;
            class89.field1246 = class291.field4172;
            class451.field6587 = 95;
        } else if (class92.field1301 == 180) {
            class62.method428(-8844, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 3049)
    public final void method1430(byte arg0) {
        if (class257.field3768) {
            class278.method1917(false);
        }
        if (arg0 <= 28) {
            field3481 = -57;
        }
        field3486++;
        if (class61.field807 != null) {
            class61.field807.method2617(1);
        }
        if (class103.field1428 != null) {
            class265.method1820((byte) -126, class103.field1428, class76.field1085);
            class103.field1428 = null;
        }
        if (class27.field383 != null) {
            class27.field383.field1552 = false;
        }
        class27.field383 = null;
        if (class191.field2558 != null) {
            class191.field2558.method1398((byte) -91);
            class191.field2558 = null;
        }
        class373.method2416(3099, class202.field2708);
        class8.method66(0, class202.field2708);
        if (class229.field3061 != null) {
            class229.field3061.method951(class202.field2708, (byte) -84);
        }
        class276.method1902(true);
        class270.method1850(-125);
        class229.field3061 = null;
        if (class230.field3073 != null) {
            class230.field3073.method1205((byte) 103);
        }
        if (class281.field4093 != null) {
            class281.field4093.method1205((byte) 91);
        }
        class182.field2480.method2802((byte) 70);
        class94.field1343.method1499(-22304);
        if (class130.field1795 != null) {
            class130.field1795.method395((byte) -115);
            class130.field1795 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3112)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class219.method1285(-96, "argument count");
            }
            class92.field1304 = Integer.parseInt(arg0[0]);
            class61.field803 = 2;
            if (arg0[1].equals("live")) {
                class63.field846 = 0;
            } else if (arg0[1].equals("rc")) {
                class63.field846 = 1;
            } else if (arg0[1].equals("wip")) {
                class63.field846 = 2;
            } else {
                class219.method1285(62, "modewhat");
            }
            class177.field2337 = class7.method57(-120, arg0[2]);
            if (class177.field2337 == -1) {
                if (arg0[2].equals("english")) {
                    class177.field2337 = 0;
                } else if (arg0[2].equals("german")) {
                    class177.field2337 = 1;
                } else {
                    class219.method1285(-118, "language");
                }
            }
            class124.method787(class177.field2337, (byte) 119);
            class416.field6113 = false;
            class329.field4789 = false;
            if (arg0[3].equals("game0")) {
                class71.field1017 = 0;
            } else if (arg0[3].equals("game1")) {
                class71.field1017 = 1;
            } else {
                class219.method1285(100, "game");
            }
            class223.field2944 = 0;
            class202.field2714 = class71.field1017;
            class419.field6197 = 0;
            class174.field2328 = "";
            client var1 = new client();
            class328.field4784 = var1;
            var1.method1425(1024, class63.field846 + 32, false, 29, 0, 768, 561, class71.field1017 == 1 ? "stellardawn" : "runescape");
            class374.field5447.setLocation(40, 40);
        } catch (Exception var3) {
            class248.method1494((String) null, 90, var3);
        }
        field3474++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3180)
    public static final void method1542() {
        boolean var0 = class416.field6114 == 1 && class65.field861 > 200 || class416.field6114 == 0 && class65.field861 > 50;
        for (int var1 = 0; var1 < class65.field861; var1++) {
            class25 var10 = class206.field2777[class229.field3071[var1]];
            if (var10.method163(8968)) {
                var10.method373((byte) -105);
                if (var10.field743 >= 0 && var10.field726 >= 0 && var10.field742 < class192.field2574 && var10.field737 < class364.field5262) {
                    var10.field330 = var10.field4285 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field4334) {
                        var11++;
                    }
                    if (var10.field4315 > class28.field418) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method168(-112) << 2);
                    if (class31.field450 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field4319 = var12 + 1;
                } else {
                    var10.field4319 = -1;
                }
            } else {
                var10.field4319 = -1;
            }
        }
        for (int var2 = 0; var2 < class198.field2637; var2++) {
            class43 var7 = class306.field4496[class398.field5938[var2]];
            if (var7.method310(8968) && var7.field606.method1506((byte) -60)) {
                var7.method373((byte) -107);
                if (var7.field743 >= 0 && var7.field726 >= 0 && var7.field742 < class192.field2574 && var7.field737 < class364.field5262) {
                    int var8 = 0;
                    if (!var7.field4334) {
                        var8++;
                    }
                    if (var7.field4315 > class28.field418) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method168(-112) << 2);
                    if (class31.field450 == 0) {
                        if (var7.field606.field3395) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class31.field450 == 1) {
                        if (var7.field606.field3395) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field606.field3371) {
                        var9 += 512;
                    } else if (!var7.field606.field3418) {
                        var9 += 256;
                    }
                    var7.field4319 = var9 + 1;
                } else {
                    var7.field4319 = -1;
                }
            } else {
                var7.field4319 = -1;
            }
        }
        for (int var3 = 0; var3 < class219.field2903.length; var3++) {
            class194 var4 = class219.field2903[var3];
            if (var4 != null) {
                if (var4.field2596 == 1) {
                    class43 var5 = class306.field4496[var4.field2601];
                    if (var5 != null && var5.field4319 >= 0) {
                        var5.field4319 += 1024;
                    }
                } else if (var4.field2596 == 10) {
                    class25 var6 = class206.field2777[var4.field2601];
                    if (var6 != null && var6.field4319 >= 0) {
                        var6.field4319 += 1024;
                    }
                }
            }
        }
        class227.field2988.field4319 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "()V", line = 3315)
    public static final void method1543() {
        class430.field6321 = 0;
        for (int var0 = 0; var0 < class198.field2637; var0++) {
            class43 var1 = class306.field4496[class398.field5938[var0]];
            if (var1.field4334 && var1.method172(0) != -1) {
                int var2 = (var1.method168(-116) - 1) * 64 + 60;
                int var3 = var1.field740 - var2 >> 7;
                int var4 = var1.field734 - var2 >> 7;
                class298 var5 = class218.method1278(var3, -1, class227.field2981, var4);
                if (var5 != null) {
                    int var6 = var5.field4301;
                    if (var5 instanceof class43) {
                        var6 += 2048;
                    }
                    if (var5.field4308 == 0 && var5.method172(0) != -1) {
                        class384.field5556[class430.field6321] = var6;
                        class4.field51[class430.field6321] = var6;
                        class430.field6321++;
                        var5.field4308++;
                    }
                    class384.field5556[class430.field6321] = var6;
                    class4.field51[class430.field6321] = var1.field4301 + 2048;
                    class430.field6321++;
                    var5.field4308++;
                }
            }
        }
        class393.method2514(class384.field5556, 0, class4.field51, -128, class430.field6321 - 1);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lps;)Ldj;", line = 3369)
    public static final class304 method1544(class394 arg0) {
        class304 var1 = (class304) class34.field474.method384(((long) arg0.field5698 << 32) + (long) arg0.field5649, true);
        return var1 == null ? arg0.field5805 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V", line = 3373)
    private final void method1545(int arg0, byte[] arg1) {
        field3483++;
        if (arg0 >= -75) {
            field3481 = -21;
        }
        class228 var3 = new class228(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method1348(-111);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class56.field748 = new int[6];
                    var5[0] = var3.method1343(255);
                    var5[1] = var3.method1343(255);
                    var5[2] = var3.method1343(255);
                    var5[3] = var3.method1343(255);
                    var5[4] = var3.method1343(255);
                    var5[5] = var3.method1343(255);
                } else if (var4 == 4) {
                    int var6 = var3.method1348(-124);
                    class284.field4134 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class284.field4134[var7] = var3.method1343(255);
                        if (class284.field4134[var7] == 65535) {
                            class284.field4134[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lps;)Z", line = 3431)
    public static final boolean method1546(class394 arg0) {
        if (class62.field818) {
            if (method1544(arg0).field4475 != 0) {
                return false;
            }
            if (arg0.field5671 == 0) {
                return false;
            }
        }
        return arg0.field5798;
    }
}
