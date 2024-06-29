import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class386 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field5593 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Ldc;")
    public class375 field5592;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lri;")
    public class98 field5595;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2483(int arg0, int arg1) {
        field5589++;
        class263 var2 = class47.method337(arg0, 0, arg1);
        var2.method1806(false);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 16)
    public static final void method2484(String arg0, boolean arg1) {
        if (class65.field859 == null) {
            class166.method1023((byte) 107);
        }
        field5590++;
        String[] var2 = class243.method1459(arg0, '\n', 0);
        if (!arg1) {
            method2484((String) null, true);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class124.field1724; var4 > 0; var4--) {
                class65.field859[var4] = class65.field859[var4 - 1];
            }
            class65.field859[0] = var2[var3];
            if (class124.field1724 < (class65.field859.length - 1)) {
                class124.field1724++;
                if (class447.field6558 > 0) {
                    class447.field6558++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZIZIIIILba;ILii;)V", line = 60)
    public static final void method2485(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class270 arg10, int arg11, class405 arg12) {
        field5591++;
        if (!class11.method79((byte) 64) && !class61.method424(arg11, arg4, arg6, (byte) 92, class200.field2661) || arg1 != -22389) {
            return;
        }
        if (arg11 < class143.field1953) {
            class143.field1953 = arg11;
        }
        class104 var13 = class329.method2190((byte) 63, arg0);
        if (class373.field5422 == 1 && var13.field1498) {
            return;
        }
        int var14;
        int var15;
        if (arg2 == 1 || arg2 == 3) {
            var15 = var13.field1489;
            var14 = var13.field1506;
        } else {
            var14 = var13.field1489;
            var15 = var13.field1506;
        }
        int var16;
        int var17;
        if ((arg6 + var14) <= class192.field2574) {
            var16 = arg6 + (var14 >> 1);
            var17 = (var14 + 1 >> 1) + arg6;
        } else {
            var17 = arg6 + 1;
            var16 = arg6;
        }
        int var18;
        int var19;
        if (arg4 + var15 > class364.field5262) {
            var18 = arg4;
            var19 = arg4 + 1;
        } else {
            var19 = (var15 + 1 >> 1) + arg4;
            var18 = (var15 >> 1) + arg4;
        }
        class351 var20 = class12.field205[arg7];
        int var21 = var20.method742(var16, var18) + var20.method742(var17, var18) - (-var20.method742(var16, var19) + -var20.method742(var17, var19)) >> 2;
        int var22 = (arg6 << 7) + (var14 << 6);
        int var23 = (arg4 << 7) + (var15 << 6);
        boolean var24 = arg5 && !arg3 && var13.field1509;
        if (var13.method702((byte) 102)) {
            class406.method2620(arg11, arg4, arg2, arg1 ^ 0xFFFFA8D9, arg6, (class25) null, var13, (class43) null);
        }
        boolean var25 = arg9 == -1 && var13.field1445 == -1 && var13.field1434 == null && var13.field1518 == null && !var13.field1516;
        if (class122.field1689 && var13.field1501 != 1) {
            return;
        }
        if (arg8 == 22) {
            if (class42.field584 || var13.field1455 != 0 || var13.field1483 == 1 || var13.field1473) {
                class147 var26;
                if (var25) {
                    class112 var27 = new class112(arg12, var13, arg7, var22, var21, var23, arg3, arg2, var24);
                    if (var27.method114(30582)) {
                        var27.method102((byte) 76, arg12);
                    }
                    var26 = var27;
                } else {
                    var26 = new class164(arg12, var13, arg2, arg11, arg7, var22, var21, var23, arg3, arg9);
                }
                class25.method171(arg11, arg6, arg4, var26);
                if (var13.field1483 == 1 && arg10 != null) {
                    arg10.method1847(262144, arg4, arg6);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class93 var65 = null;
            class55 var66;
            int var67;
            if (var25) {
                class93 var68 = new class93(arg12, var13, arg11, arg7, var22, var21, var23, arg3, arg6, arg6 + var14 - 1, arg4, arg4 + var15 - 1, arg8, arg2, var24);
                var66 = var68;
                var67 = var68.method647(7334);
                var65 = var68;
            } else {
                var66 = new class62(arg12, var13, arg8, arg2, arg11, arg7, var22, var21, var23, arg3, arg6, arg6 + var14 - 1, arg4, arg4 + var15 - 1, arg9);
                var67 = 15;
            }
            if (class21.method146(var66, false)) {
                if (var65 != null && var65.method114(30582)) {
                    var65.method102((byte) 76, arg12);
                }
                if (var13.field1488 && arg5) {
                    if (var67 > 30) {
                        var67 = 30;
                    }
                    for (int var69 = 0; var69 <= var14; var69++) {
                        for (int var70 = 0; var70 <= var15; var70++) {
                            var20.method746(arg6 + var69, arg4 + var70, var67);
                        }
                    }
                }
            }
            if (var13.field1483 != 0 && arg10 != null) {
                arg10.method1855(!var13.field1476, 536870912, arg4, var15, var13.field1442, var14, arg6);
            }
        } else if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
            class55 var28;
            if (var25) {
                class93 var29 = new class93(arg12, var13, arg11, arg7, var22, var21, var23, arg3, arg6, var14 + arg6 - 1, arg4, arg4 + var15 - 1, arg8, arg2, var24);
                if (var29.method114(30582)) {
                    var29.method102((byte) 76, arg12);
                }
                var28 = var29;
            } else {
                var28 = new class62(arg12, var13, arg8, arg2, arg11, arg7, var22, var21, var23, arg3, arg6, arg6 + var14 - 1, arg4, var15 + arg4 - 1, arg9);
            }
            class21.method146(var28, false);
            if (arg5 && !arg3 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg11 > 0 && var13.field1501 != 0) {
                class248.field3341[arg11][arg6][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4], 4);
            }
            if (var13.field1483 != 0 && arg10 != null) {
                arg10.method1855(!var13.field1476, arg1 + 536893301, arg4, var15, var13.field1442, var14, arg6);
            }
        } else if (arg8 == 0) {
            class97 var31;
            if (var25) {
                class338 var30 = new class338(arg12, var13, arg7, var22, var21, var23, arg3, arg8, arg2, var24);
                var31 = var30;
                if (var30.method114(arg1 + 52971)) {
                    var30.method102((byte) 76, arg12);
                }
            } else {
                var31 = new class268(arg12, var13, 0, arg2, arg11, arg7, var22, var21, var23, arg3, arg9);
            }
            class142.method902(arg11, arg6, arg4, var31, (class97) null);
            if (arg5) {
                if (arg2 == 0) {
                    if (var13.field1488) {
                        var20.method746(arg6, arg4, 50);
                        var20.method746(arg6, arg4 + 1, 50);
                    }
                    if (var13.field1501 == 1 && !arg3) {
                        class248.field3341[arg11][arg6][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4], 1);
                    }
                } else if (arg2 == 1) {
                    if (var13.field1488) {
                        var20.method746(arg6, arg4 + 1, 50);
                        var20.method746(arg6 + 1, arg4 + 1, 50);
                    }
                    if (var13.field1501 == 1 && !arg3) {
                        class248.field3341[arg11][arg6][arg4 + 1] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4 + 1], 2);
                    }
                } else if (arg2 == 2) {
                    if (var13.field1488) {
                        var20.method746(arg6 + 1, arg4, 50);
                        var20.method746(arg6 + 1, arg4 + 1, 50);
                    }
                    if (var13.field1501 == 1 && !arg3) {
                        class248.field3341[arg11][arg6 + 1][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6 + 1][arg4], 1);
                    }
                } else if (arg2 == 3) {
                    if (var13.field1488) {
                        var20.method746(arg6, arg4, 50);
                        var20.method746(arg6 + 1, arg4, 50);
                    }
                    if (var13.field1501 == 1 && !arg3) {
                        class248.field3341[arg11][arg6][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4], 2);
                    }
                }
            }
            if (var13.field1483 != 0 && arg10 != null) {
                arg10.method1849((byte) -51, arg8, !var13.field1476, var13.field1442, arg2, arg6, arg4);
            }
            if (var13.field1456 != 16) {
                class250.method1520(arg11, arg6, arg4, var13.field1456);
            }
        } else if (arg8 == 1) {
            class97 var33;
            if (var25) {
                class338 var32 = new class338(arg12, var13, arg7, var22, var21, var23, arg3, arg8, arg2, var24);
                if (var32.method114(30582)) {
                    var32.method102((byte) 76, arg12);
                }
                var33 = var32;
            } else {
                var33 = new class268(arg12, var13, 1, arg2, arg11, arg7, var22, var21, var23, arg3, arg9);
            }
            class142.method902(arg11, arg6, arg4, var33, (class97) null);
            if (var13.field1488 && arg5) {
                if (arg2 == 0) {
                    var20.method746(arg6, arg4 + 1, 50);
                } else if (arg2 == 1) {
                    var20.method746(arg6 + 1, arg4 + 1, 50);
                } else if (arg2 == 2) {
                    var20.method746(arg6 + 1, arg4, 50);
                } else if (arg2 == 3) {
                    var20.method746(arg6, arg4, 50);
                }
            }
            if (var13.field1483 != 0 && arg10 != null) {
                arg10.method1849((byte) -113, arg8, !var13.field1476, var13.field1442, arg2, arg6, arg4);
            }
        } else if (arg8 == 2) {
            int var34 = arg2 + 1 & 0x3;
            class97 var37;
            class97 var38;
            if (var25) {
                class338 var35 = new class338(arg12, var13, arg7, var22, var21, var23, arg3, arg8, arg2 + 4, var24);
                class338 var36 = new class338(arg12, var13, arg7, var22, var21, var23, arg3, arg8, var34, var24);
                if (var35.method114(30582)) {
                    var35.method102((byte) 76, arg12);
                }
                if (var36.method114(arg1 + 52971)) {
                    var36.method102((byte) 76, arg12);
                }
                var37 = var36;
                var38 = var35;
            } else {
                var38 = new class268(arg12, var13, 2, arg2 + 4, arg11, arg7, var22, var21, var23, arg3, arg9);
                var37 = new class268(arg12, var13, 2, var34, arg11, arg7, var22, var21, var23, arg3, arg9);
            }
            class142.method902(arg11, arg6, arg4, var38, var37);
            if (var13.field1501 == 1 && arg5 && !arg3) {
                if (arg2 == 0) {
                    class248.field3341[arg11][arg6][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4], 1);
                    class248.field3341[arg11][arg6][arg4 + 1] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4 + 1], 2);
                } else if (arg2 == 1) {
                    class248.field3341[arg11][arg6][arg4 + 1] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4 + 1], 2);
                    class248.field3341[arg11][arg6 + 1][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6 + 1][arg4], 1);
                } else if (arg2 == 2) {
                    class248.field3341[arg11][arg6 + 1][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6 + 1][arg4], 1);
                    class248.field3341[arg11][arg6][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4], 2);
                } else if (arg2 == 3) {
                    class248.field3341[arg11][arg6][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4], 2);
                    class248.field3341[arg11][arg6][arg4] = (byte) class351.method2313(class248.field3341[arg11][arg6][arg4], 1);
                }
            }
            if (var13.field1483 != 0 && arg10 != null) {
                arg10.method1849((byte) 85, arg8, !var13.field1476, var13.field1442, arg2, arg6, arg4);
            }
            if (var13.field1456 != 16) {
                class250.method1520(arg11, arg6, arg4, var13.field1456);
            }
        } else if (arg8 == 3) {
            class97 var40;
            if (var25) {
                class338 var39 = new class338(arg12, var13, arg7, var22, var21, var23, arg3, arg8, arg2, var24);
                if (var39.method114(arg1 ^ 0xFFFFDFFD)) {
                    var39.method102((byte) 76, arg12);
                }
                var40 = var39;
            } else {
                var40 = new class268(arg12, var13, 3, arg2, arg11, arg7, var22, var21, var23, arg3, arg9);
            }
            class142.method902(arg11, arg6, arg4, var40, (class97) null);
            if (var13.field1488 && arg5) {
                if (arg2 == 0) {
                    var20.method746(arg6, arg4 + 1, 50);
                } else if (arg2 == 1) {
                    var20.method746(arg6 + 1, arg4 + 1, 50);
                } else if (arg2 == 2) {
                    var20.method746(arg6 + 1, arg4, 50);
                } else if (arg2 == 3) {
                    var20.method746(arg6, arg4, 50);
                }
            }
            if (var13.field1483 != 0 && arg10 != null) {
                arg10.method1849((byte) 124, arg8, !var13.field1476, var13.field1442, arg2, arg6, arg4);
            }
        } else if (arg8 == 9) {
            class55 var41;
            if (var25) {
                class93 var42 = new class93(arg12, var13, arg11, arg7, var22, var21, var23, arg3, arg6, arg6, arg4, arg4, arg8, arg2, var24);
                if (var42.method114(30582)) {
                    var42.method102((byte) 76, arg12);
                }
                var41 = var42;
            } else {
                var41 = new class62(arg12, var13, arg8, arg2, arg11, arg7, var22, var21, var23, arg3, arg6, arg6 + var14 - 1, arg4, arg4 + var15 - 1, arg9);
            }
            class21.method146(var41, false);
            if (var13.field1483 != 0 && arg10 != null) {
                arg10.method1855(!var13.field1476, arg1 ^ 0xDFFFA88B, arg4, var15, var13.field1442, var14, arg6);
            }
            if (var13.field1456 != 16) {
                class250.method1520(arg11, arg6, arg4, var13.field1456);
            }
        } else if (arg8 == 4) {
            class299 var43;
            if (var25) {
                class17 var44 = new class17(arg12, var13, arg7, var22, var21, var23, arg3, 0, 0, 0, arg8, arg2);
                if (var44.method114(arg1 + 52971)) {
                    var44.method102((byte) 76, arg12);
                }
                var43 = var44;
            } else {
                var43 = new class317(arg12, var13, arg8, arg2, arg11, arg7, var22, var21, var23, arg3, 0, 0, 0, arg9);
            }
            class346.method2243(arg11, arg6, arg4, var43, (class299) null);
        } else if (arg8 == 5) {
            int var45 = 16;
            class425 var46 = (class425) class40.method292(arg11, arg6, arg4);
            if (var46 != null) {
                var45 = class329.method2190((byte) 63, var46.method121(-15123)).field1456;
            }
            class299 var47;
            if (var25) {
                class17 var48 = new class17(arg12, var13, arg7, var22, var21, var23, arg3, 0, class39.field543[arg2] * var45, class424.field6271[arg2] * var45, arg8, arg2);
                if (var48.method114(30582)) {
                    var48.method102((byte) 76, arg12);
                }
                var47 = var48;
            } else {
                var47 = new class317(arg12, var13, arg8, arg2, arg11, arg7, var22, var21, var23, arg3, 0, class39.field543[arg2] * var45, class424.field6271[arg2] * var45, arg9);
            }
            class346.method2243(arg11, arg6, arg4, var47, (class299) null);
        } else if (arg8 == 6) {
            int var49 = 8;
            class425 var50 = (class425) class40.method292(arg11, arg6, arg4);
            if (var50 != null) {
                var49 = class329.method2190((byte) 63, var50.method121(-15123)).field1456 / 2;
            }
            class299 var51;
            if (var25) {
                class17 var52 = new class17(arg12, var13, arg7, var22, var21, var23, arg3, arg2, class39.field543[arg2] * var49, class424.field6271[arg2] * var49, arg8, arg2 + 4);
                if (var52.method114(30582)) {
                    var52.method102((byte) 76, arg12);
                }
                var51 = var52;
            } else {
                var51 = new class317(arg12, var13, arg8, arg2 + 4, arg11, arg7, var22, var21, var23, arg3, arg2, class343.field4958[arg2] * var49, class213.field2847[arg2] * var49, arg9);
            }
            class346.method2243(arg11, arg6, arg4, var51, (class299) null);
        } else if (arg8 == 7) {
            int var53 = arg2 + 2 & 0x3;
            class299 var55;
            if (var25) {
                class17 var54 = new class17(arg12, var13, arg7, var22, var21, var23, arg3, var53, 0, 0, arg8, var53 + 4);
                var55 = var54;
                if (var54.method114(30582)) {
                    var54.method102((byte) 76, arg12);
                }
            } else {
                var55 = new class317(arg12, var13, arg8, var53 + 4, arg11, arg7, var22, var21, var23, arg3, var53, 0, 0, arg9);
            }
            class346.method2243(arg11, arg6, arg4, var55, (class299) null);
        } else if (arg8 == 8) {
            int var56 = arg2 + 2 & 0x3;
            int var57 = 8;
            class425 var58 = (class425) class40.method292(arg11, arg6, arg4);
            if (var58 != null) {
                var57 = class329.method2190((byte) 63, var58.method121(-15123)).field1456 / 2;
            }
            class299 var61;
            class299 var62;
            if (var25) {
                class17 var63 = new class17(arg12, var13, arg7, var22, var21, var23, arg3, arg2, class343.field4958[arg2] * var57, class213.field2847[arg2] * var57, arg8, arg2 + 4);
                class17 var64 = new class17(arg12, var13, arg7, var22, var21, var23, arg3, arg2, 0, 0, arg8, var56 + 4);
                if (var63.method114(arg1 + 52971)) {
                    var63.method102((byte) 76, arg12);
                }
                var62 = var64;
                if (var64.method114(30582)) {
                    var64.method102((byte) 76, arg12);
                }
                var61 = var63;
            } else {
                class317 var59 = new class317(arg12, var13, arg8, arg2 + 4, arg11, arg7, var22, var21, var23, arg3, arg2, class343.field4958[arg2] * var57, class213.field2847[arg2] * var57, arg9);
                class317 var60 = new class317(arg12, var13, arg8, var56 + 4, arg11, arg7, var22, var21, var23, arg3, arg2, 0, 0, arg9);
                var61 = var59;
                var62 = var60;
            }
            class346.method2243(arg11, arg6, arg4, var61, var62);
        }
    }
}
