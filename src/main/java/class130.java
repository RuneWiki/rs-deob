import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class130 extends class80 {

    @OriginalMember(owner = "client!vd", name = "Cd", descriptor = "La;")
    public static class1 field3187 = class113.method934(-11538, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!vd", name = "vd", descriptor = "La;")
    public static class1 field3180 = null;

    @OriginalMember(owner = "client!vd", name = "ud", descriptor = "I")
    public static int field3179 = 0;

    @OriginalMember(owner = "client!vd", name = "Id", descriptor = "La;")
    public static class1 field3193 = class113.method934(-11538, "gr-Un:");

    @OriginalMember(owner = "client!vd", name = "Jd", descriptor = "La;")
    public static class1 field3194 = class113.method934(-11538, "Hierhin gehen");

    @OriginalMember(owner = "client!vd", name = "Ed", descriptor = "[I")
    public static int[] field3189 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vd", name = "Hd", descriptor = "La;")
    public static class1 field3192 = class113.method934(-11538, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!vd", name = "xd", descriptor = "La;")
    private static class1 field3182 = class113.method934(-11538, "On");

    @OriginalMember(owner = "client!vd", name = "Ld", descriptor = "La;")
    public static class1 field3196 = field3182;

    @OriginalMember(owner = "client!vd", name = "Od", descriptor = "La;")
    private static class1 field3199 = class113.method934(-11538, "Connection lost");

    @OriginalMember(owner = "client!vd", name = "Fd", descriptor = "La;")
    public static class1 field3190 = field3199;

    @OriginalMember(owner = "client!vd", name = "wd", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!vd", name = "zd", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!vd", name = "Dd", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!vd", name = "Gd", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!vd", name = "Kd", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!vd", name = "Nd", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!vd", name = "Bd", descriptor = "Lab;")
    public static class3 field3186;

    @OriginalMember(owner = "client!vd", name = "Ad", descriptor = "Lh;")
    public class42 field3185;

    @OriginalMember(owner = "client!vd", name = "yd", descriptor = "Z")
    public static boolean field3183;

    @OriginalMember(owner = "client!vd", name = "Md", descriptor = "[I")
    public static int[] field3197;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Lqa;", line = 13)
    public static final class97 method1026(byte arg0, int arg1) {
        ++field3188;
        class97 var2 = (class97) class24.field728.method264((long) arg1, (byte) 98);
        if (arg0 >= -66) {
            field3180 = null;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class129.field3170.method218(arg1, 120, 16);
            class97 var4 = new class97();
            if (var3 != null) {
                var4.method841(new class8(var3), 0);
            }
            class24.field728.method263(-7208, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)Lpa;", line = 47)
    public final class91 method42(int arg0) {
        ++field3198;
        if (this.field3185 == null) {
            return null;
        } else {
            int var2 = 25 % ((41 - arg0) / 47);
            class47 var3 = ~super.field2018 != 0 && super.field1999 == 0 ? class4.method104(super.field2018, 2) : null;
            class47 var4 = super.field1954 == -1 || super.field2003 == super.field1954 && var3 != null ? null : class4.method104(super.field1954, 2);
            class91 var5 = this.field3185.method449((byte) -50, var3, var4, super.field1993, super.field1981);
            if (var5 == null) {
                return null;
            } else {
                var5.method769();
                super.field1994 = var5.field3138;
                if (~super.field1968 != 0 && super.field2017 != -1) {
                    class91 var6 = class78.method716(super.field1968, 13).method372(super.field2017, 2);
                    if (var6 != null) {
                        var6.method799(0, -super.field1987, 0);
                        class91[] var7 = new class91[] { var5, var6 };
                        var5 = new class91(var7, 2, true);
                    }
                }
                if (~this.field3185.field1085 == -2) {
                    var5.field2208 = true;
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V", line = 101)
    public static final void method1027(byte arg0) {
        ++field3191;
        if (~class114.field2816 < -2) {
            --class114.field2816;
        }
        if (~class70.field1753 < -1) {
            --class70.field1753;
        }
        if (class78.field1922) {
            class78.field1922 = false;
            class117.method963(2578);
        } else {
            for (int var1 = 0; ~var1 > -101 && class5.method112(false); ++var1) {
            }
            if (~class103.field2602 == -31 || ~class103.field2602 == -36) {
                if (class39.field1070 && ~class103.field2602 == -31) {
                    class28.field802 = 0;
                    class122.field3053 = 0;
                    while (class74.method688((byte) -104)) {
                    }
                    for (int var2 = 0; var2 < class59.field1491.length; ++var2) {
                        class59.field1491[var2] = false;
                    }
                }
                class46.method481(-12, 205, class70.field1729);
                Object var3 = class23.field709.field2045;
                synchronized (class23.field709.field2045) {
                    if (!class45.field1188) {
                        class23.field709.field2061 = 0;
                    } else if (~class122.field3053 != -1 || class23.field709.field2061 >= 40) {
                        ++class53.field1392;
                        int var4 = 0;
                        class70.field1729.method416(11453, 210);
                        class70.field1729.method142(0, (byte) -128);
                        int var5 = class70.field1729.field268;
                        for (int var6 = 0; var6 < class23.field709.field2061 && -var5 + class70.field1729.field268 < 240; ++var6) {
                            ++var4;
                            int var7 = class23.field709.field2060[var6];
                            if (var7 >= 0) {
                                if (~var7 < -503) {
                                    var7 = 502;
                                }
                            } else {
                                var7 = 0;
                            }
                            int var8 = class23.field709.field2062[var6];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (~var8 < -765) {
                                var8 = 764;
                            }
                            int var9 = var7 * 765 + var8;
                            if (~class23.field709.field2060[var6] == 0 && ~class23.field709.field2062[var6] == 0) {
                                var8 = -1;
                                var9 = 524287;
                                var7 = -1;
                            }
                            if (~class36.field974 == ~var8 && class49.field1344 == var7) {
                                if (class123.field3072 < 2047) {
                                    ++class123.field3072;
                                }
                            } else {
                                int var10 = var8 - class36.field974;
                                class36.field974 = var8;
                                int var11 = var7 - class49.field1344;
                                class49.field1344 = var7;
                                if (class123.field3072 < 8 && var10 >= -32 && ~var10 >= -32 && ~var11 <= 31 && var11 <= 31) {
                                    var10 += 32;
                                    var11 += 32;
                                    class70.field1729.method151((class123.field3072 << 12) + (var10 << 6) + var11, -126);
                                    class123.field3072 = 0;
                                } else if (class123.field3072 < 8) {
                                    class70.field1729.method154(var9 + 8388608 - -(class123.field3072 << 19), 13723);
                                    class123.field3072 = 0;
                                } else {
                                    class70.field1729.method183(40, (class123.field3072 << 19) + -1073741824 + var9);
                                    class123.field3072 = 0;
                                }
                            }
                        }
                        class70.field1729.method156(-var5 + class70.field1729.field268, (byte) 16);
                        if (var4 < class23.field709.field2061) {
                            class23.field709.field2061 -= var4;
                            for (int var12 = 0; ~class23.field709.field2061 < ~var12; ++var12) {
                                class23.field709.field2062[var12] = class23.field709.field2062[var4 + var12];
                                class23.field709.field2060[var12] = class23.field709.field2060[var4 + var12];
                            }
                        } else {
                            class23.field709.field2061 = 0;
                        }
                    }
                }
                if (class122.field3053 != 0) {
                    ++class35.field939;
                    long var13 = (class49.field1346 - class103.field2608) / 50L;
                    int var15 = class112.field2765;
                    int var16 = class1.field14;
                    class103.field2608 = class49.field1346;
                    if (var15 >= 0) {
                        if (var15 > 764) {
                            var15 = 764;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (~var16 <= -1) {
                        if (~var16 < -503) {
                            var16 = 502;
                        }
                    } else {
                        var16 = 0;
                    }
                    byte var17 = 0;
                    if (~class122.field3053 == -3) {
                        var17 = 1;
                    }
                    if (~var13 < -4096L) {
                        var13 = 4095L;
                    }
                    int var18 = (int) var13;
                    class70.field1729.method416(11453, 234);
                    int var19 = var16 * 765 - -var15;
                    class70.field1729.method171((var17 << 19) + ((var18 << 20) - -var19), 93);
                }
                if (class37.field999 > 0) {
                    --class37.field999;
                }
                if (class59.field1491[96] || class59.field1491[97] || class59.field1491[98] || class59.field1491[99]) {
                    class48.field1273 = true;
                }
                if (class48.field1273 && class37.field999 <= 0) {
                    ++class24.field737;
                    class37.field999 = 20;
                    class48.field1273 = false;
                    class70.field1729.method416(11453, 58);
                    class70.field1729.method151(class113.field2800, -126);
                    class70.field1729.method151(class131.field3207, -121);
                }
                if (class48.field1279 && !class75.field1865) {
                    ++class118.field2941;
                    class75.field1865 = true;
                    class70.field1729.method416(11453, 160);
                    class70.field1729.method142(1, (byte) -128);
                }
                if (!class48.field1279 && class75.field1865) {
                    class75.field1865 = false;
                    ++class118.field2941;
                    class70.field1729.method416(11453, 160);
                    class70.field1729.method142(0, (byte) -128);
                }
                class92.method813(-32322);
                if (class103.field2602 == 30 || ~class103.field2602 == -36) {
                    class104.method881((byte) 0);
                    class6.method126(128);
                    ++class75.field1858;
                    if (class75.field1858 > 750) {
                        class117.method963(2578);
                    } else {
                        class31.method385(-1);
                        class14.method253(69);
                        class38.method425(54);
                        if (~class92.field2298 != -1) {
                            class34.field895 += 20;
                            if (~class34.field895 <= -401) {
                                class92.field2298 = 0;
                            }
                        }
                        if (class19.field657 != 0) {
                            ++class43.field1155;
                            if (~class43.field1155 <= -16) {
                                if (class19.field657 == 2) {
                                    class39.field1056 = true;
                                }
                                if (class19.field657 == 3) {
                                    class105.field2640 = true;
                                }
                                class19.field657 = 0;
                            }
                        }
                        ++class9.field322;
                        if (~class32.field858 != -1) {
                            ++class8.field299;
                            if (~class24.field742 < ~(class128.field3146 - -5) || ~(class128.field3146 + -5) < ~class24.field742 || ~(class115.field2832 - -5) > ~class102.field2571 || class115.field2832 - 5 > class102.field2571) {
                                class114.field2818 = true;
                            }
                            if (~class28.field802 == -1) {
                                if (~class32.field858 == -4) {
                                    class105.field2640 = true;
                                }
                                if (~class32.field858 == -3) {
                                    class39.field1056 = true;
                                }
                                class32.field858 = 0;
                                if (class114.field2818 && class8.field299 >= 5) {
                                    class43.field1146 = -1;
                                    class86.method760(false);
                                    if (~class98.field2413 == ~class43.field1146 && class113.field2779 != class108.field2707) {
                                        ++class132.field3232;
                                        class100 var20 = class134.method1056(class98.field2413, (byte) -95);
                                        byte var21 = 0;
                                        if (~class86.field2166 == -2 && var20.field2448 == 206) {
                                            var21 = 1;
                                        }
                                        if (~var20.field2494[class108.field2707] >= -1) {
                                            var21 = 0;
                                        }
                                        if (!var20.field2532) {
                                            if (~var21 != -2) {
                                                var20.method853(class108.field2707, false, class113.field2779);
                                            } else {
                                                int var22 = class113.field2779;
                                                int var23 = class108.field2707;
                                                while (var22 != var23) {
                                                    if (var22 <= var23) {
                                                        if (~var22 > ~var23) {
                                                            var20.method853(var22 + 1, false, var22);
                                                            ++var22;
                                                        }
                                                    } else {
                                                        var20.method853(var22 + -1, false, var22);
                                                        --var22;
                                                    }
                                                }
                                            }
                                        } else {
                                            int var24 = class108.field2707;
                                            int var25 = class113.field2779;
                                            var20.field2494[var24] = var20.field2494[var25];
                                            var20.field2519[var24] = var20.field2519[var25];
                                            var20.field2494[var25] = -1;
                                            var20.field2519[var25] = 0;
                                        }
                                        class70.field1729.method416(11453, 83);
                                        class70.field1729.method166(128, var21);
                                        class70.field1729.method170(class113.field2779, -128);
                                        class70.field1729.method155(class108.field2707, -20);
                                        class70.field1729.method180(-2030879560, class98.field2413);
                                    }
                                } else if ((~class134.field3300 == -2 || class72.method679((byte) 63, class42.field1105 - 1)) && class42.field1105 > 2) {
                                    class118.method971(11451);
                                } else if (~class42.field1105 < -1) {
                                    class63.method607(123, class42.field1105 + -1);
                                }
                                class43.field1155 = 10;
                                class122.field3053 = 0;
                            }
                        }
                        if (~class3.field106 != 0) {
                            int var26 = class3.field106;
                            int var27 = class3.field109;
                            boolean var28 = class60.method579(0, 0, class104.field2624.field1965[0], var26, (byte) 119, 0, true, 0, 0, class104.field2624.field2012[0], var27, 0);
                            if (var28) {
                                class16.field524 = class1.field14;
                                class34.field895 = 0;
                                class119.field2970 = class112.field2765;
                                class92.field2298 = 1;
                            }
                            class3.field106 = -1;
                        }
                        if (~class122.field3053 == -2 && class64.field1608 != null) {
                            class122.field3053 = 0;
                            class105.field2640 = true;
                            class64.field1608 = null;
                        }
                        class122.method995(-77);
                        if (~class42.field1144 == 0) {
                            class59.method568((byte) -125);
                            class60.method578((byte) 29);
                            class16.method272((byte) -54);
                        }
                        if (~class28.field802 == -2 || ~class122.field3053 == -2) {
                            ++field3179;
                        }
                        byte var29 = 34;
                        if (class132.field3230 != -1) {
                            class63.method609((byte) 125, 516, var29, 338, class132.field3230, 4, 4);
                        }
                        if (class66.field1651 == -1) {
                            if (~class97.field2400[class9.field331] != 0) {
                                class63.method609((byte) 125, 743, var29, 466, class97.field2400[class9.field331], 205, 553);
                            }
                        } else {
                            class63.method609((byte) 125, 743, var29, 466, class66.field1651, 205, 553);
                        }
                        if (~class86.field2169 != 0) {
                            class63.method609((byte) 125, 496, var29, 453, class86.field2169, 357, 17);
                        } else if (~class98.field2424 != 0) {
                            class63.method609((byte) 125, 496, var29, 453, class98.field2424, 357, 17);
                        }
                        if (~class132.field3230 != 0) {
                            class63.method609((byte) 125, 516, ~var29, 338, class132.field3230, 4, 4);
                        }
                        if (class66.field1651 != -1) {
                            class63.method609((byte) 125, 743, ~var29, 466, class66.field1651, 205, 553);
                        } else if (class97.field2400[class9.field331] != -1) {
                            class63.method609((byte) 125, 743, ~var29, 466, class97.field2400[class9.field331], 205, 553);
                        }
                        if (class86.field2169 != -1) {
                            class63.method609((byte) 125, 496, ~var29, 453, class86.field2169, 357, 17);
                        } else if (class98.field2424 != -1) {
                            class63.method609((byte) 125, 496, ~var29, 453, class98.field2424, 357, 17);
                        }
                        if (~class133.field3256 == 0 && ~class52.field1390 == 0 && class48.field1281 == -1) {
                            if (~class106.field2676 < -1) {
                                --class106.field2676;
                            }
                        } else if (class1.field57 > class106.field2676) {
                            ++class106.field2676;
                            if (~class106.field2676 == ~class1.field57) {
                                if (class133.field3256 != -1) {
                                    class105.field2640 = true;
                                }
                                if (class52.field1390 != -1) {
                                    class39.field1056 = true;
                                }
                            }
                        }
                        class59.method567(false);
                        if (class81.field2046) {
                            class9.method190(35);
                        }
                        for (int var30 = 0; ~var30 > -6; ++var30) {
                            int var10002 = class38.field1020[var30]++;
                        }
                        class46.method484(2);
                        int var31 = class70.method665(-1);
                        int var32 = class31.method383(true);
                        if (var31 > 4500 && var32 > 4500) {
                            ++class1.field19;
                            class70.field1753 = 250;
                            class104.method879(true, 4000);
                            class70.field1729.method416(11453, 216);
                        }
                        ++class2.field73;
                        ++class60.field1531;
                        if (arg0 <= 6) {
                            method1029(-34, 97);
                        }
                        if (class60.field1531 > 500) {
                            int var33 = (int) (8.0D * Math.random());
                            if (~(2 & var33) == -3) {
                                class98.field2412 += class4.field186;
                            }
                            if (~(var33 & 1) == -2) {
                                class8.field297 += class85.field2151;
                            }
                            class60.field1531 = 0;
                            if ((4 & var33) == 4) {
                                class112.field2769 += class9.field318;
                            }
                        }
                        if (~class98.field2412 > 54) {
                            class4.field186 = 2;
                        }
                        if (class2.field73 > 500) {
                            int var34 = (int) (Math.random() * 8.0D);
                            if (~(1 & var34) == -2) {
                                class86.field2161 += class24.field741;
                            }
                            if (~(2 & var34) == -3) {
                                class103.field2592 += client.field588;
                            }
                            class2.field73 = 0;
                        }
                        if (class98.field2412 > 55) {
                            class4.field186 = -2;
                        }
                        if (~class8.field297 > 49) {
                            class85.field2151 = 2;
                        }
                        if (~class86.field2161 > 59) {
                            class24.field741 = 2;
                        }
                        ++class45.field1181;
                        if (~class8.field297 < -51) {
                            class85.field2151 = -2;
                        }
                        if (~class86.field2161 < -61) {
                            class24.field741 = -2;
                        }
                        if (class112.field2769 < -40) {
                            class9.field318 = 1;
                        }
                        if (~class112.field2769 < -41) {
                            class9.field318 = -1;
                        }
                        if (class103.field2592 < -20) {
                            client.field588 = 1;
                        }
                        if (class103.field2592 > 10) {
                            client.field588 = -1;
                        }
                        if (~class45.field1181 < -51) {
                            class70.field1729.method416(11453, 13);
                            ++class99.field2428;
                        }
                        try {
                            if (class57.field1453 != null && class70.field1729.field268 > 0) {
                                class57.field1453.method1019(class70.field1729.field268, (byte) -19, 0, class70.field1729.field285);
                                class45.field1181 = 0;
                                class70.field1729.field268 = 0;
                            }
                        } catch (IOException var35) {
                            class117.method963(2578);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "(I)V", line = 719)
    public static void method1028(int arg0) {
        field3192 = null;
        field3189 = null;
        field3199 = null;
        field3190 = null;
        field3182 = null;
        field3180 = null;
        field3196 = null;
        field3193 = null;
        field3197 = null;
        field3187 = null;
        field3186 = null;
        field3194 = null;
        if (arg0 != 210) {
            field3192 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Lfc;", line = 757)
    public static final class34 method1029(int arg0, int arg1) {
        ++field3181;
        class34 var2 = (class34) class72.field1760.method264((long) arg0, (byte) 63);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class80.field2021.method218(arg0, 118, arg1);
            class34 var4 = new class34();
            if (var3 != null) {
                var4.method394((byte) 65, arg0, new class8(var3));
            }
            var4.method396((byte) 64);
            class72.field1760.method263(-7208, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)Z", line = 791)
    public final boolean method43(int arg0) {
        ++field3184;
        if (this.field3185 == null) {
            return false;
        } else {
            return arg0 == 1;
        }
    }
}
