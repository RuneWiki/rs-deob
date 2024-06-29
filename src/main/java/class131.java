import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class131 extends class59 {

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field2137 = 0;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "Lph;")
    public static class229 field2139 = class266.method1858("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3", 0);

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "Lsi;")
    public static class66 field2130;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "[[B")
    public static byte[][] field2132;

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 5)
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method936(boolean arg0) {
        if (class115.field1953 > 1) {
            class115.field1953--;
            class116.field1964 = class129.field2125;
        }
        field2135++;
        if (class208.field3429 > 0) {
            class208.field3429--;
        }
        if (class39.field629) {
            class39.field629 = false;
            class19.method114(4096);
            return;
        }
        for (int var1 = 0; var1 < 100 && class232.method1653(false); var1++) {
        }
        if (class169.field2786 != 30) {
            return;
        }
        class256.method1784(98, 25, class121.field2033);
        Object var2 = class153.field2499.field2287;
        synchronized (class153.field2499.field2287) {
            if (!class116.field1957) {
                class153.field2499.field2291 = 0;
            } else if (class209.field3459 != 0 || class153.field2499.field2291 >= 40) {
                class321.field5440++;
                int var3 = 0;
                class121.field2033.method37(61, 208);
                class121.field2033.method1188(-81, 0);
                int var4 = class121.field2033.field2670;
                for (int var5 = 0; class153.field2499.field2291 > var5 && class121.field2033.field2670 - var4 < 240; var5++) {
                    int var6 = class153.field2499.field2290[var5];
                    boolean var7 = false;
                    int var8 = class153.field2499.field2288[var5];
                    var3++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class153.field2499.field2290[var5] == -1 && class153.field2499.field2288[var5] == -1) {
                        var6 = -1;
                        var7 = true;
                        var8 = -1;
                    }
                    if (class328.field5594 != var8 || class207.field3402 != var6) {
                        int var9 = var8 - class328.field5594;
                        class328.field5594 = var8;
                        int var10 = var6 - class207.field3402;
                        class207.field3402 = var6;
                        if (class167.field2727 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class121.field2033.method1155(-1640531527, (class167.field2727 << 12) + (var9 << 6) + var10);
                            class167.field2727 = 0;
                        } else if (class167.field2727 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class121.field2033.method1188(-125, class167.field2727 + 128);
                            class121.field2033.method1155(-1640531527, (var9 << 8) + var10);
                            class167.field2727 = 0;
                        } else if (class167.field2727 < 32) {
                            class121.field2033.method1188(-76, class167.field2727 + 192);
                            if (var7) {
                                class121.field2033.method1168(Integer.MIN_VALUE, (byte) -64);
                            } else {
                                class121.field2033.method1168(var6 << 16 | var8, (byte) -65);
                            }
                            class167.field2727 = 0;
                        } else {
                            class121.field2033.method1155(-1640531527, class167.field2727 + 57344);
                            if (var7) {
                                class121.field2033.method1168(Integer.MIN_VALUE, (byte) -74);
                            } else {
                                class121.field2033.method1168(var6 << 16 | var8, (byte) -125);
                            }
                            class167.field2727 = 0;
                        }
                    } else if (class167.field2727 < 2047) {
                        class167.field2727++;
                    }
                }
                class121.field2033.method1173(class121.field2033.field2670 - var4, -1);
                if (var3 >= class153.field2499.field2291) {
                    class153.field2499.field2291 = 0;
                } else {
                    class153.field2499.field2291 -= var3;
                    for (int var11 = 0; var11 < class153.field2499.field2291; var11++) {
                        class153.field2499.field2288[var11] = class153.field2499.field2288[var3 + var11];
                        class153.field2499.field2290[var11] = class153.field2499.field2290[var3 + var11];
                    }
                }
            }
        }
        if (class209.field3459 != 0) {
            class183.field2979++;
            long var13 = (class269.field4516 - class260.field4335) / 50L;
            class260.field4335 = class269.field4516;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            byte var15 = 0;
            if (class209.field3459 == 2) {
                var15 = 1;
            }
            int var16 = class220.field3613;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var13;
            int var18 = class48.field697;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 65535) {
                var18 = 65535;
            }
            class121.field2033.method37(122, 53);
            class121.field2033.method1180(52, var17 | var15 << 15);
            class121.field2033.method1207((byte) -2, var18 | var16 << 16);
        }
        if (class287.field4719 > 0) {
            class287.field4719--;
        }
        if (class255.field4267) {
            for (int var19 = 0; var19 < class214.field3534; var19++) {
                int var20 = class275.field4593[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class238.field3931 = true;
                    break;
                }
            }
        } else if (class94.field1583[96] || class94.field1583[97] || class94.field1583[98] || class94.field1583[99]) {
            class238.field3931 = true;
        }
        if (class238.field3931 && class287.field4719 <= 0) {
            class287.field4719 = 20;
            class238.field3931 = false;
            class121.field2033.method37(109, 254);
            class15.field178++;
            class121.field2033.method1160(class147.field2379, -1247507120);
            class121.field2033.method1160(class245.field4049, -1247507120);
        }
        if (class293.field4783 && !class229.field3811) {
            class48.field708++;
            class229.field3811 = true;
            class121.field2033.method37(117, 97);
            class121.field2033.method1188(-118, 1);
        }
        if (!class293.field4783 && class229.field3811) {
            class48.field708++;
            class229.field3811 = false;
            class121.field2033.method37(54, 97);
            class121.field2033.method1188(-98, 0);
        }
        if (!class116.field1966) {
            class139.field2253++;
            class121.field2033.method37(76, 142);
            class121.field2033.method1207((byte) -2, class4.method25(-66));
            class116.field1966 = true;
        }
        class95.method708((byte) -94);
        if (class169.field2786 != 30) {
            return;
        }
        class85.method633(-53);
        class201.method1408(-17225);
        class272.field4549++;
        if (class272.field4549 > 750) {
            class19.method114(4096);
            return;
        }
        class237.method1675((byte) -116);
        class325.method2227((byte) -99);
        class162.method1144((byte) 23);
        if (class320.field5407 != null) {
            class22.method130((byte) 11);
        }
        for (int var21 = class29.method228((byte) -40, true); var21 != -1; var21 = class29.method228((byte) -40, false)) {
            class198.method1395(var21, 13357);
            class288.field4726[class243.method1696(class238.field3937++, 31)] = var21;
        }
        for (class281 var22 = class10.method66(-127); var22 != null; var22 = class10.method66(-88)) {
            int var23 = var22.method1931((byte) -29);
            int var24 = var22.method1934((byte) 83);
            if (var23 == 1) {
                class237.field3894[var24] = var22.field4660;
                class135.field2191[class243.method1696(class50.field720++, 31)] = var24;
            } else if (var23 == 2) {
                class241.field3992[var24] = var22.field4658;
                class266.field4481[class243.method1696(class53.field751++, 31)] = var24;
            } else if (var23 == 3) {
                class301 var44 = class206.method1440(var24, (byte) -68);
                if (!var22.field4658.method1618(false, var44.field4963)) {
                    var44.field4963 = var22.field4658;
                    class296.method2006(var44, 123);
                }
            } else if (var23 == 4) {
                class301 var41 = class206.method1440(var24, (byte) -68);
                int var42 = var22.field4660;
                int var43 = var22.field4657;
                if (var41.field5016 != var42 || var41.field4932 != var43) {
                    var41.field4932 = var43;
                    var41.field5016 = var42;
                    class296.method2006(var41, 121);
                }
            } else if (var23 == 5) {
                class301 var25 = class206.method1440(var24, (byte) -68);
                if (var22.field4660 != var25.field4973 || var22.field4660 == -1) {
                    var25.field5000 = 0;
                    var25.field4973 = var22.field4660;
                    var25.field4950 = 0;
                    class296.method2006(var25, 127);
                }
            } else if (var23 == 6) {
                int var35 = var22.field4660;
                int var36 = var35 >> 10 & 0x1F;
                int var37 = var35 & 0x1F;
                int var38 = (var35 & 0x3F2) >> 5;
                int var39 = (var37 << 3) + (var36 << 19) + (var38 << 11);
                class301 var40 = class206.method1440(var24, (byte) -68);
                if (var40.field4926 != var39) {
                    var40.field4926 = var39;
                    class296.method2006(var40, 124);
                }
            } else if (var23 == 7) {
                class301 var26 = class206.method1440(var24, (byte) -68);
                boolean var27 = var22.field4660 == 1;
                if (var26.field4990 != var27) {
                    var26.field4990 = var27;
                    class296.method2006(var26, 126);
                }
            } else if (var23 == 8) {
                class301 var34 = class206.method1440(var24, (byte) -68);
                if (var22.field4660 != var34.field5034 || var22.field4657 != var34.field4916 || var22.field4652 != var34.field4933) {
                    var34.field5034 = var22.field4660;
                    var34.field4933 = var22.field4652;
                    var34.field4916 = var22.field4657;
                    if (var34.field5009 != -1) {
                        if (var34.field4994 > 0) {
                            var34.field4933 = var34.field4933 * 32 / var34.field4994;
                        } else if (var34.field5037 > 0) {
                            var34.field4933 = var34.field4933 * 32 / var34.field5037;
                        }
                    }
                    class296.method2006(var34, 122);
                }
            } else if (var23 == 9) {
                class301 var28 = class206.method1440(var24, (byte) -68);
                if (var22.field4660 != var28.field5009 || var22.field4657 != var28.field5002) {
                    var28.field5009 = var22.field4660;
                    var28.field5002 = var22.field4657;
                    class296.method2006(var28, 124);
                }
            } else if (var23 == 10) {
                class301 var33 = class206.method1440(var24, (byte) -68);
                if (var22.field4660 != var33.field4894 || var22.field4657 != var33.field4951 || var22.field4652 != var33.field4918) {
                    var33.field4951 = var22.field4657;
                    var33.field4894 = var22.field4660;
                    var33.field4918 = var22.field4652;
                    class296.method2006(var33, 123);
                }
            } else if (var23 == 11) {
                class301 var29 = class206.method1440(var24, (byte) -68);
                var29.field4991 = var29.field4896 = var22.field4657;
                var29.field5049 = var29.field4931 = var22.field4660;
                var29.field5039 = 0;
                var29.field4898 = 0;
                class296.method2006(var29, 121);
            } else if (var23 == 12) {
                class301 var30 = class206.method1440(var24, (byte) -68);
                int var31 = var22.field4660;
                if (var30 != null && var30.field4920 == 0) {
                    if ((var30.field4877 - var30.field4882) < var31) {
                        var31 = var30.field4877 - var30.field4882;
                    }
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    if (var30.field4897 != var31) {
                        var30.field4897 = var31;
                        class296.method2006(var30, 121);
                    }
                }
            } else if (var23 == 13) {
                class301 var32 = class206.method1440(var24, (byte) -68);
                var32.field4883 = var22.field4660;
            }
        }
        class69.field1106++;
        if (class271.field4538 != 0) {
            class43.field666 += 20;
            if (class43.field666 >= 400) {
                class271.field4538 = 0;
            }
        }
        if (class205.field3390 != null) {
            class167.field2739++;
            if (class167.field2739 >= 15) {
                class296.method2006(class205.field3390, 127);
                class205.field3390 = null;
            }
        }
        if (class253.field4234 != null) {
            class296.method2006(class253.field4234, 126);
            if (class118.field1985 > (class108.field1821 + 5) || class108.field1821 - 5 > class118.field1985 || (class244.field4032 + 5) < class220.field3617 || class244.field4032 - 5 > class220.field3617) {
                class65.field997 = true;
            }
            class118.field1987++;
            if (class273.field4575 == 0) {
                if (class65.field997 && class118.field1987 >= 5) {
                    if (class328.field5593 == class253.field4234 && class8.field105 != class167.field2736) {
                        class271.field4540++;
                        class301 var45 = class253.field4234;
                        byte var46 = 0;
                        if (class152.field2474 == 1 && var45.field4996 == 206) {
                            var46 = 1;
                        }
                        if (var45.field4922[class167.field2736] <= 0) {
                            var46 = 0;
                        }
                        if (class95.method709(658667091, client.method2168(var45))) {
                            int var49 = class167.field2736;
                            int var50 = class8.field105;
                            var45.field4922[var49] = var45.field4922[var50];
                            var45.field4909[var49] = var45.field4909[var50];
                            var45.field4922[var50] = -1;
                            var45.field4909[var50] = 0;
                        } else if (var46 == 1) {
                            int var47 = class8.field105;
                            int var48 = class167.field2736;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var45.method2017(var47, -2, var47 - 1);
                                    var47--;
                                } else if (var47 < var48) {
                                    var45.method2017(var47, -2, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var45.method2017(class8.field105, -2, class167.field2736);
                        }
                        class121.field2033.method37(125, 255);
                        class121.field2033.method1160(class8.field105, -1247507120);
                        class121.field2033.method1180(122, class167.field2736);
                        class121.field2033.method1157(var46, -33);
                        class121.field2033.method1168(class253.field4234.field4948, (byte) -93);
                    }
                } else if ((class256.field4270 == 1 || class24.method151(-128, class314.field5337 - 1)) && class314.field5337 > 2) {
                    class181.method1288(false);
                } else if (class314.field5337 > 0) {
                    class30.method237((byte) -57);
                }
                class209.field3459 = 0;
                class253.field4234 = null;
                class167.field2739 = 10;
            }
        }
        class29.field477 = null;
        class289.field4738 = false;
        class301 var51 = class181.field2967;
        class214.field3534 = 0;
        class44.field679 = false;
        class301 var52 = class254.field4247;
        class254.field4247 = null;
        class181.field2967 = null;
        while (class173.method1249((byte) 122) && class214.field3534 < 128) {
            class275.field4593[class214.field3534] = class207.field3409;
            class185.field2997[class214.field3534] = class105.field1783;
            class214.field3534++;
        }
        class320.field5407 = null;
        if (class198.field3292 != -1) {
            class179.method1280(0, 0, class198.field3292, 55, class266.field4484, 0, class273.field4567, 0);
        }
        class129.field2125++;
        while (true) {
            class157 var53;
            class301 var54;
            class301 var55;
            do {
                var53 = (class157) class10.field131.method1574(-26);
                if (var53 == null) {
                    while (true) {
                        class157 var56;
                        class301 var57;
                        class301 var58;
                        do {
                            var56 = (class157) class148.field2393.method1574(-89);
                            if (var56 == null) {
                                while (true) {
                                    class157 var59;
                                    class301 var60;
                                    class301 var61;
                                    do {
                                        var59 = (class157) class225.field3702.method1574(-112);
                                        if (var59 == null) {
                                            if (class280.field4642 && class320.field5407 == null) {
                                                class280.field4642 = false;
                                            }
                                            if (class233.field3851 != null) {
                                                class38.method295(-1);
                                            }
                                            if (class27.field378 > 0 && class94.field1583[82] && class94.field1583[81] && class76.field1271 != 0) {
                                                int var62 = class298.field4849 - class76.field1271;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class257.method1789(0, var62, class230.field3820.field5159[0] + class1.field1, class1.field9 - -class230.field3820.field5104[0]);
                                            }
                                            if (class110.field1869 != -1) {
                                                int var63 = class24.field310;
                                                int var64 = class110.field1869;
                                                if (class27.field378 > 0 && class94.field1583[82] && class94.field1583[81]) {
                                                    class257.method1789(0, class298.field4849, class1.field1 + var63, class1.field9 + var64);
                                                } else if (class200.field3307) {
                                                    class121.field2033.method37(21, 29);
                                                    class232.field3841++;
                                                    class121.field2033.method1165(3, class45.field689);
                                                    class121.field2033.method1170(false, class165.field2701);
                                                    class121.field2033.method1160(class1.field1 + var63, -1247507120);
                                                    class121.field2033.method1155(-1640531527, class1.field9 + var64);
                                                    class271.field4538 = 1;
                                                    class256.field4281 = class220.field3613;
                                                    class43.field666 = 0;
                                                    class120.field2029 = class48.field697;
                                                } else if (class95.field1608) {
                                                    class121.field2033.method37(100, 204);
                                                    class68.field1095++;
                                                    class121.field2033.method1180(82, class1.field9 + var64);
                                                    class121.field2033.method1180(100, class1.field1 + var63);
                                                    class271.field4538 = 1;
                                                    class256.field4281 = class220.field3613;
                                                    class43.field666 = 0;
                                                    class120.field2029 = class48.field697;
                                                } else {
                                                    boolean var65 = class226.method1568(0, class230.field3820.field5159[0], var63, class230.field3820.field5104[0], 0, var64, 0, -24320, 0, 0, true, 0);
                                                    if (var65) {
                                                        class120.field2029 = class48.field697;
                                                        class256.field4281 = class220.field3613;
                                                        class43.field666 = 0;
                                                        class271.field4538 = 1;
                                                    }
                                                }
                                                class95.field1608 = false;
                                                class110.field1869 = -1;
                                                class200.field3307 = false;
                                            }
                                            class228.method1592(-128);
                                            if (class181.field2967 != var51) {
                                                if (var51 != null) {
                                                    class296.method2006(var51, 123);
                                                }
                                                if (class181.field2967 != null) {
                                                    class296.method2006(class181.field2967, 124);
                                                }
                                            }
                                            if (class254.field4247 != var52 && class68.field1082 == class43.field665) {
                                                if (var52 != null) {
                                                    class296.method2006(var52, 122);
                                                }
                                                if (class254.field4247 != null) {
                                                    class296.method2006(class254.field4247, 121);
                                                }
                                            }
                                            if (class254.field4247 == null) {
                                                if (class43.field665 > 0) {
                                                    class43.field665--;
                                                }
                                            } else if (class43.field665 < class68.field1082) {
                                                class43.field665++;
                                                if (class68.field1082 == class43.field665) {
                                                    class296.method2006(class254.field4247, 124);
                                                }
                                            }
                                            if (class217.field3565 == 1) {
                                                class162.method1140(128);
                                            } else if (class217.field3565 == 2) {
                                                class161.method1135(-1);
                                            } else {
                                                class40.method305(-94);
                                            }
                                            for (int var66 = 0; var66 < 5; var66++) {
                                                int var10002 = class74.field1257[var66]++;
                                            }
                                            int var67 = class121.method903((byte) 121);
                                            int var68 = class190.method1326(123);
                                            if (var67 > 4500 && var68 > 4500) {
                                                class208.field3429 = 250;
                                                class4.field52++;
                                                class280.method1926(-94, 4000);
                                                class121.field2033.method37(45, 211);
                                            }
                                            if (class152.field2460 != null && class152.field2460.field4125 == 1) {
                                                if (class152.field2460.field4123 != null) {
                                                    class119.method896(class108.field1851, 111, class145.field2352);
                                                }
                                                class145.field2352 = null;
                                                class152.field2460 = null;
                                                class108.field1851 = false;
                                            }
                                            class78.field1304++;
                                            class232.field3842++;
                                            class331.field5637++;
                                            if (class331.field5637 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x2) == 2) {
                                                    class95.field1605 += class76.field1278;
                                                }
                                                class331.field5637 = 0;
                                                if ((var69 & 0x1) == 1) {
                                                    field2138 += class224.field3676;
                                                }
                                                if ((var69 & 0x4) == 4) {
                                                    class143.field2325 += class165.field2699;
                                                }
                                            }
                                            if (class95.field1605 < -55) {
                                                class76.field1278 = 2;
                                            }
                                            if (class78.field1304 > 500) {
                                                class78.field1304 = 0;
                                                int var70 = (int) (Math.random() * 8.0D);
                                                if ((var70 & 0x1) == 1) {
                                                    class249.field4134 += class71.field1188;
                                                }
                                                if ((var70 & 0x2) == 2) {
                                                    class260.field4341 += class285.field4699;
                                                }
                                            }
                                            if (field2138 < -50) {
                                                class224.field3676 = 2;
                                            }
                                            if (class95.field1605 > 55) {
                                                class76.field1278 = -2;
                                            }
                                            if (field2138 > 50) {
                                                class224.field3676 = -2;
                                            }
                                            if (class260.field4341 < -20) {
                                                class285.field4699 = 1;
                                            }
                                            if (!arg0) {
                                                method937((byte) 95);
                                            }
                                            if (class249.field4134 < -60) {
                                                class71.field1188 = 2;
                                            }
                                            if (class143.field2325 < -40) {
                                                class165.field2699 = 1;
                                            }
                                            if (class260.field4341 > 10) {
                                                class285.field4699 = -1;
                                            }
                                            if (class249.field4134 > 60) {
                                                class71.field1188 = -2;
                                            }
                                            if (class143.field2325 > 40) {
                                                class165.field2699 = -1;
                                            }
                                            if (class232.field3842 > 50) {
                                                class329.field5597++;
                                                class121.field2033.method37(74, 164);
                                            }
                                            if (class280.field4635) {
                                                class269.method1867((byte) -109);
                                                class280.field4635 = false;
                                            }
                                            try {
                                                if (class121.field2031 != null && class121.field2033.field2670 > 0) {
                                                    class121.field2031.method527(class121.field2033.field2668, 20737, class121.field2033.field2670, 0);
                                                    class121.field2033.field2670 = 0;
                                                    class232.field3842 = 0;
                                                }
                                            } catch (IOException var72) {
                                                class19.method114(4096);
                                            }
                                            return;
                                        }
                                        var60 = var59.field2551;
                                        if (var60.field4987 < 0) {
                                            break;
                                        }
                                        var61 = class206.method1440(var60.field5040, (byte) -68);
                                    } while (var61 == null || var61.field4955 == null || var60.field4987 >= var61.field4955.length || var61.field4955[var60.field4987] != var60);
                                    class177.method1275(var59, -38);
                                }
                            }
                            var57 = var56.field2551;
                            if (var57.field4987 < 0) {
                                break;
                            }
                            var58 = class206.method1440(var57.field5040, (byte) -68);
                        } while (var58 == null || var58.field4955 == null || var58.field4955.length <= var57.field4987 || var58.field4955[var57.field4987] != var57);
                        class177.method1275(var56, -84);
                    }
                }
                var54 = var53.field2551;
                if (var54.field4987 < 0) {
                    break;
                }
                var55 = class206.method1440(var54.field5040, (byte) -68);
            } while (var55 == null || var55.field4955 == null || var54.field4987 >= var55.field4955.length || var55.field4955[var54.field4987] != var54);
            class177.method1275(var53, -121);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 1024)
    public static void method937(byte arg0) {
        field2132 = (byte[][]) null;
        field2139 = null;
        int var1 = 72 % ((-arg0 - 69) / 53);
        field2130 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I", line = 1041)
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != 4588) {
            field2131 = -80;
        }
        field2134++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[][] var4 = this.method397(1, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class293.field4789; var11++) {
                var8[var11] = 4096 - var7[var11];
                var9[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BILhb;)V", line = 1089)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg0 != 115) {
            field2129 = 101;
        }
        if (arg1 == 0) {
            this.field841 = arg2.method1178(8) == 1;
        }
        field2136++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)[I", line = 1104)
    public final int[] method63(boolean arg0, int arg1) {
        field2133++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(arg1, 0, (byte) 115);
            for (int var5 = 0; var5 < class293.field4789; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }
}
