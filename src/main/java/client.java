import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class65 {

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lu;")
    private static class135 field506 = class87.method676((byte) -57, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lu;")
    public static class135 field508 = class87.method676((byte) -91, "Sprites geladen)3");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field513 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[J")
    public static long[] field510 = new long[32];

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[[[B")
    public static byte[][][] field525 = new byte[4][104][104];

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field526 = 0;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Lu;")
    private static class135 field528 = class87.method676((byte) -42, "Connection lost");

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "[[I")
    public static int[][] field524 = new int[5][5000];

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lu;")
    public static class135 field521 = class87.method676((byte) -61, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lu;")
    public static class135 field519 = field528;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field516 = false;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lu;")
    public static class135 field531 = field506;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
    public static boolean field535;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
    public static int[] field533;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
    public static int[] field534;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    private final void method162(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        class119.field2829++;
        class15.field360 = null;
        class19.field443 = 0;
        class136.field3300 = null;
        field523++;
        if (class62.field1556 == class128.field3086) {
            class62.field1556 = class10.field238;
        } else {
            class62.field1556 = class128.field3086;
        }
        if (class119.field2829 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class83.field1963 <= 5) {
                this.method534("js5connect_full", 20906);
                class83.field1963 = 1000;
            } else {
                class44.field1056 = 3000;
            }
        } else if (class119.field2829 >= 2 && arg1 == 6) {
            this.method534("js5connect_outofdate", 20906);
            class83.field1963 = 1000;
        } else if (class119.field2829 >= 4) {
            if (class83.field1963 <= 5) {
                this.method534("js5connect", 20906);
                class83.field1963 = 1000;
            } else {
                class44.field1056 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method163(byte arg0) {
        field512++;
        if (arg0 >= 71 && class83.field1963 != 1000) {
            boolean var2 = class58.method443(true);
            if (!var2) {
                this.method173((byte) -69);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method164(int arg0) {
        field509++;
        boolean var2 = class76.method612((byte) 100);
        if (var2 && class69.field1709 && class95.field2288 != null) {
            class95.field2288.method598((byte) -102);
        }
        if (class145.field3540) {
            class139.method1128((byte) 57, class59.field1484);
            class23.method197((byte) -3, class59.field1484);
            if (class10.field247 != null) {
                class10.field247.method968(256, class59.field1484);
            }
            this.method540(0);
            class35.method274((byte) -12, class59.field1484);
            class41.method303((byte) 44, class59.field1484);
            if (class10.field247 != null) {
                class10.field247.method970(class59.field1484, -118);
            }
        }
        if (class83.field1963 == 0) {
            class25.method210(class97.field2346, null, true, class57.field1398);
        } else if (class83.field1963 == 5) {
            class129.method1043(class143.field3500, class63.field1579, arg0 - 22277);
        } else if (class83.field1963 == 10) {
            class129.method1043(class143.field3500, class63.field1579, 8223);
        } else if (class83.field1963 == 20) {
            class129.method1043(class143.field3500, class63.field1579, 8223);
        } else if (class83.field1963 == 25) {
            if (class93.field2215 == 1) {
                if (class40.field942 < class35.field827) {
                    class40.field942 = class35.field827;
                }
                int var4 = (class40.field942 - class35.field827) * 50 / class40.field942;
                class12.method89(class108.field2606, -244, class107.method867(2, new class135[] { class39.field911, class68.method547(arg0 - 30501, var4), class34.field794 }), true);
            } else if (class93.field2215 == 2) {
                if (class75.field1761 > class56.field1379) {
                    class56.field1379 = class75.field1761;
                }
                int var3 = (class56.field1379 - class75.field1761) * 50 / class56.field1379 + 50;
                class12.method89(class108.field2606, -244, class107.method867(2, new class135[] { class39.field911, class68.method547(arg0 ^ -30501, var3), class34.field794 }), true);
            } else {
                class12.method89(class108.field2606, arg0 ^ 0xFFFF8828, null, false);
            }
        } else if (class83.field1963 == 30) {
            class100.method826((byte) -115);
        } else if (class83.field1963 == 35) {
            class95.method782(false);
        } else if (class83.field1963 == 40) {
            class12.method89(field519, -244, class26.field635, false);
        }
        if (arg0 != 30500) {
            field533 = null;
        }
        class125.field2986 = 0;
        class14.field335 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method165(int arg0) {
        field514++;
        method171(false);
        class135.method1081((byte) -53);
        class65.method539(31715);
        class103.method843(72);
        class122.method962((byte) 23);
        class79.method627(200);
        class59.method489(70);
        class108.method873(-70);
        class109.method883(66);
        class39.method297(23753);
        class139.method1125((byte) 118);
        class111.method910(10626);
        class117.method935(2);
        class18.method134();
        class127.method1016();
        class99.method815(-15687);
        class145.method1188(false);
        class23.method184((byte) 39);
        class146.method1205(true);
        class123.method971(-25933);
        class102.method838(14096);
        class75.method601(false);
        class52.method400((byte) -49);
        class25.method201(-8);
        class84.method654(-123);
        class9.method43(false);
        class44.method342(108);
        class55.method421((byte) 100);
        class41.method305(0);
        class80.method628(-1640);
        class46.method353((byte) 74);
        class29.method237(0);
        class91.method696();
        class110.method895();
        class104.method850(117);
        class130.method1048(100);
        class87.method677((byte) 125);
        class2.method11((byte) 9);
        class40.method300(108);
        class116.method927((byte) 127);
        class143.method1176(65535);
        class3.method13(true);
        class30.method247(184);
        class151.method1220(-83);
        class106.method858((byte) -74);
        class88.method678();
        class77.method615((byte) 48);
        class120.method958(70);
        class14.method96(0);
        class113.method922(127);
        class43.method327((byte) -4);
        class37.method284(false);
        class98.method800(0);
        class141.method1134((byte) -36);
        class60.method504((byte) 122);
        class22.method176(14935);
        class101.method828(520);
        class50.method374(-31);
        class48.method365((byte) -17);
        class83.method644(0);
        class86.method668((byte) 109);
        class100.method825(118);
        class128.method1041(0);
        class34.method270(125);
        class51.method391();
        class70.method567();
        class126.method986(false);
        class76.method611(-1);
        class90.method680((byte) 112);
        class20.method156((byte) -32);
        class73.method592();
        class148.method1214(36);
        class82.method640(12668);
        class107.method869(19122);
        class95.method776(-9);
        class28.method233(82);
        class42.method308(45);
        class119.method955(25374);
        class94.method771((byte) 109);
        class136.method1105((byte) -118);
        class19.method147(0);
        class17.method111(false);
        class53.method403(19179);
        class62.method518(33);
        int var2 = 96 / ((10 - arg0) / 61);
        class38.method288(false);
        class85.method660(20079);
        class72.method580();
        class49.method368((byte) -5);
        class125.method977(12);
        class97.method799(-4);
        class4.method14(-126);
        class69.method556((byte) 28);
        class58.method442(43);
        class152.method1224(0);
        class57.method437(202);
        class5.method24((byte) 122);
        class33.method262();
        class56.method429(26);
        class63.method526((byte) 55);
        class12.method90((byte) -117);
        class96.method787(0);
        class8.method38(-7513);
        class105.method856(536870912);
        class35.method272((byte) 40);
        class115.method926((byte) -117);
        class32.method257(0);
        class78.method624(124);
        class10.method58(1);
        class124.method973(-65);
        class1.method7(false);
        class132.method1056(7761);
        class21.method159(32);
        class138.method1121(77);
        class89.method679();
        class142.method1169();
        class47.method358((byte) 43);
        class134.method1062();
        class26.method214(99);
        class31.method248();
        class131.method1050(57);
        class129.method1044(-1258);
        class15.method98((byte) 78);
        class133.method1059(181);
        class137.method1112();
        class112.method914();
        class93.method759(32767);
        class68.method552((byte) -107);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Z")
    public static final boolean method166(byte arg0, int arg1, int arg2) {
        int var3 = 47 / ((arg0 - 58) / 62);
        field527++;
        if (arg1 == 0 && class15.field365 == arg2) {
            return true;
        } else if (arg1 == 1 && class135.field3233 == arg2) {
            return true;
        } else {
            return (arg1 == 2 || arg1 == 3) && class136.field3294 == arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Lu;")
    public static final class135 method167(int arg0, int arg1) {
        class135 var2 = new class135();
        var2.field3255 = arg0;
        var2.field3266 = new byte[arg1];
        field522++;
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method168(byte arg0) {
        field511++;
        class128.field3086 = class43.field1018 == 0 ? 43594 : class52.field1240 + 40000;
        class62.field1556 = class128.field3086;
        class10.field238 = class43.field1018 == 0 ? 443 : class52.field1240 + 50000;
        if (arg0 != -76) {
            field524 = null;
        }
        class101.method829(42);
        class35.method274((byte) -127, class59.field1484);
        class41.method303((byte) 109, class59.field1484);
        class10.field247 = class130.method1047(-112);
        if (class10.field247 != null) {
            class10.field247.method970(class59.field1484, -92);
        }
        class2.field62 = class27.field656;
        try {
            if (class41.field965.field652 != null) {
                class105.field2516 = new class39(class41.field965.field652, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class77.field1821[var2] = new class39(class41.field965.field644[var2], 6000, 0);
                }
                class99.field2401 = new class39(class41.field965.field658, 6000, 0);
                class68.field1677 = new class139(255, class105.field2516, class99.field2401, 500000);
                class41.field965.field652 = null;
                class41.field965.field658 = null;
                class41.field965.field644 = null;
            }
        } catch (IOException var3) {
            class68.field1677 = null;
            class99.field2401 = null;
            class105.field2516 = null;
        }
        if (class43.field1018 != 0) {
            class103.field2498 = true;
        }
        class2.field60 = new class146();
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field529++;
        if (!this.method532(true)) {
            return;
        }
        class52.field1240 = Integer.parseInt(this.getParameter("worldid"));
        class34.field788 = Integer.parseInt(this.getParameter("modewhat"));
        class43.field1018 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class53.method406(4);
        } else {
            class78.method622(-25416);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class1.field26 = true;
        } else {
            class1.field26 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class25.method206(false);
            class113.field2725 = class56.field1385;
            class111.field2701 = 1;
        }
        try {
            class42.field967 = Integer.parseInt(this.getParameter("js"));
            class63.field1568 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var4) {
        }
        class104.field2515 = this.getCodeBase().getHost();
        this.method535(class34.field788 + 32, (byte) -127, 765, 456, 503);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method169(int arg0) {
        class126.field2998++;
        field520++;
        this.method163((byte) 109);
        class85.method664(104);
        class50.method373(-96);
        class37.method282(true);
        if (arg0 != -41) {
            field516 = true;
        }
        class82.method642((byte) 119);
        class90.method683(0);
        if (class10.field247 != null) {
            int var2 = class10.field247.method967((byte) -124);
            class113.field2719 = var2;
            class14.field335 += var2;
        }
        if (class83.field1963 == 0) {
            class90.method681(arg0 - 79);
            class44.method343((byte) 15);
        } else if (class83.field1963 == 5) {
            class1.method4(1, this);
            class90.method681(-70);
            class44.method343((byte) 15);
        } else if (class83.field1963 == 10) {
            class1.method4(1, this);
        } else if (class83.field1963 == 20) {
            class1.method4(1, this);
            class141.method1161((byte) 55);
        } else if (class83.field1963 == 25) {
            class96.method791((byte) 126);
        }
        if (class83.field1963 == 30) {
            class39.method294(false);
        } else if (class83.field1963 == 35) {
            class39.method294(false);
            return;
        } else if (class83.field1963 == 40) {
            class141.method1161((byte) 112);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lg;I)V")
    public static final void method170(class43 arg0, int arg1) {
        class125.field2984 = arg0;
        if (arg1 != 1) {
            method167(-69, 47);
        }
        field530++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static void method171(boolean arg0) {
        field506 = null;
        field524 = null;
        field533 = null;
        field525 = null;
        if (arg0) {
            return;
        }
        field528 = null;
        field521 = null;
        field531 = null;
        field519 = null;
        field510 = null;
        field508 = null;
        field534 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (class46.field1097 != null) {
            class46.field1097.field1861 = false;
        }
        field532++;
        class46.field1097 = null;
        if (class104.field2501 != null) {
            class104.field2501.method874((byte) -106);
            class104.field2501 = null;
        }
        class63.method527(121);
        class63.method528(12);
        class10.field247 = null;
        if (class95.field2288 != null) {
            class95.field2288.method602((byte) 119);
        }
        if (class115.field2761 != null) {
            class115.field2761.method602((byte) 119);
        }
        class5.method21(-112);
        class111.method911(-20743);
        try {
            if (class105.field2516 != null) {
                class105.field2516.method292(-207);
            }
            if (arg0 >= -66) {
                method167(86, -6);
            }
            if (class77.field1821 != null) {
                for (int var2 = 0; var2 < class77.field1821.length; var2++) {
                    if (class77.field1821[var2] != null) {
                        class77.field1821[var2].method292(-207);
                    }
                }
            }
            if (class99.field2401 != null) {
                class99.field2401.method292(-207);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class65.method537(64);
            }
            class52.field1240 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class43.field1018 = 0;
            } else if (arg0[1].equals("office")) {
                class43.field1018 = 1;
            } else if (arg0[1].equals("local")) {
                class43.field1018 = 2;
            } else {
                class65.method537(126);
            }
            if (arg0[2].equals("live")) {
                class34.field788 = 0;
            } else if (arg0[2].equals("rc")) {
                class34.field788 = 1;
            } else if (arg0[2].equals("wip")) {
                class34.field788 = 2;
            } else {
                class65.method537(14);
            }
            if (arg0[3].equals("lowmem")) {
                class53.method406(4);
            } else if (arg0[3].equals("highmem")) {
                class78.method622(-25416);
            } else {
                class65.method537(5);
            }
            if (arg0[4].equals("free")) {
                class1.field26 = false;
            } else if (arg0[4].equals("members")) {
                class1.field26 = true;
            } else {
                class65.method537(124);
            }
            if (arg0[5].equals("english")) {
                class111.field2701 = 0;
            } else if (arg0[5].equals("german")) {
                class25.method206(false);
                class113.field2725 = class56.field1385;
                class111.field2701 = 1;
            } else {
                class65.method537(30);
            }
            class104.field2515 = "127.0.0.1";
            client var1 = new client();
            var1.method536((byte) 120, 16, 456, 503, class34.field788 + 32, 765, "runescape");
        } catch (Exception var3) {
            class34.method267(null, 35, var3);
        }
        field518++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method173(byte arg0) {
        field515++;
        if (class55.field1298 >= 4) {
            this.method534("js5crc", 20906);
            class83.field1963 = 1000;
            return;
        }
        if (class35.field823 >= 4) {
            if (class83.field1963 <= 5) {
                this.method534("js5io", 20906);
                class83.field1963 = 1000;
                return;
            }
            class35.field823 = 3;
            class44.field1056 = 3000;
        }
        if (class44.field1056-- > 0) {
            return;
        }
        try {
            if (class19.field443 == 0) {
                class136.field3300 = class41.field965.method219(-19431, class62.field1556, class104.field2515);
                class19.field443++;
            }
            if (class19.field443 == 1) {
                if (class136.field3300.field1592 == 2) {
                    this.method162(false, -1);
                    return;
                }
                if (class136.field3300.field1592 == 1) {
                    class19.field443++;
                }
            }
            if (class19.field443 == 2) {
                class15.field360 = new class108((Socket) class136.field3300.field1596, class41.field965);
                class59 var2 = new class59(5);
                var2.method452(15, 255);
                var2.method463(84, 456);
                class15.field360.method870(5, 0, 0, var2.field1495);
                class19.field443++;
                class1.field25 = class14.method95(87);
            }
            if (class19.field443 == 3) {
                if (class83.field1963 <= 5 || class15.field360.method877(123) > 0) {
                    int var3 = class15.field360.method875((byte) -70);
                    if (var3 != 0) {
                        this.method162(false, var3);
                        return;
                    }
                    class19.field443++;
                } else if (class14.method95(-38) - class1.field25 > 30000L) {
                    this.method162(false, -2);
                    return;
                }
            }
            if (class19.field443 == 4) {
                class53.method404((byte) -124, class83.field1963 > 20, class15.field360);
                class19.field443 = 0;
                class119.field2829 = 0;
                class15.field360 = null;
                class136.field3300 = null;
            }
        } catch (IOException var4) {
            this.method162(false, -3);
        }
        if (arg0 >= -43) {
            field513 = -98;
        }
    }
}
