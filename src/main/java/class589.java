import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class589 extends class529 {

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "Z")
    public static boolean field8222 = false;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8217 = new BigInteger("a04de4d8fd16b66290a5590a331e4189285bf63947ce81b587782fb92de6f68d278ec6f46c8416d9151ac3f021686c72d1436e169b3b73c07f62b9eca687f2a34d178e05dd1ed799c03d3953b9b59af99c297db275697afa7d56b49a222e0d59373345e06cd3887a2b3b093564d7f6eeafd38e37e3ea5c62f5985fb3cb490d2b29d503ba315ac9a47d26434cf44dd00971fd68b2531c6402a9731fe4bafeb70140db127b1551b962bfb6fce46c11dbba5f9f49c151594d9e53dfc8a9cc963a72f436611b2f5d0d2a815e9ab907bdb519f682253cc152b633cc3c5dd0955d4443da638d9955b77774541fb6c7d00454980d0b673d60e2983a0c075a11fe6a50e196e3b828cf2ad1816d3d3c70914673158678cb29d6a64b7d15714c1426f527601c25e6276de257c3c5cd389f3b1dbef4901722e178ee05a7782fae1fe591b1f01addee2123c424aa4daa23e0c428e234c6cee33b67ec0c8a49a636c63a0cca859dc77012b9c94901e446b1a4a50aef9c2b54f5ad2b034a0c46d04bee3b03570edca3d75173b1774e6e8b02e03d9962079ad28dbf78079afec120da50b62004bc4f0b0861f27b82586fce91841ec0d6420cd34469d5b1e6e2f830da234fb92473eb49f1b3dc14d427155b5744455293a3cba347ae394aec6d7f49df2ab8fe1def6445cf40f08370498cfd4624be352edbf2af1f197367beda3301e939fe9ca6d9", 16);

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "Ljt;")
    public static class635 field8224 = new class635(0);

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "Lkha;")
    public static class687 field8214;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public static final byte[] method3271(String arg0, boolean arg1) {
        ++field8221;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (!arg1) {
            method3272(62, -55, 48, -124, 57, -17, true, -83, -13, (class685) null, 56);
        }
        for (int var4 = 0; var2 > var4; ++var4) {
            char var5 = arg0.charAt(var4);
            if (var5 > 0 && ~var5 > -129 || ~var5 <= -161 && ~var5 >= -256) {
                var3[var4] = (byte) var5;
            } else if (var5 == 8364) {
                var3[var4] = -128;
            } else if (~var5 == -8219) {
                var3[var4] = -126;
            } else if (var5 != 402) {
                if (var5 == 8222) {
                    var3[var4] = -124;
                } else if (~var5 == -8231) {
                    var3[var4] = -123;
                } else if (~var5 != -8225) {
                    if (~var5 != -8226) {
                        if (~var5 != -711) {
                            if (~var5 != -8241) {
                                if (~var5 != -353) {
                                    if (~var5 != -8250) {
                                        if (var5 == 338) {
                                            var3[var4] = -116;
                                        } else if (~var5 == -382) {
                                            var3[var4] = -114;
                                        } else if (~var5 != -8217) {
                                            if (var5 != 8217) {
                                                if (~var5 == -8221) {
                                                    var3[var4] = -109;
                                                } else if (var5 != 8221) {
                                                    if (var5 != 8226) {
                                                        if (~var5 == -8212) {
                                                            var3[var4] = -106;
                                                        } else if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                                if (var5 == 8482) {
                                                                    var3[var4] = -103;
                                                                } else if (var5 == 353) {
                                                                    var3[var4] = -102;
                                                                } else if (var5 != 8250) {
                                                                    if (var5 == 339) {
                                                                        var3[var4] = -100;
                                                                    } else if (~var5 != -383) {
                                                                        if (~var5 == -377) {
                                                                            var3[var4] = -97;
                                                                        } else {
                                                                            var3[var4] = 63;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -98;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -101;
                                                                }
                                                            } else {
                                                                var3[var4] = -104;
                                                            }
                                                        } else {
                                                            var3[var4] = -105;
                                                        }
                                                    } else {
                                                        var3[var4] = -107;
                                                    }
                                                } else {
                                                    var3[var4] = -108;
                                                }
                                            } else {
                                                var3[var4] = -110;
                                            }
                                        } else {
                                            var3[var4] = -111;
                                        }
                                    } else {
                                        var3[var4] = -117;
                                    }
                                } else {
                                    var3[var4] = -118;
                                }
                            } else {
                                var3[var4] = -119;
                            }
                        } else {
                            var3[var4] = -120;
                        }
                    } else {
                        var3[var4] = -121;
                    }
                } else {
                    var3[var4] = -122;
                }
            } else {
                var3[var4] = -125;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIZIILrl;I)Z")
    public static final boolean method3272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class685 arg9, int arg10) {
        ++field8216;
        int var11 = arg3;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg3;
        int var16 = -var14 + arg1;
        class673.field9171[var13][var14] = 99;
        class293.field3824[var13][var14] = 0;
        byte var17 = 0;
        class36.field540[var17] = arg3;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class635.field8803[var10001] = arg1;
        int[][] var19 = arg9.field9700;
        while (var26 != var18) {
            var11 = class36.field540[var18];
            var12 = class635.field8803[var18];
            int var20 = -var16 + var12;
            int var21 = -var15 + var11;
            var18 = var18 + 1 & 4095;
            int var22 = -arg9.field9685 + var11;
            int var23 = var12 - arg9.field9679;
            if (~arg4 != 3) {
                if (arg4 != -3) {
                    if (arg4 != -2) {
                        if (~arg4 != 0) {
                            if (~arg4 != -1 && ~arg4 != -2 && ~arg4 != -3 && ~arg4 != -4 && ~arg4 != -10) {
                                if (arg9.method3801(var12, arg7, arg4, 2, arg0, arg2, var11, (byte) 124)) {
                                    class197.field2538 = var11;
                                    class570.field7944 = var12;
                                    return true;
                                }
                            } else if (arg9.method3808(var12, 2, -126, arg7, arg4, arg0, var11, arg2)) {
                                class570.field7944 = var12;
                                class197.field2538 = var11;
                                return true;
                            }
                        } else if (arg9.method3802(arg7, var11, arg6, arg5, arg10, arg2, 2, arg8, var12)) {
                            class570.field7944 = var12;
                            class197.field2538 = var11;
                            return true;
                        }
                    } else if (arg9.method3797(2, arg8, arg2, var12, arg5, 2, arg10, arg7, (byte) 121, var11)) {
                        class197.field2538 = var11;
                        class570.field7944 = var12;
                        return true;
                    }
                } else if (class406.method2409((byte) -116, arg5, var11, arg8, 2, arg7, arg2, 2, var12)) {
                    class570.field7944 = var12;
                    class197.field2538 = var11;
                    return true;
                }
            } else if (~arg7 == ~var11 && ~arg2 == ~var12) {
                class197.field2538 = var11;
                class570.field7944 = var12;
                return true;
            }
            int var25 = class293.field3824[var21][var20] + 1;
            if (var21 > 0 && class673.field9171[var21 + -1][var20] == 0 && ~(var19[var22 + -1][var23] & 1134821376) == -1 && ~(var19[var22 + -1][var23 - -1] & 1310982144) == -1) {
                class36.field540[var26] = var11 - 1;
                class635.field8803[var26] = var12;
                class673.field9171[var21 + -1][var20] = 2;
                var26 = var26 + 1 & 4095;
                class293.field3824[var21 + -1][var20] = var25;
            }
            if (~var21 > -127 && class673.field9171[var21 + 1][var20] == 0 && (1625554944 & var19[var22 + 2][var23]) == 0 && ~(var19[var22 - -2][var23 + 1] & 2015625216) == -1) {
                class36.field540[var26] = var11 + 1;
                class635.field8803[var26] = var12;
                class673.field9171[var21 - -1][var20] = 8;
                var26 = var26 - -1 & 4095;
                class293.field3824[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class673.field9171[var21][var20 + -1] == 0 && ~(1134821376 & var19[var22][var23 + -1]) == -1 && ~(1625554944 & var19[var22 - -1][var23 + -1]) == -1) {
                class36.field540[var26] = var11;
                class635.field8803[var26] = var12 + -1;
                class673.field9171[var21][var20 + -1] = 1;
                var26 = 4095 & var26 - -1;
                class293.field3824[var21][var20 + -1] = var25;
            }
            if (var20 < 126 && ~class673.field9171[var21][var20 + 1] == -1 && (var19[var22][var23 + 2] & 1310982144) == 0 && ~(2015625216 & var19[var22 + 1][var23 + 2]) == -1) {
                class36.field540[var26] = var11;
                class635.field8803[var26] = var12 + 1;
                var26 = 4095 & var26 - -1;
                class673.field9171[var21][var20 + 1] = 4;
                class293.field3824[var21][var20 - -1] = var25;
            }
            if (var21 > 0 && var20 > 0 && ~class673.field9171[var21 - 1][var20 + -1] == -1 && (1336147968 & var19[var22 + -1][var23]) == 0 && (1134821376 & var19[var22 + -1][var23 + -1]) == 0 && (1675886592 & var19[var22][var23 + -1]) == 0) {
                class36.field540[var26] = var11 - 1;
                class635.field8803[var26] = var12 - 1;
                var26 = 4095 & var26 + 1;
                class673.field9171[var21 - 1][var20 - 1] = 3;
                class293.field3824[var21 + -1][var20 + -1] = var25;
            }
            if (~var21 > -127 && ~var20 < -1 && ~class673.field9171[var21 + 1][var20 + -1] == -1 && (var19[var22 - -1][var23 - 1] & 1675886592) == 0 && (1625554944 & var19[var22 + 2][var23 - 1]) == 0 && ~(2028208128 & var19[var22 + 2][var23]) == -1) {
                class36.field540[var26] = var11 + 1;
                class635.field8803[var26] = var12 - 1;
                class673.field9171[var21 + 1][var20 + -1] = 9;
                var26 = var26 + 1 & 4095;
                class293.field3824[var21 + 1][var20 - 1] = var25;
            }
            if (~var21 < -1 && var20 < 126 && ~class673.field9171[var21 + -1][var20 + 1] == -1 && ~(1336147968 & var19[var22 - 1][var23 + 1]) == -1 && ~(1310982144 & var19[var22 + -1][var23 + 2]) == -1 && ~(var19[var22][var23 - -2] & 2116288512) == -1) {
                class36.field540[var26] = var11 + -1;
                class635.field8803[var26] = var12 - -1;
                var26 = var26 + 1 & 4095;
                class673.field9171[var21 + -1][var20 + 1] = 6;
                class293.field3824[var21 + -1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && ~class673.field9171[var21 + 1][var20 - -1] == -1 && ~(2116288512 & var19[var22 + 1][var23 + 2]) == -1 && ~(2015625216 & var19[var22 + 2][var23 + 2]) == -1 && ~(var19[var22 + 2][var23 + 1] & 2028208128) == -1) {
                class36.field540[var26] = var11 + 1;
                class635.field8803[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class673.field9171[var21 + 1][var20 - -1] = 12;
                class293.field3824[var21 - -1][var20 + 1] = var25;
            }
        }
        class570.field7944 = var12;
        if (!arg6) {
            method3276(true);
        }
        class197.field2538 = var11;
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V")
    public static void method3273(int arg0) {
        if (arg0 != -1) {
            field8224 = null;
        }
        field8214 = null;
        field8224 = null;
        field8217 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
    public static final void method3274(int arg0, int arg1) {
        ++field8215;
        int var2 = -class501.field7065 + class266.field3368;
        if (~var2 <= -101) {
            class276.field3497 = 1;
            class335.field4311 = -1;
            class147.field1783 = -1;
        } else {
            int var3 = (int) class602.field8360;
            if (class631.field8765 >> 8 > var3) {
                var3 = class631.field8765 >> 8;
            }
            if (class488.field6948[4] && ~(class503.field7078[4] + 128) < ~var3) {
                var3 = class503.field7078[4] - -128;
            }
            int var4 = 16383 & (int) class748.field10471 + class401.field5560;
            class595.method3297(false, class592.method3287(false, class339.field4374.field5784, class223.field2946, class339.field4374.field5790) + -200, (var3 >> 3) * 3 + 600 << 2, class742.field10372, arg0, class175.field2278, var3, var4);
            float var5 = 1.0F - (float) ((-var2 + 100) * (-var2 + 100) * (-var2 + arg1)) / 1000000.0F;
            class407.field5744 = (int) ((float) (class407.field5744 - class170.field2244) * var5 + (float) class170.field2244);
            class411.field5801 = (int) ((float) (-class235.field3035 + class411.field5801) * var5 + (float) class235.field3035);
            class524.field7412 = (int) ((float) (-class597.field8276 + class524.field7412) * var5 + (float) class597.field8276);
            class505.field7134 = (int) ((float) (-class408.field5759 + class505.field7134) * var5 + (float) class408.field5759);
            int var6 = class688.field9781 - class730.field10224;
            if (var6 <= 8192) {
                if (~var6 > 8191) {
                    var6 += 16384;
                }
            } else {
                var6 -= 16384;
            }
            class688.field9781 = (int) ((float) var6 * var5 + (float) class730.field10224);
            class688.field9781 &= 16383;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
    public class589() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IB)Z")
    public static final boolean method3275(int arg0, byte arg1) {
        if (arg1 != -88) {
            field8224 = null;
        }
        ++field8219;
        if (~arg0 != -16 && ~arg0 != -61 && arg0 != 17 && arg0 != 22 && ~arg0 != -9) {
            return ~arg0 == -59 || ~arg0 == -1013;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field8223;
        int[] var3 = super.field7456.method1635(arg0, -83);
        if (super.field7456.field3449) {
            int[][] var4 = this.method3026(0, arg0, 18464);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class304.field3909 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        int var9 = -20 % ((arg1 - 27) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
    public static final void method3276(boolean arg0) {
        ++field8220;
        int var1 = 0;
        if (arg0) {
            field8214 = null;
        }
        while (class9.field95 > var1) {
            int var2 = class83.field1071[var1];
            class124 var3 = ((class247) class563.field7875.method3248((long) var2, 0)).field3158;
            int var4 = class24.field414.method1094(255);
            if ((32 & var4) != 0) {
                var4 += class24.field414.method1094(255) << 8;
            }
            if (~(var4 & 64) != -1) {
                int var5 = class24.field414.method1107(false);
                int var6 = class24.field414.method1156(-3);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var7 = class24.field414.method1117((byte) -73);
                int var8 = 7 & var7;
                int var9 = (125 & var7) >> 3;
                if (~var9 == -16) {
                    var9 = -1;
                }
                var3.method261(var6, var9, false, (byte) 36, var5, var8);
            }
            if ((128 & var4) != 0) {
                if (var3.field1486.method965(-1)) {
                    class39.method336(var3, 31);
                }
                var3.method803(-104, class598.field8304.method1452(class24.field414.method1122(18726), 64));
                var3.method254(var3.field1486.field1928, (byte) -19);
                var3.field335 = var3.field1486.field1966 << 3;
                if (var3.field1486.method965(-1)) {
                    class274.method1642(var3.field435[0], (class546) null, var3.field426[0], var3.field5779, (byte) -112, (class290) null, 0, var3);
                }
            }
            if ((var4 & 4096) != 0) {
                int var10 = class24.field414.method1153(!arg0);
                int var11 = class24.field414.method1095((byte) 114);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var12 = class24.field414.method1094(255);
                int var13 = 7 & var12;
                int var14 = 15 & var12 >> 3;
                if (var14 == 15) {
                    var14 = -1;
                }
                var3.method261(var11, var14, true, (byte) 36, var10, var13);
            }
            if ((512 & var4) != 0) {
                var3.field365 = class24.field414.method1131(-128);
                var3.field398 = class24.field414.method1136((byte) -102);
                var3.field344 = class24.field414.method1133(8);
                var3.field380 = (byte) class24.field414.method1140((byte) 124);
                var3.field333 = class266.field3368 - -class24.field414.method1122(18726);
                var3.field327 = class266.field3368 - -class24.field414.method1107(false);
            }
            if ((var4 & 8) != 0) {
                var3.field1478 = class24.field414.method1153(!arg0);
                var3.field1485 = class24.field414.method1107(arg0);
            }
            if ((2048 & var4) != 0) {
                int var15 = class24.field414.method1117((byte) -73);
                int[] var16 = new int[var15];
                int[] var17 = new int[var15];
                int[] var18 = new int[var15];
                for (int var19 = 0; ~var19 > ~var15; ++var19) {
                    int var20 = class24.field414.method1107(false);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    var16[var19] = var20;
                    var17[var19] = class24.field414.method1140((byte) 121);
                    var18[var19] = class24.field414.method1122(18726);
                }
                class540.method3073(var16, false, var17, var3, var18);
            }
            if ((16 & var4) != 0) {
                var3.field334 = class24.field414.method1106(-1);
                var3.field345 = 100;
            }
            if ((var4 & 1) != 0) {
                int var21 = class24.field414.method1117((byte) -73);
                if (~var21 < -1) {
                    for (int var22 = 0; ~var22 > ~var21; ++var22) {
                        int var23 = -1;
                        int var24 = -1;
                        int var25 = class24.field414.method1158(-32768);
                        int var26 = -1;
                        if (var25 == 32767) {
                            var25 = class24.field414.method1158(-32768);
                            var24 = class24.field414.method1158(-32768);
                            var23 = class24.field414.method1158(-32768);
                            var26 = class24.field414.method1158(-32768);
                        } else if (var25 != 32766) {
                            var24 = class24.field414.method1158(-32768);
                        } else {
                            var25 = -1;
                        }
                        int var27 = class24.field414.method1158(-32768);
                        int var28 = class24.field414.method1140((byte) 121);
                        var3.method257(var24, class266.field3368, var27, var25, var26, var28, var23, (byte) -103);
                    }
                }
            }
            if ((var4 & 8192) != 0) {
                var3.field406 = class24.field414.method1136((byte) -102);
                var3.field366 = class24.field414.method1136((byte) -102);
                var3.field342 = class24.field414.method1133(8);
                var3.field341 = class24.field414.method1136((byte) -102);
                var3.field339 = class24.field414.method1119(false) - -class266.field3368;
                var3.field355 = class24.field414.method1153(true) - -class266.field3368;
                var3.field330 = class24.field414.method1094(255);
                var3.field342 += var3.field435[0];
                var3.field427 = 1;
                var3.field434 = 0;
                var3.field341 += var3.field426[0];
                var3.field406 += var3.field435[0];
                var3.field366 += var3.field426[0];
            }
            if (~(16384 & var4) != -1) {
                int var29 = class24.field414.method1094(255);
                int[] var30 = new int[var29];
                int[] var31 = new int[var29];
                for (int var32 = 0; var32 < var29; ++var32) {
                    int var33 = class24.field414.method1122(18726);
                    if ((49152 & var33) != 49152) {
                        var30[var32] = var33;
                    } else {
                        int var34 = class24.field414.method1122(18726);
                        var30[var32] = class216.method1308(var34, var33 << 16);
                    }
                    var31[var32] = class24.field414.method1107(false);
                }
                var3.method255(var31, var30, -83);
            }
            if (~(2 & var4) != -1) {
                var3.field407 = class24.field414.method1153(!arg0);
                if (~var3.field407 == -65536) {
                    var3.field407 = -1;
                }
            }
            if (~(var4 & 4) != -1) {
                int[] var35 = new int[4];
                for (int var36 = 0; ~var36 > -5; ++var36) {
                    var35[var36] = class24.field414.method1119(arg0);
                    if (~var35[var36] == -65536) {
                        var35[var36] = -1;
                    }
                }
                int var37 = class24.field414.method1140((byte) 121);
                class216.method1307(var3, var35, -127, var37);
            }
            if ((var4 & 256) != 0) {
                int var38 = class24.field414.method1119(arg0);
                var3.field416 = class24.field414.method1094(255);
                var3.field350 = class24.field414.method1140((byte) 121);
                var3.field372 = (var38 & 32768) != 0;
                var3.field411 = var38 & 32767;
                var3.field394 = var3.field411 - -var3.field416 + class266.field3368;
            }
            ++var1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3277(boolean arg0, int arg1, int arg2) {
        ++field8218;
        if (!arg0) {
            return false;
        } else {
            return (2048 & arg1) != 0;
        }
    }
}
