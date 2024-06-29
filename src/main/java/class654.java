import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public abstract class class654 extends class434 {

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public static int field9231 = 0;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "Lop;")
    public static class172 field9232;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field9233;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3639(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 5)
    public static void method3635(byte arg0) {
        if (arg0 == 98) {
            field9232 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIIII)V", line = 19)
    public static final void method3636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9228++;
        if (arg6 != 0) {
            return;
        }
        if (class482.field6703 <= arg9 && class144.field2148 >= arg9 && class482.field6703 <= arg5 && arg5 <= class144.field2148 && class482.field6703 <= arg1 && class144.field2148 >= arg1 && class482.field6703 <= arg2 && class144.field2148 >= arg2 && class92.field1219 <= arg3 && arg3 <= class631.field8829 && class92.field1219 <= arg7 && arg7 <= class631.field8829 && class92.field1219 <= arg4 && arg4 <= class631.field8829 && arg0 >= class92.field1219 && arg0 <= class631.field8829) {
            class644.method3588(arg3, arg9, arg1, arg4, arg0, arg8, arg5, arg2, true, arg7);
        } else {
            class500.method2794(arg2, -32094, arg7, arg3, arg5, arg0, arg9, arg8, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lsd;B)V", line = 37)
    public static final void method3637(class81 arg0, byte arg1) {
        field9230++;
        if (arg1 != -122) {
            method3635((byte) -37);
        }
        if (class658.field9266 == null) {
            return;
        }
        class147 var2 = null;
        if (arg0.field1129 == 0) {
            var2 = (class147) class171.method1170(arg0.field1126, arg0.field1121, arg0.field1127);
        }
        if (arg0.field1129 == 1) {
            var2 = (class147) class493.method2759(arg0.field1126, arg0.field1121, arg0.field1127);
        }
        if (arg0.field1129 == 2) {
            var2 = (class147) class410.method2344(arg0.field1126, arg0.field1121, arg0.field1127, field9233 == null ? (field9233 = method3639("uq")) : field9233);
        }
        if (arg0.field1129 == 3) {
            var2 = (class147) class237.method1497(arg0.field1126, arg0.field1121, arg0.field1127);
        }
        if (var2 == null) {
            arg0.field1125 = -1;
            arg0.field1133 = 0;
            arg0.field1123 = 0;
        } else {
            arg0.field1125 = var2.method554(arg1 ^ 0x4A63);
            arg0.field1133 = var2.method549(12352);
            arg0.field1123 = var2.method560(15654);
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 80)
    public static final void method3638(int arg0) {
        field9229++;
        if (class471.field6576 == 0 || class471.field6576 == 6) {
            return;
        }
        try {
            if (++class631.field8808 > 2000) {
                if (class53.field758 != null) {
                    class53.field758.method3127(-77);
                    class53.field758 = null;
                }
                if (class136.field1917 >= 2) {
                    class471.field6576 = 0;
                    class35.method161(-5, (byte) -82);
                    return;
                }
                if (class86.field1181 == 2 || class86.field1181 == 3) {
                    class195.field2887.method2260((byte) 22);
                } else {
                    class92.field1218.method2260((byte) 122);
                }
                class631.field8808 = 0;
                class136.field1917++;
                class471.field6576 = 1;
            }
            if (class471.field6576 == 1) {
                if (class86.field1181 == 2 || class86.field1181 == 3) {
                    class205.field3023 = class195.field2887.method2256(43594, class503.field6878);
                } else {
                    class205.field3023 = class92.field1218.method2256(arg0 ^ 0xAA49, class503.field6878);
                }
                class471.field6576 = 2;
            }
            if (class471.field6576 == 2) {
                if (class205.field3023.field3702 == 2) {
                    throw new IOException();
                }
                if (class205.field3023.field3702 != 1) {
                    return;
                }
                class53.field758 = class514.method2858((Socket) class205.field3023.field3706, 7500, (byte) -81);
                class205.field3023 = null;
                long var1 = class459.field6494 = class482.method2727(arg0 + 12541, class592.field8248);
                class288.field4014.field1301 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class288.field4014.method746((byte) -127, class599.field8310.field2617);
                class288.field4014.method746((byte) -99, var3);
                class53.field758.method3126(class288.field4014.field1316, false, 2, 0);
                class471.field6576 = 3;
            }
            if (class471.field6576 == arg0) {
                if (!class53.field758.method3124((byte) 118, 1)) {
                    return;
                }
                class53.field758.method3129(1, 0, (byte) -86, class602.field8356.field1316);
                int var4 = class602.field8356.field1316[0] & 0xFF;
                if (var4 != 0) {
                    class471.field6576 = 0;
                    class35.method161(var4, (byte) -82);
                    class53.field758.method3127(arg0 ^ 0xFFFFFFC9);
                    class53.field758 = null;
                    class245.method1516(5);
                    return;
                }
                class471.field6576 = 4;
            }
            if (class471.field6576 == 4) {
                if (!class53.field758.method3124((byte) 118, 8)) {
                    return;
                }
                class53.field758.method3129(8, 0, (byte) 107, class602.field8356.field1316);
                class602.field8356.field1301 = 0;
                class239.field3445 = class602.field8356.method715(true);
                class96 var5 = new class96(518);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class239.field3445 >> 32), (int) class239.field3445 };
                var5.method746((byte) -120, 10);
                var5.method741(var6[0], (byte) 27);
                var5.method741(var6[1], (byte) 27);
                var5.method741(var6[2], (byte) 27);
                var5.method741(var6[3], (byte) 27);
                var5.method725((byte) 36, class482.method2727(12544, class592.field8248));
                var5.method708(-125, class374.field5302);
                var5.method725((byte) 36, class129.field1775);
                var5.method725((byte) 36, class546.field7401);
                var5.method716((byte) -118, class65.field864, class496.field6827);
                class674 var7 = class288.field4014;
                var7.field1301 = 0;
                if (class86.field1181 == 2 || class86.field1181 == 3) {
                    if (class340.field4947 == 13) {
                        var7.method746((byte) -91, class599.field8315.field2617);
                    } else {
                        var7.method746((byte) -117, class599.field8312.field2617);
                    }
                    var7.method731(-2045573048, 0);
                    int var9 = var7.field1301;
                    var7.method741(614, (byte) 27);
                    var7.method746((byte) -112, class208.field3075);
                    var7.method746((byte) -111, class402.method2292(true));
                    var7.method731(-2045573048, class547.field7412);
                    var7.method731(-2045573048, class124.field1711);
                    var7.method746((byte) -102, class274.field3872.field899);
                    class496.method2776(var7, 0);
                    var7.method708(83, class240.field3454);
                    var7.method741(class287.field3995, (byte) 27);
                    class96 var10 = new class96(class207.method1369((byte) -120));
                    class274.field3872.method547(103, var10);
                    var7.method746((byte) -125, var10.field1301);
                    var7.method724(var10.field1301, -16054, var10.field1316, 0);
                    class471.field6573 = true;
                    class96 var11 = new class96(class181.method1224(-127));
                    (new class99(true, class503.field6878)).method768(var11, (byte) 80);
                    var7.method724(var11.field1316.length, arg0 ^ 0xFFFFC149, var11.field1316, 0);
                    var7.method731(arg0 - 2045573051, class384.field5379);
                    var7.method725((byte) 36, class531.field7245);
                    class154.method1073((byte) 77);
                    var7.method724(var5.field1301, arg0 - 16057, var5.field1316, 0);
                    var7.method723(false, var7.field1301 - var9);
                } else {
                    var7.method746((byte) -112, class599.field8316.field2617);
                    var7.method731(-2045573048, 0);
                    int var8 = var7.field1301;
                    var7.method741(614, (byte) 27);
                    var7.method746((byte) -90, class158.field2374.field9181);
                    var7.method746((byte) -119, class666.field9377);
                    class496.method2776(var7, arg0 - 3);
                    var7.method708(23, class240.field3454);
                    var7.method741(class287.field3995, (byte) 27);
                    class154.method1073((byte) 60);
                    var7.method724(var5.field1301, -16054, var5.field1316, 0);
                    var7.method723(false, var7.field1301 - var8);
                }
                class53.field758.method3126(var7.field1316, false, var7.field1301, 0);
                var7.method3729(var6, false);
                for (int var12 = 0; var12 < 4; var12++) {
                    var6[var12] += 50;
                }
                class602.field8356.method3729(var6, false);
                class471.field6576 = 5;
            }
            if (class471.field6576 == 5) {
                if (!class53.field758.method3124((byte) 118, 1)) {
                    return;
                }
                class53.field758.method3129(1, 0, (byte) 38, class602.field8356.field1316);
                int var13 = class602.field8356.field1316[0] & 0xFF;
                if (var13 == 21) {
                    class471.field6576 = 8;
                } else if (var13 == 29) {
                    class471.field6576 = 14;
                } else if (var13 == 1) {
                    class471.field6576 = 6;
                    class35.method161(var13, (byte) -82);
                    return;
                } else if (var13 == 2) {
                    class471.field6576 = 9;
                } else if (var13 == 15) {
                    class532.field7250 = -2;
                    class471.field6576 = 15;
                } else if (var13 == 23 && class136.field1917 < 2) {
                    class471.field6576 = 1;
                    class136.field1917++;
                    class631.field8808 = 0;
                    class53.field758.method3127(119);
                    class53.field758 = null;
                    return;
                } else {
                    class471.field6576 = 0;
                    class35.method161(var13, (byte) -82);
                    class53.field758.method3127(113);
                    class53.field758 = null;
                    class245.method1516(5);
                    return;
                }
            }
            if (class471.field6576 == 7) {
                class288.field4014.field1301 = 0;
                class288.field4014.method3727(class599.field8323.field2617, (byte) 108);
                class53.field758.method3126(class288.field4014.field1316, false, class288.field4014.field1301, 0);
                class471.field6576 = 5;
            } else if (class471.field6576 == 8) {
                if (class53.field758.method3124((byte) 118, 1)) {
                    class53.field758.method3129(1, 0, (byte) 88, class602.field8356.field1316);
                    int var14 = class602.field8356.field1316[0] & 0xFF;
                    class471.field6576 = 0;
                    class632.field8849 = (var14 + 3) * 60;
                    class35.method161(21, (byte) -82);
                    class53.field758.method3127(112);
                    class53.field758 = null;
                    class245.method1516(arg0 ^ 0x6);
                }
            } else if (class471.field6576 == 14) {
                if (class53.field758.method3124((byte) 118, 1)) {
                    class53.field758.method3129(1, 0, (byte) -102, class602.field8356.field1316);
                    class471.field6576 = 0;
                    class31.field368 = class602.field8356.field1316[0] & 0xFF;
                    class35.method161(29, (byte) -82);
                    class53.field758.method3127(114);
                    class53.field758 = null;
                    class245.method1516(5);
                }
            } else if (class471.field6576 != 9) {
                if (class471.field6576 == 10) {
                    if (class86.field1181 == 3) {
                        class152.field2278 = true;
                    } else {
                        class152.field2278 = false;
                    }
                    class674 var15 = class602.field8356;
                    if (class86.field1181 == 2 || class86.field1181 == 3) {
                        if (!class53.field758.method3124((byte) 118, class121.field1674)) {
                            return;
                        }
                        class53.field758.method3129(class121.field1674, 0, (byte) -123, var15.field1316);
                        var15.field1301 = 0;
                        class658.field9267 = var15.method718(arg0 ^ 0x67);
                        class186.field2754 = var15.method718(89);
                        class451.field6295 = var15.method718(-76) == 1;
                        class440.field6198 = var15.method718(-125) == 1;
                        class263.field3731 = var15.method718(-59) == 1;
                        class71.field977 = var15.method718(arg0 - 58) == 1;
                        class27.field343 = var15.method743((byte) -103);
                        class206.field3037 = var15.method718(119) == 1;
                        class399.field5543 = var15.method753(1950018080);
                        class192.field2834 = var15.method718(92) == 1;
                        if (class86.field1181 == 3) {
                            boolean var16 = var15.method718(arg0 ^ 0xFFFFFF9B) == 1;
                            if (var16) {
                                long var17 = var15.method715(true);
                                String var19 = class170.method1166(var17, (byte) -128);
                                int var20 = var15.method718(-126);
                                byte[] var21 = new byte[var20];
                                var15.method3731(var21, -22580, 0, var20);
                                String var22 = class649.method3614(var21, arg0 ^ 0x76);
                                class124 var23 = null;
                                try {
                                    class260 var24 = class503.field6878.method628(arg0 ^ 0xD, "3", false);
                                    while (var24.field3702 == 0) {
                                        class419.method2390(62, 1L);
                                    }
                                    if (var24.field3702 == 1) {
                                        var23 = (class124) var24.field3706;
                                        int var25 = var19.length() + (3 - (-2 - var22.length() + -8 - 4)) + 2;
                                        if (var25 > 60) {
                                            throw new RuntimeException(">60");
                                        }
                                        class96 var26 = new class96(var25 + 1);
                                        var26.method746((byte) -100, var25);
                                        var26.method746((byte) -111, 2);
                                        var26.method734((byte) 13, var19);
                                        var26.method734((byte) 13, var22);
                                        var26.method731(-2045573048, class287.field3995);
                                        var26.method725((byte) 36, class531.field7245);
                                        var26.method737(arg0 - 14432);
                                        var23.method880(var26.field1316, arg0 - 2, 0, var26.field1301);
                                    }
                                } catch (Exception var36) {
                                }
                                try {
                                    if (var23 != null) {
                                        var23.method886(true);
                                    }
                                } catch (Exception var34) {
                                }
                                try {
                                    class2.method11("demoaccountcreated", class188.field2779, 21190);
                                } catch (Throwable var33) {
                                }
                            }
                        }
                        class164.field2499.method2017(class192.field2834, (byte) 52);
                        class648.field9184.method3051(class192.field2834, arg0 ^ 0x2661);
                        class648.field9185.method1491(true, class192.field2834);
                    } else if (class53.field758.method3124((byte) 118, class121.field1674)) {
                        class53.field758.method3129(class121.field1674, 0, (byte) -117, var15.field1316);
                        var15.field1301 = 0;
                        class658.field9267 = var15.method718(arg0 ^ 0xFFFFFFBE);
                        class186.field2754 = var15.method718(100);
                        class451.field6295 = var15.method718(-121) == 1;
                        class440.field6198 = var15.method718(-84) == 1;
                        class263.field3731 = var15.method718(-113) == 1;
                        class387.field5433 = var15.method743((byte) -8);
                        class206.field3037 = class387.field5433 > 0;
                        class169.field2550 = var15.method743((byte) -11);
                        class323.field4772 = var15.method743((byte) -111);
                        class134.field1902 = var15.method743((byte) -43);
                        class82.field1153 = var15.method714(false);
                        class124.field1708 = class503.field6878.method613(class82.field1153, 7324);
                        class446.field6250 = var15.method718(-76);
                        class246.field3499 = var15.method743((byte) -47);
                        class325.field4807 = var15.method743((byte) -40);
                        class313.field4645 = var15.method718(arg0 - 63) == 1;
                        class253.field3576.field3975 = class253.field3576.field3986 = var15.method698(arg0);
                        class206.field3050 = var15.method718(94);
                        class31.field370 = var15.method714(false);
                        class475.field6637 = new class397();
                        class475.field6637.field5522 = var15.method743((byte) -118);
                        if (class475.field6637.field5522 == 65535) {
                            class475.field6637.field5522 = -1;
                        }
                        class475.field6637.field5516 = var15.method698(3);
                        if (class500.field6862 != class112.field1530) {
                            class475.field6637.field5515 = class475.field6637.field5522 + 50000;
                            class475.field6637.field5521 = class475.field6637.field5522 + 40000;
                        }
                        if (class500.field6862 != class46.field682 && (class195.field2887.method2258(class634.field8875, (byte) 83) || class195.field2887.method2258(class680.field9588, (byte) 83))) {
                            class74.method591(-124);
                        }
                    } else {
                        return;
                    }
                    if ((!class451.field6295 || class263.field3731) && !class206.field3037) {
                        try {
                            class2.method11("unzap", class188.field2779, 21190);
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            class2.method11("zap", class188.field2779, 21190);
                        } catch (Throwable var35) {
                            if (class181.field2679) {
                                try {
                                    class188.field2779.getAppletContext().showDocument(new URL(class188.field2779.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var32) {
                                }
                            }
                        }
                    }
                    if (class500.field6862 == class112.field1530) {
                        try {
                            class2.method11("loggedin", class188.field2779, 21190);
                        } catch (Throwable var30) {
                        }
                    }
                    if (class86.field1181 != 2 && class86.field1181 != 3) {
                        class471.field6576 = 0;
                        class35.method161(2, (byte) -82);
                        class64.method520(arg0 + 2241);
                        class94.method690(7, (byte) 125);
                        class290.field4382 = null;
                        return;
                    }
                    class471.field6576 = 12;
                }
                if (class471.field6576 == 12) {
                    if (!class53.field758.method3124((byte) 118, 3)) {
                        return;
                    }
                    class53.field758.method3129(3, 0, (byte) 107, class602.field8356.field1316);
                    class471.field6576 = 13;
                }
                if (class471.field6576 == 13) {
                    class674 var27 = class602.field8356;
                    var27.field1301 = 0;
                    if (var27.method3725(-86)) {
                        if (!class53.field758.method3124((byte) 118, 1)) {
                            return;
                        }
                        class53.field758.method3129(1, 3, (byte) 115, var27.field1316);
                    }
                    class290.field4382 = class240.method1507(true)[var27.method3728(23774)];
                    class532.field7250 = var27.method743((byte) -98);
                    class471.field6576 = 11;
                }
                if (class471.field6576 == 11) {
                    if (class53.field758.method3124((byte) 118, class532.field7250)) {
                        class53.field758.method3129(class532.field7250, 0, (byte) -123, class602.field8356.field1316);
                        class602.field8356.field1301 = 0;
                        class471.field6576 = 0;
                        int var28 = class532.field7250;
                        class35.method161(2, (byte) -82);
                        class232.method1466(0);
                        class121.method864(class602.field8356, -1594803704);
                        class357.field5117 = -1;
                        if (class290.field4382 == class143.field2133) {
                            class201.method1350(false);
                        } else {
                            class665.method3689(false);
                        }
                        if (class602.field8356.field1301 != var28) {
                            throw new RuntimeException("lswp pos:" + class602.field8356.field1301 + " psize:" + var28);
                        }
                        class290.field4382 = null;
                    }
                } else if (class471.field6576 == 15) {
                    if (class532.field7250 == -2) {
                        if (!class53.field758.method3124((byte) 118, 2)) {
                            return;
                        }
                        class53.field758.method3129(2, 0, (byte) -85, class602.field8356.field1316);
                        class602.field8356.field1301 = 0;
                        class532.field7250 = class602.field8356.method743((byte) -87);
                    }
                    if (class53.field758.method3124((byte) 118, class532.field7250)) {
                        class53.field758.method3129(class532.field7250, 0, (byte) -121, class602.field8356.field1316);
                        class602.field8356.field1301 = 0;
                        class471.field6576 = 0;
                        int var29 = class532.field7250;
                        class35.method161(15, (byte) -82);
                        class92.method679(125);
                        class121.method864(class602.field8356, -1594803704);
                        if (class602.field8356.field1301 != var29) {
                            throw new RuntimeException("lswpr pos:" + class602.field8356.field1301 + " psize:" + var29);
                        }
                        class290.field4382 = null;
                    }
                }
            } else if (class53.field758.method3124((byte) 118, 1)) {
                class53.field758.method3129(1, 0, (byte) 73, class602.field8356.field1316);
                class471.field6576 = 10;
                class121.field1674 = class602.field8356.field1316[0] & 0xFF;
            }
        } catch (IOException var37) {
            if (class53.field758 != null) {
                class53.field758.method3127(-114);
                class53.field758 = null;
            }
            if (class136.field1917 >= 2) {
                class471.field6576 = 0;
                class35.method161(-4, (byte) -82);
                class245.method1516(5);
            } else {
                if (class86.field1181 == 2 || class86.field1181 == 3) {
                    class195.field2887.method2260((byte) 82);
                } else {
                    class92.field1218.method2260((byte) -127);
                }
                class631.field8808 = 0;
                class471.field6576 = 1;
                class136.field1917++;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Ljs;")
    public abstract class300 method265(int arg0);
}
