import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class378 extends class80 {

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field5318 = -1;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field5322 = 0;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "[I")
    public static int[] field5320;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static final void method2180(int arg0) {
        field5321++;
        if (class305.field4186 == 0 || class305.field4186 == 5) {
            return;
        }
        try {
            if (++class77.field1122 > 2000) {
                if (class117.field1578 != null) {
                    class117.field1578.method644(-117);
                    class117.field1578 = null;
                }
                if (class89.field1219 >= 1) {
                    class305.field4186 = 0;
                    class320.field4424 = -5;
                    return;
                }
                class305.field4186 = 1;
                class77.field1122 = 0;
                if (class85.field1172 == class33.field472) {
                    class85.field1172 = class325.field4460;
                } else {
                    class85.field1172 = class33.field472;
                }
                class89.field1219++;
            }
            if (class305.field4186 == 1) {
                class456.field6668 = class282.field3804.method2281(true, class85.field1172, class54.field751);
                class305.field4186 = 2;
            }
            if (class305.field4186 == 2) {
                if (class456.field6668.field5652 == 2) {
                    throw new IOException();
                }
                if (class456.field6668.field5652 != 1) {
                    return;
                }
                class117.field1578 = new class95((Socket) class456.field6668.field5654, class282.field3804);
                class456.field6668 = null;
                long var1 = class56.field770 = class162.method998((byte) 109, class247.field3445);
                class244.field3395.field5069 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class244.field3395.method2084(class255.field3539.field3043, false);
                class244.field3395.method2084(var3, false);
                class117.field1578.method643(class244.field3395.field5073, 2, -1, 0);
                class362.method2026(-2757);
                int var4 = class117.field1578.method650((byte) -118);
                class362.method2026(-2757);
                if (var4 != 0) {
                    class320.field4424 = var4;
                    class305.field4186 = 0;
                    class117.field1578.method644(-83);
                    class117.field1578 = null;
                    return;
                }
                class305.field4186 = 3;
            }
            if (class305.field4186 == 3) {
                if (class117.field1578.method645((byte) -94) < 8) {
                    return;
                }
                class117.field1578.method649(8, false, 0, class387.field5435.field5073);
                class387.field5435.field5069 = 0;
                class427.field6247 = class387.field5435.method2063(584310688);
                class365 var5 = new class365(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class427.field6247 >> 32), (int) class427.field6247 };
                var5.method2084(10, false);
                var5.method2074(false, var6[0]);
                var5.method2074(false, var6[1]);
                var5.method2074(false, var6[2]);
                var5.method2074(false, var6[3]);
                var5.method2076(class162.method998((byte) 109, class247.field3445), (byte) -124);
                var5.method2073(108, class24.field384);
                var5.method2110(false, class433.field6307, class54.field748);
                class244.field3395.field5069 = 0;
                if (class137.field1958 == 40) {
                    class244.field3395.method2084(class255.field3543.field3043, false);
                } else {
                    class244.field3395.method2084(class255.field3541.field3043, false);
                }
                class244.field3395.method2070(81954016, 0);
                int var7 = class244.field3395.field5069;
                class244.field3395.method2074(false, 586);
                class244.field3395.method2084(class140.field1995, false);
                class244.field3395.method2084(class448.method2641((byte) 41), false);
                class244.field3395.method2070(81954016, class177.field2513);
                class244.field3395.method2070(81954016, class351.field4795);
                class244.field3395.method2084(class437.field6374.field4280, false);
                class96.method653(0, class244.field3395);
                class244.field3395.method2073(-114, class41.field561);
                class244.field3395.method2074(false, class246.field3426);
                class365 var8 = class437.field6374.method559((byte) 77);
                class244.field3395.method2084(var8.field5069, false);
                class244.field3395.method2079(var8.field5069, var8.field5073, 107, 0);
                class164.field2341 = true;
                class244.field3395.method2070(81954016, class514.field7551);
                class244.field3395.method2074(false, class254.field3528.method1398((byte) -91));
                class244.field3395.method2074(false, class464.field6747.method1398((byte) -99));
                class244.field3395.method2074(false, class249.field3463.method1398((byte) -110));
                class244.field3395.method2074(false, class300.field4126.method1398((byte) -99));
                class244.field3395.method2074(false, class266.field3645.method1398((byte) -112));
                class244.field3395.method2074(false, class241.field3334.method1398((byte) -127));
                class244.field3395.method2074(false, class252.field3511.method1398((byte) -118));
                class244.field3395.method2074(false, class86.field1188.method1398((byte) -98));
                class244.field3395.method2074(false, class192.field2735.method1398((byte) -112));
                class244.field3395.method2074(false, class148.field2095.method1398((byte) -109));
                class244.field3395.method2074(false, class364.field5047.method1398((byte) -123));
                class244.field3395.method2074(false, client.field2802.method1398((byte) -119));
                class244.field3395.method2074(false, class348.field4773.method1398((byte) -93));
                class244.field3395.method2074(false, class103.field1412.method1398((byte) -127));
                class244.field3395.method2074(false, class63.field872.method1398((byte) -121));
                class244.field3395.method2074(false, class528.field7767.method1398((byte) -94));
                class244.field3395.method2074(false, class370.field5195.method1398((byte) -114));
                class244.field3395.method2074(false, class288.field3883.method1398((byte) -95));
                class244.field3395.method2074(false, class430.field6268.method1398((byte) -96));
                class244.field3395.method2074(false, class435.field6343.method1398((byte) -93));
                class244.field3395.method2074(false, class204.field2893.method1398((byte) -107));
                class244.field3395.method2074(false, class1.field16.method1398((byte) -122));
                class244.field3395.method2074(false, class156.field2225.method1398((byte) -96));
                class244.field3395.method2074(false, class87.field1193.method1398((byte) -117));
                class244.field3395.method2074(false, class274.field3727.method1398((byte) -103));
                class244.field3395.method2074(false, class418.field6120.method1398((byte) -96));
                class244.field3395.method2074(false, class322.field4448.method1398((byte) -111));
                class244.field3395.method2074(false, class104.field1415.method1398((byte) -110));
                class244.field3395.method2074(false, class261.field3593.method1398((byte) -113));
                class244.field3395.method2074(false, class91.field1226.method1398((byte) -107));
                class244.field3395.method2079(var5.field5069, var5.field5073, 91, 0);
                class244.field3395.method2060(class244.field3395.field5069 - var7, (byte) -74);
                class117.field1578.method643(class244.field3395.field5073, class244.field3395.field5069, -1, 0);
                class244.field3395.method2598(-500891966, var6);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class387.field5435.method2598(-500891966, var6);
                class305.field4186 = 4;
            }
            if (class305.field4186 == 4) {
                if (class117.field1578.method645((byte) -103) < 1) {
                    return;
                }
                int var10 = class117.field1578.method650((byte) -93);
                if (var10 == 21) {
                    class305.field4186 = 7;
                } else if (var10 == 29) {
                    class305.field4186 = 11;
                } else if (var10 == 1) {
                    class320.field4424 = var10;
                    class305.field4186 = 5;
                    return;
                } else if (var10 == 2) {
                    class305.field4186 = 8;
                } else if (var10 == 15) {
                    class305.field4186 = 12;
                    class438.field6394 = -2;
                } else if (var10 == 23 && class89.field1219 < 1) {
                    class89.field1219++;
                    class305.field4186 = 1;
                    class77.field1122 = 0;
                    class117.field1578.method644(-119);
                    class117.field1578 = null;
                    return;
                } else {
                    class305.field4186 = 0;
                    class320.field4424 = var10;
                    class117.field1578.method644(-101);
                    class117.field1578 = null;
                    return;
                }
            }
            if (arg0 <= 23) {
                method2181((byte) 92);
            }
            if (class305.field4186 == 6) {
                class244.field3395.field5069 = 0;
                class244.field3395.method2602(class255.field3542.field3043, (byte) 71);
                class117.field1578.method643(class244.field3395.field5073, class244.field3395.field5069, -1, 0);
                class305.field4186 = 4;
            } else if (class305.field4186 == 7) {
                if (class117.field1578.method645((byte) -111) >= 1) {
                    class329.field4489 = class117.field1578.method650((byte) -5) * 60 + 180;
                    class320.field4424 = 21;
                    class305.field4186 = 0;
                    class117.field1578.method644(-124);
                    class117.field1578 = null;
                }
            } else if (class305.field4186 != 11) {
                if (class305.field4186 == 8) {
                    if (class117.field1578.method645((byte) -107) < 13) {
                        return;
                    }
                    class117.field1578.method649(13, false, 0, class387.field5435.field5073);
                    class387.field5435.field5069 = 0;
                    class370.field5196 = class387.field5435.method2099(255);
                    class39.field533 = class387.field5435.method2099(255);
                    class319.field4412 = class387.field5435.method2099(255) == 1;
                    class374.field5223 = class387.field5435.method2099(255) == 1;
                    class99.field1368 = class387.field5435.method2099(255) == 1;
                    class99.field1366 = class387.field5435.method2099(255) == 1;
                    class202.field2880 = class387.field5435.method2062((byte) 14);
                    class220.field3082 = class387.field5435.method2099(255) == 1;
                    class123.field1689 = class387.field5435.method2099(255) == 1;
                    class82.field1154.method2120(class123.field1689, 106);
                    class75.field1097.method828(class123.field1689, true);
                    class398.field5549.method2811(class123.field1689, -111);
                    if ((!class319.field4412 || class99.field1368) && !class220.field3082) {
                        try {
                            class484.method2855(class282.field3804.field5516, "unzap", -29222);
                        } catch (Throwable var15) {
                        }
                    } else {
                        try {
                            class484.method2855(class282.field3804.field5516, "zap", -29222);
                        } catch (Throwable var16) {
                            if (class266.field3652) {
                                try {
                                    class282.field3804.field5516.getAppletContext().showDocument(new URL(class282.field3804.field5516.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var14) {
                                }
                            }
                        }
                    }
                    if (class528.field7773 == class175.field2498) {
                        try {
                            class484.method2855(class282.field3804.field5516, "loggedin", -29222);
                        } catch (Throwable var13) {
                        }
                    }
                    class305.field4186 = 10;
                }
                if (class305.field4186 == 10) {
                    if (class387.field5435.method2605(255)) {
                        if (class117.field1578.method645((byte) -105) < 1) {
                            return;
                        }
                        class117.field1578.method649(1, false, class387.field5435.field5069 + 2, class387.field5435.field5073);
                    }
                    class467.field6834 = class349.method1935(true)[class387.field5435.method2606((byte) -127)];
                    class438.field6394 = class387.field5435.method2062((byte) 14);
                    class305.field4186 = 9;
                }
                if (class305.field4186 == 9) {
                    if (class117.field1578.method645((byte) -108) >= class438.field6394) {
                        class117.field1578.method649(class438.field6394, false, 0, class387.field5435.field5073);
                        class387.field5435.field5069 = 0;
                        class305.field4186 = 0;
                        class320.field4424 = 2;
                        int var11 = class438.field6394;
                        class485.method2858(61);
                        class2.method9(class387.field5435, (byte) -44);
                        class446.field6464 = -1;
                        class292.method1676(22362);
                        if (class387.field5435.field5069 != var11) {
                            throw new RuntimeException("lswp pos:" + class387.field5435.field5069 + " psize:" + var11);
                        }
                        class467.field6834 = null;
                    }
                } else if (class305.field4186 == 12) {
                    if (class438.field6394 == -2) {
                        if (class117.field1578.method645((byte) -78) < 2) {
                            return;
                        }
                        class117.field1578.method649(2, false, 0, class387.field5435.field5073);
                        class387.field5435.field5069 = 0;
                        class438.field6394 = class387.field5435.method2062((byte) 14);
                    }
                    if (class117.field1578.method645((byte) -75) >= class438.field6394) {
                        class117.field1578.method649(class438.field6394, false, 0, class387.field5435.field5073);
                        class387.field5435.field5069 = 0;
                        class320.field4424 = 15;
                        class305.field4186 = 0;
                        int var12 = class438.field6394;
                        class489.method2869(-92);
                        class2.method9(class387.field5435, (byte) 74);
                        if (class387.field5435.field5069 != var12) {
                            throw new RuntimeException("lswpr pos:" + class387.field5435.field5069 + " psize:" + var12);
                        }
                        class467.field6834 = null;
                    }
                }
            } else if (class117.field1578.method645((byte) -117) >= 1) {
                class362.field4979 = class117.field1578.method650((byte) -98);
                class320.field4424 = 29;
                class305.field4186 = 0;
                class117.field1578.method644(-103);
                class117.field1578 = null;
            }
        } catch (IOException var17) {
            if (class117.field1578 != null) {
                class117.field1578.method644(-116);
                class117.field1578 = null;
            }
            if (class89.field1219 < 1) {
                class305.field4186 = 1;
                class89.field1219++;
                if (class85.field1172 == class33.field472) {
                    class85.field1172 = class325.field4460;
                } else {
                    class85.field1172 = class33.field472;
                }
                class77.field1122 = 0;
            } else {
                class320.field4424 = -4;
                class305.field4186 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static void method2181(byte arg0) {
        field5320 = null;
        int var1 = 74 / ((71 - arg0) / 54);
    }
}
