import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 {

    @OriginalMember(owner = "client!id", name = "h", descriptor = "La;")
    private static class1 field1370 = class113.method934(-11538, "Connecting to update server");

    @OriginalMember(owner = "client!id", name = "c", descriptor = "La;")
    public static class1 field1365 = field1370;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "La;")
    private static class1 field1382 = class113.method934(-11538, "Add friend");

    @OriginalMember(owner = "client!id", name = "e", descriptor = "La;")
    public static class1 field1367 = field1382;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    private static CRC32 field1366 = new CRC32();

    @OriginalMember(owner = "client!id", name = "w", descriptor = "La;")
    public static class1 field1385 = class113.method934(-11538, "blinken2:");

    @OriginalMember(owner = "client!id", name = "x", descriptor = "La;")
    public static class1 field1386 = class113.method934(-11538, "@red@");

    @OriginalMember(owner = "client!id", name = "y", descriptor = "La;")
    public static class1 field1387 = null;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "La;")
    public static class1 field1389 = class113.method934(-11538, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field1390 = -1;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "La;")
    public static class1 field1391 = class113.method934(-11538, "huffman");

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lu;")
    public static class120 field1381;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lvb;")
    public class128 field1376;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Le;")
    public static class25 field1369;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Led;")
    public static class29 field1383;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Loc;")
    public static class87 field1384;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
    public static int[] field1388;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[Ljd;")
    public static class58[] field1379;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILnb;)V", line = 5)
    public static final void method526(int arg0, int arg1, class80 arg2) {
        class38.method424(arg1, arg2.field1966, arg2.field1975, 4976905);
        int var3 = -63 % ((41 - arg0) / 41);
        field1374++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V", line = 17)
    public static final void method527(boolean arg0, int arg1) {
        class113.field2776 = arg0;
        if (class113.field2776) {
            int var2 = class15.field489.method146(arg1 + 59592);
            int var3 = class15.field489.method181(false);
            int var4 = class15.field489.method146(65280);
            int var5 = class15.field489.method157((byte) -70);
            int var6 = class15.field489.method146(arg1 + 59592);
            class15.field489.method418(arg1 ^ 0x1625);
            for (int var7 = 0; var7 < 4; var7++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class15.field489.method413(1, (byte) -65);
                        if (var24 == 1) {
                            class34.field909[var7][var22][var23] = class15.field489.method413(26, (byte) -65);
                        } else {
                            class34.field909[var7][var22][var23] = -1;
                        }
                    }
                }
            }
            class15.field489.method409((byte) -110);
            int var8 = (class100.field2550 - class15.field489.field268) / 16;
            class89.field2173 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class89.field2173[var9][var21] = class15.field489.method184(-64);
                }
            }
            class92.field2294 = new int[var8];
            class1.field61 = new byte[var8][];
            class24.field743 = new int[var8];
            class105.field2636 = new byte[var8][];
            class39.field1079 = new int[var8];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class34.field909[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 0x3FF;
                            int var16 = var14 >> 3 & 0x7FF;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class39.field1079[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class39.field1079[var10] = var17;
                                int var19 = var17 & 0xFF;
                                int var20 = var17 >> 8 & 0xFF;
                                class92.field2294[var10] = class128.field3134.method229(class64.method626(arg1, 5688), class116.method959(85, new class1[] { class92.field2308, class48.method504(var20, class64.method626(arg1, -5689)), class14.field478, class48.method504(var19, -1) }));
                                class24.field743[var10] = class128.field3134.method229(0, class116.method959(118, new class1[] { class48.field1261, class48.method504(var20, -1), class14.field478, class48.method504(var19, -1) }));
                                var10++;
                            }
                        }
                    }
                }
            }
            class80.method734(var3, arg1 - 6688, var6, var4, var2, var5);
        } else {
            int var25 = class15.field489.method146(65280);
            int var26 = class15.field489.method167((byte) -70);
            int var27 = class15.field489.method138((byte) 110);
            int var28 = class15.field489.method181(false);
            int var29 = class15.field489.method148((byte) -69);
            int var30 = (class100.field2550 - class15.field489.field268) / 16;
            class89.field2173 = new int[var30][4];
            for (int var31 = 0; var31 < var30; var31++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class89.field2173[var31][var37] = class15.field489.method147(-128);
                }
            }
            class39.field1079 = new int[var30];
            class1.field61 = new byte[var30][];
            boolean var32 = false;
            class105.field2636 = new byte[var30][];
            if ((var26 / 8 == 48 || var26 / 8 == 49) && var28 / 8 == 48) {
                var32 = true;
            }
            class92.field2294 = new int[var30];
            if (var26 / 8 == 48 && var28 / 8 == 148) {
                var32 = true;
            }
            class24.field743 = new int[var30];
            int var33 = 0;
            for (int var34 = (var26 - 6) / 8; var34 <= (var26 + 6) / 8; var34++) {
                for (int var35 = (var28 - 6) / 8; var35 <= (var28 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class39.field1079[var33] = var36;
                        class92.field2294[var33] = class128.field3134.method229(0, class116.method959(class64.method626(arg1, -5655), new class1[] { class92.field2308, class48.method504(var34, -1), class14.field478, class48.method504(var35, -1) }));
                        class24.field743[var33] = class128.field3134.method229(0, class116.method959(-84, new class1[] { class48.field1261, class48.method504(var34, -1), class14.field478, class48.method504(var35, class64.method626(arg1, -5689)) }));
                        var33++;
                    }
                }
            }
            class80.method734(var27, -1000, var28, var26, var25, var29);
        }
        field1372++;
        if (arg1 != 5688) {
            field1379 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 248)
    public static final void method528(int arg0) {
        field1368++;
        if (!class44.field1161) {
            return;
        }
        class9.field321 = null;
        class44.field1161 = false;
        class62.field1563 = null;
        class74.field1848 = null;
        class102.field2591 = null;
        class31.field844 = null;
        class62.field1556 = null;
        class54.field1441 = null;
        class112.field2773 = null;
        field1369 = null;
        class106.field2689 = null;
        class114.field2810 = null;
        class24.field740 = null;
        class1.field11 = null;
        class62.field1559 = null;
        class42.field1097 = null;
        class81.field2048 = null;
        class60.field1527 = null;
        class109.field2748 = null;
        class102.field2590 = null;
        class64.field1601 = null;
        class57.field1460 = null;
        class74.field1845 = null;
        class132.field3211 = null;
        class8.field280 = null;
        class44.field1169 = null;
        class109.field2734 = null;
        class35.field926 = null;
        class39.field1075 = null;
        class62.field1561 = null;
        class73.field1783 = null;
        class37.field994 = null;
        if (arg0 >= -28) {
            return;
        }
        class16.field523 = null;
        class121.field3024 = null;
        class75.field1874 = null;
        class48.field1257 = null;
        class128.field3137 = null;
        class50.field1349 = null;
        class67.field1692 = null;
        class116.field2902 = null;
        class89.field2190 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLba;)[Ljava/lang/Object;", line = 305)
    public static final Object[] method529(byte arg0, class8 arg1) {
        int var2 = arg1.method145(false);
        field1380++;
        if (var2 == 0) {
            return null;
        }
        Object[] var3 = new Object[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = arg1.method145(false);
            if (var5 == 0) {
                var3[var4] = Integer.valueOf(arg1.method168(class64.method626(arg0, -4821)));
            } else if (var5 == 1) {
                var3[var4] = arg1.method141(-10721);
            }
        }
        if (arg0 != 89) {
            field1384 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z", line = 344)
    public static final boolean method530(byte arg0) {
        field1373++;
        long var1 = class103.method872(1);
        int var3 = (int) (var1 - class92.field2274);
        class92.field2274 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        if (arg0 != 48) {
            return false;
        }
        class45.field1191 += var3;
        if (class85.field2147 == 0 && class31.field846 == 0 && class48.field1262 == 0 && class134.field3288 == 0) {
            return true;
        } else if (class112.field2772 == null) {
            return false;
        } else {
            try {
                if (class45.field1191 > 30000) {
                    throw new IOException();
                }
                while (class31.field846 < 20 && class134.field3288 > 0) {
                    class104 var4 = (class104) class103.field2599.method499(false);
                    class8 var5 = new class8(4);
                    var5.method142(1, (byte) -128);
                    var5.method154((int) var4.field2076, 13723);
                    class112.field2772.method1019(4, (byte) -19, 0, var5.field285);
                    class78.field1920.method500(var4, (byte) -115, var4.field2076);
                    class134.field3288--;
                    class31.field846++;
                }
                while (class85.field2147 < 20 && class48.field1262 > 0) {
                    class104 var6 = (class104) class37.field997.method611(-113);
                    class8 var7 = new class8(4);
                    var7.method142(0, (byte) -128);
                    var7.method154((int) var6.field2076, arg0 + 13675);
                    class112.field2772.method1019(4, (byte) -19, 0, var7.field285);
                    var6.method470(0);
                    class74.field1834.method500(var6, (byte) -122, var6.field2076);
                    class85.field2147++;
                    class48.field1262--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class112.field2772.method1023(-122);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class45.field1191 = 0;
                    byte var10 = 0;
                    if (class36.field968 == null) {
                        var10 = 8;
                    } else if (class102.field2562 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class104.field2616.field285.length - class36.field968.field2622;
                        int var12 = 512 - class102.field2562;
                        if (var11 - class104.field2616.field268 < var12) {
                            var12 = var11 - class104.field2616.field268;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class112.field2772.method1017(class104.field2616.field268, var12, -127, class104.field2616.field285);
                        if (class14.field477 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class104.field2616.field285[class104.field2616.field268 + var13] = (byte) class64.method626(class104.field2616.field285[class104.field2616.field268 + var13], class14.field477);
                            }
                        }
                        class104.field2616.field268 += var12;
                        class102.field2562 += var12;
                        if (class104.field2616.field268 == var11) {
                            if (class36.field968.field2076 == 16711935L) {
                                class98.field2418 = class104.field2616;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class120 var16 = class50.field1352[var15];
                                    if (var16 != null) {
                                        class98.field2418.field268 = var15 * 4 + 5;
                                        int var17 = class98.field2418.method168(-4750);
                                        var16.method983(var17, 99);
                                    }
                                }
                            } else {
                                field1366.reset();
                                field1366.update(class104.field2616.field285, 0, var11);
                                int var14 = (int) field1366.getValue();
                                if (class36.field968.field2627 != var14) {
                                    try {
                                        class112.field2772.method1018(54);
                                    } catch (Exception var29) {
                                    }
                                    class14.field477 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class112.field2772 = null;
                                    class74.field1806++;
                                    return false;
                                }
                                class16.field526 = 0;
                                class74.field1806 = 0;
                                class36.field968.field2618.method979((class36.field968.field2076 & 0xFF0000L) == 16711680L, false, (int) (class36.field968.field2076 & 0xFFFFL), class130.field3183, class104.field2616.field285);
                            }
                            class36.field968.method742(-1);
                            class36.field968 = null;
                            class104.field2616 = null;
                            class102.field2562 = 0;
                            if (class130.field3183) {
                                class31.field846--;
                            } else {
                                class85.field2147--;
                            }
                        } else {
                            if (class102.field2562 != 512) {
                                break;
                            }
                            class102.field2562 = 0;
                        }
                    } else {
                        int var18 = var10 - class92.field2304.field268;
                        if (var18 > var9) {
                            var18 = var9;
                        }
                        class112.field2772.method1017(class92.field2304.field268, var18, -128, class92.field2304.field285);
                        if (class14.field477 != 0) {
                            for (int var19 = 0; var19 < var18; var19++) {
                                class92.field2304.field285[class92.field2304.field268 + var19] = (byte) class64.method626(class92.field2304.field285[class92.field2304.field268 + var19], class14.field477);
                            }
                        }
                        class92.field2304.field268 += var18;
                        if (var10 > class92.field2304.field268) {
                            break;
                        }
                        if (class36.field968 == null) {
                            class92.field2304.field268 = 0;
                            int var20 = class92.field2304.method145(false);
                            int var21 = class92.field2304.method146(65280);
                            int var22 = class92.field2304.method145(false);
                            int var23 = class92.field2304.method168(arg0 ^ 0xFFFFED42);
                            long var24 = (long) ((var20 << 16) + var21);
                            class104 var26 = (class104) class78.field1920.method501(var24, 6120);
                            class130.field3183 = true;
                            if (var26 == null) {
                                var26 = (class104) class74.field1834.method501(var24, 6120);
                                class130.field3183 = false;
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            class36.field968 = var26;
                            int var27 = var22 == 0 ? 5 : 9;
                            class104.field2616 = new class8(class36.field968.field2622 + var27 + var23);
                            class104.field2616.method142(var22, (byte) -128);
                            class104.field2616.method183(77, var23);
                            class102.field2562 = 8;
                            class92.field2304.field268 = 0;
                        } else if (class102.field2562 == 0) {
                            if (class92.field2304.field285[0] == -1) {
                                class92.field2304.field268 = 0;
                                class102.field2562 = 1;
                            } else {
                                class36.field968 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class112.field2772.method1018(-104);
                } catch (Exception var28) {
                }
                class16.field526++;
                class112.field2772 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lbd;ILa;La;)Lbc;", line = 646)
    public static final class10 method531(class11 arg0, int arg1, class1 arg2, class1 arg3) {
        field1375++;
        int var4 = arg0.method229(0, arg3);
        if (arg1 != 255) {
            field1367 = null;
        }
        int var5 = arg0.method225(arg1 ^ 0xE3, var4, arg2);
        return class19.method295(var5, (byte) -124, arg0, var4);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 666)
    public static void method532(int arg0) {
        field1370 = null;
        field1369 = null;
        field1366 = null;
        field1386 = null;
        field1387 = null;
        field1389 = null;
        field1382 = null;
        field1388 = null;
        field1367 = null;
        field1379 = null;
        field1381 = null;
        field1365 = null;
        if (arg0 != -6580) {
            field1365 = null;
        }
        field1391 = null;
        field1385 = null;
        field1383 = null;
        field1384 = null;
    }
}
