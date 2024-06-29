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
public class client extends class172 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[B")
    public static byte[] field1968 = new byte[32896];

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Ljava/lang/String;")
    public static String field1982;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[[I")
    public static int[][] field1983;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmh;)Z")
    public static final boolean method901(class263 arg0) {
        if (class270.field4368) {
            if (method903(arg0).field3789 != 0) {
                return false;
            }
            if (arg0.field4129 == 0) {
                return false;
            }
        }
        return arg0.field4178;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method902(byte arg0) {
        field1980++;
        if (class84.field1330 != null) {
            class84.field1330.field1225 = false;
        }
        if (arg0 > -98) {
            field1982 = null;
        }
        class84.field1330 = null;
        if (class281.field4537 != null) {
            class281.field4537.method1440(-1);
            class281.field4537 = null;
        }
        class193.method1370(class12.field136, -21532);
        class171.method1215(true, class12.field136);
        if (class82.field1324 != null) {
            class82.field1324.method115(class12.field136, (byte) 54);
        }
        class263.method1816((byte) 125);
        class196.method1385(-56);
        class82.field1324 = null;
        if (class16.field170 != null) {
            class16.field170.method2006(2);
        }
        if (class113.field1879 != null) {
            class113.field1879.method2006(2);
        }
        class188.field2802.method1836((byte) 82);
        class169.field2569.method1424(0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lmh;)Lgl;")
    public static final class250 method903(class263 arg0) {
        class250 var1 = (class250) class255.field3846.method1073(-1, ((long) arg0.field4083 << 32) + (long) arg0.field4145);
        return var1 == null ? arg0.field4045 : var1;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static void method904(int arg0) {
        field1982 = null;
        if (arg0 != 0) {
            field1982 = null;
        }
        field1983 = null;
        field1968 = null;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method905(int arg0) {
        field1979++;
        if (!class69.field1110) {
            label241: while (true) {
                do {
                    if (!class304.method2067(-1456)) {
                        break label241;
                    }
                } while (class77.field1219 != 's' && class77.field1219 != 'S');
                class69.field1110 = true;
            }
        }
        if (class44.field580 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class3.method14(29853);
            if (class62.field944 == 0L) {
                class62.field944 = var4;
            }
            if (var3 > 16384 && var4 - class62.field944 < 5000L) {
                if (var4 - class312.field5000 > 1000L) {
                    System.gc();
                    class312.field5000 = var4;
                }
                class194.field2863 = 5;
                class232.field3412 = class140.field2273;
            } else {
                class232.field3412 = class240.field3522;
                class194.field2863 = 5;
                class44.field580 = 10;
            }
        } else if (class44.field580 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class235.field3431[var6] = new class228(104, 104);
            }
            class44.field580 = 30;
            class232.field3412 = class13.field152;
            class194.field2863 = 10;
        } else if (class44.field580 == 30) {
            if (class304.field4927 == null) {
                class304.field4927 = new class21(class188.field2802, class169.field2569);
            }
            if (class304.field4927.method150(true)) {
                class142.field2282 = class20.method137(true, 1000000, false, 0, true);
                class78.field1266 = class20.method137(true, arg0 + 999970, false, 1, true);
                class49.field675 = class20.method137(true, arg0 ^ 0xF425E, true, 2, false);
                class282.field4546 = class20.method137(true, arg0 + 999970, false, 3, true);
                class222.field3255 = class20.method137(true, arg0 + 999970, false, 4, true);
                class296.field4754 = class20.method137(true, 1000000, true, 5, true);
                class300.field4850 = class20.method137(false, arg0 + 999970, true, 6, true);
                class193.field2855 = class20.method137(true, arg0 ^ 0xF425E, false, 7, true);
                class191.field2827 = class20.method137(true, 1000000, false, 8, true);
                class267.field4278 = class20.method137(true, arg0 ^ 0xF425E, false, 9, true);
                class269.field4327 = class20.method137(true, 1000000, false, 10, true);
                class297.field4773 = class20.method137(true, 1000000, false, 11, true);
                class20.field211 = class20.method137(true, 1000000, false, 12, true);
                class313.field5017 = class20.method137(true, 1000000, false, 13, true);
                class228.field3344 = class20.method137(false, 1000000, false, 14, true);
                class201.field2957 = class20.method137(true, arg0 ^ 0xF425E, false, 15, true);
                class242.field3566 = class20.method137(true, 1000000, false, 16, true);
                class121.field2010 = class20.method137(true, arg0 ^ 0xF425E, false, 17, true);
                class268.field4314 = class20.method137(true, 1000000, false, 18, true);
                class309.field4980 = class20.method137(true, 1000000, false, 19, true);
                class37.field472 = class20.method137(true, 1000000, false, 20, true);
                class240.field3515 = class20.method137(true, arg0 ^ 0xF425E, false, 21, true);
                class208.field3082 = class20.method137(true, 1000000, false, 22, true);
                class147.field2361 = class20.method137(true, 1000000, true, 23, true);
                class312.field5001 = class20.method137(true, 1000000, false, 24, true);
                class236.field3450 = class20.method137(true, arg0 + 999970, false, 25, true);
                class37.field483 = class20.method137(true, 1000000, true, 26, true);
                class243.field3578 = class20.method137(true, 1000000, false, 27, true);
                class112.field1864 = class20.method137(true, arg0 ^ 0xF425E, true, 28, true);
                class232.field3412 = class270.field4357;
                class194.field2863 = 15;
                class44.field580 = 40;
            } else {
                class194.field2863 = 12;
                class232.field3412 = class231.field3386;
            }
        } else if (class44.field580 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class228.field3355[var8].method2044(true) * class172.field2631[var8] / 100;
            }
            if (var7 == 100) {
                class232.field3412 = class81.field1289;
                class194.field2863 = 20;
                class299.method2043(class191.field2827, (byte) -99);
                class212.method1489((byte) -127, class191.field2827);
                class227.method1574(24113, class191.field2827);
                class44.field580 = 41;
            } else {
                class194.field2863 = 20;
                if (var7 != 0) {
                    class232.field3412 = class292.field4641 + var7 + "%";
                }
            }
        } else if (class44.field580 == 41) {
            if (class112.field1864.method1894(0)) {
                this.method911(class112.field1864.method1886(1, false), arg0 ^ 0x2E);
                class194.field2863 = 25;
                class44.field580 = 45;
                class232.field3412 = class159.field2471;
            } else {
                class232.field3412 = class7.field66 + class112.field1864.method1882(48) + "%";
                class194.field2863 = 25;
            }
        } else if (class44.field580 == 45) {
            method912(2, 0, 22050, class281.field4536);
            class272.field4400 = new class59();
            class272.field4400.method468(128, (byte) 2, 9);
            class16.field170 = class121.method922(0, arg0 ^ 0x1E, 22050, class273.field4426, class12.field136);
            class16.field170.method2012(arg0 ^ 0xFFFFE4BA, class272.field4400);
            class49.method298(-12517, class201.field2957, class222.field3255, class272.field4400, class228.field3344);
            class113.field1879 = class121.method922(1, arg0 ^ 0x1E, 2048, class273.field4426, class12.field136);
            class241.field3543 = new class175();
            class113.field1879.method2012(-7004, class241.field3543);
            class264.field4236 = new class300(22050, class91.field1459);
            class22.field242 = class300.field4850.method1884("scape main", (byte) -115);
            class232.field3412 = class303.field4911;
            class44.field580 = 50;
            class194.field2863 = 30;
        } else {
            if (arg0 != 30) {
                method903((class263) null);
            }
            if (class44.field580 == 50) {
                int var9 = class182.method1283(class191.field2827, class313.field5017, -26313);
                int var10 = class165.method1186(arg0 ^ 0x71);
                if (var9 < var10) {
                    class194.field2863 = 35;
                    class232.field3412 = class231.field3390 + var9 * 100 / var10 + "%";
                } else {
                    class232.field3412 = class241.field3539;
                    class194.field2863 = 35;
                    class44.field580 = 60;
                }
            } else if (class44.field580 == 60) {
                int var11 = class256.method1757(-10381, class191.field2827);
                int var12 = class129.method978((byte) -45);
                if (var12 > var11) {
                    class232.field3412 = class200.field2942 + var11 * 100 / var12 + "%";
                    class194.field2863 = 40;
                } else {
                    class44.field580 = 65;
                    class194.field2863 = 40;
                    class232.field3412 = class259.field4011;
                }
            } else if (class44.field580 == 65) {
                class49.method300(class191.field2827, class313.field5017, -17681);
                class232.field3412 = class281.field4539;
                class194.field2863 = 45;
                class79.method586(-1, 5);
                class44.field580 = 70;
            } else if (class44.field580 == 70) {
                class49.field675.method1894(0);
                byte var13 = 0;
                int var14 = var13 + class49.field675.method1882(arg0 ^ 0x6B);
                class242.field3566.method1894(0);
                int var15 = var14 + class242.field3566.method1882(arg0 + 57);
                class121.field2010.method1894(0);
                int var16 = var15 + class121.field2010.method1882(45);
                class268.field4314.method1894(0);
                int var17 = var16 + class268.field4314.method1882(92);
                class309.field4980.method1894(0);
                int var18 = var17 + class309.field4980.method1882(arg0 ^ 0x48);
                class37.field472.method1894(0);
                int var19 = var18 + class37.field472.method1882(68);
                class240.field3515.method1894(0);
                int var20 = var19 + class240.field3515.method1882(arg0 ^ 0x73);
                class208.field3082.method1894(0);
                int var21 = var20 + class208.field3082.method1882(arg0 + 33);
                class312.field5001.method1894(0);
                int var22 = var21 + class312.field5001.method1882(82);
                class236.field3450.method1894(arg0 ^ 0x1E);
                int var23 = var22 + class236.field3450.method1882(57);
                class243.field3578.method1894(0);
                int var24 = var23 + class243.field3578.method1882(107);
                if (var24 < 1100) {
                    class232.field3412 = class66.field989 + var24 / 11 + "%";
                    class194.field2863 = 50;
                } else {
                    class136.method1024(class49.field675, 80);
                    class100.method783(class49.field675, -15);
                    class156.method1142(class49.field675, 100);
                    class290.method1976(class193.field2855, arg0 - 87, class49.field675);
                    class144.method1080(class242.field3566, (byte) 74, class193.field2855, true);
                    class21.method152(class268.field4314, class193.field2855, true, (byte) 45);
                    class284.method1957(class193.field2855, class309.field4980, 256, class284.field4569, true);
                    class155.method1128(1, class49.field675);
                    class289.method1973(class142.field2282, class78.field1266, (byte) 101, class37.field472);
                    class17.method120(class49.field675, (byte) -67);
                    class65.method489(23494, class193.field2855, class240.field3515);
                    class23.method160(arg0 ^ 0x1E, class208.field3082);
                    class24.method163(false, class49.field675);
                    class253.method1742(class193.field2855, class282.field4546, (byte) 102, class313.field5017, class191.field2827);
                    class92.method692((byte) -122, class49.field675);
                    class237.method1633(4111, class121.field2010);
                    class211.method1485(new class183(), (byte) 122, class236.field3450, class312.field5001);
                    class252.method1738(class236.field3450, (byte) -88, class312.field5001);
                    class294.method2000(arg0 ^ 0xFFFFFFE1, class49.field675);
                    class267.method1842(class49.field675, 59);
                    class195.method1383(1762, class49.field675);
                    class155.method1129(class191.field2827, class49.field675, -20742);
                    class38.method238(0, class49.field675, class191.field2827);
                    class192.method1365(class49.field675, class191.field2827, arg0 ^ 0x28);
                    class194.field2863 = 50;
                    class232.field3412 = class160.field2490;
                    class296.method2017(-32092);
                    class44.field580 = 80;
                }
            } else if (class44.field580 == 80) {
                int var25 = class286.method1960(arg0 ^ 0x66, class191.field2827);
                int var26 = class26.method172(true);
                if (var25 < var26) {
                    class194.field2863 = 60;
                    class232.field3412 = class220.field3212 + var25 * 100 / var26 + "%";
                } else {
                    class261.method1790(class191.field2827, 118);
                    class44.field580 = 90;
                    class232.field3412 = class218.field3191;
                    class194.field2863 = 60;
                }
            } else if (class44.field580 == 90) {
                if (class37.field483.method1894(0)) {
                    class274 var27 = new class274(class267.field4278, class37.field483, class191.field2827, 20, !class56.field817);
                    class244.method1669(var27);
                    if (class240.field3525 == 1) {
                        class244.method1676(0.9F);
                    }
                    if (class240.field3525 == 2) {
                        class244.method1676(0.8F);
                    }
                    if (class240.field3525 == 3) {
                        class244.method1676(0.7F);
                    }
                    if (class240.field3525 == 4) {
                        class244.method1676(0.6F);
                    }
                    class194.field2863 = 70;
                    class232.field3412 = class300.field4845;
                    class44.field580 = 100;
                } else {
                    class232.field3412 = class259.field4006 + class37.field483.method1882(72) + "%";
                    class194.field2863 = 70;
                }
            } else if (class44.field580 == 100) {
                if (class236.method1628(4, class191.field2827)) {
                    class44.field580 = 110;
                }
            } else if (class44.field580 == 110) {
                class84.field1330 = new class77();
                class273.field4426.method941(10, 97, class84.field1330);
                class232.field3412 = class8.field91;
                class194.field2863 = 75;
                class44.field580 = 120;
            } else if (class44.field580 == 120) {
                if (class269.field4327.method1875(true, "huffman", "")) {
                    class188 var28 = new class188(class269.field4327.method1881("huffman", 0, ""));
                    class204.method1444(arg0 ^ 0xFFFFD8B8, var28);
                    class232.field3412 = class156.field2446;
                    class44.field580 = 130;
                    class194.field2863 = 80;
                } else {
                    class232.field3412 = class250.field3777 + "0%";
                    class194.field2863 = 80;
                }
            } else if (class44.field580 == 130) {
                if (!class282.field4546.method1894(0)) {
                    class232.field3412 = class225.field3310 + class282.field4546.method1882(74) * 3 / 4 + "%";
                    class194.field2863 = 85;
                } else if (!class20.field211.method1894(arg0 - 30)) {
                    class232.field3412 = class225.field3310 + (class20.field211.method1882(arg0 ^ 0x78) / 10 + 75) + "%";
                    class194.field2863 = 85;
                } else if (!class313.field5017.method1894(0)) {
                    class232.field3412 = class225.field3310 + (class313.field5017.method1882(arg0 ^ 0x33) / 20 + 85) + "%";
                    class194.field2863 = 85;
                } else if (class147.field2361.method1877("details", (byte) -127)) {
                    class46.method276(class147.field2361);
                    class88.method655(class243.field3578);
                    class127.method968(class193.field2855);
                    class232.field3412 = class273.field4422;
                    class44.field580 = 135;
                    class194.field2863 = 95;
                } else {
                    class232.field3412 = class225.field3310 + (class147.field2361.method1865("details", (byte) 98) / 10 + 90) + "%";
                    class194.field2863 = 85;
                }
            } else if (class44.field580 == 135) {
                int var29 = class162.method1175((byte) 87);
                if (var29 == -1) {
                    class194.field2863 = 95;
                    class232.field3412 = class110.field1842;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1218(2, "worldlistfull");
                    class79.method586(-1, 1000);
                } else if (class243.field3576) {
                    class194.field2863 = 96;
                    class44.field580 = 140;
                    class232.field3412 = class183.field2745;
                } else {
                    this.method1218(2, "worldlistio_" + var29);
                    class79.method586(-1, 1000);
                }
            } else if (class44.field580 == 140) {
                class151.field2396 = class282.field4546.method1884("loginscreen", (byte) -127);
                class296.field4754.method1867(false, -23835, true);
                class300.field4850.method1867(true, -23835, true);
                class191.field2827.method1867(true, -23835, true);
                class313.field5017.method1867(true, -23835, true);
                class269.field4327.method1867(true, arg0 ^ 0xFFFFA2FB, true);
                class282.field4546.method1867(true, -23835, true);
                class263.field4044 = true;
                class44.field580 = 150;
                class194.field2863 = 97;
                class232.field3412 = class236.field3447;
            } else if (class44.field580 == 150) {
                if (class69.field1110) {
                    class146.field2351 = 0;
                    class77.field1218 = 0;
                    class265.field4245 = 0;
                    class64.field969 = 0;
                }
                class69.field1110 = true;
                class89.method667(1, class273.field4426);
                class33.method212(-1, -1, class64.field969, false, 0);
                class194.field2863 = 100;
                class232.field3412 = class84.field1342;
                class44.field580 = 160;
            } else if (class44.field580 == 160) {
                class21.method153(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1977++;
        if (!this.method1220((byte) 126)) {
            return;
        }
        class62.field940 = Integer.parseInt(this.getParameter("worldid"));
        class113.field1868 = Integer.parseInt(this.getParameter("modewhere"));
        if (class113.field1868 < 0 || class113.field1868 > 1) {
            class113.field1868 = 0;
        }
        class55.field811 = Integer.parseInt(this.getParameter("modewhat"));
        if (class55.field811 < 0 || class55.field811 > 2) {
            class55.field811 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class119.field1937 = true;
        } else {
            class119.field1937 = false;
        }
        try {
            class87.field1385 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class87.field1385 = 0;
        }
        class40.method252(class87.field1385, (byte) 104);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class225.field3306 = true;
        } else {
            class225.field3306 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class121.field1990 = true;
        } else {
            class121.field1990 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class121.field1986 = 1;
        } else {
            class121.field1986 = 0;
        }
        try {
            class281.field4525 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class281.field4525 = 0;
        }
        class220.field3205 = this.getParameter("settings");
        if (class220.field3205 == null) {
            class220.field3205 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class303.field4899 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class303.field4899 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class186.field2774 = true;
        } else {
            class186.field2774 = false;
        }
        class91.field1466 = this;
        this.method1230(503, 550, class55.field811 + 32, 10, 765);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method906(int arg0) {
        field1978++;
        if (class188.field2802.field4293 > class277.field4484) {
            if (class268.field4313 == class211.field3114) {
                class268.field4313 = class293.field4671;
            } else {
                class268.field4313 = class211.field3114;
            }
            class106.field1809 = (class188.field2802.field4293 * 50 - 50) * 5;
            if (class106.field1809 > 3000) {
                class106.field1809 = 3000;
            }
            if (class188.field2802.field4293 >= 2 && class188.field2802.field4294 == 6) {
                this.method1218(2, "js5connect_outofdate");
                class98.field1677 = 1000;
                return;
            }
            if (class188.field2802.field4293 >= 4 && class188.field2802.field4294 == -1) {
                this.method1218(2, "js5crc");
                class98.field1677 = 1000;
                return;
            }
            if (class188.field2802.field4293 >= 4 && (class98.field1677 == 0 || class98.field1677 == 5)) {
                if (class188.field2802.field4294 == 7 || class188.field2802.field4294 == 9) {
                    this.method1218(arg0 + 1, "js5connect_full");
                } else if (class188.field2802.field4294 > 0) {
                    this.method1218(2, "js5connect");
                } else {
                    this.method1218(2, "js5io");
                }
                class98.field1677 = 1000;
                return;
            }
        }
        class277.field4484 = class188.field2802.field4293;
        if (class106.field1809 > 0) {
            class106.field1809--;
            return;
        }
        try {
            if (class260.field4030 == 0) {
                class218.field3185 = class273.field4426.method936(arg0 ^ 0xFFFFFF8D, class268.field4313, class298.field4794);
                class260.field4030++;
            }
            if (class260.field4030 == arg0) {
                if (class218.field3185.field936 == 2) {
                    this.method915(1000, 28603);
                    return;
                }
                if (class218.field3185.field936 == 1) {
                    class260.field4030++;
                }
            }
            if (class260.field4030 == 2) {
                class297.field4762 = new class203((Socket) class218.field3185.field932, class273.field4426);
                class53 var2 = new class53(5);
                var2.method360(15, arg0 ^ 0x649E);
                var2.method385(550, arg0 ^ 0x1B2A2CE9);
                class297.field4762.method1435(9, 0, var2.field758, 5);
                class260.field4030++;
                class31.field380 = class3.method14(29853);
            }
            if (class260.field4030 == 3) {
                if (class98.field1677 == 0 || class98.field1677 == 5 || class297.field4762.method1434(0) > 0) {
                    int var3 = class297.field4762.method1441(3755);
                    if (var3 != 0) {
                        this.method915(var3, 28603);
                        return;
                    }
                    class260.field4030++;
                } else if ((class3.method14(29853) - class31.field380) > 30000L) {
                    this.method915(1001, 28603);
                    return;
                }
            }
            if (class260.field4030 == 4) {
                boolean var4 = class98.field1677 == 5 || class98.field1677 == 10 || class98.field1677 == 28;
                class188.field2802.method1843(class297.field4762, !var4, true);
                class297.field4762 = null;
                class218.field3185 = null;
                class260.field4030 = 0;
            }
        } catch (IOException var5) {
            this.method915(1002, 28603);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lmh;IIIIIII)V")
    public static final void method907(class263[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class263 var9 = arg0[var8];
            if (var9 != null && var9.field4202 == arg1 && (!var9.field4167 || var9.field4129 == 0 || var9.field4194 || method903(var9).field3789 != 0 || class132.field2178 == var9 || var9.field4179 == 1338) && (!var9.field4167 || !method901(var9))) {
                int var10 = var9.field4206 + arg6;
                int var11 = var9.field4140 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4129 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4215 + var10;
                    int var17 = var9.field4046 + var11;
                    if (var9.field4129 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class306.field4945 == var9) {
                    class197.field2894 = true;
                    class210.field3106 = var10;
                    class48.field673 = var11;
                }
                if (!var9.field4167 || var12 < var14 && var13 < var15) {
                    if (var9.field4129 == 0) {
                        if (!var9.field4167 && method901(var9) && class207.field3041 != var9) {
                            continue;
                        }
                        if (var9.field4147 && class204.field3017 >= var12 && class44.field584 >= var13 && class204.field3017 < var14 && class44.field584 < var15) {
                            for (class234 var18 = (class234) class304.field4923.method8(-79); var18 != null; var18 = (class234) class304.field4923.method12((byte) 69)) {
                                if (var18.field3416) {
                                    var18.method1781(5250);
                                    var18.field3423.field4078 = false;
                                }
                            }
                            if (class162.field2515 == 0) {
                                class306.field4945 = null;
                                class132.field2178 = null;
                            }
                            class111.field1855 = 0;
                            class190.field2815 = false;
                        }
                    }
                    if (var9.field4167) {
                        boolean var19;
                        if (class204.field3017 >= var12 && class44.field584 >= var13 && class204.field3017 < var14 && class44.field584 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class79.field1274 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class56.field818 == 1 && class17.field187 >= var12 && class13.field153 >= var13 && class17.field187 < var14 && class13.field153 < var15) {
                            var21 = true;
                        }
                        if (var9.field4052 != null) {
                            for (int var22 = 0; var22 < var9.field4052.length; var22++) {
                                if (class82.field1326[var9.field4052[var22]]) {
                                    if (var9.field4056 == null || class199.field2930 >= var9.field4056[var22]) {
                                        byte var23 = var9.field4074[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class82.field1326[86] && !class82.field1326[82] && !class82.field1326[81]) && ((var23 & 0x2) == 0 || class82.field1326[86]) && ((var23 & 0x1) == 0 || class82.field1326[82]) && ((var23 & 0x4) == 0 || class82.field1326[81])) {
                                            class242.method1654(var22 + 1, -1, "", var9.field4083, 16730);
                                            int var24 = var9.field4228[var22];
                                            if (var9.field4056 == null) {
                                                var9.field4056 = new int[var9.field4052.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4056[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4056[var22] = class199.field2930 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4056 != null) {
                                    var9.field4056[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class232.method1606(class13.field153 - var11, class17.field187 - var10, 0, var9);
                        }
                        if (class306.field4945 != null && class306.field4945 != var9 && var19 && method903(var9).method1728(true)) {
                            class286.field4590 = var9;
                        }
                        if (class132.field2178 == var9) {
                            class210.field3102 = true;
                            class212.field3127 = var10;
                            class11.field129 = var11;
                        }
                        if (var9.field4194 || var9.field4179 != 0) {
                            if (var19 && class201.field2956 != 0 && var9.field4162 != null) {
                                class234 var25 = new class234();
                                var25.field3416 = true;
                                var25.field3423 = var9;
                                var25.field3422 = class201.field2956;
                                var25.field3419 = var9.field4162;
                                class304.field4923.method13(32, var25);
                            }
                            if (class306.field4945 != null || class108.field1827 != null || class191.field2823 || var9.field4179 != 1400 && class111.field1855 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4179 != 0) {
                                if (var9.field4179 == 1337) {
                                    class135.field2203 = var9;
                                    continue;
                                }
                                if (var9.field4179 == 1338) {
                                    if (var21) {
                                        class308.field4960 = class17.field187 - var10;
                                        class240.field3528 = class13.field153 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4179 == 1400) {
                                    class73.field1141 = var9;
                                    if (var19) {
                                        class190.field2815 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class17.field187 - var10 - var9.field4215 / 2) * 2.0D / (double) class46.field629);
                                        int var27 = (int) ((double) (class13.field153 - var11 - var9.field4046 / 2) * 2.0D / (double) class46.field629);
                                        int var28 = class30.field319 + var26;
                                        int var29 = class121.field1989 + var27;
                                        int var30 = class46.field623 + var28;
                                        int var31 = class46.field620 + class46.field621 - var29 - 1;
                                        class242 var32 = class121.method921(true);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method1658(var30, var31, 7, var33);
                                        if (var33 != null) {
                                            if (class82.field1326[82] && class228.field3349 > 0) {
                                                class212.method1492(var33[2], var33[0], 16946, var33[1]);
                                                class161.method1170((byte) 120);
                                                continue;
                                            }
                                            class301.field4857++;
                                            class144.field2338.method683(true, 251);
                                            class144.field2338.method348(var33[0] << 28 | var33[1] << 14 | var33[2], (byte) 127);
                                        }
                                        class111.field1855 = 1;
                                        class273.field4424 = false;
                                        class211.field3111 = class204.field3017;
                                        class115.field1907 = class44.field584;
                                        continue;
                                    }
                                    if (var20 && class111.field1855 > 0) {
                                        if (class111.field1855 == 1 && (class211.field3111 != class204.field3017 || class44.field584 != class115.field1907)) {
                                            class255.field3858 = class30.field319;
                                            class57.field851 = class121.field1989;
                                            class111.field1855 = 2;
                                        }
                                        if (class111.field1855 == 2) {
                                            class273.field4424 = true;
                                            class138.method1043((int) ((double) (class211.field3111 - class204.field3017) * 2.0D / (double) class46.field627) + class255.field3858, 125);
                                            class263.method1813((int) ((double) (class115.field1907 - class44.field584) * 2.0D / (double) class46.field627) + class57.field851, -5421);
                                        }
                                        continue;
                                    }
                                    if (class111.field1855 > 0 && !class273.field4424) {
                                        if ((class38.field488 == 1 || class219.method1526(class147.field2360 - 1, -1)) && class147.field2360 > 2) {
                                            class227.method1573(15);
                                        } else if (class147.field2360 > 0) {
                                            class107.method824((byte) -128);
                                        }
                                    }
                                    class111.field1855 = 0;
                                    continue;
                                }
                                if (var9.field4179 == 1401) {
                                    if (var20) {
                                        class187.method1338(var9.field4215, class44.field584 - var11, class204.field3017 - var10, 112, var9.field4046);
                                    }
                                    continue;
                                }
                                if (var9.field4179 == 1402) {
                                    class63.method476(var9, 14105);
                                    continue;
                                }
                            }
                            if (!var9.field4199 && var21) {
                                var9.field4199 = true;
                                if (var9.field4100 != null) {
                                    class234 var34 = new class234();
                                    var34.field3416 = true;
                                    var34.field3423 = var9;
                                    var34.field3415 = class17.field187 - var10;
                                    var34.field3422 = class13.field153 - var11;
                                    var34.field3419 = var9.field4100;
                                    class304.field4923.method13(32, var34);
                                }
                            }
                            if (var9.field4199 && var20 && var9.field4047 != null) {
                                class234 var35 = new class234();
                                var35.field3416 = true;
                                var35.field3423 = var9;
                                var35.field3415 = class204.field3017 - var10;
                                var35.field3422 = class44.field584 - var11;
                                var35.field3419 = var9.field4047;
                                class304.field4923.method13(32, var35);
                            }
                            if (var9.field4199 && !var20) {
                                var9.field4199 = false;
                                if (var9.field4057 != null) {
                                    class234 var36 = new class234();
                                    var36.field3416 = true;
                                    var36.field3423 = var9;
                                    var36.field3415 = class204.field3017 - var10;
                                    var36.field3422 = class44.field584 - var11;
                                    var36.field3419 = var9.field4057;
                                    class133.field2183.method13(32, var36);
                                }
                            }
                            if (var20 && var9.field4203 != null) {
                                class234 var37 = new class234();
                                var37.field3416 = true;
                                var37.field3423 = var9;
                                var37.field3415 = class204.field3017 - var10;
                                var37.field3422 = class44.field584 - var11;
                                var37.field3419 = var9.field4203;
                                class304.field4923.method13(32, var37);
                            }
                            if (!var9.field4078 && var19) {
                                var9.field4078 = true;
                                if (var9.field4115 != null) {
                                    class234 var38 = new class234();
                                    var38.field3416 = true;
                                    var38.field3423 = var9;
                                    var38.field3415 = class204.field3017 - var10;
                                    var38.field3422 = class44.field584 - var11;
                                    var38.field3419 = var9.field4115;
                                    class304.field4923.method13(32, var38);
                                }
                            }
                            if (var9.field4078 && var19 && var9.field4103 != null) {
                                class234 var39 = new class234();
                                var39.field3416 = true;
                                var39.field3423 = var9;
                                var39.field3415 = class204.field3017 - var10;
                                var39.field3422 = class44.field584 - var11;
                                var39.field3419 = var9.field4103;
                                class304.field4923.method13(32, var39);
                            }
                            if (var9.field4078 && !var19) {
                                var9.field4078 = false;
                                if (var9.field4157 != null) {
                                    class234 var40 = new class234();
                                    var40.field3416 = true;
                                    var40.field3423 = var9;
                                    var40.field3415 = class204.field3017 - var10;
                                    var40.field3422 = class44.field584 - var11;
                                    var40.field3419 = var9.field4157;
                                    class133.field2183.method13(32, var40);
                                }
                            }
                            if (var9.field4102 != null) {
                                class234 var41 = new class234();
                                var41.field3423 = var9;
                                var41.field3419 = var9.field4102;
                                class1.field11.method13(32, var41);
                            }
                            if (var9.field4155 != null && class53.field796 > var9.field4121) {
                                if (var9.field4195 == null || class53.field796 - var9.field4121 > 32) {
                                    class234 var46 = new class234();
                                    var46.field3423 = var9;
                                    var46.field3419 = var9.field4155;
                                    class304.field4923.method13(32, var46);
                                } else {
                                    label600: for (int var42 = var9.field4121; var42 < class53.field796; var42++) {
                                        int var43 = class232.field3404[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field4195.length; var44++) {
                                            if (var9.field4195[var44] == var43) {
                                                class234 var45 = new class234();
                                                var45.field3423 = var9;
                                                var45.field3419 = var9.field4155;
                                                class304.field4923.method13(32, var45);
                                                break label600;
                                            }
                                        }
                                    }
                                }
                                var9.field4121 = class53.field796;
                            }
                            if (var9.field4189 != null && class72.field1137 > var9.field4192) {
                                if (var9.field4144 == null || class72.field1137 - var9.field4192 > 32) {
                                    class234 var51 = new class234();
                                    var51.field3423 = var9;
                                    var51.field3419 = var9.field4189;
                                    class304.field4923.method13(32, var51);
                                } else {
                                    label576: for (int var47 = var9.field4192; var47 < class72.field1137; var47++) {
                                        int var48 = class52.field713[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4144.length; var49++) {
                                            if (var9.field4144[var49] == var48) {
                                                class234 var50 = new class234();
                                                var50.field3423 = var9;
                                                var50.field3419 = var9.field4189;
                                                class304.field4923.method13(32, var50);
                                                break label576;
                                            }
                                        }
                                    }
                                }
                                var9.field4192 = class72.field1137;
                            }
                            if (var9.field4049 != null && class188.field2795 > var9.field4075) {
                                if (var9.field4070 == null || class188.field2795 - var9.field4075 > 32) {
                                    class234 var56 = new class234();
                                    var56.field3423 = var9;
                                    var56.field3419 = var9.field4049;
                                    class304.field4923.method13(32, var56);
                                } else {
                                    label552: for (int var52 = var9.field4075; var52 < class188.field2795; var52++) {
                                        int var53 = class301.field4881[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4070.length; var54++) {
                                            if (var9.field4070[var54] == var53) {
                                                class234 var55 = new class234();
                                                var55.field3423 = var9;
                                                var55.field3419 = var9.field4049;
                                                class304.field4923.method13(32, var55);
                                                break label552;
                                            }
                                        }
                                    }
                                }
                                var9.field4075 = class188.field2795;
                            }
                            if (var9.field4182 != null && class269.field4332 > var9.field4084) {
                                if (var9.field4225 == null || class269.field4332 - var9.field4084 > 32) {
                                    class234 var61 = new class234();
                                    var61.field3423 = var9;
                                    var61.field3419 = var9.field4182;
                                    class304.field4923.method13(32, var61);
                                } else {
                                    label528: for (int var57 = var9.field4084; var57 < class269.field4332; var57++) {
                                        int var58 = class245.field3608[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field4225.length; var59++) {
                                            if (var9.field4225[var59] == var58) {
                                                class234 var60 = new class234();
                                                var60.field3423 = var9;
                                                var60.field3419 = var9.field4182;
                                                class304.field4923.method13(32, var60);
                                                break label528;
                                            }
                                        }
                                    }
                                }
                                var9.field4084 = class269.field4332;
                            }
                            if (var9.field4087 != null && class62.field941 > var9.field4091) {
                                if (var9.field4096 == null || class62.field941 - var9.field4091 > 32) {
                                    class234 var66 = new class234();
                                    var66.field3423 = var9;
                                    var66.field3419 = var9.field4087;
                                    class304.field4923.method13(32, var66);
                                } else {
                                    label504: for (int var62 = var9.field4091; var62 < class62.field941; var62++) {
                                        int var63 = class2.field31[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field4096.length; var64++) {
                                            if (var9.field4096[var64] == var63) {
                                                class234 var65 = new class234();
                                                var65.field3423 = var9;
                                                var65.field3419 = var9.field4087;
                                                class304.field4923.method13(32, var65);
                                                break label504;
                                            }
                                        }
                                    }
                                }
                                var9.field4091 = class62.field941;
                            }
                            if (class124.field2061 > var9.field4153 && var9.field4053 != null) {
                                class234 var67 = new class234();
                                var67.field3423 = var9;
                                var67.field3419 = var9.field4053;
                                class304.field4923.method13(32, var67);
                            }
                            if (class135.field2210 > var9.field4153 && var9.field4066 != null) {
                                class234 var68 = new class234();
                                var68.field3423 = var9;
                                var68.field3419 = var9.field4066;
                                class304.field4923.method13(32, var68);
                            }
                            if (class302.field4893 > var9.field4153 && var9.field4116 != null) {
                                class234 var69 = new class234();
                                var69.field3423 = var9;
                                var69.field3419 = var9.field4116;
                                class304.field4923.method13(32, var69);
                            }
                            if (class99.field1686 > var9.field4153 && var9.field4064 != null) {
                                class234 var70 = new class234();
                                var70.field3423 = var9;
                                var70.field3419 = var9.field4064;
                                class304.field4923.method13(32, var70);
                            }
                            if (class298.field4774 > var9.field4153 && var9.field4212 != null) {
                                class234 var71 = new class234();
                                var71.field3423 = var9;
                                var71.field3419 = var9.field4212;
                                class304.field4923.method13(32, var71);
                            }
                            var9.field4153 = class248.field3705;
                            if (var9.field4154 != null) {
                                for (int var72 = 0; var72 < class47.field657; var72++) {
                                    class234 var73 = new class234();
                                    var73.field3423 = var9;
                                    var73.field3417 = class13.field155[var72];
                                    var73.field3424 = class250.field3786[var72];
                                    var73.field3419 = var9.field4154;
                                    class304.field4923.method13(32, var73);
                                }
                            }
                            if (class51.field698 && var9.field4113 != null) {
                                class234 var74 = new class234();
                                var74.field3423 = var9;
                                var74.field3419 = var9.field4113;
                                class304.field4923.method13(32, var74);
                            }
                        }
                    }
                    if (!var9.field4167 && class306.field4945 == null && class108.field1827 == null && !class191.field2823) {
                        if ((var9.field4124 >= 0 || var9.field4173 != 0) && class204.field3017 >= var12 && class44.field584 >= var13 && class204.field3017 < var14 && class44.field584 < var15) {
                            if (var9.field4124 >= 0) {
                                class207.field3041 = arg0[var9.field4124];
                            } else {
                                class207.field3041 = var9;
                            }
                        }
                        if (var9.field4129 == 8 && class204.field3017 >= var12 && class44.field584 >= var13 && class204.field3017 < var14 && class44.field584 < var15) {
                            class113.field1875 = var9;
                        }
                        if (var9.field4207 > var9.field4046) {
                            class5.method26(var9.field4215 + var10, class204.field3017, var11, var9.field4207, class44.field584, (byte) -73, var9, var9.field4046);
                        }
                    }
                    if (var9.field4129 == 0) {
                        method907(arg0, var9.field4083, var12, var13, var14, var15, var10 - var9.field4097, var11 - var9.field4160);
                        if (var9.field4143 != null) {
                            method907(var9.field4143, var9.field4083, var12, var13, var14, var15, var10 - var9.field4097, var11 - var9.field4160);
                        }
                        class133 var75 = (class133) class251.field3793.method1073(-1, (long) var9.field4083);
                        if (var75 != null) {
                            class218.method1521(var15, var13, var11, var75.field2187, (byte) 98, var10, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lmh;)Lmh;")
    public static final class263 method908(class263 arg0) {
        int var1 = method903(arg0).method1729((byte) -65);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class144.method1078(arg0.field4202, 8534);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method909(byte arg0) {
        field1981++;
        if (arg0 != -84) {
            this.method905(43);
        }
        boolean var2 = class188.field2802.method1829(true);
        if (!var2) {
            this.method906(1);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1975++;
        try {
            if (arg0.length != 4) {
                class56.method398("argument count", (byte) 50);
            }
            class62.field940 = Integer.parseInt(arg0[0]);
            class113.field1868 = 2;
            if (arg0[1].equals("live")) {
                class55.field811 = 0;
            } else if (arg0[1].equals("rc")) {
                class55.field811 = 1;
            } else if (arg0[1].equals("wip")) {
                class55.field811 = 2;
            } else {
                class56.method398("modewhat", (byte) 124);
            }
            class119.field1937 = false;
            class87.field1385 = class100.method785(arg0[2], (byte) 52);
            if (class87.field1385 == -1) {
                if (arg0[2].equals("english")) {
                    class87.field1385 = 0;
                } else if (arg0[2].equals("german")) {
                    class87.field1385 = 1;
                } else {
                    class56.method398("language", (byte) 47);
                }
            }
            class40.method252(class87.field1385, (byte) 51);
            class121.field1990 = false;
            class225.field3306 = false;
            if (arg0[3].equals("game0")) {
                class121.field1986 = 0;
            } else if (arg0[3].equals("game1")) {
                class121.field1986 = 1;
            } else {
                class56.method398("game", (byte) 61);
            }
            class303.field4899 = 0;
            class281.field4525 = 0;
            class186.field2774 = false;
            class220.field3205 = "";
            client var1 = new client();
            class91.field1466 = var1;
            var1.method1228(550, 10, false, 29, 768, class55.field811 + 32, class121.field1986 == 1 ? "mechscape" : "runescape", 1024);
            class195.field2881.setLocation(40, 40);
        } catch (Exception var3) {
            class5.method27(113, (String) null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public static final void method910(byte arg0) {
        class35.field449.method1422((byte) 100);
        if (arg0 < 87) {
            method907((class263[]) null, 31, 20, -58, 3, -62, 4, -114);
        }
        field1973++;
        class52.field712.method1422((byte) 99);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method911(byte[] arg0, int arg1) {
        if (arg1 <= 35) {
            return;
        }
        field1969++;
        class53 var3 = new class53(arg0);
        while (true) {
            int var4 = var3.method366(-16505);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                var3.method331(-12);
                var3.method331(-44);
                var3.method331(-93);
                var3.method331(-41);
                var3.method331(-58);
                var3.method331(-42);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)V")
    public static final void method912(int arg0, int arg1, int arg2, boolean arg3) {
        field1966++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class11.field128 = arg3;
        if (arg1 == 0) {
            class254.field3833 = arg0;
            class91.field1459 = arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIII)V")
    public static final void method913(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1971++;
        if (arg4 > arg0) {
            for (int var5 = arg0; var5 < arg4; var5++) {
                class104.field1795[var5][arg3] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg0; var6++) {
                class104.field1795[var6][arg3] = arg2;
            }
        }
        if (arg1 != 1) {
            method907((class263[]) null, -21, 83, 30, 115, -109, 15, -99);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method914(int arg0) {
        if (arg0 != -136) {
            field1983 = null;
        }
        field1967++;
        class25.method168((byte) 114);
        class169.field2569 = new class202();
        class188.field2802 = new class267();
        if (class55.field811 != 0) {
            class204.field3014 = new byte[50][];
        }
        class35.method224(false, class273.field4426);
        if (class113.field1868 == 0) {
            class160.field2483 = this.getCodeBase().getHost();
            class25.field271 = 443;
            class231.field3397 = 43594;
        } else if (class113.field1868 == 1) {
            class160.field2483 = this.getCodeBase().getHost();
            class25.field271 = class62.field940 + 50000;
            class231.field3397 = class62.field940 + 40000;
        } else if (class113.field1868 == 2) {
            class231.field3397 = class62.field940 + 40000;
            class25.field271 = class62.field940 + 50000;
            class160.field2483 = "127.0.0.1";
        }
        class293.field4671 = class25.field271;
        if (class122.field2024 == 3 && class113.field1868 != 2) {
            class114.field1884 = class62.field940;
        }
        class211.field3114 = class231.field3397;
        if (class121.field1986 == 1) {
            class21.field225 = class206.field3030;
            class294.field4715 = class144.field2340;
            class207.field3066 = class38.field505;
            class225.field3307 = true;
            class283.field4557 = class303.field4897;
        } else {
            class21.field225 = class119.field1938;
            class207.field3066 = class24.field268;
            class294.field4715 = class38.field503;
            class283.field4557 = class93.field1536;
        }
        class298.field4794 = class160.field2483;
        class277.field4479 = class231.field3397;
        class268.field4313 = class277.field4479;
        class274.field4444 = class213.field3138 = class273.field4423 = class22.field240 = new short[256];
        class230.method1598((byte) -59);
        class135.method1021(class12.field136, 107);
        class245.method1690(class12.field136, -70);
        class82.field1324 = class29.method187(-46);
        if (class82.field1324 != null) {
            class82.field1324.method112(class12.field136, -820088272);
        }
        class32.field405 = class122.field2024;
        try {
            if (class273.field4426.field2016 != null) {
                class26.field289 = new class73(class273.field4426.field2016, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class120.field1949[var2] = new class73(class273.field4426.field2025[var2], 6000, 0);
                }
                class274.field4439 = new class73(class273.field4426.field2022, 6000, 0);
                class17.field184 = new class224(255, class26.field289, class274.field4439, 500000);
                class259.field4007 = new class73(class273.field4426.field2017, 24, 0);
                class273.field4426.field2025 = null;
                class273.field4426.field2017 = null;
                class273.field4426.field2022 = null;
                class273.field4426.field2016 = null;
            }
        } catch (IOException var3) {
            class26.field289 = null;
            class274.field4439 = null;
            class17.field184 = null;
            class259.field4007 = null;
        }
        if (class113.field1868 != 0) {
            class191.field2828 = true;
        }
        if (class121.field1986 == 0) {
            class236.field3453 = class256.field3867;
        } else if (class121.field1986 == 1) {
            class236.field3453 = class66.field1012;
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    private final void method915(int arg0, int arg1) {
        field1965++;
        if (arg1 != 28603) {
            method912(86, 90, -46, true);
        }
        class188.field2802.field4293++;
        class297.field4762 = null;
        class188.field2802.field4294 = arg0;
        class218.field3185 = null;
        class260.field4030 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method916(boolean arg0) {
        method904(0);
        class88.method666();
        class142.method1063(-19774);
        field1972++;
        class124.method960(-1);
        class46.method282();
        class242.method1660((byte) -127);
        class13.method95(-106);
        class172.method1222(false);
        class135.method1022((byte) -36);
        class49.method301(5);
        class77.method575(128);
        class147.method1093((byte) 119);
        class53.method347(323735592);
        class203.method1436(96);
        class267.method1831(13862);
        class202.method1427((byte) -55);
        class21.method148(128);
        class299.method2040(100);
        class270.method1889(-66);
        class73.method550(-105);
        class224.method1556(-117);
        class201.method1417((byte) -76);
        class12.method89(104);
        class91.method679(true);
        class228.method1587((byte) 102);
        class263.method1807(124);
        class207.method1465(104);
        class2.method10((byte) 122);
        class94.method728((byte) -68);
        class143.method1075((byte) 120);
        class16.method110(0);
        class43.method264(0);
        class81.method607(-107);
        class59.method440(122);
        class295.method2004(-1);
        class300.method2050(0);
        class298.method2025(64);
        class76.method565((byte) 127);
        class248.method1707((byte) -97);
        class313.method2108((byte) -62);
        class293.method1989(1);
        class102.method802((byte) -26);
        class133.method1013(-97);
        class250.method1721(-110);
        class194.method1375(-91);
        class259.method1783(-18853);
        class205.method1447(false);
        class84.method628((byte) 119);
        class129.method975(112);
        class114.method855(true);
        class152.method1123(-12731);
        class283.method1954(true);
        class185.method1328(-75);
        class140.method1053(128);
        class288.method1967(512);
        class217.method1510((byte) 63);
        class286.method1962((byte) -91);
        class100.method782(-18222);
        class17.method121((byte) -23);
        class171.method1214(-30467);
        class225.method1559(79);
        class146.method1088(true);
        class35.method227((byte) -98);
        class302.method2060(88);
        class22.method156(-18131);
        class5.method29(true);
        class93.method713(128);
        class309.method2095(-128);
        class174.method1244(-10502);
        class96.method743();
        class230.method1602(false);
        class31.method196((byte) -37);
        class257.method1761();
        class240.method1641(255);
        class136.method1023((byte) -47);
        class241.method1645(-56);
        class138.method1046((byte) -55);
        class10.method74();
        class261.method1788(true);
        class45.method271(4);
        class80.method604();
        class235.method1623(0);
        class33.method213(0);
        class213.method1493(false);
        class159.method1159((byte) 101);
        class157.method1150();
        class104.method817(-1);
        class66.method492(2);
        class167.method1191((byte) -87);
        class223.method1551(arg0);
        class65.method490((byte) 4);
        class130.method1002();
        class232.method1608((byte) 54);
        class14.method100(1);
        class192.method1367(true);
        class155.method1131(false);
        class312.method2104((byte) 91);
        class308.method2085(false);
        class115.method862(-117);
        class269.method1861(0);
        class8.method42((byte) 67);
        class123.method948(2047);
        class211.method1486(-90);
        class219.method1529((byte) 87);
        class294.method2001(arg0);
        class120.method900(!arg0);
        class268.method1847((byte) -125);
        class139.method1050(5);
        class127.method969();
        class144.method1076(0);
        class92.method693(-1);
        class183.method1285(0);
        class149.method1112(-97);
        class98.method768((byte) -127);
        class173.method1239();
        class256.method1758(56);
        class190.method1351(-1);
        class187.method1341(0);
        class163.method1177(-111);
        class274.method1910(4);
        class39.method246(0);
        class276.method1917(-1);
        class19.method135((byte) 127);
        class27.method174();
        class244.method1666();
        class188.method1345(false);
        class204.method1446((byte) -114);
        class206.method1460(true);
        class62.method474((byte) -115);
        class111.method843((byte) 127);
        class277.method1924(-3342);
        class306.method2076(true);
        class107.method825(-43);
        class284.method1956(-1);
        class249.method1717(-1);
        class247.method1702(6422);
        class258.method1779(98);
        class156.method1139((byte) 93);
        class57.method399(true);
        class231.method1604(0);
        class272.method1900(256);
        class214.method1496(29);
        class226.method1565(true);
        class304.method2070(true);
        class239.method1638();
        class260.method1785(-7909);
        class132.method1010(0);
        class271.method1896();
        class9.method55((byte) 36);
        class125.method963(113);
        class79.method588(-18282);
        class170.method1213((byte) -41);
        class292.method1984(7244);
        class279.method1933(121);
        class101.method790(1326);
        class301.method2054(1000);
        class289.method1971(-25502);
        class95.method735();
        class245.method1692(113);
        class34.method220(true);
        class106.method822(0);
        class297.method2023(255);
        class179.method1271(-1);
        class251.method1735(-31254);
        class208.method1470((byte) -38);
        class47.method292(-2);
        class222.method1545(125);
        class196.method1387(-115);
        class236.method1631((byte) -42);
        class165.method1183(6);
        class108.method830(0);
        class216.method1500();
        class82.method615(109);
        class131.method1009(-1);
        class37.method234(16711680);
        class23.method159(-96);
        class265.method1826(-15582);
        class103.method809((byte) -73);
        class210.method1480(2);
        class233.method1618();
        class78.method577(false);
        class186.method1333((byte) -107);
        class75.method562((byte) 123);
        class305.method2071((byte) -53);
        class112.method846(121);
        class262.method1795();
        class118.method885();
        class51.method307(1024);
        class181.method1279(2);
        class6.method34((byte) 16);
        class126.method964(-52);
        class67.method501();
        class90.method673();
        class26.method171((byte) -63);
        class199.method1405((byte) -99);
        class72.method541(-9774);
        class273.method1905(122);
        class52.method323(-45);
        class32.method207(550);
        class166.method1188(true);
        class195.method1382((byte) -126);
        class110.method839(50);
        class99.method780((byte) -109);
        class182.method1284(1);
        class303.method2065(31276);
        class85.method631(0);
        class218.method1522((byte) -103);
        class200.method1413(2883854);
        class24.method161(-1304731184);
        class209.method1476(0);
        class40.method251(-167981236);
        class281.method1946(0);
        class63.method478(4);
        class44.method267(-25216);
        class86.method635((byte) 118);
        class69.method527((byte) -88);
        class121.method923(37);
        class38.method237(true);
        class160.method1161((byte) 105);
        class20.method139(true);
        class243.method1664(578156820);
        class220.method1532(1);
        class128.method973(-39);
        class169.method1206(true);
        class287.method1965(true);
        class264.method1825((byte) -85);
        class191.method1356(32);
        class71.method538((byte) -75);
        class180.method1272(!arg0);
        class282.method1953((byte) 124);
        class119.method888(4626);
        class7.method39(14073);
        class280.method1941(arg0);
        class36.method229((byte) -122);
        class254.method1749((byte) -107);
        class161.method1168(7391);
        class237.method1635((byte) -90);
        class48.method295(12701);
        class275.method1914(false);
        class55.method394((byte) 53);
        class141.method1054((byte) 49);
        class296.method2014((byte) 119);
        class252.method1737((byte) 43);
        class193.method1371((byte) -103);
        class134.method1017((byte) 104);
        class162.method1171(-26229);
        class197.method1392(0);
        class1.method2(-121);
        class158.method1157(arg0);
        class221.method1539((byte) 126);
        class290.method1974((byte) -112);
        class227.method1572(-1);
        class64.method484(0);
        class253.method1744((byte) 0);
        class255.method1752(-2327);
        class113.method849(-121);
        if (class172.field2634) {
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    private final void method917(byte arg0) {
        class47.field657 = 0;
        field1976++;
        while (class304.method2067(-1456) && class47.field657 < 128) {
            class13.field155[class47.field657] = class292.field4642;
            class250.field3786[class47.field657] = class77.field1219;
            class47.field657++;
        }
        class126.field2126++;
        if (class1.field17 != -1) {
            class218.method1521(class137.field2230, 0, 0, class1.field17, (byte) 115, 0, 0, class179.field2677);
        }
        class248.field3705++;
        if (class121.field1986 == 0) {
            class115.method863(-87);
        } else if (class126.field2127 == 0 && class291.field4629 == 0) {
            if (class119.field1931 == 2) {
                class247.method1700(-1024);
            } else {
                class293.method1992(true);
            }
            if ((class93.field1533 >> 7) < 14 || class93.field1533 >> 7 >= 90 || class260.field4024 >> 7 < 14 || (class260.field4024 >> 7) >= 90) {
                class226.method1566((byte) -124);
            }
        }
        int var2 = 29 % ((arg0 - 74) / 49);
        while (true) {
            class234 var3;
            class263 var4;
            class263 var5;
            do {
                var3 = (class234) class1.field11.method11(12);
                if (var3 == null) {
                    while (true) {
                        class234 var6;
                        class263 var7;
                        class263 var8;
                        do {
                            var6 = (class234) class133.field2183.method11(107);
                            if (var6 == null) {
                                while (true) {
                                    class234 var9;
                                    class263 var10;
                                    class263 var11;
                                    do {
                                        var9 = (class234) class304.field4923.method11(-122);
                                        if (var9 == null) {
                                            if (class306.field4945 != null) {
                                                class66.method495(true);
                                            }
                                            if (class5.field48 != null && class5.field48.field936 == 1) {
                                                if (class5.field48.field932 != null) {
                                                    class218.method1520(class75.field1178, 16, class256.field3875);
                                                }
                                                class256.field3875 = false;
                                                class5.field48 = null;
                                                class75.field1178 = null;
                                            }
                                            if ((class199.field2930 % 1500) == 0) {
                                                class44.method268(-8);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field3423;
                                        if (var10.field4145 < 0) {
                                            break;
                                        }
                                        var11 = class144.method1078(var10.field4202, 8534);
                                    } while (var11 == null || var11.field4143 == null || var10.field4145 >= var11.field4143.length || var11.field4143[var10.field4145] != var10);
                                    class224.method1557((byte) 90, var9);
                                }
                            }
                            var7 = var6.field3423;
                            if (var7.field4145 < 0) {
                                break;
                            }
                            var8 = class144.method1078(var7.field4202, 8534);
                        } while (var8 == null || var8.field4143 == null || var7.field4145 >= var8.field4143.length || var8.field4143[var7.field4145] != var7);
                        class224.method1557((byte) 58, var6);
                    }
                }
                var4 = var3.field3423;
                if (var4.field4145 < 0) {
                    break;
                }
                var5 = class144.method1078(var4.field4202, 8534);
            } while (var5 == null || var5.field4143 == null || var5.field4143.length <= var4.field4145 || var5.field4143[var4.field4145] != var4);
            class224.method1557((byte) 112, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method918(int arg0) {
        field1970++;
        if (class98.field1677 == 1000) {
            return;
        }
        long var2 = class280.method1939(true) / 1000000L - class185.field2765;
        class185.field2765 = class280.method1939(true) / 1000000L;
        boolean var4 = class200.method1410((byte) 59);
        if (var4 && class101.field1710 && class16.field170 != null) {
            class16.field170.method2005(56);
        }
        if ((class98.field1677 == 30 || class98.field1677 == 10) && (class302.field4887 || class143.field2319 != 0L && class3.method14(arg0 ^ 0x749C) > class143.field2319)) {
            class33.method212(class79.field1278, class149.field2388, class227.method1570(81), class302.field4887, 0);
        }
        if (class268.field4312 == null) {
            Container var5;
            if (class268.field4312 != null) {
                var5 = class268.field4312;
            } else if (class195.field2881 == null) {
                var5 = class273.field4426.field2020;
            } else {
                var5 = class195.field2881;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class195.field2881 == var5) {
                Insets var8 = class195.field2881.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class123.field2039 != var6 || class40.field536 != var7) {
                if (class122.field2011.startsWith("mac")) {
                    class123.field2039 = var6;
                    class40.field536 = var7;
                } else {
                    class25.method168((byte) 114);
                }
                class143.field2319 = class3.method14(arg0 + 29852) + 500L;
            }
        }
        if (arg0 != 1) {
            field1983 = null;
        }
        boolean var9 = false;
        if (class180.field2715) {
            var9 = true;
            class180.field2715 = false;
        }
        if (var9) {
            class264.method1821(-1);
        }
        if (class98.field1677 == 0) {
            class252.method1736(class194.field2863, var9, class232.field3412, (Color) null, 300);
        } else if (class98.field1677 == 5) {
            class120.method894(class208.field3084, false, 300);
        } else if (class98.field1677 == 10) {
            class62.method473(true);
        } else if (class98.field1677 == 25 || class98.field1677 == 28) {
            if (class52.field722 == 1) {
                if (class52.field714 < class226.field3323) {
                    class52.field714 = class226.field3323;
                }
                int var11 = (class52.field714 - class226.field3323) * 50 / class52.field714;
                class306.method2078(arg0 ^ 0xFFFFFFC1, class214.field3146 + "<br>(" + var11 + "%)", false);
            } else if (class52.field722 == 2) {
                if (class309.field4973 > class71.field1121) {
                    class71.field1121 = class309.field4973;
                }
                int var10 = (class71.field1121 - class309.field4973) * 50 / class71.field1121 + 50;
                class306.method2078(arg0 ^ 0xFFFFFFCF, class214.field3146 + "<br>(" + var10 + "%)", false);
            } else {
                class306.method2078(-120, class214.field3146, false);
            }
        } else if (class98.field1677 == 30) {
            class19.method129((byte) 123, var2);
        } else if (class98.field1677 == 40) {
            class306.method2078(arg0 ^ 0xFFFFFFBC, class275.field4458 + "<br>" + class240.field3529, false);
        }
        if ((class98.field1677 == 30 || class98.field1677 == 10) && class281.field4530 == 0 && !var9) {
            try {
                Graphics var14 = class12.field136.getGraphics();
                for (int var15 = 0; var15 < class64.field968; var15++) {
                    if (class91.field1468[var15]) {
                        class112.field1865.method180(class186.field2772[var15], class76.field1188[var15], class267.field4276[var15], 24259, class59.field873[var15], var14);
                        class91.field1468[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class12.field136.repaint();
            }
        } else if (class98.field1677 != 0) {
            try {
                Graphics var12 = class12.field136.getGraphics();
                class112.field1865.method178(0, var12, -128, 0);
                for (int var13 = 0; var13 < class64.field968; var13++) {
                    class91.field1468[var13] = false;
                }
            } catch (Exception var17) {
                class12.field136.repaint();
            }
        }
        if (class263.field4044) {
            class282.method1950(arg0 ^ 0x4);
        }
        if (class69.field1110 && class98.field1677 == 10 && class1.field17 != -1) {
            class69.field1110 = false;
            class89.method667(1, class273.field4426);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method919(int arg0) {
        field1974++;
        if (class98.field1677 == 1000) {
            return;
        }
        class199.field2930++;
        if ((class199.field2930 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class303.field4895 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class203.field2987.setSeed((long) class303.field4895);
        }
        this.method909((byte) -84);
        if (class304.field4927 != null) {
            class304.field4927.method146(104);
        }
        class53.method352(false);
        if (arg0 != -3036) {
            return;
        }
        class52.method316((byte) -77);
        class188.method1348(arg0 ^ 0xBFD);
        class6.method31(0);
        if (class82.field1324 != null) {
            int var3 = class82.field1324.method114(false);
            class201.field2956 = var3;
        }
        if (class98.field1677 == 0) {
            this.method905(30);
            class53.method372((byte) -114);
        } else if (class98.field1677 == 5) {
            this.method905(arg0 ^ 0xFFFFF43A);
            class53.method372((byte) -56);
        } else if (class98.field1677 == 25 || class98.field1677 == 28) {
            class237.method1632((byte) 96);
        }
        if (class98.field1677 == 10) {
            this.method917((byte) 124);
            class248.method1705(arg0 ^ 0xFFFFF464);
            class300.method2046((byte) 24);
            class211.method1483(arg0 + 3144);
        } else if (class98.field1677 == 30) {
            class137.method1037((byte) 120);
            return;
        } else if (class98.field1677 == 40) {
            class211.method1483(83);
            if (class256.field3878 != -3) {
                if (class256.field3878 == 15) {
                    class30.method190(-12914);
                } else if (class256.field3878 != 2) {
                    class115.method861(0);
                    return;
                }
                return;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1968[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1982 = "cyan:";
        field1983 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
    }
}
