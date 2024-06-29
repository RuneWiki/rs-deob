import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class93 extends class108 {

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public int field2133 = -1;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public int field2149 = 0;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "Lgd;")
    private static class40 field2137 = class14.method90(false, "Use");

    @OriginalMember(owner = "client!p", name = "I", descriptor = "Lgd;")
    public static class40 field2134 = class14.method90(false, "redstone3");

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Lgd;")
    public static class40 field2130 = field2137;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "Lgd;")
    public static class40 field2153 = class14.method90(false, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!p", name = "U", descriptor = "Lgd;")
    public static class40 field2146 = class14.method90(false, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "Lrb;")
    public static class103 field2151;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "Lia;")
    public static class48 field2148;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "[I")
    public static int[] field2128;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "[Lhd;")
    public static class46[] field2139;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lgd;Lgd;BLgd;)V", line = 14)
    public static final void method625(class40 arg0, class40 arg1, byte arg2, class40 arg3) {
        if (arg2 != -89) {
            method625(null, null, (byte) 10, null);
        }
        field2140++;
        class92.field2112 = arg0;
        class92.field2095 = arg3;
        class92.field2107 = arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZII)Lgd;", line = 31)
    public static final class40 method626(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field2128 = null;
        }
        field2143++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class24.field572;
        } else if (var3 < -6) {
            return class22.field523;
        } else if (var3 < -3) {
            return class9.field233;
        } else if (var3 < 0) {
            return class23.field545;
        } else if (var3 > 9) {
            return class65.field1598;
        } else if (var3 > 6) {
            return class49.field1238;
        } else if (var3 > 3) {
            return class10.field265;
        } else if (var3 > 0) {
            return class110.field2686;
        } else {
            return class21.field489;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 77)
    public static final void method627(int arg0) {
        field2154++;
        if (class98.field2327 == 0) {
            class21.field490 = new class124(4, 104, 104, class89.field2021);
            for (int var1 = 0; var1 < 4; var1++) {
                class54.field1392[var1] = new class99(104, 104);
            }
            class38.field937 = new class46(512, 512);
            class98.field2327 = 20;
            class92.field2113 = class31.field815;
            class13.field342 = 5;
        } else if (class98.field2327 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class109.field2659[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class124.method951(var2, 500, 800, 512, 334);
            class92.field2113 = class64.field1573;
            class13.field342 = 10;
            class98.field2327 = 30;
        } else if (class98.field2327 == 30) {
            class42.field1057 = class99.method695(0, arg0 ^ 0xF4224, false, true, true);
            class43.field1077 = class99.method695(1, 1000000, false, true, true);
            class22.field494 = class99.method695(2, 1000000, true, true, false);
            class29.field632 = class99.method695(3, 1000000, false, true, true);
            class41.field1016 = class99.method695(4, 1000000, false, true, true);
            class80.field1826 = class99.method695(5, 1000000, true, true, true);
            class50.field1282 = class99.method695(6, 1000000, true, false, true);
            class107.field2603 = class99.method695(7, arg0 ^ 0xF4224, false, true, true);
            class106.field2578 = class99.method695(8, 1000000, false, true, true);
            class2.field42 = class99.method695(9, 1000000, false, true, true);
            class103.field2494 = class99.method695(10, 1000000, false, true, true);
            class98.field2324 = class99.method695(11, 1000000, false, true, true);
            class136.field3333 = class99.method695(12, arg0 ^ 0xF4224, false, true, true);
            class90.field2042 = class99.method695(13, 1000000, true, true, false);
            class98.field2327 = 40;
            class13.field342 = 20;
            class92.field2113 = class11.field287;
        } else {
            if (arg0 != 100) {
                method625(null, null, (byte) -6, null);
            }
            if (class98.field2327 == 40) {
                byte var7 = 0;
                int var8 = var7 + class42.field1057.method1062(arg0 ^ 0x13) * 5 / 100;
                int var9 = var8 + class43.field1077.method1062(arg0 ^ 0x16) * 5 / 100;
                int var10 = var9 + class22.field494.method1062(111) * 5 / 100;
                int var11 = var10 + class29.field632.method1062(116) * 5 / 100;
                int var12 = var11 + class41.field1016.method1062(120) * 5 / 100;
                int var13 = var12 + class80.field1826.method1062(127) * 5 / 100;
                int var14 = var13 + class50.field1282.method1062(126) * 5 / 100;
                int var15 = var14 + class107.field2603.method1062(110) * 40 / 100;
                int var16 = var15 + class106.field2578.method1062(123) * 5 / 100;
                int var17 = var16 + class2.field42.method1062(124) * 3 / 100;
                int var18 = var17 + class103.field2494.method1062(arg0 + 18) * 5 / 100;
                int var19 = var18 + class98.field2324.method1062(119) * 5 / 100;
                int var20 = var19 + class136.field3333.method1062(122) * 5 / 100;
                int var21 = var20 + class90.field2042.method1062(117) * 2 / 100;
                if (var21 == 100) {
                    class92.field2113 = class5.field153;
                    class98.field2327 = 45;
                    class13.field342 = 30;
                } else {
                    if (var21 != 0) {
                        class92.field2113 = client.method114(true, new class40[] { class59.field1499, class21.method121(arg0 ^ 0x5BF0, var21), class18.field447 });
                    }
                    class13.field342 = 30;
                }
            } else if (class98.field2327 == 45) {
                class23.method137(-1, 0, !class8.field209, class30.field737);
                class14.field362 = class23.method138(arg0 ^ 0xFFFFF998, class30.field737, class30.field761);
                field2148 = new class48(22050, class131.field3171);
                class13.field342 = 35;
                class92.field2113 = class8.field215;
                class98.field2327 = 50;
            } else if (class98.field2327 == 50) {
                int var22 = 0;
                if (class77.field1778 == null) {
                    class77.field1778 = class108.method829((byte) -79, class125.field2966, class106.field2578, class128.field3071);
                } else {
                    var22++;
                }
                if (class133.field3238 == null) {
                    class133.field3238 = class108.method829((byte) -79, class125.field2966, class106.field2578, class61.field1525);
                } else {
                    var22++;
                }
                if (class1.field17 == null) {
                    class1.field17 = class108.method829((byte) -79, class125.field2966, class106.field2578, class98.field2325);
                } else {
                    var22++;
                }
                if (var22 < 3) {
                    class92.field2113 = client.method114(true, new class40[] { class77.field1784, class21.method121(23444, var22 * 100 / 3), class18.field447 });
                    class13.field342 = 40;
                } else {
                    class92.field2113 = class96.field2245;
                    class13.field342 = 40;
                    class98.field2327 = 60;
                }
            } else if (class98.field2327 == 60) {
                int var23 = class31.method204(class103.field2494, arg0 + 5727, class106.field2578);
                int var24 = class96.method648(5);
                if (var23 < var24) {
                    class92.field2113 = client.method114(true, new class40[] { class45.field1133, class21.method121(23444, var23 * 100 / var24), class18.field447 });
                    class13.field342 = 50;
                } else {
                    class13.field342 = 50;
                    class92.field2113 = class85.field1904;
                    class106.method822(true, 5);
                    class98.field2327 = 70;
                }
            } else if (class98.field2327 == 70) {
                if (class22.field494.method741(1)) {
                    class22.method130(class22.field494, false);
                    class134.method1051((byte) 66, class22.field494);
                    method628(class22.field494, class107.field2603, (byte) 126);
                    class120.method913(class107.field2603, 0, class8.field209, class22.field494);
                    class74.method503(class22.field494, -5088, class107.field2603);
                    class58.method436((byte) -60, class107.field2603, class44.field1104, class22.field494, class77.field1778);
                    class40.method266(class43.field1077, class22.field494, (byte) 81, class42.field1057);
                    class94.method632(class107.field2603, (byte) -116, class22.field494);
                    class125.method994(class22.field494, -8662);
                    class48.method377(class22.field494, (byte) 122);
                    class132.method1042(72, class106.field2578, class29.field632, class107.field2603);
                    class98.field2327 = 80;
                    class13.field342 = 60;
                    class92.field2113 = class34.field864;
                } else {
                    class92.field2113 = client.method114(true, new class40[] { class99.field2363, class21.method121(23444, class22.field494.method1059(1585279406)), class18.field447 });
                    class13.field342 = 60;
                }
            } else if (class98.field2327 == 80) {
                int var25 = 0;
                if (class55.field1430 == null) {
                    class55.field1430 = class128.method1008(19398914, class125.field2966, class14.field359, class106.field2578);
                } else {
                    var25++;
                }
                if (class134.field3274 == null) {
                    class134.field3274 = class128.method1008(19398914, class125.field2966, class115.field2771, class106.field2578);
                } else {
                    var25++;
                }
                if (class91.field2081 == null) {
                    class91.field2081 = class59.method442(class125.field2966, 0, class106.field2578, class49.field1236);
                } else {
                    var25++;
                }
                if (class83.field1880 == null) {
                    class83.field1880 = class55.method415(class106.field2578, class125.field2966, class45.field1152, -195564121);
                } else {
                    var25++;
                }
                if (field2139 == null) {
                    field2139 = class55.method415(class106.field2578, class125.field2966, class137.field3345, -195564121);
                } else {
                    var25++;
                }
                if (class114.field2745 == null) {
                    class114.field2745 = class55.method415(class106.field2578, class125.field2966, class54.field1397, -195564121);
                } else {
                    var25++;
                }
                if (class45.field1126 == null) {
                    class45.field1126 = class55.method415(class106.field2578, class125.field2966, class54.field1367, arg0 - 195564221);
                } else {
                    var25++;
                }
                if (class107.field2600 == null) {
                    class107.field2600 = class55.method415(class106.field2578, class125.field2966, class135.field3306, -195564121);
                } else {
                    var25++;
                }
                if (class43.field1084 == null) {
                    class43.field1084 = class128.method1008(arg0 + 19398814, class125.field2966, class137.field3340, class106.field2578);
                } else {
                    var25++;
                }
                if (class10.field248 == null) {
                    class10.field248 = class55.method415(class106.field2578, class125.field2966, class53.field1342, -195564121);
                } else {
                    var25++;
                }
                if (class88.field1987 == null) {
                    class88.field1987 = class55.method415(class106.field2578, class125.field2966, class118.field2798, -195564121);
                } else {
                    var25++;
                }
                if (class48.field1228 == null) {
                    class48.field1228 = class55.method415(class106.field2578, class125.field2966, client.field470, arg0 ^ 0xF457EDC3);
                } else {
                    var25++;
                }
                if (class8.field220 == null) {
                    class8.field220 = class59.method442(class125.field2966, 0, class106.field2578, class122.field2865);
                } else {
                    var25++;
                }
                if (class54.field1394 == null) {
                    class54.field1394 = class59.method442(class125.field2966, 0, class106.field2578, class82.field1851);
                } else {
                    var25++;
                }
                if (var25 < 14) {
                    class92.field2113 = client.method114(true, new class40[] { class69.field1670, class21.method121(23444, var25 * 100 / 14), class18.field447 });
                    class13.field342 = 70;
                } else {
                    class134.field3274.method328();
                    int var26 = (int) (Math.random() * 21.0D) - 10;
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    int var28 = (int) (Math.random() * 21.0D) - 10;
                    int var29 = (int) (Math.random() * 41.0D) - 20;
                    for (int var30 = 0; var30 < class83.field1880.length; var30++) {
                        class83.field1880[var30].method323(var26 + var29, var27 + var29, var28 + var29);
                    }
                    class91.field2081[0].method496(var26 + var29, var27 + var29, var28 + var29);
                    class98.field2327 = 85;
                    class92.field2113 = class79.field1815;
                    class13.field342 = 70;
                }
            } else if (class98.field2327 == 85) {
                int var31 = class89.method583(arg0 - 100, class106.field2578);
                int var32 = class107.method827(-100);
                if (var32 > var31) {
                    class92.field2113 = client.method114(true, new class40[] { class22.field505, class21.method121(23444, var31 * 100 / var32), class18.field447 });
                    class13.field342 = 80;
                } else {
                    class92.field2113 = class60.field1513;
                    class98.field2327 = 90;
                    class13.field342 = 80;
                }
            } else if (class98.field2327 == 90) {
                if (class2.field42.method741(1)) {
                    class92 var33 = new class92(class2.field42, class106.field2578, 20, 0.8D, class8.field209 ? 64 : 128);
                    class109.method851(var33);
                    class109.method840(0.8D);
                    class13.field342 = 90;
                    class98.field2327 = 110;
                    class92.field2113 = class85.field1906;
                } else {
                    class92.field2113 = client.method114(true, new class40[] { class80.field1840, class21.method121(arg0 ^ 0x5BF0, class2.field42.method1059(1585279406)), class18.field447 });
                    class13.field342 = 90;
                }
            } else if (class98.field2327 == 110) {
                class66.field1608 = new class79();
                class30.field737.method725((byte) 108, 10, class66.field1608);
                class92.field2113 = class53.field1351;
                class98.field2327 = 120;
                class13.field342 = 94;
            } else if (class98.field2327 == 120) {
                if (class103.field2494.method726(class125.field2966, 110, class125.field2952)) {
                    class129 var34 = new class129(class103.field2494.method743(-108, class125.field2966, class125.field2952));
                    class43.method291((byte) -25, var34);
                    class13.field342 = 96;
                    class98.field2327 = 130;
                    class92.field2113 = class108.field2648;
                } else {
                    class92.field2113 = client.method114(true, new class40[] { class76.field1756, class24.field564 });
                    class13.field342 = 96;
                }
            } else if (class98.field2327 == 130) {
                if (!class29.field632.method741(1)) {
                    class92.field2113 = client.method114(true, new class40[] { class90.field2046, class21.method121(arg0 + 23344, class29.field632.method1059(1585279406) * 4 / 5), class18.field447 });
                    class13.field342 = 100;
                } else if (!class136.field3333.method741(1)) {
                    class92.field2113 = client.method114(true, new class40[] { class90.field2046, class21.method121(arg0 + 23344, class136.field3333.method1059(1585279406) / 6 + 80), class18.field447 });
                    class13.field342 = 100;
                } else if (class90.field2042.method741(1)) {
                    class13.field342 = 100;
                    class92.field2113 = client.field469;
                    class98.field2327 = 140;
                } else {
                    class92.field2113 = client.method114(true, new class40[] { class90.field2046, class21.method121(23444, class90.field2042.method1059(1585279406) / 20 + 96), class18.field447 });
                    class13.field342 = 100;
                }
            } else if (class98.field2327 == 140) {
                class106.method822(true, 10);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lrb;Lrb;B)V", line = 499)
    private static final void method628(class103 arg0, class103 arg1, byte arg2) {
        field2151 = arg1;
        if (arg2 > 119) {
            class52.field1326 = arg0;
            class128.field3054 = class52.field1326.method729(1, 3);
            field2145++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lfa;B)V", line = 520)
    public static final void method629(class31 arg0, byte arg1) {
        arg0.field768 = 0;
        int var2 = arg0.field826 - class10.field242;
        if (arg0.field800 == 0) {
            arg0.field781 = 1024;
        }
        int var3 = arg0.field775 * 128 + arg0.field794 * 64;
        field2136++;
        int var4 = arg0.field786 * 128 + arg0.field794 * 64;
        arg0.field792 += (var4 - arg0.field792) / var2;
        if (arg1 != 43) {
            method627(-26);
        }
        arg0.field838 += (var3 - arg0.field838) / var2;
        if (arg0.field800 == 1) {
            arg0.field781 = 1536;
        }
        if (arg0.field800 == 2) {
            arg0.field781 = 0;
        }
        if (arg0.field800 == 3) {
            arg0.field781 = 512;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V", line = 572)
    public static void method630(int arg0) {
        field2128 = null;
        field2148 = null;
        field2139 = null;
        if (arg0 != 104) {
            field2153 = null;
        }
        field2153 = null;
        field2146 = null;
        field2151 = null;
        field2134 = null;
        field2137 = null;
        field2130 = null;
    }
}
