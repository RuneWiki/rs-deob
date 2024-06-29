import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class411 extends class37 {

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "Lwo;")
    public class522 field6011 = new class522();

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Lnt;")
    public class147 field6024 = new class147();

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "Lsf;")
    private class362 field6020;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "Lqo;")
    public static class19 field6021 = new class19("", 15);

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Lgd;")
    public static class224 field6022 = new class224(128);

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field6023 = 0;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "[F")
    public static float[] field6025 = new float[16];

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2441(byte arg0, String arg1) {
        field6009++;
        String var2 = class141.method913(false, class162.method998((byte) 109, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return arg0 == -108 ? var2 : null;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public static void method2442(byte arg0) {
        int var1 = -14 / ((arg0 - 25) / 32);
        field6021 = null;
        field6025 = null;
        field6022 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLrr;I)V")
    private final void method2443(boolean arg0, class242 arg1, int arg2) {
        if ((this.field6020.field4970[arg1.field3348] & 0x4) != 0 && arg1.field3353 < 0) {
            int var4 = this.field6020.field4991[arg1.field3348] / class12.field141;
            int var5 = (var4 + 1048575 - arg1.field3357) / var4;
            arg1.field3357 = arg2 * var4 + arg1.field3357 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field6020.field4955[arg1.field3348] == 0) {
                    arg1.field3349 = class280.method1603(arg1.field3361, arg1.field3349.method1581(), arg1.field3349.method1593(), arg1.field3349.method1583());
                } else {
                    arg1.field3349 = class280.method1603(arg1.field3361, arg1.field3349.method1581(), 0, arg1.field3349.method1583());
                    this.field6020.method2030(108, arg1.field3346.field1424[arg1.field3359] < 0, arg1);
                }
                if (arg1.field3346.field1424[arg1.field3359] < 0) {
                    arg1.field3349.method1575(-1);
                }
                arg2 = arg1.field3357 / var4;
            }
        }
        field6014++;
        arg1.field3349.method239(arg2);
        if (arg0) {
            this.field6020 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "()Ldm;")
    public final class37 method242() {
        field6010++;
        class242 var1 = (class242) this.field6011.method3072((byte) 121);
        if (var1 == null) {
            return null;
        } else if (var1.field3349 == null) {
            return this.method244();
        } else {
            return var1.field3349;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[ILrr;I)V")
    private final void method2444(int arg0, int arg1, int arg2, int[] arg3, class242 arg4, int arg5) {
        if (arg2 < 35) {
            this.method2444(-116, 119, 115, null, null, 81);
        }
        field6017++;
        if ((this.field6020.field4970[arg4.field3348] & 0x4) != 0 && arg4.field3353 < 0) {
            int var7 = this.field6020.field4991[arg4.field3348] / class12.field141;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field3357) / var7;
                if (var8 > arg5) {
                    arg4.field3357 += arg5 * var7;
                    break;
                }
                arg4.field3349.method240(arg3, arg1, var8);
                arg1 += var8;
                arg5 -= var8;
                arg4.field3357 += var7 * var8 - 1048576;
                int var9 = class12.field141 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class280 var11 = arg4.field3349;
                if (this.field6020.field4955[arg4.field3348] == 0) {
                    arg4.field3349 = class280.method1603(arg4.field3361, var11.method1581(), var11.method1593(), var11.method1583());
                } else {
                    arg4.field3349 = class280.method1603(arg4.field3361, var11.method1581(), 0, var11.method1583());
                    this.field6020.method2030(126, arg4.field3346.field1424[arg4.field3359] < 0, arg4);
                    arg4.field3349.method1602(var9, var11.method1593());
                }
                if (arg4.field3346.field1424[arg4.field3359] < 0) {
                    arg4.field3349.method1575(-1);
                }
                var11.method1580(var9);
                var11.method240(arg3, arg1, arg0 - arg1);
                if (var11.method1586()) {
                    this.field6024.method939(var11);
                }
            }
        }
        arg4.field3349.method240(arg3, arg1, arg5);
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public static final void method2445(int arg0) {
        field6007++;
        if (arg0 != -1) {
            method2448(101, 75, -15, false, -8, -9, 47, 78);
        }
        if (class174.field2490 != null) {
            class174.field2490.method1001((byte) -128);
            class174.field2490 = null;
            class501.field7361 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILid;IIIIIIIIII)Z")
    public static final boolean method2446(int arg0, class413 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg0 != 1) {
            method2441((byte) 82, null);
        }
        field6013++;
        int var12 = arg3;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg3 - var14;
        int var17 = arg4 - var15;
        class205.field2906[var14][var15] = 99;
        class472.field6894[var14][var15] = 0;
        byte var18 = 0;
        class175.field2502[var18] = arg3;
        int var19 = 0;
        int var35 = var18 + 1;
        class300.field4118[var18] = arg4;
        int[][] var20 = arg1.field6067;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class100.field1372 = var12;
                                    class210.field2982 = var13;
                                    return false;
                                }
                                var12 = class175.field2502[var19];
                                var13 = class300.field4118[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var23 = var12 - arg1.field6053;
                                var24 = var13 - arg1.field6063;
                                if (arg7 == -4) {
                                    if (arg6 == var12 && arg8 == var13) {
                                        class210.field2982 = var13;
                                        class100.field1372 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class360.method2000(var12, arg9, arg8, arg5, var13, (byte) -37, arg6, arg10, arg9)) {
                                        class210.field2982 = var13;
                                        class100.field1372 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg1.method2476(arg5, arg9, var13, arg11, var12, arg9, arg8, arg6, arg10, (byte) 117)) {
                                        class210.field2982 = var13;
                                        class100.field1372 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg1.method2471(true, arg8, arg5, arg6, var12, arg10, var13, arg9, arg11)) {
                                        class210.field2982 = var13;
                                        class100.field1372 = var12;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg1.method2463(arg8, arg2, var12, -29353, arg7, var13, arg9, arg6)) {
                                        class100.field1372 = var12;
                                        class210.field2982 = var13;
                                        return true;
                                    }
                                } else if (arg1.method2468(arg9, var13, arg2, arg6, arg8, arg7, var12, arg0 + 31)) {
                                    class210.field2982 = var13;
                                    class100.field1372 = var12;
                                    return true;
                                }
                                var26 = class472.field6894[var21][var22] + 1;
                                if (var21 > 0 && class205.field2906[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg9 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg9 - 1) {
                                            class175.field2502[var35] = var12 - 1;
                                            class300.field4118[var35] = var13;
                                            class205.field2906[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class472.field6894[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < (128 - arg9) && class205.field2906[var21 + 1][var22] == 0 && (var20[arg9 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg9][var24 + arg9 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg9 - 1) {
                                            class175.field2502[var35] = var12 + 1;
                                            class300.field4118[var35] = var13;
                                            class205.field2906[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class472.field6894[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class205.field2906[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 - (1 - arg9)][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg9 - 1) {
                                            class175.field2502[var35] = var12;
                                            class300.field4118[var35] = var13 - 1;
                                            class205.field2906[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class472.field6894[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg9) > var22 && class205.field2906[var21][var22 + 1] == 0 && (var20[var23][arg9 + var24] & 0x4E240000) == 0 && (var20[arg9 + var23 - 1][arg9 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg9 - 1)) {
                                            class175.field2502[var35] = var12;
                                            class300.field4118[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class205.field2906[var21][var22 + 1] = 4;
                                            class472.field6894[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg9] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class205.field2906[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg9 <= var31) {
                                            class175.field2502[var35] = var12 - 1;
                                            class300.field4118[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class205.field2906[var21 - 1][var22 - 1] = 3;
                                            class472.field6894[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < 128 - arg9 && var22 > 0 && class205.field2906[var21 + 1][var22 - 1] == 0 && (var20[arg9 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg9 <= var32) {
                                            class175.field2502[var35] = var12 + 1;
                                            class300.field4118[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class205.field2906[var21 + 1][var22 - 1] = 9;
                                            class472.field6894[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg9) > var22 && class205.field2906[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg9] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg9; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg9] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class175.field2502[var35] = var12 - 1;
                                    class300.field4118[var35] = var13 + 1;
                                    class205.field2906[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class472.field6894[var21 - 1][var22 + 1] = var26;
                                }
                            } while ((128 - arg9) <= var21);
                        } while (var22 >= 128 - arg9);
                    } while (class205.field2906[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg9 + var23][arg9 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg9; var34++) {
                    if ((var20[var23 + var34][var24 + arg9] & 0x7E240000) != 0 || (var20[var23 + arg9][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class175.field2502[var35] = var12 + 1;
                class300.field4118[var35] = var13 + 1;
                class205.field2906[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class472.field6894[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Z")
    public static final boolean method2447(byte arg0, int arg1) {
        if (arg0 <= 31) {
            return true;
        }
        field6006++;
        if (arg1 == 16 || arg1 == 46 || arg1 == 2 || arg1 == 22 || arg1 == 15) {
            return true;
        } else {
            return arg1 == 25 || arg1 == 1012;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([III)V")
    public final void method240(int[] arg0, int arg1, int arg2) {
        field6019++;
        this.field6024.method240(arg0, arg1, arg2);
        for (class242 var4 = (class242) this.field6011.method3072((byte) 38); var4 != null; var4 = (class242) this.field6011.method3066(2)) {
            if (!this.field6020.method2023(var4, (byte) -114)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3360) {
                        this.method2444(var5 + var6, var6, 92, arg0, var4, var5);
                        var4.field3360 -= var5;
                        break;
                    }
                    this.method2444(var5 + var6, var6, 79, arg0, var4, var4.field3360);
                    var6 += var4.field3360;
                    var5 -= var4.field3360;
                } while (!this.field6020.method2007(0, var6, var4, arg0, var5));
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method239(int arg0) {
        field6012++;
        this.field6024.method239(arg0);
        for (class242 var2 = (class242) this.field6011.method3072((byte) 97); var2 != null; var2 = (class242) this.field6011.method3066(2)) {
            if (!this.field6020.method2023(var2, (byte) -114)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3360) {
                        this.method2443(false, var2, var3);
                        var2.field3360 -= var3;
                        break;
                    }
                    this.method2443(false, var2, var2.field3360);
                    var3 -= var2.field3360;
                } while (!this.field6020.method2007(0, 0, var2, null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()I")
    public final int method238() {
        field6018++;
        return 0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method2448(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field6016++;
        int var8 = class497.method2935(class54.field753, arg2, class343.field4727, -128);
        int var9 = class497.method2935(class54.field753, arg6, class343.field4727, -125);
        int var10 = class497.method2935(class175.field2497, arg7, class382.field5379, -128);
        int var11 = class497.method2935(class175.field2497, arg0, class382.field5379, -127);
        int var12 = class497.method2935(class54.field753, arg2 + arg1, class343.field4727, -125);
        int var13 = class497.method2935(class54.field753, arg6 - arg1, class343.field4727, -126);
        for (int var14 = var8; var14 < var12; var14++) {
            class419.method2511(class225.field3174[var14], var10, arg4, var11, 91);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class419.method2511(class225.field3174[var15], var10, arg4, var11, -118);
        }
        int var16 = class497.method2935(class175.field2497, arg1 + arg7, class382.field5379, -127);
        if (arg3) {
            method2446(126, null, 73, -63, -82, 92, -110, 77, 31, -10, -21, -100);
        }
        int var17 = class497.method2935(class175.field2497, arg0 - arg1, class382.field5379, -127);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class225.field3174[var18];
            class419.method2511(var19, var10, arg4, var16, 107);
            class419.method2511(var19, var16, arg5, var17, 70);
            class419.method2511(var19, var17, arg4, var11, -111);
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()Ldm;")
    public final class37 method244() {
        field6008++;
        class242 var1;
        do {
            var1 = (class242) this.field6011.method3066(2);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3349 == null);
        return var1.field3349;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lsf;)V")
    public class411(class362 arg0) {
        this.field6020 = arg0;
    }
}
