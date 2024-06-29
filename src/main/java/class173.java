import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class173 implements Runnable {

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lee;")
    private class195 field2534 = new class195();

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public int field2541 = 0;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Z")
    private boolean field2542 = false;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field2544;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "[I")
    public static int[] field2538 = new int[14];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lee;")
    public static class195 field2528 = new class195();

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field2540 = -1;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[I")
    public static int[] field2539 = new int[50];

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Luj;")
    public static class225 field2543 = new class225(5000);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[I")
    public static int[] field2530;

    @OriginalMember(owner = "client!bj", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2542) {
            class195 var1 = this.field2534;
            class88 var2;
            synchronized (this.field2534) {
                var2 = (class88) this.field2534.method1312((byte) -21);
                if (var2 == null) {
                    try {
                        this.field2534.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2541--;
            }
            try {
                if (var2.field1334 == 2) {
                    var2.field1332.method1522((int) var2.field3978, -1, var2.field1333.length, var2.field1333);
                } else if (var2.field1334 == 3) {
                    var2.field1333 = var2.field1332.method1523((int) var2.field3978, false);
                }
            } catch (Exception var7) {
                class121.method860((byte) 69, (String) null, var7);
            }
            var2.field1572 = false;
        }
        field2535++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1149(int arg0) {
        if (arg0 != 99999999) {
            field2538 = null;
        }
        field2543 = null;
        field2539 = null;
        field2530 = null;
        field2528 = null;
        field2538 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZLrg;I)Lbb;")
    public final class88 method1150(boolean arg0, class222 arg1, int arg2) {
        field2536++;
        if (!arg0) {
            return null;
        }
        class88 var4 = new class88();
        var4.field1578 = false;
        var4.field3978 = (long) arg2;
        var4.field1332 = arg1;
        var4.field1334 = 3;
        this.method1154(var4, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public final void method1151(int arg0) {
        field2532++;
        if (arg0 >= -103) {
            return;
        }
        this.field2542 = true;
        class195 var2 = this.field2534;
        synchronized (this.field2534) {
            this.field2534.notifyAll();
        }
        try {
            this.field2544.join();
        } catch (InterruptedException var3) {
        }
        this.field2544 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILrg;I)Lbb;")
    public final class88 method1152(int arg0, class222 arg1, int arg2) {
        field2533++;
        class88 var4 = new class88();
        var4.field1334 = 1;
        class195 var5 = this.field2534;
        synchronized (this.field2534) {
            class88 var6 = (class88) this.field2534.method1318((byte) -105);
            while (true) {
                if (var6 == null) {
                    if (arg2 != -19177) {
                        field2540 = -4;
                    }
                    break;
                }
                if (((long) arg0) == var6.field3978 && var6.field1332 == arg1 && var6.field1334 == 2) {
                    var4.field1572 = false;
                    var4.field1333 = var6.field1333;
                    return var4;
                }
                var6 = (class88) this.field2534.method1317(arg2 + 15509);
            }
        }
        var4.field1333 = arg1.method1523(arg0, false);
        var4.field1572 = false;
        var4.field1578 = true;
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILrg;[B)Lbb;")
    public final class88 method1153(int arg0, int arg1, class222 arg2, byte[] arg3) {
        field2537++;
        class88 var5 = new class88();
        int var6 = -94 % ((arg1 - 5) / 62);
        var5.field1334 = 2;
        var5.field1333 = arg3;
        var5.field1332 = arg2;
        var5.field1578 = false;
        var5.field3978 = (long) arg0;
        this.method1154(var5, (byte) 75);
        return var5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lbb;B)V")
    private final void method1154(class88 arg0, byte arg1) {
        field2529++;
        class195 var3 = this.field2534;
        synchronized (this.field2534) {
            if (arg1 != 75) {
                this.method1153(-60, -101, (class222) null, (byte[]) null);
            }
            this.field2534.method1315((byte) -48, arg0);
            this.field2541++;
            this.field2534.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    public static final void method1155(int arg0) {
        field2527++;
        if (class73.field1190 == 0 || class73.field1190 == 5) {
            return;
        }
        try {
            if (arg0 == 1) {
                if (++class29.field539 > 2000) {
                    if (class22.field369 != null) {
                        class22.field369.method1718(-17492);
                        class22.field369 = null;
                    }
                    if (class167.field2455 >= 1) {
                        class73.field1190 = 0;
                        class147.field2132 = -5;
                        return;
                    }
                    class167.field2455++;
                    if (class223.field3474 == class163.field2374) {
                        class223.field3474 = class178.field2605;
                    } else {
                        class223.field3474 = class163.field2374;
                    }
                    class29.field539 = 0;
                    class73.field1190 = 1;
                }
                if (class73.field1190 == 1) {
                    class106.field1564 = class217.field3338.method187(class147.field2138, class223.field3474, -78);
                    class73.field1190 = 2;
                }
                if (class73.field1190 == 2) {
                    if (class106.field1564.field713 == 2) {
                        throw new IOException();
                    }
                    if (class106.field1564.field713 != 1) {
                        return;
                    }
                    class22.field369 = new class253((Socket) class106.field1564.field709, class217.field3338);
                    class106.field1564 = null;
                    long var1 = class284.field4363 = class37.method286(25077, class184.field2667);
                    class59.field964.field887 = 0;
                    class59.field964.method437(true, 14);
                    int var3 = (int) (var1 >> 16 & 0x1FL);
                    class59.field964.method437(true, var3);
                    class22.field369.method1715(class59.field964.field848, 115, 0, 2);
                    if (class182.field2648 != null) {
                        class182.field2648.method799(false);
                    }
                    if (class258.field3961 != null) {
                        class258.field3961.method799(false);
                    }
                    int var4 = class22.field369.method1726((byte) 126);
                    if (class182.field2648 != null) {
                        class182.field2648.method799(false);
                    }
                    if (class258.field3961 != null) {
                        class258.field3961.method799(false);
                    }
                    if (var4 != 0) {
                        class73.field1190 = 0;
                        class147.field2132 = var4;
                        class22.field369.method1718(-17492);
                        class22.field369 = null;
                        return;
                    }
                    class73.field1190 = 3;
                }
                if (class73.field1190 == 3) {
                    if (class22.field369.method1725(0) < 8) {
                        return;
                    }
                    class22.field369.method1723(8, field2543.field848, 0, (byte) -108);
                    int[] var5 = new int[4];
                    field2543.field887 = 0;
                    class21.field351 = field2543.method429(-1313681368);
                    var5[1] = (int) (Math.random() * 9.9999999E7D);
                    class59.field964.field887 = 0;
                    var5[3] = (int) class21.field351;
                    var5[0] = (int) (Math.random() * 9.9999999E7D);
                    var5[2] = (int) (class21.field351 >> 32);
                    class59.field964.method437(true, 10);
                    class59.field964.method453((byte) 116, var5[0]);
                    class59.field964.method453((byte) 100, var5[1]);
                    class59.field964.method453((byte) 89, var5[2]);
                    class59.field964.method453((byte) 111, var5[3]);
                    class59.field964.method440(class37.method286(arg0 ^ 0x61F4, class184.field2667), -74);
                    class59.field964.method396(class43.field770, false);
                    class59.field964.method415(88, class16.field292, class191.field2894);
                    class76.field1214.field887 = 0;
                    if (class42.field742 == 40) {
                        class76.field1214.method437(true, 18);
                    } else {
                        class76.field1214.method437(true, 16);
                    }
                    class76.field1214.method428(class59.field964.field887 + class69.method550(class4.field58, arg0 ^ 0x4A2B) + 163, (byte) 46);
                    class76.field1214.method453((byte) 97, 540);
                    class76.field1214.method437(true, class201.field3038);
                    class76.field1214.method437(true, class50.field820 ? 1 : 0);
                    class76.field1214.method437(true, 0);
                    class76.field1214.method437(true, class227.method1552(false));
                    class76.field1214.method428(class126.field1854, (byte) 46);
                    class76.field1214.method428(class85.field1311, (byte) 46);
                    class76.field1214.method437(true, client.field715);
                    class168.method1136(class76.field1214, (byte) 56);
                    class76.field1214.method396(class4.field58, false);
                    class76.field1214.method453((byte) 105, class246.field3826);
                    class76.field1214.method453((byte) 97, class194.method1307(2222));
                    class107.field1574 = true;
                    class76.field1214.method428(class157.field2305, (byte) 46);
                    class76.field1214.method453((byte) 93, class215.field3301.method1616(false));
                    class76.field1214.method453((byte) 93, class81.field1266.method1616(false));
                    class76.field1214.method453((byte) 108, class37.field650.method1616(false));
                    class76.field1214.method453((byte) 113, class239.field3694.method1616(false));
                    class76.field1214.method453((byte) 105, class211.field3161.method1616(false));
                    class76.field1214.method453((byte) 102, class210.field3143.method1616(false));
                    class76.field1214.method453((byte) 110, class220.field3404.method1616(false));
                    class76.field1214.method453((byte) 112, class287.field4392.method1616(false));
                    class76.field1214.method453((byte) 91, class36.field637.method1616(false));
                    class76.field1214.method453((byte) 94, class152.field2221.method1616(false));
                    class76.field1214.method453((byte) 99, class259.field3966.method1616(false));
                    class76.field1214.method453((byte) 109, class100.field1465.method1616(false));
                    class76.field1214.method453((byte) 112, class124.field1841.method1616(false));
                    class76.field1214.method453((byte) 125, class58.field962.method1616(false));
                    class76.field1214.method453((byte) 101, class60.field984.method1616(false));
                    class76.field1214.method453((byte) 98, class146.field2121.method1616(false));
                    class76.field1214.method453((byte) 92, class181.field2640.method1616(false));
                    class76.field1214.method453((byte) 98, class185.field2706.method1616(false));
                    class76.field1214.method453((byte) 99, class259.field3976.method1616(false));
                    class76.field1214.method453((byte) 101, class136.field1986.method1616(false));
                    class76.field1214.method453((byte) 97, class171.field2510.method1616(false));
                    class76.field1214.method453((byte) 103, class211.field3181.method1616(false));
                    class76.field1214.method453((byte) 103, class120.field1793.method1616(false));
                    class76.field1214.method453((byte) 109, class34.field603.method1616(false));
                    class76.field1214.method453((byte) 107, class247.field3847.method1616(false));
                    class76.field1214.method453((byte) 99, class43.field769.method1616(false));
                    class76.field1214.method453((byte) 124, class202.field3047.method1616(false));
                    class76.field1214.method453((byte) 93, class176.field2587.method1616(false));
                    class76.field1214.method453((byte) 91, class196.field2956.method1616(false));
                    class76.field1214.method433(0, class59.field964.field887, -93, class59.field964.field848);
                    class22.field369.method1715(class76.field1214.field848, 110, 0, class76.field1214.field887);
                    class59.field964.method1535(0, var5);
                    for (int var6 = 0; var6 < 4; var6++) {
                        var5[var6] += 50;
                    }
                    field2543.method1535(0, var5);
                    class73.field1190 = 4;
                }
                if (class73.field1190 == 4) {
                    if (class22.field369.method1725(0) < 1) {
                        return;
                    }
                    int var7 = class22.field369.method1726((byte) 126);
                    if (var7 == 21) {
                        class73.field1190 = 7;
                    } else if (var7 == 29) {
                        class73.field1190 = 10;
                    } else if (var7 == 1) {
                        class147.field2132 = var7;
                        class73.field1190 = 5;
                        return;
                    } else if (var7 == 2) {
                        class73.field1190 = 8;
                    } else if (var7 == 15) {
                        class73.field1190 = 0;
                        class147.field2132 = var7;
                        return;
                    } else if (var7 == 23 && class167.field2455 < 1) {
                        class167.field2455++;
                        class73.field1190 = 1;
                        class29.field539 = 0;
                        class22.field369.method1718(-17492);
                        class22.field369 = null;
                        return;
                    } else {
                        class73.field1190 = 0;
                        class147.field2132 = var7;
                        class22.field369.method1718(arg0 ^ 0xFFFFBBAD);
                        class22.field369 = null;
                        return;
                    }
                }
                if (class73.field1190 == 6) {
                    class59.field964.field887 = 0;
                    class59.field964.method1540(17, (byte) -2);
                    class22.field369.method1715(class59.field964.field848, arg0 + 104, 0, class59.field964.field887);
                    class73.field1190 = 4;
                } else if (class73.field1190 == 7) {
                    if (class22.field369.method1725(arg0 ^ 0x1) >= 1) {
                        class39.field693 = (class22.field369.method1726((byte) 127) + 3) * 60;
                        class73.field1190 = 0;
                        class147.field2132 = 21;
                        class22.field369.method1718(-17492);
                        class22.field369 = null;
                    }
                } else if (class73.field1190 != 10) {
                    if (class73.field1190 == 8) {
                        if (class22.field369.method1725(0) < 14) {
                            return;
                        }
                        class22.field369.method1723(14, field2543.field848, 0, (byte) -127);
                        field2543.field887 = 0;
                        class149.field2165 = field2543.method407(255);
                        class175.field2570 = field2543.method407(arg0 ^ 0xFE);
                        class180.field2623 = field2543.method407(255) == 1;
                        class275.field4238 = field2543.method407(arg0 + 254) == 1;
                        class250.field3878 = field2543.method407(255) == 1;
                        class199.field2991 = field2543.method407(255) == 1;
                        class34.field620 = field2543.method407(255) == 1;
                        class138.field1996 = field2543.method423(-103);
                        class29.field536 = field2543.method407(arg0 ^ 0xFE) == 1;
                        class244.field3781 = field2543.method407(arg0 + 254) == 1;
                        class196.method1322(false, class244.field3781);
                        class212.method1421(class244.field3781, 126);
                        if (!class50.field820) {
                            if ((!class180.field2623 || class250.field3878) && !class29.field536) {
                                try {
                                    class238.method1634("unzap", (byte) -67, class217.field3338.field505);
                                } catch (Throwable var10) {
                                }
                            } else {
                                try {
                                    class238.method1634("zap", (byte) -64, class217.field3338.field505);
                                } catch (Throwable var9) {
                                }
                            }
                        }
                        try {
                            class238.method1634("loggedin", (byte) -108, class217.field3338.field505);
                        } catch (Throwable var8) {
                        }
                        class199.field3000 = field2543.method1539(255);
                        class45.field784 = field2543.method423(-126);
                        class73.field1190 = 9;
                    }
                    if (class73.field1190 == 9 && class22.field369.method1725(arg0 - 1) >= class45.field784) {
                        field2543.field887 = 0;
                        class22.field369.method1723(class45.field784, field2543.field848, 0, (byte) -103);
                        class147.field2132 = 2;
                        class73.field1190 = 0;
                        class55.method463(-119);
                        class121.field1806 = -1;
                        class216.method1451((byte) 44, false);
                        class199.field3000 = -1;
                    }
                } else if (class22.field369.method1725(0) >= 1) {
                    class152.field2225 = class22.field369.method1726((byte) 127);
                    class73.field1190 = 0;
                    class147.field2132 = 29;
                    class22.field369.method1718(arg0 - 17493);
                    class22.field369 = null;
                }
            }
        } catch (IOException var11) {
            if (class22.field369 != null) {
                class22.field369.method1718(-17492);
                class22.field369 = null;
            }
            if (class167.field2455 < 1) {
                class167.field2455++;
                class73.field1190 = 1;
                if (class223.field3474 == class163.field2374) {
                    class223.field3474 = class178.field2605;
                } else {
                    class223.field3474 = class163.field2374;
                }
                class29.field539 = 0;
            } else {
                class73.field1190 = 0;
                class147.field2132 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lbg;III)V")
    public static final void method1156(class264 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class117.field1761) {
            class201 var4 = class3.field40[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3033 != null && var4.field3033.field533.method1494()) {
                arg0.method1492(var4.field3033.field533, 128, 0, 0, true);
            }
        }
        if (arg3 < class117.field1761) {
            class201 var5 = class3.field40[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3033 != null && var5.field3033.field533.method1494()) {
                arg0.method1492(var5.field3033.field533, 0, 0, 128, true);
            }
        }
        if (arg2 < class117.field1761 && arg3 < class137.field1992) {
            class201 var6 = class3.field40[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3033 != null && var6.field3033.field533.method1494()) {
                arg0.method1492(var6.field3033.field533, 128, 0, 128, true);
            }
        }
        if (arg2 < class117.field1761 && arg3 > 0) {
            class201 var7 = class3.field40[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3033 != null && var7.field3033.field533.method1494()) {
                arg0.method1492(var7.field3033.field533, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class173() {
        class40 var1 = class217.field3338.method181(this, 5, (byte) 83);
        while (var1.field713 == 0) {
            client.method323(10L, -127);
        }
        if (var1.field713 == 2) {
            throw new RuntimeException();
        }
        this.field2544 = (Thread) var1.field709;
    }
}
