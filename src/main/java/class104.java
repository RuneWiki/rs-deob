import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class104 extends class124 {

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "Z")
    public boolean field2590 = true;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    public int field2600 = 0;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
    public int field2602 = -1;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public int field2597 = -1;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
    public static int field2604 = -1;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lla;")
    public static class77 field2588 = new class77(5000);

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "Lrd;")
    private static class117 field2607 = class95.method812("World", (byte) 8);

    @OriginalMember(owner = "client!pc", name = "ub", descriptor = "Lrd;")
    public static class117 field2608 = field2607;

    @OriginalMember(owner = "client!pc", name = "wb", descriptor = "Lrd;")
    public static class117 field2610 = class95.method812(" )2> @whi@", (byte) 8);

    @OriginalMember(owner = "client!pc", name = "vb", descriptor = "La;")
    public static class1 field2609 = new class1();

    @OriginalMember(owner = "client!pc", name = "yb", descriptor = "Lrd;")
    public static class117 field2612 = class95.method812("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", (byte) 8);

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public int field2593;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "J")
    public static long field2606;

    @OriginalMember(owner = "client!pc", name = "xb", descriptor = "[I")
    public static int[] field2611;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)Loa;")
    public static final class96 method859(int arg0, byte arg1) {
        field2599++;
        class96 var2 = (class96) class7.field173.method774((long) arg0, 329);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class18.field449.method526((byte) 125, 3, arg0);
        class96 var4 = new class96();
        if (var3 != null) {
            var4.method820(new class14(var3), (byte) -117);
        }
        class7.field173.method773((long) arg0, (byte) -17, var4);
        int var5 = -43 % ((arg1 + 36) / 57);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILbf;I)V")
    public final void method860(int arg0, class14 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method153(true);
            if (var4 == 0) {
                if (arg2 < 82) {
                    return;
                }
                field2601++;
                return;
            }
            this.method862(var4, arg1, -423, arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
    public static final void method861(boolean arg0) {
        field2603++;
        if (class32.field947 == 0) {
            class90.field2308 = new class30(4, 104, 104, class14.field272);
            for (int var1 = 0; var1 < 4; var1++) {
                class18.field461[var1] = new class52(104, 104);
            }
            class147.field3588 = new class76(512, 512);
            class32.field947 = 20;
            class56.field1560 = class47.field1317;
            class52.field1474 = 5;
        } else if (class32.field947 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 15 + 128;
                int var5 = class129.field3135[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class30.method346(var2, 500, 800, 512, 334);
            class52.field1474 = 10;
            class32.field947 = 30;
            class56.field1560 = class79.field2124;
        } else if (class32.field947 == 30) {
            class97.field2430 = class108.method894(true, 63, 0, true, false);
            class5.field122 = class108.method894(true, 116, 1, true, false);
            class5.field114 = class108.method894(false, 53, 2, true, true);
            class117.field2846 = class108.method894(true, 47, 3, true, false);
            class101.field2503 = class108.method894(true, 123, 4, true, false);
            class74.field2076 = class108.method894(true, 58, 5, true, true);
            class71.field1980 = class108.method894(true, 77, 6, false, true);
            class26.field769 = class108.method894(true, 110, 7, true, false);
            class59.field1678 = class108.method894(true, 108, 8, true, false);
            class100.field2486 = class108.method894(true, 90, 9, true, false);
            class83.field2162 = class108.method894(true, 40, 10, true, false);
            class136.field3273 = class108.method894(true, 77, 11, true, false);
            class96.field2417 = class108.method894(true, 108, 12, true, false);
            class67.field1896 = class108.method894(false, 46, 13, true, true);
            class58.field1624 = class108.method894(true, 95, 14, false, false);
            class108.field2701 = class108.method894(true, 57, 15, true, false);
            class32.field947 = 40;
            class56.field1560 = class4.field107;
            class52.field1474 = 20;
        } else if (class32.field947 == 40) {
            byte var7 = 0;
            int var8 = var7 + class97.field2430.method47(122) * 4 / 100;
            int var9 = var8 + class5.field122.method47(123) * 4 / 100;
            int var10 = var9 + class5.field114.method47(124) * 2 / 100;
            int var11 = var10 + class117.field2846.method47(122) * 2 / 100;
            int var12 = var11 + class101.field2503.method47(122) * 6 / 100;
            int var13 = var12 + class74.field2076.method47(125) * 4 / 100;
            int var14 = var13 + class71.field1980.method47(124) * 2 / 100;
            int var15 = var14 + class26.field769.method47(126) * 60 / 100;
            int var16 = var15 + class59.field1678.method47(123) * 2 / 100;
            int var17 = var16 + class100.field2486.method47(125) * 2 / 100;
            int var18 = var17 + class83.field2162.method47(125) * 2 / 100;
            int var19 = var18 + class136.field3273.method47(122) * 2 / 100;
            int var20 = var19 + class96.field2417.method47(127) * 2 / 100;
            int var21 = var20 + class67.field1896.method47(122) * 2 / 100;
            int var22 = var21 + class58.field1624.method47(123) * 2 / 100;
            int var23 = var22 + class108.field2701.method47(124) * 2 / 100;
            if (var23 == 100) {
                class52.field1474 = 30;
                class32.field947 = 45;
                class56.field1560 = class136.field3269;
            } else {
                if (var23 != 0) {
                    class56.field1560 = class18.method193(new class117[] { class68.field1921, class142.method1131(var23, true), client.field617 }, 94);
                }
                class52.field1474 = 30;
            }
        } else if (class32.field947 == 45) {
            class138.method1121(22050, !class68.field1925, (byte) 39, 2);
            class128 var24 = new class128();
            var24.method1023(-128, 128, 9);
            class61.field1723 = class43.method479(22050, class42.field1216, -1, 0, class4.field104);
            class61.field1723.method227(var24, 75);
            class17.method187(class108.field2701, class58.field1624, class101.field2503, -128, var24);
            class116.field2830 = class43.method479(2048, class42.field1216, -1, 1, class4.field104);
            class61.field1702 = new class106();
            class116.field2830.method227(class61.field1702, 75);
            class79.field2117 = new class74(22050, class85.field2224);
            class52.field1474 = 35;
            class56.field1560 = class18.field456;
            class32.field947 = 50;
        } else if (class32.field947 == 50) {
            int var25 = 0;
            if (class109.field2731 == null) {
                class109.field2731 = class121.method994(class26.field786, class134.field3215, class59.field1678, true);
            } else {
                var25++;
            }
            if (class54.field1533 == null) {
                class54.field1533 = class121.method994(class102.field2579, class134.field3215, class59.field1678, arg0);
            } else {
                var25++;
            }
            if (class137.field3305 == null) {
                class137.field3305 = class121.method994(class118.field2905, class134.field3215, class59.field1678, true);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class56.field1560 = class18.method193(new class117[] { class142.field3377, class142.method1131(var25 * 100 / 3, true), client.field617 }, 84);
                class52.field1474 = 40;
            } else {
                class56.field1560 = class111.field2778;
                class52.field1474 = 40;
                class32.field947 = 60;
            }
        } else if (class32.field947 == 60) {
            int var26 = class39.method458(0, class83.field2162, class59.field1678);
            int var27 = class65.method652(!arg0);
            if (var27 > var26) {
                class56.field1560 = class18.method193(new class117[] { class68.field1903, class142.method1131(var26 * 100 / var27, true), client.field617 }, 41);
                class52.field1474 = 50;
            } else {
                class56.field1560 = class141.field3361;
                class52.field1474 = 50;
                class85.method769(0, 5);
                class32.field947 = 70;
            }
        } else if (class32.field947 == 70) {
            if (class5.field114.method516(19)) {
                class53.method580(17416, class5.field114);
                class37.method450((byte) 84, class5.field114);
                class25.method270(class5.field114, (byte) -23, class26.field769);
                class124.method1003(!arg0, class5.field114, class26.field769, class68.field1925);
                class32.method375(class26.field769, -26, class5.field114);
                class86.method776((byte) -2, class26.field769, class109.field2731, class5.field114, class33.field986);
                class73.method696(class97.field2430, 127, class5.field114, class5.field122);
                class36.method446(class5.field114, 11182, class26.field769);
                class49.method541(-1, class5.field114);
                class107.method883(class5.field114, (byte) 124);
                class87.method779(class117.field2846, 124, class26.field769, class59.field1678);
                class118.method981(class5.field114, false);
                class56.field1560 = class1.field9;
                class32.field947 = 80;
                class52.field1474 = 60;
            } else {
                class56.field1560 = class18.method193(new class117[] { class35.field1043, class142.method1131(class5.field114.method57((byte) 104), true), client.field617 }, 116);
                class52.field1474 = 60;
            }
        } else if (class32.field947 == 80) {
            int var28 = 0;
            if (class116.field2829 == null) {
                class116.field2829 = class102.method856(class134.field3215, -117, class59.field1678, class26.field774);
            } else {
                var28++;
            }
            if (class71.field1983 == null) {
                class71.field1983 = class102.method856(class134.field3215, -80, class59.field1678, class40.field1161);
            } else {
                var28++;
            }
            if (class79.field2113 == null) {
                class79.field2113 = class65.method649(class134.field3215, class59.field1678, true, class117.field2876);
            } else {
                var28++;
            }
            if (class140.field3340 == null) {
                class140.field3340 = class61.method615(-76, class59.field1678, class41.field1194, class134.field3215);
            } else {
                var28++;
            }
            if (class84.field2202 == null) {
                class84.field2202 = class61.method615(-64, class59.field1678, class44.field1239, class134.field3215);
            } else {
                var28++;
            }
            if (class23.field657 == null) {
                class23.field657 = class61.method615(-112, class59.field1678, class1.field28, class134.field3215);
            } else {
                var28++;
            }
            if (class20.field548 == null) {
                class20.field548 = class61.method615(-119, class59.field1678, class6.field133, class134.field3215);
            } else {
                var28++;
            }
            if (class2.field45 == null) {
                class2.field45 = class61.method615(-91, class59.field1678, class60.field1681, class134.field3215);
            } else {
                var28++;
            }
            if (class85.field2206 == null) {
                class85.field2206 = class102.method856(class134.field3215, -25, class59.field1678, class6.field140);
            } else {
                var28++;
            }
            if (class100.field2493 == null) {
                class100.field2493 = class61.method615(-119, class59.field1678, class61.field1726, class134.field3215);
            } else {
                var28++;
            }
            if (class41.field1201 == null) {
                class41.field1201 = class61.method615(-88, class59.field1678, class140.field3341, class134.field3215);
            } else {
                var28++;
            }
            if (class121.field2976 == null) {
                class121.field2976 = class61.method615(-96, class59.field1678, class16.field384, class134.field3215);
            } else {
                var28++;
            }
            if (class85.field2208 == null) {
                class85.field2208 = class65.method649(class134.field3215, class59.field1678, arg0, class71.field1989);
            } else {
                var28++;
            }
            if (class6.field137 == null) {
                class6.field137 = class65.method649(class134.field3215, class59.field1678, true, class118.field2912);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class56.field1560 = class18.method193(new class117[] { class83.field2174, class142.method1131(var28 * 100 / 14, true), client.field617 }, 100);
                class52.field1474 = 70;
            } else {
                class71.field1983.method718();
                int var29 = (int) (Math.random() * 21.0D) - 10;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 41.0D) - 20;
                int var32 = (int) (Math.random() * 21.0D) - 10;
                for (int var33 = 0; var33 < class140.field3340.length; var33++) {
                    class140.field3340[var33].method724(var29 + var31, var31 + var32, var30 + var31);
                }
                class79.field2113[0].method928(var29 + var31, var31 + var32, var30 + var31);
                class52.field1474 = 70;
                class56.field1560 = class85.field2229;
                class32.field947 = 85;
            }
        } else if (class32.field947 == 85) {
            int var34 = class40.method460(class59.field1678, (byte) -46);
            int var35 = client.method237((byte) 85);
            if (var35 > var34) {
                class56.field1560 = class18.method193(new class117[] { class16.field370, class142.method1131(var34 * 100 / var35, true), client.field617 }, 115);
                class52.field1474 = 80;
            } else {
                class56.field1560 = class57.field1593;
                class52.field1474 = 80;
                class32.field947 = 90;
            }
        } else if (class32.field947 == 90) {
            if (class100.field2486.method516(108)) {
                class137 var36 = new class137(class100.field2486, class59.field1678, 20, 0.8D, class68.field1925 ? 64 : 128);
                class129.method1054(var36);
                class129.method1063(0.8D);
                class56.field1560 = class72.field2019;
                class52.field1474 = 90;
                class32.field947 = 110;
            } else {
                class56.field1560 = class18.method193(new class117[] { class148.field3640, class142.method1131(class100.field2486.method57((byte) 104), true), client.field617 }, 51);
                class52.field1474 = 90;
            }
        } else if (class32.field947 == 110) {
            class2.field42 = new class80();
            class4.field104.method66(10, class2.field42, true);
            class56.field1560 = class134.field3197;
            class52.field1474 = 94;
            class32.field947 = 120;
        } else if (class32.field947 != 120) {
            if (!arg0) {
                method859(-42, (byte) 42);
            }
            if (class32.field947 == 130) {
                if (!class117.field2846.method516(122)) {
                    class56.field1560 = class18.method193(new class117[] { class111.field2773, class142.method1131(class117.field2846.method57((byte) 104) * 4 / 5, arg0), client.field617 }, 97);
                    class52.field1474 = 100;
                } else if (!class96.field2417.method516(58)) {
                    class56.field1560 = class18.method193(new class117[] { class111.field2773, class142.method1131(class96.field2417.method57((byte) 104) / 6 + 80, true), client.field617 }, 117);
                    class52.field1474 = 100;
                } else if (class67.field1896.method516(56)) {
                    class52.field1474 = 100;
                    class56.field1560 = class133.field3175;
                    class32.field947 = 140;
                } else {
                    class56.field1560 = class18.method193(new class117[] { class111.field2773, class142.method1131(class67.field1896.method57((byte) 104) / 20 + 96, true), client.field617 }, 44);
                    class52.field1474 = 100;
                }
            } else if (class32.field947 == 140) {
                class85.method769(0, 10);
            }
        } else if (class83.field2162.method515(-16594, class116.field2831, class134.field3215)) {
            class13 var37 = new class13(class83.field2162.method520(class134.field3215, false, class116.field2831));
            class46.method501(var37, 0);
            class56.field1560 = class62.field1752;
            class52.field1474 = 96;
            class32.field947 = 130;
        } else {
            class56.field1560 = class18.method193(new class117[] { class85.field2204, client.field618 }, 113);
            class52.field1474 = 96;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILbf;II)V")
    private final void method862(int arg0, class14 arg1, int arg2, int arg3) {
        if (arg2 != -423) {
            method861(false);
        }
        field2587++;
        if (arg0 == 1) {
            this.field2600 = arg1.method122(17260);
        } else if (arg0 == 2) {
            this.field2602 = arg1.method153(true);
        } else if (arg0 == 5) {
            this.field2590 = false;
        } else if (arg0 == 7) {
            this.field2597 = arg1.method122(17260);
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lp;IBI)V")
    public static final void method863(class101 arg0, int arg1, byte arg2, int arg3) {
        field2586++;
        if ((arg3 & 0x200) != 0) {
            arg0.field732 = field2588.method167(true);
            int var4 = field2588.method125(arg2 ^ 0x6F5A);
            arg0.field725 = var4 >> 16;
            if (arg0.field732 == 65535) {
                arg0.field732 = -1;
            }
            arg0.field731 = 0;
            arg0.field745 = (var4 & 0xFFFF) + class85.field2236;
            arg0.field746 = 0;
            if (arg0.field745 > class85.field2236) {
                arg0.field746 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            int var5 = field2588.method168(255);
            int var6 = field2588.method144((byte) 73);
            arg0.method264(20663, var5, class85.field2236, var6);
            arg0.field702 = class85.field2236 + 300;
            arg0.field713 = field2588.method168(255);
            arg0.field735 = field2588.method156(255);
        }
        if ((arg3 & 0x400) != 0) {
            arg0.field743 = field2588.method153(true);
            arg0.field686 = field2588.method144((byte) 120);
            arg0.field724 = field2588.method168(arg2 + 348);
            arg0.field711 = field2588.method168(255);
            arg0.field729 = field2588.method167(true) + class85.field2236;
            arg0.field730 = field2588.method167(true) + class85.field2236;
            arg0.field714 = field2588.method168(255);
            arg0.field694 = 0;
            arg0.field737 = 1;
        }
        if ((arg3 & 0x4) != 0) {
            arg0.field696 = field2588.method132(65280);
            if (arg0.field696 == 65535) {
                arg0.field696 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg0.field709 = field2588.method127(true);
            arg0.field742 = field2588.method132(65280);
        }
        if ((arg3 & 0x2) != 0) {
            int var7 = field2588.method138((byte) 82);
            int var8 = field2588.method168(arg2 ^ 0xFFFFFF5C);
            int var9 = field2588.method153(true);
            int var10 = field2588.field314;
            if (arg0.field2528 != null && arg0.field2502 != null) {
                long var11 = arg0.field2528.method966(41);
                boolean var13 = false;
                if (var8 <= 1) {
                    for (int var14 = 0; var14 < class109.field2739; var14++) {
                        if (class109.field2720[var14] == var11) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && class121.field2960 == 0) {
                    class57.field1586.field314 = 0;
                    field2588.method137(var9, (byte) 21, class57.field1586.field326, 0);
                    class57.field1586.field314 = 0;
                    class117 var15 = class14.method128(class57.field1586, -32079).method970(-5812);
                    arg0.field706 = var15.method976(81);
                    arg0.field720 = var7 >> 8;
                    arg0.field747 = var7 & 0xFF;
                    arg0.field683 = 150;
                    if (var8 == 2 || var8 == 3) {
                        class52.method572(class18.method193(new class117[] { class39.field1134, arg0.field2528 }, 63), -1, 1, var15);
                    } else if (var8 == 1) {
                        class52.method572(class18.method193(new class117[] { class61.field1698, arg0.field2528 }, 42), -1, 1, var15);
                    } else {
                        class52.method572(arg0.field2528, -1, 2, var15);
                    }
                }
            }
            field2588.field314 = var10 + var9;
        }
        if (arg2 != -93) {
            return;
        }
        if ((arg3 & 0x8) != 0) {
            int var16 = field2588.method127(true);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = field2588.method144((byte) -73);
            class61.method616(var16, var17, -126, arg0);
        }
        if ((arg3 & 0x80) != 0) {
            int var18 = field2588.method168(arg2 ^ 0xFFFFFF5C);
            byte[] var19 = new byte[var18];
            class14 var20 = new class14(var19);
            field2588.method139(255, var19, var18, 0);
            class17.field435[arg1] = var20;
            arg0.method852((byte) 74, var20);
        }
        if ((arg3 & 0x20) != 0) {
            arg0.field706 = field2588.method171((byte) 110);
            if (arg0.field706.method953(0, 2) == 126) {
                arg0.field706 = arg0.field706.method949(1, 0);
                class52.method572(arg0.field2528, -1, 2, arg0.field706);
            } else if (class144.field3516 == arg0) {
                class52.method572(arg0.field2528, -1, 2, arg0.field706);
            }
            arg0.field683 = 150;
            arg0.field747 = 0;
            arg0.field720 = 0;
        }
        if ((arg3 & 0x1) == 0) {
            return;
        }
        int var21 = field2588.method168(arg2 ^ 0xFFFFFF5C);
        int var22 = field2588.method153(true);
        arg0.method264(20663, var21, class85.field2236, var22);
        arg0.field702 = class85.field2236 + 300;
        arg0.field713 = field2588.method168(255);
        arg0.field735 = field2588.method168(255);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public static void method864(byte arg0) {
        field2610 = null;
        field2608 = null;
        field2612 = null;
        field2611 = null;
        field2607 = null;
        int var1 = 39 % ((arg0 - 21) / 48);
        field2588 = null;
        field2609 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    private final void method865(int arg0, int arg1) {
        field2594++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        int var15 = -55 % ((-arg0 - 53) / 48);
        double var16 = 0.0D;
        double var18 = (var9 + var11) / 2.0D;
        this.field2605 = (int) (var18 * 256.0D);
        if (var9 != var11) {
            if (var18 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var18 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var16 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var16 = (var7 - var3) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var16 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        if (this.field2605 < 0) {
            this.field2605 = 0;
        } else if (this.field2605 > 255) {
            this.field2605 = 255;
        }
        this.field2589 = (int) (var13 * 256.0D);
        double var20 = var16 / 6.0D;
        if (this.field2589 < 0) {
            this.field2589 = 0;
        } else if (this.field2589 > 255) {
            this.field2589 = 255;
        }
        this.field2596 = (int) (var20 * 256.0D);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
    public final void method866(byte arg0) {
        field2592++;
        if (this.field2597 != -1) {
            this.method865(122, this.field2597);
            this.field2598 = this.field2596;
            this.field2595 = this.field2589;
            this.field2593 = this.field2605;
        }
        this.method865(-103, this.field2600);
        if (arg0 < 82) {
            this.field2596 = -21;
        }
    }
}
