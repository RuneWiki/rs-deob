import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class18 {

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field424 = -1;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lrc;")
    public static class105 field437 = class43.method374("bevor Sie den Vorgang wiederholen)3", 0);

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lrc;")
    public static class105 field434 = class43.method374("Benutzen", 0);

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
    public static int[] field446 = new int[50];

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field428 = 7759444;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lfc;")
    public static class34 field436;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lmb;")
    public static class74 field440;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[[[I")
    public static int[][][] field425;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lrc;IILrc;)V", line = 4)
    public static final void method207(class105 arg0, int arg1, int arg2, class105 arg3) {
        if (arg2 == 0 && class51.field1069 != -1) {
            class58.field1293 = arg3;
            class104.field2371 = 0;
        }
        if (arg1 > 0) {
            field425 = null;
        }
        field442++;
        if (class1.field4 == -1) {
            class90.field2064 = true;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class120.field2896[var4] = class120.field2896[var4 - 1];
            class92.field2116[var4] = class92.field2116[var4 - 1];
            class37.field856[var4] = class37.field856[var4 - 1];
        }
        class120.field2896[0] = arg2;
        class92.field2116[0] = arg0;
        class37.field856[0] = arg3;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V", line = 51)
    private final void method208(boolean arg0) {
        field430++;
        if (!arg0) {
            this.method190(false);
        }
        if (class78.field1761 != 1000) {
            boolean var2 = class83.method700(560);
            if (!var2) {
                this.method212((byte) -59);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 90)
    public final void method195(boolean arg0) {
        class14.field281 = class28.field625 == 0 ? 43594 : class76.field1704 + 40000;
        field427++;
        class127.field3075 = class28.field625 == 0 ? 443 : class76.field1704 + 50000;
        class6.field82 = class14.field281;
        class37.method340((byte) -104);
        class117.method951(20, class41.field935);
        class59.method477(class41.field935, (byte) -66);
        class30.field672 = class33.field774;
        try {
            if (class122.field2991.field769 != null) {
                class67.field1526 = new class122(class122.field2991.field769, 5200, 0);
                for (int var2 = 0; var2 < 13; var2++) {
                    class120.field2894[var2] = new class122(class122.field2991.field777[var2], 6000, 0);
                }
                class78.field1742 = new class122(class122.field2991.field780, 6000, 0);
                class9.field161 = new class57(255, class67.field1526, class78.field1742, 500000);
                class122.field2991.field769 = null;
                class122.field2991.field777 = null;
                class122.field2991.field780 = null;
            }
        } catch (IOException var3) {
            class9.field161 = null;
            class67.field1526 = null;
            class78.field1742 = null;
        }
        if (class28.field625 != 0) {
            class127.field3070 = true;
        }
        class28.field618 = new class119();
        if (!arg0) {
            this.method211(-89, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 145)
    public static final void method209(int arg0) {
        class18.field389.method790((byte) -76);
        field444++;
        int var1 = class18.field389.method785(205, 1);
        if (var1 == 0) {
            return;
        }
        if (arg0 < 94) {
            method207(null, 33, 120, null);
        }
        int var2 = class18.field389.method785(205, 2);
        if (var2 == 0) {
            class122.field3001[class76.field1701++] = 2047;
        } else if (var2 == 1) {
            int var3 = class18.field389.method785(205, 3);
            class119.field2842.method468(var3, 5, false);
            int var4 = class18.field389.method785(205, 1);
            if (var4 == 1) {
                class122.field3001[class76.field1701++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class18.field389.method785(205, 3);
            class119.field2842.method468(var5, 5, true);
            int var6 = class18.field389.method785(205, 3);
            class119.field2842.method468(var6, 5, true);
            int var7 = class18.field389.method785(205, 1);
            if (var7 == 1) {
                class122.field3001[class76.field1701++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class18.field389.method785(205, 1);
            int var9 = class18.field389.method785(205, 1);
            if (var9 == 1) {
                class122.field3001[class76.field1701++] = 2047;
            }
            class73.field1619 = class18.field389.method785(205, 2);
            int var10 = class18.field389.method785(205, 7);
            int var11 = class18.field389.method785(205, 7);
            class119.field2842.method469((byte) 57, var10, var8 == 1, var11);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 231)
    public final void method185(boolean arg0) {
        class104.field2351++;
        this.method208(true);
        field439++;
        class45.method381((byte) 24);
        class96.method796(true);
        class121.method988((byte) -100);
        class73.method615(3);
        class134.method1059(arg0);
        if (class78.field1761 == 0) {
            class65.method549((byte) -94);
            class15.method163(-107);
        } else if (class78.field1761 == 5) {
            class65.method549((byte) -94);
            class15.method163(-111);
        } else if (class78.field1761 == 10) {
            class93.method777((byte) -28);
        } else if (class78.field1761 == 20) {
            class93.method777((byte) -28);
            class19.method220((byte) 47);
        } else if (class78.field1761 == 25) {
            class66.method560(-119);
        }
        if (class78.field1761 == 30) {
            class18.method191((byte) -82);
        } else if (class78.field1761 == 35) {
            class18.method191((byte) -79);
        } else if (class78.field1761 == 40) {
            class19.method220((byte) 47);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 297)
    public final void init() {
        field429++;
        if (!this.method193((byte) 100)) {
            return;
        }
        class76.field1704 = Integer.parseInt(this.getParameter("worldid"));
        class80.field1790 = Integer.parseInt(this.getParameter("modewhat"));
        class28.field625 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class3.method30(-1);
        } else {
            class111.method915((byte) -124);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class61.field1362 = true;
        } else {
            class61.field1362 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class87.method717(true);
            class90.field2075 = 1;
        }
        this.method188(765, class80.field1790 + 32, 439, (byte) -97, 503);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V", line = 338)
    public static final void method210(boolean arg0) {
        class29.field656.method602((byte) -70);
        field426++;
        class110.field2547.method602((byte) -70);
        class75.field1659.method602((byte) -70);
        if (arg0) {
            method207(null, 20, 11, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 352)
    private final void method211(int arg0, byte arg1) {
        class81.field1827 = null;
        field438++;
        int var3 = 9 % ((30 - arg1) / 59);
        class83.field1875 = 0;
        class96.field2223++;
        class10.field189 = null;
        if (class6.field82 == class14.field281) {
            class6.field82 = class127.field3075;
        } else {
            class6.field82 = class14.field281;
        }
        if (class96.field2223 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class78.field1761 <= 5) {
                this.method203(20, "js5connect_full");
                class78.field1761 = 1000;
            } else {
                class87.field1984 = 3000;
            }
        } else if (class96.field2223 >= 2 && arg0 == 6) {
            this.method203(20, "js5connect_outofdate");
            class78.field1761 = 1000;
        } else if (class96.field2223 >= 4) {
            if (class78.field1761 <= 5) {
                this.method203(20, "js5connect");
                class78.field1761 = 1000;
            } else {
                class87.field1984 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 414)
    public final void method201(boolean arg0) {
        if (class119.field2775) {
            class128.method1028(class41.field935, 8532);
            class65.method552(class41.field935, 40);
            this.method189(118);
            class117.method951(20, class41.field935);
            class59.method477(class41.field935, (byte) -19);
        }
        if (class78.field1761 == 0) {
            class132.method1047(class37.field865, class122.field2986, null, 304);
        } else if (class78.field1761 == 5) {
            class74.method619(180, class100.field2285, class74.field1624);
        } else if (class78.field1761 == 10) {
            class74.method619(180, class100.field2285, class74.field1624);
        } else if (class78.field1761 == 20) {
            class74.method619(180, class100.field2285, class74.field1624);
        } else if (class78.field1761 == 25) {
            if (class136.field3319 == 1) {
                if (class71.field1559 > class84.field1883) {
                    class84.field1883 = class71.field1559;
                }
                int var2 = (class84.field1883 - class71.field1559) * 50 / class84.field1883;
                class129.method1038(class108.method878(new class105[] { class76.field1709, class75.method637(var2, 8241), class112.field2638 }, 2867), true, class90.field2057, (byte) -117);
            } else if (class136.field3319 == 2) {
                if (class112.field2642 < class89.field2055) {
                    class112.field2642 = class89.field2055;
                }
                int var3 = (class112.field2642 - class89.field2055) * 50 / class112.field2642 + 50;
                class129.method1038(class108.method878(new class105[] { class76.field1709, class75.method637(var3, 8241), class112.field2638 }, 2867), true, class90.field2057, (byte) -121);
            } else {
                class129.method1038(null, false, class90.field2057, (byte) -124);
            }
        } else if (class78.field1761 == 30) {
            class83.method701(332);
        } else if (class78.field1761 == 35) {
            class37.method339((byte) -89);
        } else if (class78.field1761 == 40) {
            class129.method1038(class106.field2431, false, class102.field2330, (byte) -120);
        }
        if (arg0) {
            field424 = 40;
        }
        class59.field1312 = 0;
        field443++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 500)
    private final void method212(byte arg0) {
        if (arg0 > -39) {
            return;
        }
        field441++;
        if (class64.field1445 >= 4) {
            this.method203(20, "js5crc");
            class78.field1761 = 1000;
            return;
        }
        if (class31.field730 >= 4) {
            if (class78.field1761 <= 5) {
                this.method203(20, "js5io");
                class78.field1761 = 1000;
                return;
            }
            class31.field730 = 3;
            class87.field1984 = 3000;
        }
        if (class87.field1984-- > 0) {
            return;
        }
        try {
            if (class83.field1875 == 0) {
                class10.field189 = class122.field2991.method309(class6.field82, 27307);
                class83.field1875++;
            }
            if (class83.field1875 == 1) {
                if (class10.field189.field916 == 2) {
                    this.method211(-1, (byte) 115);
                    return;
                }
                if (class10.field189.field916 == 1) {
                    class83.field1875++;
                }
            }
            if (class83.field1875 == 2) {
                class81.field1827 = new class129((Socket) class10.field189.field918, class122.field2991);
                class7 var2 = new class7(5);
                var2.method102((byte) 123, 15);
                var2.method100(439, false);
                class81.field1827.method1034(0, var2.field117, -99, 5);
                class83.field1875++;
                class76.field1703 = class1.method3(false);
            }
            if (class83.field1875 == 3) {
                if (class78.field1761 <= 5 || class81.field1827.method1032((byte) 71) > 0) {
                    int var3 = class81.field1827.method1033(0);
                    if (var3 != 0) {
                        this.method211(var3, (byte) 118);
                        return;
                    }
                    class83.field1875++;
                } else if (class1.method3(false) - class76.field1703 > 30000L) {
                    this.method211(-2, (byte) 91);
                    return;
                }
            }
            if (class83.field1875 == 4) {
                class15.method169(-128, class78.field1761 > 20, class81.field1827);
                class83.field1875 = 0;
                class81.field1827 = null;
                class96.field2223 = 0;
                class10.field189 = null;
            }
        } catch (IOException var4) {
            this.method211(-3, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 620)
    public static final void main(String[] arg0) {
        field431++;
        try {
            if (arg0.length != 6) {
                class7.method88(1);
            }
            class76.field1704 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class28.field625 = 0;
            } else if (arg0[1].equals("office")) {
                class28.field625 = 1;
            } else if (arg0[1].equals("local")) {
                class28.field625 = 2;
            } else {
                class7.method88(1);
            }
            if (arg0[2].equals("live")) {
                class80.field1790 = 0;
            } else if (arg0[2].equals("rc")) {
                class80.field1790 = 1;
            } else if (arg0[2].equals("wip")) {
                class80.field1790 = 2;
            } else {
                class7.method88(1);
            }
            if (arg0[3].equals("lowmem")) {
                class3.method30(-1);
            } else if (arg0[3].equals("highmem")) {
                class111.method915((byte) 46);
            } else {
                class7.method88(1);
            }
            if (arg0[4].equals("free")) {
                class61.field1362 = false;
            } else if (arg0[4].equals("members")) {
                class61.field1362 = true;
            } else {
                class7.method88(1);
            }
            if (arg0[5].equals("english")) {
                class90.field2075 = 0;
            } else if (arg0[5].equals("german")) {
                class87.method717(true);
                class90.field2075 = 1;
            } else {
                class7.method88(1);
            }
            client var1 = new client();
            var1.method192(1, InetAddress.getLocalHost(), 13, 765, class80.field1790 + 32, "runescape", 439, 503);
        } catch (Exception var3) {
            class19.method225(0, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 716)
    public final void method205(byte arg0) {
        if (class73.field1609 != null) {
            class73.field1609.field2242 = false;
        }
        class73.field1609 = null;
        field445++;
        if (class24.field576 != null) {
            class24.field576.method1037(0);
            class24.field576 = null;
        }
        class15.method167(11060);
        class92.method751(false);
        class96.method793(-10305);
        if (arg0 > -78) {
            return;
        }
        class76.method642((byte) 99);
        class45.method380(0);
        class34.method326((byte) 110);
        try {
            if (class67.field1526 != null) {
                class67.field1526.method997(false);
            }
            if (class120.field2894 != null) {
                for (int var2 = 0; var2 < class120.field2894.length; var2++) {
                    if (class120.field2894[var2] != null) {
                        class120.field2894[var2].method997(false);
                    }
                }
            }
            if (class78.field1742 != null) {
                class78.field1742.method997(false);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjc;Lmd;I)V", line = 795)
    public static final void method213(int arg0, class57 arg1, class76 arg2, int arg3) {
        field435++;
        if (arg3 > -53) {
            field436 = null;
        }
        byte[] var4 = null;
        class3 var5 = class109.field2507;
        synchronized (class109.field2507) {
            for (class64 var6 = (class64) class109.field2507.method31(1280); var6 != null; var6 = (class64) class109.field2507.method26((byte) 108)) {
                if ((long) arg0 == var6.field1448 && var6.field1426 == arg1 && var6.field1425 == 0) {
                    var4 = var6.field1427;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg1.method455((byte) 119, arg0);
            arg2.method650(19548, arg1, true, arg0, var7);
        } else {
            arg2.method650(19548, arg1, true, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 838)
    public static void method214(int arg0) {
        field446 = null;
        field440 = null;
        field434 = null;
        field437 = null;
        field436 = null;
        if (arg0 >= -81) {
            field425 = null;
        }
        field425 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 853)
    public final void method190(boolean arg0) {
        field433++;
        method214(-92);
        class105.method849((byte) -128);
        class18.method186(4500);
        class51.method401(0);
        class34.method324(-82);
        class97.method803(500);
        class7.method82(1045269808);
        class129.method1036(85);
        class76.method644((byte) 123);
        class122.method999((byte) -119);
        class57.method460(true);
        class115.method936(2000);
        class95.method784(-114);
        class77.method663();
        class62.method529();
        class110.method889(11024);
        class15.method170(512);
        class3.method21(-31280);
        class119.method959((byte) 29);
        class16.method178(-109);
        class12.method140(-513);
        class58.method461(-1);
        class104.method821(49);
        if (arg0) {
            field440 = null;
        }
        class19.method215((byte) 123);
        class74.method628((byte) -34);
        class65.method548(14833);
        class10.method129(121);
        class45.method379(-65);
        class71.method607(-1);
        class116.method949((byte) 61);
        class56.method435();
        class59.method474((byte) 122);
        class50.method397(0);
        class117.method953(-127);
        class86.method715(0);
        class83.method702(31882);
        class85.method707(5);
        class60.method482(0);
        class78.method678(-113);
        class102.method814((byte) -55);
        class37.method338(0);
        class55.method420((byte) -23);
        class91.method747();
        class39.method364(-25573);
        class14.method161((byte) -127);
        class1.method1((byte) 93);
        class107.method872(-20451);
        class92.method757(255);
        class93.method775(-123);
        class96.method791(-20499);
        class35.method331(0);
        class125.method1013((byte) -76);
        class100.method808((byte) 76);
        class87.method718(47);
        class17.method181(0);
        class108.method877(0);
        class80.method685(false);
        class38.method350();
        class69.method587();
        class133.method1051((byte) 111);
        class29.method280((byte) -120);
        class123.method1001((byte) -127);
        class112.method922(-6);
        class9.method119(0);
        class109.method880(0);
        class121.method980(0);
        class31.method300((byte) -97);
        class61.method486(!arg0);
        class88.method727((byte) -2);
        class113.method931(125);
        class43.method376((byte) -50);
        class30.method281(30504);
        class49.method394();
        class75.method631(80);
        class118.method954((byte) -18);
        class126.method1019((byte) -14);
        class120.method970(-1);
        class81.method694(84);
        class130.method1042(-201);
        class111.method913(0);
        class135.method1065();
        class90.method743((byte) -92);
        class134.method1055(true);
        class42.method370(11335);
        class36.method336(87);
        class73.method614(2482);
        class28.method272((byte) 115);
        class98.method804(-27999);
        class67.method563(0);
        class84.method706(true);
        class26.method242(1);
        class41.method367((byte) -30);
        class72.method610((byte) 89);
        class66.method559(-52);
        class23.method236(false);
        class21.method228();
        class106.method868((byte) 78);
        class99.method806();
        class128.method1026(0);
        class53.method409();
        class132.method1048((byte) -8);
        class64.method545(-306674912);
        class127.method1021(1027);
        class136.method1070((byte) 49);
        class79.method679();
        class48.method392();
        class24.method239(-22967);
        class22.method233(41);
        class6.method54((byte) -48);
        class2.method5();
        class89.method730((byte) 78);
    }
}
