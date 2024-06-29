import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class127 extends class137 {

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "J")
    public long field2468;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "[S")
    public static short[] field2463 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "[[B")
    public static byte[][] field2466 = new byte[250][];

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "[Lhh;")
    public static class163[] field2479 = new class163[200];

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
    public static boolean field2470 = false;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field2475 = 1;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Lee;")
    public static class108 field2477;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Lkc;")
    public static class227 field2469;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2478++;
        class107.field2034 = 0;
        if (arg0 > -106) {
            return;
        }
        for (int var7 = -1; var7 < class95.field1791 + class199.field3573; var7++) {
            class202 var23;
            if (var7 == -1) {
                var23 = class235.field4203;
            } else if (class95.field1791 > var7) {
                var23 = class106.field2029[class246.field4340[var7]];
            } else {
                var23 = class111.field2098[class155.field2887[var7 - class95.field1791]];
            }
            if (var23 != null && var23.method24((byte) 79)) {
                if (var23 instanceof class2) {
                    class181 var24 = ((class2) var23).field41;
                    if (var24.field3329 != null) {
                        var24 = var24.method1330(-1);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class95.field1791) {
                    class181 var30 = ((class2) var23).field41;
                    if (var30.field3329 != null) {
                        var30 = var30.method1330(-1);
                    }
                    if (var30.field3280 >= 0 && class143.field2711.length > var30.field3280) {
                        class183.method1357(arg5 >> 1, arg1, arg3, var23, var23.method1441(0) + 15, arg2 >> 1, (byte) -67);
                        if (class81.field1522 > -1) {
                            class143.field2711[var30.field3280].method101(class81.field1522 + arg6 - 12, arg4 + -30 + class225.field4077);
                        }
                    }
                    class135[] var31 = class174.field3174;
                    for (int var32 = 0; var32 < var31.length; var32++) {
                        class135 var42 = var31[var32];
                        if (var42 != null && var42.field2612 == 1 && class155.field2887[var7 - class95.field1791] == var42.field2613 && class227.field4092 % 20 < 10) {
                            class183.method1357(arg5 >> 1, arg1, arg3, var23, var23.method1441(0) + 15, arg2 >> 1, (byte) -61);
                            if (class81.field1522 > -1) {
                                class243.field4303[var42.field2602].method101(arg6 + class81.field1522 - 12, class225.field4077 + arg4 - 28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class126 var26 = (class126) var23;
                    if (var26.field2455 != -1 || var26.field2433 != -1) {
                        class183.method1357(arg5 >> 1, arg1, arg3, var23, var23.method1441(0) + 15, arg2 >> 1, (byte) -57);
                        if (class81.field1522 > -1) {
                            if (var26.field2455 != -1) {
                                class2.field32[var26.field2455].method101(arg6 - (12 - class81.field1522), arg4 - var25 + class225.field4077);
                                var25 += 25;
                            }
                            if (var26.field2433 != -1) {
                                class143.field2711[var26.field2433].method101(arg6 + class81.field1522 - 12, -var25 + class225.field4077 + arg4);
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var27 = 0;
                        class135[] var28 = class174.field3174;
                        while (var27 < var28.length) {
                            class135 var29 = var28[var27];
                            if (var29 != null && var29.field2612 == 10 && class246.field4340[var7] == var29.field2613) {
                                class183.method1357(arg5 >> 1, arg1, arg3, var23, var23.method1441(0) + 15, arg2 >> 1, (byte) -76);
                                if (class81.field1522 > -1) {
                                    class243.field4303[var29.field2602].method101(class81.field1522 + arg6 - 12, class225.field4077 + arg4 - var25);
                                }
                            }
                            var27++;
                        }
                    }
                }
                if (var23.field3623 != null && (class95.field1791 <= var7 || class186.field3414 == 0 || class186.field3414 == 3 || class186.field3414 == 1 && class211.method1510(((class126) var23).field2424, 23269))) {
                    class183.method1357(arg5 >> 1, arg1, arg3, var23, var23.method1441(0), arg2 >> 1, (byte) -120);
                    if (class81.field1522 > -1 && class66.field1120 > class107.field2034) {
                        class66.field1128[class107.field2034] = class216.field3932.method568(var23.field3623) / 2;
                        class66.field1109[class107.field2034] = class216.field3932.field1493;
                        class66.field1123[class107.field2034] = class81.field1522;
                        class66.field1127[class107.field2034] = class225.field4077;
                        class66.field1110[class107.field2034] = var23.field3643;
                        class66.field1116[class107.field2034] = var23.field3624;
                        class66.field1129[class107.field2034] = var23.field3681;
                        class66.field1114[class107.field2034] = var23.field3623;
                        class107.field2034++;
                    }
                }
                if (var23.field3621 > class227.field4092) {
                    class71 var33 = class8.field130[1];
                    class71 var34 = class8.field130[0];
                    if (var23 instanceof class2) {
                        class2 var35 = (class2) var23;
                        class71[] var36 = (class71[]) class124.field2394.method114((long) var35.field41.field3313, 0);
                        if (var36 == null) {
                            var36 = class252.method1719(var35.field41.field3313, -17, 0, class94.field1786);
                            if (var36 != null) {
                                class124.field2394.method117(var36, false, (long) var35.field41.field3313);
                            }
                        }
                        if (var36 != null && var36.length == 2) {
                            var34 = var36[0];
                            var33 = var36[1];
                        }
                    }
                    class183.method1357(arg5 >> 1, arg1, arg3, var23, var23.method1441(0) + var34.field1337 + 10, arg2 >> 1, (byte) -115);
                    if (class81.field1522 > -1) {
                        int var37 = class225.field4077 + arg4 - 3;
                        int var38 = class81.field1522 + arg6 - (var34.field1336 >> 1);
                        var34.method101(var38, var37);
                        int var39 = var34.field1337;
                        int var40 = var23.field3669 * var34.field1336 / 255;
                        class206.method1472(var38, var37, var38 + var40, var37 + var39);
                        var33.method101(var38, var37);
                        class206.method1466(arg6, arg4, arg2 + arg6, arg4 + arg5);
                    }
                }
                for (int var41 = 0; var41 < 4; var41++) {
                    if (class227.field4092 < var23.field3625[var41]) {
                        class183.method1357(arg5 >> 1, arg1, arg3, var23, var23.method1441(0) / 2, arg2 >> 1, (byte) -125);
                        if (class81.field1522 > -1) {
                            if (var41 == 1) {
                                class225.field4077 -= 20;
                            }
                            if (var41 == 2) {
                                class81.field1522 -= 15;
                                class225.field4077 -= 10;
                            }
                            if (var41 == 3) {
                                class81.field1522 += 15;
                                class225.field4077 -= 10;
                            }
                            class262.field4576[var23.field3646[var41]].method101(arg6 + class81.field1522 - 12, arg4 + -12 + class225.field4077);
                            class43.field739.method584(class136.method1061(var23.field3674[var41], (byte) 122), arg6 - (1 - class81.field1522), class225.field4077 + arg4 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class107.field2034; var8++) {
            int var9 = class66.field1128[var8];
            int var10 = class66.field1123[var8];
            int var11 = class66.field1127[var8];
            int var12 = class66.field1109[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (var11 + 2 > class66.field1127[var22] + -class66.field1109[var22] && class66.field1127[var22] + 2 > var11 - var12 && var10 - var9 < class66.field1128[var22] + class66.field1123[var22] && class66.field1123[var22] - class66.field1128[var22] < var9 + var10 && class66.field1127[var22] - class66.field1109[var22] < var11) {
                        var13 = true;
                        var11 = class66.field1127[var22] - class66.field1109[var22];
                    }
                }
            }
            class81.field1522 = class66.field1123[var8];
            class225.field4077 = class66.field1127[var8] = var11;
            class163 var14 = class66.field1114[var8];
            if (class68.field1151 == 0) {
                int var15 = 16776960;
                if (class66.field1110[var8] < 6) {
                    var15 = class223.field4069[class66.field1110[var8]];
                }
                if (class66.field1110[var8] == 6) {
                    var15 = (class114.field2145 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class66.field1110[var8] == 7) {
                    var15 = class114.field2145 % 20 < 10 ? 255 : 65535;
                }
                if (class66.field1110[var8] == 8) {
                    var15 = (class114.field2145 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class66.field1110[var8] == 9) {
                    int var16 = 150 - class66.field1129[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - ((var16 - 50) * 327680);
                    } else if (var16 < 150) {
                        var15 = ((var16 - 100) * 5) + 65280;
                    }
                }
                if (class66.field1110[var8] == 10) {
                    int var17 = 150 - class66.field1129[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - (var17 * 327680 - 16384000);
                    } else if (var17 < 150) {
                        var15 = (var17 - 100) * 327680 + 255 - (var17 + -100) * 5;
                    }
                }
                if (class66.field1110[var8] == 11) {
                    int var18 = 150 - class66.field1129[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = (var18 * 327685) + 65280 - 16384250;
                    } else if (var18 < 150) {
                        var15 = 16777215 - (var18 - 100) * 327680;
                    }
                }
                if (class66.field1116[var8] == 0) {
                    class216.field3932.method584(var14, class81.field1522 + arg6, class225.field4077 + arg4, var15, 0);
                }
                if (class66.field1116[var8] == 1) {
                    class216.field3932.method586(var14, class81.field1522 + arg6, class225.field4077 + arg4, var15, 0, class114.field2145);
                }
                if (class66.field1116[var8] == 2) {
                    class216.field3932.method581(var14, class81.field1522 + arg6, class225.field4077 + arg4, var15, 0, class114.field2145);
                }
                if (class66.field1116[var8] == 3) {
                    class216.field3932.method575(var14, arg6 + class81.field1522, class225.field4077 + arg4, var15, 0, class114.field2145, 150 - class66.field1129[var8]);
                }
                if (class66.field1116[var8] == 4) {
                    int var19 = (150 - class66.field1129[var8]) * (class216.field3932.method568(var14) + 100) / 150;
                    class206.method1472(arg6 + class81.field1522 - 50, arg4, class81.field1522 + arg6 + 50, arg4 + arg5);
                    class216.field3932.method592(var14, class81.field1522 + arg6 + 50 - var19, arg4 - -class225.field4077, var15, 0);
                    class206.method1466(arg6, arg4, arg6 + arg2, arg4 + arg5);
                }
                if (class66.field1116[var8] == 5) {
                    int var20 = 150 - class66.field1129[var8];
                    class206.method1472(arg6, class225.field4077 + arg4 - class216.field3932.field1493 - 1, arg2 + arg6, class225.field4077 + arg4 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class216.field3932.method584(var14, class81.field1522 + arg6, arg4 + var21 - -class225.field4077, var15, 0);
                    class206.method1466(arg6, arg4, arg2 + arg6, arg4 + arg5);
                }
            } else {
                class216.field3932.method584(var14, class81.field1522 + arg6, class225.field4077 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLpa;II)Lhk;")
    public static final class105 method1004(byte arg0, class123 arg1, int arg2, int arg3) {
        field2464++;
        int var4 = -102 / ((arg0 + 46) / 42);
        return class85.method677(arg2, arg1, 20888, arg3) ? class262.method1778(true) : null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    public static void method1005(byte arg0) {
        field2466 = null;
        field2477 = null;
        if (arg0 != 44) {
            field2475 = 16;
        }
        field2469 = null;
        field2479 = null;
        field2463 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZII)I")
    public static final int method1006(boolean arg0, int arg1, int arg2) {
        field2480++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0) {
            return 76;
        } else if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V")
    public static final void method1007(byte arg0) {
        class63.field1065.method120((byte) -109);
        if (arg0 != 71) {
            method1010(-14, 101, (byte) -10, true, false, false, 34, -28);
        }
        class182.field3358.method120((byte) -112);
        field2476++;
        class219.field3978.method120((byte) -92);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1008(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2467++;
        if (arg0 == arg1) {
            class144.method1096(arg0, arg7, arg5, arg3, arg4, arg6, arg2 ^ 0x43);
            return;
        }
        if ((arg5 - arg0) >= field2465 && arg0 + arg5 <= class252.field4407 && arg7 - arg1 >= class182.field3344 && arg7 + arg1 <= class201.field3593) {
            class143.method1088(arg1, arg4, arg6, arg3, arg7, arg0, true, arg5);
        } else {
            class175.method1298(arg7, arg4, -75, arg6, arg0, arg1, arg5, arg3);
        }
        if (arg2 != -48) {
            method1008(-40, 77, (byte) 122, 57, 106, -118, -15, 42);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class65.field1104 == 1) {
            class11.field175[class21.field333 / 100].method101(class192.field3516 - 8, class246.field4337 + -8);
        }
        if (arg2 > -71) {
            field2479 = null;
        }
        field2471++;
        if (class65.field1104 == 2) {
            class11.field175[class21.field333 / 100 + 4].method101(class192.field3516 - 8, class246.field4337 + -8);
        }
        class9.method63(-106);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBZZZII)Lvf;")
    public static final class71 method1010(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        field2481++;
        class99 var8 = class120.method939(22952, arg7);
        if (arg6 > 1 && var8.field1873 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg6 >= var8.field1924[var10] && var8.field1924[var10] != 0) {
                    var9 = var8.field1873[var10];
                }
            }
            if (var9 != -1) {
                var8 = class120.method939(22952, var9);
            }
        }
        class207 var11 = var8.method803(-50);
        if (var11 == null) {
            return null;
        }
        class105 var12 = null;
        if (var8.field1858 != -1) {
            var12 = (class105) method1010(0, 1, (byte) -128, true, true, false, 10, var8.field1891);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field1922 != -1) {
            var12 = (class105) method1010(arg0, arg1, (byte) -112, true, false, false, arg6, var8.field1911);
            if (var12 == null) {
                return null;
            }
        }
        if (arg2 >= -110) {
            method1011(120, 34, -121, -16);
        }
        int var13 = class206.field3713;
        int[] var14 = new int[4];
        int var15 = class206.field3711;
        int[] var16 = class206.field3716;
        class206.method1476(var14);
        class105 var17 = new class105(36, 32);
        class206.method1468(var17.field2012, 36, 32);
        class98.method775();
        class98.method789(16, 16);
        class98.field1838 = false;
        int var18 = var8.field1925;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg1 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class98.field1843[var8.field1918] * var18 >> 16;
        int var20 = class98.field1839[var8.field1918] * var18 >> 16;
        var11.method500(0, var8.field1868, var8.field1926, var8.field1918, var8.field1904, var20 + var8.field1889 - var11.method21() / 2, var8.field1889 + var19);
        if (arg1 >= 1) {
            var17.method849(1);
            if (arg1 >= 2) {
                var17.method849(16777215);
            }
            class206.method1468(var17.field2012, 36, 32);
        }
        if (arg0 != 0) {
            var17.method855(arg0);
        }
        if (var8.field1858 != -1) {
            var12.method101(0, 0);
        } else if (var8.field1922 != -1) {
            class206.method1468(var12.field2012, 36, 32);
            var17.method101(0, 0);
            var17 = var12;
        }
        if (arg5 && (var8.field1892 == 1 || arg6 != 1) && arg6 != -1) {
            class203.field3691.method592(class175.method1294(-30900, arg6), 0, 9, 16776960, 1);
        }
        class206.method1468(var16, var13, var15);
        class206.method1462(var14);
        class98.method775();
        class98.field1838 = true;
        return var17;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)I")
    public static final int method1011(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 >> 7;
        if (arg3 != 29908) {
            field2465 = -19;
        }
        field2473++;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1 & 0x7F;
        int var7 = arg2;
        if (arg2 < 3 && (class123.field2344[1][var4][var5] & 0x2) == 2) {
            var7 = arg2 + 1;
        }
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var6) * class228.field4107[var7][var4][var5] + class228.field4107[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class228.field4107[var7][var4][var5 + 1] + class228.field4107[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + (var8 * var10) >> 7;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method1012(int arg0, Random arg1, int arg2) {
        if (arg2 != -22067) {
            field2472 = 61;
        }
        field2474++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class140.method1080(true, arg0)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class246.method1691(var4, arg0, false);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(J)V")
    public class127(long arg0) {
        this.field2468 = arg0;
    }
}
