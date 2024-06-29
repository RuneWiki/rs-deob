import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class274 {

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[I")
    public static int[] field4380 = new int[256];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    public static int[] field4376 = new int[1000];

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lte;")
    public static class244 field4382;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4383;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4384;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public static int[] field4374;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method1837(byte arg0) {
        field4376 = null;
        field4374 = null;
        field4383 = null;
        field4380 = null;
        int var1 = -39 / ((-arg0 - 58) / 56);
        field4382 = null;
        field4384 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V")
    public static final void method1838(int arg0, boolean arg1) {
        field4379++;
        if (class210.method1477((byte) 107, arg0)) {
            if (!arg1) {
                field4383 = null;
            }
            class280.method1868(class75.field937[arg0], -1, 118);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static final void method1839(byte arg0) {
        field4381++;
        if (class118.field1672 == 0 || class118.field1672 == 5) {
            return;
        }
        try {
            if ((++class89.field1102) > 2000) {
                if (class28.field400 != null) {
                    class28.field400.method1210(arg0 - 106);
                    class28.field400 = null;
                }
                if (class73.field913 >= 1) {
                    class118.field1672 = 0;
                    class50.field650 = -5;
                    return;
                }
                class73.field913++;
                class118.field1672 = 1;
                class89.field1102 = 0;
                if (class20.field253 == class178.field2833) {
                    class178.field2833 = class42.field528;
                } else {
                    class178.field2833 = class20.field253;
                }
            }
            if (class118.field1672 == 1) {
                class108.field1455 = class194.field3107.method269((byte) 68, class178.field2833, class180.field2860);
                class118.field1672 = 2;
            }
            if (class118.field1672 == 2) {
                if (class108.field1455.field3995 == 2) {
                    throw new IOException();
                }
                if (class108.field1455.field3995 != 1) {
                    return;
                }
                class28.field400 = new class175((Socket) class108.field1455.field3992, class194.field3107);
                class108.field1455 = null;
                long var1 = class121.field1729 = class185.method1296((byte) -103, class247.field4080);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class4.field57.field1228 = 0;
                class4.field57.method580((byte) 91, 14);
                class4.field57.method580((byte) 119, var3);
                class28.field400.method1211(2, true, 0, class4.field57.field1218);
                if (class128.field2048 != null) {
                    class128.field2048.method155(arg0 ^ 0x69);
                }
                if (class47.field597 != null) {
                    class47.field597.method155(0);
                }
                int var4 = class28.field400.method1216((byte) 29);
                if (class128.field2048 != null) {
                    class128.field2048.method155(0);
                }
                if (class47.field597 != null) {
                    class47.field597.method155(0);
                }
                if (var4 != 0) {
                    class118.field1672 = 0;
                    class50.field650 = var4;
                    class28.field400.method1210(arg0 ^ 0xFFFFFF96);
                    class28.field400 = null;
                    return;
                }
                class118.field1672 = 3;
            }
            if (class118.field1672 == 3) {
                if (class28.field400.method1217(-118) < 8) {
                    return;
                }
                class28.field400.method1209(67, 8, class96.field1283.field1218, 0);
                int[] var5 = new int[4];
                class96.field1283.field1228 = 0;
                class150.field2345 = class96.field1283.method556(false);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class4.field57.field1228 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class150.field2345;
                var5[2] = (int) (class150.field2345 >> 32);
                class4.field57.method580((byte) 94, 10);
                class4.field57.method574(var5[0], arg0 - 106);
                class4.field57.method574(var5[1], -1);
                class4.field57.method574(var5[2], -1);
                class4.field57.method574(var5[3], -1);
                class4.field57.method590(class185.method1296((byte) -103, class247.field4080), 1027669520);
                class4.field57.method566((byte) -57, class293.field4648);
                class4.field57.method589((byte) 122, class127.field2033, class178.field2823);
                class261.field4223.field1228 = 0;
                if (class250.field4085 == 40) {
                    class261.field4223.method580((byte) 103, 18);
                } else {
                    class261.field4223.method580((byte) 88, 16);
                }
                class261.field4223.method572(true, class4.field57.field1228 + class115.method753(class272.field4343, (byte) 30) + 163);
                class261.field4223.method574(537, arg0 ^ 0xFFFFFF96);
                class261.field4223.method580((byte) 102, class170.field2697);
                class261.field4223.method580((byte) 93, class51.field662 ? 1 : 0);
                class261.field4223.method580((byte) 110, 0);
                class261.field4223.method580((byte) 88, class192.method1326((byte) -89));
                class261.field4223.method572(true, class283.field4517);
                class261.field4223.method572(true, class292.field4640);
                class261.field4223.method580((byte) 75, class22.field294);
                class82.method456(class261.field4223, 0);
                class261.field4223.method566((byte) -86, class272.field4343);
                class261.field4223.method574(class210.field3374, -1);
                class261.field4223.method574(class273.method1834(158), -1);
                class263.field4253 = true;
                class261.field4223.method572(true, class242.field3987);
                class261.field4223.method574(class238.field3935.method939(30162), -1);
                class261.field4223.method574(class101.field1357.method939(30162), -1);
                class261.field4223.method574(class112.field1599.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class14.field182.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class219.field3511.method939(30162), -1);
                class261.field4223.method574(class137.field2191.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class182.field2897.method939(30162), -1);
                class261.field4223.method574(class82.field1010.method939(30162), -1);
                class261.field4223.method574(class147.field2302.method939(30162), -1);
                class261.field4223.method574(class218.field3487.method939(30162), -1);
                class261.field4223.method574(class253.field4117.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class225.field3624.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class210.field3375.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class19.field231.method939(30162), -1);
                class261.field4223.method574(class143.field2259.method939(30162), -1);
                class261.field4223.method574(class50.field652.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class89.field1095.method939(30162), -1);
                class261.field4223.method574(class84.field1047.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class76.field955.method939(30162), -1);
                class261.field4223.method574(class144.field2283.method939(arg0 ^ 0x75BB), arg0 - 106);
                class261.field4223.method574(class84.field1042.method939(30162), -1);
                class261.field4223.method574(class124.field1933.method939(30162), -1);
                class261.field4223.method574(class75.field938.method939(arg0 + 30057), arg0 - 106);
                class261.field4223.method574(class17.field204.method939(30162), -1);
                class261.field4223.method574(class28.field397.method939(arg0 + 30057), -1);
                class261.field4223.method574(class102.field1373.method939(arg0 + 30057), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class56.field724.method939(30162), arg0 ^ 0xFFFFFF96);
                class261.field4223.method574(class80.field997.method939(arg0 + 30057), -1);
                class261.field4223.method574(class294.field4666.method939(30162), -1);
                class261.field4223.method547((byte) -79, class4.field57.field1228, class4.field57.field1218, 0);
                class28.field400.method1211(class261.field4223.field1228, true, 0, class261.field4223.field1218);
                class4.field57.method1918((byte) 49, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class96.field1283.method1918((byte) 49, var5);
                class118.field1672 = 4;
            }
            if (arg0 == 105) {
                if (class118.field1672 == 4) {
                    if (class28.field400.method1217(-121) < 1) {
                        return;
                    }
                    int var7 = class28.field400.method1216((byte) 29);
                    if (var7 == 21) {
                        class118.field1672 = 7;
                    } else if (var7 == 29) {
                        class118.field1672 = 10;
                    } else if (var7 == 1) {
                        class118.field1672 = 5;
                        class50.field650 = var7;
                        return;
                    } else if (var7 == 2) {
                        class118.field1672 = 8;
                    } else if (var7 == 15) {
                        class118.field1672 = 0;
                        class50.field650 = var7;
                        return;
                    } else if (var7 == 23 && class73.field913 < 1) {
                        class118.field1672 = 1;
                        class73.field913++;
                        class89.field1102 = 0;
                        class28.field400.method1210(-1);
                        class28.field400 = null;
                        return;
                    } else {
                        class50.field650 = var7;
                        class118.field1672 = 0;
                        class28.field400.method1210(-1);
                        class28.field400 = null;
                        return;
                    }
                }
                if (class118.field1672 == 6) {
                    class4.field57.field1228 = 0;
                    class4.field57.method1932(false, 17);
                    class28.field400.method1211(class4.field57.field1228, true, 0, class4.field57.field1218);
                    class118.field1672 = 4;
                } else if (class118.field1672 == 7) {
                    if (class28.field400.method1217(-112) >= 1) {
                        class206.field3299 = class28.field400.method1216((byte) 29) * 60 + 180;
                        class50.field650 = 21;
                        class118.field1672 = 0;
                        class28.field400.method1210(arg0 - 106);
                        class28.field400 = null;
                    }
                } else if (class118.field1672 != 10) {
                    if (class118.field1672 == 8) {
                        if (class28.field400.method1217(-121) < 14) {
                            return;
                        }
                        class28.field400.method1209(arg0 ^ 0x44, 14, class96.field1283.field1218, 0);
                        class96.field1283.field1228 = 0;
                        class184.field2944 = class96.field1283.method584(255);
                        class148.field2324 = class96.field1283.method584(arg0 + 150);
                        class54.field692 = class96.field1283.method584(255) == 1;
                        class123.field1777 = class96.field1283.method584(255) == 1;
                        class27.field368 = class96.field1283.method584(255) == 1;
                        class216.field3471 = class96.field1283.method584(arg0 + 150) == 1;
                        class91.field1137 = class96.field1283.method584(255) == 1;
                        class185.field2958 = class96.field1283.method549(255);
                        class224.field3602 = class96.field1283.method584(arg0 + 150) == 1;
                        class181.field2890 = class96.field1283.method584(255) == 1;
                        class3.method16((byte) 91, class181.field2890);
                        class45.method256(class181.field2890, (byte) 98);
                        if (!class51.field662) {
                            if ((!class54.field692 || class27.field368) && !class224.field3602) {
                                try {
                                    class277.method1848(class194.field3107.field609, arg0 ^ 0xA82, "unzap");
                                } catch (Throwable var9) {
                                }
                            } else {
                                try {
                                    class277.method1848(class194.field3107.field609, arg0 ^ 0xA82, "zap");
                                } catch (Throwable var10) {
                                }
                            }
                        }
                        try {
                            class277.method1848(class194.field3107.field609, arg0 + 2690, "loggedin");
                        } catch (Throwable var8) {
                        }
                        class152.field2363 = class96.field1283.method1926(255);
                        class219.field3508 = class96.field1283.method549(arg0 + 150);
                        class118.field1672 = 9;
                    }
                    if (class118.field1672 == 9 && class28.field400.method1217(arg0 - 214) >= class219.field3508) {
                        class96.field1283.field1228 = 0;
                        class28.field400.method1209(arg0 - 29, class219.field3508, class96.field1283.field1218, 0);
                        class118.field1672 = 0;
                        class50.field650 = 2;
                        class202.method1406(11786);
                        class83.field1030 = -1;
                        class186.method1300(true, false);
                        class152.field2363 = -1;
                    }
                } else if (class28.field400.method1217(-125) >= 1) {
                    class70.field869 = class28.field400.method1216((byte) 29);
                    class118.field1672 = 0;
                    class50.field650 = 29;
                    class28.field400.method1210(-1);
                    class28.field400 = null;
                }
            }
        } catch (IOException var11) {
            if (class28.field400 != null) {
                class28.field400.method1210(-1);
                class28.field400 = null;
            }
            if (class73.field913 < 1) {
                class118.field1672 = 1;
                class89.field1102 = 0;
                if (class20.field253 == class178.field2833) {
                    class178.field2833 = class42.field528;
                } else {
                    class178.field2833 = class20.field253;
                }
                class73.field913++;
            } else {
                class50.field650 = -4;
                class118.field1672 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1840(String arg0, int arg1) {
        if (arg1 <= 72) {
            return -34;
        }
        field4377++;
        if (class209.field3336 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class209.field3336.field497; var2++) {
            if (class88.method483(arg0, class5.method32((byte) 62, class209.field3336.field492[var2], " ", "<br>"), 124)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public static final void method1841(byte arg0) {
        class154.field2383 = new class269();
        if (arg0 < 107) {
            field4374 = null;
        }
        field4375++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4378++;
        class269.field4299 = arg5;
        if (arg4 != 25922) {
            return;
        }
        class292.field4634 = arg1;
        class288.field4597 = arg2;
        class67.field849 = arg0;
        class148.field2322 = arg3;
        if (class269.field4299 >= 100) {
            int var6 = class148.field2322 * 128 + 64;
            int var7 = class67.field849 * 128 + 64;
            int var8 = class166.method1148(class244.field4011, var6, var7, (byte) 95) - class288.field4597;
            int var9 = var8 - class252.field4114;
            int var10 = var7 - class36.field465;
            int var11 = var6 - class74.field932;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class242.field3986 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class23.field311 = (int) (-325.949D * Math.atan2((double) var11, (double) var10)) & 0x7FF;
            if (class242.field3986 < 128) {
                class242.field3986 = 128;
            }
            if (class242.field3986 > 383) {
                class242.field3986 = 383;
            }
        }
        class283.field4513 = 2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4380[var0] = var1;
        }
        field4382 = new class244(64);
        field4383 = "wave:";
        field4384 = "Loading world list data";
    }
}
