import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class82 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lec;")
    public static class32 field379 = class73.method594("Startseite auf (WSpielkonto wiederherstellen(W)3", true);

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field377 = 0;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lja;")
    public static class63 field382 = new class63(64);

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lnf;")
    public static class96 field392;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method145(int arg0) {
        class140.field3219++;
        this.method155(false);
        class61.method467(arg0 - 1001);
        class158.method1223(true);
        class125.method982(-7);
        field385++;
        class121.method958(103);
        class137.method1042(-18075);
        if (class102.field2403 != null) {
            int var2 = class102.field2403.method457((byte) 12);
            class72.field1696 = var2;
        }
        if (arg0 != 1000) {
            return;
        }
        if (class134.field3116 == 0) {
            class151.method1174((byte) -92);
            class113.method888(0);
        } else if (class134.field3116 == 5) {
            class23.method165((byte) 93, this);
            class151.method1174((byte) -92);
            class113.method888(0);
        } else if (class134.field3116 == 10) {
            class23.method165((byte) 93, this);
        } else if (class134.field3116 == 20) {
            class23.method165((byte) 93, this);
            class43.method330(arg0 - 13367);
        } else if (class134.field3116 == 25) {
            class118.method935((byte) -22);
        }
        if (class134.field3116 == 30) {
            class74.method601((byte) -114);
        } else if (class134.field3116 == 40) {
            class43.method330(-12367);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static void method146(boolean arg0) {
        field382 = null;
        field379 = null;
        field392 = null;
        if (arg0) {
            main(null);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method147(int arg0) {
        field395++;
        method146(false);
        class32.method239(arg0 ^ 0x39);
        class82.method649(false);
        class9.method56((byte) -68);
        class48.method363(-13532);
        class132.method1012(false);
        class66.method509(4);
        class8.method47((byte) -50);
        class44.method338((byte) -108);
        class152.method1187(arg0 + 107);
        class134.method1024(arg0 ^ 0x3);
        class111.method879((byte) -111);
        class47.method354((byte) -93);
        class150.method1161();
        class117.method920(arg0 ^ arg0);
        class36.method304((byte) -126);
        class70.method581((byte) -68);
        class157.method1219((byte) -78);
        class156.method1200((byte) 125);
        class145.method1088(1536);
        class37.method314((byte) 125);
        class114.method897(true);
        class33.method280(-10470);
        class31.method225(arg0 - 5);
        class149.method1108(0);
        class115.method900(-1);
        class23.method163(arg0 ^ 0x30);
        class97.method761((byte) -126);
        class144.method1087(30079);
        class146.method1097(arg0 + 97);
        class147.method1100(-6);
        class1.method3(104);
        class63.method489((byte) 64);
        class101.method817();
        class104.method852();
        class56.method438((byte) -84);
        class159.method1227(5056);
        class19.method133(102);
        class154.method1193(101);
        class45.method348((byte) 31);
        class103.method831((byte) 111);
        class26.method183((byte) -113);
        class3.method10(64);
        class118.method936((byte) -104);
        class75.method606(arg0 + 251);
        class158.method1225(0);
        class46.method349();
        class125.method984(false);
        class64.method493(true);
        class80.method636(false);
        class109.method869(4);
        class52.method405((byte) -116);
        class137.method1040(true);
        class86.method666(16351);
        class30.method202(66);
        class15.method107(-15614);
        class68.method564((byte) -123);
        class5.method19((byte) -74);
        class11.method64(arg0 ^ 0x7C);
        class102.method828((byte) 90);
        class27.method188((byte) -33);
        class20.method135(arg0 ^ 0xFFFFFFC8);
        class105.method860((byte) 124);
        class151.method1171(false);
        class110.method875(112);
        class94.method750((byte) 0);
        class2.method5(0);
        class135.method1030(false);
        class141.method1066();
        class13.method70(116);
        class7.method30();
        class77.method615(false);
        class120.method945();
        class41.method327((byte) 123);
        class73.method595(-127);
        class129.method997(arg0 - 6);
        class57.method453(-101);
        class34.method291(true);
        class65.method497(-119);
        class53.method418((byte) -110);
        class62.method481((byte) 101);
        class121.method959(-114);
        class133.method1014(-1799683504);
        class4.method18(0);
        class61.method462(128);
        class139.method1048(false);
        class130.method1003((byte) 12);
        class99.method790();
        class140.method1053((byte) 11);
        class148.method1106();
        class14.method77((byte) 122);
        class28.method194(-7798);
        class119.method939(arg0 + 9);
        class113.method889(59);
        class107.method868((byte) -114);
        class98.method768(true);
        class143.method1080(22755);
        class89.method675((byte) 116);
        class79.method630(1);
        class12.method67(true);
        class84.method655((byte) -121);
        class126.method988(0);
        class24.method171();
        class128.method992((byte) -11);
        class136.method1038((byte) -115);
        class38.method318(true);
        class17.method126(arg0 ^ 0xFFFFFF82);
        class106.method863(1654298567);
        class39.method320(2);
        class112.method882(true);
        class54.method430(-1);
        class124.method978((byte) 54);
        class81.method638(true);
        class43.method332(-124);
        class131.method1008(true);
        class88.method672(1);
        class100.method798(-193);
        class91.method720(arg0 - 5);
        class71.method588(-126);
        class21.method140();
        class55.method434();
        class85.method663(20629);
        class42.method329();
        class92.method729(arg0 ^ 0xFFFFFFFA);
        class142.method1075(true);
        class122.method968();
        class83.method652((byte) -58);
        class50.method392((byte) 105);
        class72.method589(2);
        class93.method735();
        class76.method613();
        class74.method602(17993);
        class29.method195(-71);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method148(int arg0) {
        field390++;
        if (field388 >= 4) {
            this.method650((byte) 53, "js5crc");
            class134.field3116 = 1000;
        } else if (arg0 < -29) {
            if (class61.field1356 >= 4) {
                if (class134.field3116 <= 5) {
                    this.method650((byte) 53, "js5io");
                    class134.field3116 = 1000;
                    return;
                }
                class112.field2632 = 3000;
                class61.field1356 = 3;
            }
            if (class112.field2632-- <= 0) {
                try {
                    if (class137.field3180 == 0) {
                        class53.field1215 = class154.field3518.method181(class151.field3467, class39.field941, 2);
                        class137.field3180++;
                    }
                    if (class137.field3180 == 1) {
                        if (class53.field1215.field355 == 2) {
                            this.method151(1000, -1);
                            return;
                        }
                        if (class53.field1215.field355 == 1) {
                            class137.field3180++;
                        }
                    }
                    if (class137.field3180 == 2) {
                        class65.field1512 = new class8((Socket) class53.field1215.field352, class154.field3518);
                        class66 var2 = new class66(5);
                        var2.method515((byte) 83, 15);
                        var2.method531(false, 468);
                        class65.field1512.method49(var2.field1587, 5, 0, (byte) 127);
                        class137.field3180++;
                        class66.field1570 = class52.method408((byte) -60);
                    }
                    if (class137.field3180 == 3) {
                        if (class134.field3116 <= 5 || class65.field1512.method51((byte) 115) > 0) {
                            int var3 = class65.field1512.method46(860);
                            if (var3 != 0) {
                                this.method151(1000, var3);
                                return;
                            }
                            class137.field3180++;
                        } else if (class52.method408((byte) -32) - class66.field1570 > 30000L) {
                            this.method151(1000, -2);
                            return;
                        }
                    }
                    if (class137.field3180 == 4) {
                        class135.method1029(class65.field1512, 71, class134.field3116 > 20);
                        class137.field3180 = 0;
                        class65.field1512 = null;
                        class48.field1132 = 0;
                        class53.field1215 = null;
                    }
                } catch (IOException var4) {
                    this.method151(1000, -3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method149(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field380++;
        if (arg2 >= 1 && arg7 >= 1 && arg2 <= 102 && arg7 <= 102) {
            if (class154.field3531 && class43.field990 != arg6) {
                return;
            }
            int var8 = 0;
            if (arg1 == 0) {
                var8 = class159.field3659.method1155(arg6, arg2, arg7);
            }
            if (arg1 == 1) {
                var8 = class159.field3659.method1133(arg6, arg2, arg7);
            }
            boolean var9 = true;
            if (arg1 == 2) {
                var8 = class159.field3659.method1135(arg6, arg2, arg7);
            }
            boolean var10 = false;
            boolean var11 = false;
            if (arg1 == 3) {
                var8 = class159.field3659.method1136(arg6, arg2, arg7);
            }
            if (var8 != 0) {
                int var12 = var8 >> 14 & 0x7FFF;
                int var13 = class159.field3659.method1123(arg6, arg2, arg7, var8);
                int var14 = var13 >> 6 & 0x3;
                int var15 = var13 & 0x1F;
                if (arg1 == 0) {
                    class159.field3659.method1150(arg6, arg2, arg7);
                    class53 var16 = class5.method22(-126, var12);
                    if (var16.field1236 != 0) {
                        class105.field2484[arg6].method923(arg2, var14, var15, false, arg7, var16.field1220);
                    }
                }
                if (arg1 == 1) {
                    class159.field3659.method1126(arg6, arg2, arg7);
                }
                if (arg1 == 2) {
                    class159.field3659.method1130(arg6, arg2, arg7);
                    class53 var17 = class5.method22(64, var12);
                    if (var17.field1223 + arg2 > 103 || arg7 + var17.field1223 > 103 || var17.field1234 + arg2 > 103 || arg7 + var17.field1234 > 103) {
                        return;
                    }
                    if (var17.field1236 != 0) {
                        class105.field2484[arg6].method927(arg2, var17.field1223, arg7, 19661088, var17.field1220, var14, var17.field1234);
                    }
                }
                if (arg1 == 3) {
                    class159.field3659.method1138(arg6, arg2, arg7);
                    class53 var18 = class5.method22(95, var12);
                    if (var18.field1236 == 1) {
                        class105.field2484[arg6].method918(arg7, -31858, arg2);
                    }
                }
            }
            if (arg4 >= 0) {
                int var19 = arg6;
                if (arg6 < 3 && (class3.field50[1][arg2][arg7] & 0x2) == 2) {
                    var19 = arg6 + 1;
                }
                class66.method538(arg4, arg0, class159.field3659, arg7, var19, arg2, class105.field2484[arg6], arg6, arg5, 0);
            }
        }
        int var20 = 117 / ((arg3 + 75) / 47);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method150(int arg0) {
        field394++;
        boolean var2 = class8.method53(89);
        if (var2 && class112.field2623 && class36.field745 != null) {
            class36.field745.method896(true);
        }
        if (class158.field3621) {
            class17.method131(arg0 ^ 0x8002, class107.field2541);
            class126.method989(class107.field2541, arg0 ^ 0xFFFFFFFD);
            if (class102.field2403 != null) {
                class102.field2403.method455(class107.field2541, false);
            }
            this.method646(arg0 ^ 0xFFFF8CCE);
            class52.method404(class107.field2541, -24436);
            class128.method991(0, class107.field2541);
            if (class102.field2403 != null) {
                class102.field2403.method456(96, class107.field2541);
            }
        }
        if (arg0 != 2) {
            field382 = null;
        }
        if (class134.field3116 == 0) {
            class137.method1043(class74.field1744, 300, null, class8.field142);
        } else if (class134.field3116 == 5) {
            class159.method1228(field392, 462, class38.field914);
        } else if (class134.field3116 == 10) {
            class159.method1228(field392, arg0 + 460, class38.field914);
        } else if (class134.field3116 == 20) {
            class159.method1228(field392, arg0 + 460, class38.field914);
        } else if (class134.field3116 == 25) {
            if (class119.field2841 == 1) {
                if (class53.field1209 < class37.field880) {
                    class53.field1209 = class37.field880;
                }
                int var4 = (class53.field1209 - class37.field880) * 50 / class53.field1209;
                class14.method72(class52.method403(new class32[] { class48.field1136, class115.field2694, class159.method1230(var4, 0), class1.field14 }, (byte) -20), 16777215, false);
            } else if (class119.field2841 == 2) {
                if (class152.field3489 > class37.field884) {
                    class37.field884 = class152.field3489;
                }
                int var3 = (class37.field884 - class152.field3489) * 50 / class37.field884 + 50;
                class14.method72(class52.method403(new class32[] { class48.field1136, class115.field2694, class159.method1230(var3, 0), class1.field14 }, (byte) -20), arg0 ^ 0xFFFFFD, false);
            } else {
                class14.method72(class48.field1136, arg0 + 16777213, false);
            }
        } else if (class134.field3116 == 30) {
            class61.method463((byte) 108);
        } else if (class134.field3116 == 40) {
            class14.method72(class52.method403(new class32[] { class15.field250, class154.field3540, class86.field2008 }, (byte) -20), 16777215, false);
        }
        if (class134.field3116 == 30 && class92.field2118 == 0 && !class1.field3) {
            try {
                Graphics var5 = class107.field2541.getGraphics();
                for (int var6 = 0; var6 < class133.field3083; var6++) {
                    if (class81.field1864[var6]) {
                        class50.field1158.method124(0, var5, class28.field512[var6], class20.field366[var6], class144.field3289[var6], class124.field2894[var6]);
                        class81.field1864[var6] = false;
                    }
                }
            } catch (Exception var9) {
                class107.field2541.repaint();
            }
        } else if (class134.field3116 > 0) {
            try {
                Graphics var7 = class107.field2541.getGraphics();
                class50.field1158.method122(var7, 29504, 0, 0);
                class1.field3 = false;
                for (int var8 = 0; var8 < class133.field3083; var8++) {
                    class81.field1864[var8] = false;
                }
            } catch (Exception var10) {
                class107.field2541.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method151(int arg0, int arg1) {
        if (class39.field941 == class26.field473) {
            class39.field941 = class13.field223;
        } else {
            class39.field941 = class26.field473;
        }
        field389++;
        class48.field1132++;
        class137.field3180 = 0;
        if (arg0 != 1000) {
            this.method153(false);
        }
        class53.field1215 = null;
        class65.field1512 = null;
        if (class48.field1132 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class134.field3116 <= 5) {
                this.method650((byte) 53, "js5connect_full");
                class134.field3116 = 1000;
            } else {
                class112.field2632 = 3000;
            }
        } else if (class48.field1132 >= 2 && arg1 == 6) {
            this.method650((byte) 53, "js5connect_outofdate");
            class134.field3116 = 1000;
        } else if (class48.field1132 >= 4) {
            if (class134.field3116 > 5) {
                class112.field2632 = 3000;
            } else {
                this.method650((byte) 53, "js5connect");
                class134.field3116 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILf;)Z")
    public static final boolean method152(int arg0, class36 arg1) {
        field384++;
        int var2 = arg1.field846;
        if (var2 == 205) {
            class4.field68 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = var2 & 0x1;
            int var4 = (var2 - 300) / 2;
            class61.field1361.method229((byte) -59, var4, var3 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = var2 & 0x1;
            int var6 = (var2 - 314) / 2;
            class61.field1361.method231(-1, var5 == 1, var6);
        }
        if (var2 == 324) {
            class61.field1361.method224(-121, false);
        }
        if (var2 == 325) {
            class61.field1361.method224(-109, true);
        }
        if (var2 == 326) {
            class44.field1027.method357(78, -123);
            class61.field1361.method222(class44.field1027, -123);
            class131.field3011++;
            return true;
        } else {
            if (arg0 >= -124) {
                field388 = -55;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method153(boolean arg0) {
        if (class137.field3176 != null) {
            class137.field3176.field3024 = false;
        }
        class137.field3176 = null;
        if (arg0) {
            field388 = -8;
        }
        if (class143.field3275 != null) {
            class143.field3275.method52(-84);
            class143.field3275 = null;
        }
        class132.method1011(98);
        class106.method862(100);
        class102.field2403 = null;
        if (class36.field745 != null) {
            class36.field745.method890((byte) -124);
        }
        field393++;
        if (class29.field525 != null) {
            class29.field525.method890((byte) 85);
        }
        class41.method325(true);
        class63.method490((byte) -11);
        try {
            if (class44.field1033 != null) {
                class44.field1033.method1181(-16279);
            }
            if (class118.field2834 != null) {
                for (int var2 = 0; var2 < class118.field2834.length; var2++) {
                    if (class118.field2834[var2] != null) {
                        class118.field2834[var2].method1181(-16279);
                    }
                }
            }
            if (class152.field3502 != null) {
                class152.field3502.method1181(-16279);
            }
            if (class133.field3049 != null) {
                class133.field3049.method1181(-16279);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method154(byte arg0) {
        field387++;
        class13.field223 = class70.field1647 == 0 ? 443 : class86.field2015 + 50000;
        if (arg0 <= 50) {
            return;
        }
        if (class154.field3528 == 1) {
            class106.field2507 = class54.field1281;
            class140.field3220 = class159.field3655;
            class41.field951 = class84.field1978;
            class8.field141 = class66.field1554;
        } else {
            class106.field2507 = class152.field3491;
            class41.field951 = class83.field1943;
            class140.field3220 = class135.field3148;
            class8.field141 = class147.field3343;
        }
        class26.field473 = class70.field1647 == 0 ? 43594 : class86.field2015 + 40000;
        class39.field941 = class26.field473;
        class12.method66((byte) -75);
        class52.method404(class107.field2541, -24436);
        class128.method991(0, class107.field2541);
        class102.field2403 = class37.method315((byte) -4);
        if (class102.field2403 != null) {
            class102.field2403.method456(97, class107.field2541);
        }
        class70.field1648 = class25.field465;
        try {
            if (class154.field3518.field454 != null) {
                class44.field1033 = new class152(class154.field3518.field454, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class118.field2834[var2] = new class152(class154.field3518.field455[var2], 6000, 0);
                }
                class152.field3502 = new class152(class154.field3518.field460, 6000, 0);
                class132.field3034 = new class134(255, class44.field1033, class152.field3502, 500000);
                class133.field3049 = new class152(class154.field3518.field468, 24, 0);
                class154.field3518.field460 = null;
                class154.field3518.field454 = null;
                class154.field3518.field455 = null;
                class154.field3518.field468 = null;
            }
        } catch (IOException var3) {
            class44.field1033 = null;
            class132.field3034 = null;
            class152.field3502 = null;
            class133.field3049 = null;
        }
        if (class70.field1647 != 0) {
            class157.field3607 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field391++;
        if (!this.method640(30360)) {
            return;
        }
        class86.field2015 = Integer.parseInt(this.getParameter("worldid"));
        class53.field1218 = Integer.parseInt(this.getParameter("modewhat"));
        class70.field1647 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class144.method1085(127);
        } else {
            class133.method1020((byte) -107);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class146.field3317 = true;
        } else {
            class146.field3317 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class103.method833(false);
            class20.field371 = 1;
            class77.field1785 = class27.field490;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class154.field3528 = 1;
        } else {
            class154.field3528 = 0;
        }
        try {
            class130.field3006 = Integer.parseInt(this.getParameter("js"));
            class107.field2534 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class151.field3467 = this.getCodeBase().getHost();
        this.method648(0, class53.field1218 + 32, 765, 503, 468);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method155(boolean arg0) {
        field383++;
        if (class134.field3116 == 1000) {
            return;
        }
        boolean var2 = class68.method563(95);
        if (arg0) {
            this.method147(-120);
        }
        if (!var2) {
            this.method148(-56);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field378++;
        try {
            if (arg0.length != 7) {
                class91.method719(10649);
            }
            class86.field2015 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class70.field1647 = 0;
            } else if (arg0[1].equals("office")) {
                class70.field1647 = 1;
            } else if (arg0[1].equals("local")) {
                class70.field1647 = 2;
            } else {
                class91.method719(10649);
            }
            if (arg0[2].equals("live")) {
                class53.field1218 = 0;
            } else if (arg0[2].equals("rc")) {
                class53.field1218 = 1;
            } else if (arg0[2].equals("wip")) {
                class53.field1218 = 2;
            } else {
                class91.method719(10649);
            }
            if (arg0[3].equals("lowmem")) {
                class144.method1085(69);
            } else if (arg0[3].equals("highmem")) {
                class133.method1020((byte) -91);
            } else {
                class91.method719(10649);
            }
            if (arg0[4].equals("free")) {
                class146.field3317 = false;
            } else if (arg0[4].equals("members")) {
                class146.field3317 = true;
            } else {
                class91.method719(10649);
            }
            if (arg0[5].equals("english")) {
                class20.field371 = 0;
            } else if (arg0[5].equals("german")) {
                class103.method833(false);
                class20.field371 = 1;
                class77.field1785 = class27.field490;
            } else {
                class91.method719(10649);
            }
            if (arg0[6].equals("game0")) {
                class154.field3528 = 0;
            } else if (arg0[6].equals("game1")) {
                class154.field3528 = 1;
            } else {
                class91.method719(10649);
            }
            class151.field3467 = "127.0.0.1";
            client var1 = new client();
            var1.method641(16, 1, 468, "runescape", 765, 503, class53.field1218 + 32);
        } catch (Exception var3) {
            class110.method872(var3, null, 95);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public static final void method156(int arg0, int arg1) {
        field386++;
        if (!class28.method192(arg1, -18020)) {
            return;
        }
        class36[] var2 = class79.field1826[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class36 var4 = var2[var3];
            if (var4 != null) {
                var4.field763 = 0;
                var4.field840 = 0;
            }
        }
    }
}
