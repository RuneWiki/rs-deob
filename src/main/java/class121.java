import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class121 {

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Ltd;")
    public static class107 field1698 = new class107();

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Lik;")
    public static class410 field1700 = new class410(8);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lig;I)V")
    public static final void method952(class13 arg0, int arg1) {
        field1699++;
        if (arg1 == 0) {
            class94.field1372 = arg0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Ldr;")
    public final class214 method953(int arg0) {
        field1690++;
        class214 var2 = (class214) class286.field3833.method2537(-93, (long) this.field1693);
        if (var2 != null) {
            return var2;
        }
        class214 var3 = class214.method1459(class392.field5499, this.field1693, 0);
        if (var3 != null) {
            class286.field3833.method2542(var3, (byte) -110, (long) this.field1693);
        }
        return arg0 == -7580 ? var3 : null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLjava/awt/Component;Lbd;I)Laq;")
    public static final class234 method954(int arg0, byte arg1, Component arg2, class304 arg3, int arg4) {
        if (arg1 > -46) {
            field1700 = null;
        }
        field1696++;
        if (class413.field5774 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class234 var5 = (class234) Class.forName("ra").getDeclaredConstructor().newInstance();
                var5.field3231 = new int[(class373.field5246 ? 2 : 1) * 256];
                var5.field3232 = arg4;
                var5.method1566(arg2);
                var5.field3233 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field3233 > 16384) {
                    var5.field3233 = 16384;
                }
                var5.method1567(var5.field3233);
                if (class436.field6227 > 0 && class452.field6558 == null) {
                    class452.field6558 = new class420();
                    class452.field6558.field5887 = arg3;
                    arg3.method1950(-99, class436.field6227, class452.field6558);
                }
                if (class452.field6558 != null) {
                    if (class452.field6558.field5886[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class452.field6558.field5886[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class449 var6 = new class449(arg3, arg0);
                    var6.field3232 = arg4;
                    var6.field3231 = new int[(class373.field5246 ? 2 : 1) * 256];
                    var6.method1566(arg2);
                    var6.field3233 = 16384;
                    var6.method1567(var6.field3233);
                    if (class436.field6227 > 0 && class452.field6558 == null) {
                        class452.field6558 = new class420();
                        class452.field6558.field5887 = arg3;
                        arg3.method1950(80, class436.field6227, class452.field6558);
                    }
                    if (class452.field6558 != null) {
                        if (class452.field6558.field5886[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class452.field6558.field5886[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class234();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public static final void method955(int arg0) {
        if (class322.field4364 > 1) {
            class322.field4364--;
            class440.field6327 = class387.field5445;
        }
        if (class177.field2613 > 0) {
            class177.field2613--;
        }
        field1691++;
        if (class69.field1029) {
            class69.field1029 = false;
            class218.method1491(false);
            return;
        }
        if (!class94.field1369) {
            class174.method1297(39);
        }
        for (int var1 = 0; var1 < 100 && class223.method1523(false); var1++) {
        }
        if (class166.field2472 != 30) {
            return;
        }
        class129.method1003(class355.field4828, 87, 0);
        Object var2 = class199.field2838.field3994;
        synchronized (class199.field2838.field3994) {
            if (!class145.field2212) {
                class199.field2838.field4000 = 0;
            } else if (class52.field844 != 0 || class199.field2838.field4000 >= 40) {
                class307.field4169++;
                class355.field4828.method1801(146, (byte) -92);
                class355.field4828.method1824(97, 0);
                int var3 = class355.field4828.field3938;
                int var4 = 0;
                for (int var5 = 0; class199.field2838.field4000 > var5 && class355.field4828.field3938 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class199.field2838.field3999[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class199.field2838.field4001[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class199.field2838.field3999[var5] == -1 && class199.field2838.field4001[var5] == -1) {
                        var6 = -1;
                        var8 = true;
                        var7 = -1;
                    }
                    if (class88.field1305 != var7 || class107.field1570 != var6) {
                        int var9 = var7 - class88.field1305;
                        class88.field1305 = var7;
                        int var10 = var6 - class107.field1570;
                        class107.field1570 = var6;
                        if (class107.field1572 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class355.field4828.method1877(true, (class107.field1572 << 12) + (var9 << 6) + var10);
                            class107.field1572 = 0;
                        } else if (class107.field1572 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class355.field4828.method1824(40, class107.field1572 + 128);
                            var10 += 128;
                            var9 += 128;
                            class355.field4828.method1877(true, (var9 << 8) + var10);
                            class107.field1572 = 0;
                        } else if (class107.field1572 < 32) {
                            class355.field4828.method1824(92, class107.field1572 + 192);
                            if (var8) {
                                class355.field4828.method1854(Integer.MIN_VALUE, true);
                            } else {
                                class355.field4828.method1854(var6 << 16 | var7, true);
                            }
                            class107.field1572 = 0;
                        } else {
                            class355.field4828.method1877(true, class107.field1572 + 57344);
                            if (var8) {
                                class355.field4828.method1854(Integer.MIN_VALUE, true);
                            } else {
                                class355.field4828.method1854(var7 | var6 << 16, true);
                            }
                            class107.field1572 = 0;
                        }
                    } else if (class107.field1572 < 2047) {
                        class107.field1572++;
                    }
                }
                class355.field4828.method1857(100, class355.field4828.field3938 - var3);
                if (var4 >= class199.field2838.field4000) {
                    class199.field2838.field4000 = 0;
                } else {
                    class199.field2838.field4000 -= var4;
                    for (int var11 = 0; var11 < class199.field2838.field4000; var11++) {
                        class199.field2838.field4001[var11] = class199.field2838.field4001[var4 + var11];
                        class199.field2838.field3999[var11] = class199.field2838.field3999[var4 + var11];
                    }
                }
            }
        }
        if (class52.field844 != 0) {
            long var12 = (class94.field1368 - class131.field1869) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class131.field1869 = class94.field1368;
            int var14 = class177.field2609;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class94.field1365;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class52.field844 == 2) {
                var16 = 1;
            }
            int var17 = (int) var12;
            class355.field4828.method1801(59, (byte) -121);
            class184.field2674++;
            class355.field4828.method1877(true, var16 << 15 | var17);
            class355.field4828.method1835(var15 | var14 << 16, false);
        }
        if (class334.field4525 > 0) {
            class334.field4525--;
        }
        int var18 = -91 / ((-arg0 - 58) / 48);
        if (class287.field3847 && class334.field4525 <= 0) {
            class287.field3847 = false;
            class334.field4525 = 20;
            class446.field6421++;
            class355.field4828.method1801(103, (byte) -111);
            class355.field4828.method1869((byte) -2, (int) class47.field810 >> 3);
            class355.field4828.method1877(true, (int) class313.field4229 >> 3);
        }
        if (class344.field4666 && !class260.field3507) {
            class422.field5909++;
            class260.field3507 = true;
            class355.field4828.method1801(92, (byte) -80);
            class355.field4828.method1824(54, 1);
        }
        if (!class344.field4666 && class260.field3507) {
            class422.field5909++;
            class260.field3507 = false;
            class355.field4828.method1801(92, (byte) -98);
            class355.field4828.method1824(100, 0);
        }
        if (!class338.field4600) {
            class44.field702++;
            class355.field4828.method1801(50, (byte) -49);
            class355.field4828.method1854(class262.method1688((byte) -65), true);
            class338.field4600 = true;
        }
        if (class267.field3590) {
            class267.field3590 = false;
        } else {
            class150.field2292 /= 2.0F;
        }
        if (class39.field590) {
            class39.field590 = false;
        } else {
            class170.field2515 /= 2.0F;
        }
        class166.method1238(105);
        if (class166.field2472 != 30) {
            return;
        }
        class88.method784(8);
        class53.method509(114);
        class36.method369((byte) 52);
        class118.field1648++;
        if (class118.field1648 > 750) {
            class218.method1491(false);
            return;
        }
        class74.method641(true);
        class287.method1813(14945);
        class61.method548((byte) 122);
        for (int var19 = class193.method1383((byte) -112, true); var19 != -1; var19 = class193.method1383((byte) -62, false)) {
            class329.method2091(-29713, var19);
            class384.field5389[class323.method2059(31, class386.field5438++)] = var19;
        }
        for (class450 var20 = class363.method2284(55); var20 != null; var20 = class363.method2284(72)) {
            int var21 = var20.method2802((byte) 2);
            int var22 = var20.method2803((byte) -22);
            if (var21 == 1) {
                class331.field4511[var22] = var20.field6498;
                class288.field3866 |= class257.field3475[var22];
                class151.field2322[class323.method2059(class340.field4645++, 31)] = var22;
            } else if (var21 == 2) {
                class334.field4526[var22] = var20.field6504;
                class183.field2658[class323.method2059(class296.field3997++, 31)] = var22;
            } else if (var21 == 3) {
                class139 var44 = class10.method57(65535, var22);
                if (!var20.field6504.equals(var44.field1976)) {
                    var44.field1976 = var20.field6504;
                    class10.method52(var44, (byte) -89);
                }
            } else if (var21 == 4) {
                class139 var40 = class10.method57(65535, var22);
                int var41 = var20.field6498;
                int var42 = var20.field6509;
                int var43 = var20.field6503;
                if (var40.field2116 != var41 || var40.field2015 != var42 || var40.field2004 != var43) {
                    var40.field2015 = var42;
                    var40.field2004 = var43;
                    var40.field2116 = var41;
                    class10.method52(var40, (byte) -89);
                }
            } else if (var21 == 5) {
                class139 var23 = class10.method57(65535, var22);
                if (var20.field6498 != var23.field1963 || var20.field6498 == -1) {
                    var23.field2124 = 0;
                    var23.field1963 = var20.field6498;
                    var23.field2066 = 0;
                    var23.field2104 = 1;
                    class10.method52(var23, (byte) -89);
                }
            } else if (var21 == 6) {
                int var34 = var20.field6498;
                int var35 = (var34 & 0x7DB9) >> 10;
                int var36 = (var34 & 0x3F5) >> 5;
                int var37 = var34 & 0x1F;
                int var38 = (var37 << 3) + (var35 << 19) + (var36 << 11);
                class139 var39 = class10.method57(65535, var22);
                if (var39.field2035 != var38) {
                    var39.field2035 = var38;
                    class10.method52(var39, (byte) -89);
                }
            } else if (var21 == 7) {
                class139 var24 = class10.method57(65535, var22);
                boolean var25 = var20.field6498 == 1;
                if (var24.field2072 != var25) {
                    var24.field2072 = var25;
                    class10.method52(var24, (byte) -89);
                }
            } else if (var21 == 8) {
                class139 var26 = class10.method57(65535, var22);
                if (var20.field6498 != var26.field2030 || var20.field6509 != var26.field2117 || var20.field6503 != var26.field2044) {
                    var26.field2044 = var20.field6503;
                    var26.field2117 = var20.field6509;
                    var26.field2030 = var20.field6498;
                    if (var26.field2034 != -1) {
                        if (var26.field2115 > 0) {
                            var26.field2044 = var26.field2044 * 32 / var26.field2115;
                        } else if (var26.field1956 > 0) {
                            var26.field2044 = var26.field2044 * 32 / var26.field1956;
                        }
                    }
                    class10.method52(var26, (byte) -89);
                }
            } else if (var21 == 9) {
                class139 var33 = class10.method57(65535, var22);
                if (var20.field6498 != var33.field2034 || var20.field6509 != var33.field2003) {
                    var33.field2003 = var20.field6509;
                    var33.field2034 = var20.field6498;
                    class10.method52(var33, (byte) -89);
                }
            } else if (var21 == 10) {
                class139 var27 = class10.method57(65535, var22);
                if (var20.field6498 != var27.field2036 || var20.field6509 != var27.field1997 || var20.field6503 != var27.field1954) {
                    var27.field1954 = var20.field6503;
                    var27.field1997 = var20.field6509;
                    var27.field2036 = var20.field6498;
                    class10.method52(var27, (byte) -89);
                }
            } else if (var21 == 11) {
                class139 var28 = class10.method57(65535, var22);
                var28.field2065 = var28.field2114 = var20.field6498;
                var28.field2091 = 0;
                var28.field2014 = 0;
                var28.field2022 = var28.field2008 = var20.field6509;
                class10.method52(var28, (byte) -89);
            } else if (var21 == 12) {
                class139 var29 = class10.method57(65535, var22);
                int var30 = var20.field6498;
                if (var29 != null && var29.field2023 == 0) {
                    if (var29.field2086 - var29.field2011 < var30) {
                        var30 = var29.field2086 - var29.field2011;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    if (var29.field1983 != var30) {
                        var29.field1983 = var30;
                        class10.method52(var29, (byte) -89);
                    }
                }
            } else if (var21 == 13) {
                class139 var31 = class10.method57(65535, var22);
                var31.field2060 = var20.field6498;
            } else if (var21 == 14) {
                class139 var32 = class10.method57(65535, var22);
                var32.field2130 = var20.field6498;
            } else if (var21 == 15) {
                class338.field4605 = var20.field6498;
                class335.field4543 = var20.field6509;
                class338.field4615 = true;
            }
        }
        class339.field4628++;
        if (class392.field5501 != 0) {
            class416.field5821 += 20;
            if (class416.field5821 >= 400) {
                class392.field5501 = 0;
            }
        }
        if (class388.field5461 != null) {
            class443.field6391++;
            if (class443.field6391 >= 15) {
                class10.method52(class388.field5461, (byte) -89);
                class388.field5461 = null;
            }
        }
        class139 var45 = class375.field5276;
        class139 var46 = class192.field2764;
        class375.field5276 = null;
        class268.field3611 = null;
        class395.field5525 = false;
        class192.field2764 = null;
        class127.field1801 = false;
        class83.field1221 = 0;
        while (class27.method329((byte) -23) && class83.field1221 < 128) {
            if (!class239.method1587(-2613) || !(class285.field3817 == '`' || class285.field3817 == '§')) {
                class19.field377[class83.field1221] = class345.field4682;
                class266.field3574[class83.field1221] = class285.field3817;
                class83.field1221++;
            } else if (class30.method344(-710)) {
                class175.method1307((byte) 92);
            } else {
                class377.method2348(512);
            }
        }
        if (class30.method344(-710)) {
            class340.method2163(-1);
        }
        class30.field500 = null;
        class130.method1010((byte) -121, -1, -1, (class139) null);
        class402.method2461(-1, -1, 100, (class139) null);
        if (class149.field2288 != -1) {
            class451.method2806(class258.field3488, class149.field2288, 0, 0, 0, 0, -107, class249.field3414);
        }
        class387.field5445++;
        if (class30.field500 != null) {
            class44.method412((byte) 117);
        }
        if (class187.field2712) {
            class418.field5862++;
            class355.field4828.method1801(144, (byte) -87);
            class355.field4828.method1822(false, class286.field3829 | class228.field3163 << 14 | class210.field2922 << 28);
            class187.field2712 = false;
        }
        while (true) {
            class361 var47;
            class139 var48;
            class139 var49;
            do {
                var47 = (class361) class229.field3187.method1239(true);
                if (var47 == null) {
                    while (true) {
                        class361 var50;
                        class139 var51;
                        class139 var52;
                        do {
                            var50 = (class361) class390.field5467.method1239(true);
                            if (var50 == null) {
                                while (true) {
                                    class361 var53;
                                    class139 var54;
                                    class139 var55;
                                    do {
                                        var53 = (class361) class204.field2869.method1239(true);
                                        if (var53 == null) {
                                            if (class30.field500 == null) {
                                                class177.field2611 = 0;
                                            }
                                            if (class305.field4133 != null) {
                                                class31.method347(2);
                                            }
                                            if (class447.field6482 > 0 && class234.field3242[82] && class234.field3242[81] && class428.field6080 != 0) {
                                                int var56 = class69.field1046 - class428.field6080;
                                                if (var56 < 0) {
                                                    var56 = 0;
                                                } else if (var56 > 3) {
                                                    var56 = 3;
                                                }
                                                class198.method1403((byte) -103, var56, class95.field1379.field5005[0] + class283.field3794, class95.field1379.field4998[0] + class296.field3988);
                                            }
                                            class163.method1218((byte) -50);
                                            if (class94.field1370 != null) {
                                                class10.method52(class94.field1370, (byte) -89);
                                                class358.field4855++;
                                                if ((class138.field1948 + 5) < class391.field5490 || class138.field1948 - 5 > class391.field5490 || (class52.field853 + 5) < class312.field4220 || class312.field4220 < class52.field853 - 5) {
                                                    class278.field3741 = true;
                                                }
                                                if (class262.field3525 == 0) {
                                                    if (class278.field3741 && class358.field4855 >= 5) {
                                                        if (class94.field1370 == class293.field3965 && class298.field4015 != class139.field1987) {
                                                            class139 var57 = class94.field1370;
                                                            byte var58 = 0;
                                                            if (class224.field3104 == 1 && var57.field2108 == 206) {
                                                                var58 = 1;
                                                            }
                                                            if (var57.field2101[class139.field1987] <= 0) {
                                                                var58 = 0;
                                                            }
                                                            class116.field1627++;
                                                            if (var58 == 1) {
                                                                int var59 = class298.field4015;
                                                                int var60 = class139.field1987;
                                                                while (var59 != var60) {
                                                                    if (var59 > var60) {
                                                                        var57.method1095(true, var59, var59 - 1);
                                                                        var59--;
                                                                    } else if (var60 > var59) {
                                                                        var57.method1095(true, var59, var59 + 1);
                                                                        var59++;
                                                                    }
                                                                }
                                                            } else {
                                                                var57.method1095(true, class298.field4015, class139.field1987);
                                                            }
                                                            class355.field4828.method1801(49, (byte) -125);
                                                            class355.field4828.method1854(class94.field1370.field1968, true);
                                                            class355.field4828.method1874(class139.field1987, 108);
                                                            class355.field4828.method1877(true, class298.field4015);
                                                            class355.field4828.method1824(86, var58);
                                                        }
                                                    } else if ((class258.field3482 == 1 || class380.method2366((byte) -61)) && class415.field5808 > 2) {
                                                        class74.method639((byte) -4);
                                                    } else if (class95.method809((byte) 55)) {
                                                        class55.method518(11580);
                                                    }
                                                    class52.field844 = 0;
                                                    class94.field1370 = null;
                                                    class443.field6391 = 10;
                                                }
                                            }
                                            if (class375.field5276 != var45) {
                                                if (var45 != null) {
                                                    class10.method52(var45, (byte) -89);
                                                }
                                                if (class375.field5276 != null) {
                                                    class10.method52(class375.field5276, (byte) -89);
                                                }
                                            }
                                            if (class192.field2764 != var46 && class278.field3747 == class107.field1571) {
                                                if (var46 != null) {
                                                    class10.method52(var46, (byte) -89);
                                                }
                                                if (class192.field2764 != null) {
                                                    class10.method52(class192.field2764, (byte) -89);
                                                }
                                            }
                                            if (class192.field2764 == null) {
                                                if (class278.field3747 > 0) {
                                                    class278.field3747--;
                                                }
                                            } else if (class107.field1571 > class278.field3747) {
                                                class278.field3747++;
                                                if (class278.field3747 == class107.field1571) {
                                                    class10.method52(class192.field2764, (byte) -89);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class377.field5306[var61]++;
                                            }
                                            int var62 = class392.method2416(true);
                                            int var63 = class32.method349((byte) -117);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class177.field2613 = 250;
                                                class87.field1293++;
                                                class398.method2445((byte) 116, 14500);
                                                class355.field4828.method1801(84, (byte) -118);
                                            }
                                            if (class288.field3866 && class402.field5614 < (class108.method902((byte) -93) - 60000L)) {
                                                class321.method2027(true);
                                            }
                                            class139.field2024++;
                                            if (class139.field2024 > 500) {
                                                class139.field2024 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class295.field3971 += class339.field4633;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class148.field2273 += class394.field5510;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class228.field3169 += class372.field5224;
                                                }
                                            }
                                            if (class295.field3971 < -50) {
                                                class339.field4633 = 2;
                                            }
                                            if (class148.field2273 < -55) {
                                                class394.field5510 = 2;
                                            }
                                            if (class295.field3971 > 50) {
                                                class339.field4633 = -2;
                                            }
                                            if (class148.field2273 > 55) {
                                                class394.field5510 = -2;
                                            }
                                            if (class228.field3169 < -40) {
                                                class372.field5224 = 1;
                                            }
                                            if (class228.field3169 > 40) {
                                                class372.field5224 = -1;
                                            }
                                            class220.field3035++;
                                            if (class220.field3035 > 500) {
                                                class220.field3035 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class398.field5576 += class233.field3207;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class161.field2395 += class161.field2391;
                                                }
                                            }
                                            if (class161.field2395 < -60) {
                                                class161.field2391 = 2;
                                            }
                                            if (class161.field2395 > 60) {
                                                class161.field2391 = -2;
                                            }
                                            if (class398.field5576 < -20) {
                                                class233.field3207 = 1;
                                            }
                                            class37.field565++;
                                            if (class398.field5576 > 10) {
                                                class233.field3207 = -1;
                                            }
                                            if (class37.field565 > 50) {
                                                class3.field13++;
                                                class355.field4828.method1801(210, (byte) -95);
                                            }
                                            if (class198.field2820) {
                                                class329.method2088(101);
                                                class198.field2820 = false;
                                            }
                                            try {
                                                if (class105.field1540 != null && class355.field4828.field3938 > 0) {
                                                    class105.field1540.method2737(class355.field4828.field3882, 0, class355.field4828.field3938, -127);
                                                    class355.field4828.field3938 = 0;
                                                    class37.field565 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class218.method1491(false);
                                                return;
                                            }
                                        }
                                        var54 = var53.field4903;
                                        if (var54.field2094 < 0) {
                                            break;
                                        }
                                        var55 = class10.method57(65535, var54.field2042);
                                    } while (var55 == null || var55.field2045 == null || var54.field2094 >= var55.field2045.length || var55.field2045[var54.field2094] != var54);
                                    class18.method267(var53);
                                }
                            }
                            var51 = var50.field4903;
                            if (var51.field2094 < 0) {
                                break;
                            }
                            var52 = class10.method57(65535, var51.field2042);
                        } while (var52 == null || var52.field2045 == null || var52.field2045.length <= var51.field2094 || var52.field2045[var51.field2094] != var51);
                        class18.method267(var50);
                    }
                }
                var48 = var47.field4903;
                if (var48.field2094 < 0) {
                    break;
                }
                var49 = class10.method57(65535, var48.field2042);
            } while (var49 == null || var49.field2045 == null || var49.field2045.length <= var48.field2094 || var49.field2045[var48.field2094] != var48);
            class18.method267(var47);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    public static void method956(int arg0) {
        if (arg0 == -3939) {
            field1700 = null;
            field1698 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lap;II)V")
    public final void method957(class289 arg0, int arg1, int arg2) {
        if (arg2 <= 12) {
            field1700 = null;
        }
        while (true) {
            int var4 = arg0.method1861((byte) -72);
            if (var4 == 0) {
                field1694++;
                return;
            }
            this.method959(arg1, arg0, var4, -16855);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method958(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class19.field378++;
        class419.field5873 = 0;
        for (int var6 = class213.field2966; var6 < class388.field5464; var6++) {
            class224[][] var17 = class118.field1653[var6];
            for (int var18 = class283.field3780; var18 < class176.field2603; var18++) {
                for (int var19 = class277.field3733; var19 < class338.field4620; var19++) {
                    class224 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class227.field3147[var18 + class303.field4107 - class134.field1914][var19 + class303.field4107 - class31.field516] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field3111 = true;
                            var20.field3109 = true;
                            if (var20.field3129 == null) {
                                var20.field3120 = false;
                            } else {
                                var20.field3120 = true;
                            }
                            class419.field5873++;
                        } else {
                            var20.field3111 = false;
                            var20.field3109 = false;
                            var20.field3127 = 0;
                            if (var18 >= class134.field1914 - 16 && var18 <= class134.field1914 + 16 && var19 >= class31.field516 - 16 && var19 <= class31.field516 + 16 && (var20.field3108 != null || var20.field3125 != null || var20.field3121 != null || var20.field3116 != null || var20.field3124 != null || var20.field3129 != null)) {
                                class277.field3731.method1021((byte) 126, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class91.field1351 == class244.field3367;
        for (int var8 = class213.field2966; var8 < class388.field5464; var8++) {
            float var9 = var7 ? 202.0F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class91.field1347.method172() && var8 >= arg2 && arg1 != null) {
                int var10 = class227.field3147.length;
                if (class227.field3147.length + class283.field3780 > class368.field5054) {
                    var10 -= class227.field3147.length + class283.field3780 - class368.field5054;
                }
                int var11 = class227.field3147[0].length;
                if (class227.field3147[0].length + class277.field3733 > class16.field190) {
                    var11 -= class227.field3147[0].length + class277.field3733 - class16.field190;
                }
                int var12 = class312.field4221;
                while (true) {
                    if (var12 >= var10) {
                        class277.field3731.method1018(0, var9, true, var8, class91.field1351[var8]);
                        break;
                    }
                    int var13 = class283.field3780 + var12 - class312.field4221;
                    for (int var14 = class323.field4384; var14 < var11; var14++) {
                        class400.field5594[var12][var14] = false;
                        if (class227.field3147[var12][var14]) {
                            int var15 = class277.field3733 + var14 - class323.field4384;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class118.field1653[var16][var13][var15] != null && class118.field1653[var16][var13][var15].field3107 == var8) {
                                    class400.field5594[var12][var14] = class118.field1653[var16][var13][var15].field3111;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class277.field3731.method1018(0, var9, false, var8, class91.field1351[var8]);
            }
            class277.field3731.method1028((byte) 108);
        }
        if (!class75.method648(true)) {
            class75.method648(false);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILap;II)V")
    private final void method959(int arg0, class289 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field1693 = arg1.method1853(arg3 + 16979);
        } else if (arg2 == 2) {
            this.field1695 = arg1.method1861((byte) -72);
            this.field1692 = arg1.method1861((byte) -72);
        }
        field1697++;
        if (arg3 != -16855) {
            method956(-45);
        }
    }
}
