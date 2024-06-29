import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class78 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
    public static boolean field431 = false;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lva;")
    public static class121 field435 = class107.method797("@lre@", -10983);

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[[B")
    public static byte[][] field438 = new byte[50][];

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
    public static int[] field440 = new int[25];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "Lbc;")
    public static class10 field419;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lfa;")
    public static class32 field433;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field443;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
    public static int[] field421;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lbc;")
    public static class10[] field441;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 20)
    private final void method157(byte arg0) {
        field437++;
        if (class79.field1835 >= 4) {
            this.method534("js5crc", 1);
            class14.field253 = 1000;
            return;
        }
        if (class58.field1347 >= 4) {
            if (class14.field253 <= 5) {
                this.method534("js5io", 1);
                class14.field253 = 1000;
                return;
            }
            class35.field830 = 3000;
            class58.field1347 = 3;
        }
        if (class35.field830-- > 0) {
            return;
        }
        try {
            if (class115.field2607 == 0) {
                class8.field112 = class1.field18.method783(class114.field2593, (byte) 100);
                class115.field2607++;
            }
            if (class115.field2607 == 1) {
                if (class8.field112.field795 == 2) {
                    this.method164(19427, -1);
                    return;
                }
                if (class8.field112.field795 == 1) {
                    class115.field2607++;
                }
            }
            if (arg0 < -107) {
                if (class115.field2607 == 2) {
                    class41.field941 = new class44((Socket) class8.field112.field800, class1.field18);
                    class113 var2 = new class113(5);
                    var2.method836(0, 15);
                    var2.method867((byte) -66, 414);
                    class41.field941.method296(var2.field2512, 5, 0, true);
                    class115.field2607++;
                    class13.field232 = System.currentTimeMillis();
                }
                if (class115.field2607 == 3) {
                    if (class14.field253 <= 5 || class41.field941.method291(false) > 0) {
                        int var3 = class41.field941.method295(5000);
                        if (var3 != 0) {
                            this.method164(19427, var3);
                            return;
                        }
                        class115.field2607++;
                    } else if (System.currentTimeMillis() - class13.field232 > 30000L) {
                        this.method164(19427, -2);
                        return;
                    }
                }
                if (class115.field2607 == 4) {
                    class1.method4(class14.field253 > 20, (byte) 17, class41.field941);
                    class41.field941 = null;
                    class8.field112 = null;
                    class115.field2607 = 0;
                    class25.field649 = 0;
                }
            }
        } catch (IOException var4) {
            this.method164(19427, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 169)
    public static void method158(int arg0) {
        field440 = null;
        field419 = null;
        field433 = null;
        field438 = null;
        field441 = null;
        int var1 = 16 % ((arg0 - 35) / 40);
        field435 = null;
        field421 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 195)
    public final void method159(byte arg0) {
        class115.field2614++;
        field429++;
        this.method161(3);
        class33.method238(-24160);
        class18.method147(false);
        class14.method109((byte) -124);
        if (arg0 != -113) {
            field435 = null;
        }
        class79.method542((byte) 93);
        class23.method189(false);
        if (class14.field253 == 0) {
            class19.method173(true);
            class61.method447((byte) -91);
        } else if (class14.field253 == 5) {
            class19.method173(true);
            class61.method447((byte) -91);
        } else if (class14.field253 == 10) {
            class63.method455(120);
        } else if (class14.field253 == 20) {
            class63.method455(arg0 ^ 0xFFFFFFEB);
            class75.method521(-117);
        } else if (class14.field253 == 25) {
            class57.method417(-1975);
        }
        if (class14.field253 == 30) {
            class13.method108((byte) -124);
        } else if (class14.field253 == 35) {
            class13.method108((byte) -111);
        } else if (class14.field253 == 40) {
            class75.method521(-56);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 253)
    public final void method160(int arg0) {
        if (class1.field3 != null) {
            class1.field3.field839 = false;
        }
        field425++;
        class1.field3 = null;
        if (class119.field2740 != null) {
            class119.field2740.method293(-2);
        }
        class4.method27(125);
        class13.method105(78);
        class18.method150((byte) -15);
        class29.method231((byte) 119);
        class21.method182(arg0 ^ 0xFFFFA62D);
        if (arg0 != 9585) {
            method158(57);
        }
        class71.method493((byte) 97);
        try {
            if (class71.field1671 != null) {
                class71.field1671.method673(arg0 ^ 0x2508);
            }
            if (class35.field842 != null) {
                for (int var2 = 0; var2 < class35.field842.length; var2++) {
                    if (class35.field842[var2] != null) {
                        class35.field842[var2].method673(85);
                    }
                }
            }
            if (class15.field299 != null) {
                class15.field299.method673(96);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 317)
    public static final void main(String[] arg0) {
        field430++;
        try {
            if (arg0.length != 5) {
                class27.method215(11128);
            }
            class20.field547 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class37.field874 = 0;
            } else if (arg0[1].equals("office")) {
                class37.field874 = 1;
            } else if (arg0[1].equals("local")) {
                class37.field874 = 2;
            } else {
                class27.method215(11128);
            }
            if (arg0[2].equals("live")) {
                class67.field1618 = 0;
            } else if (arg0[2].equals("rc")) {
                class67.field1618 = 1;
            } else if (arg0[2].equals("wip")) {
                class67.field1618 = 2;
            } else {
                class27.method215(11128);
            }
            if (arg0[3].equals("lowmem")) {
                class58.method420(12855);
            } else if (arg0[3].equals("highmem")) {
                class50.method359((byte) 4);
            } else {
                class27.method215(11128);
            }
            if (arg0[4].equals("free")) {
                class128.field2950 = false;
            } else if (arg0[4].equals("members")) {
                class128.field2950 = true;
            } else {
                class27.method215(11128);
            }
            client var1 = new client();
            var1.method533(765, "runescape", 414, 12, InetAddress.getLocalHost(), class67.field1618 + 32, -128, 503);
        } catch (Exception var3) {
            class119.method920(true, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 411)
    private final void method161(int arg0) {
        field423++;
        if (class14.field253 == 1000) {
            return;
        }
        boolean var2 = class84.method589(arg0 ^ 0x6F);
        if (!var2) {
            this.method157((byte) -125);
        }
        if (arg0 != 3) {
            field441 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILva;)V", line = 437)
    public static final void method162(int arg0, class121 arg1) {
        field442++;
        if (arg1 == null || arg1.method942(36) == 0) {
            class67.field1620 = 0;
            return;
        }
        class121 var2 = arg1;
        int var3 = 0;
        class121[] var4 = new class121[100];
        while (true) {
            int var5 = var2.method943(32, true);
            if (var5 == -1) {
                class121 var6 = var2.method955(false);
                if (var6.method942(36) > 0) {
                    var4[var3++] = var6.method959((byte) -76);
                }
                class67.field1620 = arg0;
                label47: for (int var7 = 0; var7 < class53.field1219; var7++) {
                    class119 var8 = class114.method872((byte) 121, var7);
                    if (var8.field2711 == -1 && var8.field2708 != null) {
                        class121 var9 = var8.field2708.method959((byte) -122);
                        for (int var10 = 0; var10 < var3; var10++) {
                            if (var9.method950(arg0 - 2, var4[var10]) == -1) {
                                continue label47;
                            }
                        }
                        class96.field2140[class67.field1620] = var9;
                        class34.field825[class67.field1620] = var7;
                        class67.field1620++;
                        if (class96.field2140.length <= class67.field1620) {
                            return;
                        }
                    }
                }
                return;
            }
            class121 var11 = var2.method957(var5, true, 0).method955(false);
            if (var11.method942(arg0 ^ 0x24) > 0) {
                var4[var3++] = var11.method959((byte) 126);
            }
            var2 = var2.method965(63, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 518)
    public final void init() {
        field424++;
        if (!this.method536(32000)) {
            return;
        }
        class20.field547 = Integer.parseInt(this.getParameter("worldid"));
        class67.field1618 = Integer.parseInt(this.getParameter("modewhat"));
        class37.field874 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class58.method420(12855);
        } else {
            class50.method359((byte) 12);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class128.field2950 = true;
        } else {
            class128.field2950 = false;
        }
        this.method537(765, 0, 503, 414, class67.field1618 + 32);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 555)
    public final void method163(int arg0) {
        field420++;
        if (class60.field1440) {
            class47.method325(class46.field1079, 32);
            class66.method464(class46.field1079, true);
            this.method532((byte) -33);
            class4.method32((byte) 126, class46.field1079);
            class66.method463(90, class46.field1079);
        }
        if (class14.field253 == 0) {
            class8.method50(null, class18.field390, 21722, class52.field1215);
        } else if (class14.field253 == 5) {
            class67.method474((byte) -80, class11.field194, class60.field1426);
        } else if (class14.field253 == 10) {
            class67.method474((byte) -11, class11.field194, class60.field1426);
        } else if (class14.field253 == 20) {
            class67.method474((byte) -59, class11.field194, class60.field1426);
        } else if (class14.field253 == 25) {
            if (class79.field1845 == 1) {
                if (class12.field227 < class69.field1645) {
                    class12.field227 = class69.field1645;
                }
                int var2 = (class12.field227 - class69.field1645) * 50 / class12.field227;
                class71.method491(true, class113.method866((byte) -126, new class121[] { class84.field1940, class35.method242(var2, 10), class53.field1226 }), 1932, class115.field2616);
            } else if (class79.field1845 == 2) {
                if (class71.field1675 > class61.field1454) {
                    class61.field1454 = class71.field1675;
                }
                int var3 = (class61.field1454 - class71.field1675) * 50 / class61.field1454 + 50;
                class71.method491(true, class113.method866((byte) -61, new class121[] { class84.field1940, class35.method242(var3, 10), class53.field1226 }), 1932, class115.field2616);
            } else {
                class71.method491(false, null, 1932, class115.field2616);
            }
        } else if (class14.field253 == 30) {
            class63.method452(17);
        } else if (class14.field253 == 35) {
            class43.method289(-104);
        } else if (class14.field253 == 40) {
            class71.method491(false, class25.field628, 1932, class128.field2961);
        }
        if (arg0 > -28) {
            field419 = null;
        }
        class8.field117 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 636)
    private final void method164(int arg0, int arg1) {
        class115.field2607 = 0;
        if (arg0 != 19427) {
            field441 = null;
        }
        class8.field112 = null;
        field434++;
        class41.field941 = null;
        if (class96.field2155 == class114.field2593) {
            class114.field2593 = class22.field590;
        } else {
            class114.field2593 = class96.field2155;
        }
        class25.field649++;
        if (class25.field649 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class14.field253 > 5) {
                class35.field830 = 3000;
            } else {
                this.method534("js5connect_full", 1);
                class14.field253 = 1000;
            }
        } else if (class25.field649 >= 2 && arg1 == 6) {
            this.method534("js5connect_outofdate", 1);
            class14.field253 = 1000;
        } else if (class25.field649 >= 4) {
            if (class14.field253 > 5) {
                class35.field830 = 3000;
            } else {
                this.method534("js5connect", arg0 - 19426);
                class14.field253 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BIBLle;)V", line = 690)
    public static final void method165(byte[] arg0, int arg1, byte arg2, class71 arg3) {
        if (arg2 <= 87) {
            main(null);
        }
        field427++;
        class101 var4 = new class101();
        var4.field577 = arg1;
        var4.field2263 = arg0;
        var4.field2254 = 0;
        var4.field2252 = arg3;
        class9 var5 = class15.field294;
        synchronized (class15.field294) {
            class15.field294.method64(var4, (byte) 79);
        }
        class47.method317((byte) 60);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 716)
    public final void method166(int arg0) {
        method158(arg0 ^ 0x6A);
        field426++;
        class121.method951((byte) 35);
        class78.method538((byte) 116);
        class61.method442(-22505);
        class13.method107(16);
        class125.method980(false);
        class35.method244(arg0);
        class113.method844((byte) 86);
        class44.method294(arg0);
        class12.method97(1);
        class100.method676(14);
        class71.method492(0);
        class50.method361((byte) 91);
        class91.method618(0);
        class117.method887();
        class103.method718();
        class15.method121(true);
        class77.method531(arg0 + 12);
        class9.method58((byte) -90);
        class19.method172((byte) -118);
        class66.method470((byte) 111);
        class82.method567((byte) -13);
        class29.method229(false);
        class25.method197(-14531);
        class16.method138(21218);
        class96.method655((byte) -30);
        class22.method185((byte) -103);
        class45.method298((byte) -31);
        class63.method454(-1);
        class120.method928((byte) -37);
        class47.method314((byte) -118);
        class48.method352(256);
        class41.method271(0);
        class102.method709();
        class67.method473(arg0 + 16);
        class62.method451(true);
        class64.method460(arg0 - 92);
        class92.method628((byte) -125);
        class85.method596(false);
        class107.method796(false);
        class4.method31(true);
        class86.method601(-88);
        class60.method439((byte) -107);
        class89.method610();
        class97.method657(arg0 + 92);
        class26.method206(27624);
        class57.method413(255);
        class18.method151(arg0 ^ 0x3A);
        class27.method217(11366);
        class43.method287(true);
        class80.method549(100);
        class124.method977(83);
        class75.method520(arg0 + 10227);
        class58.method421((byte) 27);
        class81.method557(8);
        class83.method588();
        class55.method403();
        class1.method3((byte) 104);
        class37.method257((byte) 108);
        class5.method35(1);
        class11.method87((byte) 125);
        class95.method639(-92);
        class54.method382(true);
        class59.method425(5);
        class119.method924(128);
        class46.method313((byte) 119);
        class99.method670(-1113687097);
        class79.method545((byte) -96);
        class126.method987(false);
        class8.method47((byte) -104);
        class110.method808();
        class28.method220(-25704);
        class76.method528(-15356);
        class34.method240(106);
        class108.method800((byte) 64);
        class3.method26();
        class69.method483((byte) -61);
        class56.method411((byte) -42);
        class114.method877(-125);
        class84.method594(true);
        class128.method996(-120);
        class23.method194(-17194);
        class21.method180(arg0 + 31);
        class116.method883(-126);
        class20.method178((byte) -69);
        class14.method110((byte) 93);
        class42.method281((byte) -96);
        class38.method259(arg0 + 19);
        class88.method606();
        class118.method909((byte) 126);
        class106.method786();
        class127.method995(13087);
        class73.method504();
        class40.method267(true);
        class101.method685(arg0);
        class129.method1003((byte) 124);
        class90.method616(true);
        class112.method813();
        class94.method633();
        class33.method236(arg0);
        class53.method376(true);
        class52.method372(29250);
        class2.method16();
        class115.method881((byte) 62);
        if (class78.field1833) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 846)
    public final void method167(byte arg0) {
        class96.field2155 = class37.field874 == 0 ? 43594 : class20.field547 + 40000;
        class114.field2593 = class96.field2155;
        field422++;
        class22.field590 = class37.field874 == 0 ? 443 : class20.field547 + 50000;
        class82.method572(8518);
        class4.method32((byte) 85, class46.field1079);
        class66.method463(104, class46.field1079);
        class53.field1222 = class105.field2421;
        if (arg0 < 86) {
            return;
        }
        try {
            if (class1.field18.field2410 != null) {
                class71.field1671 = new class100(class1.field18.field2410, 5200, 0);
                for (int var2 = 0; var2 < 12; var2++) {
                    class35.field842[var2] = new class100(class1.field18.field2405[var2], 6000, 0);
                }
                class15.field299 = new class100(class1.field18.field2408, 6000, 0);
                class115.field2623 = new class71(255, class71.field1671, class15.field299, 500000);
                class1.field18.field2405 = null;
                class1.field18.field2408 = null;
                class1.field18.field2410 = null;
            }
        } catch (IOException var3) {
            class71.field1671 = null;
            class15.field299 = null;
            class115.field2623 = null;
        }
        if (class37.field874 != 0) {
            class84.field1952 = true;
        }
    }
}
