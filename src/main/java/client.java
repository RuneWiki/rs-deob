import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class59 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1905 = 0;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
    public static boolean field1914;

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 9)
    private final void method946(int arg0) {
        if (!class36.field523) {
            label246: while (true) {
                do {
                    if (!class127.method933(true)) {
                        break label246;
                    }
                } while (class125.field1814 != 's' && class125.field1814 != 'S');
                class36.field523 = true;
            }
        }
        field1902++;
        if (class317.field5017 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class219.method1609(-898);
            if (class61.field900 == 0L) {
                class61.field900 = var28;
            }
            if (var27 > 16384 && (var28 - class61.field900) < 5000L) {
                if (var28 - class199.field3171 > 1000L) {
                    System.gc();
                    class199.field3171 = var28;
                }
                class83.field1134 = class199.field3170;
                class311.field4871 = 5;
            } else {
                class311.field4871 = 5;
                class317.field5017 = 10;
                class83.field1134 = class101.field1350;
            }
        } else if (class317.field5017 == 10) {
            class176.method1304(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class134.field1970[var2] = new class200(104, 104);
            }
            class311.field4871 = 10;
            class83.field1134 = class307.field4790;
            class317.field5017 = 30;
        } else if (class317.field5017 == 30) {
            if (class131.field1940 == null) {
                class131.field1940 = new class119(class147.field2322, class272.field4216);
            }
            if (class131.field1940.method852(-122)) {
                class145.field2293 = class230.method1664(true, (byte) 114, 0, false, true);
                class78.field1051 = class230.method1664(true, (byte) 114, 1, false, true);
                class160.field2542 = class230.method1664(true, (byte) 114, 2, true, false);
                class237.field3716 = class230.method1664(true, (byte) 114, 3, false, true);
                class18.field301 = class230.method1664(true, (byte) 114, 4, false, true);
                class290.field4476 = class230.method1664(true, (byte) 114, 5, true, true);
                class249.field3913 = class230.method1664(false, (byte) 114, 6, true, true);
                class171.field2826 = class230.method1664(true, (byte) 114, 7, false, true);
                class256.field4042 = class230.method1664(true, (byte) 114, 8, false, true);
                class119.field1657 = class230.method1664(true, (byte) 114, 9, false, true);
                class138.field2208 = class230.method1664(true, (byte) 114, 10, false, true);
                class175.field2873 = class230.method1664(true, (byte) 114, 11, false, true);
                class206.field3258 = class230.method1664(true, (byte) 114, 12, false, true);
                class18.field285 = class230.method1664(true, (byte) 114, 13, false, true);
                class198.field3162 = class230.method1664(false, (byte) 114, 14, false, true);
                class156.field2419 = class230.method1664(true, (byte) 114, 15, false, true);
                class128.field1888 = class230.method1664(true, (byte) 114, 16, false, true);
                class202.field3216 = class230.method1664(true, (byte) 114, 17, false, true);
                class205.field3249 = class230.method1664(true, (byte) 114, 18, false, true);
                class62.field915 = class230.method1664(true, (byte) 114, 19, false, true);
                class339.field5295 = class230.method1664(true, (byte) 114, 20, false, true);
                class237.field3719 = class230.method1664(true, (byte) 114, 21, false, true);
                class221.field3495 = class230.method1664(true, (byte) 114, 22, false, true);
                class23.field354 = class230.method1664(true, (byte) 114, 23, true, true);
                class4.field41 = class230.method1664(true, (byte) 114, 24, false, true);
                class286.field4425 = class230.method1664(true, (byte) 114, 25, false, true);
                class15.field255 = class230.method1664(true, (byte) 114, 26, true, true);
                class212.field3345 = class230.method1664(true, (byte) 114, 27, false, true);
                class205.field3251 = class230.method1664(true, (byte) 114, 28, true, true);
                class317.field5017 = 40;
                class83.field1134 = class141.field2243;
                class311.field4871 = 15;
            } else {
                class83.field1134 = class281.field4348;
                class311.field4871 = 12;
            }
        } else if (class317.field5017 == 40) {
            int var24 = 0;
            for (int var25 = 0; var25 < 29; var25++) {
                var24 += class18.field291[var25].method1687(arg0 ^ 0xFFFFDBDF) * class66.field938[var25] / 100;
            }
            if (var24 == 100) {
                class311.field4871 = 20;
                class83.field1134 = class310.field4818;
                class110.method789(class256.field4042, (byte) 31);
                class2.method10(class256.field4042, (byte) -126);
                class253.method1831(arg0 - 9287, class256.field4042);
                class317.field5017 = 41;
            } else {
                if (var24 != 0) {
                    class83.field1134 = class60.field892 + var24 + "%";
                }
                class311.field4871 = 20;
            }
        } else if (class317.field5017 == 41) {
            if (class205.field3251.method1821(-85)) {
                this.method954(class205.field3251.method1834(arg0 - 9415, 1), (byte) -68);
                class83.field1134 = class255.field4038;
                class311.field4871 = 25;
                class317.field5017 = 45;
            } else {
                class83.field1134 = class317.field5021 + class205.field3251.method1815(100) + "%";
                class311.field4871 = 25;
            }
        } else if (class317.field5017 == 45) {
            class322.method2272(2, arg0 - 9412, class86.field1164, 22050);
            class160.field2543 = new class159();
            class160.field2543.method1167(128, arg0 ^ 0x2447, 9);
            class97.field1278 = class146.method1077(0, class42.field581, class116.field1615, (byte) 114, 22050);
            class97.field1278.method1778(arg0 ^ 0xFFFF8DF1, class160.field2543);
            class304.method2107(class198.field3162, 0, class160.field2543, class156.field2419, class18.field301);
            class26.field388 = class146.method1077(1, class42.field581, class116.field1615, (byte) 96, 2048);
            class86.field1174 = new class178();
            class26.field388.method1778(-22090, class86.field1174);
            class120.field1671 = new class131(22050, class318.field5024);
            class281.field4350 = class249.field3913.method1808(-1, "scape main");
            class83.field1134 = class293.field4542;
            class311.field4871 = 30;
            class317.field5017 = 50;
        } else if (class317.field5017 == 50) {
            int var3 = class96.method681(67, class256.field4042, class18.field285);
            int var4 = class193.method1431((byte) -76);
            if (var3 >= var4) {
                class317.field5017 = 60;
                class311.field4871 = 35;
                class83.field1134 = class171.field2814;
            } else {
                class311.field4871 = 35;
                class83.field1134 = class4.field39 + var3 * 100 / var4 + "%";
            }
        } else if (class317.field5017 == 60) {
            int var22 = class111.method791(class256.field4042, 20636);
            int var23 = class99.method690((byte) -118);
            if (var23 <= var22) {
                class317.field5017 = 65;
                class311.field4871 = 40;
                class83.field1134 = class240.field3740;
            } else {
                class83.field1134 = class229.field3589 + var22 * 100 / var23 + "%";
                class311.field4871 = 40;
            }
        } else {
            if (arg0 != 9287) {
                method949((String) null, (Throwable) null, 113);
            }
            if (class317.field5017 == 65) {
                class128.method940(class18.field285, class256.field4042, 20372);
                class311.field4871 = 45;
                class83.field1134 = class150.field2353;
                class68.method538(arg0 ^ 0xFFFFDBE7, 5);
                class317.field5017 = 70;
            } else if (class317.field5017 == 70) {
                class160.field2542.method1821(-31);
                byte var10 = 0;
                int var11 = var10 + class160.field2542.method1815(100);
                class128.field1888.method1821(-52);
                int var12 = var11 + class128.field1888.method1815(arg0 ^ 0x2423);
                class202.field3216.method1821(-38);
                int var13 = var12 + class202.field3216.method1815(100);
                class205.field3249.method1821(-73);
                int var14 = var13 + class205.field3249.method1815(100);
                class62.field915.method1821(-48);
                int var15 = var14 + class62.field915.method1815(100);
                class339.field5295.method1821(arg0 ^ 0xFFFFDBF4);
                int var16 = var15 + class339.field5295.method1815(100);
                class237.field3719.method1821(-75);
                int var17 = var16 + class237.field3719.method1815(100);
                class221.field3495.method1821(-111);
                int var18 = var17 + class221.field3495.method1815(100);
                class4.field41.method1821(arg0 ^ 0xFFFFDBEC);
                int var19 = var18 + class4.field41.method1815(100);
                class286.field4425.method1821(arg0 - 9378);
                int var20 = var19 + class286.field4425.method1815(arg0 - 9187);
                class212.field3345.method1821(arg0 ^ 0xFFFFDB99);
                int var21 = var20 + class212.field3345.method1815(100);
                if (var21 >= 1100) {
                    class175.method1289(class160.field2542, arg0 ^ 0xFFFFDB81);
                    class230.method1665(class160.field2542, 4);
                    class102.method709(arg0 - 9233, class160.field2542);
                    class220.method1611(class160.field2542, class171.field2826, arg0 - 9288);
                    class55.method441(class171.field2826, class128.field1888, 30913, true);
                    class340.method2357(class205.field3249, class171.field2826, -15075);
                    class322.method2274(class62.field915, true, 73, class171.field2826, class272.field4220);
                    class156.method1127((byte) 100, class160.field2542);
                    class222.method1623(class339.field5295, class78.field1051, 65, class145.field2293);
                    class20.method205(arg0 ^ 0x2446, class160.field2542);
                    class91.method657(class171.field2826, 1943801096, class237.field3719);
                    class117.method829(class221.field3495, -92);
                    class26.method249((byte) 103, class160.field2542);
                    class251.method1799(class18.field285, class237.field3716, -3, class256.field4042, class171.field2826);
                    class121.method864(30, class160.field2542);
                    class14.method139(false, class202.field3216);
                    class42.method343(false, new class16(), class4.field41, class286.field4425);
                    class235.method1689(-1, class286.field4425, class4.field41);
                    class154.method1121(false, class160.field2542);
                    class42.method345(arg0 ^ 0xFFFFDBE4, class160.field2542);
                    class297.method2070((byte) -114, class160.field2542);
                    class307.method2122((byte) -9, class256.field4042, class160.field2542);
                    class304.method2106(class160.field2542, class256.field4042, -7508);
                    class83.field1134 = class224.field3545;
                    class311.field4871 = 50;
                    class248.method1787((byte) -120);
                    class317.field5017 = 80;
                } else {
                    class311.field4871 = 50;
                    class83.field1134 = class149.field2336 + var21 / 11 + "%";
                }
            } else if (class317.field5017 == 80) {
                int var8 = class304.method2108(3518, class256.field4042);
                int var9 = class65.method520((byte) 121);
                if (var9 <= var8) {
                    class202.method1499(class256.field4042, (byte) -121);
                    class317.field5017 = 90;
                    class83.field1134 = class33.field486;
                    class311.field4871 = 60;
                } else {
                    class311.field4871 = 60;
                    class83.field1134 = class214.field3384 + var8 * 100 / var9 + "%";
                }
            } else if (class317.field5017 == 90) {
                if (class15.field255.method1821(-109)) {
                    class57 var7 = new class57(class119.field1657, class15.field255, class256.field4042, 20, !class206.field3280);
                    class31.method295(var7);
                    if (class326.field5123 == 1) {
                        class31.method297(0.9F);
                    }
                    if (class326.field5123 == 2) {
                        class31.method297(0.8F);
                    }
                    if (class326.field5123 == 3) {
                        class31.method297(0.7F);
                    }
                    if (class326.field5123 == 4) {
                        class31.method297(0.6F);
                    }
                    class317.field5017 = 100;
                    class83.field1134 = class22.field333;
                    class311.field4871 = 70;
                } else {
                    class83.field1134 = class251.field3963 + class15.field255.method1815(100) + "%";
                    class311.field4871 = 70;
                }
            } else if (class317.field5017 == 100) {
                if (class62.method508(-100, class256.field4042)) {
                    class317.field5017 = 110;
                }
            } else if (class317.field5017 == 110) {
                class107.field1439 = new class175();
                class42.field581.method1014(class107.field1439, 6, 10);
                class317.field5017 = 120;
                class311.field4871 = 75;
                class83.field1134 = class71.field983;
            } else if (class317.field5017 == 120) {
                if (class138.field2208.method1809("", "huffman", 109)) {
                    class240 var5 = new class240(class138.field2208.method1836(0, "huffman", ""));
                    class333.method2320(var5, 9470);
                    class83.field1134 = class179.field2913;
                    class311.field4871 = 80;
                    class317.field5017 = 130;
                } else {
                    class311.field4871 = 80;
                    class83.field1134 = class77.field1042 + "0%";
                }
            } else if (class317.field5017 == 130) {
                if (!class237.field3716.method1821(arg0 - 9349)) {
                    class83.field1134 = class206.field3279 + class237.field3716.method1815(100) * 3 / 4 + "%";
                    class311.field4871 = 85;
                } else if (!class206.field3258.method1821(-48)) {
                    class83.field1134 = class206.field3279 + (class206.field3258.method1815(100) / 10 + 75) + "%";
                    class311.field4871 = 85;
                } else if (!class18.field285.method1821(-62)) {
                    class83.field1134 = class206.field3279 + ((class18.field285.method1815(100) / 20) + 85) + "%";
                    class311.field4871 = 85;
                } else if (class23.field354.method1822("details", true)) {
                    class60.method496((byte) 119, class199.field3186, class23.field354);
                    class299.method2078(class171.field2826);
                    class83.field1134 = class251.field3944;
                    class311.field4871 = 95;
                    class317.field5017 = 135;
                } else {
                    class83.field1134 = class206.field3279 + (class23.field354.method1824(true, "details") / 10 + 90) + "%";
                    class311.field4871 = 85;
                }
            } else if (class317.field5017 == 135) {
                int var6 = class225.method1657(0);
                if (var6 == -1) {
                    class311.field4871 = 95;
                    class83.field1134 = class131.field1941;
                } else if (var6 == 7 || var6 == 9) {
                    this.method488(arg0 - 9237, "worldlistfull");
                    class68.method538(-100, 1000);
                } else if (class123.field1766) {
                    class83.field1134 = class234.field3663;
                    class317.field5017 = 140;
                    class311.field4871 = 96;
                } else {
                    this.method488(108, "worldlistio_" + var6);
                    class68.method538(-98, 1000);
                }
            } else if (class317.field5017 == 140) {
                class6.field102 = class237.field3716.method1808(-1, "loginscreen");
                class290.field4476.method1820(arg0 ^ 0xFFFF9720, false, true);
                class249.field3913.method1820(arg0 - 28896, true, true);
                class256.field4042.method1820(-19609, true, true);
                class18.field285.method1820(arg0 ^ 0xFFFF9720, true, true);
                class138.field2208.method1820(-19609, true, true);
                class237.field3716.method1820(arg0 - 28896, true, true);
                class317.field5017 = 150;
                class311.field4871 = 97;
                class83.field1134 = class302.field4646;
                class337.field5257 = true;
            } else if (class317.field5017 == 150) {
                class148.method1091();
                if (class36.field523) {
                    class48.field635 = 0;
                    class196.field3127 = 0;
                    class101.field1351 = 0;
                    class232.field3630 = 0;
                }
                class36.field523 = true;
                class135.method985(class42.field581, -126);
                class308.method2132(false, (byte) 13, class232.field3630, -1, -1);
                class317.field5017 = 160;
                class83.field1134 = class326.field5119;
                class311.field4871 = 100;
            } else if (class317.field5017 == 160) {
                class169.method1271(-21431, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIII)Lfk;", line = 543)
    public static final class299 method947(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1904++;
        long var5 = (long) arg2 & 0xFFFFL | ((long) arg1 & 0xFFFFL) << 16 | ((long) arg4 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 48;
        class299 var7 = (class299) class138.field2203.method1351(var5, 63);
        if (var7 != null) {
            return var7;
        }
        if (arg0 >= -63) {
            method953((class136) null);
        }
        class191 var8 = class2.method8(1, arg2);
        class242[] var9 = null;
        if (var8.field3040 != null) {
            var9 = new class242[var8.field3040.length];
            for (int var10 = 0; var10 < var9.length; var10++) {
                class37 var11 = class150.method1100(-2823, var8.field3040[var10]);
                var9[var10] = new class242(var11.field532, var11.field537, var11.field534, var11.field536, var11.field529, var11.field539, var11.field533, var11.field540);
            }
        }
        class299 var12 = new class299(var8.field3048, var9, var8.field3050, arg3, arg4, arg1);
        class138.field2203.method1347(var12, var5, (byte) -105);
        return var12;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 585)
    public static final void method948(int arg0, byte arg1) {
        if (arg1 <= 29) {
            field1905 = -31;
        }
        class34 var2 = class91.method656(arg0, -2, 3);
        var2.method306(13);
        field1897++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 599)
    public static final void method949(String arg0, Throwable arg1, int arg2) {
        field1906++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class110.method785(arg1, 1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class335.method2328(arg2 ^ 0x7998, var3);
            String var4 = class332.method2310(":", "%3a", -1, var3);
            String var5 = class332.method2310("@", "%40", -1, var4);
            String var6 = class332.method2310("&", "%26", -1, var5);
            String var7 = class332.method2310("#", "%23", -1, var6);
            if (class80.field1090.field2181 == null) {
                return;
            }
            if (arg2 != 24) {
                field1905 = -126;
            }
            class114 var8 = class80.field1090.method1013(false, new URL(class80.field1090.field2181.getCodeBase(), "clienterror.ws?c=" + class55.field769 + "&u=" + class237.field3718 + "&v1=" + class137.field2192 + "&v2=" + class137.field2180 + "&e=" + var7));
            while (var8.field1595 == 0) {
                class272.method1918((byte) 22, 1L);
            }
            if (var8.field1595 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field1591;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 654)
    public static final void method950(int arg0, int arg1) {
        class179.field2911.method1353(~arg0, arg1);
        field1895++;
        class79.field1078.method1353(-1, arg1);
        class27.field395.method1353(~arg0, arg1);
        if (arg0 != 0) {
            field1905 = -97;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 667)
    public final void method489(int arg0) {
        field1913++;
        if (class105.field1388 == 1000) {
            return;
        }
        class229.field3595++;
        if (class229.field3595 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class291.field4506 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class33.field490.setSeed((long) class291.field4506);
        }
        this.method958(7);
        if (class131.field1940 != null) {
            class131.field1940.method858((byte) 97);
        }
        class6.method88(false);
        if (arg0 >= -110) {
            return;
        }
        class50.method373((byte) 102);
        class78.method581(true);
        class33.method302(true);
        if (class109.field1458) {
            class103.method712();
        }
        if (class205.field3248 != null) {
            int var3 = class205.field3248.method526(0);
            class195.field3118 = var3;
        }
        if (class105.field1388 == 0) {
            this.method946(9287);
            class231.method1667(-99);
        } else if (class105.field1388 == 5) {
            this.method946(9287);
            class231.method1667(-107);
        } else if (class105.field1388 == 25 || class105.field1388 == 28) {
            class261.method1875(101);
        }
        if (class105.field1388 == 10) {
            this.method957(1000);
            class124.method905(true);
            class246.method1771(2);
            class179.method1321(26063);
        } else if (class105.field1388 == 30) {
            class215.method1570(-20240);
        } else if (class105.field1388 == 40) {
            class179.method1321(26063);
            if (class91.field1216 != -3) {
                if (class91.field1216 == 15) {
                    class210.method1537((byte) -46);
                } else if (class91.field1216 != 2) {
                    class305.method2112((byte) -97);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lcd;)Lcd;", line = 763)
    public static final class136 method951(class136 arg0) {
        int var1 = method953(arg0).method921(92);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class14.method140(arg0.field2090, 1036508464);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 783)
    public static final void main(String[] arg0) {
        field1901++;
        try {
            if (arg0.length != 4) {
                class277.method1946("argument count", 93);
            }
            class26.field391 = Integer.parseInt(arg0[0]);
            class6.field109 = 2;
            if (arg0[1].equals("live")) {
                class107.field1430 = 0;
            } else if (arg0[1].equals("rc")) {
                class107.field1430 = 1;
            } else if (arg0[1].equals("wip")) {
                class107.field1430 = 2;
            } else {
                class277.method1946("modewhat", 98);
            }
            class62.field914 = false;
            class141.field2240 = class9.method123(arg0[2], 119);
            if (class141.field2240 == -1) {
                if (arg0[2].equals("english")) {
                    class141.field2240 = 0;
                } else if (arg0[2].equals("german")) {
                    class141.field2240 = 1;
                } else {
                    class277.method1946("language", 71);
                }
            }
            class212.method1545(class141.field2240, (byte) 80);
            class335.field5223 = false;
            class98.field1291 = false;
            if (arg0[3].equals("game0")) {
                class27.field409 = 0;
            } else if (arg0[3].equals("game1")) {
                class27.field409 = 1;
            } else {
                class277.method1946("game", 126);
            }
            class315.field4933 = "";
            class105.field1393 = 0;
            class211.field3321 = 0;
            class298.field4592 = false;
            client var1 = new client();
            class96.field1266 = var1;
            var1.method486(false, class107.field1430 + 32, 536, 29, "runescape", 1024, 768, true);
            class184.field2976.setLocation(40, 40);
        } catch (Exception var3) {
            method949((String) null, var3, 24);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lcd;)Z", line = 856)
    public static final boolean method952(class136 arg0) {
        if (class290.field4478) {
            if (method953(arg0).field1843 != 0) {
                return false;
            }
            if (arg0.field2063 == 0) {
                return false;
            }
        }
        return arg0.field2123;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 870)
    public final void method487(byte arg0) {
        if (arg0 != -49) {
            field1905 = -37;
        }
        field1896++;
        if (class105.field1388 == 1000) {
            return;
        }
        long var2 = class219.method1609(-898) - class146.field2306;
        class146.field2306 = class219.method1609(-898);
        boolean var4 = class345.method2383((byte) 106);
        if (var4 && class4.field43 && class97.field1278 != null) {
            class97.field1278.method1776((byte) 57);
        }
        if ((class105.field1388 == 30 || class105.field1388 == 10) && (class333.field5183 || class225.field3569 != 0L && class219.method1609(-898) > class225.field3569)) {
            class308.method2132(class333.field5183, (byte) 13, class113.method800((byte) -21), class180.field2926, class202.field3214);
        }
        if (class134.field1966 == null) {
            Container var5;
            if (class134.field1966 != null) {
                var5 = class134.field1966;
            } else if (class184.field2976 == null) {
                var5 = class42.field581.field2181;
            } else {
                var5 = class184.field2976;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class184.field2976 == var5) {
                Insets var8 = class184.field2976.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class287.field4434 != var6 || class333.field5181 != var7) {
                if (class137.field2193.startsWith("mac")) {
                    class287.field4434 = var6;
                    class333.field5181 = var7;
                } else {
                    class60.method495(arg0 ^ 0xFFFFFFBF);
                }
                class225.field3569 = class219.method1609(arg0 ^ 0x3B1) + 500L;
            }
        }
        if (class134.field1966 != null && !class230.field3596 && (class105.field1388 == 30 || class105.field1388 == 10)) {
            class308.method2132(false, (byte) 13, class232.field3630, -1, -1);
        }
        boolean var9 = false;
        if (class256.field4051) {
            class256.field4051 = false;
            var9 = true;
        }
        if (var9) {
            class271.method1915((byte) -110);
        }
        if (class109.field1458) {
            for (int var10 = 0; var10 < 100; var10++) {
                class231.field3607[var10] = true;
            }
        }
        if (class105.field1388 == 0) {
            class111.method792(104, class83.field1134, var9, (Color) null, class311.field4871);
        } else if (class105.field1388 == 5) {
            class192.method1418(class270.field4197, false, -9742);
        } else if (class105.field1388 == 10) {
            class294.method2045((byte) 23);
        } else if (class105.field1388 == 25 || class105.field1388 == 28) {
            if (class64.field929 == 1) {
                if (class10.field195 < class335.field5224) {
                    class10.field195 = class335.field5224;
                }
                int var12 = (class10.field195 - class335.field5224) * 50 / class10.field195;
                class36.method312((byte) 88, false, class126.field1819 + "<br>(" + var12 + "%)");
            } else if (class64.field929 == 2) {
                if (class145.field2285 < class46.field608) {
                    class145.field2285 = class46.field608;
                }
                int var11 = ((class145.field2285 - class46.field608) * 50 / class145.field2285) + 50;
                class36.method312((byte) 10, false, class126.field1819 + "<br>(" + var11 + "%)");
            } else {
                class36.method312((byte) 92, false, class126.field1819);
            }
        } else if (class105.field1388 == 30) {
            class61.method503(81, var2);
        } else if (class105.field1388 == 40) {
            class36.method312((byte) -88, false, class3.field30 + "<br>" + class60.field880);
        }
        if (class109.field1458 && class105.field1388 != 0) {
            class109.method775();
            for (int var13 = 0; var13 < class310.field4829; var13++) {
                class97.field1277[var13] = false;
            }
        } else if ((class105.field1388 == 30 || class105.field1388 == 10) && class193.field3081 == 0 && !var9) {
            try {
                Graphics var17 = class116.field1615.getGraphics();
                for (int var18 = 0; var18 < class310.field4829; var18++) {
                    if (class97.field1277[var18]) {
                        class42.field583.method514(var17, class170.field2798[var18], class164.field2660[var18], 0, class170.field2794[var18], class322.field5083[var18]);
                        class97.field1277[var18] = false;
                    }
                }
            } catch (Exception var20) {
                class116.field1615.repaint();
            }
        } else if (class105.field1388 != 0) {
            try {
                Graphics var14 = class116.field1615.getGraphics();
                class42.field583.method515(var14, 0, 0, arg0 - 29);
                for (int var15 = 0; var15 < class310.field4829; var15++) {
                    class97.field1277[var15] = false;
                }
            } catch (Exception var21) {
                class116.field1615.repaint();
            }
        }
        if (class337.field5257) {
            class310.method2148(36);
        }
        if (class36.field523 && class105.field1388 == 10 && class147.field2321 != -1) {
            class36.field523 = false;
            class135.method985(class42.field581, -106);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lcd;)Lsb;", line = 1095)
    public static final class127 method953(class136 arg0) {
        class127 var1 = (class127) class282.field4361.method2168(((long) arg0.field2069 << 32) + (long) arg0.field2086, (byte) -77);
        return var1 == null ? arg0.field2160 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 1104)
    public final void method477(byte arg0) {
        class50.method374(1251492294);
        class275.method1932(-126);
        class92.method669(26980);
        field1899++;
        class42.method340(false);
        class33.method301(0);
        class216.method1573((byte) 57);
        class59.method485(true);
        class109.method770();
        class26.method248(arg0 ^ 0x7E);
        class63.method511(true);
        class175.method1288(arg0 - 4508);
        class6.method56(-24673);
        class22.method223(-1);
        class310.method2145((byte) -116);
        class142.method1058(arg0 ^ 0x77);
        class119.method855((byte) 87);
        class235.method1685(true);
        class253.method1812(0);
        class29.method258(true);
        class180.method1326((byte) 95);
        class184.method1350((byte) -124);
        class212.method1542(arg0 ^ 0x76);
        class277.method1948(false);
        class200.method1479(1);
        class136.method1001(-111);
        class56.method443(false);
        class337.method2343(0);
        class5.method25((byte) -121);
        class311.method2156(true);
        class66.method523(-1);
        class32.method298(61);
        class306.method2120(76);
        class159.method1164(0);
        class246.method1764(true);
        class131.method969((byte) -112);
        class55.method435((byte) -116);
        class281.method1994(1009897296);
        class303.method2094((byte) 59);
        class124.method906(arg0 ^ 0xFFFFFF9C);
        class121.method872((byte) 101);
        class197.method1461((byte) 98);
        class161.method1200(arg0 - 42);
        class25.method238(true);
        class127.method925((byte) 117);
        class287.method2026((byte) 116);
        class315.method2195(-99);
        class141.method1054((byte) -121);
        class70.method549(-29273);
        class193.method1424((byte) -122);
        class11.method132(126);
        class229.method1662(false);
        class238.method1702(7400);
        class259.method1865((byte) -99);
        class48.method365(4);
        class64.method517(0);
        class273.method1920((byte) -107);
        class4.method14(-9356);
        class77.method575(arg0 + 16711817);
        class189.method1391();
        class231.method1666((byte) 114);
        class82.method600(-128);
        class163.method1211((byte) 78);
        class83.method605((byte) -121);
        class3.method11((byte) 60);
        class115.method817();
        class165.method1244();
        class120.method859((byte) -60);
        class217.method1596();
        class316.method2205((byte) -102);
        class53.method404();
        class52.method378(-5201);
        class304.method2105(0);
        class96.method680((byte) 101);
        class101.method702(-98);
        class103.method719();
        class28.method254();
        class241.method1720(arg0 ^ 0x7AED);
        class9.method125((byte) 103);
        class2.method7((byte) 117);
        class18.method196(0);
        class321.method2260();
        class65.method521(-16);
        class292.method2039(72);
        class118.method840();
        class98.method687((byte) -80);
        class206.method1522(128);
        class80.method591(true);
        class38.method322();
        class176.method1307();
        class79.method587(-9997);
        class69.method544(126);
        class199.method1467((byte) -104);
        class280.method1977();
        class78.method582(arg0 ^ 0xFFFFFFAD);
        class156.method1131(0);
        class58.method467(4095);
        class279.method1959(11958);
        class223.method1626(0);
        class10.method130((byte) -44);
        class61.method504(-10);
        class146.method1080(-92);
        class194.method1439(arg0 ^ 0xFFFFFFF6);
        class185.method1364(27649);
        class261.method1876(true);
        class95.method678(22);
        class107.method738((byte) 98);
        class234.method1680(0);
        class221.method1615(arg0 - 85);
        class1.method5(5);
        class299.method2080();
        class332.method2313(-5755);
        class224.method1643(-95);
        class318.method2233((byte) 16);
        class245.method1758((byte) 117);
        class191.method1413(-9145);
        class242.method1723();
        class37.method318((byte) 96);
        class243.method1745(-89);
        class251.method1803(102);
        class205.method1510((byte) -128);
        class57.method447(-117);
        class302.method2090(12909);
        class172.method1284(-125);
        class87.method628();
        class256.method1857(0);
        class31.method288();
        class240.method1716(88);
        class139.method1037(0);
        class328.method2302(127);
        class158.method1146(true);
        class187.method1377(false);
        class68.method539(128);
        class148.method1089();
        class254.method1845(4460);
        class88.method634();
        class183.method1344(24988);
        class36.method311((byte) 56);
        class214.method1566(76);
        class15.method142(false);
        class248.method1786(false);
        class247.method1782();
        class263.method1884(-512);
        class290.method2032(16775698);
        class102.method710(1);
        class283.method2006(arg0 ^ 0x1E);
        class138.method1030((byte) -87);
        class153.method1113(-110);
        class289.method2030();
        class276.method1937(-1);
        class314.method2190(127);
        class278.method1954((byte) -95);
        class331.method2309();
        class8.method105();
        class285.method2017();
        class270.method1911(true);
        class160.method1188(arg0 + 965450415);
        class90.method652();
        class122.method890();
        class313.method2182();
        class295.method2056((byte) 125);
        class147.method1081((byte) 94);
        class265.method1893(1024);
        class286.method2019(125);
        class34.method305(true);
        class111.method795(false);
        class166.method1248(0);
        class333.method2318(arg0 - 118);
        class336.method2333(-107);
        class312.method2176();
        class129.method943(-90);
        class322.method2275(1);
        class45.method357(119);
        class99.method691((byte) 114);
        class94.method675(20365);
        class81.method596(-13048);
        class207.method1524(arg0 + 8769);
        class128.method936(arg0 ^ 0xFFFFEC25);
        class244.method1750(115);
        class213.method1548(28986);
        class327.method2295(88);
        class125.method911(-9104);
        class76.method572((byte) 31);
        class271.method1913((byte) -76);
        class329.method2305(-126);
        class85.method619(-21864);
        class84.method610(13424);
        class338.method2352();
        class110.method784(256);
        class320.method2243(-59);
        class134.method981((byte) -94);
        class30.method271((byte) 124);
        class237.method1701(38);
        class67.method532();
        class262.method1881();
        class215.method1567(1);
        class274.method1927(124);
        class282.method1998(-1);
        class75.method566();
        class268.method1903();
        class267.method1901(19);
        class133.method977(42);
        class218.method1607();
        class168.method1251();
        class140.method1041();
        class113.method805(-105);
        class157.method1145((byte) -99);
        class326.method2292((byte) -45);
        class342.method2367(1);
        class225.method1653(98);
        class255.method1850(arg0 - 13380);
        class198.method1465(123);
        class284.method2013(2);
        class117.method833(97);
        class43.method346(-4);
        class91.method660(65);
        class291.method2037((byte) -54);
        class232.method1671((byte) 60);
        class269.method1908((byte) -103);
        class105.method725(-59);
        class308.method2129(-1);
        class39.method331(2047);
        class130.method964((byte) -92);
        class164.method1212(-73);
        class162.method1206((byte) -85);
        class150.method1098(-443007184);
        class145.method1074((byte) -91);
        class325.method2284(26631);
        class260.method1872(32594);
        class334.method2325((byte) -89);
        class344.method2377(arg0 - 70);
        class27.method252((byte) -65);
        class181.method1334(false);
        class343.method2371(arg0 - 10993);
        class204.method1502(1);
        class335.method2331(arg0 ^ 0xF);
        class171.method1279((byte) 44);
        class86.method622((byte) 107);
        class47.method360(54);
        class72.method559((byte) 83);
        class126.method920((byte) 52);
        class97.method685((byte) 33);
        class135.method983(-126);
        class20.method206(false);
        class220.method1613(false);
        class202.method1497(7);
        class249.method1791(-15318);
        class179.method1324(4);
        class272.method1917(13038);
        class339.method2356(23498);
        class7.method100(arg0 ^ 0x7F5B);
        class71.method551(-13);
        class60.method497(arg0 - 55);
        class149.method1095((byte) 53);
        class293.method2043(205);
        class341.method2362(-30523);
        class307.method2127(arg0 - 21);
        class167.method1249(arg0 ^ 0xFFFFFFBE);
        class297.method2073(6763);
        class257.method1860((byte) 28);
        class132.method973(arg0 ^ 0x77);
        class116.method824(false);
        class123.method901(arg0 + 17557);
        class41.method337(arg0 + 27951);
        class62.method509(3030);
        class23.method228(-1);
        class174.method1287((byte) 111);
        class317.method2225((byte) 116);
        class51.method376((byte) -99);
        class24.method231((byte) -103);
        class170.method1275((byte) -125);
        class210.method1536(0);
        class258.method1861((byte) 109);
        if (arg0 != 118) {
            this.method955(-24);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V", line = 1386)
    private final void method954(byte[] arg0, byte arg1) {
        field1910++;
        class6 var3 = new class6(arg0);
        if (arg1 != -68) {
            main((String[]) null);
        }
        while (true) {
            int var4 = var3.method58(-288140008);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                int[] var5 = class1.field6 = new int[6];
                var5[0] = var3.method39((byte) 100);
                var5[1] = var3.method39((byte) 58);
                var5[2] = var3.method39((byte) 127);
                var5[3] = var3.method39((byte) 85);
                var5[4] = var3.method39((byte) 38);
                var5[5] = var3.method39((byte) 107);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1430)
    public final void method482(int arg0) {
        field1900++;
        if (class109.field1458) {
            class109.method739();
        }
        if (class134.field1966 != null) {
            class144.method1070(class42.field581, -29642, class134.field1966);
            class134.field1966 = null;
        }
        if (class42.field581 != null) {
            class42.field581.method1019(6, this.getClass());
        }
        if (class107.field1439 != null) {
            class107.field1439.field2861 = false;
        }
        if (arg0 >= -9) {
            return;
        }
        class107.field1439 = null;
        if (class275.field4247 != null) {
            class275.field4247.method218(true);
            class275.field4247 = null;
        }
        class225.method1655(class116.field1615, (byte) 3);
        class139.method1033(990923265, class116.field1615);
        if (class205.field3248 != null) {
            class205.field3248.method524(class116.field1615, 64);
        }
        class24.method233(true);
        class240.method1715((byte) 10);
        class205.field3248 = null;
        if (class97.field1278 != null) {
            class97.field1278.method1766(256000);
        }
        if (class26.field388 != null) {
            class26.field388.method1766(256000);
        }
        class147.field2322.method2142((byte) 108);
        class272.field4216.method1062((byte) 79);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1482)
    private final void method955(int arg0) {
        if (arg0 != -13451) {
            field1905 = -91;
        }
        field1912++;
        if (class62.field908 < class147.field2322.field4838) {
            if (class334.field5197 == class277.field4286) {
                class277.field4286 = class21.field316;
            } else {
                class277.field4286 = class334.field5197;
            }
            class315.field4922 = (class147.field2322.field4838 * 50 - 50) * 5;
            if (class315.field4922 > 3000) {
                class315.field4922 = 3000;
            }
            if (class147.field2322.field4838 >= 2 && class147.field2322.field4839 == 6) {
                this.method488(-71, "js5connect_outofdate");
                class105.field1388 = 1000;
                return;
            }
            if (class147.field2322.field4838 >= 4 && class147.field2322.field4839 == -1) {
                this.method488(-128, "js5crc");
                class105.field1388 = 1000;
                return;
            }
            if (class147.field2322.field4838 >= 4 && (class105.field1388 == 0 || class105.field1388 == 5)) {
                if (class147.field2322.field4839 == 7 || class147.field2322.field4839 == 9) {
                    this.method488(arg0 + 13337, "js5connect_full");
                } else if (class147.field2322.field4839 <= 0) {
                    this.method488(-113, "js5io");
                } else {
                    this.method488(-110, "js5connect");
                }
                class105.field1388 = 1000;
                return;
            }
        }
        class62.field908 = class147.field2322.field4838;
        if (class315.field4922 > 0) {
            class315.field4922--;
            return;
        }
        try {
            if (class305.field4769 == 0) {
                class271.field4210 = class42.field581.method1011(class9.field170, class277.field4286, (byte) -8);
                class305.field4769++;
            }
            if (class305.field4769 == 1) {
                if (class271.field4210.field1595 == 2) {
                    this.method956((byte) -128, 1000);
                    return;
                }
                if (class271.field4210.field1595 == 1) {
                    class305.field4769++;
                }
            }
            if (class305.field4769 == 2) {
                class105.field1382 = new class22((Socket) class271.field4210.field1591, class42.field581);
                class6 var2 = new class6(5);
                var2.method81((byte) -110, 15);
                var2.method34(536, 294335144);
                class105.field1382.method221(arg0 + 13360, var2.field115, 0, 5);
                class305.field4769++;
                class221.field3504 = class219.method1609(-898);
            }
            if (class305.field4769 == 3) {
                if (class105.field1388 == 0 || class105.field1388 == 5 || class105.field1382.method217(arg0 + 43451) > 0) {
                    int var3 = class105.field1382.method214((byte) 83);
                    if (var3 != 0) {
                        this.method956((byte) -128, var3);
                        return;
                    }
                    class305.field4769++;
                } else if ((class219.method1609(arg0 + 12553) - class221.field3504) > 30000L) {
                    this.method956((byte) -128, 1001);
                    return;
                }
            }
            if (class305.field4769 == 4) {
                boolean var4 = class105.field1388 == 5 || class105.field1388 == 10 || class105.field1388 == 28;
                class147.field2322.method2147(124, !var4, class105.field1382);
                class105.field1382 = null;
                class305.field4769 = 0;
                class271.field4210 = null;
            }
        } catch (IOException var6) {
            this.method956((byte) -126, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 1629)
    private final void method956(byte arg0, int arg1) {
        class305.field4769 = 0;
        if (arg0 >= -125) {
            return;
        }
        class147.field2322.field4838++;
        class271.field4210 = null;
        field1909++;
        class105.field1382 = null;
        class147.field2322.field4839 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1644)
    private final void method957(int arg0) {
        class56.field775 = 0;
        field1907++;
        while (class127.method933(true) && class56.field775 < 128) {
            class258.field4073[class56.field775] = class243.field3799;
            class47.field619[class56.field775] = class125.field1814;
            class56.field775++;
        }
        class153.field2373++;
        if (class147.field2321 != -1) {
            class318.method2230(0, 0, 0, 0, arg0 - 1119, class147.field2321, class127.field1841, class95.field1258);
        }
        class220.field3487++;
        if (class109.field1458) {
            int var2 = 2359807;
            label193: for (int var3 = 0; var3 < 32768; var3++) {
                class212 var4 = class59.field870[var3];
                if (var4 != null) {
                    byte var5 = var4.field3346.field2551;
                    if ((var5 & 0x2) > 0 && var4.field4710 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4657[0] = 1;
                            var4.field4708[0] = (var4.field4698 >> 7) + var6;
                            var4.field4675[0] = (var4.field4731 >> 7) + var7;
                            class134.field1970[class154.field2392].method1474(var4.method2099((byte) 123), var4.field4698 >> 7, var4.field4731 >> 7, 0, (byte) 123, var4.method2099((byte) 123), false, false);
                            if (var4.field4708[0] >= 0 && var4.field4708[0] <= 104 - var4.method2099((byte) 123) && var4.field4675[0] >= 0 && var4.field4675[0] <= (104 - var4.method2099((byte) 123)) && class134.field1970[class154.field2392].method1480(var4.field4698 >> 7, var4.field4708[0], (byte) -44, var4.field4731 >> 7, var4.field4675[0])) {
                                if (var4.method2099((byte) 123) > 1) {
                                    for (int var8 = var4.field4708[0]; var8 < var4.field4708[0] + var4.method2099((byte) 123); var8++) {
                                        for (int var9 = var4.field4675[0]; var9 < var4.field4675[0] + var4.method2099((byte) 123); var9++) {
                                            if ((var2 & class134.field1970[class154.field2392].field3197[var8][var9]) != 0) {
                                                continue label193;
                                            }
                                        }
                                    }
                                }
                                var4.field4710 = 1;
                            }
                        }
                    }
                    class132.method975(var4, 128);
                    class274.method1926(var4, (byte) -15);
                    class212.method1543(var4, (byte) 67);
                    class134.field1970[class154.field2392].method1473(var4.method2099((byte) 123), false, var4.field4698 >> 7, var4.field4731 >> 7, false, var4.method2099((byte) 123), false);
                }
            }
        }
        if (!class109.field1458) {
            class269.method1907(28573);
        } else if (class124.field1797 == 0 && class52.field665 == 0) {
            if (class166.field2715 == 2) {
                class139.method1032(201);
            } else {
                class160.method1190(89);
            }
            if (class295.field4572 >> 7 < 14 || (class295.field4572 >> 7) >= 90 || (class317.field5018 >> 7) < 14 || class317.field5018 >> 7 >= 90) {
                class123.method902(true);
            }
        }
        while (true) {
            class15 var10;
            class136 var17;
            class136 var18;
            do {
                var10 = (class15) class50.field644.method24(0);
                if (var10 == null) {
                    while (true) {
                        class15 var11;
                        class136 var15;
                        class136 var16;
                        do {
                            var11 = (class15) class174.field2855.method24(0);
                            if (var11 == null) {
                                while (true) {
                                    class15 var12;
                                    class136 var13;
                                    class136 var14;
                                    do {
                                        var12 = (class15) class77.field1037.method24(0);
                                        if (var12 == null) {
                                            if (class56.field777 != null) {
                                                class311.method2166(2);
                                            }
                                            if (class91.field1213 != null && class91.field1213.field1595 == 1) {
                                                if (class91.field1213.field1591 != null) {
                                                    class136.method997(class127.field1852, class81.field1107, 0);
                                                }
                                                class91.field1213 = null;
                                                class127.field1852 = false;
                                                class81.field1107 = null;
                                            }
                                            if (arg0 != 1000) {
                                                return;
                                            }
                                            if (class229.field3595 % 1500 == 0) {
                                                class147.method1083(arg0 - 1044);
                                            }
                                            return;
                                        }
                                        var13 = var12.field248;
                                        if (var13.field2086 < 0) {
                                            break;
                                        }
                                        var14 = class14.method140(var13.field2090, arg0 + 1036507464);
                                    } while (var14 == null || var14.field2062 == null || var14.field2062.length <= var13.field2086 || var14.field2062[var13.field2086] != var13);
                                    class172.method1282(var12, (byte) 73);
                                }
                            }
                            var15 = var11.field248;
                            if (var15.field2086 < 0) {
                                break;
                            }
                            var16 = class14.method140(var15.field2090, 1036508464);
                        } while (var16 == null || var16.field2062 == null || var16.field2062.length <= var15.field2086 || var16.field2062[var15.field2086] != var15);
                        class172.method1282(var11, (byte) 73);
                    }
                }
                var17 = var10.field248;
                if (var17.field2086 < 0) {
                    break;
                }
                var18 = class14.method140(var17.field2090, 1036508464);
            } while (var18 == null || var18.field2062 == null || var18.field2062.length <= var17.field2086 || var18.field2062[var17.field2086] != var17);
            class172.method1282(var10, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1862)
    private final void method958(int arg0) {
        if (arg0 != 7) {
            this.method958(16);
        }
        field1911++;
        boolean var2 = class147.field2322.method2144(arg0 + 116);
        if (!var2) {
            this.method955(-13451);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1876)
    public final void method490(int arg0) {
        field1898++;
        class60.method495(116);
        class272.field4216 = new class142();
        class147.field2322 = new class310();
        if (class107.field1430 != 0) {
            class311.field4868 = new byte[50][];
        }
        class206.method1516(class42.field581, true);
        if (class6.field109 == 0) {
            class179.field2907 = this.getCodeBase().getHost();
            class233.field3636 = 443;
            class60.field893 = 43594;
        } else if (class6.field109 == 1) {
            class179.field2907 = this.getCodeBase().getHost();
            class233.field3636 = class26.field391 + 50000;
            class60.field893 = class26.field391 + 40000;
        } else if (class6.field109 == 2) {
            class179.field2907 = "127.0.0.1";
            class233.field3636 = class26.field391 + 50000;
            class60.field893 = class26.field391 + 40000;
        }
        class21.field316 = class233.field3636;
        if (class27.field409 == 1) {
            class191.field3044 = true;
            class48.field626 = class198.field3166;
            class128.field1859 = class5.field63;
            class115.field1597 = 16777215;
            class115.field1601 = 0;
            class320.field5049 = class105.field1390;
            class11.field197 = class18.field286;
        } else {
            class11.field197 = class187.field3015;
            class48.field626 = class180.field2920;
            class128.field1859 = class167.field2743;
            class320.field5049 = class66.field940;
        }
        class9.field170 = class179.field2907;
        class240.field3741 = class94.field1241 = class43.field584 = class308.field4802 = new short[256];
        if (class137.field2190 == 3 && class6.field109 != 2) {
            class271.field4209 = class26.field391;
        }
        class64.field928 = class60.field893;
        class334.field5197 = class60.field893;
        class277.field4286 = class64.field928;
        class129.method944((byte) -3);
        class241.method1721(90, class116.field1615);
        class183.method1342(class116.field1615, arg0 + 8901);
        class205.field3248 = class317.method2224(-119);
        if (class205.field3248 != null) {
            class205.field3248.method522(class116.field1615, (byte) 107);
        }
        class256.field4052 = class137.field2190;
        try {
            if (class42.field581.field2189 != null) {
                class255.field4031 = new class29(class42.field581.field2189, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class174.field2858[var2] = new class29(class42.field581.field2184[var2], 6000, 0);
                }
                class123.field1760 = new class29(class42.field581.field2188, 6000, 0);
                class274.field4239 = new class180(255, class255.field4031, class123.field1760, 500000);
                class2.field23 = new class29(class42.field581.field2185, 24, 0);
                class42.field581.field2184 = null;
                class42.field581.field2185 = null;
                class42.field581.field2189 = null;
                class42.field581.field2188 = null;
            }
        } catch (IOException var4) {
            class123.field1760 = null;
            class274.field4239 = null;
            class255.field4031 = null;
            class2.field23 = null;
        }
        class96.field1270 = class303.field4714;
        if (arg0 == 11 && class6.field109 != 0) {
            class306.field4782 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[I)[I", line = 1993)
    public static final int[] method959(byte arg0, int[] arg1) {
        field1903++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 86) {
            field1905 = 121;
        }
        int[] var2 = new int[arg1.length];
        class54.method424(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2010)
    public final void init() {
        field1894++;
        if (!this.method492(1)) {
            return;
        }
        class26.field391 = Integer.parseInt(this.getParameter("worldid"));
        class6.field109 = Integer.parseInt(this.getParameter("modewhere"));
        if (class6.field109 < 0 || class6.field109 > 1) {
            class6.field109 = 0;
        }
        class107.field1430 = Integer.parseInt(this.getParameter("modewhat"));
        if (class107.field1430 < 0 || class107.field1430 > 2) {
            class107.field1430 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class62.field914 = true;
        } else {
            class62.field914 = false;
        }
        try {
            class141.field2240 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class141.field2240 = 0;
        }
        class212.method1545(class141.field2240, (byte) 119);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class98.field1291 = true;
        } else {
            class98.field1291 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class335.field5223 = true;
        } else {
            class335.field5223 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class27.field409 = 1;
        } else {
            class27.field409 = 0;
        }
        try {
            class105.field1393 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class105.field1393 = 0;
        }
        class315.field4933 = this.getParameter("settings");
        if (class315.field4933 == null) {
            class315.field4933 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class211.field3321 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class211.field3321 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class298.field4592 = true;
        } else {
            class298.field4592 = false;
        }
        class96.field1266 = this;
        this.method479(class107.field1430 + 32, 1536, 503, 765, 59);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lcd;IIIIIII)V", line = 2095)
    public static final void method960(class136[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class136 var9 = arg0[var8];
            if (var9 != null && var9.field2090 == arg1 && (!var9.field2164 || var9.field2063 == 0 || var9.field2026 || method953(var9).field1843 != 0 || class130.field1929 == var9 || var9.field2038 == 1338) && (!var9.field2164 || !method952(var9))) {
                int var10 = var9.field2131 + arg6;
                int var11 = var9.field2111 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2063 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2137 + var10;
                    int var17 = var9.field2078 + var11;
                    if (var9.field2063 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class56.field777 == var9) {
                    class99.field1331 = true;
                    class157.field2436 = var10;
                    class291.field4508 = var11;
                }
                if (!var9.field2164 || var12 < var14 && var13 < var15) {
                    if (var9.field2063 == 0) {
                        if (!var9.field2164 && method952(var9) && class174.field2856 != var9) {
                            continue;
                        }
                        if (var9.field2148 && class25.field381 >= var12 && class82.field1129 >= var13 && class25.field381 < var14 && class82.field1129 < var15) {
                            for (class15 var18 = (class15) class77.field1037.method22((byte) 118); var18 != null; var18 = (class15) class77.field1037.method26((byte) -128)) {
                                if (var18.field253) {
                                    var18.method2028(13329);
                                    var18.field248.field2082 = false;
                                }
                            }
                            if (class172.field2828 == 0) {
                                class56.field777 = null;
                                class130.field1929 = null;
                            }
                            class294.field4548 = 0;
                        }
                    }
                    if (var9.field2164) {
                        boolean var19;
                        if (class25.field381 >= var12 && class82.field1129 >= var13 && class25.field381 < var14 && class82.field1129 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class183.field2971 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class193.field3076 == 1 && class205.field3256 >= var12 && class271.field4207 >= var13 && class205.field3256 < var14 && class271.field4207 < var15) {
                            var21 = true;
                        }
                        if (var9.field2153 != null) {
                            for (int var22 = 0; var22 < var9.field2153.length; var22++) {
                                if (class260.field4093[var9.field2153[var22]]) {
                                    if (var9.field2115 == null || class229.field3595 >= var9.field2115[var22]) {
                                        byte var23 = var9.field2106[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class260.field4093[86] && !class260.field4093[82] && !class260.field4093[81]) && ((var23 & 0x2) == 0 || class260.field4093[86]) && ((var23 & 0x1) == 0 || class260.field4093[82]) && ((var23 & 0x4) == 0 || class260.field4093[81])) {
                                            class202.method1501(-1, "", var22 + 1, var9.field2069, 7);
                                            int var24 = var9.field2113[var22];
                                            if (var9.field2115 == null) {
                                                var9.field2115 = new int[var9.field2153.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field2115[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field2115[var22] = class229.field3595 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field2115 != null) {
                                    var9.field2115[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class3.method12(false, var9, class271.field4207 - var11, class205.field3256 - var10);
                        }
                        if (class56.field777 != null && class56.field777 != var9 && var19 && method953(var9).method931(true)) {
                            class82.field1119 = var9;
                        }
                        if (class130.field1929 == var9) {
                            class3.field27 = true;
                            class150.field2357 = var10;
                            class20.field311 = var11;
                        }
                        if (var9.field2026 || var9.field2038 != 0) {
                            if (var19 && class195.field3118 != 0 && var9.field2141 != null) {
                                class15 var25 = new class15();
                                var25.field253 = true;
                                var25.field248 = var9;
                                var25.field261 = class195.field3118;
                                var25.field243 = var9.field2141;
                                class77.field1037.method19(var25, -1058);
                            }
                            if (class56.field777 != null || class175.field2864 != null || class238.field3729 || var9.field2038 != 1400 && class294.field4548 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2038 != 0) {
                                if (var9.field2038 == 1337) {
                                    class30.field450 = var9;
                                    continue;
                                }
                                if (var9.field2038 == 1338) {
                                    if (var21) {
                                        class184.field2975 = class205.field3256 - var10;
                                        class172.field2830 = class271.field4207 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2038 == 1400) {
                                    class261.field4101 = var9;
                                    if (var21) {
                                        if (class260.field4093[82] && field1905 > 0) {
                                            int var26 = (int) ((double) (class205.field3256 - var10 - var9.field2137 / 2) * 2.0D / (double) class163.field2650);
                                            int var27 = (int) ((double) (class271.field4207 - var11 - var9.field2078 / 2) * 2.0D / (double) class163.field2650);
                                            int var28 = class322.field5081 + var26;
                                            int var29 = class191.field3045 + var27;
                                            int var30 = class60.field885 + var28;
                                            int var31 = class340.field5301 + class4.field42 - var29 - 1;
                                            class294 var32 = class220.method1610((byte) -50);
                                            int[] var33 = var32.method2053(var31, (byte) 120, var30);
                                            if (var33 != null) {
                                                class269.method1906((byte) -56, var33[1], var33[2], var33[0]);
                                                class175.method1290(-112);
                                            }
                                            continue;
                                        }
                                        class294.field4548 = 1;
                                        class5.field62 = class25.field381;
                                        class18.field293 = class82.field1129;
                                        continue;
                                    }
                                    if (var20 && class294.field4548 > 0) {
                                        if (class294.field4548 == 1 && (class5.field62 != class25.field381 || class82.field1129 != class18.field293)) {
                                            class141.field2246 = class322.field5081;
                                            class123.field1763 = class191.field3045;
                                            class294.field4548 = 2;
                                        }
                                        if (class294.field4548 == 2) {
                                            class138.method1029(119, (int) ((double) (class5.field62 - class25.field381) * 2.0D / (double) class92.field1232) + class141.field2246);
                                            class107.method734((int) ((double) (class18.field293 - class82.field1129) * 2.0D / (double) class92.field1232) + class123.field1763, 30247);
                                        }
                                        continue;
                                    }
                                    class294.field4548 = 0;
                                    continue;
                                }
                                if (var9.field2038 == 1401) {
                                    if (var20) {
                                        class336.method2332(class25.field381 - var10, var9.field2078, var9.field2137, class82.field1129 - var11, true);
                                    }
                                    continue;
                                }
                                if (var9.field2038 == 1402) {
                                    if (!class109.field1458) {
                                        class167.method1250(var9, 412);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field2109 && var21) {
                                var9.field2109 = true;
                                if (var9.field1998 != null) {
                                    class15 var34 = new class15();
                                    var34.field253 = true;
                                    var34.field248 = var9;
                                    var34.field259 = class205.field3256 - var10;
                                    var34.field261 = class271.field4207 - var11;
                                    var34.field243 = var9.field1998;
                                    class77.field1037.method19(var34, -1058);
                                }
                            }
                            if (var9.field2109 && var20 && var9.field1994 != null) {
                                class15 var35 = new class15();
                                var35.field253 = true;
                                var35.field248 = var9;
                                var35.field259 = class25.field381 - var10;
                                var35.field261 = class82.field1129 - var11;
                                var35.field243 = var9.field1994;
                                class77.field1037.method19(var35, -1058);
                            }
                            if (var9.field2109 && !var20) {
                                var9.field2109 = false;
                                if (var9.field2058 != null) {
                                    class15 var36 = new class15();
                                    var36.field253 = true;
                                    var36.field248 = var9;
                                    var36.field259 = class25.field381 - var10;
                                    var36.field261 = class82.field1129 - var11;
                                    var36.field243 = var9.field2058;
                                    class174.field2855.method19(var36, -1058);
                                }
                            }
                            if (var20 && var9.field2014 != null) {
                                class15 var37 = new class15();
                                var37.field253 = true;
                                var37.field248 = var9;
                                var37.field259 = class25.field381 - var10;
                                var37.field261 = class82.field1129 - var11;
                                var37.field243 = var9.field2014;
                                class77.field1037.method19(var37, -1058);
                            }
                            if (!var9.field2082 && var19) {
                                var9.field2082 = true;
                                if (var9.field1993 != null) {
                                    class15 var38 = new class15();
                                    var38.field253 = true;
                                    var38.field248 = var9;
                                    var38.field259 = class25.field381 - var10;
                                    var38.field261 = class82.field1129 - var11;
                                    var38.field243 = var9.field1993;
                                    class77.field1037.method19(var38, -1058);
                                }
                            }
                            if (var9.field2082 && var19 && var9.field2042 != null) {
                                class15 var39 = new class15();
                                var39.field253 = true;
                                var39.field248 = var9;
                                var39.field259 = class25.field381 - var10;
                                var39.field261 = class82.field1129 - var11;
                                var39.field243 = var9.field2042;
                                class77.field1037.method19(var39, -1058);
                            }
                            if (var9.field2082 && !var19) {
                                var9.field2082 = false;
                                if (var9.field2073 != null) {
                                    class15 var40 = new class15();
                                    var40.field253 = true;
                                    var40.field248 = var9;
                                    var40.field259 = class25.field381 - var10;
                                    var40.field261 = class82.field1129 - var11;
                                    var40.field243 = var9.field2073;
                                    class174.field2855.method19(var40, -1058);
                                }
                            }
                            if (var9.field2059 != null) {
                                class15 var41 = new class15();
                                var41.field248 = var9;
                                var41.field243 = var9.field2059;
                                class50.field644.method19(var41, -1058);
                            }
                            if (var9.field2132 != null && class163.field2649 > var9.field2091) {
                                if (var9.field2138 == null || class163.field2649 - var9.field2091 > 32) {
                                    class15 var46 = new class15();
                                    var46.field248 = var9;
                                    var46.field243 = var9.field2132;
                                    class77.field1037.method19(var46, -1058);
                                } else {
                                    label575: for (int var42 = var9.field2091; var42 < class163.field2649; var42++) {
                                        int var43 = class91.field1212[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2138.length; var44++) {
                                            if (var9.field2138[var44] == var43) {
                                                class15 var45 = new class15();
                                                var45.field248 = var9;
                                                var45.field243 = var9.field2132;
                                                class77.field1037.method19(var45, -1058);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field2091 = class163.field2649;
                            }
                            if (var9.field2006 != null && class232.field3621 > var9.field2124) {
                                if (var9.field2116 == null || class232.field3621 - var9.field2124 > 32) {
                                    class15 var51 = new class15();
                                    var51.field248 = var9;
                                    var51.field243 = var9.field2006;
                                    class77.field1037.method19(var51, -1058);
                                } else {
                                    label551: for (int var47 = var9.field2124; var47 < class232.field3621; var47++) {
                                        int var48 = class174.field2850[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2116.length; var49++) {
                                            if (var9.field2116[var49] == var48) {
                                                class15 var50 = new class15();
                                                var50.field248 = var9;
                                                var50.field243 = var9.field2006;
                                                class77.field1037.method19(var50, -1058);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field2124 = class232.field3621;
                            }
                            if (var9.field2024 != null && class2.field21 > var9.field2039) {
                                if (var9.field2012 == null || class2.field21 - var9.field2039 > 32) {
                                    class15 var56 = new class15();
                                    var56.field248 = var9;
                                    var56.field243 = var9.field2024;
                                    class77.field1037.method19(var56, -1058);
                                } else {
                                    label527: for (int var52 = var9.field2039; var52 < class2.field21; var52++) {
                                        int var53 = class107.field1442[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2012.length; var54++) {
                                            if (var9.field2012[var54] == var53) {
                                                class15 var55 = new class15();
                                                var55.field248 = var9;
                                                var55.field243 = var9.field2024;
                                                class77.field1037.method19(var55, -1058);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field2039 = class2.field21;
                            }
                            if (var9.field2016 != null && class170.field2804 > var9.field2049) {
                                if (var9.field2028 == null || class170.field2804 - var9.field2049 > 32) {
                                    class15 var61 = new class15();
                                    var61.field248 = var9;
                                    var61.field243 = var9.field2016;
                                    class77.field1037.method19(var61, -1058);
                                } else {
                                    label503: for (int var57 = var9.field2049; var57 < class170.field2804; var57++) {
                                        int var58 = class334.field5200[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2028.length; var59++) {
                                            if (var9.field2028[var59] == var58) {
                                                class15 var60 = new class15();
                                                var60.field248 = var9;
                                                var60.field243 = var9.field2016;
                                                class77.field1037.method19(var60, -1058);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field2049 = class170.field2804;
                            }
                            if (var9.field2030 != null && class333.field5193 > var9.field2163) {
                                if (var9.field2170 == null || class333.field5193 - var9.field2163 > 32) {
                                    class15 var66 = new class15();
                                    var66.field248 = var9;
                                    var66.field243 = var9.field2030;
                                    class77.field1037.method19(var66, -1058);
                                } else {
                                    label479: for (int var62 = var9.field2163; var62 < class333.field5193; var62++) {
                                        int var63 = class311.field4855[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field2170.length; var64++) {
                                            if (var9.field2170[var64] == var63) {
                                                class15 var65 = new class15();
                                                var65.field248 = var9;
                                                var65.field243 = var9.field2030;
                                                class77.field1037.method19(var65, -1058);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field2163 = class333.field5193;
                            }
                            if (class229.field3594 > var9.field2107 && var9.field2023 != null) {
                                class15 var67 = new class15();
                                var67.field248 = var9;
                                var67.field243 = var9.field2023;
                                class77.field1037.method19(var67, -1058);
                            }
                            if (class294.field4555 > var9.field2107 && var9.field2047 != null) {
                                class15 var68 = new class15();
                                var68.field248 = var9;
                                var68.field243 = var9.field2047;
                                class77.field1037.method19(var68, -1058);
                            }
                            if (class27.field407 > var9.field2107 && var9.field2034 != null) {
                                class15 var69 = new class15();
                                var69.field248 = var9;
                                var69.field243 = var9.field2034;
                                class77.field1037.method19(var69, -1058);
                            }
                            if (class251.field3955 > var9.field2107 && var9.field2092 != null) {
                                class15 var70 = new class15();
                                var70.field248 = var9;
                                var70.field243 = var9.field2092;
                                class77.field1037.method19(var70, -1058);
                            }
                            if (class43.field591 > var9.field2107 && var9.field2171 != null) {
                                class15 var71 = new class15();
                                var71.field248 = var9;
                                var71.field243 = var9.field2171;
                                class77.field1037.method19(var71, -1058);
                            }
                            var9.field2107 = class220.field3487;
                            if (var9.field2099 != null) {
                                for (int var72 = 0; var72 < class56.field775; var72++) {
                                    class15 var73 = new class15();
                                    var73.field248 = var9;
                                    var73.field245 = class258.field4073[var72];
                                    var73.field260 = class47.field619[var72];
                                    var73.field243 = var9.field2099;
                                    class77.field1037.method19(var73, -1058);
                                }
                            }
                            if (class69.field965 && var9.field2010 != null) {
                                class15 var74 = new class15();
                                var74.field248 = var9;
                                var74.field243 = var9.field2010;
                                class77.field1037.method19(var74, -1058);
                            }
                        }
                    }
                    if (!var9.field2164 && class56.field777 == null && class175.field2864 == null && !class238.field3729) {
                        if ((var9.field2053 >= 0 || var9.field2125 != 0) && class25.field381 >= var12 && class82.field1129 >= var13 && class25.field381 < var14 && class82.field1129 < var15) {
                            if (var9.field2053 >= 0) {
                                class174.field2856 = arg0[var9.field2053];
                            } else {
                                class174.field2856 = var9;
                            }
                        }
                        if (var9.field2063 == 8 && class25.field381 >= var12 && class82.field1129 >= var13 && class25.field381 < var14 && class82.field1129 < var15) {
                            class62.field917 = var9;
                        }
                        if (var9.field2007 > var9.field2078) {
                            class153.method1115(var9.field2137 + var10, var9, class25.field381, var11, false, var9.field2007, class82.field1129, var9.field2078);
                        }
                    }
                    if (var9.field2063 == 0) {
                        method960(arg0, var9.field2069, var12, var13, var14, var15, var10 - var9.field2129, var11 - var9.field2018);
                        if (var9.field2062 != null) {
                            method960(var9.field2062, var9.field2069, var12, var13, var14, var15, var10 - var9.field2129, var11 - var9.field2018);
                        }
                        class25 var75 = (class25) class210.field3304.method2168((long) var9.field2069, (byte) -99);
                        if (var75 != null) {
                            class318.method2230(var12, var13, var10, var11, -125, var75.field376, var14, var15);
                        }
                    }
                }
            }
        }
    }
}
