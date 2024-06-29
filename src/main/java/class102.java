import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class102 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2562 = 0;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "La;")
    private static class1 field2568 = class113.method934(-11538, "glow1:");

    @OriginalMember(owner = "client!r", name = "b", descriptor = "La;")
    private static class1 field2563 = class113.method934(-11538, "Enter amount:");

    @OriginalMember(owner = "client!r", name = "d", descriptor = "La;")
    public static class1 field2565 = class113.method934(-11538, "Passwort: ");

    @OriginalMember(owner = "client!r", name = "r", descriptor = "La;")
    public static class1 field2579 = field2563;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "La;")
    public static class1 field2567 = class113.method934(-11538, "@gre@");

    @OriginalMember(owner = "client!r", name = "t", descriptor = "La;")
    private static class1 field2581 = class113.method934(-11538, "Loaded wordpack");

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[Lad;")
    public static class5[] field2572 = new class5[4];

    @OriginalMember(owner = "client!r", name = "q", descriptor = "La;")
    public static class1 field2578 = field2581;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[[I")
    public static int[][] field2580 = new int[104][104];

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field2575 = 0;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "La;")
    private static class1 field2577 = class113.method934(-11538, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!r", name = "v", descriptor = "La;")
    public static class1 field2583 = field2577;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "La;")
    public static class1 field2566 = class113.method934(-11538, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!r", name = "A", descriptor = "La;")
    public static class1 field2588 = class113.method934(-11538, "");

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "La;")
    private static class1 field2574 = class113.method934(-11538, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!r", name = "y", descriptor = "La;")
    public static class1 field2586 = field2568;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "La;")
    public static class1 field2585 = field2574;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "[La;")
    public static class1[] field2589 = new class1[500];

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lwc;")
    public static class134 field2590;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
    public static int[] field2573;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "[I")
    public static int[] field2591;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)[B", line = 7)
    public static final byte[] method866(byte[] arg0, int arg1) {
        class8 var2 = new class8(arg0);
        field2564++;
        int var3 = var2.method145(false);
        if (arg1 != 9) {
            method868(14);
        }
        int var4 = var2.method168(-4750);
        if (var4 < 0 || class103.field2600 != 0 && class103.field2600 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method174(var8, 0, var4, (byte) 45);
            return var8;
        } else {
            int var5 = var2.method168(-4750);
            if (var5 < 0 || class103.field2600 != 0 && var5 > class103.field2600) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class41.method447(var6, var5, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var9) {
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)Lh;", line = 73)
    public static final class42 method867(byte arg0, int arg1) {
        field2587++;
        if (arg0 >= -95) {
            field2565 = null;
        }
        class42 var2 = (class42) class39.field1061.method264((long) arg1, (byte) 119);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class113.field2802.method218(arg1, 113, 9);
        class42 var4 = new class42();
        var4.field1138 = arg1;
        if (var3 != null) {
            var4.method454(true, new class8(var3));
        }
        var4.method460((byte) -77);
        class39.field1061.method263(-7208, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 104)
    public static final void method868(int arg0) {
        field2584++;
        class63.method613((byte) -34, false);
        class78.field1925 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class1.field61.length; var2++) {
            if (class92.field2294[var2] != -1 && class1.field61[var2] == null) {
                class1.field61[var2] = class128.field3134.method218(0, 122, class92.field2294[var2]);
                if (class1.field61[var2] == null) {
                    class78.field1925++;
                    var1 = false;
                }
            }
            if (class24.field743[var2] != -1 && class105.field2636[var2] == null) {
                class105.field2636[var2] = class128.field3134.method222(class24.field743[var2], 0, class89.field2173[var2], 20582);
                if (class105.field2636[var2] == null) {
                    class78.field1925++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class134.field3304 = 1;
            return;
        }
        boolean var3 = true;
        class95.field2361 = 0;
        for (int var4 = 0; var4 < class1.field61.length; var4++) {
            byte[] var56 = class105.field2636[var4];
            if (var56 != null) {
                int var57 = (class39.field1079[var4] & 0xFF) * 64 - class53.field1411;
                int var58 = (class39.field1079[var4] >> 8) * 64 - class28.field807;
                if (class113.field2776) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class73.method686((byte) -67, var56, var58, var57);
            }
        }
        if (!var3) {
            class134.field3304 = 2;
            return;
        }
        if (arg0 >= -37) {
            method866(null, 95);
        }
        if (class134.field3304 != 0) {
            class103.method875(0, class133.field3255, true, class42.field1134);
        }
        class62.method598(0);
        class130.field3186.method55();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            field2572[var5].method111(16777216);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class34.field899[var6][var54][var55] = 0;
                }
            }
        }
        class131.method1033(true);
        int var7 = class1.field61.length;
        class78.method721(118);
        class63.method613((byte) -34, true);
        if (!class113.field2776) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class39.field1079[var8] & 0xFF) * 64 - class53.field1411;
                int var18 = (class39.field1079[var8] >> 8) * 64 - class28.field807;
                byte[] var19 = class1.field61[var8];
                if (var19 != null) {
                    class47.method489(field2572, (class103.field2607 - 6) * 8, var19, -6, var18, var17, (class31.field830 - 6) * 8);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class39.field1079[var9] >> 8) * 64 - class28.field807;
                byte[] var15 = class1.field61[var9];
                int var16 = (class39.field1079[var9] & 0xFF) * 64 - class53.field1411;
                if (var15 == null && class31.field830 < 800) {
                    class121.method992(var16, (byte) 103, 64, 64, var14);
                }
            }
            class63.method613((byte) -34, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class105.field2636[var10];
                if (var11 != null) {
                    int var12 = (class39.field1079[var10] >> 8) * 64 - class28.field807;
                    int var13 = (class39.field1079[var10] & 0xFF) * 64 - class53.field1411;
                    class54.method538(var12, class130.field3186, field2572, var11, var13, (byte) -115);
                }
            }
        }
        if (class113.field2776) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class34.field909[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 1 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 24 & 0x3;
                            int var41 = var36 >> 3 & 0x7FF;
                            int var42 = (var39 / 8 << 8) + (var41 / 8);
                            for (int var43 = 0; var43 < class39.field1079.length; var43++) {
                                if (class39.field1079[var43] == var42 && class1.field61[var43] != null) {
                                    class9.method187(var35 * 8, 13941, (var39 & 0x7) * 8, var40, var20, var34 * 8, (var41 & 0x7) * 8, var38, class1.field61[var43], field2572);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class82.method740(var35 * 8, var20, 1, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class34.field909[0][var21][var32];
                    if (var33 == -1) {
                        class121.method992(var32 * 8, (byte) 120, 8, 8, var21 * 8);
                    }
                }
            }
            class63.method613((byte) -34, true);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class34.field909[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 14 & 0x3FF;
                            int var28 = var25 >> 1 & 0x3;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var27 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < class39.field1079.length; var31++) {
                                if (class39.field1079[var31] == var30 && class105.field2636[var31] != null) {
                                    class50.method524((var27 & 0x7) * 8, class130.field3186, 0, var22, var28, var26, class105.field2636[var31], var24 * 8, field2572, (var29 & 0x7) * 8, var23 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class63.method613((byte) -34, true);
        class62.method598(0);
        class39.method426(class130.field3186, 27324, field2572);
        class63.method613((byte) -34, true);
        int var44 = class129.field3178;
        if (class2.field76 < var44) {
            var44 = class2.field76;
        }
        if (var44 < class2.field76 - 1) {
            int var45 = class2.field76 - 1;
        }
        if (class93.field2335) {
            class130.field3186.method93(class129.field3178);
        } else {
            class130.field3186.method93(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class127.method1014((byte) -80, var53, var46);
            }
        }
        class39.method430((byte) 118);
        class93.field2325.method268((byte) -43);
        if (class75.field1862 != null) {
            class122.field3035++;
            class70.field1729.method416(11453, 121);
            class70.field1729.method183(40, 1057001181);
        }
        if (!class113.field2776) {
            int var47 = (class103.field2607 - 6) / 8;
            int var48 = (class31.field830 - 6) / 8;
            int var49 = (class31.field830 + 6) / 8;
            int var50 = (class103.field2607 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var50 + 1; var51++) {
                for (int var52 = var48 - 1; var52 <= var49 + 1; var52++) {
                    if (var47 > var51 || var51 > var50 || var52 < var48 || var52 > var49) {
                        class128.field3134.method241(0, class116.method959(74, new class1[] { class92.field2308, class48.method504(var51, -1), class14.field478, class48.method504(var52, -1) }));
                        class128.field3134.method241(0, class116.method959(-102, new class1[] { class48.field1261, class48.method504(var51, -1), class14.field478, class48.method504(var52, -1) }));
                    }
                }
            }
        }
        if (class42.field1144 == -1) {
            class34.method400(30, -54);
        } else {
            class34.method400(35, -88);
        }
        class109.method913(-65);
        class70.field1729.method416(11453, 178);
        class43.method467(126);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V", line = 610)
    public static final void method869(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2570++;
        int var5 = 63 % ((arg1 + 53) / 57);
        for (class12 var6 = (class12) class16.field516.method805((byte) -90); var6 != null; var6 = (class12) class16.field516.method812(-4)) {
            if (var6.field421 != -1 || var6.field429 != null) {
                int var7 = 0;
                if (arg0 > var6.field437) {
                    var7 += arg0 - var6.field437;
                } else if (arg0 < var6.field418) {
                    var7 += var6.field418 - arg0;
                }
                if (arg4 > var6.field431) {
                    var7 += arg4 - var6.field431;
                } else if (arg4 < var6.field427) {
                    var7 += var6.field427 - arg4;
                }
                if (var6.field424 < var7 - 64 || class62.field1562 == 0 || var6.field417 != arg2) {
                    if (var6.field425 != null) {
                        class99.field2438.method136(var6.field425);
                        var6.field425 = null;
                    }
                    if (var6.field434 != null) {
                        class99.field2438.method136(var6.field434);
                        var6.field434 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var6.field424 - var7) * class62.field1562 / var6.field424;
                    if (var6.field425 != null) {
                        var6.field425.method585(var8);
                    } else if (var6.field421 >= 0) {
                        class77 var9 = class77.method714(class80.field2034, var6.field421, 0);
                        if (var9 != null) {
                            class135 var10 = var9.method713().method1058(class108.field2708);
                            class61 var11 = class61.method593(var10, 100, var8);
                            var11.method588(-1);
                            class99.field2438.method127(var11);
                            var6.field425 = var11;
                        }
                    }
                    if (var6.field434 != null) {
                        var6.field434.method585(var8);
                        if (!var6.field434.method592()) {
                            var6.field434 = null;
                        }
                    } else if (var6.field429 != null && (var6.field438 -= arg3) <= 0) {
                        int var12 = (int) ((double) var6.field429.length * Math.random());
                        class77 var13 = class77.method714(class80.field2034, var6.field429[var12], 0);
                        if (var13 != null) {
                            class135 var14 = var13.method713().method1058(class108.field2708);
                            class61 var15 = class61.method593(var14, 100, var8);
                            var15.method588(0);
                            class99.field2438.method127(var15);
                            var6.field438 = var6.field436 + (int) ((double) (var6.field426 - var6.field436) * Math.random());
                            var6.field434 = var15;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 748)
    public static void method870(int arg0) {
        field2580 = null;
        field2568 = null;
        field2565 = null;
        field2563 = null;
        field2567 = null;
        field2572 = null;
        field2586 = null;
        field2581 = null;
        field2573 = null;
        field2583 = null;
        field2588 = null;
        field2566 = null;
        field2577 = null;
        field2585 = null;
        field2590 = null;
        if (arg0 != 10582) {
            field2563 = null;
        }
        field2578 = null;
        field2591 = null;
        field2589 = null;
        field2574 = null;
        field2579 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILbd;)V", line = 809)
    public static final void method871(int arg0, class11 arg1) {
        if (arg0 != -17552) {
            method867((byte) -94, 97);
        }
        field2582++;
        class62.field1558 = arg1;
    }
}
