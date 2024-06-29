import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lwd;")
    public static class150 field2291 = class2.method9(true, ":0");

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[I")
    public static int[] field2297 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Li;")
    public static class56 field2294 = new class56(128);

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Lwd;")
    private static class150 field2308 = class2.method9(true, " seconds)3");

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
    public static int[] field2309 = new int[32768];

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Z")
    public static boolean field2310 = false;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "[I")
    public static int[] field2312 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Lwd;")
    public static class150 field2311 = field2308;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lqd;")
    public static class114 field2298;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lhb;")
    public static class51 field2300;

    @OriginalMember(owner = "client!od", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field2306++;
    }

    @OriginalMember(owner = "client!od", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class5.field92 != null) {
            class30.field900 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class96.field2214.length > var2) {
                var3 = class96.field2214[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class103.method697(arg0, -257);
            }
            if (class24.field688 >= 0 && var3 >= 0) {
                class150.field3685[class24.field688] = var3;
                class24.field688 = class24.field688 + 1 & 0x7F;
                if (class24.field688 == class134.field3164) {
                    class24.field688 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class47.field1259 + 1 & 0x7F;
                if (class124.field2873 != var5) {
                    class41.field1073[class47.field1259] = var3;
                    class113.field2635[class47.field1259] = var4;
                    class47.field1259 = var5;
                }
            }
        }
        arg0.consume();
        field2296++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static final void method688(int arg0) {
        field2288++;
        if (class125.field2900 < 2 && class130.field3060 == 0 && !class90.field2095) {
            return;
        }
        class150 var1;
        if (class130.field3060 == 1 && class125.field2900 < 2) {
            var1 = class111.method786((byte) -109, new class150[] { class9.field214, class50.field1369, class78.field1923, class142.field3435 });
        } else if (class90.field2095 && class125.field2900 < 2) {
            var1 = class111.method786((byte) -114, new class150[] { class80.field1937, class50.field1369, class68.field1727, class142.field3435 });
        } else {
            var1 = class2.field50[class125.field2900 - 1];
        }
        if (class125.field2900 > 2) {
            var1 = class111.method786((byte) -106, new class150[] { var1, class41.field1069, class29.method239(1000, class125.field2900 - 2), class136.field3198 });
        }
        class134.field3150.method1035(var1, 4, 15, 16777215, true, class11.field280 / 1000);
        if (arg0 != 16836) {
            method690(-45);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BZZ)I")
    public static final int method689(byte arg0, boolean arg1, boolean arg2) {
        field2301++;
        if (arg0 != 83) {
            field2311 = null;
        }
        int var3 = 0;
        if (arg2) {
            var3 += class63.field1622 + class32.field932;
        }
        if (arg1) {
            var3 += class66.field1684 + class96.field2216;
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class5.field92 != null) {
            class30.field900 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class96.field2214.length) {
                var3 = class96.field2214[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class24.field688 >= 0 && var3 >= 0) {
                class150.field3685[class24.field688] = ~var3;
                class24.field688 = class24.field688 + 1 & 0x7F;
                if (class24.field688 == class134.field3164) {
                    class24.field688 = -1;
                }
            }
        }
        arg0.consume();
        field2295++;
    }

    @OriginalMember(owner = "client!od", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2302++;
    }

    @OriginalMember(owner = "client!od", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class5.field92 != null) {
            class24.field688 = -1;
        }
        field2305++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method690(int arg0) {
        field2299++;
        if (class3.field67 == 0) {
            class111.field2548 = new class123(4, 104, 104, class121.field2789);
            for (int var1 = 0; var1 < 4; var1++) {
                class18.field477[var1] = new class88(104, 104);
            }
            field2300 = new class51(512, 512);
            class94.field2181 = class131.field3095;
            class46.field1234 = 5;
            class3.field67 = 20;
        } else if (class3.field67 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class60.field1523[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class123.method914(var2, 500, 800, 512, 334);
            class46.field1234 = 10;
            class3.field67 = 30;
            class94.field2181 = class61.field1593;
        } else if (class3.field67 == 30) {
            class131.field3099 = class149.method1167(true, 113, 0, true, false);
            class111.field2572 = class149.method1167(true, 122, 1, true, false);
            class125.field2899 = class149.method1167(false, 126, 2, true, true);
            class127.field2994 = class149.method1167(true, 119, 3, true, false);
            class107.field2437 = class149.method1167(true, 123, 4, true, false);
            class9.field201 = class149.method1167(true, arg0 - 20, 5, true, true);
            class30.field912 = class149.method1167(true, 115, 6, false, true);
            class35.field979 = class149.method1167(true, 106, 7, true, false);
            class66.field1677 = class149.method1167(true, 124, 8, true, false);
            class141.field3329 = class149.method1167(true, 115, 9, true, false);
            class43.field1202 = class149.method1167(true, 106, 10, true, false);
            class40.field1068 = class149.method1167(true, arg0 ^ 0xE0, 11, true, false);
            class4.field87 = class149.method1167(true, arg0 ^ 0xE7, 12, true, false);
            class148.field3602 = class149.method1167(false, 126, 13, true, true);
            class9.field213 = class149.method1167(true, 125, 14, false, false);
            class16.field415 = class149.method1167(true, 109, 15, true, false);
            class46.field1234 = 20;
            class3.field67 = 40;
            class94.field2181 = class127.field2989;
        } else if (class3.field67 == 40) {
            byte var7 = 0;
            int var8 = var7 + class131.field3099.method149(12161) * 4 / 100;
            int var9 = var8 + class111.field2572.method149(arg0 + 12022) * 4 / 100;
            int var10 = var9 + class125.field2899.method149(arg0 + 12022) * 2 / 100;
            int var11 = var10 + class127.field2994.method149(12161) * 2 / 100;
            int var12 = var11 + class107.field2437.method149(12161) * 6 / 100;
            int var13 = var12 + class9.field201.method149(arg0 + 12022) * 4 / 100;
            int var14 = var13 + class30.field912.method149(12161) * 2 / 100;
            int var15 = var14 + class35.field979.method149(12161) * 60 / 100;
            int var16 = var15 + class66.field1677.method149(12161) * 2 / 100;
            int var17 = var16 + class141.field3329.method149(arg0 ^ 0x2F0A) * 2 / 100;
            int var18 = var17 + class43.field1202.method149(12161) * 2 / 100;
            int var19 = var18 + class40.field1068.method149(12161) * 2 / 100;
            int var20 = var19 + class4.field87.method149(12161) * 2 / 100;
            int var21 = var20 + class148.field3602.method149(12161) * 2 / 100;
            int var22 = var21 + class9.field213.method149(12161) * 2 / 100;
            int var23 = var22 + class16.field415.method149(12161) * 2 / 100;
            if (var23 == 100) {
                class46.field1234 = 30;
                class94.field2181 = class42.field1153;
                class3.field67 = 45;
            } else {
                if (var23 != 0) {
                    class94.field2181 = class111.method786((byte) 113, new class150[] { class148.field3634, class29.method239(arg0 + 861, var23), class106.field2391 });
                }
                class46.field1234 = 30;
            }
        } else if (class3.field67 == 45) {
            class42.method301(!class20.field517, arg0 - 16, 22050, 2);
            class108 var24 = new class108();
            var24.method755(9, 128, (byte) -75);
            class130.field3069 = class91.method646(arg0 ^ 0xF5, 22050, class10.field243, 0, class142.field3439);
            class130.field3069.method373(var24, (byte) -120);
            class73.method551(var24, class16.field415, class9.field213, class107.field2437, -906);
            class1.field15 = class91.method646(123, 2048, class10.field243, 1, class142.field3439);
            class146.field3541 = new class93();
            class1.field15.method373(class146.field3541, (byte) -120);
            class38.field1038 = new class32(22050, class37.field1007);
            class94.field2181 = class133.field3134;
            class3.field67 = 50;
            class46.field1234 = 35;
        } else if (class3.field67 == 50) {
            int var25 = 0;
            if (class105.field2374 == null) {
                class105.field2374 = class46.method348(class66.field1677, class43.field1167, (byte) 124, class143.field3457);
            } else {
                var25++;
            }
            if (class22.field646 == null) {
                class22.field646 = class46.method348(class66.field1677, class43.field1167, (byte) 101, class68.field1726);
            } else {
                var25++;
            }
            if (class134.field3150 == null) {
                class134.field3150 = class46.method348(class66.field1677, class43.field1167, (byte) 116, class72.field1791);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class94.field2181 = class111.method786((byte) -127, new class150[] { class86.field2031, class29.method239(1000, var25 * 100 / 3), class106.field2391 });
                class46.field1234 = 40;
            } else {
                class94.field2181 = class118.field2699;
                class46.field1234 = 40;
                class3.field67 = 60;
            }
        } else if (class3.field67 == 60) {
            int var26 = class134.method1000(0, class43.field1202, class66.field1677);
            int var27 = class112.method793((byte) 80);
            if (var26 < var27) {
                class94.field2181 = class111.method786((byte) -125, new class150[] { class77.field1904, class29.method239(1000, var26 * 100 / var27), class106.field2391 });
                class46.field1234 = 50;
            } else {
                class46.field1234 = 50;
                class94.field2181 = class41.field1085;
                class11.method66(5, false);
                class3.field67 = 70;
            }
        } else {
            if (arg0 != 139) {
                method691((byte) 126, -47);
            }
            if (class3.field67 == 70) {
                if (class125.field2899.method300((byte) 87)) {
                    class113.method800((byte) 50, class125.field2899);
                    class78.method575(class125.field2899, 0);
                    class126.method951(class35.field979, 127, class125.field2899);
                    class76.method566(-73, class125.field2899, class35.field979, class20.field517);
                    class94.method664(class35.field979, (byte) -53, class125.field2899);
                    class104.method719(class105.field2374, class125.field2899, class47.field1264, class35.field979, arg0 - 15);
                    class91.method644(class131.field3099, 105, class111.field2572, class125.field2899);
                    class104.method714(false, class35.field979, class125.field2899);
                    class119.method865(class125.field2899, 2851);
                    class105.method724(class125.field2899, true);
                    class88.method636(class127.field2994, (byte) 121, class66.field1677, class35.field979);
                    class88.method633(class125.field2899, -300685808);
                    class94.field2181 = class17.field456;
                    class46.field1234 = 60;
                    class3.field67 = 80;
                } else {
                    class94.field2181 = class111.method786((byte) 121, new class150[] { class6.field155, class29.method239(1000, class125.field2899.method138(-93)), class106.field2391 });
                    class46.field1234 = 60;
                }
            } else if (class3.field67 == 80) {
                int var28 = 0;
                if (class142.field3440 == null) {
                    class142.field3440 = class74.method560(class103.field2327, class66.field1677, class43.field1167, (byte) -118);
                } else {
                    var28++;
                }
                if (class98.field2238 == null) {
                    class98.field2238 = class74.method560(class77.field1912, class66.field1677, class43.field1167, (byte) -99);
                } else {
                    var28++;
                }
                if (class142.field3443 == null) {
                    class142.field3443 = class43.method335(class43.field1167, 28257, class66.field1677, class119.field2758);
                } else {
                    var28++;
                }
                if (class61.field1556 == null) {
                    class61.field1556 = class112.method794(class43.field1167, class66.field1677, 8, class5.field133);
                } else {
                    var28++;
                }
                if (class125.field2902 == null) {
                    class125.field2902 = class112.method794(class43.field1167, class66.field1677, 8, class149.field3641);
                } else {
                    var28++;
                }
                if (class38.field1034 == null) {
                    class38.field1034 = class112.method794(class43.field1167, class66.field1677, arg0 ^ 0x83, class135.field3179);
                } else {
                    var28++;
                }
                if (class24.field719 == null) {
                    class24.field719 = class112.method794(class43.field1167, class66.field1677, 8, class146.field3543);
                } else {
                    var28++;
                }
                if (class66.field1671 == null) {
                    class66.field1671 = class112.method794(class43.field1167, class66.field1677, 8, class43.field1174);
                } else {
                    var28++;
                }
                if (class9.field231 == null) {
                    class9.field231 = class74.method560(class128.field3036, class66.field1677, class43.field1167, (byte) -98);
                } else {
                    var28++;
                }
                if (class22.field639 == null) {
                    class22.field639 = class112.method794(class43.field1167, class66.field1677, arg0 ^ 0x83, class61.field1554);
                } else {
                    var28++;
                }
                if (class127.field2975 == null) {
                    class127.field2975 = class112.method794(class43.field1167, class66.field1677, 8, class124.field2867);
                } else {
                    var28++;
                }
                if (class103.field2338 == null) {
                    class103.field2338 = class112.method794(class43.field1167, class66.field1677, 8, class18.field476);
                } else {
                    var28++;
                }
                if (class143.field3453 == null) {
                    class143.field3453 = class43.method335(class43.field1167, 28257, class66.field1677, class113.field2610);
                } else {
                    var28++;
                }
                if (class133.field3117 == null) {
                    class133.field3117 = class43.method335(class43.field1167, arg0 ^ 0x6EEA, class66.field1677, class5.field128);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class94.field2181 = class111.method786((byte) -126, new class150[] { class72.field1803, class29.method239(arg0 + 861, var28 * 100 / 14), class106.field2391 });
                    class46.field1234 = 70;
                } else {
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    class98.field2238.method395();
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 41.0D) - 20;
                    for (int var33 = 0; var33 < class61.field1556.length; var33++) {
                        class61.field1556[var33].method406(var29 + var32, var31 + var32, var30 + var32);
                    }
                    class142.field3443[0].method801(var29 + var32, var31 + var32, var30 + var32);
                    class94.field2181 = class131.field3104;
                    class46.field1234 = 70;
                    class3.field67 = 85;
                }
            } else if (class3.field67 == 85) {
                int var34 = class31.method249(0, class66.field1677);
                int var35 = client.method171(true);
                if (var35 > var34) {
                    class94.field2181 = class111.method786((byte) 84, new class150[] { class2.field44, class29.method239(1000, var34 * 100 / var35), class106.field2391 });
                    class46.field1234 = 80;
                } else {
                    class46.field1234 = 80;
                    class94.field2181 = class35.field976;
                    class3.field67 = 90;
                }
            } else if (class3.field67 == 90) {
                if (class141.field3329.method300((byte) 113)) {
                    class43 var36 = new class43(class141.field3329, class66.field1677, 20, 0.8D, class20.field517 ? 64 : 128);
                    class60.method463(var36);
                    class60.method456(0.8D);
                    class3.field67 = 110;
                    class46.field1234 = 90;
                    class94.field2181 = class10.field237;
                } else {
                    class94.field2181 = class111.method786((byte) 52, new class150[] { class22.field651, class29.method239(arg0 ^ 0x363, class141.field3329.method138(113)), class106.field2391 });
                    class46.field1234 = 90;
                }
            } else if (class3.field67 == 110) {
                class95.field2208 = new class138();
                class10.field243.method1031(10, class95.field2208, 86);
                class94.field2181 = class92.field2143;
                class3.field67 = 120;
                class46.field1234 = 94;
            } else if (class3.field67 == 120) {
                if (class43.field1202.method317(class43.field1167, class21.field559, 5875)) {
                    class121 var37 = new class121(class43.field1202.method320(class21.field559, class43.field1167, -1));
                    class91.method645(var37, (byte) 75);
                    class46.field1234 = 96;
                    class94.field2181 = class41.field1090;
                    class3.field67 = 130;
                } else {
                    class94.field2181 = class111.method786((byte) 9, new class150[] { class1.field4, class10.field232 });
                    class46.field1234 = 96;
                }
            } else if (class3.field67 == 130) {
                if (!class127.field2994.method300((byte) 84)) {
                    class94.field2181 = class111.method786((byte) 68, new class150[] { class74.field1852, class29.method239(1000, class127.field2994.method138(arg0 - 260) * 4 / 5), class106.field2391 });
                    class46.field1234 = 100;
                } else if (!class4.field87.method300((byte) -73)) {
                    class94.field2181 = class111.method786((byte) -123, new class150[] { class74.field1852, class29.method239(1000, class4.field87.method138(29) / 6 + 80), class106.field2391 });
                    class46.field1234 = 100;
                } else if (class148.field3602.method300((byte) -47)) {
                    class3.field67 = 140;
                    class46.field1234 = 100;
                    class94.field2181 = class22.field658;
                } else {
                    class94.field2181 = class111.method786((byte) -109, new class150[] { class74.field1852, class29.method239(1000, class148.field3602.method138(98) / 20 + 96), class106.field2391 });
                    class46.field1234 = 100;
                }
            } else if (class3.field67 == 140) {
                class11.method66(10, false);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)Z")
    public static final boolean method691(byte arg0, int arg1) {
        field2287++;
        if (arg0 > -78) {
            field2292 = 48;
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method692(byte arg0) {
        field2312 = null;
        field2297 = null;
        field2294 = null;
        field2311 = null;
        field2300 = null;
        field2298 = null;
        field2309 = null;
        field2291 = null;
        if (arg0 > -55) {
            method693(-75, 5, (byte) -55);
        }
        field2308 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB)Z")
    public static final boolean method693(int arg0, int arg1, byte arg2) {
        int var3 = 4 % ((arg2 + 59) / 57);
        field2307++;
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILqa;II)V")
    public static final void method694(int arg0, class111 arg1, int arg2, int arg3) {
        if ((arg2 & 0x400) != 0) {
            int var4 = class121.field2783.method1127(122);
            int var5 = class121.field2783.method1127(111);
            arg1.method954(var5, (byte) 111, var4, class11.field280);
            arg1.field3009 = class11.field280 + 300;
            arg1.field2959 = class121.field2783.method1137(255);
            arg1.field3001 = class121.field2783.method1137(255);
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field2972 = class121.field2783.method1147(arg3 ^ 0xFFFFB238);
            arg1.field2998 = class121.field2783.method1136(92);
        }
        field2290++;
        if ((arg2 & 0x80) != 0) {
            arg1.field2931 = class121.field2783.method1136(69);
            if (arg1.field2931 == 65535) {
                arg1.field2931 = -1;
            }
        }
        if ((arg2 & 0x20) != 0) {
            int var6 = class121.field2783.method1146(0);
            int var7 = class121.field2783.method1146(arg3 - 19911);
            arg1.method954(var7, (byte) -41, var6, class11.field280);
            arg1.field3009 = class11.field280 + 300;
            arg1.field2959 = class121.field2783.method1146(arg3 ^ 0x4DC7);
            arg1.field3001 = class121.field2783.method1127(119);
        }
        if ((arg2 & 0x4) != 0) {
            int var8 = class121.field2783.method1136(arg3 ^ 0x4DFF);
            int var9 = class121.field2783.method1108(false);
            int var10 = class121.field2783.method1137(255);
            int var11 = class121.field2783.field3601;
            if (arg1.field2555 != null && arg1.field2562 != null) {
                long var12 = arg1.field2555.method1198(1);
                boolean var14 = false;
                if (var9 <= 1) {
                    for (int var15 = 0; var15 < class74.field1858; var15++) {
                        if (class74.field1859[var15] == var12) {
                            var14 = true;
                            break;
                        }
                    }
                }
                if (!var14 && class68.field1724 == 0) {
                    class68.field1700.field3601 = 0;
                    class121.field2783.method1103(var10, -98, class68.field1700.field3592, 0);
                    class68.field1700.field3601 = 0;
                    class150 var16 = class147.method1099(class68.field1700, (byte) -126).method1185(-55);
                    arg1.field3015 = var16.method1201(true);
                    arg1.field2958 = var8 >> 8;
                    arg1.field2986 = var8 & 0xFF;
                    arg1.field2946 = 150;
                    if (var9 == 2 || var9 == 3) {
                        class3.method16(arg3 ^ 0x4DA4, 1, var16, class111.method786((byte) 25, new class150[] { class4.field81, arg1.field2555 }));
                    } else if (var9 == 1) {
                        class3.method16(99, 1, var16, class111.method786((byte) -117, new class150[] { class109.field2521, arg1.field2555 }));
                    } else {
                        class3.method16(99, 2, var16, arg1.field2555);
                    }
                }
            }
            class121.field2783.field3601 = var10 + var11;
        }
        if ((arg2 & 0x8) != 0) {
            int var17 = class121.field2783.method1140(-1);
            int var18 = class121.field2783.method1146(arg3 - 19911);
            if (var17 == 65535) {
                var17 = -1;
            }
            class55.method428(var18, arg1, (byte) 74, var17);
        }
        if ((arg2 & 0x40) != 0) {
            int var19 = class121.field2783.method1108(false);
            byte[] var20 = new byte[var19];
            class148 var21 = new class148(var20);
            class121.field2783.method1103(var19, 124, var20, 0);
            class107.field2419[arg0] = var21;
            arg1.method787(-1, var21);
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field2991 = class121.field2783.method1140(-1);
            int var22 = class121.field2783.method1104(true);
            arg1.field3010 = (var22 & 0xFFFF) + class11.field280;
            arg1.field2949 = var22 >> 16;
            if (arg1.field2991 == 65535) {
                arg1.field2991 = -1;
            }
            arg1.field3002 = 0;
            arg1.field2966 = 0;
            if (arg1.field3010 > class11.field280) {
                arg1.field3002 = -1;
            }
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field3015 = class121.field2783.method1154((byte) 102);
            if (arg1.field3015.method1206(0, -27473) == 126) {
                arg1.field3015 = arg1.field3015.method1196(1, -31851);
                class3.method16(99, 2, arg1.field3015, arg1.field2555);
            } else if (class46.field1244 == arg1) {
                class3.method16(99, 2, arg1.field3015, arg1.field2555);
            }
            arg1.field2946 = 150;
            arg1.field2958 = 0;
            arg1.field2986 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field2942 = class121.field2783.method1137(255);
            arg1.field2950 = class121.field2783.method1146(arg3 ^ 0x4DC7);
            arg1.field2962 = class121.field2783.method1146(0);
            arg1.field2932 = class121.field2783.method1137(255);
            arg1.field2996 = class121.field2783.method1113(arg3 + 7028) + class11.field280;
            arg1.field3014 = class121.field2783.method1136(57) + class11.field280;
            arg1.field3007 = class121.field2783.method1108(false);
            arg1.field3013 = 1;
            arg1.field2995 = 0;
        }
        if (arg3 != 19911) {
            method694(-120, null, 28, 69);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lwd;ILwd;Lwd;)V")
    public static final void method695(class150 arg0, int arg1, class150 arg2, class150 arg3) {
        if (arg1 != -8014) {
            field2309 = null;
        }
        class94.field2169 = arg0;
        class94.field2186 = arg3;
        class94.field2188 = arg2;
        field2304++;
    }
}
