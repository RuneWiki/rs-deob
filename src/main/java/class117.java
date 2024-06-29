import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class117 {

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    private int field2484;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    private int field2498;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private int field2494;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    private int field2474;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[[I")
    public int[][] field2479;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lec;")
    public static class28 field2476 = class28.method210(-46, "null");

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lec;")
    private static class28 field2483 = class28.method210(-46, "cyan:");

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lec;")
    private static class28 field2489 = class28.method210(-46, "wave2:");

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Z")
    public static volatile boolean field2492 = true;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
    public static int[] field2485 = new int[4000];

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lec;")
    private static class28 field2482 = class28.method210(-46, "::hiddenbuttontest");

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "[Lec;")
    public static class28[] field2500 = new class28[100];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lbb;")
    public static class9 field2491;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Ljava/awt/Graphics;")
    public static Graphics field2493;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "[[[B")
    public static byte[][][] field2496;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[[[I")
    public static int[][][] field2472;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
    private final void method830(int arg0, int arg1, int arg2, int arg3) {
        this.field2479[arg2][arg3] = method840(this.field2479[arg2][arg3], arg1);
        field2471++;
        if (arg0 != 0) {
            method836(86);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIIIII)V")
    public final void method831(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 18691) {
            return;
        }
        int var8 = arg0 - this.field2498;
        int var9 = arg6 - this.field2494;
        field2481++;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg5;
            arg5 = arg4;
            arg4 = var10;
        }
        int var11 = 256;
        if (arg1) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < var8 + arg5; var12++) {
            if (var12 >= 0 && var12 < this.field2474) {
                for (int var13 = var9; var13 < arg4 + var9; var13++) {
                    if (var13 >= 0 && this.field2484 > var13) {
                        this.method830(0, var11, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
    public final void method832(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field2498;
        int var5 = arg1 - this.field2494;
        if (arg2 != -53) {
            this.method838(14, 10, 104, 89, -14, -110, 15);
        }
        field2473++;
        this.field2479[var4][var5] = class106.method732(this.field2479[var4][var5], 14680063);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method833(int arg0) {
        field2493 = null;
        field2500 = null;
        field2482 = null;
        field2485 = null;
        field2483 = null;
        field2496 = null;
        field2472 = null;
        field2491 = null;
        field2489 = null;
        field2476 = null;
        if (arg0 != 0) {
            method839(32);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method834(int arg0) {
        if (arg0 != -13111) {
            field2476 = null;
        }
        while (class56.field1282.method155((byte) 41, class76.field1692) >= 11) {
            int var1 = class56.field1282.method159(0, 11);
            if (var1 == 2047) {
                break;
            }
            if (class129.field2779[var1] == null) {
                class129.field2779[var1] = new class43();
                if (class78.field1807[var1] != null) {
                    class129.field2779[var1].method345(0, class78.field1807[var1]);
                }
            }
            class4.field66[class74.field1641++] = var1;
            class43 var2 = class129.field2779[var1];
            var2.field1458 = class83.field1888;
            int var3 = class56.field1282.method159(0, 5);
            if (var3 > 15) {
                var3 -= 32;
            }
            int var4 = class56.field1282.method159(0, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class56.field1282.method159(0, 1);
            if (var5 == 1) {
                class25.field557[class16.field306++] = var1;
            }
            int var6 = class56.field1282.method159(0, 1);
            var2.method519(64, var6 == 1, class37.field848.field1466[0] + var3, class37.field848.field1487[0] - -var4);
        }
        field2486++;
        class56.field1282.method163((byte) 87);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public final void method835(int arg0) {
        field2503++;
        for (int var2 = 0; var2 < this.field2474; var2++) {
            for (int var3 = 0; var3 < this.field2484; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2474 - 1 == var2 || this.field2484 - 1 == var3) {
                    this.field2479[var2][var3] = 16777215;
                } else {
                    this.field2479[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 >= -50) {
            this.method835(17);
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public static final void method836(int arg0) {
        field2478++;
        if (arg0 <= 3) {
            return;
        }
        class94.field2069++;
        class5.field85.method161((byte) 87, 255);
        if (class57.field1307 != -1) {
            class14.method79(156, class57.field1307);
            class112.field2422 = true;
            class30.field646 = true;
            class57.field1307 = -1;
            class36.field794 = false;
        }
        if (class110.field2325 != -1) {
            class14.method79(156, class110.field2325);
            class110.field2325 = -1;
            class36.field794 = false;
            class95.field2092 = true;
        }
        if (class37.field854 != -1) {
            class14.method79(156, class37.field854);
            class37.field854 = -1;
            class74.method574(0, 30);
        }
        if (class2.field19 != -1) {
            class14.method79(156, class2.field19);
            class2.field19 = -1;
        }
        if (class40.field860 != -1) {
            class14.method79(156, class40.field860);
            class40.field860 = -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIBIII)Z")
    public final boolean method837(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2502++;
        if (arg5 == arg6 && arg1 == arg2) {
            return true;
        }
        int var8 = arg2 - this.field2494;
        if (arg3 > -85) {
            this.field2484 = -93;
        }
        int var9 = arg1 - this.field2494;
        int var10 = arg6 - this.field2498;
        int var11 = arg5 - this.field2498;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2479[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2479[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2479[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2479[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2479[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2479[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2479[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2479[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field2479[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field2479[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field2479[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field2479[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2501++;
        if (arg3 == arg5 && arg1 == arg2) {
            return true;
        }
        int var8 = arg5 - this.field2498;
        int var9 = arg3 - this.field2498;
        int var10 = arg1 - this.field2494;
        int var11 = arg2 - this.field2494;
        if (arg0 == arg4) {
            if (arg6 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2479[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2479[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2479[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2479[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2479[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2479[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2479[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2479[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field2479[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field2479[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field2479[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static final void method839(int arg0) {
        if (arg0 != 17498112) {
            return;
        }
        field2490++;
        while (true) {
            label289: do {
                while (class7.method40(arg0 ^ 0x10B1211)) {
                    if (class40.field860 != -1 && class57.field1311 == class40.field860) {
                        if (field2497 == 85 && class125.field2719.method214(-126) > 0) {
                            class125.field2719 = class125.field2719.method228(class125.field2719.method214(-38) - 1, true, 0);
                        }
                        continue label289;
                    }
                    if (class114.field2439) {
                        if (field2497 == 85 && class125.field2708.method214(127) > 0) {
                            class125.field2708 = class125.field2708.method228(class125.field2708.method214(120) - 1, true, 0);
                            class95.field2092 = true;
                        }
                        if (class110.method752(class78.field1820, false) && class125.field2708.method214(-33) < 80) {
                            class125.field2708 = class125.field2708.method236(class78.field1820, arg0 - 17498074);
                            class95.field2092 = true;
                        }
                        if (field2497 == 84) {
                            class95.field2092 = true;
                            class114.field2439 = false;
                            if (class76.field1714 == 1) {
                                long var10 = class125.field2708.method237(arg0 - 17497872);
                                class69.method540(-12942, var10);
                            }
                            if (class76.field1714 == 2 && class36.field829 > 0) {
                                long var12 = class125.field2708.method237(240);
                                class88.method653(var12, (byte) -66);
                            }
                            if (class76.field1714 == 3 && class125.field2708.method214(113) > 0) {
                                class5.field85.method161((byte) 107, 22);
                                class5.field85.method888(0, 81);
                                class45.field965++;
                                int var14 = class5.field85.field2554;
                                class5.field85.method854(false, class32.field686);
                                class92.method672(class125.field2708, class5.field85, 0);
                                class5.field85.method887((byte) -115, class5.field85.field2554 - var14);
                                if (class126.field2735 == 2) {
                                    class51.field1196 = true;
                                    class126.field2735 = 1;
                                    class5.field85.method161((byte) 124, 132);
                                    class5.field85.method888(class16.field317, 101);
                                    class13.field240++;
                                    class5.field85.method888(class126.field2735, arg0 ^ 0xFEF4FF9E);
                                    class5.field85.method888(class112.field2418, -85);
                                }
                            }
                            if (class76.field1714 == 4 && class69.field1546 < 100) {
                                long var15 = class125.field2708.method237(240);
                                class18.method105(arg0 ^ 0x10B007F, var15);
                            }
                            if (class76.field1714 == 5 && class69.field1546 > 0) {
                                long var17 = class125.field2708.method237(240);
                                class27.method195((byte) -107, var17);
                            }
                        }
                    } else if (class23.field515 == 1) {
                        if (field2497 == 85 && class125.field2714.method214(-100) > 0) {
                            class125.field2714 = class125.field2714.method228(class125.field2714.method214(-60) - 1, true, 0);
                            class95.field2092 = true;
                        }
                        if (class119.method865(false, class78.field1820) && class125.field2714.method214(arg0 ^ 0x10B0075) < 10) {
                            class125.field2714 = class125.field2714.method236(class78.field1820, arg0 ^ 0x10B0047);
                            class95.field2092 = true;
                        }
                        if (field2497 == 84) {
                            if (class125.field2714.method214(arg0 - 17498192) > 0) {
                                class62.field1391++;
                                int var1 = 0;
                                if (class125.field2714.method229(arg0 ^ 0x10B000A)) {
                                    var1 = class125.field2714.method233((byte) 118);
                                }
                                class5.field85.method161((byte) 106, 122);
                                class5.field85.method898(var1, -1202576);
                            }
                            class23.field515 = 0;
                            class95.field2092 = true;
                        }
                    } else if (class23.field515 == 2) {
                        if (field2497 == 85 && class125.field2714.method214(123) > 0) {
                            class125.field2714 = class125.field2714.method228(class125.field2714.method214(-110) - 1, true, 0);
                            class95.field2092 = true;
                        }
                        if ((class127.method970(class78.field1820, arg0 - 17498210) || class78.field1820 == 32) && class125.field2714.method214(117) < 12) {
                            class125.field2714 = class125.field2714.method236(class78.field1820, 51);
                            class95.field2092 = true;
                        }
                        if (field2497 == 84) {
                            if (class125.field2714.method214(arg0 ^ 0xFEF4FF88) > 0) {
                                class88.field1962++;
                                class5.field85.method161((byte) 101, 51);
                                class5.field85.method854(false, class125.field2714.method237(240));
                            }
                            class23.field515 = 0;
                            class95.field2092 = true;
                        }
                    } else if (class23.field515 == 3) {
                        if (field2497 == 85 && class125.field2714.method214(116) > 0) {
                            class125.field2714 = class125.field2714.method228(class125.field2714.method214(arg0 - 17498235) - 1, true, 0);
                            class95.field2092 = true;
                        }
                        if (class110.method752(class78.field1820, false) && class125.field2714.method214(-75) < 40) {
                            class125.field2714 = class125.field2714.method236(class78.field1820, 20);
                            class95.field2092 = true;
                        }
                    } else if (class110.field2325 == -1 && class37.field854 == -1) {
                        if (field2497 == 85 && class125.field2711.method214(-64) > 0) {
                            class125.field2711 = class125.field2711.method228(class125.field2711.method214(arg0 ^ 0x10B0079) - 1, true, 0);
                            class95.field2092 = true;
                        }
                        if (class110.method752(class78.field1820, false) && class125.field2711.method214(-29) < 80) {
                            class125.field2711 = class125.field2711.method236(class78.field1820, 53);
                            class95.field2092 = true;
                        }
                        if (field2497 == 84 && class125.field2711.method214(113) > 0) {
                            if (class32.field691 == 2) {
                                if (class125.field2711.method219(arg0 ^ 0x10B003A, class13.field246)) {
                                    class64.method514(arg0 ^ 0xFEF4A500);
                                }
                                if (class125.field2711.method219(85, class8.field144)) {
                                    class15.field296 = true;
                                }
                                if (class125.field2711.method219(53, class91.field1999)) {
                                    class15.field296 = false;
                                }
                                if (class125.field2711.method219(86, class93.field2060)) {
                                    for (int var2 = 0; var2 < 4; var2++) {
                                        for (int var3 = 1; var3 < 103; var3++) {
                                            for (int var4 = 1; var4 < 103; var4++) {
                                                class43.field922[var2].field2479[var3][var4] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class125.field2711.method219(45, class114.field2436) && class7.field115 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class125.field2711.method219(50, field2482)) {
                                    class109.field2290 = true;
                                }
                            }
                            if (class125.field2711.method208(class95.field2103, false)) {
                                class28.field611++;
                                class5.field85.method161((byte) 84, 92);
                                class5.field85.method888(class125.field2711.method214(arg0 ^ 0xFEF4FFCA) - 1, 65);
                                class5.field85.method867((byte) 112, class125.field2711.method218(2, false));
                            } else {
                                class47.field1097++;
                                byte var5 = 0;
                                class28 var6 = class125.field2711.method234((byte) -89);
                                if (var6.method208(class90.field1985, false)) {
                                    class125.field2711 = class125.field2711.method218(7, false);
                                    var5 = 0;
                                } else if (var6.method208(class110.field2323, false)) {
                                    class125.field2711 = class125.field2711.method218(4, false);
                                    var5 = 1;
                                } else if (var6.method208(class16.field309, false)) {
                                    class125.field2711 = class125.field2711.method218(6, false);
                                    var5 = 2;
                                } else if (var6.method208(field2483, false)) {
                                    class125.field2711 = class125.field2711.method218(5, false);
                                    var5 = 3;
                                } else if (var6.method208(class105.field2216, false)) {
                                    var5 = 4;
                                    class125.field2711 = class125.field2711.method218(7, false);
                                } else if (var6.method208(class51.field1193, false)) {
                                    var5 = 5;
                                    class125.field2711 = class125.field2711.method218(6, false);
                                } else if (var6.method208(class22.field511, false)) {
                                    var5 = 6;
                                    class125.field2711 = class125.field2711.method218(7, false);
                                } else if (var6.method208(class9.field168, false)) {
                                    class125.field2711 = class125.field2711.method218(7, false);
                                    var5 = 7;
                                } else if (var6.method208(class91.field2007, false)) {
                                    var5 = 8;
                                    class125.field2711 = class125.field2711.method218(7, false);
                                } else if (var6.method208(class123.field2684, false)) {
                                    class125.field2711 = class125.field2711.method218(6, false);
                                    var5 = 9;
                                } else if (var6.method208(class78.field1811, false)) {
                                    var5 = 10;
                                    class125.field2711 = class125.field2711.method218(6, false);
                                } else if (var6.method208(class78.field1812, false)) {
                                    var5 = 11;
                                    class125.field2711 = class125.field2711.method218(6, false);
                                }
                                class28 var7 = class125.field2711.method234((byte) 1);
                                byte var8 = 0;
                                if (var7.method208(class49.field1141, false)) {
                                    class125.field2711 = class125.field2711.method218(5, false);
                                    var8 = 1;
                                } else if (var7.method208(field2489, false)) {
                                    var8 = 2;
                                    class125.field2711 = class125.field2711.method218(6, false);
                                } else if (var7.method208(class109.field2298, false)) {
                                    class125.field2711 = class125.field2711.method218(6, false);
                                    var8 = 3;
                                } else if (var7.method208(class68.field1527, false)) {
                                    var8 = 4;
                                    class125.field2711 = class125.field2711.method218(7, false);
                                } else if (var7.method208(class124.field2702, false)) {
                                    class125.field2711 = class125.field2711.method218(6, false);
                                    var8 = 5;
                                }
                                class5.field85.method161((byte) 123, 40);
                                class5.field85.method888(0, arg0 - 17498217);
                                int var9 = class5.field85.field2554;
                                class5.field85.method888(var5, 123);
                                class5.field85.method888(var8, -108);
                                class92.method672(class125.field2711, class5.field85, 0);
                                class5.field85.method887((byte) -39, class5.field85.field2554 - var9);
                                if (class16.field317 == 2) {
                                    class51.field1196 = true;
                                    class13.field240++;
                                    class16.field317 = 3;
                                    class5.field85.method161((byte) 120, 132);
                                    class5.field85.method888(class16.field317, -123);
                                    class5.field85.method888(class126.field2735, 63);
                                    class5.field85.method888(class112.field2418, arg0 - 17498003);
                                }
                            }
                            class95.field2092 = true;
                            class125.field2711 = class125.field2721;
                        }
                    }
                }
                return;
            } while (!class127.method970(class78.field1820, -98) && class78.field1820 != 32);
            if (class125.field2719.method214(-96) < 12) {
                class125.field2719 = class125.field2719.method236(class78.field1820, 26);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    public static int method840(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIIII)V")
    public final void method841(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field2498;
        int var8 = arg2 - this.field2494;
        field2488++;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method830(0, 128, var7, var8);
                this.method830(0, 8, var7 - 1, var8);
            }
            if (arg3 == 1) {
                this.method830(0, 2, var7, var8);
                this.method830(0, 32, var7, var8 + 1);
            }
            if (arg3 == 2) {
                this.method830(arg0 - 19398920, 8, var7, var8);
                this.method830(0, 128, var7 + 1, var8);
            }
            if (arg3 == 3) {
                this.method830(0, 32, var7, var8);
                this.method830(0, 2, var7, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method830(0, 1, var7, var8);
                this.method830(0, 16, var7 - 1, var8 - -1);
            }
            if (arg3 == 1) {
                this.method830(0, 4, var7, var8);
                this.method830(arg0 - 19398920, 64, var7 + 1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method830(0, 16, var7, var8);
                this.method830(0, 1, var7 + 1, var8 + -1);
            }
            if (arg3 == 3) {
                this.method830(0, 64, var7, var8);
                this.method830(0, 4, var7 - 1, var8 + -1);
            }
        }
        if (arg0 != 19398920) {
            this.method831(84, true, 0, 86, 99, -105, -35);
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method830(0, 130, var7, var8);
                this.method830(0, 8, var7 - 1, var8);
                this.method830(0, 32, var7, var8 + 1);
            }
            if (arg3 == 1) {
                this.method830(arg0 - 19398920, 10, var7, var8);
                this.method830(0, 32, var7, var8 + 1);
                this.method830(arg0 - 19398920, 128, var7 + 1, var8);
            }
            if (arg3 == 2) {
                this.method830(0, 40, var7, var8);
                this.method830(0, 128, var7 + 1, var8);
                this.method830(arg0 - 19398920, 2, var7, var8 - 1);
            }
            if (arg3 == 3) {
                this.method830(arg0 ^ 0x1280108, 160, var7, var8);
                this.method830(arg0 - 19398920, 2, var7, var8 - 1);
                this.method830(0, 8, var7 - 1, var8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method830(arg0 ^ 0x1280108, 65536, var7, var8);
                this.method830(0, 4096, var7 - 1, var8);
            }
            if (arg3 == 1) {
                this.method830(0, 1024, var7, var8);
                this.method830(arg0 - 19398920, 16384, var7, var8 + 1);
            }
            if (arg3 == 2) {
                this.method830(arg0 ^ 0x1280108, 4096, var7, var8);
                this.method830(0, 65536, var7 + 1, var8);
            }
            if (arg3 == 3) {
                this.method830(arg0 - 19398920, 16384, var7, var8);
                this.method830(0, 1024, var7, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method830(0, 512, var7, var8);
                this.method830(0, 8192, var7 - 1, var8 - -1);
            }
            if (arg3 == 1) {
                this.method830(0, 2048, var7, var8);
                this.method830(0, 32768, var7 + 1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method830(0, 8192, var7, var8);
                this.method830(arg0 ^ 0x1280108, 512, var7 + 1, var8 + -1);
            }
            if (arg3 == 3) {
                this.method830(arg0 ^ 0x1280108, 32768, var7, var8);
                this.method830(0, 2048, var7 - 1, var8 + -1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method830(0, 66560, var7, var8);
            this.method830(0, 4096, var7 - 1, var8);
            this.method830(arg0 ^ 0x1280108, 16384, var7, var8 + 1);
        }
        if (arg3 == 1) {
            this.method830(0, 5120, var7, var8);
            this.method830(0, 16384, var7, var8 + 1);
            this.method830(0, 65536, var7 + 1, var8);
        }
        if (arg3 == 2) {
            this.method830(0, 20480, var7, var8);
            this.method830(arg0 ^ 0x1280108, 65536, var7 + 1, var8);
            this.method830(0, 1024, var7, var8 - 1);
        }
        if (arg3 == 3) {
            this.method830(arg0 ^ 0x1280108, 81920, var7, var8);
            this.method830(arg0 ^ 0x1280108, 1024, var7, var8 - 1);
            this.method830(0, 4096, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIZII)V")
    public final void method842(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field2498;
        if (arg1) {
            field2485 = null;
        }
        field2487++;
        int var8 = arg4 - this.field2494;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method843(128, -65, var7, var8);
                this.method843(8, 91, var7 - 1, var8);
            }
            if (arg2 == 1) {
                this.method843(2, -68, var7, var8);
                this.method843(32, -119, var7, var8 + 1);
            }
            if (arg2 == 2) {
                this.method843(8, -97, var7, var8);
                this.method843(128, -97, var7 + 1, var8);
            }
            if (arg2 == 3) {
                this.method843(32, 40, var7, var8);
                this.method843(2, -115, var7, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method843(1, 107, var7, var8);
                this.method843(16, 45, var7 - 1, var8 + 1);
            }
            if (arg2 == 1) {
                this.method843(4, -71, var7, var8);
                this.method843(64, -73, var7 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method843(16, -118, var7, var8);
                this.method843(1, 56, var7 + 1, var8 + -1);
            }
            if (arg2 == 3) {
                this.method843(64, -80, var7, var8);
                this.method843(4, 54, var7 - 1, var8 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method843(130, -101, var7, var8);
                this.method843(8, -93, var7 - 1, var8);
                this.method843(32, -126, var7, var8 + 1);
            }
            if (arg2 == 1) {
                this.method843(10, -116, var7, var8);
                this.method843(32, 64, var7, var8 + 1);
                this.method843(128, -107, var7 + 1, var8);
            }
            if (arg2 == 2) {
                this.method843(40, 74, var7, var8);
                this.method843(128, 33, var7 + 1, var8);
                this.method843(2, 76, var7, var8 - 1);
            }
            if (arg2 == 3) {
                this.method843(160, 117, var7, var8);
                this.method843(2, -68, var7, var8 - 1);
                this.method843(8, 28, var7 - 1, var8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method843(65536, -99, var7, var8);
                this.method843(4096, 71, var7 - 1, var8);
            }
            if (arg2 == 1) {
                this.method843(1024, 71, var7, var8);
                this.method843(16384, -93, var7, var8 + 1);
            }
            if (arg2 == 2) {
                this.method843(4096, 120, var7, var8);
                this.method843(65536, 62, var7 + 1, var8);
            }
            if (arg2 == 3) {
                this.method843(16384, -105, var7, var8);
                this.method843(1024, -127, var7, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method843(512, -64, var7, var8);
                this.method843(8192, -117, var7 - 1, var8 - -1);
            }
            if (arg2 == 1) {
                this.method843(2048, 127, var7, var8);
                this.method843(32768, 75, var7 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method843(8192, -102, var7, var8);
                this.method843(512, 30, var7 + 1, var8 + -1);
            }
            if (arg2 == 3) {
                this.method843(32768, 60, var7, var8);
                this.method843(2048, 59, var7 - 1, var8 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method843(66560, 30, var7, var8);
            this.method843(4096, -112, var7 - 1, var8);
            this.method843(16384, -99, var7, var8 + 1);
        }
        if (arg2 == 1) {
            this.method843(5120, -105, var7, var8);
            this.method843(16384, 47, var7, var8 + 1);
            this.method843(65536, 25, var7 + 1, var8);
        }
        if (arg2 == 2) {
            this.method843(20480, 30, var7, var8);
            this.method843(65536, 91, var7 + 1, var8);
            this.method843(1024, -95, var7, var8 - 1);
        }
        if (arg2 == 3) {
            this.method843(81920, 58, var7, var8);
            this.method843(1024, -108, var7, var8 - 1);
            this.method843(4096, 55, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIII)V")
    private final void method843(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -22 / ((arg1 + 19) / 43);
        this.field2479[arg2][arg3] = class106.method732(this.field2479[arg2][arg3], 16777215 - arg0);
        field2475++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIIIII)V")
    public final void method844(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        field2477++;
        int var9 = arg6 - this.field2494;
        if (arg0) {
            var8 += 131072;
        }
        int var10 = arg3 - this.field2498;
        if (arg5 == 1 || arg5 == 3) {
            int var11 = arg4;
            arg4 = arg1;
            arg1 = var11;
        }
        if (arg2 != -1) {
            return;
        }
        for (int var12 = var10; var12 < arg4 + var10; var12++) {
            if (var12 >= 0 && this.field2474 > var12) {
                for (int var13 = var9; var13 < arg1 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field2484) {
                        this.method843(var8, -62, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    public final void method845(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2494;
        int var5 = arg0 - this.field2498;
        field2499++;
        this.field2479[var5][var4] = method840(this.field2479[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method846(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var7 = 2048 - arg2 & 0x7FF;
        field2480++;
        int var8 = 2048 - arg6 & 0x7FF;
        int var9 = 0;
        if (!arg5) {
            method846(72, 95, 42, 122, 23, false, 58);
        }
        int var10 = 0;
        int var11 = arg3;
        if (var8 != 0) {
            int var12 = class33.field760[var8];
            int var13 = class33.field736[var8];
            int var14 = var10 * var12 - arg3 * var13 >> 16;
            var11 = var10 * var13 + arg3 * var12 >> 16;
            var10 = var14;
        }
        if (var7 != 0) {
            int var15 = class33.field736[var7];
            int var16 = class33.field760[var7];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class88.field1966 = arg1 - var9;
        class64.field1423 = arg0 - var10;
        class4.field72 = arg6;
        class94.field2079 = arg4 - var11;
        class12.field196 = arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIIIIII)Z")
    public final boolean method847(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg3 + arg2 - 1;
        int var10 = arg0 + arg7 - 1;
        field2495++;
        if (arg6 >= arg7 && arg6 <= var10 && arg5 >= arg3 && var9 >= arg5) {
            return true;
        }
        if (arg1) {
            this.method845(127, -26, -32);
        }
        if (arg7 - 1 == arg6 && arg5 >= arg3 && var9 >= arg5 && (this.field2479[arg6 - this.field2498][arg5 - this.field2494] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg6 && arg5 >= arg3 && arg5 <= var9 && (this.field2479[arg6 - this.field2498][arg5 - this.field2494] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg5 && arg7 <= arg6 && var10 >= arg6 && (this.field2479[arg6 - this.field2498][arg5 - this.field2494] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg5 && arg7 <= arg6 && arg6 <= var10 && (this.field2479[arg6 - this.field2498][arg5 - this.field2494] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(II)V")
    public class117(int arg0, int arg1) {
        this.field2484 = arg1;
        this.field2498 = 0;
        this.field2494 = 0;
        this.field2474 = arg0;
        this.field2479 = new int[this.field2474][this.field2484];
        this.method835(-100);
    }
}
