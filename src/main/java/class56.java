import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Z")
    public static boolean field1300 = false;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lec;")
    public static class32 field1301 = class73.method594(" )2>", true);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[Lec;")
    public static class32[] field1306 = new class32[1000];

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lec;")
    public static class32 field1309 = class73.method594("(U1", true);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lec;")
    public static class32 field1307 = class73.method594("<col=40ff00>", true);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[Lsa;")
    public static class126[] field1303 = new class126[50];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[Lec;")
    public static class32[] field1296 = new class32[500];

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lec;")
    public static class32 field1305 = class73.method594("oder benutzen Sie eine andere Welt)3", true);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Z")
    public static boolean field1311;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[I")
    public static int[] field1310;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
    public static final boolean method437(int arg0, int arg1) {
        if (arg0 != 16777215) {
            field1300 = true;
        }
        field1294++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method438(byte arg0) {
        field1310 = null;
        field1301 = null;
        field1305 = null;
        field1306 = null;
        field1309 = null;
        field1307 = null;
        if (arg0 < -1) {
            field1303 = null;
            field1296 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)I")
    public static final int method439(int arg0, int arg1, int arg2) {
        field1297++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            if (arg2 <= 11) {
                method444(null, null, 107, null);
            }
            int var3 = (arg0 & 0x7F) * arg1 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIII)V")
    public static final void method440(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -87) {
            field1300 = false;
        }
        field1302++;
        class119.field2850 = 0;
        for (int var5 = -1; var5 < class62.field1405 + class102.field2399; var5++) {
            class115 var21;
            if (var5 == -1) {
                var21 = class20.field373;
            } else if (var5 < class62.field1405) {
                var21 = class52.field1176[class137.field3189[var5]];
            } else {
                var21 = class14.field230[class15.field313[var5 - class62.field1405]];
            }
            if (var21 != null && var21.method579(arg0 ^ 0xFFFFFFA9)) {
                if (var21 instanceof class111) {
                    class97 var22 = ((class111) var21).field2597;
                    if (var22.field2216 != null) {
                        var22 = var22.method759(127);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class62.field1405 <= var5) {
                    class97 var23 = ((class111) var21).field2597;
                    if (var23.field2216 != null) {
                        var23 = var23.method759(117);
                    }
                    if (var23.field2219 >= 0 && var23.field2219 < class9.field168.length) {
                        class91.method722(var21, var21.field2690 + 15, (byte) 48);
                        if (class89.field2057 > -1) {
                            class9.field168[var23.field2219].method370(class89.field2057 + arg3 - 12, class130.field3003 + arg2 - 30);
                        }
                    }
                    if (class125.field2913 == 1 && class15.field313[var5 - class62.field1405] == class80.field1855 && class140.field3219 % 20 < 10) {
                        class91.method722(var21, var21.field2690 + 15, (byte) 32);
                        if (class89.field2057 > -1) {
                            class131.field3021[0].method370(class89.field2057 + arg3 - 12, class130.field3003 + arg2 + -28);
                        }
                    }
                } else {
                    int var24 = 30;
                    class70 var25 = (class70) var21;
                    if (var25.field1650 != -1 || var25.field1661 != -1) {
                        class91.method722(var21, var21.field2690 + 15, (byte) -75);
                        if (class89.field2057 > -1) {
                            if (var25.field1650 != -1) {
                                class30.field578[var25.field1650].method370(class89.field2057 + arg3 - 12, class130.field3003 + arg2 + -var24);
                                var24 += 25;
                            }
                            if (var25.field1661 != -1) {
                                class9.field168[var25.field1661].method370(class89.field2057 + arg3 - 12, class130.field3003 + arg2 + -var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class125.field2913 == 10 && class137.field3189[var5] == class79.field1831) {
                        class91.method722(var21, var21.field2690 + 15, (byte) 36);
                        if (class89.field2057 > -1) {
                            class131.field3021[1].method370(arg3 + class89.field2057 - 12, class130.field3003 + arg2 + -var24);
                        }
                    }
                }
                if (var21.field2723 != null && (var5 >= class62.field1405 || class2.field21 == 0 || class2.field21 == 3 || class2.field21 == 1 && class117.method924(-125, ((class70) var21).field1660))) {
                    class91.method722(var21, var21.field2690, (byte) -73);
                    if (class89.field2057 > -1 && class63.field1461 > class119.field2850) {
                        class63.field1471[class119.field2850] = class38.field914.method772(var21.field2723) / 2;
                        class63.field1447[class119.field2850] = class38.field914.field2294;
                        class63.field1468[class119.field2850] = class89.field2057;
                        class63.field1473[class119.field2850] = class130.field3003;
                        class63.field1465[class119.field2850] = var21.field2755;
                        class63.field1458[class119.field2850] = var21.field2751;
                        class63.field1441[class119.field2850] = var21.field2708;
                        class63.field1453[class119.field2850] = var21.field2723;
                        class119.field2850++;
                    }
                }
                if (class140.field3219 < var21.field2693) {
                    class91.method722(var21, var21.field2690 + 15, (byte) 117);
                    if (class89.field2057 > -1) {
                        int var26 = var21.field2757 * 30 / var21.field2740;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class141.method1055(class89.field2057 + arg3 - 15, arg2 - -class130.field3003 + -3, var26, 5, 65280);
                        class141.method1055(class89.field2057 + var26 + arg3 - 15, arg2 - -class130.field3003 + -3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class140.field3219 < var21.field2724[var27]) {
                        class91.method722(var21, var21.field2690 / 2, (byte) 31);
                        if (class89.field2057 > -1) {
                            if (var27 == 1) {
                                class130.field3003 -= 20;
                            }
                            if (var27 == 2) {
                                class89.field2057 -= 15;
                                class130.field3003 -= 10;
                            }
                            if (var27 == 3) {
                                class89.field2057 += 15;
                                class130.field3003 -= 10;
                            }
                            class30.field587[var21.field2748[var27]].method370(class89.field2057 + arg3 - 12, arg2 - 12 + class130.field3003);
                            client.field392.method795(class159.method1230(var21.field2760[var27], arg0 ^ 0xFFFFFFA9), class89.field2057 + arg3 - 1, arg2 - -class130.field3003 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < class119.field2850; var6++) {
            int var7 = class63.field1468[var6];
            int var8 = class63.field1473[var6];
            int var9 = class63.field1471[var6];
            int var10 = class63.field1447[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class63.field1473[var20] - class63.field1447[var20] < var8 + 2 && class63.field1473[var20] + 2 > -var10 + var8 && var7 - var9 < class63.field1471[var20] + class63.field1468[var20] && var7 + var9 > class63.field1468[var20] + -class63.field1471[var20] && class63.field1473[var20] - class63.field1447[var20] < var8) {
                        var8 = class63.field1473[var20] - class63.field1447[var20];
                        var11 = true;
                    }
                }
            }
            class89.field2057 = class63.field1468[var6];
            class130.field3003 = class63.field1473[var6] = var8;
            class32 var12 = class63.field1453[var6];
            if (class44.field1036 == 0) {
                int var13 = 16776960;
                if (class63.field1465[var6] < 6) {
                    var13 = class62.field1391[class63.field1465[var6]];
                }
                if (class63.field1465[var6] == 6) {
                    var13 = class159.field3660 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class63.field1465[var6] == 7) {
                    var13 = class159.field3660 % 20 >= 10 ? 65535 : 255;
                }
                if (class63.field1465[var6] == 8) {
                    var13 = class159.field3660 % 20 < 10 ? 45056 : 8454016;
                }
                if (class63.field1465[var6] == 9) {
                    int var14 = 150 - class63.field1441[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 + 16384000 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class63.field1465[var6] == 10) {
                    int var15 = 150 - class63.field1441[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 500 + 255 - var15 * 5 - 32768000;
                    }
                }
                if (class63.field1465[var6] == 11) {
                    int var16 = 150 - class63.field1441[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class63.field1458[var6] == 0) {
                    class38.field914.method795(var12, class89.field2057 + arg3, class130.field3003 + arg2, var13, 0);
                }
                if (class63.field1458[var6] == 1) {
                    class38.field914.method785(var12, class89.field2057 + arg3, class130.field3003 + arg2, var13, 0, class159.field3660);
                }
                if (class63.field1458[var6] == 2) {
                    class38.field914.method789(var12, class89.field2057 + arg3, class130.field3003 + arg2, var13, 0, class159.field3660);
                }
                if (class63.field1458[var6] == 3) {
                    class38.field914.method792(var12, arg3 + class89.field2057, class130.field3003 + arg2, var13, 0, class159.field3660, 150 - class63.field1441[var6]);
                }
                if (class63.field1458[var6] == 4) {
                    int var17 = (150 - class63.field1441[var6]) * (class38.field914.method772(var12) + 100) / 150;
                    class141.method1067(class89.field2057 + arg3 - 50, arg2, class89.field2057 + arg3 + 50, arg1 + arg2);
                    class38.field914.method793(var12, arg3 + class89.field2057 + 50 - var17, arg2 - -class130.field3003, var13, 0);
                    class141.method1068(arg3, arg2, arg3 + arg4, arg1 + arg2);
                }
                if (class63.field1458[var6] == 5) {
                    int var18 = 150 - class63.field1441[var6];
                    class141.method1067(arg3, class130.field3003 + arg2 - class38.field914.field2294 - 1, arg3 - -arg4, class130.field3003 + arg2 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class38.field914.method795(var12, arg3 + class89.field2057, class130.field3003 + arg2 + var19, var13, 0);
                    class141.method1068(arg3, arg2, arg3 + arg4, arg1 + arg2);
                }
            } else {
                class38.field914.method795(var12, class89.field2057 + arg3, class130.field3003 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lie;")
    public static final class61 method441(int arg0, int arg1) {
        field1312++;
        class61 var2 = (class61) class3.field43.method486(arg0 ^ 0xFFFF8F77, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field1032.method206(arg0, arg1, -85);
        class61 var4 = new class61();
        if (var3 != null) {
            var4.method461(new class66(var3), (byte) -16);
        }
        class3.field43.method485((long) arg1, (byte) -125, var4);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/Object;Ldc;I)V")
    public static final void method442(Object arg0, class25 arg1, int arg2) {
        field1299++;
        if (arg1.field459 == null || arg2 != 1) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field459.peekEvent() != null; var3++) {
            class54.method427(1L, -27166);
        }
        if (arg0 != null) {
            arg1.field459.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILec;IIILec;I)V")
    public static final void method443(int arg0, class32 arg1, int arg2, int arg3, int arg4, class32 arg5, int arg6) {
        field1298++;
        if (arg2 != 3231 || (class26.field476 || class119.field2851 >= 500)) {
            return;
        }
        class109.field2577[class119.field2851] = arg1;
        field1296[class119.field2851] = arg5;
        class44.field1035[class119.field2851] = arg4;
        class135.field3137[class119.field2851] = arg0;
        class121.field2870[class119.field2851] = arg6;
        class158.field3622[class119.field2851] = arg3;
        class119.field2851++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lec;Lec;ILea;)[Lhb;")
    public static final class51[] method444(class32 arg0, class32 arg1, int arg2, class30 arg3) {
        field1304++;
        int var4 = arg3.method201(3, arg1);
        int var5 = arg3.method215(arg0, var4, true);
        if (arg2 != -11) {
            method437(-119, 30);
        }
        return class4.method12(var4, var5, -1, arg3);
    }
}
