import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class240 {

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "B")
    private byte field3662;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lec;")
    public static class99 field3655 = new class99(30);

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "[I")
    public static int[] field3665 = new int[256];

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3668 = "Please remove ";

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field3669 = 0;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "La;")
    public static class281 field3671;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3672;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "F")
    public static float field3666;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[[[B")
    public static byte[][][] field3653;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1666(byte arg0) {
        field3658++;
        class224.field3428.method752(false);
        class71.field1021.method752(false);
        int var1 = 125 % ((18 - arg0) / 51);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIII)V", line = 24)
    public static final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class10.field142 = 0;
        for (int var7 = -1; var7 < class52.field702 + class234.field3563; var7++) {
            class305 var8;
            if (var7 == -1) {
                var8 = class39.field575;
            } else if (var7 < class234.field3563) {
                var8 = class201.field3096[class291.field4475[var7]];
            } else {
                var8 = class264.field4064[class272.field4252[var7 - class234.field3563]];
            }
            if (var8 != null && var8.method598(-95)) {
                if (var8 instanceof class76) {
                    class332 var9 = ((class76) var8).field1104;
                    if (var9.field5162 != null) {
                        var9 = var9.method2324((byte) -124);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class234.field3563 <= var7) {
                    class332 var10 = ((class76) var8).field1104;
                    if (var10.field5162 != null) {
                        var10 = var10.method2324((byte) -124);
                    }
                    if (var10.field5145 >= 0 && class49.field673.length > var10.field5145) {
                        int var11;
                        if (var10.field5184 == -1) {
                            var11 = var8.method2096(-11164) + 15;
                        } else {
                            var11 = var10.field5184 + 15;
                        }
                        class190.method1403(arg5 >> 1, var11, arg3, arg4 >> 1, arg0, (byte) -49, var8);
                        if (class335.field5220 > -1) {
                            class49.field673[var10.field5145].method124(class335.field5220 + arg6 - 12, arg2 + -30 + class205.field3138);
                        }
                    }
                    class279[] var12 = class118.field1837;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class279 var14 = var12[var13];
                        if (var14 != null && var14.field4338 == 1 && class272.field4252[var7 - class234.field3563] == var14.field4328 && class233.field3542 % 20 < 10) {
                            int var15;
                            if (var10.field5184 == -1) {
                                var15 = var8.method2096(-11164) + 15;
                            } else {
                                var15 = var10.field5184 + 15;
                            }
                            class190.method1403(arg5 >> 1, var15, arg3, arg4 >> 1, arg0, (byte) -49, var8);
                            if (class335.field5220 > -1) {
                                class320.field4949[var14.field4337].method124(class335.field5220 + arg6 - 12, arg2 - (-class205.field3138 + 28));
                            }
                        }
                    }
                } else {
                    class270 var16 = (class270) var8;
                    int var17 = 30;
                    if (var16.field4222 != -1 || var16.field4191 != -1) {
                        class190.method1403(arg5 >> 1, var8.method2096(-11164) + 15, arg3, arg4 >> 1, arg0, (byte) -49, var8);
                        if (class335.field5220 > -1) {
                            if (var16.field4222 != -1) {
                                class279.field4335[var16.field4222].method124(class335.field5220 + arg6 - 12, class205.field3138 + arg2 + -var17);
                                var17 += 25;
                            }
                            if (var16.field4191 != -1) {
                                class49.field673[var16.field4191].method124(arg6 + class335.field5220 - 12, class205.field3138 + arg2 + -var17);
                                var17 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class279[] var18 = class118.field1837;
                        for (int var19 = 0; var19 < var18.length; var19++) {
                            class279 var20 = var18[var19];
                            if (var20 != null && var20.field4338 == 10 && class291.field4475[var7] == var20.field4328) {
                                class190.method1403(arg5 >> 1, var8.method2096(-11164) + 15, arg3, arg4 >> 1, arg0, (byte) -49, var8);
                                if (class335.field5220 > -1) {
                                    class320.field4949[var20.field4337].method124(class335.field5220 + arg6 - 12, arg2 - -class205.field3138 + -var17);
                                }
                            }
                        }
                    }
                }
                if (var8.field4762 != null && (class234.field3563 <= var7 || class130.field2001 == 0 || class130.field2001 == 3 || class130.field2001 == 1 && class97.method727(((class270) var8).field4218, false))) {
                    class190.method1403(arg5 >> 1, var8.method2096(-11164), arg3, arg4 >> 1, arg0, (byte) -49, var8);
                    if (class335.field5220 > -1 && class54.field715 > class10.field142) {
                        class54.field719[class10.field142] = class167.field2703.method2281(var8.field4762) / 2;
                        class54.field716[class10.field142] = class167.field2703.field5022;
                        class54.field718[class10.field142] = class335.field5220;
                        class54.field714[class10.field142] = class205.field3138;
                        class54.field712[class10.field142] = var8.field4766;
                        class54.field720[class10.field142] = var8.field4776;
                        class54.field717[class10.field142] = var8.field4678;
                        class54.field711[class10.field142] = var8.field4762;
                        class10.field142++;
                    }
                }
                if (class233.field3542 < var8.field4677) {
                    class269 var21 = class163.field2642[1];
                    class269 var22 = class163.field2642[0];
                    int var23;
                    if ((var8 instanceof class76)) {
                        class76 var24 = (class76) var8;
                        class269[] var25 = (class269[]) ((class269[]) class299.field4604.method747((long) var24.field1104.field5172, (byte) 81));
                        if (var25 == null) {
                            var25 = class309.method2118(var24.field1104.field5172, 0, class264.field4087, 0);
                            if (var25 != null) {
                                class299.field4604.method744(var25, -15692, (long) var24.field1104.field5172);
                            }
                        }
                        class332 var26 = var24.field1104;
                        if (var25 != null && var25.length == 2) {
                            var21 = var25[1];
                            var22 = var25[0];
                        }
                        if (var26.field5184 == -1) {
                            var23 = var8.method2096(-11164);
                        } else {
                            var23 = var26.field5184;
                        }
                    } else {
                        var23 = var8.method2096(-11164);
                    }
                    class190.method1403(arg5 >> 1, var23 + var22.field4184 + 10, arg3, arg4 >> 1, arg0, (byte) -49, var8);
                    if (class335.field5220 > -1) {
                        int var27 = arg6 + class335.field5220 - (var22.field4175 >> 1);
                        int var28 = arg2 + class205.field3138 - 3;
                        var22.method124(var27, var28);
                        int var29 = var8.field4761 * var22.field4175 / 255;
                        int var30 = var22.field4184;
                        if (class73.field1058) {
                            class175.method1318(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class287.method1988(var27, var28, var27 + var29, var28 + var30);
                        }
                        var21.method124(var27, var28);
                        if (class73.field1058) {
                            class175.method1316(arg6, arg2, arg6 + arg5, arg2 + arg4);
                        } else {
                            class287.method1980(arg6, arg2, arg5 + arg6, arg2 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field4702[var31] > class233.field3542) {
                        int var34;
                        if (var8 instanceof class76) {
                            class76 var32 = (class76) var8;
                            class332 var33 = var32.field1104;
                            if (var33.field5184 == -1) {
                                var34 = var8.method2096(-11164) / 2;
                            } else {
                                var34 = var33.field5184 / 2;
                            }
                        } else {
                            var34 = var8.method2096(-11164) / 2;
                        }
                        class190.method1403(arg5 >> 1, var34, arg3, arg4 >> 1, arg0, (byte) -49, var8);
                        if (class335.field5220 > -1) {
                            if (var31 == 1) {
                                class205.field3138 -= 20;
                            }
                            if (var31 == 2) {
                                class205.field3138 -= 10;
                                class335.field5220 -= 15;
                            }
                            if (var31 == 3) {
                                class205.field3138 -= 10;
                                class335.field5220 += 15;
                            }
                            class336.field5232[var8.field4670[var31]].method124(arg6 + class335.field5220 - 12, class205.field3138 + -12 + arg2);
                            class300.field4623.method2265(Integer.toString(var8.field4687[var31]), class335.field5220 + arg6 - 1, arg2 - (-class205.field3138 + -3), 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg1 <= 76) {
            field3665 = (int[]) null;
        }
        for (int var35 = 0; var35 < class10.field142; var35++) {
            int var36 = class54.field718[var35];
            int var37 = class54.field714[var35];
            int var38 = class54.field716[var35];
            int var39 = class54.field719[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class54.field714[var41] - class54.field716[var41]) < (var37 + 2) && class54.field714[var41] + 2 > -var38 + var37 && class54.field719[var41] + class54.field718[var41] > -var39 + var36 && var36 + var39 > class54.field718[var41] + -class54.field719[var41] && var37 > (class54.field714[var41] - class54.field716[var41])) {
                        var40 = true;
                        var37 = class54.field714[var41] - class54.field716[var41];
                    }
                }
            }
            class335.field5220 = class54.field718[var35];
            class205.field3138 = class54.field714[var35] = var37;
            String var42 = class54.field711[var35];
            if (class78.field1140 == 0) {
                int var43 = 16776960;
                if (class54.field712[var35] < 6) {
                    var43 = class84.field1231[class54.field712[var35]];
                }
                if (class54.field712[var35] == 6) {
                    var43 = (class211.field3240 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class54.field712[var35] == 7) {
                    var43 = class211.field3240 % 20 >= 10 ? 65535 : 255;
                }
                if (class54.field712[var35] == 8) {
                    var43 = (class211.field3240 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class54.field712[var35] == 9) {
                    int var44 = 150 - class54.field717[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 - 50) * 327680;
                    } else if (var44 < 150) {
                        var43 = ((var44 - 100) * 5) + 65280;
                    }
                }
                if (class54.field712[var35] == 10) {
                    int var45 = 150 - class54.field717[var35];
                    if (var45 < 50) {
                        var43 = (var45 * 5) + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16384000 + 16711935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - (var45 * 5 + -500);
                    }
                }
                if (class54.field712[var35] == 11) {
                    int var46 = 150 - class54.field717[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 32768000 + 16777215 - (var46 * 327680);
                    }
                }
                if (class54.field720[var35] == 0) {
                    class167.field2703.method2265(var42, class335.field5220 + arg6, class205.field3138 + arg2, var43, 0);
                }
                if (class54.field720[var35] == 1) {
                    class167.field2703.method2269(var42, class335.field5220 + arg6, class205.field3138 + arg2, var43, 0, class211.field3240);
                }
                if (class54.field720[var35] == 2) {
                    class167.field2703.method2282(var42, class335.field5220 + arg6, class205.field3138 + arg2, var43, 0, class211.field3240);
                }
                if (class54.field720[var35] == 3) {
                    class167.field2703.method2267(var42, class335.field5220 + arg6, class205.field3138 + arg2, var43, 0, class211.field3240, 150 - class54.field717[var35]);
                }
                if (class54.field720[var35] == 4) {
                    int var47 = (150 - class54.field717[var35]) * (class167.field2703.method2281(var42) + 100) / 150;
                    if (class73.field1058) {
                        class175.method1318(arg6 + class335.field5220 - 50, arg2, arg6 + class335.field5220 + 50, arg2 + arg4);
                    } else {
                        class287.method1988(class335.field5220 + arg6 - 50, arg2, class335.field5220 + arg6 + 50, arg2 + arg4);
                    }
                    class167.field2703.method2274(var42, class335.field5220 + arg6 + 50 - var47, arg2 - -class205.field3138, var43, 0);
                    if (class73.field1058) {
                        class175.method1316(arg6, arg2, arg5 + arg6, arg2 - -arg4);
                    } else {
                        class287.method1980(arg6, arg2, arg5 + arg6, arg2 + arg4);
                    }
                }
                if (class54.field720[var35] == 5) {
                    int var48 = 150 - class54.field717[var35];
                    if (class73.field1058) {
                        class175.method1318(arg6, class205.field3138 + arg2 - class167.field2703.field5022 - 1, arg5 + arg6, class205.field3138 + arg2 + 5);
                    } else {
                        class287.method1988(arg6, arg2 + class205.field3138 - class167.field2703.field5022 - 1, arg5 + arg6, arg2 + class205.field3138 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class167.field2703.method2265(var42, class335.field5220 + arg6, class205.field3138 + var49 + arg2, var43, 0);
                    if (class73.field1058) {
                        class175.method1316(arg6, arg2, arg6 + arg5, arg2 + arg4);
                    } else {
                        class287.method1980(arg6, arg2, arg5 + arg6, arg2 + arg4);
                    }
                }
            } else {
                class167.field2703.method2265(var42, class335.field5220 + arg6, class205.field3138 + arg2, 16776960, 0);
            }
        }
        field3664++;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 510)
    public class240() {
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)I", line = 514)
    public final int method1668(byte arg0) {
        field3657++;
        if (arg0 != 126) {
            this.method1670((byte) -96);
        }
        return (this.field3662 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lwm;)V", line = 531)
    public class240(class254 arg0) {
        this.field3662 = arg0.method1733(2023893896);
        this.field3656 = arg0.method1755(false);
        this.field3661 = arg0.method1741(-32769);
        this.field3654 = arg0.method1741(-32769);
        this.field3659 = arg0.method1741(-32769);
        this.field3660 = arg0.method1741(-32769);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3665[var0] = var1;
        }
        field3670 = 0;
        field3671 = new class281();
        field3672 = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V", line = 552)
    public static void method1669(byte arg0) {
        field3672 = null;
        field3671 = null;
        field3653 = (byte[][][]) null;
        field3655 = null;
        if (arg0 < 83) {
            method1669((byte) -34);
        }
        field3668 = null;
        field3665 = null;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)I", line = 567)
    public final int method1670(byte arg0) {
        field3663++;
        return arg0 == 43 ? this.field3662 & 0x7 : -109;
    }
}
