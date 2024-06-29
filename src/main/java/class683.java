import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class683 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[I")
    private int[] field9758;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[I")
    public static int[] field9757 = new int[3];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lvl;")
    public static class13 field9761;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method3868(int arg0) {
        field9761 = null;
        if (arg0 != -4204) {
            field9759 = -106;
        }
        field9757 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)I")
    public final int method3869(boolean arg0, int arg1) {
        field9756++;
        if (arg0) {
            return 124;
        }
        int var3 = (this.field9758.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field9758[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9758[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
    public static final boolean method3870(int arg0, int arg1, int arg2) {
        if (arg0 == 255) {
            field9755++;
            return class141.method990(arg1, arg2, -27160) | (arg2 & 0x70000) != 0 || class607.method3415(arg1, arg0 + 29710, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static final void method3871(int arg0) {
        field9760++;
        if (class521.field7090 == 0 || class521.field7090 == 6) {
            return;
        }
        try {
            if ((++class73.field982) > 2000) {
                if (class589.field8272 != null) {
                    class589.field8272.method1935(0);
                    class589.field8272 = null;
                }
                if (class130.field1862 >= 2) {
                    class521.field7090 = 0;
                    class31.method295(2, -5);
                    return;
                }
                if (class76.field997 == 2 || class76.field997 == 3) {
                    class651.field9040.method1209(37);
                } else {
                    class297.field4066.method1209(37);
                }
                class521.field7090 = 1;
                class130.field1862++;
                class73.field982 = 0;
            }
            if (class521.field7090 == 1) {
                if (class76.field997 == 2 || class76.field997 == 3) {
                    class357.field4739 = class651.field9040.method1206(class543.field7374, 37);
                } else {
                    class357.field4739 = class297.field4066.method1206(class543.field7374, 37);
                }
                class521.field7090 = 2;
            }
            if (class521.field7090 == 2) {
                if (class357.field4739.field948 == 2) {
                    throw new IOException();
                }
                if (class357.field4739.field948 != 1) {
                    return;
                }
                class589.field8272 = class76.method589((Socket) class357.field4739.field946, false, 7500);
                class357.field4739 = null;
                long var1 = client.field3731 = class664.method3757(-117, class473.field6503);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class418.method2429((byte) 2);
                class352 var4 = class555.method3114(-1);
                var4.field4686.method2817(class206.field2886.field6750, true);
                var4.field4686.method2817(var3, true);
                class602.method3388(var4, (byte) 28);
                class224.method1413((byte) 6);
                class521.field7090 = 3;
            }
            if (class521.field7090 == 3) {
                if (!class589.field8272.method1940(-5544, 1)) {
                    return;
                }
                class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                int var5 = class660.field9184.field6855[0] & 0xFF;
                if (var5 != 0) {
                    class521.field7090 = 0;
                    class31.method295(2, var5);
                    class589.field8272.method1935(0);
                    class589.field8272 = null;
                    class436.method2496(true);
                    return;
                }
                class521.field7090 = 4;
            }
            if (class521.field7090 == 4) {
                if (!class589.field8272.method1940(-5544, 8)) {
                    return;
                }
                class589.field8272.method1939(8, 0, class660.field9184.field6855, (byte) -93);
                class660.field9184.field6892 = 0;
                class696.field9887 = class660.field9184.method2849(-2);
                class501 var6 = new class501(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class696.field9887 >> 32), (int) class696.field9887 };
                var6.method2817(10, true);
                var6.method2836(var7[0], -22164);
                var6.method2836(var7[1], -22164);
                var6.method2836(var7[2], -22164);
                var6.method2836(var7[3], -22164);
                var6.method2834(class664.method3757(-58, class473.field6503), 115);
                var6.method2820(123, class627.field8691);
                var6.method2834(class130.field1860, 102);
                var6.method2834(class25.field309, 94);
                var6.method2824(class418.field5910, class181.field2618, true);
                class418.method2429((byte) 2);
                class352 var8 = class555.method3114(-1);
                class455 var9 = var8.field4686;
                if (class76.field997 == 2 || class76.field997 == 3) {
                    if (class285.field3921 == 13) {
                        var9.method2817(class206.field2891.field6750, true);
                    } else {
                        var9.method2817(class206.field2889.field6750, true);
                    }
                    var9.method2837(0, -2);
                    int var11 = var9.field6892;
                    var9.method2836(626, -22164);
                    var9.method2817(class124.field1793, true);
                    var9.method2817(class317.method1913(1), true);
                    var9.method2837(class222.field3096, -2);
                    var9.method2837(class340.field4553, -2);
                    var9.method2817(class366.field4875.field9347, true);
                    class23.method236(var9, 1);
                    var9.method2820(-114, class400.field5614);
                    var9.method2836(class254.field3462, -22164);
                    class501 var12 = new class501(class159.method1126(118));
                    class366.field4875.method3768((byte) 75, var12);
                    var9.method2817(var12.field6892, true);
                    var9.method2873(var12.field6892, 0, var12.field6855, -29981);
                    class186.field2709 = true;
                    class501 var13 = new class501(class652.field9066.method1303(false));
                    class652.field9066.method1306(var13, (byte) -85);
                    var9.method2873(var13.field6855.length, 0, var13.field6855, -29981);
                    var9.method2837(class442.field6115, -2);
                    var9.method2834(class365.field4859, 114);
                    var9.method2817(class316.field4350 == null ? 0 : 1, true);
                    if (class316.field4350 != null) {
                        var9.method2820(-56, class316.field4350);
                    }
                    class661.method3721(var9, false);
                    var9.method2873(var6.field6892, 0, var6.field6855, -29981);
                    var9.method2865(var9.field6892 - var11, (byte) 10);
                } else {
                    var9.method2817(class206.field2892.field6750, true);
                    var9.method2837(0, -2);
                    int var10 = var9.field6892;
                    var9.method2836(626, -22164);
                    var9.method2817(class219.field3065.field5857, true);
                    var9.method2817(class697.field9900, true);
                    class23.method236(var9, 1);
                    var9.method2820(110, class400.field5614);
                    var9.method2836(class254.field3462, -22164);
                    class661.method3721(var9, false);
                    var9.method2873(var6.field6892, 0, var6.field6855, -29981);
                    var9.method2865(var9.field6892 - var10, (byte) 10);
                }
                class602.method3388(var8, (byte) 28);
                class224.method1413((byte) 6);
                class199.field2836 = new class482(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class660.field9184.method2596((byte) 0, var7);
                class521.field7090 = 5;
            }
            if (class521.field7090 == 5) {
                if (!class589.field8272.method1940(-5544, 1)) {
                    return;
                }
                class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                int var15 = class660.field9184.field6855[0] & 0xFF;
                if (var15 == 21) {
                    class521.field7090 = 8;
                } else if (var15 == 29) {
                    class521.field7090 = 14;
                } else if (var15 == 1) {
                    class521.field7090 = 6;
                    class31.method295(2, var15);
                    return;
                } else if (var15 == 2) {
                    class521.field7090 = 9;
                } else if (var15 == 15) {
                    class95.field1338 = -2;
                    class521.field7090 = 15;
                } else if (var15 == 23 && class130.field1862 < 2) {
                    class73.field982 = 0;
                    class521.field7090 = 1;
                    class130.field1862++;
                    class589.field8272.method1935(0);
                    class589.field8272 = null;
                    return;
                } else {
                    class521.field7090 = 0;
                    class31.method295(2, var15);
                    class589.field8272.method1935(0);
                    class589.field8272 = null;
                    class436.method2496(true);
                    return;
                }
            }
            if (class521.field7090 == 7) {
                class418.method2429((byte) 2);
                class352 var16 = class555.method3114(-1);
                class455 var17 = var16.field4686;
                var17.method2589((byte) 82, class199.field2836);
                var17.method2588(-7065, class206.field2899.field6750);
                class602.method3388(var16, (byte) 28);
                class224.method1413((byte) 6);
                class521.field7090 = 5;
            } else if (class521.field7090 != 8) {
                if (arg0 < 84) {
                    field9759 = 71;
                }
                if (class521.field7090 == 14) {
                    if (class589.field8272.method1940(-5544, 1)) {
                        class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                        class676.field9655 = class660.field9184.field6855[0] & 0xFF;
                        class521.field7090 = 0;
                        class31.method295(2, 29);
                        class589.field8272.method1935(0);
                        class589.field8272 = null;
                        class436.method2496(true);
                    }
                } else if (class521.field7090 != 9) {
                    if (class521.field7090 == 10) {
                        class455 var19 = class660.field9184;
                        if (class76.field997 == 3) {
                            class410.field5834 = true;
                        } else {
                            class410.field5834 = false;
                        }
                        if (class76.field997 == 2 || class76.field997 == 3) {
                            if (!class589.field8272.method1940(-5544, class340.field4561)) {
                                return;
                            }
                            class589.field8272.method1939(class340.field4561, 0, var19.field6855, (byte) -93);
                            var19.field6892 = 0;
                            class296.field4060 = var19.method2874((byte) -75);
                            class455.field6311 = var19.method2874((byte) -75);
                            class173.field2517 = var19.method2874((byte) -75) == 1;
                            class5.field37 = var19.method2874((byte) -75) == 1;
                            class68.field926 = var19.method2874((byte) -75) == 1;
                            class511.field7018 = var19.method2874((byte) -75) == 1;
                            class409.field5813 = var19.method2845(-1);
                            class656.field9121 = var19.method2874((byte) -75) == 1;
                            class164.field2360 = var19.method2866(-8154);
                            class21.field239 = var19.method2874((byte) -75) == 1;
                            if (class76.field997 == 3) {
                                boolean var20 = var19.method2874((byte) -75) == 1;
                                if (var20) {
                                    long var21 = var19.method2849(-2);
                                    String var23 = class155.method1107(var21, 0);
                                    int var24 = var19.method2874((byte) -75);
                                    byte[] var25 = new byte[var24];
                                    var19.method2597(var24, 0, var25, false);
                                    String var26 = class627.method3504(var25, (byte) -64);
                                    class181 var27 = null;
                                    try {
                                        class70 var28 = class543.field7374.method763(false, (byte) 120, "3");
                                        while (var28.field948 == 0) {
                                            class519.method2960(117, 1L);
                                        }
                                        if (var28.field948 == 1) {
                                            var27 = (class181) var28.field946;
                                            int var29 = var23.length() + var26.length() + 5 + 8 + 3 + 2 + 2;
                                            if (class316.field4350 != null) {
                                                var29 += class316.field4350.length() + 2;
                                            }
                                            if (var29 > 120) {
                                                throw new RuntimeException(">120");
                                            }
                                            class501 var30 = new class501(var29 + 1);
                                            var30.method2817(var29, true);
                                            var30.method2817(3, true);
                                            var30.method2821((byte) -106, var23);
                                            var30.method2821((byte) -101, var26);
                                            var30.method2837(class254.field3462, -2);
                                            var30.method2834(class365.field4859, 114);
                                            var30.method2817(class316.field4350 == null ? 0 : 1, true);
                                            if (class316.field4350 != null) {
                                                var30.method2821((byte) -128, class316.field4350);
                                            }
                                            var30.method2872((byte) -55);
                                            var27.method1242(86, var30.field6855, var30.field6892, 0);
                                        }
                                    } catch (Exception var40) {
                                    }
                                    try {
                                        if (var27 != null) {
                                            var27.method1248(0);
                                        }
                                    } catch (Exception var38) {
                                    }
                                    try {
                                        class204.method1329((byte) -57, class59.field668, "demoaccountcreated");
                                    } catch (Throwable var37) {
                                    }
                                }
                            }
                            class475.field6543.method2686(30, class21.field239);
                            class599.field8366.method3958(class21.field239, 71);
                            class347.field4640.method2582(class21.field239, (byte) -120);
                        } else if (class589.field8272.method1940(-5544, class340.field4561)) {
                            class589.field8272.method1939(class340.field4561, 0, var19.field6855, (byte) -93);
                            var19.field6892 = 0;
                            class296.field4060 = var19.method2874((byte) -75);
                            class455.field6311 = var19.method2874((byte) -75);
                            class173.field2517 = var19.method2874((byte) -75) == 1;
                            class5.field37 = var19.method2874((byte) -75) == 1;
                            class68.field926 = var19.method2874((byte) -75) == 1;
                            class88.field1264 = var19.method2875(false);
                            class656.field9121 = class88.field1264 > 0;
                            class675.field9531 = var19.method2845(-1);
                            class91.field1315 = var19.method2845(-1);
                            class129.field1843 = var19.method2845(-1);
                            class389.field5512 = var19.method2840(false);
                            class166.field2421 = class543.field7374.method764(-23, class389.field5512);
                            class631.field8757 = var19.method2874((byte) -75);
                            class198.field2827 = var19.method2845(-1);
                            class23.field287 = var19.method2845(-1);
                            class479.field6590 = var19.method2874((byte) -75) == 1;
                            class143.field2063.field9693 = class143.field2063.field9682 = var19.method2839(true);
                            class365.field4860 = var19.method2874((byte) -75);
                            class590.field8284 = var19.method2840(false);
                            class696.field9895 = new class171();
                            class696.field9895.field2475 = var19.method2845(-1);
                            if (class696.field9895.field2475 == 65535) {
                                class696.field9895.field2475 = -1;
                            }
                            class696.field9895.field2472 = var19.method2839(true);
                            if (class603.field8404 != class164.field2358) {
                                class696.field9895.field2464 = class696.field9895.field2475 + 40000;
                                class696.field9895.field2479 = class696.field9895.field2475 + 50000;
                            }
                            if (class603.field8404 != class547.field7412 && (class651.field9040.method1203(class138.field1954, (byte) -37) || class651.field9040.method1203(class100.field1401, (byte) -37))) {
                                class64.method545((byte) 93);
                            }
                        } else {
                            return;
                        }
                        if ((!class173.field2517 || class68.field926) && !class656.field9121) {
                            try {
                                class204.method1329((byte) -57, class59.field668, "unzap");
                            } catch (Throwable var36) {
                            }
                        } else {
                            try {
                                class204.method1329((byte) -57, class59.field668, "zap");
                            } catch (Throwable var39) {
                                if (class372.field5014) {
                                    try {
                                        class59.field668.getAppletContext().showDocument(new URL(class59.field668.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var35) {
                                    }
                                }
                            }
                        }
                        if (class603.field8404 == class164.field2358) {
                            try {
                                class204.method1329((byte) -57, class59.field668, "loggedin");
                            } catch (Throwable var34) {
                            }
                        }
                        if (class76.field997 != 2 && class76.field997 != 3) {
                            class521.field7090 = 0;
                            class31.method295(2, 2);
                            class480.method2700(-127);
                            class178.method1232(7, (byte) -68);
                            class417.field5889 = null;
                            return;
                        }
                        class521.field7090 = 12;
                    }
                    if (class521.field7090 == 12) {
                        if (!class589.field8272.method1940(-5544, 3)) {
                            return;
                        }
                        class589.field8272.method1939(3, 0, class660.field9184.field6855, (byte) -93);
                        class521.field7090 = 13;
                    }
                    if (class521.field7090 == 13) {
                        class455 var31 = class660.field9184;
                        var31.field6892 = 0;
                        if (var31.method2587(true)) {
                            if (!class589.field8272.method1940(-5544, 1)) {
                                return;
                            }
                            class589.field8272.method1939(1, 3, var31.field6855, (byte) -93);
                        }
                        class417.field5889 = class178.method1234((byte) -109)[var31.method2591(1)];
                        class95.field1338 = var31.method2845(-1);
                        class521.field7090 = 11;
                    }
                    if (class521.field7090 == 11) {
                        if (class589.field8272.method1940(-5544, class95.field1338)) {
                            class589.field8272.method1939(class95.field1338, 0, class660.field9184.field6855, (byte) -93);
                            class660.field9184.field6892 = 0;
                            class521.field7090 = 0;
                            int var32 = class95.field1338;
                            class31.method295(2, 2);
                            class545.method3071((byte) 33);
                            class493.method2785((byte) 65, class660.field9184);
                            class452.field6238 = -1;
                            if (class417.field5889 == class291.field4001) {
                                class270.method1647(-9497);
                            } else {
                                class457.method2609((byte) -27);
                            }
                            if (class660.field9184.field6892 != var32) {
                                throw new RuntimeException("lswp pos:" + class660.field9184.field6892 + " psize:" + var32);
                            }
                            class417.field5889 = null;
                        }
                    } else if (class521.field7090 == 15) {
                        if (class95.field1338 == -2) {
                            if (!class589.field8272.method1940(-5544, 2)) {
                                return;
                            }
                            class589.field8272.method1939(2, 0, class660.field9184.field6855, (byte) -93);
                            class660.field9184.field6892 = 0;
                            class95.field1338 = class660.field9184.method2845(-1);
                        }
                        if (class589.field8272.method1940(-5544, class95.field1338)) {
                            class589.field8272.method1939(class95.field1338, 0, class660.field9184.field6855, (byte) -93);
                            class660.field9184.field6892 = 0;
                            class521.field7090 = 0;
                            int var33 = class95.field1338;
                            class31.method295(2, 15);
                            class91.method663(0);
                            class493.method2785((byte) 101, class660.field9184);
                            if (class660.field9184.field6892 != var33) {
                                throw new RuntimeException("lswpr pos:" + class660.field9184.field6892 + " psize:" + var33);
                            }
                            class417.field5889 = null;
                        }
                    }
                } else if (class589.field8272.method1940(-5544, 1)) {
                    class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                    class340.field4561 = class660.field9184.field6855[0] & 0xFF;
                    class521.field7090 = 10;
                }
            } else if (class589.field8272.method1940(-5544, 1)) {
                class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                int var18 = class660.field9184.field6855[0] & 0xFF;
                class521.field7090 = 0;
                class655.field9112 = var18 * 60 + 180;
                class31.method295(2, 21);
                class589.field8272.method1935(0);
                class589.field8272 = null;
                class436.method2496(true);
            }
        } catch (IOException var41) {
            if (class589.field8272 != null) {
                class589.field8272.method1935(0);
                class589.field8272 = null;
            }
            if (class130.field1862 >= 2) {
                class521.field7090 = 0;
                class31.method295(2, -4);
                class436.method2496(true);
            } else {
                if (class76.field997 == 2 || class76.field997 == 3) {
                    class651.field9040.method1209(37);
                } else {
                    class297.field4066.method1209(37);
                }
                class130.field1862++;
                class73.field982 = 0;
                class521.field7090 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "([I)V")
    public class683(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field9758 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field9758[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field9758[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field9758[var5 + var5] = arg0[var4];
            this.field9758[var5 + var5 + 1] = var4++;
        }
    }
}
