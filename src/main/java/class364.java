import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class364 extends class517 {

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    private int field5336 = -1;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    private int field5339 = -1;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public int field5338;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "Z")
    public static boolean field5343 = false;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILwg;IIIIIIII)Z")
    public static final boolean method2232(int arg0, int arg1, class516 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field5340;
        int var11 = arg10;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg10;
        int var16 = -var14 + arg3;
        class369.field5475[var13][var14] = 99;
        class263.field3413[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class618.field8964[var17] = arg10;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class390.field5889[var10001] = arg3;
        int[][] var19 = arg2.field7243;
        if (arg8 < 34) {
            method2235((byte) 43);
        }
        while (~var26 != ~var18) {
            var11 = class618.field8964[var18];
            var12 = class390.field5889[var18];
            int var20 = -var15 + var11;
            int var21 = -var16 + var12;
            var18 = var18 + 1 & 4095;
            int var22 = -arg2.field7242 + var11;
            int var23 = -arg2.field7247 + var12;
            if (arg7 != -4) {
                if (~arg7 != 2) {
                    if (~arg7 != 1) {
                        if (arg7 != -1) {
                            if (~arg7 != -1 && arg7 != 1 && ~arg7 != -3 && ~arg7 != -4 && ~arg7 != -10) {
                                if (arg2.method2913(var12, var11, arg9, arg4, -4, arg5, arg7, 2)) {
                                    class597.field8645 = var11;
                                    class264.field3452 = var12;
                                    return true;
                                }
                            } else if (arg2.method2909(2, arg9, arg5, var12, -1, arg7, arg4, var11)) {
                                class597.field8645 = var11;
                                class264.field3452 = var12;
                                return true;
                            }
                        } else if (arg2.method2915(arg1, var11, arg5, arg6, (byte) -80, arg4, 2, arg0, var12)) {
                            class264.field3452 = var12;
                            class597.field8645 = var11;
                            return true;
                        }
                    } else if (arg2.method2914(2, var11, arg5, var12, arg6, arg0, arg4, 2, (byte) 30, arg1)) {
                        class264.field3452 = var12;
                        class597.field8645 = var11;
                        return true;
                    }
                } else if (class408.method2506(var11, 2, 2, arg4, arg0, 4005, arg5, var12, arg6)) {
                    class597.field8645 = var11;
                    class264.field3452 = var12;
                    return true;
                }
            } else if (arg5 == var11 && arg4 == var12) {
                class597.field8645 = var11;
                class264.field3452 = var12;
                return true;
            }
            int var25 = class263.field3413[var20][var21] - -1;
            if (var20 > 0 && ~class369.field5475[var20 + -1][var21] == -1 && (1134821376 & var19[var22 + -1][var23]) == 0 && (var19[var22 + -1][var23 + 1] & 1310982144) == 0) {
                class618.field8964[var26] = var11 + -1;
                class390.field5889[var26] = var12;
                var26 = 4095 & var26 - -1;
                class369.field5475[var20 + -1][var21] = 2;
                class263.field3413[var20 + -1][var21] = var25;
            }
            if (var20 < 126 && ~class369.field5475[var20 + 1][var21] == -1 && (var19[var22 + 2][var23] & 1625554944) == 0 && (2015625216 & var19[var22 + 2][var23 + 1]) == 0) {
                class618.field8964[var26] = var11 + 1;
                class390.field5889[var26] = var12;
                class369.field5475[var20 - -1][var21] = 8;
                var26 = 4095 & var26 + 1;
                class263.field3413[var20 + 1][var21] = var25;
            }
            if (~var21 < -1 && class369.field5475[var20][var21 + -1] == 0 && ~(var19[var22][var23 - 1] & 1134821376) == -1 && (var19[var22 - -1][var23 - 1] & 1625554944) == 0) {
                class618.field8964[var26] = var11;
                class390.field5889[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class369.field5475[var20][var21 - 1] = 1;
                class263.field3413[var20][var21 - 1] = var25;
            }
            if (~var21 > -127 && ~class369.field5475[var20][var21 + 1] == -1 && (1310982144 & var19[var22][var23 + 2]) == 0 && (2015625216 & var19[var22 - -1][var23 - -2]) == 0) {
                class618.field8964[var26] = var11;
                class390.field5889[var26] = var12 - -1;
                var26 = var26 - -1 & 4095;
                class369.field5475[var20][var21 + 1] = 4;
                class263.field3413[var20][var21 + 1] = var25;
            }
            if (~var20 < -1 && var21 > 0 && ~class369.field5475[var20 + -1][var21 + -1] == -1 && (1336147968 & var19[var22 + -1][var23]) == 0 && ~(var19[var22 - 1][var23 + -1] & 1134821376) == -1 && ~(1675886592 & var19[var22][var23 + -1]) == -1) {
                class618.field8964[var26] = var11 - 1;
                class390.field5889[var26] = var12 - 1;
                class369.field5475[var20 + -1][var21 + -1] = 3;
                var26 = var26 + 1 & 4095;
                class263.field3413[var20 + -1][var21 + -1] = var25;
            }
            if (var20 < 126 && ~var21 < -1 && class369.field5475[var20 + 1][var21 + -1] == 0 && (1675886592 & var19[var22 - -1][var23 + -1]) == 0 && (1625554944 & var19[var22 + 2][var23 + -1]) == 0 && ~(var19[var22 + 2][var23] & 2028208128) == -1) {
                class618.field8964[var26] = var11 + 1;
                class390.field5889[var26] = var12 + -1;
                var26 = var26 + 1 & 4095;
                class369.field5475[var20 + 1][var21 + -1] = 9;
                class263.field3413[var20 - -1][var21 + -1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class369.field5475[var20 - 1][var21 + 1] == 0 && (1336147968 & var19[var22 + -1][var23 + 1]) == 0 && ~(var19[var22 + -1][var23 + 2] & 1310982144) == -1 && (var19[var22][var23 + 2] & 2116288512) == 0) {
                class618.field8964[var26] = var11 + -1;
                class390.field5889[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class369.field5475[var20 + -1][var21 + 1] = 6;
                class263.field3413[var20 + -1][var21 + 1] = var25;
            }
            if (~var20 > -127 && ~var21 > -127 && ~class369.field5475[var20 + 1][var21 + 1] == -1 && ~(2116288512 & var19[var22 + 1][var23 + 2]) == -1 && ~(var19[var22 + 2][var23 - -2] & 2015625216) == -1 && ~(2028208128 & var19[var22 + 2][var23 + 1]) == -1) {
                class618.field8964[var26] = var11 + 1;
                class390.field5889[var26] = var12 + 1;
                class369.field5475[var20 + 1][var21 - -1] = 12;
                var26 = var26 + 1 & 4095;
                class263.field3413[var20 + 1][var21 + 1] = var25;
            }
        }
        class264.field3452 = var12;
        class597.field8645 = var11;
        return false;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Luca;IIZ[[BI)V")
    public class364(class287 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5338 = arg2;
        super.field7252.method1709((byte) -114, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field7259, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2924(true, -100);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public final void method847(byte arg0) {
        if (arg0 == -79) {
            OpenGL.glFramebufferTexture2DEXT(this.field5339, this.field5336, 3553, 0, 0);
            ++field5341;
            this.field5336 = -1;
            this.field5339 = -1;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Luca;IIZ[[I)V")
    public class364(class287 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5338 = arg2;
        super.field7252.method1709((byte) -102, this);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class569.method3275(super.field7252.field4069, arg2, arg4[var6], 92, arg2, super.field7259, 32993, 34069 - -var6);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field7259, arg2, arg2, 0, 32993, super.field7252.field4069, arg4[var7], 0);
            }
        }
        this.method2924(true, -86);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Luca;II)V")
    public class364(class287 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5338 = arg2;
        super.field7252.method1709((byte) -107, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field7259, arg2, arg2, 0, class422.method2556(super.field7259, (byte) -74), 5121, (byte[]) null, 0);
        }
        this.method2924(true, -65);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBIII)V")
    public final void method2233(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 7) {
            this.method2233(37, (byte) 103, 111, 106, 87);
        }
        ++field5335;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, arg4, super.field7258, arg0);
        this.field5336 = arg3;
        this.field5339 = arg2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2234(int arg0, int arg1, byte arg2) {
        if (arg2 <= 37) {
            return false;
        } else {
            ++field5342;
            return (arg1 & 32768) != 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
    public static final void method2235(byte arg0) {
        for (int var1 = 0; ~class380.field5732 < ~var1; ++var1) {
            class268 var3 = class141.field2038[var1];
            boolean var4 = false;
            if (var3.field3508 == null) {
                --var3.field3511;
                if (var3.field3511 >= (!var3.method1602(arg0 + 127) ? -10 : -1500)) {
                    if (var3.field3495 == 1 && var3.field3505 == null) {
                        var3.field3505 = class482.method2762(class148.field2100, var3.field3499, 0);
                        if (var3.field3505 == null) {
                            continue;
                        }
                        var3.field3511 += var3.field3505.method2760();
                    } else if (var3.method1602(arg0 + 127) && (var3.field3510 == null || var3.field3502 == null)) {
                        if (var3.field3510 == null) {
                            var3.field3510 = class137.method975(class674.field9509, var3.field3499);
                        }
                        if (var3.field3510 == null) {
                            continue;
                        }
                        if (var3.field3502 == null) {
                            var3.field3502 = var3.field3510.method974(new int[] { 22050 });
                            if (var3.field3502 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field3511 < 0) {
                        int var5 = 8192;
                        int var14;
                        if (var3.field3497 != 0) {
                            int var6 = 3 & var3.field3497 >> 24;
                            if (~class321.field4681.field7905 == ~var6) {
                                int var7 = 130560 & var3.field3497 << 9;
                                int var8 = class321.field4681.method422((byte) -123) << 8;
                                int var9 = 255 & var3.field3497 >> 16;
                                int var10 = (var9 << 9) - class321.field4681.field7895 - -var8 + 256;
                                int var11 = (var3.field3497 & 65438) >> 8;
                                int var12 = (var11 << 9) - -256 + var8 - class321.field4681.field7896;
                                int var13 = Math.abs(var10) + Math.abs(var12) + -512;
                                if (var7 < var13) {
                                    var3.field3511 = -99999;
                                    continue;
                                }
                                if (var13 < 0) {
                                    var13 = 0;
                                }
                                var14 = (-var13 + var7) * class335.field4872.field9507 * var3.field3504 / var7 >> 2;
                                if (var3.field3496 != null && var3.field3496 instanceof class293) {
                                    class293 var15 = (class293) var3.field3496;
                                    short var16 = var15.field4300;
                                    short var17 = var15.field4299;
                                }
                                if (var10 != 0 || ~var12 != -1) {
                                    int var18 = -4096 + (-class481.field6886 - (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D)) & 16383;
                                    if (var18 > 8192) {
                                        var18 = -var18 + 16384;
                                    }
                                    int var19;
                                    if (var13 > 0) {
                                        if (~var13 <= -4097) {
                                            var19 = 16384;
                                        } else {
                                            var19 = (-var13 + 8192) / 4096 + 8192;
                                        }
                                    } else {
                                        var19 = 8192;
                                    }
                                    var5 = var18 * var19 / 8192 - -(16384 - var19 >> 1);
                                }
                            } else {
                                var14 = 0;
                            }
                        } else {
                            var14 = (var3.field3495 != 3 ? class335.field4872.field9495 : class335.field4872.field9479) * var3.field3504 >> 2;
                        }
                        if (var14 > 0) {
                            class396 var20 = null;
                            if (var3.field3495 != 1) {
                                if (var3.method1602(128)) {
                                    var20 = var3.field3502;
                                }
                            } else {
                                var20 = var3.field3505.method2761().method2465(class592.field8600);
                            }
                            class93 var21 = var3.field3508 = class93.method537(var20, var3.field3500, var14, var5);
                            var21.method558(var3.field3503 - 1);
                            class556.field8166.method2206(var21);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field3508.method2359(arg0 ^ 1578141261)) {
                var4 = true;
            }
            if (var4) {
                --class380.field5732;
                for (int var22 = var1; class380.field5732 > var22; ++var22) {
                    class141.field2038[var22] = class141.field2038[var22 + 1];
                }
                --var1;
            }
        }
        if (arg0 != 1) {
            field5343 = false;
        }
        ++field5337;
        if (class700.field9845 && !class678.method3812(-30990)) {
            if (class335.field4872.field9471 != 0 && ~class443.field6426 != 0) {
                if (class125.field1829 == null) {
                    class78.method454(0, class443.field6426, class18.field360, -23561, class335.field4872.field9471, false);
                } else {
                    class271.method1620(class335.field4872.field9471, class125.field1829, false, class443.field6426, 0, (byte) -126, class18.field360);
                }
            }
            class700.field9845 = false;
            class125.field1829 = null;
        } else if (class335.field4872.field9471 != 0 && ~class443.field6426 != 0 && !class678.method3812(-30990)) {
            ++class17.field352;
            class654 var2 = class631.method3628(class143.field2068, (byte) -51, class357.field5280);
            var2.field9358.method3146(class443.field6426, -55);
            class444.method2623(arg0 ^ 118, var2);
            class443.field6426 = -1;
        }
    }
}
