import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class134 {

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2011 = 1;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lnf;")
    public static class162 field2003 = new class162(4);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "J")
    public long field2009;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Llb;")
    public class134 field2006;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Llb;")
    public class134 field2007;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public final void method995(byte arg0) {
        field2010++;
        if (this.field2007 == null) {
            return;
        }
        this.field2007.field2006 = this.field2006;
        this.field2006.field2007 = this.field2007;
        int var2 = 65 / ((arg0 + 57) / 33);
        this.field2006 = null;
        this.field2007 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method996(int arg0) {
        field2003 = null;
        int var1 = 42 / ((arg0 + 64) / 53);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Z")
    public final boolean method997(int arg0) {
        field2008++;
        if (this.field2007 == null) {
            return false;
        } else {
            if (arg0 > -22) {
                this.method997(-43);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static final void method998(byte arg0) {
        field2004++;
        int var1 = 6 % ((17 - arg0) / 38);
        if (class278.field4411 == 0 || class278.field4411 == 5) {
            return;
        }
        try {
            if ((++class216.field3314) > 2000) {
                if (class301.field4848 != null) {
                    class301.field4848.method1306((byte) -62);
                    class301.field4848 = null;
                }
                if (class185.field2916 >= 1) {
                    class278.field4411 = 0;
                    class129.field1921 = -5;
                    return;
                }
                class278.field4411 = 1;
                class216.field3314 = 0;
                if (class270.field4283 == class153.field2259) {
                    class153.field2259 = class235.field3707;
                } else {
                    class153.field2259 = class270.field4283;
                }
                class185.field2916++;
            }
            if (class278.field4411 == 1) {
                class86.field1279 = class123.field1863.method30(class214.field3286, class153.field2259, (byte) 3);
                class278.field4411 = 2;
            }
            if (class278.field4411 == 2) {
                if (class86.field1279.field2082 == 2) {
                    throw new IOException();
                }
                if (class86.field1279.field2082 != 1) {
                    return;
                }
                class301.field4848 = new class182((Socket) class86.field1279.field2080, class123.field1863);
                class86.field1279 = null;
                long var2 = class262.field4150 = class170.method1223(true, class76.field1174);
                class240.field3826.field541 = 0;
                class240.field3826.method305(14, true);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class240.field3826.method305(var4, true);
                class301.field4848.method1299(0, 2, class240.field3826.field560, (byte) 126);
                if (class304.field4889 != null) {
                    class304.field4889.method591(-7123);
                }
                if (class67.field1058 != null) {
                    class67.field1058.method591(-7123);
                }
                int var5 = class301.field4848.method1309((byte) 121);
                if (class304.field4889 != null) {
                    class304.field4889.method591(-7123);
                }
                if (class67.field1058 != null) {
                    class67.field1058.method591(-7123);
                }
                if (var5 != 0) {
                    class278.field4411 = 0;
                    class129.field1921 = var5;
                    class301.field4848.method1306((byte) -117);
                    class301.field4848 = null;
                    return;
                }
                class278.field4411 = 3;
            }
            if (class278.field4411 == 3) {
                if (class301.field4848.method1302(88) < 8) {
                    return;
                }
                int[] var6 = new int[4];
                class301.field4848.method1301(0, -127, 8, class183.field2900.field560);
                class183.field2900.field541 = 0;
                class283.field4459 = class183.field2900.method306(false);
                class240.field3826.field541 = 0;
                var6[3] = (int) class283.field4459;
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                var6[2] = (int) (class283.field4459 >> 32);
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                class240.field3826.method305(10, true);
                class240.field3826.method258(var6[0], -1527329320);
                class240.field3826.method258(var6[1], -1527329320);
                class240.field3826.method258(var6[2], -1527329320);
                class240.field3826.method258(var6[3], -1527329320);
                class240.field3826.method313(-6968, class170.method1223(true, class76.field1174));
                class240.field3826.method288(class129.field1922, (byte) -43);
                class240.field3826.method270(-26120, class283.field4456, class79.field1198);
                class197.field3073.field541 = 0;
                if (class23.field382 == 40) {
                    class197.field3073.method305(18, true);
                } else {
                    class197.field3073.method305(16, true);
                }
                class197.field3073.method281((byte) -117, (class240.field3826.field541 + class74.method586(21321, class253.field4038)) + 163);
                class197.field3073.method258(546, -1527329320);
                class197.field3073.method305(class20.field289, true);
                class197.field3073.method305(class240.field3815 ? 1 : 0, true);
                class197.field3073.method305(0, true);
                class197.field3073.method305(class194.method1382(true), true);
                class197.field3073.method281((byte) -117, class179.field2816);
                class197.field3073.method281((byte) -126, class163.field2449);
                class197.field3073.method305(class52.field825, true);
                class273.method1870(false, class197.field3073);
                class197.field3073.method288(class253.field4038, (byte) -43);
                class197.field3073.method258(class178.field2734, -1527329320);
                class197.field3073.method258(class182.method1300(0), -1527329320);
                class24.field426 = true;
                class197.field3073.method281((byte) -126, class79.field1210);
                class197.field3073.method258(class104.field1631.method702((byte) 94), -1527329320);
                class197.field3073.method258(class115.field1765.method702((byte) -20), -1527329320);
                class197.field3073.method258(class221.field3383.method702((byte) -64), -1527329320);
                class197.field3073.method258(class264.field4184.method702((byte) -94), -1527329320);
                class197.field3073.method258(class150.field2231.method702((byte) 121), -1527329320);
                class197.field3073.method258(class274.field4369.method702((byte) 118), -1527329320);
                class197.field3073.method258(class205.field3153.method702((byte) -40), -1527329320);
                class197.field3073.method258(class233.field3687.method702((byte) -5), -1527329320);
                class197.field3073.method258(class246.field3910.method702((byte) 118), -1527329320);
                class197.field3073.method258(class68.field1076.method702((byte) 106), -1527329320);
                class197.field3073.method258(class77.field1176.method702((byte) -79), -1527329320);
                class197.field3073.method258(class155.field2318.method702((byte) -56), -1527329320);
                class197.field3073.method258(class114.field1750.method702((byte) -24), -1527329320);
                class197.field3073.method258(class180.field2818.method702((byte) 97), -1527329320);
                class197.field3073.method258(class162.field2423.method702((byte) 120), -1527329320);
                class197.field3073.method258(class173.field2657.method702((byte) 96), -1527329320);
                class197.field3073.method258(class33.field587.method702((byte) -110), -1527329320);
                class197.field3073.method258(class123.field1856.method702((byte) 117), -1527329320);
                class197.field3073.method258(class162.field2430.method702((byte) 96), -1527329320);
                class197.field3073.method258(class112.field1725.method702((byte) -51), -1527329320);
                class197.field3073.method258(class246.field3911.method702((byte) -100), -1527329320);
                class197.field3073.method258(class104.field1625.method702((byte) -87), -1527329320);
                class197.field3073.method258(class27.field460.method702((byte) -45), -1527329320);
                class197.field3073.method258(class265.field4196.method702((byte) 93), -1527329320);
                class197.field3073.method258(class126.field1899.method702((byte) 127), -1527329320);
                class197.field3073.method258(class202.field3122.method702((byte) 99), -1527329320);
                class197.field3073.method258(class252.field4020.method702((byte) 85), -1527329320);
                class197.field3073.method258(class142.field2130.method702((byte) -100), -1527329320);
                class197.field3073.method258(class122.field1843.method702((byte) 90), -1527329320);
                class197.field3073.method302(class240.field3826.field541, 6103, 0, class240.field3826.field560);
                class301.field4848.method1299(0, class197.field3073.field541, class197.field3073.field560, (byte) 125);
                class240.field3826.method1771(var6, -7);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class183.field2900.method1771(var6, -7);
                class278.field4411 = 4;
            }
            if (class278.field4411 == 4) {
                if (class301.field4848.method1302(-100) < 1) {
                    return;
                }
                int var8 = class301.field4848.method1309((byte) -125);
                if (var8 == 21) {
                    class278.field4411 = 7;
                } else if (var8 == 29) {
                    class278.field4411 = 10;
                } else if (var8 == 1) {
                    class278.field4411 = 5;
                    class129.field1921 = var8;
                    return;
                } else if (var8 == 2) {
                    class278.field4411 = 8;
                } else if (var8 == 15) {
                    class129.field1921 = var8;
                    class278.field4411 = 0;
                    return;
                } else if (var8 == 23 && class185.field2916 < 1) {
                    class216.field3314 = 0;
                    class278.field4411 = 1;
                    class185.field2916++;
                    class301.field4848.method1306((byte) -89);
                    class301.field4848 = null;
                    return;
                } else {
                    class129.field1921 = var8;
                    class278.field4411 = 0;
                    class301.field4848.method1306((byte) -90);
                    class301.field4848 = null;
                    return;
                }
            }
            if (class278.field4411 == 6) {
                class240.field3826.field541 = 0;
                class240.field3826.method1762(17, true);
                class301.field4848.method1299(0, class240.field3826.field541, class240.field3826.field560, (byte) 125);
                class278.field4411 = 4;
            } else if (class278.field4411 == 7) {
                if (class301.field4848.method1302(-116) >= 1) {
                    class234.field3691 = class301.field4848.method1309((byte) -29) * 60 + 180;
                    class278.field4411 = 0;
                    class129.field1921 = 21;
                    class301.field4848.method1306((byte) -128);
                    class301.field4848 = null;
                }
            } else if (class278.field4411 != 10) {
                if (class278.field4411 == 8) {
                    if (class301.field4848.method1302(86) < 14) {
                        return;
                    }
                    class301.field4848.method1301(0, -10, 14, class183.field2900.field560);
                    class183.field2900.field541 = 0;
                    class53.field835 = class183.field2900.method265(-90);
                    class156.field2325 = class183.field2900.method265(-107);
                    class112.field1733 = class183.field2900.method265(-95) == 1;
                    class166.field2508 = class183.field2900.method265(-105) == 1;
                    class198.field3082 = class183.field2900.method265(-125) == 1;
                    class54.field854 = class183.field2900.method265(-82) == 1;
                    class295.field4602 = class183.field2900.method265(-109) == 1;
                    class107.field1677 = class183.field2900.method260((byte) -67);
                    class248.field3935 = class183.field2900.method265(-94) == 1;
                    class272.field4344 = class183.field2900.method265(-108) == 1;
                    class296.method1975((byte) -78, class272.field4344);
                    class88.method671(class272.field4344, 14955);
                    if (!class240.field3815) {
                        if ((!class112.field1733 || class198.field3082) && !class248.field3935) {
                            try {
                                class289.method1926(true, "unzap", class123.field1863.field63);
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class289.method1926(true, "zap", class123.field1863.field63);
                            } catch (Throwable var11) {
                            }
                        }
                    }
                    try {
                        class289.method1926(true, "loggedin", class123.field1863.field63);
                    } catch (Throwable var9) {
                    }
                    class215.field3302 = class183.field2900.method1770((byte) 8);
                    class95.field1528 = class183.field2900.method260((byte) -67);
                    class278.field4411 = 9;
                }
                if (class278.field4411 == 9 && class301.field4848.method1302(-59) >= class95.field1528) {
                    class183.field2900.field541 = 0;
                    class301.field4848.method1301(0, 39, class95.field1528, class183.field2900.field560);
                    class278.field4411 = 0;
                    class129.field1921 = 2;
                    class164.method1182(101);
                    class303.field4870 = -1;
                    class181.method1293(false, 26);
                    class215.field3302 = -1;
                }
            } else if (class301.field4848.method1302(85) >= 1) {
                class216.field3315 = class301.field4848.method1309((byte) 126);
                class278.field4411 = 0;
                class129.field1921 = 29;
                class301.field4848.method1306((byte) -105);
                class301.field4848 = null;
            }
        } catch (IOException var12) {
            if (class301.field4848 != null) {
                class301.field4848.method1306((byte) -109);
                class301.field4848 = null;
            }
            if (class185.field2916 < 1) {
                class185.field2916++;
                class278.field4411 = 1;
                if (class270.field4283 == class153.field2259) {
                    class153.field2259 = class235.field3707;
                } else {
                    class153.field2259 = class270.field4283;
                }
                class216.field3314 = 0;
            } else {
                class278.field4411 = 0;
                class129.field1921 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2014++;
        class33.field588++;
        class292.method1936((byte) -6);
        if (arg5) {
            class68.method550(0, 20194, false, false);
        } else {
            class278.method1893((byte) -35, 0);
            class68.method550(0, 20194, true, false);
            if (class292.field4531 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class68.method550(var7, 20194, false, false);
                    class68.method550(var7, arg4 ^ 0x4FE2, false, true);
                    class278.method1893((byte) -119, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class278.method1893((byte) 90, var6);
                    class68.method550(var6, 20194, false, false);
                    class68.method550(var6, 20194, false, true);
                }
            }
        }
        if (!arg5) {
            class301.method2019(arg4 - 25305);
        }
        class298.method1999(47);
        class249.field3964 = arg0;
        class249.field3970 = arg1;
        if (class175.field2704 == 1) {
            int var8 = (int) class248.field3941;
            int var9 = (int) class50.field818 + class280.field4432 & 0x7FF;
            if (var8 < class35.field616 / 256) {
                var8 = class35.field616 / 256;
            }
            if (class137.field2066[4] && var8 < class24.field417[4] + 128) {
                var8 = class24.field417[4] + 128;
            }
            class204.method1434(class135.field2025, 19495, var8, var8 * 3 + 600, arg3, var9, class254.method1721(-580808345, class130.field1941, class263.field4168.field4709, class263.field4168.field4725) - 50, class223.field3573);
        } else if (class175.field2704 == 5) {
            class299.method2006(false, arg3);
        }
        int var10 = class226.field3616;
        int var11 = class250.field4007;
        int var12 = class82.field1244;
        int var13 = class118.field1787;
        int var14 = class8.field128;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class137.field2066[var15]) {
                int var22 = (int) ((double) (-class110.field1694[var15]) + Math.random() * (double) (class110.field1694[var15] * 2 + 1) + Math.sin((double) class77.field1178[var15] / 100.0D * (double) class223.field3589[var15]) * (double) class24.field417[var15]);
                if (var15 == 4) {
                    class8.field128 += var22;
                    if (class8.field128 < 128) {
                        class8.field128 = 128;
                    }
                    if (class8.field128 > 383) {
                        class8.field128 = 383;
                    }
                }
                if (var15 == 0) {
                    class226.field3616 += var22;
                }
                if (var15 == 2) {
                    class118.field1787 += var22;
                }
                if (var15 == 1) {
                    class250.field4007 += var22;
                }
                if (var15 == 3) {
                    class82.field1244 = class82.field1244 + var22 & 0x7FF;
                }
            }
        }
        class280.method1898(86);
        class66.method524(arg1, arg0, arg1 + arg2, arg0 + arg3);
        class224.method1543();
        if (class307.field4928 >= 0) {
            class146 var16 = class70.method562(class50.field814, class297.field4793, (byte) -40, class37.field637, class307.field4928);
            var16.method1056(class37.field636, arg1, arg0, arg2, arg3, class8.field128, class82.field1244, 0);
        } else {
            class66.method532(arg1, arg0, arg2, arg3, 0);
        }
        if (class207.field3185 || arg1 > class121.field1831 || (arg1 + arg2) <= class121.field1831 || arg0 > class9.field156 || class9.field156 >= arg0 + arg3) {
            class294.field4571 = false;
            class62.field982 = 0;
        } else {
            class294.field4571 = true;
            class62.field982 = 0;
            int var17 = class206.field3169;
            int var18 = class238.field3752;
            class308.field4940 = (class121.field1831 - arg1) * (var18 - var17) / arg2 + var17;
            int var19 = class170.field2572;
            int var20 = class86.field1284;
            class37.field658 = (class9.field156 - arg0) * (var19 - var20) / arg3 + var20;
        }
        class102.method778(-9546);
        byte var21 = class257.method1738(true) == 2 ? (byte) class33.field588 : 1;
        class18.method134(class226.field3616, class250.field4007, class118.field1787, class8.field128, class82.field1244, class141.field2108, class163.field2454, class250.field3999, class79.field1206, class203.field3127, class294.field4569, class130.field1941 + 1, var21, class263.field4168.field4725 >> 7, class263.field4168.field4709 >> 7);
        class102.method778(-9546);
        class136.method1009();
        class147.method1060(arg1, arg3, 256, arg0, arg2, true, 256);
        class265.method1780((byte) -94, 256, arg2, arg1, arg3, arg0, arg4);
        ((class293) class224.field3596).method1942(class209.field3230, (byte) -124);
        class82.method643((byte) 112, arg3, arg2, arg1, arg0);
        class8.field128 = var14;
        class250.field4007 = var11;
        class118.field1787 = var13;
        class82.field1244 = var12;
        class226.field3616 = var10;
        if (class182.field2877 && class210.field3249.method835(-2) == 0) {
            class182.field2877 = false;
        }
        if (class182.field2877) {
            class66.method532(arg1, arg0, arg2, arg3, 0);
            class56.method469((byte) -101, false, class166.field2515);
        }
        if (!arg5 && !class182.field2877 && !class207.field3185 && arg1 <= class121.field1831 && (arg1 + arg2) > class121.field1831 && arg0 <= class9.field156 && (arg0 + arg3) > class9.field156) {
            class198.method1407(arg2, arg3, arg1, arg0, (byte) -78, class121.field1831, class9.field156);
        }
    }
}
