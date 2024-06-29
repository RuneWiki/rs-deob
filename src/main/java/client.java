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
public class client extends class153 {

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Lcc;")
    public static class209 field2812 = null;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lhl;")
    public static class39 field2818 = new class39(5000);

    @OriginalMember(owner = "client!client", name = "E", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lji;)I")
    public static final int method1070(class42 arg0) {
        class18 var1 = (class18) class9.field183.method1755(((long) arg0.field779 << 32) + (long) arg0.field721, (byte) -122);
        return var1 == null ? arg0.field747 : var1.field363;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    private final void method1071(int arg0) {
        field2810++;
        if (class265.field4759.field3631 > class249.field4486) {
            class193.field3493 = (class265.field4759.field3631 - 1) * 250;
            if (class193.field3493 > 3000) {
                class193.field3493 = 3000;
            }
            if (class59.field1186 == class45.field898) {
                class45.field898 = class155.field2845;
            } else {
                class45.field898 = class59.field1186;
            }
            if (class265.field4759.field3631 >= 2 && class265.field4759.field3633 == 6) {
                this.method1062("js5connect_outofdate", (byte) 58);
                class284.field5008 = 1000;
                return;
            }
            if (class265.field4759.field3631 >= 4 && class265.field4759.field3633 == -1) {
                this.method1062("js5crc", (byte) 58);
                class284.field5008 = 1000;
                return;
            }
            if (class265.field4759.field3631 >= 4 && (class284.field5008 == 0 || class284.field5008 == 5)) {
                if (class265.field4759.field3633 == 7 || class265.field4759.field3633 == 9) {
                    this.method1062("js5connect_full", (byte) 93);
                } else if (class265.field4759.field3633 <= 0) {
                    this.method1062("js5io", (byte) 72);
                } else {
                    this.method1062("js5connect", (byte) 89);
                }
                class284.field5008 = 1000;
                return;
            }
        }
        class249.field4486 = class265.field4759.field3631;
        if (class193.field3493 > 0) {
            class193.field3493--;
            return;
        }
        try {
            if (class181.field3282 == 0) {
                class73.field1385 = class230.field4187.method994(class45.field898, -32322, class64.field1255);
                class181.field3282++;
            }
            if (class181.field3282 == 1) {
                if (class73.field1385.field3646 == 2) {
                    this.method1080(102, 1000);
                    return;
                }
                if (class73.field1385.field3646 == 1) {
                    class181.field3282++;
                }
            }
            if (class181.field3282 == 2) {
                class195.field3502 = new class285((Socket) class73.field1385.field3642, class230.field4187);
                class106 var2 = new class106(5);
                var2.method773(-6385, 15);
                var2.method758(523, 1469334200);
                class195.field3502.method1921(var2.field2108, 5, -32362, 0);
                class181.field3282++;
                class22.field424 = class180.method1236(100);
            }
            if (arg0 <= 14) {
                field2812 = null;
            }
            if (class181.field3282 == 3) {
                if (class284.field5008 == 0 || class284.field5008 == 5 || class195.field3502.method1915(1) > 0) {
                    int var3 = class195.field3502.method1918((byte) -83);
                    if (var3 != 0) {
                        this.method1080(61, var3);
                        return;
                    }
                    class181.field3282++;
                } else if (class180.method1236(-115) - class22.field424 > 30000L) {
                    this.method1080(51, 1001);
                    return;
                }
            }
            if (class181.field3282 == 4) {
                boolean var4 = class284.field5008 == 5 || class284.field5008 == 10 || class284.field5008 == 28;
                class265.field4759.method1391((byte) -78, class195.field3502, !var4);
                class73.field1385 = null;
                class181.field3282 = 0;
                class195.field3502 = null;
            }
        } catch (IOException var5) {
            this.method1080(109, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public static void method1072(int arg0) {
        field2812 = null;
        field2818 = null;
        if (arg0 != -5571) {
            field2818 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)[Lal;")
    public static final class231[] method1073(int arg0) {
        field2819++;
        class231[] var1 = new class231[class191.field3465];
        if (arg0 >= -19) {
            method1076((class42) null);
        }
        for (int var2 = 0; var2 < class191.field3465; var2++) {
            int var3 = class185.field3332[var2] * class110.field2226[var2];
            byte[] var4 = class202.field3638[var2];
            if (class76.field1435[var2]) {
                byte[] var7 = class273.field4850[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class6.method63(class117.field2341[class27.method220(255, var4[var9])], class27.method220(var7[var9] << 24, -16777216));
                }
                var1[var2] = new class29(class241.field4360, class50.field996, class182.field3289[var2], class271.field4815[var2], class110.field2226[var2], class185.field3332[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class117.field2341[class27.method220(255, var4[var6])];
                }
                var1[var2] = new class269(class241.field4360, class50.field996, class182.field3289[var2], class271.field4815[var2], class110.field2226[var2], class185.field3332[var2], var5);
            }
        }
        class63.method468(125);
        return var1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2816++;
        if (!this.method1054((byte) -30)) {
            return;
        }
        class230.field4189 = Integer.parseInt(this.getParameter("worldid"));
        class100.field1945 = Integer.parseInt(this.getParameter("modewhere"));
        if (class100.field1945 < 0 || class100.field1945 > 1) {
            class100.field1945 = 0;
        }
        class150.field2748 = Integer.parseInt(this.getParameter("modewhat"));
        if (class150.field2748 < 0 || class150.field2748 > 2) {
            class150.field2748 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class132.field2532 = true;
        } else {
            class132.field2532 = false;
        }
        try {
            class131.field2514 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class131.field2514 = 0;
        }
        class251.method1738(class131.field2514, -128);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class245.field4442 = true;
        } else {
            class245.field4442 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class181.field3284 = true;
        } else {
            class181.field3284 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class218.field3936 = 1;
        } else {
            class218.field3936 = 0;
        }
        try {
            class60.field1210 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class60.field1210 = 0;
        }
        field2812 = class187.field3367.method1444(this, 0);
        if (field2812 == null) {
            field2812 = class246.field4451;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class79.field1467 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class79.field1467 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class197.field3539 = true;
        } else {
            class197.field3539 = false;
        }
        class257.field4637 = this;
        this.method1061(523, 765, 0, 503, class150.field2748 + 32);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1058(int arg0) {
        if (class239.field4320 != null) {
            class239.field4320.field1245 = false;
        }
        field2817++;
        class239.field4320 = null;
        if (class193.field3488 != null) {
            class193.field3488.method1924(false);
            class193.field3488 = null;
        }
        class50.method381(class122.field2411, 0);
        if (arg0 <= 59) {
            return;
        }
        class90.method638((byte) 121, class122.field2411);
        if (class7.field149 != null) {
            class7.field149.method1398(class122.field2411, -98);
        }
        class243.method1694((byte) -31);
        class90.method640((byte) -96);
        class7.field149 = null;
        if (class95.field1876 != null) {
            class95.field1876.method56(-120);
        }
        if (class227.field4148 != null) {
            class227.field4148.method56(-96);
        }
        class265.field4759.method1376(4);
        class61.field1217.method1698(87);
        try {
            if (class118.field2369 != null) {
                class118.field2369.method240(-16777216);
            }
            if (class146.field2692 != null) {
                for (int var2 = 0; var2 < class146.field2692.length; var2++) {
                    if (class146.field2692[var2] != null) {
                        class146.field2692[var2].method240(-16777216);
                    }
                }
            }
            if (class190.field3448 != null) {
                class190.field3448.method240(-16777216);
            }
            if (class136.field2561 != null) {
                class136.field2561.method240(-16777216);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1059(byte arg0) {
        field2825++;
        method1072(-5571);
        class209.method1484((byte) -66);
        class221.method1563();
        class266.method1822(1);
        class169.method1159(255);
        class12.method94((byte) 56);
        class284.method1910(0);
        class168.method1152(true);
        class153.method1064(true);
        class122.method894((byte) -85);
        class83.method604(true);
        class64.method476((byte) -23);
        class273.method1867((byte) 121);
        class106.method751(-1);
        class285.method1916(true);
        class201.method1373(128);
        class244.method1702(true);
        class220.method1546(true);
        class79.method557(255);
        class49.method362(0);
        class30.method247(true);
        class182.method1248((byte) -90);
        class95.method667(-106);
        class163.method1132(-1691822064);
        class39.method292(116);
        class170.method1171(-92);
        class42.method323((byte) 118);
        class108.method788(2);
        class162.method1116((byte) -8);
        class255.method1765((byte) 20);
        class204.method1397((byte) 99);
        class5.method42(false);
        class87.method625((byte) -124);
        class231.method1610(-53);
        class6.method52((byte) -106);
        class165.method1139(0);
        class137.method951(-53);
        class241.method1671((byte) 68);
        class81.method573((byte) -117);
        class109.method791(123);
        class111.method798((byte) 120);
        class237.method1637(768);
        class97.method676(1);
        class34.method263(9362);
        class68.method505((byte) -128);
        class271.method1850((byte) 125);
        class65.method482(98);
        class184.method1254(false);
        class278.method1883(true);
        class254.method1751(65);
        class147.method1022((byte) -118);
        class177.method1225(true);
        class37.method279(2);
        class99.method692(14486);
        class235.method1629(0);
        class145.method1015((byte) 0);
        class207.method1410(-114);
        class3.method14(true);
        class213.method1501(123);
        class52.method395((byte) -67);
        class218.method1526(-1);
        class58.method448(-19798);
        class250.method1733(50);
        class229.method1602((byte) -106);
        class208.method1425();
        class104.method708(-1421);
        class82.method582(true);
        class55.method416();
        class2.method10(80);
        class286.method1927(-1);
        class23.method197((byte) 92);
        class67.method494(30950);
        class261.method1803(122);
        class158.method1099(true);
        class224.method1582(25);
        class188.method1290();
        class179.method1232(230);
        class243.method1691((byte) 127);
        class242.method1675();
        class252.method1742((byte) -121);
        class22.method189(-2000);
        class192.method1317((byte) 123);
        class139.method968();
        class63.method465((byte) 67);
        class28.method221(125);
        class146.method1017(106);
        class134.method942(-111);
        class4.method33();
        class211.method1496(255);
        class156.method1091(81);
        class288.method1935((byte) 90);
        class259.method1795((byte) -48);
        class185.method1261(0);
        class155.method1084(28);
        class272.method1857(-46);
        class44.method332(true);
        class9.method83(true);
        class98.method685(9270);
        class183.method1249((byte) 98);
        class202.method1394((byte) 119);
        class47.method343(12937);
        class226.method1590(-31317);
        class197.method1352(89);
        class199.method1358(116);
        class141.method985(-8);
        class176.method1209(-13288);
        class257.method1785(-6);
        class234.method1628(4);
        class283.method1906(113);
        class279.method1889(false);
        class86.method623((byte) 107);
        int var2 = 121 % ((arg0 - 68) / 40);
        class15.method114();
        class238.method1653((byte) -76);
        class276.method1874(0);
        class148.method1029(108);
        class274.method1868(true);
        class159.method1103((byte) 120);
        class11.method93((byte) 126);
        class171.method1184(0);
        class84.method605(200);
        class154.method1068(0);
        class227.method1592((byte) -99);
        class126.method912(true);
        class103.method705(false);
        class264.method1808(16);
        class53.method399((byte) 76);
        class187.method1277((byte) -65);
        class181.method1238(-12136);
        class230.method1608((byte) -112);
        class253.method1746(0);
        class56.method444(-17338);
        class107.method780();
        class40.method299(2);
        class258.method1790((byte) -126);
        class88.method633(0);
        class14.method105((byte) -63);
        class61.method458(0);
        class136.method946(true);
        class173.method1195(true);
        class195.method1335((byte) 55);
        class75.method528((byte) -53);
        class92.method648(0);
        class178.method1228(28358);
        class144.method1010((byte) 101);
        class78.method545((byte) -123);
        class287.method1930();
        class172.method1188(-70);
        class94.method658(-28255);
        class249.method1727((byte) 110);
        class25.method211((byte) -87);
        class280.method1892(-16777216);
        class18.method172(-15507);
        class174.method1200((byte) 55);
        class115.method816(true);
        class223.method1576((byte) 112);
        class85.method610(12865);
        class275.method1872((byte) -55);
        class110.method795((byte) -71);
        class191.method1313(25659);
        class10.method90(false);
        class167.method1149(false);
        class246.method1714(1);
        class100.method700((byte) 127);
        class222.method1569(0);
        class7.method73(true);
        class43.method325(246);
        class196.method1347(0);
        class190.method1309(true);
        class160.method1107(-2083330714);
        class24.method205();
        class90.method639((byte) 127);
        class265.method1812((byte) -94);
        class193.method1322(104);
        class54.method400(-123);
        class59.method452(0);
        class210.method1493((byte) -120);
        class96.method675();
        class152.method1048();
        class57.method445();
        class290.method1945(false);
        class33.method261((byte) 125);
        class105.method718();
        class127.method919();
        class215.method1509(-14611);
        class247.method1721((byte) 11);
        class157.method1096(-19151);
        class32.method257(6381);
        class76.method537(-1);
        class186.method1274(-121);
        class36.method272(-5237);
        class119.method843((byte) -61);
        class21.method184(100);
        class219.method1544((byte) 4);
        class73.method521((byte) -88);
        class116.method824(-5866);
        class72.method520((byte) 108);
        class20.method180(false);
        class66.method483(-17397);
        class51.method388((byte) -128);
        class45.method339(1);
        class71.method517((byte) 102);
        class131.method929(-117);
        class149.method1033(-91);
        class50.method384(2909);
        class60.method456(3);
        class102.method701(-14844);
        class124.method904(-4096);
        class112.method803(7384);
        class27.method218(false);
        class1.method6(21830);
        class216.method1516((byte) 64);
        class31.method255(-1);
        class38.method283(0);
        class251.method1736((byte) 9);
        class70.method515(115);
        class130.method928(-1);
        class256.method1770(7783);
        class161.method1112((byte) -34);
        class150.method1042((byte) 38);
        class228.method1601(0);
        class132.method930(95);
        class198.method1355((byte) 107);
        class200.method1367((byte) -57);
        class205.method1401(442439660);
        class80.method563(-1);
        class289.method1942(340);
        class93.method653(true);
        class117.method834(true);
        class128.method923(false);
        class245.method1712(-17450);
        class113.method804(64);
        class262.method1804(false);
        class8.method78(255);
        class277.method1875((byte) -49);
        class74.method526(-90);
        class142.method986(-1);
        class175.method1203(4);
        class69.method507((byte) 17);
        class48.method347((byte) 106);
        class164.method1136(0);
        class19.method176((byte) -95);
        class118.method837(true);
        class214.method1504(0);
        class166.method1146((byte) 0);
        class268.method1824((byte) -115);
        class206.method1403(-58);
        class62.method461(7763);
        class129.method926(61);
        class239.method1656((byte) 110);
        class13.method102((byte) -91);
        class35.method270((byte) 40);
        class114.method811(-124);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1074(byte arg0) {
        field2823++;
        class159.field2896 = 0;
        if (arg0 != 20) {
            field2812 = null;
        }
        while (class97.method679(true) && class159.field2896 < 128) {
            class257.field4649[class159.field2896] = class69.field1315;
            class146.field2689[class159.field2896] = class148.field2713;
            class159.field2896++;
        }
        class122.field2402++;
        if (class149.field2727 != -1) {
            class235.method1633(0, class50.field981, class25.field442, 46, 0, 0, 0, class149.field2727);
        }
        class54.field1069++;
        class144.method1009(0);
        while (true) {
            class227 var2;
            class42 var3;
            class42 var4;
            do {
                var2 = (class227) class155.field2831.method1124((byte) 86);
                if (var2 == null) {
                    while (true) {
                        class227 var5;
                        class42 var6;
                        class42 var7;
                        do {
                            var5 = (class227) class175.field3193.method1124((byte) 92);
                            if (var5 == null) {
                                while (true) {
                                    class227 var8;
                                    class42 var9;
                                    class42 var10;
                                    do {
                                        var8 = (class227) class211.field3838.method1124((byte) 102);
                                        if (var8 == null) {
                                            if (class207.field3691 != null) {
                                                class76.method532(true);
                                            }
                                            if (class230.field4173 != null && class230.field4173.field3646 == 1) {
                                                if (class230.field4173.field3642 != null) {
                                                    class163.method1130(class172.field3139, class45.field892, 0);
                                                }
                                                class230.field4173 = null;
                                                class45.field892 = false;
                                                class172.field3139 = null;
                                            }
                                            if (class163.field2968 % 1500 == 0) {
                                                class178.method1227(-24327);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4143;
                                        if (var9.field721 < 0) {
                                            break;
                                        }
                                        var10 = class247.method1719(var9.field710, -8667);
                                    } while (var10 == null || var10.field762 == null || var10.field762.length <= var9.field721 || var10.field762[var9.field721] != var9);
                                    class147.method1021(var8, 200000);
                                }
                            }
                            var6 = var5.field4143;
                            if (var6.field721 < 0) {
                                break;
                            }
                            var7 = class247.method1719(var6.field710, arg0 - 8687);
                        } while (var7 == null || var7.field762 == null || var6.field721 >= var7.field762.length || var7.field762[var6.field721] != var6);
                        class147.method1021(var5, 200000);
                    }
                }
                var3 = var2.field4143;
                if (var3.field721 < 0) {
                    break;
                }
                var4 = class247.method1719(var3.field710, -8667);
            } while (var4 == null || var4.field762 == null || var3.field721 >= var4.field762.length || var4.field762[var3.field721] != var3);
            class147.method1021(var2, arg0 ^ 0x30D54);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1075(int arg0) {
        field2820++;
        if (arg0 == 95) {
            boolean var2 = class265.field4759.method1386(false);
            if (!var2) {
                this.method1071(97);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lji;)Lji;")
    public static final class42 method1076(class42 arg0) {
        int var1 = class153.method1065(method1070(arg0), 915968114);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class247.method1719(arg0.field710, -8667);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1077(int arg0) {
        field2821++;
        if (!class68.field1309) {
            label229: while (true) {
                do {
                    if (!class97.method679(true)) {
                        break label229;
                    }
                } while (class148.field2713 != 115 && class148.field2713 != 83);
                class68.field1309 = true;
            }
        }
        if (class214.field3861 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class180.method1236(-13);
            if (class274.field4854 == 0L) {
                class274.field4854 = var4;
            }
            if (var3 > 16384 && var4 - class274.field4854 < 5000L) {
                if ((var4 - class157.field2868) > 1000L) {
                    System.gc();
                    class157.field2868 = var4;
                }
                class239.field4325 = class54.field1064;
                class146.field2691 = 5;
            } else {
                class146.field2691 = 5;
                class214.field3861 = 10;
                class239.field4325 = class78.field1443;
            }
        } else if (class214.field3861 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class122.field2404[var6] = new class170(104, 104);
            }
            class214.field3861 = 30;
            class146.field2691 = 10;
            class239.field4325 = class174.field3173;
        } else if (class214.field3861 == 30) {
            if (class104.field2006 == null) {
                class104.field2006 = new class220(class265.field4759, class61.field1217);
            }
            if (class104.field2006.method1550(29995)) {
                class79.field1472 = class213.method1502(true, 0, (byte) -127, true, false);
                class187.field3365 = class213.method1502(true, 1, (byte) -126, true, false);
                class243.field4402 = class213.method1502(false, 2, (byte) -128, true, true);
                class13.field235 = class213.method1502(true, 3, (byte) -128, true, false);
                class82.field1652 = class213.method1502(true, 4, (byte) -126, true, false);
                class149.field2729 = class213.method1502(true, 5, (byte) -127, true, true);
                class279.field4902 = class213.method1502(true, 6, (byte) -126, false, true);
                class38.field648 = class213.method1502(true, 7, (byte) -126, true, false);
                class53.field1056 = class213.method1502(true, 8, (byte) -127, true, false);
                class257.field4647 = class213.method1502(true, 9, (byte) -127, true, false);
                class185.field3326 = class213.method1502(true, 10, (byte) -126, true, false);
                class275.field4860 = class213.method1502(true, 11, (byte) -126, true, false);
                class102.field1963 = class213.method1502(true, 12, (byte) -128, true, false);
                class56.field1156 = class213.method1502(true, 13, (byte) -128, true, false);
                class163.field2955 = class213.method1502(true, 14, (byte) -126, false, false);
                class247.field4472 = class213.method1502(true, 15, (byte) -126, true, false);
                class238.field4305 = class213.method1502(true, 16, (byte) -127, true, false);
                class11.field227 = class213.method1502(true, 17, (byte) -128, true, false);
                class124.field2422 = class213.method1502(true, 18, (byte) -127, true, false);
                class158.field2887 = class213.method1502(true, 19, (byte) -126, true, false);
                class97.field1905 = class213.method1502(true, 20, (byte) -126, true, false);
                class191.field3458 = class213.method1502(true, 21, (byte) -127, true, false);
                class288.field5086 = class213.method1502(true, 22, (byte) -127, true, false);
                class174.field3175 = class213.method1502(true, 23, (byte) -128, true, true);
                class69.field1323 = class213.method1502(true, 24, (byte) -127, true, false);
                class163.field2963 = class213.method1502(true, 25, (byte) -128, true, false);
                class206.field3687 = class213.method1502(true, 26, (byte) -128, true, true);
                class40.field681 = class213.method1502(true, 27, (byte) -126, true, false);
                class146.field2691 = 15;
                class239.field4325 = class199.field3570;
                class214.field3861 = 40;
            } else {
                class146.field2691 = 12;
                class239.field4325 = class254.field4591;
            }
        } else if (class214.field3861 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class81.field1533[var8].method560(0) * class93.field1850[var8] / 100;
            }
            if (var7 == 100) {
                class146.field2691 = 20;
                class239.field4325 = class264.field4751;
                class118.method839(class53.field1056, 0);
                class260.method1801(-118, class53.field1056);
                class87.method629(-8, class53.field1056);
                class214.field3861 = 45;
            } else {
                if (var7 != 0) {
                    class239.field4325 = class229.method1604(new class209[] { class190.field3436, class66.method485(var7, (byte) 108), class168.field3033 }, (byte) 117);
                }
                class146.field2691 = 20;
            }
        } else if (class214.field3861 == 45) {
            class5.method44(class71.field1343, false, 22050, 2);
            class277.field4875 = new class16();
            class277.field4875.method162((byte) 81, 9, 128);
            class95.field1876 = class183.method1252(class122.field2411, 119, class230.field4187, 0, 22050);
            class95.field1876.method46((byte) -62, class277.field4875);
            class112.method802(1376312589, class247.field4472, class277.field4875, class82.field1652, class163.field2955);
            class227.field4148 = class183.method1252(class122.field2411, -121, class230.field4187, 1, 2048);
            class47.field906 = new class217();
            class227.field4148.method46((byte) -51, class47.field906);
            class174.field3171 = new class165(22050, class192.field3479);
            class117.field2350 = class279.field4902.method364(-1, class201.field3598);
            class239.field4325 = class83.field1660;
            class214.field3861 = 50;
            class146.field2691 = 30;
        } else if (class214.field3861 == 50) {
            int var9 = class198.method1356(class53.field1056, 21, class56.field1156);
            int var10 = class80.method566(-64);
            if (var9 < var10) {
                class239.field4325 = class229.method1604(new class209[] { class157.field2865, class66.method485(var9 * 100 / var10, (byte) 33), class168.field3033 }, (byte) 29);
                class146.field2691 = 35;
            } else {
                class239.field4325 = class144.field2661;
                class146.field2691 = 35;
                class214.field3861 = 60;
            }
        } else if (class214.field3861 == 60) {
            int var11 = class227.method1594((byte) 48, class53.field1056);
            int var12 = class163.method1126(-67);
            if (var11 < var12) {
                class239.field4325 = class229.method1604(new class209[] { class161.field2926, class66.method485(var11 * 100 / var12, (byte) 76), class168.field3033 }, (byte) 100);
                class146.field2691 = 40;
            } else {
                class214.field3861 = 65;
                class146.field2691 = 40;
                class239.field4325 = class243.field4382;
            }
        } else if (class214.field3861 == 65) {
            class64.method477(0, class56.field1156, class53.field1056);
            class146.field2691 = 45;
            class239.field4325 = class5.field74;
            class155.method1088(5, -3280);
            class214.field3861 = 70;
        } else if (class214.field3861 == 70) {
            class243.field4402.method374(-122);
            byte var13 = 0;
            int var14 = var13 + class243.field4402.method349(-128);
            class238.field4305.method374(-126);
            int var15 = var14 + class238.field4305.method349(-71);
            class11.field227.method374(97);
            int var16 = var15 + class11.field227.method349(-78);
            class124.field2422.method374(-110);
            int var17 = var16 + class124.field2422.method349(-96);
            class158.field2887.method374(76);
            int var18 = var17 + class158.field2887.method349(-125);
            class97.field1905.method374(126);
            int var19 = var18 + class97.field1905.method349(-113);
            class191.field3458.method374(113);
            int var20 = var19 + class191.field3458.method349(-98);
            class288.field5086.method374(-105);
            int var21 = var20 + class288.field5086.method349(-34);
            class69.field1323.method374(-101);
            int var22 = var21 + class69.field1323.method349(-76);
            class163.field2963.method374(-123);
            int var23 = var22 + class163.field2963.method349(-121);
            class40.field681.method374(29);
            int var24 = var23 + class40.field681.method349(-104);
            if (var24 < 1100) {
                class239.field4325 = class229.method1604(new class209[] { class142.field2613, class66.method485(var24 / 11, (byte) 119), class168.field3033 }, (byte) 56);
                class146.field2691 = 50;
            } else {
                class171.method1186(class243.field4402, -123);
                class108.method785(false, class243.field4402);
                class255.method1756(-80, class243.field4402);
                class116.method823((byte) -115, class38.field648, class243.field4402);
                class246.method1715(true, class38.field648, class238.field4305, (byte) 59);
                class220.method1545(class124.field2422, (byte) -109, class38.field648);
                class193.method1324((byte) 77, true, class158.field2887, class38.field648, class262.field4717);
                class20.method178(-94, class243.field4402);
                class213.method1499(class187.field3365, 1, class79.field1472, class97.field1905);
                class42.method321(0, class191.field3458, class38.field648);
                class21.method186(123, class288.field5086);
                class68.method498(class243.field4402, 2);
                class167.method1148(0, class38.field648, class13.field235, class56.field1156, class53.field1056);
                class201.method1374(class243.field4402, 127);
                class235.method1632(38, class11.field227);
                class213.method1503(true, new class234(), class69.field1323, class163.field2963);
                class195.method1344((byte) 18, class163.field2963, class69.field1323);
                class146.field2691 = 50;
                class239.field4325 = class169.field3067;
                class182.method1246(120);
                class214.field3861 = 80;
            }
        } else if (class214.field3861 == 80) {
            int var25 = class200.method1370(class53.field1056, 1);
            int var26 = class38.method284(16);
            if (var25 < var26) {
                class239.field4325 = class229.method1604(new class209[] { class25.field457, class66.method485(var25 * 100 / var26, (byte) 86), class168.field3033 }, (byte) 79);
                class146.field2691 = 60;
            } else {
                class200.method1371(7, class53.field1056);
                class239.field4325 = class262.field4705;
                class146.field2691 = 60;
                class214.field3861 = 90;
            }
        } else if (class214.field3861 == 90) {
            if (class206.field3687.method374(-122)) {
                class279 var27 = new class279(class257.field4647, class206.field3687, class53.field1056, 20, !class84.field1681);
                class15.method123(var27);
                if (class128.field2469 == 1) {
                    class15.method112(0.9F);
                }
                if (class128.field2469 == 2) {
                    class15.method112(0.8F);
                }
                if (class128.field2469 == 3) {
                    class15.method112(0.7F);
                }
                if (class128.field2469 == 4) {
                    class15.method112(0.6F);
                }
                class146.field2691 = 70;
                class239.field4325 = class187.field3369;
                class214.field3861 = 100;
            } else {
                class239.field4325 = class229.method1604(new class209[] { class259.field4677, class66.method485(class206.field3687.method349(-66), (byte) 15), class168.field3033 }, (byte) 35);
                class146.field2691 = 70;
            }
        } else if (class214.field3861 == 100) {
            if (class278.method1881(class53.field1056, -25799)) {
                class214.field3861 = 110;
            }
        } else if (class214.field3861 == 110) {
            class239.field4320 = new class64();
            class230.field4187.method996(class239.field4320, 10, false);
            class214.field3861 = 120;
            class239.field4325 = class166.field2993;
            class146.field2691 = 75;
        } else if (class214.field3861 == 120) {
            if (class185.field3326.method352(class61.field1221, (byte) -120, class246.field4451)) {
                class238 var28 = new class238(class185.field3326.method366(class246.field4451, class61.field1221, (byte) -106));
                class73.method522(var28, -2);
                class214.field3861 = 130;
                class146.field2691 = 80;
                class239.field4325 = class126.field2443;
            } else {
                class239.field4325 = class229.method1604(new class209[] { class187.field3388, class253.field4560 }, (byte) 57);
                class146.field2691 = 80;
            }
        } else if (class214.field3861 == 130) {
            if (!class13.field235.method374(34)) {
                class239.field4325 = class229.method1604(new class209[] { class187.field3379, class66.method485(class13.field235.method349(-74) * 3 / 4, (byte) 106), class168.field3033 }, (byte) 97);
                class146.field2691 = 85;
            } else if (!class102.field1963.method374(107)) {
                class239.field4325 = class229.method1604(new class209[] { class187.field3379, class66.method485(class102.field1963.method349(-76) / 10 + 75, (byte) 47), class168.field3033 }, (byte) 104);
                class146.field2691 = 85;
            } else if (!class56.field1156.method374(-117)) {
                class239.field4325 = class229.method1604(new class209[] { class187.field3379, class66.method485(class56.field1156.method349(-124) / 20 + 85, (byte) 45), class168.field3033 }, (byte) 79);
                class146.field2691 = 85;
            } else if (class174.field3175.method373(class25.field439, 91)) {
                class155.method1086(class163.field2950, class70.field1333, class174.field3175, class185.field3336, class170.field3112, class264.field4737, (byte) 94);
                class221.method1557(class40.field681);
                class239.field4325 = class59.field1183;
                class214.field3861 = 135;
                class146.field2691 = 95;
            } else {
                class239.field4325 = class229.method1604(new class209[] { class187.field3379, class66.method485(class174.field3175.method350(class25.field439, 0) / 10 + 90, (byte) 102), class168.field3033 }, (byte) 89);
                class146.field2691 = 85;
            }
        } else if (class214.field3861 == 135) {
            int var29 = class237.method1640(false);
            if (var29 == -1) {
                class146.field2691 = 95;
                class239.field4325 = class163.field2953;
            } else if (var29 == 7 || var29 == 9) {
                this.method1062("worldlistfull", (byte) 71);
                class155.method1088(1000, -3280);
            } else if (class80.field1494) {
                class239.field4325 = class64.field1248;
                class146.field2691 = 96;
                class214.field3861 = 140;
            } else {
                this.method1062("worldlistio_" + var29, (byte) 49);
                class155.method1088(1000, -3280);
            }
        } else if (class214.field3861 == 140) {
            class260.field4686 = class13.field235.method364(-1, class37.field637);
            class149.field2729.method354(true, -1, false);
            class279.field4902.method354(true, -1, true);
            class53.field1056.method354(true, -1, true);
            class56.field1156.method354(true, -1, true);
            class185.field3326.method354(true, -1, true);
            class13.field235.method354(true, -1, true);
            class146.field2691 = 97;
            class141.field2606 = true;
            class214.field3861 = 150;
            class239.field4325 = class82.field1579;
        } else if (class214.field3861 == 150) {
            if (class68.field1309) {
                class202.field3639 = 0;
                class54.field1063 = 0;
                class163.field2960 = 0;
            }
            class68.field1309 = true;
            class183.method1250((byte) 49, class230.field4187);
            class257.method1779((byte) -65, class54.field1063, false, -1, -1);
            class146.field2691 = 100;
            class214.field3861 = 160;
            class239.field4325 = class190.field3437;
        } else if (class214.field3861 == 160) {
            class99.method691(0, true);
        } else {
            int var30 = -45 % ((arg0 - 30) / 36);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lji;)Z")
    public static final boolean method1078(class42 arg0) {
        if (class70.field1332) {
            if (method1070(arg0) != 0) {
                return false;
            }
            if (arg0.field810 == 0) {
                return false;
            }
        }
        return arg0.field706;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
    public static final boolean method1079(int arg0, int arg1) {
        field2811++;
        if (arg1 == 33484541) {
            return (arg0 & 0x2DD546E1) >> 29 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    private final void method1080(int arg0, int arg1) {
        class265.field4759.field3633 = arg1;
        class265.field4759.field3631++;
        class73.field1385 = null;
        class195.field3502 = null;
        class181.field3282 = 0;
        if (arg0 <= 48) {
            field2818 = null;
        }
        field2827++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1057(byte arg0) {
        field2826++;
        class227.method1595((byte) 40);
        class61.field1217 = new class244();
        class265.field4759 = new class201();
        class150.method1038(class230.field4187, false);
        if (class100.field1945 == 0) {
            class175.field3188 = this.getCodeBase().getHost();
            class174.field3182 = 443;
            class16.field326 = 43594;
        } else if (class100.field1945 == 1) {
            class175.field3188 = this.getCodeBase().getHost();
            class174.field3182 = class230.field4189 + 50000;
            class16.field326 = class230.field4189 + 40000;
        } else if (class100.field1945 == 2) {
            class16.field326 = class230.field4189 + 40000;
            class175.field3188 = "127.0.0.1";
            class174.field3182 = class230.field4189 + 50000;
        }
        if (class218.field3936 == 1) {
            class33.field590 = class63.field1238;
            class100.field1943 = class27.field490;
            class150.field2744 = class268.field4795;
            class185.field3328 = class97.field1892;
            class118.field2368 = true;
        } else {
            class33.field590 = class136.field2552;
            class150.field2744 = class155.field2839;
            class100.field1943 = class1.field5;
            class185.field3328 = class38.field651;
        }
        class276.field4872 = class223.field4074 = class100.field1942 = class179.field3251 = new short[256];
        class64.field1255 = class175.field3188;
        class59.field1186 = class16.field326;
        class155.field2845 = class174.field3182;
        class48.field928 = class16.field326;
        class45.field898 = class48.field928;
        if (class143.field2644 == 3 && class100.field1945 != 2) {
            class37.field646 = class230.field4189;
        }
        class288.method1938((byte) -111);
        class97.method678(15483, class122.field2411);
        if (arg0 < 15) {
            method1072(52);
        }
        class145.method1014(112, class122.field2411);
        class7.field149 = class163.method1129((byte) 25);
        if (class7.field149 != null) {
            class7.field149.method1395(class122.field2411, (byte) 47);
        }
        class251.field4520 = class143.field2644;
        try {
            if (class230.field4187.field2650 != null) {
                class118.field2369 = new class30(class230.field4187.field2650, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class146.field2692[var2] = new class30(class230.field4187.field2636[var2], 6000, 0);
                }
                class190.field3448 = new class30(class230.field4187.field2635, 6000, 0);
                class48.field918 = new class182(255, class118.field2369, class190.field3448, 500000);
                class136.field2561 = new class30(class230.field4187.field2629, 24, 0);
                class230.field4187.field2629 = null;
                class230.field4187.field2636 = null;
                class230.field4187.field2650 = null;
                class230.field4187.field2635 = null;
            }
        } catch (IOException var3) {
            class136.field2561 = null;
            class48.field918 = null;
            class118.field2369 = null;
            class190.field3448 = null;
        }
        if (class100.field1945 != 0) {
            class266.field4777 = true;
        }
        class176.field3215 = class14.field260;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lji;IIIIIII)V")
    public static final void method1081(class42[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class42 var9 = arg0[var8];
            if (var9 != null && var9.field710 == arg1 && (!var9.field795 || var9.field810 == 0 || var9.field737 || method1070(var9) != 0 || class178.field3242 == var9 || var9.field715 == 1338) && (!var9.field795 || !method1078(var9))) {
                int var10 = var9.field801 + arg6;
                int var11 = var9.field756 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field810 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field789 + var10;
                    int var17 = var9.field758 + var11;
                    if (var9.field810 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class207.field3691 == var9) {
                    class148.field2712 = true;
                    class7.field147 = var10;
                    class272.field4822 = var11;
                }
                if (!var9.field795 || var12 < var14 && var13 < var15) {
                    if (var9.field810 == 0) {
                        if (!var9.field795 && method1078(var9) && class85.field1695 != var9) {
                            continue;
                        }
                        if (var9.field788 && class150.field2735 >= var12 && class126.field2435 >= var13 && class150.field2735 < var14 && class126.field2435 < var15) {
                            for (class227 var18 = (class227) class211.field3838.method1119(20896); var18 != null; var18 = (class227) class211.field3838.method1120(102)) {
                                if (var18.field4132) {
                                    var18.method269(-214950896);
                                    var18.field4143.field811 = false;
                                }
                            }
                            if (class161.field2924 == 0) {
                                class207.field3691 = null;
                                class178.field3242 = null;
                            }
                            class110.field2221 = false;
                        }
                    }
                    if (var9.field795) {
                        boolean var19;
                        if (class150.field2735 >= var12 && class126.field2435 >= var13 && class150.field2735 < var14 && class126.field2435 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class126.field2438 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class183.field3310 == 1 && class237.field4246 >= var12 && class76.field1413 >= var13 && class237.field4246 < var14 && class76.field1413 < var15) {
                            var21 = true;
                        }
                        if (class159.field2896 > 0 && var9.field751 != null) {
                            for (int var22 = 0; var22 < var9.field751.length; var22++) {
                                for (int var23 = 0; var23 < class159.field2896; var23++) {
                                    int var24 = var9.field751[var22] & 0xFF;
                                    if (class257.field4649[var23] == var24) {
                                        if (var9.field834 != null) {
                                            byte var25 = var9.field834[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class228.field4153[86] || (var25 & 0x1) != 0 && !class228.field4153[82] || (var25 & 0x4) != 0 && !class228.field4153[81])) {
                                                continue;
                                            }
                                        }
                                        class65.method481(var9.field779, -24377, class246.field4451, var22 + 1, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class109.method790(class76.field1413 - var11, class237.field4246 - var10, 255, var9);
                        }
                        if (class207.field3691 != null && class207.field3691 != var9 && var19 && class13.method97(82, method1070(var9))) {
                            class56.field1149 = var9;
                        }
                        if (class178.field3242 == var9) {
                            class278.field4888 = true;
                            class262.field4726 = var10;
                            class94.field1864 = var11;
                        }
                        if (var9.field737 || var9.field715 != 0) {
                            if (var19 && class62.field1227 != 0 && var9.field777 != null) {
                                class227 var26 = new class227();
                                var26.field4132 = true;
                                var26.field4143 = var9;
                                var26.field4130 = class62.field1227;
                                var26.field4134 = var9.field777;
                                class211.field3838.method1123(var26, (byte) -128);
                            }
                            if (class207.field3691 != null || class159.field2891 != null || class244.field4418 || var9.field715 != 1400 && class110.field2221) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field715 != 0) {
                                if (var9.field715 == 1337) {
                                    class51.field1021 = var9;
                                    class126.method907(var9, 0);
                                    continue;
                                }
                                if (var9.field715 == 1338) {
                                    if (var21) {
                                        class10.field207 = class237.field4246 - var10;
                                        class132.field2531 = class76.field1413 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field715 == 1400) {
                                    class156.field2855 = var9;
                                    if (var21) {
                                        if (class228.field4153[82] && class198.field3550 > 0) {
                                            int var27 = (int) ((double) (class237.field4246 - var10 - var9.field789 / 2) * 2.0D / (double) class116.field2324);
                                            int var28 = (int) ((double) (class76.field1413 - var11 - var9.field758 / 2) * 2.0D / (double) class116.field2324);
                                            int var29 = class200.field3580 + var27;
                                            int var30 = class118.field2370 + var28;
                                            int var31 = class38.field654 + var29;
                                            int var32 = class98.field1921 + class224.field4082 - var30 - 1;
                                            class227.method1593(0, var32, var31, 26);
                                            class249.method1732((byte) -30);
                                            continue;
                                        }
                                        class110.field2221 = true;
                                        class93.field1845 = class150.field2735;
                                        class218.field3925 = class126.field2435;
                                        class78.field1446 = class200.field3580;
                                        class239.field4321 = class118.field2370;
                                        continue;
                                    }
                                    if (var20 && class110.field2221) {
                                        class30.method241((byte) -40, (int) ((double) (class93.field1845 - class150.field2735) * 2.0D / (double) class11.field224) + class78.field1446);
                                        class173.method1192(-1, (int) ((double) (class218.field3925 - class126.field2435) * 2.0D / (double) class11.field224) + class239.field4321);
                                        continue;
                                    }
                                    class110.field2221 = false;
                                    continue;
                                }
                                if (var9.field715 == 1401) {
                                    if (var20) {
                                        class14.method107(class126.field2435 - var11, (byte) -96, var9.field789, var9.field758, class150.field2735 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field715 == 1402) {
                                    class126.method907(var9, 0);
                                    continue;
                                }
                            }
                            if (!var9.field740 && var21) {
                                var9.field740 = true;
                                if (var9.field724 != null) {
                                    class227 var33 = new class227();
                                    var33.field4132 = true;
                                    var33.field4143 = var9;
                                    var33.field4147 = class237.field4246 - var10;
                                    var33.field4130 = class76.field1413 - var11;
                                    var33.field4134 = var9.field724;
                                    class211.field3838.method1123(var33, (byte) -128);
                                }
                            }
                            if (var9.field740 && var20 && var9.field796 != null) {
                                class227 var34 = new class227();
                                var34.field4132 = true;
                                var34.field4143 = var9;
                                var34.field4147 = class150.field2735 - var10;
                                var34.field4130 = class126.field2435 - var11;
                                var34.field4134 = var9.field796;
                                class211.field3838.method1123(var34, (byte) -128);
                            }
                            if (var9.field740 && !var20) {
                                var9.field740 = false;
                                if (var9.field729 != null) {
                                    class227 var35 = new class227();
                                    var35.field4132 = true;
                                    var35.field4143 = var9;
                                    var35.field4147 = class150.field2735 - var10;
                                    var35.field4130 = class126.field2435 - var11;
                                    var35.field4134 = var9.field729;
                                    class175.field3193.method1123(var35, (byte) -127);
                                }
                            }
                            if (var20 && var9.field809 != null) {
                                class227 var36 = new class227();
                                var36.field4132 = true;
                                var36.field4143 = var9;
                                var36.field4147 = class150.field2735 - var10;
                                var36.field4130 = class126.field2435 - var11;
                                var36.field4134 = var9.field809;
                                class211.field3838.method1123(var36, (byte) -127);
                            }
                            if (!var9.field811 && var19) {
                                var9.field811 = true;
                                if (var9.field786 != null) {
                                    class227 var37 = new class227();
                                    var37.field4132 = true;
                                    var37.field4143 = var9;
                                    var37.field4147 = class150.field2735 - var10;
                                    var37.field4130 = class126.field2435 - var11;
                                    var37.field4134 = var9.field786;
                                    class211.field3838.method1123(var37, (byte) -128);
                                }
                            }
                            if (var9.field811 && var19 && var9.field770 != null) {
                                class227 var38 = new class227();
                                var38.field4132 = true;
                                var38.field4143 = var9;
                                var38.field4147 = class150.field2735 - var10;
                                var38.field4130 = class126.field2435 - var11;
                                var38.field4134 = var9.field770;
                                class211.field3838.method1123(var38, (byte) -127);
                            }
                            if (var9.field811 && !var19) {
                                var9.field811 = false;
                                if (var9.field731 != null) {
                                    class227 var39 = new class227();
                                    var39.field4132 = true;
                                    var39.field4143 = var9;
                                    var39.field4147 = class150.field2735 - var10;
                                    var39.field4130 = class126.field2435 - var11;
                                    var39.field4134 = var9.field731;
                                    class175.field3193.method1123(var39, (byte) -128);
                                }
                            }
                            if (var9.field823 != null) {
                                class227 var40 = new class227();
                                var40.field4143 = var9;
                                var40.field4134 = var9.field823;
                                class155.field2831.method1123(var40, (byte) -128);
                            }
                            if (var9.field787 != null && class254.field4581 > var9.field691) {
                                if (var9.field845 == null || class254.field4581 - var9.field691 > 32) {
                                    class227 var45 = new class227();
                                    var45.field4143 = var9;
                                    var45.field4134 = var9.field787;
                                    class211.field3838.method1123(var45, (byte) -128);
                                } else {
                                    label546: for (int var41 = var9.field691; var41 < class254.field4581; var41++) {
                                        int var42 = class166.field2994[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field845.length; var43++) {
                                            if (var9.field845[var43] == var42) {
                                                class227 var44 = new class227();
                                                var44.field4143 = var9;
                                                var44.field4134 = var9.field787;
                                                class211.field3838.method1123(var44, (byte) -128);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field691 = class254.field4581;
                            }
                            if (var9.field830 != null && class145.field2676 > var9.field732) {
                                if (var9.field726 == null || class145.field2676 - var9.field732 > 32) {
                                    class227 var50 = new class227();
                                    var50.field4143 = var9;
                                    var50.field4134 = var9.field830;
                                    class211.field3838.method1123(var50, (byte) -127);
                                } else {
                                    label522: for (int var46 = var9.field732; var46 < class145.field2676; var46++) {
                                        int var47 = class266.field4763[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field726.length; var48++) {
                                            if (var9.field726[var48] == var47) {
                                                class227 var49 = new class227();
                                                var49.field4143 = var9;
                                                var49.field4134 = var9.field830;
                                                class211.field3838.method1123(var49, (byte) -127);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field732 = class145.field2676;
                            }
                            if (var9.field744 != null && class205.field3655 > var9.field857) {
                                if (var9.field771 == null || class205.field3655 - var9.field857 > 32) {
                                    class227 var55 = new class227();
                                    var55.field4143 = var9;
                                    var55.field4134 = var9.field744;
                                    class211.field3838.method1123(var55, (byte) -128);
                                } else {
                                    label498: for (int var51 = var9.field857; var51 < class205.field3655; var51++) {
                                        int var52 = class36.field621[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field771.length; var53++) {
                                            if (var9.field771[var53] == var52) {
                                                class227 var54 = new class227();
                                                var54.field4143 = var9;
                                                var54.field4134 = var9.field744;
                                                class211.field3838.method1123(var54, (byte) -127);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field857 = class205.field3655;
                            }
                            if (var9.field839 != null && class48.field927 > var9.field783) {
                                if (var9.field768 == null || class48.field927 - var9.field783 > 32) {
                                    class227 var60 = new class227();
                                    var60.field4143 = var9;
                                    var60.field4134 = var9.field839;
                                    class211.field3838.method1123(var60, (byte) -127);
                                } else {
                                    label474: for (int var56 = var9.field783; var56 < class48.field927; var56++) {
                                        int var57 = class59.field1191[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field768.length; var58++) {
                                            if (var9.field768[var58] == var57) {
                                                class227 var59 = new class227();
                                                var59.field4143 = var9;
                                                var59.field4134 = var9.field839;
                                                class211.field3838.method1123(var59, (byte) -128);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field783 = class48.field927;
                            }
                            if (var9.field792 != null && class246.field4465 > var9.field781) {
                                if (var9.field848 == null || class246.field4465 - var9.field781 > 32) {
                                    class227 var65 = new class227();
                                    var65.field4143 = var9;
                                    var65.field4134 = var9.field792;
                                    class211.field3838.method1123(var65, (byte) -127);
                                } else {
                                    label450: for (int var61 = var9.field781; var61 < class246.field4465; var61++) {
                                        int var62 = class241.field4340[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field848.length; var63++) {
                                            if (var9.field848[var63] == var62) {
                                                class227 var64 = new class227();
                                                var64.field4143 = var9;
                                                var64.field4134 = var9.field792;
                                                class211.field3838.method1123(var64, (byte) -128);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field781 = class246.field4465;
                            }
                            if (class274.field4852 > var9.field755 && var9.field709 != null) {
                                class227 var66 = new class227();
                                var66.field4143 = var9;
                                var66.field4134 = var9.field709;
                                class211.field3838.method1123(var66, (byte) -127);
                            }
                            if (class264.field4744 > var9.field755 && var9.field842 != null) {
                                class227 var67 = new class227();
                                var67.field4143 = var9;
                                var67.field4134 = var9.field842;
                                class211.field3838.method1123(var67, (byte) -128);
                            }
                            if (class14.field263 > var9.field755 && var9.field772 != null) {
                                class227 var68 = new class227();
                                var68.field4143 = var9;
                                var68.field4134 = var9.field772;
                                class211.field3838.method1123(var68, (byte) -127);
                            }
                            if (class252.field4537 > var9.field755 && var9.field734 != null) {
                                class227 var69 = new class227();
                                var69.field4143 = var9;
                                var69.field4134 = var9.field734;
                                class211.field3838.method1123(var69, (byte) -127);
                            }
                            if (class67.field1290 > var9.field755 && var9.field776 != null) {
                                class227 var70 = new class227();
                                var70.field4143 = var9;
                                var70.field4134 = var9.field776;
                                class211.field3838.method1123(var70, (byte) -127);
                            }
                            var9.field755 = class54.field1069;
                            if (var9.field852 != null) {
                                for (int var71 = 0; var71 < class159.field2896; var71++) {
                                    class227 var72 = new class227();
                                    var72.field4143 = var9;
                                    var72.field4131 = class257.field4649[var71];
                                    var72.field4142 = class146.field2689[var71];
                                    var72.field4134 = var9.field852;
                                    class211.field3838.method1123(var72, (byte) -127);
                                }
                            }
                            if (class251.field4519 && var9.field822 != null) {
                                class227 var73 = new class227();
                                var73.field4143 = var9;
                                var73.field4134 = var9.field822;
                                class211.field3838.method1123(var73, (byte) -128);
                            }
                        }
                    }
                    if (!var9.field795 && class207.field3691 == null && class159.field2891 == null && !class244.field4418) {
                        if ((var9.field708 >= 0 || var9.field697 != 0) && class150.field2735 >= var12 && class126.field2435 >= var13 && class150.field2735 < var14 && class126.field2435 < var15) {
                            if (var9.field708 >= 0) {
                                class85.field1695 = arg0[var9.field708];
                            } else {
                                class85.field1695 = var9;
                            }
                        }
                        if (var9.field810 == 8 && class150.field2735 >= var12 && class126.field2435 >= var13 && class150.field2735 < var14 && class126.field2435 < var15) {
                            class177.field3239 = var9;
                        }
                        if (var9.field782 > var9.field758) {
                            class186.method1271(var9.field782, var9.field789 + var10, class126.field2435, 16, class150.field2735, var11, var9.field758, var9);
                        }
                    }
                    if (var9.field810 == 0) {
                        method1081(arg0, var9.field779, var12, var13, var14, var15, var10 - var9.field696, var11 - var9.field819);
                        if (var9.field762 != null) {
                            method1081(var9.field762, var9.field779, var12, var13, var14, var15, var10 - var9.field696, var11 - var9.field819);
                        }
                        class97 var74 = (class97) class114.field2288.method1755((long) var9.field779, (byte) -111);
                        if (var74 != null) {
                            class235.method1633(var13, var15, var14, 46, var12, var10, var11, var74.field1895);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1063(int arg0) {
        field2814++;
        if (class284.field5008 == 1000) {
            return;
        }
        class163.field2968++;
        if ((class163.field2968 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class130.field2497 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class42.field858.setSeed((long) class130.field2497);
        }
        this.method1075(95);
        if (class104.field2006 != null) {
            class104.field2006.method1551((byte) -96);
        }
        class68.method499((byte) 43);
        class117.method831(arg0 ^ 0xE7532302);
        class253.method1745(-20720);
        class100.method695(0);
        if (class7.field149 != null) {
            int var3 = class7.field149.method1399(-1);
            class62.field1227 = var3;
        }
        if (class284.field5008 == 0) {
            this.method1077(-30);
            class173.method1191((byte) 42);
        } else if (class284.field5008 == 5) {
            this.method1077(-58);
            class173.method1191((byte) 47);
        } else if (class284.field5008 == 25 || class284.field5008 == 28) {
            class257.method1776((byte) 125);
        }
        if (class284.field5008 == 10) {
            this.method1074((byte) 20);
            class6.method47((byte) -116);
            class268.method1826(-126);
            class142.method991(false);
        } else if (class284.field5008 == 30) {
            class98.method688(0);
        } else if (class284.field5008 == 40) {
            class142.method991(false);
            if (class8.field164 != -3) {
                if (class8.field164 == 15) {
                    class219.method1542(-118);
                } else if (class8.field164 != 2) {
                    class94.method657(false);
                }
            }
        }
        if (arg0 != 6) {
            field2818 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method1066(byte arg0) {
        field2815++;
        if (class284.field5008 == 1000) {
            return;
        }
        boolean var2 = class169.method1161((byte) -88);
        if (var2 && class94.field1865 && class95.field1876 != null) {
            class95.field1876.method57((byte) 105);
        }
        if ((class284.field5008 == 30 || class284.field5008 == 10) && (class76.field1429 || class136.field2555 != 0L && class136.field2555 < class180.method1236(112))) {
            class257.method1779((byte) -65, class258.method1788(8), class76.field1429, class150.field2741, class262.field4714);
        }
        if (class84.field1682 == null) {
            Container var3;
            if (class84.field1682 != null) {
                var3 = class84.field1682;
            } else if (class230.field4176 == null) {
                var3 = class230.field4187.field2638;
            } else {
                var3 = class230.field4176;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class230.field4176 == var3) {
                Insets var6 = class230.field4176.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class117.field2337 != var4 || class234.field4220 != var5) {
                if (class143.field2639.startsWith("mac")) {
                    class117.field2337 = var4;
                    class234.field4220 = var5;
                } else {
                    class227.method1595((byte) 40);
                }
                class136.field2555 = class180.method1236(-4) + 500L;
            }
        }
        boolean var7 = false;
        if (class155.field2841) {
            class155.field2841 = false;
            var7 = true;
        }
        if (var7) {
            class3.method17((byte) -105);
        }
        if (class284.field5008 == 0) {
            class207.method1409(2, var7, class146.field2691, class239.field4325, (Color) null);
        } else if (class284.field5008 == 5) {
            class259.method1792(class66.field1269, false, 302);
        } else if (class284.field5008 == 10) {
            class61.method460(0);
        } else if (class284.field5008 == 25 || class284.field5008 == 28) {
            if (class261.field4700 == 1) {
                if (class137.field2585 < class185.field3333) {
                    class137.field2585 = class185.field3333;
                }
                int var8 = (class137.field2585 - class185.field3333) * 50 / class137.field2585;
                class164.method1133(false, (byte) 99, class229.method1604(new class209[] { class198.field3544, class94.field1863, class66.method485(var8, (byte) 104), class99.field1931 }, (byte) 82));
            } else if (class261.field4700 == 2) {
                if (class170.field3122 < class137.field2576) {
                    class170.field3122 = class137.field2576;
                }
                int var9 = (class170.field3122 - class137.field2576) * 50 / class170.field3122 + 50;
                class164.method1133(false, (byte) 65, class229.method1604(new class209[] { class198.field3544, class94.field1863, class66.method485(var9, (byte) 65), class99.field1931 }, (byte) 41));
            } else {
                class164.method1133(false, (byte) 125, class198.field3544);
            }
        } else if (class284.field5008 == 30) {
            class249.method1731(-1);
        } else if (class284.field5008 == 40) {
            class164.method1133(false, (byte) 71, class229.method1604(new class209[] { class132.field2537, class195.field3500, class159.field2898 }, (byte) 56));
        }
        if ((class284.field5008 == 30 || class284.field5008 == 10) && class13.field251 == 0 && !var7) {
            try {
                Graphics var12 = class122.field2411.getGraphics();
                for (int var13 = 0; var13 < class266.field4771; var13++) {
                    if (class31.field562[var13]) {
                        class187.field3374.method76(class21.field400[var13], class163.field2958[var13], (byte) -35, class210.field3831[var13], class45.field900[var13], var12);
                        class31.field562[var13] = false;
                    }
                }
            } catch (Exception var15) {
                class122.field2411.repaint();
            }
        } else if (class284.field5008 != 0) {
            try {
                Graphics var10 = class122.field2411.getGraphics();
                class187.field3374.method67(0, (byte) 104, var10, 0);
                for (int var11 = 0; var11 < class266.field4771; var11++) {
                    class31.field562[var11] = false;
                }
            } catch (Exception var16) {
                class122.field2411.repaint();
            }
        }
        if (class141.field2606) {
            class175.method1204(31613);
        }
        int var14 = 68 % ((-arg0 - 90) / 34);
        if (class68.field1309 && class284.field5008 == 10 && class149.field2727 != -1) {
            class68.field1309 = false;
            class183.method1250((byte) 49, class230.field4187);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILck;)V")
    public static final void method1082(int arg0, int arg1, int arg2, int arg3, class218 arg4) {
        field2824++;
        if (arg0 != 128) {
            field2818 = null;
        }
        for (class92 var5 = (class92) class273.field4846.method1119(20896); var5 != null; var5 = (class92) class273.field4846.method1120(125)) {
            if (var5.field1825 == arg2 && (arg3 * 128) == var5.field1828 && arg1 * 128 == var5.field1820 && var5.field1821.field3952 == arg4.field3952) {
                if (var5.field1830 != null) {
                    class47.field906.method1519(var5.field1830);
                    var5.field1830 = null;
                }
                if (var5.field1811 != null) {
                    class47.field906.method1519(var5.field1811);
                    var5.field1811 = null;
                }
                var5.method269(-214950896);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2822++;
        try {
            int var1 = -1;
            if (arg0.length != 4) {
                class161.method1113("argument count", 1);
            }
            class230.field4189 = Integer.parseInt(arg0[0]);
            class100.field1945 = 2;
            if (arg0[1].equals("live")) {
                class150.field2748 = 0;
            } else if (arg0[1].equals("rc")) {
                class150.field2748 = 1;
            } else if (arg0[1].equals("wip")) {
                class150.field2748 = 2;
            } else {
                class161.method1113("modewhat", 1);
            }
            class132.field2532 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class40.method300(class281.method1897(0, var2.length, -29806, var2), true);
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class131.field2514 = var1;
            } else if (arg0[2].equals("english")) {
                class131.field2514 = 0;
            } else if (arg0[2].equals("german")) {
                class131.field2514 = 1;
            } else {
                class161.method1113("language", 1);
            }
            class251.method1738(class131.field2514, -127);
            class181.field3284 = false;
            class245.field4442 = false;
            if (arg0[3].equals("game0")) {
                class218.field3936 = 0;
            } else if (arg0[3].equals("game1")) {
                class218.field3936 = 1;
            } else {
                class161.method1113("game", 1);
            }
            class60.field1210 = 0;
            class197.field3539 = false;
            field2812 = class246.field4451;
            class79.field1467 = 0;
            client var3 = new client();
            class257.field4637 = var3;
            var3.method1055(768, 523, "runescape", 28, 1024, class150.field2748 + 32, 124);
            class230.field4176.setLocation(40, 40);
        } catch (Exception var6) {
            class78.method548((byte) -17, (String) null, var6);
        }
    }
}
