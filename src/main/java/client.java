import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class46 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lec;")
    public static class28 field393 = class28.method210(-46, "(U2");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static volatile int field394 = 0;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field392 = 0;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lpa;")
    public static class91 field386 = new class91(30);

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lec;")
    public static class28 field397 = class28.method210(-46, "Contact Details Last Set:*6n@gre@");

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lec;")
    public static class28 field398 = class28.method210(-46, "Could not complete login)3");

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lec;")
    public static class28 field401 = class28.method210(-46, " (Xlevel)2");

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lec;")
    public static class28 field400 = class28.method210(-46, " x ");

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[B")
    public static byte[] field396 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lec;")
    public static class28 field402 = class28.method210(-46, " x");

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lec;")
    public static class28 field403 = class28.method210(-46, "*6n*6nYou have @gre@");

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lvb;")
    public static class122 field404;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lbb;")
    public static class9 field380;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
    public static boolean field405;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method113(byte arg0) {
        if (arg0 <= 61) {
            field398 = null;
        }
        field374++;
        if (class45.field999 != null) {
            class45.field999.field208 = false;
        }
        class45.field999 = null;
        if (class106.field2239 != null) {
            class106.field2239.method104(true);
        }
        class27.method196((byte) 119);
        class57.method459(-35);
        class66.method531(-2);
        class74.method578(123);
        if (class93.field2057 != null) {
            class93.field2057.method400(1);
        }
        class124.method959((byte) 59);
        try {
            if (class13.field236 != null) {
                class13.field236.method689((byte) 79);
            }
            if (class4.field74 != null) {
                for (int var2 = 0; var2 < class4.field74.length; var2++) {
                    if (class4.field74[var2] != null) {
                        class4.field74[var2].method689((byte) 112);
                    }
                }
            }
            if (class109.field2283 != null) {
                class109.field2283.method689((byte) 78);
            }
            if (class56.field1293 != null) {
                for (int var3 = 0; var3 < class56.field1293.length; var3++) {
                    if (class56.field1293[var3] != null) {
                        class56.field1293[var3].method689((byte) 99);
                    }
                }
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method114(int arg0) {
        if (arg0 != 502) {
            return;
        }
        field378++;
        if (class80.field1848-- > 0) {
            return;
        }
        try {
            if (class40.field862 == 0) {
                class93.field2054 = class30.field652.method628(class70.field1566, (byte) -95);
                class40.field862++;
            }
            if (class40.field862 == 1) {
                if (class93.field2054.field2157 == 2) {
                    this.method126(arg0 - 382, -1);
                    return;
                }
                if (class93.field2054.field2157 == 1) {
                    class40.field862++;
                }
            }
            if (class40.field862 == 2) {
                class34.field768 = new class18((Socket) class93.field2054.field2154, class30.field652);
                byte[] var2 = new byte[] { 15 };
                class34.field768.method110(var2, 0, (byte) -91, 1);
                class40.field862++;
                class74.field1639 = System.currentTimeMillis();
            }
            if (class40.field862 == 3) {
                if (class114.field2444 <= 5 || class34.field768.method106(-1) > 0) {
                    int var3 = class34.field768.method101(true);
                    if (var3 != 0) {
                        this.method126(arg0 - 377, var3);
                        return;
                    }
                    class40.field862++;
                } else if (System.currentTimeMillis() - class74.field1639 > 30000L) {
                    this.method126(arg0 ^ 0x19C, -2);
                    return;
                }
            }
            if (class40.field862 == 4) {
                class93.field2057.method399(class114.field2444 > 20, class34.field768, (byte) -113);
                class34.field768 = null;
                class40.field862 = 0;
                class93.field2054 = null;
                class86.field1916 = 0;
            }
        } catch (IOException var4) {
            this.method126(118, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method115(int arg0) {
        method122(81);
        class28.method217((byte) -68);
        class46.method370((byte) 113);
        class1.method1((byte) 88);
        field395++;
        class31.method249((byte) -122);
        class16.method90(84);
        class14.method81(true);
        class12.method64(false);
        class119.method858((byte) -93);
        class49.method395((byte) 125);
        class18.method103((byte) 34);
        class9.method50(-21694);
        class96.method695(arg0 + 21199);
        class63.method505(arg0 + 21200);
        class90.method657(-1);
        class22.method160((byte) 0);
        class54.method445();
        class111.method799();
        class117.method833(0);
        class43.method342(-103);
        class42.method336(27025);
        class78.method598(false);
        class114.method826((byte) -49);
        class112.method819((byte) -110);
        class65.method522((byte) -83);
        class109.method750((byte) -80);
        class106.method730(arg0 + 21292);
        class70.method550(true);
        class40.method316((byte) -119);
        class77.method586(-1991516592);
        class127.method968((byte) 125);
        class72.method568(-116);
        class122.method928((byte) 120);
        class91.method663(102);
        class13.method78((byte) 78);
        class33.method280();
        class93.method673(arg0 ^ 0xFFFFAD50);
        class36.method300((byte) 127);
        class15.method85((byte) 57);
        class95.method686(false);
        class87.method647(false);
        class48.method389((byte) -51);
        class8.method43(86);
        class79.method599(arg0 + 49035);
        class62.method501(true);
        class115.method827();
        class110.method751(arg0 ^ 0xFFFFA1F6);
        class5.method26((byte) -29);
        class66.method536((byte) -118);
        class88.method650((byte) -54);
        class50.method403(-110);
        class20.method133(0);
        class126.method965((byte) 116);
        class68.method538(-122);
        class125.method964((byte) -95);
        class60.method484();
        class120.method907();
        class94.method674(-1489);
        class80.method604(0);
        class74.method575(-11);
        class53.method429(-124);
        class7.method39(true);
        class21.method150(-87);
        class45.method350((byte) -56);
        class129.method980(421);
        class98.method701((byte) 117);
        class123.method950((byte) 74);
        class51.method415((byte) -113);
        if (arg0 != -21200) {
            field402 = null;
        }
        class30.method245(99);
        class3.method12(24976);
        class121.method922();
        class23.method165((byte) 96);
        class118.method849((byte) 31);
        class103.method725(true);
        class64.method512((byte) -110);
        class19.method127();
        class55.method452(-66);
        class47.method378(123);
        class56.method455(0);
        class2.method6(arg0 + 21199);
        class34.method291((byte) -121);
        class86.method641((byte) -24);
        class4.method23(22984);
        class17.method98(15293);
        class69.method543(true);
        class92.method669(-102);
        class76.method584(arg0 - 4494);
        class61.method498(-117);
        class102.method721();
        class57.method458(255);
        class108.method741();
        class75.method579((byte) 63);
        class73.method573();
        class37.method309((byte) 68);
        class27.method194(arg0 + 21146);
        class32.method253((byte) -104);
        class71.method556();
        class113.method822();
        class105.method728(arg0 ^ 0xFFFFAD30);
        class11.method58(0);
        class83.method631(0);
        class124.method954((byte) 59);
        class58.method463();
        class25.method173(false);
        if (class46.field1054) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public static final void method116(boolean arg0) {
        class18.field367.method659(1000);
        class50.field1171.method659(1000);
        field390++;
        if (!arg0) {
            class61.field1353.method659(1000);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method117(int arg0) {
        if (class114.field2444 == 0) {
            class87.method644(class93.field2055, class68.field1530, 27429, null);
        } else if (class114.field2444 == 5) {
            class27.method202(class117.field2493, class126.field2737, class124.field2700, (byte) -30);
        } else if (class114.field2444 == 10) {
            class27.method202(class117.field2493, class126.field2737, class124.field2700, (byte) -30);
        } else if (class114.field2444 == 20) {
            class27.method202(class117.field2493, class126.field2737, class124.field2700, (byte) -30);
        } else if (class114.field2444 == 25) {
            if (class56.field1296 == 1) {
                if (class72.field1614 < class14.field255) {
                    class72.field1614 = class14.field255;
                }
                int var3 = (class72.field1614 - class14.field255) * 50 / class72.field1614;
                class124.method958((byte) 62, class8.field149, class68.method537(1, new class28[] { class95.field2110, class5.method25(6366, var3), class66.field1510 }), true);
            } else if (class56.field1296 == 2) {
                if (class88.field1958 > class2.field24) {
                    class2.field24 = class88.field1958;
                }
                int var2 = (class2.field24 - class88.field1958) * 50 / class2.field24 + 50;
                class124.method958((byte) 62, class8.field149, class68.method537(1, new class28[] { class95.field2110, class5.method25(6366, var2), class66.field1510 }), true);
            } else {
                class124.method958((byte) 62, class8.field149, null, false);
            }
        } else if (class114.field2444 == 30) {
            class27.method199(-115);
        } else if (class114.field2444 == 35) {
            class83.method636((byte) 57);
        } else if (class114.field2444 == 40) {
            class124.method958((byte) 62, class46.field1027, class98.field2164, false);
        }
        class3.field46 = 0;
        if (arg0 != -2) {
            method116(true);
        }
        field382++;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)I")
    public static final int method118(int arg0) {
        if (arg0 < 25) {
            field397 = null;
        }
        field384++;
        return class16.field305++;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field379++;
        try {
            if (arg0.length != 5) {
                class45.method357(-12548);
            }
            class129.field2790 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class7.field115 = 0;
            } else if (arg0[1].equals("office")) {
                class7.field115 = 1;
            } else if (arg0[1].equals("local")) {
                class7.field115 = 2;
            } else {
                class45.method357(-12548);
            }
            if (arg0[2].equals("live")) {
                class61.field1358 = 0;
            } else if (arg0[2].equals("rc")) {
                class61.field1358 = 1;
            } else if (arg0[2].equals("wip")) {
                class61.field1358 = 2;
            } else {
                class45.method357(-12548);
            }
            if (arg0[3].equals("lowmem")) {
                class3.method15(-17859);
            } else if (arg0[3].equals("highmem")) {
                class83.method634(-43);
            } else {
                class45.method357(-12548);
            }
            if (arg0[4].equals("free")) {
                class74.field1640 = false;
            } else if (arg0[4].equals("members")) {
                class74.field1640 = true;
            } else {
                class45.method357(-12548);
            }
            client var1 = new client();
            var1.method376(class61.field1358 + 32, "runescape", 402, InetAddress.getLocalHost(), 765, (byte) -91, 503, 12);
        } catch (Exception var3) {
            class119.method884(32, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public static final void method119(byte arg0) {
        if (class40.field868 == 1) {
            if (class96.field2143 >= 539 && class96.field2143 <= 573 && class32.field680 >= 169 && class32.field680 < 205 && class127.field2743[0] != -1) {
                class7.field120 = 0;
                class112.field2422 = true;
                class30.field646 = true;
            }
            if (class96.field2143 >= 569 && class96.field2143 <= 599 && class32.field680 >= 168 && class32.field680 < 205 && class127.field2743[1] != -1) {
                class30.field646 = true;
                class112.field2422 = true;
                class7.field120 = 1;
            }
            if (class96.field2143 >= 597 && class96.field2143 <= 627 && class32.field680 >= 168 && class32.field680 < 205 && class127.field2743[2] != -1) {
                class30.field646 = true;
                class112.field2422 = true;
                class7.field120 = 2;
            }
            if (class96.field2143 >= 625 && class96.field2143 <= 669 && class32.field680 >= 168 && class32.field680 < 203 && class127.field2743[3] != -1) {
                class7.field120 = 3;
                class30.field646 = true;
                class112.field2422 = true;
            }
            if (class96.field2143 >= 666 && class96.field2143 <= 696 && class32.field680 >= 168 && class32.field680 < 205 && class127.field2743[4] != -1) {
                class30.field646 = true;
                class7.field120 = 4;
                class112.field2422 = true;
            }
            if (class96.field2143 >= 694 && class96.field2143 <= 724 && class32.field680 >= 168 && class32.field680 < 205 && class127.field2743[5] != -1) {
                class7.field120 = 5;
                class30.field646 = true;
                class112.field2422 = true;
            }
            if (class96.field2143 >= 722 && class96.field2143 <= 756 && class32.field680 >= 169 && class32.field680 < 205 && class127.field2743[6] != -1) {
                class7.field120 = 6;
                class112.field2422 = true;
                class30.field646 = true;
            }
            if (class96.field2143 >= 540 && class96.field2143 <= 574 && class32.field680 >= 466 && class32.field680 < 502 && class127.field2743[7] != -1) {
                class30.field646 = true;
                class7.field120 = 7;
                class112.field2422 = true;
            }
            if (class96.field2143 >= 572 && class96.field2143 <= 602 && class32.field680 >= 466 && class32.field680 < 503 && class127.field2743[8] != -1) {
                class30.field646 = true;
                class7.field120 = 8;
                class112.field2422 = true;
            }
            if (class96.field2143 >= 599 && class96.field2143 <= 629 && class32.field680 >= 466 && class32.field680 < 503 && class127.field2743[9] != -1) {
                class30.field646 = true;
                class7.field120 = 9;
                class112.field2422 = true;
            }
            if (class96.field2143 >= 627 && class96.field2143 <= 671 && class32.field680 >= 467 && class32.field680 < 502 && class127.field2743[10] != -1) {
                class7.field120 = 10;
                class30.field646 = true;
                class112.field2422 = true;
            }
            if (class96.field2143 >= 669 && class96.field2143 <= 699 && class32.field680 >= 466 && class32.field680 < 503 && class127.field2743[11] != -1) {
                class7.field120 = 11;
                class30.field646 = true;
                class112.field2422 = true;
            }
            if (class96.field2143 >= 696 && class96.field2143 <= 726 && class32.field680 >= 466 && class32.field680 < 503 && class127.field2743[12] != -1) {
                class112.field2422 = true;
                class7.field120 = 12;
                class30.field646 = true;
            }
            if (class96.field2143 >= 724 && class96.field2143 <= 758 && class32.field680 >= 466 && class32.field680 < 502 && class127.field2743[13] != -1) {
                class7.field120 = 13;
                class30.field646 = true;
                class112.field2422 = true;
            }
        }
        field387++;
        int var1 = -98 % ((66 - arg0) / 52);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method120(byte arg0) {
        class83.field1888++;
        this.method121((byte) -69);
        class66.method530(true);
        class94.method678((byte) -99);
        class48.method387(-3);
        class110.method754((byte) 112);
        if (class114.field2444 == 0) {
            class50.method407(true);
        } else if (class114.field2444 == 5) {
            class50.method407(true);
        } else if (class114.field2444 == 10) {
            class64.method516(-947);
        } else if (class114.field2444 == 20) {
            class64.method516(-947);
            class91.method661(0);
        } else if (class114.field2444 == 25) {
            class12.method66(false);
        }
        if (arg0 > -62) {
            this.method126(53, 26);
        }
        if (class114.field2444 == 30) {
            class72.method565(false);
        } else if (class114.field2444 == 35) {
            class72.method565(false);
        } else if (class114.field2444 == 40) {
            class91.method661(0);
        }
        field389++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method121(byte arg0) {
        int var2 = 29 / ((arg0 - 14) / 51);
        field391++;
        if (class114.field2444 == 1000) {
            return;
        }
        if (class93.field2057 == null) {
            class93.field2057 = new class49();
        }
        boolean var3 = class93.field2057.method394(true);
        if (!var3) {
            this.method114(502);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static void method122(int arg0) {
        field400 = null;
        field386 = null;
        field401 = null;
        field402 = null;
        field403 = null;
        field398 = null;
        if (arg0 < 50) {
            field399 = -25;
        }
        field396 = null;
        field380 = null;
        field397 = null;
        field404 = null;
        field393 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public static final void method123(boolean arg0) {
        if (arg0) {
            method119((byte) -18);
        }
        field376++;
        if (class14.field251 == null) {
            return;
        }
        if (class5.field82 >= 0) {
            if (class32.field689 > 0) {
                class18.field360 += class32.field690;
                class14.field251.method170(332, class18.field360, class5.field82);
                class32.field689--;
                if (class32.field689 == 0) {
                    class14.field251.method178((byte) 81);
                    class5.field82 = -1;
                    class32.field689 = 20;
                }
            }
        } else if (class32.field689 > 0) {
            class32.field689--;
            if (class32.field689 == 0) {
                class14.field251.method174((byte) -50);
                class18.field360 = 0;
                if (class37.field830 != null) {
                    class5.field82 = class87.field1939;
                    class14.field251.method180(class87.field1939, false, class37.field830, class21.field485);
                    class37.field830 = null;
                }
            }
        }
        class14.field251.method171((byte) 55);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field383++;
        if (!this.method368((byte) 82)) {
            return;
        }
        class129.field2790 = Integer.parseInt(this.getParameter("worldid"));
        class61.field1358 = Integer.parseInt(this.getParameter("modewhat"));
        class7.field115 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class3.method15(-17859);
        } else {
            class83.method634(71);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class74.field1640 = true;
        } else {
            class74.field1640 = false;
        }
        this.method367(class61.field1358 + 32, 503, 765, true, 402);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILec;IIII)V")
    public static final void method124(int arg0, class28 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class114.field2435 < 500) {
            class78.field1813[class114.field2435] = arg1;
            class74.field1636[class114.field2435] = arg4;
            class76.field1713[class114.field2435] = arg5;
            class49.field1148[class114.field2435] = arg3;
            class46.field1017[class114.field2435] = arg2;
            class114.field2435++;
        }
        if (arg0 != -7765) {
            field400 = null;
        }
        field385++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method125(int arg0) {
        class95.field2114 = class7.field115 == 0 ? 443 : class129.field2790 + 50000;
        field388++;
        class49.field1143 = class7.field115 == 0 ? 43594 : class129.field2790 + 40000;
        class70.field1566 = class49.field1143;
        if (arg0 != 1) {
            method123(true);
        }
        class79.method602(-41);
        class122.method923((byte) -98, class94.method677((byte) 6));
        class76.method585((byte) 10, class94.method677((byte) 6));
        class124.field2691 = class82.field1874;
        try {
            if (class30.field652.field1862 != null) {
                class13.field236 = new class96(class30.field652.field1862, 5200, 0);
                for (int var2 = 0; var2 < 12; var2++) {
                    class4.field74[var2] = new class96(class30.field652.field1869[var2], 6000, 0);
                }
                class30.field652.field1862 = null;
                class30.field652.field1869 = null;
            }
            if (class30.field652.field1861 != null) {
                class109.field2283 = new class96(class30.field652.field1861, 5200, 0);
                for (int var3 = 0; var3 < 5; var3++) {
                    class56.field1293[var3] = new class96(class30.field652.field1870[var3], 6000, 0);
                }
                class30.field652.field1870 = null;
                class30.field652.field1861 = null;
            }
        } catch (IOException var4) {
            class13.field236 = null;
            class109.field2283 = null;
        }
        if (class7.field115 != 0) {
            class15.field296 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method126(int arg0, int arg1) {
        class86.field1916++;
        if (class70.field1566 == class49.field1143) {
            class70.field1566 = class95.field2114;
        } else {
            class70.field1566 = class49.field1143;
        }
        class93.field2054 = null;
        field377++;
        if (arg0 <= 101) {
            this.method120((byte) -49);
        }
        class34.field768 = null;
        class40.field862 = 0;
        if (class86.field1916 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class114.field2444 <= 5) {
                this.method374((byte) 22, "js5connect_full");
                class114.field2444 = 1000;
            } else {
                class80.field1848 = 3000;
            }
        } else if (class86.field1916 >= 4) {
            if (class114.field2444 <= 5) {
                this.method374((byte) 22, "js5connect");
                class114.field2444 = 1000;
            } else {
                class80.field1848 = 3000;
            }
        }
    }
}
