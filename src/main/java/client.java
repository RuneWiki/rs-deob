import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class42 {

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field463 = false;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lkc;")
    public static class67 field466 = class19.method144(":0", 123);

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lkc;")
    private static class67 field472 = class19.method144("wishes to trade with you)3", 99);

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Lkc;")
    public static class67 field473 = field472;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lkc;")
    private static class67 field452 = class19.method144("New User", 109);

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lkc;")
    public static class67 field471 = class19.method144("huffman", 74);

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Lkc;")
    private static class67 field477 = class19.method144("Enter amount:", 109);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lkc;")
    public static class67 field456 = field452;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lkc;")
    public static class67 field482 = class19.method144("blinken2:", 79);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lkc;")
    public static class67 field470 = field477;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lq;")
    public static class100 field480;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lta;")
    public static class119 field461;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lab;")
    public static class3 field464;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
    public static boolean field483;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[B")
    public static byte[] field465;

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 12)
    public final void method165(int arg0) {
        class32.field692 = class129.field3014 == 0 ? 443 : class77.field1840 + 50000;
        class100.field2240 = class129.field3014 == 0 ? 43594 : class77.field1840 + 40000;
        field459++;
        class141.field3404 = class100.field2240;
        class127.method987((byte) -86);
        class128.method991(class129.field3020, false);
        class135.method1043(class129.field3020, -95);
        class141.field3407 = class91.method717(-128);
        if (class141.field3407 != null) {
            class141.field3407.method138(class129.field3020, -105);
        }
        class60.field1432 = class15.field317;
        try {
            if (class83.field1966.field334 != null) {
                class125.field2911 = new class90(class83.field1966.field334, 5200, 0);
                for (int var2 = 0; var2 < 14; var2++) {
                    class5.field115[var2] = new class90(class83.field1966.field326[var2], 6000, 0);
                }
                class67.field1622 = new class90(class83.field1966.field319, 6000, 0);
                class125.field2924 = new class14(255, class125.field2911, class67.field1622, 500000);
                class83.field1966.field319 = null;
                class83.field1966.field334 = null;
                class83.field1966.field326 = null;
            }
        } catch (IOException var3) {
            class125.field2924 = null;
            class67.field1622 = null;
            class125.field2911 = null;
        }
        if (~class129.field3014 != arg0) {
            class69.field1655 = true;
        }
        class101.field2281 = new class33();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lec;", line = 71)
    public static final class32 method166(Throwable arg0, String arg1) {
        class32 var2;
        if (arg0 instanceof class32) {
            var2 = (class32) arg0;
            var2.field676 = var2.field676 + ' ' + arg1;
        } else {
            var2 = new class32(arg0, arg1);
        }
        field478++;
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 89)
    public final void method167(byte arg0) {
        field479++;
        class135.field3243++;
        this.method175(-105);
        class61.method478((byte) -126);
        class135.method1050(8896);
        class54.method435(false);
        int var2 = 14 / ((-arg0 - 43) / 33);
        class74.method599(-121);
        class60.method473((byte) -83);
        if (class141.field3407 != null) {
            int var3 = class141.field3407.method139((byte) 36);
            class1.field8 = var3;
            class133.field3171 += var3;
        }
        if (class30.field638 == 0) {
            class130.method1003((byte) 120);
            class114.method913(26406);
        } else if (class30.field638 == 5) {
            class130.method1003((byte) 120);
            class114.method913(26406);
        } else if (class30.field638 == 10) {
            class126.method983(-2);
        } else if (class30.field638 == 20) {
            class126.method983(-2);
            class76.method616((byte) -106);
        } else if (class30.field638 == 25) {
            class44.method372((byte) 124);
        }
        if (class30.field638 == 30) {
            class75.method608(true);
        } else if (class30.field638 == 35) {
            class75.method608(true);
        } else if (class30.field638 == 40) {
            class76.method616((byte) -109);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)[Lnd;", line = 178)
    public static final class86[] method168(byte arg0) {
        field468++;
        class86[] var1 = new class86[class97.field2207];
        if (arg0 < 37) {
            field464 = null;
        }
        for (int var2 = 0; var2 < class97.field2207; var2++) {
            class86 var3 = var1[var2] = new class86();
            var3.field2018 = class116.field2735;
            var3.field2019 = class12.field266;
            var3.field2016 = class34.field829[var2];
            var3.field2013 = class80.field1906[var2];
            var3.field2017 = class112.field2596[var2];
            var3.field2014 = class46.field1121[var2];
            byte[] var4 = class54.field1310[var2];
            int var5 = var3.field2017 * var3.field2014;
            var3.field2015 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field2015[var6] = class55.field1345[class90.method693(255, var4[var6])];
            }
        }
        class50.method411((byte) 39);
        return var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 226)
    public final void method169(int arg0) {
        field455++;
        if (class32.field690) {
            class84.method651(class129.field3020, false);
            class119.method938((byte) 27, class129.field3020);
            if (class141.field3407 != null) {
                class141.field3407.method137((byte) 14, class129.field3020);
            }
            this.method360(arg0);
            class128.method991(class129.field3020, false);
            class135.method1043(class129.field3020, arg0 ^ 0xFFFFFF87);
            if (class141.field3407 != null) {
                class141.field3407.method138(class129.field3020, arg0 ^ 0xFFFFFF8C);
            }
        }
        if (class30.field638 == 0) {
            class111.method842(class20.field401, null, arg0 + 304, class71.field1687);
        } else if (class30.field638 == 5) {
            class91.method719(class32.field687, arg0 ^ 0xFFFFC3C4, class117.field2789);
        } else if (class30.field638 == 10) {
            class91.method719(class32.field687, -15420, class117.field2789);
        } else if (class30.field638 == 20) {
            class91.method719(class32.field687, arg0 ^ 0xFFFFC3C4, class117.field2789);
        } else if (class30.field638 == 25) {
            if (class133.field3189 == 1) {
                if (class61.field1448 > class52.field1278) {
                    class52.field1278 = class61.field1448;
                }
                int var2 = (class52.field1278 - class61.field1448) * 50 / class52.field1278;
                class108.method827(true, class63.method479(new class67[] { class45.field1092, class71.method586(103, var2), class85.field2009 }, arg0), class19.field373, -8038);
            } else if (class133.field3189 == 2) {
                if (class127.field2981 < class122.field2877) {
                    class127.field2981 = class122.field2877;
                }
                int var3 = (class127.field2981 - class122.field2877) * 50 / class127.field2981 + 50;
                class108.method827(true, class63.method479(new class67[] { class45.field1092, class71.method586(103, var3), class85.field2009 }, 0), class19.field373, -8038);
            } else {
                class108.method827(false, null, class19.field373, -8038);
            }
        } else if (class30.field638 == 30) {
            class96.method748(arg0 - 3);
        } else if (class30.field638 == 35) {
            class91.method723(123);
        } else if (class30.field638 == 40) {
            class108.method827(false, class115.field2723, class77.field1833, -8038);
        }
        class24.field512 = 0;
        class133.field3171 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 313)
    public static final void main(String[] arg0) {
        field474++;
        try {
            if (arg0.length != 6) {
                class65.method506((byte) 26);
            }
            class77.field1840 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class129.field3014 = 0;
            } else if (arg0[1].equals("office")) {
                class129.field3014 = 1;
            } else if (arg0[1].equals("local")) {
                class129.field3014 = 2;
            } else {
                class65.method506((byte) 26);
            }
            if (arg0[2].equals("live")) {
                class75.field1799 = 0;
            } else if (arg0[2].equals("rc")) {
                class75.field1799 = 1;
            } else if (arg0[2].equals("wip")) {
                class75.field1799 = 2;
            } else {
                class65.method506((byte) 26);
            }
            if (arg0[3].equals("lowmem")) {
                class69.method572(0);
            } else if (arg0[3].equals("highmem")) {
                class42.method368(-112);
            } else {
                class65.method506((byte) 26);
            }
            if (arg0[4].equals("free")) {
                class42.field1043 = false;
            } else if (arg0[4].equals("members")) {
                class42.field1043 = true;
            } else {
                class65.method506((byte) 26);
            }
            if (arg0[5].equals("english")) {
                class122.field2867 = 0;
            } else if (arg0[5].equals("german")) {
                class21.method164((byte) -118);
                class122.field2867 = 1;
            } else {
                class65.method506((byte) 26);
            }
            client var1 = new client();
            var1.method359(false, "runescape", class75.field1799 + 32, 503, 445, 14, InetAddress.getLocalHost(), 765);
        } catch (Exception var3) {
            class109.method832(111, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 393)
    private final void method170(int arg0) {
        field481++;
        if (class102.field2292 >= 4) {
            this.method366("js5crc", (byte) -70);
            class30.field638 = 1000;
            return;
        }
        if (class29.field618 >= 4) {
            if (class30.field638 <= 5) {
                this.method366("js5io", (byte) -82);
                class30.field638 = 1000;
                return;
            }
            class77.field1825 = 3000;
            class29.field618 = 3;
        }
        if (class77.field1825-- > 0) {
            return;
        }
        try {
            if (class108.field2453 == 0) {
                class116.field2728 = class83.field1966.method135(class141.field3404, 0);
                class108.field2453++;
            }
            if (class108.field2453 == 1) {
                if (class116.field2728.field1464 == 2) {
                    this.method174(true, -1);
                    return;
                }
                if (class116.field2728.field1464 == 1) {
                    class108.field2453++;
                }
            }
            if (class108.field2453 == 2) {
                class133.field3181 = new class97((Socket) class116.field2728.field1467, class83.field1966);
                class140 var2 = new class140(5);
                var2.method1115((byte) 49, 15);
                var2.method1100(445, (byte) -46);
                class133.field3181.method754(5, 32741, 0, var2.field3325);
                class108.field2453++;
                class81.field1943 = class82.method644(0);
            }
            if (class108.field2453 == 3) {
                if (class30.field638 <= 5 || class133.field3181.method752((byte) -115) > 0) {
                    int var3 = class133.field3181.method756((byte) -112);
                    if (var3 != 0) {
                        this.method174(true, var3);
                        return;
                    }
                    class108.field2453++;
                } else if (class82.method644(0) - class81.field1943 > 30000L) {
                    this.method174(true, -2);
                    return;
                }
            }
            if (class108.field2453 == 4) {
                class103.method788(class133.field3181, (byte) -127, class30.field638 > 20);
                class133.field3181 = null;
                class116.field2728 = null;
                class7.field146 = 0;
                class108.field2453 = 0;
            }
            if (arg0 <= 39) {
                this.init();
            }
        } catch (IOException var4) {
            this.method174(true, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 526)
    public final void method171(byte arg0) {
        field467++;
        if (class70.field1666 != null) {
            class70.field1666.field2546 = false;
        }
        class70.field1666 = null;
        if (class71.field1679 != null) {
            class71.field1679.method751(arg0 ^ 0xFFFFFF9A);
            class71.field1679 = null;
        }
        class46.method389(1385);
        class32.method271(true);
        class141.field3407 = null;
        class135.method1044(28587);
        class91.method721((byte) 51);
        class90.method707(-1);
        class30.method260((byte) 118);
        try {
            if (class125.field2911 != null) {
                class125.field2911.method698(arg0 ^ 0x60);
            }
            if (class5.field115 != null) {
                for (int var2 = 0; var2 < class5.field115.length; var2++) {
                    if (class5.field115[var2] != null) {
                        class5.field115[var2].method698(4);
                    }
                }
            }
            if (class67.field1622 != null) {
                class67.field1622.method698(4);
            }
            if (arg0 != 100) {
                field458 = 15;
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 600)
    public static void method172(int arg0) {
        field482 = null;
        field470 = null;
        field477 = null;
        field461 = null;
        field471 = null;
        field466 = null;
        field465 = null;
        field473 = null;
        field452 = null;
        field480 = null;
        field456 = null;
        if (arg0 <= 107) {
            method172(45);
        }
        field472 = null;
        field464 = null;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 672)
    public static final void method173(int arg0) {
        field469++;
        if (class12.field280 == 78) {
            int var1 = class112.field2558.method1105(255);
            int var2 = (var1 >> 4 & 0x7) + class125.field2926;
            int var3 = (var1 & 0x7) + class5.field110;
            int var4 = class112.field2558.method1072(72);
            int var5 = class112.field2558.method1072(17);
            int var6 = class112.field2558.method1072(80);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class10 var7 = class4.field67[class112.field2593][var2][var3];
                if (var7 != null) {
                    for (class85 var8 = (class85) var7.method83(64); var8 != null; var8 = (class85) var7.method81(-106)) {
                        if ((var4 & 0x7FFF) == var8.field1998 && var8.field2008 == var5) {
                            var8.field2008 = var6;
                            break;
                        }
                    }
                    class82.method642(var3, 2028745255, var2);
                }
            }
        } else if (class12.field280 == 3) {
            int var9 = class112.field2558.method1107(-21560);
            int var10 = class112.field2558.method1097(false);
            int var11 = class125.field2926 + (var10 >> 4 & 0x7);
            int var12 = (var10 & 0x7) + class5.field110;
            int var13 = class112.field2558.method1107(-21560);
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                class85 var14 = new class85();
                var14.field1998 = var9;
                var14.field2008 = var13;
                if (class4.field67[class112.field2593][var11][var12] == null) {
                    class4.field67[class112.field2593][var11][var12] = new class10();
                }
                class4.field67[class112.field2593][var11][var12].method95((byte) 71, var14);
                class82.method642(var12, 2028745255, var11);
            }
        } else if (class12.field280 == 114) {
            int var15 = class112.field2558.method1105(255);
            int var16 = (var15 >> 4 & 0x7) + class125.field2926;
            int var17 = (var15 & 0x7) + class5.field110;
            int var18 = class112.field2558.method1107(-21560);
            int var19 = class112.field2558.method1097(false);
            int var20 = var19 >> 2;
            int var21 = var19 & 0x3;
            int var22 = class54.field1300[var20];
            if (var16 >= 0 && var17 >= 0 && var16 < 103 && var17 < 103) {
                int var23 = class34.field823[class112.field2593][var16][var17];
                int var24 = class34.field823[class112.field2593][var16 + 1][var17];
                int var25 = class34.field823[class112.field2593][var16 + 1][var17 + 1];
                int var26 = class34.field823[class112.field2593][var16][var17 + 1];
                if (var22 == 0) {
                    class64 var27 = class103.field2332.method904(class112.field2593, var16, var17);
                    if (var27 != null) {
                        int var28 = var27.field1508 >> 14 & 0x7FFF;
                        if (var20 == 2) {
                            var27.field1520 = new class134(var28, 2, var21 + 4, var23, var24, var25, var26, var18, false, var27.field1520);
                            var27.field1506 = new class134(var28, 2, var21 + 1 & 0x3, var23, var24, var25, var26, var18, false, var27.field1506);
                        } else {
                            var27.field1520 = new class134(var28, var20, var21, var23, var24, var25, var26, var18, false, var27.field1520);
                        }
                    }
                }
                if (var22 == 1) {
                    class25 var29 = class103.field2332.method880(class112.field2593, var16, var17);
                    if (var29 != null) {
                        var29.field529 = new class134(var29.field526 >> 14 & 0x7FFF, 4, 0, var23, var24, var25, var26, var18, false, var29.field529);
                    }
                }
                if (var22 == 2) {
                    if (var20 == 11) {
                        var20 = 10;
                    }
                    class7 var30 = class103.field2332.method885(class112.field2593, var16, var17);
                    if (var30 != null) {
                        var30.field164 = new class134(var30.field159 >> 14 & 0x7FFF, var20, var21, var23, var24, var25, var26, var18, false, var30.field164);
                    }
                }
                if (var22 == 3) {
                    class109 var31 = class103.field2332.method902(class112.field2593, var16, var17);
                    if (var31 != null) {
                        var31.field2465 = new class134(var31.field2464 >> 14 & 0x7FFF, 22, var21, var23, var24, var25, var26, var18, false, var31.field2465);
                    }
                }
            }
        } else if (class12.field280 == 36) {
            int var32 = class112.field2558.method1105(255);
            int var33 = (var32 >> 4 & 0x7) + class125.field2926;
            int var34 = (var32 & 0x7) + class5.field110;
            int var35 = class112.field2558.method1072(28);
            int var36 = class112.field2558.method1105(255);
            int var37 = class112.field2558.method1072(101);
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                int var38 = var33 * 128 + 64;
                int var39 = var34 * 128 + 64;
                class115 var40 = new class115(var35, class112.field2593, var38, var39, class70.method575(var39, 1, var38, class112.field2593) - var36, var37, class135.field3243);
                class88.field2026.method95((byte) 116, var40);
            }
        } else if (class12.field280 == 234) {
            int var41 = class112.field2558.method1094(10);
            int var42 = (var41 >> 4 & 0x7) + class125.field2926;
            int var43 = (var41 & 0x7) + class5.field110;
            int var44 = class112.field2558.method1107(-21560);
            int var45 = class112.field2558.method1072(68);
            int var46 = class112.field2558.method1107(-21560);
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104 && class22.field485 != var46) {
                class85 var47 = new class85();
                var47.field2008 = var45;
                var47.field1998 = var44;
                if (class4.field67[class112.field2593][var42][var43] == null) {
                    class4.field67[class112.field2593][var42][var43] = new class10();
                }
                class4.field67[class112.field2593][var42][var43].method95((byte) 76, var47);
                class82.method642(var43, 2028745255, var42);
            }
        } else {
            int var48 = 46 / ((18 - arg0) / 55);
            if (class12.field280 == 88) {
                int var49 = class112.field2558.method1097(false);
                int var50 = var49 >> 2;
                int var51 = var49 & 0x3;
                int var52 = class54.field1300[var50];
                int var53 = class112.field2558.method1088(1809908424);
                int var54 = class5.field110 + (var53 & 0x7);
                int var55 = class125.field2926 + (var53 >> 4 & 0x7);
                if (var55 >= 0 && var54 >= 0 && var55 < 104 && var54 < 104) {
                    class85.method655(var52, class112.field2593, 466, -1, var54, -1, var55, var51, 0, var50);
                }
            } else if (class12.field280 == 29) {
                int var56 = class112.field2558.method1097(false);
                int var57 = var56 & 0x3;
                int var58 = var56 >> 2;
                int var59 = class54.field1300[var58];
                int var60 = class112.field2558.method1105(255);
                int var61 = (var60 & 0x7) + class5.field110;
                int var62 = (var60 >> 4 & 0x7) + class125.field2926;
                int var63 = class112.field2558.method1084(72);
                if (var62 >= 0 && var61 >= 0 && var62 < 104 && var61 < 104) {
                    class85.method655(var59, class112.field2593, 466, var63, var61, -1, var62, var57, 0, var58);
                }
            } else if (class12.field280 == 19) {
                int var64 = class112.field2558.method1084(97);
                int var65 = class112.field2558.method1105(255);
                int var66 = (var65 >> 4 & 0x7) + class125.field2926;
                int var67 = class5.field110 + (var65 & 0x7);
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    class10 var68 = class4.field67[class112.field2593][var66][var67];
                    if (var68 != null) {
                        for (class85 var69 = (class85) var68.method83(64); var69 != null; var69 = (class85) var68.method81(-48)) {
                            if ((var64 & 0x7FFF) == var69.field1998) {
                                var69.method13(61);
                                break;
                            }
                        }
                        if (var68.method83(64) == null) {
                            class4.field67[class112.field2593][var66][var67] = null;
                        }
                        class82.method642(var67, 2028745255, var66);
                    }
                }
            } else if (class12.field280 == 27) {
                int var70 = class112.field2558.method1105(255);
                int var71 = (var70 >> 4 & 0x7) + class125.field2926;
                int var72 = (var70 & 0x7) + class5.field110;
                int var73 = var71 + class112.field2558.method1112((byte) 125);
                int var74 = var72 + class112.field2558.method1112((byte) 124);
                int var75 = class112.field2558.method1091((byte) -122);
                int var76 = class112.field2558.method1072(126);
                int var77 = class112.field2558.method1105(255) * 4;
                int var78 = class112.field2558.method1105(255) * 4;
                int var79 = class112.field2558.method1072(57);
                int var80 = class112.field2558.method1072(81);
                int var81 = class112.field2558.method1105(255);
                int var82 = class112.field2558.method1105(255);
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104 && var76 != 65535) {
                    int var83 = var71 * 128 + 64;
                    int var84 = var73 * 128 + 64;
                    int var85 = var72 * 128 + 64;
                    int var86 = var74 * 128 + 64;
                    class122 var87 = new class122(var76, class112.field2593, var83, var85, class70.method575(var85, 1, var83, class112.field2593) - var77, class135.field3243 + var79, var80 + class135.field3243, var81, var82, var75, var78);
                    var87.method954(class135.field3243 + var79, 1, class70.method575(var86, 1, var84, class112.field2593) - var78, var84, var86);
                    class74.field1769.method95((byte) 62, var87);
                }
            } else {
                if (class12.field280 == 13) {
                    int var88 = class112.field2558.method1105(255);
                    int var89 = (var88 >> 4 & 0x7) + class125.field2926;
                    int var90 = (var88 & 0x7) + class5.field110;
                    int var91 = class112.field2558.method1084(119);
                    byte var92 = class112.field2558.method1093(-128);
                    int var93 = class112.field2558.method1088(1809908424);
                    int var94 = var93 >> 2;
                    int var95 = var93 & 0x3;
                    int var96 = class54.field1300[var94];
                    byte var97 = class112.field2558.method1112((byte) 123);
                    byte var98 = class112.field2558.method1112((byte) 123);
                    byte var99 = class112.field2558.method1106((byte) 125);
                    int var100 = class112.field2558.method1119(-16894);
                    int var101 = class112.field2558.method1084(75);
                    int var102 = class112.field2558.method1107(-21560);
                    class103 var103;
                    if (class22.field485 == var102) {
                        var103 = class69.field1640;
                    } else {
                        var103 = class44.field1067[var102];
                    }
                    if (var103 != null) {
                        class106 var104 = class2.method12(var100, 21876);
                        int var105 = class34.field823[class112.field2593][var89][var90];
                        int var106 = class34.field823[class112.field2593][var89 + 1][var90];
                        int var107 = class34.field823[class112.field2593][var89][var90 + 1];
                        int var108 = class34.field823[class112.field2593][var89 + 1][var90 + 1];
                        class39 var109 = var104.method813(true, var108, var95, var106, var105, var94, var107);
                        if (var109 != null) {
                            class85.method655(var96, class112.field2593, 466, -1, var90, var91 + 1, var89, 0, var101 + 1, 0);
                            var103.field2313 = class135.field3243 + var101;
                            var103.field2325 = class135.field3243 + var91;
                            var103.field2310 = var109;
                            int var110 = var104.field2432;
                            int var111 = var104.field2369;
                            if (var98 > var92) {
                                byte var112 = var98;
                                var98 = var92;
                                var92 = var112;
                            }
                            if (var95 == 1 || var95 == 3) {
                                var111 = var104.field2432;
                                var110 = var104.field2369;
                            }
                            if (var97 < var99) {
                                byte var113 = var99;
                                var99 = var97;
                                var97 = var113;
                            }
                            var103.field2333 = var89 * 128 + var110 * 64;
                            var103.field2316 = var90 * 128 + var111 * 64;
                            var103.field2322 = class70.method575(var103.field2316, 1, var103.field2333, class112.field2593);
                            var103.field2327 = var89 + var92;
                            var103.field2336 = var90 + var99;
                            var103.field2308 = var89 + var98;
                            var103.field2306 = var90 + var97;
                        }
                    }
                }
                if (class12.field280 == 98) {
                    int var114 = class112.field2558.method1105(255);
                    int var115 = (var114 & 0x7) + class5.field110;
                    int var116 = (var114 >> 4 & 0x7) + class125.field2926;
                    int var117 = class112.field2558.method1072(73);
                    int var118 = class112.field2558.method1105(255);
                    int var119 = var118 & 0x7;
                    int var120 = var118 >> 4 & 0xF;
                    int var121 = class112.field2558.method1105(255);
                    if (var116 >= 0 && var115 >= 0 && var116 < 104 && var115 < 104) {
                        int var122 = var120 + 1;
                        if (var116 - var122 <= class69.field1640.field1198[0] && class69.field1640.field1198[0] <= var116 + var122 && class69.field1640.field1263[0] >= var115 - var122 && var115 + var122 >= class69.field1640.field1263[0] && class54.field1298 != 0 && var119 > 0 && class138.field3303 < 50) {
                            class133.field3167[class138.field3303] = var117;
                            class98.field2215[class138.field3303] = var119;
                            class91.field2116[class138.field3303] = var121;
                            class122.field2874[class138.field3303] = null;
                            class74.field1773[class138.field3303] = (var116 << 16) - (-(var115 << 8) - var120);
                            class138.field3303++;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V", line = 1210)
    private final void method174(boolean arg0, int arg1) {
        field453++;
        class116.field2728 = null;
        class7.field146++;
        if (class141.field3404 == class100.field2240) {
            class141.field3404 = class32.field692;
        } else {
            class141.field3404 = class100.field2240;
        }
        class108.field2453 = 0;
        class133.field3181 = null;
        if (!arg0) {
            return;
        }
        if (class7.field146 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class30.field638 > 5) {
                class77.field1825 = 3000;
            } else {
                this.method366("js5connect_full", (byte) -93);
                class30.field638 = 1000;
            }
        } else if (class7.field146 >= 2 && arg1 == 6) {
            this.method366("js5connect_outofdate", (byte) -88);
            class30.field638 = 1000;
        } else if (class7.field146 >= 4) {
            if (class30.field638 <= 5) {
                this.method366("js5connect", (byte) -120);
                class30.field638 = 1000;
            } else {
                class77.field1825 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1264)
    private final void method175(int arg0) {
        field476++;
        if (class30.field638 != 1000) {
            boolean var2 = class59.method463((byte) 6);
            if (arg0 < -84 && !var2) {
                this.method170(62);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1301)
    public final void method176(byte arg0) {
        field457++;
        method172(111);
        class67.method541(84);
        class42.method370(true);
        class69.method571(false);
        class119.method941((byte) 19);
        class111.method839(arg0 ^ 0xFFFFFFFE);
        class140.method1121(-1529222632);
        class97.method755(arg0 ^ 0x4F);
        class63.method481(-1);
        class90.method706(-16777216);
        class14.method118(true);
        class66.method511((byte) -116);
        class91.method720(0);
        class28.method249();
        class113.method866();
        class5.method55(arg0 + 35);
        class103.method790(-20979);
        class10.method91(arg0 ^ 0xFFFFFFCB);
        class33.method284(false);
        class18.method142(74);
        class59.method466(arg0 ^ 0x3A8);
        class100.method770(false);
        class133.method1031(arg0 ^ 0x44D);
        class50.method413(15327);
        class54.method433(-10000001);
        class73.method598((byte) 92);
        class2.method11(94);
        class58.method454((byte) -111);
        class104.method791(-31);
        class44.method376(arg0 ^ 0x42);
        class112.method844(arg0 - 70);
        class39.method343();
        class70.method577(0);
        class32.method274(54);
        class98.method758(-50);
        class137.method1062(99);
        class7.method69(arg0 ^ 0x4F);
        class132.method1018(arg0 - 79);
        class24.method185(0);
        class64.method493(-12029);
        class25.method194((byte) 19);
        class109.method830((byte) 116);
        class121.method948((byte) 74);
        class40.method348();
        class12.method105(57);
        class60.method471(32002);
        class82.method643(-19);
        class19.method145((byte) -106);
        class4.method28(22171);
        class77.method620(arg0 ^ 0x4F);
        class135.method1046((byte) 123);
        class138.method1068(0);
        class108.method824(86);
        class71.method582((byte) -125);
        class52.method427(true);
        class1.method1(true);
        class11.method100(arg0 ^ 0xFFFFFF81);
        class88.method688(-27768);
        class105.method804();
        class68.method558();
        class94.method741(-26771);
        class99.method761((byte) 127);
        class83.method646(-78);
        class41.method353(-1);
        class114.method911(-1);
        class31.method267((byte) 88);
        class106.method812(arg0 + 40);
        class131.method1009((byte) 34);
        class9.method79((byte) -125);
        class81.method636(true);
        class74.method605(701);
        class116.method925(0);
        class117.method932(false);
        class89.method690();
        if (arg0 != 79) {
            return;
        }
        class30.method255(15741);
        class78.method626(arg0 - 187);
        class48.method397(1);
        class20.method155((byte) 86);
        class102.method781(arg0 ^ 0xFFFFFFBB);
        class55.method439((byte) -6);
        class130.method1004((byte) -46);
        class125.method977((byte) 47);
        class141.method1123(117);
        class47.method392();
        class101.method778(-126);
        class122.method953(-1);
        class115.method920((byte) 117);
        class22.method178(-20508);
        class61.method475(-1);
        class46.method390(-22039);
        class85.method656(arg0 ^ 0xFFFFDC33);
        class134.method1038(arg0 - 21735);
        class29.method250(-1);
        class96.method746(-115);
        class126.method979((byte) 94);
        class128.method992((byte) -82);
        class21.method163(447);
        class75.method611(arg0 - 78);
        class6.method62();
        class76.method614((byte) 15);
        class139.method1071();
        class45.method382(102);
        class92.method729();
        class80.method635(true);
        class38.method313((byte) 118);
        class127.method988((byte) 120);
        class34.method292((byte) 126);
        class35.method298();
        class87.method684();
        class49.method409(-2267);
        class84.method652((byte) 99);
        class93.method734(true);
        class65.method509((byte) -116);
        class123.method958();
        class129.method999(0);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1464)
    public final void init() {
        field475++;
        if (!this.method363((byte) -3)) {
            return;
        }
        class77.field1840 = Integer.parseInt(this.getParameter("worldid"));
        class75.field1799 = Integer.parseInt(this.getParameter("modewhat"));
        class129.field3014 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class69.method572(0);
        } else {
            class42.method368(-84);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class42.field1043 = true;
        } else {
            class42.field1043 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class21.method164((byte) -104);
            class122.field2867 = 1;
        }
        this.method358(class75.field1799 + 32, 503, -107, 765, 445);
    }
}
