import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class70 {

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Z")
    public static boolean field1350 = false;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lke;")
    public static class106 field1353 = new class106();

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1354 = 0;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1355 = 0;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lig;")
    public static class168 field1357 = new class168(200);

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lcd;")
    public static class64 field1358 = class44.method335((byte) 71, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lwh;")
    public static class9[] field1344;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "[[[B")
    public static byte[][][] field1359;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIZ)V", line = 5)
    public static final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            return;
        }
        field1348++;
        class143.field2507 = 0;
        for (int var7 = -1; var7 < class218.field3707 + class163.field2862; var7++) {
            class103 var8;
            if (var7 == -1) {
                var8 = class139.field2472;
            } else if (class163.field2862 > var7) {
                var8 = class284.field4888[class194.field3307[var7]];
            } else {
                var8 = class2.field12[class254.field4422[var7 - class163.field2862]];
            }
            if (var8 != null && var8.method318(4)) {
                if (var8 instanceof class232) {
                    class6 var9 = ((class232) var8).field3911;
                    if (var9.field144 != null) {
                        var9 = var9.method66(0);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class163.field2862) {
                    class6 var15 = ((class232) var8).field3911;
                    if (var15.field144 != null) {
                        var15 = var15.method66(0);
                    }
                    if (var15.field134 >= 0 && class11.field217.length > var15.field134) {
                        int var16;
                        if (var15.field128 == -1) {
                            var16 = var8.method763((byte) 7) + 15;
                        } else {
                            var16 = var15.field128 + 15;
                        }
                        class145.method1036(arg1, arg2, arg4 >> 1, var16, arg3 >> 1, -11927, var8);
                        if (class29.field463 > -1) {
                            class11.field217[var15.field134].method306(class29.field463 + arg0 - 12, class267.field4594 + arg5 + -30);
                        }
                    }
                    class65[] var17 = class304.field5197;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class65 var19 = var17[var18];
                        if (var19 != null && var19.field1292 == 1 && class254.field4422[var7 - class163.field2862] == var19.field1290 && class29.field482 % 20 < 10) {
                            int var20;
                            if (var15.field128 == -1) {
                                var20 = var8.method763((byte) 7) + 15;
                            } else {
                                var20 = var15.field128 + 15;
                            }
                            class145.method1036(arg1, arg2, arg4 >> 1, var20, arg3 >> 1, -11927, var8);
                            if (class29.field463 > -1) {
                                class211.field3546[var19.field1301].method306(class29.field463 + arg0 - 12, class267.field4594 + arg5 + -28);
                            }
                        }
                    }
                } else {
                    class41 var10 = (class41) var8;
                    int var11 = 30;
                    if (var10.field636 != -1 || var10.field649 != -1) {
                        class145.method1036(arg1, arg2, arg4 >> 1, var8.method763((byte) 7) + 15, arg3 >> 1, -11927, var8);
                        if (class29.field463 > -1) {
                            if (var10.field636 != -1) {
                                class69.field1322[var10.field636].method306(class29.field463 + arg0 - 12, arg5 - -class267.field4594 + -var11);
                                var11 += 25;
                            }
                            if (var10.field649 != -1) {
                                class11.field217[var10.field649].method306(arg0 + class29.field463 - 12, arg5 - var11 + class267.field4594);
                                var11 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class65[] var12 = class304.field5197;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class65 var14 = var12[var13];
                            if (var14 != null && var14.field1292 == 10 && class194.field3307[var7] == var14.field1290) {
                                class145.method1036(arg1, arg2, arg4 >> 1, var8.method763((byte) 7) + 15, arg3 >> 1, -11927, var8);
                                if (class29.field463 > -1) {
                                    class211.field3546[var14.field1301].method306(class29.field463 + arg0 - 12, arg5 - var11 + class267.field4594);
                                }
                            }
                        }
                    }
                }
                if (var8.field1875 != null && (class163.field2862 <= var7 || class184.field3157 == 0 || class184.field3157 == 3 || class184.field3157 == 1 && class118.method837(78, ((class41) var8).field672))) {
                    class145.method1036(arg1, arg2, arg4 >> 1, var8.method763((byte) 7), arg3 >> 1, -11927, var8);
                    if (class29.field463 > -1 && class91.field1640 > class143.field2507) {
                        class91.field1648[class143.field2507] = class75.field1419.method1276(var8.field1875) / 2;
                        class91.field1646[class143.field2507] = class75.field1419.field3032;
                        class91.field1627[class143.field2507] = class29.field463;
                        class91.field1645[class143.field2507] = class267.field4594;
                        class91.field1622[class143.field2507] = var8.field1900;
                        class91.field1631[class143.field2507] = var8.field1879;
                        class91.field1619[class143.field2507] = var8.field1878;
                        class91.field1618[class143.field2507] = var8.field1875;
                        class143.field2507++;
                    }
                }
                if (class29.field482 < var8.field1915) {
                    class40 var21 = class53.field856[0];
                    class40 var22 = class53.field856[1];
                    int var26;
                    if (var8 instanceof class232) {
                        class232 var23 = (class232) var8;
                        class40[] var24 = (class40[]) ((class40[]) class258.field4460.method1194((long) var23.field3911.field140, (byte) -115));
                        if (var24 == null) {
                            var24 = class283.method1968(true, var23.field3911.field140, class3.field17, 0);
                            if (var24 != null) {
                                class258.field4460.method1190(12669, var24, (long) var23.field3911.field140);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var21 = var24[0];
                            var22 = var24[1];
                        }
                        class6 var25 = var23.field3911;
                        if (var25.field128 == -1) {
                            var26 = var8.method763((byte) 7);
                        } else {
                            var26 = var25.field128;
                        }
                    } else {
                        var26 = var8.method763((byte) 7);
                    }
                    class145.method1036(arg1, arg2, arg4 >> 1, var21.field629 + var26 + 10, arg3 >> 1, -11927, var8);
                    if (class29.field463 > -1) {
                        int var27 = arg5 + class267.field4594 - 3;
                        int var28 = arg0 + class29.field463 - (var21.field627 >> 1);
                        var21.method306(var28, var27);
                        int var29 = var8.field1881 * var21.field627 / 255;
                        int var30 = var21.field629;
                        if (class123.field2216) {
                            class21.method214(var28, var27, var28 + var29, var27 - -var30);
                        } else {
                            class210.method1465(var28, var27, var28 + var29, var27 + var30);
                        }
                        var22.method306(var28, var27);
                        if (class123.field2216) {
                            class21.method209(arg0, arg5, arg0 + arg3, arg5 - -arg4);
                        } else {
                            class210.method1470(arg0, arg5, arg0 + arg3, arg4 + arg5);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field1884[var31] > class29.field482) {
                        int var34;
                        if (var8 instanceof class232) {
                            class232 var32 = (class232) var8;
                            class6 var33 = var32.field3911;
                            if (var33.field128 == -1) {
                                var34 = var8.method763((byte) 7) / 2;
                            } else {
                                var34 = var33.field128 / 2;
                            }
                        } else {
                            var34 = var8.method763((byte) 7) / 2;
                        }
                        class145.method1036(arg1, arg2, arg4 >> 1, var34, arg3 >> 1, -11927, var8);
                        if (class29.field463 > -1) {
                            if (var31 == 1) {
                                class267.field4594 -= 20;
                            }
                            if (var31 == 2) {
                                class267.field4594 -= 10;
                                class29.field463 -= 15;
                            }
                            if (var31 == 3) {
                                class29.field463 += 15;
                                class267.field4594 -= 10;
                            }
                            class80.field1478[var8.field1846[var31]].method306(class29.field463 + arg0 - 12, class267.field4594 + arg5 + -12);
                            class180.field3091.method1263(class310.method2149(var8.field1855[var31], (byte) -30), arg0 + class29.field463 - 1, arg5 + 3 - -class267.field4594, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class143.field2507; var35++) {
            int var36 = class91.field1627[var35];
            int var37 = class91.field1645[var35];
            int var38 = class91.field1648[var35];
            boolean var39 = true;
            int var40 = class91.field1646[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class91.field1645[var41] - class91.field1646[var41]) < (var37 + 2) && class91.field1645[var41] + 2 > -var40 + var37 && var36 - var38 < class91.field1627[var41] - -class91.field1648[var41] && var36 + var38 > class91.field1627[var41] + -class91.field1648[var41] && class91.field1645[var41] - class91.field1646[var41] < var37) {
                        var37 = class91.field1645[var41] - class91.field1646[var41];
                        var39 = true;
                    }
                }
            }
            class29.field463 = class91.field1627[var35];
            class267.field4594 = class91.field1645[var35] = var37;
            class64 var42 = class91.field1618[var35];
            if (class299.field5149 == 0) {
                int var43 = 16776960;
                if (class91.field1622[var35] < 6) {
                    var43 = class108.field1992[class91.field1622[var35]];
                }
                if (class91.field1622[var35] == 6) {
                    var43 = (class26.field426 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class91.field1622[var35] == 7) {
                    var43 = class26.field426 % 20 >= 10 ? 65535 : 255;
                }
                if (class91.field1622[var35] == 8) {
                    var43 = class26.field426 % 20 < 10 ? 45056 : 8454016;
                }
                if (class91.field1622[var35] == 9) {
                    int var44 = 150 - class91.field1619[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 + 16384000 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = 65280 - (500 - (var44 * 5));
                    }
                }
                if (class91.field1622[var35] == 10) {
                    int var45 = 150 - class91.field1619[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 + 500 - (var45 * 5);
                    }
                }
                if (class91.field1622[var35] == 11) {
                    int var46 = 150 - class91.field1619[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 * 327685) + 65280 - 16384250;
                    } else if (var46 < 150) {
                        var43 = 16777215 + 32768000 - var46 * 327680;
                    }
                }
                if (class91.field1631[var35] == 0) {
                    class75.field1419.method1263(var42, class29.field463 + arg0, class267.field4594 + arg5, var43, 0);
                }
                if (class91.field1631[var35] == 1) {
                    class75.field1419.method1279(var42, arg0 + class29.field463, arg5 - -class267.field4594, var43, 0, class26.field426);
                }
                if (class91.field1631[var35] == 2) {
                    class75.field1419.method1273(var42, class29.field463 + arg0, class267.field4594 + arg5, var43, 0, class26.field426);
                }
                if (class91.field1631[var35] == 3) {
                    class75.field1419.method1262(var42, class29.field463 + arg0, arg5 - -class267.field4594, var43, 0, class26.field426, 150 - class91.field1619[var35]);
                }
                if (class91.field1631[var35] == 4) {
                    int var47 = (150 - class91.field1619[var35]) * (class75.field1419.method1276(var42) + 100) / 150;
                    if (class123.field2216) {
                        class21.method214(arg0 + class29.field463 - 50, arg5, class29.field463 + arg0 + 50, arg4 + arg5);
                    } else {
                        class210.method1465(class29.field463 + arg0 - 50, arg5, class29.field463 + arg0 + 50, arg4 + arg5);
                    }
                    class75.field1419.method1269(var42, arg0 - (-class29.field463 - (50 - var47)), arg5 - -class267.field4594, var43, 0);
                    if (class123.field2216) {
                        class21.method209(arg0, arg5, arg0 + arg3, arg4 + arg5);
                    } else {
                        class210.method1470(arg0, arg5, arg0 + arg3, arg4 + arg5);
                    }
                }
                if (class91.field1631[var35] == 5) {
                    int var48 = 0;
                    int var49 = 150 - class91.field1619[var35];
                    if (class123.field2216) {
                        class21.method214(arg0, arg5 - (1 - class267.field4594) - class75.field1419.field3032, arg0 - -arg3, class267.field4594 + arg5 + 5);
                    } else {
                        class210.method1465(arg0, class267.field4594 + arg5 - class75.field1419.field3032 - 1, arg0 + arg3, arg5 + class267.field4594 + 5);
                    }
                    if (var49 < 25) {
                        var48 = var49 - 25;
                    } else if (var49 > 125) {
                        var48 = var49 - 125;
                    }
                    class75.field1419.method1263(var42, class29.field463 + arg0, arg5 - -var48 + class267.field4594, var43, 0);
                    if (class123.field2216) {
                        class21.method209(arg0, arg5, arg0 + arg3, arg4 + arg5);
                    } else {
                        class210.method1470(arg0, arg5, arg0 + arg3, arg4 + arg5);
                    }
                }
            } else {
                class75.field1419.method1263(var42, arg0 + class29.field463, class267.field4594 + arg5, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILfk;)V", line = 493)
    public static final void method572(int arg0, int arg1, int arg2, class41 arg3) {
        field1345++;
        if (arg3.field1902 == arg1 && arg1 != -1) {
            class199 var4 = class281.method1944(arg1, arg2 ^ 0x19);
            int var5 = var4.field3403;
            if (var5 == 1) {
                arg3.field1874 = arg0;
                arg3.field1885 = 0;
                arg3.field1897 = 0;
                arg3.field1892 = 0;
                class10.method89(arg3.field1865, arg3.field1859, arg3.field1885, var4, true, class139.field2472 == arg3);
            }
            if (var5 == 2) {
                arg3.field1897 = 0;
            }
        } else if (arg1 == -1 || arg3.field1902 == -1 || class281.method1944(arg1, 0).field3388 >= class281.method1944(arg3.field1902, 0).field3388) {
            arg3.field1885 = 0;
            arg3.field1874 = arg0;
            arg3.field1897 = 0;
            arg3.field1858 = arg3.field1862;
            arg3.field1892 = 0;
            arg3.field1902 = arg1;
            if (arg3.field1902 != -1) {
                class10.method89(arg3.field1865, arg3.field1859, arg3.field1885, class281.method1944(arg3.field1902, 0), true, class139.field2472 == arg3);
            }
        }
        if (arg2 != 25) {
            field1354 = 8;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 542)
    public static final void method573(int arg0) {
        class17.field353.method1214(-60, 4);
        for (class172 var1 = (class172) class159.field2805.method1143(0); var1 != null; var1 = (class172) class159.field2805.method1147((byte) 18)) {
            if (var1.field2972 == 0) {
                class140.method994(var1, true, -24721);
            }
        }
        class42.field692++;
        if (class106.field1952 != null) {
            class190.method1342(class106.field1952, arg0 ^ 0xF);
            class106.field1952 = null;
        }
        if (arg0 == 15) {
            field1346++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 573)
    public static final void method574(boolean arg0) {
        class151.method1096((byte) 81);
        field1351++;
        class296.method2068(3);
        class156.method1129(104);
        class261.method1840(10);
        class163.method1169(100);
        class44.method338(-125);
        class194.method1366((byte) 113);
        class250.method1796(true);
        class156.method1127(13306);
        class227.method1644((byte) 64);
        class34.method284((byte) -125);
        class277.method1920(false);
        class277.method1918(arg0);
        class242.method1769(-15082);
        if (!class123.field2216) {
            ((class241) class50.field816).method1752(-13871);
        }
        class78.field1461.method334(arg0);
        class213.field3578.method1589((byte) -127);
        class138.field2449.method1589((byte) -128);
        class140.field2474.method1589((byte) -127);
        class299.field5161.method1589((byte) -128);
        class253.field4413.method1589((byte) -128);
        class297.field5114.method1589((byte) -128);
        class19.field359.method1589((byte) -128);
        class3.field17.method1589((byte) -127);
        class241.field4155.method1589((byte) -127);
        class226.field3843.method1589((byte) -128);
        class253.field4399.method1589((byte) -127);
        class258.field4460.method1187(0);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 629)
    public static void method575(int arg0) {
        field1359 = (byte[][][]) null;
        if (arg0 != 12222) {
            method571(-108, 47, -105, -47, 3, -97, true);
        }
        field1353 = null;
        field1357 = null;
        field1344 = null;
        field1358 = null;
    }
}
