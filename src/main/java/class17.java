import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lad;")
    public static class5 field445 = class88.method674("Verbindung konnte nicht hergestellt werden)3", -107);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field443 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[I")
    public static int[] field446 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lad;")
    public static class5 field450 = class88.method674("Bitte benutzen Sie eine andere Welt)3", 48);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lad;")
    private static class5 field451 = class88.method674("Please try again)3", -95);

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lad;")
    public static class5 field448 = class88.method674("Registrierter Benutzer", -109);

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lad;")
    public static class5 field453 = field451;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "J")
    public static long field456;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lhd;")
    public static class46 field454;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
    public static int[] field447;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "[[B")
    public static byte[][] field458;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 16)
    public static final void method131(int arg0) {
        field460++;
        class33.field795.method885(-128);
        class94.field2230.method976(0, 0);
        if (arg0 != -15) {
            field450 = null;
        }
        class87.field2041 = class114.method906(class87.field2041);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z", line = 71)
    public static final boolean method132(int arg0, int arg1) {
        field444++;
        if (!class116.method928(-121, arg1)) {
            return false;
        }
        if (arg0 >= -20) {
            field456 = 102L;
        }
        boolean var2 = false;
        class105[] var3 = class121.field3013[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class105 var5 = var3[var4];
            if (var5 != null && var5.field2630 == 6) {
                if (var5.field2627 != -1 || var5.field2554 != -1) {
                    boolean var6 = class5.method69(-8743, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field2554;
                    } else {
                        var7 = var5.field2627;
                    }
                    if (var7 != -1) {
                        class72 var8 = class78.method605(var7, (byte) 20);
                        var5.field2621 += class98.field2382;
                        label55: while (true) {
                            do {
                                do {
                                    if (var5.field2621 <= var8.field1742[var5.field2559]) {
                                        break label55;
                                    }
                                    var5.field2621 -= var8.field1742[var5.field2559];
                                    var5.field2559++;
                                    var2 = true;
                                } while (var8.field1727.length > var5.field2559);
                                var5.field2559 -= var8.field1732;
                            } while (var5.field2559 >= 0 && var8.field1727.length > var5.field2559);
                            var5.field2559 = 0;
                        }
                    }
                }
                if (var5.field2549 != 0) {
                    int var9 = var5.field2549 >> 16;
                    int var10 = class98.field2382 * var9;
                    var2 = true;
                    int var11 = var5.field2549 << 16 >> 16;
                    var5.field2622 = var5.field2622 + var10 & 0x7FF;
                    int var12 = class98.field2382 * var11;
                    var5.field2623 = var5.field2623 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 161)
    public static final void method133(int arg0) {
        class33.field800 = 0;
        class109.field2727 = 0;
        field461++;
        class91.method697(17143);
        class89.method680((byte) 56);
        class12.method116(22894);
        class16.method128((byte) -127);
        for (int var1 = 0; var1 < class33.field800; var1++) {
            int var4 = class1.field18[var1];
            if (class69.field1636 != class7.field251[var4].field113) {
                class7.field251[var4] = null;
            }
        }
        if (class75.field1804 != class36.field907.field957) {
            throw new RuntimeException("gpp1 pos:" + class36.field907.field957 + " psize:" + class75.field1804);
        }
        int var2 = 28 / ((arg0 + 12) / 48);
        for (int var3 = 0; var3 < class12.field348; var3++) {
            if (class7.field251[class105.field2577[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class12.field348);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 211)
    public static final void method134(int arg0) {
        field449++;
        if (class13.field383 != 0) {
            return;
        }
        if (arg0 < 120) {
            field453 = null;
        }
        int var1 = class90.field2126;
        if (class118.field2920 == 1 && class4.field124 >= 516 && class104.field2524 >= 160 && class4.field124 <= 765 && class104.field2524 <= 205) {
            var1 = 0;
        }
        if (!class128.field3069) {
            if (var1 == 1 && class4.field145 > 0) {
                int var2 = class22.field562[class4.field145 - 1];
                if (var2 == 60 || var2 == 25 || var2 == 40 || var2 == 26 || var2 == 3 || var2 == 27 || var2 == 32 || var2 == 7 || var2 == 42 || var2 == 55 || var2 == 14 || var2 == 1003) {
                    int var3 = class129.field3128[class4.field145 - 1];
                    int var4 = class73.field1749[class4.field145 - 1];
                    class105 var5 = class52.method435(var3, false);
                    if (var5.field2557 || var5.field2582) {
                        class43.field1084 = 0;
                        class7.field266 = class4.field124;
                        class91.field2157 = class104.field2524;
                        class129.field3132 = false;
                        class89.field2111 = var3;
                        class13.field383 = 2;
                        if (var3 >> 16 == class53.field1334) {
                            class13.field383 = 1;
                        }
                        if (var3 >> 16 == class6.field225) {
                            class13.field383 = 3;
                        }
                        class59.field1447 = var4;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class34.field858 == 1 || class75.method593(true, class4.field145 - 1)) && class4.field145 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class4.field145 > 0) {
                class69.method545(142, class4.field145 - 1);
            }
            if (var1 == 2 && class4.field145 > 0) {
                class19.method157((byte) 104);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class22.field564;
            int var7 = class91.field2131;
            if (class89.field2103 == 0) {
                var6 -= 4;
                var7 -= 4;
            }
            if (class89.field2103 == 1) {
                var6 -= 553;
                var7 -= 205;
            }
            if (class89.field2103 == 2) {
                var6 -= 17;
                var7 -= 357;
            }
            if (class43.field1102 - 10 > var6 || var6 > class98.field2371 + class43.field1102 + 10 || class88.field2054 - 10 > var7 || var7 > class9.field310 + class88.field2054 + 10) {
                class128.field3069 = false;
                if (class89.field2103 == 1) {
                    class43.field1086 = true;
                }
                if (class89.field2103 == 2) {
                    class99.field2384 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class88.field2054;
        int var9 = class43.field1102;
        int var10 = class98.field2371;
        int var11 = class104.field2524;
        int var12 = -1;
        int var13 = class4.field124;
        if (class89.field2103 == 0) {
            var11 -= 4;
            var13 -= 4;
        }
        if (class89.field2103 == 1) {
            var11 -= 205;
            var13 -= 553;
        }
        if (class89.field2103 == 2) {
            var13 -= 17;
            var11 -= 357;
        }
        for (int var14 = 0; var14 < class4.field145; var14++) {
            int var15 = (class4.field145 - var14 - 1) * 15 + var8 + 31;
            if (var13 > var9 && var9 + var10 > var13 && var15 - 13 < var11 && var11 < var15 + 3) {
                var12 = var14;
            }
        }
        if (var12 != -1) {
            class69.method545(142, var12);
        }
        if (class89.field2103 == 2) {
            class99.field2384 = true;
        }
        if (class89.field2103 == 1) {
            class43.field1086 = true;
        }
        class128.field3069 = false;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)I", line = 410)
    public static final int method135(int arg0) {
        if (arg0 != 1) {
            field443 = 126;
        }
        field457++;
        return 19;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V", line = 445)
    public static final void method136(int arg0) {
        field452++;
        class88.method677(91);
        if (class20.field524 != 10) {
            return;
        }
        int var1 = class4.field124 - 202;
        int var2 = class104.field2524 - 171;
        int var3 = class90.field2126;
        if (class86.field1989 == arg0) {
            byte var4 = 100;
            byte var5 = 120;
            if (var3 == 1 && var4 - 75 <= var1 && var1 <= var4 + 75 && var5 - 20 <= var2 && var2 <= var5 + 20) {
                class8.field288 = 0;
                class86.field1989 = 3;
            }
            short var6 = 260;
            if (var3 == 1 && var1 >= var6 - 75 && var1 <= var6 + 75 && var2 >= var5 - 20 && var2 <= var5 + 20) {
                class8.field288 = 0;
                class86.field1989 = 2;
                class109.field2746 = class87.field2012;
                class109.field2728 = class87.field2028;
                class109.field2734 = class5.field201;
            }
        } else if (class86.field1989 == 2) {
            byte var7 = 60;
            short var8 = 150;
            byte var9 = 100;
            int var15 = var7 + 30;
            if (var3 == 1 && var15 - 15 <= var2 && var15 > var2) {
                class8.field288 = 0;
            }
            var15 += 15;
            if (var3 == 1 && var2 >= var15 - 15 && var15 > var2) {
                class8.field288 = 1;
            }
            var15 += 15;
            if (var3 == 1 && var1 >= var9 - 75 && var1 <= var9 + 75 && var8 - 20 <= var2 && var8 + 20 >= var2) {
                class109.field2753 = class109.field2753.method74(-9939).method45((byte) -63);
                class120.method953(class9.field324, (byte) 110, class87.field2018, class87.field2030);
                class69.method541(20, -127);
            } else {
                short var10 = 260;
                if (var3 == 1 && var10 - 75 <= var1 && var1 <= var10 + 75 && var8 - 20 <= var2 && var2 <= var8 + 20) {
                    class109.field2753 = class109.field2747;
                    class86.field1989 = 0;
                    class109.field2736 = class109.field2747;
                }
                while (true) {
                    boolean var11;
                    label139: do {
                        while (class109.method884((byte) 121)) {
                            var11 = false;
                            for (int var12 = 0; var12 < class95.field2271.method33(92); var12++) {
                                if (class52.field1296 == class95.field2271.method55(var12, arg0 ^ 0xFF)) {
                                    var11 = true;
                                    break;
                                }
                            }
                            if (class8.field288 != 0) {
                                continue label139;
                            }
                            if (class131.field3182 == 85 && class109.field2753.method33(arg0 + 52) > 0) {
                                class109.field2753 = class109.field2753.method51((byte) -42, 0, class109.field2753.method33(123) - 1);
                            }
                            if (class131.field3182 == 84 || class131.field3182 == 80) {
                                class8.field288 = 1;
                            }
                            if (var11 && class109.field2753.method33(arg0 + 101) < 12) {
                                class109.field2753 = class109.field2753.method36(class52.field1296, (byte) -73);
                            }
                        }
                        return;
                    } while (class8.field288 != 1);
                    if (class131.field3182 == 85 && class109.field2736.method33(106) > 0) {
                        class109.field2736 = class109.field2736.method51((byte) -11, 0, class109.field2736.method33(57) - 1);
                    }
                    if (class131.field3182 == 84 || class131.field3182 == 80) {
                        class8.field288 = 0;
                    }
                    if (var11 && class109.field2736.method33(82) < 20) {
                        class109.field2736 = class109.field2736.method36(class52.field1296, (byte) -73);
                    }
                }
            }
        } else if (class86.field1989 == 3) {
            short var13 = 150;
            short var14 = 180;
            if (var3 == 1 && var1 >= var14 - 75 && var14 + 75 >= var1 && var2 >= var13 - 20 && var13 + 20 >= var2) {
                class86.field1989 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 593)
    public static void method137(int arg0) {
        if (arg0 != 0) {
            field446 = null;
        }
        field446 = null;
        field451 = null;
        field448 = null;
        field458 = null;
        field450 = null;
        field454 = null;
        field445 = null;
        field453 = null;
        field447 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLrc;)Z", line = 611)
    public static final boolean method138(boolean arg0, class105 arg1) {
        field459++;
        int var2 = arg1.field2558;
        if (!arg0) {
            return true;
        }
        if (class63.field1518 == 2) {
            if (var2 == 201) {
                class135.field3258 = class95.field2252;
                class99.field2384 = true;
                class135.field3272 = class135.field3269;
                class104.field2528 = 1;
                class65.field1559 = true;
                class98.field2374 = 0;
            }
            if (var2 == 202) {
                class98.field2374 = 0;
                class135.field3272 = class135.field3269;
                class65.field1559 = true;
                class135.field3258 = class10.field338;
                class99.field2384 = true;
                class104.field2528 = 2;
            }
        }
        if (var2 == 205) {
            class134.field3252 = 250;
            return true;
        }
        if (var2 == 501) {
            class104.field2528 = 4;
            class135.field3258 = class95.field2265;
            class98.field2374 = 0;
            class99.field2384 = true;
            class135.field3272 = class135.field3269;
            class65.field1559 = true;
        }
        if (var2 == 502) {
            class65.field1559 = true;
            class104.field2528 = 5;
            class135.field3272 = class135.field3269;
            class135.field3258 = class92.field2184;
            class98.field2374 = 0;
            class99.field2384 = true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = var2 & 0x1;
            int var4 = (var2 - 300) / 2;
            class34.field826.method498((byte) 121, var4, var3 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class34.field826.method486((byte) 47, var5, var6 == 1);
        }
        if (var2 == 324) {
            class34.field826.method488((byte) 8, false);
        }
        if (var2 == 325) {
            class34.field826.method488((byte) 8, true);
        }
        if (var2 == 326) {
            class5.field163.method209(44, 10);
            class110.field2764++;
            class34.field826.method496(false, class5.field163);
            return true;
        }
        if (var2 == 620) {
            class81.field1909 = !class81.field1909;
        }
        if (var2 >= 601 && var2 <= 613) {
            class46.method406((byte) 7);
            if (class135.field3261.method33(33) > 0) {
                class134.field3227++;
                class5.field163.method209(6, 10);
                class5.field163.method340(class135.field3261.method64((byte) 100), -176768048);
                class5.field163.method307(-388270616, var2 - 601);
                class5.field163.method307(-388270616, class81.field1909 ? 1 : 0);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V", line = 731)
    public static final void method139(int arg0) {
        field455++;
        class70.field1709.method90((byte) -67);
        if (arg0 != -314) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class42.field1073[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class95.field2276[var2] = 0L;
        }
        class70.field1652 = 0;
    }
}
