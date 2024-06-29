import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class364 extends class156 {

    @OriginalMember(owner = "client!md", name = "Mb", descriptor = "Ldc;")
    public static class5 field5470 = new class5(64);

    @OriginalMember(owner = "client!md", name = "Vb", descriptor = "I")
    public static int field5479 = 0;

    @OriginalMember(owner = "client!md", name = "Gb", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!md", name = "Hb", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!md", name = "Ib", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!md", name = "Jb", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!md", name = "Kb", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!md", name = "Lb", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!md", name = "Nb", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!md", name = "Ob", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!md", name = "Pb", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!md", name = "Qb", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!md", name = "Rb", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!md", name = "Sb", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!md", name = "Tb", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!md", name = "Ub", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!md", name = "Xb", descriptor = "I")
    private int field5481;

    @OriginalMember(owner = "client!md", name = "Yb", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!md", name = "Wb", descriptor = "Ljv;")
    private class52 field5480;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "(B)V")
    public final void method2217(byte arg0) {
        int var2 = -45 / ((50 - arg0) / 61);
        ++field5469;
        this.field5481 = super.field2018 * 8;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(Z)V")
    public static void method2218(boolean arg0) {
        if (!arg0) {
            method2224(-94, -18, -21);
        }
        field5470 = null;
    }

    @OriginalMember(owner = "client!md", name = "v", descriptor = "(I)Z")
    public final boolean method2219(int arg0) {
        ++field5471;
        int var2 = arg0 & super.field2041[super.field2018] + -this.field5480.method386((byte) -115);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BII)V")
    public final void method2220(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field5482;
        for (int var5 = arg0; var5 < arg3; ++var5) {
            arg1[arg2 + var5] = (byte) (super.field2041[super.field2018++] + -this.field5480.method388(82));
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[I)V")
    public final void method2221(int arg0, int[] arg1) {
        this.field5480 = new class52(arg1);
        if (arg0 != 28492) {
            this.field5481 = -106;
        }
        ++field5464;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
    public class364(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!md", name = "n", descriptor = "(B)I")
    public final int method2222(byte arg0) {
        ++field5473;
        int var2 = 255 & super.field2041[super.field2018++] - this.field5480.method388(82);
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 <= 63) {
                this.method2220(125, (byte[]) null, -77, -29);
            }
            return (255 & super.field2041[super.field2018++] + -this.field5480.method388(82)) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(IB)I")
    public final int method2223(int arg0, byte arg1) {
        if (arg1 <= 42) {
            return -120;
        } else {
            ++field5465;
            return arg0 * 8 + -this.field5481;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V")
    public static final void method2224(int arg0, int arg1, int arg2) {
        if (arg2 == 32766) {
            ++field5467;
            if (class28.field486 == class156.field1996) {
                if (!class230.method1404(false, true, arg0, 0, arg1, 1, 0, 1, -2)) {
                    class230.method1404(false, true, arg0, 0, arg1, 1, 0, 1, -3);
                }
            } else if (!class230.method1404(false, true, arg0, 0, arg1, 1, 0, 1, -3)) {
                class230.method1404(false, true, arg0, 0, arg1, 1, 0, 1, -2);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lqo;IIIIIIIIII)Z")
    public static final boolean method2225(class19 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field5474;
        int var11 = arg7;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        int var16 = arg9 - var14;
        int var17 = -110 / ((-56 - arg10) / 32);
        class409.field6004[var13][var14] = 99;
        class379.field5659[var13][var14] = 0;
        byte var18 = 0;
        class501.field7658[var18] = arg7;
        int var19 = 0;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class71.field1051[var10001] = arg9;
        int[][] var20 = arg0.field275;
        while (~var27 != ~var19) {
            var11 = class501.field7658[var19];
            var12 = class71.field1051[var19];
            int var21 = var11 - var15;
            int var22 = var11 - arg0.field259;
            int var23 = -var16 + var12;
            var19 = var19 - -1 & 4095;
            int var24 = -arg0.field258 + var12;
            if (arg5 != -4) {
                if (~arg5 != 2) {
                    if (arg5 != -2) {
                        if (~arg5 != 0) {
                            if (~arg5 != -1 && arg5 != 1 && ~arg5 != -3 && ~arg5 != -4 && arg5 != 9) {
                                if (arg0.method137((byte) -105, arg5, 1, arg4, arg3, arg1, var12, var11)) {
                                    class505.field7711 = var11;
                                    class488.field7462 = var12;
                                    return true;
                                }
                            } else if (arg0.method129(var11, arg3, 1, arg5, arg4, arg1, var12, (byte) -66)) {
                                class488.field7462 = var12;
                                class505.field7711 = var11;
                                return true;
                            }
                        } else if (arg0.method128(1, arg4, arg8, arg1, var12, arg2, arg6, (byte) -69, var11)) {
                            class488.field7462 = var12;
                            class505.field7711 = var11;
                            return true;
                        }
                    } else if (arg0.method136(true, var11, arg8, arg2, 1, arg6, var12, arg4, arg1, 1)) {
                        class505.field7711 = var11;
                        class488.field7462 = var12;
                        return true;
                    }
                } else if (class222.method1373(arg8, arg1, arg4, var12, 0, 1, var11, arg2, 1)) {
                    class505.field7711 = var11;
                    class488.field7462 = var12;
                    return true;
                }
            } else if (arg4 == var11 && ~arg1 == ~var12) {
                class505.field7711 = var11;
                class488.field7462 = var12;
                return true;
            }
            int var26 = class379.field5659[var21][var23] + 1;
            if (var21 > 0 && ~class409.field6004[var21 + -1][var23] == -1 && (1109655552 & var20[var22 - 1][var24]) == 0) {
                class501.field7658[var27] = var11 + -1;
                class71.field1051[var27] = var12;
                class409.field6004[var21 - 1][var23] = 2;
                var27 = 4095 & var27 + 1;
                class379.field5659[var21 + -1][var23] = var26;
            }
            if (var21 < 127 && ~class409.field6004[var21 + 1][var23] == -1 && (1612972032 & var20[var22 + 1][var24]) == 0) {
                class501.field7658[var27] = var11 + 1;
                class71.field1051[var27] = var12;
                var27 = var27 + 1 & 4095;
                class409.field6004[var21 + 1][var23] = 8;
                class379.field5659[var21 + 1][var23] = var26;
            }
            if (var23 > 0 && ~class409.field6004[var21][var23 - 1] == -1 && (1084489728 & var20[var22][var24 - 1]) == 0) {
                class501.field7658[var27] = var11;
                class71.field1051[var27] = var12 + -1;
                class409.field6004[var21][var23 + -1] = 1;
                var27 = 4095 & var27 - -1;
                class379.field5659[var21][var23 + -1] = var26;
            }
            if (var23 < 127 && class409.field6004[var21][var23 + 1] == 0 && (1210318848 & var20[var22][var24 - -1]) == 0) {
                class501.field7658[var27] = var11;
                class71.field1051[var27] = var12 - -1;
                class409.field6004[var21][var23 - -1] = 4;
                var27 = var27 + 1 & 4095;
                class379.field5659[var21][var23 + 1] = var26;
            }
            if (var21 > 0 && var23 > 0 && ~class409.field6004[var21 - 1][var23 + -1] == -1 && ~(1134821376 & var20[var22 - 1][var24 - 1]) == -1 && ~(1109655552 & var20[var22 - 1][var24]) == -1 && ~(var20[var22][var24 + -1] & 1084489728) == -1) {
                class501.field7658[var27] = var11 - 1;
                class71.field1051[var27] = var12 + -1;
                var27 = 4095 & var27 + 1;
                class409.field6004[var21 + -1][var23 + -1] = 3;
                class379.field5659[var21 + -1][var23 - 1] = var26;
            }
            if (~var21 > -128 && var23 > 0 && class409.field6004[var21 + 1][var23 + -1] == 0 && ~(1625554944 & var20[var22 + 1][var24 - 1]) == -1 && ~(var20[var22 + 1][var24] & 1612972032) == -1 && ~(var20[var22][var24 + -1] & 1084489728) == -1) {
                class501.field7658[var27] = var11 - -1;
                class71.field1051[var27] = var12 - 1;
                var27 = var27 + 1 & 4095;
                class409.field6004[var21 + 1][var23 - 1] = 9;
                class379.field5659[var21 + 1][var23 + -1] = var26;
            }
            if (~var21 < -1 && var23 < 127 && ~class409.field6004[var21 - 1][var23 + 1] == -1 && (1310982144 & var20[var22 + -1][var24 + 1]) == 0 && (1109655552 & var20[var22 + -1][var24]) == 0 && ~(1210318848 & var20[var22][var24 + 1]) == -1) {
                class501.field7658[var27] = var11 - 1;
                class71.field1051[var27] = var12 + 1;
                class409.field6004[var21 + -1][var23 + 1] = 6;
                var27 = var27 + 1 & 4095;
                class379.field5659[var21 - 1][var23 - -1] = var26;
            }
            if (var21 < 127 && ~var23 > -128 && ~class409.field6004[var21 + 1][var23 + 1] == -1 && (var20[var22 + 1][var24 - -1] & 2015625216) == 0 && (var20[var22 + 1][var24] & 1612972032) == 0 && ~(var20[var22][var24 + 1] & 1210318848) == -1) {
                class501.field7658[var27] = var11 + 1;
                class71.field1051[var27] = var12 + 1;
                var27 = 4095 & var27 + 1;
                class409.field6004[var21 - -1][var23 + 1] = 12;
                class379.field5659[var21 + 1][var23 + 1] = var26;
            }
        }
        class505.field7711 = var11;
        class488.field7462 = var12;
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method2226(byte arg0, String arg1) {
        ++field5468;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg0 >= -84) {
            return null;
        } else {
            while (~var4 > ~var2) {
                char var5 = arg1.charAt(var4);
                if (var5 > 0 && ~var5 > -129 || var5 >= 160 && var5 <= 255) {
                    var3[var4] = (byte) var5;
                } else if (var5 == 8364) {
                    var3[var4] = -128;
                } else if (var5 != 8218) {
                    if (~var5 != -403) {
                        if (var5 != 8222) {
                            if (var5 == 8230) {
                                var3[var4] = -123;
                            } else if (var5 != 8224) {
                                if (~var5 == -8226) {
                                    var3[var4] = -121;
                                } else if (~var5 == -711) {
                                    var3[var4] = -120;
                                } else if (~var5 == -8241) {
                                    var3[var4] = -119;
                                } else if (var5 == 352) {
                                    var3[var4] = -118;
                                } else if (var5 != 8249) {
                                    if (~var5 != -339) {
                                        if (~var5 != -382) {
                                            if (~var5 != -8217) {
                                                if (var5 == 8217) {
                                                    var3[var4] = -110;
                                                } else if (~var5 == -8221) {
                                                    var3[var4] = -109;
                                                } else if (var5 != 8221) {
                                                    if (~var5 == -8227) {
                                                        var3[var4] = -107;
                                                    } else if (~var5 == -8212) {
                                                        var3[var4] = -106;
                                                    } else if (var5 == 8212) {
                                                        var3[var4] = -105;
                                                    } else if (~var5 == -733) {
                                                        var3[var4] = -104;
                                                    } else if (~var5 != -8483) {
                                                        if (~var5 == -354) {
                                                            var3[var4] = -102;
                                                        } else if (~var5 != -8251) {
                                                            if (~var5 == -340) {
                                                                var3[var4] = -100;
                                                            } else if (~var5 != -383) {
                                                                if (~var5 != -377) {
                                                                    var3[var4] = 63;
                                                                } else {
                                                                    var3[var4] = -97;
                                                                }
                                                            } else {
                                                                var3[var4] = -98;
                                                            }
                                                        } else {
                                                            var3[var4] = -101;
                                                        }
                                                    } else {
                                                        var3[var4] = -103;
                                                    }
                                                } else {
                                                    var3[var4] = -108;
                                                }
                                            } else {
                                                var3[var4] = -111;
                                            }
                                        } else {
                                            var3[var4] = -114;
                                        }
                                    } else {
                                        var3[var4] = -116;
                                    }
                                } else {
                                    var3[var4] = -117;
                                }
                            } else {
                                var3[var4] = -122;
                            }
                        } else {
                            var3[var4] = -124;
                        }
                    } else {
                        var3[var4] = -125;
                    }
                } else {
                    var3[var4] = -126;
                }
                ++var4;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!md", name = "w", descriptor = "(I)V")
    public final void method2227(int arg0) {
        ++field5472;
        super.field2018 = (this.field5481 - -7) / arg0;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(III)V")
    public static final void method2228(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field6772 != null) {
                var3.field6772 = null;
            }
            if (var3.field6777 != null) {
                var3.field6777 = null;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "o", descriptor = "(II)I")
    public final int method2229(int arg0, int arg1) {
        ++field5478;
        int var3 = this.field5481 >> 3;
        if (arg1 != -1) {
            return 120;
        } else {
            int var4 = 8 - (7 & this.field5481);
            int var5 = 0;
            this.field5481 += arg0;
            while (~arg0 < ~var4) {
                var5 += (super.field2041[var3++] & class296.field4324[var4]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg0 != var4) {
                var6 = (super.field2041[var3] >> -arg0 + var4 & class296.field4324[arg0]) + var5;
            } else {
                var6 = (super.field2041[var3] & class296.field4324[var4]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IZ)V")
    public final void method2230(int arg0, boolean arg1) {
        if (!arg1) {
            super.field2041[super.field2018++] = (byte) (arg0 + this.field5480.method388(82));
            ++field5466;
        }
    }
}
