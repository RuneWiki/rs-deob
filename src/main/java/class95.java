import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class95 {

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lpd;")
    public static class94 field2447 = class28.method249(126, "invback");

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
    public static int[] field2442 = new int[32768];

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field2450 = -1;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2438 = 0;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lpd;")
    public static class94 field2440 = class28.method249(100, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lpd;")
    private static class94 field2439 = class28.method249(107, " has logged in)3");

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lpd;")
    private static class94 field2453 = class28.method249(-84, "scroll:");

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Lpd;")
    public static class94 field2451 = field2439;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lpd;")
    public static class94 field2437 = field2453;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lmb;")
    public static class73 field2445;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lmb;")
    public static class73 field2448;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 9)
    public static void method728(int arg0) {
        field2448 = null;
        field2453 = null;
        if (arg0 != 0) {
            field2440 = null;
        }
        field2445 = null;
        field2451 = null;
        field2447 = null;
        field2437 = null;
        field2440 = null;
        field2439 = null;
        field2442 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 60)
    public static final void method729(boolean arg0) {
        field2441++;
        class64 var1 = class81.field2076;
        synchronized (class81.field2076) {
            class79.field2024 = class120.field3006;
            class94.field2411 = class92.field2364;
            class84.field2121 = class74.field1816;
            if (arg0) {
                method732((byte) -54);
            }
            class86.field2157 = class21.field588;
            class28.field788 = class100.field2533;
            class63.field1526 = class57.field1443;
            class57.field1450 = class33.field923;
            class21.field588 = 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lqe;", line = 91)
    public static final class101 method730(int arg0, int arg1) {
        class101 var2 = (class101) class62.field1507.method1007((long) arg1, (byte) -48);
        field2446++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field1135.method808((byte) 78, 16, arg1);
        class101 var4 = new class101();
        if (var3 != null) {
            var4.method760((byte) 102, new class122(var3));
        }
        if (arg0 <= 19) {
            method730(-102, 91);
        }
        class62.field1507.method1012(50, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILs;)Ltc;", line = 131)
    public static final class116 method731(int arg0, int arg1, int arg2, class111 arg3) {
        if (arg2 != 0) {
            method732((byte) 69);
        }
        field2452++;
        return class43.method321(arg1, arg0, arg3, -12404) ? class74.method553(true) : null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 148)
    public static final void method732(byte arg0) {
        field2449++;
        int var1 = -3 % ((arg0 - 74) / 44);
        while (true) {
            label285: do {
                while (class113.method837(-75)) {
                    if (class103.field2603 != -1 && class19.field506 == class103.field2603) {
                        if (class36.field941 == 85 && class8.field236.method710(-123) > 0) {
                            class8.field236 = class8.field236.method706(class8.field236.method710(-123) - 1, (byte) 116, 0);
                        }
                        continue label285;
                    }
                    if (class79.field1995) {
                        if (class36.field941 == 85 && class8.field226.method710(-123) > 0) {
                            class8.field226 = class8.field226.method706(class8.field226.method710(-123) - 1, (byte) 116, 0);
                            class73.field1781 = true;
                        }
                        if (class72.method531(class111.field2801, (byte) -59) && class8.field226.method710(-123) < 80) {
                            class8.field226 = class8.field226.method691(class111.field2801, -17186);
                            class73.field1781 = true;
                        }
                        if (class36.field941 == 84) {
                            class79.field1995 = false;
                            class73.field1781 = true;
                            if (class90.field2328 == 1) {
                                long var11 = class8.field226.method709((byte) 101);
                                class127.method1006(120, var11);
                            }
                            if (class90.field2328 == 2 && class77.field1963 > 0) {
                                long var13 = class8.field226.method709((byte) 84);
                                class120.method901((byte) -108, var13);
                            }
                            if (class90.field2328 == 3 && class8.field226.method710(-123) > 0) {
                                class85.field2131++;
                                class107.field2670.method326(145, -113);
                                class107.field2670.method916(-2, 0);
                                int var15 = class107.field2670.field3047;
                                class107.field2670.method965(-96, class119.field2975);
                                class90.method671(true, class8.field226, class107.field2670);
                                class107.field2670.method927(false, class107.field2670.field3047 - var15);
                                if (class102.field2569 == 2) {
                                    class2.field54 = true;
                                    class123.field3114++;
                                    class102.field2569 = 1;
                                    class107.field2670.method326(93, -112);
                                    class107.field2670.method916(-2, class97.field2473);
                                    class107.field2670.method916(-2, class102.field2569);
                                    class107.field2670.method916(-2, class2.field58);
                                }
                            }
                            if (class90.field2328 == 4 && class89.field2322 < 100) {
                                long var16 = class8.field226.method709((byte) 93);
                                class86.method635(-24154, var16);
                            }
                            if (class90.field2328 == 5 && class89.field2322 > 0) {
                                long var18 = class8.field226.method709((byte) 83);
                                class128.method1014(var18, (byte) 114);
                            }
                        }
                    } else if (class110.field2741 == 1) {
                        if (class36.field941 == 85 && class8.field232.method710(-123) > 0) {
                            class8.field232 = class8.field232.method706(class8.field232.method710(-123) - 1, (byte) 116, 0);
                            class73.field1781 = true;
                        }
                        if (class82.method608(class111.field2801, false) && class8.field232.method710(-123) < 10) {
                            class8.field232 = class8.field232.method691(class111.field2801, -17186);
                            class73.field1781 = true;
                        }
                        if (class36.field941 == 84) {
                            if (class8.field232.method710(-123) > 0) {
                                class12.field300++;
                                int var2 = 0;
                                if (class8.field232.method698(10)) {
                                    var2 = class8.field232.method713(true);
                                }
                                class107.field2670.method326(44, -125);
                                class107.field2670.method917(var2, true);
                            }
                            class73.field1781 = true;
                            class110.field2741 = 0;
                        }
                    } else if (class110.field2741 == 2) {
                        if (class36.field941 == 85 && class8.field232.method710(-123) > 0) {
                            class8.field232 = class8.field232.method706(class8.field232.method710(-123) - 1, (byte) 116, 0);
                            class73.field1781 = true;
                        }
                        if ((class57.method453(class111.field2801, -128) || class111.field2801 == 32) && class8.field232.method710(-123) < 12) {
                            class8.field232 = class8.field232.method691(class111.field2801, -17186);
                            class73.field1781 = true;
                        }
                        if (class36.field941 == 84) {
                            if (class8.field232.method710(-123) > 0) {
                                class107.field2670.method326(227, -110);
                                class107.field2670.method965(-72, class8.field232.method709((byte) 71));
                                class94.field2378++;
                            }
                            class73.field1781 = true;
                            class110.field2741 = 0;
                        }
                    } else if (class110.field2741 == 3) {
                        if (class36.field941 == 85 && class8.field232.method710(-123) > 0) {
                            class8.field232 = class8.field232.method706(class8.field232.method710(-123) - 1, (byte) 116, 0);
                            class73.field1781 = true;
                        }
                        if (class72.method531(class111.field2801, (byte) -30) && class8.field232.method710(-123) < 40) {
                            class8.field232 = class8.field232.method691(class111.field2801, -17186);
                            class73.field1781 = true;
                        }
                    } else if (class115.field2925 == -1 && class77.field1962 == -1) {
                        if (class36.field941 == 85 && class8.field225.method710(-123) > 0) {
                            class8.field225 = class8.field225.method706(class8.field225.method710(-123) - 1, (byte) 116, 0);
                            class73.field1781 = true;
                        }
                        if (class72.method531(class111.field2801, (byte) -57) && class8.field225.method710(-123) < 80) {
                            class8.field225 = class8.field225.method691(class111.field2801, -17186);
                            class73.field1781 = true;
                        }
                        if (class36.field941 == 84 && class8.field225.method710(-123) > 0) {
                            if (class73.field1784 == 2) {
                                if (class8.field225.method689((byte) 59, class84.field2118)) {
                                    class28.method248(-8455);
                                }
                                if (class8.field225.method689((byte) 59, class27.field740)) {
                                    class28.field813 = true;
                                }
                                if (class8.field225.method689((byte) 59, class46.field1136)) {
                                    class28.field813 = false;
                                }
                                if (class8.field225.method689((byte) 59, class41.field1042)) {
                                    for (int var3 = 0; var3 < 4; var3++) {
                                        for (int var4 = 1; var4 < 103; var4++) {
                                            for (int var5 = 1; var5 < 103; var5++) {
                                                class12.field311[var3].field2269[var4][var5] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class8.field225.method689((byte) 59, class88.field2266) && class122.field3097 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class8.field225.method689((byte) 59, class19.field527)) {
                                    class39.field1014 = true;
                                }
                            }
                            if (class8.field225.method686(-112, class122.field3070)) {
                                class97.field2472++;
                                class107.field2670.method326(211, -107);
                                class107.field2670.method916(-2, class8.field225.method710(-123) - 1);
                                class107.field2670.method922(2, class8.field225.method687(2, -123));
                            } else {
                                class94 var6 = class8.field225.method723((byte) 46);
                                field2444++;
                                byte var7 = 0;
                                byte var8 = 0;
                                if (var6.method686(-105, class74.field1821)) {
                                    class8.field225 = class8.field225.method687(class74.field1821.method710(-123), -123);
                                    var8 = 0;
                                } else if (var6.method686(-101, class76.field1850)) {
                                    class8.field225 = class8.field225.method687(class76.field1850.method710(-123), -123);
                                    var8 = 1;
                                } else if (var6.method686(-108, class72.field1747)) {
                                    class8.field225 = class8.field225.method687(class72.field1747.method710(-123), -123);
                                    var8 = 2;
                                } else if (var6.method686(-108, class121.field3027)) {
                                    class8.field225 = class8.field225.method687(class121.field3027.method710(-123), -123);
                                    var8 = 3;
                                } else if (var6.method686(-126, class46.field1133)) {
                                    class8.field225 = class8.field225.method687(class46.field1133.method710(-123), -123);
                                    var8 = 4;
                                } else if (var6.method686(-108, class103.field2604)) {
                                    var8 = 5;
                                    class8.field225 = class8.field225.method687(class103.field2604.method710(-123), -123);
                                } else if (var6.method686(-101, class10.field271)) {
                                    var8 = 6;
                                    class8.field225 = class8.field225.method687(class10.field271.method710(-123), -123);
                                } else if (var6.method686(-121, class105.field2625)) {
                                    class8.field225 = class8.field225.method687(class105.field2625.method710(-123), -123);
                                    var8 = 7;
                                } else if (var6.method686(-111, class115.field2910)) {
                                    class8.field225 = class8.field225.method687(class115.field2910.method710(-123), -123);
                                    var8 = 8;
                                } else if (var6.method686(-104, class108.field2674)) {
                                    var8 = 9;
                                    class8.field225 = class8.field225.method687(class108.field2674.method710(-123), -123);
                                } else if (var6.method686(-109, class12.field305)) {
                                    var8 = 10;
                                    class8.field225 = class8.field225.method687(class12.field305.method710(-123), -123);
                                } else if (var6.method686(-123, class17.field446)) {
                                    class8.field225 = class8.field225.method687(class17.field446.method710(-123), -123);
                                    var8 = 11;
                                }
                                class94 var9 = class8.field225.method723((byte) 46);
                                if (var9.method686(-101, class76.field1848)) {
                                    class8.field225 = class8.field225.method687(class76.field1848.method710(-123), -123);
                                    var7 = 1;
                                } else if (var9.method686(-124, class30.field862)) {
                                    var7 = 2;
                                    class8.field225 = class8.field225.method687(class30.field862.method710(-123), -123);
                                } else if (var9.method686(-120, class51.field1269)) {
                                    var7 = 3;
                                    class8.field225 = class8.field225.method687(class51.field1269.method710(-123), -123);
                                } else if (var9.method686(-110, field2437)) {
                                    var7 = 4;
                                    class8.field225 = class8.field225.method687(field2437.method710(-123), -123);
                                } else if (var9.method686(-107, class40.field1034)) {
                                    class8.field225 = class8.field225.method687(class40.field1034.method710(-123), -123);
                                    var7 = 5;
                                }
                                class107.field2670.method326(100, -114);
                                class107.field2670.method916(-2, 0);
                                int var10 = class107.field2670.field3047;
                                class107.field2670.method916(-2, var8);
                                class107.field2670.method916(-2, var7);
                                class90.method671(true, class8.field225, class107.field2670);
                                class107.field2670.method927(false, class107.field2670.field3047 - var10);
                                if (class97.field2473 == 2) {
                                    class123.field3114++;
                                    class2.field54 = true;
                                    class97.field2473 = 3;
                                    class107.field2670.method326(93, -126);
                                    class107.field2670.method916(-2, class97.field2473);
                                    class107.field2670.method916(-2, class102.field2569);
                                    class107.field2670.method916(-2, class2.field58);
                                }
                            }
                            class8.field225 = class8.field230;
                            class73.field1781 = true;
                        }
                    }
                }
                return;
            } while (!class57.method453(class111.field2801, -128) && class111.field2801 != 32);
            if (class8.field236.method710(-123) < 12) {
                class8.field236 = class8.field236.method691(class111.field2801, -17186);
            }
        }
    }
}
