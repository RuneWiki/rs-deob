import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 implements Runnable {

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[Lwb;")
    public volatile class155[] field1375 = new class155[2];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
    public volatile boolean field1367 = false;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Z")
    public volatile boolean field1386 = false;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lid;")
    public static class60 field1376 = class11.method72("Bitte versuchen Sie es in ", (byte) -123);

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[[S")
    public static short[][] field1372 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lid;")
    public static class60 field1373 = class11.method72("AUS", (byte) -12);

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "[I")
    public static int[] field1383 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lid;")
    public static class60 field1382 = class11.method72("Ung-Ultiger Benutzername", (byte) -6);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field1368 = 0;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lid;")
    public static class60 field1381 = class11.method72("(Udns", (byte) -94);

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "[J")
    public static long[] field1384 = new long[32];

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "B")
    public static byte field1379;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Ldd;")
    public class26 field1385;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "[[[I")
    public static int[][][] field1380;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lh;Lh;B)V")
    public static final void method395(class49 arg0, class49 arg1, byte arg2) {
        if (arg2 != 9) {
            field1368 = 122;
        }
        field1378++;
        if (class148.field3308 == null) {
            class148.field3308 = class30.method230(class116.field2737, false, class141.field3219, class56.field1407);
        }
        if (class38.field923 == null) {
            class38.field923 = class120.method935(class56.field1407, (byte) -120, class139.field3168, class141.field3219);
        }
        if (class106.field2624 == null) {
            class106.field2624 = class120.method935(class56.field1407, (byte) -97, class16.field406, class141.field3219);
        }
        if (class38.field910 == null) {
            class38.field910 = class120.method935(class56.field1407, (byte) -121, class47.field1244, class141.field3219);
        }
        class130.method1015(0, 23, 765, 480, 0);
        class130.method1033(0, 0, 125, 23, 12425273, 9135624);
        class130.method1033(125, 0, 640, 23, 5197647, 2697513);
        arg0.method956(class155.field3528, 62, 15, 0, -1);
        if (class38.field910 != null) {
            class38.field910[1].method224(140, 1);
            arg1.method947(class124.field2870, 152, 10, 16777215, -1);
            class38.field910[0].method224(140, 12);
            arg1.method947(class133.field3026, 152, 21, 16777215, -1);
        }
        if (class106.field2624 != null) {
            short var3 = 390;
            short var4 = 500;
            short var5 = 610;
            short var6 = 280;
            if (class25.field619[0] == 0 && class105.field2588[0] == 0) {
                class106.field2624[2].method224(var6, 4);
            } else {
                class106.field2624[0].method224(var6, 4);
            }
            if (class25.field619[0] == 0 && class105.field2588[0] == 1) {
                class106.field2624[3].method224(var6 + 15, 4);
            } else {
                class106.field2624[1].method224(var6 + 15, 4);
            }
            arg0.method947(class113.field2706, var6 + 32, 17, 16777215, -1);
            if (class25.field619[0] == 1 && class105.field2588[0] == 0) {
                class106.field2624[2].method224(var3, 4);
            } else {
                class106.field2624[0].method224(var3, 4);
            }
            if (class25.field619[0] == 1 && class105.field2588[0] == 1) {
                class106.field2624[3].method224(var3 + 15, 4);
            } else {
                class106.field2624[1].method224(var3 + 15, 4);
            }
            arg0.method947(class80.field1957, var3 + 32, 17, 16777215, -1);
            if (class25.field619[0] == 2 && class105.field2588[0] == 0) {
                class106.field2624[2].method224(var4, 4);
            } else {
                class106.field2624[0].method224(var4, 4);
            }
            if (class25.field619[0] == 2 && class105.field2588[0] == 1) {
                class106.field2624[3].method224(var4 + 15, 4);
            } else {
                class106.field2624[1].method224(var4 + 15, 4);
            }
            arg0.method947(class73.field1767, var4 + 32, 17, 16777215, -1);
            if (class25.field619[0] == 3 && class105.field2588[0] == 0) {
                class106.field2624[2].method224(var5, 4);
            } else {
                class106.field2624[0].method224(var5, 4);
            }
            if (class25.field619[0] == 3 && class105.field2588[0] == 1) {
                class106.field2624[3].method224(var5 + 15, 4);
            } else {
                class106.field2624[1].method224(var5 + 15, 4);
            }
            arg0.method947(class97.field2385, var5 + 32, 17, 16777215, -1);
        }
        class130.method1015(708, 4, 50, 16, 0);
        arg1.method956(class33.field776, 733, 16, 16777215, -1);
        class10.field162 = -1;
        if (class148.field3308 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 765 / (var7 + 1);
            int var10 = 480 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var9;
                if ((var9 - 1) * var10 >= class47.field1240) {
                    var9--;
                }
                if (class47.field1240 <= (var10 - 1) * var9) {
                    var10--;
                }
                if ((var10 - 1) * var9 >= class47.field1240) {
                    var10--;
                }
            } while (var10 != var11 || var9 != var12);
            int var13 = (765 - var7 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var7 * var9 - (var9 + -1) * var13) / 2;
            int var15 = (480 - var8 * var10) / (var10 + 1);
            if (var15 > 5) {
                var15 = 5;
            }
            int var16 = var14;
            int var17 = 0;
            int var18 = (480 - (var10 - 1) * var15 - var8 * var10) / 2;
            int var19 = var18 + 23;
            for (int var20 = 0; var20 < class47.field1240; var20++) {
                class30 var21 = class80.field1986[var20];
                class60 var22 = class98.method774((byte) -121, var21.field715);
                boolean var23 = true;
                if (var21.field715 == -1) {
                    var22 = class4.field77;
                    var23 = false;
                } else if (var21.field715 > 1980) {
                    var22 = class109.field2658;
                    var23 = false;
                }
                if (class43.field1153 >= var16 && var19 <= class21.field494 && var7 + var16 > class43.field1153 && var19 + var8 > class21.field494 && var23) {
                    class10.field162 = var20;
                    class148.field3308[var21.field699 ? 1 : 0].method21(var16, var19, 128, 16777215);
                } else {
                    class148.field3308[var21.field699 ? 1 : 0].method39(var16, var19);
                }
                if (class38.field923 != null) {
                    class38.field923[var21.field713 + (var21.field699 ? 8 : 0)].method224(var16 + 29, var19);
                }
                arg0.method956(class98.method774((byte) -121, var21.field703), var16 + 15, var8 / 2 + 5 + var19, 0, -1);
                arg1.method956(var22, var16 + 60, var8 / 2 + var19 + 5, 268435455, -1);
                var19 += var8 + var15;
                var17++;
                if (var10 <= var17) {
                    var19 = var18 + 23;
                    var16 += var7 + var13;
                    var17 = 0;
                }
            }
        }
        try {
            Graphics var24 = class9.field148.getGraphics();
            class69.field1660.method63(0, 103, 0, var24);
        } catch (Exception var25) {
            class9.field148.repaint();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZII)V")
    public static final void method396(int arg0, boolean arg1, int arg2, int arg3) {
        field1374++;
        if (arg2 < ~arg3 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class144.field3258 = arg1;
        class60.field1496 = arg0;
        class14.field318 = arg3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public static final void method397(int arg0, boolean arg1) {
        if (class107.field2640.field854 >> 7 == class48.field1267 && class107.field2640.field828 >> 7 == class59.field1438) {
            class48.field1267 = 0;
        }
        if (arg0 <= 120) {
            field1383 = null;
        }
        field1371++;
        int var2 = class44.field1170;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class1 var4;
            int var5;
            if (arg1) {
                var4 = class107.field2640;
                var5 = 33538048;
            } else {
                var5 = class121.field2781[var3] << 14;
                var4 = class81.field2016[class121.field2781[var3]];
            }
            if (var4 != null && var4.method2((byte) 37)) {
                var4.field9 = false;
                int var6 = var4.field828 >> 7;
                int var7 = var4.field854 >> 7;
                if ((class22.field548 && class44.field1170 > 50 || class44.field1170 > 200) && !arg1 && var4.field875 == var4.field832) {
                    var4.field9 = true;
                }
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field26 == null || var4.field25 > class82.field2065 || var4.field23 <= class82.field2065) {
                        if ((var4.field854 & 0x7F) == 64 && (var4.field828 & 0x7F) == 64) {
                            if (class15.field341[var7][var6] == class23.field556) {
                                continue;
                            }
                            class15.field341[var7][var6] = class23.field556;
                        }
                        var4.field15 = class50.method381(class46.field1222, var4.field828, var4.field854, (byte) 10);
                        class43.field1151.method589(class46.field1222, var4.field854, var4.field828, var4.field15, 60, var4, var4.field864, var5, var4.field826);
                    } else {
                        var4.field9 = false;
                        var4.field15 = class50.method381(class46.field1222, var4.field828, var4.field854, (byte) 10);
                        class43.field1151.method612(class46.field1222, var4.field854, var4.field828, var4.field15, 60, var4, var4.field864, var5, var4.field20, var4.field5, var4.field19, var4.field29);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static final void method398(int arg0) {
        field1369++;
        try {
            if (class42.field1123 == 0) {
                if (class4.field73 != null) {
                    class4.field73.method729(false);
                    class4.field73 = null;
                }
                class42.field1123 = 1;
                class81.field2020 = null;
                field1368 = 0;
                class116.field2738 = false;
            }
            if (class42.field1123 == 1) {
                if (class81.field2020 == null) {
                    class81.field2020 = class116.field2731.method196(class90.field2230, -46, class56.field1401);
                }
                if (class81.field2020.field3145 == 2) {
                    throw new IOException();
                }
                if (class81.field2020.field3145 == 1) {
                    class4.field73 = new class90((Socket) class81.field2020.field3144, class116.field2731);
                    class81.field2020 = null;
                    class42.field1123 = 2;
                }
            }
            if (class42.field1123 == 2) {
                long var1 = class128.field2925 = class141.field3209.method430(68);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class22.field519.field2501 = 0;
                class22.field519.method818(false, 14);
                class22.field519.method818(false, var3);
                class4.field73.method730(0, 0, class22.field519.field2498, 2);
                class56.field1393.field2501 = 0;
                class42.field1123 = 3;
            }
            if (class42.field1123 == 3) {
                if (class113.field2703 != null) {
                    class113.field2703.method1190(-2736);
                }
                if (class152.field3397 != null) {
                    class152.field3397.method1190(-2736);
                }
                int var4 = class4.field73.method739(true);
                if (class113.field2703 != null) {
                    class113.field2703.method1190(-2736);
                }
                if (class152.field3397 != null) {
                    class152.field3397.method1190(-2736);
                }
                if (var4 != 0) {
                    class32.method242(var4, 8);
                    return;
                }
                class56.field1393.field2501 = 0;
                class42.field1123 = 4;
            }
            if (arg0 < 18) {
                field1379 = 67;
            }
            if (class42.field1123 == 4) {
                if (class56.field1393.field2501 < 8) {
                    int var5 = class4.field73.method735(0);
                    if (var5 > 8 - class56.field1393.field2501) {
                        var5 = 8 - class56.field1393.field2501;
                    }
                    if (var5 > 0) {
                        class4.field73.method734(class56.field1393.field2498, var5, -20, class56.field1393.field2501);
                        class56.field1393.field2501 += var5;
                    }
                }
                if (class56.field1393.field2501 == 8) {
                    class56.field1393.field2501 = 0;
                    class154.field3484 = class56.field1393.method846(-4297);
                    class42.field1123 = 5;
                }
            }
            if (class42.field1123 == 5) {
                class22.field519.field2501 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class154.field3484 >> 32), (int) class154.field3484 };
                class22.field519.method818(false, 10);
                class22.field519.method819(var6[0], (byte) 59);
                class22.field519.method819(var6[1], (byte) -98);
                class22.field519.method819(var6[2], (byte) -85);
                class22.field519.method819(var6[3], (byte) -95);
                class22.field519.method819(class116.field2731.field630, (byte) 119);
                class22.field519.method830(class141.field3209.method430(78), 70);
                class22.field519.method807((byte) 0, class141.field3218);
                class22.field519.method836(class144.field3250, class106.field2607, -14786);
                class155.field3523.field2501 = 0;
                if (class48.field1265 == 40) {
                    class155.field3523.method818(false, 18);
                } else {
                    class155.field3523.method818(false, 16);
                }
                class155.field3523.method818(false, class22.field519.field2501 + 69);
                class155.field3523.method819(463, (byte) 72);
                class155.field3523.method818(false, class22.field548 ? 1 : 0);
                class155.field3523.method819(class121.field2777.field1541, (byte) -72);
                class155.field3523.method819(class11.field185.field1541, (byte) -69);
                class155.field3523.method819(class135.field3071.field1541, (byte) -103);
                class155.field3523.method819(class125.field2879.field1541, (byte) 49);
                class155.field3523.method819(class158.field3617.field1541, (byte) -75);
                class155.field3523.method819(class12.field210.field1541, (byte) 93);
                class155.field3523.method819(class35.field883.field1541, (byte) -97);
                class155.field3523.method819(class85.field2131.field1541, (byte) 107);
                class155.field3523.method819(class56.field1407.field1541, (byte) -109);
                class155.field3523.method819(class12.field226.field1541, (byte) 20);
                class155.field3523.method819(class153.field3428.field1541, (byte) -86);
                class155.field3523.method819(class93.field2297.field1541, (byte) 89);
                class155.field3523.method819(class94.field2313.field1541, (byte) -75);
                class155.field3523.method819(class46.field1211.field1541, (byte) -117);
                class155.field3523.method819(class8.field127.field1541, (byte) 25);
                class155.field3523.method819(class50.field1280.field1541, (byte) 19);
                class155.field3523.method802(false, class22.field519.field2501, 0, class22.field519.field2498);
                class4.field73.method730(0, 0, class155.field3523.field2498, class155.field3523.field2501);
                class22.field519.method1212((byte) 91, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class56.field1393.method1212((byte) 91, var6);
                class42.field1123 = 6;
            }
            if (class42.field1123 == 6 && class4.field73.method735(0) > 0) {
                int var8 = class4.field73.method739(true);
                if (var8 == 21 && class48.field1265 == 20) {
                    class42.field1123 = 7;
                } else if (var8 == 2) {
                    class42.field1123 = 9;
                } else if (var8 == 15 && class48.field1265 == 40) {
                    class124.method979((byte) 111);
                    return;
                } else if (var8 == 23 && class51.field1295 < 1) {
                    class51.field1295++;
                    class42.field1123 = 0;
                } else {
                    class32.method242(var8, 8);
                    return;
                }
            }
            if (class42.field1123 == 7 && class4.field73.method735(0) > 0) {
                class69.field1651 = (class4.field73.method739(true) + 3) * 60;
                class42.field1123 = 8;
            }
            if (class42.field1123 == 8) {
                field1368 = 0;
                class16.method126((byte) 85, class104.method853(-122, new class60[] { class98.method774((byte) -121, class69.field1651 / 60), class28.field658 }), class43.field1156, class42.field1118);
                if (--class69.field1651 <= 0) {
                    class42.field1123 = 0;
                }
            } else {
                if (class42.field1123 == 9 && class4.field73.method735(0) >= 8) {
                    class107.field2629 = class4.field73.method739(true);
                    class19.field463 = class4.field73.method739(true) == 1;
                    class140.field3197 = class4.field73.method739(true);
                    class140.field3197 <<= 0x8;
                    class140.field3197 += class4.field73.method739(true);
                    class78.field1923 = class4.field73.method739(true);
                    class4.field73.method734(class56.field1393.field2498, 1, -2, 0);
                    class56.field1393.field2501 = 0;
                    class100.field2421 = class56.field1393.method1209(121);
                    class4.field73.method734(class56.field1393.field2498, 2, -27, 0);
                    class56.field1393.field2501 = 0;
                    class94.field2310 = class56.field1393.method808(-20054);
                    class42.field1123 = 10;
                }
                if (class42.field1123 != 10) {
                    field1368++;
                    if (field1368 > 2000) {
                        if (class51.field1295 < 1) {
                            class51.field1295++;
                            if (class90.field2230 == class60.field1442) {
                                class90.field2230 = class125.field2881;
                            } else {
                                class90.field2230 = class60.field1442;
                            }
                            class42.field1123 = 0;
                        } else {
                            class32.method242(-3, 8);
                        }
                    }
                } else if (class4.field73.method735(0) >= class94.field2310) {
                    class56.field1393.field2501 = 0;
                    class4.field73.method734(class56.field1393.field2498, class94.field2310, -117, 0);
                    class11.method74((byte) 10);
                    class102.field2476 = -1;
                    class42.method336(false, false);
                    class100.field2421 = -1;
                }
            }
        } catch (IOException var9) {
            if (class51.field1295 < 1) {
                if (class90.field2230 == class60.field1442) {
                    class90.field2230 = class125.field2881;
                } else {
                    class90.field2230 = class60.field1442;
                }
                class42.field1123 = 0;
                class51.field1295++;
            } else {
                class32.method242(-2, 8);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static void method399(int arg0) {
        field1372 = null;
        field1376 = null;
        field1382 = null;
        field1383 = null;
        field1384 = null;
        if (arg0 == 10804) {
            field1381 = null;
            field1380 = null;
            field1373 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "run", descriptor = "()V")
    public final void run() {
        this.field1386 = true;
        try {
            while (!this.field1367) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class155 var2 = this.field1375[var1];
                    if (var2 != null) {
                        var2.method1186(1024);
                    }
                }
                class128.method1007((byte) 119, 10L);
                class106.method872(this.field1385, null, -51);
            }
        } catch (Exception var9) {
            class73.method558(-1, null, var9);
        } finally {
            Object var6 = null;
            this.field1386 = false;
        }
        field1387++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILdd;BLof;)V")
    public static final void method400(int arg0, class26 arg1, byte arg2, class103 arg3) {
        field1370++;
        class10 var4 = new class10();
        var4.field165 = arg3.method829((byte) -107);
        var4.field160 = arg3.method803(false);
        var4.field166 = new int[var4.field165];
        var4.field161 = new byte[var4.field165][][];
        var4.field164 = new int[var4.field165];
        var4.field169 = new class138[var4.field165];
        var4.field163 = new int[var4.field165];
        if (arg2 >= -82) {
            method395(null, null, (byte) 62);
        }
        var4.field173 = new class138[var4.field165];
        for (int var5 = 0; var5 < var4.field165; var5++) {
            try {
                int var6 = arg3.method829((byte) 43);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method841(27330).method440(0));
                    String var18 = new String(arg3.method841(27330).method440(0));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method803(false);
                    }
                    var4.field164[var5] = var6;
                    var4.field166[var5] = var19;
                    var4.field169[var5] = arg1.method200(var18, -119, class24.method190(-122, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method841(27330).method440(0));
                    String var8 = new String(arg3.method841(27330).method440(0));
                    int var9 = arg3.method829((byte) 72);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method841(27330).method440(0));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method803(false);
                            var12[var13] = new byte[var14];
                            arg3.method825(var14, var12[var13], 0, 271632);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field164[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class24.method190(-128, var10[var16]);
                    }
                    var4.field173[var5] = arg1.method195(var8, -23273, class24.method190(-52, var7), var15);
                    var4.field161[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field163[var5] = -1;
            } catch (SecurityException var21) {
                var4.field163[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field163[var5] = -3;
            } catch (Exception var23) {
                var4.field163[var5] = -4;
            } catch (Throwable var24) {
                var4.field163[var5] = -5;
            }
        }
        class112.field2686.method508(var4, (byte) 104);
    }
}
