import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lrd;")
    public static class114 field1344 = class84.method656(":chalreq:", (byte) 122);

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1350 = 0;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lrd;")
    private static class114 field1352 = class84.method656("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", (byte) 127);

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lrd;")
    public static class114 field1353 = class84.method656(":tradereq:", (byte) 124);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lrd;")
    public static class114 field1346 = field1352;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lrd;")
    public static class114 field1351 = class84.method656("Spieler kann nicht gefunden werden: ", (byte) 117);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lfc;")
    public static class39 field1340 = new class39();

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lrd;")
    public static class114 field1357 = class84.method656("_", (byte) 126);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljd;")
    public static class66 field1356;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lma;")
    public static class81 field1355;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[I")
    public static int[] field1354;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI[BZ)V")
    public static final void method513(byte arg0, int arg1, byte[] arg2, boolean arg3) {
        if (arg0 > -101) {
            return;
        }
        field1349++;
        if (class98.field2216 == null) {
            return;
        }
        if (class36.field699 >= 0) {
            class98.field2216.method181((byte) -63);
            class125.field2973 = 0;
            class110.field2575 = 20;
            class65.field1395 = null;
            class36.field699 = -1;
        }
        if (arg2 == null) {
            return;
        }
        if (class110.field2575 > 0) {
            class98.field2216.method167(65535, arg1);
            class110.field2575 = 0;
        }
        class36.field699 = arg1;
        class98.field2216.method178(arg3, arg1, (byte) -94, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1340 = null;
        field1346 = null;
        field1355 = null;
        field1351 = null;
        field1353 = null;
        field1356 = null;
        field1344 = null;
        field1354 = null;
        field1357 = null;
        if (arg0 != -14065) {
            field1354 = null;
        }
        field1352 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method515(byte arg0) {
        class90.field2114 = null;
        class36.field767 = null;
        int var1 = -21 / ((-arg0 - 56) / 42);
        field1342++;
        class123.field2879 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public static final void method516(int arg0, int arg1, int arg2) {
        class61.field1303.method1054(8, 241);
        if (arg1 < 42) {
            method515((byte) -69);
        }
        class61.field1303.method465(-19962, arg2);
        class61.field1303.method479(23538, arg0);
        field1341++;
        class123.field2876++;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static final void method517(byte arg0) {
        if (class29.field587 > 0) {
            class29.field587--;
        }
        if (class79.field1805 > 1) {
            class79.field1805--;
        }
        field1345++;
        if (class62.field1339) {
            class62.field1339 = false;
            class86.method663(32129);
            return;
        }
        for (int var1 = 0; var1 < 100 && class58.method423(false); var1++) {
        }
        if (class77.field1764 != 30 && class77.field1764 != 35) {
            return;
        }
        if (class56.field1170 && class77.field1764 == 30) {
            client.field417 = 0;
            class116.field2719 = 0;
            while (class72.method584(1)) {
            }
            for (int var2 = 0; var2 < class101.field2339.length; var2++) {
                class101.field2339[var2] = false;
            }
        }
        class101.method777(22, class61.field1303, 2);
        if (arg0 >= -54) {
            method517((byte) -88);
        }
        Object var3 = class49.field1028.field550;
        synchronized (class49.field1028.field550) {
            if (!class96.field2208) {
                class49.field1028.field567 = 0;
            } else if (client.field417 != 0 || class49.field1028.field567 >= 40) {
                class140.field3348++;
                int var4 = 0;
                class61.field1303.method1054(8, 212);
                class61.field1303.method478((byte) 97, 0);
                int var5 = class61.field1303.field1227;
                for (int var6 = 0; var6 < class49.field1028.field567 && class61.field1303.field1227 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class49.field1028.field561[var6];
                    int var8 = class49.field1028.field565[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class49.field1028.field561[var6] == -1 && class49.field1028.field565[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (class12.field273 != var8 || class55.field1169 != var7) {
                        int var10 = var7 - class55.field1169;
                        int var11 = var8 - class12.field273;
                        class12.field273 = var8;
                        class55.field1169 = var7;
                        if (class13.field300 < 8 && var11 >= -32 && var11 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class61.field1303.method464((class13.field300 << 12) + (var11 << 6) + var10, (byte) 89);
                            class13.field300 = 0;
                        } else if (class13.field300 < 8) {
                            class61.field1303.method463(-2016590992, (class13.field300 << 19) + var9 + 8388608);
                            class13.field300 = 0;
                        } else {
                            class61.field1303.method476(-7155, (class13.field300 << 19) + var9 - 1073741824);
                            class13.field300 = 0;
                        }
                    } else if (class13.field300 < 2047) {
                        class13.field300++;
                    }
                }
                class61.field1303.method491(-1, class61.field1303.field1227 - var5);
                if (var4 >= class49.field1028.field567) {
                    class49.field1028.field567 = 0;
                } else {
                    class49.field1028.field567 -= var4;
                    for (int var12 = 0; var12 < class49.field1028.field567; var12++) {
                        class49.field1028.field565[var12] = class49.field1028.field565[var4 + var12];
                        class49.field1028.field561[var12] = class49.field1028.field561[var12 + var4];
                    }
                }
            }
        }
        if (client.field417 != 0) {
            class111.field2582++;
            long var13 = (class116.field2710 - class60.field1225) / 50L;
            class60.field1225 = class116.field2710;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            int var15 = class118.field2758;
            int var16 = class142.field3392;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var17 = var15 * 765 + var16;
            byte var18 = 0;
            if (client.field417 == 2) {
                var18 = 1;
            }
            class61.field1303.method1054(8, 88);
            int var19 = (int) var13;
            class61.field1303.method489((var18 << 19) + ((var19 << 20) + var17), -1762115368);
        }
        if (class46.field957 > 0) {
            class46.field957--;
        }
        if (class101.field2339[96] || class101.field2339[97] || class101.field2339[98] || class101.field2339[99]) {
            class103.field2412 = true;
        }
        if (class103.field2412 && class46.field957 <= 0) {
            class46.field957 = 20;
            class39.field805++;
            class103.field2412 = false;
            class61.field1303.method1054(8, 81);
            class61.field1303.method465(-19962, class92.field2159);
            class61.field1303.method496(class88.field1963, (byte) 75);
        }
        if (class121.field2835 && !class50.field1038) {
            class123.field2872++;
            class50.field1038 = true;
            class61.field1303.method1054(8, 123);
            class61.field1303.method478((byte) -21, 1);
        }
        if (!class121.field2835 && class50.field1038) {
            class123.field2872++;
            class50.field1038 = false;
            class61.field1303.method1054(8, 123);
            class61.field1303.method478((byte) 125, 0);
        }
        class112.method849(-1);
        if (class77.field1764 != 30 && class77.field1764 != 35) {
            return;
        }
        class32.method236(-124);
        class73.method591((byte) -61);
        class88.field1964++;
        if (class88.field1964 > 750) {
            class86.method663(32129);
            return;
        }
        class18.method127((byte) -32);
        class144.method1143(-24281);
        class98.method741(4);
        class135.field3289++;
        if (class104.field2419 != 0) {
            class8.field113 += 20;
            if (class8.field113 >= 400) {
                class104.field2419 = 0;
            }
        }
        if (class141.field3374 != 0) {
            class117.field2739++;
            if (class117.field2739 >= 15) {
                if (class141.field3374 == 3) {
                    class140.field3335 = true;
                }
                if (class141.field3374 == 2) {
                    class24.field460 = true;
                }
                class141.field3374 = 0;
            }
        }
        if (class14.field312 != 0) {
            class86.field1942++;
            if (class100.field2289 > class14.field307 + 5 || class14.field307 - 5 > class100.field2289 || class50.field1051 + 5 < class75.field1741 || class75.field1741 < class50.field1051 - 5) {
                class107.field2479 = true;
            }
            if (class116.field2719 == 0) {
                if (class14.field312 == 3) {
                    class140.field3335 = true;
                }
                if (class14.field312 == 2) {
                    class24.field460 = true;
                }
                class14.field312 = 0;
                if (class107.field2479 && class86.field1942 >= 5) {
                    class137.field3302 = -1;
                    class67.method536(true);
                    if (class74.field1702 == class137.field3302 && class20.field356 != class1.field13) {
                        class121.field2839++;
                        byte var20 = 0;
                        class90 var21 = class14.method115(65535, class74.field1702);
                        if (class130.field3139 == 1 && var21.field2049 == 206) {
                            var20 = 1;
                        }
                        if (var21.field2019[class20.field356] <= 0) {
                            var20 = 0;
                        }
                        if (class1.method4(class39.method278(var21, 1572721824), 1073340130)) {
                            int var22 = class1.field13;
                            int var23 = class20.field356;
                            var21.field2019[var23] = var21.field2019[var22];
                            var21.field2082[var23] = var21.field2082[var22];
                            var21.field2019[var22] = -1;
                            var21.field2082[var22] = 0;
                        } else if (var20 == 1) {
                            int var24 = class1.field13;
                            int var25 = class20.field356;
                            while (var24 != var25) {
                                if (var25 < var24) {
                                    var21.method684(var24 - 1, (byte) -119, var24);
                                    var24--;
                                } else if (var25 > var24) {
                                    var21.method684(var24 + 1, (byte) -93, var24);
                                    var24++;
                                }
                            }
                        } else {
                            var21.method684(class20.field356, (byte) -97, class1.field13);
                        }
                        class61.field1303.method1054(8, 209);
                        class61.field1303.method479(23538, class74.field1702);
                        class61.field1303.method444((byte) 108, var20);
                        class61.field1303.method441((byte) 46, class1.field13);
                        class61.field1303.method464(class20.field356, (byte) 35);
                    }
                } else if ((class5.field73 == 1 || class5.method50(class60.field1263 - 1, true)) && class60.field1263 > 2) {
                    class109.method829(-109);
                } else if (class60.field1263 > 0) {
                    class24.method170(class60.field1263 - 1, -3);
                }
                client.field417 = 0;
                class117.field2739 = 10;
            }
        }
        byte var26 = 34;
        if (class34.field671 == -1) {
            if (class117.field2747 != -1) {
                class12.method103(class117.field2747, 4, 338, (byte) 123, var26, 4, 516);
            } else if (class72.field1608 != -1) {
                class12.method103(class72.field1608, 4, 338, (byte) 105, var26, 4, 516);
            }
            if (class123.field2905 != -1) {
                class12.method103(class123.field2905, 205, 466, (byte) 107, var26, 553, 743);
            } else if (class123.field2906[class102.field2351] != -1) {
                class12.method103(class123.field2906[class102.field2351], 205, 466, (byte) 111, var26, 553, 743);
            }
            if (class123.field2899 != -1) {
                class12.method103(class123.field2899, 357, 453, (byte) 120, var26, 17, 496);
            } else if (class8.field120 != -1) {
                class12.method103(class8.field120, 357, 453, (byte) 119, var26, 17, 496);
            }
        } else {
            class12.method103(class34.field671, 0, 503, (byte) 111, var26, 0, 765);
            if (class56.field1188 != -1) {
                class12.method103(class56.field1188, 0, 503, (byte) 102, var26, 0, 765);
            }
        }
        if (class34.field671 == -1) {
            if (class117.field2747 != -1) {
                class12.method103(class117.field2747, 4, 338, (byte) 123, ~var26, 4, 516);
            } else if (class72.field1608 != -1) {
                class12.method103(class72.field1608, 4, 338, (byte) 109, ~var26, 4, 516);
            }
            if (class123.field2905 != -1) {
                class12.method103(class123.field2905, 205, 466, (byte) 107, ~var26, 553, 743);
            } else if (class123.field2906[class102.field2351] != -1) {
                class12.method103(class123.field2906[class102.field2351], 205, 466, (byte) 106, ~var26, 553, 743);
            }
            if (class123.field2899 != -1) {
                class12.method103(class123.field2899, 357, 453, (byte) 110, ~var26, 17, 496);
            } else if (class8.field120 != -1) {
                class12.method103(class8.field120, 357, 453, (byte) 124, ~var26, 17, 496);
            }
        } else {
            class12.method103(class34.field671, 0, 503, (byte) 121, ~var26, 0, 765);
            if (class56.field1188 != -1) {
                class12.method103(class56.field1188, 0, 503, (byte) 108, ~var26, 0, 765);
            }
        }
        class117.method908(true);
        if (class129.field3092 != -1) {
            int var27 = class129.field3092;
            int var28 = class129.field3095;
            boolean var29 = class10.method80(var27, class7.field103.field758[0], class7.field103.field748[0], 0, true, var28, 0, 0, -120, 0, 0, 0);
            if (var29) {
                class69.field1512 = class142.field3392;
                class104.field2419 = 1;
                field1350 = class118.field2758;
                class8.field113 = 0;
            }
            class129.field3092 = -1;
        }
        if (client.field417 == 1 && class60.field1250 != null) {
            class140.field3335 = true;
            client.field417 = 0;
            class60.field1250 = null;
        }
        class3.method14(0);
        if (class34.field671 == -1) {
            class55.method406(-33);
            class145.method1153(502);
            class7.method64((byte) 36);
        }
        if (class127.field3032 == -1 && class16.field327 == -1 && class14.field313 == -1) {
            if (class117.field2730 > 0) {
                class117.field2730--;
            }
        } else if (class117.field2730 < class31.field629) {
            class117.field2730++;
            if (class31.field629 == class117.field2730) {
                if (class16.field327 != -1) {
                    class24.field460 = true;
                }
                if (class127.field3032 != -1) {
                    class140.field3335 = true;
                }
            }
        }
        if (class116.field2719 == 1 || client.field417 == 1) {
            class62.field1320++;
        }
        class24.method179(-94);
        if (class11.field181) {
            class112.method847(64);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class28.field555[var30]++;
        }
        class130.method1045(199);
        int var31 = class88.method667((byte) 89);
        int var32 = class125.method972(2);
        if (var31 > 4500 && var32 > 4500) {
            class77.field1753++;
            class29.field587 = 250;
            class98.method739(-103, 4000);
            class61.field1303.method1054(8, 110);
        }
        class142.field3391++;
        class9.field129++;
        class58.field1209++;
        if (class58.field1209 > 500) {
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x1) == 1) {
                class130.field3150 += class56.field1185;
            }
            if ((var33 & 0x4) == 4) {
                class90.field2125 += class144.field3440;
            }
            if ((var33 & 0x2) == 2) {
                class46.field946 += class1.field12;
            }
            class58.field1209 = 0;
        }
        if (class130.field3150 < -50) {
            class56.field1185 = 2;
        }
        if (class46.field946 < -55) {
            class1.field12 = 2;
        }
        if (class9.field129 > 500) {
            class9.field129 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x2) == 2) {
                class48.field997 += class7.field102;
            }
            if ((var34 & 0x1) == 1) {
                class69.field1505 += class112.field2615;
            }
        }
        if (class69.field1505 < -60) {
            class112.field2615 = 2;
        }
        if (class90.field2125 < -40) {
            class144.field3440 = 1;
        }
        if (class90.field2125 > 40) {
            class144.field3440 = -1;
        }
        if (class69.field1505 > 60) {
            class112.field2615 = -2;
        }
        if (class46.field946 > 55) {
            class1.field12 = -2;
        }
        if (class130.field3150 > 50) {
            class56.field1185 = -2;
        }
        if (class48.field997 < -20) {
            class7.field102 = 1;
        }
        if (class48.field997 > 10) {
            class7.field102 = -1;
        }
        if (class142.field3391 > 50) {
            class61.field1303.method1054(8, 249);
            class28.field554++;
        }
        try {
            if (class18.field343 != null && class61.field1303.field1227 > 0) {
                class18.field343.method290(false, class61.field1303.field1227, 0, class61.field1303.field1248);
                class61.field1303.field1227 = 0;
                class142.field3391 = 0;
            }
        } catch (IOException var35) {
            class86.method663(32129);
        }
    }
}
