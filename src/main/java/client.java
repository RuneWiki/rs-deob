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
public class client extends class100 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ldf;")
    public static class146 field1997 = new class146(16);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lmb;")
    public static class96 field1998 = class243.method1708("::clientdrop", (byte) 93);

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[B")
    public static byte[] field1999 = new byte[520];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method813(boolean arg0) {
        field1993++;
        if (!arg0) {
            return;
        }
        if (class205.field3530 < class181.field3128.field1660) {
            if (class226.field3837 == class121.field2239) {
                class121.field2239 = class232.field3981;
            } else {
                class121.field2239 = class226.field3837;
            }
            class21.field345 = (class181.field3128.field1660 * 50 - 50) * 5;
            if (class21.field345 > 3000) {
                class21.field345 = 3000;
            }
            if (class181.field3128.field1660 >= 2 && class181.field3128.field1661 == 6) {
                this.method751("js5connect_outofdate", (byte) -108);
                class101.field1729 = 1000;
                return;
            }
            if (class181.field3128.field1660 >= 4 && class181.field3128.field1661 == -1) {
                this.method751("js5crc", (byte) -108);
                class101.field1729 = 1000;
                return;
            }
            if (class181.field3128.field1660 >= 4 && (class101.field1729 == 0 || class101.field1729 == 5)) {
                if (class181.field3128.field1661 == 7 || class181.field3128.field1661 == 9) {
                    this.method751("js5connect_full", (byte) -108);
                } else if (class181.field3128.field1661 <= 0) {
                    this.method751("js5io", (byte) -108);
                } else {
                    this.method751("js5connect", (byte) -108);
                }
                class101.field1729 = 1000;
                return;
            }
        }
        class205.field3530 = class181.field3128.field1660;
        if (class21.field345 > 0) {
            class21.field345--;
            return;
        }
        try {
            if (class122.field2272 == 0) {
                class4.field90 = class234.field4017.method942(class121.field2239, class207.field3575, 11);
                class122.field2272++;
            }
            if (class122.field2272 == 1) {
                if (class4.field90.field4605 == 2) {
                    this.method820((byte) 54, 1000);
                    return;
                }
                if (class4.field90.field4605 == 1) {
                    class122.field2272++;
                }
            }
            if (class122.field2272 == 2) {
                class165.field2913 = new class236((Socket) class4.field90.field4604, class234.field4017);
                class239 var2 = new class239(5);
                var2.method1652(15, (byte) 41);
                var2.method1625((byte) -109, 520);
                class165.field2913.method1599(true, 5, var2.field4144, 0);
                class122.field2272++;
                class70.field1207 = class155.method1133(127);
            }
            if (class122.field2272 == 3) {
                if (class101.field1729 == 0 || class101.field1729 == 5 || class165.field2913.method1598(0) > 0) {
                    int var3 = class165.field2913.method1604((byte) 78);
                    if (var3 != 0) {
                        this.method820((byte) 109, var3);
                        return;
                    }
                    class122.field2272++;
                } else if (class155.method1133(124) - class70.field1207 > 30000L) {
                    this.method820((byte) 100, 1001);
                    return;
                }
            }
            if (class122.field2272 == 4) {
                boolean var4 = class101.field1729 == 5 || class101.field1729 == 10 || class101.field1729 == 28;
                class181.field3128.method738(class165.field2913, 95, !var4);
                class122.field2272 = 0;
                class165.field2913 = null;
                class4.field90 = null;
            }
        } catch (IOException var5) {
            this.method820((byte) 57, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method753(byte arg0) {
        field1982++;
        if (class101.field1729 == 1000) {
            return;
        }
        boolean var2 = class1.method3((byte) 66);
        if (arg0 != 88) {
            this.method758(108);
        }
        if (var2 && class119.field2213 && class20.field335 != null) {
            class20.field335.method534((byte) -77);
        }
        if ((class101.field1729 == 30 || class101.field1729 == 10) && (class38.field670 || class46.field789 != 0L && class155.method1133(125) > class46.field789)) {
            class40.method315(class206.field3535, class38.field670, class144.field2546, class159.method1157(arg0 ^ 0xFFFFFFA7), -48);
        }
        if (class207.field3571 == null) {
            Container var3;
            if (class207.field3571 != null) {
                var3 = class207.field3571;
            } else if (class103.field1743 == null) {
                var3 = class234.field4017.field2277;
            } else {
                var3 = class103.field1743;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class103.field1743 == var3) {
                Insets var6 = class103.field1743.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class5.field109 != var4 || class162.field2880 != var5) {
                if (class123.field2273.startsWith("mac")) {
                    class5.field109 = var4;
                    class162.field2880 = var5;
                } else {
                    class152.method1112(6270);
                }
                class46.field789 = class155.method1133(arg0 + 38) + 500L;
            }
        }
        boolean var7 = false;
        if (class41.field694) {
            var7 = true;
            class41.field694 = false;
        }
        if (var7) {
            class135.method1008(0);
        }
        if (class101.field1729 == 0) {
            class122.method933((Color) null, var7, class119.field2212, (byte) -100, class9.field162);
        } else if (class101.field1729 == 5) {
            class92.method648(false, class71.field1216, arg0 ^ 0x168);
        } else if (class101.field1729 == 10) {
            class23.method164((byte) 79);
        } else if (class101.field1729 == 25 || class101.field1729 == 28) {
            if (class9.field151 == 1) {
                if (class273.field4745 > class140.field2508) {
                    class140.field2508 = class273.field4745;
                }
                int var8 = (class140.field2508 - class273.field4745) * 50 / class140.field2508;
                class241.method1698(8215, class36.method289(-5615, new class96[] { class103.field1742, class200.field3480, class31.method205(var8, (byte) -78), class6.field112 }), false);
            } else if (class9.field151 == 2) {
                if (class152.field2668 > class76.field1310) {
                    class76.field1310 = class152.field2668;
                }
                int var9 = (class76.field1310 - class152.field2668) * 50 / class76.field1310 + 50;
                class241.method1698(arg0 + 8127, class36.method289(-5615, new class96[] { class103.field1742, class200.field3480, class31.method205(var9, (byte) -78), class6.field112 }), false);
            } else {
                class241.method1698(arg0 ^ 0x204F, class103.field1742, false);
            }
        } else if (class101.field1729 == 30) {
            class205.method1421(0);
        } else if (class101.field1729 == 40) {
            class241.method1698(8215, class36.method289(-5615, new class96[] { class62.field1055, class220.field3765, class168.field2953 }), false);
        }
        if ((class101.field1729 == 30 || class101.field1729 == 10) && class211.field3639 == 0 && !var7) {
            try {
                Graphics var12 = class3.field28.getGraphics();
                for (int var13 = 0; var13 < class47.field822; var13++) {
                    if (class19.field317[var13]) {
                        class85.field1442.method68(-126, class271.field4717[var13], class61.field1046[var13], var12, class266.field4643[var13], class270.field4698[var13]);
                        class19.field317[var13] = false;
                    }
                }
            } catch (Exception var14) {
                class3.field28.repaint();
            }
        } else if (class101.field1729 != 0) {
            try {
                Graphics var10 = class3.field28.getGraphics();
                class85.field1442.method66((byte) 109, 0, 0, var10);
                for (int var11 = 0; var11 < class47.field822; var11++) {
                    class19.field317[var11] = false;
                }
            } catch (Exception var15) {
                class3.field28.repaint();
            }
        }
        if (class86.field1453) {
            class22.method156(5);
        }
        if (class176.field3061 && class101.field1729 == 10 && class107.field1825 != -1) {
            class176.field3061 = false;
            class95.method670((byte) -107, class234.field4017);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lw;)Z")
    public static final boolean method814(class107 arg0) {
        if (class45.field784) {
            if (method817(arg0) != 0) {
                return false;
            }
            if (arg0.field1833 == 0) {
                return false;
            }
        }
        return arg0.field1911;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
    public static final void method815(String arg0, byte arg1, Throwable arg2) {
        field1988++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class177.method1264(arg2, -7402);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (arg1 > -76) {
                method817((class107) null);
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class157.field2739.field2277 != null) {
                class263 var8 = class157.field2739.method950(new URL(class157.field2739.field2277.getCodeBase(), "clienterror.ws?c=" + class109.field2013 + "&u=" + class51.field881 + "&v1=" + class123.field2278 + "&v2=" + class123.field2286 + "&e=" + var7), -128);
                while (var8.field4605 == 0) {
                    class226.method1543(1L, -738);
                }
                if (var8.field4605 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4604;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1995++;
        try {
            int var1 = -1;
            if (arg0.length != 4) {
                class216.method1498((byte) -83, "argument count");
            }
            class134.field2405 = Integer.parseInt(arg0[0]);
            class44.field755 = 2;
            if (arg0[1].equals("live")) {
                class226.field3855 = 0;
            } else if (arg0[1].equals("rc")) {
                class226.field3855 = 1;
            } else if (arg0[1].equals("wip")) {
                class226.field3855 = 2;
            } else {
                class216.method1498((byte) -103, "modewhat");
            }
            class254.field4390 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class178.method1268(class154.method1131(-89, var2, 0, var2.length), false);
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class156.field2722 = var1;
            } else if (arg0[2].equals("english")) {
                class156.field2722 = 0;
            } else if (arg0[2].equals("german")) {
                class156.field2722 = 1;
            } else {
                class216.method1498((byte) 109, "language");
            }
            class195.method1359(class156.field2722, (byte) -18);
            class134.field2412 = false;
            class5.field101 = false;
            if (arg0[3].equals("game0")) {
                class239.field4097 = 0;
            } else if (arg0[3].equals("game1")) {
                class239.field4097 = 1;
            } else {
                class216.method1498((byte) -98, "game");
            }
            class207.field3576 = false;
            class192.field3320 = class120.field2227;
            class73.field1255 = 0;
            client var3 = new client();
            class242.field4209 = var3;
            var3.method750(1024, 768, 520, "runescape", -128, class226.field3855 + 32, 27);
            class103.field1743.setLocation(40, 40);
        } catch (Exception var6) {
            method815((String) null, (byte) -101, var6);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method816(byte arg0) {
        field1985++;
        if (!class176.field3061) {
            label233: while (true) {
                do {
                    if (!class127.method970(-70)) {
                        break label233;
                    }
                } while (class145.field2579 != 115 && class145.field2579 != 83);
                class176.field3061 = true;
            }
        }
        if (class231.field3976 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class155.method1133(123);
            if (class225.field3826 == 0L) {
                class225.field3826 = var4;
            }
            if (var3 > 16384 && var4 - class225.field3826 < 5000L) {
                if ((var4 - class38.field645) > 1000L) {
                    System.gc();
                    class38.field645 = var4;
                }
                class9.field162 = class21.field363;
                class119.field2212 = 5;
            } else {
                class119.field2212 = 5;
                class9.field162 = class43.field731;
                class231.field3976 = 10;
            }
        } else if (class231.field3976 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class62.field1064[var6] = new class207(104, 104);
            }
            class119.field2212 = 10;
            class231.field3976 = 30;
            class9.field162 = class45.field770;
        } else if (class231.field3976 == 30) {
            if (class219.field3745 == null) {
                class219.field3745 = new class37(class181.field3128, class234.field4010);
            }
            if (class219.field3745.method293(0)) {
                class68.field1189 = class33.method246(0, 1000000, true, false, true);
                class229.field3922 = class33.method246(1, arg0 ^ 0xF4272, true, false, true);
                class186.field3244 = class33.method246(2, 1000000, true, true, false);
                class39.field685 = class33.method246(3, 1000000, true, false, true);
                class178.field3077 = class33.method246(4, arg0 + 999950, true, false, true);
                class92.field1523 = class33.method246(5, 1000000, true, true, true);
                class181.field3155 = class33.method246(6, 1000000, false, true, true);
                class236.field4058 = class33.method246(7, 1000000, true, false, true);
                class103.field1735 = class33.method246(8, 1000000, true, false, true);
                class85.field1443 = class33.method246(9, 1000000, true, false, true);
                class122.field2265 = class33.method246(10, 1000000, true, false, true);
                class97.field1634 = class33.method246(11, 1000000, true, false, true);
                class212.field3660 = class33.method246(12, 1000000, true, false, true);
                class49.field867 = class33.method246(13, 1000000, true, false, true);
                class189.field3309 = class33.method246(14, 1000000, false, false, true);
                class170.field2983 = class33.method246(15, 1000000, true, false, true);
                class23.field398 = class33.method246(16, 1000000, true, false, true);
                class14.field225 = class33.method246(17, arg0 ^ 0xF4272, true, false, true);
                class218.field3732 = class33.method246(18, 1000000, true, false, true);
                class185.field3219 = class33.method246(19, 1000000, true, false, true);
                class74.field1294 = class33.method246(20, 1000000, true, false, true);
                class215.field3702 = class33.method246(21, 1000000, true, false, true);
                class48.field852 = class33.method246(22, 1000000, true, false, true);
                class246.field4270 = class33.method246(23, 1000000, true, true, true);
                class264.field4611 = class33.method246(24, 1000000, true, false, true);
                class22.field367 = class33.method246(25, 1000000, true, false, true);
                class148.field2618 = class33.method246(26, 1000000, true, true, true);
                class231.field3976 = 40;
                class119.field2212 = 15;
                class9.field162 = class9.field158;
            } else {
                class9.field162 = class17.field251;
                class119.field2212 = 12;
            }
        } else if (class231.field3976 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class230.field3966[var8].method1167((byte) 119) * class272.field4739[var8] / 100;
            }
            if (var7 == 100) {
                class119.field2212 = 20;
                class9.field162 = class23.field402;
                class14.method109(0, class103.field1735);
                class55.method410(1, class103.field1735);
                class92.method647(class103.field1735, 1);
                class231.field3976 = 45;
            } else {
                if (var7 != 0) {
                    class9.field162 = class36.method289(-5615, new class96[] { class52.field902, class31.method205(var7, (byte) -78), class121.field2237 });
                }
                class119.field2212 = 20;
            }
        } else if (class231.field3976 == 45) {
            class10.method78(class22.field386, 2, 22050, arg0 - 31537);
            class11.field191 = new class33();
            class11.field191.method218(128, arg0 - 51, 9);
            class20.field335 = class167.method1207(22050, arg0 - 20772, 0, class234.field4017, class3.field28);
            class20.field335.method542(arg0 - 113, class11.field191);
            class149.method1096(class170.field2983, class178.field3077, class11.field191, -127, class189.field3309);
            class80.field1362 = class167.method1207(2048, -20722, 1, class234.field4017, class3.field28);
            class120.field2228 = new class228();
            class80.field1362.method542(-95, class120.field2228);
            class44.field750 = new class216(22050, class139.field2490);
            class134.field2408 = class181.field3155.method41(class266.field4648, false);
            class119.field2212 = 30;
            class231.field3976 = 50;
            class9.field162 = class151.field2655;
        } else if (class231.field3976 == 50) {
            int var9 = class271.method1850(class49.field867, class103.field1735, (byte) -127);
            int var10 = class200.method1396((byte) -81);
            if (var10 > var9) {
                class9.field162 = class36.method289(arg0 ^ 0xFFFFEA23, new class96[] { class7.field131, class31.method205(var9 * 100 / var10, (byte) -78), class121.field2237 });
                class119.field2212 = 35;
            } else {
                class119.field2212 = 35;
                class9.field162 = class230.field3959;
                class231.field3976 = 60;
            }
        } else if (class231.field3976 == 60) {
            int var11 = class20.method144(class103.field1735, (byte) -10);
            int var12 = class39.method313(false);
            if (var12 > var11) {
                class9.field162 = class36.method289(-5615, new class96[] { class136.field2435, class31.method205(var11 * 100 / var12, (byte) -78), class121.field2237 });
                class119.field2212 = 40;
            } else {
                class231.field3976 = 65;
                class119.field2212 = 40;
                class9.field162 = class54.field945;
            }
        } else if (class231.field3976 == 65) {
            class33.method226(0, class103.field1735, class49.field867);
            class9.field162 = class180.field3108;
            class119.field2212 = 45;
            class146.method1076(6938, 5);
            class231.field3976 = 70;
        } else if (class231.field3976 == 70) {
            class186.field3244.method32((byte) 83);
            byte var13 = 0;
            int var14 = var13 + class186.field3244.method27((byte) -104);
            class23.field398.method32((byte) 108);
            int var15 = var14 + class23.field398.method27((byte) -113);
            class14.field225.method32((byte) 75);
            int var16 = var15 + class14.field225.method27((byte) -44);
            class218.field3732.method32((byte) 81);
            int var17 = var16 + class218.field3732.method27((byte) -67);
            class185.field3219.method32((byte) 121);
            int var18 = var17 + class185.field3219.method27((byte) -72);
            class74.field1294.method32((byte) 57);
            int var19 = var18 + class74.field1294.method27((byte) -90);
            class215.field3702.method32((byte) 68);
            int var20 = var19 + class215.field3702.method27((byte) -113);
            class48.field852.method32((byte) 67);
            int var21 = var20 + class48.field852.method27((byte) -128);
            class264.field4611.method32((byte) 81);
            int var22 = var21 + class264.field4611.method27((byte) -108);
            class22.field367.method32((byte) 96);
            int var23 = var22 + class22.field367.method27((byte) -98);
            if (var23 < 1000) {
                class9.field162 = class36.method289(-5615, new class96[] { class44.field762, class31.method205(var23 / 10, (byte) -78), class121.field2237 });
                class119.field2212 = 50;
            } else {
                class134.method1006((byte) -50, class186.field3244);
                class96.method718(class186.field3244, true);
                class260.method1801(arg0 - 50, class186.field3244);
                class207.method1425(arg0 ^ 0x1C, class236.field4058, class186.field3244);
                class173.method1234(class236.field4058, true, class23.field398, 80);
                class11.method97(class218.field3732, class236.field4058, true);
                class200.method1402(class241.field4185, class185.field3219, class236.field4058, -109, true);
                class231.method1578(class186.field3244, (byte) -127);
                class115.method906(class68.field1189, true, class74.field1294, class229.field3922);
                class153.method1121(class215.field3702, class236.field4058, 96);
                class213.method1481(class48.field852, 68);
                class170.method1218((byte) -63, class186.field3244);
                class186.method1313(3136, class103.field1735, class236.field4058, class49.field867, class39.field685);
                class90.method639(class186.field3244, 104);
                class215.method1492(42, class14.field225);
                class11.method92(class22.field367, new class222(), arg0 ^ 0x33, class264.field4611);
                class14.method107(class264.field4611, class22.field367, -30);
                class119.field2212 = 50;
                class9.field162 = class21.field360;
                class226.method1539(-1);
                class231.field3976 = 80;
            }
        } else if (arg0 == 50) {
            if (class231.field3976 == 80) {
                int var24 = class227.method1546(arg0 + 66, class103.field1735);
                int var25 = class207.method1426(16);
                if (var25 > var24) {
                    class9.field162 = class36.method289(-5615, new class96[] { class29.field481, class31.method205(var24 * 100 / var25, (byte) -78), class121.field2237 });
                    class119.field2212 = 60;
                } else {
                    class103.method778(class103.field1735, -12768);
                    class231.field3976 = 90;
                    class9.field162 = class189.field3308;
                    class119.field2212 = 60;
                }
            } else if (class231.field3976 == 90) {
                if (class148.field2618.method32((byte) 98)) {
                    class114 var26 = new class114(class85.field1443, class148.field2618, class103.field1735, 20, !class237.field4073);
                    class240.method1686(var26);
                    if (class269.field4682 == 1) {
                        class240.method1683(0.9F);
                    }
                    if (class269.field4682 == 2) {
                        class240.method1683(0.8F);
                    }
                    if (class269.field4682 == 3) {
                        class240.method1683(0.7F);
                    }
                    if (class269.field4682 == 4) {
                        class240.method1683(0.6F);
                    }
                    class119.field2212 = 70;
                    class9.field162 = class274.field4787;
                    class231.field3976 = 100;
                } else {
                    class9.field162 = class36.method289(-5615, new class96[] { class156.field2725, class31.method205(class148.field2618.method27((byte) -111), (byte) -78), class121.field2237 });
                    class119.field2212 = 70;
                }
            } else if (class231.field3976 == 100) {
                if (class259.method1788(class103.field1735, true)) {
                    class231.field3976 = 110;
                }
            } else if (class231.field3976 == 110) {
                class15.field229 = new class24();
                class234.field4017.method946(10, arg0 - 50, class15.field229);
                class9.field162 = class68.field1186;
                class119.field2212 = 75;
                class231.field3976 = 120;
            } else if (class231.field3976 == 120) {
                if (class122.field2265.method46(46, class120.field2227, class210.field3626)) {
                    class48 var27 = new class48(class122.field2265.method30(class210.field3626, class120.field2227, 0));
                    class36.method287(var27, (byte) -122);
                    class231.field3976 = 130;
                    class9.field162 = class68.field1173;
                    class119.field2212 = 80;
                } else {
                    class9.field162 = class36.method289(-5615, new class96[] { class178.field3079, class52.field916 });
                    class119.field2212 = 80;
                }
            } else if (class231.field3976 == 130) {
                if (!class39.field685.method32((byte) 56)) {
                    class9.field162 = class36.method289(arg0 ^ 0xFFFFEA23, new class96[] { class139.field2484, class31.method205(class39.field685.method27((byte) -44) * 3 / 4, (byte) -78), class121.field2237 });
                    class119.field2212 = 85;
                } else if (!class212.field3660.method32((byte) 66)) {
                    class9.field162 = class36.method289(-5615, new class96[] { class139.field2484, class31.method205(class212.field3660.method27((byte) -66) / 10 + 75, (byte) -78), class121.field2237 });
                    class119.field2212 = 85;
                } else if (!class49.field867.method32((byte) 89)) {
                    class9.field162 = class36.method289(-5615, new class96[] { class139.field2484, class31.method205(class49.field867.method27((byte) -112) / 20 + 85, (byte) -78), class121.field2237 });
                    class119.field2212 = 85;
                } else if (class246.field4270.method38(85, class218.field3740)) {
                    class150.method1097(class196.field3395, class93.field1536, class246.field4270, class250.field4323, 0, class38.field655, class103.field1737);
                    class119.field2212 = 95;
                    class9.field162 = class89.field1471;
                    class231.field3976 = 135;
                } else {
                    class9.field162 = class36.method289(arg0 - 5665, new class96[] { class139.field2484, class31.method205(class246.field4270.method31(class218.field3740, -114) / 10 + 90, (byte) -78), class121.field2237 });
                    class119.field2212 = 85;
                }
            } else if (class231.field3976 == 135) {
                int var28 = class90.method641(arg0 - 53);
                if (var28 == -1) {
                    class119.field2212 = 95;
                    class9.field162 = class26.field440;
                } else if (var28 == 7 || var28 == 9) {
                    this.method751("worldlistfull", (byte) -108);
                    class146.method1076(arg0 ^ 0x1B28, 1000);
                } else if (class31.field488) {
                    class231.field3976 = 140;
                    class119.field2212 = 96;
                    class9.field162 = class215.field3690;
                } else {
                    this.method751("worldlistio_" + var28, (byte) -108);
                    class146.method1076(arg0 ^ 0x1B28, 1000);
                }
            } else if (class231.field3976 == 140) {
                class42.field724 = class39.field685.method41(class276.field4803, false);
                class92.field1523.method35((byte) -126, true, false);
                class181.field3155.method35((byte) -125, true, true);
                class103.field1735.method35((byte) -127, true, true);
                class49.field867.method35((byte) -123, true, true);
                class122.field2265.method35((byte) -125, true, true);
                class39.field685.method35((byte) -127, true, true);
                class119.field2212 = 97;
                class231.field3976 = 150;
                class9.field162 = class197.field3438;
                class86.field1453 = true;
            } else if (class231.field3976 == 150) {
                if (class176.field3061) {
                    class256.field4461 = 0;
                    class22.field376 = 0;
                }
                class176.field3061 = true;
                class95.method670((byte) -109, class234.field4017);
                class40.method315(-1, false, -1, class256.field4461, -86);
                class231.field3976 = 160;
                class119.field2212 = 100;
                class9.field162 = class71.field1217;
            } else if (class231.field3976 == 160) {
                class252.method1754(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lw;)I")
    public static final int method817(class107 arg0) {
        class46 var1 = (class46) class26.field441.method1081(0, ((long) arg0.field1896 << 32) + (long) arg0.field1974);
        return var1 == null ? arg0.field1880 : var1.field795;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method818(int arg0) {
        field1987++;
        boolean var2 = class181.field3128.method729(4513);
        if (!var2) {
            this.method813(true);
        }
        int var3 = 72 / ((-arg0 - 39) / 51);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public static final void method819(int arg0, int arg1) {
        class15.field237.method82((byte) -109, arg1);
        class51.field883.method82((byte) -109, arg1);
        if (arg0 != 14917) {
            field1998 = null;
        }
        field1981++;
        class224.field3808.method82((byte) -109, arg1);
        class258.field4470.method82((byte) -109, arg1);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method764(int arg0) {
        method822(23675);
        class96.method680(-122);
        class147.method1089((byte) -35);
        class265.method1827(4821);
        class110.method843((byte) 92);
        field1977++;
        class100.method761((byte) 10);
        class252.method1755(1152);
        class95.method669(0);
        class24.method166((byte) -113);
        class64.method453((byte) -40);
        class239.method1664(100);
        class236.method1602((byte) 94);
        class97.method727((byte) -12);
        class132.method993(-1);
        class37.method295((byte) 108);
        class161.method1166(-88);
        class3.method21((byte) -55);
        class106.method797((byte) 76);
        class276.method1871(124);
        class11.method94(1);
        class197.method1381(-26004);
        class136.method1015((byte) 99);
        class207.method1442(0);
        class107.method808(0);
        class47.method364(-1);
        class262.method1809((byte) -105);
        class146.method1075(-125);
        class124.method960((byte) -35);
        class120.method926(1);
        class157.method1144(-24878);
        class246.method1724(16);
        class33.method245(-105);
        class74.method539(0);
        class216.method1495(-117);
        class186.method1316(0);
        class67.method465(false);
        class260.method1797((byte) 117);
        class187.method1325(-1301);
        class251.method1748(15286);
        class229.method1562(0);
        class168.method1211(false);
        class249.method1738(-122);
        class198.method1392((byte) 127);
        class212.method1473(3);
        class213.method1478(-3574);
        class200.method1399(false);
        class170.method1219(false);
        class99.method745((byte) -51);
        class75.method545(-93);
        class53.method402((byte) -126);
        class52.method396(-110);
        class273.method1858(0);
        class217.method1501(false);
        class196.method1362((byte) 121);
        class93.method654(0);
        class177.method1266(-1815);
        class235.method1595(true);
        class112.method880();
        class78.method559((byte) 126);
        class159.method1156(false);
        class255.method1774();
        class234.method1586(-1);
        class210.method1460(-109);
        class103.method779(16215);
        class51.method384(87);
        class58.method424(-91);
        class121.method930((byte) -56);
        class87.method627((byte) -74);
        class18.method135();
        class272.method1854(25300);
        class181.method1280((byte) -110);
        class166.method1199();
        class268.method1839(true);
        class138.method1031(-106);
        class227.method1545((byte) -50);
        class111.method848();
        class62.method446(false);
        class203.method1419((byte) -88);
        class134.method1005(100);
        class219.method1506(true);
        class84.method594();
        class243.method1710((byte) -121);
        class195.method1358(-3288);
        class253.method1758(-128);
        class98.method742((byte) 115);
        if (arg0 < 12) {
            method821((class107) null);
        }
        class22.method162((byte) -100);
        class193.method1348(5);
        class209.method1459(28034);
        class211.method1467((byte) 124);
        class150.method1101(-25238);
        class109.method840(123);
        class148.method1091(-28);
        class169.method1216(122);
        class247.method1732(-1813869017);
        class183.method1289(113);
        class218.method1504((byte) -115);
        class86.method623(5);
        class133.method1000(false);
        class42.method328(-115);
        class208.method1456((byte) 42);
        class222.method1528((byte) 54);
        class242.method1701(104);
        class114.method901(0);
        class44.method347(-77);
        class240.method1681();
        class48.method368(3194);
        class154.method1132(false);
        class94.method658(113);
        class202.method1411(1);
        class36.method286((byte) -33);
        class258.method1787((byte) -90);
        class76.method550(-120);
        class215.method1493(-117);
        class116.method912(-1);
        class108.method830((byte) -45);
        class70.method480(-25309);
        class180.method1277((byte) -101);
        class19.method141(-12052);
        class105.method781((byte) 99);
        class5.method58(-112);
        class41.method319(99);
        class250.method1746((byte) -117);
        class66.method460();
        class143.method1060((byte) -104);
        class71.method482(16589);
        class254.method1766((byte) -88);
        class40.method316((byte) 15);
        class145.method1070(125);
        class149.method1093(-1);
        class43.method336(78);
        class60.method435((byte) -119);
        class38.method302(0);
        class156.method1137(15826);
        class226.method1538(false);
        class63.method448();
        class178.method1271((byte) -118);
        class2.method14((byte) -114);
        class277.method1876((byte) -127);
        class4.method53((byte) 107);
        class50.method383(-126);
        class46.method357(true);
        class152.method1113(false);
        class144.method1068(-1);
        class54.method404((byte) 36);
        class151.method1111(-1);
        class192.method1342(128);
        class173.method1233((byte) -103);
        class167.method1205(16384);
        class26.method177(-11237);
        class34.method259(false);
        class57.method422(1);
        class27.method181((byte) -125);
        class82.method580((byte) 26);
        class225.method1533(0);
        class206.method1423((byte) 87);
        class65.method456((byte) 125);
        class81.method568();
        class274.method1863(117);
        class179.method1273(22739);
        class55.method412(1);
        class39.method310((byte) 35);
        class15.method111(64);
        class56.method416((byte) 62);
        class88.method628();
        class125.method963();
        class164.method1185();
        class163.method1184(80);
        class85.method620(-4);
        class7.method65(0);
        class184.method1296();
        class172.method1230();
        class122.method931((byte) 71);
        class130.method983(1);
        class175.method1250((byte) 10);
        class214.method1487(-1);
        class89.method629(1059);
        class14.method108((byte) 59);
        class6.method60(-30023);
        class45.method354(-14);
        class77.method553(7391);
        class233.method1582((byte) -8);
        class194.method1356(true);
        class232.method1580(false);
        class248.method1737((byte) -95);
        class29.method188(false);
        class185.method1305((byte) 109);
        class80.method567((byte) -93);
        class171.method1221(0);
        class256.method1786((byte) 123);
        class73.method528(-87);
        class221.method1523((byte) -116);
        class49.method376(-65);
        class25.method172(32);
        class266.method1829((byte) -114);
        class245.method1719(-1010);
        class1.method5((byte) -123);
        class140.method1040(false);
        class230.method1573((byte) -34);
        class17.method112(-31873);
        class68.method473(-1114);
        class10.method81((byte) -53);
        class244.method1712((byte) -109);
        class79.method560(-18445);
        class20.method147(8576);
        class270.method1846((byte) 74);
        class188.method1326(-21961);
        class91.method644((byte) 70);
        class9.method72((byte) -71);
        class127.method971((byte) -104);
        class259.method1790(30908);
        class269.method1843((byte) 124);
        class118.method918(5);
        class264.method1822(1);
        class141.method1047(false);
        class119.method923(true);
        class153.method1122((byte) -93);
        class23.method165(-29565);
        class117.method916(false);
        class139.method1035(false);
        class83.method587((byte) -120);
        class21.method152(-127);
        class220.method1516(true);
        class90.method638((byte) -75);
        class201.method1410(-239461552);
        class231.method1576(-21116);
        class241.method1697(0);
        class31.method208(-1);
        class32.method212((byte) 126);
        class61.method438((byte) -119);
        class92.method650(1);
        class224.method1531(78);
        class162.method1181((byte) 127);
        class176.method1258(-1384);
        class137.method1024(-978741881);
        class189.method1335(-20504);
        class128.method979((byte) 27);
        class271.method1849(-18421);
        class135.method1011(-12983);
        class165.method1188(733712108);
        class237.method1613((byte) -82);
        class101.method765(-4952);
        if (class100.field1720) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method820(byte arg0, int arg1) {
        class165.field2913 = null;
        if (arg0 <= 51) {
            field1998 = null;
        }
        class181.field3128.field1661 = arg1;
        class4.field90 = null;
        field1991++;
        class181.field3128.field1660++;
        class122.field2272 = 0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lw;)Lw;")
    public static final class107 method821(class107 arg0) {
        int var1 = class141.method1045(27935, method817(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class55.method408(arg0.field1827, 251234864);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method822(int arg0) {
        if (arg0 != 23675) {
            method821((class107) null);
        }
        field1998 = null;
        field1997 = null;
        field1999 = null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method823(int arg0) {
        field1980++;
        if (class90.field1500 == null) {
            return;
        }
        if (class100.field1690 < 10) {
            if (!class201.field3482.method38(99, class90.field1500.field4623)) {
                class100.field1690 = class246.field4270.method31(class90.field1500.field4623, arg0 ^ 0xFFFFFF8C) / 10;
                return;
            }
            class213.method1482(true);
            class100.field1690 = 10;
        }
        if (class100.field1690 == 10) {
            class146.field2592 = class90.field1500.field4631 >> 6 << 6;
            class179.field3091 = class90.field1500.field4624 >> 6 << 6;
            class176.field3068 = (class90.field1500.field4635 >> 6 << 6) + 64 - class146.field2592;
            class121.field2232 = 8.0F;
            class180.field3097 = 8.0F;
            int var1 = class176.field3068 + class146.field2592 - class225.field3832 - (class236.field4047.field4533 >> 7) - 1;
            int var2 = (class236.field4047.field4511 >> 7) + class196.field3383 - class179.field3091;
            class140.field2500 = (class90.field1500.field4636 >> 6 << 6) + 64 - class179.field3091;
            int var3 = var2 + (int) (Math.random() * 10.0D) - 5;
            int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
            if (var3 >= 0 && var3 < class140.field2500 && var4 >= 0 && var4 < class176.field3068) {
                class200.field3481 = var4;
                class137.field2456 = var3;
            } else {
                class200.field3481 = class146.field2592 - (class90.field1500.field4639 * 64 - (class176.field3068 - 1));
                class137.field2456 = class90.field1500.field4621 * 64 - class179.field3091;
            }
            class94.method662(-1);
            int var5 = class140.field2500 >> 6;
            int var6 = class176.field3068 >> 6;
            class9.field159 = new byte[var5][var6][];
            class207.field3574 = new int[var5][var6][];
            class32.field500 = new byte[var5][var6][];
            class210.field3622 = new int[var5][var6][];
            class247.field4280 = new int[class268.field4660 + 1];
            class45.field775 = new byte[var5][var6][];
            class38.field653 = new byte[var5][var6][];
            int var7 = class192.field3322 >> 2 << 10;
            class106.field1807 = new short[var5][var6][];
            int var8 = class239.field4159 >> 1;
            class75.field1298 = new byte[var5][var6][];
            class202.method1412(var8, true, var7);
            class100.field1690 = 20;
        } else if (class100.field1690 == 20) {
            class96.method673(new class239(class201.field3482.method30(class90.field1500.field4623, class148.field2615, 0)), -21830);
            class100.field1690 = 30;
            class152.method1114(true, 0);
            class256.method1782((byte) 20);
        } else if (class100.field1690 == 30) {
            class46.method355(new class239(class201.field3482.method30(class90.field1500.field4623, class57.field1000, 0)), 1);
            class100.field1690 = 40;
            class256.method1782((byte) 20);
        } else if (class100.field1690 == 40) {
            class146.method1077(new class239(class201.field3482.method30(class90.field1500.field4623, class159.field2769, 0)), (byte) -110);
            class100.field1690 = 50;
            class256.method1782((byte) 20);
        } else if (class100.field1690 == 50) {
            class97.method737(false, new class239(class201.field3482.method30(class90.field1500.field4623, class64.field1105, 0)));
            class100.field1690 = 60;
            class152.method1114(true, 0);
            class256.method1782((byte) 20);
        } else {
            if (arg0 != 1) {
                method824(88, -52, 46, 10, -7);
            }
            if (class100.field1690 == 60) {
                if (class201.field3482.method44(class36.method289(arg0 - 5616, new class96[] { class90.field1500.field4623, class186.field3254 }), (byte) -55)) {
                    if (!class201.field3482.method38(arg0 + 111, class36.method289(-5615, new class96[] { class90.field1500.field4623, class186.field3254 }))) {
                        return;
                    }
                    class227.field3870 = class11.method91(class36.method289(-5615, new class96[] { class90.field1500.field4623, class186.field3254 }), 100, class201.field3482);
                } else {
                    class227.field3870 = new class110(0);
                }
                class100.field1690 = 70;
                class256.method1782((byte) 20);
            } else if (class100.field1690 == 70) {
                class178.field3083 = new class111(11, true, class3.field28);
                class100.field1690 = 73;
                class152.method1114(true, 0);
                class256.method1782((byte) 20);
            } else if (class100.field1690 == 73) {
                class53.field935 = new class111(12, true, class3.field28);
                class100.field1690 = 76;
                class152.method1114(true, arg0 - 1);
                class256.method1782((byte) 20);
            } else if (class100.field1690 == 76) {
                class151.field2660 = new class111(14, true, class3.field28);
                class100.field1690 = 79;
                class152.method1114(true, 0);
                class256.method1782((byte) 20);
            } else if (class100.field1690 == 79) {
                class116.field2160 = new class111(17, true, class3.field28);
                class100.field1690 = 82;
                class152.method1114(true, 0);
                class256.method1782((byte) 20);
            } else if (class100.field1690 == 82) {
                class47.field838 = new class111(19, true, class3.field28);
                class100.field1690 = 85;
                class152.method1114(true, 0);
                class256.method1782((byte) 20);
            } else if (class100.field1690 == 85) {
                class3.field63 = new class111(22, true, class3.field28);
                class100.field1690 = 88;
                class152.method1114(true, 0);
                class256.method1782((byte) 20);
            } else if (class100.field1690 == 88) {
                class179.field3094 = new class111(26, true, class3.field28);
                class100.field1690 = 91;
                class152.method1114(true, 0);
                class256.method1782((byte) 20);
            } else {
                class154.field2717 = new class111(30, true, class3.field28);
                class100.field1690 = 100;
                class152.method1114(true, arg0 - 1);
                class256.method1782((byte) 20);
                class27.field455 = -1;
                class95.field1556 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1978++;
        if (!this.method760(-58)) {
            return;
        }
        class134.field2405 = Integer.parseInt(this.getParameter("worldid"));
        class44.field755 = Integer.parseInt(this.getParameter("modewhere"));
        if (class44.field755 < 0 || class44.field755 > 1) {
            class44.field755 = 0;
        }
        class226.field3855 = Integer.parseInt(this.getParameter("modewhat"));
        if (class226.field3855 < 0 || class226.field3855 > 2) {
            class226.field3855 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class254.field4390 = true;
        } else {
            class254.field4390 = false;
        }
        try {
            class156.field2722 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class156.field2722 = 0;
        }
        class195.method1359(class156.field2722, (byte) -18);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class5.field101 = true;
        } else {
            class5.field101 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class134.field2412 = true;
        } else {
            class134.field2412 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class239.field4097 = 1;
        } else {
            class239.field4097 = 0;
        }
        try {
            class73.field1255 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class73.field1255 = 0;
        }
        class192.field3320 = class189.field3312.method675(-4377, this);
        if (class192.field3320 == null) {
            class192.field3320 = class120.field2227;
        }
        String var5 = this.getParameter("haveie6");
        if (var5 != null && var5.equals("1")) {
            class207.field3576 = true;
        } else {
            class207.field3576 = false;
        }
        class242.field4209 = this;
        this.method759(503, -24856, 520, 765, class226.field3855 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method755(int arg0) {
        field1992++;
        class152.method1112(6270);
        if (arg0 > -24) {
            return;
        }
        class234.field4010 = new class132();
        class181.field3128 = new class97();
        class214.method1484(false, class234.field4017);
        if (class44.field755 == 0) {
            class27.field446 = this.getCodeBase().getHost();
            class47.field841 = 43594;
            class124.field2303 = 443;
        } else if (class44.field755 == 1) {
            class27.field446 = this.getCodeBase().getHost();
            class47.field841 = class134.field2405 + 40000;
            class124.field2303 = class134.field2405 + 50000;
        } else if (class44.field755 == 2) {
            class124.field2303 = class134.field2405 + 50000;
            class27.field446 = "127.0.0.1";
            class47.field841 = class134.field2405 + 40000;
        }
        if (class239.field4097 == 1) {
            class99.field1680 = class118.field2184;
            class225.field3825 = class91.field1512;
            class135.field2429 = class6.field128;
            class117.field2179 = class42.field714;
        } else {
            class99.field1680 = class47.field837;
            class135.field2429 = class254.field4386;
            class225.field3825 = class45.field771;
            class117.field2179 = class82.field1378;
        }
        class226.field3837 = class47.field841;
        if (class123.field2288 == 3 && class44.field755 != 2) {
            class235.field4032 = class134.field2405;
        }
        class232.field3981 = class124.field2303;
        class93.field1535 = class226.field3856 = class21.field362 = class198.field3461 = new short[256];
        class207.field3575 = class27.field446;
        class208.field3582 = class47.field841;
        class121.field2239 = class208.field3582;
        class83.method588(0);
        class56.method415(2, class3.field28);
        class71.method485(125, class3.field28);
        class229.field3891 = class198.method1389((byte) -123);
        if (class229.field3891 != null) {
            class229.field3891.method959(class3.field28, (byte) 96);
        }
        class140.field2513 = class123.field2288;
        try {
            if (class234.field4017.field2274 != null) {
                class206.field3531 = new class106(class234.field4017.field2274, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class242.field4208[var2] = new class106(class234.field4017.field2287[var2], 6000, 0);
                }
                class221.field3768 = new class106(class234.field4017.field2284, 6000, 0);
                class277.field4849 = new class276(255, class206.field3531, class221.field3768, 500000);
                class213.field3668 = new class106(class234.field4017.field2280, 24, 0);
                class234.field4017.field2280 = null;
                class234.field4017.field2284 = null;
                class234.field4017.field2274 = null;
                class234.field4017.field2287 = null;
            }
        } catch (IOException var3) {
            class277.field4849 = null;
            class221.field3768 = null;
            class213.field3668 = null;
            class206.field3531 = null;
        }
        class98.field1668 = class245.field4261;
        if (class44.field755 != 0) {
            class56.field979 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIII)V")
    public static final void method824(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class140.field2505.field4124 = 0;
        int var5 = -69 / ((12 - arg1) / 50);
        field1984++;
        class140.field2505.method1652(64, (byte) 41);
        class140.field2505.method1652(arg3, (byte) 41);
        class140.field2505.method1652(arg0, (byte) 41);
        class140.field2505.method1632(true, arg2);
        class140.field2505.method1632(true, arg4);
        class187.field3258 = 0;
        class106.field1800 = 1;
        class77.field1322 = -3;
        class5.field107 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method756(boolean arg0) {
        if (!arg0) {
            field1983 = -56;
        }
        field1996++;
        if (class101.field1729 == 1000) {
            return;
        }
        class236.field4053++;
        if ((class236.field4053 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class31.field497 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class23.field391.setSeed((long) class31.field497);
        }
        this.method818(-103);
        if (class219.field3745 != null) {
            class219.field3745.method291(0);
        }
        class39.method304(0);
        class135.method1009((byte) 3);
        class5.method56((byte) -91);
        class58.method425(31975);
        if (class229.field3891 != null) {
            int var3 = class229.field3891.method954((byte) 80);
            class208.field3587 = var3;
        }
        if (class101.field1729 == 0) {
            this.method816((byte) 50);
            class256.method1782((byte) 20);
        } else if (class101.field1729 == 5) {
            this.method816((byte) 50);
            class256.method1782((byte) 20);
        } else if (class101.field1729 == 25 || class101.field1729 == 28) {
            class200.method1394(false);
        }
        if (class101.field1729 == 10) {
            this.method825(-122);
            class236.method1600((byte) -46);
            class193.method1347(0);
            class57.method417((byte) -101);
        } else if (class101.field1729 == 30) {
            class267.method1832((byte) -97);
        } else if (class101.field1729 == 40) {
            class57.method417((byte) -83);
            if (class25.field424 != -3) {
                if (class25.field424 == 15) {
                    class247.method1731(0);
                } else if (class25.field424 != 2) {
                    class74.method533((byte) 62);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method825(int arg0) {
        class121.field2240 = 0;
        if (arg0 > -110) {
            return;
        }
        while (class127.method970(-57) && class121.field2240 < 128) {
            class206.field3539[class121.field2240] = class1.field9;
            class234.field4006[class121.field2240] = class145.field2579;
            class121.field2240++;
        }
        class62.field1063++;
        if (class107.field1825 != -1) {
            class90.method640(0, class107.field1825, class168.field2954, 0, class232.field3979, 5415, 0, 0);
        }
        field1989++;
        class67.field1137++;
        class50.method382(true);
        while (true) {
            class116 var2;
            class107 var3;
            class107 var4;
            do {
                var2 = (class116) class210.field3616.method1815(9);
                if (var2 == null) {
                    while (true) {
                        class116 var5;
                        class107 var6;
                        class107 var7;
                        do {
                            var5 = (class116) class269.field4684.method1815(9);
                            if (var5 == null) {
                                while (true) {
                                    class116 var8;
                                    class107 var9;
                                    class107 var10;
                                    do {
                                        var8 = (class116) class47.field830.method1815(9);
                                        if (var8 == null) {
                                            if (class90.field1494 != null) {
                                                class55.method409(-1);
                                            }
                                            if (class236.field4038 != null && class236.field4038.field4605 == 1) {
                                                if (class236.field4038.field4604 != null) {
                                                    class76.method552(class22.field385, (byte) -128, class122.field2247);
                                                }
                                                class122.field2247 = null;
                                                class236.field4038 = null;
                                                class22.field385 = false;
                                            }
                                            if (class236.field4053 % 1500 == 0) {
                                                class162.method1182(124);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2158;
                                        if (var9.field1974 < 0) {
                                            break;
                                        }
                                        var10 = class55.method408(var9.field1827, 251234864);
                                    } while (var10 == null || var10.field1842 == null || var10.field1842.length <= var9.field1974 || var10.field1842[var9.field1974] != var9);
                                    class141.method1044(var8, (byte) 76);
                                }
                            }
                            var6 = var5.field2158;
                            if (var6.field1974 < 0) {
                                break;
                            }
                            var7 = class55.method408(var6.field1827, 251234864);
                        } while (var7 == null || var7.field1842 == null || var6.field1974 >= var7.field1842.length || var7.field1842[var6.field1974] != var6);
                        class141.method1044(var5, (byte) 76);
                    }
                }
                var3 = var2.field2158;
                if (var3.field1974 < 0) {
                    break;
                }
                var4 = class55.method408(var3.field1827, 251234864);
            } while (var4 == null || var4.field1842 == null || var4.field1842.length <= var3.field1974 || var4.field1842[var3.field1974] != var3);
            class141.method1044(var2, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method758(int arg0) {
        if (class15.field229 != null) {
            class15.field229.field408 = false;
        }
        class15.field229 = null;
        if (class211.field3638 != null) {
            class211.field3638.method1605(58);
            class211.field3638 = null;
        }
        field1986++;
        class41.method320((byte) 37, class3.field28);
        class276.method1870(class3.field28, -1);
        if (class229.field3891 != null) {
            class229.field3891.method955(class3.field28, 26871);
        }
        class221.method1518(0);
        class11.method93(-103);
        class229.field3891 = null;
        if (class20.field335 != null) {
            class20.field335.method543((byte) 48);
        }
        if (arg0 <= 84) {
            this.method764(-61);
        }
        if (class80.field1362 != null) {
            class80.field1362.method543((byte) 48);
        }
        class181.field3128.method732(4096);
        class234.field4010.method989(-1313409465);
        try {
            if (class206.field3531 != null) {
                class206.field3531.method796(2);
            }
            if (class242.field4208 != null) {
                for (int var2 = 0; var2 < class242.field4208.length; var2++) {
                    if (class242.field4208[var2] != null) {
                        class242.field4208[var2].method796(2);
                    }
                }
            }
            if (class221.field3768 != null) {
                class221.field3768.method796(2);
            }
            if (class213.field3668 != null) {
                class213.field3668.method796(2);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lw;IIIIIII)V")
    public static final void method826(class107[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class107 var9 = arg0[var8];
            if (var9 != null && var9.field1827 == arg1 && (!var9.field1867 || var9.field1833 == 0 || var9.field1976 || method817(var9) != 0 || class194.field3347 == var9 || var9.field1869 == 1338) && (!var9.field1867 || !method814(var9))) {
                int var10 = var9.field1942 + arg6;
                int var11 = var9.field1945 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1833 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1856 + var10;
                    int var17 = var9.field1919 + var11;
                    if (var9.field1833 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class90.field1494 == var9) {
                    class20.field322 = true;
                    class243.field4213 = var10;
                    class170.field2987 = var11;
                }
                if (!var9.field1867 || var12 < var14 && var13 < var15) {
                    if (var9.field1833 == 0) {
                        if (!var9.field1867 && method814(var9) && class92.field1528 != var9) {
                            continue;
                        }
                        if (var9.field1970 && class17.field244 >= var12 && class214.field3684 >= var13 && class17.field244 < var14 && class214.field3684 < var15) {
                            for (class116 var18 = (class116) class47.field830.method1811(2); var18 != null; var18 = (class116) class47.field830.method1810(false)) {
                                if (var18.field2153) {
                                    var18.method1743((byte) 109);
                                }
                            }
                            if (class252.field4361 == 0) {
                                class90.field1494 = null;
                                class194.field3347 = null;
                            }
                            class32.field503 = false;
                            class213.field3673 = null;
                        }
                    }
                    if (var9.field1867) {
                        boolean var19;
                        if (class17.field244 >= var12 && class214.field3684 >= var13 && class17.field244 < var14 && class214.field3684 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class40.field692 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class272.field4734 == 1 && class167.field2950 >= var12 && class272.field4722 >= var13 && class167.field2950 < var14 && class272.field4722 < var15) {
                            var21 = true;
                        }
                        if (class121.field2240 > 0 && var9.field1956 != null) {
                            for (int var22 = 0; var22 < var9.field1956.length; var22++) {
                                for (int var23 = 0; var23 < class121.field2240; var23++) {
                                    int var24 = var9.field1956[var22] & 0xFF;
                                    if (class206.field3539[var23] == var24) {
                                        if (var9.field1838 != null) {
                                            byte var25 = var9.field1838[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class233.field3990[86] || (var25 & 0x1) != 0 && !class233.field3990[82] || (var25 & 0x4) != 0 && !class233.field3990[81])) {
                                                continue;
                                            }
                                        }
                                        class85.method615(class120.field2227, var22 + 1, var9.field1896, -1, true);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class206.method1422(class167.field2950 - var10, class272.field4722 - var11, false, var9);
                        }
                        if (class90.field1494 != null && class90.field1494 != var9 && var19 && class162.method1176((byte) -54, method817(var9))) {
                            class239.field4161 = var9;
                        }
                        if (class194.field3347 == var9) {
                            class269.field4695 = true;
                            class269.field4693 = var10;
                            class21.field355 = var11;
                        }
                        if (var9.field1976 || var9.field1869 != 0) {
                            if (var19 && class208.field3587 != 0 && var9.field1902 != null) {
                                class116 var26 = new class116();
                                var26.field2153 = true;
                                var26.field2158 = var9;
                                var26.field2167 = class208.field3587;
                                var26.field2155 = var9.field1902;
                                class47.field830.method1814(1, var26);
                            }
                            if (class90.field1494 != null || class48.field847 != null || class170.field2981 || var9.field1869 != 1400 && class32.field503) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1869 != 0) {
                                if (var9.field1869 == 1337) {
                                    class222.field3798 = var9;
                                    class53.method403(-62, var9);
                                    continue;
                                }
                                if (var9.field1869 == 1338) {
                                    if (var21) {
                                        class213.field3673 = var9;
                                        class203.field3509 = class167.field2950 - var10;
                                        class110.field2039 = class272.field4722 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1869 == 1400) {
                                    class203.field3523 = var9;
                                    if (var21) {
                                        if (class233.field3990[82] && class254.field4389 > 0) {
                                            int var27 = (int) ((double) (class167.field2950 - var10 - var9.field1856 / 2) * 2.0D / (double) class121.field2232);
                                            int var28 = (int) ((double) (class272.field4722 - var11 - var9.field1919 / 2) * 2.0D / (double) class121.field2232);
                                            int var29 = class137.field2456 + var27;
                                            int var30 = class200.field3481 + var28;
                                            int var31 = class179.field3091 + var29;
                                            int var32 = class176.field3068 + class146.field2592 - var30 - 1;
                                            class213.method1480(var31, var32, -5, 0);
                                            class47.method363(30797);
                                            continue;
                                        }
                                        class32.field503 = true;
                                        class187.field3256 = class17.field244;
                                        class57.field1011 = class214.field3684;
                                        class80.field1355 = class137.field2456;
                                        class118.field2189 = class200.field3481;
                                        continue;
                                    }
                                    if (var20 && class32.field503) {
                                        class68.method472(-8085, (int) ((double) (class187.field3256 - class17.field244) * 2.0D / (double) class180.field3097) + class80.field1355);
                                        class183.method1291(-1, (int) ((double) (class57.field1011 - class214.field3684) * 2.0D / (double) class180.field3097) + class118.field2189);
                                        continue;
                                    }
                                    class32.field503 = false;
                                    continue;
                                }
                                if (var9.field1869 == 1401) {
                                    if (var20) {
                                        class46.method356(class214.field3684 - var11, 12114, var9.field1856, var9.field1919, class17.field244 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field1869 == 1402) {
                                    class53.method403(-124, var9);
                                    continue;
                                }
                            }
                            if (!var9.field1829 && var21) {
                                var9.field1829 = true;
                                if (var9.field1819 != null) {
                                    class116 var33 = new class116();
                                    var33.field2153 = true;
                                    var33.field2158 = var9;
                                    var33.field2152 = class167.field2950 - var10;
                                    var33.field2167 = class272.field4722 - var11;
                                    var33.field2155 = var9.field1819;
                                    class47.field830.method1814(1, var33);
                                }
                            }
                            if (var9.field1829 && var20 && var9.field1939 != null) {
                                class116 var34 = new class116();
                                var34.field2153 = true;
                                var34.field2158 = var9;
                                var34.field2152 = class17.field244 - var10;
                                var34.field2167 = class214.field3684 - var11;
                                var34.field2155 = var9.field1939;
                                class47.field830.method1814(1, var34);
                            }
                            if (var9.field1829 && !var20) {
                                var9.field1829 = false;
                                if (var9.field1887 != null) {
                                    class116 var35 = new class116();
                                    var35.field2153 = true;
                                    var35.field2158 = var9;
                                    var35.field2152 = class17.field244 - var10;
                                    var35.field2167 = class214.field3684 - var11;
                                    var35.field2155 = var9.field1887;
                                    class269.field4684.method1814(1, var35);
                                }
                            }
                            if (var20 && var9.field1941 != null) {
                                class116 var36 = new class116();
                                var36.field2153 = true;
                                var36.field2158 = var9;
                                var36.field2152 = class17.field244 - var10;
                                var36.field2167 = class214.field3684 - var11;
                                var36.field2155 = var9.field1941;
                                class47.field830.method1814(1, var36);
                            }
                            if (!var9.field1860 && var19) {
                                var9.field1860 = true;
                                if (var9.field1940 != null) {
                                    class116 var37 = new class116();
                                    var37.field2153 = true;
                                    var37.field2158 = var9;
                                    var37.field2152 = class17.field244 - var10;
                                    var37.field2167 = class214.field3684 - var11;
                                    var37.field2155 = var9.field1940;
                                    class47.field830.method1814(1, var37);
                                }
                            }
                            if (var9.field1860 && var19 && var9.field1820 != null) {
                                class116 var38 = new class116();
                                var38.field2153 = true;
                                var38.field2158 = var9;
                                var38.field2152 = class17.field244 - var10;
                                var38.field2167 = class214.field3684 - var11;
                                var38.field2155 = var9.field1820;
                                class47.field830.method1814(1, var38);
                            }
                            if (var9.field1860 && !var19) {
                                var9.field1860 = false;
                                if (var9.field1843 != null) {
                                    class116 var39 = new class116();
                                    var39.field2153 = true;
                                    var39.field2158 = var9;
                                    var39.field2152 = class17.field244 - var10;
                                    var39.field2167 = class214.field3684 - var11;
                                    var39.field2155 = var9.field1843;
                                    class269.field4684.method1814(1, var39);
                                }
                            }
                            if (var9.field1954 != null) {
                                class116 var40 = new class116();
                                var40.field2158 = var9;
                                var40.field2155 = var9.field1954;
                                class210.field3616.method1814(1, var40);
                            }
                            if (var9.field1881 != null && class4.field81 > var9.field1864) {
                                if (var9.field1893 == null || class4.field81 - var9.field1864 > 32) {
                                    class116 var45 = new class116();
                                    var45.field2158 = var9;
                                    var45.field2155 = var9.field1881;
                                    class47.field830.method1814(1, var45);
                                } else {
                                    label546: for (int var41 = var9.field1864; var41 < class4.field81; var41++) {
                                        int var42 = class73.field1253[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1893.length; var43++) {
                                            if (var9.field1893[var43] == var42) {
                                                class116 var44 = new class116();
                                                var44.field2158 = var9;
                                                var44.field2155 = var9.field1881;
                                                class47.field830.method1814(1, var44);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field1864 = class4.field81;
                            }
                            if (var9.field1859 != null && class33.field566 > var9.field1826) {
                                if (var9.field1885 == null || class33.field566 - var9.field1826 > 32) {
                                    class116 var50 = new class116();
                                    var50.field2158 = var9;
                                    var50.field2155 = var9.field1859;
                                    class47.field830.method1814(1, var50);
                                } else {
                                    label522: for (int var46 = var9.field1826; var46 < class33.field566; var46++) {
                                        int var47 = class15.field230[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1885.length; var48++) {
                                            if (var9.field1885[var48] == var47) {
                                                class116 var49 = new class116();
                                                var49.field2158 = var9;
                                                var49.field2155 = var9.field1859;
                                                class47.field830.method1814(1, var49);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field1826 = class33.field566;
                            }
                            if (var9.field1892 != null && class210.field3617 > var9.field1809) {
                                if (var9.field1898 == null || class210.field3617 - var9.field1809 > 32) {
                                    class116 var55 = new class116();
                                    var55.field2158 = var9;
                                    var55.field2155 = var9.field1892;
                                    class47.field830.method1814(1, var55);
                                } else {
                                    label498: for (int var51 = var9.field1809; var51 < class210.field3617; var51++) {
                                        int var52 = class243.field4212[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field1898.length; var53++) {
                                            if (var9.field1898[var53] == var52) {
                                                class116 var54 = new class116();
                                                var54.field2158 = var9;
                                                var54.field2155 = var9.field1892;
                                                class47.field830.method1814(1, var54);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field1809 = class210.field3617;
                            }
                            if (var9.field1913 != null && class213.field3672 > var9.field1815) {
                                if (var9.field1946 == null || class213.field3672 - var9.field1815 > 32) {
                                    class116 var60 = new class116();
                                    var60.field2158 = var9;
                                    var60.field2155 = var9.field1913;
                                    class47.field830.method1814(1, var60);
                                } else {
                                    label474: for (int var56 = var9.field1815; var56 < class213.field3672; var56++) {
                                        int var57 = class130.field2344[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field1946.length; var58++) {
                                            if (var9.field1946[var58] == var57) {
                                                class116 var59 = new class116();
                                                var59.field2158 = var9;
                                                var59.field2155 = var9.field1913;
                                                class47.field830.method1814(1, var59);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field1815 = class213.field3672;
                            }
                            if (var9.field1879 != null && class276.field4799 > var9.field1858) {
                                if (var9.field1938 == null || class276.field4799 - var9.field1858 > 32) {
                                    class116 var65 = new class116();
                                    var65.field2158 = var9;
                                    var65.field2155 = var9.field1879;
                                    class47.field830.method1814(1, var65);
                                } else {
                                    label450: for (int var61 = var9.field1858; var61 < class276.field4799; var61++) {
                                        int var62 = class243.field4214[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1938.length; var63++) {
                                            if (var9.field1938[var63] == var62) {
                                                class116 var64 = new class116();
                                                var64.field2158 = var9;
                                                var64.field2155 = var9.field1879;
                                                class47.field830.method1814(1, var64);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field1858 = class276.field4799;
                            }
                            if (class92.field1530 > var9.field1953 && var9.field1909 != null) {
                                class116 var66 = new class116();
                                var66.field2158 = var9;
                                var66.field2155 = var9.field1909;
                                class47.field830.method1814(1, var66);
                            }
                            if (class208.field3588 > var9.field1953 && var9.field1957 != null) {
                                class116 var67 = new class116();
                                var67.field2158 = var9;
                                var67.field2155 = var9.field1957;
                                class47.field830.method1814(1, var67);
                            }
                            if (class259.field4493 > var9.field1953 && var9.field1836 != null) {
                                class116 var68 = new class116();
                                var68.field2158 = var9;
                                var68.field2155 = var9.field1836;
                                class47.field830.method1814(1, var68);
                            }
                            if (class93.field1540 > var9.field1953 && var9.field1889 != null) {
                                class116 var69 = new class116();
                                var69.field2158 = var9;
                                var69.field2155 = var9.field1889;
                                class47.field830.method1814(1, var69);
                            }
                            if (class181.field3131 > var9.field1953 && var9.field1853 != null) {
                                class116 var70 = new class116();
                                var70.field2158 = var9;
                                var70.field2155 = var9.field1853;
                                class47.field830.method1814(1, var70);
                            }
                            var9.field1953 = class67.field1137;
                            if (var9.field1929 != null) {
                                for (int var71 = 0; var71 < class121.field2240; var71++) {
                                    class116 var72 = new class116();
                                    var72.field2158 = var9;
                                    var72.field2161 = class206.field3539[var71];
                                    var72.field2156 = class234.field4006[var71];
                                    var72.field2155 = var9.field1929;
                                    class47.field830.method1814(1, var72);
                                }
                            }
                            if (class68.field1181 && var9.field1920 != null) {
                                class116 var73 = new class116();
                                var73.field2158 = var9;
                                var73.field2155 = var9.field1920;
                                class47.field830.method1814(1, var73);
                            }
                        }
                    }
                    if (!var9.field1867 && class90.field1494 == null && class48.field847 == null && !class170.field2981) {
                        if ((var9.field1916 >= 0 || var9.field1846 != 0) && class17.field244 >= var12 && class214.field3684 >= var13 && class17.field244 < var14 && class214.field3684 < var15) {
                            if (var9.field1916 >= 0) {
                                class92.field1528 = arg0[var9.field1916];
                            } else {
                                class92.field1528 = var9;
                            }
                        }
                        if (var9.field1833 == 8 && class17.field244 >= var12 && class214.field3684 >= var13 && class17.field244 < var14 && class214.field3684 < var15) {
                            class143.field2538 = var9;
                        }
                        if (var9.field1850 > var9.field1919) {
                            class254.method1765(class214.field3684, var9.field1850, var11, -104, var9.field1856 + var10, var9, class17.field244, var9.field1919);
                        }
                    }
                    if (var9.field1833 == 0) {
                        method826(arg0, var9.field1896, var12, var13, var14, var15, var10 - var9.field1937, var11 - var9.field1934);
                        if (var9.field1842 != null) {
                            method826(var9.field1842, var9.field1896, var12, var13, var14, var15, var10 - var9.field1937, var11 - var9.field1934);
                        }
                        class168 var74 = (class168) class34.field606.method1081(0, (long) var9.field1896);
                        if (var74 != null) {
                            class90.method640(var13, var74.field2961, var15, var11, var14, 5415, var12, var10);
                        }
                    }
                }
            }
        }
    }
}
