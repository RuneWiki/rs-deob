import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class75 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lja;")
    public static class59 field1782 = new class59(4096);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[Z")
    public static boolean[] field1792 = new boolean[112];

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lkc;")
    private static class67 field1795 = class19.method144("Message", 127);

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lkc;")
    public static class67 field1787 = class19.method144("headicons_prayer", 99);

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lkc;")
    public static class67 field1784 = field1795;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field1796 = 0;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Lkc;")
    public static class67 field1797 = class19.method144("backvmid1", 104);

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field1800 = 0;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field1801 = -1;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Ldb;")
    public class24 field1779;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Ldb;")
    public class24 field1786;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Ldb;")
    public class24 field1789;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lnd;")
    public static class86 field1785;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method608(boolean arg0) {
        if (class12.field256 > 1) {
            class12.field256--;
        }
        if (class9.field192 > 0) {
            class9.field192--;
        }
        field1781++;
        if (class85.field2010) {
            class85.field2010 = false;
            class93.method733((byte) 55);
            return;
        }
        for (int var1 = 0; var1 < 100 && class63.method491(1); var1++) {
        }
        if (class30.field638 != 30 && class30.field638 != 35) {
            return;
        }
        if (class114.field2673 && class30.field638 == 30) {
            class115.field2705 = 0;
            class90.field2084 = 0;
            while (class114.method916((byte) 107)) {
            }
            for (int var2 = 0; var2 < field1792.length; var2++) {
                field1792[var2] = false;
            }
        }
        class49.method402(class54.field1295, 136, 95);
        Object var3 = class70.field1666.field2536;
        synchronized (class70.field1666.field2536) {
            if (!client.field463) {
                class70.field1666.field2548 = 0;
            } else if (class115.field2705 != 0 || class70.field1666.field2548 >= 40) {
                class54.field1295.method713(503, 222);
                class21.field429++;
                int var4 = 0;
                class54.field1295.method1115((byte) 49, 0);
                int var5 = class54.field1295.field3347;
                for (int var6 = 0; var6 < class70.field1666.field2548 && class54.field1295.field3347 - var5 < 240; var6++) {
                    int var7 = class70.field1666.field2550[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = class70.field1666.field2551[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    var4++;
                    int var9 = var7 * 765 + var8;
                    if (class70.field1666.field2550[var6] == -1 && class70.field1666.field2551[var6] == -1) {
                        var9 = 524287;
                        var7 = -1;
                        var8 = -1;
                    }
                    if (client.field460 != var8 || class21.field431 != var7) {
                        int var10 = var8 - client.field460;
                        client.field460 = var8;
                        int var11 = var7 - class21.field431;
                        class21.field431 = var7;
                        if (class90.field2062 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class54.field1295.method1079(-106701336, (var10 << 6) + ((class90.field2062 << 12) + var11));
                            class90.field2062 = 0;
                        } else if (class90.field2062 < 8) {
                            class54.field1295.method1096((class90.field2062 << 19) + var9 + 8388608, (byte) 100);
                            class90.field2062 = 0;
                        } else {
                            class54.field1295.method1100((class90.field2062 << 19) + var9 - 1073741824, (byte) 121);
                            class90.field2062 = 0;
                        }
                    } else if (class90.field2062 < 2047) {
                        class90.field2062++;
                    }
                }
                class54.field1295.method1108(-1, class54.field1295.field3347 - var5);
                if (var4 < class70.field1666.field2548) {
                    class70.field1666.field2548 -= var4;
                    for (int var12 = 0; var12 < class70.field1666.field2548; var12++) {
                        class70.field1666.field2551[var12] = class70.field1666.field2551[var12 + var4];
                        class70.field1666.field2550[var12] = class70.field1666.field2550[var12 + var4];
                    }
                } else {
                    class70.field1666.field2548 = 0;
                }
            }
        }
        if (class115.field2705 != 0) {
            class32.field677++;
            int var13 = class74.field1758;
            long var14 = (class101.field2275 - class12.field264) / 50L;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 764) {
                var13 = 764;
            }
            byte var16 = 0;
            class12.field264 = class101.field2275;
            if (class115.field2705 == 2) {
                var16 = 1;
            }
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            int var17 = class109.field2504;
            class54.field1295.method713(503, 236);
            int var18 = (int) var14;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 502) {
                var17 = 502;
            }
            int var19 = var17 * 765 + var13;
            class54.field1295.method1086((byte) -99, (var18 << 20) + (var16 << 19) + var19);
        }
        if (class61.field1441 > 0) {
            class61.field1441--;
        }
        if (field1792[96] || field1792[97] || field1792[98] || field1792[99]) {
            class109.field2487 = true;
        }
        if (class109.field2487 && class61.field1441 <= 0) {
            class109.field2487 = false;
            class88.field2023++;
            class61.field1441 = 20;
            class54.field1295.method713(503, 58);
            class54.field1295.method1098(class121.field2847, (byte) 2);
            class54.field1295.method1089(class19.field376, 128);
        }
        if (class125.field2920 == arg0 && !class29.field612) {
            class29.field612 = true;
            class54.field1295.method713(503, 167);
            class117.field2758++;
            class54.field1295.method1115((byte) 49, 1);
        }
        if (!class125.field2920 && class29.field612) {
            class29.field612 = false;
            class54.field1295.method713(503, 167);
            class54.field1295.method1115((byte) 49, 0);
            class117.field2758++;
        }
        class24.method186((byte) -117);
        if (class30.field638 != 30 && class30.field638 != 35) {
            return;
        }
        class80.method634(82);
        class19.method147(-100);
        class1.field4++;
        if (class1.field4 > 750) {
            class93.method733((byte) 55);
            return;
        }
        class91.method714(121);
        class137.method1066(-22);
        class2.method8(-1);
        class121.field2830++;
        if (class9.field195 != 0) {
            class112.field2591 += 20;
            if (class112.field2591 >= 400) {
                class9.field195 = 0;
            }
        }
        if (class25.field533 != 0) {
            class103.field2301++;
            if (class103.field2301 >= 15) {
                if (class25.field533 == 2) {
                    class121.field2849 = true;
                }
                if (class25.field533 == 3) {
                    class138.field3304 = true;
                }
                class25.field533 = 0;
            }
        }
        if (field1796 != 0) {
            class81.field1942++;
            if (class119.field2811 + 5 < class138.field3298 || class138.field3298 < class119.field2811 - 5 || class80.field1889 > class18.field352 + 5 || class80.field1889 < class18.field352 - 5) {
                class52.field1274 = true;
            }
            if (class90.field2084 == 0) {
                if (field1796 == 2) {
                    class121.field2849 = true;
                }
                if (field1796 == 3) {
                    class138.field3304 = true;
                }
                field1796 = 0;
                if (class52.field1274 && class81.field1942 >= 5) {
                    class133.field3179 = -1;
                    class85.method657(453);
                    if (class133.field3179 == class122.field2864 && class99.field2221 != class94.field2158) {
                        class100.field2255++;
                        class33 var20 = class88.method685((byte) -95, class122.field2864);
                        byte var21 = 0;
                        if (class121.field2854 == 1 && var20.field764 == 206) {
                            var21 = 1;
                        }
                        if (var20.field778[class99.field2221] <= 0) {
                            var21 = 0;
                        }
                        if (class121.method946(class83.method649((byte) -102, var20), (byte) -84)) {
                            int var24 = class94.field2158;
                            int var25 = class99.field2221;
                            var20.field778[var25] = var20.field778[var24];
                            var20.field738[var25] = var20.field738[var24];
                            var20.field778[var24] = -1;
                            var20.field738[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class94.field2158;
                            int var23 = class99.field2221;
                            while (var22 != var23) {
                                if (var22 > var23) {
                                    var20.method277(var22 - 1, var22, 0);
                                    var22--;
                                } else if (var23 > var22) {
                                    var20.method277(var22 + 1, var22, 0);
                                    var22++;
                                }
                            }
                        } else {
                            var20.method277(class99.field2221, class94.field2158, 0);
                        }
                        class54.field1295.method713(503, 224);
                        class54.field1295.method1085(class99.field2221, (byte) 32);
                        class54.field1295.method1087((byte) 125, var21);
                        class54.field1295.method1086((byte) -113, class122.field2864);
                        class54.field1295.method1098(class94.field2158, (byte) 2);
                    }
                } else if ((class121.field2839 == 1 || class66.method512((byte) -111, class55.field1323 - 1)) && class55.field1323 > 2) {
                    class135.method1048(96);
                } else if (class55.field1323 > 0) {
                    class69.method573(class55.field1323 - 1, (byte) 56);
                }
                class103.field2301 = 10;
                class115.field2705 = 0;
            }
        }
        byte var26 = 34;
        if (class59.field1387 == -1) {
            if (class96.field2163 != -1) {
                class29.method253(338, 516, class96.field2163, 4, (byte) 77, var26, 4);
            } else if (class41.field992 != -1) {
                class29.method253(338, 516, class41.field992, 4, (byte) 59, var26, 4);
            }
            if (class114.field2671 != -1) {
                class29.method253(466, 743, class114.field2671, 205, (byte) 84, var26, 553);
            } else if (class122.field2894[class131.field3089] != -1) {
                class29.method253(466, 743, class122.field2894[class131.field3089], 205, (byte) 50, var26, 553);
            }
            if (class63.field1487 != -1) {
                class29.method253(453, 496, class63.field1487, 357, (byte) 61, var26, 17);
            } else if (class49.field1177 != -1) {
                class29.method253(453, 496, class49.field1177, 357, (byte) 26, var26, 17);
            }
        } else {
            class29.method253(503, 765, class59.field1387, 0, (byte) 109, var26, 0);
            if (class11.field246 != -1) {
                class29.method253(503, 765, class11.field246, 0, (byte) 64, var26, 0);
            }
        }
        if (class59.field1387 == -1) {
            if (class96.field2163 != -1) {
                class29.method253(338, 516, class96.field2163, 4, (byte) 66, ~var26, 4);
            } else if (class41.field992 != -1) {
                class29.method253(338, 516, class41.field992, 4, (byte) 40, ~var26, 4);
            }
            if (class114.field2671 != -1) {
                class29.method253(466, 743, class114.field2671, 205, (byte) 103, ~var26, 553);
            } else if (class122.field2894[class131.field3089] != -1) {
                class29.method253(466, 743, class122.field2894[class131.field3089], 205, (byte) 102, ~var26, 553);
            }
            if (class63.field1487 != -1) {
                class29.method253(453, 496, class63.field1487, 357, (byte) 54, ~var26, 17);
            } else if (class49.field1177 != -1) {
                class29.method253(453, 496, class49.field1177, 357, (byte) 72, ~var26, 17);
            }
        } else {
            class29.method253(503, 765, class59.field1387, 0, (byte) 49, ~var26, 0);
            if (class11.field246 != -1) {
                class29.method253(503, 765, class11.field246, 0, (byte) 127, ~var26, 0);
            }
        }
        class58.method457(-45);
        if (class113.field2608 != -1) {
            int var27 = class113.field2608;
            int var28 = class113.field2632;
            boolean var29 = class38.method308(0, 0, class69.field1640.field1263[0], 0, var27, 0, var28, 0, true, 0, -14415, class69.field1640.field1198[0]);
            if (var29) {
                class9.field195 = 1;
                class20.field406 = class109.field2504;
                class50.field1242 = class74.field1758;
                class112.field2591 = 0;
            }
            class113.field2608 = -1;
        }
        if (class115.field2705 == 1 && class109.field2480 != null) {
            class138.field3304 = true;
            class109.field2480 = null;
            class115.field2705 = 0;
        }
        class38.method311((byte) -75);
        if (class59.field1387 == -1) {
            class73.method593(94);
            class49.method404((byte) 81);
            class73.method589(0);
        }
        if (class90.field2084 == 1 || class115.field2705 == 1) {
            class24.field512++;
        }
        if (class140.field3357 == -1 && class73.field1704 == -1 && class115.field2716 == -1) {
            if (class21.field435 > 0) {
                class21.field435--;
            }
        } else if (class21.field435 < class42.field1024) {
            class21.field435++;
            if (class42.field1024 == class21.field435) {
                if (class140.field3357 != -1) {
                    class138.field3304 = true;
                }
                if (class73.field1704 != -1) {
                    class121.field2849 = true;
                }
            }
        }
        class38.method315(arg0);
        if (class106.field2420) {
            class10.method92(-1025);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class82.field1951[var30]++;
        }
        class30.method254(-1);
        int var31 = class38.method306((byte) -97);
        int var32 = class101.method776((byte) 84);
        if (var31 > 4500 && var32 > 4500) {
            class100.field2242++;
            class9.field192 = 250;
            class64.method494((byte) -7, 4000);
            class54.field1295.method713(503, 82);
        }
        class60.field1413++;
        class88.field2031++;
        class24.field514++;
        if (class24.field514 > 500) {
            int var33 = (int) (Math.random() * 8.0D);
            class24.field514 = 0;
            if ((var33 & 0x4) == 4) {
                class32.field686 += class70.field1667;
            }
            if ((var33 & 0x2) == 2) {
                class71.field1697 += class138.field3299;
            }
            if ((var33 & 0x1) == 1) {
                class78.field1849 += class102.field2286;
            }
        }
        if (class32.field686 < -40) {
            class70.field1667 = 1;
        }
        if (class32.field686 > 40) {
            class70.field1667 = -1;
        }
        if (class60.field1413 > 500) {
            int var34 = (int) (Math.random() * 8.0D);
            class60.field1413 = 0;
            if ((var34 & 0x2) == 2) {
                class9.field197 += class93.field2133;
            }
            if ((var34 & 0x1) == 1) {
                class81.field1920 += class46.field1115;
            }
        }
        if (class71.field1697 < -55) {
            class138.field3299 = 2;
        }
        if (class78.field1849 < -50) {
            class102.field2286 = 2;
        }
        if (class9.field197 < -20) {
            class93.field2133 = 1;
        }
        if (class78.field1849 > 50) {
            class102.field2286 = -2;
        }
        if (class71.field1697 > 55) {
            class138.field3299 = -2;
        }
        if (class9.field197 > 10) {
            class93.field2133 = -1;
        }
        if (class81.field1920 < -60) {
            class46.field1115 = 2;
        }
        if (class81.field1920 > 60) {
            class46.field1115 = -2;
        }
        if (class88.field2031 > 50) {
            class54.field1295.method713(503, 99);
            class69.field1648++;
        }
        try {
            if (class71.field1679 != null && class54.field1295.field3347 > 0) {
                class71.field1679.method754(class54.field1295.field3347, 32741, 0, class54.field1295.field3325);
                class54.field1295.field3347 = 0;
                class88.field2031 = 0;
            }
        } catch (IOException var35) {
            class93.method733((byte) 55);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III[BZ[Lad;IIII)V", line = 661)
    public static final void method609(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, class5[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field1790++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg8 + var10 > 0 && arg8 + var10 < 103 && arg9 + var15 > 0 && arg9 + var15 < 103) {
                    arg5[arg2].field98[arg8 + var10][arg9 + var15] = class90.method693(arg5[arg2].field98[arg8 + var10][arg9 + var15], -16777217);
                }
            }
        }
        if (arg4) {
            method609(40, -70, 102, null, true, null, -57, 21, -123, -59);
        }
        class140 var11 = new class140(arg3);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg7 == var12 && arg0 <= var13 && var13 < arg0 + 8 && var14 >= arg1 && arg1 + 8 > var14) {
                        class4.method37(0, class88.method687(arg6, var14 & 0x7, var13 & 0x7, (byte) 81) + arg9, var11, 0, arg6, arg8 + class30.method259(arg6, -20303, var14 & 0x7, var13 & 0x7), arg2, (byte) 0);
                    } else {
                        class4.method37(0, -1, var11, 0, 0, -1, 0, (byte) 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Led;B)Z", line = 732)
    public static final boolean method610(class33 arg0, byte arg1) {
        field1788++;
        int var2 = arg0.field764;
        if (class128.field3005 == 2) {
            if (var2 == 201) {
                class127.field2967 = class127.field2976;
                class127.field2963 = class127.field2957;
                class138.field3304 = true;
                class21.field434 = true;
                class30.field645 = 1;
                class41.field1008 = 0;
            }
            if (var2 == 202) {
                class30.field645 = 2;
                class41.field1008 = 0;
                class138.field3304 = true;
                class127.field2963 = class98.field2212;
                class21.field434 = true;
                class127.field2967 = class127.field2976;
            }
        }
        if (var2 == 205) {
            class9.field192 = 250;
            return true;
        }
        if (arg1 != -67) {
            field1787 = null;
        }
        if (var2 == 501) {
            class127.field2963 = class121.field2844;
            class127.field2967 = class127.field2976;
            class41.field1008 = 0;
            class30.field645 = 4;
            class138.field3304 = true;
            class21.field434 = true;
        }
        if (var2 == 502) {
            class138.field3304 = true;
            class21.field434 = true;
            class127.field2963 = class7.field167;
            class41.field1008 = 0;
            class127.field2967 = class127.field2976;
            class30.field645 = 5;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class60.field1428.method1024((byte) -111, var4 == 1, var3);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class60.field1428.method1026(var6 == 1, 94, var5);
        }
        if (var2 == 324) {
            class60.field1428.method1035((byte) -100, false);
        }
        if (var2 == 325) {
            class60.field1428.method1035((byte) -108, true);
        }
        if (var2 == 326) {
            class54.field1295.method713(arg1 + 570, 109);
            class106.field2428++;
            class60.field1428.method1032(arg1 ^ 0xFFFFFFC4, class54.field1295);
            return true;
        }
        if (var2 == 620) {
            class82.field1959 = !class82.field1959;
        }
        if (var2 >= 601 && var2 <= 613) {
            class14.method113(-1);
            if (class127.field2968.method539(arg1 + 2685) > 0) {
                class126.field2933++;
                class54.field1295.method713(503, 95);
                class54.field1295.method1083((byte) -112, class127.field2968.method532(arg1 ^ 0x24));
                class54.field1295.method1115((byte) 49, var2 - 601);
                class54.field1295.method1115((byte) 49, class82.field1959 ? 1 : 0);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 871)
    public static void method611(int arg0) {
        field1792 = null;
        field1785 = null;
        if (arg0 != 1) {
            method612((byte) 112, null);
        }
        field1782 = null;
        field1795 = null;
        field1784 = null;
        field1797 = null;
        field1787 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLac;)V", line = 888)
    public static final void method612(byte arg0, class4 arg1) {
        field1802++;
        int var2 = 81 % ((arg0 - 33) / 60);
        class132.field3136 = arg1;
    }
}
