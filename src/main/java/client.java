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
public class client extends class215 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[B")
    public static byte[] field3880 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3883 = 1;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
    public static int[] field3881 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1793(int arg0) {
        field3888++;
        if (!class381.field5603) {
            for (int var2 = 0; var2 < class34.field480; var2++) {
                if (class33.field474[var2].method2456((byte) -103) == 's' || class33.field474[var2].method2456((byte) 117) == 'S') {
                    class381.field5603 = true;
                    break;
                }
            }
        }
        if (class136.field1866 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class43.method364(arg0 ^ 0xFFFFBE00);
            if (class160.field2144 == 0L) {
                class160.field2144 = var5;
            }
            if (var4 > 16384 && var5 - class160.field2144 < 5000L) {
                if (var5 - class240.field3567 > 1000L) {
                    System.gc();
                    class240.field3567 = var5;
                }
                class381.field5604 = class130.field1729.method2543(false, class153.field2073);
                class381.field5602 = 5;
            } else {
                class381.field5604 = class283.field4167.method2543(false, class153.field2073);
                class136.field1866 = 10;
                class381.field5602 = 5;
            }
        } else if (class136.field1866 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class382.field5610[var7] = class281.method1900(-1, class78.field984, class195.field2745);
            }
            class381.field5604 = class226.field3390.method2543(false, class153.field2073);
            class136.field1866 = 20;
            class381.field5602 = 10;
        } else if (class136.field1866 == 20) {
            if (class217.field3089 == null) {
                class217.field3089 = new class291(class257.field3800, class161.field2152);
            }
            if (class217.field3089.method1948(arg0 - 248)) {
                class416.field6016 = class1.method3(true, 0, 1, (byte) 123, false);
                class216.field3088 = class1.method3(true, 1, 1, (byte) 127, false);
                class373.field5445 = class1.method3(true, 2, 1, (byte) 126, false);
                class354.field5167 = class1.method3(true, 3, 1, (byte) 91, false);
                class288.field4221 = class1.method3(true, 4, 1, (byte) 92, false);
                class243.field3602 = class1.method3(true, 5, 1, (byte) 127, true);
                class454.field6706 = class1.method3(false, 6, 1, (byte) 101, true);
                class52.field659 = class1.method3(true, 7, 1, (byte) 119, false);
                class257.field3813 = class1.method3(true, 8, 1, (byte) 114, false);
                class141.field1922 = class1.method3(true, 9, 1, (byte) 115, false);
                class289.field4233 = class1.method3(true, 10, 1, (byte) 126, false);
                class70.field923 = class1.method3(true, 11, 1, (byte) 111, false);
                class151.field2051 = class1.method3(true, 12, 1, (byte) 104, false);
                class385.field5628 = class1.method3(true, 13, 1, (byte) 99, false);
                class336.field4967 = class1.method3(false, 14, 1, (byte) 94, false);
                class308.field4552 = class1.method3(true, 15, 1, (byte) 114, false);
                class411.field5900 = class1.method3(true, 16, 1, (byte) 101, false);
                class226.field3381 = class1.method3(true, 17, 1, (byte) 94, false);
                class377.field5520 = class1.method3(true, 18, 1, (byte) 95, false);
                class383.field5618 = class1.method3(true, 19, 1, (byte) 114, false);
                class271.field4018 = class1.method3(true, 20, 1, (byte) 118, false);
                class213.field3008 = class1.method3(true, 21, 1, (byte) 123, false);
                class165.field2176 = class1.method3(true, 22, 1, (byte) 95, false);
                class82.field1013 = class1.method3(true, 23, 1, (byte) 103, true);
                class129.field1721 = class1.method3(true, 24, 1, (byte) 91, false);
                class199.field2810 = class1.method3(true, 25, 1, (byte) 101, false);
                class441.field6422 = class1.method3(true, 26, 1, (byte) 100, true);
                class195.field2753 = class1.method3(true, 27, 1, (byte) 114, false);
                class430.field6263 = class1.method3(true, 28, 1, (byte) 111, true);
                class381.field5604 = class109.field1483.method2543(false, class153.field2073);
                class381.field5602 = 15;
                class136.field1866 = 30;
            } else {
                class381.field5604 = class440.field6410.method2543(false, class153.field2073);
                class381.field5602 = 12;
            }
        } else if (class136.field1866 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class298.field4344[var9].method2008(0) * class204.field2869[var9] / 100;
            }
            if (var8 == 100) {
                class381.field5604 = class259.field3836.method2543(false, class153.field2073);
                class381.field5602 = 20;
                class249.method1654(class257.field3813, 2);
                class252.method1666(arg0 - 137, class257.field3813);
                class136.field1866 = 40;
            } else {
                if (var8 != 0) {
                    class381.field5604 = class88.field1092.method2543(false, class153.field2073) + var8 + "%";
                }
                class381.field5602 = 20;
            }
        } else if (class136.field1866 == 40) {
            if (class430.field6263.method718(false)) {
                this.method1798((byte) 0, class430.field6263.method733(0, 1));
                class381.field5604 = class252.field3709.method2543(false, class153.field2073);
                class136.field1866 = 50;
                class381.field5602 = 25;
            } else {
                class381.field5604 = class34.field489.method2543(false, class153.field2073) + class430.field6263.method730((byte) -68) + "%";
                class381.field5602 = 25;
            }
        } else if (class136.field1866 == 50) {
            class46.method380(2, (byte) 121, 22050, class134.field1847);
            class447.field6539 = new class450();
            class447.field6539.method2783(128, 9, false);
            class423.field6115 = class44.method366(22050, class267.field3963, 0, (byte) -124, class270.field4004);
            class423.field6115.method744(class447.field6539, 127);
            class91.method614((byte) -45, class447.field6539, class308.field4552, class336.field4967, class288.field4221);
            class182.field2565 = class44.method366(2048, class267.field3963, 1, (byte) 48, class270.field4004);
            class452.field6671 = new class27();
            class182.field2565.method744(class452.field6671, 127);
            class189.field2637 = new class385(22050, class298.field4331);
            class281.field4119 = class454.field6706.method707(arg0 - 141, "scape main");
            class381.field5604 = class387.field5660.method2543(false, class153.field2073);
            class381.field5602 = 30;
            class136.field1866 = 60;
        } else if (class136.field1866 == 60) {
            int var10 = class113.method796(1, class385.field5628, class257.field3813);
            int var11 = class223.method1524(-103);
            if (var11 > var10) {
                class381.field5604 = class395.field5744.method2543(false, class153.field2073) + var10 * 100 / var11 + "%";
                class381.field5602 = 35;
            } else {
                class381.field5604 = class387.field5655.method2543(false, class153.field2073);
                class136.field1866 = 70;
                class381.field5602 = 35;
            }
        } else if (class136.field1866 == 70) {
            int var12 = class337.method2183(class257.field3813, -126);
            int var13 = class153.method1047((byte) -119);
            if (var13 > var12) {
                class381.field5604 = class153.field2065.method2543(false, class153.field2073) + var12 * 100 / var13 + "%";
                class381.field5602 = 40;
            } else {
                class381.field5604 = class430.field6266.method2543(false, class153.field2073);
                class381.field5602 = 40;
                class136.field1866 = 80;
            }
        } else if (class136.field1866 == 80) {
            if (class441.field6422.method718(false)) {
                class259.field3819 = new class62(class441.field6422, class141.field1922, class257.field3813);
                class381.field5604 = class72.field935.method2543(false, class153.field2073);
                class136.field1866 = 90;
                class381.field5602 = 45;
            } else {
                class381.field5604 = class279.field4113.method2543(false, class153.field2073) + class441.field6422.method730((byte) -82) + "%";
                class381.field5602 = 45;
            }
        } else if (class136.field1866 == 90) {
            class381.field5604 = class145.field1966.method2543(false, class153.field2073);
            class381.field5602 = 50;
            class136.field1866 = 95;
        } else if (class136.field1866 == 95) {
            if (class381.field5603) {
                class275.field4077 = 0;
                class223.field3361 = 1;
                class376.field5491 = 0;
                class322.field4739 = 0;
                class79.field993 = 0;
            }
            class381.field5603 = true;
            class53.method414(class267.field3963, true);
            class209.method1439(false, class322.field4739, (byte) -11);
            class381.field5604 = class401.field5794.method2543(false, class153.field2073);
            class136.field1866 = 100;
            class381.field5602 = 55;
        } else if (class136.field1866 == 100) {
            class85.method575(class74.field942, 0, class385.field5628, class257.field3813);
            class381.field5604 = class433.field6309.method2543(false, class153.field2073);
            class381.field5602 = 60;
            method1796(5, arg0 - 34);
            class136.field1866 = 110;
        } else if (class136.field1866 == 110) {
            byte var14 = 0;
            class373.field5445.method718(false);
            int var15 = var14 + class373.field5445.method730((byte) -89);
            class411.field5900.method718(false);
            int var16 = var15 + class411.field5900.method730((byte) -113);
            class226.field3381.method718(false);
            int var17 = var16 + class226.field3381.method730((byte) -58);
            class377.field5520.method718(false);
            int var18 = var17 + class377.field5520.method730((byte) -78);
            class383.field5618.method718(false);
            int var19 = var18 + class383.field5618.method730((byte) -79);
            class271.field4018.method718(false);
            int var20 = var19 + class271.field4018.method730((byte) -109);
            class213.field3008.method718(false);
            int var21 = var20 + class213.field3008.method730((byte) -102);
            class165.field2176.method718(false);
            int var22 = var21 + class165.field2176.method730((byte) -119);
            class129.field1721.method718(false);
            int var23 = var22 + class129.field1721.method730((byte) -99);
            class199.field2810.method718(false);
            int var24 = var23 + class199.field2810.method730((byte) -120);
            class195.field2753.method718(false);
            int var25 = var24 + class195.field2753.method730((byte) -78);
            if (var25 < 1100) {
                class381.field5604 = class283.field4164.method2543(false, class153.field2073) + var25 / 11 + "%";
                class381.field5602 = 65;
            } else {
                class227.method1553(class373.field5445, false);
                class84.method561(class373.field5445, (byte) 81);
                class363.method2303(class373.field5445, (byte) -43);
                class110.method782(class373.field5445, class52.field659, arg0 ^ 0x8C);
                class202.method1392(class52.field659, class411.field5900, 29144, true, class153.field2073);
                class105.method746((byte) 94, class52.field659, true, class153.field2073, class377.field5520);
                class157.field2119 = new class11(class408.field5869, class153.field2073, true, class383.field5618, class52.field659);
                class375.method2375(-3394, class373.field5445);
                class323.method2121(class416.field6016, class271.field4018, class216.field3088, 1);
                class456.method2825(class373.field5445, arg0 ^ 0xFFFFFF15);
                class408.method2537(class213.field3008, false, class52.field659);
                class320.method2108((byte) -99, class165.field2176);
                class420.method2597(false, class373.field5445);
                class365.method2321(class257.field3813, class354.field5167, class52.field659, 0, class385.field5628);
                class51.method397(class373.field5445, false);
                class28.method289((byte) 106, class226.field3381);
                class67.method505(class199.field2810, class129.field1721, new class466(), (byte) 108);
                class456.method2826(class129.field1721, class199.field2810, (byte) 98);
                class35.method326(-2, class373.field5445);
                class372.method2366(class373.field5445, (byte) -39);
                class257.method1770(57, class373.field5445);
                class55.method423(class257.field3813, 100, class373.field5445);
                class130.method876(class373.field5445, class257.field3813, arg0 ^ 0xFFFFFF10);
                class440.method2703(-120, class373.field5445);
                class82.method550(class257.field3813, 66, class373.field5445);
                class7.method53(class373.field5445, (byte) 20);
                class110.method785(class373.field5445, 15);
                class381.field5604 = class202.field2857.method2543(false, class153.field2073);
                class381.field5602 = 65;
                class454.method2809(arg0 ^ 0xFFFFD364);
                class354.method2262((byte) 112);
                class136.field1866 = 120;
            }
        } else if (class136.field1866 == 120) {
            int var26 = class262.method1789(class257.field3813, arg0 - 140);
            int var27 = method1815(-112);
            if (var26 < var27) {
                class381.field5604 = class24.field331.method2543(false, class153.field2073) + var26 * 100 / var27 + "%";
                class381.field5602 = 70;
            } else {
                class204.method1398(class74.field942, (byte) -77, class257.field3813);
                class5.method39(class115.field1559, -5001);
                class381.field5604 = class330.field4902.method2543(false, class153.field2073);
                class381.field5602 = 70;
                class136.field1866 = 130;
            }
        } else if (class136.field1866 == 130) {
            class381.field5604 = class13.field221.method2543(false, class153.field2073);
            class136.field1866 = 140;
            class381.field5602 = 75;
        } else if (class136.field1866 == arg0) {
            if (class289.field4233.method732("huffman", "", (byte) 25)) {
                class437 var28 = new class437(class289.field4233.method738("huffman", "", (byte) -104));
                class217.method1493(var28, true);
                class381.field5604 = class338.field4979.method2543(false, class153.field2073);
                class381.field5602 = 80;
                class136.field1866 = 150;
            } else {
                class381.field5604 = class42.field566.method2543(false, class153.field2073) + "0%";
                class381.field5602 = 80;
            }
        } else if (class136.field1866 == 150) {
            if (!class354.field5167.method718(false)) {
                class381.field5604 = class228.field3431.method2543(false, class153.field2073) + class354.field5167.method730((byte) -81) * 3 / 4 + "%";
                class381.field5602 = 85;
            } else if (!class151.field2051.method718(false)) {
                class381.field5604 = class228.field3431.method2543(false, class153.field2073) + (class151.field2051.method730((byte) -116) / 10 + 75) + "%";
                class381.field5602 = 85;
            } else if (!class385.field5628.method718(false)) {
                class381.field5604 = class228.field3431.method2543(false, class153.field2073) + (class385.field5628.method730((byte) -74) / 20 + 85) + "%";
                class381.field5602 = 85;
            } else if (class82.field1013.method736(7000, "details")) {
                class66.method477(class82.field1013);
                class93.method632(class195.field2753, 2);
                class458.method2835(class52.field659, (byte) 14, class259.field3819);
                class381.field5604 = class346.field5102.method2543(false, class153.field2073);
                class136.field1866 = 160;
                class381.field5602 = 85;
            } else {
                class381.field5604 = class228.field3431.method2543(false, class153.field2073) + (class82.field1013.method739("details", true) / 10 + 90) + "%";
                class381.field5602 = 85;
            }
        } else if (class136.field1866 == 160) {
            int var29 = class466.method2873(-100);
            if (var29 == -1) {
                class381.field5604 = class60.field803.method2543(false, class153.field2073);
                class381.field5602 = 90;
            } else if (var29 == 7 || var29 == 9) {
                this.method1488(true, "worldlistfull");
                method1796(1000, 84);
            } else if (class296.field4310) {
                class381.field5604 = class32.field438.method2543(false, class153.field2073);
                class136.field1866 = 170;
                class381.field5602 = 90;
            } else {
                this.method1488(true, "worldlistio_" + var29);
                method1796(1000, 96);
            }
        } else if (class136.field1866 == 170) {
            class110.field1488 = new String[class180.field2553];
            class447.field6540 = new int[class417.field6023];
            class36.field512 = new boolean[class417.field6023];
            for (int var30 = 0; var30 < class417.field6023; var30++) {
                if (class55.method420(var30, 31849).field6475 == 0) {
                    class36.field512[var30] = true;
                    class317.field4635++;
                }
                class447.field6540[var30] = -1;
            }
            class104.method701((byte) -26);
            class417.field6021 = class354.field5167.method707(-1, "loginscreen");
            class243.field3602.method702(true, 127, false);
            class454.field6706.method702(true, arg0 - 24, true);
            class257.field3813.method702(true, 124, true);
            class385.field5628.method702(true, 117, true);
            class289.field4233.method702(true, 117, true);
            class354.field5167.method702(true, 126, true);
            class373.field5445.field1369 = 2;
            class383.field5620 = true;
            class226.field3381.field1369 = 2;
            class411.field5900.field1369 = 2;
            class377.field5520.field1369 = 2;
            class383.field5618.field1369 = 2;
            class271.field4018.field1369 = 2;
            class213.field3008.field1369 = 2;
            class370.method2358(class223.field3361, -1, -1, false, -4);
            class381.field5604 = class52.field657.method2543(false, class153.field2073);
            class381.field5602 = 95;
            class136.field1866 = 180;
        } else if (class136.field1866 == 180) {
            class227.method1554(true, -126);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1794(boolean arg0) {
        field3882++;
        boolean var2 = class257.field3800.method2673(0);
        if (!arg0) {
            method1809((class223) null);
        }
        if (!var2) {
            this.method1795((byte) 19);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1795(byte arg0) {
        field3889++;
        if (class339.field5002 < class257.field3800.field6363) {
            if (class465.field6851 == class160.field2147) {
                class465.field6851 = class383.field5612;
            } else {
                class465.field6851 = class160.field2147;
            }
            class372.field5439 = (class257.field3800.field6363 * 50 - 50) * 5;
            if (class372.field5439 > 3000) {
                class372.field5439 = 3000;
            }
            if (class257.field3800.field6363 >= 2 && class257.field3800.field6361 == 6) {
                this.method1488(true, "js5connect_outofdate");
                class120.field1610 = 1000;
                return;
            }
            if (class257.field3800.field6363 >= 4 && class257.field3800.field6361 == -1) {
                this.method1488(true, "js5crc");
                class120.field1610 = 1000;
                return;
            }
            if (class257.field3800.field6363 >= 4 && (class120.field1610 == 0 || class120.field1610 == 5)) {
                if (class257.field3800.field6361 == 7 || class257.field3800.field6361 == 9) {
                    this.method1488(true, "js5connect_full");
                } else if (class257.field3800.field6361 <= 0) {
                    this.method1488(true, "js5io");
                } else {
                    this.method1488(true, "js5connect");
                }
                class120.field1610 = 1000;
                return;
            }
        }
        class339.field5002 = class257.field3800.field6363;
        if (class372.field5439 > 0) {
            class372.field5439--;
            return;
        }
        try {
            if (class108.field1468 == 0) {
                class342.field5034 = class267.field3963.method2206(class304.field4445, class465.field6851, true);
                class108.field1468++;
            }
            if (class108.field1468 == 1) {
                if (class342.field5034.field5134 == 2) {
                    this.method1806(1000, -127);
                    return;
                }
                if (class342.field5034.field5134 == 1) {
                    class108.field1468++;
                }
            }
            if (class108.field1468 == 2) {
                class252.field3705 = new class440((Socket) class342.field5034.field5129, class267.field3963);
                class256 var2 = new class256(5);
                var2.method1727(-128, class33.field461.field892);
                var2.method1721(25153, 571);
                class252.field3705.method2694(5, 1, var2.field3764, 0);
                class108.field1468++;
                class253.field3725 = class43.method364(-16756);
            }
            if (class108.field1468 == 3) {
                if (class120.field1610 == 0 || class120.field1610 == 5 || class252.field3705.method2705(-120) > 0) {
                    int var3 = class252.field3705.method2697(-105);
                    if (var3 != 0) {
                        this.method1806(var3, -119);
                        return;
                    }
                    class108.field1468++;
                } else if (class43.method364(arg0 ^ 0xFFFFBE9F) - class253.field3725 > 30000L) {
                    this.method1806(1001, -115);
                    return;
                }
            }
            if (class108.field1468 == 4) {
                boolean var4 = class120.field1610 == 5 || class120.field1610 == 10 || class120.field1610 == 28;
                class257.field3800.method2672(19436, class252.field3705, !var4);
                class108.field1468 = 0;
                class342.field5034 = null;
                class252.field3705 = null;
            }
            if (arg0 != 19) {
                this.method1806(-65, -44);
            }
        } catch (IOException var5) {
            this.method1806(1002, arg0 - 143);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method1796(int arg0, int arg1) {
        field3885++;
        if (class120.field1610 == arg0) {
            return;
        }
        if (class120.field1610 == 0) {
            class69.method507((byte) -117);
        }
        if (arg1 < 57) {
            field3881 = null;
        }
        if (arg0 == 40) {
            class67.method502(0);
        }
        if (arg0 != 40 && class367.field5305 != null) {
            class367.field5305.method2695(0);
            class367.field5305 = null;
        }
        if (class120.field1610 == 25 || class120.field1610 == 28) {
            class373.field5445.field1369 = 2;
            class226.field3381.field1369 = 2;
            class411.field5900.field1369 = 2;
            class377.field5520.field1369 = 2;
            class383.field5618.field1369 = 2;
            class271.field4018.field1369 = 2;
            class213.field3008.field1369 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class325.field4782 = 1;
            class463.field6835 = 0;
            class259.field3817 = 0;
            class266.field3941 = 0;
            class257.field3814 = 1;
            class188.method1285((byte) 118, true);
            class373.field5445.field1369 = 1;
            class226.field3381.field1369 = 1;
            class411.field5900.field1369 = 1;
            class377.field5520.field1369 = 1;
            class383.field5618.field1369 = 1;
            class271.field4018.field1369 = 1;
            class213.field3008.field1369 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class84.method559((byte) -82);
        }
        if (arg0 == 5) {
            class228.method1562(class257.field3813, -4, class74.field942);
        } else {
            class13.method204((byte) -126);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class120.field1610 == 5 || class120.field1610 == 10 || class120.field1610 == 28;
        if (var3 != var2) {
            if (var2) {
                class343.field5048 = class281.field4119;
                if (class450.field6629 == 0) {
                    class88.method593((byte) 96, 2);
                } else {
                    class436.method2686(class281.field4119, 0, 255, 2, false, class454.field6706, (byte) -58);
                }
                class257.field3800.method2677(false, (byte) -117);
            } else {
                class88.method593((byte) 113, 2);
                class257.field3800.method2677(true, (byte) -69);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class74.field942.method67();
        }
        class120.field1610 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1797() {
        class226.field3385 = 0;
        for (int var0 = 0; var0 < class14.field231; var0++) {
            class26 var1 = class364.field5260[class301.field4380[var0]];
            if (var1.field771 && var1.method275((byte) 116) != -1) {
                int var2 = (var1.method446(10) - 1) * 64 + 60;
                int var3 = var1.field4954 - var2 >> 7;
                int var4 = var1.field4951 - var2 >> 7;
                class58 var5 = class28.method291(var1.field4960, var4, 0, var3);
                if (var5 != null) {
                    int var6 = var5.field777;
                    if (var5 instanceof class26) {
                        var6 += 2048;
                    }
                    if (var5.field779 == 0 && var5.method275((byte) 119) != -1) {
                        class79.field987[class226.field3385] = var6;
                        class22.field316[class226.field3385] = var6;
                        class226.field3385++;
                        var5.field779++;
                    }
                    class79.field987[class226.field3385] = var6;
                    class22.field316[class226.field3385] = var1.field777 + 2048;
                    class226.field3385++;
                    var5.field779++;
                }
            }
        }
        class103.method697(class22.field316, 0, class79.field987, -1, class226.field3385 - 1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method1798(byte arg0, byte[] arg1) {
        field3893++;
        if (arg0 != 0) {
            method1802(-34);
        }
        class256 var3 = new class256(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method1738((byte) -23);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class256.field3784 = new int[6];
                    var5[0] = var3.method1767(1930493576);
                    var5[1] = var3.method1767(1930493576);
                    var5[2] = var3.method1767(1930493576);
                    var5[3] = var3.method1767(1930493576);
                    var5[4] = var3.method1767(1930493576);
                    var5[5] = var3.method1767(1930493576);
                } else if (var4 == 4) {
                    int var6 = var3.method1738((byte) 82);
                    class409.field5887 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class409.field5887[var7] = var3.method1767(1930493576);
                        if (class409.field5887[var7] == 65535) {
                            class409.field5887[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method1738((byte) -109);
                    class286.field4204 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class286.field4204[var9] = var3.method1767(class134.method895(arg0, 1930493576));
                        if (class286.field4204[var9] == 65535) {
                            class286.field4204[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static void method1799(boolean arg0) {
        if (arg0) {
            field3880 = null;
        }
        field3881 = null;
        field3880 = null;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3892++;
        try {
            if (arg0.length != 4) {
                class71.method516(26170, "argument count");
            }
            class319.field4714 = Integer.parseInt(arg0[0]);
            class373.field5452 = 2;
            if (arg0[1].equals("live")) {
                class38.field531 = 0;
            } else if (arg0[1].equals("rc")) {
                class38.field531 = 1;
            } else if (arg0[1].equals("wip")) {
                class38.field531 = 2;
            } else {
                class71.method516(26170, "modewhat");
            }
            class153.field2073 = class367.method2335(arg0[2], -128);
            if (class153.field2073 == -1) {
                if (arg0[2].equals("english")) {
                    class153.field2073 = 0;
                } else if (arg0[2].equals("german")) {
                    class153.field2073 = 1;
                } else {
                    class71.method516(26170, "language");
                }
            }
            class37.field529 = false;
            class354.field5166 = false;
            if (arg0[3].equals("game0")) {
                class408.field5869 = class92.field1139;
            } else if (arg0[3].equals("game1")) {
                class408.field5869 = class166.field2191;
            } else {
                class71.method516(26170, "game");
            }
            class22.field320 = 0;
            class180.field2554 = "";
            class153.field2071 = 0;
            class440.field6413 = true;
            class408.field5877 = true;
            class115.field1560 = class408.field5869.field1478;
            client var1 = new client();
            class401.field5797 = var1;
            var1.method1485(571, (byte) 123, false, class408.field5869.field1475, 768, 1024, class38.field531 + 32, 29);
            class279.field4116.setLocation(40, 40);
        } catch (Exception var3) {
            class365.method2331((String) null, var3, 28692);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1800(byte arg0) {
        class286.field4180++;
        field3876++;
        class278.method1887(-1, -1, -97, (class223) null);
        class51.method394(1, -1, (class223) null, -1);
        class93.method630(0);
        class26.field384++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class26 var12 = class364.field5260[var2];
            if (var12 != null) {
                byte var13 = var12.field369.field4852;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method446(10);
                    if ((var13 & 0x2) != 0 && var12.field790 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field793[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > (class195.field2745 - var14 - 1)) {
                                var17 = class195.field2745 - var14 - 1;
                            }
                            int var18 = var12.field784[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if ((class78.field984 - var14 - 1) < var18) {
                                var18 = class78.field984 - var14 - 1;
                            }
                            int var19 = class139.method924(-1, var14, 0, true, var17, var14, 0, var12.field793[0], class15.field241, class382.field5610[var12.field4960], var12.field784[0], var18, var14, 2, class240.field3565);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field793[var20] = class15.field241[var19 - var20 - 1];
                                    var12.field784[var20] = class240.field3565[var19 - var20 - 1];
                                    var12.field786[var20] = 1;
                                }
                                var12.field790 = var19;
                            }
                        }
                    }
                    class14.method207(true, (byte) 28, var12);
                    int var21 = class408.method2539(-1, var12);
                    class136.method904(class191.field2671, var12, var21, class411.field5911, true);
                    class31.method307(var12, false);
                }
            }
        }
        if (class125.field1668 == 0 && class22.field310 == 0) {
            if (class28.field402 == 2) {
                class265.method1830(-81);
            } else {
                class213.method1459(false);
            }
            if ((class298.field4343 >> 7) < 14 || (class298.field4343 >> 7) >= (class195.field2745 - 14) || class345.field5077 >> 7 < 14 || class78.field984 - 14 <= class345.field5077 >> 7) {
                class90.method610(0);
            }
        }
        while (true) {
            class288 var3;
            class223 var4;
            class223 var5;
            do {
                var3 = (class288) class22.field315.method2476(-29642);
                if (var3 == null) {
                    while (true) {
                        class288 var6;
                        class223 var7;
                        class223 var8;
                        do {
                            var6 = (class288) class409.field5883.method2476(-29642);
                            if (var6 == null) {
                                while (true) {
                                    class288 var9;
                                    class223 var10;
                                    class223 var11;
                                    do {
                                        var9 = (class288) class166.field2188.method2476(-29642);
                                        if (var9 == null) {
                                            if (arg0 > -6) {
                                                field3881 = null;
                                            }
                                            if (class157.field2113 != null) {
                                                class266.method1834(-83);
                                            }
                                            if (class388.field5665 % 1500 == 0) {
                                                class84.method559((byte) -82);
                                            }
                                            class238.method1599(-22428);
                                            if (class270.field4008 && class265.field3923 < (class43.method364(-16756) - 60000L)) {
                                                class387.method2445(-22716);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field4217;
                                        if (var10.field3270 < 0) {
                                            break;
                                        }
                                        var11 = class432.method2655((byte) -101, var10.field3319);
                                    } while (var11 == null || var11.field3340 == null || var11.field3340.length <= var10.field3270 || var11.field3340[var10.field3270] != var10);
                                    class107.method762(var9);
                                }
                            }
                            var7 = var6.field4217;
                            if (var7.field3270 < 0) {
                                break;
                            }
                            var8 = class432.method2655((byte) -122, var7.field3319);
                        } while (var8 == null || var8.field3340 == null || var7.field3270 >= var8.field3340.length || var8.field3340[var7.field3270] != var7);
                        class107.method762(var6);
                    }
                }
                var4 = var3.field4217;
                if (var4.field3270 < 0) {
                    break;
                }
                var5 = class432.method2655((byte) -102, var4.field3319);
            } while (var5 == null || var5.field3340 == null || var5.field3340.length <= var4.field3270 || var5.field3340[var4.field3270] != var4);
            class107.method762(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1487(int arg0) {
        if (class270.field4008) {
            class387.method2445(-22716);
        }
        if (arg0 >= -19) {
            return;
        }
        field3891++;
        if (class74.field942 != null) {
            class74.field942.method136(98);
        }
        if (class359.field5222 != null) {
            class262.method1790(class267.field3963, (byte) -40, class359.field5222);
            class359.field5222 = null;
        }
        if (class72.field933 != null) {
            class72.field933.method2695(0);
            class72.field933 = null;
        }
        if (class133.field1833 != null) {
            class133.field1833.method2293(29738, class270.field4004);
        }
        class133.field1833 = null;
        if (class423.field6115 != null) {
            class423.field6115.method751(false);
        }
        if (class182.field2565 != null) {
            class182.field2565.method751(false);
        }
        class257.field3800.method2675(-7416);
        class161.field2152.method2235((byte) -119);
        if (class67.field893 != null) {
            class67.field893.method1851(0);
            class67.field893 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static final void method1801(int arg0) {
        int var1 = class208.field2933;
        int[] var2 = class88.field1085;
        for (int var3 = 0; var3 < class14.field231 + var1; var3++) {
            class58 var4;
            if (var3 < var1) {
                var4 = class455.field6731[var2[var3]];
            } else {
                var4 = class364.field5260[class301.field4380[var3 - var1]];
            }
            if (var4.field4960 == arg0 && var4.field748 >= 0) {
                int var5 = var4.method446(10);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4954 & 0x7F) != 0 || (var4.field4951 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field4954 & 0x7F) != 64 || (var4.field4951 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field4954 >> 7;
                    int var7 = var4.field4951 >> 7;
                    if (var4.field748 > class387.field5661[var6][var7]) {
                        class387.field5661[var6][var7] = var4.field748;
                        class252.field3702[var6][var7] = 1;
                    } else if (class387.field5661[var6][var7] == var4.field748) {
                        var10002 = class252.field3702[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field4954 - var8 >> 7;
                    int var10 = var4.field4951 - var8 >> 7;
                    int var11 = var4.field4954 + var8 >> 7;
                    int var12 = var4.field4951 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field748 > class387.field5661[var13][var14]) {
                                class387.field5661[var13][var14] = var4.field748;
                                class252.field3702[var13][var14] = 1;
                            } else if (class387.field5661[var13][var14] == var4.field748) {
                                var10002 = class252.field3702[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1802(int arg0) {
        int var1 = class208.field2933;
        int[] var2 = class88.field1085;
        int var3 = class63.field832 ? var1 : class14.field231 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class58 var5;
            if (var4 < var1) {
                var5 = class455.field6731[var2[var4]];
            } else {
                var5 = class364.field5260[class301.field4380[var4 - var1]];
            }
            if (var5.field4960 == arg0) {
                var5.field779 = 0;
                if (var5.field748 < 0) {
                    var5.field771 = false;
                } else {
                    int var6 = var5.method446(10);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field4954 & 0x7F) != 0 || (var5.field4951 & 0x7F) != 0) {
                            var5.field771 = false;
                            continue;
                        }
                    } else if ((var5.field4954 & 0x7F) != 64 || (var5.field4951 & 0x7F) != 64) {
                        var5.field771 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field4954 >> 7;
                        int var8 = var5.field4951 >> 7;
                        if (class387.field5661[var7][var8] != var5.field748) {
                            var5.field771 = true;
                            continue;
                        }
                        if (class252.field3702[var7][var8] > 1) {
                            var10002 = class252.field3702[var7][var8]--;
                            var5.field771 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field4954 - var9 >> 7;
                        int var11 = var5.field4951 - var9 >> 7;
                        int var12 = var5.field4954 + var9 >> 7;
                        int var13 = var5.field4951 + var9 >> 7;
                        if (!class13.method199(var5.field748, var13, var10, var12, (byte) -113, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class387.field5661[var14][var15] == var5.field748) {
                                        var10002 = class252.field3702[var14][var15]--;
                                    }
                                }
                            }
                            var5.field771 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class380 && var5.field787 != null && class388.field5665 >= var5.field787.field6694 && class388.field5665 < var5.field787.field6682) {
                        ((class380) var5).field5588 = false;
                    }
                    var5.field771 = false;
                    var5.field4952 = class133.method889(var5.field4960, var5.field4954, var5.field4951, false);
                    class404.method2525(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1473(byte arg0) {
        field3874++;
        if (class120.field1610 == 1000) {
            return;
        }
        long var2 = class115.method801(2048) / 1000000L - class303.field4433;
        class303.field4433 = class115.method801(2048) / 1000000L;
        boolean var4 = class248.method1649(-109);
        if (var4 && class29.field408 && class423.field6115 != null) {
            class423.field6115.method755(-415920505);
        }
        if (class120.field1610 == 30 || class120.field1610 == 10) {
            if (class409.field5886 != 0L && class43.method364(-16756) > class409.field5886) {
                class370.method2358(class329.method2151(0), class189.field2643, class10.field134, false, -4);
            } else if (class74.field942.method113() && class431.field6283) {
                class166.method1094((byte) 122);
            }
        }
        if (class359.field5222 == null) {
            Container var5;
            if (class279.field4116 == null) {
                var5 = class267.field3963.field5023;
            } else {
                var5 = class279.field4116;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class279.field4116 == var5) {
                Insets var8 = class279.field4116.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class266.field3946 != var6 || class252.field3699 != var7) {
                if (class74.field942 == null || class74.field942.method110()) {
                    class372.method2363((byte) -50);
                } else {
                    class252.field3699 = var7;
                    class266.field3946 = var6;
                }
                class409.field5886 = class43.method364(-16756) + 500L;
            }
        }
        int var9 = 85 % ((arg0 - 10) / 44);
        if (class359.field5222 != null && !class129.field1722 && (class120.field1610 == 30 || class120.field1610 == 10)) {
            class370.method2358(class223.field3361, -1, -1, false, -4);
        }
        boolean var10 = false;
        if (class36.field508) {
            var10 = true;
            class36.field508 = false;
        }
        if (var10) {
            class422.method2602(false);
        }
        if (class74.field942 != null && class74.field942.method89() || class329.method2151(0) != 1) {
            class51.method400(-128);
        }
        if (class120.field1610 == 0) {
            class322.method2119(class381.field5602, class381.field5604, class430.field6273[class115.field1560], class274.field4060[class115.field1560], class318.field4670[class115.field1560], 2, var10);
        } else if (class120.field1610 == 5) {
            class2.method20(var10 | class74.field942.method89(), class318.field4670[class115.field1560].getRGB(), class430.field6273[class115.field1560].getRGB(), class274.field4060[class115.field1560].getRGB(), class111.field1540, 300, class74.field942);
        } else if (class120.field1610 == 10) {
            class113.method799(-111);
        } else if (class120.field1610 == 25 || class120.field1610 == 28) {
            if (class463.field6835 == 1) {
                if (class266.field3941 > class257.field3814) {
                    class257.field3814 = class266.field3941;
                }
                int var12 = (class257.field3814 - class266.field3941) * 50 / class257.field3814;
                class76.method536(true, class196.field2755.method2543(false, class153.field2073) + "<br>(" + var12 + "%)", false, class13.field215);
            } else if (class463.field6835 == 2) {
                if (class259.field3817 > class325.field4782) {
                    class325.field4782 = class259.field3817;
                }
                int var11 = (class325.field4782 - class259.field3817) * 50 / class325.field4782 + 50;
                class76.method536(true, class196.field2755.method2543(false, class153.field2073) + "<br>(" + var11 + "%)", false, class13.field215);
            } else {
                class76.method536(true, class196.field2755.method2543(false, class153.field2073), false, class13.field215);
            }
        } else if (class120.field1610 == 30) {
            class243.method1630(13377, var2);
        } else if (class120.field1610 == 40) {
            class76.method536(true, class430.field6255.method2543(false, class153.field2073) + "<br>" + class275.field4073.method2543(false, class153.field2073), false, class13.field215);
        }
        if (class170.field2217 == 3) {
            for (int var13 = 0; var13 < class147.field1996; var13++) {
                Rectangle var14 = class267.field3958[var13];
                if (class115.field1569[var13]) {
                    class74.field942.method150(-118, var14.y, var14.x, var14.height, -1996553985, var14.width);
                } else if (class67.field895[var13]) {
                    class74.field942.method150(-53, var14.y, var14.x, var14.height, -1996554240, var14.width);
                }
            }
        }
        if (class199.method1378(-50)) {
            class262.method1791(class74.field942, (byte) -127);
        }
        if ((class120.field1610 == 30 || class120.field1610 == 10) && class170.field2217 == 0 && class329.method2151(0) == 1 && !var10 && class341.field5018.equals("1.1")) {
            int var15 = 0;
            for (int var16 = 0; var16 < class147.field1996; var16++) {
                if (class67.field895[var16]) {
                    class67.field895[var16] = false;
                    class409.field5885[var15++] = class267.field3958[var16];
                }
            }
            class74.field942.method143(class409.field5885, var15);
        } else if (class120.field1610 != 0) {
            class74.field942.method158();
            for (int var17 = 0; var17 < class147.field1996; var17++) {
                class67.field895[var17] = false;
            }
        }
        if (class329.field4900 == 0) {
            class418.method2587(false, 15L);
        } else if (class329.field4900 == 1) {
            class418.method2587(false, 10L);
        } else if (class329.field4900 == 2) {
            class418.method2587(false, 5L);
        } else if (class329.field4900 == 3) {
            class418.method2587(false, 2L);
        }
        if (class383.field5620) {
            class2.method19(-112);
        }
        if (class381.field5603 && class120.field1610 == 10 && class318.field4672 != -1) {
            class381.field5603 = false;
            class53.method414(class267.field3963, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1803() {
        int var0 = class208.field2933;
        int[] var1 = class88.field1085;
        int var2 = class63.field832 ? var0 : class14.field231 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class58 var4;
            if (var3 < var0) {
                var4 = class455.field6731[var1[var3]];
            } else {
                var4 = class364.field5260[class301.field4380[var3 - var0]];
            }
            if (var4.field748 >= 0) {
                int var5 = var4.method446(10);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4954 & 0x7F) == 0 && (var4.field4951 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field4954 & 0x7F) == 64 && (var4.field4951 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class380 && var4.field787 != null && class388.field5665 >= var4.field787.field6694 && class388.field5665 < var4.field787.field6682) {
                    ((class380) var4).field5588 = false;
                }
                var4.field4952 = class133.method889(var4.field4960, var4.field4954, var4.field4951, false);
                class404.method2525(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)Lat;")
    public static final class256 method1804(boolean arg0) {
        field3884++;
        class256 var1 = new class256(38);
        var1.method1727(-128, 15);
        var1.method1727(-128, class52.field652);
        var1.method1727(-128, class349.field5124 ? 1 : 0);
        var1.method1727(-128, class323.field4773 ? 1 : 0);
        var1.method1727(-128, class367.field5307 ? 1 : 0);
        var1.method1727(-128, class231.field3482 ? 1 : 0);
        var1.method1727(-128, 0);
        var1.method1727(-128, class62.field826 ? 1 : 0);
        var1.method1727(-128, class403.field5834 ? 1 : 0);
        var1.method1727(-128, class182.field2561 ? 1 : 0);
        var1.method1727(-128, class213.field3010);
        var1.method1727(-128, class307.field4535 ? 1 : 0);
        var1.method1727(-128, class13.field224 ? 1 : 0);
        var1.method1727(-128, class76.field969 ? 1 : 0);
        var1.method1727(-128, class79.field993);
        if (!arg0) {
            method1805();
        }
        var1.method1727(-128, class134.field1847 ? 1 : 0);
        var1.method1727(-128, class372.field5437);
        var1.method1727(-128, class450.field6629);
        var1.method1727(-128, class178.field2539);
        var1.method1750((byte) 0, class189.field2643);
        var1.method1750((byte) 0, class10.field134);
        var1.method1727(-128, class145.method1007(-14164));
        var1.method1721(25153, class14.field234);
        var1.method1727(-128, class223.field3361);
        var1.method1727(-128, class381.field5603 ? 1 : 0);
        var1.method1727(-128, class400.field5790 ? 1 : 0);
        var1.method1727(-128, class376.field5491);
        var1.method1727(-128, class436.field6366 ? 1 : 0);
        var1.method1727(-128, class79.field990 ? 1 : 0);
        var1.method1727(-128, class337.field4974);
        var1.method1727(-128, class29.field418 ? 1 : 0);
        var1.method1727(-128, class322.field4739);
        var1.method1727(-128, class329.field4900);
        return var1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3873++;
        if (!this.method1483(1376312589)) {
            return;
        }
        class319.field4714 = Integer.parseInt(this.getParameter("worldid"));
        class373.field5452 = Integer.parseInt(this.getParameter("modewhere"));
        if (class373.field5452 < 0 || class373.field5452 > 1) {
            class373.field5452 = 0;
        }
        class38.field531 = Integer.parseInt(this.getParameter("modewhat"));
        if (class38.field531 < 0 || class38.field531 > 2) {
            class38.field531 = 0;
        }
        try {
            class153.field2073 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class153.field2073 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class37.field529 = true;
        } else {
            class37.field529 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class354.field5166 = true;
        } else {
            class354.field5166 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class170.field2221 = true;
        } else {
            class170.field2221 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class408.field5869 = class166.field2191;
        } else {
            class408.field5869 = class92.field1139;
        }
        try {
            class22.field320 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class22.field320 = 0;
        }
        class82.field1009 = this.getParameter("quiturl");
        class180.field2554 = this.getParameter("settings");
        if (class180.field2554 == null) {
            class180.field2554 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class153.field2071 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class153.field2071 = 0;
            }
        }
        class115.field1560 = Integer.parseInt(this.getParameter("colourid"));
        if (class115.field1560 < 0 || class115.field1560 >= class274.field4060.length) {
            class115.field1560 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class440.field6413 = true;
            class408.field5877 = true;
        }
        if (class92.field1139 == class408.field5869) {
            class366.field5302 = 503;
            class60.field800 = 765;
        } else if (class408.field5869 == class166.field2191) {
            class60.field800 = 640;
            class366.field5302 = 480;
        }
        class401.field5797 = this;
        this.method1486(0, class38.field531 + 32, class60.field800, 571, class366.field5302);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method1484(byte arg0) {
        field3886++;
        if (class120.field1610 == 1000) {
            return;
        }
        int var2 = 18 % ((arg0 - 17) / 59);
        class388.field5665++;
        if ((class388.field5665 % 1000) == 1) {
            GregorianCalendar var3 = new GregorianCalendar();
            class34.field488 = var3.get(11) * 600 + var3.get(12) * 10 + var3.get(13) / 6;
            class243.field3609.setSeed((long) class34.field488);
        }
        this.method1794(true);
        if (class217.field3089 != null) {
            class217.field3089.method1946(-16210);
        }
        class110.method787(-42);
        class60.method457(14597);
        class436.field6368.method262(-120);
        class223.field3295.method410(-22);
        if (class133.field1833 != null) {
            int var4 = class133.field1833.method2292(16);
            class52.field655 = var4;
        }
        if (class74.field942 != null) {
            class74.field942.method144((int) class43.method364(-16756));
        }
        class13.method205(-99);
        class34.field480 = 0;
        for (class408 var5 = class436.field6368.method253(32); var5 != null && class34.field480 < 128; var5 = class436.field6368.method253(32)) {
            if (var5.method2461(13998) != 1) {
                char var6 = var5.method2456((byte) 98);
                if (!class118.method807(true) || var6 != '`' && var6 != '§') {
                    class33.field474[class34.field480] = var5;
                    class34.field480++;
                } else if (class199.method1378(-50)) {
                    class157.method1068((byte) -102);
                } else {
                    class85.method571(12531);
                }
            }
        }
        class78.field986 = null;
        for (class436 var7 = class223.field3295.method418(126); var7 != null; var7 = class223.field3295.method418(127)) {
            int var8 = var7.method2441(-3);
            if (var8 == -1) {
                class38.field538.method2484(0, var7);
            } else if (class1.method12(-519438041, var8)) {
                class78.field986 = var7;
            }
        }
        if (class199.method1378(-50)) {
            class458.method2836(0);
        }
        if (class120.field1610 == 0) {
            this.method1793(140);
            class419.method2591((byte) 126);
        } else if (class120.field1610 == 5) {
            this.method1793(140);
            class419.method2591((byte) -42);
        } else if (class120.field1610 == 25 || class120.field1610 == 28) {
            class337.method2180((byte) 86);
        }
        if (class120.field1610 == 10) {
            this.method1800((byte) -57);
            class160.method1076(-57);
            class166.method1097(true);
            class390.method2462(-9);
        } else if (class120.field1610 == 30) {
            class266.method1836(-61);
        } else if (class120.field1610 == 40) {
            class390.method2462(-9);
            if (class92.field1150 != -3 && class92.field1150 != 2 && class92.field1150 != 15) {
                class164.method1086((byte) 119);
            }
        }
        class164.method1085(0, class74.field942);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1805() {
        for (int var0 = 0; var0 < class195.field2745; var0++) {
            int[] var1 = class387.field5661[var0];
            for (int var2 = 0; var2 < class78.field984; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1806(int arg0, int arg1) {
        class257.field3800.field6361 = arg0;
        class252.field3705 = null;
        class342.field5034 = null;
        field3877++;
        class257.field3800.field6363++;
        class108.field1468 = 0;
        if (arg1 >= -114) {
            field3881 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1807() {
        int var0 = class208.field2933;
        int[] var1 = class88.field1085;
        boolean var2 = class337.field4974 == 1 && var0 > 200 || class337.field4974 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class380 var12 = class455.field6731[var1[var3]];
            if (var12.method2413(-128)) {
                var12.method449((byte) -28);
                if (var12.field4961 >= 0 && var12.field4959 >= 0 && var12.field4957 < class195.field2745 && var12.field4950 < class78.field984) {
                    var12.field5588 = var12.field719 ? var2 : false;
                    if (class187.field2619 == var12) {
                        var12.field748 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field771) {
                            var13++;
                        }
                        if (var12.field747 > class388.field5665) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method446(10) << 2);
                        if (class308.field4550 == 0) {
                            var14 += 32;
                        } else {
                            var14 += 128;
                        }
                        var14 += 256;
                        var12.field748 = var14 + 1;
                    }
                } else {
                    var12.field748 = -1;
                }
            } else {
                var12.field748 = -1;
            }
        }
        for (int var4 = 0; var4 < class14.field231; var4++) {
            class26 var9 = class364.field5260[class301.field4380[var4]];
            if (var9.method266(-120) && var9.field369.method2137(13164)) {
                var9.method449((byte) -28);
                if (var9.field4961 >= 0 && var9.field4959 >= 0 && var9.field4957 < class195.field2745 && var9.field4950 < class78.field984) {
                    int var10 = 0;
                    if (!var9.field771) {
                        var10++;
                    }
                    if (var9.field747 > class388.field5665) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method446(10) << 2);
                    if (class308.field4550 == 0) {
                        if (var9.field369.field4869) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class308.field4550 == 1) {
                        if (var9.field369.field4869) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field369.field4875) {
                        var11 += 1024;
                    } else if (!var9.field369.field4868) {
                        var11 += 256;
                    }
                    var9.field748 = var11 + 1;
                } else {
                    var9.field748 = -1;
                }
            } else {
                var9.field748 = -1;
            }
        }
        for (int var5 = 0; var5 < class331.field4910.length; var5++) {
            class99 var6 = class331.field4910[var5];
            if (var6 != null) {
                if (var6.field1223 == 1) {
                    class26 var7 = class364.field5260[var6.field1230];
                    if (var7 != null && var7.field748 >= 0) {
                        var7.field748 += 2048;
                    }
                } else if (var6.field1223 == 10) {
                    class380 var8 = class455.field6731[var6.field1230];
                    if (var8 != null && class187.field2619 != var8 && var8.field748 >= 0) {
                        var8.field748 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1474(byte arg0) {
        field3887++;
        method1799(false);
        class31.method305(-109);
        class125.method843(true);
        class409.method2540(120);
        class452.method2808(5);
        class37.method337(52);
        class53.method409(-2734);
        class29.method298(16384);
        class264.method1823(14303);
        class15.method215(119);
        class90.method601(false);
        class215.method1475((byte) -117);
        class30.method304(false);
        class109.method776(true);
        class187.method1282((byte) -80);
        class9.method95((byte) -95);
        class99.method658(120);
        class395.method2475(3);
        class401.method2507(-121);
        class440.method2698(true);
        class435.method2679(10);
        class344.method2234((byte) -88);
        class291.method1945(8);
        class301.method2000(-2);
        class104.method725(-100);
        class459.method2850(8);
        class70.method513((byte) 13);
        class363.method2309((byte) -112);
        class11.method178((byte) -83);
        class26.method270(1);
        class24.method251(true);
        class270.method1850(false);
        class399.method2497(115);
        class175.method1208((byte) -106);
        class239.method1604((byte) 100);
        class86.method586(false);
        class339.method2188((byte) -90);
        class304.method2030((byte) 118);
        class223.method1537(false);
        class429.method2641((byte) 118);
        class380.method2410((byte) 1);
        class262.method1792((byte) 35);
        class404.method2521(-8620);
        class450.method2788(64);
        class105.method750(64);
        class385.method2435(-118);
        class256.method1757((byte) 119);
        class196.method1366(-74);
        class58.method435(36);
        class369.method2343((byte) -46);
        class274.method1870((byte) -21);
        class265.method1828(1000);
        class188.method1284(-112);
        class182.method1249(12692);
        class332.method2164(21053);
        class160.method1075(0);
        class195.method1353((byte) 78);
        class161.method1077(0);
        class365.method2332(1);
        class100.method665(-53);
        class143.method979(-127);
        class378.method2394(9267);
        class400.method2504((byte) 127);
        class298.method1980((byte) -61);
        class71.method515((byte) -63);
        class163.method1083(101);
        class279.method1894((byte) 38);
        class411.method2556((byte) 127);
        class423.method2610((byte) -38);
        class252.method1665(1205);
        class14.method208(4096);
        class200.method1383(32);
        class74.method525(111);
        class115.method805((byte) 118);
        class57.method432(-3671);
        class113.method800(false);
        class178.method1239(-116);
        class259.method1782((byte) -24);
        class213.method1460((byte) -71);
        class402.method2513(97);
        class199.method1380((byte) 127);
        class272.method1858(79);
        class441.method2707(-26930);
        class327.method2136(21147);
        class427.method2632(-114);
        class465.method2870(84);
        class124.method836(false);
        class32.method310((byte) 83);
        class217.method1494(25999);
        class2.method21((byte) -1);
        class431.method2648(-101);
        class384.method2426(false);
        class78.method541((byte) -75);
        class139.method919(false);
        class322.method2113(-26680);
        class183.method1254();
        class208.method1436((byte) 26);
        class34.method321(-1);
        class464.method2864(28956);
        class326.method2128(false);
        class364.method2317((byte) 123);
        class420.method2595(-1);
        class83.method553(-11335);
        class107.method765();
        class66.method488();
        class376.method2380((byte) -101);
        class297.method1973();
        class145.method1009(0);
        class110.method790(102);
        class67.method499((byte) -108);
        class387.method2442(1);
        class62.method467(true);
        class289.method1936(-175667672);
        class17.method224((byte) -107);
        class135.method900((byte) -56);
        class294.method1957(13);
        class103.method692(122);
        class149.method1024(123);
        class148.method1021((byte) -53);
        class283.method1909(0);
        class458.method2837((byte) -25);
        class354.method2268((byte) -73);
        class368.method2340(-118);
        class446.method2741(36);
        class296.method1966(false);
        class10.method174((byte) 76);
        class137.method914(true);
        class214.method1467(false);
        class150.method1036((byte) -128);
        class466.method2875((byte) -121);
        class349.method2252(false);
        class234.method1591(-4);
        class247.method1641((byte) -120);
        class111.method793(false);
        class52.method401(-1);
        class127.method854(true);
        class129.method867((byte) 100);
        class444.method2732(91);
        class263.method1817(1);
        class238.method1601((byte) 46);
        class437.method2692((byte) 116);
        class93.method634(8224);
        class357.method2275(-48);
        class33.method313((byte) 127);
        class306.method2047();
        class416.method2583((byte) -71);
        class154.method1051(-208);
        class177.method1228(73);
        class373.method2369(true);
        class153.method1045(6);
        class269.method1849((byte) 37);
        class141.method937(100);
        class288.method1930(-13890);
        class167.method1102((byte) -93);
        class299.method1985(-58);
        class336.method2179((byte) 63);
        class309.method2059((byte) 38);
        class241.method1622(false);
        class253.method1673(-28150);
        class314.method2080();
        class454.method2812(1);
        class216.method1490(-1);
        class96.method641(-63);
        class157.method1066(false);
        class323.method2122((byte) -11);
        class422.method2605(true);
        class233.method1583((byte) -93);
        class206.method1418(20572);
        class155.method1055(8);
        class337.method2181((byte) 65);
        class126.method850((byte) -107);
        class152.method1042(2);
        class243.method1627(122);
        class248.method1651((byte) 14);
        class204.method1399(80);
        class372.method2364((byte) -128);
        class359.method2281(-121);
        class166.method1100((byte) -2);
        class331.method2160((byte) 123);
        class138.method916(-1);
        class370.method2359(-125);
        class142.method939((byte) 126);
        class151.method1039((byte) 69);
        class176.method1224();
        class169.method1105(69);
        class315.method2082((byte) -18);
        class463.method2863(false);
        if (arg0 <= 49) {
            field3883 = 37;
        }
        class305.method2037(true);
        class231.method1578(3);
        class28.method288(123);
        class245.method1634(106);
        class447.method2751(true);
        class77.method537((byte) -121);
        class171.method1108((byte) 109);
        class4.method31(2);
        class443.method2722((byte) 119);
        class1.method8((byte) -98);
        class455.method2823((byte) 106);
        class267.method1837(2589);
        class147.method1015(false);
        class307.method2052(-20203);
        class94.method637();
        class133.method891((byte) 124);
        class226.method1550(87);
        class22.method241(true);
        class25.method259(94);
        class377.method2389(0);
        class356.method2271(0);
        class47.method385(1506);
        class383.method2424((byte) 63);
        class209.method1438(false);
        class240.method1618((byte) -90);
        class379.method2401();
        class418.method2589(256);
        class118.method810(-112);
        class343.method2228(1);
        class276.method1879(31541);
        class212.method1457((byte) 124);
        class417.method2586(-96);
        class311.method2065((byte) -2);
        class218.method1495();
        class23.method248();
        class186.method1271((byte) -99);
        class397.method2490(true);
        class36.method334(-15147);
        class82.method549(-1);
        class13.method206(-1288490189);
        class194.method1347();
        class98.method651();
        class325.method2125((byte) 126);
        class300.method1988();
        class131.method881(-1);
        class134.method894(0);
        class210.method1445(338);
        class170.method1107(6);
        class249.method1653((byte) 116);
        class230.method1570((byte) -110);
        class278.method1890(-5643);
        class310.method2062(false);
        class18.method229(4);
        class419.method2590(true);
        class382.method2421((byte) 43);
        class106.method760(4);
        class227.method1559(1437891116);
        class242.method1624(false);
        class319.method2100((byte) -118);
        class266.method1831(124);
        class346.method2241(-5684);
        class403.method2517((byte) -63);
        class260.method1786(-1);
        class184.method1269(54);
        class5.method40(11492);
        class228.method1565((byte) 33);
        class345.method2236((byte) -118);
        class46.method377(-120);
        class433.method2658(false);
        class338.method2185((byte) 39);
        class79.method544((byte) -98);
        class430.method2643(false);
        class286.method1928(false);
        class136.method905(-1);
        class130.method874(-126);
        class55.method422(-117);
        class303.method2014((byte) 73);
        class313.method2067(-97);
        class56.method427(true);
        class393.method2471((byte) -14);
        class75.method531(1);
        class347.method2244((byte) 99);
        class308.method2055(-606754164);
        class388.method2455(-122);
        class180.method1247(2);
        class251.method1661(true);
        class189.method1293(20051);
        class60.method456(125);
        class237.method1596((byte) -54);
        class236.method1594(99);
        class88.method594(1020391948);
        class222.method1522(-1016);
        class244.method1631(-293953721);
        class257.method1769(10872);
        class316.method2090(-123);
        class51.method398(2);
        class225.method1548(3);
        class165.method1090(-124);
        class320.method2107(-32195);
        class432.method2653(-24710);
        class44.method369((byte) -80);
        class451.method2802(true);
        class202.method1390(1450089892);
        class342.method2226(112);
        class318.method2095(255);
        class275.method1874(103);
        class334.method2175(-4432);
        class92.method624(true);
        class42.method360(-21897);
        class219.method1515();
        class21.method238();
        class295.method1960(true);
        class192.method1338(-6598);
        class38.method341(-112);
        class330.method2155(32701);
        class119.method815(1);
        class329.method2150((byte) 95);
        class271.method1856((byte) 17);
        class282.method1902((byte) 80);
        class159.method1069((byte) 37);
        class3.method26(8);
        class191.method1334(-28);
        class392.method2465(117);
        class120.method819(true);
        class408.method2536(-110);
        class436.method2687(-4);
        class72.method519(true);
        class146.method1011(-128);
        class353.method2258(-1575687800);
        class76.method533((byte) 63);
        class132.method888(28559);
        class390.method2463(1);
        class386.method2439(-27873);
        class367.method2336((byte) 118);
        class421.method2601(-79);
        class328.method2148(-124);
        class381.method2417(-3511);
        class366.method2334(-38688852);
        class456.method2827(78);
        class35.method331((byte) -105);
        if (class215.field3070) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1476(int arg0) {
        field3875++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class372.method2363((byte) -50);
        class161.field2152 = new class344(class267.field3963);
        class257.field3800 = new class435();
        if (class38.field531 != 0) {
            class76.field972 = new byte[50][];
        }
        class46.method382(-14, class267.field3963);
        if (class373.field5452 == 0) {
            class304.field4462 = this.getCodeBase().getHost();
            class30.field419 = 443;
            class332.field4929 = 43594;
        } else if (class373.field5452 == 1) {
            class304.field4462 = this.getCodeBase().getHost();
            class332.field4929 = class319.field4714 + 40000;
            class30.field419 = class319.field4714 + 50000;
        } else if (class373.field5452 == 2) {
            class30.field419 = class319.field4714 + 50000;
            class332.field4929 = class319.field4714 + 40000;
            class304.field4462 = "127.0.0.1";
        }
        class369.field5320 = class332.field4929;
        class160.field2147 = class332.field4929;
        class304.field4445 = class304.field4462;
        class383.field5612 = class30.field419;
        if (class341.field5007 == 3) {
            class403.field5825 = class319.field4714;
        }
        if (class408.field5869 == class166.field2191) {
            class52.field658 = class22.field319;
            class286.field4203 = class359.field5218;
            class103.field1332 = true;
            class159.field2135 = 16777215;
            class180.field2550 = class270.field4006;
            class265.field3925 = class404.field5842;
            class57.field695 = 0;
        } else {
            class265.field3925 = class208.field2928;
            class180.field2550 = class86.field1060;
            class286.field4203 = class456.field6747;
            class52.field658 = class32.field448;
        }
        class465.field6851 = class369.field5320;
        class213.field3007 = class67.field896 = class46.field609 = class34.field490 = new short[256];
        class436.field6368 = class378.method2395(class270.field4004, 12127);
        class223.field3295 = class56.method424(class270.field4004, (byte) -75, true);
        class133.field1833 = class363.method2312(88);
        if (class133.field1833 != null) {
            class133.field1833.method2291(class270.field4004, (byte) -104);
        }
        class371.field5431 = class341.field5007;
        try {
            if (class267.field3963.field5010 != null) {
                class458.field6778 = new class459(class267.field3963.field5010, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class318.field4675[var3] = new class459(class267.field3963.field5015[var3], 6000, 0);
                }
                class275.field4074 = new class459(class267.field3963.field5011, 6000, 0);
                class325.field4781 = new class70(255, class458.field6778, class275.field4074, 500000);
                class106.field1434 = new class459(class267.field3963.field5019, 24, 0);
                class267.field3963.field5011 = null;
                class267.field3963.field5010 = null;
                class267.field3963.field5015 = null;
                class267.field3963.field5019 = null;
            }
            if (arg0 != -2980) {
                field3883 = 76;
            }
        } catch (IOException var4) {
            class275.field4074 = null;
            class106.field1434 = null;
            class458.field6778 = null;
            class325.field4781 = null;
        }
        if (class373.field5452 != 0) {
            class76.field961 = true;
        }
        class385.field5635 = (class92.field1139 == class408.field5869 ? class354.field5164 : class267.field3979).method2543(false, class153.field2073);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1808(byte arg0, String arg1) {
        field3879++;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg0 >= -89) {
            method1796(-51, 2);
        }
        while (var2 > var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkg;)Z")
    public static final boolean method1809(class223 arg0) {
        if (class159.field2133) {
            if (method1811(arg0).field4926 != 0) {
                return false;
            }
            if (arg0.field3216 == 0) {
                return false;
            }
        }
        return arg0.field3315;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III[B)I")
    public static final int method1810(int arg0, int arg1, int arg2, byte[] arg3) {
        field3890++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class308.field4546[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        return arg1 == 2022 ? var6 : 98;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lkg;)Lvm;")
    public static final class332 method1811(class223 arg0) {
        class332 var1 = (class332) class51.field635.method609(((long) arg0.field3223 << 32) + (long) arg0.field3270, 58);
        return var1 == null ? arg0.field3331 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lkg;IIIIIIIII)V")
    public static final void method1812(class223[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class223 var11 = arg0[var10];
            if (var11 != null && var11.field3319 == arg1) {
                int var12 = var11.field3288 + arg6;
                int var13 = var11.field3362 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field3216 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field3233 + var12;
                    int var19 = var11.field3352 + var13;
                    if (var11.field3216 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field3216 == 0 || var11.field3311 || method1811(var11).field4926 != 0 || class42.field567 == var11 || class134.field1844 == var11.field3357) {
                    if (!method1809(var11)) {
                        if (class157.field2113 == var11) {
                            class76.field968 = true;
                            class309.field4558 = var12;
                            class375.field5472 = var13;
                        }
                        if (var11.field3221 || var14 < var16 && var15 < var17) {
                            if (var11.field3216 == 0 && var11.field3231 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class288 var20 = (class288) class166.field2188.method2478(1603); var20 != null; var20 = (class288) class166.field2188.method2486((byte) -82)) {
                                    if (var20.field4213) {
                                        var20.method1820(-25246);
                                        var20.field4217.field3350 = false;
                                    }
                                }
                                if (class195.field2743 == 0) {
                                    class157.field2113 = null;
                                    class42.field567 = null;
                                }
                                class196.field2780 = 0;
                                class368.field5318 = false;
                                class388.field5673 = false;
                                if (!class286.field4210) {
                                    class423.method2608((byte) -81);
                                }
                            }
                            boolean var21;
                            if (class223.field3295.method411(0) >= var14 && class223.field3295.method415(-102) >= var15 && class223.field3295.method411(0) < var16 && class223.field3295.method415(-121) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class286.field4210 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class432.method2654(arg9 - var13, 69, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class223.field3295.method407((byte) -122) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class78.field986 != null && class78.field986.method2441(-3) == 0 && class78.field986.method2437((byte) 26) >= var14 && class78.field986.method2440(-1) >= var15 && class78.field986.method2437((byte) 26) < var16 && class78.field986.method2440(-1) < var17) {
                                var23 = true;
                            }
                            if (var11.field3247 != null) {
                                for (int var24 = 0; var24 < var11.field3247.length; var24++) {
                                    if (class436.field6368.method256(-120, var11.field3247[var24])) {
                                        if (var11.field3249 == null || class388.field5665 >= var11.field3249[var24]) {
                                            byte var25 = var11.field3260[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class436.field6368.method256(-112, 86) && !class436.field6368.method256(-91, 82) && !class436.field6368.method256(-100, 81)) && ((var25 & 0x2) == 0 || class436.field6368.method256(-112, 86)) && ((var25 & 0x1) == 0 || class436.field6368.method256(-94, 82)) && ((var25 & 0x4) == 0 || class436.field6368.method256(-96, 81))) {
                                                class93.method631(var24 + 1, var11.field3223, -1, true, "");
                                                int var26 = var11.field3364[var24];
                                                if (var11.field3249 == null) {
                                                    var11.field3249 = new int[var11.field3247.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field3249[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field3249[var24] = class388.field5665 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field3249 != null) {
                                        var11.field3249[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class465.method2871(0, class78.field986.method2440(-1) - var13, class78.field986.method2437((byte) 26) - var12, var11);
                            }
                            if (class157.field2113 != null && class157.field2113 != var11 && var21 && method1811(var11).method2170(-25047)) {
                                class3.field33 = var11;
                            }
                            if (class42.field567 == var11) {
                                class237.field3529 = true;
                                class44.field589 = var12;
                                class30.field420 = var13;
                            }
                            if (var11.field3311 || var11.field3357 != 0) {
                                if (var21 && class52.field655 != 0 && var11.field3355 != null) {
                                    class288 var27 = new class288();
                                    var27.field4213 = true;
                                    var27.field4217 = var11;
                                    var27.field4222 = class52.field655;
                                    var27.field4218 = var11.field3355;
                                    class166.field2188.method2484(0, var27);
                                }
                                if (class157.field2113 != null || class286.field4210 || class129.field1720 != var11.field3357 && class196.field2780 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field3357 != 0) {
                                    if (class135.field1850 == var11.field3357 || class354.field5165 == var11.field3357) {
                                        class163.field2162 = var11;
                                        if (class187.field2613 != null) {
                                            class187.field2613.method2193(var11.field3352, class74.field942, -1);
                                        }
                                        if (class135.field1850 == var11.field3357) {
                                            if (!class286.field4210 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class105.method745((byte) -122, class74.field942, arg8, arg9);
                                                for (class463 var28 = (class463) class184.field2596.method2026(100); var28 != null; var28 = (class463) class184.field2596.method2022(10)) {
                                                    if (arg8 >= var28.field6832 && arg8 < var28.field6831 && arg9 >= var28.field6829 && arg9 < var28.field6834) {
                                                        class423.method2608((byte) -81);
                                                        class216.method1491(var28.field6828, 116);
                                                    }
                                                }
                                            }
                                            class278.method1887(var12, var13, -98, var11);
                                            continue;
                                        }
                                    }
                                    if (class134.field1844 == var11.field3357) {
                                        if (var11.method1534((byte) -111, class74.field942) == null || class164.field2169 != 0 && class164.field2169 != 3 || class286.field4210 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field3342[var30];
                                        if (var29 < var31 || var29 > var11.field3232[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field3233 / 2;
                                        int var33 = var30 - var11.field3352 / 2;
                                        int var34;
                                        if (class28.field402 == 4) {
                                            var34 = (int) class1.field19 & 0x3FFF;
                                        } else {
                                            var34 = (int) class1.field19 + class303.field4429 & 0x3FFF;
                                        }
                                        int var35 = class327.field4863[var34];
                                        int var36 = class327.field4862[var34];
                                        if (class28.field402 != 4) {
                                            var35 = (class30.field422 + 256) * var35 >> 8;
                                            var36 = (class30.field422 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class28.field402 == 4) {
                                            var39 = (class152.field2056 >> 7) + (var37 >> 2);
                                            var40 = (class188.field2629 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class187.field2619.method446(10) - 1) * 64;
                                            var39 = (class187.field2619.field4954 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class187.field2619.field4951 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class147.field1993 && (class433.field6315 & 0x40) != 0) {
                                            class223 var42 = class99.method654(-1, class243.field3605, class74.field949);
                                            if (var42 == null) {
                                                class25.method257(75);
                                            } else {
                                                class463.method2862(class90.field1107, var40, false, true, class253.field3723, 1L, " ->", (byte) -126, 45, var39);
                                            }
                                            continue;
                                        }
                                        if (class408.field5869 == class166.field2191) {
                                            class463.method2862(-1, var40, false, true, class385.field5637.method2543(false, class153.field2073), 1L, "", (byte) -111, 49, var39);
                                        }
                                        class463.method2862(-1, var40, false, true, class155.field2087, 1L, "", (byte) -112, 18, var39);
                                        continue;
                                    }
                                    if (class129.field1720 == var11.field3357) {
                                        class418.field6031 = var11;
                                        if (var21) {
                                            class368.field5318 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class78.field986.method2437((byte) 26) - var12 - var11.field3233 / 2) * 2.0D / (double) class66.field853);
                                            int var44 = (int) (-((double) (class78.field986.method2440(-1) - var13 - var11.field3352 / 2) * 2.0D / (double) class66.field853));
                                            int var45 = class344.field5064 + var43 + class66.field870;
                                            int var46 = class134.field1843 + var44 + class66.field860;
                                            class239 var47 = class104.method726(-279);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method1611(var46, var45, 0, var48);
                                            if (var48 != null) {
                                                if (class436.field6368.method256(-94, 82) && class42.field564 > 0) {
                                                    class387.method2447((byte) 122, var48[1], var48[0], var48[2]);
                                                    continue;
                                                }
                                                class388.field5673 = true;
                                                class359.field5223 = var48[0];
                                                class14.field230 = var48[1];
                                                class25.field352 = var48[2];
                                            }
                                            class196.field2780 = 1;
                                            class344.field5066 = false;
                                            class133.field1834 = class223.field3295.method411(0);
                                            class155.field2082 = class223.field3295.method415(-84);
                                            continue;
                                        }
                                        if (var22 && class196.field2780 > 0) {
                                            if (class196.field2780 == 1 && (class133.field1834 != class223.field3295.method411(0) || class155.field2082 != class223.field3295.method415(-117))) {
                                                class223.field3330 = class344.field5064;
                                                class79.field995 = class134.field1843;
                                                class196.field2780 = 2;
                                            }
                                            if (class196.field2780 == 2) {
                                                class344.field5066 = true;
                                                class393.method2469(class223.field3330 + (int) ((double) (class133.field1834 - class223.field3295.method411(0)) * 2.0D / (double) class66.field851), -1);
                                                class241.method1621(class79.field995 - (int) ((double) (class155.field2082 - class223.field3295.method415(-102)) * 2.0D / (double) class66.field851), 125);
                                            }
                                            continue;
                                        }
                                        if (class196.field2780 > 0 && !class344.field5066) {
                                            if ((class24.field332 == 1 || class358.method2277(-3497)) && class237.field3532 > 2) {
                                                class60.method455(class155.field2082, class133.field1834, 2, (byte) 0);
                                            } else if (class373.method2370((byte) -108)) {
                                                class60.method455(class155.field2082, class133.field1834, 0, (byte) 0);
                                            }
                                        }
                                        class196.field2780 = 0;
                                        continue;
                                    }
                                    if (class227.field3412 == var11.field3357) {
                                        if (var22) {
                                            class466.method2874(class223.field3295.method411(0) - var12, var11.field3352, 65, var11.field3233, class223.field3295.method415(-116) - var13);
                                        }
                                        continue;
                                    }
                                    if (class126.field1671 == var11.field3357) {
                                        class51.method394(1, var12, var11, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field3262 && var23) {
                                    var11.field3262 = true;
                                    if (var11.field3297 != null) {
                                        class288 var49 = new class288();
                                        var49.field4213 = true;
                                        var49.field4217 = var11;
                                        var49.field4220 = class78.field986.method2437((byte) 26) - var12;
                                        var49.field4222 = class78.field986.method2440(-1) - var13;
                                        var49.field4218 = var11.field3297;
                                        class166.field2188.method2484(0, var49);
                                    }
                                }
                                if (var11.field3262 && var22 && var11.field3290 != null) {
                                    class288 var50 = new class288();
                                    var50.field4213 = true;
                                    var50.field4217 = var11;
                                    var50.field4220 = class223.field3295.method411(0) - var12;
                                    var50.field4222 = class223.field3295.method415(-103) - var13;
                                    var50.field4218 = var11.field3290;
                                    class166.field2188.method2484(0, var50);
                                }
                                if (var11.field3262 && !var22) {
                                    var11.field3262 = false;
                                    if (var11.field3281 != null) {
                                        class288 var51 = new class288();
                                        var51.field4213 = true;
                                        var51.field4217 = var11;
                                        var51.field4220 = class223.field3295.method411(0) - var12;
                                        var51.field4222 = class223.field3295.method415(-73) - var13;
                                        var51.field4218 = var11.field3281;
                                        class409.field5883.method2484(0, var51);
                                    }
                                }
                                if (var22 && var11.field3255 != null) {
                                    class288 var52 = new class288();
                                    var52.field4213 = true;
                                    var52.field4217 = var11;
                                    var52.field4220 = class223.field3295.method411(0) - var12;
                                    var52.field4222 = class223.field3295.method415(-77) - var13;
                                    var52.field4218 = var11.field3255;
                                    class166.field2188.method2484(0, var52);
                                }
                                if (!var11.field3350 && var21) {
                                    var11.field3350 = true;
                                    if (var11.field3230 != null) {
                                        class288 var53 = new class288();
                                        var53.field4213 = true;
                                        var53.field4217 = var11;
                                        var53.field4220 = class223.field3295.method411(0) - var12;
                                        var53.field4222 = class223.field3295.method415(-79) - var13;
                                        var53.field4218 = var11.field3230;
                                        class166.field2188.method2484(0, var53);
                                    }
                                }
                                if (var11.field3350 && var21 && var11.field3254 != null) {
                                    class288 var54 = new class288();
                                    var54.field4213 = true;
                                    var54.field4217 = var11;
                                    var54.field4220 = class223.field3295.method411(0) - var12;
                                    var54.field4222 = class223.field3295.method415(-109) - var13;
                                    var54.field4218 = var11.field3254;
                                    class166.field2188.method2484(0, var54);
                                }
                                if (var11.field3350 && !var21) {
                                    var11.field3350 = false;
                                    if (var11.field3261 != null) {
                                        class288 var55 = new class288();
                                        var55.field4213 = true;
                                        var55.field4217 = var11;
                                        var55.field4220 = class223.field3295.method411(0) - var12;
                                        var55.field4222 = class223.field3295.method415(-93) - var13;
                                        var55.field4218 = var11.field3261;
                                        class409.field5883.method2484(0, var55);
                                    }
                                }
                                if (var11.field3257 != null) {
                                    class288 var56 = new class288();
                                    var56.field4217 = var11;
                                    var56.field4218 = var11.field3257;
                                    class22.field315.method2484(0, var56);
                                }
                                if (var11.field3312 != null && class164.field2172 > var11.field3264) {
                                    if (var11.field3292 == null || class164.field2172 - var11.field3264 > 32) {
                                        class288 var61 = new class288();
                                        var61.field4217 = var11;
                                        var61.field4218 = var11.field3312;
                                        class166.field2188.method2484(0, var61);
                                    } else {
                                        label672: for (int var57 = var11.field3264; var57 < class164.field2172; var57++) {
                                            int var58 = class169.field2213[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field3292.length; var59++) {
                                                if (var11.field3292[var59] == var58) {
                                                    class288 var60 = new class288();
                                                    var60.field4217 = var11;
                                                    var60.field4218 = var11.field3312;
                                                    class166.field2188.method2484(0, var60);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3264 = class164.field2172;
                                }
                                if (var11.field3329 != null && class188.field2631 > var11.field3203) {
                                    if (var11.field3347 == null || class188.field2631 - var11.field3203 > 32) {
                                        class288 var66 = new class288();
                                        var66.field4217 = var11;
                                        var66.field4218 = var11.field3329;
                                        class166.field2188.method2484(0, var66);
                                    } else {
                                        label648: for (int var62 = var11.field3203; var62 < class188.field2631; var62++) {
                                            int var63 = class72.field938[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field3347.length; var64++) {
                                                if (var11.field3347[var64] == var63) {
                                                    class288 var65 = new class288();
                                                    var65.field4217 = var11;
                                                    var65.field4218 = var11.field3329;
                                                    class166.field2188.method2484(0, var65);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3203 = class188.field2631;
                                }
                                if (var11.field3238 != null && class109.field1477 > var11.field3272) {
                                    if (var11.field3305 == null || class109.field1477 - var11.field3272 > 32) {
                                        class288 var71 = new class288();
                                        var71.field4217 = var11;
                                        var71.field4218 = var11.field3238;
                                        class166.field2188.method2484(0, var71);
                                    } else {
                                        label624: for (int var67 = var11.field3272; var67 < class109.field1477; var67++) {
                                            int var68 = class75.field959[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field3305.length; var69++) {
                                                if (var11.field3305[var69] == var68) {
                                                    class288 var70 = new class288();
                                                    var70.field4217 = var11;
                                                    var70.field4218 = var11.field3238;
                                                    class166.field2188.method2484(0, var70);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3272 = class109.field1477;
                                }
                                if (var11.field3285 != null && class429.field6231 > var11.field3359) {
                                    if (var11.field3366 == null || class429.field6231 - var11.field3359 > 32) {
                                        class288 var76 = new class288();
                                        var76.field4217 = var11;
                                        var76.field4218 = var11.field3285;
                                        class166.field2188.method2484(0, var76);
                                    } else {
                                        label600: for (int var72 = var11.field3359; var72 < class429.field6231; var72++) {
                                            int var73 = class259.field3837[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field3366.length; var74++) {
                                                if (var11.field3366[var74] == var73) {
                                                    class288 var75 = new class288();
                                                    var75.field4217 = var11;
                                                    var75.field4218 = var11.field3285;
                                                    class166.field2188.method2484(0, var75);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3359 = class429.field6231;
                                }
                                if (var11.field3279 != null && class295.field4303 > var11.field3294) {
                                    if (var11.field3269 == null || class295.field4303 - var11.field3294 > 32) {
                                        class288 var81 = new class288();
                                        var81.field4217 = var11;
                                        var81.field4218 = var11.field3279;
                                        class166.field2188.method2484(0, var81);
                                    } else {
                                        label576: for (int var77 = var11.field3294; var77 < class295.field4303; var77++) {
                                            int var78 = class444.field6469[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field3269.length; var79++) {
                                                if (var11.field3269[var79] == var78) {
                                                    class288 var80 = new class288();
                                                    var80.field4217 = var11;
                                                    var80.field4218 = var11.field3279;
                                                    class166.field2188.method2484(0, var80);
                                                    break label576;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3294 = class295.field4303;
                                }
                                if (class302.field4421 > var11.field3211 && var11.field3248 != null) {
                                    class288 var82 = new class288();
                                    var82.field4217 = var11;
                                    var82.field4218 = var11.field3248;
                                    class166.field2188.method2484(0, var82);
                                }
                                if (class34.field487 > var11.field3211 && var11.field3236 != null) {
                                    class288 var83 = new class288();
                                    var83.field4217 = var11;
                                    var83.field4218 = var11.field3236;
                                    class166.field2188.method2484(0, var83);
                                }
                                if (class230.field3444 > var11.field3211 && var11.field3215 != null) {
                                    class288 var84 = new class288();
                                    var84.field4217 = var11;
                                    var84.field4218 = var11.field3215;
                                    class166.field2188.method2484(0, var84);
                                }
                                if (class200.field2831 > var11.field3211 && var11.field3205 != null) {
                                    class288 var85 = new class288();
                                    var85.field4217 = var11;
                                    var85.field4218 = var11.field3205;
                                    class166.field2188.method2484(0, var85);
                                }
                                if (class131.field1789 > var11.field3211 && var11.field3302 != null) {
                                    class288 var86 = new class288();
                                    var86.field4217 = var11;
                                    var86.field4218 = var11.field3302;
                                    class166.field2188.method2484(0, var86);
                                }
                                var11.field3211 = class26.field384;
                                if (var11.field3227 != null) {
                                    for (int var87 = 0; var87 < class34.field480; var87++) {
                                        class288 var88 = new class288();
                                        var88.field4217 = var11;
                                        var88.field4215 = class33.field474[var87].method2459(-1);
                                        var88.field4226 = class33.field474[var87].method2456((byte) 49);
                                        var88.field4218 = var11.field3227;
                                        class166.field2188.method2484(0, var88);
                                    }
                                }
                                if (class339.field5005 && var11.field3348 != null) {
                                    class288 var89 = new class288();
                                    var89.field4217 = var11;
                                    var89.field4218 = var11.field3348;
                                    class166.field2188.method2484(0, var89);
                                }
                            }
                            if (var11.field3216 == 5 && var11.field3224 != -1) {
                                var11.method1527(true).method2193(var11.field3352, class74.field942, -1);
                            }
                            class119.method816(true, var11);
                            if (var11.field3216 == 0) {
                                method1812(arg0, var11.field3223, var14, var15, var16, var17, var12 - var11.field3214, var13 - var11.field3307, arg8, arg9);
                                if (var11.field3340 != null) {
                                    method1812(var11.field3340, var11.field3223, var14, var15, var16, var17, var12 - var11.field3214, var13 - var11.field3307, arg8, arg9);
                                }
                                class182 var90 = (class182) class252.field3703.method609((long) var11.field3223, 85);
                                if (var90 != null) {
                                    if (class92.field1139 == class408.field5869 && var90.field2562 == 0 && !class286.field4210 && var21 && !class159.field2133) {
                                        class423.method2608((byte) -81);
                                    }
                                    class25.method254(arg9, var13, arg8, var90.field2564, var14, var12, var15, (byte) 100, var16, var17);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class119.method816(true, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lkg;)Lkg;")
    public static final class223 method1813(class223 arg0) {
        int var1 = method1811(arg0).method2161(-75);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class432.method2655((byte) -121, arg0.field3319);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILkg;ILfp;ILtm;)V")
    public static final void method1814(int arg0, int arg1, int arg2, int arg3, class223 arg4, int arg5, class9 arg6, int arg7, class195 arg8) {
        field3894++;
        if (arg7 != 1) {
            return;
        }
        class110 var9 = class443.method2721(arg7 - 13, arg1);
        if (var9 == null || !var9.field1489 || !var9.method788((byte) -123)) {
            return;
        }
        if (var9.field1500 != null) {
            int[] var10 = new int[var9.field1500.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class28.field402 == 4) {
                    var13 = (int) class1.field19 & 0x3FFF;
                } else {
                    var13 = (int) class1.field19 + class303.field4429 & 0x3FFF;
                }
                int var14 = class327.field4863[var13];
                int var15 = class327.field4862[var13];
                if (class28.field402 != 4) {
                    var15 = var15 * 256 / (class30.field422 + 256);
                    var14 = var14 * 256 / (class30.field422 + 256);
                }
                var10[var11 * 2] = ((var9.field1500[var11 * 2] * 4 + arg0) * var15 + (var9.field1500[var11 * 2 + 1] * 4 + arg3) * var14 >> 15) + arg4.field3233 / 2 + arg5;
                var10[var11 * 2 + 1] = arg4.field3352 / 2 + arg2 - ((var9.field1500[var11 * 2 - -1] * 4 + arg3) * var15 + -((arg0 - -(var9.field1500[var11 * 2] * 4)) * var14) >> 15);
            }
            class300.method1992(arg6, var10, var9.field1492, arg4.field3342, arg4.field3232);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg6.method96(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 3], var9.field1523, 1, arg8, arg5, arg2);
            }
            arg6.method96(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field1523, 1, arg8, arg5, arg2);
        }
        class285 var16 = null;
        if (var9.field1502 != -1) {
            var16 = var9.method781(false, (byte) -59, arg6);
            if (var16 != null) {
                class411.method2549(-1, arg0, arg4, var16, arg3, arg8, arg5, arg2);
            }
        }
        if (var9.field1487 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method1862();
        }
        class85 var18 = class55.field675;
        class365 var19 = class119.field1603;
        if (var9.field1514 == 1) {
            var18 = class13.field215;
            var19 = class328.field4885;
        }
        if (var9.field1514 == 2) {
            var19 = class233.field3502;
            var18 = class111.field1540;
        }
        class327.method2145(arg4, arg8, -29309, var17, var9.field1525, arg5, arg3, var19, arg2, var9.field1487, arg0, var18);
        return;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)I")
    private static final int method1815(int arg0) {
        if (arg0 >= -82) {
            method1813((class223) null);
        }
        field3878++;
        return 16;
    }
}
