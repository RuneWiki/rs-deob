import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class183 extends class384 {

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field2648 = -1;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Lju;")
    public static class102 field2650 = new class102(9, 2);

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field2654 = 0;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "[Lnea;")
    public static class154[] field2657 = new class154[14];

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Lg;")
    public static class594 field2653 = new class594("WIP", 2);

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Ljava/lang/String;")
    public String field2651;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Ljava/lang/String;")
    public String field2659;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public static final void method1221(int arg0) {
        ++field2658;
        if (class455.field6257 == null) {
            int var1 = class305.field3963;
            int var2 = class614.field8750;
            int var3 = class389.field5428 - class58.field807 + -var1;
            int var4 = -class582.field8281 + class611.field8696 - var2;
            if (arg0 != 0) {
                field2653 = null;
            }
            if (~var1 < -1 || ~var3 < -1 || var2 > 0 || var4 > 0) {
                try {
                    Container var5;
                    if (class244.field3384 != null) {
                        var5 = class244.field3384;
                    } else if (class622.field8847 != null) {
                        var5 = class622.field8847;
                    } else {
                        var5 = class128.field1752;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class244.field3384 == var5) {
                        Insets var8 = class244.field3384.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (var1 > 0) {
                        var9.fillRect(var6, var7, var1, class611.field8696);
                    }
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, class389.field5428, var2);
                    }
                    if (~var3 < -1) {
                        var9.fillRect(-var3 + class389.field5428 + var6, var7, var3, class611.field8696);
                    }
                    if (~var4 < -1) {
                        var9.fillRect(var6, -var4 + var7 + class611.field8696, class389.field5428, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)Lsg;")
    public final class17 method1222(int arg0) {
        int var2 = -126 / ((arg0 - 67) / 35);
        ++field2652;
        return class157.field2137[super.field5393];
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field2650 = null;
        field2657 = null;
        field2653 = null;
        if (arg0 != 31) {
            method1226(false);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lwn;ILkc;BI)V")
    public static final void method1224(class583 arg0, int arg1, class655 arg2, byte arg3, int arg4) {
        ++field2647;
        if (arg3 <= 86) {
            field2657 = null;
        }
        if ((arg1 & 1024) != 0) {
            int var5 = arg0.method167((byte) 93);
            if (~var5 == -65536) {
                var5 = -1;
            }
            int var6 = arg0.method141(0);
            int var7 = arg0.method143(false);
            int var8 = var7 & 7;
            int var9 = var7 >> 3 & 15;
            if (var9 == 15) {
                var9 = -1;
            }
            arg2.method3483(var8, true, var5, var9, -1, var6);
        }
        byte var10 = -1;
        if (~(arg1 & 16384) != -1) {
            int var11 = arg0.method192(67);
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];
            int[] var14 = new int[var11];
            for (int var15 = 0; ~var15 > ~var11; ++var15) {
                int var16 = arg0.method167((byte) 96);
                if (~var16 == -65536) {
                    var16 = -1;
                }
                var12[var15] = var16;
                var13[var15] = arg0.method194((byte) 119);
                var14[var15] = arg0.method191(false);
            }
            class708.method3984(var14, arg2, var12, 1, var13);
        }
        if (~(arg1 & 4096) != -1) {
            int var17 = arg0.method168(-16785);
            arg2.field8365 = arg0.method143(false);
            arg2.field8340 = arg0.method194((byte) 119);
            arg2.field8404 = 32767 & var17;
            arg2.field8324 = ~(var17 & 32768) != -1;
            arg2.field8374 = class245.field3409 + arg2.field8404 + arg2.field8365;
        }
        if ((1 & arg1) != 0) {
            class634.field9025[arg4] = arg0.method172(6849);
        }
        if (~(arg1 & 131072) != -1) {
            int var18 = class245.field3409;
            int var19 = arg0.method190(-27226);
            int var20 = arg0.method194((byte) 119);
            arg2.method3481(var18, var19, var20, false);
        }
        if (~(16 & arg1) != -1) {
            int var21 = arg0.method192(99);
            byte[] var22 = new byte[var21];
            class26 var23 = new class26(var22);
            arg0.method149(var22, 0, (byte) -118, var21);
            class383.field5386[arg4] = var23;
            arg2.method3786(var23, 0);
        }
        if ((arg1 & 32768) != 0) {
            var10 = arg0.method146(true);
        }
        if (~(arg1 & 128) != -1) {
            int[] var24 = new int[4];
            for (int var25 = 0; var25 < 4; ++var25) {
                var24[var25] = arg0.method168(-16785);
                if (~var24[var25] == -65536) {
                    var24[var25] = -1;
                }
            }
            int var26 = arg0.method143(false);
            class621.method3637(var24, arg2, (byte) -2, var26);
        }
        if ((256 & arg1) != 0) {
            arg2.field8360 = arg0.method146(true);
            arg2.field8356 = arg0.method172(6849);
            arg2.field8363 = arg0.method138((byte) -62);
            arg2.field8334 = arg0.method195(128);
            arg2.field8388 = arg0.method191(false) + class245.field3409;
            arg2.field8402 = arg0.method167((byte) 113) + class245.field3409;
            arg2.field8333 = arg0.method192(88);
            if (!arg2.field9276) {
                arg2.field8360 += arg2.field8421[0];
                arg2.field8363 += arg2.field8421[0];
                arg2.field8334 += arg2.field8414[0];
                arg2.field8419 = 1;
                arg2.field8356 += arg2.field8414[0];
            } else {
                arg2.field8360 += arg2.field9258;
                arg2.field8419 = 0;
                arg2.field8356 += arg2.field9268;
                arg2.field8363 += arg2.field9258;
                arg2.field8334 += arg2.field9268;
            }
            arg2.field8416 = 0;
        }
        if ((64 & arg1) != 0) {
            int var27 = arg0.method193(2);
            if (~var27 == -65536) {
                var27 = -1;
            }
            int var28 = arg0.method144(-88);
            int var29 = arg0.method143(false);
            int var30 = 7 & var29;
            int var31 = (126 & var29) >> 3;
            if (~var31 == -16) {
                var31 = -1;
            }
            arg2.method3483(var30, false, var27, var31, -1, var28);
        }
        if (~(65536 & arg1) != -1) {
            arg2.field8403 = arg0.method138((byte) -62);
            arg2.field8319 = arg0.method146(true);
            arg2.field8345 = arg0.method172(6849);
            arg2.field8400 = (byte) arg0.method194((byte) 119);
            arg2.field8339 = class245.field3409 + arg0.method193(2);
            arg2.field8387 = class245.field3409 - -arg0.method167((byte) 92);
        }
        if ((arg1 & 262144) != 0) {
            int var32 = arg0.method174(0);
            int[] var33 = new int[var32];
            int[] var34 = new int[var32];
            for (int var35 = 0; var35 < var32; ++var35) {
                int var36 = arg0.method191(false);
                if ((49152 & var36) == 49152) {
                    int var37 = arg0.method193(2);
                    var33[var35] = class747.method4153(var37, var36 << 16);
                } else {
                    var33[var35] = var36;
                }
                var34[var35] = arg0.method193(2);
            }
            arg2.method3472(var33, 99, var34);
        }
        if ((32 & arg1) != 0) {
            int var38 = arg0.method168(-16785);
            if (var38 == 65535) {
                var38 = -1;
            }
            arg2.field8342 = var38;
        }
        if (~(2 & arg1) != -1) {
            arg2.field9244 = arg0.method168(-16785);
            if (arg2.field8419 == 0) {
                arg2.method3475(-16384, arg2.field9244);
                arg2.field9244 = -1;
            }
        }
        if ((512 & arg1) != 0) {
            arg2.field9264 = ~arg0.method143(false) == -2;
        }
        if ((8 & arg1) != 0) {
            int var39 = arg0.method190(-27226);
            int var40 = arg0.method192(99);
            arg2.method3481(class245.field3409, var39, var40, false);
            arg2.field8341 = class245.field3409 + 300;
            arg2.field8329 = arg0.method143(false);
        }
        if ((2048 & arg1) != 0) {
            arg2.field8314 = arg0.method196((byte) -92);
            if (~arg2.field8314.charAt(0) != -127) {
                if (class473.field6483 == arg2) {
                    class441.method2638(arg2.method3791(-62, false), 0, (byte) 17, arg2.field9250, arg2.field8314, arg2.method3790(true, -1), 2);
                }
            } else {
                arg2.field8314 = arg2.field8314.substring(1);
                class441.method2638(arg2.method3791(-69, false), 0, (byte) 17, arg2.field9250, arg2.field8314, arg2.method3790(true, -1), 2);
            }
            arg2.field8351 = 0;
            arg2.field8346 = 0;
            arg2.field8338 = 150;
        }
        if (arg2.field9276) {
            if (var10 != 127) {
                byte var41;
                if (var10 != -1) {
                    var41 = var10;
                } else {
                    var41 = class634.field9025[arg4];
                }
                class423.method2580((byte) -125, arg2, var41);
                arg2.method3783(arg2.field9268, var41, (byte) 125, arg2.field9258);
            } else {
                arg2.method3788(arg2.field9268, 18305, arg2.field9258);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)V")
    public static final void method1225(int arg0) {
        if (class658.field9294 > 1) {
            --class658.field9294;
            class269.field3632 = class564.field8023;
        }
        ++field2649;
        if (class594.field8566) {
            class594.field8566 = false;
            class333.method1928(1);
        } else {
            if (arg0 >= -4) {
                method1224((class583) null, 111, (class655) null, (byte) -64, -13);
            }
            if (!class484.field6549) {
                class748.method4156(2);
            }
            for (int var1 = 0; ~var1 > -101 && class83.method495((byte) -13); ++var1) {
            }
            if (class213.field3004 == 10) {
                while (class595.method3526(768)) {
                    class120 var2 = class292.method1716(class608.field8668, true, class317.field4072);
                    var2.field1653.method184(0, -72);
                    int var3 = var2.field1653.field330;
                    class361.method2034(var2.field1653, -1406);
                    var2.field1653.method161(-var3 + var2.field1653.field330, true);
                    class471.method2805(91, var2);
                }
                if (class122.field1667 != null) {
                    if (~class122.field1667.field9454 != 0) {
                        class120 var4 = class292.method1716(class608.field8668, true, class741.field10325);
                        var4.field1653.method147((byte) 53, class122.field1667.field9454);
                        class471.method2805(122, var4);
                        class122.field1667 = null;
                        class651.field9206 = class224.method1457((byte) -62) + 30000L;
                    }
                } else if (~class224.method1457((byte) -62) <= ~class651.field9206) {
                    class122.field1667 = class641.field9106.method3729((byte) -17, class396.field5504.field813);
                }
                class12 var5 = (class12) class36.field508.method3118((byte) 73);
                if (var5 != null || ~(class224.method1457((byte) -62) - 2000L) < ~class15.field203) {
                    class120 var6 = null;
                    int var7 = 0;
                    for (class12 var8 = (class12) class522.field7338.method3118((byte) 73); var8 != null && (var6 == null || var6.field1653.field330 - var7 < 240); var8 = (class12) class522.field7338.method3111(116)) {
                        var8.method3065(-17363);
                        int var9 = var8.method64(-1);
                        if (var9 >= -1) {
                            if (~var9 < -65535) {
                                var9 = 65534;
                            }
                        } else {
                            var9 = -1;
                        }
                        int var10 = var8.method63(5245);
                        if (var10 < -1) {
                            var10 = -1;
                        } else if (var10 > 65534) {
                            var10 = 65534;
                        }
                        if (~class223.field3137 != ~var10 || ~class545.field7706 != ~var9) {
                            if (var6 == null) {
                                var6 = class292.method1716(class608.field8668, true, class674.field9503);
                                ++class193.field2800;
                                var6.field1653.method184(0, -69);
                                var7 = var6.field1653.field330;
                            }
                            int var11 = var10 - class223.field3137;
                            class223.field3137 = var10;
                            int var12 = -class545.field7706 + var9;
                            class545.field7706 = var9;
                            int var13 = (int) ((var8.method68((byte) -47) - class15.field203) / 20L);
                            if (var13 < 8 && var11 >= -32 && ~var11 >= -32 && ~var12 <= 31 && var12 <= 31) {
                                var11 += 32;
                                var12 += 32;
                                var6.field1653.method147((byte) 53, (var13 << 12) - -(var11 << 6) + var12);
                            } else if (~var13 > -33 && var11 >= -128 && ~var11 >= -128 && ~var12 <= 127 && ~var12 >= -128) {
                                var11 += 128;
                                var12 += 128;
                                var6.field1653.method184(var13 + 128, -120);
                                var6.field1653.method147((byte) 53, (var11 << 8) + var12);
                            } else if (~var13 > -33) {
                                var6.field1653.method184(var13 + 192, -72);
                                if (var10 != 1 && var9 != -1) {
                                    var6.field1653.method199(true, var9 << 16 | var10);
                                } else {
                                    var6.field1653.method199(true, Integer.MIN_VALUE);
                                }
                            } else {
                                var6.field1653.method147((byte) 53, var13 + 57344);
                                if (var10 != 1 && var9 != -1) {
                                    var6.field1653.method199(true, var9 << 16 | var10);
                                } else {
                                    var6.field1653.method199(true, Integer.MIN_VALUE);
                                }
                            }
                            class15.field203 = var8.method68((byte) -47);
                        }
                    }
                    if (var6 != null) {
                        var6.field1653.method161(var6.field1653.field330 - var7, true);
                        class471.method2805(113, var6);
                    }
                }
                if (var5 != null) {
                    long var14 = (var5.method68((byte) -47) + -class671.field9436) / 50L;
                    class671.field9436 = var5.method68((byte) -47);
                    if (var14 > 32767L) {
                        var14 = 32767L;
                    }
                    int var16 = var5.method64(-1);
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (~var16 < -65536) {
                        var16 = 65535;
                    }
                    int var17 = var5.method63(5245);
                    if (var17 >= 0) {
                        if (~var17 < -65536) {
                            var17 = 65535;
                        }
                    } else {
                        var17 = 0;
                    }
                    byte var18 = 0;
                    if (var5.method67((byte) -125) == 2) {
                        var18 = 1;
                    }
                    int var19 = (int) var14;
                    ++class564.field8007;
                    class120 var20 = class292.method1716(class608.field8668, true, class249.field3470);
                    var20.field1653.method142(var19 | var18 << 15, 5);
                    var20.field1653.method137(295502000, var17 | var16 << 16);
                    class471.method2805(126, var20);
                }
                if (~class748.field10427 < -1) {
                    ++class728.field10210;
                    class120 var21 = class292.method1716(class608.field8668, true, class628.field8963);
                    var21.field1653.method184(class748.field10427 * 3, -85);
                    for (int var22 = 0; var22 < class748.field10427; ++var22) {
                        class243 var23 = class168.field2295[var22];
                        long var24 = (var23.method1542(false) + -class527.field7373) / 50L;
                        if (~var24 < -65536L) {
                            var24 = 65535L;
                        }
                        class527.field7373 = var23.method1542(false);
                        var21.field1653.method184(var23.method1541(-26820), -43);
                        var21.field1653.method147((byte) 53, (int) var24);
                    }
                    class471.method2805(101, var21);
                }
                if (~class478.field6513 < -1) {
                    --class478.field6513;
                }
                if (class263.field3586 && class478.field6513 <= 0) {
                    ++class226.field3167;
                    class478.field6513 = 20;
                    class263.field3586 = false;
                    class120 var26 = class292.method1716(class608.field8668, true, class446.field6099);
                    var26.field1653.method142((int) class403.field5597 >> 3, 5);
                    var26.field1653.method175((int) class223.field3131 >> 3, -16904);
                    class471.method2805(116, var26);
                }
                if (class614.field8741 == !class497.field6971) {
                    ++class196.field2832;
                    class497.field6971 = class614.field8741;
                    class120 var27 = class292.method1716(class608.field8668, true, class663.field9355);
                    var27.field1653.method184(!class614.field8741 ? 0 : 1, -114);
                    class471.method2805(126, var27);
                }
                if (!class83.field1158) {
                    ++class91.field1228;
                    class120 var28 = class292.method1716(class608.field8668, true, class151.field2082);
                    var28.field1653.method184(0, -39);
                    int var29 = var28.field1653.field330;
                    class26 var30 = class674.field9500.method2252((byte) -49);
                    var28.field1653.method155(0, var30.field330, var30.field279, 106);
                    var28.field1653.method161(-var29 + var28.field1653.field330, true);
                    class471.method2805(116, var28);
                    class83.field1158 = true;
                }
                if (class352.field4549 != null) {
                    if (class665.field9377 != 2) {
                        if (~class665.field9377 == -4) {
                            class413.method2518(64);
                        }
                    } else {
                        class20.method97(-30512);
                    }
                }
                if (class627.field8949) {
                    class627.field8949 = false;
                } else {
                    class675.field9508 /= 2.0F;
                }
                if (class218.field3089) {
                    class218.field3089 = false;
                } else {
                    class196.field2836 /= 2.0F;
                }
                class506.method3021(-76);
                if (~class213.field3004 == -11) {
                    class70.method443((byte) 112);
                    class410.method2499(-125);
                    class429.method2603(false);
                    ++class708.field9899;
                    if (class708.field9899 > 750) {
                        class333.method1928(1);
                    } else {
                        class638.method3708((byte) 114);
                        class119.method780(0);
                        class430.method2606((byte) 115);
                        for (int var31 = class554.field7826.method4092(-1, true); var31 != -1; var31 = class554.field7826.method4092(-1, false)) {
                            class5.method27(var31, false);
                            class718.field10147[class136.method878(31, class151.field2087++)] = var31;
                        }
                        for (class118 var32 = class615.method3606(31467); var32 != null; var32 = class615.method3606(31467)) {
                            int var33 = var32.method776((byte) -124);
                            int var34 = var32.method773(16);
                            if (var33 != 1) {
                                if (~var33 == -3) {
                                    class216.field3066[var34] = var32.field1638;
                                    class127.field1751[class136.method878(31, class401.field5560++)] = var34;
                                } else if (~var33 == -4) {
                                    class712 var35 = class733.method4073(true, var34);
                                    if (!var32.field1638.equals(var35.field10062)) {
                                        var35.field10062 = var32.field1638;
                                        class116.method764(var35, -1176833464);
                                    }
                                } else if (var33 != 4) {
                                    if (var33 != 5) {
                                        if (~var33 != -7) {
                                            if (var33 != 7) {
                                                if (var33 != 8) {
                                                    if (~var33 != -10) {
                                                        if (var33 == 10) {
                                                            class712 var36 = class733.method4073(true, var34);
                                                            if (~var32.field1636 != ~var36.field10067 || ~var32.field1629 != ~var36.field9978 || ~var32.field1634 != ~var36.field10064) {
                                                                var36.field10064 = var32.field1634;
                                                                var36.field10067 = var32.field1636;
                                                                var36.field9978 = var32.field1629;
                                                                class116.method764(var36, -1176833464);
                                                            }
                                                        } else if (var33 == 11) {
                                                            class712 var37 = class733.method4073(true, var34);
                                                            var37.field10013 = var37.field10035 = var32.field1629;
                                                            var37.field10072 = 0;
                                                            var37.field10066 = 0;
                                                            var37.field10048 = var37.field10085 = var32.field1636;
                                                            class116.method764(var37, -1176833464);
                                                        } else if (var33 != 12) {
                                                            if (~var33 == -15) {
                                                                class712 var38 = class733.method4073(true, var34);
                                                                var38.field9973 = var32.field1636;
                                                            } else if (var33 == 15) {
                                                                class729.field10226 = var32.field1636;
                                                                class557.field7912 = true;
                                                                class93.field1329 = var32.field1629;
                                                            } else if (var33 != 16) {
                                                                if (var33 == 17) {
                                                                    class712 var39 = class733.method4073(true, var34);
                                                                    var39.field9984 = var32.field1636;
                                                                }
                                                            } else {
                                                                class712 var40 = class733.method4073(true, var34);
                                                                var40.field10070 = var32.field1636;
                                                            }
                                                        } else {
                                                            class712 var41 = class733.method4073(true, var34);
                                                            int var42 = var32.field1636;
                                                            if (var41 != null && ~var41.field10039 == -1) {
                                                                if (~var42 < ~(-var41.field10011 + var41.field10002)) {
                                                                    var42 = -var41.field10011 + var41.field10002;
                                                                }
                                                                if (~var42 > -1) {
                                                                    var42 = 0;
                                                                }
                                                                if (var41.field10014 != var42) {
                                                                    var41.field10014 = var42;
                                                                    class116.method764(var41, -1176833464);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        class712 var43 = class733.method4073(true, var34);
                                                        if (var32.field1636 != var43.field9953 || ~var32.field1629 != ~var43.field10017) {
                                                            var43.field10017 = var32.field1629;
                                                            var43.field9953 = var32.field1636;
                                                            class116.method764(var43, -1176833464);
                                                        }
                                                    }
                                                } else {
                                                    class712 var44 = class733.method4073(true, var34);
                                                    if (var32.field1636 != var44.field10050 || var32.field1629 != var44.field10102 || ~var32.field1634 != ~var44.field9997) {
                                                        var44.field9997 = var32.field1634;
                                                        var44.field10050 = var32.field1636;
                                                        var44.field10102 = var32.field1629;
                                                        if (var44.field9953 != -1) {
                                                            if (var44.field9992 > 0) {
                                                                var44.field9997 = var44.field9997 * 32 / var44.field9992;
                                                            } else if (var44.field9982 > 0) {
                                                                var44.field9997 = var44.field9997 * 32 / var44.field9982;
                                                            }
                                                        }
                                                        class116.method764(var44, -1176833464);
                                                    }
                                                }
                                            } else {
                                                class712 var45 = class733.method4073(true, var34);
                                                boolean var46 = ~var32.field1636 == -2;
                                                if (var45.field10015 != var46) {
                                                    var45.field10015 = var46;
                                                    class116.method764(var45, -1176833464);
                                                }
                                            }
                                        } else {
                                            int var47 = var32.field1636;
                                            int var48 = (32604 & var47) >> 10;
                                            int var49 = var47 >> 5 & 31;
                                            int var50 = 31 & var47;
                                            int var51 = (var50 << 3) + (var48 << 19) + (var49 << 11);
                                            class712 var52 = class733.method4073(true, var34);
                                            if (var52.field10069 != var51) {
                                                var52.field10069 = var51;
                                                class116.method764(var52, -1176833464);
                                            }
                                        }
                                    } else {
                                        class712 var53 = class733.method4073(true, var34);
                                        if (~var32.field1636 != ~var53.field9943 || ~var32.field1636 == 0) {
                                            var53.field10040 = 1;
                                            var53.field9947 = 0;
                                            var53.field9943 = var32.field1636;
                                            var53.field9970 = 0;
                                            class103 var54 = ~var53.field9943 == 0 ? null : class274.field3684.method1881((byte) -80, var53.field9943);
                                            if (var54 != null) {
                                                class670.method3837(false, var53.field9947, var54);
                                            }
                                            class116.method764(var53, -1176833464);
                                        }
                                    }
                                } else {
                                    class712 var55 = class733.method4073(true, var34);
                                    int var56 = var32.field1636;
                                    int var57 = var32.field1629;
                                    int var58 = var32.field1634;
                                    if (var55.field10038 != var56 || ~var55.field9937 != ~var57 || var55.field9963 != var58) {
                                        var55.field9937 = var57;
                                        var55.field9963 = var58;
                                        var55.field10038 = var56;
                                        class116.method764(var55, -1176833464);
                                    }
                                }
                            } else {
                                class594.field8568[var34] = var32.field1636;
                                class97.field1411 |= class504.field7038[var34];
                                class90.field1219[class136.method878(31, class754.field10476++)] = var34;
                            }
                        }
                        if (class352.field4547 != 0) {
                            class751.field10443 += 20;
                            if (~class751.field10443 <= -401) {
                                class352.field4547 = 0;
                            }
                        }
                        ++class284.field3763;
                        if (class645.field9150 != null) {
                            ++class10.field93;
                            if (~class10.field93 <= -16) {
                                class116.method764(class645.field9150, -1176833464);
                                class645.field9150 = null;
                            }
                        }
                        class441.field6047 = false;
                        class218.field3086 = false;
                        class692.field9684 = null;
                        class355.field4559 = null;
                        class38.method265(-1, -1, (class712) null, (byte) -3);
                        class172.method1073(-1, (class712) null, -1, (byte) 46);
                        if (!class13.field187) {
                            class565.field8033 = -1;
                        }
                        class517.method3075(4084);
                        ++class564.field8023;
                        if (class719.field10152) {
                            ++class644.field9129;
                            class120 var59 = class292.method1716(class608.field8668, true, class483.field6536);
                            var59.field1653.method199(true, class274.field3687 << 28 | class145.field2001 << 14 | class337.field4335);
                            class471.method2805(118, var59);
                            class719.field10152 = false;
                        }
                        while (true) {
                            class700 var60;
                            class712 var61;
                            class712 var62;
                            do {
                                var60 = (class700) class447.field6121.method3115(true);
                                if (var60 == null) {
                                    while (true) {
                                        class700 var63;
                                        class712 var64;
                                        class712 var65;
                                        do {
                                            var63 = (class700) class323.field4155.method3115(true);
                                            if (var63 == null) {
                                                while (true) {
                                                    class700 var66;
                                                    class712 var67;
                                                    class712 var68;
                                                    do {
                                                        var66 = (class700) class14.field200.method3115(true);
                                                        if (var66 == null) {
                                                            if (class355.field4559 == null) {
                                                                class392.field5462 = 0;
                                                            }
                                                            if (class740.field10315 != null) {
                                                                class633.method3679((byte) -100);
                                                            }
                                                            if (~class467.field6375 < -1 && class196.field2837.method315(-21, 82) && class196.field2837.method315(81, 81) && class120.field1657 != 0) {
                                                                int var69 = -class120.field1657 + class473.field6483.field9501;
                                                                if (var69 >= 0) {
                                                                    if (~var69 < -4) {
                                                                        var69 = 3;
                                                                    }
                                                                } else {
                                                                    var69 = 0;
                                                                }
                                                                class482.method2839(-4118, var69, class473.field6483.field8421[0] + class179.field2535, class510.field7109 - -class473.field6483.field8414[0]);
                                                            }
                                                            class643.method3731(-761);
                                                            for (int var70 = 0; ~var70 > -6; ++var70) {
                                                                int var10002 = class511.field7132[var70]++;
                                                            }
                                                            if (class97.field1411 && ~class703.field9781 > ~(class224.method1457((byte) -62) - 60000L)) {
                                                                class244.method1551(-73);
                                                            }
                                                            for (class101 var71 = (class101) class367.field4709.method1945(false); var71 != null; var71 = (class101) class367.field4709.method1944(9408)) {
                                                                if (-5L + class224.method1457((byte) -62) / 1000L > (long) var71.field1447) {
                                                                    if (~var71.field1453 < -1) {
                                                                        class441.method2638("", 0, (byte) 17, "", var71.field1448 + class138.field1855.method891(-2041650704, class369.field4721), "", 5);
                                                                    }
                                                                    if (~var71.field1453 == -1) {
                                                                        class441.method2638("", 0, (byte) 17, "", var71.field1448 + class138.field1856.method891(-2041650704, class369.field4721), "", 5);
                                                                    }
                                                                    var71.method1(111);
                                                                }
                                                            }
                                                            ++class93.field1330;
                                                            if (class93.field1330 > 500) {
                                                                class93.field1330 = 0;
                                                                int var72 = (int) (Math.random() * 8.0D);
                                                                if (~(var72 & 4) == -5) {
                                                                    class97.field1409 += class92.field1240;
                                                                }
                                                                if (~(2 & var72) == -3) {
                                                                    class481.field6529 += class408.field5682;
                                                                }
                                                                if (~(var72 & 1) == -2) {
                                                                    class676.field9531 += class512.field7146;
                                                                }
                                                            }
                                                            if (class676.field9531 < -50) {
                                                                class512.field7146 = 2;
                                                            }
                                                            if (class481.field6529 < -55) {
                                                                class408.field5682 = 2;
                                                            }
                                                            if (~class676.field9531 < -51) {
                                                                class512.field7146 = -2;
                                                            }
                                                            if (~class481.field6529 < -56) {
                                                                class408.field5682 = -2;
                                                            }
                                                            if (~class97.field1409 > 39) {
                                                                class92.field1240 = 1;
                                                            }
                                                            if (class97.field1409 > 40) {
                                                                class92.field1240 = -1;
                                                            }
                                                            ++class175.field2389;
                                                            if (~class175.field2389 < -501) {
                                                                class175.field2389 = 0;
                                                                int var73 = (int) (Math.random() * 8.0D);
                                                                if (~(2 & var73) == -3) {
                                                                    class592.field8541 += class429.field5912;
                                                                }
                                                                if ((var73 & 1) == 1) {
                                                                    class732.field10234 += class393.field5477;
                                                                }
                                                            }
                                                            if (class732.field10234 < -60) {
                                                                class393.field5477 = 2;
                                                            }
                                                            if (~class592.field8541 > 19) {
                                                                class429.field5912 = 1;
                                                            }
                                                            if (~class732.field10234 < -61) {
                                                                class393.field5477 = -2;
                                                            }
                                                            if (class592.field8541 > 10) {
                                                                class429.field5912 = -1;
                                                            }
                                                            ++class585.field8425;
                                                            if (class585.field8425 > 50) {
                                                                ++class471.field6441;
                                                                class120 var74 = class292.method1716(class608.field8668, true, class471.field6464);
                                                                class471.method2805(101, var74);
                                                            }
                                                            if (class97.field1408) {
                                                                class155.method984(-3);
                                                                class97.field1408 = false;
                                                            }
                                                            try {
                                                                class458.method2748(true);
                                                                return;
                                                            } catch (IOException var75) {
                                                                class333.method1928(1);
                                                                return;
                                                            }
                                                        }
                                                        var67 = var66.field9745;
                                                        if (var67.field10026 < 0) {
                                                            break;
                                                        }
                                                        var68 = class733.method4073(true, var67.field10030);
                                                    } while (var68 == null || var68.field9981 == null || var67.field10026 >= var68.field9981.length || var68.field9981[var67.field10026] != var67);
                                                    class318.method1840(var66);
                                                }
                                            }
                                            var64 = var63.field9745;
                                            if (var64.field10026 < 0) {
                                                break;
                                            }
                                            var65 = class733.method4073(true, var64.field10030);
                                        } while (var65 == null || var65.field9981 == null || ~var64.field10026 <= ~var65.field9981.length || var65.field9981[var64.field10026] != var64);
                                        class318.method1840(var63);
                                    }
                                }
                                var61 = var60.field9745;
                                if (var61.field10026 < 0) {
                                    break;
                                }
                                var62 = class733.method4073(true, var61.field10030);
                            } while (var62 == null || var62.field9981 == null || var62.field9981.length <= var61.field10026 || var62.field9981[var61.field10026] != var61);
                            class318.method1840(var60);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
    public static final void method1226(boolean arg0) {
        class423.field5857 = 200;
        class731.field10229 = (int) ((double) class514.field7179 * 34.46D);
        ++field2656;
        if (arg0) {
            class731.field10229 <<= 2;
            if (class96.field1401.method2079()) {
                class731.field10229 += 512;
            }
            class290.method1711(100, false);
        }
    }
}
