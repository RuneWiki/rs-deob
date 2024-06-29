import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class669 {

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "Ljava/lang/String;")
    public static String field9400 = null;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 3)
    public static void method3798(int arg0) {
        if (arg0 != 29) {
            method3799(-33);
        }
        field9400 = null;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 21)
    public static final void method3799(int arg0) {
        field9401++;
        if (class237.field3423 == 0 || class237.field3423 == 5) {
            return;
        }
        try {
            short var1;
            if (class554.field7895 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (++class76.field1022 > var1) {
                if (class76.field1025 != null) {
                    class76.field1025.method201(68);
                    class76.field1025 = null;
                }
                if (class554.field7895 >= 3) {
                    class237.field3423 = 0;
                    class399.method2423(201, -5);
                    return;
                }
                if (class544.field7651 == 2) {
                    class444.field6319.method2878(3128);
                } else {
                    class458.field6560.method2878(3128);
                }
                class554.field7895++;
                class237.field3423 = 1;
                class76.field1022 = 0;
            }
            if (class237.field3423 == 1) {
                if (class544.field7651 == 2) {
                    class744.field10365 = class444.field6319.method2876(-1, class27.field395);
                } else {
                    class744.field10365 = class458.field6560.method2876(-1, class27.field395);
                }
                class237.field3423 = 2;
            }
            if (class237.field3423 == 2) {
                if (class744.field10365.field5314 == 2) {
                    throw new IOException();
                }
                if (class744.field10365.field5314 != 1) {
                    return;
                }
                class76.field1025 = class325.method2110((Socket) class744.field10365.field5317, 15000, -1);
                class744.field10365 = null;
                class655.method3755((byte) 68);
                class731 var2 = class744.method4154((byte) 124);
                var2.field10211.method851((byte) -2, class17.field277.field8702);
                class533.method3088(var2, 0);
                class663.method3778(95);
                class237.field3423 = 3;
            }
            if (class237.field3423 == 3) {
                if (!class76.field1025.method199(1, (byte) 101)) {
                    return;
                }
                class76.field1025.method200(1, -30359, 0, class26.field371.field1556);
                int var3 = class26.field371.field1556[0] & 0xFF;
                if (var3 != 0) {
                    class237.field3423 = 0;
                    class399.method2423(201, var3);
                    class76.field1025.method201(121);
                    class76.field1025 = null;
                    class229.method1584(-4597);
                    return;
                }
                class26.field371.field1521 = 0;
                class120 var4 = new class120(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method851((byte) -2, 10);
                var4.method879((byte) 97, var5[0]);
                var4.method879((byte) -111, var5[1]);
                var4.method879((byte) 126, var5[2]);
                var4.method879((byte) 72, var5[3]);
                var4.method848(0L, true);
                var4.method880(true, class676.field9624);
                var4.method848(class530.field7517, true);
                var4.method848(class701.field9898, true);
                var4.method852(class728.field10191, class379.field5447, true);
                class655.method3755((byte) 68);
                class731 var6 = class744.method4154((byte) -99);
                class331 var7 = var6.field10211;
                if (class544.field7651 == 2) {
                    if (class757.field10456 == 13) {
                        var7.method851((byte) -2, class17.field284.field8702);
                    } else {
                        var7.method851((byte) -2, class17.field281.field8702);
                    }
                    var7.method860(0, (byte) 115);
                    int var10 = var7.field1521;
                    var7.method879((byte) 121, 644);
                    var7.method885(var4.field1556, -18983, var4.field1521, 0);
                    int var11 = var7.field1521;
                    var7.method880(true, class336.field4992);
                    var7.method851((byte) -2, class222.field3160);
                    var7.method851((byte) -2, class100.method704(0));
                    var7.method860(class638.field8980, (byte) 124);
                    var7.method860(class512.field7325, (byte) 124);
                    var7.method851((byte) -2, class145.field1852.field8991.method1399((byte) -40));
                    class165.method1286(var7, (byte) 112);
                    var7.method880(true, class491.field6979);
                    var7.method879((byte) -88, class87.field1139);
                    class120 var12 = class145.field1852.method3640(-5);
                    var7.method851((byte) -2, var12.field1521);
                    var7.method885(var12.field1556, -18983, var12.field1521, 0);
                    class399.field5669 = true;
                    class120 var13 = new class120(class357.field5197.method828(true));
                    class357.field5197.method829(var13, -4);
                    var7.method885(var13.field1556, -18983, var13.field1556.length, 0);
                    var7.method860(class92.field1197, (byte) 118);
                    var7.method848(class411.field5802, true);
                    var7.method851((byte) -2, class557.field7920 == null ? 0 : 1);
                    if (class557.field7920 != null) {
                        var7.method880(true, class557.field7920);
                    }
                    var7.method851((byte) -2, class438.method2647((byte) 67, "jagtheora") ? 1 : 0);
                    var7.method851((byte) -2, class777.field10722 ? 1 : 0);
                    class415.method2490(116, var7);
                    var7.method887(var5, var11, 127, var7.field1521);
                    var7.method844(var7.field1521 - var10, -1816748120);
                } else {
                    var7.method851((byte) -2, class17.field285.field8702);
                    var7.method860(0, (byte) 122);
                    int var8 = var7.field1521;
                    var7.method879((byte) -102, 644);
                    var7.method885(var4.field1556, -18983, var4.field1521, 0);
                    int var9 = var7.field1521;
                    var7.method880(true, class336.field4992);
                    var7.method851((byte) -2, class536.field7555.field1305);
                    var7.method851((byte) -2, class526.field7494);
                    class165.method1286(var7, (byte) 112);
                    var7.method880(true, class491.field6979);
                    var7.method879((byte) -96, class87.field1139);
                    class415.method2490(125, var7);
                    var7.method887(var5, var9, 60, var7.field1521);
                    var7.method844(var7.field1521 - var8, -1816748120);
                }
                class533.method3088(var6, 0);
                class663.method3778(114);
                class237.field3417 = new class476(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class26.field371.method2141((byte) -108, var5);
                class237.field3423 = 4;
            }
            if (class237.field3423 == 4) {
                if (!class76.field1025.method199(1, (byte) 101)) {
                    return;
                }
                class76.field1025.method200(1, -30359, 0, class26.field371.field1556);
                int var15 = class26.field371.field1556[0] & 0xFF;
                if (var15 == 21) {
                    class237.field3423 = 7;
                } else if (var15 == 29) {
                    class237.field3423 = 13;
                } else if (var15 == 1) {
                    class237.field3423 = 5;
                    class399.method2423(201, var15);
                    return;
                } else if (var15 == 2) {
                    class237.field3423 = 8;
                } else if (var15 == 15) {
                    class440.field6294 = -2;
                    class237.field3423 = 14;
                } else if (var15 == 23 && class554.field7895 < 3) {
                    class554.field7895++;
                    class237.field3423 = 1;
                    class76.field1022 = 0;
                    class76.field1025.method201(-74);
                    class76.field1025 = null;
                    return;
                } else {
                    class237.field3423 = 0;
                    class399.method2423(201, var15);
                    class76.field1025.method201(91);
                    class76.field1025 = null;
                    class229.method1584(-4597);
                    return;
                }
            }
            if (class237.field3423 == 6) {
                class655.method3755((byte) 68);
                class731 var16 = class744.method4154((byte) 125);
                class331 var17 = var16.field10211;
                var17.method2135(class237.field3417, 0);
                var17.method2140(class17.field289.field8702, -23703);
                class533.method3088(var16, 0);
                class663.method3778(127);
                class237.field3423 = 4;
            } else if (class237.field3423 == 7) {
                if (class76.field1025.method199(1, (byte) 101)) {
                    class76.field1025.method200(1, -30359, 0, class26.field371.field1556);
                    int var18 = class26.field371.field1556[0] & 0xFF;
                    class388.field5533 = var18 * 50;
                    class237.field3423 = 0;
                    class399.method2423(201, 21);
                    class76.field1025.method201(121);
                    class76.field1025 = null;
                    class229.method1584(-4597);
                }
            } else if (class237.field3423 == 13) {
                if (class76.field1025.method199(1, (byte) 101)) {
                    class76.field1025.method200(1, -30359, 0, class26.field371.field1556);
                    class9.field152 = class26.field371.field1556[0] & 0xFF;
                    class237.field3423 = 0;
                    class399.method2423(201, 29);
                    class76.field1025.method201(55);
                    class76.field1025 = null;
                    class229.method1584(-4597);
                }
            } else if (class237.field3423 != 8) {
                if (class237.field3423 == 9) {
                    class331 var19 = class26.field371;
                    if (class544.field7651 == 2) {
                        if (!class76.field1025.method199(class683.field9709, (byte) 101)) {
                            return;
                        }
                        class76.field1025.method200(class683.field9709, -30359, 0, var19.field1556);
                        var19.field1521 = 0;
                        class282.field4334 = var19.method842(2384);
                        class244.field3505 = var19.method842(2384);
                        class724.field10150 = var19.method842(2384) == 1;
                        class542.field7600 = var19.method842(2384) == 1;
                        class426.field6001 = var19.method842(2384) == 1;
                        class365.field5272 = var19.method842(2384) == 1;
                        class223.field3199 = var19.method898((byte) -127);
                        class279.field3936 = var19.method842(2384) == 1;
                        class377.field5417 = var19.method841(22551);
                        class100.field1266 = var19.method842(2384) == 1;
                        class496.field7061.method322(-58, class100.field1266);
                        class526.field7490.method3564(0, class100.field1266);
                        class21.field322.method1465(-1010, class100.field1266);
                    } else if (class76.field1025.method199(class683.field9709, (byte) 101)) {
                        class76.field1025.method200(class683.field9709, -30359, 0, var19.field1556);
                        var19.field1521 = 0;
                        class282.field4334 = var19.method842(2384);
                        class244.field3505 = var19.method842(2384);
                        class724.field10150 = var19.method842(2384) == 1;
                        class542.field7600 = var19.method842(2384) == 1;
                        class426.field6001 = var19.method842(2384) == 1;
                        class581.field8251 = var19.method834(-8616);
                        class208.field3033 = class581.field8251 - (class109.method731(60) + var19.method866(100));
                        int var20 = var19.method842(2384);
                        class752.field10425 = (var20 & 0x2) != 0;
                        class279.field3936 = (var20 & 0x1) != 0;
                        class478.field6786 = var19.method871(23995);
                        class410.field5794 = var19.method898((byte) -95);
                        class493.field7008 = var19.method898((byte) -121);
                        class571.field8096 = var19.method898((byte) -81);
                        class303.field4543 = var19.method871(23995);
                        class125.field1645 = class27.field395.method3418(class303.field4543, 570795760);
                        class549.field7738 = var19.method842(2384);
                        class273.field3804 = var19.method898((byte) -124);
                        class575.field8134 = var19.method898((byte) -98);
                        class617.field8710 = var19.method842(2384) == 1;
                        class251.field3549.field7955 = class251.field3549.field7958 = class511.field7309 = var19.method874(-1);
                        class512.field7326 = var19.method842(2384);
                        class299.field4500 = var19.method871(23995);
                        class747.field10382 = var19.method842(2384) == 1;
                        class603.field8489 = new class492();
                        class603.field8489.field6989 = var19.method898((byte) -100);
                        if (class603.field8489.field6989 == 65535) {
                            class603.field8489.field6989 = -1;
                        }
                        class603.field8489.field6987 = var19.method874(-1);
                        if (class256.field3599 != class177.field2704) {
                            class603.field8489.field6984 = class603.field8489.field6989 + 50000;
                            class603.field8489.field6980 = class603.field8489.field6989 + 40000;
                        }
                        if (class543.field7609 != class256.field3599 && (class256.field3599 != class180.field2730 || class282.field4334 < 2) && (class444.field6319.method2874(class190.field2837, 443) || class444.field6319.method2874(class775.field10674, 443))) {
                            class587.method3406((byte) -43);
                        }
                    } else {
                        return;
                    }
                    if ((!class724.field10150 || class426.field6001) && !class279.field3936) {
                        try {
                            class150.method1035(-19253, "unzap", class535.field7544);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class150.method1035(-19253, "zap", class535.field7544);
                        } catch (Throwable var27) {
                            if (class395.field5587) {
                                try {
                                    class535.field7544.getAppletContext().showDocument(new URL(class535.field7544.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var26) {
                                }
                            }
                        }
                    }
                    if (class256.field3599 == class177.field2704) {
                        try {
                            class150.method1035(-19253, "loggedin", class535.field7544);
                        } catch (Throwable var24) {
                        }
                    }
                    if (class544.field7651 != 2) {
                        class237.field3423 = 0;
                        class399.method2423(201, 2);
                        class474.method2799(false);
                        class374.method2323(7, (byte) -45);
                        class746.field10375 = null;
                        return;
                    }
                    class237.field3423 = 11;
                }
                if (class237.field3423 == 11) {
                    if (!class76.field1025.method199(3, (byte) 101)) {
                        return;
                    }
                    class76.field1025.method200(3, -30359, 0, class26.field371.field1556);
                    class237.field3423 = 12;
                }
                if (class237.field3423 == 12) {
                    class331 var21 = class26.field371;
                    var21.field1521 = 0;
                    if (var21.method2144(-88)) {
                        if (!class76.field1025.method199(1, (byte) 101)) {
                            return;
                        }
                        class76.field1025.method200(1, -30359, 3, var21.field1556);
                    }
                    class746.field10375 = class155.method1225((byte) 71)[var21.method2142(false)];
                    class440.field6294 = var21.method898((byte) -115);
                    class237.field3423 = 10;
                }
                if (class237.field3423 == 10) {
                    if (class76.field1025.method199(class440.field6294, (byte) 101)) {
                        class76.field1025.method200(class440.field6294, -30359, 0, class26.field371.field1556);
                        class26.field371.field1521 = 0;
                        int var22 = class440.field6294;
                        class237.field3423 = 0;
                        class399.method2423(201, 2);
                        class91.method649((byte) -126);
                        class82.method605(class26.field371, 2048);
                        class388.field5531 = -1;
                        if (class746.field10375 == class744.field10361) {
                            class272.method1771((byte) 85);
                        } else {
                            class369.method2290(-21791);
                        }
                        if (class26.field371.field1521 != var22) {
                            throw new RuntimeException("lswp pos:" + class26.field371.field1521 + " psize:" + var22);
                        }
                        class746.field10375 = null;
                    }
                } else if (class237.field3423 == 14) {
                    if (class440.field6294 == -2) {
                        if (!class76.field1025.method199(2, (byte) 101)) {
                            return;
                        }
                        class76.field1025.method200(2, -30359, 0, class26.field371.field1556);
                        class26.field371.field1521 = 0;
                        class440.field6294 = class26.field371.method898((byte) -108);
                    }
                    if (class76.field1025.method199(class440.field6294, (byte) 101)) {
                        class76.field1025.method200(class440.field6294, -30359, 0, class26.field371.field1556);
                        class26.field371.field1521 = 0;
                        class237.field3423 = 0;
                        int var23 = class440.field6294;
                        class399.method2423(201, 15);
                        class305.method2008((byte) -59);
                        class82.method605(class26.field371, 2048);
                        if (class26.field371.field1521 != var23) {
                            throw new RuntimeException("lswpr pos:" + class26.field371.field1521 + " psize:" + var23);
                        }
                        class746.field10375 = null;
                    }
                } else if (arg0 <= 45) {
                    method3799(-79);
                }
            } else if (class76.field1025.method199(1, (byte) 101)) {
                class76.field1025.method200(1, -30359, 0, class26.field371.field1556);
                class683.field9709 = class26.field371.field1556[0] & 0xFF;
                class237.field3423 = 9;
            }
        } catch (IOException var28) {
            if (class76.field1025 != null) {
                class76.field1025.method201(-102);
                class76.field1025 = null;
            }
            if (class554.field7895 < 3) {
                if (class544.field7651 == 2) {
                    class444.field6319.method2878(3128);
                } else {
                    class458.field6560.method2878(3128);
                }
                class237.field3423 = 1;
                class76.field1022 = 0;
                class554.field7895++;
            } else {
                class237.field3423 = 0;
                class399.method2423(201, -4);
                class229.method1584(-4597);
            }
        }
    }
}
