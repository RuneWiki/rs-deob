import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class152 extends class492 {

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    private int field2419 = -1;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    private int field2420 = -1;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Liv;")
    public static class64 field2411 = new class64(9, -1);

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V", line = 4)
    public static final void method1154(byte arg0) {
        ++field2409;
        class49.method457(class4.field109, (long) class531.field7821, -91);
        if (class364.field5513 != -1) {
            class110.method820(class364.field5513, -18046);
        }
        for (int var1 = 0; ~class100.field1650 < ~var1; ++var1) {
            if (class355.field5424[var1]) {
                class467.field6966[var1] = true;
            }
            class115.field1908[var1] = class355.field5424[var1];
            class355.field5424[var1] = false;
        }
        int var2 = -117 % ((arg0 - 52) / 36);
        class511.field7541 = class531.field7821;
        if (class4.field109.method224()) {
            class348.field5198 = true;
        }
        if (class364.field5513 != -1) {
            class100.field1650 = 0;
            class297.method1881((byte) 116);
        }
        class4.field109.method258();
        class333.method2139(class97.field1621, (byte) -44);
        class514.field7564 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIIIIILbr;IIIII)Z", line = 45)
    public static final boolean method1155(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class268 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field2418;
        int var12 = arg1;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg1 - var14;
        class129.field2058[var14][var15] = 99;
        int var17 = -var15 + arg4;
        class357.field5436[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class353.field5403[var18] = arg1;
        int var36 = var18 + 1;
        class49.field897[var18] = arg4;
        int[][] var20 = arg6.field3853;
        int var21 = 84 % ((arg0 - 26) / 55);
        while (true) {
            label282: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var27;
                do {
                    do {
                        do {
                            label259: do {
                                if (var36 == var19) {
                                    class11.field165 = var13;
                                    class400.field6022 = var12;
                                    return false;
                                }
                                var13 = class49.field897[var19];
                                var12 = class353.field5403[var19];
                                var19 = var19 + 1 & 4095;
                                var22 = var12 - var16;
                                var23 = -var17 + var13;
                                var24 = -arg6.field3862 + var12;
                                var25 = -arg6.field3869 + var13;
                                if (~arg8 != 3) {
                                    if (~arg8 != 2) {
                                        if (~arg8 != 1) {
                                            if (~arg8 != 0) {
                                                if (~arg8 != -1 && ~arg8 != -2 && ~arg8 != -3 && arg8 != 3 && arg8 != 9) {
                                                    if (arg6.method1722(true, arg3, arg10, arg11, var13, arg8, var12, arg7)) {
                                                        class11.field165 = var13;
                                                        class400.field6022 = var12;
                                                        return true;
                                                    }
                                                } else if (arg6.method1723(arg8, arg7, var13, arg10, var12, 0, arg3, arg11)) {
                                                    class400.field6022 = var12;
                                                    class11.field165 = var13;
                                                    return true;
                                                }
                                            } else if (arg6.method1732(var12, 3, arg10, arg9, arg11, var13, arg5, arg2, arg7)) {
                                                class400.field6022 = var12;
                                                class11.field165 = var13;
                                                return true;
                                            }
                                        } else if (arg6.method1719(arg7, arg9, (byte) 112, arg2, arg10, var12, arg10, var13, arg11, arg5)) {
                                            class11.field165 = var13;
                                            class400.field6022 = var12;
                                            return true;
                                        }
                                    } else if (class283.method1806(arg10, 1, arg10, var12, arg2, arg5, arg11, arg7, var13)) {
                                        class11.field165 = var13;
                                        class400.field6022 = var12;
                                        return true;
                                    }
                                } else if (arg7 == var12 && ~arg11 == ~var13) {
                                    class11.field165 = var13;
                                    class400.field6022 = var12;
                                    return true;
                                }
                                var27 = class357.field5436[var22][var23] + 1;
                                if (~var22 < -1 && ~class129.field2058[var22 - 1][var23] == -1 && (1134821376 & var20[var24 + -1][var25]) == 0 && ~(var20[var24 + -1][arg10 - 1 + var25] & 1310982144) == -1) {
                                    int var28 = 1;
                                    while (true) {
                                        if (~var28 <= ~(arg10 + -1)) {
                                            class353.field5403[var36] = var12 + -1;
                                            class49.field897[var36] = var13;
                                            var36 = 4095 & var36 + 1;
                                            class129.field2058[var22 + -1][var23] = 2;
                                            class357.field5436[var22 + -1][var23] = var27;
                                            break;
                                        }
                                        if ((1336147968 & var20[var24 + -1][var25 + var28]) != 0) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (-arg10 + 128 > var22 && class129.field2058[var22 + 1][var23] == 0 && (var20[arg10 + var24][var25] & 1625554944) == 0 && (2015625216 & var20[var24 - -arg10][arg10 + -1 + var25]) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (~var29 <= ~(arg10 + -1)) {
                                            class353.field5403[var36] = var12 + 1;
                                            class49.field897[var36] = var13;
                                            class129.field2058[var22 + 1][var23] = 8;
                                            var36 = 4095 & var36 + 1;
                                            class357.field5436[var22 + 1][var23] = var27;
                                            break;
                                        }
                                        if ((2028208128 & var20[arg10 + var24][var25 + var29]) != 0) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~var23 < -1 && class129.field2058[var22][var23 + -1] == 0 && ~(var20[var24][var25 + -1] & 1134821376) == -1 && (var20[var24 - 1 + arg10][var25 - 1] & 1625554944) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (~(arg10 + -1) >= ~var30) {
                                            class353.field5403[var36] = var12;
                                            class49.field897[var36] = var13 - 1;
                                            class129.field2058[var22][var23 + -1] = 1;
                                            var36 = 4095 & var36 - -1;
                                            class357.field5436[var22][var23 + -1] = var27;
                                            break;
                                        }
                                        if (~(var20[var24 + var30][var25 + -1] & 1675886592) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (~var23 > ~(-arg10 + 128) && class129.field2058[var22][var23 + 1] == 0 && ~(var20[var24][arg10 + var25] & 1310982144) == -1 && (var20[arg10 + var24 + -1][arg10 + var25] & 2015625216) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (~var31 <= ~(arg10 - 1)) {
                                            class353.field5403[var36] = var12;
                                            class49.field897[var36] = var13 + 1;
                                            class129.field2058[var22][var23 + 1] = 4;
                                            var36 = 4095 & var36 + 1;
                                            class357.field5436[var22][var23 + 1] = var27;
                                            break;
                                        }
                                        if ((var20[var24 + var31][arg10 + var25] & 2116288512) != 0) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (~var22 < -1 && ~var23 < -1 && class129.field2058[var22 - 1][var23 + -1] == 0 && ~(1134821376 & var20[var24 - 1][var25 + -1]) == -1) {
                                    int var32 = 1;
                                    while (true) {
                                        if (~arg10 >= ~var32) {
                                            class353.field5403[var36] = var12 + -1;
                                            class49.field897[var36] = var13 - 1;
                                            var36 = 4095 & var36 - -1;
                                            class129.field2058[var22 + -1][var23 + -1] = 3;
                                            class357.field5436[var22 + -1][var23 + -1] = var27;
                                            break;
                                        }
                                        if (~(1336147968 & var20[var24 + -1][var25 - -var32 + -1]) != -1 || (var20[var24 + var32 + -1][var25 + -1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (~(128 - arg10) < ~var22 && var23 > 0 && ~class129.field2058[var22 + 1][var23 + -1] == -1 && (var20[arg10 + var24][var25 + -1] & 1625554944) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (~var33 <= ~arg10) {
                                            class353.field5403[var36] = var12 + 1;
                                            class49.field897[var36] = var13 + -1;
                                            var36 = var36 - -1 & 4095;
                                            class129.field2058[var22 - -1][var23 + -1] = 9;
                                            class357.field5436[var22 + 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((2028208128 & var20[arg10 + var24][var25 - 1 + var33]) != 0 || ~(var20[var24 - -var33][var25 + -1] & 1675886592) != -1) {
                                            break;
                                        }
                                        ++var33;
                                    }
                                }
                                if (~var22 < -1 && var23 < -arg10 + 128 && ~class129.field2058[var22 + -1][var23 + 1] == -1 && (1310982144 & var20[var24 - 1][arg10 + var25]) == 0) {
                                    for (int var34 = 1; arg10 > var34; ++var34) {
                                        if (~(1336147968 & var20[var24 - 1][var25 + var34]) != -1 || (2116288512 & var20[var24 + -1 + var34][arg10 + var25]) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class353.field5403[var36] = var12 - 1;
                                    class49.field897[var36] = var13 + 1;
                                    var36 = var36 + 1 & 4095;
                                    class129.field2058[var22 + -1][var23 - -1] = 6;
                                    class357.field5436[var22 + -1][var23 + 1] = var27;
                                }
                            } while (~(-arg10 + 128) >= ~var22);
                        } while (var23 >= -arg10 + 128);
                    } while (class129.field2058[var22 + 1][var23 + 1] != 0);
                } while (~(2015625216 & var20[arg10 + var24][arg10 + var25]) != -1);
                for (int var35 = 1; ~arg10 < ~var35; ++var35) {
                    if (~(var20[var24 + var35][arg10 + var25] & 2116288512) != -1 || (var20[arg10 + var24][var25 + var35] & 2028208128) != 0) {
                        continue label282;
                    }
                }
                class353.field5403[var36] = var12 + 1;
                class49.field897[var36] = var13 + 1;
                var36 = 4095 & var36 + 1;
                class129.field2058[var22 + 1][var23 + 1] = 12;
                class357.field5436[var22 - -1][var23 + 1] = var27;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lvj;IIII[BI)V", line = 481)
    public class152(class303 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field2417 = arg4;
        this.field2410 = arg3;
        this.field2421 = arg2;
        super.field7283.method1990(this, 11864);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field7272, 0, super.field7280, this.field2421, this.field2410, this.field2417, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2929((byte) -119, true);
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V", line = 497)
    public static void method1156(byte arg0) {
        if (arg0 > -89) {
            method1157(-36);
        }
        field2411 = null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lvj;IIII)V", line = 509)
    public class152(class303 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2421 = arg2;
        this.field2417 = arg4;
        this.field2410 = arg3;
        super.field7283.method1990(this, 11864);
        OpenGL.glTexImage3Dub(super.field7272, 0, super.field7280, this.field2421, this.field2410, this.field2417, 0, class430.method2574(super.field7280, (byte) -121), 5121, (byte[]) null, 0);
        this.method2929((byte) -58, true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 524)
    public final void method1055(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field2419, this.field2420, super.field7272, 0, 0, 0);
        ++field2412;
        if (arg0 <= -52) {
            this.field2419 = -1;
            this.field2420 = -1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)[Liv;", line = 538)
    public static final class64[] method1157(int arg0) {
        if (arg0 <= 17) {
            field2416 = -93;
        }
        ++field2415;
        return new class64[] { class59.field1048, class392.field5945, class299.field4263, class62.field1077, class214.field3090, class5.field124, class382.field5780, class158.field2467, class491.field7265, field2411, class207.field2992, class328.field4951, class71.field1239, class425.field6338, class514.field7556, class408.field6127, class531.field7803, class406.field6085, class141.field2239, class363.field5504, class23.field465, class227.field3237, class357.field5433, class520.field7728, class170.field2639, class520.field7731, class317.field4767, class334.field5048, class8.field139, class292.field4152, class78.field1307, class465.field6945, class9.field147, class3.field102, class259.field3765, class258.field3746, class180.field2727, class256.field3693, class295.field4196, class408.field6129, class291.field4149, class120.field1957, class478.field7131, class272.field3920, class203.field2970, class396.field5973, class281.field4021, class167.field2600, class498.field7361, class98.field1627, class353.field5401, class322.field4919, class74.field1253, class134.field2145, class55.field962, class334.field5039, class367.field5537, class330.field4975, class25.field542, class502.field7407, class129.field2056, class182.field2731, class492.field7270, class300.field4268, class244.field3507, class229.field3252, class476.field7107, class504.field7454, class257.field3736, class58.field1026, class165.field2568, class511.field7534, class160.field2477, class236.field3421, class164.field2534, class30.field635, class405.field6074, class22.field457, class151.field2399, class19.field331, class334.field5041, class399.field6017, class407.field6114, class259.field3767, class83.field1444, class419.field6269, class68.field1174, class394.field5955, class270.field3902, class513.field7548, class429.field6386, class36.field685, class476.field7114, class170.field2633, class42.field818, class107.field1784, class369.field5588, class80.field1408, class128.field2039, class363.field5503, class163.field2522, class40.field730, class260.field3771, class17.field263, class365.field5519, class281.field4027, class354.field5410, class7.field135, class283.field4043, class20.field349 };
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V", line = 557)
    public final void method1158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2414;
        super.field7283.method1990(this, 11864);
        if (arg7 != -18608) {
            this.field2421 = -5;
        }
        OpenGL.glCopyTexSubImage3D(super.field7272, 0, arg5, arg1, arg0, arg4, arg3, arg2, arg6);
        OpenGL.glFlush();
    }
}
