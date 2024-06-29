import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class386 implements Runnable {

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lsr;")
    private class167 field5611 = new class167();

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field5609 = new Thread(this);

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lao;")
    public static class191 field5613 = new class191(53, 0);

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lao;")
    public static class191 field5615 = new class191(95, 8);

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
    public static int[] field5618 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field5620 = 100;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Ljc;")
    public static class305 field5619 = new class305("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static final void method2344(int arg0) {
        if (class447.field6519 > 0) {
            class447.field6519--;
        }
        if (class430.field6246 > 1) {
            class430.field6246--;
            class191.field2463 = class106.field1448;
        }
        if (arg0 != 31438) {
            field5621 = 25;
        }
        field5614++;
        if (class151.field1974) {
            class151.field1974 = false;
            class462.method2835((byte) -17);
            return;
        }
        if (!class483.field7125) {
            class464.method2843(-1);
        }
        for (int var1 = 0; var1 < 100 && class227.method1452(50); var1++) {
        }
        if (class527.field7734 != 9) {
            return;
        }
        class127.method771(-18, class451.field6718.method625(false), class106.field1443);
        if (class102.field1387 == null) {
            if (class488.field7160 <= class45.method252((byte) -8)) {
                class102.field1387 = class143.field1912.method2346(class255.field3395.field3564, arg0 + 2014660974);
            }
        } else if (class102.field1387.field2716 != -1) {
            class492.method2979(class413.field5902, 59);
            class106.field1443.method2444((byte) 65, class102.field1387.field2716);
            class102.field1387 = null;
            class488.field7160 = class45.method252((byte) -8) + 30000L;
        }
        class299 var2 = (class299) class333.field4405.method970(12);
        if (var2 != null || class45.method252((byte) -8) - 2000L > class68.field776) {
            boolean var3 = false;
            int var4 = class106.field1443.field5729;
            for (class299 var5 = (class299) class36.field359.method970(12); var5 != null && class106.field1443.field5729 - var4 < 240; var5 = (class299) class36.field359.method976((byte) -11)) {
                var5.method2674(true);
                int var6 = var5.method1755(arg0 - 31435);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method1760(1);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method1755(3) == -1 && var5.method1760(arg0 ^ 0x7ACF) == -1) {
                    var8 = true;
                    var7 = -1;
                    var6 = -1;
                }
                if (class412.field5878 != var7 || class415.field5980 != var6) {
                    if (!var3) {
                        class161.field2088++;
                        class492.method2979(class395.field5716, arg0 - 31387);
                        class106.field1443.method2449((byte) 118, 0);
                        var4 = class106.field1443.field5729;
                        var3 = true;
                    }
                    int var9 = var7 - class412.field5878;
                    class412.field5878 = var7;
                    int var10 = var6 - class415.field5980;
                    class415.field5980 = var6;
                    int var11 = (int) ((var5.method1757(0) - class68.field776) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class106.field1443.method2444((byte) 65, (var11 << 12) + (var9 << 6) + var10);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var9 += 128;
                        var10 += 128;
                        class106.field1443.method2449((byte) 127, var11 + 128);
                        class106.field1443.method2444((byte) 65, (var9 << 8) + var10);
                    } else if (var11 < 32) {
                        class106.field1443.method2449((byte) 125, var11 + 192);
                        if (var8) {
                            class106.field1443.method2398(119, Integer.MIN_VALUE);
                        } else {
                            class106.field1443.method2398(-118, var6 << 16 | var7);
                        }
                    } else {
                        class106.field1443.method2444((byte) 65, var11 + 57344);
                        if (var8) {
                            class106.field1443.method2398(-9, Integer.MIN_VALUE);
                        } else {
                            class106.field1443.method2398(117, var6 << 16 | var7);
                        }
                    }
                    class68.field776 = var5.method1757(0);
                }
            }
            if (var3) {
                class106.field1443.method2403(class106.field1443.field5729 - var4, (byte) -22);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method1757(0) - class94.field1131) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class94.field1131 = var2.method1757(0);
            int var14 = var2.method1755(arg0 - 31435);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method1760(1);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method1758((byte) 102) == 2) {
                var16 = 1;
            }
            class492.method2979(class125.field1619, 60);
            class372.field5047++;
            int var17 = (int) var12;
            class106.field1443.method2444((byte) 65, var17 | var16 << 15);
            class106.field1443.method2398(arg0 - 31552, var14 << 16 | var15);
        }
        if (class329.field4364 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class329.field4364; var19++) {
                if (class152.field1991[var19].method343(-1)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class168.field2176++;
                if (var18 > 75) {
                    var18 = 75;
                }
                class492.method2979(class520.field7659, 39);
                class106.field1443.method2449((byte) 121, var18 * 3);
                for (int var20 = 0; var20 < class329.field4364; var20++) {
                    class57 var21 = class152.field1991[var20];
                    if (var21.method343(-1)) {
                        long var22 = (var21.method344(10) - class333.field4408) / 50L;
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class333.field4408 = var21.method344(10);
                        class106.field1443.method2449((byte) 122, var21.method340(126));
                        class106.field1443.method2444((byte) 65, (int) var22);
                    }
                }
            }
        }
        if (class349.field4647 > 0) {
            class349.field4647--;
        }
        if (class419.field6089 && class349.field4647 <= 0) {
            class174.field2236++;
            class419.field6089 = false;
            class349.field4647 = 20;
            class492.method2979(class105.field1415, 28);
            class106.field1443.method2410(false, (int) class143.field1907 >> 3);
            class106.field1443.method2446((int) class199.field2650 >> 3, (byte) 119);
        }
        if (class34.field346 && !class81.field987) {
            class38.field389++;
            class81.field987 = true;
            class492.method2979(class522.field7676, 42);
            class106.field1443.method2449((byte) 117, 1);
        }
        if (!class34.field346 && class81.field987) {
            class38.field389++;
            class81.field987 = false;
            class492.method2979(class522.field7676, 39);
            class106.field1443.method2449((byte) 119, 0);
        }
        if (!class435.field6347) {
            class492.method2979(class444.field6463, 82);
            class169.field2182++;
            class106.field1443.method2449((byte) 119, 0);
            int var24 = class106.field1443.field5729;
            class396 var25 = class319.field4256.method1741((byte) -35);
            class106.field1443.method2438(0, var25.field5761, var25.field5729, arg0 + 1769477346);
            class106.field1443.method2403(class106.field1443.field5729 - var24, (byte) -22);
            class435.field6347 = true;
        }
        if (class186.field2421 != null) {
            if (class47.field491 == 2) {
                class333.method1943(true);
            } else if (class47.field491 == 3) {
                class154.method914(arg0 - 31430);
            }
        }
        if (class319.field4261) {
            class319.field4261 = false;
        } else {
            class283.field3745 /= 2.0F;
        }
        if (class421.field6107) {
            class421.field6107 = false;
        } else {
            class249.field3321 /= 2.0F;
        }
        class430.method2642((byte) 98);
        if (class527.field7734 != 9) {
            return;
        }
        class338.method1969((byte) -114);
        class247.method1531(-30994);
        class306.method1824(125);
        class331.method1939(-102);
        class384.field5586++;
        if (class384.field5586 > 750) {
            class462.method2835((byte) 120);
            return;
        }
        class211.method1344((byte) -120);
        class48.method278(-65536);
        class41.method241(0);
        for (int var26 = class52.field606.method1335((byte) -114, true); var26 != -1; var26 = class52.field606.method1335((byte) -114, false)) {
            class67.method392(var26, 7);
            class483.field7126[class95.method534(class375.field5087++, 31)] = var26;
        }
        for (class184 var27 = class335.method1956(arg0 - 31438); var27 != null; var27 = class335.method1956(0)) {
            int var28 = var27.method1072(0);
            int var29 = var27.method1071(123);
            if (var28 == 1) {
                class302.field3999[var29] = var27.field2393;
                class323.field4297 |= class272.field3636[var29];
                class319.field4252[class95.method534(31, class307.field4118++)] = var29;
            } else if (var28 == 2) {
                class234.field3131[var29] = var27.field2394;
                class113.field1490[class95.method534(class267.field3576++, 31)] = var29;
            } else if (var28 == 3) {
                class450 var30 = class406.method2490((byte) -116, var29);
                if (!var27.field2394.equals(var30.field6594)) {
                    var30.field6594 = var27.field2394;
                    class413.method2521(var30, false);
                }
            } else if (var28 == 4) {
                class450 var31 = class406.method2490((byte) -116, var29);
                int var32 = var27.field2393;
                int var33 = var27.field2392;
                int var34 = var27.field2388;
                if (var31.field6652 != var32 || var31.field6692 != var33 || var31.field6587 != var34) {
                    var31.field6587 = var34;
                    var31.field6652 = var32;
                    var31.field6692 = var33;
                    class413.method2521(var31, false);
                }
            } else if (var28 == 5) {
                class450 var35 = class406.method2490((byte) -116, var29);
                if (var27.field2393 != var35.field6702 || var27.field2393 == -1) {
                    var35.field6590 = 0;
                    var35.field6577 = 1;
                    var35.field6575 = 0;
                    var35.field6702 = var27.field2393;
                    class413.method2521(var35, false);
                }
            } else if (var28 == 6) {
                int var46 = var27.field2393;
                int var47 = (var46 & 0x7C4C) >> 10;
                int var48 = (var46 & 0x3E8) >> 5;
                int var49 = var46 & 0x1F;
                int var50 = (var47 << 19) + (var48 << 11) + (var49 << 3);
                class450 var51 = class406.method2490((byte) -116, var29);
                if (var51.field6649 != var50) {
                    var51.field6649 = var50;
                    class413.method2521(var51, false);
                }
            } else if (var28 == 7) {
                class450 var36 = class406.method2490((byte) -116, var29);
                boolean var37 = var27.field2393 == 1;
                if (var36.field6665 != var37) {
                    var36.field6665 = var37;
                    class413.method2521(var36, false);
                }
            } else if (var28 == 8) {
                class450 var45 = class406.method2490((byte) -116, var29);
                if (var27.field2393 != var45.field6615 || var27.field2392 != var45.field6701 || var27.field2388 != var45.field6663) {
                    var45.field6663 = var27.field2388;
                    var45.field6615 = var27.field2393;
                    var45.field6701 = var27.field2392;
                    if (var45.field6661 != -1) {
                        if (var45.field6567 > 0) {
                            var45.field6663 = var45.field6663 * 32 / var45.field6567;
                        } else if (var45.field6613 > 0) {
                            var45.field6663 = var45.field6663 * 32 / var45.field6613;
                        }
                    }
                    class413.method2521(var45, false);
                }
            } else if (var28 == 9) {
                class450 var38 = class406.method2490((byte) -116, var29);
                if (var27.field2393 != var38.field6661 || var27.field2392 != var38.field6561) {
                    var38.field6561 = var27.field2392;
                    var38.field6661 = var27.field2393;
                    class413.method2521(var38, false);
                }
            } else if (var28 == 10) {
                class450 var39 = class406.method2490((byte) -116, var29);
                if (var27.field2393 != var39.field6571 || var27.field2392 != var39.field6597 || var27.field2388 != var39.field6604) {
                    var39.field6571 = var27.field2393;
                    var39.field6597 = var27.field2392;
                    var39.field6604 = var27.field2388;
                    class413.method2521(var39, false);
                }
            } else if (var28 == 11) {
                class450 var44 = class406.method2490((byte) -116, var29);
                var44.field6601 = var44.field6645 = var27.field2393;
                var44.field6682 = var44.field6624 = var27.field2392;
                var44.field6683 = 0;
                var44.field6551 = 0;
                class413.method2521(var44, false);
            } else if (var28 == 12) {
                class450 var40 = class406.method2490((byte) -116, var29);
                int var41 = var27.field2393;
                if (var40 != null && var40.field6686 == 0) {
                    if ((var40.field6684 - var40.field6573) < var41) {
                        var41 = var40.field6684 - var40.field6573;
                    }
                    if (var41 < 0) {
                        var41 = 0;
                    }
                    if (var40.field6687 != var41) {
                        var40.field6687 = var41;
                        class413.method2521(var40, false);
                    }
                }
            } else if (var28 == 14) {
                class450 var43 = class406.method2490((byte) -116, var29);
                var43.field6560 = var27.field2393;
            } else if (var28 == 15) {
                class20.field180 = true;
                class234.field3122 = var27.field2393;
                class417.field6028 = var27.field2392;
            } else if (var28 == 16) {
                class450 var42 = class406.method2490((byte) -116, var29);
                var42.field6656 = var27.field2393;
            }
        }
        if (class169.field2190 != 0) {
            class474.field7032 += 20;
            if (class474.field7032 >= 400) {
                class169.field2190 = 0;
            }
        }
        class123.field1594++;
        if (class431.field6266 != null) {
            class243.field3217++;
            if (class243.field3217 >= 15) {
                class413.method2521(class431.field6266, false);
                class431.field6266 = null;
            }
        }
        class304.field4048 = null;
        class463.field6905 = false;
        class530.field7772 = null;
        class95.field1137 = false;
        class225.method1446(null, false, -1, -1);
        class193.method1106(null, -1, -1, (byte) -83);
        if (!class323.field4302) {
            class256.field3403 = -1;
        }
        class214.method1369((byte) 42);
        class106.field1448++;
        if (class430.field6255) {
            class174.field2248++;
            class492.method2979(class89.field1070, arg0 - 31397);
            class106.field1443.method2421(class520.field7663 << 28 | class406.field5842 << 14 | class333.field4410, -1066855704);
            class430.field6255 = false;
        }
        while (true) {
            class293 var52;
            class450 var53;
            class450 var54;
            do {
                var52 = (class293) class380.field5509.method977((byte) -71);
                if (var52 == null) {
                    while (true) {
                        class293 var55;
                        class450 var56;
                        class450 var57;
                        do {
                            var55 = (class293) class533.field7849.method977((byte) 82);
                            if (var55 == null) {
                                while (true) {
                                    class293 var58;
                                    class450 var59;
                                    class450 var60;
                                    do {
                                        var58 = (class293) class354.field4735.method977((byte) -40);
                                        if (var58 == null) {
                                            if (class530.field7772 == null) {
                                                class453.field6781 = 0;
                                            }
                                            if (class188.field2436 != null) {
                                                class385.method2342(-1821699996);
                                            }
                                            if (class509.field7372 > 0 && class413.field5893.method1472(28251, 82) && class413.field5893.method1472(28251, 81) && class180.field2351 != 0) {
                                                int var61 = class96.field1170.field3695 - class180.field2351;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class21.method116(class96.field1170.field1249[0] + class357.field4867, class96.field1170.field1251[0] + class418.field6074, (byte) -16, var61);
                                            }
                                            class242.method1512(2);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class380.field5505[var62]++;
                                            }
                                            if (class323.field4297 && class45.method252((byte) -8) - 60000L > class340.field4495) {
                                                class365.method2173(45);
                                            }
                                            for (class304 var63 = (class304) class123.field1601.method290(-1); var63 != null; var63 = (class304) class123.field1601.method284(10748)) {
                                                if (class45.method252((byte) -8) / 1000L - 5L > (long) var63.field4043) {
                                                    if (var63.field4047 > 0) {
                                                        class119.method714(var63.field4041 + class337.field4459.method1823(class374.field5072, (byte) -88), "", 5, (byte) 102, "", 0);
                                                    }
                                                    if (var63.field4047 == 0) {
                                                        class119.method714(var63.field4041 + class42.field454.method1823(class374.field5072, (byte) -88), "", 5, (byte) 102, "", 0);
                                                    }
                                                    var63.method1239(42);
                                                }
                                            }
                                            class103.field1396++;
                                            if (class103.field1396 > 500) {
                                                class103.field1396 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x4) == 4) {
                                                    class321.field4284 += class285.field3751;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class153.field1999 += class12.field128;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class333.field4411 += class99.field1357;
                                                }
                                            }
                                            if (class153.field1999 < -50) {
                                                class12.field128 = 2;
                                            }
                                            if (class153.field1999 > 50) {
                                                class12.field128 = -2;
                                            }
                                            if (class333.field4411 < -55) {
                                                class99.field1357 = 2;
                                            }
                                            if (class333.field4411 > 55) {
                                                class99.field1357 = -2;
                                            }
                                            if (class321.field4284 < -40) {
                                                class285.field3751 = 1;
                                            }
                                            if (class321.field4284 > 40) {
                                                class285.field3751 = -1;
                                            }
                                            class449.field6537++;
                                            if (class449.field6537 > 500) {
                                                class449.field6537 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class299.field3928 += class38.field393;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class420.field6099 += class79.field967;
                                                }
                                            }
                                            if (class299.field3928 < -60) {
                                                class38.field393 = 2;
                                            }
                                            if (class299.field3928 > 60) {
                                                class38.field393 = -2;
                                            }
                                            if (class420.field6099 < -20) {
                                                class79.field967 = 1;
                                            }
                                            class378.field5471++;
                                            if (class420.field6099 > 10) {
                                                class79.field967 = -1;
                                            }
                                            if (class378.field5471 > 50) {
                                                class492.method2979(class406.field5840, 36);
                                                class33.field336++;
                                            }
                                            if (class316.field4233) {
                                                class376.method2218(-22407);
                                                class316.field4233 = false;
                                            }
                                            try {
                                                if (class446.field6499 != null && class106.field1443.field5729 > 0) {
                                                    class312.field4170 += class106.field1443.field5729;
                                                    class446.field6499.method2620(true, class106.field1443.field5761, 0, class106.field1443.field5729);
                                                    class378.field5471 = 0;
                                                    class106.field1443.field5729 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class462.method2835((byte) 67);
                                                return;
                                            }
                                        }
                                        var59 = var58.field3877;
                                        if (var59.field6703 < 0) {
                                            break;
                                        }
                                        var60 = class406.method2490((byte) -116, var59.field6550);
                                    } while (var60 == null || var60.field6643 == null || var60.field6643.length <= var59.field6703 || var60.field6643[var59.field6703] != var59);
                                    class432.method2657(var58);
                                }
                            }
                            var56 = var55.field3877;
                            if (var56.field6703 < 0) {
                                break;
                            }
                            var57 = class406.method2490((byte) -116, var56.field6550);
                        } while (var57 == null || var57.field6643 == null || var57.field6643.length <= var56.field6703 || var57.field6643[var56.field6703] != var56);
                        class432.method2657(var55);
                    }
                }
                var53 = var52.field3877;
                if (var53.field6703 < 0) {
                    break;
                }
                var54 = class406.method2490((byte) -116, var53.field6550);
            } while (var54 == null || var54.field6643 == null || var54.field6643.length <= var53.field6703 || var54.field6643[var53.field6703] != var53);
            class432.method2657(var52);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lpe;B)V")
    private final void method2345(class435 arg0, byte arg1) {
        field5612++;
        class167 var3 = this.field5611;
        synchronized (this.field5611) {
            this.field5611.method975(0, arg0);
            this.field5611.notify();
            if (arg1 <= 55) {
                this.run();
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "run", descriptor = "()V")
    public final void run() {
        field5608++;
        while (true) {
            class167 var1 = this.field5611;
            class206 var3;
            synchronized (this.field5611) {
                class435 var2;
                for (var2 = this.field5611.method977((byte) -63); var2 == null; var2 = this.field5611.method977((byte) 50)) {
                    try {
                        this.field5611.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class206)) {
                    return;
                }
                var3 = (class206) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2718).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2716 = var5;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;I)Lvn;")
    public final class206 method2346(String arg0, int arg1) {
        field5610++;
        if (this.field5609 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 != 2014692412) {
                this.method2346(null, 28);
            }
            class206 var3 = new class206(arg0);
            this.method2345(var3, (byte) 116);
            return var3;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static void method2347(byte arg0) {
        field5613 = null;
        if (arg0 != -120) {
            field5619 = null;
        }
        field5618 = null;
        field5619 = null;
        field5615 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public final void method2348(int arg0) {
        if (arg0 != 23623) {
            this.method2346(null, 25);
        }
        field5617++;
        if (this.field5609 == null) {
            return;
        }
        this.method2345(new class435(), (byte) 91);
        try {
            this.field5609.join();
        } catch (InterruptedException var2) {
        }
        this.field5609 = null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class386() {
        this.field5609.setDaemon(true);
        this.field5609.start();
    }

    static {
        new class305("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
