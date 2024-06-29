import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lu;")
    public static class135 field2105 = class87.method676((byte) -68, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Le;")
    public static class29 field2106 = new class29(64);

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field2112 = 0;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field2115 = 127;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lu;")
    public static class135 field2113 = class87.method676((byte) -79, "null");

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Z")
    public static boolean field2120 = false;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field2116 = 0;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lu;")
    private static class135 field2119 = class87.method676((byte) -98, "Choose Option");

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lu;")
    public static class135 field2114 = class87.method676((byte) -74, ": ");

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lu;")
    public static class135 field2117 = class87.method676((byte) -79, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lu;")
    public static class135 field2121 = class87.method676((byte) -124, "Freie Welt");

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lu;")
    public static class135 field2111 = field2119;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lg;")
    public static class43 field2118;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method680(byte arg0) {
        field2106 = null;
        field2121 = null;
        field2111 = null;
        field2118 = null;
        int var1 = 122 / ((arg0 - 41) / 56);
        field2114 = null;
        field2113 = null;
        field2105 = null;
        field2119 = null;
        field2117 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method681(int arg0) {
        field2108++;
        if (class124.field2964 == 0) {
            class100.field2418 = new class127(4, 104, 104, class68.field1682);
            for (int var1 = 0; var1 < 4; var1++) {
                class58.field1437[var1] = new class99(104, 104);
            }
            class96.field2336 = new class11(512, 512);
            class57.field1398 = class101.field2450;
            class124.field2964 = 20;
            class97.field2346 = 5;
        } else if (class124.field2964 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class51.field1213[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class127.method1034(var2, 500, 800, 512, 334);
            class97.field2346 = 10;
            class124.field2964 = 30;
            class57.field1398 = class106.field2553;
        } else if (class124.field2964 == 30) {
            class37.field847 = class29.method240(true, true, 125, false, 0);
            class28.field681 = class29.method240(true, true, 102, false, 1);
            class80.field1906 = class29.method240(true, false, 80, true, 2);
            class109.field2647 = class29.method240(true, true, 110, false, 3);
            class98.field2374 = class29.method240(true, true, 105, false, 4);
            class141.field3473 = class29.method240(true, true, 113, true, 5);
            class41.field956 = class29.method240(false, true, 79, true, 6);
            class15.field352 = class29.method240(true, true, 83, false, 7);
            class58.field1435 = class29.method240(true, true, 100, false, 8);
            class122.field2917 = class29.method240(true, true, 105, false, 9);
            class65.field1601 = class29.method240(true, true, 76, false, 10);
            class68.field1670 = class29.method240(true, true, 122, false, 11);
            class62.field1557 = class29.method240(true, true, 121, false, 12);
            class3.field79 = class29.method240(true, false, 108, true, 13);
            class129.field3099 = class29.method240(false, true, 84, false, 14);
            class148.field3679 = class29.method240(true, true, 89, false, 15);
            class124.field2964 = 40;
            class57.field1398 = class25.field593;
            class97.field2346 = 20;
        } else if (class124.field2964 == 40) {
            byte var7 = 0;
            int var8 = var7 + class37.field847.method882(true) * 4 / 100;
            int var9 = var8 + class28.field681.method882(true) * 4 / 100;
            int var10 = var9 + class80.field1906.method882(true) * 2 / 100;
            int var11 = var10 + class109.field2647.method882(true) * 2 / 100;
            int var12 = var11 + class98.field2374.method882(true) * 6 / 100;
            int var13 = var12 + class141.field3473.method882(true) * 4 / 100;
            int var14 = var13 + class41.field956.method882(true) * 2 / 100;
            int var15 = var14 + class15.field352.method882(true) * 60 / 100;
            int var16 = var15 + class58.field1435.method882(true) * 2 / 100;
            int var17 = var16 + class122.field2917.method882(true) * 2 / 100;
            int var18 = var17 + class65.field1601.method882(true) * 2 / 100;
            int var19 = var18 + class68.field1670.method882(true) * 2 / 100;
            int var20 = var19 + class62.field1557.method882(true) * 2 / 100;
            int var21 = var20 + class3.field79.method882(true) * 2 / 100;
            int var22 = var21 + class129.field3099.method882(true) * 2 / 100;
            int var23 = var22 + class148.field3679.method882(true) * 2 / 100;
            if (var23 == 100) {
                class97.field2346 = 30;
                class57.field1398 = class122.field2929;
                class124.field2964 = 45;
            } else {
                if (var23 != 0) {
                    class57.field1398 = class107.method867(2, new class135[] { class102.field2459, class68.method547(-1, var23), class40.field922 });
                }
                class97.field2346 = 30;
            }
        } else if (class124.field2964 == 45) {
            class69.method553(!class100.field2422, 2, 22050, -8245);
            class141 var24 = new class141();
            var24.method1138(128, 0, 9);
            class95.field2288 = class65.method531(class41.field965, 5, 0, 22050, class59.field1484);
            class95.field2288.method604(0, var24);
            class26.method215((byte) -118, class98.field2374, var24, class148.field3679, class129.field3099);
            class115.field2761 = class65.method531(class41.field965, 5, 1, 2048, class59.field1484);
            class65.field1645 = new class144();
            class115.field2761.method604(0, class65.field1645);
            class60.field1523 = new class52(22050, class138.field3361);
            class57.field1398 = class105.field2520;
            class124.field2964 = 50;
            class97.field2346 = 35;
        } else if (class124.field2964 == 50) {
            int var25 = 0;
            if (class143.field3500 == null) {
                class143.field3500 = class133.method1058(209, class58.field1435, class113.field2742, class8.field151);
            } else {
                var25++;
            }
            if (class93.field2200 == null) {
                class93.field2200 = class133.method1058(209, class58.field1435, class113.field2742, class29.field691);
            } else {
                var25++;
            }
            if (class63.field1579 == null) {
                class63.field1579 = class133.method1058(209, class58.field1435, class113.field2742, class39.field910);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class57.field1398 = class107.method867(2, new class135[] { class57.field1409, class68.method547(-1, var25 * 100 / 3), class40.field922 });
                class97.field2346 = 40;
            } else {
                class57.field1398 = class85.field2036;
                class124.field2964 = 60;
                class97.field2346 = 40;
            }
        } else if (class124.field2964 == 60) {
            int var26 = class44.method347(false, class58.field1435, class65.field1601);
            int var27 = class109.method885(5133);
            if (var27 > var26) {
                class57.field1398 = class107.method867(2, new class135[] { class12.field286, class68.method547(-1, var26 * 100 / var27), class40.field922 });
                class97.field2346 = 50;
            } else {
                class57.field1398 = class96.field2327;
                class97.field2346 = 50;
                class125.method978(5, 1);
                class124.field2964 = 70;
            }
        } else if (class124.field2964 == 70) {
            if (class80.field1906.method319(0)) {
                class98.method804((byte) -121, class80.field1906);
                class84.method658(class80.field1906, -6898);
                class60.method501(false, class80.field1906, class15.field352);
                class63.method521(class80.field1906, class15.field352, class100.field2422, 0);
                class30.method244(class15.field352, false, class80.field1906);
                class95.method783(class1.field26, class15.field352, class80.field1906, class143.field3500, true);
                class1.method5(class28.field681, class37.field847, -8665, class80.field1906);
                class17.method112(class15.field352, class80.field1906, 31128);
                client.method170(class80.field1906, 1);
                class95.method786(class80.field1906, -70);
                class55.method424(class15.field352, -1, class58.field1435, class109.field2647);
                class133.method1060(-20777, class80.field1906);
                class10.method59((byte) -104, class80.field1906);
                class97.field2346 = 60;
                class124.field2964 = 80;
                class57.field1398 = class42.field971;
            } else {
                class57.field1398 = class107.method867(2, new class135[] { class136.field3295, class68.method547(-1, class80.field1906.method879((byte) -121)), class40.field922 });
                class97.field2346 = 60;
            }
        } else if (class124.field2964 == 80) {
            int var28 = 0;
            if (class82.field1925 == null) {
                class82.field1925 = class14.method97(0, class9.field169, class58.field1435, class113.field2742);
            } else {
                var28++;
            }
            if (class86.field2058 == null) {
                class86.field2058 = class14.method97(0, class106.field2554, class58.field1435, class113.field2742);
            } else {
                var28++;
            }
            if (class126.field2995 == null) {
                class126.field2995 = class30.method243(class50.field1189, 918, class58.field1435, class113.field2742);
            } else {
                var28++;
            }
            if (class10.field261 == null) {
                class10.field261 = class30.method246(class148.field3689, class113.field2742, -91, class58.field1435);
            } else {
                var28++;
            }
            if (class32.field752 == null) {
                class32.field752 = class30.method246(class124.field2946, class113.field2742, -74, class58.field1435);
            } else {
                var28++;
            }
            if (class50.field1177 == null) {
                class50.field1177 = class30.method246(class109.field2652, class113.field2742, 116, class58.field1435);
            } else {
                var28++;
            }
            if (class124.field2969 == null) {
                class124.field2969 = class30.method246(class14.field327, class113.field2742, 65, class58.field1435);
            } else {
                var28++;
            }
            if (class65.field1623 == null) {
                class65.field1623 = class30.method246(class59.field1503, class113.field2742, -100, class58.field1435);
            } else {
                var28++;
            }
            if (class1.field6 == null) {
                class1.field6 = class14.method97(0, class19.field427, class58.field1435, class113.field2742);
            } else {
                var28++;
            }
            if (class86.field2048 == null) {
                class86.field2048 = class30.method246(class105.field2527, class113.field2742, 108, class58.field1435);
            } else {
                var28++;
            }
            if (class101.field2442 == null) {
                class101.field2442 = class30.method246(class46.field1104, class113.field2742, -69, class58.field1435);
            } else {
                var28++;
            }
            if (class53.field1270 == null) {
                class53.field1270 = class30.method246(class76.field1792, class113.field2742, 113, class58.field1435);
            } else {
                var28++;
            }
            if (class55.field1318 == null) {
                class55.field1318 = class30.method243(class62.field1542, 918, class58.field1435, class113.field2742);
            } else {
                var28++;
            }
            if (class40.field937 == null) {
                class40.field937 = class30.method243(class22.field540, 918, class58.field1435, class113.field2742);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class57.field1398 = class107.method867(2, new class135[] { class30.field726, class68.method547(-1, var28 * 100 / 14), class40.field922 });
                class97.field2346 = 70;
            } else {
                int var29 = (int) (Math.random() * 21.0D) - 10;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 21.0D) - 10;
                class86.field2058.method83();
                int var32 = (int) (Math.random() * 41.0D) - 20;
                for (int var33 = 0; var33 < class10.field261.length; var33++) {
                    class10.field261[var33].method67(var31 + var32, var29 + var32, var30 + var32);
                }
                class126.field2995[0].method27(var31 + var32, var29 - -var32, var30 + var32);
                class57.field1398 = class102.field2463;
                class124.field2964 = 85;
                class97.field2346 = 70;
            }
        } else if (class124.field2964 == 85) {
            int var34 = class151.method1218(class58.field1435, 106);
            int var35 = class10.method60(-106);
            if (var34 < var35) {
                class57.field1398 = class107.method867(2, new class135[] { class69.field1711, class68.method547(-1, var34 * 100 / var35), class40.field922 });
                class97.field2346 = 80;
            } else {
                class57.field1398 = class10.field253;
                class97.field2346 = 80;
                class124.field2964 = 90;
            }
        } else if (class124.field2964 == 90) {
            if (class122.field2917.method319(0)) {
                class85 var36 = new class85(class122.field2917, class58.field1435, 20, 0.8D, class100.field2422 ? 64 : 128);
                class51.method390(var36);
                class51.method385(0.8D);
                class124.field2964 = 110;
                class57.field1398 = class129.field3098;
                class97.field2346 = 90;
            } else {
                class57.field1398 = class107.method867(2, new class135[] { class111.field2704, class68.method547(-1, class122.field2917.method879((byte) -121)), class40.field922 });
                class97.field2346 = 90;
            }
        } else if (class124.field2964 == 110) {
            class46.field1097 = new class79();
            class41.field965.method220(10, false, class46.field1097);
            class97.field2346 = 94;
            class57.field1398 = class4.field100;
            class124.field2964 = 120;
        } else if (class124.field2964 != 120) {
            int var38 = 36 / ((arg0 - 42) / 54);
            if (class124.field2964 == 130) {
                if (!class109.field2647.method319(0)) {
                    class57.field1398 = class107.method867(2, new class135[] { class57.field1404, class68.method547(-1, class109.field2647.method879((byte) -121) * 4 / 5), class40.field922 });
                    class97.field2346 = 100;
                } else if (!class62.field1557.method319(0)) {
                    class57.field1398 = class107.method867(2, new class135[] { class57.field1404, class68.method547(-1, class62.field1557.method879((byte) -121) / 6 + 80), class40.field922 });
                    class97.field2346 = 100;
                } else if (class3.field79.method319(0)) {
                    class57.field1398 = class12.field281;
                    class124.field2964 = 140;
                    class97.field2346 = 100;
                } else {
                    class57.field1398 = class107.method867(2, new class135[] { class57.field1404, class68.method547(-1, class3.field79.method879((byte) -121) / 20 + 96), class40.field922 });
                    class97.field2346 = 100;
                }
            } else if (class124.field2964 == 140) {
                class125.method978(10, 1);
            }
        } else if (class65.field1601.method338(78, class113.field2742, class19.field423)) {
            class49 var37 = new class49(class65.field1601.method337((byte) 1, class113.field2742, class19.field423));
            class19.method145(var37, false);
            class57.field1398 = class141.field3421;
            class97.field2346 = 96;
            class124.field2964 = 130;
        } else {
            class57.field1398 = class107.method867(2, new class135[] { class87.field2077, class101.field2424 });
            class97.field2346 = 96;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method682(int arg0, int arg1) {
        field2104++;
        if (arg1 >= -32) {
            method681(-98);
        }
        if (class12.field290 == 0) {
            class17.field380.method1157(1, arg0);
        } else {
            class141.field3418 = arg0;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static final void method683(int arg0) {
        class120 var1 = class131.field3158;
        synchronized (class131.field3158) {
            class60.field1520 = class152.field3739;
            class53.field1278 = class37.field845;
            class76.field1798 = class12.field272;
            class48.field1151 = class21.field501;
            class139.field3389 = class128.field3083;
            class20.field470 = class106.field2550;
            class10.field262 = class104.field2503;
            class21.field501 = arg0;
        }
        field2110++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIILve;III)V")
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4, class146 arg5, int arg6, int arg7, int arg8) {
        field2109++;
        if (client.field516) {
            class80.field1904 = 32;
        } else {
            class80.field1904 = 0;
        }
        if (arg7 != -4) {
            return;
        }
        client.field516 = false;
        if (arg4 >= arg2 && arg2 + 16 > arg4 && arg3 <= arg1 && arg3 + 16 > arg1) {
            if (arg0 == 2 || arg0 == 3) {
                class65.field1634 = true;
            }
            arg5.field3671 -= class125.field2986 * 4;
            if (arg0 == 1) {
                class135.field3239 = true;
            }
        } else if (arg4 >= arg2 && arg2 + 16 > arg4 && arg1 >= arg6 + arg3 - 16 && arg3 + arg6 > arg1) {
            if (arg0 == 2 || arg0 == 3) {
                class65.field1634 = true;
            }
            arg5.field3671 += class125.field2986 * 4;
            if (arg0 == 1) {
                class135.field3239 = true;
            }
        } else if (arg4 >= arg2 - class80.field1904 && arg4 < class80.field1904 + arg2 + 16 && arg1 >= arg3 + 16 && arg1 < arg3 + arg6 - 16 && class125.field2986 > 0) {
            if (arg0 == 1) {
                class135.field3239 = true;
            }
            client.field516 = true;
            if (arg0 == 2 || arg0 == 3) {
                class65.field1634 = true;
            }
            int var9 = (arg6 - 32) * arg6 / arg8;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg6 - var9 - 32;
            int var11 = arg1 - arg3 - var9 / 2 - 16;
            arg5.field3671 = (arg8 - arg6) * var11 / var10;
        }
        if (class14.field335 == 0) {
            return;
        }
        int var12 = arg5.field3623;
        if (arg0 == -1) {
            var12 = 479;
        }
        if (arg2 - var12 > arg4 || arg3 > arg1 || arg2 + 16 <= arg4 || arg3 + arg6 < arg1) {
            return;
        }
        arg5.field3671 += class14.field335 * 45;
        if (arg0 == 1) {
            class135.field3239 = true;
        }
        if (arg0 == 2 || arg0 == 3) {
            class65.field1634 = true;
        }
        return;
    }
}
