import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class196 extends class694 {

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    private int field2896 = 1024;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    private int field2893 = 0;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    private int field2903 = 2048;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    private int field2901 = 409;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    private int field2891 = 1024;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    private int field2906 = 819;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    private int field2904 = 1024;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    private int field2905 = 1024;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    private int field2907 = 0;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)I", line = 4)
    public static final int method1319(int arg0, int arg1, int arg2) {
        ++field2902;
        if (arg0 != 1 && arg0 != 3) {
            int var3 = 38 / ((14 - arg1) / 63);
            return class1.field10[arg2 & 3];
        } else {
            return class93.field1228[3 & arg2];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILoa;)V", line = 19)
    public static final void method1320(int arg0, class638 arg1) {
        ++field2900;
        if ((class315.field4697 >= 2 || class457.field6455) && class612.field8489 == null) {
            if (arg0 <= -50) {
                String var2;
                if (class457.field6455 && ~class315.field4697 > -3) {
                    var2 = class281.field3927 + class9.field166.method42(class666.field9377, 19572) + class73.field1010 + " ->";
                } else if (class46.field689 && class531.field7246.method666(50, 81) && class315.field4697 > 2) {
                    var2 = class172.method1183((class345) class487.field6761.field2826.field7306.field7306, 0);
                } else {
                    class345 var3 = (class345) class487.field6761.field2826.field7306;
                    var2 = class172.method1183(var3, 0);
                    int[] var4 = null;
                    if (!class375.method2187(var3.field4983, false)) {
                        if (~var3.field4980 != 0) {
                            var4 = class648.field9184.method3064(var3.field4980, -55).field3610;
                        } else if (!class287.method1729(var3.field4983, (byte) 17)) {
                            if (class471.method2680(var3.field4983, -14)) {
                                Object var5 = null;
                                class620 var6;
                                if (var3.field4983 == 1007) {
                                    var6 = class164.field2499.method2013((int) var3.field4979, false);
                                } else {
                                    var6 = class164.field2499.method2013((int) (var3.field4979 >>> 32 & 2147483647L), false);
                                }
                                if (var6.field8623 != null) {
                                    var6 = var6.method3450(-125, class195.field2888);
                                }
                                if (var6 != null) {
                                    var4 = var6.field8572;
                                }
                            }
                        } else {
                            class178 var7 = (class178) class323.field4762.method2061(-17305, (long) ((int) var3.field4979));
                            if (var7 != null) {
                                class225 var8 = var7.field2634;
                                class161 var9 = var8.field3245;
                                if (var9.field2409 != null) {
                                    var9 = var9.method1114(class195.field2888, 0);
                                }
                                if (var9 != null) {
                                    var4 = var9.field2429;
                                }
                            }
                        }
                    } else {
                        var4 = class648.field9184.method3064((int) var3.field4979, -41).field3610;
                    }
                    if (var4 != null) {
                        var2 = var2 + class366.method2140(4, var4);
                    }
                }
                if (~class315.field4697 < -3) {
                    var2 = var2 + "<col=ffffff> / " + (class315.field4697 - 2) + class9.field159.method42(class666.field9377, 19572);
                }
                if (class266.field3784 == null) {
                    if (class375.field5315 != null && class161.field2419 == class158.field2374) {
                        int var10 = class548.field7419.method1306(class206.field3038, class17.field251 + 4, (byte) -54, class495.field6814 + 16, 0, class68.field921, class124.field1721, 16777215, var2, class311.field4617);
                        class568.method3135(16, 21, class17.field251 + 4, class432.field6119.method3314(var2, -116) - -var10, class495.field6814);
                        return;
                    }
                } else {
                    class194 var11 = class266.field3784.method1002(arg1, 125);
                    if (var11 == null) {
                        var11 = class548.field7419;
                    }
                    var11.method1308(class266.field3784.field2082, (byte) -91, class266.field3784.field2121, class311.field4617, class359.field5138, class68.field921, class124.field1721, class266.field3784.field1967, class266.field3784.field2038, var2, class266.field3784.field2108, class623.field8684, class266.field3784.field1983, class206.field3038, class454.field6334);
                    class568.method3135(class454.field6334[3], 85, class454.field6334[0], class454.field6334[2], class454.field6334[1]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 130)
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V", line = 135)
    public final void method40(int arg0) {
        if (arg0 <= 5) {
            this.method39(125, 32);
        }
        ++field2895;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V", line = 146)
    public static final void method1321(boolean arg0) {
        ++field2892;
        if (class340.field4947 == 7) {
            class528.method2930(false, 2);
        } else {
            if (!arg0) {
                method1319(-40, -106, 79);
            }
            class162.field2486 = class53.field758;
            class53.field758 = null;
            class94.method690(13, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Lhd;", line = 165)
    public static final class679 method1322(byte arg0) {
        ++field2889;
        if (arg0 != 39) {
            return null;
        } else {
            class679 var1 = (class679) class190.field2803.method3611(255);
            if (var1 != null) {
                var1.method2971(1);
                var1.method3691((byte) -119);
                return var1;
            } else {
                class679 var2;
                do {
                    var2 = (class679) class412.field5837.method3611(255);
                    if (var2 == null) {
                        return null;
                    }
                    if (~var2.method3750((byte) -120) < ~class680.method3756(arg0 ^ -53)) {
                        return null;
                    }
                    var2.method2971(arg0 + -38);
                    var2.method3691((byte) -119);
                } while ((Long.MIN_VALUE & var2.field9371) == 0L);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII[[IILjava/util/Random;)V", line = 205)
    private final void method1323(int arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, Random arg6) {
        if (arg5 != 4096) {
            this.field2907 = 73;
        }
        ++field2897;
        int var8 = this.field2891 > 0 ? 4096 + -class433.method2492((byte) 0, arg6, this.field2891) : 4096;
        int var9 = this.field2896 * this.field2894 >> 12;
        int var10 = this.field2894 - (~var9 < -1 ? class433.method2492((byte) 0, arg6, var9) : 0);
        if (~class465.field6544 >= ~arg1) {
            arg1 -= class465.field6544;
        }
        if (var10 <= 0) {
            if (class465.field6544 >= arg1 - -arg0) {
                for (int var11 = 0; var11 < arg2; ++var11) {
                    class282.method1705(arg4[arg3 + var11], arg1, arg0, var8);
                }
            } else {
                int var12 = class465.field6544 - arg1;
                for (int var13 = 0; ~arg2 < ~var13; ++var13) {
                    int[] var14 = arg4[arg3 + var13];
                    class282.method1705(var14, arg1, var12, var8);
                    class282.method1705(var14, 0, -var12 + arg0, var8);
                }
            }
        } else if (arg2 > 0 && arg0 > 0) {
            int var15 = arg0 / 2;
            int var16 = arg2 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = ~var10 >= ~var16 ? var10 : var16;
            int var19 = arg1 + var17;
            int var20 = arg0 - var17 * 2;
            for (int var21 = 0; ~var21 > ~arg2; ++var21) {
                int[] var22 = arg4[arg3 + var21];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field2893 != -1) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class249.method1537(arg1 - -var24, class168.field2537)] = var22[class249.method1537(arg0 + arg1 - (var24 - -1), class168.field2537)] = ~var23 >= ~var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var17 > var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class249.method1537(class168.field2537, arg1 + var26)] = var22[class249.method1537(arg1 - var26 + arg0 + -1, class168.field2537)] = var23 * var28 >> 12;
                        }
                    }
                    if (~class465.field6544 <= ~(var19 + var20)) {
                        class282.method1705(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class465.field6544;
                        class282.method1705(var22, var19, var27, var23);
                        class282.method1705(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg2 + -1;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field2893 != 0) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class249.method1537(arg1 + var31, class168.field2537)] = var22[class249.method1537(-var31 + -1 + arg0 + arg1, class168.field2537)] = var32 < var30 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class249.method1537(class168.field2537, arg1 + var33)] = var22[class249.method1537(class168.field2537, arg0 - var33 + arg1 + -1)] = var30 * var35 >> 12;
                            }
                        }
                        if (var19 - -var20 > class465.field6544) {
                            int var34 = -var19 + class465.field6544;
                            class282.method1705(var22, var19, var34, var30);
                            class282.method1705(var22, 0, var20 - var34, var30);
                        } else {
                            class282.method1705(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class249.method1537(arg1 + var36, class168.field2537)] = var22[class249.method1537(-var36 + arg1 + arg0 + -1, class168.field2537)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) >= ~class465.field6544) {
                            class282.method1705(var22, var19, var20, var8);
                        } else {
                            int var37 = class465.field6544 - var19;
                            class282.method1705(var22, var19, var37, var8);
                            class282.method1705(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjr;B)V", line = 408)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field2898;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field2891 = arg1.method743((byte) -126);
                                        }
                                    } else {
                                        this.field2896 = arg1.method743((byte) -43);
                                    }
                                } else {
                                    this.field2893 = arg1.method718(-120);
                                }
                            } else {
                                this.field2905 = arg1.method743((byte) -110);
                            }
                        } else {
                            this.field2906 = arg1.method743((byte) -28);
                        }
                    } else {
                        this.field2901 = arg1.method743((byte) -87);
                    }
                } else {
                    this.field2903 = arg1.method743((byte) -11);
                }
            } else {
                this.field2904 = arg1.method743((byte) -81);
            }
        } else {
            this.field2907 = arg1.method718(89);
        }
        int var5 = -95 / ((arg2 - 58) / 63);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIILiaa;I)Z", line = 502)
    public static final boolean method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class455 arg9, int arg10) {
        ++field2890;
        int var11 = arg8;
        int var12 = arg0;
        byte var13 = 64;
        if (arg1 != -16457) {
            method1320(-66, (class638) null);
        }
        byte var14 = 64;
        int var15 = -var13 + arg8;
        int var16 = -var14 + arg0;
        class134.field1900[var13][var14] = 99;
        class247.field3509[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class450.field6289[var17] = arg8;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class29.field360[var10001] = arg0;
        int[][] var19 = arg9.field6346;
        while (~var26 != ~var18) {
            var12 = class29.field360[var18];
            var11 = class450.field6289[var18];
            var18 = 4095 & var18 - -1;
            int var20 = -var16 + var12;
            int var21 = -var15 + var11;
            int var22 = -arg9.field6355 + var11;
            int var23 = -arg9.field6344 + var12;
            if (arg2 != -4) {
                if (~arg2 != 2) {
                    if (~arg2 != 1) {
                        if (arg2 != -1) {
                            if (~arg2 != -1 && arg2 != 1 && ~arg2 != -3 && ~arg2 != -4 && arg2 != 9) {
                                if (arg9.method2625(arg7, arg2, var12, 2, 85, arg3, var11, arg10)) {
                                    class588.field8206 = var11;
                                    class63.field838 = var12;
                                    return true;
                                }
                            } else if (arg9.method2615(-26725, arg10, arg2, var12, var11, arg3, 2, arg7)) {
                                class63.field838 = var12;
                                class588.field8206 = var11;
                                return true;
                            }
                        } else if (arg9.method2611(arg5, var12, arg6, arg4, arg3, (byte) -125, var11, arg7, 2)) {
                            class63.field838 = var12;
                            class588.field8206 = var11;
                            return true;
                        }
                    } else if (arg9.method2613(var11, arg6, arg7, 2, 8, var12, arg5, 2, arg4, arg3)) {
                        class63.field838 = var12;
                        class588.field8206 = var11;
                        return true;
                    }
                } else if (class460.method2652(arg6, arg5, arg3, 2, 2, var11, arg7, 127, var12)) {
                    class63.field838 = var12;
                    class588.field8206 = var11;
                    return true;
                }
            } else if (~arg7 == ~var11 && arg3 == var12) {
                class588.field8206 = var11;
                class63.field838 = var12;
                return true;
            }
            int var25 = class247.field3509[var21][var20] - -1;
            if (var21 > 0 && class134.field1900[var21 + -1][var20] == 0 && (1134821376 & var19[var22 - 1][var23]) == 0 && ~(1310982144 & var19[var22 + -1][var23 + 1]) == -1) {
                class450.field6289[var26] = var11 + -1;
                class29.field360[var26] = var12;
                class134.field1900[var21 + -1][var20] = 2;
                var26 = var26 + 1 & 4095;
                class247.field3509[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && ~class134.field1900[var21 + 1][var20] == -1 && (1625554944 & var19[var22 + 2][var23]) == 0 && (2015625216 & var19[var22 - -2][var23 + 1]) == 0) {
                class450.field6289[var26] = var11 + 1;
                class29.field360[var26] = var12;
                var26 = var26 + 1 & 4095;
                class134.field1900[var21 - -1][var20] = 8;
                class247.field3509[var21 + 1][var20] = var25;
            }
            if (~var20 < -1 && class134.field1900[var21][var20 + -1] == 0 && ~(1134821376 & var19[var22][var23 - 1]) == -1 && (1625554944 & var19[var22 + 1][var23 + -1]) == 0) {
                class450.field6289[var26] = var11;
                class29.field360[var26] = var12 + -1;
                var26 = var26 - -1 & 4095;
                class134.field1900[var21][var20 + -1] = 1;
                class247.field3509[var21][var20 + -1] = var25;
            }
            if (var20 < 126 && class134.field1900[var21][var20 + 1] == 0 && ~(var19[var22][var23 - -2] & 1310982144) == -1 && ~(2015625216 & var19[var22 + 1][var23 + 2]) == -1) {
                class450.field6289[var26] = var11;
                class29.field360[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class134.field1900[var21][var20 + 1] = 4;
                class247.field3509[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && ~class134.field1900[var21 - 1][var20 + -1] == -1 && ~(var19[var22 + -1][var23] & 1336147968) == -1 && ~(1134821376 & var19[var22 + -1][var23 + -1]) == -1 && (var19[var22][var23 + -1] & 1675886592) == 0) {
                class450.field6289[var26] = var11 + -1;
                class29.field360[var26] = var12 + -1;
                class134.field1900[var21 - 1][var20 - 1] = 3;
                var26 = 4095 & var26 + 1;
                class247.field3509[var21 + -1][var20 - 1] = var25;
            }
            if (~var21 > -127 && ~var20 < -1 && ~class134.field1900[var21 - -1][var20 + -1] == -1 && ~(var19[var22 + 1][var23 - 1] & 1675886592) == -1 && (var19[var22 + 2][var23 - 1] & 1625554944) == 0 && (2028208128 & var19[var22 + 2][var23]) == 0) {
                class450.field6289[var26] = var11 + 1;
                class29.field360[var26] = var12 - 1;
                class134.field1900[var21 + 1][var20 + -1] = 9;
                var26 = 4095 & var26 - -1;
                class247.field3509[var21 + 1][var20 + -1] = var25;
            }
            if (~var21 < -1 && var20 < 126 && class134.field1900[var21 + -1][var20 + 1] == 0 && ~(var19[var22 + -1][var23 - -1] & 1336147968) == -1 && ~(var19[var22 - 1][var23 - -2] & 1310982144) == -1 && (var19[var22][var23 + 2] & 2116288512) == 0) {
                class450.field6289[var26] = var11 + -1;
                class29.field360[var26] = var12 - -1;
                var26 = var26 + 1 & 4095;
                class134.field1900[var21 + -1][var20 + 1] = 6;
                class247.field3509[var21 + -1][var20 - -1] = var25;
            }
            if (var21 < 126 && ~var20 > -127 && ~class134.field1900[var21 - -1][var20 + 1] == -1 && (2116288512 & var19[var22 + 1][var23 + 2]) == 0 && (2015625216 & var19[var22 - -2][var23 + 2]) == 0 && (2028208128 & var19[var22 + 2][var23 + 1]) == 0) {
                class450.field6289[var26] = var11 + 1;
                class29.field360[var26] = var12 - -1;
                var26 = 4095 & var26 + 1;
                class134.field1900[var21 + 1][var20 + 1] = 12;
                class247.field3509[var21 - -1][var20 + 1] = var25;
            }
        }
        class63.field838 = var12;
        class588.field8206 = var11;
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[I", line = 870)
    public final int[] method39(int arg0, int arg1) {
        ++field2899;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (arg0 <= 112) {
            method1320(-33, (class638) null);
        }
        if (super.field9751.field6674) {
            int[][] var4 = super.field9751.method2717(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class465.field6544 * this.field2904 >> 12;
            int var15 = class465.field6544 * this.field2903 >> 12;
            int var16 = class250.field3529 * this.field2901 >> 12;
            int var17 = class250.field3529 * this.field2906 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field2894 = class465.field6544 / 8 * this.field2905 >> 12;
                int var18 = class465.field6544 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2907);
                while (true) {
                    while (true) {
                        int var22 = class433.method2492((byte) 0, var21, var15 - var14) + var14;
                        int var23 = class433.method2492((byte) 0, var21, -var16 + var17) + var16;
                        int var24 = var8 + var22;
                        if (class465.field6544 < var24) {
                            var22 = -var8 + class465.field6544;
                            var24 = class465.field6544;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class465.field6544;
                            }
                            if (~var29 < ~class465.field6544) {
                                var29 -= class465.field6544;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var30[0] <= var29 && var30[1] >= var29) {
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class465.field6544;
                                        }
                                        if (class465.field6544 < var31) {
                                            var31 -= class465.field6544;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 > ~var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 == 0) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class465.field6544;
                                                }
                                                this.method1323(var39 - var38, var7 + var38, -var35 + var25, var35, var4, 4096, var21);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (var23 + var25 > class250.field3529) {
                            var23 = class250.field3529 - var25;
                        } else {
                            var10 = false;
                        }
                        if (class465.field6544 != var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            var41[0] = var8;
                            this.method1323(var22, var6 + var8, var23, var25, var4, 4096, var21);
                            var8 = var24;
                        } else {
                            this.method1323(var22, var8 - -var6, var23, var25, var4, 4096, var21);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var23 + var25;
                            var42[1] = var24;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class433.method2492((byte) 0, var21, class465.field6544);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class465.field6544 + var5;
                            }
                            if (var44 > class465.field6544) {
                                var44 -= class465.field6544;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
