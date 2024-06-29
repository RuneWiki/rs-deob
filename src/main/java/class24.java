import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class24 extends class76 {

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "[S")
    private short[] field452 = new short[257];

    @OriginalMember(owner = "client!qj", name = "pb", descriptor = "I")
    private int field469 = 0;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "Lia;")
    public static class257 field456 = class28.method234(-50, "(Udns");

    @OriginalMember(owner = "client!qj", name = "kb", descriptor = "I")
    public static int field464 = 0;

    @OriginalMember(owner = "client!qj", name = "nb", descriptor = "[[B")
    public static byte[][] field467 = new byte[1000][];

    @OriginalMember(owner = "client!qj", name = "sb", descriptor = "Lia;")
    public static class257 field472 = class28.method234(80, "<col=40ff00>");

    @OriginalMember(owner = "client!qj", name = "qb", descriptor = "I")
    public static volatile int field470 = 0;

    @OriginalMember(owner = "client!qj", name = "ub", descriptor = "Lia;")
    public static class257 field474 = class28.method234(89, "Cabbage");

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!qj", name = "ib", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!qj", name = "jb", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!qj", name = "lb", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!qj", name = "ob", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!qj", name = "tb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "[I")
    private int[] field458;

    @OriginalMember(owner = "client!qj", name = "mb", descriptor = "[I")
    private int[] field466;

    @OriginalMember(owner = "client!qj", name = "rb", descriptor = "[[I")
    private int[][] field471;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        ++field454;
        if (this.field471 == null) {
            this.field471 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field471.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field469 == -3) {
                this.method215(46);
            }
            if (arg0 != 111) {
                method219(-91);
            }
            class251.method1645((byte) 110);
            this.method218((byte) -84);
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        if (arg0 != -9351) {
            this.field452 = null;
        }
        ++field459;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1, 0, (byte) -104);
            for (int var5 = 0; var5 < class96.field1807; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field452[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILmb;)V")
    public static final void method210(int arg0, class178 arg1) {
        ++field468;
        if (arg0 == -1) {
            class184.field3203 = arg1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field469 = arg0.method1051((byte) -86);
            this.field471 = new int[arg0.method1051((byte) -128)][2];
            for (int var4 = 0; this.field471.length > var4; ++var4) {
                this.field471[var4][0] = arg0.method1063(-17162);
                this.field471[var4][1] = arg0.method1063(-17162);
            }
        }
        if (arg1 < -86) {
            ++field463;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)Z")
    public static final boolean method211(int arg0, byte arg1) {
        if (arg1 != 8) {
            field470 = 96;
        }
        ++field461;
        return ~(1 & arg0 >> 21) != -1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
    public static final void method212(int arg0, int arg1, int arg2) {
        ++field473;
        class58.field1233[arg1] = arg2;
        class37 var3 = (class37) class75.field1453.method434((byte) -93, (long) arg1);
        if (arg0 < -104) {
            if (var3 == null) {
                class37 var4 = new class37(4611686018427387905L);
                class75.field1453.method424(var4, (byte) -40, (long) arg1);
            } else if (~var3.field731 != -4611686018427387906L) {
                var3.field731 = 4611686018427387904L | class80.method600(-74) + 500L;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lq;IZIBIIIIIZ)V")
    public static final void method213(class238 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        ++field462;
        if (arg2 && !class69.method524((byte) -20) && (class233.field4007[0][arg5][arg6] & 2) == 0) {
            if ((16 & class233.field4007[arg3][arg5][arg6]) != 0) {
                return;
            }
            if (~class182.method1248(arg3, arg6, arg5, -48) != ~class54.field1158) {
                return;
            }
        }
        if (arg3 < class12.field235) {
            class12.field235 = arg3;
        }
        int var11 = 54 / ((17 - arg4) / 55);
        class233 var12 = class5.method96(arg9, false);
        int var13;
        int var14;
        if (~arg1 != -2 && ~arg1 != -4) {
            var13 = var12.field3950;
            var14 = var12.field3986;
        } else {
            var13 = var12.field3986;
            var14 = var12.field3950;
        }
        int var15;
        int var16;
        if (~(arg6 - -var14) < -105) {
            var15 = arg6;
            var16 = arg6 + 1;
        } else {
            var16 = arg6 - -(var14 + 1 >> 1);
            var15 = arg6 - -(var14 >> 1);
        }
        int var17;
        int var18;
        if (~(arg5 + var13) < -105) {
            var17 = arg5;
            var18 = arg5 - -1;
        } else {
            var18 = (var13 + 1 >> 1) + arg5;
            var17 = (var13 >> 1) + arg5;
        }
        int[][] var19 = class243.field4208[arg7];
        int var20 = (arg6 << 7) + (var14 << 6);
        int var21 = var19[var17][var16] + var19[var18][var16] + var19[var17][var15] - -var19[var18][var15] >> 2;
        int var22 = (arg5 << 7) + (var13 << 6);
        int[][] var23 = null;
        long var24 = (long) (arg1 << 20 | arg6 << 7 | arg5 | arg8 << 14 | 1073741824);
        if (!arg10) {
            if (arg7 < 3) {
                var23 = class243.field4208[arg7 + 1];
            }
        } else {
            var23 = class159.field2793[0];
        }
        if (~var12.field4002 == -1 || arg10) {
            var24 |= Long.MIN_VALUE;
        }
        if (var12.field4005 == 1) {
            var24 |= 4194304L;
        }
        if (var12.field3967) {
            var24 |= -2147483648L;
        }
        long var26 = var24 | (long) arg9 << 32;
        if (var12.method1524(-74)) {
            class13.method135((class197) null, arg5, var12, arg3, (class180) null, arg1, 128, arg6);
        }
        boolean var28 = var12.field3961 & !arg10;
        if (~arg8 == -23) {
            if (class133.field2387 || var12.field4002 != 0 || ~var12.field4016 == -2 || var12.field3981) {
                class166 var30;
                if (~var12.field4003 == 0 && var12.field3952 == null) {
                    class187 var29 = var12.method1531(arg2, (class155) null, 22, var28, var22, arg1, 77, var19, var21, var20, var23);
                    var30 = var29.field3242;
                } else {
                    var30 = new class62(arg9, 22, arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class64.method472(arg3, arg5, arg6, var21, var30, var26, var12.field3998);
                if (var12.field4016 == 1 && arg0 != null) {
                    arg0.method1556(arg6, arg5, -1);
                }
            }
        } else if (~arg8 != -11 && ~arg8 != -12) {
            if (arg8 >= 12) {
                class166 var32;
                if (var12.field4003 == -1 && var12.field3952 == null) {
                    class187 var31 = var12.method1531(arg2, (class155) null, arg8, var28, var22, arg1, 120, var19, var21, var20, var23);
                    var32 = var31.field3242;
                } else {
                    var32 = new class62(arg9, arg8, arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class180.method1234(arg3, arg5, arg6, var21, 1, 1, var32, 0, var26);
                if (arg2 && ~arg8 <= -13 && ~arg8 >= -18 && arg8 != 13 && arg3 > 0) {
                    class164.field2869[arg3][arg5][arg6] = class198.method1332(class164.field2869[arg3][arg5][arg6], 2340);
                }
                if (var12.field4016 != 0 && arg0 != null) {
                    arg0.method1558(var14, var13, arg5, (byte) -113, arg6, var12.field4012);
                }
            } else if (~arg8 == -1) {
                class166 var34;
                if (~var12.field4003 == 0 && var12.field3952 == null) {
                    class187 var33 = var12.method1531(arg2, (class155) null, 0, var28, var22, arg1, 101, var19, var21, var20, var23);
                    var34 = var33.field3242;
                } else {
                    var34 = new class62(arg9, 0, arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class243.method1591(arg3, arg5, arg6, var21, var34, (class166) null, class167.field2904[arg1], 0, var26);
                if (arg2) {
                    if (~arg1 != -1) {
                        if (arg1 != 1) {
                            if (~arg1 != -3) {
                                if (~arg1 == -4) {
                                    if (var12.field3951) {
                                        class2.field64[arg3][arg5][arg6] = 50;
                                        class2.field64[arg3][arg5 + 1][arg6] = 50;
                                    }
                                    if (var12.field3983) {
                                        class164.field2869[arg3][arg5][arg6] = class198.method1332(class164.field2869[arg3][arg5][arg6], 1170);
                                    }
                                }
                            } else {
                                if (var12.field3951) {
                                    class2.field64[arg3][arg5 + 1][arg6] = 50;
                                    class2.field64[arg3][arg5 + 1][arg6 + 1] = 50;
                                }
                                if (var12.field3983) {
                                    class164.field2869[arg3][arg5 + 1][arg6] = class198.method1332(class164.field2869[arg3][arg5 + 1][arg6], 585);
                                }
                            }
                        } else {
                            if (var12.field3951) {
                                class2.field64[arg3][arg5][arg6 + 1] = 50;
                                class2.field64[arg3][arg5 - -1][arg6 + 1] = 50;
                            }
                            if (var12.field3983) {
                                class164.field2869[arg3][arg5][arg6 + 1] = class198.method1332(class164.field2869[arg3][arg5][arg6 + 1], 1170);
                            }
                        }
                    } else {
                        if (var12.field3951) {
                            class2.field64[arg3][arg5][arg6] = 50;
                            class2.field64[arg3][arg5][arg6 + 1] = 50;
                        }
                        if (var12.field3983) {
                            class164.field2869[arg3][arg5][arg6] = class198.method1332(class164.field2869[arg3][arg5][arg6], 585);
                        }
                    }
                }
                if (~var12.field4016 != -1 && arg0 != null) {
                    arg0.method1559(var12.field4012, arg5, arg1, 18524, arg8, arg6);
                }
                if (~var12.field3945 != -17) {
                    class139.method952(arg3, arg5, arg6, var12.field3945);
                }
            } else if (~arg8 == -2) {
                class166 var36;
                if (~var12.field4003 == 0 && var12.field3952 == null) {
                    class187 var35 = var12.method1531(arg2, (class155) null, 1, var28, var22, arg1, 52, var19, var21, var20, var23);
                    var36 = var35.field3242;
                } else {
                    var36 = new class62(arg9, 1, arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class243.method1591(arg3, arg5, arg6, var21, var36, (class166) null, class238.field4068[arg1], 0, var26);
                if (var12.field3951 && arg2) {
                    if (arg1 != 0) {
                        if (arg1 != 1) {
                            if (arg1 != 2) {
                                if (~arg1 == -4) {
                                    class2.field64[arg3][arg5][arg6] = 50;
                                }
                            } else {
                                class2.field64[arg3][arg5 + 1][arg6] = 50;
                            }
                        } else {
                            class2.field64[arg3][arg5 + 1][arg6 + 1] = 50;
                        }
                    } else {
                        class2.field64[arg3][arg5][arg6 + 1] = 50;
                    }
                }
                if (var12.field4016 != 0 && arg0 != null) {
                    arg0.method1559(var12.field4012, arg5, arg1, 18524, arg8, arg6);
                }
            } else if (~arg8 == -3) {
                int var37 = 3 & arg1 + 1;
                class166 var39;
                class166 var41;
                if (~var12.field4003 == 0 && var12.field3952 == null) {
                    class187 var38 = var12.method1531(arg2, (class155) null, 2, var28, var22, 4 - -arg1, 75, var19, var21, var20, var23);
                    var39 = var38.field3242;
                    class187 var40 = var12.method1531(arg2, (class155) null, 2, var28, var22, var37, 91, var19, var21, var20, var23);
                    var41 = var40.field3242;
                } else {
                    var39 = new class62(arg9, 2, 4 - -arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                    var41 = new class62(arg9, 2, var37, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class243.method1591(arg3, arg5, arg6, var21, var39, var41, class167.field2904[arg1], class167.field2904[var37], var26);
                if (var12.field3983 && arg2) {
                    if (arg1 == 0) {
                        class164.field2869[arg3][arg5][arg6] = class198.method1332(class164.field2869[arg3][arg5][arg6], 585);
                        class164.field2869[arg3][arg5][arg6 + 1] = class198.method1332(class164.field2869[arg3][arg5][arg6 + 1], 1170);
                    } else if (~arg1 != -2) {
                        if (~arg1 == -3) {
                            class164.field2869[arg3][arg5 - -1][arg6] = class198.method1332(class164.field2869[arg3][arg5 - -1][arg6], 585);
                            class164.field2869[arg3][arg5][arg6] = class198.method1332(class164.field2869[arg3][arg5][arg6], 1170);
                        } else if (~arg1 == -4) {
                            class164.field2869[arg3][arg5][arg6] = class198.method1332(class164.field2869[arg3][arg5][arg6], 1170);
                            class164.field2869[arg3][arg5][arg6] = class198.method1332(class164.field2869[arg3][arg5][arg6], 585);
                        }
                    } else {
                        class164.field2869[arg3][arg5][arg6 + 1] = class198.method1332(class164.field2869[arg3][arg5][arg6 + 1], 1170);
                        class164.field2869[arg3][arg5 - -1][arg6] = class198.method1332(class164.field2869[arg3][arg5 - -1][arg6], 585);
                    }
                }
                if (~var12.field4016 != -1 && arg0 != null) {
                    arg0.method1559(var12.field4012, arg5, arg1, 18524, arg8, arg6);
                }
                if (var12.field3945 != 16) {
                    class139.method952(arg3, arg5, arg6, var12.field3945);
                }
            } else if (~arg8 == -4) {
                class166 var43;
                if (~var12.field4003 == 0 && var12.field3952 == null) {
                    class187 var42 = var12.method1531(arg2, (class155) null, 3, var28, var22, arg1, 79, var19, var21, var20, var23);
                    var43 = var42.field3242;
                } else {
                    var43 = new class62(arg9, 3, arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class243.method1591(arg3, arg5, arg6, var21, var43, (class166) null, class238.field4068[arg1], 0, var26);
                if (var12.field3951 && arg2) {
                    if (~arg1 == -1) {
                        class2.field64[arg3][arg5][arg6 + 1] = 50;
                    } else if (~arg1 == -2) {
                        class2.field64[arg3][arg5 + 1][arg6 + 1] = 50;
                    } else if (~arg1 != -3) {
                        if (~arg1 == -4) {
                            class2.field64[arg3][arg5][arg6] = 50;
                        }
                    } else {
                        class2.field64[arg3][arg5 + 1][arg6] = 50;
                    }
                }
                if (~var12.field4016 != -1 && arg0 != null) {
                    arg0.method1559(var12.field4012, arg5, arg1, 18524, arg8, arg6);
                }
            } else if (arg8 == 9) {
                class166 var45;
                if (var12.field4003 == -1 && var12.field3952 == null) {
                    class187 var44 = var12.method1531(arg2, (class155) null, arg8, var28, var22, arg1, 100, var19, var21, var20, var23);
                    var45 = var44.field3242;
                } else {
                    var45 = new class62(arg9, arg8, arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class180.method1234(arg3, arg5, arg6, var21, 1, 1, var45, 0, var26);
                if (~var12.field4016 != -1 && arg0 != null) {
                    arg0.method1558(var14, var13, arg5, (byte) -111, arg6, var12.field4012);
                }
                if (~var12.field3945 != -17) {
                    class139.method952(arg3, arg5, arg6, var12.field3945);
                }
            } else if (arg8 == 4) {
                class166 var47;
                if (~var12.field4003 == 0 && var12.field3952 == null) {
                    class187 var46 = var12.method1531(arg2, (class155) null, 4, var28, var22, arg1, 72, var19, var21, var20, var23);
                    var47 = var46.field3242;
                } else {
                    var47 = new class62(arg9, 4, arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class145.method980(arg3, arg5, arg6, var21, var47, (class166) null, class167.field2904[arg1], 0, 0, 0, var26);
            } else if (~arg8 == -6) {
                long var48 = class40.method327(arg3, arg5, arg6);
                int var50 = 16;
                if (var48 != 0L) {
                    var50 = class5.method96(Integer.MAX_VALUE & (int) (var48 >>> 32), false).field3945;
                }
                class166 var52;
                if (~var12.field4003 == 0 && var12.field3952 == null) {
                    class187 var51 = var12.method1531(arg2, (class155) null, 4, var28, var22, arg1, 56, var19, var21, var20, var23);
                    var52 = var51.field3242;
                } else {
                    var52 = new class62(arg9, 4, arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class145.method980(arg3, arg5, arg6, var21, var52, (class166) null, class167.field2904[arg1], 0, class186.field3237[arg1] * var50, class146.field2549[arg1] * var50, var26);
            } else if (arg8 == 6) {
                int var53 = 8;
                long var54 = class40.method327(arg3, arg5, arg6);
                if (var54 != 0L) {
                    var53 = class5.method96((int) (var54 >>> 32) & Integer.MAX_VALUE, false).field3945 / 2;
                }
                class166 var57;
                if (var12.field4003 == -1 && var12.field3952 == null) {
                    class187 var56 = var12.method1531(arg2, (class155) null, 4, var28, var22, arg1 + 4, 37, var19, var21, var20, var23);
                    var57 = var56.field3242;
                } else {
                    var57 = new class62(arg9, 4, arg1 + 4, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class145.method980(arg3, arg5, arg6, var21, var57, (class166) null, 256, arg1, class146.field2550[arg1] * var53, class62.field1297[arg1] * var53, var26);
            } else if (arg8 == 7) {
                int var58 = 3 & arg1 + 2;
                class166 var60;
                if (~var12.field4003 == 0 && var12.field3952 == null) {
                    class187 var59 = var12.method1531(arg2, (class155) null, 4, var28, var22, var58 - -4, 120, var19, var21, var20, var23);
                    var60 = var59.field3242;
                } else {
                    var60 = new class62(arg9, 4, var58 - -4, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class145.method980(arg3, arg5, arg6, var21, var60, (class166) null, 256, var58, 0, 0, var26);
            } else if (arg8 == 8) {
                int var61 = 8;
                long var62 = class40.method327(arg3, arg5, arg6);
                if (var62 != 0L) {
                    var61 = class5.method96(Integer.MAX_VALUE & (int) (var62 >>> 32), false).field3945 / 2;
                }
                int var64 = 3 & arg1 + 2;
                class166 var66;
                class166 var68;
                if (var12.field4003 == -1 && var12.field3952 == null) {
                    class187 var65 = var12.method1531(arg2, (class155) null, 4, var28, var22, arg1 + 4, 105, var19, var21, var20, var23);
                    var66 = var65.field3242;
                    class187 var67 = var12.method1531(arg2, (class155) null, 4, var28, var22, var64 + 4, 71, var19, var21, var20, var23);
                    var68 = var67.field3242;
                } else {
                    var66 = new class62(arg9, 4, arg1 + 4, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                    var68 = new class62(arg9, 4, var64 - -4, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
                }
                class145.method980(arg3, arg5, arg6, var21, var66, var68, 256, arg1, class146.field2550[arg1] * var61, class62.field1297[arg1] * var61, var26);
            }
        } else {
            class166 var70;
            if (var12.field4003 == -1 && var12.field3952 == null) {
                class187 var69 = var12.method1531(arg2, (class155) null, 10, var28, var22, ~arg8 != -12 ? arg1 : arg1 + 4, 61, var19, var21, var20, var23);
                var70 = var69.field3242;
            } else {
                var70 = new class62(arg9, 10, arg8 == 11 ? arg1 + 4 : arg1, arg7, arg5, arg6, var12.field4003, var12.field3991, (class166) null);
            }
            if (var70 != null) {
                boolean var71 = class180.method1234(arg3, arg5, arg6, var21, var13, var14, var70, 0, var26);
                if (var12.field3951 && var71 && arg2) {
                    int var72 = 15;
                    if (var70 instanceof class168) {
                        var72 = ((class168) var70).method1144() / 4;
                        if (~var72 < -31) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; ~var13 <= ~var73; ++var73) {
                        for (int var74 = 0; ~var74 >= ~var14; ++var74) {
                            if (var72 > class2.field64[arg3][arg5 - -var73][arg6 + var74]) {
                                class2.field64[arg3][arg5 - -var73][arg6 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var12.field4016 != 0 && arg0 != null) {
                arg0.method1558(var14, var13, arg5, (byte) -126, arg6, var12.field4012);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILk;)V")
    public static final void method214(int arg0, class152 arg1) {
        if (arg0 >= 38) {
            ++field460;
            byte[] var2 = new byte[24];
            if (class103.field1910 != null) {
                try {
                    int var3 = 0;
                    class103.field1910.method895(0, 0L);
                    class103.field1910.method891(111, var2);
                    while (~var3 > -25 && var2[var3] == 0) {
                        ++var3;
                    }
                    if (~var3 <= -25) {
                        throw new IOException();
                    }
                } catch (Exception var5) {
                    for (int var4 = 0; var4 < 24; ++var4) {
                        var2[var4] = -1;
                    }
                }
            }
            arg1.method1032(24, 0, var2, 1848138600);
        }
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "(I)V")
    private final void method215(int arg0) {
        ++field457;
        int[] var2 = this.field471[0];
        int[] var3 = this.field471[1];
        int[] var4 = this.field471[this.field471.length + -2];
        if (arg0 <= 7) {
            method214(45, (class152) null);
        }
        int[] var5 = this.field471[this.field471.length + -1];
        this.field466 = new int[] { var2[0] + var2[0] + -var3[0], var2[1] + var2[1] + -var3[1] };
        this.field458 = new int[] { -var5[0] - (-var4[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BI)V")
    public static final void method216(byte[] arg0, int arg1) {
        int var2 = class46.field1052 >> 2 << 10;
        int var3 = class233.field3953 >> 1;
        ++field453;
        byte[][] var4 = new byte[class252.field4337][class181.field3149];
        int var5 = 0;
        while (true) {
            while (~arg0.length < ~var5) {
                int var34 = -class182.field3159 + (255 & arg0[var5++]) * 64;
                int var35 = -class8.field174 + 64 * (arg0[var5++] & 255);
                if (var34 > 0 && ~var35 < -1 && ~class252.field4337 < ~(var34 + 64) && ~class181.field3149 < ~(var35 + 64)) {
                    for (int var36 = 0; ~var36 > -65; ++var36) {
                        byte[] var37 = var4[var34 + var36];
                        int var38 = class181.field3149 + -1 + -var35;
                        for (int var39 = -64; ~var39 > -1; ++var39) {
                            var37[var38--] = arg0[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            int var6 = class181.field3149;
            int var7 = class252.field4337;
            int[] var8 = new int[var6];
            if (arg1 != 26680) {
                method211(87, (byte) 42);
            }
            int[] var9 = new int[var6];
            int[] var10 = new int[var6];
            int[] var11 = new int[var6];
            int[] var12 = new int[var6];
            for (int var13 = -5; ~var13 > ~var7; ++var13) {
                for (int var14 = 0; ~var14 > ~var6; ++var14) {
                    int var28 = var13 - -5;
                    int var10002;
                    if (~var28 > ~var7) {
                        int var29 = 255 & var4[var28][var14];
                        if (~var29 < -1) {
                            class16 var30 = class132.method919(var29 + -1, 1);
                            var8[var14] += var30.field345;
                            var10[var14] += var30.field353;
                            var9[var14] += var30.field359;
                            var11[var14] += var30.field355;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 + -5;
                    if (var31 >= 0) {
                        int var32 = var4[var31][var14] & 255;
                        if (var32 > 0) {
                            class16 var33 = class132.method919(var32 + -1, arg1 + -26679);
                            var8[var14] -= var33.field345;
                            var10[var14] -= var33.field353;
                            var9[var14] -= var33.field359;
                            var11[var14] -= var33.field355;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (~var13 <= -1) {
                    int[][] var15 = class244.field4234[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; ~var6 < ~var21; ++var21) {
                        int var22 = var21 + 5;
                        if (var22 < var6) {
                            var20 += var10[var22];
                            var17 += var8[var22];
                            var18 += var12[var22];
                            var16 += var11[var22];
                            var19 += var9[var22];
                        }
                        int var23 = var21 + -5;
                        if (var23 >= 0) {
                            var19 -= var9[var23];
                            var17 -= var8[var23];
                            var16 -= var11[var23];
                            var20 -= var10[var23];
                            var18 -= var12[var23];
                        }
                        if (var21 >= 0 && var18 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var16 != 0 ? class242.method1588(var20 / var18, -180, var17 * 256 / var16, var19 / var18) : 0;
                            if (~var4[var13][var21] != -1) {
                                if (var15[var24] == null) {
                                    var15[var24] = class244.field4234[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (127 & var25) + var3;
                                if (~var26 > -1) {
                                    var26 = 0;
                                } else if (~var26 < -128) {
                                    var26 = 127;
                                }
                                int var27 = (var2 + var25 & 64512) + (var25 & 896) + var26;
                                var15[var24][class30.method252(var13, 63) + class30.method252(var21 << 6, 4032)] = class101.field1873[class116.method829((byte) -120, var27, 96)];
                            } else if (var15[var24] != null) {
                                var15[var24][class30.method252(63, var13) + class30.method252(4032, var21 << 6)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(IB)[I")
    private final int[] method217(int arg0, byte arg1) {
        if (arg1 != 82) {
            this.method215(-12);
        }
        ++field455;
        if (arg0 < 0) {
            return this.field466;
        } else {
            return arg0 >= this.field471.length ? this.field458 : this.field471[arg0];
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
    private final void method218(byte arg0) {
        int var2 = this.field469;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field471.length + -1 && var4 >= this.field471[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field471[var5 - 1];
                    int[] var7 = this.field471[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class106.field1962[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field452[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field471.length + -1 > var14 && ~var13 <= ~this.field471[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field471[var14];
                    int[] var16 = this.field471[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field452[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field471.length + -1 && ~this.field471[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field471[var22];
                int[] var24 = this.field471[var22 + -1];
                int var25 = this.method217(var22 + -2, (byte) 82)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method217(var22 - -1, (byte) 82)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var31 = var28 - (-var26 + var27) + -var25;
                int var32 = -var25 + var27;
                int var33 = var29 * var32 >> 12;
                int var34 = -var26 + var25 - var31;
                int var35 = var29 * var29 >> 12;
                int var36 = (var29 * var31 >> 12) * var35 >> 12;
                int var37 = var34 * var35 >> 12;
                int var38 = var36 - -var33 + var26 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field452[var20] = (short) var38;
            }
        }
        ++field465;
        if (arg0 >= -28) {
            field456 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "(I)V")
    public static void method219(int arg0) {
        field467 = null;
        field474 = null;
        field472 = null;
        int var1 = 12 / ((56 - arg0) / 42);
        field456 = null;
    }
}
