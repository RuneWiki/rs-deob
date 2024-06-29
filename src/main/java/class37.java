import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 implements Runnable {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field837 = 0;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static volatile int field845 = -1;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lu;")
    public static class135 field850 = class87.method676((byte) -118, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lu;")
    public static class135 field848 = class87.method676((byte) -51, "Welt");

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field840 = 50;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "[Lu;")
    public static class135[] field849 = new class135[field840];

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
    public static int[] field843 = new int[field840];

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "[I")
    public static int[] field836 = new int[field840];

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "[I")
    public static int[] field841 = new int[field840];

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "[I")
    public static int[] field846 = new int[field840];

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "[I")
    public static int[] field851 = new int[field840];

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "[I")
    public static int[] field852 = new int[field840];

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lu;")
    public static class135 field854 = class87.method676((byte) -49, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[I")
    public static int[] field838 = new int[field840];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lpe;")
    public static class109 field847;

    @OriginalMember(owner = "client!fa", name = "run", descriptor = "()V")
    public final void run() {
        field835++;
        try {
            while (true) {
                class23 var1 = class23.field551;
                class129 var2;
                synchronized (class23.field551) {
                    var2 = (class129) class23.field551.method182((byte) 50);
                }
                if (var2 == null) {
                    class96.method795(100L, 125);
                    Object var3 = class60.field1528;
                    synchronized (class60.field1528) {
                        if (class93.field2216 <= 1) {
                            class93.field2216 = 0;
                            class60.field1528.notifyAll();
                            return;
                        }
                        class93.field2216--;
                    }
                } else {
                    if (var2.field3104 == 0) {
                        var2.field3109.method1126((int) var2.field951, var2.field3108, 6, var2.field3108.length);
                        class23 var4 = class23.field551;
                        synchronized (class23.field551) {
                            var2.method302(4071);
                        }
                    } else if (var2.field3104 == 1) {
                        var2.field3108 = var2.field3109.method1123((int) var2.field951, 0);
                        class23 var5 = class23.field551;
                        synchronized (class23.field551) {
                            class77.field1826.method185(var2, -27557);
                        }
                    }
                    Object var6 = class60.field1528;
                    synchronized (class60.field1528) {
                        if (class93.field2216 <= 1) {
                            class93.field2216 = 0;
                            class60.field1528.notifyAll();
                            return;
                        }
                        class93.field2216 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class34.method267(null, 35, var17);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static final void method282(boolean arg0) {
        if (class115.field2761 != null) {
            class115.field2761.method603(false);
        }
        if (!arg0) {
            field836 = null;
        }
        field853++;
        if (class95.field2288 != null) {
            class95.field2288.method603(false);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILve;)V")
    public static final void method283(int arg0, class146 arg1) {
        int var2 = arg1.field3595 >> 16;
        field839++;
        if (arg0 > -63) {
            return;
        }
        if (class49.field1174 == var2 || class99.field2384 == var2) {
            class65.field1634 = true;
        }
        if (class80.field1900 == var2 || class21.field491[class49.field1167] == var2) {
            class135.field3239 = true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static void method284(boolean arg0) {
        field841 = null;
        field847 = null;
        field851 = null;
        field838 = null;
        field854 = null;
        field848 = null;
        field850 = null;
        field836 = null;
        field852 = null;
        field849 = null;
        field843 = null;
        field846 = null;
        if (arg0) {
            method282(false);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static final void method285(byte arg0) {
        field834++;
        if (arg0 < 95) {
            field840 = -32;
        }
        while (true) {
            label389: do {
                while (class122.method965(126)) {
                    if (class106.field2552 != -1 && class9.field205 == class106.field2552) {
                        if (class46.field1106 == 85 && class113.field2718.method1063(-64) > 0) {
                            class113.field2718 = class113.field2718.method1074(0, class113.field2718.method1063(-64) - 1, -27090);
                        }
                        continue label389;
                    }
                    if (class34.field789) {
                        if (class46.field1106 == 85 && class113.field2735.method1063(-64) > 0) {
                            class113.field2735 = class113.field2735.method1074(0, class113.field2735.method1063(-64) - 1, -27090);
                            class65.field1634 = true;
                        }
                        if (class115.method924(class32.field750, 115) && class113.field2735.method1063(-64) < 80) {
                            class113.field2735 = class113.field2735.method1070(class32.field750, 255);
                            class65.field1634 = true;
                        }
                        if (class46.field1106 == 84) {
                            class65.field1634 = true;
                            class34.field789 = false;
                            if (class141.field3434 == 1) {
                                long var10 = class113.field2735.method1064(-22243);
                                class34.method269(2, var10);
                            }
                            if (class141.field3434 == 2 && class79.field1885 > 0) {
                                long var12 = class113.field2735.method1064(-22243);
                                class86.method672(104, var12);
                            }
                            if (class141.field3434 == 3 && class113.field2735.method1063(-64) > 0) {
                                class152.field3751.method929(69, -14044);
                                class9.field182++;
                                class152.field3751.method452(0, 255);
                                int var14 = class152.field3751.field1485;
                                class152.field3751.method461(11739, class38.field858);
                                class50.method372(-70, class113.field2735, class152.field3751);
                                class152.field3751.method476(class152.field3751.field1485 - var14, false);
                                if (class48.field1135 == 2) {
                                    class42.field979 = true;
                                    class101.field2436++;
                                    class48.field1135 = 1;
                                    class152.field3751.method929(37, -14044);
                                    class152.field3751.method452(class79.field1858, 255);
                                    class152.field3751.method452(class48.field1135, 255);
                                    class152.field3751.method452(class126.field3014, 255);
                                }
                            }
                            if (class141.field3434 == 4 && class119.field2844 < 100) {
                                long var15 = class113.field2735.method1064(-22243);
                                class49.method367(var15, (byte) 98);
                            }
                            if (class141.field3434 == 5 && class119.field2844 > 0) {
                                long var17 = class113.field2735.method1064(-22243);
                                class82.method641(var17, 114);
                            }
                        }
                    } else if (class42.field975 == 1) {
                        if (class46.field1106 == 85 && class113.field2722.method1063(-64) > 0) {
                            class113.field2722 = class113.field2722.method1074(0, class113.field2722.method1063(-64) - 1, -27090);
                            class65.field1634 = true;
                        }
                        if (class139.method1129(class32.field750, (byte) 126) && class113.field2722.method1063(-64) < 10) {
                            class113.field2722 = class113.field2722.method1070(class32.field750, 255);
                            class65.field1634 = true;
                        }
                        if (class46.field1106 == 84) {
                            if (class113.field2722.method1063(-64) > 0) {
                                class80.field1917++;
                                int var1 = 0;
                                if (class113.field2722.method1095((byte) 69)) {
                                    var1 = class113.field2722.method1072(-92);
                                }
                                class152.field3751.method929(203, -14044);
                                class152.field3751.method463(42, var1);
                            }
                            class65.field1634 = true;
                            class42.field975 = 0;
                        }
                    } else if (class42.field975 == 2) {
                        if (class46.field1106 == 85 && class113.field2722.method1063(-64) > 0) {
                            class113.field2722 = class113.field2722.method1074(0, class113.field2722.method1063(-64) - 1, -27090);
                            class65.field1634 = true;
                        }
                        if ((class56.method430(class32.field750, -111) || class32.field750 == 32) && class113.field2722.method1063(-64) < 12) {
                            class113.field2722 = class113.field2722.method1070(class32.field750, 255);
                            class65.field1634 = true;
                        }
                        if (class46.field1106 == 84) {
                            if (class113.field2722.method1063(-64) > 0) {
                                class152.field3751.method929(156, -14044);
                                class148.field3694++;
                                class152.field3751.method461(11739, class113.field2722.method1064(-22243));
                            }
                            class42.field975 = 0;
                            class65.field1634 = true;
                        }
                    } else if (class42.field975 == 3) {
                        if (class46.field1106 == 85 && class113.field2722.method1063(-64) > 0) {
                            class113.field2722 = class113.field2722.method1074(0, class113.field2722.method1063(-64) - 1, -27090);
                            class65.field1634 = true;
                        }
                        if (class115.method924(class32.field750, 126) && class113.field2722.method1063(-64) < 40) {
                            class113.field2722 = class113.field2722.method1070(class32.field750, 255);
                            class65.field1634 = true;
                        }
                    } else if (class42.field975 == 4) {
                        if (class46.field1106 == 85 && class113.field2722.method1063(-64) > 0) {
                            class113.field2722 = class113.field2722.method1074(0, class113.field2722.method1063(-64) - 1, -27090);
                            class65.field1634 = true;
                        }
                        if ((class115.method924(class32.field750, 120) || class32.field750 == 32) && class113.field2722.method1063(-64) < 80) {
                            class113.field2722 = class113.field2722.method1070(class32.field750, 255);
                            class65.field1634 = true;
                        }
                        if (class46.field1106 == 84) {
                            if (class113.field2722.method1063(-64) > 0) {
                                class93.field2207++;
                                class152.field3751.method929(108, -14044);
                                class152.field3751.method452(class113.field2722.method1063(-64) + 1, 255);
                                class152.field3751.method460(class113.field2722, 40);
                            }
                            class65.field1634 = true;
                            class42.field975 = 0;
                        }
                    } else if (class49.field1174 == -1 && class19.field425 == -1) {
                        if (class43.field1018 != 0 || class5.field128 > 1) {
                            class126.method988(4);
                        }
                        if (class46.field1106 == 85 && class113.field2744.method1063(-64) > 0) {
                            class113.field2744 = class113.field2744.method1074(0, class113.field2744.method1063(-64) - 1, -27090);
                            class65.field1634 = true;
                        }
                        if (class115.method924(class32.field750, 120) && class113.field2744.method1063(-64) < 80) {
                            class113.field2744 = class113.field2744.method1070(class32.field750, 255);
                            class65.field1634 = true;
                        }
                        if (class46.field1106 == 84 && class113.field2744.method1063(-64) > 0) {
                            if (class43.field1018 != 0 || class5.field128 > 1) {
                                class29.field704[class58.field1418++] = class113.field2744;
                                class22.field545 = -1;
                                if (class58.field1418 >= 20) {
                                    class58.field1418 = 0;
                                }
                            }
                            if (class5.field128 == 2) {
                                if (class113.field2744.method1069(90, class100.field2419)) {
                                    System.gc();
                                }
                                if (class113.field2744.method1069(90, class55.field1331)) {
                                    class95.method779(116);
                                }
                                if (class113.field2744.method1069(90, class85.field2016)) {
                                    class103.field2498 = true;
                                }
                                if (class113.field2744.method1069(90, class38.field861)) {
                                    class103.field2498 = false;
                                }
                                if (class113.field2744.method1069(90, class76.field1787)) {
                                    for (int var2 = 0; var2 < 4; var2++) {
                                        for (int var3 = 1; var3 < 103; var3++) {
                                            for (int var4 = 1; var4 < 103; var4++) {
                                                class58.field1437[var2].field2391[var3][var4] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class113.field2744.method1069(90, class97.field2344) && class43.field1018 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class113.field2744.method1069(90, class141.field3470)) {
                                    class82.field1920 = true;
                                }
                            }
                            if (class113.field2744.method1087(class101.field2429, (byte) -52)) {
                                class152.field3751.method929(252, -14044);
                                class152.field3751.method452(class113.field2744.method1063(-64) - 1, 255);
                                class90.field2107++;
                                class152.field3751.method460(class113.field2744.method1065((byte) -28, 2), 21);
                            } else {
                                class94.field2280++;
                                class135 var5 = class113.field2744.method1097(-41);
                                byte var6 = 0;
                                if (var5.method1087(class132.field3177, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -122, class132.field3177.method1063(-64));
                                    var6 = 0;
                                } else if (var5.method1087(class39.field915, (byte) -52)) {
                                    var6 = 1;
                                    class113.field2744 = class113.field2744.method1065((byte) -31, class39.field915.method1063(-64));
                                } else if (var5.method1087(class94.field2220, (byte) -52)) {
                                    var6 = 2;
                                    class113.field2744 = class113.field2744.method1065((byte) -42, class94.field2220.method1063(-64));
                                } else if (var5.method1087(class107.field2573, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -47, class107.field2573.method1063(-64));
                                    var6 = 3;
                                } else if (var5.method1087(class42.field974, (byte) -52)) {
                                    var6 = 4;
                                    class113.field2744 = class113.field2744.method1065((byte) -86, class42.field974.method1063(-64));
                                } else if (var5.method1087(class8.field152, (byte) -52)) {
                                    var6 = 5;
                                    class113.field2744 = class113.field2744.method1065((byte) -48, class8.field152.method1063(-64));
                                } else if (var5.method1087(class122.field2933, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -63, class122.field2933.method1063(-64));
                                    var6 = 6;
                                } else if (var5.method1087(class115.field2760, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -127, class115.field2760.method1063(-64));
                                    var6 = 7;
                                } else if (var5.method1087(class30.field730, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -62, class30.field730.method1063(-64));
                                    var6 = 8;
                                } else if (var5.method1087(class96.field2323, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -121, class96.field2323.method1063(-64));
                                    var6 = 9;
                                } else if (var5.method1087(class5.field117, (byte) -52)) {
                                    var6 = 10;
                                    class113.field2744 = class113.field2744.method1065((byte) -91, class5.field117.method1063(-64));
                                } else if (var5.method1087(class12.field291, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -31, class12.field291.method1063(-64));
                                    var6 = 11;
                                } else if (class111.field2701 != 0) {
                                    if (var5.method1087(class132.field3188, (byte) -52)) {
                                        var6 = 0;
                                        class113.field2744 = class113.field2744.method1065((byte) -119, class132.field3188.method1063(-64));
                                    } else if (var5.method1087(class39.field914, (byte) -52)) {
                                        class113.field2744 = class113.field2744.method1065((byte) -45, class39.field914.method1063(-64));
                                        var6 = 1;
                                    } else if (var5.method1087(class94.field2243, (byte) -52)) {
                                        var6 = 2;
                                        class113.field2744 = class113.field2744.method1065((byte) -60, class94.field2243.method1063(-64));
                                    } else if (var5.method1087(class107.field2578, (byte) -52)) {
                                        var6 = 3;
                                        class113.field2744 = class113.field2744.method1065((byte) -103, class107.field2578.method1063(-64));
                                    } else if (var5.method1087(class42.field976, (byte) -52)) {
                                        var6 = 4;
                                        class113.field2744 = class113.field2744.method1065((byte) -107, class42.field976.method1063(-64));
                                    } else if (var5.method1087(class8.field150, (byte) -52)) {
                                        var6 = 5;
                                        class113.field2744 = class113.field2744.method1065((byte) -66, class8.field150.method1063(-64));
                                    } else if (var5.method1087(class122.field2918, (byte) -52)) {
                                        class113.field2744 = class113.field2744.method1065((byte) -78, class122.field2918.method1063(-64));
                                        var6 = 6;
                                    } else if (var5.method1087(class115.field2757, (byte) -52)) {
                                        class113.field2744 = class113.field2744.method1065((byte) -100, class115.field2757.method1063(-64));
                                        var6 = 7;
                                    } else if (var5.method1087(class30.field732, (byte) -52)) {
                                        var6 = 8;
                                        class113.field2744 = class113.field2744.method1065((byte) -57, class30.field732.method1063(-64));
                                    } else if (var5.method1087(class96.field2338, (byte) -52)) {
                                        var6 = 9;
                                        class113.field2744 = class113.field2744.method1065((byte) -114, class96.field2338.method1063(-64));
                                    } else if (var5.method1087(class5.field120, (byte) -52)) {
                                        class113.field2744 = class113.field2744.method1065((byte) -98, class5.field120.method1063(-64));
                                        var6 = 10;
                                    } else if (var5.method1087(class12.field283, (byte) -52)) {
                                        class113.field2744 = class113.field2744.method1065((byte) -93, class12.field283.method1063(-64));
                                        var6 = 11;
                                    }
                                }
                                class135 var7 = class113.field2744.method1097(-41);
                                byte var8 = 0;
                                if (var7.method1087(class76.field1802, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -42, class76.field1802.method1063(-64));
                                    var8 = 1;
                                } else if (var7.method1087(class79.field1882, (byte) -52)) {
                                    class113.field2744 = class113.field2744.method1065((byte) -93, class79.field1882.method1063(-64));
                                    var8 = 2;
                                } else if (var7.method1087(class80.field1915, (byte) -52)) {
                                    var8 = 3;
                                    class113.field2744 = class113.field2744.method1065((byte) -101, class80.field1915.method1063(-64));
                                } else if (var7.method1087(class58.field1416, (byte) -52)) {
                                    var8 = 4;
                                    class113.field2744 = class113.field2744.method1065((byte) -34, class58.field1416.method1063(-64));
                                } else if (var7.method1087(class28.field672, (byte) -52)) {
                                    var8 = 5;
                                    class113.field2744 = class113.field2744.method1065((byte) -77, class28.field672.method1063(-64));
                                } else if (class111.field2701 != 0) {
                                    if (var7.method1087(class76.field1801, (byte) -52)) {
                                        class113.field2744 = class113.field2744.method1065((byte) -117, class76.field1801.method1063(-64));
                                        var8 = 1;
                                    } else if (var7.method1087(class79.field1871, (byte) -52)) {
                                        var8 = 2;
                                        class113.field2744 = class113.field2744.method1065((byte) -127, class79.field1871.method1063(-64));
                                    } else if (var7.method1087(class80.field1914, (byte) -52)) {
                                        class113.field2744 = class113.field2744.method1065((byte) -116, class80.field1914.method1063(-64));
                                        var8 = 3;
                                    } else if (var7.method1087(class58.field1422, (byte) -52)) {
                                        var8 = 4;
                                        class113.field2744 = class113.field2744.method1065((byte) -99, class58.field1422.method1063(-64));
                                    } else if (var7.method1087(class28.field675, (byte) -52)) {
                                        var8 = 5;
                                        class113.field2744 = class113.field2744.method1065((byte) -91, class28.field675.method1063(-64));
                                    }
                                }
                                class152.field3751.method929(62, -14044);
                                class152.field3751.method452(0, 255);
                                int var9 = class152.field3751.field1485;
                                class152.field3751.method452(var6, 255);
                                class152.field3751.method452(var8, 255);
                                class50.method372(-101, class113.field2744, class152.field3751);
                                class152.field3751.method476(class152.field3751.field1485 - var9, false);
                                if (class79.field1858 == 2) {
                                    class101.field2436++;
                                    class79.field1858 = 3;
                                    class42.field979 = true;
                                    class152.field3751.method929(37, -14044);
                                    class152.field3751.method452(class79.field1858, 255);
                                    class152.field3751.method452(class48.field1135, 255);
                                    class152.field3751.method452(class126.field3014, 255);
                                }
                            }
                            class65.field1634 = true;
                            class113.field2744 = class113.field2742;
                        }
                    }
                }
                return;
            } while (!class56.method430(class32.field750, -124) && class32.field750 != 32);
            if (class113.field2718.method1063(-64) < 12) {
                class113.field2718 = class113.field2718.method1070(class32.field750, 255);
            }
        }
    }
}
