import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class465 extends class9 {

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "Lhga;")
    public static class158 field6606 = new class158();

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(FB)V")
    public final void method268(float arg0, byte arg1) {
        if (arg1 > -89) {
            field6606 = null;
        }
        ++field6604;
        super.field549 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public static void method2777(byte arg0) {
        field6606 = null;
        if (arg0 < 3) {
            method2777((byte) 50);
        }
    }

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V")
    public static final void method2778(int arg0) {
        ++field6602;
        if (class183.field2942 != 0 && class183.field2942 != 6) {
            try {
                if (++class392.field5749 > 2000) {
                    if (class165.field2755 != null) {
                        class165.field2755.method481(true);
                        class165.field2755 = null;
                    }
                    if (class302.field4507 >= 2) {
                        class183.field2942 = 0;
                        class705.method3936(-5, false);
                        return;
                    }
                    if (class37.field1050 != 2 && class37.field1050 != 3) {
                        class246.field3710.method1963((byte) 104);
                    } else {
                        class394.field5757.method1963((byte) -106);
                    }
                    class392.field5749 = 0;
                    ++class302.field4507;
                    class183.field2942 = 1;
                }
                if (~class183.field2942 == -2) {
                    if (class37.field1050 != 2 && ~class37.field1050 != -4) {
                        class414.field6001 = class246.field3710.method1961(class604.field8775, 43594);
                    } else {
                        class414.field6001 = class394.field5757.method1961(class604.field8775, 43594);
                    }
                    class183.field2942 = 2;
                }
                if (class183.field2942 == 2) {
                    if (~class414.field6001.field6502 == -3) {
                        throw new IOException();
                    }
                    if (~class414.field6001.field6502 != -2) {
                        return;
                    }
                    class165.field2755 = class389.method2397(7500, 256, (Socket) class414.field6001.field6499);
                    class414.field6001 = null;
                    long var1 = class477.field6860 = class312.method2032(true, class362.field5384);
                    int var3 = (int) (var1 >> 16 & 31L);
                    class601.method3433(0);
                    class275 var4 = class86.method858(0);
                    var4.field4103.method693((byte) 106, class168.field2803.field1542);
                    var4.field4103.method693((byte) 106, var3);
                    class140.method1141(var4, 19321);
                    class469.method2804(true);
                    class183.field2942 = 3;
                }
                if (class183.field2942 == 3) {
                    if (!class165.field2755.method479(arg0 ^ 138, 1)) {
                        return;
                    }
                    class165.field2755.method480(class126.field2299.field1397, (byte) 100, 1, 0);
                    int var5 = 255 & class126.field2299.field1397[0];
                    if (~var5 != -1) {
                        class183.field2942 = 0;
                        class705.method3936(var5, false);
                        class165.field2755.method481(true);
                        class165.field2755 = null;
                        class139.method1138((byte) 40);
                        return;
                    }
                    class183.field2942 = 4;
                }
                if (~class183.field2942 == -5) {
                    if (!class165.field2755.method479(115, 8)) {
                        return;
                    }
                    class165.field2755.method480(class126.field2299.field1397, (byte) 74, 8, 0);
                    class126.field2299.field1393 = 0;
                    class108.field1875 = class126.field2299.method742(23386);
                    class61 var6 = new class61(518);
                    int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (9.9999999E7D * Math.random()), (int) (class108.field1875 >> 32), (int) class108.field1875 };
                    var6.method693((byte) 106, 10);
                    var6.method715(var7[0], 1949991176);
                    var6.method715(var7[1], 1949991176);
                    var6.method715(var7[2], 1949991176);
                    var6.method715(var7[3], arg0 + 1949990921);
                    var6.method738(123, class312.method2032(true, class362.field5384));
                    var6.method750(116, class284.field4229);
                    var6.method738(124, class350.field5249);
                    var6.method738(125, class550.field7802);
                    var6.method733(true, class648.field9343, class180.field2919);
                    class601.method3433(0);
                    class275 var8 = class86.method858(0);
                    class641 var9 = var8.field4103;
                    if (~class37.field1050 != -3 && ~class37.field1050 != -4) {
                        var9.method693((byte) 106, class168.field2811.field1542);
                        var9.method745(0, 128);
                        int var10 = var9.field1393;
                        var9.method715(620, 1949991176);
                        var9.method693((byte) 106, class78.field1573.field5796);
                        var9.method693((byte) 106, class140.field2466);
                        class642.method3659(var9, 0);
                        var9.method750(122, class422.field6110);
                        var9.method715(class292.field4385, 1949991176);
                        class251.method1680(var9, 334);
                        var9.method698(-119, var6.field1393, 0, var6.field1397);
                        var9.method712(-28471, -var10 + var9.field1393);
                    } else {
                        if (~class199.field3098 != -14) {
                            var9.method693((byte) 106, class168.field2808.field1542);
                        } else {
                            var9.method693((byte) 106, class168.field2810.field1542);
                        }
                        var9.method745(0, 128);
                        int var11 = var9.field1393;
                        var9.method715(620, 1949991176);
                        var9.method693((byte) 106, class163.field2735);
                        var9.method693((byte) 106, class601.method3434(true));
                        var9.method745(class506.field7173, 128);
                        var9.method745(class310.field4626, 128);
                        var9.method693((byte) 106, class527.field7429.field2671);
                        class642.method3659(var9, 0);
                        var9.method750(118, class422.field6110);
                        var9.method715(class292.field4385, 1949991176);
                        class61 var12 = new class61(class180.method1331(85));
                        class527.field7429.method1209(var12, -47);
                        var9.method693((byte) 106, var12.field1393);
                        var9.method698(-127, var12.field1393, 0, var12.field1397);
                        class33.field966 = true;
                        class61 var13 = new class61(class394.method2431(6406));
                        (new class113(true, class604.field8775)).method1011(var13, 1);
                        var9.method698(arg0 + -139, var13.field1397.length, 0, var13.field1397);
                        var9.method745(class130.field2351, arg0 + -127);
                        var9.method738(122, class77.field1564);
                        var9.method693((byte) 106, class635.field9133 != null ? 1 : 0);
                        if (class635.field9133 != null) {
                            var9.method750(118, class635.field9133);
                        }
                        class251.method1680(var9, 334);
                        var9.method698(arg0 + -181, var6.field1393, 0, var6.field1397);
                        var9.method712(-28471, -var11 + var9.field1393);
                    }
                    class140.method1141(var8, arg0 + 19066);
                    class469.method2804(true);
                    class395.field5772 = new class244(var7);
                    for (int var14 = 0; var14 < 4; ++var14) {
                        var7[var14] += 50;
                    }
                    class126.field2299.method3656(var7, arg0);
                    class183.field2942 = 5;
                }
                if (arg0 == 255) {
                    if (class183.field2942 == 5) {
                        if (!class165.field2755.method479(124, 1)) {
                            return;
                        }
                        class165.field2755.method480(class126.field2299.field1397, (byte) 82, 1, 0);
                        int var15 = class126.field2299.field1397[0] & 255;
                        if (var15 == 21) {
                            class183.field2942 = 8;
                        } else if (~var15 != -30) {
                            if (var15 == 1) {
                                class183.field2942 = 6;
                                class705.method3936(var15, false);
                                return;
                            }
                            if (var15 == 2) {
                                class183.field2942 = 9;
                            } else {
                                if (var15 != 15) {
                                    if (var15 == 23 && class302.field4507 < 2) {
                                        class183.field2942 = 1;
                                        ++class302.field4507;
                                        class392.field5749 = 0;
                                        class165.field2755.method481(true);
                                        class165.field2755 = null;
                                        return;
                                    }
                                    class183.field2942 = 0;
                                    class705.method3936(var15, false);
                                    class165.field2755.method481(true);
                                    class165.field2755 = null;
                                    class139.method1138((byte) 40);
                                    return;
                                }
                                class183.field2942 = 15;
                                class478.field6872 = -2;
                            }
                        } else {
                            class183.field2942 = 14;
                        }
                    }
                    if (class183.field2942 == 7) {
                        class601.method3433(0);
                        class275 var16 = class86.method858(0);
                        class641 var17 = var16.field4103;
                        var17.method3652(arg0 + -96799420, class395.field5772);
                        var17.method3654(-123, class168.field2818.field1542);
                        class140.method1141(var16, 19321);
                        class469.method2804(true);
                        class183.field2942 = 5;
                    } else if (class183.field2942 == 8) {
                        if (class165.field2755.method479(123, 1)) {
                            class165.field2755.method480(class126.field2299.field1397, (byte) 124, 1, 0);
                            int var18 = 255 & class126.field2299.field1397[0];
                            class531.field7452 = var18 * 60 + 180;
                            class183.field2942 = 0;
                            class705.method3936(21, false);
                            class165.field2755.method481(true);
                            class165.field2755 = null;
                            class139.method1138((byte) 40);
                        }
                    } else if (~class183.field2942 == -15) {
                        if (class165.field2755.method479(arg0 + -137, 1)) {
                            class165.field2755.method480(class126.field2299.field1397, (byte) 94, 1, 0);
                            class183.field2942 = 0;
                            class405.field5850 = 255 & class126.field2299.field1397[0];
                            class705.method3936(29, false);
                            class165.field2755.method481(true);
                            class165.field2755 = null;
                            class139.method1138((byte) 40);
                        }
                    } else if (class183.field2942 == 9) {
                        if (class165.field2755.method479(127, 1)) {
                            class165.field2755.method480(class126.field2299.field1397, (byte) 127, 1, 0);
                            class446.field6423 = 255 & class126.field2299.field1397[0];
                            class183.field2942 = 10;
                        }
                    } else {
                        if (class183.field2942 == 10) {
                            if (class37.field1050 != 3) {
                                class602.field8619 = false;
                            } else {
                                class602.field8619 = true;
                            }
                            class641 var19 = class126.field2299;
                            if (~class37.field1050 != -3 && ~class37.field1050 != -4) {
                                if (!class165.field2755.method479(116, class446.field6423)) {
                                    return;
                                }
                                class165.field2755.method480(var19.field1397, (byte) 75, class446.field6423, 0);
                                var19.field1393 = 0;
                                class249.field3737 = var19.method732(-559537960);
                                class460.field6564 = var19.method732(-559537960);
                                class301.field4474 = var19.method732(-559537960) == 1;
                                class231.field3466 = ~var19.method732(-559537960) == -2;
                                class46.field1130 = var19.method732(-559537960) == 1;
                                class246.field3708 = var19.method721(arg0 + -461515279);
                                class35.field1012 = class246.field3708 > 0;
                                class565.field8255 = var19.method723((byte) -25);
                                class393.field5752 = var19.method723((byte) -25);
                                class578.field8403 = var19.method723((byte) -25);
                                class460.field6565 = var19.method730(114);
                                class432.field6237 = class604.field8775.method405(class460.field6565, (byte) -80);
                                class147.field2550 = var19.method732(-559537960);
                                class444.field6387 = var19.method723((byte) -25);
                                class550.field7803 = var19.method723((byte) -25);
                                class389.field5681 = var19.method732(-559537960) == 1;
                                class532.field7456.field8631 = class532.field7456.field8657 = var19.method739(arg0 ^ -255);
                                class370.field5490 = var19.method732(-559537960);
                                class600.field8601 = var19.method730(arg0 ^ 155);
                                class180.field2911 = new class295();
                                class180.field2911.field4419 = var19.method723((byte) -25);
                                if (~class180.field2911.field4419 == -65536) {
                                    class180.field2911.field4419 = -1;
                                }
                                class180.field2911.field4425 = var19.method739(arg0 + -257);
                                if (class625.field9027 != class36.field1029) {
                                    class180.field2911.field4418 = 50000 - -class180.field2911.field4419;
                                    class180.field2911.field4414 = 40000 - -class180.field2911.field4419;
                                }
                                if (class625.field9027 != class281.field4177 && (class394.field5757.method1962(class513.field7242, 1) || class394.field5757.method1962(class366.field5432, 1))) {
                                    class113.method1014((byte) -46);
                                }
                            } else {
                                if (!class165.field2755.method479(arg0 + -137, class446.field6423)) {
                                    return;
                                }
                                class165.field2755.method480(var19.field1397, (byte) 96, class446.field6423, 0);
                                var19.field1393 = 0;
                                class249.field3737 = var19.method732(-559537960);
                                class460.field6564 = var19.method732(-559537960);
                                class301.field4474 = var19.method732(-559537960) == 1;
                                class231.field3466 = ~var19.method732(arg0 ^ -559538137) == -2;
                                class46.field1130 = ~var19.method732(arg0 + -559538215) == -2;
                                class436.field6299 = var19.method732(-559537960) == 1;
                                class422.field6096 = var19.method723((byte) -25);
                                class35.field1012 = ~var19.method732(-559537960) == -2;
                                class156.field2672 = var19.method751(255);
                                class294.field4411 = var19.method732(-559537960) == 1;
                                if (class37.field1050 == 3) {
                                    boolean var20 = var19.method732(arg0 ^ -559538137) == 1;
                                    if (var20) {
                                        long var21 = var19.method742(23386);
                                        String var23 = class424.method2586(var21, (byte) -42);
                                        int var24 = var19.method732(-559537960);
                                        byte[] var25 = new byte[var24];
                                        var19.method3651(0, -18797, var24, var25);
                                        String var26 = class323.method2079(59, var25);
                                        class263 var27 = null;
                                        try {
                                            class456 var28 = class604.field8775.method402("3", false, (byte) -3);
                                            while (var28.field6502 == 0) {
                                                class185.method1354(1L, 10);
                                            }
                                            if (~var28.field6502 == -2) {
                                                var27 = (class263) var28.field6499;
                                                int var29 = 12 + 2 + 3 + var23.length() + var26.length() + 3;
                                                if (class635.field9133 != null) {
                                                    var29 += 2 + class635.field9133.length();
                                                }
                                                if (var29 > 120) {
                                                    throw new RuntimeException(">120");
                                                }
                                                class61 var30 = new class61(1 - -var29);
                                                var30.method693((byte) 106, var29);
                                                var30.method693((byte) 106, 3);
                                                var30.method695(arg0 + -19618, var23);
                                                var30.method695(-19363, var26);
                                                var30.method745(class292.field4385, 128);
                                                var30.method738(125, class77.field1564);
                                                var30.method693((byte) 106, class635.field9133 != null ? 1 : 0);
                                                if (class635.field9133 != null) {
                                                    var30.method695(-19363, class635.field9133);
                                                }
                                                var30.method705((byte) 30);
                                                var27.method1724(var30.field1397, 0, var30.field1393, 0);
                                            }
                                        } catch (Exception var40) {
                                        }
                                        try {
                                            if (var27 != null) {
                                                var27.method1726((byte) -128);
                                            }
                                        } catch (Exception var38) {
                                        }
                                        try {
                                            class31.method507(13009, "demoaccountcreated", class416.field6017);
                                        } catch (Throwable var37) {
                                        }
                                    }
                                }
                                class237.field3521.method3521((byte) 20, class294.field4411);
                                class268.field3985.method252(class294.field4411, true);
                                class317.field4681.method812((byte) 102, class294.field4411);
                            }
                            if ((!class301.field4474 || class46.field1130) && !class35.field1012) {
                                try {
                                    class31.method507(13009, "unzap", class416.field6017);
                                } catch (Throwable var35) {
                                }
                            } else {
                                try {
                                    class31.method507(13009, "zap", class416.field6017);
                                } catch (Throwable var39) {
                                    if (class337.field5040) {
                                        try {
                                            class416.field6017.getAppletContext().showDocument(new URL(class416.field6017.getCodeBase(), "blank.ws"), "tbi");
                                        } catch (Exception var36) {
                                        }
                                    }
                                }
                            }
                            if (class625.field9027 == class36.field1029) {
                                try {
                                    class31.method507(arg0 ^ 12846, "loggedin", class416.field6017);
                                } catch (Throwable var34) {
                                }
                            }
                            if (~class37.field1050 != -3 && ~class37.field1050 != -4) {
                                class183.field2942 = 0;
                                class705.method3936(2, false);
                                class460.method2758(arg0 + -254);
                                class118.method1038(7, 1);
                                class25.field911 = null;
                                return;
                            }
                            class183.field2942 = 12;
                        }
                        if (~class183.field2942 == -13) {
                            if (!class165.field2755.method479(arg0 ^ 135, 3)) {
                                return;
                            }
                            class165.field2755.method480(class126.field2299.field1397, (byte) 89, 3, 0);
                            class183.field2942 = 13;
                        }
                        if (class183.field2942 == 13) {
                            class641 var31 = class126.field2299;
                            var31.field1393 = 0;
                            if (var31.method3653((byte) -81)) {
                                if (!class165.field2755.method479(118, 1)) {
                                    return;
                                }
                                class165.field2755.method480(var31.field1397, (byte) 116, 1, 3);
                            }
                            class25.field911 = class57.method669(25)[var31.method3658((byte) -10)];
                            class478.field6872 = var31.method723((byte) -25);
                            class183.field2942 = 11;
                        }
                        if (~class183.field2942 == -12) {
                            if (class165.field2755.method479(122, class478.field6872)) {
                                class165.field2755.method480(class126.field2299.field1397, (byte) 111, class478.field6872, 0);
                                class126.field2299.field1393 = 0;
                                class183.field2942 = 0;
                                int var32 = class478.field6872;
                                class705.method3936(2, false);
                                class470.method2823(76);
                                class90.method878(class126.field2299, (byte) -121);
                                class287.field4278 = -1;
                                if (class514.field7255 == class25.field911) {
                                    class454.method2735(122);
                                } else {
                                    class315.method2040((byte) 37);
                                }
                                if (~class126.field2299.field1393 != ~var32) {
                                    throw new RuntimeException("lswp pos:" + class126.field2299.field1393 + " psize:" + var32);
                                } else {
                                    class25.field911 = null;
                                }
                            }
                        } else if (class183.field2942 == 15) {
                            if (class478.field6872 == -2) {
                                if (!class165.field2755.method479(120, 2)) {
                                    return;
                                }
                                class165.field2755.method480(class126.field2299.field1397, (byte) 72, 2, 0);
                                class126.field2299.field1393 = 0;
                                class478.field6872 = class126.field2299.method723((byte) -25);
                            }
                            if (class165.field2755.method479(119, class478.field6872)) {
                                class165.field2755.method480(class126.field2299.field1397, (byte) 58, class478.field6872, 0);
                                class126.field2299.field1393 = 0;
                                class183.field2942 = 0;
                                int var33 = class478.field6872;
                                class705.method3936(15, false);
                                class423.method2576((byte) -56);
                                class90.method878(class126.field2299, (byte) -43);
                                if (~class126.field2299.field1393 != ~var33) {
                                    throw new RuntimeException("lswpr pos:" + class126.field2299.field1393 + " psize:" + var33);
                                } else {
                                    class25.field911 = null;
                                }
                            }
                        }
                    }
                }
            } catch (IOException var41) {
                if (class165.field2755 != null) {
                    class165.field2755.method481(true);
                    class165.field2755 = null;
                }
                if (~class302.field4507 <= -3) {
                    class183.field2942 = 0;
                    class705.method3936(-4, false);
                    class139.method1138((byte) 40);
                } else {
                    if (class37.field1050 != 2 && ~class37.field1050 != -4) {
                        class246.field3710.method1963((byte) -115);
                    } else {
                        class394.field5757.method1963((byte) 34);
                    }
                    ++class302.field4507;
                    class392.field5749 = 0;
                    class183.field2942 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2779(int arg0, int arg1) {
        ++field6603;
        String var2 = Integer.toString(arg1);
        for (int var3 = -3 + var2.length(); ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, -8 + var2.length()) + class265.field3908.method1733(255, class140.field2466) + " (" + var2 + ")</col>";
        } else {
            return ~var2.length() < arg0 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class265.field3910.method1733(255, class140.field2466) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIF)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)V")
    public final void method272(int arg0, int arg1, int arg2, int arg3) {
        ++field6605;
        super.field547 = arg3;
        if (arg2 != -1) {
            method2779(-62, 8);
        }
        super.field542 = arg1;
        super.field541 = arg0;
    }
}
