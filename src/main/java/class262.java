import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class262 {

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[Lei;")
    private class175[] field4157;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4151 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4150 = "Please wait...";

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "[[Z")
    public static boolean[][] field4152;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method1716(int arg0) {
        if (arg0 != 8) {
            method1718(59, 124, 56, 68, (class197) null, -47, -106L, 41, -57, 22, -99);
        }
        field4152 = null;
        field4150 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Leb;I)Ljava/lang/String;")
    public static final String method1717(class103 arg0, int arg1) {
        field4155++;
        int var2 = -100 / ((arg1 + 3) / 42);
        if (client.method1511(arg0).method204((byte) -18) == 0) {
            return null;
        } else if (arg0.field1599 == null || arg0.field1599.trim().length() == 0) {
            return class178.field2891 ? "Hidden-use" : null;
        } else {
            return arg0.field1599;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIILli;IJIIII)Z")
    public static final boolean method1718(int arg0, int arg1, int arg2, int arg3, class197 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class258.method1695(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
    public static final void method1719(int arg0, byte arg1) {
        int var2 = 66 % ((arg1 - 17) / 57);
        field4156++;
        class283 var3 = class46.method360(6, -108, arg0);
        var3.method1900(true);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static final void method1720(byte arg0) {
        field4158++;
        if (class274.field4425 == 0 || class274.field4425 == 5) {
            return;
        }
        try {
            if (++class114.field1957 > 2000) {
                if (class149.field2395 != null) {
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                }
                if (class201.field3237 >= 1) {
                    class274.field4425 = 0;
                    class157.field2523 = -5;
                    return;
                }
                class201.field3237++;
                class114.field1957 = 0;
                if (class233.field3697 == class223.field3541) {
                    class223.field3541 = class75.field1027;
                } else {
                    class223.field3541 = class233.field3697;
                }
                class274.field4425 = 1;
            }
            if (class274.field4425 == 1) {
                class270.field4367 = class250.field4006.method1672(-3, class223.field3541, class111.field1920);
                class274.field4425 = 2;
            }
            if (class274.field4425 == 2) {
                if (class270.field4367.field2271 == 2) {
                    throw new IOException();
                }
                if (class270.field4367.field2271 != 1) {
                    return;
                }
                class149.field2395 = new class186((Socket) class270.field4367.field2266, class250.field4006);
                class270.field4367 = null;
                long var1 = class64.field905 = class238.method1570(class227.field3595, (byte) 111);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class83.field1148.field4195 = 0;
                class83.field1148.method1757(14, (byte) 119);
                class83.field1148.method1757(var3, (byte) 114);
                class149.field2395.method1272(2, 0, class83.field1148.field4198, -56);
                if (class226.field3580 != null) {
                    class226.field3580.method735(0);
                }
                if (class147.field2361 != null) {
                    class147.field2361.method735(0);
                }
                int var4 = class149.field2395.method1270(0);
                if (class226.field3580 != null) {
                    class226.field3580.method735(0);
                }
                if (class147.field2361 != null) {
                    class147.field2361.method735(0);
                }
                if (var4 != 0) {
                    class157.field2523 = var4;
                    class274.field4425 = 0;
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                    return;
                }
                class274.field4425 = 3;
            }
            if (class274.field4425 == 3) {
                if (class149.field2395.method1274(29491) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class149.field2395.method1275(8, class166.field2709.field4198, 12267, 0);
                class166.field2709.field4195 = 0;
                class233.field3705 = class166.field2709.method1740((byte) 127);
                class83.field1148.field4195 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class233.field3705 >> 32);
                var5[3] = (int) class233.field3705;
                class83.field1148.method1757(10, (byte) 108);
                class83.field1148.method1789((byte) -38, var5[0]);
                class83.field1148.method1789((byte) -38, var5[1]);
                class83.field1148.method1789((byte) -38, var5[2]);
                class83.field1148.method1789((byte) -38, var5[3]);
                class83.field1148.method1762(class238.method1570(class227.field3595, (byte) 117), (byte) 32);
                class83.field1148.method1770(class11.field157, (byte) 119);
                class83.field1148.method1748(class138.field2278, (byte) 125, class257.field4111);
                class273.field4407.field4195 = 0;
                if (class21.field249 == 40) {
                    class273.field4407.method1757(18, (byte) -69);
                } else {
                    class273.field4407.method1757(16, (byte) -45);
                }
                class273.field4407.method1761(class83.field1148.field4195 + class157.method1060(class236.field3762, -4850) + 163, 4334);
                class273.field4407.method1789((byte) -38, 543);
                class273.field4407.method1757(class86.field1177, (byte) -46);
                class273.field4407.method1757(class238.field3793 ? 1 : 0, (byte) 110);
                class273.field4407.method1757(0, (byte) -28);
                class273.field4407.method1757(class195.method1321(true), (byte) 125);
                class273.field4407.method1761(class107.field1856, 4334);
                class273.field4407.method1761(class97.field1469, 4334);
                class273.field4407.method1757(class108.field1877, (byte) 105);
                class287.method1926((byte) 68, class273.field4407);
                class273.field4407.method1770(class236.field3762, (byte) 108);
                class273.field4407.method1789((byte) -38, class286.field4561);
                class273.field4407.method1789((byte) -38, class70.method550((byte) -110));
                class185.field2968 = true;
                class273.field4407.method1761(class204.field3275, 4334);
                class273.field4407.method1789((byte) -38, class104.field1751.method917((byte) 125));
                class273.field4407.method1789((byte) -38, class115.field1964.method917((byte) 116));
                class273.field4407.method1789((byte) -38, class92.field1313.method917((byte) 124));
                class273.field4407.method1789((byte) -38, class3.field39.method917((byte) 115));
                class273.field4407.method1789((byte) -38, class251.field4021.method917((byte) 125));
                class273.field4407.method1789((byte) -38, class250.field4004.method917((byte) 125));
                class273.field4407.method1789((byte) -38, class198.field3188.method917((byte) 121));
                class273.field4407.method1789((byte) -38, class46.field557.method917((byte) 116));
                class273.field4407.method1789((byte) -38, class169.field2739.method917((byte) 126));
                class273.field4407.method1789((byte) -38, class203.field3258.method917((byte) 127));
                class273.field4407.method1789((byte) -38, class246.field3948.method917((byte) 126));
                class273.field4407.method1789((byte) -38, class263.field4169.method917((byte) 119));
                class273.field4407.method1789((byte) -38, class223.field3543.method917((byte) 123));
                class273.field4407.method1789((byte) -38, class147.field2362.method917((byte) 123));
                class273.field4407.method1789((byte) -38, class269.field4359.method917((byte) 125));
                class273.field4407.method1789((byte) -38, class166.field2714.method917((byte) 119));
                class273.field4407.method1789((byte) -38, class185.field2965.method917((byte) 117));
                class273.field4407.method1789((byte) -38, class96.field1451.method917((byte) 123));
                class273.field4407.method1789((byte) -38, class172.field2769.method917((byte) 118));
                class273.field4407.method1789((byte) -38, class223.field3548.method917((byte) 118));
                class273.field4407.method1789((byte) -38, class244.field3908.method917((byte) 127));
                class273.field4407.method1789((byte) -38, class46.field554.method917((byte) 123));
                class273.field4407.method1789((byte) -38, class279.field4469.method917((byte) 121));
                class273.field4407.method1789((byte) -38, class200.field3219.method917((byte) 119));
                class273.field4407.method1789((byte) -38, class228.field3633.method917((byte) 122));
                class273.field4407.method1789((byte) -38, class191.field3051.method917((byte) 124));
                class273.field4407.method1789((byte) -38, class274.field4419.method917((byte) 124));
                class273.field4407.method1789((byte) -38, class127.field2123.method917((byte) 116));
                class273.field4407.method1789((byte) -38, class272.field4387.method917((byte) 120));
                class273.field4407.method1760(class83.field1148.field4198, class83.field1148.field4195, 21015, 0);
                class149.field2395.method1272(class273.field4407.field4195, 0, class273.field4407.field4198, -74);
                class83.field1148.method1233(var5, 122);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class166.field2709.method1233(var5, 125);
                class274.field4425 = 4;
            }
            if (class274.field4425 == 4) {
                if (class149.field2395.method1274(29491) < 1) {
                    return;
                }
                int var7 = class149.field2395.method1270(0);
                if (var7 == 21) {
                    class274.field4425 = 7;
                } else if (var7 == 29) {
                    class274.field4425 = 10;
                } else if (var7 == 1) {
                    class274.field4425 = 5;
                    class157.field2523 = var7;
                    return;
                } else if (var7 == 2) {
                    class274.field4425 = 8;
                } else if (var7 == 15) {
                    class157.field2523 = var7;
                    class274.field4425 = 0;
                    return;
                } else if (var7 == 23 && class201.field3237 < 1) {
                    class274.field4425 = 1;
                    class114.field1957 = 0;
                    class201.field3237++;
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                    return;
                } else {
                    class157.field2523 = var7;
                    class274.field4425 = 0;
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                    return;
                }
            }
            int var8 = -26 / ((arg0 - 47) / 63);
            if (class274.field4425 == 6) {
                class83.field1148.field4195 = 0;
                class83.field1148.method1238(17, -136478397);
                class149.field2395.method1272(class83.field1148.field4195, 0, class83.field1148.field4198, -88);
                class274.field4425 = 4;
            } else if (class274.field4425 == 7) {
                if (class149.field2395.method1274(29491) >= 1) {
                    class7.field88 = class149.field2395.method1270(0) * 60 + 180;
                    class274.field4425 = 0;
                    class157.field2523 = 21;
                    class149.field2395.method1276(-1);
                    class149.field2395 = null;
                }
            } else if (class274.field4425 != 10) {
                if (class274.field4425 == 8) {
                    if (class149.field2395.method1274(29491) < 14) {
                        return;
                    }
                    class149.field2395.method1275(14, class166.field2709.field4198, 12267, 0);
                    class166.field2709.field4195 = 0;
                    class151.field2420 = class166.field2709.method1779(-109);
                    class110.field1905 = class166.field2709.method1779(-110);
                    class25.field311 = class166.field2709.method1779(-63) == 1;
                    class202.field3246 = class166.field2709.method1779(-87) == 1;
                    class188.field3014 = class166.field2709.method1779(-82) == 1;
                    class124.field2063 = class166.field2709.method1779(-82) == 1;
                    class253.field4051 = class166.field2709.method1779(-72) == 1;
                    class80.field1121 = class166.field2709.method1777(-97);
                    class222.field3539 = class166.field2709.method1779(-76) == 1;
                    class294.field4662 = class166.field2709.method1779(-83) == 1;
                    class162.method1112(47, class294.field4662);
                    class172.method1199(-28, class294.field4662);
                    if (!class238.field3793) {
                        if ((!class25.field311 || class188.field3014) && !class222.field3539) {
                            try {
                                class27.method184((byte) 94, "unzap", class250.field4006.field4090);
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class27.method184((byte) 75, "zap", class250.field4006.field4090);
                            } catch (Throwable var11) {
                            }
                        }
                    }
                    try {
                        class27.method184((byte) 85, "loggedin", class250.field4006.field4090);
                    } catch (Throwable var9) {
                    }
                    class51.field719 = class166.field2709.method1232(-29);
                    class73.field1001 = class166.field2709.method1777(-105);
                    class274.field4425 = 9;
                }
                if (class274.field4425 == 9 && class149.field2395.method1274(29491) >= class73.field1001) {
                    class166.field2709.field4195 = 0;
                    class149.field2395.method1275(class73.field1001, class166.field2709.field4198, 12267, 0);
                    class157.field2523 = 2;
                    class274.field4425 = 0;
                    class130.method899((byte) 118);
                    class263.field4159 = -1;
                    class127.method886(-61, false);
                    class51.field719 = -1;
                }
            } else if (class149.field2395.method1274(29491) >= 1) {
                class200.field3229 = class149.field2395.method1270(0);
                class274.field4425 = 0;
                class157.field2523 = 29;
                class149.field2395.method1276(-1);
                class149.field2395 = null;
            }
        } catch (IOException var12) {
            if (class149.field2395 != null) {
                class149.field2395.method1276(-1);
                class149.field2395 = null;
            }
            if (class201.field3237 < 1) {
                class274.field4425 = 1;
                class201.field3237++;
                if (class233.field3697 == class223.field3541) {
                    class223.field3541 = class75.field1027;
                } else {
                    class223.field3541 = class233.field3697;
                }
                class114.field1957 = 0;
            } else {
                class274.field4425 = 0;
                class157.field2523 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)I")
    public static final int method1721(int arg0) {
        field4153++;
        return arg0 == 21 ? class6.field78 : -121;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
    public class262(int arg0) {
        this.field4157 = new class175[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class175 var3 = this.field4157[var2] = new class175();
            var3.field2812 = var3;
            var3.field2816 = var3;
        }
    }
}
