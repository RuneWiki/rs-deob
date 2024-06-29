import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class169 extends class424 {

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    private int field2395 = 0;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    private int field2398 = 0;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
    private int field2400 = 0;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "Lhc;")
    public static class368 field2386 = new class368("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!th", name = "S", descriptor = "Ljm;")
    public static class162 field2392 = new class162();

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    private int field2390;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    private int field2394;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    private int field2401;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
    private int field2402;

    @OriginalMember(owner = "client!th", name = "db", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    private int field2404;

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V")
    public static final void method1204(byte arg0) {
        class111.field1711 = -1;
        ++field2403;
        class435.field6148 = null;
        int var1 = 121 / ((arg0 - 8) / 56);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field2389;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[][] var4 = this.method2624(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class303.field4135; ++var11) {
                this.method1211(var5[var11], var7[var11], var6[var11], -127);
                this.field2390 += this.field2398;
                this.field2387 += this.field2400;
                for (this.field2401 += this.field2395; this.field2401 < 0; this.field2401 += 4096) {
                }
                while (~this.field2401 < -4097) {
                    this.field2401 -= 4096;
                }
                if (this.field2387 < 0) {
                    this.field2387 = 0;
                }
                if (~this.field2390 > -1) {
                    this.field2390 = 0;
                }
                if (this.field2387 > 4096) {
                    this.field2387 = 4096;
                }
                if (~this.field2390 < -4097) {
                    this.field2390 = 4096;
                }
                this.method1210(this.field2390, this.field2401, false, this.field2387);
                var8[var11] = this.field2394;
                var9[var11] = this.field2404;
                var10[var11] = this.field2402;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLrg;)V")
    public static final void method1205(byte arg0, class366 arg1) {
        ++field2388;
        if (arg1.field5076.length + -arg1.field5048 >= 1) {
            int var2 = arg1.method2306((byte) 75);
            if (var2 >= 0 && var2 <= 15) {
                byte var3;
                if (~var2 == -16) {
                    var3 = 37;
                } else if (var2 != 14) {
                    if (var2 == 13) {
                        var3 = 35;
                    } else if (~var2 != -13) {
                        if (var2 != 11) {
                            if (~var2 != -11) {
                                if (var2 == 9) {
                                    var3 = 31;
                                } else if (~var2 == -9) {
                                    var3 = 30;
                                } else if (var2 != 7) {
                                    if (~var2 == -7) {
                                        var3 = 28;
                                    } else if (var2 == 5) {
                                        var3 = 28;
                                    } else if (~var2 == -5) {
                                        var3 = 24;
                                    } else if (~var2 == -4) {
                                        var3 = 23;
                                    } else if (var2 != 2) {
                                        if (var2 != 1) {
                                            var3 = 19;
                                        } else {
                                            var3 = 23;
                                        }
                                    } else {
                                        var3 = 22;
                                    }
                                } else {
                                    var3 = 29;
                                }
                            } else {
                                var3 = 32;
                            }
                        } else {
                            var3 = 33;
                        }
                    } else {
                        var3 = 34;
                    }
                } else {
                    var3 = 36;
                }
                if (~(arg1.field5076.length + -arg1.field5048) <= ~var3) {
                    if (arg0 <= -49) {
                        class359.field4957 = arg1.method2306((byte) 100);
                        if (class359.field4957 >= 1) {
                            if (class359.field4957 > 4) {
                                class359.field4957 = 4;
                            }
                        } else {
                            class359.field4957 = 1;
                        }
                        class75.method580(arg1.method2306((byte) 109) == 1, 1);
                        class230.field3237 = ~arg1.method2306((byte) 72) == -2;
                        class441.field6201 = arg1.method2306((byte) 59) == 1;
                        class215.field3009 = ~arg1.method2306((byte) 126) == -2;
                        class316.field4264 = arg1.method2306((byte) 51) != 1 ? 0 : 1;
                        class341.field4607 = arg1.method2306((byte) 92) == 1;
                        class107.field1521 = ~arg1.method2306((byte) 67) == -2;
                        class404.field5593 = arg1.method2306((byte) 57) == 1;
                        class228.field3188 = arg1.method2306((byte) 60);
                        if (~class228.field3188 < -3) {
                            class228.field3188 = 2;
                        }
                        if (~var2 > -3) {
                            class428.field5958 = arg1.method2306((byte) 77) == 1;
                            arg1.method2306((byte) 70);
                        } else {
                            class428.field5958 = ~arg1.method2306((byte) 37) == -2;
                        }
                        class152.field2192 = arg1.method2306((byte) 123) == 1;
                        class160.field2272 = ~arg1.method2306((byte) 60) == -2;
                        class98.field1360 = arg1.method2306((byte) 78);
                        if (~class98.field1360 < -3) {
                            class98.field1360 = 2;
                        }
                        class353.field4745 = class98.field1360;
                        class119.field1814 = arg1.method2306((byte) 35) == 1;
                        class231.field3253 = arg1.method2306((byte) 46);
                        if (class231.field3253 > 127) {
                            class231.field3253 = 127;
                        }
                        class1.field2 = arg1.method2306((byte) 84);
                        class336.field4540 = arg1.method2306((byte) 31);
                        if (~class336.field4540 < -128) {
                            class336.field4540 = 127;
                        }
                        if (~var2 <= -2) {
                            class258.field3585 = arg1.method2297(13352);
                            class361.field4985 = arg1.method2297(13352);
                        }
                        if (var2 >= 3 && var2 < 6) {
                            arg1.method2306((byte) 98);
                        }
                        if (var2 >= 4) {
                            int var4 = arg1.method2306((byte) 75);
                            if (~var4 > -1 || var4 > 2) {
                                var4 = 0;
                            }
                            if (~class409.field5703 > -97) {
                                var4 = 0;
                            }
                            class432.method2668(59, var4);
                        }
                        if (var2 >= 5) {
                            class50.field638 = arg1.method2258(1177515464);
                        }
                        int var5 = 0;
                        if (~var2 <= -7) {
                            class211.field2956 = var5 = arg1.method2306((byte) 28);
                        }
                        if (class211.field2956 != 1 && class211.field2956 != 2) {
                            class211.field2956 = 2;
                        }
                        if (var2 >= 7) {
                            class30.field416 = arg1.method2306((byte) 34) == 1;
                        }
                        if (var2 >= 8) {
                            class229.field3214 = arg1.method2306((byte) 100) == 1;
                        }
                        if (~var2 <= -10) {
                            class294.field3962 = arg1.method2306((byte) 65);
                        }
                        if (class294.field3962 < 0 || class294.field3962 > class436.method2682(5, class409.field5703)) {
                            class294.field3962 = 0;
                        }
                        if (var2 >= 10) {
                            class415.field5752 = ~arg1.method2306((byte) 83) != -1;
                        }
                        if (~var2 <= -12) {
                            class314.field4262 = arg1.method2306((byte) 49) != 0;
                        }
                        if (~var2 <= -13) {
                            class316.field4264 = arg1.method2306((byte) 109);
                        }
                        if (~class316.field4264 > -1 || ~class316.field4264 < -3) {
                            class316.field4264 = 1;
                        }
                        if (var2 >= 13) {
                            class319.field4357 = ~arg1.method2306((byte) 43) == -2;
                        }
                        if (~var2 <= -15) {
                            class344.field4647 = arg1.method2306((byte) 32);
                        } else if (var5 == 0) {
                            class344.field4647 = 2;
                        } else {
                            class344.field4647 = 1;
                        }
                        if (~class344.field4647 > -1 || class344.field4647 > 3) {
                            class344.field4647 = 2;
                        }
                        if (var2 >= 15) {
                            class236.field3363 = arg1.method2306((byte) 83);
                            if (class236.field3363 < 0 || ~class236.field3363 < -5) {
                                class236.field3363 = ~class54.field686 == -2 ? 2 : 4;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;Lne;ZZZ)V")
    public static final void method1206(String arg0, class76 arg1, boolean arg2, boolean arg3, boolean arg4) {
        ++field2393;
        if (arg4) {
            if (!arg3) {
                class417.method2575(3, arg1, arg0, (byte) -89);
            } else {
                if (class76.field1083.startsWith("win") && class76.field1085 != 3) {
                    String var5 = null;
                    if (arg1.field1086 != null) {
                        var5 = arg1.field1086.getParameter("haveie6");
                    }
                    if (var5 == null || !var5.equals("1")) {
                        class285 var6 = class417.method2575(0, arg1, arg0, (byte) -69);
                        class211.field2946 = var6;
                        class100.field1390 = arg0;
                        class143.field2086 = arg1;
                        return;
                    }
                }
                if (class76.field1083.startsWith("mac")) {
                    String var7 = null;
                    if (arg1.field1086 != null) {
                        var7 = arg1.field1086.getParameter("havefirefox");
                    }
                    if (var7 != null && var7.equals("1") && arg2) {
                        class417.method2575(1, arg1, arg0, (byte) -128);
                        return;
                    }
                }
                class417.method2575(2, arg1, arg0, (byte) -96);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static final void method1207(int arg0) {
        if (class187.field2704 && class146.field2122.method1474(-20986, 81) && ~class149.field2171 < -3) {
            class276.method1744(0, (class429) class451.field6491.field2296.field4225.field4225);
        } else {
            class276.method1744(0, (class429) class451.field6491.field2296.field4225);
        }
        if (arg0 >= -9) {
            method1208(-35);
        }
        ++field2399;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field2396;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2398 = (arg0.method2289((byte) -77) << 12) / 100;
                }
            } else {
                this.field2400 = (arg0.method2289((byte) -77) << 12) / 100;
            }
        } else {
            this.field2395 = arg0.method2257((byte) 110);
        }
        if (arg1 != -48) {
            this.field2401 = -81;
        }
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V")
    public static void method1208(int arg0) {
        field2386 = null;
        if (arg0 != 2) {
            field2405 = 116;
        }
        field2392 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZB)I")
    public static final int method1209(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field2397;
        class57 var4 = class2.method5(arg2, arg0, true);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && ~var4.field739.length < ~arg1) {
            if (arg3 != -113) {
                field2405 = -128;
            }
            return var4.field739[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZI)V")
    private final void method1210(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field2400 = -5;
        }
        ++field2391;
        int var5 = ~arg0 >= -2049 ? (4096 - -arg3) * arg0 >> 12 : arg0 + arg3 - (arg0 * arg3 >> 12);
        if (~var5 >= -1) {
            this.field2394 = this.field2404 = this.field2402 = arg0;
        } else {
            int var6 = arg1 * 6;
            int var7 = -var5 + arg0 + arg0;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field2404 = var7;
                                    this.field2402 = var15;
                                    this.field2394 = var5;
                                }
                            } else {
                                this.field2402 = var5;
                                this.field2394 = var14;
                                this.field2404 = var7;
                            }
                        } else {
                            this.field2402 = var5;
                            this.field2394 = var7;
                            this.field2404 = var15;
                        }
                    } else {
                        this.field2402 = var14;
                        this.field2394 = var7;
                        this.field2404 = var5;
                    }
                } else {
                    this.field2402 = var7;
                    this.field2394 = var15;
                    this.field2404 = var5;
                }
            } else {
                this.field2394 = var5;
                this.field2402 = var7;
                this.field2404 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)V")
    private final void method1211(int arg0, int arg1, int arg2, int arg3) {
        ++field2385;
        int var5 = ~arg2 > ~arg0 ? arg0 : arg2;
        int var6 = arg2 <= arg0 ? arg2 : arg0;
        int var7 = arg1 > var5 ? arg1 : var5;
        int var8 = ~arg1 > ~var6 ? arg1 : var6;
        int var9 = -var8 + var7;
        this.field2390 = (var8 - -var7) / 2;
        if (var9 > 0) {
            int var10 = (-arg0 + var7 << 12) / var9;
            int var11 = (-arg2 + var7 << 12) / var9;
            int var12 = (var7 - arg1 << 12) / var9;
            if (~arg0 == ~var7) {
                this.field2401 = arg2 == var8 ? 20480 - -var12 : -var11 + 4096;
            } else if (~arg2 != ~var7) {
                this.field2401 = arg0 == var8 ? var11 + 12288 : 20480 - var10;
            } else {
                this.field2401 = ~arg1 == ~var8 ? 4096 - -var10 : -var12 + 12288;
            }
            this.field2401 /= 6;
        } else {
            this.field2401 = 0;
        }
        if (arg3 >= -10) {
            method1204((byte) 90);
        }
        if (this.field2390 > 0 && this.field2390 < 4096) {
            this.field2387 = (var9 << 12) / (~this.field2390 >= -2049 ? this.field2390 * 2 : -(this.field2390 * 2) + 8192);
        } else {
            this.field2387 = 0;
        }
    }
}
