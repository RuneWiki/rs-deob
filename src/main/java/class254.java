import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class254 {

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "B")
    public byte field3528 = 0;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "S")
    public short field3529;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "B")
    public byte field3517;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "B")
    public byte field3507;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "S")
    public short field3524;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Lvk;")
    public static class56 field3522 = new class56(16);

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public static int field3526 = 0;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "B")
    public byte field3504;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "B")
    public byte field3509;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "B")
    public byte field3511;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "B")
    public byte field3514;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "Ljs;")
    public class147 field3527;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "Lvj;")
    public static class177 field3530;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lgk;")
    public class254 field3503;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lje;")
    public class299 field3502;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Lje;")
    public class299 field3519;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Lvc;")
    public class308 field3525;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Lel;")
    public class328 field3515;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lop;")
    public class352 field3505;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Le;")
    public class97 field3510;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Le;")
    public class97 field3512;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "S")
    public short field3513;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
    public boolean field3501;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Z")
    public boolean field3508;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "Z")
    public boolean field3520;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1550(int arg0) {
        field3530 = null;
        field3522 = null;
        if (arg0 != 0) {
            field3522 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIII)V", line = 15)
    public static final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3523++;
        if (arg5 >= 1 && arg7 >= 1 && arg5 <= (class192.field2574 - 2) && (class364.field5262 - 2) >= arg7) {
            if (!class11.method79((byte) -122) && !class61.method424(arg0, arg7, arg5, (byte) 96, class200.field2661)) {
                return;
            }
            if (class213.field2852 == null) {
                return;
            }
            int var9 = arg0;
            if (arg0 < 3 && class444.method2792(-128, arg5, arg7)) {
                var9 = arg0 + 1;
            }
            class420.method2688(arg5, arg0, class365.field5294[arg0], arg7, class61.field807, arg3, var9, false);
            if (arg4 >= 0) {
                boolean var10 = class42.field584;
                class42.field584 = true;
                class386.method2485(arg4, -22389, arg8, false, arg7, false, arg5, var9, arg2, arg1, class365.field5294[arg0], arg0, class61.field807);
                class42.field584 = var10;
            }
        }
        if (arg6 != -4) {
            field3530 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V", line = 57)
    public class254(int arg0, int arg1, int arg2) {
        this.field3529 = (short) arg2;
        this.field3507 = this.field3517 = (byte) arg0;
        this.field3524 = (short) arg1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIZIII)Z", line = 70)
    public static final boolean method1552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field3500++;
        int var11 = class260.method1797(class379.field5500, arg10, arg3, arg8, arg7, class227.field2988.method168(-112), arg5, arg9, class365.field5294[class227.field2981], class277.field4004, 119, arg0, arg2, arg1, arg4);
        if (~var11 > arg6) {
            return false;
        }
        class59.field792 = class277.field4004[var11 - 1];
        class376.field5470 = class379.field5500[var11 - 1];
        class91.field1284 = false;
        class313.method2124(0);
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZI)V", line = 98)
    public static final void method1553(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method1550(-87);
        }
        field3516++;
        int var4 = class400.field5969 * arg0 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class25.method178(arg3, 0, arg2, var4, false, class151.field2056);
            class7.field123 = true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 125)
    public final void method1554(int arg0) {
        if (arg0 != -10061) {
            method1553(38, -30, true, 83);
        }
        field3518++;
        while (this.field3515 != null) {
            class328 var2 = this.field3515.field4783;
            this.field3515.method2185(1);
            this.field3515 = var2;
        }
        this.field3528 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 167)
    public static final void method1555(int arg0) {
        field3521++;
        if (class188.field2532 == 0 || class188.field2532 == 5) {
            return;
        }
        try {
            if (++class126.field1771 > 2000) {
                if (class191.field2558 != null) {
                    class191.field2558.method1398((byte) 77);
                    class191.field2558 = null;
                }
                if (class362.field5233 >= 1) {
                    class188.field2532 = 0;
                    class102.field1416 = -5;
                    return;
                }
                if (class430.field6322 == class153.field2070) {
                    class153.field2070 = class162.field2171;
                } else {
                    class153.field2070 = class430.field6322;
                }
                class188.field2532 = 1;
                class362.field5233++;
                class126.field1771 = 0;
            }
            if (class188.field2532 == 1) {
                class384.field5557 = class76.field1085.method261(-5159, class153.field2070, class298.field4302);
                class188.field2532 = 2;
            }
            int var1 = -41 / ((-arg0 - 38) / 61);
            if (class188.field2532 == 2) {
                if (class384.field5557.field6308 == 2) {
                    throw new IOException();
                }
                if (class384.field5557.field6308 != 1) {
                    return;
                }
                class191.field2558 = new class233((Socket) class384.field5557.field6309, class76.field1085);
                class384.field5557 = null;
                long var2 = class59.field795 = class126.method802((byte) 122, class34.field475);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class185.field2507.field3029 = 0;
                class185.field2507.method1346(14, 32767);
                class185.field2507.method1346(var4, 32767);
                class191.field2558.method1401(3, 0, 2, class185.field2507.field3040);
                if (class230.field3073 != null) {
                    class230.field3073.method1203(500000);
                }
                if (class281.field4093 != null) {
                    class281.field4093.method1203(500000);
                }
                int var5 = class191.field2558.method1399(-7573);
                if (class230.field3073 != null) {
                    class230.field3073.method1203(500000);
                }
                if (class281.field4093 != null) {
                    class281.field4093.method1203(500000);
                }
                if (var5 != 0) {
                    class188.field2532 = 0;
                    class102.field1416 = var5;
                    class191.field2558.method1398((byte) 73);
                    class191.field2558 = null;
                    return;
                }
                class188.field2532 = 3;
            }
            if (class188.field2532 == 3) {
                if (class191.field2558.method1394(true) < 8) {
                    return;
                }
                class191.field2558.method1397(false, 0, class156.field2120.field3040, 8);
                class156.field2120.field3029 = 0;
                class103.field1419 = class156.field2120.method1332(1466299744);
                int[] var6 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), 0, (int) class103.field1419 };
                class185.field2507.field3029 = 0;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                var6[2] = (int) (class103.field1419 >> 32);
                class185.field2507.method1346(10, 32767);
                class185.field2507.method1330(var6[0], 125);
                class185.field2507.method1330(var6[1], 46);
                class185.field2507.method1330(var6[2], -91);
                class185.field2507.method1330(var6[3], 114);
                class185.field2507.method1372(class126.method802((byte) 101, class34.field475), 1883835216);
                class185.field2507.method1380(65280, class94.field1348);
                class185.field2507.method1331(class194.field2602, class5.field62, true);
                class395.field5831.field3029 = 0;
                if (class70.field932 == 40) {
                    class395.field5831.method1346(18, 32767);
                } else {
                    class395.field5831.method1346(16, 32767);
                }
                class395.field5831.method1326(class185.field2507.field3029 + class125.method795(66, class174.field2328) + 161, 65);
                class395.field5831.method1330(561, -112);
                class395.field5831.method1346(class193.field2585, 32767);
                class395.field5831.method1346(class215.method1266(2), 32767);
                class395.field5831.method1326(class138.field1907, -62);
                class395.field5831.method1326(class92.field1294, 65);
                class395.field5831.method1346(class115.field1611, 32767);
                class394.method2529(0, class395.field5831);
                class395.field5831.method1380(65280, class174.field2328);
                class395.field5831.method1330(class223.field2944, 123);
                class395.field5831.method1330(class237.method1423(-10231), 43);
                class68.field874 = true;
                class395.field5831.method1326(class196.field2624, -114);
                class395.field5831.method1330(class148.field2035.method2280(0), 15);
                class395.field5831.method1330(class71.field1034.method2280(0), -125);
                class395.field5831.method1330(class130.field1798.method2280(0), -97);
                class395.field5831.method1330(class184.field2492.method2280(0), 92);
                class395.field5831.method1330(class309.field4551.method2280(0), -118);
                class395.field5831.method1330(class153.field2066.method2280(0), 29);
                class395.field5831.method1330(class385.field5583.method2280(0), 70);
                class395.field5831.method1330(class246.field3318.method2280(0), 45);
                class395.field5831.method1330(class362.field5227.method2280(0), -122);
                class395.field5831.method1330(class329.field4796.method2280(0), -124);
                class395.field5831.method1330(class1.field10.method2280(0), -88);
                class395.field5831.method1330(class151.field2056.method2280(0), -96);
                class395.field5831.method1330(class21.field280.method2280(0), 55);
                class395.field5831.method1330(class291.field4169.method2280(0), -95);
                class395.field5831.method1330(class448.field6573.method2280(0), 25);
                class395.field5831.method1330(class149.field2040.method2280(0), 41);
                class395.field5831.method1330(class349.field5056.method2280(0), 77);
                class395.field5831.method1330(class169.field2272.method2280(0), -98);
                class395.field5831.method1330(class93.field1339.method2280(0), -99);
                class395.field5831.method1330(class181.field2390.method2280(0), 19);
                class395.field5831.method1330(class393.field5629.method2280(0), 92);
                class395.field5831.method1330(class432.field6348.method2280(0), 77);
                class395.field5831.method1330(class180.field2381.method2280(0), 120);
                class395.field5831.method1330(class28.field417.method2280(0), 109);
                class395.field5831.method1330(class426.field6285.method2280(0), 62);
                class395.field5831.method1330(class273.field3973.method2280(0), -114);
                class395.field5831.method1330(class335.field4836.method2280(0), 104);
                class395.field5831.method1330(class69.field893.method2280(0), -109);
                class395.field5831.method1330(class315.field4604.method2280(0), 48);
                class395.field5831.method1357(0, -1, class185.field2507.field3029, class185.field2507.field3040);
                class191.field2558.method1401(3, 0, class395.field5831.field3029, class395.field5831.field3040);
                class185.field2507.method12(var6, -111);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class156.field2120.method12(var6, -124);
                class188.field2532 = 4;
            }
            if (class188.field2532 == 4) {
                if (class191.field2558.method1394(true) < 1) {
                    return;
                }
                int var8 = class191.field2558.method1399(-7573);
                if (var8 == 21) {
                    class188.field2532 = 7;
                } else if (var8 == 29) {
                    class188.field2532 = 10;
                } else if (var8 == 1) {
                    class102.field1416 = var8;
                    class188.field2532 = 5;
                    return;
                } else if (var8 == 2) {
                    class188.field2532 = 8;
                } else if (var8 == 15) {
                    class102.field1416 = var8;
                    class188.field2532 = 0;
                    return;
                } else if (var8 == 23 && class362.field5233 < 1) {
                    class126.field1771 = 0;
                    class362.field5233++;
                    class188.field2532 = 1;
                    class191.field2558.method1398((byte) 43);
                    class191.field2558 = null;
                    return;
                } else {
                    class102.field1416 = var8;
                    class188.field2532 = 0;
                    class191.field2558.method1398((byte) 126);
                    class191.field2558 = null;
                    return;
                }
            }
            if (class188.field2532 == 6) {
                class185.field2507.field3029 = 0;
                class185.field2507.method5(-6445, 17);
                class191.field2558.method1401(3, 0, class185.field2507.field3029, class185.field2507.field3040);
                class188.field2532 = 4;
            } else if (class188.field2532 == 7) {
                if (class191.field2558.method1394(true) >= 1) {
                    class324.field4751 = (class191.field2558.method1399(-7573) + 3) * 60;
                    class188.field2532 = 0;
                    class102.field1416 = 21;
                    class191.field2558.method1398((byte) -110);
                    class191.field2558 = null;
                }
            } else if (class188.field2532 != 10) {
                if (class188.field2532 == 8) {
                    if (class191.field2558.method1394(true) < 14) {
                        return;
                    }
                    class191.field2558.method1397(false, 0, class156.field2120.field3040, 14);
                    class156.field2120.field3029 = 0;
                    class185.field2510 = class156.field2120.method1348(-112);
                    class181.field2403 = class156.field2120.method1348(-89);
                    class375.field5459 = class156.field2120.method1348(-125) == 1;
                    class69.field898 = class156.field2120.method1348(-118) == 1;
                    class313.field4594 = class156.field2120.method1348(-95) == 1;
                    class234.field3122 = class156.field2120.method1348(-122) == 1;
                    class178.field2347 = class156.field2120.method1348(-113) == 1;
                    class272.field3950 = class156.field2120.method1343(255);
                    class317.field4638 = class156.field2120.method1348(-91) == 1;
                    class390.field5614 = class156.field2120.method1348(-90) == 1;
                    class304.method2067(-80, class390.field5614);
                    class422.method2693(class390.field5614, (byte) -104);
                    class347.method2279(class390.field5614, -23800);
                    if ((!class375.field5459 || class313.field4594) && !class317.field4638) {
                        try {
                            class421.method2690(class76.field1085.field519, "unzap", -27444);
                        } catch (Throwable var10) {
                        }
                    } else {
                        try {
                            class421.method2690(class76.field1085.field519, "zap", -27444);
                        } catch (Throwable var11) {
                        }
                    }
                    if (class61.field803 == 0) {
                        try {
                            class421.method2690(class76.field1085.field519, "loggedin", -27444);
                        } catch (Throwable var9) {
                        }
                    }
                    class145.field1988 = class156.field2120.method6((byte) -25);
                    class300.field4398 = class156.field2120.method1343(255);
                    class188.field2532 = 9;
                }
                if (class188.field2532 == 9 && class191.field2558.method1394(true) >= class300.field4398) {
                    class156.field2120.field3029 = 0;
                    class191.field2558.method1397(false, 0, class156.field2120.field3040, class300.field4398);
                    class188.field2532 = 0;
                    class102.field1416 = 2;
                    class191.method1152((byte) 121);
                    class179.field2373 = -1;
                    class277.method1905(125, false);
                    class145.field1988 = -1;
                }
            } else if (class191.field2558.method1394(true) >= 1) {
                class178.field2362 = class191.field2558.method1399(-7573);
                class188.field2532 = 0;
                class102.field1416 = 29;
                class191.field2558.method1398((byte) 104);
                class191.field2558 = null;
            }
        } catch (IOException var12) {
            if (class191.field2558 != null) {
                class191.field2558.method1398((byte) 90);
                class191.field2558 = null;
            }
            if (class362.field5233 >= 1) {
                class188.field2532 = 0;
                class102.field1416 = -4;
            } else {
                if (class430.field6322 == class153.field2070) {
                    class153.field2070 = class162.field2171;
                } else {
                    class153.field2070 = class430.field6322;
                }
                class188.field2532 = 1;
                class126.field1771 = 0;
                class362.field5233++;
            }
        }
    }
}
