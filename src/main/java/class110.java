import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class110 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static volatile int field2755 = 0;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2760 = 2;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lad;")
    public static class5 field2765 = class88.method674("hitmarks", 110);

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lad;")
    public static class5 field2769 = class88.method674("m-Ochte mit Ihnen handeln)3", -117);

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lad;")
    private static class5 field2761 = class88.method674("Enter object name", -125);

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lad;")
    public static class5 field2766 = class88.method674("Lade Texturen )2 ", -101);

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Lad;")
    public static class5 field2776 = field2761;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "Lad;")
    public static class5 field2779 = class88.method674("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 24);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Ltb;")
    public static class116 field2758;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Ltb;")
    public static class116 field2778;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field2756;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public int[] field2757;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public static int[] field2759;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 5)
    public final void method885(int arg0) {
        class55.method447(this.field2757, this.field2772, this.field2770);
        if (arg0 > -32) {
            method886(null, (byte) 93);
        }
        field2775++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lad;B)V", line = 23)
    private static final void method886(class5 arg0, byte arg1) {
        field2773++;
        int var2 = 20 % ((arg1 - 12) / 56);
        if (arg0 == null || arg0.method33(45) == 0) {
            class52.field1295 = 0;
            return;
        }
        class5 var3 = arg0;
        class5[] var4 = new class5[100];
        int var5 = 0;
        while (true) {
            int var6 = var3.method61(32, -58);
            if (var6 == -1) {
                class5 var8 = var3.method39((byte) 127);
                if (var8.method33(78) > 0) {
                    var4[var5++] = var8.method68((byte) 68);
                }
                class52.field1295 = 0;
                label47: for (int var9 = 0; var9 < class39.field1008; var9++) {
                    class27 var10 = class3.method21((byte) 78, var9);
                    if (var10.field673 == -1 && var10.field650 != null) {
                        class5 var11 = var10.field650.method68((byte) 39);
                        for (int var12 = 0; var12 < var5; var12++) {
                            if (var11.method32(var4[var12], 0) == -1) {
                                continue label47;
                            }
                        }
                        class9.field311[class52.field1295] = var11;
                        class10.field339[class52.field1295] = var9;
                        class52.field1295++;
                        if (class52.field1295 >= class9.field311.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class5 var7 = var3.method51((byte) -49, 0, var6).method39((byte) 127);
            if (var7.method33(66) > 0) {
                var4[var5++] = var7.method68((byte) 75);
            }
            var3 = var3.method52(var6 + 1, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 108)
    public static void method887(int arg0) {
        field2766 = null;
        field2761 = null;
        field2769 = null;
        field2779 = null;
        field2765 = null;
        field2759 = null;
        field2776 = null;
        field2778 = null;
        if (arg0 >= -8) {
            field2758 = null;
        }
        field2758 = null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 139)
    public static final void method888(int arg0) {
        field2754++;
        for (int var1 = 0; var1 < class109.field2727; var1++) {
            int var2 = class13.field380[var1];
            class61 var3 = class103.field2504[var2];
            int var4 = class36.field907.method330(-30864);
            if ((var4 & 0x1) != 0) {
                int var5 = class36.field907.method305((byte) -92);
                int var6 = class36.field907.method335((byte) -16);
                var3.method18(-18, class69.field1636, var6, var5);
                var3.field95 = class69.field1636 + 300;
                var3.field116 = class36.field907.method333((byte) -18);
                var3.field50 = class36.field907.method305((byte) -92);
            }
            if ((var4 & 0x4) != 0) {
                var3.field45 = class36.field907.method298(117);
                if (var3.field45 == 65535) {
                    var3.field45 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field55 = class36.field907.method301(-1);
                var3.field98 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field103 = class36.field907.method323(-14837);
                int var7 = class36.field907.method299(true);
                var3.field72 = 0;
                var3.field88 = var7 >> 16;
                if (var3.field103 == 65535) {
                    var3.field103 = -1;
                }
                var3.field108 = 0;
                var3.field110 = class69.field1636 + (var7 & 0xFFFF);
                if (class69.field1636 < var3.field110) {
                    var3.field108 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field64 = class36.field907.method343((byte) -6);
                var3.field117 = class36.field907.method336(241465648);
            }
            if ((var4 & 0x8) != 0) {
                int var8 = class36.field907.method336(241465648);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class36.field907.method305((byte) -92);
                if (var3.field85 == var8 && var8 != -1) {
                    int var10 = class78.method605(var8, (byte) 20).field1737;
                    if (var10 == 1) {
                        var3.field82 = var9;
                        var3.field57 = 0;
                        var3.field109 = 0;
                        var3.field43 = 0;
                    }
                    if (var10 == 2) {
                        var3.field43 = 0;
                    }
                } else if (var8 == -1 || var3.field85 == -1 || class78.method605(var8, (byte) 20).field1726 >= class78.method605(var3.field85, (byte) 20).field1726) {
                    var3.field85 = var8;
                    var3.field78 = var3.field80;
                    var3.field57 = 0;
                    var3.field82 = var9;
                    var3.field109 = 0;
                    var3.field43 = 0;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1498 = class48.method421(class36.field907.method298(110), 1);
                var3.field119 = var3.field1498.field2891;
                var3.field77 = var3.field1498.field2892;
                var3.field75 = var3.field1498.field2897;
                var3.field48 = var3.field1498.field2937;
                var3.field87 = var3.field1498.field2888;
                var3.field68 = var3.field1498.field2929;
                var3.field70 = var3.field1498.field2894;
                var3.field69 = var3.field1498.field2906;
                var3.field84 = var3.field1498.field2925;
            }
            if ((var4 & 0x80) != 0) {
                int var11 = class36.field907.method305((byte) -92);
                int var12 = class36.field907.method305((byte) -92);
                var3.method18(-38, class69.field1636, var12, var11);
                var3.field95 = class69.field1636 + 300;
                var3.field116 = class36.field907.method330(-30864);
                var3.field50 = class36.field907.method330(-30864);
            }
        }
        if (arg0 != 8270336) {
            method890(false, -62, null);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIZI)V", line = 299)
    public static final void method889(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class74.field1761[0].method976(arg1, arg3);
        field2767++;
        class74.field1761[1].method976(arg1, arg3 + arg0 - 16);
        class55.method443(arg1, arg3 + 16, 16, arg0 - 32, class135.field3266);
        int var6 = (arg0 - 32) * arg0 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg5 / (arg2 - arg0);
        class55.method443(arg1, arg3 + var7 + 16, 16, var6, class25.field633);
        class55.method449(arg1, arg3 + var7 + 16, var6, class135.field3268);
        class55.method449(arg1 + 1, var7 + 16 + arg3, var6, class135.field3268);
        class55.method444(arg1, var7 + arg3 + 16, 16, class135.field3268);
        class55.method444(arg1, var7 + arg3 + 17, 16, class135.field3268);
        class55.method449(arg1 + 15, var7 + 16 + arg3, var6, class14.field394);
        if (!arg4) {
            field2769 = null;
        }
        class55.method449(arg1 + 14, arg3 + 17 + var7, var6 - 1, class14.field394);
        class55.method444(arg1, var7 + arg3 + var6 + 15, 16, class14.field394);
        class55.method444(arg1 + 1, arg3 + var7 + var6 + 14, 15, class14.field394);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILgd;)V", line = 341)
    public static final void method890(boolean arg0, int arg1, class40 arg2) {
        if (class60.field1464 != null) {
            try {
                class60.field1464.method350(-5918);
            } catch (Exception var8) {
            }
            class60.field1464 = null;
        }
        class60.field1464 = arg2;
        field2762++;
        class81.method632(3, arg0);
        class23.field575.field957 = 0;
        class77.field1813 = null;
        if (arg1 != -3) {
            method887(54);
        }
        class121.field3004 = 0;
        class99.field2397 = null;
        while (true) {
            class109 var3 = (class109) class43.field1091.method405(8853);
            if (var3 == null) {
                while (true) {
                    class109 var4 = (class109) class32.field785.method405(8853);
                    if (var4 == null) {
                        if (class112.field2815 != 0) {
                            try {
                                class39 var5 = new class39(4);
                                var5.method307(-388270616, 4);
                                var5.method307(arg1 - 388270613, class112.field2815);
                                var5.method339(0, true);
                                class60.field1464.method349(0, -1, 4, var5.field974);
                            } catch (IOException var7) {
                                try {
                                    class60.field1464.method350(arg1 - 5915);
                                } catch (Exception var6) {
                                }
                                class35.field893++;
                                class60.field1464 = null;
                            }
                        }
                        class95.field2274 = 0;
                        class19.field512 = class95.method728(128);
                        return;
                    }
                    class56.field1393.method663(false, var4);
                    class105.field2585.method403(var4.field363, var4, true);
                    class9.field314++;
                    class79.field1873--;
                }
            }
            class61.field1503.method403(var3.field363, var3, true);
            class128.field3056++;
            class50.field1288--;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 428)
    protected class110() {
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)Lad;", line = 431)
    public static final class5 method891(long arg0, int arg1) {
        field2777++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            if (arg1 != -30523) {
                return null;
            }
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class6.field231[(int) (var8 - arg0 * 37L)];
            }
            class5 var7 = new class5();
            var7.field164 = var6;
            var7.field183 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V", line = 478)
    public static final void method892(int arg0) {
        field2763++;
        class46.field1195 = true;
        class60.method493(21642);
        if (arg0 != 19500) {
            return;
        }
        if (class65.field1559) {
            class135.field3263.method1017(class135.field3258, 239, 40, 0);
            class135.field3263.method1017(class69.method546(true, new class5[] { class135.field3272, class42.field1072 }), 239, 60, 128);
        } else if (class98.field2374 == 1) {
            class135.field3263.method1017(class88.field2069, 239, 40, 0);
            class135.field3263.method1017(class69.method546(true, new class5[] { class135.field3262, class42.field1072 }), 239, 60, 128);
        } else if (class98.field2374 == 2) {
            class135.field3263.method1017(class101.field2459, 239, 40, 0);
            class135.field3263.method1017(class69.method546(true, new class5[] { class135.field3262, class42.field1072 }), 239, 60, 128);
        } else if (class98.field2374 == 3) {
            if (class135.field3262 != class135.field3256) {
                method886(class135.field3262, (byte) -109);
                class135.field3256 = class135.field3262;
            }
            class130 var1 = class82.field1924;
            class55.method454(0, 0, 463, 77);
            for (int var2 = 0; var2 < class52.field1295; var2++) {
                int var3 = var2 * 14 + 18 - class69.field1610;
                if (var3 > 0 && var3 < 110) {
                    var1.method1017(class9.field311[var2], 239, var3, 0);
                }
            }
            class55.method450();
            if (class52.field1295 > 5) {
                method889(77, 463, class52.field1295 * 14 + 7, 0, true, class69.field1610);
            }
            if (class135.field3262.method33(78) == 0) {
                class135.field3263.method1017(field2776, 239, 40, 255);
            } else if (class52.field1295 == 0) {
                class135.field3263.method1017(class38.field942, 239, 40, 0);
            }
            var1.method1017(class69.method546(true, new class5[] { class135.field3262, class42.field1072 }), 239, 90, 0);
            class55.method444(0, 77, 479, 0);
        } else if (class33.field817 != null) {
            class135.field3263.method1017(class33.field817, 239, 40, 0);
            class135.field3263.method1017(class121.field2999, 239, 60, 128);
        } else if (class6.field225 != -1) {
            boolean var19 = class86.method657(0, 96, arg0 ^ 0x49C7, 479, 2, class6.field225, 0);
            if (!var19) {
                class99.field2384 = true;
            }
        } else if (class90.field2124 == -1) {
            class130 var5 = class82.field1924;
            class55.method454(0, 0, 463, 77);
            int var6 = 0;
            for (int var7 = 0; var7 < 100; var7++) {
                if (class96.field2282[var7] != null) {
                    int var9 = class46.field1215[var7];
                    int var10 = class25.field622 + 70 - var6 * 14;
                    class5 var11 = class116.field2879[var7];
                    byte var12 = 0;
                    if (var11 != null && var11.method47(arg0 ^ 0x4C0C, class106.field2660)) {
                        var11 = var11.method52(5, (byte) -74);
                        var12 = 1;
                    }
                    if (var11 != null && var11.method47(arg0 - 19418, class88.field2071)) {
                        var12 = 2;
                        var11 = var11.method52(5, (byte) -82);
                    }
                    if (var9 == 0) {
                        var6++;
                        if (var10 > 0 && var10 < 110) {
                            var5.method1014(class96.field2282[var7], 4, var10, 0);
                        }
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || class65.field1567 == 0 || class65.field1567 == 1 && class133.method1028(var11, 0))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                class116.field2866[0].method976(var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                class116.field2866[1].method976(var13, var10 - 12);
                                var13 += 14;
                            }
                            var5.method1014(class69.method546(true, new class5[] { var11, class27.field671 }), var13, var10, 0);
                            int var14 = var13 + var5.method1007(var11) + 8;
                            var5.method1014(class96.field2282[var7], var14, var10, 255);
                        }
                        var6++;
                    }
                    if ((var9 == 3 || var9 == 7) && class134.field3239 == 0 && (var9 == 7 || class61.field1509 == 0 || class61.field1509 == 1 && class133.method1028(var11, 0))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method1014(class49.field1270, var15, var10, 0);
                            int var16 = var15 + var5.method1007(class49.field1270);
                            int var17 = var16 + var5.method1012(32);
                            if (var12 == 1) {
                                class116.field2866[0].method976(var17, var10 - 12);
                                var17 += 14;
                            }
                            if (var12 == 2) {
                                class116.field2866[1].method976(var17, var10 - 12);
                                var17 += 14;
                            }
                            var5.method1014(class69.method546(true, new class5[] { var11, class27.field671 }), var17, var10, 0);
                            int var18 = var17 + var5.method1007(var11) + 8;
                            var5.method1014(class96.field2282[var7], var18, var10, 8388608);
                        }
                        var6++;
                    }
                    if (var9 == 4 && (class48.field1238 == 0 || class48.field1238 == 1 && class133.method1028(var11, 0))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method1014(class69.method546(true, new class5[] { var11, class23.field589, class96.field2282[var7] }), 4, var10, 8388736);
                        }
                        var6++;
                    }
                    if (var9 == 5 && class134.field3239 == 0 && class61.field1509 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method1014(class96.field2282[var7], 4, var10, 8388608);
                        }
                        var6++;
                    }
                    if (var9 == 6 && class134.field3239 == 0 && class61.field1509 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method1014(class69.method546(true, new class5[] { class95.field2249, class23.field589, var11, class27.field671 }), 4, var10, 0);
                            var5.method1014(class96.field2282[var7], var5.method1007(class69.method546(true, new class5[] { class95.field2249, class23.field589, var11 })) + 12, var10, 8388608);
                        }
                        var6++;
                    }
                    if (var9 == 8 && (class48.field1238 == 0 || class48.field1238 == 1 && class133.method1028(var11, 0))) {
                        var6++;
                        if (var10 > 0 && var10 < 110) {
                            var5.method1014(class69.method546(true, new class5[] { var11, class23.field589, class96.field2282[var7] }), 4, var10, 8270336);
                        }
                    }
                }
            }
            class55.method450();
            class106.field2683 = var6 * 14 + 7;
            if (class106.field2683 < 78) {
                class106.field2683 = 78;
            }
            method889(77, 463, class106.field2683, 0, true, class106.field2683 - class25.field622 - 77);
            class5 var8;
            if (class82.field1932 == null || class82.field1932.field2801 == null) {
                var8 = class109.field2753;
            } else {
                var8 = class82.field1932.field2801;
            }
            var5.method1014(class69.method546(true, new class5[] { var8, class27.field671 }), 4, 90, 0);
            var5.method1014(class69.method546(true, new class5[] { class135.field3275, class42.field1072 }), var5.method1007(class69.method546(true, new class5[] { var8, class4.field131 })) + 6, 90, 255);
            class55.method444(0, 77, 479, 0);
        } else {
            boolean var4 = class86.method657(0, 96, 1515, 479, 3, class90.field2124, 0);
            if (!var4) {
                class99.field2384 = true;
            }
        }
        if (class128.field3069 && class89.field2103 == 2) {
            class121.method955(-26266);
        }
        class25.method211((byte) -119);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 805)
    public static final void method893(byte arg0) {
        field2774++;
        class34.field860++;
        class95.method731(true, false);
        class7.method88((byte) 100, true);
        class95.method731(false, false);
        class7.method88((byte) -51, false);
        class20.method165(11863);
        class120.method951(false);
        if (!class120.field2983) {
            int var1 = class69.field1643;
            int var2 = class131.field3177 + class75.field1794 & 0x7FF;
            if (var1 < class120.field2993 / 256) {
                var1 = class120.field2993 / 256;
            }
            if (class3.field83[4] && class4.field128[4] + 128 > var1) {
                var1 = class4.field128[4] + 128;
            }
            class79.method617(class89.field2107, -3944, var1 * 3 + 600, class95.method730(60, class82.field1932.field112, class54.field1344, class82.field1932.field120) - 50, class105.field2567, var2, var1);
        }
        int var3;
        if (class120.field2983) {
            var3 = class105.method841(0);
        } else {
            var3 = class8.method96((byte) 110);
        }
        int var4 = class135.field3255;
        int var5 = class70.field1686;
        int var6 = class9.field308;
        int var7 = class128.field3079;
        int var8 = class52.field1318;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class3.field83[var9]) {
                int var10 = (int) ((double) (class48.field1252[var9] * 2 + 1) * Math.random() + Math.sin((double) class40.field1022[var9] / 100.0D * (double) class69.field1625[var9]) * (double) class4.field128[var9] - (double) class48.field1252[var9]);
                if (var9 == 3) {
                    class52.field1318 = class52.field1318 + var10 & 0x7FF;
                }
                if (var9 == 0) {
                    class135.field3255 += var10;
                }
                if (var9 == 2) {
                    class9.field308 += var10;
                }
                if (var9 == 1) {
                    class70.field1686 += var10;
                }
                if (var9 == 4) {
                    class128.field3079 += var10;
                    if (class128.field3079 < 128) {
                        class128.field3079 = 128;
                    }
                    if (class128.field3079 > 383) {
                        class128.field3079 = 383;
                    }
                }
            }
        }
        class13.method117(-112);
        class45.field1182 = class91.field2131 - 4;
        class45.field1175 = true;
        class45.field1158 = class22.field564 - 4;
        class45.field1170 = 0;
        class55.method445();
        class42.field1065.method764(class135.field3255, class70.field1686, class9.field308, class128.field3079, class52.field1318, var3);
        class42.field1065.method786();
        class90.method685((byte) -68);
        class102.method824((byte) -126);
        ((class65) class114.field2838).method514(-1, class98.field2382);
        class5.method59((byte) -57);
        if (class116.field2882 && class6.method79(false, 12896, true) == 0) {
            class116.field2882 = false;
        }
        if (class116.field2882) {
            class13.method117(91);
            class55.method445();
            class73.method584(23370, false, class69.field1640, null);
        }
        class58.method471((byte) 51);
        if (arg0 <= 121) {
            method889(-14, 7, -76, 48, false, 37);
        }
        class135.field3255 = var4;
        class70.field1686 = var5;
        class9.field308 = var6;
        class52.field1318 = var8;
        class128.field3079 = var7;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZILjava/awt/Component;)V")
    public abstract void method254(int arg0, boolean arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V")
    public abstract void method253(int arg0, Graphics arg1, boolean arg2, int arg3);
}
