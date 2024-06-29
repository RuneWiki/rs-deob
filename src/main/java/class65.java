import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class65 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lrc;")
    public static class105 field1446 = class43.method374(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lrc;")
    public static class105 field1457 = class43.method374("Der Anmelde)2Server ist offline)3", 0);

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lrc;")
    private static class105 field1450 = class43.method374("We suspect someone knows your password)3", 0);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lrc;")
    public static class105 field1455 = class43.method374("backleft2", 0);

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lrc;")
    public static class105 field1466 = field1450;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field1468 = 0;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lrc;")
    public static class105 field1463 = class43.method374("Sichtbare Karte vorbereitet)3", 0);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "J")
    public long field1448;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lte;")
    public static class119 field1459;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lke;")
    public class65 field1449;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "Lke;")
    public class65 field1467;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "[Lbd;")
    public static class11[] field1456;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([BZBI)V", line = 8)
    public static final void method547(byte[] arg0, boolean arg1, byte arg2, int arg3) {
        field1464++;
        if (arg2 <= 37) {
            method550(30, -49, 94, null);
        }
        if (class74.field1634 == null) {
            return;
        }
        if (class64.field1431 >= 0) {
            class74.field1634.method738((byte) 112);
            class64.field1431 = -1;
            class67.field1518 = 20;
            class125.field3054 = 0;
            class112.field2619 = null;
        }
        if (arg0 == null) {
            return;
        }
        if (class67.field1518 > 0) {
            class74.field1634.method735(arg3, false);
            class67.field1518 = 0;
        }
        class64.field1431 = arg3;
        class74.field1634.method733(arg0, arg1, arg3, 76);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 44)
    public static void method548(int arg0) {
        field1455 = null;
        field1450 = null;
        field1446 = null;
        field1459 = null;
        if (arg0 != 14833) {
            method548(44);
        }
        field1466 = null;
        field1457 = null;
        field1463 = null;
        field1456 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 61)
    public static final void method549(byte arg0) {
        field1452++;
        if (class36.field831 == 0) {
            class130.field3161 = new class62(4, 104, 104, class9.field151);
            for (int var1 = 0; var1 < 4; var1++) {
                class116.field2717[var1] = new class110(104, 104);
            }
            class85.field1925 = new class27(512, 512);
            class122.field2986 = 5;
            class37.field865 = class19.field473;
            class36.field831 = 20;
        } else if (class36.field831 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class38.field885[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class62.method510(var2, 500, 800, 512, 334);
            class36.field831 = 30;
            class122.field2986 = 10;
            class37.field865 = class15.field318;
        } else if (class36.field831 == 30) {
            class106.field2439 = class59.method475(0, false, true, true, true);
            class55.field1093 = class59.method475(1, false, true, true, true);
            class107.field2465 = class59.method475(2, true, true, true, false);
            class31.field737 = class59.method475(3, false, true, true, true);
            class72.field1589 = class59.method475(4, false, true, true, true);
            class14.field275 = class59.method475(5, true, true, true, true);
            class57.field1203 = class59.method475(6, true, false, true, true);
            class66.field1501 = class59.method475(7, false, true, true, true);
            class111.field2591 = class59.method475(8, false, true, true, true);
            class42.field945 = class59.method475(9, false, true, true, true);
            class90.field2073 = class59.method475(10, false, true, true, true);
            class130.field3163 = class59.method475(11, false, true, true, true);
            class126.field3066 = class59.method475(12, false, true, true, true);
            class37.field865 = class97.field2245;
            class122.field2986 = 20;
            class36.field831 = 40;
        } else if (class36.field831 == 40) {
            byte var7 = 0;
            int var8 = var7 + class106.field2439.method645(true) * 5 / 100;
            int var9 = var8 + class55.field1093.method645(true) * 5 / 100;
            int var10 = var9 + class107.field2465.method645(true) * 5 / 100;
            int var11 = var10 + class31.field737.method645(true) * 5 / 100;
            int var12 = var11 + class72.field1589.method645(true) * 5 / 100;
            int var13 = var12 + class14.field275.method645(true) * 5 / 100;
            int var14 = var13 + class57.field1203.method645(true) * 5 / 100;
            int var15 = var14 + class66.field1501.method645(true) * 40 / 100;
            int var16 = var15 + class111.field2591.method645(true) * 5 / 100;
            int var17 = var16 + class42.field945.method645(true) * 5 / 100;
            int var18 = var17 + class90.field2073.method645(true) * 5 / 100;
            int var19 = var18 + class130.field3163.method645(true) * 5 / 100;
            int var20 = var19 + class126.field3066.method645(true) * 5 / 100;
            if (var20 == 100) {
                class37.field865 = class78.field1769;
                class122.field2986 = 30;
                class36.field831 = 45;
            } else {
                if (var20 != 0) {
                    class37.field865 = class108.method878(new class105[] { class127.field3079, class75.method637(var20, 8241), class10.field201 }, 2867);
                }
                class122.field2986 = 30;
            }
        } else if (class36.field831 == 45) {
            class89.method736(0, !class109.field2520, 27885, class122.field2991);
            class34.field787 = class128.method1030(class122.field2991, (byte) -98, class41.field935);
            class106.field2436 = new class16(22050, class76.field1698);
            class36.field831 = 50;
            class122.field2986 = 35;
            class37.field865 = class55.field1109;
        } else if (class36.field831 == 50) {
            int var21 = 0;
            if (class74.field1624 == null) {
                class74.field1624 = class93.method771(class43.field992, class111.field2591, arg0 + 95, class26.field601);
            } else {
                var21++;
            }
            if (class6.field79 == null) {
                class6.field79 = class93.method771(class43.field992, class111.field2591, 1, class107.field2452);
            } else {
                var21++;
            }
            if (class100.field2285 == null) {
                class100.field2285 = class93.method771(class43.field992, class111.field2591, arg0 ^ 0xFFFFFFA3, class109.field2518);
            } else {
                var21++;
            }
            if (var21 < 3) {
                class37.field865 = class108.method878(new class105[] { class74.field1653, class75.method637(var21 * 100 / 3, arg0 ^ 0xFFFFDF93), class10.field201 }, 2867);
                class122.field2986 = 40;
            } else {
                class36.field831 = 60;
                class122.field2986 = 40;
                class37.field865 = class16.field343;
            }
        } else {
            if (arg0 != -94) {
                field1463 = null;
            }
            if (class36.field831 == 60) {
                int var22 = class127.method1020(class90.field2073, class111.field2591, 3451);
                int var23 = class90.method741(107);
                if (var22 < var23) {
                    class37.field865 = class108.method878(new class105[] { class34.field796, class75.method637(var22 * 100 / var23, 8241), class10.field201 }, arg0 ^ 0xFFFFF491);
                    class122.field2986 = 50;
                } else {
                    class37.field865 = class51.field1076;
                    class122.field2986 = 50;
                    class136.method1069((byte) 45, 5);
                    class36.field831 = 70;
                }
            } else if (class36.field831 == 70) {
                if (class107.field2465.method758(2)) {
                    class113.method927(-4, class107.field2465);
                    class61.method485(arg0 ^ 0xFFFFC0C8, class107.field2465);
                    class50.method398(-24380, class107.field2465, class66.field1501);
                    class71.method606(class107.field2465, class109.field2520, arg0 + 9075, class66.field1501);
                    class26.method241(class107.field2465, class66.field1501, (byte) -17);
                    class35.method333(class74.field1624, class61.field1362, class66.field1501, 10, class107.field2465);
                    method555(class107.field2465, class106.field2439, class55.field1093, arg0 + 3);
                    class28.method268(120, class66.field1501, class107.field2465);
                    class106.method867(class107.field2465, -19474);
                    class29.method277(class107.field2465, false);
                    class29.method275(class66.field1501, class111.field2591, class31.field737, 29655);
                    class36.field831 = 80;
                    class122.field2986 = 60;
                    class37.field865 = class134.field3277;
                } else {
                    class37.field865 = class108.method878(new class105[] { class57.field1183, class75.method637(class107.field2465.method639(0), arg0 ^ 0xFFFFDF93), class10.field201 }, 2867);
                    class122.field2986 = 60;
                }
            } else if (class36.field831 == 80) {
                int var24 = 0;
                if (class34.field800 == null) {
                    class34.field800 = class88.method722(class43.field992, class111.field2591, true, class26.field591);
                } else {
                    var24++;
                }
                if (class57.field1187 == null) {
                    class57.field1187 = class88.method722(class43.field992, class111.field2591, true, class80.field1801);
                } else {
                    var24++;
                }
                if (class96.field2214 == null) {
                    class96.field2214 = class61.method488(class111.field2591, class43.field992, class116.field2716, -10);
                } else {
                    var24++;
                }
                if (class73.field1610 == null) {
                    class73.field1610 = class61.method489(class43.field992, class126.field3055, arg0 ^ 0xFFFFE854, class111.field2591);
                } else {
                    var24++;
                }
                if (class50.field1058 == null) {
                    class50.field1058 = class61.method489(class43.field992, class129.field3140, 6134, class111.field2591);
                } else {
                    var24++;
                }
                if (class28.field622 == null) {
                    class28.field622 = class61.method489(class43.field992, class22.field538, 6134, class111.field2591);
                } else {
                    var24++;
                }
                if (class75.field1668 == null) {
                    class75.field1668 = class61.method489(class43.field992, class41.field938, 6134, class111.field2591);
                } else {
                    var24++;
                }
                if (class7.field112 == null) {
                    class7.field112 = class61.method489(class43.field992, class111.field2599, 6134, class111.field2591);
                } else {
                    var24++;
                }
                if (class72.field1600 == null) {
                    class72.field1600 = class88.method722(class43.field992, class111.field2591, true, class133.field3236);
                } else {
                    var24++;
                }
                if (class51.field1080 == null) {
                    class51.field1080 = class61.method489(class43.field992, class74.field1643, 6134, class111.field2591);
                } else {
                    var24++;
                }
                if (class23.field558 == null) {
                    class23.field558 = class61.method489(class43.field992, class35.field822, 6134, class111.field2591);
                } else {
                    var24++;
                }
                if (class17.field355 == null) {
                    class17.field355 = class61.method489(class43.field992, class74.field1644, arg0 ^ 0xFFFFE854, class111.field2591);
                } else {
                    var24++;
                }
                if (class23.field560 == null) {
                    class23.field560 = class61.method488(class111.field2591, class43.field992, class19.field489, arg0 ^ 0x54);
                } else {
                    var24++;
                }
                if (class74.field1652 == null) {
                    class74.field1652 = class61.method488(class111.field2591, class43.field992, class28.field634, arg0 ^ 0x54);
                } else {
                    var24++;
                }
                if (var24 < 14) {
                    class37.field865 = class108.method878(new class105[] { class127.field3090, class75.method637(var24 * 100 / 14, 8241), class10.field201 }, 2867);
                    class122.field2986 = 70;
                } else {
                    class57.field1187.method255();
                    int var25 = (int) (Math.random() * 21.0D) - 10;
                    int var26 = (int) (Math.random() * 21.0D) - 10;
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    int var28 = (int) (Math.random() * 41.0D) - 20;
                    for (int var29 = 0; var29 < class73.field1610.length; var29++) {
                        class73.field1610[var29].method252(var27 + var28, var25 + var28, var26 + var28);
                    }
                    class96.field2214[0].method133(var27 + var28, var25 + var28, var26 + var28);
                    class37.field865 = class22.field540;
                    class122.field2986 = 70;
                    class36.field831 = 85;
                }
            } else if (class36.field831 == 85) {
                int var30 = class9.method124(class111.field2591, -11289);
                int var31 = class58.method465(true);
                if (var30 < var31) {
                    class37.field865 = class108.method878(new class105[] { class7.field144, class75.method637(var30 * 100 / var31, 8241), class10.field201 }, 2867);
                    class122.field2986 = 80;
                } else {
                    class122.field2986 = 80;
                    class37.field865 = class61.field1358;
                    class36.field831 = 90;
                }
            } else if (class36.field831 == 90) {
                if (class42.field945.method758(2)) {
                    class30 var32 = new class30(class42.field945, class111.field2591, 20, 0.8D, class109.field2520 ? 64 : 128);
                    class38.method358(var32);
                    class38.method357(0.8D);
                    class122.field2986 = 90;
                    class36.field831 = 110;
                    class37.field865 = class88.field2013;
                } else {
                    class37.field865 = class108.method878(new class105[] { class67.field1512, class75.method637(class42.field945.method639(0), arg0 ^ 0xFFFFDF93), class10.field201 }, 2867);
                    class122.field2986 = 90;
                }
            } else if (class36.field831 == 110) {
                class73.field1609 = new class97();
                class122.field2991.method318(10, arg0 - 20, class73.field1609);
                class37.field865 = class132.field3217;
                class122.field2986 = 94;
                class36.field831 = 120;
            } else if (class36.field831 == 120) {
                if (class90.field2073.method756(class130.field3156, -30836, class43.field992)) {
                    class75 var33 = new class75(class90.field2073.method769(class130.field3156, false, class43.field992));
                    class17.method179(var33, true);
                    class37.field865 = class51.field1071;
                    class36.field831 = 130;
                    class122.field2986 = 96;
                } else {
                    class37.field865 = class108.method878(new class105[] { class66.field1481, class14.field272 }, 2867);
                    class122.field2986 = 96;
                }
            } else if (class36.field831 == 130) {
                if (!class31.field737.method758(2)) {
                    class37.field865 = class108.method878(new class105[] { class134.field3250, class75.method637(class31.field737.method639(0) * 4 / 5, 8241), class10.field201 }, arg0 ^ 0xFFFFF491);
                    class122.field2986 = 100;
                } else if (class126.field3066.method758(2)) {
                    class37.field865 = class125.field3041;
                    class36.field831 = 140;
                    class122.field2986 = 100;
                } else {
                    class37.field865 = class108.method878(new class105[] { class134.field3250, class75.method637(class126.field3066.method639(arg0 ^ 0xFFFFFFA2) / 5 + 80, arg0 + 8335), class10.field201 }, arg0 ^ 0xFFFFF491);
                    class122.field2986 = 100;
                }
            } else if (class36.field831 == 140) {
                class136.method1069((byte) 45, 10);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILeb;)V", line = 471)
    public static final void method550(int arg0, int arg1, int arg2, class27 arg3) {
        field1460++;
        if (arg3 == null) {
            return;
        }
        int var4 = client.field432 + class12.field249 & 0x7FF;
        int var5 = arg2 * arg2 + arg1 * arg1;
        if (var5 > 6400) {
            return;
        }
        int var6 = class56.field1151[var4];
        int var7 = var6 * 256 / (class35.field807 + 256);
        if (arg0 <= 113) {
            field1456 = null;
        }
        int var8 = class56.field1159[var4];
        int var9 = var8 * 256 / (class35.field807 + 256);
        int var10 = arg1 * var7 + arg2 * var9 >> 16;
        int var11 = arg1 * var9 - arg2 * var7 >> 16;
        if (var5 > 2500) {
            arg3.method249(class85.field1927, var10 + 94 + 4 - arg3.field612 / 2, -var11 + 79 + -(arg3.field611 / 2));
        } else {
            arg3.method265(var10 + 98 - arg3.field612 / 2, -(arg3.field611 / 2) + 83 + -var11 - 4);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 506)
    public final void method551(int arg0) {
        int var2 = 54 % (-arg0 / 37);
        field1462++;
        if (this.field1467 != null) {
            this.field1467.field1449 = this.field1449;
            this.field1449.field1467 = this.field1467;
            this.field1467 = null;
            this.field1449 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 539)
    public static final void method552(Component arg0, int arg1) {
        field1469++;
        if (arg1 != 40) {
            field1455 = null;
        }
        arg0.removeMouseListener(class87.field1974);
        arg0.removeMouseMotionListener(class87.field1974);
        arg0.removeFocusListener(class87.field1974);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(JI)Lrc;", line = 552)
    public static final class105 method553(long arg0, int arg1) {
        field1465++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg0;
            if (arg1 != -31825) {
                return null;
            }
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class39.field910[(int) (var8 - arg0 * 37L)];
            }
            class105 var7 = new class105();
            var7.field2417 = var6;
            var7.field2383 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)Z", line = 609)
    public final boolean method554(byte arg0) {
        field1447++;
        int var2 = -100 % ((-arg0 - 6) / 48);
        return this.field1467 != null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lpb;Lpb;Lpb;I)V", line = 640)
    private static final void method555(class92 arg0, class92 arg1, class92 arg2, int arg3) {
        field1461++;
        class128.field3119 = arg2;
        if (arg3 > -21) {
            field1468 = -55;
        }
        class60.field1335 = arg0;
        class35.field821 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V", line = 675)
    public static final void method556(int arg0, int arg1, int arg2) {
        field1458++;
        long var3 = (long) ((arg2 << arg1) + arg0);
        class108 var5 = (class108) class97.field2232.method624((byte) 93, var3);
        if (var5 != null) {
            class74.field1635.method180(32, var5);
        }
    }
}
