import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class389 extends class337 {

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Lpda;")
    private class535 field5133;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "Lam;")
    private class538 field5134;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "Lui;")
    public static class193 field5136 = new class193();

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "Lvj;")
    public static class373 field5145 = new class373(42, 8);

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field5147 = 0;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "[I")
    public static int[] field5148 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    public static final void method2234(int arg0) {
        ++field5138;
        if (class197.field2381 != 0 && class197.field2381 != 6) {
            try {
                if (~(++class15.field119) < -2001) {
                    if (class597.field8642 != null) {
                        class597.field8642.method2266((byte) -121);
                        class597.field8642 = null;
                    }
                    if (~class583.field8482 <= -2) {
                        class197.field2381 = 0;
                        class19.method130((byte) 102, -5);
                        return;
                    }
                    if (~class91.field1121 != -3 && class91.field1121 != 3) {
                        class592.field8605.field2719 = !class592.field8605.field2719;
                    } else {
                        class237.field2960.field2719 = !class237.field2960.field2719;
                    }
                    class197.field2381 = 1;
                    class15.field119 = 0;
                    ++class583.field8482;
                }
                if (~class197.field2381 == -2) {
                    if (class91.field1121 != 2 && class91.field1121 != 3) {
                        class396.field5228 = class74.field873.method924(class592.field8605.method1268(false), class592.field8605.field2713, 1);
                    } else {
                        class396.field5228 = class74.field873.method924(class237.field2960.method1268(false), class237.field2960.field2713, 1);
                    }
                    class197.field2381 = 2;
                }
                if (~class197.field2381 == -3) {
                    if (class396.field5228.field7031 == 2) {
                        throw new IOException();
                    }
                    if (class396.field5228.field7031 != 1) {
                        return;
                    }
                    class597.field8642 = class351.method1953(5000, (byte) 58, (Socket) class396.field5228.field7030);
                    class396.field5228 = null;
                    long var1 = class157.field1917 = class348.method1943(97, class249.field3184);
                    class136.field1663.field4966 = 0;
                    int var3 = (int) (31L & var1 >> 16);
                    class136.field1663.method2093(class368.field4837.field3279, -127);
                    class136.field1663.method2093(var3, -124);
                    class597.field8642.method2264(0, 0, class136.field1663.field4929, 2);
                    class197.field2381 = 3;
                }
                if (class197.field2381 == 3) {
                    if (!class597.field8642.method2268((byte) -95, 1)) {
                        return;
                    }
                    class597.field8642.method2270(class532.field7483.field4929, 1, 0, false);
                    int var4 = class532.field7483.field4929[0] & 255;
                    if (var4 != 0) {
                        class197.field2381 = 0;
                        class19.method130((byte) 107, var4);
                        class597.field8642.method2266((byte) 109);
                        class597.field8642 = null;
                        class618.method3553(65535);
                        return;
                    }
                    class197.field2381 = 4;
                }
                if (~class197.field2381 == -5) {
                    if (!class597.field8642.method2268((byte) -95, 8)) {
                        return;
                    }
                    class597.field8642.method2270(class532.field7483.field4929, 8, 0, false);
                    class532.field7483.field4966 = 0;
                    class395.field5223 = class532.field7483.method2107(-59);
                    class374 var5 = new class374(518);
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class395.field5223 >> 32), (int) class395.field5223 };
                    var5.method2093(10, -114);
                    var5.method2131(var6[0], -1495157560);
                    var5.method2131(var6[1], -1495157560);
                    var5.method2131(var6[2], -1495157560);
                    var5.method2131(var6[3], -1495157560);
                    var5.method2094(class348.method1943(97, class249.field3184), -20439);
                    var5.method2106(-87, class571.field8376);
                    var5.method2094(class66.field637, -20439);
                    var5.method2094(class185.field2241, -20439);
                    var5.method2099((byte) 91, class605.field8725, class333.field4318);
                    class484 var7 = class136.field1663;
                    var7.field4966 = 0;
                    if (class91.field1121 != 2 && class91.field1121 != 3) {
                        var7.method2093(class368.field4847.field3279, -107);
                        var7.method2115(0, 3324);
                        int var8 = var7.field4966;
                        var7.method2131(605, -1495157560);
                        var7.method2093(class341.field4399.field7268, -114);
                        var7.method2093(class31.field247, -103);
                        class449.method2628(var7, (byte) -47);
                        var7.method2106(-70, class22.field153);
                        var7.method2131(class95.field1177, -1495157560);
                        class80.method466(0);
                        var7.method2096(-70, 0, var5.field4966, var5.field4929);
                        var7.method2146(-var8 + var7.field4966, (byte) 27);
                    } else {
                        if (class137.field1671 == 12) {
                            var7.method2093(class368.field4846.field3279, -106);
                        } else {
                            var7.method2093(class368.field4844.field3279, -125);
                        }
                        var7.method2115(0, 3324);
                        int var9 = var7.field4966;
                        var7.method2131(605, -1495157560);
                        var7.method2093(class184.field2230, -111);
                        var7.method2093(class99.method608(false), -127);
                        var7.method2115(class185.field2239, 3324);
                        var7.method2115(class426.field5495, 3324);
                        var7.method2093(class565.field8299.field2170, -105);
                        class449.method2628(var7, (byte) -47);
                        var7.method2106(-100, class22.field153);
                        var7.method2131(class95.field1177, -1495157560);
                        class374 var10 = new class374(class593.method3442(false));
                        class565.field8299.method991(var10, true);
                        var7.method2093(var10.field4966, -124);
                        var7.method2096(-28, 0, var10.field4966, var10.field4929);
                        class74.field865 = true;
                        class374 var11 = new class374(class64.method369((byte) 70));
                        (new class89(true, class74.field873)).method532(var11, 119);
                        var7.method2096(-54, 0, var11.field4929.length, var11.field4929);
                        var7.method2115(class567.field8326, 3324);
                        class80.method466(0);
                        var7.method2096(-59, 0, var5.field4966, var5.field4929);
                        var7.method2146(-var9 + var7.field4966, (byte) 27);
                    }
                    class597.field8642.method2264(0, 0, var7.field4929, var7.field4966);
                    var7.method2807(var6, (byte) -124);
                    for (int var12 = 0; ~var12 > -5; ++var12) {
                        var6[var12] += 50;
                    }
                    class532.field7483.method2807(var6, (byte) 109);
                    class197.field2381 = 5;
                }
                if (~class197.field2381 == -6) {
                    if (!class597.field8642.method2268((byte) -95, 1)) {
                        return;
                    }
                    class597.field8642.method2270(class532.field7483.field4929, 1, 0, false);
                    int var13 = class532.field7483.field4929[0] & 255;
                    if (var13 != 21) {
                        if (~var13 != -30) {
                            if (~var13 == -2) {
                                class197.field2381 = 6;
                                class19.method130((byte) 125, var13);
                                return;
                            }
                            if (~var13 != -3) {
                                if (var13 != 15) {
                                    if (var13 == 23 && class583.field8482 < 1) {
                                        class15.field119 = 0;
                                        ++class583.field8482;
                                        class197.field2381 = 1;
                                        class597.field8642.method2266((byte) -55);
                                        class597.field8642 = null;
                                        return;
                                    }
                                    class197.field2381 = 0;
                                    class19.method130((byte) 111, var13);
                                    class597.field8642.method2266((byte) 115);
                                    class597.field8642 = null;
                                    class618.method3553(65535);
                                    return;
                                }
                                class445.field6138 = -2;
                                class197.field2381 = 15;
                            } else {
                                class197.field2381 = 9;
                            }
                        } else {
                            class197.field2381 = 14;
                        }
                    } else {
                        class197.field2381 = 8;
                    }
                }
                if (~class197.field2381 == -8) {
                    class136.field1663.field4966 = 0;
                    class136.field1663.method2804(class368.field4854.field3279, 30979);
                    class597.field8642.method2264(0, 0, class136.field1663.field4929, class136.field1663.field4966);
                    class197.field2381 = 5;
                } else if (class197.field2381 == 8) {
                    if (class597.field8642.method2268((byte) -95, 1)) {
                        class597.field8642.method2270(class532.field7483.field4929, 1, 0, false);
                        int var14 = class532.field7483.field4929[0] & 255;
                        class197.field2381 = 0;
                        class64.field635 = (var14 + 3) * 60;
                        class19.method130((byte) 97, 21);
                        class597.field8642.method2266((byte) -9);
                        class597.field8642 = null;
                        class618.method3553(65535);
                    }
                } else if (class197.field2381 == 14) {
                    if (class597.field8642.method2268((byte) -95, 1)) {
                        class597.field8642.method2270(class532.field7483.field4929, 1, 0, false);
                        class164.field2008 = class532.field7483.field4929[0] & 255;
                        class197.field2381 = 0;
                        class19.method130((byte) 118, 29);
                        class597.field8642.method2266((byte) 120);
                        class597.field8642 = null;
                        class618.method3553(65535);
                    }
                } else if (~class197.field2381 == -10) {
                    if (class597.field8642.method2268((byte) -95, 1)) {
                        class597.field8642.method2270(class532.field7483.field4929, 1, 0, false);
                        class574.field8384 = class532.field7483.field4929[0] & 255;
                        class197.field2381 = 10;
                    }
                } else {
                    if (class197.field2381 == 10) {
                        class484 var15 = class532.field7483;
                        if (~class91.field1121 == -4) {
                            class289.field3754 = true;
                        } else {
                            class289.field3754 = false;
                        }
                        if (class91.field1121 != 2 && ~class91.field1121 != -4) {
                            if (!class597.field8642.method2268((byte) -95, class574.field8384)) {
                                return;
                            }
                            class597.field8642.method2270(var15.field4929, class574.field8384, 0, false);
                            var15.field4966 = 0;
                            class633.field9120 = var15.method2129(-121);
                            class259.field3348 = var15.method2129(-121);
                            class140.field1703 = ~var15.method2129(-128) == -2;
                            class161.field1948 = ~var15.method2129(-89) == -2;
                            class503.field6986 = var15.method2129(-68) == 1;
                            class632.field9102 = var15.method2136(false);
                            class556.field8169 = ~class632.field9102 < -1;
                            class327.field4236 = var15.method2136(false);
                            class425.field5479 = var15.method2136(false);
                            class115.field1443 = var15.method2136(false);
                            class584.field8485 = var15.method2123(false);
                            class625.field8991 = class74.field873.method916(15135, class584.field8485);
                            class222.field2730 = var15.method2129(-93);
                            class601.field8673 = var15.method2136(false);
                            class99.field1233 = var15.method2136(false);
                            class605.field8729 = var15.method2129(-71) == 1;
                            class103.field1265.field8023 = class103.field1265.field8016 = var15.method2098(-44);
                            class492.field6865 = new class220();
                            class492.field6865.field2715 = var15.method2136(false);
                            if (~class492.field6865.field2715 == -65536) {
                                class492.field6865.field2715 = -1;
                            }
                            class492.field6865.field2713 = var15.method2098(-79);
                            if (class507.field7033 != class36.field282) {
                                class492.field6865.field2711 = 50000 - -class492.field6865.field2715;
                                class492.field6865.field2710 = 40000 - -class492.field6865.field2715;
                            }
                            if (class578.field8435 != class36.field282 && (class237.field2960.method1266(29303, class457.field6292) || class237.field2960.method1266(29303, class644.field9387))) {
                                class11.method55(3);
                            }
                        } else {
                            if (!class597.field8642.method2268((byte) -95, class574.field8384)) {
                                return;
                            }
                            class597.field8642.method2270(var15.field4929, class574.field8384, 0, false);
                            var15.field4966 = 0;
                            class633.field9120 = var15.method2129(-114);
                            class259.field3348 = var15.method2129(-125);
                            class140.field1703 = var15.method2129(-87) == 1;
                            class161.field1948 = var15.method2129(-127) == 1;
                            class503.field6986 = ~var15.method2129(-76) == -2;
                            class582.field8467 = var15.method2129(-85) == 1;
                            class82.field1003 = var15.method2136(false);
                            class556.field8169 = var15.method2129(-64) == 1;
                            class414.field5385 = var15.method2140(-701641904);
                            class170.field2073 = var15.method2129(-115) == 1;
                            if (class91.field1121 == 3) {
                                boolean var16 = var15.method2129(-91) == 1;
                                if (var16) {
                                    long var17 = var15.method2107(-25);
                                    String var19 = class589.method3418(var17, (byte) 53);
                                    int var20 = var15.method2129(-124);
                                    byte[] var21 = new byte[var20];
                                    var15.method2812(var20, 0, (byte) 117, var21);
                                    String var22 = class71.method392(-9282, var21);
                                    class627 var23 = null;
                                    try {
                                        class506 var24 = class74.field873.method912("3", -4588, false);
                                        while (~var24.field7031 == -1) {
                                            class462.method2688(1L, (byte) 110);
                                        }
                                        if (var24.field7031 == 1) {
                                            var23 = (class627) var24.field7030;
                                            int var25 = 2 + (3 - -var19.length()) + var22.length() - -2 + 4;
                                            if (var25 > 50) {
                                                throw new RuntimeException(">50");
                                            }
                                            class374 var26 = new class374(1 - -var25);
                                            var26.method2093(var25, -121);
                                            var26.method2093(1, -108);
                                            var26.method2120(95, var19);
                                            var26.method2120(110, var22);
                                            var26.method2115(class95.field1177, 3324);
                                            var26.method2139((byte) 13);
                                            var23.method3593(0, var26.field4929, var26.field4966, (byte) 116);
                                        }
                                    } catch (Exception var36) {
                                    }
                                    try {
                                        if (var23 != null) {
                                            var23.method3596((byte) -95);
                                        }
                                    } catch (Exception var34) {
                                    }
                                    try {
                                        class47.method249("demoaccountcreated", class74.field873.field2014, (byte) 109);
                                    } catch (Throwable var33) {
                                    }
                                }
                            }
                            class16.field126.method1752(-67, class170.field2073);
                            class449.field6217.method2027(93, class170.field2073);
                            class518.field7296.method149((byte) -117, class170.field2073);
                        }
                        if ((!class140.field1703 || class503.field6986) && !class556.field8169) {
                            try {
                                class47.method249("unzap", class74.field873.field2014, (byte) 82);
                            } catch (Throwable var32) {
                            }
                        } else {
                            try {
                                class47.method249("zap", class74.field873.field2014, (byte) 88);
                            } catch (Throwable var35) {
                                if (class136.field1664) {
                                    try {
                                        class74.field873.field2014.getAppletContext().showDocument(new URL(class74.field873.field2014.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var31) {
                                    }
                                }
                            }
                        }
                        if (class507.field7033 == class36.field282) {
                            try {
                                class47.method249("loggedin", class74.field873.field2014, (byte) 83);
                            } catch (Throwable var30) {
                            }
                        }
                        if (class91.field1121 != 2 && ~class91.field1121 != -4) {
                            class197.field2381 = 0;
                            class19.method130((byte) 108, 2);
                            class472.method2752(57);
                            class35.method200(6, 2);
                            class323.field4098 = null;
                            return;
                        }
                        class197.field2381 = 12;
                    }
                    if (~class197.field2381 == -13) {
                        if (!class597.field8642.method2268((byte) -95, 3)) {
                            return;
                        }
                        class597.field8642.method2270(class532.field7483.field4929, 3, 0, false);
                        class197.field2381 = 13;
                    }
                    if (arg0 >= -101) {
                        field5146 = -45;
                    }
                    if (class197.field2381 == 13) {
                        class484 var27 = class532.field7483;
                        var27.field4966 = 0;
                        if (var27.method2809((byte) -72)) {
                            if (!class597.field8642.method2268((byte) -95, 1)) {
                                return;
                            }
                            class597.field8642.method2270(var27.field4929, 1, 3, false);
                        }
                        class323.field4098 = class33.method189(92)[var27.method2805(3659)];
                        class445.field6138 = var27.method2136(false);
                        class197.field2381 = 11;
                    }
                    if (~class197.field2381 == -12) {
                        if (class597.field8642.method2268((byte) -95, class445.field6138)) {
                            class597.field8642.method2270(class532.field7483.field4929, class445.field6138, 0, false);
                            class532.field7483.field4966 = 0;
                            int var28 = class445.field6138;
                            class197.field2381 = 0;
                            class19.method130((byte) 92, 2);
                            class56.method313(0);
                            class519.method2965(class532.field7483, 1349069767);
                            class343.field4424 = -1;
                            class539.method3145(1746901640);
                            if (~class532.field7483.field4966 != ~var28) {
                                throw new RuntimeException("lswp pos:" + class532.field7483.field4966 + " psize:" + var28);
                            } else {
                                class323.field4098 = null;
                            }
                        }
                    } else if (~class197.field2381 == -16) {
                        if (~class445.field6138 == 1) {
                            if (!class597.field8642.method2268((byte) -95, 2)) {
                                return;
                            }
                            class597.field8642.method2270(class532.field7483.field4929, 2, 0, false);
                            class532.field7483.field4966 = 0;
                            class445.field6138 = class532.field7483.method2136(false);
                        }
                        if (class597.field8642.method2268((byte) -95, class445.field6138)) {
                            class597.field8642.method2270(class532.field7483.field4929, class445.field6138, 0, false);
                            class532.field7483.field4966 = 0;
                            class197.field2381 = 0;
                            int var29 = class445.field6138;
                            class19.method130((byte) 95, 15);
                            class219.method1260(1);
                            class519.method2965(class532.field7483, 1349069767);
                            if (class532.field7483.field4966 != var29) {
                                throw new RuntimeException("lswpr pos:" + class532.field7483.field4966 + " psize:" + var29);
                            } else {
                                class323.field4098 = null;
                            }
                        }
                    }
                }
            } catch (IOException var37) {
                if (class597.field8642 != null) {
                    class597.field8642.method2266((byte) 110);
                    class597.field8642 = null;
                }
                if (class583.field8482 >= 1) {
                    class197.field2381 = 0;
                    class19.method130((byte) 109, -4);
                    class618.method3553(65535);
                } else {
                    class197.field2381 = 1;
                    class15.field119 = 0;
                    ++class583.field8482;
                    if (~class91.field1121 != -3 && class91.field1121 != 3) {
                        class592.field8605.field2719 = !class592.field8605.field2719;
                    } else {
                        class237.field2960.field2719 = !class237.field2960.field2719;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZII)V")
    public final void method258(boolean arg0, int arg1, int arg2) {
        ++field5139;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) ((arg1 >> 3 & 3) - -1) * 5.0E-4F;
        float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        super.field4382.method3078(33984, 1);
        if (arg0) {
            field5146 = -7;
        }
        boolean var7 = (128 & arg1) != 0;
        if (var7) {
            class569.field8361[3] = 0.0F;
            class569.field8361[0] = var6;
            class569.field8361[2] = 0.0F;
            class569.field8361[1] = 0.0F;
        } else {
            class569.field8361[3] = 0.0F;
            class569.field8361[1] = 0.0F;
            class569.field8361[0] = 0.0F;
            class569.field8361[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class569.field8361, 0);
        class569.field8361[0] = 0.0F;
        class569.field8361[2] = 0.0F;
        class569.field8361[3] = (float) super.field4382.field7730 * var4 % 1.0F;
        class569.field8361[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class569.field8361, 0);
        if (this.field5133.field7507) {
            class569.field8361[0] = 0.0F;
            class569.field8361[1] = 0.0F;
            class569.field8361[3] = (float) super.field4382.field7730 * var5 % 1.0F;
            class569.field8361[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class569.field8361, 0);
        } else {
            int var8 = (int) ((float) super.field4382.field7730 * var5 * 16.0F);
            super.field4382.method3083((byte) 89, this.field5133.field7510[var8 % 16]);
        }
        super.field4382.method3078(33984, 0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZ)V")
    public final void method252(byte arg0, boolean arg1) {
        ++field5135;
        this.field5134.method3141(19, '\u0000');
        if (arg0 > 10) {
            if (this.field5133.field7507) {
                super.field4382.method3078(33984, 1);
                super.field4382.method3083((byte) 104, this.field5133.field7509);
                super.field4382.method3078(33984, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        this.field5134.method3141(19, '\u0001');
        ++field5143;
        super.field4382.method3078(33984, 1);
        super.field4382.method3083((byte) 102, (class238) null);
        super.field4382.method3078(33984, 0);
        if (arg0 > -21) {
            field5136 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lmh;Lpda;)V")
    public class389(class537 arg0, class535 arg1) {
        super(arg0);
        this.field5133 = arg1;
        this.field5134 = new class538(arg0, 2);
        this.field5134.method3139(0, 0);
        super.field4382.method3078(33984, 1);
        if (this.field5133.field7507) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field4382.method3078(33984, 0);
        this.field5134.method3144(-108);
        this.field5134.method3139(1, 0);
        super.field4382.method3078(33984, 1);
        if (this.field5133.field7507) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field4382.method3078(33984, 0);
        this.field5134.method3144(-83);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBLuu;)V")
    public final void method253(int arg0, byte arg1, class238 arg2) {
        ++field5137;
        super.field4382.method3083((byte) 113, arg2);
        super.field4382.method3063(arg0, (byte) -107);
        if (arg1 != 93) {
            this.method256(true, 92);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    public static final void method2235(boolean arg0) {
        ++field5144;
        if (!arg0) {
            for (class633 var1 = (class633) field5136.method1050((byte) 73); var1 != null; var1 = (class633) field5136.method1047(-7962)) {
                class510 var2 = var1.field9117;
                if (var2.field7206) {
                    var1.method3187(!arg0);
                    var2.method2934((byte) -20);
                } else if (~class335.field4358 <= ~var2.field7229) {
                    var2.method2936(-1, class590.field8557);
                    if (var2.field7206) {
                        var1.method3187(!arg0);
                    } else {
                        class380.method2203(var2, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    public static void method2236(int arg0) {
        field5148 = null;
        field5136 = null;
        if (arg0 > -48) {
            method2235(true);
        }
        field5145 = null;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)Z")
    public final boolean method257(byte arg0) {
        if (arg0 < 115) {
            method2235(true);
        }
        ++field5142;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V")
    public final void method256(boolean arg0, int arg1) {
        ++field5132;
        if (arg1 != 28300) {
            field5148 = null;
        }
    }
}
