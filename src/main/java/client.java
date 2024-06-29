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
public class client extends class398 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "[[B")
    public static byte[][] field838 = new byte[1000][];

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field846 = 0;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field855;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsj;IILl;IIILsf;)V")
    public static final void method393(class248 arg0, int arg1, int arg2, class315 arg3, int arg4, int arg5, int arg6, class421 arg7) {
        field853++;
        if (arg3 == null) {
            return;
        }
        int var8;
        if (class212.field2884 == 4) {
            var8 = (int) class247.field3479 & 0x3FFF;
        } else {
            var8 = (int) class247.field3479 + class93.field1268 & 0x3FFF;
        }
        int var9 = Math.max(arg0.field3531 / arg6, arg0.field3564 / 2) + 10;
        int var10 = arg4 * arg4 + arg5 * arg5;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class240.field3364[var8];
        int var12 = class240.field3365[var8];
        if (class212.field2884 != 4) {
            var12 = var12 * 256 / (class30.field484 + 256);
            var11 = var11 * 256 / (class30.field484 + 256);
        }
        int var13 = arg4 * var11 + arg5 * var12 >> 15;
        int var14 = arg4 * var12 - (arg5 * var11) >> 15;
        arg3.method209(var13 + arg2 + (arg0.field3531 / 2) - (arg3.method199() / 2), arg0.field3564 / 2 + -var14 + arg1 + -(arg3.method207() / 2), arg7, arg2, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method394() {
        for (int var0 = -1; var0 < class93.field1274 + class402.field5869; var0++) {
            class162 var1;
            if (var0 < 0) {
                var1 = class383.field5609;
            } else if (var0 < class402.field5869) {
                var1 = class176.field2382[class117.field1528[var0]];
            } else {
                var1 = class388.field5670[class62.field943[var0 - class402.field5869]];
            }
            if (var1.field2119 >= 0) {
                int var2 = var1.method1091((byte) -119);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field5921 & 0x7F) != 0 || (var1.field5930 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field5921 & 0x7F) != 64 || (var1.field5930 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field5921 >> 7;
                    int var4 = var1.field5930 >> 7;
                    if (var1.field2119 > class386.field5640[var3][var4]) {
                        class386.field5640[var3][var4] = var1.field2119;
                        class338.field4989[var3][var4] = 1;
                    } else if (class386.field5640[var3][var4] == var1.field2119) {
                        var10002 = class338.field4989[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field5921 - var5 >> 7;
                    int var7 = var1.field5930 - var5 >> 7;
                    int var8 = var1.field5921 + var5 >> 7;
                    int var9 = var1.field5930 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field2119 > class386.field5640[var10][var11]) {
                                class386.field5640[var10][var11] = var1.field2119;
                                class338.field4989[var10][var11] = 1;
                            } else if (class386.field5640[var10][var11] == var1.field2119) {
                                var10002 = class338.field4989[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method395(int arg0) {
        field835++;
        if (class381.field5579 == 1000) {
            return;
        }
        class231.field3179++;
        if ((class231.field3179 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class11.field194 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class64.field966.setSeed((long) class11.field194);
        }
        this.method405((byte) -92);
        if (class372.field5482 != null) {
            class372.field5482.method831((byte) -60);
        }
        class84.method690(105);
        if (arg0 != -24551) {
            return;
        }
        class264.method1766(8);
        class450.method2781(true);
        class191.method1273(1);
        if (class126.field1647 != null) {
            class126.field1647.method520((int) class98.method768((byte) -79));
        }
        if (class303.field4554 != null) {
            int var3 = class303.field4554.method593(-125);
            class240.field3366 = var3;
        }
        class155.method1042((byte) -96);
        if (class381.field5579 == 0) {
            this.method406(10501);
            class7.method39(-15898);
        } else if (class381.field5579 == 5) {
            this.method406(10501);
            class7.method39(-15898);
        } else if (class381.field5579 == 25 || class381.field5579 == 28) {
            class119.method864(123);
        }
        if (class381.field5579 == 10) {
            this.method409(true);
            class299.method2028((byte) 125);
            class254.method1647(arg0 ^ 0xFFFFA018);
            class242.method1572((byte) 89);
        } else if (class381.field5579 == 30) {
            class299.method2024(false);
        } else if (class381.field5579 == 40) {
            class242.method1572((byte) 89);
            if (class241.field3371 != -3) {
                if (class241.field3371 == 15) {
                    class241.method1558(0);
                } else if (class241.field3371 != 2) {
                    class163.method1101(0);
                }
            }
        }
        class219.method1434(class126.field1647, 17269);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method396(int arg0, byte arg1) {
        class305.field4565.field786 = arg0;
        class7.field104 = 0;
        field837++;
        if (arg1 >= -72) {
            field842 = 112;
        }
        class149.field1902 = null;
        class154.field1962 = null;
        class305.field4565.field784++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method397() {
        for (int var0 = 0; var0 < class351.field5217; var0++) {
            int[] var1 = class386.field5640[var0];
            for (int var2 = 0; var2 < class143.field1815; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method398(int arg0) {
        if (arg0 != 45) {
            field846 = 96;
        }
        field854++;
        if (class305.field4565.field784 > class331.field4881) {
            class16.field265 = (class305.field4565.field784 - 1) * 250;
            if (field842 == class64.field964) {
                class64.field964 = class129.field1693;
            } else {
                class64.field964 = field842;
            }
            if (class16.field265 > 3000) {
                class16.field265 = 3000;
            }
            if (class305.field4565.field784 >= 2 && class305.field4565.field786 == 6) {
                this.method2554("js5connect_outofdate", 63);
                class381.field5579 = 1000;
                return;
            }
            if (class305.field4565.field784 >= 4 && class305.field4565.field786 == -1) {
                this.method2554("js5crc", 63);
                class381.field5579 = 1000;
                return;
            }
            if (class305.field4565.field784 >= 4 && (class381.field5579 == 0 || class381.field5579 == 5)) {
                if (class305.field4565.field786 == 7 || class305.field4565.field786 == 9) {
                    this.method2554("js5connect_full", 63);
                } else if (class305.field4565.field786 > 0) {
                    this.method2554("js5connect", 63);
                } else {
                    this.method2554("js5io", 63);
                }
                class381.field5579 = 1000;
                return;
            }
        }
        class331.field4881 = class305.field4565.field784;
        if (class16.field265 > 0) {
            class16.field265--;
            return;
        }
        try {
            if (class7.field104 == 0) {
                class154.field1962 = class63.field948.method2385(0, class64.field964, class415.field6005);
                class7.field104++;
            }
            if (class7.field104 == 1) {
                if (class154.field1962.field3104 == 2) {
                    this.method396(1000, (byte) -111);
                    return;
                }
                if (class154.field1962.field3104 == 1) {
                    class7.field104++;
                }
            }
            if (class7.field104 == 2) {
                class149.field1902 = new class359((Socket) class154.field1962.field3105, class63.field948);
                class341 var2 = new class341(5);
                var2.method2204(15, 8);
                var2.method2240((byte) -88, 556);
                class149.field1902.method2365(var2.field5042, 5, arg0 + 4955, 0);
                class7.field104++;
                class274.field4028 = class98.method768((byte) 102);
            }
            if (class7.field104 == 3) {
                if (class381.field5579 == 0 || class381.field5579 == 5 || class149.field1902.method2359(true) > 0) {
                    int var3 = class149.field1902.method2362(arg0 + 27603);
                    if (var3 != 0) {
                        this.method396(var3, (byte) -98);
                        return;
                    }
                    class7.field104++;
                } else if ((class98.method768((byte) -101) - class274.field4028) > 30000L) {
                    this.method396(1001, (byte) -79);
                    return;
                }
            }
            if (class7.field104 == 4) {
                boolean var4 = class381.field5579 == 5 || class381.field5579 == 10 || class381.field5579 == 28;
                class305.field4565.method361(true, class149.field1902, !var4);
                class149.field1902 = null;
                class7.field104 = 0;
                class154.field1962 = null;
            }
        } catch (IOException var5) {
            this.method396(1002, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lir;B)V")
    private static final void method399(class185 arg0, byte arg1) {
        if (arg1 != 13) {
            main((String[]) null);
        }
        class267.field3958 = arg0;
        field852++;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method400(int arg0) {
        field851++;
        class51 var1 = class390.field5701;
        synchronized (class390.field5701) {
            class390.field5701.method372(125);
            if (arg0 != 1) {
                field838 = null;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field849++;
        try {
            if (arg0.length != 4) {
                class67.method572(6270, "argument count");
            }
            class386.field5644 = Integer.parseInt(arg0[0]);
            class72.field1026 = 2;
            if (arg0[1].equals("live")) {
                class173.field2353 = 0;
            } else if (arg0[1].equals("rc")) {
                class173.field2353 = 1;
            } else if (arg0[1].equals("wip")) {
                class173.field2353 = 2;
            } else {
                class67.method572(6270, "modewhat");
            }
            class387.field5669 = class47.method333(arg0[2], (byte) -128);
            if (class387.field5669 == -1) {
                if (arg0[2].equals("english")) {
                    class387.field5669 = 0;
                } else if (arg0[2].equals("german")) {
                    class387.field5669 = 1;
                } else {
                    class67.method572(6270, "language");
                }
            }
            class347.method2297(class387.field5669, -25721);
            class397.field5794 = false;
            class191.field2655 = false;
            if (arg0[3].equals("game0")) {
                class396.field5783 = 0;
            } else if (arg0[3].equals("game1")) {
                class396.field5783 = 1;
            } else {
                class67.method572(6270, "game");
            }
            class129.field1697 = "";
            class430.field6250 = 0;
            class410.field5953 = class396.field5783;
            class197.field2716 = 0;
            client var1 = new client();
            class195.field2701 = var1;
            var1.method2558(556, 1024, false, class173.field2353 + 32, class396.field5783 == 1 ? "stellardawn" : "runescape", 768, 29, -1);
            class428.field6222.setLocation(40, 40);
        } catch (Exception var3) {
            class266.method1780(1, (String) null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsj;)Z")
    public static final boolean method401(class248 arg0) {
        if (class126.field1649) {
            if (method402(arg0).field3108 != 0) {
                return false;
            }
            if (arg0.field3555 == 0) {
                return false;
            }
        }
        return arg0.field3605;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lsj;)Lee;")
    public static final class226 method402(class248 arg0) {
        class226 var1 = (class226) class167.field2270.method2826(false, ((long) arg0.field3636 << 32) + (long) arg0.field3505);
        return var1 == null ? arg0.field3516 : var1;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static void method403(int arg0) {
        field838 = null;
        if (arg0 <= 11) {
            field846 = 112;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method404(int arg0) {
        method403(100);
        field848++;
        class390.method2519(107);
        class161.method1078(-128);
        class398.method2552(arg0 + 6621);
        class47.method338((byte) -18);
        class118.method861((byte) 123);
        class298.method2018(false);
        class31.method244((byte) -25);
        class198.method1310(-1);
        class341.method2242(arg0 + 72148);
        class359.method2364(-72);
        class50.method360((byte) -99);
        class243.method1579(117);
        class112.method829(true);
        class232.method1511(true);
        class185.method1218(94);
        class51.method380(92);
        class163.method1103(arg0 ^ 0x19BE);
        class279.method1836(-9);
        class280.method1848(108);
        class379.method2470((byte) 89);
        class269.method1795((byte) 125);
        class114.method840((byte) 76);
        class8.method46((byte) 60);
        class248.method1632((byte) 88);
        class131.method942(arg0 - 4989);
        class453.method2820((byte) 45);
        class242.method1566(19476);
        class72.method594(arg0 ^ 0xFFFFE678);
        class69.method584(238);
        class429.method2679(3);
        class20.method167((byte) 69);
        class395.method2543((byte) 95);
        class277.method1820((byte) 96);
        class436.method2737(127);
        class233.method1514(-121);
        class162.method1096(-117);
        class129.method906((byte) 57);
        class77.method614(-1);
        class316.method2072(arg0 ^ 0xFFFFE65E);
        class223.method1454(arg0 + 3603);
        class28.method231((byte) -115);
        class421.method2649((byte) -39);
        class247.method1612(-127);
        class431.method2698((byte) -99);
        class9.method59((byte) -104);
        class257.method1702(arg0 ^ 0xFFFFC95E);
        class193.method1288((byte) -117);
        class305.method2037(24047);
        class16.method127(arg0 + 6568);
        class295.method1998((byte) -104);
        class439.method2747((byte) -104);
        class418.method2635(arg0 + 6715);
        class173.method1148(arg0 ^ arg0);
        class181.method1189(81);
        class349.method2309(arg0 - 24459);
        class385.method2495((byte) -75);
        class255.method1648(84);
        class239.method1551((byte) 74);
        class312.method2057(-14139);
        class420.method2647((byte) -118);
        class125.method886(1);
        class227.method1480((byte) 108);
        class249.method1636(0);
        class66.method567(112);
        class261.method1752((byte) 91);
        class212.method1390(73);
        class93.method749(arg0 + 6726);
        class238.method1548(-6373);
        class107.method812(0);
        class373.method2451(1);
        class189.method1261(true);
        class159.method1071((byte) 110);
        class216.method1424(arg0 + 6614);
        class117.method855(-1);
        class425.method2667((byte) -118);
        class386.method2501((byte) -128);
        class134.method956((byte) -65);
        class194.method1291(-125);
        class320.method2111((byte) -108);
        class142.method986(arg0 - 2498);
        class175.method1161(339);
        class24.method212(arg0 + 6504);
        class57.method420(0);
        class184.method1193(0);
        class139.method974(24687);
        class435.method2714(false);
        class217.method1429(arg0 ^ 0xFFFFE62B);
        class256.method1653((byte) -45);
        class82.method654();
        class101.method778(true);
        class174.method1159(76);
        class274.method1811(false);
        class219.method1439(0);
        class399.method2564((byte) 87);
        class293.method1986();
        class200.method1319();
        class108.method817(arg0 ^ 0x19E1);
        class27.method223(114);
        class414.method2613();
        class348.method2304((byte) -58);
        class170.method1132(4858);
        class352.method2324(-120);
        class357.method2351(-126);
        class3.method14(7795);
        class33.method257(-127);
        class331.method2169(1);
        class154.method1040(arg0 ^ 0x107B);
        class443.method2765((byte) 18);
        class21.method192(-78);
        class149.method1025(64);
        class45.method328((byte) 119);
        class60.method530((byte) -124);
        class234.method1521(true);
        class63.method557((byte) 25);
        class290.method1976(-21219);
        class235.method1523((byte) 0);
        class92.method746(arg0 ^ 0xFFFFE657);
        class178.method1176(127);
        class370.method2433(-1);
        class244.method1589(0);
        class104.method785(125);
        class318.method2084(false);
        class333.method2174((byte) 126);
        class273.method1803(arg0 + 6613);
        class266.method1783(0);
        class25.method221(-1);
        class289.method1968(0);
        class237.method1535((byte) -20);
        class299.method2029((byte) 116);
        class109.method822((byte) 74);
        class165.method1113(68);
        class157.method1048(arg0 ^ 0x34B7);
        class325.method2134((byte) 118);
        class58.method422((byte) 79);
        class100.method773((byte) 82);
        class199.method1315(true);
        class287.method1955();
        class322.method2124((byte) -127);
        class123.method879(7597);
        class452.method2807(0);
        class335.method2187(false);
        class407.method2578(0);
        class402.method2570((byte) 107);
        class372.method2448(35);
        class86.method700(5882);
        class411.method2603();
        class203.method1349((byte) 85);
        class321.method2116(-62);
        class64.method561(65535);
        class441.method2759(false);
        class127.method899(1);
        class400.method2569(-20716);
        class236.method1532((byte) 90);
        class356.method2340(12295);
        class308.method2041(true);
        class71.method585((byte) -121);
        class267.method1786(-48);
        class13.method97(arg0 ^ 0xFFFFAA2E);
        class387.method2508(128);
        class309.method2044(128);
        class251.method1639(arg0 ^ 0xFFFFE641);
        class144.method997(110);
        class4.method24(3);
        class254.method1646(arg0 ^ 0x19AB);
        class240.method1553((byte) 124);
        class362.method2379((byte) -50);
        class224.method1463();
        class73.method598(-73);
        class410.method2594((byte) -55);
        class438.method2745(3);
        class81.method634((byte) 120);
        class258.method1707(-32768);
        class246.method1604(-3306);
        class252.method1642(false);
        class62.method553((byte) 30);
        class171.method1147((byte) 56);
        class278.method1826(arg0 + 6500);
        class424.method2664((byte) 84);
        class406.method2574(-7);
        class186.method1238(arg0 + 6657);
        class40.method297(arg0 ^ 0xFFFFE62A);
        class301.method2032(-121);
        class328.method2153(arg0 + 6724);
        class218.method1433();
        class230.method1495(46);
        class1.method2((byte) -29);
        class6.method33(arg0 ^ 0xFFFFE673);
        class353.method2328(5058);
        class294.method1991(-5889);
        class133.method949(false);
        class164.method1108((byte) -56);
        class361.method2377(arg0 + 6725);
        class389.method2514(99);
        class190.method1269(0);
        class327.method2142();
        class264.method1767(arg0 ^ 0xFFFFE62A);
        class43.method308(-1);
        class393.method2525(arg0 + 6623);
        class394.method2530(60);
        class14.method105(false);
        class68.method574((byte) -117);
        class354.method2329(arg0 ^ 0xFFFFE707);
        class150.method1031();
        class313.method2063();
        class128.method903((byte) 124);
        class403.method2572(27228);
        class229.method1491((byte) -17);
        class383.method2490(false);
        class143.method991(15702);
        class17.method128(-1);
        class329.method2157(true);
        class351.method2316((byte) 110);
        class44.method312();
        class434.method2711();
        class276.method1818((byte) -45);
        class419.method2637();
        class346.method2288(-20748);
        class36.method280(arg0 ^ 0xFFFFE60F);
        class7.method35((byte) 47);
        class432.method2705(true);
        class215.method1415(125);
        class263.method1758((byte) -88);
        class369.method2430(-15);
        class132.method947((byte) 115);
        class211.method1381(false);
        class113.method836(64);
        class342.method2267((byte) 22);
        class296.method2008((byte) 110);
        class192.method1280(false);
        class415.method2618(-91);
        class136.method964((byte) 83);
        class245.method1601(-1);
        class388.method2513(true);
        class397.method2551((byte) -105);
        class197.method1304(arg0 + 23964);
        class15.method110(123);
        class48.method343(-119);
        class106.method804(9);
        class423.method2662(arg0 + 72149);
        class428.method2675((byte) -110);
        class334.method2184(false);
        class74.method601(-33);
        class350.method2311(0);
        class241.method1556((byte) 76);
        class337.method2190(true);
        class176.method1167((byte) -104);
        class188.method1249((byte) -73);
        class145.method1009(false);
        class396.method2548(17261);
        class391.method2521((byte) 35);
        class87.method705(63);
        class338.method2196(0);
        class41.method300(124);
        class46.method332(-2);
        class122.method876((byte) 8);
        class38.method285((byte) 109);
        class360.method2372((byte) -124);
        class96.method763(200);
        class268.method1788(arg0 + 6612);
        class444.method2768(0);
        class427.method2674((byte) -96);
        class355.method2334(true);
        class430.method2684(118);
        class297.method2012((byte) 10);
        class450.method2780((byte) 116);
        class231.method1497(true);
        class265.method1775(arg0 ^ 0xFFFFCB0B);
        class222.method1453((byte) -80);
        class384.method2494(false);
        class422.method2655((byte) 55);
        class95.method760((byte) -3);
        class377.method2464((byte) -116);
        class147.method1016((byte) -91);
        class30.method239(true);
        class85.method694(0);
        class451.method2806();
        class187.method1245();
        class158.method1051(0);
        class179.method1181(110);
        class126.method895(true);
        class281.method1858(arg0 ^ 0xFFFFEB44);
        class67.method573(32);
        class271.method1798(true);
        class366.method2415((byte) -95);
        class140.method981((byte) -113);
        class204.method1351(56);
        class195.method1296((byte) -24);
        class160.method1077(2);
        class116.method852(-10800);
        class166.method1118(arg0 + 6737);
        class110.method823((byte) 85);
        class78.method619((byte) 45);
        class210.method1372(false);
        class382.method2487((byte) -71);
        class228.method1489(false);
        class167.method1123(false);
        class90.method720((byte) 11);
        class115.method847((byte) 104);
        class53.method386((byte) -123);
        class437.method2741((byte) -76);
        class447.method2776(0);
        class169.method1131(-84);
        class303.method2034(-12279);
        class39.method289(arg0 ^ 0x279);
        if (class398.field5840) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field840++;
        if (!this.method2562(37)) {
            return;
        }
        class386.field5644 = Integer.parseInt(this.getParameter("worldid"));
        class72.field1026 = Integer.parseInt(this.getParameter("modewhere"));
        if (class72.field1026 < 0 || class72.field1026 > 1) {
            class72.field1026 = 0;
        }
        class173.field2353 = Integer.parseInt(this.getParameter("modewhat"));
        if (class173.field2353 < 0 || class173.field2353 > 2) {
            class173.field2353 = 0;
        }
        try {
            class387.field5669 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class387.field5669 = 0;
        }
        class347.method2297(class387.field5669, -25721);
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class397.field5794 = true;
        } else {
            class397.field5794 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class191.field2655 = true;
        } else {
            class191.field2655 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class396.field5783 = 1;
        } else {
            class396.field5783 = 0;
        }
        try {
            class430.field6250 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class430.field6250 = 0;
        }
        class348.field5188 = this.getParameter("quiturl");
        class129.field1697 = this.getParameter("settings");
        if (class129.field1697 == null) {
            class129.field1697 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class197.field2716 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class197.field2716 = 0;
            }
        }
        class410.field5953 = Integer.parseInt(this.getParameter("colourid"));
        if (class410.field5953 < 0 || class410.field5953 >= class257.field3773.length) {
            class410.field5953 = 0;
        }
        class195.field2701 = this;
        this.method2559(0, 556, class173.field2353 + 32, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    private final void method405(byte arg0) {
        field844++;
        if (arg0 >= -27) {
            method397();
        }
        boolean var2 = class305.field4565.method357(-27458);
        if (!var2) {
            this.method398(45);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    private final void method406(int arg0) {
        if (!class257.field3777) {
            label227: while (true) {
                do {
                    if (!class335.method2186(127)) {
                        break label227;
                    }
                } while (class114.field1493 != 's' && class114.field1493 != 'S');
                class257.field3777 = true;
            }
        }
        field850++;
        if (class9.field158 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class98.method768((byte) 110);
            if (class338.field4997 == 0L) {
                class338.field4997 = var4;
            }
            if (var3 > 16384 && var4 - class338.field4997 < 5000L) {
                if ((var4 - class198.field2736) > 1000L) {
                    System.gc();
                    class198.field2736 = var4;
                }
                class428.field6226 = class399.field5845;
                class428.field6221 = 5;
            } else {
                class9.field158 = 10;
                class428.field6226 = class355.field5257;
                class428.field6221 = 5;
            }
        } else if (class9.field158 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class420.field6108[var6] = class328.method2151((byte) -69, class351.field5217, class143.field1815);
            }
            class428.field6221 = 10;
            class428.field6226 = class263.field3859;
            class9.field158 = 20;
        } else if (class9.field158 == 20) {
            if (class372.field5482 == null) {
                class372.field5482 = new class112(class305.field4565, class197.field2723);
            }
            if (class372.field5482.method830(true)) {
                class277.field4061 = class126.method894(true, false, (byte) 126, 1, 0);
                class58.field869 = class126.method894(true, false, (byte) 108, 1, 1);
                class90.field1225 = class126.method894(true, false, (byte) 68, 1, 2);
                class95.field1293 = class126.method894(true, false, (byte) 117, 1, 3);
                class14.field228 = class126.method894(true, false, (byte) 105, 1, 4);
                class68.field992 = class126.method894(true, true, (byte) 85, 1, 5);
                class388.field5677 = class126.method894(false, true, (byte) 102, 1, 6);
                class115.field1497 = class126.method894(true, false, (byte) 106, 1, 7);
                class118.field1532 = class126.method894(true, false, (byte) 70, 1, 8);
                class273.field4007 = class126.method894(true, false, (byte) 125, 1, 9);
                class198.field2730 = class126.method894(true, false, (byte) 89, 1, 10);
                class394.field5733 = class126.method894(true, false, (byte) 108, 1, 11);
                class266.field3954 = class126.method894(true, false, (byte) 98, 1, 12);
                class341.field5043 = class126.method894(true, false, (byte) 121, 1, 13);
                class122.field1582 = class126.method894(false, false, (byte) 103, 1, 14);
                class107.field1408 = class126.method894(true, false, (byte) 119, 1, 15);
                class132.field1733 = class126.method894(true, false, (byte) 77, 1, 16);
                class184.field2475 = class126.method894(true, false, (byte) 122, 1, 17);
                class289.field4332 = class126.method894(true, false, (byte) 124, 1, 18);
                class60.field924 = class126.method894(true, false, (byte) 85, 1, 19);
                class112.field1440 = class126.method894(true, false, (byte) 92, 1, 20);
                class100.field1323 = class126.method894(true, false, (byte) 113, 1, 21);
                class386.field5647 = class126.method894(true, false, (byte) 78, 1, 22);
                class299.field4523 = class126.method894(true, true, (byte) 108, 1, 23);
                class198.field2737 = class126.method894(true, false, (byte) 75, 1, 24);
                class350.field5206 = class126.method894(true, false, (byte) 86, 1, 25);
                class350.field5209 = class126.method894(true, true, (byte) 117, 1, 26);
                class107.field1412 = class126.method894(true, false, (byte) 109, 1, 27);
                class81.field1117 = class126.method894(true, true, (byte) 123, 1, 28);
                class9.field158 = 30;
                class428.field6221 = 15;
                class428.field6226 = class230.field3162;
            } else {
                class428.field6226 = class72.field1025;
                class428.field6221 = 12;
            }
        } else if (class9.field158 == 30) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class386.field5643[var8].method1500(-126) * class234.field3262[var8] / 100;
            }
            if (var7 == 100) {
                class428.field6226 = class69.field997;
                class428.field6221 = 20;
                class385.method2496(class118.field1532, arg0 - 10593);
                class395.method2532(class118.field1532, -5115);
                class9.field158 = 40;
            } else {
                class428.field6221 = 20;
                if (var7 != 0) {
                    class428.field6226 = class397.field5798 + var7 + "%";
                }
            }
        } else if (class9.field158 == 40) {
            if (class81.field1117.method1227(arg0 ^ 0x5EEF)) {
                this.method412(class81.field1117.method1234(1, (byte) 76), 32);
                class428.field6221 = 25;
                class428.field6226 = class328.field4846;
                class9.field158 = 50;
            } else {
                class428.field6226 = class355.field5258 + class81.field1117.method1207(-3) + "%";
                class428.field6221 = 25;
            }
        } else if (class9.field158 == 50) {
            class410.method2592(false, 2, class338.field4993, 22050);
            class235.field3280 = new class20();
            class235.field3280.method146(128, 9, 128);
            class78.field1088 = class440.method2750(class63.field948, 0, 22050, 29054, class422.field6138);
            class78.field1088.method2539(class235.field3280, (byte) 122);
            class407.method2579(class235.field3280, class122.field1582, class107.field1408, (byte) 106, class14.field228);
            class261.field3836 = class440.method2750(class63.field948, 1, 2048, 29054, class422.field6138);
            class40.field602 = new class32();
            class261.field3836.method2539(class40.field602, (byte) 59);
            class322.field4798 = new class277(22050, class388.field5673);
            class162.field2139 = class388.field5677.method1220("scape main", 0);
            class428.field6221 = 30;
            class428.field6226 = class338.field4986;
            class9.field158 = 60;
        } else if (class9.field158 == 60) {
            int var9 = class279.method1829((byte) 102, class118.field1532, class341.field5043);
            int var10 = class90.method719((byte) -112);
            if (var10 > var9) {
                class428.field6226 = class450.field6452 + var9 * 100 / var10 + "%";
                class428.field6221 = 35;
            } else {
                class428.field6226 = class15.field239;
                class9.field158 = 70;
                class428.field6221 = 35;
            }
        } else if (class9.field158 == 70) {
            int var11 = class143.method990(class118.field1532, (byte) -78);
            int var12 = class6.method30(arg0 - 22716);
            if (var12 > var11) {
                class428.field6226 = class274.field4027 + var11 * 100 / var12 + "%";
                class428.field6221 = 40;
            } else {
                class428.field6221 = 40;
                class9.field158 = 80;
                class428.field6226 = class447.field6435;
            }
        } else if (class9.field158 == 80) {
            if (class350.field5209.method1227(30698)) {
                class74.field1035 = new class345(class350.field5209, class273.field4007, class118.field1532);
                class428.field6221 = 45;
                class428.field6226 = class297.field4489;
                class9.field158 = 90;
            } else {
                class428.field6226 = class115.field1500 + class350.field5209.method1207(-3) + "%";
                class428.field6221 = 45;
            }
        } else if (class9.field158 == 90) {
            class428.field6226 = class393.field5728;
            class9.field158 = 95;
            class428.field6221 = 50;
        } else if (class9.field158 == 95) {
            if (class257.field3777) {
                class325.field4817 = 0;
                class249.field3681 = 0;
                class104.field1359 = 0;
                class355.field5263 = 0;
                class195.field2700 = 1;
            }
            class257.field3777 = true;
            class212.method1398(-33, class63.field948);
            class74.method602((byte) 108);
            class211.method1384((byte) 125, class325.field4817, false);
            class9.field158 = 100;
            class428.field6221 = 55;
            class428.field6226 = class25.field453;
        } else if (class9.field158 == 100) {
            class74.method599(class126.field1647, class341.field5043, (byte) 127, class118.field1532);
            class428.field6221 = 60;
            class428.field6226 = class295.field4451;
            class63.method558(5, true);
            class9.field158 = 110;
        } else if (class9.field158 == 110) {
            class90.field1225.method1227(arg0 ^ 0x5EEF);
            byte var13 = 0;
            int var14 = var13 + class90.field1225.method1207(-3);
            class132.field1733.method1227(30698);
            int var15 = var14 + class132.field1733.method1207(-3);
            class184.field2475.method1227(30698);
            int var16 = var15 + class184.field2475.method1207(-3);
            class289.field4332.method1227(30698);
            int var17 = var16 + class289.field4332.method1207(-3);
            class60.field924.method1227(30698);
            int var18 = var17 + class60.field924.method1207(-3);
            class112.field1440.method1227(arg0 + 20197);
            int var19 = var18 + class112.field1440.method1207(-3);
            class100.field1323.method1227(30698);
            int var20 = var19 + class100.field1323.method1207(-3);
            class386.field5647.method1227(arg0 ^ 0x5EEF);
            int var21 = var20 + class386.field5647.method1207(-3);
            class198.field2737.method1227(arg0 ^ 0x5EEF);
            int var22 = var21 + class198.field2737.method1207(-3);
            class350.field5206.method1227(arg0 + 20197);
            int var23 = var22 + class350.field5206.method1207(-3);
            class107.field1412.method1227(30698);
            int var24 = var23 + class107.field1412.method1207(arg0 ^ 0xFFFFD6F8);
            if (var24 < 1100) {
                class428.field6221 = 65;
                class428.field6226 = class144.field1848 + var24 / 11 + "%";
            } else {
                method399(class90.field1225, (byte) 13);
                class377.method2461(1, class90.field1225);
                class28.method232(class90.field1225, (byte) 106);
                class421.method2648(-37, class90.field1225, class115.field1497);
                class243.method1577(true, (byte) 13, class132.field1733, class115.field1497);
                class203.method1347(true, 1120, class115.field1497, class289.field4332);
                class126.method897(256, class60.field924, true, class115.field1497);
                class142.method985((byte) 70, class90.field1225);
                class115.method846(class277.field4061, 128, class112.field1440, class58.field869);
                class395.method2544(class90.field1225, (byte) 11);
                class251.method1640(class115.field1497, class100.field1323, (byte) 126);
                class234.method1522(class386.field5647, -13495);
                class362.method2381(16, class90.field1225);
                class248.method1634((byte) 70, class118.field1532, class95.field1293, class341.field5043, class115.field1497);
                class95.method757(class90.field1225, 0);
                class345.method2284(0, class184.field2475);
                class161.method1080(class350.field5206, class198.field2737, new class318(), 36);
                class211.method1375(class350.field5206, class198.field2737, -1);
                class447.method2775(class90.field1225, (byte) 97);
                class309.method2043(0, class90.field1225);
                class203.method1344(-2, class90.field1225);
                class439.method2748(class118.field1532, 92, class90.field1225);
                class281.method1859(0, class90.field1225, class118.field1532);
                class28.method230((byte) -62, class90.field1225);
                class226.method1471((byte) 56, class118.field1532, class90.field1225);
                class145.method1005(class90.field1225, 30167);
                class119.method863(class90.field1225, (byte) -73);
                class428.field6221 = 65;
                class428.field6226 = class353.field5236;
                class361.method2374((byte) 96);
                class9.field158 = 120;
            }
        } else if (class9.field158 == 120) {
            int var25 = class133.method950(class118.field1532, 0);
            int var26 = class191.method1270(-20129);
            if (var26 > var25) {
                class428.field6226 = class352.field5223 + var25 * 100 / var26 + "%";
                class428.field6221 = 70;
            } else {
                class248.method1629(class118.field1532, true, class126.field1647);
                class281.method1857(0, class109.field1428);
                class428.field6221 = 70;
                class9.field158 = 130;
                class428.field6226 = class63.field945;
            }
        } else if (class9.field158 == 130) {
            class107.field1411 = new class31();
            class63.field948.method2397(class107.field1411, false, 10);
            class428.field6221 = 75;
            class9.field158 = 140;
            class428.field6226 = class129.field1687;
        } else if (class9.field158 == 140) {
            if (class198.field2730.method1230("huffman", (byte) 8, "")) {
                class325 var27 = new class325(class198.field2730.method1206("", 0, "huffman"));
                class43.method306(var27, arg0 - 10502);
                class428.field6226 = class6.field82;
                class9.field158 = 150;
                class428.field6221 = 80;
            } else {
                class428.field6226 = class195.field2706 + "0%";
                class428.field6221 = 80;
            }
        } else if (class9.field158 == 150) {
            if (!class95.field1293.method1227(arg0 ^ 0x5EEF)) {
                class428.field6226 = class249.field3685 + class95.field1293.method1207(-3) * 3 / 4 + "%";
                class428.field6221 = 85;
            } else if (!class266.field3954.method1227(arg0 + 20197)) {
                class428.field6226 = class249.field3685 + ((class266.field3954.method1207(-3) / 10) + 75) + "%";
                class428.field6221 = 85;
            } else if (!class341.field5043.method1227(30698)) {
                class428.field6226 = class249.field3685 + (class341.field5043.method1207(-3) / 20 + 85) + "%";
                class428.field6221 = 85;
            } else if (class299.field4523.method1233((byte) -4, "details")) {
                class200.method1332(class299.field4523);
                class298.method2022(class107.field1412, arg0 ^ 0x2D05);
                class360.method2369(class74.field1035, arg0 ^ 0x29A5, class115.field1497);
                class428.field6221 = 85;
                class9.field158 = 160;
                class428.field6226 = class252.field3694;
            } else {
                class428.field6226 = class249.field3685 + (class299.field4523.method1236("details", (byte) 84) / 10 + 90) + "%";
                class428.field6221 = 85;
            }
        } else if (class9.field158 == 160) {
            int var28 = class241.method1557(true);
            if (var28 == -1) {
                class428.field6221 = 90;
                class428.field6226 = class257.field3765;
            } else if (var28 == 7 || var28 == 9) {
                this.method2554("worldlistfull", 63);
                class63.method558(1000, true);
            } else if (class322.field4797) {
                class9.field158 = 170;
                class428.field6226 = class296.field4472;
                class428.field6221 = 90;
            } else {
                this.method2554("worldlistio_" + var28, 63);
                class63.method558(1000, true);
            }
        } else if (class9.field158 == 170) {
            class178.field2391 = new String[class45.field681];
            class28.field476 = new boolean[class136.field1757];
            class216.field3014 = new int[class136.field1757];
            for (int var29 = 0; var29 < class136.field1757; var29++) {
                if (class334.method2185(6137, var29).field1430 == 0) {
                    class28.field476[var29] = true;
                    class329.field4855++;
                }
                class216.field3014[var29] = -1;
            }
            class276.method1816(112);
            class47.field714 = class95.field1293.method1220("loginscreen", 0);
            class68.field992.method1210(false, 13, true);
            class388.field5677.method1210(true, 13, true);
            class118.field1532.method1210(true, arg0 - 10488, true);
            class341.field5043.method1210(true, 13, true);
            class198.field2730.method1210(true, 13, true);
            class95.field1293.method1210(true, arg0 ^ 0x2908, true);
            class90.field1225.field2501 = 2;
            class85.field1171 = true;
            class184.field2475.field2501 = 2;
            class132.field1733.field2501 = 2;
            class289.field4332.field2501 = 2;
            class60.field924.field2501 = 2;
            class112.field1440.field2501 = 2;
            class100.field1323.field2501 = 2;
            class246.method1611(-43, false, class195.field2700, -1, -1);
            class9.field158 = 180;
            class428.field6226 = class45.field689;
            class428.field6221 = 95;
        } else {
            if (arg0 != 10501) {
                method403(40);
            }
            if (class9.field158 == 180) {
                class296.method2009((byte) -14, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method407(int arg0) {
        field836++;
        if (class320.field4757) {
            class322.method2119((byte) -61);
        }
        if (class126.field1647 != null) {
            class126.field1647.method2019(0);
        }
        if (class211.field2872 != null) {
            class90.method718(class211.field2872, class63.field948, -16783);
            class211.field2872 = null;
        }
        if (class107.field1411 != null) {
            class107.field1411.field511 = false;
        }
        class107.field1411 = null;
        if (class290.field4380 != null) {
            class290.field4380.method2360((byte) -121);
            class290.field4380 = null;
        }
        if (arg0 < 114) {
            return;
        }
        class169.method1128(-3, class422.field6138);
        class274.method1810(class422.field6138, 0);
        if (class303.field4554 != null) {
            class303.field4554.method595(-29701, class422.field6138);
        }
        class33.method255(-12544);
        class385.method2497((byte) 120);
        class303.field4554 = null;
        if (class78.field1088 != null) {
            class78.field1088.method2534(false);
        }
        if (class261.field3836 != null) {
            class261.field3836.method2534(false);
        }
        class305.field4565.method356(true);
        class197.field2723.method1584((byte) 32);
        if (class427.field6212 != null) {
            class427.field6212.method2722(27277);
            class427.field6212 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lsj;)Lsj;")
    public static final class248 method408(class248 arg0) {
        int var1 = method402(arg0).method1466((byte) 126);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class27.method224(65535, arg0.field3584);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method409(boolean arg0) {
        field847++;
        class85.field1183 = 0;
        while (class335.method2186(127) && class85.field1183 < 128) {
            if (!class289.method1966(3032) || !(class114.field1493 == '`' || class114.field1493 == '§')) {
                class348.field5181[class85.field1183] = class27.field475;
                class309.field4581[class85.field1183] = class114.field1493;
                class85.field1183++;
            } else if (class62.method548(true)) {
                class357.method2344((byte) -101);
            } else {
                class93.method748(-7065);
            }
        }
        if (class62.method548(arg0)) {
            class384.method2493((byte) 79);
        }
        class216.field3021++;
        class97.method766(106, (class248) null, -1, -1);
        class139.method976(-1, (byte) 107, -1, (class248) null);
        if (class233.field3246 != -1) {
            class435.method2715(0, class435.field6313, 0, class233.field3246, 0, (byte) -128, class357.field5298, 0);
        }
        class394.field5732++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class163 var12 = class388.field5670[var2];
            if (var12 != null) {
                byte var13 = var12.field2206.field2608;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method1091((byte) -83);
                    if ((var13 & 0x2) != 0 && var12.field2202 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field2190[0] + var15;
                            int var18 = var12.field2189[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (class351.field5217 - var14 - 1 < var17) {
                                var17 = class351.field5217 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (class143.field1815 - var14 - 1 < var18) {
                                var18 = class143.field1815 - var14 - 1;
                            }
                            int var19 = class97.method767(-121, var12.field2190[0], var18, var14, var17, class290.field4357, class254.field3708, var14, 0, var12.field2189[0], 0, var14, -1, true, class420.field6108[var12.field5922]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field2190[var20] = class290.field4357[var19 - var20 - 1];
                                    var12.field2189[var20] = class254.field3708[var19 - var20 - 1];
                                    var12.field2203[var20] = 1;
                                }
                                var12.field2202 = var19;
                            }
                        }
                    }
                    class422.method2658(var12, (byte) -108, true);
                    int var21 = class39.method291(var12, -21792);
                    class357.method2349(class252.field3691, 92, class247.field3475, var21, var12);
                    class140.method978(-1, var12);
                }
            }
        }
        if (class395.field5738 == 0 && class17.field279 == 0) {
            if (class212.field2884 == 2) {
                class321.method2112(-247233885);
            } else {
                class342.method2270((byte) -46);
            }
            if ((class326.field4829 >> 7) < 14 || (class351.field5217 - 14) <= (class326.field4829 >> 7) || class279.field4099 >> 7 < 14 || class143.field1815 - 14 <= class279.field4099 >> 7) {
                class216.method1423(-91);
            }
        }
        while (true) {
            class452 var3;
            class248 var4;
            class248 var5;
            do {
                var3 = (class452) class127.field1656.method1569(24502);
                if (var3 == null) {
                    while (true) {
                        class452 var6;
                        class248 var7;
                        class248 var8;
                        do {
                            var6 = (class452) class57.field856.method1569(24502);
                            if (var6 == null) {
                                while (true) {
                                    class452 var9;
                                    class248 var10;
                                    class248 var11;
                                    do {
                                        var9 = (class452) class406.field5894.method1569(24502);
                                        if (var9 == null) {
                                            if (class171.field2342 != null) {
                                                class27.method225(107);
                                            }
                                            if ((class231.field3179 % 1500) == 0) {
                                                class443.method2762(2);
                                            }
                                            class197.method1308(0);
                                            if (class320.field4757 && class98.method768((byte) 19) - 60000L > class171.field2341) {
                                                class322.method2119((byte) -50);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field6571;
                                        if (var10.field3505 < 0) {
                                            break;
                                        }
                                        var11 = class27.method224(65535, var10.field3584);
                                    } while (var11 == null || var11.field3528 == null || var10.field3505 >= var11.field3528.length || var11.field3528[var10.field3505] != var10);
                                    class293.method1989(var9);
                                }
                            }
                            var7 = var6.field6571;
                            if (var7.field3505 < 0) {
                                break;
                            }
                            var8 = class27.method224(65535, var7.field3584);
                        } while (var8 == null || var8.field3528 == null || var7.field3505 >= var8.field3528.length || var8.field3528[var7.field3505] != var7);
                        class293.method1989(var6);
                    }
                }
                var4 = var3.field6571;
                if (var4.field3505 < 0) {
                    break;
                }
                var5 = class27.method224(65535, var4.field3584);
            } while (var5 == null || var5.field3528 == null || var5.field3528.length <= var4.field3505 || var5.field3528[var4.field3505] != var4);
            class293.method1989(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method410() {
        class4.field68 = 0;
        for (int var0 = 0; var0 < class93.field1274; var0++) {
            class163 var1 = class388.field5670[class62.field943[var0]];
            if (var1.field2140 && var1.method1087((byte) 73) != -1) {
                int var2 = (var1.method1091((byte) -125) - 1) * 64 + 60;
                int var3 = var1.field5921 - var2 >> 7;
                int var4 = var1.field5930 - var2 >> 7;
                class162 var5 = class110.method824(-2045603225, var3, var4, class268.field3973);
                if (var5 != null) {
                    int var6 = var5.field2183;
                    if (var5 instanceof class163) {
                        var6 += 2048;
                    }
                    if (var5.field2107 == 0 && var5.method1087((byte) 73) != -1) {
                        class197.field2725[class4.field68] = var6;
                        class241.field3378[class4.field68] = var6;
                        class4.field68++;
                        var5.field2107++;
                    }
                    class197.field2725[class4.field68] = var6;
                    class241.field3378[class4.field68] = var1.field2183 + 2048;
                    class4.field68++;
                    var5.field2107++;
                }
            }
        }
        class242.method1565(class197.field2725, 0, class4.field68 - 1, class241.field3378, 97);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method411(byte arg0) {
        field845++;
        if (class381.field5579 == 1000) {
            return;
        }
        long var2 = class118.method858(57) / 1000000L - class290.field4370;
        class290.field4370 = class118.method858(22) / 1000000L;
        if (arg0 <= 43) {
            field846 = 104;
        }
        boolean var4 = class370.method2435(true);
        if (var4 && class60.field919 && class78.field1088 != null) {
            class78.field1088.method2541((byte) 116);
        }
        if (class381.field5579 == 30 || class381.field5579 == 10) {
            if (class252.field3692 != 0L && class98.method768((byte) 42) > class252.field3692) {
                class246.method1611(-43, false, class340.method2203((byte) 76), class197.field2724, class289.field4338);
            } else if (class126.field1647.method521() && class97.field1314) {
                class66.method568(100);
            }
        }
        if (class211.field2872 == null) {
            Container var5;
            if (class428.field6222 == null) {
                var5 = class63.field948.field5381;
            } else {
                var5 = class428.field6222;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class428.field6222 == var5) {
                Insets var8 = class428.field6222.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class159.field2075 != var6 || class331.field4882 != var7) {
                if (class126.field1647 == null || class126.field1647.method517()) {
                    class208.method1365(false);
                } else {
                    class159.field2075 = var6;
                    class331.field4882 = var7;
                }
                class252.field3692 = class98.method768((byte) 92) + 500L;
            }
        }
        if (class211.field2872 != null && !class104.field1363 && (class381.field5579 == 30 || class381.field5579 == 10)) {
            class246.method1611(-43, false, class195.field2700, -1, -1);
        }
        boolean var9 = false;
        if (class381.field5586) {
            class381.field5586 = false;
            var9 = true;
        }
        if (var9) {
            class20.method162(1016);
        }
        if (class126.field1647 != null && class126.field1647.method485() || class340.method2203((byte) 114) != 1) {
            class274.method1812(-1695);
        }
        if (class381.field5579 == 0) {
            class354.method2332(class257.field3773[class410.field5953], 304, class428.field6221, class117.field1518[class410.field5953], class443.field6401[class410.field5953], class428.field6226, var9);
        } else if (class381.field5579 == 5) {
            class303.method2033(class117.field1518[class410.field5953].getRGB(), class443.field6401[class410.field5953].getRGB(), class257.field3773[class410.field5953].getRGB(), class199.field2756, class126.field1647.method485() | var9, 32, class126.field1647);
        } else if (class381.field5579 == 10) {
            class77.method617((byte) 77);
        } else if (class381.field5579 == 25 || class381.field5579 == 28) {
            if (class265.field3924 == 1) {
                if (class438.field6355 > class129.field1684) {
                    class129.field1684 = class438.field6355;
                }
                int var11 = (class129.field1684 - class438.field6355) * 50 / class129.field1684;
                class447.method2773(class165.field2240 + "<br>(" + var11 + "%)", true, (byte) -41, class41.field630);
            } else if (class265.field3924 == 2) {
                if (class21.field385 < class238.field3326) {
                    class21.field385 = class238.field3326;
                }
                int var10 = (class21.field385 - class238.field3326) * 50 / class21.field385 + 50;
                class447.method2773(class165.field2240 + "<br>(" + var10 + "%)", true, (byte) -41, class41.field630);
            } else {
                class447.method2773(class165.field2240, true, (byte) -41, class41.field630);
            }
        } else if (class381.field5579 == 30) {
            class133.method951(-1, var2);
        } else if (class381.field5579 == 40) {
            class447.method2773(class421.field6114 + "<br>" + class25.field445, true, (byte) -41, class41.field630);
        }
        if (class7.field105 == 3) {
            for (int var12 = 0; var12 < class400.field5854; var12++) {
                Rectangle var13 = class418.field6092[var12];
                if (class297.field4482[var12]) {
                    class126.field1647.method2023(var13.height, var13.x, var13.y, -11682, var13.width, -1996553985);
                } else if (class101.field1335[var12]) {
                    class126.field1647.method2023(var13.height, var13.x, var13.y, -11682, var13.width, -1996554240);
                }
            }
        }
        if (class62.method548(true)) {
            class348.method2302(class126.field1647, 18304);
        }
        if ((class381.field5579 == 30 || class381.field5579 == 10) && class7.field105 == 0 && class340.method2203((byte) 124) == 1 && !var9 && class364.field5376.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class400.field5854; var15++) {
                if (class101.field1335[var15]) {
                    class101.field1335[var15] = false;
                    class228.field3131[var14++] = class418.field6092[var15];
                }
            }
            class126.field1647.method431(class228.field3131, var14);
        } else if (class381.field5579 != 0) {
            class126.field1647.method471();
            for (int var16 = 0; var16 < class400.field5854; var16++) {
                class101.field1335[var16] = false;
            }
        }
        if (class85.field1171) {
            class175.method1163((byte) -36);
        }
        if (class257.field3777 && class381.field5579 == 10 && class233.field3246 != -1) {
            class257.field3777 = false;
            class212.method1398(-29, class63.field948);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method412(byte[] arg0, int arg1) {
        field843++;
        if (arg1 != 32) {
            return;
        }
        class341 var3 = new class341(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method2233((byte) 104);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class210.field2848 = new int[6];
                    var5[0] = var3.method2239(class294.method1993(arg1, -1076227928));
                    var5[1] = var3.method2239(-1076227960);
                    var5[2] = var3.method2239(-1076227960);
                    var5[3] = var3.method2239(-1076227960);
                    var5[4] = var3.method2239(-1076227960);
                    var5[5] = var3.method2239(-1076227960);
                } else if (var4 == 4) {
                    int var6 = var3.method2233((byte) 104);
                    class95.field1299 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class95.field1299[var7] = var3.method2239(-1076227960);
                        if (class95.field1299[var7] == 65535) {
                            class95.field1299[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method413() {
        int var0 = class289.field4335 ? class402.field5869 : class93.field1274 + class402.field5869;
        for (int var1 = -1; var1 < var0; var1++) {
            class162 var2;
            if (var1 < 0) {
                var2 = class383.field5609;
            } else if (var1 < class402.field5869) {
                var2 = class176.field2382[class117.field1528[var1]];
            } else {
                var2 = class388.field5670[class62.field943[var1 - class402.field5869]];
            }
            if (var2.field2119 >= 0) {
                int var3 = var2.method1091((byte) 102);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field5921 & 0x7F) == 0 && (var2.field5930 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field5921 & 0x7F) == 64 && (var2.field5930 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class317 && var2.field2204 != null && class231.field3179 >= var2.field2193 && class231.field3179 < var2.field2195) {
                    ((class317) var2).field4638 = false;
                }
                var2.field5932 = class248.method1621(var2.field5921, var2.field5930, -13853, class268.field3973);
                class197.method1306(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method414(int arg0) {
        field841++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class208.method1365(false);
        class197.field2723 = new class243(class63.field948);
        class305.field4565 = new class50();
        if (class173.field2353 != 0) {
            class318.field4677 = new byte[50][];
        }
        class228.method1481(class63.field948, -36);
        if (class72.field1026 == 0) {
            class322.field4800 = this.getCodeBase().getHost();
            class341.field5058 = 43594;
            class208.field2832 = 443;
        } else if (class72.field1026 == 1) {
            class322.field4800 = this.getCodeBase().getHost();
            class341.field5058 = class386.field5644 + 40000;
            class208.field2832 = class386.field5644 + 50000;
        } else if (class72.field1026 == 2) {
            class341.field5058 = class386.field5644 + 40000;
            class322.field4800 = "127.0.0.1";
            class208.field2832 = class386.field5644 + 50000;
        }
        field842 = class341.field5058;
        class112.field1451 = class341.field5058;
        class129.field1693 = class208.field2832;
        class415.field6005 = class322.field4800;
        if (class396.field5783 == 1) {
            class123.field1592 = 0;
            class71.field1015 = class85.field1179;
            class238.field3341 = 16777215;
            class452.field6566 = class104.field1361;
            class444.field6408 = class369.field5450;
            class230.field3155 = class40.field605;
            class396.field5779 = true;
        } else {
            class71.field1015 = class240.field3367;
            class444.field6408 = class45.field678;
            class230.field3155 = class387.field5667;
            class452.field6566 = class58.field870;
        }
        if (class364.field5387 == 3) {
            class13.field209 = class386.field5644;
        }
        class64.field964 = class112.field1451;
        class388.field5681 = class427.field6215 = class333.field4896 = class237.field3313 = new short[256];
        class62.method549(25871);
        class27.method226(class422.field6138, (byte) 111);
        class223.method1457(class422.field6138, 3);
        class303.field4554 = class223.method1458(arg0);
        if (class303.field4554 != null) {
            class303.field4554.method588((byte) -76, class422.field6138);
        }
        class107.field1414 = class364.field5387;
        try {
            if (class63.field948.field5374 != null) {
                class62.field939 = new class368(class63.field948.field5374, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class212.field2903[var3] = new class368(class63.field948.field5382[var3], 6000, 0);
                }
                class136.field1766 = new class368(class63.field948.field5380, 6000, 0);
                class423.field6168 = new class330(255, class62.field939, class136.field1766, 500000);
                class136.field1767 = new class368(class63.field948.field5389, 24, 0);
                class63.field948.field5382 = null;
                class63.field948.field5374 = null;
                class63.field948.field5380 = null;
                class63.field948.field5389 = null;
            }
        } catch (IOException var4) {
            class62.field939 = null;
            class136.field1766 = null;
            class136.field1767 = null;
            class423.field6168 = null;
        }
        if (class396.field5783 == 0) {
            class346.field5159 = class271.field3993;
        } else if (class396.field5783 == 1) {
            class346.field5159 = class398.field5835;
        }
        if (class72.field1026 != 0) {
            class169.field2287 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIII)V")
    public static final void method415(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field839++;
        int var6 = (arg4 - 32) * arg4 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        class193.field2687[0].method2070(arg0, arg2);
        int var7 = (arg4 - var6 - 32) * arg3 / (arg5 - arg4);
        class193.field2687[1].method2070(arg0, arg4 + arg2 - 16);
        class126.field1647.method2023(arg4 - 32, arg0, arg2 + 16, -11682, 16, class403.field5876);
        if (arg1 != 84) {
            method400(20);
        }
        class126.field1647.method2023(var6, arg0, arg2 + var7 + 16, -11682, 16, class271.field3992);
        class126.field1647.method2017(var6, (byte) -3, class125.field1619, arg0, arg2 + var7 + 16);
        class126.field1647.method2017(var6, (byte) -3, class125.field1619, arg0 + 1, arg2 - -16 - -var7);
        class126.field1647.method2016(class125.field1619, arg0, 16, arg1 ^ 0x39, arg2 + var7 + 16);
        class126.field1647.method2016(class125.field1619, arg0, 16, 97, arg2 + var7 + 17);
        class126.field1647.method2017(var6, (byte) -3, class369.field5458, arg0 + 15, arg2 + 16 - -var7);
        class126.field1647.method2017(var6 - 1, (byte) -3, class369.field5458, arg0 + 14, var7 + 17 + arg2);
        class126.field1647.method2016(class369.field5458, arg0, 16, arg1 + 2, arg2 + 15 + var6 - -var7);
        class126.field1647.method2016(class369.field5458, arg0 + 1, 15, 78, var6 + var7 + arg2 + 14);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method416() {
        int var0 = class289.field4335 ? class402.field5869 : class93.field1274 + class402.field5869;
        for (int var1 = -1; var1 < var0; var1++) {
            class162 var2;
            if (var1 < 0) {
                var2 = class383.field5609;
            } else if (var1 < class402.field5869) {
                var2 = class176.field2382[class117.field1528[var1]];
            } else {
                var2 = class388.field5670[class62.field943[var1 - class402.field5869]];
            }
            var2.field2107 = 0;
            if (var2.field2119 < 0) {
                var2.field2140 = false;
            } else {
                int var3 = var2.method1091((byte) 52);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field5921 & 0x7F) != 0 || (var2.field5930 & 0x7F) != 0) {
                        var2.field2140 = false;
                        continue;
                    }
                } else if ((var2.field5921 & 0x7F) != 64 || (var2.field5930 & 0x7F) != 64) {
                    var2.field2140 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field5921 >> 7;
                    int var5 = var2.field5930 >> 7;
                    if (class386.field5640[var4][var5] != var2.field2119) {
                        var2.field2140 = true;
                        continue;
                    }
                    if (class338.field4989[var4][var5] > 1) {
                        var10002 = class338.field4989[var4][var5]--;
                        var2.field2140 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field5921 - var6 >> 7;
                    int var8 = var2.field5930 - var6 >> 7;
                    int var9 = var2.field5921 + var6 >> 7;
                    int var10 = var2.field5930 + var6 >> 7;
                    if (!class125.method885(var2.field2119, (byte) -109, var8, var9, var10, var7)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class386.field5640[var11][var12] == var2.field2119) {
                                    var10002 = class338.field4989[var11][var12]--;
                                }
                            }
                        }
                        var2.field2140 = true;
                        continue;
                    }
                }
                if (var2 instanceof class317 && var2.field2204 != null && class231.field3179 >= var2.field2193 && class231.field3179 < var2.field2195) {
                    ((class317) var2).field4638 = false;
                }
                var2.field2140 = false;
                var2.field5932 = class248.method1621(var2.field5921, var2.field5930, -13853, class268.field3973);
                class197.method1306(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method417() {
        boolean var0 = class116.field1508 == 1 && class402.field5869 > 200 || class116.field1508 == 0 && class402.field5869 > 50;
        for (int var1 = 0; var1 < class402.field5869; var1++) {
            class317 var10 = class176.field2382[class117.field1528[var1]];
            if (var10.method2077(8129)) {
                var10.method636((byte) -119);
                if (var10.field5917 >= 0 && var10.field5918 >= 0 && var10.field5924 < class351.field5217 && var10.field5920 < class143.field1815) {
                    var10.field4638 = var10.field2178 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field2140) {
                        var11++;
                    }
                    if (var10.field2174 > class231.field3179) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1091((byte) 65) << 2);
                    if (class256.field3741 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field2119 = var12 + 1;
                } else {
                    var10.field2119 = -1;
                }
            } else {
                var10.field2119 = -1;
            }
        }
        for (int var2 = 0; var2 < class93.field1274; var2++) {
            class163 var7 = class388.field5670[class62.field943[var2]];
            if (var7.method1100(8129) && var7.field2206.method1262(false)) {
                var7.method636((byte) -84);
                if (var7.field5917 >= 0 && var7.field5918 >= 0 && var7.field5924 < class351.field5217 && var7.field5920 < class143.field1815) {
                    int var8 = 0;
                    if (!var7.field2140) {
                        var8++;
                    }
                    if (var7.field2174 > class231.field3179) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method1091((byte) 116) << 2);
                    if (class256.field3741 == 0) {
                        if (var7.field2206.field2599) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class256.field3741 == 1) {
                        if (var7.field2206.field2599) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field2206.field2628) {
                        var9 += 512;
                    } else if (!var7.field2206.field2616) {
                        var9 += 256;
                    }
                    var7.field2119 = var9 + 1;
                } else {
                    var7.field2119 = -1;
                }
            } else {
                var7.field2119 = -1;
            }
        }
        for (int var3 = 0; var3 < class349.field5195.length; var3++) {
            class198 var4 = class349.field5195[var3];
            if (var4 != null) {
                if (var4.field2741 == 1) {
                    class163 var5 = class388.field5670[var4.field2729];
                    if (var5 != null && var5.field2119 >= 0) {
                        var5.field2119 += 1024;
                    }
                } else if (var4.field2741 == 10) {
                    class317 var6 = class176.field2382[var4.field2729];
                    if (var6 != null && var6.field2119 >= 0) {
                        var6.field2119 += 1024;
                    }
                }
            }
        }
        class383.field5609.field2119 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lsj;IIIIIII)V")
    public static final void method418(class248[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class248 var9 = arg0[var8];
            if (var9 != null && var9.field3584 == arg1) {
                int var10 = var9.field3503 + arg6;
                int var11 = var9.field3507 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3555 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3531 + var10;
                    int var17 = var9.field3564 + var11;
                    if (var9.field3555 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (!var9.field3537 || var9.field3555 == 0 || var9.field3536 || method402(var9).field3108 != 0 || class268.field3967 == var9 || var9.field3624 == 1338) {
                    if (!var9.field3537 || !method401(var9)) {
                        if (class171.field2342 == var9) {
                            class96.field1304 = true;
                            class383.field5610 = var10;
                            class361.field5350 = var11;
                        }
                        if (!var9.field3537 || var9.field3616 || var12 < var14 && var13 < var15) {
                            if (var9.field3555 == 0) {
                                if (!var9.field3537 && method401(var9) && class273.field4009 != var9) {
                                    continue;
                                }
                                if (var9.field3617 && class277.field4060 >= var12 && class217.field3032 >= var13 && class277.field4060 < var14 && class217.field3032 < var15) {
                                    for (class452 var18 = (class452) class406.field5894.method1575(0); var18 != null; var18 = (class452) class406.field5894.method1573((byte) -128)) {
                                        if (var18.field6564) {
                                            var18.method2632(true);
                                            var18.field6571.field3628 = false;
                                        }
                                    }
                                    if (class38.field570 == 0) {
                                        class171.field2342 = null;
                                        class268.field3967 = null;
                                    }
                                    class192.field2680 = 0;
                                    class384.field5616 = false;
                                    class389.field5688 = false;
                                    if (!class165.field2244) {
                                        class106.method806((byte) -18);
                                    }
                                }
                            }
                            boolean var19;
                            if (class277.field4060 >= var12 && class217.field3032 >= var13 && class277.field4060 < var14 && class217.field3032 < var15) {
                                var19 = true;
                            } else {
                                var19 = false;
                            }
                            if (!class165.field2244 && var19) {
                                class378.method2467(121, var9, class277.field4060 - var10, class217.field3032 - var11);
                            }
                            if (var9.field3537) {
                                boolean var20 = false;
                                if (class21.field388 == 1 && var19) {
                                    var20 = true;
                                }
                                boolean var21 = false;
                                if (class219.field3054 == 1 && class278.field4085 >= var12 && class402.field5871 >= var13 && class278.field4085 < var14 && class402.field5871 < var15) {
                                    var21 = true;
                                }
                                if (var9.field3496 != null) {
                                    for (int var22 = 0; var22 < var9.field3496.length; var22++) {
                                        if (class277.field4063[var9.field3496[var22]]) {
                                            if (var9.field3547 == null || class231.field3179 >= var9.field3547[var22]) {
                                                byte var23 = var9.field3543[var22];
                                                if (var23 == 0 || ((var23 & 0x8) == 0 || !class277.field4063[86] && !class277.field4063[82] && !class277.field4063[81]) && ((var23 & 0x2) == 0 || class277.field4063[86]) && ((var23 & 0x1) == 0 || class277.field4063[82]) && ((var23 & 0x4) == 0 || class277.field4063[81])) {
                                                    class305.method2038(-1, var9.field3636, (byte) 93, "", var22 + 1);
                                                    int var24 = var9.field3646[var22];
                                                    if (var9.field3547 == null) {
                                                        var9.field3547 = new int[var9.field3496.length];
                                                    }
                                                    if (var24 == 0) {
                                                        var9.field3547[var22] = Integer.MAX_VALUE;
                                                    } else {
                                                        var9.field3547[var22] = class231.field3179 + var24;
                                                    }
                                                }
                                            }
                                        } else if (var9.field3547 != null) {
                                            var9.field3547[var22] = 0;
                                        }
                                    }
                                }
                                if (var21) {
                                    class429.method2676((byte) -127, var9, class278.field4085 - var10, class402.field5871 - var11);
                                }
                                if (class171.field2342 != null && class171.field2342 != var9 && var19 && method402(var9).method1465((byte) 113)) {
                                    class160.field2089 = var9;
                                }
                                if (class268.field3967 == var9) {
                                    class77.field1057 = true;
                                    class377.field5521 = var10;
                                    class164.field2235 = var11;
                                }
                                if (var9.field3536 || var9.field3624 != 0) {
                                    if (var19 && class240.field3366 != 0 && var9.field3653 != null) {
                                        class452 var25 = new class452();
                                        var25.field6564 = true;
                                        var25.field6571 = var9;
                                        var25.field6565 = class240.field3366;
                                        var25.field6570 = var9.field3653;
                                        class406.field5894.method1560(-121, var25);
                                    }
                                    if (class171.field2342 != null || class346.field5156 != null || class165.field2244 || var9.field3624 != 1400 && class192.field2680 > 0) {
                                        var21 = false;
                                        var20 = false;
                                        var19 = false;
                                    }
                                    if (var9.field3624 != 0) {
                                        if (var9.field3624 == 1337 || var9.field3624 == 1403) {
                                            class427.field6213 = var9;
                                            if (class193.field2683 != null) {
                                                class193.field2683.method839(var9.field3564, true, class126.field1647);
                                            }
                                            if (var9.field3624 == 1337) {
                                                if (!class165.field2244 && var19) {
                                                    class14.method106(class126.field1647, (byte) -114);
                                                    for (class438 var26 = (class438) class197.field2718.method54((byte) 18); var26 != null; var26 = (class438) class197.field2718.method53((byte) 126)) {
                                                        if (class277.field4060 >= var26.field6362 && class277.field4060 < var26.field6363 && class217.field3032 >= var26.field6359 && class217.field3032 < var26.field6356) {
                                                            class106.method806((byte) -18);
                                                            class337.method2192(var26.field6354, 37);
                                                        }
                                                    }
                                                }
                                                class97.method766(113, var9, var11, var10);
                                                continue;
                                            }
                                        }
                                        if (var9.field3624 == 1338) {
                                            if (var9.method1620(0, class126.field1647) == null || class163.field2223 != 0 && class163.field2223 != 3 || class165.field2244 || !var19) {
                                                continue;
                                            }
                                            int var27 = class277.field4060 - var10;
                                            int var28 = class217.field3032 - var11;
                                            int var29 = var9.field3619[var28];
                                            if (var27 < var29 || var27 > var9.field3513[var28] + var29) {
                                                continue;
                                            }
                                            int var30 = var27 - var9.field3531 / 2;
                                            int var31 = var28 - var9.field3564 / 2;
                                            int var32;
                                            if (class212.field2884 == 4) {
                                                var32 = (int) class247.field3479 & 0x3FFF;
                                            } else {
                                                var32 = (int) class247.field3479 + class93.field1268 & 0x3FFF;
                                            }
                                            int var33 = class240.field3364[var32];
                                            int var34 = class240.field3365[var32];
                                            if (class212.field2884 != 4) {
                                                var33 = (class30.field484 + 256) * var33 >> 8;
                                                var34 = (class30.field484 + 256) * var34 >> 8;
                                            }
                                            int var35 = var30 * var34 + var31 * var33 >> 15;
                                            int var36 = var31 * var34 - var30 * var33 >> 15;
                                            int var37;
                                            int var38;
                                            if (class212.field2884 == 4) {
                                                var37 = (class334.field4904 >> 7) + (var35 >> 2);
                                                var38 = (class7.field96 >> 7) - (var36 >> 2);
                                            } else {
                                                int var39 = (class383.field5609.method1091((byte) 18) - 1) * 64;
                                                var37 = (class383.field5609.field5921 - var39 >> 7) + (var35 >> 2);
                                                var38 = (class383.field5609.field5930 - var39 >> 7) - (var36 >> 2);
                                            }
                                            if (class263.field3862 && (class45.field682 & 0x40) != 0) {
                                                class248 var40 = class416.method2626(211655864, class274.field4024, class112.field1450);
                                                if (var40 == null) {
                                                    class303.method2036((byte) -22);
                                                } else {
                                                    class24.method213(var38, class298.field4505, " ->", class388.field5685, (byte) 122, 1L, var37, 9);
                                                }
                                                continue;
                                            }
                                            if (class396.field5783 == 1) {
                                                class24.method213(var38, class109.field1423, "", -1, (byte) 110, 1L, var37, 14);
                                            }
                                            class24.method213(var38, class170.field2335, "", -1, (byte) 97, 1L, var37, 25);
                                            continue;
                                        }
                                        if (var9.field3624 == 1400) {
                                            class123.field1585 = var9;
                                            if (var19) {
                                                class384.field5616 = true;
                                            }
                                            if (var21) {
                                                int var41 = (int) ((double) (class278.field4085 - var10 - var9.field3531 / 2) * 2.0D / (double) class200.field2765);
                                                int var42 = (int) (-((double) (class402.field5871 - var11 - var9.field3564 / 2) * 2.0D / (double) class200.field2765));
                                                int var43 = class297.field4487 + var41 + class200.field2782;
                                                int var44 = class85.field1184 + var42 + class200.field2789;
                                                class379 var45 = class123.method880(22137);
                                                if (var45 == null) {
                                                    continue;
                                                }
                                                int[] var46 = new int[3];
                                                var45.method2469(var43, var44, (byte) -99, var46);
                                                if (var46 != null) {
                                                    if (class277.field4063[82] && class7.field93 > 0) {
                                                        class30.method241(38, var46[2], var46[0], var46[1]);
                                                        continue;
                                                    }
                                                    class389.field5688 = true;
                                                    class53.field818 = var46[0];
                                                    class295.field4453 = var46[1];
                                                    class352.field5218 = var46[2];
                                                }
                                                class192.field2680 = 1;
                                                class231.field3178 = false;
                                                class355.field5259 = class277.field4060;
                                                class316.field4634 = class217.field3032;
                                                continue;
                                            }
                                            if (var20 && class192.field2680 > 0) {
                                                if (class192.field2680 == 1 && (class355.field5259 != class277.field4060 || class316.field4634 != class217.field3032)) {
                                                    class190.field2645 = class297.field4487;
                                                    class86.field1187 = class85.field1184;
                                                    class192.field2680 = 2;
                                                }
                                                if (class192.field2680 == 2) {
                                                    class231.field3178 = true;
                                                    class328.method2152((byte) -38, (int) ((double) (class355.field5259 - class277.field4060) * 2.0D / (double) class200.field2769) + class190.field2645);
                                                    class62.method550(class86.field1187 - (int) ((double) (class316.field4634 - class217.field3032) * 2.0D / (double) class200.field2769), -1);
                                                }
                                                continue;
                                            }
                                            if (class192.field2680 > 0 && !class231.field3178) {
                                                if ((class301.field4541 == 1 || class204.method1350((byte) -126)) && class402.field5874 > 2) {
                                                    class53.method385(2, -30679);
                                                } else if (class170.method1135(false)) {
                                                    class53.method385(1, -30679);
                                                }
                                            }
                                            class192.field2680 = 0;
                                            continue;
                                        }
                                        if (var9.field3624 == 1401) {
                                            if (var20) {
                                                class189.method1263((byte) 118, class277.field4060 - var10, var9.field3564, class217.field3032 - var11, var9.field3531);
                                            }
                                            continue;
                                        }
                                        if (var9.field3624 == 1402) {
                                            class92.method744(20491, var9);
                                            continue;
                                        }
                                        if (var9.field3624 == 1406) {
                                            class139.method976(var10, (byte) -65, var11, var9);
                                            continue;
                                        }
                                    }
                                    if (!var9.field3590 && var21) {
                                        var9.field3590 = true;
                                        if (var9.field3550 != null) {
                                            class452 var47 = new class452();
                                            var47.field6564 = true;
                                            var47.field6571 = var9;
                                            var47.field6572 = class278.field4085 - var10;
                                            var47.field6565 = class402.field5871 - var11;
                                            var47.field6570 = var9.field3550;
                                            class406.field5894.method1560(-102, var47);
                                        }
                                    }
                                    if (var9.field3590 && var20 && var9.field3572 != null) {
                                        class452 var48 = new class452();
                                        var48.field6564 = true;
                                        var48.field6571 = var9;
                                        var48.field6572 = class277.field4060 - var10;
                                        var48.field6565 = class217.field3032 - var11;
                                        var48.field6570 = var9.field3572;
                                        class406.field5894.method1560(-112, var48);
                                    }
                                    if (var9.field3590 && !var20) {
                                        var9.field3590 = false;
                                        if (var9.field3629 != null) {
                                            class452 var49 = new class452();
                                            var49.field6564 = true;
                                            var49.field6571 = var9;
                                            var49.field6572 = class277.field4060 - var10;
                                            var49.field6565 = class217.field3032 - var11;
                                            var49.field6570 = var9.field3629;
                                            class57.field856.method1560(-119, var49);
                                        }
                                    }
                                    if (var20 && var9.field3626 != null) {
                                        class452 var50 = new class452();
                                        var50.field6564 = true;
                                        var50.field6571 = var9;
                                        var50.field6572 = class277.field4060 - var10;
                                        var50.field6565 = class217.field3032 - var11;
                                        var50.field6570 = var9.field3626;
                                        class406.field5894.method1560(-102, var50);
                                    }
                                    if (!var9.field3628 && var19) {
                                        var9.field3628 = true;
                                        if (var9.field3657 != null) {
                                            class452 var51 = new class452();
                                            var51.field6564 = true;
                                            var51.field6571 = var9;
                                            var51.field6572 = class277.field4060 - var10;
                                            var51.field6565 = class217.field3032 - var11;
                                            var51.field6570 = var9.field3657;
                                            class406.field5894.method1560(-104, var51);
                                        }
                                    }
                                    if (var9.field3628 && var19 && var9.field3671 != null) {
                                        class452 var52 = new class452();
                                        var52.field6564 = true;
                                        var52.field6571 = var9;
                                        var52.field6572 = class277.field4060 - var10;
                                        var52.field6565 = class217.field3032 - var11;
                                        var52.field6570 = var9.field3671;
                                        class406.field5894.method1560(-126, var52);
                                    }
                                    if (var9.field3628 && !var19) {
                                        var9.field3628 = false;
                                        if (var9.field3603 != null) {
                                            class452 var53 = new class452();
                                            var53.field6564 = true;
                                            var53.field6571 = var9;
                                            var53.field6572 = class277.field4060 - var10;
                                            var53.field6565 = class217.field3032 - var11;
                                            var53.field6570 = var9.field3603;
                                            class57.field856.method1560(-128, var53);
                                        }
                                    }
                                    if (var9.field3498 != null) {
                                        class452 var54 = new class452();
                                        var54.field6571 = var9;
                                        var54.field6570 = var9.field3498;
                                        class127.field1656.method1560(-108, var54);
                                    }
                                    if (var9.field3589 != null && class86.field1192 > var9.field3625) {
                                        if (var9.field3583 == null || class86.field1192 - var9.field3625 > 32) {
                                            class452 var59 = new class452();
                                            var59.field6571 = var9;
                                            var59.field6570 = var9.field3589;
                                            class406.field5894.method1560(-112, var59);
                                        } else {
                                            label688: for (int var55 = var9.field3625; var55 < class86.field1192; var55++) {
                                                int var56 = class36.field554[var55 & 0x1F];
                                                for (int var57 = 0; var57 < var9.field3583.length; var57++) {
                                                    if (var9.field3583[var57] == var56) {
                                                        class452 var58 = new class452();
                                                        var58.field6571 = var9;
                                                        var58.field6570 = var9.field3589;
                                                        class406.field5894.method1560(-103, var58);
                                                        break label688;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3625 = class86.field1192;
                                    }
                                    if (var9.field3598 != null && class179.field2398 > var9.field3492) {
                                        if (var9.field3597 == null || class179.field2398 - var9.field3492 > 32) {
                                            class452 var64 = new class452();
                                            var64.field6571 = var9;
                                            var64.field6570 = var9.field3598;
                                            class406.field5894.method1560(-102, var64);
                                        } else {
                                            label668: for (int var60 = var9.field3492; var60 < class179.field2398; var60++) {
                                                int var61 = class254.field3711[var60 & 0x1F];
                                                for (int var62 = 0; var62 < var9.field3597.length; var62++) {
                                                    if (var9.field3597[var62] == var61) {
                                                        class452 var63 = new class452();
                                                        var63.field6571 = var9;
                                                        var63.field6570 = var9.field3598;
                                                        class406.field5894.method1560(-108, var63);
                                                        break label668;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3492 = class179.field2398;
                                    }
                                    if (var9.field3482 != null && class303.field4547 > var9.field3571) {
                                        if (var9.field3493 == null || class303.field4547 - var9.field3571 > 32) {
                                            class452 var69 = new class452();
                                            var69.field6571 = var9;
                                            var69.field6570 = var9.field3482;
                                            class406.field5894.method1560(-99, var69);
                                        } else {
                                            label648: for (int var65 = var9.field3571; var65 < class303.field4547; var65++) {
                                                int var66 = class9.field132[var65 & 0x1F];
                                                for (int var67 = 0; var67 < var9.field3493.length; var67++) {
                                                    if (var9.field3493[var67] == var66) {
                                                        class452 var68 = new class452();
                                                        var68.field6571 = var9;
                                                        var68.field6570 = var9.field3482;
                                                        class406.field5894.method1560(-128, var68);
                                                        break label648;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3571 = class303.field4547;
                                    }
                                    if (var9.field3637 != null && class422.field6137 > var9.field3485) {
                                        if (var9.field3491 == null || class422.field6137 - var9.field3485 > 32) {
                                            class452 var74 = new class452();
                                            var74.field6571 = var9;
                                            var74.field6570 = var9.field3637;
                                            class406.field5894.method1560(-101, var74);
                                        } else {
                                            label628: for (int var70 = var9.field3485; var70 < class422.field6137; var70++) {
                                                int var71 = class8.field108[var70 & 0x1F];
                                                for (int var72 = 0; var72 < var9.field3491.length; var72++) {
                                                    if (var9.field3491[var72] == var71) {
                                                        class452 var73 = new class452();
                                                        var73.field6571 = var9;
                                                        var73.field6570 = var9.field3637;
                                                        class406.field5894.method1560(-112, var73);
                                                        break label628;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3485 = class422.field6137;
                                    }
                                    if (var9.field3562 != null && class57.field861 > var9.field3594) {
                                        if (var9.field3593 == null || class57.field861 - var9.field3594 > 32) {
                                            class452 var79 = new class452();
                                            var79.field6571 = var9;
                                            var79.field6570 = var9.field3562;
                                            class406.field5894.method1560(-107, var79);
                                        } else {
                                            label608: for (int var75 = var9.field3594; var75 < class57.field861; var75++) {
                                                int var76 = class238.field3325[var75 & 0x1F];
                                                for (int var77 = 0; var77 < var9.field3593.length; var77++) {
                                                    if (var9.field3593[var77] == var76) {
                                                        class452 var78 = new class452();
                                                        var78.field6571 = var9;
                                                        var78.field6570 = var9.field3562;
                                                        class406.field5894.method1560(-104, var78);
                                                        break label608;
                                                    }
                                                }
                                            }
                                        }
                                        var9.field3594 = class57.field861;
                                    }
                                    if (class58.field865 > var9.field3670 && var9.field3647 != null) {
                                        class452 var80 = new class452();
                                        var80.field6571 = var9;
                                        var80.field6570 = var9.field3647;
                                        class406.field5894.method1560(-127, var80);
                                    }
                                    if (class365.field5399 > var9.field3670 && var9.field3518 != null) {
                                        class452 var81 = new class452();
                                        var81.field6571 = var9;
                                        var81.field6570 = var9.field3518;
                                        class406.field5894.method1560(-106, var81);
                                    }
                                    if (class342.field5118 > var9.field3670 && var9.field3620 != null) {
                                        class452 var82 = new class452();
                                        var82.field6571 = var9;
                                        var82.field6570 = var9.field3620;
                                        class406.field5894.method1560(-115, var82);
                                    }
                                    if (class373.field5503 > var9.field3670 && var9.field3570 != null) {
                                        class452 var83 = new class452();
                                        var83.field6571 = var9;
                                        var83.field6570 = var9.field3570;
                                        class406.field5894.method1560(-114, var83);
                                    }
                                    if (class92.field1265 > var9.field3670 && var9.field3504 != null) {
                                        class452 var84 = new class452();
                                        var84.field6571 = var9;
                                        var84.field6570 = var9.field3504;
                                        class406.field5894.method1560(-104, var84);
                                    }
                                    var9.field3670 = class394.field5732;
                                    if (var9.field3635 != null) {
                                        for (int var85 = 0; var85 < class85.field1183; var85++) {
                                            class452 var86 = new class452();
                                            var86.field6571 = var9;
                                            var86.field6561 = class348.field5181[var85];
                                            var86.field6557 = class309.field4581[var85];
                                            var86.field6570 = var9.field3635;
                                            class406.field5894.method1560(-109, var86);
                                        }
                                    }
                                    if (class176.field2385 && var9.field3554 != null) {
                                        class452 var87 = new class452();
                                        var87.field6571 = var9;
                                        var87.field6570 = var9.field3554;
                                        class406.field5894.method1560(-109, var87);
                                    }
                                }
                                if (var9.field3555 == 5 && var9.field3527 != -1) {
                                    var9.method1633(0).method839(var9.field3564, true, class126.field1647);
                                }
                            }
                            if (!var9.field3537 && class171.field2342 == null && class346.field5156 == null && !class165.field2244) {
                                if ((var9.field3575 >= 0 || var9.field3602 != 0) && class277.field4060 >= var12 && class217.field3032 >= var13 && class277.field4060 < var14 && class217.field3032 < var15) {
                                    if (var9.field3575 >= 0) {
                                        class273.field4009 = arg0[var9.field3575];
                                    } else {
                                        class273.field4009 = var9;
                                    }
                                }
                                if (var9.field3555 == 8 && class277.field4060 >= var12 && class217.field3032 >= var13 && class277.field4060 < var14 && class217.field3032 < var15) {
                                    class242.field3380 = var9;
                                }
                                if (var9.field3568 > var9.field3564) {
                                    class256.method1654(var9.field3531 + var10, var11, class277.field4060, var9, var9.field3564, (byte) 105, class217.field3032, var9.field3568);
                                }
                            }
                            class144.method995(arg4, arg2, var9, arg3, arg5, 0, var10, var11);
                            if (var9.field3555 == 0) {
                                method418(arg0, var9.field3636, var12, var13, var14, var15, var10 - var9.field3559, var11 - var9.field3499);
                                if (var9.field3528 != null) {
                                    method418(var9.field3528, var9.field3636, var12, var13, var14, var15, var10 - var9.field3559, var11 - var9.field3499);
                                }
                                class28 var88 = (class28) class242.field3402.method2826(false, (long) var9.field3636);
                                if (var88 != null) {
                                    if (var88.field483 == 0 && !class165.field2244 && var19 && !class126.field1649) {
                                        class106.method806((byte) -18);
                                    }
                                    class435.method2715(var11, var15, var12, var88.field482, var10, (byte) -126, var14, var13);
                                }
                            }
                        }
                    }
                } else if (var12 < var14 && var13 < var15) {
                    class144.method995(arg4, arg2, var9, arg3, arg5, 0, var10, var11);
                }
            }
        }
    }
}
