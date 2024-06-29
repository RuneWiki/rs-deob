import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class class404 {

    @OriginalMember(owner = "client!im", name = "e", descriptor = "[J")
    public static long[] field5747 = new long[100];

    @OriginalMember(owner = "client!im", name = "g", descriptor = "J")
    public static long field5749;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[I")
    public static int[] field5753;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
    public static boolean field5752;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Lkg;")
    public static class179 field5754;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Lqn;")
    public static class47 field5750;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "Lhn;")
    public static class508 field5755;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "Lin;")
    public static class60 field5756;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "[J")
    public static long[] field5751;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
    public abstract void method499(int arg0, int arg1);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)B")
    public static final byte method2388(int arg0, int arg1, int arg2) {
        field5743++;
        if (arg2 == 9) {
            if (arg0 < 125) {
                method2388(125, 103, -17);
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Lf;")
    public abstract class532 method506(byte arg0);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static void method2389(int arg0) {
        field5750 = null;
        if (arg0 != 1) {
            method2393(25, -66, -34, -75, -105, -86, 12);
        }
        field5751 = null;
        field5756 = null;
        field5753 = null;
        field5755 = null;
        field5754 = null;
        field5747 = null;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
    public static final void method2390(byte arg0) {
        if (class347.field4463 != null) {
            class347.field4463.method80(-30270);
        }
        if (arg0 != 84) {
            field5747 = null;
        }
        field5745++;
        if (class407.field5820 != null) {
            class407.field5820.method80(-30270);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(II)I")
    public abstract int method503(int arg0, int arg1);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)I")
    public static final int method2391(byte arg0, int arg1, int arg2) {
        field5748++;
        int var3 = class249.method1511(arg2 + 45365, arg1 + 91923, 4, (byte) 120) - (-(class249.method1511(arg2 + 10294, arg1 + 37821, 2, (byte) -73) + -128 >> 1) - (class249.method1511(arg2, arg1, 1, (byte) -59) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != -46) {
            return -37;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(II)[B")
    public abstract byte[] method502(int arg0, int arg1);

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(III)V")
    public static final void method2392(int arg0, int arg1, int arg2) {
        int var3 = 48 % ((17 - arg2) / 46);
        field5744++;
        class153 var4 = class75.method656(14, 255, arg0);
        var4.method1003((byte) 100);
        var4.field1933 = arg1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 <= 42) {
            field5752 = true;
        }
        field5746++;
        int var7 = class436.field6234;
        class340.field4270 = 0;
        int[] var8 = class12.field218;
        for (int var9 = 0; var9 < (class489.field7114 + var7); var9++) {
            class477 var32 = null;
            class375 var33;
            if (var9 >= var7) {
                var33 = class187.field2446[class403.field5735[var9 - var7]];
                var32 = ((class295) var33).field3773;
                if (var32.field6922 != null) {
                    var32 = var32.method2903(-1, class491.field7160);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class387.field5107[var8[var9]];
            }
            if (var33.field4845 >= 0 && (class386.field5073 == var33.field4864 || class23.field336.field2676 == var33.field2676)) {
                class491.method2976(arg0 >> 1, var33, arg3, arg1 >> 1, var33.method1730(-22), 0, arg2);
                if (class46.field558[0] >= 0) {
                    if (var33.field4869 != null && (var9 >= var7 || class308.field3931 == 0 || class308.field3931 == 3 || class308.field3931 == 1 && class365.method2092(((class223) var33).field2852, 0)) && class334.field4216 > class340.field4270) {
                        class334.field4224[class340.field4270] = class274.field3437.method1757((byte) -125, var33.field4869) / 2;
                        class334.field4212[class340.field4270] = class46.field558[0];
                        class334.field4204[class340.field4270] = class46.field558[1];
                        class334.field4221[class340.field4270] = var33.field4897;
                        class334.field4214[class340.field4270] = var33.field4924;
                        class334.field4222[class340.field4270] = var33.field4932;
                        class334.field4217[class340.field4270] = var33.field4869;
                        class340.field4270++;
                    }
                    int var34 = class46.field558[1] + arg5;
                    int var45;
                    if (var33.field4901 || class163.field2065 >= var33.field4921) {
                        var45 = var34 - Math.max(class274.field3437.field3823, class105.field1331[0].method137());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var7 <= var9) {
                            var37 = var32.field6935;
                            if (var37 == -1) {
                                var37 = var33.method2128(-114).field7386;
                            }
                        } else {
                            class223 var38 = class387.field5107[var8[var9]];
                            var37 = var33.method2128(-126).field7386;
                            if (var38.field2820) {
                                var36 = 2;
                            }
                        }
                        class16[] var39 = class105.field1331;
                        if (var37 != -1) {
                            class16[] var40 = (class16[]) class515.field7469.method2647(-103, (long) var37);
                            if (var40 == null) {
                                class311[] var41 = class311.method1819(class448.field6413, var37, 0);
                                if (var41 != null) {
                                    var40 = new class16[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class33.field416.method345(var41[var42], true);
                                    }
                                    class515.field7469.method2635((long) var37, -26591, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class16 var43 = var39[0];
                        class16 var44 = var39[var36];
                        var45 = var34 - Math.max(class274.field3437.field3823, var43.method137());
                        int var46 = arg6 + class46.field558[0] - (var43.method134() >> 1);
                        int var47 = var43.method134() * var33.field4856 / 255;
                        if (var33.field4856 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method130(var46, var45);
                        class33.field416.method334(var46, var45, var46 + var47, var45 - -var43.method137());
                        var44.method130(var46, var45);
                        class33.field416.method330(arg6, arg5, arg1 + arg6, arg5 - -arg0);
                    }
                    var45 -= 2;
                    if (!var33.field4901) {
                        if (var33.field4877 > class163.field2065) {
                            class16 var48 = class285.field3653[var33.field4891 ? 2 : 0];
                            class16 var49 = class285.field3653[var33.field4891 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class295)) {
                                var51 = var32.field6947;
                                if (var51 == -1) {
                                    var51 = var33.method2128(-75).field7369;
                                }
                            } else {
                                var51 = var33.method2128(-76).field7369;
                            }
                            if (var51 != -1) {
                                class16[] var52 = (class16[]) class489.field7110.method2647(-101, (long) var51);
                                if (var52 == null) {
                                    class311[] var53 = class311.method1819(class448.field6413, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class16[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class33.field416.method345(var53[var54], true);
                                        }
                                        class489.field7110.method2635((long) var51, -26591, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field4891 ? 3 : 1];
                                    var48 = var52[var33.field4891 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field4877 - class163.field2065;
                            int var58;
                            if (var55 > var33.field4898) {
                                int var56 = var55 - var33.field4898;
                                int var57 = var33.field4855 == 0 ? 0 : (var33.field4850 - var56) / var33.field4855 * var33.field4855;
                                var58 = var57 * var48.method134() / var33.field4850;
                            } else {
                                var58 = var48.method134();
                            }
                            int var59 = var48.method137();
                            var45 -= var59;
                            int var60 = class46.field558[0] + arg6 - (var48.method134() >> 1);
                            var48.method130(var60, var45);
                            class33.field416.method334(var60, var45, var58 + var60, var45 - -var59);
                            var49.method130(var60, var45);
                            class33.field416.method330(arg6, arg5, arg1 + arg6, arg0 + arg5);
                            var45 -= 2;
                        }
                        if (var7 > var9) {
                            class223 var61 = (class223) var33;
                            if (var61.field2832 != -1) {
                                var45 -= 25;
                                class424.field5990[var61.field2832].method130(class46.field558[0] + arg6 - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field2845 != -1) {
                                var45 -= 25;
                                class465.field6715[var61.field2845].method130(class46.field558[0] + arg6 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field6944 >= 0 && class465.field6715.length > var32.field6944) {
                            var45 -= 25;
                            class16 var62 = class465.field6715[var32.field6944];
                            var62.method130(arg6 - ((var62.method134() >> 1) - class46.field558[0]), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class223) {
                        int var69 = 0;
                        class277[] var70 = class147.field1869;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class277 var76 = var70[var71];
                            if (var76 != null && var76.field3508 == 1 && class403.field5735[var9 - var7] == var76.field3511) {
                                class16 var77 = class293.field3739[var76.field3506];
                                if (var69 < var77.method137()) {
                                    var69 = var77.method137();
                                }
                                if ((class163.field2065 % 20) < 10) {
                                    var77.method130(class46.field558[0] + arg6 - 12, -var77.method137() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class277[] var64 = class147.field1869;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class277 var67 = var64[var65];
                            if (var67 != null && var67.field3508 == 10 && var8[var9] == var67.field3511) {
                                class16 var68 = class293.field3739[var67.field3506];
                                if (var68.method137() > var63) {
                                    var63 = var68.method137();
                                }
                                var68.method130(arg6 + class46.field558[0] - 12, -var68.method137() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class163.field2065 < var33.field4862[var73]) {
                            int var74 = var33.method1730(-24) / 2;
                            class491.method2976(arg0 >> 1, var33, arg3, arg1 >> 1, var74, 0, arg2);
                            if (class46.field558[0] > -1) {
                                int var75 = class420.field5954[var33.field4903[var73]].method134();
                                if (var73 == 1) {
                                    class46.field558[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class46.field558[1] -= 10;
                                    class46.field558[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class46.field558[0] += var75 - 9;
                                    class46.field558[1] -= 10;
                                }
                                class420.field5954[var33.field4903[var73]].method130(arg6 + class46.field558[0] - (var75 >> 1), class46.field558[1] + arg5 + -12);
                                class143.field1843.method1852(class46.field558[1] + arg5 + 3, -32458, class46.field558[0] + -1 + arg6, 0, Integer.toString(var33.field4930[var73]), -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class251.field3214; var10++) {
            int var28 = class173.field2248[var10];
            class375 var29;
            if (var28 >= 2048) {
                var29 = class187.field2446[var28 - 2048];
            } else {
                var29 = class387.field5107[var28];
            }
            int var30 = class400.field5708[var10];
            class375 var31;
            if (var30 < 2048) {
                var31 = class387.field5107[var30];
            } else {
                var31 = class187.field2446[var30 - 2048];
            }
            class123.method873(arg2, --var29.field4916, (byte) 72, arg5, var31, arg1, var29, arg0, arg3, arg6);
        }
        int var11 = class274.field3437.field3823 + class274.field3437.field3824 + 2;
        for (int var12 = 0; var12 < class340.field4270; var12++) {
            int var13 = class334.field4212[var12];
            int var14 = class334.field4204[var12];
            int var15 = class334.field4224[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class334.field4204[var27] - var11) && (class334.field4204[var27] + 2) > (var14 - var11) && class334.field4212[var27] + class334.field4224[var27] > var13 - var15 && var13 + var15 > class334.field4212[var27] + -class334.field4224[var27] && var14 > (class334.field4204[var27] - var11)) {
                        var14 = class334.field4204[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class334.field4204[var12] = var14;
            String var17 = class334.field4217[var12];
            if (class202.field2633 == 0) {
                int var18 = 16776960;
                if (class334.field4221[var12] < 6) {
                    var18 = class187.field2440[class334.field4221[var12]];
                }
                if (class334.field4221[var12] == 6) {
                    var18 = (class386.field5073 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class334.field4221[var12] == 7) {
                    var18 = class386.field5073 % 20 < 10 ? 255 : 65535;
                }
                if (class334.field4221[var12] == 8) {
                    var18 = (class386.field5073 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class334.field4221[var12] == 9) {
                    int var19 = 150 - class334.field4222[var12];
                    if (var19 < 50) {
                        var18 = (var19 * 1280) + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class334.field4221[var12] == 10) {
                    int var20 = 150 - class334.field4222[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 33095935 - var20 * 327680;
                    } else if (var20 < 150) {
                        var18 = ((var20 - 100) * 327680) + 255 + 500 - (var20 * 5);
                    }
                }
                if (class334.field4221[var12] == 11) {
                    int var21 = 150 - class334.field4222[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = (var21 * 327685) + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class334.field4214[var12] == 0) {
                    class91.field1116.method1852(arg5 + var14, -32458, arg6 + var13, -16777216, var17, var22);
                }
                if (class334.field4214[var12] == 1) {
                    class91.field1116.method1857(0, arg5 + var14, arg6 + var13, var17, class386.field5073, -16777216, var22);
                }
                if (class334.field4214[var12] == 2) {
                    class91.field1116.method1861(class386.field5073, arg5 + var14, 5, var22, var17, -16777216, arg6 + var13);
                }
                if (class334.field4214[var12] == 3) {
                    class91.field1116.method1858(arg5 + var14, 150 - class334.field4222[var12], var22, arg6 + var13, -16139, class386.field5073, var17, -16777216);
                }
                if (class334.field4214[var12] == 4) {
                    int var23 = (150 - class334.field4222[var12]) * (class274.field3437.method1757((byte) 37, var17) + 100) / 150;
                    class33.field416.method334(arg6 + var13 - 50, arg5, arg6 + var13 + 50, arg5 - -arg0);
                    class91.field1116.method1849(arg6 - (-var13 - 50) - var23, var22, false, var17, -16777216, arg5 + var14);
                    class33.field416.method330(arg6, arg5, arg1 + arg6, arg0 + arg5);
                }
                if (class334.field4214[var12] == 5) {
                    int var24 = 150 - class334.field4222[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class274.field3437.field3824 + class274.field3437.field3823;
                    class33.field416.method334(arg6, arg5 - (var26 - var14) - 1, arg1 + arg6, var14 + arg5 + 5);
                    class91.field1116.method1852(arg5 + var25 + var14, -32458, arg6 + var13, -16777216, var17, var22);
                    class33.field416.method330(arg6, arg5, arg1 + arg6, arg0 + arg5);
                }
            } else {
                class91.field1116.method1852(arg5 + var14, -32458, arg6 + var13, -16777216, var17, -256);
            }
        }
    }

    static {
        new class335("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field5749 = -1L;
        field5753 = new int[1000];
        field5752 = false;
        field5754 = new class179(72, 4);
    }
}
