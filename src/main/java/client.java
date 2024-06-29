import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class191 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Z")
    public static boolean field533;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[[[B")
    public static byte[][][] field543;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method235(byte arg0) {
        field543 = null;
        if (arg0 < 31) {
            field536 = 127;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method236(int arg0, int arg1) {
        class195.field3619 = null;
        if (class6.field61 == class235.field4236) {
            class235.field4236 = class113.field2191;
        } else {
            class235.field4236 = class6.field61;
        }
        class165.field2992 = null;
        class231.field4171++;
        if (arg0 > -86) {
            this.method239((byte) -24);
        }
        field547++;
        class32.field499 = 0;
        if (class231.field4171 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class95.field1666 <= 5) {
                this.method1218(31, "js5connect_full");
                class95.field1666 = 1000;
            } else {
                class28.field457 = 3000;
            }
        } else if (class231.field4171 >= 2 && arg1 == 6) {
            this.method1218(31, "js5connect_outofdate");
            class95.field1666 = 1000;
        } else if (class231.field4171 >= 4) {
            if (class95.field1666 <= 5) {
                this.method1218(31, "js5connect");
                class95.field1666 = 1000;
            } else {
                class28.field457 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field534++;
        if (!this.method1220(true)) {
            return;
        }
        class82.field1377 = Integer.parseInt(this.getParameter("worldid"));
        class148.field2728 = Integer.parseInt(this.getParameter("modewhat"));
        class211.field3871 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class21.method140(0);
        } else {
            class167.method1096((byte) -126);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class40.field648 = true;
        } else {
            class40.field648 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class227.method1446((byte) 68);
            class149.field2736 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class71.field1198 = 1;
        } else {
            class71.field1198 = 0;
        }
        try {
            class220.field4008 = Integer.parseInt(this.getParameter("js"));
            class152.field2777 = Integer.parseInt(this.getParameter("plug"));
            class192.field3587 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class72.field1202 = class170.field3184.method866((byte) 5, this);
        if (class72.field1202 == null) {
            class72.field1202 = class75.field1247;
        }
        class236.field4261 = this.getCodeBase().getHost();
        this.method1217(496, (byte) -74, 503, 765, class148.field2728 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method237(int arg0) {
        if (class33.field528 != null) {
            class33.field528.field3709 = false;
        }
        class33.field528 = null;
        if (class166.field3027 != null) {
            class166.field3027.method423(true);
            class166.field3027 = null;
        }
        class211.method1312(class154.field2814, -1);
        field544++;
        class159.method1035(6967, class154.field2814);
        if (class191.field3540 != null) {
            class191.field3540.method223(-120, class154.field2814);
        }
        class19.method123(124);
        class82.method500(106);
        class191.field3540 = null;
        if (class105.field1970 != null) {
            class105.field1970.method950(256000);
        }
        if (class194.field3609 != null) {
            class194.field3609.method950(256000);
        }
        if (arg0 > -126) {
            field545 = -90;
        }
        class131.method858(-100);
        class102.method629(false);
        try {
            if (class70.field1164 != null) {
                class70.field1164.method67(18993);
            }
            if (class122.field2271 != null) {
                for (int var2 = 0; var2 < class122.field2271.length; var2++) {
                    if (class122.field2271[var2] != null) {
                        class122.field2271[var2].method67(18993);
                    }
                }
            }
            if (class227.field4115 != null) {
                class227.field4115.method67(18993);
            }
            if (class169.field3130 != null) {
                class169.field3130.method67(18993);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method238(boolean arg0) {
        field541++;
        class30.field460++;
        if (class30.field460 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class68.field1139 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class225.field4072.setSeed((long) class68.field1139);
        }
        this.method241(-34);
        class8.method37(26318);
        class116.method779((byte) 117);
        class10.method50((byte) -24);
        class202.method1273(16711680);
        if (!arg0) {
            this.method239((byte) -89);
        }
        class132.method872(0);
        if (class191.field3540 != null) {
            int var3 = class191.field3540.method225(92);
            class95.field1667 = var3;
        }
        if (class95.field1666 == 0) {
            this.method242(true);
            class133.method912(0);
        } else if (class95.field1666 == 5) {
            class152.method999(this, 0);
            this.method242(true);
            class133.method912(0);
        } else if (class95.field1666 == 10) {
            class152.method999(this, 0);
        } else if (class95.field1666 == 20) {
            class152.method999(this, 0);
            class235.method1490(-106);
        } else if (class95.field1666 == 25) {
            class93.method575(false);
        }
        if (class95.field1666 == 30) {
            class117.method786(arg0);
        } else if (class95.field1666 == 40) {
            class235.method1490(-117);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method239(byte arg0) {
        field539++;
        if (class158.field2872 >= 4) {
            this.method1218(31, "js5crc");
            class95.field1666 = 1000;
            return;
        }
        if (class75.field1245 >= 4) {
            if (class95.field1666 <= 5) {
                this.method1218(31, "js5io");
                class95.field1666 = 1000;
                return;
            }
            class75.field1245 = 3;
            class28.field457 = 3000;
        }
        if (class28.field457-- > 0) {
            return;
        }
        try {
            if (class32.field499 == 0) {
                class165.field2992 = class189.field3482.method507(class235.field4236, class236.field4261, (byte) -100);
                class32.field499++;
            }
            if (class32.field499 == 1) {
                if (class165.field2992.field2264 == 2) {
                    this.method236(-109, -1);
                    return;
                }
                if (class165.field2992.field2264 == 1) {
                    class32.field499++;
                }
            }
            if (class32.field499 == 2) {
                class195.field3619 = new class68((Socket) class165.field2992.field2269, class189.field3482);
                class112 var2 = new class112(5);
                var2.method747(15, (byte) -124);
                var2.method726((byte) -27, 496);
                class195.field3619.method419(-106, var2.field2157, 0, 5);
                class32.field499++;
                class174.field3245 = class113.method769(79);
            }
            if (class32.field499 == 3) {
                if (class95.field1666 <= 5 || class195.field3619.method424(5000) > 0) {
                    int var3 = class195.field3619.method420(true);
                    if (var3 != 0) {
                        this.method236(-104, var3);
                        return;
                    }
                    class32.field499++;
                } else if (class113.method769(40) - class174.field3245 > 30000L) {
                    this.method236(-102, -2);
                    return;
                }
            }
            if (class32.field499 == 4) {
                class15.method78(class195.field3619, class95.field1666 > 20, -69);
                class32.field499 = 0;
                class195.field3619 = null;
                class165.field2992 = null;
                class231.field4171 = 0;
            }
            if (arg0 > -74) {
                this.method243((byte) -94);
            }
        } catch (IOException var4) {
            this.method236(-89, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method240(int arg0) {
        field542++;
        method235((byte) 66);
        class132.method864(-126);
        class191.method1215((byte) -115);
        class9.method42(1314);
        class94.method579(100);
        class202.method1276(54);
        class59.method391(128);
        class112.method745(true);
        class68.method421((byte) -28);
        class155.method1018(19356);
        class14.method72((byte) 102);
        class214.method1333(-5688);
        class65.method410((byte) -115);
        class106.method656((byte) -50);
        class107.method676();
        class210.method1300((byte) 78);
        class233.method1478(arg0 ^ 0x3AEF);
        class85.method527(2048);
        class96.method602((byte) -127);
        class159.method1030(7247);
        class19.method128(arg0 ^ 0x320);
        class122.method812(115);
        class31.method227(-17363);
        class200.method1264(arg0 ^ 0xDB0B25F0);
        class128.method840((byte) -84);
        class141.method956(0);
        class102.method630(false);
        class52.method359(0);
        class236.method1500((byte) -101);
        class42.method289(-1);
        class226.method1441(1);
        class185.method1183(arg0 - 678);
        class73.method442(-115);
        class151.method994(11);
        class178.method1152((byte) -98);
        class187.method1198(false);
        class174.method1140((byte) -109);
        class158.method1027(292);
        class62.method398((byte) -123);
        class108.method690((byte) -37);
        class240.method1535(5726);
        class169.method1104(8);
        class78.method483(121);
        class183.method1172((byte) 122);
        class136.method925((byte) -10);
        class186.method1192(true);
        class220.method1372(86);
        class15.method80(false);
        class91.method568(-18784);
        class206.method1287();
        class12.method58((byte) -66);
        class8.method36((byte) -56);
        class84.method521(-2);
        class46.method308((byte) -104);
        class165.method1081(-54448920);
        class115.method773(-123);
        class76.method472();
        class81.method497(11371);
        class70.method428(93);
        class17.method88(arg0 + 9069);
        class113.method765(8);
        class148.method986(24347);
        class192.method1228(-114);
        class196.method1245((byte) 124);
        class24.method159(-24680);
        class54.method372((byte) 1);
        class30.method218((byte) -103);
        class203.method1279(false);
        class75.method451(false);
        class194.method1236((byte) -124);
        class133.method910((byte) -36);
        class129.method843((byte) -99);
        class198.method1259(128);
        class162.method1050((byte) 113);
        class16.method82(6);
        class140.method946((byte) 28);
        class90.method563((byte) 103);
        class212.method1319();
        class74.method449(arg0 ^ arg0);
        class144.method967((byte) 15);
        class117.method785(4500);
        class153.method1001((byte) -122);
        class40.method280((byte) -15);
        class211.method1311(107);
        class2.method5((byte) 115);
        class71.method436((byte) -104);
        class243.method1563((byte) -20);
        class242.method1552();
        class218.method1363(false);
        class217.method1358(-406652944);
        class182.method1168((byte) -21);
        class163.method1054((byte) -27);
        class55.method377((byte) 52);
        class21.method136((byte) -56);
        class125.method828((byte) -124);
        class239.method1524();
        class170.method1114(293147616);
        class215.method1341((byte) -127);
        class50.method341();
        class181.method1163(arg0 ^ 0xFFFFFCDF);
        class58.method387((byte) -83);
        class45.method305(false);
        class48.method320(-90);
        class219.method1369(-128);
        class160.method1036((byte) 124);
        class23.method150((byte) 0);
        class143.method964();
        class77.method479(-7448);
        class134.method915(true);
        class161.method1041(true);
        class123.method815((byte) -55);
        class229.method1460((byte) -121);
        class101.method625(-1);
        class227.method1447(arg0 ^ 0x6978);
        class87.method543();
        class22.method149((byte) 69);
        class11.method57((byte) 45);
        class97.method611((byte) 120);
        class171.method1116(arg0 ^ 0xFFFFA3F6);
        class195.method1242(-27461);
        class167.method1095(true);
        class25.method190(false);
        class157.method1022((byte) 110);
        class34.method245(0);
        class64.method405(arg0 - 876);
        class6.method23(-1);
        class37.method268(arg0 - 914);
        class110.method698((byte) -119);
        class180.method1155(113);
        class4.method19((byte) -70);
        class150.method991(5691);
        class92.method573((byte) 4);
        class208.method1288((byte) -119);
        class5.method22();
        class175.method1146();
        class149.method988(arg0 - 800);
        class109.method694();
        class26.method197(true);
        class121.method795();
        class209.method1291(1792);
        class111.method708(arg0 - 926);
        class231.method1465(true);
        class56.method381((byte) -84);
        class53.method362(121);
        class197.method1249();
        class228.method1454();
        class63.method400(5000);
        class119.method789((byte) -115);
        class43.method296(true);
        class10.method48((byte) 32);
        class61.method396((byte) -114);
        class135.method923(true);
        class216.method1346((byte) -46);
        class172.method1118(true);
        class89.method557((byte) -82);
        class235.method1489((byte) -107);
        class27.method198((byte) 124);
        class131.method859(0);
        class147.method982(false);
        class190.method1212(true);
        class184.method1179(8414);
        class222.method1395((byte) 29);
        class205.method1286(111);
        class95.method584(-32767);
        class93.method576(-1);
        class173.method1126((byte) -115);
        class104.method644(22931);
        class33.method231(false);
        class13.method62(true);
        class237.method1503((byte) 118);
        class154.method1007(arg0 ^ 0xB20);
        class139.method937((byte) 116);
        class168.method1100(-29808);
        class241.method1538(-11666);
        class138.method935((byte) 60);
        class127.method833(false);
        class72.method441(-4097);
        class166.method1093((byte) -105);
        class225.method1437(false);
        class86.method535(13789);
        class130.method855((byte) 119);
        class38.method270(false);
        class213.method1330(-4947);
        class232.method1472((byte) 45);
        class69.method427((byte) 32);
        class189.method1207(171);
        class230.method1463(arg0 - 17185);
        class66.method412((byte) 116);
        class116.method783(false);
        class36.method255((byte) 115);
        class35.method251(false);
        class41.method283(arg0 - 757);
        class103.method637((byte) -70);
        class88.method553(-1);
        class156.method1021(-110);
        class145.method976((byte) -83);
        class82.method501(2);
        class60.method393(25);
        class1.method1(-108);
        class99.method621(-90);
        class39.method275(32);
        class152.method1000(25719);
        class105.method646((byte) -85);
        class118.method787((byte) -75);
        class137.method930(11408);
        class100.method623((byte) 101);
        class32.method229(false);
        class164.method1059(37);
        class238.method1510(false);
        class47.method316((byte) -97);
        class67.method416((byte) 40);
        class234.method1481((byte) 92);
        class57.method383(0);
        class49.method323(122);
        if (class191.field3575) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field531++;
        try {
            if (arg0.length != 7) {
                class202.method1277(1);
            }
            class82.field1377 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class211.field3871 = 0;
            } else if (arg0[1].equals("office")) {
                class211.field3871 = 1;
            } else if (arg0[1].equals("local")) {
                class211.field3871 = 2;
            } else {
                class202.method1277(1);
            }
            if (arg0[2].equals("live")) {
                class148.field2728 = 0;
            } else if (arg0[2].equals("rc")) {
                class148.field2728 = 1;
            } else if (arg0[2].equals("wip")) {
                class148.field2728 = 2;
            } else {
                class202.method1277(1);
            }
            if (arg0[3].equals("lowmem")) {
                class21.method140(0);
            } else if (arg0[3].equals("highmem")) {
                class167.method1096((byte) 91);
            } else {
                class202.method1277(1);
            }
            if (arg0[4].equals("free")) {
                class40.field648 = false;
            } else if (arg0[4].equals("members")) {
                class40.field648 = true;
            } else {
                class202.method1277(1);
            }
            if (arg0[5].equals("english")) {
                class149.field2736 = 0;
            } else if (arg0[5].equals("german")) {
                class227.method1446((byte) 68);
                class149.field2736 = 1;
            } else {
                class202.method1277(1);
            }
            if (arg0[6].equals("game0")) {
                class71.field1198 = 0;
            } else if (arg0[6].equals("game1")) {
                class71.field1198 = 1;
            } else {
                class202.method1277(1);
            }
            class72.field1202 = class75.field1247;
            class236.field4261 = "127.0.0.1";
            class192.field3587 = 0;
            client var1 = new client();
            var1.method1224(15327, class148.field2728 + 32, 503, 765, "runescape", 24, 496);
            class125.field2322.setLocation(40, 40);
        } catch (Exception var3) {
            class92.method571(null, var3, 60);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    private final void method241(int arg0) {
        field548++;
        if (class95.field1666 != 1000 && arg0 <= -12) {
            boolean var2 = class47.method315(false);
            if (!var2) {
                this.method239((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    private final void method242(boolean arg0) {
        field540++;
        if (class23.field323 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class113.method769(121);
            if (class131.field2420 == 0L) {
                class131.field2420 = var4;
            }
            if (var3 > 16384 && var4 - class131.field2420 < 5000L) {
                if (var4 - class178.field3284 > 1000L) {
                    System.gc();
                    class178.field3284 = var4;
                }
                class122.field2280 = 5;
                class152.field2781 = class43.field748;
            } else {
                class152.field2781 = class208.field3783;
                class122.field2280 = 5;
                class23.field323 = 10;
            }
        } else if (class23.field323 == 10) {
            class232.method1470(4, 104, 104, class190.field3531, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class182.field3351[var6] = new class210(104, 104);
            }
            class122.field2280 = 10;
            class152.field2781 = class128.field2377;
            class23.field323 = 30;
        } else if (class23.field323 == 30) {
            class55.field943 = class129.method852(true, false, (byte) -6, true, 0);
            class161.field2926 = class129.method852(true, false, (byte) -6, true, 1);
            class172.field3220 = class129.method852(true, true, (byte) -6, false, 2);
            class192.field3581 = class129.method852(true, false, (byte) -6, true, 3);
            class139.field2600 = class129.method852(true, false, (byte) -6, true, 4);
            class168.field3077 = class129.method852(true, true, (byte) -6, true, 5);
            class69.field1161 = class129.method852(false, true, (byte) -6, true, 6);
            class139.field2616 = class129.method852(true, false, (byte) -6, true, 7);
            class65.field1068 = class129.method852(true, false, (byte) -6, true, 8);
            class110.field2094 = class129.method852(true, true, (byte) -6, false, 9);
            class62.field1043 = class129.method852(true, false, (byte) -6, true, 10);
            class171.field3196 = class129.method852(true, false, (byte) -6, true, 11);
            class200.field3690 = class129.method852(true, false, (byte) -6, true, 12);
            class94.field1654 = class129.method852(true, true, (byte) -6, false, 13);
            class71.field1199 = class129.method852(false, false, (byte) -6, true, 14);
            class77.field1323 = class129.method852(true, false, (byte) -6, true, 15);
            class101.field1888 = class129.method852(true, false, (byte) -6, true, 16);
            class230.field4144 = class129.method852(true, false, (byte) -6, true, 17);
            class105.field1959 = class129.method852(true, false, (byte) -6, true, 18);
            class215.field3940 = class129.method852(true, false, (byte) -6, true, 19);
            class61.field1031 = class129.method852(true, false, (byte) -6, true, 20);
            class168.field3079 = class129.method852(true, false, (byte) -6, true, 21);
            class227.field4110 = class129.method852(true, false, (byte) -6, true, 22);
            class230.field4152 = class129.method852(true, true, (byte) -6, true, 23);
            class122.field2280 = 15;
            class152.field2781 = class225.field4081;
            class23.field323 = 40;
        } else if (class23.field323 == 40) {
            byte var7 = 0;
            int var8 = var7 + class55.field943.method1012(-1734) * 4 / 100;
            int var9 = var8 + class161.field2926.method1012(-1734) * 4 / 100;
            int var10 = var9 + class172.field3220.method1012(-1734) / 100;
            int var11 = var10 + class192.field3581.method1012(-1734) * 2 / 100;
            int var12 = var11 + class139.field2600.method1012(-1734) * 6 / 100;
            int var13 = var12 + class168.field3077.method1012(-1734) * 4 / 100;
            int var14 = var13 + class69.field1161.method1012(-1734) * 2 / 100;
            int var15 = var14 + class139.field2616.method1012(-1734) * 53 / 100;
            int var16 = var15 + class65.field1068.method1012(-1734) * 2 / 100;
            int var17 = var16 + class110.field2094.method1012(-1734) * 2 / 100;
            int var18 = var17 + class62.field1043.method1012(-1734) * 2 / 100;
            int var19 = var18 + class171.field3196.method1012(-1734) * 2 / 100;
            int var20 = var19 + class200.field3690.method1012(-1734) * 2 / 100;
            int var21 = var20 + class94.field1654.method1012(-1734) * 2 / 100;
            int var22 = var21 + class71.field1199.method1012(-1734) * 2 / 100;
            int var23 = var22 + class77.field1323.method1012(-1734) * 2 / 100;
            int var24 = var23 + class101.field1888.method1012(-1734) / 100;
            int var25 = var24 + class230.field4144.method1012(-1734) / 100;
            int var26 = var25 + class105.field1959.method1012(-1734) / 100;
            int var27 = var26 + class215.field3940.method1012(-1734) / 100;
            int var28 = var27 + class61.field1031.method1012(-1734) / 100;
            int var29 = var28 + class168.field3079.method1012(-1734) / 100;
            int var30 = var29 + class227.field4110.method1012(-1734) / 100;
            int var31 = var30 + class230.field4152.method1012(-1734) / 100;
            if (var31 == 100) {
                class122.field2280 = 20;
                class152.field2781 = class49.field844;
                class47.method317(5, class62.field1043, class65.field1068, class69.field1161);
                class23.field323 = 45;
            } else {
                if (var31 != 0) {
                    class152.field2781 = class187.method1197(new class132[] { class46.field787, class132.method889(var31, (byte) 126), class35.field565 }, -76);
                }
                class122.field2280 = 20;
            }
        } else if (arg0) {
            if (class23.field323 == 45) {
                class133.method913(-97, 2, !class66.field1096, 22050);
                class24 var32 = new class24();
                var32.method188(128, -2020196248, 9);
                class105.field1970 = class111.method701((byte) 36, class154.field2814, 22050, 0, class189.field3482);
                class105.field1970.method947(var32, (byte) 30);
                class70.method429(class71.field1199, (byte) -100, class77.field1323, var32, class139.field2600);
                class194.field3609 = class111.method701((byte) 36, class154.field2814, 2048, 1, class189.field3482);
                class36.field586 = new class201();
                class194.field3609.method947(class36.field586, (byte) 30);
                class144.field2683 = new class102(22050, class96.field1728);
                class152.field2781 = class154.field2815;
                class23.field323 = 50;
                class122.field2280 = 30;
            } else if (class23.field323 == 50) {
                int var33 = 0;
                if (class65.field1068.method1067(class133.field2509, 1)) {
                    var33++;
                }
                if (class65.field1068.method1067(class139.field2602, 1)) {
                    var33++;
                }
                if (class65.field1068.method1067(class208.field3790, 1)) {
                    var33++;
                }
                if (class94.field1654.method1067(class133.field2509, 1)) {
                    var33++;
                }
                if (class94.field1654.method1067(class139.field2602, 1)) {
                    var33++;
                }
                if (class94.field1654.method1067(class208.field3790, 1)) {
                    var33++;
                }
                if (var33 < 6) {
                    class152.field2781 = class187.method1197(new class132[] { class69.field1158, class132.method889(var33 * 100 / 6, (byte) 103), class35.field565 }, -101);
                    class122.field2280 = 35;
                } else {
                    class152.field2781 = class33.field517;
                    class23.field323 = 60;
                    class122.field2280 = 35;
                }
            } else if (class23.field323 == 60) {
                int var34 = class210.method1310(class62.field1043, 112, class65.field1068);
                int var35 = class119.method790(-14175);
                if (var34 < var35) {
                    class152.field2781 = class187.method1197(new class132[] { class163.field2952, class132.method889(var34 * 100 / var35, (byte) 112), class35.field565 }, -127);
                    class122.field2280 = 40;
                } else {
                    class122.field2280 = 40;
                    class152.field2781 = class235.field4247;
                    class23.field323 = 65;
                }
            } else if (class23.field323 == 65) {
                class12.field161 = class157.method1024(class65.field1068, (byte) -77, class75.field1247, class94.field1654, class133.field2509);
                class22.field315 = (class98) class12.field161;
                class15.field222 = class157.method1024(class65.field1068, (byte) -68, class75.field1247, class94.field1654, class139.field2602);
                class53.field895 = class157.method1024(class65.field1068, (byte) -66, class75.field1247, class94.field1654, class208.field3790);
                class122.field2280 = 45;
                class152.field2781 = class33.field529;
                class2.method6(5, (byte) -123);
                class23.field323 = 70;
            } else if (class23.field323 == 70) {
                class172.field3220.method1064(false);
                byte var36 = 0;
                int var37 = var36 + class172.field3220.method1082((byte) -91);
                class101.field1888.method1064(!arg0);
                int var38 = var37 + class101.field1888.method1082((byte) -95);
                class230.field4144.method1064(false);
                int var39 = var38 + class230.field4144.method1082((byte) -110);
                class105.field1959.method1064(!arg0);
                int var40 = var39 + class105.field1959.method1082((byte) -98);
                class215.field3940.method1064(!arg0);
                int var41 = var40 + class215.field3940.method1082((byte) -21);
                class61.field1031.method1064(false);
                int var42 = var41 + class61.field1031.method1082((byte) -125);
                class168.field3079.method1064(false);
                int var43 = var42 + class168.field3079.method1082((byte) -54);
                class227.field4110.method1064(false);
                int var44 = var43 + class227.field4110.method1082((byte) -101);
                if (var44 < 800) {
                    class152.field2781 = class187.method1197(new class132[] { class100.field1879, class132.method889(var44 / 8, (byte) 90), class35.field565 }, -83);
                    class122.field2280 = 50;
                } else {
                    class185.method1187(class172.field3220, -1104);
                    class180.method1156(class172.field3220, 70);
                    class169.method1105((byte) 47, class172.field3220, class139.field2616);
                    class129.method844(30, class66.field1096, class139.field2616, class101.field1888, class40.field648);
                    class174.method1139(class105.field1959, 2, class139.field2616);
                    class213.method1331(class215.field3940, class40.field648, (byte) 90, class22.field315, class139.field2616);
                    class195.method1241(class55.field943, class161.field2926, (byte) -33, class61.field1031);
                    class162.method1049(class139.field2616, (byte) -68, class168.field3079);
                    class43.method302(0, class227.field4110);
                    class238.method1507(class172.field3220, (byte) -64);
                    class185.method1184(class192.field3581, class65.field1068, class139.field2616, (byte) 101, class94.field1654);
                    class226.method1444(class172.field3220, -9052);
                    class234.method1484((byte) 125, class230.field4144);
                    class145.method974(3449, class172.field3220);
                    class173.method1132((byte) 59, class172.field3220);
                    class122.field2280 = 50;
                    class152.field2781 = class86.field1506;
                    class96.method605(true);
                    class23.field323 = 80;
                }
            } else if (class23.field323 == 80) {
                int var45 = 0;
                if (class218.field3993 == null) {
                    class18 var46 = class216.method1349(0, class75.field1247, class65.field1068, class72.field1211);
                    if (var46 != null) {
                        var46.method113();
                        class218.field3993 = var46;
                    }
                } else {
                    var45++;
                }
                if (class19.field267 == null) {
                    class19.field267 = class28.method209(class217.field3967, class75.field1247, class65.field1068, (byte) 106);
                } else {
                    var45++;
                }
                if (class189.field3492 == null) {
                    class189.field3492 = class169.method1103(class220.field4005, -1, class65.field1068, class75.field1247);
                } else {
                    var45++;
                }
                if (class150.field2756 == null) {
                    class150.field2756 = class90.method558((byte) -17, class65.field1068, class34.field553, class75.field1247);
                } else {
                    var45++;
                }
                if (class86.field1499 == null) {
                    class86.field1499 = class90.method558((byte) -17, class65.field1068, class237.field4291, class75.field1247);
                } else {
                    var45++;
                }
                if (class45.field780 == null) {
                    class45.field780 = class90.method558((byte) -17, class65.field1068, class158.field2865, class75.field1247);
                } else {
                    var45++;
                }
                if (class17.field261 == null) {
                    class17.field261 = class90.method558((byte) -17, class65.field1068, class238.field4298, class75.field1247);
                } else {
                    var45++;
                }
                if (class155.field2845 == null) {
                    class155.field2845 = class90.method558((byte) -17, class65.field1068, class30.field459, class75.field1247);
                } else {
                    var45++;
                }
                if (class169.field3142 == null) {
                    class18[] var47 = class169.method1103(class160.field2908, -1, class65.field1068, class75.field1247);
                    if (var47 != null) {
                        for (int var48 = 0; var48 < var47.length; var48++) {
                            var47[var48].method113();
                        }
                        class169.field3142 = var47;
                    }
                } else {
                    var45++;
                }
                if (class130.field2411 == null) {
                    class130.field2411 = class54.method367(class130.field2412, class75.field1247, 1024, class65.field1068);
                } else {
                    var45++;
                }
                if (class48.field821 == null) {
                    class48.field821 = class90.method558((byte) -17, class65.field1068, class45.field781, class75.field1247);
                } else {
                    var45++;
                }
                if (class38.field619 == null) {
                    class38.field619 = class90.method558((byte) -17, class65.field1068, class71.field1177, class75.field1247);
                } else {
                    var45++;
                }
                if (class82.field1378 == null) {
                    class82.field1378 = class8.method33(class75.field1247, class65.field1068, class23.field329, -17992);
                } else {
                    var45++;
                }
                if (class86.field1503 == null) {
                    class86.field1503 = class8.method33(class75.field1247, class65.field1068, class19.field270, -17992);
                } else {
                    var45++;
                }
                var45++;
                if (var45 < 15) {
                    class152.field2781 = class187.method1197(new class132[] { class115.field2205, class132.method889(var45 * 100 / 15, (byte) 103), class35.field565 }, -84);
                    class122.field2280 = 60;
                } else {
                    class12.field161.method686(class86.field1503, null);
                    class15.field222.method686(class86.field1503, null);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    class53.field895.method686(class86.field1503, null);
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 41.0D) - 20;
                    int var52 = (int) (Math.random() * 21.0D) - 10;
                    for (int var53 = 0; var53 < class189.field3492.length; var53++) {
                        class189.field3492[var53].method100(var50 + var51, var49 + var51, var52 + var51);
                    }
                    class19.field267[0].method1203(var50 + var51, var49 + var51, var51 + var52);
                    class122.field2280 = 60;
                    class17.field249 = class189.field3492;
                    class152.field2781 = class33.field504;
                    class23.field323 = 90;
                }
            } else if (class23.field323 == 90) {
                if (class110.field2094.method1064(!arg0)) {
                    class170 var54 = new class170(class110.field2094, class65.field1068, 20, class66.field1096 ? 64 : 128);
                    class50.method343(var54);
                    class50.method346(0.7F);
                    class23.field323 = 110;
                    class122.field2280 = 70;
                    class152.field2781 = class88.field1549;
                } else {
                    class152.field2781 = class187.method1197(new class132[] { class162.field2939, class132.method889(class110.field2094.method1082((byte) -53), (byte) 117), class35.field565 }, -87);
                    class122.field2280 = 70;
                }
            } else if (class23.field323 == 110) {
                class33.field528 = new class202();
                class189.field3482.method505(class33.field528, 10, -4263);
                class23.field323 = 120;
                class122.field2280 = 75;
                class152.field2781 = class58.field980;
            } else if (class23.field323 == 120) {
                if (class62.field1043.method1089(class194.field3602, 4, class75.field1247)) {
                    class181 var55 = new class181(class62.field1043.method1087(class194.field3602, -18228, class75.field1247));
                    class243.method1556(127, var55);
                    class152.field2781 = class73.field1219;
                    class122.field2280 = 80;
                    class23.field323 = 130;
                } else {
                    class152.field2781 = class187.method1197(new class132[] { class71.field1181, class222.field4050 }, -93);
                    class122.field2280 = 80;
                }
            } else if (class23.field323 == 130) {
                if (!class192.field3581.method1064(!arg0)) {
                    class152.field2781 = class187.method1197(new class132[] { class101.field1896, class132.method889(class192.field3581.method1082((byte) -37) * 4 / 5, (byte) 110), class35.field565 }, -77);
                    class122.field2280 = 85;
                } else if (!class200.field3690.method1064(false)) {
                    class152.field2781 = class187.method1197(new class132[] { class101.field1896, class132.method889(class200.field3690.method1082((byte) -85) / 6 + 80, (byte) 97), class35.field565 }, -102);
                    class122.field2280 = 85;
                } else if (class94.field1654.method1064(!arg0)) {
                    class122.field2280 = 100;
                    class152.field2781 = class115.field2197;
                    class23.field323 = 140;
                } else {
                    class152.field2781 = class187.method1197(new class132[] { class101.field1896, class132.method889(class94.field1654.method1082((byte) -106) / 20 + 96, (byte) 108), class35.field565 }, -118);
                    class122.field2280 = 85;
                }
            } else if (class23.field323 == 140) {
                class168.field3077.method1069(-43, false, true);
                class69.field1161.method1069(-103, true, true);
                class65.field1068.method1069(121, true, true);
                class94.field1654.method1069(99, true, true);
                class62.field1043.method1069(94, true, true);
                class2.method6(10, (byte) 59);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method243(byte arg0) {
        field532++;
        boolean var2 = false;
        boolean var3 = class125.method826(true);
        if (var3 && class182.field3345 && class105.field1970 != null) {
            class105.field1970.method952((byte) 53);
        }
        int var4 = 115 % ((-arg0 - 17) / 35);
        if (class222.field4051) {
            class222.field4051 = false;
            var2 = true;
        }
        if (class95.field1666 == 0) {
            class9.method40(var2, class122.field2280, 58, class152.field2781, null);
        } else if (class95.field1666 == 5 || class95.field1666 == 10 || class95.field1666 == 20) {
            class189.method1208(class53.field895, 100, class12.field161);
        } else if (class95.field1666 == 25) {
            if (class46.field790 == 1) {
                if (class123.field2313 < class97.field1862) {
                    class123.field2313 = class97.field1862;
                }
                int var6 = (class123.field2313 - class97.field1862) * 50 / class123.field2313;
                class195.method1240(class187.method1197(new class132[] { class21.field309, class90.field1595, class132.method889(var6, (byte) 125), class64.field1059 }, -87), false, 250);
            } else if (class46.field790 == 2) {
                if (class37.field613 > class132.field2438) {
                    class132.field2438 = class37.field613;
                }
                int var5 = (class132.field2438 - class37.field613) * 50 / class132.field2438 + 50;
                class195.method1240(class187.method1197(new class132[] { class21.field309, class90.field1595, class132.method889(var5, (byte) 111), class64.field1059 }, -128), false, 250);
            } else {
                class195.method1240(class21.field309, false, 250);
            }
        } else if (class95.field1666 == 30) {
            class115.method776(-74);
        } else if (class95.field1666 == 40) {
            class195.method1240(class187.method1197(new class132[] { class105.field1966, class33.field513, class130.field2404 }, -115), false, 250);
        }
        Canvas var7 = class154.field2814;
        if (class95.field1666 == 30 && class205.field3757 == 0 && !var2) {
            try {
                Graphics var10 = var7.getGraphics();
                for (int var11 = 0; var11 < field536; var11++) {
                    if (class36.field603[var11]) {
                        class140.field2628.method582(class236.field4270[var11], class128.field2382[var11], (byte) -80, var10, class13.field168[var11], class203.field3725[var11]);
                        class36.field603[var11] = false;
                    }
                }
            } catch (Exception var12) {
                var7.repaint();
            }
        } else if (class95.field1666 > 0) {
            try {
                Graphics var8 = var7.getGraphics();
                class140.field2628.method581(0, -103, 0, var8);
                for (int var9 = 0; var9 < field536; var9++) {
                    class36.field603[var9] = false;
                }
            } catch (Exception var13) {
                var7.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method244(boolean arg0) {
        class2.field19 = class238.field4296 = class145.field2703 = new short[256];
        class6.field61 = class211.field3871 == 0 ? 43594 : class82.field1377 + 40000;
        field538++;
        class235.field4236 = class6.field61;
        class113.field2191 = class211.field3871 == 0 ? 443 : class82.field1377 + 50000;
        if (class71.field1198 == 1) {
            class181.field3319 = class60.field1023;
            class155.field2846 = class140.field2625;
            class166.field3025 = class6.field59;
            class151.field2758 = class155.field2820;
        } else {
            class181.field3319 = class69.field1153;
            class151.field2758 = class240.field4317;
            class166.field3025 = class186.field3450;
            class155.field2846 = class238.field4295;
        }
        class38.method272(true);
        class136.method926(class154.field2814, 80);
        class62.method399(class154.field2814, true);
        class191.field3540 = class198.method1257(64);
        if (class191.field3540 != null) {
            class191.field3540.method220((byte) 91, class154.field2814);
        }
        class220.field4020 = class83.field1398;
        try {
            if (class189.field3482.field1388 != null) {
                class70.field1164 = new class14(class189.field3482.field1388, 5200, 0);
                for (int var2 = 0; var2 < 24; var2++) {
                    class122.field2271[var2] = new class14(class189.field3482.field1399[var2], 6000, 0);
                }
                class227.field4115 = new class14(class189.field3482.field1402, 6000, 0);
                class134.field2518 = new class214(255, class70.field1164, class227.field4115, 500000);
                class169.field3130 = new class14(class189.field3482.field1403, 24, 0);
                class189.field3482.field1399 = null;
                class189.field3482.field1402 = null;
                class189.field3482.field1388 = null;
                class189.field3482.field1403 = null;
            }
        } catch (IOException var3) {
            class70.field1164 = null;
            class227.field4115 = null;
            class134.field2518 = null;
            class169.field3130 = null;
        }
        class243.field4388 = class81.field1365;
        if (arg0) {
            field537 = 90;
        }
        if (class211.field3871 != 0) {
            class152.field2782 = true;
        }
    }
}
