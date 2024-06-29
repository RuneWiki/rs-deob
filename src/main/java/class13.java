import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class13 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
    public static int[] field237 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lva;")
    public static class121 field241 = class107.method797("@or3@", -10983);

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "J")
    public static long field232;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lw;")
    public static class125 field242;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lhe;")
    public static class47 field238;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 34)
    public static final void method105(int arg0) {
        if (class23.field596 != null) {
            class26 var1 = class23.field596;
            synchronized (class23.field596) {
                class23.field596 = null;
            }
        }
        if (arg0 > 41) {
            field233++;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 63)
    public static final void method106(byte arg0) {
        for (int var1 = 0; var1 < class92.field2087; var1++) {
            int var3 = class15.field274[var1];
            class77 var4 = class127.field2895[var3];
            int var5 = class66.field1578.method821(true);
            if ((var5 & 0x40) != 0) {
                var5 += class66.field1578.method821(true) << 8;
            }
            class43.method288(var3, var5, 255, var4);
        }
        int var2 = -41 / ((arg0 + 4) / 58);
        field234++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 94)
    public static void method107(int arg0) {
        field238 = null;
        field237 = null;
        field242 = null;
        field241 = null;
        int var1 = -12 % ((-arg0 - 77) / 39);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V", line = 109)
    public static final void method108(byte arg0) {
        field236++;
        if (class42.field967 > 0) {
            class42.field967--;
        }
        if (class21.field560 > 1) {
            class21.field560--;
        }
        if (class75.field1723) {
            class75.field1723 = false;
            class21.method184(21254);
            return;
        }
        for (int var1 = 0; var1 < 100 && class4.method28(0); var1++) {
        }
        if (class14.field253 != 30 && class14.field253 != 35) {
            return;
        }
        if (class59.field1409 && class14.field253 == 30) {
            class21.field568 = 0;
            class107.field2432 = 0;
            while (class96.method648(true)) {
            }
            for (int var2 = 0; var2 < class21.field570.length; var2++) {
                class21.field570[var2] = false;
            }
        }
        class107.method794(class60.field1437, 0, 186);
        Object var3 = class1.field3.field832;
        synchronized (class1.field3.field832) {
            if (!class59.field1413) {
                class1.field3.field847 = 0;
            } else if (class21.field568 != 0 || class1.field3.field847 >= 40) {
                class60.field1437.method622(56, true);
                class25.field631++;
                int var4 = 0;
                class60.field1437.method836(0, 0);
                int var5 = class60.field1437.field2507;
                for (int var6 = 0; var6 < class1.field3.field847 && class60.field1437.field2507 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class1.field3.field848[var6];
                    int var8 = class1.field3.field849[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class1.field3.field848[var6] == -1 && class1.field3.field849[var6] == -1) {
                        var7 = -1;
                        var8 = -1;
                        var9 = 524287;
                    }
                    if (class56.field1277 != var8 || class11.field183 != var7) {
                        int var10 = var7 - class11.field183;
                        class11.field183 = var7;
                        int var11 = var8 - class56.field1277;
                        class56.field1277 = var8;
                        if (class29.field790 < 8 && var11 >= -32 && var11 <= 31 && var10 >= -32 && var10 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class60.field1437.method862((byte) 91, (class29.field790 << 12) + (var11 << 6) + var10);
                            class29.field790 = 0;
                        } else if (class29.field790 < 8) {
                            class60.field1437.method869((class29.field790 << 19) + var9 + 8388608, (byte) -37);
                            class29.field790 = 0;
                        } else {
                            class60.field1437.method867((byte) -66, (class29.field790 << 19) + var9 - 1073741824);
                            class29.field790 = 0;
                        }
                    } else if (class29.field790 < 2047) {
                        class29.field790++;
                    }
                }
                class60.field1437.method857(-1, class60.field1437.field2507 - var5);
                if (var4 < class1.field3.field847) {
                    class1.field3.field847 -= var4;
                    for (int var12 = 0; var12 < class1.field3.field847; var12++) {
                        class1.field3.field849[var12] = class1.field3.field849[var4 + var12];
                        class1.field3.field848[var12] = class1.field3.field848[var4 + var12];
                    }
                } else {
                    class1.field3.field847 = 0;
                }
            }
        }
        if (class21.field568 != 0) {
            class99.field2197++;
            long var13 = (class12.field196 - class19.field466) / 50L;
            int var15 = class15.field280;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = class82.field1909;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 502) {
                var16 = 502;
            }
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            class19.field466 = class12.field196;
            int var17 = var16 * 765 + var15;
            byte var18 = 0;
            if (class21.field568 == 2) {
                var18 = 1;
            }
            class60.field1437.method622(76, true);
            int var19 = (int) var13;
            class60.field1437.method824(-921469304, (var19 << 20) + (var18 << 19) + var17);
        }
        if (class19.field463 > 0) {
            class19.field463--;
        }
        if (class21.field570[96] || class21.field570[97] || class21.field570[98] || class21.field570[99]) {
            class119.field2702 = true;
        }
        if (class119.field2702 && class19.field463 <= 0) {
            class21.field561++;
            class19.field463 = 20;
            class119.field2702 = false;
            class60.field1437.method622(0, true);
            class60.field1437.method856(96, class95.field2130);
            class60.field1437.method850(class96.field2149, (byte) 86);
        }
        if (arg0 >= -104) {
            return;
        }
        if (class71.field1676 && !class64.field1554) {
            class58.field1339++;
            class64.field1554 = true;
            class60.field1437.method622(150, true);
            class60.field1437.method836(0, 1);
        }
        if (!class71.field1676 && class64.field1554) {
            class64.field1554 = false;
            class60.field1437.method622(150, true);
            class58.field1339++;
            class60.field1437.method836(0, 0);
        }
        class48.method349((byte) -44);
        if (class14.field253 != 30 && class14.field253 != 35) {
            return;
        }
        class84.method591(-39);
        class15.method122(256);
        class41.field954++;
        if (class41.field954 > 750) {
            class21.method184(21254);
            return;
        }
        class124.method978(false);
        class85.method595(-2382);
        class79.method547((byte) 127);
        class128.field2955++;
        if (class126.field2884 != 0) {
            class22.field591++;
            if (class22.field591 >= 15) {
                if (class126.field2884 == 2) {
                    class97.field2168 = true;
                }
                if (class126.field2884 == 3) {
                    class9.field140 = true;
                }
                class126.field2884 = 0;
            }
        }
        if (class12.field229 != 0) {
            class41.field952 += 20;
            if (class41.field952 >= 400) {
                class12.field229 = 0;
            }
        }
        if (class90.field2048 != 0) {
            class79.field1839++;
            if (class34.field822 > class45.field1065 + 5 || class34.field822 < class45.field1065 - 5 || class127.field2885 + 5 < class19.field514 || class19.field514 < class127.field2885 - 5) {
                class47.field1092 = true;
            }
            if (class107.field2432 == 0) {
                if (class90.field2048 == 2) {
                    class97.field2168 = true;
                }
                if (class90.field2048 == 3) {
                    class9.field140 = true;
                }
                class90.field2048 = 0;
                if (class47.field1092 && class79.field1839 >= 5) {
                    class9.field133 = -1;
                    class25.method202(83);
                    if (class9.field133 == class125.field2849 && class58.field1338 != class12.field230) {
                        class5.field93++;
                        class19 var20 = class125.method979(class125.field2849, 65535);
                        byte var21 = 0;
                        if (class76.field1747 == 1 && var20.field518 == 206) {
                            var21 = 1;
                        }
                        if (var20.field478[class12.field230] <= 0) {
                            var21 = 0;
                        }
                        if (var20.field497) {
                            int var24 = class58.field1338;
                            int var25 = class12.field230;
                            var20.field478[var25] = var20.field478[var24];
                            var20.field487[var25] = var20.field487[var24];
                            var20.field478[var24] = -1;
                            var20.field487[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class12.field230;
                            int var23 = class58.field1338;
                            while (var22 != var23) {
                                if (var22 < var23) {
                                    var20.method176((byte) 68, var23, var23 - 1);
                                    var23--;
                                } else if (var23 < var22) {
                                    var20.method176((byte) 57, var23, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var20.method176((byte) 104, class58.field1338, class12.field230);
                        }
                        class60.field1437.method622(40, true);
                        class60.field1437.method850(class58.field1338, (byte) 67);
                        class60.field1437.method823(var21, false);
                        class60.field1437.method860((byte) -70, class125.field2849);
                        class60.field1437.method850(class12.field230, (byte) 103);
                    }
                } else if ((class84.field1945 == 1 || class46.method309(class26.field654 - 1, (byte) 54)) && class26.field654 > 2) {
                    class66.method468(-5);
                } else if (class26.field654 > 0) {
                    class71.method490(class26.field654 - 1, (byte) -67);
                }
                class21.field568 = 0;
                class22.field591 = 10;
            }
        }
        if (class103.field2351 != -1) {
            int var26 = class103.field2358;
            int var27 = class103.field2351;
            boolean var28 = class115.method880(true, var26, 25, 0, 0, 0, 0, 0, var27, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            if (var28) {
                class97.field2171 = class82.field1909;
                class41.field952 = 0;
                class12.field229 = 1;
                class66.field1592 = class15.field280;
            }
            class103.field2351 = -1;
        }
        if (class21.field568 == 1 && class64.field1544 != null) {
            class21.field568 = 0;
            class9.field140 = true;
            class64.field1544 = null;
        }
        class82.method560(120);
        if (class63.field1525 == -1) {
            class50.method364(7786);
            class26.method204((byte) -102);
            class43.method290((byte) 102);
        }
        if (class107.field2432 == 1 || class21.field568 == 1) {
            class8.field117++;
        }
        if (class21.field569 == -1 && class116.field2641 == -1 && class127.field2915 == -1) {
            if (class61.field1480 > 0) {
                class61.field1480--;
            }
        } else if (class81.field1870 > class61.field1480) {
            class61.field1480++;
            if (class81.field1870 == class61.field1480) {
                if (class21.field569 != -1) {
                    class9.field140 = true;
                }
                if (class116.field2641 != -1) {
                    class97.field2168 = true;
                }
            }
        }
        class16.method133(false);
        if (class116.field2632) {
            class128.method997(true);
        }
        for (int var29 = 0; var29 < 5; var29++) {
            int var10002 = class82.field1903[var29]++;
        }
        class64.method458(true);
        int var30 = class114.method878((byte) 93);
        int var31 = class60.method440(false);
        if (var30 > 4500 && var31 > 4500) {
            class78.field1807++;
            class42.field967 = 250;
            class25.method203(4000, 91);
            class60.field1437.method622(62, true);
        }
        class56.field1291++;
        class95.field2126++;
        class41.field929++;
        if (class41.field929 > 500) {
            class41.field929 = 0;
            int var32 = (int) (Math.random() * 8.0D);
            if ((var32 & 0x2) == 2) {
                class61.field1461 += class120.field2761;
            }
            if ((var32 & 0x1) == 1) {
                class42.field976 += class84.field1947;
            }
            if ((var32 & 0x4) == 4) {
                class18.field399 += class12.field212;
            }
        }
        if (class42.field976 < -50) {
            class84.field1947 = 2;
        }
        if (class61.field1461 < -55) {
            class120.field2761 = 2;
        }
        if (class95.field2126 > 500) {
            class95.field2126 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x1) == 1) {
                class69.field1633 += class60.field1424;
            }
            if ((var33 & 0x2) == 2) {
                class28.field700 += class76.field1742;
            }
        }
        if (class69.field1633 < -60) {
            class60.field1424 = 2;
        }
        if (class61.field1461 > 55) {
            class120.field2761 = -2;
        }
        if (class18.field399 < -40) {
            class12.field212 = 1;
        }
        if (class42.field976 > 50) {
            class84.field1947 = -2;
        }
        if (class28.field700 < -20) {
            class76.field1742 = 1;
        }
        if (class28.field700 > 10) {
            class76.field1742 = -1;
        }
        if (class18.field399 > 40) {
            class12.field212 = -1;
        }
        if (class69.field1633 > 60) {
            class60.field1424 = -2;
        }
        if (class56.field1291 > 50) {
            class92.field2093++;
            class60.field1437.method622(139, true);
        }
        try {
            if (class119.field2740 != null && class60.field1437.field2507 > 0) {
                class119.field2740.method296(class60.field1437.field2512, class60.field1437.field2507, 0, true);
                class60.field1437.field2507 = 0;
                class56.field1291 = 0;
            }
        } catch (IOException var34) {
            class21.method184(21254);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
    public abstract int method41(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public abstract void method42(boolean arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public abstract void method43(byte arg0);
}
