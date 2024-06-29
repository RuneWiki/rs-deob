import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class69 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lnk;")
    public static class16 field856;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lpa;")
    public static class2 field860;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[[Lwb;")
    public static class175[][] field866;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lgj;III)V", line = 4)
    public static final void method428(class257 arg0, int arg1, int arg2, int arg3) {
        class233.field3526.method1811((byte) -30);
        field859++;
        if (arg1 != 0) {
            field866 = (class175[][]) ((class175[][]) null);
        }
        if (class293.field4612) {
            return;
        }
        for (class182 var4 = (class182) arg0.method1812(1); var4 != null; var4 = (class182) arg0.method1809(128)) {
            class103 var5 = class79.method521(var4.field2735, -43);
            if (class77.method498(arg1 - 98, var5)) {
                class41.method251(arg2, var4, (byte) 121, arg3, var5);
                if (var4.field2738) {
                    class227.method1574(120, var5, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 43)
    public static final void method429(byte arg0) {
        field861++;
        if (class231.field3500 == 0 || class231.field3500 == 5) {
            return;
        }
        try {
            if ((++class71.field890) > 2000) {
                if (class147.field2352 != null) {
                    class147.field2352.method1527(arg0 - 4);
                    class147.field2352 = null;
                }
                if (class90.field1189 >= 1) {
                    class30.field353 = -5;
                    class231.field3500 = 0;
                    return;
                }
                class71.field890 = 0;
                if (class43.field490 == class10.field111) {
                    class10.field111 = class345.field5479;
                } else {
                    class10.field111 = class43.field490;
                }
                class90.field1189++;
                class231.field3500 = 1;
            }
            if (class231.field3500 == 1) {
                class24.field282 = class156.field2451.method166((byte) -63, class61.field726, class10.field111);
                class231.field3500 = 2;
            }
            if (class231.field3500 == 2) {
                if (class24.field282.field2419 == 2) {
                    throw new IOException();
                }
                if (class24.field282.field2419 != 1) {
                    return;
                }
                class147.field2352 = new class220((Socket) class24.field282.field2421, class156.field2451);
                class24.field282 = null;
                long var1 = class230.field3484 = class294.method2093((byte) 100, class170.field2593);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class328.field5282.field2295 = 0;
                class328.field5282.method1055(14, arg0 - 5);
                class328.field5282.method1055(var3, 122);
                class147.field2352.method1532(2, 0, -95, class328.field5282.field2260);
                if (class192.field2881 != null) {
                    class192.field2881.method1412(false);
                }
                if (class273.field4330 != null) {
                    class273.field4330.method1412(false);
                }
                int var4 = class147.field2352.method1528(-29741);
                if (class192.field2881 != null) {
                    class192.field2881.method1412(false);
                }
                if (class273.field4330 != null) {
                    class273.field4330.method1412(false);
                }
                if (var4 != 0) {
                    class231.field3500 = 0;
                    class30.field353 = var4;
                    class147.field2352.method1527(86);
                    class147.field2352 = null;
                    return;
                }
                class231.field3500 = 3;
            }
            if (arg0 != 117) {
                return;
            }
            if (class231.field3500 == 3) {
                if (class147.field2352.method1531((byte) 120) < 8) {
                    return;
                }
                class147.field2352.method1536(0, 8, (byte) -57, class282.field4499.field2260);
                class282.field4499.field2295 = 0;
                int[] var5 = new int[4];
                class43.field478 = class282.field4499.method1013((byte) -70);
                class328.field5282.field2295 = 0;
                var5[2] = (int) (class43.field478 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class43.field478;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class328.field5282.method1055(10, 116);
                class328.field5282.method1052(var5[0], false);
                class328.field5282.method1052(var5[1], false);
                class328.field5282.method1052(var5[2], false);
                class328.field5282.method1052(var5[3], false);
                class328.field5282.method1039(class294.method2093((byte) 100, class170.field2593), (byte) 77);
                class328.field5282.method1050(class296.field4666, arg0 - 145);
                class328.field5282.method1064(class357.field5662, arg0 + 3, class296.field4655);
                class333.field5322.field2295 = 0;
                if (client.field4443 == 40) {
                    class333.field5322.method1055(18, 106);
                } else {
                    class333.field5322.method1055(16, arg0 ^ 0x4);
                }
                class333.field5322.method1003(class328.field5282.field2295 + class55.method334((byte) -5, client.field4444) + 163, arg0 + -119);
                class333.field5322.method1052(549, false);
                class333.field5322.method1055(class117.field1638, 102);
                class333.field5322.method1055(class241.field3699 ? 1 : 0, 89);
                class333.field5322.method1055(1, 113);
                class333.field5322.method1055(class117.method768(-107), arg0 ^ 0x1C);
                class333.field5322.method1003(class165.field2546, -2);
                class333.field5322.method1003(class95.field1307, -2);
                class333.field5322.method1055(class24.field285, 121);
                class184.method1274(24, class333.field5322);
                class333.field5322.method1050(client.field4444, -53);
                class333.field5322.method1052(class233.field3522, false);
                class333.field5322.method1052(class325.method2259((byte) -87), false);
                class250.field3967 = true;
                class333.field5322.method1003(class227.field3429, -2);
                class333.field5322.method1052(class327.field5227.method109(-1), false);
                class333.field5322.method1052(class79.field1045.method109(-1), false);
                class333.field5322.method1052(class171.field2600.method109(-1), false);
                class333.field5322.method1052(class353.field5630.method109(arg0 ^ 0xFFFFFF8A), false);
                class333.field5322.method1052(field856.method109(-1), false);
                class333.field5322.method1052(class102.field1380.method109(-1), false);
                class333.field5322.method1052(class60.field714.method109(-1), false);
                class333.field5322.method1052(class166.field2567.method109(-1), false);
                class333.field5322.method1052(class65.field786.method109(-1), false);
                class333.field5322.method1052(class178.field2675.method109(-1), false);
                class333.field5322.method1052(class169.field2583.method109(-1), false);
                class333.field5322.method1052(class276.field4351.method109(arg0 - 118), false);
                class333.field5322.method1052(class309.field4821.method109(-1), false);
                class333.field5322.method1052(class107.field1476.method109(-1), false);
                class333.field5322.method1052(class271.field4260.method109(arg0 - 118), false);
                class333.field5322.method1052(class207.field3130.method109(-1), false);
                class333.field5322.method1052(class220.field3308.method109(-1), false);
                class333.field5322.method1052(class154.field2428.method109(-1), false);
                class333.field5322.method1052(class142.field2222.method109(-1), false);
                class333.field5322.method1052(class355.field5644.method109(-1), false);
                class333.field5322.method1052(class230.field3486.method109(arg0 ^ 0xFFFFFF8A), false);
                class333.field5322.method1052(class19.field226.method109(arg0 ^ 0xFFFFFF8A), false);
                class333.field5322.method1052(class293.field4619.method109(-1), false);
                class333.field5322.method1052(class308.field4782.method109(-1), false);
                class333.field5322.method1052(class85.field1115.method109(-1), false);
                class333.field5322.method1052(class325.field5216.method109(-1), false);
                class333.field5322.method1052(class72.field903.method109(-1), false);
                class333.field5322.method1052(class101.field1372.method109(-1), false);
                class333.field5322.method1052(class79.field1056.method109(arg0 - 118), false);
                class333.field5322.method1000(class328.field5282.field2295, 0, class328.field5282.field2260, (byte) -112);
                class147.field2352.method1532(class333.field5322.field2295, 0, -84, class333.field5322.field2260);
                class328.field5282.method300((byte) -111, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class282.field4499.method300((byte) -99, var5);
                class231.field3500 = 4;
            }
            if (class231.field3500 == 4) {
                if (class147.field2352.method1531((byte) 126) < 1) {
                    return;
                }
                int var7 = class147.field2352.method1528(-29741);
                if (var7 == 21) {
                    class231.field3500 = 7;
                } else if (var7 == 29) {
                    class231.field3500 = 10;
                } else if (var7 == 1) {
                    class231.field3500 = 5;
                    class30.field353 = var7;
                    return;
                } else if (var7 == 2) {
                    class231.field3500 = 8;
                } else if (var7 == 15) {
                    class30.field353 = var7;
                    class231.field3500 = 0;
                    return;
                } else if (var7 == 23 && class90.field1189 < 1) {
                    class71.field890 = 0;
                    class231.field3500 = 1;
                    class90.field1189++;
                    class147.field2352.method1527(97);
                    class147.field2352 = null;
                    return;
                } else {
                    class30.field353 = var7;
                    class231.field3500 = 0;
                    class147.field2352.method1527(107);
                    class147.field2352 = null;
                    return;
                }
            }
            if (class231.field3500 == 6) {
                class328.field5282.field2295 = 0;
                class328.field5282.method304(17, 19830);
                class147.field2352.method1532(class328.field5282.field2295, 0, arg0 ^ 0x76, class328.field5282.field2260);
                class231.field3500 = 4;
                return;
            }
            if (class231.field3500 == 7) {
                if (class147.field2352.method1531((byte) -49) < 1) {
                    return;
                }
                class60.field712 = class147.field2352.method1528(arg0 - 29858) * 60 + 180;
                class231.field3500 = 0;
                class30.field353 = 21;
                class147.field2352.method1527(105);
                class147.field2352 = null;
                return;
            }
            if (class231.field3500 == 10) {
                if (class147.field2352.method1531((byte) 123) < 1) {
                    return;
                }
                class52.field600 = class147.field2352.method1528(-29741);
                class30.field353 = 29;
                class231.field3500 = 0;
                class147.field2352.method1527(83);
                class147.field2352 = null;
                return;
            }
            if (class231.field3500 == 8) {
                if (class147.field2352.method1531((byte) -24) < 14) {
                    return;
                }
                class147.field2352.method1536(0, 14, (byte) -57, class282.field4499.field2260);
                class282.field4499.field2295 = 0;
                class100.field1350 = class282.field4499.method1043(true);
                class314.field4936 = class282.field4499.method1043(true);
                class334.field5339 = class282.field4499.method1043(true) == 1;
                class174.field2630 = class282.field4499.method1043(true) == 1;
                class146.field2312 = class282.field4499.method1043(true) == 1;
                class201.field3043 = class282.field4499.method1043(true) == 1;
                class148.field2359 = class282.field4499.method1043(true) == 1;
                class50.field573 = class282.field4499.method1051(arg0 ^ 0x74);
                class274.field4341 = class282.field4499.method1043(true) == 1;
                class33.field387 = class282.field4499.method1043(true) == 1;
                class106.method689(class33.field387, 19889);
                class289.method2071((byte) -47, class33.field387);
                class41.method254(class33.field387, arg0 + 29851);
                if (!class241.field3699) {
                    if ((!class334.field5339 || class146.field2312) && !class274.field4341) {
                        try {
                            class198.method1380((byte) 110, "unzap", class156.field2451.field254);
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class198.method1380((byte) 93, "zap", class156.field2451.field254);
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class198.method1380((byte) 127, "loggedin", class156.field2451.field254);
                } catch (Throwable var12) {
                }
                class246.field3866 = class282.field4499.method306(false);
                class191.field2869 = class282.field4499.method1051(arg0 ^ 0x74);
                class231.field3500 = 9;
            }
            if (class231.field3500 == 9) {
                if (class147.field2352.method1531((byte) 121) >= class191.field2869) {
                    class282.field4499.field2295 = 0;
                    class147.field2352.method1536(0, class191.field2869, (byte) -57, class282.field4499.field2260);
                    class30.field353 = 2;
                    class231.field3500 = 0;
                    class72.method446(false);
                    class84.field1099 = -1;
                    class147.method1082(-49, false);
                    class246.field3866 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class147.field2352 != null) {
                class147.field2352.method1527(arg0 + 5);
                class147.field2352 = null;
            }
            if (class90.field1189 < 1) {
                class231.field3500 = 1;
                if (class43.field490 == class10.field111) {
                    class10.field111 = class345.field5479;
                } else {
                    class10.field111 = class43.field490;
                }
                class71.field890 = 0;
                class90.field1189++;
            } else {
                class30.field353 = -4;
                class231.field3500 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 421)
    public static final void method430(int arg0) {
        field857++;
        if (class293.field4625) {
            return;
        }
        if (class222.field3355) {
            class103.field1423 = (float) ((int) class103.field1423 + 47 & 0xFFFFFFF0);
        } else {
            class203.field3089 += (12.0F - class203.field3089) / 2.0F;
        }
        if (arg0 != 12664) {
            method428((class257) null, -122, 57, -43);
        }
        class234.field3560 = true;
        class293.field4625 = true;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V", line = 447)
    public static void method431(byte arg0) {
        field856 = null;
        field860 = null;
        if (arg0 > -66) {
            method429((byte) 73);
        }
        field866 = (class175[][]) null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V", line = 462)
    public static final void method432(byte arg0) {
        int var1 = 114 % ((-arg0 - 57) / 42);
        class151.method1104(-1, false);
        field868++;
        System.gc();
        class219.method1525((byte) -77, 25);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lne;IIIIII)V", line = 476)
    public static final void method433(class262 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field869++;
        long var7 = 0L;
        boolean var9 = false;
        if (arg6 == 0) {
            var7 = class113.method730(arg3, arg1, arg2);
        } else if (arg6 == 1) {
            var7 = class68.method424(arg3, arg1, arg2);
        } else if (arg6 == 2) {
            var7 = class181.method1248(arg3, arg1, arg2);
        } else if (arg6 == 3) {
            var7 = class215.method1499(arg3, arg1, arg2);
        }
        boolean var10 = true;
        int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var12 = ((int) var7 & 0x7CF32) >> 14;
        boolean var13 = false;
        class234 var14 = class123.method795(arg5, var11);
        if (var14.method1615(-123)) {
            class277.method1983(arg3, var14, arg1, arg5 + 128, arg2);
        }
        int var15 = ((int) var7 & 0x3BA4F6) >> 20;
        if (var7 == 0L) {
            return;
        }
        class294 var16 = null;
        class294 var17 = null;
        if (arg6 == 0) {
            class123 var18 = class228.method1582(arg3, arg1, arg2);
            if (var18 != null) {
                var16 = var18.field1697;
                var17 = var18.field1705;
            }
            if (var14.field3602 != 0) {
                arg0.method1855(var14.field3606, arg5, !var14.field3545, var15, arg2, var12, arg1);
            }
        } else if (arg6 == 1) {
            class54 var19 = class344.method2380(arg3, arg1, arg2);
            if (var19 != null) {
                var16 = var19.field630;
                var17 = var19.field632;
            }
        } else if (arg6 == 2) {
            class44 var20 = class126.method858(arg3, arg1, arg2);
            if (var20 != null) {
                var16 = var20.field494;
            }
            if (var14.field3602 != 0 && var14.field3577 + arg1 < 104 && (var14.field3577 + arg2) < 104 && (arg1 + var14.field3590) < 104 && (var14.field3590 + arg2) < 104) {
                arg0.method1850(arg1, var14.field3606, arg5 - 30321, var15, var14.field3590, arg2, !var14.field3545, var14.field3577);
            }
        } else if (arg6 == 3) {
            class360 var21 = class308.method2169(arg3, arg1, arg2);
            if (var21 != null) {
                var16 = var21.field5697;
            }
            if (var14.field3602 == 1) {
                arg0.method1858(arg1, -112, arg2);
            }
        }
        if (var14.field3588 != null) {
            var14 = var14.method1624(true);
        }
        if (!class272.field4317 || var14 == null || !var14.field3601) {
            return;
        }
        if (var12 == 2) {
            if (var16 instanceof class75) {
                ((class75) var16).method473((byte) -25);
            } else {
                class116.method754(var14, arg1, 0, 0, arg2, arg4, var15 + 4, arg5 + -78, var12);
            }
            if (var17 instanceof class75) {
                ((class75) var17).method473((byte) -25);
            } else {
                class116.method754(var14, arg1, 0, 0, arg2, arg4, var15 + 1 & 0x3, -93, var12);
            }
        } else if (var12 == 5) {
            if ((var16 instanceof class75)) {
                ((class75) var16).method473((byte) -25);
            } else {
                class116.method754(var14, arg1, class185.field2784[var15] * 8, class304.field4740[var15] * 8, arg2, arg4, var15, -80, 4);
            }
        } else if (var12 == 6) {
            if ((var16 instanceof class75)) {
                ((class75) var16).method473((byte) -25);
            } else {
                class116.method754(var14, arg1, class54.field629[var15] * 8, class54.field633[var15] * 8, arg2, arg4, var15 + 4, -95, 4);
            }
        } else if (var12 == 7) {
            if ((var16 instanceof class75)) {
                ((class75) var16).method473((byte) -25);
            } else {
                class116.method754(var14, arg1, 0, 0, arg2, arg4, (var15 + 2 & 0x3) + 4, -43, 4);
            }
        } else if (var12 == 8) {
            if ((var16 instanceof class75)) {
                ((class75) var16).method473((byte) -25);
            } else {
                class116.method754(var14, arg1, class54.field629[var15] * 8, class54.field633[var15] * 8, arg2, arg4, var15 + 4, arg5 ^ 0xFFFFFFB2, 4);
            }
            if (var17 instanceof class75) {
                ((class75) var17).method473((byte) -25);
            } else {
                class116.method754(var14, arg1, class54.field629[var15] * 8, class54.field633[var15] * 8, arg2, arg4, (var15 + 2 & 0x3) + 4, arg5 + -22, 4);
            }
        } else if (var12 == 11) {
            if ((var16 instanceof class75)) {
                ((class75) var16).method473((byte) -25);
            } else {
                class116.method754(var14, arg1, 0, 0, arg2, arg4, var15 + 4, -94, 10);
            }
        } else if (var16 instanceof class75) {
            ((class75) var16).method473((byte) -25);
        } else {
            class116.method754(var14, arg1, 0, 0, arg2, arg4, var15, -90, var12);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I", line = 682)
    public static final int method434(int arg0) {
        if (arg0 <= 90) {
            field860 = (class2) null;
        }
        field863++;
        return 2;
    }
}
