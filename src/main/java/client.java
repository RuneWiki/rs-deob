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
public class client extends class37 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Z")
    public static volatile boolean field722 = true;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Ltb;")
    public static class220 field718;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Ldb;")
    public static class43 field725;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
    public static boolean field738;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 4)
    public static void method383(int arg0) {
        field725 = null;
        field718 = null;
        if (arg0 != 15) {
            method390((class166) null, -19);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 17)
    private final void method384(byte arg0) {
        class312.field4844 = 0;
        field730++;
        while (class297.method2014(-21525) && class312.field4844 < 128) {
            class242.field3872[class312.field4844] = class323.field5038;
            class292.field4542[class312.field4844] = class181.field2730;
            class312.field4844++;
        }
        class34.field518++;
        if (class331.field5160 != -1) {
            class90.method651(class331.field5160, 0, -64, class188.field2816, 0, 0, class322.field5024, 0);
        }
        class291.field4524++;
        if (class94.field1516) {
            int var2 = 2359807;
            label194: for (int var3 = 0; var3 < 32768; var3++) {
                class313 var4 = class254.field3989[var3];
                if (var4 != null) {
                    byte var5 = var4.field4859.field3134;
                    if ((var5 & 0x2) > 0 && var4.field1918 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1910[0] = (var4.field1905 >> 7) + var6;
                            var4.field1903[0] = 1;
                            var4.field1938[0] = (var4.field1868 >> 7) + var7;
                            class224.field3570[class205.field3101].method2065(var4.method280(false), (byte) 103, false, var4.method280(false), 0, var4.field1905 >> 7, false, var4.field1868 >> 7);
                            if (var4.field1910[0] >= 0 && var4.field1910[0] <= 104 - var4.method280(false) && var4.field1938[0] >= 0 && var4.field1938[0] <= (104 - var4.method280(false)) && class224.field3570[class205.field3101].method2062(var4.field1910[0], 65536, var4.field1938[0], var4.field1905 >> 7, var4.field1868 >> 7)) {
                                if (var4.method280(false) > 1) {
                                    for (int var8 = var4.field1910[0]; var4.field1910[0] + var4.method280(false) > var8; var8++) {
                                        for (int var9 = var4.field1938[0]; var4.field1938[0] + var4.method280(false) > var9; var9++) {
                                            if ((class224.field3570[class205.field3101].field4732[var8][var9] & var2) != 0) {
                                                continue label194;
                                            }
                                        }
                                    }
                                }
                                var4.field1918 = 1;
                            }
                        }
                    }
                    class76.method557(0, var4);
                    class193.method1376(2047, var4);
                    class201.method1436(var4, -61);
                    class224.field3570[class205.field3101].method2063(-3, var4.method280(false), var4.field1868 >> 7, var4.field1905 >> 7, false, false, var4.method280(false));
                }
            }
        }
        if (!class94.field1516) {
            class297.method2018((byte) 117);
        } else if (class34.field509 == 0 && class233.field3705 == 0) {
            if (class178.field2692 == 2) {
                class290.method1988(97);
            } else {
                class116.method857(-59);
            }
            if (class337.field5278 >> 7 < 14 || class337.field5278 >> 7 >= 90 || (class265.field4116 >> 7) < 14 || class265.field4116 >> 7 >= 90) {
                class247.method1700(-11814);
            }
        }
        while (true) {
            class240 var10;
            class220 var11;
            class220 var12;
            do {
                var10 = (class240) class23.field376.method633(-1);
                if (var10 == null) {
                    while (true) {
                        class240 var13;
                        class220 var18;
                        class220 var19;
                        do {
                            var13 = (class240) class206.field3128.method633(-1);
                            if (var13 == null) {
                                while (true) {
                                    class240 var14;
                                    class220 var16;
                                    class220 var17;
                                    do {
                                        var14 = (class240) class26.field403.method633(-1);
                                        if (var14 == null) {
                                            if (class222.field3537 != null) {
                                                class342.method2366(-3);
                                            }
                                            if (class139.field2171 != null && class139.field2171.field2956 == 1) {
                                                if (class139.field2171.field2959 != null) {
                                                    class231.method1629(class190.field2856, (byte) 127, class210.field3212);
                                                }
                                                class210.field3212 = false;
                                                class139.field2171 = null;
                                                class190.field2856 = null;
                                            }
                                            if (class227.field3618 % 1500 == 0) {
                                                class240.method1668((byte) 106);
                                            }
                                            int var15 = 59 % ((-arg0 - 13) / 55);
                                            return;
                                        }
                                        var16 = var14.field3834;
                                        if (var16.field3383 < 0) {
                                            break;
                                        }
                                        var17 = class68.method524((byte) -85, var16.field3393);
                                    } while (var17 == null || var17.field3472 == null || var16.field3383 >= var17.field3472.length || var17.field3472[var16.field3383] != var16);
                                    class336.method2337(var14, (byte) -71);
                                }
                            }
                            var18 = var13.field3834;
                            if (var18.field3383 < 0) {
                                break;
                            }
                            var19 = class68.method524((byte) -111, var18.field3393);
                        } while (var19 == null || var19.field3472 == null || var19.field3472.length <= var18.field3383 || var19.field3472[var18.field3383] != var18);
                        class336.method2337(var13, (byte) -71);
                    }
                }
                var11 = var10.field3834;
                if (var11.field3383 < 0) {
                    break;
                }
                var12 = class68.method524((byte) -121, var11.field3393);
            } while (var12 == null || var12.field3472 == null || var12.field3472.length <= var11.field3383 || var12.field3472[var11.field3383] != var11);
            class336.method2337(var10, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 235)
    private final void method385(int arg0) {
        field731++;
        if (class231.field3662 < class339.field5299.field74) {
            if (class25.field393 == class103.field1596) {
                class103.field1596 = class258.field4044;
            } else {
                class103.field1596 = class25.field393;
            }
            class171.field2597 = (class339.field5299.field74 * 50 - 50) * 5;
            if (class171.field2597 > 3000) {
                class171.field2597 = 3000;
            }
            if (class339.field5299.field74 >= 2 && class339.field5299.field73 == 6) {
                this.method301("js5connect_outofdate", 31261);
                class131.field2052 = 1000;
                return;
            }
            if (class339.field5299.field74 >= 4 && class339.field5299.field73 == -1) {
                this.method301("js5crc", 31261);
                class131.field2052 = 1000;
                return;
            }
            if (class339.field5299.field74 >= 4 && (class131.field2052 == 0 || class131.field2052 == 5)) {
                if (class339.field5299.field73 == 7 || class339.field5299.field73 == 9) {
                    this.method301("js5connect_full", 31261);
                } else if (class339.field5299.field73 > 0) {
                    this.method301("js5connect", 31261);
                } else {
                    this.method301("js5io", 31261);
                }
                class131.field2052 = 1000;
                return;
            }
        }
        class231.field3662 = class339.field5299.field74;
        if (class171.field2597 > 0) {
            class171.field2597--;
            return;
        }
        try {
            if (arg0 != 16190) {
                field722 = false;
            }
            if (class224.field3556 == 0) {
                class189.field2832 = class32.field471.method1286(class103.field1596, class227.field3602, 123);
                class224.field3556++;
            }
            if (class224.field3556 == 1) {
                if (class189.field2832.field2956 == 2) {
                    this.method395(1000, arg0 - 16084);
                    return;
                }
                if (class189.field2832.field2956 == 1) {
                    class224.field3556++;
                }
            }
            if (class224.field3556 == 2) {
                class222.field3540 = new class43((Socket) class189.field2832.field2959, class32.field471);
                class166 var2 = new class166(5);
                var2.method1132((byte) 29, 15);
                var2.method1174((byte) -32, 539);
                class222.field3540.method370(arg0 ^ 0x3F3F, var2.field2500, 0, 5);
                class224.field3556++;
                class335.field5249 = class102.method743((byte) 115);
            }
            if (class224.field3556 == 3) {
                if (class131.field2052 == 0 || class131.field2052 == 5 || class222.field3540.method366(arg0 - 16116) > 0) {
                    int var3 = class222.field3540.method373(arg0 - 16290);
                    if (var3 != 0) {
                        this.method395(var3, 104);
                        return;
                    }
                    class224.field3556++;
                } else if (class102.method743((byte) 106) - class335.field5249 > 30000L) {
                    this.method395(1001, 103);
                    return;
                }
            }
            if (class224.field3556 == 4) {
                boolean var4 = class131.field2052 == 5 || class131.field2052 == 10 || class131.field2052 == 28;
                class339.field5299.method29(class222.field3540, 0, !var4);
                class189.field2832 = null;
                class222.field3540 = null;
                class224.field3556 = 0;
            }
        } catch (IOException var6) {
            this.method395(1002, 127);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 380)
    public final void method302(byte arg0) {
        if (class94.field1516) {
            class94.method700();
        }
        if (class195.field2917 != null) {
            class335.method2331((byte) -101, class32.field471, class195.field2917);
            class195.field2917 = null;
        }
        if (class32.field471 != null) {
            class32.field471.method1292(true, this.getClass());
        }
        field737++;
        if (class20.field276 != null) {
            class20.field276.field270 = false;
        }
        class20.field276 = null;
        if (class295.field4568 != null) {
            class295.field4568.method365(1);
            class295.field4568 = null;
        }
        class132.method946(65280, class238.field3782);
        class199.method1414(class238.field3782, false);
        if (class344.field5340 != null) {
            class344.field5340.method69(class238.field3782, -1);
        }
        class254.method1751(arg0 + 181);
        class345.method2383(100);
        class344.field5340 = null;
        if (class315.field4917 != null) {
            class315.field4917.method219(arg0 + 218);
        }
        if (class17.field243 != null) {
            class17.field243.method219(arg0 ^ 0xFFFFFFEE);
        }
        class339.field5299.method25(92);
        if (arg0 != -104) {
            method383(-71);
        }
        class152.field2287.method1370(-2);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltb;)Z", line = 431)
    public static final boolean method386(class220 arg0) {
        if (class175.field2653) {
            if (method393(arg0).field2403 != 0) {
                return false;
            }
            if (arg0.field3468 == 0) {
                return false;
            }
        }
        return arg0.field3496;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 447)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class92.method657((byte) -4, "argument count");
            }
            class171.field2609 = Integer.parseInt(arg0[0]);
            class60.field967 = 2;
            if (arg0[1].equals("live")) {
                class308.field4780 = 0;
            } else if (arg0[1].equals("rc")) {
                class308.field4780 = 1;
            } else if (arg0[1].equals("wip")) {
                class308.field4780 = 2;
            } else {
                class92.method657((byte) -4, "modewhat");
            }
            class19.field259 = false;
            class195.field2920 = class228.method1616(arg0[2], -27002);
            if (class195.field2920 == -1) {
                if (arg0[2].equals("english")) {
                    class195.field2920 = 0;
                } else if (arg0[2].equals("german")) {
                    class195.field2920 = 1;
                } else {
                    class92.method657((byte) -4, "language");
                }
            }
            class119.method877(1, class195.field2920);
            class284.field4400 = false;
            class296.field4571 = false;
            if (arg0[3].equals("game0")) {
                class288.field4491 = 0;
            } else if (arg0[3].equals("game1")) {
                class288.field4491 = 1;
            } else {
                class92.method657((byte) -4, "game");
            }
            class178.field2694 = 0;
            class233.field3708 = 0;
            class194.field2909 = false;
            class120.field1827 = "";
            client var1 = new client();
            class317.field4958 = var1;
            var1.method315(539, 768, 29, false, 109, "runescape", class308.field4780 + 32, 1024);
            class92.field1464.setLocation(40, 40);
        } catch (Exception var3) {
            class184.method1322(var3, (String) null, (byte) -24);
        }
        field734++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 515)
    public final void init() {
        field720++;
        if (!this.method312(-49)) {
            return;
        }
        class171.field2609 = Integer.parseInt(this.getParameter("worldid"));
        class60.field967 = Integer.parseInt(this.getParameter("modewhere"));
        if (class60.field967 < 0 || class60.field967 > 1) {
            class60.field967 = 0;
        }
        class308.field4780 = Integer.parseInt(this.getParameter("modewhat"));
        if (class308.field4780 < 0 || class308.field4780 > 2) {
            class308.field4780 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class19.field259 = true;
        } else {
            class19.field259 = false;
        }
        try {
            class195.field2920 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class195.field2920 = 0;
        }
        class119.method877(1, class195.field2920);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class284.field4400 = true;
        } else {
            class284.field4400 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class296.field4571 = true;
        } else {
            class296.field4571 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class288.field4491 = 1;
        } else {
            class288.field4491 = 0;
        }
        try {
            class233.field3708 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class233.field3708 = 0;
        }
        class120.field1827 = this.getParameter("settings");
        if (class120.field1827 == null) {
            class120.field1827 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class178.field2694 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class178.field2694 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class194.field2909 = true;
        } else {
            class194.field2909 = false;
        }
        class317.field4958 = this;
        this.method311(-122, 1539, 765, class308.field4780 + 32, 503);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 597)
    private final void method387(int arg0) {
        if (!class55.field925) {
            label248: while (true) {
                do {
                    if (!class297.method2014(-21525)) {
                        break label248;
                    }
                } while (class181.field2730 != 's' && class181.field2730 != 'S');
                class55.field925 = true;
            }
        }
        field728++;
        if (class247.field3915 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class102.method743((byte) 80);
            if (class205.field3090 == 0L) {
                class205.field3090 = var4;
            }
            if (var3 > 16384 && (var4 - class205.field3090) < 5000L) {
                if ((var4 - class263.field4088) > 1000L) {
                    System.gc();
                    class263.field4088 = var4;
                }
                class341.field5321 = class222.field3541;
                class289.field4505 = 5;
            } else {
                class341.field5321 = class63.field1001;
                class247.field3915 = 10;
                class289.field4505 = 5;
            }
        } else if (class247.field3915 == 10) {
            class183.method1304(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class224.field3570[var6] = new class303(104, 104);
            }
            class341.field5321 = class119.field1821;
            class247.field3915 = 30;
            class289.field4505 = 10;
        } else {
            if (arg0 < 125) {
                field736 = -80;
            }
            if (class247.field3915 == 30) {
                if (class322.field5022 == null) {
                    class322.field5022 = new class35(class339.field5299, class152.field2287);
                }
                if (class322.field5022.method295((byte) -60)) {
                    class91.field1446 = class106.method769(true, true, (byte) -114, false, 0);
                    class227.field3603 = class106.method769(true, true, (byte) 105, false, 1);
                    class227.field3601 = class106.method769(true, false, (byte) 120, true, 2);
                    class101.field1585 = class106.method769(true, true, (byte) 61, false, 3);
                    class104.field1615 = class106.method769(true, true, (byte) -75, false, 4);
                    class225.field3575 = class106.method769(true, true, (byte) 127, true, 5);
                    class192.field2872 = class106.method769(false, true, (byte) 119, true, 6);
                    class298.field4597 = class106.method769(true, true, (byte) -97, false, 7);
                    class186.field2788 = class106.method769(true, true, (byte) -69, false, 8);
                    class291.field4527 = class106.method769(true, true, (byte) 100, false, 9);
                    class295.field4561 = class106.method769(true, true, (byte) -66, false, 10);
                    class60.field974 = class106.method769(true, true, (byte) 56, false, 11);
                    class62.field996 = class106.method769(true, true, (byte) -74, false, 12);
                    class142.field2190 = class106.method769(true, true, (byte) -115, false, 13);
                    class200.field3006 = class106.method769(false, true, (byte) 82, false, 14);
                    class317.field4954 = class106.method769(true, true, (byte) -76, false, 15);
                    class60.field972 = class106.method769(true, true, (byte) -126, false, 16);
                    class141.field2188 = class106.method769(true, true, (byte) -102, false, 17);
                    class223.field3543 = class106.method769(true, true, (byte) 68, false, 18);
                    class181.field2727 = class106.method769(true, true, (byte) -91, false, 19);
                    class11.field171 = class106.method769(true, true, (byte) 106, false, 20);
                    class332.field5166 = class106.method769(true, true, (byte) 107, false, 21);
                    class105.field1625 = class106.method769(true, true, (byte) 104, false, 22);
                    class162.field2432 = class106.method769(true, true, (byte) -86, true, 23);
                    class284.field4408 = class106.method769(true, true, (byte) 104, false, 24);
                    class48.field787 = class106.method769(true, true, (byte) -114, false, 25);
                    class285.field4467 = class106.method769(true, true, (byte) 125, true, 26);
                    class152.field2286 = class106.method769(true, true, (byte) -108, false, 27);
                    class120.field1841 = class106.method769(true, true, (byte) -88, true, 28);
                    class289.field4505 = 15;
                    class247.field3915 = 40;
                    class341.field5321 = class73.field1205;
                } else {
                    class341.field5321 = class175.field2659;
                    class289.field4505 = 12;
                }
            } else if (class247.field3915 == 40) {
                int var28 = 0;
                for (int var29 = 0; var29 < 29; var29++) {
                    var28 += class235.field3753[var29].method776((byte) -32) * class317.field4951[var29] / 100;
                }
                if (var28 == 100) {
                    class289.field4505 = 20;
                    class341.field5321 = class308.field4779;
                    class37.method305((byte) 127, class186.field2788);
                    class179.method1274(class186.field2788, false);
                    class332.method2303(class186.field2788, 23);
                    class247.field3915 = 41;
                } else {
                    if (var28 != 0) {
                        class341.field5321 = class200.field3003 + var28 + "%";
                    }
                    class289.field4505 = 20;
                }
            } else if (class247.field3915 == 41) {
                if (class120.field1841.method967(0)) {
                    this.method394(class120.field1841.method969(true, 1), (byte) -110);
                    class341.field5321 = class222.field3539;
                    class247.field3915 = 45;
                    class289.field4505 = 25;
                } else {
                    class341.field5321 = class62.field995 + class120.field1841.method976(0) + "%";
                    class289.field4505 = 25;
                }
            } else if (class247.field3915 == 45) {
                class278.method1910(22050, class188.field2815, -28160, 2);
                class272.field4224 = new class284();
                class272.field4224.method1964((byte) -32, 128, 9);
                class315.field4917 = class251.method1740(22050, class238.field3782, 42, class32.field471, 0);
                class315.field4917.method221(95, class272.field4224);
                class92.method661(class104.field1615, class200.field3006, (byte) 88, class317.field4954, class272.field4224);
                class17.field243 = class251.method1740(2048, class238.field3782, -100, class32.field471, 1);
                class98.field1560 = new class271();
                class17.field243.method221(111, class98.field1560);
                class91.field1459 = new class309(22050, class220.field3413);
                class165.field2476 = class192.field2872.method970("scape main", (byte) -10);
                class341.field5321 = class289.field4510;
                class247.field3915 = 50;
                class289.field4505 = 30;
            } else if (class247.field3915 == 50) {
                int var26 = class34.method283(19, class142.field2190, class186.field2788);
                int var27 = class187.method1338(false);
                if (var27 <= var26) {
                    class341.field5321 = class279.field4302;
                    class247.field3915 = 60;
                    class289.field4505 = 35;
                } else {
                    class341.field5321 = class228.field3625 + var26 * 100 / var27 + "%";
                    class289.field4505 = 35;
                }
            } else if (class247.field3915 == 60) {
                int var24 = class232.method1633(class186.field2788, -19813);
                int var25 = class153.method1057(2);
                if (var25 > var24) {
                    class341.field5321 = class201.field3020 + var24 * 100 / var25 + "%";
                    class289.field4505 = 40;
                } else {
                    class341.field5321 = class153.field2309;
                    class289.field4505 = 40;
                    class247.field3915 = 65;
                }
            } else if (class247.field3915 == 65) {
                class134.method984(class186.field2788, true, class142.field2190);
                class341.field5321 = class267.field4169;
                class289.field4505 = 45;
                class88.method640(5, (byte) 49);
                class247.field3915 = 70;
            } else if (class247.field3915 == 70) {
                class227.field3601.method967(0);
                byte var7 = 0;
                int var8 = var7 + class227.field3601.method976(0);
                class60.field972.method967(0);
                int var9 = var8 + class60.field972.method976(0);
                class141.field2188.method967(0);
                int var10 = var9 + class141.field2188.method976(0);
                class223.field3543.method967(0);
                int var11 = var10 + class223.field3543.method976(0);
                class181.field2727.method967(0);
                int var12 = var11 + class181.field2727.method976(0);
                class11.field171.method967(0);
                int var13 = var12 + class11.field171.method976(0);
                class332.field5166.method967(0);
                int var14 = var13 + class332.field5166.method976(0);
                class105.field1625.method967(0);
                int var15 = var14 + class105.field1625.method976(0);
                class284.field4408.method967(0);
                int var16 = var15 + class284.field4408.method976(0);
                class48.field787.method967(0);
                int var17 = var16 + class48.field787.method976(0);
                class152.field2286.method967(0);
                int var18 = var17 + class152.field2286.method976(0);
                if (var18 < 1100) {
                    class289.field4505 = 50;
                    class341.field5321 = class128.field2022 + var18 / 11 + "%";
                } else {
                    class137.method996(29874, class227.field3601);
                    class55.method446(class227.field3601, 126);
                    class16.method133(1, class227.field3601);
                    class125.method905(class227.field3601, (byte) -5, class298.field4597);
                    class116.method854((byte) 108, class298.field4597, true, class60.field972);
                    class241.method1675(0, class298.field4597, class223.field3543);
                    class264.method1801(class298.field4597, -15596, class336.field5262, class181.field2727, true);
                    class60.method477(class227.field3601, (byte) -80);
                    class194.method1385(255, class11.field171, class91.field1446, class227.field3603);
                    class325.method2205(-123, class227.field3601);
                    class108.method796(class332.field5166, class298.field4597, -6869);
                    class260.method1776(class105.field1625, -32768);
                    class206.method1466(class227.field3601, (byte) -119);
                    class247.method1698(class186.field2788, class298.field4597, class101.field1585, 18161, class142.field2190);
                    class275.method1888(class227.field3601, -3546);
                    class68.method522((byte) 107, class141.field2188);
                    class185.method1327((byte) 107, class48.field787, class284.field4408, new class141());
                    class240.method1667(class48.field787, class284.field4408, true);
                    class336.method2335(class227.field3601, (byte) -54);
                    class268.method1848((byte) 83, class227.field3601);
                    class65.method493(class227.field3601, -42);
                    class118.method870(0, class227.field3601, class186.field2788);
                    class282.method1932((byte) -5, class227.field3601, class186.field2788);
                    class289.field4505 = 50;
                    class341.field5321 = class175.field2654;
                    class316.method2153((byte) -60);
                    class247.field3915 = 80;
                }
            } else if (class247.field3915 == 80) {
                int var19 = class67.method520(class186.field2788, 32767);
                int var20 = class178.method1270(15);
                if (var19 < var20) {
                    class341.field5321 = class90.field1438 + var19 * 100 / var20 + "%";
                    class289.field4505 = 60;
                } else {
                    class322.method2191(-19605, class186.field2788);
                    class289.field4505 = 60;
                    class247.field3915 = 90;
                    class341.field5321 = class318.field4974;
                }
            } else if (class247.field3915 == 90) {
                if (class285.field4467.method967(0)) {
                    class315 var23 = new class315(class291.field4527, class285.field4467, class186.field2788, 20, !class59.field962);
                    class15.method117(var23);
                    if (class289.field4507 == 1) {
                        class15.method108(0.9F);
                    }
                    if (class289.field4507 == 2) {
                        class15.method108(0.8F);
                    }
                    if (class289.field4507 == 3) {
                        class15.method108(0.7F);
                    }
                    if (class289.field4507 == 4) {
                        class15.method108(0.6F);
                    }
                    class341.field5321 = class165.field2475;
                    class247.field3915 = 100;
                    class289.field4505 = 70;
                } else {
                    class341.field5321 = class220.field3518 + class285.field4467.method976(0) + "%";
                    class289.field4505 = 70;
                }
            } else if (class247.field3915 == 100) {
                if (class333.method2312(class186.field2788, (byte) -119)) {
                    class247.field3915 = 110;
                }
            } else if (class247.field3915 == 110) {
                class20.field276 = new class20();
                class32.field471.method1291(10, 24229, class20.field276);
                class341.field5321 = class242.field3866;
                class289.field4505 = 75;
                class247.field3915 = 120;
            } else if (class247.field3915 == 120) {
                if (class295.field4561.method958((byte) -113, "huffman", "")) {
                    class150 var21 = new class150(class295.field4561.method959((byte) -23, "huffman", ""));
                    class268.method1851(var21, 7467);
                    class289.field4505 = 80;
                    class341.field5321 = class232.field3681;
                    class247.field3915 = 130;
                } else {
                    class341.field5321 = class260.field4074 + "0%";
                    class289.field4505 = 80;
                }
            } else if (class247.field3915 == 130) {
                if (!class101.field1585.method967(0)) {
                    class341.field5321 = class118.field1812 + class101.field1585.method976(0) * 3 / 4 + "%";
                    class289.field4505 = 85;
                } else if (!class62.field996.method967(0)) {
                    class341.field5321 = class118.field1812 + ((class62.field996.method976(0) / 10) + 75) + "%";
                    class289.field4505 = 85;
                } else if (!class142.field2190.method967(0)) {
                    class341.field5321 = class118.field1812 + (class142.field2190.method976(0) / 20 + 85) + "%";
                    class289.field4505 = 85;
                } else if (class162.field2432.method962((byte) -71, "details")) {
                    class273.method1880(class176.field2666, class162.field2432, (byte) 48);
                    class45.method400(class298.field4597);
                    class289.field4505 = 95;
                    class247.field3915 = 135;
                    class341.field5321 = class105.field1624;
                } else {
                    class341.field5321 = class118.field1812 + (class162.field2432.method961(0, "details") / 10 + 90) + "%";
                    class289.field4505 = 85;
                }
            } else if (class247.field3915 == 135) {
                int var22 = class238.method1660((byte) 58);
                if (var22 == -1) {
                    class341.field5321 = class133.field2117;
                    class289.field4505 = 95;
                } else if (var22 == 7 || var22 == 9) {
                    this.method301("worldlistfull", 31261);
                    class88.method640(1000, (byte) 49);
                } else if (class47.field774) {
                    class247.field3915 = 140;
                    class289.field4505 = 96;
                    class341.field5321 = class91.field1452;
                } else {
                    this.method301("worldlistio_" + var22, 31261);
                    class88.method640(1000, (byte) 49);
                }
            } else if (class247.field3915 == 140) {
                class313.field4850 = class101.field1585.method970("loginscreen", (byte) -10);
                class225.field3575.method975(0, false, true);
                class192.field2872.method975(0, true, true);
                class186.field2788.method975(0, true, true);
                class142.field2190.method975(0, true, true);
                class295.field4561.method975(0, true, true);
                class101.field1585.method975(0, true, true);
                class313.field4848 = true;
                class289.field4505 = 97;
                class341.field5321 = class29.field420;
                class247.field3915 = 150;
            } else if (class247.field3915 == 150) {
                class334.method2324();
                if (class55.field925) {
                    class322.field5029 = 0;
                    class181.field2734 = 0;
                    class89.field1422 = 0;
                    class331.field5144 = 0;
                }
                class55.field925 = true;
                class331.method2300((byte) -106, class32.field471);
                class289.method1985(-1, false, 83, class322.field5029, -1);
                class289.field4505 = 100;
                class247.field3915 = 160;
                class341.field5321 = class154.field2314;
            } else if (class247.field3915 == 160) {
                class203.method1441(1, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltb;)Ltb;", line = 1124)
    public static final class220 method388(class220 arg0) {
        int var1 = method393(arg0).method1093(-2093898926);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class68.method524((byte) -120, arg0.field3393);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZIII)V", line = 1145)
    public static final void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field723++;
        if (!arg6) {
            return;
        }
        if (arg1 == arg8 && arg2 == arg7 && arg5 == arg9 && arg3 == arg4) {
            class285.method1976(arg8, arg7, arg4, arg5, arg0, 84);
            return;
        }
        int var10 = arg8;
        int var11 = arg7;
        int var12 = arg8 * 3;
        int var13 = arg7 * 3;
        int var14 = arg2 * 3;
        int var15 = arg1 * 3;
        int var16 = arg3 * 3;
        int var17 = arg4 + var14 - var16 - arg7;
        int var18 = arg9 * 3;
        int var19 = var16 - var14 - (-var13 + var14);
        int var20 = var15 - var12;
        int var21 = var18 + var12 - var15 - var15;
        int var22 = var14 - var13;
        int var23 = var15 + arg5 - arg8 - var18;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var23 * var26;
            int var28 = var17 * var26;
            int var29 = var20 * var24;
            int var30 = var19 * var25;
            int var31 = var21 * var25;
            int var32 = var22 * var24;
            int var33 = arg7 + (var28 + var32 + var30 >> 12);
            int var34 = (var27 + var31 + var29 >> 12) + arg8;
            class285.method1976(var10, var11, var33, var34, arg0, 93);
            var11 = var33;
            var10 = var34;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkh;I)V", line = 1222)
    public static final void method390(class166 arg0, int arg1) {
        field721++;
        int var2 = arg0.method1145(128);
        if (arg1 > -96) {
            method393((class220) null);
        }
        class97.field1539 = new class152[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class97.field1539[var3] = new class152();
            class97.field1539[var3].field2292 = arg0.method1145(128);
            class97.field1539[var3].field2283 = arg0.method1184(0);
        }
        class323.field5043 = arg0.method1145(128);
        class327.field5090 = arg0.method1145(128);
        class95.field1525 = arg0.method1145(128);
        class237.field3780 = new class341[class327.field5090 + 1 - class323.field5043];
        for (int var4 = 0; var4 < class95.field1525; var4++) {
            int var5 = arg0.method1145(128);
            class341 var6 = class237.field3780[var5] = new class341();
            var6.field459 = arg0.method1178(0);
            var6.field462 = arg0.method1137(-98);
            var6.field5319 = class323.field5043 + var5;
            var6.field5315 = arg0.method1184(0);
            var6.field5320 = arg0.method1184(0);
        }
        class208.field3186 = arg0.method1137(77);
        class47.field774 = true;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1271)
    private final void method391(byte arg0) {
        field729++;
        boolean var2 = class339.field5299.method33(53);
        if (!var2) {
            this.method385(16190);
        }
        int var3 = 23 % ((-arg0 - 45) / 41);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1294)
    public final void method306(byte arg0) {
        method383(15);
        class54.method445(239811558);
        field733++;
        class300.method2048(9171);
        class285.method1977(8);
        class186.method1330(63);
        class294.method2004(-93);
        class275.method1887((byte) 109);
        class37.method304(-117);
        class94.method697();
        class88.method641(40);
        class207.method1477((byte) 21);
        class20.method153(-46);
        class235.method1654(false);
        class166.method1126(127);
        class43.method375((byte) -107);
        class5.method31((byte) 99);
        class192.method1368(10);
        class35.method294(-14259);
        class107.method773(0);
        class133.method950(27692);
        class326.method2214((byte) 101);
        class314.method2128((byte) 120);
        class320.method2184(-7274);
        class104.method755(108);
        class303.method2071(116);
        class220.method1566(20522);
        class12.method90((byte) 118);
        class270.method1862((byte) -45);
        class170.method1220(31224);
        class187.method1340(-1598287201);
        class188.method1343(3);
        class284.method1951(true);
        class189.method1349(true);
        class281.method1926(-118);
        class123.method896((byte) -88);
        class142.method1014(14);
        class85.method597(5008);
        class241.method1674(-68);
        class206.method1462(42);
        class61.method479(-1);
        class160.method1081(-1);
        class46.method404(false);
        class225.method1598((byte) -32);
        class201.method1429((byte) 116);
        class75.method550((byte) -52);
        class111.method829(1);
        class292.method1995((byte) -95);
        class218.method1542(false);
        class202.method1438((byte) 90);
        class60.method474((byte) 75);
        class184.method1324(72);
        class276.method1894((byte) 85);
        class99.method732(-93);
        class80.method576(true);
        class277.method1904();
        class18.method142(100);
        class47.method413((byte) -51);
        class136.method990(116);
        class298.method2021(-93);
        class129.method933((byte) 73);
        class250.method1737();
        class185.method1325(18669);
        class42.method348();
        class121.method883(-244);
        class21.method176();
        class299.method2043(-107);
        class66.method499();
        class307.method2096((byte) 91);
        class224.method1585(74);
        class337.method2341(-125);
        class198.method1408();
        class283.method1934();
        class161.method1099((byte) -64);
        class108.method793((byte) -109);
        class106.method768(126);
        class252.method1745((byte) -123);
        class329.method2241();
        class125.method902(-7900);
        class132.method943((byte) -23);
        class215.method1517();
        class308.method2103(1048575);
        class156.method1068((byte) -128);
        class126.method915();
        class183.method1317();
        class204.method1448(255);
        class178.method1268(true);
        class216.method1525(-28);
        class154.method1059((byte) 31);
        class317.method2157(2);
        class109.method798();
        class195.method1390(126);
        class105.method764((byte) -125);
        class177.method1261((byte) -106);
        class199.method1413(0);
        class53.method442((byte) 121);
        class257.method1761((byte) -83);
        class179.method1272(1);
        class50.method423(-84);
        class200.method1428(125);
        class7.method60(0);
        class112.method830(-16216);
        class247.method1697((byte) -66);
        class333.method2318(0);
        class265.method1810((byte) -55);
        class190.method1358(-25177);
        class332.method2306(230);
        class45.method397();
        class31.method259(100);
        class70.method533((byte) -128);
        class141.method1011(81);
        class212.method1492((byte) -27);
        class280.method1916(30141);
        class266.method1825();
        class97.method720(-128);
        class194.method1382(false);
        class55.method451((byte) 90);
        class264.method1802((byte) 106);
        class315.method2136(75);
        class148.method1030(-108);
        class304.method2074(-1308);
        class248.method1704();
        class73.method546((byte) 92);
        class15.method118();
        class150.method1038((byte) 83);
        class134.method987(true);
        class222.method1578((byte) -71);
        class278.method1909((byte) -83);
        class341.method2362(-124);
        class152.method1054(0);
        class334.method2322();
        class51.method430(200);
        class319.method2167();
        class181.method1298((byte) -102);
        class191.method1363(3967);
        class289.method1986((byte) -98);
        class240.method1669(true);
        class253.method1746(115);
        class127.method918();
        class26.method239((byte) -39);
        class282.method1933(false);
        class103.method749(-10082);
        class228.method1614(-29);
        class279.method1914((byte) 111);
        class34.method281((byte) -8);
        class325.method2206((byte) 93);
        class157.method1071();
        class71.method537((byte) 44);
        class165.method1116(true);
        class311.method2116();
        class6.method39();
        class302.method2059();
        class259.method1774(75);
        class345.method2384((byte) -20);
        class151.method1040();
        class167.method1198();
        class114.method842();
        class267.method1833(-127);
        class344.method2381((byte) -91);
        class321.method2188(-122);
        class65.method494(true);
        class338.method2343(-114);
        class137.method993(-1);
        class239.method1666(-1);
        class17.method140(-1);
        if (arg0 > -80) {
            field722 = false;
        }
        class217.method1533(true);
        class8.method65();
        class62.method482(-5689);
        class10.method77(-112);
        class158.method1078(1);
        class327.method2216((byte) -122);
        class91.method652(true);
        class128.method927(0);
        class233.method1638(22155);
        class173.method1249((byte) 49);
        class295.method2008((byte) -122);
        class256.method1757(10192);
        class116.method855(1);
        class89.method644(35);
        class118.method872(255);
        class90.method650(120);
        class120.method880(31379);
        class254.method1750((byte) -43);
        class139.method1005((byte) 58);
        class38.method324();
        class52.method433(true);
        class39.method327(14);
        class48.method415(0);
        class193.method1375((byte) -75);
        class291.method1993((byte) 106);
        class13.method99();
        class144.method1023();
        class214.method1502((byte) -96);
        class268.method1853((byte) 117);
        class117.method862(60);
        class203.method1439(false);
        class56.method455();
        class140.method1007();
        class182.method1300((byte) -87);
        class245.method1694();
        class11.method88(-11082);
        class196.method1397();
        class243.method1687();
        class331.method2296((byte) -33);
        class227.method1605((byte) -76);
        class335.method2329((byte) 114);
        class162.method1102(-32204);
        class163.method1108(-1);
        class242.method1679(-20959);
        class110.method823(-76);
        class234.method1648(16711680);
        class322.method2193((byte) -118);
        class32.method270(-15697);
        class297.method2017((byte) 122);
        class16.method132(1);
        class229.method1622(31172);
        class176.method1260(98);
        class263.method1794(-62);
        class226.method1599(4386);
        class78.method569(8202);
        class306.method2095(false);
        class101.method738(0);
        class316.method2150((byte) 127);
        class237.method1659(-28481);
        class130.method936(4096);
        class260.method1775(false);
        class258.method1768(true);
        class77.method565(3421);
        class63.method487(true);
        class251.method1742(-87);
        class273.method1878((byte) -42);
        class171.method1236((byte) -21);
        class208.method1478(111);
        class205.method1452((byte) -71);
        class41.method333((byte) 113);
        class339.method2358(-125);
        class95.method711(0);
        class149.method1034((byte) -114);
        class290.method1991(112);
        class67.method515(0);
        class19.method144((byte) -86);
        class213.method1499(-382808628);
        class68.method523((byte) 15);
        class310.method2113(true);
        class44.method378((byte) 34);
        class29.method253((byte) -60);
        class232.method1634(1871015462);
        class23.method226(39);
        class83.method589((byte) -70);
        class174.method1252(-1);
        class238.method1663(47);
        class219.method1548((byte) -126);
        class318.method2161(-77);
        class288.method1982(0);
        class96.method716(13213);
        class98.method728(-23629);
        class92.method662((byte) -21);
        class175.method1256(-97);
        class342.method2369(-94);
        class84.method592(true);
        class272.method1872(true);
        class115.method853((byte) -62);
        class119.method878((byte) 25);
        class143.method1019(false);
        class223.method1582(-99);
        class30.method255(true);
        class131.method939(true);
        class336.method2333(-19152);
        class1.method1((byte) -49);
        class244.method1692(false);
        class153.method1055(2);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 1575)
    public static final void method392(byte arg0, int arg1) {
        if (arg0 <= 109) {
            field722 = false;
        }
        field735++;
        class338 var2 = class195.method1391(7, (byte) -92, arg1);
        var2.method2347(true);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1589)
    public final void method308(int arg0) {
        field726++;
        if (arg0 <= 39) {
            return;
        }
        class230.method1623((byte) 77);
        class152.field2287 = new class192();
        class339.field5299 = new class5();
        if (class308.field4780 != 0) {
            class188.field2812 = new byte[50][];
        }
        class84.method591(class32.field471, (byte) 94);
        if (class60.field967 == 0) {
            class315.field4910 = this.getCodeBase().getHost();
            class258.field4045 = 443;
            class50.field813 = 43594;
        } else if (class60.field967 == 1) {
            class315.field4910 = this.getCodeBase().getHost();
            class50.field813 = class171.field2609 + 40000;
            class258.field4045 = class171.field2609 + 50000;
        } else if (class60.field967 == 2) {
            class50.field813 = class171.field2609 + 40000;
            class258.field4045 = class171.field2609 + 50000;
            class315.field4910 = "127.0.0.1";
        }
        class25.field393 = class50.field813;
        class106.field1648 = class50.field813;
        class258.field4044 = class258.field4045;
        class103.field1596 = class106.field1648;
        if (class180.field2718 == 3 && class60.field967 != 2) {
            class219.field3328 = class171.field2609;
        }
        class227.field3602 = class315.field4910;
        class77.field1235 = class280.field4317 = class247.field3914 = class17.field239 = new short[256];
        if (class288.field4491 == 1) {
            class250.field3943 = 16777215;
            class250.field3948 = 0;
            class130.field2041 = class300.field4695;
            class46.field761 = class303.field4724;
            class12.field181 = true;
            class290.field4515 = class336.field5269;
            class83.field1302 = class85.field1339;
        } else {
            class290.field4515 = class32.field470;
            class130.field2041 = class178.field2690;
            class83.field1302 = class218.field3326;
            class46.field761 = class318.field4977;
        }
        class316.method2152(189);
        class46.method405(class238.field3782, -1);
        class296.method2012(-126, class238.field3782);
        class344.field5340 = class50.method424((byte) 114);
        if (class344.field5340 != null) {
            class344.field5340.method70((byte) -89, class238.field3782);
        }
        class65.field1016 = class180.field2718;
        try {
            if (class32.field471.field2714 != null) {
                class52.field849 = new class326(class32.field471.field2714, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class108.field1701[var2] = new class326(class32.field471.field2716[var2], 6000, 0);
                }
                class195.field2911 = new class326(class32.field471.field2712, 6000, 0);
                class31.field455 = new class314(255, class52.field849, class195.field2911, 500000);
                class78.field1253 = new class326(class32.field471.field2704, 24, 0);
                class32.field471.field2704 = null;
                class32.field471.field2712 = null;
                class32.field471.field2716 = null;
                class32.field471.field2714 = null;
            }
        } catch (IOException var4) {
            class195.field2911 = null;
            class31.field455 = null;
            class78.field1253 = null;
            class52.field849 = null;
        }
        if (class60.field967 != 0) {
            class306.field4758 = true;
        }
        class218.field3324 = class70.field1135;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1702)
    public final void method314(boolean arg0) {
        field727++;
        if (class131.field2052 == 1000) {
            return;
        }
        long var2 = class242.method1678(256) / 1000000L - class33.field493;
        class33.field493 = class242.method1678(256) / 1000000L;
        boolean var4 = class184.method1321(true);
        if (var4 && class186.field2783 && class315.field4917 != null) {
            class315.field4917.method224((byte) 103);
        }
        if ((class131.field2052 == 30 || class131.field2052 == 10) && (class48.field780 || class117.field1783 != 0L && class102.method743((byte) 122) > class117.field1783)) {
            class289.method1985(class259.field4057, class48.field780, -105, class256.method1759(98), class298.field4598);
        }
        if (class195.field2917 == null) {
            Container var5;
            if (class195.field2917 != null) {
                var5 = class195.field2917;
            } else if (class92.field1464 == null) {
                var5 = class32.field471.field2721;
            } else {
                var5 = class92.field1464;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class92.field1464 == var5) {
                Insets var8 = class92.field1464.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class284.field4427 != var6 || class284.field4387 != var7) {
                if (class180.field2719.startsWith("mac")) {
                    class284.field4427 = var6;
                    class284.field4387 = var7;
                } else {
                    class230.method1623((byte) 77);
                }
                class117.field1783 = class102.method743((byte) 87) + 500L;
            }
        }
        if (class195.field2917 != null && !class163.field2458 && (class131.field2052 == 30 || class131.field2052 == 10)) {
            class289.method1985(-1, false, 80, class322.field5029, -1);
        }
        boolean var9 = arg0;
        if (field722) {
            field722 = false;
            var9 = true;
        }
        if (var9) {
            class166.method1183(128);
        }
        if (class94.field1516) {
            for (int var10 = 0; var10 < 100; var10++) {
                class34.field510[var10] = true;
            }
        }
        if (class131.field2052 == 0) {
            class84.method595((byte) -121, class289.field4505, class341.field5321, var9, (Color) null);
        } else if (class131.field2052 == 5) {
            class43.method368(class344.field5343, 2, false);
        } else if (class131.field2052 == 10) {
            class59.method463(49);
        } else if (class131.field2052 == 25 || class131.field2052 == 28) {
            if (class7.field95 == 1) {
                if (class241.field3852 > class88.field1421) {
                    class88.field1421 = class241.field3852;
                }
                int var11 = (class88.field1421 - class241.field3852) * 50 / class88.field1421;
                class173.method1244(class156.field2334 + "<br>(" + var11 + "%)", 17, false);
            } else if (class7.field95 == 2) {
                if (class178.field2691 < class202.field3034) {
                    class178.field2691 = class202.field3034;
                }
                int var12 = (class178.field2691 - class202.field3034) * 50 / class178.field2691 + 50;
                class173.method1244(class156.field2334 + "<br>(" + var12 + "%)", 17, false);
            } else {
                class173.method1244(class156.field2334, 17, false);
            }
        } else if (class131.field2052 == 30) {
            class91.method653(-2, var2);
        } else if (class131.field2052 == 40) {
            class173.method1244(class51.field836 + "<br>" + class214.field3264, 17, false);
        }
        if (class94.field1516 && class131.field2052 != 0) {
            class94.method708();
            for (int var19 = 0; var19 < class169.field2560; var19++) {
                class240.field3831[var19] = false;
            }
        } else if ((class131.field2052 == 30 || class131.field2052 == 10) && class190.field2854 == 0 && !var9) {
            try {
                Graphics var13 = class238.field3782.getGraphics();
                for (int var14 = 0; var14 < class169.field2560; var14++) {
                    if (class240.field3831[var14]) {
                        class175.field2644.method871(false, class116.field1780[var14], var13, class80.field1270[var14], class342.field5326[var14], class43.field693[var14]);
                        class240.field3831[var14] = false;
                    }
                }
            } catch (Exception var21) {
                class238.field3782.repaint();
            }
        } else if (class131.field2052 != 0) {
            try {
                Graphics var16 = class238.field3782.getGraphics();
                class175.field2644.method867(32722, 0, 0, var16);
                for (int var17 = 0; var17 < class169.field2560; var17++) {
                    class240.field3831[var17] = false;
                }
            } catch (Exception var20) {
                class238.field3782.repaint();
            }
        }
        if (class313.field4848) {
            class132.method944((byte) -8);
        }
        if (class55.field925 && class131.field2052 == 10 && class331.field5160 != -1) {
            class55.field925 = false;
            class331.method2300((byte) -106, class32.field471);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltb;)Lmc;", line = 1937)
    public static final class160 method393(class220 arg0) {
        class160 var1 = (class160) class47.field767.method1222(0, ((long) arg0.field3404 << 32) + (long) arg0.field3383);
        return var1 == null ? arg0.field3483 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1943)
    public final void method300(int arg0) {
        field732++;
        if (class131.field2052 == 1000) {
            return;
        }
        class227.field3618++;
        if ((class227.field3618 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class308.field4794 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class191.field2858.setSeed((long) class308.field4794);
        }
        this.method391((byte) -117);
        if (class322.field5022 != null) {
            class322.field5022.method297(arg0 ^ 0xFFFFC887);
        }
        class279.method1915(-105);
        class170.method1225((byte) -97);
        class309.method2108(-119);
        class279.method1913(arg0 + 14307);
        if (arg0 != -14201) {
            this.method385(-55);
        }
        if (class94.field1516) {
            class198.method1410();
        }
        if (class344.field5340 != null) {
            int var3 = class344.field5340.method68((byte) 11);
            class59.field946 = var3;
        }
        if (class131.field2052 == 0) {
            this.method387(127);
            class282.method1931((byte) -51);
        } else if (class131.field2052 == 5) {
            this.method387(126);
            class282.method1931((byte) -51);
        } else if (class131.field2052 == 25 || class131.field2052 == 28) {
            class218.method1541((byte) -102);
        }
        if (class131.field2052 == 10) {
            this.method384((byte) -95);
            class103.method748((byte) 99);
            class98.method726(arg0 + 14123);
            class156.method1066(arg0 ^ 0x587C);
        } else if (class131.field2052 == 30) {
            class307.method2098(-8455);
        } else if (class131.field2052 == 40) {
            class156.method1066(-28421);
            if (class239.field3798 != -3) {
                if (class239.field3798 == 15) {
                    class156.method1069((byte) -69);
                } else if (class239.field3798 != 2) {
                    class108.method792((byte) 6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V", line = 2036)
    private final void method394(byte[] arg0, byte arg1) {
        class166 var3 = new class166(arg0);
        field719++;
        while (true) {
            int var4 = var3.method1178(0);
            if (var4 == 0) {
                if (arg1 > -90) {
                    field725 = (class43) null;
                }
                return;
            }
            if (var4 == 1) {
                int[] var5 = class12.field185 = new int[6];
                var5[0] = var3.method1151(-56);
                var5[1] = var3.method1151(-109);
                var5[2] = var3.method1151(-96);
                var5[3] = var3.method1151(-112);
                var5[4] = var3.method1151(-70);
                var5[5] = var3.method1151(-101);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 2074)
    private final void method395(int arg0, int arg1) {
        if (arg1 < 102) {
            method390((class166) null, 92);
        }
        class339.field5299.field74++;
        class224.field3556 = 0;
        class222.field3540 = null;
        class339.field5299.field73 = arg0;
        field724++;
        class189.field2832 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltb;IIIIIII)V", line = 2090)
    public static final void method396(class220[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class220 var9 = arg0[var8];
            if (var9 != null && var9.field3393 == arg1 && (!var9.field3445 || var9.field3468 == 0 || var9.field3498 || method393(var9).field2403 != 0 || class125.field1957 == var9 || var9.field3427 == 1338) && (!var9.field3445 || !method386(var9))) {
                int var10 = var9.field3361 + arg6;
                int var11 = var9.field3464 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3468 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3526 + var10;
                    int var17 = var9.field3458 + var11;
                    if (var9.field3468 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class222.field3537 == var9) {
                    class188.field2817 = true;
                    class288.field4489 = var10;
                    class252.field3974 = var11;
                }
                if (!var9.field3445 || var12 < var14 && var13 < var15) {
                    if (var9.field3468 == 0) {
                        if (!var9.field3445 && method386(var9) && class162.field2441 != var9) {
                            continue;
                        }
                        if (var9.field3436 && class119.field1815 >= var12 && class253.field3984 >= var13 && class119.field1815 < var14 && class253.field3984 < var15) {
                            for (class240 var18 = (class240) class26.field403.method636(-1); var18 != null; var18 = (class240) class26.field403.method638(123)) {
                                if (var18.field3840) {
                                    var18.method403(1);
                                    var18.field3834.field3517 = false;
                                }
                            }
                            if (class339.field5303 == 0) {
                                class222.field3537 = null;
                                class125.field1957 = null;
                            }
                            class146.field2238 = 0;
                        }
                    }
                    if (var9.field3445) {
                        boolean var19;
                        if (class119.field1815 >= var12 && class253.field3984 >= var13 && class119.field1815 < var14 && class253.field3984 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class256.field4016 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class171.field2604 == 1 && class205.field3084 >= var12 && class47.field776 >= var13 && class205.field3084 < var14 && class47.field776 < var15) {
                            var21 = true;
                        }
                        if (var9.field3441 != null) {
                            for (int var22 = 0; var22 < var9.field3441.length; var22++) {
                                if (class53.field902[var9.field3441[var22]]) {
                                    if (var9.field3489 == null || class227.field3618 >= var9.field3489[var22]) {
                                        byte var23 = var9.field3351[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class53.field902[86] && !class53.field902[82] && !class53.field902[81]) && ((var23 & 0x2) == 0 || class53.field902[86]) && ((var23 & 0x1) == 0 || class53.field902[82]) && ((var23 & 0x4) == 0 || class53.field902[81])) {
                                            class89.method647(true, "", -1, var9.field3404, var22 + 1);
                                            int var24 = var9.field3392[var22];
                                            if (var9.field3489 == null) {
                                                var9.field3489 = new int[var9.field3441.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3489[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3489[var22] = class227.field3618 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3489 != null) {
                                    var9.field3489[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class241.method1671(class47.field776 - var11, (byte) 115, class205.field3084 - var10, var9);
                        }
                        if (class222.field3537 != null && class222.field3537 != var9 && var19 && method393(var9).method1084(-1)) {
                            class191.field2865 = var9;
                        }
                        if (class125.field1957 == var9) {
                            class136.field2153 = true;
                            class70.field1144 = var10;
                            class165.field2471 = var11;
                        }
                        if (var9.field3498 || var9.field3427 != 0) {
                            if (var19 && class59.field946 != 0 && var9.field3480 != null) {
                                class240 var25 = new class240();
                                var25.field3840 = true;
                                var25.field3834 = var9;
                                var25.field3821 = class59.field946;
                                var25.field3826 = var9.field3480;
                                class26.field403.method632(-65, var25);
                            }
                            if (class222.field3537 != null || field718 != null || class339.field5305 || var9.field3427 != 1400 && class146.field2238 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3427 != 0) {
                                if (var9.field3427 == 1337) {
                                    class107.field1675 = var9;
                                    continue;
                                }
                                if (var9.field3427 == 1338) {
                                    if (var21) {
                                        class105.field1629 = class205.field3084 - var10;
                                        class169.field2562 = class47.field776 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3427 == 1400) {
                                    class110.field1712 = var9;
                                    if (var21) {
                                        if (class53.field902[82] && class52.field853 > 0) {
                                            int var26 = (int) ((double) (class205.field3084 - var10 - var9.field3526 / 2) * 2.0D / (double) class165.field2472);
                                            int var27 = (int) ((double) (class47.field776 - var11 - var9.field3458 / 2) * 2.0D / (double) class165.field2472);
                                            int var28 = class265.field4119 + var26;
                                            int var29 = class128.field2024 + var27;
                                            int var30 = class84.field1311 + var28;
                                            int var31 = class233.field3706 + class333.field5202 - var29 - 1;
                                            class2 var32 = class332.method2308(0);
                                            int[] var33 = var32.method13(-104, var30, var31);
                                            if (var33 != null) {
                                                class110.method822(var33[1], var33[0], var33[2], false);
                                                class194.method1384((byte) -36);
                                            }
                                            continue;
                                        }
                                        class146.field2238 = 1;
                                        class136.field2152 = class119.field1815;
                                        class77.field1245 = class253.field3984;
                                        continue;
                                    }
                                    if (var20 && class146.field2238 > 0) {
                                        if (class146.field2238 == 1 && (class136.field2152 != class119.field1815 || class77.field1245 != class253.field3984)) {
                                            class300.field4682 = class265.field4119;
                                            class88.field1418 = class128.field2024;
                                            class146.field2238 = 2;
                                        }
                                        if (class146.field2238 == 2) {
                                            class116.method860((int) ((double) (class136.field2152 - class119.field1815) * 2.0D / (double) class229.field3637) + class300.field4682, -122);
                                            class231.method1624(true, (int) ((double) (class77.field1245 - class253.field3984) * 2.0D / (double) class229.field3637) + class88.field1418);
                                        }
                                        continue;
                                    }
                                    class146.field2238 = 0;
                                    continue;
                                }
                                if (var9.field3427 == 1401) {
                                    if (var20) {
                                        class294.method1999((byte) -11, class253.field3984 - var11, var9.field3526, class119.field1815 - var10, var9.field3458);
                                    }
                                    continue;
                                }
                                if (var9.field3427 == 1402) {
                                    if (!class94.field1516) {
                                        class26.method241(3095, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field3410 && var21) {
                                var9.field3410 = true;
                                if (var9.field3503 != null) {
                                    class240 var34 = new class240();
                                    var34.field3840 = true;
                                    var34.field3834 = var9;
                                    var34.field3824 = class205.field3084 - var10;
                                    var34.field3821 = class47.field776 - var11;
                                    var34.field3826 = var9.field3503;
                                    class26.field403.method632(-96, var34);
                                }
                            }
                            if (var9.field3410 && var20 && var9.field3387 != null) {
                                class240 var35 = new class240();
                                var35.field3840 = true;
                                var35.field3834 = var9;
                                var35.field3824 = class119.field1815 - var10;
                                var35.field3821 = class253.field3984 - var11;
                                var35.field3826 = var9.field3387;
                                class26.field403.method632(-56, var35);
                            }
                            if (var9.field3410 && !var20) {
                                var9.field3410 = false;
                                if (var9.field3531 != null) {
                                    class240 var36 = new class240();
                                    var36.field3840 = true;
                                    var36.field3834 = var9;
                                    var36.field3824 = class119.field1815 - var10;
                                    var36.field3821 = class253.field3984 - var11;
                                    var36.field3826 = var9.field3531;
                                    class206.field3128.method632(-79, var36);
                                }
                            }
                            if (var20 && var9.field3463 != null) {
                                class240 var37 = new class240();
                                var37.field3840 = true;
                                var37.field3834 = var9;
                                var37.field3824 = class119.field1815 - var10;
                                var37.field3821 = class253.field3984 - var11;
                                var37.field3826 = var9.field3463;
                                class26.field403.method632(-41, var37);
                            }
                            if (!var9.field3517 && var19) {
                                var9.field3517 = true;
                                if (var9.field3399 != null) {
                                    class240 var38 = new class240();
                                    var38.field3840 = true;
                                    var38.field3834 = var9;
                                    var38.field3824 = class119.field1815 - var10;
                                    var38.field3821 = class253.field3984 - var11;
                                    var38.field3826 = var9.field3399;
                                    class26.field403.method632(-98, var38);
                                }
                            }
                            if (var9.field3517 && var19 && var9.field3474 != null) {
                                class240 var39 = new class240();
                                var39.field3840 = true;
                                var39.field3834 = var9;
                                var39.field3824 = class119.field1815 - var10;
                                var39.field3821 = class253.field3984 - var11;
                                var39.field3826 = var9.field3474;
                                class26.field403.method632(-32, var39);
                            }
                            if (var9.field3517 && !var19) {
                                var9.field3517 = false;
                                if (var9.field3507 != null) {
                                    class240 var40 = new class240();
                                    var40.field3840 = true;
                                    var40.field3834 = var9;
                                    var40.field3824 = class119.field1815 - var10;
                                    var40.field3821 = class253.field3984 - var11;
                                    var40.field3826 = var9.field3507;
                                    class206.field3128.method632(-117, var40);
                                }
                            }
                            if (var9.field3478 != null) {
                                class240 var41 = new class240();
                                var41.field3834 = var9;
                                var41.field3826 = var9.field3478;
                                class23.field376.method632(-108, var41);
                            }
                            if (var9.field3419 != null && class263.field4089 > var9.field3490) {
                                if (var9.field3390 == null || class263.field4089 - var9.field3490 > 32) {
                                    class240 var46 = new class240();
                                    var46.field3834 = var9;
                                    var46.field3826 = var9.field3419;
                                    class26.field403.method632(-63, var46);
                                } else {
                                    label575: for (int var42 = var9.field3490; var42 < class263.field4089; var42++) {
                                        int var43 = class78.field1252[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3390.length; var44++) {
                                            if (var9.field3390[var44] == var43) {
                                                class240 var45 = new class240();
                                                var45.field3834 = var9;
                                                var45.field3826 = var9.field3419;
                                                class26.field403.method632(-39, var45);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field3490 = class263.field4089;
                            }
                            if (var9.field3475 != null && class53.field890 > var9.field3408) {
                                if (var9.field3509 == null || class53.field890 - var9.field3408 > 32) {
                                    class240 var51 = new class240();
                                    var51.field3834 = var9;
                                    var51.field3826 = var9.field3475;
                                    class26.field403.method632(-43, var51);
                                } else {
                                    label551: for (int var47 = var9.field3408; var47 < class53.field890; var47++) {
                                        int var48 = class268.field4182[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3509.length; var49++) {
                                            if (var9.field3509[var49] == var48) {
                                                class240 var50 = new class240();
                                                var50.field3834 = var9;
                                                var50.field3826 = var9.field3475;
                                                class26.field403.method632(-114, var50);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field3408 = class53.field890;
                            }
                            if (var9.field3422 != null && class139.field2169 > var9.field3356) {
                                if (var9.field3438 == null || class139.field2169 - var9.field3356 > 32) {
                                    class240 var56 = new class240();
                                    var56.field3834 = var9;
                                    var56.field3826 = var9.field3422;
                                    class26.field403.method632(-117, var56);
                                } else {
                                    label527: for (int var52 = var9.field3356; var52 < class139.field2169; var52++) {
                                        int var53 = class39.field601[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3438.length; var54++) {
                                            if (var9.field3438[var54] == var53) {
                                                class240 var55 = new class240();
                                                var55.field3834 = var9;
                                                var55.field3826 = var9.field3422;
                                                class26.field403.method632(-124, var55);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field3356 = class139.field2169;
                            }
                            if (var9.field3520 != null && class284.field4405 > var9.field3448) {
                                if (var9.field3401 == null || class284.field4405 - var9.field3448 > 32) {
                                    class240 var61 = new class240();
                                    var61.field3834 = var9;
                                    var61.field3826 = var9.field3520;
                                    class26.field403.method632(-100, var61);
                                } else {
                                    label503: for (int var57 = var9.field3448; var57 < class284.field4405; var57++) {
                                        int var58 = class37.field561[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3401.length; var59++) {
                                            if (var9.field3401[var59] == var58) {
                                                class240 var60 = new class240();
                                                var60.field3834 = var9;
                                                var60.field3826 = var9.field3520;
                                                class26.field403.method632(-71, var60);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field3448 = class284.field4405;
                            }
                            if (var9.field3521 != null && class60.field976 > var9.field3450) {
                                if (var9.field3523 == null || class60.field976 - var9.field3450 > 32) {
                                    class240 var66 = new class240();
                                    var66.field3834 = var9;
                                    var66.field3826 = var9.field3521;
                                    class26.field403.method632(-87, var66);
                                } else {
                                    label479: for (int var62 = var9.field3450; var62 < class60.field976; var62++) {
                                        int var63 = class130.field2040[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3523.length; var64++) {
                                            if (var9.field3523[var64] == var63) {
                                                class240 var65 = new class240();
                                                var65.field3834 = var9;
                                                var65.field3826 = var9.field3521;
                                                class26.field403.method632(-54, var65);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field3450 = class60.field976;
                            }
                            if (class44.field716 > var9.field3394 && var9.field3357 != null) {
                                class240 var67 = new class240();
                                var67.field3834 = var9;
                                var67.field3826 = var9.field3357;
                                class26.field403.method632(-80, var67);
                            }
                            if (class161.field2423 > var9.field3394 && var9.field3353 != null) {
                                class240 var68 = new class240();
                                var68.field3834 = var9;
                                var68.field3826 = var9.field3353;
                                class26.field403.method632(-97, var68);
                            }
                            if (class139.field2173 > var9.field3394 && var9.field3421 != null) {
                                class240 var69 = new class240();
                                var69.field3834 = var9;
                                var69.field3826 = var9.field3421;
                                class26.field403.method632(-40, var69);
                            }
                            if (class153.field2305 > var9.field3394 && var9.field3473 != null) {
                                class240 var70 = new class240();
                                var70.field3834 = var9;
                                var70.field3826 = var9.field3473;
                                class26.field403.method632(-43, var70);
                            }
                            if (class259.field4062 > var9.field3394 && var9.field3510 != null) {
                                class240 var71 = new class240();
                                var71.field3834 = var9;
                                var71.field3826 = var9.field3510;
                                class26.field403.method632(-86, var71);
                            }
                            var9.field3394 = class291.field4524;
                            if (var9.field3443 != null) {
                                for (int var72 = 0; var72 < class312.field4844; var72++) {
                                    class240 var73 = new class240();
                                    var73.field3834 = var9;
                                    var73.field3825 = class242.field3872[var72];
                                    var73.field3832 = class292.field4542[var72];
                                    var73.field3826 = var9.field3443;
                                    class26.field403.method632(-74, var73);
                                }
                            }
                            if (class48.field778 && var9.field3485 != null) {
                                class240 var74 = new class240();
                                var74.field3834 = var9;
                                var74.field3826 = var9.field3485;
                                class26.field403.method632(-128, var74);
                            }
                        }
                    }
                    if (!var9.field3445 && class222.field3537 == null && field718 == null && !class339.field5305) {
                        if ((var9.field3380 >= 0 || var9.field3451 != 0) && class119.field1815 >= var12 && class253.field3984 >= var13 && class119.field1815 < var14 && class253.field3984 < var15) {
                            if (var9.field3380 >= 0) {
                                class162.field2441 = arg0[var9.field3380];
                            } else {
                                class162.field2441 = var9;
                            }
                        }
                        if (var9.field3468 == 8 && class119.field1815 >= var12 && class253.field3984 >= var13 && class119.field1815 < var14 && class253.field3984 < var15) {
                            class12.field194 = var9;
                        }
                        if (var9.field3465 > var9.field3458) {
                            class77.method564((byte) 122, class119.field1815, var9.field3526 + var10, var9, class253.field3984, var9.field3458, var11, var9.field3465);
                        }
                    }
                    if (var9.field3468 == 0) {
                        method396(arg0, var9.field3404, var12, var13, var14, var15, var10 - var9.field3367, var11 - var9.field3426);
                        if (var9.field3472 != null) {
                            method396(var9.field3472, var9.field3404, var12, var13, var14, var15, var10 - var9.field3367, var11 - var9.field3426);
                        }
                        class61 var75 = (class61) class276.field4257.method1222(0, (long) var9.field3404);
                        if (var75 != null) {
                            class90.method651(var75.field982, var13, -75, var14, var10, var12, var15, var11);
                        }
                    }
                }
            }
        }
    }
}
