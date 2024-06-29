import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class80 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Lo;")
    public static class84 field321 = class15.method124("", 255);

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[[B")
    public static byte[][] field323 = new byte[1000][];

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Lo;")
    public static class84 field320 = class15.method124("green:", 255);

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Lo;")
    public static class84 field322 = class15.method124("Report abuse @whi@", 255);

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field335 = 0;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field338;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 4)
    public final void method145(int arg0) {
        int var2 = -64 % ((-arg0 - 56) / 43);
        if (class51.field1088 == 0) {
            class110.method853(null, class117.field2571, class113.field2458, -119);
        } else if (class51.field1088 == 5) {
            class120.method934(class89.field2022, class30.field593, -2, class16.field291);
        } else if (class51.field1088 == 10) {
            class120.method934(class89.field2022, class30.field593, -86, class16.field291);
        } else if (class51.field1088 == 20) {
            class120.method934(class89.field2022, class30.field593, 120, class16.field291);
        } else if (class51.field1088 == 25) {
            if (class80.field1698 == 1) {
                if (class40.field815 < class51.field1099) {
                    class40.field815 = class51.field1099;
                }
                int var3 = (class40.field815 - class51.field1099) * 50 / class40.field815;
                class78.method576(true, class97.method746(0, new class84[] { class11.field212, class62.method489(var3, (byte) -126), class51.field1104 }), class117.field2545, -32266);
            } else if (class80.field1698 == 2) {
                if (class55.field1135 < class79.field1675) {
                    class55.field1135 = class79.field1675;
                }
                int var4 = (class55.field1135 - class79.field1675) * 50 / class55.field1135 + 50;
                class78.method576(true, class97.method746(0, new class84[] { class11.field212, class62.method489(var4, (byte) -125), class51.field1104 }), class117.field2545, -32266);
            } else {
                class78.method576(false, null, class117.field2545, -32266);
            }
        } else if (class51.field1088 == 30) {
            class113.method868(77);
        } else if (class51.field1088 == 35) {
            class113.method871(30272);
        } else if (class51.field1088 == 40) {
            class78.method576(false, class3.field31, class123.field2757, -32266);
        }
        class65.field1444 = 0;
        field326++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lud;I)V", line = 78)
    public static final void method146(class118 arg0, int arg1) {
        if (arg1 == 4) {
            class78.field1653 = arg0;
            field330++;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 92)
    private final void method147(byte arg0, int arg1) {
        class79.field1690 = 0;
        class33.field665++;
        if (class69.field1476 == class115.field2510) {
            class69.field1476 = class61.field1268;
        } else {
            class69.field1476 = class115.field2510;
        }
        if (arg0 != 109) {
            return;
        }
        field333++;
        class35.field699 = null;
        class97.field2087 = null;
        if (class33.field665 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class51.field1088 > 5) {
                class54.field1129 = 3000;
            } else {
                this.method588(106, "js5connect_full");
                class51.field1088 = 1000;
            }
        } else if (class33.field665 >= 2 && arg1 == 6) {
            this.method588(115, "js5connect_outofdate");
            class51.field1088 = 1000;
        } else if (class33.field665 >= 4) {
            if (class51.field1088 <= 5) {
                this.method588(104, "js5connect");
                class51.field1088 = 1000;
            } else {
                class54.field1129 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 150)
    public final void method148(int arg0) {
        field327++;
        class115.field2510 = class109.field2365 == 0 ? 43594 : class5.field90 + 40000;
        class69.field1476 = class115.field2510;
        class61.field1268 = class109.field2365 == 0 ? 443 : class5.field90 + 50000;
        class65.method501(117);
        class44.method377(class8.method61(-126), (byte) 66);
        class79.method578(class8.method61(-111), 84);
        class123.field2764 = class9.field173;
        try {
            if (class118.field2627.field189 != null) {
                class78.field1666 = new class19(class118.field2627.field189, 5200, 0);
                for (int var2 = 0; var2 < 12; var2++) {
                    class3.field40[var2] = new class19(class118.field2627.field181[var2], 6000, 0);
                }
                class126.field2781 = new class19(class118.field2627.field192, 6000, 0);
                class86.field1969 = new class15(255, class78.field1666, class126.field2781, 500000);
                class118.field2627.field192 = null;
                class118.field2627.field189 = null;
                class118.field2627.field181 = null;
            }
            if (class118.field2627.field190 != null) {
                class11.field220 = new class19(class118.field2627.field190, 5200, 0);
                for (int var3 = 0; var3 < 5; var3++) {
                    class40.field817[var3] = new class19(class118.field2627.field176[var3], 6000, 0);
                }
                class118.field2627.field190 = null;
                class118.field2627.field176 = null;
            }
            if (arg0 != -12527) {
                this.method147((byte) -43, 25);
            }
        } catch (IOException var4) {
            class78.field1666 = null;
            class11.field220 = null;
            class126.field2781 = null;
            class86.field1969 = null;
        }
        if (class109.field2365 != 0) {
            class115.field2503 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 221)
    private final void method149(int arg0) {
        field332++;
        if (class51.field1088 != arg0) {
            boolean var2 = class40.method356((byte) 11);
            if (!var2) {
                this.method150((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 293)
    public final void init() {
        field324++;
        if (!this.method587(-1)) {
            return;
        }
        class5.field90 = Integer.parseInt(this.getParameter("worldid"));
        class25.field431 = Integer.parseInt(this.getParameter("modewhat"));
        class109.field2365 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class37.method332(true);
        } else {
            class8.method64((byte) 84);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class21.field390 = true;
        } else {
            class21.field390 = false;
        }
        this.method585(class25.field431 + 32, 503, 765, 410, 22895);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 334)
    private final void method150(byte arg0) {
        field336++;
        if (class84.field1916 >= 4) {
            this.method588(111, "js5crc");
            class51.field1088 = 1000;
            return;
        }
        if (class120.field2658 >= 4) {
            if (class51.field1088 <= 5) {
                this.method588(108, "js5io");
                class51.field1088 = 1000;
                return;
            }
            class120.field2658 = 3;
            class54.field1129 = 3000;
        }
        if (class54.field1129-- > 0 || arg0 >= -46) {
            return;
        }
        try {
            if (class79.field1690 == 0) {
                class97.field2087 = class118.field2627.method78((byte) -101, class69.field1476);
                class79.field1690++;
            }
            if (class79.field1690 == 1) {
                if (class97.field2087.field2091 == 2) {
                    this.method147((byte) 109, -1);
                    return;
                }
                if (class97.field2087.field2091 == 1) {
                    class79.field1690++;
                }
            }
            if (class79.field1690 == 2) {
                class35.field699 = new class45((Socket) class97.field2087.field2093, class118.field2627);
                class27 var2 = new class27(5);
                var2.method226(-9646, 15);
                var2.method248(410, -2147393384);
                class35.field699.method396(var2.field502, 5, 0, true);
                class79.field1690++;
                class14.field258 = System.currentTimeMillis();
            }
            if (class79.field1690 == 3) {
                if (class51.field1088 <= 5 || class35.field699.method393(0) > 0) {
                    int var3 = class35.field699.method391(0);
                    if (var3 != 0) {
                        this.method147((byte) 109, var3);
                        return;
                    }
                    class79.field1690++;
                } else if (System.currentTimeMillis() - class14.field258 > 30000L) {
                    this.method147((byte) 109, -2);
                    return;
                }
            }
            if (class79.field1690 == 4) {
                class99.method748(class35.field699, (byte) -37, class51.field1088 > 20);
                class33.field665 = 0;
                class97.field2087 = null;
                class35.field699 = null;
                class79.field1690 = 0;
            }
        } catch (IOException var4) {
            this.method147((byte) 109, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 455)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 5) {
                class111.method859(12726);
            }
            class5.field90 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class109.field2365 = 0;
            } else if (arg0[1].equals("office")) {
                class109.field2365 = 1;
            } else if (arg0[1].equals("local")) {
                class109.field2365 = 2;
            } else {
                class111.method859(12726);
            }
            if (arg0[2].equals("live")) {
                class25.field431 = 0;
            } else if (arg0[2].equals("rc")) {
                class25.field431 = 1;
            } else if (arg0[2].equals("wip")) {
                class25.field431 = 2;
            } else {
                class111.method859(12726);
            }
            if (arg0[3].equals("lowmem")) {
                class37.method332(true);
            } else if (arg0[3].equals("highmem")) {
                class8.method64((byte) 84);
            } else {
                class111.method859(12726);
            }
            if (arg0[4].equals("free")) {
                class21.field390 = false;
            } else if (arg0[4].equals("members")) {
                class21.field390 = true;
            } else {
                class111.method859(12726);
            }
            client var1 = new client();
            var1.method593(410, "runescape", class25.field431 + 32, InetAddress.getLocalHost(), (byte) 54, 12, 503, 765);
        } catch (Exception var3) {
            class45.method392((byte) 106, null, var3);
        }
        field331++;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 534)
    public static void method151(int arg0) {
        if (arg0 <= 91) {
            field335 = 104;
        }
        field320 = null;
        field322 = null;
        field323 = null;
        field321 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 569)
    public final void method152(int arg0) {
        method151(arg0 ^ 0xFFFFEDC6);
        field325++;
        class84.method640(arg0 ^ 0xFFFFED83);
        class80.method584(true);
        class110.method852(23017);
        class93.method721(-39);
        class89.method703(false);
        class60.method482(1);
        class103.method770(-3);
        class27.method212(arg0 + 874571332);
        class45.method398(true);
        class5.method34((byte) 73);
        class19.method155((byte) -73);
        class15.method121(6);
        class115.method888(true);
        class127.method981(-1650);
        class34.method316();
        class108.method817();
        class33.method308(5314);
        class63.method493(-1537);
        class88.method690(-19737);
        class75.method561(3);
        class109.method850(-27290);
        class71.method528(-103);
        class65.method508(true);
        class41.method361((byte) -98);
        class39.method349(true);
        class8.method67((byte) -74);
        class37.method335((byte) -99);
        class12.method110((byte) -127);
        class42.method368((byte) -66);
        class55.method459(-5563);
        if (arg0 != -4700) {
            return;
        }
        class118.method911((byte) -84);
        class97.method740(-30466);
        class31.method279((byte) 68);
        class83.method620();
        class16.method130(123);
        class82.method599((byte) -35);
        class78.method574(0);
        class107.method791(32);
        class58.method469(-16711936);
        class117.method898(126);
        class1.method5(51);
        class4.method14((byte) 29);
        class100.method758(arg0 + 4700);
        class81.method594();
        class61.method487(0);
        class123.method966((byte) -68);
        class104.method775((byte) -31);
        class113.method877(-29246);
        class128.method988(-125);
        class3.method10(false);
        class125.method967(-1);
        class85.method677((byte) 114);
        class48.method411(-5361);
        class69.method519((byte) -115);
        class7.method56();
        class32.method283();
        class73.method553(true);
        class35.method326(arg0 ^ 0xFFFFEDF5);
        class79.method577(92);
        class28.method256((byte) 69);
        class122.method957(7954);
        class119.method925(arg0 ^ 0xFFFFEDA4);
        class49.method424(128);
        class44.method385(86);
        class106.method784((byte) 70);
        class30.method269((byte) -76);
        class6.method38(91);
        class51.method444(29737);
        class26.method191((byte) 73);
        class46.method400();
        class86.method682(-77);
        class36.method329((byte) -63);
        class99.method751(-88);
        class112.method867(false);
        class59.method477();
        class11.method105((byte) -39);
        class64.method498(arg0 + 4701);
        class114.method882(arg0 + 4608);
        class24.method179(113);
        class67.method516(true);
        class105.method777(true);
        class74.method555((byte) -89);
        class40.method353((byte) 111);
        class54.method456((byte) 126);
        class25.method184((byte) -6);
        class111.method861((byte) -66);
        class101.method764((byte) -10);
        class76.method567();
        class126.method971(0);
        class91.method717();
        class120.method936((byte) -76);
        class56.method462();
        class38.method338((byte) 35);
        class62.method488(arg0 ^ 0xFFFFEDD9);
        class50.method433(false);
        class14.method117((byte) 106);
        class47.method406();
        class77.method573();
        class21.method167((byte) 99);
        class116.method891((byte) -39);
        class17.method143(arg0 ^ 0x1233);
        class10.method100();
        class57.method467(true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 686)
    public final void method153(byte arg0) {
        if (class51.field1095 != null) {
            class51.field1095.field2170 = false;
        }
        class51.field1095 = null;
        if (class82.field1764 != null) {
            class82.field1764.method395(-9098);
        }
        if (arg0 > -36) {
            field335 = 40;
        }
        field328++;
        class58.method468(-1);
        class65.method504(-72);
        class113.method872((byte) 78);
        class8.method59((byte) 3);
        class115.method884(-21933);
        class93.method722(-27632);
        try {
            if (class78.field1666 != null) {
                class78.field1666.method163(41);
            }
            if (class3.field40 != null) {
                for (int var2 = 0; var2 < class3.field40.length; var2++) {
                    if (class3.field40[var2] != null) {
                        class3.field40[var2].method163(39);
                    }
                }
            }
            if (class126.field2781 != null) {
                class126.field2781.method163(62);
            }
            if (class11.field220 != null) {
                class11.field220.method163(112);
            }
            if (class40.field817 != null) {
                for (int var3 = 0; var3 < class40.field817.length; var3++) {
                    if (class40.field817[var3] != null) {
                        class40.field817[var3].method163(85);
                    }
                }
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 779)
    public final void method154(boolean arg0) {
        class128.field2837++;
        field334++;
        if (!arg0) {
            field335 = -37;
        }
        this.method149(1000);
        class99.method753(-123);
        class113.method879(-127);
        class19.method157((byte) 21);
        class79.method582(0);
        class63.method490(0);
        if (class51.field1088 == 0) {
            class123.method961((byte) -15);
            class31.method278(65535);
        } else if (class51.field1088 == 5) {
            class123.method961((byte) -15);
            class31.method278(65535);
        } else if (class51.field1088 == 10) {
            class65.method510(192);
        } else if (class51.field1088 == 20) {
            class65.method510(192);
            class50.method434(-100);
        } else if (class51.field1088 == 25) {
            class85.method676(-70);
        }
        if (class51.field1088 == 30) {
            class111.method858(63);
        } else if (class51.field1088 == 35) {
            class111.method858(113);
        } else if (class51.field1088 == 40) {
            class50.method434(-90);
            return;
        }
    }
}
