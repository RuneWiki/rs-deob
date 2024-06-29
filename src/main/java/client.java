import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class24 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lwd;")
    private static class150 field606 = class2.method9(true, "purple:");

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field621 = 0;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lwd;")
    public static class150 field611 = field606;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lwd;")
    private static class150 field626 = class2.method9(true, "Unexpected server response");

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field605 = 7759444;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lwd;")
    public static class150 field614 = field626;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lwd;")
    public static class150[] field622 = new class150[1000];

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Lwd;")
    private static class150 field629 = class2.method9(true, "Message");

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lwd;")
    public static class150 field619 = field629;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lwd;")
    public static class150 field624 = class2.method9(true, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field627 = 0;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "[S")
    public static short[] field633 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lwd;")
    public static class150 field634 = field606;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lsc;")
    public static class125 field608;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Z")
    public static boolean field636;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method169(int arg0, int arg1) {
        class130.field3067 = null;
        class11.field271 = null;
        field610++;
        class86.field2029 = arg0;
        if (class46.field1246 == class30.field910) {
            class46.field1246 = class135.field3182;
        } else {
            class46.field1246 = class30.field910;
        }
        class41.field1070++;
        if (class41.field1070 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class137.field3209 <= 5) {
                this.method201("js5connect_full", (byte) -66);
                class137.field3209 = 1000;
            } else {
                class43.field1200 = 3000;
            }
        } else if (class41.field1070 >= 2 && arg1 == 6) {
            this.method201("js5connect_outofdate", (byte) -66);
            class137.field3209 = 1000;
        } else if (class41.field1070 >= 4) {
            if (class137.field3209 <= 5) {
                this.method201("js5connect", (byte) -66);
                class137.field3209 = 1000;
            } else {
                class43.field1200 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method170(byte arg0) {
        boolean var2 = class46.method346((byte) -61);
        field607++;
        if (var2 && class82.field1974 && class130.field3069 != null) {
            class130.field3069.method383((byte) -10);
        }
        int var3 = 89 / ((87 - arg0) / 34);
        if (class146.field3523) {
            class26.method212((byte) 46, class142.field3439);
            class116.method809(849316225, class142.field3439);
            if (class125.field2891 != null) {
                class125.field2891.method716(8311, class142.field3439);
            }
            this.method194((byte) 116);
            class32.method255(class142.field3439, (byte) 121);
            class128.method974(0, class142.field3439);
            if (class125.field2891 != null) {
                class125.field2891.method721(class142.field3439, 32);
            }
        }
        if (class137.field3209 == 0) {
            class25.method206(class46.field1234, 16, null, class94.field2181);
        } else if (class137.field3209 == 5) {
            class68.method522(class134.field3150, 725, class105.field2374);
        } else if (class137.field3209 == 10) {
            class68.method522(class134.field3150, 725, class105.field2374);
        } else if (class137.field3209 == 20) {
            class68.method522(class134.field3150, 725, class105.field2374);
        } else if (class137.field3209 == 25) {
            if (class127.field2997 == 1) {
                if (class10.field239 > class24.field715) {
                    class24.field715 = class10.field239;
                }
                int var4 = (class24.field715 - class10.field239) * 50 / class24.field715;
                class24.method195(false, class103.field2331, class111.method786((byte) -126, new class150[] { class76.field1888, class29.method239(1000, var4), class111.field2536 }), true);
            } else if (class127.field2997 == 2) {
                if (class88.field2076 < class144.field3468) {
                    class88.field2076 = class144.field3468;
                }
                int var5 = (class88.field2076 - class144.field3468) * 50 / class88.field2076 + 50;
                class24.method195(false, class103.field2331, class111.method786((byte) -119, new class150[] { class76.field1888, class29.method239(1000, var5), class111.field2536 }), true);
            } else {
                class24.method195(false, class103.field2331, null, false);
            }
        } else if (class137.field3209 == 30) {
            class58.method446((byte) -82);
        } else if (class137.field3209 == 35) {
            class46.method349(true);
        } else if (class137.field3209 == 40) {
            class24.method195(false, class144.field3472, class126.field2915, false);
        }
        class101.field2289 = 0;
        class8.field175 = 0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class14.method107(1);
            }
            class128.field3028 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class90.field2109 = 0;
            } else if (arg0[1].equals("office")) {
                class90.field2109 = 1;
            } else if (arg0[1].equals("local")) {
                class90.field2109 = 2;
            } else {
                class14.method107(1);
            }
            if (arg0[2].equals("live")) {
                class141.field3330 = 0;
            } else if (arg0[2].equals("rc")) {
                class141.field3330 = 1;
            } else if (arg0[2].equals("wip")) {
                class141.field3330 = 2;
            } else {
                class14.method107(1);
            }
            if (arg0[3].equals("lowmem")) {
                class133.method993(-113);
            } else if (arg0[3].equals("highmem")) {
                class24.method190(87);
            } else {
                class14.method107(1);
            }
            if (arg0[4].equals("free")) {
                class47.field1264 = false;
            } else if (arg0[4].equals("members")) {
                class47.field1264 = true;
            } else {
                class14.method107(1);
            }
            if (arg0[5].equals("english")) {
                class96.field2218 = 0;
            } else if (arg0[5].equals("german")) {
                class112.method792((byte) 88);
                class96.field2218 = 1;
                class43.field1186 = class24.field684;
            } else {
                class14.method107(1);
            }
            class76.field1894 = "127.0.0.1";
            client var1 = new client();
            var1.method202(1, 454, 503, "runescape", 16, class141.field3330 + 32, 765);
        } catch (Exception var3) {
            class61.method467(null, (byte) -76, var3);
        }
        field612++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)I")
    public static final int method171(boolean arg0) {
        if (arg0) {
            field613++;
            return 19;
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method172(int arg0) {
        field625++;
        if (class146.field3527 >= 4) {
            this.method201("js5crc", (byte) -66);
            class137.field3209 = 1000;
            return;
        }
        if (class134.field3158 >= 4) {
            if (class137.field3209 <= 5) {
                this.method201("js5io", (byte) -66);
                class137.field3209 = 1000;
                return;
            }
            class43.field1200 = 3000;
            class134.field3158 = 3;
        }
        if (class43.field1200-- > 0) {
            return;
        }
        try {
            if (class86.field2029 == 0) {
                class130.field3067 = class10.field243.method1024(-19452, class46.field1246, class76.field1894);
                class86.field2029++;
            }
            if (class86.field2029 == 1) {
                if (class130.field3067.field2281 == 2) {
                    this.method169(0, -1);
                    return;
                }
                if (class130.field3067.field2281 == 1) {
                    class86.field2029++;
                }
            }
            int var2 = -18 / ((-arg0 - 48) / 50);
            if (class86.field2029 == 2) {
                class11.field271 = new class17((Socket) class130.field3067.field2282, class10.field243);
                class148 var3 = new class148(5);
                var3.method1126(31159, 15);
                var3.method1122((byte) 32, 454);
                class11.field271.method122(0, var3.field3592, (byte) 4, 5);
                class86.field2029++;
                class8.field182 = class55.method430(0);
            }
            if (class86.field2029 == 3) {
                if (class137.field3209 <= 5 || class11.field271.method125(-16059) > 0) {
                    int var4 = class11.field271.method120((byte) 76);
                    if (var4 != 0) {
                        this.method169(0, var4);
                        return;
                    }
                    class86.field2029++;
                } else if (class55.method430(0) - class8.field182 > 30000L) {
                    this.method169(0, -2);
                    return;
                }
            }
            if (class86.field2029 == 4) {
                class136.method1014(class137.field3209 > 20, 4, class11.field271);
                class41.field1070 = 0;
                class130.field3067 = null;
                class86.field2029 = 0;
                class11.field271 = null;
            }
        } catch (IOException var5) {
            this.method169(0, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsa;B[Lme;)V")
    public static final void method173(class123 arg0, byte arg1, class88[] arg2) {
        field623++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class131.field3097[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class131.field3097[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method630(false, var111, var110);
                        }
                    }
                }
            }
        }
        class70.field1764 += (int) (Math.random() * 5.0D) - 2;
        if (class70.field1764 < -8) {
            class70.field1764 = -8;
        }
        if (class70.field1764 > 8) {
            class70.field1764 = 8;
        }
        class65.field1648 += (int) (Math.random() * 5.0D) - 2;
        if (class65.field1648 < -16) {
            class65.field1648 = -16;
        }
        if (class65.field1648 > 16) {
            class65.field1648 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class118.field2738[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class121.field2789[var4][var101][var50 + 1] - class121.field2789[var4][var101][var50 - 1];
                    int var103 = class121.field2789[var4][var101 + 1][var50] - class121.field2789[var4][var101 - 1][var50];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = (var102 << 8) / var104;
                    int var108 = (var106 * -50 + var105 * -10 + var107 * -50) / var49 + 96;
                    int var109 = (var47[var101 - 1][var50] >> 2) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50 - 1] >> 2) + (var47[var101][var50 + 1] >> 3) + (var47[var101][var50] >> 1);
                    class58.field1495[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class145.field3521[var51] = 0;
                class83.field2009[var51] = 0;
                class1.field6[var51] = 0;
                class128.field3040[var51] = 0;
                class21.field595[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class11.field281[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class9 var97 = class104.method718(10, var96 - 1);
                            class145.field3521[var55] += var97.field219;
                            class83.field2009[var55] += var97.field212;
                            class1.field6[var55] += var97.field209;
                            class128.field3040[var55] += var97.field210;
                            var10002 = class21.field595[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class11.field281[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class9 var100 = class104.method718(10, var99 - 1);
                            class145.field3521[var55] -= var100.field219;
                            class83.field2009[var55] -= var100.field212;
                            class1.field6[var55] -= var100.field209;
                            class128.field3040[var55] -= var100.field210;
                            var10002 = class21.field595[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 >= 0 && var63 < 104) {
                            var59 += class1.field6[var63];
                            var60 += class21.field595[var63];
                            var56 += class145.field3521[var63];
                            var58 += class128.field3040[var63];
                            var57 += class83.field2009[var63];
                        }
                        if (var62 >= 0 && var62 < 104) {
                            var57 -= class83.field2009[var62];
                            var58 -= class128.field3040[var62];
                            var59 -= class1.field6[var62];
                            var56 -= class145.field3521[var62];
                            var60 -= class21.field595[var62];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class20.field517 || (class131.field3097[0][var52][var61] & 0x2) != 0 || (class131.field3097[var4][var52][var61] & 0x10) == 0 && class149.method1158((byte) 109, var52, var4, var61) == class107.field2435)) {
                            if (class136.field3191 > var4) {
                                class136.field3191 = var4;
                            }
                            int var64 = class11.field281[var4][var52][var61] & 0xFF;
                            int var65 = class43.field1195[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class121.field2789[var4][var52][var61];
                                int var67 = class121.field2789[var4][var52 + 1][var61];
                                int var68 = class121.field2789[var4][var52 + 1][var61 + 1];
                                int var69 = class121.field2789[var4][var52][var61 + 1];
                                int var70 = class58.field1495[var52][var61];
                                int var71 = class58.field1495[var52 + 1][var61];
                                int var72 = class58.field1495[var52][var61 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class58.field1495[var52 + 1][var61 + 1];
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var58;
                                    int var77 = var57 / var60;
                                    int var78 = var59 / var60;
                                    var73 = class43.method333(var77, var78, -124, var76);
                                    int var79 = class70.field1764 + var76 & 0xFF;
                                    int var80 = class65.field1648 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var74 = class43.method333(var77, var80, -116, var79);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class37.field1022[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class2.method13(var65 - 1, (byte) -35).field2764) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class94.field2189[var4][var52][var61] = class147.method1100(class94.field2189[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class60.field1522[class77.method572(33, var74, 96)];
                                }
                                if (var65 == 0) {
                                    arg0.method933(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class77.method572(96, var73, var70), class77.method572(106, var73, var71), class77.method572(85, var73, var75), class77.method572(102, var73, var72), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class37.field1022[var4][var52][var61] + 1;
                                    byte var84 = class111.field2559[var4][var52][var61];
                                    class119 var85 = class2.method13(var65 - 1, (byte) -41);
                                    int var86 = var85.field2745;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class60.field1532.method137((byte) 123, var86);
                                        var88 = -1;
                                    } else if (var85.field2767 == 16711935) {
                                        var87 = -2;
                                        var88 = -2;
                                        var86 = -1;
                                    } else {
                                        var88 = class43.method333(var85.field2743, var85.field2744, -128, var85.field2751);
                                        int var89 = class65.field1648 + var85.field2744;
                                        int var90 = class70.field1764 + var85.field2751 & 0xFF;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var87 = class43.method333(var85.field2743, var89, 12, var90);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class60.field1522[class31.method247(var87, 64, 96)];
                                    }
                                    if (var85.field2754 != -1) {
                                        int var92 = class70.field1764 + var85.field2760 & 0xFF;
                                        int var93 = class65.field1648 + var85.field2750;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class43.method333(var85.field2756, var93, 68, var92);
                                        var91 = class60.field1522[class31.method247(var94, 123, 96)];
                                    }
                                    arg0.method933(var4, var52, var61, var83, var84, var86, var66, var67, var68, var69, class77.method572(102, var73, var70), class77.method572(121, var73, var71), class77.method572(28, var73, var75), class77.method572(52, var73, var72), class31.method247(var88, 77, var70), class31.method247(var88, 113, var71), class31.method247(var88, 88, var75), class31.method247(var88, 116, var72), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method913(var4, var54, var53, class149.method1158((byte) 118, var54, var4, var53));
                }
            }
            class11.field281[var4] = null;
            class43.field1195[var4] = null;
            class37.field1022[var4] = null;
            class111.field2559[var4] = null;
            class118.field2738[var4] = null;
        }
        arg0.method906(-50, -10, -50);
        if (arg1 >= -16) {
            return;
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class131.field3097[1][var5][var46] & 0x2) == 2) {
                    arg0.method909(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class94.field2189[var10][var12][var11]) != 0) {
                            int var13;
                            for (var13 = var11; var13 < 104 && (var6 & class94.field2189[var10][var12][var13 + 1]) != 0; var13++) {
                            }
                            int var14 = var11;
                            int var15 = var10;
                            int var16 = var10;
                            while (var14 > 0 && (class94.field2189[var10][var12][var14 - 1] & var6) != 0) {
                                var14--;
                            }
                            label356: while (var16 > 0) {
                                for (int var17 = var14; var17 <= var13; var17++) {
                                    if ((class94.field2189[var16 - 1][var12][var17] & var6) == 0) {
                                        break label356;
                                    }
                                }
                                var16--;
                            }
                            label345: while (var15 < var9) {
                                for (int var18 = var14; var18 <= var13; var18++) {
                                    if ((class94.field2189[var15 + 1][var12][var18] & var6) == 0) {
                                        break label345;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var13 + 1 - var14) * (var15 + 1 + -var16);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class121.field2789[var16][var12][var14];
                                int var22 = class121.field2789[var15][var12][var14] - var20;
                                class123.method932(var9, 1, var12 * 128, var12 * 128, var14 * 128, var13 * 128 + 128, var22, var21);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var14; var24 <= var13; var24++) {
                                        class94.field2189[var23][var12][var24] = class94.method667(class94.field2189[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class94.field2189[var10][var12][var11] & var7) != 0) {
                            int var25 = var12;
                            int var26;
                            for (var26 = var12; var26 > 0 && (var7 & class94.field2189[var10][var26 - 1][var11]) != 0; var26--) {
                            }
                            while (var25 < 104 && (class94.field2189[var10][var25 + 1][var11] & var7) != 0) {
                                var25++;
                            }
                            int var27;
                            label411: for (var27 = var10; var27 > 0; var27--) {
                                for (int var28 = var26; var28 <= var25; var28++) {
                                    if ((var7 & class94.field2189[var27 - 1][var28][var11]) == 0) {
                                        break label411;
                                    }
                                }
                            }
                            int var29;
                            label399: for (var29 = var10; var29 < var9; var29++) {
                                for (int var30 = var26; var30 <= var25; var30++) {
                                    if ((class94.field2189[var29 + 1][var30][var11] & var7) == 0) {
                                        break label399;
                                    }
                                }
                            }
                            int var31 = (var25 + 1 - var26) * (-var27 + 1 + var29);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class121.field2789[var29][var26][var11] - var32;
                                int var34 = class121.field2789[var27][var26][var11];
                                class123.method932(var9, 2, var26 * 128, var25 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var29; var35++) {
                                    for (int var36 = var26; var36 <= var25; var36++) {
                                        class94.field2189[var35][var36][var11] = class94.method667(class94.field2189[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class94.field2189[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38 = var11;
                            int var39 = var12;
                            while (var38 > 0 && (var8 & class94.field2189[var10][var12][var38 - 1]) != 0) {
                                var38--;
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (var8 & class94.field2189[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            label465: while (var37 > 0) {
                                for (int var41 = var38; var41 <= var40; var41++) {
                                    if ((class94.field2189[var10][var37 - 1][var41] & var8) == 0) {
                                        break label465;
                                    }
                                }
                                var37--;
                            }
                            label454: while (var39 < 104) {
                                for (int var42 = var38; var42 <= var40; var42++) {
                                    if ((class94.field2189[var10][var39 + 1][var42] & var8) == 0) {
                                        break label454;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var37) * (var40 + 1 + -var38) >= 4) {
                                int var43 = class121.field2789[var10][var37][var38];
                                class123.method932(var9, 4, var37 * 128, var39 * 128 + 128, var38 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var39; var44++) {
                                    for (int var45 = var38; var45 <= var40; var45++) {
                                        class94.field2189[var10][var44][var45] = class94.method667(class94.field2189[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method174(boolean arg0) {
        field616++;
        if (class137.field3209 != 1000) {
            boolean var2 = class127.method956(arg0);
            if (!var2) {
                this.method172(-117);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (class95.field2208 != null) {
            class95.field2208.field3224 = false;
        }
        field617++;
        class95.field2208 = null;
        if (class49.field1292 != null) {
            class49.field1292.method121((byte) 113);
            class49.field1292 = null;
        }
        class130.method982((byte) 117);
        class99.method682(106);
        class125.field2891 = null;
        if (class130.field3069 != null) {
            class130.field3069.method385(-126);
        }
        if (class1.field15 != null) {
            class1.field15.method385(-80);
        }
        class4.method22(-12780);
        class95.method669((byte) -95);
        try {
            if (arg0 > -75) {
                field634 = null;
            }
            if (class113.field2630 != null) {
                class113.field2630.method49(47);
            }
            if (class78.field1922 != null) {
                for (int var2 = 0; var2 < class78.field1922.length; var2++) {
                    if (class78.field1922[var2] != null) {
                        class78.field1922[var2].method49(34);
                    }
                }
            }
            if (class135.field3169 != null) {
                class135.field3169.method49(95);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static void method176(int arg0) {
        field629 = null;
        field633 = null;
        field608 = null;
        int var1 = 36 % ((arg0 + 9) / 54);
        field611 = null;
        field606 = null;
        field624 = null;
        field614 = null;
        field622 = null;
        field619 = null;
        field634 = null;
        field626 = null;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method177(int arg0) {
        if (arg0 >= -17) {
            field627 = 120;
        }
        field635++;
        int var1 = class134.field3150.method1038(class143.field3462);
        for (int var2 = 0; var2 < class125.field2900; var2++) {
            int var12 = class134.field3150.method1043(class2.field50[var2]);
            if (var1 < var12) {
                var1 = var12;
            }
        }
        var1 += 8;
        int var3 = class125.field2900 * 15 + 21;
        if (class108.field2450 != -1) {
            class12.field305 = 0;
            class12.field292 = var1;
            class97.field2229 = class125.field2900 * 15 + 22;
            class145.field3517 = true;
            int var4 = class14.field370 - var1 / 2;
            int var5 = class131.field3098;
            if (var1 + var4 > 765) {
                var4 = 765 - var1;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 + var5 > 503) {
                var5 = 503 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class130.field3075 = var4;
            class58.field1502 = var5;
        } else if (class14.field370 > 4 && class131.field3098 > 4 && class14.field370 < 516 && class131.field3098 < 338) {
            class12.field292 = var1;
            class145.field3517 = true;
            class97.field2229 = class125.field2900 * 15 + 22;
            int var6 = class14.field370 - var1 / 2 - 4;
            class12.field305 = 0;
            int var7 = class131.field3098 - 4;
            if (var1 + var6 > 512) {
                var6 = 512 - var1;
            }
            if (var3 + var7 > 334) {
                var7 = 334 - var3;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            class130.field3075 = var6;
            if (var7 < 0) {
                var7 = 0;
            }
            class58.field1502 = var7;
        } else if (class14.field370 > 553 && class131.field3098 > 205 && class14.field370 < 743 && class131.field3098 < 466) {
            class12.field292 = var1;
            class97.field2229 = class125.field2900 * 15 + 22;
            class12.field305 = 1;
            int var8 = class131.field3098 - 205;
            int var9 = class14.field370 - var1 / 2 - 553;
            if (var9 < 0) {
                var9 = 0;
            } else if (var1 + var9 > 190) {
                var9 = 190 - var1;
            }
            class130.field3075 = var9;
            class145.field3517 = true;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 + var3 > 261) {
                var8 = 261 - var3;
            }
            class58.field1502 = var8;
        } else if (class14.field370 > 17 && class131.field3098 > 357 && class14.field370 < 496 && class131.field3098 < 453) {
            class97.field2229 = class125.field2900 * 15 + 22;
            class12.field305 = 2;
            class12.field292 = var1;
            int var10 = class14.field370 - var1 / 2 - 17;
            int var11 = class131.field3098 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var3 + var11 > 96) {
                var11 = 96 - var3;
            }
            class145.field3517 = true;
            if (var10 < 0) {
                var10 = 0;
            } else if (var1 + var10 > 479) {
                var10 = 479 - var1;
            }
            class130.field3075 = var10;
            class58.field1502 = var11;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method178(int arg0) {
        field630++;
        class68.field1720.method431(arg0 ^ arg0);
        class88.field2071.method431(0);
        class38.field1035.method431(0);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field632++;
        if (!this.method193((byte) -117)) {
            return;
        }
        class128.field3028 = Integer.parseInt(this.getParameter("worldid"));
        class141.field3330 = Integer.parseInt(this.getParameter("modewhat"));
        class90.field2109 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class133.method993(-113);
        } else {
            class24.method190(126);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class47.field1264 = true;
        } else {
            class47.field1264 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class112.method792((byte) 88);
            class96.field2218 = 1;
            class43.field1186 = class24.field684;
        }
        try {
            class105.field2382 = Integer.parseInt(this.getParameter("js"));
            class29.field873 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var4) {
        }
        class76.field1894 = this.getCodeBase().getHost();
        this.method196(765, 454, (byte) 105, 503, class141.field3330 + 32);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method179(int arg0) {
        field631++;
        if (arg0 != -27652) {
            method176(60);
        }
        class70.field1780.method546(111);
        class60.method454();
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method180(int arg0) {
        class135.field3182 = class90.field2109 == 0 ? 443 : class128.field3028 + 50000;
        class30.field910 = class90.field2109 == 0 ? 43594 : class128.field3028 + 40000;
        field615++;
        class46.field1246 = class30.field910;
        class131.method986((byte) -41);
        class32.method255(class142.field3439, (byte) 120);
        if (arg0 != 20911) {
            return;
        }
        class128.method974(0, class142.field3439);
        class125.field2891 = class103.method704(arg0 - 100020910);
        if (class125.field2891 != null) {
            class125.field2891.method721(class142.field3439, arg0 ^ 0x518F);
        }
        class6.field148 = class139.field3248;
        try {
            if (class10.field243.field3250 != null) {
                class113.field2630 = new class8(class10.field243.field3250, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class78.field1922[var2] = new class8(class10.field243.field3263[var2], 6000, 0);
                }
                class135.field3169 = new class8(class10.field243.field3261, 6000, 0);
                class28.field863 = new class106(255, class113.field2630, class135.field3169, 500000);
                class10.field243.field3263 = null;
                class10.field243.field3250 = null;
                class10.field243.field3261 = null;
            }
        } catch (IOException var3) {
            class135.field3169 = null;
            class113.field2630 = null;
            class28.field863 = null;
        }
        if (class90.field2109 != 0) {
            class2.field48 = true;
        }
        class142.field3447 = new class141();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method181(byte arg0) {
        field628++;
        method176(111);
        class150.method1207((byte) 38);
        class24.method191(-1);
        class63.method502(738874376);
        class72.method545((byte) -57);
        class138.method1022((byte) 124);
        class148.method1106(-125);
        class17.method119(true);
        class20.method143(-1);
        class8.method45(120);
        class106.method733((byte) -124);
        class18.method128(false);
        class128.method969(8);
        class140.method1051();
        class123.method931();
        class88.method621(86);
        class111.method784((byte) -115);
        class103.method700(arg0 ^ 0xAC44AF14);
        class141.method1069(false);
        class104.method715(83);
        class70.method532((byte) -114);
        class50.method377((byte) -89);
        class32.method257(false);
        class149.method1164(-34);
        class49.method369(arg0 ^ 0xFFFFFFF3);
        class127.method964((byte) 67);
        class54.method426((byte) -96);
        class118.method854((byte) 83);
        class97.method676(-8880);
        class82.method593((byte) 78);
        class16.method116(arg0 ^ 0xFFFF833C);
        class56.method437(false);
        class13.method96();
        class27.method226();
        class22.method186((byte) 54);
        if (arg0 != -13) {
            return;
        }
        class116.method811((byte) 29);
        class98.method681((byte) -95);
        class144.method1087((byte) 43);
        class30.method244((byte) -121);
        class147.method1098((byte) -122);
        class29.method241((byte) -69);
        class94.method666(arg0 - 6835);
        class12.method79((byte) -118);
        class58.method448(104);
        class83.method604(false);
        class45.method343();
        class101.method692((byte) -62);
        class80.method582((byte) -15);
        class55.method429((byte) -48);
        class134.method997(true);
        class42.method325(8);
        class6.method38((byte) 38);
        class146.method1092(62);
        class108.method752((byte) 126);
        class99.method683(37);
        class1.method2(arg0 ^ 0xC);
        class28.method238(4);
        class90.method643(4466);
        class125.method948((byte) -114);
        class34.method264(-122);
        class69.method530(88);
        class135.method1003((byte) -64);
        class126.method950(124);
        class41.method295(-29547);
        class60.method450();
        class120.method870();
        class137.method1018(arg0 + 12);
        class95.method670(19);
        class113.method796(79);
        class62.method490();
        class4.method24(false);
        class92.method655((byte) -6);
        class78.method574(0);
        class119.method861(0);
        class9.method58((byte) 61);
        class11.method65(false);
        class61.method474(-11098);
        class21.method151(arg0 + 122);
        class133.method990(false);
        class107.method739((byte) 121);
        class10.method60((byte) -126);
        class105.method728(-1);
        class35.method269(91);
        class43.method329((byte) -47);
        class85.method612();
        class121.method887((byte) 112);
        class14.method109(false);
        class74.method558((byte) -90);
        class131.method987((byte) 93);
        class130.method983((byte) 121);
        class68.method523(true);
        class37.method279(true);
        class31.method251(102);
        class38.method281(-124);
        class36.method272();
        class15.method113(16);
        class2.method11((byte) -117);
        class143.method1080(-111);
        class136.method1012(false);
        class86.method619(arg0 ^ 0xFFFFFFF2);
        class65.method507(33);
        class23.method188(false);
        class40.method291(19306);
        class145.method1089(-1);
        class3.method15((byte) -124);
        class47.method357((byte) -97);
        class73.method554(arg0 + 17299);
        class142.method1077(-901);
        class26.method208(-16079);
        class124.method945((byte) 102);
        class5.method34((byte) 82);
        class52.method414();
        class89.method642();
        class46.method345(0);
        class132.method989();
        class77.method571((byte) 123);
        class67.method512();
        class25.method204(2);
        class112.method791(-1);
        class91.method649(arg0 ^ 0xFFFFFF8C);
        class96.method672(false);
        class66.method508((byte) 43);
        class53.method424();
        class81.method588();
        class109.method782(arg0 + 34);
        class76.method567(true);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method182(int arg0) {
        field620++;
        class11.field280++;
        this.method174(true);
        class80.method581(-23232);
        if (arg0 > -62) {
            field634 = null;
        }
        class21.method156(0);
        class41.method294(-2607);
        class133.method992((byte) 38);
        class4.method28(false);
        if (class125.field2891 != null) {
            int var2 = class125.field2891.method712((byte) -29);
            class8.field175 += var2;
            class108.field2475 = var2;
        }
        if (class137.field3209 == 0) {
            class101.method690(139);
            class32.method254(false);
        } else if (class137.field3209 == 5) {
            class113.method797(75, this);
            class101.method690(139);
            class32.method254(false);
        } else if (class137.field3209 == 10) {
            class113.method797(75, this);
        } else if (class137.field3209 == 20) {
            class113.method797(75, this);
            class143.method1079(30);
        } else if (class137.field3209 == 25) {
            class10.method59(9368);
        }
        if (class137.field3209 == 30) {
            class43.method330(-128);
        } else if (class137.field3209 == 35) {
            class43.method330(-128);
        } else if (class137.field3209 == 40) {
            class143.method1079(52);
            return;
        }
    }
}
