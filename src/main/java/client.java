import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class91 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lad;")
    private static class5 field498 = class88.method674("Remove", 112);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lad;")
    public static class5 field499 = field498;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lsb;")
    public static class110 field494;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lsb;")
    public static class110 field496;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Luc;")
    public static class123 field492;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
    public static boolean field505;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[[[B")
    public static byte[][][] field497;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V", line = 5)
    private final void method145(boolean arg0, int arg1) {
        class58.field1436 = null;
        class12.field364 = 0;
        if (arg0) {
            this.method155(11);
        }
        class82.field1941++;
        field487++;
        if (class88.field2056 == class25.field625) {
            class25.field625 = class88.field2076;
        } else {
            class25.field625 = class88.field2056;
        }
        class89.field2109 = null;
        if (class82.field1941 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class20.field524 > 5) {
                class89.field2106 = 3000;
            } else {
                this.method692("js5connect_full", 88);
                class20.field524 = 1000;
            }
        } else if (class82.field1941 >= 2 && arg1 == 6) {
            this.method692("js5connect_outofdate", 78);
            class20.field524 = 1000;
        } else if (class82.field1941 >= 4) {
            if (class20.field524 <= 5) {
                this.method692("js5connect", 116);
                class20.field524 = 1000;
            } else {
                class89.field2106 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 63)
    private final void method146(int arg0) {
        field503++;
        if (class21.field544 >= 4) {
            this.method692("js5crc", 103);
            class20.field524 = 1000;
            return;
        }
        if (class35.field893 >= 4) {
            if (class20.field524 <= 5) {
                this.method692("js5io", arg0 ^ 0x1C1);
                class20.field524 = 1000;
                return;
            }
            class89.field2106 = 3000;
            class35.field893 = 3;
        }
        if (class89.field2106-- > 0) {
            return;
        }
        try {
            if (class12.field364 == 0) {
                class89.field2109 = class25.field631.method16(true, class25.field625);
                class12.field364++;
            }
            if (class12.field364 == 1) {
                if (class89.field2109.field1513 == 2) {
                    this.method145(false, -1);
                    return;
                }
                if (class89.field2109.field1513 == 1) {
                    class12.field364++;
                }
            }
            if (class12.field364 == 2) {
                class58.field1436 = new class40((Socket) class89.field2109.field1516, class25.field631);
                class39 var2 = new class39(5);
                var2.method307(arg0 ^ 0xE8DB7459, 15);
                var2.method308(433, (byte) 77);
                class58.field1436.method349(0, -1, 5, var2.field974);
                class12.field364++;
                class8.field293 = class95.method728(128);
            }
            if (class12.field364 == 3) {
                if (class20.field524 <= 5 || class58.field1436.method348(0) > 0) {
                    int var3 = class58.field1436.method346(0);
                    if (var3 != 0) {
                        this.method145(false, var3);
                        return;
                    }
                    class12.field364++;
                } else if (class95.method728(arg0 - 305) - class8.field293 > 30000L) {
                    this.method145(false, -2);
                    return;
                }
            }
            if (class12.field364 == 4) {
                class110.method890(class20.field524 > 20, -3, class58.field1436);
                class82.field1941 = 0;
                class12.field364 = 0;
                class89.field2109 = null;
                class58.field1436 = null;
            }
            if (arg0 != 433) {
                field496 = null;
            }
        } catch (IOException var4) {
            this.method145(false, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 192)
    public final void method147(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class80.field1890) {
            class96.method736((byte) 92, class9.field305);
            class14.method121(class9.field305, 255);
            this.method699((byte) 40);
            class112.method896(-1, class9.field305);
            class12.method115(class9.field305, true);
        }
        field500++;
        if (class20.field524 == 0) {
            class70.method554(-75, null, class109.field2732, class101.field2463);
        } else if (class20.field524 == 5) {
            class47.method414(class135.field3263, -25870, class49.field1263);
        } else if (class20.field524 == 10) {
            class47.method414(class135.field3263, -25870, class49.field1263);
        } else if (class20.field524 == 20) {
            class47.method414(class135.field3263, -25870, class49.field1263);
        } else if (class20.field524 == 25) {
            if (class17.field443 == 1) {
                if (class82.field1930 > class81.field1916) {
                    class81.field1916 = class82.field1930;
                }
                int var2 = (class81.field1916 - class82.field1930) * 50 / class81.field1916;
                class73.method584(23370, true, class69.field1640, class69.method546(true, new class5[] { class133.field3213, class106.method864(18413, var2), class6.field218 }));
            } else if (class17.field443 == 2) {
                if (class22.field571 < class89.field2099) {
                    class22.field571 = class89.field2099;
                }
                int var3 = (class22.field571 - class89.field2099) * 50 / class22.field571 + 50;
                class73.method584(23370, true, class69.field1640, class69.method546(true, new class5[] { class133.field3213, class106.method864(18413, var3), class6.field218 }));
            } else {
                class73.method584(23370, false, class69.field1640, null);
            }
        } else if (class20.field524 == 30) {
            class104.method833(true);
        } else if (class20.field524 == 35) {
            class43.method361(128);
        } else if (class20.field524 == 40) {
            class73.method584(23370, false, class34.field850, class95.field2268);
        }
        class8.field281 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 271)
    public final void method148(byte arg0) {
        field495++;
        if (class32.field777 != null) {
            class32.field777.field1269 = false;
        }
        class32.field777 = null;
        if (class59.field1455 != null) {
            class59.field1455.method350(arg0 - 5927);
            class59.field1455 = null;
        }
        class69.method542(arg0 ^ 0xFFFF8A0F);
        class23.method178(arg0 - 26193);
        class78.method608((byte) 118);
        class10.method104(false);
        class18.method143(-118);
        class131.method1022((byte) -4);
        try {
            if (class116.field2867 != null) {
                class116.field2867.method250(127);
            }
            if (class59.field1448 != null) {
                for (int var2 = 0; var2 < class59.field1448.length; var2++) {
                    if (class59.field1448[var2] != null) {
                        class59.field1448[var2].method250(124);
                    }
                }
            }
            if (arg0 != 9) {
                field497 = null;
            }
            if (class10.field327 != null) {
                class10.field327.method250(127);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 339)
    public static final void main(String[] arg0) {
        field504++;
        try {
            if (arg0.length != 6) {
                class39.method300(119);
            }
            class5.field210 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class78.field1855 = 0;
            } else if (arg0[1].equals("office")) {
                class78.field1855 = 1;
            } else if (arg0[1].equals("local")) {
                class78.field1855 = 2;
            } else {
                class39.method300(121);
            }
            if (arg0[2].equals("live")) {
                class49.field1266 = 0;
            } else if (arg0[2].equals("rc")) {
                class49.field1266 = 1;
            } else if (arg0[2].equals("wip")) {
                class49.field1266 = 2;
            } else {
                class39.method300(102);
            }
            if (arg0[3].equals("lowmem")) {
                class16.method126(-1);
            } else if (arg0[3].equals("highmem")) {
                class81.method633(3);
            } else {
                class39.method300(122);
            }
            if (arg0[4].equals("free")) {
                class14.field407 = false;
            } else if (arg0[4].equals("members")) {
                class14.field407 = true;
            } else {
                class39.method300(86);
            }
            if (arg0[5].equals("english")) {
                class13.field382 = 0;
            } else if (arg0[5].equals("german")) {
                class121.method957(-36);
                class13.field382 = 1;
            } else {
                class39.method300(95);
            }
            client var1 = new client();
            var1.method698(433, "runescape", 13, 765, 111, class49.field1266 + 32, 503, InetAddress.getLocalHost());
        } catch (Exception var3) {
            class118.method932(var3, null, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Z", line = 419)
    public static final boolean method149(int arg0, int arg1, boolean arg2) {
        field502++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (!arg2) {
            method149(-35, -53, true);
        }
        class70 var3 = class42.method357(arg1, (byte) -42);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method560(1, arg0);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 457)
    public final void init() {
        field491++;
        if (!this.method689(-1)) {
            return;
        }
        class5.field210 = Integer.parseInt(this.getParameter("worldid"));
        class49.field1266 = Integer.parseInt(this.getParameter("modewhat"));
        class78.field1855 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class16.method126(-1);
        } else {
            class81.method633(3);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class14.field407 = true;
        } else {
            class14.field407 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class121.method957(-83);
            class13.field382 = 1;
        }
        this.method695(765, 503, 433, (byte) -117, class49.field1266 + 32);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 509)
    public static void method150(int arg0) {
        field496 = null;
        if (arg0 != -16777217) {
            field483 = 64;
        }
        field494 = null;
        field499 = null;
        field492 = null;
        field497 = null;
        field498 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III[Ljd;[BII)V", line = 527)
    public static final void method151(int arg0, int arg1, int arg2, class58[] arg3, byte[] arg4, int arg5, int arg6) {
        field485++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg3[var7].field1418[arg1 + var12][arg5 + var13] = class104.method832(arg3[var7].field1418[arg1 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class39 var8 = new class39(arg4);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class32.method257(arg2, var9, (byte) -94, 0, var8, arg5 + var11, var10 - -arg1, arg6);
                }
            }
        }
        if (arg0 != 5) {
            method151(59, 22, 45, null, null, 123, -1);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 596)
    public final void method152(int arg0) {
        class88.field2056 = class78.field1855 == 0 ? 43594 : class5.field210 + 40000;
        field484++;
        int var2 = 76 / ((arg0 + 54) / 39);
        class88.field2076 = class78.field1855 == 0 ? 443 : class5.field210 + 50000;
        class25.field625 = class88.field2056;
        class69.method539(84);
        class112.method896(-1, class9.field305);
        class12.method115(class9.field305, true);
        class48.field1248 = class2.field24;
        try {
            if (class25.field631.field26 != null) {
                class116.field2867 = new class30(class25.field631.field26, 5200, 0);
                for (int var3 = 0; var3 < 13; var3++) {
                    class59.field1448[var3] = new class30(class25.field631.field27[var3], 6000, 0);
                }
                class10.field327 = new class30(class25.field631.field25, 6000, 0);
                class83.field1963 = new class102(255, class116.field2867, class10.field327, 500000);
                class25.field631.field26 = null;
                class25.field631.field25 = null;
                class25.field631.field27 = null;
            }
        } catch (IOException var4) {
            class10.field327 = null;
            class116.field2867 = null;
            class83.field1963 = null;
        }
        if (class78.field1855 != 0) {
            class32.field784 = true;
        }
        class102.field2479 = new class105();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 668)
    public final void method153(int arg0) {
        field488++;
        class69.field1636++;
        this.method155(-1001);
        class75.method596(arg0 ^ 0x45DF);
        class78.method603(false);
        class101.method810(-75);
        class18.method140(0);
        class95.method732((byte) 77);
        if (class20.field524 == 0) {
            class47.method412(114);
            class80.method624((byte) 40);
        } else if (class20.field524 == 5) {
            class47.method412(arg0 ^ 0x45F1);
            class80.method624((byte) 40);
        } else if (class20.field524 == 10) {
            class17.method136(0);
        } else if (class20.field524 == 20) {
            class17.method136(arg0 ^ 0x45D7);
            class49.method427(arg0 ^ 0xFFFFBA2B);
        } else if (class20.field524 == 25) {
            class25.method216((byte) 92);
        }
        if (arg0 != 17879) {
            field486 = 7;
        }
        if (class20.field524 == 30) {
            class8.method89((byte) 76);
        } else if (class20.field524 == 35) {
            class8.method89((byte) -101);
        } else if (class20.field524 == 40) {
            class49.method427(arg0 - 17883);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 726)
    public final void method154(int arg0) {
        method150(arg0 ^ 0xFEFFFD02);
        field493++;
        class5.method50(-15294);
        class91.method693(arg0 ^ 0xFFFFFD54);
        class59.method483((byte) 42);
        class110.method887(arg0 - 845);
        class49.method426((byte) -93);
        class39.method327(-12240);
        class40.method351((byte) -69);
        class116.method925(65);
        class30.method244(120);
        class102.method818(100);
        class61.method500((byte) 23);
        class25.method214(-106);
        class130.method1011();
        class97.method774();
        class58.method474(arg0 - 733);
        class112.method895((byte) 64);
        class23.method187(-607);
        class105.method844(0);
        class89.method679(-124);
        class60.method485(-1);
        class3.method19((byte) 48);
        class132.method1025(-1);
        class118.method936(35);
        class46.method409(-1);
        class12.method113((byte) -102);
        class35.method272((byte) -14);
        class73.method586(true);
        class9.method99(0);
        class72.method569((byte) 59);
        class45.method401();
        class86.method658(arg0 - 765);
        class99.method794(true);
        class104.method834((byte) -120);
        class129.method997((byte) -116);
        class54.method440(127);
        class69.method544((byte) 114);
        class103.method826(false);
        class7.method85((byte) 4);
        class63.method502(64);
        class32.method261(78);
        class56.method455(false);
        class15.method124();
        class133.method1026((byte) 59);
        class96.method735(94);
        class95.method725((byte) -75);
        class42.method353(arg0 ^ 0x283);
        class106.method853((byte) -110);
        class48.method420(1);
        class78.method607(-17903);
        class100.method805((byte) -55);
        class75.method594(0);
        class17.method137(0);
        class22.method170((byte) -120);
        class87.method660(110);
        class109.method883((byte) -99);
        class19.method158(true);
        class114.method911();
        class55.method446();
        class47.method411((byte) 66);
        class18.method142(false);
        class20.method164(27606);
        class101.method811(arg0 - 265);
        class92.method706(true);
        class88.method671(5);
        class70.method553(arg0 + 64770);
        class27.method221(true);
        class98.method790((byte) -84);
        class108.method875((byte) -13);
        class82.method637(-115);
        class81.method631(0);
        class65.method511(false);
        class64.method507();
        class36.method276(-126);
        class16.method127(96);
        class121.method956(-124);
        class94.method720(arg0 - 845);
        class38.method295((byte) 100);
        class6.method82(arg0 ^ 0x282);
        class119.method944();
        class1.method1((byte) -101);
        class128.method987((byte) 77);
        class33.method264(true);
        class79.method614((byte) -33);
        class21.method167(true);
        class77.method598(true);
        class4.method27(-120);
        if (arg0 != 765) {
            return;
        }
        class134.method1031(-1);
        class10.method105(-1);
        class14.method123(116);
        class52.method436(arg0 - 881);
        class8.method94(-114);
        class83.method641(25224);
        class74.method589((byte) -114);
        class44.method367();
        class13.method118(2048);
        class41.method352();
        class135.method1035((byte) 49);
        class93.method712();
        class34.method265(18002);
        class53.method438((byte) -44);
        class50.method430((byte) 116);
        class90.method687(arg0 ^ 0xFFFFFD05);
        class127.method985();
        class28.method238();
        class120.method949((byte) 69);
        class43.method363(arg0 ^ 0x2FD);
        class80.method626((byte) 68);
        class67.method528();
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 879)
    private final void method155(int arg0) {
        field489++;
        if (~class20.field524 != arg0) {
            boolean var2 = class128.method990(25140);
            if (!var2) {
                this.method146(433);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILad;Lad;Lrd;)Luc;", line = 896)
    public static final class123 method156(int arg0, class5 arg1, class5 arg2, class106 arg3) {
        if (arg0 != 2) {
            method149(-58, -25, true);
        }
        int var4 = arg3.method870(arg2, 82);
        int var5 = arg3.method858(var4, (byte) 81, arg1);
        field501++;
        return class99.method796(arg3, var5, var4, 7);
    }
}
