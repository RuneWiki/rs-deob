import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[I")
    public static int[] field94 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lrd;")
    public static class114 field95 = class84.method656(" x ", (byte) 124);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lrd;")
    private static class114 field89 = class84.method656("scroll:", (byte) 120);

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lrd;")
    public static class114 field92 = class84.method656("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 123);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lrd;")
    public static class114 field88 = field89;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field102 = 1;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lrd;")
    private static class114 field97 = class84.method656("Please reload this page)3", (byte) 122);

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lrd;")
    public static class114 field93 = field97;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Ltd;")
    public static class126 field103;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[[[I")
    public static int[][][] field90;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static final void method61(int arg0) {
        field98++;
        if (class118.field2757 != 2) {
            return;
        }
        class21.method136((class123.field2898 - class65.field1408 << 7) + class123.field2897, class80.field1810 * 2, (class46.field955 - class72.field1611 << 7) + class11.field195, 128);
        if (class21.field380 > -1 && class20.field370 % 20 < 10) {
            class22.field424[0].method400(class21.field380 - 12, class38.field802 + -28);
        }
        if (arg0 >= -30) {
            field104 = -90;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static void method62(int arg0) {
        field97 = null;
        field94 = null;
        field88 = null;
        field93 = null;
        field103 = null;
        field89 = null;
        field90 = null;
        field92 = null;
        if (arg0 != -468) {
            field92 = null;
        }
        field95 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static final void method63(byte arg0) {
        field101++;
        if (class20.field363 == 0) {
            class101.field2325 = new class129(4, 104, 104, class124.field2958);
            for (int var1 = 0; var1 < 4; var1++) {
                class90.field2132[var1] = new class89(104, 104);
            }
            class102.field2389 = new class54(512, 512);
            class42.field858 = class34.field677;
            class114.field2668 = 5;
            class20.field363 = 20;
        } else if (class20.field363 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = class134.field3272[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class129.method1011(var2, 500, 800, 512, 334);
            class20.field363 = 30;
            class114.field2668 = 10;
            class42.field858 = class16.field325;
        } else if (class20.field363 == 30) {
            class112.field2617 = class9.method71(true, 0, 64, false, true);
            class48.field989 = class9.method71(true, 1, 126, false, true);
            class117.field2738 = class9.method71(true, 2, 11, true, false);
            class47.field963 = class9.method71(true, 3, 19, false, true);
            class12.field280 = class9.method71(true, 4, arg0 ^ 0xFFFFFFA9, false, true);
            class100.field2298 = class9.method71(true, 5, -127, true, true);
            class137.field3318 = class9.method71(false, 6, 61, true, true);
            class116.field2699 = class9.method71(true, 7, 13, false, true);
            class104.field2423 = class9.method71(true, 8, -121, false, true);
            class31.field636 = class9.method71(true, 9, arg0 ^ 0x51, false, true);
            class128.field3074 = class9.method71(true, 10, arg0 ^ 0xFFFFFFF6, false, true);
            class55.field1162 = class9.method71(true, 11, 109, false, true);
            class26.field537 = class9.method71(true, 12, arg0 - 63, false, true);
            class80.field1811 = class9.method71(true, 13, arg0 - 44, true, false);
            class42.field858 = class5.field62;
            class114.field2668 = 20;
            class20.field363 = 40;
        } else if (class20.field363 == 40) {
            byte var7 = 0;
            int var8 = var7 + class112.field2617.method589(0) * 5 / 100;
            int var9 = var8 + class48.field989.method589(0) * 5 / 100;
            int var10 = var9 + class117.field2738.method589(0) * 5 / 100;
            int var11 = var10 + class47.field963.method589(0) * 5 / 100;
            int var12 = var11 + class12.field280.method589(0) * 5 / 100;
            int var13 = var12 + class100.field2298.method589(arg0 + 64) * 5 / 100;
            int var14 = var13 + class137.field3318.method589(0) * 5 / 100;
            int var15 = var14 + class116.field2699.method589(0) * 40 / 100;
            int var16 = var15 + class104.field2423.method589(0) * 5 / 100;
            int var17 = var16 + class31.field636.method589(0) * 3 / 100;
            int var18 = var17 + class128.field3074.method589(arg0 + 64) * 5 / 100;
            int var19 = var18 + class55.field1162.method589(0) * 5 / 100;
            int var20 = var19 + class26.field537.method589(0) * 5 / 100;
            int var21 = var20 + class80.field1811.method589(0) * 2 / 100;
            if (var21 == 100) {
                class20.field363 = 45;
                class114.field2668 = 30;
                class42.field858 = class47.field976;
            } else {
                if (var21 != 0) {
                    class42.field858 = class101.method786((byte) 127, new class114[] { class74.field1673, class14.method113(var21, -31766), class124.field2920 });
                }
                class114.field2668 = 30;
            }
        } else if (arg0 == -64) {
            if (class20.field363 == 45) {
                class38.method272(0, class36.field764, !class64.field1370, false);
                class29.field614 = class21.method141(false, 22050, class114.field2678, class36.field764, 91);
                class80.field1819 = new class49(22050, class52.field1106);
                class42.field858 = class140.field3333;
                class114.field2668 = 35;
                class20.field363 = 50;
            } else if (class20.field363 == 50) {
                int var22 = 0;
                if (class29.field609 == null) {
                    class29.field609 = class34.method245(class104.field2423, (byte) 126, class72.field1610, class60.field1253);
                } else {
                    var22++;
                }
                if (class5.field54 == null) {
                    class5.field54 = class34.method245(class104.field2423, (byte) 126, class72.field1610, client.field401);
                } else {
                    var22++;
                }
                if (client.field399 == null) {
                    client.field399 = class34.method245(class104.field2423, (byte) 126, class72.field1610, class26.field517);
                } else {
                    var22++;
                }
                if (var22 < 3) {
                    class42.field858 = class101.method786((byte) 127, new class114[] { class75.field1733, class14.method113(var22 * 100 / 3, -31766), class124.field2920 });
                    class114.field2668 = 40;
                } else {
                    class114.field2668 = 40;
                    class42.field858 = class42.field876;
                    class20.field363 = 60;
                }
            } else if (class20.field363 == 60) {
                int var23 = class89.method671(class104.field2423, class128.field3074, arg0 ^ 0xFFFFFFC0);
                int var24 = class62.method503(-24556);
                if (var23 < var24) {
                    class42.field858 = class101.method786((byte) 126, new class114[] { class137.field3313, class14.method113(var23 * 100 / var24, -31766), class124.field2920 });
                    class114.field2668 = 50;
                } else {
                    class114.field2668 = 50;
                    class42.field858 = class110.field2543;
                    class12.method101(false, 5);
                    class20.field363 = 70;
                }
            } else if (class20.field363 == 70) {
                if (class117.field2738.method755((byte) 20)) {
                    class102.method788(class117.field2738, (byte) -97);
                    class25.method188(class117.field2738, 73);
                    class84.method651(class117.field2738, class116.field2699, (byte) 102);
                    class142.method1136(class117.field2738, 1176, class64.field1370, class116.field2699);
                    class122.method948(class116.field2699, -29075, class117.field2738);
                    class70.method555(class29.field609, class117.field2738, 64, class135.field3292, class116.field2699);
                    class142.method1137(class112.field2617, (byte) -96, class117.field2738, class48.field989);
                    class126.method974(class116.field2699, class117.field2738, 62);
                    class122.method952(-123, class117.field2738);
                    class3.method11(class117.field2738, arg0 - 64);
                    class32.method233(class104.field2423, class116.field2699, arg0 ^ 0xFFFFFFC0, class47.field963);
                    class99.method750(class117.field2738, arg0 ^ 0xFFFFFFEB);
                    class20.field363 = 80;
                    class114.field2668 = 60;
                    class42.field858 = class120.field2788;
                } else {
                    class42.field858 = class101.method786((byte) 126, new class114[] { class60.field1236, class14.method113(class117.field2738.method600(false), -31766), class124.field2920 });
                    class114.field2668 = 60;
                }
            } else if (class20.field363 == 80) {
                int var25 = 0;
                if (class51.field1066 == null) {
                    class51.field1066 = class127.method985(class104.field2423, class24.field455, class72.field1610, true);
                } else {
                    var25++;
                }
                if (class66.field1428 == null) {
                    class66.field1428 = class127.method985(class104.field2423, class130.field3152, class72.field1610, true);
                } else {
                    var25++;
                }
                if (class70.field1538 == null) {
                    class70.field1538 = class106.method811(class72.field1610, class20.field368, class104.field2423, -107);
                } else {
                    var25++;
                }
                if (class125.field2981 == null) {
                    class125.field2981 = class55.method408(class104.field2423, class103.field2399, class72.field1610, (byte) 125);
                } else {
                    var25++;
                }
                if (class135.field3294 == null) {
                    class135.field3294 = class55.method408(class104.field2423, class89.field2001, class72.field1610, (byte) 82);
                } else {
                    var25++;
                }
                if (class18.field345 == null) {
                    class18.field345 = class55.method408(class104.field2423, class1.field10, class72.field1610, (byte) 68);
                } else {
                    var25++;
                }
                if (class66.field1424 == null) {
                    class66.field1424 = class55.method408(class104.field2423, class46.field949, class72.field1610, (byte) 112);
                } else {
                    var25++;
                }
                if (class22.field424 == null) {
                    class22.field424 = class55.method408(class104.field2423, class56.field1184, class72.field1610, (byte) 85);
                } else {
                    var25++;
                }
                if (class114.field2636 == null) {
                    class114.field2636 = class127.method985(class104.field2423, class69.field1523, class72.field1610, true);
                } else {
                    var25++;
                }
                if (class106.field2440 == null) {
                    class106.field2440 = class55.method408(class104.field2423, class22.field444, class72.field1610, (byte) 86);
                } else {
                    var25++;
                }
                if (class112.field2628 == null) {
                    class112.field2628 = class55.method408(class104.field2423, class73.field1650, class72.field1610, (byte) 52);
                } else {
                    var25++;
                }
                if (class124.field2960 == null) {
                    class124.field2960 = class55.method408(class104.field2423, class9.field139, class72.field1610, (byte) 90);
                } else {
                    var25++;
                }
                if (class39.field819 == null) {
                    class39.field819 = class106.method811(class72.field1610, class39.field823, class104.field2423, -127);
                } else {
                    var25++;
                }
                if (class109.field2528 == null) {
                    class109.field2528 = class106.method811(class72.field1610, class131.field3175, class104.field2423, -108);
                } else {
                    var25++;
                }
                if (var25 < 14) {
                    class42.field858 = class101.method786((byte) 127, new class114[] { class111.field2578, class14.method113(var25 * 100 / 14, -31766), class124.field2920 });
                    class114.field2668 = 70;
                } else {
                    class66.field1428.method391();
                    int var26 = (int) (Math.random() * 21.0D) - 10;
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    int var28 = (int) (Math.random() * 41.0D) - 20;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    for (int var30 = 0; var30 < class125.field2981.length; var30++) {
                        class125.field2981[var30].method402(var27 + var28, var26 + var28, var29 + var28);
                    }
                    class70.field1538[0].method720(var27 + var28, var26 - -var28, var28 + var29);
                    class114.field2668 = 70;
                    class42.field858 = class52.field1069;
                    class20.field363 = 85;
                }
            } else if (class20.field363 == 85) {
                int var31 = class135.method1109((byte) -120, class104.field2423);
                int var32 = class72.method588(-9459);
                if (var32 > var31) {
                    class42.field858 = class101.method786((byte) 125, new class114[] { class96.field2211, class14.method113(var31 * 100 / var32, arg0 ^ 0x7C2A), class124.field2920 });
                    class114.field2668 = 80;
                } else {
                    class42.field858 = class49.field1031;
                    class20.field363 = 90;
                    class114.field2668 = 80;
                }
            } else if (class20.field363 == 90) {
                if (class31.field636.method755((byte) 19)) {
                    class144 var33 = new class144(class31.field636, class104.field2423, 20, 0.8D, class64.field1370 ? 64 : 128);
                    class134.method1088(var33);
                    class134.method1102(0.8D);
                    class42.field858 = class49.field1032;
                    class114.field2668 = 90;
                    class20.field363 = 110;
                } else {
                    class42.field858 = class101.method786((byte) 127, new class114[] { class131.field3156, class14.method113(class31.field636.method600(false), -31766), class124.field2920 });
                    class114.field2668 = 90;
                }
            } else if (class20.field363 == 110) {
                class49.field1028 = new class28();
                class36.field764.method309(10, (byte) -113, class49.field1028);
                class114.field2668 = 94;
                class20.field363 = 120;
                class42.field858 = class124.field2963;
            } else if (class20.field363 == 120) {
                if (class128.field3074.method775((byte) -95, class52.field1117, class72.field1610)) {
                    class70 var34 = new class70(class128.field3074.method765((byte) 110, class52.field1117, class72.field1610));
                    class96.method733(1, var34);
                    class20.field363 = 130;
                    class114.field2668 = 96;
                    class42.field858 = class72.field1606;
                } else {
                    class42.field858 = class101.method786((byte) 126, new class114[] { class142.field3399, class5.field65 });
                    class114.field2668 = 96;
                }
            } else if (class20.field363 == 130) {
                if (!class47.field963.method755((byte) 77)) {
                    class42.field858 = class101.method786((byte) 127, new class114[] { class75.field1745, class14.method113(class47.field963.method600(false) * 4 / 5, -31766), class124.field2920 });
                    class114.field2668 = 100;
                } else if (!class26.field537.method755((byte) 89)) {
                    class42.field858 = class101.method786((byte) 127, new class114[] { class75.field1745, class14.method113(class26.field537.method600(false) / 6 + 80, -31766), class124.field2920 });
                    class114.field2668 = 100;
                } else if (class80.field1811.method755((byte) 88)) {
                    class114.field2668 = 100;
                    class20.field363 = 140;
                    class42.field858 = class128.field3066;
                } else {
                    class42.field858 = class101.method786((byte) 125, new class114[] { class75.field1745, class14.method113(class80.field1811.method600(false) / 20 + 96, -31766), class124.field2920 });
                    class114.field2668 = 100;
                }
            } else if (class20.field363 == 140) {
                class12.method101(false, 10);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static final void method64(byte arg0) {
        field91++;
        if (arg0 != 36) {
            method63((byte) -30);
        }
        if (client.field417 != 1) {
            return;
        }
        if (class142.field3392 >= 6 && class142.field3392 <= 106 && class118.field2758 >= 467 && class118.field2758 <= 499) {
            class140.field3335 = true;
            class114.field2639++;
            class24.field466 = true;
            class12.field253 = (class12.field253 + 1) % 4;
            class61.field1303.method1054(arg0 - 28, 4);
            class61.field1303.method478((byte) 125, class12.field253);
            class61.field1303.method478((byte) -97, class130.field3149);
            class61.field1303.method478((byte) -98, class99.field2255);
        }
        if (class142.field3392 >= 135 && class142.field3392 <= 235 && class118.field2758 >= 467 && class118.field2758 <= 499) {
            class140.field3335 = true;
            class130.field3149 = (class130.field3149 + 1) % 3;
            class114.field2639++;
            class24.field466 = true;
            class61.field1303.method1054(8, 4);
            class61.field1303.method478((byte) 90, class12.field253);
            class61.field1303.method478((byte) -31, class130.field3149);
            class61.field1303.method478((byte) -122, class99.field2255);
        }
        if (class142.field3392 >= 273 && class142.field3392 <= 373 && class118.field2758 >= 467 && class118.field2758 <= 499) {
            class114.field2639++;
            class99.field2255 = (class99.field2255 + 1) % 3;
            class140.field3335 = true;
            class24.field466 = true;
            class61.field1303.method1054(8, 4);
            class61.field1303.method478((byte) 105, class12.field253);
            class61.field1303.method478((byte) 99, class130.field3149);
            class61.field1303.method478((byte) -72, class99.field2255);
        }
        if (class142.field3392 < 412 || class142.field3392 > 512 || class118.field2758 < 467 || class118.field2758 > 499) {
            return;
        }
        if (class117.field2747 == -1) {
            class127.method981((byte) 99);
            if (class128.field3057 != -1) {
                class20.field364 = false;
                class121.field2832 = class117.field2747 = class128.field3057;
                class72.field1617 = class72.field1610;
                return;
            }
            return;
        }
        class86.method660(class72.field1610, class9.field133, true, 0);
        if (class49.field1034 != null) {
            class86.method660(class72.field1610, class49.field1034, true, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lrd;ILid;)I")
    public static final int method65(class114 arg0, int arg1, class60 arg2) {
        field99++;
        int var3 = arg2.field1227;
        arg2.method477(arg0.field2660, (byte) 36);
        arg2.field1227 += class12.field281.method562(0, arg2.field1248, arg2.field1227, 117, arg0.field2676, arg0.field2660);
        int var4 = 85 % ((64 - arg1) / 60);
        return arg2.field1227 - var3;
    }
}
