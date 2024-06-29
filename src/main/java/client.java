import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class234 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "J")
    private static long field2453;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lbf;")
    public static class188 field2447;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Ljc;")
    public static class221 field2450;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1046(int arg0, int arg1) {
        field2451++;
        class32.field466 = 0;
        if (arg1 != -131) {
            method1060((class213) null);
        }
        if (class138.field2320 == class133.field2221) {
            class133.field2221 = class76.field1232;
        } else {
            class133.field2221 = class138.field2320;
        }
        class208.field3482 = null;
        class151.field2511 = null;
        class69.field1120++;
        if (class69.field1120 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class195.field3249 == 0 || class195.field3249 == 5) {
                this.method1626("js5connect_full", (byte) 75);
                class195.field3249 = 1000;
            } else {
                class172.field2815 = 3000;
            }
        } else if (class69.field1120 >= 2 && arg0 == 6) {
            this.method1626("js5connect_outofdate", (byte) 75);
            class195.field3249 = 1000;
        } else if (class69.field1120 >= 4) {
            if (class195.field3249 == 0 || class195.field3249 == 5) {
                this.method1626("js5connect", (byte) 75);
                class195.field3249 = 1000;
            } else {
                class172.field2815 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z")
    public static final boolean method1047(int arg0, int arg1) {
        field2444++;
        if (arg0 != 0) {
            method1062(-34, -100, 69);
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1048(int arg0) {
        field2457++;
        if (class207.field3452 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class7.method31((byte) -88);
            if (class177.field2889 == 0L) {
                class177.field2889 = var4;
            }
            if (var3 > 16384 && var4 - class177.field2889 < 5000L) {
                if ((var4 - class5.field37) > 1000L) {
                    System.gc();
                    class5.field37 = var4;
                }
                class198.field3298 = 5;
                class162.field2652 = class180.field2976;
            } else {
                class207.field3452 = 10;
                class198.field3298 = 5;
                class162.field2652 = class181.field2982;
            }
        } else if (class207.field3452 == 10) {
            class202.method1405(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class159.field2605[var6] = new class170(104, 104);
            }
            class162.field2652 = class64.field1047;
            class198.field3298 = 10;
            class207.field3452 = 30;
        } else if (class207.field3452 == 30) {
            class39.field614 = class97.method721(true, true, false, 0, 1000000);
            class52.field882 = class97.method721(true, true, false, 1, 1000000);
            class60.field977 = class97.method721(false, true, true, 2, 1000000);
            class111.field1885 = class97.method721(true, true, false, 3, 1000000);
            class176.field2883 = class97.method721(true, true, false, 4, arg0 + 999872);
            class143.field2392 = class97.method721(true, true, true, 5, 1000000);
            class149.field2493 = class97.method721(true, false, true, 6, 1000000);
            class51.field807 = class97.method721(true, true, false, 7, arg0 ^ 0xF42C0);
            class162.field2651 = class97.method721(true, true, false, 8, 1000000);
            class223.field3933 = class97.method721(true, true, false, 9, 1000000);
            class177.field2901 = class97.method721(true, true, false, 10, 1000000);
            class33.field496 = class97.method721(true, true, false, 11, 1000000);
            class129.field2162 = class97.method721(true, true, false, 12, 1000000);
            class72.field1146 = class97.method721(true, true, false, 13, 1000000);
            class49.field783 = class97.method721(true, false, false, 14, 1000000);
            class160.field2630 = class97.method721(true, true, false, 15, 1000000);
            class44.field710 = class97.method721(true, true, false, 16, 1000000);
            class47.field747 = class97.method721(true, true, false, 17, 1000000);
            class263.field4607 = class97.method721(true, true, false, 18, arg0 ^ 0xF42C0);
            class212.field3518 = class97.method721(true, true, false, 19, 1000000);
            class156.field2570 = class97.method721(true, true, false, 20, 1000000);
            class85.field1421 = class97.method721(true, true, false, 21, 1000000);
            class189.field3157 = class97.method721(true, true, false, 22, 1000000);
            class95.field1565 = class97.method721(true, true, true, 23, 1000000);
            class96.field1592 = class97.method721(true, true, false, 24, 1000000);
            class14.field216 = class97.method721(true, true, false, 25, 1000000);
            class216.field3744 = class97.method721(true, true, true, 26, 1000000);
            class207.field3452 = 40;
            class162.field2652 = class215.field3737;
            class198.field3298 = 15;
        } else if (class207.field3452 == 40) {
            byte var7 = 0;
            int var8 = var7 + class39.field614.method358(99) * 4 / 100;
            int var9 = var8 + class52.field882.method358(arg0 ^ 0xE3) * 4 / 100;
            int var10 = var9 + class60.field977.method358(99) / 100;
            int var11 = var10 + class111.field1885.method358(arg0 - 29) * 2 / 100;
            int var12 = var11 + class176.field2883.method358(99) * 6 / 100;
            int var13 = var12 + class143.field2392.method358(99) * 4 / 100;
            int var14 = var13 + class149.field2493.method358(99) * 2 / 100;
            int var15 = var14 + class51.field807.method358(arg0 - 29) * 50 / 100;
            int var16 = var15 + class162.field2651.method358(arg0 - 29) * 2 / 100;
            int var17 = var16 + class223.field3933.method358(arg0 - 29) * 2 / 100;
            int var18 = var17 + class177.field2901.method358(99) * 2 / 100;
            int var19 = var18 + class33.field496.method358(99) * 2 / 100;
            int var20 = var19 + class129.field2162.method358(arg0 - 29) * 2 / 100;
            int var21 = var20 + class72.field1146.method358(99) * 2 / 100;
            int var22 = var21 + class49.field783.method358(arg0 - 29) * 2 / 100;
            int var23 = var22 + class160.field2630.method358(arg0 ^ 0xE3) * 2 / 100;
            int var24 = var23 + class44.field710.method358(99) / 100;
            int var25 = var24 + class47.field747.method358(99) / 100;
            int var26 = var25 + class263.field4607.method358(arg0 - 29) / 100;
            int var27 = var26 + class212.field3518.method358(99) / 100;
            int var28 = var27 + class156.field2570.method358(99) / 100;
            int var29 = var28 + class85.field1421.method358(arg0 ^ 0xE3) / 100;
            int var30 = var29 + class189.field3157.method358(arg0 - 29) / 100;
            int var31 = var30 + class95.field1565.method358(99) / 100;
            int var32 = var31 + class96.field1592.method358(99) / 100;
            int var33 = var32 + class14.field216.method358(99) / 100;
            int var34 = var33 + class216.field3744.method358(99) / 100;
            if (var34 == 100) {
                class198.field3298 = 20;
                class162.field2652 = class210.field3492;
                class99.method728((byte) -101, class162.field2651);
                class74.method528(class162.field2651, -1);
                class92.method695(class162.field2651, (byte) -126);
                class22.method113(class162.field2651, -27637);
                class207.field3452 = 45;
            } else {
                if (var34 != 0) {
                    class162.field2652 = class20.method104(-122, new class51[] { class219.field3813, class51.method311(var34, 10), class83.field1399 });
                }
                class198.field3298 = 20;
            }
        } else {
            if (arg0 != 128) {
                this.method1058(10);
            }
            if (class207.field3452 == 45) {
                class220.method1513((byte) -112, 2, 22050, class212.field3522);
                class50.field800 = new class80();
                class50.field800.method584(arg0 - 64, 9, 128);
                class198.field3300 = class175.method1230(class25.field376, 0, 22050, class31.field452, -75);
                class198.field3300.method1220(3, class50.field800);
                class258.method1751(class49.field783, class50.field800, 20645, class160.field2630, class176.field2883);
                class37.field571 = class175.method1230(class25.field376, 1, 2048, class31.field452, -120);
                class166.field2709 = new class71();
                class37.field571.method1220(3, class166.field2709);
                field2450 = new class221(22050, class156.field2568);
                class7.field79 = class149.field2493.method810(class97.field1597, -1);
                class198.field3298 = 30;
                class207.field3452 = 50;
                class162.field2652 = class109.field1854;
            } else if (class207.field3452 == 50) {
                int var35 = class96.method715(arg0 + 1639430060, class162.field2651, class72.field1146);
                int var36 = class151.method1080(17452);
                if (var36 > var35) {
                    class162.field2652 = class20.method104(-121, new class51[] { class72.field1147, class51.method311(var35 * 100 / var36, 10), class83.field1399 });
                    class198.field3298 = 35;
                } else {
                    class207.field3452 = 60;
                    class162.field2652 = class47.field740;
                    class198.field3298 = 35;
                }
            } else if (class207.field3452 == 60) {
                int var37 = class86.method660(-62, class162.field2651);
                int var38 = class260.method1769(-31761);
                if (var38 > var37) {
                    class162.field2652 = class20.method104(79, new class51[] { class218.field3790, class51.method311(var37 * 100 / var38, 10), class83.field1399 });
                    class198.field3298 = 40;
                } else {
                    class198.field3298 = 40;
                    class207.field3452 = 65;
                    class162.field2652 = class249.field4375;
                }
            } else if (class207.field3452 == 65) {
                class130.method955(class162.field2651, -22869, class72.field1146);
                class198.field3298 = 45;
                class162.field2652 = class202.field3393;
                class100.method734(true, 5);
                class207.field3452 = 70;
            } else if (class207.field3452 == 70) {
                class60.field977.method830(-51);
                byte var39 = 0;
                int var40 = var39 + class60.field977.method803(0);
                class44.field710.method830(-70);
                int var41 = var40 + class44.field710.method803(arg0 - 128);
                class47.field747.method830(-19);
                int var42 = var41 + class47.field747.method803(0);
                class263.field4607.method830(-51);
                int var43 = var42 + class263.field4607.method803(0);
                class212.field3518.method830(arg0 ^ 0xFFFFFF20);
                int var44 = var43 + class212.field3518.method803(0);
                class156.field2570.method830(arg0 ^ 0xFFFFFF04);
                int var45 = var44 + class156.field2570.method803(0);
                class85.field1421.method830(-53);
                int var46 = var45 + class85.field1421.method803(arg0 ^ 0x80);
                class189.field3157.method830(-19);
                int var47 = var46 + class189.field3157.method803(0);
                class96.field1592.method830(-49);
                int var48 = var47 + class96.field1592.method803(0);
                class14.field216.method830(-96);
                int var49 = var48 + class14.field216.method803(arg0 - 128);
                if (var49 < 1000) {
                    class162.field2652 = class20.method104(-123, new class51[] { class74.field1179, class51.method311(var49 / 10, arg0 ^ 0x8A), class83.field1399 });
                    class198.field3298 = 50;
                } else {
                    class159.method1132(class60.field977, (byte) -97);
                    class257.method1748(class60.field977, -122);
                    class6.method29(class60.field977, arg0 ^ 0x6554);
                    class252.method1715(class60.field977, false, class51.field807);
                    class247.method1686((byte) 105, class44.field710, class44.field703, class51.field807);
                    class176.method1237(class263.field4607, arg0 + 31779, class51.field807);
                    class69.method482(class212.field3518, class51.field807, class44.field703, class163.field2681, 118);
                    class90.method677(false, class60.field977);
                    class234.method1623(class52.field882, 0, class156.field2570, class39.field614);
                    class52.method332(class51.field807, (byte) -62, class85.field1421);
                    class74.method532(class189.field3157, false);
                    class214.method1472(class60.field977, 124);
                    class217.method1489(class51.field807, class72.field1146, class111.field1885, (byte) -26, class162.field2651);
                    class157.method1117(class60.field977, 0);
                    class72.method504(30727, class47.field747);
                    class144.method1036(class96.field1592, class14.field216, new class115(), (byte) 83);
                    class249.method1693(class14.field216, -129, class96.field1592);
                    class198.field3298 = 50;
                    class162.field2652 = class217.field3771;
                    class45.method227(true);
                    class207.field3452 = 80;
                }
            } else if (class207.field3452 == 80) {
                int var50 = class11.method54(0, class162.field2651);
                int var51 = class234.method1629((byte) -88);
                if (var51 > var50) {
                    class162.field2652 = class20.method104(arg0 - 140, new class51[] { class247.field4280, class51.method311(var50 * 100 / var51, 10), class83.field1399 });
                    class198.field3298 = 60;
                } else {
                    class44.method223(class162.field2651, -117);
                    class162.field2652 = class249.field4378;
                    class198.field3298 = 60;
                    class207.field3452 = 90;
                }
            } else if (class207.field3452 == 90) {
                if (class216.field3744.method830(-67)) {
                    class66 var52 = new class66(class223.field3933, class216.field3744, class162.field2651, 20, !class120.field2000);
                    class73.method520(var52);
                    if (class40.field623 == 1) {
                        class73.method509(0.9F);
                    }
                    if (class40.field623 == 2) {
                        class73.method509(0.8F);
                    }
                    if (class40.field623 == 3) {
                        class73.method509(0.7F);
                    }
                    if (class40.field623 == 4) {
                        class73.method509(0.6F);
                    }
                    class207.field3452 = 100;
                    class162.field2652 = class248.field4361;
                    class198.field3298 = 70;
                } else {
                    class162.field2652 = class20.method104(109, new class51[] { class34.field513, class51.method311(class216.field3744.method803(0), arg0 ^ 0x8A), class83.field1399 });
                    class198.field3298 = 70;
                }
            } else if (class207.field3452 == 100) {
                if (class182.method1293((byte) 116, class162.field2651)) {
                    class207.field3452 = 110;
                }
            } else if (class207.field3452 == 110) {
                class44.field699 = new class182();
                class25.field376.method1570(class44.field699, -28437, 10);
                class207.field3452 = 120;
                class198.field3298 = 75;
                class162.field2652 = class121.field2042;
            } else if (class207.field3452 == 120) {
                if (class177.field2901.method808(class239.field4160, class43.field696, (byte) 119)) {
                    class208 var53 = new class208(class177.field2901.method811(class43.field696, -118, class239.field4160));
                    class233.method1617((byte) -91, var53);
                    class162.field2652 = class24.field359;
                    class198.field3298 = 80;
                    class207.field3452 = 130;
                } else {
                    class162.field2652 = class20.method104(58, new class51[] { class204.field3408, class201.field3357 });
                    class198.field3298 = 80;
                }
            } else if (class207.field3452 == 130) {
                if (!class111.field1885.method830(-104)) {
                    class162.field2652 = class20.method104(-103, new class51[] { class100.field1667, class51.method311(class111.field1885.method803(0) * 3 / 4, 10), class83.field1399 });
                    class198.field3298 = 85;
                } else if (!class129.field2162.method830(arg0 - 248)) {
                    class162.field2652 = class20.method104(107, new class51[] { class100.field1667, class51.method311(class129.field2162.method803(0) / 10 + 75, 10), class83.field1399 });
                    class198.field3298 = 85;
                } else if (!class72.field1146.method830(-56)) {
                    class162.field2652 = class20.method104(41, new class51[] { class100.field1667, class51.method311(class72.field1146.method803(arg0 - 128) / 20 + 85, 10), class83.field1399 });
                    class198.field3298 = 85;
                } else if (class95.field1565.method805(class84.field1415, arg0 ^ 0x7B9A)) {
                    class35.method179(true, class166.field2707, class30.field437, class48.field764, class131.field2187, class95.field1565, class93.field1557);
                    class198.field3298 = 100;
                    class207.field3452 = 140;
                    class162.field2652 = class62.field1013;
                } else {
                    class162.field2652 = class20.method104(arg0 - 2, new class51[] { class100.field1667, class51.method311(class95.field1565.method822(class84.field1415, (byte) -115) / 10 + 90, 10), class83.field1399 });
                    class198.field3298 = 85;
                }
            } else if (class207.field3452 == 140) {
                class98.field1642 = class111.field1885.method810(class183.field3021, arg0 ^ 0xFFFFFF7F);
                class143.field2392.method820(true, false, (byte) 36);
                class149.field2493.method820(true, true, (byte) 36);
                class162.field2651.method820(true, true, (byte) 36);
                class72.field1146.method820(true, true, (byte) 36);
                class177.field2901.method820(true, true, (byte) 36);
                class111.field1885.method820(true, true, (byte) 36);
                class82.field1366 = true;
                class12.method71(arg0 ^ 0x1AE);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1049(int arg0) {
        field2445++;
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class25.field376 != null) {
            class25.field376.method1578(11233, this.getClass());
        }
        if (arg0 != 4) {
            field2450 = null;
        }
        if (class44.field699 != null) {
            class44.field699.field2998 = false;
        }
        class44.field699 = null;
        if (class204.field3415 != null) {
            class204.field3415.method838(-123);
            class204.field3415 = null;
        }
        class147.method1070(class31.field452, (byte) 127);
        class79.method557(class31.field452, (byte) 124);
        if (class130.field2182 != null) {
            class130.field2182.method1225(class31.field452, false);
        }
        class70.method485((byte) -102);
        class246.method1673((byte) 106);
        class130.field2182 = null;
        if (class198.field3300 != null) {
            class198.field3300.method1212(-106);
        }
        if (class37.field571 != null) {
            class37.field571.method1212(arg0 - 118);
        }
        class151.method1081((byte) 113);
        class77.method551((byte) 30);
        try {
            if (class87.field1461 != null) {
                class87.field1461.method1782((byte) 85);
            }
            if (class202.field3392 != null) {
                for (int var2 = 0; var2 < class202.field3392.length; var2++) {
                    if (class202.field3392[var2] != null) {
                        class202.field3392[var2].method1782((byte) 87);
                    }
                }
            }
            if (class259.field4526 != null) {
                class259.field4526.method1782((byte) 97);
            }
            if (class244.field4225 != null) {
                class244.field4225.method1782((byte) 75);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class240.method1648(false);
            }
            class259.field4521 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class239.field4155 = 0;
            } else if (arg0[1].equals("office")) {
                class239.field4155 = 1;
            } else if (arg0[1].equals("local")) {
                class239.field4155 = 2;
            } else {
                class240.method1648(false);
            }
            if (arg0[2].equals("live")) {
                class238.field4141 = 0;
            } else if (arg0[2].equals("rc")) {
                class238.field4141 = 1;
            } else if (arg0[2].equals("wip")) {
                class238.field4141 = 2;
            } else {
                class240.method1648(false);
            }
            if (arg0[4].equals("free")) {
                class44.field703 = false;
            } else if (arg0[4].equals("members")) {
                class44.field703 = true;
            } else {
                class240.method1648(false);
            }
            if (arg0[5].equals("english")) {
                class196.field3290 = 0;
            } else if (arg0[5].equals("german")) {
                class132.method970((byte) 49);
                class196.field3290 = 1;
            } else {
                class240.method1648(false);
            }
            if (arg0[6].equals("game0")) {
                class86.field1440 = 0;
            } else if (arg0[6].equals("game1")) {
                class86.field1440 = 1;
            } else {
                class240.method1648(false);
            }
            if (arg0.length != 8) {
                class149.field2503 = false;
            } else if (arg0[7].equals("safemode")) {
                class149.field2503 = true;
            } else {
                class240.method1648(false);
            }
            class5.field40 = 0;
            class35.field528 = class43.field696;
            class238.field4142 = "127.0.0.1";
            client var1 = new client();
            var1.method1630(509, 0, 765, 503, class238.field4141 + 32, "runescape", 27);
            class131.field2193.setLocation(40, 40);
        } catch (Exception var3) {
            class89.method674(var3, (String) null, 95);
        }
        field2443++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1050(int arg0) {
        if (arg0 > -70) {
            return;
        }
        field2452++;
        if (class31.field445 >= 4) {
            this.method1626("js5crc", (byte) 75);
            class195.field3249 = 1000;
            return;
        }
        if (class22.field332 >= 4) {
            if (class195.field3249 == 0 || class195.field3249 == 5) {
                this.method1626("js5io", (byte) 75);
                class195.field3249 = 1000;
                return;
            }
            class172.field2815 = 3000;
            class22.field332 = 3;
        }
        if (class172.field2815-- > 0) {
            return;
        }
        try {
            if (class32.field466 == 0) {
                class151.field2511 = class25.field376.method1580((byte) 8, class238.field4142, class133.field2221);
                class32.field466++;
            }
            if (class32.field466 == 1) {
                if (class151.field2511.field2504 == 2) {
                    this.method1046(-1, -131);
                    return;
                }
                if (class151.field2511.field2504 == 1) {
                    class32.field466++;
                }
            }
            if (class32.field466 == 2) {
                class208.field3482 = new class114((Socket) class151.field2511.field2505, class25.field376);
                class121 var2 = new class121(5);
                var2.method919(-4742, 15);
                var2.method870(509, (byte) 12);
                class208.field3482.method840(0, -782, var2.field2014, 5);
                class32.field466++;
                field2453 = class7.method31((byte) -88);
            }
            if (class32.field466 == 3) {
                if (class195.field3249 == 0 || class195.field3249 == 5 || class208.field3482.method837(false) > 0) {
                    int var3 = class208.field3482.method839((byte) 101);
                    if (var3 != 0) {
                        this.method1046(var3, -131);
                        return;
                    }
                    class32.field466++;
                } else if ((class7.method31((byte) -88) - field2453) > 30000L) {
                    this.method1046(-2, -131);
                    return;
                }
            }
            if (class32.field466 == 4) {
                boolean var4 = class195.field3249 == 5 || class195.field3249 == 10 || class195.field3249 == 28;
                class27.method141(class208.field3482, !var4, 0);
                class208.field3482 = null;
                class32.field466 = 0;
                class69.field1120 = 0;
                class151.field2511 = null;
            }
        } catch (IOException var5) {
            this.method1046(-3, -131);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwc;IIIIIII)V")
    public static final void method1051(class213[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class213 var9 = arg0[var8];
            if (var9 != null && var9.field3689 == arg1 && (!var9.field3574 || var9.field3623 == 0 || var9.field3656 || method1061(var9) != 0 || class140.field2359 == var9 || var9.field3640 == 1338) && (!var9.field3574 || !method1052(var9))) {
                int var10 = var9.field3605 + arg6;
                int var11 = var9.field3629 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3623 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3603 + var10;
                    int var17 = var9.field3608 + var11;
                    if (var9.field3623 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class136.field2257 == var9) {
                    class222.field3877 = true;
                    class40.field624 = var10;
                    class154.field2562 = var11;
                }
                if (!var9.field3574 || var12 < var14 && var13 < var15) {
                    if (var9.field3623 == 0) {
                        if (!var9.field3574 && method1052(var9) && class29.field416 != var9) {
                            continue;
                        }
                        if (var9.field3562 && class89.field1482 >= var12 && class90.field1504 >= var13 && class89.field1482 < var14 && class90.field1504 < var15) {
                            for (class205 var18 = (class205) class55.field924.method1720(true); var18 != null; var18 = (class205) class55.field924.method1712((byte) 112)) {
                                if (var18.field3435) {
                                    var18.method764((byte) -28);
                                }
                            }
                            if (class41.field660 == 0) {
                                class136.field2257 = null;
                                class140.field2359 = null;
                            }
                            class221.field3843 = false;
                        }
                    }
                    if (var9.field3574) {
                        boolean var19;
                        if (class89.field1482 >= var12 && class90.field1504 >= var13 && class89.field1482 < var14 && class90.field1504 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class147.field2473 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class19.field269 == 1 && class265.field4642 >= var12 && class221.field3834 >= var13 && class265.field4642 < var14 && class221.field3834 < var15) {
                            var21 = true;
                        }
                        if (class32.field463 > 0 && var9.field3676 != null) {
                            for (int var22 = 0; var22 < var9.field3676.length; var22++) {
                                for (int var23 = 0; var23 < class32.field463; var23++) {
                                    int var24 = var9.field3676[var22] & 0xFF;
                                    if (class114.field1946[var23] == var24) {
                                        if (var9.field3595 != null) {
                                            byte var25 = var9.field3595[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class144.field2405[86] || (var25 & 0x1) != 0 && !class144.field2405[82] || (var25 & 0x4) != 0 && !class144.field2405[81])) {
                                                continue;
                                            }
                                        }
                                        class26.method138(class43.field696, var9.field3703, -1, var22 + 1, 6947);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class7.method34(class221.field3834 - var11, var9, class265.field4642 - var10, 124);
                        }
                        if (class136.field2257 != null && class136.field2257 != var9 && var19 && class264.method1794(false, method1061(var9))) {
                            class6.field67 = var9;
                        }
                        if (class140.field2359 == var9) {
                            class83.field1390 = true;
                            class38.field594 = var10;
                            class21.field305 = var11;
                        }
                        if (var9.field3656 || var9.field3640 != 0) {
                            if (var19 && class43.field689 != 0 && var9.field3642 != null) {
                                class205 var26 = new class205();
                                var26.field3435 = true;
                                var26.field3433 = var9;
                                var26.field3438 = class43.field689;
                                var26.field3423 = var9.field3642;
                                class55.field924.method1709(-89, var26);
                            }
                            if (class136.field2257 != null || class78.field1246 != null || class90.field1498 || var9.field3640 != 1400 && class221.field3843) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3640 != 0) {
                                if (var9.field3640 == 1337) {
                                    class243.field4207 = var9;
                                    class25.method135(var9, -28014);
                                    continue;
                                }
                                if (var9.field3640 == 1338) {
                                    if (var21) {
                                        class174.method1222(class221.field3834 - var11, 119, class265.field4642 - var10, var9);
                                    }
                                    continue;
                                }
                                if (var9.field3640 == 1400) {
                                    class87.field1457 = var9;
                                    if (var21) {
                                        if (class144.field2405[82] && class179.field2954 > 0) {
                                            int var27 = (int) ((double) (class265.field4642 - var10 - var9.field3603 / 2) * 2.0D / (double) class79.field1261);
                                            int var28 = (int) ((double) (class221.field3834 - var11 - var9.field3608 / 2) * 2.0D / (double) class79.field1261);
                                            int var29 = class44.field701 + var27;
                                            int var30 = class169.field2758 + var28;
                                            int var31 = class107.field1764 + var29;
                                            int var32 = class85.field1433 + class46.field736 - var30 - 1;
                                            class109.method791(var31, (byte) -72, 0, var32);
                                            class231.method1598(-126);
                                            continue;
                                        }
                                        class221.field3843 = true;
                                        class36.field563 = class89.field1482;
                                        class193.field3241 = class90.field1504;
                                        class245.field4252 = class44.field701;
                                        class130.field2176 = class169.field2758;
                                        continue;
                                    }
                                    if (var20 && class221.field3843) {
                                        class166.method1160((byte) 99, (int) ((double) (class36.field563 - class89.field1482) * 2.0D / (double) class207.field3454) + class245.field4252);
                                        class79.method555(30, (int) ((double) (class193.field3241 - class90.field1504) * 2.0D / (double) class207.field3454) + class130.field2176);
                                        continue;
                                    }
                                    class221.field3843 = false;
                                    continue;
                                }
                                if (var9.field3640 == 1401) {
                                    if (var20) {
                                        class244.method1668(class90.field1504 - var11, var9.field3603, class89.field1482 - var10, 4, var9.field3608);
                                    }
                                    continue;
                                }
                                if (var9.field3640 == 1402) {
                                    class25.method135(var9, -28014);
                                    continue;
                                }
                                if (var9.field3640 == 1404) {
                                    class25.method135(var9, -28014);
                                    continue;
                                }
                            }
                            if (!var9.field3699 && var21) {
                                var9.field3699 = true;
                                if (var9.field3663 != null) {
                                    class205 var33 = new class205();
                                    var33.field3435 = true;
                                    var33.field3433 = var9;
                                    var33.field3434 = class265.field4642 - var10;
                                    var33.field3438 = class221.field3834 - var11;
                                    var33.field3423 = var9.field3663;
                                    class55.field924.method1709(2, var33);
                                }
                            }
                            if (var9.field3699 && var20 && var9.field3572 != null) {
                                class205 var34 = new class205();
                                var34.field3435 = true;
                                var34.field3433 = var9;
                                var34.field3434 = class89.field1482 - var10;
                                var34.field3438 = class90.field1504 - var11;
                                var34.field3423 = var9.field3572;
                                class55.field924.method1709(22, var34);
                            }
                            if (var9.field3699 && !var20) {
                                var9.field3699 = false;
                                if (var9.field3551 != null) {
                                    class205 var35 = new class205();
                                    var35.field3435 = true;
                                    var35.field3433 = var9;
                                    var35.field3434 = class89.field1482 - var10;
                                    var35.field3438 = class90.field1504 - var11;
                                    var35.field3423 = var9.field3551;
                                    class86.field1442.method1709(-115, var35);
                                }
                            }
                            if (var20 && var9.field3639 != null) {
                                class205 var36 = new class205();
                                var36.field3435 = true;
                                var36.field3433 = var9;
                                var36.field3434 = class89.field1482 - var10;
                                var36.field3438 = class90.field1504 - var11;
                                var36.field3423 = var9.field3639;
                                class55.field924.method1709(-114, var36);
                            }
                            if (!var9.field3581 && var19) {
                                var9.field3581 = true;
                                if (var9.field3645 != null) {
                                    class205 var37 = new class205();
                                    var37.field3435 = true;
                                    var37.field3433 = var9;
                                    var37.field3434 = class89.field1482 - var10;
                                    var37.field3438 = class90.field1504 - var11;
                                    var37.field3423 = var9.field3645;
                                    class55.field924.method1709(70, var37);
                                }
                            }
                            if (var9.field3581 && var19 && var9.field3622 != null) {
                                class205 var38 = new class205();
                                var38.field3435 = true;
                                var38.field3433 = var9;
                                var38.field3434 = class89.field1482 - var10;
                                var38.field3438 = class90.field1504 - var11;
                                var38.field3423 = var9.field3622;
                                class55.field924.method1709(-126, var38);
                            }
                            if (var9.field3581 && !var19) {
                                var9.field3581 = false;
                                if (var9.field3570 != null) {
                                    class205 var39 = new class205();
                                    var39.field3435 = true;
                                    var39.field3433 = var9;
                                    var39.field3434 = class89.field1482 - var10;
                                    var39.field3438 = class90.field1504 - var11;
                                    var39.field3423 = var9.field3570;
                                    class86.field1442.method1709(2, var39);
                                }
                            }
                            if (var9.field3691 != null) {
                                class205 var40 = new class205();
                                var40.field3433 = var9;
                                var40.field3423 = var9.field3691;
                                class63.field1027.method1709(100, var40);
                            }
                            if (var9.field3548 != null && class19.field268 > var9.field3675) {
                                if (var9.field3672 == null || class19.field268 - var9.field3675 > 32) {
                                    class205 var45 = new class205();
                                    var45.field3433 = var9;
                                    var45.field3423 = var9.field3548;
                                    class55.field924.method1709(23, var45);
                                } else {
                                    label550: for (int var41 = var9.field3675; var41 < class19.field268; var41++) {
                                        int var42 = class14.field214[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field3672.length; var43++) {
                                            if (var9.field3672[var43] == var42) {
                                                class205 var44 = new class205();
                                                var44.field3433 = var9;
                                                var44.field3423 = var9.field3548;
                                                class55.field924.method1709(-101, var44);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field3675 = class19.field268;
                            }
                            if (var9.field3664 != null && class175.field2874 > var9.field3597) {
                                if (var9.field3647 == null || class175.field2874 - var9.field3597 > 32) {
                                    class205 var50 = new class205();
                                    var50.field3433 = var9;
                                    var50.field3423 = var9.field3664;
                                    class55.field924.method1709(-8, var50);
                                } else {
                                    label526: for (int var46 = var9.field3597; var46 < class175.field2874; var46++) {
                                        int var47 = class214.field3714[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field3647.length; var48++) {
                                            if (var9.field3647[var48] == var47) {
                                                class205 var49 = new class205();
                                                var49.field3433 = var9;
                                                var49.field3423 = var9.field3664;
                                                class55.field924.method1709(25, var49);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field3597 = class175.field2874;
                            }
                            if (var9.field3702 != null && class247.field4322 > var9.field3665) {
                                if (var9.field3662 == null || class247.field4322 - var9.field3665 > 32) {
                                    class205 var55 = new class205();
                                    var55.field3433 = var9;
                                    var55.field3423 = var9.field3702;
                                    class55.field924.method1709(-91, var55);
                                } else {
                                    label502: for (int var51 = var9.field3665; var51 < class247.field4322; var51++) {
                                        int var52 = class210.field3501[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field3662.length; var53++) {
                                            if (var9.field3662[var53] == var52) {
                                                class205 var54 = new class205();
                                                var54.field3433 = var9;
                                                var54.field3423 = var9.field3702;
                                                class55.field924.method1709(-107, var54);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field3665 = class247.field4322;
                            }
                            if (var9.field3604 != null && class103.field1700 > var9.field3558) {
                                if (var9.field3557 == null || class103.field1700 - var9.field3558 > 32) {
                                    class205 var60 = new class205();
                                    var60.field3433 = var9;
                                    var60.field3423 = var9.field3604;
                                    class55.field924.method1709(-124, var60);
                                } else {
                                    label478: for (int var56 = var9.field3558; var56 < class103.field1700; var56++) {
                                        int var57 = class215.field3726[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field3557.length; var58++) {
                                            if (var9.field3557[var58] == var57) {
                                                class205 var59 = new class205();
                                                var59.field3433 = var9;
                                                var59.field3423 = var9.field3604;
                                                class55.field924.method1709(13, var59);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field3558 = class103.field1700;
                            }
                            if (var9.field3617 != null && class219.field3820 > var9.field3614) {
                                if (var9.field3624 == null || class219.field3820 - var9.field3614 > 32) {
                                    class205 var65 = new class205();
                                    var65.field3433 = var9;
                                    var65.field3423 = var9.field3617;
                                    class55.field924.method1709(44, var65);
                                } else {
                                    label454: for (int var61 = var9.field3614; var61 < class219.field3820; var61++) {
                                        int var62 = class92.field1530[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field3624.length; var63++) {
                                            if (var9.field3624[var63] == var62) {
                                                class205 var64 = new class205();
                                                var64.field3433 = var9;
                                                var64.field3423 = var9.field3617;
                                                class55.field924.method1709(-1, var64);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field3614 = class219.field3820;
                            }
                            if (class1.field5 > var9.field3563 && var9.field3561 != null) {
                                class205 var66 = new class205();
                                var66.field3433 = var9;
                                var66.field3423 = var9.field3561;
                                class55.field924.method1709(105, var66);
                            }
                            if (class204.field3418 > var9.field3563 && var9.field3693 != null) {
                                class205 var67 = new class205();
                                var67.field3433 = var9;
                                var67.field3423 = var9.field3693;
                                class55.field924.method1709(-128, var67);
                            }
                            if (class183.field3015 > var9.field3563 && var9.field3565 != null) {
                                class205 var68 = new class205();
                                var68.field3433 = var9;
                                var68.field3423 = var9.field3565;
                                class55.field924.method1709(-90, var68);
                            }
                            if (class10.field111 > var9.field3563 && var9.field3579 != null) {
                                class205 var69 = new class205();
                                var69.field3433 = var9;
                                var69.field3423 = var9.field3579;
                                class55.field924.method1709(64, var69);
                            }
                            if (class95.field1571 > var9.field3563 && var9.field3544 != null) {
                                class205 var70 = new class205();
                                var70.field3433 = var9;
                                var70.field3423 = var9.field3544;
                                class55.field924.method1709(67, var70);
                            }
                            var9.field3563 = class189.field3173;
                            if (var9.field3545 != null) {
                                for (int var71 = 0; var71 < class32.field463; var71++) {
                                    class205 var72 = new class205();
                                    var72.field3433 = var9;
                                    var72.field3425 = class114.field1946[var71];
                                    var72.field3430 = class111.field1911[var71];
                                    var72.field3423 = var9.field3545;
                                    class55.field924.method1709(-4, var72);
                                }
                            }
                            if (class192.field3213 && var9.field3685 != null) {
                                class205 var73 = new class205();
                                var73.field3433 = var9;
                                var73.field3423 = var9.field3685;
                                class55.field924.method1709(-84, var73);
                            }
                        }
                    }
                    if (!var9.field3574 && class136.field2257 == null && class78.field1246 == null && !class90.field1498) {
                        if ((var9.field3609 >= 0 || var9.field3654 != 0) && class89.field1482 >= var12 && class90.field1504 >= var13 && class89.field1482 < var14 && class90.field1504 < var15) {
                            if (var9.field3609 >= 0) {
                                class29.field416 = arg0[var9.field3609];
                            } else {
                                class29.field416 = var9;
                            }
                        }
                        if (var9.field3623 == 8 && class89.field1482 >= var12 && class90.field1504 >= var13 && class89.field1482 < var14 && class90.field1504 < var15) {
                            class225.field3965 = var9;
                        }
                        if (var9.field3546 > var9.field3608) {
                            class161.method1141(var9, var9.field3608, class90.field1504, var9.field3546, (byte) -10, var11, class89.field1482, var9.field3603 + var10);
                        }
                    }
                    if (var9.field3623 == 0) {
                        method1051(arg0, var9.field3703, var12, var13, var14, var15, var10 - var9.field3648, var11 - var9.field3593);
                        if (var9.field3556 != null) {
                            method1051(var9.field3556, var9.field3703, var12, var13, var14, var15, var10 - var9.field3648, var11 - var9.field3593);
                        }
                        class42 var74 = (class42) class79.field1265.method1453((long) var9.field3703, 1);
                        if (var74 != null) {
                            class147.method1065(var74.field668, var13, var11, var12, false, var10, var15, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwc;)Z")
    public static final boolean method1052(class213 arg0) {
        if (class79.field1263) {
            if (method1061(arg0) != 0) {
                return false;
            }
            if (arg0.field3623 == 0) {
                return false;
            }
        }
        return arg0.field3700;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2454++;
        if (!this.method1633(101)) {
            return;
        }
        class259.field4521 = Integer.parseInt(this.getParameter("worldid"));
        class238.field4141 = Integer.parseInt(this.getParameter("modewhat"));
        class239.field4155 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class149.field2503 = true;
        } else {
            class149.field2503 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class44.field703 = true;
        } else {
            class44.field703 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class132.method970((byte) 127);
            class196.field3290 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class86.field1440 = 1;
        } else {
            class86.field1440 = 0;
        }
        try {
            class234.field4088 = Integer.parseInt(this.getParameter("js"));
            class100.field1661 = Integer.parseInt(this.getParameter("plug"));
            class5.field40 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var10) {
        }
        class35.field528 = class218.field3786.method308(25787, this);
        if (class35.field528 == null) {
            class35.field528 = class43.field696;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class51 var7 = class101.method741(var6.length, 0, true, var6);
            boolean var8 = class22.method110((byte) -100, var7);
            if (var8) {
                class195.field3269 = var7;
            }
        }
        class238.field4142 = this.getCodeBase().getHost();
        this.method1628(class238.field4141 + 32, 509, 765, (byte) 65, 503);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method1053(int arg0) {
        field2450 = null;
        field2447 = null;
        if (arg0 != -7909) {
            field2447 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1054(byte arg0) {
        field2455++;
        if (class195.field3249 == 1000 || arg0 != 7) {
            return;
        }
        boolean var2 = false;
        boolean var3 = class13.method75(true);
        if (var3 && class236.field4117 && class198.field3300 != null) {
            class198.field3300.method1217(111);
        }
        if (class195.field3249 == 30 || class195.field3249 == 10) {
            if (class6.field65) {
                class40.method204(arg0 - 7);
            } else if (class13.field197 != 0L && class13.field197 < class7.method31((byte) -88)) {
                class40.method204(arg0 - 7);
            }
        }
        if (class3.field22 != 0L && class3.field22 < class7.method31((byte) -88) && class204.field3415 != null && (class195.field3249 == 30 || class195.field3249 == 25)) {
            class185.method1309(-118);
        }
        if (class119.field1990) {
            class119.field1990 = false;
            var2 = true;
        }
        if (var2) {
            class237.method1639((byte) -118);
        }
        if (class195.field3249 == 0) {
            class105.method752((byte) 27, var2, class162.field2652, (Color) null, class198.field3298);
        } else if (class195.field3249 == 5) {
            class237.method1643((byte) 20, class239.field4161);
        } else if (class195.field3249 == 10) {
            class82.method638((byte) 2);
        } else if (class195.field3249 == 25 || class195.field3249 == 28) {
            if (class142.field2377 == 1) {
                if (class75.field1198 > class3.field24) {
                    class3.field24 = class75.field1198;
                }
                int var5 = (class3.field24 - class75.field1198) * 50 / class3.field24;
                class164.method1155(class20.method104(50, new class51[] { class156.field2569, class44.field707, class51.method311(var5, 10), class159.field2614 }), false, arg0 ^ 0x1);
            } else if (class142.field2377 == 2) {
                if (class47.field754 < class185.field3056) {
                    class47.field754 = class185.field3056;
                }
                int var4 = (class47.field754 - class185.field3056) * 50 / class47.field754 + 50;
                class164.method1155(class20.method104(-10, new class51[] { class156.field2569, class44.field707, class51.method311(var4, 10), class159.field2614 }), false, 6);
            } else {
                class164.method1155(class156.field2569, false, arg0 ^ 0x1);
            }
        } else if (class195.field3249 == 30) {
            class176.method1235(1005);
        } else if (class195.field3249 == 40) {
            class164.method1155(class20.method104(53, new class51[] { class161.field2638, class33.field490, class5.field49 }), false, 6);
        }
        if ((class195.field3249 == 30 || class195.field3249 == 10) && class90.field1487 == 0 && !var2) {
            try {
                Graphics var6 = class31.field452.getGraphics();
                for (int var7 = 0; var7 < class167.field2713; var7++) {
                    if (class42.field681[var7]) {
                        class192.field3209.method121(class237.field4124[var7], class41.field663[var7], class87.field1460[var7], class62.field1014[var7], (byte) 107, var6);
                        class42.field681[var7] = false;
                    }
                }
            } catch (Exception var14) {
                class31.field452.repaint();
            }
        } else if (class195.field3249 != 0) {
            try {
                Graphics var8 = class31.field452.getGraphics();
                class192.field3209.method122(true, var8, 0, 0);
                for (int var9 = 0; var9 < class167.field2713; var9++) {
                    class42.field681[var9] = false;
                }
            } catch (Exception var13) {
                class31.field452.repaint();
            }
        }
        if (class82.field1366) {
            class198.method1396(true);
        }
        if (!browsercontrol.iscreated() || class205.field3426 == 0) {
            return;
        }
        try {
            Point var10 = class31.field452.getLocationOnScreen();
            Dimension var11 = class31.field452.getSize();
            browsercontrol.set_position(var10.x, var10.y - class205.field3426, var11.width, class205.field3426);
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1055(boolean arg0) {
        field2446++;
        class132.method973(class149.field2503, 0, class25.field376);
        class66.field1068 = class43.field692 = class38.field596 = class51.field819 = new short[256];
        class76.field1232 = class239.field4155 == 0 ? 443 : class259.field4521 + 50000;
        if (class86.field1440 == 1) {
            class205.field3428 = class164.field2686;
            class3.field26 = class233.field4065;
            class154.field2563 = class252.field4439;
            class203.field3399 = class130.field2183;
        } else {
            class3.field26 = class87.field1446;
            class154.field2563 = class80.field1321;
            class205.field3428 = class75.field1200;
            class203.field3399 = class257.field4500;
        }
        if (!arg0) {
            return;
        }
        class138.field2320 = class239.field4155 == 0 ? 43594 : class259.field4521 + 40000;
        class133.field2221 = class138.field2320;
        class49.method251(44);
        class188.method1342((byte) 50, class31.field452);
        class246.method1676(94, class31.field452);
        class130.field2182 = class190.method1363((byte) 124);
        if (class130.field2182 != null) {
            class130.field2182.method1223((byte) -122, class31.field452);
        }
        class228.field3978 = class229.field3998;
        try {
            if (class25.field376.field3995 != null) {
                class87.field1461 = new class262(class25.field376.field3995, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class202.field3392[var2] = new class262(class25.field376.field3988[var2], 6000, 0);
                }
                class259.field4526 = new class262(class25.field376.field3989, 6000, 0);
                field2447 = new class188(255, class87.field1461, class259.field4526, 500000);
                class244.field4225 = new class262(class25.field376.field4001, 24, 0);
                class25.field376.field3988 = null;
                class25.field376.field3995 = null;
                class25.field376.field4001 = null;
                class25.field376.field3989 = null;
            }
        } catch (IOException var3) {
            class244.field4225 = null;
            class259.field4526 = null;
            class87.field1461 = null;
            field2447 = null;
        }
        class74.field1177 = class55.field936;
        if (class239.field4155 != 0) {
            class172.field2812 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1056(int arg0) {
        field2442++;
        if (arg0 != 80) {
            this.init();
        }
        boolean var2 = class133.method975(arg0 ^ 0xFFFFEB68);
        if (!var2) {
            this.method1050(-74);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1057(int arg0) {
        int var2 = 63 / ((65 - arg0) / 50);
        method1053(-7909);
        class51.method288((byte) -113);
        field2448++;
        class236.method1635((byte) -71);
        class5.method20(false);
        class139.method1011(-90);
        class234.method1634(0);
        class143.method1034(3);
        class23.method128((byte) 46);
        class182.method1292(50);
        class157.method1120(-26823);
        class121.method898((byte) -78);
        class114.method836(true);
        class55.method354((byte) 97);
        class262.method1780(255);
        class188.method1346((byte) 87);
        class189.method1349((byte) -67);
        class83.method648((byte) -93);
        class64.method432(true);
        class252.method1718(-1);
        class170.method1186(-6870);
        class213.method1455((byte) 90);
        class103.method745(2);
        class212.method1452((byte) -128);
        class239.method1647((byte) 55);
        class87.method662(false);
        class171.method1199(99999);
        class80.method580((byte) 50);
        class173.method1214(107);
        class221.method1515(true);
        class142.method1027(false);
        class151.method1091(124);
        class247.method1689(1);
        class97.method719(14789);
        class36.method185(-14989);
        class42.method218(2);
        class107.method767(77);
        class60.method399(-1);
        class75.method541(false);
        class258.method1750((byte) 24);
        class17.method84((byte) 82);
        class119.method861(true);
        class177.method1241(-127);
        class240.method1653(false);
        class145.method1041(5);
        class3.method7(1);
        class108.method778(1);
        class118.method855((byte) -123);
        class135.method985(false);
        class111.method823(-14035);
        class178.method1262();
        class183.method1294((byte) 109);
        class222.method1528(-124);
        class137.method997();
        class29.method148(-27734);
        class244.method1667((byte) -111);
        class7.method35((byte) 126);
        class4.method15((byte) -124);
        class179.method1276(0);
        class260.method1770(29687);
        class39.method194(7759);
        class44.method224(78);
        class190.method1358(17514);
        class156.method1113(75);
        class187.method1318();
        class78.method553(4);
        class33.method165(2);
        class245.method1669(14856);
        class49.method263(-94);
        class241.method1655(32484);
        class195.method1379((byte) 74);
        class162.method1145(-25503);
        class105.method753(-120);
        class98.method725((byte) -43);
        class199.method1397();
        class25.method136(0);
        class217.method1493(40);
        class66.method468(-75);
        class73.method514();
        class59.method394();
        class41.method209(false);
        class130.method957((byte) -100);
        class89.method676((byte) -55);
        class116.method849(94);
        class180.method1279((byte) 11);
        class164.method1156((byte) 127);
        class91.method689();
        class219.method1511(0);
        class243.method1663(0);
        class228.method1566(-1);
        class198.method1394(5);
        class232.method1600();
        class163.method1152((byte) -115);
        class101.method740(false);
        class223.method1542(-801);
        class67.method471((byte) 11);
        class95.method710(8652);
        class249.method1695((byte) 120);
        class140.method1018(0);
        class35.method178((byte) 107);
        class106.method760((byte) 15);
        class6.method28(115);
        class131.method961(false);
        class82.method641((byte) 111);
        class231.method1596((byte) 122);
        class166.method1158(125);
        class216.method1482((byte) -11);
        class52.method323((byte) 32);
        class259.method1767(-116);
        class115.method845(true);
        class100.method732(24396);
        class208.method1431(-5954);
        class92.method694(97);
        class62.method411(-15490);
        class31.method160(0);
        class159.method1130((byte) 36);
        class205.method1414(109);
        class1.method1((byte) 80);
        class45.method229(false);
        class10.method49(false);
        class84.method651(-1);
        class167.method1165(1);
        class136.method989(4);
        class93.method703((byte) -28);
        class37.method187((byte) 120);
        class50.method264((byte) 90);
        class61.method409();
        class132.method968(false);
        class43.method222(14064);
        class263.method1788((byte) 116);
        class185.method1310(-1);
        class255.method1740(-19395);
        class184.method1305(-71);
        class22.method111(-50);
        class138.method1006(25795);
        class120.method862(true);
        class181.method1284(8);
        class144.method1037(-128);
        class122.method923(-114);
        class2.method5((byte) 6);
        class192.method1370((byte) 89);
        class246.method1677((byte) -76);
        class207.method1427(1);
        class26.method140(119);
        class74.method529(-111);
        class154.method1108(3);
        class125.method932(61);
        class176.method1236(true);
        class153.method1104(-127);
        class251.method1707();
        class56.method363();
        class15.method80();
        class226.method1560();
        class257.method1747(124);
        class204.method1412((byte) 125);
        class124.method931(106);
        class250.method1702();
        class206.method1423();
        class40.method205((byte) 98);
        class196.method1386(-113);
        class230.method1587(549421484);
        class77.method550(-1);
        class72.method505(-125);
        class225.method1545(0);
        class215.method1480(32);
        class63.method419(false);
        class175.method1228(true);
        class191.method1365((byte) 26);
        class109.method796(-83);
        class169.method1171(5);
        class193.method1375((byte) 79);
        class28.method144(0);
        class57.method367(2047);
        class202.method1404((byte) 88);
        class233.method1616(-92);
        class9.method47(1);
        class261.method1773(4096);
        class134.method983(0);
        class34.method168((byte) -45);
        class53.method340(true);
        class128.method949((byte) -53);
        class38.method191((byte) -118);
        class69.method479((byte) 25);
        class47.method241((byte) -122);
        class14.method79(-513);
        class201.method1402(0);
        class218.method1502(100);
        class99.method727(true);
        class12.method70(0);
        class32.method161(-90);
        class27.method142((byte) -76);
        class211.method1442(-1);
        class214.method1473(2047);
        class79.method556((byte) 33);
        class265.method1797(false);
        class161.method1143(0);
        class85.method657(true);
        class16.method83(-66);
        class264.method1790(true);
        class168.method1169(-28153);
        class123.method924(0);
        class160.method1139((byte) 118);
        class147.method1071(255);
        class141.method1020(true);
        class129.method952((byte) 119);
        class237.method1641(18175);
        class203.method1411(32172);
        class242.method1661(-12197);
        class210.method1439((byte) -56);
        class90.method679(-124);
        class48.method246((byte) 53);
        class70.method484(false);
        class86.method661(-25180);
        class209.method1437(88);
        class13.method74(0);
        class76.method544(true);
        class149.method1077((byte) -86);
        class8.method36((byte) 44);
        class172.method1205(-23274);
        class24.method130(true);
        class248.method1691((byte) -107);
        class146.method1042(false);
        class30.method150(116);
        class96.method716(-1869054132);
        class238.method1644(-8701);
        if (class234.field4113) {
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1058(int arg0) {
        class46.method236((byte) -74, this);
        field2456++;
        for (class32.field463 = 0; class228.method1567((byte) -122) && class32.field463 < 128; class32.field463++) {
            class114.field1946[class32.field463] = class42.field686;
            class111.field1911[class32.field463] = class128.field2148;
        }
        class225.field3945++;
        if (~class243.field4206 != arg0) {
            class147.method1065(class243.field4206, 0, 0, 0, false, 0, class76.field1230, class95.field1578);
        }
        class189.field3173++;
        class173.method1216((byte) 70);
        while (true) {
            class205 var2;
            class213 var3;
            class213 var4;
            do {
                var2 = (class205) class63.field1027.method1714(58);
                if (var2 == null) {
                    while (true) {
                        class205 var5;
                        class213 var6;
                        class213 var7;
                        do {
                            var5 = (class205) class86.field1442.method1714(58);
                            if (var5 == null) {
                                while (true) {
                                    class205 var8;
                                    class213 var9;
                                    class213 var10;
                                    do {
                                        var8 = (class205) class55.field924.method1714(58);
                                        if (var8 == null) {
                                            if (class136.field2257 != null) {
                                                class222.method1536(117);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field3433;
                                        if (var9.field3568 < 0) {
                                            break;
                                        }
                                        var10 = class198.method1392(arg0 + 11823, var9.field3689);
                                    } while (var10 == null || var10.field3556 == null || var9.field3568 >= var10.field3556.length || var10.field3556[var9.field3568] != var9);
                                    class176.method1233(var8, (byte) 80);
                                }
                            }
                            var6 = var5.field3433;
                            if (var6.field3568 < 0) {
                                break;
                            }
                            var7 = class198.method1392(11823, var6.field3689);
                        } while (var7 == null || var7.field3556 == null || var6.field3568 >= var7.field3556.length || var7.field3556[var6.field3568] != var6);
                        class176.method1233(var5, (byte) 74);
                    }
                }
                var3 = var2.field3433;
                if (var3.field3568 < 0) {
                    break;
                }
                var4 = class198.method1392(11823, var3.field3689);
            } while (var4 == null || var4.field3556 == null || var4.field3556.length <= var3.field3568 || var4.field3556[var3.field3568] != var3);
            class176.method1233(var2, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1059(int arg0) {
        field2458++;
        if (class195.field3249 == 1000) {
            return;
        }
        if (arg0 != 81) {
            field2453 = -39L;
        }
        class179.field2960++;
        if (class179.field2960 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class191.field3202 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class147.field2466.setSeed((long) class191.field3202);
        }
        this.method1056(80);
        class159.method1131((byte) 75);
        class212.method1454(-1);
        class190.method1361(205);
        class62.method413(-90);
        class201.method1401(1);
        if (class130.field2182 != null) {
            int var3 = class130.field2182.method1226(0);
            class43.field689 = var3;
        }
        if (class195.field3249 == 0) {
            this.method1048(128);
            class14.method76((byte) -36);
        } else if (class195.field3249 == 5) {
            this.method1048(128);
            class14.method76((byte) -36);
        } else if (class195.field3249 == 25 || class195.field3249 == 28) {
            class66.method457(arg0 - 160);
        }
        if (class195.field3249 == 10) {
            this.method1058(0);
            class220.method1512((byte) 106);
            class136.method986((byte) -106);
        } else if (class195.field3249 == 30) {
            class145.method1039(0);
            return;
        } else if (class195.field3249 == 40) {
            class136.method986((byte) -127);
            if (class63.field1033 != -3) {
                if (class63.field1033 == 15) {
                    class181.method1285(52);
                    return;
                }
                if (class63.field1033 != 2) {
                    class12.method71(302);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwc;)Lwc;")
    public static final class213 method1060(class213 arg0) {
        int var1 = class3.method8(method1061(arg0), false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class198.method1392(11823, arg0.field3689);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwc;)I")
    public static final int method1061(class213 arg0) {
        class255 var1 = (class255) class242.field4190.method1453(((long) arg0.field3703 << 32) + (long) arg0.field3568, 1);
        return var1 == null ? arg0.field3576 : var1.field4454;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Llf;")
    public static final class195 method1062(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1616;
    }
}
