import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class792 extends class84 {

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "Lfba;")
    public static class27 field10889 = new class27(27, 7);

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "Z")
    public static boolean field10895 = false;

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
    public int field10888;

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
    public static int field10890;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
    public static int field10893;

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "I")
    public static int field10894;

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "Luaa;")
    public class126 field10891;

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "[B")
    public byte[] field10892;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "(B)[B")
    public final byte[] method638(byte arg0) {
        ++field10890;
        if (super.field930) {
            throw new RuntimeException();
        } else {
            int var2 = 94 / ((arg0 - -15) / 36);
            return this.field10892;
        }
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
    public static void method4363(int arg0) {
        if (arg0 != -15130) {
            field10889 = null;
        }
        field10889 = null;
    }

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "(B)I")
    public final int method641(byte arg0) {
        ++field10894;
        if (super.field930) {
            return 0;
        } else {
            if (arg0 != -14) {
                this.field10891 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "(B)V")
    public static final void method4364(byte arg0) {
        ++field10893;
        if (arg0 == 120) {
            if (~class632.field8877 != -1 && ~class632.field8877 != -11) {
                try {
                    short var1;
                    if (class66.field816 == 0) {
                        var1 = 250;
                    } else {
                        var1 = 2000;
                    }
                    if (class209.field3246 && ~class632.field8877 <= -7) {
                        var1 = 6000;
                    }
                    if (var1 < ++class277.field4034) {
                        if (class527.field7529 != null) {
                            class527.field7529.method612((byte) 122);
                            class527.field7529 = null;
                        }
                        if (class66.field816 >= 3) {
                            class632.field8877 = 0;
                            class757.method4204(-5, 1);
                            return;
                        }
                        if (class104.field1206 == 2) {
                            class5.field34.method417((byte) -48);
                        } else {
                            class680.field9439.method417((byte) -55);
                        }
                        class632.field8877 = 1;
                        class277.field4034 = 0;
                        ++class66.field816;
                    }
                    if (class632.field8877 == 1) {
                        if (~class104.field1206 == -3) {
                            class613.field8617 = class5.field34.method416(class519.field7328, false);
                        } else {
                            class613.field8617 = class680.field9439.method416(class519.field7328, false);
                        }
                        class632.field8877 = 2;
                    }
                    if (class632.field8877 == 2) {
                        if (~class613.field8617.field2089 == -3) {
                            throw new IOException();
                        }
                        if (~class613.field8617.field2089 != -2) {
                            return;
                        }
                        class527.field7529 = class256.method1665((Socket) class613.field8617.field2092, -115, 15000);
                        class613.field8617 = null;
                        class757.method4205((byte) 68);
                        class312 var2 = class45.method326((byte) -118);
                        if (!class209.field3246) {
                            var2.field4445.method2952(0, class763.field10505.field7314);
                        } else {
                            var2.field4445.method2952(0, class763.field10516.field7314);
                            var2.field4445.method2957(0, 1267307848);
                            int var3 = var2.field4445.field7042;
                            var2.field4445.method2959(650, (byte) -55);
                            if (class104.field1206 == 2) {
                                var2.field4445.method2952(0, class266.field3873 != 13 ? 0 : 1);
                            }
                            class494 var4 = class480.method2860(false);
                            var4.method2952(arg0 + -120, class449.field6142);
                            var4.method2957((int) (Math.random() * 9.9999999E7D), 1267307848);
                            var4.method2952(0, class140.field2081);
                            var4.method2959(class467.field6560, (byte) 92);
                            for (int var5 = 0; ~var5 > -7; ++var5) {
                                var4.method2959((int) (Math.random() * 9.9999999E7D), (byte) -45);
                            }
                            var4.method3003(class26.field393, (byte) 115);
                            var4.method2952(0, class60.field734.field3718);
                            var4.method2952(0, (int) (9.9999999E7D * Math.random()));
                            var4.method2949(class255.field3750, class167.field2638, 1866000624);
                            var2.field4445.method2936(arg0 + 9158, 0, var4.field7050, var4.field7042);
                            var2.field4445.method2937(-var3 + var2.field4445.field7042, (byte) 121);
                        }
                        class208.method1440(var2, 105);
                        class158.method1205((byte) -30);
                        class632.field8877 = 3;
                    }
                    if (~class632.field8877 == -4) {
                        if (!class527.field7529.method616(1, 0)) {
                            return;
                        }
                        class527.field7529.method620(0, arg0 + -225, class110.field1640.field7050, 1);
                        int var6 = 255 & class110.field1640.field7050[0];
                        if (var6 != 0) {
                            class632.field8877 = 0;
                            class757.method4204(var6, 1);
                            class527.field7529.method612((byte) -93);
                            class527.field7529 = null;
                            class107.method825((byte) -123);
                            return;
                        }
                        if (class209.field3246) {
                            class632.field8877 = 4;
                        } else {
                            class632.field8877 = 8;
                        }
                    }
                    if (class632.field8877 == 4) {
                        if (!class527.field7529.method616(2, arg0 ^ 120)) {
                            return;
                        }
                        class527.field7529.method620(0, 113, class110.field1640.field7050, 2);
                        class110.field1640.field7042 = 0;
                        class110.field1640.field7042 = class110.field1640.method2998(true);
                        class632.field8877 = 5;
                    }
                    if (~class632.field8877 == -6) {
                        if (!class527.field7529.method616(class110.field1640.field7042, 0)) {
                            return;
                        }
                        class527.field7529.method620(0, 81, class110.field1640.field7050, class110.field1640.field7042);
                        class110.field1640.method2939(31678, class343.field4788);
                        class110.field1640.field7042 = 0;
                        String var7 = class110.field1640.method3001((byte) 33);
                        class110.field1640.field7042 = 0;
                        String var8 = "opensn";
                        if (!class685.field9515 || ~class514.method3099(class519.field7328, true, var8, var7, 1).field2089 == -3) {
                            class60.method402(true, var8, 13687, class21.field353.field10098.method1588(-118) == 1, class519.field7328, var7);
                        }
                        class632.field8877 = 6;
                    }
                    if (~class632.field8877 == -7) {
                        if (!class527.field7529.method616(1, 0)) {
                            return;
                        }
                        class527.field7529.method620(0, -107, class110.field1640.field7050, 1);
                        if ((class110.field1640.field7050[0] & 255) == 1) {
                            class632.field8877 = 7;
                        }
                    }
                    if (~class632.field8877 == -8) {
                        if (!class527.field7529.method616(16, arg0 + -120)) {
                            return;
                        }
                        class527.field7529.method620(0, -111, class110.field1640.field7050, 16);
                        class110.field1640.field7042 = 16;
                        class110.field1640.method2939(31678, class343.field4788);
                        class110.field1640.field7042 = 0;
                        class691.field9661 = class459.field6419 = class288.method1856(class110.field1640.method3005(-40), 37);
                        class189.field2920 = class110.field1640.method3005(-86);
                        class632.field8877 = 8;
                    }
                    if (class632.field8877 == 8) {
                        class110.field1640.field7042 = 0;
                        class757.method4205((byte) 52);
                        class312 var9 = class45.method326((byte) -103);
                        class349 var10 = var9.field4445;
                        if (class104.field1206 == 2) {
                            class518 var11;
                            if (class209.field3246) {
                                var11 = class763.field10517;
                            } else {
                                var11 = class763.field10507;
                            }
                            var10.method2952(0, var11.field7314);
                            var10.method2957(0, 1267307848);
                            int var12 = var10.field7042;
                            int var13 = var10.field7042;
                            if (!class209.field3246) {
                                var10.method2959(650, (byte) 104);
                                var10.method2952(0, ~class266.field3873 != -14 ? 0 : 1);
                                int var14 = var10.field7042;
                                class494 var15 = class543.method3249(0);
                                var10.method2936(9278, 0, var15.field7050, var15.field7042);
                                var13 = var10.field7042;
                                var10.method2953(class691.field9661, -28136);
                            }
                            var10.method2952(arg0 ^ 120, class55.field709);
                            var10.method2952(0, class592.method3442((byte) -87));
                            var10.method2957(class428.field5825, arg0 ^ 1267307824);
                            var10.method2957(class714.field9895, 1267307848);
                            var10.method2952(0, class21.field353.field10070.method1629(-42));
                            class453.method2707((byte) 97, var10);
                            var10.method2953(class357.field5022, -28136);
                            var10.method2959(class467.field6560, (byte) 120);
                            class494 var16 = class21.field353.method4075(arg0 ^ 96);
                            var10.method2952(0, var16.field7042);
                            var10.method2936(9278, 0, var16.field7050, var16.field7042);
                            class768.field10567 = true;
                            class494 var17 = new class494(class716.field9938.method132(-102));
                            class716.field9938.method134(var17, 0);
                            var10.method2936(9278, 0, var17.field7050, var17.field7050.length);
                            var10.method2957(class234.field3518, arg0 + 1267307728);
                            var10.method3003(class243.field3624, (byte) 115);
                            var10.method2952(0, class12.field231 == null ? 0 : 1);
                            if (class12.field231 != null) {
                                var10.method2953(class12.field231, -28136);
                            }
                            var10.method2952(0, class54.method383("jagtheora", (byte) 88) ? 1 : 0);
                            var10.method2952(0, class685.field9515 ? 1 : 0);
                            class74.method587(var10, (byte) 5);
                            var10.method2963(class343.field4788, var13, 599866564, var10.field7042);
                            var10.method2937(-var12 + var10.field7042, (byte) 125);
                        } else {
                            class518 var18;
                            if (!class209.field3246) {
                                var18 = class763.field10509;
                            } else {
                                var18 = class763.field10517;
                            }
                            var10.method2952(0, var18.field7314);
                            var10.method2957(0, 1267307848);
                            int var19 = var10.field7042;
                            int var20 = var10.field7042;
                            if (!class209.field3246) {
                                var10.method2959(650, (byte) 105);
                                class494 var21 = class543.method3249(0);
                                var10.method2936(9278, 0, var21.field7050, var21.field7042);
                                var20 = var10.field7042;
                                var10.method2953(class691.field9661, arg0 + -28256);
                            }
                            var10.method2952(arg0 ^ 120, class60.field734.field3718);
                            var10.method2952(0, class140.field2081);
                            class453.method2707((byte) 80, var10);
                            var10.method2953(class357.field5022, arg0 ^ -28064);
                            var10.method2959(class467.field6560, (byte) -55);
                            class74.method587(var10, (byte) 5);
                            var10.method2963(class343.field4788, var20, arg0 ^ 599866556, var10.field7042);
                            var10.method2937(-var19 + var10.field7042, (byte) 127);
                        }
                        class208.method1440(var9, 93);
                        class158.method1205((byte) -30);
                        class87.field971 = new class377(class343.field4788);
                        for (int var22 = 0; var22 < 4; ++var22) {
                            class343.field4788[var22] += 50;
                        }
                        class110.field1640.method2208(-12010, class343.field4788);
                        class343.field4788 = null;
                        class632.field8877 = 9;
                    }
                    if (class632.field8877 == 9) {
                        if (!class527.field7529.method616(1, 0)) {
                            return;
                        }
                        class527.field7529.method620(0, arg0 + -245, class110.field1640.field7050, 1);
                        int var23 = class110.field1640.field7050[0] & 255;
                        if (~var23 == -22) {
                            class632.field8877 = 12;
                        } else if (var23 == 29) {
                            class632.field8877 = 18;
                        } else {
                            if (var23 == 1) {
                                class632.field8877 = 10;
                                class757.method4204(var23, 1);
                                return;
                            }
                            if (var23 == 2) {
                                class632.field8877 = 13;
                            } else {
                                if (var23 != 15) {
                                    if (~var23 == -24 && ~class66.field816 > -4) {
                                        class277.field4034 = 0;
                                        ++class66.field816;
                                        class632.field8877 = 1;
                                        class527.field7529.method612((byte) -6);
                                        class527.field7529 = null;
                                        return;
                                    }
                                    if (class246.field3648 && !class209.field3246 && ~class449.field6142 != 0 && ~var23 == -36) {
                                        class632.field8877 = 1;
                                        class209.field3246 = true;
                                        class277.field4034 = 0;
                                        class527.field7529.method612((byte) -4);
                                        class527.field7529 = null;
                                        return;
                                    }
                                    class632.field8877 = 0;
                                    class757.method4204(var23, 1);
                                    class527.field7529.method612((byte) -4);
                                    class527.field7529 = null;
                                    class107.method825((byte) -69);
                                    return;
                                }
                                class15.field293 = -2;
                                class632.field8877 = 19;
                            }
                        }
                    }
                    if (class632.field8877 == 11) {
                        class757.method4205((byte) 62);
                        class312 var24 = class45.method326((byte) -78);
                        class349 var25 = var24.field4445;
                        var25.method2213((byte) -92, class87.field971);
                        var25.method2210(-126, class763.field10513.field7314);
                        class208.method1440(var24, 33);
                        class158.method1205((byte) -30);
                        class632.field8877 = 9;
                    } else if (class632.field8877 == 12) {
                        if (class527.field7529.method616(1, arg0 + -120)) {
                            class527.field7529.method620(0, -101, class110.field1640.field7050, 1);
                            int var26 = class110.field1640.field7050[0] & 255;
                            class632.field8877 = 0;
                            class715.field9936 = var26 * 50;
                            class757.method4204(21, arg0 + -119);
                            class527.field7529.method612((byte) 111);
                            class527.field7529 = null;
                            class107.method825((byte) -128);
                        }
                    } else if (~class632.field8877 == -19) {
                        if (class527.field7529.method616(1, 0)) {
                            class527.field7529.method620(0, 24, class110.field1640.field7050, 1);
                            class596.field8370 = 255 & class110.field1640.field7050[0];
                            class632.field8877 = 0;
                            class757.method4204(29, 1);
                            class527.field7529.method612((byte) 104);
                            class527.field7529 = null;
                            class107.method825((byte) -128);
                        }
                    } else if (class632.field8877 == 13) {
                        if (class527.field7529.method616(1, arg0 ^ 120)) {
                            class527.field7529.method620(0, arg0 ^ -10, class110.field1640.field7050, 1);
                            class632.field8877 = 14;
                            class672.field9363 = 255 & class110.field1640.field7050[0];
                        }
                    } else {
                        if (class632.field8877 == 14) {
                            class349 var27 = class110.field1640;
                            if (class104.field1206 == 2) {
                                if (!class527.field7529.method616(class672.field9363, 0)) {
                                    return;
                                }
                                class527.field7529.method620(0, arg0 + -218, var27.field7050, class672.field9363);
                                var27.field7042 = 0;
                                class745.field10317 = var27.method2964((byte) 57);
                                class475.field6652 = var27.method2964((byte) 97);
                                class404.field5525 = var27.method2964((byte) 93) == 1;
                                class34.field466 = var27.method2964((byte) 121) == 1;
                                class685.field9483 = var27.method2964((byte) 125) == 1;
                                class338.field4740 = var27.method2964((byte) 48) == 1;
                                class250.field3689 = var27.method2998(true);
                                class678.field9432 = var27.method2964((byte) 39) == 1;
                                class725.field10027 = var27.method2956(false);
                                field10895 = ~var27.method2964((byte) 41) == -2;
                                class277.field4038.method3912(field10895, (byte) -111);
                                class313.field4456.method1675(-1579, field10895);
                                class575.field8103.method2444((byte) 123, field10895);
                            } else {
                                if (!class527.field7529.method616(class672.field9363, 0)) {
                                    return;
                                }
                                class527.field7529.method620(0, 34, var27.field7050, class672.field9363);
                                var27.field7042 = 0;
                                class745.field10317 = var27.method2964((byte) 81);
                                class475.field6652 = var27.method2964((byte) 102);
                                class404.field5525 = var27.method2964((byte) 48) == 1;
                                class34.field466 = var27.method2964((byte) 75) == 1;
                                class685.field9483 = ~var27.method2964((byte) 57) == -2;
                                class411.field5573 = var27.method3005(-52);
                                class588.field8295 = class411.field5573 - (class459.method2731(120) + var27.method3002(false));
                                int var28 = var27.method2964((byte) 41);
                                class243.field3620 = ~(2 & var28) != -1;
                                class678.field9432 = ~(1 & var28) != -1;
                                class558.field7943 = var27.method2976(arg0 ^ -6);
                                class457.field6403 = var27.method2998(true);
                                class190.field2944 = var27.method2998(true);
                                class86.field949 = var27.method2998(true);
                                class133.field2006 = var27.method2976(arg0 + -247);
                                class348.field4877 = class519.field7328.method2831(-117, class133.field2006);
                                class633.field8890 = var27.method2964((byte) 40);
                                class597.field8402 = var27.method2998(true);
                                class772.field10607 = var27.method2998(true);
                                class342.field4764 = var27.method2964((byte) 60) == 1;
                                class210.field3250.field9768 = class210.field3250.field9753 = class544.field7814 = var27.method3001((byte) -10);
                                class173.field2689 = var27.method2964((byte) 81);
                                class58.field733 = var27.method2976(-127);
                                class621.field8736 = ~var27.method2964((byte) 50) == -2;
                                class556.field7930 = new class63();
                                class556.field7930.field763 = var27.method2998(true);
                                if (~class556.field7930.field763 == -65536) {
                                    class556.field7930.field763 = -1;
                                }
                                class556.field7930.field760 = var27.method3001((byte) -121);
                                if (class622.field8739 != class300.field4326) {
                                    class556.field7930.field767 = class556.field7930.field763 + 40000;
                                    class556.field7930.field766 = class556.field7930.field763 + 50000;
                                }
                                if (class694.field9699 != class300.field4326 && (class394.field5419 != class300.field4326 || ~class745.field10317 > -3) && (class5.field34.method421(arg0 + 391, class277.field4037) || class5.field34.method421(511, class780.field10705))) {
                                    class564.method3328(false);
                                }
                            }
                            if ((!class404.field5525 || class685.field9483) && !class678.field9432) {
                                try {
                                    class323.method2083(-10217, "unzap", class319.field4527);
                                } catch (Throwable var33) {
                                }
                            } else {
                                try {
                                    class323.method2083(-10217, "zap", class319.field4527);
                                } catch (Throwable var35) {
                                    if (class13.field278) {
                                        try {
                                            class319.field4527.getAppletContext().showDocument(new URL(class319.field4527.getCodeBase(), "blank.ws"), "tbi");
                                        } catch (Exception var34) {
                                        }
                                    }
                                }
                            }
                            if (class622.field8739 == class300.field4326) {
                                try {
                                    class323.method2083(-10217, "loggedin", class319.field4527);
                                } catch (Throwable var32) {
                                }
                            }
                            if (class104.field1206 != 2) {
                                class632.field8877 = 0;
                                class757.method4204(2, arg0 ^ 121);
                                class771.method4254((byte) -107);
                                class225.method1539(false, 7);
                                class197.field3014 = null;
                                return;
                            }
                            class632.field8877 = 16;
                        }
                        if (class632.field8877 == 16) {
                            if (!class527.field7529.method616(3, 0)) {
                                return;
                            }
                            class527.field7529.method620(0, 123, class110.field1640.field7050, 3);
                            class632.field8877 = 17;
                        }
                        if (class632.field8877 == 17) {
                            class349 var29 = class110.field1640;
                            var29.field7042 = 0;
                            if (var29.method2214(true)) {
                                if (!class527.field7529.method616(1, arg0 ^ 120)) {
                                    return;
                                }
                                class527.field7529.method620(3, 103, var29.field7050, 1);
                            }
                            class197.field3014 = class258.method1685((byte) 8)[var29.method2215(23505)];
                            class15.field293 = var29.method2998(true);
                            class632.field8877 = 15;
                        }
                        if (~class632.field8877 == -16) {
                            if (class527.field7529.method616(class15.field293, arg0 ^ 120)) {
                                class527.field7529.method620(0, 99, class110.field1640.field7050, class15.field293);
                                class110.field1640.field7042 = 0;
                                class632.field8877 = 0;
                                int var30 = class15.field293;
                                class757.method4204(2, 1);
                                class541.method3242((byte) -117);
                                class539.method3237(class110.field1640, 21402);
                                class432.field5849 = -1;
                                if (class226.field3475 != class197.field3014) {
                                    class714.method4011(11);
                                } else {
                                    class389.method2417(255);
                                }
                                if (class110.field1640.field7042 != var30) {
                                    throw new RuntimeException("lswp pos:" + class110.field1640.field7042 + " psize:" + var30);
                                } else {
                                    class197.field3014 = null;
                                }
                            }
                        } else if (~class632.field8877 == -20) {
                            if (~class15.field293 == 1) {
                                if (!class527.field7529.method616(2, arg0 + -120)) {
                                    return;
                                }
                                class527.field7529.method620(0, arg0 ^ 28, class110.field1640.field7050, 2);
                                class110.field1640.field7042 = 0;
                                class15.field293 = class110.field1640.method2998(true);
                            }
                            if (class527.field7529.method616(class15.field293, 0)) {
                                class527.field7529.method620(0, 81, class110.field1640.field7050, class15.field293);
                                class110.field1640.field7042 = 0;
                                int var31 = class15.field293;
                                class632.field8877 = 0;
                                class757.method4204(15, arg0 ^ 121);
                                class96.method701((byte) 114);
                                class539.method3237(class110.field1640, arg0 ^ 21474);
                                if (class110.field1640.field7042 != var31) {
                                    throw new RuntimeException("lswpr pos:" + class110.field1640.field7042 + " psize:" + var31);
                                } else {
                                    class197.field3014 = null;
                                }
                            }
                        }
                    }
                } catch (IOException var36) {
                    if (class527.field7529 != null) {
                        class527.field7529.method612((byte) 94);
                        class527.field7529 = null;
                    }
                    if (~class66.field816 <= -4) {
                        class632.field8877 = 0;
                        class757.method4204(-4, 1);
                        class107.method825((byte) -55);
                    } else {
                        if (~class104.field1206 == -3) {
                            class5.field34.method417((byte) -107);
                        } else {
                            class680.field9439.method417((byte) -52);
                        }
                        ++class66.field816;
                        class632.field8877 = 1;
                        class277.field4034 = 0;
                    }
                }
            }
        }
    }
}
