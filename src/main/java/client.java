import java.awt.Color;
import java.awt.FontMetrics;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class51 {

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lhb;")
    public static class44 field365 = class102.method810("Mio", -28606);

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field374 = 0;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Lhb;")
    private static class44 field381 = class102.method810("RuneScape is loading )2 please wait)3)3)3", -28606);

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lhb;")
    public static class44 field376 = null;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lhb;")
    public static class44 field371 = field381;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "[[[I")
    public static int[][][] field382 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lhb;")
    public static class44 field385 = class102.method810("", -28606);

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Lhb;")
    public static class44 field383 = class102.method810("sideicons", -28606);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lfc;")
    public static class34 field368 = new class34(64);

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field390;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    public static boolean field377;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
    public static boolean field392;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 3)
    public static final void method130(int arg0) {
        field367++;
        for (int var1 = -1; var1 < class125.field3020; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class118.field2913[var1];
            }
            class103 var3 = class82.field2110[var2];
            if (var3 != null) {
                class79.method655(var3, (byte) 41, 1);
            }
        }
        if (arg0 != 1) {
            field390 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 39)
    public final void method131(int arg0) {
        field384++;
        method135(2);
        class44.method408((byte) -90);
        class51.method487(false);
        class130.method966((byte) -97);
        class128.method958(false);
        class93.method746(-32486);
        class62.method566(-118);
        class131.method1003((byte) -71);
        class33.method324(-22886);
        class100.method788(arg0 ^ 0xFFFFFF9E);
        class66.method580(-127);
        class102.method806((byte) -114);
        class46.method430(1);
        class86.method697((byte) 73);
        class30.method298();
        class29.method285();
        class92.method738((byte) 67);
        class103.method818((byte) -113);
        class47.method442((byte) -63);
        class72.method611(0);
        class89.method724((byte) -105);
        class23.method164(false);
        class55.method512(-5918);
        class125.method943(-1);
        class43.method362(arg0 + 6);
        class21.method156(-124);
        class127.method949((byte) -16);
        class85.method695((byte) -125);
        class110.method845(-13020);
        class5.method42(0);
        class116.method883(0);
        class34.method329((byte) 12);
        class118.method908(0);
        class24.method177();
        class35.method338(-7502);
        class48.method451(-80);
        class22.method160((byte) 116);
        class13.method92(78);
        class41.method355(arg0 + 131);
        class97.method770(0);
        class81.method669(arg0 - 114);
        if (arg0 != -6) {
            field371 = null;
        }
        class63.method567((byte) 33);
        class94.method752((byte) -56);
        class42.method359(29690);
        class6.method44();
        class98.method776(18587);
        class64.method571(109);
        class31.method313((byte) 41);
        class1.method5((byte) -53);
        class14.method98(3);
        class49.method461(10927);
        class79.method651(arg0 + 105);
        class28.method233((byte) 112);
        class18.method120(-1);
        class129.method962(116);
        class111.method848((byte) 126);
        class58.method560();
        class112.method852();
        class11.method76((byte) 24);
        class69.method595(-1);
        class36.method339((byte) 27);
        class88.method717((byte) 15);
        class77.method641(-2);
        class74.method632(arg0 ^ 0xB131);
        class57.method531(arg0 ^ 0xFFFFFF92);
        class80.method662(false);
        class121.method933(12);
        class105.method824((byte) -117);
        class117.method902(0);
        class71.method606((byte) 46);
        class96.method764(arg0 - 79);
        class70.method599();
        class75.method636(0);
        class95.method755(78);
        class104.method821(116);
        class61.method564(true);
        class84.method684(81);
        class73.method615();
        class120.method925(arg0 - 461);
        class27.method228(126);
        class82.method675(true);
        class90.method729(arg0 + 133);
        class67.method589(-68);
        class25.method213(-21782);
        class15.method105((byte) 104);
        class52.method498(arg0 ^ 0xFFFFFF9E);
        class101.method800((byte) 92);
        class40.method353((byte) 126);
        class19.method148(104);
        class122.method940(12510);
        class119.method919();
        class39.method343(arg0 + 8697);
        class26.method216();
        class2.method15((byte) 111);
        class68.method591();
        class4.method32(-94);
        class107.method841((byte) 32);
        class113.method863(-123);
        class109.method842(50);
        class17.method115();
        class12.method84();
        class9.method67(arg0 ^ 0x71);
        class53.method500(23);
        class16.method109(-31524);
        class50.method466();
        class78.method645((byte) -51);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 171)
    public static final void method132(String arg0, Throwable arg1, byte arg2) {
        try {
            if (arg2 != 68) {
                method135(-90);
            }
            String var3 = "";
            if (arg1 != null) {
                var3 = class46.method433(arg1, 27575);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class123 var8 = class40.field903.method525(new URL(class40.field903.field1431.getCodeBase(), "clienterror.ws?c=" + class93.field2352 + "&u=" + class110.field2750 + "&v1=" + class56.field1423 + "&v2=" + class56.field1437 + "&e=" + var7), 9018);
            while (var8.field2998 == 0) {
                class47.method447((byte) -75, 1L);
            }
            if (var8.field2998 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2995;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        field370++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 228)
    private final void method133(int arg0) {
        field369++;
        if (class67.field1687 >= 4) {
            this.method485((byte) -123, "js5crc");
            class69.field1709 = 1000;
            return;
        }
        if (arg0 != 503) {
            field383 = null;
        }
        if (class117.field2856 >= 4) {
            if (class69.field1709 <= 5) {
                this.method485((byte) -123, "js5io");
                class69.field1709 = 1000;
                return;
            }
            class81.field2075 = 3000;
            class117.field2856 = 3;
        }
        if (class81.field2075-- > 0) {
            return;
        }
        try {
            if (class13.field255 == 0) {
                class21.field423 = class103.field2626.method523(class131.field3194, false);
                class13.field255++;
            }
            if (class13.field255 == 1) {
                if (class21.field423.field2998 == 2) {
                    this.method136(3013, -1);
                    return;
                }
                if (class21.field423.field2998 == 1) {
                    class13.field255++;
                }
            }
            if (class13.field255 == 2) {
                class127.field3043 = new class33((Socket) class21.field423.field2995, class103.field2626);
                class131 var2 = new class131(5);
                var2.method993(19579, 15);
                var2.method975(423, false);
                class127.field3043.method323(0, (byte) 122, 5, var2.field3172);
                class13.field255++;
                class118.field2907 = System.currentTimeMillis();
            }
            if (class13.field255 == 3) {
                if (class69.field1709 <= 5 || class127.field3043.method327((byte) -68) > 0) {
                    int var3 = class127.field3043.method322((byte) -65);
                    if (var3 != 0) {
                        this.method136(arg0 + 2510, var3);
                        return;
                    }
                    class13.field255++;
                } else if (System.currentTimeMillis() - class118.field2907 > 30000L) {
                    this.method136(arg0 + 2510, -2);
                    return;
                }
            }
            if (class13.field255 == 4) {
                class18.method124(class127.field3043, class69.field1709 > 20, 26294);
                class13.field255 = 0;
                class21.field423 = null;
                class118.field2911 = 0;
                class127.field3043 = null;
            }
        } catch (IOException var4) {
            this.method136(arg0 + 2510, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 347)
    public final void method134(int arg0) {
        class2.field73++;
        this.method137((byte) -46);
        field387++;
        class43.method372(125);
        class1.method1(113);
        class5.method41((byte) -121);
        class110.method846((byte) -32);
        class89.method725((byte) 80);
        if (class69.field1709 == 0) {
            class9.method69((byte) 59);
            class85.method692((byte) -71);
        } else if (class69.field1709 == 5) {
            class9.method69((byte) 59);
            class85.method692((byte) -82);
        } else if (class69.field1709 == 10) {
            class75.method637(20);
        } else if (class69.field1709 == 20) {
            class75.method637(20);
            class33.method321((byte) -54);
        } else if (class69.field1709 == 25) {
            class117.method905((byte) -120);
        }
        if (class69.field1709 == 30) {
            class1.method9(-119);
        } else if (class69.field1709 == 35) {
            class1.method9(-60);
        } else if (class69.field1709 == 40) {
            class33.method321((byte) -54);
        }
        int var2 = -60 % ((40 - arg0) / 60);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 408)
    public static final void main(String[] arg0) {
        field386++;
        try {
            if (arg0.length != 6) {
                class55.method513(1);
            }
            class84.field2142 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class33.field809 = 0;
            } else if (arg0[1].equals("office")) {
                class33.field809 = 1;
            } else if (arg0[1].equals("local")) {
                class33.field809 = 2;
            } else {
                class55.method513(1);
            }
            if (arg0[2].equals("live")) {
                class121.field2949 = 0;
            } else if (arg0[2].equals("rc")) {
                class121.field2949 = 1;
            } else if (arg0[2].equals("wip")) {
                class121.field2949 = 2;
            } else {
                class55.method513(1);
            }
            if (arg0[3].equals("lowmem")) {
                class74.method620(-86);
            } else if (arg0[3].equals("highmem")) {
                class71.method602(5);
            } else {
                class55.method513(1);
            }
            if (arg0[4].equals("free")) {
                class97.field2464 = false;
            } else if (arg0[4].equals("members")) {
                class97.field2464 = true;
            } else {
                class55.method513(1);
            }
            if (arg0[5].equals("english")) {
                class36.field869 = 0;
            } else if (arg0[5].equals("german")) {
                class52.method496((byte) 117);
                class36.field869 = 1;
            } else {
                class55.method513(1);
            }
            client var1 = new client();
            var1.method490(423, InetAddress.getLocalHost(), 765, class121.field2949 + 32, "runescape", 12, 503, -8796);
        } catch (Exception var3) {
            method132(null, var3, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 486)
    public static void method135(int arg0) {
        field365 = null;
        field368 = null;
        field385 = null;
        field381 = null;
        if (arg0 != 2) {
            field381 = null;
        }
        field390 = null;
        field376 = null;
        field383 = null;
        field371 = null;
        field382 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 552)
    private final void method136(int arg0, int arg1) {
        if (class69.field1713 == class131.field3194) {
            class131.field3194 = class49.field1210;
        } else {
            class131.field3194 = class69.field1713;
        }
        class118.field2911++;
        class127.field3043 = null;
        class13.field255 = 0;
        field375++;
        class21.field423 = null;
        if (class118.field2911 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class69.field1709 > 5) {
                class81.field2075 = 3000;
            } else {
                this.method485((byte) -123, "js5connect_full");
                class69.field1709 = 1000;
            }
        } else if (class118.field2911 >= 2 && arg1 == 6) {
            this.method485((byte) -123, "js5connect_outofdate");
            class69.field1709 = 1000;
        } else if (class118.field2911 >= 4) {
            if (class69.field1709 <= 5) {
                this.method485((byte) -123, "js5connect");
                class69.field1709 = 1000;
            } else {
                class81.field2075 = 3000;
            }
        }
        if (arg0 != 3013) {
            field385 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 635)
    private final void method137(byte arg0) {
        field388++;
        if (class69.field1709 == 1000) {
            return;
        }
        boolean var2 = class22.method161(0);
        if (!var2) {
            this.method133(503);
        }
        if (arg0 != -46) {
            method139(83, 62);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 657)
    public final void method138(byte arg0) {
        field389++;
        if (class101.field2566 != null) {
            class101.field2566.field1571 = false;
        }
        class101.field2566 = null;
        if (class107.field2711 != null) {
            class107.field2711.method328(arg0 + 150);
            class107.field2711 = null;
        }
        class97.method769(-5);
        class96.method760(arg0 - 171);
        class1.method11(54);
        class94.method749((byte) -86);
        if (arg0 != 106) {
            return;
        }
        class79.method656(0);
        class47.method435((byte) -76);
        try {
            if (class129.field3106 != null) {
                class129.field3106.method579(arg0 - 104);
            }
            if (class47.field1164 != null) {
                for (int var2 = 0; var2 < class47.field1164.length; var2++) {
                    if (class47.field1164[var2] != null) {
                        class47.field1164[var2].method579(2);
                    }
                }
            }
            if (class63.field1613 != null) {
                class63.field1613.method579(2);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Lua;", line = 720)
    public static final class118 method139(int arg0, int arg1) {
        class118 var2 = (class118) class35.field845.method330((long) arg1, -1);
        field366++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 1) {
            field374 = 113;
        }
        byte[] var3 = class78.field1966.method892(12, arg1, false);
        class118 var4 = new class118();
        if (var3 != null) {
            var4.method906(new class131(var3), -1);
        }
        var4.method911(61);
        class35.field845.method332(var4, arg0 ^ 0x1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 749)
    public final void init() {
        field364++;
        if (!this.method489(-1)) {
            return;
        }
        class84.field2142 = Integer.parseInt(this.getParameter("worldid"));
        class121.field2949 = Integer.parseInt(this.getParameter("modewhat"));
        class33.field809 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class74.method620(-117);
        } else {
            class71.method602(5);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class97.field2464 = true;
        } else {
            class97.field2464 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class52.method496((byte) 105);
            class36.field869 = 1;
        }
        this.method482(503, 423, 765, -30735, class121.field2949 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 821)
    public final void method140(byte arg0) {
        class49.field1210 = class33.field809 == 0 ? 443 : class84.field2142 + 50000;
        field380++;
        class69.field1713 = class33.field809 == 0 ? 43594 : class84.field2142 + 40000;
        class131.field3194 = class69.field1713;
        class105.method830(true);
        class78.method647(17964, class22.field483);
        class121.method932(class22.field483, arg0 ^ 0xBAC);
        class47.field1176 = class56.field1441;
        try {
            if (arg0 != 11) {
                this.method133(0);
            }
            if (class103.field2626.field1434 != null) {
                class129.field3106 = new class66(class103.field2626.field1434, 5200, 0);
                for (int var2 = 0; var2 < 12; var2++) {
                    class47.field1164[var2] = new class66(class103.field2626.field1432[var2], 6000, 0);
                }
                class63.field1613 = new class66(class103.field2626.field1427, 6000, 0);
                class88.field2256 = new class102(255, class129.field3106, class63.field1613, 500000);
                class103.field2626.field1434 = null;
                class103.field2626.field1427 = null;
                class103.field2626.field1432 = null;
            }
        } catch (IOException var3) {
            class88.field2256 = null;
            class129.field3106 = null;
            class63.field1613 = null;
        }
        if (class33.field809 != 0) {
            class64.field1637 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 882)
    public final void method141(byte arg0) {
        if (arg0 != 9) {
            this.method131(97);
        }
        if (class90.field2309) {
            class47.method449(class22.field483, 33);
            class101.method799(true, class22.field483);
            this.method491(-107);
            class78.method647(17964, class22.field483);
            class121.method932(class22.field483, 2983);
        }
        if (class69.field1709 == 0) {
            class103.method816(class121.field2950, -101, class89.field2288, null);
        } else if (class69.field1709 == 5) {
            class84.method686(class34.field820, class104.field2661, (byte) -75);
        } else if (class69.field1709 == 10) {
            class84.method686(class34.field820, class104.field2661, (byte) -75);
        } else if (class69.field1709 == 20) {
            class84.method686(class34.field820, class104.field2661, (byte) -75);
        } else if (class69.field1709 == 25) {
            if (class27.field639 == 1) {
                if (class77.field1922 > class28.field668) {
                    class28.field668 = class77.field1922;
                }
                int var3 = (class28.field668 - class77.field1922) * 50 / class28.field668;
                class40.method349(class36.field857, (byte) 95, true, class117.method903(new class44[] { class93.field2369, class116.method893(arg0 + 1, var3), class116.field2841 }, false));
            } else if (class27.field639 == 2) {
                if (class109.field2731 < class80.field2025) {
                    class109.field2731 = class80.field2025;
                }
                int var2 = (class109.field2731 - class80.field2025) * 50 / class109.field2731 + 50;
                class40.method349(class36.field857, (byte) 95, true, class117.method903(new class44[] { class93.field2369, class116.method893(10, var2), class116.field2841 }, false));
            } else {
                class40.method349(class36.field857, (byte) 95, false, null);
            }
        } else if (class69.field1709 == 30) {
            class13.method87(arg0 ^ 0xFFFFFFE6);
        } else if (class69.field1709 == 35) {
            class98.method774(false);
        } else if (class69.field1709 == 40) {
            class40.method349(class95.field2419, (byte) 95, false, class129.field3088);
        }
        class21.field432 = 0;
        field378++;
    }
}
