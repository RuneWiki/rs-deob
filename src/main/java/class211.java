import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class211 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field3111 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lpi;")
    public static class201 field3110 = new class201(30);

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field3113 = 0;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static final void method1483(int arg0) {
        field3112++;
        if (class126.field2127 == 0 || class126.field2127 == 5) {
            return;
        }
        try {
            if (++class113.field1878 > 2000) {
                if (class281.field4537 != null) {
                    class281.field4537.method1440(-1);
                    class281.field4537 = null;
                }
                if (class110.field1849 >= 1) {
                    class256.field3878 = -5;
                    class126.field2127 = 0;
                    return;
                }
                class110.field1849++;
                class126.field2127 = 1;
                class113.field1878 = 0;
                if (class268.field4313 == field3114) {
                    class268.field4313 = class293.field4671;
                } else {
                    class268.field4313 = field3114;
                }
            }
            if (class126.field2127 == 1) {
                class81.field1302 = class273.field4426.method936(-120, class268.field4313, class298.field4794);
                class126.field2127 = 2;
            }
            if (arg0 > 72) {
                if (class126.field2127 == 2) {
                    if (class81.field1302.field936 == 2) {
                        throw new IOException();
                    }
                    if (class81.field1302.field936 != 1) {
                        return;
                    }
                    class281.field4537 = new class203((Socket) class81.field1302.field932, class273.field4426);
                    class81.field1302 = null;
                    long var1 = class303.field4898 = class143.method1064((byte) -77, class161.field2491);
                    int var3 = (int) (var1 >> 16 & 0x1FL);
                    class144.field2338.field735 = 0;
                    class144.field2338.method360(14, 25759);
                    class144.field2338.method360(var3, 25759);
                    class281.field4537.method1435(9, 0, class144.field2338.field758, 2);
                    if (class16.field170 != null) {
                        class16.field170.method2011(-1);
                    }
                    if (class113.field1879 != null) {
                        class113.field1879.method2011(-1);
                    }
                    int var4 = class281.field4537.method1441(3755);
                    if (class16.field170 != null) {
                        class16.field170.method2011(-1);
                    }
                    if (class113.field1879 != null) {
                        class113.field1879.method2011(-1);
                    }
                    if (var4 != 0) {
                        class256.field3878 = var4;
                        class126.field2127 = 0;
                        class281.field4537.method1440(-1);
                        class281.field4537 = null;
                        return;
                    }
                    class126.field2127 = 3;
                }
                if (class126.field2127 == 3) {
                    if (class281.field4537.method1434(0) < 8) {
                        return;
                    }
                    class281.field4537.method1443(-41, 0, class92.field1488.field758, 8);
                    class92.field1488.field735 = 0;
                    class300.field4841 = class92.field1488.method371(22726);
                    class144.field2338.field735 = 0;
                    int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class300.field4841 >> 32), (int) class300.field4841 };
                    class144.field2338.method360(10, 25759);
                    class144.field2338.method385(var5[0], 455748840);
                    class144.field2338.method385(var5[1], 455748840);
                    class144.field2338.method385(var5[2], 455748840);
                    class144.field2338.method385(var5[3], 455748840);
                    class144.field2338.method382(902642416, class143.method1064((byte) -105, class161.field2491));
                    class144.field2338.method338(class269.field4325, 1970);
                    class144.field2338.method345(2713, class254.field3832, class283.field4554);
                    class249.field3768.field735 = 0;
                    if (class98.field1677 == 40) {
                        class249.field3768.method360(18, 25759);
                    } else {
                        class249.field3768.method360(16, 25759);
                    }
                    class249.field3768.method376(class144.field2338.field735 + class261.method1792(class220.field3205, -128) + 163, false);
                    class249.field3768.method385(550, 455748840);
                    class249.field3768.method360(class263.field4141, 25759);
                    class249.field3768.method360(class119.field1937 ? 1 : 0, 25759);
                    class249.field3768.method360(0, 25759);
                    class249.field3768.method360(class227.method1570(29), 25759);
                    class249.field3768.method376(class179.field2677, false);
                    class249.field3768.method376(class137.field2230, false);
                    class249.field3768.method360(class146.field2351, 25759);
                    class197.method1393(class249.field3768, 15);
                    class249.field3768.method338(class220.field3205, 1970);
                    class249.field3768.method385(class281.field4525, 455748840);
                    class249.field3768.method385(class234.method1619((byte) -82), 455748840);
                    class145.field2344 = true;
                    class249.field3768.method376(class182.field2727, false);
                    class249.field3768.method385(class142.field2282.method1879(123), 455748840);
                    class249.field3768.method385(class78.field1266.method1879(118), 455748840);
                    class249.field3768.method385(class49.field675.method1879(110), 455748840);
                    class249.field3768.method385(class282.field4546.method1879(114), 455748840);
                    class249.field3768.method385(class222.field3255.method1879(111), 455748840);
                    class249.field3768.method385(class296.field4754.method1879(122), 455748840);
                    class249.field3768.method385(class300.field4850.method1879(123), 455748840);
                    class249.field3768.method385(class193.field2855.method1879(113), 455748840);
                    class249.field3768.method385(class191.field2827.method1879(110), 455748840);
                    class249.field3768.method385(class267.field4278.method1879(109), 455748840);
                    class249.field3768.method385(class269.field4327.method1879(110), 455748840);
                    class249.field3768.method385(class297.field4773.method1879(112), 455748840);
                    class249.field3768.method385(class20.field211.method1879(110), 455748840);
                    class249.field3768.method385(class313.field5017.method1879(127), 455748840);
                    class249.field3768.method385(class228.field3344.method1879(127), 455748840);
                    class249.field3768.method385(class201.field2957.method1879(120), 455748840);
                    class249.field3768.method385(class242.field3566.method1879(123), 455748840);
                    class249.field3768.method385(class121.field2010.method1879(113), 455748840);
                    class249.field3768.method385(class268.field4314.method1879(122), 455748840);
                    class249.field3768.method385(class309.field4980.method1879(127), 455748840);
                    class249.field3768.method385(class37.field472.method1879(108), 455748840);
                    class249.field3768.method385(class240.field3515.method1879(122), 455748840);
                    class249.field3768.method385(class208.field3082.method1879(121), 455748840);
                    class249.field3768.method385(class147.field2361.method1879(109), 455748840);
                    class249.field3768.method385(class312.field5001.method1879(121), 455748840);
                    class249.field3768.method385(class236.field3450.method1879(115), 455748840);
                    class249.field3768.method385(class37.field483.method1879(119), 455748840);
                    class249.field3768.method385(class243.field3578.method1879(110), 455748840);
                    class249.field3768.method385(class112.field1864.method1879(127), 455748840);
                    class249.field3768.method384(class144.field2338.field735, 0, class144.field2338.field758, 23037);
                    class281.field4537.method1435(9, 0, class249.field3768.field758, class249.field3768.field735);
                    class144.field2338.method682((byte) -74, var5);
                    for (int var6 = 0; var6 < 4; var6++) {
                        var5[var6] += 50;
                    }
                    class92.field1488.method682((byte) 103, var5);
                    class126.field2127 = 4;
                }
                if (class126.field2127 == 4) {
                    if (class281.field4537.method1434(0) < 1) {
                        return;
                    }
                    int var7 = class281.field4537.method1441(3755);
                    if (var7 == 21) {
                        class126.field2127 = 7;
                    } else if (var7 == 29) {
                        class126.field2127 = 10;
                    } else if (var7 == 1) {
                        class126.field2127 = 5;
                        class256.field3878 = var7;
                        return;
                    } else if (var7 == 2) {
                        class126.field2127 = 8;
                    } else if (var7 == 15) {
                        class256.field3878 = var7;
                        class126.field2127 = 0;
                        return;
                    } else if (var7 == 23 && class110.field1849 < 1) {
                        class126.field2127 = 1;
                        class113.field1878 = 0;
                        class110.field1849++;
                        class281.field4537.method1440(-1);
                        class281.field4537 = null;
                        return;
                    } else {
                        class256.field3878 = var7;
                        class126.field2127 = 0;
                        class281.field4537.method1440(-1);
                        class281.field4537 = null;
                        return;
                    }
                }
                if (class126.field2127 == 6) {
                    class144.field2338.field735 = 0;
                    class144.field2338.method683(true, 17);
                    class281.field4537.method1435(9, 0, class144.field2338.field758, class144.field2338.field735);
                    class126.field2127 = 4;
                } else if (class126.field2127 == 7) {
                    if (class281.field4537.method1434(0) >= 1) {
                        class222.field3260 = (class281.field4537.method1441(3755) + 3) * 60;
                        class256.field3878 = 21;
                        class126.field2127 = 0;
                        class281.field4537.method1440(-1);
                        class281.field4537 = null;
                    }
                } else if (class126.field2127 != 10) {
                    if (class126.field2127 == 8) {
                        if (class281.field4537.method1434(0) < 14) {
                            return;
                        }
                        class281.field4537.method1443(-127, 0, class92.field1488.field758, 14);
                        class92.field1488.field735 = 0;
                        class228.field3349 = class92.field1488.method366(-16505);
                        class43.field564 = class92.field1488.method366(-16505);
                        class284.field4567 = class92.field1488.method366(-16505) == 1;
                        class291.field4630 = class92.field1488.method366(-16505) == 1;
                        class155.field2416 = class92.field1488.method366(-16505) == 1;
                        class124.field2080 = class92.field1488.method366(-16505) == 1;
                        class196.field2888 = class92.field1488.method366(-16505) == 1;
                        class279.field4498 = class92.field1488.method331(-3);
                        class171.field2585 = class92.field1488.method366(-16505) == 1;
                        class255.field3857 = class92.field1488.method366(-16505) == 1;
                        class141.method1057(class255.field3857, false);
                        class48.method294(-1, class255.field3857);
                        class256.method1759(class255.field3857, -13509);
                        if (!class119.field1937) {
                            if ((!class284.field4567 || class155.field2416) && !class171.field2585) {
                                try {
                                    class150.method1120(class273.field4426.field2020, false, "unzap");
                                } catch (Throwable var10) {
                                }
                            } else {
                                try {
                                    class150.method1120(class273.field4426.field2020, false, "zap");
                                } catch (Throwable var9) {
                                }
                            }
                        }
                        try {
                            class150.method1120(class273.field4426.field2020, false, "loggedin");
                        } catch (Throwable var8) {
                        }
                        class45.field592 = class92.field1488.method681(true);
                        class162.field2510 = class92.field1488.method331(-92);
                        class126.field2127 = 9;
                    }
                    if (class126.field2127 == 9 && class281.field4537.method1434(0) >= class162.field2510) {
                        class92.field1488.field735 = 0;
                        class281.field4537.method1443(94, 0, class92.field1488.field758, class162.field2510);
                        class126.field2127 = 0;
                        class256.field3878 = 2;
                        class263.method1803((byte) -123);
                        class304.field4925 = -1;
                        class226.method1569(false, (byte) 104);
                        class45.field592 = -1;
                    }
                } else if (class281.field4537.method1434(0) >= 1) {
                    class308.field4956 = class281.field4537.method1441(3755);
                    class126.field2127 = 0;
                    class256.field3878 = 29;
                    class281.field4537.method1440(-1);
                    class281.field4537 = null;
                }
            }
        } catch (IOException var11) {
            if (class281.field4537 != null) {
                class281.field4537.method1440(-1);
                class281.field4537 = null;
            }
            if (class110.field1849 >= 1) {
                class256.field3878 = -4;
                class126.field2127 = 0;
            } else {
                class126.field2127 = 1;
                if (class268.field4313 == field3114) {
                    class268.field4313 = class293.field4671;
                } else {
                    class268.field4313 = field3114;
                }
                class113.field1878 = 0;
                class110.field1849++;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1484(int arg0, int arg1, String arg2) {
        field3116++;
        if (arg1 != 99999999) {
            method1484(7, -92, (String) null);
        }
        class57.field841++;
        class144.field2338.method683(true, 215);
        class144.field2338.method382(902642416, class143.method1064((byte) -109, arg2));
        class144.field2338.method383(-122, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lbk;BLlc;Llc;)V")
    public static final void method1485(class153 arg0, byte arg1, class270 arg2, class270 arg3) {
        class253.field3809 = arg3;
        class125.field2119 = arg2;
        class114.field1892 = arg0;
        if (class253.field3809 != null) {
            class237.field3476 = class253.field3809.method1891(1, -18);
        }
        if (class125.field2119 != null) {
            class253.field3820 = class125.field2119.method1891(1, 65);
        }
        field3115++;
        if (arg1 != 122) {
            field3114 = -115;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static void method1486(int arg0) {
        field3110 = null;
        int var1 = -23 / ((-arg0 - 32) / 57);
    }
}
