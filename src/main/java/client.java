import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class19 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field705 = 0;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lgg;")
    public static class63 field713 = class116.method911(43, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lgg;")
    private static class63 field703 = class116.method911(43, "Bad session id)3");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lgg;")
    public static class63 field712 = field703;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[B")
    public static byte[] field720 = new byte[520];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field721;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method201(int arg0) {
        field714++;
        if (arg0 <= 7) {
            field720 = null;
        }
        boolean var2 = class19.method205(8550);
        if (var2 && class164.field3377 && class183.field3711 != null) {
            class183.field3711.method499(-128);
        }
        if (class24.field554) {
            class176.method1169(-1, class49.field1193);
            class30.method303(class49.field1193, -12133);
            if (class206.field4053 != null) {
                class206.field4053.method266(class49.field1193, 69);
            }
            this.method209((byte) 101);
            class203.method1345(-120, class49.field1193);
            class165.method1121(class49.field1193, -83);
            if (class206.field4053 != null) {
                class206.field4053.method263((byte) 2, class49.field1193);
            }
        }
        if (class136.field2932 == 0) {
            class50.method484(class153.field3207, null, class116.field2592, -120);
        } else if (class136.field2932 == 5) {
            class100.method844(class183.field3712, 110, class29.field675);
        } else if (class136.field2932 == 10) {
            class100.method844(class183.field3712, 112, class29.field675);
        } else if (class136.field2932 == 20) {
            class100.method844(class183.field3712, 114, class29.field675);
        } else if (class136.field2932 == 25) {
            if (class26.field593 == 1) {
                if (class142.field3038 > class108.field2432) {
                    class108.field2432 = class142.field3038;
                }
                int var3 = (class108.field2432 - class142.field3038) * 50 / class108.field2432;
                class60.method561(false, -105, class89.method772((byte) 112, new class63[] { class11.field267, class4.field129, class175.method1162((byte) -126, var3), class14.field345 }));
            } else if (class26.field593 == 2) {
                if (class3.field81 < class14.field321) {
                    class3.field81 = class14.field321;
                }
                int var4 = (class3.field81 - class14.field321) * 50 / class3.field81 + 50;
                class60.method561(false, 116, class89.method772((byte) 38, new class63[] { class11.field267, class4.field129, class175.method1162((byte) -126, var4), class14.field345 }));
            } else {
                class60.method561(false, -98, class11.field267);
            }
        } else if (class136.field2932 == 30) {
            class22.method225(-30606);
        } else if (class136.field2932 == 40) {
            class60.method561(false, -106, class89.method772((byte) 85, new class63[] { class134.field2911, class147.field3102, class202.field4001 }));
        }
        if (class136.field2932 == 30 && class12.field279 == 0 && !class127.field2796) {
            try {
                Graphics var5 = class49.field1193.getGraphics();
                for (int var6 = 0; var6 < class202.field4005; var6++) {
                    if (class60.field1523[var6]) {
                        class63.field1621.method189(class27.field606[var6], class110.field2481[var6], class97.field2307[var6], 1530, class98.field2322[var6], var5);
                        class60.field1523[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class49.field1193.repaint();
            }
        } else if (class136.field2932 > 0) {
            try {
                Graphics var7 = class49.field1193.getGraphics();
                class63.field1621.method188(0, 0, var7, (byte) -121);
                class127.field2796 = false;
                for (int var8 = 0; var8 < class202.field4005; var8++) {
                    class60.field1523[var8] = false;
                }
            } catch (Exception var10) {
                class49.field1193.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method211(int arg0) {
        if (class114.field2548 != null) {
            class114.field2548.field3789 = false;
        }
        class114.field2548 = null;
        field717++;
        if (class171.field3553 != null) {
            class171.field3553.method509(true);
            class171.field3553 = null;
        }
        class167.method1129(118);
        if (arg0 > -29) {
            main(null);
        }
        class202.method1330((byte) 52);
        class206.field4053 = null;
        if (class183.field3711 != null) {
            class183.field3711.method505((byte) -15);
        }
        if (class132.field2868 != null) {
            class132.field2868.method505((byte) -15);
        }
        class33.method317((byte) -43);
        class104.method858(true);
        try {
            if (class80.field1941 != null) {
                class80.field1941.method167(1);
            }
            if (class63.field1617 != null) {
                for (int var2 = 0; var2 < class63.field1617.length; var2++) {
                    if (class63.field1617[var2] != null) {
                        class63.field1617[var2].method167(1);
                    }
                }
            }
            if (class175.field3590 != null) {
                class175.field3590.method167(1);
            }
            if (class180.field3666 != null) {
                class180.field3666.method167(1);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method200(int arg0) {
        field706++;
        method295(true);
        class63.method581(32);
        class19.method204(35);
        class1.method3(true);
        class18.method192(arg0 ^ 0xFFFFE91F);
        class188.method1235(64);
        class3.method38(arg0 - 18894);
        class52.method517(arg0 - 5991);
        class111.method891(true);
        class14.method158(115);
        class71.method666((byte) 63);
        class6.method92((byte) -85);
        class104.method855(-1);
        class79.method716((byte) -80);
        class54.method536(true);
        class62.method563(arg0 ^ 0xCFC);
        class148.method1032(arg0 ^ arg0);
        class78.method697(arg0 ^ 0x1703);
        class27.method267(35);
        class73.method677(false);
        class143.method1022((byte) 124);
        class51.method501((byte) 100);
        class141.method1014(arg0 ^ 0xFFFFE89A);
        class16.method173(-47);
        class9.method127(5);
        class47.method467((byte) -127);
        class123.method940(arg0 - 5928);
        class28.method272(94);
        class132.method969(true);
        class176.method1171(false);
        class122.method938((byte) 120);
        class80.method723(16565);
        class29.method288(-993700571);
        class36.method340();
        class174.method1160(0);
        class35.method324(arg0 ^ 0x1713);
        class192.method1263(arg0 ^ 0x1771);
        class96.method829((byte) 62);
        class98.method836(false);
        class121.method926(-5);
        class30.method301(-54);
        class116.method909(-32644);
        class109.method878(arg0 ^ 0xFFFFE88E);
        class41.method367(24642);
        class92.method799();
        class152.method1063(true);
        class160.method1097();
        class57.method551(7384);
        class166.method1124(-91);
        class135.method985(-45);
        class99.method837(2);
        class198.method1291((byte) -124);
        class77.method693(-5408);
        class38.method360(-1);
        class85.method742(-11112);
        class42.method394(false);
        class84.method737(38);
        class103.method852(-6102);
        class175.method1164((byte) 117);
        class69.method632((byte) -84);
        class134.method977(-32606);
        class125.method946(31173);
        class173.method1157((byte) -18);
        class10.method137((byte) -31);
        class112.method895(arg0 - 6103);
        class39.method363((byte) 126);
        class162.method1107(-99);
        class106.method868(19304);
        class178.method1192();
        class130.method961(true);
        class25.method254();
        class124.method942((byte) 37);
        class7.method106();
        class154.method1074(1048575);
        class94.method821(1);
        class165.method1119(81);
        class50.method490((byte) 53);
        class196.method1282((byte) 126);
        class184.method1220(-10333);
        class37.method343((byte) -66);
        class93.method817(arg0 ^ 0xFFFFE8EE);
        class66.method623();
        class33.method319(59786504);
        class46.method462((byte) 95);
        class72.method676((byte) 122);
        class138.method1001(arg0 + 26454);
        class164.method1116(false);
        class48.method478(8948);
        class70.method639();
        class190.method1257(false);
        class55.method542(true);
        class136.method988(96);
        class22.method226(0);
        class158.method1093(0);
        class151.method1060((byte) -124);
        class90.method776(14285);
        class15.method169(0);
        class117.method915((byte) -93);
        class59.method553(0);
        class169.method1139((byte) -72);
        class131.method965((byte) 91);
        class150.method1054(12737);
        class129.method960(arg0 ^ 0xFFFF9A6F);
        class115.method906();
        class203.method1344((byte) 9);
        class21.method224(0);
        class89.method771(arg0 ^ 0x1770);
        class113.method900(0);
        class40.method364((byte) 122);
        class65.method612(-116);
        class101.method846(true);
        class195.method1277(false);
        class177.method1174(arg0 ^ 0x1715);
        class157.method1085(-57);
        class139.method1006(1214583980);
        class26.method260(arg0 - 33296);
        class202.method1337((byte) 90);
        class23.method231((byte) 127);
        class68.method628((byte) 104);
        class43.method410((byte) 115);
        class61.method562();
        class20.method219();
        class114.method904(arg0 ^ 0x50661510);
        class159.method1096();
        class147.method1029(arg0 + 493256000);
        class170.method1147((byte) -102);
        class34.method323(arg0 - 6000);
        class31.method305();
        class167.method1128((byte) -101);
        class12.method147(arg0 ^ 0x1773);
        class17.method187((byte) -112);
        class2.method16();
        class53.method523();
        class32.method315(-21531);
        class88.method766((byte) -118);
        class189.method1239(arg0 - 5881);
        class100.method841(16777215);
        class105.method865((byte) 35);
        class180.method1196(547);
        class24.method236(110);
        class74.method683((byte) -120);
        class110.method883((byte) 124);
        class186.method1226(true);
        class199.method1300(-2449);
        class64.method607(arg0 + 16395);
        class49.method481(104);
        class140.method1008((byte) -83);
        class183.method1207(-101);
        class168.method1136((byte) -117);
        class187.method1231(arg0 ^ 0x7232DF9C);
        class81.method727((byte) 125);
        class91.method778((byte) -120);
        class206.method1357(28123);
        class13.method153(0);
        class181.method1201(20);
        class193.method1268((byte) 61);
        class171.method1150((byte) 46);
        class56.method546(-31339);
        class133.method971(8);
        class75.method689(3);
        class8.method116((byte) 13);
        class155.method1077((byte) -35);
        class60.method558(arg0 - 5996);
        class45.method456(-90);
        class161.method1098((byte) -64);
        class97.method833(arg0 - 5889);
        class191.method1260((byte) 39);
        class182.method1206((byte) 52);
        class144.method1025((byte) -30);
        class5.method86(arg0 - 6000);
        class126.method950(-122);
        class153.method1069((byte) 123);
        class108.method876((byte) -51);
        class4.method78(arg0 ^ 0x1772);
        class163.method1110(127);
        class83.method733((byte) -103);
        class11.method141((byte) 48);
        class127.method953(true);
        class118.method920(arg0 ^ 0xFFFFBA75);
        class142.method1018(false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method294(byte arg0, int arg1) {
        class129.field2826 = null;
        field708++;
        class164.field3381 = 0;
        if (class186.field3761 == class167.field3461) {
            class186.field3761 = class203.field4046;
        } else {
            class186.field3761 = class167.field3461;
        }
        class28.field616 = null;
        if (arg0 != 27) {
            this.method201(-51);
        }
        class10.field243++;
        if (class10.field243 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class136.field2932 <= 5) {
                this.method197("js5connect_full", arg0 ^ 0x2DB7);
                class136.field2932 = 1000;
            } else {
                class23.field538 = 3000;
            }
        } else if (class10.field243 >= 2 && arg1 == 6) {
            this.method197("js5connect_outofdate", arg0 ^ 0x2DB7);
            class136.field2932 = 1000;
        } else if (class10.field243 >= 4) {
            if (class136.field2932 <= 5) {
                this.method197("js5connect", arg0 + 11665);
                class136.field2932 = 1000;
            } else {
                class23.field538 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method213(int arg0) {
        class173.field3571++;
        if (class173.field3571 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class42.field988 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class118.field2641.setSeed((long) class42.field988);
        }
        this.method298(-95);
        field707++;
        class169.method1140(true);
        class192.method1265((byte) -100);
        class198.method1294((byte) -30);
        class18.method194((byte) -42);
        class106.method866((byte) 29);
        if (arg0 != 28051) {
            this.method297(35);
        }
        if (class206.field4053 != null) {
            int var3 = class206.field4053.method261((byte) 6);
            class164.field3384 = var3;
        }
        if (class136.field2932 == 0) {
            class192.method1264(122);
            class142.method1019((byte) 41);
        } else if (class136.field2932 == 5) {
            class48.method477(this, 255);
            class192.method1264(118);
            class142.method1019((byte) 41);
        } else if (class136.field2932 == 10) {
            class48.method477(this, arg0 - 27796);
        } else if (class136.field2932 == 20) {
            class48.method477(this, 255);
            class80.method721(arg0 ^ 0x6D90);
        } else if (class136.field2932 == 25) {
            class62.method565(2047);
        }
        if (class136.field2932 == 30) {
            class141.method1015((byte) -84);
        } else if (class136.field2932 == 40) {
            class80.method721(3);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static void method295(boolean arg0) {
        field703 = null;
        field712 = null;
        if (arg0) {
            field713 = null;
            field720 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class90.method777(false);
            }
            class105.field2408 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class175.field3589 = 0;
            } else if (arg0[1].equals("office")) {
                class175.field3589 = 1;
            } else if (arg0[1].equals("local")) {
                class175.field3589 = 2;
            } else {
                class90.method777(false);
            }
            if (arg0[2].equals("live")) {
                class94.field2265 = 0;
            } else if (arg0[2].equals("rc")) {
                class94.field2265 = 1;
            } else if (arg0[2].equals("wip")) {
                class94.field2265 = 2;
            } else {
                class90.method777(false);
            }
            if (arg0[3].equals("lowmem")) {
                class30.method304(100);
            } else if (arg0[3].equals("highmem")) {
                class6.method94(true);
            } else {
                class90.method777(false);
            }
            if (arg0[4].equals("free")) {
                class51.field1259 = false;
            } else if (arg0[4].equals("members")) {
                class51.field1259 = true;
            } else {
                class90.method777(false);
            }
            if (arg0[5].equals("english")) {
                class22.field512 = 0;
            } else if (arg0[5].equals("german")) {
                class125.method948(-384);
                class22.field512 = 1;
                class151.field3178 = class27.field613;
            } else {
                class90.method777(false);
            }
            if (arg0[6].equals("game0")) {
                class51.field1248 = 0;
            } else if (arg0[6].equals("game1")) {
                class51.field1248 = 1;
            } else {
                class90.method777(false);
            }
            class83.field1966 = "127.0.0.1";
            client var1 = new client();
            var1.method208("runescape", 503, 765, class94.field2265 + 32, (byte) -46, 480, 16);
            class153.field3193.setLocation(40, 40);
        } catch (Exception var3) {
            class199.method1302(null, var3, true);
        }
        field716++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field711++;
        if (!this.method202((byte) 126)) {
            return;
        }
        class105.field2408 = Integer.parseInt(this.getParameter("worldid"));
        class94.field2265 = Integer.parseInt(this.getParameter("modewhat"));
        class175.field3589 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class30.method304(100);
        } else {
            class6.method94(true);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class51.field1259 = true;
        } else {
            class51.field1259 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class125.method948(-384);
            class22.field512 = 1;
            class151.field3178 = class27.field613;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class51.field1248 = 1;
        } else {
            class51.field1248 = 0;
        }
        try {
            class91.field2131 = Integer.parseInt(this.getParameter("js"));
            class59.field1518 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class83.field1966 = this.getCodeBase().getHost();
        this.method199(0, class94.field2265 + 32, 503, 480, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Lof;")
    public static final class132 method296(int arg0, int arg1, int arg2, int arg3) {
        field718++;
        class132 var4 = new class132();
        var4.field2875 = arg1;
        var4.field2865 = arg3;
        class133.field2885.method702((byte) 111, var4, (long) arg0);
        class6.method91(76, arg3);
        class50.method491(arg3, (byte) -83);
        class54 var5 = class59.method555(arg0, 32173);
        if (var5 != null) {
            class113.method901(0, var5);
        }
        if (class198.field3967 != null) {
            class113.method901(0, class198.field3967);
            class198.field3967 = null;
        }
        class188.field3796 = false;
        class166.field3404 = 0;
        int var6 = 123 % ((arg2 - 76) / 34);
        class19.method196(class175.field3606, class151.field3177, class39.field926, class109.field2451, -51);
        if (class130.field2836 != -1) {
            class103.method853((byte) -26, class130.field2836, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method297(int arg0) {
        field702++;
        if (class109.field2465 >= 4) {
            this.method197("js5crc", 11692);
            class136.field2932 = 1000;
            return;
        }
        if (class174.field3581 >= 4) {
            if (class136.field2932 <= 5) {
                this.method197("js5io", 11692);
                class136.field2932 = 1000;
                return;
            }
            class174.field3581 = 3;
            class23.field538 = 3000;
        }
        if (arg0 != -4443) {
            this.method211(51);
        }
        if (class23.field538-- > 0) {
            return;
        }
        try {
            if (class164.field3381 == 0) {
                class129.field2826 = class79.field1924.method1047(class186.field3761, (byte) -61, class83.field1966);
                class164.field3381++;
            }
            if (class164.field3381 == 1) {
                if (class129.field2826.field2058 == 2) {
                    this.method294((byte) 27, -1);
                    return;
                }
                if (class129.field2826.field2058 == 1) {
                    class164.field3381++;
                }
            }
            if (class164.field3381 == 2) {
                class28.field616 = new class52((Socket) class129.field2826.field2060, class79.field1924);
                class3 var2 = new class3(5);
                var2.method66(arg0 + 4445, 15);
                var2.method76(480, (byte) 114);
                class28.field616.method512(0, 5, var2.field48, (byte) 83);
                class164.field3381++;
                class158.field3279 = class198.method1295((byte) 40);
            }
            if (class164.field3381 == 3) {
                if (class136.field2932 <= 5 || class28.field616.method510((byte) 99) > 0) {
                    int var3 = class28.field616.method516((byte) -105);
                    if (var3 != 0) {
                        this.method294((byte) 27, var3);
                        return;
                    }
                    class164.field3381++;
                } else if (class198.method1295((byte) 102) - class158.field3279 > 30000L) {
                    this.method294((byte) 27, -2);
                    return;
                }
            }
            if (class164.field3381 == 4) {
                class163.method1111(class28.field616, 0, class136.field2932 > 20);
                class10.field243 = 0;
                class129.field2826 = null;
                class28.field616 = null;
                class164.field3381 = 0;
            }
        } catch (IOException var4) {
            this.method294((byte) 27, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method212(boolean arg0) {
        class167.field3461 = class175.field3589 == 0 ? 43594 : class105.field2408 + 40000;
        if (class51.field1248 == 1) {
            class65.field1650 = class18.field437;
            class71.field1793 = class57.field1495;
            class35.field826 = class52.field1264;
            class174.field3583 = class13.field297;
        } else {
            class174.field3583 = class125.field2766;
            class65.field1650 = class168.field3480;
            class35.field826 = class139.field2992;
            class71.field1793 = class26.field604;
        }
        class203.field4046 = class175.field3589 == 0 ? 443 : class105.field2408 + 50000;
        field700++;
        class186.field3761 = class167.field3461;
        class196.method1278(-4654);
        class203.method1345(-112, class49.field1193);
        class165.method1121(class49.field1193, -74);
        class206.field4053 = class26.method256(124);
        if (class206.field4053 != null) {
            class206.field4053.method263((byte) 2, class49.field1193);
        }
        class161.field3321 = class149.field3147;
        try {
            if (class79.field1924.field3138 != null) {
                class80.field1941 = new class14(class79.field1924.field3138, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class63.field1617[var2] = new class14(class79.field1924.field3142[var2], 6000, 0);
                }
                class175.field3590 = new class14(class79.field1924.field3140, 6000, 0);
                class22.field523 = new class71(255, class80.field1941, class175.field3590, 500000);
                class180.field3666 = new class14(class79.field1924.field3144, 24, 0);
                class79.field1924.field3138 = null;
                class79.field1924.field3142 = null;
                class79.field1924.field3140 = null;
                class79.field1924.field3144 = null;
            }
        } catch (IOException var3) {
            class175.field3590 = null;
            class22.field523 = null;
            class80.field1941 = null;
            class180.field3666 = null;
        }
        if (class175.field3589 != 0) {
            class190.field3866 = true;
        }
        if (arg0) {
            method299((byte) 76);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method298(int arg0) {
        field701++;
        if (arg0 >= -73) {
            this.method294((byte) 19, 35);
        }
        if (class136.field2932 != 1000) {
            boolean var2 = class167.method1131(-48);
            if (!var2) {
                this.method297(-4443);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static final void method299(byte arg0) {
        class113.method901(0, class198.field3963);
        class148.field3121++;
        field710++;
        if (class162.field3338 && class142.field3051) {
            int var1 = class188.field3794;
            int var2 = class198.field3963.field1434;
            int var3 = class100.field2365;
            if (arg0 > -104) {
                field713 = null;
            }
            int var4 = var3 - class34.field811;
            if (var4 < class103.field2380) {
                var4 = class103.field2380;
            }
            int var5 = var1 - class46.field1094;
            if (var5 < class28.field648) {
                var5 = class28.field648;
            }
            if (class103.field2380 + class174.field3584.field1302 < class198.field3963.field1302 + var4) {
                var4 = class103.field2380 + class174.field3584.field1302 - class198.field3963.field1302;
            }
            if (class198.field3963.field1435 + var5 > class28.field648 + class174.field3584.field1435) {
                var5 = class28.field648 + class174.field3584.field1435 - class198.field3963.field1435;
            }
            int var6 = var5 - class93.field2198;
            int var7 = var4 + class174.field3584.field1390 - class103.field2380;
            int var8 = var5 + class174.field3584.field1405 - class28.field648;
            int var9 = var4 - class132.field2873;
            if (class148.field3121 > class198.field3963.field1309 && (var9 > var2 || -var2 > var9 || var2 < var6 || -var2 > var6)) {
                class104.field2398 = true;
            }
            if (class198.field3963.field1306 != null && class104.field2398) {
                class131 var10 = new class131();
                var10.field2856 = var8;
                var10.field2862 = class198.field3963;
                var10.field2853 = class198.field3963.field1306;
                var10.field2854 = var7;
                class130.method963(var10, (byte) -66);
            }
            if (class168.field3471 == 0) {
                if (class104.field2398) {
                    if (class198.field3963.field1345 != null) {
                        class131 var11 = new class131();
                        var11.field2854 = var7;
                        var11.field2848 = class106.field2411;
                        var11.field2862 = class198.field3963;
                        var11.field2856 = var8;
                        var11.field2853 = class198.field3963.field1345;
                        class130.method963(var11, (byte) -121);
                    }
                    if (class106.field2411 != null && class157.method1089(true, class198.field3963) != null) {
                        class141.field3031.method854(181, true);
                        class141.field3031.method22(class198.field3963.field1323, 458634000);
                        class32.field782++;
                        class141.field3031.method76(class106.field2411.field1323, (byte) 114);
                        class141.field3031.method54((byte) -14, class198.field3963.field1408);
                        class141.field3031.method54((byte) -14, class106.field2411.field1408);
                    }
                } else if ((class182.field3694 == 1 || class127.method955((byte) 100, class166.field3404 - 1)) && class166.field3404 > 2) {
                    class186.method1223((byte) 126);
                } else if (class166.field3404 > 0) {
                    class116.method912((byte) 97, class166.field3404 - 1);
                }
                class198.field3963 = null;
            }
        } else if (class148.field3121 > 1) {
            class198.field3963 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public static final void method300(int arg0, boolean arg1) {
        class83.field1976 = arg1;
        field699++;
        if (class83.field1976) {
            int var2 = class167.field3437.method36((byte) -123);
            int var3 = class167.field3437.method36((byte) -94);
            int var4 = class167.field3437.method33(78);
            class167.field3437.method857((byte) 67);
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class167.field3437.method856((byte) 2, 1);
                        if (var24 == 1) {
                            class32.field789[var5][var22][var23] = class167.field3437.method856((byte) 2, 26);
                        } else {
                            class32.field789[var5][var22][var23] = -1;
                        }
                    }
                }
            }
            class167.field3437.method860((byte) -112);
            int var6 = (class112.field2531 - class167.field3437.field54) / 16;
            class121.field2665 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class121.field2665[var7][var21] = class167.field3437.method37((byte) -3);
                }
            }
            int var8 = class167.field3437.method31((byte) -127);
            int var9 = class167.field3437.method46((byte) 65);
            class138.field2953 = new byte[var6][];
            class187.field3770 = new int[var6];
            class32.field790 = new int[var6];
            class52.field1283 = new byte[var6][];
            class182.field3691 = new int[var6];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class32.field789[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 3 & 0x7FF;
                            int var16 = var14 >> 14 & 0x3FF;
                            int var17 = (var16 / 8 << 8) + var15 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class182.field3691[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class182.field3691[var10] = var17;
                                int var19 = var17 >> 8 & 0xFF;
                                int var20 = var17 & 0xFF;
                                class32.field790[var10] = class47.field1142.method751(-29355, class89.method772((byte) 29, new class63[] { class11.field263, class175.method1162((byte) -126, var19), class175.field3587, class175.method1162((byte) -126, var20) }));
                                class187.field3770[var10] = class47.field1142.method751(-29355, class89.method772((byte) 63, new class63[] { class26.field594, class175.method1162((byte) -126, var19), class175.field3587, class175.method1162((byte) -126, var20) }));
                                var10++;
                            }
                        }
                    }
                }
            }
            class165.method1118(var8, var3, var2, var9, var4, (byte) 120);
        } else {
            int var25 = class167.field3437.method46((byte) 65);
            int var26 = (class112.field2531 - class167.field3437.field54) / 16;
            class121.field2665 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class121.field2665[var27][var37] = class167.field3437.method37((byte) -3);
                }
            }
            int var28 = class167.field3437.method40(2);
            int var29 = class167.field3437.method40(2);
            int var30 = class167.field3437.method31((byte) -127);
            int var31 = class167.field3437.method64(arg0 + 31791);
            class182.field3691 = new int[var26];
            class187.field3770 = new int[var26];
            class52.field1283 = new byte[var26][];
            boolean var32 = false;
            class138.field2953 = new byte[var26][];
            class32.field790 = new int[var26];
            int var33 = 0;
            if ((var25 / 8 == 48 || var25 / 8 == 49) && var30 / 8 == 48) {
                var32 = true;
            }
            if (var25 / 8 == 48 && var30 / 8 == 148) {
                var32 = true;
            }
            for (int var34 = (var25 - 6) / 8; var34 <= (var25 + 6) / 8; var34++) {
                for (int var35 = (var30 - 6) / 8; var35 <= (var30 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class182.field3691[var33] = var36;
                        class32.field790[var33] = class47.field1142.method751(-29355, class89.method772((byte) 43, new class63[] { class11.field263, class175.method1162((byte) -126, var34), class175.field3587, class175.method1162((byte) -126, var35) }));
                        class187.field3770[var33] = class47.field1142.method751(class180.method1200(arg0, 29354), class89.method772((byte) 62, new class63[] { class26.field594, class175.method1162((byte) -126, var34), class175.field3587, class175.method1162((byte) -126, var35) }));
                        var33++;
                    }
                }
            }
            class165.method1118(var30, var28, var29, var25, var31, (byte) 93);
        }
        if (arg0 != -1) {
            field712 = null;
        }
    }
}
