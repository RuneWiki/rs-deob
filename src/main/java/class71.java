import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class71 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
    public boolean field983 = true;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public int field987 = 1190717;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
    public boolean field982 = true;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field984 = -1;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
    public boolean field988 = false;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public int field985 = 16;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public int field994 = 8;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public int field995 = 0;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public int field997 = -1;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public int field992 = 128;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public int field1000 = -1;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lhc;")
    public static class368 field986 = new class368("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field996 = -1;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Lhl;")
    public static class60 field993 = new class60();

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIILrg;)V")
    private final void method559(int arg0, int arg1, int arg2, class366 arg3) {
        field990++;
        int var5 = 18 % ((-arg1 - 77) / 46);
        if (arg2 == 1) {
            this.field995 = class251.method1617(arg3.method2263((byte) 10), -121);
        } else if (arg2 == 2) {
            this.field997 = arg3.method2306((byte) 95);
            return;
        } else if (arg2 == 3) {
            this.field997 = arg3.method2297(13352);
            if (this.field997 == 65535) {
                this.field997 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field982 = false;
            return;
        } else if (arg2 == 7) {
            this.field1000 = class251.method1617(arg3.method2263((byte) 10), -118);
            return;
        } else if (arg2 == 8) {
            class392.field5446 = arg0;
            return;
        } else if (arg2 == 9) {
            this.field992 = arg3.method2297(13352);
            return;
        } else if (arg2 == 10) {
            this.field983 = false;
            return;
        } else if (arg2 == 11) {
            this.field994 = arg3.method2306((byte) 23);
            return;
        } else if (arg2 == 12) {
            this.field988 = true;
            return;
        } else if (arg2 == 13) {
            this.field987 = arg3.method2263((byte) 10);
            return;
        } else {
            if (arg2 == 14) {
                this.field985 = arg3.method2306((byte) 67);
            } else if (arg2 == 15) {
                this.field984 = arg3.method2297(13352);
                if (this.field984 == 65535) {
                    this.field984 = -1;
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIILbm;III)Z")
    public static final boolean method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class325 arg8, int arg9, int arg10, int arg11) {
        field999++;
        int var12 = arg9;
        int var13 = arg11;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        class340.field4600[var14][var15] = 99;
        int var17 = arg11 - var15;
        class34.field459[var14][var15] = 0;
        class196.field2841[arg7] = arg9;
        int var19 = 0;
        int var18 = arg7 + 1;
        class215.field3010[arg7] = arg11;
        int[][] var20 = arg8.field4416;
        while (true) {
            label282: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label259: do {
                                if (var18 == var19) {
                                    class389.field5425 = var12;
                                    class214.field3002 = var13;
                                    return false;
                                }
                                var12 = class196.field2841[var19];
                                var13 = class215.field3010[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg8.field4427;
                                var24 = var13 - arg8.field4426;
                                if (arg3 == -4) {
                                    if (arg2 == var12 && arg6 == var13) {
                                        class214.field3002 = var13;
                                        class389.field5425 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -3) {
                                    if (class146.method1051(var13, arg0, arg1, false, arg2, arg5, var12, arg6, arg1)) {
                                        class214.field3002 = var13;
                                        class389.field5425 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -2) {
                                    if (arg8.method1988(var13, var12, arg1, arg5, arg6, 1, arg2, arg1, arg0, arg10)) {
                                        class214.field3002 = var13;
                                        class389.field5425 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -1) {
                                    if (arg8.method1989(arg10, var12, arg6, arg5, arg2, var13, arg7 + 125, arg0, arg1)) {
                                        class389.field5425 = var12;
                                        class214.field3002 = var13;
                                        return true;
                                    }
                                } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                                    if (arg8.method1974(arg6, arg3, arg1, arg4, arg2, var12, var13, arg7)) {
                                        class214.field3002 = var13;
                                        class389.field5425 = var12;
                                        return true;
                                    }
                                } else if (arg8.method1990(arg2, arg1, arg6, arg4, arg7 ^ 0x20, var12, var13, arg3)) {
                                    class214.field3002 = var13;
                                    class389.field5425 = var12;
                                    return true;
                                }
                                var26 = class34.field459[var21][var22] + 1;
                                if (var21 > 0 && class340.field4600[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg1 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg1 - 1)) {
                                            class196.field2841[var18] = var12 - 1;
                                            class215.field3010[var18] = var13;
                                            class340.field4600[var21 - 1][var22] = 2;
                                            var18 = var18 + 1 & 0xFFF;
                                            class34.field459[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg1 && class340.field4600[var21 + 1][var22] == 0 && (var20[arg1 + var23][var24] & 0x60E40000) == 0 && (var20[arg1 + var23][var24 + arg1 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg1 - 1) {
                                            class196.field2841[var18] = var12 + 1;
                                            class215.field3010[var18] = var13;
                                            class340.field4600[var21 + 1][var22] = 8;
                                            var18 = var18 + 1 & 0xFFF;
                                            class34.field459[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg1 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class340.field4600[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg1 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg1 - 1 <= var29) {
                                            class196.field2841[var18] = var12;
                                            class215.field3010[var18] = var13 - 1;
                                            class340.field4600[var21][var22 - 1] = 1;
                                            var18 = var18 + 1 & 0xFFF;
                                            class34.field459[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg1) > var22 && class340.field4600[var21][var22 + 1] == 0 && (var20[var23][arg1 + var24] & 0x4E240000) == 0 && (var20[arg1 + var23 - 1][arg1 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg1 - 1)) {
                                            class196.field2841[var18] = var12;
                                            class215.field3010[var18] = var13 + 1;
                                            class340.field4600[var21][var22 + 1] = 4;
                                            var18 = var18 + 1 & 0xFFF;
                                            class34.field459[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg1 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class340.field4600[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg1 <= var31) {
                                            class196.field2841[var18] = var12 - 1;
                                            class215.field3010[var18] = var13 - 1;
                                            var18 = var18 + 1 & 0xFFF;
                                            class340.field4600[var21 - 1][var22 - 1] = 3;
                                            class34.field459[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg1 > var21 && var22 > 0 && class340.field4600[var21 + 1][var22 - 1] == 0 && (var20[arg1 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg1 <= var32) {
                                            class196.field2841[var18] = var12 + 1;
                                            class215.field3010[var18] = var13 - 1;
                                            class340.field4600[var21 + 1][var22 - 1] = 9;
                                            var18 = var18 + 1 & 0xFFF;
                                            class34.field459[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg1 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg1) && class340.field4600[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg1] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg1; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg1] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class196.field2841[var18] = var12 - 1;
                                    class215.field3010[var18] = var13 + 1;
                                    var18 = var18 + 1 & 0xFFF;
                                    class340.field4600[var21 - 1][var22 + 1] = 6;
                                    class34.field459[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg1));
                        } while ((128 - arg1) <= var22);
                    } while (class340.field4600[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg1 + var23][arg1 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg1; var34++) {
                    if ((var20[var23 + var34][arg1 + var24] & 0x7E240000) != 0 || (var20[arg1 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class196.field2841[var18] = var12 + 1;
                class215.field3010[var18] = var13 + 1;
                class340.field4600[var21 + 1][var22 + 1] = 12;
                var18 = var18 + 1 & 0xFFF;
                class34.field459[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public final void method561(int arg0, int arg1) {
        this.field994 = arg0 | this.field994 << 8;
        field998++;
        if (arg1 < 113) {
            this.field992 = 65;
        }
        if (this.field984 == -1) {
            this.field984 = this.field997;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)Ldf;")
    public static final class82 method562(byte arg0, int arg1) {
        field989++;
        if (arg0 >= -126) {
            method560(100, -8, 40, -40, -61, 83, -81, -44, (class325) null, 40, 24, 77);
        }
        class82 var2 = (class82) class17.field217.method515(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class93.field1301.method1926(0, arg1, 5);
        class82 var4 = new class82();
        if (var3 != null) {
            var4.method659(-1, new class366(var3));
        }
        class17.field217.method519((long) arg1, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method563(int arg0) {
        if (arg0 != -12013) {
            field993 = null;
        }
        field993 = null;
        field986 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBLrg;)V")
    public final void method564(int arg0, byte arg1, class366 arg2) {
        field991++;
        if (arg1 >= -21) {
            method562((byte) 30, 119);
        }
        while (true) {
            int var4 = arg2.method2306((byte) 93);
            if (var4 == 0) {
                return;
            }
            this.method559(arg0, 125, var4, arg2);
        }
    }
}
