import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class118 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static volatile int field2582 = 0;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field2594;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method1163(int arg0) {
        field2587++;
        if (arg0 < -78) {
            boolean var2 = class280.field4465.method1497((byte) -46);
            if (!var2) {
                this.method1171((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2585++;
        try {
            if (arg0.length != 4) {
                class176.method1316("argument count", 41);
            }
            class243.field3923 = Integer.parseInt(arg0[0]);
            class27.field313 = 2;
            if (arg0[1].equals("live")) {
                class56.field809 = 0;
            } else if (arg0[1].equals("rc")) {
                class56.field809 = 1;
            } else if (arg0[1].equals("wip")) {
                class56.field809 = 2;
            } else {
                class176.method1316("modewhat", 104);
            }
            class18.field196 = false;
            class48.field701 = class212.method1541(arg0[2], (byte) -42);
            if (class48.field701 == -1) {
                if (arg0[2].equals("english")) {
                    class48.field701 = 0;
                } else if (arg0[2].equals("german")) {
                    class48.field701 = 1;
                } else {
                    class176.method1316("language", -95);
                }
            }
            class220.method1577(-100, class48.field701);
            class8.field81 = false;
            class210.field3369 = false;
            if (arg0[3].equals("game0")) {
                class175.field2850 = 0;
            } else if (arg0[3].equals("game1")) {
                class175.field2850 = 1;
            } else {
                class176.method1316("game", 43);
            }
            class108.field1569 = false;
            class57.field821 = 0;
            class200.field3212 = 0;
            class154.field2539 = "";
            client var1 = new client();
            class18.field202 = var1;
            var1.method853(545, 768, (byte) 127, false, class56.field809 + 32, "runescape", 1024, 29);
            class85.field1240.setLocation(40, 40);
        } catch (Exception var3) {
            class191.method1422(var3, (String) null, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method865(byte arg0) {
        class19.method128(-64);
        field2579++;
        class222.method1594((byte) -91);
        class80.method588((byte) -100);
        class20.method132(-22660);
        class260.method1828(-18337);
        class132.method957(5495);
        class172.method1277(-128);
        class118.method858(44);
        class16.method112(-1);
        class45.method337(-2);
        class297.method1996(15596);
        class152.method1120(27080);
        class92.method729(5000);
        if (arg0 < 46) {
            field2578 = -26;
        }
        class205.method1509(96);
        class61.method439((byte) 126);
        class120.method878(255);
        class86.method638(2);
        class188.method1397(-3);
        class263.method1843(false);
        class216.method1559(-90);
        class18.method127(-1);
        class77.method564(3);
        class113.method830(-118);
        class131.method948((byte) -126);
        class29.method207((byte) -1);
        class187.method1393(126);
        class204.method1489(13463);
        class144.method1036(0);
        class114.method839(9565);
        class220.method1579(-1664);
        class243.method1701((byte) 118);
        class224.method1606(64);
        class88.method668(0);
        class10.method77(-1);
        class141.method1008((byte) 121);
        class128.method927((byte) 123);
        class286.method1943(56);
        class36.method273(-51);
        class274.method1900((byte) -95);
        class245.method1750(618639567);
        class17.method119(115);
        class73.method534(-28);
        class280.method1921(68);
        class275.method1904(16);
        class124.method900(2000);
        class196.method1451((byte) -51);
        class272.method1886(3);
        class238.method1672(113);
        class38.method297((byte) 106);
        class256.method1813(30232);
        class163.method1209(-31861);
        class98.method754((byte) -122);
        class126.method909(0);
        class198.method1457((byte) 18);
        class63.method463(-120);
        class51.method390(-104);
        class241.method1686(true);
        class206.method1511(-847897881);
        class173.method1292();
        class71.method516(90);
        class62.method456(true);
        class246.method1773();
        class212.method1540(-44);
        class164.method1215(92);
        class108.method801(true);
        class242.method1698((byte) -20);
        class123.method895(-21855);
        class48.method371(0);
        class115.method845(-3667);
        class170.method1250();
        class3.method12((byte) 106);
        class145.method1042(72);
        class30.method223();
        class33.method244(64);
        class105.method784(0);
        class254.method1803(false);
        class167.method1231();
        class26.method190(28560);
        class146.method1046((byte) -47);
        class133.method962((byte) 79);
        class70.method514();
        class190.method1419(-1);
        class93.method731(48);
        class150.method1064((byte) 73);
        class139.method984(false);
        class40.method305(1);
        class208.method1522((byte) -63);
        class28.method197(1);
        class193.method1430((byte) -36);
        class52.method392(true);
        class270.method1872(67);
        class90.method711(115);
        class5.method28(false);
        class235.method1660((byte) 15);
        class55.method407(6318);
        class82.method598(0);
        class189.method1413((byte) 64);
        class219.method1570();
        class200.method1468(-32654);
        class49.method377((byte) -97);
        class81.method591(47);
        class234.method1658((byte) -24);
        class287.method1949(14348);
        class87.method663();
        class12.method93(true);
        class180.method1340(71);
        class273.method1887(false);
        class101.method769(-32144);
        class32.method232((byte) -17);
        class207.method1515(122);
        class39.method302((byte) -108);
        class181.method1350((byte) 118);
        class255.method1804();
        class47.method354();
        class78.method570(true);
        class250.method1784(-59);
        class24.method176((byte) 121);
        class154.method1142(50);
        class223.method1597(true);
        class282.method1929(503);
        class277.method1915(false);
        class56.method417(true);
        class75.method545((byte) -40);
        class294.method1989(100);
        class178.method1331(-6657);
        class166.method1223(true);
        class174.method1312((byte) 68);
        class99.method757((byte) 94);
        class156.method1156(-20701);
        class159.method1184((byte) 100);
        class169.method1242((byte) 67);
        class135.method972(true);
        class203.method1488();
        class191.method1421(0);
        class59.method424(-66);
        class244.method1739(true);
        class249.method1783();
        class50.method388((byte) 73);
        class213.method1543(0);
        class262.method1839((byte) 85);
        class100.method761(-106);
        class201.method1483(-77);
        class83.method602((byte) -91);
        class41.method315((byte) -70);
        class122.method890(-112);
        class68.method485();
        class266.method1855((byte) 86);
        class195.method1447((byte) -117);
        class2.method6(0);
        class69.method488((byte) -115);
        class253.method1795(false);
        class111.method815(88);
        class43.method325(2);
        class186.method1376(51);
        class130.method936(true);
        class184.method1367((byte) -113);
        class85.method616(-18836);
        class60.method430((byte) 113);
        class283.method1934(8203);
        class183.method1360(-1);
        class281.method1926(true);
        class153.method1133(false);
        class247.method1779(true);
        class168.method1237(92);
        class199.method1459();
        class218.method1569((byte) -127);
        class155.method1152(55);
        class257.method1819(true);
        class117.method851((byte) 90);
        class175.method1314((byte) 10);
        class182.method1356(2);
        class258.method1821();
        class72.method524();
        class276.method1913(true);
        class171.method1272(false);
        class252.method1791((byte) -100);
        class192.method1429((byte) 126);
        class292.method1977();
        class79.method579();
        class106.method787(-906055252);
        class84.method609(0);
        class27.method196(103);
        class227.method1622(119);
        class66.method472(-25046);
        class179.method1336(-92);
        class268.method1863(255);
        class6.method36(true);
        class21.method134((byte) -107);
        class160.method1193(-102);
        class121.method886((byte) -57);
        class44.method332(29931);
        class110.method808((byte) 79);
        class104.method780((byte) -82);
        class162.method1206(16569);
        class289.method1964(0);
        class228.method1630((byte) 68);
        class264.method1848(-117);
        class119.method872((byte) 93);
        class230.method1641(true);
        class225.method1615(false);
        class149.method1061((byte) 127);
        class290.method1966(-123);
        class291.method1973((byte) -39);
        class217.method1564(false);
        class226.method1621((byte) -106);
        class259.method1824((byte) -101);
        class125.method903(2048);
        class97.method748(-15838);
        class229.method1632(-345149396);
        class94.method739(4080);
        class267.method1858(0);
        class293.method1987(2);
        class64.method469(2);
        class46.method345(26461);
        class148.method1053(23);
        class112.method818(false);
        class210.method1533((byte) -113);
        class233.method1647((byte) 60);
        class143.method1026(true);
        class11.method90(0);
        class239.method1675(-114);
        class57.method418(-13276);
        class211.method1535((byte) 126);
        class136.method976(3);
        class296.method1992((byte) -83);
        class67.method478(-68);
        class91.method715((byte) -74);
        class129.method931((byte) -24);
        class134.method968(124);
        class161.method1203((byte) 113);
        class232.method1642((byte) -95);
        class58.method421(6557);
        class8.method57(3);
        class109.method806((byte) -127);
        class138.method980(-23087);
        class96.method744((byte) 126);
        class285.method1937(1000000);
        class215.method1547(118);
        class265.method1851(-11355);
        class34.method260(-113);
        class240.method1681(-26222);
        class209.method1526(-25891);
        class288.method1959(-49);
        class269.method1866((byte) 115);
        class42.method317(200);
        class151.method1068((byte) 84);
        if (class118.field1715) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lqi;IIIIIII)V")
    public static final void method1164(class131[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class131 var9 = arg0[var8];
            if (var9 != null && var9.field2054 == arg1 && (!var9.field2077 || var9.field2150 == 0 || var9.field2042 || method1168(var9).field1063 != 0 || class294.field4674 == var9 || var9.field2005 == 1338) && (!var9.field2077 || !method1172(var9))) {
                int var10 = var9.field2001 + arg6;
                int var11 = var9.field2121 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2150 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2102 + var10;
                    int var17 = var9.field2167 + var11;
                    if (var9.field2150 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class16.field184 == var9) {
                    class128.field1981 = true;
                    class73.field1069 = var10;
                    class98.field1442 = var11;
                }
                if (!var9.field2077 || var12 < var14 && var13 < var15) {
                    if (var9.field2150 == 0) {
                        if (!var9.field2077 && method1172(var9) && class260.field4250 != var9) {
                            continue;
                        }
                        if (var9.field2110 && class169.field2731 >= var12 && class296.field4680 >= var13 && class169.field2731 < var14 && class296.field4680 < var15) {
                            for (class294 var18 = (class294) class120.field1747.method1384(2); var18 != null; var18 = (class294) class120.field1747.method1388((byte) 125)) {
                                if (var18.field4666) {
                                    var18.method1922(-1);
                                    var18.field4668.field2045 = false;
                                }
                            }
                            if (class50.field735 == 0) {
                                class16.field184 = null;
                                class294.field4674 = null;
                            }
                            class49.field706 = 0;
                        }
                    }
                    if (var9.field2077) {
                        boolean var19;
                        if (class169.field2731 >= var12 && class296.field4680 >= var13 && class169.field2731 < var14 && class296.field4680 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class243.field3921 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class118.field1714 == 1 && class126.field1850 >= var12 && class101.field1497 >= var13 && class126.field1850 < var14 && class101.field1497 < var15) {
                            var21 = true;
                        }
                        if (var9.field2138 != null) {
                            for (int var22 = 0; var22 < var9.field2138.length; var22++) {
                                if (class285.field4512[var9.field2138[var22]]) {
                                    if (var9.field1997 == null || class264.field4290 >= var9.field1997[var22]) {
                                        byte var23 = var9.field2046[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class285.field4512[86] && !class285.field4512[82] && !class285.field4512[81]) && ((var23 & 0x2) == 0 || class285.field4512[86]) && ((var23 & 0x1) == 0 || class285.field4512[82]) && ((var23 & 0x4) == 0 || class285.field4512[81])) {
                                            class60.method431(var22 + 1, "", 164, -1, var9.field2073);
                                            int var24 = var9.field2059[var22];
                                            if (var9.field1997 == null) {
                                                var9.field1997 = new int[var9.field2138.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field1997[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field1997[var22] = class264.field4290 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field1997 != null) {
                                    var9.field1997[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class78.method568(class126.field1850 - var10, 0, var9, class101.field1497 - var11);
                        }
                        if (class16.field184 != null && class16.field184 != var9 && var19 && method1168(var9).method527(11169)) {
                            class169.field2720 = var9;
                        }
                        if (class294.field4674 == var9) {
                            class196.field3187 = true;
                            class62.field893 = var10;
                            class145.field2358 = var11;
                        }
                        if (var9.field2042 || var9.field2005 != 0) {
                            if (var19 && class223.field3571 != 0 && var9.field2162 != null) {
                                class294 var25 = new class294();
                                var25.field4666 = true;
                                var25.field4668 = var9;
                                var25.field4661 = class223.field3571;
                                var25.field4664 = var9.field2162;
                                class120.field1747.method1385(var25, true);
                            }
                            if (class16.field184 != null || class82.field1187 != null || class206.field3315 || var9.field2005 != 1400 && class49.field706 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2005 != 0) {
                                if (var9.field2005 == 1337) {
                                    class264.field4291 = var9;
                                    continue;
                                }
                                if (var9.field2005 == 1338) {
                                    if (var21) {
                                        class111.field1608 = class126.field1850 - var10;
                                        class264.field4287 = class101.field1497 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2005 == 1400) {
                                    class256.field4218 = var9;
                                    if (var21) {
                                        if (class285.field4512[82] && class21.field227 > 0) {
                                            int var26 = (int) ((double) (class126.field1850 - var10 - var9.field2102 / 2) * 2.0D / (double) class6.field52);
                                            int var27 = (int) ((double) (class101.field1497 - var11 - var9.field2167 / 2) * 2.0D / (double) class6.field52);
                                            int var28 = class172.field2765 + var26;
                                            int var29 = class296.field4682 + var27;
                                            int var30 = class227.field3636 + var28;
                                            int var31 = class52.field753 + class122.field1786 - var29 - 1;
                                            class222 var32 = class64.method467((byte) 21);
                                            int[] var33 = var32.method1593(var31, var30, -96);
                                            if (var33 != null) {
                                                class25.method183(var33[0], var33[2], true, var33[1]);
                                                class16.method110(568);
                                            }
                                            continue;
                                        }
                                        class49.field706 = 1;
                                        class58.field829 = class169.field2731;
                                        class209.field3356 = class296.field4680;
                                        continue;
                                    }
                                    if (var20 && class49.field706 > 0) {
                                        if (class49.field706 == 1 && (class58.field829 != class169.field2731 || class296.field4680 != class209.field3356)) {
                                            class247.field4124 = class172.field2765;
                                            class60.field838 = class296.field4682;
                                            class49.field706 = 2;
                                        }
                                        if (class49.field706 == 2) {
                                            class110.method812((byte) 42, (int) ((double) (class58.field829 - class169.field2731) * 2.0D / (double) class229.field3689) + class247.field4124);
                                            class36.method276(-1, (int) ((double) (class209.field3356 - class296.field4680) * 2.0D / (double) class229.field3689) + class60.field838);
                                        }
                                        continue;
                                    }
                                    class49.field706 = 0;
                                    continue;
                                }
                                if (var9.field2005 == 1401) {
                                    if (var20) {
                                        class34.method258(var9.field2102, class296.field4680 - var11, class169.field2731 - var10, var9.field2167, 126);
                                    }
                                    continue;
                                }
                                if (var9.field2005 == 1402) {
                                    class274.method1896(var9, 10);
                                    continue;
                                }
                            }
                            if (!var9.field2172 && var21) {
                                var9.field2172 = true;
                                if (var9.field2083 != null) {
                                    class294 var34 = new class294();
                                    var34.field4666 = true;
                                    var34.field4668 = var9;
                                    var34.field4667 = class126.field1850 - var10;
                                    var34.field4661 = class101.field1497 - var11;
                                    var34.field4664 = var9.field2083;
                                    class120.field1747.method1385(var34, true);
                                }
                            }
                            if (var9.field2172 && var20 && var9.field2051 != null) {
                                class294 var35 = new class294();
                                var35.field4666 = true;
                                var35.field4668 = var9;
                                var35.field4667 = class169.field2731 - var10;
                                var35.field4661 = class296.field4680 - var11;
                                var35.field4664 = var9.field2051;
                                class120.field1747.method1385(var35, true);
                            }
                            if (var9.field2172 && !var20) {
                                var9.field2172 = false;
                                if (var9.field2168 != null) {
                                    class294 var36 = new class294();
                                    var36.field4666 = true;
                                    var36.field4668 = var9;
                                    var36.field4667 = class169.field2731 - var10;
                                    var36.field4661 = class296.field4680 - var11;
                                    var36.field4664 = var9.field2168;
                                    class155.field2552.method1385(var36, true);
                                }
                            }
                            if (var20 && var9.field2076 != null) {
                                class294 var37 = new class294();
                                var37.field4666 = true;
                                var37.field4668 = var9;
                                var37.field4667 = class169.field2731 - var10;
                                var37.field4661 = class296.field4680 - var11;
                                var37.field4664 = var9.field2076;
                                class120.field1747.method1385(var37, true);
                            }
                            if (!var9.field2045 && var19) {
                                var9.field2045 = true;
                                if (var9.field2116 != null) {
                                    class294 var38 = new class294();
                                    var38.field4666 = true;
                                    var38.field4668 = var9;
                                    var38.field4667 = class169.field2731 - var10;
                                    var38.field4661 = class296.field4680 - var11;
                                    var38.field4664 = var9.field2116;
                                    class120.field1747.method1385(var38, true);
                                }
                            }
                            if (var9.field2045 && var19 && var9.field1996 != null) {
                                class294 var39 = new class294();
                                var39.field4666 = true;
                                var39.field4668 = var9;
                                var39.field4667 = class169.field2731 - var10;
                                var39.field4661 = class296.field4680 - var11;
                                var39.field4664 = var9.field1996;
                                class120.field1747.method1385(var39, true);
                            }
                            if (var9.field2045 && !var19) {
                                var9.field2045 = false;
                                if (var9.field2014 != null) {
                                    class294 var40 = new class294();
                                    var40.field4666 = true;
                                    var40.field4668 = var9;
                                    var40.field4667 = class169.field2731 - var10;
                                    var40.field4661 = class296.field4680 - var11;
                                    var40.field4664 = var9.field2014;
                                    class155.field2552.method1385(var40, true);
                                }
                            }
                            if (var9.field2009 != null) {
                                class294 var41 = new class294();
                                var41.field4668 = var9;
                                var41.field4664 = var9.field2009;
                                class20.field223.method1385(var41, true);
                            }
                            if (var9.field2151 != null && class42.field582 > var9.field2048) {
                                if (var9.field2033 == null || class42.field582 - var9.field2048 > 32) {
                                    class294 var46 = new class294();
                                    var46.field4668 = var9;
                                    var46.field4664 = var9.field2151;
                                    class120.field1747.method1385(var46, true);
                                } else {
                                    label572: for (int var42 = var9.field2048; var42 < class42.field582; var42++) {
                                        int var43 = class27.field316[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2033.length; var44++) {
                                            if (var9.field2033[var44] == var43) {
                                                class294 var45 = new class294();
                                                var45.field4668 = var9;
                                                var45.field4664 = var9.field2151;
                                                class120.field1747.method1385(var45, true);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field2048 = class42.field582;
                            }
                            if (var9.field2087 != null && class80.field1163 > var9.field2109) {
                                if (var9.field2115 == null || class80.field1163 - var9.field2109 > 32) {
                                    class294 var51 = new class294();
                                    var51.field4668 = var9;
                                    var51.field4664 = var9.field2087;
                                    class120.field1747.method1385(var51, true);
                                } else {
                                    label548: for (int var47 = var9.field2109; var47 < class80.field1163; var47++) {
                                        int var48 = class48.field703[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2115.length; var49++) {
                                            if (var9.field2115[var49] == var48) {
                                                class294 var50 = new class294();
                                                var50.field4668 = var9;
                                                var50.field4664 = var9.field2087;
                                                class120.field1747.method1385(var50, true);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field2109 = class80.field1163;
                            }
                            if (var9.field2166 != null && class150.field2444 > var9.field2018) {
                                if (var9.field2024 == null || class150.field2444 - var9.field2018 > 32) {
                                    class294 var56 = new class294();
                                    var56.field4668 = var9;
                                    var56.field4664 = var9.field2166;
                                    class120.field1747.method1385(var56, true);
                                } else {
                                    label524: for (int var52 = var9.field2018; var52 < class150.field2444; var52++) {
                                        int var53 = class121.field1770[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2024.length; var54++) {
                                            if (var9.field2024[var54] == var53) {
                                                class294 var55 = new class294();
                                                var55.field4668 = var9;
                                                var55.field4664 = var9.field2166;
                                                class120.field1747.method1385(var55, true);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field2018 = class150.field2444;
                            }
                            if (var9.field2013 != null && class217.field3456 > var9.field2095) {
                                if (var9.field2067 == null || class217.field3456 - var9.field2095 > 32) {
                                    class294 var61 = new class294();
                                    var61.field4668 = var9;
                                    var61.field4664 = var9.field2013;
                                    class120.field1747.method1385(var61, true);
                                } else {
                                    label500: for (int var57 = var9.field2095; var57 < class217.field3456; var57++) {
                                        int var58 = class109.field1572[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2067.length; var59++) {
                                            if (var9.field2067[var59] == var58) {
                                                class294 var60 = new class294();
                                                var60.field4668 = var9;
                                                var60.field4664 = var9.field2013;
                                                class120.field1747.method1385(var60, true);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field2095 = class217.field3456;
                            }
                            if (var9.field2008 != null && class180.field2894 > var9.field2032) {
                                if (var9.field2043 == null || class180.field2894 - var9.field2032 > 32) {
                                    class294 var66 = new class294();
                                    var66.field4668 = var9;
                                    var66.field4664 = var9.field2008;
                                    class120.field1747.method1385(var66, true);
                                } else {
                                    label476: for (int var62 = var9.field2032; var62 < class180.field2894; var62++) {
                                        int var63 = class121.field1775[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field2043.length; var64++) {
                                            if (var9.field2043[var64] == var63) {
                                                class294 var65 = new class294();
                                                var65.field4668 = var9;
                                                var65.field4664 = var9.field2008;
                                                class120.field1747.method1385(var65, true);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field2032 = class180.field2894;
                            }
                            if (class212.field3403 > var9.field2089 && var9.field2105 != null) {
                                class294 var67 = new class294();
                                var67.field4668 = var9;
                                var67.field4664 = var9.field2105;
                                class120.field1747.method1385(var67, true);
                            }
                            if (class76.field1089 > var9.field2089 && var9.field2039 != null) {
                                class294 var68 = new class294();
                                var68.field4668 = var9;
                                var68.field4664 = var9.field2039;
                                class120.field1747.method1385(var68, true);
                            }
                            if (class116.field1669 > var9.field2089 && var9.field2044 != null) {
                                class294 var69 = new class294();
                                var69.field4668 = var9;
                                var69.field4664 = var9.field2044;
                                class120.field1747.method1385(var69, true);
                            }
                            if (class123.field1797 > var9.field2089 && var9.field2147 != null) {
                                class294 var70 = new class294();
                                var70.field4668 = var9;
                                var70.field4664 = var9.field2147;
                                class120.field1747.method1385(var70, true);
                            }
                            if (class46.field673 > var9.field2089 && var9.field2161 != null) {
                                class294 var71 = new class294();
                                var71.field4668 = var9;
                                var71.field4664 = var9.field2161;
                                class120.field1747.method1385(var71, true);
                            }
                            var9.field2089 = class231.field3717;
                            if (var9.field2125 != null) {
                                for (int var72 = 0; var72 < class185.field2988; var72++) {
                                    class294 var73 = new class294();
                                    var73.field4668 = var9;
                                    var73.field4662 = class159.field2596[var72];
                                    var73.field4663 = class83.field1200[var72];
                                    var73.field4664 = var9.field2125;
                                    class120.field1747.method1385(var73, true);
                                }
                            }
                            if (class99.field1461 && var9.field2103 != null) {
                                class294 var74 = new class294();
                                var74.field4668 = var9;
                                var74.field4664 = var9.field2103;
                                class120.field1747.method1385(var74, true);
                            }
                        }
                    }
                    if (!var9.field2077 && class16.field184 == null && class82.field1187 == null && !class206.field3315) {
                        if ((var9.field2088 >= 0 || var9.field2090 != 0) && class169.field2731 >= var12 && class296.field4680 >= var13 && class169.field2731 < var14 && class296.field4680 < var15) {
                            if (var9.field2088 >= 0) {
                                class260.field4250 = arg0[var9.field2088];
                            } else {
                                class260.field4250 = var9;
                            }
                        }
                        if (var9.field2150 == 8 && class169.field2731 >= var12 && class296.field4680 >= var13 && class169.field2731 < var14 && class296.field4680 < var15) {
                            class272.field4373 = var9;
                        }
                        if (var9.field2025 > var9.field2167) {
                            class6.method35((byte) 37, var9.field2102 + var10, var9.field2025, var11, class169.field2731, var9, var9.field2167, class296.field4680);
                        }
                    }
                    if (var9.field2150 == 0) {
                        method1164(arg0, var9.field2073, var12, var13, var14, var15, var10 - var9.field2065, var11 - var9.field1995);
                        if (var9.field2052 != null) {
                            method1164(var9.field2052, var9.field2073, var12, var13, var14, var15, var10 - var9.field2065, var11 - var9.field1995);
                        }
                        class17 var75 = (class17) class124.field1806.method1034((long) var9.field2073, (byte) 21);
                        if (var75 != null) {
                            class152.method1100(var14, var13, var12, var15, -17270, var75.field191, var11, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method856(int arg0) {
        field2586++;
        if (class38.field533 == 1000) {
            return;
        }
        long var2 = class45.method339(500) / 1000000L - class51.field743;
        class51.field743 = class45.method339(500) / 1000000L;
        boolean var4 = class94.method740((byte) 118);
        if (var4 && class195.field3136 && class240.field3830 != null) {
            class240.field3830.method1602((byte) -113);
        }
        if ((class38.field533 == 30 || class38.field533 == 10) && (class29.field348 || class149.field2435 != 0L && class197.method1454((byte) -104) > class149.field2435)) {
            class76.method550(class198.field3196, (byte) -124, class265.field4301, class29.field348, class243.method1724(arg0 + 74));
        }
        if (class175.field2847 == null) {
            Container var5;
            if (class175.field2847 != null) {
                var5 = class175.field2847;
            } else if (class85.field1240 == null) {
                var5 = class138.field2241.field63;
            } else {
                var5 = class85.field1240;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class85.field1240 == var5) {
                Insets var8 = class85.field1240.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class80.field1168 != var6 || class164.field2670 != var7) {
                if (class7.field73.startsWith("mac")) {
                    class80.field1168 = var6;
                    class164.field2670 = var7;
                } else {
                    class80.method589(arg0 ^ 0x4);
                }
                class149.field2435 = class197.method1454((byte) -104) + 500L;
            }
        }
        boolean var9 = false;
        if (class208.field3341) {
            var9 = true;
            class208.field3341 = false;
        }
        if (var9) {
            class115.method846(-93);
        }
        if (class38.field533 == 0) {
            class189.method1411(class133.field2189, var9, (Color) null, arg0 ^ 0x2A, class262.field4261);
        } else if (class38.field533 == 5) {
            class168.method1241(class285.field4511, 31308, false);
        } else if (class38.field533 == 10) {
            class61.method436((byte) -123);
        } else if (class38.field533 == 25 || class38.field533 == 28) {
            if (class10.field96 == 1) {
                if (class264.field4289 < class143.field2315) {
                    class264.field4289 = class143.field2315;
                }
                int var11 = (class264.field4289 - class143.field2315) * 50 / class264.field4289;
                class12.method94(class132.field2182 + "<br>(" + var11 + "%)", arg0 ^ 0xFE, false);
            } else if (class10.field96 == 2) {
                if (class200.field3211 < class286.field4549) {
                    class200.field3211 = class286.field4549;
                }
                int var10 = ((class200.field3211 - class286.field4549) * 50 / class200.field3211) + 50;
                class12.method94(class132.field2182 + "<br>(" + var10 + "%)", 250, false);
            } else {
                class12.method94(class132.field2182, 250, false);
            }
        } else if (class38.field533 == 30) {
            class296.method1991(var2, true);
        } else if (class38.field533 == 40) {
            class12.method94(class150.field2446 + "<br>" + class277.field4439, arg0 + 246, false);
        }
        if ((class38.field533 == 30 || class38.field533 == 10) && class93.field1389 == 0 && !var9) {
            try {
                Graphics var12 = class10.field89.getGraphics();
                for (int var13 = 0; var13 < class115.field1664; var13++) {
                    if (class294.field4673[var13]) {
                        class29.field367.method116(class55.field783[var13], class138.field2240[var13], var12, class10.field93[var13], -124, class188.field3047[var13]);
                        class294.field4673[var13] = false;
                    }
                }
            } catch (Exception var17) {
                class10.field89.repaint();
            }
        } else if (class38.field533 != 0) {
            try {
                Graphics var14 = class10.field89.getGraphics();
                class29.field367.method114(-2377, 0, var14, 0);
                for (int var15 = 0; var15 < class115.field1664; var15++) {
                    class294.field4673[var15] = false;
                }
            } catch (Exception var16) {
                class10.field89.repaint();
            }
        }
        if (class180.field2906) {
            class230.method1638((byte) -95);
        }
        if (class96.field1421 && class38.field533 == 10 && class211.field3384 != -1) {
            class96.field1421 = false;
            class133.method963(class138.field2241, -38);
        }
        if (arg0 != 4) {
            field2582 = 115;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method1165(byte[] arg0, int arg1) {
        if (arg1 != -2) {
            method1164((class131[]) null, -105, 93, 4, 59, -9, 71, -57);
        }
        class152 var3 = new class152(arg0);
        while (true) {
            int var4 = var3.method1111(arg1 + 257);
            if (var4 == 0) {
                field2593++;
                return;
            }
            if (var4 == 1) {
                var3.method1126(false);
                var3.method1126(false);
                var3.method1126(false);
                var3.method1126(false);
                var3.method1126(false);
                var3.method1126(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    private final void method1166(boolean arg0, int arg1) {
        field2590++;
        class280.field4465.field3307++;
        class280.field4465.field3306 = arg1;
        if (arg0) {
            class133.field2188 = null;
            class245.field3977 = null;
            class119.field1726 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method859(byte arg0) {
        if (class277.field4440 != null) {
            class277.field4440.field649 = false;
        }
        class277.field4440 = null;
        if (class180.field2901 != null) {
            class180.field2901.method728((byte) -84);
            class180.field2901 = null;
        }
        field2591++;
        class17.method118(class10.field89, 117);
        class201.method1474(7558, class10.field89);
        if (class148.field2417 != null) {
            class148.field2417.method842(class10.field89, (byte) -120);
        }
        class92.method723(0);
        class76.method553(-1);
        class148.field2417 = null;
        if (class240.field3830 != null) {
            class240.field3830.method1607((byte) 106);
        }
        if (class223.field3572 != null) {
            class223.field3572.method1607((byte) 106);
        }
        class280.field4465.method1505(122);
        int var2 = -97 / ((50 - arg0) / 53);
        class58.field828.method1010(100);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lqi;)Lqi;")
    public static final class131 method1167(class131 arg0) {
        int var1 = method1168(arg0).method533((byte) -76);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class122.method891(arg0.field2054, (byte) -124);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2589++;
        if (!this.method861(26445)) {
            return;
        }
        class243.field3923 = Integer.parseInt(this.getParameter("worldid"));
        class27.field313 = Integer.parseInt(this.getParameter("modewhere"));
        if (class27.field313 < 0 || class27.field313 > 1) {
            class27.field313 = 0;
        }
        class56.field809 = Integer.parseInt(this.getParameter("modewhat"));
        if (class56.field809 < 0 || class56.field809 > 2) {
            class56.field809 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class18.field196 = true;
        } else {
            class18.field196 = false;
        }
        try {
            class48.field701 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class48.field701 = 0;
        }
        class220.method1577(-111, class48.field701);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class210.field3369 = true;
        } else {
            class210.field3369 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class8.field81 = true;
        } else {
            class8.field81 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class175.field2850 = 1;
        } else {
            class175.field2850 = 0;
        }
        try {
            class57.field821 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class57.field821 = 0;
        }
        class154.field2539 = this.getParameter("settings");
        if (class154.field2539 == null) {
            class154.field2539 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class200.field3212 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class200.field3212 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class108.field1569 = true;
        } else {
            class108.field1569 = false;
        }
        class18.field202 = this;
        this.method867(765, 545, 503, -82, class56.field809 + 32);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lqi;)Lhj;")
    public static final class73 method1168(class131 arg0) {
        class73 var1 = (class73) class190.field3062.method1034(((long) arg0.field2073 << 32) + (long) arg0.field2061, (byte) 21);
        return var1 == null ? arg0.field2158 : var1;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1169(byte arg0) {
        field2588++;
        for (class185.field2988 = 0; class120.method880(false) && class185.field2988 < 128; class185.field2988++) {
            class159.field2596[class185.field2988] = class228.field3653;
            class83.field1200[class185.field2988] = class185.field2985;
        }
        class161.field2628++;
        if (class211.field3384 != -1) {
            class152.method1100(class23.field265, 0, 0, class154.field2543, -17270, class211.field3384, 0, 0);
        }
        class231.field3717++;
        if (class175.field2850 == 0) {
            class215.method1546(-97);
        } else if (class43.field620 == 0 && class179.field2890 == 0) {
            if (class176.field2853 == 2) {
                class10.method86(arg0 ^ 0xFFFFFF93);
            } else {
                class111.method814((byte) -108);
            }
            if ((class50.field736 >> 7) < 14 || class50.field736 >> 7 >= 90 || class196.field3177 >> 7 < 14 || (class196.field3177 >> 7) >= 90) {
                class55.method415((byte) -20);
            }
        }
        while (true) {
            class294 var2;
            class131 var3;
            class131 var4;
            do {
                var2 = (class294) class20.field223.method1389((byte) 47);
                if (var2 == null) {
                    if (arg0 != 22) {
                        field2578 = -111;
                    }
                    while (true) {
                        class294 var5;
                        class131 var6;
                        class131 var7;
                        do {
                            var5 = (class294) class155.field2552.method1389((byte) 47);
                            if (var5 == null) {
                                while (true) {
                                    class294 var8;
                                    class131 var9;
                                    class131 var10;
                                    do {
                                        var8 = (class294) class120.field1747.method1389((byte) 47);
                                        if (var8 == null) {
                                            if (class16.field184 != null) {
                                                class182.method1354((byte) 109);
                                            }
                                            if (class285.field4508 != null && class285.field4508.field4450 == 1) {
                                                if (class285.field4508.field4449 != null) {
                                                    class286.method1941(class43.field611, -118, class277.field4437);
                                                }
                                                class277.field4437 = false;
                                                class285.field4508 = null;
                                                class43.field611 = null;
                                            }
                                            if ((class264.field4290 % 1500) == 0) {
                                                class83.method604(-73);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4668;
                                        if (var9.field2061 < 0) {
                                            break;
                                        }
                                        var10 = class122.method891(var9.field2054, (byte) -125);
                                    } while (var10 == null || var10.field2052 == null || var9.field2061 >= var10.field2052.length || var10.field2052[var9.field2061] != var9);
                                    class266.method1852(var8, 1);
                                }
                            }
                            var6 = var5.field4668;
                            if (var6.field2061 < 0) {
                                break;
                            }
                            var7 = class122.method891(var6.field2054, (byte) -128);
                        } while (var7 == null || var7.field2052 == null || var6.field2061 >= var7.field2052.length || var7.field2052[var6.field2061] != var6);
                        class266.method1852(var5, 1);
                    }
                }
                var3 = var2.field4668;
                if (var3.field2061 < 0) {
                    break;
                }
                var4 = class122.method891(var3.field2054, (byte) -127);
            } while (var4 == null || var4.field2052 == null || var4.field2052.length <= var3.field2061 || var4.field2052[var3.field2061] != var3);
            class266.method1852(var2, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public static final void method1170(byte arg0) {
        class129.field1983.method1558(-124);
        class155.field2555.method1558(-94);
        field2581++;
        if (arg0 >= -1) {
            field2578 = 83;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method1171(byte arg0) {
        field2577++;
        if (class46.field662 < class280.field4465.field3307) {
            class84.field1216 = (class280.field4465.field3307 - 1) * 50 * 5;
            if (class84.field1216 > 3000) {
                class84.field1216 = 3000;
            }
            if (class152.field2494 == class146.field2390) {
                class146.field2390 = class213.field3412;
            } else {
                class146.field2390 = class152.field2494;
            }
            if (class280.field4465.field3307 >= 2 && class280.field4465.field3306 == 6) {
                this.method854("js5connect_outofdate", (byte) 0);
                class38.field533 = 1000;
                return;
            }
            if (class280.field4465.field3307 >= 4 && class280.field4465.field3306 == -1) {
                this.method854("js5crc", (byte) 0);
                class38.field533 = 1000;
                return;
            }
            if (class280.field4465.field3307 >= 4 && (class38.field533 == 0 || class38.field533 == 5)) {
                if (class280.field4465.field3306 == 7 || class280.field4465.field3306 == 9) {
                    this.method854("js5connect_full", (byte) 0);
                } else if (class280.field4465.field3306 > 0) {
                    this.method854("js5connect", (byte) 0);
                } else {
                    this.method854("js5io", (byte) 0);
                }
                class38.field533 = 1000;
                return;
            }
        }
        class46.field662 = class280.field4465.field3307;
        if (class84.field1216 > 0) {
            class84.field1216--;
            return;
        }
        try {
            if (arg0 < 57) {
                field2578 = 36;
            }
            if (class119.field1726 == 0) {
                class133.field2188 = class138.field2241.method47(class146.field2390, 87, class233.field3729);
                class119.field1726++;
            }
            if (class119.field1726 == 1) {
                if (class133.field2188.field4450 == 2) {
                    this.method1166(true, 1000);
                    return;
                }
                if (class133.field2188.field4450 == 1) {
                    class119.field1726++;
                }
            }
            if (class119.field1726 == 2) {
                class245.field3977 = new class92((Socket) class133.field2188.field4449, class138.field2241);
                class152 var2 = new class152(5);
                var2.method1074(15, 122);
                var2.method1119(545, (byte) 31);
                class245.field3977.method726(0, 5, 29023, var2.field2523);
                class119.field1726++;
                class61.field851 = class197.method1454((byte) -104);
            }
            if (class119.field1726 == 3) {
                if (class38.field533 == 0 || class38.field533 == 5 || class245.field3977.method727(1) > 0) {
                    int var3 = class245.field3977.method719(true);
                    if (var3 != 0) {
                        this.method1166(true, var3);
                        return;
                    }
                    class119.field1726++;
                } else if ((class197.method1454((byte) -104) - class61.field851) > 30000L) {
                    this.method1166(true, 1001);
                    return;
                }
            }
            if (class119.field1726 == 4) {
                boolean var4 = class38.field533 == 5 || class38.field533 == 10 || class38.field533 == 28;
                class280.field4465.method1498(true, !var4, class245.field3977);
                class133.field2188 = null;
                class119.field1726 = 0;
                class245.field3977 = null;
            }
        } catch (IOException var5) {
            this.method1166(true, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lqi;)Z")
    public static final boolean method1172(class131 arg0) {
        if (class36.field447) {
            if (method1168(arg0).field1063 != 0) {
                return false;
            }
            if (arg0.field2150 == 0) {
                return false;
            }
        }
        return arg0.field2066;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    private final void method1173(byte arg0) {
        field2580++;
        if (!class96.field1421) {
            label241: while (true) {
                do {
                    if (!class120.method880(false)) {
                        break label241;
                    }
                } while (class185.field2985 != 's' && class185.field2985 != 'S');
                class96.field1421 = true;
            }
        }
        if (class291.field4610 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class197.method1454((byte) -104);
            if (class164.field2671 == 0L) {
                class164.field2671 = var4;
            }
            if (var3 > 16384 && (var4 - class164.field2671) < 5000L) {
                if (var4 - class272.field4371 > 1000L) {
                    System.gc();
                    class272.field4371 = var4;
                }
                class133.field2189 = 5;
                class262.field4261 = class48.field699;
            } else {
                class133.field2189 = 5;
                class262.field4261 = class67.field986;
                class291.field4610 = 10;
            }
        } else if (class291.field4610 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class138.field2237[var6] = new class113(104, 104);
            }
            class133.field2189 = 10;
            class291.field4610 = 30;
            class262.field4261 = class69.field1025;
        } else if (class291.field4610 == 30) {
            if (class163.field2644 == null) {
                class163.field2644 = new class61(class280.field4465, class58.field828);
            }
            if (class163.field2644.method438(true)) {
                class193.field3110 = class285.method1938(0, true, true, false, 12504);
                class281.field4478 = class285.method1938(1, true, true, false, 12504);
                class257.field4233 = class285.method1938(2, true, false, true, 12504);
                class143.field2325 = class285.method1938(3, true, true, false, 12504);
                class257.field4235 = class285.method1938(4, true, true, false, 12504);
                class159.field2599 = class285.method1938(5, true, true, true, arg0 + 12580);
                class81.field1173 = class285.method1938(6, false, true, true, arg0 ^ 0xFFFFCF6C);
                class114.field1646 = class285.method1938(7, true, true, false, 12504);
                class90.field1337 = class285.method1938(8, true, true, false, 12504);
                class38.field535 = class285.method1938(9, true, true, false, 12504);
                class125.field1841 = class285.method1938(10, true, true, false, 12504);
                class276.field4428 = class285.method1938(11, true, true, false, 12504);
                class245.field4033 = class285.method1938(12, true, true, false, 12504);
                class125.field1827 = class285.method1938(13, true, true, false, 12504);
                class252.field4159 = class285.method1938(14, false, true, false, 12504);
                class143.field2326 = class285.method1938(15, true, true, false, 12504);
                class75.field1076 = class285.method1938(16, true, true, false, 12504);
                class124.field1813 = class285.method1938(17, true, true, false, arg0 + 12580);
                class20.field220 = class285.method1938(18, true, true, false, arg0 ^ 0xFFFFCF6C);
                class218.field3492 = class285.method1938(19, true, true, false, 12504);
                class156.field2557 = class285.method1938(20, true, true, false, 12504);
                class191.field3081 = class285.method1938(21, true, true, false, 12504);
                class160.field2619 = class285.method1938(22, true, true, false, arg0 + 12580);
                class296.field4676 = class285.method1938(23, true, true, true, 12504);
                class196.field3180 = class285.method1938(24, true, true, false, 12504);
                class3.field34 = class285.method1938(25, true, true, false, 12504);
                class99.field1454 = class285.method1938(26, true, true, true, 12504);
                class265.field4299 = class285.method1938(27, true, true, false, 12504);
                class164.field2662 = class285.method1938(28, true, true, true, 12504);
                class262.field4261 = class267.field4315;
                class291.field4610 = 40;
                class133.field2189 = 15;
            } else {
                class133.field2189 = 12;
                class262.field4261 = class36.field526;
            }
        } else if (class291.field4610 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class172.field2766[var8].method883(arg0 ^ 0xFFFFFFC5) * class265.field4300[var8] / 100;
            }
            if (var7 == 100) {
                class133.field2189 = 20;
                class262.field4261 = class210.field3375;
                class161.method1202(class90.field1337, (byte) -34);
                class48.method372(0, class90.field1337);
                class229.method1636((byte) 66, class90.field1337);
                class291.field4610 = 41;
            } else {
                class133.field2189 = 20;
                if (var7 != 0) {
                    class262.field4261 = class184.field2975 + var7 + "%";
                }
            }
        } else if (class291.field4610 == 41) {
            if (class164.field2662.method629(arg0 + 75)) {
                this.method1165(class164.field2662.method645(-102, 1), -2);
                class262.field4261 = class21.field243;
                class133.field2189 = 25;
                class291.field4610 = 45;
            } else {
                class262.field4261 = class26.field296 + class164.field2662.method635(0) + "%";
                class133.field2189 = 25;
            }
        } else if (class291.field4610 == 45) {
            class44.method333(22050, (byte) 40, class139.field2246, 2);
            class138.field2232 = new class243();
            class138.field2232.method1732(128, -28724, 9);
            class240.field3830 = class189.method1408(class10.field89, 1024, 22050, 0, class138.field2241);
            class240.field3830.method1604((byte) -83, class138.field2232);
            class67.method482(class138.field2232, class257.field4235, class252.field4159, class143.field2326, (byte) 80);
            class223.field3572 = class189.method1408(class10.field89, 1024, 2048, 1, class138.field2241);
            class73.field1057 = new class107();
            class223.field3572.method1604((byte) -49, class73.field1057);
            class119.field1723 = new class88(22050, class28.field329);
            class230.field3714 = class81.field1173.method619(-1, "scape main");
            class291.field4610 = 50;
            class133.field2189 = 30;
            class262.field4261 = class19.field215;
        } else if (class291.field4610 == 50) {
            int var9 = class160.method1189(class125.field1827, false, class90.field1337);
            int var10 = class44.method336(-65);
            if (var10 > var9) {
                class133.field2189 = 35;
                class262.field4261 = class164.field2666 + var9 * 100 / var10 + "%";
            } else {
                class133.field2189 = 35;
                class262.field4261 = class99.field1450;
                class291.field4610 = 60;
            }
        } else if (class291.field4610 == 60) {
            int var11 = class124.method897((byte) 108, class90.field1337);
            int var12 = class48.method373((byte) -79);
            if (var11 < var12) {
                class133.field2189 = 40;
                class262.field4261 = class99.field1449 + var11 * 100 / var12 + "%";
            } else {
                class291.field4610 = 65;
                class133.field2189 = 40;
                class262.field4261 = class210.field3377;
            }
        } else if (class291.field4610 == 65) {
            class138.method981(arg0 ^ 0xFFFFEAAC, class125.field1827, class90.field1337);
            class133.field2189 = 45;
            class262.field4261 = class84.field1220;
            class256.method1811(5, true);
            class291.field4610 = 70;
        } else if (class291.field4610 == 70) {
            class257.field4233.method629(-1);
            byte var13 = 0;
            int var14 = var13 + class257.field4233.method635(0);
            class75.field1076.method629(-1);
            int var15 = var14 + class75.field1076.method635(0);
            class124.field1813.method629(arg0 ^ 0x4B);
            int var16 = var15 + class124.field1813.method635(arg0 + 76);
            class20.field220.method629(-1);
            int var17 = var16 + class20.field220.method635(0);
            class218.field3492.method629(-1);
            int var18 = var17 + class218.field3492.method635(0);
            class156.field2557.method629(-1);
            int var19 = var18 + class156.field2557.method635(arg0 + 76);
            class191.field3081.method629(-1);
            int var20 = var19 + class191.field3081.method635(0);
            class160.field2619.method629(-1);
            int var21 = var20 + class160.field2619.method635(arg0 + 76);
            class196.field3180.method629(-1);
            int var22 = var21 + class196.field3180.method635(arg0 + 76);
            class3.field34.method629(arg0 ^ 0x4B);
            int var23 = var22 + class3.field34.method635(0);
            class265.field4299.method629(-1);
            int var24 = var23 + class265.field4299.method635(arg0 ^ 0xFFFFFFB4);
            if (var24 < 1100) {
                class133.field2189 = 50;
                class262.field4261 = class180.field2904 + var24 / 11 + "%";
            } else {
                class91.method714(arg0 ^ 0xFFFFFFE7, class257.field4233);
                class34.method259(class257.field4233, (byte) 51);
                class132.method958(class257.field4233, arg0 ^ 0xFFFFFFB0);
                class46.method342(class114.field1646, 3, class257.field4233);
                class228.method1629(true, class114.field1646, class75.field1076, arg0 + 22987);
                class243.method1705(class114.field1646, -119, class20.field220);
                class200.method1472(true, 10634, class114.field1646, class218.field3492, class143.field2322);
                class135.method971(class257.field4233, 3);
                class11.method92(class193.field3110, class156.field2557, 123, class281.field4478);
                class247.method1781(class257.field4233, 1);
                class29.method209(class191.field3081, class114.field1646, 2);
                class183.method1361(8812, class160.field2619);
                class20.method133(-2136, class257.field4233);
                class118.method860(class125.field1827, class143.field2325, class114.field1646, class90.field1337, -91);
                class234.method1655(class257.field4233, (byte) 52);
                class186.method1379(class124.field1813, false);
                class42.method320((byte) -5, class196.field3180, class3.field34, new class81());
                class269.method1868(class3.field34, class196.field3180, -123);
                class8.method56(class257.field4233, (byte) 58);
                class146.method1045(class257.field4233, (byte) -95);
                class91.method716(class257.field4233, true);
                class6.method34(class90.field1337, class257.field4233, arg0 ^ 0xFFFFFFBC);
                class195.method1443(-10, class90.field1337, class257.field4233);
                class262.field4261 = class49.field722;
                class133.field2189 = 50;
                class142.method1014(32064);
                class291.field4610 = 80;
            }
        } else if (class291.field4610 == 80) {
            int var25 = class269.method1869(8575, class90.field1337);
            int var26 = class240.method1683((byte) 76);
            if (var26 > var25) {
                class133.field2189 = 60;
                class262.field4261 = class243.field3935 + var25 * 100 / var26 + "%";
            } else {
                class169.method1244(102, class90.field1337);
                class133.field2189 = 60;
                class262.field4261 = class93.field1394;
                class291.field4610 = 90;
            }
        } else if (class291.field4610 == 90) {
            if (class99.field1454.method629(arg0 + 75)) {
                class32 var27 = new class32(class38.field535, class99.field1454, class90.field1337, 20, !class206.field3314);
                class47.method353(var27);
                if (class213.field3408 == 1) {
                    class47.method361(0.9F);
                }
                if (class213.field3408 == 2) {
                    class47.method361(0.8F);
                }
                if (class213.field3408 == 3) {
                    class47.method361(0.7F);
                }
                if (class213.field3408 == 4) {
                    class47.method361(0.6F);
                }
                class262.field4261 = class19.field211;
                class133.field2189 = 70;
                class291.field4610 = 100;
            } else {
                class262.field4261 = class276.field4436 + class99.field1454.method635(0) + "%";
                class133.field2189 = 70;
            }
        } else if (class291.field4610 == 100) {
            if (class277.method1914(class90.field1337, (byte) 33)) {
                class291.field4610 = 110;
            }
        } else if (class291.field4610 == 110) {
            class277.field4440 = new class45();
            class138.field2241.method53(10, class277.field4440, -9);
            class262.field4261 = class82.field1192;
            class291.field4610 = 120;
            class133.field2189 = 75;
        } else if (class291.field4610 == 120) {
            if (class125.field1841.method640(false, "huffman", "")) {
                class78 var28 = new class78(class125.field1841.method644("huffman", "", -30279));
                class291.method1972((byte) -97, var28);
                class262.field4261 = class88.field1306;
                class291.field4610 = 130;
                class133.field2189 = 80;
            } else {
                class262.field4261 = class36.field524 + "0%";
                class133.field2189 = 80;
            }
        } else if (class291.field4610 == 130) {
            if (!class143.field2325.method629(-1)) {
                class262.field4261 = class20.field218 + class143.field2325.method635(0) * 3 / 4 + "%";
                class133.field2189 = 85;
            } else if (!class245.field4033.method629(-1)) {
                class262.field4261 = class20.field218 + ((class245.field4033.method635(0) / 10) + 75) + "%";
                class133.field2189 = 85;
            } else if (!class125.field1827.method629(arg0 + 75)) {
                class262.field4261 = class20.field218 + (class125.field1827.method635(0) / 20 + 85) + "%";
                class133.field2189 = 85;
            } else if (class296.field4676.method647(26, "details")) {
                class254.method1799(class296.field4676, true, class2.field16);
                class219.method1572(class114.field1646);
                class262.field4261 = class276.field4434;
                class133.field2189 = 95;
                class291.field4610 = 135;
            } else {
                class262.field4261 = class20.field218 + ((class296.field4676.method646("details", (byte) -118) / 10) + 90) + "%";
                class133.field2189 = 85;
            }
        } else if (arg0 == -76) {
            if (class291.field4610 == 135) {
                int var29 = class217.method1565((byte) 101);
                if (var29 == -1) {
                    class133.field2189 = 95;
                    class262.field4261 = class280.field4458;
                } else if (var29 == 7 || var29 == 9) {
                    this.method854("worldlistfull", (byte) 0);
                    class256.method1811(1000, true);
                } else if (class244.field3964) {
                    class133.field2189 = 96;
                    class291.field4610 = 140;
                    class262.field4261 = class100.field1469;
                } else {
                    this.method854("worldlistio_" + var29, (byte) 0);
                    class256.method1811(1000, true);
                }
            } else if (class291.field4610 == 140) {
                class11.field117 = class143.field2325.method619(-1, "loginscreen");
                class159.field2599.method618(true, -1, false);
                class81.field1173.method618(true, -1, true);
                class90.field1337.method618(true, -1, true);
                class125.field1827.method618(true, arg0 + 75, true);
                class125.field1841.method618(true, -1, true);
                class143.field2325.method618(true, -1, true);
                class262.field4261 = class112.field1610;
                class291.field4610 = 150;
                class180.field2906 = true;
                class133.field2189 = 97;
            } else if (class291.field4610 == 150) {
                if (class96.field1421) {
                    class256.field4221 = 0;
                    class198.field3201 = 0;
                    class2.field8 = 0;
                    class112.field1619 = 0;
                }
                class96.field1421 = true;
                class133.method963(class138.field2241, -116);
                class76.method550(-1, (byte) -106, -1, false, class2.field8);
                class133.field2189 = 100;
                class262.field4261 = class141.field2275;
                class291.field4610 = 160;
            } else if (class291.field4610 == 160) {
                class273.method1890(true, (byte) 72);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method863(byte arg0) {
        class80.method589(0);
        class58.field828 = new class142();
        field2583++;
        class280.field4465 = new class205();
        if (class56.field809 != 0) {
            class253.field4170 = new byte[50][];
        }
        class123.method893(class138.field2241, 12497);
        if (class27.field313 == 0) {
            class143.field2298 = this.getCodeBase().getHost();
            class256.field4223 = 43594;
            class159.field2610 = 443;
        } else if (class27.field313 == 1) {
            class143.field2298 = this.getCodeBase().getHost();
            class256.field4223 = class243.field3923 + 40000;
            class159.field2610 = class243.field3923 + 50000;
        } else if (class27.field313 == 2) {
            class159.field2610 = class243.field3923 + 50000;
            class143.field2298 = "127.0.0.1";
            class256.field4223 = class243.field3923 + 40000;
        }
        if (arg0 >= -90) {
            field2582 = 67;
        }
        class91.field1357 = class187.field3010 = class204.field3273 = class91.field1348 = new short[256];
        if (class175.field2850 == 1) {
            class90.field1340 = class78.field1134;
            class247.field4130 = class101.field1484;
            class64.field958 = class45.field653;
            class29.field358 = class212.field3395;
            class171.field2761 = true;
        } else {
            class64.field958 = class217.field3459;
            class90.field1340 = class256.field4224;
            class247.field4130 = class11.field119;
            class29.field358 = class151.field2459;
        }
        class205.field3287 = class256.field4223;
        class152.field2494 = class256.field4223;
        class146.field2390 = class205.field3287;
        class213.field3412 = class159.field2610;
        class233.field3729 = class143.field2298;
        if (class7.field62 == 3 && class27.field313 != 2) {
            class155.field2554 = class243.field3923;
        }
        class143.method1019(1);
        class146.method1048(class10.field89, 124);
        class121.method888(class10.field89, false);
        class148.field2417 = class201.method1479((byte) 37);
        if (class148.field2417 != null) {
            class148.field2417.method840(7, class10.field89);
        }
        class34.field431 = class7.field62;
        try {
            if (class138.field2241.field60 != null) {
                class11.field131 = new class188(class138.field2241.field60, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class267.field4321[var2] = new class188(class138.field2241.field74[var2], 6000, 0);
                }
                class174.field2845 = new class188(class138.field2241.field69, 6000, 0);
                class192.field3093 = new class263(255, class11.field131, class174.field2845, 500000);
                class163.field2646 = new class188(class138.field2241.field58, 24, 0);
                class138.field2241.field60 = null;
                class138.field2241.field74 = null;
                class138.field2241.field58 = null;
                class138.field2241.field69 = null;
            }
        } catch (IOException var3) {
            class174.field2845 = null;
            class192.field3093 = null;
            class163.field2646 = null;
            class11.field131 = null;
        }
        if (class27.field313 != 0) {
            class159.field2605 = true;
        }
        class195.field3157 = class77.field1101;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method857(byte arg0) {
        field2592++;
        if (class38.field533 == 1000) {
            return;
        }
        class264.field4290++;
        if (class264.field4290 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class134.field2203 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class210.field3364.setSeed((long) class134.field2203);
        }
        this.method1163(-93);
        if (class163.field2644 != null) {
            class163.field2644.method437((byte) 127);
        }
        class112.method817((byte) -48);
        class126.method908(-100);
        if (arg0 < 15) {
            field2578 = 98;
        }
        class285.method1936((byte) 121);
        class195.method1446(0);
        if (class148.field2417 != null) {
            int var3 = class148.field2417.method841(true);
            class223.field3571 = var3;
        }
        if (class38.field533 == 0) {
            this.method1173((byte) -76);
            class10.method80(-54);
        } else if (class38.field533 == 5) {
            this.method1173((byte) -76);
            class10.method80(104);
        } else if (class38.field533 == 25 || class38.field533 == 28) {
            class252.method1789((byte) -75);
        }
        if (class38.field533 == 10) {
            this.method1169((byte) 22);
            class276.method1909(25524);
            class21.method135((byte) -126);
            class71.method517((byte) -17);
        } else if (class38.field533 == 30) {
            class71.method519(124);
        } else if (class38.field533 == 40) {
            class71.method517((byte) -7);
            if (class136.field2224 != -3) {
                if (class136.field2224 == 15) {
                    class110.method811((byte) -109);
                    return;
                }
                if (class136.field2224 != 2) {
                    class225.method1612((byte) -94);
                    return;
                }
            }
        }
    }
}
