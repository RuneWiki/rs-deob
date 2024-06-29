import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ls;")
    private class118 field837 = new class118(256);

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lsd;")
    private class122 field850;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lsd;")
    private class122 field845;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lmb;")
    public static class84 field834 = class79.method672(true, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lmb;")
    public static class84 field841 = class79.method672(true, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Z")
    public static boolean field833 = false;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lmb;")
    public static class84 field846 = class79.method672(true, "Icons redrawn");

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lmb;")
    public static class84 field848 = class79.method672(true, "Fallen lassen");

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lmb;")
    public static class84 field843 = class79.method672(true, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field853 = 5063219;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[Lge;")
    public static class47[] field854 = new class47[256];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lmb;")
    public static class84 field842 = class79.method672(true, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field849 = 0;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lmb;")
    public static class84 field836 = class79.method672(true, "");

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "[I")
    public static int[] field856 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lsc;")
    public static class121 field838;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method281(int arg0) {
        field844++;
        if (class141.field3377 == 0) {
            class133.field3173 = new class56(4, 104, 104, class52.field1168);
            for (int var1 = 0; var1 < 4; var1++) {
                class65.field1603[var1] = new class65(104, 104);
            }
            class102.field2490 = new class112(512, 512);
            class40.field926 = 5;
            class52.field1162 = class77.field1948;
            class141.field3377 = 20;
            return;
        }
        if (arg0 > -85) {
            field854 = null;
        }
        if (class141.field3377 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = var4 * 3 + 600;
                int var6 = class104.field2520[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class56.method457(var2, 500, 800, 512, 334);
            class52.field1162 = class15.field328;
            class40.field926 = 10;
            class141.field3377 = 30;
        } else if (class141.field3377 == 30) {
            class79.field1969 = class87.method749(true, 0, false, 3, true);
            class126.field3051 = class87.method749(true, 1, false, 3, true);
            class77.field1945 = class87.method749(false, 2, true, 3, true);
            class62.field1553 = class87.method749(true, 3, false, 3, true);
            class120.field2870 = class87.method749(true, 4, false, 3, true);
            class59.field1462 = class87.method749(true, 5, true, 3, true);
            class27.field655 = class87.method749(true, 6, true, 3, false);
            class1.field16 = class87.method749(true, 7, false, 3, true);
            class136.field3279 = class87.method749(true, 8, false, 3, true);
            class10.field177 = class87.method749(true, 9, false, 3, true);
            class47.field1008 = class87.method749(true, 10, false, 3, true);
            class94.field2333 = class87.method749(true, 11, false, 3, true);
            class88.field2215 = class87.method749(true, 12, false, 3, true);
            class110.field2654 = class87.method749(false, 13, true, 3, true);
            class145.field3510 = class87.method749(true, 14, false, 3, false);
            class82.field2010 = class87.method749(true, 15, false, 3, true);
            class52.field1162 = class143.field3443;
            class40.field926 = 20;
            class141.field3377 = 40;
        } else if (class141.field3377 == 40) {
            byte var7 = 0;
            int var8 = var7 + class79.field1969.method343(-1) * 4 / 100;
            int var9 = var8 + class126.field3051.method343(-1) * 4 / 100;
            int var10 = var9 + class77.field1945.method343(-1) * 2 / 100;
            int var11 = var10 + class62.field1553.method343(-1) * 2 / 100;
            int var12 = var11 + class120.field2870.method343(-1) * 6 / 100;
            int var13 = var12 + class59.field1462.method343(-1) * 4 / 100;
            int var14 = var13 + class27.field655.method343(-1) * 2 / 100;
            int var15 = var14 + class1.field16.method343(-1) * 60 / 100;
            int var16 = var15 + class136.field3279.method343(-1) * 2 / 100;
            int var17 = var16 + class10.field177.method343(-1) * 2 / 100;
            int var18 = var17 + class47.field1008.method343(-1) * 2 / 100;
            int var19 = var18 + class94.field2333.method343(-1) * 2 / 100;
            int var20 = var19 + class88.field2215.method343(-1) * 2 / 100;
            int var21 = var20 + class110.field2654.method343(-1) * 2 / 100;
            int var22 = var21 + class145.field3510.method343(-1) * 2 / 100;
            int var23 = var22 + class82.field2010.method343(-1) * 2 / 100;
            if (var23 == 100) {
                class52.field1162 = class103.field2514;
                class141.field3377 = 45;
                class40.field926 = 30;
            } else {
                if (var23 != 0) {
                    class52.field1162 = class51.method408(new class84[] { class82.field2014, class93.method787(22245, var23), class119.field2845 }, -102);
                }
                class40.field926 = 30;
            }
        } else if (class141.field3377 == 45) {
            class47.field1027 = new class136();
            class47.field1027.method1102(65, 128, 9);
            class123.method1020(22050, 1, !class124.field3012);
            class53.field1203 = class77.method659(22050, class92.field2296, true, 0, class115.field2770);
            class146.field3591 = class77.method659(2048, class92.field2296, true, 1, class115.field2770);
            class53.field1203.method438(0, class47.field1027);
            class60.field1490 = new class135();
            class146.field3591.method438(0, class60.field1490);
            class53.method440(class47.field1027, class145.field3510, class120.field2870, 2000, class82.field2010);
            class51.field1129 = new class128(22050, class1.field4);
            class40.field926 = 35;
            class141.field3377 = 50;
            class52.field1162 = class97.field2406;
        } else if (class141.field3377 == 50) {
            int var24 = 0;
            if (class88.field2188 == null) {
                class88.field2188 = class70.method617(1, class95.field2361, class68.field1648, class136.field3279);
            } else {
                var24++;
            }
            if (class95.field2364 == null) {
                class95.field2364 = class70.method617(1, class95.field2361, class131.field3148, class136.field3279);
            } else {
                var24++;
            }
            if (class13.field239 == null) {
                class13.field239 = class70.method617(1, class95.field2361, class129.field3101, class136.field3279);
            } else {
                var24++;
            }
            if (var24 < 3) {
                class52.field1162 = class51.method408(new class84[] { class118.field2817, class93.method787(22245, var24 * 100 / 3), class119.field2845 }, -6);
                class40.field926 = 40;
            } else {
                class40.field926 = 40;
                class52.field1162 = class124.field3002;
                class141.field3377 = 60;
            }
        } else if (class141.field3377 == 60) {
            int var25 = class5.method32(class47.field1008, true, class136.field3279);
            int var26 = class19.method129(6);
            if (var26 > var25) {
                class52.field1162 = class51.method408(new class84[] { class75.field1843, class93.method787(22245, var25 * 100 / var26), class119.field2845 }, 14);
                class40.field926 = 50;
            } else {
                class40.field926 = 50;
                class52.field1162 = class118.field2837;
                class51.method387(75, 5);
                class141.field3377 = 70;
            }
        } else if (class141.field3377 == 70) {
            if (class77.field1945.method1010(1)) {
                class39.method295(-63, class77.field1945);
                class72.method630(class77.field1945, (byte) 17);
                class72.method632((byte) -24, class77.field1945, class1.field16);
                class82.method691(class1.field16, class77.field1945, class124.field3012, (byte) -113);
                class91.method777(class1.field16, class77.field1945, (byte) 74);
                class109.method893((byte) 115, class84.field2108, class88.field2188, class1.field16, class77.field1945);
                class86.method735(256, class79.field1969, class77.field1945, class126.field3051);
                class50.method360((byte) -70, class77.field1945, class1.field16);
                class63.method573(-67, class77.field1945);
                class60.method527(21049, class77.field1945);
                class122.method1002(0, class62.field1553, class1.field16, class136.field3279);
                class51.method394(0, class77.field1945);
                class52.field1162 = class146.field3569;
                class40.field926 = 60;
                class141.field3377 = 80;
            } else {
                class52.field1162 = class51.method408(new class84[] { class19.field406, class93.method787(22245, class77.field1945.method333((byte) 30)), class119.field2845 }, -56);
                class40.field926 = 60;
            }
        } else if (class141.field3377 == 80) {
            int var27 = 0;
            if (class129.field3121 == null) {
                class129.field3121 = class141.method1145(class95.field2361, class136.field3279, 45, class115.field2767);
            } else {
                var27++;
            }
            if (class103.field2503 == null) {
                class103.field2503 = class141.method1145(class95.field2361, class136.field3279, 64, class145.field3491);
            } else {
                var27++;
            }
            if (class117.field2804 == null) {
                class117.field2804 = class115.method945(126, class146.field3581, class136.field3279, class95.field2361);
            } else {
                var27++;
            }
            if (class128.field3088 == null) {
                class128.field3088 = class102.method848(-1, class95.field2361, class136.field3279, class20.field410);
            } else {
                var27++;
            }
            if (class51.field1094 == null) {
                class51.field1094 = class102.method848(-1, class95.field2361, class136.field3279, class117.field2801);
            } else {
                var27++;
            }
            if (class66.field1620 == null) {
                class66.field1620 = class102.method848(-1, class95.field2361, class136.field3279, class111.field2672);
            } else {
                var27++;
            }
            if (class141.field3384 == null) {
                class141.field3384 = class102.method848(-1, class95.field2361, class136.field3279, class27.field659);
            } else {
                var27++;
            }
            if (class97.field2392 == null) {
                class97.field2392 = class102.method848(-1, class95.field2361, class136.field3279, class20.field418);
            } else {
                var27++;
            }
            if (class98.field2415 == null) {
                class98.field2415 = class141.method1145(class95.field2361, class136.field3279, 105, class65.field1589);
            } else {
                var27++;
            }
            if (class89.field2237 == null) {
                class89.field2237 = class102.method848(-1, class95.field2361, class136.field3279, class13.field232);
            } else {
                var27++;
            }
            if (class117.field2788 == null) {
                class117.field2788 = class102.method848(-1, class95.field2361, class136.field3279, class41.field933);
            } else {
                var27++;
            }
            if (class133.field3184 == null) {
                class133.field3184 = class102.method848(-1, class95.field2361, class136.field3279, class16.field351);
            } else {
                var27++;
            }
            if (class115.field2754 == null) {
                class115.field2754 = class115.method945(54, class33.field740, class136.field3279, class95.field2361);
            } else {
                var27++;
            }
            if (class20.field413 == null) {
                class20.field413 = class115.method945(63, class69.field1683, class136.field3279, class95.field2361);
            } else {
                var27++;
            }
            if (var27 < 14) {
                class52.field1162 = class51.method408(new class84[] { class141.field3368, class93.method787(22245, var27 * 100 / 14), class119.field2845 }, 125);
                class40.field926 = 70;
            } else {
                class103.field2503.method922();
                int var28 = (int) (Math.random() * 21.0D) - 10;
                int var29 = (int) (Math.random() * 21.0D) - 10;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 41.0D) - 20;
                for (int var32 = 0; var32 < class128.field3088.length; var32++) {
                    class128.field3088[var32].method929(var28 + var31, var30 + var31, var29 + var31);
                }
                class117.field2804[0].method981(var28 + var31, var30 + var31, var29 + var31);
                class40.field926 = 70;
                class52.field1162 = class134.field3205;
                class141.field3377 = 85;
            }
        } else if (class141.field3377 == 85) {
            int var33 = class125.method1031((byte) -20, class136.field3279);
            int var34 = class133.method1071((byte) -128);
            if (var34 > var33) {
                class52.field1162 = class51.method408(new class84[] { class6.field108, class93.method787(22245, var33 * 100 / var34), class119.field2845 }, 122);
                class40.field926 = 80;
            } else {
                class40.field926 = 80;
                class141.field3377 = 90;
                class52.field1162 = class22.field528;
            }
        } else if (class141.field3377 == 90) {
            if (class10.field177.method1010(1)) {
                class105 var35 = new class105(class10.field177, class136.field3279, 20, 0.8D, class124.field3012 ? 64 : 128);
                class104.method863(var35);
                class104.method866(0.8D);
                class141.field3377 = 110;
                class40.field926 = 90;
                class52.field1162 = class30.field714;
            } else {
                class52.field1162 = class51.method408(new class84[] { class146.field3599, class93.method787(22245, class10.field177.method333((byte) 30)), class119.field2845 }, -49);
                class40.field926 = 90;
            }
        } else if (class141.field3377 == 110) {
            class84.field2099 = new class1();
            class115.field2770.method1198(class84.field2099, false, 10);
            class141.field3377 = 120;
            class52.field1162 = class54.field1247;
            class40.field926 = 94;
        } else if (class141.field3377 == 120) {
            if (class47.field1008.method988((byte) 125, class95.field2361, class122.field2932)) {
                class90 var36 = new class90(class47.field1008.method987(class95.field2361, (byte) -77, class122.field2932));
                class123.method1019(16758643, var36);
                class40.field926 = 96;
                class52.field1162 = class37.field824;
                class141.field3377 = 130;
            } else {
                class52.field1162 = class51.method408(new class84[] { class66.field1639, class6.field110 }, -122);
                class40.field926 = 96;
            }
        } else if (class141.field3377 == 130) {
            if (!class62.field1553.method1010(1)) {
                class52.field1162 = class51.method408(new class84[] { class128.field3091, class93.method787(22245, class62.field1553.method333((byte) 30) * 4 / 5), class119.field2845 }, 101);
                class40.field926 = 100;
            } else if (!class88.field2215.method1010(1)) {
                class52.field1162 = class51.method408(new class84[] { class128.field3091, class93.method787(22245, class88.field2215.method333((byte) 30) / 6 + 80), class119.field2845 }, 112);
                class40.field926 = 100;
            } else if (class110.field2654.method1010(1)) {
                class40.field926 = 100;
                class141.field3377 = 140;
                class52.field1162 = class145.field3486;
            } else {
                class52.field1162 = class51.method408(new class84[] { class128.field3091, class93.method787(22245, class110.field2654.method333((byte) 30) / 20 + 96), class119.field2845 }, 104);
                class40.field926 = 100;
            }
        } else if (class141.field3377 == 140) {
            class51.method387(55, 10);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[I)Le;")
    public final class29 method282(int arg0, int arg1, int[] arg2) {
        field847++;
        long var4 = (long) arg0 ^ 0x200000000L;
        class29 var6 = (class29) this.field837.method959(true, var4);
        if (var6 != null) {
            return var6;
        } else if (arg2 == null || arg2[0] > 0) {
            class9 var7 = class9.method48(this.field845, arg0);
            if (var7 == null) {
                return null;
            }
            class29 var8 = var7.method50();
            this.field837.method958(var4, var8, arg1 + 94);
            if (arg2 != null) {
                arg2[0] -= var8.field699.length;
            }
            if (arg1 != 13) {
                method287((byte) -44);
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
    public static final byte[] method283(boolean arg0, byte arg1, Object arg2) {
        if (arg1 != -96) {
            method285((byte) 53);
        }
        field839++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class49.method352(var3, 0) : var3;
        } else if (arg2 instanceof class41) {
            class41 var4 = (class41) arg2;
            return var4.method310(101);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILj;III)V")
    public static final void method284(int arg0, class62 arg1, int arg2, int arg3, int arg4) {
        field857++;
        if (class40.field925 == arg1 || class20.field429 >= 400) {
            return;
        }
        class84 var5;
        if (arg1.field1534 == 0) {
            var5 = class51.method408(new class84[] { arg1.field1535, class87.method748(arg1.field1517, -4174, class40.field925.field1517), class76.field1919, class57.field1400, class93.method787(22245, arg1.field1517), class118.field2807 }, -5);
        } else {
            var5 = class51.method408(new class84[] { arg1.field1535, class76.field1919, class5.field77, class93.method787(arg0 + 22225, arg1.field1534), class118.field2807 }, 127);
        }
        if (client.field465 == 1) {
            class129.method1051(arg4, 29, class51.method408(new class84[] { class17.field367, class59.field1468, var5 }, 126), 16711680, arg3, arg2, class141.field3398);
            class79.field1971++;
        } else if (!class19.field409) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class16.field332[var6] != null) {
                    class51.field1119++;
                    short var8 = 0;
                    if (class16.field332[var6].method731((byte) 97, class33.field741)) {
                        if (arg1.field1517 > class40.field925.field1517) {
                            var8 = 2000;
                        }
                        if (class40.field925.field1526 != 0 && arg1.field1526 != 0) {
                            if (class40.field925.field1526 == arg1.field1526) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class49.field1040[var6]) {
                        var8 = 2000;
                    }
                    int var9 = 0;
                    if (var6 == 0) {
                        var9 = var8 + 52;
                    }
                    if (var6 == 1) {
                        var9 = var8 + 4;
                    }
                    if (var6 == 2) {
                        var9 = var8 + 20;
                    }
                    if (var6 == 3) {
                        var9 = var8 + 17;
                    }
                    if (var6 == 4) {
                        var9 = var8 + 8;
                    }
                    class129.method1051(arg4, var9, class51.method408(new class84[] { class51.field1093, var5 }, -95), 16711680, arg3, arg2, class16.field332[var6]);
                }
            }
        } else if ((class122.field2957 & 0x8) == 8) {
            class129.method1051(arg4, 47, class51.method408(new class84[] { class5.field72, class59.field1468, var5 }, 121), 16711680, arg3, arg2, class40.field911);
            class62.field1525++;
        }
        if (arg0 != 20) {
            method283(true, (byte) -39, null);
        }
        for (int var7 = 0; var7 < class20.field429; var7++) {
            if (class2.field38[var7] == 48) {
                class46.field994[var7] = class51.method408(new class84[] { class59.field1470, class91.field2280, class51.field1093, var5 }, -1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lsd;Lsd;)V")
    public class38(class122 arg0, class122 arg1) {
        this.field850 = arg1;
        this.field845 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method285(byte arg0) {
        field856 = null;
        field846 = null;
        field842 = null;
        field843 = null;
        field854 = null;
        field838 = null;
        field841 = null;
        field836 = null;
        field834 = null;
        int var1 = -16 / ((arg0 - 46) / 32);
        field848 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[II)Le;")
    public final class29 method286(int arg0, int[] arg1, int arg2) {
        long var4 = (long) arg2 ^ 0x300000000L;
        field855++;
        if (arg0 != -25798) {
            method284(44, null, 96, -113, 68);
        }
        class29 var6 = (class29) this.field837.method959(true, var4);
        if (var6 != null) {
            return var6;
        } else if (arg1 == null || arg1[0] > 0) {
            class114 var7 = class114.method939(this.field850, arg2);
            if (var7 == null) {
                return null;
            }
            class29 var8 = var7.method937();
            this.field837.method958(var4, var8, arg0 + 25710);
            if (arg1 != null) {
                arg1[0] -= var8.field699.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static final void method287(byte arg0) {
        field852++;
        if (class37.field831 == 1 && class83.field2034 >= 715 && class47.field1035 >= 453) {
            class39.field861 = !class39.field861;
            if (class39.field861) {
                class94.method793(80);
            } else {
                class59.method521(class30.field704, 0, class52.field1171, class27.field655, 255, false);
            }
            class74.method637((byte) 106);
        }
        if (class145.field3495 == 5) {
            return;
        }
        class111.method900((byte) -85);
        if (class145.field3495 != 10 || arg0 != -37) {
            return;
        }
        int var1 = class37.field831;
        int var2 = class47.field1035 - 171;
        int var3 = class83.field2034 - 202;
        if (class110.field2666 == 0) {
            byte var12 = 100;
            byte var13 = 120;
            if (var1 == 1 && var12 - 75 <= var3 && var12 + 75 >= var3 && var13 - 20 <= var2 && var13 + 20 >= var2) {
                class110.field2666 = 3;
                class92.field2305 = 0;
            }
            short var14 = 260;
            if (var1 != 1 || var14 - 75 > var3 || var14 + 75 < var3 || var2 < var13 - 20 || var2 > var13 + 20) {
                return;
            }
            class52.field1159 = class20.field414;
            class52.field1179 = class76.field1885;
            class52.field1186 = class76.field1900;
            class92.field2305 = 0;
            class110.field2666 = 2;
            return;
        }
        if (class110.field2666 == 2) {
            byte var4 = 60;
            byte var5 = 100;
            int var15 = var4 + 30;
            if (var1 == 1 && var15 - 15 <= var2 && var15 > var2) {
                class92.field2305 = 0;
            }
            var15 += 15;
            if (var1 == 1 && var15 - 15 <= var2 && var2 < var15) {
                class92.field2305 = 1;
            }
            short var6 = 150;
            var15 += 15;
            if (var1 == 1 && var5 - 75 <= var3 && var3 <= var5 + 75 && var2 >= var6 - 20 && var2 <= var6 + 20) {
                class52.field1166 = class52.field1166.method716(101).method704(-23);
                class6.method36(false, class76.field1902, class76.field1872, class70.field1717);
                class51.method387(79, 20);
                return;
            }
            short var7 = 260;
            if (var1 == 1 && var7 - 75 <= var3 && var7 + 75 >= var3 && var2 >= var6 - 20 && var2 <= var6 + 20) {
                class52.field1166 = class52.field1171;
                class110.field2666 = 0;
                class52.field1180 = class52.field1171;
            }
            while (true) {
                boolean var8;
                label160: do {
                    while (class141.method1148(arg0 ^ 0x7A)) {
                        var8 = false;
                        for (int var9 = 0; var9 < class97.field2393.method718(arg0 + 99); var9++) {
                            if (class33.field735 == class97.field2393.method725(var9, -117)) {
                                var8 = true;
                                break;
                            }
                        }
                        if (class92.field2305 != 0) {
                            continue label160;
                        }
                        if (class60.field1492 == 85 && class52.field1166.method718(arg0 + 146) > 0) {
                            class52.field1166 = class52.field1166.method723(false, class52.field1166.method718(-103) - 1, 0);
                        }
                        if (class60.field1492 == 84 || class60.field1492 == 80) {
                            class92.field2305 = 1;
                        }
                        if (var8 && class52.field1166.method718(111) < 12) {
                            class52.field1166 = class52.field1166.method727(class33.field735, -118);
                        }
                    }
                    return;
                } while (class92.field2305 != 1);
                if (class60.field1492 == 85 && class52.field1180.method718(42) > 0) {
                    class52.field1180 = class52.field1180.method723(false, class52.field1180.method718(arg0 - 59) - 1, 0);
                }
                if (class60.field1492 == 84 || class60.field1492 == 80) {
                    class92.field2305 = 0;
                }
                if (var8 && class52.field1180.method718(arg0 - 68) < 20) {
                    class52.field1180 = class52.field1180.method727(class33.field735, -90);
                }
            }
        }
        if (class110.field2666 != 3) {
            return;
        }
        short var10 = 180;
        short var11 = 150;
        if (var1 == 1 && var10 - 75 <= var3 && var10 + 75 >= var3 && var2 >= var11 - 20 && var11 + 20 >= var2) {
            class110.field2666 = 0;
            return;
        }
    }
}
