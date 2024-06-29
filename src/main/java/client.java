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
public class client extends class12 {

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[Le;")
    public static class248[] field2063 = new class248[29];

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
    public static boolean field2070 = false;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    public static int field2060 = 1;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lqh;")
    public static class35 field2073;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
    public static boolean field2083;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method889(int arg0, int arg1, int arg2, int arg3) {
        field2081++;
        if (class101.field1457 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class148.field2392[1][var5][var4] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg0 & 0x7F;
        int var8 = arg2 & 0x7F;
        if (arg3 >= -98) {
            method891((class264) null);
        }
        int var9 = (128 - var7) * class101.field1457[var6][var5][var4] + class101.field1457[var6][var5 + 1][var4] * var7 >> 7;
        int var10 = (128 - var7) * class101.field1457[var6][var5][var4 + 1] + class101.field1457[var6][var5 + 1][var4 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 43)
    public static final void main(String[] arg0) {
        field2079++;
        try {
            if (arg0.length != 4) {
                class352.method2462("argument count", -124);
            }
            class21.field269 = Integer.parseInt(arg0[0]);
            class290.field4818 = 2;
            if (arg0[1].equals("live")) {
                class343.field5513 = 0;
            } else if (arg0[1].equals("rc")) {
                class343.field5513 = 1;
            } else if (arg0[1].equals("wip")) {
                class343.field5513 = 2;
            } else {
                class352.method2462("modewhat", -98);
            }
            class219.field3371 = false;
            class334.field5418 = class325.method2326(arg0[2], (byte) -115);
            if (class334.field5418 == -1) {
                if (arg0[2].equals("english")) {
                    class334.field5418 = 0;
                } else if (arg0[2].equals("german")) {
                    class334.field5418 = 1;
                } else {
                    class352.method2462("language", -121);
                }
            }
            class45.method341(class334.field5418, (byte) -125);
            class228.field3597 = false;
            class5.field60 = false;
            if (arg0[3].equals("game0")) {
                class179.field2789 = 0;
            } else if (arg0[3].equals("game1")) {
                class179.field2789 = 1;
            } else {
                class352.method2462("game", -106);
            }
            class258.field4093 = false;
            class219.field3370 = "";
            class166.field2612 = 0;
            class289.field4807 = 0;
            client var1 = new client();
            class96.field1394 = var1;
            var1.method79(29, 548, false, false, 1024, 768, class179.field2789 == 1 ? "mechscape" : "runescape", class343.field5513 + 32);
            class217.field3350.setLocation(40, 40);
        } catch (Exception var3) {
            class326.method2328(var3, (String) null, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 112)
    private final void method890(byte[] arg0, int arg1) {
        class313 var3 = new class313(arg0);
        field2067++;
        while (true) {
            int var4 = var3.method2224(-120);
            if (var4 == 0) {
                int var5 = -9 / ((59 - arg1) / 44);
                return;
            }
            if (var4 == 1) {
                int[] var6 = class322.field5297 = new int[6];
                var6[0] = var3.method2250(-1613178296);
                var6[1] = var3.method2250(-1613178296);
                var6[2] = var3.method2250(-1613178296);
                var6[3] = var3.method2250(-1613178296);
                var6[4] = var3.method2250(-1613178296);
                var6[5] = var3.method2250(-1613178296);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 149)
    public final void init() {
        field2082++;
        if (!this.method80((byte) -123)) {
            return;
        }
        class21.field269 = Integer.parseInt(this.getParameter("worldid"));
        class290.field4818 = Integer.parseInt(this.getParameter("modewhere"));
        if (class290.field4818 < 0 || class290.field4818 > 1) {
            class290.field4818 = 0;
        }
        class343.field5513 = Integer.parseInt(this.getParameter("modewhat"));
        if (class343.field5513 < 0 || class343.field5513 > 2) {
            class343.field5513 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class219.field3371 = true;
        } else {
            class219.field3371 = false;
        }
        try {
            class334.field5418 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class334.field5418 = 0;
        }
        class45.method341(class334.field5418, (byte) 121);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class228.field3597 = true;
        } else {
            class228.field3597 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class5.field60 = true;
        } else {
            class5.field60 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class179.field2789 = 1;
        } else {
            class179.field2789 = 0;
        }
        try {
            class289.field4807 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class289.field4807 = 0;
        }
        class219.field3370 = this.getParameter("settings");
        if (class219.field3370 == null) {
            class219.field3370 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class166.field2612 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class166.field2612 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class258.field4093 = true;
        } else {
            class258.field4093 = false;
        }
        class96.field1394 = this;
        this.method81(1035801098, 503, 1548, 765, class343.field5513 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsi;)Z", line = 233)
    public static final boolean method891(class264 arg0) {
        if (class172.field2693) {
            if (method898(arg0).field1155 != 0) {
                return false;
            }
            if (arg0.field4350 == 0) {
                return false;
            }
        }
        return arg0.field4181;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 247)
    private final void method892(int arg0) {
        if (!class115.field1689) {
            label243: while (true) {
                do {
                    if (!class261.method1835((byte) 61)) {
                        break label243;
                    }
                } while (class293.field4856 != 's' && class293.field4856 != 'S');
                class115.field1689 = true;
            }
        }
        field2069++;
        if (class124.field1836 == 0) {
            Runtime var27 = Runtime.getRuntime();
            int var28 = (int) ((var27.totalMemory() - var27.freeMemory()) / 1024L);
            long var29 = class19.method122(-12169);
            if (class251.field4013 == 0L) {
                class251.field4013 = var29;
            }
            if (var28 > 16384 && (var29 - class251.field4013) < 5000L) {
                if ((var29 - class220.field3379) > 1000L) {
                    System.gc();
                    class220.field3379 = var29;
                }
                class353.field5618 = 5;
                class98.field1411 = class102.field1476;
            } else {
                class98.field1411 = class105.field1523;
                class124.field1836 = 10;
                class353.field5618 = 5;
            }
        } else if (class124.field1836 == 10) {
            for (int var2 = 0; var2 < 4; var2++) {
                class124.field1860[var2] = new class154(104, 104);
            }
            class353.field5618 = 10;
            class98.field1411 = class138.field2174;
            class124.field1836 = 30;
        } else if (class124.field1836 == 30) {
            if (class113.field1658 == null) {
                class113.field1658 = new class282(class267.field4400, class326.field5343);
            }
            if (class113.field1658.method1996(63)) {
                class157.field2522 = class91.method601(0, true, true, (byte) -66, false);
                class270.field4457 = class91.method601(1, true, true, (byte) -38, false);
                class165.field2601 = class91.method601(2, false, true, (byte) -76, true);
                class141.field2269 = class91.method601(3, true, true, (byte) 104, false);
                class99.field1433 = class91.method601(4, true, true, (byte) 120, false);
                class97.field1406 = class91.method601(5, true, true, (byte) 105, true);
                class310.field5042 = class91.method601(6, true, false, (byte) 92, true);
                class248.field3951 = class91.method601(7, true, true, (byte) -30, false);
                class69.field1073 = class91.method601(8, true, true, (byte) -36, false);
                class319.field5247 = class91.method601(9, true, true, (byte) 107, false);
                class253.field4020 = class91.method601(10, true, true, (byte) 98, false);
                class132.field2031 = class91.method601(11, true, true, (byte) 113, false);
                class249.field3959 = class91.method601(12, true, true, (byte) 96, false);
                class71.field1099 = class91.method601(13, true, true, (byte) 99, false);
                class102.field1470 = class91.method601(14, true, false, (byte) 119, false);
                class307.field5002 = class91.method601(15, true, true, (byte) 110, false);
                class105.field1525 = class91.method601(16, true, true, (byte) -15, false);
                class202.field3109 = class91.method601(17, true, true, (byte) 99, false);
                class310.field5043 = class91.method601(18, true, true, (byte) -47, false);
                class278.field4582 = class91.method601(19, true, true, (byte) -20, false);
                class166.field2608 = class91.method601(20, true, true, (byte) -88, false);
                class276.field4550 = class91.method601(21, true, true, (byte) 101, false);
                class266.field4369 = class91.method601(22, true, true, (byte) 117, false);
                class55.field833 = class91.method601(23, true, true, (byte) -55, true);
                class102.field1473 = class91.method601(24, true, true, (byte) -21, false);
                class116.field1697 = class91.method601(25, true, true, (byte) -108, false);
                class58.field883 = class91.method601(26, true, true, (byte) -117, true);
                class350.field5598 = class91.method601(27, true, true, (byte) -127, false);
                class268.field4406 = class91.method601(28, true, true, (byte) 115, true);
                class98.field1411 = class187.field2912;
                class353.field5618 = 15;
                class124.field1836 = 40;
            } else {
                class353.field5618 = 12;
                class98.field1411 = class250.field3995;
            }
        } else {
            int var3 = 23 / ((-arg0 - 51) / 53);
            if (class124.field1836 == 40) {
                int var4 = 0;
                for (int var5 = 0; var5 < 29; var5++) {
                    var4 += class291.field4830[var5].method1442(111) * class206.field3130[var5] / 100;
                }
                if (var4 == 100) {
                    class98.field1411 = class83.field1202;
                    class353.field5618 = 20;
                    class356.method2483(class69.field1073, 1);
                    class358.method2488(8, class69.field1073);
                    class183.method1271(class69.field1073, (byte) 54);
                    class124.field1836 = 41;
                } else {
                    class353.field5618 = 20;
                    if (var4 != 0) {
                        class98.field1411 = class56.field864 + var4 + "%";
                    }
                }
            } else if (class124.field1836 == 41) {
                if (class268.field4406.method1491(17970)) {
                    this.method890(class268.field4406.method1513(1, true), 125);
                    class98.field1411 = class167.field2637;
                    class124.field1836 = 45;
                    class353.field5618 = 25;
                } else {
                    class98.field1411 = class293.field4853 + class268.field4406.method1505((byte) 92) + "%";
                    class353.field5618 = 25;
                }
            } else if (class124.field1836 == 45) {
                class96.method634(2, true, 22050, class352.field5610);
                class340.field5465 = new class230();
                class340.field5465.method1565(9, 128, (byte) -26);
                class291.field4828 = class248.method1758(0, 22050, class96.field1382, false, class235.field3731);
                class291.field4828.method1095(class340.field5465, 0);
                class324.method2322(class99.field1433, class102.field1470, class340.field5465, 19062, class307.field5002);
                class15.field199 = class248.method1758(1, 2048, class96.field1382, false, class235.field3731);
                class28.field434 = new class208();
                class15.field199.method1095(class28.field434, 0);
                class131.field2012 = new class314(22050, class322.field5294);
                class281.field4625 = class310.field5042.method1510("scape main", 0);
                class124.field1836 = 50;
                class353.field5618 = 30;
                class98.field1411 = class261.field4122;
            } else if (class124.field1836 == 50) {
                int var6 = class28.method239(class69.field1073, class71.field1099, 0);
                int var7 = class311.method2170((byte) 64);
                if (var7 <= var6) {
                    class124.field1836 = 60;
                    class353.field5618 = 35;
                    class98.field1411 = class100.field1448;
                } else {
                    class353.field5618 = 35;
                    class98.field1411 = class111.field1640 + var6 * 100 / var7 + "%";
                }
            } else if (class124.field1836 == 60) {
                int var8 = class343.method2420((byte) 109, class69.field1073);
                int var9 = class170.method1173((byte) -115);
                if (var9 > var8) {
                    class98.field1411 = class178.field2779 + var8 * 100 / var9 + "%";
                    class353.field5618 = 40;
                } else {
                    class124.field1836 = 65;
                    class353.field5618 = 40;
                    class98.field1411 = class90.field1305;
                }
            } else if (class124.field1836 == 65) {
                class23.method209(-3213, class71.field1099, class69.field1073);
                class353.field5618 = 45;
                class98.field1411 = class350.field5594;
                class310.method2165(5, 5);
                class124.field1836 = 70;
            } else if (class124.field1836 == 70) {
                class165.field2601.method1491(17970);
                byte var15 = 0;
                int var16 = var15 + class165.field2601.method1505((byte) 100);
                class105.field1525.method1491(17970);
                int var17 = var16 + class105.field1525.method1505((byte) 79);
                class202.field3109.method1491(17970);
                int var18 = var17 + class202.field3109.method1505((byte) 123);
                class310.field5043.method1491(17970);
                int var19 = var18 + class310.field5043.method1505((byte) 113);
                class278.field4582.method1491(17970);
                int var20 = var19 + class278.field4582.method1505((byte) 77);
                class166.field2608.method1491(17970);
                int var21 = var20 + class166.field2608.method1505((byte) 108);
                class276.field4550.method1491(17970);
                int var22 = var21 + class276.field4550.method1505((byte) 102);
                class266.field4369.method1491(17970);
                int var23 = var22 + class266.field4369.method1505((byte) 101);
                class102.field1473.method1491(17970);
                int var24 = var23 + class102.field1473.method1505((byte) 80);
                class116.field1697.method1491(17970);
                int var25 = var24 + class116.field1697.method1505((byte) 74);
                class350.field5598.method1491(17970);
                int var26 = var25 + class350.field5598.method1505((byte) 112);
                if (var26 < 1100) {
                    class98.field1411 = class153.field2478 + var26 / 11 + "%";
                    class353.field5618 = 50;
                } else {
                    class69.method483(class165.field2601, (byte) 125);
                    class223.method1524(class165.field2601, true);
                    class171.method1180(class165.field2601, 22);
                    class221.method1490(class165.field2601, class248.field3951, 25491);
                    class159.method1127(class248.field3951, class105.field1525, true, (byte) -87);
                    class337.method2385(89, true, class248.field3951, class310.field5043);
                    class21.method136((byte) -108, class248.field3951, class115.field1686, true, class278.field4582);
                    class241.method1690(class165.field2601, -14);
                    class251.method1782((byte) -73, class166.field2608, class157.field2522, class270.field4457);
                    class58.method430(false, class165.field2601);
                    class280.method1991(true, class248.field3951, class276.field4550);
                    class199.method1361(class266.field4369, true);
                    class209.method1425(-26734, class165.field2601);
                    class154.method1109(class248.field3951, class141.field2269, (byte) -127, class69.field1073, class71.field1099);
                    class345.method2431(true, class165.field2601);
                    class326.method2329(class202.field3109, 0);
                    class178.method1251(new class355(), 84, class116.field1697, class102.field1473);
                    class172.method1187(class116.field1697, class102.field1473, 74);
                    class101.method660(class165.field2601, 0);
                    class218.method1473(class165.field2601, 31754);
                    class45.method343(-3, class165.field2601);
                    class347.method2444(class69.field1073, class165.field2601, 127);
                    class256.method1819(class165.field2601, -10, class69.field1073);
                    class228.method1549(10225, class69.field1073, class165.field2601);
                    class353.field5618 = 50;
                    class98.field1411 = class74.field1120;
                    class289.method2050((byte) -74);
                    class124.field1836 = 80;
                }
            } else if (class124.field1836 == 80) {
                int var13 = class102.method663((byte) -120, class69.field1073);
                int var14 = class287.method2033(14);
                if (var14 <= var13) {
                    class120.method776((byte) -70, class69.field1073);
                    class98.field1411 = class39.field603;
                    class124.field1836 = 90;
                    class353.field5618 = 60;
                } else {
                    class353.field5618 = 60;
                    class98.field1411 = class305.field4994 + var13 * 100 / var14 + "%";
                }
            } else if (class124.field1836 == 90) {
                if (class58.field883.method1491(17970)) {
                    class55 var10 = new class55(class319.field5247, class58.field883, class69.field1073, 20, !class115.field1680);
                    class272.method1930(var10);
                    if (class75.field1138 == 1) {
                        class272.method1931(0.9F);
                    }
                    if (class75.field1138 == 2) {
                        class272.method1931(0.8F);
                    }
                    if (class75.field1138 == 3) {
                        class272.method1931(0.7F);
                    }
                    if (class75.field1138 == 4) {
                        class272.method1931(0.6F);
                    }
                    class124.field1836 = 100;
                    class98.field1411 = class308.field5021;
                    class353.field5618 = 70;
                } else {
                    class98.field1411 = class47.field685 + class58.field883.method1505((byte) 123) + "%";
                    class353.field5618 = 70;
                }
            } else if (class124.field1836 == 100) {
                if (class6.method47(class69.field1073, 64)) {
                    class124.field1836 = 110;
                }
            } else if (class124.field1836 == 110) {
                class251.field4011 = new class69();
                class96.field1382.method1952(0, 10, class251.field4011);
                class353.field5618 = 75;
                class124.field1836 = 120;
                class98.field1411 = class356.field5641;
            } else if (class124.field1836 == 120) {
                if (class253.field4020.method1502("huffman", -1, "")) {
                    class5 var11 = new class5(class253.field4020.method1489("", true, "huffman"));
                    class291.method2062(0, var11);
                    class98.field1411 = class255.field4045;
                    class353.field5618 = 80;
                    class124.field1836 = 130;
                } else {
                    class98.field1411 = class191.field2959 + "0%";
                    class353.field5618 = 80;
                }
            } else if (class124.field1836 == 130) {
                if (!class141.field2269.method1491(17970)) {
                    class98.field1411 = class29.field440 + class141.field2269.method1505((byte) 123) * 3 / 4 + "%";
                    class353.field5618 = 85;
                } else if (!class249.field3959.method1491(17970)) {
                    class98.field1411 = class29.field440 + (class249.field3959.method1505((byte) 77) / 10 + 75) + "%";
                    class353.field5618 = 85;
                } else if (!class71.field1099.method1491(17970)) {
                    class98.field1411 = class29.field440 + (class71.field1099.method1505((byte) 90) / 20 + 85) + "%";
                    class353.field5618 = 85;
                } else if (class55.field833.method1517(126, "details")) {
                    class88.method581(class55.field833);
                    class145.method1025(class350.field5598);
                    class174.method1203(class248.field3951);
                    class98.field1411 = class281.field4624;
                    class353.field5618 = 95;
                    class124.field1836 = 135;
                } else {
                    class98.field1411 = class29.field440 + ((class55.field833.method1507("details", 0) / 10) + 90) + "%";
                    class353.field5618 = 85;
                }
            } else if (class124.field1836 == 135) {
                int var12 = class90.method597(0);
                if (var12 == -1) {
                    class98.field1411 = class119.field1766;
                    class353.field5618 = 95;
                } else if (var12 == 7 || var12 == 9) {
                    this.method83(-104, "worldlistfull");
                    class310.method2165(5, 1000);
                } else if (class25.field379) {
                    class353.field5618 = 96;
                    class124.field1836 = 140;
                    class98.field1411 = class161.field2573;
                } else {
                    this.method83(-104, "worldlistio_" + var12);
                    class310.method2165(5, 1000);
                }
            } else if (class124.field1836 == 140) {
                class319.field5254 = class141.field2269.method1510("loginscreen", 0);
                class97.field1406.method1516(false, true, true);
                class310.field5042.method1516(true, true, true);
                class69.field1073.method1516(true, true, true);
                class71.field1099.method1516(true, true, true);
                class253.field4020.method1516(true, true, true);
                class141.field2269.method1516(true, true, true);
                class353.field5618 = 97;
                class98.field1411 = class81.field1188;
                class258.field4086 = true;
                class124.field1836 = 150;
            } else if (class124.field1836 == 150) {
                class43.method334();
                if (class115.field1689) {
                    class306.field4997 = 0;
                    class70.field1094 = 0;
                    class295.field4901 = 0;
                    class31.field478 = 0;
                }
                class115.field1689 = true;
                class292.method2064(true, class96.field1382);
                class124.method801(-1, false, 0, -1, class295.field4901);
                class124.field1836 = 160;
                class353.field5618 = 100;
                class98.field1411 = class325.field5332;
            } else if (class124.field1836 == 160) {
                class203.method1384(82, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 769)
    private final void method893(byte arg0) {
        field2071++;
        if (arg0 != -26) {
            field2070 = false;
        }
        boolean var2 = class267.field4400.method2074(arg0 + 25);
        if (!var2) {
            this.method901(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 784)
    public static void method894(int arg0) {
        if (arg0 != -727542745) {
            main((String[]) null);
        }
        field2063 = null;
        field2073 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;", line = 796)
    public static final String method895(int arg0, int arg1) {
        if (arg1 != 27003) {
            method889(127, 57, -109, -88);
        }
        field2072++;
        return class190.field2938[arg0].length() <= 0 ? class39.field570[arg0] : class39.field570[arg0] + class132.field2024 + class190.field2938[arg0];
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 812)
    public final void method89(byte arg0) {
        method894(-727542745);
        class145.method1027();
        field2065++;
        class269.method1898((byte) -67);
        class224.method1527(false);
        class88.method577();
        class275.method1965(12800);
        class68.method478(false);
        class12.method86(true);
        class245.method1716();
        class178.method1250(50);
        class69.method484(2890);
        class281.method1993(-1);
        class313.method2199((byte) 100);
        class102.method675(-8);
        class293.method2083(102);
        class23.method207(-29288);
        class213.method1443(-2);
        class221.method1508(-2);
        class248.method1765(304);
        class218.method1475(-126);
        class98.method643(15);
        class233.method1609(94);
        class29.method247(0);
        class154.method1120((byte) 124);
        class264.method1867(-80);
        class16.method110(-114);
        class39.method319(0);
        class150.method1079((byte) -40);
        class289.method2048(127);
        class4.method35(8);
        class54.method392((byte) -63);
        class246.method1749(0);
        class230.method1569((byte) -124);
        class151.method1089(116);
        class314.method2259((byte) -93);
        class340.method2392(-592461009);
        class131.method856(true);
        class287.method2034((byte) -120);
        class50.method371(55);
        class177.method1243(57);
        class139.method977(1486823500);
        class167.method1162((byte) 59);
        class77.method524((byte) -14);
        class159.method1130(27567);
        class198.method1357(0);
        class111.method734(-1);
        class65.method454(68);
        class146.method1044(-114);
        class223.method1521(0);
        class44.method337(0);
        class295.method2089(-1769);
        class270.method1905((byte) -120);
        class138.method970(true);
        class74.method507((byte) -50);
        class96.method635((byte) 116);
        class117.method758((byte) -54);
        class45.method340((byte) -116);
        class315.method2263(-22322);
        class143.method1011((byte) -124);
        class309.method2155();
        class9.method62(123);
        class90.method598((byte) 59);
        class256.method1817(20);
        class100.method656((byte) 1);
        class147.method1048(-3);
        class234.method1618();
        class101.method658((byte) -126);
        class135.method920();
        class202.method1378(667102028);
        class22.method170();
        class109.method727((byte) 121);
        class67.method471();
        class199.method1360(80);
        class216.method1464(0);
        class305.method2137((byte) 94);
        class72.method497((byte) -14);
        class173.method1197();
        class360.method2504();
        class325.method2324(-1094468382);
        class236.method1624(768);
        class187.method1288((byte) 72);
        class175.method1231();
        class356.method2480(1);
        class124.method804(4);
        class103.method678();
        class197.method1343(false);
        class217.method1467((byte) 119);
        class148.method1053(12119);
        class176.method1235();
        class284.method2013((byte) 54);
        class312.method2175(1);
        class262.method1839(20965);
        class105.method699(-65);
        class116.method754((byte) 119);
        class317.method2276();
        class276.method1968(62);
        class56.method419(93);
        class21.method130(1);
        class308.method2150(32);
        class227.method1542(-117);
        class266.method1880((byte) 83);
        class219.method1480(1);
        class324.method2320(13468);
        class49.method359((byte) -69);
        class296.method2091((byte) -92);
        class347.method2442(-1);
        class71.method491(2048);
        class118.method766(0);
        class172.method1189(true);
        class311.method2174(119);
        class113.method740(-6);
        class174.method1202();
        class8.method60((byte) -97);
        class341.method2407(false);
        class33.method283((byte) -23);
        class355.method2478(-3);
        class328.method2341((byte) 81);
        class40.method321((byte) -53);
        class134.method880();
        class241.method1687(false);
        class160.method1135(-9783);
        class13.method94((byte) 66);
        class55.method418(false);
        class119.method772(false);
        class59.method436((byte) -128);
        class121.method789(123);
        class85.method555();
        class191.method1317((byte) -41);
        class272.method1923();
        class5.method43((byte) 120);
        class97.method639(false);
        class2.method12((byte) -112);
        class265.method1871(false);
        class201.method1375(200000);
        class249.method1774((byte) 16);
        class307.method2144(-1);
        class43.method332();
        class52.method384(false);
        class35.method297();
        class306.method2142(78);
        class259.method1830(0);
        class279.method1985((byte) 36);
        class190.method1313(-5);
        class280.method1987(-65537);
        class162.method1143(-97);
        class209.method1422(11436);
        class226.method1534();
        class258.method1824((byte) -13);
        class186.method1286(124);
        class257.method1822((byte) -46);
        class206.method1400(false);
        class86.method564(-1533600255);
        class286.method2021((byte) 93);
        class20.method124(4);
        class316.method2265();
        class83.method549((byte) -86);
        class292.method2063(0);
        class338.method2388();
        class254.method1802();
        class149.method1062();
        class184.method1275();
        class81.method545((byte) 115);
        class339.method2390(-128);
        class291.method2058(-15977);
        class93.method614();
        class335.method2382();
        class200.method1369();
        class185.method1278(true);
        class99.method655(2);
        class37.method302(15571);
        class255.method1813(true);
        class211.method1434(0);
        class220.method1484(-29284);
        class250.method1778(0);
        class251.method1783(264093096);
        class277.method1971();
        class342.method2415(true);
        if (arg0 >= -41) {
            this.method893((byte) 114);
        }
        class15.method109((byte) 51);
        class76.method515(57);
        class189.method1304(-6526);
        class92.method609(-115);
        class61.method446(0);
        class345.method2432(77);
        class115.method751(4);
        class238.method1669(1);
        class327.method2333(25);
        class273.method1934(true);
        class58.method432(-5784);
        class94.method628(-116);
        class303.method2125();
        class196.method1339((byte) 70);
        class32.method268(true);
        class79.method538(-1);
        class228.method1555(5316);
        class104.method694((byte) -126);
        class30.method261((byte) 117);
        class141.method1001(-125);
        class11.method73(127);
        class288.method2045();
        class214.method1456(-117);
        class343.method2419(false);
        class353.method2464((byte) 91);
        class203.method1387(-1);
        class352.method2463(-120);
        class183.method1272(79);
        class336.method2383();
        class127.method830();
        class182.method1266((byte) 81);
        class204.method1391(116);
        class91.method602(-3901);
        class320.method2306((byte) -106);
        class348.method2445();
        class193.method1330();
        class299.method2109((byte) 104);
        class18.method118(1);
        class271.method1909();
        class278.method1979(7502);
        class136.method942();
        class359.method2500();
        class107.method704((byte) -97);
        class3.method19((byte) 115);
        class346.method2441(92);
        class180.method1257(104);
        class285.method2017(-126);
        class75.method510((byte) -127);
        class243.method1700((byte) 84);
        class207.method1411(-2940);
        class181.method1264(48);
        class210.method1428(-1);
        class188.method1300();
        class267.method1885(1000);
        class123.method797((byte) 86);
        class290.method2055((byte) -73);
        class27.method233(20657);
        class78.method532(-118);
        class140.method994(true);
        class46.method349((byte) -98);
        class41.method324((byte) 108);
        class163.method1146((byte) -72);
        class25.method221((byte) -113);
        class60.method438(false);
        class310.method2166(true);
        class166.method1156(-5675);
        class132.method861(-110);
        class170.method1175((byte) -24);
        class165.method1152((byte) -104);
        class153.method1103((byte) -106);
        class334.method2362((byte) -111);
        class161.method1141((byte) 100);
        class125.method807((byte) 107);
        class195.method1334((byte) -77);
        class31.method264(88);
        class322.method2312(22835);
        class242.method1693(-108);
        class319.method2299((byte) 127);
        class130.method842(124);
        class294.method2086(0);
        class300.method2112(255);
        class261.method1832((byte) 94);
        class157.method1124((byte) 124);
        class6.method46(-47);
        class51.method375((byte) 124);
        class235.method1622(126);
        class326.method2330(-119);
        class84.method550((byte) 6);
        class253.method1792(123);
        class48.method358(false);
        class329.method2343((byte) -94);
        class192.method1327((byte) 51);
        class244.method1701((byte) 81);
        class268.method1890(9);
        class38.method306(256);
        class34.method287(126);
        class350.method2454(false);
        class358.method2494(-11);
        class47.method354((byte) 125);
        class171.method1182((byte) -91);
        class302.method2117(-1669070996);
        class120.method777(true);
        class28.method241(-107);
        class110.method731((byte) -22);
        if (class12.field161) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V", line = 1103)
    private final void method896(boolean arg0, int arg1) {
        class347.field5558 = null;
        class267.field4400.field4880++;
        class267.field4400.field4879 = arg1;
        if (arg0) {
            field2062++;
            class101.field1455 = 0;
            class201.field3089 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1119)
    private final void method897(int arg0) {
        class21.field262 = 0;
        field2076++;
        while (class261.method1835((byte) 22) && class21.field262 < 128) {
            class83.field1203[class21.field262] = class181.field2815;
            class264.field4304[class21.field262] = class293.field4856;
            class21.field262++;
        }
        int var2 = 18 % ((34 - arg0) / 49);
        class215.field3322++;
        if (class345.field5538 != -1) {
            class21.method128(class345.field5538, 0, class243.field3838, class233.field3712, 0, 66, 0, 0);
        }
        class12.field157++;
        if (class245.field3886) {
            int var3 = 2359807;
            label196: for (int var4 = 0; var4 < 32768; var4++) {
                class233 var5 = class329.field5377[var4];
                if (var5 != null) {
                    byte var6 = var5.field3702.field2206;
                    if ((var6 & 0x2) > 0 && var5.field4792 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var8 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var7 != 0 || var8 != 0) {
                            var5.field4762[0] = (var5.field4796 >> 7) + var7;
                            var5.field4757[0] = (var5.field4783 >> 7) + var8;
                            var5.field4693[0] = 1;
                            class124.field1860[class120.field1779].method1116((byte) 53, false, var5.field4796 >> 7, var5.field4783 >> 7, var5.method312(25), 0, var5.method312(57), false);
                            if (var5.field4762[0] >= 0 && var5.field4762[0] <= 104 - var5.method312(30) && var5.field4757[0] >= 0 && var5.field4757[0] <= (104 - var5.method312(-75)) && class124.field1860[class120.field1779].method1114(var5.field4796 >> 7, var5.field4762[0], 29346, var5.field4757[0], var5.field4783 >> 7)) {
                                if (var5.method312(46) > 1) {
                                    for (int var9 = var5.field4762[0]; (var5.field4762[0] + var5.method312(27)) > var9; var9++) {
                                        for (int var10 = var5.field4757[0]; var5.field4757[0] + var5.method312(-127) > var10; var10++) {
                                            if ((class124.field1860[class120.field1779].field2491[var9][var10] & var3) != 0) {
                                                continue label196;
                                            }
                                        }
                                    }
                                }
                                var5.field4792 = 1;
                            }
                        }
                    }
                    class100.method657(false, var5);
                    class142.method1006(var5, -1);
                    class285.method2016(var5, 70);
                    class124.field1860[class120.field1779].method1117(var5.field4783 >> 7, -2, var5.method312(-77), var5.field4796 >> 7, var5.method312(111), false, false);
                }
            }
        }
        if (!class245.field3886 && class179.field2789 == 0) {
            class339.method2391(75);
        } else if (class291.field4825 == 0 && class55.field843 == 0) {
            if (class269.field4427 == 2) {
                class251.method1785((byte) 88);
            } else {
                class79.method537((byte) 77);
            }
            if (class41.field625 >> 7 < 14 || class41.field625 >> 7 >= 90 || class259.field4098 >> 7 < 14 || class259.field4098 >> 7 >= 90) {
                class358.method2490(false);
            }
        }
        while (true) {
            class190 var11;
            class264 var18;
            class264 var19;
            do {
                var11 = (class190) class153.field2474.method1080(-1);
                if (var11 == null) {
                    while (true) {
                        class190 var12;
                        class264 var16;
                        class264 var17;
                        do {
                            var12 = (class190) class262.field4129.method1080(-1);
                            if (var12 == null) {
                                while (true) {
                                    class190 var13;
                                    class264 var14;
                                    class264 var15;
                                    do {
                                        var13 = (class190) class268.field4420.method1080(-1);
                                        if (var13 == null) {
                                            if (class52.field788 != null) {
                                                class61.method449(18060);
                                            }
                                            if (class51.field766 != null && class51.field766.field2542 == 1) {
                                                if (class51.field766.field2538 != null) {
                                                    class344.method2425(class98.field1426, class60.field914, (byte) 99);
                                                }
                                                class60.field914 = null;
                                                class51.field766 = null;
                                                class98.field1426 = false;
                                            }
                                            if ((class58.field875 % 1500) == 0) {
                                                class255.method1815(5424);
                                            }
                                            return;
                                        }
                                        var14 = var13.field2937;
                                        if (var14.field4240 < 0) {
                                            break;
                                        }
                                        var15 = class94.method629(5386, var14.field4201);
                                    } while (var15 == null || var15.field4314 == null || var14.field4240 >= var15.field4314.length || var15.field4314[var14.field4240] != var14);
                                    class201.method1372(var13, 200000);
                                }
                            }
                            var16 = var12.field2937;
                            if (var16.field4240 < 0) {
                                break;
                            }
                            var17 = class94.method629(5386, var16.field4201);
                        } while (var17 == null || var17.field4314 == null || var16.field4240 >= var17.field4314.length || var17.field4314[var16.field4240] != var16);
                        class201.method1372(var12, 200000);
                    }
                }
                var18 = var11.field2937;
                if (var18.field4240 < 0) {
                    break;
                }
                var19 = class94.method629(5386, var18.field4201);
            } while (var19 == null || var19.field4314 == null || var18.field4240 >= var19.field4314.length || var19.field4314[var18.field4240] != var18);
            class201.method1372(var11, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1335)
    public final void method78(byte arg0) {
        if (class245.field3886) {
            class245.method1718();
        }
        field2066++;
        if (class296.field4907 != null) {
            class219.method1479(class96.field1382, class296.field4907, -116);
            class296.field4907 = null;
        }
        if (class251.field4011 != null) {
            class251.field4011.field1063 = false;
        }
        class251.field4011 = null;
        if (class346.field5545 != null) {
            class346.field5545.method674((byte) -83);
            class346.field5545 = null;
        }
        if (arg0 != -28) {
            return;
        }
        class355.method2476(class235.field3731, -41);
        class192.method1323(true, class235.field3731);
        if (class140.field2264 != null) {
            class140.field2264.method1014(class235.field3731, true);
        }
        class228.method1554(arg0 - 78);
        class283.method2004(arg0 ^ 0xFFFFFF91);
        class140.field2264 = null;
        if (class291.field4828 != null) {
            class291.field4828.method1092(-26619);
        }
        if (class15.field199 != null) {
            class15.field199.method1092(-26619);
        }
        class267.field4400.method2080(arg0 ^ 0xFFFFFFE0);
        class326.field5343.method208(64);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lsi;)Lei;", line = 1387)
    public static final class77 method898(class264 arg0) {
        class77 var1 = (class77) class300.field4955.method29(((long) arg0.field4204 << 32) + (long) arg0.field4240, 103);
        return var1 == null ? arg0.field4333 : var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1398)
    public final void method91(int arg0) {
        field2075++;
        if (class346.field5553 == 1000) {
            return;
        }
        class58.field875++;
        if (arg0 != 3516) {
            field2070 = true;
        }
        if (class58.field875 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class138.field2177 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class270.field4455.setSeed((long) class138.field2177);
        }
        this.method893((byte) -26);
        if (class113.field1658 != null) {
            class113.field1658.method2001(-21690);
        }
        class150.method1085(arg0 ^ 0xDFC);
        class190.method1316(-128);
        class189.method1305((byte) 17);
        class163.method1144(arg0 + 25150);
        if (class245.field3886) {
            class173.method1193();
        }
        if (class140.field2264 != null) {
            int var3 = class140.field2264.method1013((byte) 113);
            class299.field4936 = var3;
        }
        if (class346.field5553 == 0) {
            this.method892(-120);
            class7.method51(-84);
        } else if (class346.field5553 == 5) {
            this.method892(70);
            class7.method51(-128);
        } else if (class346.field5553 == 25 || class346.field5553 == 28) {
            class203.method1386(-127);
        }
        if (class346.field5553 == 10) {
            this.method897(-23);
            class94.method627((byte) 25);
            class305.method2135(false);
            class109.method720(arg0 - 18670);
        } else if (class346.field5553 == 30) {
            class344.method2428((byte) -57);
        } else if (class346.field5553 == 40) {
            class109.method720(-15154);
            if (class15.field202 != -3) {
                if (class15.field202 == 15) {
                    class269.method1902(true);
                } else if (class15.field202 != 2) {
                    class278.method1983(1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIZIIIILgd;)V", line = 1486)
    public static final void method899(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10) {
        field2061++;
        if (arg0 && !class261.method1836(0) && (class148.field2392[0][arg6][arg9] & 0x2) == 0) {
            if ((class148.field2392[arg7][arg6][arg9] & 0x10) != 0) {
                return;
            }
            if (class122.method796(arg6, (byte) -56, arg7, arg9) != class119.field1760) {
                return;
            }
        }
        if (arg7 < class107.field1538) {
            class107.field1538 = arg7;
        }
        class126 var11 = class165.method1155((byte) 27, arg2);
        if (class245.field3886 && var11.field1940) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var12 = var11.field1880;
            var13 = var11.field1929;
        } else {
            var12 = var11.field1929;
            var13 = var11.field1880;
        }
        int var14;
        int var15;
        if ((arg6 + var13) > 104) {
            var14 = arg6;
            var15 = arg6 + 1;
        } else {
            var15 = arg6 + (var13 + 1 >> 1);
            var14 = (var13 >> 1) + arg6;
        }
        int var16;
        int var17;
        if ((arg9 + var12) > 104) {
            var16 = arg9 + 1;
            var17 = arg9;
        } else {
            var17 = (var12 >> 1) + arg9;
            var16 = (var12 + 1 >> 1) + arg9;
        }
        int[][] var18 = class101.field1457[arg3];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg9 << 7) + (var12 << 6);
        int var21 = arg8;
        int var22 = (arg6 << 7) + (var13 << 6);
        if (class245.field3886 && arg3 != 0) {
            int[][] var23 = class101.field1457[0];
            var21 = var19 - (var23[var14][var16] + var23[var14][var17] + var23[var15][var17] + var23[var15][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg5) {
            var24 = class223.field3444[0];
        } else if (arg3 < 3) {
            var24 = class101.field1457[arg3 + 1];
        }
        long var25 = (long) (arg1 | 0x400 << 20 | arg6 | arg9 << 7 | arg4 << 14);
        if (var11.field1954 == 0 || arg5) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field1874 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field1878) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg2 << 32;
        if (var11.method812((byte) 118)) {
            class358.method2492(-108, arg9, arg6, (class233) null, arg7, arg1, (class39) null, var11);
        }
        boolean var29 = var11.field1943 & !arg5;
        if (arg4 == 22) {
            if (class118.field1725 || var11.field1954 != 0 || var11.field1926 == 1 || var11.field1957) {
                class162 var77;
                if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                    class202 var76 = var11.method826(var22, arg0, var19, arg1, var29, (class239) null, 22, var20, var18, var24, 26021);
                    if (class245.field3886 && var29) {
                        class149.method1061(var76.field3108, var22, var21, var20);
                    }
                    var77 = var76.field3100;
                } else {
                    var77 = new class263(arg2, 22, arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
                }
                class165.method1153(arg7, arg6, arg9, var19, var77, var27, var11.field1893);
                if (var11.field1926 == 1 && arg10 != null) {
                    arg10.method1107(arg6, arg9, 262144);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class162 var71;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var70 = var11.method826(var22, arg0, var19, arg4 == 11 ? arg1 + 4 : arg1, var29, (class239) null, 10, var20, var18, var24, arg8 ^ 0x65A5);
                if (class245.field3886 && var29) {
                    class149.method1061(var70.field3108, var22, var21, var20);
                }
                var71 = var70.field3100;
            } else {
                var71 = new class263(arg2, 10, arg4 == 11 ? arg1 + 4 : arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            if (var71 != null) {
                boolean var72 = class9.method63(arg7, arg6, arg9, var19, var13, var12, var71, 0, var27);
                if (var11.field1930 && var72 && arg0) {
                    int var73 = 15;
                    if (var71 instanceof class128) {
                        var73 = ((class128) var71).method164() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (class180.field2806[arg7][arg6 + var74][arg9 + var75] < var73) {
                                class180.field2806[arg7][arg6 + var74][arg9 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field1926 != 0 && arg10 != null) {
                arg10.method1117(arg9, -2, var13, arg6, var12, !var11.field1892, var11.field1912);
            }
        } else if (arg4 >= 12) {
            class162 var69;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var68 = var11.method826(var22, arg0, var19, arg1, var29, (class239) null, arg4, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var68.field3108, var22, var21, var20);
                }
                var69 = var68.field3100;
            } else {
                var69 = new class263(arg2, arg4, arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class9.method63(arg7, arg6, arg9, var19, 1, 1, var69, 0, var27);
            if (arg0 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0 && var11.field1884 != 0) {
                class109.field1614[arg7][arg6][arg9] = class167.method1160(class109.field1614[arg7][arg6][arg9], 4);
            }
            if (var11.field1926 != 0 && arg10 != null) {
                arg10.method1117(arg9, -2, var13, arg6, var12, !var11.field1892, var11.field1912);
            }
        } else if (arg4 == 0) {
            class162 var67;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var66 = var11.method826(var22, arg0, var19, arg1, var29, (class239) null, 0, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var66.field3108, var22, var21, var20);
                }
                var67 = var66.field3100;
            } else {
                var67 = new class263(arg2, 0, arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class293.method2077(arg7, arg6, arg9, var19, var67, (class162) null, class177.field2773[arg1], 0, var27);
            if (arg0) {
                if (arg1 == 0) {
                    if (var11.field1930) {
                        class180.field2806[arg7][arg6][arg9] = 50;
                        class180.field2806[arg7][arg6][arg9 + 1] = 50;
                    }
                    if (var11.field1884 == 1) {
                        class109.field1614[arg7][arg6][arg9] = class167.method1160(class109.field1614[arg7][arg6][arg9], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field1930) {
                        class180.field2806[arg7][arg6][arg9 + 1] = 50;
                        class180.field2806[arg7][arg6 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field1884 == 1) {
                        class109.field1614[arg7][arg6][arg9 + 1] = class167.method1160(class109.field1614[arg7][arg6][arg9 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field1930) {
                        class180.field2806[arg7][arg6 + 1][arg9] = 50;
                        class180.field2806[arg7][arg6 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field1884 == 1) {
                        class109.field1614[arg7][arg6 + 1][arg9] = class167.method1160(class109.field1614[arg7][arg6 + 1][arg9], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field1930) {
                        class180.field2806[arg7][arg6][arg9] = 50;
                        class180.field2806[arg7][arg6 + 1][arg9] = 50;
                    }
                    if (var11.field1884 == 1) {
                        class109.field1614[arg7][arg6][arg9] = class167.method1160(class109.field1614[arg7][arg6][arg9], 2);
                    }
                }
            }
            if (var11.field1926 != 0 && arg10 != null) {
                arg10.method1111(arg1, !var11.field1892, arg6, arg4, -128, arg9, var11.field1912);
            }
            if (var11.field1901 != 16) {
                class325.method2325(arg7, arg6, arg9, var11.field1901);
            }
        } else if (arg4 == 1) {
            class162 var31;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var30 = var11.method826(var22, arg0, var19, arg1, var29, (class239) null, 1, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var30.field3108, var22, var21, var20);
                }
                var31 = var30.field3100;
            } else {
                var31 = new class263(arg2, 1, arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class293.method2077(arg7, arg6, arg9, var19, var31, (class162) null, class105.field1520[arg1], 0, var27);
            if (var11.field1930 && arg0) {
                if (arg1 == 0) {
                    class180.field2806[arg7][arg6][arg9 + 1] = 50;
                } else if (arg1 == 1) {
                    class180.field2806[arg7][arg6 + 1][arg9 + 1] = 50;
                } else if (arg1 == 2) {
                    class180.field2806[arg7][arg6 + 1][arg9] = 50;
                } else if (arg1 == 3) {
                    class180.field2806[arg7][arg6][arg9] = 50;
                }
            }
            if (var11.field1926 != 0 && arg10 != null) {
                arg10.method1111(arg1, !var11.field1892, arg6, arg4, -126, arg9, var11.field1912);
            }
        } else if (arg4 == 2) {
            int var32 = arg1 + 1 & 0x3;
            class162 var34;
            class162 var36;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var33 = var11.method826(var22, arg0, var19, arg1 + 4, var29, (class239) null, 2, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var33.field3108, var22, var21, var20);
                }
                var34 = var33.field3100;
                class202 var35 = var11.method826(var22, arg0, var19, var32, var29, (class239) null, 2, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var35.field3108, var22, var21, var20);
                }
                var36 = var35.field3100;
            } else {
                var34 = new class263(arg2, 2, arg1 + 4, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
                var36 = new class263(arg2, 2, var32, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class293.method2077(arg7, arg6, arg9, var19, var34, var36, class177.field2773[arg1], class177.field2773[var32], var27);
            if (var11.field1884 == 1 && arg0) {
                if (arg1 == 0) {
                    class109.field1614[arg7][arg6][arg9] = class167.method1160(class109.field1614[arg7][arg6][arg9], 1);
                    class109.field1614[arg7][arg6][arg9 + 1] = class167.method1160(class109.field1614[arg7][arg6][arg9 + 1], 2);
                } else if (arg1 == 1) {
                    class109.field1614[arg7][arg6][arg9 + 1] = class167.method1160(class109.field1614[arg7][arg6][arg9 + 1], 2);
                    class109.field1614[arg7][arg6 + 1][arg9] = class167.method1160(class109.field1614[arg7][arg6 + 1][arg9], 1);
                } else if (arg1 == 2) {
                    class109.field1614[arg7][arg6 + 1][arg9] = class167.method1160(class109.field1614[arg7][arg6 + 1][arg9], 1);
                    class109.field1614[arg7][arg6][arg9] = class167.method1160(class109.field1614[arg7][arg6][arg9], 2);
                } else if (arg1 == 3) {
                    class109.field1614[arg7][arg6][arg9] = class167.method1160(class109.field1614[arg7][arg6][arg9], 2);
                    class109.field1614[arg7][arg6][arg9] = class167.method1160(class109.field1614[arg7][arg6][arg9], 1);
                }
            }
            if (var11.field1926 != 0 && arg10 != null) {
                arg10.method1111(arg1, !var11.field1892, arg6, arg4, arg8 ^ 0xFFFFFF80, arg9, var11.field1912);
            }
            if (var11.field1901 != 16) {
                class325.method2325(arg7, arg6, arg9, var11.field1901);
            }
        } else if (arg4 == 3) {
            class162 var65;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var64 = var11.method826(var22, arg0, var19, arg1, var29, (class239) null, 3, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var64.field3108, var22, var21, var20);
                }
                var65 = var64.field3100;
            } else {
                var65 = new class263(arg2, 3, arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class293.method2077(arg7, arg6, arg9, var19, var65, (class162) null, class105.field1520[arg1], 0, var27);
            if (var11.field1930 && arg0) {
                if (arg1 == 0) {
                    class180.field2806[arg7][arg6][arg9 + 1] = 50;
                } else if (arg1 == 1) {
                    class180.field2806[arg7][arg6 + 1][arg9 + 1] = 50;
                } else if (arg1 == 2) {
                    class180.field2806[arg7][arg6 + 1][arg9] = 50;
                } else if (arg1 == 3) {
                    class180.field2806[arg7][arg6][arg9] = 50;
                }
            }
            if (var11.field1926 != 0 && arg10 != null) {
                arg10.method1111(arg1, !var11.field1892, arg6, arg4, arg8 ^ 0xFFFFFF80, arg9, var11.field1912);
            }
        } else if (arg4 == 9) {
            class162 var38;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var37 = var11.method826(var22, arg0, var19, arg1, var29, (class239) null, arg4, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var37.field3108, var22, var21, var20);
                }
                var38 = var37.field3100;
            } else {
                var38 = new class263(arg2, arg4, arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class9.method63(arg7, arg6, arg9, var19, 1, 1, var38, 0, var27);
            if (var11.field1926 != 0 && arg10 != null) {
                arg10.method1117(arg9, -2, var13, arg6, var12, !var11.field1892, var11.field1912);
            }
            if (var11.field1901 != 16) {
                class325.method2325(arg7, arg6, arg9, var11.field1901);
            }
        } else if (arg4 == 4) {
            class162 var40;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var39 = var11.method826(var22, arg0, var19, arg1, var29, (class239) null, 4, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var39.field3108, var22, var21, var20);
                }
                var40 = var39.field3100;
            } else {
                var40 = new class263(arg2, 4, arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class6.method48(arg7, arg6, arg9, var19, var40, (class162) null, class177.field2773[arg1], 0, 0, 0, var27);
        } else if (arg4 == 5) {
            int var41 = 16;
            long var42 = class47.method355(arg7, arg6, arg9);
            if (var42 != 0L) {
                var41 = class165.method1155((byte) 19, Integer.MAX_VALUE & (int) (var42 >>> 32)).field1901;
            }
            class162 var45;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var44 = var11.method826(var22, arg0, var19, arg1, var29, (class239) null, 4, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var44.field3108, var22 - (class284.field4659[arg1] * 8), var21, var20 - (class250.field3969[arg1] * 8));
                }
                var45 = var44.field3100;
            } else {
                var45 = new class263(arg2, 4, arg1, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class6.method48(arg7, arg6, arg9, var19, var45, (class162) null, class177.field2773[arg1], 0, class284.field4659[arg1] * var41, class250.field3969[arg1] * var41, var27);
        } else if (arg4 == 6) {
            int var46 = 8;
            long var47 = class47.method355(arg7, arg6, arg9);
            if (var47 != 0L) {
                var46 = class165.method1155((byte) 108, Integer.MAX_VALUE & (int) (var47 >>> 32)).field1901 / 2;
            }
            class162 var50;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var49 = var11.method826(var22, arg0, var19, arg1 + 4, var29, (class239) null, 4, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var49.field3108, var22 - (class238.field3767[arg1] * 8), var21, var20 - (class6.field75[arg1] * 8));
                }
                var50 = var49.field3100;
            } else {
                var50 = new class263(arg2, 4, arg1 + 4, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class6.method48(arg7, arg6, arg9, var19, var50, (class162) null, 256, arg1, class238.field3767[arg1] * var46, class6.field75[arg1] * var46, var27);
        } else if (arg4 == 7) {
            int var61 = arg1 + 2 & 0x3;
            class162 var63;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                class202 var62 = var11.method826(var22, arg0, var19, var61 + 4, var29, (class239) null, 4, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var62.field3108, var22, var21, var20);
                }
                var63 = var62.field3100;
            } else {
                var63 = new class263(arg2, 4, var61 + 4, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class6.method48(arg7, arg6, arg9, var19, var63, (class162) null, 256, var61, 0, 0, var27);
        } else if (arg4 == 8) {
            int var51 = 8;
            long var52 = class47.method355(arg7, arg6, arg9);
            if (var52 != 0L) {
                var51 = class165.method1155((byte) 62, Integer.MAX_VALUE & (int) (var52 >>> 32)).field1901 / 2;
            }
            int var54 = arg1 + 2 & 0x3;
            class162 var58;
            class162 var60;
            if (var11.field1944 == -1 && var11.field1883 == null && var11.field1949 == null && !var11.field1905) {
                int var55 = class6.field75[arg1] * 8;
                int var56 = class238.field3767[arg1] * 8;
                class202 var57 = var11.method826(var22, arg0, var19, arg1 + 4, var29, (class239) null, 4, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var57.field3108, var22 - var56, var21, var20 - var55);
                }
                var58 = var57.field3100;
                class202 var59 = var11.method826(var22, arg0, var19, var54 + 4, var29, (class239) null, 4, var20, var18, var24, 26021);
                if (class245.field3886 && var29) {
                    class149.method1061(var59.field3108, var22 - var56, var21, var20 - var55);
                }
                var60 = var59.field3100;
            } else {
                var58 = new class263(arg2, 4, arg1 + 4, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
                var60 = new class263(arg2, 4, var54 + 4, arg3, arg6, arg9, -1, var11.field1889, (class162) null);
            }
            class6.method48(arg7, arg6, arg9, var19, var58, var60, 256, arg1, class238.field3767[arg1] * var51, class6.field75[arg1] * var51, var27);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lsi;)Lsi;", line = 2148)
    public static final class264 method900(class264 arg0) {
        int var1 = method898(arg0).method529(17055);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class94.method629(5386, arg0.field4201);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 2178)
    private final void method901(boolean arg0) {
        field2068++;
        if (class104.field1510 < class267.field4400.field4880) {
            class157.field2527 = (class267.field4400.field4880 * 50 - 50) * 5;
            if (class157.field2527 > 3000) {
                class157.field2527 = 3000;
            }
            if (class285.field4669 == class21.field248) {
                class285.field4669 = class273.field4500;
            } else {
                class285.field4669 = class21.field248;
            }
            if (class267.field4400.field4880 >= 2 && class267.field4400.field4879 == 6) {
                this.method83(-104, "js5connect_outofdate");
                class346.field5553 = 1000;
                return;
            }
            if (class267.field4400.field4880 >= 4 && class267.field4400.field4879 == -1) {
                this.method83(-104, "js5crc");
                class346.field5553 = 1000;
                return;
            }
            if (class267.field4400.field4880 >= 4 && (class346.field5553 == 0 || class346.field5553 == 5)) {
                if (class267.field4400.field4879 == 7 || class267.field4400.field4879 == 9) {
                    this.method83(-104, "js5connect_full");
                } else if (class267.field4400.field4879 > 0) {
                    this.method83(-104, "js5connect");
                } else {
                    this.method83(-104, "js5io");
                }
                class346.field5553 = 1000;
                return;
            }
        }
        class104.field1510 = class267.field4400.field4880;
        if (!arg0) {
            return;
        }
        if (class157.field2527 > 0) {
            class157.field2527--;
            return;
        }
        try {
            if (class101.field1455 == 0) {
                class201.field3089 = class96.field1382.method1950(class242.field3811, class285.field4669, -120);
                class101.field1455++;
            }
            if (class101.field1455 == 1) {
                if (class201.field3089.field2542 == 2) {
                    this.method896(true, 1000);
                    return;
                }
                if (class201.field3089.field2542 == 1) {
                    class101.field1455++;
                }
            }
            if (class101.field1455 == 2) {
                class347.field5558 = new class102((Socket) class201.field3089.field2538, class96.field1382);
                class313 var2 = new class313(5);
                var2.method2193(15, false);
                var2.method2222(548, 255);
                class347.field5558.method669(0, var2.field5124, 5, (byte) -81);
                class101.field1455++;
                class96.field1397 = class19.method122(-12169);
            }
            if (class101.field1455 == 3) {
                if (class346.field5553 == 0 || class346.field5553 == 5 || class347.field5558.method667(arg0) > 0) {
                    int var3 = class347.field5558.method668(0);
                    if (var3 != 0) {
                        this.method896(true, var3);
                        return;
                    }
                    class101.field1455++;
                } else if (class19.method122(-12169) - class96.field1397 > 30000L) {
                    this.method896(true, 1001);
                    return;
                }
            }
            if (class101.field1455 == 4) {
                boolean var4 = class346.field5553 == 5 || class346.field5553 == 10 || class346.field5553 == 28;
                class267.field4400.method2076(class347.field5558, -21, !var4);
                class101.field1455 = 0;
                class201.field3089 = null;
                class347.field5558 = null;
            }
        } catch (IOException var6) {
            this.method896(arg0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 2323)
    public final void method77(byte arg0) {
        field2064++;
        if (class346.field5553 == 1000) {
            return;
        }
        if (arg0 != 44) {
            this.method82(84);
        }
        long var2 = class249.method1771(true) / 1000000L - class165.field2596;
        class165.field2596 = class249.method1771(true) / 1000000L;
        boolean var4 = class92.method610(449);
        if (var4 && class310.field5053 && class291.field4828 != null) {
            class291.field4828.method1094(false);
        }
        if ((class346.field5553 == 30 || class346.field5553 == 10) && (class8.field101 || class262.field4131 != 0L && class19.method122(arg0 ^ 0xFFFFD05B) > class262.field4131)) {
            class124.method801(class72.field1105, class8.field101, 0, class251.field4012, class84.method552(0));
        }
        if (class296.field4907 == null) {
            Container var5;
            if (class296.field4907 != null) {
                var5 = class296.field4907;
            } else if (class217.field3350 == null) {
                var5 = class96.field1382.field4515;
            } else {
                var5 = class217.field3350;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class217.field3350 == var5) {
                Insets var8 = class217.field3350.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class107.field1535 != var6 || class182.field2829 != var7) {
                if (class274.field4518.startsWith("mac")) {
                    class182.field2829 = var7;
                    class107.field1535 = var6;
                } else {
                    class266.method1877((byte) -104);
                }
                class262.field4131 = class19.method122(-12169) + 500L;
            }
        }
        if (class296.field4907 != null && !class23.field345 && (class346.field5553 == 30 || class346.field5553 == 10)) {
            class124.method801(-1, false, 0, -1, class295.field4901);
        }
        boolean var9 = false;
        if (class143.field2304) {
            var9 = true;
            class143.field2304 = false;
        }
        if (var9) {
            class191.method1319((byte) -93);
        }
        if (class245.field3886) {
            for (int var10 = 0; var10 < 100; var10++) {
                class116.field1694[var10] = true;
            }
        }
        if (class346.field5553 == 0) {
            class192.method1322((byte) -79, class353.field5618, var9, class98.field1411, (Color) null);
        } else if (class346.field5553 == 5) {
            class248.method1768(class31.field471, (byte) 100, false);
        } else if (class346.field5553 == 10) {
            class2.method11(0);
        } else if (class346.field5553 == 25 || class346.field5553 == 28) {
            if (class248.field3948 == 1) {
                if (class92.field1335 > class104.field1508) {
                    class104.field1508 = class92.field1335;
                }
                int var12 = (class104.field1508 - class92.field1335) * 50 / class104.field1508;
                class243.method1696(false, (byte) -33, class157.field2525 + "<br>(" + var12 + "%)");
            } else if (class248.field3948 == 2) {
                if (class120.field1771 > field2060) {
                    field2060 = class120.field1771;
                }
                int var11 = (field2060 - class120.field1771) * 50 / field2060 + 50;
                class243.method1696(false, (byte) -97, class157.field2525 + "<br>(" + var11 + "%)");
            } else {
                class243.method1696(false, (byte) -87, class157.field2525);
            }
        } else if (class346.field5553 == 30) {
            class23.method204(arg0 ^ 0x2C, var2);
        } else if (class346.field5553 == 40) {
            class243.method1696(false, (byte) 98, class154.field2509 + "<br>" + class235.field3733);
        }
        if (class245.field3886 && class346.field5553 != 0) {
            class245.method1704();
            for (int var19 = 0; var19 < class60.field916; var19++) {
                class324.field5309[var19] = false;
            }
        } else if ((class346.field5553 == 30 || class346.field5553 == 10) && class166.field2616 == 0 && !var9) {
            try {
                Graphics var16 = class235.field3731.getGraphics();
                for (int var17 = 0; var17 < class60.field916; var17++) {
                    if (class324.field5309[var17]) {
                        class92.field1331.method1167(class265.field4360[var17], class21.field263[var17], class138.field2179[var17], 0, var16, class189.field2926[var17]);
                        class324.field5309[var17] = false;
                    }
                }
            } catch (Exception var20) {
                class235.field3731.repaint();
            }
        } else if (class346.field5553 != 0) {
            try {
                Graphics var13 = class235.field3731.getGraphics();
                class92.field1331.method1166(false, 0, 0, var13);
                for (int var14 = 0; var14 < class60.field916; var14++) {
                    class324.field5309[var14] = false;
                }
            } catch (Exception var21) {
                class235.field3731.repaint();
            }
        }
        if (class258.field4086) {
            class202.method1380(-106);
        }
        if (class115.field1689 && class346.field5553 == 10 && class345.field5538 != -1) {
            class115.field1689 = false;
            class292.method2064(true, class96.field1382);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([[II)V", line = 2547)
    public static final void method902(int[][] arg0, int arg1) {
        if (arg1 != -27476) {
            method902((int[][]) ((int[][]) null), 127);
        }
        class306.field4998 = arg0;
        field2080++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2562)
    public final void method82(int arg0) {
        field2078++;
        class266.method1877((byte) -128);
        class326.field5343 = new class23();
        class267.field4400 = new class293();
        if (class343.field5513 != 0) {
            class289.field4808 = new byte[50][];
        }
        class248.method1760(class96.field1382, (byte) 104);
        if (class290.field4818 == 0) {
            class228.field3581 = this.getCodeBase().getHost();
            class344.field5523 = 43594;
            class270.field4452 = 443;
        } else if (class290.field4818 == 1) {
            class228.field3581 = this.getCodeBase().getHost();
            class270.field4452 = class21.field269 + 50000;
            class344.field5523 = class21.field269 + 40000;
        } else if (class290.field4818 == 2) {
            class228.field3581 = "127.0.0.1";
            class270.field4452 = class21.field269 + 50000;
            class344.field5523 = class21.field269 + 40000;
        }
        class171.field2665 = class344.field5523;
        class273.field4500 = class270.field4452;
        class150.field2421 = class267.field4394 = class38.field560 = class213.field3259 = new short[256];
        class21.field248 = class344.field5523;
        class242.field3811 = class228.field3581;
        class285.field4669 = class171.field2665;
        if (class274.field4509 == 3 && class290.field4818 != 2) {
            class203.field3111 = class21.field269;
        }
        if (class179.field2789 == 1) {
            class234.field3724 = 0;
            class234.field3730 = 16777215;
            class148.field2397 = true;
            class83.field1198 = class131.field1997;
            class32.field484 = class121.field1805;
            class210.field3201 = class78.field1167;
            class96.field1387 = class138.field2173;
        } else {
            class32.field484 = class192.field2975;
            class83.field1198 = class157.field2535;
            class96.field1387 = class77.field1148;
            class210.field3201 = class96.field1388;
        }
        class26.method227((byte) -17);
        class121.method785(-282, class235.field3731);
        class244.method1702(class235.field3731, 17084);
        class140.field2264 = class97.method640((byte) 86);
        if (class140.field2264 != null) {
            class140.field2264.method1015(class235.field3731, true);
        }
        class269.field4423 = class274.field4509;
        try {
            if (class96.field1382.field4519 != null) {
                class286.field4689 = new class248(class96.field1382.field4519, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    field2063[var2] = new class248(class96.field1382.field4507[var2], 6000, 0);
                }
                class49.field718 = new class248(class96.field1382.field4516, 6000, 0);
                class120.field1791 = new class218(255, class286.field4689, class49.field718, 500000);
                class163.field2584 = new class248(class96.field1382.field4506, 24, 0);
                class96.field1382.field4506 = null;
                class96.field1382.field4516 = null;
                class96.field1382.field4507 = null;
                class96.field1382.field4519 = null;
            }
        } catch (IOException var4) {
            class286.field4689 = null;
            class120.field1791 = null;
            class49.field718 = null;
            class163.field2584 = null;
        }
        if (class290.field4818 != 0) {
            class126.field1902 = true;
        }
        if (arg0 <= 43) {
            field2060 = -79;
        }
        if (class179.field2789 == 0) {
            class138.field2176 = class55.field824;
        } else if (class179.field2789 == 1) {
            class138.field2176 = class41.field631;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lsi;IIIIIII)V", line = 2695)
    public static final void method903(class264[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class264 var9 = arg0[var8];
            if (var9 != null && var9.field4201 == arg1 && (!var9.field4276 || var9.field4350 == 0 || var9.field4258 || method898(var9).field1155 != 0 || class242.field3813 == var9 || var9.field4233 == 1338) && (!var9.field4276 || !method891(var9))) {
                int var10 = var9.field4310 + arg6;
                int var11 = var9.field4286 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4350 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4223 + var10;
                    int var17 = var9.field4236 + var11;
                    if (var9.field4350 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class52.field788 == var9) {
                    class52.field795 = true;
                    class115.field1682 = var10;
                    class147.field2371 = var11;
                }
                if (!var9.field4276 || var12 < var14 && var13 < var15) {
                    if (var9.field4350 == 0) {
                        if (!var9.field4276 && method891(var9) && class295.field4899 != var9) {
                            continue;
                        }
                        if (var9.field4318 && class305.field4988 >= var12 && class130.field1982 >= var13 && class305.field4988 < var14 && class130.field1982 < var15) {
                            for (class190 var18 = (class190) class268.field4420.method1081(125); var18 != null; var18 = (class190) class268.field4420.method1083((byte) 113)) {
                                if (var18.field2945) {
                                    var18.method1131(8);
                                    var18.field2937.field4303 = false;
                                }
                            }
                            if (class143.field2303 == 0) {
                                class52.field788 = null;
                                class242.field3813 = null;
                            }
                            class214.field3276 = 0;
                            class86.field1234 = false;
                        }
                    }
                    if (var9.field4276) {
                        boolean var19;
                        if (class305.field4988 >= var12 && class130.field1982 >= var13 && class305.field4988 < var14 && class130.field1982 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class197.field3032 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class161.field2569 == 1 && class241.field3777 >= var12 && class69.field1074 >= var13 && class241.field3777 < var14 && class69.field1074 < var15) {
                            var21 = true;
                        }
                        if (var9.field4328 != null) {
                            for (int var22 = 0; var22 < var9.field4328.length; var22++) {
                                if (class294.field4896[var9.field4328[var22]]) {
                                    if (var9.field4355 == null || class58.field875 >= var9.field4355[var22]) {
                                        byte var23 = var9.field4320[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class294.field4896[86] && !class294.field4896[82] && !class294.field4896[81]) && ((var23 & 0x2) == 0 || class294.field4896[86]) && ((var23 & 0x1) == 0 || class294.field4896[82]) && ((var23 & 0x4) == 0 || class294.field4896[81])) {
                                            class102.method662(var22 + 1, "", var9.field4204, -1, 92);
                                            int var24 = var9.field4229[var22];
                                            if (var9.field4355 == null) {
                                                var9.field4355 = new int[var9.field4328.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4355[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4355[var22] = class58.field875 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4355 != null) {
                                    var9.field4355[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class139.method981(class241.field3777 - var10, (byte) -37, class69.field1074 - var11, var9);
                        }
                        if (class52.field788 != null && class52.field788 != var9 && var19 && method898(var9).method520(-21845)) {
                            class109.field1619 = var9;
                        }
                        if (class242.field3813 == var9) {
                            class9.field108 = true;
                            class30.field462 = var10;
                            class217.field3345 = var11;
                        }
                        if (var9.field4258 || var9.field4233 != 0) {
                            if (var19 && class299.field4936 != 0 && var9.field4305 != null) {
                                class190 var25 = new class190();
                                var25.field2945 = true;
                                var25.field2937 = var9;
                                var25.field2949 = class299.field4936;
                                var25.field2940 = var9.field4305;
                                class268.field4420.method1077(16711935, var25);
                            }
                            if (class52.field788 != null || class185.field2876 != null || class286.field4681 || var9.field4233 != 1400 && class214.field3276 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4233 != 0) {
                                if (var9.field4233 == 1337) {
                                    class41.field633 = var9;
                                    continue;
                                }
                                if (var9.field4233 == 1338) {
                                    if (var21) {
                                        class124.field1855 = class241.field3777 - var10;
                                        class94.field1370 = class69.field1074 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4233 == 1400) {
                                    class6.field79 = var9;
                                    if (var19) {
                                        class86.field1234 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class241.field3777 - var10 - var9.field4223 / 2) * 2.0D / (double) class88.field1259);
                                        int var27 = (int) ((double) (class69.field1074 - var11 - var9.field4236 / 2) * 2.0D / (double) class88.field1259);
                                        int var28 = class236.field3735 + var26;
                                        int var29 = class125.field1873 + var27;
                                        int var30 = class88.field1261 + var28;
                                        int var31 = class88.field1262 + class88.field1256 - var29 - 1;
                                        class275 var32 = class41.method325(-30462);
                                        int[] var33 = new int[3];
                                        var32.method1962(var30, var33, 12800, var31);
                                        if (var33 != null) {
                                            if (class294.field4896[82] && class121.field1804 > 0) {
                                                class51.method376(var33[2], var33[0], 1791677414, var33[1]);
                                                class297.method2097((byte) -29);
                                                continue;
                                            }
                                            class154.field2489++;
                                            class195.field2992.method250(21066, 165);
                                            class195.field2992.method2229(var33[0] << 28 | var33[1] << 14 | var33[2], 17574);
                                        }
                                        class214.field3276 = 1;
                                        class111.field1653 = false;
                                        class171.field2666 = class305.field4988;
                                        class267.field4389 = class130.field1982;
                                        continue;
                                    }
                                    if (var20 && class214.field3276 > 0) {
                                        if (class214.field3276 == 1 && (class305.field4988 != class171.field2666 || class267.field4389 != class130.field1982)) {
                                            class203.field3115 = class236.field3735;
                                            class224.field3497 = class125.field1873;
                                            class214.field3276 = 2;
                                        }
                                        if (class214.field3276 == 2) {
                                            class111.field1653 = true;
                                            class33.method279(true, (int) ((double) (class171.field2666 - class305.field4988) * 2.0D / (double) class88.field1264) + class203.field3115);
                                            class119.method771((int) ((double) (class267.field4389 - class130.field1982) * 2.0D / (double) class88.field1264) + class224.field3497, (byte) 4);
                                        }
                                        continue;
                                    }
                                    if (class214.field3276 > 0 && !class111.field1653) {
                                        if ((class40.field604 == 1 || class198.method1349((byte) -127, class117.field1701 - 1)) && class117.field1701 > 2) {
                                            class329.method2348((byte) -112);
                                        } else if (class117.field1701 > 0) {
                                            class285.method2015(-3);
                                        }
                                    }
                                    class214.field3276 = 0;
                                    continue;
                                }
                                if (var9.field4233 == 1401) {
                                    if (var20) {
                                        class5.method45(class305.field4988 - var10, class130.field1982 - var11, var9.field4236, -2, var9.field4223);
                                    }
                                    continue;
                                }
                                if (var9.field4233 == 1402) {
                                    if (!class245.field3886) {
                                        class218.method1472((byte) 112, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field4309 && var21) {
                                var9.field4309 = true;
                                if (var9.field4196 != null) {
                                    class190 var34 = new class190();
                                    var34.field2945 = true;
                                    var34.field2937 = var9;
                                    var34.field2950 = class241.field3777 - var10;
                                    var34.field2949 = class69.field1074 - var11;
                                    var34.field2940 = var9.field4196;
                                    class268.field4420.method1077(16711935, var34);
                                }
                            }
                            if (var9.field4309 && var20 && var9.field4266 != null) {
                                class190 var35 = new class190();
                                var35.field2945 = true;
                                var35.field2937 = var9;
                                var35.field2950 = class305.field4988 - var10;
                                var35.field2949 = class130.field1982 - var11;
                                var35.field2940 = var9.field4266;
                                class268.field4420.method1077(16711935, var35);
                            }
                            if (var9.field4309 && !var20) {
                                var9.field4309 = false;
                                if (var9.field4189 != null) {
                                    class190 var36 = new class190();
                                    var36.field2945 = true;
                                    var36.field2937 = var9;
                                    var36.field2950 = class305.field4988 - var10;
                                    var36.field2949 = class130.field1982 - var11;
                                    var36.field2940 = var9.field4189;
                                    class262.field4129.method1077(16711935, var36);
                                }
                            }
                            if (var20 && var9.field4295 != null) {
                                class190 var37 = new class190();
                                var37.field2945 = true;
                                var37.field2937 = var9;
                                var37.field2950 = class305.field4988 - var10;
                                var37.field2949 = class130.field1982 - var11;
                                var37.field2940 = var9.field4295;
                                class268.field4420.method1077(16711935, var37);
                            }
                            if (!var9.field4303 && var19) {
                                var9.field4303 = true;
                                if (var9.field4354 != null) {
                                    class190 var38 = new class190();
                                    var38.field2945 = true;
                                    var38.field2937 = var9;
                                    var38.field2950 = class305.field4988 - var10;
                                    var38.field2949 = class130.field1982 - var11;
                                    var38.field2940 = var9.field4354;
                                    class268.field4420.method1077(16711935, var38);
                                }
                            }
                            if (var9.field4303 && var19 && var9.field4300 != null) {
                                class190 var39 = new class190();
                                var39.field2945 = true;
                                var39.field2937 = var9;
                                var39.field2950 = class305.field4988 - var10;
                                var39.field2949 = class130.field1982 - var11;
                                var39.field2940 = var9.field4300;
                                class268.field4420.method1077(16711935, var39);
                            }
                            if (var9.field4303 && !var19) {
                                var9.field4303 = false;
                                if (var9.field4226 != null) {
                                    class190 var40 = new class190();
                                    var40.field2945 = true;
                                    var40.field2937 = var9;
                                    var40.field2950 = class305.field4988 - var10;
                                    var40.field2949 = class130.field1982 - var11;
                                    var40.field2940 = var9.field4226;
                                    class262.field4129.method1077(16711935, var40);
                                }
                            }
                            if (var9.field4218 != null) {
                                class190 var41 = new class190();
                                var41.field2937 = var9;
                                var41.field2940 = var9.field4218;
                                class153.field2474.method1077(16711935, var41);
                            }
                            if (var9.field4277 != null && class201.field3095 > var9.field4206) {
                                if (var9.field4244 == null || class201.field3095 - var9.field4206 > 32) {
                                    class190 var46 = new class190();
                                    var46.field2937 = var9;
                                    var46.field2940 = var9.field4277;
                                    class268.field4420.method1077(16711935, var46);
                                } else {
                                    label600: for (int var42 = var9.field4206; var42 < class201.field3095; var42++) {
                                        int var43 = class299.field4939[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field4244.length; var44++) {
                                            if (var9.field4244[var44] == var43) {
                                                class190 var45 = new class190();
                                                var45.field2937 = var9;
                                                var45.field2940 = var9.field4277;
                                                class268.field4420.method1077(16711935, var45);
                                                break label600;
                                            }
                                        }
                                    }
                                }
                                var9.field4206 = class201.field3095;
                            }
                            if (var9.field4341 != null && class138.field2178 > var9.field4281) {
                                if (var9.field4197 == null || class138.field2178 - var9.field4281 > 32) {
                                    class190 var51 = new class190();
                                    var51.field2937 = var9;
                                    var51.field2940 = var9.field4341;
                                    class268.field4420.method1077(16711935, var51);
                                } else {
                                    label576: for (int var47 = var9.field4281; var47 < class138.field2178; var47++) {
                                        int var48 = class83.field1201[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4197.length; var49++) {
                                            if (var9.field4197[var49] == var48) {
                                                class190 var50 = new class190();
                                                var50.field2937 = var9;
                                                var50.field2940 = var9.field4341;
                                                class268.field4420.method1077(16711935, var50);
                                                break label576;
                                            }
                                        }
                                    }
                                }
                                var9.field4281 = class138.field2178;
                            }
                            if (var9.field4275 != null && class211.field3205 > var9.field4252) {
                                if (var9.field4284 == null || class211.field3205 - var9.field4252 > 32) {
                                    class190 var56 = new class190();
                                    var56.field2937 = var9;
                                    var56.field2940 = var9.field4275;
                                    class268.field4420.method1077(16711935, var56);
                                } else {
                                    label552: for (int var52 = var9.field4252; var52 < class211.field3205; var52++) {
                                        int var53 = class25.field382[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4284.length; var54++) {
                                            if (var9.field4284[var54] == var53) {
                                                class190 var55 = new class190();
                                                var55.field2937 = var9;
                                                var55.field2940 = var9.field4275;
                                                class268.field4420.method1077(16711935, var55);
                                                break label552;
                                            }
                                        }
                                    }
                                }
                                var9.field4252 = class211.field3205;
                            }
                            if (var9.field4224 != null && class179.field2786 > var9.field4253) {
                                if (var9.field4352 == null || class179.field2786 - var9.field4253 > 32) {
                                    class190 var61 = new class190();
                                    var61.field2937 = var9;
                                    var61.field2940 = var9.field4224;
                                    class268.field4420.method1077(16711935, var61);
                                } else {
                                    label528: for (int var57 = var9.field4253; var57 < class179.field2786; var57++) {
                                        int var58 = class241.field3782[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field4352.length; var59++) {
                                            if (var9.field4352[var59] == var58) {
                                                class190 var60 = new class190();
                                                var60.field2937 = var9;
                                                var60.field2940 = var9.field4224;
                                                class268.field4420.method1077(16711935, var60);
                                                break label528;
                                            }
                                        }
                                    }
                                }
                                var9.field4253 = class179.field2786;
                            }
                            if (var9.field4324 != null && class29.field435 > var9.field4351) {
                                if (var9.field4174 == null || class29.field435 - var9.field4351 > 32) {
                                    class190 var66 = new class190();
                                    var66.field2937 = var9;
                                    var66.field2940 = var9.field4324;
                                    class268.field4420.method1077(16711935, var66);
                                } else {
                                    label504: for (int var62 = var9.field4351; var62 < class29.field435; var62++) {
                                        int var63 = class308.field5017[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field4174.length; var64++) {
                                            if (var9.field4174[var64] == var63) {
                                                class190 var65 = new class190();
                                                var65.field2937 = var9;
                                                var65.field2940 = var9.field4324;
                                                class268.field4420.method1077(16711935, var65);
                                                break label504;
                                            }
                                        }
                                    }
                                }
                                var9.field4351 = class29.field435;
                            }
                            if (class49.field720 > var9.field4302 && var9.field4283 != null) {
                                class190 var67 = new class190();
                                var67.field2937 = var9;
                                var67.field2940 = var9.field4283;
                                class268.field4420.method1077(16711935, var67);
                            }
                            if (class246.field3916 > var9.field4302 && var9.field4315 != null) {
                                class190 var68 = new class190();
                                var68.field2937 = var9;
                                var68.field2940 = var9.field4315;
                                class268.field4420.method1077(16711935, var68);
                            }
                            if (class343.field5515 > var9.field4302 && var9.field4259 != null) {
                                class190 var69 = new class190();
                                var69.field2937 = var9;
                                var69.field2940 = var9.field4259;
                                class268.field4420.method1077(16711935, var69);
                            }
                            if (class315.field5200 > var9.field4302 && var9.field4339 != null) {
                                class190 var70 = new class190();
                                var70.field2937 = var9;
                                var70.field2940 = var9.field4339;
                                class268.field4420.method1077(16711935, var70);
                            }
                            if (class282.field4631 > var9.field4302 && var9.field4289 != null) {
                                class190 var71 = new class190();
                                var71.field2937 = var9;
                                var71.field2940 = var9.field4289;
                                class268.field4420.method1077(16711935, var71);
                            }
                            var9.field4302 = class12.field157;
                            if (var9.field4183 != null) {
                                for (int var72 = 0; var72 < class21.field262; var72++) {
                                    class190 var73 = new class190();
                                    var73.field2937 = var9;
                                    var73.field2939 = class83.field1203[var72];
                                    var73.field2953 = class264.field4304[var72];
                                    var73.field2940 = var9.field4183;
                                    class268.field4420.method1077(16711935, var73);
                                }
                            }
                            if (class328.field5363 && var9.field4256 != null) {
                                class190 var74 = new class190();
                                var74.field2937 = var9;
                                var74.field2940 = var9.field4256;
                                class268.field4420.method1077(16711935, var74);
                            }
                        }
                    }
                    if (!var9.field4276 && class52.field788 == null && class185.field2876 == null && !class286.field4681) {
                        if ((var9.field4272 >= 0 || var9.field4348 != 0) && class305.field4988 >= var12 && class130.field1982 >= var13 && class305.field4988 < var14 && class130.field1982 < var15) {
                            if (var9.field4272 >= 0) {
                                class295.field4899 = arg0[var9.field4272];
                            } else {
                                class295.field4899 = var9;
                            }
                        }
                        if (var9.field4350 == 8 && class305.field4988 >= var12 && class130.field1982 >= var13 && class305.field4988 < var14 && class130.field1982 < var15) {
                            class261.field4110 = var9;
                        }
                        if (var9.field4228 > var9.field4236) {
                            class30.method259(class305.field4988, var9, class130.field1982, var11, -32, var9.field4228, var9.field4223 + var10, var9.field4236);
                        }
                    }
                    if (var9.field4350 == 0) {
                        method903(arg0, var9.field4204, var12, var13, var14, var15, var10 - var9.field4220, var11 - var9.field4242);
                        if (var9.field4314 != null) {
                            method903(var9.field4314, var9.field4204, var12, var13, var14, var15, var10 - var9.field4220, var11 - var9.field4242);
                        }
                        class167 var75 = (class167) class218.field3363.method29((long) var9.field4204, 103);
                        if (var75 != null) {
                            class21.method128(var75.field2631, var13, var15, var14, var12, 126, var11, var10);
                        }
                    }
                }
            }
        }
    }
}
