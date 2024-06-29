import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class259 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1624(byte arg0) {
        field3585++;
        if (class243.field3275 == 0 || class243.field3275 == 6) {
            return;
        }
        try {
            if (++class532.field7343 > 2000) {
                if (class80.field1014 != null) {
                    class80.field1014.method971(arg0 + 3289622);
                    class80.field1014 = null;
                }
                if (class518.field7147 >= 2) {
                    class243.field3275 = 0;
                    class689.method3818(-5, 80);
                    return;
                }
                if (class168.field2105 == 2 || class168.field2105 == 3) {
                    class79.field1002.method3726(44);
                } else {
                    class225.field2934.method3726(-67);
                }
                class532.field7343 = 0;
                class518.field7147++;
                class243.field3275 = 1;
            }
            if (class243.field3275 == 1) {
                if (class168.field2105 == 2 || class168.field2105 == 3) {
                    class78.field975 = class79.field1002.method3729(-99, class495.field6687);
                } else {
                    class78.field975 = class225.field2934.method3729(-113, class495.field6687);
                }
                class243.field3275 = 2;
            }
            if (class243.field3275 == 2) {
                if (class78.field975.field3773 == 2) {
                    throw new IOException();
                }
                if (class78.field975.field3773 != 1) {
                    return;
                }
                class80.field1014 = class313.method2028((Socket) class78.field975.field3772, arg0 - 2621, 5000);
                class78.field975 = null;
                long var1 = class620.field8422 = class522.method2981(class82.field1022, arg0 ^ 0x6F58);
                class253.field3491.field1745 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class253.field3491.method951((byte) -82, class393.field5624.field4951);
                class253.field3491.method951((byte) -82, var3);
                class80.field1014.method969(class253.field3491.field1712, 0, -11679, 2);
                class243.field3275 = 3;
            }
            if (class243.field3275 == 3) {
                if (!class80.field1014.method965((byte) 118, 1)) {
                    return;
                }
                class80.field1014.method964(class164.field2068.field1712, 1, 73, 0);
                int var4 = class164.field2068.field1712[0] & 0xFF;
                if (var4 != 0) {
                    class243.field3275 = 0;
                    class689.method3818(var4, 125);
                    class80.field1014.method971(3289650);
                    class80.field1014 = null;
                    class8.method48((byte) 60);
                    return;
                }
                class243.field3275 = 4;
            }
            if (class243.field3275 == 4) {
                if (!class80.field1014.method965((byte) 113, 8)) {
                    return;
                }
                class80.field1014.method964(class164.field2068.field1712, 8, -124, 0);
                class164.field2068.field1745 = 0;
                class419.field5836 = class164.field2068.method949(arg0 ^ 0x77);
                class138 var5 = new class138(518);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class419.field5836 >> 32), (int) class419.field5836 };
                var5.method951((byte) -82, 10);
                var5.method906(-1, var6[0]);
                var5.method906(-1, var6[1]);
                var5.method906(arg0 ^ 0xFFFFFFE3, var6[2]);
                var5.method906(arg0 ^ 0xFFFFFFE3, var6[3]);
                var5.method923(class522.method2981(class82.field1022, arg0 ^ 0x6F58), -22205);
                var5.method905(class67.field885, -121);
                var5.method923(class12.field116, arg0 - 22233);
                var5.method923(class266.field3651, -22205);
                var5.method958(class192.field2492, class20.field185, arg0 + 81);
                class122 var7 = class253.field3491;
                var7.field1745 = 0;
                if (class168.field2105 == 2 || class168.field2105 == 3) {
                    if (class476.field6436 == 13) {
                        var7.method951((byte) -82, class393.field5634.field4951);
                    } else {
                        var7.method951((byte) -82, class393.field5632.field4951);
                    }
                    var7.method915(0, arg0 ^ 0x598A66D4);
                    int var8 = var7.field1745;
                    var7.method906(-1, 613);
                    var7.method951((byte) -82, class644.field9129);
                    var7.method951((byte) -82, class42.method252(-128));
                    var7.method915(class303.field4059, arg0 + 1502242476);
                    var7.method915(class211.field2763, 1502242504);
                    var7.method951((byte) -82, class72.field935.field6517);
                    class155.method1033(var7, 28380);
                    var7.method905(class613.field8363, arg0 + 53);
                    var7.method906(-1, class625.field8511);
                    class138 var9 = new class138(class635.method3464(-15195));
                    class72.field935.method2690(var9, (byte) 86);
                    var7.method951((byte) -82, var9.field1745);
                    var7.method955(var9.field1745, 0, 29986, var9.field1712);
                    class665.field9426 = true;
                    class138 var10 = new class138(class227.method1391(14));
                    (new class47(true, class495.field6687)).method283(var10, 127);
                    var7.method955(var10.field1712.length, 0, 29986, var10.field1712);
                    var7.method915(class545.field7473, 1502242504);
                    var7.method923(class636.field8670, -22205);
                    class207.method1297(true);
                    var7.method955(var5.field1745, 0, 29986, var5.field1712);
                    var7.method916(true, var7.field1745 - var8);
                } else {
                    var7.method951((byte) -82, class393.field5635.field4951);
                    var7.method915(0, arg0 + 1502242476);
                    int var11 = var7.field1745;
                    var7.method906(-1, 613);
                    var7.method951((byte) -82, class33.field322.field6547);
                    var7.method951((byte) -82, class350.field5121);
                    class155.method1033(var7, arg0 + 28352);
                    var7.method905(class613.field8363, 45);
                    var7.method906(-1, class625.field8511);
                    class207.method1297(true);
                    var7.method955(var5.field1745, 0, arg0 + 29958, var5.field1712);
                    var7.method916(true, var7.field1745 - var11);
                }
                class80.field1014.method969(var7.field1712, 0, -11679, var7.field1745);
                var7.method750(var6, (byte) 99);
                for (int var12 = 0; var12 < 4; var12++) {
                    var6[var12] += 50;
                }
                class164.field2068.method750(var6, (byte) 38);
                class243.field3275 = 5;
            }
            if (class243.field3275 == 5) {
                if (!class80.field1014.method965((byte) -18, 1)) {
                    return;
                }
                class80.field1014.method964(class164.field2068.field1712, 1, -118, 0);
                int var13 = class164.field2068.field1712[0] & 0xFF;
                if (var13 == 21) {
                    class243.field3275 = 8;
                } else if (var13 == 29) {
                    class243.field3275 = 14;
                } else if (var13 == 1) {
                    class243.field3275 = 6;
                    class689.method3818(var13, 95);
                    return;
                } else if (var13 == 2) {
                    class243.field3275 = 9;
                } else if (var13 == 15) {
                    class161.field2037 = -2;
                    class243.field3275 = 15;
                } else if (var13 == 23 && class518.field7147 < 2) {
                    class532.field7343 = 0;
                    class518.field7147++;
                    class243.field3275 = 1;
                    class80.field1014.method971(arg0 + 3289622);
                    class80.field1014 = null;
                    return;
                } else {
                    class243.field3275 = 0;
                    class689.method3818(var13, 77);
                    class80.field1014.method971(arg0 + 3289622);
                    class80.field1014 = null;
                    class8.method48((byte) 60);
                    return;
                }
            }
            if (class243.field3275 == 7) {
                class253.field3491.field1745 = 0;
                class253.field3491.method749(-2079959225, class393.field5642.field4951);
                class80.field1014.method969(class253.field3491.field1712, 0, -11679, class253.field3491.field1745);
                class243.field3275 = 5;
            } else if (class243.field3275 == 8) {
                if (class80.field1014.method965((byte) 104, 1)) {
                    class80.field1014.method964(class164.field2068.field1712, 1, 117, 0);
                    int var14 = class164.field2068.field1712[0] & 0xFF;
                    class243.field3275 = 0;
                    class222.field2874 = var14 * 60 + 180;
                    class689.method3818(21, 120);
                    class80.field1014.method971(3289650);
                    class80.field1014 = null;
                    class8.method48((byte) 60);
                }
            } else if (class243.field3275 == 14) {
                if (class80.field1014.method965((byte) 126, 1)) {
                    class80.field1014.method964(class164.field2068.field1712, 1, -122, 0);
                    class477.field6444 = class164.field2068.field1712[0] & 0xFF;
                    class243.field3275 = 0;
                    class689.method3818(29, 81);
                    class80.field1014.method971(3289650);
                    class80.field1014 = null;
                    class8.method48((byte) 60);
                }
            } else if (class243.field3275 != 9) {
                if (class243.field3275 == 10) {
                    class122 var15 = class164.field2068;
                    if (class168.field2105 == 3) {
                        class679.field9655 = true;
                    } else {
                        class679.field9655 = false;
                    }
                    if (class168.field2105 == 2 || class168.field2105 == 3) {
                        if (!class80.field1014.method965((byte) -98, class377.field5411)) {
                            return;
                        }
                        class80.field1014.method964(var15.field1712, class377.field5411, 74, 0);
                        var15.field1745 = 0;
                        class485.field6560 = var15.method957((byte) -124);
                        class49.field657 = var15.method957((byte) -103);
                        class276.field3741 = var15.method957((byte) -119) == 1;
                        class205.field2682 = var15.method957((byte) -100) == 1;
                        class24.field232 = var15.method957((byte) -118) == 1;
                        class283.field3832 = var15.method957((byte) -90) == 1;
                        class224.field2907 = var15.method922((byte) -122);
                        class575.field7963 = var15.method957((byte) -70) == 1;
                        class428.field5950 = var15.method910(-1703526384);
                        class624.field8492 = var15.method957((byte) -102) == 1;
                        if (class168.field2105 == 3) {
                            boolean var16 = var15.method957((byte) -80) == 1;
                            if (var16) {
                                long var17 = var15.method949(118);
                                String var19 = class98.method538(var17, 78);
                                int var20 = var15.method957((byte) -124);
                                byte[] var21 = new byte[var20];
                                var15.method746((byte) 36, var21, 0, var20);
                                String var22 = class290.method1723(-129, var21);
                                class428 var23 = null;
                                try {
                                    class280 var24 = class495.field6687.method625(false, -25857, "3");
                                    while (var24.field3773 == 0) {
                                        class660.method3668(-1, 1L);
                                    }
                                    if (var24.field3773 == 1) {
                                        var23 = (class428) var24.field3772;
                                        int var25 = var19.length() + (3 - -var22.length() - -2) + 4 + 8 + 2;
                                        if (var25 > 60) {
                                            throw new RuntimeException(">60");
                                        }
                                        class138 var26 = new class138(var25 + 1);
                                        var26.method951((byte) -82, var25);
                                        var26.method951((byte) -82, 2);
                                        var26.method952(var19, (byte) -122);
                                        var26.method952(var22, (byte) -93);
                                        var26.method915(class625.field8511, 1502242504);
                                        var26.method923(class636.field8670, arg0 ^ 0xFFFFA95F);
                                        var26.method919(true);
                                        var23.method2465(var26.field1712, 0, -20626, var26.field1745);
                                    }
                                } catch (Exception var36) {
                                }
                                try {
                                    if (var23 != null) {
                                        var23.method2467((byte) 106);
                                    }
                                } catch (Exception var34) {
                                }
                                try {
                                    class302.method1821(class372.field5359, arg0 + 10021, "demoaccountcreated");
                                } catch (Throwable var33) {
                                }
                            }
                        }
                        class578.field7980.method1749(class624.field8492, 30);
                        class237.field3088.method1348(class624.field8492, (byte) 86);
                        class318.field4640.method3383(11, class624.field8492);
                    } else if (class80.field1014.method965((byte) 97, class377.field5411)) {
                        class80.field1014.method964(var15.field1712, class377.field5411, -121, 0);
                        var15.field1745 = 0;
                        class485.field6560 = var15.method957((byte) -63);
                        class49.field657 = var15.method957((byte) -81);
                        class276.field3741 = var15.method957((byte) -128) == 1;
                        class205.field2682 = var15.method957((byte) -64) == 1;
                        class24.field232 = var15.method957((byte) -77) == 1;
                        class612.field8349 = var15.method922((byte) -118);
                        class575.field7963 = class612.field8349 > 0;
                        class268.field3672 = var15.method922((byte) -124);
                        class488.field6585 = var15.method922((byte) -124);
                        class470.field6370 = var15.method922((byte) -127);
                        class459.field6246 = var15.method943(-76);
                        class150.field1893 = class495.field6687.method621(65535, class459.field6246);
                        class164.field2070 = var15.method957((byte) -105);
                        class620.field8435 = var15.method922((byte) -126);
                        class544.field7458 = var15.method922((byte) -116);
                        class85.field1041 = var15.method957((byte) -106) == 1;
                        class596.field8164.field7191 = class596.field8164.field7157 = var15.method939((byte) 79);
                        class436.field6012 = var15.method957((byte) -69);
                        class533.field7350 = var15.method943(arg0 - 121);
                        class453.field6179 = new class675();
                        class453.field6179.field9558 = var15.method922((byte) -115);
                        if (class453.field6179.field9558 == 65535) {
                            class453.field6179.field9558 = -1;
                        }
                        class453.field6179.field9560 = var15.method939((byte) 102);
                        if (class375.field5396 != class333.field4859) {
                            class453.field6179.field9561 = class453.field6179.field9558 + 40000;
                            class453.field6179.field9566 = class453.field6179.field9558 + 50000;
                        }
                        if (class667.field9492 != class375.field5396 && (class79.field1002.method3727(-31835, class52.field675) || class79.field1002.method3727(-31835, class535.field7353))) {
                            class245.method1510(-115);
                        }
                    } else {
                        return;
                    }
                    if ((!class276.field3741 || class24.field232) && !class575.field7963) {
                        try {
                            class302.method1821(class372.field5359, 10049, "unzap");
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            class302.method1821(class372.field5359, arg0 + 10021, "zap");
                        } catch (Throwable var35) {
                            if (class498.field6735) {
                                try {
                                    class372.field5359.getAppletContext().showDocument(new URL(class372.field5359.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var32) {
                                }
                            }
                        }
                    }
                    if (class375.field5396 == class333.field4859) {
                        try {
                            class302.method1821(class372.field5359, arg0 ^ 0x275D, "loggedin");
                        } catch (Throwable var30) {
                        }
                    }
                    if (class168.field2105 != 2 && class168.field2105 != 3) {
                        class243.field3275 = 0;
                        class689.method3818(2, 93);
                        class375.method2286((byte) -5);
                        class676.method3739(arg0 - 22177, 7);
                        class308.field4138 = null;
                        return;
                    }
                    class243.field3275 = 12;
                }
                if (class243.field3275 == 12) {
                    if (!class80.field1014.method965((byte) 120, 3)) {
                        return;
                    }
                    class80.field1014.method964(class164.field2068.field1712, 3, arg0 ^ 0xFFFFFF9B, 0);
                    class243.field3275 = 13;
                }
                if (class243.field3275 == 13) {
                    class122 var27 = class164.field2068;
                    var27.field1745 = 0;
                    if (var27.method744(true)) {
                        if (!class80.field1014.method965((byte) 103, 1)) {
                            return;
                        }
                        class80.field1014.method964(var27.field1712, 1, 112, 3);
                    }
                    class308.field4138 = class200.method1267(true)[var27.method748((byte) -128)];
                    class161.field2037 = var27.method922((byte) -125);
                    class243.field3275 = 11;
                }
                if (arg0 == 28) {
                    if (class243.field3275 == 11) {
                        if (class80.field1014.method965((byte) -18, class161.field2037)) {
                            class80.field1014.method964(class164.field2068.field1712, class161.field2037, 110, 0);
                            class164.field2068.field1745 = 0;
                            class243.field3275 = 0;
                            int var28 = class161.field2037;
                            class689.method3818(2, 77);
                            class33.method197(arg0 ^ 0x6C);
                            class155.method1032(class164.field2068, arg0 ^ 0x1D);
                            class690.field9747 = -1;
                            if (class544.field7456 == class308.field4138) {
                                class161.method1094(-47);
                            } else {
                                class483.method2696(-15145);
                            }
                            if (class164.field2068.field1745 != var28) {
                                throw new RuntimeException("lswp pos:" + class164.field2068.field1745 + " psize:" + var28);
                            }
                            class308.field4138 = null;
                        }
                    } else if (class243.field3275 == 15) {
                        if (class161.field2037 == -2) {
                            if (!class80.field1014.method965((byte) 97, 2)) {
                                return;
                            }
                            class80.field1014.method964(class164.field2068.field1712, 2, 87, 0);
                            class164.field2068.field1745 = 0;
                            class161.field2037 = class164.field2068.method922((byte) -122);
                        }
                        if (class80.field1014.method965((byte) 125, class161.field2037)) {
                            class80.field1014.method964(class164.field2068.field1712, class161.field2037, arg0 ^ 0x38, 0);
                            class164.field2068.field1745 = 0;
                            int var29 = class161.field2037;
                            class243.field3275 = 0;
                            class689.method3818(15, 101);
                            class204.method1283(124);
                            class155.method1032(class164.field2068, 1);
                            if (class164.field2068.field1745 != var29) {
                                throw new RuntimeException("lswpr pos:" + class164.field2068.field1745 + " psize:" + var29);
                            }
                            class308.field4138 = null;
                        }
                    }
                }
            } else if (class80.field1014.method965((byte) -58, 1)) {
                class80.field1014.method964(class164.field2068.field1712, 1, -122, 0);
                class377.field5411 = class164.field2068.field1712[0] & 0xFF;
                class243.field3275 = 10;
            }
        } catch (IOException var37) {
            if (class80.field1014 != null) {
                class80.field1014.method971(arg0 ^ 0x32322E);
                class80.field1014 = null;
            }
            if (class518.field7147 >= 2) {
                class243.field3275 = 0;
                class689.method3818(-4, 119);
                class8.method48((byte) 60);
            } else {
                if (class168.field2105 == 2 || class168.field2105 == 3) {
                    class79.field1002.method3726(-122);
                } else {
                    class225.field2934.method3726(arg0 ^ 0x4B);
                }
                class243.field3275 = 1;
                class532.field7343 = 0;
                class518.field7147++;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 648)
    public static final void method1625(int arg0) {
        if (arg0 != 23727) {
            return;
        }
        field3584++;
        class164.field2068.method745(8);
        int var1 = class164.field2068.method752(0, 8);
        if (class306.field4106 > var1) {
            for (int var2 = var1; var2 < class306.field4106; var2++) {
                class572.field7921[class43.field557++] = class690.field9742[var2];
            }
        }
        if (var1 > class306.field4106) {
            throw new RuntimeException("gnpov1");
        }
        class306.field4106 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class690.field9742[var3];
            class676 var5 = ((class637) class77.field955.method2506(30, (long) var4)).field8702;
            int var6 = class164.field2068.method752(arg0 ^ 0x5CAF, 1);
            if (var6 == 0) {
                class690.field9742[class306.field4106++] = var4;
                var5.field428 = class430.field5984;
            } else {
                int var7 = class164.field2068.method752(0, 2);
                if (var7 == 0) {
                    class690.field9742[class306.field4106++] = var4;
                    var5.field428 = class430.field5984;
                    class169.field2109[class353.field5161++] = var4;
                } else if (var7 == 1) {
                    class690.field9742[class306.field4106++] = var4;
                    var5.field428 = class430.field5984;
                    int var8 = class164.field2068.method752(arg0 - 23727, 3);
                    var5.method3738(var8, 1, (byte) -99);
                    int var9 = class164.field2068.method752(0, 1);
                    if (var9 == 1) {
                        class169.field2109[class353.field5161++] = var4;
                    }
                } else if (var7 == 2) {
                    class690.field9742[class306.field4106++] = var4;
                    var5.field428 = class430.field5984;
                    if (class164.field2068.method752(0, 1) == 1) {
                        int var10 = class164.field2068.method752(0, 3);
                        var5.method3738(var10, 2, (byte) -78);
                        int var11 = class164.field2068.method752(0, 3);
                        var5.method3738(var11, 2, (byte) -128);
                    } else {
                        int var12 = class164.field2068.method752(0, 3);
                        var5.method3738(var12, 0, (byte) -91);
                    }
                    int var13 = class164.field2068.method752(0, 1);
                    if (var13 == 1) {
                        class169.field2109[class353.field5161++] = var4;
                    }
                } else if (var7 == 3) {
                    class572.field7921[class43.field557++] = var4;
                }
            }
        }
    }
}
