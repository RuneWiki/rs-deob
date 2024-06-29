import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class158 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lhe;")
    public static class54 field596 = class6.method58("auf einer freien Welt zu spielen)3", false);

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lsf;")
    public static class131 field602 = new class131(20);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lhe;")
    private static class54 field606 = class6.method58("Please wait 5 minutes before trying again)3", false);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lhe;")
    private static class54 field604 = class6.method58("Your account is already logged in)3", false);

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lhe;")
    public static class54 field608 = field606;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Lhe;")
    public static class54 field605 = class6.method58("Lade Texturen )2 ", false);

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lhe;")
    public static class54 field610 = field604;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Leb;")
    public static class31 field607;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lef;")
    public static class35 field609;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method167(int arg0) {
        class53.field1275 = class19.field543 == 0 ? 443 : class123.field2828 + 50000;
        if (class43.field1093 == 1) {
            class8.field229 = class59.field1488;
            class56.field1408 = class79.field1945;
            class32.field828 = class74.field1826;
            class100.field2539 = class24.field662;
        } else {
            class100.field2539 = class149.field3381;
            class56.field1408 = class2.field24;
            class8.field229 = class15.field452;
            class32.field828 = class27.field726;
        }
        class93.field2240 = class19.field543 == 0 ? 43594 : class123.field2828 + 40000;
        field601++;
        class129.field2894 = class93.field2240;
        class102.method800((byte) -66);
        class67.method522((byte) 79, class70.field1753);
        class53.method379(true, class70.field1753);
        if (arg0 != 0) {
            field608 = null;
        }
        class4.field134 = class144.method1112(true);
        if (class4.field134 != null) {
            class4.field134.method600(117, class70.field1753);
        }
        class158.field3607 = class148.field3344;
        try {
            if (class80.field1963.field3333 != null) {
                class95.field2414 = new class57(class80.field1963.field3333, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class49.field1174[var2] = new class57(class80.field1963.field3346[var2], 6000, 0);
                }
                class12.field328 = new class57(class80.field1963.field3332, 6000, 0);
                class18.field523 = new class17(255, class95.field2414, class12.field328, 500000);
                class80.field1963.field3332 = null;
                class80.field1963.field3333 = null;
                class80.field1963.field3346 = null;
            }
        } catch (IOException var3) {
            class12.field328 = null;
            class18.field523 = null;
            class95.field2414 = null;
        }
        if (class19.field543 != 0) {
            class75.field1863 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLef;)V")
    public static final void method168(byte arg0, class35 arg1) {
        if (arg0 != 45) {
            field607 = null;
        }
        field592++;
        class130.field2953 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method169(boolean arg0) {
        field593++;
        if (class57.field1445 >= 4) {
            this.method1215((byte) 104, "js5crc");
            class105.field2604 = 1000;
            return;
        }
        if (class133.field3002 >= 4) {
            if (class105.field2604 <= 5) {
                this.method1215((byte) -54, "js5io");
                class105.field2604 = 1000;
                return;
            }
            class133.field3002 = 3;
            class84.field2086 = 3000;
        }
        if (class84.field2086-- > 0) {
            return;
        }
        try {
            if (arg0) {
                field596 = null;
            }
            if (class95.field2419 == 0) {
                class24.field672 = class80.field1963.method1125((byte) 120, class52.field1241, class129.field2894);
                class95.field2419++;
            }
            if (class95.field2419 == 1) {
                if (class24.field672.field1145 == 2) {
                    this.method174(-76, -1);
                    return;
                }
                if (class24.field672.field1145 == 1) {
                    class95.field2419++;
                }
            }
            if (class95.field2419 == 2) {
                class1.field2 = new class149((Socket) class24.field672.field1143, class80.field1963);
                class83 var2 = new class83(5);
                var2.method649((byte) -27, 15);
                var2.method658(181, 464);
                class1.field2.method1132(5, 0, 121, var2.field2055);
                class95.field2419++;
                class18.field521 = class102.method801((byte) -42);
            }
            if (class95.field2419 == 3) {
                if (class105.field2604 <= 5 || class1.field2.method1138(true) > 0) {
                    int var3 = class1.field2.method1133(-128);
                    if (var3 != 0) {
                        this.method174(-70, var3);
                        return;
                    }
                    class95.field2419++;
                } else if (class102.method801((byte) -42) - class18.field521 > 30000L) {
                    this.method174(104, -2);
                    return;
                }
            }
            if (class95.field2419 == 4) {
                class107.method819(class105.field2604 > 20, arg0, class1.field2);
                class1.field2 = null;
                class13.field367 = 0;
                class95.field2419 = 0;
                class24.field672 = null;
            }
        } catch (IOException var4) {
            this.method174(108, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        boolean var2 = class129.method969((byte) 90);
        int var3 = 6 / ((arg0 - 6) / 52);
        if (var2 && class52.field1236 && class21.field581 != null) {
            class21.field581.method608((byte) -13);
        }
        field599++;
        if (class146.field3300) {
            class14.method108(class70.field1753, 4);
            class56.method433(class70.field1753, 0);
            if (class4.field134 != null) {
                class4.field134.method604(3294, class70.field1753);
            }
            this.method1210(-56);
            class67.method522((byte) 79, class70.field1753);
            class53.method379(true, class70.field1753);
            if (class4.field134 != null) {
                class4.field134.method600(127, class70.field1753);
            }
        }
        if (class105.field2604 == 0) {
            class11.method87(class66.field1602, null, false, class4.field139);
        } else if (class105.field2604 == 5) {
            class140.method1086(class135.field3067, 124, class65.field1570);
        } else if (class105.field2604 == 10) {
            class140.method1086(class135.field3067, 121, class65.field1570);
        } else if (class105.field2604 == 20) {
            class140.method1086(class135.field3067, 119, class65.field1570);
        } else if (class105.field2604 == 25) {
            if (class121.field2807 == 1) {
                if (class141.field3210 > class58.field1462) {
                    class58.field1462 = class141.field3210;
                }
                int var4 = (class58.field1462 - class141.field3210) * 50 / class58.field1462;
                class35.method256(false, class143.method1105(new class54[] { class12.field334, class85.field2112, class147.method1117(-7, var4), class63.field1537 }, -842), (byte) -126);
            } else if (class121.field2807 == 2) {
                if (class150.field3396 > class89.field2190) {
                    class89.field2190 = class150.field3396;
                }
                int var5 = (class89.field2190 - class150.field3396) * 50 / class89.field2190 + 50;
                class35.method256(false, class143.method1105(new class54[] { class12.field334, class85.field2112, class147.method1117(-50, var5), class63.field1537 }, -842), (byte) -126);
            } else {
                class35.method256(false, class12.field334, (byte) -126);
            }
        } else if (class105.field2604 == 30) {
            class49.method348(false);
        } else if (class105.field2604 == 40) {
            class35.method256(false, class143.method1105(new class54[] { class131.field2961, class18.field518, class156.field3528 }, -842), (byte) -126);
        }
        if (class105.field2604 == 30 && class102.field2546 == 0 && !class27.field716) {
            try {
                Graphics var8 = class70.field1753.getGraphics();
                for (int var9 = 0; var9 < class16.field476; var9++) {
                    if (class32.field832[var9]) {
                        class124.field2852.method80(class150.field3390[var9], (byte) 96, var8, class49.field1192[var9], class38.field972[var9], class79.field1943[var9]);
                        class32.field832[var9] = false;
                    }
                }
            } catch (Exception var10) {
                class70.field1753.repaint();
            }
        } else if (class105.field2604 > 0) {
            try {
                Graphics var6 = class70.field1753.getGraphics();
                class124.field2852.method81(var6, 0, 0, true);
                class27.field716 = false;
                for (int var7 = 0; var7 < class16.field476; var7++) {
                    class32.field832[var7] = false;
                }
            } catch (Exception var11) {
                class70.field1753.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method171(int arg0) {
        field589++;
        class4.field138++;
        this.method172((byte) -97);
        class141.method1091(arg0 + 19134);
        class103.method809(0);
        if (arg0 != -19134) {
            return;
        }
        class78.method595((byte) 0);
        class65.method505(-490212280);
        class137.method1066((byte) 72);
        if (class4.field134 != null) {
            int var2 = class4.field134.method601(-28);
            class6.field184 = var2;
        }
        if (class105.field2604 == 0) {
            class100.method794(false);
            class4.method29(-1);
        } else if (class105.field2604 == 5) {
            class78.method597(this, 123);
            class100.method794(false);
            class4.method29(-1);
        } else if (class105.field2604 == 10) {
            class78.method597(this, 117);
        } else if (class105.field2604 == 20) {
            class78.method597(this, 123);
            class56.method436((byte) -95);
        } else if (class105.field2604 == 25) {
            class78.method594((byte) -2);
        }
        if (class105.field2604 == 30) {
            class123.method946(1);
        } else if (class105.field2604 == 40) {
            class56.method436((byte) -95);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method172(byte arg0) {
        field600++;
        if (class105.field2604 == 1000) {
            return;
        }
        boolean var2 = class142.method1098((byte) 126);
        if (!var2) {
            this.method169(false);
        }
        int var3 = -59 % ((-arg0 - 10) / 45);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method173(int arg0) {
        method175(true);
        class54.method389((byte) -124);
        field590++;
        class158.method1213(-95);
        class28.method216((byte) 116);
        class26.method200((byte) -128);
        class103.method807(0);
        class83.method639(0);
        class149.method1129(false);
        class31.method238((byte) -82);
        class57.method448(77);
        class17.method149(0);
        class120.method930(2);
        class58.method459(1);
        class136.method1023();
        class4.method44(false);
        class93.method745(123);
        class22.method181(65535);
        class130.method981(false);
        class32.method243(88);
        class79.method605(-122);
        class51.method363(30);
        class80.method618(-2948);
        class13.method96((byte) -5);
        class68.method542(-3);
        class142.method1095((byte) -80);
        class38.method291(-88);
        class43.method328(1);
        class9.method75(-23648);
        class112.method843(true);
        class5.method47((byte) 100);
        class65.method507((byte) 123);
        class63.method496(98);
        class131.method987((byte) -117);
        class98.method785();
        if (arg0 > -23) {
            return;
        }
        class41.method308();
        class59.method467(16589);
        class21.method165(32768);
        class139.method1081((byte) 59);
        class24.method190(true);
        class134.method1008(1);
        class19.method160(true);
        class53.method377(true);
        class135.method1014((byte) -128);
        class50.method358(-30004);
        class147.method1116((byte) 36);
        class8.method68(0);
        class96.method765();
        class77.method589(14778);
        class115.method874(4);
        class34.method252(-95);
        class137.method1067((byte) -7);
        class102.method803(false);
        class91.method730(467836531);
        class71.method560((byte) -53);
        class35.method276((byte) -98);
        class14.method106((byte) -40);
        class156.method1203(false);
        class146.method1113(-116);
        class129.method970(77);
        class15.method141((byte) 58);
        class94.method750(3);
        class49.method354(8421);
        class11.method89(3);
        class1.method4(-98);
        class84.method685((byte) -63);
        class124.method954(true);
        class150.method1142((byte) 60);
        class155.method1194(128);
        class90.method728();
        class121.method932(true);
        class152.method1149();
        class72.method562(0);
        class60.method476();
        class144.method1108(-75);
        class141.method1090(false);
        class157.method1206((byte) 20);
        class75.method578((byte) 31);
        class6.method56(false);
        class95.method759((byte) 20);
        class3.method24((byte) 74);
        class67.method520(0);
        class107.method817(115);
        class52.method366(false);
        class27.method209(-121);
        class85.method689(true);
        class40.method301(124);
        class154.method1176();
        class66.method516(16);
        class117.method882();
        class88.method699(0);
        class64.method502(1);
        class125.method958(-53);
        class89.method708((byte) -113);
        class7.method64((byte) 95);
        class138.method1075(true);
        class133.method1001(120);
        class73.method570(60);
        class2.method11(4634);
        class100.method795(true);
        class18.method155(126);
        class118.method888((byte) 34);
        class153.method1164();
        class70.method554(false);
        class44.method329((byte) -65);
        class108.method822(87);
        class48.method343(-2);
        class74.method572(3052);
        class132.method995((byte) 95);
        class140.method1085(true);
        class99.method793((byte) 7);
        class87.method697(-116);
        class16.method146(256);
        class56.method437((byte) 88);
        class82.method627(-125);
        class123.method944(-106);
        class105.method812(-57);
        class12.method93(false);
        class97.method766();
        class110.method830();
        class62.method493(-1);
        class81.method624();
        class143.method1106((byte) -126);
        class86.method694((byte) -89);
        class47.method340();
        class78.method596((byte) -110);
        class114.method872(0);
        class111.method838(-10159);
        class55.method431();
        class29.method224();
        class151.method1143(-8);
        class39.method294((byte) -122);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method174(int arg0, int arg1) {
        field598++;
        if (class93.field2240 == class129.field2894) {
            class129.field2894 = class53.field1275;
        } else {
            class129.field2894 = class93.field2240;
        }
        class1.field2 = null;
        int var3 = -38 / ((arg0 - 42) / 55);
        class95.field2419 = 0;
        class24.field672 = null;
        class13.field367++;
        if (class13.field367 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class105.field2604 > 5) {
                class84.field2086 = 3000;
            } else {
                this.method1215((byte) -95, "js5connect_full");
                class105.field2604 = 1000;
            }
        } else if (class13.field367 >= 2 && arg1 == 6) {
            this.method1215((byte) 36, "js5connect_outofdate");
            class105.field2604 = 1000;
        } else if (class13.field367 >= 4) {
            if (class105.field2604 > 5) {
                class84.field2086 = 3000;
            } else {
                this.method1215((byte) 24, "js5connect");
                class105.field2604 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class86.method693(1);
            }
            class123.field2828 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class19.field543 = 0;
            } else if (arg0[1].equals("office")) {
                class19.field543 = 1;
            } else if (arg0[1].equals("local")) {
                class19.field543 = 2;
            } else {
                class86.method693(1);
            }
            if (arg0[2].equals("live")) {
                class89.field2195 = 0;
            } else if (arg0[2].equals("rc")) {
                class89.field2195 = 1;
            } else if (arg0[2].equals("wip")) {
                class89.field2195 = 2;
            } else {
                class86.method693(1);
            }
            if (arg0[3].equals("lowmem")) {
                class125.method956(true);
            } else if (arg0[3].equals("highmem")) {
                class139.method1080((byte) 124);
            } else {
                class86.method693(1);
            }
            if (arg0[4].equals("free")) {
                class150.field3395 = false;
            } else if (arg0[4].equals("members")) {
                class150.field3395 = true;
            } else {
                class86.method693(1);
            }
            if (arg0[5].equals("english")) {
                class31.field802 = 0;
            } else if (arg0[5].equals("german")) {
                class53.method372(0);
                class31.field802 = 1;
                class24.field679 = class21.field587;
            } else {
                class86.method693(1);
            }
            if (arg0[6].equals("game0")) {
                class43.field1093 = 0;
            } else if (arg0[6].equals("game1")) {
                class43.field1093 = 1;
            } else {
                class86.method693(1);
            }
            class52.field1241 = "127.0.0.1";
            client var1 = new client();
            var1.method1212(16, 765, 503, 464, "runescape", false, class89.field2195 + 32);
        } catch (Exception var3) {
            class48.method345(var3, -65, null);
        }
        field594++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public static void method175(boolean arg0) {
        field606 = null;
        field605 = null;
        field604 = null;
        field610 = null;
        if (!arg0) {
            method168((byte) 47, null);
        }
        field608 = null;
        field609 = null;
        field607 = null;
        field596 = null;
        field602 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method176(int arg0) {
        field597++;
        if (class63.field1543 != null) {
            class63.field1543.field2565 = false;
        }
        if (arg0 != -18075) {
            return;
        }
        class63.field1543 = null;
        if (class142.field3236 != null) {
            class142.field3236.method1130(-31709);
            class142.field3236 = null;
        }
        class140.method1082(arg0 ^ 0x4689);
        class149.method1131(-121);
        class4.field134 = null;
        if (class21.field581 != null) {
            class21.field581.method615(71);
        }
        if (class52.field1273 != null) {
            class52.field1273.method615(101);
        }
        class100.method796((byte) 8);
        class58.method462(-1432215741);
        try {
            if (class95.field2414 != null) {
                class95.field2414.method441((byte) -46);
            }
            if (class49.field1174 != null) {
                for (int var2 = 0; var2 < class49.field1174.length; var2++) {
                    if (class49.field1174[var2] != null) {
                        class49.field1174[var2].method441((byte) -117);
                    }
                }
            }
            if (class12.field328 != null) {
                class12.field328.method441((byte) -49);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILfb;)V")
    public static final void method177(int arg0, int arg1, class38 arg2) {
        field603++;
        if (class4.field138 < arg2.field928) {
            class74.method573(arg2, false);
        } else if (class4.field138 > arg2.field985) {
            class107.method816(false, arg2);
        } else {
            class12.method91(arg1 ^ 0x6, arg2);
        }
        if (arg1 != 4) {
            field596 = null;
        }
        if (arg2.field974 < 128 || arg2.field971 < 128 || arg2.field974 >= 13184 || arg2.field971 >= 13184) {
            arg2.field930 = -1;
            arg2.field928 = 0;
            arg2.field985 = 0;
            arg2.field974 = arg2.field952[0] * 128 + arg2.field948 * 64;
            arg2.field971 = arg2.field951[0] * 128 + arg2.field948 * 64;
            arg2.field981 = -1;
            arg2.method286(true);
        }
        if (class108.field2639 == arg2 && (arg2.field974 < 1536 || arg2.field971 < 1536 || arg2.field974 >= 11776 || arg2.field971 >= 11776)) {
            arg2.field971 = arg2.field951[0] * 128 + arg2.field948 * 64;
            arg2.field928 = 0;
            arg2.field930 = -1;
            arg2.field985 = 0;
            arg2.field974 = arg2.field952[0] * 128 + arg2.field948 * 64;
            arg2.field981 = -1;
            arg2.method286(true);
        }
        class32.method250(arg2, (byte) -109);
        class54.method402(arg1 - 42, arg2);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field595++;
        if (!this.method1219(0)) {
            return;
        }
        class123.field2828 = Integer.parseInt(this.getParameter("worldid"));
        class89.field2195 = Integer.parseInt(this.getParameter("modewhat"));
        class19.field543 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class125.method956(true);
        } else {
            class139.method1080((byte) 124);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class150.field3395 = true;
        } else {
            class150.field3395 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class53.method372(0);
            class31.field802 = 1;
            class24.field679 = class21.field587;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class43.field1093 = 1;
        } else {
            class43.field1093 = 0;
        }
        try {
            class93.field2287 = Integer.parseInt(this.getParameter("js"));
            class50.field1207 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class52.field1241 = this.getCodeBase().getHost();
        this.method1218(464, 503, (byte) 33, 765, class89.field2195 + 32);
    }
}
