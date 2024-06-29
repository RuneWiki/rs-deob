import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class301 {

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Lhn;")
    public static class509 field4571 = new class509(28, -2);

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field4572 = -1;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "F")
    public static float field4568;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "[[B")
    public static byte[][] field4569;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method1943(int arg0) {
        field4569 = null;
        field4571 = null;
        if (arg0 != -11260) {
            field4572 = -9;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
    public static final void method1944(int arg0) {
        field4570++;
        if (class500.field7185 == 0 || class500.field7185 == 5) {
            return;
        }
        try {
            if (++class10.field139 > 2000) {
                if (class162.field2413 != null) {
                    class162.field2413.method1966(110);
                    class162.field2413 = null;
                }
                if (class188.field2824 >= 1) {
                    class500.field7185 = 0;
                    class501.method2972(-5, -2);
                    return;
                }
                class500.field7185 = 1;
                class10.field139 = 0;
                if (class6.field66 == 2 || class6.field66 == 3) {
                    class283.field4310.field6308 = !class283.field4310.field6308;
                } else {
                    class12.field163.field6308 = !class12.field163.field6308;
                }
                class188.field2824++;
            }
            if (class500.field7185 == 1) {
                if (class6.field66 == 2 || class6.field66 == 3) {
                    class363.field5377 = class360.field5349.method2197(class283.field4310.method2649(arg0 ^ 0x3E3F), class283.field4310.field6311, 0);
                } else {
                    class363.field5377 = class360.field5349.method2197(class12.field163.method2649(arg0 ^ 0x3E3F), class12.field163.field6311, arg0 ^ 0x3E3F);
                }
                class500.field7185 = 2;
            }
            if (class500.field7185 == 2) {
                if (class363.field5377.field6570 == 2) {
                    throw new IOException();
                }
                if (class363.field5377.field6570 != 1) {
                    return;
                }
                class162.field2413 = new class307((Socket) class363.field5377.field6569, class360.field5349);
                class363.field5377 = null;
                long var1 = class188.field2867 = class257.method1712(class97.field1393, (byte) -8);
                class71.field1020.field3556 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class71.field1020.method1545(class518.field7543.field1077, -54);
                class71.field1020.method1545(var3, -103);
                class162.field2413.method1969(class71.field1020.field3572, 0, (byte) 69, 2);
                class486.method2906((byte) 123);
                int var4 = class162.field2413.method1968((byte) 123);
                class486.method2906((byte) 123);
                if (var4 != 0) {
                    class500.field7185 = 0;
                    class501.method2972(var4, -2);
                    class162.field2413.method1966(arg0 ^ 0x3E43);
                    class162.field2413 = null;
                    class325.method2071(true);
                    return;
                }
                class500.field7185 = 3;
            }
            if (class500.field7185 == 3) {
                if (class162.field2413.method1970(true) < 8) {
                    return;
                }
                class162.field2413.method1965(0, 8, (byte) -81, class238.field3819.field3572);
                class238.field3819.field3556 = 0;
                class486.field7002 = class238.field3819.method1520((byte) 73);
                class217 var5 = new class217(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class486.field7002 >> 32), (int) class486.field7002 };
                var5.method1545(10, -72);
                var5.method1566(true, var6[0]);
                var5.method1566(true, var6[1]);
                var5.method1566(true, var6[2]);
                var5.method1566(true, var6[3]);
                var5.method1507(class257.method1712(class97.field1393, (byte) -8), (byte) -114);
                var5.method1534(class124.field1847, false);
                var5.method1514(class395.field5880, class471.field6811, 0);
                class263 var7 = class71.field1020;
                var7.field3556 = 0;
                if (class6.field66 == 2 || class6.field66 == 3) {
                    if (class429.field6373 == 12) {
                        var7.method1545(class518.field7549.field1077, arg0 - 16057);
                    } else {
                        var7.method1545(class518.field7547.field1077, -49);
                    }
                    var7.method1542(0, arg0 ^ 0xFFFFCB03);
                    int var9 = var7.field3556;
                    var7.method1566(true, 594);
                    var7.method1545(class36.field436, -109);
                    var7.method1545(class32.method223((byte) 126), -101);
                    var7.method1542(class80.field1163, -2756);
                    var7.method1542(class76.field1105, arg0 ^ 0xFFFFCB03);
                    var7.method1545(class193.field3258.field7248, -47);
                    class224.method1598(arg0 ^ 0xFFFF9542, var7);
                    var7.method1534(class6.field71, false);
                    var7.method1566(true, class341.field5067);
                    class217 var10 = class193.field3258.method932(-1784);
                    var7.method1545(var10.field3556, -118);
                    var7.method1516(var10.field3572, 26818, var10.field3556, 0);
                    class360.field5348 = true;
                    var7.method1542(class483.field6955, -2756);
                    class179.method1200(115);
                    var7.method1516(var5.field3572, 26818, var5.field3556, 0);
                    var7.method1561((byte) 109, var7.field3556 - var9);
                } else {
                    var7.method1545(class518.field7550.field1077, -92);
                    var7.method1542(0, -2756);
                    int var8 = var7.field3556;
                    var7.method1566(true, 594);
                    var7.method1545(class312.field4691.field6918, -74);
                    var7.method1545(class224.field3673, arg0 - 16011);
                    class224.method1598(arg0 ^ 0xFFFF9542, var7);
                    var7.method1534(class6.field71, false);
                    var7.method1566(true, class341.field5067);
                    class179.method1200(95);
                    var7.method1516(var5.field3572, 26818, var5.field3556, 0);
                    var7.method1561((byte) 109, var7.field3556 - var8);
                }
                class162.field2413.method1969(var7.field3572, 0, (byte) 12, var7.field3556);
                var7.method1759((byte) 0, var6);
                for (int var11 = 0; var11 < 4; var11++) {
                    var6[var11] += 50;
                }
                class238.field3819.method1759((byte) 0, var6);
                class500.field7185 = 4;
            }
            if (class500.field7185 == 4) {
                if (class162.field2413.method1970(true) < 1) {
                    return;
                }
                int var12 = class162.field2413.method1968((byte) 57);
                if (var12 == 21) {
                    class500.field7185 = 7;
                } else if (var12 == 29) {
                    class500.field7185 = 13;
                } else if (var12 == 1) {
                    class500.field7185 = 5;
                    class501.method2972(var12, arg0 - 15937);
                    return;
                } else if (var12 == 2) {
                    class500.field7185 = 8;
                } else if (var12 == 15) {
                    class142.field2164 = -2;
                    class500.field7185 = 14;
                } else if (var12 == 23 && class188.field2824 < 1) {
                    class10.field139 = 0;
                    class188.field2824++;
                    class500.field7185 = 1;
                    class162.field2413.method1966(116);
                    class162.field2413 = null;
                    return;
                } else {
                    class500.field7185 = 0;
                    class501.method2972(var12, -2);
                    class162.field2413.method1966(arg0 ^ 0x3E7F);
                    class162.field2413 = null;
                    class325.method2071(true);
                    return;
                }
            }
            if (class500.field7185 == 6) {
                class71.field1020.field3556 = 0;
                class71.field1020.method1761((byte) 33, class518.field7548.field1077);
                class162.field2413.method1969(class71.field1020.field3572, 0, (byte) -126, class71.field1020.field3556);
                class500.field7185 = 4;
            } else if (class500.field7185 == 7) {
                if (class162.field2413.method1970(true) >= 1) {
                    class452.field6604 = class162.field2413.method1968((byte) 48) * 60 + 180;
                    class500.field7185 = 0;
                    class501.method2972(21, -2);
                    class162.field2413.method1966(arg0 ^ 0x3E50);
                    class162.field2413 = null;
                    class325.method2071(true);
                }
            } else if (arg0 == 15935) {
                if (class500.field7185 == 13) {
                    if (class162.field2413.method1970(true) >= 1) {
                        class118.field1793 = class162.field2413.method1968((byte) 103);
                        class500.field7185 = 0;
                        class501.method2972(29, -2);
                        class162.field2413.method1966(101);
                        class162.field2413 = null;
                        class325.method2071(true);
                    }
                } else if (class500.field7185 != 8) {
                    if (class500.field7185 == 9) {
                        class263 var13 = class238.field3819;
                        if (class6.field66 == 3) {
                            class158.field2388 = true;
                        } else {
                            class158.field2388 = false;
                        }
                        if (class6.field66 == 2 || class6.field66 == 3) {
                            if (class162.field2413.method1970(true) < class100.field1432) {
                                return;
                            }
                            class162.field2413.method1965(0, class100.field1432, (byte) -81, var13.field3572);
                            var13.field3556 = 0;
                            class417.field6224 = var13.method1515((byte) 123);
                            class277.field4220 = var13.method1515((byte) 127);
                            class363.field5366 = var13.method1515((byte) 121) == 1;
                            class382.field5751 = var13.method1515((byte) 125) == 1;
                            class80.field1143 = var13.method1515((byte) 123) == 1;
                            class412.field6177 = var13.method1515((byte) 123) == 1;
                            class261.field4008 = var13.method1511(100);
                            class88.field1252 = var13.method1515((byte) 123) == 1;
                            class531.field7753 = var13.method1515((byte) 124) == 1;
                            if (class6.field66 == 3) {
                                boolean var14 = var13.method1515((byte) 126) == 1;
                                if (var14) {
                                    long var15 = var13.method1520((byte) 100);
                                    String var17 = class149.method1040(var15, arg0 - 15898);
                                    int var18 = var13.method1515((byte) 125);
                                    byte[] var19 = new byte[var18];
                                    var13.method1754(0, var19, var18, -49);
                                    String var20 = class296.method1924(var19, -123);
                                    class51 var21 = null;
                                    try {
                                        class449 var22 = class360.field5349.method2194("3", false, arg0 - 15935);
                                        while (var22.field6570 == 0) {
                                            class434.method2690(10, 1L);
                                        }
                                        if (var22.field6570 == 1) {
                                            var21 = (class51) var22.field6569;
                                            int var23 = var17.length() + (3 - (-2 - var20.length())) + 4;
                                            if (var23 > 50) {
                                                throw new RuntimeException(">50");
                                            }
                                            class217 var24 = new class217(var23 + 1);
                                            var24.method1545(var23, -40);
                                            var24.method1545(0, arg0 ^ 0xFFFFC192);
                                            var24.method1527((byte) 48, var17);
                                            var24.method1527((byte) 70, var20);
                                            var24.method1567((byte) -127);
                                            var21.method494(var24.field3556, -128, var24.field3572, 0);
                                        }
                                    } catch (Exception var33) {
                                    }
                                    try {
                                        if (var21 != null) {
                                            var21.method496(arg0 ^ 0xFFFFBFF2);
                                        }
                                    } catch (Exception var31) {
                                    }
                                }
                            }
                            class510.field7458.method2968(-1853518624, class531.field7753);
                            class390.field5847.method461((byte) -48, class531.field7753);
                            class175.field2605.method2781(class531.field7753, (byte) -127);
                        } else if (class162.field2413.method1970(true) >= class100.field1432) {
                            class162.field2413.method1965(0, class100.field1432, (byte) -81, var13.field3572);
                            var13.field3556 = 0;
                            class417.field6224 = var13.method1515((byte) 125);
                            class277.field4220 = var13.method1515((byte) 124);
                            class363.field5366 = var13.method1515((byte) 122) == 1;
                            class382.field5751 = var13.method1515((byte) 124) == 1;
                            class80.field1143 = var13.method1515((byte) 121) == 1;
                            class480.field6914 = var13.method1511(arg0 - 15962);
                            class88.field1252 = class480.field6914 > 0;
                            class298.field4535 = var13.method1511(-88);
                            class238.field3821 = var13.method1511(arg0 - 16017);
                            class371.field5532 = var13.method1511(arg0 - 15839);
                            class445.field6536 = var13.method1556(126);
                            class514.field7471 = class360.field5349.method2185(arg0 - 1732317295, class445.field6536);
                            class157.field2378 = var13.method1515((byte) 123);
                            class393.field5872 = var13.method1511(-24);
                            class237.field3809 = var13.method1511(97);
                            class4.field31 = var13.method1515((byte) 124) == 1;
                            class398.field5947.field2660 = class398.field5947.field2642 = var13.method1555((byte) -114);
                            class147.field2235 = new class424();
                            class147.field2235.field6307 = var13.method1511(-59);
                            if (class147.field2235.field6307 == 65535) {
                                class147.field2235.field6307 = -1;
                            }
                            class147.field2235.field6311 = var13.method1555((byte) -79);
                            if (class310.field4662 != class261.field4007 && class397.field5936 == class283.field4310) {
                                class283.field4310 = class147.field2235;
                            }
                            if (class310.field4662 != class125.field1855) {
                                class147.field2235.field6310 = class147.field2235.field6307 + 40000;
                                class147.field2235.field6312 = class147.field2235.field6307 + 50000;
                            }
                        } else {
                            return;
                        }
                        if ((!class363.field5366 || class80.field1143) && !class88.field1252) {
                            try {
                                class513.method3040("unzap", class360.field5349.field5199, 1360);
                            } catch (Throwable var30) {
                            }
                        } else {
                            try {
                                class513.method3040("zap", class360.field5349.field5199, 1360);
                            } catch (Throwable var32) {
                                if (class368.field5407) {
                                    try {
                                        class360.field5349.field5199.getAppletContext().showDocument(new URL(class360.field5349.field5199.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var29) {
                                    }
                                }
                            }
                        }
                        if (class310.field4662 == class125.field1855) {
                            try {
                                class513.method3040("loggedin", class360.field5349.field5199, arg0 ^ 0x3B6F);
                            } catch (Throwable var28) {
                            }
                        }
                        if (class6.field66 != 2 && class6.field66 != 3) {
                            class500.field7185 = 0;
                            class501.method2972(2, -2);
                            class209.method1451(true);
                            class74.method643(6, (byte) -14);
                            class289.field4354 = null;
                            return;
                        }
                        class500.field7185 = 11;
                    }
                    if (class500.field7185 == 11) {
                        if (class162.field2413.method1970(true) < 3) {
                            return;
                        }
                        class162.field2413.method1965(0, 3, (byte) -81, class238.field3819.field3572);
                        class500.field7185 = 12;
                    }
                    if (class500.field7185 == 12) {
                        class263 var25 = class238.field3819;
                        var25.field3556 = 0;
                        if (var25.method1752(29951)) {
                            if (class162.field2413.method1970(true) < 1) {
                                return;
                            }
                            class162.field2413.method1965(3, 1, (byte) -81, var25.field3572);
                        }
                        class289.field4354 = class318.method2044(0)[var25.method1758(arg0 - 15807)];
                        class142.field2164 = var25.method1511(95);
                        class500.field7185 = 10;
                    }
                    if (class500.field7185 == 10) {
                        if (class162.field2413.method1970(true) >= class142.field2164) {
                            class162.field2413.method1965(0, class142.field2164, (byte) -81, class238.field3819.field3572);
                            class238.field3819.field3556 = 0;
                            int var26 = class142.field2164;
                            class500.field7185 = 0;
                            class501.method2972(2, -2);
                            class424.method2650(arg0 ^ 0x3E70);
                            class108.method833(class238.field3819, false);
                            class136.field2073 = -1;
                            class421.method2627((byte) 96);
                            if (class238.field3819.field3556 != var26) {
                                throw new RuntimeException("lswp pos:" + class238.field3819.field3556 + " psize:" + var26);
                            }
                            class289.field4354 = null;
                        }
                    } else if (class500.field7185 == 14) {
                        if (class142.field2164 == -2) {
                            if (class162.field2413.method1970(true) < 2) {
                                return;
                            }
                            class162.field2413.method1965(0, 2, (byte) -81, class238.field3819.field3572);
                            class238.field3819.field3556 = 0;
                            class142.field2164 = class238.field3819.method1511(-35);
                        }
                        if (class162.field2413.method1970(true) >= class142.field2164) {
                            class162.field2413.method1965(0, class142.field2164, (byte) -81, class238.field3819.field3572);
                            class238.field3819.field3556 = 0;
                            class500.field7185 = 0;
                            int var27 = class142.field2164;
                            class501.method2972(15, -2);
                            class464.method2809(arg0 ^ 0x5926);
                            class108.method833(class238.field3819, false);
                            if (class238.field3819.field3556 != var27) {
                                throw new RuntimeException("lswpr pos:" + class238.field3819.field3556 + " psize:" + var27);
                            }
                            class289.field4354 = null;
                        }
                    }
                } else if (class162.field2413.method1970(true) >= 1) {
                    class100.field1432 = class162.field2413.method1968((byte) 62);
                    class500.field7185 = 9;
                }
            }
        } catch (IOException var34) {
            if (class162.field2413 != null) {
                class162.field2413.method1966(92);
                class162.field2413 = null;
            }
            if (class188.field2824 >= 1) {
                class500.field7185 = 0;
                class501.method2972(-4, arg0 ^ -15935);
                class325.method2071(true);
            } else {
                class10.field139 = 0;
                class500.field7185 = 1;
                class188.field2824++;
                if (class6.field66 == 2 || class6.field66 == 3) {
                    class283.field4310.field6308 = !class283.field4310.field6308;
                } else {
                    class12.field163.field6308 = !class12.field163.field6308;
                }
            }
        }
    }
}
