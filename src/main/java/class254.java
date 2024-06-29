import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class254 extends class185 {

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Z")
    public static boolean field3859 = false;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "[I")
    public static int[] field3867 = new int[99];

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Z")
    public static boolean field3869;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lpf;")
    public static class294 field3861;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class256 var20 = new class256(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class33.field487[var21][arg1][arg2] == null) {
                    class33.field487[var21][arg1][arg2] = new class270(var21, arg1, arg2);
                }
            }
            class33.field487[arg0][arg1][arg2].field4085 = var20;
        } else if (arg3 != 1) {
            class135 var24 = new class135(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class33.field487[var25][arg1][arg2] == null) {
                    class33.field487[var25][arg1][arg2] = new class270(var25, arg1, arg2);
                }
            }
            class33.field487[arg0][arg1][arg2].field4081 = var24;
        } else {
            class256 var22 = new class256(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class33.field487[var23][arg1][arg2] == null) {
                    class33.field487[var23][arg1][arg2] = new class270(var23, arg1, arg2);
                }
            }
            class33.field487[arg0][arg1][arg2].field4085 = var22;
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static void method1672(byte arg0) {
        field3861 = null;
        field3867 = null;
        if (arg0 < 86) {
            field3859 = false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        ++field3866;
        if (!arg0) {
            method1675((byte) -7, -32, 86, -69, 126, -28, 11, 59);
        }
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class174.field2648 > var7; ++var7) {
                this.method1674(var7, -110, arg1);
                int[][] var8 = this.method1152(false, 0, class183.field2761);
                var4[var7] = var8[0][class151.field2171];
                var5[var7] = var8[1][class151.field2171];
                var6[var7] = var8[2][class151.field2171];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpf;I)V")
    public static final void method1673(class294 arg0, int arg1) {
        ++field3868;
        if (arg1 != 17558) {
            field3861 = null;
        }
        class227.field3396 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
    private final void method1674(int arg0, int arg1, int arg2) {
        ++field3864;
        int var4 = class153.field2304[arg0];
        int var5 = class85.field1356[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class183.field2761 = arg2;
            class151.field2171 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class151.field2171 = arg2;
            class183.field2761 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class183.field2761 = arg0;
            class151.field2171 = -arg2 + class174.field2648;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class183.field2761 = class130.field1933 - arg2;
            class151.field2171 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class151.field2171 = -arg0 + class174.field2648;
            class183.field2761 = -arg2 + class130.field1933;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class151.field2171 = -arg2 + class174.field2648;
            class183.field2761 = -arg0 + class130.field1933;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class183.field2761 = -arg0 + class130.field1933;
            class151.field2171 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class151.field2171 = class174.field2648 - arg0;
            class183.field2761 = arg2;
        }
        int var7 = -78 / ((14 - arg1) / 59);
        class151.field2171 &= class53.field873;
        class183.field2761 &= class10.field133;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class254() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1675(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= class248.field3765 && arg6 <= class163.field2505 && ~class243.field3635 >= ~arg5 && class118.field1782 >= arg1) {
            class139.method855(arg5, arg3, arg2, arg0 ^ 1502, arg1, arg4, arg7, arg6);
        } else {
            class197.method1232(arg2, arg5, arg4, arg3, arg7, arg6, arg1, -12494);
        }
        ++field3863;
        if (arg0 != 61) {
            method1677(true);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILpf;)Z")
    public static final boolean method1676(int arg0, class294 arg1) {
        ++field3870;
        if (arg0 != -23606) {
            field3867 = null;
        }
        return arg1.method1960(class27.field336, (byte) 117);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg2 != -6357) {
            this.method39(false, 75);
        }
        ++field3858;
        if (arg0 == 0) {
            super.field2814 = ~arg1.method1593((byte) 27) == -2;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V")
    public static final void method1677(boolean arg0) {
        if (arg0) {
            ++field3871;
            if (~class237.field3570 != -1 && ~class237.field3570 != -6) {
                try {
                    if (~(++class191.field2933) < -2001) {
                        if (class44.field706 != null) {
                            class44.field706.method955((byte) -83);
                            class44.field706 = null;
                        }
                        if (~class247.field3689 <= -2) {
                            class115.field1761 = -5;
                            class237.field3570 = 0;
                            return;
                        }
                        if (class278.field4192 == class256.field3897) {
                            class256.field3897 = class284.field4257;
                        } else {
                            class256.field3897 = class278.field4192;
                        }
                        ++class247.field3689;
                        class191.field2933 = 0;
                        class237.field3570 = 1;
                    }
                    if (class237.field3570 == 1) {
                        class177.field2713 = class209.field3147.method68(class210.field3162, 0, class256.field3897);
                        class237.field3570 = 2;
                    }
                    if (~class237.field3570 == -3) {
                        if (~class177.field2713.field1249 == -3) {
                            throw new IOException();
                        }
                        if (~class177.field2713.field1249 != -2) {
                            return;
                        }
                        class44.field706 = new class157((Socket) class177.field2713.field1250, class209.field3147);
                        class177.field2713 = null;
                        long var1 = class209.field3150 = class94.method604((byte) -93, class66.field1054);
                        class196.field2979.field3748 = 0;
                        class196.field2979.method1568(14, (byte) 49);
                        int var3 = (int) (31L & var1 >> 16);
                        class196.field2979.method1568(var3, (byte) 49);
                        class44.field706.method951(2, 122, 0, class196.field2979.field3723);
                        if (class147.field2144 != null) {
                            class147.field2144.method445((byte) 122);
                        }
                        if (class192.field2958 != null) {
                            class192.field2958.method445((byte) 122);
                        }
                        int var4 = class44.field706.method950(arg0);
                        if (class147.field2144 != null) {
                            class147.field2144.method445((byte) 122);
                        }
                        if (class192.field2958 != null) {
                            class192.field2958.method445((byte) 122);
                        }
                        if (~var4 != -1) {
                            class237.field3570 = 0;
                            class115.field1761 = var4;
                            class44.field706.method955((byte) 93);
                            class44.field706 = null;
                            return;
                        }
                        class237.field3570 = 3;
                    }
                    if (class237.field3570 == 3) {
                        if (class44.field706.method953(0) < 8) {
                            return;
                        }
                        class44.field706.method946(class100.field1580.field3723, true, 8, 0);
                        int[] var5 = new int[4];
                        class100.field1580.field3748 = 0;
                        class144.field2112 = class100.field1580.method1608(11119);
                        var5[1] = (int) (Math.random() * 9.9999999E7D);
                        var5[2] = (int) (class144.field2112 >> 32);
                        var5[0] = (int) (9.9999999E7D * Math.random());
                        var5[3] = (int) class144.field2112;
                        class196.field2979.field3748 = 0;
                        class196.field2979.method1568(10, (byte) 49);
                        class196.field2979.method1577((byte) 71, var5[0]);
                        class196.field2979.method1577((byte) 69, var5[1]);
                        class196.field2979.method1577((byte) 98, var5[2]);
                        class196.field2979.method1577((byte) 66, var5[3]);
                        class196.field2979.method1610(791715792, class94.method604((byte) 103, class66.field1054));
                        class196.field2979.method1589((byte) 123, class251.field3820);
                        class196.field2979.method1573(class90.field1426, 117, class129.field1925);
                        class43.field639.field3748 = 0;
                        if (~class184.field2794 == -41) {
                            class43.field639.method1568(18, (byte) 49);
                        } else {
                            class43.field639.method1568(16, (byte) 49);
                        }
                        class43.field639.method1605(class196.field2979.field3748 + 163 - -class62.method419(class189.field2904, 75), (byte) 38);
                        class43.field639.method1577((byte) 54, 544);
                        class43.field639.method1568(class266.field4005, (byte) 49);
                        class43.field639.method1568(!class10.field135 ? 0 : 1, (byte) 49);
                        class43.field639.method1568(0, (byte) 49);
                        class43.field639.method1568(class13.method75(0), (byte) 49);
                        class43.field639.method1605(class77.field1245, (byte) 56);
                        class43.field639.method1605(class180.field2748, (byte) 105);
                        class43.field639.method1568(class154.field2318, (byte) 49);
                        class3.method13(class43.field639, -25);
                        class43.field639.method1589((byte) 110, class189.field2904);
                        class43.field639.method1577((byte) 33, class259.field3946);
                        class43.field639.method1577((byte) 115, class63.method423((byte) 64));
                        class147.field2139 = true;
                        class43.field639.method1605(class255.field3885, (byte) 48);
                        class43.field639.method1577((byte) 51, client.field2381.method1966(20254));
                        class43.field639.method1577((byte) 65, class228.field3444.method1966(20254));
                        class43.field639.method1577((byte) 111, class186.field2816.method1966(20254));
                        class43.field639.method1577((byte) 77, class265.field4001.method1966(20254));
                        class43.field639.method1577((byte) 79, field3861.method1966(20254));
                        class43.field639.method1577((byte) 89, class165.field2540.method1966(20254));
                        class43.field639.method1577((byte) 50, class143.field2090.method1966(20254));
                        class43.field639.method1577((byte) 32, class192.field2959.method1966(20254));
                        class43.field639.method1577((byte) 53, class295.field4675.method1966(20254));
                        class43.field639.method1577((byte) 58, class17.field203.method1966(20254));
                        class43.field639.method1577((byte) 87, class174.field2657.method1966(20254));
                        class43.field639.method1577((byte) 88, class227.field3400.method1966(20254));
                        class43.field639.method1577((byte) 90, class176.field2697.method1966(20254));
                        class43.field639.method1577((byte) 97, class58.field917.method1966(20254));
                        class43.field639.method1577((byte) 70, class174.field2651.method1966(20254));
                        class43.field639.method1577((byte) 59, class157.field2351.method1966(20254));
                        class43.field639.method1577((byte) 102, class136.field1994.method1966(20254));
                        class43.field639.method1577((byte) 114, class289.field4515.method1966(20254));
                        class43.field639.method1577((byte) 42, class256.field3902.method1966(20254));
                        class43.field639.method1577((byte) 118, class116.field1765.method1966(20254));
                        class43.field639.method1577((byte) 124, class94.field1489.method1966(20254));
                        class43.field639.method1577((byte) 81, class4.field78.method1966(20254));
                        class43.field639.method1577((byte) 99, class7.field109.method1966(20254));
                        class43.field639.method1577((byte) 86, class196.field2983.method1966(20254));
                        class43.field639.method1577((byte) 82, class50.field812.method1966(20254));
                        class43.field639.method1577((byte) 35, class25.field302.method1966(20254));
                        class43.field639.method1577((byte) 30, class214.field3212.method1966(20254));
                        class43.field639.method1577((byte) 112, class231.field3482.method1966(20254));
                        class43.field639.method1577((byte) 34, class99.field1567.method1966(20254));
                        class43.field639.method1601(class196.field2979.field3723, class196.field2979.field3748, 16, 0);
                        class44.field706.method951(class43.field639.field3748, 123, 0, class43.field639.field3723);
                        class196.field2979.method1101(-102, var5);
                        for (int var6 = 0; ~var6 > -5; ++var6) {
                            var5[var6] += 50;
                        }
                        class100.field1580.method1101(-71, var5);
                        class237.field3570 = 4;
                    }
                    if (class237.field3570 == 4) {
                        if (~class44.field706.method953(0) > -2) {
                            return;
                        }
                        int var7 = class44.field706.method950(arg0);
                        if (~var7 == -22) {
                            class237.field3570 = 7;
                        } else if (~var7 != -30) {
                            if (var7 == 1) {
                                class237.field3570 = 5;
                                class115.field1761 = var7;
                                return;
                            }
                            if (~var7 != -3) {
                                if (var7 == 15) {
                                    class115.field1761 = var7;
                                    class237.field3570 = 0;
                                    return;
                                }
                                if (var7 == 23 && ~class247.field3689 > -2) {
                                    class191.field2933 = 0;
                                    class237.field3570 = 1;
                                    ++class247.field3689;
                                    class44.field706.method955((byte) -73);
                                    class44.field706 = null;
                                    return;
                                }
                                class115.field1761 = var7;
                                class237.field3570 = 0;
                                class44.field706.method955((byte) -82);
                                class44.field706 = null;
                                return;
                            }
                            class237.field3570 = 8;
                        } else {
                            class237.field3570 = 10;
                        }
                    }
                    if (class237.field3570 == 6) {
                        class196.field2979.field3748 = 0;
                        class196.field2979.method1106(17, false);
                        class44.field706.method951(class196.field2979.field3748, 101, 0, class196.field2979.field3723);
                        class237.field3570 = 4;
                    } else if (class237.field3570 == 7) {
                        if (~class44.field706.method953(0) <= -2) {
                            class233.field3516 = (3 + class44.field706.method950(true)) * 60;
                            class237.field3570 = 0;
                            class115.field1761 = 21;
                            class44.field706.method955((byte) -80);
                            class44.field706 = null;
                        }
                    } else if (~class237.field3570 == -11) {
                        if (class44.field706.method953(0) >= 1) {
                            class272.field4096 = class44.field706.method950(true);
                            class237.field3570 = 0;
                            class115.field1761 = 29;
                            class44.field706.method955((byte) 77);
                            class44.field706 = null;
                        }
                    } else {
                        if (class237.field3570 == 8) {
                            if (~class44.field706.method953(0) > -15) {
                                return;
                            }
                            class44.field706.method946(class100.field1580.field3723, true, 14, 0);
                            class100.field1580.field3748 = 0;
                            class256.field3893 = class100.field1580.method1593((byte) 27);
                            class225.field3371 = class100.field1580.method1593((byte) 27);
                            class85.field1354 = ~class100.field1580.method1593((byte) 27) == -2;
                            class41.field610 = ~class100.field1580.method1593((byte) 27) == -2;
                            class86.field1378 = class100.field1580.method1593((byte) 27) == 1;
                            class116.field1762 = ~class100.field1580.method1593((byte) 27) == -2;
                            class66.field1059 = class100.field1580.method1593((byte) 27) == 1;
                            class221.field3334 = class100.field1580.method1575(false);
                            class22.field262 = class100.field1580.method1593((byte) 27) == 1;
                            class106.field1615 = ~class100.field1580.method1593((byte) 27) == -2;
                            class267.method1774(class106.field1615, -1);
                            class106.method668(class106.field1615, 0);
                            if (!class10.field135) {
                                if ((!class85.field1354 || class86.field1378) && !class22.field262) {
                                    try {
                                        class73.method498(class209.field3147.field150, "unzap", (byte) 123);
                                    } catch (Throwable var10) {
                                    }
                                } else {
                                    try {
                                        class73.method498(class209.field3147.field150, "zap", (byte) 123);
                                    } catch (Throwable var9) {
                                    }
                                }
                            }
                            try {
                                class73.method498(class209.field3147.field150, "loggedin", (byte) 126);
                            } catch (Throwable var8) {
                            }
                            class246.field3683 = class100.field1580.method1094(17013);
                            class202.field3050 = class100.field1580.method1575(false);
                            class237.field3570 = 9;
                        }
                        if (~class237.field3570 == -10) {
                            if (~class44.field706.method953(0) <= ~class202.field3050) {
                                class100.field1580.field3748 = 0;
                                class44.field706.method946(class100.field1580.field3723, arg0, class202.field3050, 0);
                                class115.field1761 = 2;
                                class237.field3570 = 0;
                                class124.method783(true);
                                class132.field1940 = -1;
                                class151.method914(false, arg0);
                                class246.field3683 = -1;
                            }
                        }
                    }
                } catch (IOException var11) {
                    if (class44.field706 != null) {
                        class44.field706.method955((byte) -110);
                        class44.field706 = null;
                    }
                    if (~class247.field3689 <= -2) {
                        class115.field1761 = -4;
                        class237.field3570 = 0;
                    } else {
                        ++class247.field3689;
                        class237.field3570 = 1;
                        if (~class278.field4192 == ~class256.field3897) {
                            class256.field3897 = class284.field4257;
                        } else {
                            class256.field3897 = class278.field4192;
                        }
                        class191.field2933 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field3862;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (arg1 <= 70) {
            field3865 = -90;
        }
        if (super.field2804.field1384) {
            for (int var4 = 0; class174.field2648 > var4; ++var4) {
                this.method1674(var4, 111, arg0);
                int[] var5 = this.method1146((byte) 120, class183.field2761, 0);
                var3[var4] = var5[class151.field2171];
            }
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3867[var1] = var0 / 4;
        }
        field3869 = false;
    }
}
